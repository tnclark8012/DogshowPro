// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g 2013-02-11 21:15:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class dogshowcomboLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__37=37;
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
	public static final int FRAG_RING=20;
	public static final int FRAG_SPEC_CHAR=21;
	public static final int FRAG_SPEC_WORD_CHAR=22;
	public static final int FRAG_TIME_LABEL=23;
	public static final int FRAG_TITLE=24;
	public static final int FRAG_WEEK_DAY=25;
	public static final int INT=26;
	public static final int JUDGE=27;
	public static final int JUNIOR_CLASS=28;
	public static final int PARENTHETICAL=29;
	public static final int PARENTHETICAL_INT=30;
	public static final int RING_TITLE=31;
	public static final int SPECIAL_SUFFIX=32;
	public static final int STANDALONE_COMMENT=33;
	public static final int TIME=34;
	public static final int WORD=35;
	public static final int WS=36;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public dogshowcomboLexer() {} 
	public dogshowcomboLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public dogshowcomboLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g"; }

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:2:7: ( '.' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:2:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "JUNIOR_CLASS"
	public final void mJUNIOR_CLASS() throws RecognitionException {
		try {
			int _type = JUNIOR_CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:55:2: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Itermediate' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:55:4: 'Master Class'
					{
					match("Master Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:56:3: 'Open Senior'
					{
					match("Open Senior"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:57:3: 'Open Intermediate'
					{
					match("Open Intermediate"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:58:3: 'Open Junior'
					{
					match("Open Junior"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:59:3: 'Novice Senior'
					{
					match("Novice Senior"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:60:3: 'Novice Junior'
					{
					match("Novice Junior"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:61:3: 'Novice Itermediate'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:2: ( ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:4: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:4: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:5: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:28: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:49: ( 's' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='s') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:49: 's'
					{
					match('s'); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:54: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:54: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:58: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:59: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); 
					mFRAG_BREED_NAME_CATEGORY(); 

					match(')'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:92: ( WS )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:92: WS
							{
							mWS(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:96: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='A'||LA6_0=='P') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:96: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); 

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:132: ( BREED_NAME_SUFFIX )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='(') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:132: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:57:2: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:57:4: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:57:4: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:57:5: FRAG_BREED_NAME_SPECIAL_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:60:2: ( '(Misc. Dog)' | '(Misc. Dogs)' | '(Misc. Bitch)' | '(Misc. Bitches)' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:60:4: '(Misc. Dog)'
					{
					match("(Misc. Dog)"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:60:18: '(Misc. Dogs)'
					{
					match("(Misc. Dogs)"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:60:33: '(Misc. Bitch)'
					{
					match("(Misc. Bitch)"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:60:49: '(Misc. Bitches)'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:63:2: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:63:4: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:63:4: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:63:5: 'Sweepstakes'
					{
					match("Sweepstakes"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:63:19: 'Entry'
					{
					match("Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:63:27: 'Entries'
					{
					match("Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:63:37: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:64:29: ( 'Veteran Dog' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:64:31: 'Veteran Dog'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:66:2: ( 'Ascob' | 'Parti-Color' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:66:4: 'Ascob'
					{
					match("Ascob"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:66:12: 'Parti-Color'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:68:2: ( '13 Inch' | '15 Inch' | 'Boykin' | 'Cocker' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'German Shorthaired' | 'Golden' | 'Gordon' | 'Irish' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Toy' | 'White' | 'Wirehaired' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:69:3: '13 Inch'
					{
					match("13 Inch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:70:3: '15 Inch'
					{
					match("15 Inch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:71:3: 'Boykin'
					{
					match("Boykin"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:72:3: 'Cocker'
					{
					match("Cocker"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:73:3: 'English'
					{
					match("English"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:74:3: 'English Cocker'
					{
					match("English Cocker"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:75:3: 'English Springer'
					{
					match("English Springer"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:76:3: 'Field'
					{
					match("Field"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:77:3: 'German Shorthaired'
					{
					match("German Shorthaired"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:78:3: 'Golden'
					{
					match("Golden"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:79:3: 'Gordon'
					{
					match("Gordon"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:80:3: 'Irish'
					{
					match("Irish"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:81:3: 'Labrador'
					{
					match("Labrador"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:82:3: 'Long Coat'
					{
					match("Long Coat"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:83:3: 'Longhaired'
					{
					match("Longhaired"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:84:3: 'Miniature'
					{
					match("Miniature"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:85:3: 'Rough'
					{
					match("Rough"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:86:3: 'Smooth'
					{
					match("Smooth"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:87:3: 'Smooth Coat'
					{
					match("Smooth Coat"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:88:3: 'Standard'
					{
					match("Standard"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:89:3: 'Toy'
					{
					match("Toy"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:90:3: 'White'
					{
					match("White"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:91:3: 'Wirehaired'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:101:2: ( ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:101:3: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:101:3: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt13=189;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:101:4: 'Affenpinscher'
					{
					match("Affenpinscher"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:102:2: 'Afghan Hound'
					{
					match("Afghan Hound"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:103:2: 'Airedale Terrier'
					{
					match("Airedale Terrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:104:2: 'Akita'
					{
					match("Akita"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:105:2: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:106:2: 'American English Coonhound'
					{
					match("American English Coonhound"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:107:2: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:108:2: 'American Foxhound'
					{
					match("American Foxhound"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:109:2: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:110:2: 'American Water Spaniel'
					{
					match("American Water Spaniel"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:111:2: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:112:2: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:113:2: 'Australian Shepherd'
					{
					match("Australian Shepherd"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:114:2: 'Australian Terrier'
					{
					match("Australian Terrier"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:115:2: 'Basenji'
					{
					match("Basenji"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:116:2: 'Basset Hound'
					{
					match("Basset Hound"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:117:2: 'Beagle'
					{
					match("Beagle"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:118:2: 'Bearded Collie'
					{
					match("Bearded Collie"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:119:2: 'Beauceron'
					{
					match("Beauceron"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:120:2: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:121:2: 'Belgian Malinois'
					{
					match("Belgian Malinois"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:122:2: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:123:2: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:124:2: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:125:2: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:126:2: 'Bichons Frise'
					{
					match("Bichons Frise"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:127:2: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:128:2: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:129:2: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:130:2: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:131:2: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:132:2: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:133:2: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:134:2: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:135:2: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:136:2: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:137:2: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:138:2: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:139:2: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:140:2: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:141:2: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:142:2: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:143:2: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:144:2: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:145:2: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:146:2: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:147:2: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:148:2: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:149:2: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:150:2: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:151:2: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:152:2: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:153:2: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:154:2: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:155:2: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:156:2: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:157:2: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:158:2: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:159:2: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:160:2: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:161:2: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:162:2: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:163:2: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:164:2: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:165:2: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:166:2: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:167:2: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:168:2: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:169:2: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:170:2: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:171:2: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:172:2: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:173:2: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:174:2: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:175:2: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:176:2: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:177:2: 'Fox Terrier'
					{
					match("Fox Terrier"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:178:2: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:179:2: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:180:2: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:181:2: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:182:2: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:183:2: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:184:2: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:185:2: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:186:2: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:187:2: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:188:2: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:189:2: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:190:2: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:191:2: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:192:2: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:193:2: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:194:2: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:195:2: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:196:2: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:197:2: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:198:2: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:199:2: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:200:2: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:201:2: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:202:2: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:203:2: 'Keeshonden'
					{
					match("Keeshonden"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:204:2: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:205:2: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:206:2: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:207:2: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:208:2: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:209:2: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:210:2: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:211:2: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:212:2: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:213:2: 'Lowchen'
					{
					match("Lowchen"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:214:2: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:215:2: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:216:2: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:217:2: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:218:2: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:219:2: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:220:2: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:221:2: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:222:2: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:223:2: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:224:2: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:225:2: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:226:2: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:227:2: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:228:2: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:229:2: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:230:2: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:231:2: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:232:2: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:233:2: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:234:2: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:235:2: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:236:2: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:237:2: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:238:2: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:239:2: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:240:2: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:241:2: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:242:2: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:243:2: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:244:2: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:245:2: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:246:2: 'Pulik'
					{
					match("Pulik"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:247:2: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:248:2: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:249:2: 'Retrievers'
					{
					match("Retrievers"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:250:2: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:251:2: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:252:2: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:253:2: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:254:2: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:255:2: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:256:2: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:257:2: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:258:2: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:259:2: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:260:2: 'Setters'
					{
					match("Setters"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:261:2: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:262:2: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:263:2: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:264:2: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:265:2: 'Siberian Huskies'
					{
					match("Siberian Huskies"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:266:2: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:267:2: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:268:2: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:269:2: 'Spaniels'
					{
					match("Spaniels"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:2: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:271:2: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:272:2: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:273:2: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:274:2: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:275:2: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:276:2: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:277:2: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:278:2: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:279:2: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:280:2: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:281:2: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:282:2: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:283:2: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:284:2: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:285:2: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:286:2: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:287:2: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:2: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:289:2: 'Yorkshire Terrier'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:292:8: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:292:19: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:293:8: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:293:16: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:294:8: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:294:16: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:295:8: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:295:14: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:296:8: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:296:15: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:297:8: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:297:15: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:298:8: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:298:17: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:299:8: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:299:20: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:300:8: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:300:18: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:301:8: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:301:19: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:302:8: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:302:19: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:304:26: ( ( '(' . ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:304:28: ( '(' . )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:304:28: ( '(' . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:304:29: '(' .
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:305:27: ( ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:305:29: ')'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:306:26: ( '!' | '?' | '.' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:307:21: ( 'RING' | 'Ring' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:307:23: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:307:30: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:308:26: ( ',' | '_' | '-' | ';' | ':' | '\\'' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:311:2: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:311:4: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:314:5: ( 'am' | 'pm' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:314:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:314:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:317:2: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:317:4: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:317:9: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:318:3: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:318:9: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:319:3: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:319:8: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:320:3: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:320:10: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:321:4: 'DR'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:324:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:324:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:324:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:325:6: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:325:15: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:326:6: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:326:16: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:327:6: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:327:18: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:328:6: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:328:17: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:329:6: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:329:15: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:330:6: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:330:17: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:334:2: ( ( WORD | INT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:334:4: ( WORD | INT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:334:4: ( WORD | INT )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:334:5: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:334:10: INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:358:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:358:17: INT '-' INT '-' INT '-' INT
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

	// $ANTLR start "JUDGE"
	public final void mJUDGE() throws RecognitionException {
		try {
			int _type = JUDGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:354:7: ( FRAG_TITLE ( WS WORD | PARENTHETICAL )+ WS PARENTHETICAL_INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:354:9: FRAG_TITLE ( WS WORD | PARENTHETICAL )+ WS PARENTHETICAL_INT
			{
			mFRAG_TITLE(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:354:20: ( WS WORD | PARENTHETICAL )+
			int cnt20=0;
			loop20:
			do {
				int alt20=3;
				alt20 = dfa20.predict(input);
				switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:354:21: WS WORD
					{
					mWS(); 

					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:354:29: PARENTHETICAL
					{
					mPARENTHETICAL(); 

					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
						EarlyExitException eee =
							new EarlyExitException(20, input);
						throw eee;
				}
				cnt20++;
			} while (true);

			mWS(); 

			mPARENTHETICAL_INT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JUDGE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:356:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:356:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:356:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt21=0;
			loop21:
			do {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '\t' && LA21_0 <= '\n')||LA21_0=='\r'||LA21_0==' ') ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:
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
					if ( cnt21 >= 1 ) break loop21;
						EarlyExitException eee =
							new EarlyExitException(21, input);
						throw eee;
				}
				cnt21++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:358:13: ( 'RING' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:358:17: 'RING' WS INT
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

	// $ANTLR start "TIME"
	public final void mTIME() throws RecognitionException {
		try {
			int _type = TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:362:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:362:13: INT ':' INT WS FRAG_TIME_LABEL
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:364:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:364:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:366:9: ( '.' ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:366:11: '.' ( '.' )+
			{
			match('.'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:366:15: ( '.' )+
			int cnt22=0;
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='.') ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:366:15: '.'
					{
					match('.'); 
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:368:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:368:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:368:6: ( '0' .. '9' )+
			int cnt23=0;
			loop23:
			do {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:
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
					if ( cnt23 >= 1 ) break loop23;
						EarlyExitException eee =
							new EarlyExitException(23, input);
						throw eee;
				}
				cnt23++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:370:2: ( 'LUNCH' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:370:4: 'LUNCH'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:371:9: ( ( WORD )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:371:11: ( WORD )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:371:11: ( WORD )+
			int cnt24=0;
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= '&' && LA24_0 <= '\'')||(LA24_0 >= ',' && LA24_0 <= '-')||(LA24_0 >= ':' && LA24_0 <= ';')||(LA24_0 >= 'A' && LA24_0 <= 'Z')||LA24_0=='_'||(LA24_0 >= 'a' && LA24_0 <= 'z')) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:371:11: WORD
					{
					mWORD(); 

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
	// $ANTLR end "COMMENT"

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:373:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:373:18: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:373:18: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt25=0;
			loop25:
			do {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= '&' && LA25_0 <= '\'')||(LA25_0 >= ',' && LA25_0 <= '-')||(LA25_0 >= ':' && LA25_0 <= ';')||(LA25_0 >= 'A' && LA25_0 <= 'Z')||LA25_0=='_'||(LA25_0 >= 'a' && LA25_0 <= 'z')) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:
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
					if ( cnt25 >= 1 ) break loop25;
						EarlyExitException eee =
							new EarlyExitException(25, input);
						throw eee;
				}
				cnt25++;
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORD"

	// $ANTLR start "PARENTHETICAL"
	public final void mPARENTHETICAL() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:2: ( FRAG_PAREN_LEFT ( ( WORD | INT ) ( WS )? )+ FRAG_PAREN_RIGHT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:4: FRAG_PAREN_LEFT ( ( WORD | INT ) ( WS )? )+ FRAG_PAREN_RIGHT
			{
			mFRAG_PAREN_LEFT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:20: ( ( WORD | INT ) ( WS )? )+
			int cnt28=0;
			loop28:
			do {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= '&' && LA28_0 <= '\'')||(LA28_0 >= ',' && LA28_0 <= '-')||(LA28_0 >= '0' && LA28_0 <= ';')||(LA28_0 >= 'A' && LA28_0 <= 'Z')||LA28_0=='_'||(LA28_0 >= 'a' && LA28_0 <= 'z')) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:21: ( WORD | INT ) ( WS )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:21: ( WORD | INT )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( ((LA26_0 >= '&' && LA26_0 <= '\'')||(LA26_0 >= ',' && LA26_0 <= '-')||(LA26_0 >= ':' && LA26_0 <= ';')||(LA26_0 >= 'A' && LA26_0 <= 'Z')||LA26_0=='_'||(LA26_0 >= 'a' && LA26_0 <= 'z')) ) {
						alt26=1;
					}
					else if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
						alt26=2;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}
					switch (alt26) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:22: WORD
							{
							mWORD(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:27: INT
							{
							mINT(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:32: ( WS )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= '\t' && LA27_0 <= '\n')||LA27_0=='\r'||LA27_0==' ') ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:377:32: WS
							{
							mWS(); 

							}
							break;

					}

					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
						EarlyExitException eee =
							new EarlyExitException(28, input);
						throw eee;
				}
				cnt28++;
			} while (true);

			mFRAG_PAREN_RIGHT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHETICAL"

	// $ANTLR start "PARENTHETICAL_INT"
	public final void mPARENTHETICAL_INT() throws RecognitionException {
		try {
			int _type = PARENTHETICAL_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:380:2: ( '(' ( WS )? ( '0' .. '9' )+ ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:380:4: '(' ( WS )? ( '0' .. '9' )+ ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:380:8: ( WS )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( ((LA29_0 >= '\t' && LA29_0 <= '\n')||LA29_0=='\r'||LA29_0==' ') ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:380:8: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:380:12: ( '0' .. '9' )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:
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

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:380:22: ( WS )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( ((LA31_0 >= '\t' && LA31_0 <= '\n')||LA31_0=='\r'||LA31_0==' ') ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:380:22: WS
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:8: ( T__37 | JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | BREED_COUNT | JUDGE | WS | RING_TITLE | TIME | DATE | ELLIPSIS | INT | STANDALONE_COMMENT | COMMENT | PARENTHETICAL_INT )
		int alt32=16;
		alt32 = dfa32.predict(input);
		switch (alt32) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:10: T__37
				{
				mT__37(); 

				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:16: JUNIOR_CLASS
				{
				mJUNIOR_CLASS(); 

				}
				break;
			case 3 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:29: BREED_NAME
				{
				mBREED_NAME(); 

				}
				break;
			case 4 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:40: SPECIAL_SUFFIX
				{
				mSPECIAL_SUFFIX(); 

				}
				break;
			case 5 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:55: BREED_NAME_SUFFIX
				{
				mBREED_NAME_SUFFIX(); 

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:73: BREED_COUNT
				{
				mBREED_COUNT(); 

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:85: JUDGE
				{
				mJUDGE(); 

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:91: WS
				{
				mWS(); 

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:94: RING_TITLE
				{
				mRING_TITLE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:105: TIME
				{
				mTIME(); 

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:110: DATE
				{
				mDATE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:115: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:124: INT
				{
				mINT(); 

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:128: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); 

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:147: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:155: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA32 dfa32 = new DFA32(this);
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
			return "101:3: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
		}
	}

	static final String DFA20_eotS =
		"\5\uffff";
	static final String DFA20_eofS =
		"\5\uffff";
	static final String DFA20_minS =
		"\2\11\3\uffff";
	static final String DFA20_maxS =
		"\1\50\1\172\3\uffff";
	static final String DFA20_acceptS =
		"\2\uffff\1\2\1\3\1\1";
	static final String DFA20_specialS =
		"\5\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\1\2\uffff\1\1\22\uffff\1\1\7\uffff\1\2",
			"\2\1\2\uffff\1\1\22\uffff\1\1\5\uffff\2\4\1\3\3\uffff\2\4\14\uffff\2"+
			"\4\5\uffff\32\4\4\uffff\1\4\1\uffff\32\4",
			"",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 354:20: ( WS WORD | PARENTHETICAL )+";
		}
	}

	static final String DFA32_eotS =
		"\1\uffff\1\35\27\34\1\uffff\1\u0088\4\uffff\74\34\1\uffff\52\34\5\uffff"+
		"\6\34\1\uffff\143\34\1\133\u00a0\34\2\133\70\34\1\uffff\12\34\1\133\24"+
		"\34\1\133\1\34\1\133\30\34\1\u02a0\36\34\1\u02ba\6\34\1\133\5\34\1\133"+
		"\6\34\1\uffff\75\34\1\133\11\34\1\133\3\34\1\133\14\34\1\133\10\34\1\uffff"+
		"\23\34\1\133\5\34\1\uffff\10\34\1\133\7\34\1\133\30\34\1\133\10\34\2\133"+
		"\17\34\1\133\13\34\1\133\15\34\1\u02a0\4\34\1\133\12\34\1\133\4\34\1\133"+
		"\10\34\1\133\4\34\1\133\22\34\1\133\6\34\1\uffff\15\34\1\133\15\34\1\133"+
		"\2\34\2\133\3\34\1\133\16\34\1\133\6\34\1\u02a0\17\34\1\133\4\34\1\133"+
		"\1\34\2\133\2\34\1\133\3\34\1\133\17\34\1\133\5\34\1\133\5\34\3\133\1"+
		"\34\3\133\2\34\1\133\4\34\1\133\4\34\1\u02a0\1\34\1\133\4\34\1\133\2\34"+
		"\1\133";
	static final String DFA32_eofS =
		"\u03e8\uffff";
	static final String DFA32_minS =
		"\1\11\1\56\1\111\1\154\1\145\1\146\2\141\1\122\1\156\1\122\1\145\1\141"+
		"\1\142\1\141\1\145\1\125\1\141\1\111\1\101\1\110\1\145\1\105\2\157\1\11"+
		"\1\55\4\uffff\1\154\1\156\4\11\1\123\1\156\1\116\1\145\1\144\1\164\1\162"+
		"\1\141\1\146\1\162\1\151\1\141\1\145\1\141\2\163\1\141\1\143\1\141\1\162"+
		"\1\141\1\154\1\151\1\163\1\145\1\165\1\143\1\162\1\143\1\142\1\11\1\147"+
		"\1\145\1\141\1\170\1\145\1\111\1\162\1\141\1\145\1\154\1\145\1\162\1\151"+
		"\1\145\1\151\1\141\1\160\1\145\1\155\1\166\1\142\1\157\1\141\1\uffff\1"+
		"\167\1\116\1\160\1\153\1\141\1\157\1\151\1\147\1\162\1\144\1\157\1\164"+
		"\1\163\1\116\1\151\1\150\1\141\1\145\1\142\1\171\1\146\2\141\1\156\1\145"+
		"\1\116\1\124\1\142\1\171\2\145\1\105\1\165\1\125\1\172\1\164\1\144\1\151"+
		"\1\162\1\104\1\154\1\162\5\uffff\2\164\1\143\1\151\1\163\1\11\1\uffff"+
		"\1\11\1\123\1\144\1\104\1\156\1\40\1\145\1\141\1\146\1\160\1\146\1\145"+
		"\1\150\1\145\1\164\1\163\1\162\2\164\1\145\1\147\1\154\1\147\1\156\1\150"+
		"\1\143\1\157\1\145\1\144\1\164\1\166\1\145\1\153\1\143\1\141\1\163\1\154"+
		"\1\162\1\141\1\144\1\141\1\153\1\163\1\150\1\167\1\155\1\153\2\154\1\150"+
		"\1\155\1\144\1\145\1\165\3\154\1\156\1\164\1\40\1\156\1\144\1\104\1\155"+
		"\2\156\2\144\1\141\1\162\1\141\1\172\1\154\1\163\1\154\1\141\1\163\1\162"+
		"\1\157\1\141\1\162\1\157\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\151"+
		"\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\46\1\151\1\145"+
		"\1\142\1\162\1\144\1\164\1\163\1\107\1\156\1\165\1\157\1\165\1\151\1\164"+
		"\1\154\2\164\1\142\1\145\1\153\1\145\1\164\2\156\1\146\1\163\2\144\1\104"+
		"\1\125\1\145\1\40\1\145\1\163\1\123\1\162\1\122\1\163\1\145\1\155\1\163"+
		"\1\164\1\156\1\160\1\145\1\116\1\157\1\153\2\145\1\150\1\141\2\11\1\141"+
		"\1\101\1\40\1\162\1\143\1\40\1\157\1\145\2\157\1\156\1\141\1\144\1\141"+
		"\1\153\1\151\1\157\1\162\1\156\1\145\1\154\1\144\1\143\2\151\1\145\1\157"+
		"\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163"+
		"\1\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\142"+
		"\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\145\1\151\1\145\1\151\1\144"+
		"\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150"+
		"\1\151\1\156\2\141\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\164"+
		"\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\156\1\162\1\164\1\141\2\164"+
		"\1\163\1\162\1\154\1\165\2\46\1\156\1\157\1\151\1\145\1\167\1\145\1\11"+
		"\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162"+
		"\1\171\2\40\1\151\1\157\1\146\1\144\1\145\1\141\1\151\1\160\1\101\1\122"+
		"\1\164\1\151\1\144\1\104\1\163\1\123\1\154\1\162\1\141\1\150\1\40\1\145"+
		"\1\160\1\40\1\105\1\151\1\163\1\162\1\146\1\163\1\145\1\164\1\171\1\131"+
		"\1\uffff\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\160\1\156\1\141\1"+
		"\46\1\141\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163\1\156"+
		"\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\46\1\156\1\46\1\144\1\141"+
		"\1\145\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\145"+
		"\1\162\1\145\1\55\1\150\1\164\1\145\1\155\1\40\1\163\1\142\1\46\1\145"+
		"\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\40\1\157\2\145"+
		"\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145"+
		"\1\40\1\145\1\46\1\154\1\156\1\147\1\157\1\40\1\157\1\46\1\145\1\150\1"+
		"\141\1\145\1\147\1\46\1\145\1\156\1\145\1\163\1\145\1\154\1\uffff\1\40"+
		"\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40\1\145"+
		"\1\156\1\157\1\141\1\170\1\171\2\163\1\131\1\104\1\141\1\156\1\141\1\101"+
		"\1\144\1\104\2\141\1\162\1\40\1\163\1\145\1\141\1\123\1\164\1\150\1\40"+
		"\1\146\1\145\1\163\1\165\2\54\1\157\1\40\1\153\1\151\1\150\1\151\1\156"+
		"\1\151\1\40\1\154\1\156\1\141\1\151\1\154\1\151\1\40\1\46\1\144\1\162"+
		"\1\147\1\156\1\145\1\40\1\157\1\143\1\40\1\46\1\40\1\162\1\40\1\46\1\156"+
		"\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\162\1\40\1\46\1\103"+
		"\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163\1\150\1\157\1\40"+
		"\2\54\3\40\1\162\1\165\1\162\1\163\1\40\1\144\1\156\1\163\1\156\1\157"+
		"\1\46\2\157\1\156\1\162\1\156\1\uffff\1\157\1\40\1\145\1\153\1\150\1\162"+
		"\1\40\1\156\1\46\1\165\1\141\1\145\1\166\2\151\1\154\1\46\1\144\1\141"+
		"\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162\1\40\1\54\1\150"+
		"\1\164\1\54\1\101\1\156\1\147\1\171\1\131\1\141\1\101\1\46\1\156\1\141"+
		"\1\144\1\164\1\151\1\104\1\172\1\151\2\46\1\164\1\162\1\11\1\165\1\40"+
		"\1\141\1\40\1\164\1\144\1\156\1\145\1\40\1\156\1\141\1\151\1\46\1\40\1"+
		"\157\1\164\3\40\1\165\1\153\1\40\1\171\1\163\1\46\1\164\1\156\1\162\1"+
		"\141\1\165\2\40\1\157\1\156\1\141\1\156\1\40\1\143\1\46\1\40\1\141\1\40"+
		"\1\156\1\46\1\145\1\151\1\40\1\145\1\144\2\162\1\40\1\144\1\147\1\46\1"+
		"\156\1\163\1\145\1\40\1\46\1\151\1\145\1\156\1\40\1\145\1\141\1\154\1"+
		"\40\1\46\1\171\1\162\1\150\1\155\1\46\1\144\1\156\1\163\1\40\2\144\1\40"+
		"\1\141\1\131\2\40\2\54\1\171\1\131\1\40\1\156\1\141\1\46\1\162\1\101\1"+
		"\143\1\162\2\145\1\uffff\2\156\1\141\1\154\1\163\2\40\1\156\1\141\1\156"+
		"\1\157\1\156\1\40\1\46\1\40\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1"+
		"\150\1\164\1\144\1\46\1\143\1\40\2\46\2\40\1\145\1\46\1\145\1\40\1\141"+
		"\1\163\1\40\1\162\1\156\1\145\1\54\1\153\4\40\1\46\1\163\1\40\1\153\3"+
		"\54\1\46\1\145\1\171\1\145\1\131\1\165\1\145\1\162\1\40\1\144\1\40\1\156"+
		"\1\141\1\143\1\40\1\156\1\46\1\156\1\144\1\146\1\145\1\46\1\164\2\46\2"+
		"\145\1\46\1\40\1\156\1\162\1\46\1\156\1\145\1\163\1\40\1\162\1\145\1\150"+
		"\1\145\1\162\1\54\1\144\1\54\1\151\2\40\1\46\1\40\1\156\1\150\2\40\1\46"+
		"\1\146\1\40\1\145\1\162\1\144\3\46\1\40\3\46\1\151\1\163\1\46\1\40\1\156"+
		"\1\144\1\145\1\46\1\144\2\40\1\162\1\46\1\164\1\46\1\162\1\40\1\145\1"+
		"\154\1\46\1\40\1\151\1\46";
	static final String DFA32_maxS =
		"\1\172\1\56\1\163\1\164\1\157\3\165\1\157\1\156\2\162\1\141\1\164\1\141"+
		"\1\165\1\u00f6\1\171\1\165\1\167\1\165\2\151\2\157\1\115\1\72\4\uffff"+
		"\2\163\1\123\1\163\2\50\1\123\1\156\1\116\1\145\1\144\1\164\1\166\1\167"+
		"\1\147\1\162\1\151\1\141\1\145\1\141\2\163\1\162\1\143\1\165\1\171\1\165"+
		"\1\154\1\166\1\163\1\157\1\165\1\154\1\162\1\156\1\147\1\50\1\164\1\156"+
		"\1\141\1\170\1\151\1\111\1\162\1\141\1\145\1\162\1\145\1\166\1\151\1\145"+
		"\1\151\1\141\1\160\1\162\1\155\1\166\1\153\1\157\1\141\1\uffff\1\167\1"+
		"\116\1\162\1\164\1\141\1\157\1\162\1\154\1\162\1\164\1\157\1\164\1\163"+
		"\1\116\1\164\1\157\1\164\1\151\1\154\1\171\1\146\1\151\1\141\1\163\1\145"+
		"\1\116\1\124\1\142\1\171\2\145\1\105\1\165\1\125\1\172\1\164\1\163\1\151"+
		"\1\162\1\104\1\154\1\162\5\uffff\2\164\1\143\1\151\1\163\1\50\1\uffff"+
		"\1\50\1\123\1\144\1\104\1\156\1\40\1\145\1\151\1\167\1\160\1\146\1\145"+
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
		"\1\155\1\163\1\164\1\156\1\160\1\145\1\116\1\157\1\153\1\151\1\145\1\150"+
		"\1\141\2\50\1\141\1\101\1\40\1\162\1\143\1\40\1\157\1\151\2\157\1\156"+
		"\1\141\1\144\1\141\1\153\1\151\1\157\1\162\1\156\1\145\1\154\1\144\1\143"+
		"\2\151\1\145\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145"+
		"\1\162\1\164\1\163\1\155\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165"+
		"\1\145\1\40\1\142\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\145\1\151"+
		"\1\145\1\171\1\144\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145"+
		"\1\157\1\164\1\150\1\151\1\156\2\141\1\150\1\151\1\156\1\150\1\171\1\156"+
		"\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\156\1\162"+
		"\1\164\1\141\2\164\1\163\1\162\1\154\1\165\2\172\1\156\1\157\1\151\1\145"+
		"\1\167\1\145\1\40\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\145\1\154"+
		"\1\141\1\40\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145\1\141\1\151"+
		"\1\160\1\101\1\122\1\164\1\151\1\144\1\104\1\163\1\123\1\154\1\162\1\141"+
		"\1\150\1\40\1\145\1\160\1\150\1\105\1\151\1\163\1\162\1\146\1\163\1\145"+
		"\1\164\1\171\1\131\1\uffff\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1"+
		"\160\1\156\1\141\1\172\1\141\1\143\1\154\1\141\1\152\1\164\3\145\1\156"+
		"\1\141\1\163\1\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\172\1\156"+
		"\1\172\1\144\1\141\1\145\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160"+
		"\1\141\1\163\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\2\163\1\142"+
		"\1\172\1\145\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\145"+
		"\1\157\2\145\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164"+
		"\1\141\1\145\1\40\1\145\1\172\1\154\1\156\1\147\1\157\1\40\1\157\1\172"+
		"\1\145\1\150\1\141\1\145\1\147\1\172\1\145\1\156\1\145\1\163\1\145\1\154"+
		"\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141\1\40\1\151"+
		"\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\131\1\104\1\141\1\156"+
		"\1\141\1\101\1\144\1\104\2\141\1\162\1\40\1\163\1\145\1\141\1\123\1\164"+
		"\1\150\1\40\1\146\1\145\1\163\1\165\2\54\1\157\1\40\1\153\1\151\1\150"+
		"\1\151\1\156\1\151\1\40\1\154\1\156\1\141\1\151\1\154\1\151\1\40\1\172"+
		"\1\144\1\162\1\147\1\156\1\145\1\163\1\157\1\143\1\40\1\172\1\40\1\162"+
		"\1\40\1\172\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\162"+
		"\1\40\1\172\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163"+
		"\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162\1\163\1\40\1\144\1\156\1"+
		"\163\1\156\1\157\1\172\2\157\1\156\1\162\1\156\1\uffff\1\157\1\40\1\145"+
		"\1\153\1\150\1\162\1\40\1\156\1\172\1\165\1\141\1\145\1\166\2\151\1\154"+
		"\1\172\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162"+
		"\1\40\1\54\1\150\1\164\1\54\1\101\1\156\1\147\1\171\1\131\1\141\1\101"+
		"\1\172\1\156\1\141\1\144\1\164\1\151\1\104\1\172\1\151\2\172\1\164\1\162"+
		"\1\40\1\165\1\40\1\141\1\40\1\164\1\144\1\156\1\145\1\40\1\156\1\141\1"+
		"\151\1\172\1\40\1\157\1\164\3\40\1\165\1\153\1\40\1\171\1\163\1\172\1"+
		"\164\1\156\1\162\1\141\1\165\2\40\1\157\1\156\1\141\1\156\1\40\1\143\1"+
		"\172\1\40\1\141\1\40\1\156\1\172\1\145\1\151\1\40\1\145\1\144\2\162\1"+
		"\40\1\144\1\147\1\172\1\156\1\163\1\145\1\40\1\172\1\151\1\145\1\156\1"+
		"\40\1\145\1\141\1\154\1\40\1\172\1\171\1\162\1\150\1\155\1\172\1\144\1"+
		"\156\1\163\1\40\2\144\1\40\1\141\1\131\2\40\2\54\1\171\1\131\1\163\1\156"+
		"\1\141\1\172\1\162\1\101\1\143\1\162\2\145\1\uffff\2\156\1\141\1\154\1"+
		"\163\2\40\1\156\1\141\1\156\1\157\1\156\1\40\1\172\1\40\1\151\2\40\1\153"+
		"\2\141\1\144\1\156\1\40\1\150\1\164\1\144\1\172\1\143\1\40\2\172\2\40"+
		"\1\145\1\172\1\145\1\40\1\141\1\163\1\40\1\162\1\156\1\145\1\54\1\153"+
		"\4\40\1\172\1\163\1\40\1\153\3\54\1\172\1\145\1\171\1\145\1\131\1\165"+
		"\1\145\1\162\1\40\1\144\1\40\1\156\1\141\1\143\1\40\1\156\1\172\1\156"+
		"\1\144\1\146\1\145\1\172\1\164\2\172\2\145\1\172\1\40\1\156\1\162\1\172"+
		"\1\156\1\145\1\163\1\40\1\162\1\145\1\150\1\145\1\162\1\54\1\144\1\54"+
		"\1\151\2\40\1\172\1\40\1\156\1\150\2\40\1\172\1\146\1\40\1\145\1\162\1"+
		"\144\3\172\1\40\3\172\1\151\1\163\1\172\1\40\1\156\1\144\1\145\1\172\1"+
		"\144\2\40\1\162\1\172\1\164\1\172\1\162\1\40\1\145\1\154\1\172\1\40\1"+
		"\151\1\172";
	static final String DFA32_acceptS =
		"\33\uffff\1\10\1\17\1\1\1\14\74\uffff\1\3\52\uffff\1\5\1\20\1\15\1\6\1"+
		"\12\6\uffff\1\7\u013e\uffff\1\2\155\uffff\1\11\141\uffff\1\4\31\uffff"+
		"\1\16\u009a\uffff\1\13\u0092\uffff";
	static final String DFA32_specialS =
		"\u03e8\uffff}>";
	static final String[] DFA32_transitionS = {
			"\2\33\2\uffff\1\33\22\uffff\1\33\5\uffff\2\34\1\31\3\uffff\2\34\1\1\1"+
			"\uffff\12\32\2\34\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
			"\16\1\17\1\20\1\2\1\4\1\3\1\21\1\34\1\22\1\23\1\24\1\34\1\25\1\26\1\27"+
			"\1\30\1\34\4\uffff\1\34\1\uffff\32\34",
			"\1\36",
			"\1\45\5\uffff\1\47\2\uffff\1\41\1\43\15\uffff\1\37\7\uffff\1\40\5\uffff"+
			"\1\46\2\uffff\1\42\1\44",
			"\1\51\3\uffff\1\50\3\uffff\1\52",
			"\1\54\11\uffff\1\53",
			"\1\55\2\uffff\1\56\1\uffff\1\57\1\60\1\61\1\62\6\uffff\1\63",
			"\1\64\3\uffff\1\65\3\uffff\1\66\2\uffff\1\67\2\uffff\1\70\2\uffff\1"+
			"\71\2\uffff\1\72",
			"\1\73\3\uffff\1\74\2\uffff\1\75\3\uffff\1\76\2\uffff\1\77\5\uffff\1"+
			"\100",
			"\1\103\16\uffff\1\101\15\uffff\1\102",
			"\1\104",
			"\1\111\26\uffff\1\105\2\uffff\1\106\2\uffff\1\107\2\uffff\1\110",
			"\1\112\3\uffff\1\113\2\uffff\1\114\2\uffff\1\115\2\uffff\1\116",
			"\1\117",
			"\1\120\1\121\16\uffff\1\122\1\uffff\1\123",
			"\1\124",
			"\1\125\11\uffff\1\126\5\uffff\1\127",
			"\1\135\13\uffff\1\130\3\uffff\1\131\2\uffff\1\132\6\uffff\1\134\u0086"+
			"\uffff\1\133",
			"\1\136\3\uffff\1\137\2\uffff\1\140\3\uffff\1\141\2\uffff\1\142\5\uffff"+
			"\1\143\3\uffff\1\144",
			"\1\151\33\uffff\1\145\2\uffff\1\146\6\uffff\1\147\5\uffff\1\150",
			"\1\166\23\uffff\1\165\13\uffff\1\152\1\uffff\1\153\1\uffff\1\154\2\uffff"+
			"\1\155\1\156\1\uffff\1\157\3\uffff\1\160\1\161\3\uffff\1\162\1\163\1"+
			"\uffff\1\164",
			"\1\175\14\uffff\1\173\22\uffff\1\174\1\167\5\uffff\1\170\2\uffff\1\171"+
			"\2\uffff\1\172",
			"\1\177\3\uffff\1\176",
			"\1\u0083\37\uffff\1\u0080\2\uffff\1\u0081\1\u0082",
			"\1\u0084",
			"\1\u0085",
			"\2\u0087\2\uffff\1\u0087\22\uffff\1\u0087\17\uffff\12\u0087\23\uffff"+
			"\1\u0086",
			"\1\u0089\2\uffff\12\32\1\u008a",
			"",
			"",
			"",
			"",
			"\1\u008c\1\uffff\1\u008d\4\uffff\1\u008b",
			"\1\u008e\4\uffff\1\u008f",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091\52\uffff\1"+
			"\u0090",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091\112\uffff"+
			"\1\u0092",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u009a\3\uffff\1\u0099",
			"\1\u009b\25\uffff\1\u009c",
			"\1\u009d\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6\2\uffff\1\u00a7\7\uffff\1\u00a8\5\uffff\1\u00a9",
			"\1\u00aa",
			"\1\u00ab\15\uffff\1\u00ac\5\uffff\1\u00ad",
			"\1\u00ae\1\u00af\1\uffff\1\u00b0\2\uffff\1\u00b1\1\u00b2",
			"\1\u00b3\7\uffff\1\u00b4\13\uffff\1\u00b5",
			"\1\u00b6",
			"\1\u00b7\4\uffff\1\u00b8\3\uffff\1\u00b9\3\uffff\1\u00ba",
			"\1\u00bb",
			"\1\u00bc\3\uffff\1\u00bd\5\uffff\1\u00be",
			"\1\u00bf",
			"\1\u00c0\10\uffff\1\u00c1",
			"\1\u00c2",
			"\1\u00c3\10\uffff\1\u00c4\1\uffff\1\u00c5",
			"\1\u00c6\4\uffff\1\u00c7",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091",
			"\1\u00c8\14\uffff\1\u00c9",
			"\1\u00ca\10\uffff\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce\3\uffff\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4\5\uffff\1\u00d5",
			"\1\u00d6",
			"\1\u00d7\3\uffff\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de\14\uffff\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2\4\uffff\1\u00e3\3\uffff\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9\1\uffff\1\u00ea",
			"\1\u00eb\1\uffff\1\u00ec\6\uffff\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0\2\uffff\1\u00f1\1\u00f2\1\uffff\1\u00f3\2\uffff\1\u00f4",
			"\1\u00f5\4\uffff\1\u00f6",
			"\1\u00f7",
			"\1\u00f8\17\uffff\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe\2\uffff\1\u00ff\1\u0100\6\uffff\1\u0101",
			"\1\u0102\6\uffff\1\u0103",
			"\1\u0104\22\uffff\1\u0105",
			"\1\u0106\3\uffff\1\u0107",
			"\1\u0108\11\uffff\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c\7\uffff\1\u010d",
			"\1\u010e",
			"\1\u0110\4\uffff\1\u010f",
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
			"\1\u011c",
			"\1\u0120\4\uffff\1\u011d\2\uffff\1\u011e\6\uffff\1\u011f",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"",
			"",
			"",
			"",
			"",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091",
			"",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\133",
			"\1\u012f",
			"\1\u0131\7\uffff\1\u0130",
			"\1\u0132\20\uffff\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e\15\uffff\1\u013f",
			"\1\u0140\12\uffff\1\u0141\2\uffff\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a\25\uffff\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151\22\uffff\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156\3\uffff\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c\5\uffff\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169\5\uffff\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\133",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176\27\uffff\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
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
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
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
			"\1\u01a8\5\uffff\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0\7\uffff\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\133",
			"\1\u01b9",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
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
			"\1\u01c9\3\uffff\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091",
			"\2\u0091\2\uffff\1\u0091\22\uffff\1\u0091\7\uffff\1\u0091",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\133",
			"\1\u01d3",
			"\1\u01d4\3\uffff\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
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
			"\1\133\103\uffff\1\u01f6\10\uffff\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\133",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\1\133",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020c\17\uffff\1\u020b",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\133",
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
			"\1\u022e",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"\1\u0234",
			"\1\u0235",
			"\1\u0236",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\12\34\1\u0237\7\34\1\u0196\7\34",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\2\u023e\2\uffff\1\u023e\22\uffff\1\u023e",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\133",
			"\1\u0249",
			"\1\u024a",
			"\1\133",
			"\1\133",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
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
			"\1\133",
			"\1\u025f",
			"\1\u0260",
			"\1\133\107\uffff\1\u0261",
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
			"",
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
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\133",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0289",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\133",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\1\133",
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
			"\1\133\122\uffff\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u02a1",
			"\1\133",
			"\1\u02a2",
			"\1\u02a3",
			"\1\u02a4",
			"\1\u02a5",
			"\1\u02a6",
			"\1\u02a7",
			"\1\133",
			"\1\u02a8",
			"\1\u02a9",
			"\1\133\104\uffff\1\u02aa",
			"\1\u02ab",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\1\u02af",
			"\1\133",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\133",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\133",
			"\1\u02b9",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u02bd",
			"\1\u02be",
			"\1\133",
			"\1\u02bf",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u02c5",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"",
			"\1\133",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\1\133",
			"\1\u02d3",
			"\1\133",
			"\1\u02d4",
			"\1\u02d5",
			"\1\u02d6",
			"\1\u02d7",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\1\u02df",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\1\u02e6",
			"\1\133",
			"\1\u02e7",
			"\1\u02e8",
			"\1\u02e9",
			"\1\u02ea",
			"\1\u02eb",
			"\1\u02ec",
			"\1\u01d0",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"\1\u02f0",
			"\1\u02f1",
			"\1\u02f1",
			"\1\u02f2",
			"\1\u01d0",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\133",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"\1\133\122\uffff\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\1\u0307",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0308",
			"\1\u0309",
			"\1\u030a",
			"\1\u030b",
			"\1\133",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\133",
			"\1\u0315",
			"\1\133",
			"\1\u0316",
			"\1\u0317",
			"",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\133",
			"\1\u02f1",
			"\1\u02f1",
			"\1\133",
			"\1\133",
			"\1\133",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\133",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"",
			"\1\u0329",
			"\1\133",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\1\133",
			"\1\u032e",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u032f",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0336",
			"\1\u0337",
			"\1\u0338",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\133",
			"\1\u02f1",
			"\1\u0342",
			"\1\u0343",
			"\1\u02f1",
			"\1\u0344",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\1\u0348",
			"\1\u0349",
			"\1\u034a",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\1\u0350",
			"\1\u0351",
			"\1\u0352",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0353",
			"\1\u0354",
			"\2\u0355\2\uffff\1\u0355\22\uffff\1\u0355",
			"\1\u0356",
			"\1\133",
			"\1\u0357",
			"\1\133",
			"\1\u0358",
			"\1\u0359",
			"\1\u035a",
			"\1\u035b",
			"\1\133",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\1\u035f",
			"\1\u0360",
			"\1\133",
			"\1\133",
			"\1\133",
			"\1\u0361",
			"\1\u0362",
			"\1\133",
			"\1\u0363",
			"\1\u0364",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\133",
			"\1\133",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"\1\133",
			"\1\u036e",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\133",
			"\1\u036f",
			"\1\133",
			"\1\u0370",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0371",
			"\1\u0372",
			"\1\133",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376",
			"\1\133",
			"\1\u0377",
			"\1\u0378",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u037c",
			"\1\u037d",
			"\1\u037e",
			"\1\133",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0382",
			"\1\u0383",
			"\1\u0384",
			"\1\u0385",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\1\133",
			"\1\u0389",
			"\1\u038a",
			"\1\133",
			"\1\u038b",
			"\1\u038c",
			"\1\133",
			"\1\133",
			"\1\u02f1",
			"\1\u02f1",
			"\1\u038d",
			"\1\u038e",
			"\1\133\122\uffff\1\u038f",
			"\1\u0390",
			"\1\u0391",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u0392",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\133",
			"\1\133",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\u03a1",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\1\u03a2",
			"\1\133",
			"\1\133",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\1\u03a6",
			"\1\u03a7",
			"\1\133",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03ab",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\4\34\1\u03ac\15\34\1\u0196\7\34",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\1\133",
			"\1\u03ad",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03ae",
			"\1\133",
			"\1\u03af",
			"\1\u03b0",
			"\1\133",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u02f1",
			"\1\u03b4",
			"\1\133",
			"\1\133",
			"\1\133",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03b5",
			"\1\133",
			"\1\u03b6",
			"\1\u02f1",
			"\1\u02f1",
			"\1\u02f1",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc",
			"\1\u03bd",
			"\1\133",
			"\1\u03be",
			"\1\133",
			"\1\u03bf",
			"\1\u03c0",
			"\1\u03c1",
			"\1\133",
			"\1\u03c2",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03c3",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03c7",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03c8",
			"\1\u03c9",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\1\u03ca",
			"\1\u03cb",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce",
			"\1\133",
			"\1\u03cf",
			"\1\u03d0",
			"\1\u03d1",
			"\1\u03d2",
			"\1\u03d3",
			"\1\u02f1",
			"\1\u03d4",
			"\1\u02f1",
			"\1\u03d5",
			"\1\133",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\1\u03d6",
			"\1\u03d7",
			"\1\133",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03d8",
			"\1\133",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03dc",
			"\1\u03dd",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03e1",
			"\1\133",
			"\1\133",
			"\1\u03e2",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\32\34",
			"\1\u03e3",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\u03e4",
			"\1\133",
			"\1\u03e5",
			"\1\u03e6",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34",
			"\1\133",
			"\1\u03e7",
			"\2\34\4\uffff\2\34\14\uffff\2\34\5\uffff\32\34\4\uffff\1\34\1\uffff"+
			"\22\34\1\u0196\7\34"
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__37 | JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | BREED_COUNT | JUDGE | WS | RING_TITLE | TIME | DATE | ELLIPSIS | INT | STANDALONE_COMMENT | COMMENT | PARENTHETICAL_INT );";
		}
	}

}
