/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.ast;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public class Ast {

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
    public boolean visitApp(final App node) {
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
    public boolean visitDevice(final Device node) {
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
    public boolean visitFeature(final Feature node) {
      return defaultCase(node);
    }

    @Override
    public boolean visitFeatureInit(final FeatureInit node) {
      return defaultCase(node);
    }

    @Override
    public boolean visitInvariant(final Invariant node) {
      return defaultCase(node);
    }

    @Override
    public boolean visitModel(final Model node) {
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
  }

  public static interface IVisitor {
    boolean visitApp(App node);

    boolean visitAttribute(Attribute node);

    boolean visitBasicInit(BasicInit node);

    boolean visitBasicType(BasicType node);

    boolean visitDevice(Device node);

    boolean visitEitherInit(EitherInit node);

    boolean visitEitherType(EitherType node);

    boolean visitFeature(Feature node);

    boolean visitFeatureInit(FeatureInit node);

    boolean visitInvariant(Invariant node);

    boolean visitModel(Model node);

    boolean visitNamedType(NamedType node);

    boolean visitNoneInit(NoneInit node);

    boolean visitOptionType(OptionType node);

    boolean visitRequirement(Requirement node);

    boolean visitSeqInit(SeqInit node);

    boolean visitSeqType(SeqType node);

    boolean visitSetInit(SetInit node);

    boolean visitSetType(SetType node);

    boolean visitSomeInit(SomeInit node);

    boolean visitTupleInit(TupleInit node);

    boolean visitTupleType(TupleType node);
  }

  public static class XStreamer {
    private static final XStream XML = xstream(true);
    private static final XStream JSON = xstream(false);

    public static <T> T fromJson(final InputStream is) {
      @SuppressWarnings("unchecked")
      final T result = (T) XStreamer.JSON.fromXML(is);
      return result;
    }

    public static <T> T fromJson(final Reader r) {
      @SuppressWarnings("unchecked")
      final T result = (T) XStreamer.JSON.fromXML(r);
      return result;
    }

    public static <T> T fromJson(final String s) {
      @SuppressWarnings("unchecked")
      final T result = (T) XStreamer.JSON.fromXML(s);
      return result;
    }

    public static <T> T fromXml(final InputStream is) {
      @SuppressWarnings("unchecked")
      final T result = (T) XStreamer.XML.fromXML(is);
      return result;
    }

    public static <T> T fromXml(final Reader r) {
      @SuppressWarnings("unchecked")
      final T result = (T) XStreamer.XML.fromXML(r);
      return result;
    }

    public static <T> T fromXml(final String s) {
      @SuppressWarnings("unchecked")
      final T result = (T) XStreamer.XML.fromXML(s);
      return result;
    }

    public static String toJson(final Object o) {
      return XStreamer.JSON.toXML(o);
    }

    public static void toJson(final Object o, final OutputStream os) {
      XStreamer.JSON.toXML(o, os);
    }

    public static void toJson(final Object o, final Writer w) {
      XStreamer.JSON.toXML(o, w);
    }

    public static String toXml(final Object o) {
      return XStreamer.XML.toXML(o);
    }

    public static void toXml(final Object o, final OutputStream os) {
      XStreamer.XML.toXML(o, os);
    }

    public static void toXml(final Object o, final Writer w) {
      XStreamer.XML.toXML(o, w);
    }

    public static XStream xstream(final boolean isXml) {
      final XStream result = new XStream(isXml ? new Xpp3Driver()
          : new JettisonMappedXmlDriver());
      result.setMode(XStream.NO_REFERENCES);
      result.alias("attribute", Attribute.class);
      result.alias("basicInit", BasicInit.class);
      result.alias("basicType", BasicType.class);
      result.alias("device", Device.class);
      result.alias("eitherInit", EitherInit.class);
      result.alias("eitherType", EitherType.class);
      result.alias("feature", Feature.class);
      result.alias("featureInit", FeatureInit.class);
      result.alias("invariant", Invariant.class);
      result.alias("model", Model.class);
      result.alias("namedType", NamedType.class);
      result.alias("noneInit", NoneInit.class);
      result.alias("optionType", OptionType.class);
      result.alias("requirement", Requirement.class);
      result.alias("seqInit", SeqInit.class);
      result.alias("seqType", SeqType.class);
      result.alias("setInit", SetInit.class);
      result.alias("setType", SetType.class);
      result.alias("someInit", SomeInit.class);
      result.alias("tupleInit", TupleInit.class);
      result.alias("tupleType", TupleType.class);
      result.alias("some", Optional.of(new Object()).getClass());
      result.alias("none", Optional.absent().getClass());
      result.alias("ilist", ImmutableList.of().getClass());
      result.alias("ilist", ImmutableList.of(new Object()).getClass());
      result.alias("ilist", ImmutableList.of(new Object(), new Object())
          .getClass());
      result.registerConverter(new Converter() {

        @Override
        public boolean canConvert(@SuppressWarnings("rawtypes") final Class type) {
          return ImmutableList.class.isAssignableFrom(type);
        }

        @Override
        public void marshal(final Object source,
            final HierarchicalStreamWriter writer,
            final MarshallingContext context) {
          final ArrayList<Object> l = new ArrayList<Object>();
          l.addAll((ImmutableList<?>) source);
          context.convertAnother(l);
        }

        @Override
        public Object unmarshal(final HierarchicalStreamReader reader,
            final UnmarshallingContext context) {
          final ArrayList<?> l = (ArrayList<?>) context.convertAnother(
              null,
              ArrayList.class);
          return list(l);
        }
      });
      result.registerConverter(new SingleValueConverter() {
        Class<?> clazz = ImmutableList.of().getClass();

        @Override
        public boolean canConvert(@SuppressWarnings("rawtypes") final Class type) {
          return this.clazz.isAssignableFrom(type);
        }

        @Override
        public Object fromString(final String str) {
          return ImmutableList.of();
        }

        @Override
        public String toString(final Object obj) {
          return "";
        }
      });
      result.registerConverter(new SingleValueConverter() {
        Class<?> clazz = Optional.absent().getClass();

        @Override
        public boolean canConvert(@SuppressWarnings("rawtypes") final Class type) {

          return this.clazz.isAssignableFrom(type);
        }

        @Override
        public Object fromString(final String str) {
          return Optional.absent();
        }

        @Override
        public String toString(final Object obj) {
          return "";
        }
      });
      return result;
    }

    private XStreamer() {
    }
  }

  public static App app(final String name, final List<NamedType> supers,
      final List<Member> members) {
    return new App(name, supers, members);
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

  public static Feature feature(final FeatureLevel level, final String name,
      final List<NamedType> supers, final List<Member> members) {
    return new Feature(level, name, supers, members);
  }

  public static FeatureInit featureInit(final NamedType type,
      final List<Attribute> attributes) {
    return new FeatureInit(type, attributes);
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
