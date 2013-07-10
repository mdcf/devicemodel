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

trait AppReq5 {
  val spo2 : ICE_SpO2_Numeric
  val spo2_ex : ICE_Periodic_Exchange
}

object AppReq5 {
  @Inv
  val req1 : Predicate[AppReq5] =
    pred { ar : AppReq5 =>
      ar.spo2 match {
        case spo2 : ICE_SpO2_Numeric =>
          spo2.exchanges.values.exists(
            _ match {
              case exch : ICE_Periodic_Exchange =>
                ar.spo2_ex == exch &&
                  exch.separation_interval.min >= 98 &&
                  exch.separation_interval.max <= 102
              case _ =>
                false
            }
          )
        case _ => false
      }
    }
}
