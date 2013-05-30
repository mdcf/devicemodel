/**
 * 
 */
package edu.ksu.cis.santos.mdcf.dml.checker;

import edu.ksu.cis.santos.mdcf.dml.ast.AbstractVisitor;
import edu.ksu.cis.santos.mdcf.dml.ast.BasicType;
import edu.ksu.cis.santos.mdcf.dml.ast.Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author yjkim
 * 
 */
public class BasicTypeWellFormednessChecker {
	class visitor extends AbstractVisitor {
		public ArrayList<String> basicTypeList;
		public HashMap<String, ArrayList<String>> inheritanceRelations;

		public visitor() {
			this.basicTypeList = new ArrayList<String>();
			this.inheritanceRelations = new HashMap<String, ArrayList<String>>();
		}

		@Override
		public boolean visitBasicType(BasicType node) {
			this.basicTypeList.add(node.name);

			if (!node.supers.isEmpty()) {

				ArrayList<String> superList;
				if ((superList = this.inheritanceRelations.get(node.name)) == null) {
					superList = new ArrayList<String>();
				}

				for (edu.ksu.cis.santos.mdcf.dml.ast.NamedType type : node.supers) {
					superList.add(type.name);
				}

				this.inheritanceRelations.put(node.name, superList);
			}
			return true;
		}
	}

	private Model m;
	private visitor v;

	private ArrayList<String> basicTypeList;
	private HashMap<String, ArrayList<String>> inheritanceRelations;
	private HashMap<String, ArrayList<String>> completeInheritanceRelations;

	public BasicTypeWellFormednessChecker(Model m) {
		this.m = m;
	}

	public void init() {
		v = new visitor();
		v.visit(m);

		System.out.println("BasicType List: " + v.basicTypeList);
		System.out.println("Inheritance Relation List: "
				+ v.inheritanceRelations);

		this.basicTypeList = v.basicTypeList;
		this.inheritanceRelations = v.inheritanceRelations;
		this.completeInheritanceRelations = new HashMap<String, ArrayList<String>>();

		// Build the inheritance hierarchy for each
		for (String key : this.inheritanceRelations.keySet()) {
			ArrayList<String> fullList = new ArrayList<String>();
			buildInheritanceHierarchy(key, key, fullList);
			this.completeInheritanceRelations.put(key, fullList);
		}

		System.out.println("Complete Inheritance Relation List: "
				+ this.completeInheritanceRelations);

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
}
