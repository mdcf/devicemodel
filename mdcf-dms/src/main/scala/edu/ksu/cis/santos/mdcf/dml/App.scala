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

trait MyReqPulseOx extends ICEPulseOx {
  @Req
  def `(SpO2's min < 40 and SpO2's max == 100)` : Boolean =
    physioParams.exists(
      _ match {
        case spo2 : ICESpO2 => spo2.range.min < 40 && spo2.range.max == 100
        case _              => false
      }
    )

  @Req
  def `PulseRate's min <= 30 and PulseRate's max >= 200` : Boolean =
    physioParams.exists(
      _ match {
        case pr : ICEPulseRate => pr.range.min <= 30 && pr.range.max >= 200
        case _                 => false
      }
    )
}