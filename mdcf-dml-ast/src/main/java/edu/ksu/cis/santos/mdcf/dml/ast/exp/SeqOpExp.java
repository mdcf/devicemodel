/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast.exp;

import edu.ksu.cis.santos.mdcf.dml.ast.IVisitor;
import edu.ksu.cis.santos.mdcf.dml.ast.Type;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class SeqOpExp extends Exp {
  public final String id;
  public final Exp exp;

  public SeqOpExp(final String id, final Exp exp) {
    this.id = id.intern();
    this.exp = exp;
  }

  SeqOpExp(final String id, final Exp exp, final Type type) {
    super(type);
    this.id = id.intern();
    this.exp = exp;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.id, this.exp };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitExp(this);
    final boolean b2 = visitor.visitSeqOpExp(this);
    return b1 && b2;
  }

  @Override
  public Exp withType(final Type type) {
    return new SeqOpExp(this.id, this.exp, type);
  }
}
