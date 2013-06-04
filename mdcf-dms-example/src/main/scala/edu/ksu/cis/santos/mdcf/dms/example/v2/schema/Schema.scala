/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.example.v2.schema

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.example.v2._

trait Range extends Feature {
  @Const
  val min : Number

  @Const
  val max : Number
}

object Range {
  @Inv
  val `min is less than or equal to max` : Predicate[Range] =
    pred { r : Range =>
      r.min <= r.max
    }
}

trait IntRange extends Range {
  override val min : Int
  override val max : Int
}

trait NatRange extends Range {
  override val min : Nat
  override val max : Nat
}

trait FloatRange extends Range {
  override val min : Float
  override val max : Float
}

//=======================================================================================================
//  B a s i c    D a t a    T y p e s 
//
//  Elements analogous to those declared in 11073 PHD Section 7.1.2 would be declared as data components
//  and compiled (in a fairly direct manner) to IDL definitions.
//
//  Some examples from 11073 Section 7.1.2 are given below.
//=======================================================================================================

// 11073 -- 7.1.2.13 Absolute time data type  (p. 41)
@Data
trait IEEE11073_AbsoluteTime extends Feature {
  val century :        IEEE11073_INT_U8 
  val year :           IEEE11073_INT_U8 
  val month :          IEEE11073_INT_U8 
  val day :            IEEE11073_INT_U8 
  val mon :            IEEE11073_INT_U8 
  val minute :         IEEE11073_INT_U8 
  val second :         IEEE11073_INT_U8 
  val sec_franctions : IEEE11073_INT_U8 
}

// 11073 -- 7.1.2.14 Date data type  (p. 41)
@Data
trait IEEE11073_Date extends Feature {
  val century :        IEEE11073_INT_U8 
  val year :           IEEE11073_INT_U8 
  val month :          IEEE11073_INT_U8 
  val day :            IEEE11073_INT_U8 
}

//=======================================================================================================
//  I C E   A c c e s s   C o n t r o l  /  S e c u r i t y   
//=======================================================================================================

// stub out these concepts
// TODO: Work with Eugene to finalize these.
//
// Note that these are not just marking "read" and "write" capabilities.  The idea is that these structures
// would be expanded to include whatever information is needed to specify role-based access control for each
// access type.

trait ICE_Security_Access extends Feature {}
trait ICE_Security_Access_Read extends ICE_Security_Access {}
trait ICE_Security_Access_Write extends ICE_Security_Access {}
trait ICE_Security_Access_Read_Write extends ICE_Security_Access {} // TODO: Refactor?
trait ICE_Security_Access_Action extends ICE_Security_Access {}

//=======================================================================================================
//  I C E   S e c u r i t y   C e r t i f i c a t e s   
//=======================================================================================================

// stub out these concepts
// TODO: Work with Eugene to finalize these.

trait ICE_Security_Certificate extends Feature {}

//=======================================================================================================
//  I C E    D a t a    E x c h a n g e    P a t t e r n s ===
//=======================================================================================================
//


trait ICE_Data_Exchange extends Feature {
}

// Provider initiated exchanges specify situations in which the interface provider (i.e., a device)
// initiates an exchange by publishing (either periodically or aperiodically) an observed value.
// 
// For code generation, specification of an provider initiated exchange should trigger the generation
// of a client-side (e.g., app side) event handler to handle the published message.
//
// TODO: Sam check the QoS parameters to make sure that they align with our AADL/MIDAS-compatible 
// proposals.
//
// TODO: It is unclear to me if I am using the correct modeling strategy here.  Specifically, for
// each exchange one needs to specify the payload of the data being exchanged somewhere (or in the
// case of the action, the arguments and return value).   How should that be done?  By having the
// exchange classes be parametric in the payload?  By extending these traits to include payload attributes)
// (but then there is no guarantee that the method of extending/representing will be uniform)?
// By specifying the payload in a separate sibling field to the exchange attribute? (this is what is
// currently done in the metric class).

