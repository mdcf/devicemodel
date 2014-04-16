/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
 */

package edu.ksu.cis.santos.mdcf.dms.test;

import static edu.ksu.cis.santos.mdcf.dml.serialization.XStreamer.fromXml;
import static edu.ksu.cis.santos.mdcf.dml.serialization.XStreamer.toXml;
import static org.fest.assertions.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.google.common.io.Files;

import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dms.ModelExtractor;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.NoninPulseOx;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.NellcorPulseOx;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.NellcorGetExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.NellcorPeriodicExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.NellcorSetExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.NellcorSporadicExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.NoninGetExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.NoninPeriodicExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.MultiMonitor;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.MultiMonitorGetExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.MultiMonitorPeriodicExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.MultiMonitorSetExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.MultiMonitorSporadicExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.SimpleCapnography;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.SimpleCapnographyGetExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.product.SimpleCapnographyPeriodicExchange;
import edu.ksu.cis.santos.mdcf.dms.examplev2.requirement.PulseOxDisplayApp;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public class ModelExtractorTest {

	private static boolean GENERATE_EXPECTED = false;

	private XMLTestCase xmlUnit;

	void assertEquals(final File expected, final File result) throws Exception {
		final String expectedXml = Files.toString(expected,
				StandardCharsets.US_ASCII);
		final String resultXml = Files.toString(result,
				StandardCharsets.US_ASCII);
		this.assertEquals(expectedXml, resultXml);
	}

	void assertEquals(final String expectedXml, final String resultXml)
			throws SAXException, IOException {
		final DetailedDiff myDiff = new DetailedDiff(this.xmlUnit.compareXML(
				expectedXml, resultXml));
		final List<?> allDifferences = myDiff.getAllDifferences();
		assertThat(allDifferences.size()).isZero().describedAs(
				myDiff.toString());
	}

	@Test
	public void example() throws Exception {
		test("dms.test", new String[] { "edu.ksu.cis.santos.mdcf.dms.example" });
	}

/*	yjkim issue @Test
	public void examplev2() throws Exception {
		test("dms.testv2",
				new String[] { "edu.ksu.cis.santos.mdcf.dms.examplev2" });
	}*/

	@Test
	public void examplev2nonin() throws Exception {
		test("dms.testv2.nonin", new String[] {},
				new String[] { NoninPulseOx.class.getName(),
						NoninGetExchange.class.getName(),
						NoninPeriodicExchange.class.getName()});
	}

	@Test
	public void examplev2nellcor() throws Exception {
		test("dms.testv2.nellcor", new String[] {},
				new String[] { NellcorPulseOx.class.getName(),
						NellcorGetExchange.class.getName(),
						NellcorPeriodicExchange.class.getName(),
						NellcorSetExchange.class.getName(),
						NellcorSporadicExchange.class.getName() });
	}

	@Test
	public void examplev2multimonitor() throws Exception {
		test("dms.testv2.multimonitor", new String[] {},
				new String[] { MultiMonitor.class.getName(),
						MultiMonitorGetExchange.class.getName(),
						MultiMonitorPeriodicExchange.class.getName(),
						MultiMonitorSetExchange.class.getName(),
						MultiMonitorSporadicExchange.class.getName() });
	}
	
	@Test
	public void examplev2simplecapnography() throws Exception {
		test("dms.testv2.simplecapnography", new String[] {},
						new String[] { SimpleCapnography.class.getName(),
						SimpleCapnographyGetExchange.class.getName(),
							SimpleCapnographyPeriodicExchange.class.getName() });
	}
	
//	@Test
//	public void examplev2simplepca() throws Exception {
//		test("dms.testv2.simplepca", new String[] {},
//						new String[] { SimplePCA.class.getName(),
//						SimplePCAGetExchange.class.getName(),
//						SimplePCASetExchange.class.getName(),
//						SimplePCAActionExchange.class.getName(),
//						SimplePCAPeriodicExchange.class.getName(),
//						SimplePCASporadicExchange.class.getName() });
//	}

	@Test
	public void examplev2SchemaAndClass() throws Exception {
		test("dms.testv2.common", new String[] {
				"edu.ksu.cis.santos.mdcf.dms.examplev2.schema",
				"edu.ksu.cis.santos.mdcf.dms.examplev2.clas" });
	}

	@Test
	public void examplev2Requirements() throws Exception {
		test("dms.testv2.requirements",
				new String[] { "edu.ksu.cis.santos.mdcf.dms.examplev2.requirement" });
	}

	@Test
	public void examplev2PulseOxReq() throws Exception {
		test("dms.testv2.req.pulseox", new String[] {},
				new String[] { PulseOxDisplayApp.class.getName()});
	}

//	 @Test
//	  public void examplev2Case4Req() throws Exception {
//	    test("dms.testv2.req.pulseox", new String[] {},
//	        new String[] { AppReq4.class.getName()});
//	  }
	
	@Before
	public void setUp() throws Exception {
		this.xmlUnit = new XMLTestCase() {
		};
	}

	void test(final String name, final String[] packageNames) throws Exception {
		test(name, packageNames, new String[0]);
	}

	void test(final String name, final String[] packageNames,
			final String[] classNames) throws Exception {
		final Model m = (Model) ModelExtractor.extractModel(packageNames, classNames);

		testExpectedResult(name, m);
		testXml(m);
	}

	void testExpectedResult(final String name, final Model m)
			throws URISyntaxException, IOException, Exception {
		final File testDir = new File(new URI(getClass().getResource("")
				.toURI().toString().replace("/bin/", "/src/test/resources/")));

		final File expected = new File(testDir, "expected/" + name + ".xml");
		final File result = new File(testDir, "result/" + name + ".xml");
		if (ModelExtractorTest.GENERATE_EXPECTED || !expected.exists()) {
			Files.write(toXml(m), expected, StandardCharsets.US_ASCII);
		} else {
			Files.write(toXml(m), result, StandardCharsets.US_ASCII);
			this.assertEquals(expected, result);
		}
	}

	void testXml(final Model m) throws Exception {
		final String xml1 = toXml(m);
		final Model m2 = fromXml(xml1);
		assertThat(m2.toString()).isEqualTo(m.toString());
		this.assertEquals(xml1, toXml(m2));
	}
}
