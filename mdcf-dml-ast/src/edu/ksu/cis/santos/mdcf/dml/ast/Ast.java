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
import com.google.common.collect.ImmutableList;

import edu.ksu.cis.santos.mdcf.dml.ast.Attribute.Modifier;
import edu.ksu.cis.santos.mdcf.dml.ast.Feature.Level;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public class Ast {

  public static App App(final String name, final List<Member> members) {
    return new App(name, members);
  }

  public static Attribute Attribute(final Modifier modifier, final Type type,
      final String name, final Optional<Initialization> init) {
    return new Attribute(modifier, type, name, init);
  }

  public static BasicInit BasicInit(final String value) {
    return new BasicInit(value);
  }

  public static BasicType BasicType(final String name,
      final List<NamedType> supers) {
    return new BasicType(name, supers);
  }

  public static Binding Binding(final NamedType type, final String name) {
    return new Binding(type, name);
  }

  public static Device Device(final String name, final List<Member> members) {
    return new Device(name, members);
  }

  public static EitherInit EitherInit(final int index, final Initialization init) {
    return new EitherInit(index, init);
  }

  public static EitherType EitherType(final List<Type> choiceTypes) {
    return new EitherType(choiceTypes);
  }

  public static Feature Feature(final Level level, final String name,
      final List<Member> members) {
    return new Feature(level, name, members);
  }

  public static FeatureInit FeatureInit(final NamedType type,
      final List<Attribute> attributes) {
    return new FeatureInit(type, attributes);
  }

  public static Invariant Invariant(final String name, final Object predicate) {
    return new Invariant(name, predicate);
  }

  public static <T> List<T> list(final Iterable<T> ts) {
    if (ts instanceof ImmutableList) {
      return (ImmutableList<T>) ts;
    } else {
      return ImmutableList.<T> builder().addAll(ts).build();
    }
  }

  @SafeVarargs
  public static <T> List<T> list(final T... ts) {
    return ImmutableList.<T> builder().add(ts).build();
  }

  public static Model Model(final List<Declaration> declarations) {
    return new Model(declarations);
  }

  public static NamedType NamedType(final String name) {
    return new NamedType(name);
  }

  public static NoneInit NoneInit() {
    return new NoneInit();
  }

  public static OptionType OptionType(final Type elementType) {
    return new OptionType(elementType);
  }

  public static Requirement Requirement(final String name,
      final List<Binding> bindings, final List<Invariant> invariants) {
    return new Requirement(name, bindings, invariants);
  }

  public static SeqInit SeqInit(final List<Initialization> inits) {
    return new SeqInit(inits);
  }

  public static SeqType SeqType(final Type elementType) {
    return new SeqType(elementType);
  }

  public static SetInit SetInit(final List<Initialization> inits) {
    return new SetInit(inits);
  }

  public static SetType SetType(final Type elementType) {
    return new SetType(elementType);
  }

  public static SomeInit SomeInit(final Initialization init) {
    return new SomeInit(init);
  }

  public static TupleInit TupleInit(final List<Initialization> inits) {
    return new TupleInit(inits);
  }

  public static TupleType TupleType(final List<Type> elementTypes) {
    return new TupleType(elementTypes);
  }
}
