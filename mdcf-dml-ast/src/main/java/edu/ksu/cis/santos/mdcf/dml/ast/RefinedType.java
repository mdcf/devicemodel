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
public final class RefinedType extends Type {
  public final List<NamedType> types;
  public final List<Attribute> attributes;

  public RefinedType(final Iterable<NamedType> types,
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
    final boolean b1 = visitor.visitType(this);
    final boolean b2 = visitor.visitRefinedType(this);
    return b1 && b2;
  }
}
