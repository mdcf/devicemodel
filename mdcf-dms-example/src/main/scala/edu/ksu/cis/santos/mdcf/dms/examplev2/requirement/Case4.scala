package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_VMD
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Channel
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_SpO2_Numeric
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Periodic_Exchange

/*
 * App requirement for an ICE_SpO2_Numeric with specifying range of valid value
 * on the ICE_SpO2_Numeric. (e.g. min:70, max: 100)
 */

trait AppReq4 {
  val spo2 : ICE_SpO2_Numeric
  val spo2_ex : ICE_Periodic_Exchange
}

object AppReq4 {
  @Inv
  val req1 : Predicate[AppReq4] =
    pred { ar : AppReq4 =>
      ar.spo2 match {
        case spo2 : ICE_SpO2_Numeric =>
          spo2.exchanges.values.exists(
            _ match {
              case exch : ICE_Periodic_Exchange =>
                ar.spo2_ex == exch
              case _ => false
            }
          ) && spo2.range.min <= 30 &&
            spo2.range.max >= 100
        case _ => false
      }
    }
}