trait ICE_ProviderInitiated_Exchange extends ICE_Data_Exchange
trait ICE_ClientInitiated_Exchange extends ICE_Data_Exchange

// A periodic provider-initiated exchange indicates that the interface provider (e.g., a device) publishes
// a value at a certain rate.
trait ICE_Periodic_Exchange extends ICE_ProviderInitiated_Exchange {
  @Const(PRODUCT)
  val access: Option[ICE_Security_Access_Read]
  @Const(PRODUCT)
  val rateRange : NatRange
}

// An episodic provider-initiated exchange indicates that the interface provider (e.g., a device) publishes
// a value episodically (i.e., intermittently)
trait ICE_Episodic_Exchange extends ICE_ProviderInitiated_Exchange {
  @Const(PRODUCT)
  val access: Option[ICE_Security_Access_Read]
  @Const(PRODUCT)
  val maxPublishRate : Nat
}

// A client-initiated exchange indicates that the interface client (e.g., an app) fetches 
// a value episodically (i.e., intermittently)
trait ICE_Get_Exchange extends ICE_ClientInitiated_Exchange {
  @Const(PRODUCT)
  val access: Option[ICE_Security_Access_Read]
  @Const(PRODUCT)
  // need some way to formally declare units on these types of values.
  val maxReadsPerSecond : Nat
}

trait ICE_Set_Exchange extends ICE_ClientInitiated_Exchange {
  @Const(PRODUCT)
  val access: Option[ICE_Security_Access_Write]
  @Const(PRODUCT)
  // need some way to formally declare units on these types of values.
  val maxWritesPerSecond : Nat
}

trait ICE_Action_Exchange extends ICE_ClientInitiated_Exchange {
  @Const(PRODUCT)
  val access: Option[ICE_Security_Access_Action]
  @Const(PRODUCT)
  // need some way to formally declare units on these types of values.
  val maxCallsPerSecond : Nat
}

//=======================================================================================================
//  I C E   P r i m a r y     S c h e m a s 
//=======================================================================================================

trait ICE_VMS extends Feature {
  // 11073 Nomenclature tag indicating the category of the device.  An attribute in 11073 VMS class.
  // Attribute has CLASS constancy because it would instantiated for a particular device class.
  // Listed as "Conditional" in 11073.  Only required if inheriting class is top level (and that is our intention
  // here.)
  @Const(CLASS)
   val IEEE11073_MDC_ATTR_SYS_TYPE : IEEE11073_TYPE
  // 11073 VMS includes attribute "System-Model" (MDC_ATTR_ID_MODEL) 
  // It is missing needed attributes related to the credentialing of the manufacturer,
  // product, etc.   We propose that such attributes be aggregated into a feature ICE_ManufacturerModel.
  // Attribute has PRODUCT constancy because it would instantiated for a particular product, e.g., Nellcor 2000.
  // Listed as "Conditional" in 11073 with the explanation "Only required if inheriting class is top level"
  // -- and that is our intention here.
  @Const(PRODUCT)
   val manufacturerModel : ICE_ManufacturerModel
   
   // 11073 defines the following string attribute to uniquely identifier a device instance.   The 11073
   // type is "string", but this should be changed to some notion of UDI
   @Const(INSTANCE)
   val IEEE11073_MDC_ATTR_SYS_ID : ICE_UDI
}

// === I C E   M a n u f a c t u r e r    I n f o r m a t i o n ===
//
// ICE manufacturer model aggregates information about a particular manufacturer model of device.
//
trait ICE_ManufacturerModel extends Feature {
  // 11073 defines the following attribute to represent manufacturer model information
  @Const(PRODUCT)
  val MDC_ATTR_ID_MODEL : IEEE11073_SystemModel
  // not sure what the constancy attribute should be here: product or instance.
  val credentials : Set[ICE_Security_Certificate] // TODO: Need to work with Eugene to fill this in
}

@Data
trait IEEE11073_SystemModel extends Feature {
   val manufacturer  : String  // IEEE 11073 has this as OCTET STRING
   val model_number  : String  // IEEE 11073 has this as OCTET STRING
}


