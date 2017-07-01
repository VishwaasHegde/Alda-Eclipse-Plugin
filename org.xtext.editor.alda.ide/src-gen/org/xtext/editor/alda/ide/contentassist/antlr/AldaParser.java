/*
 * generated by Xtext 2.10.0
 */
package org.xtext.editor.alda.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.editor.alda.ide.contentassist.antlr.internal.InternalAldaParser;
import org.xtext.editor.alda.services.AldaGrammarAccess;

public class AldaParser extends AbstractContentAssistParser {

	@Inject
	private AldaGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAldaParser createParser() {
		InternalAldaParser result = new InternalAldaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDECLRATIONSAccess().getAlternatives(), "rule__DECLRATIONS__Alternatives");
					put(grammarAccess.getINSTRUMENTAccess().getAlternatives(), "rule__INSTRUMENT__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getCOMMENTAccess().getGroup(), "rule__COMMENT__Group__0");
					put(grammarAccess.getINSTRUMENTSAccess().getGroup(), "rule__INSTRUMENTS__Group__0");
					put(grammarAccess.getINSTRUMENTSAccess().getGroup_1(), "rule__INSTRUMENTS__Group_1__0");
					put(grammarAccess.getTempoAccess().getGroup(), "rule__Tempo__Group__0");
					put(grammarAccess.getQuantAccess().getGroup(), "rule__Quant__Group__0");
					put(grammarAccess.getVolumeAccess().getGroup(), "rule__Volume__Group__0");
					put(grammarAccess.getKeySignatureAccess().getGroup(), "rule__KeySignature__Group__0");
					put(grammarAccess.getModelAccess().getDeclarationsAssignment_0(), "rule__Model__DeclarationsAssignment_0");
					put(grammarAccess.getModelAccess().getInstrumentsAssignment_1(), "rule__Model__InstrumentsAssignment_1");
					put(grammarAccess.getCOMMENTAccess().getNameAssignment_2(), "rule__COMMENT__NameAssignment_2");
					put(grammarAccess.getINSTRUMENTSAccess().getNameAssignment_4(), "rule__INSTRUMENTS__NameAssignment_4");
					put(grammarAccess.getTempoAccess().getNameAssignment_3(), "rule__Tempo__NameAssignment_3");
					put(grammarAccess.getQuantAccess().getNameAssignment_3(), "rule__Quant__NameAssignment_3");
					put(grammarAccess.getVolumeAccess().getNameAssignment_3(), "rule__Volume__NameAssignment_3");
					put(grammarAccess.getKeySignatureAccess().getNameAssignment_3(), "rule__KeySignature__NameAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAldaParser typedParser = (InternalAldaParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AldaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AldaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}