/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

/**
 * AST Visitor Interface. 
 * 
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public interface IVisitor {
  boolean visitAttribute(Attribute node);

  boolean visitBasicInit(BasicInit node);

  boolean visitBasicType(BasicType node);

  boolean visitDeclaration(Declaration node);

  boolean visitEitherInit(EitherInit node);

  boolean visitEitherType(EitherType node);

  boolean visitFeature(Feature node);

  boolean visitFeatureInit(FeatureInit node);

  boolean visitInitialization(Initialization node);

  boolean visitInvariant(Invariant node);

  boolean visitMember(Member node);

  boolean visitModel(Model node);

  boolean visitNamedType(NamedType node);

  boolean visitNoneInit(NoneInit node);

  boolean visitOptionType(OptionType node);

  boolean visitRefinedType(RefinedType node);

  boolean visitRequirement(Requirement node);

  boolean visitSeqInit(SeqInit node);

  boolean visitSeqType(SeqType node);

  boolean visitSetInit(SetInit node);

  boolean visitSetType(SetType node);

  boolean visitSomeInit(SomeInit node);

  boolean visitTupleInit(TupleInit node);

  boolean visitTupleType(TupleType node);

  boolean visitType(Type node);
}
