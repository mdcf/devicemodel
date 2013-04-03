/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.util

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object Reflection {
  import scala.reflect.runtime.universe._

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
              m : Mirror = scala.reflect.runtime.currentMirror) = {
    import scala.tools.reflect.ToolBox

    val tb = m.mkToolBox()
    tb.eval(tb.parse(expr)).asInstanceOf[T]
  }

  def evalExpr[T](expr : Expr[T],
                  m : Mirror = scala.reflect.runtime.currentMirror) = {

    import scala.tools.reflect.ToolBox

    val tb = m.mkToolBox()
    tb.eval(expr.tree).asInstanceOf[T]
  }

  def parse(expr : String,
            m : Mirror = scala.reflect.runtime.currentMirror) : Tree = {
    import scala.tools.reflect.ToolBox

    val tb = m.mkToolBox()
    tb.parse(expr)
  }

  def ast(expr : String,
          m : Mirror = scala.reflect.runtime.currentMirror) : Tree = {
    import scala.tools.reflect.ToolBox

    val tb = m.mkToolBox()
    tb.typeCheck(tb.parse(expr))
  }

  def reify[T](expr : String,
               m : Mirror = scala.reflect.runtime.currentMirror) : T = {
    import scala.tools.reflect.ToolBox

    eval[T](s"{ import scala.reflect.runtime.universe._; reify { $expr } }", m)
  }

  @inline
  def mirror[T](t : T) : Mirror = mirror(t.getClass)

  @inline
  def mirror[T](c : Class[T]) : Mirror = runtimeMirror(c.getClassLoader)

  @inline
  def classMirror(c : Class[_]) : ClassMirror = {
    val m = mirror(c)
    m.reflectClass(m.classSymbol(c))
  }

  @inline
  def fullName(t : Type) = t.typeSymbol.fullName

  @inline
  def constructor(t : Type) = t.declaration(nme.CONSTRUCTOR).asMethod

  @inline
  def getType(o : Any) : Type = {
    val os = mirror(o).reflect(o).symbol
    os.asType.toType
  }

  @inline
  def getTypeOfClass(c : Class[_]) : Type =
    mirror(c).classSymbol(c).toType

  @inline
  def getClassOfType(t : Type) : Class[_] =
    scala.reflect.runtime.currentMirror.runtimeClass(t.typeSymbol.asClass)

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
    import scala.reflect.runtime.currentMirror
    arg match {
      case ArrayArgument(a) =>
        a.map(annArgument)
      case LiteralArgument(Constant(v : Type)) =>
        currentMirror.runtimeClass(v)
      case LiteralArgument(Constant(v : Symbol)) =>
        val c = v.owner.asClass
        currentMirror.runtimeClass(c).
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
