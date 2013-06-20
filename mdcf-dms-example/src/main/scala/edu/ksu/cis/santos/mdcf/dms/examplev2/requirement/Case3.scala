package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_VMD
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Channel
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_FloatRangeValueAlert
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_SpO2_Numeric

/*
 * App requirement for an ICE_SpO2_Numeric with specifying the existence of
 * range limit alarm on the ICE_SpO2_Numeric. (Not sure whether we wanted
 * specific range for the alarm.)
 *
 */

trait App3 {
  val dev : ICE_VMD
}

object Case3 extends App {
  @Inv
  val req1 : Predicate[App3] =
    pred { vmd : App3 =>
      vmd.dev.channels.values.exists(
        _ match {
          case chan : ICE_Channel => chan.metrics.values.exists(
            _ match {
              case spo2 : ICE_SpO2_Numeric => spo2.alerts.exists(_.isInstanceOf[ICE_FloatRangeValueAlert])
              case _                       => false
            }
          )
          case _ => false
        }
      )
    }
}