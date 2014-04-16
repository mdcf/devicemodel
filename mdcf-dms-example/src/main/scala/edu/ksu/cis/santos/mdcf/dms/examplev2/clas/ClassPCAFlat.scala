/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev2.clas

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema._

//TODO: Check multiplicity
//TODO: Deal with Units

// Prescription Dose Channel
// Drug delivery rate
// Volume to be infused
// Lock out interval
// Interval Between Doses
// Scan Prescription-Max Drug Per Hour

trait ICE_PCAF_PrescriptionDose_Settings extends ICE_Channel {
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DrugDeliveryRate_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_VolumeToBeInfused_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_LockOutInterval_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_MaxDrugPerHour_Setting])
  override val settings : Map[String, ICE_Setting]
}

trait ICE_PCAF_DrugDeliveryRate_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_DRUG_DELIV"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_VolumeToBeInfused_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_TBI"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_LockOutInterval_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_TIME_PD_FLUID_BOLUS_LOCKOUT"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_MaxDrugPerHour_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_MAX_DRUG_PER_HOUR"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

// Prescription Drug Info Channel
// Drug concentration
// Mass of loading dose
// Drug Diluent
// Drug name
// Syringe type
// Patient line type
// Diluent volume
// Syringe volume
// Scan Prescription-Drug Code
// Scan Prescription-Initial Volume of Drug
trait ICE_PCAF_PrescriptionDrugInfo_Settings extends ICE_Channel {
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DrugConcentration_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_MassLoadingDose_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DrugDiluent_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DrugName_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_SyringeType_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_PatientLineType_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DiluentVolume_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_SyringeVolume_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DrugCode_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_InitialVolumeDrug_Setting])
  override val settings : Map[String, ICE_Setting]
}
trait ICE_PCAF_DrugConcentration_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_CONC_DRUG"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_MassLoadingDose_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_MASS_DOSE_LOADING"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_DrugDiluent_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_SUBST_DILUENT"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_DrugName_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_DRUG_NAME_POINTER"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_SyringeType_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_SYRINGE_TYPE"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_PatientLineType_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_TUBE_TYPE"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_DiluentVolume_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_DILUENT"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_SyringeVolume_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_SYRINGE"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_DrugCode_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_DRUG_CODE"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_InitialVolumeDrug_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_INITIAL_VOLUME_DRUG"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

// Pump Settings Channel
// KVO Rate
// Bolus volume
// Bolus delivery duration
// Fluid bolus rate - Volume Delivery Rate
// Bolus drug delivery rate - Drug Delivery Rate
// Bolus dose, PCA dose
trait ICE_PCAF_PumpSettings_Settings extends ICE_Channel {
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_KVORate_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_BolusVolume_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_BolusDeliveryDuration_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_FluidBolusRate_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_BolusDrugDeliveryRate_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_BolusDose_Setting])
  override val settings : Map[String, ICE_Setting]
}

trait ICE_PCAF_KVORate_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_KVO"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_BolusVolume_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_BOLUS"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_BolusDeliveryDuration_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_TIME_PD_BOLUS_DELIV"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_FluidBolusRate_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_FLUID_BOLUS"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_BolusDrugDeliveryRate_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_BOLUS_DRUG_DELIV"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_BolusDose_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_DOSE_DRUG_BOLUS"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

// Pump Spec Channel - pump
// Maximum fluid delivery rate
// Minimum fluid delivery rate
// Resolution of fluid delivery rate
// Volume resolution
trait ICE_PCAF_PumpSpec_Settings extends ICE_Channel {
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_MaxFluidDeliveryRate_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_MinFluidDeliveryRate_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_FluidDeliveryRateResolution_Setting])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_VolumeResolution_Setting])
  override val settings : Map[String, ICE_Setting]
}

trait ICE_PCAF_MaxFluidDeliveryRate_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_FLUID_MAX"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_MinFluidDeliveryRate_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_FLUID_DELIV_MIN"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_FluidDeliveryRateResolution_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_FLUID_RES"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_VolumeResolution_Setting extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_RES"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

