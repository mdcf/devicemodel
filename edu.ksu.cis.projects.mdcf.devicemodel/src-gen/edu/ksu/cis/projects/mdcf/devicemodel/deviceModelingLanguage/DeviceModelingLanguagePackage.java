/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface DeviceModelingLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "deviceModelingLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://http://mdcf.santos.cis.ksu.edu/devicemodel/DeviceModelingLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "deviceModelingLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeviceModelingLanguagePackage eINSTANCE = edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ModelImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeclImpl <em>Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getDecl()
   * @generated
   */
  int DECL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__NAME = 0;

  /**
   * The number of structural features of the '<em>Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeDeclImpl <em>Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getTypeDecl()
   * @generated
   */
  int TYPE_DECL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__NAME = DECL__NAME;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentDeclImpl <em>Component Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getComponentDecl()
   * @generated
   */
  int COMPONENT_DECL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECL__SUPERS = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECL__MEMBERS = DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECL__DEVICES = DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECL__ASSIGNS = DECL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECL__EXP = DECL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Component Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AssignmentImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__EXP = 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MemberDeclImpl <em>Member Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MemberDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMemberDecl()
   * @generated
   */
  int MEMBER_DECL = 5;

  /**
   * The number of structural features of the '<em>Member Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl <em>Attr Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAttrDecl()
   * @generated
   */
  int ATTR_DECL = 6;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL__MODIFIER = MEMBER_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL__ATTRIBUTE_NAME = MEMBER_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL__TYPE = MEMBER_DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL__LITERAL = MEMBER_DECL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Attr Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL_FEATURE_COUNT = MEMBER_DECL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberDeclImpl <em>Sub Member Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubMemberDecl()
   * @generated
   */
  int SUB_MEMBER_DECL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_DECL__NAME = MEMBER_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_DECL__TYPE = MEMBER_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_DECL__MEMBERS = MEMBER_DECL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sub Member Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_DECL_FEATURE_COUNT = MEMBER_DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureType()
   * @generated
   */
  int FEATURE_TYPE = 8;

  /**
   * The number of structural features of the '<em>Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BaseFeatureTypeImpl <em>Base Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BaseFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBaseFeatureType()
   * @generated
   */
  int BASE_FEATURE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Components</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_FEATURE_TYPE__COMPONENTS = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_FEATURE_TYPE__MEMBERS = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Base Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_FEATURE_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.InvariantDeclImpl <em>Invariant Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.InvariantDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getInvariantDecl()
   * @generated
   */
  int INVARIANT_DECL = 10;

  /**
   * The feature id for the '<em><b>Inv Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_DECL__INV_NAME = MEMBER_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Invariant Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_DECL_FEATURE_COUNT = MEMBER_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantDeclImpl <em>Multiplicity Invariant Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMultiplicityInvariantDecl()
   * @generated
   */
  int MULTIPLICITY_INVARIANT_DECL = 11;

  /**
   * The feature id for the '<em><b>Inv Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__INV_NAME = INVARIANT_DECL__INV_NAME;

  /**
   * The feature id for the '<em><b>Lo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__LO = INVARIANT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__HI = INVARIANT_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__MATCH = INVARIANT_DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__TYPE = INVARIANT_DECL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Multiplicity Invariant Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL_FEATURE_COUNT = INVARIANT_DECL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GeneralInvariantDeclImpl <em>General Invariant Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GeneralInvariantDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getGeneralInvariantDecl()
   * @generated
   */
  int GENERAL_INVARIANT_DECL = 12;

  /**
   * The feature id for the '<em><b>Inv Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INVARIANT_DECL__INV_NAME = INVARIANT_DECL__INV_NAME;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INVARIANT_DECL__EXP = INVARIANT_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>General Invariant Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INVARIANT_DECL_FEATURE_COUNT = INVARIANT_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberMatchImpl <em>Sub Member Match</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberMatchImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubMemberMatch()
   * @generated
   */
  int SUB_MEMBER_MATCH = 13;

  /**
   * The feature id for the '<em><b>QNames</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_MATCH__QNAMES = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_MATCH__NAME = 1;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_MATCH__ANY = 2;

  /**
   * The number of structural features of the '<em>Sub Member Match</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_MATCH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintNatImpl <em>Constraint Nat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintNatImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getConstraintNat()
   * @generated
   */
  int CONSTRAINT_NAT = 14;

  /**
   * The number of structural features of the '<em>Constraint Nat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_NAT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__NAME = COMPONENT_DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__SUPERS = COMPONENT_DECL__SUPERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__MEMBERS = COMPONENT_DECL__MEMBERS;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICES = COMPONENT_DECL__DEVICES;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__ASSIGNS = COMPONENT_DECL__ASSIGNS;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__EXP = COMPONENT_DECL__EXP;

  /**
   * The feature id for the '<em><b>Components</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__COMPONENTS = COMPONENT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__CONSTRAINT = COMPONENT_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = COMPONENT_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintExpImpl <em>Constraint Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getConstraintExp()
   * @generated
   */
  int CONSTRAINT_EXP = 16;

  /**
   * The number of structural features of the '<em>Constraint Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrOrSubMemberImpl <em>Attr Or Sub Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrOrSubMemberImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAttrOrSubMember()
   * @generated
   */
  int ATTR_OR_SUB_MEMBER = 17;

  /**
   * The number of structural features of the '<em>Attr Or Sub Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_OR_SUB_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getExp()
   * @generated
   */
  int EXP = 18;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = CONSTRAINT_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryImpl <em>Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getPrimary()
   * @generated
   */
  int PRIMARY = 19;

  /**
   * The number of structural features of the '<em>Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 20;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BaseTypeImpl <em>Base Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BaseTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBaseType()
   * @generated
   */
  int BASE_TYPE = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Base Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 22;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicLiteralImpl <em>Basic Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBasicLiteral()
   * @generated
   */
  int BASIC_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Type Cons</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_LITERAL__TYPE_CONS = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_LITERAL__LIT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Basic Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleLiteralImpl <em>Tuple Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getTupleLiteral()
   * @generated
   */
  int TUPLE_LITERAL = 24;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_LITERAL__ELEMS = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqLiteralImpl <em>Seq Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSeqLiteral()
   * @generated
   */
  int SEQ_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Basic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_LITERAL__BASIC_TYPE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_LITERAL__ELEMS = LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Seq Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetLiteralImpl <em>Set Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSetLiteral()
   * @generated
   */
  int SET_LITERAL = 26;

  /**
   * The feature id for the '<em><b>Basic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL__BASIC_TYPE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL__ELEMS = LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionLiteralImpl <em>Option Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOptionLiteral()
   * @generated
   */
  int OPTION_LITERAL = 27;

  /**
   * The number of structural features of the '<em>Option Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleLiteralImpl <em>Simple Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleLiteral()
   * @generated
   */
  int SIMPLE_LITERAL = 28;

  /**
   * The number of structural features of the '<em>Simple Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleBasicLiteralImpl <em>Simple Basic Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleBasicLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleBasicLiteral()
   * @generated
   */
  int SIMPLE_BASIC_LITERAL = 29;

  /**
   * The feature id for the '<em><b>Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BASIC_LITERAL__LIT = SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Basic Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BASIC_LITERAL_FEATURE_COUNT = SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleTupleLiteralImpl <em>Simple Tuple Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleTupleLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleTupleLiteral()
   * @generated
   */
  int SIMPLE_TUPLE_LITERAL = 30;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TUPLE_LITERAL__ELEMS = SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Tuple Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TUPLE_LITERAL_FEATURE_COUNT = SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleOptionLiteralImpl <em>Simple Option Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleOptionLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleOptionLiteral()
   * @generated
   */
  int SIMPLE_OPTION_LITERAL = 31;

  /**
   * The number of structural features of the '<em>Simple Option Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OPTION_LITERAL_FEATURE_COUNT = SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSeqLiteralImpl <em>Simple Seq Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSeqLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleSeqLiteral()
   * @generated
   */
  int SIMPLE_SEQ_LITERAL = 32;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SEQ_LITERAL__ELEMS = SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Seq Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SEQ_LITERAL_FEATURE_COUNT = SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSetLiteralImpl <em>Simple Set Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSetLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleSetLiteral()
   * @generated
   */
  int SIMPLE_SET_LITERAL = 33;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SET_LITERAL__ELEMS = SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Set Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SET_LITERAL_FEATURE_COUNT = SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = COMPONENT_DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__SUPERS = COMPONENT_DECL__SUPERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__MEMBERS = COMPONENT_DECL__MEMBERS;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__DEVICES = COMPONENT_DECL__DEVICES;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ASSIGNS = COMPONENT_DECL__ASSIGNS;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__EXP = COMPONENT_DECL__EXP;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = COMPONENT_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AppImpl <em>App</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AppImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getApp()
   * @generated
   */
  int APP = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__NAME = COMPONENT_DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__SUPERS = COMPONENT_DECL__SUPERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__MEMBERS = COMPONENT_DECL__MEMBERS;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__DEVICES = COMPONENT_DECL__DEVICES;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__ASSIGNS = COMPONENT_DECL__ASSIGNS;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__EXP = COMPONENT_DECL__EXP;

  /**
   * The number of structural features of the '<em>App</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_FEATURE_COUNT = COMPONENT_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionFeatureTypeImpl <em>Option Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOptionFeatureType()
   * @generated
   */
  int OPTION_FEATURE_TYPE = 36;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_TYPE__BASE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Option Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeFeatureTypeImpl <em>Some Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSomeFeatureType()
   * @generated
   */
  int SOME_FEATURE_TYPE = 37;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_FEATURE_TYPE__BASE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_FEATURE_TYPE__MEMBERS = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Some Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_FEATURE_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneFeatureTypeImpl <em>None Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNoneFeatureType()
   * @generated
   */
  int NONE_FEATURE_TYPE = 38;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONE_FEATURE_TYPE__BASE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>None Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONE_FEATURE_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl <em>Either Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getEitherFeatureType()
   * @generated
   */
  int EITHER_FEATURE_TYPE = 39;

  /**
   * The feature id for the '<em><b>Bases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EITHER_FEATURE_TYPE__BASES = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Choice</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EITHER_FEATURE_TYPE__CHOICE = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EITHER_FEATURE_TYPE__MEMBERS = FEATURE_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Either Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EITHER_FEATURE_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NumNatConstraintImpl <em>Num Nat Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NumNatConstraintImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNumNatConstraint()
   * @generated
   */
  int NUM_NAT_CONSTRAINT = 40;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_NAT_CONSTRAINT__NUM = CONSTRAINT_NAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Num Nat Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_NAT_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_NAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AnyNatConstraintImpl <em>Any Nat Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AnyNatConstraintImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAnyNatConstraint()
   * @generated
   */
  int ANY_NAT_CONSTRAINT = 41;

  /**
   * The number of structural features of the '<em>Any Nat Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_NAT_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_NAT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BinaryExpImpl <em>Binary Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BinaryExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBinaryExp()
   * @generated
   */
  int BINARY_EXP = 42;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP__LEFT = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP__OP = EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP__RIGHT = EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.UnaryExpImpl <em>Unary Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.UnaryExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getUnaryExp()
   * @generated
   */
  int UNARY_EXP = 43;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP__OP = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP__ARG = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryExpImpl <em>Primary Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getPrimaryExp()
   * @generated
   */
  int PRIMARY_EXP = 44;

  /**
   * The feature id for the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXP__PRIMARY = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primary Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AccessExpImpl <em>Access Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AccessExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAccessExp()
   * @generated
   */
  int ACCESS_EXP = 45;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXP__BASE = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXP__NAME = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Access Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NameExpImpl <em>Name Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NameExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNameExp()
   * @generated
   */
  int NAME_EXP = 46;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXP__ID = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Name Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXP_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralExpImpl <em>Literal Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getLiteralExp()
   * @generated
   */
  int LITERAL_EXP = 47;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXP__LIT = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXP_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqTypeImpl <em>Seq Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSeqType()
   * @generated
   */
  int SEQ_TYPE = 48;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_TYPE__BASE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Seq Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetTypeImpl <em>Set Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSetType()
   * @generated
   */
  int SET_TYPE = 49;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__BASE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getTupleType()
   * @generated
   */
  int TUPLE_TYPE = 50;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE__TYPE = BASE_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Elem Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE__ELEM_TYPES = BASE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionTypeImpl <em>Option Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOptionType()
   * @generated
   */
  int OPTION_TYPE = 51;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_TYPE__TYPE = BASE_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_TYPE__BASE = BASE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Option Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeTypeImpl <em>Some Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSomeType()
   * @generated
   */
  int SOME_TYPE = 52;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_TYPE__TYPE = BASE_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_TYPE__BASE = BASE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Some Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneTypeImpl <em>None Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNoneType()
   * @generated
   */
  int NONE_TYPE = 53;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONE_TYPE__TYPE = BASE_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONE_TYPE__BASE = BASE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>None Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONE_TYPE_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneLiteralImpl <em>None Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNoneLiteral()
   * @generated
   */
  int NONE_LITERAL = 54;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONE_LITERAL__TYPE = OPTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>None Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONE_LITERAL_FEATURE_COUNT = OPTION_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeLiteralImpl <em>Some Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSomeLiteral()
   * @generated
   */
  int SOME_LITERAL = 55;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_LITERAL__LIT = OPTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Some Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_LITERAL_FEATURE_COUNT = OPTION_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleNoneLiteralImpl <em>Simple None Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleNoneLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleNoneLiteral()
   * @generated
   */
  int SIMPLE_NONE_LITERAL = 56;

  /**
   * The number of structural features of the '<em>Simple None Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_NONE_LITERAL_FEATURE_COUNT = SIMPLE_OPTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSomeLiteralImpl <em>Simple Some Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSomeLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleSomeLiteral()
   * @generated
   */
  int SIMPLE_SOME_LITERAL = 57;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SOME_LITERAL__LIT = SIMPLE_OPTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Some Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SOME_LITERAL_FEATURE_COUNT = SIMPLE_OPTION_LITERAL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model#getDecls <em>Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decls</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model#getDecls()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Decls();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl
   * @generated
   */
  EClass getDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl#getName()
   * @see #getDecl()
   * @generated
   */
  EAttribute getDecl_Name();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl
   * @generated
   */
  EClass getTypeDecl();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl <em>Component Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl
   * @generated
   */
  EClass getComponentDecl();

  /**
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getSupers <em>Supers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Supers</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getSupers()
   * @see #getComponentDecl()
   * @generated
   */
  EReference getComponentDecl_Supers();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getMembers()
   * @see #getComponentDecl()
   * @generated
   */
  EReference getComponentDecl_Members();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getDevices()
   * @see #getComponentDecl()
   * @generated
   */
  EReference getComponentDecl_Devices();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getAssigns()
   * @see #getComponentDecl()
   * @generated
   */
  EReference getComponentDecl_Assigns();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl#getExp()
   * @see #getComponentDecl()
   * @generated
   */
  EReference getComponentDecl_Exp();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment#getName()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment#getExp()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Exp();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl <em>Member Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl
   * @generated
   */
  EClass getMemberDecl();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl <em>Attr Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl
   * @generated
   */
  EClass getAttrDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getModifier()
   * @see #getAttrDecl()
   * @generated
   */
  EAttribute getAttrDecl_Modifier();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getAttributeName()
   * @see #getAttrDecl()
   * @generated
   */
  EAttribute getAttrDecl_AttributeName();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getType()
   * @see #getAttrDecl()
   * @generated
   */
  EReference getAttrDecl_Type();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getLiteral()
   * @see #getAttrDecl()
   * @generated
   */
  EReference getAttrDecl_Literal();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl <em>Sub Member Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Member Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl
   * @generated
   */
  EClass getSubMemberDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl#getName()
   * @see #getSubMemberDecl()
   * @generated
   */
  EAttribute getSubMemberDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl#getType()
   * @see #getSubMemberDecl()
   * @generated
   */
  EReference getSubMemberDecl_Type();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl#getMembers()
   * @see #getSubMemberDecl()
   * @generated
   */
  EReference getSubMemberDecl_Members();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureType <em>Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureType
   * @generated
   */
  EClass getFeatureType();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType <em>Base Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Feature Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType
   * @generated
   */
  EClass getBaseFeatureType();

  /**
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Components</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType#getComponents()
   * @see #getBaseFeatureType()
   * @generated
   */
  EReference getBaseFeatureType_Components();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType#getMembers()
   * @see #getBaseFeatureType()
   * @generated
   */
  EReference getBaseFeatureType_Members();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl <em>Invariant Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invariant Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl
   * @generated
   */
  EClass getInvariantDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl#getInvName <em>Inv Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inv Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl#getInvName()
   * @see #getInvariantDecl()
   * @generated
   */
  EAttribute getInvariantDecl_InvName();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl <em>Multiplicity Invariant Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity Invariant Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl
   * @generated
   */
  EClass getMultiplicityInvariantDecl();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getLo <em>Lo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lo</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getLo()
   * @see #getMultiplicityInvariantDecl()
   * @generated
   */
  EReference getMultiplicityInvariantDecl_Lo();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getHi <em>Hi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hi</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getHi()
   * @see #getMultiplicityInvariantDecl()
   * @generated
   */
  EReference getMultiplicityInvariantDecl_Hi();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getMatch <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Match</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getMatch()
   * @see #getMultiplicityInvariantDecl()
   * @generated
   */
  EReference getMultiplicityInvariantDecl_Match();

  /**
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getType()
   * @see #getMultiplicityInvariantDecl()
   * @generated
   */
  EReference getMultiplicityInvariantDecl_Type();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariantDecl <em>General Invariant Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Invariant Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariantDecl
   * @generated
   */
  EClass getGeneralInvariantDecl();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariantDecl#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariantDecl#getExp()
   * @see #getGeneralInvariantDecl()
   * @generated
   */
  EReference getGeneralInvariantDecl_Exp();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch <em>Sub Member Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Member Match</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch
   * @generated
   */
  EClass getSubMemberMatch();

  /**
   * Returns the meta object for the attribute list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch#getQNames <em>QNames</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>QNames</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch#getQNames()
   * @see #getSubMemberMatch()
   * @generated
   */
  EAttribute getSubMemberMatch_QNames();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch#getName()
   * @see #getSubMemberMatch()
   * @generated
   */
  EAttribute getSubMemberMatch_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch#getAny()
   * @see #getSubMemberMatch()
   * @generated
   */
  EAttribute getSubMemberMatch_Any();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintNat <em>Constraint Nat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Nat</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintNat
   * @generated
   */
  EClass getConstraintNat();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Components</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device#getComponents()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_Components();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device#getConstraint()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_Constraint();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp <em>Constraint Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp
   * @generated
   */
  EClass getConstraintExp();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrOrSubMember <em>Attr Or Sub Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr Or Sub Member</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrOrSubMember
   * @generated
   */
  EClass getAttrOrSubMember();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Primary
   * @generated
   */
  EClass getPrimary();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType
   * @generated
   */
  EClass getBaseType();

  /**
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType#getType()
   * @see #getBaseType()
   * @generated
   */
  EReference getBaseType_Type();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral <em>Basic Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral
   * @generated
   */
  EClass getBasicLiteral();

  /**
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral#getTypeCons <em>Type Cons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Cons</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral#getTypeCons()
   * @see #getBasicLiteral()
   * @generated
   */
  EReference getBasicLiteral_TypeCons();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lit</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral#getLit()
   * @see #getBasicLiteral()
   * @generated
   */
  EAttribute getBasicLiteral_Lit();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral <em>Tuple Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral
   * @generated
   */
  EClass getTupleLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral#getElems()
   * @see #getTupleLiteral()
   * @generated
   */
  EReference getTupleLiteral_Elems();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral <em>Seq Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral
   * @generated
   */
  EClass getSeqLiteral();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral#getBasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral#getBasicType()
   * @see #getSeqLiteral()
   * @generated
   */
  EReference getSeqLiteral_BasicType();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral#getElems()
   * @see #getSeqLiteral()
   * @generated
   */
  EReference getSeqLiteral_Elems();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral <em>Set Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral
   * @generated
   */
  EClass getSetLiteral();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral#getBasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral#getBasicType()
   * @see #getSetLiteral()
   * @generated
   */
  EReference getSetLiteral_BasicType();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral#getElems()
   * @see #getSetLiteral()
   * @generated
   */
  EReference getSetLiteral_Elems();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionLiteral <em>Option Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionLiteral
   * @generated
   */
  EClass getOptionLiteral();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleLiteral <em>Simple Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleLiteral
   * @generated
   */
  EClass getSimpleLiteral();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral <em>Simple Basic Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Basic Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral
   * @generated
   */
  EClass getSimpleBasicLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lit</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral#getLit()
   * @see #getSimpleBasicLiteral()
   * @generated
   */
  EAttribute getSimpleBasicLiteral_Lit();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral <em>Simple Tuple Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Tuple Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral
   * @generated
   */
  EClass getSimpleTupleLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral#getElems()
   * @see #getSimpleTupleLiteral()
   * @generated
   */
  EReference getSimpleTupleLiteral_Elems();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleOptionLiteral <em>Simple Option Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Option Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleOptionLiteral
   * @generated
   */
  EClass getSimpleOptionLiteral();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSeqLiteral <em>Simple Seq Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Seq Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSeqLiteral
   * @generated
   */
  EClass getSimpleSeqLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSeqLiteral#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSeqLiteral#getElems()
   * @see #getSimpleSeqLiteral()
   * @generated
   */
  EReference getSimpleSeqLiteral_Elems();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral <em>Simple Set Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Set Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral
   * @generated
   */
  EClass getSimpleSetLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral#getElems()
   * @see #getSimpleSetLiteral()
   * @generated
   */
  EReference getSimpleSetLiteral_Elems();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.App <em>App</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>App</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.App
   * @generated
   */
  EClass getApp();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType <em>Option Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option Feature Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType
   * @generated
   */
  EClass getOptionFeatureType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType#getBase()
   * @see #getOptionFeatureType()
   * @generated
   */
  EReference getOptionFeatureType_Base();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType <em>Some Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Feature Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType
   * @generated
   */
  EClass getSomeFeatureType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType#getBase()
   * @see #getSomeFeatureType()
   * @generated
   */
  EReference getSomeFeatureType_Base();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType#getMembers()
   * @see #getSomeFeatureType()
   * @generated
   */
  EReference getSomeFeatureType_Members();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneFeatureType <em>None Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>None Feature Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneFeatureType
   * @generated
   */
  EClass getNoneFeatureType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneFeatureType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneFeatureType#getBase()
   * @see #getNoneFeatureType()
   * @generated
   */
  EReference getNoneFeatureType_Base();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType <em>Either Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Either Feature Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType
   * @generated
   */
  EClass getEitherFeatureType();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType#getBases <em>Bases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bases</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType#getBases()
   * @see #getEitherFeatureType()
   * @generated
   */
  EReference getEitherFeatureType_Bases();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType#getChoice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Choice</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType#getChoice()
   * @see #getEitherFeatureType()
   * @generated
   */
  EAttribute getEitherFeatureType_Choice();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType#getMembers()
   * @see #getEitherFeatureType()
   * @generated
   */
  EReference getEitherFeatureType_Members();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint <em>Num Nat Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Nat Constraint</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint
   * @generated
   */
  EClass getNumNatConstraint();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint#getNum()
   * @see #getNumNatConstraint()
   * @generated
   */
  EAttribute getNumNatConstraint_Num();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint <em>Any Nat Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Nat Constraint</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint
   * @generated
   */
  EClass getAnyNatConstraint();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp
   * @generated
   */
  EClass getBinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp#getLeft()
   * @see #getBinaryExp()
   * @generated
   */
  EReference getBinaryExp_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp#getOp()
   * @see #getBinaryExp()
   * @generated
   */
  EAttribute getBinaryExp_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp#getRight()
   * @see #getBinaryExp()
   * @generated
   */
  EReference getBinaryExp_Right();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp
   * @generated
   */
  EClass getUnaryExp();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp#getOp()
   * @see #getUnaryExp()
   * @generated
   */
  EAttribute getUnaryExp_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp#getArg()
   * @see #getUnaryExp()
   * @generated
   */
  EReference getUnaryExp_Arg();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.PrimaryExp <em>Primary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.PrimaryExp
   * @generated
   */
  EClass getPrimaryExp();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.PrimaryExp#getPrimary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.PrimaryExp#getPrimary()
   * @see #getPrimaryExp()
   * @generated
   */
  EReference getPrimaryExp_Primary();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp <em>Access Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp
   * @generated
   */
  EClass getAccessExp();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp#getBase()
   * @see #getAccessExp()
   * @generated
   */
  EReference getAccessExp_Base();

  /**
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp#getName()
   * @see #getAccessExp()
   * @generated
   */
  EReference getAccessExp_Name();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp <em>Name Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp
   * @generated
   */
  EClass getNameExp();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp#getId()
   * @see #getNameExp()
   * @generated
   */
  EAttribute getNameExp_Id();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp <em>Literal Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp
   * @generated
   */
  EClass getLiteralExp();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lit</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp#getLit()
   * @see #getLiteralExp()
   * @generated
   */
  EReference getLiteralExp_Lit();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqType <em>Seq Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqType
   * @generated
   */
  EClass getSeqType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqType#getBase()
   * @see #getSeqType()
   * @generated
   */
  EReference getSeqType_Base();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType <em>Set Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType
   * @generated
   */
  EClass getSetType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType#getBase()
   * @see #getSetType()
   * @generated
   */
  EReference getSetType_Base();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType <em>Tuple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType
   * @generated
   */
  EClass getTupleType();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType#getElemTypes <em>Elem Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elem Types</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType#getElemTypes()
   * @see #getTupleType()
   * @generated
   */
  EReference getTupleType_ElemTypes();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType <em>Option Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType
   * @generated
   */
  EClass getOptionType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType#getBase()
   * @see #getOptionType()
   * @generated
   */
  EReference getOptionType_Base();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType <em>Some Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType
   * @generated
   */
  EClass getSomeType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType#getBase()
   * @see #getSomeType()
   * @generated
   */
  EReference getSomeType_Base();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType <em>None Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>None Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType
   * @generated
   */
  EClass getNoneType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType#getBase()
   * @see #getNoneType()
   * @generated
   */
  EReference getNoneType_Base();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral <em>None Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>None Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral
   * @generated
   */
  EClass getNoneLiteral();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral#getType()
   * @see #getNoneLiteral()
   * @generated
   */
  EReference getNoneLiteral_Type();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral <em>Some Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral
   * @generated
   */
  EClass getSomeLiteral();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lit</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral#getLit()
   * @see #getSomeLiteral()
   * @generated
   */
  EReference getSomeLiteral_Lit();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleNoneLiteral <em>Simple None Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple None Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleNoneLiteral
   * @generated
   */
  EClass getSimpleNoneLiteral();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral <em>Simple Some Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Some Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral
   * @generated
   */
  EClass getSimpleSomeLiteral();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lit</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral#getLit()
   * @see #getSimpleSomeLiteral()
   * @generated
   */
  EReference getSimpleSomeLiteral_Lit();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DeviceModelingLanguageFactory getDeviceModelingLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ModelImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLS = eINSTANCE.getModel_Decls();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeclImpl <em>Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getDecl()
     * @generated
     */
    EClass DECL = eINSTANCE.getDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECL__NAME = eINSTANCE.getDecl_Name();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeDeclImpl <em>Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getTypeDecl()
     * @generated
     */
    EClass TYPE_DECL = eINSTANCE.getTypeDecl();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentDeclImpl <em>Component Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getComponentDecl()
     * @generated
     */
    EClass COMPONENT_DECL = eINSTANCE.getComponentDecl();

    /**
     * The meta object literal for the '<em><b>Supers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECL__SUPERS = eINSTANCE.getComponentDecl_Supers();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECL__MEMBERS = eINSTANCE.getComponentDecl_Members();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECL__DEVICES = eINSTANCE.getComponentDecl_Devices();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECL__ASSIGNS = eINSTANCE.getComponentDecl_Assigns();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECL__EXP = eINSTANCE.getComponentDecl_Exp();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AssignmentImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__NAME = eINSTANCE.getAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__EXP = eINSTANCE.getAssignment_Exp();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MemberDeclImpl <em>Member Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MemberDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMemberDecl()
     * @generated
     */
    EClass MEMBER_DECL = eINSTANCE.getMemberDecl();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl <em>Attr Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAttrDecl()
     * @generated
     */
    EClass ATTR_DECL = eINSTANCE.getAttrDecl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_DECL__MODIFIER = eINSTANCE.getAttrDecl_Modifier();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_DECL__ATTRIBUTE_NAME = eINSTANCE.getAttrDecl_AttributeName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_DECL__TYPE = eINSTANCE.getAttrDecl_Type();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_DECL__LITERAL = eINSTANCE.getAttrDecl_Literal();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberDeclImpl <em>Sub Member Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubMemberDecl()
     * @generated
     */
    EClass SUB_MEMBER_DECL = eINSTANCE.getSubMemberDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_MEMBER_DECL__NAME = eINSTANCE.getSubMemberDecl_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_MEMBER_DECL__TYPE = eINSTANCE.getSubMemberDecl_Type();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_MEMBER_DECL__MEMBERS = eINSTANCE.getSubMemberDecl_Members();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureType()
     * @generated
     */
    EClass FEATURE_TYPE = eINSTANCE.getFeatureType();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BaseFeatureTypeImpl <em>Base Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BaseFeatureTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBaseFeatureType()
     * @generated
     */
    EClass BASE_FEATURE_TYPE = eINSTANCE.getBaseFeatureType();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_FEATURE_TYPE__COMPONENTS = eINSTANCE.getBaseFeatureType_Components();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_FEATURE_TYPE__MEMBERS = eINSTANCE.getBaseFeatureType_Members();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.InvariantDeclImpl <em>Invariant Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.InvariantDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getInvariantDecl()
     * @generated
     */
    EClass INVARIANT_DECL = eINSTANCE.getInvariantDecl();

    /**
     * The meta object literal for the '<em><b>Inv Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVARIANT_DECL__INV_NAME = eINSTANCE.getInvariantDecl_InvName();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantDeclImpl <em>Multiplicity Invariant Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMultiplicityInvariantDecl()
     * @generated
     */
    EClass MULTIPLICITY_INVARIANT_DECL = eINSTANCE.getMultiplicityInvariantDecl();

    /**
     * The meta object literal for the '<em><b>Lo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_INVARIANT_DECL__LO = eINSTANCE.getMultiplicityInvariantDecl_Lo();

    /**
     * The meta object literal for the '<em><b>Hi</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_INVARIANT_DECL__HI = eINSTANCE.getMultiplicityInvariantDecl_Hi();

    /**
     * The meta object literal for the '<em><b>Match</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_INVARIANT_DECL__MATCH = eINSTANCE.getMultiplicityInvariantDecl_Match();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_INVARIANT_DECL__TYPE = eINSTANCE.getMultiplicityInvariantDecl_Type();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GeneralInvariantDeclImpl <em>General Invariant Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GeneralInvariantDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getGeneralInvariantDecl()
     * @generated
     */
    EClass GENERAL_INVARIANT_DECL = eINSTANCE.getGeneralInvariantDecl();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_INVARIANT_DECL__EXP = eINSTANCE.getGeneralInvariantDecl_Exp();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberMatchImpl <em>Sub Member Match</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberMatchImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubMemberMatch()
     * @generated
     */
    EClass SUB_MEMBER_MATCH = eINSTANCE.getSubMemberMatch();

    /**
     * The meta object literal for the '<em><b>QNames</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_MEMBER_MATCH__QNAMES = eINSTANCE.getSubMemberMatch_QNames();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_MEMBER_MATCH__NAME = eINSTANCE.getSubMemberMatch_Name();

    /**
     * The meta object literal for the '<em><b>Any</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_MEMBER_MATCH__ANY = eINSTANCE.getSubMemberMatch_Any();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintNatImpl <em>Constraint Nat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintNatImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getConstraintNat()
     * @generated
     */
    EClass CONSTRAINT_NAT = eINSTANCE.getConstraintNat();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getDevice()
     * @generated
     */
    EClass DEVICE = eINSTANCE.getDevice();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__COMPONENTS = eINSTANCE.getDevice_Components();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__CONSTRAINT = eINSTANCE.getDevice_Constraint();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintExpImpl <em>Constraint Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintExpImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getConstraintExp()
     * @generated
     */
    EClass CONSTRAINT_EXP = eINSTANCE.getConstraintExp();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrOrSubMemberImpl <em>Attr Or Sub Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrOrSubMemberImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAttrOrSubMember()
     * @generated
     */
    EClass ATTR_OR_SUB_MEMBER = eINSTANCE.getAttrOrSubMember();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ExpImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryImpl <em>Primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getPrimary()
     * @generated
     */
    EClass PRIMARY = eINSTANCE.getPrimary();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BaseTypeImpl <em>Base Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BaseTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBaseType()
     * @generated
     */
    EClass BASE_TYPE = eINSTANCE.getBaseType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_TYPE__TYPE = eINSTANCE.getBaseType_Type();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicLiteralImpl <em>Basic Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBasicLiteral()
     * @generated
     */
    EClass BASIC_LITERAL = eINSTANCE.getBasicLiteral();

    /**
     * The meta object literal for the '<em><b>Type Cons</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_LITERAL__TYPE_CONS = eINSTANCE.getBasicLiteral_TypeCons();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_LITERAL__LIT = eINSTANCE.getBasicLiteral_Lit();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleLiteralImpl <em>Tuple Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getTupleLiteral()
     * @generated
     */
    EClass TUPLE_LITERAL = eINSTANCE.getTupleLiteral();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_LITERAL__ELEMS = eINSTANCE.getTupleLiteral_Elems();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqLiteralImpl <em>Seq Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSeqLiteral()
     * @generated
     */
    EClass SEQ_LITERAL = eINSTANCE.getSeqLiteral();

    /**
     * The meta object literal for the '<em><b>Basic Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_LITERAL__BASIC_TYPE = eINSTANCE.getSeqLiteral_BasicType();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_LITERAL__ELEMS = eINSTANCE.getSeqLiteral_Elems();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetLiteralImpl <em>Set Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSetLiteral()
     * @generated
     */
    EClass SET_LITERAL = eINSTANCE.getSetLiteral();

    /**
     * The meta object literal for the '<em><b>Basic Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_LITERAL__BASIC_TYPE = eINSTANCE.getSetLiteral_BasicType();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_LITERAL__ELEMS = eINSTANCE.getSetLiteral_Elems();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionLiteralImpl <em>Option Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOptionLiteral()
     * @generated
     */
    EClass OPTION_LITERAL = eINSTANCE.getOptionLiteral();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleLiteralImpl <em>Simple Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleLiteral()
     * @generated
     */
    EClass SIMPLE_LITERAL = eINSTANCE.getSimpleLiteral();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleBasicLiteralImpl <em>Simple Basic Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleBasicLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleBasicLiteral()
     * @generated
     */
    EClass SIMPLE_BASIC_LITERAL = eINSTANCE.getSimpleBasicLiteral();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_BASIC_LITERAL__LIT = eINSTANCE.getSimpleBasicLiteral_Lit();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleTupleLiteralImpl <em>Simple Tuple Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleTupleLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleTupleLiteral()
     * @generated
     */
    EClass SIMPLE_TUPLE_LITERAL = eINSTANCE.getSimpleTupleLiteral();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TUPLE_LITERAL__ELEMS = eINSTANCE.getSimpleTupleLiteral_Elems();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleOptionLiteralImpl <em>Simple Option Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleOptionLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleOptionLiteral()
     * @generated
     */
    EClass SIMPLE_OPTION_LITERAL = eINSTANCE.getSimpleOptionLiteral();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSeqLiteralImpl <em>Simple Seq Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSeqLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleSeqLiteral()
     * @generated
     */
    EClass SIMPLE_SEQ_LITERAL = eINSTANCE.getSimpleSeqLiteral();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SEQ_LITERAL__ELEMS = eINSTANCE.getSimpleSeqLiteral_Elems();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSetLiteralImpl <em>Simple Set Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSetLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleSetLiteral()
     * @generated
     */
    EClass SIMPLE_SET_LITERAL = eINSTANCE.getSimpleSetLiteral();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SET_LITERAL__ELEMS = eINSTANCE.getSimpleSetLiteral_Elems();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AppImpl <em>App</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AppImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getApp()
     * @generated
     */
    EClass APP = eINSTANCE.getApp();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionFeatureTypeImpl <em>Option Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionFeatureTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOptionFeatureType()
     * @generated
     */
    EClass OPTION_FEATURE_TYPE = eINSTANCE.getOptionFeatureType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION_FEATURE_TYPE__BASE = eINSTANCE.getOptionFeatureType_Base();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeFeatureTypeImpl <em>Some Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeFeatureTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSomeFeatureType()
     * @generated
     */
    EClass SOME_FEATURE_TYPE = eINSTANCE.getSomeFeatureType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOME_FEATURE_TYPE__BASE = eINSTANCE.getSomeFeatureType_Base();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOME_FEATURE_TYPE__MEMBERS = eINSTANCE.getSomeFeatureType_Members();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneFeatureTypeImpl <em>None Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneFeatureTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNoneFeatureType()
     * @generated
     */
    EClass NONE_FEATURE_TYPE = eINSTANCE.getNoneFeatureType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NONE_FEATURE_TYPE__BASE = eINSTANCE.getNoneFeatureType_Base();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl <em>Either Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getEitherFeatureType()
     * @generated
     */
    EClass EITHER_FEATURE_TYPE = eINSTANCE.getEitherFeatureType();

    /**
     * The meta object literal for the '<em><b>Bases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EITHER_FEATURE_TYPE__BASES = eINSTANCE.getEitherFeatureType_Bases();

    /**
     * The meta object literal for the '<em><b>Choice</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EITHER_FEATURE_TYPE__CHOICE = eINSTANCE.getEitherFeatureType_Choice();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EITHER_FEATURE_TYPE__MEMBERS = eINSTANCE.getEitherFeatureType_Members();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NumNatConstraintImpl <em>Num Nat Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NumNatConstraintImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNumNatConstraint()
     * @generated
     */
    EClass NUM_NAT_CONSTRAINT = eINSTANCE.getNumNatConstraint();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUM_NAT_CONSTRAINT__NUM = eINSTANCE.getNumNatConstraint_Num();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AnyNatConstraintImpl <em>Any Nat Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AnyNatConstraintImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAnyNatConstraint()
     * @generated
     */
    EClass ANY_NAT_CONSTRAINT = eINSTANCE.getAnyNatConstraint();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BinaryExpImpl <em>Binary Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BinaryExpImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBinaryExp()
     * @generated
     */
    EClass BINARY_EXP = eINSTANCE.getBinaryExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXP__LEFT = eINSTANCE.getBinaryExp_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXP__OP = eINSTANCE.getBinaryExp_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXP__RIGHT = eINSTANCE.getBinaryExp_Right();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.UnaryExpImpl <em>Unary Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.UnaryExpImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getUnaryExp()
     * @generated
     */
    EClass UNARY_EXP = eINSTANCE.getUnaryExp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXP__OP = eINSTANCE.getUnaryExp_Op();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXP__ARG = eINSTANCE.getUnaryExp_Arg();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryExpImpl <em>Primary Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryExpImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getPrimaryExp()
     * @generated
     */
    EClass PRIMARY_EXP = eINSTANCE.getPrimaryExp();

    /**
     * The meta object literal for the '<em><b>Primary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXP__PRIMARY = eINSTANCE.getPrimaryExp_Primary();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AccessExpImpl <em>Access Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AccessExpImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAccessExp()
     * @generated
     */
    EClass ACCESS_EXP = eINSTANCE.getAccessExp();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_EXP__BASE = eINSTANCE.getAccessExp_Base();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_EXP__NAME = eINSTANCE.getAccessExp_Name();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NameExpImpl <em>Name Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NameExpImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNameExp()
     * @generated
     */
    EClass NAME_EXP = eINSTANCE.getNameExp();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_EXP__ID = eINSTANCE.getNameExp_Id();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralExpImpl <em>Literal Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralExpImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getLiteralExp()
     * @generated
     */
    EClass LITERAL_EXP = eINSTANCE.getLiteralExp();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_EXP__LIT = eINSTANCE.getLiteralExp_Lit();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqTypeImpl <em>Seq Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSeqType()
     * @generated
     */
    EClass SEQ_TYPE = eINSTANCE.getSeqType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_TYPE__BASE = eINSTANCE.getSeqType_Base();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetTypeImpl <em>Set Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSetType()
     * @generated
     */
    EClass SET_TYPE = eINSTANCE.getSetType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_TYPE__BASE = eINSTANCE.getSetType_Base();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getTupleType()
     * @generated
     */
    EClass TUPLE_TYPE = eINSTANCE.getTupleType();

    /**
     * The meta object literal for the '<em><b>Elem Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_TYPE__ELEM_TYPES = eINSTANCE.getTupleType_ElemTypes();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionTypeImpl <em>Option Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOptionType()
     * @generated
     */
    EClass OPTION_TYPE = eINSTANCE.getOptionType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION_TYPE__BASE = eINSTANCE.getOptionType_Base();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeTypeImpl <em>Some Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSomeType()
     * @generated
     */
    EClass SOME_TYPE = eINSTANCE.getSomeType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOME_TYPE__BASE = eINSTANCE.getSomeType_Base();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneTypeImpl <em>None Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNoneType()
     * @generated
     */
    EClass NONE_TYPE = eINSTANCE.getNoneType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NONE_TYPE__BASE = eINSTANCE.getNoneType_Base();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneLiteralImpl <em>None Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNoneLiteral()
     * @generated
     */
    EClass NONE_LITERAL = eINSTANCE.getNoneLiteral();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NONE_LITERAL__TYPE = eINSTANCE.getNoneLiteral_Type();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeLiteralImpl <em>Some Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSomeLiteral()
     * @generated
     */
    EClass SOME_LITERAL = eINSTANCE.getSomeLiteral();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOME_LITERAL__LIT = eINSTANCE.getSomeLiteral_Lit();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleNoneLiteralImpl <em>Simple None Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleNoneLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleNoneLiteral()
     * @generated
     */
    EClass SIMPLE_NONE_LITERAL = eINSTANCE.getSimpleNoneLiteral();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSomeLiteralImpl <em>Simple Some Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSomeLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleSomeLiteral()
     * @generated
     */
    EClass SIMPLE_SOME_LITERAL = eINSTANCE.getSimpleSomeLiteral();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SOME_LITERAL__LIT = eINSTANCE.getSimpleSomeLiteral_Lit();

  }

} //DeviceModelingLanguagePackage
