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

@Class
trait ICEPulseOx extends ICEDevice {
  override val `type` = IEEEDeviceType("IEEE ... Pulse Ox")

  @Inv
  def `At least one SpO2 param` : Boolean =
    physioParams.filter(_.isInstanceOf[ICESpO2]).size >= 1

  @Inv
  def `At least one Pulse Rate param` : Boolean =
    physioParams.exists(_.isInstanceOf[ICEPulseRate]) // a different way to express the inv
}

@Class
trait ICESpO2 extends ICEPhysioParameter {
  override val physioParameterType = IEEEPhysioParameterType("MDC_PULS_OXIM_SAT_O2")
  override val unit = IEEEUnit("MDC_DIM_PERCENT")
}

@Class
trait ICEPulseRate extends ICEPhysioParameter {
  override val physioParameterType = IEEEPhysioParameterType("MDC_PULS_OXIM_PULS_RATE")
  override val unit = IEEEUnit("MDC_DIM_BEAT_PER_MIN")
}

@Class
trait ICEBloodPressure extends ICEDevice {
  override val `type` = IEEEDeviceType("IEEE ... Blood Pressure")

  @Inv
  def `At least one Blood Pressure param` : Boolean =
    physioParams.filter(_.isInstanceOf[ICEPulseRate]).size >= 1
}

@Class
trait ICEBloodPressureParam extends ICEPhysioParameter {
  val systolic = IEEEPhysioParameterType("MDC_PRESS_BLD_NONINV_SYS")
  val diastolic = IEEEPhysioParameterType("MDC_PRESS_BLD_NONINV_DIA")
  
  val physioParameterType = IEEEPhysioParameterType("MDC_PRESS_BLD_NONINV_MEAN") 
  // mean is used here, but we need composite of ICEPhysioParameter
  
  override val unit = IEEEUnit("MDC_DIM_MMHG")
}

@Class
trait ICEMultiMonitor extends ICEDevice {
  override val `type` = IEEEDeviceType("IEEE ... MultiMonitor")
  
  @Inv
  def `At least one SpO2 param` : Boolean =
    physioParams.filter(_.isInstanceOf[ICESpO2]).size >= 1

  @Inv
  def `At least one Pulse Rate param` : Boolean =
    physioParams.filter(_.isInstanceOf[ICEPulseRate]).size >= 1

  @Inv
  def `At least one Blood Pressure param` : Boolean =
    physioParams.filter(_.isInstanceOf[ICEBloodPressure]).size >= 1
}

