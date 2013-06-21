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
import edu.ksu.cis.santos.mdcf.dml.ast.Type;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public abstract class Exp extends AstNode {
  public final Optional<Type> type;

  Exp() {
    this.type = Optional.absent();
  }

  Exp(final Type type) {
    this.type = Optional.of(type);
  }

  public abstract Exp withType(Type type);
}
