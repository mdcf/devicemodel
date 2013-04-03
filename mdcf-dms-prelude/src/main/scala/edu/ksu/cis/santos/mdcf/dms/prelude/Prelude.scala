/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.prelude

import edu.ksu.cis.santos.mdcf.dms.annotation._
import scala.reflect.runtime.{ universe => ru }

object Prelude {

  type Predicate[T] = ru.Expr[T => Boolean]

  trait Any extends Immutable {
    def ==(o : Any) : Boolean
    def !=(o : Any) : Boolean
  }

  object String {
    def apply(s : java.lang.String) = StringImpl(s)

    case class StringImpl(value : java.lang.String) extends AbstractString
  }

  trait String extends Any {
    def value : java.lang.String
    override def toString = value.toString
  }

  object Boolean {

    def apply(b : scala.Boolean) = if (b) True else False

    object True extends AbstractBoolean { def value = true }
    object False extends AbstractBoolean { def value = false }
  }

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

  object Int {

    def apply(n : scala.Int) = IntImpl(n)

    final case class IntImpl(value : scala.Int) extends AbstractInt {
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
  trait Int extends Number {
    def value : scala.Int
    final override def toString = value.toString
  }

  object Nat {
    def apply(n : scala.Int) =
      if (n < 0) NatImpl(-n) else NatImpl(n)

    final case class NatImpl(value : scala.Int) extends AbstractInt with Nat {
      def +(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value + o.value)
          case o : Int => i2dmli(this.value + o.value)
        }
      def -(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value - o.value)
          case o : Int => i2dmli(this.value - o.value)
        }
      def *(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value * o.value)
          case o : Int => i2dmli(this.value * o.value)
        }
      def /(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value / o.value)
          case o : Int => i2dmli(this.value / o.value)
        }
      def %(o : Number) : Int =
        o match {
          case o : Nat => Nat(this.value % o.value)
          case o : Int => i2dmli(this.value % o.value)
        }
    }
  }

  trait Nat extends Int {
    @Inv
    def `value is non-negative` = value >= 0
  }

  type Set[T] = scala.collection.immutable.Set[T]
  type Seq[T] = scala.collection.immutable.Seq[T]

  import language.implicitConversions

  implicit def b2dmlb(b : scala.Boolean) : Boolean = Boolean(b)
  implicit def dmlb2b(b : Boolean) : scala.Boolean = b.value
  implicit def i2dmli(n : scala.Int) : Int = Int(n)
  implicit def s2dmls(s : java.lang.String) : String = String(s)

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

  def pred[T](p : T => Boolean) : Predicate[T] = macro Prelude.predImpl[T]

  def predImpl[T : c.WeakTypeTag](c : scala.reflect.macros.Context)(
    p : c.Expr[T => Boolean]) : c.Expr[Predicate[T]] = {
    import c.universe._

    val Apply(rt, _) = (reify { ru.reify {} }).tree

    c.Expr[Predicate[T]](Apply(rt, List(p.tree)))
  }
}
