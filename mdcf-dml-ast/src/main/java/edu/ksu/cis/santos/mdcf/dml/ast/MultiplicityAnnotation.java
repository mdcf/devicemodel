/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import com.google.common.base.Optional;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class MultiplicityAnnotation extends AstNode
    implements AttributeAnnotation {
  public final int lo;
  public final int hi;
  public final Optional<String> typeName;

  public MultiplicityAnnotation(final int lo, final int hi,
      final Optional<String> typeName) {
    this.lo = lo;
    this.hi = hi;
    this.typeName = typeName.isPresent() ? Optional.of(typeName.get().intern())
        : typeName;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.lo, this.hi, this.typeName };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    return visitor.visitMultiplicityAnnotation(this);
  }
}
