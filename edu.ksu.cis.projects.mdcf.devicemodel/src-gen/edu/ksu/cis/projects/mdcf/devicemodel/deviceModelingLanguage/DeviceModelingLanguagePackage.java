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
  String eNS_URI = "http://mdcf.projects.cis.ksu.edu/devicemodel/DeviceModelingLanguage";

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
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__SUPERS = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elems</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__ELEMS = DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeaturesDeclImpl <em>Features Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeaturesDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeaturesDecl()
   * @generated
   */
  int FEATURES_DECL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_DECL__COMPLETE = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_DECL__SUPERS = DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_DECL__BODY = DECL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Features Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeaturesBodyImpl <em>Features Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeaturesBodyImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeaturesBody()
   * @generated
   */
  int FEATURES_BODY = 4;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_BODY__FEATURES = 0;

  /**
   * The number of structural features of the '<em>Features Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl <em>Feature Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureDecl()
   * @generated
   */
  int FEATURE_DECL = 5;

  /**
   * The number of structural features of the '<em>Feature Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesDeclImpl <em>Sub Features Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubFeaturesDecl()
   * @generated
   */
  int SUB_FEATURES_DECL = 6;

  /**
   * The feature id for the '<em><b>Category Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_DECL__CATEGORY_NAMES = FEATURE_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_DECL__NAME = FEATURE_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_DECL__TYPE = FEATURE_DECL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sub Features Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_DECL_FEATURE_COUNT = FEATURE_DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesTypeImpl <em>Sub Features Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubFeaturesType()
   * @generated
   */
  int SUB_FEATURES_TYPE = 7;

  /**
   * The number of structural features of the '<em>Sub Features Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.InvariantDeclImpl <em>Invariant Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.InvariantDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getInvariantDecl()
   * @generated
   */
  int INVARIANT_DECL = 8;

  /**
   * The number of structural features of the '<em>Invariant Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_DECL_FEATURE_COUNT = FEATURE_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantDeclImpl <em>Multiplicity Invariant Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMultiplicityInvariantDecl()
   * @generated
   */
  int MULTIPLICITY_INVARIANT_DECL = 9;

  /**
   * The feature id for the '<em><b>Inv Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__INV_NAME = INVARIANT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__LO = INVARIANT_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__HI = INVARIANT_DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__MATCH = INVARIANT_DECL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL__TYPE = INVARIANT_DECL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Multiplicity Invariant Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INVARIANT_DECL_FEATURE_COUNT = INVARIANT_DECL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesMatchImpl <em>Sub Features Match</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesMatchImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubFeaturesMatch()
   * @generated
   */
  int SUB_FEATURES_MATCH = 10;

  /**
   * The feature id for the '<em><b>Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_MATCH__DISTINCT = 0;

  /**
   * The feature id for the '<em><b>Category Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_MATCH__CATEGORY_NAMES = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_MATCH__NAME = 2;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_MATCH__ANY = 3;

  /**
   * The number of structural features of the '<em>Sub Features Match</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURES_MATCH_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintNatImpl <em>Constraint Nat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstraintNatImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getConstraintNat()
   * @generated
   */
  int CONSTRAINT_NAT = 11;

  /**
   * The number of structural features of the '<em>Constraint Nat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_NAT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl <em>Attr Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getAttrDecl()
   * @generated
   */
  int ATTR_DECL = 12;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL__MODIFIER = FEATURE_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL__ATTRIBUTE_NAME = FEATURE_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL__TYPE = FEATURE_DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL__LITERAL = FEATURE_DECL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Attr Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DECL_FEATURE_COUNT = FEATURE_DECL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 13;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 14;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__BASE_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 15;

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
  int BASIC_LITERAL = 16;

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
  int TUPLE_LITERAL = 17;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListLiteralImpl <em>List Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getListLiteral()
   * @generated
   */
  int LIST_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Basic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__BASIC_TYPE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__ELEMS = LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetLiteralImpl <em>Set Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSetLiteral()
   * @generated
   */
  int SET_LITERAL = 19;

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
  int OPTION_LITERAL = 20;

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
  int SIMPLE_LITERAL = 21;

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
  int SIMPLE_BASIC_LITERAL = 22;

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
  int SIMPLE_TUPLE_LITERAL = 23;

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
  int SIMPLE_OPTION_LITERAL = 24;

  /**
   * The number of structural features of the '<em>Simple Option Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OPTION_LITERAL_FEATURE_COUNT = SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleListLiteralImpl <em>Simple List Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleListLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleListLiteral()
   * @generated
   */
  int SIMPLE_LIST_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_LIST_LITERAL__ELEMS = SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple List Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_LIST_LITERAL_FEATURE_COUNT = SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSetLiteralImpl <em>Simple Set Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleSetLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleSetLiteral()
   * @generated
   */
  int SIMPLE_SET_LITERAL = 26;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeRefImpl <em>Sub Group Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeRefImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupTypeRef()
   * @generated
   */
  int SUB_GROUP_TYPE_REF = 27;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_REF__TYPE = SUB_FEATURES_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub Group Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_REF_FEATURE_COUNT = SUB_FEATURES_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeAnonImpl <em>Sub Group Type Anon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeAnonImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupTypeAnon()
   * @generated
   */
  int SUB_GROUP_TYPE_ANON = 28;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_ANON__SUPERS = SUB_FEATURES_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_ANON__BODY = SUB_FEATURES_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Group Type Anon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_ANON_FEATURE_COUNT = SUB_FEATURES_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NumNatConstraintImpl <em>Num Nat Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NumNatConstraintImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNumNatConstraint()
   * @generated
   */
  int NUM_NAT_CONSTRAINT = 29;

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
  int ANY_NAT_CONSTRAINT = 30;

  /**
   * The number of structural features of the '<em>Any Nat Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_NAT_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_NAT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListTypeImpl <em>List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getListType()
   * @generated
   */
  int LIST_TYPE = 31;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__BASE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetTypeImpl <em>Set Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SetTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSetType()
   * @generated
   */
  int SET_TYPE = 32;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionTypeImpl <em>Option Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.OptionTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getOptionType()
   * @generated
   */
  int OPTION_TYPE = 33;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_TYPE__BASE_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_TYPE__BASE = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Option Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TupleTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getTupleType()
   * @generated
   */
  int TUPLE_TYPE = 34;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE__BASE_TYPE = BASIC_TYPE__BASE_TYPE;

  /**
   * The feature id for the '<em><b>Elem Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE__ELEM_TYPES = BASIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_FEATURE_COUNT = BASIC_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneLiteralImpl <em>None Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.NoneLiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getNoneLiteral()
   * @generated
   */
  int NONE_LITERAL = 35;

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
  int SOME_LITERAL = 36;

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
  int SIMPLE_NONE_LITERAL = 37;

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
  int SIMPLE_SOME_LITERAL = 38;

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
   * Returns the meta object for the attribute list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl#getElems()
   * @see #getTypeDecl()
   * @generated
   */
  EAttribute getTypeDecl_Elems();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesDecl <em>Features Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Features Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesDecl
   * @generated
   */
  EClass getFeaturesDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesDecl#getComplete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Complete</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesDecl#getComplete()
   * @see #getFeaturesDecl()
   * @generated
   */
  EAttribute getFeaturesDecl_Complete();

  /**
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesDecl#getSupers <em>Supers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Supers</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesDecl#getSupers()
   * @see #getFeaturesDecl()
   * @generated
   */
  EReference getFeaturesDecl_Supers();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesDecl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesDecl#getBody()
   * @see #getFeaturesDecl()
   * @generated
   */
  EReference getFeaturesDecl_Body();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesBody <em>Features Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Features Body</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesBody
   * @generated
   */
  EClass getFeaturesBody();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesBody#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeaturesBody#getFeatures()
   * @see #getFeaturesBody()
   * @generated
   */
  EReference getFeaturesBody_Features();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesDecl <em>Sub Features Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Features Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesDecl
   * @generated
   */
  EClass getSubFeaturesDecl();

  /**
   * Returns the meta object for the attribute list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesDecl#getCategoryNames <em>Category Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Category Names</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesDecl#getCategoryNames()
   * @see #getSubFeaturesDecl()
   * @generated
   */
  EAttribute getSubFeaturesDecl_CategoryNames();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesDecl#getName()
   * @see #getSubFeaturesDecl()
   * @generated
   */
  EAttribute getSubFeaturesDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesDecl#getType()
   * @see #getSubFeaturesDecl()
   * @generated
   */
  EReference getSubFeaturesDecl_Type();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesType <em>Sub Features Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Features Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesType
   * @generated
   */
  EClass getSubFeaturesType();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl <em>Multiplicity Invariant Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity Invariant Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl
   * @generated
   */
  EClass getMultiplicityInvariantDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getInvName <em>Inv Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inv Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl#getInvName()
   * @see #getMultiplicityInvariantDecl()
   * @generated
   */
  EAttribute getMultiplicityInvariantDecl_InvName();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch <em>Sub Features Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Features Match</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch
   * @generated
   */
  EClass getSubFeaturesMatch();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch#getDistinct <em>Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distinct</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch#getDistinct()
   * @see #getSubFeaturesMatch()
   * @generated
   */
  EAttribute getSubFeaturesMatch_Distinct();

  /**
   * Returns the meta object for the attribute list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch#getCategoryNames <em>Category Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Category Names</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch#getCategoryNames()
   * @see #getSubFeaturesMatch()
   * @generated
   */
  EAttribute getSubFeaturesMatch_CategoryNames();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch#getName()
   * @see #getSubFeaturesMatch()
   * @generated
   */
  EAttribute getSubFeaturesMatch_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch#getAny()
   * @see #getSubFeaturesMatch()
   * @generated
   */
  EAttribute getSubFeaturesMatch_Any();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType#getBaseType()
   * @see #getBasicType()
   * @generated
   */
  EReference getBasicType_BaseType();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral <em>List Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral
   * @generated
   */
  EClass getListLiteral();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getBasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getBasicType()
   * @see #getListLiteral()
   * @generated
   */
  EReference getListLiteral_BasicType();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getElems()
   * @see #getListLiteral()
   * @generated
   */
  EReference getListLiteral_Elems();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleListLiteral <em>Simple List Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple List Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleListLiteral
   * @generated
   */
  EClass getSimpleListLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleListLiteral#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleListLiteral#getElems()
   * @see #getSimpleListLiteral()
   * @generated
   */
  EReference getSimpleListLiteral_Elems();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeRef <em>Sub Group Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Group Type Ref</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeRef
   * @generated
   */
  EClass getSubGroupTypeRef();

  /**
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeRef#getType()
   * @see #getSubGroupTypeRef()
   * @generated
   */
  EReference getSubGroupTypeRef_Type();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon <em>Sub Group Type Anon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Group Type Anon</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon
   * @generated
   */
  EClass getSubGroupTypeAnon();

  /**
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon#getSupers <em>Supers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Supers</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon#getSupers()
   * @see #getSubGroupTypeAnon()
   * @generated
   */
  EReference getSubGroupTypeAnon_Supers();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon#getBody()
   * @see #getSubGroupTypeAnon()
   * @generated
   */
  EReference getSubGroupTypeAnon_Body();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType
   * @generated
   */
  EClass getListType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType#getBase()
   * @see #getListType()
   * @generated
   */
  EReference getListType_Base();

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
     * The meta object literal for the '<em><b>Supers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__SUPERS = eINSTANCE.getTypeDecl_Supers();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECL__ELEMS = eINSTANCE.getTypeDecl_Elems();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeaturesDeclImpl <em>Features Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeaturesDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeaturesDecl()
     * @generated
     */
    EClass FEATURES_DECL = eINSTANCE.getFeaturesDecl();

    /**
     * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURES_DECL__COMPLETE = eINSTANCE.getFeaturesDecl_Complete();

    /**
     * The meta object literal for the '<em><b>Supers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURES_DECL__SUPERS = eINSTANCE.getFeaturesDecl_Supers();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURES_DECL__BODY = eINSTANCE.getFeaturesDecl_Body();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeaturesBodyImpl <em>Features Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeaturesBodyImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeaturesBody()
     * @generated
     */
    EClass FEATURES_BODY = eINSTANCE.getFeaturesBody();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURES_BODY__FEATURES = eINSTANCE.getFeaturesBody_Features();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesDeclImpl <em>Sub Features Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubFeaturesDecl()
     * @generated
     */
    EClass SUB_FEATURES_DECL = eINSTANCE.getSubFeaturesDecl();

    /**
     * The meta object literal for the '<em><b>Category Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_FEATURES_DECL__CATEGORY_NAMES = eINSTANCE.getSubFeaturesDecl_CategoryNames();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_FEATURES_DECL__NAME = eINSTANCE.getSubFeaturesDecl_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_FEATURES_DECL__TYPE = eINSTANCE.getSubFeaturesDecl_Type();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesTypeImpl <em>Sub Features Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubFeaturesType()
     * @generated
     */
    EClass SUB_FEATURES_TYPE = eINSTANCE.getSubFeaturesType();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantDeclImpl <em>Multiplicity Invariant Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getMultiplicityInvariantDecl()
     * @generated
     */
    EClass MULTIPLICITY_INVARIANT_DECL = eINSTANCE.getMultiplicityInvariantDecl();

    /**
     * The meta object literal for the '<em><b>Inv Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY_INVARIANT_DECL__INV_NAME = eINSTANCE.getMultiplicityInvariantDecl_InvName();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesMatchImpl <em>Sub Features Match</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesMatchImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubFeaturesMatch()
     * @generated
     */
    EClass SUB_FEATURES_MATCH = eINSTANCE.getSubFeaturesMatch();

    /**
     * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_FEATURES_MATCH__DISTINCT = eINSTANCE.getSubFeaturesMatch_Distinct();

    /**
     * The meta object literal for the '<em><b>Category Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_FEATURES_MATCH__CATEGORY_NAMES = eINSTANCE.getSubFeaturesMatch_CategoryNames();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_FEATURES_MATCH__NAME = eINSTANCE.getSubFeaturesMatch_Name();

    /**
     * The meta object literal for the '<em><b>Any</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_FEATURES_MATCH__ANY = eINSTANCE.getSubFeaturesMatch_Any();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__BASE_TYPE = eINSTANCE.getBasicType_BaseType();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListLiteralImpl <em>List Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getListLiteral()
     * @generated
     */
    EClass LIST_LITERAL = eINSTANCE.getListLiteral();

    /**
     * The meta object literal for the '<em><b>Basic Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL__BASIC_TYPE = eINSTANCE.getListLiteral_BasicType();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL__ELEMS = eINSTANCE.getListLiteral_Elems();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleListLiteralImpl <em>Simple List Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SimpleListLiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSimpleListLiteral()
     * @generated
     */
    EClass SIMPLE_LIST_LITERAL = eINSTANCE.getSimpleListLiteral();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_LIST_LITERAL__ELEMS = eINSTANCE.getSimpleListLiteral_Elems();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeRefImpl <em>Sub Group Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeRefImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupTypeRef()
     * @generated
     */
    EClass SUB_GROUP_TYPE_REF = eINSTANCE.getSubGroupTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_GROUP_TYPE_REF__TYPE = eINSTANCE.getSubGroupTypeRef_Type();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeAnonImpl <em>Sub Group Type Anon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeAnonImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupTypeAnon()
     * @generated
     */
    EClass SUB_GROUP_TYPE_ANON = eINSTANCE.getSubGroupTypeAnon();

    /**
     * The meta object literal for the '<em><b>Supers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_GROUP_TYPE_ANON__SUPERS = eINSTANCE.getSubGroupTypeAnon_Supers();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_GROUP_TYPE_ANON__BODY = eINSTANCE.getSubGroupTypeAnon_Body();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListTypeImpl <em>List Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getListType()
     * @generated
     */
    EClass LIST_TYPE = eINSTANCE.getListType();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE__BASE = eINSTANCE.getListType_Base();

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
