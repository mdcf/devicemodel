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

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public class Ast {

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  public static abstract class AbstractVisitor
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
      final boolean b1 = visitDeclaration(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitDeclaration(final Declaration node) {
      return true;
    }

    @Override
    public boolean visitDevice(final Device node) {
      final boolean b1 = visitDeclaration(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitEitherInit(final EitherInit node) {
      return defaultCase(node);
    }

    @Override
    public boolean visitEitherType(final EitherType node) {
      final boolean b1 = visitType(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitFeature(final Feature node) {
      final boolean b1 = visitDeclaration(node);
      final boolean b2 = node instanceof Device ? true : defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitFeatureInit(final FeatureInit node) {
      return defaultCase(node);
    }

    @Override
    public boolean visitInvariant(final Invariant node) {
      final boolean b1 = visitMember(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
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
    public boolean visitNamedType(final NamedType node) {
      final boolean b1 = visitType(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitNoneInit(final NoneInit node) {
      return defaultCase(node);
    }

    @Override
    public boolean visitOptionType(final OptionType node) {
      final boolean b1 = visitType(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitRefinedType(final RefinedType node) {
      final boolean b1 = visitType(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitRequirement(final Requirement node) {
      final boolean b1 = visitDeclaration(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitSeqInit(final SeqInit node) {
      return defaultCase(node);
    }

    @Override
    public boolean visitSeqType(final SeqType node) {
      final boolean b1 = visitType(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitSetInit(final SetInit node) {
      return defaultCase(node);
    }

    @Override
    public boolean visitSetType(final SetType node) {
      final boolean b1 = visitType(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
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
      final boolean b1 = visitType(node);
      final boolean b2 = defaultCase(node);
      return b1 && b2;
    }

    @Override
    public boolean visitType(final Type node) {
      return true;
    }
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  public static interface IVisitor {
    boolean visitAttribute(Attribute node);

    boolean visitBasicInit(BasicInit node);

    boolean visitBasicType(BasicType node);

    boolean visitDeclaration(Declaration node);

    boolean visitDevice(Device node);

    boolean visitEitherInit(EitherInit node);

    boolean visitEitherType(EitherType node);

    boolean visitFeature(Feature node);

    boolean visitFeatureInit(FeatureInit node);

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

  public static Attribute attribute(final AttributeModifier modifier,
      final Type type, final String name, final Optional<Initialization> init) {
    return new Attribute(modifier, type, name, init);
  }

  public static BasicInit basicInit(final String value) {
    return new BasicInit(value);
  }

  public static BasicType basicType(final String name,
      final List<NamedType> supers) {
    return new BasicType(name, supers);
  }

  public static Device device(final String name, final List<NamedType> supers,
      final List<Member> members) {
    return new Device(name, supers, members);
  }

  public static EitherInit eitherInit(final int index, final Initialization init) {
    return new EitherInit(index, init);
  }

  public static EitherType eitherType(final List<Type> choiceTypes) {
    return new EitherType(choiceTypes);
  }

  public static Feature feature(final FeatureModifier level, final String name,
      final List<NamedType> supers, final List<Member> members) {
    return new Feature(level, name, supers, members);
  }

  public static FeatureInit featureInit(final List<NamedType> types,
      final List<Attribute> attributes) {
    return new FeatureInit(types, attributes);
  }

  public static Invariant invariant(final String name, final Object predicate) {
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

  public static Model model(final List<Declaration> declarations) {
    return new Model(declarations);
  }

  public static NamedType namedType(final String name) {
    return new NamedType(name);
  }

  public static <T> Optional<T> none() {
    return Optional.<T> absent();
  }

  public static NoneInit noneInit() {
    return new NoneInit();
  }

  public static OptionType optionType(final Type elementType) {
    return new OptionType(elementType);
  }

  public static RefinedType refinedType(final List<NamedType> types,
      final List<Attribute> attributes) {
    return new RefinedType(types, attributes);
  }

  public static Requirement requirement(final String name,
      final List<Invariant> invariants) {
    return new Requirement(name, invariants);
  }

  public static SeqInit seqInit(final List<Initialization> inits) {
    return new SeqInit(inits);
  }

  public static SeqType seqType(final Type elementType) {
    return new SeqType(elementType);
  }

  public static SetInit setInit(final List<Initialization> inits) {
    return new SetInit(inits);
  }

  public static SetType setType(final Type elementType) {
    return new SetType(elementType);
  }

  public static <T> Optional<T> some(final T t) {
    return Optional.of(t);
  }

  public static SomeInit someInit(final Initialization init) {
    return new SomeInit(init);
  }

  public static TupleInit tupleInit(final List<Initialization> inits) {
    return new TupleInit(inits);
  }

  public static TupleType tupleType(final List<Type> elementTypes) {
    return new TupleType(elementTypes);
  }

  private Ast() {
  }
}
