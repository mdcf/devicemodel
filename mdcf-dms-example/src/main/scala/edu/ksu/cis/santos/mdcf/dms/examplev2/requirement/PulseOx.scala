package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_VMD
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_SpO2_Numeric
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_PulseRate_Numeric
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Periodic_Exchange

trait PulseOxDisplayApp {
  val dev : ICE_VMD
}

object PulseOxDisplayApp {
  @Inv
  val reqSpO2 : Predicate[PulseOxDisplayApp] =
    pred { vmd : PulseOxDisplayApp =>
      vmd.dev.channels.values.exists(
        _.metrics.values.exists(
          _ match {
            case spo2num : ICE_SpO2_Numeric =>
              spo2num.exchanges.values.exists(
                _ match {
                  case spo2Exchange : ICE_Periodic_Exchange => true
                  case _                                    => false
                })
            case _ =>
              false
          }))
    }

  @Inv
  val reqPulseRate : Predicate[PulseOxDisplayApp] =
    pred { vmd : PulseOxDisplayApp =>
      vmd.dev.channels.values.exists(
        _.metrics.values.exists(
          _ match {
            case prnum : ICE_PulseRate_Numeric =>
              prnum.exchanges.values.exists(
                _ match {
                  case prExchange : ICE_Periodic_Exchange => true
                  case _                                  => false
                })
            case _ =>
              false
          }))
    }
}