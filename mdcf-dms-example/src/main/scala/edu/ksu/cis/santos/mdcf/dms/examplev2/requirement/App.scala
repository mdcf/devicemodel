/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.example.schema._
import edu.ksu.cis.santos.mdcf.dms.example.clas._

trait MyPulseOxReq {
  val po : ICEPulseOx
}

object MyPulseOxReq {
  @Inv
  val req1 : Predicate[MyPulseOxReq] =
    pred { rpo : MyPulseOxReq =>
      rpo.po.physioParams.exists(
        _ match {
          case spo2 : ICESpO2 => spo2.range.min < 40 && spo2.range.max == 100
          case _              => false
        }
      )
    }

  @Inv
  val req2 : Predicate[MyPulseOxReq] =
    pred { rpo : MyPulseOxReq =>
      rpo.po.physioParams.exists(
        _ match {
          case pr : ICEPulseRate => pr.range.min <= 30 && pr.range.max >= 200
          case _                 => false
        }
      )
    }
}