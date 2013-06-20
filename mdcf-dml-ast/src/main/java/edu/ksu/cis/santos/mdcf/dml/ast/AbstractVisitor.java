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

import edu.ksu.cis.santos.mdcf.dml.ast.exp.AccessExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.ApplyExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.BinaryBasicOpExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.DefaultMatchCaseBind;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.Exp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.FunExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.InstanceOfExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.LiteralExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.MapOpExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.MatchCase;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.MatchCaseBind;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.MatchExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.NamedMatchCaseBind;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.Param;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.SeqOpExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.SetOpExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.TupleOpExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.UnknownExp;
import edu.ksu.cis.santos.mdcf.dml.ast.exp.VarRefExp;

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
  public boolean visitAccessExp(final AccessExp node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitApplyExp(final ApplyExp node) {
    return defaultCase(node);
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
  public boolean visitBinaryBasicOpExp(final BinaryBasicOpExp node) {
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
  public boolean visitDefaultMatchCaseBind(final DefaultMatchCaseBind node) {
    return defaultCase(node);
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
  public boolean visitExp(final Exp node) {
    return true;
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
  public boolean visitFunExp(final FunExp node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitInitialization(final Initialization node) {
    return true;
  }

  @Override
  public boolean visitInstanceOfExp(final InstanceOfExp node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitInvariant(final Invariant node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitLiteralExp(final LiteralExp node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitMapInit(final MapInit node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitMapOpExp(final MapOpExp node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitMapType(final MapType node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitMatchCase(final MatchCase node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitMatchCaseBind(final MatchCaseBind node) {
    return true;
  }

  @Override
  public boolean visitMatchExp(final MatchExp node) {
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
  public boolean visitNamedMatchCaseBind(final NamedMatchCaseBind node) {
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
  public boolean visitParam(final Param node) {
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
  public boolean visitSeqOpExp(final SeqOpExp node) {
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
  public boolean visitSetOpExp(final SetOpExp node) {
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
  public boolean visitTupleOpExp(final TupleOpExp node) {
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

  @Override
  public boolean visitUnknownExp(final UnknownExp node) {
    return defaultCase(node);
  }

  @Override
  public boolean visitVarRefExp(final VarRefExp node) {
    return defaultCase(node);
  }
}
