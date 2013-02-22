/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl#getSupers <em>Supers</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getFeatureGroupDecl()
 * @model
 * @generated
 */
public interface FeatureGroupDecl extends Decl
{
  /**
   * Returns the value of the '<em><b>Supers</b></em>' reference list.
   * The list contents are of type {@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supers</em>' reference list.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getFeatureGroupDecl_Supers()
   * @model
   * @generated
   */
  EList<FeatureGroupDecl> getSupers();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(FeatureGroupBody)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getFeatureGroupDecl_Body()
   * @model containment="true"
   * @generated
   */
  FeatureGroupBody getBody();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(FeatureGroupBody value);

} // FeatureGroupDecl
