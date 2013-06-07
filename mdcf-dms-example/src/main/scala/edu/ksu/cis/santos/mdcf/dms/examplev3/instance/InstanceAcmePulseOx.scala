package edu.ksu.cis.santos.mdcf.dms.examplev3.instance

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev3._
import edu.ksu.cis.santos.mdcf.dms.examplev3.schema._
import edu.ksu.cis.santos.mdcf.dms.examplev3.product._

trait ACME_PulseOximeter_Instance extends ACME_PulseOximeter {
  override val IEEE11073_MDC_ATTR_SYS_ID : ICE_UDI = new ICE_UDI("123456789")
}