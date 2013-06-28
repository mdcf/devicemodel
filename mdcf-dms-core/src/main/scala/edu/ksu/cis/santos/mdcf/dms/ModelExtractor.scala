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
import exp._
import edu.ksu.cis.santos.mdcf.dml.util._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object ModelExtractor {

  final val DEFAULT_REPORTER = new ConsoleReporter

  import scala.collection.JavaConversions._
  import scala.reflect.runtime.universe._

  private final val ANY_NAME = classOf[scala.Any].getName
  private final val OBJECT_NAME = classOf[java.lang.Object].getName
  private final val OPTION_NAME = classOf[scala.Option[_]].getName
  private final val EITHER_NAME = classOf[scala.Either[_, _]].getName
  private final val MAP_NAME = classOf[scala.collection.immutable.Map[_, _]].getName
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
  private final val MULTIPLICITY_NAME = classOf[annotation.Multiplicity].getName
  private final val SETTABLE_NAME = classOf[annotation.Settable].getName
  private final val PRIMORDIAL_TYPES = Set[String](
    classOf[Object].getName, classOf[Any].getName, classOf[BasicType].getName,
    classOf[Feature].getName)

  def extractModel(packageNames : Array[String]) : Model =
    extract(Context(packageNames = packageNames))

  def extractModel(cl : ClassLoader,
                   packageNames : Array[String]) : Model =
    extract(Context(
      packageNames = packageNames,
      classLoader = cl))

  def extractModel(reporter : Reporter,
                   packageNames : Array[String]) : Model =
    extract(Context(
      packageNames = packageNames,
      reporter = reporter))

  def extractModel(reporter : Reporter, cl : ClassLoader,
                   packageNames : Array[String]) : Model =
    extract(Context(
      packageNames = packageNames,
      reporter = reporter,
      classLoader = cl))

  def extractModel(packageNames : Array[String],
                   classNames : Array[String]) : Model =
    extract(Context(
      packageNames = packageNames,
      classNames = classNames))

  def extractModel(cl : ClassLoader,
                   packageNames : Array[String],
                   classNames : Array[String]) : Model =
    extract(Context(
      packageNames = packageNames,
      classLoader = cl,
      classNames = classNames))

  def extractModel(reporter : Reporter,
                   packageNames : Array[String],
                   classNames : Array[String]) : Model =
    extract(Context(
      packageNames = packageNames,
      reporter = reporter,
      classNames = classNames))

  def extractModel(reporter : Reporter, cl : ClassLoader,
                   packageNames : Array[String],
                   classNames : Array[String]) : Model =
    extract(Context(
      packageNames = packageNames,
      classNames = classNames,
      reporter = reporter,
      classLoader = cl))

  private final case class Context(
      packageNames : Traversable[String],
      classNames : Traversable[String] = ivectorEmpty,
      reporter : Reporter = DEFAULT_REPORTER,
      classLoader : ClassLoader = getClass.getClassLoader match {
        case null=> ClassLoader.getSystemClassLoader
        case cl=> cl
      }) {
    var size = 0
    private[dms] val pkgModifier = mmapEmpty[String, FM]

    def basicTypeClass = classLoader.loadClass(classOf[BasicType].getName)
    def featureClass = classLoader.loadClass(classOf[Feature].getName)
  }

  private def isPackageClass(c : java.lang.Class[_]) =
    c.getName.endsWith(".package-info") || c.getName.endsWith(".package")

  private def isEnum(c : java.lang.Class[_]) : scala.Boolean =
    if (classOf[Enumeration].isAssignableFrom(c)) true
    else
      Reflection.companion(c, false) match {
        case Some((_, o, _)) =>
          classOf[Enumeration].isAssignableFrom(o.getClass)
        case None => false
      }

  private def extract(implicit context : Context) : Model = {
    var decls = ivectorEmpty[Declaration]

    for (p <- context.packageNames)
      decls ++= extractPackage(p)

    for (c <- context.classNames)
      decls :+= extractClass(context.classLoader.loadClass(c))

    if (context.size == 0) {
      context.reporter.warning("Could not find any class in the provided " +
        s"packages ${context.packageNames.toVector}; " +
        "perhaps classpath issues or typos?")
    }

    model(decls)
  }

  private def extractPackage(p : String)(
    implicit context : Context) : ISeq[Declaration] = {
    var result = ivectorEmpty[Declaration]
    val cp = ClassPath.from(context.classLoader)
    val cis = cp.getTopLevelClassesRecursive(p)
    for (ci <- cis) {
      val clazz = ci.load
      if (!isPackageClass(clazz) && !isEnum(clazz))
        result :+= extractClass(clazz)
    }
    result
  }

  private def extractClass[T](clazz : java.lang.Class[T])(
    implicit context : Context) : Declaration = {
    val pkg = clazz.getPackage
    val pkgName = pkg.getName
    context.size += 1
    extract(context.pkgModifier.getOrElseUpdate(pkgName, {
      var isReq = false
      val pm = new FM()
      for (a <- pkg.getAnnotations) {
        var qualifier = ""
        try {
          val m = a.annotationType().getDeclaredMethod("value")
          qualifier = m.invoke(a).toString
        } catch {
          case e : Exception =>
        }
        extractFeatureLevelAnnotation(pm, pkgName, a.annotationType,
          qualifier, true)
      }
      pm
    }), clazz, imapEmpty[String, Object])
  }

  private final class FM(
    var featureAnnotations : IVector[FeatureAnnotation] = ivectorEmpty,
    var isReq : scala.Boolean = false)

  private def extractFeatureLevelAnnotation(
    fm : FM, entityName : String, clazz : java.lang.Class[_],
    qualifier : String, allowReq : scala.Boolean)(implicit context : Context) {
    val name =
      if (!clazz.isInterface) clazz.getInterfaces()(0).getName
      else clazz.getName
    name match {
      case `SCHEMA_NAME` =>
        fm.featureAnnotations :+= featureLevelAnnotation(FeatureLevel.Schema, qualifier)
      case `CLASS_NAME` =>
        fm.featureAnnotations :+= featureLevelAnnotation(FeatureLevel.Class, qualifier)
      case `PRODUCT_NAME` =>
        fm.featureAnnotations :+= featureLevelAnnotation(FeatureLevel.Product, qualifier)
      case `DEVICE_NAME` =>
        fm.featureAnnotations :+= featureLevelAnnotation(FeatureLevel.Device, qualifier)
      case `INSTANCE_NAME` =>
        fm.featureAnnotations :+= featureLevelAnnotation(FeatureLevel.Instance, qualifier)
      case `SETTABLE_NAME`        => fm.featureAnnotations :+= settableAnnotation
      case `DATA_NAME`            => fm.featureAnnotations :+= dataAnnotation
      case `REQ_NAME` if allowReq => fm.isReq = true
      case c =>
        context.reporter.warning(
          s"Unexpected annotation $c for $entityName; only Schema, Class, " +
            "Product, Device, Instance, and Data are allowed.")
    }
  }

  private def extract(
    pm : FM, clazz : java.lang.Class[_],
    inits : IMap[String, Object])(
      implicit context : Context) : Declaration = {
    val tipe = Reflection.getTypeOfClass(clazz)
    val ts = tipe.typeSymbol
    val name = clazz.getName

    val objInits =
      if (!inits.isEmpty) inits
      else if (ts.asClass.isTrait) Reflection.traitInits(clazz)
      else
        try Reflection.classInits(tipe, clazz.newInstance, false)
        catch { case e : Exception => imapEmpty[String, Object] }

    val fm = new FM(pm.featureAnnotations, pm.isReq)
    for (a <- ts.annotations.map(Reflection.annotation(_))) {
      var qualifier = ""
      for (p <- a.params)
        if (p.name == "value")
          qualifier = p.value.toString
      extractFeatureLevelAnnotation(fm, name, a.clazz, qualifier, false)
    }

    val featureAnnotations = fm.featureAnnotations
    implicit val isProduct = featureAnnotations.exists(
      _ match {
        case fla : FeatureLevelAnnotation =>
          fla.level == FeatureLevel.Product || fla.level == FeatureLevel.Device
        case _ => false
      })
    var isReq = fm.isReq

    var supers = ivectorEmpty[NamedType]
    var members = ivectorEmpty[Member]

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
      var memberSet = isetEmpty[String]
      for (d <- tipe.declarations.sorted) {
        extract(name, false, d, objInits) match {
          case Some(m) =>
            if (!memberSet.contains(m.name)) {
              memberSet += m.name
              members :+= m
            }
          case _ =>
        }
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
        requirement(name, members)
      else
        feature(featureAnnotations, name, supers, members)
    }
  }

  private def extract(
    owner : String, isCompanion : scala.Boolean, symbol : Symbol,
    inits : IMap[String, Object])(
      implicit context : Context,
      isProduct : scala.Boolean) : scala.Option[Member] = {
    val aName = symbol.name.decoded.trim
    val aQName = owner + '.' + aName

    var isInvariant = false
    var aAnnotations = ivectorEmpty[AttributeAnnotation]

    val anns = symbol.annotations.map(Reflection.annotation(_))

    if (symbol.isOverride || symbol.isAbstractOverride)
      aAnnotations :+= overrideAnnotation

    for (a <- anns) {
      a.clazz.getName match {
        case `CONST_NAME` =>
          var value : Any = UNSPECIFIED
          var qualifier = ""
          for (p <- a.params)
            p.name match {
              case "value"     => value = p.value
              case "qualifier" => qualifier = p.value.toString
            }
          value match {
            case SCHEMA =>
              aAnnotations :+= constAnnotation(FeatureLevel.Schema, qualifier)
            case CLASS =>
              aAnnotations :+= constAnnotation(FeatureLevel.Class, qualifier)
            case PRODUCT =>
              aAnnotations :+= constAnnotation(FeatureLevel.Product, qualifier)
            case INSTANCE =>
              aAnnotations :+= constAnnotation(FeatureLevel.Instance, qualifier)
            case UNSPECIFIED =>
              aAnnotations :+= constAnnotation(FeatureLevel.Unspecified, qualifier)
          }
        case `DATA_NAME`     => aAnnotations :+= dataAnnotation
        case `SETTABLE_NAME` => aAnnotations :+= settableAnnotation
        case `INV_NAME`      => isInvariant = true
        case `MULTIPLICITY_NAME` =>
          var lo = 0
          var hi = *
          var typeName = Optional.absent[String]
          for (p <- a.params)
            p.name match {
              case "lo" => lo = p.value.asInstanceOf[Int]
              case "hi" => hi = p.value.asInstanceOf[Int]
              case "clas" =>
                p.value.asInstanceOf[java.lang.Class[_]].getName match {
                  case `OBJECT_NAME` =>
                  case name          => typeName = Optional.of(name)
                }
            }
          if (lo < 0) {
            context.reporter.error(
              s"Invalid low range for $aQName multiplicity.")
          } else if (lo > hi && hi >= 0) {
            context.reporter.error(
              "High range cannot be smaller than low range for " +
                s"$aQName multiplicity.")
          } else
            aAnnotations :+= multiplicityAnnotation(lo, hi, typeName)
        case c =>
          context.reporter.warning(
            s"Unexpected annotation $c for $aQName; " +
              "only Const, Data, Inv, and Settable are allowed.")
      }
    }

    if (isInvariant) {
      inits.get(aName) match {
        case Some(DYN) | None =>
          context.reporter.error(s"Ill-formed model: $aQName")
          None
        case Some(value) =>
          val valueClass = value.getClass
          if (valueClass.getName != "scala.reflect.api.Exprs$ExprImpl") {
            context.reporter.warning(
              s"Not permitted invariant type $valueClass for $aQName")
            None
          } else {
            val NullaryMethodType(TypeRef(_, _, l)) = symbol.typeSignature
            val predicateType =
              (if (l.size == 1) first2(extractType(aQName, l(0), None))
              else tupleType(l.map { t =>
                first2(extractType(aQName, t, None))
              })).asInstanceOf[PredicateType]
            Some(invariant(aName, predicateType,
              predExtractor(value.asInstanceOf[Predicate[_]])))
          }
      }
    } else if (isCompanion) {
      None
    } else if (symbol.isTerm && (symbol.asTerm.isGetter || symbol.asTerm.isVal)) {
      val (aType, aInit) =
        extractAttributeTypeInit(aQName, aName, symbol, inits)
      val result = attribute(aAnnotations, aType, aName, aInit)
      Some(result)
    } else {
      None
    }
  }

  private def extractAttributeTypeInit(
    aQName : String, aName : String, symbol : Symbol,
    inits : IMap[String, Object])(
      implicit context : Context,
      isProduct : scala.Boolean) : (ast.Type, Optional[Initialization]) = {
    extractType(aQName, symbol.typeSignature match {
      case NullaryMethodType(resultType) => resultType
      case tipe                          => tipe
    }, inits.get(aName))
  }

  private def extractType(
    aQName : String, tipe : Type, value : Option[scala.Any])(
      implicit context : Context,
      isProduct : scala.Boolean) : (ast.Type, Optional[Initialization]) = {
    val clazz = Reflection.getClassOfType(tipe.erasure)
    clazz.getName match {
      case `ANY_NAME` =>
        value match {
          case Some(DYN) | None =>
          case Some(v) =>
            context.reporter.error(
              s"Any type initialization for $aQName is not permitted.")
        }
        (namedType("Any"), none())
      case `OPTION_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        (value : @unchecked) match {
          case Some(DYN) | None =>
            val (eType, _) = extractType(aQName, elementType, None)
            (optionType(eType), none())
          case Some(o : Option[_]) =>
            val (eType, init) = extractType(aQName, elementType, o)
            val resultType = optionType(eType)
            if (init.isPresent)
              (resultType, some(someInit(init.get)))
            else
              (resultType, some(noneInit))
        }
      case `EITHER_NAME` =>
        val TypeRef(_, _, List(leftTipe, rightTipe)) = tipe
        (value : @unchecked) match {
          case Some(DYN) | None =>
            val (leftType, _) = extractType(aQName, leftTipe, None)
            val (rightType, _) = extractType(aQName, rightTipe, None)
            (eitherType(list(leftType, rightType)), none())
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
        }
      case c if c.startsWith("scala.Tuple") =>
        val TypeRef(_, _, args) = tipe
        (value : @unchecked) match {
          case Some(DYN) | None =>
            (tupleType(args.map { extractType(aQName, _, None)._1 }), none())
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
        }
      case `MAP_NAME` =>
        val TypeRef(_, _, List(keyType, valueType)) = tipe
        val (kType, _) = extractType(aQName, keyType, None)
        val (vType, _) = extractType(aQName, valueType, None)
        val resultType = mapType(kType, vType)
        (value : @unchecked) match {
          case Some(DYN) | None =>
            (resultType, none())
          case Some(m : IMap[_, _]) =>
            val inits = m.map(p =>
              (extractType(aQName, keyType, Some(p._1))._2,
                extractType(aQName, valueType, Some(p._2))._2))
            if (inits.exists(p => !p._1.isPresent || !p._1.isPresent))
              (resultType, none())
            else
              (resultType,
                some(mapInit(inits.toSeq.map(_._1.get),
                  inits.toSeq.map(_._2.get))))
        }
      case `SET_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        val (eType, _) = extractType(aQName, elementType, None)
        val resultType = setType(eType)
        (value : @unchecked) match {
          case Some(DYN) | None =>
            (resultType, none())
          case Some(s : ISet[_]) =>
            val inits = s.map(x => extractType(aQName, elementType, Some(x))._2)
            if (inits.exists(!_.isPresent)) (resultType, none())
            else (resultType, some(setInit(inits.toSeq.map(_.get))))
        }
      case `SEQ_NAME` =>
        val TypeRef(_, _, List(elementType)) = tipe
        val (eType, _) = extractType(aQName, elementType, None)
        val resultType = seqType(eType)
        (value : @unchecked) match {
          case Some(DYN) | None =>
            (resultType, none())
          case Some(s : ISeq[_]) =>
            val inits = s.map(x => extractType(aQName, elementType, Some(x))._2)
            if (inits.exists(!_.isPresent)) (resultType, none())
            else (resultType, some(setInit(inits.map(_.get))))
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
          case Some(DYN) | None =>
            (namedType(c), none())
        }
      case c =>
        def isAttrSym(sym : Symbol, notp : java.lang.String => scala.Boolean) =
            !notp(sym.name.decoded.trim) && sym.isTerm && {
              val t = sym.asTerm
              t.isGetter || t.isVal
            }

        tipe match {
          case RefinedType(parents, decls) =>
            var success = true
            val types = filterType(aQName, parents)
            var inits = imapEmpty[String, Object]
            var aTypes = imapEmpty[String, Type]
            val decls = if (isProduct) tipe.members else tipe.declarations
            value match {
              case None | Some(DYN) =>
              case Some(value) =>
                val vClass = value.getClass
                for (d <- decls if isAttrSym(d, inits.contains)) {
                  val dName = d.name.decoded.trim
                  val dValue = vClass.getMethod(d.name.encoded).invoke(value)
                  inits += (dName -> dValue)
                  aTypes += (dName -> d.asTerm.typeSignature)
                }
            }
            var attributes = ivectorEmpty[Attribute]
            for (d <- tipe.declarations.sorted if isAttrSym(d, truePredicate1)) {
              extract(aQName, false, d,
                imapEmpty[String, Object]) match {
                  case Some(a : Attribute) => attributes :+= a
                  case Some(m) =>
                    context.reporter.error(
                      s"Expecting attribute for $aQName, " +
                        s"but found ${m.getClass}.")
                  case _ =>
                }
            }

            val resultType =
              if (types.size > 1 || attributes.size > 0)
                Ast.refinedType(types, attributes)
              else namedType(types(0).name)

            value match {
              case None | Some(DYN) => (resultType, none())
              case Some(_) =>
                var attributeInits = ivectorEmpty[Attribute]
                var attributeNames = isetEmpty[String]
                for (d <- decls.sorted if isAttrSym(d, attributeNames.contains))
                  extract(aQName, false, d, inits) match {
                    case Some(a : Attribute) =>
                      val NullaryMethodType(dType) = d.typeSignature
                      if (isOverride(a.name, dType, parents))
                        attributeInits :+= attribute(a.annotations, a.`type`,
                          a.name, a.init)
                      else
                        attributeInits :+= a
                    case Some(m) =>
                      context.reporter.error(
                        s"Expecting attribute for $aQName initialization, " +
                          s"but found ${m.getClass}.")
                    case _ =>
                  }
                (resultType, some(featureInit(types, attributeInits)))
            }
          case _ =>
            value match {
              case None | Some(DYN) =>
                (namedType(c), none())
              case Some(value) if context.basicTypeClass.isAssignableFrom(value.getClass) =>
                (namedType(value.getClass.getName),
                  some(basicInit(value.asInstanceOf[BasicType].asString)))
              case Some(value) =>
                val vClass = value.getClass
                val vTipe = Reflection.getTypeOfClass(vClass)
                var inits = imapEmpty[String, Object]
                val decls = if (isProduct) vTipe.members else vTipe.declarations
                for (d <- decls if isAttrSym(d, inits.contains)) {
                  val dName = d.name.decoded.trim
                  val dValue = vClass.getMethod(d.name.encoded).invoke(value)
                  inits += (dName -> dValue)
                }
                var attributes = ivectorEmpty[Attribute]
                var aTypes = imapEmpty[String, Type]
                for (d <- decls.sorted if isAttrSym(d, aTypes.contains))
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
                          if (!a.annotations.exists(
                            _.isInstanceOf[OverrideAnnotation]) &&
                            isOverride(a.name, aTypes(a.name), parents))
                            attribute(a.annotations :+ overrideAnnotation,
                              a.`type`, a.name, a.init)
                          else
                            a
                        })))
                  case TypeRef(pre, sym, _) =>
                    val clazz = Reflection.getClassOfType(vTipe)
                    val interfaces = clazz.getInterfaces.toVector
                    val sclazz = clazz.getSuperclass
                    val types =
                      (if (sclazz != null && sclazz.getName != OBJECT_NAME)
                        ivector(namedType(sclazz.getName))
                      else ivectorEmpty[NamedType]) ++
                        interfaces.map(x => namedType(x.getName))
                    val itypes = interfaces.map(Reflection.getTypeOfClass(_))
                    (resultType,
                      some(featureInit(types, attributes.map { a =>
                        if (!a.annotations.exists(
                          _.isInstanceOf[OverrideAnnotation]) &&
                          isOverride(a.name, aTypes(a.name), itypes))
                          attribute(a.annotations :+ overrideAnnotation,
                            a.`type`, a.name, a.init)
                        else
                          a
                      })))
                }
            }
        }
    }
  }

  private def filterType(aQName : String, l : List[Type])(
    implicit context : Context) : ISeq[NamedType] = {
    l.flatMap {
      _ match {
        case TypeRef(_, sym, _) =>
          val name = sym.name.decoded
          if (name == "AnyRef") None
          else Some(namedType(
            Reflection.getClassOfType(sym.asType.typeSignature).getName))
        case t =>
          context.reporter.error(
            s"Unexpected type $t for $aQName initialization.")
          None
      }
    }
  }

  private def isOverride(aName : String, aType : Type,
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

  def predExtractor[T](p : Predicate[T])(
    implicit context : Context) : FunExp = {
    val scalaTypeMap = Set(
      classOf[scala.collection.immutable.Map[_, _]].getName,
      classOf[scala.collection.immutable.Set[_]].getName,
      classOf[scala.collection.Iterable[_]].getName,
      classOf[scala.collection.immutable.Seq[_]].getName,
      classOf[scala.Tuple1[_]].getName,
      classOf[scala.Tuple2[_, _]].getName,
      classOf[scala.Tuple3[_, _, _]].getName,
      classOf[scala.Tuple4[_, _, _, _]].getName,
      classOf[scala.Tuple5[_, _, _, _, _]].getName,
      classOf[scala.Tuple6[_, _, _, _, _, _]].getName,
      classOf[scala.Tuple7[_, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple8[_, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple9[_, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple10[_, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple11[_, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple12[_, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple13[_, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple14[_, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple15[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple16[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple17[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple18[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple19[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple20[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple21[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName,
      classOf[scala.Tuple22[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]].getName
    )

      def clazzOf(t : Tree) = Reflection.getClassOfType(t.tpe)
      def typeNameOf(t : Tree) = clazzOf(t).getName
      def typeNameOfTypeTree(tpt : Tree) = tpt match {
        case id @ Ident(nme) => typeNameOf(id)
        case tpt @ TypeTree() =>
          tpt.original match {
            case id @ Ident(nme) => typeNameOf(id)
            case tpto =>
              context.reporter.error(s"Unhandled constraint form: ${showRaw(tpto)}")
              "?"
          }
        case _ =>
          context.reporter.error(s"Unhandled constraint form: ${showRaw(tpt)}")
          "?"
      }

      def visitor(t : Tree) : Exp =
        t match {
          case Function(List(ValDef(_, termName, TypeTree(), _)), body) =>
            funExp(param(none(), termName.decoded), visitor(body))
          case Function(List(ValDef(_, termName, id : Ident, _)), body) =>
            funExp(param(some(namedType(typeNameOf(id))), termName.decoded), visitor(body))
          case Apply(Select(id @ Ident(_), applyName), List(Literal(Constant(v)))) if applyName.decoded == "apply" =>
            val typeName = typeNameOf(id)
            literalExp(v.toString) withType (namedType(typeName.substring(0, typeName.length - 1)))
          case Apply(Select(Select(This(_), booleanName), applyName), List(e)) if booleanName.decoded == "Boolean" && applyName.decoded == "apply" =>
            visitor(e)
          case Apply(Select(Ident(_), b2sbName), List(e)) if b2sbName.decoded == "boolean2sboolean" =>
            visitor(e)
          case Apply(Select(qualifier, name), List(e)) if classOf[BasicType].isAssignableFrom(clazzOf(qualifier)) =>
            var tn = typeNameOf(qualifier)
            if (tn == classOf[edu.ksu.cis.santos.mdcf.dms.Boolean].getName)
              tn = "boolean"
            binaryBasicOpExp(visitor(qualifier), name.decoded,
              visitor(e)) withType (namedType(tn))
          case Apply(fun, List(arg)) =>
            applyExp(visitor(fun), visitor(arg))
          case Select(qualifier, name) =>
            if (scalaTypeMap.contains(typeNameOf(qualifier))) {
              val typeName = typeNameOf(qualifier)
              if (typeName.endsWith(".Map"))
                mapOpExp(name.decoded, visitor(qualifier))
              else if (typeName.endsWith(".Set"))
                setOpExp(name.decoded, visitor(qualifier))
              else if (typeName.endsWith(".Seq"))
                seqOpExp(name.decoded, visitor(qualifier))
              else if (typeName.endsWith(".Iterable"))
                seqOpExp(name.decoded, visitor(qualifier))
              else
                tupleOpExp(name.decoded, visitor(qualifier))
            } else
              accessExp(visitor(qualifier), name.decoded)
          case Ident(name) =>
            varRefExp(name.decoded)
          case Literal(Constant(v)) =>
            literalExp(v.toString)
          case Match(selector, cases) =>
            val cs = cases.toVector.flatMap {
              _ match {
                case CaseDef(Ident(varName), t, body) =>
                  val cond =
                    t match {
                      case EmptyTree => none[Exp]()
                      case t         => some(visitor(t))
                    }
                  val e = visitor(body)
                  varName.decoded match {
                    case "_"  => Some(matchCase(defaultMatchCaseBind, cond, e))
                    case name => Some(matchCase(namedMatchCaseBind(name, none()), cond, e))
                  }
                case CaseDef(
                  Bind(varName, Typed(Ident(wName), tpt)), t, body) if wName.decoded == "_" =>
                  val cond =
                    t match {
                      case EmptyTree => none[Exp]()
                      case t         => some(visitor(t))
                    }
                  val e = visitor(body)
                  val typeName = typeNameOfTypeTree(tpt)
                  Some(matchCase(namedMatchCaseBind(varName.decoded, some(namedType(typeName))), cond, e))
                case cd =>
                  context.reporter.error(s"Unhandled constraint form: ${showRaw(cd)}")
                  None
              }
            }
            import scala.collection.JavaConversions._
            matchExp(visitor(selector), cs)
          case TypeApply(Select(qualifier, isInstanceOfName), List(tpt)) if isInstanceOfName.decoded == "isInstanceOf" =>
            val typeName = typeNameOfTypeTree(tpt)
            instanceOfExp(visitor(qualifier), namedType(typeName))
          case t =>
            context.reporter.error(s"Unhandled constraint form: ${showRaw(t)}")
            unknownExp
        }
    val t = Reflection.typeCheck(p.tree)
    visitor(t).asInstanceOf[FunExp]
  }
}