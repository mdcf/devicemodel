/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.list;

import java.util.List;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class SeqInit extends Initialization {
  public final List<Initialization> inits;

  public SeqInit(final Iterable<Initialization> inits) {
    this.inits = list(inits);
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.inits };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitInitialization(this);
    final boolean b2 = visitor.visitSeqInit(this);
    return b1 && b2;
  }
}
