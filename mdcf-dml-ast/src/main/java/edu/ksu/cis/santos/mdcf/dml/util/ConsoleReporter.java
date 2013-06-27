/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.util;

/**
 * Provides API for reporting information to users through the console.
 * 
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public class ConsoleReporter
    implements Reporter {

  @Override
  public void error(final String message) {
    System.err.println(message);
    System.err.flush();
  }

  @Override
  public void info(final String message) {
    System.out.println(message);
    System.out.flush();
  }

  @Override
  public void internalError(final String message) {
    System.err.println("*** INTERNAL ERROR ***");
    System.err.println(message);
    System.err.flush();
  }

  @Override
  public void warning(final String message) {
    System.out.println(message);
    System.out.flush();
  }

}
