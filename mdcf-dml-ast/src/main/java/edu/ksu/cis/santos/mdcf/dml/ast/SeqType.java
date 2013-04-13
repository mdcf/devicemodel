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
public final class SeqType extends Type {
  public final Type elementType;

  public SeqType(final Type elementType) {
    this.elementType = elementType;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.elementType };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitType(this);
    final boolean b2 = visitor.visitSeqType(this);
    return b1 && b2;
  }
}
