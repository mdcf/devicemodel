/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev2.device

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.examplev2._
import edu.ksu.cis.santos.mdcf.dms.examplev2.schema._
import edu.ksu.cis.santos.mdcf.dms.examplev2.clas._

trait NoninGetExchangeAccess extends ICE_Get_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
}

trait NoninGetExchangeSeparation extends ICE_Get_Exchange {
  override val separation : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

trait NoninGetExchangeServiceTime extends ICE_Get_Exchange {
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

trait NoninGetExchange
  extends NoninGetExchangeAccess
  with NoninGetExchangeSeparation
  with NoninGetExchangeServiceTime

final class NoninPulseOx extends ICE_MDS {
  override val IEEE11073_MDC_ATTR_SYS_TYPE : IEEE11073_TYPE = "Nonin PO"
  override val IEEE11073_MDC_ATTR_SYS_ID : ICE_UDI = "" // TODO: Dynamic

  override val manufacturerModel : ICE_ManufacturerModel = new ICE_ManufacturerModel {
    override val MDC_ATTR_ID_MODEL : IEEE11073_SystemModel = new IEEE11073_SystemModel {
      override val manufacturer : String = "Nonin"
      override val model_number : String = "Nonin Onyx II X5551122"
    }
    override val credentials : Map[String, ICE_Security_Certificate] = Map()
  }

  override val vmds : Map[String, ICE_VMD] = Map(
    "pulseox" -> new ICE_PulseOx_VMD {
      override val status : ICE_VMD_Status = new ICE_VMD_Status {
        override val state : ICE_VMD_State = ICE_VMD_StateValue.Ok
        override val access : Option[ICE_Security_Access_Read] = None
        override val exchange : ICE_Get_Exchange = new NoninGetExchange {}
      }

      override val channels : Map[String, ICE_Channel] = Map(
        "spo2" -> new ICE_SpO2_Channel {
          override val MDC_ATTR_ID_PARAM_GRP : IEEE11073_OID_TYPE = "SpO2 Channel"
          override val alerts : Map[String, ICE_Alert] = Map()
          override val metrics : Map[String, ICE_Metric] = Map(
            "spo2_num" -> new ICE_SpO2_Numeric {
              override val observedValue : ICE_NuObsValueSimpleFloat = DYN
              override val range : FloatRange = new FloatRange {
                override val min : Float = 0.0
                override val max : Float = 100.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new NoninGetExchange {}
              )
              override val alerts : Map[String, ICE_Alert] = Map()
            },
            "pulserate_num" -> new ICE_PulseRate_Numeric {
              override val observedValue : ICE_NuObsValueSimpleFloat = DYN
              override val range : FloatRange = new FloatRange {
                override val min : Float = 20.0
                override val max : Float = 300.0
              }
              override val exchanges : Map[String, ICE_Data_Exchange] = Map(
                "get" -> new NoninGetExchange {}
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