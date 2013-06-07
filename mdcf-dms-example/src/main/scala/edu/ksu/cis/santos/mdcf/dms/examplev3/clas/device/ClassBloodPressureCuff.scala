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