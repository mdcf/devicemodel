/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.util

import java.io.File
import java.net.URLClassLoader

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object Reflection {
  import scala.reflect.runtime.universe._

  val classLoader = {
    val classpaths = System.getProperty("java.class.path").split(File.pathSeparatorChar)
    val urls = classpaths.map(new File(_).toURI.toURL)
    new URLClassLoader(urls)
  }

  val mirror = runtimeMirror(classLoader)

  val booleanType = typeOf[Boolean]
  val charType = typeOf[Character]
  val shortType = typeOf[Short]
  val intType = typeOf[Int]
  val longType = typeOf[Long]
  val floatType = typeOf[Float]
  val doubleType = typeOf[Double]
  val bigIntType = typeOf[BigInt]
  val integerType = typeOf[org.sireum.util.math.Integer]
  val stringType = typeOf[String]

  def eval[T](expr : String,
              m : Mirror = mirror) = {
    import scala.tools.reflect.ToolBox

    val tb = m.mkToolBox()
    tb.eval(tb.parse(expr)).asInstanceOf[T]
  }

  def evalExpr[T](expr : Expr[T],
                  m : Mirror = mirror) = {

    import scala.tools.reflect.ToolBox

    val tb = m.mkToolBox()
    tb.eval(expr.tree).asInstanceOf[T]
  }

  def parse(expr : String,
            m : Mirror = mirror) : Tree = {
    import scala.tools.reflect.ToolBox

    val tb = m.mkToolBox()
    tb.parse(expr)
  }

  def ast(expr : String,
          m : Mirror = mirror) : Tree = {
    import scala.tools.reflect.ToolBox

    val tb = m.mkToolBox()
    tb.typeCheck(tb.parse(expr))
  }

  def reify[T](expr : String,
               m : Mirror = mirror) : T = {
    import scala.tools.reflect.ToolBox

    eval[T](s"{ import scala.reflect.runtime.universe._; reify { $expr } }", m)
  }

  @inline
  def classMirror(c : Class[_]) : ClassMirror = {
    mirror.reflectClass(mirror.classSymbol(c))
  }

  @inline
  def companion[T](c : Class[T]) : Option[(Symbol, Any)] = {
    val classSymbol = mirror.classSymbol(c)
    val companionSymbol = classSymbol.companionSymbol
    if (companionSymbol.isModule) {
      val moduleSymbol = companionSymbol.asModule
      val moduleMirror = mirror.reflectModule(moduleSymbol)
      Some((companionSymbol, moduleMirror.instance))
    } else None
  }

  @inline
  def fullName(t : Type) = t.typeSymbol.fullName

  @inline
  def constructor(t : Type) = t.declaration(nme.CONSTRUCTOR).asMethod

  @inline
  def getType(o : Any) : Type = {
    val os = mirror.reflect(o).symbol
    os.asType.toType
  }

  @inline
  def getTypeOfClass(c : Class[_]) : Type =
    mirror.classSymbol(c).toType

  @inline
  def getClassOfType(t : Type) : Class[_] =
    mirror.runtimeClass(t.typeSymbol.asClass)

  def annotation(
    a : scala.reflect.runtime.universe.Annotation) : Annotation = {
    require(a.scalaArgs.isEmpty)

    val clazz = getClassOfType(a.tpe)
    var args = ivectorEmpty[AnnotationArg]
    for (arg <- a.javaArgs)
      arg match {
        case (n, a2 : scala.reflect.runtime.universe.Annotation) =>
          args :+= AnnotationArg(n.decoded, annotation(a2))
        case (n, arg) =>
          args :+= AnnotationArg(n.decoded, annArgument(arg))
      }

    assert(classOf[java.lang.annotation.Annotation].isAssignableFrom(clazz))
    Annotation(clazz.asInstanceOf[Class[java.lang.annotation.Annotation]], args)
  }

  private def annArgument(arg : JavaArgument) : Any = {
    arg match {
      case ArrayArgument(a) =>
        a.map(annArgument)
      case LiteralArgument(Constant(v : Type)) =>
        mirror.runtimeClass(v)
      case LiteralArgument(Constant(v : Symbol)) =>
        val c = v.owner.asClass
        mirror.runtimeClass(c).
          getDeclaredField(v.name.toString).get(null)
      case LiteralArgument(Constant(v)) =>
        v
    }
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  case class Annotation(
    clazz : Class[java.lang.annotation.Annotation],
    params : ISeq[AnnotationArg])

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  case class AnnotationArg(
    name : String,
    value : Any)
}
