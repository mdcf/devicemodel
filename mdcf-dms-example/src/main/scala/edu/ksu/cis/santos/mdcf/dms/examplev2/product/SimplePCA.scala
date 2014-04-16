/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev2.product

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema._
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas._
import edu.ksu.cis.santos.mdcf.dms.examplev2.product._
import edu.ksu.cis.santos.mdcf.dms.examplev2.Float.apply
import edu.ksu.cis.santos.mdcf.dms.examplev2.ICE_VMD_State.apply
import edu.ksu.cis.santos.mdcf.dms.examplev2.IEEE11073_OID_TYPE.apply
import edu.ksu.cis.santos.mdcf.dms.examplev2.IEEE11073_TYPE.apply
import edu.ksu.cis.santos.mdcf.dms.examplev2.String.apply

class SimplePCAGetExchange extends ICE_Get_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation_interval : NatRange = new NatRange {
    override val min : Nat = 10
    override val max : Nat = 50
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

class SimplePCASetExchange extends ICE_Set_Exchange {
  override val access : Option[ICE_Security_Access_Write] = None
  override val separation_interval : NatRange = new NatRange {
    override val min : Nat = 10
    override val max : Nat = 50
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

class SimplePCAActionExchange extends ICE_Action_Exchange {
  override val access : Option[ICE_Security_Access_Action] = None
  override val separation_interval : NatRange = new NatRange {
    override val min : Nat = 10
    override val max : Nat = 50
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

abstract class ICE_SimplePCA_State extends Enumeration
object ICE_SimplePCA_State extends Enumeration {
  type Type = Value
  val PatientBolusDelivering, Infusing, SquareBolusInfusion, Idle, Paused, Completed, POST, Priming = Value
}

class SimplePCAPeriodicExchange extends ICE_Periodic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation_interval : NatRange = new NatRange {
    override val min : Nat = 800
    override val max : Nat = 1200
  }
}

class SimplePCASporadicExchange extends ICE_Sporadic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation_interval : Nat = 500
}

trait ICE_SimplePCA_LoadingBolus_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_DOSE_LOADING_BOLUS"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_SimplePCA_LockOutTimer_Status extends ICE_Reporting_Status {
  val remaining_time : IEEE11073_INT_32 = DYN;
}

trait ICE_SimplePCA_PumpState_Status extends ICE_Reporting_Status {
  val pumpstate : ICE_SimplePCA_State = DYN;
}


final class SimplePCA extends ICE_MDS {
  override val IEEE11073_MDC_ATTR_SYS_TYPE : IEEE11073_TYPE = "SimplePCA"

  override val manufacturerModel : ICE_ManufacturerModel = new ICE_ManufacturerModel {
    override val MDC_ATTR_ID_MODEL : IEEE11073_SystemModel = new IEEE11073_SystemModel {
      override val manufacturer : String = "KSU-Santos"
      override val model_number : String = "Model 1"
    }
    override val credentials : Map[String, ICE_Security_Certificate] = Map()
  }

  override val vmds : Map[String, ICE_VMD] = Map(
    "SimplePCA" -> new ICE_PCA_FLAT_VMD {
      override val status : ICE_VMD_Status = new ICE_VMD_Status {
        override val state : ICE_VMD_State = ICE_VMD_StateValue.Ok
        override val access : Option[ICE_Security_Access_Read] = None
        override val exchange : ICE_Get_Exchange = new SimplePCAGetExchange {}
      }

      override val channels : Map[String, ICE_Channel] = Map(
        "Prescription Dose Settings" -> new ICE_PCAF_PrescriptionDose_Settings {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Prescription Dose Settings Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map(  
            "LoadingBolus" -> new ICE_SimplePCA_LoadingBolus_Setting {
              override val get : ICE_Get_Exchange = new SimplePCAGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
            },
            "BolusDose" -> new ICE_PCAF_BolusDose_Setting {
              override val get : ICE_Get_Exchange = new SimplePCAGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
            },
            "LOI" -> new ICE_PCAF_LockOutInterval_Setting {
              override val get : ICE_Get_Exchange = new SimplePCAGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
            })
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },
        "Prescription Drug Info Settings" -> new ICE_PCAF_PrescriptionDrugInfo_Settings {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Prescription Drug Info Settings Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map(
            "DrugConcentration" -> new ICE_PCAF_DrugConcentration_Setting {
              override val get : ICE_Get_Exchange = new SimplePCAGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
            },
            "DrugName" -> new ICE_PCAF_DrugName_Setting {
              override val get : ICE_Get_Exchange = new SimplePCAGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
            },            
            "InitialVolumeDrug" -> new ICE_PCAF_InitialVolumeDrug_Setting {
              override val get : ICE_Get_Exchange = null
              override val set : Option[ICE_Set_Exchange] = None
            })
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },
        "AdminSession Settings" -> new ICE_PCAF_AdministrationSession_Status {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "AdminSession Settings Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map(
            "InfusedVolume" -> new ICE_PCAF_InfusedVolume_Status {
              override val get : ICE_Get_Exchange = null
              override val set : Option[ICE_Set_Exchange] = None
            })
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },
        "Status Settings" -> new ICE_PCAF_Pump_Status {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Status Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map()
          override val statuses : Map[String, ICE_Status] = Map(
            "LO Timer" -> new ICE_SimplePCA_LockOutTimer_Status {
              override val access : Option[ICE_Security_Access_Read] = None
              override val exchange : ICE_Get_Exchange = null
              override val report_exchange : ICE_ProviderInitiated_Exchange = new SimplePCAPeriodicExchange{};
            },
            "OperationalStatus" -> new ICE_SimplePCA_PumpState_Status {
              override val access : Option[ICE_Security_Access_Read] = None
              override val exchange : ICE_Get_Exchange = null
              override val report_exchange : ICE_ProviderInitiated_Exchange = new SimplePCASporadicExchange{};

            })
          override val actions : Map[String, ICE_Action] = Map()
        },
        "Commands" -> new ICE_PCAF_Commands {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Commands Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map()
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map(
            "Stop" -> new ICE_PCAF_Stop_Action {})
        },
        "Events" -> new ICE_PCAF_Alert_Channel {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Events Channel"
          override val alerts : Map[String, ICE_Alert] = Map(
            "Warning_Low_Reservoir" -> new PCAF_Warning_Low_Reservoir {
              override val access : Option[ICE_Security_Access_Read] = None
              override val exchange : ICE_Sporadic_Exchange = null
            },
            "Alarm_Empty_Reservoir" -> new PCAF_Alarm_Empty_Reservoir {
              override val access : Option[ICE_Security_Access_Read] = None
              override val exchange : ICE_Sporadic_Exchange = null
            })
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map()
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        })
    })

}