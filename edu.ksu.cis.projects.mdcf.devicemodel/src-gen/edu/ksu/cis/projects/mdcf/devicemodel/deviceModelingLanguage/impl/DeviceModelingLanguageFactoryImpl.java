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
      DeviceModelingLanguageFactory theDeviceModelingLanguageFactory = (DeviceModelingLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://mdcf.projects.cis.ksu.edu/devicemodel/DeviceModelingLanguage"); 
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
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL: return createSubMemberDecl();
      case DeviceModelingLanguagePackage.INVARIANT_DECL: return createInvariantDecl();
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT_DECL: return createMultiplicityInvariantDecl();
      case DeviceModelingLanguagePackage.SUB_MEMBER_MATCH: return createSubMemberMatch();
      case DeviceModelingLanguagePackage.CONSTRAINT_NAT: return createConstraintNat();
      case DeviceModelingLanguagePackage.DEVICE: return createDevice();
      case DeviceModelingLanguagePackage.TYPE: return createType();
      case DeviceModelingLanguagePackage.BASIC_TYPE: return createBasicType();
      case DeviceModelingLanguagePackage.LITERAL: return createLiteral();
      case DeviceModelingLanguagePackage.BASIC_LITERAL: return createBasicLiteral();
      case DeviceModelingLanguagePackage.TUPLE_LITERAL: return createTupleLiteral();
      case DeviceModelingLanguagePackage.LIST_LITERAL: return createListLiteral();
      case DeviceModelingLanguagePackage.SET_LITERAL: return createSetLiteral();
      case DeviceModelingLanguagePackage.OPTION_LITERAL: return createOptionLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_LITERAL: return createSimpleLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_BASIC_LITERAL: return createSimpleBasicLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_TUPLE_LITERAL: return createSimpleTupleLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_OPTION_LITERAL: return createSimpleOptionLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_LIST_LITERAL: return createSimpleListLiteral();
      case DeviceModelingLanguagePackage.SIMPLE_SET_LITERAL: return createSimpleSetLiteral();
      case DeviceModelingLanguagePackage.COMPONENT: return createComponent();
      case DeviceModelingLanguagePackage.INSTANCE: return createInstance();
      case DeviceModelingLanguagePackage.APP: return createApp();
      case DeviceModelingLanguagePackage.NUM_NAT_CONSTRAINT: return createNumNatConstraint();
      case DeviceModelingLanguagePackage.ANY_NAT_CONSTRAINT: return createAnyNatConstraint();
      case DeviceModelingLanguagePackage.LIST_TYPE: return createListType();
      case DeviceModelingLanguagePackage.SET_TYPE: return createSetType();
      case DeviceModelingLanguagePackage.OPTION_TYPE: return createOptionType();
      case DeviceModelingLanguagePackage.SOME_TYPE: return createSomeType();
      case DeviceModelingLanguagePackage.NONE_TYPE: return createNoneType();
      case DeviceModelingLanguagePackage.TUPLE_TYPE: return createTupleType();
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
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
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
  public ListLiteral createListLiteral()
  {
    ListLiteralImpl listLiteral = new ListLiteralImpl();
    return listLiteral;
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
  public SimpleListLiteral createSimpleListLiteral()
  {
    SimpleListLiteralImpl simpleListLiteral = new SimpleListLiteralImpl();
    return simpleListLiteral;
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
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
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
  public ListType createListType()
  {
    ListTypeImpl listType = new ListTypeImpl();
    return listType;
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
