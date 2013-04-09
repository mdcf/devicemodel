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
trait IsInteger {
  def asInteger : Integer

  override def equals(other : Any) =
    other match {
      case other : Integer   => this.asInteger == other
      case other : IsInteger => this.asInteger == other.asInteger
      case _                 => false
    }

  override def hashCode = asInteger.hashCode
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait IsInt {
  def asInt : Int

  override def equals(other : Any) =
    other match {
      case other : Int   => this.asInt == other
      case other : IsInt => this.asInt == other.asInt
      case _             => false
    }

  override def hashCode = asInt.hashCode
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait IsLong {
  def asLong : Long

  override def equals(other : Any) =
    other match {
      case other : Long   => this.asLong == other
      case other : IsLong => this.asLong == other.asLong
      case _              => false
    }

  override def hashCode = asLong.hashCode
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
sealed trait Integer {
  def upgrade : Integer
  def pack : Integer

  def toInt : Int
  def toLong : Long
  def toBigInt : BigInt

  def isPositive() : Boolean
  def isZero() : Boolean
  def isNegative() : Boolean

  def neg() : Integer

  def add(that : Integer) : Integer
  def add(n : Int) : Integer
  def add(n : Long) : Integer
  def add(n : BigInteger) : Integer
  def add(n : Apint) : Integer

  @inline
  def add(n : BigInt) : Integer = this.add(n.bigInteger)

  def sub(that : Integer) : Integer
  def sub(n : Int) : Integer
  def sub(n : Long) : Integer
  def sub(n : BigInteger) : Integer
  def sub(n : Apint) : Integer

  @inline
  def sub(n : BigInt) : Integer = this.sub(n.bigInteger)

  def mul(that : Integer) : Integer
  def mul(n : Int) : Integer
  def mul(n : Long) : Integer
  def mul(n : BigInteger) : Integer
  def mul(n : Apint) : Integer

  @inline
  def mul(n : BigInt) : Integer = this.mul(n.bigInteger)

  def div(that : Integer) : Integer
  def div(n : Int) : Integer
  def div(n : Long) : Integer
  def div(n : BigInteger) : Integer
  def div(n : Apint) : Integer

  @inline
  def div(n : BigInt) : Integer = this.div(n.bigInteger)

  def rem(that : Integer) : Integer
  def rem(n : Int) : Integer
  def rem(n : Long) : Integer
  def rem(n : BigInteger) : Integer
  def rem(n : Apint) : Integer

  @inline
  def rem(n : BigInt) : Integer = this.rem(n.bigInteger)

  def lt(that : Integer) : Boolean
  def lt(n : Int) : Boolean
  def lt(n : Long) : Boolean
  def lt(n : BigInteger) : Boolean
  def lt(n : Apint) : Boolean

  @inline
  def lt(n : BigInt) : Boolean = this.lt(n.bigInteger)

  def le(that : Integer) : Boolean
  def le(n : Int) : Boolean
  def le(n : Long) : Boolean
  def le(n : BigInteger) : Boolean
  def le(n : Apint) : Boolean

  @inline
  def le(n : BigInt) : Boolean = this.lt(n.bigInteger)

  def gt(that : Integer) : Boolean
  def gt(n : Int) : Boolean
  def gt(n : Long) : Boolean
  def gt(n : BigInteger) : Boolean
  def gt(n : Apint) : Boolean

  @inline
  def gt(n : BigInt) : Boolean = this.lt(n.bigInteger)

  def ge(that : Integer) : Boolean
  def ge(n : Int) : Boolean
  def ge(n : Long) : Boolean
  def ge(n : BigInteger) : Boolean
  def ge(n : Apint) : Boolean

  @inline
  def ge(n : BigInt) : Boolean = this.lt(n.bigInteger)

  @inline
  def unary_-() : Integer = neg

  @inline
  def +(that : Integer) : Integer = this.add(that)

  @inline
  def +(n : Int) : Integer = this.add(n)

  @inline
  def +(n : Long) : Integer = this.add(n)

  @inline
  def +(n : BigInteger) : Integer = this.add(n)

  @inline
  def +(n : BigInt) : Integer = this.add(n)

  @inline
  def +(n : Apint) : Integer = this.add(n)

  @inline
  def -(that : Integer) : Integer = this.sub(that)

  @inline
  def -(n : Int) : Integer = this.sub(n)

  @inline
  def -(n : Long) : Integer = this.sub(n)

  @inline
  def -(n : BigInteger) : Integer = this.sub(n)

  @inline
  def -(n : BigInt) : Integer = this.sub(n)

  @inline
  def -(n : Apint) : Integer = this.sub(n)

  @inline
  def *(that : Integer) : Integer = this.mul(that)

  @inline
  def *(n : Int) : Integer = this.mul(n)

  @inline
  def *(n : Long) : Integer = this.mul(n)

  @inline
  def *(n : BigInteger) : Integer = this.mul(n)

  @inline
  def *(n : BigInt) : Integer = this.mul(n)

  @inline
  def *(n : Apint) : Integer = this.mul(n)

  @inline
  def /(that : Integer) : Integer = this.div(that)

  @inline
  def /(n : Int) : Integer = this.div(n)

  @inline
  def /(n : Long) : Integer = this.div(n)

  @inline
  def /(n : BigInteger) : Integer = this.div(n)

  @inline
  def /(n : BigInt) : Integer = this.div(n)

  @inline
  def /(n : Apint) : Integer = this.div(n)

  @inline
  def %(that : Integer) : Integer = this.rem(that)

  @inline
  def %(n : Int) : Integer = this.rem(n)

  @inline
  def %(n : Long) : Integer = this.rem(n)

  @inline
  def %(n : BigInteger) : Integer = this.rem(n)

  @inline
  def %(n : BigInt) : Integer = this.rem(n)

  @inline
  def %(n : Apint) : Integer = this.rem(n)

  @inline
  def <(that : Integer) : Boolean = this.lt(that)

  @inline
  def <(n : Int) : Boolean = this.lt(n)

  @inline
  def <(n : Long) : Boolean = this.lt(n)

  @inline
  def <(n : BigInteger) : Boolean = this.lt(n)

  @inline
  def <(n : BigInt) : Boolean = this.lt(n)

  @inline
  def <(n : Apint) : Boolean = this.lt(n)

  @inline
  def <=(that : Integer) : Boolean = this.le(that)

  @inline
  def <=(n : Int) : Boolean = this.le(n)

  @inline
  def <=(n : Long) : Boolean = this.le(n)

  @inline
  def <=(n : BigInteger) : Boolean = this.le(n)

  @inline
  def <=(n : BigInt) : Boolean = this.le(n)

  @inline
  def <=(n : Apint) : Boolean = this.le(n)

  @inline
  def >(that : Integer) : Boolean = this.gt(that)

  @inline
  def >(n : Int) : Boolean = this.gt(n)

  @inline
  def >(n : Long) : Boolean = this.gt(n)

  @inline
  def >(n : BigInteger) : Boolean = this.gt(n)

  @inline
  def >(n : BigInt) : Boolean = this.gt(n)

  @inline
  def >(n : Apint) : Boolean = this.gt(n)

  @inline
  def >=(that : Integer) : Boolean = this.ge(that)

  @inline
  def >=(n : Int) : Boolean = this.ge(n)

  @inline
  def >=(n : Long) : Boolean = this.ge(n)

  @inline
  def >=(n : BigInteger) : Boolean = this.ge(n)

  @inline
  def >=(n : BigInt) : Boolean = this.ge(n)

  @inline
  def >=(n : Apint) : Boolean = this.ge(n)
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class IntInteger(value : Int) extends Integer {
  @inline
  def upgrade : LongInteger = SireumNumber(value.asInstanceOf[Long])

  @inline
  def pack : this.type = this

  def toInt : Int = value
  def toLong : Long = value
  def toBigInt : BigInt = BigInt(value)

  def isPositive() : Boolean = value > 0

  def isZero() : Boolean = value == 0

  def isNegative() : Boolean = value < 0

  def neg() : Integer =
    if (value == Int.MinValue) upgrade.neg
    else SireumNumber(-value)

  def add(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.add(v)
      case LongInteger(v)    => this.add(v)
      case IntegerInteger(v) => this.add(v)
    }

  def sub(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.sub(v)
      case LongInteger(v)    => this.sub(v)
      case IntegerInteger(v) => this.sub(v)
    }

  def mul(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.mul(v)
      case LongInteger(v)    => this.mul(v)
      case IntegerInteger(v) => this.mul(v)
    }

  def div(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.div(v)
      case LongInteger(v)    => this.div(v)
      case IntegerInteger(v) => this.div(v)
    }

  def rem(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.rem(v)
      case LongInteger(v)    => this.rem(v)
      case IntegerInteger(v) => this.rem(v)
    }

  def lt(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.lt(v)
      case LongInteger(v)    => this.lt(v)
      case IntegerInteger(v) => this.lt(v)
    }

  def le(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.le(v)
      case LongInteger(v)    => this.le(v)
      case IntegerInteger(v) => this.le(v)
    }

  def gt(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.gt(v)
      case LongInteger(v)    => this.gt(v)
      case IntegerInteger(v) => this.gt(v)
    }

  def ge(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.ge(v)
      case LongInteger(v)    => this.ge(v)
      case IntegerInteger(v) => this.ge(v)
    }

  @inline
  def add(n : Int) : Integer = {
    val r = value + n
    if (((value ^ r) & (n ^ r)) < 0)
      upgrade.add(n.asInstanceOf[Long])
    else
      SireumNumber(r)
  }

  @inline
  def add(n : Long) : Integer = upgrade.add(n)

  @inline
  def add(n : BigInteger) : IntegerInteger = upgrade.upgrade.add(n)

  @inline
  def add(n : Apint) : IntegerInteger = upgrade.upgrade.add(n)

  @inline
  def sub(n : Int) : Integer = {
    val r = value - n
    if (((value ^ r) & (n ^ r)) < 0)
      upgrade.sub(n.asInstanceOf[Long]).pack
    else
      SireumNumber(r)
  }

  @inline
  def sub(n : Long) : Integer = upgrade.sub(n)

  @inline
  def sub(n : BigInteger) : Integer = upgrade.upgrade.sub(n)

  @inline
  def sub(n : Apint) : Integer = upgrade.upgrade.sub(n)

  @inline
  def mul(n : Int) : Integer = {
    val r = value * n
    if (r == 0) return SireumNumber(r)

    if (n > value) {
      if (((n == -1) && (value == Int.MinValue)) || (r / n != value))
        return upgrade.mul(n.asInstanceOf[Long])
    } else {
      if (((value == -1) && (n == Int.MinValue)) || (r / value != n))
        return upgrade.mul(n.asInstanceOf[Long])
    }
    SireumNumber(r)
  }

  @inline
  def mul(n : Long) : Integer = upgrade.mul(n)

  @inline
  def mul(n : BigInteger) : IntegerInteger = upgrade.upgrade.mul(n)

  @inline
  def mul(n : Apint) : IntegerInteger = upgrade.upgrade.mul(n)

  @inline
  def div(n : Int) : Integer = {
    val r = value / n
    if ((value == Int.MinValue) && (n == -1))
      upgrade.div(n.asInstanceOf[Long]).pack
    else
      SireumNumber(r)
  }

  @inline
  def div(n : Long) : Integer = upgrade.div(n)

  @inline
  def div(n : BigInteger) : Integer = upgrade.upgrade.div(n)

  @inline
  def div(n : Apint) : Integer = upgrade.upgrade.div(n)

  @inline
  def rem(n : Int) : Integer = SireumNumber(value % n)

  @inline
  def rem(n : Long) : Integer = upgrade.rem(n)

  @inline
  def rem(n : BigInteger) : Integer = upgrade.upgrade.rem(n)

  @inline
  def rem(n : Apint) : Integer = upgrade.upgrade.rem(n)

  @inline
  def lt(n : Int) : Boolean = value < n

  @inline
  def lt(n : Long) : Boolean = upgrade.lt(n)

  @inline
  def lt(n : BigInteger) : Boolean = upgrade.upgrade.lt(n)

  @inline
  def lt(n : Apint) : Boolean = upgrade.upgrade.lt(n)

  @inline
  def le(n : Int) : Boolean = value <= n

  @inline
  def le(n : Long) : Boolean = upgrade.le(n)

  @inline
  def le(n : BigInteger) : Boolean = upgrade.upgrade.le(n)

  @inline
  def le(n : Apint) : Boolean = upgrade.upgrade.le(n)

  @inline
  def gt(n : Int) : Boolean = value > n

  @inline
  def gt(n : Long) : Boolean = upgrade.gt(n)

  @inline
  def gt(n : BigInteger) : Boolean = upgrade.upgrade.gt(n)

  @inline
  def gt(n : Apint) : Boolean = upgrade.upgrade.gt(n)

  @inline
  def ge(n : Int) : Boolean = value >= n

  @inline
  def ge(n : Long) : Boolean = upgrade.ge(n)

  @inline
  def ge(n : BigInteger) : Boolean = upgrade.upgrade.ge(n)

  @inline
  def ge(n : Apint) : Boolean = upgrade.upgrade.ge(n)

  override def hashCode = value

  override def equals(o : Any) : Boolean = {
    o match {
      case n : Integer =>
        n.pack match {
          case n : IntInteger => value == n.value
          case _              => false
        }
      case _ => false
    }
  }
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class LongInteger(value : Long) extends Integer {
  @inline
  def upgrade : IntegerInteger = SireumNumber(new Apint(value))

  @inline
  def pack : Integer =
    if ((value < Int.MinValue) || (value > Int.MaxValue))
      this
    else
      SireumNumber(value.asInstanceOf[Int])

  def toInt : Int = sys.error("Illegal call")
  def toLong : Long = value
  def toBigInt : BigInt = BigInt(value)

  def isPositive() : Boolean = value > 0

  def isZero() : Boolean = value == 0

  def isNegative() : Boolean = value < 0

  def neg() : Integer =
    if (value == Long.MinValue) upgrade.neg
    else SireumNumber(-value)

  def add(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.add(v)
      case LongInteger(v)    => this.add(v)
      case IntegerInteger(v) => this.add(v)
    }

  def sub(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.sub(v)
      case LongInteger(v)    => this.sub(v)
      case IntegerInteger(v) => this.sub(v)
    }

  def mul(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.mul(v)
      case LongInteger(v)    => this.mul(v)
      case IntegerInteger(v) => this.mul(v)
    }

  def div(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.div(v)
      case LongInteger(v)    => this.div(v)
      case IntegerInteger(v) => this.div(v)
    }

  def rem(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.rem(v)
      case LongInteger(v)    => this.rem(v)
      case IntegerInteger(v) => this.rem(v)
    }

  def lt(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.lt(v)
      case LongInteger(v)    => this.lt(v)
      case IntegerInteger(v) => this.lt(v)
    }

  def le(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.le(v)
      case LongInteger(v)    => this.le(v)
      case IntegerInteger(v) => this.le(v)
    }

  def gt(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.gt(v)
      case LongInteger(v)    => this.gt(v)
      case IntegerInteger(v) => this.gt(v)
    }

  def ge(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.ge(v)
      case LongInteger(v)    => this.ge(v)
      case IntegerInteger(v) => this.ge(v)
    }

  @inline
  def add(n : Int) : Integer = this.add(n.asInstanceOf[Long])

  @inline
  def add(n : Long) : Integer = {
    val r = value + n
    if (((value ^ r) & (n ^ r)) < 0L)
      upgrade.add(new Apint(n))
    else
      SireumNumber(r)
  }

  @inline
  def add(n : BigInteger) : Integer = upgrade.add(n)

  @inline
  def add(n : Apint) : Integer = upgrade.add(n)

  @inline
  def sub(n : Int) : Integer = this.sub(n.asInstanceOf[Long])

  @inline
  def sub(n : Long) : Integer = {
    val r = value - n
    if (((value ^ r) & (n ^ r)) < 0L)
      upgrade.sub(new Apint(n)).pack
    else
      SireumNumber(r)
  }

  @inline
  def sub(n : BigInteger) : Integer = upgrade.sub(n)

  @inline
  def sub(n : Apint) : Integer = upgrade.sub(n)

  @inline
  def mul(n : Int) : Integer = this.mul(n.asInstanceOf[Long])

  @inline
  def mul(n : Long) : Integer = {
    val r = value * n
    if (r == 0) return SireumNumber(r)

    if (n > value) {
      if (((n == -1) && (value == Long.MinValue)) || (r / n != value))
        return upgrade.mul(n.asInstanceOf[Long])
    } else {
      if (((value == -1) && (n == Long.MinValue)) || (r / value != n))
        return upgrade.mul(n.asInstanceOf[Long])
    }
    SireumNumber(r)
  }

  @inline
  def mul(n : BigInteger) : Integer = upgrade.mul(n)

  @inline
  def mul(n : Apint) : Integer = upgrade.mul(n)

  @inline
  def div(n : Int) : Integer = this.div(n.asInstanceOf[Long])

  @inline
  def div(n : Long) : Integer = {
    val r = value / n
    if ((value == Long.MinValue) && (n == -1))
      upgrade.div(n.asInstanceOf[Long]).pack
    else
      SireumNumber(r)
  }

  @inline
  def div(n : BigInteger) : Integer = upgrade.div(n)

  @inline
  def div(n : Apint) : Integer = upgrade.div(n)

  @inline
  def rem(n : Int) : Integer = this.rem(n.asInstanceOf[Long])

  @inline
  def rem(n : Long) : Integer = SireumNumber(value % n).pack

  @inline
  def rem(n : BigInteger) : Integer = upgrade.rem(n)

  @inline
  def rem(n : Apint) : Integer = upgrade.rem(n)

  @inline
  def lt(n : Int) : Boolean = this.lt(n.asInstanceOf[Long])

  @inline
  def lt(n : Long) : Boolean = value < n

  @inline
  def lt(n : BigInteger) : Boolean = upgrade.lt(n)

  @inline
  def lt(n : Apint) : Boolean = upgrade.lt(n)

  @inline
  def le(n : Int) : Boolean = this.le(n.asInstanceOf[Long])

  @inline
  def le(n : Long) : Boolean = value <= n

  @inline
  def le(n : BigInteger) : Boolean = upgrade.le(n)

  @inline
  def le(n : Apint) : Boolean = upgrade.le(n)

  @inline
  def gt(n : Int) : Boolean = this.gt(n.asInstanceOf[Long])

  @inline
  def gt(n : Long) : Boolean = value > n

  @inline
  def gt(n : BigInteger) : Boolean = upgrade.gt(n)

  @inline
  def gt(n : Apint) : Boolean = upgrade.gt(n)

  @inline
  def ge(n : Int) : Boolean = this.ge(n.asInstanceOf[Long])

  @inline
  def ge(n : Long) : Boolean = value >= n

  @inline
  def ge(n : BigInteger) : Boolean = upgrade.ge(n)

  @inline
  def ge(n : Apint) : Boolean = upgrade.ge(n)

  override def hashCode = value.asInstanceOf[Int]

  override def equals(o : Any) : Boolean = {
    (pack : @unchecked) match {
      case n : IntInteger =>
        n.equals(o)
      case n : LongInteger =>
        o match {
          case m : Integer =>
            m.pack match {
              case m : LongInteger => n.value == m.value
              case _               => false
            }
          case _ => false
        }
    }
  }
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
case class IntegerInteger(value : Apint) extends Integer {
  import SireumNumber._

  @inline
  def upgrade : this.type = this

  def toInt : Int = sys.error("Illegal call")
  def toLong : Long = sys.error("Illegal call")
  def toBigInt : BigInt = new BigInt(value.toBigInteger)

  def isPositive() : Boolean = value.signum == 1

  def isZero() : Boolean = value.signum == 0

  def isNegative() : Boolean = value.signum == -1

  def neg : Integer = SireumNumber(value.negate)

  @inline
  def pack : Integer =
    if ((value.compareTo(INT_MIN_AS_APINT) >= 0) && (value.compareTo(INT_MAX_AS_APINT) <= 0))
      SireumNumber(value.intValue)
    else if ((value.compareTo(LONG_MIN_AS_APINT) >= 0) && (value.compareTo(LONG_MAX_AS_APINT) <= 0))
      SireumNumber(value.longValue)
    else
      this

  def add(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.add(v)
      case LongInteger(v)    => this.add(v)
      case IntegerInteger(v) => this.add(v)
    }

  def sub(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.sub(v)
      case LongInteger(v)    => this.sub(v)
      case IntegerInteger(v) => this.sub(v)
    }

  def mul(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.mul(v)
      case LongInteger(v)    => this.mul(v)
      case IntegerInteger(v) => this.mul(v)
    }

  def div(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.div(v)
      case LongInteger(v)    => this.div(v)
      case IntegerInteger(v) => this.div(v)
    }

  def rem(that : Integer) : Integer =
    that match {
      case IntInteger(v)     => this.rem(v)
      case LongInteger(v)    => this.rem(v)
      case IntegerInteger(v) => this.rem(v)
    }

  def lt(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.lt(v)
      case LongInteger(v)    => this.lt(v)
      case IntegerInteger(v) => this.lt(v)
    }

  def le(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.le(v)
      case LongInteger(v)    => this.le(v)
      case IntegerInteger(v) => this.le(v)
    }

  def gt(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.gt(v)
      case LongInteger(v)    => this.gt(v)
      case IntegerInteger(v) => this.gt(v)
    }

  def ge(that : Integer) : Boolean =
    that match {
      case IntInteger(v)     => this.ge(v)
      case LongInteger(v)    => this.ge(v)
      case IntegerInteger(v) => this.ge(v)
    }

  @inline
  def add(n : Int) : IntegerInteger = this.add(new Apint(n))

  @inline
  def add(n : Long) : IntegerInteger = this.add(new Apint(n))

  @inline
  def add(n : BigInteger) : IntegerInteger = this.add(new Apint(n))

  @inline
  def add(n : Apint) : IntegerInteger = SireumNumber(value.add(n))

  @inline
  def sub(n : Int) : Integer = this.sub(new Apint(n))

  @inline
  def sub(n : Long) : Integer = this.sub(new Apint(n))

  @inline
  def sub(n : BigInteger) : Integer = this.sub(new Apint(n))

  @inline
  def sub(n : Apint) : Integer = SireumNumber(value.subtract(n)).pack

  @inline
  def mul(n : Int) : IntegerInteger = this.mul(new Apint(n))

  @inline
  def mul(n : Long) : IntegerInteger = this.mul(new Apint(n))

  @inline
  def mul(n : BigInteger) : IntegerInteger = this.mul(new Apint(n))

  @inline
  def mul(n : Apint) : IntegerInteger = SireumNumber(value.multiply(n))

  @inline
  def div(n : Int) : Integer = this.div(new Apint(n))

  @inline
  def div(n : Long) : Integer = this.div(new Apint(n))

  @inline
  def div(n : BigInteger) : Integer = this.div(new Apint(n))

  @inline
  def div(n : Apint) : Integer = SireumNumber(value.divide(n)).pack

  @inline
  def rem(n : Int) : Integer = this.rem(new Apint(n))

  @inline
  def rem(n : Long) : Integer = this.rem(new Apint(n))

  @inline
  def rem(n : BigInteger) : Integer = this.rem(new Apint(n))

  @inline
  def rem(n : Apint) : Integer = SireumNumber(value.mod(n)).pack

  @inline
  def lt(n : Int) : Boolean = this.lt(new Apint(n))

  @inline
  def lt(n : Long) : Boolean = this.lt(new Apint(n))

  @inline
  def lt(n : BigInteger) : Boolean = this.lt(new Apint(n))

  @inline
  def lt(n : Apint) : Boolean = value.compareTo(n) match {
    case -1 => true
    case _  => false
  }

  @inline
  def le(n : Int) : Boolean = this.le(new Apint(n))

  @inline
  def le(n : Long) : Boolean = this.le(new Apint(n))

  @inline
  def le(n : BigInteger) : Boolean = this.le(new Apint(n))

  @inline
  def le(n : Apint) : Boolean = value.compareTo(n) match {
    case 1 => false
    case _ => true
  }

  @inline
  def gt(n : Int) : Boolean = this.gt(new Apint(n))

  @inline
  def gt(n : Long) : Boolean = this.gt(new Apint(n))

  @inline
  def gt(n : BigInteger) : Boolean = this.gt(new Apint(n))

  @inline
  def gt(n : Apint) : Boolean = value.compareTo(n) match {
    case 1 => true
    case _ => false
  }

  @inline
  def ge(n : Int) : Boolean = this.ge(new Apint(n))

  @inline
  def ge(n : Long) : Boolean = this.ge(new Apint(n))

  @inline
  def ge(n : BigInteger) : Boolean = this.ge(new Apint(n))

  @inline
  def ge(n : Apint) : Boolean = value.compareTo(n) match {
    case -1 => false
    case _  => true
  }

  override def hashCode = value.hashCode

  override def equals(o : Any) : Boolean = {
    pack match {
      case n : IntInteger =>
        n.equals(o)
      case n : LongInteger =>
        n.equals(o)
      case n : IntegerInteger =>
        o match {
          case m : Integer =>
            m.pack match {
              case m : IntegerInteger => n.value == m.value
              case _                  => false
            }
          case _ => false
        }
    }
  }
}
