package edu.ksu.cis.santos.mdcf.dms.examplev2.requirement

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas.ICE_PulseOx_VMD

/*
 * App requirement for an ICE_PulseOx_VMD
 */

trait App1 {
  val po : ICE_PulseOx_VMD
}

object Case1 extends App {
  @Inv
  val req1 : Predicate[App1] = pred { rpo : App1 => true }
}