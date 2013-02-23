/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.util;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage
 * @generated
 */
public class DeviceModelingLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DeviceModelingLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceModelingLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DeviceModelingLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DeviceModelingLanguagePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.DECL:
      {
        Decl decl = (Decl)theEObject;
        T result = caseDecl(decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.TYPE_DECL:
      {
        TypeDecl typeDecl = (TypeDecl)theEObject;
        T result = caseTypeDecl(typeDecl);
        if (result == null) result = caseDecl(typeDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.FEATURES_DECL:
      {
        FeaturesDecl featuresDecl = (FeaturesDecl)theEObject;
        T result = caseFeaturesDecl(featuresDecl);
        if (result == null) result = caseDecl(featuresDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.FEATURES_BODY:
      {
        FeaturesBody featuresBody = (FeaturesBody)theEObject;
        T result = caseFeaturesBody(featuresBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.FEATURE_DECL:
      {
        FeatureDecl featureDecl = (FeatureDecl)theEObject;
        T result = caseFeatureDecl(featureDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.INVARIANT_DECL:
      {
        InvariantDecl invariantDecl = (InvariantDecl)theEObject;
        T result = caseInvariantDecl(invariantDecl);
        if (result == null) result = caseFeatureDecl(invariantDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT_DECL:
      {
        MultiplicityInvariantDecl multiplicityInvariantDecl = (MultiplicityInvariantDecl)theEObject;
        T result = caseMultiplicityInvariantDecl(multiplicityInvariantDecl);
        if (result == null) result = caseInvariantDecl(multiplicityInvariantDecl);
        if (result == null) result = caseFeatureDecl(multiplicityInvariantDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH:
      {
        SubFeaturesMatch subFeaturesMatch = (SubFeaturesMatch)theEObject;
        T result = caseSubFeaturesMatch(subFeaturesMatch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.CONSTRAINT_NAT:
      {
        ConstraintNat constraintNat = (ConstraintNat)theEObject;
        T result = caseConstraintNat(constraintNat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.ATTR_DECL:
      {
        AttrDecl attrDecl = (AttrDecl)theEObject;
        T result = caseAttrDecl(attrDecl);
        if (result == null) result = caseFeatureDecl(attrDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.BASIC_LITERAL:
      {
        BasicLiteral basicLiteral = (BasicLiteral)theEObject;
        T result = caseBasicLiteral(basicLiteral);
        if (result == null) result = caseLiteral(basicLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.TUPLE_LITERAL:
      {
        TupleLiteral tupleLiteral = (TupleLiteral)theEObject;
        T result = caseTupleLiteral(tupleLiteral);
        if (result == null) result = caseLiteral(tupleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.LIST_LITERAL:
      {
        ListLiteral listLiteral = (ListLiteral)theEObject;
        T result = caseListLiteral(listLiteral);
        if (result == null) result = caseLiteral(listLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SET_LITERAL:
      {
        SetLiteral setLiteral = (SetLiteral)theEObject;
        T result = caseSetLiteral(setLiteral);
        if (result == null) result = caseLiteral(setLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.ELITERAL:
      {
        ELiteral eLiteral = (ELiteral)theEObject;
        T result = caseELiteral(eLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SUB_FEATURES_DECL:
      {
        SubFeaturesDecl subFeaturesDecl = (SubFeaturesDecl)theEObject;
        T result = caseSubFeaturesDecl(subFeaturesDecl);
        if (result == null) result = caseFeatureDecl(subFeaturesDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SUB_FEATURES_TYPE:
      {
        SubFeaturesType subFeaturesType = (SubFeaturesType)theEObject;
        T result = caseSubFeaturesType(subFeaturesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.NUM_NAT_CONSTRAINT:
      {
        NumNatConstraint numNatConstraint = (NumNatConstraint)theEObject;
        T result = caseNumNatConstraint(numNatConstraint);
        if (result == null) result = caseConstraintNat(numNatConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.ANY_NAT_CONSTRAINT:
      {
        AnyNatConstraint anyNatConstraint = (AnyNatConstraint)theEObject;
        T result = caseAnyNatConstraint(anyNatConstraint);
        if (result == null) result = caseConstraintNat(anyNatConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.BASIC_TYPE:
      {
        BasicType basicType = (BasicType)theEObject;
        T result = caseBasicType(basicType);
        if (result == null) result = caseType(basicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.LIST_TYPE:
      {
        ListType listType = (ListType)theEObject;
        T result = caseListType(listType);
        if (result == null) result = caseType(listType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SET_TYPE:
      {
        SetType setType = (SetType)theEObject;
        T result = caseSetType(setType);
        if (result == null) result = caseType(setType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.TUPLE_TYPE:
      {
        TupleType tupleType = (TupleType)theEObject;
        T result = caseTupleType(tupleType);
        if (result == null) result = caseType(tupleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_REF:
      {
        SubGroupTypeRef subGroupTypeRef = (SubGroupTypeRef)theEObject;
        T result = caseSubGroupTypeRef(subGroupTypeRef);
        if (result == null) result = caseSubFeaturesType(subGroupTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON:
      {
        SubGroupTypeAnon subGroupTypeAnon = (SubGroupTypeAnon)theEObject;
        T result = caseSubGroupTypeAnon(subGroupTypeAnon);
        if (result == null) result = caseSubFeaturesType(subGroupTypeAnon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecl(Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDecl(TypeDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Features Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Features Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeaturesDecl(FeaturesDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Features Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Features Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeaturesBody(FeaturesBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureDecl(FeatureDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invariant Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invariant Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvariantDecl(InvariantDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity Invariant Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity Invariant Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicityInvariantDecl(MultiplicityInvariantDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Features Match</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Features Match</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubFeaturesMatch(SubFeaturesMatch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint Nat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint Nat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraintNat(ConstraintNat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrDecl(AttrDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicLiteral(BasicLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleLiteral(TupleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListLiteral(ListLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetLiteral(SetLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ELiteral</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ELiteral</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseELiteral(ELiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Features Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Features Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubFeaturesDecl(SubFeaturesDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Features Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Features Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubFeaturesType(SubFeaturesType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Num Nat Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Num Nat Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumNatConstraint(NumNatConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Nat Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Nat Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyNatConstraint(AnyNatConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicType(BasicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListType(ListType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetType(SetType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleType(TupleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Group Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Group Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubGroupTypeRef(SubGroupTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Group Type Anon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Group Type Anon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubGroupTypeAnon(SubGroupTypeAnon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DeviceModelingLanguageSwitch
