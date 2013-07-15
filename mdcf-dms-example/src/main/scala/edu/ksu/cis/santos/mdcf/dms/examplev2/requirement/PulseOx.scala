package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_VMD
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_SpO2_Numeric
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_PulseRate_Numeric
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Periodic_Exchange

trait PulseOxDisplayApp {
  val spo2 : ICE_SpO2_Numeric
  val pulserate : ICE_PulseRate_Numeric
  val spo2_ex : ICE_Periodic_Exchange
  val pr_ex : ICE_Periodic_Exchange
}

object PulseOxDisplayApp {
  @Inv
  val reqSpO2 : Predicate[PulseOxDisplayApp] =
    pred { apprec : PulseOxDisplayApp =>
      apprec.spo2 match {
        case spo2 : ICE_SpO2_Numeric =>
          spo2.exchanges.values.exists(
            _ match {
              case exch : ICE_Periodic_Exchange =>
                apprec.spo2_ex == exch
              case _ => false
            }
          )
        case _ => false
      }
    }

  @Inv
  val reqPulseRate : Predicate[PulseOxDisplayApp] =
    pred { apprec : PulseOxDisplayApp =>
      apprec.pulserate match {
        case pulserate : ICE_PulseRate_Numeric =>
          pulserate.exchanges.values.exists(
            _ match {
              case exch : ICE_Periodic_Exchange =>
                apprec.pr_ex == exch
              case _ => false
            }
          )
        case _ => false
      }
    }
}