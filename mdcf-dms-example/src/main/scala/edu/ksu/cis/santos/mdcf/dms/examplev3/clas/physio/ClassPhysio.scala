/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev3.clas.physio

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev3._
import edu.ksu.cis.santos.mdcf.dms.examplev3.schema._

trait ICE_SpO2_Numeric extends ICE_Numeric {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "MDC_PULS_OXIM_SAT_O2"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "MDC_DIM_PERCENT"
}

trait ICE_PulseRate_Numeric extends ICE_Numeric {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "MDC_PULS_OXIM_PULS_RATE"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "MDC_DIM_BEAT_PER_MIN"
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
