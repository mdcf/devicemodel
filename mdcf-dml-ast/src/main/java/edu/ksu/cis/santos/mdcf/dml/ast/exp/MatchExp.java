/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast.exp;

import static edu.ksu.cis.santos.mdcf.dml.ast.Ast.list;

import java.util.List;

import edu.ksu.cis.santos.mdcf.dml.ast.IVisitor;
import edu.ksu.cis.santos.mdcf.dml.ast.Type;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class MatchExp extends Exp {
  public final Exp exp;
  public final List<MatchCase> cases;

  public MatchExp(final Exp exp, final List<MatchCase> cases) {
    this.exp = exp;
    this.cases = list(cases);
  }

  MatchExp(final Exp exp, final List<MatchCase> cases, final Type type) {
    super(type);
    this.exp = exp;
    this.cases = list(cases);
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.exp, this.cases };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitExp(this);
    final boolean b2 = visitor.visitMatchExp(this);
    return b1 && b2;
  }

  @Override
  public Exp withType(final Type type) {
    return new MatchExp(this.exp, this.cases, type);
  }
}
