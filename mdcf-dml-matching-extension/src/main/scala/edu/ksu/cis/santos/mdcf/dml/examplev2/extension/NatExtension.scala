/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.examplev2.extension

import org.sireum.extension._
import org.sireum.pilar.ast._
import org.sireum.pilar.eval._
import org.sireum.pilar.state._
import org.sireum.util._
import org.sireum.util.math._
import edu.ksu.cis.santos.mdcf.dml.matching.BasicValue
import edu.ksu.cis.santos.mdcf.dml.matching.ExpEvaluator

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
abstract class NatValue
    extends IntegerValue with ConcreteValue with IsInteger {
  def value : Integer
  def asInteger = value
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object NatExtension extends ExtensionCompanion {
  def apply(ec : ExtensionConfig) = new NatExtension(ec)

  private type Op = String

  import PilarAstUtil._

  private type V = Value

  import language.implicitConversions

  @inline
  private implicit def t2s[T](t : T) = ivector(t)

  @inline
  private implicit def si2sv[S](sd : (S, Integer)) : ISeq[(S, V)] = (sd._1, i2v(sd._2))

  @inline
  implicit def i2v(n : Integer) =
    if (n < 0) CN(SireumNumber(0)) else CN(n)

  @inline
  implicit def cn2i(v : CN) = v.value

  @inline
  def cast[S] : (S, V, ResourceUri) --> ISeq[(S, V)] = {
    case (s, v : CN, NatExtension.Type) => (s, v)
  }

  @inline
  def binopAEval[S] : (S, V, Op, V) --> ISeq[(S, V)] = {
    case (s, c : CN, opA, d : CN) => (s, IntExtension.binopASem(opA)(c, d))
  }

  @inline
  def unopAEval[S] : (S, Op, V) --> ISeq[(S, V)] = {
    case (s, opA, c : CN) => (s, IntExtension.unopASem(opA)(c))
  }

  @inline
  def binopREval[S](
    implicit b2v : Boolean => V) : (S, V, Op, V) --> ISeq[(S, V)] = {
    case (s, c : CN, opR, d : CN) => (s, b2v(IntExtension.opRSem(opR)(c, d)))
  }

  val Type = "pilar://typeext/" + UriUtil.classUri(this) + "/Type"

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  final case class CN(value : Integer) extends NatValue {
    val typeUri = NatExtension.Type
    override def toString = s"Nat(${value.toBigInt.toString})"
  }
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
final class NatExtension[S](ec : ExtensionConfig) extends Extension {

  import NatExtension._

  val uriPath = UriUtil.classUri(this)

  implicit val b2v = ExpEvaluator.b2v

  @Cast
  val cast = NatExtension.cast

  import PilarAstUtil._

  @Binaries(Array(ADD_BINOP, SUB_BINOP, MUL_BINOP, DIV_BINOP, REM_BINOP))
  val binopAEval = NatExtension.binopAEval

  @Unaries(Array(PLUS_UNOP, MINUS_UNOP))
  val unopAEval = NatExtension.unopAEval

  @Binaries(Array(EQ_BINOP, NE_BINOP, GT_BINOP, GE_BINOP, LT_BINOP, LE_BINOP))
  val binopREval = NatExtension.binopREval

  @TopLevel @ExpExt
  val Nat : (S, Value) --> ISeq[(S, Value)] = {
    case (s, BasicValue(v)) => (s, SireumNumber(BigInt(v)))
  }
}
