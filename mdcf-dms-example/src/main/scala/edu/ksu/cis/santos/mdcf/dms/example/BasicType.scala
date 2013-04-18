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

final class DeviceId(val value : java.lang.String) extends BasicType
object DeviceId { implicit def apply(s : java.lang.String) = new DeviceId(s) }

final class IEEEDeviceType(val value : java.lang.String) extends BasicType
object IEEEDeviceType { implicit def apply(s : java.lang.String) = new IEEEDeviceType(s) }

final class IEEEPhysioParameterType(val value : java.lang.String) extends BasicType
object IEEEPhysioParameterType { implicit def apply(s : java.lang.String) = new IEEEPhysioParameterType(s) }

final class IEEEUnit(val value : java.lang.String) extends BasicType
object IEEEUnit { implicit def apply(s : java.lang.String) = new IEEEUnit(s) }

final class ICETimeStamp(val value : java.lang.String) extends BasicType
object ICETimeStamp { implicit def apply(s : java.lang.String) = new ICETimeStamp(s) }

final class String(val value : java.lang.String) extends BasicType
object String { implicit def apply(s : java.lang.String) = new String(s) }

/**
 * Represents number values.
 */
trait Number extends BasicType {
  def <(o : Number) : Boolean
  def <=(o : Number) : Boolean
  def >(o : Number) : Boolean
  def >=(o : Number) : Boolean
  def +(o : Number) : Number
  def -(o : Number) : Number
  def *(o : Number) : Number
  def /(o : Number) : Number
  def %(o : Number) : Number
}

object Number {
  implicit def apply(n : scala.Int) = Int(n)
  implicit def apply(n : scala.Long) = Int(n)
}

import org.sireum.util.math._

/**
 * Represents whole number values.
 */
trait IntegralType extends Number {
  def value : Integer
}

/**
 * Represents arbitrary-precision integer values.
 */
class Int(val value : Integer) extends IntegralType {
  import Int._
  override def <(o : Number) : Boolean =
    o match {
      case o : Int => this.value < o.value
      case _       => false
    }
  override def <=(o : Number) : Boolean =
    o match {
      case o : Int => this.value <= o.value
      case _       => false
    }
  override def >(o : Number) : Boolean =
    o match {
      case o : Int => this.value > o.value
      case _       => false
    }
  override def >=(o : Number) : Boolean =
    o match {
      case o : Int => this.value >= o.value
      case _       => false
    }
  override def +(o : Number) : Int =
    o match {
      case o : Int => Int(this.value + o.value)
    }
  override def -(o : Number) : Int =
    o match {
      case o : Int => Int(this.value - o.value)
    }
  override def *(o : Number) : Int =
    o match {
      case o : Int => Int(this.value * o.value)
    }
  override def /(o : Number) : Int =
    o match {
      case o : Int => Int(this.value / o.value)
    }
  override def %(o : Number) : Int =
    o match {
      case o : Int => Int(this.value % o.value)
    }
  override def asString = value.toBigInt.toString
  override def toString = asString
}

object Int {
  private def N = SireumNumber

  implicit def apply(n : scala.Int) : Int = apply(N(n))
  implicit def apply(n : scala.Long) : Int = apply(N(n))
  implicit def apply(n : java.lang.String) : Int = apply(N(BigInt(n)))
  implicit def apply(n : Integer) : Int = new Int(n)
}

/**
 * Represents arbitrary-precision non-negative integer values.
 */
class Nat(value : Integer) extends Int(value) {
  override def <(o : Number) : Boolean =
    o match {
      case o : Int => this.value < o.value
      case _       => false
    }
  override def <=(o : Number) : Boolean =
    o match {
      case o : Int => this.value <= o.value
      case _       => false
    }
  override def >(o : Number) : Boolean =
    o match {
      case o : Int => this.value > o.value
      case _       => false
    }
  override def >=(o : Number) : Boolean =
    o match {
      case o : Int => this.value >= o.value
      case _       => false
    }
  override def +(o : Number) : Int =
    o match {
      case o : Nat => Nat(this.value + o.value)
      case o : Int => super.+(o)
    }
  override def -(o : Number) : Int =
    o match {
      case o : Nat => Nat(this.value + o.value)
      case o : Int => super.-(o)
    }
  override def *(o : Number) : Int =
    o match {
      case o : Nat => Nat(this.value + o.value)
      case o : Int => super.*(o)
    }
  override def /(o : Number) : Int =
    o match {
      case o : Nat => Nat(this.value / o.value)
      case o : Int => super./(o)
    }
  override def %(o : Number) : Int =
    o match {
      case o : Nat => Nat(this.value % o.value)
      case o : Int => super.%(o)
    }
}

object Nat {
  private def N = SireumNumber

  final val ZERO = new Nat(SireumNumber(0))

  implicit def apply(n : scala.Int) : Nat = apply(N(n))
  implicit def apply(n : scala.Long) : Nat = apply(N(n))
  implicit def apply(n : java.lang.String) : Nat = apply(N(BigInt(n)))
  implicit def apply(n : Integer) : Nat = if (n < 0) ZERO else new Nat(n)
}
