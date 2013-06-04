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
  type Multiplicity = edu.ksu.cis.santos.mdcf.dms.annotation.Multiplicity @getter @setter
  type Product = edu.ksu.cis.santos.mdcf.dms.annotation.Product @getter @setter
  type Req = edu.ksu.cis.santos.mdcf.dms.annotation.Req @getter @setter
  type Schema = edu.ksu.cis.santos.mdcf.dms.annotation.Schema @getter @setter
  type Settable = edu.ksu.cis.santos.mdcf.dms.annotation.Settable @getter @setter

  final val SCHEMA = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.SCHEMA
  final val CLASS = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.CLASS
  final val PRODUCT = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.PRODUCT
  final val INSTANCE = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.INSTANCE
  final val UNSPECIFIED = edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode.UNSPECIFIED

  final val * = -1

  type Map[K, V] = scala.collection.immutable.Map[K, V]
  type Set[T] = scala.collection.immutable.Set[T]
  type Seq[T] = scala.collection.immutable.Seq[T]

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  trait BasicType {
    def value : scala.Any
    def ==(o : BasicType) : Boolean = Boolean(value == o.value)
    def !=(o : BasicType) : Boolean = Boolean(value != o.value)
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
  trait Feature {
    final override def toString = s"feature ${getClass.getName}"
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  final class Boolean(val value : scala.Boolean) {
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

  import language.implicitConversions

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object Boolean {
    final val TRUE = new Boolean(true)
    final val FALSE = new Boolean(false)

    implicit def apply(b : scala.Boolean) = if (b) TRUE else FALSE
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