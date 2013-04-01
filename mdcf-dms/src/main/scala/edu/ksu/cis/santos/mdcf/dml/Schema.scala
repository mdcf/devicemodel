/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml

import edu.ksu.cis.santos.mdcf.dml.annotation._
import edu.ksu.cis.santos.mdcf.dml.annotation.ConstMode._
import Prelude._

@Schema
trait Range {
  @Const
  val min : Number

  @Const
  val max : Number

  @Inv
  def `min is less than or equal to max` : Boolean = min <= max
}

@Schema
trait IntRange extends Range {
  override val min : Int
  override val max : Int
}

@Schema
trait NatRange extends Range {
  override val min : Nat
  override val max : Nat
}

//=======================================================================================================
//  I C E   P r i m a r y     S c h e m a s 
//=======================================================================================================

// === I C E   D e v i c e  ===

@Schema
trait ICEDevice {
  @Const(INSTANCE)
  val id : DeviceId

  @Const(CLASS)
  val `type` : IEEEDeviceType

  val manufacturerModel : ICEManufacturerModel

  val physioParams : Set[ICEPhysioParameter]
}

// === I C E   M a n u f a c t u r e r    I n f o r m a t i o n ===

@Schema
trait ICEManufacturerModel {
  @Const(PRODUCT)
  val modelNumber : String

  val versionNumber : String

  val credentials : Set[ICESecurity]
}

// === I C E   P h y s i o l o g i c a l    P a r a m e t e r  ===

@Schema
trait ICEPhysioParameter {
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

@Schema
trait ICEDataExchange

@Schema
trait ProviderInitiated extends ICEDataExchange

@Schema
trait Periodic extends ProviderInitiated {
  @Const(PRODUCT)
  val rateRange : NatRange
}

@Schema
trait Episodic extends ProviderInitiated {
  @Const(PRODUCT)
  val maxPublishRate : Nat
}

@Schema
trait ClientInitiated extends ICEDataExchange {
  @Const(CLASS)
  val maxRetrievalRatePerSecond : Nat
}

//=======================================================================================================
//  I C E   M e t r i c    H i e r a r c h y    (adapted from 11073)
//=======================================================================================================

@Schema
trait ICEMetric {
}

@Schema
@Data
trait MetricAttribute

@Schema
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

@Schema
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

@Schema
@Data
trait ICEMessageContext {
  val messageConstructed : ICETimeStamp
}

@Schema
@Data
trait ObsValue extends ICEMessageContext {
  val measurementTaken : ICETimeStamp
  val value : Any
  val context : ObsValueContext
}

@Schema
trait ObsValueContext

@Schema
trait SampleArray extends ICEMetric {
  val values : Seq[Number]
  val attributes : Set[MetricAttribute]
}

@Schema
trait RealTimeSA extends SampleArray {
  // implementation to be completed   
}

@Schema
trait TimeSA extends SampleArray {
  val values : Seq[Number]
  val attributes : Set[MetricAttribute]
}

@Schema
trait DistributionSA extends SampleArray {
  // implementation to be completed 
}

//=======================================================================================================
//  I C E   A l e r t     H i e r a r c h y
//
//  Note: An alert structure could be patterned after 11073, but we have not assessed the usefulness of that yet.
//  A very simple alert structure is given below.    
//=======================================================================================================

@Schema
trait ICEAlert

@Schema
trait RangeValueAlert extends ICEAlert with RangeSetting

@Schema
trait TargetValueAlert extends ICEAlert with ValueSetting

@Schema
trait ValueChangeAlert extends ICEAlert

@Schema
trait ComplexAlert extends ICEAlert {
  val cond : Boolean
}

//=======================================================================================================
//  I C E   D e v i c e    S e t t i n g
//
//  Defines settings on the provider that may be read or written by the client.
//=======================================================================================================

@Schema
trait ICEDeviceSetting {
  val security : Option[ICESecurity]
}

@Schema
trait RangeSetting extends ICEDeviceSetting {
  @Settable
  val min : Number
  
  @Settable
  val max : Number

  @Inv
  def `min is less than or equal to max` : Boolean = min <= max
}

@Schema
trait IntRangeSetting extends RangeSetting {
  override val min : Int
  override val max : Int
}

@Schema
trait ValueSetting extends ICEDeviceSetting {
  val value : Any
}

//=======================================================================================================
//  I C E   D e v i c e    S t a t u s   
//
//  Defines values on the device that are part of the device's state, and thus may vary during association.
//  Such values may be read or written by the client.
//=======================================================================================================

@Schema
trait ICEDeviceStatus {
  val security : Option[ICESecurity]

  val alarms : Set[ICEAlert]
}

@Schema
trait BatteryLevelStatus extends ICEDeviceStatus {
  val level : Int

  @Inv
  def `level is in 1..100` : Boolean = 0 <= level && level <= 100
}

@Schema
trait ICESecurity

