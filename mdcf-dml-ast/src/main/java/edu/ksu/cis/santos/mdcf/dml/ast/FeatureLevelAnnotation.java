/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class FeatureLevelAnnotation extends AstNode
    implements FeatureAnnotation {

  public final FeatureLevel level;
  public final String qualifier;

  public FeatureLevelAnnotation(final FeatureLevel level, final String qualifier) {
    this.level = level;
    this.qualifier = qualifier.intern();
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.level, this.qualifier };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    return visitor.visitFeatureLevelAnnotation(this);
  }
}
