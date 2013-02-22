/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getTypeCons <em>Type Cons</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getElems <em>Elems</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getListLiteral()
 * @model
 * @generated
 */
public interface ListLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Type Cons</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Cons</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Cons</em>' reference.
   * @see #setTypeCons(TypeDecl)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getListLiteral_TypeCons()
   * @model
   * @generated
   */
  TypeDecl getTypeCons();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getTypeCons <em>Type Cons</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Cons</em>' reference.
   * @see #getTypeCons()
   * @generated
   */
  void setTypeCons(TypeDecl value);

  /**
   * Returns the value of the '<em><b>Elems</b></em>' containment reference list.
   * The list contents are of type {@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elems</em>' containment reference list.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getListLiteral_Elems()
   * @model containment="true"
   * @generated
   */
  EList<ELiteral> getElems();

} // ListLiteral
