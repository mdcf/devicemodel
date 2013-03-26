/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.App;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrOrSubMember;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintNat;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguageFactory;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Exp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariantDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Primary;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.PrimaryExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleNoneLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleOptionLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSeqLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp;

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
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseFeatureTypeEClass = null;

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
  private EClass generalInvariantDeclEClass = null;

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
  private EClass deviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportMemberDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attrOrSubMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryEClass = null;

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
  private EClass baseTypeEClass = null;

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
  private EClass seqLiteralEClass = null;

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
  private EClass simpleSeqLiteralEClass = null;

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
  private EClass appEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionFeatureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass someFeatureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noneFeatureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eitherFeatureTypeEClass = null;

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
  private EClass binaryExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seqTypeEClass = null;

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
  public EReference getComponentDecl_Devices()
  {
    return (EReference)componentDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDecl_Assigns()
  {
    return (EReference)componentDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDecl_Exp()
  {
    return (EReference)componentDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDecl_Reports()
  {
    return (EReference)componentDeclEClass.getEStructuralFeatures().get(5);
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
  public EReference getSubMemberDecl_Type()
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
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Name()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Exp()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReport()
  {
    return reportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Name()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Args()
  {
    return (EReference)reportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureType()
  {
    return featureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseFeatureType()
  {
    return baseFeatureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseFeatureType_Components()
  {
    return (EReference)baseFeatureTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseFeatureType_Members()
  {
    return (EReference)baseFeatureTypeEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getInvariantDecl_InvName()
  {
    return (EAttribute)invariantDeclEClass.getEStructuralFeatures().get(0);
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
  public EReference getMultiplicityInvariantDecl_Lo()
  {
    return (EReference)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicityInvariantDecl_Hi()
  {
    return (EReference)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicityInvariantDecl_Match()
  {
    return (EReference)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicityInvariantDecl_Type()
  {
    return (EReference)multiplicityInvariantDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralInvariantDecl()
  {
    return generalInvariantDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralInvariantDecl_Exp()
  {
    return (EReference)generalInvariantDeclEClass.getEStructuralFeatures().get(0);
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
  public EClass getDevice()
  {
    return deviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_Components()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_Constraint()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintExp()
  {
    return constraintExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintExp_Cond()
  {
    return (EReference)constraintExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReportDecl()
  {
    return reportDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReportDecl_Params()
  {
    return (EReference)reportDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReportDecl_Attrs()
  {
    return (EReference)reportDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParam()
  {
    return paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParam_Name()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParam_Type()
  {
    return (EReference)paramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReportMemberDecl()
  {
    return reportMemberDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReportMemberDecl_Name()
  {
    return (EAttribute)reportMemberDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReportMemberDecl_BindingName()
  {
    return (EReference)reportMemberDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttrOrSubMember()
  {
    return attrOrSubMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExp()
  {
    return expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimary()
  {
    return primaryEClass;
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
  public EClass getBaseType()
  {
    return baseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseType_Type()
  {
    return (EReference)baseTypeEClass.getEStructuralFeatures().get(0);
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
  public EClass getSeqLiteral()
  {
    return seqLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeqLiteral_BasicType()
  {
    return (EReference)seqLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeqLiteral_Elems()
  {
    return (EReference)seqLiteralEClass.getEStructuralFeatures().get(1);
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
  public EClass getSimpleSeqLiteral()
  {
    return simpleSeqLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleSeqLiteral_Elems()
  {
    return (EReference)simpleSeqLiteralEClass.getEStructuralFeatures().get(0);
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
  public EClass getApp()
  {
    return appEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionFeatureType()
  {
    return optionFeatureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionFeatureType_Base()
  {
    return (EReference)optionFeatureTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSomeFeatureType()
  {
    return someFeatureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSomeFeatureType_Base()
  {
    return (EReference)someFeatureTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSomeFeatureType_Members()
  {
    return (EReference)someFeatureTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoneFeatureType()
  {
    return noneFeatureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNoneFeatureType_Base()
  {
    return (EReference)noneFeatureTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEitherFeatureType()
  {
    return eitherFeatureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEitherFeatureType_Bases()
  {
    return (EReference)eitherFeatureTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEitherFeatureType_Choice()
  {
    return (EAttribute)eitherFeatureTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEitherFeatureType_Members()
  {
    return (EReference)eitherFeatureTypeEClass.getEStructuralFeatures().get(2);
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
  public EClass getBinaryExp()
  {
    return binaryExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExp_Left()
  {
    return (EReference)binaryExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryExp_Op()
  {
    return (EAttribute)binaryExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExp_Right()
  {
    return (EReference)binaryExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExp()
  {
    return unaryExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExp_Op()
  {
    return (EAttribute)unaryExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExp_Arg()
  {
    return (EReference)unaryExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExp()
  {
    return primaryExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExp_Primary()
  {
    return (EReference)primaryExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessExp()
  {
    return accessExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessExp_Base()
  {
    return (EReference)accessExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessExp_Name()
  {
    return (EReference)accessExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameExp()
  {
    return nameExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameExp_Id()
  {
    return (EAttribute)nameExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralExp()
  {
    return literalExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralExp_Lit()
  {
    return (EReference)literalExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeqType()
  {
    return seqTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeqType_Base()
  {
    return (EReference)seqTypeEClass.getEStructuralFeatures().get(0);
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
    createEReference(componentDeclEClass, COMPONENT_DECL__DEVICES);
    createEReference(componentDeclEClass, COMPONENT_DECL__ASSIGNS);
    createEReference(componentDeclEClass, COMPONENT_DECL__EXP);
    createEReference(componentDeclEClass, COMPONENT_DECL__REPORTS);

    memberDeclEClass = createEClass(MEMBER_DECL);

    attrDeclEClass = createEClass(ATTR_DECL);
    createEAttribute(attrDeclEClass, ATTR_DECL__MODIFIER);
    createEAttribute(attrDeclEClass, ATTR_DECL__ATTRIBUTE_NAME);
    createEReference(attrDeclEClass, ATTR_DECL__TYPE);
    createEReference(attrDeclEClass, ATTR_DECL__LITERAL);

    subMemberDeclEClass = createEClass(SUB_MEMBER_DECL);
    createEAttribute(subMemberDeclEClass, SUB_MEMBER_DECL__NAME);
    createEReference(subMemberDeclEClass, SUB_MEMBER_DECL__TYPE);
    createEReference(subMemberDeclEClass, SUB_MEMBER_DECL__MEMBERS);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__NAME);
    createEReference(assignmentEClass, ASSIGNMENT__EXP);

    reportEClass = createEClass(REPORT);
    createEAttribute(reportEClass, REPORT__NAME);
    createEReference(reportEClass, REPORT__ARGS);

    featureTypeEClass = createEClass(FEATURE_TYPE);

    baseFeatureTypeEClass = createEClass(BASE_FEATURE_TYPE);
    createEReference(baseFeatureTypeEClass, BASE_FEATURE_TYPE__COMPONENTS);
    createEReference(baseFeatureTypeEClass, BASE_FEATURE_TYPE__MEMBERS);

    invariantDeclEClass = createEClass(INVARIANT_DECL);
    createEAttribute(invariantDeclEClass, INVARIANT_DECL__INV_NAME);

    multiplicityInvariantDeclEClass = createEClass(MULTIPLICITY_INVARIANT_DECL);
    createEReference(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__LO);
    createEReference(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__HI);
    createEReference(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__MATCH);
    createEReference(multiplicityInvariantDeclEClass, MULTIPLICITY_INVARIANT_DECL__TYPE);

    generalInvariantDeclEClass = createEClass(GENERAL_INVARIANT_DECL);
    createEReference(generalInvariantDeclEClass, GENERAL_INVARIANT_DECL__EXP);

    subMemberMatchEClass = createEClass(SUB_MEMBER_MATCH);
    createEAttribute(subMemberMatchEClass, SUB_MEMBER_MATCH__QNAMES);
    createEAttribute(subMemberMatchEClass, SUB_MEMBER_MATCH__NAME);
    createEAttribute(subMemberMatchEClass, SUB_MEMBER_MATCH__ANY);

    constraintNatEClass = createEClass(CONSTRAINT_NAT);

    deviceEClass = createEClass(DEVICE);
    createEReference(deviceEClass, DEVICE__COMPONENTS);
    createEReference(deviceEClass, DEVICE__CONSTRAINT);

    constraintExpEClass = createEClass(CONSTRAINT_EXP);
    createEReference(constraintExpEClass, CONSTRAINT_EXP__COND);

    reportDeclEClass = createEClass(REPORT_DECL);
    createEReference(reportDeclEClass, REPORT_DECL__PARAMS);
    createEReference(reportDeclEClass, REPORT_DECL__ATTRS);

    paramEClass = createEClass(PARAM);
    createEAttribute(paramEClass, PARAM__NAME);
    createEReference(paramEClass, PARAM__TYPE);

    reportMemberDeclEClass = createEClass(REPORT_MEMBER_DECL);
    createEAttribute(reportMemberDeclEClass, REPORT_MEMBER_DECL__NAME);
    createEReference(reportMemberDeclEClass, REPORT_MEMBER_DECL__BINDING_NAME);

    attrOrSubMemberEClass = createEClass(ATTR_OR_SUB_MEMBER);

    expEClass = createEClass(EXP);

    primaryEClass = createEClass(PRIMARY);

    typeEClass = createEClass(TYPE);

    baseTypeEClass = createEClass(BASE_TYPE);
    createEReference(baseTypeEClass, BASE_TYPE__TYPE);

    literalEClass = createEClass(LITERAL);

    basicLiteralEClass = createEClass(BASIC_LITERAL);
    createEReference(basicLiteralEClass, BASIC_LITERAL__TYPE_CONS);
    createEAttribute(basicLiteralEClass, BASIC_LITERAL__LIT);

    tupleLiteralEClass = createEClass(TUPLE_LITERAL);
    createEReference(tupleLiteralEClass, TUPLE_LITERAL__ELEMS);

    seqLiteralEClass = createEClass(SEQ_LITERAL);
    createEReference(seqLiteralEClass, SEQ_LITERAL__BASIC_TYPE);
    createEReference(seqLiteralEClass, SEQ_LITERAL__ELEMS);

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

    simpleSeqLiteralEClass = createEClass(SIMPLE_SEQ_LITERAL);
    createEReference(simpleSeqLiteralEClass, SIMPLE_SEQ_LITERAL__ELEMS);

    simpleSetLiteralEClass = createEClass(SIMPLE_SET_LITERAL);
    createEReference(simpleSetLiteralEClass, SIMPLE_SET_LITERAL__ELEMS);

    componentEClass = createEClass(COMPONENT);

    appEClass = createEClass(APP);

    optionFeatureTypeEClass = createEClass(OPTION_FEATURE_TYPE);
    createEReference(optionFeatureTypeEClass, OPTION_FEATURE_TYPE__BASE);

    someFeatureTypeEClass = createEClass(SOME_FEATURE_TYPE);
    createEReference(someFeatureTypeEClass, SOME_FEATURE_TYPE__BASE);
    createEReference(someFeatureTypeEClass, SOME_FEATURE_TYPE__MEMBERS);

    noneFeatureTypeEClass = createEClass(NONE_FEATURE_TYPE);
    createEReference(noneFeatureTypeEClass, NONE_FEATURE_TYPE__BASE);

    eitherFeatureTypeEClass = createEClass(EITHER_FEATURE_TYPE);
    createEReference(eitherFeatureTypeEClass, EITHER_FEATURE_TYPE__BASES);
    createEAttribute(eitherFeatureTypeEClass, EITHER_FEATURE_TYPE__CHOICE);
    createEReference(eitherFeatureTypeEClass, EITHER_FEATURE_TYPE__MEMBERS);

    numNatConstraintEClass = createEClass(NUM_NAT_CONSTRAINT);
    createEAttribute(numNatConstraintEClass, NUM_NAT_CONSTRAINT__NUM);

    anyNatConstraintEClass = createEClass(ANY_NAT_CONSTRAINT);

    binaryExpEClass = createEClass(BINARY_EXP);
    createEReference(binaryExpEClass, BINARY_EXP__LEFT);
    createEAttribute(binaryExpEClass, BINARY_EXP__OP);
    createEReference(binaryExpEClass, BINARY_EXP__RIGHT);

    unaryExpEClass = createEClass(UNARY_EXP);
    createEAttribute(unaryExpEClass, UNARY_EXP__OP);
    createEReference(unaryExpEClass, UNARY_EXP__ARG);

    primaryExpEClass = createEClass(PRIMARY_EXP);
    createEReference(primaryExpEClass, PRIMARY_EXP__PRIMARY);

    accessExpEClass = createEClass(ACCESS_EXP);
    createEReference(accessExpEClass, ACCESS_EXP__BASE);
    createEReference(accessExpEClass, ACCESS_EXP__NAME);

    nameExpEClass = createEClass(NAME_EXP);
    createEAttribute(nameExpEClass, NAME_EXP__ID);

    literalExpEClass = createEClass(LITERAL_EXP);
    createEReference(literalExpEClass, LITERAL_EXP__LIT);

    seqTypeEClass = createEClass(SEQ_TYPE);
    createEReference(seqTypeEClass, SEQ_TYPE__BASE);

    setTypeEClass = createEClass(SET_TYPE);
    createEReference(setTypeEClass, SET_TYPE__BASE);

    tupleTypeEClass = createEClass(TUPLE_TYPE);
    createEReference(tupleTypeEClass, TUPLE_TYPE__ELEM_TYPES);

    optionTypeEClass = createEClass(OPTION_TYPE);
    createEReference(optionTypeEClass, OPTION_TYPE__BASE);

    someTypeEClass = createEClass(SOME_TYPE);
    createEReference(someTypeEClass, SOME_TYPE__BASE);

    noneTypeEClass = createEClass(NONE_TYPE);
    createEReference(noneTypeEClass, NONE_TYPE__BASE);

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
    attrDeclEClass.getESuperTypes().add(this.getMemberDecl());
    attrDeclEClass.getESuperTypes().add(this.getAttrOrSubMember());
    subMemberDeclEClass.getESuperTypes().add(this.getMemberDecl());
    subMemberDeclEClass.getESuperTypes().add(this.getAttrOrSubMember());
    baseFeatureTypeEClass.getESuperTypes().add(this.getFeatureType());
    invariantDeclEClass.getESuperTypes().add(this.getMemberDecl());
    multiplicityInvariantDeclEClass.getESuperTypes().add(this.getInvariantDecl());
    generalInvariantDeclEClass.getESuperTypes().add(this.getInvariantDecl());
    deviceEClass.getESuperTypes().add(this.getComponentDecl());
    reportDeclEClass.getESuperTypes().add(this.getDecl());
    baseTypeEClass.getESuperTypes().add(this.getType());
    basicLiteralEClass.getESuperTypes().add(this.getLiteral());
    tupleLiteralEClass.getESuperTypes().add(this.getLiteral());
    seqLiteralEClass.getESuperTypes().add(this.getLiteral());
    setLiteralEClass.getESuperTypes().add(this.getLiteral());
    optionLiteralEClass.getESuperTypes().add(this.getLiteral());
    simpleBasicLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    simpleTupleLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    simpleOptionLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    simpleSeqLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    simpleSetLiteralEClass.getESuperTypes().add(this.getSimpleLiteral());
    componentEClass.getESuperTypes().add(this.getComponentDecl());
    appEClass.getESuperTypes().add(this.getComponentDecl());
    optionFeatureTypeEClass.getESuperTypes().add(this.getFeatureType());
    someFeatureTypeEClass.getESuperTypes().add(this.getFeatureType());
    noneFeatureTypeEClass.getESuperTypes().add(this.getFeatureType());
    eitherFeatureTypeEClass.getESuperTypes().add(this.getFeatureType());
    numNatConstraintEClass.getESuperTypes().add(this.getConstraintNat());
    anyNatConstraintEClass.getESuperTypes().add(this.getConstraintNat());
    binaryExpEClass.getESuperTypes().add(this.getExp());
    unaryExpEClass.getESuperTypes().add(this.getExp());
    primaryExpEClass.getESuperTypes().add(this.getExp());
    accessExpEClass.getESuperTypes().add(this.getExp());
    nameExpEClass.getESuperTypes().add(this.getPrimary());
    literalExpEClass.getESuperTypes().add(this.getPrimary());
    seqTypeEClass.getESuperTypes().add(this.getType());
    setTypeEClass.getESuperTypes().add(this.getType());
    tupleTypeEClass.getESuperTypes().add(this.getBaseType());
    optionTypeEClass.getESuperTypes().add(this.getBaseType());
    someTypeEClass.getESuperTypes().add(this.getBaseType());
    noneTypeEClass.getESuperTypes().add(this.getBaseType());
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
    initEReference(getComponentDecl_Devices(), this.getDevice(), null, "devices", null, 0, -1, ComponentDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDecl_Assigns(), this.getAssignment(), null, "assigns", null, 0, -1, ComponentDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDecl_Exp(), this.getExp(), null, "exp", null, 0, 1, ComponentDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDecl_Reports(), this.getReport(), null, "reports", null, 0, -1, ComponentDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberDeclEClass, MemberDecl.class, "MemberDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attrDeclEClass, AttrDecl.class, "AttrDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttrDecl_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, AttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrDecl_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, AttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttrDecl_Type(), this.getType(), null, "type", null, 0, 1, AttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttrDecl_Literal(), this.getLiteral(), null, "literal", null, 0, 1, AttrDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subMemberDeclEClass, SubMemberDecl.class, "SubMemberDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubMemberDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubMemberDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubMemberDecl_Type(), this.getFeatureType(), null, "type", null, 0, 1, SubMemberDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubMemberDecl_Members(), this.getMemberDecl(), null, "members", null, 0, -1, SubMemberDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Exp(), this.getExp(), null, "exp", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReport_Args(), this.getExp(), null, "args", null, 0, -1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureTypeEClass, FeatureType.class, "FeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(baseFeatureTypeEClass, BaseFeatureType.class, "BaseFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBaseFeatureType_Components(), this.getComponentDecl(), null, "components", null, 0, -1, BaseFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseFeatureType_Members(), this.getMemberDecl(), null, "members", null, 0, -1, BaseFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invariantDeclEClass, InvariantDecl.class, "InvariantDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInvariantDecl_InvName(), ecorePackage.getEString(), "invName", null, 0, 1, InvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicityInvariantDeclEClass, MultiplicityInvariantDecl.class, "MultiplicityInvariantDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicityInvariantDecl_Lo(), this.getConstraintNat(), null, "lo", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicityInvariantDecl_Hi(), this.getConstraintNat(), null, "hi", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicityInvariantDecl_Match(), this.getSubMemberMatch(), null, "match", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicityInvariantDecl_Type(), this.getComponentDecl(), null, "type", null, 0, 1, MultiplicityInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalInvariantDeclEClass, GeneralInvariantDecl.class, "GeneralInvariantDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneralInvariantDecl_Exp(), this.getExp(), null, "exp", null, 0, 1, GeneralInvariantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subMemberMatchEClass, SubMemberMatch.class, "SubMemberMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubMemberMatch_QNames(), ecorePackage.getEString(), "qNames", null, 0, -1, SubMemberMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubMemberMatch_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubMemberMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubMemberMatch_Any(), ecorePackage.getEString(), "any", null, 0, 1, SubMemberMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintNatEClass, ConstraintNat.class, "ConstraintNat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDevice_Components(), this.getComponentDecl(), null, "components", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_Constraint(), this.getConstraintExp(), null, "constraint", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintExpEClass, ConstraintExp.class, "ConstraintExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraintExp_Cond(), this.getExp(), null, "cond", null, 0, 1, ConstraintExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reportDeclEClass, ReportDecl.class, "ReportDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReportDecl_Params(), this.getParam(), null, "params", null, 0, -1, ReportDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReportDecl_Attrs(), this.getReportMemberDecl(), null, "attrs", null, 0, -1, ReportDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParam_Type(), this.getBaseFeatureType(), null, "type", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reportMemberDeclEClass, ReportMemberDecl.class, "ReportMemberDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReportMemberDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReportMemberDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReportMemberDecl_BindingName(), this.getAttrOrSubMember(), null, "bindingName", null, 0, -1, ReportMemberDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attrOrSubMemberEClass, AttrOrSubMember.class, "AttrOrSubMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expEClass, Exp.class, "Exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primaryEClass, Primary.class, "Primary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(baseTypeEClass, BaseType.class, "BaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBaseType_Type(), this.getTypeDecl(), null, "type", null, 0, 1, BaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicLiteralEClass, BasicLiteral.class, "BasicLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicLiteral_TypeCons(), this.getTypeDecl(), null, "typeCons", null, 0, 1, BasicLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBasicLiteral_Lit(), ecorePackage.getEString(), "lit", null, 0, 1, BasicLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleLiteralEClass, TupleLiteral.class, "TupleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleLiteral_Elems(), this.getLiteral(), null, "elems", null, 0, -1, TupleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(seqLiteralEClass, SeqLiteral.class, "SeqLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSeqLiteral_BasicType(), this.getBaseType(), null, "basicType", null, 0, 1, SeqLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSeqLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SeqLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setLiteralEClass, SetLiteral.class, "SetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetLiteral_BasicType(), this.getBaseType(), null, "basicType", null, 0, 1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionLiteralEClass, OptionLiteral.class, "OptionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleLiteralEClass, SimpleLiteral.class, "SimpleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleBasicLiteralEClass, SimpleBasicLiteral.class, "SimpleBasicLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleBasicLiteral_Lit(), ecorePackage.getEString(), "lit", null, 0, 1, SimpleBasicLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleTupleLiteralEClass, SimpleTupleLiteral.class, "SimpleTupleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleTupleLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SimpleTupleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleOptionLiteralEClass, SimpleOptionLiteral.class, "SimpleOptionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleSeqLiteralEClass, SimpleSeqLiteral.class, "SimpleSeqLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleSeqLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SimpleSeqLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleSetLiteralEClass, SimpleSetLiteral.class, "SimpleSetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleSetLiteral_Elems(), this.getSimpleLiteral(), null, "elems", null, 0, -1, SimpleSetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(appEClass, App.class, "App", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionFeatureTypeEClass, OptionFeatureType.class, "OptionFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionFeatureType_Base(), this.getBaseFeatureType(), null, "base", null, 0, 1, OptionFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(someFeatureTypeEClass, SomeFeatureType.class, "SomeFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSomeFeatureType_Base(), this.getBaseFeatureType(), null, "base", null, 0, 1, SomeFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSomeFeatureType_Members(), this.getMemberDecl(), null, "members", null, 0, -1, SomeFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noneFeatureTypeEClass, NoneFeatureType.class, "NoneFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNoneFeatureType_Base(), this.getBaseFeatureType(), null, "base", null, 0, 1, NoneFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eitherFeatureTypeEClass, EitherFeatureType.class, "EitherFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEitherFeatureType_Bases(), this.getBaseFeatureType(), null, "bases", null, 0, -1, EitherFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEitherFeatureType_Choice(), ecorePackage.getEString(), "choice", null, 0, 1, EitherFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEitherFeatureType_Members(), this.getMemberDecl(), null, "members", null, 0, -1, EitherFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numNatConstraintEClass, NumNatConstraint.class, "NumNatConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumNatConstraint_Num(), ecorePackage.getEString(), "num", null, 0, 1, NumNatConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyNatConstraintEClass, AnyNatConstraint.class, "AnyNatConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binaryExpEClass, BinaryExp.class, "BinaryExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryExp_Left(), this.getExp(), null, "left", null, 0, 1, BinaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryExp_Op(), ecorePackage.getEString(), "op", null, 0, 1, BinaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryExp_Right(), this.getExp(), null, "right", null, 0, 1, BinaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpEClass, UnaryExp.class, "UnaryExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExp_Op(), ecorePackage.getEString(), "op", null, 0, 1, UnaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExp_Arg(), this.getExp(), null, "arg", null, 0, 1, UnaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpEClass, PrimaryExp.class, "PrimaryExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryExp_Primary(), this.getPrimary(), null, "primary", null, 0, 1, PrimaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accessExpEClass, AccessExp.class, "AccessExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccessExp_Base(), this.getPrimaryExp(), null, "base", null, 0, 1, AccessExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessExp_Name(), this.getAttrOrSubMember(), null, "name", null, 0, 1, AccessExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameExpEClass, NameExp.class, "NameExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameExp_Id(), ecorePackage.getEString(), "id", null, 0, 1, NameExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalExpEClass, LiteralExp.class, "LiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralExp_Lit(), this.getBasicLiteral(), null, "lit", null, 0, 1, LiteralExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(seqTypeEClass, SeqType.class, "SeqType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSeqType_Base(), this.getType(), null, "base", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetType_Base(), this.getType(), null, "base", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleType_ElemTypes(), this.getType(), null, "elemTypes", null, 0, -1, TupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionTypeEClass, OptionType.class, "OptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionType_Base(), this.getType(), null, "base", null, 0, 1, OptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(someTypeEClass, SomeType.class, "SomeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSomeType_Base(), this.getType(), null, "base", null, 0, 1, SomeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noneTypeEClass, NoneType.class, "NoneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNoneType_Base(), this.getType(), null, "base", null, 0, 1, NoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
