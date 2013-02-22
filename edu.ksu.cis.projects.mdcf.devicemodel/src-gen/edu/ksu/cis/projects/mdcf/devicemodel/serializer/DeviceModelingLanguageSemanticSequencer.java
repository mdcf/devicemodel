package edu.ksu.cis.projects.mdcf.devicemodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Model;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SetType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeRef;
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
			case DeviceModelingLanguagePackage.BASIC_LITERAL:
				if(context == grammarAccess.getBasicLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BasicLiteral(context, (BasicLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.BASIC_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0()) {
					sequence_Type(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.ELITERAL:
				if(context == grammarAccess.getELiteralRule()) {
					sequence_ELiteral(context, (ELiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.FEATURE_GROUP_BODY:
				if(context == grammarAccess.getFeatureGroupBodyRule()) {
					sequence_FeatureGroupBody(context, (FeatureGroupBody) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.FEATURE_GROUP_DECL:
				if(context == grammarAccess.getDeclRule()) {
					sequence_Decl(context, (FeatureGroupDecl) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.GROUP_ATTR_DECL:
				if(context == grammarAccess.getGroupAttrDeclRule() ||
				   context == grammarAccess.getGroupElementDeclRule()) {
					sequence_GroupAttrDecl(context, (GroupAttrDecl) semanticObject); 
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
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0()) {
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
			case DeviceModelingLanguagePackage.SET_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getSetLiteralRule()) {
					sequence_SetLiteral(context, (SetLiteral) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SET_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0() ||
				   context == grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0()) {
					sequence_Type(context, (SetType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SUB_GROUP_DECL:
				if(context == grammarAccess.getGroupElementDeclRule() ||
				   context == grammarAccess.getSubGroupDeclRule()) {
					sequence_SubGroupDecl(context, (SubGroupDecl) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON:
				if(context == grammarAccess.getSubGroupTypeRule()) {
					sequence_SubGroupType(context, (SubGroupTypeAnon) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_REF:
				if(context == grammarAccess.getSubGroupTypeRule()) {
					sequence_SubGroupType(context, (SubGroupTypeRef) semanticObject); 
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
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (TupleType) semanticObject); 
					return; 
				}
				else break;
			case DeviceModelingLanguagePackage.TYPE_DECL:
				if(context == grammarAccess.getDeclRule()) {
					sequence_Decl(context, (TypeDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     (name=ID (supers+=[FeatureGroupDecl|ID] supers+=[FeatureGroupDecl|ID]*)? body=FeatureGroupBody)
	 */
	protected void sequence_Decl(EObject context, FeatureGroupDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Decl(EObject context, TypeDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.DECL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_0_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     lit=LIT
	 */
	protected void sequence_ELiteral(EObject context, ELiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.ELITERAL__LIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.ELITERAL__LIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getELiteralAccess().getLitLITTerminalRuleCall_0(), semanticObject.getLit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (groupElements+=GroupElementDecl*)
	 */
	protected void sequence_FeatureGroupBody(EObject context, FeatureGroupBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=Modifier attributeName=ID (attributeType=Type | attributeLiteral=Literal))
	 */
	protected void sequence_GroupAttrDecl(EObject context, GroupAttrDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeCons=[TypeDecl|ID] (elems+=ELiteral elems+=ELiteral*)?)
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
	 *     (typeCons=[TypeDecl|ID] (elems+=ELiteral elems+=ELiteral*)?)
	 */
	protected void sequence_SetLiteral(EObject context, SetLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (categoryName=ID? name=ID type=SubGroupType)
	 */
	protected void sequence_SubGroupDecl(EObject context, SubGroupDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((supers+=[FeatureGroupDecl|ID] supers+=[FeatureGroupDecl|ID]*)? body=FeatureGroupBody)
	 */
	protected void sequence_SubGroupType(EObject context, SubGroupTypeAnon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[FeatureGroupDecl|ID]
	 */
	protected void sequence_SubGroupType(EObject context, SubGroupTypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SUB_GROUP_TYPE_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SUB_GROUP_TYPE_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubGroupTypeAccess().getTypeFeatureGroupDeclIDTerminalRuleCall_0_2_0_1(), semanticObject.getType());
		feeder.finish();
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
	 *     baseType=[TypeDecl|ID]
	 */
	protected void sequence_Type(EObject context, BasicType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.BASIC_TYPE__BASE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.BASIC_TYPE__BASE_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_1_0_1(), semanticObject.getBaseType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     base=Type_ListType_0_2_0_0
	 */
	protected void sequence_Type(EObject context, ListType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.LIST_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.LIST_TYPE__BASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getListTypeBaseAction_0_2_0_0(), semanticObject.getBase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     base=Type_SetType_0_2_1_0
	 */
	protected void sequence_Type(EObject context, SetType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeviceModelingLanguagePackage.Literals.SET_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeviceModelingLanguagePackage.Literals.SET_TYPE__BASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getSetTypeBaseAction_0_2_1_0(), semanticObject.getBase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elemTypes+=Type elemTypes+=Type+)
	 */
	protected void sequence_Type(EObject context, TupleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
