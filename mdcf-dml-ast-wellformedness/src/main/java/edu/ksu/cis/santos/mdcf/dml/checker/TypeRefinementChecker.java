package edu.ksu.cis.santos.mdcf.dml.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.tuple.Pair;

import edu.ksu.cis.santos.mdcf.dml.ast.Attribute;
import edu.ksu.cis.santos.mdcf.dml.ast.AttributeAnnotation;
import edu.ksu.cis.santos.mdcf.dml.ast.EitherType;
import edu.ksu.cis.santos.mdcf.dml.ast.Feature;
import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dml.ast.NamedType;
import edu.ksu.cis.santos.mdcf.dml.ast.OptionType;
import edu.ksu.cis.santos.mdcf.dml.ast.OverrideAnnotation;
import edu.ksu.cis.santos.mdcf.dml.ast.RefinedType;
import edu.ksu.cis.santos.mdcf.dml.ast.SeqType;
import edu.ksu.cis.santos.mdcf.dml.ast.SetType;
import edu.ksu.cis.santos.mdcf.dml.ast.TupleType;
import edu.ksu.cis.santos.mdcf.dml.ast.Type;
import edu.ksu.cis.santos.mdcf.dml.symbol.SymbolTable;
import edu.ksu.cis.santos.mdcf.dml.ast.BasicType;

public class TypeRefinementChecker {
	private Model m;
	private SymbolTable ST;

	private ArrayList<String> basicTypeList;
	private HashMap<String, ArrayList<String>> inheritanceRelations;
	private HashMap<String, ArrayList<String>> completeInheritanceRelations;
	
	public TypeRefinementChecker(Model m) {
		this.m = m;
		this.ST = SymbolTable.of(this.m);
	}

	public void init() {
		System.out.println("BasicType List: " + ST.basicTypes());

		this.basicTypeList = new ArrayList<String>();
		this.inheritanceRelations = new HashMap<String, ArrayList<String>>();
		this.completeInheritanceRelations = new HashMap<String, ArrayList<String>>();

		// Building value of basic type list and the inheritance key/value map
		for (BasicType t : ST.basicTypes()) {
			this.basicTypeList.add(t.name);

			if (!t.supers.isEmpty()) {
				ArrayList<String> superList;
				if ((superList = this.inheritanceRelations.get(t.name)) == null) {
					superList = new ArrayList<String>();
				}

				for (NamedType n : t.supers) {
					superList.add(n.name);
				}

				this.inheritanceRelations.put(t.name, superList);
			}
		}

		System.out.println("BasicType List: " + this.basicTypeList);
		System.out.println("Inheritance Relation List: "
				+ this.inheritanceRelations);

		// Building full inheritance key/value map
		for (String key : this.inheritanceRelations.keySet()) {
			ArrayList<String> fullList = new ArrayList<String>();
			buildInheritanceHierarchy(key, key, fullList);
			this.completeInheritanceRelations.put(key, fullList);
		}

		System.out.println("Complete Inheritance Relation List: "
				+ this.completeInheritanceRelations);
		
		System.err.println(this.ST.superTransitiveMap().get("edu.ksu.cis.santos.mdcf.dms.example.Int"));
	}

	private void buildInheritanceHierarchy(String original, String current,
			ArrayList<String> fullList) {
		ArrayList<String> hierarchyList = this.inheritanceRelations
				.get(current);
		if (hierarchyList == null || hierarchyList.isEmpty()) {
			return;
		} else {
			for (String parent : hierarchyList) {
				fullList.add(parent);

				// Cyclic inheritance detected.
				// We won't notice anything here but stop building the
				// hierarchy.
				if (parent.equals(original))
					return;

				buildInheritanceHierarchy(original, parent, fullList);
			}
		}
	}

