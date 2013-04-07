/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.example.clas

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.example._
import edu.ksu.cis.santos.mdcf.dms.example.schema._

trait ICEPulseOx extends ICEDevice {
  final override val `type` : IEEEDeviceType = "IEEE ... Pulse Ox"
}

object ICEPulseOx {
  @Inv
  val `At least one SpO2 param` : Predicate[ICEPulseOx] =
    pred { po : ICEPulseOx =>
      po.physioParams.filter(_.isInstanceOf[ICESpO2]).size >= 1
    }

  @Inv
  val `At least one Pulse Rate param` : Predicate[ICEPulseOx] =
    pred { po : ICEPulseOx =>
      po.physioParams.exists(_.isInstanceOf[ICEPulseRate]) // a different way to express the inv
    }
}

trait ICESpO2 extends ICEPhysioParameter {
  final override val physioParameterType : IEEEPhysioParameterType = "MDC_PULS_OXIM_SAT_O2"
  final override val unit : IEEEUnit = "MDC_DIM_PERCENT"
}

trait ICEPulseRate extends ICEPhysioParameter {
  final override val physioParameterType : IEEEPhysioParameterType = "MDC_PULS_OXIM_PULS_RATE"
  final override val unit : IEEEUnit = "MDC_DIM_BEAT_PER_MIN"
}

trait ICEBloodPressure extends ICEDevice {
  final override val `type` : IEEEDeviceType = "IEEE ... Blood Pressure"
}

object ICEBloodPressure {
  @Inv
  val `At least one Blood Pressure param` : Predicate[ICEBloodPressure] =
    pred { bp : ICEBloodPressure =>
      bp.physioParams.exists(_.isInstanceOf[ICEPulseRate])
    }
}

trait ICEBloodPressureParam extends ICEPhysioParameter {
  final val systolic : IEEEPhysioParameterType = "MDC_PRESS_BLD_NONINV_SYS"
  final val diastolic : IEEEPhysioParameterType= "MDC_PRESS_BLD_NONINV_DIA"

  final val physioParameterType : IEEEPhysioParameterType = "MDC_PRESS_BLD_NONINV_MEAN"
  // mean is used here, but we need composite of ICEPhysioParameter

  final override val unit : IEEEUnit = "MDC_DIM_MMHG"
}

trait ICEMultiMonitor extends ICEDevice {
  final override val `type` : IEEEDeviceType = "IEEE ... MultiMonitor"
}

object ICEMultiMonitor {
  @Inv
  val `At least one SpO2 param` : Predicate[ICEMultiMonitor] =
    pred { mm : ICEMultiMonitor =>
      mm.physioParams.exists(_.isInstanceOf[ICESpO2])
    }

  @Inv
  val `At least one Pulse Rate param` : Predicate[ICEMultiMonitor] =
    pred { mm : ICEMultiMonitor =>
      mm.physioParams.exists(_.isInstanceOf[ICEPulseRate])
    }

  @Inv
  val `At least one Blood Pressure param` : Predicate[ICEMultiMonitor] =
    pred { mm : ICEMultiMonitor =>
      mm.physioParams.exists(_.isInstanceOf[ICEBloodPressure])
    }
}
