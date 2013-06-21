/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema._
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas._

trait MyPulseOxReq {
  val po : ICE_PulseOx_VMD
}

object MyPulseOxReq {
  @Inv
  val req1 : Predicate[MyPulseOxReq] =
    pred { rpo : MyPulseOxReq =>
      rpo.po.channels.exists(
        _._2 match {
          case spo2 : ICE_SpO2_Channel =>
            spo2.metrics.exists(
              _._2 match {
                case spo2num : ICE_SpO2_Numeric =>
                  spo2num.range.min < 40 && spo2num.range.max == 100
                case _ => false
              }
            )
          case _ => false
        }
      )
    }

  @Inv
  val req2 : Predicate[MyPulseOxReq] =
    pred { rpo : MyPulseOxReq =>
      rpo.po.channels.exists(
        _._2 match {
          case pr : ICE_PulseRate_Channel =>
            pr.metrics.exists(
              _._2 match {
                case prnum : ICE_PulseRate_Numeric =>
                  prnum.range.min <= 30 && prnum.range.max >= 200
                case _ => false
              })
          case _ => false
        }
      )
    }
}