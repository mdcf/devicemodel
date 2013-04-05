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

  private final val OBJECT_NAME = classOf[java.lang.Object].getName
  private final val OPTION_NAME = classOf[scala.Option[_]].getName
  private final val EITHER_NAME = classOf[scala.Either[_, _]].getName
  private final val SET_NAME = classOf[scala.collection.immutable.Set[_]].getName
  private final val SEQ_NAME = classOf[scala.collection.immutable.Seq[_]].getName
  private final val SCHEMA_NAME = classOf[annotation.Schema].getName
  private final val CLASS_NAME = classOf[annotation.Class].getName
  private final val PRODUCT_NAME = classOf[annotation.Product].getName
  private final val DEVICE_NAME = classOf[annotation.Device].getName
  private final val INSTANCE_NAME = classOf[annotation.Instance].getName
  private final val DATA_NAME = classOf[annotation.Data].getName
  private final val REQ_NAME = classOf[annotation.Req].getName
  private final val CONST_NAME = classOf[annotation.Const].getName
  private final val INV_NAME = classOf[annotation.Inv].getName
  private final val SETTABLE_NAME = classOf[annotation.Settable].getName

  def extractModel(packageNames : Array[java.lang.String]) : Model =
    extract(packageNames : _*)

  def extractModel(cl : ClassLoader,
                   packageNames : Array[java.lang.String]) : Model =
    extract(cl, packageNames : _*)

  def extract(packageNames : java.lang.String*) : Model = {
    val cl = getClass.getClassLoader
    extract(
      if (cl == null) ClassLoader.getSystemClassLoader else cl,
      packageNames : _*)
  }

  def extract(cl : ClassLoader, packageNames : java.lang.String*) : Model = {
    var decls = ivectorEmpty[Declaration]

    for (p <- packageNames)
      for (ci <- ClassPath.from(cl).getTopLevelClasses(p))
        decls :+= extract(ci.load, imapEmpty[java.lang.String, Object])

    model(decls)
  }

  def extract(clazz : java.lang.Class[_],
              inits : IMap[java.lang.String, Object]) : Declaration = {
    val tipe = Reflection.getTypeOfClass(clazz)
    val ts = tipe.typeSymbol
    val name = clazz.getName

    val objInits =
      if (!inits.isEmpty) inits
      else if (ts.asClass.isTrait) Reflection.traitInits(clazz)
      else
        try Reflection.classInits(tipe, clazz.newInstance, false)
        catch { case e : Exception => imapEmpty[java.lang.String, Object] }

    val isBasicType = classOf[BasicType].isAssignableFrom(clazz)
    var isDevice = false
    var featureModifier = FeatureModifier.Unspecified
    var supers = ivectorEmpty[NamedType]
    var members = ivectorEmpty[Member]

    for (a <- ts.annotations.map(Reflection.annotation))
      a.clazz.getName match {
        case `SCHEMA_NAME` =>
          featureModifier = FeatureModifier.Schema
        case `CLASS_NAME` =>
          featureModifier = FeatureModifier.Class
        case `PRODUCT_NAME` =>
          featureModifier = FeatureModifier.Product
        case `DEVICE_NAME` =>
          featureModifier = FeatureModifier.Product; isDevice = true
        case `INSTANCE_NAME` =>
          featureModifier = FeatureModifier.Instance
        case `DATA_NAME` =>
          featureModifier = FeatureModifier.Data
      }

    {
      val s : java.lang.Class[_] = clazz.getSuperclass
      if (s != null && s.getName != OBJECT_NAME) {
        supers :+= namedType(s.getName)
      }
    }

    for (i <- clazz.getInterfaces()) {
      supers :+= namedType(i.getName)
    }

    for (d <- tipe.declarations)
      extract(false, d, objInits) match {
        case Some(m) => members :+= m
        case _       =>
      }

    var isReq = false
    Reflection.companion(clazz, true) match {
      case Some((companionSymbol, companion, annotations)) =>
        val companionInits =
          Reflection.classInits(companionSymbol.typeSignature,
            companion.asInstanceOf[Object], false)
        for (a <- annotations) {
          a.clazz.getName match {
            case `REQ_NAME` => isReq = true
          }
        }
        for (d <- companionSymbol.typeSignature.declarations)
          extract(true, d, companionInits) match {
            case Some(m) => members :+= m
            case _       =>
          }
      case _ =>
    }

    if (isBasicType)
      basicType(name, supers)
    else if (isDevice)
      device(name, supers, members)
    else if (isReq)
      requirement(name, members.map { _.asInstanceOf[Invariant] })
    else
      feature(featureModifier, name, supers, members)
  }

  def extract(isCompanion : Boolean, symbol : Symbol,
              inits : IMap[java.lang.String, Object]) : scala.Option[Member] = {
    val name = symbol.name.decoded.trim

    var isInvariant = false
    var attributeModifier = AttributeModifier.None

    if (symbol.isOverride || symbol.isAbstractOverride)
      attributeModifier = AttributeModifier.Override
    else
      for (a <- symbol.annotations.map(Reflection.annotation))
        a.clazz.getName match {
          case `CONST_NAME` =>
            if (a.params.size == 0)
              attributeModifier = AttributeModifier.Const
            else
              a.params(0).value match {
                case SCHEMA =>
                  attributeModifier = AttributeModifier.ConstSchema
                case CLASS =>
                  attributeModifier = AttributeModifier.ConstClass
                case PRODUCT =>
                  attributeModifier = AttributeModifier.ConstProduct
                case INSTANCE =>
                  attributeModifier = AttributeModifier.ConstInstance
                case UNSPECIFIED =>
                  attributeModifier = AttributeModifier.Const
              }
          case `DATA_NAME` =>
            attributeModifier = AttributeModifier.Data
          case `INV_NAME` =>
            isInvariant = true
          case `SETTABLE_NAME` =>
            attributeModifier = AttributeModifier.Settable
        }

    if (isInvariant) {
      inits.get(name) match {
        case Some(value) =>
          val valueClass = value.getClass
          if (valueClass.getName != "scala.reflect.api.Exprs$ExprImpl")
            sys.error(s"Not permitted invariant type: $valueClass")
          Some(invariant(name, value))
        case _ =>
          sys.error(s"Ill-formed model: $name")
      }
    } else if (isCompanion) {
      None
    } else if (symbol.isTerm && symbol.asTerm.isGetter) {
      val (attributeType, attributeInit) = extractAttributeTypeInit(symbol, inits)
      val result = attribute(attributeModifier, attributeType, name, attributeInit)
      Some(result)
    } else {
      None
    }
  }

  def extractAttributeTypeInit(
    symbol : Symbol,
    inits : IMap[java.lang.String, Object]) : (ast.Type, Optional[Initialization]) = {
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
    clazz.getName match {
      case `OPTION_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        optionType(extractType(elementType))
      case `EITHER_NAME` =>
        val TypeRef(_, _, List(leftType, rightType)) = tipe
        eitherType(list(extractType(leftType), extractType(rightType)))
      case c if c.startsWith("scala.Tuple") =>
        val TypeRef(_, _, args) = tipe
        tupleType(args.map(extractType))
      case `SET_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        setType(extractType(elementType))
      case `SEQ_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        seqType(extractType(elementType))
      case c if clazz.isPrimitive || clazz.isEnum || clazz.isArray ||
        clazz.isAnnotation || clazz.isSynthetic || c.startsWith("scala.") ||
        c.startsWith("java.") =>
        sys.error(
          s"Not permitted type: $c; only feature, option, " +
            "either, tuple, set, seq, or subtypes of prelude's String, Int, " +
            "or Nat are allowed.")
      case c =>
        namedType(c)
    }
  }
}