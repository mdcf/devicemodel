package edu.ksu.cis.santos.mdcf.dms

import edu.ksu.cis.santos.mdcf.dms.examplev2.String
package object examplev2 {
  import language.implicitConversions
  implicit def sp[T, T2 <: T](p : (java.lang.String, T2)) : (String, T) = (String(p._1), p._2)
}