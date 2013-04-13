import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import edu.ksu.cis.santos.mdcf.dml.ast._
import Ast._

@RunWith(classOf[JUnitRunner])
class ExsModel extends FunSuite {

  test("Empty model construction") {

    val m = model(list())    // create a model with empty declarations
    println(m) //               output: model(list())
    println(m.declarations)  // output: []

    val m2 = org.sireum.util.Reflection.eval[Model](s""" 
      import edu.ksu.cis.santos.mdcf.dml.ast.Ast._
      ${m.toString}
    """)
    println(m2) //              output: model(list())

  }
}