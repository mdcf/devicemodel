/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType#getElemTypes <em>Elem Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getTupleType()
 * @model
 * @generated
 */
public interface TupleType extends Type
{
  /**
   * Returns the value of the '<em><b>Elem Types</b></em>' containment reference list.
   * The list contents are of type {@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem Types</em>' containment reference list.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getTupleType_ElemTypes()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElemTypes();

} // TupleType
