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

class AnDBPGetExchange extends ICE_Get_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation_interval : NatRange = new NatRange {
    override val min : Nat = 9000
    override val max : Nat = 9000
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 9000  // Assume single measurement will take around 1 min and 30 seconds.
    override val max : Nat = 9000*3 //This blood pressure cuff has a feature to retake the BP if there seems to be a problem. Assuming it will tree three times.
  }
}

class AnDBPSporadicExchange extends ICE_Sporadic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation_interval : Nat = 12000 // Assuming 2 minutes to complete a measurement
}


final class AnDBPPulseOx extends ICE_MDS {
  override val IEEE11073_MDC_ATTR_SYS_TYPE : IEEE11073_TYPE = "AnD BloodPressure"

  override val manufacturerModel : ICE_ManufacturerModel = new ICE_ManufacturerModel {
    override val MDC_ATTR_ID_MODEL : IEEE11073_SystemModel = new IEEE11073_SystemModel {
      override val manufacturer : String = "AnD"
      override val model_number : String = "UA-767PBT-C"
    }
    override val credentials : Map[String, ICE_Security_Certificate] = Map()
  }

  override val vmds : Map[String, ICE_VMD] = Map(
    "bp_cuff" -> new ICE_BloodPressure_VMD {
      override val status : ICE_VMD_Status = new ICE_VMD_Status {
        override val state : ICE_VMD_State = ICE_VMD_StateValue.Ok
        override val access : Option[ICE_Security_Access_Read] = None
        override val exchange : ICE_Get_Exchange = new AnDBPGetExchange {}
      }

      override val channels : Map[String, ICE_Channel] = Map(
        "bp" -> new ICE_BloodPressure_Channel {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Blood Pressure Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map(
            "bp_systolic_num" -> new ICE_BloodPressure_Systolic_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 0.0
                override val max : Float = 300.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new AnDBPGetExchange {},
                "sporadic" -> new AnDBPSporadicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map()
            },
             "bp_diastolic_num" -> new ICE_BloodPressure_Diastolic_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 0.0
                override val max : Float = 200.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new AnDBPGetExchange {},
                "sporadic" -> new AnDBPSporadicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map()
            },           
            "bp_mean_num" -> new ICE_BloodPressure_Mean_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 0.0
                override val max : Float = 300.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new AnDBPGetExchange {},
                "sporadic" -> new AnDBPSporadicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map()
            }
          )
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
                override val min : Float = 0.0
                override val max : Float = 300.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new AnDBPGetExchange {},
                "sporadic" -> new AnDBPSporadicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map()
            }
          )
          override val settings : Map[String, ICE_Setting] = Map()
          override val statuses : Map[String, ICE_Status] = Map()
          override val actions : Map[String, ICE_Action] = Map()
        }
      )
    }
  )
}