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
public final class FeatureInit extends Initialization {
  public final List<NamedType> types;
  public final List<Attribute> attributes;

  public FeatureInit(final Iterable<NamedType> types,
      final Iterable<Attribute> attributes) {
    this.types = list(types);
    this.attributes = list(attributes);
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.types, this.attributes };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitInitialization(this);
    final boolean b2 = visitor.visitFeatureInit(this);
    return b1 && b2;
  }
}
