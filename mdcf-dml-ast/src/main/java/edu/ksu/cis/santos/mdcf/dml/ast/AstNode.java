/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import java.lang.ref.WeakReference;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.base.Optional;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public abstract class AstNode {
  private transient WeakReference<Object[]> children;

  public Object[] children() {
    Object[] result = null;
    if ((this.children == null) || ((result = this.children.get()) == null)) {
      result = getChildren();
      this.children = new WeakReference<Object[]>(result);
    }
    return result;
  }

  protected abstract Object[] getChildren();

  public final <T extends AstNode> T make(final Object[] args) {
    try {
      @SuppressWarnings("unchecked")
      final T result = (T) getClass().getDeclaredConstructors()[0]
          .newInstance(args);
      return result;
    } catch (final Exception e) {
      throw new InstantiationError(e.getMessage());
    }
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    final String name = getClass().getSimpleName();
    sb.append(Character.toLowerCase(name.charAt(0)));
    sb.append(name.substring(1));
    sb.append('(');
    final Object[] children = children();
    final int len = children.length;
    for (int i = 0; i < len; i++) {
      toString(sb, children[i]);
      if (i != (len - 1)) {
        sb.append(", ");
      }
    }
    sb.append(')');
    return sb.toString();
  }

  private void toString(final StringBuilder sb, final Object o) {
    if (o instanceof List) {
      final List<?> l = (List<?>) o;
      sb.append("list(");
      final int size = l.size();
      for (int i = 0; i < size; i++) {
        toString(sb, l.get(i));
        if (i != (size - 1)) {
          sb.append(", ");
        }
      }
      sb.append(')');
    } else if (o instanceof Optional) {
      final Optional<?> opt = (Optional<?>) o;
      if (opt.isPresent()) {
        sb.append("some(");
        toString(sb, opt.get());
        sb.append(')');
      } else {
        sb.append("none()");
      }
    } else if (o instanceof String) {
      final String s = (String) o;
      sb.append('"');
      sb.append(StringEscapeUtils.escapeJava(s));
      sb.append('"');
    } else if (o instanceof Enum) {
      final Enum<?> e = (Enum<?>) o;
      sb.append(e.getClass().getSimpleName());
      sb.append('.');
      sb.append(e.toString());
    } else {
      sb.append(o);
    }
  }

  protected abstract boolean visit(Ast.IVisitor visitor);
}
