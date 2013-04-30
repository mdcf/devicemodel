package edu.ksu.cis.santos.mdcf.dml.checker;

import java.util.ArrayList;
import java.util.HashMap;

import edu.ksu.cis.santos.mdcf.dml.ast.BasicType;
import edu.ksu.cis.santos.mdcf.dml.ast.Model;
import edu.ksu.cis.santos.mdcf.dml.ast.NamedType;
import edu.ksu.cis.santos.mdcf.dml.symbol.SymbolTable;

public class BasicTypeWellFormednessCheckerUsingSymbolTable {
	private Model m;
	private SymbolTable ST;

	private ArrayList<String> basicTypeList;
	private HashMap<String, ArrayList<String>> inheritanceRelations;
	private HashMap<String, ArrayList<String>> completeInheritanceRelations;

	public BasicTypeWellFormednessCheckerUsingSymbolTable(Model m) {
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

	public boolean checkBasicTypeWellformedness_NonBasicType() {
		// For each basic type, each of its super types is either another basic
		// type or dms.BasicType.
		for (String key : this.basicTypeList) {
			if (this.completeInheritanceRelations.get(key) != null) {
				for (String type : this.completeInheritanceRelations.get(key)) {
					if (!this.basicTypeList.contains(type)) {
						// the type is not a basic type or not inheriting from
						// basic type.
						System.err.println(key
								+ " inherits from a non-basic type: " + type);
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean checkBasicTypeWellformedness_CyclicInheritance() {
		// There is no circularity in the basic type sub-type hierarchy.
		for (String key : this.basicTypeList) {
			if (this.completeInheritanceRelations.get(key) != null) {
				ArrayList<String> fullList = this.completeInheritanceRelations
						.get(key);
				if (fullList.contains(key)) {
					// If the complete inheritance list contains the root type,
					// it is cyclic.
					System.err.println(key + " is cyclic: " + fullList);
					return false;
				}
			}
		}
		return true;
	}

}
