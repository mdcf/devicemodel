/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.annotation

import scala.annotation._
import edu.ksu.cis.santos.mdcf.dml.annotation._

case class Schema() extends StaticAnnotation
case class Class() extends StaticAnnotation
case class Product() extends StaticAnnotation
case class Instance() extends StaticAnnotation

case class Req() extends StaticAnnotation

case class Data() extends StaticAnnotation

case class Inv() extends StaticAnnotation

case class Settable() extends StaticAnnotation

case class Const(mode : ConstMode = ConstMode.UNSPECIFIED) extends StaticAnnotation
