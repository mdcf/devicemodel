/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import java.util.List;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class App extends Feature {

  public App(final String name, final List<NamedType> supers,
      final List<Member> members) {
    super(Feature.Level.Product, name, supers, members);
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.name, this.supers, this.members };
  }
}
