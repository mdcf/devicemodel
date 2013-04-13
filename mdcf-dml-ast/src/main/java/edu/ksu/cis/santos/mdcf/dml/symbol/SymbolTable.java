/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dml.symbol;

import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Nullable;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

import edu.ksu.cis.santos.mdcf.dml.ast.AbstractVisitor;
import edu.ksu.cis.santos.mdcf.dml.ast.Attribute;
import edu.ksu.cis.santos.mdcf.dml.ast.BasicType;
import edu.ksu.cis.santos.mdcf.dml.ast.Declaration;
import edu.ksu.cis.santos.mdcf.dml.ast.Feature;
import edu.ksu.cis.santos.mdcf.dml.ast.FeatureInit;
import edu.ksu.cis.santos.mdcf.dml.ast.Invariant;
import edu.ksu.cis.santos.mdcf.dml.ast.Member;
import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dml.ast.NamedType;
import edu.ksu.cis.santos.mdcf.dml.ast.RefinedType;
import edu.ksu.cis.santos.mdcf.dml.ast.Requirement;
import edu.ksu.cis.santos.mdcf.dml.ast.Type;

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
public final class SymbolTable {
  public enum Kind {
    BasicType, Feature, Requirement
  }

  private final static Map<String, Kind> kindMap = ImmutableMap
      .<String, Kind> of(
          BasicType.class.getName(),
          Kind.BasicType,
          Feature.class.getName(),
          Kind.Feature,
          Requirement.class.getName(),
          Kind.Requirement);

  public static SymbolTable of(final Model... models) {
    return new SymbolTable(models);
  }

  public final List<Model> models;

  private transient Map<String, Declaration> _declarationMap;
  private transient Map<String, Map<String, Pair<Feature, Member>>> _featureMemberMap;
  private transient SoftReference<List<RefinedType>> _refinedTypes;
  private transient SoftReference<List<FeatureInit>> _featureInits;
  private transient SoftReference<Multimap<String, String>> _superMap;
  private transient SoftReference<Multimap<String, String>> _subMap;

  private final Function<NamedType, String> namedType2String = new Function<NamedType, String>() {
    @Override
    @Nullable
    public String apply(@Nullable final NamedType input) {
      return input.name;
    }
  };

  private SymbolTable(final Model... models) {
    this.models = ImmutableList.<Model> builder().add(models).build();
  }

  public Map<String, Pair<Feature, Attribute>> allAttributeMap(
      final Iterable<String> featureNames) {
    return filterp(allMemberMap(featureNames), Attribute.class);
  }

  public Map<String, Pair<Feature, Attribute>> allAttributeMap(
      final List<NamedType> namedTypes) {
    return filterp(allMemberMap(namedTypes), Attribute.class);
  }

  public Map<String, Pair<Feature, Attribute>> allAttributeMap(
      final String featureName) {
    return filterp(allMemberMap(featureName), Attribute.class);
  }

  public Set<Pair<Feature, Attribute>> allAttributes(
      final Iterable<String> featureNames, final String memberName,
      final boolean isSuper) {
    return allMembers(featureNames, Attribute.class, memberName, isSuper);
  }

  public Set<Pair<Feature, Attribute>> allAttributes(
      final List<NamedType> namedTypes, final String memberName,
      final boolean isSuper) {
    return allMembers(
        Iterables.transform(namedTypes, this.namedType2String),
        Attribute.class,
        memberName,
        isSuper);
  }

  public Set<Pair<Feature, Attribute>> allAttributes(final String featureName,
      final String memberName, final boolean isSuper) {
    return allMembers(
        ImmutableList.of(featureName),
        Attribute.class,
        memberName,
        isSuper);
  }

  public Map<String, Pair<Feature, Invariant>> allInvariantMap(
      final Iterable<String> featureNames) {
    return filterp(allMemberMap(featureNames), Invariant.class);
  }

  public Map<String, Pair<Feature, Invariant>> allInvariantMap(
      final List<NamedType> namedTypes) {
    return filterp(allMemberMap(namedTypes), Invariant.class);
  }

