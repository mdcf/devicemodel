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
      case DeviceModelingLanguagePackage.FEATURE_GROUP_BODY: return createFeatureGroupBody();
      case DeviceModelingLanguagePackage.GROUP_ELEMENT_DECL: return createGroupElementDecl();
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL: return createGroupAttrDecl();
      case DeviceModelingLanguagePackage.TYPE: return createType();
      case DeviceModelingLanguagePackage.LITERAL: return createLiteral();
      case DeviceModelingLanguagePackage.BASIC_LITERAL: return createBasicLiteral();
      case DeviceModelingLanguagePackage.TUPLE_LITERAL: return createTupleLiteral();
      case DeviceModelingLanguagePackage.LIST_LITERAL: return createListLiteral();
      case DeviceModelingLanguagePackage.SET_LITERAL: return createSetLiteral();
      case DeviceModelingLanguagePackage.ELITERAL: return createELiteral();
      case DeviceModelingLanguagePackage.SUB_GROUP_DECL: return createSubGroupDecl();
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE: return createSubGroupType();
      case DeviceModelingLanguagePackage.TYPE_DECL: return createTypeDecl();
      case DeviceModelingLanguagePackage.FEATURE_GROUP_DECL: return createFeatureGroupDecl();
      case DeviceModelingLanguagePackage.BASIC_TYPE: return createBasicType();
      case DeviceModelingLanguagePackage.LIST_TYPE: return createListType();
      case DeviceModelingLanguagePackage.SET_TYPE: return createSetType();
      case DeviceModelingLanguagePackage.TUPLE_TYPE: return createTupleType();
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
  public FeatureGroupBody createFeatureGroupBody()
  {
    FeatureGroupBodyImpl featureGroupBody = new FeatureGroupBodyImpl();
    return featureGroupBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupElementDecl createGroupElementDecl()
  {
    GroupElementDeclImpl groupElementDecl = new GroupElementDeclImpl();
    return groupElementDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupAttrDecl createGroupAttrDecl()
  {
    GroupAttrDeclImpl groupAttrDecl = new GroupAttrDeclImpl();
    return groupAttrDecl;
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
  public SubGroupDecl createSubGroupDecl()
  {
    SubGroupDeclImpl subGroupDecl = new SubGroupDeclImpl();
    return subGroupDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubGroupType createSubGroupType()
  {
    SubGroupTypeImpl subGroupType = new SubGroupTypeImpl();
    return subGroupType;
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
  public FeatureGroupDecl createFeatureGroupDecl()
  {
    FeatureGroupDeclImpl featureGroupDecl = new FeatureGroupDeclImpl();
    return featureGroupDecl;
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