// === I C E   M D S  (Medical Data System) ===
//
// The MDS object is the top-level object in the device's MDIB and represents 
// the instrument itself. Composite devices may contain additional MDS objects in the MDIB
// The MDS object is an abstraction of a device that provides medical information in the form of 
// objects that are defined in the Medical Package of the DIM.

trait ICE_MDS extends ICE_VMS {

  // 11073 MDS is a container for 0 or more VMD structures
  //
  // NOTE: TODO: I came across how containment relations are represented in 11073, but can't pinpoint
  // the information now.  The info in 11073 is not nearly as directly represented as it is below.
  // Constancy is set to PRODUCT since all info about available VMDs must be completed at the product
  // stage.
  //
  // NOTE: TODO: We may want to bypass the indirection through VMD, and simply reference a set
  // of channels (feature groups) here.
  @Const(PRODUCT)
  @Multiplicity(lo = 1, hi = *)
  val vmds : Set[ICE_VMD]
}

// === I C E   V M D  (Virtual Medical Device) ===
//
// The ICE VMD plays a role similar to the 11073 VMD.  11073 states, 
//    "The VMD object is an abstraction for a medical-related subsystem
//     (e.g., hardware or even pure software) of a medical
//     device. Characteristics of this subsystem (e.g., modes, versions) are
//     captured in this object. At the same time, the VMD object is a
//     container for objects representing measurement and status
//     information.

trait ICE_VMD extends Feature {
  // 11073 VMD contains a very simplistic notion of device state that will in no way be sufficient
  // for our purposes.  In 11073, the notion of VMD status is fixed for all devices.  In our 
  // framework, product should be able to have specialized modes / status values.  To leave a
  // place holder for this we declare a notion of ICE_VMD_Status below.   Initially, we may only
  // state information in this variable corresponding to the connection protocol app status of the
  // device.
  // Constancy is set to PRODUCT since the *structure* of the status attribute must be fixed 
  // in the product description.
  @Const(PRODUCT)
  val status : ICE_VMD_Status
  // 11073 VMD also has manufacturer info and production info.  However, it is unclear to me
  // why that is needed since it is already included in the MDS object.
  //
  // 
  @Const(CLASS)
  val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE
  @Const(PRODUCT)
  val channels : Set[ICE_Channel]
}

trait ICE_VMD_Status extends ICE_Status {
  val state : ICE_VMD_State // enum
}

// === I C E   C h a n n e l  ===
//
// The ICE Channel aggregates related features, and roughly corresponds to the 11073
// notion of channel.
//
// From 11073: 
//    The Channel object is used for grouping Metric objects and, thus,
//    allows hierarchical information organization. The Channel object is
//    not mandatory for representation of Metric objects in a VMD.
//
//    Example: A blood pressure VMD may define a Channel object to group
//    together all metrics that deal with the blood pressure (e.g., pressure
//    value, pressure waveform). A second Channel object can be used to
//    group together metrics that deal with heart rate.
//
// This could potentially play the role of grouping features related to sensors, actuators, etc.
// as in ICEMAN.
//
// The notion of 11073 channel roughly corresponds to an AADL Feature Group.   It's purpose
// is only to *aggregate* logically related features for the purpose of organization.  It
// does not imply a single communication channel (e.g., DDS topic) in the middleware infrastructure.
//
// We will likely want to refactor this to support nested features, or to allow capabilities.
//
// In the current declaration, I have introduced fields to aggregate features according to their
// "kind" (alerts, metrics, settings, etc.).   However, an alternative approach is to have
// a single set of "ICE Features" since each of the alerts, metrics, settings, etc. inherit from
// ICE_Feature.   I decided on the current approach to yield more informative "paths names" when
// accessing particular features, i.e., the path names will indicate the "kind" of the feature
// being accessed.

trait ICE_Channel extends Feature {
 @Const(CLASS)
 val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE
 val alerts   : Set[ICE_Alert]
 val metrics  : Set[ICE_Metric]
 val settings : Set[ICE_Setting] 
 val statuses : Set[ICE_Status] 
 val actions  : Set[ICE_Action] 
}

