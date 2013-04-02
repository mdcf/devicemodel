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
  public final NamedType type;
  public final List<Attribute> attributes;

  public FeatureInit(final NamedType type, final List<Attribute> attributes) {
    this.type = type;
    this.attributes = list(attributes);
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.type, this.attributes };
  }

  @Override
  protected boolean visit(final Ast.IVisitor visitor) {
    return visitor.visitFeatureInit(this);
  }
}
