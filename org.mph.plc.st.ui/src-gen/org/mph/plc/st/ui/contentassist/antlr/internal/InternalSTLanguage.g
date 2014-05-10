/*
* generated by Xtext
*/
grammar InternalSTLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.mph.plc.st.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.mph.plc.st.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.mph.plc.st.services.STLanguageGrammarAccess;

}

@parser::members {
 
 	private STLanguageGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(STLanguageGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRulePOU
entryRulePOU 
:
{ before(grammarAccess.getPOURule()); }
	 rulePOU
{ after(grammarAccess.getPOURule()); } 
	 EOF 
;

// Rule POU
rulePOU
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPOUAccess().getBodyAssignment()); }
(rule__POU__BodyAssignment)
{ after(grammarAccess.getPOUAccess().getBodyAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePOU_BODY
entryRulePOU_BODY 
:
{ before(grammarAccess.getPOU_BODYRule()); }
	 rulePOU_BODY
{ after(grammarAccess.getPOU_BODYRule()); } 
	 EOF 
;

// Rule POU_BODY
rulePOU_BODY
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPOU_BODYAccess().getElementsAssignment()); }
(rule__POU_BODY__ElementsAssignment)
{ after(grammarAccess.getPOU_BODYAccess().getElementsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBODY_ELEMENT
entryRuleBODY_ELEMENT 
:
{ before(grammarAccess.getBODY_ELEMENTRule()); }
	 ruleBODY_ELEMENT
{ after(grammarAccess.getBODY_ELEMENTRule()); } 
	 EOF 
;

// Rule BODY_ELEMENT
ruleBODY_ELEMENT
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBODY_ELEMENTAccess().getAlternatives()); }
(rule__BODY_ELEMENT__Alternatives)
{ after(grammarAccess.getBODY_ELEMENTAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__BODY_ELEMENT__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBODY_ELEMENTAccess().getCOMMENTTerminalRuleCall_0()); }
	RULE_COMMENT
{ after(grammarAccess.getBODY_ELEMENTAccess().getCOMMENTTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getBODY_ELEMENTAccess().getPRAGMATerminalRuleCall_1()); }
	RULE_PRAGMA
{ after(grammarAccess.getBODY_ELEMENTAccess().getPRAGMATerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getBODY_ELEMENTAccess().getIDENTIFIERTerminalRuleCall_2()); }
	RULE_IDENTIFIER
{ after(grammarAccess.getBODY_ELEMENTAccess().getIDENTIFIERTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__POU__BodyAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPOUAccess().getBodyPOU_BODYParserRuleCall_0()); }
	rulePOU_BODY{ after(grammarAccess.getPOUAccess().getBodyPOU_BODYParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__POU_BODY__ElementsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPOU_BODYAccess().getElementsBODY_ELEMENTParserRuleCall_0()); }
	ruleBODY_ELEMENT{ after(grammarAccess.getPOU_BODYAccess().getElementsBODY_ELEMENTParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_PRAGMA : '{' ~('{')* '}';

RULE_COMMENT : '(*' ~('(*')* '*)';

RULE_IDENTIFIER : '^'? (RULE_LETTER|RULE_UNDERSCORE) ~(RULE_UNDERSCORE) (RULE_LETTER|RULE_DIGIT|RULE_UNDERSCORE)* ~(RULE_UNDERSCORE);

fragment RULE_CHARACTER : (RULE_LETTER|RULE_DIGIT|RULE_SYMBOL|RULE_UNDERSCORE)*;

fragment RULE_LETTER : ('a'..'z'|'A'..'Z');

fragment RULE_DIGIT : '0'..'9';

fragment RULE_SYMBOL : (' '|'!'|'"'|'%'|'&'|'\''|'('|')'|'*'|'+'|','|'-'|'.'|'/'|':'|';'|'<'|'='|'>'|'?'|'#'|'\u00A3'|'$'|'|');

fragment RULE_UNDERSCORE : '_';

