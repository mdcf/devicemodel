/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.util;

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
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Data;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Decl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device;
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
      case DeviceModelingLanguagePackage.COMPONENT_DECL:
      {
        ComponentDecl componentDecl = (ComponentDecl)theEObject;
        T result = caseComponentDecl(componentDecl);
        if (result == null) result = caseDecl(componentDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.MEMBER_DECL:
      {
        MemberDecl memberDecl = (MemberDecl)theEObject;
        T result = caseMemberDecl(memberDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.ATTR_DECL:
      {
        AttrDecl attrDecl = (AttrDecl)theEObject;
        T result = caseAttrDecl(attrDecl);
        if (result == null) result = caseMemberDecl(attrDecl);
        if (result == null) result = caseAccessor(attrDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.MODIFIER:
      {
        Modifier modifier = (Modifier)theEObject;
        T result = caseModifier(modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL:
      {
        SubMemberDecl subMemberDecl = (SubMemberDecl)theEObject;
        T result = caseSubMemberDecl(subMemberDecl);
        if (result == null) result = caseMemberDecl(subMemberDecl);
        if (result == null) result = caseAccessor(subMemberDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.REPORT:
      {
        Report report = (Report)theEObject;
        T result = caseReport(report);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.FEATURE_TYPE:
      {
        FeatureType featureType = (FeatureType)theEObject;
        T result = caseFeatureType(featureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.BASE_FEATURE_TYPE:
      {
        BaseFeatureType baseFeatureType = (BaseFeatureType)theEObject;
        T result = caseBaseFeatureType(baseFeatureType);
        if (result == null) result = caseFeatureType(baseFeatureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.INVARIANT_DECL:
      {
        InvariantDecl invariantDecl = (InvariantDecl)theEObject;
        T result = caseInvariantDecl(invariantDecl);
        if (result == null) result = caseMemberDecl(invariantDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT:
      {
        MultiplicityInvariant multiplicityInvariant = (MultiplicityInvariant)theEObject;
        T result = caseMultiplicityInvariant(multiplicityInvariant);
        if (result == null) result = caseInvariantDecl(multiplicityInvariant);
        if (result == null) result = caseMemberDecl(multiplicityInvariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.GENERAL_INVARIANT:
      {
        GeneralInvariant generalInvariant = (GeneralInvariant)theEObject;
        T result = caseGeneralInvariant(generalInvariant);
        if (result == null) result = caseInvariantDecl(generalInvariant);
        if (result == null) result = caseMemberDecl(generalInvariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SUB_MEMBER_MATCH:
      {
        SubMemberMatch subMemberMatch = (SubMemberMatch)theEObject;
        T result = caseSubMemberMatch(subMemberMatch);
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
      case DeviceModelingLanguagePackage.DEVICE:
      {
        Device device = (Device)theEObject;
        T result = caseDevice(device);
        if (result == null) result = caseComponentDecl(device);
        if (result == null) result = caseDecl(device);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.CONSTRAINT_EXP:
      {
        ConstraintExp constraintExp = (ConstraintExp)theEObject;
        T result = caseConstraintExp(constraintExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.REPORT_MEMBER_DECL:
      {
        ReportMemberDecl reportMemberDecl = (ReportMemberDecl)theEObject;
        T result = caseReportMemberDecl(reportMemberDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.ACCESSOR:
      {
        Accessor accessor = (Accessor)theEObject;
        T result = caseAccessor(accessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.PRIMARY:
      {
        Primary primary = (Primary)theEObject;
        T result = casePrimary(primary);
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
      case DeviceModelingLanguagePackage.BASE_TYPE:
      {
        BaseType baseType = (BaseType)theEObject;
        T result = caseBaseType(baseType);
        if (result == null) result = caseType(baseType);
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
      case DeviceModelingLanguagePackage.SEQ_LITERAL:
      {
        SeqLiteral seqLiteral = (SeqLiteral)theEObject;
        T result = caseSeqLiteral(seqLiteral);
        if (result == null) result = caseLiteral(seqLiteral);
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
      case DeviceModelingLanguagePackage.OPTION_LITERAL:
      {
        OptionLiteral optionLiteral = (OptionLiteral)theEObject;
        T result = caseOptionLiteral(optionLiteral);
        if (result == null) result = caseLiteral(optionLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SIMPLE_LITERAL:
      {
        SimpleLiteral simpleLiteral = (SimpleLiteral)theEObject;
        T result = caseSimpleLiteral(simpleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SIMPLE_BASIC_LITERAL:
      {
        SimpleBasicLiteral simpleBasicLiteral = (SimpleBasicLiteral)theEObject;
        T result = caseSimpleBasicLiteral(simpleBasicLiteral);
        if (result == null) result = caseSimpleLiteral(simpleBasicLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SIMPLE_TUPLE_LITERAL:
      {
        SimpleTupleLiteral simpleTupleLiteral = (SimpleTupleLiteral)theEObject;
        T result = caseSimpleTupleLiteral(simpleTupleLiteral);
        if (result == null) result = caseSimpleLiteral(simpleTupleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SIMPLE_OPTION_LITERAL:
      {
        SimpleOptionLiteral simpleOptionLiteral = (SimpleOptionLiteral)theEObject;
        T result = caseSimpleOptionLiteral(simpleOptionLiteral);
        if (result == null) result = caseSimpleLiteral(simpleOptionLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SIMPLE_SEQ_LITERAL:
      {
        SimpleSeqLiteral simpleSeqLiteral = (SimpleSeqLiteral)theEObject;
        T result = caseSimpleSeqLiteral(simpleSeqLiteral);
        if (result == null) result = caseSimpleLiteral(simpleSeqLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SIMPLE_SET_LITERAL:
      {
        SimpleSetLiteral simpleSetLiteral = (SimpleSetLiteral)theEObject;
        T result = caseSimpleSetLiteral(simpleSetLiteral);
        if (result == null) result = caseSimpleLiteral(simpleSetLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseComponentDecl(component);
        if (result == null) result = caseDecl(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.DATA:
      {
        Data data = (Data)theEObject;
        T result = caseData(data);
        if (result == null) result = caseComponentDecl(data);
        if (result == null) result = caseDecl(data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.APP:
      {
        App app = (App)theEObject;
        T result = caseApp(app);
        if (result == null) result = caseComponentDecl(app);
        if (result == null) result = caseDecl(app);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.CONST:
      {
        Const const_ = (Const)theEObject;
        T result = caseConst(const_);
        if (result == null) result = caseModifier(const_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.VAL:
      {
        Val val = (Val)theEObject;
        T result = caseVal(val);
        if (result == null) result = caseModifier(val);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.VAR:
      {
        Var var = (Var)theEObject;
        T result = caseVar(var);
        if (result == null) result = caseModifier(var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.OVERRIDE:
      {
        edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Override override = (edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Override)theEObject;
        T result = caseOverride(override);
        if (result == null) result = caseModifier(override);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.OPTION_FEATURE_TYPE:
      {
        OptionFeatureType optionFeatureType = (OptionFeatureType)theEObject;
        T result = caseOptionFeatureType(optionFeatureType);
        if (result == null) result = caseFeatureType(optionFeatureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SOME_FEATURE_TYPE:
      {
        SomeFeatureType someFeatureType = (SomeFeatureType)theEObject;
        T result = caseSomeFeatureType(someFeatureType);
        if (result == null) result = caseFeatureType(someFeatureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE:
      {
        EitherFeatureType eitherFeatureType = (EitherFeatureType)theEObject;
        T result = caseEitherFeatureType(eitherFeatureType);
        if (result == null) result = caseFeatureType(eitherFeatureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE:
      {
        SeqFeatureType seqFeatureType = (SeqFeatureType)theEObject;
        T result = caseSeqFeatureType(seqFeatureType);
        if (result == null) result = caseFeatureType(seqFeatureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SET_FEATURE_TYPE:
      {
        SetFeatureType setFeatureType = (SetFeatureType)theEObject;
        T result = caseSetFeatureType(setFeatureType);
        if (result == null) result = caseFeatureType(setFeatureType);
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
      case DeviceModelingLanguagePackage.BINARY_EXP:
      {
        BinaryExp binaryExp = (BinaryExp)theEObject;
        T result = caseBinaryExp(binaryExp);
        if (result == null) result = caseExp(binaryExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.UNARY_EXP:
      {
        UnaryExp unaryExp = (UnaryExp)theEObject;
        T result = caseUnaryExp(unaryExp);
        if (result == null) result = caseExp(unaryExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.PRIMARY_EXP:
      {
        PrimaryExp primaryExp = (PrimaryExp)theEObject;
        T result = casePrimaryExp(primaryExp);
        if (result == null) result = caseExp(primaryExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.ACCESS_EXP:
      {
        AccessExp accessExp = (AccessExp)theEObject;
        T result = caseAccessExp(accessExp);
        if (result == null) result = caseExp(accessExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.NAME_EXP:
      {
        NameExp nameExp = (NameExp)theEObject;
        T result = caseNameExp(nameExp);
        if (result == null) result = casePrimary(nameExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.LITERAL_EXP:
      {
        LiteralExp literalExp = (LiteralExp)theEObject;
        T result = caseLiteralExp(literalExp);
        if (result == null) result = casePrimary(literalExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SEQ_TYPE:
      {
        SeqType seqType = (SeqType)theEObject;
        T result = caseSeqType(seqType);
        if (result == null) result = caseType(seqType);
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
        if (result == null) result = caseBaseType(tupleType);
        if (result == null) result = caseType(tupleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.OPTION_TYPE:
      {
        OptionType optionType = (OptionType)theEObject;
        T result = caseOptionType(optionType);
        if (result == null) result = caseBaseType(optionType);
        if (result == null) result = caseType(optionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SOME_TYPE:
      {
        SomeType someType = (SomeType)theEObject;
        T result = caseSomeType(someType);
        if (result == null) result = caseBaseType(someType);
        if (result == null) result = caseType(someType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.NONE_TYPE:
      {
        NoneType noneType = (NoneType)theEObject;
        T result = caseNoneType(noneType);
        if (result == null) result = caseBaseType(noneType);
        if (result == null) result = caseType(noneType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.NONE_LITERAL:
      {
        NoneLiteral noneLiteral = (NoneLiteral)theEObject;
        T result = caseNoneLiteral(noneLiteral);
        if (result == null) result = caseOptionLiteral(noneLiteral);
        if (result == null) result = caseLiteral(noneLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SOME_LITERAL:
      {
        SomeLiteral someLiteral = (SomeLiteral)theEObject;
        T result = caseSomeLiteral(someLiteral);
        if (result == null) result = caseOptionLiteral(someLiteral);
        if (result == null) result = caseLiteral(someLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SIMPLE_NONE_LITERAL:
      {
        SimpleNoneLiteral simpleNoneLiteral = (SimpleNoneLiteral)theEObject;
        T result = caseSimpleNoneLiteral(simpleNoneLiteral);
        if (result == null) result = caseSimpleOptionLiteral(simpleNoneLiteral);
        if (result == null) result = caseSimpleLiteral(simpleNoneLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeviceModelingLanguagePackage.SIMPLE_SOME_LITERAL:
      {
        SimpleSomeLiteral simpleSomeLiteral = (SimpleSomeLiteral)theEObject;
        T result = caseSimpleSomeLiteral(simpleSomeLiteral);
        if (result == null) result = caseSimpleOptionLiteral(simpleSomeLiteral);
        if (result == null) result = caseSimpleLiteral(simpleSomeLiteral);
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
   * Returns the result of interpreting the object as an instance of '<em>Component Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentDecl(ComponentDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberDecl(MemberDecl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifier(Modifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Member Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Member Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubMemberDecl(SubMemberDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReport(Report object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureType(FeatureType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Feature Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Feature Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseFeatureType(BaseFeatureType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity Invariant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity Invariant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicityInvariant(MultiplicityInvariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Invariant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Invariant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralInvariant(GeneralInvariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Member Match</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Member Match</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubMemberMatch(SubMemberMatch object)
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
   * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDevice(Device object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraintExp(ConstraintExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Report Member Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Report Member Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReportMemberDecl(ReportMemberDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accessor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accessor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessor(Accessor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimary(Primary object)
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
   * Returns the result of interpreting the object as an instance of '<em>Base Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseType(BaseType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Seq Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seq Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeqLiteral(SeqLiteral object)
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
   * Returns the result of interpreting the object as an instance of '<em>Option Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionLiteral(OptionLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleLiteral(SimpleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Basic Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Basic Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleBasicLiteral(SimpleBasicLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Tuple Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Tuple Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleTupleLiteral(SimpleTupleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Option Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Option Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleOptionLiteral(SimpleOptionLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Seq Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Seq Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleSeqLiteral(SimpleSeqLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Set Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Set Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleSetLiteral(SimpleSetLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData(Data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>App</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>App</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApp(App object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConst(Const object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Val</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Val</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVal(Val object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar(Var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Override</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Override</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOverride(edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Override object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option Feature Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option Feature Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionFeatureType(OptionFeatureType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Feature Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Feature Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeFeatureType(SomeFeatureType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Either Feature Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Either Feature Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEitherFeatureType(EitherFeatureType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seq Feature Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seq Feature Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeqFeatureType(SeqFeatureType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Feature Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Feature Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetFeatureType(SetFeatureType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Binary Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExp(BinaryExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExp(UnaryExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryExp(PrimaryExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessExp(AccessExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameExp(NameExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralExp(LiteralExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seq Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seq Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeqType(SeqType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Option Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionType(OptionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeType(SomeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>None Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>None Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoneType(NoneType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>None Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>None Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoneLiteral(NoneLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeLiteral(SomeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple None Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple None Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleNoneLiteral(SimpleNoneLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Some Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Some Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleSomeLiteral(SimpleSomeLiteral object)
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
