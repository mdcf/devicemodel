/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.util.math

import org.apfloat.Apint
import java.math.BigInteger

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object SireumNumber {
  def apply(n : Int) = integer(n)
  def apply(n : Long) = integer(n)
  def apply(n : BigInt) = integer(n)
  def apply(n : BigInteger) = integer(n)
  def apply(n : Apint) = integer(n)

  def integer(n : Int) = new IntInteger(n)
  def integer(n : Long) = new LongInteger(n)
  def integer(n : BigInt) = new IntegerInteger(new Apint(n.bigInteger))
  def integer(n : BigInteger) = new IntegerInteger(new Apint(n))
  def integer(n : Apint) = new IntegerInteger(n)

  val INT_MIN_AS_APINT = new Apint(Int.MinValue)
  val INT_MAX_AS_APINT = new Apint(Int.MaxValue)
  val LONG_MIN_AS_APINT = new Apint(Long.MinValue)
  val LONG_MAX_AS_APINT = new Apint(Long.MaxValue)
}
