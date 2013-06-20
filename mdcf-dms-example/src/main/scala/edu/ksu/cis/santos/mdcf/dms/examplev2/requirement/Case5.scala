package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_VMD
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Channel
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Periodic_Exchange
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_SpO2_Numeric

/*
 * App requirement for a 'periodic' ICE_SpO2_Numeric with the rate of 500ms.
 * 
 */

trait App5 {
  val dev : ICE_VMD
}

object App5 {
  @Inv
  val req1 : Predicate[App5] =
    pred { vmd : App5 =>
      vmd.dev.channels.values.exists(
        _ match {
          case chan : ICE_Channel => chan.metrics.values.exists(
            _ match {
              case spo2 : ICE_SpO2_Numeric => spo2.exchanges.values.exists(
                _ match {
                  case exch : ICE_Periodic_Exchange => exch.rate.min == 500 && exch.rate.max == 500
                  case _                            => false
                }
              )
              case _ => false
            }
          )
          case _ => false
        }
      )
    }
}