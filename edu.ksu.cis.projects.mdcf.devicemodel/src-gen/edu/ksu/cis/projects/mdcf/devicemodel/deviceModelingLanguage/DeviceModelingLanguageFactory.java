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
   * Returns a new object of class '<em>Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Decl</em>'.
   * @generated
   */
  TypeDecl createTypeDecl();

  /**
   * Returns a new object of class '<em>Features Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Features Decl</em>'.
   * @generated
   */
  FeaturesDecl createFeaturesDecl();

  /**
   * Returns a new object of class '<em>Features Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Features Body</em>'.
   * @generated
   */
  FeaturesBody createFeaturesBody();

  /**
   * Returns a new object of class '<em>Feature Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Decl</em>'.
   * @generated
   */
  FeatureDecl createFeatureDecl();

  /**
   * Returns a new object of class '<em>Sub Features Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Features Decl</em>'.
   * @generated
   */
  SubFeaturesDecl createSubFeaturesDecl();

  /**
   * Returns a new object of class '<em>Sub Features Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Features Type</em>'.
   * @generated
   */
  SubFeaturesType createSubFeaturesType();

  /**
   * Returns a new object of class '<em>Invariant Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invariant Decl</em>'.
   * @generated
   */
  InvariantDecl createInvariantDecl();

  /**
   * Returns a new object of class '<em>Multiplicity Invariant Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicity Invariant Decl</em>'.
   * @generated
   */
  MultiplicityInvariantDecl createMultiplicityInvariantDecl();

  /**
   * Returns a new object of class '<em>Sub Features Match</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Features Match</em>'.
   * @generated
   */
  SubFeaturesMatch createSubFeaturesMatch();

  /**
   * Returns a new object of class '<em>Constraint Nat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Nat</em>'.
   * @generated
   */
  ConstraintNat createConstraintNat();

  /**
   * Returns a new object of class '<em>Attr Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attr Decl</em>'.
   * @generated
   */
  AttrDecl createAttrDecl();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Type</em>'.
   * @generated
   */
  BasicType createBasicType();

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
   * Returns a new object of class '<em>Option Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Literal</em>'.
   * @generated
   */
  OptionLiteral createOptionLiteral();

  /**
   * Returns a new object of class '<em>Simple Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Literal</em>'.
   * @generated
   */
  SimpleLiteral createSimpleLiteral();

  /**
   * Returns a new object of class '<em>Simple Basic Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Basic Literal</em>'.
   * @generated
   */
  SimpleBasicLiteral createSimpleBasicLiteral();

  /**
   * Returns a new object of class '<em>Simple Tuple Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Tuple Literal</em>'.
   * @generated
   */
  SimpleTupleLiteral createSimpleTupleLiteral();

  /**
   * Returns a new object of class '<em>Simple Option Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Option Literal</em>'.
   * @generated
   */
  SimpleOptionLiteral createSimpleOptionLiteral();

  /**
   * Returns a new object of class '<em>Simple List Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple List Literal</em>'.
   * @generated
   */
  SimpleListLiteral createSimpleListLiteral();

  /**
   * Returns a new object of class '<em>Simple Set Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Set Literal</em>'.
   * @generated
   */
  SimpleSetLiteral createSimpleSetLiteral();

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
   * Returns a new object of class '<em>Num Nat Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Num Nat Constraint</em>'.
   * @generated
   */
  NumNatConstraint createNumNatConstraint();

  /**
   * Returns a new object of class '<em>Any Nat Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Nat Constraint</em>'.
   * @generated
   */
  AnyNatConstraint createAnyNatConstraint();

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
   * Returns a new object of class '<em>Option Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Type</em>'.
   * @generated
   */
  OptionType createOptionType();

  /**
   * Returns a new object of class '<em>Tuple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type</em>'.
   * @generated
   */
  TupleType createTupleType();

  /**
   * Returns a new object of class '<em>None Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>None Literal</em>'.
   * @generated
   */
  NoneLiteral createNoneLiteral();

  /**
   * Returns a new object of class '<em>Some Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Literal</em>'.
   * @generated
   */
  SomeLiteral createSomeLiteral();

  /**
   * Returns a new object of class '<em>Simple None Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple None Literal</em>'.
   * @generated
   */
  SimpleNoneLiteral createSimpleNoneLiteral();

  /**
   * Returns a new object of class '<em>Simple Some Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Some Literal</em>'.
   * @generated
   */
  SimpleSomeLiteral createSimpleSomeLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DeviceModelingLanguagePackage getDeviceModelingLanguagePackage();

} //DeviceModelingLanguageFactory
