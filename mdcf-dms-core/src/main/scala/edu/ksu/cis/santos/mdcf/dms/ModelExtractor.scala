/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms

import com.google.common.base.Optional
import com.google.common.reflect.ClassPath
import com.google.common.reflect.ClassPath.ClassInfo

import org.sireum.util._

import edu.ksu.cis.santos.mdcf.dms._

import edu.ksu.cis.santos.mdcf.dml._
import ast._
import Ast._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object ModelExtractor {
  import scala.collection.JavaConversions._
  import scala.reflect.runtime.universe._

  private final val SET_CLASS = classOf[scala.collection.immutable.Set[_]]
  private final val SEQ_CLASS = classOf[scala.collection.immutable.Seq[_]]

  def extractModel(packageNames : Array[String]) : Model =
    extract(packageNames : _*)

  def extractModel(cl : ClassLoader, packageNames : Array[String]) : Model =
    extract(cl, packageNames : _*)

  def extract(packageNames : String*) : Model =
    extract(getClass.getClassLoader, packageNames : _*)

  def extract(cl : ClassLoader, packageNames : String*) : Model = {

    var decls = ivectorEmpty[Declaration]

    for (p <- packageNames)
      for (ci <- ClassPath.from(cl).getTopLevelClasses(p))
        decls :+= extract(ci.load, None)

    model(decls)
  }

  def extract(clazz : java.lang.Class[_], obj : scala.Option[Object]) : Declaration = {
    val tipe = Reflection.getTypeOfClass(clazz)
    val ts = tipe.typeSymbol

    val isBasicType = classOf[prelude.Any].isAssignableFrom(clazz)
    val name = clazz.getName
    var isDevice = false
    var featureModifier = FeatureModifier.Unspecified
    var supers = ivectorEmpty[NamedType]
    var members = ivectorEmpty[Member]

    for (a <- ts.annotations.map(Reflection.annotation))
      a.clazz match {
        case c if c == classOf[annotation.Schema] =>
          featureModifier = FeatureModifier.Schema
        case c if c == classOf[annotation.Class] =>
          featureModifier = FeatureModifier.Class
        case c if c == classOf[annotation.Product] =>
          featureModifier = FeatureModifier.Product
        case c if c == classOf[annotation.Device] =>
          featureModifier = FeatureModifier.Product; isDevice = true
        case c if c == classOf[annotation.Instance] =>
          featureModifier = FeatureModifier.Instance
        case c if c == classOf[annotation.Data] =>
          featureModifier = FeatureModifier.Data
      }

    {
      val s : java.lang.Class[_] = clazz.getSuperclass
      if (s != null && s != classOf[java.lang.Object]) {
        supers :+= namedType(s.getName)
      }
    }

    for (i <- clazz.getInterfaces()) {
      supers :+= namedType(i.getName)
    }

    for (d <- tipe.declarations)
      extract(false, d, obj) match {
        case Some(m) => members :+= m
        case _       =>
      }

    Reflection.companion(clazz) match {
      case Some((companionSymbol, companion)) =>
        for (d <- companionSymbol.typeSignature.declarations)
          extract(true, d, Some(companion.asInstanceOf[Object])) match {
            case Some(m) => members :+= m
            case _       =>
          }
      case _ =>
    }

    if (isBasicType)
      basicType(name, supers)
    else if (isDevice)
      device(name, supers, members)
    else
      feature(featureModifier, name, supers, members)
  }

  def extract(isCompanion : Boolean, symbol : Symbol,
              obj : scala.Option[Object]) : scala.Option[Member] = {
    val name = symbol.name.decoded.trim

    var isInvariant = false
    var attributeModifier = AttributeModifier.None

    if (symbol.isOverride || symbol.isAbstractOverride)
      attributeModifier = AttributeModifier.Override
    else
      for (a <- symbol.annotations.map(Reflection.annotation))
        a.clazz match {
          case c if c == classOf[annotation.Const] =>
            import edu.ksu.cis.santos.mdcf.dms.annotation.ConstMode
            if (a.params.size == 0)
              attributeModifier = AttributeModifier.Const
            else
              a.params(0).value match {
                case ConstMode.SCHEMA =>
                  attributeModifier = AttributeModifier.ConstSchema
                case ConstMode.CLASS =>
                  attributeModifier = AttributeModifier.ConstClass
                case ConstMode.PRODUCT =>
                  attributeModifier = AttributeModifier.ConstProduct
                case ConstMode.INSTANCE =>
                  attributeModifier = AttributeModifier.ConstInstance
                case ConstMode.UNSPECIFIED =>
                  attributeModifier = AttributeModifier.Const
              }
          case c if c == classOf[annotation.Data] =>
            attributeModifier = AttributeModifier.Data
          case c if c == classOf[annotation.Inv] =>
            isInvariant = true
          case c if c == classOf[annotation.Settable] =>
            attributeModifier = AttributeModifier.Settable
        }

    if (isInvariant) {
      obj match {
        case Some(obj) =>
          val im = Reflection.mirror.reflect(obj)
          val value = im.reflectField(symbol.asTerm).get
          val result = invariant(name, value)
          Some(result)
        case _ =>
          sys.error(s"Ill-formed model: $name")
      }
    } else if (isCompanion) {
      None
    } else if (symbol.isTerm && (symbol.asTerm.isVal || symbol.asTerm.isGetter)) {
      val (attributeType, attributeInit) = extractAttributeTypeInit(symbol)
      val result = attribute(attributeModifier, attributeType, name, attributeInit)
      Some(result)
    } else {
      None
    }
  }

  def extractAttributeTypeInit(symbol : Symbol) : (ast.Type, Optional[Initialization]) = {
    val tipe = symbol.typeSignature
    val attributeType =
      tipe match {
        case mt : NullaryMethodType => extractType(mt.resultType)
        case _                      => extractType(tipe)
      }
    (attributeType, none()) // TODO
  }

  def extractType(tipe : Type) : ast.Type = {
    val clazz = Reflection.getClassOfType(tipe.erasure)
    val className = clazz.getName
    clazz match {
      case c if c == SET_CLASS =>
        val TypeRef(_, _, List(elementType)) = tipe
        setType(extractType(elementType))
      case c if c == SEQ_CLASS =>
        val TypeRef(_, _, List(elementType)) = tipe
        seqType(extractType(elementType))
      case c if className == "scala.util.Either" =>
        val TypeRef(_, _, List(leftType, rightType)) = tipe
        eitherType(list(extractType(leftType), extractType(rightType)))
      case c if c.getName.startsWith("scala.Tuple") =>
        val TypeRef(_, _, args) = tipe
        tupleType(args.map(extractType))
      case c =>
        namedType(c.getName)
    }
  }
}