	// Rule 2. A basic type T1 can be refined by another basic type T2 if,
	// T2 <: T1.
	public boolean checkBasicTypeRefinement() {
		System.out.println("Start of checkBasicTypeRefinement");
		for (BasicType bt : this.ST.basicTypes()) {
			if (!bt.supers.isEmpty()) {
				for (NamedType nt : bt.supers) {
					if (!this.ST.isSubTypeOf(bt.name, nt.name)) {
						System.err.println("Type Refinement Rule Violation(2):"
								+ bt.name + " can't refine " + nt.name);
						return false;
					} else {
						System.out.println("Type Refinement Rule(2):" + bt.name
								+ " can refine " + nt.name);
					}
				}
			}
		}
		System.out.println("End of checkBasicTypeRefinement");
		return true;
	}

	// Rule 3. A feature F1 can be refined by another feature F2 if,
	// F2 <: F1.
	// Rule 4. A compound feature type CF = F1 with ... with FN can be refined
	// by a feature F if,
	// for all i where 1 <= i <= N, F <: Fi.
	public boolean checkFeatureTypeRefinement() {
		System.out.println("Start of checkFeatureTypeRefinement");
		for (Feature ft : this.ST.features()) {
			if (!ft.supers.isEmpty()) {
				for (NamedType nt : ft.supers) {
					if (!this.ST.isSubTypeOf(ft.name, nt.name)) {
						System.err.println("Type Refinement Rule Violation(3):"
								+ ft.name + " can't refine " + nt.name);
						return false;
					} else {
						System.out.println("Type Refinement Rule(3,4):"
								+ ft.name + " can refine " + nt.name);
					}
				}
			}
		}
		System.out.println("End of checkFeatureTypeRefinement");
		return true;
	}


	public boolean checkTypeRefinementRulesOnAllFeatures() {
		boolean result = true;
		System.out.println("Start of checkTypeRefinementRulesOnAllFeatures");
		for (Feature ft : this.ST.features()) {
			Map<String, Pair<Feature, Attribute>> attributeMap = this.ST
					.allAttributeMap(ft.name);

			for (String attributeName : attributeMap.keySet()) {
				Pair<Feature, Attribute> pair = attributeMap.get(attributeName);

				// Checking Rule 9
				// Check whether this attribute is overriding attribute
				boolean checkOverride = false;
				for (AttributeAnnotation annotation : pair.getRight().annotations) {
					if (annotation instanceof OverrideAnnotation) {
						checkOverride = true;
						break;
					}
				}

				// If the attribute is not overriding attribute, skip type
				// refinement check
				if (!checkOverride)
					continue;

				// Get the super list for checking the ancestor
				Collection<String> superList = this.ST.superTransitiveMap()
						.get(ft.name);

				// For each super, check for the member that has been
				// overridden
				for (String superFt : superList) {
					Pair<Feature, Attribute> superAttrInfo = this.ST
							.allAttributeMap(superFt).get(attributeName);
					if (superAttrInfo == null) {
						// If there is no such attribute, then this is not the
						// super that has been overridden.
						continue;
					} else {
						System.out.println("Checking type(" + ft.name + "):"
								+ pair.getRight().type + " versus "
								+ superAttrInfo.getRight().type + " in ("
								+ superAttrInfo.getLeft().name + ")");

						result = checkTypeRefinement(pair.getRight().type,
									superAttrInfo.getRight().type);
						
						if(!result) break; //No need to proceed when violation found
					}
				}
			}
		}
		System.out.println("End of checkTypeRefinementRulesOnAllFeatures");
		return result;
	}
	
