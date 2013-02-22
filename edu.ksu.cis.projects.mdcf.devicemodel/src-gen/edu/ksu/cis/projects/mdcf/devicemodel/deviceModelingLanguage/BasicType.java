/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getBasicType()
 * @model
 * @generated
 */
public interface BasicType extends Type
{
  /**
   * Returns the value of the '<em><b>Base Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type</em>' reference.
   * @see #setBaseType(TypeDecl)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getBasicType_BaseType()
   * @model
   * @generated
   */
  TypeDecl getBaseType();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType#getBaseType <em>Base Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type</em>' reference.
   * @see #getBaseType()
   * @generated
   */
  void setBaseType(TypeDecl value);

} // BasicType
