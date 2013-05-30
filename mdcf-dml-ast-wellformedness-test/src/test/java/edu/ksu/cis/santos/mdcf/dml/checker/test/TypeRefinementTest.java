package edu.ksu.cis.santos.mdcf.dml.checker.test;

//import static edu.ksu.cis.santos.mdcf.dml.serialization.XStreamer.toXml;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dml.checker.TypeRefinementChecker;
import edu.ksu.cis.santos.mdcf.dms.ModelExtractor;

public class TypeRefinementTest {
	private static Model m;
	private static TypeRefinementChecker checker;
	
	
	@BeforeClass
	public static void buildModel() throws Exception{
		TypeRefinementTest.m = loadModel("dms.test",
				"edu.ksu.cis.santos.mdcf.dms.example");
		//String mXml = toXml(m);
		//System.out.println(mXml);
		
		TypeRefinementTest.checker = new TypeRefinementChecker(
				m);
		checker.init();
	}
	
	@Test
	public void checkBasicTypeRefinement() throws Exception{
		if (!checker.checkBasicTypeRefinement()) {
			throw new Exception();
		}
	}
	
	@Test
	public void checkFeatureTypeRefinement() throws Exception{
		if (!checker.checkFeatureTypeRefinement()) {
			throw new Exception();
		}
	}
	
	@Test
	public void checkTypeRefinementRulesOnAllFeatures() throws Exception{
		if (!checker.checkTypeRefinementRulesOnAllFeatures()) {
			throw new Exception();
		}
	}
	
	private static Model loadModel(final String name, final String... packageNames)
			throws Exception {
		final Model m = ModelExtractor.extractModel(packageNames);
		return m;
	}
	
}