trait ICE_Feature extends Feature {}

trait ICE_Action extends ICE_Feature {}

//=======================================================================================================
//  I C E   M e t r i c    H i e r a r c h y 
//=======================================================================================================

// === I C E   M e t r i c   ===

// ICE Metric Status
//
// The 11073 Metric Status structure is defined as follows.
//
//  MetricStatus ::= BITS-16 {
//    metric-off(0), 
//    metric-not-ready(1), 
//    metric-standby(2), 
//    metric-transduc-discon(8), 
//    metric-hw-discon(9)
//   }
//
// We need similar sort of information, but with a higher level representation
// This should be an ICE Status value with appropriate security features, etc.
//
//  TODO: complete the definition

trait ICE_Metric_Status extends ICE_Status {} 

// ICE Metric Specification
//
// 11073 defines a Metric Specification Structure and associated definitions
// 


// === I C E   M e t r i c  ===


trait ICE_Metric extends Feature {
  // include the 11073 MDC_ATTR_ID_PHYSIO attribute from the 11073 Metric class
  @Const(CLASS)
  val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE
  // include the 11073 MDC_ATTR_UNIT_CODE attribute from the 11073 Metric class
  @Const(CLASS)
  val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE

  // Capture, in a much nicer way than 11073, update and access information held in the 11073 Metric specification.
  // This information defines the mechanisms for accessing this particular physiological parameter.
  // This information also drives the generation of the programmer level APIs for accessing the physiological
  // parameter.
  //
  // @CodeGen(DATAEXCHANGE)  (this is a preliminary concept)
  //   A code generation data exchange attribute indicates that the code generator should generate
  //   a family of operations, and determined by the included data exchange types with message payloads
  //   determined by specially marked payload declaration.   The fully qualified names for the
  //   operations should be determined by the path through the feature tree.
  @Const(PRODUCT)
  val exchanges : Set[ICE_Data_Exchange]

  // NOTE: There are many more attributes in the 11073 Metric class, but the rest do not 
  // seem crucial nor interesting when experimenting with device model concepts.
  
  // Alerts specific to this physiological parameter.  It is unclear if we need this attribute
  // here or if we should simply use the alert attribute in the feature.
  // TODO: consider refactoring (removing, and just relying on alerts in channel / feature group)
  @Const(PRODUCT)
  val alerts : Set[ICE_Alert]
}


// === I C E   N u m e r i c ===

//  The 11073 Numeric class is used to specified reported physiological values represented
//  as a FLOAT (or compound type).  See MDCF supplementary notes for a detailed assessment
//  of this issue.   Ideally, Numerics should be polymorphic in the type of data.  Until we
//  figure out how to do this, simply use an integer to represent numeric values.
//

trait ICE_Numeric extends ICE_Metric {
  // @CodeGen(PAYLOAD)  (this is a preliminary concept)
  //   A code generation payload attribute indicates that the code generator use this type as the
  //   message payload when generating data exchange code.  
  @Data
  val observedValue : ICE_NuObsValue
  // specify the allowable range.  For now, assume that such a constraint will be standardized for
  // a particular device class.
  @Const(PRODUCT)
  val range : Range
  // Eventually, other static attributes should be included here including things such as
  // accuracy / precision.
}


//  The ``report'' for the Numeric (the observed value), includes
//  information such as unit and metric ID that are already known
//  statically.  So these attributes should be omitted.   On the other
//  hand, it does not include information such as time stamps and
//  status/quality information (which should be included).  While such attributes in 11073
//  can be accessed as a "static group" using the get service, we believe that it would be
//  better to aggregate these attributes directly with the observed value.
  
// This collection of data values provides information that should be included every time a message
// is constructed that will be communicated between device and app.
//
// TODO: I would like to use the 11073 declared time stamp here.
//
@Data
trait ICE_MessageContext extends Feature {
  val messageConstructed : ICETimeStamp
}

// Provides additional attributes that should be communicated with an numeric observed value.
// Following the principles in FAA REMH, each sensor reading should be accompanied by a status
// value.
@Data
trait ICE_NuObsValueContext extends Feature {
  val measurementTaken : ICETimeStamp
}


