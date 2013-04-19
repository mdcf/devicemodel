/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import java.lang.ref.SoftReference;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.base.Optional;

/**
 * Top-level AST class that all AST node inherits from.
 * 
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public abstract class AstNode {
  protected final static Object[] EMPTY_CHILDREN = new Object[] {};

  private transient SoftReference<Object[]> _children;

  /**
   * Retrieves the immediate children of this AST.
   * 
   * @return a possibly empty array of this node's children. The returned array
   *         can be mutated but it does not affect the AST.
   */
  public final Object[] children() {
    Object[] result = null;
    if ((this._children == null) || ((result = this._children.get()) == null)) {
      result = getChildren();
      this._children = new SoftReference<Object[]>(result);
    }
    return result;
  }

  protected abstract Object[] getChildren();

  /**
   * Constructs an AST node whose type is equal to this node's type with the
   * provided child nodes.
   * 
   * @param args
   *          The child nodes; no changes to the array will be made.
   * @return an AST node whose type is equal to this node's type and whose
   *         children are the provided nodes.
   * @throws {@link InstantiationError} if unsuccessful.
   */
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

  /**
   * Returns the {@link String} representation of this AST.
   */
  @Override
  public final String toString() {
    final StringBuilder sb = new StringBuilder();
    toString(sb, this);
    return sb.toString();
  }

  private void toString(final StringBuilder sb, final Object o) {
    if (o instanceof Invariant) {
      final Invariant inv = (Invariant) o;
      sb.append("invariant(\"");
      sb.append(StringEscapeUtils.escapeJava(inv.name));
      sb.append("\", \"");
      String ps;
      if ((inv.predicateString == null)
          || ((ps = inv.predicateString.get()) == null)) {
        ps = StringEscapeUtils.escapeJava(Invariant.xs().toXML(inv.predicate));
        inv.predicateString = new SoftReference<String>(ps);
      }
      sb.append(ps);
      sb.append("\")");
    } else if (o instanceof AstNode) {
      final AstNode n = (AstNode) o;
      final String name = n.getClass().getSimpleName();
      sb.append(Character.toLowerCase(name.charAt(0)));
      sb.append(name.substring(1));
      sb.append('(');
      final Object[] children = n.children();
      final int len = children.length;
      for (int i = 0; i < len; i++) {
        toString(sb, children[i]);
        if (i != (len - 1)) {
          sb.append(", ");
        }
      }
      sb.append(')');
    } else if (o instanceof List) {
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

  protected abstract boolean visit(IVisitor visitor);
}
