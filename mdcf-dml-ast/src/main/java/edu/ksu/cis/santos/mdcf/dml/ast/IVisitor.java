/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

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
 * AST Visitor Interface.
 * 
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public interface IVisitor {

  boolean visitAccessExp(AccessExp node);

  boolean visitApplyExp(ApplyExp node);

  boolean visitAttribute(Attribute node);

  boolean visitBasicInit(BasicInit node);

  boolean visitBasicType(BasicType node);

  boolean visitBinaryBasicOpExp(BinaryBasicOpExp node);

  boolean visitConstAnnotation(ConstAnnotation node);

  boolean visitDataAnnotation(DataAnnotation node);

  boolean visitDeclaration(Declaration node);

  boolean visitDefaultMatchCaseBind(DefaultMatchCaseBind node);

  boolean visitEitherInit(EitherInit node);

  boolean visitEitherType(EitherType node);

  boolean visitExp(Exp node);

  boolean visitFeature(Feature node);

  boolean visitFeatureInit(FeatureInit node);

  boolean visitFeatureLevelAnnotation(FeatureLevelAnnotation node);

  boolean visitFunExp(FunExp node);

  boolean visitInitialization(Initialization node);

  boolean visitInstanceOfExp(InstanceOfExp node);

  boolean visitInvariant(Invariant node);

  boolean visitLiteralExp(LiteralExp node);

  boolean visitMapInit(MapInit node);

  boolean visitMapOpExp(MapOpExp node);

  boolean visitMapType(MapType node);

  boolean visitMatchCase(MatchCase node);

  boolean visitMatchCaseBind(MatchCaseBind node);

  boolean visitMatchExp(MatchExp node);

  boolean visitMember(Member node);

  boolean visitModel(Model node);

  boolean visitMultiplicityAnnotation(MultiplicityAnnotation node);

  boolean visitNamedMatchCaseBind(NamedMatchCaseBind node);

  boolean visitNamedType(NamedType node);

  boolean visitNoneInit(NoneInit node);

  boolean visitOptionType(OptionType node);

  boolean visitOverrideAnnotation(OverrideAnnotation node);

  boolean visitParam(Param node);

  boolean visitRefinedType(RefinedType node);

  boolean visitRequirement(Requirement node);

  boolean visitSeqInit(SeqInit node);

  boolean visitSeqOpExp(SeqOpExp node);

  boolean visitSeqType(SeqType node);

  boolean visitSetInit(SetInit node);

  boolean visitSetOpExp(SetOpExp node);

  boolean visitSettableAnnotation(SettableAnnotation node);

  boolean visitSetType(SetType node);

  boolean visitSomeInit(SomeInit node);

  boolean visitTupleInit(TupleInit node);

  boolean visitTupleOpExp(TupleOpExp node);

  boolean visitTupleType(TupleType node);

  boolean visitType(Type node);

  boolean visitUnknownExp(UnknownExp node);

  boolean visitVarRefExp(VarRefExp node);
}
