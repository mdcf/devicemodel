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

class NoninGetExchange extends ICE_Get_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 5
    override val max : Nat = 50
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

class NoninSporadicExchange extends ICE_Sporadic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 98
    override val max : Nat = 102
  }
}

class NellcorGetExchange extends ICE_Get_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 10
    override val max : Nat = 50
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

class NellcorSetExchange extends ICE_Set_Exchange {
  override val access : Option[ICE_Security_Access_Write] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 10
    override val max : Nat = 50
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

class NellcorPeriodicExchange extends ICE_Periodic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 98
    override val max : Nat = 102
  }
  override val rate : NatRange = new NatRange {
    override val min : Nat = 490
    override val max : Nat = 600
  }
}

class NellcorSporadicExchange extends ICE_Sporadic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 98
    override val max : Nat = 102
  }
}

class MultiMonitorGetExchange extends ICE_Get_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 10
    override val max : Nat = 50
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

class MultiMonitorSetExchange extends ICE_Set_Exchange{
  override val access : Option[ICE_Security_Access_Write] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 10
    override val max : Nat = 50
  }
  override val serviceTime : NatRange = new NatRange {
    override val min : Nat = 0
    override val max : Nat = 50
  }
}

class MultiMonitorPeriodicExchange extends ICE_Periodic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 98
    override val max : Nat = 102
  }
  override val rate : NatRange = new NatRange {
    override val min : Nat = 495
    override val max : Nat = 505
  }
}

class MultiMonitorSporadicExchange extends ICE_Sporadic_Exchange {
  override val access : Option[ICE_Security_Access_Read] = None
  override val separation : NatRange = new NatRange {
    override val min : Nat = 98
    override val max : Nat = 102
  }
}
