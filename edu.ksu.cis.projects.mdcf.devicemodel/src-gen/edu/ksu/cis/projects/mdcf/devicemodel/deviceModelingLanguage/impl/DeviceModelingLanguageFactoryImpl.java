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
      case DeviceModelingLanguagePackage.FEATURES_DECL: return createFeaturesDecl();
      case DeviceModelingLanguagePackage.FEATURES_BODY: return createFeaturesBody();
      case DeviceModelingLanguagePackage.FEATURE_DECL: return createFeatureDecl();
      case DeviceModelingLanguagePackage.INVARIANT_DECL: return createInvariantDecl();
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT_DECL: return createMultiplicityInvariantDecl();
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH: return createSubFeaturesMatch();
      case DeviceModelingLanguagePackage.CONSTRAINT_NAT: return createConstraintNat();
      case DeviceModelingLanguagePackage.ATTR_DECL: return createAttrDecl();
      case DeviceModelingLanguagePackage.TYPE: return createType();
      case DeviceModelingLanguagePackage.LITERAL: return createLiteral();
      case DeviceModelingLanguagePackage.BASIC_LITERAL: return createBasicLiteral();
      case DeviceModelingLanguagePackage.TUPLE_LITERAL: return createTupleLiteral();
      case DeviceModelingLanguagePackage.LIST_LITERAL: return createListLiteral();
      case DeviceModelingLanguagePackage.SET_LITERAL: return createSetLiteral();
      case DeviceModelingLanguagePackage.OPTION_LITERAL: return createOptionLiteral();
      case DeviceModelingLanguagePackage.ELITERAL: return createELiteral();
      case DeviceModelingLanguagePackage.SUB_FEATURES_DECL: return createSubFeaturesDecl();
      case DeviceModelingLanguagePackage.SUB_FEATURES_TYPE: return createSubFeaturesType();
      case DeviceModelingLanguagePackage.NUM_NAT_CONSTRAINT: return createNumNatConstraint();
      case DeviceModelingLanguagePackage.ANY_NAT_CONSTRAINT: return createAnyNatConstraint();
      case DeviceModelingLanguagePackage.BASIC_TYPE: return createBasicType();
      case DeviceModelingLanguagePackage.LIST_TYPE: return createListType();
      case DeviceModelingLanguagePackage.SET_TYPE: return createSetType();
      case DeviceModelingLanguagePackage.TUPLE_TYPE: return createTupleType();
      case DeviceModelingLanguagePackage.OPTION_TYPE: return createOptionType();
      case DeviceModelingLanguagePackage.NONE_LITERAL: return createNoneLiteral();
      case DeviceModelingLanguagePackage.SOME_LITERAL: return createSomeLiteral();
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_REF: return createSubGroupTypeRef();
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON: return createSubGroupTypeAnon();
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
  public FeaturesDecl createFeaturesDecl()
  {
    FeaturesDeclImpl featuresDecl = new FeaturesDeclImpl();
    return featuresDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeaturesBody createFeaturesBody()
  {
    FeaturesBodyImpl featuresBody = new FeaturesBodyImpl();
    return featuresBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureDecl createFeatureDecl()
  {
    FeatureDeclImpl featureDecl = new FeatureDeclImpl();
    return featureDecl;
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
  public SubFeaturesMatch createSubFeaturesMatch()
  {
    SubFeaturesMatchImpl subFeaturesMatch = new SubFeaturesMatchImpl();
    return subFeaturesMatch;
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
  public ELiteral createELiteral()
  {
    ELiteralImpl eLiteral = new ELiteralImpl();
    return eLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubFeaturesDecl createSubFeaturesDecl()
  {
    SubFeaturesDeclImpl subFeaturesDecl = new SubFeaturesDeclImpl();
    return subFeaturesDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubFeaturesType createSubFeaturesType()
  {
    SubFeaturesTypeImpl subFeaturesType = new SubFeaturesTypeImpl();
    return subFeaturesType;
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
  public SubGroupTypeRef createSubGroupTypeRef()
  {
    SubGroupTypeRefImpl subGroupTypeRef = new SubGroupTypeRefImpl();
    return subGroupTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubGroupTypeAnon createSubGroupTypeAnon()
  {
    SubGroupTypeAnonImpl subGroupTypeAnon = new SubGroupTypeAnonImpl();
    return subGroupTypeAnon;
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
