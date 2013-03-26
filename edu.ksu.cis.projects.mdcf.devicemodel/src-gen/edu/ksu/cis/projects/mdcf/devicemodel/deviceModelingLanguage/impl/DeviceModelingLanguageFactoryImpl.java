/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.*;

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
      case DeviceModelingLanguagePackage.ASSIGNMENT: return createAssignment();
      case DeviceModelingLanguagePackage.MEMBER_DECL: return createMemberDecl();
      case DeviceModelingLanguagePackage.ATTR_DECL: return createAttrDecl();
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL: return createSubMemberDecl();
      case DeviceModelingLanguagePackage.FEATURE_TYPE: return createFeatureType();
      case DeviceModelingLanguagePackage.BASE_FEATURE_TYPE: return createBaseFeatureType();
      case DeviceModelingLanguagePackage.INVARIANT_DECL: return createInvariantDecl();
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT_DECL: return createMultiplicityInvariantDecl();
      case DeviceModelingLanguagePackage.GENERAL_INVARIANT_DECL: return createGeneralInvariantDecl();
      case DeviceModelingLanguagePackage.SUB_MEMBER_MATCH: return createSubMemberMatch();
      case DeviceModelingLanguagePackage.CONSTRAINT_NAT: return createConstraintNat();
      case DeviceModelingLanguagePackage.DEVICE: return createDevice();
      case DeviceModelingLanguagePackage.CONSTRAINT_EXP: return createConstraintExp();
      case DeviceModelingLanguagePackage.ATTR_OR_SUB_MEMBER: return createAttrOrSubMember();
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
      case DeviceModelingLanguagePackage.OPTION_FEATURE_TYPE: return createOptionFeatureType();
      case DeviceModelingLanguagePackage.SOME_FEATURE_TYPE: return createSomeFeatureType();
      case DeviceModelingLanguagePackage.NONE_FEATURE_TYPE: return createNoneFeatureType();
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE: return createEitherFeatureType();
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
  public MultiplicityInvariantDecl createMultiplicityInvariantDecl()
  {
    MultiplicityInvariantDeclImpl multiplicityInvariantDecl = new MultiplicityInvariantDeclImpl();
    return multiplicityInvariantDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralInvariantDecl createGeneralInvariantDecl()
  {
    GeneralInvariantDeclImpl generalInvariantDecl = new GeneralInvariantDeclImpl();
    return generalInvariantDecl;
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
  public AttrOrSubMember createAttrOrSubMember()
  {
    AttrOrSubMemberImpl attrOrSubMember = new AttrOrSubMemberImpl();
    return attrOrSubMember;
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
  public NoneFeatureType createNoneFeatureType()
  {
    NoneFeatureTypeImpl noneFeatureType = new NoneFeatureTypeImpl();
    return noneFeatureType;
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
