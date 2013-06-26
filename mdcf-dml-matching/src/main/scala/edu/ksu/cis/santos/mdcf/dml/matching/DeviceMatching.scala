/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.matching

import edu.ksu.cis.santos.mdcf.dml.ast._
import edu.ksu.cis.santos.mdcf.dml.ast.exp._
import edu.ksu.cis.santos.mdcf.dml.symbol._
import org.sireum.util._
import com.google.common.base.Optional

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class FeatureMatch(
  feature : Feature,
  attributeMatches : java.util.Map[DeviceMatching.AttributeName, AttributeMatch])

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class AttributeMatch(
  attribute : Attribute,
  initMatch : FeatureInit,
  path : DeviceMatching.Path)

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object DeviceMatching {
  import scala.collection.JavaConversions._

  type FeatureName = String
  type AttributeName = String
  type Path = java.util.List[String]

  def reqProductMatches(
    st : SymbolTable,
    devices : java.util.Set[String],
    req : Requirement) : java.util.Map[FeatureName, FeatureMatch] = {
    var result = imapEmpty[String, FeatureMatch]
    for (
      f <- st.features if isProduct(f) &&
        (devices.isEmpty || devices.contains(f.name))
    ) for (fm <- reqFeatureMatches(st, req, f))
      result += (f.name -> fm)

    result
  }

  def reqFeatureMatches(
    st : SymbolTable,
    req : Requirement,
    device : Feature) : ISeq[FeatureMatch] = {
    require(isProduct(device))

    var attrMatchesMap = imapEmpty[AttributeName, ISeq[AttributeMatch]]

    for (m <- req.members)
      m match {
        case attr : Attribute =>
          val ams =
            reqAttributeMatches(st, device, attr)
          if (ams.isEmpty)
            return ivectorEmpty
          attrMatchesMap += (attr.name -> ams)
        case _ =>
      }

    var attrMatchComb =
      ivector(imapEmpty[AttributeName, AttributeMatch])
    for ((attrName, attrMatches) <- attrMatchesMap) {
      attrMatchComb = for {
        m <- attrMatchComb
        attrMatch <- attrMatches
      } yield {
        m + (attrName -> attrMatch)
      }
    }

    attrMatchComb.map(FeatureMatch(device, _)).filter { fm =>
      import ExpEvaluator._
      val v = toValue(fm)
      req.members.forall(
        _ match {
          case inv : Invariant => checkPred(st, inv.predicate, v)
          case _               => true
        })
    }
  }

  def reqAttributeMatches(
    st : SymbolTable,
    f : Feature,
    req : Attribute) : ISeq[AttributeMatch] = {
    val result = marrayEmpty[AttributeMatch]

    val reqTypes =
      req.`type` match {
        case nt : NamedType   => Set(nt.name)
        case ct : RefinedType => ct.types.map(_.name).toSet
      }

    val superTransMap = st.superTransitiveMap

    val path : MArray[String] = {
      val r = marrayEmpty[String]
      r += f.name
      r
    }

    val visitor : VisitorFunction = {
      case attr : Attribute =>
        path += attr.name
        true
      case mi : MapInit =>
        path += "map_elements"
        true
      case si : SetInit =>
        path += "set_elements"
        true
      case si : SeqInit =>
        path += "seq_elements"
        true
      case fi : FeatureInit =>
        var initTypes = fi.types.map(_.name).toSet
        initTypes ++= initTypes.flatMap(superTransMap.get)
        if (reqTypes.subsetOf(initTypes))
          result += AttributeMatch(req, fi, Ast.list(path : _*))
        true
    }

    val visitorEnd : VisitorFunction = {
      case _ : Attribute | _ : MapInit | _ : SetInit | _ : SeqInit =>
        path.remove(path.size - 1)
        true
    }

    Visitor.buildEnd(visitor, visitorEnd)(f)

    result.toVector
  }

  private def isProduct(f : Feature) =
    f.annotations.exists(
      _ match {
        case fla : FeatureLevelAnnotation =>
          fla.level == FeatureLevel.Product ||
            fla.level == FeatureLevel.Device
        case _ => false
      })

  private def option[T](o : Optional[T]) : Option[T] =
    if (o.isPresent) Some(o.get) else None
}