  public Map<String, Pair<Feature, Invariant>> allInvariantMap(
      final String featureName) {
    return filterp(allMemberMap(featureName), Invariant.class);
  }

  public Set<Pair<Feature, Invariant>> allInvariants(
      final Iterable<String> featureNames, final String memberName,
      final boolean isSuper) {
    return allMembers(featureNames, Invariant.class, memberName, isSuper);
  }

  public Set<Pair<Feature, Invariant>> allInvariants(
      final List<NamedType> namedTypes, final String memberName,
      final boolean isSuper) {
    return allMembers(
        Iterables.transform(namedTypes, this.namedType2String),
        Invariant.class,
        memberName,
        isSuper);
  }

  public Set<Pair<Feature, Invariant>> allInvariants(final String featureName,
      final String memberName, final boolean isSuper) {
    return allMembers(
        ImmutableList.of(featureName),
        Invariant.class,
        memberName,
        isSuper);
  }

  public Map<String, Pair<Feature, Member>> allMemberMap(
      final Iterable<String> featureNames) {
    final TreeMap<String, Pair<Feature, Member>> b = new TreeMap<>();

    for (final String featureName : featureNames) {
      b.putAll(allMemberMap(featureName));
    }

    return Collections.unmodifiableMap(b);
  }

  public Map<String, Pair<Feature, Member>> allMemberMap(
      final List<NamedType> namedTypes) {
    return allMemberMap(Iterables.transform(namedTypes, this.namedType2String));
  }

  public Map<String, Pair<Feature, Member>> allMemberMap(
      final String featureName) {
    final Map<String, Map<String, Pair<Feature, Member>>> map = featureMemberMap();

    Map<String, Pair<Feature, Member>> result = map.get(featureName);

    if (result == null) {
      final TreeMap<String, Pair<Feature, Member>> b = new TreeMap<>();

      final Feature feature = feature(featureName);

      for (final NamedType nt : feature.supers) {
        b.putAll(allMemberMap(nt.name));
      }

      for (final Member m : feature.members) {
        b.put(m.name, ImmutablePair.of(feature, m));
      }

      result = Collections.unmodifiableMap(b);

      map.put(featureName, result);
    }

    return result;
  }

  public <T extends Member> Set<Pair<Feature, T>> allMembers(
      final Iterable<String> featureNames, final Class<T> clazz,
      final String memberName, final boolean isSuper) {
    final LinkedHashSet<Pair<Feature, T>> b = new LinkedHashSet<>();
    final Multimap<String, String> map = isSuper ? superTransitiveMap()
        : subTransitiveMap();
    for (final String featureName : featureNames) {
      Member m = declaredMemberMap(featureName).get(memberName);
      if ((m != null) && clazz.isAssignableFrom(m.getClass())) {
        @SuppressWarnings("unchecked")
        final T t = (T) m;
        b.add(ImmutablePair.<Feature, T> of(feature(featureName), t));
      }
      final Collection<String> superNames = map.get(featureName);
      if (superNames != null) {
        for (final String superName : superNames) {
          m = declaredMemberMap(superName).get(memberName);
          if ((m != null) && clazz.isAssignableFrom(m.getClass())) {
            @SuppressWarnings("unchecked")
            final T t = (T) m;
            b.add(ImmutablePair.<Feature, T> of(feature(featureName), t));
          }
        }
      }
    }
    return Collections.unmodifiableSet(b);
  }

  public Set<Pair<Feature, Member>> allMembers(
      final Iterable<String> featureNames, final String memberName,
      final boolean isSuper) {
    return allMembers(featureNames, Member.class, memberName, isSuper);
  }

  public Set<Pair<Feature, Member>> allMembers(
      final List<NamedType> namedTypes, final String memberName,
      final boolean isSuper) {
    return allMembers(
        Iterables.transform(namedTypes, this.namedType2String),
        Member.class,
        memberName,
        isSuper);
  }

  public Set<Pair<Feature, Member>> allMembers(final String featureName,
      final String memberName, final boolean isSuper) {
    return allMembers(
        ImmutableList.of(featureName),
        Member.class,
        memberName,
        isSuper);
  }

