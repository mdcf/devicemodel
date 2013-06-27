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
abstract class IntValue
    extends IntegerValue with ConcreteValue with IsInteger {
  def value : Integer
  def asInteger = value
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object IntExtension extends ExtensionCompanion {
  def apply(ec : ExtensionConfig) = new IntExtension(ec)

  private type Op = String

  import PilarAstUtil._

  @inline
  def binopASem(opA : Op)(c : Integer, d : Integer) =
    opA match {
      case ADD_BINOP => c + d
      case SUB_BINOP => c - d
      case MUL_BINOP => c * d
      case DIV_BINOP => c / d
      case REM_BINOP => c % d
    }

  @inline
  def opRSem(opR : Op)(c : Integer, d : Integer) =
    opR match {
      case EQ_BINOP => c == d
      case NE_BINOP => c != d
      case GT_BINOP => c > d
      case GE_BINOP => c >= d
      case LT_BINOP => c < d
      case LE_BINOP => c <= d
    }

  @inline
  def unopASem(opA : Op)(c : Integer) =
    opA match {
      case PLUS_UNOP  => c
      case MINUS_UNOP => -c
    }

  private type CV = IsInteger
  private type V = Value

  import language.implicitConversions

  @inline
  private implicit def t2s[T](t : T) = ivector(t)

  @inline
  private implicit def si2sv[S](sd : (S, Integer)) : ISeq[(S, V)] = (sd._1, i2v(sd._2))

  @inline
  private implicit def i2v(i : Integer) = CI(i)

  @inline
  private implicit def cv2i(ci : CV) = ci.asInteger

  @inline
  def cast[S] : (S, V, ResourceUri) --> ISeq[(S, V)] = {
    case (s, v : NatExtension.CN, IntExtension.Type) => (s, CI(v.value))
    case (s, v : CI, IntExtension.Type)              => (s, v)
  }

  @inline
  def binopAEval[S] : (S, V, Op, V) --> ISeq[(S, V)] = {
    case (s, c : CV, opA, d : CV) => (s, binopASem(opA)(c, d))
  }

  @inline
  def unopAEval[S] : (S, Op, V) --> ISeq[(S, V)] = {
    case (s, opA, c : CV) => (s, unopASem(opA)(c))
  }

  @inline
  def binopREval[S](
    implicit b2v : Boolean => V) : (S, V, Op, V) --> ISeq[(S, V)] = {
    case (s, c : CV, opR, d : CV) => (s, b2v(opRSem(opR)(c, d)))
  }

  val Type = "pilar://typeext/" + UriUtil.classUri(this) + "/Type"

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  final case class CI(value : Integer) extends IntValue {
    val typeUri = IntExtension.Type
    override def toString = s"Int(${value.toBigInt.toString})"
  }
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
final class IntExtension[S](ec : ExtensionConfig) extends Extension {

  import IntExtension._

  val uriPath = UriUtil.classUri(this)

  implicit val b2v = ExpEvaluator.b2v

  @Cast
  val cast = IntExtension.cast

  import PilarAstUtil._

  @Binaries(Array(ADD_BINOP, SUB_BINOP, MUL_BINOP, DIV_BINOP, REM_BINOP))
  val binopAEval = IntExtension.binopAEval

  @Unaries(Array(PLUS_UNOP, MINUS_UNOP))
  val unopAEval = IntExtension.unopAEval

  @Binaries(Array(EQ_BINOP, NE_BINOP, GT_BINOP, GE_BINOP, LT_BINOP, LE_BINOP))
  val binopREval = IntExtension.binopREval

  @TopLevel @ExpExt
  val Int : (S, Value) --> ISeq[(S, Value)] = {
    case (s, BasicValue(v)) =>
      (s, SireumNumber(BigInt(v)))
  }
}
