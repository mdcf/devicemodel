/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody#getGroupElements <em>Group Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getFeatureGroupBody()
 * @model
 * @generated
 */
public interface FeatureGroupBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Group Elements</b></em>' containment reference list.
   * The list contents are of type {@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupElementDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Elements</em>' containment reference list.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getFeatureGroupBody_GroupElements()
   * @model containment="true"
   * @generated
   */
  EList<GroupElementDecl> getGroupElements();

} // FeatureGroupBody
