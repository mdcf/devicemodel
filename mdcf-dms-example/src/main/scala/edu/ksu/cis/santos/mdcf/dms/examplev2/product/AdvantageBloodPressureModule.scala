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

class AdvantageBPGetExchange extends ICE_Get_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation_interval : NatRange = new NatRange {
    override val min : Nat = 9000 //In theory, new measurement could be taken right after the previous one is taken, so this number is same as the minimum service time. 
    override val max : Nat = 13000 + 15000 + 1000
    										//This should be infinite since we don't know when the get will occur?
    										//The numbers are (max single measure) + (over 10mmHg air timer) + (deflation time)
    										//In case the pressure of the cuff is not under 10mmHg yet, then the measurement cannot be taken.
    										//We might have to wait till the deflation timer kicks in(150 seconds). 
    										//Then the assumption that deflation will take 10 seconds. So this figure is 150 seconds + 10 seconds. 
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 9000  // Assume single measurement will take around 90 seconds.
    override val max : Nat = 13000  // In page 36, maximum measurement time out is 130 seconds
  }
}

class AdvantageBPSporadicExchange extends ICE_Sporadic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation_interval : Nat = 9000 // Assuming minimum 90 seconds to complete a measurement as above 'get exchange' assumption.
}


final class AdvantageBPModule extends ICE_MDS {
  override val IEEE11073_MDC_ATTR_SYS_TYPE : IEEE11073_TYPE = "Advantage OEM BP Module"

  override val manufacturerModel : ICE_ManufacturerModel = new ICE_ManufacturerModel {
    override val MDC_ATTR_ID_MODEL : IEEE11073_SystemModel = new IEEE11073_SystemModel {
      override val manufacturer : String = "SunTech Medical Inc."
      override val model_number : String = "Model 2"
    }
    override val credentials : Map[String, ICE_Security_Certificate] = Map()
  }

  override val vmds : Map[String, ICE_VMD] = Map(
    "bp_cuff" -> new ICE_BloodPressure_VMD {
      override val status : ICE_VMD_Status = new ICE_VMD_Status {
        override val state : ICE_VMD_State = ICE_VMD_StateValue.Ok
        override val access : Option[ICE_Security_Access_Read] = None
        override val exchange : ICE_Get_Exchange = new AdvantageBPGetExchange {}
      }

      override val channels : Map[String, ICE_Channel] = Map(
        "bp" -> new ICE_BloodPressure_Channel {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "Blood Pressure Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map(
            "bp_systolic_num" -> new ICE_BloodPressure_Systolic_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 40.0
                override val max : Float = 260.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new AdvantageBPGetExchange {},
                "sporadic" -> new AdvantageBPSporadicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map()
            },
             "bp_diastolic_num" -> new ICE_BloodPressure_Diastolic_Numeric {
              override val range : FloatRange = new FloatRange {
                override val min : Float = 20.0
                override val max : Float = 200.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new AdvantageBPGetExchange {},
                "sporadic" -> new AdvantageBPSporadicExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map()
            },           
            "bp_mean_num" -> new ICE_BloodPressure_Mean_Numeric { //MAP = [(2*diastolic) + systolic] / 3
              override val range : FloatRange = new FloatRange {
                override val min : Float = 20.0 //26.7 based on the formula
                override val max : Float = 225.0 //220 based on the formula
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new AdvantageBPGetExchange {},
                "sporadic" -> new AdvantageBPSporadicExchange {}
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
                override val min : Float = 30.0
                override val max : Float = 220.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new AdvantageBPGetExchange {},
                "sporadic" -> new AdvantageBPSporadicExchange {}
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