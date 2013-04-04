package edu.ksu.cis.santos.mdcf.dms.test;

import org.junit.Test;

import edu.ksu.cis.santos.mdcf.dml.ast.Ast;
import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dms.ModelExtractor;

public class ModelExtractorTest {

  @Test
  public void testExample() {
    Model m = ModelExtractor.extractModel(
        getClass().getClassLoader(),
        new String[] { "edu.ksu.cis.santos.mdcf.dms.example" });
    System.out.println(Ast.XStreamer.toXml(m));
  }
}
