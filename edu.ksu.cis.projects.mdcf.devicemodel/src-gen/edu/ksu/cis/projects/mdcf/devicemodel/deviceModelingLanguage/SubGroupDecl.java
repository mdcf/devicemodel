/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Group Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getName <em>Name</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getSubGroupDecl()
 * @model
 * @generated
 */
public interface SubGroupDecl extends GroupElementDecl
{
  /**
   * Returns the value of the '<em><b>Category Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category Name</em>' attribute.
   * @see #setCategoryName(String)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getSubGroupDecl_CategoryName()
   * @model
   * @generated
   */
  String getCategoryName();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getCategoryName <em>Category Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Name</em>' attribute.
   * @see #getCategoryName()
   * @generated
   */
  void setCategoryName(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getSubGroupDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(SubGroupType)
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#getSubGroupDecl_Type()
   * @model containment="true"
   * @generated
   */
  SubGroupType getType();

  /**
   * Sets the value of the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(SubGroupType value);

} // SubGroupDecl
