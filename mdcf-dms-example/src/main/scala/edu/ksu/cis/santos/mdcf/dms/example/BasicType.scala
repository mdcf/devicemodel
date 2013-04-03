/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.example

import edu.ksu.cis.santos.mdcf.dms.annotation._
import edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode._
import edu.ksu.cis.santos.mdcf.dms.prelude._

object DeviceId {
  def apply(s : java.lang.String) : DeviceId = DeviceIdImpl(s)

  case class DeviceIdImpl(value : java.lang.String)
    extends AbstractString with DeviceId
}

trait DeviceId extends String

object IEEEDeviceType {
  def apply(s : java.lang.String) : IEEEDeviceType = IEEEDeviceTypeImpl(s)

  case class IEEEDeviceTypeImpl(value : java.lang.String)
    extends AbstractString with IEEEDeviceType
}

trait IEEEDeviceType extends String

object IEEEPhysioParameterType {
  def apply(s : java.lang.String) : IEEEPhysioParameterType = IEEEPhysioParameterTypeImpl(s)

  case class IEEEPhysioParameterTypeImpl(value : java.lang.String)
    extends AbstractString with IEEEPhysioParameterType
}

trait IEEEPhysioParameterType extends String

object IEEEUnit {
  def apply(s : java.lang.String) : IEEEUnit = IEEEUnitImpl(s)

  case class IEEEUnitImpl(value : java.lang.String)
    extends AbstractString with IEEEUnit
}

trait IEEEUnit extends String

object ICETimeStamp {
  def apply(s : java.lang.String) : ICETimeStamp = ICETimeStampImpl(s)
  case class ICETimeStampImpl(value : java.lang.String)
    extends AbstractString with ICETimeStamp
}

trait ICETimeStamp extends String

