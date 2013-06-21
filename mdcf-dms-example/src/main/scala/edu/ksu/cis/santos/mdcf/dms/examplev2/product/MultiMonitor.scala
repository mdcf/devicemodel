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

final class MultiMonitor extends ICE_MDS {
  override val IEEE11073_MDC_ATTR_SYS_TYPE : IEEE11073_TYPE = "MultiMonitor"

  override val manufacturerModel : ICE_ManufacturerModel = new ICE_ManufacturerModel {
    override val MDC_ATTR_ID_MODEL : IEEE11073_SystemModel = new IEEE11073_SystemModel {
      override val manufacturer : String = "MultiMonitor"
      override val model_number : String = "MultiMonitor XX.YY.ZZ"
    }
    override val credentials : Map[String, ICE_Security_Certificate] = Map()
  }

  override val vmds : Map[String, ICE_VMD] = Map(
    "pulseox" -> new ICE_PulseOx_VMD {
      override val status : ICE_VMD_Status = new ICE_VMD_Status {
        override val state : ICE_VMD_State = ICE_VMD_StateValue.Ok
        override val access : Option[ICE_Security_Access_Read] = None
        override val exchange : ICE_Get_Exchange = new MultiMonitorGetExchange {}
      }

      override val channels : Map[String, ICE_Channel] = Map(
        "spo2" -> new ICE_SpO2_Channel {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "SpO2 Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map(
            "spo2_num" -> new ICE_SpO2_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 70.0
                override val max : Float = 100.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new MultiMonitorGetExchange {},
                "periodic" -> new MultiMonitorPeriodicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map(
                "spo2rangealert" -> new ICE_FloatRangeValueAlert{
                  override val ALERT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER CODE"
                  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PLACEHOLDER SOURCE"
                  override val setting = new ICE_FloatRangeSetting {
                    override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "PLACEHOLDER ID"
                    override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER UNIT CODE"
                    override val get : ICE_Get_Exchange = new MultiMonitorGetExchange {}
                    override val set : Option[ICE_Set_Exchange] = Some(new MultiMonitorSetExchange {})
                  }
                  override val access : Option[ICE_Security_Access_Read] = None
                  override val exchange : ICE_Sporadic_Exchange = new MultiMonitorSporadicExchange {}
                  // All payload stuff is dynamic, so we don't write anything about it here
                }
              )
            })
          override val settings : Map[String, ICE_Setting] = Map()
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        },
        "pulserate" -> new ICE_PulseRate_Channel {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Pulse Rate Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map(
            "pulserate_num" -> new ICE_PulseRate_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 20.0
                override val max : Float = 300.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new MultiMonitorGetExchange {},
                "periodic" -> new MultiMonitorPeriodicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map(
                  "pulseraterangealert" -> new ICE_FloatRangeValueAlert{
                  override val ALERT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER CODE"
                  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PLACEHOLDER SOURCE"
                  override val setting = new ICE_FloatRangeSetting {
                    override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "PLACEHOLDER ID"
                    override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER UNIT CODE"
                    override val get : ICE_Get_Exchange = new MultiMonitorGetExchange {}
                    override val set : Option[ICE_Set_Exchange] = Some(new MultiMonitorSetExchange {})
                  }
                  override val access : Option[ICE_Security_Access_Read] = None
                  override val exchange : ICE_Sporadic_Exchange = new MultiMonitorSporadicExchange {}
                  // All payload stuff is dynamic, so we don't write anything about it here
                }
              )
            }
          )
          override val settings : Map[String, ICE_Setting] = Map()
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        }
      )
    },
    
    "bloodpressure" -> new ICE_BloodPressure_VMD {
      override val status : ICE_VMD_Status = new ICE_VMD_Status {
        override val state : ICE_VMD_State = ICE_VMD_StateValue.Ok
        override val access : Option[ICE_Security_Access_Read] = None
        override val exchange : ICE_Get_Exchange = new MultiMonitorGetExchange {}
      }
      override val channels : Map[String, ICE_Channel] = Map(
        "bp" -> new ICE_BloodPressure_Channel{
          override val MDC_ATTR_ID_PARAM_GRP: IEEE11073_OID_TYPE = "Blood Pressure Channel"
          override val metrics: Map[String,ICE_Metric] = Map(
            "bp_dia_num" -> new ICE_BloodPressure_Diastolic_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 20.0
                override val max : Float = 300.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new MultiMonitorGetExchange {},
                "periodic" -> new MultiMonitorPeriodicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map(
                  "bpdia_rangealert" -> new ICE_FloatRangeValueAlert{
                  override val ALERT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER CODE"
                  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PLACEHOLDER SOURCE"
                  override val setting = new ICE_FloatRangeSetting {
                    override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "PLACEHOLDER ID"
                    override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER UNIT CODE"
                    override val get : ICE_Get_Exchange = new MultiMonitorGetExchange {}
                    override val set : Option[ICE_Set_Exchange] = Some(new MultiMonitorSetExchange {})
                  }
                  override val access : Option[ICE_Security_Access_Read] = None
                  override val exchange : ICE_Sporadic_Exchange = new MultiMonitorSporadicExchange {}
                  // All payload stuff is dynamic, so we don't write anything about it here
                }
              )
            },
            "bp_sys_num" -> new ICE_BloodPressure_Systolic_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 20.0
                override val max : Float = 300.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new MultiMonitorGetExchange {},
                "periodic" -> new MultiMonitorPeriodicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map(
                  "bpsys_rangealert" -> new ICE_FloatRangeValueAlert{
                  override val ALERT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER CODE"
                  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PLACEHOLDER SOURCE"
                  override val setting = new ICE_FloatRangeSetting {
                    override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "PLACEHOLDER ID"
                    override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER UNIT CODE"
                    override val get : ICE_Get_Exchange = new MultiMonitorGetExchange {}
                    override val set : Option[ICE_Set_Exchange] = Some(new MultiMonitorSetExchange {})
                  }
                  override val access : Option[ICE_Security_Access_Read] = None
                  override val exchange : ICE_Sporadic_Exchange = new MultiMonitorSporadicExchange {}
                  // All payload stuff is dynamic, so we don't write anything about it here
                }
              )
            },
            "bp_mean_num" -> new ICE_BloodPressure_Systolic_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 20.0
                override val max : Float = 300.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new MultiMonitorGetExchange {},
                "periodic" -> new MultiMonitorPeriodicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map(
                  "bpsys_rangealert" -> new ICE_FloatRangeValueAlert{
                  override val ALERT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER CODE"
                  override val ALERT_SOURCE : IEEE11073_OID_TYPE = "PLACEHOLDER SOURCE"
                  override val setting = new ICE_FloatRangeSetting {
                    override val MDC_ATTR_ID_PHYSIO : IEEE11073_OID_TYPE = "PLACEHOLDER ID"
                    override val MDC_ATTR_UNIT_CODE : IEEE11073_OID_TYPE = "PLACEHOLDER UNIT CODE"
                    override val get : ICE_Get_Exchange = new MultiMonitorGetExchange {}
                    override val set : Option[ICE_Set_Exchange] = Some(new MultiMonitorSetExchange {})
                  }
                  override val access : Option[ICE_Security_Access_Read] = None
                  override val exchange : ICE_Sporadic_Exchange = new MultiMonitorSporadicExchange {}
                  // All payload stuff is dynamic, so we don't write anything about it here
                }
              )
            }
          )
          override val actions: Map[String, ICE_Action] = Map()
          override val alerts: Map[String, ICE_Alert] = Map()
          override val settings: Map[String, ICE_Setting] = Map()
          override val statuses: Map[String, ICE_Status] = Map()
        }
      )
    }
  )
}