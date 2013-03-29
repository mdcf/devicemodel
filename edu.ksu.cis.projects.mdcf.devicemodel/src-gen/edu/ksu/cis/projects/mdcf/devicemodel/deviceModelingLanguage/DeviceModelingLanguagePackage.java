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
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SCHEMA = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLASS = 1;

  /**
   * The feature id for the '<em><b>Product</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PRODUCT = 2;

  /**
   * The feature id for the '<em><b>Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__SUPERS = DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl <em>Feature Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureDecl()
   * @generated
   */
  int FEATURE_DECL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__SUPERS = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__MEMBERS = DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__DEVICES = DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__ASSIGNS = DECL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__EXP = DECL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Feature Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MemberDeclImpl <em>Member Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MemberDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMemberDecl()
   * @generated
   */
  int MEMBER_DECL = 4;

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
  int ATTR_DECL = 5;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ModifierImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 6;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 0;

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
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_DECL__MODIFIER = MEMBER_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_DECL__NAME = MEMBER_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_DECL__TYPE = MEMBER_DECL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sub Member Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MEMBER_DECL_FEATURE_COUNT = MEMBER_DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MModifierImpl <em>MModifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MModifierImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMModifier()
   * @generated
   */
  int MMODIFIER = 8;

  /**
   * The number of structural features of the '<em>MModifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMODIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AssignmentImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 9;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ReportImpl <em>Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ReportImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getReport()
   * @generated
   */
  int REPORT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__ARGS = 1;

  /**
   * The number of structural features of the '<em>Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureType()
   * @generated
   */
  int FEATURE_TYPE = 11;

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
  int BASE_FEATURE_TYPE = 12;

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
  int INVARIANT_DECL = 13;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantImpl <em>Multiplicity Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMultiplicityInvariant()
   * @generated
   */
  int MULTIPLICITY_INVARIANT = 14;

  /**
   * The feature id for the '<em><b>Inv Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT__INV_NAME = INVARIANT_DECL__INV_NAME;

  /**
   * The feature id for the '<em><b>Lo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT__LO = INVARIANT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT__HI = INVARIANT_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT__MATCH = INVARIANT_DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT__TYPE = INVARIANT_DECL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Multiplicity Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_FEATURE_COUNT = INVARIANT_DECL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GeneralInvariantImpl <em>General Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GeneralInvariantImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getGeneralInvariant()
   * @generated
   */
  int GENERAL_INVARIANT = 15;

  /**
   * The feature id for the '<em><b>Inv Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INVARIANT__INV_NAME = INVARIANT_DECL__INV_NAME;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INVARIANT__EXP = INVARIANT_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>General Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INVARIANT_FEATURE_COUNT = INVARIANT_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberMatchImpl <em>Sub Member Match</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberMatchImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubMemberMatch()
   * @generated
   */
  int SUB_MEMBER_MATCH = 16;

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
  int CONSTRAINT_NAT = 17;

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
  int DEVICE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__NAME = FEATURE_DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__SUPERS = FEATURE_DECL__SUPERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__MEMBERS = FEATURE_DECL__MEMBERS;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICES = FEATURE_DECL__DEVICES;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__ASSIGNS = FEATURE_DECL__ASSIGNS;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__EXP = FEATURE_DECL__EXP;

  /**
   * The feature id for the '<em><b>Components</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__COMPONENTS = FEATURE_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__CONSTRAINT = FEATURE_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = FEATURE_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintExpImpl <em>Constraint Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getConstraintExp()
   * @generated
   */
  int CONSTRAINT_EXP = 19;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXP__COND = 0;

  /**
   * The number of structural features of the '<em>Constraint Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ParamImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getParam()
   * @generated
   */
  int PARAM = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__TYPE = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ReportMemberDeclImpl <em>Report Member Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ReportMemberDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getReportMemberDecl()
   * @generated
   */
  int REPORT_MEMBER_DECL = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_MEMBER_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Binding Name</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_MEMBER_DECL__BINDING_NAME = 1;

  /**
   * The number of structural features of the '<em>Report Member Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_MEMBER_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AccessorImpl <em>Accessor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AccessorImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAccessor()
   * @generated
   */
  int ACCESSOR = 22;

  /**
   * The number of structural features of the '<em>Accessor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ExpImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getExp()
   * @generated
   */
  int EXP = 23;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryImpl <em>Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.PrimaryImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getPrimary()
   * @generated
   */
  int PRIMARY = 24;

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
  int TYPE = 25;

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
  int BASE_TYPE = 26;

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
  int LITERAL = 27;

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
  int BASIC_LITERAL = 28;

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
  int TUPLE_LITERAL = 29;

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
  int SEQ_LITERAL = 30;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_LITERAL__ELEMENT_TYPE = LITERAL_FEATURE_COUNT + 0;

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
  int SET_LITERAL = 31;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL__ELEMENT_TYPE = LITERAL_FEATURE_COUNT + 0;

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
  int OPTION_LITERAL = 32;

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
  int SIMPLE_LITERAL = 33;

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
  int SIMPLE_BASIC_LITERAL = 34;

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
  int SIMPLE_TUPLE_LITERAL = 35;

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
  int SIMPLE_OPTION_LITERAL = 36;

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
  int SIMPLE_SEQ_LITERAL = 37;

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
  int SIMPLE_SET_LITERAL = 38;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = FEATURE_DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__SUPERS = FEATURE_DECL__SUPERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MEMBERS = FEATURE_DECL__MEMBERS;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__DEVICES = FEATURE_DECL__DEVICES;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__ASSIGNS = FEATURE_DECL__ASSIGNS;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__EXP = FEATURE_DECL__EXP;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__SCHEMA = FEATURE_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__CLASS = FEATURE_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Product</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__PRODUCT = FEATURE_DECL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = FEATURE_DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DataImpl <em>Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DataImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getData()
   * @generated
   */
  int DATA = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__NAME = FEATURE_DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__SUPERS = FEATURE_DECL__SUPERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__MEMBERS = FEATURE_DECL__MEMBERS;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__DEVICES = FEATURE_DECL__DEVICES;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__ASSIGNS = FEATURE_DECL__ASSIGNS;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__EXP = FEATURE_DECL__EXP;

  /**
   * The number of structural features of the '<em>Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FEATURE_COUNT = FEATURE_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AppImpl <em>App</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AppImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getApp()
   * @generated
   */
  int APP = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__NAME = FEATURE_DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__SUPERS = FEATURE_DECL__SUPERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__MEMBERS = FEATURE_DECL__MEMBERS;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__DEVICES = FEATURE_DECL__DEVICES;

  /**
   * The feature id for the '<em><b>Assigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__ASSIGNS = FEATURE_DECL__ASSIGNS;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP__EXP = FEATURE_DECL__EXP;

  /**
   * The number of structural features of the '<em>App</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_FEATURE_COUNT = FEATURE_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstImpl <em>Const</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getConst()
   * @generated
   */
  int CONST = 42;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__SCHEMA = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__CLASS = MODIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Product</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__PRODUCT = MODIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__INSTANCE = MODIFIER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Const</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ValImpl <em>Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ValImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getVal()
   * @generated
   */
  int VAL = 43;

  /**
   * The number of structural features of the '<em>Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.VarImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getVar()
   * @generated
   */
  int VAR = 44;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OverrideImpl <em>Override</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OverrideImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOverride()
   * @generated
   */
  int OVERRIDE = 45;

  /**
   * The number of structural features of the '<em>Override</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionFeatureTypeImpl <em>Option Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOptionFeatureType()
   * @generated
   */
  int OPTION_FEATURE_TYPE = 46;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_TYPE__BASE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_TYPE__NONE = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Option Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeFeatureTypeImpl <em>Some Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SomeFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSomeFeatureType()
   * @generated
   */
  int SOME_FEATURE_TYPE = 47;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl <em>Either Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getEitherFeatureType()
   * @generated
   */
  int EITHER_FEATURE_TYPE = 48;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqFeatureTypeImpl <em>Seq Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSeqFeatureType()
   * @generated
   */
  int SEQ_FEATURE_TYPE = 49;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_FEATURE_TYPE__BASE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_FEATURE_TYPE__ELEMENTS = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Seq Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_FEATURE_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetFeatureTypeImpl <em>Set Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetFeatureTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSetFeatureType()
   * @generated
   */
  int SET_FEATURE_TYPE = 50;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_TYPE__BASE = FEATURE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_TYPE__ELEMENTS = FEATURE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NumNatConstraintImpl <em>Num Nat Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NumNatConstraintImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNumNatConstraint()
   * @generated
   */
  int NUM_NAT_CONSTRAINT = 51;

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
  int ANY_NAT_CONSTRAINT = 52;

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
  int BINARY_EXP = 53;

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
  int UNARY_EXP = 54;

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
  int PRIMARY_EXP = 55;

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
  int ACCESS_EXP = 56;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXP__BASE = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Accessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_EXP__ACCESSOR = EXP_FEATURE_COUNT + 1;

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
  int NAME_EXP = 57;

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
  int LITERAL_EXP = 58;

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
  int SEQ_TYPE = 59;

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
  int SET_TYPE = 60;

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
  int TUPLE_TYPE = 61;

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
  int OPTION_TYPE = 62;

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
  int SOME_TYPE = 63;

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
  int NONE_TYPE = 64;

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
  int NONE_LITERAL = 65;

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
  int SOME_LITERAL = 66;

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
  int SIMPLE_NONE_LITERAL = 67;

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
  int SIMPLE_SOME_LITERAL = 68;

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
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model#isSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model#isSchema()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Schema();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model#isClass <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model#isClass()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Class();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model#isProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Product</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model#isProduct()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Product();

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
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl#getSupers <em>Supers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Supers</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl#getSupers()
   * @see #getTypeDecl()
   * @generated
   */
  EReference getTypeDecl_Supers();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl <em>Feature Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl
   * @generated
   */
  EClass getFeatureDecl();

  /**
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getSupers <em>Supers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Supers</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getSupers()
   * @see #getFeatureDecl()
   * @generated
   */
  EReference getFeatureDecl_Supers();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getMembers()
   * @see #getFeatureDecl()
   * @generated
   */
  EReference getFeatureDecl_Members();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getDevices()
   * @see #getFeatureDecl()
   * @generated
   */
  EReference getFeatureDecl_Devices();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getAssigns <em>Assigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigns</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getAssigns()
   * @see #getFeatureDecl()
   * @generated
   */
  EReference getFeatureDecl_Assigns();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl#getExp()
   * @see #getFeatureDecl()
   * @generated
   */
  EReference getFeatureDecl_Exp();

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
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl#getModifier()
   * @see #getAttrDecl()
   * @generated
   */
  EReference getAttrDecl_Modifier();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Modifier
   * @generated
   */
  EClass getModifier();

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
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl#getModifier()
   * @see #getSubMemberDecl()
   * @generated
   */
  EReference getSubMemberDecl_Modifier();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MModifier <em>MModifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MModifier</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MModifier
   * @generated
   */
  EClass getMModifier();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report
   * @generated
   */
  EClass getReport();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report#getName()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report#getArgs()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Args();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant <em>Multiplicity Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity Invariant</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant
   * @generated
   */
  EClass getMultiplicityInvariant();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant#getLo <em>Lo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lo</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant#getLo()
   * @see #getMultiplicityInvariant()
   * @generated
   */
  EReference getMultiplicityInvariant_Lo();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant#getHi <em>Hi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hi</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant#getHi()
   * @see #getMultiplicityInvariant()
   * @generated
   */
  EReference getMultiplicityInvariant_Hi();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant#getMatch <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Match</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant#getMatch()
   * @see #getMultiplicityInvariant()
   * @generated
   */
  EReference getMultiplicityInvariant_Match();

  /**
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant#getType()
   * @see #getMultiplicityInvariant()
   * @generated
   */
  EReference getMultiplicityInvariant_Type();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariant <em>General Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Invariant</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariant
   * @generated
   */
  EClass getGeneralInvariant();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariant#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariant#getExp()
   * @see #getGeneralInvariant()
   * @generated
   */
  EReference getGeneralInvariant_Exp();

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
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp#getCond()
   * @see #getConstraintExp()
   * @generated
   */
  EReference getConstraintExp_Cond();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param#getType()
   * @see #getParam()
   * @generated
   */
  EReference getParam_Type();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl <em>Report Member Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report Member Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl
   * @generated
   */
  EClass getReportMemberDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl#getName()
   * @see #getReportMemberDecl()
   * @generated
   */
  EAttribute getReportMemberDecl_Name();

  /**
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl#getBindingName <em>Binding Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Binding Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl#getBindingName()
   * @see #getReportMemberDecl()
   * @generated
   */
  EReference getReportMemberDecl_BindingName();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Accessor <em>Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accessor</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Accessor
   * @generated
   */
  EClass getAccessor();

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
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral#getElementType()
   * @see #getSeqLiteral()
   * @generated
   */
  EReference getSeqLiteral_ElementType();

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
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral#getElementType()
   * @see #getSetLiteral()
   * @generated
   */
  EReference getSetLiteral_ElementType();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Feature#isSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Feature#isSchema()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Schema();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Feature#isClass <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Feature#isClass()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Class();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Feature#isProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Product</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Feature#isProduct()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Product();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Data
   * @generated
   */
  EClass getData();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const
   * @generated
   */
  EClass getConst();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const#isSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const#isSchema()
   * @see #getConst()
   * @generated
   */
  EAttribute getConst_Schema();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const#isClass <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const#isClass()
   * @see #getConst()
   * @generated
   */
  EAttribute getConst_Class();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const#isProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Product</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const#isProduct()
   * @see #getConst()
   * @generated
   */
  EAttribute getConst_Product();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const#isInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const#isInstance()
   * @see #getConst()
   * @generated
   */
  EAttribute getConst_Instance();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Val <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Val</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Val
   * @generated
   */
  EClass getVal();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Override <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Override</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Override
   * @generated
   */
  EClass getOverride();

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
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType#isNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType#isNone()
   * @see #getOptionFeatureType()
   * @generated
   */
  EAttribute getOptionFeatureType_None();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType <em>Seq Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Feature Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType
   * @generated
   */
  EClass getSeqFeatureType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType#getBase()
   * @see #getSeqFeatureType()
   * @generated
   */
  EReference getSeqFeatureType_Base();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType#getElements()
   * @see #getSeqFeatureType()
   * @generated
   */
  EReference getSeqFeatureType_Elements();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType <em>Set Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Feature Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType
   * @generated
   */
  EClass getSetFeatureType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType#getBase()
   * @see #getSetFeatureType()
   * @generated
   */
  EReference getSetFeatureType_Base();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType#getElements()
   * @see #getSetFeatureType()
   * @generated
   */
  EReference getSetFeatureType_Elements();

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
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp#getAccessor <em>Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Accessor</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp#getAccessor()
   * @see #getAccessExp()
   * @generated
   */
  EReference getAccessExp_Accessor();

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
     * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__SCHEMA = eINSTANCE.getModel_Schema();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__CLASS = eINSTANCE.getModel_Class();

    /**
     * The meta object literal for the '<em><b>Product</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__PRODUCT = eINSTANCE.getModel_Product();

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
     * The meta object literal for the '<em><b>Supers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__SUPERS = eINSTANCE.getTypeDecl_Supers();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl <em>Feature Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureDecl()
     * @generated
     */
    EClass FEATURE_DECL = eINSTANCE.getFeatureDecl();

    /**
     * The meta object literal for the '<em><b>Supers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL__SUPERS = eINSTANCE.getFeatureDecl_Supers();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL__MEMBERS = eINSTANCE.getFeatureDecl_Members();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL__DEVICES = eINSTANCE.getFeatureDecl_Devices();

    /**
     * The meta object literal for the '<em><b>Assigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL__ASSIGNS = eINSTANCE.getFeatureDecl_Assigns();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL__EXP = eINSTANCE.getFeatureDecl_Exp();

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
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_DECL__MODIFIER = eINSTANCE.getAttrDecl_Modifier();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ModifierImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

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
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_MEMBER_DECL__MODIFIER = eINSTANCE.getSubMemberDecl_Modifier();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MModifierImpl <em>MModifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MModifierImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMModifier()
     * @generated
     */
    EClass MMODIFIER = eINSTANCE.getMModifier();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ReportImpl <em>Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ReportImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getReport()
     * @generated
     */
    EClass REPORT = eINSTANCE.getReport();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__NAME = eINSTANCE.getReport_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPORT__ARGS = eINSTANCE.getReport_Args();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantImpl <em>Multiplicity Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMultiplicityInvariant()
     * @generated
     */
    EClass MULTIPLICITY_INVARIANT = eINSTANCE.getMultiplicityInvariant();

    /**
     * The meta object literal for the '<em><b>Lo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_INVARIANT__LO = eINSTANCE.getMultiplicityInvariant_Lo();

    /**
     * The meta object literal for the '<em><b>Hi</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_INVARIANT__HI = eINSTANCE.getMultiplicityInvariant_Hi();

    /**
     * The meta object literal for the '<em><b>Match</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_INVARIANT__MATCH = eINSTANCE.getMultiplicityInvariant_Match();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_INVARIANT__TYPE = eINSTANCE.getMultiplicityInvariant_Type();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GeneralInvariantImpl <em>General Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GeneralInvariantImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getGeneralInvariant()
     * @generated
     */
    EClass GENERAL_INVARIANT = eINSTANCE.getGeneralInvariant();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_INVARIANT__EXP = eINSTANCE.getGeneralInvariant_Exp();

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
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXP__COND = eINSTANCE.getConstraintExp_Cond();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ParamImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__TYPE = eINSTANCE.getParam_Type();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ReportMemberDeclImpl <em>Report Member Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ReportMemberDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getReportMemberDecl()
     * @generated
     */
    EClass REPORT_MEMBER_DECL = eINSTANCE.getReportMemberDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT_MEMBER_DECL__NAME = eINSTANCE.getReportMemberDecl_Name();

    /**
     * The meta object literal for the '<em><b>Binding Name</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPORT_MEMBER_DECL__BINDING_NAME = eINSTANCE.getReportMemberDecl_BindingName();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AccessorImpl <em>Accessor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AccessorImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAccessor()
     * @generated
     */
    EClass ACCESSOR = eINSTANCE.getAccessor();

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
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_LITERAL__ELEMENT_TYPE = eINSTANCE.getSeqLiteral_ElementType();

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
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_LITERAL__ELEMENT_TYPE = eINSTANCE.getSetLiteral_ElementType();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__SCHEMA = eINSTANCE.getFeature_Schema();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__CLASS = eINSTANCE.getFeature_Class();

    /**
     * The meta object literal for the '<em><b>Product</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__PRODUCT = eINSTANCE.getFeature_Product();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DataImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getData()
     * @generated
     */
    EClass DATA = eINSTANCE.getData();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstImpl <em>Const</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getConst()
     * @generated
     */
    EClass CONST = eINSTANCE.getConst();

    /**
     * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST__SCHEMA = eINSTANCE.getConst_Schema();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST__CLASS = eINSTANCE.getConst_Class();

    /**
     * The meta object literal for the '<em><b>Product</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST__PRODUCT = eINSTANCE.getConst_Product();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST__INSTANCE = eINSTANCE.getConst_Instance();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ValImpl <em>Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ValImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getVal()
     * @generated
     */
    EClass VAL = eINSTANCE.getVal();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.VarImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OverrideImpl <em>Override</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OverrideImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOverride()
     * @generated
     */
    EClass OVERRIDE = eINSTANCE.getOverride();

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
     * The meta object literal for the '<em><b>None</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION_FEATURE_TYPE__NONE = eINSTANCE.getOptionFeatureType_None();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqFeatureTypeImpl <em>Seq Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqFeatureTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSeqFeatureType()
     * @generated
     */
    EClass SEQ_FEATURE_TYPE = eINSTANCE.getSeqFeatureType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_FEATURE_TYPE__BASE = eINSTANCE.getSeqFeatureType_Base();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_FEATURE_TYPE__ELEMENTS = eINSTANCE.getSeqFeatureType_Elements();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetFeatureTypeImpl <em>Set Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetFeatureTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSetFeatureType()
     * @generated
     */
    EClass SET_FEATURE_TYPE = eINSTANCE.getSetFeatureType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_FEATURE_TYPE__BASE = eINSTANCE.getSetFeatureType_Base();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_FEATURE_TYPE__ELEMENTS = eINSTANCE.getSetFeatureType_Elements();

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
     * The meta object literal for the '<em><b>Accessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_EXP__ACCESSOR = eINSTANCE.getAccessExp_Accessor();

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
