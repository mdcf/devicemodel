package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_VMD
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Channel
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema.ICE_Numeric
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_SpO2_Numeric

/*
 * App requirement for an ICE_SpO2_Numeric
 * 
 * This file shows two ways of encoding the cases:
 * 1) Requiring devices that have certain numerics
 * 2) Requiring the numerics themselves.
 * I'm not sure which is better, but I'm leaning towards (1) because I think it
 * more closely matches how the running app will be composed (treating numerics
 * as components of devices instead of independent entities)
 */

trait App2Dev {
  val dev : ICE_VMD
}

trait App2Num {
  val num : ICE_SpO2_Numeric
}

object Case2 extends App {
  @Inv
  val ReqDev : Predicate[App2Dev] =
    pred { vmd : App2Dev =>
      vmd.dev.channels.values.exists(
        _ match {
          case chan : ICE_Channel => chan.metrics.values.exists(_.isInstanceOf[ICE_SpO2_Numeric])
          case _                  => false
        }
      )
    }

  @Inv
  val ReqNum : Predicate[App2Num] = pred { _ => true }
}