/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage
 * @generated
 */
public interface DeviceModelingLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeviceModelingLanguageFactory eINSTANCE = edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl</em>'.
   * @generated
   */
  Decl createDecl();

  /**
   * Returns a new object of class '<em>Feature Group Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Group Body</em>'.
   * @generated
   */
  FeatureGroupBody createFeatureGroupBody();

  /**
   * Returns a new object of class '<em>Group Element Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Element Decl</em>'.
   * @generated
   */
  GroupElementDecl createGroupElementDecl();

  /**
   * Returns a new object of class '<em>Group Attr Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Attr Decl</em>'.
   * @generated
   */
  GroupAttrDecl createGroupAttrDecl();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Basic Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Literal</em>'.
   * @generated
   */
  BasicLiteral createBasicLiteral();

  /**
   * Returns a new object of class '<em>Tuple Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Literal</em>'.
   * @generated
   */
  TupleLiteral createTupleLiteral();

  /**
   * Returns a new object of class '<em>List Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Literal</em>'.
   * @generated
   */
  ListLiteral createListLiteral();

  /**
   * Returns a new object of class '<em>Set Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Literal</em>'.
   * @generated
   */
  SetLiteral createSetLiteral();

  /**
   * Returns a new object of class '<em>ELiteral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ELiteral</em>'.
   * @generated
   */
  ELiteral createELiteral();

  /**
   * Returns a new object of class '<em>Sub Group Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Group Decl</em>'.
   * @generated
   */
  SubGroupDecl createSubGroupDecl();

  /**
   * Returns a new object of class '<em>Sub Group Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Group Type</em>'.
   * @generated
   */
  SubGroupType createSubGroupType();

  /**
   * Returns a new object of class '<em>Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Decl</em>'.
   * @generated
   */
  TypeDecl createTypeDecl();

  /**
   * Returns a new object of class '<em>Feature Group Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Group Decl</em>'.
   * @generated
   */
  FeatureGroupDecl createFeatureGroupDecl();

  /**
   * Returns a new object of class '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Type</em>'.
   * @generated
   */
  BasicType createBasicType();

  /**
   * Returns a new object of class '<em>List Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Type</em>'.
   * @generated
   */
  ListType createListType();

  /**
   * Returns a new object of class '<em>Set Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Type</em>'.
   * @generated
   */
  SetType createSetType();

  /**
   * Returns a new object of class '<em>Tuple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type</em>'.
   * @generated
   */
  TupleType createTupleType();

  /**
   * Returns a new object of class '<em>Sub Group Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Group Type Ref</em>'.
   * @generated
   */
  SubGroupTypeRef createSubGroupTypeRef();

  /**
   * Returns a new object of class '<em>Sub Group Type Anon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Group Type Anon</em>'.
   * @generated
   */
  SubGroupTypeAnon createSubGroupTypeAnon();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DeviceModelingLanguagePackage getDeviceModelingLanguagePackage();

} //DeviceModelingLanguageFactory
