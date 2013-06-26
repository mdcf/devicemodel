/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.matching

import edu.ksu.cis.santos.mdcf.dml.ast.Attribute
import edu.ksu.cis.santos.mdcf.dml.ast.FeatureInit
import edu.ksu.cis.santos.mdcf.dml.ast.exp.Exp

import org.sireum.pilar.state._
import org.sireum.util._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class FunValue(id : String, exp : Exp) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class ForallValue(values : Traversable[Value]) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class ExistsValue(values : Traversable[Value]) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class FeatureValue(value : FeatureInit) extends ConcreteValue {
  private val attrMap = {
    import scala.collection.JavaConversions._

    var m = imapEmpty[String, Attribute]
    for (a <- value.attributes)
      m += (a.name -> a)

    m
  }

  val types = {
    import scala.collection.JavaConversions._
    value.types.map(_.name).toSet
  }

  def hasAccess(id : String) = attrMap.contains(id)

  def access(id : String) = attrMap(id)
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class MapValue(value : IMap[Value, Value]) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class SetValue(value : ISet[Value]) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class SeqValue(value : ISeq[Value]) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class TupleValue(value : ISeq[Value]) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class EitherValue(index : Int, value : Value) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
sealed abstract class OptionValue extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class SomeValue(value : Value) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object NoneValue extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class BasicValue(value : String) extends ConcreteValue

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class TypedBasicValue(value : Any, typeName : String) extends ConcreteValue