  public BasicType basicType(final String name) {
    return (BasicType) declarationMap().get(name);
  }

  public List<BasicType> basicTypes() {
    return declarations(BasicType.class);
  }

  public boolean conformsTo(final String typeName, final String name) {
    return superTransitiveMap().containsEntry(typeName, name);
  }

  public Map<String, Declaration> declarationMap() {
    if (this._declarationMap == null) {
      final TreeMap<String, Declaration> dm = new TreeMap<>();

      new AbstractVisitor() {
        @Override
        public boolean visitDeclaration(final Declaration node) {
          dm.put(node.name, node);
          return false;
        }

        @Override
        public boolean visitType(final Type node) {
          return false;
        }
      }.visit(this.models);

      this._declarationMap = Collections.unmodifiableMap(dm);
    }

    return this._declarationMap;
  }

  public Set<String> declarationNames() {
    return declarationMap().keySet();
  }

  private <T> List<T> declarations(final Class<T> clazz) {
    final ImmutableList.Builder<T> b = ImmutableList.builder();
    for (final Model m : this.models) {
      for (final Declaration d : m.declarations) {
        if (clazz.equals(d.getClass())) {
          @SuppressWarnings("unchecked")
          final T t = (T) d;
          b.add(t);
        }
      }
    }
    return b.build();
  }

  public Map<String, Attribute> declaredAttributeMap(final String featureName) {
    return filter(declaredMemberMap(featureName), Attribute.class);
  }

  public Collection<Attribute> declaredAttributes(final String featureName) {
    return declaredAttributeMap(featureName).values();
  }

  public Map<String, Invariant> declaredInvariantMap(final String featureName) {
    return filter(declaredMemberMap(featureName), Invariant.class);
  }

  public Collection<Invariant> declaredInvariants(final String featureName) {
    return declaredInvariantMap(featureName).values();
  }

  public Map<String, Member> declaredMemberMap(final String featureName) {
    final TreeMap<String, Member> b = new TreeMap<>();
    for (final Member m : feature(featureName).members) {
      b.put(m.name, m);
    }
    return Collections.unmodifiableMap(b);
  }

  public Collection<Member> declaredMembers(final String featureName) {
    return feature(featureName).members;
  }

  public Feature feature(final String name) {
    return (Feature) declarationMap().get(name);
  }

  public List<FeatureInit> featureInits() {
    List<FeatureInit> result = null;
    if ((this._featureInits == null)
        || ((result = this._featureInits.get()) == null)) {
      final ImmutableList.Builder<FeatureInit> b = ImmutableList.builder();

      new AbstractVisitor() {
        @Override
        public boolean visitFeatureInit(final FeatureInit node) {
          b.add(node);
          return true;
        }
      }.visit(this.models);
      result = b.build();
      this._featureInits = new SoftReference<List<FeatureInit>>(result);
    }
    return result;
  }

  public Map<String, Map<String, Pair<Feature, Member>>> featureMemberMap() {
    if (this._featureMemberMap == null) {
      this._featureMemberMap = CacheBuilder.newBuilder().softValues()
          .<String, Map<String, Pair<Feature, Member>>> build().asMap();
    }
    return this._featureMemberMap;
  }

  public List<Feature> features() {
    return declarations(Feature.class);
  }

  public <V, T> Map<String, T> filter(final Map<String, V> m,
      final Class<T> clazz) {
    return Maps.transformValues(Maps.filterValues(m, new Predicate<V>() {
      @Override
      public boolean apply(@Nullable final V input) {
        if (input != null) {
          return clazz.isAssignableFrom(input.getClass());
        } else {
          return false;
        }
      }
    }), new Function<V, T>() {
      @SuppressWarnings("unchecked")
      @Override
      @Nullable
      public T apply(@Nullable final V input) {
        return (T) input;
      }
    });
  }

