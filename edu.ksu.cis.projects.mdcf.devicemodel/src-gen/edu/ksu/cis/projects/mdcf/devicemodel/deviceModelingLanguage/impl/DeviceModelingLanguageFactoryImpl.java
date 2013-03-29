/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Accessor;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.App;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintNat;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguageFactory;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Exp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariant;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Modifier;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp;
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
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType;
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
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Val;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Var;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceModelingLanguageFactoryImpl extends EFactoryImpl implements DeviceModelingLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeviceModelingLanguageFactory init()
  {
    try
    {
      DeviceModelingLanguageFactory theDeviceModelingLanguageFactory = (DeviceModelingLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://http://mdcf.santos.cis.ksu.edu/devicemodel/DeviceModelingLanguage"); 
      if (theDeviceModelingLanguageFactory != null)
      {
        return theDeviceModelingLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeviceModelingLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceModelingLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DeviceModelingLanguagePackage.MODEL: return createModel();
      case DeviceModelingLanguagePackage.DECL: return createDecl();
      case DeviceModelingLanguagePackage.TYPE_DECL: return createTypeDecl();
      case DeviceModelingLanguagePackage.COMPONENT_DECL: return createComponentDecl();
      case DeviceModelingLanguagePackage.MEMBER_DECL: return createMemberDecl();
      case DeviceModelingLanguagePackage.ATTR_DECL: return createAttrDecl();
      case DeviceModelingLanguagePackage.MODIFIER: return createModifier();
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL: return createSubMemberDecl();
      case DeviceModelingLanguagePackage.ASSIGNMENT: return createAssignment();
      case DeviceModelingLanguagePackage.REPORT: return createReport();
      case DeviceModelingLanguagePackage.FEATURE_TYPE: return createFeatureType();
      case DeviceModelingLanguagePackage.BASE_FEATURE_TYPE: return createBaseFeatureType();
      case DeviceModelingLanguagePackage.INVARIANT_DECL: return createInvariantDecl();
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT: return createMultiplicityInvariant();
      case DeviceModelingLanguagePackage.GENERAL_INVARIANT: return createGeneralInvariant();
      case DeviceModelingLanguagePackage.SUB_MEMBER_MATCH: return createSubMemberMatch();
      case DeviceModelingLanguagePackage.CONSTRAINT_NAT: return createConstraintNat();
      case DeviceModelingLanguagePackage.DEVICE: return createDevice();
      case DeviceModelingLanguagePackage.CONSTRAINT_EXP: return createConstraintExp();
      case DeviceModelingLanguagePackage.PARAM: return createParam();
      case DeviceModelingLanguagePackage.REPORT_MEMBER_DECL: return createReportMemberDecl();
      case DeviceModelingLanguagePackage.ACCESSOR: return createAccessor();
      case DeviceModelingLanguagePackage.EXP: return createExp();
      case DeviceModelingLanguagePackage.PRIMARY: return createPrimary();
      case DeviceModelingLanguagePackage.TYPE: return createType();
      case DeviceModelingLanguagePackage.BASE_TYPE: return createBaseType();
      case DeviceModelingLanguagePackage.LITERAL: return createLiteral();
      case DeviceModelingLanguagePackage.BASIC_LITERAL: return createBasicLiteral();
      case DeviceModelingLanguagePackage.TUPLE_LITERAL: return createTupleLiteral();
      case DeviceModelingLanguagePackage.SEQ_LITERAL: return createSeqLiteral();
      case DeviceModelingLanguagePackage.SET_LITERAL: return createSetLiteral();
      case DeviceModelingLanguagePackage.OPTION_LITERAL: return createOptionLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_LITERAL: return createSimpleLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_BASIC_LITERAL: return createSimpleBasicLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_TUPLE_LITERAL: return createSimpleTupleLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_OPTION_LITERAL: return createSimpleOptionLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_SEQ_LITERAL: return createSimpleSeqLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_SET_LITERAL: return createSimpleSetLiteral();
      case DeviceModelingLanguagePackage.COMPONENT: return createComponent();
      case DeviceModelingLanguagePackage.APP: return createApp();
      case DeviceModelingLanguagePackage.CONST: return createConst();
      case DeviceModelingLanguagePackage.VAL: return createVal();
      case DeviceModelingLanguagePackage.VAR: return createVar();
      case DeviceModelingLanguagePackage.OVERRIDE: return createOverride();
      case DeviceModelingLanguagePackage.OPTION_FEATURE_TYPE: return createOptionFeatureType();
      case DeviceModelingLanguagePackage.SOME_FEATURE_TYPE: return createSomeFeatureType();
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE: return createEitherFeatureType();
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE: return createSeqFeatureType();
      case DeviceModelingLanguagePackage.SET_FEATURE_TYPE: return createSetFeatureType();
      case DeviceModelingLanguagePackage.NUM_NAT_CONSTRAINT: return createNumNatConstraint();
      case DeviceModelingLanguagePackage.ANY_NAT_CONSTRAINT: return createAnyNatConstraint();
      case DeviceModelingLanguagePackage.BINARY_EXP: return createBinaryExp();
      case DeviceModelingLanguagePackage.UNARY_EXP: return createUnaryExp();
      case DeviceModelingLanguagePackage.PRIMARY_EXP: return createPrimaryExp();
      case DeviceModelingLanguagePackage.ACCESS_EXP: return createAccessExp();
      case DeviceModelingLanguagePackage.NAME_EXP: return createNameExp();
      case DeviceModelingLanguagePackage.LITERAL_EXP: return createLiteralExp();
      case DeviceModelingLanguagePackage.SEQ_TYPE: return createSeqType();
      case DeviceModelingLanguagePackage.SET_TYPE: return createSetType();
      case DeviceModelingLanguagePackage.TUPLE_TYPE: return createTupleType();
      case DeviceModelingLanguagePackage.OPTION_TYPE: return createOptionType();
      case DeviceModelingLanguagePackage.SOME_TYPE: return createSomeType();
      case DeviceModelingLanguagePackage.NONE_TYPE: return createNoneType();
      case DeviceModelingLanguagePackage.NONE_LITERAL: return createNoneLiteral();
      case DeviceModelingLanguagePackage.SOME_LITERAL: return createSomeLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_NONE_LITERAL: return createSimpleNoneLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_SOME_LITERAL: return createSimpleSomeLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl createDecl()
  {
    DeclImpl decl = new DeclImpl();
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl createTypeDecl()
  {
    TypeDeclImpl typeDecl = new TypeDeclImpl();
    return typeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDecl createComponentDecl()
  {
    ComponentDeclImpl componentDecl = new ComponentDeclImpl();
    return componentDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberDecl createMemberDecl()
  {
    MemberDeclImpl memberDecl = new MemberDeclImpl();
    return memberDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrDecl createAttrDecl()
  {
    AttrDeclImpl attrDecl = new AttrDeclImpl();
    return attrDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier createModifier()
  {
    ModifierImpl modifier = new ModifierImpl();
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubMemberDecl createSubMemberDecl()
  {
    SubMemberDeclImpl subMemberDecl = new SubMemberDeclImpl();
    return subMemberDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report createReport()
  {
    ReportImpl report = new ReportImpl();
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureType createFeatureType()
  {
    FeatureTypeImpl featureType = new FeatureTypeImpl();
    return featureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseFeatureType createBaseFeatureType()
  {
    BaseFeatureTypeImpl baseFeatureType = new BaseFeatureTypeImpl();
    return baseFeatureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvariantDecl createInvariantDecl()
  {
    InvariantDeclImpl invariantDecl = new InvariantDeclImpl();
    return invariantDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicityInvariant createMultiplicityInvariant()
  {
    MultiplicityInvariantImpl multiplicityInvariant = new MultiplicityInvariantImpl();
    return multiplicityInvariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralInvariant createGeneralInvariant()
  {
    GeneralInvariantImpl generalInvariant = new GeneralInvariantImpl();
    return generalInvariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubMemberMatch createSubMemberMatch()
  {
    SubMemberMatchImpl subMemberMatch = new SubMemberMatchImpl();
    return subMemberMatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintNat createConstraintNat()
  {
    ConstraintNatImpl constraintNat = new ConstraintNatImpl();
    return constraintNat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintExp createConstraintExp()
  {
    ConstraintExpImpl constraintExp = new ConstraintExpImpl();
    return constraintExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportMemberDecl createReportMemberDecl()
  {
    ReportMemberDeclImpl reportMemberDecl = new ReportMemberDeclImpl();
    return reportMemberDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accessor createAccessor()
  {
    AccessorImpl accessor = new AccessorImpl();
    return accessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseType createBaseType()
  {
    BaseTypeImpl baseType = new BaseTypeImpl();
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicLiteral createBasicLiteral()
  {
    BasicLiteralImpl basicLiteral = new BasicLiteralImpl();
    return basicLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleLiteral createTupleLiteral()
  {
    TupleLiteralImpl tupleLiteral = new TupleLiteralImpl();
    return tupleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqLiteral createSeqLiteral()
  {
    SeqLiteralImpl seqLiteral = new SeqLiteralImpl();
    return seqLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetLiteral createSetLiteral()
  {
    SetLiteralImpl setLiteral = new SetLiteralImpl();
    return setLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionLiteral createOptionLiteral()
  {
    OptionLiteralImpl optionLiteral = new OptionLiteralImpl();
    return optionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral createSimpleLiteral()
  {
    SimpleLiteralImpl simpleLiteral = new SimpleLiteralImpl();
    return simpleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleBasicLiteral createSimpleBasicLiteral()
  {
    SimpleBasicLiteralImpl simpleBasicLiteral = new SimpleBasicLiteralImpl();
    return simpleBasicLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleTupleLiteral createSimpleTupleLiteral()
  {
    SimpleTupleLiteralImpl simpleTupleLiteral = new SimpleTupleLiteralImpl();
    return simpleTupleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleOptionLiteral createSimpleOptionLiteral()
  {
    SimpleOptionLiteralImpl simpleOptionLiteral = new SimpleOptionLiteralImpl();
    return simpleOptionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSeqLiteral createSimpleSeqLiteral()
  {
    SimpleSeqLiteralImpl simpleSeqLiteral = new SimpleSeqLiteralImpl();
    return simpleSeqLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSetLiteral createSimpleSetLiteral()
  {
    SimpleSetLiteralImpl simpleSetLiteral = new SimpleSetLiteralImpl();
    return simpleSetLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public App createApp()
  {
    AppImpl app = new AppImpl();
    return app;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Const createConst()
  {
    ConstImpl const_ = new ConstImpl();
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Val createVal()
  {
    ValImpl val = new ValImpl();
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Override createOverride()
  {
    OverrideImpl override = new OverrideImpl();
    return override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionFeatureType createOptionFeatureType()
  {
    OptionFeatureTypeImpl optionFeatureType = new OptionFeatureTypeImpl();
    return optionFeatureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeFeatureType createSomeFeatureType()
  {
    SomeFeatureTypeImpl someFeatureType = new SomeFeatureTypeImpl();
    return someFeatureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EitherFeatureType createEitherFeatureType()
  {
    EitherFeatureTypeImpl eitherFeatureType = new EitherFeatureTypeImpl();
    return eitherFeatureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqFeatureType createSeqFeatureType()
  {
    SeqFeatureTypeImpl seqFeatureType = new SeqFeatureTypeImpl();
    return seqFeatureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetFeatureType createSetFeatureType()
  {
    SetFeatureTypeImpl setFeatureType = new SetFeatureTypeImpl();
    return setFeatureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumNatConstraint createNumNatConstraint()
  {
    NumNatConstraintImpl numNatConstraint = new NumNatConstraintImpl();
    return numNatConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyNatConstraint createAnyNatConstraint()
  {
    AnyNatConstraintImpl anyNatConstraint = new AnyNatConstraintImpl();
    return anyNatConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExp createBinaryExp()
  {
    BinaryExpImpl binaryExp = new BinaryExpImpl();
    return binaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExp createUnaryExp()
  {
    UnaryExpImpl unaryExp = new UnaryExpImpl();
    return unaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExp createPrimaryExp()
  {
    PrimaryExpImpl primaryExp = new PrimaryExpImpl();
    return primaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessExp createAccessExp()
  {
    AccessExpImpl accessExp = new AccessExpImpl();
    return accessExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExp createNameExp()
  {
    NameExpImpl nameExp = new NameExpImpl();
    return nameExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExp createLiteralExp()
  {
    LiteralExpImpl literalExp = new LiteralExpImpl();
    return literalExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqType createSeqType()
  {
    SeqTypeImpl seqType = new SeqTypeImpl();
    return seqType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetType createSetType()
  {
    SetTypeImpl setType = new SetTypeImpl();
    return setType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleType createTupleType()
  {
    TupleTypeImpl tupleType = new TupleTypeImpl();
    return tupleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionType createOptionType()
  {
    OptionTypeImpl optionType = new OptionTypeImpl();
    return optionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeType createSomeType()
  {
    SomeTypeImpl someType = new SomeTypeImpl();
    return someType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoneType createNoneType()
  {
    NoneTypeImpl noneType = new NoneTypeImpl();
    return noneType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoneLiteral createNoneLiteral()
  {
    NoneLiteralImpl noneLiteral = new NoneLiteralImpl();
    return noneLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeLiteral createSomeLiteral()
  {
    SomeLiteralImpl someLiteral = new SomeLiteralImpl();
    return someLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleNoneLiteral createSimpleNoneLiteral()
  {
    SimpleNoneLiteralImpl simpleNoneLiteral = new SimpleNoneLiteralImpl();
    return simpleNoneLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSomeLiteral createSimpleSomeLiteral()
  {
    SimpleSomeLiteralImpl simpleSomeLiteral = new SimpleSomeLiteralImpl();
    return simpleSomeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceModelingLanguagePackage getDeviceModelingLanguagePackage()
  {
    return (DeviceModelingLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DeviceModelingLanguagePackage getPackage()
  {
    return DeviceModelingLanguagePackage.eINSTANCE;
  }

} //DeviceModelingLanguageFactoryImpl
