// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-02-23 13:12:47

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
	public static final int FRAG_MONTH=17;
	public static final int FRAG_PAREN_LEFT=18;
	public static final int FRAG_PAREN_RIGHT=19;
	public static final int FRAG_PROPER_NAME=20;
	public static final int FRAG_RING=21;
	public static final int FRAG_SPEC_CHAR=22;
	public static final int FRAG_SPEC_WORD_CHAR=23;
	public static final int FRAG_TIME_LABEL=24;
	public static final int FRAG_TITLE=25;
	public static final int FRAG_WEEK_DAY=26;
	public static final int INT=27;
	public static final int JUDGE_NAME=28;
	public static final int JUNIOR_CLASS=29;
	public static final int PARENTHETICAL=30;
	public static final int PARENTHETICAL_INT=31;
	public static final int PARENTHETICAL_NAME=32;
	public static final int PHONE_NUMBER=33;
	public static final int PROPER_NAME=34;
	public static final int RING_TITLE=35;
	public static final int SPECIAL_SUFFIX=36;
	public static final int STANDALONE_COMMENT=37;
	public static final int TIME=38;
	public static final int WORD=39;
	public static final int WS=40;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:2: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Itermediate' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:65:4: 'Master Class'
					{
					match("Master Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:66:3: 'Open Senior'
					{
					match("Open Senior"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:3: 'Open Intermediate'
					{
					match("Open Intermediate"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:68:3: 'Open Junior'
					{
					match("Open Junior"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:69:3: 'Novice Senior'
					{
					match("Novice Senior"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:3: 'Novice Junior'
					{
					match("Novice Junior"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:71:3: 'Novice Itermediate'
					{
					match("Novice Itermediate"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:2: ( ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:4: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:4: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:5: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:28: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:49: ( 's' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='s') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:49: 's'
					{
					match('s'); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:54: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:54: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:58: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
				else if ( (LA7_1=='1'||(LA7_1 >= 'B' && LA7_1 <= 'C')||(LA7_1 >= 'E' && LA7_1 <= 'G')||LA7_1=='I'||LA7_1=='L'||(LA7_1 >= 'R' && LA7_1 <= 'T')||LA7_1=='W') ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:59: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); 
					mFRAG_BREED_NAME_CATEGORY(); 

					match(')'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:92: ( WS )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:92: WS
							{
							mWS(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:96: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='A'||LA6_0=='P') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:96: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); 

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:132: ( BREED_NAME_SUFFIX )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='(') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:64:132: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:2: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:4: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:4: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:67:5: FRAG_BREED_NAME_SPECIAL_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:2: ( '(Misc. Dog)' | '(Misc. Dogs)' | '(Misc. Bitch)' | '(Misc. Bitches)' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:4: '(Misc. Dog)'
					{
					match("(Misc. Dog)"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:18: '(Misc. Dogs)'
					{
					match("(Misc. Dogs)"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:33: '(Misc. Bitch)'
					{
					match("(Misc. Bitch)"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:70:49: '(Misc. Bitches)'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:2: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:4: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:4: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:5: 'Sweepstakes'
					{
					match("Sweepstakes"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:19: 'Entry'
					{
					match("Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:27: 'Entries'
					{
					match("Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:73:37: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:74:29: ( 'Veteran Dog' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:74:31: 'Veteran Dog'
			{
			match("Veteran Dog"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:76:2: ( 'Ascob' | 'Parti-Color' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='A') ) {
				alt11=1;
			}
			else if ( (LA11_0=='P') ) {
				alt11=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:76:4: 'Ascob'
					{
					match("Ascob"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:76:12: 'Parti-Color'
					{
					match("Parti-Color"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:78:2: ( '13 Inch' | '15 Inch' | 'Boykin' | 'Cocker' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'German Shorthaired' | 'Golden' | 'Gordon' | 'Irish' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Toy' | 'White' | 'Wirehaired' )
			int alt12=23;
			switch ( input.LA(1) ) {
			case '1':
				{
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='3') ) {
					alt12=1;
				}
				else if ( (LA12_1=='5') ) {
					alt12=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'B':
				{
				alt12=3;
				}
				break;
			case 'C':
				{
				alt12=4;
				}
				break;
			case 'E':
				{
				int LA12_4 = input.LA(2);
				if ( (LA12_4=='n') ) {
					int LA12_16 = input.LA(3);
					if ( (LA12_16=='g') ) {
						int LA12_25 = input.LA(4);
						if ( (LA12_25=='l') ) {
							int LA12_30 = input.LA(5);
							if ( (LA12_30=='i') ) {
								int LA12_33 = input.LA(6);
								if ( (LA12_33=='s') ) {
									int LA12_37 = input.LA(7);
									if ( (LA12_37=='h') ) {
										int LA12_39 = input.LA(8);
										if ( (LA12_39==' ') ) {
											int LA12_42 = input.LA(9);
											if ( (LA12_42=='C') ) {
												alt12=6;
											}
											else if ( (LA12_42=='S') ) {
												alt12=7;
											}
											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 12, 42, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else {
											alt12=5;
										}
									}
									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 12, 37, input);
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
											new NoViableAltException("", 12, 33, input);
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
										new NoViableAltException("", 12, 30, input);
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
									new NoViableAltException("", 12, 25, input);
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
								new NoViableAltException("", 12, 16, input);
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
							new NoViableAltException("", 12, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				alt12=8;
				}
				break;
			case 'G':
				{
				int LA12_6 = input.LA(2);
				if ( (LA12_6=='e') ) {
					alt12=9;
				}
				else if ( (LA12_6=='o') ) {
					int LA12_18 = input.LA(3);
					if ( (LA12_18=='l') ) {
						alt12=10;
					}
					else if ( (LA12_18=='r') ) {
						alt12=11;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 12, 18, input);
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
							new NoViableAltException("", 12, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'I':
				{
				alt12=12;
				}
				break;
			case 'L':
				{
				int LA12_8 = input.LA(2);
				if ( (LA12_8=='a') ) {
					alt12=13;
				}
				else if ( (LA12_8=='o') ) {
					int LA12_20 = input.LA(3);
					if ( (LA12_20=='n') ) {
						int LA12_28 = input.LA(4);
						if ( (LA12_28=='g') ) {
							int LA12_31 = input.LA(5);
							if ( (LA12_31==' ') ) {
								alt12=14;
							}
							else if ( (LA12_31=='h') ) {
								alt12=15;
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 12, 31, input);
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
									new NoViableAltException("", 12, 28, input);
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
								new NoViableAltException("", 12, 20, input);
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
							new NoViableAltException("", 12, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				alt12=16;
				}
				break;
			case 'R':
				{
				alt12=17;
				}
				break;
			case 'S':
				{
				int LA12_11 = input.LA(2);
				if ( (LA12_11=='m') ) {
					int LA12_21 = input.LA(3);
					if ( (LA12_21=='o') ) {
						int LA12_29 = input.LA(4);
						if ( (LA12_29=='o') ) {
							int LA12_32 = input.LA(5);
							if ( (LA12_32=='t') ) {
								int LA12_36 = input.LA(6);
								if ( (LA12_36=='h') ) {
									int LA12_38 = input.LA(7);
									if ( (LA12_38==' ') ) {
										alt12=19;
									}
									else {
										alt12=18;
									}
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 12, 36, input);
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
										new NoViableAltException("", 12, 32, input);
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
									new NoViableAltException("", 12, 29, input);
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
								new NoViableAltException("", 12, 21, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA12_11=='t') ) {
					alt12=20;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'T':
				{
				alt12=21;
				}
				break;
			case 'W':
				{
				int LA12_13 = input.LA(2);
				if ( (LA12_13=='h') ) {
					alt12=22;
				}
				else if ( (LA12_13=='i') ) {
					alt12=23;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:79:3: '13 Inch'
					{
					match("13 Inch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:80:3: '15 Inch'
					{
					match("15 Inch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:81:3: 'Boykin'
					{
					match("Boykin"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:82:3: 'Cocker'
					{
					match("Cocker"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:83:3: 'English'
					{
					match("English"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:84:3: 'English Cocker'
					{
					match("English Cocker"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:85:3: 'English Springer'
					{
					match("English Springer"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:86:3: 'Field'
					{
					match("Field"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:87:3: 'German Shorthaired'
					{
					match("German Shorthaired"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:88:3: 'Golden'
					{
					match("Golden"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:89:3: 'Gordon'
					{
					match("Gordon"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:90:3: 'Irish'
					{
					match("Irish"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:91:3: 'Labrador'
					{
					match("Labrador"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:92:3: 'Long Coat'
					{
					match("Long Coat"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:93:3: 'Longhaired'
					{
					match("Longhaired"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:94:3: 'Miniature'
					{
					match("Miniature"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:95:3: 'Rough'
					{
					match("Rough"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:96:3: 'Smooth'
					{
					match("Smooth"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:97:3: 'Smooth Coat'
					{
					match("Smooth Coat"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:98:3: 'Standard'
					{
					match("Standard"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:99:3: 'Toy'
					{
					match("Toy"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:100:3: 'White'
					{
					match("White"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:101:3: 'Wirehaired'
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

	// $ANTLR start "FRAG_BREED_NAME_SINGLE"
	public final void mFRAG_BREED_NAME_SINGLE() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:2: ( ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:3: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:3: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt13=189;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:4: 'Affenpinscher'
					{
					match("Affenpinscher"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:2: 'Afghan Hound'
					{
					match("Afghan Hound"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:113:2: 'Airedale Terrier'
					{
					match("Airedale Terrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:114:2: 'Akita'
					{
					match("Akita"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:115:2: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:116:2: 'American English Coonhound'
					{
					match("American English Coonhound"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:117:2: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:118:2: 'American Foxhound'
					{
					match("American Foxhound"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:119:2: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:120:2: 'American Water Spaniel'
					{
					match("American Water Spaniel"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:2: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:122:2: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:123:2: 'Australian Shepherd'
					{
					match("Australian Shepherd"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:124:2: 'Australian Terrier'
					{
					match("Australian Terrier"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:125:2: 'Basenji'
					{
					match("Basenji"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:2: 'Basset Hound'
					{
					match("Basset Hound"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:127:2: 'Beagle'
					{
					match("Beagle"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:128:2: 'Bearded Collie'
					{
					match("Bearded Collie"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:129:2: 'Beauceron'
					{
					match("Beauceron"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:130:2: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:131:2: 'Belgian Malinois'
					{
					match("Belgian Malinois"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:132:2: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:133:2: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:2: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:2: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:136:2: 'Bichons Frise'
					{
					match("Bichons Frise"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:137:2: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:2: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:139:2: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:140:2: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:2: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:142:2: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:143:2: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:2: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:145:2: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:146:2: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:147:2: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:2: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:149:2: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:150:2: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:2: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:152:2: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:153:2: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:154:2: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:2: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:156:2: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:157:2: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:158:2: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:2: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:160:2: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:161:2: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:2: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:163:2: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:164:2: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:165:2: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:2: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:167:2: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:168:2: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:2: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:170:2: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:2: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:172:2: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:173:2: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:174:2: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:175:2: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:176:2: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:2: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:2: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:179:2: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:2: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:2: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:2: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:183:2: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:2: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:2: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:2: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:2: 'Fox Terrier'
					{
					match("Fox Terrier"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:188:2: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:2: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:2: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:191:2: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:2: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:2: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:2: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:2: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:2: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:2: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:198:2: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:199:2: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:2: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:2: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:202:2: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:2: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:2: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:205:2: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:2: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:2: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:2: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:2: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:2: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:2: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:2: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:2: 'Keeshonden'
					{
					match("Keeshonden"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:214:2: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:215:2: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:2: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:2: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:218:2: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:219:2: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:2: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:221:2: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:2: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:2: 'Lowchen'
					{
					match("Lowchen"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:224:2: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:225:2: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:226:2: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:2: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:2: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:2: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:2: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:2: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:2: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:2: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:2: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:2: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:2: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:2: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:2: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:2: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:2: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:2: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:2: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:2: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:2: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:2: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:2: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:2: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:2: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:2: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:2: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:2: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:2: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:2: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:2: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:2: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:2: 'Pulik'
					{
					match("Pulik"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:2: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:2: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:2: 'Retrievers'
					{
					match("Retrievers"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:2: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:2: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:2: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:263:2: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:2: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:2: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:2: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:2: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:2: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:2: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:2: 'Setters'
					{
					match("Setters"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:2: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:272:2: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:273:2: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:2: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:275:2: 'Siberian Huskies'
					{
					match("Siberian Huskies"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:276:2: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:277:2: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:2: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:2: 'Spaniels'
					{
					match("Spaniels"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:2: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:2: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:2: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:283:2: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:2: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:2: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:286:2: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:287:2: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:2: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:289:2: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:290:2: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:2: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:292:2: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:2: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:2: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:2: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:2: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:2: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:2: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:2: 'Yorkshire Terrier'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt14=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt14=1;
					}
					break;
				case 'A':
					{
					alt14=2;
					}
					break;
				case 'u':
					{
					int LA14_11 = input.LA(3);
					if ( (LA14_11=='n') ) {
						alt14=11;
					}
					else if ( (LA14_11=='l') ) {
						alt14=13;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 14, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'U':
					{
					int LA14_12 = input.LA(3);
					if ( (LA14_12=='N') ) {
						alt14=12;
					}
					else if ( (LA14_12=='L') ) {
						alt14=14;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 14, 12, input);
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
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA14_2 = input.LA(2);
				if ( (LA14_2=='e') ) {
					alt14=3;
				}
				else if ( (LA14_2=='E') ) {
					alt14=4;
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
			case 'M':
				{
				int LA14_3 = input.LA(2);
				if ( (LA14_3=='a') ) {
					int LA14_15 = input.LA(3);
					if ( (LA14_15=='r') ) {
						alt14=5;
					}
					else if ( (LA14_15=='y') ) {
						alt14=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 14, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA14_3=='A') ) {
					int LA14_16 = input.LA(3);
					if ( (LA14_16=='R') ) {
						alt14=6;
					}
					else if ( (LA14_16=='Y') ) {
						alt14=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 14, 16, input);
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
							new NoViableAltException("", 14, 3, input);
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
					alt14=7;
					}
					break;
				case 'P':
					{
					alt14=8;
					}
					break;
				case 'u':
					{
					alt14=15;
					}
					break;
				case 'U':
					{
					alt14=16;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA14_5 = input.LA(2);
				if ( (LA14_5=='e') ) {
					alt14=17;
				}
				else if ( (LA14_5=='E') ) {
					alt14=18;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				int LA14_6 = input.LA(2);
				if ( (LA14_6=='c') ) {
					alt14=19;
				}
				else if ( (LA14_6=='C') ) {
					alt14=20;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA14_7 = input.LA(2);
				if ( (LA14_7=='o') ) {
					alt14=21;
				}
				else if ( (LA14_7=='O') ) {
					alt14=22;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA14_8 = input.LA(2);
				if ( (LA14_8=='e') ) {
					alt14=23;
				}
				else if ( (LA14_8=='E') ) {
					alt14=24;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:8: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:19: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:8: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:16: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:8: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:16: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:8: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:14: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:8: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:15: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:8: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:15: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:308:8: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:308:17: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:309:8: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:309:20: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:8: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:18: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:8: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:19: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:312:8: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:312:19: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:26: ( ( '(' . ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:28: ( '(' . )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:28: ( '(' . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:29: '(' .
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:27: ( ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:29: ')'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:26: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:21: ( 'RING' | 'Ring' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='R') ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1=='I') ) {
					alt15=1;
				}
				else if ( (LA15_1=='i') ) {
					alt15=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:23: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:30: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:26: ( ',' | '_' | '-' | ';' | ':' | '\\'' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( input.LA(1)=='\''||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='_' ) {
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:2: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:4: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: ( 'am' | 'pm' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='a') ) {
				alt16=1;
			}
			else if ( (LA16_0=='p') ) {
				alt16=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:2: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' )
			int alt17=9;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='M') ) {
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA17_3 = input.LA(3);
					if ( (LA17_3=='S') ) {
						alt17=3;
					}
					else {
						alt17=1;
					}
					}
					break;
				case 'r':
					{
					int LA17_4 = input.LA(3);
					if ( (LA17_4=='s') ) {
						alt17=4;
					}
					else {
						alt17=2;
					}
					}
					break;
				case 'S':
					{
					alt17=5;
					}
					break;
				case 's':
					{
					alt17=6;
					}
					break;
				case 'I':
					{
					alt17=7;
					}
					break;
				case 'i':
					{
					alt17=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA17_0=='D') ) {
				alt17=9;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:4: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:9: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:3: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:9: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:3: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:8: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:3: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:10: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:4: 'DR'
					{
					match("DR"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt18=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt18=1;
					}
					break;
				case 'U':
					{
					alt18=2;
					}
					break;
				case 'a':
					{
					alt18=13;
					}
					break;
				case 'A':
					{
					alt18=14;
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
			case 'M':
				{
				int LA18_2 = input.LA(2);
				if ( (LA18_2=='o') ) {
					alt18=3;
				}
				else if ( (LA18_2=='O') ) {
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
			case 'T':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt18=5;
					}
					break;
				case 'U':
					{
					alt18=6;
					}
					break;
				case 'h':
					{
					alt18=9;
					}
					break;
				case 'H':
					{
					alt18=10;
					}
					break;
				default:
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
			case 'W':
				{
				int LA18_4 = input.LA(2);
				if ( (LA18_4=='e') ) {
					alt18=7;
				}
				else if ( (LA18_4=='E') ) {
					alt18=8;
				}
				else {
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
			case 'F':
				{
				int LA18_5 = input.LA(2);
				if ( (LA18_5=='r') ) {
					alt18=11;
				}
				else if ( (LA18_5=='R') ) {
					alt18=12;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:6: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:15: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:6: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:16: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:6: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:18: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:6: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:17: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:6: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:15: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:6: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:17: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:2: ( ( WORD | INT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:4: ( WORD | INT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:4: ( WORD | INT )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( ((LA19_0 >= '&' && LA19_0 <= '\'')||(LA19_0 >= ',' && LA19_0 <= '-')||(LA19_0 >= ':' && LA19_0 <= ';')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
				alt19=1;
			}
			else if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
				alt19=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:5: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:10: INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:11: ( FRAG_TITLE ' ' PROPER_NAME ( PARENTHETICAL_NAME ' ' PROPER_NAME )* ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:13: FRAG_TITLE ' ' PROPER_NAME ( PARENTHETICAL_NAME ' ' PROPER_NAME )* ( PARENTHETICAL_INT )?
			{
			mFRAG_TITLE(); 

			match(' '); 
			mPROPER_NAME(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:40: ( PARENTHETICAL_NAME ' ' PROPER_NAME )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='(') ) {
					int LA20_1 = input.LA(2);
					if ( ((LA20_1 >= 'A' && LA20_1 <= 'Z')) ) {
						alt20=1;
					}

				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:41: PARENTHETICAL_NAME ' ' PROPER_NAME
					{
					mPARENTHETICAL_NAME(); 

					match(' '); 
					mPROPER_NAME(); 

					}
					break;

				default :
					break loop20;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:78: ( PARENTHETICAL_INT )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='(') ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:78: PARENTHETICAL_INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt22=0;
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||LA22_0=='\r'||LA22_0==' ') ) {
					alt22=1;
				}

				switch (alt22) {
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
					if ( cnt22 >= 1 ) break loop22;
						EarlyExitException eee =
							new EarlyExitException(22, input);
						throw eee;
				}
				cnt22++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:13: ( 'RING' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:17: 'RING' WS INT
			{
			match("RING"); 

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
	// $ANTLR end "RING_TITLE"

	// $ANTLR start "PHONE_NUMBER"
	public final void mPHONE_NUMBER() throws RecognitionException {
		try {
			int _type = PHONE_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:2: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:4: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
			{
			match('('); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			match(')'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:37: ( WS )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= '\t' && LA23_0 <= '\n')||LA23_0=='\r'||LA23_0==' ') ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:37: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:13: INT ':' INT WS FRAG_TIME_LABEL
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:9: ( '.' ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:11: '.' ( '.' )+
			{
			match('.'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:15: ( '.' )+
			int cnt24=0;
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0=='.') ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:15: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
						EarlyExitException eee =
							new EarlyExitException(24, input);
						throw eee;
				}
				cnt24++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:6: ( '0' .. '9' )+
			int cnt25=0;
			loop25:
			do {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= '0' && LA25_0 <= '9')) ) {
					alt25=1;
				}

				switch (alt25) {
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
					if ( cnt25 >= 1 ) break loop25;
						EarlyExitException eee =
							new EarlyExitException(25, input);
						throw eee;
				}
				cnt25++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:2: ( 'LUNCH' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:4: 'LUNCH'
			{
			match("LUNCH"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:9: ( ( WORD | PARENTHETICAL | INT )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:11: ( WORD | PARENTHETICAL | INT )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:11: ( WORD | PARENTHETICAL | INT )+
			int cnt26=0;
			loop26:
			do {
				int alt26=4;
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
					{
					alt26=1;
					}
					break;
				case '(':
					{
					alt26=2;
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
					alt26=3;
					}
					break;
				}
				switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:12: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:17: PARENTHETICAL
					{
					mPARENTHETICAL(); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:31: INT
					{
					mINT(); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:18: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:18: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt27=0;
			loop27:
			do {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= '&' && LA27_0 <= '\'')||(LA27_0 >= ',' && LA27_0 <= '-')||(LA27_0 >= ':' && LA27_0 <= ';')||(LA27_0 >= 'A' && LA27_0 <= 'Z')||LA27_0=='_'||(LA27_0 >= 'a' && LA27_0 <= 'z')) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= '&' && input.LA(1) <= '\'')||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt27 >= 1 ) break loop27;
						EarlyExitException eee =
							new EarlyExitException(27, input);
						throw eee;
				}
				cnt27++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:28: ( '(' PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:30: '(' PROPER_NAME ')'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:2: ( FRAG_PAREN_LEFT ( ( WORD | INT ) ( WS )? )+ FRAG_PAREN_RIGHT ( FRAG_SPEC_CHAR )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:4: FRAG_PAREN_LEFT ( ( WORD | INT ) ( WS )? )+ FRAG_PAREN_RIGHT ( FRAG_SPEC_CHAR )?
			{
			mFRAG_PAREN_LEFT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:20: ( ( WORD | INT ) ( WS )? )+
			int cnt30=0;
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= '&' && LA30_0 <= '\'')||(LA30_0 >= ',' && LA30_0 <= '-')||(LA30_0 >= '0' && LA30_0 <= ';')||(LA30_0 >= 'A' && LA30_0 <= 'Z')||LA30_0=='_'||(LA30_0 >= 'a' && LA30_0 <= 'z')) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:21: ( WORD | INT ) ( WS )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:21: ( WORD | INT )
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( ((LA28_0 >= '&' && LA28_0 <= '\'')||(LA28_0 >= ',' && LA28_0 <= '-')||(LA28_0 >= ':' && LA28_0 <= ';')||(LA28_0 >= 'A' && LA28_0 <= 'Z')||LA28_0=='_'||(LA28_0 >= 'a' && LA28_0 <= 'z')) ) {
						alt28=1;
					}
					else if ( ((LA28_0 >= '0' && LA28_0 <= '9')) ) {
						alt28=2;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:22: WORD
							{
							mWORD(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:27: INT
							{
							mINT(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:32: ( WS )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( ((LA29_0 >= '\t' && LA29_0 <= '\n')||LA29_0=='\r'||LA29_0==' ') ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:32: WS
							{
							mWS(); 

							}
							break;

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

			mFRAG_PAREN_RIGHT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:55: ( FRAG_SPEC_CHAR )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='\''||(LA31_0 >= ',' && LA31_0 <= '-')||(LA31_0 >= ':' && LA31_0 <= ';')||LA31_0=='_') ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( input.LA(1)=='\''||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='_' ) {
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:38: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( ((LA32_0 >= 'A' && LA32_0 <= 'Z')||(LA32_0 >= 'a' && LA32_0 <= 'z')) ) {
					alt32=1;
				}

				switch (alt32) {
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
					break loop32;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:21: ( FRAG_PROPER_NAME ( ' ' )? ( FRAG_PROPER_NAME ( ' ' )? )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:23: FRAG_PROPER_NAME ( ' ' )? ( FRAG_PROPER_NAME ( ' ' )? )*
			{
			mFRAG_PROPER_NAME(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:40: ( ' ' )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==' ') ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:40: ' '
					{
					match(' '); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:45: ( FRAG_PROPER_NAME ( ' ' )? )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( ((LA35_0 >= 'A' && LA35_0 <= 'Z')) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:46: FRAG_PROPER_NAME ( ' ' )?
					{
					mFRAG_PROPER_NAME(); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:63: ( ' ' )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==' ') ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:63: ' '
							{
							match(' '); 
							}
							break;

					}

					}
					break;

				default :
					break loop35;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:2: ( '(' ( WS )? ( '0' .. '9' )+ ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:4: '(' ( WS )? ( '0' .. '9' )+ ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:8: ( WS )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( ((LA36_0 >= '\t' && LA36_0 <= '\n')||LA36_0=='\r'||LA36_0==' ') ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:8: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:12: ( '0' .. '9' )+
			int cnt37=0;
			loop37:
			do {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( ((LA37_0 >= '0' && LA37_0 <= '9')) ) {
					alt37=1;
				}

				switch (alt37) {
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
					if ( cnt37 >= 1 ) break loop37;
						EarlyExitException eee =
							new EarlyExitException(37, input);
						throw eee;
				}
				cnt37++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:22: ( WS )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= '\t' && LA38_0 <= '\n')||LA38_0=='\r'||LA38_0==' ') ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:22: WS
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | STANDALONE_COMMENT | COMMENT | PARENTHETICAL_INT )
		int alt39=16;
		alt39 = dfa39.predict(input);
		switch (alt39) {
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:67: BREED_COUNT
				{
				mBREED_COUNT(); 

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:79: JUDGE_NAME
				{
				mJUDGE_NAME(); 

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:90: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:93: RING_TITLE
				{
				mRING_TITLE(); 

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:104: PHONE_NUMBER
				{
				mPHONE_NUMBER(); 

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:117: TIME
				{
				mTIME(); 

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:122: DATE
				{
				mDATE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:127: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:136: INT
				{
				mINT(); 

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:140: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); 

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:159: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:167: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA39 dfa39 = new DFA39(this);
	static final String DFA13_eotS =
		"\u00e3\uffff\1\u0103\146\uffff\1\u0160\102\uffff";
	static final String DFA13_eofS =
		"\u018d\uffff";
	static final String DFA13_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\1\141\1\145\1\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff"+
		"\1\145\1\uffff\2\163\1\141\1\143\1\141\1\162\1\141\1\154\1\151\1\uffff"+
		"\1\145\1\uffff\1\143\1\uffff\1\143\1\142\1\147\1\145\3\uffff\1\162\2\uffff"+
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
	static final String DFA13_maxS =
		"\1\131\3\165\1\157\1\156\2\162\1\141\1\164\1\uffff\1\165\1\u00f6\1\151"+
		"\1\157\1\164\1\171\1\165\1\167\1\162\1\uffff\1\151\2\uffff\1\147\3\uffff"+
		"\1\145\1\uffff\2\163\1\162\1\143\1\165\1\171\1\165\1\154\1\166\1\uffff"+
		"\1\157\1\uffff\1\154\1\uffff\1\156\1\147\1\164\1\156\3\uffff\1\162\2\uffff"+
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
	static final String DFA13_acceptS =
		"\12\uffff\1\145\11\uffff\1\u00b4\1\uffff\1\u00bc\1\u00bd\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\13\11\uffff\1\63\1\uffff\1\71\1\uffff\1\74\4\uffff\1"+
		"\114\1\115\1\116\1\uffff\1\123\1\124\3\uffff\1\135\1\136\1\uffff\1\144"+
		"\1\uffff\1\151\1\152\1\uffff\1\156\1\157\1\160\1\161\4\uffff\1\u0081\1"+
		"\u0082\2\uffff\1\u0088\1\u0089\2\uffff\1\u0093\1\uffff\1\u0096\1\u0097"+
		"\1\u0098\5\uffff\1\u00a7\1\u00a8\2\uffff\1\u00ad\1\u00ae\1\uffff\1\u00b2"+
		"\1\u00b3\1\uffff\1\u00b9\1\uffff\1\1\1\2\4\uffff\1\24\1\uffff\1\30\2\uffff"+
		"\1\36\1\37\1\uffff\1\43\1\44\1\45\1\46\1\47\1\uffff\1\52\1\uffff\1\56"+
		"\1\uffff\1\61\1\62\1\64\1\uffff\1\70\1\72\1\73\1\75\1\76\1\77\1\100\2"+
		"\uffff\1\110\1\111\2\uffff\1\125\1\126\1\uffff\1\133\1\134\2\uffff\1\150"+
		"\1\153\1\154\1\155\1\162\1\163\1\164\1\uffff\1\171\1\172\1\uffff\1\u0080"+
		"\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u008a\1\u008b\1\u008c\1\u008d"+
		"\1\uffff\1\u0090\1\uffff\1\u0094\1\u0095\1\u0099\1\u009a\1\u009b\1\u009c"+
		"\1\uffff\1\u009f\1\u00a0\1\u00a1\2\uffff\1\u00a6\1\u00a9\1\u00aa\2\uffff"+
		"\1\u00b5\1\uffff\1\u00b8\3\uffff\1\17\1\20\1\21\1\22\1\23\4\uffff\1\42"+
		"\1\50\1\51\1\uffff\1\57\1\60\1\65\6\uffff\1\132\3\uffff\1\173\4\uffff"+
		"\1\u00a2\1\u00a3\1\uffff\1\u00ab\1\u00ac\11\uffff\1\53\1\54\1\55\12\uffff"+
		"\1\177\1\uffff\1\u0092\1\u0091\4\uffff\1\u00ba\1\u00bb\7\uffff\1\101\1"+
		"\102\4\uffff\1\131\14\uffff\1\31\1\32\1\33\1\34\1\35\5\uffff\1\127\1\130"+
		"\1\137\1\140\1\141\10\uffff\1\u00b6\1\u00b7\3\uffff\1\40\1\41\3\uffff"+
		"\1\117\1\uffff\1\122\1\142\1\143\11\uffff\1\25\1\26\1\27\1\66\1\67\1\103"+
		"\1\104\1\uffff\1\107\1\112\1\113\1\uffff\1\147\1\146\5\uffff\1\u00af\1"+
		"\u00b0\1\u00b1\1\uffff\1\10\1\11\1\12\1\uffff\1\105\1\106\1\120\1\121"+
		"\3\uffff\1\u009d\1\u009e\1\uffff\1\6\1\7\1\uffff\1\165\1\166\1\167\1\170"+
		"\1\174\1\175\1\176\2\uffff\1\14\1\15\1\16\1\u008e\1\u008f\2\uffff\1\u00a4"+
		"\1\u00a5";
	static final String DFA13_specialS =
		"\u018d\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\20\1\uffff\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26\1\27",
			"\1\30\2\uffff\1\31\1\uffff\1\32\1\33\1\34\1\35\6\uffff\1\36",
			"\1\37\3\uffff\1\40\3\uffff\1\41\2\uffff\1\42\2\uffff\1\43\2\uffff\1"+
			"\44\2\uffff\1\45",
			"\1\46\3\uffff\1\47\2\uffff\1\50\3\uffff\1\51\2\uffff\1\52\5\uffff\1"+
			"\53",
			"\1\54\15\uffff\1\55",
			"\1\56",
			"\1\57\2\uffff\1\60\2\uffff\1\61\2\uffff\1\62",
			"\1\63\3\uffff\1\64\2\uffff\1\65\2\uffff\1\66\2\uffff\1\67",
			"\1\70",
			"\1\71\1\72\16\uffff\1\73\1\uffff\1\74",
			"",
			"\1\75\11\uffff\1\76\5\uffff\1\77",
			"\1\100\3\uffff\1\101\2\uffff\1\102\6\uffff\1\104\u0086\uffff\1\103",
			"\1\105\7\uffff\1\106",
			"\1\107\11\uffff\1\110",
			"\1\111\7\uffff\1\112",
			"\1\113\3\uffff\1\114\2\uffff\1\115\3\uffff\1\116\2\uffff\1\117\5\uffff"+
			"\1\120\3\uffff\1\121",
			"\1\122\2\uffff\1\123\6\uffff\1\124\5\uffff\1\125",
			"\1\126\1\uffff\1\127\1\uffff\1\130\2\uffff\1\131\1\132\1\uffff\1\133"+
			"\3\uffff\1\134\1\135\3\uffff\1\136\1\137\1\uffff\1\140",
			"\1\141\5\uffff\1\142\2\uffff\1\143",
			"",
			"\1\144\2\uffff\1\145\1\146",
			"",
			"",
			"\1\147\1\150",
			"",
			"",
			"",
			"\1\151",
			"",
			"\1\152",
			"\1\153",
			"\1\154\2\uffff\1\155\7\uffff\1\156\5\uffff\1\157",
			"\1\160",
			"\1\161\15\uffff\1\162\5\uffff\1\163",
			"\1\164\1\165\1\uffff\1\166\2\uffff\1\167\1\170",
			"\1\171\7\uffff\1\172\13\uffff\1\173",
			"\1\174",
			"\1\175\4\uffff\1\176\3\uffff\1\177\3\uffff\1\u0080",
			"",
			"\1\u0081\3\uffff\1\u0082\5\uffff\1\u0083",
			"",
			"\1\u0084\10\uffff\1\u0085",
			"",
			"\1\u0086\10\uffff\1\u0087\1\uffff\1\u0088",
			"\1\u0089\4\uffff\1\u008a",
			"\1\u008b\14\uffff\1\u008c",
			"\1\u008d\10\uffff\1\u008e",
			"",
			"",
			"",
			"\1\u008f",
			"",
			"",
			"\1\u0090\5\uffff\1\u0091",
			"\1\u0092",
			"\1\u0093\3\uffff\1\u0094",
			"",
			"",
			"\1\u0095",
			"",
			"\1\u0096\14\uffff\1\u0097",
			"",
			"",
			"\1\u0098\4\uffff\1\u0099\3\uffff\1\u009a",
			"",
			"",
			"",
			"",
			"\1\u009b\1\uffff\1\u009c\4\uffff\1\u009d",
			"\1\u009e",
			"\1\u009f\25\uffff\1\u00a0",
			"\1\u00a1\3\uffff\1\u00a2",
			"",
			"",
			"\1\u00a3\1\uffff\1\u00a4",
			"\1\u00a5\1\uffff\1\u00a6\6\uffff\1\u00a7",
			"",
			"",
			"\1\u00a8\2\uffff\1\u00a9\1\u00aa\1\uffff\1\u00ab\2\uffff\1\u00ac",
			"\1\u00ad\4\uffff\1\u00ae",
			"",
			"\1\u00af\17\uffff\1\u00b0",
			"",
			"",
			"",
			"\1\u00b1\2\uffff\1\u00b2\1\u00b3",
			"\1\u00b4\6\uffff\1\u00b5",
			"\1\u00b6\22\uffff\1\u00b7",
			"\1\u00b8\3\uffff\1\u00b9",
			"\1\u00ba\11\uffff\1\u00bb",
			"",
			"",
			"\1\u00bc\7\uffff\1\u00bd",
			"\1\u00be",
			"",
			"",
			"\1\u00bf",
			"",
			"",
			"\1\u00c0\2\uffff\1\u00c1\6\uffff\1\u00c2",
			"",
			"\1\u00c3",
			"",
			"",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6\15\uffff\1\u00c7",
			"\1\u00c8\12\uffff\1\u00c9\2\uffff\1\u00ca",
			"",
			"\1\u00cb",
			"",
			"\1\u00cc",
			"\1\u00cd",
			"",
			"",
			"\1\u00ce\25\uffff\1\u00cf",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d0\22\uffff\1\u00d1",
			"",
			"\1\u00d2",
			"",
			"\1\u00d3\3\uffff\1\u00d4",
			"",
			"",
			"",
			"\1\u00d5\5\uffff\1\u00d6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d7",
			"\1\u00d8",
			"",
			"",
			"\1\u00d9",
			"\1\u00da",
			"",
			"",
			"\1\u00db\27\uffff\1\u00dc",
			"",
			"",
			"\1\u00dd",
			"\1\u00de",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00df",
			"",
			"",
			"\1\u00e0\20\uffff\1\u00e1",
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
			"\1\u00e2",
			"",
			"\1\u00e3",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e4",
			"",
			"",
			"",
			"\1\u00e5\5\uffff\1\u00e6",
			"\1\u00e7",
			"",
			"",
			"",
			"\1\u00e8\7\uffff\1\u00e9",
			"\1\u00ea",
			"",
			"\1\u00eb",
			"",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"",
			"",
			"",
			"\1\u00f3\103\uffff\1\u00f4\10\uffff\1\u00f5",
			"",
			"",
			"",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"",
			"\1\u00ff\3\uffff\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0104",
			"",
			"",
			"\1\u0105",
			"",
			"",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108\107\uffff\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"",
			"",
			"",
			"\1\u0110",
			"\1\u0111\122\uffff\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116\104\uffff\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"",
			"\1\u011c",
			"",
			"",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"",
			"",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124\122\uffff\1\u0125",
			"\1\u0127\53\uffff\1\u0128\16\uffff\1\u0126",
			"\1\u0129",
			"\1\u012a",
			"",
			"",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e\13\uffff\1\u012f",
			"",
			"\1\u0130\1\u0131\1\u0132\2\uffff\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"",
			"",
			"",
			"",
			"",
			"\1\u0140\20\uffff\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145\2\uffff\1\u0146\3\uffff\1\u0147",
			"",
			"",
			"",
			"",
			"",
			"\1\u0148\15\uffff\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"",
			"",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153\5\uffff\1\u0154\1\u0155",
			"",
			"",
			"\1\u0156\17\uffff\1\u0157",
			"\1\u0158\2\uffff\1\u0159\14\uffff\1\u015a\1\u015b",
			"\1\u015c\6\uffff\1\u015d",
			"",
			"\1\u015e",
			"",
			"",
			"",
			"\1\u015f",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166\5\uffff\1\u0167\1\u0168",
			"\1\u0169\1\u016a\14\uffff\1\u016b\3\uffff\1\u016c",
			"\1\u016d",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u016e\12\uffff\1\u016f",
			"",
			"",
			"",
			"\1\u0170\11\uffff\1\u0171",
			"",
			"",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175\17\uffff\1\u0176",
			"\1\u0177",
			"",
			"",
			"",
			"\1\u0178\4\uffff\1\u0179",
			"",
			"",
			"",
			"\1\u017a",
			"",
			"",
			"",
			"",
			"\1\u017b\1\u017c\15\uffff\1\u017d\2\uffff\1\u017e",
			"\1\u017f\2\uffff\1\u0180\6\uffff\1\u0181",
			"\1\u0182",
			"",
			"",
			"\1\u0183",
			"",
			"",
			"\1\u0184\17\uffff\1\u0185\1\u0186",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0187\6\uffff\1\u0188",
			"\1\u0189",
			"",
			"",
			"",
			"",
			"",
			"\1\u018a",
			"\1\u018c\17\uffff\1\u018b",
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
			return "111:3: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
		}
	}

	static final String DFA39_eotS =
		"\1\uffff\27\34\1\uffff\1\u0087\3\uffff\74\34\1\uffff\52\34\4\uffff\10"+
		"\34\1\uffff\143\34\1\131\60\34\4\uffff\162\34\1\131\1\uffff\1\131\61\34"+
		"\4\uffff\1\34\1\uffff\7\34\1\uffff\12\34\1\131\24\34\1\131\1\34\1\131"+
		"\30\34\1\u02bc\36\34\1\u02d6\6\34\1\131\5\34\15\uffff\1\131\6\34\1\uffff"+
		"\46\34\1\uffff\31\34\1\131\11\34\1\131\3\34\1\131\14\34\1\131\10\34\1"+
		"\uffff\23\34\1\131\5\34\1\uffff\10\34\1\131\1\34\22\uffff\6\34\1\131\30"+
		"\34\1\131\10\34\2\uffff\2\34\2\131\17\34\1\131\13\34\1\131\15\34\1\u02bc"+
		"\4\34\1\131\12\34\1\131\4\34\1\131\2\34\24\uffff\6\34\1\131\4\34\1\131"+
		"\22\34\1\131\5\34\1\u03f3\2\34\1\uffff\15\34\1\131\15\34\1\131\2\34\2"+
		"\131\3\34\1\131\4\34\21\uffff\1\131\2\uffff\12\34\1\131\6\34\1\u02bc\7"+
		"\34\1\uffff\11\34\1\131\4\34\1\131\1\34\2\131\2\34\1\131\3\34\1\131\2"+
		"\34\21\uffff\2\34\3\uffff\16\34\1\131\5\34\1\131\5\34\3\131\1\34\16\uffff"+
		"\2\34\2\uffff\3\131\2\34\1\131\5\34\1\131\3\34\12\uffff\2\34\2\uffff\1"+
		"\34\1\u02bc\2\34\1\131\2\34\10\uffff\2\34\1\uffff\3\34\1\131\7\uffff\1"+
		"\131\1\34\1\uffff\2\34\1\u031c\5\uffff\1\34\1\uffff\1\131\4\uffff\1\34"+
		"\3\uffff\1\34\3\uffff\1\34\3\uffff\1\34\2\uffff\1\131\4\uffff";
	static final String DFA39_eofS =
		"\u04b5\uffff";
	static final String DFA39_minS =
		"\1\11\1\111\1\154\1\145\1\146\2\141\1\122\1\156\1\122\1\145\1\141\1\142"+
		"\1\141\1\145\1\125\1\141\1\111\1\101\1\110\1\145\1\105\2\157\1\0\1\46"+
		"\3\uffff\1\154\1\156\4\40\1\123\1\156\1\116\1\145\1\144\1\164\1\162\1"+
		"\141\1\146\1\162\1\151\1\141\1\145\1\141\2\163\1\141\1\143\1\141\1\162"+
		"\1\141\1\154\1\151\1\163\1\145\1\165\1\143\1\162\1\143\1\142\1\40\1\147"+
		"\1\145\1\141\1\170\1\145\1\111\1\162\1\141\1\145\1\154\1\145\1\162\1\151"+
		"\1\145\1\151\1\141\1\160\1\145\1\155\1\166\1\142\1\157\1\141\1\uffff\1"+
		"\167\1\116\1\160\1\153\1\141\1\157\1\151\1\147\1\162\1\144\1\157\1\164"+
		"\1\163\1\116\1\151\1\150\1\141\1\145\1\142\1\171\1\146\2\141\1\156\1\145"+
		"\1\116\1\124\1\142\1\171\2\145\1\105\1\165\1\125\1\172\1\164\1\144\1\151"+
		"\1\162\1\104\1\154\1\162\1\46\2\11\1\uffff\2\60\2\164\1\143\1\151\1\163"+
		"\1\40\1\uffff\1\40\1\123\1\144\1\104\1\156\1\40\1\145\1\141\1\146\1\160"+
		"\1\146\1\145\1\150\1\145\1\164\1\163\1\162\2\164\1\145\1\147\1\154\1\147"+
		"\1\156\1\150\1\143\1\157\1\145\1\144\1\164\1\166\1\145\1\153\1\143\1\141"+
		"\1\163\1\154\1\162\1\141\1\144\1\141\1\153\1\163\1\150\1\167\1\155\1\153"+
		"\2\154\1\150\1\155\1\144\1\145\1\165\3\154\1\156\1\164\1\40\1\156\1\144"+
		"\1\104\1\155\2\156\2\144\1\141\1\162\1\141\1\172\1\154\1\163\1\154\1\141"+
		"\1\163\1\162\1\157\1\141\1\162\1\157\1\145\1\156\1\163\1\143\1\103\1\151"+
		"\1\163\1\151\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\46"+
		"\1\151\1\145\1\142\1\162\1\144\1\164\1\163\1\107\1\156\1\165\1\157\1\165"+
		"\1\151\1\164\1\154\2\164\1\142\1\145\1\153\1\145\1\164\2\156\1\146\1\163"+
		"\2\144\1\104\1\125\1\145\1\40\1\145\1\163\1\123\1\162\1\122\1\163\1\145"+
		"\1\155\1\163\1\164\1\156\1\160\1\145\1\116\1\157\1\153\2\11\1\uffff\1"+
		"\11\1\55\1\11\2\145\1\150\1\141\2\40\1\141\1\101\1\40\1\162\1\143\1\40"+
		"\1\157\1\145\2\157\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\162\1\156"+
		"\1\145\1\154\1\144\1\143\2\151\1\145\1\157\1\153\1\144\1\164\1\145\2\157"+
		"\1\151\1\162\1\151\1\145\1\162\1\164\1\163\1\40\1\156\1\141\1\40\1\151"+
		"\1\154\1\171\1\141\1\165\1\145\1\40\1\142\1\145\1\151\1\171\1\163\1\141"+
		"\1\151\1\162\1\145\1\151\1\145\1\151\1\144\1\151\1\55\1\143\1\141\1\101"+
		"\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\151\1\156\2\141\1\150\1\151"+
		"\1\156\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110"+
		"\1\154\1\157\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\46"+
		"\1\0\1\46\1\156\1\157\1\151\1\145\1\167\1\145\1\11\1\164\1\153\1\171\1"+
		"\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1"+
		"\157\1\146\1\144\1\145\1\141\1\151\1\160\1\101\1\122\1\164\1\151\1\144"+
		"\1\104\1\163\1\123\1\154\1\162\1\141\1\150\1\40\1\145\1\160\1\40\1\105"+
		"\1\151\1\163\3\11\1\uffff\1\60\1\uffff\1\162\1\146\1\163\1\145\1\164\1"+
		"\171\1\131\1\uffff\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\160\1\156"+
		"\1\141\1\46\1\141\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163"+
		"\1\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\46\1\156\1\46\1\144"+
		"\1\141\1\145\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163"+
		"\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\1\40\1\163\1\142\1\46"+
		"\1\145\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\40\1\157"+
		"\2\145\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141"+
		"\1\145\1\40\1\145\1\46\1\154\1\156\1\147\1\157\1\40\1\157\1\46\1\145\1"+
		"\150\1\141\1\145\1\147\16\46\1\145\1\156\1\145\1\163\1\145\1\154\1\uffff"+
		"\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40"+
		"\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\131\1\104\1\141\1\156\1\141"+
		"\1\101\1\144\1\104\2\141\1\162\1\40\1\163\1\145\1\141\1\123\1\164\1\150"+
		"\2\11\1\55\1\40\1\146\1\145\1\163\1\165\2\54\1\157\1\40\1\153\1\151\1"+
		"\150\1\151\1\156\1\151\1\40\1\154\1\156\1\141\1\151\1\154\1\151\1\40\1"+
		"\46\1\144\1\162\1\147\1\156\1\145\1\40\1\157\1\143\1\40\1\46\1\40\1\162"+
		"\1\40\1\46\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\162"+
		"\1\40\1\46\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163"+
		"\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162\1\163\1\40\1\144\1\156\1"+
		"\163\1\156\1\157\1\46\2\157\1\156\1\162\1\156\1\uffff\1\157\1\40\1\145"+
		"\1\153\1\150\1\162\1\40\1\156\1\46\1\165\22\11\1\141\1\145\1\166\2\151"+
		"\1\154\1\46\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145"+
		"\2\162\1\40\1\54\1\150\1\164\1\54\1\101\1\156\1\147\1\171\1\131\1\141"+
		"\1\101\1\46\1\156\1\141\1\144\1\164\1\151\1\104\1\172\1\151\2\uffff\2"+
		"\60\2\46\1\164\1\162\1\11\1\165\1\40\1\141\1\40\1\164\1\144\1\156\1\145"+
		"\1\40\1\156\1\141\1\151\1\46\1\40\1\157\1\164\3\40\1\165\1\153\1\40\1"+
		"\171\1\163\1\46\1\164\1\156\1\162\1\141\1\165\2\40\1\157\1\156\1\141\1"+
		"\156\1\40\1\143\1\46\1\40\1\141\1\40\1\156\1\46\1\145\1\151\1\40\1\145"+
		"\1\144\2\162\1\40\1\144\1\147\1\46\1\156\1\163\1\145\1\40\1\46\1\151\1"+
		"\145\24\11\1\156\1\40\1\145\1\141\1\154\1\40\1\46\1\171\1\162\1\150\1"+
		"\155\1\46\1\144\1\156\1\163\1\40\2\144\1\40\1\141\1\131\2\40\2\54\1\171"+
		"\1\131\1\40\1\156\1\141\1\46\1\162\1\101\1\143\1\162\1\60\1\46\2\145\1"+
		"\uffff\2\156\1\141\1\154\1\163\2\40\1\156\1\141\1\156\1\157\1\156\1\40"+
		"\1\46\1\40\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1\150\1\164\1\144\1"+
		"\46\1\143\1\40\2\46\2\40\1\145\1\46\1\145\1\40\1\141\1\163\21\11\1\46"+
		"\2\11\1\40\1\162\1\156\1\145\1\54\1\153\4\40\1\46\1\163\1\40\1\153\3\54"+
		"\1\46\1\145\1\171\1\145\1\131\1\165\1\145\1\55\1\uffff\1\162\1\40\1\144"+
		"\1\40\1\156\1\141\1\143\1\40\1\156\1\46\1\156\1\144\1\146\1\145\1\46\1"+
		"\164\2\46\2\145\1\46\1\40\1\156\1\162\1\46\1\156\1\145\21\11\1\163\1\141"+
		"\1\0\2\11\1\163\1\40\1\162\1\145\1\150\1\145\1\162\1\54\1\144\1\54\1\151"+
		"\1\40\1\60\1\40\1\46\1\40\1\156\1\150\2\40\1\46\1\146\1\40\1\145\1\162"+
		"\1\144\3\46\1\40\16\11\1\143\1\162\1\46\1\11\3\46\1\151\1\163\1\46\1\40"+
		"\1\156\1\60\1\144\1\145\1\46\1\144\2\40\12\11\1\157\1\164\2\11\1\162\1"+
		"\46\1\164\1\60\1\46\1\162\1\40\10\11\1\142\1\151\1\11\1\145\1\154\1\60"+
		"\1\46\7\11\1\46\1\55\1\11\1\40\1\151\1\46\5\11\1\103\1\11\1\46\4\11\1"+
		"\157\3\11\1\154\3\11\1\157\3\11\1\162\2\11\1\46\4\11";
	static final String DFA39_maxS =
		"\1\172\1\163\1\164\1\157\3\165\1\157\1\156\2\162\1\141\1\164\1\141\1\165"+
		"\1\u00f6\1\171\1\165\1\167\1\165\2\151\2\157\1\uffff\1\172\3\uffff\2\163"+
		"\1\123\1\163\2\40\1\123\1\156\1\116\1\145\1\144\1\164\1\166\1\167\1\147"+
		"\1\162\1\151\1\141\1\145\1\141\2\163\1\162\1\143\1\165\1\171\1\165\1\154"+
		"\1\166\1\163\1\157\1\165\1\154\1\162\1\156\1\147\1\40\1\164\1\156\1\141"+
		"\1\170\1\151\1\111\1\162\1\141\1\145\1\162\1\145\1\166\1\151\1\145\1\151"+
		"\1\141\1\160\1\162\1\155\1\166\1\153\1\157\1\141\1\uffff\1\167\1\116\1"+
		"\162\1\164\1\141\1\157\1\162\1\154\1\162\1\164\1\157\1\164\1\163\1\116"+
		"\1\164\1\157\1\164\1\151\1\154\1\171\1\146\1\151\1\141\1\163\1\145\1\116"+
		"\1\124\1\142\1\171\2\145\1\105\1\165\1\125\1\172\1\164\1\163\1\151\1\162"+
		"\1\104\1\154\1\162\3\172\1\uffff\2\71\2\164\1\143\1\151\1\163\1\40\1\uffff"+
		"\1\40\1\123\1\144\1\104\1\156\1\40\1\145\1\151\1\167\1\160\1\146\1\145"+
		"\1\150\1\145\1\164\1\163\1\162\2\164\1\163\1\165\1\154\1\147\1\156\1\150"+
		"\1\143\1\157\1\145\1\172\1\164\1\166\1\145\1\153\1\143\1\164\1\163\1\154"+
		"\1\162\1\145\1\144\1\141\1\153\1\163\1\156\1\167\1\155\1\153\2\154\1\150"+
		"\1\155\1\144\1\145\1\165\1\154\1\162\1\154\1\156\1\164\1\40\1\156\1\144"+
		"\1\104\1\155\2\156\2\144\1\171\1\162\1\141\1\172\1\154\1\163\1\154\1\141"+
		"\1\163\1\162\1\157\1\141\1\162\1\157\1\145\1\156\1\163\1\143\1\103\1\151"+
		"\1\163\1\151\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\172"+
		"\1\151\1\145\1\142\1\162\1\144\1\164\1\163\1\107\1\156\1\165\1\157\1\165"+
		"\1\151\1\164\1\154\2\164\1\150\1\145\1\153\1\145\1\164\3\156\1\163\1\144"+
		"\1\145\1\104\1\125\1\145\1\40\1\145\1\163\1\123\1\162\1\122\1\163\1\145"+
		"\1\155\1\163\1\164\1\156\1\160\1\145\1\116\1\157\1\153\2\172\1\uffff\1"+
		"\172\2\71\1\151\1\145\1\150\1\141\2\40\1\141\1\101\1\40\1\162\1\143\1"+
		"\40\1\157\1\151\2\157\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\162"+
		"\1\156\1\145\1\154\1\144\1\143\2\151\1\145\1\157\1\153\1\144\1\164\1\145"+
		"\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163\1\155\1\156\1\141\1\40"+
		"\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\142\1\145\1\151\1\171\1\163"+
		"\1\141\1\151\1\162\1\145\1\151\1\145\1\171\1\144\1\151\1\55\1\143\1\141"+
		"\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\151\1\156\2\141\1\150"+
		"\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150"+
		"\1\110\1\154\1\157\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165"+
		"\1\172\1\uffff\1\172\1\156\1\157\1\151\1\145\1\167\1\145\1\40\1\164\1"+
		"\153\1\171\1\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171"+
		"\2\40\1\151\1\157\1\146\1\144\1\145\1\141\1\151\1\160\1\101\1\122\1\164"+
		"\1\151\1\144\1\104\1\163\1\123\1\154\1\162\1\141\1\150\1\40\1\145\1\160"+
		"\1\150\1\105\1\151\1\163\3\172\1\uffff\1\71\1\uffff\1\162\1\146\1\163"+
		"\1\145\1\164\1\171\1\131\1\uffff\1\150\1\145\1\154\1\147\1\143\1\154\1"+
		"\165\1\160\1\156\1\141\1\172\1\141\1\143\1\154\1\141\1\152\1\164\3\145"+
		"\1\156\1\141\1\163\1\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\172"+
		"\1\156\1\172\1\144\1\141\1\145\1\157\1\141\1\40\1\156\1\147\1\151\1\40"+
		"\1\160\1\141\1\163\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\2\163"+
		"\1\142\1\172\1\145\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156"+
		"\1\145\1\157\2\145\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144"+
		"\1\164\1\141\1\145\1\40\1\145\1\172\1\154\1\156\1\147\1\157\1\40\1\157"+
		"\1\172\1\145\1\150\1\141\1\145\1\147\16\172\1\145\1\156\1\145\1\163\1"+
		"\145\1\154\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141"+
		"\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\131\1\104"+
		"\1\141\1\156\1\141\1\101\1\144\1\104\2\141\1\162\1\40\1\163\1\145\1\141"+
		"\1\123\1\164\1\150\1\172\2\71\1\40\1\146\1\145\1\163\1\165\2\54\1\157"+
		"\1\40\1\153\1\151\1\150\1\151\1\156\1\151\1\40\1\154\1\156\1\141\1\151"+
		"\1\154\1\151\1\40\1\172\1\144\1\162\1\147\1\156\1\145\1\163\1\157\1\143"+
		"\1\40\1\172\1\40\1\162\1\40\1\172\1\156\1\154\1\147\1\163\1\40\1\141\2"+
		"\145\1\150\1\145\1\162\1\40\1\172\1\103\1\165\1\151\1\40\1\141\1\40\1"+
		"\150\1\165\1\uffff\1\163\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162"+
		"\1\163\1\40\1\144\1\156\1\163\1\156\1\157\1\172\2\157\1\156\1\162\1\156"+
		"\1\uffff\1\157\1\40\1\145\1\153\1\150\1\162\1\40\1\156\1\172\1\165\22"+
		"\172\1\141\1\145\1\166\2\151\1\154\1\172\1\144\1\141\1\145\1\163\1\141"+
		"\1\163\1\156\1\141\1\154\1\145\2\162\1\40\1\54\1\150\1\164\1\54\1\101"+
		"\1\156\1\147\1\171\1\131\1\141\1\101\1\172\1\156\1\141\1\144\1\164\1\151"+
		"\1\104\1\172\1\151\2\uffff\2\71\2\172\1\164\1\162\1\40\1\165\1\40\1\141"+
		"\1\40\1\164\1\144\1\156\1\145\1\40\1\156\1\141\1\151\1\172\1\40\1\157"+
		"\1\164\3\40\1\165\1\153\1\40\1\171\1\163\1\172\1\164\1\156\1\162\1\141"+
		"\1\165\2\40\1\157\1\156\1\141\1\156\1\40\1\143\1\172\1\40\1\141\1\40\1"+
		"\156\1\172\1\145\1\151\1\40\1\145\1\144\2\162\1\40\1\144\1\147\1\172\1"+
		"\156\1\163\1\145\1\40\1\172\1\151\1\145\24\172\1\156\1\40\1\145\1\141"+
		"\1\154\1\40\1\172\1\171\1\162\1\150\1\155\1\172\1\144\1\156\1\163\1\40"+
		"\2\144\1\40\1\141\1\131\2\40\2\54\1\171\1\131\1\163\1\156\1\141\1\172"+
		"\1\162\1\101\1\143\1\162\1\71\1\172\2\145\1\uffff\2\156\1\141\1\154\1"+
		"\163\2\40\1\156\1\141\1\156\1\157\1\156\1\40\1\172\1\40\1\151\2\40\1\153"+
		"\2\141\1\144\1\156\1\40\1\150\1\164\1\144\1\172\1\143\1\40\2\172\2\40"+
		"\1\145\1\172\1\145\1\40\1\141\1\163\24\172\1\40\1\162\1\156\1\145\1\54"+
		"\1\153\4\40\1\172\1\163\1\40\1\153\3\54\1\172\1\145\1\171\1\145\1\131"+
		"\1\165\1\145\1\55\1\uffff\1\162\1\40\1\144\1\40\1\156\1\141\1\143\1\40"+
		"\1\156\1\172\1\156\1\144\1\146\1\145\1\172\1\164\2\172\2\145\1\172\1\40"+
		"\1\156\1\162\1\172\1\156\1\145\21\172\1\163\1\141\1\uffff\2\172\1\163"+
		"\1\40\1\162\1\145\1\150\1\145\1\162\1\54\1\144\1\54\1\151\1\40\1\71\1"+
		"\40\1\172\1\40\1\156\1\150\2\40\1\172\1\146\1\40\1\145\1\162\1\144\3\172"+
		"\1\40\16\172\1\143\1\162\5\172\1\151\1\163\1\172\1\40\1\156\1\71\1\144"+
		"\1\145\1\172\1\144\2\40\12\172\1\157\1\164\2\172\1\162\1\172\1\164\1\71"+
		"\1\172\1\162\1\40\10\172\1\142\1\151\1\172\1\145\1\154\1\71\11\172\1\55"+
		"\1\172\1\40\1\151\6\172\1\103\6\172\1\157\3\172\1\154\3\172\1\157\3\172"+
		"\1\162\7\172";
	static final String DFA39_acceptS =
		"\32\uffff\1\7\1\14\1\17\74\uffff\1\2\55\uffff\1\15\10\uffff\1\6\u0096"+
		"\uffff\1\20\u00aa\uffff\1\17\1\uffff\1\12\7\uffff\1\1\172\uffff\1\10\144"+
		"\uffff\1\3\31\uffff\1\16\104\uffff\1\4\1\11\u0080\uffff\1\13\125\uffff"+
		"\1\5\u00c1\uffff";
	static final String DFA39_specialS =
		"\30\uffff\1\2\u0183\uffff\1\1\u0285\uffff\1\0\u0092\uffff}>";
	static final String[] DFA39_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\5\uffff\2\34\1\30\3\uffff\2\34\1\33"+
			"\1\uffff\12\31\2\34\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
			"\1\15\1\16\1\17\1\1\1\3\1\2\1\20\1\34\1\21\1\22\1\23\1\34\1\24\1\25\1"+
			"\26\1\27\1\34\4\uffff\1\34\1\uffff\32\34",
			"\1\43\5\uffff\1\45\2\uffff\1\37\1\41\15\uffff\1\35\7\uffff\1\36\5\uffff"+
			"\1\44\2\uffff\1\40\1\42",
			"\1\47\3\uffff\1\46\3\uffff\1\50",
			"\1\52\11\uffff\1\51",
			"\1\53\2\uffff\1\54\1\uffff\1\55\1\56\1\57\1\60\6\uffff\1\61",
			"\1\62\3\uffff\1\63\3\uffff\1\64\2\uffff\1\65\2\uffff\1\66\2\uffff\1"+
			"\67\2\uffff\1\70",
			"\1\71\3\uffff\1\72\2\uffff\1\73\3\uffff\1\74\2\uffff\1\75\5\uffff\1"+
			"\76",
			"\1\101\16\uffff\1\77\15\uffff\1\100",
			"\1\102",
			"\1\107\26\uffff\1\103\2\uffff\1\104\2\uffff\1\105\2\uffff\1\106",
			"\1\110\3\uffff\1\111\2\uffff\1\112\2\uffff\1\113\2\uffff\1\114",
			"\1\115",
			"\1\116\1\117\16\uffff\1\120\1\uffff\1\121",
			"\1\122",
			"\1\123\11\uffff\1\124\5\uffff\1\125",
			"\1\133\13\uffff\1\126\3\uffff\1\127\2\uffff\1\130\6\uffff\1\132\u0086"+
			"\uffff\1\131",
			"\1\134\3\uffff\1\135\2\uffff\1\136\3\uffff\1\137\2\uffff\1\140\5\uffff"+
			"\1\141\3\uffff\1\142",
			"\1\147\33\uffff\1\143\2\uffff\1\144\6\uffff\1\145\5\uffff\1\146",
			"\1\164\23\uffff\1\163\13\uffff\1\150\1\uffff\1\151\1\uffff\1\152\2\uffff"+
			"\1\153\1\154\1\uffff\1\155\3\uffff\1\156\1\157\3\uffff\1\160\1\161\1"+
			"\uffff\1\162",
			"\1\173\14\uffff\1\171\22\uffff\1\172\1\165\5\uffff\1\166\2\uffff\1\167"+
			"\2\uffff\1\170",
			"\1\175\3\uffff\1\174",
			"\1\u0081\37\uffff\1\176\2\uffff\1\177\1\u0080",
			"\1\u0082",
			"\1\u0083",
			"\11\34\2\u0086\2\34\1\u0086\22\34\1\u0086\17\34\12\u0085\23\34\1\u0084"+
			"\uffb2\34",
			"\3\34\3\uffff\1\34\1\u0088\2\uffff\12\31\1\u0089\1\34\5\uffff\32\34"+
			"\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			"",
			"\1\u008b\1\uffff\1\u008c\4\uffff\1\u008a",
			"\1\u008d\4\uffff\1\u008e",
			"\1\u0090\62\uffff\1\u008f",
			"\1\u0090\122\uffff\1\u0091",
			"\1\u0090",
			"\1\u0090",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0099\3\uffff\1\u0098",
			"\1\u009a\25\uffff\1\u009b",
			"\1\u009c\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5\2\uffff\1\u00a6\7\uffff\1\u00a7\5\uffff\1\u00a8",
			"\1\u00a9",
			"\1\u00aa\15\uffff\1\u00ab\5\uffff\1\u00ac",
			"\1\u00ad\1\u00ae\1\uffff\1\u00af\2\uffff\1\u00b0\1\u00b1",
			"\1\u00b2\7\uffff\1\u00b3\13\uffff\1\u00b4",
			"\1\u00b5",
			"\1\u00b6\4\uffff\1\u00b7\3\uffff\1\u00b8\3\uffff\1\u00b9",
			"\1\u00ba",
			"\1\u00bb\3\uffff\1\u00bc\5\uffff\1\u00bd",
			"\1\u00be",
			"\1\u00bf\10\uffff\1\u00c0",
			"\1\u00c1",
			"\1\u00c2\10\uffff\1\u00c3\1\uffff\1\u00c4",
			"\1\u00c5\4\uffff\1\u00c6",
			"\1\u0090",
			"\1\u00c7\14\uffff\1\u00c8",
			"\1\u00c9\10\uffff\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd\3\uffff\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3\5\uffff\1\u00d4",
			"\1\u00d5",
			"\1\u00d6\3\uffff\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd\14\uffff\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1\4\uffff\1\u00e2\3\uffff\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8\1\uffff\1\u00e9",
			"\1\u00ea\1\uffff\1\u00eb\6\uffff\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef\2\uffff\1\u00f0\1\u00f1\1\uffff\1\u00f2\2\uffff\1\u00f3",
			"\1\u00f4\4\uffff\1\u00f5",
			"\1\u00f6",
			"\1\u00f7\17\uffff\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd\2\uffff\1\u00fe\1\u00ff\6\uffff\1\u0100",
			"\1\u0101\6\uffff\1\u0102",
			"\1\u0103\22\uffff\1\u0104",
			"\1\u0105\3\uffff\1\u0106",
			"\1\u0107\11\uffff\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b\7\uffff\1\u010c",
			"\1\u010d",
			"\1\u010f\4\uffff\1\u010e",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011f\4\uffff\1\u011c\2\uffff\1\u011d\6\uffff\1\u011e",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\10\34\1\u0125\21\34",
			"\2\u0127\2\uffff\1\u0127\22\uffff\1\u0127\5\uffff\2\34\1\uffff\1\u0127"+
			"\2\uffff\2\34\2\uffff\12\u0126\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\2\u0127\2\uffff\1\u0127\22\uffff\1\u0127\5\uffff\2\34\4\uffff\2\34"+
			"\2\uffff\12\u0128\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\12\u0129",
			"\12\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0090",
			"",
			"\1\u0090",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\131",
			"\1\u0134",
			"\1\u0136\7\uffff\1\u0135",
			"\1\u0137\20\uffff\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143\15\uffff\1\u0144",
			"\1\u0145\12\uffff\1\u0146\2\uffff\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f\25\uffff\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156\22\uffff\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b\3\uffff\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161\5\uffff\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e\5\uffff\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\131",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b\27\uffff\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
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
			"\1\u01ae\5\uffff\1\u01af",
			"\1\u01b0",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6\7\uffff\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\131",
			"\1\u01bf",
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
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u01cf\7"+
			"\34",
			"\2\u01d1\2\uffff\1\u01d1\22\uffff\1\u01d1\5\uffff\2\34\1\uffff\1\u01d2"+
			"\2\uffff\2\34\2\uffff\12\u01d0\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"",
			"\2\u01d1\2\uffff\1\u01d1\22\uffff\1\u01d1\5\uffff\2\34\1\uffff\1\u01d2"+
			"\2\uffff\2\34\2\uffff\12\u0128\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u01d3\2\uffff\12\u0129",
			"\2\u01d4\2\uffff\1\u01d4\22\uffff\1\u01d4\17\uffff\12\u012a",
			"\1\u01d5\3\uffff\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u0090",
			"\1\u0090",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\1\131",
			"\1\u01df",
			"\1\u01e0\3\uffff\1\u01e1",
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
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\131\103\uffff\1\u0202\10\uffff\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\131",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\1\131",
			"\1\u020c",
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
			"\1\u0218\17\uffff\1\u0217",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\131",
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
			"\1\u022e",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"\1\u0234",
			"\1\u0235",
			"\1\u0236",
			"\1\u0237",
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
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34",
			"\61\34\1\u0244\20\34\1\u0245\1\u0246\1\34\1\u0247\1\u0248\1\u0249\1"+
			"\34\1\u024a\2\34\1\u024b\1\u0243\4\34\1\u024c\1\u024d\1\u024e\2\34\1"+
			"\u024f\uffa8\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\12\34\1\u0250\7\34\1\u019b\7\34",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\2\u0257\2\uffff\1\u0257\22\uffff\1\u0257",
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
			"\1\131",
			"\1\u0262",
			"\1\u0263",
			"\1\131",
			"\1\131",
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
			"\1\u0273",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\131",
			"\1\u0278",
			"\1\u0279",
			"\1\131\107\uffff\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u027e\27"+
			"\34",
			"\2\u01d1\2\uffff\1\u01d1\22\uffff\1\u01d1\5\uffff\2\34\1\uffff\1\u027f"+
			"\2\uffff\2\34\2\uffff\12\u0128\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\2\u01d1\2\uffff\1\u01d1\22\uffff\1\u01d1\5\uffff\2\34\1\uffff\1\u01d2"+
			"\2\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\12\u0280",
			"",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\1\131",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
			"\1\u02a4",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u02a5",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u02a9",
			"\1\u02aa",
			"\1\131",
			"\1\u02ab",
			"\1\u02ac",
			"\1\u02ad",
			"\1\131",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\131\122\uffff\1\u02b9",
			"\1\u02ba",
			"\1\u02bb",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u02bd",
			"\1\131",
			"\1\u02be",
			"\1\u02bf",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\1\131",
			"\1\u02c4",
			"\1\u02c5",
			"\1\131\104\uffff\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\1\131",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\131",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\1\u02d3",
			"\1\u02d4",
			"\1\131",
			"\1\u02d5",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u02d7",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\131",
			"\1\u02db",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\1\u02df",
			"\1\u02e0",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\10\34\1\u02e1\21\34",
			"\2\34\4\uffff\2\34\2\uffff\3\34\1\u02e2\1\34\1\u02e3\6\34\5\uffff\32"+
			"\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\16\34\1\u02e4\13\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\16\34\1\u02e5\13\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\15\34\1\u02e6\14\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\10\34\1\u02e7\21\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\4\34\1\u02e8\11\34\1\u02e9\13\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\21\34\1\u02ea\10\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\1\u02eb\15\34\1\u02ec\13\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\16\34\1\u02ed\13\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\14\34\1\u02ee\6\34\1\u02ef\6\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\16\34\1\u02f0\13\34",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\7\34\1\u02f1\1\u02f2\21\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"",
			"\1\131",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\131",
			"\1\u0301",
			"\1\131",
			"\1\u0302",
			"\1\u0303",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"\1\u0308",
			"\1\u0309",
			"\1\u030a",
			"\1\u030b",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\131",
			"\1\u0315",
			"\1\u0316",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\1\u031b\1\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\u031c\2\uffff\1\u031c\22\uffff\1\u031c\17\uffff\12\u031d",
			"\1\u031e\2\uffff\12\u0280",
			"\1\u01dc",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0323",
			"\1\u0324",
			"\1\u01dc",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\1\131",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\1\u032e",
			"\1\u032f",
			"\1\u0330",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\1\131\122\uffff\1\u0336",
			"\1\u0337",
			"\1\u0338",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\131",
			"\1\u0339",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\131",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0344",
			"\1\u0345",
			"\1\u0346",
			"\1\131",
			"\1\u0347",
			"\1\131",
			"\1\u0348",
			"\1\u0349",
			"",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\131",
			"\1\u0323",
			"\1\u0323",
			"\1\131",
			"\1\131",
			"\1\131",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\1\u0350",
			"\1\131",
			"\1\u0351",
			"\1\u0352",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359",
			"\1\u035a",
			"",
			"\1\u035b",
			"\1\131",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\131",
			"\1\u0360",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0361",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0363\4"+
			"\34\1\u0362\7\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u0364\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u0365\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\u0366\1"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u0367\27"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u0368\23"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0369\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u036a\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u036b\5"+
			"\34\1\u036c\10\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u036d\21"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\34\1\u036e\30"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u036f\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\24\34\1\u0370\5"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0371\13"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0372\31\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\u0373\1"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u0374\21"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0375\10"+
			"\34",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u037c",
			"\1\u037d",
			"\1\u037e",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"\1\u0383",
			"\1\u0384",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\1\131",
			"\1\u0323",
			"\1\u0388",
			"\1\u0389",
			"\1\u0323",
			"\1\u038a",
			"\1\u038b",
			"\1\u038c",
			"\1\u038d",
			"\1\u038e",
			"\1\u038f",
			"\1\u0390",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"",
			"",
			"\12\u0399",
			"\12\u039a",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u039b",
			"\1\u039c",
			"\2\u039d\2\uffff\1\u039d\22\uffff\1\u039d",
			"\1\u039e",
			"\1\131",
			"\1\u039f",
			"\1\131",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\131",
			"\1\u03a4",
			"\1\u03a5",
			"\1\u03a6",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\131",
			"\1\u03a7",
			"\1\u03a8",
			"\1\131",
			"\1\131",
			"\1\131",
			"\1\u03a9",
			"\1\u03aa",
			"\1\131",
			"\1\u03ab",
			"\1\u03ac",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"\1\u03b0",
			"\1\u03b1",
			"\1\131",
			"\1\131",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\131",
			"\1\u03b6",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\131",
			"\1\u03b7",
			"\1\131",
			"\1\u03b8",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u03b9",
			"\1\u03ba",
			"\1\131",
			"\1\u03bb",
			"\1\u03bc",
			"\1\u03bd",
			"\1\u03be",
			"\1\131",
			"\1\u03bf",
			"\1\u03c0",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u03c4",
			"\1\u03c5",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u03c6\27"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u03c7\21"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\10\34\1\u03c8\21\34\4\uffff\1\34\1\uffff\32"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\10\34\1\u03c9\21\34\4\uffff\1\34\1\uffff\32"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\12\34\1\u03ca\17"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\12\34\1\u03cb\17"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u03cc\16"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\u03cd\16"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\14\34\1\u03ce\15"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u03cf\26"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u03d0\26"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u03d1\7"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u03d2\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u03d3\23"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u03d4\23"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u03d5\13"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u03d6\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u03d8\6"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u03d9\25"+
			"\34",
			"\1\u03da",
			"\1\131",
			"\1\u03db",
			"\1\u03dc",
			"\1\u03dd",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0",
			"\1\u03e1",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\1\131",
			"\1\u03e5",
			"\1\u03e6",
			"\1\131",
			"\1\u03e7",
			"\1\u03e8",
			"\1\131",
			"\1\131",
			"\1\u0323",
			"\1\u0323",
			"\1\u03e9",
			"\1\u03ea",
			"\1\131\122\uffff\1\u03eb",
			"\1\u03ec",
			"\1\u03ed",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u03ee",
			"\1\u03ef",
			"\1\u03f0",
			"\1\u03f1",
			"\12\u03f2",
			"\3\34\3\uffff\2\34\2\uffff\12\u039a\2\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34",
			"\1\u03f4",
			"\1\u03f5",
			"",
			"\1\u03f6",
			"\1\u03f7",
			"\1\u03f8",
			"\1\u03f9",
			"\1\u03fa",
			"\1\131",
			"\1\131",
			"\1\u03fb",
			"\1\u03fc",
			"\1\u03fd",
			"\1\u03fe",
			"\1\u03ff",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\131",
			"\1\u0400",
			"\1\131",
			"\1\131",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\1\u0405",
			"\1\131",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0409",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\4\34\1\u040a\15\34\1\u019b\7\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\131",
			"\1\131",
			"\1\u040b",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u040c",
			"\1\131",
			"\1\u040d",
			"\1\u040e",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\1\131\1\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u040f\31\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0410\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0411\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u0412\21"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0413\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u0414\21"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0415\26"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0416\31\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0417\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0418\13"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0419\22"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u041a\31\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u041b\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u041c\22"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u041d\22"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u041e\6"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u041f\26"+
			"\34",
			"\2\34\1\u0422\3\uffff\2\34\2\uffff\14\34\5\uffff\1\u0420\16\34\1\u0421"+
			"\12\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0423\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0424\22"+
			"\34",
			"\1\131",
			"\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"\1\u0323",
			"\1\u0428",
			"\1\131",
			"\1\131",
			"\1\131",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0429",
			"\1\131",
			"\1\u042a",
			"\1\u0323",
			"\1\u0323",
			"\1\u0323",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u042b",
			"\1\u042c",
			"\1\u042d",
			"\1\u042e",
			"\1\u042f",
			"\1\u0430",
			"\1\u0431",
			"",
			"\1\u0432",
			"\1\131",
			"\1\u0433",
			"\1\131",
			"\1\u0434",
			"\1\u0435",
			"\1\u0436",
			"\1\131",
			"\1\u0437",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0438",
			"\1\u0439",
			"\1\u043a",
			"\1\u043b",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u043c",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u043d",
			"\1\u043e",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\131",
			"\1\u043f",
			"\1\u0440",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0441",
			"\1\u0442",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u0443\6"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u0444\27"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u0445\27"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0446\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0447\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u0448\7"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u0449\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u044a\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u044b\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u044c\26"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\2\34\1\u044d\27\34\4\uffff\1\34\1\uffff\32"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u044e\31\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u044f\22"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0450\31\34",
			"\1\u0451",
			"\1\u0452",
			"\115\34\1\u0453\uffb2\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0454\31\34",
			"\1\u0455",
			"\1\131",
			"\1\u0456",
			"\1\u0457",
			"\1\u0458",
			"\1\u0459",
			"\1\u045a",
			"\1\u0323",
			"\1\u045b",
			"\1\u0323",
			"\1\u045c",
			"\1\131",
			"\12\u045d",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\131",
			"\1\u045e",
			"\1\u045f",
			"\1\131",
			"\1\131",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0460",
			"\1\131",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\131",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\24\34\1\u0464\5"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0465\22"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0466\22"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u0467\22"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u0468\5\uffff\2\34\1\uffff\1\34\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0469\13"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u046a\13"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u046b\21"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u046c\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u046d\10"+
			"\34",
			"\1\u046e",
			"\1\u046f",
			"\2\34\4\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\10\34\1\u0470\21\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u0471\21"+
			"\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0472",
			"\1\u0473",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\131",
			"\1\u0474",
			"\12\u0475",
			"\1\u0476",
			"\1\u0477",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0478",
			"\1\131",
			"\1\131",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0479\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\u047a\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\22\34\1\u047b\7\34\4\uffff\1\34\1\uffff\32"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u047c\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u047d\31\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u047e\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\2\34\1\u047f\27\34\4\uffff\1\34\1\uffff\32"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0480\26"+
			"\34",
			"\1\u0481",
			"\1\u0482",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u0362\7"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u0483\10"+
			"\34",
			"\1\u0484",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u0485",
			"\12\u0486",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\1\u0487",
			"\1\131",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0488\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\2\34\1\u0489\17\34\1\u048a\7\34\4\uffff\1\34"+
			"\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u048b\22"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u048c\6"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u048d\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u048e\13"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\u048f",
			"\1\u0490",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u0491\25"+
			"\34",
			"\1\u0492",
			"\1\u0493",
			"\12\u0494",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0495\13"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\17\34\1\u0496\12"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\u0497\13"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u0498\26"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u0499\31\34",
			"\2\34\1\u0422\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34",
			"\1\u049a",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u049b\26"+
			"\34",
			"\1\131",
			"\1\u049c",
			"\3\34\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\u049d\27"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u049e\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u049f\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u04a0\6"+
			"\34",
			"\1\u04a1",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\1\u019c\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\22\34\1\u019b\7\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\12\34\1\u04a2\17"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u04a3\21"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\u04a4\6"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\u04a5",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u04a6\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\u04a7\14"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\u04a8\22"+
			"\34",
			"\1\u04a9",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u04aa\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\6\34\1\u04ab\23"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\1\u04ac\31\34",
			"\1\u04ad",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u04ae\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\u04af\21"+
			"\34",
			"\1\u04b0",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u04b1\10"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\u04b2\10"+
			"\34",
			"\2\34\1\u0422\3\uffff\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34"+
			"\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u04b3\25"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\u04b4\26"+
			"\34",
			"\2\34\2\uffff\1\34\22\uffff\1\34\5\uffff\2\34\1\uffff\1\u03d7\2\uffff"+
			"\2\34\2\uffff\14\34\5\uffff\32\34\4\uffff\1\34\1\uffff\32\34"
	};

	static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
	static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
	static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
	static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
	static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
	static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
	static final short[][] DFA39_transition;

	static {
		int numStates = DFA39_transitionS.length;
		DFA39_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
		}
	}

	class DFA39 extends DFA {

		public DFA39(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 39;
			this.eot = DFA39_eot;
			this.eof = DFA39_eof;
			this.min = DFA39_min;
			this.max = DFA39_max;
			this.accept = DFA39_accept;
			this.special = DFA39_special;
			this.transition = DFA39_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | STANDALONE_COMMENT | COMMENT | PARENTHETICAL_INT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA39_1058 = input.LA(1);
						s = -1;
						if ( (LA39_1058=='M') ) {s = 1107;}
						else if ( ((LA39_1058 >= '\u0000' && LA39_1058 <= 'L')||(LA39_1058 >= 'N' && LA39_1058 <= '\uFFFF')) ) {s = 28;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA39_412 = input.LA(1);
						s = -1;
						if ( (LA39_412=='M') ) {s = 579;}
						else if ( (LA39_412=='1') ) {s = 580;}
						else if ( (LA39_412=='B') ) {s = 581;}
						else if ( (LA39_412=='C') ) {s = 582;}
						else if ( (LA39_412=='E') ) {s = 583;}
						else if ( (LA39_412=='F') ) {s = 584;}
						else if ( (LA39_412=='G') ) {s = 585;}
						else if ( (LA39_412=='I') ) {s = 586;}
						else if ( (LA39_412=='L') ) {s = 587;}
						else if ( (LA39_412=='R') ) {s = 588;}
						else if ( (LA39_412=='S') ) {s = 589;}
						else if ( (LA39_412=='T') ) {s = 590;}
						else if ( (LA39_412=='W') ) {s = 591;}
						else if ( ((LA39_412 >= '\u0000' && LA39_412 <= '0')||(LA39_412 >= '2' && LA39_412 <= 'A')||LA39_412=='D'||LA39_412=='H'||(LA39_412 >= 'J' && LA39_412 <= 'K')||(LA39_412 >= 'N' && LA39_412 <= 'Q')||(LA39_412 >= 'U' && LA39_412 <= 'V')||(LA39_412 >= 'X' && LA39_412 <= '\uFFFF')) ) {s = 28;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA39_24 = input.LA(1);
						s = -1;
						if ( (LA39_24=='M') ) {s = 132;}
						else if ( ((LA39_24 >= '0' && LA39_24 <= '9')) ) {s = 133;}
						else if ( ((LA39_24 >= '\t' && LA39_24 <= '\n')||LA39_24=='\r'||LA39_24==' ') ) {s = 134;}
						else if ( ((LA39_24 >= '\u0000' && LA39_24 <= '\b')||(LA39_24 >= '\u000B' && LA39_24 <= '\f')||(LA39_24 >= '\u000E' && LA39_24 <= '\u001F')||(LA39_24 >= '!' && LA39_24 <= '/')||(LA39_24 >= ':' && LA39_24 <= 'L')||(LA39_24 >= 'N' && LA39_24 <= '\uFFFF')) ) {s = 28;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 39, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
