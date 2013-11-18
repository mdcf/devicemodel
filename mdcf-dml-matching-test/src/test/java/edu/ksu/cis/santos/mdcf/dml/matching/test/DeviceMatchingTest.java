/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.matching.test;

import static org.fest.assertions.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.SortedMap;

import org.junit.Test;

import com.google.common.io.Files;

import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dml.examplev2.extension.FloatExtension;
import edu.ksu.cis.santos.mdcf.dml.examplev2.extension.IntExtension;
import edu.ksu.cis.santos.mdcf.dml.examplev2.extension.NatExtension;
import edu.ksu.cis.santos.mdcf.dml.examplev2.extension.NumberExtension;
import edu.ksu.cis.santos.mdcf.dml.matching.AttributeMatch;
import edu.ksu.cis.santos.mdcf.dml.matching.Context;
import edu.ksu.cis.santos.mdcf.dml.matching.DeviceMatching;
import edu.ksu.cis.santos.mdcf.dml.matching.FeatureMatch;
import edu.ksu.cis.santos.mdcf.dml.serialization.XStreamer;
import edu.ksu.cis.santos.mdcf.dml.symbol.SymbolTable;
import edu.ksu.cis.santos.mdcf.dms.examplev2.requirement.AppReq1;
import edu.ksu.cis.santos.mdcf.dms.examplev2.requirement.AppReq2;
import edu.ksu.cis.santos.mdcf.dms.examplev2.requirement.AppReq2Alt;
import edu.ksu.cis.santos.mdcf.dms.examplev2.requirement.AppReq3;
import edu.ksu.cis.santos.mdcf.dms.examplev2.requirement.AppReq4;
import edu.ksu.cis.santos.mdcf.dms.examplev2.requirement.AppReq5;
import edu.ksu.cis.santos.mdcf.dms.examplev2.requirement.PulseOxDisplayApp;
import edu.ksu.cis.santos.mdcf.dms.test.ModelExtractorTest;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public class DeviceMatchingTest {

  private static boolean GENERATE_EXPECTED = false;
  private static SymbolTable ST = SymbolTable.of(XStreamer
      .<Model> fromXml(ModelExtractorTest.class
          .getResourceAsStream("expected/dms.testv2.xml")));
  private static String[] extensions = new String[] {
      FloatExtension.class.getName(), NatExtension.class.getName(),
      IntExtension.class.getName(), NumberExtension.class.getName() };

  void assertEquals(final File expected, final File result) throws Exception {
    final List<String> expectedLines = Files.readLines(
        expected,
        StandardCharsets.US_ASCII);
    final List<String> resultLines = Files.readLines(
        result,
        StandardCharsets.US_ASCII);

    assertThat(resultLines).isEqualTo(expectedLines);
  }

  @Test
  public void testCase1() throws Exception {
    testProductMatches(AppReq1.class);
  }

  @Test
  public void testCase2() throws Exception {
    testProductMatches(AppReq2.class);
  }

  @Test
  public void testCase2Alt() throws Exception {
    testProductMatches(AppReq2Alt.class);
  }

  @Test
  public void testCase3() throws Exception {
    testProductMatches(AppReq3.class);
  }

  @Test
  public void testCase4() throws Exception {
    testProductMatches(AppReq4.class);
  }

  @Test
  public void testCase5() throws Exception {
    testProductMatches(AppReq5.class);
  }

  @Test
  public void testPulseOxDisplay() throws Exception {
    testProductMatches(PulseOxDisplayApp.class);
  }
  
  void testExpectedResult(final String name, final String content)
      throws URISyntaxException, IOException, Exception {
    final File testDir = new File(new URI(getClass().getResource("").toURI()
        .toString().replace("/bin/", "/src/test/resources/")));

    final File expected = new File(testDir, "expected/" + name + ".rst");
    final File result = new File(testDir, "result/" + name + ".rst");
    if (DeviceMatchingTest.GENERATE_EXPECTED || !expected.exists()) {
      expected.getParentFile().mkdirs();
      Files.write(content, expected, StandardCharsets.US_ASCII);
    } else {
      result.getParentFile().mkdirs();
      Files.write(content, result, StandardCharsets.US_ASCII);
      assertEquals(expected, result);
    }
  }

  void testProductMatches(final Class<?> c) throws Exception {
    final Context ctx = new Context(DeviceMatchingTest.ST,
        DeviceMatchingTest.extensions);
    final SortedMap<String, List<FeatureMatch>> result = new DeviceMatching(ctx)
        .productMatches(
            new HashSet<String>(),
            DeviceMatchingTest.ST.requirement(c.getName()));

    final StringWriter sw = new StringWriter();
    final PrintWriter pw = new PrintWriter(sw);

    if (result.isEmpty()) {
      pw.println("Found no matches!");
    } else {
      pw.println("Found " + result.size() + " match(es)!");
      pw.println();

      for (final List<FeatureMatch> l : result.values()) {
        for (final FeatureMatch fm : l) {
          pw.println("Match: " + fm.feature().name);
          for (final AttributeMatch am : fm.attributeMatches().values()) {
            pw.println();
            pw.println("* " + am.attribute().name + ": " + am.path());
            final String matchString = am.initMatch().toString();
            pw.println("  "
                + (matchString.length() > 100 ? matchString.substring(0, 100)
                    + " ..." : matchString));
          }
          pw.println();
        }
      }
    }

    testExpectedResult(c.getSimpleName(), sw.toString());
  }
}
