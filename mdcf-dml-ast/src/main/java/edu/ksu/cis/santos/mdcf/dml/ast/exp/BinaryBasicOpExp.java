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
public final class BinaryBasicOpExp extends Exp {
  public final Exp left;
  public final String op;
  public final Exp right;

  public BinaryBasicOpExp(final Exp left, final String op, final Exp right) {
    this.left = left;
    this.op = op.intern();
    this.right = right;
  }

  BinaryBasicOpExp(final Exp left, final String op, final Exp right,
      final Type type) {
    super(type);
    this.left = left;
    this.op = op.intern();
    this.right = right;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.left, this.op, this.right };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitExp(this);
    final boolean b2 = visitor.visitBinaryBasicOpExp(this);
    return b1 && b2;
  }

  @Override
  public Exp withType(final Type type) {
    return new BinaryBasicOpExp(this.left, this.op, this.right, type);
  }
}
