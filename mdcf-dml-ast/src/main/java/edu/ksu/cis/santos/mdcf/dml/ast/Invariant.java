/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import java.lang.ref.WeakReference;

import org.apache.commons.lang3.StringEscapeUtils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class Invariant extends Member {
  public final Object predicate;
  private static transient XStream xstream;

  private static XStream xs() {
    if (Invariant.xstream == null) {
      Invariant.xstream = new XStream(new Xpp3Driver());
      Invariant.xstream.setMode(XStream.ID_REFERENCES);
    }
    return Invariant.xstream;
  }

  private transient WeakReference<String> predicateString;

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
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("invariant(\"");
    sb.append(StringEscapeUtils.escapeJava(this.name));
    sb.append("\", \"");
    String ps;
    if ((this.predicateString == null)
        || ((ps = this.predicateString.get()) == null)) {
      ps = StringEscapeUtils.escapeJava(xs().toXML(this.predicate));
      this.predicateString = new WeakReference<String>(ps);
    }
    sb.append(ps);
    sb.append("\")");
    return sb.toString();
  }

  @Override
  protected boolean visit(final Ast.IVisitor visitor) {
    return visitor.visitInvariant(this);
  }
}
