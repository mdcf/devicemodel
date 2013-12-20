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

class PCAFGetExchange extends ICE_Get_Exchange {
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

class PCAFSetExchange extends ICE_Set_Exchange {
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

class PCAFActionExchange extends ICE_Action_Exchange {
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

object ICE_PCAF_State extends Enumeration {
  type Type = Value
  val PatientBolusDelivering, Infusing, SquareBolusInfusion, Idle, Paused, Completed, POST, Priming = Value
}

class PCAFSporadicExchange extends ICE_Sporadic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation_interval : Nat = 98
}

final class OpenPCAF extends ICE_MDS {
  override val IEEE11073_MDC_ATTR_SYS_TYPE : IEEE11073_TYPE = "Open PCA"

  override val manufacturerModel : ICE_ManufacturerModel = new ICE_ManufacturerModel {
    override val MDC_ATTR_ID_MODEL : IEEE11073_SystemModel = new IEEE11073_SystemModel {
      override val manufacturer : String = "KSU-Santos"
      override val model_number : String = "Model 1"
    }
    override val credentials : Map[String, ICE_Security_Certificate] = Map()
  }

  override val vmds : Map[String, ICE_VMD] = Map(
    "OpenPCA" -> new ICE_PCA_FLAT_VMD {
      override val status : ICE_VMD_Status = new ICE_VMD_Status {
        override val state : ICE_VMD_State = ICE_VMD_StateValue.Ok
        override val access : Option[ICE_Security_Access_Read] = None
        override val exchange : ICE_Get_Exchange = new PCAFGetExchange {}
      }

      override val channels : Map[String, ICE_Channel] = Map(
        "PumpSpec Settings" -> new ICE_PCAF_PumpSpec_Settings {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "PumpSpec Settings Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map(
            "MaximumFluidDeliveryRate" -> new ICE_PCAF_MaxFluidDeliveryRate_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "MinimumFluidDeliveryRate" -> new ICE_PCAF_MinFluidDeliveryRate_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "FluidDeliveryRateResolution" -> new ICE_PCAF_FluidDeliveryRateResolution_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "VolumeResolution" -> new ICE_PCAF_VolumeResolution_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            })
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },

        "Prescription Dose Settings" -> new ICE_PCAF_PrescriptionDose_Settings {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Prescription Dose Settings Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map(
            "DrugDeliveryRate" -> new ICE_PCAF_DrugDeliveryRate_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "VTBI" -> new ICE_PCAF_VolumeToBeInfused_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "LOI" -> new ICE_PCAF_LockOutInterval_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "MaxDrugPerHour" -> new ICE_PCAF_MaxDrugPerHour_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
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
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "MassLoadingDose" -> new ICE_PCAF_MassLoadingDose_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "DrugDiluent" -> new ICE_PCAF_DrugDiluent_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "DrugName" -> new ICE_PCAF_DrugName_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "SyringeType" -> new ICE_PCAF_SyringeType_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "PatientLineType" -> new ICE_PCAF_PatientLineType_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "DiluentVolume" -> new ICE_PCAF_DiluentVolume_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "SyringeVolume" -> new ICE_PCAF_SyringeVolume_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "DrugCode" -> new ICE_PCAF_DrugCode_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "InitialVolumeDrug" -> new ICE_PCAF_InitialVolumeDrug_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            })
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },
        "Pump Settings" -> new ICE_PCAF_PumpSettings_Settings {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Pump Settings Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map(
            "KVORate" -> new ICE_PCAF_KVORate_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "BolusVolume" -> new ICE_PCAF_BolusVolume_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "BolusDeliveryDuration" -> new ICE_PCAF_BolusDeliveryDuration_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "FluidBolusRate" -> new ICE_PCAF_FluidBolusRate_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "BolusDrugDeliveryRate" -> new ICE_PCAF_BolusDrugDeliveryRate_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "BolusDose" -> new ICE_PCAF_BolusDose_Setting {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = Some(new PCAFSetExchange {})
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            })
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },
        "AdminSession Settings" -> new ICE_PCAF_AdministrationSession_Status {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "AdminSession Settings Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map(
            "FluidDeliveryTime" -> new ICE_PCAF_FluidDeliveryTime_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "StandbyTime" -> new ICE_PCAF_StandbyTime_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "FluidDeliveryRate" -> new ICE_PCAF_FluidDeliveryRate_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "DeliveredDrugMass" -> new ICE_PCAF_DeliveredDrugMass_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "InfusedVolume" -> new ICE_PCAF_InfusedVolume_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "VolumeRemainingToBeInfused" -> new ICE_PCAF_VolumeRemainingToBeInfused_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "TotalDeliveredFluidVolume" -> new ICE_PCAF_TotalDeliveredFluidVolume_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "GoodDemandNumber" -> new ICE_PCAF_GoodDemandNumber_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "TotalDemandNumber" -> new ICE_PCAF_TotalDemandNumber_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "DoseGrantsPerHour" -> new ICE_PCAF_DoseGrantsPerHour_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "DoseRequestsPerHour" -> new ICE_PCAF_DoseRequestsPerHour_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "CurrentPumpReservoirAmount" -> new ICE_PCAF_CurrentPumpReservoirAmount_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            })
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },
        "Status Settings" -> new ICE_PCAF_Pump_Status {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Status Settings Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map(
            "OperationalMode" -> new ICE_PCAF_OperationalMode_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "CalculatedFluidPressure" -> new ICE_PCAF_CalculatedFluidPressure_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "MeasuredFluidPressure" -> new ICE_PCAF_MeasuredFluidPressure_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "OperationalStatus" -> new ICE_PCAF_OperationalStatus_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "VolumeInfusedActualTotal" -> new ICE_PCAF_VolumeInfusedActualTotal_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "RemainingBatteryTime" -> new ICE_PCAF_RemainingBatteryTime_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "UsingBatteryPower" -> new ICE_PCAF_UsingBatteryPower_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "UpstreamFlow" -> new ICE_PCAF_UpstreamFlow_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            },
            "DownstreamFlow" -> new ICE_PCAF_DownstreamFlow_Status {
              override val get : ICE_Get_Exchange = new PCAFGetExchange {}
              override val set : Option[ICE_Set_Exchange] = None
              //override val get_payload : ICE_SettingGetPayload = DYN
              //override val set_payload : Option[ICE_SettingSetPayload] = DYN
            })
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },
        "Commands" -> new ICE_PCAF_Commands {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Commands Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map()
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map(
            "Start" -> new ICE_PCAF_Start_Action {},
            "Pause" -> new ICE_PCAF_Pause_Action {},
            "Stop" -> new ICE_PCAF_Stop_Action {},
            "Prime" -> new ICE_PCAF_Prime_Action {},
            "ResetAdminSession" -> new ICE_PCAF_ResetAdministrationSession_Action {},
            "ResetVolumeInfusedActualTotal" -> new ICE_PCAF_ResetVolumeInfusedActualTotal_Action {},
            "PatientBolus" -> new ICE_PCAF_PatientBolus_Action {},
            "SquareBolus" -> new ICE_PCAF_SquareBolus_Action {})
        },
        "Events" -> new ICE_PCAF_Alert_Channel {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Events Channel"
          override val alerts : Map[String, ICE_Alert] = Map(
            "Warning_Below_VTBI_Soft_Limit" -> new PCAF_Warning_Below_VTBI_Soft_Limit {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Above_VTBI_Soft_Limit" -> new PCAF_Warning_Above_VTBI_Soft_Limit {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Below_Basal_Rate_Soft_Limit" -> new PCAF_Warning_Below_Basal_Rate_Soft_Limit {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Above_Basal_Rate_Soft_Limit" -> new PCAF_Warning_Above_Basal_Rate_Soft_Limit {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Maximum_Safe_Dose" -> new PCAF_Warning_Maximum_Safe_Dose {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Basal_Underinfusion" -> new PCAF_Warning_Basal_Underinfusion {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Bolus_Underinfusion" -> new PCAF_Warning_Bolus_Underinfusion {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Bolus_Underinfusion" -> new PCAF_Warning_Square_Bolus_Underinfusion {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Battery_Backup" -> new PCAF_Warning_Battery_Backup {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Low_Battery" -> new PCAF_Warning_Low_Battery {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Low_Reservoir" -> new PCAF_Warning_Low_Reservoir {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Long_Pause" -> new PCAF_Warning_Long_Pause {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Warning_Input_Needed" -> new PCAF_Warning_Input_Needed {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Clinician_Authentication_Failure" -> new PCAF_Alarm_Clinician_Authentication_Failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Patient_Authentication_Failure" -> new PCAF_Alarm_Patient_Authentication_Failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Prescription_Authentication_Failure" -> new PCAF_Alarm_Prescription_Authentication_Failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Below_VTBI_Hard_Limit" -> new PCAF_Alarm_Below_VTBI_Hard_Limit {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Above_VTBI_Hard_Limit" -> new PCAF_Alarm_Above_VTBI_Hard_Limit {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Below_Basal_Rate_Hard_Limit" -> new PCAF_Alarm_Below_Basal_Rate_Hard_Limit {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Above_Basal_Rate_Hard_Limit" -> new PCAF_Alarm_Above_Basal_Rate_Hard_Limit {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Drug_Not_In_Library" -> new PCAF_Alarm_Drug_Not_In_Library {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Open_Door_Alarm" -> new PCAF_Alarm_Open_Door_Alarm {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Basal_Overinfusion" -> new PCAF_Alarm_Basal_Overinfusion {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Bolus_Overinfusion" -> new PCAF_Alarm_Bolus_Overinfusion {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Square_Bolus_Overinfusion" -> new PCAF_Alarm_Square_Bolus_Overinfusion {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Alert_Stop_Start" -> new PCAF_Alarm_Alert_Stop_Start {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Air_In_Line" -> new PCAF_Alarm_Air_In_Line {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Empty_Reservoir" -> new PCAF_Alarm_Empty_Reservoir {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_PCAF_Overheated" -> new PCAF_Alarm_Pump_Overheated {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Downstream_Occlusion" -> new PCAF_Alarm_Downstream_Occlusion {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Upstream_Occlusion" -> new PCAF_Alarm_Upstream_Occlusion {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_POST_Failure" -> new PCAF_Alarm_POST_Failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Sound_Failure" -> new PCAF_Alarm_Sound_Failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_RAM_Failure" -> new PCAF_Alarm_RAM_Failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_ROM_failure" -> new PCAF_Alarm_ROM_failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_CPU_Failure" -> new PCAF_Alarm_CPU_Failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Thread_Monitor_Alarm" -> new PCAF_Alarm_Thread_Monitor_Alarm {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Battery_Failure" -> new PCAF_Alarm_Battery_Failure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_Voltage_Out_of_Range" -> new PCAF_Alarm_Voltage_Out_of_Range {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            },
            "Alarm_PowerSupplyFailure" -> new PCAF_Alarm_PowerSupplyFailure {
              override val access : Option[ICE_Security_Access_Read] = Some(new ICE_Security_Access_Read {})
              override val exchange : ICE_Sporadic_Exchange = new PCAFSporadicExchange {}
            })
          override val metrics : Map[String, ICE_Metric] = Map()
          override val settings : Map[String, ICE_Setting] = Map()
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        })
    })

}