// Status - AdministrationSession Channel
// Fluid delivery time
// Standby time
// Fluid delivery rate
// Delivered drug mass
// Infused volume
// Volume remaining to be infused
// Total delivered fluid volume
// Number of good demand
// Number of total demand
// Dose Grants per Hour
// Dose Requests per Hour
// Pump-Current Reservoir Amount
trait ICE_PCAF_AdministrationSession_Status extends ICE_Channel {
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_FluidDeliveryTime_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_StandbyTime_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_FluidDeliveryRate_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DeliveredDrugMass_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_InfusedVolume_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_VolumeRemainingToBeInfused_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_TotalDeliveredFluidVolume_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_GoodDemandNumber_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_TotalDemandNumber_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DoseGrantsPerHour_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DoseRequestsPerHour_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_CurrentPumpReservoirAmount_Status])
  override val settings : Map[String, ICE_Setting]
}

trait ICE_PCAF_FluidDeliveryTime_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_TIME_PD_FLUID_DELIV_SINCE_START"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_StandbyTime_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_TIME_PD_FLUID_STANDBY"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_FluidDeliveryRate_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_FLUID_PUMP"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_DeliveredDrugMass_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_MASS_DRUG_DELIV"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_InfusedVolume_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_DELIV"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_VolumeRemainingToBeInfused_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_TBI_REMAIN"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_TotalDeliveredFluidVolume_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_DELIV_TOTAL_SET"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_GoodDemandNumber_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_RATE_PCA_GOOD_DMD"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_TotalDemandNumber_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_RATE_PCA_REQ"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_DoseGrantsPerHour_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_RATE_DOSE_GRANT_PER_HR"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_DoseRequestsPerHour_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_RATE_DOSE_REQ_PER_HR"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_CurrentPumpReservoirAmount_Status extends ICE_Setting {
  override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_CURRENT_PUMP_RESERVOIR_AMOUNT"
  override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

// Status - Pump Channel
// Operational Mode - PCA
// calculated fluid pressure
// measured fluid pressure
// Operational Status of the Pump - State in PCA
// Volume Infused Actual Total
// Battery-Remaining Battery Time
// Battery-Using Battery Power
// Pump-Upstream Flow
// Pump-Downstream Flow
trait ICE_PCAF_Pump_Status extends ICE_Channel {
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_OperationalMode_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_CalculatedFluidPressure_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_MeasuredFluidPressure_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_OperationalStatus_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_VolumeInfusedActualTotal_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_RemainingBatteryTime_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_UsingBatteryPower_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_UpstreamFlow_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_DownstreamFlow_Status])
  override val settings : Map[String, ICE_Setting]
}

trait ICE_PCAF_OperationalMode_Status extends ICE_Status {
  val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_FLUID_MAX"
  val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_CalculatedFluidPressure_Status extends ICE_Status {
   val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_FLUID_DELIV_MIN"
   val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_MeasuredFluidPressure_Status extends ICE_Status {
   val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_FLOW_FLUID_RES"
   val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_OperationalStatus_Status extends ICE_Status {
   val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_RES"
   val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_VolumeInfusedActualTotal_Status extends ICE_Status {
   val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "NOM_VOL_FLUID_RES"
   val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_RemainingBatteryTime_Status extends ICE_Status {
   val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_REMAINING_BATT_TIME"
   val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_UsingBatteryPower_Status extends ICE_Status {
   val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_USING_BATT"
   val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_UpstreamFlow_Status extends ICE_Status {
   val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_UPSTREAM_FLOW"
   val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

trait ICE_PCAF_DownstreamFlow_Status extends ICE_Status {
   val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "KSU_NOM_DOWNSTREAM_FLOW"
   val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "" //TODO: Find the unit
}

// Commands Channel
// Start
// Pause
// Stop
// GetPumpXXXData
// SetPumpXXXData
// Prime
// Reset Administration Session
// Reset Volume Infused Actual Total
// Patient Bolus
// Square Bolus
trait ICE_PCAF_Commands extends ICE_Channel {
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_Start_Action])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_Pause_Action])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_Stop_Action])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_Prime_Action])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_ResetAdministrationSession_Action])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_ResetVolumeInfusedActualTotal_Action])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_PatientBolus_Action])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_SquareBolus_Action])
  override val actions : Map[String, ICE_Action]
}
trait ICE_PCAF_Start_Action extends ICE_Action
trait ICE_PCAF_Pause_Action extends ICE_Action
trait ICE_PCAF_Stop_Action extends ICE_Action
trait ICE_PCAF_Prime_Action extends ICE_Action
trait ICE_PCAF_ResetAdministrationSession_Action extends ICE_Action
trait ICE_PCAF_ResetVolumeInfusedActualTotal_Action extends ICE_Action
trait ICE_PCAF_PatientBolus_Action extends ICE_Action
trait ICE_PCAF_SquareBolus_Action extends ICE_Action

