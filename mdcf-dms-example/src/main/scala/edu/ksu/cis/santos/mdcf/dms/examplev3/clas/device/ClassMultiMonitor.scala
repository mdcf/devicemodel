/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev3.clas.device

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev3._
import edu.ksu.cis.santos.mdcf.dms.examplev3.schema._
import edu.ksu.cis.santos.mdcf.dms.examplev3.clas.device._

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
