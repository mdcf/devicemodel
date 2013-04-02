/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms

import edu.ksu.cis.santos.mdcf.dms.annotation._
import edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode._
import edu.ksu.cis.santos.mdcf.dms.prelude.Prelude._

@Product
class NellcordPulseOx extends ICEPulseOx {
  override val id = DeviceId("Nellcor PO")

  override val manufacturerModel = new ICEManufacturerModel {
    override val modelNumber = String("Nellcor 2000")
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
          override val security = None
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
          override val security = None
        }
      )
    }
  )
}