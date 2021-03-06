/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev2

import edu.ksu.cis.santos.mdcf.dms._

object ICE_VMD_StateValue extends Enumeration {
  type Type = Value
  val Ok, NotOk = Value
}

abstract class MeasurementStatusValue extends Enumeration

object MeasurementStatusValue extends MeasurementStatusValue {
  type Type = Value
  val Ok, NotOk, MinRangeTresholdAlert, MaxRangeTresholdAlert = Value
}

