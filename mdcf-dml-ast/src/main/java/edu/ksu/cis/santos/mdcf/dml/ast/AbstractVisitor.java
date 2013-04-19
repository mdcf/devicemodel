/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import java.util.List;

import com.google.common.base.Optional;

/**
 * A basic {@link IVisitor} implementation that handles {@link List},
 * {@link Optional}, and returns true for all {@link IVisitor} methods
 * (indicating that all children should be visited) with default case handler
 * for all AST nodes.
 * 
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public abstract class AbstractVisitor
    implements IVisitor {

  public boolean defaultCase(final AstNode node) {
    return true;
  }

  public final void visit(final Object o) {
    if (o instanceof List) {
      for (final Object e : (List<?>) o) {
        visit(e);
      }
    } else if (o instanceof Optional) {
      final Optional<?> opt = (Optional<?>) o;
      if (opt.isPresent()) {
        visit(opt.get());
      }
    } else if (o instanceof AstNode) {
      final AstNode node = (AstNode) o;
      if (node.visit(this)) {
        for (final Object child : node.children()) {
          visit(child);
        }
      }
    }
  }

  @Override
  public boolean visitAttribute(final Attribute node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitBasicInit(final BasicInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitBasicType(final BasicType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitConstAnnotation(final ConstAnnotation node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitDataAnnotation(final DataAnnotation node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitDeclaration(final Declaration node) {
    return true;
  }

  @Override
  public boolean visitEitherInit(final EitherInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitEitherType(final EitherType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitFeature(final Feature node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitFeatureInit(final FeatureInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitFeatureLevelAnnotation(final FeatureLevelAnnotation node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitInitialization(final Initialization node) {
    return true;
  }

  @Override
  public boolean visitInvariant(final Invariant node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitMember(final Member node) {
    return true;
  }

  @Override
  public boolean visitModel(final Model node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitMultiplicityAnnotation(final MultiplicityAnnotation node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitNamedType(final NamedType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitNoneInit(final NoneInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitOptionType(final OptionType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitOverrideAnnotation(final OverrideAnnotation node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitRefinedType(final RefinedType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitRequirement(final Requirement node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitSeqInit(final SeqInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitSeqType(final SeqType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitSetInit(final SetInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitSettableAnnotation(final SettableAnnotation node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitSetType(final SetType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitSomeInit(final SomeInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitTupleInit(final TupleInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitTupleType(final TupleType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitType(final Type node) {
    return true;
  }
}
