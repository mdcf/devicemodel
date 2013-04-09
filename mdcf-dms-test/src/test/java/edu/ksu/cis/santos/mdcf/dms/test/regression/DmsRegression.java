/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.test.regression;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import edu.ksu.cis.santos.mdcf.dms.test.ModelExtractorTest;
import edu.ksu.cis.santos.mdcf.dms.test.SymbolTableTest;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
@RunWith(Suite.class)
@SuiteClasses({ ModelExtractorTest.class, SymbolTableTest.class })
public class DmsRegression {
}
