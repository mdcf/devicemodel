/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.example.device

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.example.schema.ClientInitiated
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICEAlert
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICEDataExchange
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICEManufacturerModel
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICEPhysioParameter
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICESecurity
import edu.ksu.cis.santos.mdcf.dms.example.schema.IntRange
import edu.ksu.cis.santos.mdcf.dms.example.schema.IntRangeSetting
import edu.ksu.cis.santos.mdcf.dms.example.schema.NatRange
import edu.ksu.cis.santos.mdcf.dms.example.schema.Periodic
import edu.ksu.cis.santos.mdcf.dms.example.schema.RangeValueAlert
import edu.ksu.cis.santos.mdcf.dms.example.clas.ICEMultiMonitor
import edu.ksu.cis.santos.mdcf.dms.example.DeviceId
import edu.ksu.cis.santos.mdcf.dms.example.clas.ICESpO2
import edu.ksu.cis.santos.mdcf.dms.example.clas.ICEPulseRate
import edu.ksu.cis.santos.mdcf.dms.example.clas.ICEBloodPressureParam

class MultiMonitor extends ICEMultiMonitor {
  override val id = DeviceId("MultiMonitor")

  override val manufacturerModel = new ICEManufacturerModel {
    override val modelNumber = String("MultiMonitor")
    override val versionNumber = String("XX.YY.ZZ")
    override val credentials = Set[ICESecurity]()
  }

  override val physioParams = Set[ICEPhysioParameter](
    new ICESpO2 {

      override val range = new IntRange {
        override val min = Int(0)
        override val max = Int(100)
      }

      override val exchanges = Set[ICEDataExchange](
        new ClientInitiated {
          override val maxRetrievalRatePerSecond = Nat(15)
        },
        new Periodic {
          override val rateRange = new NatRange {
            override val min = Nat(0)
            override val max = Nat(100)
          }
        }
      )

      override val alerts = Set[ICEAlert](
        new RangeValueAlert with IntRangeSetting {
          override val min = Int(85)
          override val max = Int(100)
          override val security : Option[ICESecurity] = None
        }
      )
    },

    new ICEPulseRate {
      override val range = new IntRange {
        override val min = Int(20)
        override val max = Int(300)
      }

      override val exchanges = Set[ICEDataExchange](
        new ClientInitiated {
          override val maxRetrievalRatePerSecond = Nat(5)
        }
      )

      override val alerts = Set[ICEAlert](
        new RangeValueAlert with IntRangeSetting {
          override val min = Int(40)
          override val max = Int(180)
          override val security : Option[ICESecurity] = None
        }
      )
    },

    new ICEBloodPressureParam {
      override val range = new IntRange {
        override val min = Int(20)
        override val max = Int(300)
      }
      override val exchanges = Set[ICEDataExchange](
        new ClientInitiated {
          override val maxRetrievalRatePerSecond = Nat(5)
        }
      )
      override val alerts = Set[ICEAlert](
        new RangeValueAlert with IntRangeSetting {
          override val min = Int(40)
          override val max = Int(180)
          override val security : Option[ICESecurity] = None
        }
      )
    }
  )
}