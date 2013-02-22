/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELiteral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getELiteral()
 * @model
 * @generated
 */
public interface ELiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit</em>' attribute.
   * @see #setLit(String)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getELiteral_Lit()
   * @model
   * @generated
   */
  String getLit();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral#getLit <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit</em>' attribute.
   * @see #getLit()
   * @generated
   */
  void setLit(String value);

} // ELiteral
