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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSTLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_PRAGMA", "RULE_IDENTIFIER", "RULE_LETTER", "RULE_UNDERSCORE", "RULE_DIGIT", "RULE_SYMBOL", "RULE_CHARACTER"
    };
    public static final int RULE_PRAGMA=5;
    public static final int RULE_UNDERSCORE=8;
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_CHARACTER=11;
    public static final int RULE_SYMBOL=10;
    public static final int RULE_COMMENT=4;
    public static final int RULE_DIGIT=9;
    public static final int EOF=-1;
    public static final int RULE_LETTER=7;

    // delegates
    // delegators


        public InternalSTLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSTLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSTLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g"; }


     
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




    // $ANTLR start "entryRulePOU"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:60:1: entryRulePOU : rulePOU EOF ;
    public final void entryRulePOU() throws RecognitionException {
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:61:1: ( rulePOU EOF )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:62:1: rulePOU EOF
            {
             before(grammarAccess.getPOURule()); 
            pushFollow(FOLLOW_rulePOU_in_entryRulePOU61);
            rulePOU();

            state._fsp--;

             after(grammarAccess.getPOURule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOU68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePOU"


    // $ANTLR start "rulePOU"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:69:1: rulePOU : ( ( rule__POU__BodyAssignment ) ) ;
    public final void rulePOU() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:73:2: ( ( ( rule__POU__BodyAssignment ) ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:74:1: ( ( rule__POU__BodyAssignment ) )
            {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:74:1: ( ( rule__POU__BodyAssignment ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:75:1: ( rule__POU__BodyAssignment )
            {
             before(grammarAccess.getPOUAccess().getBodyAssignment()); 
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:76:1: ( rule__POU__BodyAssignment )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:76:2: rule__POU__BodyAssignment
            {
            pushFollow(FOLLOW_rule__POU__BodyAssignment_in_rulePOU94);
            rule__POU__BodyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPOUAccess().getBodyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePOU"


    // $ANTLR start "entryRulePOU_BODY"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:88:1: entryRulePOU_BODY : rulePOU_BODY EOF ;
    public final void entryRulePOU_BODY() throws RecognitionException {
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:89:1: ( rulePOU_BODY EOF )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:90:1: rulePOU_BODY EOF
            {
             before(grammarAccess.getPOU_BODYRule()); 
            pushFollow(FOLLOW_rulePOU_BODY_in_entryRulePOU_BODY121);
            rulePOU_BODY();

            state._fsp--;

             after(grammarAccess.getPOU_BODYRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOU_BODY128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePOU_BODY"


    // $ANTLR start "rulePOU_BODY"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:97:1: rulePOU_BODY : ( ( rule__POU_BODY__ElementsAssignment ) ) ;
    public final void rulePOU_BODY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:101:2: ( ( ( rule__POU_BODY__ElementsAssignment ) ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:102:1: ( ( rule__POU_BODY__ElementsAssignment ) )
            {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:102:1: ( ( rule__POU_BODY__ElementsAssignment ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:103:1: ( rule__POU_BODY__ElementsAssignment )
            {
             before(grammarAccess.getPOU_BODYAccess().getElementsAssignment()); 
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:104:1: ( rule__POU_BODY__ElementsAssignment )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:104:2: rule__POU_BODY__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__POU_BODY__ElementsAssignment_in_rulePOU_BODY154);
            rule__POU_BODY__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPOU_BODYAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePOU_BODY"


    // $ANTLR start "entryRuleBODY_ELEMENT"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:116:1: entryRuleBODY_ELEMENT : ruleBODY_ELEMENT EOF ;
    public final void entryRuleBODY_ELEMENT() throws RecognitionException {
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:117:1: ( ruleBODY_ELEMENT EOF )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:118:1: ruleBODY_ELEMENT EOF
            {
             before(grammarAccess.getBODY_ELEMENTRule()); 
            pushFollow(FOLLOW_ruleBODY_ELEMENT_in_entryRuleBODY_ELEMENT181);
            ruleBODY_ELEMENT();

            state._fsp--;

             after(grammarAccess.getBODY_ELEMENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBODY_ELEMENT188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBODY_ELEMENT"


    // $ANTLR start "ruleBODY_ELEMENT"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:125:1: ruleBODY_ELEMENT : ( ( rule__BODY_ELEMENT__Alternatives ) ) ;
    public final void ruleBODY_ELEMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:129:2: ( ( ( rule__BODY_ELEMENT__Alternatives ) ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:130:1: ( ( rule__BODY_ELEMENT__Alternatives ) )
            {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:130:1: ( ( rule__BODY_ELEMENT__Alternatives ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:131:1: ( rule__BODY_ELEMENT__Alternatives )
            {
             before(grammarAccess.getBODY_ELEMENTAccess().getAlternatives()); 
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:132:1: ( rule__BODY_ELEMENT__Alternatives )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:132:2: rule__BODY_ELEMENT__Alternatives
            {
            pushFollow(FOLLOW_rule__BODY_ELEMENT__Alternatives_in_ruleBODY_ELEMENT214);
            rule__BODY_ELEMENT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBODY_ELEMENTAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBODY_ELEMENT"


    // $ANTLR start "rule__BODY_ELEMENT__Alternatives"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:144:1: rule__BODY_ELEMENT__Alternatives : ( ( RULE_COMMENT ) | ( RULE_PRAGMA ) | ( RULE_IDENTIFIER ) );
    public final void rule__BODY_ELEMENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:148:1: ( ( RULE_COMMENT ) | ( RULE_PRAGMA ) | ( RULE_IDENTIFIER ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_COMMENT:
                {
                alt1=1;
                }
                break;
            case RULE_PRAGMA:
                {
                alt1=2;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:149:1: ( RULE_COMMENT )
                    {
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:149:1: ( RULE_COMMENT )
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:150:1: RULE_COMMENT
                    {
                     before(grammarAccess.getBODY_ELEMENTAccess().getCOMMENTTerminalRuleCall_0()); 
                    match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__BODY_ELEMENT__Alternatives250); 
                     after(grammarAccess.getBODY_ELEMENTAccess().getCOMMENTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:155:6: ( RULE_PRAGMA )
                    {
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:155:6: ( RULE_PRAGMA )
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:156:1: RULE_PRAGMA
                    {
                     before(grammarAccess.getBODY_ELEMENTAccess().getPRAGMATerminalRuleCall_1()); 
                    match(input,RULE_PRAGMA,FOLLOW_RULE_PRAGMA_in_rule__BODY_ELEMENT__Alternatives267); 
                     after(grammarAccess.getBODY_ELEMENTAccess().getPRAGMATerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:161:6: ( RULE_IDENTIFIER )
                    {
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:161:6: ( RULE_IDENTIFIER )
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:162:1: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getBODY_ELEMENTAccess().getIDENTIFIERTerminalRuleCall_2()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__BODY_ELEMENT__Alternatives284); 
                     after(grammarAccess.getBODY_ELEMENTAccess().getIDENTIFIERTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BODY_ELEMENT__Alternatives"


    // $ANTLR start "rule__POU__BodyAssignment"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:175:1: rule__POU__BodyAssignment : ( rulePOU_BODY ) ;
    public final void rule__POU__BodyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:179:1: ( ( rulePOU_BODY ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:180:1: ( rulePOU_BODY )
            {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:180:1: ( rulePOU_BODY )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:181:1: rulePOU_BODY
            {
             before(grammarAccess.getPOUAccess().getBodyPOU_BODYParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePOU_BODY_in_rule__POU__BodyAssignment319);
            rulePOU_BODY();

            state._fsp--;

             after(grammarAccess.getPOUAccess().getBodyPOU_BODYParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POU__BodyAssignment"


    // $ANTLR start "rule__POU_BODY__ElementsAssignment"
    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:190:1: rule__POU_BODY__ElementsAssignment : ( ruleBODY_ELEMENT ) ;
    public final void rule__POU_BODY__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:194:1: ( ( ruleBODY_ELEMENT ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:195:1: ( ruleBODY_ELEMENT )
            {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:195:1: ( ruleBODY_ELEMENT )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:196:1: ruleBODY_ELEMENT
            {
             before(grammarAccess.getPOU_BODYAccess().getElementsBODY_ELEMENTParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBODY_ELEMENT_in_rule__POU_BODY__ElementsAssignment350);
            ruleBODY_ELEMENT();

            state._fsp--;

             after(grammarAccess.getPOU_BODYAccess().getElementsBODY_ELEMENTParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POU_BODY__ElementsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePOU_in_entryRulePOU61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOU68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POU__BodyAssignment_in_rulePOU94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOU_BODY_in_entryRulePOU_BODY121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOU_BODY128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POU_BODY__ElementsAssignment_in_rulePOU_BODY154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBODY_ELEMENT_in_entryRuleBODY_ELEMENT181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBODY_ELEMENT188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BODY_ELEMENT__Alternatives_in_ruleBODY_ELEMENT214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__BODY_ELEMENT__Alternatives250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRAGMA_in_rule__BODY_ELEMENT__Alternatives267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__BODY_ELEMENT__Alternatives284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOU_BODY_in_rule__POU__BodyAssignment319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBODY_ELEMENT_in_rule__POU_BODY__ElementsAssignment350 = new BitSet(new long[]{0x0000000000000002L});

}