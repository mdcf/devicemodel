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
	protected AbstractElementAlias match_BaseFeatureType___EqualsSignKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q;
	protected AbstractElementAlias match_FeatureDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_FeatureType___EqualsSignKeyword_2_5_0_LeftCurlyBracketKeyword_2_5_1_RightCurlyBracketKeyword_2_5_3__q;
	protected AbstractElementAlias match_FeatureType___EqualsSignKeyword_4_5_0_LeftSquareBracketKeyword_4_5_1_RightSquareBracketKeyword_4_5_3__q;
	protected AbstractElementAlias match_FeatureType___EqualsSignKeyword_5_5_0_LeftCurlyBracketKeyword_5_5_1_RightCurlyBracketKeyword_5_5_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DeviceModelingLanguageGrammarAccess) access;
		match_BaseFeatureType___EqualsSignKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBaseFeatureTypeAccess().getEqualsSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getBaseFeatureTypeAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getBaseFeatureTypeAccess().getRightCurlyBracketKeyword_2_3()));
		match_FeatureDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeatureDeclAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFeatureDeclAccess().getRightCurlyBracketKeyword_3_2()));
		match_FeatureType___EqualsSignKeyword_2_5_0_LeftCurlyBracketKeyword_2_5_1_RightCurlyBracketKeyword_2_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_2_5_1()), new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_2_5_3()));
		match_FeatureType___EqualsSignKeyword_4_5_0_LeftSquareBracketKeyword_4_5_1_RightSquareBracketKeyword_4_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_4_5_0()), new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getLeftSquareBracketKeyword_4_5_1()), new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getRightSquareBracketKeyword_4_5_3()));
		match_FeatureType___EqualsSignKeyword_5_5_0_LeftCurlyBracketKeyword_5_5_1_RightCurlyBracketKeyword_5_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getEqualsSignKeyword_5_5_0()), new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getLeftCurlyBracketKeyword_5_5_1()), new TokenAlias(false, false, grammarAccess.getFeatureTypeAccess().getRightCurlyBracketKeyword_5_5_3()));
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
			if(match_BaseFeatureType___EqualsSignKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q.equals(syntax))
				emit_BaseFeatureType___EqualsSignKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FeatureDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_FeatureDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FeatureType___EqualsSignKeyword_2_5_0_LeftCurlyBracketKeyword_2_5_1_RightCurlyBracketKeyword_2_5_3__q.equals(syntax))
				emit_FeatureType___EqualsSignKeyword_2_5_0_LeftCurlyBracketKeyword_2_5_1_RightCurlyBracketKeyword_2_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FeatureType___EqualsSignKeyword_4_5_0_LeftSquareBracketKeyword_4_5_1_RightSquareBracketKeyword_4_5_3__q.equals(syntax))
				emit_FeatureType___EqualsSignKeyword_4_5_0_LeftSquareBracketKeyword_4_5_1_RightSquareBracketKeyword_4_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FeatureType___EqualsSignKeyword_5_5_0_LeftCurlyBracketKeyword_5_5_1_RightCurlyBracketKeyword_5_5_3__q.equals(syntax))
				emit_FeatureType___EqualsSignKeyword_5_5_0_LeftCurlyBracketKeyword_5_5_1_RightCurlyBracketKeyword_5_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('=' '{' '}')?
	 */
	protected void emit_BaseFeatureType___EqualsSignKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_FeatureDecl___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('=' '{' '}')?
	 */
	protected void emit_FeatureType___EqualsSignKeyword_2_5_0_LeftCurlyBracketKeyword_2_5_1_RightCurlyBracketKeyword_2_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('=' '[' ']')?
	 */
	protected void emit_FeatureType___EqualsSignKeyword_4_5_0_LeftSquareBracketKeyword_4_5_1_RightSquareBracketKeyword_4_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('=' '{' '}')?
	 */
	protected void emit_FeatureType___EqualsSignKeyword_5_5_0_LeftCurlyBracketKeyword_5_5_1_RightCurlyBracketKeyword_5_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
