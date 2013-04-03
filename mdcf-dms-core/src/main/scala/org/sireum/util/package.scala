/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
package object util {
  type -->[D, I] = PartialFunction[D, I]

  type FileResourceUri = String

  type ResourceUri = String

  type VisitorFunction = Any --> Boolean
  type RewriteFunction = Any --> Any

  type CSeq[T] = scala.collection.Seq[T]
  type CMap[K, V] = scala.collection.Map[K, V]
  type CSet[T] = scala.collection.Set[T]

  type GenSeq[T] = scala.collection.GenSeq[T]

  type MSeq[T] = scala.collection.mutable.Seq[T]
  type MBitSet = scala.collection.mutable.BitSet
  type MBuffer[T] = scala.collection.mutable.Buffer[T]
  type MArray[T] = scala.collection.mutable.ArrayBuffer[T]
  type MList[T] = scala.collection.mutable.ListBuffer[T]
  type MMap[K, V] = scala.collection.mutable.Map[K, V]
  type MIdMap[K, V] = MMap[K, V]
  type MConcMap[K, V] = scala.collection.concurrent.Map[K, V]
  type MSet[T] = scala.collection.mutable.Set[T]
  type MLinkedSet[T] = scala.collection.mutable.LinkedHashSet[T]
  type MLinkedMap[K, V] = scala.collection.mutable.LinkedHashMap[K, V]
  type MIdSet[T] = MMap[T, T]
  type MStack[T] = scala.collection.mutable.Stack[T]

  @inline
  def mbitsetEmpty() : MBitSet = scala.collection.mutable.BitSet.empty

  @inline
  def mbitsetEmpty(size : Int) : MBitSet = new scala.collection.mutable.BitSet(size)

  @inline
  def marrayEmpty[T] : MArray[T] = scala.collection.mutable.ArrayBuffer.empty[T]

  @inline
  def mlistEmpty[T] : MList[T] = scala.collection.mutable.ListBuffer.empty[T]

  @inline
  def mmapEmpty[K, V] : MMap[K, V] = scala.collection.mutable.Map.empty[K, V]

  @inline
  def mlinkedSetEmpty[T] : MLinkedSet[T] = scala.collection.mutable.LinkedHashSet.empty[T]

  @inline
  def mlinkedMapEmpty[K, V] : MLinkedMap[K, V] = scala.collection.mutable.LinkedHashMap.empty[K, V]

  @inline
  def msetEmpty[T] : MSet[T] = scala.collection.mutable.Set.empty[T]

  @inline
  def mstackEmpty[T] : MStack[T] = scala.collection.mutable.Stack.empty[T]

  @inline
  def idmapEmpty[K, V] : MIdMap[K, V] = {
    import scala.collection.JavaConversions._

    new java.util.IdentityHashMap[K, V]
  }

  @inline
  def idsetEmpty[T] : MIdSet[T] = {
    import scala.collection.JavaConversions._

    new java.util.IdentityHashMap[T, T]
  }

  @inline
  def idmapEmpty[K, V](initialCapacity : Int) : MMap[K, V] = {
    import scala.collection.JavaConversions._

    new java.util.IdentityHashMap[K, V](initialCapacity)
  }

  @inline
  def cmapEmpty[K, V] : MConcMap[K, V] = {
    import scala.collection.JavaConversions._
    new java.util.concurrent.ConcurrentHashMap[K, V]()
  }

  type IBitSet = scala.collection.immutable.BitSet
  type ISeq[T] = scala.collection.immutable.Seq[T]
  type IVector[T] = scala.collection.immutable.Vector[T]
  type IList[T] = scala.collection.immutable.List[T]
  type IMap[K, V] = scala.collection.immutable.Map[K, V]
  type ILinkedMap[K, V] = scala.collection.immutable.ListMap[K, V]
  type ISortedMap[K, V] = scala.collection.immutable.SortedMap[K, V]
  type ISet[T] = scala.collection.immutable.Set[T]
  type ISortedSet[T] = scala.collection.immutable.SortedSet[T]
  type IStack[T] = scala.collection.immutable.Stack[T]

  @inline
  def ibitsetEmpty : IBitSet = scala.collection.immutable.BitSet.empty

  @inline
  def ilistEmpty[T] : IList[T] = scala.collection.immutable.List.empty[T]

  @inline
  def ilist[T](args : T*) : IList[T] = List(args : _*)

  @inline
  def ivectorEmpty[T] : IVector[T] = scala.collection.immutable.Vector.empty[T]

  @inline
  def ivector[T](args : T*) : IVector[T] = Vector(args : _*)

  @inline
  def seq2ivect[T](seq : CSeq[T]) : IVector[T] = {
    val vb = Vector.newBuilder[T]
    vb ++= seq
    vb.result
  }

  @inline
  def imapEmpty[K, V] : IMap[K, V] = scala.collection.immutable.Map.empty[K, V]

  @inline
  def ilinkedMapEmpty[K, V] : ILinkedMap[K, V] = scala.collection.immutable.ListMap.empty[K, V]

  @inline
  def ilinkedMap[K, V](ps : (K, V)*) : ILinkedMap[K, V] = {
    var r = ilinkedMapEmpty[K, V]
    for (p <- ps)
      r = r + p
    r
  }

  @inline
  def isortedMapEmpty[K <% Ordered[K], V] : ISortedMap[K, V] = scala.collection.immutable.SortedMap.empty[K, V]

  @inline
  def isetEmpty[T] : ISet[T] = scala.collection.immutable.Set.empty[T]

  @inline
  def isortedSetEmpty[T <% Ordered[T]] : ISortedSet[T] = scala.collection.immutable.SortedSet.empty[T]

  @inline
  def istackEmpty[T] : IStack[T] = scala.collection.immutable.Stack.empty[T]

  def mmapGetOrElseUpdateT[K, V] //
  (map : MMap[K, V], key : K,
   defaultValue : => V, keyTransformer : K => K) : V =
    map.get(key) match {
      case Some(v) => v
      case _ =>
        val v = defaultValue
        map(keyTransformer(key)) = v;
        v
    }

  @inline
  def cintersect[T](s1 : CSet[T], s2 : CSet[T]) = s1.intersect(s2)

  @inline
  def cunion[T](s1 : CSet[T], s2 : CSet[T]) = s1.union(s2)

  @inline
  def bigCIntersect[T](it : Iterable[CSet[T]]) : CSet[T] =
    it.size match {
      case 0 => Set()
      case 1 => it.iterator.next
      case _ => it.reduce(cintersect[T])
    }

  @inline
  def bigCUnion[T](it : Iterable[CSet[T]]) : CSet[T] =
    it.size match {
      case 0 => Set()
      case 1 => it.iterator.next
      case _ => it.reduce(cunion[T])
    }

  @inline
  def iintersect[T](s1 : ISet[T], s2 : ISet[T]) = s1.intersect(s2)

  @inline
  def iunion[T](s1 : ISet[T], s2 : ISet[T]) = s1.union(s2)

  @inline
  def bigIIntersect[T](it : Iterable[ISet[T]]) : ISet[T] =
    it.size match {
      case 0 => Set()
      case 1 => it.iterator.next
      case _ => it.reduce(iintersect[T])
    }

  @inline
  def bigIUnion[T](it : Iterable[ISet[T]]) : ISet[T] =
    it.size match {
      case 0 => Set()
      case 1 => it.iterator.next
      case _ => it.reduce(iunion[T])
    }

  val ignoringVisitorFunction : VisitorFunction = {
    case _ => false
  }

  @inline
  def stringInternFunction(s : String) = s.intern

  @inline
  def tozero(n : Int) = scala.collection.immutable.Range.inclusive(n, 0, -1)

  @inline
  def untilzero(n : Int) = scala.collection.immutable.Range.inclusive(n - 1, 0, -1)

  @inline
  def identity[T](x : T) = x

  @inline
  def first1[T1](t : Tuple1[T1]) = t._1

  @inline
  def first2[T1, T2](t : Tuple2[T1, T2]) = t._1

  @inline
  def first3[T1, T2, T3](t : Tuple3[T1, T2, T3]) = t._1

  @inline
  def first4[T1, T2, T3, T4](t : Tuple4[T1, T2, T3, T4]) = t._1

  @inline
  def first5[T1, T2, T3, T4, T5](t : Tuple5[T1, T2, T3, T4, T5]) = t._1

  @inline
  def second2[T1, T2](t : Tuple2[T1, T2]) = t._2

  @inline
  def second3[T1, T2, T3](t : Tuple3[T1, T2, T3]) = t._2

  @inline
  def second4[T1, T2, T3, T4](t : Tuple4[T1, T2, T3, T4]) = t._2

  @inline
  def second5[T1, T2, T3, T4, T5](t : Tuple5[T1, T2, T3, T4, T5]) = t._2

  @inline
  def third3[T1, T2, T3](t : Tuple3[T1, T2, T3]) = t._3

  @inline
  def third4[T1, T2, T3, T4](t : Tuple4[T1, T2, T3, T4]) = t._3

  @inline
  def third5[T1, T2, T3, T4, T5](t : Tuple5[T1, T2, T3, T4, T5]) = t._3

  @inline
  def fourth4[T1, T2, T3, T4](t : Tuple4[T1, T2, T3, T4]) = t._4

  @inline
  def fourth5[T1, T2, T3, T4, T5](t : Tuple5[T1, T2, T3, T4, T5]) = t._4

  @inline
  def fifth5[T1, T2, T3, T4, T5](t : Tuple5[T1, T2, T3, T4, T5]) = t._5

  @inline
  def truePredicate1[T](t : T) : Boolean = true

  @inline
  def truePredicate2[T1, T2](t1 : T1, t2 : T2) : Boolean = true

  @inline
  def truePredicate3[T1, T2, T3](t1 : T1, t2 : T2, t3 : T3) : Boolean = true

  @inline
  def falsePredicate1[T](t : T) : Boolean = false

  @inline
  def falsePredicate2[T1, T2](t1 : T1, t2 : T2) : Boolean = false

  @inline
  def falsePredicate3[T1, T2, T3](t1 : T1, t2 : T2, t3 : T3) : Boolean = false

  trait IsBoolean {
    def asBoolean : Boolean

    override def equals(other : Any) =
      other match {
        case other : Boolean   => this.asBoolean == other
        case other : IsBoolean => this.asBoolean == other.asBoolean
        case _                 => false
      }

    override def hashCode = asBoolean.hashCode
  }

  def applyIfInstance[T](t : Any, g : T => Unit)(implicit m : Manifest[T]) = {
    t match {
      case t : T => g(t)
      case _     =>
    }
  }
  
  def min(n : Int, m : Int) = if (n < m) n else m
  
  def max(n : Int, m : Int) = if (n > m) n else m

}  
