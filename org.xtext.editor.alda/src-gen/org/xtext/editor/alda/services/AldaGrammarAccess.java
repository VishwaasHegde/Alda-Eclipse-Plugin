/*
 * generated by Xtext 2.10.0
 */
package org.xtext.editor.alda.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AldaGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDeclarationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDeclarationsDECLRATIONSParserRuleCall_0_0 = (RuleCall)cDeclarationsAssignment_0.eContents().get(0);
		private final Assignment cInstrumentsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInstrumentsINSTRUMENTSParserRuleCall_1_0 = (RuleCall)cInstrumentsAssignment_1.eContents().get(0);
		
		//Model:
		//	declarations+=DECLRATIONS*
		//	instruments+=INSTRUMENTS*;
		@Override public ParserRule getRule() { return rule; }
		
		//declarations+=DECLRATIONS* instruments+=INSTRUMENTS*
		public Group getGroup() { return cGroup; }
		
		//declarations+=DECLRATIONS*
		public Assignment getDeclarationsAssignment_0() { return cDeclarationsAssignment_0; }
		
		//DECLRATIONS
		public RuleCall getDeclarationsDECLRATIONSParserRuleCall_0_0() { return cDeclarationsDECLRATIONSParserRuleCall_0_0; }
		
		//instruments+=INSTRUMENTS*
		public Assignment getInstrumentsAssignment_1() { return cInstrumentsAssignment_1; }
		
		//INSTRUMENTS
		public RuleCall getInstrumentsINSTRUMENTSParserRuleCall_1_0() { return cInstrumentsINSTRUMENTSParserRuleCall_1_0; }
	}
	public class DECLRATIONSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.DECLRATIONS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTempoParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cQuantParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVolumeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cKeySignatureParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cCOMMENTParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//DECLRATIONS:
		//	Tempo | Quant | Volume | KeySignature | COMMENT;
		@Override public ParserRule getRule() { return rule; }
		
		//Tempo | Quant | Volume | KeySignature | COMMENT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Tempo
		public RuleCall getTempoParserRuleCall_0() { return cTempoParserRuleCall_0; }
		
		//Quant
		public RuleCall getQuantParserRuleCall_1() { return cQuantParserRuleCall_1; }
		
		//Volume
		public RuleCall getVolumeParserRuleCall_2() { return cVolumeParserRuleCall_2; }
		
		//KeySignature
		public RuleCall getKeySignatureParserRuleCall_3() { return cKeySignatureParserRuleCall_3; }
		
		//COMMENT
		public RuleCall getCOMMENTParserRuleCall_4() { return cCOMMENTParserRuleCall_4; }
	}
	public class COMMENTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.COMMENT");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCommentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//COMMENT:
		//	'(' 'comment' name=STRING ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'comment' name=STRING ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'comment'
		public Keyword getCommentKeyword_1() { return cCommentKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class INSTRUMENTSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.INSTRUMENTS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINSTRUMENTParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINSTRUMENTParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cControl000aKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameNOTESTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		
		//INSTRUMENTS:
		//	INSTRUMENT ('/' INSTRUMENT)* ':' '\n'* name=NOTES;
		@Override public ParserRule getRule() { return rule; }
		
		//INSTRUMENT ('/' INSTRUMENT)* ':' '\n'* name=NOTES
		public Group getGroup() { return cGroup; }
		
		//INSTRUMENT
		public RuleCall getINSTRUMENTParserRuleCall_0() { return cINSTRUMENTParserRuleCall_0; }
		
		//('/' INSTRUMENT)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0() { return cSolidusKeyword_1_0; }
		
		//INSTRUMENT
		public RuleCall getINSTRUMENTParserRuleCall_1_1() { return cINSTRUMENTParserRuleCall_1_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'\n'*
		public Keyword getControl000aKeyword_3() { return cControl000aKeyword_3; }
		
		//name=NOTES
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//NOTES
		public RuleCall getNameNOTESTerminalRuleCall_4_0() { return cNameNOTESTerminalRuleCall_4_0; }
	}
	public class INSTRUMENTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.INSTRUMENT");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPianoKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cViolinKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cFluteKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//INSTRUMENT:
		//	'piano' | 'violin' | 'flute';
		@Override public ParserRule getRule() { return rule; }
		
		//'piano' | 'violin' | 'flute'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'piano'
		public Keyword getPianoKeyword_0() { return cPianoKeyword_0; }
		
		//'violin'
		public Keyword getViolinKeyword_1() { return cViolinKeyword_1; }
		
		//'flute'
		public Keyword getFluteKeyword_2() { return cFluteKeyword_2; }
	}
	public class TempoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.Tempo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTempoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameINTTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Tempo:
		//	'(' 'tempo' '!'? name=INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'tempo' '!'? name=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'tempo'
		public Keyword getTempoKeyword_1() { return cTempoKeyword_1; }
		
		//'!'?
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
		
		//name=INT
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//INT
		public RuleCall getNameINTTerminalRuleCall_3_0() { return cNameINTTerminalRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class QuantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.Quant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cQuantKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameINTTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Quant:
		//	'(' 'quant' '!'? name=INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'quant' '!'? name=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'quant'
		public Keyword getQuantKeyword_1() { return cQuantKeyword_1; }
		
		//'!'?
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
		
		//name=INT
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//INT
		public RuleCall getNameINTTerminalRuleCall_3_0() { return cNameINTTerminalRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class VolumeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.Volume");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cVolumeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameINTTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Volume:
		//	'(' 'volume' '!'? name=INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'volume' '!'? name=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'volume'
		public Keyword getVolumeKeyword_1() { return cVolumeKeyword_1; }
		
		//'!'?
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
		
		//name=INT
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//INT
		public RuleCall getNameINTTerminalRuleCall_3_0() { return cNameINTTerminalRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class KeySignatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.KeySignature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cKeySignatureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameNOTESTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//KeySignature:
		//	'(' 'key-signature' '!'? name=NOTES ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'key-signature' '!'? name=NOTES ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'key-signature'
		public Keyword getKeySignatureKeyword_1() { return cKeySignatureKeyword_1; }
		
		//'!'?
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
		
		//name=NOTES
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//NOTES
		public RuleCall getNameNOTESTerminalRuleCall_3_0() { return cNameNOTESTerminalRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	
	
	private final ModelElements pModel;
	private final DECLRATIONSElements pDECLRATIONS;
	private final COMMENTElements pCOMMENT;
	private final TerminalRule tML_COMMENT;
	private final INSTRUMENTSElements pINSTRUMENTS;
	private final INSTRUMENTElements pINSTRUMENT;
	private final TempoElements pTempo;
	private final QuantElements pQuant;
	private final VolumeElements pVolume;
	private final KeySignatureElements pKeySignature;
	private final TerminalRule tNOTES;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AldaGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDECLRATIONS = new DECLRATIONSElements();
		this.pCOMMENT = new COMMENTElements();
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.ML_COMMENT");
		this.pINSTRUMENTS = new INSTRUMENTSElements();
		this.pINSTRUMENT = new INSTRUMENTElements();
		this.pTempo = new TempoElements();
		this.pQuant = new QuantElements();
		this.pVolume = new VolumeElements();
		this.pKeySignature = new KeySignatureElements();
		this.tNOTES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.editor.alda.Alda.NOTES");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.editor.alda.Alda".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	declarations+=DECLRATIONS*
	//	instruments+=INSTRUMENTS*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//DECLRATIONS:
	//	Tempo | Quant | Volume | KeySignature | COMMENT;
	public DECLRATIONSElements getDECLRATIONSAccess() {
		return pDECLRATIONS;
	}
	
	public ParserRule getDECLRATIONSRule() {
		return getDECLRATIONSAccess().getRule();
	}
	
	//COMMENT:
	//	'(' 'comment' name=STRING ')';
	public COMMENTElements getCOMMENTAccess() {
		return pCOMMENT;
	}
	
	public ParserRule getCOMMENTRule() {
		return getCOMMENTAccess().getRule();
	}
	
	//terminal ML_COMMENT:
	//	'#'->'\n';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//INSTRUMENTS:
	//	INSTRUMENT ('/' INSTRUMENT)* ':' '\n'* name=NOTES;
	public INSTRUMENTSElements getINSTRUMENTSAccess() {
		return pINSTRUMENTS;
	}
	
	public ParserRule getINSTRUMENTSRule() {
		return getINSTRUMENTSAccess().getRule();
	}
	
	//INSTRUMENT:
	//	'piano' | 'violin' | 'flute';
	public INSTRUMENTElements getINSTRUMENTAccess() {
		return pINSTRUMENT;
	}
	
	public ParserRule getINSTRUMENTRule() {
		return getINSTRUMENTAccess().getRule();
	}
	
	//Tempo:
	//	'(' 'tempo' '!'? name=INT ')';
	public TempoElements getTempoAccess() {
		return pTempo;
	}
	
	public ParserRule getTempoRule() {
		return getTempoAccess().getRule();
	}
	
	//Quant:
	//	'(' 'quant' '!'? name=INT ')';
	public QuantElements getQuantAccess() {
		return pQuant;
	}
	
	public ParserRule getQuantRule() {
		return getQuantAccess().getRule();
	}
	
	//Volume:
	//	'(' 'volume' '!'? name=INT ')';
	public VolumeElements getVolumeAccess() {
		return pVolume;
	}
	
	public ParserRule getVolumeRule() {
		return getVolumeAccess().getRule();
	}
	
	//KeySignature:
	//	'(' 'key-signature' '!'? name=NOTES ')';
	public KeySignatureElements getKeySignatureAccess() {
		return pKeySignature;
	}
	
	public ParserRule getKeySignatureRule() {
		return getKeySignatureAccess().getRule();
	}
	
	//terminal NOTES:
	//	(('o' | 'r') '1'..'9'* ' ')? ('a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g') ('-' | '+')? '1'..'9'* ('~' | '/' | '.' | ' '
	//	| '|' | '*' | '<' | '>' | '-' | '.~' '1'..'9')* ((('o' | 'r') '1'..'9'* ' ')? ('a' | 'b' | 'c' | 'd' | 'e' | 'f' |
	//	'g') ('-' | '+')? '1'..'9'* ('~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1'..'9')*)*;
	public TerminalRule getNOTESRule() {
		return tNOTES;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
