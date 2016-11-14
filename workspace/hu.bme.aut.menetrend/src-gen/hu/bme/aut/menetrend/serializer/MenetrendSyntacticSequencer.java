/*
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.serializer;

import com.google.inject.Inject;
import hu.bme.aut.menetrend.services.MenetrendGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MenetrendSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MenetrendGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AbsoluteSchedule_CommaKeyword_2_0_0_or_FullStopFullStopFullStopKeyword_2_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MenetrendGrammarAccess) access;
		match_AbsoluteSchedule_CommaKeyword_2_0_0_or_FullStopFullStopFullStopKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAbsoluteScheduleAccess().getCommaKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getAbsoluteScheduleAccess().getFullStopFullStopFullStopKeyword_2_0_1()));
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
			if (match_AbsoluteSchedule_CommaKeyword_2_0_0_or_FullStopFullStopFullStopKeyword_2_0_1.equals(syntax))
				emit_AbsoluteSchedule_CommaKeyword_2_0_0_or_FullStopFullStopFullStopKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ',' | '...'
	 *
	 * This ambiguous syntax occurs at:
	 *     departures+=Departure (ambiguity) departures+=Departure
	 */
	protected void emit_AbsoluteSchedule_CommaKeyword_2_0_0_or_FullStopFullStopFullStopKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}