	private boolean checkTypeRefinement(Type type, Type type_super) {

		// Rule 1
		if (type_super instanceof NamedType) {
			NamedType namedType_super = (NamedType) type_super;
			if (namedType_super.name.equals("Any")) {
				return true;
			}
		}

		if (type instanceof EitherType) {
			if (!(type_super instanceof EitherType)) {
				System.err.println("Type Mismatch 1:" + type + ":" + type_super);
				return false;
			}
			return checkTypeRefinement(((EitherType) type).choiceTypes.get(0),
					((EitherType) type_super).choiceTypes.get(0))
					&& checkTypeRefinement(
							((EitherType) type).choiceTypes.get(1),
							((EitherType) type_super).choiceTypes.get(1));

		} else if (type instanceof NamedType) {
			if (!(type_super instanceof NamedType)) {

				// Rule 4
				if (type_super instanceof RefinedType) {
					RefinedType refinedType_super = (RefinedType) type_super;
					for (NamedType nt : refinedType_super.types) {
						if (!this.ST.isSubTypeOf(((NamedType) type).name,
								nt.name)) {
							System.err
									.println("Violation:Type Refinement Rule 4:"
											+ type
											+ ":"
											+ refinedType_super
											+ "(" + nt.name + ")");
							return false;
						}
					}
					return true;
				}

				System.err.println("Type Mismatch 2:" + type + ":" + type_super);
				return false;
			}

			NamedType namedType = (NamedType) type;
			NamedType namedType_super = (NamedType) type_super;

			if (namedType.name.equals(namedType_super.name)) {
				return true;
			} else if (isSubTypeOf(namedType.name, namedType_super.name)) {
				return true;
			} else {
				System.err.println("Type Mismatch 3:" + namedType.name + ":"
						+ namedType_super.name);
				return false;
			}
		} else if (type instanceof OptionType) {
			if (!(type_super instanceof OptionType)) {
				System.err.println("Type Mismatch 4:" + type + ":" + type_super);
				return false;
			}

			return checkTypeRefinement(((OptionType) type).elementType,
					((OptionType) type_super).elementType);

		} else if (type instanceof RefinedType) {
			if (!(type_super instanceof RefinedType)) {
				System.err.println("Type Mismatch 5:" + type + ":" + type_super);
				return false;
			}

			RefinedType refinedType = (RefinedType) type;
			RefinedType refinedType_super = (RefinedType) type_super;

			List<NamedType> ntl = refinedType.types;
			List<NamedType> ntl_super = refinedType_super.types;

			Set<String> sl = getSuperSetList(ntl);
			Set<String> sl_super = getSuperSetList(ntl_super);

			if (sl.containsAll(sl_super)) {
				return true;
			} else {
				System.err.println("Type Mismatch 6:" + ntl + ":" + ntl_super);
				return false;
			}
		} else if (type instanceof SeqType) {
			if (!(type_super instanceof SeqType)) {
				System.err.println("Type Mismatch 7:" + type + ":" + type_super);
				return false;
			}

			return checkTypeRefinement(((SeqType) type).elementType,
					((SeqType) type_super).elementType);

		} else if (type instanceof SetType) {
			if (!(type_super instanceof SetType)) {
				System.err.println("Type Mismatch 8:" + type + ":" + type_super);
				return false;
			}

			return checkTypeRefinement(((SetType) type).elementType,
					((SetType) type_super).elementType);

		} else if (type instanceof TupleType) {
			if (!(type_super instanceof TupleType)) {
				System.err.println("Type Mismatch 9:" + type + ":" + type_super);
				return false;
			}

			TupleType tupleType = (TupleType) type;
			TupleType tupleType_super = (TupleType) type_super;

			if (tupleType.elementTypes.size() != tupleType_super.elementTypes
					.size()) {
				return false;
			} else {
				boolean result = true;

				for (int index = 0; index < tupleType.elementTypes.size(); index++) {
					Type t = tupleType.elementTypes.get(index);
					Type t_super = tupleType_super.elementTypes.get(index);
					result = result & checkTypeRefinement(t, t_super);
					if (!result) {
						System.err
								.println("Type Mismatch 10:" + t + ":" + t_super);
						break;
					}
				}
				return result;
			}
		} else {
			System.err.println("Unknown Type: " + type);
			return false;
		}
	}

	private Set<String> getSuperSetList(List<NamedType> ntl) {
		Set<String> sl = new HashSet<String>();

		for (NamedType nt : ntl) {
			sl.add(nt.name);
			sl.addAll(this.ST.superTransitiveMap().get(nt.name));
		}

		return sl;
	}
	
	
	private boolean isSubTypeOf(String type, String type_super){
		System.err.println("type:" + type + ":" + type_super);
		return completeInheritanceRelations.get(type).contains(type_super);
	}

}
