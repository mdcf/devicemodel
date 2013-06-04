/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.example.v2.clas

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.example.v2._
import edu.ksu.cis.santos.mdcf.dms.example.v2.schema._

trait ICE_PulseOx_VMD extends ICE_VMD {
  @Const(CLASS)
  override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "IEEE ... Pulse Ox"

  // declare a SpO2 channel
  // declare an PulseRate channel
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_SpO2_Channel])
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_PulseRate_Channel])
  override val channels : Map[String, ICE_Channel]
}

trait ICE_SpO2_Channel extends ICE_Channel {
  // indicate at least one Sp02 Numeric
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_SpO2_Numeric])
  override val metrics : Map[String, ICE_Metric]
}

trait ICE_PulseRate_Channel extends ICE_Channel {
  // indicate at least one PulseRate Numeric
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_PulseRate_Numeric])
  override val metrics : Map[String, ICE_Metric]
}

trait ICE_SpO2_Numeric extends ICE_Numeric {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "MDC_PULS_OXIM_SAT_O2"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "MDC_DIM_PERCENT"
}

trait ICE_PulseRate_Numeric extends ICE_Numeric {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "MDC_PULS_OXIM_PULS_RATE"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "MDC_DIM_BEAT_PER_MIN"
}

trait ICE_BloodPressure_VMD extends ICE_VMD {
  @Const(CLASS)
  override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "IEEE ... Blood Pressure"

  // declare a BloodPressure channel
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_BloodPressure_Channel])
  override val channels : Map[String, ICE_Channel]
}

trait ICE_BloodPressure_Channel extends ICE_Channel {
  // indicate at least one Systolic, Diastolic, and Mean Numeric
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_BloodPressure_Systolic_Numeric])
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_BloodPressure_Diastolic_Numeric])
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_BloodPressure_Mean_Numeric])
  override val metrics : Map[String, ICE_Metric]
}

trait ICE_BloodPressure_Systolic_Numeric extends ICE_Numeric {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "MDC_PRESS_BLD_NONINV_SYS"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "MDC_DIM_MMHG"
}

trait ICE_BloodPressure_Diastolic_Numeric extends ICE_Numeric {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "MDC_PRESS_BLD_NONINV_DIA"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "MDC_DIM_MMHG"
}

trait ICE_BloodPressure_Mean_Numeric extends ICE_Numeric {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "MDC_PRESS_BLD_NONINV_MEAN"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "MDC_DIM_MMHG"
}

trait ICE_MultiMonitor_VMD extends ICE_VMD {
  @Const(CLASS)
  override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "IEEE ... MultiMonitor"

  // declare a SpO2 channel
  // declare an PulseRate channel
  // declare a BloodPressure channel
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_SpO2_Channel])
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_PulseRate_Channel])
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_BloodPressure_Channel])
  override val channels : Map[String, ICE_Channel]
}
