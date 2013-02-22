/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.util;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage
 * @generated
 */
public class DeviceModelingLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DeviceModelingLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceModelingLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DeviceModelingLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceModelingLanguageSwitch<Adapter> modelSwitch =
    new DeviceModelingLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDecl(Decl object)
      {
        return createDeclAdapter();
      }
      @Override
      public Adapter caseFeatureGroupBody(FeatureGroupBody object)
      {
        return createFeatureGroupBodyAdapter();
      }
      @Override
      public Adapter caseGroupElementDecl(GroupElementDecl object)
      {
        return createGroupElementDeclAdapter();
      }
      @Override
      public Adapter caseGroupAttrDecl(GroupAttrDecl object)
      {
        return createGroupAttrDeclAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseBasicLiteral(BasicLiteral object)
      {
        return createBasicLiteralAdapter();
      }
      @Override
      public Adapter caseTupleLiteral(TupleLiteral object)
      {
        return createTupleLiteralAdapter();
      }
      @Override
      public Adapter caseListLiteral(ListLiteral object)
      {
        return createListLiteralAdapter();
      }
      @Override
      public Adapter caseSetLiteral(SetLiteral object)
      {
        return createSetLiteralAdapter();
      }
      @Override
      public Adapter caseELiteral(ELiteral object)
      {
        return createELiteralAdapter();
      }
      @Override
      public Adapter caseSubGroupDecl(SubGroupDecl object)
      {
        return createSubGroupDeclAdapter();
      }
      @Override
      public Adapter caseSubGroupType(SubGroupType object)
      {
        return createSubGroupTypeAdapter();
      }
      @Override
      public Adapter caseTypeDecl(TypeDecl object)
      {
        return createTypeDeclAdapter();
      }
      @Override
      public Adapter caseFeatureGroupDecl(FeatureGroupDecl object)
      {
        return createFeatureGroupDeclAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseListType(ListType object)
      {
        return createListTypeAdapter();
      }
      @Override
      public Adapter caseSetType(SetType object)
      {
        return createSetTypeAdapter();
      }
      @Override
      public Adapter caseTupleType(TupleType object)
      {
        return createTupleTypeAdapter();
      }
      @Override
      public Adapter caseSubGroupTypeRef(SubGroupTypeRef object)
      {
        return createSubGroupTypeRefAdapter();
      }
      @Override
      public Adapter caseSubGroupTypeAnon(SubGroupTypeAnon object)
      {
        return createSubGroupTypeAnonAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl
   * @generated
   */
  public Adapter createDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody <em>Feature Group Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody
   * @generated
   */
  public Adapter createFeatureGroupBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupElementDecl <em>Group Element Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupElementDecl
   * @generated
   */
  public Adapter createGroupElementDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl <em>Group Attr Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl
   * @generated
   */
  public Adapter createGroupAttrDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral <em>Basic Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral
   * @generated
   */
  public Adapter createBasicLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral <em>Tuple Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral
   * @generated
   */
  public Adapter createTupleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral <em>List Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral
   * @generated
   */
  public Adapter createListLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral <em>Set Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral
   * @generated
   */
  public Adapter createSetLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral <em>ELiteral</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral
   * @generated
   */
  public Adapter createELiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl <em>Sub Group Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl
   * @generated
   */
  public Adapter createSubGroupDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupType <em>Sub Group Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupType
   * @generated
   */
  public Adapter createSubGroupTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl
   * @generated
   */
  public Adapter createTypeDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl <em>Feature Group Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl
   * @generated
   */
  public Adapter createFeatureGroupDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType
   * @generated
   */
  public Adapter createListTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType <em>Set Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType
   * @generated
   */
  public Adapter createSetTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType <em>Tuple Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType
   * @generated
   */
  public Adapter createTupleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeRef <em>Sub Group Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeRef
   * @generated
   */
  public Adapter createSubGroupTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon <em>Sub Group Type Anon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon
   * @generated
   */
  public Adapter createSubGroupTypeAnonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DeviceModelingLanguageAdapterFactory
