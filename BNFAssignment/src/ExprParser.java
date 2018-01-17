// $ANTLR 3.5.1 C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g 2017-10-26 10:51:49


import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ESC_SEQ", "HEX_DIGIT", "ID", 
		"INT", "NEWLINE", "OCTAL_ESC", "SINGLE_LINE_COMMENT", "STRING", "UNICODE_ESC", 
		"WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'END'", 
		"'INPUT'", "'INTEGER'", "'LET'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int c=0;
	List<String> idList=new ArrayList<>();




	// $ANTLR start "prog"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:22:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:22:5: ( ( stat )+ )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:22:9: ( stat )+
			{
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:22:9: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||(LA1_0 >= 22 && LA1_0 <= 25)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:22:9: stat
					{
					pushFollow(FOLLOW_stat_in_prog24);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:24:1: stat : ( 'END' | 'INPUT' inputValue ( ',' inputValue )* NEWLINE | 'LET' ID '=' expr NEWLINE | 'INTEGER' variable ( ',' variable )* NEWLINE | command ID NEWLINE | command expr NEWLINE | command stringLiteral NEWLINE );
	public final void stat() throws RecognitionException {
		Token ID1=null;
		Token ID4=null;
		int expr2 =0;
		String command3 =null;
		String command5 =null;
		int expr6 =0;
		String command7 =null;
		String stringLiteral8 =null;

		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:24:5: ( 'END' | 'INPUT' inputValue ( ',' inputValue )* NEWLINE | 'LET' ID '=' expr NEWLINE | 'INTEGER' variable ( ',' variable )* NEWLINE | command ID NEWLINE | command expr NEWLINE | command stringLiteral NEWLINE )
			int alt4=7;
			switch ( input.LA(1) ) {
			case 22:
				{
				alt4=1;
				}
				break;
			case 23:
				{
				alt4=2;
				}
				break;
			case 25:
				{
				alt4=3;
				}
				break;
			case 24:
				{
				alt4=4;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case ID:
					{
					int LA4_6 = input.LA(3);
					if ( (LA4_6==NEWLINE) ) {
						alt4=5;
					}
					else if ( ((LA4_6 >= 16 && LA4_6 <= 17)||(LA4_6 >= 19 && LA4_6 <= 20)) ) {
						alt4=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case INT:
				case 14:
					{
					alt4=6;
					}
					break;
				case STRING:
					{
					alt4=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:24:10: 'END'
					{
					match(input,22,FOLLOW_22_in_stat52); 
					System.exit(0);
					}
					break;
				case 2 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:26:4: 'INPUT' inputValue ( ',' inputValue )* NEWLINE
					{
					match(input,23,FOLLOW_23_in_stat61); 
					pushFollow(FOLLOW_inputValue_in_stat63);
					inputValue();
					state._fsp--;

					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:26:23: ( ',' inputValue )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==18) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:26:24: ',' inputValue
							{
							match(input,18,FOLLOW_18_in_stat66); 
							pushFollow(FOLLOW_inputValue_in_stat67);
							inputValue();
							state._fsp--;

							}
							break;

						default :
							break loop2;
						}
					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat71); 

						try
						{
							String inputLine=br.readLine();
							String[] inputArray=inputLine.split(" ");
							if(inputArray.length==1)
							{
								//System.out.println(idList.get(c)+" "+ Integer.parseInt(inputArray[0]));
								memory.put(idList.get(c),Integer.parseInt(inputArray[0]));
								c+=1;
							}
							else
							{
							for(int i=0;i<inputArray.length;i++)
							{
								//System.out.println(idList.get(c)+" "+ Integer.parseInt(inputArray[i]));
								memory.put(idList.get(c),Integer.parseInt(inputArray[i]));
								c+=1;
							}
							c=0;
							}
						}
						catch(Exception e)
						{
							System.err.println(e.getMessage());
						}
						
					}
					break;
				case 3 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:56:4: 'LET' ID '=' expr NEWLINE
					{
					match(input,25,FOLLOW_25_in_stat83); 
					ID1=(Token)match(input,ID,FOLLOW_ID_in_stat85); 
					match(input,21,FOLLOW_21_in_stat87); 
					pushFollow(FOLLOW_expr_in_stat89);
					expr2=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat91); 

						   	if(memory.containsKey((ID1!=null?ID1.getText():null)))
					        	{
					        		memory.put((ID1!=null?ID1.getText():null),expr2);
					        	}
					        	else
					        	{
					        		System.err.println("Variable has not been declared");
					        		throw new RecognitionException();

					        	}
						   
					}
					break;
				case 4 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:71:11: 'INTEGER' variable ( ',' variable )* NEWLINE
					{
					match(input,24,FOLLOW_24_in_stat122); 
					pushFollow(FOLLOW_variable_in_stat124);
					variable();
					state._fsp--;

					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:71:30: ( ',' variable )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==18) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:71:31: ',' variable
							{
							match(input,18,FOLLOW_18_in_stat127); 
							pushFollow(FOLLOW_variable_in_stat129);
							variable();
							state._fsp--;

							}
							break;

						default :
							break loop3;
						}
					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat133); 
					}
					break;
				case 5 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:75:12: command ID NEWLINE
					{
					pushFollow(FOLLOW_command_in_stat163);
					command3=command();
					state._fsp--;

					ID4=(Token)match(input,ID,FOLLOW_ID_in_stat165); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat167); 

					          	if (command3.equals("PRINTLN")) 
					     		 {   
					     		 	if(memory.containsKey((ID4!=null?ID4.getText():null)))
					        		   System.out.println(memory.get((ID4!=null?ID4.getText():null)));
					        		 else
					        		 {
					        			 System.err.println("variable does not exist");
					        		 throw new RecognitionException();
					        		   
					        		   }
					        	 }
					        	 if(command3.equals("PRINT"))
					        	 {
					          		 if(memory.containsKey((ID4!=null?ID4.getText():null)))
					        		   System.out.print(memory.get((ID4!=null?ID4.getText():null)));
					        		 else
					        		 {
					        		   System.err.print("variable does not exist");
					        		   throw new RecognitionException();
					        		   }
					                 }
					          
					}
					break;
				case 6 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:99:12: command expr NEWLINE
					{
					pushFollow(FOLLOW_command_in_stat203);
					command5=command();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_stat205);
					expr6=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat207); 

					          	if (command5.equals("PRINTLN")) 
					     		 {
					        		System.out.println(expr6);
					        	 }
					        	 if(command5.equals("PRINT"))
					        	 {
					          		 System.out.print(expr6);
					                 }
					          
					}
					break;
				case 7 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:112:14: command stringLiteral NEWLINE
					{
					pushFollow(FOLLOW_command_in_stat256);
					command7=command();
					state._fsp--;

					pushFollow(FOLLOW_stringLiteral_in_stat258);
					stringLiteral8=stringLiteral();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat260); 
					 
					     		 if (command7.equals("PRINTLN")) 
					     		 {
					        		System.out.println(String.valueOf(stringLiteral8));
					        	 }
					        	 if(command7.equals("PRINT"))
					        	 {
					          		 System.out.print(String.valueOf(stringLiteral8));
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "inputValue"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:128:1: inputValue : ID ;
	public final void inputValue() throws RecognitionException {
		Token ID9=null;

		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:129:2: ( ID )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:129:4: ID
			{
			ID9=(Token)match(input,ID,FOLLOW_ID_in_inputValue295); 

					if(memory.containsKey((ID9!=null?ID9.getText():null)))
					{
						idList.add(String.valueOf((ID9!=null?ID9.getText():null)));
						
					}
					else
					{
						System.err.println("Incorrect variable!");
						throw new RecognitionException();
					
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inputValue"



	// $ANTLR start "variable"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:144:1: variable : ID ;
	public final void variable() throws RecognitionException {
		Token ID10=null;

		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:144:9: ( ID )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:144:11: ID
			{
			ID10=(Token)match(input,ID,FOLLOW_ID_in_variable307); 

			        	if(memory.containsKey((ID10!=null?ID10.getText():null)))
			        	{
			        		System.err.println("The variable name is already in use!");
			        	}
			        	else
			        	{
			        		memory.put((ID10!=null?ID10.getText():null),0);
			        	}
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variable"



	// $ANTLR start "command"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:157:1: command returns [String commandName] : ID ;
	public final String command() throws RecognitionException {
		String commandName = null;


		Token ID11=null;

		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:158:5: ( ID )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:158:10: ID
			{
			ID11=(Token)match(input,ID,FOLLOW_ID_in_command331); 
			 commandName = (ID11!=null?ID11.getText():null); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return commandName;
	}
	// $ANTLR end "command"



	// $ANTLR start "stringLiteral"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:162:1: stringLiteral returns [String literal] : STRING ;
	public final String stringLiteral() throws RecognitionException {
		String literal = null;


		Token STRING12=null;

		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:163:5: ( STRING )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:163:9: STRING
			{
			STRING12=(Token)match(input,STRING,FOLLOW_STRING_in_stringLiteral361); 
			 String clippedValue= String.valueOf((STRING12!=null?STRING12.getText():null)).replaceAll("\"","");
			        
			       literal = clippedValue; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return literal;
	}
	// $ANTLR end "stringLiteral"



	// $ANTLR start "expr"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:175:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:176:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:176:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr402);
			e=multExpr();
			state._fsp--;

			value = e;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:177:9: ( '+' e= multExpr | '-' e= multExpr )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==17) ) {
					alt5=1;
				}
				else if ( (LA5_0==19) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:177:13: '+' e= multExpr
					{
					match(input,17,FOLLOW_17_in_expr418); 
					pushFollow(FOLLOW_multExpr_in_expr422);
					e=multExpr();
					state._fsp--;

					value += e;   
					}
					break;
				case 2 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:178:13: '-' e= multExpr
					{
					match(input,19,FOLLOW_19_in_expr438); 
					pushFollow(FOLLOW_multExpr_in_expr442);
					e=multExpr();
					state._fsp--;

					value -= e;
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:184:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:185:5: (e= atom ( '*' e= atom | '/' e= atom )* )
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:185:9: e= atom ( '*' e= atom | '/' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr486);
			e=atom();
			state._fsp--;

			value = e;
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:185:37: ( '*' e= atom | '/' e= atom )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==16) ) {
					alt6=1;
				}
				else if ( (LA6_0==20) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:185:38: '*' e= atom
					{
					match(input,16,FOLLOW_16_in_multExpr491); 
					pushFollow(FOLLOW_atom_in_multExpr495);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;
				case 2 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:186:8: '/' e= atom
					{
					match(input,20,FOLLOW_20_in_multExpr506); 
					pushFollow(FOLLOW_atom_in_multExpr510);
					e=atom();
					state._fsp--;

					if (e != 0) value /= e; 
					                else System.err.println("Attempted Division by 0!");
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:190:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT13=null;
		Token ID14=null;
		int expr15 =0;

		try {
			// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:191:5: ( INT | ID | '(' expr ')' )
			int alt7=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt7=1;
				}
				break;
			case ID:
				{
				alt7=2;
				}
				break;
			case 14:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:191:9: INT
					{
					INT13=(Token)match(input,INT,FOLLOW_INT_in_atom538); 
					value = Integer.parseInt((INT13!=null?INT13.getText():null));
					}
					break;
				case 2 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:192:9: ID
					{
					ID14=(Token)match(input,ID,FOLLOW_ID_in_atom550); 

					        Integer v = (Integer)memory.get((ID14!=null?ID14.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(ID14!=null?ID14.getText():null));
					        
					}
					break;
				case 3 :
					// C:\\Users\\sujeeth\\Documents\\Antlr\\Expr.g:198:9: '(' expr ')'
					{
					match(input,14,FOLLOW_14_in_atom570); 
					pushFollow(FOLLOW_expr_in_atom572);
					expr15=expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_atom574); 
					value = expr15;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog24 = new BitSet(new long[]{0x0000000003C00042L});
	public static final BitSet FOLLOW_22_in_stat52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_stat61 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_inputValue_in_stat63 = new BitSet(new long[]{0x0000000000040100L});
	public static final BitSet FOLLOW_18_in_stat66 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_inputValue_in_stat67 = new BitSet(new long[]{0x0000000000040100L});
	public static final BitSet FOLLOW_NEWLINE_in_stat71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stat83 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_stat85 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stat87 = new BitSet(new long[]{0x00000000000040C0L});
	public static final BitSet FOLLOW_expr_in_stat89 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_stat91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_stat122 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_variable_in_stat124 = new BitSet(new long[]{0x0000000000040100L});
	public static final BitSet FOLLOW_18_in_stat127 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_variable_in_stat129 = new BitSet(new long[]{0x0000000000040100L});
	public static final BitSet FOLLOW_NEWLINE_in_stat133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_stat163 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_stat165 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_stat167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_stat203 = new BitSet(new long[]{0x00000000000040C0L});
	public static final BitSet FOLLOW_expr_in_stat205 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_stat207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_stat256 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_stringLiteral_in_stat258 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NEWLINE_in_stat260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_inputValue295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_variable307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_command331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_stringLiteral361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr402 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_17_in_expr418 = new BitSet(new long[]{0x00000000000040C0L});
	public static final BitSet FOLLOW_multExpr_in_expr422 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_19_in_expr438 = new BitSet(new long[]{0x00000000000040C0L});
	public static final BitSet FOLLOW_multExpr_in_expr442 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_atom_in_multExpr486 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_16_in_multExpr491 = new BitSet(new long[]{0x00000000000040C0L});
	public static final BitSet FOLLOW_atom_in_multExpr495 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_20_in_multExpr506 = new BitSet(new long[]{0x00000000000040C0L});
	public static final BitSet FOLLOW_atom_in_multExpr510 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_INT_in_atom538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_atom570 = new BitSet(new long[]{0x00000000000040C0L});
	public static final BitSet FOLLOW_expr_in_atom572 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom574 = new BitSet(new long[]{0x0000000000000002L});
}
