// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-27 01:09:45

package dev.tclark.dogshow.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class testLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ATOM=4;
	public static final int BREED_COUNT=5;
	public static final int BREED_NAME=6;
	public static final int BREED_NAME_SUFFIX=7;
	public static final int COMMENT=8;
	public static final int DATE=9;
	public static final int ELLIPSIS=10;
	public static final int END_PUNCTUATION=11;
	public static final int FRAG_BREED_NAME_ALT=12;
	public static final int FRAG_BREED_NAME_CATEGORY=13;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=14;
	public static final int FRAG_BREED_NAME_SINGLE=15;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=16;
	public static final int FRAG_GROUP_NAME=17;
	public static final int FRAG_MONTH=18;
	public static final int FRAG_PAREN_LEFT=19;
	public static final int FRAG_PAREN_RIGHT=20;
	public static final int FRAG_PROPER_NAME=21;
	public static final int FRAG_RING=22;
	public static final int FRAG_SPECIAL_GROUP_NAME=23;
	public static final int FRAG_SPEC_CHAR=24;
	public static final int FRAG_SPEC_WORD_CHAR=25;
	public static final int FRAG_TIME_LABEL=26;
	public static final int FRAG_TITLE=27;
	public static final int FRAG_WEEK_DAY=28;
	public static final int GROUP_RING=29;
	public static final int INT=30;
	public static final int JUDGE_NAME=31;
	public static final int JUNIOR_CLASS=32;
	public static final int PARENTHETICAL=33;
	public static final int PARENTHETICAL_INT=34;
	public static final int PARENTHETICAL_NAME=35;
	public static final int PHONE_NUMBER=36;
	public static final int PROPER_NAME=37;
	public static final int RING_TITLE=38;
	public static final int SPECIAL_SUFFIX=39;
	public static final int STANDALONE_COMMENT=40;
	public static final int TIME=41;
	public static final int WORD=42;
	public static final int WS=43;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public testLexer() {} 
	public testLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public testLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g"; }

	// $ANTLR start "JUNIOR_CLASS"
	public final void mJUNIOR_CLASS() throws RecognitionException {
		try {
			int _type = JUNIOR_CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:100:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
			int alt1=7;
			switch ( input.LA(1) ) {
			case 'M':
				{
				alt1=1;
				}
				break;
			case 'O':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='p') ) {
					int LA1_4 = input.LA(3);
					if ( (LA1_4=='e') ) {
						int LA1_6 = input.LA(4);
						if ( (LA1_6=='n') ) {
							int LA1_8 = input.LA(5);
							if ( (LA1_8==' ') ) {
								switch ( input.LA(6) ) {
								case 'S':
									{
									alt1=2;
									}
									break;
								case 'I':
									{
									alt1=3;
									}
									break;
								case 'J':
									{
									alt1=4;
									}
									break;
								default:
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 1, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 1, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 1, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 1, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='o') ) {
					int LA1_5 = input.LA(3);
					if ( (LA1_5=='v') ) {
						int LA1_7 = input.LA(4);
						if ( (LA1_7=='i') ) {
							int LA1_9 = input.LA(5);
							if ( (LA1_9=='c') ) {
								int LA1_11 = input.LA(6);
								if ( (LA1_11=='e') ) {
									int LA1_15 = input.LA(7);
									if ( (LA1_15==' ') ) {
										switch ( input.LA(8) ) {
										case 'S':
											{
											alt1=5;
											}
											break;
										case 'J':
											{
											alt1=6;
											}
											break;
										case 'I':
											{
											alt1=7;
											}
											break;
										default:
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 1, 16, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 1, 15, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 1, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 1, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 1, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 1, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:100:9: 'Master Class'
					{
					match("Master Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:101:9: 'Open Senior'
					{
					match("Open Senior"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:102:9: 'Open Intermediate'
					{
					match("Open Intermediate"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:103:9: 'Open Junior'
					{
					match("Open Junior"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:104:9: 'Novice Senior'
					{
					match("Novice Senior"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:105:9: 'Novice Junior'
					{
					match("Novice Junior"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:106:9: 'Novice Intermediate'
					{
					match("Novice Intermediate"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JUNIOR_CLASS"

	// $ANTLR start "BREED_NAME"
	public final void mBREED_NAME() throws RecognitionException {
		try {
			int _type = BREED_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:5: ( ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:9: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:9: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= 'A' && LA2_0 <= 'P')||(LA2_0 >= 'R' && LA2_0 <= 'T')||(LA2_0 >= 'W' && LA2_0 <= 'Y')) ) {
				alt2=1;
			}
			else if ( (LA2_0=='V') ) {
				int LA2_2 = input.LA(2);
				if ( (LA2_2=='i') ) {
					alt2=1;
				}
				else if ( (LA2_2=='e') ) {
					alt2=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:10: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:33: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:54: ( 's' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='s') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:54: 's'
					{
					match('s'); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:59: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:59: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:63: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='(') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='M') ) {
					int LA7_3 = input.LA(3);
					if ( (LA7_3=='i') ) {
						int LA7_5 = input.LA(4);
						if ( (LA7_5=='n') ) {
							alt7=1;
						}
					}
				}
				else if ( (LA7_1=='1'||(LA7_1 >= 'B' && LA7_1 <= 'C')||(LA7_1 >= 'E' && LA7_1 <= 'G')||LA7_1=='I'||(LA7_1 >= 'K' && LA7_1 <= 'L')||LA7_1=='N'||(LA7_1 >= 'R' && LA7_1 <= 'T')||LA7_1=='W') ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:64: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); 
					mFRAG_BREED_NAME_CATEGORY(); 

					match(')'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:97: ( WS )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:97: WS
							{
							mWS(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:101: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= 'A' && LA6_0 <= 'B')||LA6_0=='P') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:101: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); 

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:137: ( BREED_NAME_SUFFIX )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='(') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:137: BREED_NAME_SUFFIX
					{
					mBREED_NAME_SUFFIX(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREED_NAME"

	// $ANTLR start "SPECIAL_SUFFIX"
	public final void mSPECIAL_SUFFIX() throws RecognitionException {
		try {
			int _type = SPECIAL_SUFFIX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:102:5: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:102:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:102:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:102:10: FRAG_BREED_NAME_SPECIAL_SUFFIX
			{
			mFRAG_BREED_NAME_SPECIAL_SUFFIX(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIAL_SUFFIX"

	// $ANTLR start "BREED_NAME_SUFFIX"
	public final void mBREED_NAME_SUFFIX() throws RecognitionException {
		try {
			int _type = BREED_NAME_SUFFIX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:105:5: ( '(Misc. Dog)' | '(Misc. Dogs)' | '(Misc. Bitch)' | '(Misc. Bitches)' )
			int alt9=4;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='(') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='M') ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2=='i') ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3=='s') ) {
							int LA9_4 = input.LA(5);
							if ( (LA9_4=='c') ) {
								int LA9_5 = input.LA(6);
								if ( (LA9_5=='.') ) {
									int LA9_6 = input.LA(7);
									if ( (LA9_6==' ') ) {
										int LA9_7 = input.LA(8);
										if ( (LA9_7=='D') ) {
											int LA9_8 = input.LA(9);
											if ( (LA9_8=='o') ) {
												int LA9_10 = input.LA(10);
												if ( (LA9_10=='g') ) {
													int LA9_12 = input.LA(11);
													if ( (LA9_12==')') ) {
														alt9=1;
													}
													else if ( (LA9_12=='s') ) {
														alt9=2;
													}
													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++)
																input.consume();
															NoViableAltException nvae =
																new NoViableAltException("", 9, 12, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}
												}
												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 9, 10, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}
											}
											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 9, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else if ( (LA9_7=='B') ) {
											int LA9_9 = input.LA(9);
											if ( (LA9_9=='i') ) {
												int LA9_11 = input.LA(10);
												if ( (LA9_11=='t') ) {
													int LA9_13 = input.LA(11);
													if ( (LA9_13=='c') ) {
														int LA9_16 = input.LA(12);
														if ( (LA9_16=='h') ) {
															int LA9_17 = input.LA(13);
															if ( (LA9_17==')') ) {
																alt9=3;
															}
															else if ( (LA9_17=='e') ) {
																alt9=4;
															}
															else {
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++)
																		input.consume();
																	NoViableAltException nvae =
																		new NoViableAltException("", 9, 17, input);
																	throw nvae;
																} finally {
																	input.rewind(nvaeMark);
																}
															}
														}
														else {
															int nvaeMark = input.mark();
															try {
																for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++)
																	input.consume();
																NoViableAltException nvae =
																	new NoViableAltException("", 9, 16, input);
																throw nvae;
															} finally {
																input.rewind(nvaeMark);
															}
														}
													}
													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++)
																input.consume();
															NoViableAltException nvae =
																new NoViableAltException("", 9, 13, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}
												}
												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 9, 11, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}
											}
											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 9, 9, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 9, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 9, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 9, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 9, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 9, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:105:9: '(Misc. Dog)'
					{
					match("(Misc. Dog)"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:105:23: '(Misc. Dogs)'
					{
					match("(Misc. Dogs)"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:105:38: '(Misc. Bitch)'
					{
					match("(Misc. Bitch)"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:105:54: '(Misc. Bitches)'
					{
					match("(Misc. Bitches)"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREED_NAME_SUFFIX"

	// $ANTLR start "FRAG_BREED_NAME_SPECIAL_SUFFIX"
	public final void mFRAG_BREED_NAME_SPECIAL_SUFFIX() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:108:5: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:108:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:108:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			int alt10=4;
			switch ( input.LA(1) ) {
			case 'S':
				{
				alt10=1;
				}
				break;
			case 'E':
				{
				int LA10_2 = input.LA(2);
				if ( (LA10_2=='n') ) {
					int LA10_4 = input.LA(3);
					if ( (LA10_4=='t') ) {
						int LA10_5 = input.LA(4);
						if ( (LA10_5=='r') ) {
							int LA10_6 = input.LA(5);
							if ( (LA10_6=='y') ) {
								alt10=2;
							}
							else if ( (LA10_6=='i') ) {
								alt10=3;
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 10, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 10, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 10, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'V':
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:108:10: 'Sweepstakes'
					{
					match("Sweepstakes"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:108:24: 'Entry'
					{
					match("Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:108:32: 'Entries'
					{
					match("Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:108:42: 'Veterans'
					{
					match("Veterans"); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_SPECIAL_SUFFIX"

	// $ANTLR start "FRAG_BREED_NAME_ALT"
	public final void mFRAG_BREED_NAME_ALT() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:109:29: ( 'Veteran Dog' | 'Veteran Bitch' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='V') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='e') ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2=='t') ) {
						int LA11_3 = input.LA(4);
						if ( (LA11_3=='e') ) {
							int LA11_4 = input.LA(5);
							if ( (LA11_4=='r') ) {
								int LA11_5 = input.LA(6);
								if ( (LA11_5=='a') ) {
									int LA11_6 = input.LA(7);
									if ( (LA11_6=='n') ) {
										int LA11_7 = input.LA(8);
										if ( (LA11_7==' ') ) {
											int LA11_8 = input.LA(9);
											if ( (LA11_8=='D') ) {
												alt11=1;
											}
											else if ( (LA11_8=='B') ) {
												alt11=2;
											}
											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 11, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 11, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 11, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 11, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 11, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 11, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:109:33: 'Veteran Dog'
					{
					match("Veteran Dog"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:109:47: 'Veteran Bitch'
					{
					match("Veteran Bitch"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_ALT"

	// $ANTLR start "FRAG_BREED_NAME_CATEGORY_SUFFIX"
	public final void mFRAG_BREED_NAME_CATEGORY_SUFFIX() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
			int alt12=3;
			switch ( input.LA(1) ) {
			case 'A':
				{
				alt12=1;
				}
				break;
			case 'P':
				{
				alt12=2;
				}
				break;
			case 'B':
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:9: 'Ascob'
					{
					match("Ascob"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:17: 'Parti-Color'
					{
					match("Parti-Color"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:31: 'Black'
					{
					match("Black"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_CATEGORY_SUFFIX"

	// $ANTLR start "FRAG_BREED_NAME_CATEGORY"
	public final void mFRAG_BREED_NAME_CATEGORY() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:113:5: ( '13 Inch' | '15 Inch' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'White' | 'Wire' | 'Wirehaired' )
			int alt13=34;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:114:9: '13 Inch'
					{
					match("13 Inch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:115:9: '15 Inch'
					{
					match("15 Inch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:116:9: 'Boykin'
					{
					match("Boykin"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:117:9: 'B & P C'
					{
					match("B & P C"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:118:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:119:9: 'Clumber'
					{
					match("Clumber"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:120:9: 'Cocker'
					{
					match("Cocker"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:9: 'Colored'
					{
					match("Colored"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:122:9: 'Curly-Coated'
					{
					match("Curly-Coated"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:123:9: 'English'
					{
					match("English"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:124:9: 'English Cocker'
					{
					match("English Cocker"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:125:9: 'English Springer'
					{
					match("English Springer"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:9: 'Field'
					{
					match("Field"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:127:9: 'Flat-Coated'
					{
					match("Flat-Coated"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:128:9: 'German Shorthaired'
					{
					match("German Shorthaired"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:129:9: 'German Wirehaired'
					{
					match("German Wirehaired"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:130:9: 'Golden'
					{
					match("Golden"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:131:9: 'Gordon'
					{
					match("Gordon"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:132:9: 'Irish'
					{
					match("Irish"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:133:9: 'K C & R'
					{
					match("K C & R"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:9: 'Labrador'
					{
					match("Labrador"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:9: 'Long Coat'
					{
					match("Long Coat"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:136:9: 'Longhaired'
					{
					match("Longhaired"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:137:9: 'Miniature'
					{
					match("Miniature"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:139:9: 'Rough'
					{
					match("Rough"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:140:9: 'Smooth'
					{
					match("Smooth"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:9: 'Smooth Coat'
					{
					match("Smooth Coat"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:142:9: 'Standard'
					{
					match("Standard"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:143:9: 'Sussex'
					{
					match("Sussex"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:9: 'Toy'
					{
					match("Toy"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:145:9: 'White'
					{
					match("White"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:146:9: 'Wire'
					{
					match("Wire"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:147:9: 'Wirehaired'
					{
					match("Wirehaired"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_CATEGORY"

	// $ANTLR start "FRAG_GROUP_NAME"
	public final void mFRAG_GROUP_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:2: ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | 'BEST IN SHOW' )
			int alt14=8;
			switch ( input.LA(1) ) {
			case 'H':
				{
				int LA14_1 = input.LA(2);
				if ( (LA14_1=='E') ) {
					alt14=1;
				}
				else if ( (LA14_1=='O') ) {
					alt14=6;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'T':
				{
				int LA14_2 = input.LA(2);
				if ( (LA14_2=='E') ) {
					alt14=2;
				}
				else if ( (LA14_2=='O') ) {
					alt14=5;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				alt14=3;
				}
				break;
			case 'S':
				{
				alt14=4;
				}
				break;
			case 'W':
				{
				alt14=7;
				}
				break;
			case 'B':
				{
				alt14=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:4: 'HERDING GROUP'
					{
					match("HERDING GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:156:3: 'TERRIER GROUP'
					{
					match("TERRIER GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:157:3: 'NON-SPORTING GROUP'
					{
					match("NON-SPORTING GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:158:3: 'SPORTING GROUP'
					{
					match("SPORTING GROUP"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:3: 'TOY GROUP'
					{
					match("TOY GROUP"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:160:3: 'HOUND GROUP'
					{
					match("HOUND GROUP"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:161:3: 'WORKING GROUP'
					{
					match("WORKING GROUP"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:3: 'BEST IN SHOW'
					{
					match("BEST IN SHOW"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_GROUP_NAME"

	// $ANTLR start "FRAG_SPECIAL_GROUP_NAME"
	public final void mFRAG_SPECIAL_GROUP_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:165:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'Toy Variety Group' )
			int alt15=3;
			switch ( input.LA(1) ) {
			case 'V':
				{
				alt15=1;
				}
				break;
			case 'S':
				{
				alt15=2;
				}
				break;
			case 'T':
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:167:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:168:3: 'Toy Variety Group'
					{
					match("Toy Variety Group"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_SPECIAL_GROUP_NAME"

	// $ANTLR start "GROUP_RING"
	public final void mGROUP_RING() throws RecognitionException {
		try {
			int _type = GROUP_RING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:2: ( ( FRAG_GROUP_NAME ' - ' JUDGE_NAME ) | FRAG_SPECIAL_GROUP_NAME )
			int alt16=2;
			switch ( input.LA(1) ) {
			case 'B':
			case 'H':
			case 'N':
			case 'W':
				{
				alt16=1;
				}
				break;
			case 'T':
				{
				int LA16_2 = input.LA(2);
				if ( (LA16_2=='E'||LA16_2=='O') ) {
					alt16=1;
				}
				else if ( (LA16_2=='o') ) {
					alt16=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA16_3 = input.LA(2);
				if ( (LA16_3=='P') ) {
					alt16=1;
				}
				else if ( (LA16_3=='W') ) {
					alt16=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'V':
				{
				alt16=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:5: FRAG_GROUP_NAME ' - ' JUDGE_NAME
					{
					mFRAG_GROUP_NAME(); 

					match(" - "); 

					mJUDGE_NAME(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:39: FRAG_SPECIAL_GROUP_NAME
					{
					mFRAG_SPECIAL_GROUP_NAME(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP_RING"

	// $ANTLR start "FRAG_BREED_NAME_SINGLE"
	public final void mFRAG_BREED_NAME_SINGLE() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:174:5: ( ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:174:6: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:174:6: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt17=190;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:174:7: 'Affenpinscher'
					{
					match("Affenpinscher"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:175:5: 'Afghan Hound'
					{
					match("Afghan Hound"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:176:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:5: 'Akita'
					{
					match("Akita"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:179:5: 'American English Coonhound'
					{
					match("American English Coonhound"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:5: 'American Foxhound'
					{
					match("American Foxhound"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:183:5: 'American Water Spaniel'
					{
					match("American Water Spaniel"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:5: 'Australian Terrier'
					{
					match("Australian Terrier"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:188:5: 'Basenji'
					{
					match("Basenji"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:5: 'Basset Hound'
					{
					match("Basset Hound"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:5: 'Beagle'
					{
					match("Beagle"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:191:5: 'Bearded Collie'
					{
					match("Bearded Collie"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:5: 'Beauceron'
					{
					match("Beauceron"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:198:5: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:199:5: 'Bichons Frise'
					{
					match("Bichons Frise"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:202:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:5: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:205:5: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:5: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:5: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:5: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:5: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:5: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:5: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:214:5: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:215:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:5: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:5: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:218:5: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:219:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:5: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:221:5: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:224:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:225:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:226:5: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:5: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:5: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:5: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:5: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:5: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:5: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:5: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:5: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:5: 'Fox Terrier'
					{
					match("Fox Terrier"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:5: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:5: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:5: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:5: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:263:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:5: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:5: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:5: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:5: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:272:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:273:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:275:5: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:276:5: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:277:5: 'Keeshonden'
					{
					match("Keeshonden"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:283:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:5: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:286:5: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:287:5: 'Lowchen'
					{
					match("Lowchen"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:289:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:290:5: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:292:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:5: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:5: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:5: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:5: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:308:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:309:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:5: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:312:5: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:5: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:5: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:5: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:5: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:5: 'Pulik'
					{
					match("Pulik"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:5: 'Retrievers'
					{
					match("Retrievers"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:5: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:5: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:5: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:5: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:5: 'Setters'
					{
					match("Setters"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:5: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:5: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:5: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:5: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:341:5: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:342:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:343:5: 'Spaniels'
					{
					match("Spaniels"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:345:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:354:5: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:5: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:357:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:5: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:360:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:5: 'Yorkshire Terrier'
					{
					match("Yorkshire Terrier"); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_SINGLE"

	// $ANTLR start "FRAG_MONTH"
	public final void mFRAG_MONTH() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt18=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt18=1;
					}
					break;
				case 'A':
					{
					alt18=2;
					}
					break;
				case 'u':
					{
					int LA18_11 = input.LA(3);
					if ( (LA18_11=='n') ) {
						alt18=11;
					}
					else if ( (LA18_11=='l') ) {
						alt18=13;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 18, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'U':
					{
					int LA18_12 = input.LA(3);
					if ( (LA18_12=='N') ) {
						alt18=12;
					}
					else if ( (LA18_12=='L') ) {
						alt18=14;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 18, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA18_2 = input.LA(2);
				if ( (LA18_2=='e') ) {
					alt18=3;
				}
				else if ( (LA18_2=='E') ) {
					alt18=4;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA18_3 = input.LA(2);
				if ( (LA18_3=='a') ) {
					int LA18_15 = input.LA(3);
					if ( (LA18_15=='r') ) {
						alt18=5;
					}
					else if ( (LA18_15=='y') ) {
						alt18=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 18, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA18_3=='A') ) {
					int LA18_16 = input.LA(3);
					if ( (LA18_16=='R') ) {
						alt18=6;
					}
					else if ( (LA18_16=='Y') ) {
						alt18=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 18, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'A':
				{
				switch ( input.LA(2) ) {
				case 'p':
					{
					alt18=7;
					}
					break;
				case 'P':
					{
					alt18=8;
					}
					break;
				case 'u':
					{
					alt18=15;
					}
					break;
				case 'U':
					{
					alt18=16;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA18_5 = input.LA(2);
				if ( (LA18_5=='e') ) {
					alt18=17;
				}
				else if ( (LA18_5=='E') ) {
					alt18=18;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				int LA18_6 = input.LA(2);
				if ( (LA18_6=='c') ) {
					alt18=19;
				}
				else if ( (LA18_6=='C') ) {
					alt18=20;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA18_7 = input.LA(2);
				if ( (LA18_7=='o') ) {
					alt18=21;
				}
				else if ( (LA18_7=='O') ) {
					alt18=22;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA18_8 = input.LA(2);
				if ( (LA18_8=='e') ) {
					alt18=23;
				}
				else if ( (LA18_8=='E') ) {
					alt18=24;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:14: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:25: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:14: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:22: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:14: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:22: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:14: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:20: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:14: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:21: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:14: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:21: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:14: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:23: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:14: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:14: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:24: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:14: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:25: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:14: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:25: 'DECEMBER'
					{
					match("DECEMBER"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_MONTH"

	// $ANTLR start "FRAG_PAREN_LEFT"
	public final void mFRAG_PAREN_LEFT() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:29: ( ( '(' . ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:33: ( '(' . )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:33: ( '(' . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:34: '(' .
			{
			match('('); 
			matchAny(); 
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_PAREN_LEFT"

	// $ANTLR start "FRAG_PAREN_RIGHT"
	public final void mFRAG_PAREN_RIGHT() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:29: ( ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:33: ')'
			{
			match(')'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_PAREN_RIGHT"

	// $ANTLR start "END_PUNCTUATION"
	public final void mEND_PUNCTUATION() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:380:29: ( '!' | '?' | '.' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='.'||input.LA(1)=='?' ) {
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
	// $ANTLR end "END_PUNCTUATION"

	// $ANTLR start "FRAG_RING"
	public final void mFRAG_RING() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:25: ( 'RING' | 'Ring' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='R') ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1=='I') ) {
					alt19=1;
				}
				else if ( (LA19_1=='i') ) {
					alt19=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:29: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:36: 'Ring'
					{
					match("Ring"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_RING"

	// $ANTLR start "FRAG_SPEC_CHAR"
	public final void mFRAG_SPEC_CHAR() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( input.LA(1)=='\''||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='_'||input.LA(1)=='\u2019' ) {
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
	// $ANTLR end "FRAG_SPEC_CHAR"

	// $ANTLR start "FRAG_SPEC_WORD_CHAR"
	public final void mFRAG_SPEC_WORD_CHAR() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:9: '&'
			{
			match('&'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_SPEC_WORD_CHAR"

	// $ANTLR start "FRAG_TIME_LABEL"
	public final void mFRAG_TIME_LABEL() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:5: ( 'am' | 'pm' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='a') ) {
				alt20=1;
			}
			else if ( (LA20_0=='p') ) {
				alt20=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:14: 'pm'
					{
					match("pm"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_TIME_LABEL"

	// $ANTLR start "FRAG_TITLE"
	public final void mFRAG_TITLE() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
			int alt21=12;
			switch ( input.LA(1) ) {
			case 'M':
				{
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA21_4 = input.LA(3);
					if ( (LA21_4=='S') ) {
						alt21=3;
					}
					else {
						alt21=1;
					}
					}
					break;
				case 'r':
					{
					int LA21_5 = input.LA(3);
					if ( (LA21_5=='s') ) {
						alt21=4;
					}
					else {
						alt21=2;
					}
					}
					break;
				case 'S':
					{
					alt21=5;
					}
					break;
				case 's':
					{
					alt21=6;
					}
					break;
				case 'I':
					{
					alt21=7;
					}
					break;
				case 'i':
					{
					alt21=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2=='R') ) {
					alt21=9;
				}
				else if ( (LA21_2=='r') ) {
					alt21=10;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'C':
				{
				int LA21_3 = input.LA(2);
				if ( (LA21_3=='O') ) {
					alt21=11;
				}
				else if ( (LA21_3=='o') ) {
					alt21=12;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:9: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:14: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:9: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:15: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:9: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:14: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:9: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:16: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:10: 'DR'
					{
					match("DR"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:15: 'Dr'
					{
					match("Dr"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:9: 'COL'
					{
					match("COL"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:15: 'Col'
					{
					match("Col"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_TITLE"

	// $ANTLR start "FRAG_WEEK_DAY"
	public final void mFRAG_WEEK_DAY() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt22=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt22=1;
					}
					break;
				case 'U':
					{
					alt22=2;
					}
					break;
				case 'a':
					{
					alt22=13;
					}
					break;
				case 'A':
					{
					alt22=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA22_2 = input.LA(2);
				if ( (LA22_2=='o') ) {
					alt22=3;
				}
				else if ( (LA22_2=='O') ) {
					alt22=4;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'T':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt22=5;
					}
					break;
				case 'U':
					{
					alt22=6;
					}
					break;
				case 'h':
					{
					alt22=9;
					}
					break;
				case 'H':
					{
					alt22=10;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'W':
				{
				int LA22_4 = input.LA(2);
				if ( (LA22_4=='e') ) {
					alt22=7;
				}
				else if ( (LA22_4=='E') ) {
					alt22=8;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA22_5 = input.LA(2);
				if ( (LA22_5=='r') ) {
					alt22=11;
				}
				else if ( (LA22_5=='R') ) {
					alt22=12;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:9: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:18: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:9: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:19: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:9: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:9: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:20: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:9: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:18: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:9: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:20: 'SATURDAY'
					{
					match("SATURDAY"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_WEEK_DAY"

	// $ANTLR start "ATOM"
	public final void mATOM() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:5: ( ( WORD | INT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:9: ( WORD | INT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:9: ( WORD | INT )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= '&' && LA23_0 <= '\'')||(LA23_0 >= ',' && LA23_0 <= '-')||(LA23_0 >= ':' && LA23_0 <= ';')||(LA23_0 >= 'A' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'z')||LA23_0=='\u2019') ) {
				alt23=1;
			}
			else if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
				alt23=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:10: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:15: INT
					{
					mINT(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATOM"

	// $ANTLR start "BREED_COUNT"
	public final void mBREED_COUNT() throws RecognitionException {
		try {
			int _type = BREED_COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:17: INT '-' INT '-' INT '-' INT
			{
			mINT(); 

			match('-'); 
			mINT(); 

			match('-'); 
			mINT(); 

			match('-'); 
			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREED_COUNT"

	// $ANTLR start "JUDGE_NAME"
	public final void mJUDGE_NAME() throws RecognitionException {
		try {
			int _type = JUDGE_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:11: ( FRAG_TITLE ' ' PROPER_NAME ( PARENTHETICAL_NAME ' ' PROPER_NAME )* ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:13: FRAG_TITLE ' ' PROPER_NAME ( PARENTHETICAL_NAME ' ' PROPER_NAME )* ( PARENTHETICAL_INT )?
			{
			mFRAG_TITLE(); 

			match(' '); 
			mPROPER_NAME(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:40: ( PARENTHETICAL_NAME ' ' PROPER_NAME )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0=='(') ) {
					int LA24_1 = input.LA(2);
					if ( ((LA24_1 >= 'A' && LA24_1 <= 'Z')) ) {
						alt24=1;
					}

				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:41: PARENTHETICAL_NAME ' ' PROPER_NAME
					{
					mPARENTHETICAL_NAME(); 

					match(' '); 
					mPROPER_NAME(); 

					}
					break;

				default :
					break loop24;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:78: ( PARENTHETICAL_INT )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='(') ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:78: PARENTHETICAL_INT
					{
					mPARENTHETICAL_INT(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JUDGE_NAME"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:431:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:431:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:431:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt26=0;
			loop26:
			do {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||LA26_0=='\r'||LA26_0==' ') ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt26 >= 1 ) break loop26;
						EarlyExitException eee =
							new EarlyExitException(26, input);
						throw eee;
				}
				cnt26++;
			} while (true);

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "RING_TITLE"
	public final void mRING_TITLE() throws RecognitionException {
		try {
			int _type = RING_TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:13: ( 'GROUP RING' | ( 'RING' WS INT ) )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='G') ) {
				alt27=1;
			}
			else if ( (LA27_0=='R') ) {
				alt27=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:17: 'GROUP RING'
					{
					match("GROUP RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:30: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:30: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:31: 'RING' WS INT
					{
					match("RING"); 

					mWS(); 

					mINT(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RING_TITLE"

	// $ANTLR start "PHONE_NUMBER"
	public final void mPHONE_NUMBER() throws RecognitionException {
		try {
			int _type = PHONE_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
			{
			match('('); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			match(')'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:42: ( WS )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= '\t' && LA28_0 <= '\n')||LA28_0=='\r'||LA28_0==' ') ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:42: WS
					{
					mWS(); 

					}
					break;

			}

			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			match('-'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PHONE_NUMBER"

	// $ANTLR start "TIME"
	public final void mTIME() throws RecognitionException {
		try {
			int _type = TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:438:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:438:13: INT ':' INT WS FRAG_TIME_LABEL
			{
			mINT(); 

			match(':'); 
			mINT(); 

			mWS(); 

			mFRAG_TIME_LABEL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIME"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:440:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:440:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
			{
			mFRAG_WEEK_DAY(); 

			match(','); 
			mWS(); 

			mFRAG_MONTH(); 

			mWS(); 

			mINT(); 

			match(','); 
			mWS(); 

			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "ELLIPSIS"
	public final void mELLIPSIS() throws RecognitionException {
		try {
			int _type = ELLIPSIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:9: ( '.' ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:13: '.' ( '.' )+
			{
			match('.'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:17: ( '.' )+
			int cnt29=0;
			loop29:
			do {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0=='.') ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:17: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
						EarlyExitException eee =
							new EarlyExitException(29, input);
						throw eee;
				}
				cnt29++;
			} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELLIPSIS"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:6: ( '0' .. '9' )+
			int cnt30=0;
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= '0' && LA30_0 <= '9')) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
					if ( cnt30 >= 1 ) break loop30;
						EarlyExitException eee =
							new EarlyExitException(30, input);
						throw eee;
				}
				cnt30++;
			} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "STANDALONE_COMMENT"
	public final void mSTANDALONE_COMMENT() throws RecognitionException {
		try {
			int _type = STANDALONE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='L') ) {
				alt31=1;
			}
			else if ( (LA31_0=='V') ) {
				alt31=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:9: 'LUNCH'
					{
					match("LUNCH"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:17: 'VARIETY GROUP JUDGING'
					{
					match("VARIETY GROUP JUDGING"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STANDALONE_COMMENT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:9: ( ( WORD | PARENTHETICAL | INT )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:13: ( WORD | PARENTHETICAL | INT )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:13: ( WORD | PARENTHETICAL | INT )+
			int cnt32=0;
			loop32:
			do {
				int alt32=4;
				switch ( input.LA(1) ) {
				case '&':
				case '\'':
				case ',':
				case '-':
				case ':':
				case ';':
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
				case '\u2019':
					{
					alt32=1;
					}
					break;
				case '(':
					{
					alt32=2;
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
					alt32=3;
					}
					break;
				}
				switch (alt32) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:14: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:19: PARENTHETICAL
					{
					mPARENTHETICAL(); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:33: INT
					{
					mINT(); 

					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
						EarlyExitException eee =
							new EarlyExitException(32, input);
						throw eee;
				}
				cnt32++;
			} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:18: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:18: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt33=0;
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( ((LA33_0 >= '&' && LA33_0 <= '\'')||(LA33_0 >= ',' && LA33_0 <= '-')||(LA33_0 >= ':' && LA33_0 <= ';')||(LA33_0 >= 'A' && LA33_0 <= 'Z')||LA33_0=='_'||(LA33_0 >= 'a' && LA33_0 <= 'z')||LA33_0=='\u2019') ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= '&' && input.LA(1) <= '\'')||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u2019' ) {
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
					if ( cnt33 >= 1 ) break loop33;
						EarlyExitException eee =
							new EarlyExitException(33, input);
						throw eee;
				}
				cnt33++;
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORD"

	// $ANTLR start "PARENTHETICAL_NAME"
	public final void mPARENTHETICAL_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:28: ( '(' PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:30: '(' PROPER_NAME ')'
			{
			match('('); 
			mPROPER_NAME(); 

			match(')'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHETICAL_NAME"

	// $ANTLR start "PARENTHETICAL"
	public final void mPARENTHETICAL() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:5: ( FRAG_PAREN_LEFT ( ( WORD | INT ) ( WS )? )+ FRAG_PAREN_RIGHT ( FRAG_SPEC_CHAR )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:9: FRAG_PAREN_LEFT ( ( WORD | INT ) ( WS )? )+ FRAG_PAREN_RIGHT ( FRAG_SPEC_CHAR )?
			{
			mFRAG_PAREN_LEFT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:25: ( ( WORD | INT ) ( WS )? )+
			int cnt36=0;
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( ((LA36_0 >= '&' && LA36_0 <= '\'')||(LA36_0 >= ',' && LA36_0 <= '-')||(LA36_0 >= '0' && LA36_0 <= ';')||(LA36_0 >= 'A' && LA36_0 <= 'Z')||LA36_0=='_'||(LA36_0 >= 'a' && LA36_0 <= 'z')||LA36_0=='\u2019') ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:26: ( WORD | INT ) ( WS )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:26: ( WORD | INT )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( ((LA34_0 >= '&' && LA34_0 <= '\'')||(LA34_0 >= ',' && LA34_0 <= '-')||(LA34_0 >= ':' && LA34_0 <= ';')||(LA34_0 >= 'A' && LA34_0 <= 'Z')||LA34_0=='_'||(LA34_0 >= 'a' && LA34_0 <= 'z')||LA34_0=='\u2019') ) {
						alt34=1;
					}
					else if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
						alt34=2;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}
					switch (alt34) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:27: WORD
							{
							mWORD(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:32: INT
							{
							mINT(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:37: ( WS )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( ((LA35_0 >= '\t' && LA35_0 <= '\n')||LA35_0=='\r'||LA35_0==' ') ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:37: WS
							{
							mWS(); 

							}
							break;

					}

					}
					break;

				default :
					if ( cnt36 >= 1 ) break loop36;
						EarlyExitException eee =
							new EarlyExitException(36, input);
						throw eee;
				}
				cnt36++;
			} while (true);

			mFRAG_PAREN_RIGHT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:60: ( FRAG_SPEC_CHAR )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0=='\''||(LA37_0 >= ',' && LA37_0 <= '-')||(LA37_0 >= ':' && LA37_0 <= ';')||LA37_0=='_'||LA37_0=='\u2019') ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( input.LA(1)=='\''||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='_'||input.LA(1)=='\u2019' ) {
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHETICAL"

	// $ANTLR start "FRAG_PROPER_NAME"
	public final void mFRAG_PROPER_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:38: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop38:
			do {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( ((LA38_0 >= 'A' && LA38_0 <= 'Z')||(LA38_0 >= 'a' && LA38_0 <= 'z')) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop38;
				}
			} while (true);

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_PROPER_NAME"

	// $ANTLR start "PROPER_NAME"
	public final void mPROPER_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:21: ( FRAG_PROPER_NAME ( ' ' )? ( FRAG_PROPER_NAME ( ' ' )? )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:23: FRAG_PROPER_NAME ( ' ' )? ( FRAG_PROPER_NAME ( ' ' )? )*
			{
			mFRAG_PROPER_NAME(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:40: ( ' ' )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==' ') ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:40: ' '
					{
					match(' '); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:45: ( FRAG_PROPER_NAME ( ' ' )? )*
			loop41:
			do {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( ((LA41_0 >= 'A' && LA41_0 <= 'Z')) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:46: FRAG_PROPER_NAME ( ' ' )?
					{
					mFRAG_PROPER_NAME(); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:63: ( ' ' )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==' ') ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:63: ' '
							{
							match(' '); 
							}
							break;

					}

					}
					break;

				default :
					break loop41;
				}
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROPER_NAME"

	// $ANTLR start "PARENTHETICAL_INT"
	public final void mPARENTHETICAL_INT() throws RecognitionException {
		try {
			int _type = PARENTHETICAL_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:5: ( '(' ( WS )? ( '0' .. '9' )+ ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:9: '(' ( WS )? ( '0' .. '9' )+ ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:13: ( WS )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( ((LA42_0 >= '\t' && LA42_0 <= '\n')||LA42_0=='\r'||LA42_0==' ') ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:13: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:17: ( '0' .. '9' )+
			int cnt43=0;
			loop43:
			do {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( ((LA43_0 >= '0' && LA43_0 <= '9')) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
					if ( cnt43 >= 1 ) break loop43;
						EarlyExitException eee =
							new EarlyExitException(43, input);
						throw eee;
				}
				cnt43++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:27: ( WS )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( ((LA44_0 >= '\t' && LA44_0 <= '\n')||LA44_0=='\r'||LA44_0==' ') ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:27: WS
					{
					mWS(); 

					}
					break;

			}

			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHETICAL_INT"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | GROUP_RING | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | STANDALONE_COMMENT | COMMENT | PARENTHETICAL_INT )
		int alt45=17;
		alt45 = dfa45.predict(input);
		switch (alt45) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:10: JUNIOR_CLASS
				{
				mJUNIOR_CLASS(); 

				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:23: BREED_NAME
				{
				mBREED_NAME(); 

				}
				break;
			case 3 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:34: SPECIAL_SUFFIX
				{
				mSPECIAL_SUFFIX(); 

				}
				break;
			case 4 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:49: BREED_NAME_SUFFIX
				{
				mBREED_NAME_SUFFIX(); 

				}
				break;
			case 5 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:67: GROUP_RING
				{
				mGROUP_RING(); 

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:78: BREED_COUNT
				{
				mBREED_COUNT(); 

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:90: JUDGE_NAME
				{
				mJUDGE_NAME(); 

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:101: WS
				{
				mWS(); 

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:104: RING_TITLE
				{
				mRING_TITLE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:115: PHONE_NUMBER
				{
				mPHONE_NUMBER(); 

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:128: TIME
				{
				mTIME(); 

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:133: DATE
				{
				mDATE(); 

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:138: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:147: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:151: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); 

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:170: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 17 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:178: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA45 dfa45 = new DFA45(this);
	static final String DFA13_eotS =
		"\61\uffff\1\70\11\uffff\1\77\1\101\11\uffff";
	static final String DFA13_eofS =
		"\106\uffff";
	static final String DFA13_minS =
		"\1\61\1\63\1\40\1\150\1\156\1\151\1\145\2\uffff\1\141\3\uffff\1\155\1"+
		"\uffff\1\150\6\uffff\1\143\1\uffff\1\147\2\uffff\1\162\1\154\1\uffff\1"+
		"\156\1\157\3\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1\147\1\157\1\145"+
		"\1\151\1\141\1\40\1\164\1\150\1\163\1\156\2\uffff\1\150\2\uffff\1\150"+
		"\3\40\1\123\2\uffff\1\103\5\uffff";
	static final String DFA13_maxS =
		"\1\127\1\65\1\157\1\165\1\156\1\154\1\157\2\uffff\1\157\3\uffff\1\165"+
		"\1\uffff\1\151\6\uffff\1\154\1\uffff\1\147\2\uffff\2\162\1\uffff\1\156"+
		"\1\157\3\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1\147\1\157\1\145\1\151"+
		"\1\141\1\150\1\164\1\150\1\163\1\156\2\uffff\1\150\2\uffff\1\150\3\40"+
		"\1\127\2\uffff\1\123\5\uffff";
	static final String DFA13_acceptS =
		"\7\uffff\1\23\1\24\1\uffff\1\30\1\31\1\32\1\uffff\1\37\1\uffff\1\1\1\2"+
		"\1\3\1\4\1\5\1\6\1\uffff\1\11\1\uffff\1\15\1\16\2\uffff\1\25\2\uffff\1"+
		"\35\1\36\1\40\1\uffff\1\7\1\10\2\uffff\1\21\1\22\12\uffff\1\26\1\27\1"+
		"\uffff\1\42\1\41\5\uffff\1\34\1\33\1\uffff\1\12\1\17\1\20\1\13\1\14";
	static final String DFA13_specialS =
		"\106\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\20\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1"+
			"\11\1\12\1\13\3\uffff\1\14\1\15\1\16\2\uffff\1\17",
			"\1\20\1\uffff\1\21",
			"\1\23\116\uffff\1\22",
			"\1\24\3\uffff\1\25\2\uffff\1\26\5\uffff\1\27",
			"\1\30",
			"\1\31\2\uffff\1\32",
			"\1\33\11\uffff\1\34",
			"",
			"",
			"\1\35\15\uffff\1\36",
			"",
			"",
			"",
			"\1\37\6\uffff\1\40\1\41",
			"",
			"\1\42\1\43",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44\10\uffff\1\45",
			"",
			"\1\46",
			"",
			"",
			"\1\47",
			"\1\50\5\uffff\1\51",
			"",
			"\1\52",
			"\1\53",
			"",
			"",
			"",
			"\1\54",
			"",
			"",
			"\1\55",
			"\1\56",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64\107\uffff\1\65",
			"\1\66",
			"\1\67",
			"\1\71",
			"\1\72",
			"",
			"",
			"\1\73",
			"",
			"",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\100",
			"\1\102\3\uffff\1\103",
			"",
			"",
			"\1\104\17\uffff\1\105",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "112:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA17_eotS =
		"\u00e4\uffff\1\u0104\146\uffff\1\u0161\102\uffff";
	static final String DFA17_eofS =
		"\u018e\uffff";
	static final String DFA17_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\1\141\1\145\1\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff"+
		"\1\145\1\uffff\2\163\1\141\1\143\1\141\1\162\1\141\1\154\1\151\1\uffff"+
		"\1\145\2\uffff\1\143\1\uffff\1\143\1\142\1\147\1\145\3\uffff\1\162\2\uffff"+
		"\1\154\1\145\1\162\2\uffff\1\151\1\uffff\1\145\2\uffff\1\142\4\uffff\1"+
		"\154\1\156\1\141\1\162\2\uffff\1\160\1\153\2\uffff\1\151\1\147\1\uffff"+
		"\1\144\3\uffff\1\151\1\150\1\141\1\145\1\142\2\uffff\2\141\2\uffff\1\142"+
		"\2\uffff\1\151\1\uffff\1\162\2\uffff\1\162\1\164\1\145\1\147\1\uffff\1"+
		"\147\1\uffff\1\150\1\143\2\uffff\1\144\5\uffff\1\141\1\uffff\1\154\1\uffff"+
		"\1\141\3\uffff\1\150\7\uffff\1\165\1\154\2\uffff\1\156\1\155\2\uffff\1"+
		"\141\2\uffff\2\163\7\uffff\1\151\2\uffff\1\146\12\uffff\1\164\1\uffff"+
		"\1\151\6\uffff\1\164\3\uffff\1\142\1\145\3\uffff\1\146\1\145\1\uffff\1"+
		"\163\1\uffff\1\145\1\151\1\162\5\uffff\1\151\1\157\1\153\1\145\3\uffff"+
		"\1\40\3\uffff\2\145\2\151\1\141\1\164\1\uffff\2\150\1\141\1\uffff\1\145"+
		"\1\165\1\153\1\164\2\uffff\1\162\2\uffff\1\164\1\150\1\40\1\143\2\141"+
		"\1\156\1\40\1\162\3\uffff\1\163\1\40\2\163\1\156\2\40\1\157\1\164\1\147"+
		"\1\uffff\1\147\2\uffff\2\151\1\141\1\40\2\uffff\1\141\1\154\1\156\1\40"+
		"\1\46\1\40\1\145\2\uffff\2\150\1\40\1\104\1\uffff\1\122\1\156\1\165\1"+
		"\151\1\165\1\163\1\141\1\156\1\123\1\156\1\151\1\40\5\uffff\1\103\3\40"+
		"\1\120\5\uffff\1\141\1\144\1\162\1\141\1\145\1\150\1\156\1\40\2\uffff"+
		"\1\40\1\141\1\115\2\uffff\2\103\1\114\1\uffff\1\150\3\uffff\2\145\1\156"+
		"\1\163\2\40\1\115\1\105\1\156\7\uffff\1\145\3\uffff\1\145\2\uffff\2\40"+
		"\1\145\1\104\1\110\3\uffff\1\156\3\uffff\1\40\4\uffff\1\101\1\102\1\40"+
		"\2\uffff\1\165\2\uffff\1\103\7\uffff\1\120\1\163\5\uffff\1\153\1\151\2"+
		"\uffff";
	static final String DFA17_maxS =
		"\1\131\3\165\1\157\1\156\2\162\1\141\1\164\1\uffff\1\165\1\u00f6\1\151"+
		"\1\157\1\164\1\171\1\165\1\167\1\162\1\uffff\1\151\2\uffff\1\147\3\uffff"+
		"\1\145\1\uffff\2\163\1\162\1\143\1\165\1\171\1\165\1\154\1\166\1\uffff"+
		"\1\157\2\uffff\1\154\1\uffff\1\156\1\147\1\164\1\156\3\uffff\1\162\2\uffff"+
		"\1\162\1\145\1\166\2\uffff\1\151\1\uffff\1\162\2\uffff\1\153\4\uffff\1"+
		"\163\1\156\1\167\1\166\2\uffff\1\162\1\164\2\uffff\1\162\1\154\1\uffff"+
		"\1\164\3\uffff\1\155\1\157\1\164\1\151\1\154\2\uffff\1\151\1\141\2\uffff"+
		"\1\142\2\uffff\1\163\1\uffff\1\162\2\uffff\1\162\1\164\1\163\1\165\1\uffff"+
		"\1\147\1\uffff\1\150\1\143\2\uffff\1\172\5\uffff\1\164\1\uffff\1\154\1"+
		"\uffff\1\145\3\uffff\1\156\7\uffff\1\165\1\154\2\uffff\1\156\1\155\2\uffff"+
		"\1\171\2\uffff\2\163\7\uffff\1\151\2\uffff\1\167\12\uffff\1\164\1\uffff"+
		"\1\151\6\uffff\1\164\3\uffff\1\150\1\145\3\uffff\1\156\1\145\1\uffff\1"+
		"\163\1\uffff\1\145\1\151\1\162\5\uffff\1\151\1\157\1\153\1\145\3\uffff"+
		"\1\155\3\uffff\2\145\2\151\1\141\1\164\1\uffff\2\150\1\141\1\uffff\1\151"+
		"\1\165\1\153\1\164\2\uffff\1\162\2\uffff\1\164\2\150\1\143\2\141\1\156"+
		"\1\40\1\162\3\uffff\4\163\1\156\1\145\1\40\1\157\1\164\1\147\1\uffff\1"+
		"\147\2\uffff\2\151\1\141\1\40\2\uffff\1\141\1\154\1\156\1\163\1\141\1"+
		"\40\1\145\2\uffff\2\150\1\40\1\120\1\uffff\1\127\1\156\1\165\1\151\1\165"+
		"\1\163\1\141\1\156\1\124\1\156\1\151\1\40\5\uffff\1\124\3\40\1\127\5\uffff"+
		"\1\157\1\144\1\162\1\141\1\145\1\150\1\156\1\40\2\uffff\1\40\1\141\1\124"+
		"\2\uffff\1\123\1\124\1\123\1\uffff\1\150\3\uffff\2\145\1\156\1\163\2\40"+
		"\1\124\1\127\1\156\7\uffff\1\160\3\uffff\1\157\2\uffff\2\40\1\145\1\124"+
		"\1\110\3\uffff\1\163\3\uffff\1\40\4\uffff\1\123\1\114\1\40\2\uffff\1\165"+
		"\2\uffff\1\124\7\uffff\1\127\1\163\5\uffff\1\153\1\171\2\uffff";
	static final String DFA17_acceptS =
		"\12\uffff\1\146\11\uffff\1\u00b5\1\uffff\1\u00bd\1\u00be\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\13\11\uffff\1\63\1\uffff\1\70\1\72\1\uffff\1\75\4\uffff"+
		"\1\115\1\116\1\117\1\uffff\1\124\1\125\3\uffff\1\136\1\137\1\uffff\1\145"+
		"\1\uffff\1\152\1\153\1\uffff\1\157\1\160\1\161\1\162\4\uffff\1\u0082\1"+
		"\u0083\2\uffff\1\u0089\1\u008a\2\uffff\1\u0094\1\uffff\1\u0097\1\u0098"+
		"\1\u0099\5\uffff\1\u00a8\1\u00a9\2\uffff\1\u00ae\1\u00af\1\uffff\1\u00b3"+
		"\1\u00b4\1\uffff\1\u00ba\1\uffff\1\1\1\2\4\uffff\1\24\1\uffff\1\30\2\uffff"+
		"\1\36\1\37\1\uffff\1\43\1\44\1\45\1\46\1\47\1\uffff\1\52\1\uffff\1\56"+
		"\1\uffff\1\61\1\62\1\64\1\uffff\1\71\1\73\1\74\1\76\1\77\1\100\1\101\2"+
		"\uffff\1\111\1\112\2\uffff\1\126\1\127\1\uffff\1\134\1\135\2\uffff\1\151"+
		"\1\154\1\155\1\156\1\163\1\164\1\165\1\uffff\1\172\1\173\1\uffff\1\u0081"+
		"\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u008b\1\u008c\1\u008d\1\u008e"+
		"\1\uffff\1\u0091\1\uffff\1\u0095\1\u0096\1\u009a\1\u009b\1\u009c\1\u009d"+
		"\1\uffff\1\u00a0\1\u00a1\1\u00a2\2\uffff\1\u00a7\1\u00aa\1\u00ab\2\uffff"+
		"\1\u00b6\1\uffff\1\u00b9\3\uffff\1\17\1\20\1\21\1\22\1\23\4\uffff\1\42"+
		"\1\50\1\51\1\uffff\1\57\1\60\1\65\6\uffff\1\133\3\uffff\1\174\4\uffff"+
		"\1\u00a3\1\u00a4\1\uffff\1\u00ac\1\u00ad\11\uffff\1\53\1\54\1\55\12\uffff"+
		"\1\u0080\1\uffff\1\u0093\1\u0092\4\uffff\1\u00bb\1\u00bc\7\uffff\1\102"+
		"\1\103\4\uffff\1\132\14\uffff\1\31\1\32\1\33\1\34\1\35\5\uffff\1\130\1"+
		"\131\1\140\1\141\1\142\10\uffff\1\u00b7\1\u00b8\3\uffff\1\40\1\41\3\uffff"+
		"\1\120\1\uffff\1\123\1\143\1\144\11\uffff\1\25\1\26\1\27\1\66\1\67\1\104"+
		"\1\105\1\uffff\1\110\1\113\1\114\1\uffff\1\150\1\147\5\uffff\1\u00b0\1"+
		"\u00b1\1\u00b2\1\uffff\1\10\1\11\1\12\1\uffff\1\106\1\107\1\121\1\122"+
		"\3\uffff\1\u009e\1\u009f\1\uffff\1\6\1\7\1\uffff\1\166\1\167\1\170\1\171"+
		"\1\175\1\176\1\177\2\uffff\1\14\1\15\1\16\1\u008f\1\u0090\2\uffff\1\u00a5"+
		"\1\u00a6";
	static final String DFA17_specialS =
		"\u018e\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\20\1\uffff\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26\1\27",
			"\1\30\2\uffff\1\31\1\uffff\1\32\1\33\1\34\1\35\6\uffff\1\36",
			"\1\37\3\uffff\1\40\3\uffff\1\41\2\uffff\1\42\2\uffff\1\43\2\uffff\1"+
			"\44\2\uffff\1\45",
			"\1\46\3\uffff\1\47\2\uffff\1\50\1\51\2\uffff\1\52\2\uffff\1\53\5\uffff"+
			"\1\54",
			"\1\55\15\uffff\1\56",
			"\1\57",
			"\1\60\2\uffff\1\61\2\uffff\1\62\2\uffff\1\63",
			"\1\64\3\uffff\1\65\2\uffff\1\66\2\uffff\1\67\2\uffff\1\70",
			"\1\71",
			"\1\72\1\73\16\uffff\1\74\1\uffff\1\75",
			"",
			"\1\76\11\uffff\1\77\5\uffff\1\100",
			"\1\101\3\uffff\1\102\2\uffff\1\103\6\uffff\1\105\u0086\uffff\1\104",
			"\1\106\7\uffff\1\107",
			"\1\110\11\uffff\1\111",
			"\1\112\7\uffff\1\113",
			"\1\114\3\uffff\1\115\2\uffff\1\116\3\uffff\1\117\2\uffff\1\120\5\uffff"+
			"\1\121\3\uffff\1\122",
			"\1\123\2\uffff\1\124\6\uffff\1\125\5\uffff\1\126",
			"\1\127\1\uffff\1\130\1\uffff\1\131\2\uffff\1\132\1\133\1\uffff\1\134"+
			"\3\uffff\1\135\1\136\3\uffff\1\137\1\140\1\uffff\1\141",
			"\1\142\5\uffff\1\143\2\uffff\1\144",
			"",
			"\1\145\2\uffff\1\146\1\147",
			"",
			"",
			"\1\150\1\151",
			"",
			"",
			"",
			"\1\152",
			"",
			"\1\153",
			"\1\154",
			"\1\155\2\uffff\1\156\7\uffff\1\157\5\uffff\1\160",
			"\1\161",
			"\1\162\15\uffff\1\163\5\uffff\1\164",
			"\1\165\1\166\1\uffff\1\167\2\uffff\1\170\1\171",
			"\1\172\7\uffff\1\173\13\uffff\1\174",
			"\1\175",
			"\1\176\4\uffff\1\177\3\uffff\1\u0080\3\uffff\1\u0081",
			"",
			"\1\u0082\3\uffff\1\u0083\5\uffff\1\u0084",
			"",
			"",
			"\1\u0085\10\uffff\1\u0086",
			"",
			"\1\u0087\10\uffff\1\u0088\1\uffff\1\u0089",
			"\1\u008a\4\uffff\1\u008b",
			"\1\u008c\14\uffff\1\u008d",
			"\1\u008e\10\uffff\1\u008f",
			"",
			"",
			"",
			"\1\u0090",
			"",
			"",
			"\1\u0091\5\uffff\1\u0092",
			"\1\u0093",
			"\1\u0094\3\uffff\1\u0095",
			"",
			"",
			"\1\u0096",
			"",
			"\1\u0097\14\uffff\1\u0098",
			"",
			"",
			"\1\u0099\4\uffff\1\u009a\3\uffff\1\u009b",
			"",
			"",
			"",
			"",
			"\1\u009c\1\uffff\1\u009d\4\uffff\1\u009e",
			"\1\u009f",
			"\1\u00a0\25\uffff\1\u00a1",
			"\1\u00a2\3\uffff\1\u00a3",
			"",
			"",
			"\1\u00a4\1\uffff\1\u00a5",
			"\1\u00a6\1\uffff\1\u00a7\6\uffff\1\u00a8",
			"",
			"",
			"\1\u00a9\2\uffff\1\u00aa\1\u00ab\1\uffff\1\u00ac\2\uffff\1\u00ad",
			"\1\u00ae\4\uffff\1\u00af",
			"",
			"\1\u00b0\17\uffff\1\u00b1",
			"",
			"",
			"",
			"\1\u00b2\2\uffff\1\u00b3\1\u00b4",
			"\1\u00b5\6\uffff\1\u00b6",
			"\1\u00b7\22\uffff\1\u00b8",
			"\1\u00b9\3\uffff\1\u00ba",
			"\1\u00bb\11\uffff\1\u00bc",
			"",
			"",
			"\1\u00bd\7\uffff\1\u00be",
			"\1\u00bf",
			"",
			"",
			"\1\u00c0",
			"",
			"",
			"\1\u00c1\2\uffff\1\u00c2\6\uffff\1\u00c3",
			"",
			"\1\u00c4",
			"",
			"",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7\15\uffff\1\u00c8",
			"\1\u00c9\12\uffff\1\u00ca\2\uffff\1\u00cb",
			"",
			"\1\u00cc",
			"",
			"\1\u00cd",
			"\1\u00ce",
			"",
			"",
			"\1\u00cf\25\uffff\1\u00d0",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d1\22\uffff\1\u00d2",
			"",
			"\1\u00d3",
			"",
			"\1\u00d4\3\uffff\1\u00d5",
			"",
			"",
			"",
			"\1\u00d6\5\uffff\1\u00d7",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d8",
			"\1\u00d9",
			"",
			"",
			"\1\u00da",
			"\1\u00db",
			"",
			"",
			"\1\u00dc\27\uffff\1\u00dd",
			"",
			"",
			"\1\u00de",
			"\1\u00df",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e0",
			"",
			"",
			"\1\u00e1\20\uffff\1\u00e2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e3",
			"",
			"\1\u00e4",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e5",
			"",
			"",
			"",
			"\1\u00e6\5\uffff\1\u00e7",
			"\1\u00e8",
			"",
			"",
			"",
			"\1\u00e9\7\uffff\1\u00ea",
			"\1\u00eb",
			"",
			"\1\u00ec",
			"",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"",
			"",
			"",
			"\1\u00f4\103\uffff\1\u00f5\10\uffff\1\u00f6",
			"",
			"",
			"",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"",
			"\1\u0100\3\uffff\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0105",
			"",
			"",
			"\1\u0106",
			"",
			"",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109\107\uffff\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"",
			"",
			"",
			"\1\u0111",
			"\1\u0112\122\uffff\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117\104\uffff\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"",
			"\1\u011d",
			"",
			"",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"",
			"",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125\122\uffff\1\u0126",
			"\1\u0128\53\uffff\1\u0129\16\uffff\1\u0127",
			"\1\u012a",
			"\1\u012b",
			"",
			"",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f\13\uffff\1\u0130",
			"",
			"\1\u0131\1\u0132\1\u0133\2\uffff\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"",
			"",
			"",
			"",
			"",
			"\1\u0141\20\uffff\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146\2\uffff\1\u0147\3\uffff\1\u0148",
			"",
			"",
			"",
			"",
			"",
			"\1\u0149\15\uffff\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"",
			"",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154\5\uffff\1\u0155\1\u0156",
			"",
			"",
			"\1\u0157\17\uffff\1\u0158",
			"\1\u0159\2\uffff\1\u015a\14\uffff\1\u015b\1\u015c",
			"\1\u015d\6\uffff\1\u015e",
			"",
			"\1\u015f",
			"",
			"",
			"",
			"\1\u0160",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167\5\uffff\1\u0168\1\u0169",
			"\1\u016a\1\u016b\14\uffff\1\u016c\3\uffff\1\u016d",
			"\1\u016e",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u016f\12\uffff\1\u0170",
			"",
			"",
			"",
			"\1\u0171\11\uffff\1\u0172",
			"",
			"",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176\17\uffff\1\u0177",
			"\1\u0178",
			"",
			"",
			"",
			"\1\u0179\4\uffff\1\u017a",
			"",
			"",
			"",
			"\1\u017b",
			"",
			"",
			"",
			"",
			"\1\u017c\1\u017d\15\uffff\1\u017e\2\uffff\1\u017f",
			"\1\u0180\2\uffff\1\u0181\6\uffff\1\u0182",
			"\1\u0183",
			"",
			"",
			"\1\u0184",
			"",
			"",
			"\1\u0185\17\uffff\1\u0186\1\u0187",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0188\6\uffff\1\u0189",
			"\1\u018a",
			"",
			"",
			"",
			"",
			"",
			"\1\u018b",
			"\1\u018d\17\uffff\1\u018c",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "174:6: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
		}
	}

	static final String DFA45_eotS =
		"\1\uffff\27\34\1\uffff\1\u0096\3\uffff\104\34\1\uffff\61\34\4\uffff\10"+
		"\34\1\uffff\152\34\1\141\67\34\4\uffff\170\34\1\141\1\uffff\1\141\43\34"+
		"\1\uffff\2\34\1\uffff\22\34\4\uffff\1\34\1\uffff\7\34\1\uffff\13\34\1"+
		"\141\24\34\1\141\1\34\1\141\31\34\1\u02f6\41\34\1\u0311\6\34\1\141\5\34"+
		"\17\uffff\1\141\6\34\1\uffff\54\34\1\uffff\32\34\1\141\11\34\1\141\3\34"+
		"\1\141\15\34\1\141\10\34\1\uffff\24\34\1\141\5\34\1\uffff\10\34\1\141"+
		"\1\34\30\uffff\6\34\1\141\33\34\1\141\13\34\2\uffff\2\34\2\141\20\34\1"+
		"\141\13\34\1\141\16\34\1\u02f6\4\34\1\141\13\34\1\141\4\34\1\141\2\34"+
		"\33\uffff\6\34\1\141\4\34\1\141\27\34\1\141\6\34\1\u0454\2\34\1\uffff"+
		"\16\34\1\141\15\34\1\141\2\34\2\141\3\34\1\141\4\34\30\uffff\1\141\2\uffff"+
		"\12\34\1\141\10\34\1\u02f6\7\34\1\uffff\12\34\1\141\4\34\1\141\1\34\2"+
		"\141\2\34\1\141\3\34\1\141\2\34\30\uffff\3\34\3\uffff\17\34\1\141\6\34"+
		"\1\141\5\34\3\141\1\34\25\uffff\3\34\2\uffff\3\141\3\34\1\141\6\34\1\141"+
		"\3\34\20\uffff\3\34\2\uffff\1\34\1\u02f6\3\34\1\141\3\34\15\uffff\3\34"+
		"\1\uffff\3\34\1\141\14\uffff\1\141\1\34\1\141\1\uffff\2\34\1\u0363\12"+
		"\uffff\1\34\1\uffff\1\141\11\uffff\1\34\7\uffff\1\34\6\uffff\1\34\6\uffff"+
		"\1\34\4\uffff\1\141\17\uffff";
	static final String DFA45_eofS =
		"\u0561\uffff";
	static final String DFA45_minS =
		"\1\11\1\111\1\154\1\117\1\146\1\105\1\117\1\122\1\156\2\122\1\105\1\142"+
		"\1\141\1\145\1\125\1\141\1\111\1\101\1\105\1\101\1\105\2\157\1\0\1\46"+
		"\3\uffff\1\154\1\156\4\40\1\123\1\156\1\116\1\145\1\144\1\164\1\162\1"+
		"\141\1\116\1\146\1\162\1\151\1\141\1\145\1\141\2\163\1\141\1\143\1\141"+
		"\1\162\1\141\1\154\1\123\1\151\1\163\1\145\1\162\1\165\1\143\1\162\1\114"+
		"\1\143\1\142\2\40\1\147\1\145\1\141\1\170\1\145\1\111\1\162\1\141\1\145"+
		"\1\154\1\145\1\117\1\162\1\122\1\125\1\151\1\145\1\151\1\141\1\160\1\145"+
		"\1\155\1\166\1\142\1\157\1\141\1\uffff\1\167\1\116\1\160\1\153\1\141\1"+
		"\157\1\151\1\147\1\162\1\144\1\157\1\164\1\163\1\116\1\151\1\150\1\141"+
		"\1\145\1\142\1\171\1\146\2\141\1\156\1\145\1\117\1\105\1\116\1\124\1\142"+
		"\1\171\1\145\1\122\1\131\1\145\1\105\1\165\1\125\1\172\1\164\1\124\1\122"+
		"\1\144\1\151\1\162\1\122\1\104\1\154\1\162\1\46\2\11\1\uffff\2\60\2\164"+
		"\1\143\1\151\1\163\1\40\1\uffff\1\40\1\123\1\144\1\104\1\156\1\40\1\145"+
		"\1\141\1\146\1\160\1\146\1\55\1\145\1\150\1\145\1\164\1\163\1\162\2\164"+
		"\1\145\1\147\1\154\1\147\1\156\1\150\1\143\1\157\1\145\1\144\1\164\1\166"+
		"\1\145\1\153\1\143\1\141\1\163\1\154\1\124\1\162\1\141\1\144\1\141\1\153"+
		"\1\163\1\150\1\167\1\156\1\155\1\153\1\40\1\154\1\40\1\150\1\155\1\144"+
		"\1\145\1\165\3\154\1\156\1\164\1\40\1\156\1\144\1\104\1\155\2\156\2\144"+
		"\1\141\1\125\1\162\1\141\1\104\1\116\1\172\1\154\1\163\1\154\1\141\1\163"+
		"\1\162\1\157\1\141\1\162\1\157\1\145\1\156\1\163\1\143\1\103\1\151\1\163"+
		"\1\151\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\46\1\151"+
		"\1\145\1\142\1\162\1\144\1\164\1\163\1\107\1\156\1\165\1\157\1\165\1\151"+
		"\1\164\1\154\2\164\1\142\1\145\1\153\1\145\1\164\2\156\1\146\1\163\2\144"+
		"\1\122\1\105\1\104\1\125\1\145\1\40\1\145\1\122\1\40\1\163\1\123\1\162"+
		"\1\122\1\163\1\145\1\105\1\111\1\155\1\163\1\164\1\156\1\160\1\145\1\113"+
		"\1\116\1\157\1\153\2\11\1\uffff\1\11\1\55\1\11\2\145\1\150\1\141\2\40"+
		"\1\141\1\101\1\40\1\162\1\143\1\40\1\157\1\145\2\157\1\123\1\156\1\141"+
		"\1\144\1\141\1\153\1\151\1\157\1\162\1\156\1\145\1\154\1\144\1\143\2\151"+
		"\1\145\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162"+
		"\1\164\1\163\2\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145"+
		"\1\40\1\145\1\142\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\145\1\151"+
		"\1\145\1\151\1\144\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145"+
		"\1\157\1\164\1\150\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151\1\156"+
		"\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154"+
		"\1\157\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\46\1\0"+
		"\1\46\1\156\1\157\1\151\1\145\1\167\1\145\1\11\1\164\1\153\1\171\1\162"+
		"\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1\157"+
		"\1\146\1\144\1\145\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\106"+
		"\1\151\1\111\1\uffff\1\144\1\104\1\163\1\123\1\154\1\162\1\122\1\105\1"+
		"\141\1\150\1\40\1\145\1\160\1\40\1\111\1\105\1\151\1\163\3\11\1\uffff"+
		"\1\60\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1\131\1\uffff\1\150"+
		"\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156\1\141\1\46\1\141"+
		"\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163\1\156\1\40\1\150"+
		"\1\151\1\162\1\151\1\156\1\145\1\46\1\156\1\46\1\144\1\141\1\145\1\157"+
		"\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143\1\145\1\162"+
		"\1\145\1\55\1\150\1\164\1\145\1\155\1\40\1\163\1\142\1\46\1\145\1\40\1"+
		"\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\40\1\157\1\40\2\145\1"+
		"\116\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1"+
		"\141\1\145\1\40\1\145\1\46\1\154\1\156\1\147\1\157\1\40\1\157\1\46\1\145"+
		"\1\150\1\141\1\145\1\147\2\46\1\40\5\46\1\40\7\46\1\145\1\156\1\145\1"+
		"\163\1\145\1\154\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162"+
		"\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\111"+
		"\1\123\1\131\1\104\1\141\1\156\1\105\1\141\1\101\1\144\1\104\2\141\1\101"+
		"\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\123\1\164\1\150\2\11\1\55"+
		"\1\40\1\146\1\145\1\163\1\165\2\54\1\157\1\40\1\153\1\151\1\150\1\151"+
		"\1\156\1\117\1\151\1\40\1\154\1\156\1\141\1\151\1\154\1\151\1\40\1\46"+
		"\1\144\1\162\1\147\1\156\1\145\1\40\1\157\1\143\1\40\1\46\1\40\1\162\1"+
		"\40\1\46\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\157\1"+
		"\162\1\40\1\46\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1"+
		"\163\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162\1\163\1\107\1\40\1\144"+
		"\1\156\1\163\1\156\1\157\1\46\2\157\1\156\1\162\1\156\1\uffff\1\157\1"+
		"\40\1\145\1\153\1\150\1\162\1\40\1\156\1\46\1\165\30\11\1\141\1\145\1"+
		"\166\2\151\1\154\1\46\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141"+
		"\1\154\1\145\2\162\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156"+
		"\1\147\1\122\1\171\1\131\1\141\1\101\1\46\1\156\1\116\1\131\1\141\1\144"+
		"\1\164\1\151\1\107\1\104\1\172\1\151\2\uffff\2\60\2\46\1\164\1\162\1\11"+
		"\1\165\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156\1\141"+
		"\1\151\1\46\1\40\1\157\1\164\3\40\1\165\1\153\1\40\1\171\1\163\1\46\1"+
		"\164\1\156\1\162\1\141\1\165\3\40\1\157\1\156\1\141\1\156\1\40\1\143\1"+
		"\46\1\40\1\141\1\40\1\156\1\46\1\145\1\40\1\151\1\40\1\145\1\144\2\162"+
		"\1\40\1\144\1\147\1\46\1\156\1\163\1\145\1\40\1\46\1\151\1\145\33\11\1"+
		"\156\1\40\1\145\1\141\1\154\1\40\1\46\1\171\1\162\1\150\1\155\1\46\1\144"+
		"\1\156\1\163\1\40\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1\171\1"+
		"\131\3\40\1\156\1\141\1\46\1\162\1\40\1\101\1\143\1\162\1\60\1\46\2\145"+
		"\1\uffff\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1\141\1\156\1\157\1"+
		"\156\1\40\1\46\1\40\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1\150\1\164"+
		"\1\144\1\46\1\143\1\40\2\46\2\40\1\145\1\46\1\145\1\40\1\141\1\163\30"+
		"\11\1\46\2\11\1\40\1\162\1\156\1\145\1\54\1\153\4\40\1\46\1\163\1\40\1"+
		"\153\1\40\1\113\3\54\1\46\1\145\1\171\1\145\1\131\1\165\1\145\1\55\1\uffff"+
		"\1\162\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40\1\156\1\46\1\156\1"+
		"\144\1\146\1\145\1\46\1\164\2\46\2\145\1\46\1\40\1\156\1\162\1\46\1\156"+
		"\1\145\30\11\1\163\1\141\1\154\1\0\2\11\1\163\1\40\1\162\1\145\1\150\1"+
		"\145\1\105\1\162\1\54\1\144\1\54\1\151\1\40\1\60\1\40\1\46\1\40\1\156"+
		"\1\116\1\150\2\40\1\46\1\146\1\40\1\145\1\162\1\144\3\46\1\40\25\11\1"+
		"\143\1\162\1\141\1\46\1\11\3\46\1\151\1\163\1\123\1\46\1\40\1\156\1\60"+
		"\1\144\1\107\1\145\1\46\1\144\2\40\20\11\1\157\1\164\1\143\2\11\1\162"+
		"\1\46\1\40\1\164\1\60\1\46\1\40\1\162\1\40\15\11\1\142\1\151\1\153\1\11"+
		"\1\145\1\154\1\60\1\46\14\11\1\46\1\55\1\46\1\11\1\40\1\151\1\46\12\11"+
		"\1\103\1\11\1\46\11\11\1\157\7\11\1\154\6\11\1\157\6\11\1\162\4\11\1\46"+
		"\17\11";
	static final String DFA45_maxS =
		"\1\u2019\1\163\1\164\1\157\3\165\1\162\1\156\2\162\1\141\1\164\1\141\1"+
		"\165\1\u00f6\1\171\1\165\1\167\1\165\2\151\2\157\1\uffff\1\u2019\3\uffff"+
		"\2\163\1\123\1\163\2\40\1\123\1\156\1\116\1\145\1\144\1\164\1\166\1\167"+
		"\1\116\1\147\1\162\1\151\1\141\1\145\1\141\2\163\1\162\1\143\1\165\1\171"+
		"\1\165\1\154\1\123\1\166\1\163\1\157\1\162\1\165\1\154\1\162\1\114\1\156"+
		"\1\147\2\40\1\164\1\156\1\141\1\170\1\151\1\111\1\162\1\141\1\145\1\162"+
		"\1\145\1\117\1\166\1\122\1\125\1\151\1\145\1\151\1\141\1\160\1\162\1\155"+
		"\1\166\1\153\1\157\1\141\1\uffff\1\167\1\116\1\162\1\164\1\141\1\157\1"+
		"\162\1\154\1\162\1\164\1\157\1\164\1\163\1\116\1\164\1\157\1\164\1\151"+
		"\1\154\1\171\1\146\1\151\1\141\1\163\1\145\1\117\1\105\1\116\1\124\1\142"+
		"\1\171\1\145\1\122\1\131\1\145\1\105\1\165\1\125\1\172\1\164\1\124\1\122"+
		"\1\163\1\151\1\162\1\122\1\104\1\154\1\162\3\u2019\1\uffff\2\71\2\164"+
		"\1\143\1\151\1\163\1\40\1\uffff\1\40\1\123\1\144\1\104\1\156\1\40\1\145"+
		"\1\151\1\167\1\160\1\146\1\55\1\145\1\150\1\145\1\164\1\163\1\162\2\164"+
		"\1\163\1\165\1\154\1\147\1\156\1\150\1\143\1\157\1\145\1\172\1\164\1\166"+
		"\1\145\1\153\1\143\1\164\1\163\1\154\1\124\1\162\1\145\1\144\1\141\1\153"+
		"\1\163\1\156\1\167\1\156\1\155\1\153\2\154\1\40\1\150\1\155\1\144\1\145"+
		"\1\165\1\154\1\162\1\154\1\156\1\164\1\40\1\156\1\144\1\104\1\155\2\156"+
		"\2\144\1\171\1\125\1\162\1\141\1\104\1\116\1\172\1\154\1\163\1\154\1\141"+
		"\1\163\1\162\1\157\1\141\1\162\1\157\1\145\1\156\1\163\1\143\1\103\1\151"+
		"\1\163\1\151\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\u2019"+
		"\1\151\1\145\1\142\1\162\1\144\1\164\1\163\1\107\1\156\1\165\1\157\1\165"+
		"\1\151\1\164\1\154\2\164\1\150\1\145\1\153\1\145\1\164\3\156\1\163\1\144"+
		"\1\145\1\122\1\105\1\104\1\125\1\145\1\40\1\145\1\122\1\40\1\163\1\123"+
		"\1\162\1\122\1\163\1\145\1\105\1\111\1\155\1\163\1\164\1\156\1\160\1\145"+
		"\1\113\1\116\1\157\1\153\2\u2019\1\uffff\1\u2019\2\71\1\151\1\145\1\150"+
		"\1\141\2\40\1\141\1\101\1\40\1\162\1\143\1\40\1\157\1\151\2\157\1\123"+
		"\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\162\1\156\1\145\1\154\1\144"+
		"\1\143\2\151\1\145\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151"+
		"\1\145\1\162\1\164\1\163\1\155\1\40\1\156\1\141\1\40\1\151\1\154\1\171"+
		"\1\141\1\165\1\145\1\40\1\145\1\142\1\145\1\151\1\171\1\163\1\141\1\151"+
		"\1\162\1\145\1\151\1\145\1\171\1\144\1\151\1\55\1\143\1\141\1\101\1\141"+
		"\1\164\1\40\1\145\1\157\1\164\1\150\1\120\1\151\1\156\1\111\1\104\2\141"+
		"\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141"+
		"\1\150\1\110\1\154\1\157\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154"+
		"\1\165\1\u2019\1\uffff\1\u2019\1\156\1\157\1\151\1\145\1\167\1\145\1\40"+
		"\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162"+
		"\1\171\2\40\1\151\1\157\1\146\1\144\1\145\1\141\1\151\1\160\1\124\1\120"+
		"\1\101\1\122\1\164\1\126\1\151\1\111\1\uffff\1\144\1\104\1\163\1\123\1"+
		"\154\1\162\1\122\1\105\1\141\1\150\1\40\1\145\1\160\1\150\1\111\1\105"+
		"\1\151\1\163\3\u2019\1\uffff\1\71\1\uffff\1\162\1\146\1\163\1\145\1\164"+
		"\1\171\1\131\1\uffff\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1"+
		"\160\1\156\1\141\1\u2019\1\141\1\143\1\154\1\141\1\152\1\164\3\145\1\156"+
		"\1\141\1\163\1\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\u2019\1"+
		"\156\1\u2019\1\144\1\141\1\145\1\157\1\141\1\40\1\156\1\147\1\151\1\40"+
		"\1\160\1\141\1\163\1\143\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155"+
		"\2\163\1\142\1\u2019\1\145\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1"+
		"\40\2\156\1\145\1\157\1\40\2\145\1\116\1\40\2\156\1\40\1\141\1\145\1\157"+
		"\1\40\1\144\1\172\1\144\1\164\1\141\1\145\1\40\1\145\1\u2019\1\154\1\156"+
		"\1\147\1\157\1\40\1\157\1\u2019\1\145\1\150\1\141\1\145\1\147\20\u2019"+
		"\1\145\1\156\1\145\1\163\1\145\1\154\1\uffff\1\40\1\151\1\145\1\144\1"+
		"\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1"+
		"\170\1\171\2\163\1\111\1\123\1\131\1\104\1\141\1\156\1\105\1\141\1\101"+
		"\1\144\1\104\2\141\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\123"+
		"\1\164\1\150\1\u2019\2\71\1\40\1\146\1\145\1\163\1\165\2\54\1\157\1\40"+
		"\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\156\1\141\1\151"+
		"\1\154\1\151\1\40\1\u2019\1\144\1\162\1\147\1\156\1\145\1\163\1\157\1"+
		"\143\1\40\1\u2019\1\40\1\162\1\40\1\u2019\1\156\1\154\1\147\1\163\1\40"+
		"\1\141\2\145\1\150\1\145\1\157\1\162\1\40\1\u2019\1\103\1\165\1\151\1"+
		"\40\1\141\1\40\1\150\1\165\1\uffff\1\163\1\150\1\157\1\40\2\54\3\40\1"+
		"\162\1\165\1\162\1\163\1\107\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019"+
		"\2\157\1\156\1\162\1\156\1\uffff\1\157\1\40\1\145\1\153\1\150\1\162\1"+
		"\40\1\156\1\u2019\1\165\30\u2019\1\141\1\145\1\166\2\151\1\154\1\u2019"+
		"\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162\1\40"+
		"\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\171\1\131"+
		"\1\141\1\101\1\u2019\1\156\1\116\1\131\1\141\1\144\1\164\1\151\1\107\1"+
		"\104\1\172\1\151\2\uffff\2\71\2\u2019\1\164\1\162\1\40\1\165\1\40\1\141"+
		"\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156\1\141\1\151\1\u2019\1\40"+
		"\1\157\1\164\3\40\1\165\1\153\1\40\1\171\1\163\1\u2019\1\164\1\156\1\162"+
		"\1\141\1\165\3\40\1\157\1\156\1\141\1\156\1\40\1\143\1\u2019\1\40\1\141"+
		"\1\40\1\156\1\u2019\1\145\1\40\1\151\1\40\1\145\1\144\2\162\1\40\1\144"+
		"\1\147\1\u2019\1\156\1\163\1\145\1\40\1\u2019\1\151\1\145\33\u2019\1\156"+
		"\1\40\1\145\1\141\1\154\1\40\1\u2019\1\171\1\162\1\150\1\155\1\u2019\1"+
		"\144\1\156\1\163\1\40\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1\171"+
		"\1\131\1\163\2\40\1\156\1\141\1\u2019\1\162\1\40\1\101\1\143\1\162\1\71"+
		"\1\u2019\2\145\1\uffff\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1\141"+
		"\1\156\1\157\1\156\1\40\1\u2019\1\40\1\151\2\40\1\153\2\141\1\144\1\156"+
		"\1\40\1\150\1\164\1\144\1\u2019\1\143\1\40\2\u2019\2\40\1\145\1\u2019"+
		"\1\145\1\40\1\141\1\163\33\u2019\1\40\1\162\1\156\1\145\1\54\1\153\4\40"+
		"\1\u2019\1\163\1\40\1\153\1\40\1\113\3\54\1\u2019\1\145\1\171\1\145\1"+
		"\131\1\165\1\145\1\55\1\uffff\1\162\1\40\1\144\1\40\1\156\1\141\1\111"+
		"\1\143\1\40\1\156\1\u2019\1\156\1\144\1\146\1\145\1\u2019\1\164\2\u2019"+
		"\2\145\1\u2019\1\40\1\156\1\162\1\u2019\1\156\1\145\30\u2019\1\163\1\141"+
		"\1\154\1\uffff\2\u2019\1\163\1\40\1\162\1\145\1\150\1\145\1\105\1\162"+
		"\1\54\1\144\1\54\1\151\1\40\1\71\1\40\1\u2019\1\40\1\156\1\116\1\150\2"+
		"\40\1\u2019\1\146\1\40\1\145\1\162\1\144\3\u2019\1\40\25\u2019\1\143\1"+
		"\162\1\141\5\u2019\1\151\1\163\1\123\1\u2019\1\40\1\156\1\71\1\144\1\107"+
		"\1\145\1\u2019\1\144\2\40\20\u2019\1\157\1\164\1\143\2\u2019\1\162\1\u2019"+
		"\1\40\1\164\1\71\1\u2019\1\40\1\162\1\40\15\u2019\1\142\1\151\1\153\1"+
		"\u2019\1\145\1\154\1\71\16\u2019\1\55\2\u2019\1\40\1\151\13\u2019\1\103"+
		"\13\u2019\1\157\7\u2019\1\154\6\u2019\1\157\6\u2019\1\162\24\u2019";
	static final String DFA45_acceptS =
		"\32\uffff\1\10\1\15\1\20\104\uffff\1\2\64\uffff\1\16\10\uffff\1\7\u00a4"+
		"\uffff\1\21\u00a2\uffff\1\5\25\uffff\1\20\1\uffff\1\13\7\uffff\1\1\u0081"+
		"\uffff\1\11\154\uffff\1\3\32\uffff\1\17\120\uffff\1\4\1\12\u0090\uffff"+
		"\1\14\137\uffff\1\6\u010c\uffff";
	static final String DFA45_specialS =
		"\30\uffff\1\1\u01a6\uffff\1\0\u02cc\uffff\1\2\u00d4\uffff}>";
	static final String[] DFA45_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\5\uffff\2\34\1\30\3\uffff\2\34\1\33"+
			"\1\uffff\12\31\2\34\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
			"\1\15\1\16\1\17\1\1\1\3\1\2\1\20\1\34\1\21\1\22\1\23\1\34\1\24\1\25\1"+
			"\26\1\27\1\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff\1\34",
			"\1\43\5\uffff\1\45\2\uffff\1\37\1\41\15\uffff\1\35\7\uffff\1\36\5\uffff"+
			"\1\44\2\uffff\1\40\1\42",
			"\1\47\3\uffff\1\46\3\uffff\1\50",
			"\1\53\25\uffff\1\52\11\uffff\1\51",
			"\1\54\2\uffff\1\55\1\uffff\1\56\1\57\1\60\1\61\6\uffff\1\62",
			"\1\72\33\uffff\1\63\3\uffff\1\64\3\uffff\1\65\2\uffff\1\66\2\uffff\1"+
			"\67\2\uffff\1\70\2\uffff\1\71",
			"\1\102\21\uffff\1\73\3\uffff\1\74\2\uffff\1\75\1\76\2\uffff\1\77\2\uffff"+
			"\1\100\5\uffff\1\101",
			"\1\105\16\uffff\1\103\15\uffff\1\104\2\uffff\1\106",
			"\1\107",
			"\1\114\26\uffff\1\110\2\uffff\1\111\2\uffff\1\112\2\uffff\1\113",
			"\1\122\22\uffff\1\115\3\uffff\1\116\2\uffff\1\117\2\uffff\1\120\2\uffff"+
			"\1\121",
			"\1\124\11\uffff\1\125\21\uffff\1\123",
			"\1\126\1\127\16\uffff\1\130\1\uffff\1\131",
			"\1\132",
			"\1\133\11\uffff\1\134\5\uffff\1\135",
			"\1\143\13\uffff\1\136\3\uffff\1\137\2\uffff\1\140\6\uffff\1\142\u0086"+
			"\uffff\1\141",
			"\1\144\3\uffff\1\145\2\uffff\1\146\3\uffff\1\147\2\uffff\1\150\5\uffff"+
			"\1\151\3\uffff\1\152",
			"\1\157\33\uffff\1\153\2\uffff\1\154\6\uffff\1\155\5\uffff\1\156",
			"\1\176\16\uffff\1\173\4\uffff\1\175\1\uffff\1\174\11\uffff\1\160\1\uffff"+
			"\1\161\1\uffff\1\162\2\uffff\1\163\1\164\1\uffff\1\165\3\uffff\1\166"+
			"\1\167\3\uffff\1\170\1\171\1\uffff\1\172",
			"\1\u0082\2\uffff\1\u0087\6\uffff\1\u0083\5\uffff\1\u0085\22\uffff\1"+
			"\u0086\1\177\5\uffff\1\u0080\2\uffff\1\u0081\2\uffff\1\u0084",
			"\1\u008b\3\uffff\1\u008a\37\uffff\1\u0089\3\uffff\1\u0088",
			"\1\u0090\11\uffff\1\u008f\25\uffff\1\u008c\2\uffff\1\u008d\1\u008e",
			"\1\u0091",
			"\1\u0092",
			"\11\34\2\u0095\2\34\1\u0095\22\34\1\u0095\17\34\12\u0094\23\34\1\u0093"+
			"\uffb2\34",
			"\3\34\3\uffff\1\34\1\u0097\2\uffff\12\31\1\u0098\1\34\5\uffff\32\34"+
			"\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff\1\34",
			"",
			"",
			"",
			"\1\u009a\1\uffff\1\u009b\4\uffff\1\u0099",
			"\1\u009c\4\uffff\1\u009d",
			"\1\u009f\62\uffff\1\u009e",
			"\1\u009f\122\uffff\1\u00a0",
			"\1\u009f",
			"\1\u009f",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a8\3\uffff\1\u00a7",
			"\1\u00a9\25\uffff\1\u00aa",
			"\1\u00ab",
			"\1\u00ac\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5\2\uffff\1\u00b6\7\uffff\1\u00b7\5\uffff\1\u00b8",
			"\1\u00b9",
			"\1\u00ba\15\uffff\1\u00bb\5\uffff\1\u00bc",
			"\1\u00bd\1\u00be\1\uffff\1\u00bf\2\uffff\1\u00c0\1\u00c1",
			"\1\u00c2\7\uffff\1\u00c3\13\uffff\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7\4\uffff\1\u00c8\3\uffff\1\u00c9\3\uffff\1\u00ca",
			"\1\u00cb",
			"\1\u00cc\3\uffff\1\u00cd\5\uffff\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1\10\uffff\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5\10\uffff\1\u00d6\1\uffff\1\u00d7",
			"\1\u00d8\4\uffff\1\u00d9",
			"\1\u009f",
			"\1\u009f",
			"\1\u00da\14\uffff\1\u00db",
			"\1\u00dc\10\uffff\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0\3\uffff\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6\5\uffff\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea\3\uffff\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3\14\uffff\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7\4\uffff\1\u00f8\3\uffff\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe\1\uffff\1\u00ff",
			"\1\u0100\1\uffff\1\u0101\6\uffff\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105\2\uffff\1\u0106\1\u0107\1\uffff\1\u0108\2\uffff\1\u0109",
			"\1\u010a\4\uffff\1\u010b",
			"\1\u010c",
			"\1\u010d\17\uffff\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113\2\uffff\1\u0114\1\u0115\6\uffff\1\u0116",
			"\1\u0117\6\uffff\1\u0118",
			"\1\u0119\22\uffff\1\u011a",
			"\1\u011b\3\uffff\1\u011c",
			"\1\u011d\11\uffff\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121\7\uffff\1\u0122",
			"\1\u0123",
			"\1\u0125\4\uffff\1\u0124",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u013b\4\uffff\1\u0138\2\uffff\1\u0139\6\uffff\1\u013a",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\10\34\1\u0142\21\34\u1f9e\uffff\1\34",
			"\2\u0144\2\uffff\1\u0144\22\uffff\1\u0144\5\uffff\2\34\1\uffff\1\u0144"+
			"\2\uffff\2\34\2\uffff\12\u0143\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\2\u0144\2\uffff\1\u0144\22\uffff\1\u0144\5\uffff\2\34\4\uffff\2\34"+
			"\2\uffff\12\u0145\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e"+
			"\uffff\1\34",
			"",
			"\12\u0146",
			"\12\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u009f",
			"",
			"\1\u009f",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\141",
			"\1\u0151",
			"\1\u0153\7\uffff\1\u0152",
			"\1\u0154\20\uffff\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161\15\uffff\1\u0162",
			"\1\u0163\12\uffff\1\u0164\2\uffff\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d\25\uffff\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174\22\uffff\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a\3\uffff\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180\5\uffff\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u009f\113\uffff\1\u0186",
			"\1\u0187",
			"\1\u009f",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e\5\uffff\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\141",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b\27\uffff\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1\5\uffff\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9\7\uffff\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd\1\u01de",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u01fa\7"+
			"\34\u1f9e\uffff\1\34",
			"\2\u01fc\2\uffff\1\u01fc\22\uffff\1\u01fc\5\uffff\2\34\1\uffff\1\u01fd"+
			"\2\uffff\2\34\2\uffff\12\u01fb\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"",
			"\2\u01fc\2\uffff\1\u01fc\22\uffff\1\u01fc\5\uffff\2\34\1\uffff\1\u01fd"+
			"\2\uffff\2\34\2\uffff\12\u0145\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\1\u01fe\2\uffff\12\u0146",
			"\2\u01ff\2\uffff\1\u01ff\22\uffff\1\u01ff\17\uffff\12\u0147",
			"\1\u0200\3\uffff\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u009f",
			"\1\u009f",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\141",
			"\1\u020a",
			"\1\u020b\3\uffff\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"\1\u022d",
			"\1\141\103\uffff\1\u022e\10\uffff\1\u022f",
			"\1\u01e7",
			"\1\u0230",
			"\1\u0231",
			"\1\141",
			"\1\u0232",
			"\1\u0233",
			"\1\u0234",
			"\1\u0235",
			"\1\u0236",
			"\1\u0237",
			"\1\141",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"\1\u0242",
			"\1\u0243",
			"\1\u0245\17\uffff\1\u0244",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\141",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\1\u026a",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\u0271",
			"\1\u0272",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34\u1f9e\uffff\1\34",
			"\61\34\1\u0274\20\34\1\u0275\1\u0276\1\34\1\u0277\1\u0278\1\u0279\1"+
			"\34\1\u027a\1\34\1\u027b\1\u027c\1\u0273\1\u027d\3\34\1\u027e\1\u027f"+
			"\1\u0280\2\34\1\u0281\uffa8\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\12\34\1\u0282\7\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\2\u0289\2\uffff\1\u0289\22\uffff\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292",
			"\1\u0293",
			"\1\141",
			"\1\u0294",
			"\1\u0295",
			"\1\141",
			"\1\141",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2",
			"\1\141\17\uffff\1\u01e7",
			"\1\u02a3",
			"\1\u02a4",
			"",
			"\1\u02a5",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u02a9",
			"\1\u02aa",
			"\1\u02ab",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\1\141",
			"\1\u02af",
			"\1\u02b0",
			"\1\141\107\uffff\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u02b6\27"+
			"\34\u1f9e\uffff\1\34",
			"\2\u01fc\2\uffff\1\u01fc\22\uffff\1\u01fc\5\uffff\2\34\1\uffff\1\u02b7"+
			"\2\uffff\2\34\2\uffff\12\u0145\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\2\u01fc\2\uffff\1\u01fc\22\uffff\1\u01fc\5\uffff\2\34\1\uffff\1\u01fd"+
			"\2\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34"+
			"\u1f9e\uffff\1\34",
			"",
			"\12\u02b8",
			"",
			"\1\u02b9",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u02bd",
			"\1\u02be",
			"\1\u02bf",
			"",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\1\u02c5",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\1\u02d3",
			"\1\u02d4",
			"\1\u02d5",
			"\1\u02d6",
			"\1\u02d7",
			"\1\141",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u02de",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u02df",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\141",
			"\1\u02e4",
			"\1\u02e5",
			"\1\u02e6",
			"\1\141",
			"\1\u02e7",
			"\1\u02e8",
			"\1\u02e9",
			"\1\u02ea",
			"\1\u02eb",
			"\1\u02ec",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"\1\u02f0",
			"\1\u02f1",
			"\1\u02f2",
			"\1\141\122\uffff\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\1\u02f7",
			"\1\141",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\141",
			"\1\u02fe",
			"\1\u02ff",
			"\1\141\104\uffff\1\u0300",
			"\1\u0301",
			"\1\u0289",
			"\1\u0302",
			"\1\u0303",
			"\1\u0304",
			"\1\u01e7",
			"\1\u0305",
			"\1\u0306",
			"\1\141",
			"\1\u0307",
			"\1\u0308",
			"\1\u0309",
			"\1\141",
			"\1\u030a",
			"\1\u030b",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\141",
			"\1\u0310",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\u0315",
			"\1\141",
			"\1\u0316",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\10\34\1\u031c\21\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\3\34\1\u031d\1\34\1\u031e\6\34\5\uffff\32"+
			"\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff\1\34",
			"\1\141\5\uffff\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff"+
			"\1\34\1\uffff\16\34\1\u031f\13\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\7\34\1\u0320\3\34\1\u0321\2\34\1\u0322\5\34\1\u0323\5\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\15\34\1\u0324\14\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\10\34\1\u0325\2\34\1\u0326\16\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\4\34\1\u0327\11\34\1\u0328\13\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\21\34\1\u0329\10\34\u1f9e\uffff\1\34",
			"\1\141\5\uffff\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff"+
			"\1\34\1\uffff\32\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\1\u032a\15\34\1\u032b\13\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\16\34\1\u032c\13\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\16\34\1\u032d\13\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\14\34\1\u032e\6\34\1\u032f\1\u0330\5\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\16\34\1\u0331\13\34\u1f9e\uffff\1\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\7\34\1\u0332\1\u0333\21\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0334",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\1\u0338",
			"\1\u0339",
			"",
			"\1\141",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\141",
			"\1\u0342",
			"\1\141",
			"\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\1\u0348",
			"\1\u0349",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\1\u0350",
			"\1\u0351",
			"\1\u0352",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359",
			"\1\u035a",
			"\1\141",
			"\1\u035b",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\1\u0362\1\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e"+
			"\uffff\1\34",
			"\2\u0363\2\uffff\1\u0363\22\uffff\1\u0363\17\uffff\12\u0364",
			"\1\u0365\2\uffff\12\u02b8",
			"\1\u0207",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\1\u036a",
			"\1\u036b",
			"\1\u0207",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\u0371",
			"\1\u0372",
			"\1\141",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\1\141\122\uffff\1\u037e",
			"\1\u037f",
			"\1\u0380",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u0381",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0382",
			"\1\u0383",
			"\1\u0384",
			"\1\u0385",
			"\1\141",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\1\u038b",
			"\1\u038c",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u038d",
			"\1\u038e",
			"\1\u038f",
			"\1\141",
			"\1\u0390",
			"\1\141",
			"\1\u0391",
			"\1\u0392",
			"",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\141",
			"\1\u036a",
			"\1\u036a",
			"\1\141",
			"\1\141",
			"\1\141",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\141",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"",
			"\1\u03a5",
			"\1\141",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\141",
			"\1\u03aa",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u03ab",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u03ad\4"+
			"\34\1\u03ac\7\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u03ae\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u03af\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\u03b0\1"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u03b1\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\24\34\1\u03b2\5"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u03b3\10"+
			"\34\1\u03b4\16\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u03b5\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u03b6\23"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u03b7\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u03b8\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u03b9\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u03ba\5"+
			"\34\1\u03bb\10\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u03bc\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\34\1\u03bd\30"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u03be\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\25\34\1\u03bf\4"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\24\34\1\u03c0\5"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u03c1\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u03c2\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u03c3\7"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\u03c4\1"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u03c5\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u03c6\10"+
			"\34\u1f9e\uffff\1\34",
			"\1\u03c7",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"\1\u03cb",
			"\1\u03cc",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\1\u03d0",
			"\1\u03d1",
			"\1\u03d2",
			"\1\u03d3",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u03d6",
			"\1\u03d7",
			"\1\u03d8",
			"\1\141",
			"\1\u036a",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\1\u03dc",
			"\1\u036a",
			"\1\u03dd",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0",
			"\1\u03e1",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u03e5",
			"\1\u03e6",
			"\1\u03e7",
			"\1\u03e8",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"\1\u03ec",
			"\1\u03ed",
			"\1\u03ee",
			"\1\u03ef",
			"",
			"",
			"\12\u03f0",
			"\12\u03f1",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u03f2",
			"\1\u03f3",
			"\2\u03f4\2\uffff\1\u03f4\22\uffff\1\u03f4",
			"\1\u03f5",
			"\1\141",
			"\1\u03f6",
			"\1\141",
			"\1\u03f7",
			"\1\u03f8",
			"\1\u03f9",
			"\1\u03fa",
			"\1\u03fb",
			"\1\141",
			"\1\u03fc",
			"\1\u03fd",
			"\1\u03fe",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u03ff",
			"\1\u0400",
			"\1\141",
			"\1\141",
			"\1\141",
			"\1\u0401",
			"\1\u0402",
			"\1\141",
			"\1\u0403",
			"\1\u0404",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\1\141",
			"\1\141",
			"\1\141",
			"\1\u040a",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"\1\141",
			"\1\u040e",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u040f",
			"\1\141",
			"\1\u0410",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0411",
			"\1\u01e7",
			"\1\u0412",
			"\1\141",
			"\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"\1\141",
			"\1\u0417",
			"\1\u0418",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u041c",
			"\1\u041d",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u041e\27"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u041f\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\10\34\1\u0420\21\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\10\34\1\u0421\21\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\12\34\1\u0422\17"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u0423\7"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\14\34\1\u0424\15"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\12\34\1\u0425\17"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0426\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u0427\16"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u0428\16"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u0429\16"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u042a\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\14\34\1\u042b\15"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u042c\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u042d\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u042e\7"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u042f\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u0430\23"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0431\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u0432\23"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0433\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0434\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u0435\7"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u0437\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0438\25"+
			"\34\u1f9e\uffff\1\34",
			"\1\u0439",
			"\1\141",
			"\1\u043a",
			"\1\u043b",
			"\1\u043c",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u043d",
			"\1\u043e",
			"\1\u043f",
			"\1\u0440",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0441",
			"\1\u0442",
			"\1\u0443",
			"\1\141",
			"\1\u0444",
			"\1\u0445",
			"\1\141",
			"\1\u0446",
			"\1\u0447",
			"\1\u0448",
			"\1\u0449",
			"\1\141",
			"\1\141",
			"\1\u01e7",
			"\1\u036a",
			"\1\u036a",
			"\1\u044a",
			"\1\u044b",
			"\1\141\122\uffff\1\u044c",
			"\1\u01e7",
			"\1\u0311",
			"\1\u044d",
			"\1\u044e",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u044f",
			"\1\u01e7",
			"\1\u0450",
			"\1\u0451",
			"\1\u0452",
			"\12\u0453",
			"\3\34\3\uffff\2\34\2\uffff\12\u03f1\2\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34\u1f9e\uffff\1\34",
			"\1\u0455",
			"\1\u0456",
			"",
			"\1\u0457",
			"\1\u0458",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\141",
			"\1\141",
			"\1\u045d",
			"\1\u045e",
			"\1\u045f",
			"\1\u0460",
			"\1\u0461",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u0462",
			"\1\141",
			"\1\141",
			"\1\u0463",
			"\1\u0464",
			"\1\u0465",
			"\1\u0466",
			"\1\u0467",
			"\1\141",
			"\1\u0468",
			"\1\u0469",
			"\1\u046a",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u046b",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\4\34\1\u046c\15\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\141",
			"\1\u046d",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u046e",
			"\1\141",
			"\1\u046f",
			"\1\u0470",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\1\141\1\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0471\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0472\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0473\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u0474\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0475\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\34\1\u0476\30"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0477\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0478\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\u0479\1"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u047a\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u047b\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\1"+
			"\34\1\u047c\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u047d\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u047e\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u047f\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0480\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0481\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u0482\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0483\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u0484\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0485\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u0486\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0487\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0488\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\1\u048c\3\uffff\2\34\2\uffff\14\34\5\uffff\1\u0489\1\u048b\15"+
			"\34\1\u048a\12\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u048d\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u048e\22"+
			"\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u048f",
			"\1\u0490",
			"\1\u0491",
			"\1\u036a",
			"\1\u0492",
			"\1\141",
			"\1\141",
			"\1\141",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u0493",
			"\1\141",
			"\1\u0494",
			"\1\u01e7",
			"\1\u0495",
			"\1\u036a",
			"\1\u036a",
			"\1\u036a",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\1\u0496",
			"\1\u0497",
			"\1\u0498",
			"\1\u0499",
			"\1\u049a",
			"\1\u049b",
			"\1\u049c",
			"",
			"\1\u049d",
			"\1\141",
			"\1\u049e",
			"\1\141",
			"\1\u049f",
			"\1\u04a0",
			"\1\u04a1",
			"\1\u04a2",
			"\1\141",
			"\1\u04a3",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u04a4",
			"\1\u04a5",
			"\1\u04a6",
			"\1\u04a7",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u04a8",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u04a9",
			"\1\u04aa",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u04ab",
			"\1\u04ac",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u04ad",
			"\1\u04ae",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u04af\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u04b0\27"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u04b1\27"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u04b2\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\17\34\1\u04b3\12"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u04b4\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u04b5\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u04b6\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\1"+
			"\34\1\u04b7\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u04b8\7"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\2\34\1\u04b9\27\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u04ba\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u04bb\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u04bc\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u04bd\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\2\34\1\u04be\27\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u04bf\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\22\34\1\u04c0\7\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u04c1\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u04c2\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\27\34\1\u04c3\2"+
			"\34\u1f9e\uffff\1\34",
			"\1\u04c4",
			"\1\u04c5",
			"\1\u04c6",
			"\115\34\1\u04c7\uffb2\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u04c8\31\34\u1f9e"+
			"\uffff\1\34",
			"\1\u04c9",
			"\1\141",
			"\1\u04ca",
			"\1\u04cb",
			"\1\u04cc",
			"\1\u04cd",
			"\1\u04ce",
			"\1\u04cf",
			"\1\u036a",
			"\1\u04d0",
			"\1\u036a",
			"\1\u04d1",
			"\1\141",
			"\12\u04d2",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u04d3",
			"\1\u04d4",
			"\1\u04d5",
			"\1\141",
			"\1\141",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u04d6",
			"\1\141",
			"\1\u04d7",
			"\1\u04d8",
			"\1\u04d9",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\141",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\24\34\1\u04da\5"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u04db\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u04dc\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u04dd\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u04de\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u04df\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\2\34\1\u04e0\27\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u04e1\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u04e2\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u04e3\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u04e4\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u04e5\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u04e6\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u04e7\27"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u04e8\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u04e9\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\10\34\1\u04ed\21\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u04ee\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u04ef",
			"\1\u04f0",
			"\1\u04f1",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u04f2",
			"\12\u04f3",
			"\1\u04f4",
			"\1\u04f5",
			"\1\u04f6",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u04f7",
			"\1\141",
			"\1\141",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u04f8\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u04f9\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u04fa\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u04fb\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u04fc\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\22\34\1\u04fd\3\34\1\u04fe\3\34\4\uffff\1\34"+
			"\1\uffff\32\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u04ff\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0500\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0501\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0502\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\2\34\1\u0503\27\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0504\26"+
			"\34\u1f9e\uffff\1\34",
			"\1\u0505",
			"\1\u0506",
			"\1\u0507",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u03ac\7"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0508\10"+
			"\34\u1f9e\uffff\1\34",
			"\1\u0509",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\1\u01e7",
			"\1\u050a",
			"\12\u050b",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\1\u01e7",
			"\1\u050c",
			"\1\141",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u050d\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\12\34\1\u050e\17"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u050f\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\2\34\1\u0510\17\34\1\u0511\7\34\4\uffff\1\34"+
			"\1\uffff\32\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u0512\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0513\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u0514\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u0515\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0516\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u0517\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0518\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\1\u0519",
			"\1\u051a",
			"\1\u051b",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u051c\25"+
			"\34\u1f9e\uffff\1\34",
			"\1\u051d",
			"\1\u051e",
			"\12\u051f",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0520\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u0521\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0522\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\17\34\1\u0523\12"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0524\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0525\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0526\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0527\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u0528\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0529\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\1\u048c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34\u1f9e\uffff\1\34",
			"\1\u052a",
			"\2\34\1\u048c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u052b\26"+
			"\34\u1f9e\uffff\1\34",
			"\1\141",
			"\1\u052c",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u052d\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u052e\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u052f\27"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0530\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0531\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0532\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0533\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0534\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u0535\6"+
			"\34\u1f9e\uffff\1\34",
			"\1\u0536",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\1\u01bf\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u01be\7\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\1\34\1\u0537\30\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0538\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\12\34\1\u0539\17"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u053a\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u053b\6"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u053c\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u053d\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\1\u053e",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u053f\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0540\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0541\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0542\22"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0543\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\3\34\1\u0544\26\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\1\u0545",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\u0546\1"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0547\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u0548\23"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0549\31\34\u1f9e"+
			"\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u054a\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\24\34\1\u054b\5"+
			"\34\u1f9e\uffff\1\34",
			"\1\u054c",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u054d\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u054e\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u054f\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u0550\27"+
			"\34\u1f9e\uffff\1\34",
			"\1\u0551",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0552\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0553\10"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0554\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\12\34\1\u0555\17"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\1\u048c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0556\25"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0557\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u0558\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0559\26"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\23\34\1\u055a\6\34\4\uffff\1\34\1\uffff\32"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u055b\13"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u055c\16"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u055d\16"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u055e\21"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u055f\14"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u0560\23"+
			"\34\u1f9e\uffff\1\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u0436\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34\u1f9e\uffff"+
			"\1\34"
	};

	static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
	static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
	static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
	static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
	static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
	static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
	static final short[][] DFA45_transition;

	static {
		int numStates = DFA45_transitionS.length;
		DFA45_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
		}
	}

	class DFA45 extends DFA {

		public DFA45(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 45;
			this.eot = DFA45_eot;
			this.eof = DFA45_eof;
			this.min = DFA45_min;
			this.max = DFA45_max;
			this.accept = DFA45_accept;
			this.special = DFA45_special;
			this.transition = DFA45_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | GROUP_RING | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | STANDALONE_COMMENT | COMMENT | PARENTHETICAL_INT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA45_447 = input.LA(1);
						s = -1;
						if ( (LA45_447=='M') ) {s = 627;}
						else if ( (LA45_447=='1') ) {s = 628;}
						else if ( (LA45_447=='B') ) {s = 629;}
						else if ( (LA45_447=='C') ) {s = 630;}
						else if ( (LA45_447=='E') ) {s = 631;}
						else if ( (LA45_447=='F') ) {s = 632;}
						else if ( (LA45_447=='G') ) {s = 633;}
						else if ( (LA45_447=='I') ) {s = 634;}
						else if ( (LA45_447=='K') ) {s = 635;}
						else if ( (LA45_447=='L') ) {s = 636;}
						else if ( (LA45_447=='N') ) {s = 637;}
						else if ( (LA45_447=='R') ) {s = 638;}
						else if ( (LA45_447=='S') ) {s = 639;}
						else if ( (LA45_447=='T') ) {s = 640;}
						else if ( (LA45_447=='W') ) {s = 641;}
						else if ( ((LA45_447 >= '\u0000' && LA45_447 <= '0')||(LA45_447 >= '2' && LA45_447 <= 'A')||LA45_447=='D'||LA45_447=='H'||LA45_447=='J'||(LA45_447 >= 'O' && LA45_447 <= 'Q')||(LA45_447 >= 'U' && LA45_447 <= 'V')||(LA45_447 >= 'X' && LA45_447 <= '\uFFFF')) ) {s = 28;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA45_24 = input.LA(1);
						s = -1;
						if ( (LA45_24=='M') ) {s = 147;}
						else if ( ((LA45_24 >= '0' && LA45_24 <= '9')) ) {s = 148;}
						else if ( ((LA45_24 >= '\t' && LA45_24 <= '\n')||LA45_24=='\r'||LA45_24==' ') ) {s = 149;}
						else if ( ((LA45_24 >= '\u0000' && LA45_24 <= '\b')||(LA45_24 >= '\u000B' && LA45_24 <= '\f')||(LA45_24 >= '\u000E' && LA45_24 <= '\u001F')||(LA45_24 >= '!' && LA45_24 <= '/')||(LA45_24 >= ':' && LA45_24 <= 'L')||(LA45_24 >= 'N' && LA45_24 <= '\uFFFF')) ) {s = 28;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA45_1164 = input.LA(1);
						s = -1;
						if ( (LA45_1164=='M') ) {s = 1223;}
						else if ( ((LA45_1164 >= '\u0000' && LA45_1164 <= 'L')||(LA45_1164 >= 'N' && LA45_1164 <= '\uFFFF')) ) {s = 28;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 45, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
