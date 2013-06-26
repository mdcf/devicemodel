/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import edu.ksu.cis.santos.mdcf.dml.ast.exp.FunExp;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class Invariant extends Member {
  public final PredicateType predicateType;
  public final FunExp predicate;

  public Invariant(final String name, final PredicateType predicateType,
      final FunExp predicate) {
    super(name);
    this.predicateType = predicateType;
    this.predicate = predicate;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.name, this.predicate };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitMember(this);
    final boolean b2 = visitor.visitInvariant(this);
    return b1 && b2;
  }
}
