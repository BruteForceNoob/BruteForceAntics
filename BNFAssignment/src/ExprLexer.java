// $ANTLR 3.5.1 C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g 2017-10-26 10:51:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int ESC_SEQ=4;
	public static final int HEX_DIGIT=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int NEWLINE=8;
	public static final int OCTAL_ESC=9;
	public static final int SINGLE_LINE_COMMENT=10;
	public static final int STRING=11;
	public static final int UNICODE_ESC=12;
	public static final int WS=13;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g"; }

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:2:7: ( '(' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:3:7: ( ')' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:4:7: ( '*' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:5:7: ( '+' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:6:7: ( ',' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:7:7: ( '-' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:8:7: ( '/' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:8:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:9:7: ( '=' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:9:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:10:7: ( 'END' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:10:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:11:7: ( 'INPUT' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:11:9: 'INPUT'
			{
			match("INPUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:12:7: ( 'INTEGER' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:12:9: 'INTEGER'
			{
			match("INTEGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:13:7: ( 'LET' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:13:9: 'LET'
			{
			match("LET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:203:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:203:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:203:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:207:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:207:9: ( '0' .. '9' )+
			{
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:207:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "SINGLE_LINE_COMMENT"
	public final void mSINGLE_LINE_COMMENT() throws RecognitionException {
		try {
			int _type = SINGLE_LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:210:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:210:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:210:12: (~ ( '\\n' | '\\r' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:210:26: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:210:26: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLE_LINE_COMMENT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:212:8: ( ( '\\r' )? '\\n' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:212:9: ( '\\r' )? '\\n'
			{
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:212:9: ( '\\r' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\r') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:212:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:213:5: ( ( ' ' | '\\t' )+ )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:213:9: ( ' ' | '\\t' )+
			{
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:213:9: ( ' ' | '\\t' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\t'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:217:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:217:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:217:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\\') ) {
					alt7=1;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:217:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:217:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:222:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:226:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt8=1;
					}
					break;
				case 'u':
					{
					alt8=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt8=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:226:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:227:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:228:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:233:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\\') ) {
				int LA9_1 = input.LA(2);
				if ( ((LA9_1 >= '0' && LA9_1 <= '3')) ) {
					int LA9_2 = input.LA(3);
					if ( ((LA9_2 >= '0' && LA9_2 <= '7')) ) {
						int LA9_4 = input.LA(4);
						if ( ((LA9_4 >= '0' && LA9_4 <= '7')) ) {
							alt9=1;
						}

						else {
							alt9=2;
						}

					}

					else {
						alt9=3;
					}

				}
				else if ( ((LA9_1 >= '4' && LA9_1 <= '7')) ) {
					int LA9_3 = input.LA(3);
					if ( ((LA9_3 >= '0' && LA9_3 <= '7')) ) {
						alt9=2;
					}

					else {
						alt9=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:233:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:234:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:235:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:240:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:240:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | ID | INT | SINGLE_LINE_COMMENT | NEWLINE | WS | STRING )
		int alt10=18;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt10=1;
			}
			break;
		case ')':
			{
			alt10=2;
			}
			break;
		case '*':
			{
			alt10=3;
			}
			break;
		case '+':
			{
			alt10=4;
			}
			break;
		case ',':
			{
			alt10=5;
			}
			break;
		case '-':
			{
			alt10=6;
			}
			break;
		case '/':
			{
			int LA10_7 = input.LA(2);
			if ( (LA10_7=='/') ) {
				alt10=15;
			}

			else {
				alt10=7;
			}

			}
			break;
		case '=':
			{
			alt10=8;
			}
			break;
		case 'E':
			{
			int LA10_9 = input.LA(2);
			if ( (LA10_9=='N') ) {
				int LA10_19 = input.LA(3);
				if ( (LA10_19=='D') ) {
					int LA10_22 = input.LA(4);
					if ( ((LA10_22 >= '0' && LA10_22 <= '9')||(LA10_22 >= 'A' && LA10_22 <= 'Z')||LA10_22=='_'||(LA10_22 >= 'a' && LA10_22 <= 'z')) ) {
						alt10=13;
					}

					else {
						alt10=9;
					}

				}

				else {
					alt10=13;
				}

			}

			else {
				alt10=13;
			}

			}
			break;
		case 'I':
			{
			int LA10_10 = input.LA(2);
			if ( (LA10_10=='N') ) {
				switch ( input.LA(3) ) {
				case 'P':
					{
					int LA10_23 = input.LA(4);
					if ( (LA10_23=='U') ) {
						int LA10_27 = input.LA(5);
						if ( (LA10_27=='T') ) {
							int LA10_30 = input.LA(6);
							if ( ((LA10_30 >= '0' && LA10_30 <= '9')||(LA10_30 >= 'A' && LA10_30 <= 'Z')||LA10_30=='_'||(LA10_30 >= 'a' && LA10_30 <= 'z')) ) {
								alt10=13;
							}

							else {
								alt10=10;
							}

						}

						else {
							alt10=13;
						}

					}

					else {
						alt10=13;
					}

					}
					break;
				case 'T':
					{
					int LA10_24 = input.LA(4);
					if ( (LA10_24=='E') ) {
						int LA10_28 = input.LA(5);
						if ( (LA10_28=='G') ) {
							int LA10_31 = input.LA(6);
							if ( (LA10_31=='E') ) {
								int LA10_33 = input.LA(7);
								if ( (LA10_33=='R') ) {
									int LA10_34 = input.LA(8);
									if ( ((LA10_34 >= '0' && LA10_34 <= '9')||(LA10_34 >= 'A' && LA10_34 <= 'Z')||LA10_34=='_'||(LA10_34 >= 'a' && LA10_34 <= 'z')) ) {
										alt10=13;
									}

									else {
										alt10=11;
									}

								}

								else {
									alt10=13;
								}

							}

							else {
								alt10=13;
							}

						}

						else {
							alt10=13;
						}

					}

					else {
						alt10=13;
					}

					}
					break;
				default:
					alt10=13;
				}
			}

			else {
				alt10=13;
			}

			}
			break;
		case 'L':
			{
			int LA10_11 = input.LA(2);
			if ( (LA10_11=='E') ) {
				int LA10_21 = input.LA(3);
				if ( (LA10_21=='T') ) {
					int LA10_25 = input.LA(4);
					if ( ((LA10_25 >= '0' && LA10_25 <= '9')||(LA10_25 >= 'A' && LA10_25 <= 'Z')||LA10_25=='_'||(LA10_25 >= 'a' && LA10_25 <= 'z')) ) {
						alt10=13;
					}

					else {
						alt10=12;
					}

				}

				else {
					alt10=13;
				}

			}

			else {
				alt10=13;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
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
			alt10=13;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt10=14;
			}
			break;
		case '\n':
		case '\r':
			{
			alt10=16;
			}
			break;
		case '\t':
		case ' ':
			{
			alt10=17;
			}
			break;
		case '\"':
			{
			alt10=18;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 10, 0, input);
			throw nvae;
		}
		switch (alt10) {
			case 1 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:10: T__14
				{
				mT__14(); 

				}
				break;
			case 2 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:16: T__15
				{
				mT__15(); 

				}
				break;
			case 3 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:22: T__16
				{
				mT__16(); 

				}
				break;
			case 4 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:28: T__17
				{
				mT__17(); 

				}
				break;
			case 5 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:34: T__18
				{
				mT__18(); 

				}
				break;
			case 6 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:40: T__19
				{
				mT__19(); 

				}
				break;
			case 7 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:46: T__20
				{
				mT__20(); 

				}
				break;
			case 8 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:52: T__21
				{
				mT__21(); 

				}
				break;
			case 9 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:58: T__22
				{
				mT__22(); 

				}
				break;
			case 10 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:64: T__23
				{
				mT__23(); 

				}
				break;
			case 11 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:70: T__24
				{
				mT__24(); 

				}
				break;
			case 12 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:76: T__25
				{
				mT__25(); 

				}
				break;
			case 13 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:82: ID
				{
				mID(); 

				}
				break;
			case 14 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:85: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:89: SINGLE_LINE_COMMENT
				{
				mSINGLE_LINE_COMMENT(); 

				}
				break;
			case 16 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:109: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 17 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:117: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:1:120: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}



}
