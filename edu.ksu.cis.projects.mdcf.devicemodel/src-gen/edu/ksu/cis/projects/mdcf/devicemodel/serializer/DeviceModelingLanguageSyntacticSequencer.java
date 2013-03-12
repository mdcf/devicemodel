package edu.ksu.cis.projects.mdcf.devicemodel.serializer;

import com.google.inject.Inject;
import edu.ksu.cis.projects.mdcf.devicemodel.services.DeviceModelingLanguageGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DeviceModelingLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DeviceModelingLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_ComponentDecl___RequiresKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_Device___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_SubMemberDecl___LeftCurlyBracketKeyword_1_0_3_0_RightCurlyBracketKeyword_1_0_3_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DeviceModelingLanguageGrammarAccess) access;
		match_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_3_2()));
		match_ComponentDecl___RequiresKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentDeclAccess().getRequiresKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_4_3()));
		match_Device___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_4_2()));
		match_SubMemberDecl___LeftCurlyBracketKeyword_1_0_3_0_RightCurlyBracketKeyword_1_0_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSubMemberDeclAccess().getLeftCurlyBracketKeyword_1_0_3_0()), new TokenAlias(false, false, grammarAccess.getSubMemberDeclAccess().getRightCurlyBracketKeyword_1_0_3_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ComponentDecl___RequiresKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_ComponentDecl___RequiresKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Device___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_Device___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SubMemberDecl___LeftCurlyBracketKeyword_1_0_3_0_RightCurlyBracketKeyword_1_0_3_2__q.equals(syntax))
				emit_SubMemberDecl___LeftCurlyBracketKeyword_1_0_3_0_RightCurlyBracketKeyword_1_0_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('requires' '{' '}')?
	 */
	protected void emit_ComponentDecl___RequiresKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Device___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_SubMemberDecl___LeftCurlyBracketKeyword_1_0_3_0_RightCurlyBracketKeyword_1_0_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
