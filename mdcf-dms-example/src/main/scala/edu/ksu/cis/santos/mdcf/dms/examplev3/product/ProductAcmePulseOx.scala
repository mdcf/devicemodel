package edu.ksu.cis.santos.mdcf.dms.examplev3.product

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev3._
import edu.ksu.cis.santos.mdcf.dms.examplev3.schema._
import edu.ksu.cis.santos.mdcf.dms.examplev3.clas.device._
import edu.ksu.cis.santos.mdcf.dms.examplev3.clas.physio._

trait ACME_PulseOximeter extends ICE_MDS {
  override val vmds : Map[String, ICE_VMD] = Map(
		  "PulseOximeter" -> new ACME_ICE_PulseOx {}
  )
}

trait ACME_ICE_PulseOx extends ICE_PulseOx_VMD {
  override val manufacturerModel: ICE_ManufacturerModel = new ICE_ManufacturerModel {
    @Const(PRODUCT)
    override val MDC_ATTR_ID_MODEL: IEEE11073_SystemModel = new IEEE11073_SystemModel {
      override val manufacturer: String = "ACME"
      override val model_number: String = "66506"
    }

    //TODO: Not decided whether the credentials are initialized at this stage
    //val credentials : Map[String, ICE_Security_Certificate]
  }

  override val channels: Map[String, ICE_Channel] = Map(
    "SpO2" -> new ICE_SpO2_Channel {},
    "PulseRate" -> new ICE_PulseRate_Channel {})
}

trait ACME_ICE_SpO2_Numeric extends ICE_SpO2_Numeric {
  //from ICE_Numeric
  override val range: Range

  //from ICE_Metric
  override val exchanges: Map[String, ICE_Data_Exchange]
  override val alerts: Map[String, ICE_Alert] = Map(
    "MinMaxAlert" -> new ACME_SpO2_ICE_Alert {})

}

trait ACME_ICE_PulseRate_Numeric extends ICE_PulseRate_Numeric {
  //from ICE_Numeric
  override val range: Range

  //from ICE_Metric
  override val exchanges: Map[String, ICE_Data_Exchange]
  override val alerts: Map[String, ICE_Alert] = Map()
}

trait ACME_SpO2_ICE_Alert extends ICE_Alert /*TODO: with 'somethingRange' for min max setting of the alert*/ {
  override val access: Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
  override val exchange: ICE_Sporadic_Exchange = new ICE_Sporadic_Exchange {
    override val access: Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
    override val separation: NatRange = new NatRange {
      override val min: Nat = Nat(500)
      override val max: Nat = Nat(1000)
    }
  }
}

