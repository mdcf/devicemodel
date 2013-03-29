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
   * Returns a new object of class '<em>Feature Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Decl</em>'.
   * @generated
   */
  FeatureDecl createFeatureDecl();

  /**
   * Returns a new object of class '<em>Member Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Decl</em>'.
   * @generated
   */
  MemberDecl createMemberDecl();

  /**
   * Returns a new object of class '<em>Attr Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attr Decl</em>'.
   * @generated
   */
  AttrDecl createAttrDecl();

  /**
   * Returns a new object of class '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier</em>'.
   * @generated
   */
  Modifier createModifier();

  /**
   * Returns a new object of class '<em>Sub Member Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Member Decl</em>'.
   * @generated
   */
  SubMemberDecl createSubMemberDecl();

  /**
   * Returns a new object of class '<em>MModifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MModifier</em>'.
   * @generated
   */
  MModifier createMModifier();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report</em>'.
   * @generated
   */
  Report createReport();

  /**
   * Returns a new object of class '<em>Feature Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Type</em>'.
   * @generated
   */
  FeatureType createFeatureType();

  /**
   * Returns a new object of class '<em>Base Feature Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Feature Type</em>'.
   * @generated
   */
  BaseFeatureType createBaseFeatureType();

  /**
   * Returns a new object of class '<em>Invariant Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invariant Decl</em>'.
   * @generated
   */
  InvariantDecl createInvariantDecl();

  /**
   * Returns a new object of class '<em>Multiplicity Invariant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicity Invariant</em>'.
   * @generated
   */
  MultiplicityInvariant createMultiplicityInvariant();

  /**
   * Returns a new object of class '<em>General Invariant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>General Invariant</em>'.
   * @generated
   */
  GeneralInvariant createGeneralInvariant();

  /**
   * Returns a new object of class '<em>Sub Member Match</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Member Match</em>'.
   * @generated
   */
  SubMemberMatch createSubMemberMatch();

  /**
   * Returns a new object of class '<em>Constraint Nat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Nat</em>'.
   * @generated
   */
  ConstraintNat createConstraintNat();

  /**
   * Returns a new object of class '<em>Device</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device</em>'.
   * @generated
   */
  Device createDevice();

  /**
   * Returns a new object of class '<em>Constraint Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Exp</em>'.
   * @generated
   */
  ConstraintExp createConstraintExp();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Report Member Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report Member Decl</em>'.
   * @generated
   */
  ReportMemberDecl createReportMemberDecl();

  /**
   * Returns a new object of class '<em>Accessor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accessor</em>'.
   * @generated
   */
  Accessor createAccessor();

  /**
   * Returns a new object of class '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp</em>'.
   * @generated
   */
  Exp createExp();

  /**
   * Returns a new object of class '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary</em>'.
   * @generated
   */
  Primary createPrimary();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Base Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Type</em>'.
   * @generated
   */
  BaseType createBaseType();

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
   * Returns a new object of class '<em>Seq Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seq Literal</em>'.
   * @generated
   */
  SeqLiteral createSeqLiteral();

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
   * Returns a new object of class '<em>Simple Seq Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Seq Literal</em>'.
   * @generated
   */
  SimpleSeqLiteral createSimpleSeqLiteral();

  /**
   * Returns a new object of class '<em>Simple Set Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Set Literal</em>'.
   * @generated
   */
  SimpleSetLiteral createSimpleSetLiteral();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data</em>'.
   * @generated
   */
  Data createData();

  /**
   * Returns a new object of class '<em>App</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>App</em>'.
   * @generated
   */
  App createApp();

  /**
   * Returns a new object of class '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const</em>'.
   * @generated
   */
  Const createConst();

  /**
   * Returns a new object of class '<em>Val</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Val</em>'.
   * @generated
   */
  Val createVal();

  /**
   * Returns a new object of class '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var</em>'.
   * @generated
   */
  Var createVar();

  /**
   * Returns a new object of class '<em>Override</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Override</em>'.
   * @generated
   */
  Override createOverride();

  /**
   * Returns a new object of class '<em>Option Feature Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Feature Type</em>'.
   * @generated
   */
  OptionFeatureType createOptionFeatureType();

  /**
   * Returns a new object of class '<em>Some Feature Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Feature Type</em>'.
   * @generated
   */
  SomeFeatureType createSomeFeatureType();

  /**
   * Returns a new object of class '<em>Either Feature Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Either Feature Type</em>'.
   * @generated
   */
  EitherFeatureType createEitherFeatureType();

  /**
   * Returns a new object of class '<em>Seq Feature Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seq Feature Type</em>'.
   * @generated
   */
  SeqFeatureType createSeqFeatureType();

  /**
   * Returns a new object of class '<em>Set Feature Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Feature Type</em>'.
   * @generated
   */
  SetFeatureType createSetFeatureType();

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
   * Returns a new object of class '<em>Binary Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Exp</em>'.
   * @generated
   */
  BinaryExp createBinaryExp();

  /**
   * Returns a new object of class '<em>Unary Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Exp</em>'.
   * @generated
   */
  UnaryExp createUnaryExp();

  /**
   * Returns a new object of class '<em>Primary Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Exp</em>'.
   * @generated
   */
  PrimaryExp createPrimaryExp();

  /**
   * Returns a new object of class '<em>Access Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access Exp</em>'.
   * @generated
   */
  AccessExp createAccessExp();

  /**
   * Returns a new object of class '<em>Name Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Exp</em>'.
   * @generated
   */
  NameExp createNameExp();

  /**
   * Returns a new object of class '<em>Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Exp</em>'.
   * @generated
   */
  LiteralExp createLiteralExp();

  /**
   * Returns a new object of class '<em>Seq Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seq Type</em>'.
   * @generated
   */
  SeqType createSeqType();

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
   * Returns a new object of class '<em>Option Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Type</em>'.
   * @generated
   */
  OptionType createOptionType();

  /**
   * Returns a new object of class '<em>Some Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Type</em>'.
   * @generated
   */
  SomeType createSomeType();

  /**
   * Returns a new object of class '<em>None Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>None Type</em>'.
   * @generated
   */
  NoneType createNoneType();

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
