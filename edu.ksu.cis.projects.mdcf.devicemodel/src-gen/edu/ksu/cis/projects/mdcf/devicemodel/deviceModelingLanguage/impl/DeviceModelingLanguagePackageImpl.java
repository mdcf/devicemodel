/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AppOrComponent;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AppRequirement;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintNat;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguageFactory;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Instance;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleListLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleNoneLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleOptionLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch;
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
  private EClass typeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attrDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subMemberDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invariantDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicityInvariantDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subMemberMatchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintNatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appOrComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appRequirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceEClass = null;

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
  private EClass basicTypeEClass = null;

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
  private EClass optionLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleBasicLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTupleLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleOptionLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleListLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleSetLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numNatConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyNatConstraintEClass = null;

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
  private EClass optionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass someTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noneTypeEClass = null;

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
  private EClass noneLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass someLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleNoneLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleSomeLiteralEClass = null;

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
  public EClass getTypeDecl()
  {
    return typeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentDecl()
  {
    return componentDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDecl_Supers()
  {
    return (EReference)componentDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDecl_Members()
  {
    return (EReference)componentDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMemberDecl()
  {
    return memberDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttrDecl()
  {
    return attrDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrDecl_Modifier()
  {
    return (EAttribute)attrDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrDecl_AttributeName()
  {
    return (EAttribute)attrDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttrDecl_Type()
  {
    return (EReference)attrDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttrDecl_Literal()
  {
    return (EReference)attrDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubMemberDecl()
  {
    return subMemberDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubMemberDecl_Name()
  {
    return (EAttribute)subMemberDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubMemberDecl_Supers()
  {
    return (EReference)subMemberDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubMemberDecl_Members()
  {
    return (EReference)subMemberDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvariantDecl()
  {
    return invariantDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicityInvariantDecl()
  {
    return multiplicityInvariantDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicityInvariantDecl_InvName()
  {
    return (EAttribute)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicityInvariantDecl_Lo()
  {
    return (EReference)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicityInvariantDecl_Hi()
  {
    return (EReference)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicityInvariantDecl_Match()
  {
    return (EReference)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicityInvariantDecl_Type()
  {
    return (EReference)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubMemberMatch()
  {
    return subMemberMatchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubMemberMatch_QNames()
  {
    return (EAttribute)subMemberMatchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubMemberMatch_Name()
  {
    return (EAttribute)subMemberMatchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubMemberMatch_Any()
  {
    return (EAttribute)subMemberMatchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintNat()
  {
    return constraintNatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppOrComponent()
  {
    return appOrComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppRequirement()
  {
    return appRequirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppRequirement_Devices()
  {
    return (EReference)appRequirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppRequirement_Supers()
  {
    return (EReference)appRequirementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppRequirement_Members()
  {
    return (EReference)appRequirementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevice()
  {
    return deviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_Name()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_Type()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(1);
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
  public EReference getListLiteral_BasicType()
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
  public EReference getSetLiteral_BasicType()
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
  public EClass getOptionLiteral()
  {
    return optionLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleLiteral()
  {
    return simpleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleBasicLiteral()
  {
    return simpleBasicLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleBasicLiteral_Lit()
  {
    return (EAttribute)simpleBasicLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleTupleLiteral()
  {
    return simpleTupleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleTupleLiteral_Elems()
  {
    return (EReference)simpleTupleLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleOptionLiteral()
  {
    return simpleOptionLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleListLiteral()
  {
    return simpleListLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleListLiteral_Elems()
  {
    return (EReference)simpleListLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleSetLiteral()
  {
    return simpleSetLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSetLiteral_Elems()
  {
    return (EReference)simpleSetLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstance()
  {
    return instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumNatConstraint()
  {
    return numNatConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumNatConstraint_Num()
  {
    return (EAttribute)numNatConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyNatConstraint()
  {
    return anyNatConstraintEClass;
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
  public EClass getOptionType()
  {
    return optionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionType_Base()
  {
    return (EReference)optionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSomeType()
  {
    return someTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSomeType_Base()
  {
    return (EReference)someTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoneType()
  {
    return noneTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNoneType_Base()
  {
    return (EReference)noneTypeEClass.getEStructuralFeatures().get(0);
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
  public EClass getNoneLiteral()
  {
    return noneLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNoneLiteral_Type()
  {
    return (EReference)noneLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSomeLiteral()
  {
    return someLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSomeLiteral_Lit()
  {
    return (EReference)someLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleNoneLiteral()
  {
    return simpleNoneLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleSomeLiteral()
  {
    return simpleSomeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSomeLiteral_Lit()
  {
    return (EReference)simpleSomeLiteralEClass.getEStructuralFeatures().get(0);
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

    typeDeclEClass = createEClass(TYPE_DECL);

    componentDeclEClass = createEClass(COMPONENT_DECL);
    createEReference(componentDeclEClass, COMPONENT_DECL__SUPERS);
    createEReference(componentDeclEClass, COMPONENT_DECL__MEMBERS);

    memberDeclEClass = createEClass(MEMBER_DECL);

    attrDeclEClass = createEClass(ATTR_DECL);
    createEAttribute(attrDeclEClass, ATTR_DECL__MODIFIER);
    createEAttribute(attrDeclEClass, ATTR_DECL__ATTRIBUTE_NAME);
    createEReference(attrDeclEClass, ATTR_DECL__TYPE);
    createEReference(attrDeclEClass, ATTR_DECL__LITERAL);

    subMemberDeclEClass = createEClass(SUB_MEMBER_DECL);
    createEAttribute(subMemberDeclEClass, SUB_MEMBER_DECL__NAME);
    createEReference(subMemberDeclEClass, SUB_MEMBER_DECL__SUPERS);
    createEReference(subMemberDeclEClass, SUB_MEMBER_DECL__MEMBERS);

    invariantDeclEClass = createEClass(INVARIANT_DECL);

    multiplicityInvariantDeclEClass = createEClass(MULTIPLICITY_INVARIANT_DECL);
    createEAttribute(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__INV_NAME);
    createEReference(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__LO);
    createEReference(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__HI);
    createEReference(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__MATCH);
    createEReference(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__TYPE);

    subMemberMatchEClass = createEClass(SUB_MEMBER_MATCH);
    createEAttribute(subMemberMatchEClass, SUB_MEMBER_MATCH__QNAMES);
    createEAttribute(subMemberMatchEClass, SUB_MEMBER_MATCH__NAME);
    createEAttribute(subMemberMatchEClass, SUB_MEMBER_MATCH__ANY);

    constraintNatEClass = createEClass(CONSTRAINT_NAT);

    appOrComponentEClass = createEClass(APP_OR_COMPONENT);

    appRequirementEClass = createEClass(APP_REQUIREMENT);
    createEReference(appRequirementEClass, APP_REQUIREMENT__DEVICES);
    createEReference(appRequirementEClass, APP_REQUIREMENT__SUPERS);
    createEReference(appRequirementEClass, APP_REQUIREMENT__MEMBERS);

    deviceEClass = createEClass(DEVICE);
    createEAttribute(deviceEClass, DEVICE__NAME);
    createEReference(deviceEClass, DEVICE__TYPE);

    typeEClass = createEClass(TYPE);

    basicTypeEClass = createEClass(BASIC_TYPE);
    createEReference(basicTypeEClass, BASIC_TYPE__BASE_TYPE);

    literalEClass = createEClass(LITERAL);

    basicLiteralEClass = createEClass(BASIC_LITERAL);
    createEReference(basicLiteralEClass, BASIC_LITERAL__TYPE_CONS);
    createEAttribute(basicLiteralEClass, BASIC_LITERAL__LIT);

    tupleLiteralEClass = createEClass(TUPLE_LITERAL);
    createEReference(tupleLiteralEClass, TUPLE_LITERAL__ELEMS);

    listLiteralEClass = createEClass(LIST_LITERAL);
    createEReference(listLiteralEClass, LIST_LITERAL__BASIC_TYPE);
    createEReference(listLiteralEClass, LIST_LITERAL__ELEMS);

    setLiteralEClass = createEClass(SET_LITERAL);
    createEReference(setLiteralEClass, SET_LITERAL__BASIC_TYPE);
    createEReference(setLiteralEClass, SET_LITERAL__ELEMS);

    optionLiteralEClass = createEClass(OPTION_LITERAL);

    simpleLiteralEClass = createEClass(SIMPLE_LITERAL);

    simpleBasicLiteralEClass = createEClass(SIMPLE_BASIC_LITERAL);
    createEAttribute(simpleBasicLiteralEClass, SIMPLE_BASIC_LITERAL__LIT);

    simpleTupleLiteralEClass = createEClass(SIMPLE_TUPLE_LITERAL);
    createEReference(simpleTupleLiteralEClass, SIMPLE_TUPLE_LITERAL__ELEMS);

    simpleOptionLiteralEClass = createEClass(SIMPLE_OPTION_LITERAL);

    simpleListLiteralEClass = createEClass(SIMPLE_LIST_LITERAL);
    createEReference(simpleListLiteralEClass, SIMPLE_LIST_LITERAL__ELEMS);

    simpleSetLiteralEClass = createEClass(SIMPLE_SET_LITERAL);
    createEReference(simpleSetLiteralEClass, SIMPLE_SET_LITERAL__ELEMS);

    componentEClass = createEClass(COMPONENT);

    instanceEClass = createEClass(INSTANCE);

    numNatConstraintEClass = createEClass(NUM_NAT_CONSTRAINT);
    createEAttribute(numNatConstraintEClass, NUM_NAT_CONSTRAINT__NUM);

    anyNatConstraintEClass = createEClass(ANY_NAT_CONSTRAINT);

    listTypeEClass = createEClass(LIST_TYPE);
    createEReference(listTypeEClass, LIST_TYPE__BASE);

    setTypeEClass = createEClass(SET_TYPE);
    createEReference(setTypeEClass, SET_TYPE__BASE);

    optionTypeEClass = createEClass(OPTION_TYPE);
    createEReference(optionTypeEClass, OPTION_TYPE__BASE);

    someTypeEClass = createEClass(SOME_TYPE);
    createEReference(someTypeEClass, SOME_TYPE__BASE);

    noneTypeEClass = createEClass(NONE_TYPE);
    createEReference(noneTypeEClass, NONE_TYPE__BASE);

    tupleTypeEClass = createEClass(TUPLE_TYPE);
    createEReference(tupleTypeEClass, TUPLE_TYPE__ELEM_TYPES);

    noneLiteralEClass = createEClass(NONE_LITERAL);
    createEReference(noneLiteralEClass, NONE_LITERAL__TYPE);

    someLiteralEClass = createEClass(SOME_LITERAL);
    createEReference(someLiteralEClass, SOME_LITERAL__LIT);

    simpleNoneLiteralEClass = createEClass(SIMPLE_NONE_LITERAL);

    simpleSomeLiteralEClass = createEClass(SIMPLE_SOME_LITERAL);
    createEReference(simpleSomeLiteralEClass, SIMPLE_SOME_LITERAL__LIT);
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
    typeDeclEClass.getESuperTypes().add(this.getDecl());
    componentDeclEClass.getESuperTypes().add(this.getDecl());
    componentDeclEClass.getESuperTypes().add(this.getAppOrComponent());
    attrDeclEClass.getESuperTypes().add(this.getMemberDecl());
    subMemberDeclEClass.getESuperTypes().add(this.getMemberDecl());
    invariantDeclEClass.getESuperTypes().add(this.getMemberDecl());
    multiplicityInvariantDeclEClass.getESuperTypes().add(this.getInvariantDecl());
    appRequirementEClass.getESuperTypes().add(this.getDecl());
    appRequirementEClass.getESuperTypes().add(this.getAppOrComponent());
    basicTypeEClass.getESuperTypes().add(this.getType());
    basicLiteralEClass.getESuperTypes().add(this.getLiteral());
    tupleLiteralEClass.getESuperTypes().add(this.getLiteral());
    listLiteralEClass.getESuperTypes().add(this.getLiteral());
    setLiteralEClass.getESuperTypes().add(this.getLiteral());
    optionLiteralEClass.getESuperTypes().add(this.getLiteral());
    simpleBasicLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    simpleTupleLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    simpleOptionLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    simpleListLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    simpleSetLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    componentEClass.getESuperTypes().add(this.getComponentDecl());
    instanceEClass.getESuperTypes().add(this.getComponentDecl());
    numNatConstraintEClass.getESuperTypes().add(this.getConstraintNat());
    anyNatConstraintEClass.getESuperTypes().add(this.getConstraintNat());
    listTypeEClass.getESuperTypes().add(this.getType());
    setTypeEClass.getESuperTypes().add(this.getType());
    optionTypeEClass.getESuperTypes().add(this.getType());
    optionTypeEClass.getESuperTypes().add(this.getBasicType());
    someTypeEClass.getESuperTypes().add(this.getType());
    noneTypeEClass.getESuperTypes().add(this.getType());
    noneTypeEClass.getESuperTypes().add(this.getBasicType());
    tupleTypeEClass.getESuperTypes().add(this.getBasicType());
    noneLiteralEClass.getESuperTypes().add(this.getOptionLiteral());
    someLiteralEClass.getESuperTypes().add(this.getOptionLiteral());
    simpleNoneLiteralEClass.getESuperTypes().add(this.getSimpleOptionLiteral());
    simpleSomeLiteralEClass.getESuperTypes().add(this.getSimpleOptionLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Decls(), this.getDecl(), null, "decls", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declEClass, Decl.class, "Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclEClass, TypeDecl.class, "TypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(componentDeclEClass, ComponentDecl.class, "ComponentDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentDecl_Supers(), this.getComponentDecl(), null, "supers", null, 0, -1, ComponentDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDecl_Members(), this.getMemberDecl(), null, "members", null, 0, -1, ComponentDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberDeclEClass, MemberDecl.class, "MemberDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attrDeclEClass, AttrDecl.class, "AttrDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttrDecl_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, AttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrDecl_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, AttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttrDecl_Type(), this.getType(), null, "type", null, 0, 1, AttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttrDecl_Literal(), this.getLiteral(), null, "literal", null, 0, 1, AttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subMemberDeclEClass, SubMemberDecl.class, "SubMemberDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubMemberDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubMemberDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubMemberDecl_Supers(), this.getComponentDecl(), null, "supers", null, 0, -1, SubMemberDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubMemberDecl_Members(), this.getMemberDecl(), null, "members", null, 0, -1, SubMemberDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invariantDeclEClass, InvariantDecl.class, "InvariantDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplicityInvariantDeclEClass, MultiplicityInvariantDecl.class, "MultiplicityInvariantDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplicityInvariantDecl_InvName(), ecorePackage.getEString(), "invName", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicityInvariantDecl_Lo(), this.getConstraintNat(), null, "lo", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicityInvariantDecl_Hi(), this.getConstraintNat(), null, "hi", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicityInvariantDecl_Match(), this.getSubMemberMatch(), null, "match", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicityInvariantDecl_Type(), this.getComponentDecl(), null, "type", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subMemberMatchEClass, SubMemberMatch.class, "SubMemberMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubMemberMatch_QNames(), ecorePackage.getEString(), "qNames", null, 0, -1, SubMemberMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubMemberMatch_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubMemberMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubMemberMatch_Any(), ecorePackage.getEString(), "any", null, 0, 1, SubMemberMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintNatEClass, ConstraintNat.class, "ConstraintNat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(appOrComponentEClass, AppOrComponent.class, "AppOrComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(appRequirementEClass, AppRequirement.class, "AppRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppRequirement_Devices(), this.getDevice(), null, "devices", null, 0, -1, AppRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppRequirement_Supers(), this.getComponentDecl(), null, "supers", null, 0, -1, AppRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppRequirement_Members(), this.getMemberDecl(), null, "members", null, 0, -1, AppRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_Type(), this.getAppOrComponent(), null, "type", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicType_BaseType(), this.getTypeDecl(), null, "baseType", null, 0, 1, BasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicLiteralEClass, BasicLiteral.class, "BasicLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicLiteral_TypeCons(), this.getTypeDecl(), null, "typeCons", null, 0, 1, BasicLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBasicLiteral_Lit(), ecorePackage.getEString(), "lit", null, 0, 1, BasicLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleLiteralEClass, TupleLiteral.class, "TupleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleLiteral_Elems(), this.getLiteral(), null, "elems", null, 0, -1, TupleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listLiteralEClass, ListLiteral.class, "ListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListLiteral_BasicType(), this.getBasicType(), null, "basicType", null, 0, 1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setLiteralEClass, SetLiteral.class, "SetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetLiteral_BasicType(), this.getBasicType(), null, "basicType", null, 0, 1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionLiteralEClass, OptionLiteral.class, "OptionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleLiteralEClass, SimpleLiteral.class, "SimpleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleBasicLiteralEClass, SimpleBasicLiteral.class, "SimpleBasicLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleBasicLiteral_Lit(), ecorePackage.getEString(), "lit", null, 0, 1, SimpleBasicLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleTupleLiteralEClass, SimpleTupleLiteral.class, "SimpleTupleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleTupleLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SimpleTupleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleOptionLiteralEClass, SimpleOptionLiteral.class, "SimpleOptionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleListLiteralEClass, SimpleListLiteral.class, "SimpleListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleListLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SimpleListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleSetLiteralEClass, SimpleSetLiteral.class, "SimpleSetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleSetLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SimpleSetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numNatConstraintEClass, NumNatConstraint.class, "NumNatConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumNatConstraint_Num(), ecorePackage.getEString(), "num", null, 0, 1, NumNatConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyNatConstraintEClass, AnyNatConstraint.class, "AnyNatConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListType_Base(), this.getBasicType(), null, "base", null, 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetType_Base(), this.getBasicType(), null, "base", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionTypeEClass, OptionType.class, "OptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionType_Base(), this.getType(), null, "base", null, 0, 1, OptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(someTypeEClass, SomeType.class, "SomeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSomeType_Base(), this.getType(), null, "base", null, 0, 1, SomeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noneTypeEClass, NoneType.class, "NoneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNoneType_Base(), this.getType(), null, "base", null, 0, 1, NoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleType_ElemTypes(), this.getType(), null, "elemTypes", null, 0, -1, TupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noneLiteralEClass, NoneLiteral.class, "NoneLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNoneLiteral_Type(), this.getType(), null, "type", null, 0, 1, NoneLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(someLiteralEClass, SomeLiteral.class, "SomeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSomeLiteral_Lit(), this.getLiteral(), null, "lit", null, 0, 1, SomeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleNoneLiteralEClass, SimpleNoneLiteral.class, "SimpleNoneLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleSomeLiteralEClass, SimpleSomeLiteral.class, "SimpleSomeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleSomeLiteral_Lit(), this.getSimpleLiteral(), null, "lit", null, 0, 1, SimpleSomeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DeviceModelingLanguagePackageImpl