trait ICE_PCAF_Alert_Channel extends ICE_Channel {
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Below_VTBI_Soft_Limit])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Above_VTBI_Soft_Limit])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Below_Basal_Rate_Soft_Limit])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Above_Basal_Rate_Soft_Limit])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Maximum_Safe_Dose])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Basal_Underinfusion])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Bolus_Underinfusion])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Square_Bolus_Underinfusion])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Battery_Backup])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Low_Battery])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Low_Reservoir])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Long_Pause])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Warning_Input_Needed])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Clinician_Authentication_Failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Patient_Authentication_Failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Prescription_Authentication_Failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Below_VTBI_Hard_Limit])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Above_VTBI_Hard_Limit])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Below_Basal_Rate_Hard_Limit])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Above_Basal_Rate_Hard_Limit])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Drug_Not_In_Library])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Open_Door_Alarm])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Basal_Overinfusion])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Bolus_Overinfusion])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Square_Bolus_Overinfusion])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Alert_Stop_Start])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Air_In_Line])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Empty_Reservoir])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Pump_Overheated])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Downstream_Occlusion])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Upstream_Occlusion])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_POST_Failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Sound_Failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_RAM_Failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_ROM_failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_CPU_Failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Thread_Monitor_Alarm])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Battery_Failure])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_Voltage_Out_of_Range])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[PCAF_Alarm_PowerSupplyFailure])
  override val alerts : Map[String, ICE_Alert]
}

trait PCAF_Warning_Below_VTBI_Soft_Limit extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Below_VTBI_Soft_Limit"
  @Const(INSTANCE)
  val softLimit : Int = DYN
  @Const(INSTANCE)
  val suggestedLimit : Int = DYN
}

trait PCAF_Warning_Above_VTBI_Soft_Limit extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Above_VTBI_Soft_Limit"
  @Const(INSTANCE)
  val softLimit : Int = DYN
  @Const(INSTANCE)
  val suggestedLimit : Int = DYN
}

trait PCAF_Warning_Below_Basal_Rate_Soft_Limit extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Below_Basal_Rate_Soft_Limit"
  @Const(INSTANCE)
  val softLimit : Int = DYN
  @Const(INSTANCE)
  val suggestedLimit : Int = DYN
}

trait PCAF_Warning_Above_Basal_Rate_Soft_Limit extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Above_Basal_Rate_Soft_Limit"
  @Const(INSTANCE)
  val softLimit : Int = DYN
  @Const(INSTANCE)
  val suggestedLimit : Int = DYN
}

trait PCAF_Warning_Maximum_Safe_Dose extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Maximum_Safe_Dose"
  @Const(INSTANCE)
  val safeDose : Int = DYN
  @Const(INSTANCE)
  val currentDose : Int = DYN
}

trait PCAF_Warning_Basal_Underinfusion extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Basal_Underinfusion"
  @Const(INSTANCE)
  val supposedInfusion : Int = DYN
  @Const(INSTANCE)
  val currentInfusion : Int = DYN
}

trait PCAF_Warning_Bolus_Underinfusion extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Bolus_Underinfusion"
  @Const(INSTANCE)
  val supposedInfusion : Int = DYN
  @Const(INSTANCE)
  val currentInfusion : Int = DYN
}

trait PCAF_Warning_Square_Bolus_Underinfusion extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Square_Bolus_Underinfusion"
  @Const(INSTANCE)
  val supposedInfusion : Int = DYN
  @Const(INSTANCE)
  val currentInfusion : Int = DYN
}

trait PCAF_Warning_Battery_Backup extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Battery_Backup"
}

trait PCAF_Warning_Low_Battery extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Low_Battery"
  @Const(INSTANCE)
  val lowBatteryLimit : Int = DYN
  @Const(INSTANCE)
  val currentBatteryLevel : Int = DYN
}

trait PCAF_Warning_Low_Reservoir extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Low_Reservoir"
  @Const(INSTANCE)
  val lowReservoirLimit : Int = DYN
  @Const(INSTANCE)
  val currentReservoir : Int = DYN
}

trait PCAF_Warning_Long_Pause extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Long_Pause"
}

trait PCAF_Warning_Input_Needed extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Warning_Input_Needed"
}

trait PCAF_Alarm_Clinician_Authentication_Failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Clinician_Authentication_Failure"
}

trait PCAF_Alarm_Patient_Authentication_Failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Patient_Authentication_Failure"
}

