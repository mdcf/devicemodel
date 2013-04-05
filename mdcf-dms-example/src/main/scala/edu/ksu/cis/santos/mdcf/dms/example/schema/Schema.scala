/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.example.schema

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.example.DeviceId
import edu.ksu.cis.santos.mdcf.dms.example.ICETimeStamp
import edu.ksu.cis.santos.mdcf.dms.example.IEEEDeviceType
import edu.ksu.cis.santos.mdcf.dms.example.IEEEPhysioParameterType
import edu.ksu.cis.santos.mdcf.dms.example.IEEEUnit

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

//=======================================================================================================
//  I C E   P r i m a r y     S c h e m a s 
//=======================================================================================================

// === I C E   D e v i c e  ===

trait ICEDevice extends Feature {
  @Const(INSTANCE)
  val id : DeviceId

  @Const(CLASS)
  val `type` : IEEEDeviceType

  val manufacturerModel : ICEManufacturerModel

  val physioParams : Set[ICEPhysioParameter]
}

// === I C E   M a n u f a c t u r e r    I n f o r m a t i o n ===

trait ICEManufacturerModel extends Feature {
  @Const(PRODUCT)
  val modelNumber : String

  val versionNumber : String

  val credentials : Set[ICESecurity]
}

// === I C E   P h y s i o l o g i c a l    P a r a m e t e r  ===

trait ICEPhysioParameter extends Feature {
  @Const(CLASS)
  val physioParameterType : IEEEPhysioParameterType

  @Const(CLASS)
  val unit : IEEEUnit

  @Const(PRODUCT)
  val range : Range

  val exchanges : Set[ICEDataExchange]

  val alerts : Set[ICEAlert]
}

// === I C E    D a t a    E x c h a n g e    P a t t e r n s ===

trait ICEDataExchange extends Feature

trait ProviderInitiated extends ICEDataExchange

trait Periodic extends ProviderInitiated {
  @Const(PRODUCT)
  val rateRange : NatRange
}

trait Episodic extends ProviderInitiated {
  @Const(PRODUCT)
  val maxPublishRate : Nat
}

trait ClientInitiated extends ICEDataExchange {
  @Const(CLASS)
  val maxRetrievalRatePerSecond : Nat
}

//=======================================================================================================
//  I C E   M e t r i c    H i e r a r c h y    (adapted from 11073)
//=======================================================================================================

trait ICEMetric extends Feature {
}

@Data
trait MetricAttribute extends Feature

@Data
trait MetricTimeStampAttributes extends MetricAttribute {
  val sec : Int
  val min : Int
  val hour : Int
  val mday : Int
  val mon : Int
  val year : Int
  val wday : Int
  val yday : Int
  val isdst : Int
}

trait StatusAttributes extends MetricAttribute {
  // val status    : MeasurementStatus // wanted to express an enum but not sure how to do it
}

@Data
trait Numeric extends ICEMetric {
  // note: you should be able to declare this to be a "val" to indicate this are things to read
  @Data
  val observedValue : ObsValue

  val attributes : Set[MetricAttribute]

  val range : Range
}

@Data
trait ICEMessageContext extends Feature {
  val messageConstructed : ICETimeStamp
}

@Data
trait ObsValue extends ICEMessageContext {
  val measurementTaken : ICETimeStamp
  val value : Any
  val context : ObsValueContext
}

trait ObsValueContext extends Feature

trait SampleArray extends ICEMetric {
  val values : Seq[Number]
  val attributes : Set[MetricAttribute]
}

trait RealTimeSA extends SampleArray {
  // implementation to be completed   
}

trait TimeSA extends SampleArray {
  val values : Seq[Number]
  val attributes : Set[MetricAttribute]
}

trait DistributionSA extends SampleArray {
  // implementation to be completed 
}

//=======================================================================================================
//  I C E   A l e r t     H i e r a r c h y
//
//  Note: An alert structure could be patterned after 11073, but we have not assessed the usefulness of that yet.
//  A very simple alert structure is given below.    
//=======================================================================================================

trait ICEAlert extends Feature

trait RangeValueAlert extends ICEAlert with RangeSetting

trait TargetValueAlert extends ICEAlert with ValueSetting

trait ValueChangeAlert extends ICEAlert

trait ComplexAlert extends ICEAlert {
  val cond : Boolean
}

//=======================================================================================================
//  I C E   D e v i c e    S e t t i n g
//
//  Defines settings on the provider that may be read or written by the client.
//=======================================================================================================

trait ICEDeviceSetting extends Feature {
  val security : Option[ICESecurity]
}

trait RangeSetting extends ICEDeviceSetting {
  @Settable
  val min : Number

  @Settable
  val max : Number
}

object RangeSetting {
  @Inv
  val `min is less than or equal to max` : Predicate[RangeSetting] =
    pred { r : RangeSetting =>
      r.min <= r.max
    }
}

trait IntRangeSetting extends RangeSetting {
  override val min : Int
  override val max : Int
}

trait ValueSetting extends ICEDeviceSetting {
  @Settable
  val value : Any
}

//=======================================================================================================
//  I C E   D e v i c e    S t a t u s   
//
//  Defines values on the device that are part of the device's state, and thus may vary during association.
//  Such values may be read or written by the client.
//=======================================================================================================

trait ICEDeviceStatus extends Feature {
  val security : Option[ICESecurity]

  val alarms : Set[ICEAlert]
}

trait BatteryLevelStatus extends ICEDeviceStatus {
  val level : Int

}

object BatteryLevelStatus {
  @Inv
  val `level is in 1..100` : Predicate[BatteryLevelStatus] = pred {
    bls : BatteryLevelStatus => 0 <= bls.level && bls.level <= 100
  } 
}

trait ICESecurity extends Feature

