package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_VMD
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Channel
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_FloatRangeValueAlert
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Periodic_Exchange
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_SpO2_Numeric

/*
 * App requirement for an ICE_SpO2_Numeric with specifying the existence of
 * range limit alarm on the ICE_SpO2_Numeric. (Not sure whether we wanted
 * specific range for the alarm.)
 *
 */

trait AppReq3 {
  val spo2 : ICE_SpO2_Numeric
  val spo2_ex : ICE_Periodic_Exchange
}

object AppReq3 {
  @Inv
  val req1 : Predicate[AppReq3] =
    pred { ar : AppReq3 =>
            ar.spo2 match {
        case spo2 : ICE_SpO2_Numeric =>
          spo2.exchanges.values.exists(
              _ match {
                case exch : ICE_Periodic_Exchange =>
                  ar.spo2_ex == exch
                case _ => false
              }
              ) && spo2.alerts.values.exists(_.isInstanceOf[ICE_FloatRangeValueAlert])
        case _ => false
      }
  }
}