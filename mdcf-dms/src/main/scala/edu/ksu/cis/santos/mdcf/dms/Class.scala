/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms

import edu.ksu.cis.santos.mdcf.dms.annotation._
import edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode._
import edu.ksu.cis.santos.mdcf.dms.prelude.Prelude._

@Class
trait ICEPulseOx extends ICEDevice {
  override val `type` = IEEEDeviceType("IEEE ... Pulse Ox")
}

object ICEPulseOx {
  @Inv
  val `At least one SpO2 param` : Predicate[ICEPulseOx] =
    pred { po =>
      po.physioParams.filter(_.isInstanceOf[ICESpO2]).size >= 1
    }

  @Inv
  val `At least one Pulse Rate param` : Predicate[ICEPulseOx] =
    pred { po =>
      po.physioParams.exists(_.isInstanceOf[ICEPulseRate]) // a different way to express the inv
    }
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
}

object ICEBloodPressure {
  @Inv
  val `At least one Blood Pressure param` : Predicate[ICEBloodPressure] =
    pred { bp =>
      bp.physioParams.exists(_.isInstanceOf[ICEPulseRate])
    }
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
}

object ICEMultiMonitor {
  @Inv
  val `At least one SpO2 param` : Predicate[ICEMultiMonitor] =
    pred { mm =>
      mm.physioParams.exists(_.isInstanceOf[ICESpO2])
    }

  @Inv
  val `At least one Pulse Rate param` : Predicate[ICEMultiMonitor] =
    pred { mm =>
      mm.physioParams.exists(_.isInstanceOf[ICEPulseRate])
    }

  @Inv
  val `At least one Blood Pressure param` : Predicate[ICEMultiMonitor] =
    pred { mm =>
      mm.physioParams.exists(_.isInstanceOf[ICEBloodPressure])
    }
}
