/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast.exp;

import com.google.common.base.Optional;

import edu.ksu.cis.santos.mdcf.dml.ast.IVisitor;
import edu.ksu.cis.santos.mdcf.dml.ast.Type;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class NamedMatchCaseBind extends MatchCaseBind {
  public final String id;
  public final Optional<Type> type;

  public NamedMatchCaseBind(final String id, final Optional<Type> type) {
    this.id = id.intern();
    this.type = type;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.id, this.type };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitMatchCaseBind(this);
    final boolean b2 = visitor.visitNamedMatchCaseBind(this);
    return b1 && b2;
  }
}
