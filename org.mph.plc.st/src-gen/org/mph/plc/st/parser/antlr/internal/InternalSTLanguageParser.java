package org.mph.plc.st.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mph.plc.st.services.STLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSTLanguageParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g"; }



     	private STLanguageGrammarAccess grammarAccess;
     	
        public InternalSTLanguageParser(TokenStream input, STLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "POU";	
       	}
       	
       	@Override
       	protected STLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePOU"
    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:67:1: entryRulePOU returns [EObject current=null] : iv_rulePOU= rulePOU EOF ;
    public final EObject entryRulePOU() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOU = null;


        try {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:68:2: (iv_rulePOU= rulePOU EOF )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:69:2: iv_rulePOU= rulePOU EOF
            {
             newCompositeNode(grammarAccess.getPOURule()); 
            pushFollow(FOLLOW_rulePOU_in_entryRulePOU75);
            iv_rulePOU=rulePOU();

            state._fsp--;

             current =iv_rulePOU; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOU85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOU"


    // $ANTLR start "rulePOU"
    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:76:1: rulePOU returns [EObject current=null] : ( (lv_body_0_0= rulePOU_BODY ) ) ;
    public final EObject rulePOU() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:79:28: ( ( (lv_body_0_0= rulePOU_BODY ) ) )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:80:1: ( (lv_body_0_0= rulePOU_BODY ) )
            {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:80:1: ( (lv_body_0_0= rulePOU_BODY ) )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:81:1: (lv_body_0_0= rulePOU_BODY )
            {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:81:1: (lv_body_0_0= rulePOU_BODY )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:82:3: lv_body_0_0= rulePOU_BODY
            {
             
            	        newCompositeNode(grammarAccess.getPOUAccess().getBodyPOU_BODYParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePOU_BODY_in_rulePOU130);
            lv_body_0_0=rulePOU_BODY();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPOURule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_0_0, 
                    		"POU_BODY");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOU"


    // $ANTLR start "entryRulePOU_BODY"
    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:106:1: entryRulePOU_BODY returns [EObject current=null] : iv_rulePOU_BODY= rulePOU_BODY EOF ;
    public final EObject entryRulePOU_BODY() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOU_BODY = null;


        try {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:107:2: (iv_rulePOU_BODY= rulePOU_BODY EOF )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:108:2: iv_rulePOU_BODY= rulePOU_BODY EOF
            {
             newCompositeNode(grammarAccess.getPOU_BODYRule()); 
            pushFollow(FOLLOW_rulePOU_BODY_in_entryRulePOU_BODY165);
            iv_rulePOU_BODY=rulePOU_BODY();

            state._fsp--;

             current =iv_rulePOU_BODY; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOU_BODY175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOU_BODY"


    // $ANTLR start "rulePOU_BODY"
    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:115:1: rulePOU_BODY returns [EObject current=null] : ( (lv_elements_0_0= ruleBODY_ELEMENT ) ) ;
    public final EObject rulePOU_BODY() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:118:28: ( ( (lv_elements_0_0= ruleBODY_ELEMENT ) ) )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:119:1: ( (lv_elements_0_0= ruleBODY_ELEMENT ) )
            {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:119:1: ( (lv_elements_0_0= ruleBODY_ELEMENT ) )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:120:1: (lv_elements_0_0= ruleBODY_ELEMENT )
            {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:120:1: (lv_elements_0_0= ruleBODY_ELEMENT )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:121:3: lv_elements_0_0= ruleBODY_ELEMENT
            {
             
            	        newCompositeNode(grammarAccess.getPOU_BODYAccess().getElementsBODY_ELEMENTParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBODY_ELEMENT_in_rulePOU_BODY220);
            lv_elements_0_0=ruleBODY_ELEMENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPOU_BODYRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"BODY_ELEMENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOU_BODY"


    // $ANTLR start "entryRuleBODY_ELEMENT"
    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:145:1: entryRuleBODY_ELEMENT returns [String current=null] : iv_ruleBODY_ELEMENT= ruleBODY_ELEMENT EOF ;
    public final String entryRuleBODY_ELEMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBODY_ELEMENT = null;


        try {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:146:2: (iv_ruleBODY_ELEMENT= ruleBODY_ELEMENT EOF )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:147:2: iv_ruleBODY_ELEMENT= ruleBODY_ELEMENT EOF
            {
             newCompositeNode(grammarAccess.getBODY_ELEMENTRule()); 
            pushFollow(FOLLOW_ruleBODY_ELEMENT_in_entryRuleBODY_ELEMENT256);
            iv_ruleBODY_ELEMENT=ruleBODY_ELEMENT();

            state._fsp--;

             current =iv_ruleBODY_ELEMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBODY_ELEMENT267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBODY_ELEMENT"


    // $ANTLR start "ruleBODY_ELEMENT"
    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:154:1: ruleBODY_ELEMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_COMMENT_0= RULE_COMMENT | this_PRAGMA_1= RULE_PRAGMA | this_IDENTIFIER_2= RULE_IDENTIFIER ) ;
    public final AntlrDatatypeRuleToken ruleBODY_ELEMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;
        Token this_PRAGMA_1=null;
        Token this_IDENTIFIER_2=null;

         enterRule(); 
            
        try {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:157:28: ( (this_COMMENT_0= RULE_COMMENT | this_PRAGMA_1= RULE_PRAGMA | this_IDENTIFIER_2= RULE_IDENTIFIER ) )
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:158:1: (this_COMMENT_0= RULE_COMMENT | this_PRAGMA_1= RULE_PRAGMA | this_IDENTIFIER_2= RULE_IDENTIFIER )
            {
            // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:158:1: (this_COMMENT_0= RULE_COMMENT | this_PRAGMA_1= RULE_PRAGMA | this_IDENTIFIER_2= RULE_IDENTIFIER )
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
                    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:158:6: this_COMMENT_0= RULE_COMMENT
                    {
                    this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleBODY_ELEMENT307); 

                    		current.merge(this_COMMENT_0);
                        
                     
                        newLeafNode(this_COMMENT_0, grammarAccess.getBODY_ELEMENTAccess().getCOMMENTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:166:10: this_PRAGMA_1= RULE_PRAGMA
                    {
                    this_PRAGMA_1=(Token)match(input,RULE_PRAGMA,FOLLOW_RULE_PRAGMA_in_ruleBODY_ELEMENT333); 

                    		current.merge(this_PRAGMA_1);
                        
                     
                        newLeafNode(this_PRAGMA_1, grammarAccess.getBODY_ELEMENTAccess().getPRAGMATerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.mph.plc.st/src-gen/org/mph/plc/st/parser/antlr/internal/InternalSTLanguage.g:174:10: this_IDENTIFIER_2= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleBODY_ELEMENT359); 

                    		current.merge(this_IDENTIFIER_2);
                        
                     
                        newLeafNode(this_IDENTIFIER_2, grammarAccess.getBODY_ELEMENTAccess().getIDENTIFIERTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBODY_ELEMENT"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePOU_in_entryRulePOU75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOU85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOU_BODY_in_rulePOU130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOU_BODY_in_entryRulePOU_BODY165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOU_BODY175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBODY_ELEMENT_in_rulePOU_BODY220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBODY_ELEMENT_in_entryRuleBODY_ELEMENT256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBODY_ELEMENT267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleBODY_ELEMENT307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRAGMA_in_ruleBODY_ELEMENT333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleBODY_ELEMENT359 = new BitSet(new long[]{0x0000000000000002L});

}