trait PCAF_Alarm_Prescription_Authentication_Failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Prescription_Authentication_Failure"
}

trait PCAF_Alarm_Below_VTBI_Hard_Limit extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Below_VTBI_Hard_Limit"
  @Const(INSTANCE)
  val hardLimit : Int = DYN
  @Const(INSTANCE)
  val suggestedLimit : Int = DYN
}

trait PCAF_Alarm_Above_VTBI_Hard_Limit extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Above_VTBI_Hard_Limit"
  @Const(INSTANCE)
  val hardLimit : Int = DYN
  @Const(INSTANCE)
  val suggestedLimit : Int = DYN
}

trait PCAF_Alarm_Below_Basal_Rate_Hard_Limit extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Below_Basal_Rate_Hard_Limit"
  @Const(INSTANCE)
  val hardLimit : Int = DYN
  @Const(INSTANCE)
  val suggestedLimit : Int = DYN
}

trait PCAF_Alarm_Above_Basal_Rate_Hard_Limit extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Above_Basal_Rate_Hard_Limit"
  @Const(INSTANCE)
  val hardLimit : Int = DYN
  @Const(INSTANCE)
  val suggestedLimit : Int = DYN
}

trait PCAF_Alarm_Drug_Not_In_Library extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Drug_Not_In_Library"
}

trait PCAF_Alarm_Open_Door_Alarm extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Open_Door_Alarm"
}

trait PCAF_Alarm_Basal_Overinfusion extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Basal_Overinfusion"
  @Const(INSTANCE)
  val supposedInfusion : Int = DYN
  @Const(INSTANCE)
  val currentInfusion : Int = DYN
}

trait PCAF_Alarm_Bolus_Overinfusion extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Square_Bolus_Overinfusion"
  @Const(INSTANCE)
  val supposedInfusion : Int = DYN
  @Const(INSTANCE)
  val currentInfusion : Int = DYN
}

trait PCAF_Alarm_Square_Bolus_Overinfusion extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Square_Bolus_Overinfusion"
  @Const(INSTANCE)
  val supposedInfusion : Int = DYN
  @Const(INSTANCE)
  val currentInfusion : Int = DYN
}

trait PCAF_Alarm_Alert_Stop_Start extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Alert_Stop_Start"
}

trait PCAF_Alarm_Air_In_Line extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Air_In_Line"
}

trait PCAF_Alarm_Empty_Reservoir extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Empty_Reservoir"
}

trait PCAF_Alarm_Pump_Overheated extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Pump_Overheated"
  @Const(INSTANCE)
  val currentTemperature : Int = DYN
}

trait PCAF_Alarm_Downstream_Occlusion extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Downstream_Occlusion"
  @Const(INSTANCE)
  val currentOcclusion : Int = DYN
}

trait PCAF_Alarm_Upstream_Occlusion extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_CPU_Failure"
  @Const(INSTANCE)
  val currentOcclusion : Int = DYN
}

trait PCAF_Alarm_POST_Failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_CPU_Failure"
}

trait PCAF_Alarm_Sound_Failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_CPU_Failure"
}

trait PCAF_Alarm_RAM_Failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_CPU_Failure"
}

trait PCAF_Alarm_ROM_failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_CPU_Failure"
}

trait PCAF_Alarm_CPU_Failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_CPU_Failure"
}

trait PCAF_Alarm_Thread_Monitor_Alarm extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Thread_Monitor_Alarm"
}

trait PCAF_Alarm_Battery_Failure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Battery_Failure"
}

trait PCAF_Alarm_Voltage_Out_of_Range extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_Voltage_Out_of_Range"
  @Const(INSTANCE)
  val currentVoltage : Int = DYN
}

trait PCAF_Alarm_PowerSupplyFailure extends ICE_Alert {
  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PCA"
  override val ALERT_CODE : IEEE11073_OID_TYPE = "KSU_Alarm_PowerSupplyFailure"
}

trait ICE_PCA_FLAT_VMD extends ICE_VMD {
  @Const(CLASS)
  override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "IEEE ... PCA"

  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_PrescriptionDose_Settings])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_PrescriptionDrugInfo_Settings])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_PumpSettings_Settings])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_AdministrationSession_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_Pump_Status])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_Commands])
  @Multiplicity(lo = 1, hi = 1, clas = classOf[ICE_PCAF_Alert_Channel])
  override val channels : Map[String, ICE_Channel]
}