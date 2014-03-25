package edu.ksu.cis.santos.mdcf.dms.test;

import org.junit.Test;

import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.Weak.*;

public class AstConstructionTest {
  /*
   * val attr_init21 : (Set[Set[String]], Nat) = (Set(Set("one", "two")), 3)
   */
  @Test
  public void testAttrInit21() throws Exception {
    attribute(
        list(),
        tupleType(list(
            setType(setType(namedType("edu.ksu.cis.santos.mdcf.dms.examplev2.String"))),
            namedType("edu.ksu.cis.santos.mdcf.dms.examplev2.Nat"))),
        "attr_init21",
        some(tupleInit(list(
            setInit(list(setInit(list(basicInit("one"), basicInit("two"))))),
            basicInit("3")))));
  }
}
