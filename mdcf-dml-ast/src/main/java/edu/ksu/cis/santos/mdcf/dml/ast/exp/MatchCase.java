/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast.exp;

import com.google.common.base.Optional;

import edu.ksu.cis.santos.mdcf.dml.ast.AstNode;
import edu.ksu.cis.santos.mdcf.dml.ast.IVisitor;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class MatchCase extends AstNode {
  public final MatchCaseBind bind;
  public final Optional<Exp> cond;
  public final Exp body;

  public MatchCase(final MatchCaseBind bind, final Optional<Exp> cond,
      final Exp body) {
    this.bind = bind;
    this.cond = cond;
    this.body = body;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.bind, this.cond, this.body };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    return visitor.visitMatchCase(this);
  }
}
