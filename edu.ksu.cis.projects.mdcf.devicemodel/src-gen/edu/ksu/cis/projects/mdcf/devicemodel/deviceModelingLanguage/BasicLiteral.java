/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral#getTypeCons <em>Type Cons</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getBasicLiteral()
 * @model
 * @generated
 */
public interface BasicLiteral extends Literal
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
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getBasicLiteral_TypeCons()
   * @model
   * @generated
   */
  TypeDecl getTypeCons();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral#getTypeCons <em>Type Cons</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Cons</em>' reference.
   * @see #getTypeCons()
   * @generated
   */
  void setTypeCons(TypeDecl value);

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
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getBasicLiteral_Lit()
   * @model
   * @generated
   */
  String getLit();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral#getLit <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit</em>' attribute.
   * @see #getLit()
   * @generated
   */
  void setLit(String value);

} // BasicLiteral
