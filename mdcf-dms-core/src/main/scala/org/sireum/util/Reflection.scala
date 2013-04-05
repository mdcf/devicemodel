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
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

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
  def companion[T](
    c : Class[T], processAnnotations : Boolean) : Option[(Symbol, Any, ISeq[Annotation])] = {
    val classSymbol = mirror.classSymbol(c)
    val companionSymbol = classSymbol.companionSymbol
    if (companionSymbol.isModule) {
      val moduleSymbol = companionSymbol.asModule
      val moduleMirror = mirror.reflectModule(moduleSymbol)
      Some((companionSymbol, moduleMirror.instance,
        if (processAnnotations)
          moduleSymbol.annotations.toVector.map(annotation)
        else ivectorEmpty))
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

  def classInits(tipe : Type, obj : Any,
                 includeInherited : Boolean) : IMap[String, Object] = {
    var result = imapEmpty[String, Object]
    for (
      d <- (if (includeInherited) tipe.members else tipe.declarations) // 
      if d.isTerm && (d.asTerm.isVal || d.asTerm.isVar)
    ) {
      val name = d.name.decoded.trim
      val im = Reflection.mirror.reflect(obj)
      val value = im.reflectField(d.asTerm).get.asInstanceOf[Object]
      result += (name -> value)
    }
    result
  }

  def traitInits(clazz : Class[_]) : IMap[String, Object] = {
    var cl = clazz.getClassLoader
    if (cl == null) {
      cl = ClassLoader.getSystemClassLoader
    }

    var init : Option[java.lang.reflect.Method] = None
    try {
      for (m <- cl.loadClass(clazz.getName + "$class").getMethods if init.isEmpty)
        if (m.getName == "$init$")
          init = Some(m)
    } catch {
      case e : Exception =>
    }

    if (init.isEmpty) return imapEmpty

    val encodedToDecodedSetterNameMap = mmapEmpty[String, String]

    for (m <- clazz.getDeclaredMethods()) {
      val setterPrefix = clazz.getName.replace('.', '$') + "$_setter_$"
      val encoded = m.getName
      if (encoded.startsWith(setterPrefix)) {
        val decoded = encoded.substring(setterPrefix.length, encoded.length - 4)
        encodedToDecodedSetterNameMap(encoded) = decoded
      }
    }

    var result = imapEmpty[String, Object]

    init.get.invoke(null, Proxy.newProxyInstance(cl, Array[Class[_]](clazz),
      new InvocationHandler {
        def invoke(proxy : Object,
                   method : java.lang.reflect.Method,
                   args : Array[Object]) = {
          encodedToDecodedSetterNameMap.get(method.getName) match {
            case Some(decodedName) => result += (decodedName -> args(0))
            case _                 =>
          }
          null
        }
      }))

    result
  }

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
