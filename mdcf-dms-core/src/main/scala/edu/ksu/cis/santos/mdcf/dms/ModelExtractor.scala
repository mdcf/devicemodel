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

  trait Reporter {
    def error(message : java.lang.String)
    def warning(message : java.lang.String)
    def info(message : java.lang.String)
  }

  final val DEFAULT_REPORTER = new Reporter {
    def error(message : java.lang.String) {
      Console.err.println(message)
      Console.err.flush
    }

    def warning(message : java.lang.String) {
      Console.out.println(message)
      Console.out.flush
    }

    def info(message : java.lang.String) {
      Console.out.println(message)
      Console.out.flush
    }
  }

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
  private final val PRIMORDIAL_TYPES = Set[java.lang.String](
    classOf[Object].getName, classOf[Any].getName, classOf[BasicType].getName,
    classOf[Feature].getName)

  def extractModel(packageNames : Array[java.lang.String]) : Model =
    extract(Context(packageNames.toIterable))

  def extractModel(cl : ClassLoader,
                   packageNames : Array[java.lang.String]) : Model =
    extract(Context(packageNames.toIterable, classLoader = cl))

  def extractModel(reporter : Reporter,
                   packageNames : Array[java.lang.String]) : Model =
    extract(Context(packageNames.toIterable, reporter = reporter))

  def extractModel(reporter : Reporter, cl : ClassLoader,
                   packageNames : Array[java.lang.String]) : Model =
    extract(Context(packageNames.toIterable, reporter, cl))

  final case class Context(
      packageNames : Traversable[java.lang.String],
      reporter : Reporter = DEFAULT_REPORTER,
      classLoader : ClassLoader = getClass.getClassLoader match {
        case null=> ClassLoader.getSystemClassLoader
        case cl=> cl
      }) {
    def basicTypeClass = classLoader.loadClass(classOf[BasicType].getName)
    def featureClass = classLoader.loadClass(classOf[Feature].getName)
  }

  def extract(implicit context : Context) : Model = {
    var decls = ivectorEmpty[Declaration]

    val pkgModifier = mmapEmpty[java.lang.String, FM]

    var size = 0
    for (p <- context.packageNames) {
      val cp = ClassPath.from(context.classLoader)
      val cis = cp.getTopLevelClassesRecursive(p)
      size += cis.size
      for (ci <- cis) {
        val clazz = ci.load
        if (!clazz.getName.endsWith(".package-info")) {
          val pkg = clazz.getPackage
          val pkgName = pkg.getName
          decls :+= extract(pkgModifier.getOrElseUpdate(pkgName, {
            var pm = FM(FeatureModifier.Unspecified, false)
            var isReq = false
            for (a <- pkg.getAnnotations) {
              pm = extractFeatureModifier(pkgName, a.getClass, true)
            }
            pm
          }), clazz,
            imapEmpty[java.lang.String, Object])
        }
      }
    }

    if (size == 0) {
      context.reporter.warning("Could not find any class in the provided " +
        s"packages ${context.packageNames.toVector}; " +
        "perhaps a classpath setting issue?")
    }

    model(decls)
  }

  private final case class FM(
    featureModifier : FeatureModifier, isReq : scala.Boolean)

  private def extractFeatureModifier(
    entityName : java.lang.String, clazz : java.lang.Class[_],
    allowReq : scala.Boolean)(implicit context : Context) : FM = {
    val name =
      if (!clazz.isInterface) clazz.getInterfaces()(0).getName
      else clazz.getName
    name match {
      case `SCHEMA_NAME`          => FM(FeatureModifier.Schema, false)
      case `CLASS_NAME`           => FM(FeatureModifier.Class, false)
      case `PRODUCT_NAME`         => FM(FeatureModifier.Product, false)
      case `DEVICE_NAME`          => FM(FeatureModifier.Device, false)
      case `INSTANCE_NAME`        => FM(FeatureModifier.Instance, false)
      case `DATA_NAME`            => FM(FeatureModifier.Data, false)
      case `REQ_NAME` if allowReq => FM(FeatureModifier.Unspecified, true)
      case c =>
        context.reporter.warning(
          s"Unexpected annotation $c for $entityName; only Schema, Class, " +
            "Product, Device, Instance, and Data are allowed.")
        FM(FeatureModifier.Unspecified, false)
    }
  }

  private def extract(
    fm : FM, clazz : java.lang.Class[_],
    inits : IMap[java.lang.String, Object])(
      implicit context : Context) : Declaration = {
    val tipe = Reflection.getTypeOfClass(clazz)
    val ts = tipe.typeSymbol
    val name = clazz.getName

    val objInits =
      if (!inits.isEmpty) inits
      else if (ts.asClass.isTrait) Reflection.traitInits(clazz)
      else
        try Reflection.classInits(tipe, clazz.newInstance, false)
        catch { case e : Exception => imapEmpty[java.lang.String, Object] }

    var featureModifier = fm.featureModifier
    var isReq = fm.isReq
    var supers = ivectorEmpty[NamedType]
    var members = ivectorEmpty[Member]

    for (a <- ts.annotations.map(Reflection.annotation(_))) {
      val cfm = extractFeatureModifier(name, a.clazz, false)
      featureModifier = cfm.featureModifier
    }

    {
      val s : java.lang.Class[_] = clazz.getSuperclass
      if (s != null && s.getName != OBJECT_NAME) {
        supers :+= namedType(s.getName)
      }

      for (i <- clazz.getInterfaces() if !PRIMORDIAL_TYPES.contains(i.getName))
        supers :+= namedType(i.getName)
    }

    val isBasicType = {
      val isBasic = context.basicTypeClass.isAssignableFrom(clazz)
      val isFeature = context.featureClass.isAssignableFrom(clazz)
      (isBasic, isFeature) match {
        case (true, false) => true
        case (false, true) => false
        case (true, true) =>
          context.reporter.warning(
            s"$name cannot be both a basic type and a feature; " +
              "assuming it is a feature.")
          false
        case (false, false) =>
          if (!isReq)
            context.reporter.warning(
              s"Could not determine whether $name is a basic " +
                "type or a feature; assuming it is a feature.")
          false
      }
    }

    if (isBasicType)
      basicType(name, supers)
    else {
      var memberSet = isetEmpty[java.lang.String]
      for (d <- tipe.declarations.sorted)
        extract(name, false, d, objInits) match {
          case Some(m) =>
            if (!memberSet.contains(m.name)) {
              memberSet += m.name
              members :+= m
            }
          case _ =>
        }

      Reflection.companion(clazz, true) match {
        case Some((companionSymbol, companion, annotations)) =>
          val companionInits =
            Reflection.classInits(companionSymbol.typeSignature,
              companion.asInstanceOf[Object], false)
          for (a <- annotations) {
            a.clazz.getName match {
              case `REQ_NAME` => isReq = true
              case c =>
                context.reporter.warning(
                  s"Unexpected annotation $c for $name companion; " +
                    "only Req is allowed.")
            }
          }
          for (d <- companionSymbol.typeSignature.declarations.sorted)
            extract(name, true, d, companionInits) match {
              case Some(m) => members :+= m
              case _       =>
            }
        case _ =>
      }

      if (isReq)
        requirement(name, members.map { _.asInstanceOf[Invariant] })
      else
        feature(featureModifier, name, supers, members)
    }
  }

  private def extract(
    owner : java.lang.String, isCompanion : scala.Boolean, symbol : Symbol,
    inits : IMap[java.lang.String, Object])(
      implicit context : Context) : scala.Option[Member] = {
    val aName = symbol.name.decoded.trim
    val aQName = owner + '.' + aName

    var isInvariant = false
    var aModifier = AttributeModifier.None

    if (symbol.isOverride || symbol.isAbstractOverride)
      aModifier = AttributeModifier.Override
    else
      for (a <- symbol.annotations.map(Reflection.annotation(_)))
        a.clazz.getName match {
          case `CONST_NAME` =>
            if (a.params.size == 0)
              aModifier = AttributeModifier.Const
            else
              a.params(0).value match {
                case SCHEMA      => aModifier = AttributeModifier.ConstSchema
                case CLASS       => aModifier = AttributeModifier.ConstClass
                case PRODUCT     => aModifier = AttributeModifier.ConstProduct
                case INSTANCE    => aModifier = AttributeModifier.ConstInstance
                case UNSPECIFIED => aModifier = AttributeModifier.Const
              }
          case `DATA_NAME`     => aModifier = AttributeModifier.Data
          case `INV_NAME`      => isInvariant = true
          case `SETTABLE_NAME` => aModifier = AttributeModifier.Settable
          case c =>
            context.reporter.warning(
              s"Unexpected annotation $c for $aQName; " +
                "only Const, Data, Inv, and Settable are allowed.")
        }

    if (isInvariant) {
      inits.get(aName) match {
        case Some(value) =>
          val valueClass = value.getClass
          if (valueClass.getName != "scala.reflect.api.Exprs$ExprImpl") {
            context.reporter.warning(
              s"Not permitted invariant type $valueClass for $aQName")
            None
          } else
            Some(invariant(aName, value))
        case _ =>
          context.reporter.error(s"Ill-formed model: $aQName")
          None
      }
    } else if (isCompanion) {
      None
    } else if (symbol.isTerm && (symbol.asTerm.isGetter || symbol.asTerm.isVal)) {
      val (aType, aInit) =
        extractAttributeTypeInit(aQName, aName, symbol, inits)
      val result = attribute(aModifier, aType, aName, aInit)
      Some(result)
    } else {
      None
    }
  }

  private def extractAttributeTypeInit(
    aQName : java.lang.String, aName : java.lang.String, symbol : Symbol,
    inits : IMap[java.lang.String, Object])(
      implicit context : Context) : (ast.Type, Optional[Initialization]) =
    extractType(aQName, symbol.typeSignature match {
      case NullaryMethodType(resultType) => resultType
      case tipe                          => tipe
    }, inits.get(aName))

  private def extractType(
    aQName : java.lang.String, tipe : Type, value : Option[scala.Any])(
      implicit context : Context) : (ast.Type, Optional[Initialization]) = {
    val clazz = Reflection.getClassOfType(tipe.erasure)
    clazz.getName match {
      case `OPTION_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        (value : @unchecked) match {
          case Some(o : Option[_]) =>
            val (eType, init) = extractType(aQName, elementType, o)
            val resultType = optionType(eType)
            if (init.isPresent)
              (resultType, some(someInit(init.get)))
            else
              (resultType, some(noneInit))
          case None =>
            val (eType, _) = extractType(aQName, elementType, None)
            (optionType(eType), none())
        }
      case `EITHER_NAME` =>
        val TypeRef(_, _, List(leftTipe, rightTipe)) = tipe
        (value : @unchecked) match {
          case Some(Left(value)) =>
            val (leftType, init) = extractType(aQName, leftTipe, Some(value))
            val (rightType, _) = extractType(aQName, rightTipe, None)
            val resultType = eitherType(list(leftType, rightType))
            if (init.isPresent) (resultType, some(eitherInit(0, init.get)))
            else (resultType, none())
          case Some(Right(value)) =>
            val (leftType, _) = extractType(aQName, leftTipe, None)
            val (rightType, init) = extractType(aQName, rightTipe, Some(value))
            val resultType = eitherType(list(leftType, rightType))
            if (init.isPresent) (resultType, some(eitherInit(1, init.get)))
            else (resultType, none())
          case None =>
            val (leftType, _) = extractType(aQName, leftTipe, None)
            val (rightType, _) = extractType(aQName, rightTipe, None)
            (eitherType(list(leftType, rightType)), none())
        }
      case c if c.startsWith("scala.Tuple") =>
        val TypeRef(_, _, args) = tipe
        (value : @unchecked) match {
          case Some(o : scala.Product) =>
            var success = true
            var elementTypes = ilistEmpty[ast.Type]
            var inits = ilistEmpty[Initialization]
            for (i <- 0 until args.length if success) {
              val (eType, eInit) =
                extractType(aQName, args(i), Some(o.productElement(i)))
              elementTypes = eType :: elementTypes
              if (!eInit.isPresent) success = false
              else inits = eInit.get :: inits
            }
            val resultType = tupleType(elementTypes.reverse)
            if (success) (resultType, some(tupleInit(inits.reverse)))
            else (resultType, none())
          case None =>
            (tupleType(args.map { extractType(aQName, _, None)._1 }), none())
        }
      case `SET_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        val (eType, _) = extractType(aQName, elementType, None)
        val resultType = setType(eType)
        (value : @unchecked) match {
          case Some(s : ISet[_]) =>
            val inits = s.map(x => extractType(aQName, elementType, Some(x))._2)
            if (inits.exists(!_.isPresent)) (resultType, none())
            else (resultType, some(setInit(inits.toSeq.map(_.get))))
          case None =>
            (resultType, none())
        }
      case `SEQ_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        val (eType, _) = extractType(aQName, elementType, None)
        val resultType = seqType(eType)
        (value : @unchecked) match {
          case Some(s : ISeq[_]) =>
            val inits = s.map(x => extractType(aQName, elementType, Some(x))._2)
            if (inits.exists(!_.isPresent)) (resultType, none())
            else (resultType, some(setInit(inits.map(_.get))))
          case None =>
            (resultType, none())
        }
      case c if clazz.isPrimitive || clazz.isEnum || clazz.isArray ||
        clazz.isAnnotation || clazz.isSynthetic || c.startsWith("scala.") ||
        c.startsWith("java.") =>
        context.reporter.error(
          s"Not permitted type $c for $aQName; only feature, scala.Option, " +
            "scala.Either, scala.Tuple<N>, Set, Seq, or subtypes of basic " +
            "types are allowed.")
        (namedType("Error"), none())
      case c if context.basicTypeClass.isAssignableFrom(clazz) =>
        (value : @unchecked) match {
          case Some(value : BasicType) =>
            (namedType(c), some(basicInit(value.asString)))
          case None =>
            (namedType(c), none())
        }
      case c =>
        tipe match {
          case RefinedType(parents, decls) =>
            var success = true
            val types = filterType(aQName, parents)
            var inits = imapEmpty[java.lang.String, Object]
            var aTypes = imapEmpty[java.lang.String, Type]
            value match {
              case Some(value) =>
                val vClass = value.getClass
                for (d <- tipe.members if d.isTerm && d.asTerm.isGetter) {
                  val dName = d.name.encoded.trim
                  val dValue = vClass.getMethod(d.name.encoded).invoke(value)
                  inits += (dName -> dValue)
                  aTypes += (dName -> d.asTerm.typeSignature)
                }
              case None =>
            }
            var attributes = ivectorEmpty[Attribute]
            for (d <- tipe.declarations.sorted if d.isTerm && d.asTerm.isGetter)
              extract(aQName, false, d,
                imapEmpty[java.lang.String, Object]) match {
                  case Some(a : Attribute) => attributes :+= a
                  case Some(m) =>
                    context.reporter.error(
                      s"Expecting attribute for $aQName, " +
                        s"but found ${m.getClass}.")
                  case _ =>
                }

            val resultType =
              if (types.size > 1 || attributes.size > 0)
                Ast.refinedType(types, attributes)
              else namedType(types(0).name)

            value match {
              case Some(_) =>
                var attributeInits = ivectorEmpty[Attribute]
                for (d <- tipe.members.sorted if d.isTerm && d.asTerm.isGetter)
                  extract(aQName, false, d, inits) match {
                    case Some(a : Attribute) =>
                      val NullaryMethodType(dType) = d.typeSignature
                      if (isOverride(a.name, dType, parents))
                        attributeInits :+= attribute(AttributeModifier.Override,
                          a.`type`, a.name, a.init)
                      else
                        attributeInits :+= a
                    case Some(m) =>
                      context.reporter.error(
                        s"Expecting attribute for $aQName initialization, " +
                          s"but found ${m.getClass}.")
                    case _ =>
                  }
                (resultType, some(featureInit(types, attributeInits)))
              case _ => (resultType, none())
            }
          case _ =>
            value match {
              case Some(value) =>
                val vClass = value.getClass
                val vTipe = Reflection.getTypeOfClass(vClass)
                var inits = imapEmpty[java.lang.String, Object]
                for (d <- vTipe.declarations if d.isTerm && d.asTerm.isVal) {
                  val dName = d.name.encoded.trim
                  val dValue = vClass.getMethod(d.name.encoded).invoke(value)
                  inits += (dName -> dValue)
                }
                var attributes = ivectorEmpty[Attribute]
                var aTypes = imapEmpty[java.lang.String, Type]
                for (d <- vTipe.declarations.sorted if d.isTerm && d.asTerm.isVal)
                  extract(aQName, false, d, inits) match {
                    case Some(a : Attribute) =>
                      attributes :+= a
                      aTypes += (a.name -> d.typeSignature)
                    case Some(m) =>
                      context.reporter.error(
                        s"Expecting attribute for $aQName initialization, " +
                          s"but found ${m.getClass}.")
                    case _ =>
                  }
                val resultType = namedType(c)
                vTipe match {
                  case RefinedType(parents, _) =>
                    (resultType,
                      some(featureInit(filterType(aQName, parents),
                        attributes.map { a =>
                          if (a.modifier != AttributeModifier.Override &&
                            isOverride(a.name, aTypes(a.name), parents))
                            attribute(AttributeModifier.Override, a.`type`,
                              a.name, a.init)
                          else
                            a
                        })))
                  case TypeRef(pre, sym, _) =>
                    val interfaces = Reflection.getClassOfType(vTipe).
                      getInterfaces.toVector
                    val types = interfaces.map(x => namedType(x.getName))
                    val itypes = interfaces.map(Reflection.getTypeOfClass(_))
                    (resultType,
                      some(featureInit(types, attributes.map { a =>
                        if (a.modifier != AttributeModifier.Override &&
                          isOverride(a.name, aTypes(a.name), itypes))
                          attribute(AttributeModifier.Override, a.`type`,
                            a.name, a.init)
                        else
                          a
                      })))
                }
              case None =>
                (namedType(c), none())
            }
        }
    }
  }

  private def filterType(aQName : java.lang.String, l : List[Type])(
    implicit context : Context) : ISeq[NamedType] = {
    l.flatMap {
      _ match {
        case TypeRef(_, sym, _) =>
          val name = sym.name.decoded
          if (name == "AnyRef") None
          else Some(namedType(name))
        case t =>
          context.reporter.error(
            s"Unexpected type $t for $aQName initialization.")
          None
      }
    }
  }

  private def isOverride(aName : java.lang.String, aType : Type,
                         types : ISeq[Type]) : scala.Boolean = {
    for (t <- types) {
      for (m <- t.members if m.isTerm && (m.asTerm.isGetter || m.asTerm.isVal)) {
        val mType =
          if (m.asTerm.isGetter) {
            val NullaryMethodType(mType) = m.typeSignature
            mType
          } else m.typeSignature
        if (aName == m.name.decoded.trim && aType <:< mType)
          return true
      }
    }
    false
  }
}