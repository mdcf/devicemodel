package edu.ksu.cis.projects.mdcf.devicemodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AnyNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.App;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Component;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariantDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NoneType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.NumNatConstraint;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.OptionType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleBasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleListLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleNoneLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSetLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleSomeLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SimpleTupleLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SomeType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TupleType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl;
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
			case DeviceModelingLanguagePackage.ATTR_DECL:
				if(context == grammarAccess.getAttrDeclRule() ||
				   context == grammarAccess.getMemberDeclRule()) {
					sequence_AttrDecl(context, (AttrDecl) semanticObject); 
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
			case DeviceModelingLanguagePackage.BASIC_TYPE:
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getBasicTypeAccess().getNoneTypeBaseAction_1_1_1() ||
				   context == grammarAccess.getBasicTypeAccess().getOptionTypeBaseAction_1_0_1() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
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
			case DeviceModelingLanguagePackage.LIST_LITERAL:
				if(context == grammarAccess.getListLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_ListLiteral(context, (ListLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.LIST_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0() ||
				   context == grammarAccess.getTypeAccess().getNoneTypeBaseAction_1_1_2_1() ||
				   context == grammarAccess.getTypeAccess().getOptionTypeBaseAction_1_1_0_1() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0() ||
				   context == grammarAccess.getTypeAccess().getSomeTypeBaseAction_1_1_1_1()) {
					sequence_Type(context, (ListType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT_DECL:
				if(context == grammarAccess.getInvariantDeclRule() ||
				   context == grammarAccess.getMemberDeclRule() ||
				   context == grammarAccess.getMultiplicityInvariantDeclRule()) {
					sequence_MultiplicityInvariantDecl(context, (MultiplicityInvariantDecl) semanticObject); 
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
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0()) {
					sequence_BasicType(context, (NoneType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeRule()) {
					sequence_BasicType_Type(context, (NoneType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.NUM_NAT_CONSTRAINT:
				if(context == grammarAccess.getConstraintNatRule()) {
					sequence_ConstraintNat(context, (NumNatConstraint) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.OPTION_TYPE:
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0()) {
					sequence_BasicType(context, (OptionType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeRule()) {
					sequence_BasicType_Type(context, (OptionType) semanticObject); 
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
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0() ||
				   context == grammarAccess.getTypeAccess().getNoneTypeBaseAction_1_1_2_1() ||
				   context == grammarAccess.getTypeAccess().getOptionTypeBaseAction_1_1_0_1() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0() ||
				   context == grammarAccess.getTypeAccess().getSomeTypeBaseAction_1_1_1_1()) {
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
			case DeviceModelingLanguagePackage.SIMPLE_LIST_LITERAL:
				if(context == grammarAccess.getSimpleListLiteralRule() ||
				   context == grammarAccess.getSimpleLiteralRule()) {
					sequence_SimpleListLiteral(context, (SimpleListLiteral) semanticObject); 
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
			case DeviceModelingLanguagePackage.SOME_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getOptionLiteralRule()) {
					sequence_OptionLiteral(context, (SomeLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SOME_TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (SomeType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SUB_MEMBER_DECL:
				if(context == grammarAccess.getMemberDeclRule() ||
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
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getBasicTypeAccess().getNoneTypeBaseAction_1_1_1() ||
				   context == grammarAccess.getBasicTypeAccess().getOptionTypeBaseAction_1_0_1() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0()) {
					sequence_BasicType(context, (TupleType) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     baseType=[TypeDecl|ID]
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.BASIC_TYPE__BASE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.BASIC_TYPE__BASE_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBasicTypeAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_0_0_1(), semanticObject.getBaseType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     base=BasicType_NoneType_1_1_1
	 */
	protected void sequence_BasicType(EObject context, NoneType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     base=BasicType_OptionType_1_0_1
	 */
	protected void sequence_BasicType(EObject context, OptionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elemTypes+=Type elemTypes+=Type+)
	 */
	protected void sequence_BasicType(EObject context, TupleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=Type_NoneType_1_1_2_1 | base=BasicType_NoneType_1_1_1)
	 */
	protected void sequence_BasicType_Type(EObject context, NoneType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=Type_OptionType_1_1_0_1 | base=BasicType_OptionType_1_0_1)
	 */
	protected void sequence_BasicType_Type(EObject context, OptionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]*)? members+=MemberDecl* devices+=Device*)
	 */
	protected void sequence_ComponentDecl(EObject context, App semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]*)? members+=MemberDecl* devices+=Device*)
	 */
	protected void sequence_ComponentDecl(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]*)? members+=MemberDecl* devices+=Device*)
	 */
	protected void sequence_ComponentDecl(EObject context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]* members+=MemberDecl*)
	 */
	protected void sequence_Device(EObject context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (basicType=BasicType (elems+=SimpleLiteral elems+=SimpleLiteral*)?)
	 */
	protected void sequence_ListLiteral(EObject context, ListLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     decls+=Decl*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (invName=ID? lo=ConstraintNat hi=ConstraintNat match=SubMemberMatch type=[ComponentDecl|ID]?)
	 */
	protected void sequence_MultiplicityInvariantDecl(EObject context, MultiplicityInvariantDecl semanticObject) {
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
	 *     (basicType=BasicType (elems+=SimpleLiteral elems+=SimpleLiteral*)?)
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
	 *     ((elems+=SimpleLiteral elems+=SimpleLiteral*)?)
	 */
	protected void sequence_SimpleListLiteral(EObject context, SimpleListLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID ((supers+=[ComponentDecl|ID] supers+=[ComponentDecl|ID]* members+=MemberDecl*) | members+=MemberDecl*))
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
	 *     (name=ID (supers+=[TypeDecl|ID] supers+=[TypeDecl|ID]*)? (elems+=LIT elems+=LIT*)?)
	 */
	protected void sequence_TypeDecl(EObject context, TypeDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     base=Type_ListType_1_0_0_0
	 */
	protected void sequence_Type(EObject context, ListType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.LIST_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.LIST_TYPE__BASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getListTypeBaseAction_1_0_0_0(), semanticObject.getBase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     base=Type_SetType_1_0_1_0
	 */
	protected void sequence_Type(EObject context, SetType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SET_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SET_TYPE__BASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getSetTypeBaseAction_1_0_1_0(), semanticObject.getBase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     base=Type_SomeType_1_1_1_1
	 */
	protected void sequence_Type(EObject context, SomeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SOME_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SOME_TYPE__BASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getSomeTypeBaseAction_1_1_1_1(), semanticObject.getBase());
		feeder.finish();
	}
}
