package edu.ksu.cis.santos.mdcf.dml.checker.test;

/*
 Copyright (c) 2013 Robby, Kansas State University.        
 All rights reserved. This program and the accompanying materials      
 are made available under the terms of the Eclipse Public License v1.0 
 which accompanies this distribution, and is available at              
 http://www.eclipse.org/legal/epl-v10.html                             
 */

import static edu.ksu.cis.santos.mdcf.dml.serialization.XStreamer.toXml;
import org.junit.Test;

import edu.ksu.cis.santos.mdcf.dml.ast.*;
import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.Weak.*;
import edu.ksu.cis.santos.mdcf.dml.checker.BasicTypeWellFormednessChecker;
import edu.ksu.cis.santos.mdcf.dml.checker.BasicTypeWellFormednessCheckerUsingSymbolTable;
import edu.ksu.cis.santos.mdcf.dms.ModelExtractor;

public class WellformednessTest {

	@Test
	public void testBasicTypeWellformedness() throws Exception {
		final Model m = loadModel("dms.test",
				"edu.ksu.cis.santos.mdcf.dms.example");
		BasicTypeWellFormednessChecker checker = new BasicTypeWellFormednessChecker(
				m);
		checker.init();

		if (!checker.checkBasicTypeWellformedness_NonBasicType()) {
			throw new Exception();
		}
		if (!checker.checkBasicTypeWellformedness_CyclicInheritance()) {
			throw new Exception();
		}
	}

	@Test
	public void testBasicTypeWellformednessNonBasic() throws Exception {
		Model m = model(list(basicType("A", list(namedType("B")))));
		String mXml = toXml(m);
		System.out.println(mXml);

		BasicTypeWellFormednessChecker checker = new BasicTypeWellFormednessChecker(
				m);
		checker.init();

		if (checker.checkBasicTypeWellformedness_NonBasicType()) {
			throw new Exception();
		}
		if (!checker.checkBasicTypeWellformedness_CyclicInheritance()) {
			throw new Exception();
		}
	}

	@Test
	public void testBasicTypeWellformednessCyclic() throws Exception {
		Model m = model(list(basicType("A", list(namedType("B"))),
				basicType("B", list(namedType("A")))));
		String mXml = toXml(m);
		System.out.println(mXml);

		BasicTypeWellFormednessChecker checker = new BasicTypeWellFormednessChecker(
				m);
		checker.init();

		if (!checker.checkBasicTypeWellformedness_NonBasicType()) {
			throw new Exception();
		}
		if (checker.checkBasicTypeWellformedness_CyclicInheritance()) {
			throw new Exception();
		}
	}

	@Test
	public void testBasicTypeWellformednessUsingSymbolTable() throws Exception {
		final Model m = loadModel("dms.test",
				"edu.ksu.cis.santos.mdcf.dms.example");
		BasicTypeWellFormednessCheckerUsingSymbolTable checker = new BasicTypeWellFormednessCheckerUsingSymbolTable(
				m);
		checker.init();

		if (!checker.checkBasicTypeWellformedness_NonBasicType()) {
			throw new Exception();
		}
		if (!checker.checkBasicTypeWellformedness_CyclicInheritance()) {
			throw new Exception();
		}
	}

	@Test
	public void testBasicTypeWellformednessNonBasicUsingSymbolTable()
			throws Exception {
		Model m = model(list(basicType("A", list(namedType("B")))));
		String mXml = toXml(m);
		System.out.println(mXml);

		BasicTypeWellFormednessCheckerUsingSymbolTable checker = new BasicTypeWellFormednessCheckerUsingSymbolTable(
				m);
		checker.init();

		if (checker.checkBasicTypeWellformedness_NonBasicType()) {
			throw new Exception();
		}
		if (!checker.checkBasicTypeWellformedness_CyclicInheritance()) {
			throw new Exception();
		}
	}

	@Test
	public void testBasicTypeWellformednessCyclicUsingSymbolTable()
			throws Exception {
		Model m = model(list(basicType("A", list(namedType("B"))),
				basicType("B", list(namedType("A")))));
		String mXml = toXml(m);
		System.out.println(mXml);

		BasicTypeWellFormednessCheckerUsingSymbolTable checker = new BasicTypeWellFormednessCheckerUsingSymbolTable(
				m);
		checker.init();

		if (!checker.checkBasicTypeWellformedness_NonBasicType()) {
			throw new Exception();
		}
		if (checker.checkBasicTypeWellformedness_CyclicInheritance()) {
			throw new Exception();
		}
	}

	Model loadModel(final String name, final String... packageNames)
			throws Exception {
		final Model m = ModelExtractor.extractModel(packageNames);
		return m;
	}

}
