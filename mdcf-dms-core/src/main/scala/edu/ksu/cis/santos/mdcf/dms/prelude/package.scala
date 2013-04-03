/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms

import scala.reflect.runtime.{ universe => ru }

import org.sireum.util.math._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
package object prelude {

  type Predicate[T] = ru.Expr[T => Boolean]

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Any extends Immutable {
    def ==(o : Any) : Boolean
    def !=(o : Any) : Boolean
  }

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
  trait String extends Any {
    def value : java.lang.String
    override def toString = value.toString
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Boolean {

    def apply(b : scala.Boolean) = if (b) True else False

    object True extends AbstractBoolean { def value = true }
    object False extends AbstractBoolean { def value = false }
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Boolean extends Any {
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
    override def toString = value.toString
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait Number extends Any {
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

  import scala.language.experimental.macros

  def pred[T](p : T => Boolean) : Predicate[T] = macro predImpl[T]

  def predImpl[T : c.WeakTypeTag](c : scala.reflect.macros.Context)(
    p : c.Expr[T => Boolean]) : c.Expr[Predicate[T]] = {
    import c.universe._

    val Apply(rt, _) = (reify { ru.reify {} }).tree

    c.Expr[Predicate[T]](Apply(rt, List(p.tree)))
  }
}