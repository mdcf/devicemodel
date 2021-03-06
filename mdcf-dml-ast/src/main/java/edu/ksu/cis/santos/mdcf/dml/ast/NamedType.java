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
public final class NamedType extends Type implements PredicateType {
  private static final String DMS_PACKAGE = "edu.ksu.cis.santos.mdcf.dms.package$";

  public final String name;

  public NamedType(final String name) {
    if (name.startsWith(NamedType.DMS_PACKAGE)) {
      final String n = name.substring(NamedType.DMS_PACKAGE.length());
      final int i = n.indexOf("$");
      this.name = (i >= 0 ? n.substring(0, i) : n).intern();
    } else {
      this.name = name.intern();
    }
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.name };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitType(this);
    final boolean b2 = visitor.visitNamedType(this);
    return b1 && b2;
  }
}
