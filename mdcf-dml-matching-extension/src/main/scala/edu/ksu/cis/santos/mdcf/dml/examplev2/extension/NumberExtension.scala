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
object NumberExtension extends ExtensionCompanion {
  def apply(ec : ExtensionConfig) = new NumberExtension(ec)

  private type V = Value

  import language.implicitConversions

  @inline
  private implicit def t2s[T](t : T) = ivector(t)

  @inline
  private implicit def sd2sv[S](sd : (S, Double)) : ISeq[(S, V)] = (sd._1, d2v(sd._2))

  @inline
  private implicit def si2sv[S](sd : (S, Integer)) : ISeq[(S, V)] = (sd._1, i2v(sd._2))

  @inline
  implicit def d2v(d : Double) = FloatExtension.CF(d)

  @inline
  private implicit def i2v(i : Integer) = IntExtension.CI(i)

  val Type = "pilar://typeext/" + UriUtil.classUri(this) + "/Type"
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
final class NumberExtension[S](ec : ExtensionConfig) extends Extension {

  import NumberExtension._

  val uriPath = UriUtil.classUri(this)

  @TopLevel @ExpExt
  val Number : (S, Value) --> ISeq[(S, Value)] = {
    case (s, BasicValue(v)) =>
      if (v.indexOf(".") >= 0)
        (s, java.lang.Double.parseDouble(v))
      else
        (s, SireumNumber(BigInt(v)))
  }
}
