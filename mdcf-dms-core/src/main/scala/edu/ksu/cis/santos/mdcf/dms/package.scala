/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/
package edu.ksu.cis.santos.mdcf

import scala.annotation.meta._

package object dms {
  type Class = edu.ksu.cis.santos.mdcf.dms.annotation.Class @getter @setter
  type Const = edu.ksu.cis.santos.mdcf.dms.annotation.Const @getter @setter
  type Data = edu.ksu.cis.santos.mdcf.dms.annotation.Data @getter @setter
  type Device = edu.ksu.cis.santos.mdcf.dms.annotation.Device @getter @setter
  type Instance = edu.ksu.cis.santos.mdcf.dms.annotation.Instance @getter @setter
  type Inv = edu.ksu.cis.santos.mdcf.dms.annotation.Inv @getter @setter
  type Product = edu.ksu.cis.santos.mdcf.dms.annotation.Product @getter @setter
  type Req = edu.ksu.cis.santos.mdcf.dms.annotation.Req @getter @setter
  type Schema = edu.ksu.cis.santos.mdcf.dms.annotation.Schema @getter @setter
  type Settable = edu.ksu.cis.santos.mdcf.dms.annotation.Settable @getter @setter
}