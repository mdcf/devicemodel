package edu.ksu.cis.santos.mdcf.dms.example

package object v2 {
  import language.implicitConversions
  implicit def sp[T](p : (java.lang.String, T)) = (String(p._1), p._2)
}