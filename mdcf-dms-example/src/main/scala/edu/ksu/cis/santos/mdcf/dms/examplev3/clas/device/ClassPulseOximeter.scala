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
import edu.ksu.cis.santos.mdcf.dms.examplev3.clas.physio._

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
  override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "IEEE ... SpO2"
  // indicate at least one Sp02 Numeric
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_SpO2_Numeric])
  override val metrics : Map[String, ICE_Metric]
}

trait ICE_PulseRate_Channel extends ICE_Channel {
  override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "IEEE ... PulseRate"
  // indicate at least one PulseRate Numeric
  @Multiplicity(lo = 1, hi = *, clas = classOf[ICE_PulseRate_Numeric])
  override val metrics : Map[String, ICE_Metric]
}
