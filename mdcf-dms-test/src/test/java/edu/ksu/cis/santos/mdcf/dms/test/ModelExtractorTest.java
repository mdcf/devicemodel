/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.test;

import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.XStreamer.fromXml;
import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.XStreamer.toXml;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import junit.framework.Assert;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.google.common.io.Files;

import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dms.ModelExtractor;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public class ModelExtractorTest {

  public final static boolean GENERATE_EXPECTED = false;

  private XMLTestCase xmlUnit;

  void assertEquals(final File expected, final File result) throws Exception {
    final String expectedXml = Files.toString(
        expected,
        StandardCharsets.US_ASCII);
    final String resultXml = Files.toString(result, StandardCharsets.US_ASCII);
    assertEquals(expectedXml, resultXml);
  }

  void assertEquals(final String expectedXml, final String resultXml)
      throws SAXException, IOException {
    final DetailedDiff myDiff = new DetailedDiff(this.xmlUnit.compareXML(
        expectedXml,
        resultXml));
    final List<?> allDifferences = myDiff.getAllDifferences();
    Assert.assertEquals(myDiff.toString(), 0, allDifferences.size());
  }

  @Test
  public void example() throws Exception {
    test("dms.test", "edu.ksu.cis.santos.mdcf.dms.example");
  }

  @Before
  public void setUp() throws Exception {
    this.xmlUnit = new XMLTestCase() {
    };
  }

  void test(final String name, final String... packageNames) throws Exception {
    final Model m = ModelExtractor.extractModel(packageNames);

    testExpectedResult(name, m);
    testXml(m);
  }

  void testExpectedResult(final String name, final Model m)
      throws URISyntaxException, IOException, Exception {
    final File testDir = new File(new URI(getClass().getResource("").toURI()
        .toString().replace("/bin/", "/src/test/resources/")));

    final File expected = new File(testDir, "expected/" + name + ".xml");
    final File result = new File(testDir, "result/" + name + ".xml");
    if (ModelExtractorTest.GENERATE_EXPECTED || !expected.exists()) {
      Files.write(toXml(m), expected, StandardCharsets.US_ASCII);
    } else {
      Files.write(toXml(m), result, StandardCharsets.US_ASCII);
      assertEquals(expected, result);
    }
  }

  void testXml(final Model m) throws Exception {
    final String xml1 = toXml(m);
    assertEquals(xml1, toXml(fromXml(xml1)));
  }
}
