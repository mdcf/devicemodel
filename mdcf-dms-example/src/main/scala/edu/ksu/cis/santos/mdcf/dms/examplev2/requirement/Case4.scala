package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_VMD
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Channel
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_SpO2_Numeric

/*
 * App requirement for an ICE_SpO2_Numeric with specifying range of valid value
 * on the ICE_SpO2_Numeric. (e.g. min:70, max: 100)
 */

trait App4 {
  val dev : ICE_VMD
}

object Case4 extends App {
  @Inv
  val req1 : Predicate[App4] =
    pred { vmd : App4 =>
      vmd.dev.channels.values.exists(
        _ match {
          case chan : ICE_Channel => chan.metrics.values.exists(
            _ match {
              case spo2 : ICE_SpO2_Numeric => spo2.range.min == 70 && spo2.range.max == 100
              case _                       => false
            }
          )
          case _ => false
        }
      )
    }
}