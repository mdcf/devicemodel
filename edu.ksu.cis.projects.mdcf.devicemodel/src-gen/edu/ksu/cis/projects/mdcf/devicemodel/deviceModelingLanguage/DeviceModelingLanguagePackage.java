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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupBodyImpl <em>Feature Group Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupBodyImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureGroupBody()
   * @generated
   */
  int FEATURE_GROUP_BODY = 2;

  /**
   * The feature id for the '<em><b>Group Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_GROUP_BODY__GROUP_ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Feature Group Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_GROUP_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupElementDeclImpl <em>Group Element Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupElementDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getGroupElementDecl()
   * @generated
   */
  int GROUP_ELEMENT_DECL = 3;

  /**
   * The number of structural features of the '<em>Group Element Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupAttrDeclImpl <em>Group Attr Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupAttrDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getGroupAttrDecl()
   * @generated
   */
  int GROUP_ATTR_DECL = 4;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ATTR_DECL__MODIFIER = GROUP_ELEMENT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ATTR_DECL__ATTRIBUTE_NAME = GROUP_ELEMENT_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attribute Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ATTR_DECL__ATTRIBUTE_TYPE = GROUP_ELEMENT_DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Attribute Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ATTR_DECL__ATTRIBUTE_LITERAL = GROUP_ELEMENT_DECL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Group Attr Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ATTR_DECL_FEATURE_COUNT = GROUP_ELEMENT_DECL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 5;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.LiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 6;

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
  int BASIC_LITERAL = 7;

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
  int TUPLE_LITERAL = 8;

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
  int LIST_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Type Cons</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__TYPE_CONS = LITERAL_FEATURE_COUNT + 0;

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
  int SET_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Type Cons</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL__TYPE_CONS = LITERAL_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ELiteralImpl <em>ELiteral</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ELiteralImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getELiteral()
   * @generated
   */
  int ELITERAL = 11;

  /**
   * The feature id for the '<em><b>Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELITERAL__LIT = 0;

  /**
   * The number of structural features of the '<em>ELiteral</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupDeclImpl <em>Sub Group Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupDecl()
   * @generated
   */
  int SUB_GROUP_DECL = 12;

  /**
   * The feature id for the '<em><b>Category Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_DECL__CATEGORY_NAME = GROUP_ELEMENT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_DECL__NAME = GROUP_ELEMENT_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_DECL__TYPE = GROUP_ELEMENT_DECL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sub Group Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_DECL_FEATURE_COUNT = GROUP_ELEMENT_DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeImpl <em>Sub Group Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupType()
   * @generated
   */
  int SUB_GROUP_TYPE = 13;

  /**
   * The number of structural features of the '<em>Sub Group Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeDeclImpl <em>Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getTypeDecl()
   * @generated
   */
  int TYPE_DECL = 14;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupDeclImpl <em>Feature Group Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupDeclImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureGroupDecl()
   * @generated
   */
  int FEATURE_GROUP_DECL = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_GROUP_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_GROUP_DECL__SUPERS = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_GROUP_DECL__BODY = DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Group Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_GROUP_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 16;

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
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListTypeImpl <em>List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListTypeImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getListType()
   * @generated
   */
  int LIST_TYPE = 17;

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
  int SET_TYPE = 18;

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
  int TUPLE_TYPE = 19;

  /**
   * The feature id for the '<em><b>Elem Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE__ELEM_TYPES = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeRefImpl <em>Sub Group Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeRefImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupTypeRef()
   * @generated
   */
  int SUB_GROUP_TYPE_REF = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_REF__TYPE = SUB_GROUP_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub Group Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_REF_FEATURE_COUNT = SUB_GROUP_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeAnonImpl <em>Sub Group Type Anon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeAnonImpl
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupTypeAnon()
   * @generated
   */
  int SUB_GROUP_TYPE_ANON = 21;

  /**
   * The feature id for the '<em><b>Supers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_ANON__SUPERS = SUB_GROUP_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_ANON__BODY = SUB_GROUP_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Group Type Anon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_GROUP_TYPE_ANON_FEATURE_COUNT = SUB_GROUP_TYPE_FEATURE_COUNT + 2;


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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody <em>Feature Group Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Group Body</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody
   * @generated
   */
  EClass getFeatureGroupBody();

  /**
   * Returns the meta object for the containment reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody#getGroupElements <em>Group Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Elements</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody#getGroupElements()
   * @see #getFeatureGroupBody()
   * @generated
   */
  EReference getFeatureGroupBody_GroupElements();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupElementDecl <em>Group Element Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Element Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupElementDecl
   * @generated
   */
  EClass getGroupElementDecl();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl <em>Group Attr Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Attr Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl
   * @generated
   */
  EClass getGroupAttrDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getModifier()
   * @see #getGroupAttrDecl()
   * @generated
   */
  EAttribute getGroupAttrDecl_Modifier();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeName()
   * @see #getGroupAttrDecl()
   * @generated
   */
  EAttribute getGroupAttrDecl_AttributeName();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeType()
   * @see #getGroupAttrDecl()
   * @generated
   */
  EReference getGroupAttrDecl_AttributeType();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeLiteral <em>Attribute Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Literal</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl#getAttributeLiteral()
   * @see #getGroupAttrDecl()
   * @generated
   */
  EReference getGroupAttrDecl_AttributeLiteral();

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
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getTypeCons <em>Type Cons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Cons</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral#getTypeCons()
   * @see #getListLiteral()
   * @generated
   */
  EReference getListLiteral_TypeCons();

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
   * Returns the meta object for the reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral#getTypeCons <em>Type Cons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Cons</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral#getTypeCons()
   * @see #getSetLiteral()
   * @generated
   */
  EReference getSetLiteral_TypeCons();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral <em>ELiteral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ELiteral</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral
   * @generated
   */
  EClass getELiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lit</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral#getLit()
   * @see #getELiteral()
   * @generated
   */
  EAttribute getELiteral_Lit();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl <em>Sub Group Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Group Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl
   * @generated
   */
  EClass getSubGroupDecl();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getCategoryName <em>Category Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getCategoryName()
   * @see #getSubGroupDecl()
   * @generated
   */
  EAttribute getSubGroupDecl_CategoryName();

  /**
   * Returns the meta object for the attribute '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getName()
   * @see #getSubGroupDecl()
   * @generated
   */
  EAttribute getSubGroupDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl#getType()
   * @see #getSubGroupDecl()
   * @generated
   */
  EReference getSubGroupDecl_Type();

  /**
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupType <em>Sub Group Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Group Type</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupType
   * @generated
   */
  EClass getSubGroupType();

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
   * Returns the meta object for class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl <em>Feature Group Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Group Decl</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl
   * @generated
   */
  EClass getFeatureGroupDecl();

  /**
   * Returns the meta object for the reference list '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl#getSupers <em>Supers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Supers</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl#getSupers()
   * @see #getFeatureGroupDecl()
   * @generated
   */
  EReference getFeatureGroupDecl_Supers();

  /**
   * Returns the meta object for the containment reference '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl#getBody()
   * @see #getFeatureGroupDecl()
   * @generated
   */
  EReference getFeatureGroupDecl_Body();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupBodyImpl <em>Feature Group Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupBodyImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureGroupBody()
     * @generated
     */
    EClass FEATURE_GROUP_BODY = eINSTANCE.getFeatureGroupBody();

    /**
     * The meta object literal for the '<em><b>Group Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_GROUP_BODY__GROUP_ELEMENTS = eINSTANCE.getFeatureGroupBody_GroupElements();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupElementDeclImpl <em>Group Element Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupElementDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getGroupElementDecl()
     * @generated
     */
    EClass GROUP_ELEMENT_DECL = eINSTANCE.getGroupElementDecl();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupAttrDeclImpl <em>Group Attr Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupAttrDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getGroupAttrDecl()
     * @generated
     */
    EClass GROUP_ATTR_DECL = eINSTANCE.getGroupAttrDecl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_ATTR_DECL__MODIFIER = eINSTANCE.getGroupAttrDecl_Modifier();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_ATTR_DECL__ATTRIBUTE_NAME = eINSTANCE.getGroupAttrDecl_AttributeName();

    /**
     * The meta object literal for the '<em><b>Attribute Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_ATTR_DECL__ATTRIBUTE_TYPE = eINSTANCE.getGroupAttrDecl_AttributeType();

    /**
     * The meta object literal for the '<em><b>Attribute Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_ATTR_DECL__ATTRIBUTE_LITERAL = eINSTANCE.getGroupAttrDecl_AttributeLiteral();

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
     * The meta object literal for the '<em><b>Type Cons</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL__TYPE_CONS = eINSTANCE.getListLiteral_TypeCons();

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
     * The meta object literal for the '<em><b>Type Cons</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_LITERAL__TYPE_CONS = eINSTANCE.getSetLiteral_TypeCons();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_LITERAL__ELEMS = eINSTANCE.getSetLiteral_Elems();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ELiteralImpl <em>ELiteral</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ELiteralImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getELiteral()
     * @generated
     */
    EClass ELITERAL = eINSTANCE.getELiteral();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELITERAL__LIT = eINSTANCE.getELiteral_Lit();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupDeclImpl <em>Sub Group Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupDecl()
     * @generated
     */
    EClass SUB_GROUP_DECL = eINSTANCE.getSubGroupDecl();

    /**
     * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_GROUP_DECL__CATEGORY_NAME = eINSTANCE.getSubGroupDecl_CategoryName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_GROUP_DECL__NAME = eINSTANCE.getSubGroupDecl_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_GROUP_DECL__TYPE = eINSTANCE.getSubGroupDecl_Type();

    /**
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeImpl <em>Sub Group Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getSubGroupType()
     * @generated
     */
    EClass SUB_GROUP_TYPE = eINSTANCE.getSubGroupType();

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
     * The meta object literal for the '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupDeclImpl <em>Feature Group Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupDeclImpl
     * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.DeviceModelingLanguagePackageImpl#getFeatureGroupDecl()
     * @generated
     */
    EClass FEATURE_GROUP_DECL = eINSTANCE.getFeatureGroupDecl();

    /**
     * The meta object literal for the '<em><b>Supers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_GROUP_DECL__SUPERS = eINSTANCE.getFeatureGroupDecl_Supers();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_GROUP_DECL__BODY = eINSTANCE.getFeatureGroupDecl_Body();

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

  }

} //DeviceModelingLanguagePackage
