/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Attr Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeLiteral <em>Attribute Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getGroupAttrDecl()
 * @model
 * @generated
 */
public interface GroupAttrDecl extends GroupElementDecl
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see #setModifier(String)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getGroupAttrDecl_Modifier()
   * @model
   * @generated
   */
  String getModifier();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see #getModifier()
   * @generated
   */
  void setModifier(String value);

  /**
   * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Name</em>' attribute.
   * @see #setAttributeName(String)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getGroupAttrDecl_AttributeName()
   * @model
   * @generated
   */
  String getAttributeName();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeName <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Name</em>' attribute.
   * @see #getAttributeName()
   * @generated
   */
  void setAttributeName(String value);

  /**
   * Returns the value of the '<em><b>Attribute Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Type</em>' containment reference.
   * @see #setAttributeType(Type)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getGroupAttrDecl_AttributeType()
   * @model containment="true"
   * @generated
   */
  Type getAttributeType();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeType <em>Attribute Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type</em>' containment reference.
   * @see #getAttributeType()
   * @generated
   */
  void setAttributeType(Type value);

  /**
   * Returns the value of the '<em><b>Attribute Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Literal</em>' containment reference.
   * @see #setAttributeLiteral(Literal)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getGroupAttrDecl_AttributeLiteral()
   * @model containment="true"
   * @generated
   */
  Literal getAttributeLiteral();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeLiteral <em>Attribute Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Literal</em>' containment reference.
   * @see #getAttributeLiteral()
   * @generated
   */
  void setAttributeLiteral(Literal value);

} // GroupAttrDecl
