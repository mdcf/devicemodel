/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import java.lang.ref.SoftReference;

import org.apache.commons.lang3.StringEscapeUtils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class Invariant extends Member {
  static transient XStream xstream;

  static XStream xs() {
    if (Invariant.xstream == null) {
      Invariant.xstream = new XStream(new Xpp3Driver());
      Invariant.xstream.setMode(XStream.ID_REFERENCES);
    }
    return Invariant.xstream;
  }

  public final Object predicate;

  transient SoftReference<String> predicateString;

  public Invariant(final String name, final Object predicate) {
    super(name);
    this.predicate = predicate instanceof String ? xs().fromXML(
        StringEscapeUtils.unescapeJava((String) predicate)) : predicate;
  }

  @Override
  protected Object[] getChildren() {
    return new Object[] { this.name, this.predicate };
  }

  @Override
  protected boolean visit(final IVisitor visitor) {
    final boolean b1 = visitor.visitMember(this);
    final boolean b2 = visitor.visitInvariant(this);
    return b1 && b2;
  }
}
