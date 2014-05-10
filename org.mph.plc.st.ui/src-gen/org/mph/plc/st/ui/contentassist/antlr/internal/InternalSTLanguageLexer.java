package org.mph.plc.st.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSTLanguageLexer extends Lexer {
    public static final int RULE_PRAGMA=5;
    public static final int RULE_UNDERSCORE=8;
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_CHARACTER=11;
    public static final int RULE_COMMENT=4;
    public static final int RULE_SYMBOL=10;
    public static final int RULE_DIGIT=9;
    public static final int EOF=-1;
    public static final int RULE_LETTER=7;

    // delegates
    // delegators

    public InternalSTLanguageLexer() {;} 
    public InternalSTLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSTLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g"; }

    // $ANTLR start "RULE_PRAGMA"
    public final void mRULE_PRAGMA() throws RecognitionException {
        try {
            int _type = RULE_PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:206:13: ( '{' (~ ( '{' ) )* '}' )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:206:15: '{' (~ ( '{' ) )* '}'
            {
            match('{'); 
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:206:19: (~ ( '{' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='}') ) {
                    int LA1_1 = input.LA(2);

                    if ( ((LA1_1>='\u0000' && LA1_1<='z')||(LA1_1>='|' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='z')||LA1_0=='|'||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:206:19: ~ ( '{' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRAGMA"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:208:14: ( '(*' (~ ( '(*' ) )* '*)' )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:208:16: '(*' (~ ( '(*' ) )* '*)'
            {
            match("(*"); 

            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:208:21: (~ ( '(*' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==')') ) {
                        int LA2_3 = input.LA(3);

                        if ( ((LA2_3>='\u0000' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='(')||(LA2_1>='*' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:208:21: ~ ( '(*' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:210:17: ( ( '^' )? ( RULE_LETTER | RULE_UNDERSCORE ) ~ ( RULE_UNDERSCORE ) ( RULE_LETTER | RULE_DIGIT | RULE_UNDERSCORE )* ~ ( RULE_UNDERSCORE ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:210:19: ( '^' )? ( RULE_LETTER | RULE_UNDERSCORE ) ~ ( RULE_UNDERSCORE ) ( RULE_LETTER | RULE_DIGIT | RULE_UNDERSCORE )* ~ ( RULE_UNDERSCORE )
            {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:210:19: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:210:19: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='^')||(input.LA(1)>='`' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:210:73: ( RULE_LETTER | RULE_DIGIT | RULE_UNDERSCORE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>='\u0000' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0=='_') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='^')||(input.LA(1)>='`' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_CHARACTER"
    public final void mRULE_CHARACTER() throws RecognitionException {
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:212:25: ( ( RULE_LETTER | RULE_DIGIT | RULE_SYMBOL | RULE_UNDERSCORE )* )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:212:27: ( RULE_LETTER | RULE_DIGIT | RULE_SYMBOL | RULE_UNDERSCORE )*
            {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:212:27: ( RULE_LETTER | RULE_DIGIT | RULE_SYMBOL | RULE_UNDERSCORE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=' ' && LA5_0<='?')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')||LA5_0=='|'||LA5_0=='\u00A3') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='\u00A3' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARACTER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:214:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:214:24: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:216:21: ( '0' .. '9' )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:216:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:218:22: ( ( ' ' | '!' | '\"' | '%' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '#' | '\\u00A3' | '$' | '|' ) )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:218:24: ( ' ' | '!' | '\"' | '%' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '#' | '\\u00A3' | '$' | '|' )
            {
            if ( (input.LA(1)>=' ' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='?')||input.LA(1)=='|'||input.LA(1)=='\u00A3' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_UNDERSCORE"
    public final void mRULE_UNDERSCORE() throws RecognitionException {
        try {
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:220:26: ( '_' )
            // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:220:28: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDERSCORE"

    public void mTokens() throws RecognitionException {
        // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:8: ( RULE_PRAGMA | RULE_COMMENT | RULE_IDENTIFIER )
        int alt6=3;
        switch ( input.LA(1) ) {
        case '{':
            {
            alt6=1;
            }
            break;
        case '(':
            {
            alt6=2;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=3;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;
        }

        switch (alt6) {
            case 1 :
                // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:10: RULE_PRAGMA
                {
                mRULE_PRAGMA(); 

                }
                break;
            case 2 :
                // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:22: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 3 :
                // ../org.mph.plc.st.ui/src-gen/org/mph/plc/st/ui/contentassist/antlr/internal/InternalSTLanguage.g:1:35: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;

        }

    }


 

}