/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.example

import edu.ksu.cis.santos.mdcf.dms.BasicType

import language.implicitConversions

final class DeviceId(val value : String) extends BasicType
object DeviceId { implicit def apply(s : String) = new DeviceId(s) }

final class IEEEDeviceType(val value : String) extends BasicType
object IEEEDeviceType { implicit def apply(s : String) = new IEEEDeviceType(s) }

final class IEEEPhysioParameterType(val value : java.lang.String) extends BasicType
object IEEEPhysioParameterType { implicit def apply(s : String) = new IEEEPhysioParameterType(s) }

final class IEEEUnit(val value : java.lang.String) extends BasicType
object IEEEUnit { implicit def apply(s : String) = new IEEEUnit(s) }

final class ICETimeStamp(val value : java.lang.String) extends BasicType
object ICETimeStamp { implicit def apply(s : String) = new ICETimeStamp(s) }