// Define possible status values for sensor readings represented by ICE Numerics.
@Data
trait ICE_NuObsValueStatusAttributes extends Feature {
  val status    : MeasurementStatus // enum, TODO: extensibility
}

// Defines the representation of the physiological parameter.   This should be a polymorphic
// structure.  To simplify things, for now, we possible status values for sensor readings represented by ICE Numerics.
// TODO: Need the ability to define an enumeration here, that can possibly be extended
// we new values.

@Data
trait ICE_NuObsValue extends ICE_MessageContext with ICE_NuObsValueContext with ICE_NuObsValueStatusAttributes {
  val value : Number
}

@Data
trait ICE_NuObsValueSimpleFloat extends ICE_NuObsValue {
  val value : Float
}


// trait SampleArray extends ICEMetric {
//  val values : Seq[Number]
//  val attributes : Set[MetricAttribute]
// }
//
// trait RealTimeSA extends SampleArray {
//  // implementation to be completed   
// }
//
// trait TimeSA extends SampleArray {
//  val values : Seq[Number]
//  val attributes : Set[MetricAttribute]
// }
// 
// trait DistributionSA extends SampleArray {
//   implementation to be completed 
// }



//=======================================================================================================
//  I C E   S e t t i n g
//
//  Defines settings on the provider that may be read or written by the client.
//  
//  TODO: As with other schemas such as metric, status, etc., this schema should be polymorphic in the
//        data type (and other meta-data information) about the setting.
//
//  TODO: Each setting should have a constraint associated with it specifying the range of values
//        that it can accept.
//=======================================================================================================

trait ICE_Setting extends Feature {
  // include the 11073 MDC_ATTR_ID_PHYSIO attribute from the 11073 Metric class
  @Const(CLASS)
  val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE
  // include the 11073 MDC_ATTR_UNIT_CODE attribute from the 11073 Metric class
  @Const(CLASS)
  val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE
  @Const(PRODUCT)
  val get : ICE_Get_Exchange
  @Const(PRODUCT)
  val set : Option[ICE_Set_Exchange]
  @Const(PRODUCT)
  val get_payload : ICE_SettingGetPayload
  @Const(PRODUCT)
  val set_payload : Option[ICE_SettingSetPayload]
}

// Defines the representation of the setting.   This should be a polymorphic
// structure.  To simplify things, for now, we use an Any type and allow later stages in the
// develop process to refine the payload type.
// 
// BTW, the modeling here seems *way* too complicated.  The basic modeling operation being performed
// is refinement of an attribute type (the payload type).  If we had parameterization, we would be able
// to pass a type directly in that appears far down the nesting structure.  As it stands now, it seems
// that we have to declare a new named type all the way up the hierarchy.

// Set up generic "get payload" type.  The get payload should include a time stamp.
@Data
trait ICE_SettingGetPayload extends ICE_MessageContext {
  val payload : Any
}

// Set up generic "set payload" type.
// The set payload should not include a time stamp (at least, it shouldn't be seen 
// on the app side)
@Data
trait ICE_SettingSetPayload {
  val payload : Any
}

// == C o m m o n    S e t t i n g s == 

// --- Range Setting ---

// Define payload contents (without time stamp and other context)
@Data
trait ICE_RangeSettingPayloadContent {
  val min : Number  
  val max : Number  
}

@Data
trait ICE_FloatRangeSettingPayloadContent extends ICE_RangeSettingPayloadContent {
  val min : Float
  val max : Float
}

 @Data 
 trait ICE_RangeSettingGetPayload extends ICE_SettingGetPayload {
   override val payload : ICE_RangeSettingPayloadContent  // why doesn't an Eclipse "override" marker show up here?
 }
 
 @Data 
 trait ICE_RangeSettingSetPayload extends ICE_SettingSetPayload {
   override val payload : ICE_RangeSettingPayloadContent  // why doesn't an Eclipse "override" marker show up here?
 }

 @Data 
 trait ICE_FloatRangeSettingGetPayload extends ICE_RangeSettingGetPayload {
   override val payload : ICE_FloatRangeSettingPayloadContent
 }
 
 @Data 
 trait ICE_FloatRangeSettingSetPayload extends ICE_RangeSettingSetPayload {
   override val payload : ICE_FloatRangeSettingPayloadContent
 }
 
