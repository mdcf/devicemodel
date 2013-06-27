/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.examplev2

import edu.ksu.cis.santos.mdcf.dms._
import org.sireum.util.math._

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

//=======================================================================================================
//  B a s i c    D a t a    T y p e s 
//
//  Elements analogous to those declared in 11073 PHD Section 7.1.2 would be declared as data components
//  and compiled (in a fairly direct manner) to IDL definitions.
//
//  Some examples from 11073 Section 7.1.2 are given below.
//=======================================================================================================

final class ICE_UDI(val value : java.lang.String) extends BasicType
object ICE_UDI { implicit def apply(s : java.lang.String) = new ICE_UDI(s) }

// 11073 -- 7.1.2.1 -- Some basic data declarations.  For now, omit the specifics of the definition.
//                     In fact, we might adopt a framework in which specifics are given externally

final class IEEE11073_INT_U8(val value : scala.Int) extends BasicType
object IEEE11073_INT_U8 { implicit def apply(n : scala.Int) = new IEEE11073_INT_U8(n) }

final class IEEE11073_INT_32(val value : scala.Int) extends BasicType
object IEEE11073_INT_32 { implicit def apply(n : scala.Int) = new IEEE11073_INT_32(n) }

final class IEEE11073_FLOAT_TYPE(val value : scala.Double) extends BasicType
object IEEE11073_FLOAT_TYPE { implicit def apply(n : scala.Double) = new IEEE11073_FLOAT_TYPE(n) }

// 11073 -- 7.1.2.2 -- OID type -- representation for nomenclature tags.
//                     Need to fill in specific representation
// TODO: Should we just use a new type to specifically indicate a nomenclature value??

final class IEEE11073_OID_TYPE(val value : java.lang.String) extends BasicType
object IEEE11073_OID_TYPE { implicit def apply(s : java.lang.String) = new IEEE11073_OID_TYPE(s) }

final class IEEE11073_TYPE(val value : java.lang.String) extends BasicType
object IEEE11073_TYPE { implicit def apply(s : java.lang.String) = new IEEE11073_TYPE(s) }

final class ICE_VMD_State(val value : ICE_VMD_StateValue.Type) extends BasicType
object ICE_VMD_State extends Enumeration {
  implicit def apply(s : ICE_VMD_StateValue.Type) = new ICE_VMD_State(s)
}

final class MeasurementStatus(val value : MeasurementStatusValue.Type) extends BasicType
object MeasurementStatus {
  implicit def apply(s : MeasurementStatusValue.Type) = new MeasurementStatus(s)
}

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
  implicit def apply(n : scala.Double) = Float(n)
}

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
  implicit def apply(n : Integer) : Int = new Int(n)
  implicit def apply(n : scala.Int) : Int = apply(N(n))
  implicit def apply(n : scala.Long) : Int = apply(N(n))
  implicit def apply(n : java.lang.String) : Int = apply(N(BigInt(n)))

  private val N = SireumNumber
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
  implicit def apply(n : Integer) : Nat = if (n < 0) ZERO else new Nat(n)
  implicit def apply(n : scala.Int) : Nat = apply(N(n))
  implicit def apply(n : scala.Long) : Nat = apply(N(n))
  implicit def apply(n : java.lang.String) : Nat = apply(N(BigInt(n)))

  private def N = SireumNumber

  final val ZERO = new Nat(SireumNumber(0))
}

/**
 * Represents whole number values.
 */
trait RealType extends Number

/**
 * Represents 64-bit floating point values.
 */
class Float(val value : Double) extends RealType {
  import Float._
  override def <(o : Number) : Boolean =
    o match {
      case o : Float => this.value < o.value
      case _         => false
    }
  override def <=(o : Number) : Boolean =
    o match {
      case o : Float => this.value <= o.value
      case _         => false
    }
  override def >(o : Number) : Boolean =
    o match {
      case o : Float => this.value > o.value
      case _         => false
    }
  override def >=(o : Number) : Boolean =
    o match {
      case o : Float => this.value >= o.value
      case _         => false
    }
  override def +(o : Number) : Float =
    o match {
      case o : Float => Float(this.value + o.value)
    }
  override def -(o : Number) : Float =
    o match {
      case o : Float => Float(this.value - o.value)
    }
  override def *(o : Number) : Float =
    o match {
      case o : Float => Float(this.value * o.value)
    }
  override def /(o : Number) : Float =
    o match {
      case o : Float => Float(this.value / o.value)
    }
  override def %(o : Number) : Float =
    o match {
      case o : Float => Float(this.value % o.value)
    }
  override def asString = value.toString
  override def toString = asString
}

object Float {
  implicit def apply(n : scala.Float) : Float = apply(n.asInstanceOf[Double])
  implicit def apply(n : scala.Double) : Float = new Float(n)
  implicit def apply(n : java.lang.String) : Float = apply(java.lang.Double.parseDouble(n))
}
