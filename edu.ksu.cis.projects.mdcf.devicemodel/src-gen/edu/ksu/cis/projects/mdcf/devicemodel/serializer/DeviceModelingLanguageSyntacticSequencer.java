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
	protected AbstractElementAlias match_AppRequirement___LeftCurlyBracketKeyword_4_0_3_0_RightCurlyBracketKeyword_4_0_3_2__q;
	protected AbstractElementAlias match_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SubMemberDecl___LeftCurlyBracketKeyword_2_0_3_0_RightCurlyBracketKeyword_2_0_3_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DeviceModelingLanguageGrammarAccess) access;
		match_AppRequirement___LeftCurlyBracketKeyword_4_0_3_0_RightCurlyBracketKeyword_4_0_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAppRequirementAccess().getLeftCurlyBracketKeyword_4_0_3_0()), new TokenAlias(false, false, grammarAccess.getAppRequirementAccess().getRightCurlyBracketKeyword_4_0_3_2()));
		match_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentDeclAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getComponentDeclAccess().getRightCurlyBracketKeyword_3_2()));
		match_SubMemberDecl___LeftCurlyBracketKeyword_2_0_3_0_RightCurlyBracketKeyword_2_0_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSubMemberDeclAccess().getLeftCurlyBracketKeyword_2_0_3_0()), new TokenAlias(false, false, grammarAccess.getSubMemberDeclAccess().getRightCurlyBracketKeyword_2_0_3_2()));
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
			if(match_AppRequirement___LeftCurlyBracketKeyword_4_0_3_0_RightCurlyBracketKeyword_4_0_3_2__q.equals(syntax))
				emit_AppRequirement___LeftCurlyBracketKeyword_4_0_3_0_RightCurlyBracketKeyword_4_0_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_ComponentDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SubMemberDecl___LeftCurlyBracketKeyword_2_0_3_0_RightCurlyBracketKeyword_2_0_3_2__q.equals(syntax))
				emit_SubMemberDecl___LeftCurlyBracketKeyword_2_0_3_0_RightCurlyBracketKeyword_2_0_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_AppRequirement___LeftCurlyBracketKeyword_4_0_3_0_RightCurlyBracketKeyword_4_0_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
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
	 *     ('{' '}')?
	 */
	protected void emit_SubMemberDecl___LeftCurlyBracketKeyword_2_0_3_0_RightCurlyBracketKeyword_2_0_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