// Form a range setting by instantiating the type of the payload contents.
// Parameterization would allow us to instantiate the content type which is nested down in the payload type.
// Parameterization would allow us to instantiate with on type (RangeSettingPayloadContent) instead of having
// to refine Any in multiple places. 
trait ICE_RangeSetting extends ICE_Setting {
  @Const(PRODUCT)  
  override val get_payload : ICE_RangeSettingGetPayload // why doesn't an Eclipse "override" marker show up here?
  @Const(PRODUCT)  
  override val set_payload : Option[ICE_RangeSettingSetPayload] // why doesn't an Eclipse "override" marker show up here?
}

trait ICE_FloatRangeSetting extends ICE_RangeSetting {
  @Const(PRODUCT)
  override val get_payload : ICE_FloatRangeSettingGetPayload      // here we should override the payload of type Any       
  @Const(PRODUCT)
  override val set_payload : Option[ICE_FloatRangeSettingSetPayload]
}
 

//
// TODO: Robby how do I refactor this to partially instantiate the Range Setting payload
//



// object RangeSetting {
//  @Inv
//  val `min is less than or equal to max` : Predicate[ICE_RangeSetting] =
//    pred { r : RangeSetting =>
//      r.min <= r.max
//    }
// }
// 
// trait IntRangeSetting extends RangeSetting {
// override val min : Int
//  override val max : Int
// }
// trait ValueSetting extends ICEDeviceSetting {
//  @Settable
//  val value : Any
// }

//=======================================================================================================
//  I C E   A l e r t     H i e r a r c h y
//
//  Note: An alert structure could be patterned after 11073, but we have not assessed the usefulness of that yet.
//  A very simple alert structure is given below.
//
//  Omit payload for the alert at the moment.
//
//=======================================================================================================

trait ICE_Alert extends ICE_Feature {
  @Const(PRODUCT)
  val access: Option[ICE_Security_Access_Read]
  @Const(PRODUCT)
  val exchange : ICE_Episodic_Exchange 
}

trait ICE_FloatRangeValueAlert extends ICE_Alert with ICE_FloatRangeSetting

// trait TargetValueAlert extends ICE_Alert with ValueSetting
// 
// trait ValueChangeAlert extends ICE_Alert
// 
// trait ComplexAlert extends ICE_Alert {
// val cond : Boolean
// }


//=======================================================================================================
//  I C E   D e v i c e    S t a t u s   /   S t a t e
//
//  Defines values on the device that are part of the device's state, and thus may vary during association.
//  Such values may be read only by the client.
//
//  Status values are currently treated differently than physiological parameters because they will
//  like have very different behavioral contracts.   For example, we will likely want to have some
//  state machine notation that captures transitions between states, where we can indicate that the
//  transitions are triggered by different actions/operations/settings on the device or by different failures or
//  fault modes on the device.
//
//=======================================================================================================

trait ICE_Status extends ICE_Feature {
  @Const(PRODUCT)
  val access: Option[ICE_Security_Access_Read]
  @Const(PRODUCT)
  val exchange : ICE_Get_Exchange
}

// TODO:
// As with the Metric values, the status class should be parametric in the type of the status as well
// as on behavioral constraints of the status.   A status should be required to define a value.
// How do we handle this???
//
// Ideally, we want invariants/constraints on the status values that become assumptions on the app
// side about the values being transmitted to the app.

trait BatteryLevelStatus extends ICE_Status {
  val level : Int
}

object BatteryLevelStatus {
  @Inv
  val `level is in 1..100` : Predicate[BatteryLevelStatus] = pred {
    bls : BatteryLevelStatus => 0 <= bls.level && bls.level <= 100
  }
}

