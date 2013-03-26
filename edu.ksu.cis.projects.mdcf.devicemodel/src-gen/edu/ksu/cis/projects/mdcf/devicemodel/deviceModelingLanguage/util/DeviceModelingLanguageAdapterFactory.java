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
      public Adapter caseTypeDecl(TypeDecl object)
      {
        return createTypeDeclAdapter();
      }
      @Override
      public Adapter caseComponentDecl(ComponentDecl object)
      {
        return createComponentDeclAdapter();
      }
      @Override
      public Adapter caseMemberDecl(MemberDecl object)
      {
        return createMemberDeclAdapter();
      }
      @Override
      public Adapter caseAttrDecl(AttrDecl object)
      {
        return createAttrDeclAdapter();
      }
      @Override
      public Adapter caseSubMemberDecl(SubMemberDecl object)
      {
        return createSubMemberDeclAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseReport(Report object)
      {
        return createReportAdapter();
      }
      @Override
      public Adapter caseFeatureType(FeatureType object)
      {
        return createFeatureTypeAdapter();
      }
      @Override
      public Adapter caseBaseFeatureType(BaseFeatureType object)
      {
        return createBaseFeatureTypeAdapter();
      }
      @Override
      public Adapter caseInvariantDecl(InvariantDecl object)
      {
        return createInvariantDeclAdapter();
      }
      @Override
      public Adapter caseMultiplicityInvariant(MultiplicityInvariant object)
      {
        return createMultiplicityInvariantAdapter();
      }
      @Override
      public Adapter caseGeneralInvariant(GeneralInvariant object)
      {
        return createGeneralInvariantAdapter();
      }
      @Override
      public Adapter caseSubMemberMatch(SubMemberMatch object)
      {
        return createSubMemberMatchAdapter();
      }
      @Override
      public Adapter caseConstraintNat(ConstraintNat object)
      {
        return createConstraintNatAdapter();
      }
      @Override
      public Adapter caseDevice(Device object)
      {
        return createDeviceAdapter();
      }
      @Override
      public Adapter caseConstraintExp(ConstraintExp object)
      {
        return createConstraintExpAdapter();
      }
      @Override
      public Adapter caseReportDecl(ReportDecl object)
      {
        return createReportDeclAdapter();
      }
      @Override
      public Adapter caseParam(Param object)
      {
        return createParamAdapter();
      }
      @Override
      public Adapter caseReportMemberDecl(ReportMemberDecl object)
      {
        return createReportMemberDeclAdapter();
      }
      @Override
      public Adapter caseAttrOrSubMember(AttrOrSubMember object)
      {
        return createAttrOrSubMemberAdapter();
      }
      @Override
      public Adapter caseExp(Exp object)
      {
        return createExpAdapter();
      }
      @Override
      public Adapter casePrimary(Primary object)
      {
        return createPrimaryAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseBaseType(BaseType object)
      {
        return createBaseTypeAdapter();
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
      public Adapter caseSeqLiteral(SeqLiteral object)
      {
        return createSeqLiteralAdapter();
      }
      @Override
      public Adapter caseSetLiteral(SetLiteral object)
      {
        return createSetLiteralAdapter();
      }
      @Override
      public Adapter caseOptionLiteral(OptionLiteral object)
      {
        return createOptionLiteralAdapter();
      }
      @Override
      public Adapter caseSimpleLiteral(SimpleLiteral object)
      {
        return createSimpleLiteralAdapter();
      }
      @Override
      public Adapter caseSimpleBasicLiteral(SimpleBasicLiteral object)
      {
        return createSimpleBasicLiteralAdapter();
      }
      @Override
      public Adapter caseSimpleTupleLiteral(SimpleTupleLiteral object)
      {
        return createSimpleTupleLiteralAdapter();
      }
      @Override
      public Adapter caseSimpleOptionLiteral(SimpleOptionLiteral object)
      {
        return createSimpleOptionLiteralAdapter();
      }
      @Override
      public Adapter caseSimpleSeqLiteral(SimpleSeqLiteral object)
      {
        return createSimpleSeqLiteralAdapter();
      }
      @Override
      public Adapter caseSimpleSetLiteral(SimpleSetLiteral object)
      {
        return createSimpleSetLiteralAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseApp(App object)
      {
        return createAppAdapter();
      }
      @Override
      public Adapter caseOptionFeatureType(OptionFeatureType object)
      {
        return createOptionFeatureTypeAdapter();
      }
      @Override
      public Adapter caseSomeFeatureType(SomeFeatureType object)
      {
        return createSomeFeatureTypeAdapter();
      }
      @Override
      public Adapter caseNoneFeatureType(NoneFeatureType object)
      {
        return createNoneFeatureTypeAdapter();
      }
      @Override
      public Adapter caseEitherFeatureType(EitherFeatureType object)
      {
        return createEitherFeatureTypeAdapter();
      }
      @Override
      public Adapter caseSeqFeatureType(SeqFeatureType object)
      {
        return createSeqFeatureTypeAdapter();
      }
      @Override
      public Adapter caseSetFeatureType(SetFeatureType object)
      {
        return createSetFeatureTypeAdapter();
      }
      @Override
      public Adapter caseNumNatConstraint(NumNatConstraint object)
      {
        return createNumNatConstraintAdapter();
      }
      @Override
      public Adapter caseAnyNatConstraint(AnyNatConstraint object)
      {
        return createAnyNatConstraintAdapter();
      }
      @Override
      public Adapter caseBinaryExp(BinaryExp object)
      {
        return createBinaryExpAdapter();
      }
      @Override
      public Adapter caseUnaryExp(UnaryExp object)
      {
        return createUnaryExpAdapter();
      }
      @Override
      public Adapter casePrimaryExp(PrimaryExp object)
      {
        return createPrimaryExpAdapter();
      }
      @Override
      public Adapter caseAccessExp(AccessExp object)
      {
        return createAccessExpAdapter();
      }
      @Override
      public Adapter caseNameExp(NameExp object)
      {
        return createNameExpAdapter();
      }
      @Override
      public Adapter caseLiteralExp(LiteralExp object)
      {
        return createLiteralExpAdapter();
      }
      @Override
      public Adapter caseSeqType(SeqType object)
      {
        return createSeqTypeAdapter();
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
      public Adapter caseOptionType(OptionType object)
      {
        return createOptionTypeAdapter();
      }
      @Override
      public Adapter caseSomeType(SomeType object)
      {
        return createSomeTypeAdapter();
      }
      @Override
      public Adapter caseNoneType(NoneType object)
      {
        return createNoneTypeAdapter();
      }
      @Override
      public Adapter caseNoneLiteral(NoneLiteral object)
      {
        return createNoneLiteralAdapter();
      }
      @Override
      public Adapter caseSomeLiteral(SomeLiteral object)
      {
        return createSomeLiteralAdapter();
      }
      @Override
      public Adapter caseSimpleNoneLiteral(SimpleNoneLiteral object)
      {
        return createSimpleNoneLiteralAdapter();
      }
      @Override
      public Adapter caseSimpleSomeLiteral(SimpleSomeLiteral object)
      {
        return createSimpleSomeLiteralAdapter();
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
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl <em>Component Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl
   * @generated
   */
  public Adapter createComponentDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl <em>Member Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl
   * @generated
   */
  public Adapter createMemberDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl <em>Attr Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl
   * @generated
   */
  public Adapter createAttrDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl <em>Sub Member Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl
   * @generated
   */
  public Adapter createSubMemberDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Report
   * @generated
   */
  public Adapter createReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureType <em>Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureType
   * @generated
   */
  public Adapter createFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType <em>Base Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType
   * @generated
   */
  public Adapter createBaseFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl <em>Invariant Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.InvariantDecl
   * @generated
   */
  public Adapter createInvariantDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant <em>Multiplicity Invariant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant
   * @generated
   */
  public Adapter createMultiplicityInvariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariant <em>General Invariant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariant
   * @generated
   */
  public Adapter createGeneralInvariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch <em>Sub Member Match</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch
   * @generated
   */
  public Adapter createSubMemberMatchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintNat <em>Constraint Nat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintNat
   * @generated
   */
  public Adapter createConstraintNatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device
   * @generated
   */
  public Adapter createDeviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp <em>Constraint Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp
   * @generated
   */
  public Adapter createConstraintExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportDecl <em>Report Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportDecl
   * @generated
   */
  public Adapter createReportDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param
   * @generated
   */
  public Adapter createParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl <em>Report Member Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ReportMemberDecl
   * @generated
   */
  public Adapter createReportMemberDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrOrSubMember <em>Attr Or Sub Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrOrSubMember
   * @generated
   */
  public Adapter createAttrOrSubMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Exp
   * @generated
   */
  public Adapter createExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Primary
   * @generated
   */
  public Adapter createPrimaryAdapter()
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
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType
   * @generated
   */
  public Adapter createBaseTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral <em>Seq Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqLiteral
   * @generated
   */
  public Adapter createSeqLiteralAdapter()
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
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionLiteral <em>Option Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionLiteral
   * @generated
   */
  public Adapter createOptionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleLiteral <em>Simple Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleLiteral
   * @generated
   */
  public Adapter createSimpleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral <em>Simple Basic Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral
   * @generated
   */
  public Adapter createSimpleBasicLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral <em>Simple Tuple Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral
   * @generated
   */
  public Adapter createSimpleTupleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleOptionLiteral <em>Simple Option Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleOptionLiteral
   * @generated
   */
  public Adapter createSimpleOptionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSeqLiteral <em>Simple Seq Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSeqLiteral
   * @generated
   */
  public Adapter createSimpleSeqLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral <em>Simple Set Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral
   * @generated
   */
  public Adapter createSimpleSetLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.App <em>App</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.App
   * @generated
   */
  public Adapter createAppAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType <em>Option Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType
   * @generated
   */
  public Adapter createOptionFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType <em>Some Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeFeatureType
   * @generated
   */
  public Adapter createSomeFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneFeatureType <em>None Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneFeatureType
   * @generated
   */
  public Adapter createNoneFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType <em>Either Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType
   * @generated
   */
  public Adapter createEitherFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType <em>Seq Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType
   * @generated
   */
  public Adapter createSeqFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType <em>Set Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetFeatureType
   * @generated
   */
  public Adapter createSetFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint <em>Num Nat Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint
   * @generated
   */
  public Adapter createNumNatConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint <em>Any Nat Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint
   * @generated
   */
  public Adapter createAnyNatConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp
   * @generated
   */
  public Adapter createBinaryExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp
   * @generated
   */
  public Adapter createUnaryExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.PrimaryExp <em>Primary Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.PrimaryExp
   * @generated
   */
  public Adapter createPrimaryExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp <em>Access Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp
   * @generated
   */
  public Adapter createAccessExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp <em>Name Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp
   * @generated
   */
  public Adapter createNameExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp <em>Literal Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp
   * @generated
   */
  public Adapter createLiteralExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqType <em>Seq Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqType
   * @generated
   */
  public Adapter createSeqTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType <em>Option Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType
   * @generated
   */
  public Adapter createOptionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType <em>Some Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType
   * @generated
   */
  public Adapter createSomeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType <em>None Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType
   * @generated
   */
  public Adapter createNoneTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral <em>None Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral
   * @generated
   */
  public Adapter createNoneLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral <em>Some Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral
   * @generated
   */
  public Adapter createSomeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleNoneLiteral <em>Simple None Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleNoneLiteral
   * @generated
   */
  public Adapter createSimpleNoneLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral <em>Simple Some Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral
   * @generated
   */
  public Adapter createSimpleSomeLiteralAdapter()
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
