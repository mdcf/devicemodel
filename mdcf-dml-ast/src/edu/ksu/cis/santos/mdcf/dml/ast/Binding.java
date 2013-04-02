/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class Binding extends AstNode {
  public final NamedType type;
  public final String name;

  public Binding(final NamedType type, final String name) {
    this.name = name.intern();
    this.type = type;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.type, this.name };
  }
}
