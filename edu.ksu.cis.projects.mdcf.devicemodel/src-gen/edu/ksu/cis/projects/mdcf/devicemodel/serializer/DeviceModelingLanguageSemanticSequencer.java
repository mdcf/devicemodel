package edu.ksu.cis.projects.mdcf.devicemodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AccessExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.App;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BinaryExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Data;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GeneralInvariant;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.LiteralExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NameExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Param;
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
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleNoneLiteral;
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
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.UnaryExp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Val;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Var;
import edu.ksu.cis.projects.mdcf.devicemodel.services.DeviceModelingLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DeviceModelingLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DeviceModelingLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DeviceModelingLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DeviceModelingLanguagePackage.ACCESS_EXP:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getAccessExpBaseAction_2_2_1()) {
					sequence_Exp(context, (AccessExp) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.ANY_NAT_CONSTRAINT:
				if(context == grammarAccess.getConstraintNatRule()) {
					sequence_ConstraintNat(context, (AnyNatConstraint) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.APP:
				if(context == grammarAccess.getComponentDeclRule() ||
				   context == grammarAccess.getDeclRule()) {
					sequence_ComponentDecl(context, (App) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.ATTR_DECL:
				if(context == grammarAccess.getAccessorRule() ||
				   context == grammarAccess.getAttrDeclRule() ||
				   context == grammarAccess.getMemberDeclRule()) {
					sequence_AttrDecl(context, (AttrDecl) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.BASE_FEATURE_TYPE:
				if(context == grammarAccess.getBaseFeatureTypeRule() ||
				   context == grammarAccess.getFeatureTypeRule()) {
					sequence_BaseFeatureType(context, (BaseFeatureType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.BASE_TYPE:
				if(context == grammarAccess.getBaseTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BaseType(context, (BaseType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.BASIC_LITERAL:
				if(context == grammarAccess.getBasicLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BasicLiteral(context, (BasicLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.BINARY_EXP:
				if(context == grammarAccess.getExpRule()) {
					sequence_Exp(context, (BinaryExp) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.COMPONENT:
				if(context == grammarAccess.getComponentDeclRule() ||
				   context == grammarAccess.getDeclRule()) {
					sequence_ComponentDecl(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.CONST:
				if(context == grammarAccess.getMModifierRule()) {
					sequence_MModifier(context, (Const) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getModifierRule()) {
					sequence_Modifier(context, (Const) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.CONSTRAINT_EXP:
				if(context == grammarAccess.getConstraintExpRule()) {
					sequence_ConstraintExp(context, (ConstraintExp) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.DATA:
				if(context == grammarAccess.getComponentDeclRule() ||
				   context == grammarAccess.getDeclRule()) {
					sequence_ComponentDecl(context, (Data) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMModifierRule()) {
					sequence_MModifier(context, (Data) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.DEVICE:
				if(context == grammarAccess.getComponentDeclRule() ||
				   context == grammarAccess.getDeclRule()) {
					sequence_ComponentDecl(context, (Device) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDeviceRule()) {
					sequence_Device(context, (Device) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE:
				if(context == grammarAccess.getFeatureTypeRule()) {
					sequence_FeatureType(context, (EitherFeatureType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.GENERAL_INVARIANT:
				if(context == grammarAccess.getGeneralInvariantRule() ||
				   context == grammarAccess.getInvariantDeclRule() ||
				   context == grammarAccess.getMemberDeclRule()) {
					sequence_GeneralInvariant(context, (GeneralInvariant) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.LITERAL_EXP:
				if(context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (LiteralExp) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT:
				if(context == grammarAccess.getInvariantDeclRule() ||
				   context == grammarAccess.getMemberDeclRule() ||
				   context == grammarAccess.getMultiplicityInvariantRule()) {
					sequence_MultiplicityInvariant(context, (MultiplicityInvariant) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.NAME_EXP:
				if(context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (NameExp) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.NONE_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getOptionLiteralRule()) {
					sequence_OptionLiteral(context, (NoneLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.NONE_TYPE:
				if(context == grammarAccess.getBaseTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BaseType(context, (NoneType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.NUM_NAT_CONSTRAINT:
				if(context == grammarAccess.getConstraintNatRule()) {
					sequence_ConstraintNat(context, (NumNatConstraint) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.OPTION_FEATURE_TYPE:
				if(context == grammarAccess.getFeatureTypeRule()) {
					sequence_FeatureType(context, (OptionFeatureType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.OPTION_TYPE:
				if(context == grammarAccess.getBaseTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BaseType(context, (OptionType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.OVERRIDE:
				if(context == grammarAccess.getMModifierRule() ||
				   context == grammarAccess.getModifierRule()) {
					sequence_MModifier_Modifier(context, (edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Override) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.PRIMARY_EXP:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getAccessExpBaseAction_2_2_1()) {
					sequence_Exp(context, (PrimaryExp) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.REPORT:
				if(context == grammarAccess.getReportRule()) {
					sequence_Report(context, (Report) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.REPORT_MEMBER_DECL:
				if(context == grammarAccess.getReportMemberDeclRule()) {
					sequence_ReportMemberDecl(context, (ReportMemberDecl) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE:
				if(context == grammarAccess.getFeatureTypeRule()) {
					sequence_FeatureType(context, (SeqFeatureType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SEQ_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getSeqLiteralRule()) {
					sequence_SeqLiteral(context, (SeqLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SEQ_TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (SeqType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SET_FEATURE_TYPE:
				if(context == grammarAccess.getFeatureTypeRule()) {
					sequence_FeatureType(context, (SetFeatureType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SET_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getSetLiteralRule()) {
					sequence_SetLiteral(context, (SetLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SET_TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (SetType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SIMPLE_BASIC_LITERAL:
				if(context == grammarAccess.getSimpleBasicLiteralRule() ||
				   context == grammarAccess.getSimpleLiteralRule()) {
					sequence_SimpleBasicLiteral(context, (SimpleBasicLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SIMPLE_NONE_LITERAL:
				if(context == grammarAccess.getSimpleLiteralRule() ||
				   context == grammarAccess.getSimpleOptionLiteralRule()) {
					sequence_SimpleOptionLiteral(context, (SimpleNoneLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SIMPLE_SEQ_LITERAL:
				if(context == grammarAccess.getSimpleLiteralRule() ||
				   context == grammarAccess.getSimpleSeqLiteralRule()) {
					sequence_SimpleSeqLiteral(context, (SimpleSeqLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SIMPLE_SET_LITERAL:
				if(context == grammarAccess.getSimpleLiteralRule() ||
				   context == grammarAccess.getSimpleSetLiteralRule()) {
					sequence_SimpleSetLiteral(context, (SimpleSetLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SIMPLE_SOME_LITERAL:
				if(context == grammarAccess.getSimpleLiteralRule() ||
				   context == grammarAccess.getSimpleOptionLiteralRule()) {
					sequence_SimpleOptionLiteral(context, (SimpleSomeLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SIMPLE_TUPLE_LITERAL:
				if(context == grammarAccess.getSimpleLiteralRule() ||
				   context == grammarAccess.getSimpleTupleLiteralRule()) {
					sequence_SimpleTupleLiteral(context, (SimpleTupleLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SOME_FEATURE_TYPE:
				if(context == grammarAccess.getFeatureTypeRule()) {
					sequence_FeatureType(context, (SomeFeatureType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SOME_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getOptionLiteralRule()) {
					sequence_OptionLiteral(context, (SomeLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SOME_TYPE:
				if(context == grammarAccess.getBaseTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BaseType(context, (SomeType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SUB_MEMBER_DECL:
				if(context == grammarAccess.getAccessorRule() ||
				   context == grammarAccess.getMemberDeclRule() ||
				   context == grammarAccess.getSubMemberDeclRule()) {
					sequence_SubMemberDecl(context, (SubMemberDecl) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SUB_MEMBER_MATCH:
				if(context == grammarAccess.getSubMemberMatchRule()) {
					sequence_SubMemberMatch(context, (SubMemberMatch) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.TUPLE_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getTupleLiteralRule()) {
					sequence_TupleLiteral(context, (TupleLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.TUPLE_TYPE:
				if(context == grammarAccess.getBaseTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BaseType(context, (TupleType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.TYPE_DECL:
				if(context == grammarAccess.getDeclRule() ||
				   context == grammarAccess.getTypeDeclRule()) {
					sequence_TypeDecl(context, (TypeDecl) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.UNARY_EXP:
				if(context == grammarAccess.getExpRule()) {
					sequence_Exp(context, (UnaryExp) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.VAL:
				if(context == grammarAccess.getMModifierRule() ||
				   context == grammarAccess.getModifierRule()) {
					sequence_MModifier_Modifier(context, (Val) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.VAR:
				if(context == grammarAccess.getMModifierRule() ||
				   context == grammarAccess.getModifierRule()) {
					sequence_MModifier_Modifier(context, (Var) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID exp=Exp)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.ASSIGNMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.ASSIGNMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.ASSIGNMENT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.ASSIGNMENT__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=Modifier attributeName=ID ((type=Type literal=Literal?) | literal=Literal))
	 */
	protected void sequence_AttrDecl(EObject context, AttrDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (components+=[ComponentDecl|ID] components+=[ComponentDecl|ID]* members+=MemberDecl*)
	 */
	protected void sequence_BaseFeatureType(EObject context, BaseFeatureType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[TypeDecl|ID]
	 */
	protected void sequence_BaseType(EObject context, BaseType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.BASE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.BASE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBaseTypeAccess().getTypeTypeDeclIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     base=Type
	 */
	protected void sequence_BaseType(EObject context, NoneType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     base=Type
	 */
	protected void sequence_BaseType(EObject context, OptionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     base=Type
	 */
	protected void sequence_BaseType(EObject context, SomeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elemTypes+=Type elemTypes+=Type+)
	 */
	protected void sequence_BaseType(EObject context, TupleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeCons=[TypeDecl|ID] lit=LIT)
	 */
	protected void sequence_BasicLiteral(EObject context, BasicLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.BASIC_LITERAL__TYPE_CONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.BASIC_LITERAL__TYPE_CONS));
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.BASIC_LITERAL__LIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.BASIC_LITERAL__LIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBasicLiteralAccess().getTypeConsTypeDeclIDTerminalRuleCall_0_0_1(), semanticObject.getTypeCons());
		feeder.accept(grammarAccess.getBasicLiteralAccess().getLitLITTerminalRuleCall_1_0(), semanticObject.getLit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]*)? members+=MemberDecl* (devices+=Device* assigns+=Assignment* exp=Exp)?)
	 */
	protected void sequence_ComponentDecl(EObject context, App semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (schema?='schema' | class?='class')? 
	 *         name=ID 
	 *         (supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]*)? 
	 *         members+=MemberDecl* 
	 *         (devices+=Device* assigns+=Assignment* exp=Exp)?
	 *     )
	 */
	protected void sequence_ComponentDecl(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]*)? members+=MemberDecl* (devices+=Device* assigns+=Assignment* exp=Exp)?)
	 */
	protected void sequence_ComponentDecl(EObject context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]*)? members+=MemberDecl* (devices+=Device* assigns+=Assignment* exp=Exp)?)
	 */
	protected void sequence_ComponentDecl(EObject context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     cond=Exp
	 */
	protected void sequence_ConstraintExp(EObject context, ConstraintExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.CONSTRAINT_EXP__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.CONSTRAINT_EXP__COND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintExpAccess().getCondExpParserRuleCall_1_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {AnyNatConstraint}
	 */
	protected void sequence_ConstraintNat(EObject context, AnyNatConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     num=NAT
	 */
	protected void sequence_ConstraintNat(EObject context, NumNatConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.NUM_NAT_CONSTRAINT__NUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.NUM_NAT_CONSTRAINT__NUM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintNatAccess().getNumNATTerminalRuleCall_0_1_0(), semanticObject.getNum());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID components+=[ComponentDecl|ID] components+=[ComponentDecl|ID]* constraint=ConstraintExp?)
	 */
	protected void sequence_Device(EObject context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=Exp_AccessExp_2_2_1 accessor=[Accessor|ID])
	 */
	protected void sequence_Exp(EObject context, AccessExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.ACCESS_EXP__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.ACCESS_EXP__BASE));
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.ACCESS_EXP__ACCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.ACCESS_EXP__ACCESSOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpAccess().getAccessExpBaseAction_2_2_1(), semanticObject.getBase());
		feeder.accept(grammarAccess.getExpAccess().getAccessorAccessorIDTerminalRuleCall_2_2_2_0_1(), semanticObject.getAccessor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Exp op=BinaryOp right=Exp)
	 */
	protected void sequence_Exp(EObject context, BinaryExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.BINARY_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.BINARY_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.BINARY_EXP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.BINARY_EXP__OP));
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.BINARY_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.BINARY_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpAccess().getLeftExpParserRuleCall_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getOpBinaryOpParserRuleCall_0_3_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExpAccess().getRightExpParserRuleCall_0_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     primary=Primary
	 */
	protected void sequence_Exp(EObject context, PrimaryExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.PRIMARY_EXP__PRIMARY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.PRIMARY_EXP__PRIMARY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpAccess().getPrimaryPrimaryParserRuleCall_2_1_0(), semanticObject.getPrimary());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=UnaryOp arg=Exp)
	 */
	protected void sequence_Exp(EObject context, UnaryExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.UNARY_EXP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.UNARY_EXP__OP));
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.UNARY_EXP__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.UNARY_EXP__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpAccess().getOpUnaryOpParserRuleCall_1_2_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExpAccess().getArgExpParserRuleCall_1_3_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bases+=BaseFeatureType bases+=BaseFeatureType+ (choice=NAT members+=MemberDecl*)?)
	 */
	protected void sequence_FeatureType(EObject context, EitherFeatureType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=BaseFeatureType none?='None'?)
	 */
	protected void sequence_FeatureType(EObject context, OptionFeatureType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=BaseFeatureType (elements+=BaseFeatureType elements+=BaseFeatureType*)?)
	 */
	protected void sequence_FeatureType(EObject context, SeqFeatureType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=BaseFeatureType (elements+=BaseFeatureType elements+=BaseFeatureType*)?)
	 */
	protected void sequence_FeatureType(EObject context, SetFeatureType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=BaseFeatureType members+=MemberDecl*)
	 */
	protected void sequence_FeatureType(EObject context, SomeFeatureType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (invName=ID? exp=Exp)
	 */
	protected void sequence_GeneralInvariant(EObject context, GeneralInvariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((schema?='Schema' | class?='Class')?)
	 */
	protected void sequence_MModifier(EObject context, Const semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Data}
	 */
	protected void sequence_MModifier(EObject context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Override}
	 */
	protected void sequence_MModifier_Modifier(EObject context, edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Override semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Val}
	 */
	protected void sequence_MModifier_Modifier(EObject context, Val semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Var}
	 */
	protected void sequence_MModifier_Modifier(EObject context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((schema?='Schema' | class?='Class' | instance?='Instance')? decls+=Decl*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((schema?='schema' | class?='class')?)
	 */
	protected void sequence_Modifier(EObject context, Const semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (invName=ID? lo=ConstraintNat hi=ConstraintNat match=SubMemberMatch type=[ComponentDecl|ID]?)
	 */
	protected void sequence_MultiplicityInvariant(EObject context, MultiplicityInvariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_OptionLiteral(EObject context, NoneLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.NONE_LITERAL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.NONE_LITERAL__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionLiteralAccess().getTypeTypeParserRuleCall_0_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     lit=Literal
	 */
	protected void sequence_OptionLiteral(EObject context, SomeLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SOME_LITERAL__LIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SOME_LITERAL__LIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionLiteralAccess().getLitLiteralParserRuleCall_1_2_0(), semanticObject.getLit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=BaseFeatureType)
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.PARAM__NAME));
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.PARAM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.PARAM__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParamAccess().getTypeBaseFeatureTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     lit=BasicLiteral
	 */
	protected void sequence_Primary(EObject context, LiteralExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.LITERAL_EXP__LIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.LITERAL_EXP__LIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getLitBasicLiteralParserRuleCall_1_1_0(), semanticObject.getLit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_Primary(EObject context, NameExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.NAME_EXP__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.NAME_EXP__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getIdIDTerminalRuleCall_0_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bindingName+=[Accessor|ID]+ bindingName+=[Accessor|ID])
	 */
	protected void sequence_ReportMemberDecl(EObject context, ReportMemberDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID args+=Exp args+=Exp+)
	 */
	protected void sequence_Report(EObject context, Report semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementType=Type (elems+=SimpleLiteral elems+=SimpleLiteral*)?)
	 */
	protected void sequence_SeqLiteral(EObject context, SeqLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementType=Type (elems+=SimpleLiteral elems+=SimpleLiteral*)?)
	 */
	protected void sequence_SetLiteral(EObject context, SetLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     lit=LIT
	 */
	protected void sequence_SimpleBasicLiteral(EObject context, SimpleBasicLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SIMPLE_BASIC_LITERAL__LIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SIMPLE_BASIC_LITERAL__LIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleBasicLiteralAccess().getLitLITTerminalRuleCall_0(), semanticObject.getLit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SimpleNoneLiteral}
	 */
	protected void sequence_SimpleOptionLiteral(EObject context, SimpleNoneLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     lit=SimpleLiteral
	 */
	protected void sequence_SimpleOptionLiteral(EObject context, SimpleSomeLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SIMPLE_SOME_LITERAL__LIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SIMPLE_SOME_LITERAL__LIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleOptionLiteralAccess().getLitSimpleLiteralParserRuleCall_1_2_0(), semanticObject.getLit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((elems+=SimpleLiteral elems+=SimpleLiteral*)?)
	 */
	protected void sequence_SimpleSeqLiteral(EObject context, SimpleSeqLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elems+=SimpleLiteral elems+=SimpleLiteral*)?)
	 */
	protected void sequence_SimpleSetLiteral(EObject context, SimpleSetLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elems+=SimpleLiteral elems+=SimpleLiteral*)?)
	 */
	protected void sequence_SimpleTupleLiteral(EObject context, SimpleTupleLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=MModifier? name=ID type=FeatureType)
	 */
	protected void sequence_SubMemberDecl(EObject context, SubMemberDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qNames+=ID* (name=ID | any='*'))
	 */
	protected void sequence_SubMemberMatch(EObject context, SubMemberMatch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elems+=Literal elems+=Literal*)?)
	 */
	protected void sequence_TupleLiteral(EObject context, TupleLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (supers+=[TypeDecl|ID] supers+=[TypeDecl|ID]*)?)
	 */
	protected void sequence_TypeDecl(EObject context, TypeDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     base=Type
	 */
	protected void sequence_Type(EObject context, SeqType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SEQ_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SEQ_TYPE__BASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_3_0(), semanticObject.getBase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     base=Type
	 */
	protected void sequence_Type(EObject context, SetType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SET_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SET_TYPE__BASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_3_0(), semanticObject.getBase());
		feeder.finish();
	}
}