  public <V, T> Map<String, Pair<Feature, T>> filterp(
      final Map<String, Pair<Feature, V>> m, final Class<T> clazz) {
    return Maps.transformValues(
        Maps.filterValues(m, new Predicate<Pair<Feature, V>>() {
          @Override
          public boolean apply(@Nullable final Pair<Feature, V> input) {
            if (input != null) {
              return clazz.isAssignableFrom(input.getRight().getClass());
            } else {
              return false;
            }
          }
        }),
        new Function<Pair<Feature, V>, Pair<Feature, T>>() {
          @SuppressWarnings("unchecked")
          @Override
          @Nullable
          public Pair<Feature, T> apply(@Nullable final Pair<Feature, V> input) {
            return ImmutablePair.of(input.getLeft(), (T) input.getRight());
          }
        });
  }

  public boolean isBasicType(final String name) {
    return kind(name) == Kind.BasicType;
  }

  public boolean isFeature(final String name) {
    return kind(name) == Kind.Feature;
  }

  public boolean isRequirement(final String name) {
    return kind(name) == Kind.Requirement;
  }

  public Kind kind(final String declarationName) {
    return SymbolTable.kindMap.get(declarationMap().get(declarationName)
        .getClass().getName());
  }

  public List<RefinedType> refinedTypes() {
    List<RefinedType> result = null;
    if ((this._refinedTypes == null)
        || ((result = this._refinedTypes.get()) == null)) {
      final ImmutableList.Builder<RefinedType> b = ImmutableList.builder();

      new AbstractVisitor() {
        @Override
        public boolean visitRefinedType(final RefinedType node) {
          b.add(node);
          return true;
        }
      }.visit(this.models);
      result = b.build();
      this._refinedTypes = new SoftReference<List<RefinedType>>(result);
    }
    return result;
  }

  public Requirement requirement(final String name) {
    return (Requirement) declarationMap().get(name);
  }

  public List<Requirement> requirements() {
    return declarations(Requirement.class);
  }

  public Multimap<String, String> subTransitiveMap() {
    Multimap<String, String> result = null;
    while ((this._subMap == null) || ((result = this._subMap.get()) == null)) {
      superTransitiveMap();
      result = this._subMap.get();
    }
    return result;
  }

  private void superTransitive(final Set<String> seen,
      final ImmutableMultimap.Builder<String, String> superm,
      final ImmutableMultimap.Builder<String, String> subm,
      final BasicType basicType) {
    final String basicTypeName = basicType.name;
    if (!seen.contains(basicTypeName)) {
      seen.add(basicTypeName);
      for (final NamedType nt : basicType.supers) {
        final String superName = nt.name;
        superTransitive(seen, superm, subm, feature(nt.name));
        superm.put(basicTypeName, superName);
        subm.put(superName, basicTypeName);
      }
    }
  }

  private void superTransitive(final Set<String> seen,
      final ImmutableMultimap.Builder<String, String> superm,
      final ImmutableMultimap.Builder<String, String> subm,
      final Feature feature) {
    final String featureName = feature.name;
    if (!seen.contains(featureName)) {
      seen.add(featureName);
      for (final NamedType nt : feature.supers) {
        final String superName = nt.name;
        superTransitive(seen, superm, subm, feature(nt.name));
        superm.put(featureName, superName);
        subm.put(superName, featureName);
      }
    }
  }

  public Multimap<String, String> superTransitiveMap() {
    Multimap<String, String> result = null;
    if ((this._superMap == null) || ((result = this._superMap.get()) == null)) {
      final ImmutableMultimap.Builder<String, String> superb = ImmutableMultimap
          .builder();
      final ImmutableMultimap.Builder<String, String> subb = ImmutableMultimap
          .builder();

      superb.put("IntegralType", "Number");
      superb.put("Int", "IntegralType");
      superb.put("Nat", "Int");
      subb.put("Number", "IntegralType");
      subb.put("IntegralType", "Int");
      subb.put("Int", "Nat");

      final HashSet<String> seen = new HashSet<>();

      for (final BasicType bt : basicTypes()) {
        superTransitive(seen, superb, subb, bt);
      }

      for (final Feature f : features()) {
        superTransitive(seen, superb, subb, f);
      }

      result = superb.build();
      this._superMap = new SoftReference<Multimap<String, String>>(result);
      this._subMap = new SoftReference<Multimap<String, String>>(subb.build());
    }
    return result;

  }
}
