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

trait AppReq2 {
  val vmd : ICE_VMD
}

object AppReq2 {
  @Inv
  val ReqDev : Predicate[AppReq2] =
    pred { ar : AppReq2 =>
      ar.vmd.channels.values.exists(po_channel =>
        po_channel.metrics.values.exists(spo2 =>
          spo2.isInstanceOf[ICE_SpO2_Numeric]))
    }
}

trait AppReq2Alt {
  val spo2 : ICE_SpO2_Numeric
}
