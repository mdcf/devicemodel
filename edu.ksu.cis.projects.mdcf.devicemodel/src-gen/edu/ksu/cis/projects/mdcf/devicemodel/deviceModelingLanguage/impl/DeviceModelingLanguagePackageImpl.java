/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguageFactory;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupElementDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeRef;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceModelingLanguagePackageImpl extends EPackageImpl implements DeviceModelingLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureGroupBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupElementDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupAttrDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tupleLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subGroupDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subGroupTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureGroupDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tupleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subGroupTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subGroupTypeAnonEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DeviceModelingLanguagePackageImpl()
  {
    super(eNS_URI, DeviceModelingLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DeviceModelingLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DeviceModelingLanguagePackage init()
  {
    if (isInited) return (DeviceModelingLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(DeviceModelingLanguagePackage.eNS_URI);

    // Obtain or create and register package
    DeviceModelingLanguagePackageImpl theDeviceModelingLanguagePackage = (DeviceModelingLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeviceModelingLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeviceModelingLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDeviceModelingLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theDeviceModelingLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDeviceModelingLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DeviceModelingLanguagePackage.eNS_URI, theDeviceModelingLanguagePackage);
    return theDeviceModelingLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Decls()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecl()
  {
    return declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecl_Name()
  {
    return (EAttribute)declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureGroupBody()
  {
    return featureGroupBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureGroupBody_GroupElements()
  {
    return (EReference)featureGroupBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupElementDecl()
  {
    return groupElementDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupAttrDecl()
  {
    return groupAttrDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupAttrDecl_Modifier()
  {
    return (EAttribute)groupAttrDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupAttrDecl_AttributeName()
  {
    return (EAttribute)groupAttrDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupAttrDecl_AttributeType()
  {
    return (EReference)groupAttrDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupAttrDecl_AttributeLiteral()
  {
    return (EReference)groupAttrDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicLiteral()
  {
    return basicLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicLiteral_TypeCons()
  {
    return (EReference)basicLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicLiteral_Lit()
  {
    return (EAttribute)basicLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTupleLiteral()
  {
    return tupleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTupleLiteral_Elems()
  {
    return (EReference)tupleLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListLiteral()
  {
    return listLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListLiteral_TypeCons()
  {
    return (EReference)listLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListLiteral_Elems()
  {
    return (EReference)listLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetLiteral()
  {
    return setLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetLiteral_TypeCons()
  {
    return (EReference)setLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetLiteral_Elems()
  {
    return (EReference)setLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getELiteral()
  {
    return eLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getELiteral_Lit()
  {
    return (EAttribute)eLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubGroupDecl()
  {
    return subGroupDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubGroupDecl_CategoryName()
  {
    return (EAttribute)subGroupDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubGroupDecl_Name()
  {
    return (EAttribute)subGroupDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubGroupDecl_Type()
  {
    return (EReference)subGroupDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubGroupType()
  {
    return subGroupTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDecl()
  {
    return typeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureGroupDecl()
  {
    return featureGroupDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureGroupDecl_Supers()
  {
    return (EReference)featureGroupDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureGroupDecl_Body()
  {
    return (EReference)featureGroupDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicType()
  {
    return basicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicType_BaseType()
  {
    return (EReference)basicTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListType()
  {
    return listTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListType_Base()
  {
    return (EReference)listTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetType()
  {
    return setTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetType_Base()
  {
    return (EReference)setTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTupleType()
  {
    return tupleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTupleType_ElemTypes()
  {
    return (EReference)tupleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubGroupTypeRef()
  {
    return subGroupTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubGroupTypeRef_Type()
  {
    return (EReference)subGroupTypeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubGroupTypeAnon()
  {
    return subGroupTypeAnonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubGroupTypeAnon_Supers()
  {
    return (EReference)subGroupTypeAnonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubGroupTypeAnon_Body()
  {
    return (EReference)subGroupTypeAnonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceModelingLanguageFactory getDeviceModelingLanguageFactory()
  {
    return (DeviceModelingLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__DECLS);

    declEClass = createEClass(DECL);
    createEAttribute(declEClass, DECL__NAME);

    featureGroupBodyEClass = createEClass(FEATURE_GROUP_BODY);
    createEReference(featureGroupBodyEClass, FEATURE_GROUP_BODY__GROUP_ELEMENTS);

    groupElementDeclEClass = createEClass(GROUP_ELEMENT_DECL);

    groupAttrDeclEClass = createEClass(GROUP_ATTR_DECL);
    createEAttribute(groupAttrDeclEClass, GROUP_ATTR_DECL__MODIFIER);
    createEAttribute(groupAttrDeclEClass, GROUP_ATTR_DECL__ATTRIBUTE_NAME);
    createEReference(groupAttrDeclEClass, GROUP_ATTR_DECL__ATTRIBUTE_TYPE);
    createEReference(groupAttrDeclEClass, GROUP_ATTR_DECL__ATTRIBUTE_LITERAL);

    typeEClass = createEClass(TYPE);

    literalEClass = createEClass(LITERAL);

    basicLiteralEClass = createEClass(BASIC_LITERAL);
    createEReference(basicLiteralEClass, BASIC_LITERAL__TYPE_CONS);
    createEAttribute(basicLiteralEClass, BASIC_LITERAL__LIT);

    tupleLiteralEClass = createEClass(TUPLE_LITERAL);
    createEReference(tupleLiteralEClass, TUPLE_LITERAL__ELEMS);

    listLiteralEClass = createEClass(LIST_LITERAL);
    createEReference(listLiteralEClass, LIST_LITERAL__TYPE_CONS);
    createEReference(listLiteralEClass, LIST_LITERAL__ELEMS);

    setLiteralEClass = createEClass(SET_LITERAL);
    createEReference(setLiteralEClass, SET_LITERAL__TYPE_CONS);
    createEReference(setLiteralEClass, SET_LITERAL__ELEMS);

    eLiteralEClass = createEClass(ELITERAL);
    createEAttribute(eLiteralEClass, ELITERAL__LIT);

    subGroupDeclEClass = createEClass(SUB_GROUP_DECL);
    createEAttribute(subGroupDeclEClass, SUB_GROUP_DECL__CATEGORY_NAME);
    createEAttribute(subGroupDeclEClass, SUB_GROUP_DECL__NAME);
    createEReference(subGroupDeclEClass, SUB_GROUP_DECL__TYPE);

    subGroupTypeEClass = createEClass(SUB_GROUP_TYPE);

    typeDeclEClass = createEClass(TYPE_DECL);

    featureGroupDeclEClass = createEClass(FEATURE_GROUP_DECL);
    createEReference(featureGroupDeclEClass, FEATURE_GROUP_DECL__SUPERS);
    createEReference(featureGroupDeclEClass, FEATURE_GROUP_DECL__BODY);

    basicTypeEClass = createEClass(BASIC_TYPE);
    createEReference(basicTypeEClass, BASIC_TYPE__BASE_TYPE);

    listTypeEClass = createEClass(LIST_TYPE);
    createEReference(listTypeEClass, LIST_TYPE__BASE);

    setTypeEClass = createEClass(SET_TYPE);
    createEReference(setTypeEClass, SET_TYPE__BASE);

    tupleTypeEClass = createEClass(TUPLE_TYPE);
    createEReference(tupleTypeEClass, TUPLE_TYPE__ELEM_TYPES);

    subGroupTypeRefEClass = createEClass(SUB_GROUP_TYPE_REF);
    createEReference(subGroupTypeRefEClass, SUB_GROUP_TYPE_REF__TYPE);

    subGroupTypeAnonEClass = createEClass(SUB_GROUP_TYPE_ANON);
    createEReference(subGroupTypeAnonEClass, SUB_GROUP_TYPE_ANON__SUPERS);
    createEReference(subGroupTypeAnonEClass, SUB_GROUP_TYPE_ANON__BODY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    groupAttrDeclEClass.getESuperTypes().add(this.getGroupElementDecl());
    basicLiteralEClass.getESuperTypes().add(this.getLiteral());
    tupleLiteralEClass.getESuperTypes().add(this.getLiteral());
    listLiteralEClass.getESuperTypes().add(this.getLiteral());
    setLiteralEClass.getESuperTypes().add(this.getLiteral());
    subGroupDeclEClass.getESuperTypes().add(this.getGroupElementDecl());
    typeDeclEClass.getESuperTypes().add(this.getDecl());
    featureGroupDeclEClass.getESuperTypes().add(this.getDecl());
    basicTypeEClass.getESuperTypes().add(this.getType());
    listTypeEClass.getESuperTypes().add(this.getType());
    setTypeEClass.getESuperTypes().add(this.getType());
    tupleTypeEClass.getESuperTypes().add(this.getType());
    subGroupTypeRefEClass.getESuperTypes().add(this.getSubGroupType());
    subGroupTypeAnonEClass.getESuperTypes().add(this.getSubGroupType());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Decls(), this.getDecl(), null, "decls", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declEClass, Decl.class, "Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureGroupBodyEClass, FeatureGroupBody.class, "FeatureGroupBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureGroupBody_GroupElements(), this.getGroupElementDecl(), null, "groupElements", null, 0, -1, FeatureGroupBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupElementDeclEClass, GroupElementDecl.class, "GroupElementDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(groupAttrDeclEClass, GroupAttrDecl.class, "GroupAttrDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroupAttrDecl_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, GroupAttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupAttrDecl_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, GroupAttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupAttrDecl_AttributeType(), this.getType(), null, "attributeType", null, 0, 1, GroupAttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupAttrDecl_AttributeLiteral(), this.getLiteral(), null, "attributeLiteral", null, 0, 1, GroupAttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicLiteralEClass, BasicLiteral.class, "BasicLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicLiteral_TypeCons(), this.getTypeDecl(), null, "typeCons", null, 0, 1, BasicLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBasicLiteral_Lit(), ecorePackage.getEString(), "lit", null, 0, 1, BasicLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleLiteralEClass, TupleLiteral.class, "TupleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleLiteral_Elems(), this.getLiteral(), null, "elems", null, 0, -1, TupleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listLiteralEClass, ListLiteral.class, "ListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListLiteral_TypeCons(), this.getTypeDecl(), null, "typeCons", null, 0, 1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListLiteral_Elems(), this.getELiteral(), null, "elems", null, 0, -1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setLiteralEClass, SetLiteral.class, "SetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetLiteral_TypeCons(), this.getTypeDecl(), null, "typeCons", null, 0, 1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetLiteral_Elems(), this.getELiteral(), null, "elems", null, 0, -1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eLiteralEClass, ELiteral.class, "ELiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getELiteral_Lit(), ecorePackage.getEString(), "lit", null, 0, 1, ELiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subGroupDeclEClass, SubGroupDecl.class, "SubGroupDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubGroupDecl_CategoryName(), ecorePackage.getEString(), "categoryName", null, 0, 1, SubGroupDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubGroupDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubGroupDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubGroupDecl_Type(), this.getSubGroupType(), null, "type", null, 0, 1, SubGroupDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subGroupTypeEClass, SubGroupType.class, "SubGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeDeclEClass, TypeDecl.class, "TypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureGroupDeclEClass, FeatureGroupDecl.class, "FeatureGroupDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureGroupDecl_Supers(), this.getFeatureGroupDecl(), null, "supers", null, 0, -1, FeatureGroupDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureGroupDecl_Body(), this.getFeatureGroupBody(), null, "body", null, 0, 1, FeatureGroupDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicType_BaseType(), this.getTypeDecl(), null, "baseType", null, 0, 1, BasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListType_Base(), this.getBasicType(), null, "base", null, 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetType_Base(), this.getBasicType(), null, "base", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleType_ElemTypes(), this.getType(), null, "elemTypes", null, 0, -1, TupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subGroupTypeRefEClass, SubGroupTypeRef.class, "SubGroupTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubGroupTypeRef_Type(), this.getFeatureGroupDecl(), null, "type", null, 0, 1, SubGroupTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subGroupTypeAnonEClass, SubGroupTypeAnon.class, "SubGroupTypeAnon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubGroupTypeAnon_Supers(), this.getFeatureGroupDecl(), null, "supers", null, 0, -1, SubGroupTypeAnon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubGroupTypeAnon_Body(), this.getFeatureGroupBody(), null, "body", null, 0, 1, SubGroupTypeAnon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DeviceModelingLanguagePackageImpl
