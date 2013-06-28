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
import org.sireum.extension._
import org.sireum.konkrit.extension.KonkritBooleanExtension
import org.sireum.pilar.ast.PilarAstUtil
import org.sireum.pilar.state._
import org.sireum.util._

import scala.collection.JavaConversions._

import language.implicitConversions

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object ExpEvaluator {
  type S = BasicState
  type V = Value

  import PilarAstUtil._

  val TRUE = KonkritBooleanExtension.TT
  val FALSE = KonkritBooleanExtension.FF
  val &&& = KonkritBooleanExtension.binopLSem(LOGICAL_AND_BINOP) _
  val ||| = KonkritBooleanExtension.binopLSem(LOGICAL_OR_BINOP) _
  val b2v = KonkritBooleanExtension.b2v _

  val typeNames : Type --> ISet[String] = {
    case nt : NamedType   => Set(nt.name)
    case rt : RefinedType => rt.types.map(_.name).toSet
  }

  implicit def t2iseq[T](t : T) : ISeq[T] = ivector(t)
  implicit def v2b(v : V) = v match {
    case TRUE | BasicValue("true")   => true
    case FALSE | BasicValue("false") => false
  }

  def toValue(fm : FeatureMatch) : FeatureValue = {
    import Ast._
    FeatureValue(
      featureInit(
        list(),
        fm.attributeMatches.values.toVector.map { am =>
          val attr = am.attribute
          attribute(list(), attr.`type`, attr.name, some(am.initMatch))
        }))
  }

  def mapOp(op : String, m : MapValue) : V =
    op match {
      case "keys" =>
        SeqValue(m.value.keys.toVector)
      case "values" =>
        SeqValue(m.value.values.toVector)
      case "forall" =>
        ForallValue(m.value.map(e => TupleValue(ivector(e._1, e._2))))
      case "exists" =>
        ExistsValue(m.value.map(e => TupleValue(ivector(e._1, e._2))))
    }

  def setqOp(op : String, values : Traversable[Value]) : V =
    op match {
      case "forall" =>
        ForallValue(values)
      case "exists" =>
        ExistsValue(values)
    }

  def tupleOp(op : String, t : TupleValue) : V =
    t.value(op.substring(1).toInt)

  def toValue(init : Initialization) : V =
    init match {
      case bi : BasicInit   => BasicValue(bi.value)
      case ei : EitherInit  => EitherValue(ei.index, toValue(ei.init))
      case fi : FeatureInit => FeatureValue(fi)
      case mi : MapInit     => MapValue(imapEmpty ++ mi.keyInits.map(toValue).zip(mi.valueInits.map(toValue)))
      case ni : NoneInit    => NoneValue
      case si : SeqInit     => SeqValue(si.inits.map(toValue).toVector)
      case si : SetInit     => SetValue(si.inits.map(toValue).toSet)
      case si : SomeInit    => SomeValue(toValue(si.init))
      case ti : TupleInit   => TupleValue(ti.inits.map(toValue).toVector)
    }

  def simpleName(name : String) = {
    val i = name.lastIndexOf(".")
    if (i >= 0) name.substring(i + 1)
    else name
  }
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
class ExpEvaluator(ctx : Context) {
  import ExpEvaluator._

  def checkPred(pred : FunExp, v : FeatureValue) : Boolean = {
    val s = BasicState().enterClosure(Map(pred.param.name -> v))
    val r = evalExp(s, pred.body).map(second2)
    r.exists(v2b)
  }

  def normalizeValue(name : String)(s : S, v : V) : ISeq[(S, V)] =
    v match {
      case v : BasicValue => ctx.sec.expExtCall(name, (s, v))
      case _              => (s, v)
    }

  def evalExp(s : S, exp : Exp) : ISeq[(S, V)] =
    exp match {
      case ae : AccessExp =>
        for { (s2, v) <- evalExp(s, ae.exp) } yield v match {
          case v : FeatureValue if v.hasAccess(ae.id) =>
            (s2, toValue(v.access(ae.id).init.get))
        }
      case ae : ApplyExp =>
        for {
          (s2, fun) <- evalExp(s, ae.fun)
          (s3, arg) <- evalExp(s2, ae.arg)
          (s4, v) <- (fun, arg) match {
            case (FunValue(id, exp), _) =>
              evalExp(s3.enterClosure(Map(id -> arg)), exp).
                map(p => (p._1.exitClosure, p._2))
            case (ForallValue(values), FunValue(id, exp)) =>
              var r : ISeq[(S, V)] = (s3, TRUE)
              for (fv <- values)
                r = for {
                  (s5, cond) <- r
                  (s6, b) <- evalExp(s5.enterClosure(Map(id -> fv)), exp)
                } yield (s6.exitClosure, b2v(&&&(cond, b)))
              r
            case (ExistsValue(values), FunValue(id, exp)) =>
              var r : ISeq[(S, V)] = (s3, FALSE)
              for (fv <- values)
                r = for {
                  (s5, cond) <- r
                  (s6, b) <- evalExp(s5.enterClosure(Map(id -> fv)), exp)
                } yield (s6.exitClosure, b2v(|||(cond, b)))
              r
          }
        } yield (s4, v)
      case bboe : BinaryBasicOpExp =>
        val name = simpleName(bboe.`type`.get.asInstanceOf[NamedType].name)
        val (e1, op, e2) = (bboe.left, bboe.op, bboe.right)
        val sec = ctx.sec
        val nv = normalizeValue(name) _
        sec.binaryOpMode(op) match {
          case BinaryOpMode.LAZY_LEFT =>
            for {
              (s2, v2) <- evalExp(s, e2)
              (s3, v2n) <- nv(s2, v2)
              sv <- sec.lazyLBinaryOp(op, s2, { s =>
                for {
                  (s4, v1) <- evalExp(s, e1)
                  sv2 <- nv(s4, v1)
                } yield sv2
              }, v2n)
            } yield sv
          case BinaryOpMode.LAZY_RIGHT =>
            for {
              (s2, v1) <- evalExp(s, e1)
              (s3, v1n) <- nv(s2, v1)
              sv <- sec.lazyRBinaryOp(op, s3, v1n, { s =>
                for {
                  (s4, v2) <- evalExp(s, e2)
                  sv2 <- nv(s4, v2)
                } yield sv2
              })
            } yield sv
          case BinaryOpMode.REGULAR =>
            for {
              (s2, v1) <- evalExp(s, e1)
              (s3, v1n) <- nv(s2, v1)
              (s4, v2) <- evalExp(s3, e2)
              (s5, v2n) <- nv(s4, v2)
              sv <- sec.binaryOp(op, s5, v1n, v2n)
            } yield sv
        }
      case fe : FunExp =>
        (s, FunValue(fe.param.name, fe.body))
      case ioe : InstanceOfExp if typeNames isDefinedAt ioe.testType =>
        for { (s2, v) <- evalExp(s, ioe.exp) } yield {
          (v, ioe.testType) match {
            case (v : FeatureValue, nt : NamedType) =>
              (s2, b2v(v.types.exists(ctx.st.isSubTypeOf(_, nt.name))))
            case (v, nt : NamedType) =>
              ctx.reporter.warning(s"Testing $v with ${nt.name} is always false!")
              (s2, FALSE)
          }
        }
      case le : LiteralExp =>
        le.value match {
          case "true"  => (s, TRUE)
          case "false" => (s, FALSE)
          case _       => (s, BasicValue(le.value))
        }
      case moe : MapOpExp =>
        for { (s2, m) <- evalExp(s, moe.exp) } yield m match {
          case m : MapValue => (s2, mapOp(moe.id, m))
        }
      case me : MatchExp =>
        for {
          (s2, v) <- evalExp(s, me.exp)
          (s3, b) <- {
            var r = ivectorEmpty[(S, V)]
            var ss = ivector(s2)
            for (mc <- me.cases) {
              (mc.bind, v) match {
                case (n : NamedMatchCaseBind, FeatureValue(fi)) =>
                  if (n.`type`.isPresent) {
                    val testTypes = typeNames(n.`type`.get)
                    var fTypes = fi.types.map(_.name).toSet
                    fTypes ++= fTypes.flatMap(ctx.superTransMap.get)
                    if (testTypes.subsetOf(fTypes)) {
                      ss = ss.map(_.enterClosure(Map(n.id -> v)))
                      if (mc.cond.isPresent) {
                        var newSS = ivectorEmpty[S]
                        for ((s4, cond) <- ss.flatMap(evalExp(_, mc.cond.get)))
                          if (cond)
                            r ++= evalExp(s4, mc.body).
                              map(p => (p._1.exitClosure, p._2))
                          else
                            newSS :+= s4.exitClosure
                        ss = newSS
                      } else {
                        r ++= ss.flatMap(evalExp(_, mc.body))
                        ss = ivectorEmpty
                      }
                    }
                  }
                case (d : DefaultMatchCaseBind, _) =>
                  if (mc.cond.isPresent) {
                    var newSS = ivectorEmpty[S]
                    for ((s4, cond) <- ss.flatMap(evalExp(_, mc.cond.get)))
                      if (cond)
                        r ++= evalExp(s4, mc.body)
                      else
                        newSS :+= s4
                    ss = newSS
                  } else {
                    r ++= ss.flatMap(evalExp(_, mc.body))
                    ss = ivectorEmpty
                  }
              }
            }
            assert(ss.isEmpty)
            r
          }
        } yield (s3, b)
      case soe : SeqOpExp =>
        for { (s2, s) <- evalExp(s, soe.exp) } yield s match {
          case s : SeqValue => (s2, setqOp(soe.id, s.value))
        }
      case soe : SetOpExp =>
        for { (s2, s) <- evalExp(s, soe.exp) } yield s match {
          case s : SetValue => (s2, setqOp(soe.id, s.value))
        }
      case toe : TupleOpExp =>
        for { (s2, t) <- evalExp(s, toe.exp) } yield (toe.id, t) match {
          case (op, t : TupleValue) => (s2, tupleOp(op, t))
        }
      case vre : VarRefExp =>
        (s, s.variable(vre.id))
    }
}
