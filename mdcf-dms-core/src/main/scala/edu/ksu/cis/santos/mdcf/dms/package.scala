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
  type Device = edu.ksu.cis.santos.mdcf.dms.annotation.Device @getter @setter
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

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Any

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  abstract class BasicType extends Any {
    def ==(o : Any) : Boolean
    def !=(o : Any) : Boolean
    def asString : java.lang.String
    override def toString = s"${getClass.getSimpleName}($asString)"
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  abstract class Feature extends Any

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object String {
    def apply(s : java.lang.String) = StringImpl(s)

    case class StringImpl(value : java.lang.String) extends AbstractString
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait String extends BasicType {
    def value : java.lang.String
    def asString = value
    override def toString = value
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Boolean {

    def apply(b : scala.Boolean) = if (b) True else False

    object True extends AbstractBoolean {
      def value = true
    }

    object False extends AbstractBoolean {
      def value = false
    }
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Boolean extends BasicType {
    def value : scala.Boolean
    def unary_! : Boolean
    def &&(o : => Boolean) : Boolean
    def ||(o : => Boolean) : Boolean
    def ==>(o : => Boolean) : Boolean
    def <==(o : => Boolean) : Boolean
    def &&&(o : Boolean) : Boolean
    def ||&(o : Boolean) : Boolean
    def ===>(o : Boolean) : Boolean
    def <===(o : Boolean) : Boolean
    def asString = "true"
    override def toString = value.toString
  }

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

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Int {

    def apply(n : scala.Int) : Int = apply(SireumNumber(n))
    def apply(n : scala.Long) : Int = apply(SireumNumber(n))
    def apply(n : BigInt) : Int = apply(SireumNumber(n))
    def apply(n : java.math.BigInteger) : Int = apply(SireumNumber(n))
    def apply(n : java.lang.String) : Int = apply(SireumNumber(BigInt(n)))
    def apply(n : Integer) = IntImpl(n)

    final case class IntImpl(value : Integer) extends AbstractInt {
      def +(o : Number) : Int =
        o match {
          case o : Int => i2dmli(this.value + o.value)
        }
      def -(o : Number) : Int =
        o match {
          case o : Int => i2dmli(this.value - o.value)
        }
      def *(o : Number) : Int =
        o match {
          case o : Int => i2dmli(this.value * o.value)
        }
      def /(o : Number) : Int =
        o match {
          case o : Int => i2dmli(this.value / o.value)
        }
      def %(o : Number) : Int =
        o match {
          case o : Int => i2dmli(this.value % o.value)
        }
    }
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Int extends Number {
    def value : Integer
    def asString = value.toString
    final override def toString = value.toString
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Nat {
    def apply(n : scala.Int) : Nat = apply(SireumNumber(n))
    def apply(n : scala.Long) : Nat = apply(SireumNumber(n))
    def apply(n : BigInt) : Nat = apply(SireumNumber(n))
    def apply(n : java.math.BigInteger) : Nat = apply(SireumNumber(n))
    def apply(n : java.lang.String) : Nat = apply(SireumNumber(BigInt(n)))
    def apply(n : Integer) =
      if (n < 0) NatImpl(-n) else NatImpl(n)

    final case class NatImpl(value : Integer) extends AbstractInt with Nat {
      def +(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value + o.value)
          case o : Int => Int(this.value + o.value)
        }
      def -(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value - o.value)
          case o : Int => Int(this.value - o.value)
        }
      def *(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value * o.value)
          case o : Int => Int(this.value * o.value)
        }
      def /(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value / o.value)
          case o : Int => Int(this.value / o.value)
        }
      def %(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value % o.value)
          case o : Int => Int(this.value % o.value)
        }
    }
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Nat extends Int

  type Set[T] = scala.collection.immutable.Set[T]
  type Seq[T] = scala.collection.immutable.Seq[T]

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  abstract class AbstractInt extends Int {
    import Boolean._

    def ==(o : Any) : Boolean = this == o
    def !=(o : Any) : Boolean = this != o
    def <(o : Number) : Boolean =
      o match {
        case o : Int => this.value < o.value
        case _       => False
      }
    def <=(o : Number) : Boolean =
      o match {
        case o : Int => this.value <= o.value
        case _       => False
      }
    def >(o : Number) : Boolean =
      o match {
        case o : Int => this.value > o.value
        case _       => False
      }
    def >=(o : Number) : Boolean =
      o match {
        case o : Int => this.value >= o.value
        case _       => False
      }
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  sealed abstract class AbstractBoolean extends Boolean {
    import Boolean._

    def unary_! : Boolean =
      this match {
        case True  => False
        case False => True
      }
    def ==(o : Any) : Boolean = this == o
    def !=(o : Any) : Boolean = this != o
    def &&(o : => Boolean) : Boolean =
      this match {
        case True => o
        case _    => False
      }
    def ||(o : => Boolean) : Boolean =
      this match {
        case False => o
        case _     => True
      }
    def ==>(o : => Boolean) : Boolean =
      this match {
        case False => True
        case _     => o
      }
    def <==(o : => Boolean) : Boolean =
      this match {
        case False => o
        case _     => True
      }
    def &&&(o : Boolean) : Boolean = this && o
    def ||&(o : Boolean) : Boolean = this || o
    def ===>(o : Boolean) : Boolean = this ==> o
    def <===(o : Boolean) : Boolean = this <== o
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  abstract class AbstractString extends String {
    import Boolean._

    def ==(o : Any) : Boolean =
      o match {
        case o : String => value == o.value
        case _          => False
      }
    def !=(o : Any) : Boolean = !(this == o)
  }

  import language.implicitConversions

  implicit def b2dmlb(b : scala.Boolean) : Boolean = Boolean(b)
  implicit def dmlb2b(b : Boolean) : scala.Boolean = b.value
  implicit def i2dmli(n : scala.Int) : Int = Int(n)
  implicit def l2dmli(n : scala.Long) : Int = Int(n)
  implicit def bi2dmli(n : BigInt) : Int = Int(n)
  implicit def jbi2dmli(n : java.math.BigInteger) : Int = Int(n)
  implicit def s2dmli(n : java.lang.String) : Int = Int(n)
  implicit def i2dmli(n : Integer) : Int = Int(n)
  implicit def s2dmls(s : java.lang.String) : String = String(s)

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