/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/
package edu.ksu.cis.santos.mdcf

import scala.annotation.meta._
import scala.reflect.runtime.{ universe => ru }

import org.sireum.util.math._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
package object dms {
  type Class = edu.ksu.cis.santos.mdcf.dms.annotation.Class @getter @setter
  type Const = edu.ksu.cis.santos.mdcf.dms.annotation.Const @getter @setter
  type Data = edu.ksu.cis.santos.mdcf.dms.annotation.Data @getter @setter
  type Instance = edu.ksu.cis.santos.mdcf.dms.annotation.Instance @getter @setter
  type Inv = edu.ksu.cis.santos.mdcf.dms.annotation.Inv @getter @setter
  type Product = edu.ksu.cis.santos.mdcf.dms.annotation.Product @getter @setter
  type Req = edu.ksu.cis.santos.mdcf.dms.annotation.Req @getter @setter
  type Schema = edu.ksu.cis.santos.mdcf.dms.annotation.Schema @getter @setter
  type Settable = edu.ksu.cis.santos.mdcf.dms.annotation.Settable @getter @setter

  final val SCHEMA = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.SCHEMA
  final val CLASS = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.CLASS
  final val PRODUCT = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.PRODUCT
  final val INSTANCE = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.INSTANCE
  final val UNSPECIFIED = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.UNSPECIFIED

  type Set[T] = scala.collection.immutable.Set[T]
  type Seq[T] = scala.collection.immutable.Seq[T]

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Any

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait BasicType extends Any {
    def value : scala.Any
    def ==(o : BasicType) : Boolean = value == o.value
    def !=(o : BasicType) : Boolean = value != o.value
    def asString : java.lang.String = value.toString
    override def toString = s"${getClass.getSimpleName}($asString)"

    override def equals(o : scala.Any) : scala.Boolean = {
      if (this == o) true
      else o match {
        case o : BasicType => getClass == o.getClass && value == o.value
        case _             => false
      }
    }
    override def hashCode = value.hashCode
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Feature extends Any {
    final override def toString = s"feature ${getClass.getName}"
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  final implicit class Boolean(val value : scala.Boolean) {
    import Boolean._
    def unary_! : Boolean = if (value) FALSE else TRUE
    def &&(o : => Boolean) : Boolean = if (!value) FALSE else o
    def ||(o : => Boolean) : Boolean = if (value) TRUE else o
    def ==>(o : => Boolean) : Boolean = if (!value) TRUE else o
    def <==(o : => Boolean) : Boolean = if (value) TRUE else !o
    def &&&(o : Boolean) : Boolean = this && o
    def ||&(o : Boolean) : Boolean = this || o
    def ===>(o : Boolean) : Boolean = this ==> o
    def <===(o : Boolean) : Boolean = this <== o
    def ite[T](v1 : => T, v2 : => T) : T = if (value) v1 else v2
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Boolean {
    final val TRUE = Boolean(true)
    final val FALSE = Boolean(false)
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  final implicit class String(val value : java.lang.String) extends BasicType

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
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

  import language.implicitConversions

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Number {
    implicit def apply(n : scala.Int) = Int(n)
    implicit def apply(n : scala.Long) = Int(n)
  }

  import org.sireum.util.math._

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait IntegralType extends Number {
    def value : Integer
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
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

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
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

  private def N = SireumNumber

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Int {
    implicit def apply(n : scala.Int) : Int = apply(N(n))
    implicit def apply(n : scala.Long) : Int = apply(N(n))
    implicit def apply(n : java.lang.String) : Int = apply(N(BigInt(n)))
    implicit def apply(n : Integer) : Int = new Int(n)
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Nat {
    final val ZERO = new Nat(SireumNumber(0))

    implicit def apply(n : scala.Int) : Nat = apply(N(n))
    implicit def apply(n : scala.Long) : Nat = apply(N(n))
    implicit def apply(n : java.lang.String) : Nat = apply(N(BigInt(n)))
    implicit def apply(n : Integer) : Nat = if (n < 0) ZERO else new Nat(n)
  }

  implicit def boolean2sboolean(b : Boolean) : scala.Boolean = b.value
  implicit def seq2iseq[T](s : scala.collection.Seq[T]) : Seq[T] = s.toVector

  import scala.language.experimental.macros

  type Predicate[T] = ru.Expr[T => Boolean]

  def pred[T](p : T => Boolean) : Predicate[T] = macro predImpl[T]

  def predImpl[T : c.WeakTypeTag](c : scala.reflect.macros.Context)(
    p : c.Expr[T => Boolean]) : c.Expr[Predicate[T]] = {
    import c.universe._

    val Apply(rt, _) = (reify { ru.reify {} }).tree

    c.Expr[Predicate[T]](Apply(rt, List(p.tree)))
  }
}