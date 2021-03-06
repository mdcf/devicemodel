/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.util;

/**
 * Provides API for reporting information to users.
 * 
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public interface Reporter {
  void error(String message);

  void info(String message);

  void warning(String message);

  void internalError(String message);
}
