// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g 2013-02-10 03:05:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class dogshowcomboLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ATOM=4;
	public static final int BREED_COUNT=5;
	public static final int BREED_RING=6;
	public static final int DATE=7;
	public static final int ELLIPSIS=8;
	public static final int END_PUNCTUATION=9;
	public static final int FRAG_BREED_NAME_ALT=10;
	public static final int FRAG_BREED_NAME_PLURAL=11;
	public static final int FRAG_BREED_NAME_SINGLE=12;
	public static final int FRAG_BREED_NAME_SUFFIX=13;
	public static final int FRAG_JUNIOR_CLASS=14;
	public static final int FRAG_MONTH=15;
	public static final int FRAG_PAREN_LEFT=16;
	public static final int FRAG_PAREN_RIGHT=17;
	public static final int FRAG_RING=18;
	public static final int FRAG_SPEC_CHAR=19;
	public static final int FRAG_SPEC_WORD_CHAR=20;
	public static final int FRAG_TIME_LABEL=21;
	public static final int FRAG_TITLE=22;
	public static final int FRAG_WEEK_DAY=23;
	public static final int INT=24;
	public static final int JUDGE=25;
	public static final int JUNIOR_RING=26;
	public static final int PARENTHETICAL=27;
	public static final int PARENTHETICAL_INT=28;
	public static final int RING_TITLE=29;
	public static final int TIME=30;
	public static final int WORD=31;
	public static final int WS=32;

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

	// $ANTLR start "FRAG_BREED_NAME_PLURAL"
	public final void mFRAG_BREED_NAME_PLURAL() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:35:2: ( ( ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) 's' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:35:4: ( ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) 's' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:35:4: ( ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) 's' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:35:5: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) 's'
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:35:5: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= 'A' && LA1_0 <= 'P')||(LA1_0 >= 'R' && LA1_0 <= 'T')||(LA1_0 >= 'W' && LA1_0 <= 'Y')) ) {
				alt1=1;
			}
			else if ( (LA1_0=='V') ) {
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='i') ) {
					alt1=1;
				}
				else if ( (LA1_2=='e') ) {
					alt1=2;
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
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:35:6: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:35:29: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			match('s'); 
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_PLURAL"

	// $ANTLR start "FRAG_BREED_NAME_SUFFIX"
	public final void mFRAG_BREED_NAME_SUFFIX() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:27:2: ( ( 'Sweepstakes Entries' | 'Sweepstakes Entry' | 'Veterans Sweepstakes Entries' | 'Veterans' | 'Dogs' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:27:4: ( 'Sweepstakes Entries' | 'Sweepstakes Entry' | 'Veterans Sweepstakes Entries' | 'Veterans' | 'Dogs' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:27:4: ( 'Sweepstakes Entries' | 'Sweepstakes Entry' | 'Veterans Sweepstakes Entries' | 'Veterans' | 'Dogs' )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 'S':
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='w') ) {
					int LA2_4 = input.LA(3);
					if ( (LA2_4=='e') ) {
						int LA2_6 = input.LA(4);
						if ( (LA2_6=='e') ) {
							int LA2_8 = input.LA(5);
							if ( (LA2_8=='p') ) {
								int LA2_10 = input.LA(6);
								if ( (LA2_10=='s') ) {
									int LA2_12 = input.LA(7);
									if ( (LA2_12=='t') ) {
										int LA2_14 = input.LA(8);
										if ( (LA2_14=='a') ) {
											int LA2_16 = input.LA(9);
											if ( (LA2_16=='k') ) {
												int LA2_18 = input.LA(10);
												if ( (LA2_18=='e') ) {
													int LA2_21 = input.LA(11);
													if ( (LA2_21=='s') ) {
														int LA2_22 = input.LA(12);
														if ( (LA2_22==' ') ) {
															int LA2_23 = input.LA(13);
															if ( (LA2_23=='E') ) {
																int LA2_24 = input.LA(14);
																if ( (LA2_24=='n') ) {
																	int LA2_25 = input.LA(15);
																	if ( (LA2_25=='t') ) {
																		int LA2_26 = input.LA(16);
																		if ( (LA2_26=='r') ) {
																			int LA2_27 = input.LA(17);
																			if ( (LA2_27=='i') ) {
																				alt2=1;
																			}
																			else if ( (LA2_27=='y') ) {
																				alt2=2;
																			}
																			else {
																				int nvaeMark = input.mark();
																				try {
																					for (int nvaeConsume = 0; nvaeConsume < 17 - 1; nvaeConsume++)
																						input.consume();
																					NoViableAltException nvae =
																						new NoViableAltException("", 2, 27, input);
																					throw nvae;
																				} finally {
																					input.rewind(nvaeMark);
																				}
																			}
																		}
																		else {
																			int nvaeMark = input.mark();
																			try {
																				for (int nvaeConsume = 0; nvaeConsume < 16 - 1; nvaeConsume++)
																					input.consume();
																				NoViableAltException nvae =
																					new NoViableAltException("", 2, 26, input);
																				throw nvae;
																			} finally {
																				input.rewind(nvaeMark);
																			}
																		}
																	}
																	else {
																		int nvaeMark = input.mark();
																		try {
																			for (int nvaeConsume = 0; nvaeConsume < 15 - 1; nvaeConsume++)
																				input.consume();
																			NoViableAltException nvae =
																				new NoViableAltException("", 2, 25, input);
																			throw nvae;
																		} finally {
																			input.rewind(nvaeMark);
																		}
																	}
																}
																else {
																	int nvaeMark = input.mark();
																	try {
																		for (int nvaeConsume = 0; nvaeConsume < 14 - 1; nvaeConsume++)
																			input.consume();
																		NoViableAltException nvae =
																			new NoViableAltException("", 2, 24, input);
																		throw nvae;
																	} finally {
																		input.rewind(nvaeMark);
																	}
																}
															}
															else {
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++)
																		input.consume();
																	NoViableAltException nvae =
																		new NoViableAltException("", 2, 23, input);
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
																	new NoViableAltException("", 2, 22, input);
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
																new NoViableAltException("", 2, 21, input);
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
															new NoViableAltException("", 2, 18, input);
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
														new NoViableAltException("", 2, 16, input);
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
													new NoViableAltException("", 2, 14, input);
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
												new NoViableAltException("", 2, 12, input);
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
											new NoViableAltException("", 2, 10, input);
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
										new NoViableAltException("", 2, 8, input);
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
									new NoViableAltException("", 2, 6, input);
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
								new NoViableAltException("", 2, 4, input);
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
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'V':
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2=='e') ) {
					int LA2_5 = input.LA(3);
					if ( (LA2_5=='t') ) {
						int LA2_7 = input.LA(4);
						if ( (LA2_7=='e') ) {
							int LA2_9 = input.LA(5);
							if ( (LA2_9=='r') ) {
								int LA2_11 = input.LA(6);
								if ( (LA2_11=='a') ) {
									int LA2_13 = input.LA(7);
									if ( (LA2_13=='n') ) {
										int LA2_15 = input.LA(8);
										if ( (LA2_15=='s') ) {
											int LA2_17 = input.LA(9);
											if ( (LA2_17==' ') ) {
												alt2=3;
											}
											else {
												alt2=4;
											}
										}
										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 2, 15, input);
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
												new NoViableAltException("", 2, 13, input);
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
											new NoViableAltException("", 2, 11, input);
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
										new NoViableAltException("", 2, 9, input);
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
									new NoViableAltException("", 2, 7, input);
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
								new NoViableAltException("", 2, 5, input);
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
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:27:5: 'Sweepstakes Entries'
					{
					match("Sweepstakes Entries"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:27:27: 'Sweepstakes Entry'
					{
					match("Sweepstakes Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:27:47: 'Veterans Sweepstakes Entries'
					{
					match("Veterans Sweepstakes Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:27:78: 'Veterans'
					{
					match("Veterans"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:27:89: 'Dogs'
					{
					match("Dogs"); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_SUFFIX"

	// $ANTLR start "FRAG_BREED_NAME_ALT"
	public final void mFRAG_BREED_NAME_ALT() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:28:29: ( 'Veteran' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:28:31: 'Veteran'
			{
			match("Veteran"); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_ALT"

	// $ANTLR start "FRAG_BREED_NAME_SINGLE"
	public final void mFRAG_BREED_NAME_SINGLE() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:30:2: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Black and Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Silky Terrier' | 'Skye Terrier' | 'Smooth Fox Terrier' | 'Soft Coated Wheaten Terrier' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt3=176;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:30:3: 'Affenpinscher'
					{
					match("Affenpinscher"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:31:2: 'Afghan Hound'
					{
					match("Afghan Hound"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:32:2: 'Airedale Terrier'
					{
					match("Airedale Terrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:33:2: 'Akita'
					{
					match("Akita"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:34:2: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:35:2: 'American English Coonhound'
					{
					match("American English Coonhound"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:36:2: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:37:2: 'American Foxhound'
					{
					match("American Foxhound"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:38:2: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:39:2: 'American Water Spaniel'
					{
					match("American Water Spaniel"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:40:2: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:41:2: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:42:2: 'Australian Shepherd'
					{
					match("Australian Shepherd"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:43:2: 'Australian Terrier'
					{
					match("Australian Terrier"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:44:2: 'Basenji'
					{
					match("Basenji"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:45:2: 'Basset Hound'
					{
					match("Basset Hound"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:46:2: 'Beagle'
					{
					match("Beagle"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:47:2: 'Bearded Collie'
					{
					match("Bearded Collie"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:48:2: 'Beauceron'
					{
					match("Beauceron"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:49:2: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:50:2: 'Belgian Malinois'
					{
					match("Belgian Malinois"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:51:2: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:52:2: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:53:2: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:54:2: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:55:2: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:56:2: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:57:2: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:58:2: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:59:2: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:60:2: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:61:2: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:62:2: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:63:2: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:64:2: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:65:2: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:66:2: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:67:2: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:68:2: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:69:2: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:70:2: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:71:2: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:72:2: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:73:2: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:74:2: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:75:2: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:76:2: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:77:2: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:78:2: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:79:2: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:80:2: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:81:2: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:82:2: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:83:2: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:84:2: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:85:2: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:86:2: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:87:2: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:88:2: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:89:2: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:90:2: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:91:2: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:92:2: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:93:2: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:94:2: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:95:2: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:96:2: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:97:2: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:98:2: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:99:2: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:100:2: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:101:2: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:102:2: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:103:2: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:104:2: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:105:2: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:106:2: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:107:2: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:108:2: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:109:2: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:110:2: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:111:2: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:112:2: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:113:2: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:114:2: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:115:2: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:116:2: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:117:2: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:118:2: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:119:2: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:120:2: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:121:2: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:122:2: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:123:2: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:124:2: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:125:2: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:126:2: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:127:2: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:128:2: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:129:2: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:130:2: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:131:2: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:132:2: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:133:2: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:134:2: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:135:2: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:136:2: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:137:2: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:138:2: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:139:2: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:140:2: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:141:2: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:142:2: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:143:2: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:144:2: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:145:2: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:146:2: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:147:2: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:148:2: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:149:2: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:150:2: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:151:2: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:152:2: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:153:2: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:154:2: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:155:2: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:156:2: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:157:2: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:158:2: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:159:2: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:160:2: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:161:2: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:162:2: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:163:2: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:164:2: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:165:2: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:166:2: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:167:2: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:168:2: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:169:2: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:170:2: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:171:2: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:172:2: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:173:2: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:174:2: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:175:2: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:176:2: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:177:2: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:178:2: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:179:2: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:180:2: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:181:2: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:182:2: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:183:2: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:184:2: 'Smooth Fox Terrier'
					{
					match("Smooth Fox Terrier"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:185:2: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:186:2: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:187:2: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:188:2: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:189:2: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:190:2: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:191:2: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:192:2: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:193:2: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:194:2: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:195:2: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:196:2: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:197:2: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:198:2: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:199:2: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:200:2: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:201:2: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:202:2: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:203:2: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:204:2: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:205:2: 'Yorkshire Terrier'
					{
					match("Yorkshire Terrier"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_SINGLE"

	// $ANTLR start "FRAG_JUNIOR_CLASS"
	public final void mFRAG_JUNIOR_CLASS() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:208:2: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Itermediate' )
			int alt4=7;
			switch ( input.LA(1) ) {
			case 'M':
				{
				alt4=1;
				}
				break;
			case 'O':
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2=='p') ) {
					int LA4_4 = input.LA(3);
					if ( (LA4_4=='e') ) {
						int LA4_6 = input.LA(4);
						if ( (LA4_6=='n') ) {
							int LA4_8 = input.LA(5);
							if ( (LA4_8==' ') ) {
								switch ( input.LA(6) ) {
								case 'S':
									{
									alt4=2;
									}
									break;
								case 'I':
									{
									alt4=3;
									}
									break;
								case 'J':
									{
									alt4=4;
									}
									break;
								default:
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 4, 10, input);
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
										new NoViableAltException("", 4, 8, input);
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
									new NoViableAltException("", 4, 6, input);
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
								new NoViableAltException("", 4, 4, input);
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
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3=='o') ) {
					int LA4_5 = input.LA(3);
					if ( (LA4_5=='v') ) {
						int LA4_7 = input.LA(4);
						if ( (LA4_7=='i') ) {
							int LA4_9 = input.LA(5);
							if ( (LA4_9=='c') ) {
								int LA4_11 = input.LA(6);
								if ( (LA4_11=='e') ) {
									int LA4_15 = input.LA(7);
									if ( (LA4_15==' ') ) {
										switch ( input.LA(8) ) {
										case 'S':
											{
											alt4=5;
											}
											break;
										case 'J':
											{
											alt4=6;
											}
											break;
										case 'I':
											{
											alt4=7;
											}
											break;
										default:
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 4, 16, input);
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
												new NoViableAltException("", 4, 15, input);
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
											new NoViableAltException("", 4, 11, input);
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
										new NoViableAltException("", 4, 9, input);
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
									new NoViableAltException("", 4, 7, input);
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
								new NoViableAltException("", 4, 5, input);
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
							new NoViableAltException("", 4, 3, input);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:208:4: 'Master Class'
					{
					match("Master Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:209:3: 'Open Senior'
					{
					match("Open Senior"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:210:3: 'Open Intermediate'
					{
					match("Open Intermediate"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:211:3: 'Open Junior'
					{
					match("Open Junior"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:212:3: 'Novice Senior'
					{
					match("Novice Senior"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:213:3: 'Novice Junior'
					{
					match("Novice Junior"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:214:3: 'Novice Itermediate'
					{
					match("Novice Itermediate"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_JUNIOR_CLASS"

	// $ANTLR start "FRAG_MONTH"
	public final void mFRAG_MONTH() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:216:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt5=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt5=1;
					}
					break;
				case 'A':
					{
					alt5=2;
					}
					break;
				case 'u':
					{
					int LA5_11 = input.LA(3);
					if ( (LA5_11=='n') ) {
						alt5=11;
					}
					else if ( (LA5_11=='l') ) {
						alt5=13;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 5, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'U':
					{
					int LA5_12 = input.LA(3);
					if ( (LA5_12=='N') ) {
						alt5=12;
					}
					else if ( (LA5_12=='L') ) {
						alt5=14;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 5, 12, input);
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
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2=='e') ) {
					alt5=3;
				}
				else if ( (LA5_2=='E') ) {
					alt5=4;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3=='a') ) {
					int LA5_15 = input.LA(3);
					if ( (LA5_15=='r') ) {
						alt5=5;
					}
					else if ( (LA5_15=='y') ) {
						alt5=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 5, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA5_3=='A') ) {
					int LA5_16 = input.LA(3);
					if ( (LA5_16=='R') ) {
						alt5=6;
					}
					else if ( (LA5_16=='Y') ) {
						alt5=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 5, 16, input);
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
							new NoViableAltException("", 5, 3, input);
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
					alt5=7;
					}
					break;
				case 'P':
					{
					alt5=8;
					}
					break;
				case 'u':
					{
					alt5=15;
					}
					break;
				case 'U':
					{
					alt5=16;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA5_5 = input.LA(2);
				if ( (LA5_5=='e') ) {
					alt5=17;
				}
				else if ( (LA5_5=='E') ) {
					alt5=18;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				int LA5_6 = input.LA(2);
				if ( (LA5_6=='c') ) {
					alt5=19;
				}
				else if ( (LA5_6=='C') ) {
					alt5=20;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA5_7 = input.LA(2);
				if ( (LA5_7=='o') ) {
					alt5=21;
				}
				else if ( (LA5_7=='O') ) {
					alt5=22;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA5_8 = input.LA(2);
				if ( (LA5_8=='e') ) {
					alt5=23;
				}
				else if ( (LA5_8=='E') ) {
					alt5=24;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:216:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:216:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:217:8: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:217:19: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:218:8: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:218:16: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:219:8: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:219:16: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:220:8: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:220:14: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:221:8: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:221:15: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:222:8: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:222:15: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:223:8: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:223:17: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:224:8: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:224:20: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:225:8: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:225:18: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:226:8: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:226:19: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:227:8: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:227:19: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:229:26: ( ( '(' . ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:229:28: ( '(' . )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:229:28: ( '(' . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:229:29: '(' .
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:230:27: ( ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:230:29: ')'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:231:26: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:232:21: ( 'RING' | 'Ring' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='R') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='I') ) {
					alt6=1;
				}
				else if ( (LA6_1=='i') ) {
					alt6=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:232:23: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:232:30: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:233:26: ( ',' | '_' | '-' | ';' | ':' | '\\'' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:236:2: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:236:4: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:239:5: ( 'am' | 'pm' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='a') ) {
				alt7=1;
			}
			else if ( (LA7_0=='p') ) {
				alt7=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:239:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:239:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:242:2: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' )
			int alt8=9;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='M') ) {
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA8_3 = input.LA(3);
					if ( (LA8_3=='S') ) {
						alt8=3;
					}
					else {
						alt8=1;
					}
					}
					break;
				case 'r':
					{
					int LA8_4 = input.LA(3);
					if ( (LA8_4=='s') ) {
						alt8=4;
					}
					else {
						alt8=2;
					}
					}
					break;
				case 'S':
					{
					alt8=5;
					}
					break;
				case 's':
					{
					alt8=6;
					}
					break;
				case 'I':
					{
					alt8=7;
					}
					break;
				case 'i':
					{
					alt8=8;
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
			else if ( (LA8_0=='D') ) {
				alt8=9;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:242:4: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:242:9: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:243:3: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:243:9: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:244:3: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:244:8: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:245:3: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:245:10: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:246:4: 'DR'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:249:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt9=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt9=1;
					}
					break;
				case 'U':
					{
					alt9=2;
					}
					break;
				case 'a':
					{
					alt9=13;
					}
					break;
				case 'A':
					{
					alt9=14;
					}
					break;
				default:
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
				break;
			case 'M':
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2=='o') ) {
					alt9=3;
				}
				else if ( (LA9_2=='O') ) {
					alt9=4;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
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
					alt9=5;
					}
					break;
				case 'U':
					{
					alt9=6;
					}
					break;
				case 'h':
					{
					alt9=9;
					}
					break;
				case 'H':
					{
					alt9=10;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'W':
				{
				int LA9_4 = input.LA(2);
				if ( (LA9_4=='e') ) {
					alt9=7;
				}
				else if ( (LA9_4=='E') ) {
					alt9=8;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA9_5 = input.LA(2);
				if ( (LA9_5=='r') ) {
					alt9=11;
				}
				else if ( (LA9_5=='R') ) {
					alt9=12;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:249:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:249:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:250:6: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:250:15: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:251:6: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:251:16: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:252:6: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:252:18: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:253:6: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:253:17: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:254:6: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:254:15: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:255:6: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:255:17: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:259:2: ( ( WORD | INT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:259:4: ( WORD | INT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:259:4: ( WORD | INT )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= '&' && LA10_0 <= '\'')||(LA10_0 >= ',' && LA10_0 <= '-')||(LA10_0 >= ':' && LA10_0 <= ';')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
				alt10=1;
			}
			else if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
				alt10=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:259:5: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:259:10: INT
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

	// $ANTLR start "JUDGE"
	public final void mJUDGE() throws RecognitionException {
		try {
			int _type = JUDGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:264:7: ( FRAG_TITLE ( WS WORD | PARENTHETICAL )+ WS PARENTHETICAL_INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:264:9: FRAG_TITLE ( WS WORD | PARENTHETICAL )+ WS PARENTHETICAL_INT
			{
			mFRAG_TITLE(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:264:20: ( WS WORD | PARENTHETICAL )+
			int cnt11=0;
			loop11:
			do {
				int alt11=3;
				alt11 = dfa11.predict(input);
				switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:264:21: WS WORD
					{
					mWS(); 

					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:264:29: PARENTHETICAL
					{
					mPARENTHETICAL(); 

					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
						EarlyExitException eee =
							new EarlyExitException(11, input);
						throw eee;
				}
				cnt11++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:266:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:266:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:266:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt12=0;
			loop12:
			do {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
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
					if ( cnt12 >= 1 ) break loop12;
						EarlyExitException eee =
							new EarlyExitException(12, input);
						throw eee;
				}
				cnt12++;
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

	// $ANTLR start "JUNIOR_RING"
	public final void mJUNIOR_RING() throws RecognitionException {
		try {
			int _type = JUNIOR_RING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:268:12: ( INT WS FRAG_JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:268:14: INT WS FRAG_JUNIOR_CLASS
			{
			mINT(); 

			mWS(); 

			mFRAG_JUNIOR_CLASS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JUNIOR_RING"

	// $ANTLR start "BREED_RING"
	public final void mBREED_RING() throws RecognitionException {
		try {
			int _type = BREED_RING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:12: ( INT WS ( FRAG_BREED_NAME_SINGLE | ( FRAG_BREED_NAME_PLURAL ( WS FRAG_BREED_NAME_SUFFIX )+ ) ) | ( FRAG_BREED_NAME_PLURAL WS BREED_COUNT ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= 'A' && LA15_0 <= 'P')||(LA15_0 >= 'R' && LA15_0 <= 'T')||(LA15_0 >= 'V' && LA15_0 <= 'Y')) ) {
				alt15=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:14: INT WS ( FRAG_BREED_NAME_SINGLE | ( FRAG_BREED_NAME_PLURAL ( WS FRAG_BREED_NAME_SUFFIX )+ ) )
					{
					mINT(); 

					mWS(); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:21: ( FRAG_BREED_NAME_SINGLE | ( FRAG_BREED_NAME_PLURAL ( WS FRAG_BREED_NAME_SUFFIX )+ ) )
					int alt14=2;
					alt14 = dfa14.predict(input);
					switch (alt14) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:22: FRAG_BREED_NAME_SINGLE
							{
							mFRAG_BREED_NAME_SINGLE(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:47: ( FRAG_BREED_NAME_PLURAL ( WS FRAG_BREED_NAME_SUFFIX )+ )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:47: ( FRAG_BREED_NAME_PLURAL ( WS FRAG_BREED_NAME_SUFFIX )+ )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:48: FRAG_BREED_NAME_PLURAL ( WS FRAG_BREED_NAME_SUFFIX )+
							{
							mFRAG_BREED_NAME_PLURAL(); 

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:71: ( WS FRAG_BREED_NAME_SUFFIX )+
							int cnt13=0;
							loop13:
							do {
								int alt13=2;
								int LA13_0 = input.LA(1);
								if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
									alt13=1;
								}

								switch (alt13) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:270:72: WS FRAG_BREED_NAME_SUFFIX
									{
									mWS(); 

									mFRAG_BREED_NAME_SUFFIX(); 

									}
									break;

								default :
									if ( cnt13 >= 1 ) break loop13;
										EarlyExitException eee =
											new EarlyExitException(13, input);
										throw eee;
								}
								cnt13++;
							} while (true);

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:271:10: ( FRAG_BREED_NAME_PLURAL WS BREED_COUNT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:271:10: ( FRAG_BREED_NAME_PLURAL WS BREED_COUNT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:271:11: FRAG_BREED_NAME_PLURAL WS BREED_COUNT
					{
					mFRAG_BREED_NAME_PLURAL(); 

					mWS(); 

					mBREED_COUNT(); 

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
	// $ANTLR end "BREED_RING"

	// $ANTLR start "RING_TITLE"
	public final void mRING_TITLE() throws RecognitionException {
		try {
			int _type = RING_TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:274:13: ( 'RING' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:274:17: 'RING' WS INT
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

	// $ANTLR start "BREED_COUNT"
	public final void mBREED_COUNT() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:277:23: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:277:27: INT '-' INT '-' INT '-' INT
			{
			mINT(); 

			match('-'); 
			mINT(); 

			match('-'); 
			mINT(); 

			match('-'); 
			mINT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREED_COUNT"

	// $ANTLR start "TIME"
	public final void mTIME() throws RecognitionException {
		try {
			int _type = TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:278:9: ( INT ':' INT ( WS )? FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:278:13: INT ':' INT ( WS )? FRAG_TIME_LABEL
			{
			mINT(); 

			match(':'); 
			mINT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:278:25: ( WS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:278:25: WS
					{
					mWS(); 

					}
					break;

			}

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:280:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:280:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:282:9: ( '.' ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:282:11: '.' ( '.' )+
			{
			match('.'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:282:15: ( '.' )+
			int cnt17=0;
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='.') ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:282:15: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
						EarlyExitException eee =
							new EarlyExitException(17, input);
						throw eee;
				}
				cnt17++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:283:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:283:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:283:6: ( '0' .. '9' )+
			int cnt18=0;
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
					alt18=1;
				}

				switch (alt18) {
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
					if ( cnt18 >= 1 ) break loop18;
						EarlyExitException eee =
							new EarlyExitException(18, input);
						throw eee;
				}
				cnt18++;
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

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			int _type = WORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:284:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:284:9: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:284:9: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt19=0;
			loop19:
			do {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '&' && LA19_0 <= '\'')||(LA19_0 >= ',' && LA19_0 <= '-')||(LA19_0 >= ':' && LA19_0 <= ';')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
					alt19=1;
				}

				switch (alt19) {
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
					if ( cnt19 >= 1 ) break loop19;
						EarlyExitException eee =
							new EarlyExitException(19, input);
						throw eee;
				}
				cnt19++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:284:65: ( END_PUNCTUATION )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='!'||LA20_0=='.'||LA20_0=='?') ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
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
	// $ANTLR end "WORD"

	// $ANTLR start "PARENTHETICAL"
	public final void mPARENTHETICAL() throws RecognitionException {
		try {
			int _type = PARENTHETICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:2: ( FRAG_PAREN_LEFT ( ( WORD | INT ) ( WS )? )+ FRAG_PAREN_RIGHT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:4: FRAG_PAREN_LEFT ( ( WORD | INT ) ( WS )? )+ FRAG_PAREN_RIGHT
			{
			mFRAG_PAREN_LEFT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:20: ( ( WORD | INT ) ( WS )? )+
			int cnt23=0;
			loop23:
			do {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= '&' && LA23_0 <= '\'')||(LA23_0 >= ',' && LA23_0 <= '-')||(LA23_0 >= '0' && LA23_0 <= ';')||(LA23_0 >= 'A' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'z')) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:21: ( WORD | INT ) ( WS )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:21: ( WORD | INT )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( ((LA21_0 >= '&' && LA21_0 <= '\'')||(LA21_0 >= ',' && LA21_0 <= '-')||(LA21_0 >= ':' && LA21_0 <= ';')||(LA21_0 >= 'A' && LA21_0 <= 'Z')||LA21_0=='_'||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {
						alt21=1;
					}
					else if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
						alt21=2;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:22: WORD
							{
							mWORD(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:27: INT
							{
							mINT(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:32: ( WS )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||LA22_0=='\r'||LA22_0==' ') ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:288:32: WS
							{
							mWS(); 

							}
							break;

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

			mFRAG_PAREN_RIGHT(); 

			}

			state.type = _type;
			state.channel = _channel;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:2: ( '(' ( WS )? ( '0' .. '9' )+ ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:4: '(' ( WS )? ( '0' .. '9' )+ ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:8: ( WS )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= '\t' && LA24_0 <= '\n')||LA24_0=='\r'||LA24_0==' ') ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:8: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:12: ( '0' .. '9' )+
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
					if ( cnt25 >= 1 ) break loop25;
						EarlyExitException eee =
							new EarlyExitException(25, input);
						throw eee;
				}
				cnt25++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:22: ( WS )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||LA26_0=='\r'||LA26_0==' ') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:291:22: WS
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:8: ( JUDGE | WS | JUNIOR_RING | BREED_RING | RING_TITLE | TIME | DATE | ELLIPSIS | INT | WORD | PARENTHETICAL | PARENTHETICAL_INT )
		int alt27=12;
		alt27 = dfa27.predict(input);
		switch (alt27) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:10: JUDGE
				{
				mJUDGE(); 

				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:16: WS
				{
				mWS(); 

				}
				break;
			case 3 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:19: JUNIOR_RING
				{
				mJUNIOR_RING(); 

				}
				break;
			case 4 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:31: BREED_RING
				{
				mBREED_RING(); 

				}
				break;
			case 5 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:42: RING_TITLE
				{
				mRING_TITLE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:53: TIME
				{
				mTIME(); 

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:58: DATE
				{
				mDATE(); 

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:63: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:72: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:76: WORD
				{
				mWORD(); 

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:81: PARENTHETICAL
				{
				mPARENTHETICAL(); 

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\dogshowcombo.g:1:95: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA14 dfa14 = new DFA14(this);
	protected DFA27 dfa27 = new DFA27(this);
	static final String DFA3_eotS =
		"\u0159\uffff";
	static final String DFA3_eofS =
		"\u0159\uffff";
	static final String DFA3_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\1\141\1\145\1\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff"+
		"\1\145\1\uffff\2\163\1\141\1\uffff\1\141\1\162\1\141\1\154\1\151\1\uffff"+
		"\1\145\1\uffff\1\143\1\uffff\1\143\1\142\1\147\1\145\2\uffff\1\162\2\uffff"+
		"\1\154\1\145\1\162\2\uffff\1\151\1\uffff\1\145\2\uffff\1\142\3\uffff\1"+
		"\154\1\156\1\141\1\162\2\uffff\1\160\1\153\2\uffff\1\151\1\147\5\uffff"+
		"\1\151\1\150\1\uffff\1\145\1\142\4\uffff\1\141\2\uffff\1\142\2\uffff\1"+
		"\151\1\uffff\1\162\2\uffff\1\162\1\164\1\145\1\147\1\uffff\1\147\1\uffff"+
		"\1\143\2\uffff\1\144\5\uffff\1\141\1\uffff\1\154\1\uffff\1\141\3\uffff"+
		"\1\150\10\uffff\1\154\2\uffff\1\156\1\155\2\uffff\1\141\2\uffff\1\163"+
		"\7\uffff\1\151\2\uffff\1\146\21\uffff\1\164\1\uffff\1\142\2\uffff\1\146"+
		"\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162\5\uffff\1\151\1\153\1\145"+
		"\3\uffff\1\40\3\uffff\1\145\2\151\1\141\1\164\1\uffff\1\150\1\141\1\uffff"+
		"\1\145\1\164\4\uffff\1\164\1\150\1\40\1\143\2\141\1\40\1\162\3\uffff\3"+
		"\163\1\156\2\40\1\164\1\147\1\uffff\1\151\1\141\1\40\2\uffff\1\141\1\154"+
		"\1\156\1\122\1\40\1\145\2\150\1\40\1\104\1\uffff\1\122\1\165\1\151\1\163"+
		"\1\156\1\123\1\156\1\151\1\40\2\uffff\1\103\3\40\1\120\5\uffff\1\141\1"+
		"\162\1\141\1\150\1\40\2\uffff\1\40\1\141\1\115\2\uffff\2\103\1\114\1\uffff"+
		"\1\150\3\uffff\1\145\1\156\1\40\1\115\1\105\1\156\7\uffff\1\145\3\uffff"+
		"\1\145\2\40\1\104\3\uffff\1\156\3\uffff\1\40\4\uffff\2\102\4\uffff\1\103"+
		"\11\uffff";
	static final String DFA3_maxS =
		"\1\131\3\165\1\157\1\156\2\162\1\141\1\164\1\uffff\1\165\1\u00f6\1\151"+
		"\1\157\1\164\1\171\1\165\1\167\1\162\1\uffff\1\151\2\uffff\1\147\3\uffff"+
		"\1\145\1\uffff\2\163\1\162\1\uffff\1\165\1\171\1\165\1\154\1\166\1\uffff"+
		"\1\157\1\uffff\1\154\1\uffff\1\156\1\147\1\164\1\156\2\uffff\1\162\2\uffff"+
		"\1\162\1\145\1\166\2\uffff\1\151\1\uffff\1\162\2\uffff\1\153\3\uffff\1"+
		"\163\1\156\1\167\1\166\2\uffff\1\162\1\164\2\uffff\1\162\1\154\5\uffff"+
		"\1\155\1\157\1\uffff\1\151\1\154\4\uffff\1\141\2\uffff\1\142\2\uffff\1"+
		"\163\1\uffff\1\162\2\uffff\1\162\1\164\1\163\1\165\1\uffff\1\147\1\uffff"+
		"\1\143\2\uffff\1\172\5\uffff\1\164\1\uffff\1\154\1\uffff\1\145\3\uffff"+
		"\1\156\10\uffff\1\154\2\uffff\1\156\1\155\2\uffff\1\171\2\uffff\1\163"+
		"\7\uffff\1\151\2\uffff\1\167\21\uffff\1\164\1\uffff\1\150\2\uffff\1\156"+
		"\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162\5\uffff\1\151\1\153\1\145"+
		"\3\uffff\1\155\3\uffff\1\145\2\151\1\141\1\164\1\uffff\1\150\1\141\1\uffff"+
		"\1\151\1\164\4\uffff\1\164\2\150\1\143\2\141\1\40\1\162\3\uffff\3\163"+
		"\1\156\1\145\1\40\1\164\1\147\1\uffff\1\151\1\141\1\40\2\uffff\1\141\1"+
		"\154\1\156\1\141\1\40\1\145\2\150\1\40\1\120\1\uffff\1\127\1\165\1\151"+
		"\1\163\1\156\1\124\1\156\1\151\1\40\2\uffff\1\124\3\40\1\127\5\uffff\1"+
		"\157\1\162\1\141\1\150\1\40\2\uffff\1\40\1\141\1\124\2\uffff\1\123\1\124"+
		"\1\123\1\uffff\1\150\3\uffff\1\145\1\156\1\40\1\124\1\127\1\156\7\uffff"+
		"\1\160\3\uffff\1\157\2\40\1\124\3\uffff\1\163\3\uffff\1\40\4\uffff\1\123"+
		"\1\114\4\uffff\1\124\11\uffff";
	static final String DFA3_acceptS =
		"\12\uffff\1\141\11\uffff\1\u00a7\1\uffff\1\u00af\1\u00b0\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\13\3\uffff\1\31\5\uffff\1\61\1\uffff\1\67\1\uffff\1\72"+
		"\4\uffff\1\111\1\112\1\uffff\1\117\1\120\3\uffff\1\131\1\132\1\uffff\1"+
		"\140\1\uffff\1\144\1\145\1\uffff\1\150\1\151\1\152\4\uffff\1\171\1\172"+
		"\2\uffff\1\u0080\1\u0081\2\uffff\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d"+
		"\2\uffff\1\u0094\2\uffff\1\u009a\1\u009b\1\u009c\1\u009d\1\uffff\1\u00a0"+
		"\1\u00a1\1\uffff\1\u00a5\1\u00a6\1\uffff\1\u00ac\1\uffff\1\1\1\2\4\uffff"+
		"\1\24\1\uffff\1\30\1\uffff\1\34\1\35\1\uffff\1\41\1\42\1\43\1\44\1\45"+
		"\1\uffff\1\50\1\uffff\1\54\1\uffff\1\57\1\60\1\62\1\uffff\1\66\1\70\1"+
		"\71\1\73\1\74\1\75\1\76\1\77\1\uffff\1\105\1\106\2\uffff\1\121\1\122\1"+
		"\uffff\1\127\1\130\1\uffff\1\142\1\143\1\146\1\147\1\153\1\154\1\155\1"+
		"\uffff\1\161\1\162\1\uffff\1\170\1\173\1\174\1\175\1\176\1\177\1\u0082"+
		"\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u008e\1\u008f\1\u0090"+
		"\1\u0091\1\uffff\1\u0095\1\uffff\1\u0098\1\u0099\2\uffff\1\u00a8\1\uffff"+
		"\1\u00ab\3\uffff\1\17\1\20\1\21\1\22\1\23\3\uffff\1\40\1\46\1\47\1\uffff"+
		"\1\55\1\56\1\63\5\uffff\1\126\2\uffff\1\163\2\uffff\1\u0096\1\u0097\1"+
		"\u009e\1\u009f\10\uffff\1\51\1\52\1\53\10\uffff\1\167\3\uffff\1\u00ad"+
		"\1\u00ae\12\uffff\1\125\11\uffff\1\32\1\33\5\uffff\1\123\1\124\1\133\1"+
		"\134\1\135\5\uffff\1\u00a9\1\u00aa\3\uffff\1\36\1\37\3\uffff\1\113\1\uffff"+
		"\1\116\1\136\1\137\6\uffff\1\25\1\26\1\27\1\64\1\65\1\100\1\101\1\uffff"+
		"\1\104\1\107\1\110\4\uffff\1\u00a2\1\u00a3\1\u00a4\1\uffff\1\10\1\11\1"+
		"\12\1\uffff\1\102\1\103\1\114\1\115\2\uffff\1\u0092\1\u0093\1\6\1\7\1"+
		"\uffff\1\156\1\157\1\160\1\164\1\165\1\166\1\14\1\15\1\16";
	static final String DFA3_specialS =
		"\u0159\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\20\1\uffff\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26\1\27",
			"\1\30\2\uffff\1\31\1\uffff\1\32\1\33\1\34\1\35\6\uffff\1\36",
			"\1\37\3\uffff\1\40\3\uffff\1\41\2\uffff\1\42\2\uffff\1\43\2\uffff\1"+
			"\44\2\uffff\1\45",
			"\1\46\3\uffff\1\47\2\uffff\1\50\3\uffff\1\51\2\uffff\1\52\5\uffff\1"+
			"\53",
			"\1\54\15\uffff\1\55",
			"\1\56",
			"\1\57\2\uffff\1\60\5\uffff\1\61",
			"\1\62\3\uffff\1\63\2\uffff\1\64\2\uffff\1\65\2\uffff\1\66",
			"\1\67",
			"\1\70\1\71\16\uffff\1\72\1\uffff\1\73",
			"",
			"\1\74\11\uffff\1\75\5\uffff\1\76",
			"\1\77\3\uffff\1\100\2\uffff\1\101\u008d\uffff\1\102",
			"\1\103\7\uffff\1\104",
			"\1\105\11\uffff\1\106",
			"\1\107\7\uffff\1\110",
			"\1\111\3\uffff\1\112\2\uffff\1\113\3\uffff\1\114\2\uffff\1\115\5\uffff"+
			"\1\116\3\uffff\1\117",
			"\1\120\2\uffff\1\121\6\uffff\1\122\5\uffff\1\123",
			"\1\124\1\uffff\1\125\1\uffff\1\126\2\uffff\1\127\1\130\1\uffff\1\131"+
			"\1\uffff\1\132\1\uffff\1\133\1\134\3\uffff\1\135\1\136\1\uffff\1\137",
			"\1\140\5\uffff\1\141\2\uffff\1\142",
			"",
			"\1\143\2\uffff\1\144\1\145",
			"",
			"",
			"\1\146\1\147",
			"",
			"",
			"",
			"\1\150",
			"",
			"\1\151",
			"\1\152",
			"\1\153\2\uffff\1\154\7\uffff\1\155\5\uffff\1\156",
			"",
			"\1\157\15\uffff\1\160\5\uffff\1\161",
			"\1\162\1\163\1\uffff\1\164\2\uffff\1\165\1\166",
			"\1\167\7\uffff\1\170\13\uffff\1\171",
			"\1\172",
			"\1\173\4\uffff\1\174\3\uffff\1\175\3\uffff\1\176",
			"",
			"\1\177\3\uffff\1\u0080\5\uffff\1\u0081",
			"",
			"\1\u0082\10\uffff\1\u0083",
			"",
			"\1\u0084\10\uffff\1\u0085\1\uffff\1\u0086",
			"\1\u0087\4\uffff\1\u0088",
			"\1\u0089\14\uffff\1\u008a",
			"\1\u008b\10\uffff\1\u008c",
			"",
			"",
			"\1\u008d",
			"",
			"",
			"\1\u008e\5\uffff\1\u008f",
			"\1\u0090",
			"\1\u0091\3\uffff\1\u0092",
			"",
			"",
			"\1\u0093",
			"",
			"\1\u0094\14\uffff\1\u0095",
			"",
			"",
			"\1\u0096\10\uffff\1\u0097",
			"",
			"",
			"",
			"\1\u0098\1\uffff\1\u0099\4\uffff\1\u009a",
			"\1\u009b",
			"\1\u009c\25\uffff\1\u009d",
			"\1\u009e\3\uffff\1\u009f",
			"",
			"",
			"\1\u00a0\1\uffff\1\u00a1",
			"\1\u00a2\1\uffff\1\u00a3\6\uffff\1\u00a4",
			"",
			"",
			"\1\u00a5\2\uffff\1\u00a6\1\u00a7\1\uffff\1\u00a8\2\uffff\1\u00a9",
			"\1\u00aa\4\uffff\1\u00ab",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ac\2\uffff\1\u00ad\1\u00ae",
			"\1\u00af\6\uffff\1\u00b0",
			"",
			"\1\u00b1\3\uffff\1\u00b2",
			"\1\u00b3\11\uffff\1\u00b4",
			"",
			"",
			"",
			"",
			"\1\u00b5",
			"",
			"",
			"\1\u00b6",
			"",
			"",
			"\1\u00b7\2\uffff\1\u00b8\6\uffff\1\u00b9",
			"",
			"\1\u00ba",
			"",
			"",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd\15\uffff\1\u00be",
			"\1\u00bf\12\uffff\1\u00c0\2\uffff\1\u00c1",
			"",
			"\1\u00c2",
			"",
			"\1\u00c3",
			"",
			"",
			"\1\u00c4\25\uffff\1\u00c5",
			"",
			"",
			"",
			"",
			"",
			"\1\u00c6\22\uffff\1\u00c7",
			"",
			"\1\u00c8",
			"",
			"\1\u00c9\3\uffff\1\u00ca",
			"",
			"",
			"",
			"\1\u00cb\5\uffff\1\u00cc",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00cd",
			"",
			"",
			"\1\u00ce",
			"\1\u00cf",
			"",
			"",
			"\1\u00d0\27\uffff\1\u00d1",
			"",
			"",
			"\1\u00d2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d3",
			"",
			"",
			"\1\u00d4\20\uffff\1\u00d5",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d6",
			"",
			"\1\u00d7\5\uffff\1\u00d8",
			"",
			"",
			"\1\u00d9\7\uffff\1\u00da",
			"\1\u00db",
			"",
			"\1\u00dc",
			"",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"",
			"",
			"",
			"\1\u00e3\103\uffff\1\u00e4\10\uffff\1\u00e5",
			"",
			"",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"",
			"\1\u00eb",
			"\1\u00ec",
			"",
			"\1\u00ed\3\uffff\1\u00ee",
			"\1\u00ef",
			"",
			"",
			"",
			"",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2\107\uffff\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"",
			"",
			"",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd\104\uffff\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"",
			"",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0109\16\uffff\1\u0108",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f\13\uffff\1\u0110",
			"",
			"\1\u0111\1\u0112\1\u0113\2\uffff\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"",
			"",
			"\1\u011e\20\uffff\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123\2\uffff\1\u0124\3\uffff\1\u0125",
			"",
			"",
			"",
			"",
			"",
			"\1\u0126\15\uffff\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"",
			"",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e\5\uffff\1\u012f\1\u0130",
			"",
			"",
			"\1\u0131\17\uffff\1\u0132",
			"\1\u0133\2\uffff\1\u0134\14\uffff\1\u0135\1\u0136",
			"\1\u0137\6\uffff\1\u0138",
			"",
			"\1\u0139",
			"",
			"",
			"",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d\5\uffff\1\u013e\1\u013f",
			"\1\u0140\1\u0141\14\uffff\1\u0142\3\uffff\1\u0143",
			"\1\u0144",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0145\12\uffff\1\u0146",
			"",
			"",
			"",
			"\1\u0147\11\uffff\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b\17\uffff\1\u014c",
			"",
			"",
			"",
			"\1\u014d\4\uffff\1\u014e",
			"",
			"",
			"",
			"\1\u014f",
			"",
			"",
			"",
			"",
			"\1\u0150\15\uffff\1\u0151\2\uffff\1\u0152",
			"\1\u0153\2\uffff\1\u0154\6\uffff\1\u0155",
			"",
			"",
			"",
			"",
			"\1\u0156\17\uffff\1\u0157\1\u0158",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "29:10: fragment FRAG_BREED_NAME_SINGLE : ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Black and Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Silky Terrier' | 'Skye Terrier' | 'Smooth Fox Terrier' | 'Soft Coated Wheaten Terrier' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' );";
		}
	}

	static final String DFA11_eotS =
		"\5\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\2\11\3\uffff";
	static final String DFA11_maxS =
		"\1\50\1\172\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\3\1\1";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\1\2\uffff\1\1\22\uffff\1\1\7\uffff\1\2",
			"\2\1\2\uffff\1\1\22\uffff\1\1\5\uffff\2\4\1\3\3\uffff\2\4\14\uffff\2"+
			"\4\5\uffff\32\4\4\uffff\1\4\1\uffff\32\4",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 264:20: ( WS WORD | PARENTHETICAL )+";
		}
	}

	static final String DFA14_eotS =
		"\u00c8\uffff\1\u0151\u0089\uffff\1\u0151\46\uffff\1\u0151\24\uffff\1\u0151"+
		"\1\uffff\1\u0151\110\uffff\1\u0151\62\uffff\1\u0151\12\uffff\1\u0151\3"+
		"\uffff\1\u0151\21\uffff\1\u0151\36\uffff\1\u0151\32\uffff\1\u0151\7\uffff"+
		"\1\u0151\24\uffff\1\u0151\17\uffff\1\u0151\22\uffff\1\u0151\42\uffff\1"+
		"\u0151\20\uffff\2\u0151\1\uffff\1\u0151\17\uffff\1\u0151\11\uffff\1\u0151"+
		"\27\uffff\1\u0151\33\uffff\1\u0151\46\uffff\1\u0151\11\uffff\1\u0151\1"+
		"\uffff\1\u0151\16\uffff\1\u0151\23\uffff\1\u0151\36\uffff\1\u0151\31\uffff"+
		"\1\u0151\2\uffff\1\u0151\3\uffff\2\u0151\27\uffff\1\u0151\31\uffff\1\u0151"+
		"\20\uffff\1\u0151\53\uffff\1\u0151\12\uffff\2\u0151\37\uffff\1\u0151\16"+
		"\uffff\2\u0151\11\uffff\1\u0151\5\uffff\1\u0151\4\uffff\1\u0151\2\uffff"+
		"\1\u0151\23\uffff\1\u0151\44\uffff\1\u0151\141\uffff\1\u0151\13\uffff"+
		"\1\u0151\6\uffff\1\u0151\11\uffff\1\u0151\42\uffff\1\u0151\2\uffff\1\u0151"+
		"\15\uffff\1\u0151\30\uffff\1\u0151\23\uffff\1\u0151\24\uffff\1\u0151\5"+
		"\uffff\1\u0151\2\uffff\1\u0151\17\uffff\1\u0151\1\uffff\1\u0151\11\uffff"+
		"\1\u0151\4\uffff\1\u0151\3\uffff\1\u0151\22\uffff\1\u0151\6\uffff\1\u0151"+
		"\5\uffff\1\u0151\15\uffff\1\u0151\20\uffff\1\u0151\10\uffff\2\u0151\1"+
		"\uffff\1\u0151\7\uffff\1\u0151\6\uffff\1\u0151\5\uffff\1\u0151\7\uffff"+
		"\1\u0151\42\uffff\1\u0151\5\uffff\1\u0151\12\uffff\1\u0151\31\uffff\1"+
		"\u0151\1\uffff\1\u0151\13\uffff\1\u0151\3\uffff\1\u0151\6\uffff\1\u0151"+
		"\11\uffff\1\u0151\3\uffff\1\u0151\12\uffff\1\u0151\12\uffff\4\u0151\6"+
		"\uffff\2\u0151\12\uffff\3\u0151\5\uffff\1\u0151\3\uffff\1\u0151\5\uffff"+
		"\1\u0151\3\uffff\1\u0151\5\uffff\1\u0151\7\uffff\1\u0151\5\uffff\1\u0151"+
		"\15\uffff\2\u0151\3\uffff\1\u0151\2\uffff\1\u0151\3\uffff\1\u0151\4\uffff"+
		"\1\u0151\21\uffff\2\u0151\15\uffff\1\u0151\20\uffff\2\u0151\2\uffff\1"+
		"\u0151\10\uffff\1\u0151\7\uffff\2\u0151\3\uffff\1\u0151\20\uffff\1\u0151"+
		"\2\uffff\3\u0151\1\uffff\1\u0151\1\uffff\2\u0151\11\uffff\2\u0151\2\uffff"+
		"\1\u0151\5\uffff\1\u0151\4\uffff\1\u0151\13\uffff\1\u0151\2\uffff\1\u0151"+
		"\5\uffff\1\u0151\1\uffff\2\u0151\7\uffff\1\u0151\13\uffff\1\u0151\2\uffff"+
		"\2\u0151\17\uffff\1\u0151\1\uffff\1\u0151\2\uffff\1\u0151\12\uffff\1\u0151"+
		"\1\uffff\1\u0151\7\uffff\1\u0151\2\uffff\1\u0151\17\uffff\2\u0151\3\uffff"+
		"\3\u0151\6\uffff\1\u0151\1\uffff\1\u0151\5\uffff\1\u0151\4\uffff\1\u0151"+
		"\12\uffff\1\u0151\10\uffff\3\u0151\10\uffff\1\u0151\6\uffff\1\u0151\10"+
		"\uffff\1\u0151\2\uffff\3\u0151\3\uffff\1\u0151\6\uffff\3\u0151\3\uffff"+
		"\1\u0151\1\uffff\1\u0151\1\uffff\1\u0151\4\uffff\1\u0151";
	static final String DFA14_eofS =
		"\u088b\uffff";
	static final String DFA14_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\141\1\145\2\141\1\145"+
		"\1\154\1\141\1\145\1\141\1\151\2\145\2\157\1\146\1\162\1\151\1\141\1\145"+
		"\1\141\2\163\1\141\1\143\1\141\1\162\1\141\1\154\1\151\1\163\1\145\1\165"+
		"\1\143\1\162\1\143\1\142\1\147\1\145\1\141\1\145\1\162\1\141\1\145\1\154"+
		"\1\145\1\162\1\151\1\145\1\151\1\141\1\160\1\145\1\155\1\166\1\142\1\157"+
		"\1\141\1\167\1\154\1\156\1\141\1\162\1\144\1\164\1\160\1\153\1\141\1\157"+
		"\1\151\1\147\1\162\1\144\1\157\1\164\1\163\1\151\1\150\1\141\1\145\1\142"+
		"\1\171\1\157\1\146\1\151\1\141\1\163\1\145\1\142\1\171\1\145\1\172\1\uffff"+
		"\2\151\1\162\1\154\1\162\1\145\1\150\1\145\1\164\1\163\1\162\2\164\1\145"+
		"\1\147\1\154\1\147\1\156\1\150\1\143\1\157\1\145\1\144\1\164\1\166\1\145"+
		"\1\153\1\143\1\141\1\163\1\154\1\162\1\141\1\144\1\141\1\153\1\163\1\150"+
		"\1\167\1\155\1\153\2\154\1\150\1\155\1\144\1\145\1\165\3\154\1\156\1\164"+
		"\1\156\1\155\2\156\2\144\1\141\1\162\1\141\1\172\1\154\1\163\1\154\1\141"+
		"\1\163\1\162\1\157\1\141\1\162\1\145\1\156\1\163\1\143\1\164\1\143\1\164"+
		"\1\151\1\160\2\146\1\141\1\40\1\145\1\151\1\163\1\151\1\142\1\151\1\162"+
		"\1\164\1\156\1\151\1\145\1\144\1\164\1\163\1\151\1\145\1\142\1\144\1\164"+
		"\1\163\1\156\1\165\1\157\1\151\1\164\1\154\1\164\1\142\1\145\1\153\1\145"+
		"\1\157\1\164\1\156\1\146\1\163\1\144\1\145\1\40\1\145\1\163\1\155\1\163"+
		"\1\164\1\160\1\145\1\157\1\153\1\156\1\141\1\144\1\141\1\153\1\151\1\157"+
		"\1\162\1\156\1\145\1\154\1\144\1\143\2\151\1\145\1\157\1\153\1\144\1\164"+
		"\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163\1\40\1\156\1\141"+
		"\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\142\1\145\1\151\1\171"+
		"\1\163\1\141\1\151\1\162\1\145\1\151\1\145\1\144\1\151\1\55\1\143\1\141"+
		"\1\164\1\40\1\145\1\157\1\164\1\150\1\151\1\156\2\141\1\150\1\151\1\156"+
		"\1\150\1\171\1\156\1\163\1\141\1\154\1\142\1\141\1\150\1\145\1\150\1\151"+
		"\1\141\3\157\1\145\1\40\1\105\1\162\1\154\1\157\1\156\1\162\1\164\1\141"+
		"\2\164\1\163\1\162\1\154\1\165\1\uffff\1\163\1\156\1\157\1\145\1\167\1"+
		"\145\1\164\1\153\1\171\1\160\1\164\1\171\1\154\1\141\1\40\1\162\1\171"+
		"\1\40\1\164\1\40\1\157\1\146\1\144\1\145\1\151\1\164\1\106\1\151\1\154"+
		"\1\141\1\150\1\40\1\160\1\40\1\151\1\163\1\160\1\156\1\141\1\163\1\141"+
		"\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163\1\156\1\40\1\150"+
		"\1\151\1\162\1\151\1\156\1\145\1\163\1\156\1\163\1\144\1\141\1\145\1\124"+
		"\1\157\1\141\1\40\1\156\1\103\1\147\1\151\1\40\1\160\1\141\1\163\1\103"+
		"\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\1\40\1\163\1\142\1\40"+
		"\1\163\1\103\1\150\1\156\1\40\1\157\2\156\1\40\1\157\2\145\2\156\1\40"+
		"\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\141\1\145\1\40\1\145\1\163"+
		"\1\145\1\146\1\164\1\154\1\165\1\154\1\147\1\143\1\123\1\156\1\150\1\154"+
		"\1\156\1\147\1\157\1\40\1\157\1\163\1\145\1\150\1\141\1\145\1\147\1\145"+
		"\1\156\1\163\1\145\1\154\1\40\1\151\1\145\1\160\1\151\1\150\1\141\1\40"+
		"\1\124\1\151\1\40\1\124\1\150\1\103\1\156\1\157\1\141\1\170\1\163\1\141"+
		"\1\157\1\156\1\141\1\162\1\40\1\110\1\145\1\106\1\141\1\164\1\150\1\151"+
		"\1\40\1\154\1\156\1\141\1\151\1\154\1\151\1\40\1\163\1\144\1\162\1\147"+
		"\1\156\1\145\1\40\1\122\1\157\1\143\1\40\1\163\1\40\1\162\1\40\1\163\1"+
		"\156\1\154\1\145\1\147\1\163\1\124\1\40\1\157\1\141\1\145\1\124\1\145"+
		"\1\150\1\145\1\150\1\162\1\40\1\163\1\103\1\165\1\151\1\40\1\141\1\144"+
		"\1\150\1\165\1\123\1\150\1\157\2\40\1\123\1\146\2\40\1\104\1\162\1\165"+
		"\1\162\1\163\1\40\1\144\1\122\1\156\1\163\1\156\1\102\1\157\1\163\1\157"+
		"\1\156\1\162\1\101\1\156\1\145\1\163\1\146\1\165\1\151\1\156\1\153\1\151"+
		"\1\150\1\143\1\147\2\157\1\40\1\145\1\153\1\102\1\150\1\162\1\40\1\156"+
		"\1\163\1\165\1\141\1\145\2\151\1\154\1\102\1\163\1\144\1\145\1\163\1\141"+
		"\1\156\1\111\1\172\1\141\1\124\1\145\1\40\1\157\1\145\2\162\1\40\1\150"+
		"\1\156\1\170\1\147\1\163\1\141\1\123\1\151\1\164\1\157\1\151\1\172\1\151"+
		"\1\156\1\110\1\145\1\40\1\156\1\141\1\151\1\163\1\110\1\40\1\157\1\164"+
		"\2\40\1\106\1\156\2\165\1\153\1\103\1\124\1\40\1\123\1\171\1\163\1\162"+
		"\1\163\1\164\1\145\1\104\1\162\1\156\1\162\1\145\1\141\1\165\1\40\1\157"+
		"\1\40\1\123\1\157\1\156\1\141\1\104\1\156\1\145\1\40\1\143\1\160\1\40"+
		"\1\141\1\102\1\120\1\143\1\40\1\122\1\123\1\141\1\171\1\40\1\156\1\163"+
		"\1\145\1\110\1\151\3\145\1\141\1\40\1\145\1\144\1\154\2\162\1\144\1\147"+
		"\1\160\2\163\1\164\1\163\1\162\1\164\1\144\1\40\1\141\1\40\1\157\1\154"+
		"\1\165\1\156\1\122\1\163\1\145\1\141\1\40\1\163\1\114\1\151\1\145\1\156"+
		"\1\40\1\141\1\154\1\40\1\145\1\163\1\162\1\150\1\155\1\144\1\156\1\165"+
		"\1\156\1\145\1\162\1\106\1\141\1\40\2\144\1\123\4\40\1\156\1\160\1\145"+
		"\1\147\1\163\1\170\1\162\1\143\1\162\1\163\1\157\1\40\1\115\1\40\1\156"+
		"\1\141\1\157\1\103\1\156\1\157\2\115\1\162\1\144\1\163\1\156\1\40\1\157"+
		"\2\145\1\144\1\160\1\163\1\40\1\162\1\151\1\162\1\157\1\163\2\40\1\162"+
		"\1\153\1\141\1\103\1\167\1\123\1\160\1\141\1\144\1\156\1\151\2\40\1\103"+
		"\1\150\1\141\1\114\1\164\1\165\1\151\1\150\1\151\1\150\1\111\2\145\1\156"+
		"\1\162\1\123\1\144\1\163\1\157\1\143\1\144\1\164\1\162\1\164\1\154\1\107"+
		"\1\40\1\163\1\165\1\163\2\40\1\145\1\163\2\145\1\141\1\154\1\124\1\156"+
		"\1\124\1\164\1\151\1\156\1\163\1\165\1\145\1\40\1\163\1\110\1\157\1\141"+
		"\1\163\1\40\1\103\1\156\1\145\1\124\1\162\1\153\3\40\1\165\1\163\1\40"+
		"\2\162\1\157\1\164\1\111\1\163\1\40\1\160\1\126\1\115\1\124\1\127\1\145"+
		"\2\162\1\150\1\40\1\145\1\165\1\145\1\143\1\165\1\124\1\141\1\105\1\40"+
		"\1\156\1\165\1\157\1\163\1\156\1\141\1\150\1\145\1\157\1\151\1\40\1\163"+
		"\1\144\1\103\1\154\2\162\1\145\1\141\1\107\1\151\1\146\1\162\1\147\1\157"+
		"\1\127\1\113\1\162\1\145\1\163\1\162\1\150\1\163\1\160\1\141\1\164\2\163"+
		"\1\156\1\120\1\102\2\157\1\145\1\157\1\145\1\156\1\141\1\160\1\145\1\154"+
		"\1\156\1\145\1\162\1\156\1\155\2\164\2\145\1\167\1\163\1\165\2\40\1\164"+
		"\1\162\1\145\1\146\1\162\1\103\1\145\1\122\1\124\1\162\1\157\1\162\1\40"+
		"\1\156\1\141\1\145\1\40\1\145\1\151\1\163\1\144\2\163\1\127\1\163\1\157"+
		"\1\167\1\156\1\145\1\123\1\157\1\40\1\162\1\145\1\156\1\145\1\104\1\124"+
		"\1\123\1\163\1\110\1\162\1\151\1\170\1\145\1\164\1\150\1\123\3\141\1\160"+
		"\2\145\1\141\1\162\1\151\1\162\1\154\1\124\1\144\1\151\1\40\1\150\1\156"+
		"\1\145\1\154\1\156\1\157\1\164\1\141\1\123\1\40\1\156\1\154\1\40\1\154"+
		"\1\145\1\162\1\165\1\163\1\124\1\151\1\163\1\157\1\154\2\162\1\163\1\156"+
		"\1\162\1\145\1\146\1\151\2\163\1\145\2\151\1\40\1\145\2\141\1\156\1\145"+
		"\1\155\1\151\1\157\1\143\1\170\1\164\1\162\1\171\1\162\1\151\1\160\1\151"+
		"\1\144\1\154\1\163\1\160\1\162\1\145\2\141\1\162\1\164\1\163\1\156\1\151"+
		"\1\156\1\123\1\141\1\145\1\151\1\162\1\150\1\145\1\150\1\40\2\145\2\163"+
		"\1\40\1\102\1\40\1\156\1\162\1\102\1\162\1\141\1\150\2\163\2\145\1\165"+
		"\1\154\1\163\1\40\1\150\1\157\1\122\1\163\1\162\1\141\1\163\3\145\1\150"+
		"\1\165\1\151\1\145\1\40\1\144\1\141\1\151\1\143\1\156\1\154\1\163\1\141"+
		"\2\162\1\154\1\163\1\156\1\151\1\141\1\145\1\40\1\156\1\124\1\145\1\144"+
		"\1\162\1\141\1\147\1\153\1\170\1\141\1\164\1\150\1\103\1\144\1\154\1\124"+
		"\1\151\1\145\1\166\1\156\1\145\2\141\1\157\3\151\1\40\2\151\1\162\1\163"+
		"\1\145\1\154\1\156\1\145\1\102\1\163\1\162\1\156\1\151\1\144\1\157\1\156"+
		"\1\162\1\153\1\150\1\164\1\151\2\40\1\145\1\160\1\164\1\40\1\144\1\143"+
		"\1\150\1\164\1\150\1\165\1\141\1\151\2\145\1\163\1\144\1\150\1\156\1\162"+
		"\1\145\1\40\1\157\1\171\1\151\1\124\1\164\1\162\1\124\1\165\1\151\1\143"+
		"\1\115\1\144\1\162\1\165\1\154\1\165\1\162\2\40\1\145\1\154\1\164\1\156"+
		"\1\141\1\127\1\145\1\156\1\151\2\162\1\145\2\162\1\145\1\163\1\145\1\162"+
		"\1\124\1\40\1\154\1\162\1\150\1\151\1\154\1\164\1\156\2\162\1\153\1\147"+
		"\1\145\1\156\1\162\1\120\1\164\1\145\1\162\1\163\1\162\1\155\1\154\1\151"+
		"\1\150\1\146\2\145\1\141\1\150\1\145\1\163\1\151\1\145\1\156\1\160\1\165"+
		"\1\164\1\163\3\156\3\145\1\106\1\145\1\146\1\163\1\162\1\163\1\147\1\162"+
		"\1\141\1\164\1\55\1\151\1\145\1\40\1\156\1\163\1\144\1\145\1\157\1\145"+
		"\1\156\1\123\1\115\1\154\1\150\1\172\1\122\1\157\1\150\1\145\1\150\1\141"+
		"\1\172\1\154\1\145\1\162\1\145\2\163\1\145\1\144\1\163\1\162\1\123\1\165"+
		"\1\150\1\156\1\145\2\162\1\145\1\154\1\156\1\150\1\141\1\163\1\151\1\150"+
		"\1\153\1\156\1\151\1\104\1\123\1\154\1\163\1\40\1\144\1\156\1\141\1\160"+
		"\1\150\1\144\1\151\1\144\3\162\1\145\1\153\1\162\1\163\1\145\1\127\1\151"+
		"\1\145\1\156\1\145\1\150\4\151\2\145\1\162\1\144\1\162\1\157\1\154\1\162"+
		"\1\163\1\151\1\165\1\151\1\155\1\157\1\146\1\162\1\160\1\164\1\145\1\162"+
		"\1\145\1\162\1\157\1\144\1\162\1\141\2\40\1\150\1\163\2\162\2\154\1\146"+
		"\1\163\1\150\1\40\1\163\1\171\1\145\1\120\1\145\1\154\1\122\1\164\1\143"+
		"\1\145\1\162\1\165\1\162\1\147\1\160\1\157\1\163\1\165\1\163\1\145\1\147"+
		"\1\145\1\162\1\141\1\151\1\145\1\40\1\166\2\163\1\40\1\145\1\40\1\163"+
		"\1\160\1\156\1\157\1\163\1\162\2\151\1\162\1\154\1\163\1\156\1\163\1\145"+
		"\1\165\1\150\1\144\1\145\1\165\1\150\1\154\1\150\1\107\1\163\1\144\1\164"+
		"\1\150\1\157\1\147\1\145\1\163\1\150\2\151\1\160\1\171\1\163\1\162\1\150"+
		"\1\141\1\40\1\141\1\154\1\165\1\146\3\145\2\162\1\163\1\40\3\151\1\162"+
		"\1\145\1\164\1\163\1\157\1\165\1\157\1\40\1\150\1\164\1\160\1\162\1\163"+
		"\1\162\1\151\1\157\1\145\1\151\1\103\1\124\1\157\2\163\1\141\1\163\1\157"+
		"\1\40\1\103\1\40\1\144\1\145\1\154\1\163\1\145\1\40\1\150\1\141\1\40\1"+
		"\156\1\163\1\145\1\141\1\165\1\156\1\164\1\163\1\162\1\144\1\151\2\162"+
		"\1\124\1\145\1\163\1\115\1\160\1\127\1\141\1\144\1\165\1\162\2\145\1\162"+
		"\1\40\1\143\1\141\1\164\1\162\1\156\1\157\1\145\1\162\1\143\1\145\2\40"+
		"\1\162\1\40\2\145\1\165\1\145\1\162\1\157\2\145\1\144\1\163\1\162\1\145"+
		"\1\156\1\102\1\165\1\163\1\156\1\146\1\154\2\162\2\40\1\127\1\145\1\156"+
		"\1\163\1\151\1\162\1\145\1\150\1\40\1\156\1\162\1\123\1\145\1\154\1\150"+
		"\2\151\1\163\1\147\2\156\1\157\1\145\1\165\2\156\1\103\1\150\1\122\1\163"+
		"\1\151\1\163\1\164\1\124\1\145\1\165\1\123\1\144\1\162\2\156\1\144\1\162"+
		"\1\163\1\40\1\162\1\145\1\163\1\145\1\162\1\157\1\144\1\150\1\156\1\163"+
		"\1\156\1\151\1\166\1\162\1\151\1\124\1\150\1\165\1\151\1\163\1\144\1\165"+
		"\1\150\1\163\1\153\1\145\1\124\1\103\1\151\1\123\2\162\1\156\1\142\1\163"+
		"\1\165\2\162\1\157\1\151\1\141\1\157\1\165\1\172\1\144\4\163\1\103\1\123"+
		"\1\150\1\162\1\164\1\145\2\163\1\40\1\104\2\144\1\160\1\162\4\145\3\163"+
		"\1\40\1\157\1\162\1\156\1\144\1\163\1\157\1\141\1\145\1\163\1\162\1\145"+
		"\1\162\1\170\1\160\1\163\1\40\1\151\1\164\1\163\1\151\1\104\1\145\1\144"+
		"\1\162\1\163\1\165\1\157\2\151\1\144\2\145\1\163\3\145\1\172\1\146\1\163"+
		"\1\156\1\165\1\40\1\160\1\145\1\157\1\146\1\150\1\40\2\144\1\141\1\156"+
		"\2\163\1\147\1\145\1\164\1\163\1\154\1\145\1\163\1\157\1\160\1\151\1\163"+
		"\1\151\1\162\1\103\1\157\2\163\1\141\1\144\1\40\3\162\1\104\1\156\1\162"+
		"\1\144\3\162\1\164\1\151\1\162\2\163\1\141\1\123\1\145\1\141\1\145\1\157"+
		"\1\144\1\40\1\162\1\156\1\147\1\164\1\145\1\163\5\162\1\145\1\146\1\144"+
		"\1\156\1\124\1\144\2\162\1\146\1\145\1\104\2\163\1\143\1\144\1\163\1\162"+
		"\1\145\1\154\1\162\1\157\1\141\1\164\1\156\1\163\1\157\1\147\1\150\1\156"+
		"\1\40\1\104\1\144\2\163\1\157\1\150\1\151\1\163\1\145\1\147\1\154\1\162"+
		"\1\145\1\162\1\156\1\160\1\154\1\151\1\166\1\147\1\40\1\120\1\151\1\164"+
		"\1\163\1\145\1\154\3\163\1\162\1\163\1\162\2\163\1\144\2\157\1\162\1\147"+
		"\1\157\1\145\1\157\1\153\2\163\1\156\1\40\1\163\2\156\1\145\1\147\1\157"+
		"\1\163\2\151\1\104\1\157\1\163\1\147\1\157\1\145\1\163\1\151\1\145\1\151"+
		"\1\166\2\151\1\141\1\163\1\156\1\145\1\163\1\120\1\157\1\145\1\141\1\40"+
		"\1\163\1\151\2\163\1\154\1\147\2\151\1\156\1\160\1\147\1\163\1\40\1\124"+
		"\1\150\1\151\2\40\1\156\1\162\1\145\1\157\1\147\1\163\1\165\1\162\3\163"+
		"\4\145\1\156\1\40\1\162\1\157\1\151\1\162\1\151\1\123\1\145\1\154\1\163"+
		"\1\145\1\163\1\40\1\144\1\163\1\124\1\145\1\157\1\145\1\124\1\107\1\150"+
		"\1\145\1\154\1\147\1\163\1\156\1\163\1\40\1\166\2\162\1\154\1\151\1\104"+
		"\1\163\1\151\1\156\1\163\1\156\1\145\1\162\1\151\1\162\1\126\1\157\1\145"+
		"\1\162\1\165\1\154\1\145\1\162\1\157\1\40\2\163\1\144\1\123\1\145\3\163"+
		"\1\145\1\157\1\156\1\164\1\40\1\164\1\163\1\156\1\163\1\145\1\147\2\162"+
		"\1\156\1\163\1\162\1\151\1\165\1\124\1\163\1\160\1\162\1\154\1\147\1\164"+
		"\1\145\1\104\1\164\1\147\1\156\1\163\1\162\1\151\1\144\1\162\1\146\1\156"+
		"\1\145\1\141\3\163\1\145\1\162\1\157\1\145\1\40\1\144\1\151\1\145\1\163"+
		"\1\151\1\146\1\144\1\162\1\156\1\162\1\163\1\147\1\162\1\122\1\u00e9\1"+
		"\145\1\162\1\145\1\157\1\163\1\162\1\151\3\163\2\145\1\162\1\163\1\162"+
		"\1\156\1\151\1\145\1\164\1\156\3\163\1\145\1\154\1\162\1\163\1\162\1\163"+
		"\1\151\1\163\1\145\1\166\1\145\1\162\1\163";
	static final String DFA14_maxS =
		"\1\131\3\165\1\157\1\156\2\162\1\141\1\164\1\141\1\165\1\u00f6\1\151\1"+
		"\157\1\164\1\171\1\165\1\167\1\162\2\151\2\157\1\147\1\162\1\151\1\141"+
		"\1\145\1\141\2\163\1\162\1\143\1\165\1\171\1\165\1\154\1\166\1\163\1\157"+
		"\1\165\1\154\1\162\1\156\1\147\1\164\1\156\1\141\1\145\1\162\1\141\1\145"+
		"\1\162\1\145\1\166\1\151\1\145\1\151\1\141\1\160\1\162\1\155\1\166\1\153"+
		"\1\157\1\141\1\167\1\163\1\156\1\167\1\166\1\144\1\164\1\162\1\164\1\141"+
		"\1\157\1\162\1\154\1\162\1\144\1\157\1\164\1\163\1\155\1\157\1\141\1\151"+
		"\1\154\1\171\1\157\1\146\1\151\1\141\1\163\1\145\1\142\1\171\1\145\1\172"+
		"\1\uffff\1\163\1\151\1\162\1\154\1\162\1\145\1\150\1\145\1\164\1\163\1"+
		"\162\2\164\1\163\1\165\1\154\1\147\1\156\1\150\1\143\1\157\1\145\1\172"+
		"\1\164\1\166\1\145\1\153\1\143\1\164\1\163\1\154\1\162\1\145\1\144\1\141"+
		"\1\153\1\163\1\156\1\167\1\155\1\153\2\154\1\150\1\155\1\144\1\145\1\165"+
		"\3\154\1\156\1\164\1\156\1\155\2\156\2\144\1\171\1\162\1\141\1\172\1\154"+
		"\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\145\1\156\1\163\1\143"+
		"\1\164\1\143\1\164\1\151\1\160\1\146\1\167\1\141\1\40\1\145\1\151\1\163"+
		"\1\151\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\163\1\151"+
		"\1\145\1\142\1\144\1\164\1\163\1\156\1\165\1\157\1\151\1\164\1\154\1\164"+
		"\1\150\1\145\1\153\1\145\1\157\1\164\2\156\1\163\1\144\1\145\1\40\1\145"+
		"\1\163\1\155\1\163\1\164\1\160\1\145\1\157\1\153\1\156\1\141\1\144\1\141"+
		"\1\153\1\151\1\157\1\162\1\156\1\145\1\154\1\144\1\143\2\151\1\145\1\157"+
		"\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163"+
		"\1\155\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\142"+
		"\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\145\1\151\1\145\1\144\1\151"+
		"\1\55\1\143\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\151\1\156\2\141"+
		"\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\154\1\142\1\141\1\150"+
		"\1\145\1\150\1\151\1\141\3\157\1\151\1\40\1\105\1\162\1\154\1\157\1\156"+
		"\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\uffff\1\163\1\156\1"+
		"\157\1\145\1\167\1\145\1\164\1\153\1\171\1\160\1\164\1\171\1\154\1\141"+
		"\1\40\1\162\1\171\1\40\1\164\1\40\1\157\1\146\1\144\1\145\1\151\1\164"+
		"\1\106\1\151\1\154\1\141\1\150\1\40\1\160\1\150\1\151\1\163\1\160\1\156"+
		"\1\141\1\163\1\141\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163"+
		"\1\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\163\1\156\1\163\1\144"+
		"\1\141\1\145\1\124\1\157\1\141\1\40\1\156\1\103\1\147\1\151\1\40\1\160"+
		"\1\141\1\163\1\103\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\1\40"+
		"\1\163\1\142\1\40\1\163\1\103\1\150\1\156\1\40\1\157\2\156\1\145\1\157"+
		"\2\145\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\141\1\145"+
		"\1\40\1\145\1\163\1\145\1\146\1\164\1\154\1\165\1\154\1\147\1\143\1\123"+
		"\1\156\1\150\1\154\1\156\1\147\1\157\1\40\1\157\1\163\1\145\1\150\1\141"+
		"\1\145\1\147\1\145\1\156\1\163\1\145\1\154\1\40\1\151\1\145\1\160\1\151"+
		"\1\150\1\141\1\40\1\124\1\151\1\40\1\124\1\150\1\103\1\156\1\157\1\141"+
		"\1\170\1\163\1\141\1\157\1\156\1\141\1\162\1\40\1\110\1\145\1\106\1\141"+
		"\1\164\1\150\1\151\1\40\1\154\1\156\1\141\1\151\1\154\1\151\1\40\1\163"+
		"\1\144\1\162\1\147\1\156\1\145\1\40\1\141\1\157\1\143\1\40\1\163\1\40"+
		"\1\162\1\40\1\163\1\156\1\154\1\145\1\147\1\163\1\124\1\40\1\157\1\141"+
		"\1\145\1\124\1\145\1\150\1\145\1\150\1\162\1\40\1\163\1\103\1\165\1\151"+
		"\1\40\1\141\1\144\1\150\1\165\1\123\1\150\1\157\2\40\1\123\1\146\2\40"+
		"\1\120\1\162\1\165\1\162\1\163\1\40\1\144\1\127\1\156\1\163\1\156\1\102"+
		"\1\157\1\163\1\157\1\156\1\162\1\101\1\156\1\145\1\163\1\146\1\165\1\151"+
		"\1\156\1\153\1\151\1\150\1\143\1\147\2\157\1\40\1\145\1\153\1\102\1\150"+
		"\1\162\1\40\1\156\1\163\1\165\1\141\1\145\2\151\1\154\1\102\1\163\1\144"+
		"\1\145\1\163\1\141\1\156\1\111\1\172\1\141\1\124\1\145\1\40\1\157\1\145"+
		"\2\162\1\40\1\150\1\156\1\170\1\147\1\163\1\141\1\124\1\151\1\164\1\157"+
		"\1\151\1\172\1\151\1\156\1\110\1\145\1\40\1\156\1\141\1\151\1\163\1\110"+
		"\1\40\1\157\1\164\2\40\1\106\1\156\2\165\1\153\2\124\1\40\1\123\1\171"+
		"\1\163\1\162\1\163\1\164\1\145\1\104\1\162\1\156\1\162\1\145\1\141\1\165"+
		"\1\40\1\157\1\40\1\123\1\157\1\156\1\141\1\104\1\156\1\145\1\40\1\143"+
		"\1\160\1\40\1\141\1\102\1\127\1\143\1\40\1\122\1\123\1\141\1\171\1\40"+
		"\1\156\1\163\1\145\1\110\1\151\3\145\1\157\1\40\1\145\1\144\1\154\2\162"+
		"\1\144\1\147\1\160\2\163\1\164\1\163\1\162\1\164\1\144\1\40\1\141\1\40"+
		"\1\157\1\154\1\165\1\156\1\122\1\163\1\145\1\141\1\40\1\163\1\114\1\151"+
		"\1\145\1\156\1\40\1\141\1\154\1\40\1\145\1\163\1\162\1\150\1\155\1\144"+
		"\1\156\1\165\1\156\1\145\1\162\1\106\1\141\1\40\2\144\1\123\4\40\1\156"+
		"\1\160\1\145\1\147\1\163\1\170\1\162\1\143\1\162\1\163\1\157\1\40\1\115"+
		"\1\40\1\156\1\141\1\157\1\103\1\156\1\157\1\124\1\115\1\162\1\144\1\163"+
		"\1\156\1\40\1\157\2\145\1\144\1\160\1\163\1\40\1\162\1\151\1\162\1\157"+
		"\1\163\2\40\1\162\1\153\1\141\1\123\1\167\1\123\1\160\1\141\1\144\1\156"+
		"\1\151\2\40\1\124\1\150\1\141\1\123\1\164\1\165\1\151\1\150\1\151\1\150"+
		"\1\111\2\145\1\156\1\162\1\123\1\144\1\163\1\157\1\143\1\144\1\164\1\162"+
		"\1\164\1\154\1\107\1\40\1\163\1\165\1\163\2\40\1\145\1\163\2\145\1\141"+
		"\1\154\1\124\1\156\1\124\1\164\1\151\1\156\1\163\1\165\1\145\1\40\1\163"+
		"\1\110\1\157\1\141\1\163\1\40\1\103\1\156\1\145\1\124\1\162\1\153\3\40"+
		"\1\165\1\163\1\40\2\162\1\157\1\164\1\111\1\163\1\40\1\160\1\126\2\124"+
		"\1\127\1\145\2\162\1\150\1\40\1\145\1\165\1\145\1\143\1\165\1\124\1\141"+
		"\1\127\1\40\1\156\1\165\1\157\1\163\1\156\1\141\1\150\1\145\1\157\1\151"+
		"\1\40\1\163\1\144\1\103\1\154\2\162\1\145\1\141\1\107\1\151\1\146\1\162"+
		"\1\147\1\157\1\127\1\113\1\162\1\145\1\163\1\162\1\150\1\163\1\160\1\141"+
		"\1\164\2\163\1\156\1\120\1\102\2\157\1\160\1\157\1\145\1\156\1\141\1\160"+
		"\1\145\1\154\1\156\1\157\1\162\1\156\1\155\2\164\2\145\1\167\1\163\1\165"+
		"\2\40\1\164\1\162\1\145\1\146\1\162\1\103\1\145\1\122\1\124\1\162\1\157"+
		"\1\162\1\40\1\156\1\141\1\145\1\40\1\145\1\151\1\163\1\144\2\163\1\127"+
		"\1\163\1\157\1\167\1\156\1\145\1\123\1\157\1\40\1\162\1\145\1\156\1\145"+
		"\2\124\1\123\1\163\1\110\1\162\1\151\1\170\1\145\1\164\1\150\1\123\3\141"+
		"\1\160\2\145\1\141\1\162\1\151\1\162\1\154\1\124\1\144\1\151\1\40\1\150"+
		"\1\156\1\145\1\154\1\163\1\157\1\164\1\141\1\123\1\40\1\156\1\154\1\40"+
		"\1\154\1\145\1\162\1\165\1\163\1\124\1\151\1\163\1\157\1\154\2\162\1\163"+
		"\1\156\1\162\1\145\1\146\1\151\2\163\1\145\2\151\1\40\1\145\2\141\1\156"+
		"\1\145\1\155\1\151\1\157\1\143\1\170\1\164\1\162\1\171\1\162\1\151\1\160"+
		"\1\151\1\144\1\154\1\163\1\160\1\162\1\145\2\141\1\162\1\164\1\163\1\156"+
		"\1\151\1\156\1\123\1\141\1\145\1\151\1\162\1\150\1\145\1\150\1\40\2\145"+
		"\2\163\1\40\1\123\1\40\1\156\1\162\1\114\1\162\1\141\1\150\2\163\2\145"+
		"\1\165\1\154\1\163\1\40\1\150\1\157\1\122\1\163\1\162\1\141\1\163\3\145"+
		"\1\150\1\165\1\151\1\145\1\40\1\144\1\141\1\151\1\143\1\156\1\154\1\163"+
		"\1\141\2\162\1\154\1\163\1\156\1\151\1\141\1\145\1\40\1\156\1\124\1\145"+
		"\1\144\1\162\1\141\1\147\1\153\1\170\1\141\1\164\1\150\1\124\1\144\1\154"+
		"\1\124\1\151\1\145\1\166\1\156\1\145\2\141\1\157\3\151\1\40\2\151\1\162"+
		"\1\163\1\145\1\154\1\156\1\145\1\102\1\163\1\162\1\156\1\151\1\144\1\157"+
		"\1\156\1\162\1\153\1\150\1\164\1\151\2\40\1\145\1\160\1\164\1\40\1\144"+
		"\1\143\1\150\1\164\1\150\1\165\1\141\1\151\2\145\1\163\1\144\1\150\1\156"+
		"\1\162\1\145\1\40\1\157\1\171\1\151\1\124\1\164\1\162\1\124\1\165\1\151"+
		"\1\143\1\115\1\144\1\162\1\165\1\154\1\165\1\162\2\40\1\145\1\154\1\164"+
		"\1\156\1\141\1\127\1\145\1\156\1\151\2\162\1\145\2\162\1\145\1\163\1\145"+
		"\1\162\1\124\1\40\1\154\1\162\1\150\1\151\1\154\1\164\1\156\2\162\1\153"+
		"\1\147\1\145\1\156\1\162\1\120\1\164\1\145\1\162\1\163\1\162\1\155\1\154"+
		"\1\151\1\150\1\146\2\145\1\141\1\150\1\145\1\163\1\151\1\145\1\156\1\160"+
		"\1\165\1\164\1\163\3\156\3\145\1\106\1\145\1\146\1\163\1\162\1\163\1\147"+
		"\1\162\1\141\1\164\1\55\1\151\1\145\1\40\1\156\1\163\1\144\1\145\1\157"+
		"\1\145\1\156\1\123\1\115\1\154\1\150\1\172\1\122\1\157\1\150\1\145\1\150"+
		"\1\141\1\172\1\154\1\145\1\162\1\145\2\163\1\145\1\144\1\163\1\162\1\123"+
		"\1\165\1\150\1\156\1\145\2\162\1\145\1\154\1\156\1\150\1\141\1\163\1\151"+
		"\1\150\1\153\1\156\1\151\1\104\1\123\1\154\1\163\1\40\1\144\1\156\1\141"+
		"\1\160\1\150\1\144\1\151\1\144\3\162\1\145\1\153\1\162\1\163\1\145\1\127"+
		"\1\151\1\145\1\156\1\145\1\150\4\151\2\145\1\162\1\144\1\162\1\157\1\154"+
		"\1\162\1\163\1\151\1\165\1\151\1\155\1\157\1\146\1\162\1\160\1\164\1\145"+
		"\1\162\1\145\1\162\1\157\1\144\1\162\1\141\2\40\1\150\1\163\2\162\2\154"+
		"\1\146\1\163\1\150\1\40\1\163\1\171\1\145\1\120\1\145\1\154\1\122\1\164"+
		"\1\143\1\145\1\162\1\165\1\162\1\147\1\160\1\157\1\163\1\165\1\163\1\145"+
		"\1\147\1\145\1\162\1\141\1\151\1\145\1\40\1\166\2\163\1\40\1\145\1\40"+
		"\1\163\1\160\1\156\1\157\1\163\1\162\2\151\1\162\1\154\1\163\1\156\1\163"+
		"\1\145\1\165\1\150\1\144\1\145\1\165\1\150\1\154\1\150\1\107\1\163\1\144"+
		"\1\164\1\150\1\157\1\147\1\145\1\163\1\150\2\151\1\160\1\171\1\163\1\162"+
		"\1\150\1\141\1\40\1\141\1\154\1\165\1\146\3\145\2\162\1\163\1\40\3\151"+
		"\1\162\1\145\1\164\1\163\1\157\1\165\1\157\1\40\1\150\1\164\1\160\1\162"+
		"\1\163\1\162\1\151\1\157\1\145\1\151\1\103\1\124\1\157\2\163\1\141\1\163"+
		"\1\157\1\40\1\103\1\40\1\144\1\145\1\154\1\163\1\145\1\40\1\150\1\141"+
		"\1\40\1\156\1\163\1\145\1\141\1\165\1\156\1\164\1\163\1\162\1\144\1\151"+
		"\2\162\1\124\1\145\1\163\1\115\1\160\1\127\1\141\1\144\1\165\1\162\2\145"+
		"\1\162\1\40\1\143\1\141\1\164\1\162\1\156\1\157\1\145\1\162\1\143\1\145"+
		"\2\40\1\162\1\40\2\145\1\165\1\145\1\162\1\157\2\145\1\144\1\163\1\162"+
		"\1\145\1\156\1\102\1\165\1\163\1\156\1\146\1\154\2\162\2\40\1\127\1\145"+
		"\1\156\1\163\1\151\1\162\1\145\1\150\1\40\1\156\1\162\1\123\1\145\1\154"+
		"\1\150\2\151\1\163\1\147\2\156\1\157\1\145\1\165\2\156\1\103\1\150\1\122"+
		"\1\163\1\151\1\163\1\164\1\124\1\145\1\165\1\123\1\144\1\162\2\156\1\144"+
		"\1\162\1\163\1\40\1\162\1\145\1\163\1\145\1\162\1\157\1\144\1\150\1\156"+
		"\1\163\1\156\1\151\1\166\1\162\1\151\1\124\1\150\1\165\1\151\1\163\1\144"+
		"\1\165\1\150\1\163\1\153\1\145\1\124\1\103\1\151\1\123\2\162\1\156\1\142"+
		"\1\163\1\165\2\162\1\157\1\151\1\141\1\157\1\165\1\172\1\144\4\163\1\103"+
		"\1\123\1\150\1\162\1\164\1\145\2\163\1\40\1\104\2\144\1\160\1\162\4\145"+
		"\3\163\1\40\1\157\1\162\1\156\1\144\1\163\1\157\1\141\1\145\1\163\1\162"+
		"\1\145\1\162\1\170\1\160\1\163\1\40\1\151\1\164\1\163\1\151\1\104\1\145"+
		"\1\144\1\162\1\163\1\165\1\157\2\151\1\144\2\145\1\163\3\145\1\172\1\146"+
		"\1\163\1\156\1\165\1\40\1\160\1\145\1\157\1\146\1\150\1\40\2\144\1\141"+
		"\1\156\2\163\1\147\1\145\1\164\1\163\1\154\1\145\1\163\1\157\1\160\1\151"+
		"\1\163\1\151\1\162\1\103\1\157\2\163\1\141\1\144\1\40\3\162\1\104\1\156"+
		"\1\162\1\144\3\162\1\164\1\151\1\162\2\163\1\141\1\123\1\145\1\141\1\145"+
		"\1\157\1\144\1\40\1\162\1\156\1\147\1\164\1\145\1\163\5\162\1\145\1\146"+
		"\1\144\1\156\1\124\1\144\2\162\1\146\1\145\1\104\2\163\1\143\1\144\1\163"+
		"\1\162\1\145\1\154\1\162\1\157\1\141\1\164\1\156\1\163\1\157\1\147\1\150"+
		"\1\156\1\40\1\104\1\144\2\163\1\157\1\150\1\151\1\163\1\145\1\147\1\154"+
		"\1\162\1\145\1\162\1\156\1\160\1\154\1\151\1\166\1\147\1\40\1\120\1\151"+
		"\1\164\1\163\1\145\1\154\3\163\1\162\1\163\1\162\2\163\1\144\2\157\1\162"+
		"\1\147\1\157\1\145\1\157\1\153\2\163\1\156\1\40\1\163\2\156\1\145\1\147"+
		"\1\157\1\163\2\151\1\104\1\157\1\163\1\147\1\157\1\145\1\163\1\151\1\145"+
		"\1\151\1\166\2\151\1\141\1\163\1\156\1\145\1\163\1\120\1\157\1\145\1\141"+
		"\1\40\1\163\1\151\2\163\1\154\1\147\2\151\1\156\1\160\1\147\1\163\1\40"+
		"\1\124\1\150\1\151\2\40\1\156\1\162\1\145\1\157\1\147\1\163\1\165\1\162"+
		"\3\163\4\145\1\156\1\40\1\162\1\157\1\151\1\162\1\151\1\123\1\145\1\154"+
		"\1\163\1\145\1\163\1\40\1\144\1\163\1\124\1\145\1\157\1\145\1\124\1\107"+
		"\1\150\1\145\1\154\1\147\1\163\1\156\1\163\1\40\1\166\2\162\1\154\1\151"+
		"\1\104\1\163\1\151\1\156\1\163\1\156\1\145\1\162\1\151\1\162\1\126\1\157"+
		"\1\145\1\162\1\165\1\154\1\145\1\162\1\157\1\40\2\163\1\144\1\123\1\145"+
		"\3\163\1\145\1\157\1\156\1\164\1\40\1\164\1\163\1\156\1\163\1\145\1\147"+
		"\2\162\1\156\1\163\1\162\1\151\1\165\1\124\1\163\1\160\1\162\1\154\1\147"+
		"\1\164\1\145\1\104\1\164\1\147\1\156\1\163\1\162\1\151\1\144\1\162\1\146"+
		"\1\156\1\145\1\141\3\163\1\145\1\162\1\157\1\145\1\40\1\144\1\151\1\145"+
		"\1\163\1\151\1\146\1\144\1\162\1\156\1\162\1\163\1\147\1\162\1\122\1\u00e9"+
		"\1\145\1\162\1\145\1\157\1\163\1\162\1\151\3\163\2\145\1\162\1\163\1\162"+
		"\1\156\1\151\1\145\1\164\1\156\3\163\1\145\1\154\1\162\1\163\1\162\1\163"+
		"\1\151\1\163\1\145\1\166\1\145\1\162\1\163";
	static final String DFA14_acceptS =
		"\145\uffff\1\2\u00eb\uffff\1\1\u0739\uffff";
	static final String DFA14_specialS =
		"\u088b\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\20\1\uffff\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26\1\27",
			"\1\30\2\uffff\1\31\1\uffff\1\32\1\33\1\34\1\35\6\uffff\1\36",
			"\1\37\3\uffff\1\40\3\uffff\1\41\2\uffff\1\42\2\uffff\1\43\2\uffff\1"+
			"\44\2\uffff\1\45",
			"\1\46\3\uffff\1\47\2\uffff\1\50\3\uffff\1\51\2\uffff\1\52\5\uffff\1"+
			"\53",
			"\1\54\15\uffff\1\55",
			"\1\56",
			"\1\57\2\uffff\1\60\5\uffff\1\61",
			"\1\62\3\uffff\1\63\2\uffff\1\64\2\uffff\1\65\2\uffff\1\66",
			"\1\67",
			"\1\70\1\71\16\uffff\1\72\1\uffff\1\73",
			"\1\74",
			"\1\75\11\uffff\1\76\5\uffff\1\77",
			"\1\100\3\uffff\1\101\2\uffff\1\102\u008d\uffff\1\103",
			"\1\104\7\uffff\1\105",
			"\1\106\11\uffff\1\107",
			"\1\110\7\uffff\1\111",
			"\1\112\3\uffff\1\113\2\uffff\1\114\3\uffff\1\115\2\uffff\1\116\5\uffff"+
			"\1\117\3\uffff\1\120",
			"\1\121\2\uffff\1\122\6\uffff\1\123\5\uffff\1\124",
			"\1\125\1\uffff\1\126\1\uffff\1\127\2\uffff\1\130\1\131\1\uffff\1\132"+
			"\1\uffff\1\133\1\uffff\1\134\1\135\3\uffff\1\136\1\137\1\uffff\1\140",
			"\1\141\5\uffff\1\142\2\uffff\1\143",
			"\1\145\3\uffff\1\144",
			"\1\146\2\uffff\1\147\1\150",
			"\1\151",
			"\1\152",
			"\1\153\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164\2\uffff\1\165\7\uffff\1\166\5\uffff\1\167",
			"\1\170",
			"\1\171\15\uffff\1\172\5\uffff\1\173",
			"\1\174\1\175\1\uffff\1\176\2\uffff\1\177\1\u0080",
			"\1\u0081\7\uffff\1\u0082\13\uffff\1\u0083",
			"\1\u0084",
			"\1\u0085\4\uffff\1\u0086\3\uffff\1\u0087\3\uffff\1\u0088",
			"\1\u0089",
			"\1\u008a\3\uffff\1\u008b\5\uffff\1\u008c",
			"\1\u008d",
			"\1\u008e\10\uffff\1\u008f",
			"\1\u0090",
			"\1\u0091\10\uffff\1\u0092\1\uffff\1\u0093",
			"\1\u0094\4\uffff\1\u0095",
			"\1\u0096\14\uffff\1\u0097",
			"\1\u0098\10\uffff\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f\5\uffff\1\u00a0",
			"\1\u00a1",
			"\1\u00a2\3\uffff\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9\14\uffff\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad\10\uffff\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2\1\uffff\1\u00b3\4\uffff\1\u00b4",
			"\1\u00b5",
			"\1\u00b6\25\uffff\1\u00b7",
			"\1\u00b8\3\uffff\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc\1\uffff\1\u00bd",
			"\1\u00be\1\uffff\1\u00bf\6\uffff\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3\2\uffff\1\u00c4\1\u00c5\1\uffff\1\u00c6\2\uffff\1\u00c7",
			"\1\u00c8\4\uffff\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf\2\uffff\1\u00d0\1\u00d1",
			"\1\u00d2\6\uffff\1\u00d3",
			"\1\u00d4",
			"\1\u00d5\3\uffff\1\u00d6",
			"\1\u00d7\11\uffff\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"",
			"\1\u00e4\2\uffff\1\u00e5\6\uffff\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3\15\uffff\1\u00f4",
			"\1\u00f5\12\uffff\1\u00f6\2\uffff\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff\25\uffff\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106\22\uffff\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b\3\uffff\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111\5\uffff\1\u0112",
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
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128\27\uffff\1\u0129",
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
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140\20\uffff\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\145",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f\5\uffff\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167\7\uffff\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
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
			"\1\u0194\103\uffff\1\u0195\10\uffff\1\u0196",
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
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce\3\uffff\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"",
			"\1\145",
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
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff\107\uffff\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\145",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
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
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\145",
			"\1\u021a",
			"\1\145",
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
			"\1\u0237",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f\104\uffff\1\u0240",
			"\1\u0241",
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
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
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"\1\145",
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
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
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
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\1\145",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\1\u029d\16\uffff\1\u029c",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\145",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
			"\1\145",
			"\1\u02a4",
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
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\145",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\u02b9",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u02bd",
			"\1\u02be",
			"\1\u02bf",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\1\u02c5",
			"\1\u02c6\13\uffff\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce\1\u02cf\1\u02d0\2\uffff\1\u02d1",
			"\1\u02d2",
			"\1\u02d3",
			"\1\u02d4",
			"\1\u02d5",
			"\1\u02d6",
			"\1\145",
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
			"\1\145",
			"\1\u02f1",
			"\1\u02f2",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\145",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
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
			"\1\145",
			"\1\u030c",
			"\1\u030d\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\u0315",
			"\1\u0316",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
			"\1\145",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327\20\uffff\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\1\u032e",
			"\1\145",
			"\1\u032f",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
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
			"\1\u0342",
			"\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\1\u0348\2\uffff\1\u0349\3\uffff\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\1\u0350",
			"\1\u0351",
			"\1\u0352",
			"\1\145",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359\15\uffff\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\1\145",
			"\1\145",
			"\1\u0364",
			"\1\145",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\u0371",
			"\1\u0372",
			"\1\u0373",
			"\1\145",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\145",
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
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\1\u038b",
			"\1\u038c",
			"\1\u038d",
			"\1\u038e",
			"\1\u038f",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"\1\145",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3\5\uffff\1\u03a4\1\u03a5",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"\1\u03b0",
			"\1\145",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc\17\uffff\1\u03bd",
			"\1\u03be",
			"\1\u03bf",
			"\1\u03c0",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\1\u03c7\2\uffff\1\u03c8\14\uffff\1\u03c9\1\u03ca",
			"\1\u03cb",
			"\1\u03cc",
			"\1\u03cd\6\uffff\1\u03ce",
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
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\1\145",
			"\1\u03dc",
			"\1\u03dd",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0",
			"\1\u03e1",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\1\145",
			"\1\u03e5",
			"\1\145",
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
			"\1\u03f0",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"\1\145",
			"\1\u03f4",
			"\1\u03f5",
			"\1\u03f6",
			"\1\u03f7",
			"\1\u03f8",
			"\1\u03f9",
			"\1\u03fa",
			"\1\u03fb",
			"\1\u03fc",
			"\1\u03fd",
			"\1\u03fe",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\1\u0405",
			"\1\u0406",
			"\1\145",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\1\u040a",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"\1\u040e",
			"\1\u040f",
			"\1\u0410",
			"\1\u0411\5\uffff\1\u0412\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"\1\u0417",
			"\1\u0418",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\1\u041c",
			"\1\u041d",
			"\1\u041e",
			"\1\u041f",
			"\1\u0420",
			"\1\u0421",
			"\1\u0422\1\u0423\14\uffff\1\u0424\3\uffff\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"\1\u0428",
			"\1\u0429",
			"\1\145",
			"\1\u042a",
			"\1\u042b",
			"\1\u042c",
			"\1\u042d",
			"\1\u042e",
			"\1\u042f",
			"\1\u0430",
			"\1\u0431",
			"\1\u0432",
			"\1\u0433",
			"\1\u0434",
			"\1\u0435",
			"\1\u0436",
			"\1\u0437",
			"\1\u0438",
			"\1\u0439",
			"\1\u043a",
			"\1\u043b",
			"\1\u043c",
			"\1\u043d",
			"\1\u043e",
			"\1\u043f",
			"\1\u0440",
			"\1\u0441",
			"\1\u0442",
			"\1\145",
			"\1\u0443",
			"\1\u0444",
			"\1\145",
			"\1\u0445",
			"\1\u0446",
			"\1\u0447",
			"\1\145",
			"\1\145",
			"\1\u0448",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d\12\uffff\1\u044e",
			"\1\u044f",
			"\1\u0450",
			"\1\u0451",
			"\1\u0452",
			"\1\u0453",
			"\1\u0454",
			"\1\u0455",
			"\1\u0456",
			"\1\u0457\11\uffff\1\u0458",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\u045d",
			"\1\u045e",
			"\1\u045f",
			"\1\u0460",
			"\1\145",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463",
			"\1\u0464",
			"\1\u0465",
			"\1\u0466",
			"\1\u0467",
			"\1\u0468",
			"\1\u0469",
			"\1\u046a",
			"\1\u046b",
			"\1\u046c",
			"\1\u046d",
			"\1\u046e",
			"\1\u046f",
			"\1\u0470",
			"\1\u0471",
			"\1\u0472",
			"\1\u0473",
			"\1\u0474",
			"\1\u0475",
			"\1\u0476",
			"\1\u0477",
			"\1\u0478",
			"\1\u0479",
			"\1\145",
			"\1\u047a",
			"\1\u047b",
			"\1\u047c",
			"\1\u047d",
			"\1\u047e",
			"\1\u047f",
			"\1\u0480",
			"\1\u0481",
			"\1\u0482",
			"\1\u0483",
			"\1\u0484",
			"\1\u0485",
			"\1\u0486",
			"\1\u0487\17\uffff\1\u0488",
			"\1\u0489",
			"\1\u048a",
			"\1\145",
			"\1\u048b",
			"\1\u048c",
			"\1\u048d",
			"\1\u048e",
			"\1\u048f",
			"\1\u0490",
			"\1\u0491",
			"\1\u0492",
			"\1\u0493",
			"\1\u0494",
			"\1\u0495",
			"\1\u0496",
			"\1\u0497",
			"\1\u0498",
			"\1\u0499",
			"\1\u049a",
			"\1\u049b",
			"\1\u049c",
			"\1\u049d",
			"\1\u049e",
			"\1\u049f",
			"\1\u04a0",
			"\1\u04a1",
			"\1\u04a2",
			"\1\u04a3",
			"\1\u04a4",
			"\1\u04a5",
			"\1\u04a6\4\uffff\1\u04a7",
			"\1\u04a8",
			"\1\u04a9",
			"\1\u04aa",
			"\1\u04ab",
			"\1\u04ac",
			"\1\u04ad",
			"\1\u04ae",
			"\1\u04af",
			"\1\u04b0",
			"\1\u04b1",
			"\1\u04b2",
			"\1\u04b3",
			"\1\u04b4",
			"\1\u04b5",
			"\1\u04b6",
			"\1\145",
			"\1\u04b7",
			"\1\u04b8",
			"\1\u04b9",
			"\1\u04ba",
			"\1\u04bb",
			"\1\u04bc",
			"\1\u04bd",
			"\1\u04be",
			"\1\u04bf",
			"\1\u04c0",
			"\1\145",
			"\1\145",
			"\1\u04c1",
			"\1\u04c2",
			"\1\u04c3",
			"\1\u04c4",
			"\1\u04c5",
			"\1\u04c6",
			"\1\u04c7",
			"\1\u04c8",
			"\1\u04c9",
			"\1\u04ca",
			"\1\u04cb",
			"\1\u04cc",
			"\1\u04cd",
			"\1\u04ce",
			"\1\u04cf",
			"\1\u04d0",
			"\1\u04d1",
			"\1\u04d2",
			"\1\u04d3",
			"\1\u04d4",
			"\1\u04d5",
			"\1\u04d6",
			"\1\u04d7",
			"\1\u04d8",
			"\1\u04d9",
			"\1\u04da",
			"\1\u04db",
			"\1\u04dc",
			"\1\u04dd",
			"\1\u04de",
			"\1\u04df",
			"\1\145",
			"\1\u04e0",
			"\1\u04e1",
			"\1\u04e2",
			"\1\u04e3",
			"\1\u04e4",
			"\1\u04e5",
			"\1\u04e6",
			"\1\u04e7",
			"\1\u04e8",
			"\1\u04e9",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"\1\u04ed",
			"\1\145",
			"\1\145",
			"\1\u04ee",
			"\1\u04ef\15\uffff\1\u04f0\2\uffff\1\u04f1",
			"\1\u04f2",
			"\1\u04f3",
			"\1\u04f4",
			"\1\u04f5\2\uffff\1\u04f6\6\uffff\1\u04f7",
			"\1\u04f8",
			"\1\u04f9",
			"\1\u04fa",
			"\1\145",
			"\1\u04fb",
			"\1\u04fc",
			"\1\u04fd",
			"\1\u04fe",
			"\1\u04ff",
			"\1\145",
			"\1\u0500",
			"\1\u0501",
			"\1\u0502",
			"\1\u0503",
			"\1\145",
			"\1\u0504",
			"\1\u0505",
			"\1\145",
			"\1\u0506",
			"\1\u0507",
			"\1\u0508",
			"\1\u0509",
			"\1\u050a",
			"\1\u050b",
			"\1\u050c",
			"\1\u050d",
			"\1\u050e",
			"\1\u050f",
			"\1\u0510",
			"\1\u0511",
			"\1\u0512",
			"\1\u0513",
			"\1\u0514",
			"\1\u0515",
			"\1\u0516",
			"\1\u0517",
			"\1\u0518",
			"\1\145",
			"\1\u0519",
			"\1\u051a",
			"\1\u051b",
			"\1\u051c",
			"\1\u051d",
			"\1\u051e",
			"\1\u051f",
			"\1\u0520",
			"\1\u0521",
			"\1\u0522",
			"\1\u0523",
			"\1\u0524",
			"\1\u0525",
			"\1\u0526",
			"\1\u0527",
			"\1\u0528",
			"\1\u0529",
			"\1\u052a\17\uffff\1\u052b\1\u052c",
			"\1\u052d",
			"\1\u052e",
			"\1\u052f",
			"\1\u0530",
			"\1\u0531",
			"\1\u0532",
			"\1\u0533",
			"\1\u0534",
			"\1\u0535",
			"\1\u0536",
			"\1\u0537",
			"\1\u0538",
			"\1\u0539",
			"\1\u053a",
			"\1\u053b",
			"\1\u053c",
			"\1\u053d",
			"\1\u053e",
			"\1\145",
			"\1\u053f",
			"\1\u0540",
			"\1\u0541",
			"\1\u0542",
			"\1\u0543",
			"\1\u0544",
			"\1\u0545",
			"\1\u0546",
			"\1\u0547",
			"\1\u0548",
			"\1\u0549",
			"\1\u054a",
			"\1\u054b",
			"\1\u054c",
			"\1\u054d",
			"\1\u054e",
			"\1\u054f",
			"\1\u0550",
			"\1\u0551",
			"\1\u0552",
			"\1\u0553",
			"\1\u0554",
			"\1\u0555",
			"\1\u0556",
			"\1\u0557",
			"\1\u0558",
			"\1\u0559",
			"\1\u055a",
			"\1\u055b",
			"\1\u055c",
			"\1\u055d",
			"\1\u055e",
			"\1\u055f",
			"\1\u0560",
			"\1\u0561",
			"\1\u0562",
			"\1\u0563",
			"\1\u0564",
			"\1\u0565",
			"\1\u0566",
			"\1\u0567",
			"\1\u0568",
			"\1\u0569",
			"\1\u056a",
			"\1\u056b",
			"\1\u056c",
			"\1\u056d",
			"\1\u056e",
			"\1\u056f",
			"\1\u0570",
			"\1\u0571",
			"\1\u0572",
			"\1\u0573",
			"\1\u0574",
			"\1\u0575",
			"\1\u0576",
			"\1\u0577",
			"\1\u0578",
			"\1\u0579",
			"\1\u057a",
			"\1\u057b",
			"\1\u057c",
			"\1\u057d",
			"\1\u057e",
			"\1\u057f",
			"\1\u0580",
			"\1\u0581",
			"\1\u0582",
			"\1\u0583",
			"\1\u0584",
			"\1\u0585",
			"\1\u0586",
			"\1\u0587",
			"\1\u0588",
			"\1\u0589",
			"\1\u058a",
			"\1\u058b",
			"\1\u058c",
			"\1\u058d",
			"\1\u058e",
			"\1\u058f",
			"\1\u0590",
			"\1\u0591",
			"\1\u0592",
			"\1\u0593",
			"\1\u0594",
			"\1\u0595",
			"\1\u0596",
			"\1\u0597",
			"\1\u0598",
			"\1\u0599",
			"\1\u059a",
			"\1\u059b",
			"\1\u059c",
			"\1\u059d",
			"\1\u059e",
			"\1\u059f",
			"\1\145",
			"\1\u05a0",
			"\1\u05a1",
			"\1\u05a2",
			"\1\u05a3",
			"\1\u05a4",
			"\1\u05a5",
			"\1\u05a6",
			"\1\u05a7",
			"\1\u05a8",
			"\1\u05a9",
			"\1\u05aa",
			"\1\145",
			"\1\u05ab",
			"\1\u05ac",
			"\1\u05ad",
			"\1\u05ae",
			"\1\u05af",
			"\1\u05b0",
			"\1\145",
			"\1\u05b1",
			"\1\u05b2",
			"\1\u05b3",
			"\1\u05b4",
			"\1\u05b5",
			"\1\u05b6",
			"\1\u05b7",
			"\1\u05b8",
			"\1\u05b9",
			"\1\145",
			"\1\u05ba",
			"\1\u05bb",
			"\1\u05bc",
			"\1\u05bd",
			"\1\u05be",
			"\1\u05bf",
			"\1\u05c0",
			"\1\u05c1",
			"\1\u05c2",
			"\1\u05c3",
			"\1\u05c4",
			"\1\u05c5",
			"\1\u05c6",
			"\1\u05c7",
			"\1\u05c8",
			"\1\u05c9",
			"\1\u05ca",
			"\1\u05cb",
			"\1\u05cc",
			"\1\u05cd",
			"\1\u05ce",
			"\1\u05cf",
			"\1\u05d0",
			"\1\u05d1",
			"\1\u05d2",
			"\1\u05d3",
			"\1\u05d4",
			"\1\u05d5",
			"\1\u05d6",
			"\1\u05d7",
			"\1\u05d8",
			"\1\u05d9",
			"\1\u05da",
			"\1\u05db",
			"\1\145",
			"\1\u05dc",
			"\1\u05dd",
			"\1\145",
			"\1\u05de",
			"\1\u05df",
			"\1\u05e0",
			"\1\u05e1",
			"\1\u05e2",
			"\1\u05e3",
			"\1\u05e4",
			"\1\u05e5",
			"\1\u05e6",
			"\1\u05e7",
			"\1\u05e8",
			"\1\u05e9",
			"\1\u05ea",
			"\1\145",
			"\1\u05eb",
			"\1\u05ec",
			"\1\u05ed",
			"\1\u05ee",
			"\1\u05ef",
			"\1\u05f0",
			"\1\u05f1",
			"\1\u05f2",
			"\1\u05f3",
			"\1\u05f4",
			"\1\u05f5",
			"\1\u05f6",
			"\1\u05f7",
			"\1\u05f8",
			"\1\u05f9",
			"\1\u05fa",
			"\1\u05fb",
			"\1\u05fc",
			"\1\u05fd",
			"\1\u05fe",
			"\1\u05ff",
			"\1\u0600",
			"\1\u0601",
			"\1\u0602",
			"\1\145",
			"\1\u0603",
			"\1\u0604",
			"\1\u0605",
			"\1\u0606",
			"\1\u0607",
			"\1\u0608",
			"\1\u0609",
			"\1\u060a",
			"\1\u060b",
			"\1\u060c",
			"\1\u060d",
			"\1\u060e",
			"\1\u060f",
			"\1\u0610",
			"\1\u0611",
			"\1\u0612",
			"\1\u0613",
			"\1\u0614",
			"\1\u0615",
			"\1\145",
			"\1\u0616",
			"\1\u0617",
			"\1\u0618",
			"\1\u0619",
			"\1\u061a",
			"\1\u061b",
			"\1\u061c",
			"\1\u061d",
			"\1\u061e",
			"\1\u061f",
			"\1\u0620",
			"\1\u0621",
			"\1\u0622",
			"\1\u0623",
			"\1\u0624",
			"\1\u0625",
			"\1\u0626",
			"\1\u0627",
			"\1\u0628",
			"\1\u0629",
			"\1\145",
			"\1\u062a",
			"\1\u062b",
			"\1\u062c",
			"\1\u062d",
			"\1\u062e",
			"\1\145",
			"\1\u062f",
			"\1\u0630",
			"\1\145",
			"\1\u0631",
			"\1\u0632",
			"\1\u0633",
			"\1\u0634",
			"\1\u0635",
			"\1\u0636",
			"\1\u0637",
			"\1\u0638",
			"\1\u0639",
			"\1\u063a",
			"\1\u063b",
			"\1\u063c",
			"\1\u063d",
			"\1\u063e",
			"\1\u063f",
			"\1\145",
			"\1\u0640",
			"\1\145",
			"\1\u0641",
			"\1\u0642",
			"\1\u0643",
			"\1\u0644",
			"\1\u0645",
			"\1\u0646",
			"\1\u0647",
			"\1\u0648",
			"\1\u0649",
			"\1\145",
			"\1\u064a",
			"\1\u064b",
			"\1\u064c",
			"\1\u064d",
			"\1\145",
			"\1\u064e",
			"\1\u064f",
			"\1\u0650",
			"\1\145",
			"\1\u0651",
			"\1\u0652",
			"\1\u0653",
			"\1\u0654",
			"\1\u0655",
			"\1\u0656",
			"\1\u0657",
			"\1\u0658",
			"\1\u0659",
			"\1\u065a",
			"\1\u065b",
			"\1\u065c",
			"\1\u065d",
			"\1\u065e",
			"\1\u065f",
			"\1\u0660",
			"\1\u0661",
			"\1\u0662",
			"\1\145",
			"\1\u0663",
			"\1\u0664",
			"\1\u0665",
			"\1\u0666",
			"\1\u0667",
			"\1\u0668",
			"\1\145",
			"\1\u0669",
			"\1\u066a",
			"\1\u066b",
			"\1\u066c",
			"\1\u066d",
			"\1\145",
			"\1\u066e",
			"\1\u066f",
			"\1\u0670",
			"\1\u0671",
			"\1\u0672",
			"\1\u0673",
			"\1\u0674",
			"\1\u0675",
			"\1\u0676",
			"\1\u0677",
			"\1\u0678",
			"\1\u0679",
			"\1\u067a",
			"\1\145",
			"\1\u067b",
			"\1\u067c",
			"\1\u067d",
			"\1\u067e",
			"\1\u067f",
			"\1\u0680",
			"\1\u0681",
			"\1\u0682",
			"\1\u0683",
			"\1\u0684",
			"\1\u0685",
			"\1\u0686",
			"\1\u0687",
			"\1\u0688",
			"\1\u0689",
			"\1\u068a",
			"\1\145",
			"\1\u068b",
			"\1\u068c",
			"\1\u068d",
			"\1\u068e",
			"\1\u068f",
			"\1\u0690",
			"\1\u0691",
			"\1\u0692",
			"\1\145",
			"\1\145",
			"\1\u0693",
			"\1\145",
			"\1\u0694",
			"\1\u0695",
			"\1\u0696",
			"\1\u0697",
			"\1\u0698",
			"\1\u0699",
			"\1\u069a",
			"\1\145",
			"\1\u069b",
			"\1\u069c",
			"\1\u069d",
			"\1\u069e",
			"\1\u069f",
			"\1\u06a0",
			"\1\145",
			"\1\u06a1",
			"\1\u06a2",
			"\1\u06a3",
			"\1\u06a4",
			"\1\u06a5",
			"\1\145",
			"\1\u06a6",
			"\1\u06a7",
			"\1\u06a8",
			"\1\u06a9",
			"\1\u06aa",
			"\1\u06ab",
			"\1\u06ac",
			"\1\145",
			"\1\u06ad",
			"\1\u06ae",
			"\1\u06af",
			"\1\u06b0",
			"\1\u06b1",
			"\1\u06b2",
			"\1\u06b3",
			"\1\u06b4",
			"\1\u06b5",
			"\1\u06b6",
			"\1\u06b7",
			"\1\u06b8",
			"\1\u06b9",
			"\1\u06ba",
			"\1\u06bb",
			"\1\u06bc",
			"\1\u06bd",
			"\1\u06be",
			"\1\u06bf",
			"\1\u06c0",
			"\1\u06c1",
			"\1\u06c2",
			"\1\u06c3",
			"\1\u06c4",
			"\1\u06c5",
			"\1\u06c6",
			"\1\u06c7",
			"\1\u06c8",
			"\1\u06c9",
			"\1\u06ca",
			"\1\u06cb",
			"\1\u06cc",
			"\1\u06cd",
			"\1\u06ce",
			"\1\145",
			"\1\u06cf",
			"\1\u06d0",
			"\1\u06d1",
			"\1\u06d2",
			"\1\u06d3",
			"\1\145",
			"\1\u06d4",
			"\1\u06d5",
			"\1\u06d6",
			"\1\u06d7",
			"\1\u06d8",
			"\1\u06d9",
			"\1\u06da",
			"\1\u06db",
			"\1\u06dc",
			"\1\u06dd",
			"\1\145",
			"\1\u06de",
			"\1\u06df",
			"\1\u06e0",
			"\1\u06e1",
			"\1\u06e2",
			"\1\u06e3",
			"\1\u06e4",
			"\1\u06e5",
			"\1\u06e6",
			"\1\u06e7",
			"\1\u06e8",
			"\1\u06e9",
			"\1\u06ea",
			"\1\u06eb",
			"\1\u06ec",
			"\1\u06ed",
			"\1\u06ee",
			"\1\u06ef",
			"\1\u06f0",
			"\1\u06f1",
			"\1\u06f2",
			"\1\u06f3",
			"\1\u06f4",
			"\1\u06f5",
			"\1\u06f6",
			"\1\145",
			"\1\u06f7",
			"\1\145",
			"\1\u06f8",
			"\1\u06f9",
			"\1\u06fa",
			"\1\u06fb",
			"\1\u06fc",
			"\1\u06fd",
			"\1\u06fe",
			"\1\u06ff",
			"\1\u0700",
			"\1\u0701",
			"\1\u0702",
			"\1\145",
			"\1\u0703",
			"\1\u0704",
			"\1\u0705",
			"\1\145",
			"\1\u0706",
			"\1\u0707",
			"\1\u0708",
			"\1\u0709",
			"\1\u070a",
			"\1\u070b",
			"\1\145",
			"\1\u070c",
			"\1\u070d",
			"\1\u070e",
			"\1\u070f",
			"\1\u0710",
			"\1\u0711",
			"\1\u0712",
			"\1\u0713",
			"\1\u0714",
			"\1\145",
			"\1\u0715",
			"\1\u0716",
			"\1\u0717",
			"\1\145",
			"\1\u0718",
			"\1\u0719",
			"\1\u071a",
			"\1\u071b",
			"\1\u071c",
			"\1\u071d",
			"\1\u071e",
			"\1\u071f",
			"\1\u0720",
			"\1\u0721",
			"\1\145",
			"\1\u0722",
			"\1\u0723",
			"\1\u0724",
			"\1\u0725",
			"\1\u0726",
			"\1\u0727",
			"\1\u0728",
			"\1\u0729",
			"\1\u072a",
			"\1\u072b",
			"\1\145",
			"\1\145",
			"\1\145",
			"\1\145",
			"\1\u072c",
			"\1\u072d",
			"\1\u072e",
			"\1\u072f",
			"\1\u0730",
			"\1\u0731",
			"\1\145",
			"\1\145",
			"\1\u0732",
			"\1\u0733",
			"\1\u0734",
			"\1\u0735",
			"\1\u0736",
			"\1\u0737",
			"\1\u0738",
			"\1\u0739",
			"\1\u073a",
			"\1\u073b",
			"\1\145",
			"\1\145",
			"\1\145",
			"\1\u073c",
			"\1\u073d",
			"\1\u073e",
			"\1\u073f",
			"\1\u0740",
			"\1\145",
			"\1\u0741",
			"\1\u0742",
			"\1\u0743",
			"\1\145",
			"\1\u0744",
			"\1\u0745",
			"\1\u0746",
			"\1\u0747",
			"\1\u0748",
			"\1\145",
			"\1\u0749",
			"\1\u074a",
			"\1\u074b",
			"\1\145",
			"\1\u074c",
			"\1\u074d",
			"\1\u074e",
			"\1\u074f",
			"\1\u0750",
			"\1\145",
			"\1\u0751",
			"\1\u0752",
			"\1\u0753",
			"\1\u0754",
			"\1\u0755",
			"\1\u0756",
			"\1\u0757",
			"\1\145",
			"\1\u0758",
			"\1\u0759",
			"\1\u075a",
			"\1\u075b",
			"\1\u075c",
			"\1\145",
			"\1\u075d",
			"\1\u075e",
			"\1\u075f",
			"\1\u0760",
			"\1\u0761",
			"\1\u0762",
			"\1\u0763",
			"\1\u0764",
			"\1\u0765",
			"\1\u0766",
			"\1\u0767",
			"\1\u0768",
			"\1\u0769",
			"\1\145",
			"\1\145",
			"\1\u076a",
			"\1\u076b",
			"\1\u076c",
			"\1\145",
			"\1\u076d",
			"\1\u076e",
			"\1\145",
			"\1\u076f",
			"\1\u0770",
			"\1\u0771",
			"\1\145",
			"\1\u0772",
			"\1\u0773",
			"\1\u0774",
			"\1\u0775",
			"\1\145",
			"\1\u0776",
			"\1\u0777",
			"\1\u0778",
			"\1\u0779",
			"\1\u077a",
			"\1\u077b",
			"\1\u077c",
			"\1\u077d",
			"\1\u077e",
			"\1\u077f",
			"\1\u0780",
			"\1\u0781",
			"\1\u0782",
			"\1\u0783",
			"\1\u0784",
			"\1\u0785",
			"\1\u0786",
			"\1\145",
			"\1\145",
			"\1\u0787",
			"\1\u0788",
			"\1\u0789",
			"\1\u078a",
			"\1\u078b",
			"\1\u078c",
			"\1\u078d",
			"\1\u078e",
			"\1\u078f",
			"\1\u0790",
			"\1\u0791",
			"\1\u0792",
			"\1\u0793",
			"\1\145",
			"\1\u0794",
			"\1\u0795",
			"\1\u0796",
			"\1\u0797",
			"\1\u0798",
			"\1\u0799",
			"\1\u079a",
			"\1\u079b",
			"\1\u079c",
			"\1\u079d",
			"\1\u079e",
			"\1\u079f",
			"\1\u07a0",
			"\1\u07a1",
			"\1\u07a2",
			"\1\u07a3",
			"\1\145",
			"\1\145",
			"\1\u07a4",
			"\1\u07a5",
			"\1\145",
			"\1\u07a6",
			"\1\u07a7",
			"\1\u07a8",
			"\1\u07a9",
			"\1\u07aa",
			"\1\u07ab",
			"\1\u07ac",
			"\1\u07ad",
			"\1\145",
			"\1\u07ae",
			"\1\u07af",
			"\1\u07b0",
			"\1\u07b1",
			"\1\u07b2",
			"\1\u07b3",
			"\1\u07b4",
			"\1\145",
			"\1\145",
			"\1\u07b5",
			"\1\u07b6",
			"\1\u07b7",
			"\1\145",
			"\1\u07b8",
			"\1\u07b9",
			"\1\u07ba",
			"\1\u07bb",
			"\1\u07bc",
			"\1\u07bd",
			"\1\u07be",
			"\1\u07bf",
			"\1\u07c0",
			"\1\u07c1",
			"\1\u07c2",
			"\1\u07c3",
			"\1\u07c4",
			"\1\u07c5",
			"\1\u07c6",
			"\1\u07c7",
			"\1\145",
			"\1\u07c8",
			"\1\u07c9",
			"\1\145",
			"\1\145",
			"\1\145",
			"\1\u07ca",
			"\1\145",
			"\1\u07cb",
			"\1\145",
			"\1\145",
			"\1\u07cc",
			"\1\u07cd",
			"\1\u07ce",
			"\1\u07cf",
			"\1\u07d0",
			"\1\u07d1",
			"\1\u07d2",
			"\1\u07d3",
			"\1\u07d4",
			"\1\145",
			"\1\145",
			"\1\u07d5",
			"\1\u07d6",
			"\1\145",
			"\1\u07d7",
			"\1\u07d8",
			"\1\u07d9",
			"\1\u07da",
			"\1\u07db",
			"\1\145",
			"\1\u07dc",
			"\1\u07dd",
			"\1\u07de",
			"\1\u07df",
			"\1\145",
			"\1\u07e0",
			"\1\u07e1",
			"\1\u07e2",
			"\1\u07e3",
			"\1\u07e4",
			"\1\u07e5",
			"\1\u07e6",
			"\1\u07e7",
			"\1\u07e8",
			"\1\u07e9",
			"\1\u07ea",
			"\1\145",
			"\1\u07eb",
			"\1\u07ec",
			"\1\145",
			"\1\u07ed",
			"\1\u07ee",
			"\1\u07ef",
			"\1\u07f0",
			"\1\u07f1",
			"\1\145",
			"\1\u07f2",
			"\1\145",
			"\1\145",
			"\1\u07f3",
			"\1\u07f4",
			"\1\u07f5",
			"\1\u07f6",
			"\1\u07f7",
			"\1\u07f8",
			"\1\u07f9",
			"\1\145",
			"\1\u07fa",
			"\1\u07fb",
			"\1\u07fc",
			"\1\u07fd",
			"\1\u07fe",
			"\1\u07ff",
			"\1\u0800",
			"\1\u0801",
			"\1\u0802",
			"\1\u0803",
			"\1\u0804",
			"\1\145",
			"\1\u0805",
			"\1\u0806",
			"\1\145",
			"\1\145",
			"\1\u0807",
			"\1\u0808",
			"\1\u0809",
			"\1\u080a",
			"\1\u080b",
			"\1\u080c",
			"\1\u080d",
			"\1\u080e",
			"\1\u080f",
			"\1\u0810",
			"\1\u0811",
			"\1\u0812",
			"\1\u0813",
			"\1\u0814",
			"\1\u0815",
			"\1\145",
			"\1\u0816",
			"\1\145",
			"\1\u0817",
			"\1\u0818",
			"\1\145",
			"\1\u0819",
			"\1\u081a",
			"\1\u081b",
			"\1\u081c",
			"\1\u081d",
			"\1\u081e",
			"\1\u081f",
			"\1\u0820",
			"\1\u0821",
			"\1\u0822",
			"\1\145",
			"\1\u0823",
			"\1\145",
			"\1\u0824",
			"\1\u0825",
			"\1\u0826",
			"\1\u0827",
			"\1\u0828",
			"\1\u0829",
			"\1\u082a",
			"\1\145",
			"\1\u082b",
			"\1\u082c",
			"\1\145",
			"\1\u082d",
			"\1\u082e",
			"\1\u082f",
			"\1\u0830",
			"\1\u0831",
			"\1\u0832",
			"\1\u0833",
			"\1\u0834",
			"\1\u0835",
			"\1\u0836",
			"\1\u0837",
			"\1\u0838",
			"\1\u0839",
			"\1\u083a",
			"\1\u083b",
			"\1\145",
			"\1\145",
			"\1\u083c",
			"\1\u083d",
			"\1\u083e",
			"\1\145",
			"\1\145",
			"\1\145",
			"\1\u083f",
			"\1\u0840",
			"\1\u0841",
			"\1\u0842",
			"\1\u0843",
			"\1\u0844",
			"\1\145",
			"\1\u0845",
			"\1\145",
			"\1\u0846",
			"\1\u0847",
			"\1\u0848",
			"\1\u0849",
			"\1\u084a",
			"\1\145",
			"\1\u084b",
			"\1\u084c",
			"\1\u084d",
			"\1\u084e",
			"\1\145",
			"\1\u084f",
			"\1\u0850",
			"\1\u0851",
			"\1\u0852",
			"\1\u0853",
			"\1\u0854",
			"\1\u0855",
			"\1\u0856",
			"\1\u0857",
			"\1\u0858",
			"\1\145",
			"\1\u0859",
			"\1\u085a",
			"\1\u085b",
			"\1\u085c",
			"\1\u085d",
			"\1\u085e",
			"\1\u085f",
			"\1\u0860",
			"\1\145",
			"\1\145",
			"\1\145",
			"\1\u0861",
			"\1\u0862",
			"\1\u0863",
			"\1\u0864",
			"\1\u0865",
			"\1\u0866",
			"\1\u0867",
			"\1\u0868",
			"\1\145",
			"\1\u0869",
			"\1\u086a",
			"\1\u086b",
			"\1\u086c",
			"\1\u086d",
			"\1\u086e",
			"\1\145",
			"\1\u086f",
			"\1\u0870",
			"\1\u0871",
			"\1\u0872",
			"\1\u0873",
			"\1\u0874",
			"\1\u0875",
			"\1\u0876",
			"\1\145",
			"\1\u0877",
			"\1\u0878",
			"\1\145",
			"\1\145",
			"\1\145",
			"\1\u0879",
			"\1\u087a",
			"\1\u087b",
			"\1\145",
			"\1\u087c",
			"\1\u087d",
			"\1\u087e",
			"\1\u087f",
			"\1\u0880",
			"\1\u0881",
			"\1\145",
			"\1\145",
			"\1\145",
			"\1\u0882",
			"\1\u0883",
			"\1\u0884",
			"\1\145",
			"\1\u0885",
			"\1\145",
			"\1\u0886",
			"\1\145",
			"\1\u0887",
			"\1\u0888",
			"\1\u0889",
			"\1\u088a",
			"\1\145"
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "270:21: ( FRAG_BREED_NAME_SINGLE | ( FRAG_BREED_NAME_PLURAL ( WS FRAG_BREED_NAME_SUFFIX )+ ) )";
		}
	}

	static final String DFA27_eotS =
		"\1\uffff\2\33\1\uffff\1\51\25\33\3\uffff\14\33\3\uffff\52\33\1\uffff\55"+
		"\33\3\uffff\1\33\1\uffff\16\33\3\uffff\u0084\33\2\uffff\15\33\3\uffff"+
		"\u008d\33\2\uffff\13\33\2\uffff\140\33\1\uffff\56\33\1\uffff\u00d3\33"+
		"\1\uffff\u0087\33";
	static final String DFA27_eofS =
		"\u03b7\uffff";
	static final String DFA27_minS =
		"\1\11\1\111\1\122\1\uffff\1\11\1\146\2\141\1\156\1\122\1\145\1\141\1\142"+
		"\1\141\1\145\1\141\1\145\1\154\1\141\1\111\1\101\1\110\1\145\1\105\2\157"+
		"\2\uffff\1\0\4\11\1\123\1\156\1\154\1\156\1\116\1\11\1\143\1\142\1\uffff"+
		"\1\11\1\uffff\1\146\1\162\1\151\1\141\1\145\1\141\2\163\1\141\1\143\1"+
		"\141\1\162\1\141\1\154\1\151\1\163\1\145\1\165\1\143\1\162\1\147\1\145"+
		"\1\141\1\145\1\111\1\162\1\141\1\145\1\154\1\145\1\162\1\151\1\145\1\151"+
		"\1\141\1\160\1\145\1\155\1\166\1\142\1\157\1\141\1\uffff\1\141\1\162\1"+
		"\144\1\164\1\160\1\153\1\141\1\157\1\151\1\147\1\162\1\144\1\157\1\164"+
		"\1\163\1\116\1\151\1\150\1\141\1\145\1\142\1\171\1\157\1\146\1\151\1\141"+
		"\1\156\1\145\1\116\1\124\1\142\1\171\2\145\1\105\1\165\1\125\1\172\1\164"+
		"\1\144\1\151\1\162\1\104\1\154\1\162\2\11\1\uffff\1\11\1\uffff\1\11\1"+
		"\123\1\163\1\151\1\164\1\143\1\164\1\144\1\104\1\150\1\155\1\144\1\145"+
		"\1\165\1\141\1\154\2\145\1\150\1\145\1\164\1\163\1\162\2\164\1\145\1\147"+
		"\1\154\1\147\1\156\1\150\1\143\1\157\1\145\1\144\1\164\1\166\1\145\1\153"+
		"\1\143\1\141\1\163\1\154\1\162\1\141\1\144\1\141\1\153\1\163\1\150\1\167"+
		"\1\155\1\153\5\154\1\156\1\164\1\156\1\144\1\104\1\155\2\156\2\144\1\141"+
		"\1\162\1\141\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162"+
		"\1\145\1\156\1\163\1\160\2\146\1\141\1\40\1\145\1\151\1\163\1\151\1\142"+
		"\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\163\1\151\1\145\1\142"+
		"\1\144\1\164\1\163\1\107\1\156\1\165\1\157\1\165\1\151\1\164\1\154\1\164"+
		"\1\142\1\145\1\153\1\145\1\157\1\164\1\156\1\146\1\163\2\144\1\104\1\125"+
		"\1\145\1\40\1\145\1\163\1\123\1\162\1\122\1\163\1\145\1\155\1\163\1\164"+
		"\1\156\1\160\1\145\1\116\1\157\1\153\1\11\1\uffff\2\11\1\141\1\145\1\150"+
		"\1\151\1\141\1\101\1\163\1\141\1\151\1\162\1\145\1\154\1\uffff\1\162\1"+
		"\156\1\141\1\144\1\141\1\153\1\151\1\157\1\162\1\156\1\145\1\154\1\144"+
		"\1\143\2\151\1\145\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151"+
		"\1\145\1\162\1\164\1\163\1\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141"+
		"\1\165\1\145\1\40\1\142\1\145\1\151\1\171\1\151\1\145\1\144\1\151\1\55"+
		"\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\151\1\156"+
		"\2\141\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\154\1\142\1\141"+
		"\3\157\1\145\1\40\1\162\1\154\1\157\1\156\1\162\1\164\1\141\2\164\1\163"+
		"\1\162\1\154\1\165\1\11\1\163\1\156\1\157\1\145\1\167\1\145\1\11\1\164"+
		"\1\153\1\171\1\162\1\160\1\164\1\171\1\154\1\141\1\40\1\162\1\171\1\40"+
		"\1\164\1\40\1\157\1\146\1\144\1\145\1\141\1\151\1\101\1\122\1\164\1\151"+
		"\1\144\1\104\1\163\1\123\1\154\1\162\1\141\1\150\1\40\1\145\1\160\1\40"+
		"\1\105\1\151\1\163\1\11\1\uffff\1\164\1\163\1\145\1\146\1\171\1\131\1"+
		"\150\1\164\1\145\1\155\1\40\1\164\1\141\1\160\1\156\1\141\1\163\1\141"+
		"\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163\1\156\1\40\1\150"+
		"\1\151\1\162\1\151\1\156\1\145\1\163\1\156\1\163\1\144\1\141\1\145\1\157"+
		"\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\145\1\162\1\145"+
		"\1\55\1\163\1\142\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156"+
		"\1\40\1\157\2\145\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144"+
		"\1\141\1\145\1\40\1\154\1\165\1\154\1\147\1\143\1\150\1\154\1\156\1\147"+
		"\1\157\1\40\1\157\1\163\1\145\1\150\1\141\1\145\1\147\1\145\1\156\1\163"+
		"\1\145\1\154\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\141\1"+
		"\40\1\151\1\40\1\150\1\156\1\157\1\141\1\170\1\171\1\163\1\131\1\104\1"+
		"\141\1\156\1\141\1\101\1\144\1\104\2\141\1\162\1\40\1\163\1\145\1\141"+
		"\1\123\1\164\1\150\1\165\1\145\1\163\1\146\2\54\1\165\1\151\1\40\1\141"+
		"\1\145\1\151\1\40\1\154\1\156\1\141\1\151\1\154\1\151\1\40\1\163\1\144"+
		"\1\162\1\147\1\156\1\145\1\40\1\157\1\143\1\40\1\163\1\40\1\162\1\40\1"+
		"\163\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\162\1\40\1"+
		"\163\1\103\1\150\1\165\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162\1"+
		"\163\1\40\1\144\1\156\1\163\1\156\1\157\1\163\1\157\1\156\1\162\1\151"+
		"\1\156\1\153\1\151\1\150\2\157\1\40\1\145\1\153\1\150\1\162\1\40\1\156"+
		"\1\163\1\165\1\141\1\145\2\151\1\154\1\163\1\144\1\141\1\145\1\163\1\141"+
		"\1\156\1\141\1\40\1\145\2\162\1\40\1\54\1\150\1\54\1\101\1\156\1\147\1"+
		"\171\1\131\1\141\1\101\1\163\1\156\1\141\1\144\1\164\1\151\1\104\1\172"+
		"\1\151\1\162\1\163\1\164\1\163\1\11\1\156\1\141\2\156\1\145\1\40\1\156"+
		"\1\141\1\151\1\163\1\40\1\157\1\164\2\40\1\165\1\153\1\40\1\171\2\163"+
		"\1\164\1\156\1\162\1\141\1\165\2\40\1\157\1\40\1\143\1\40\1\141\1\40\1"+
		"\156\1\163\1\145\1\151\1\40\1\145\1\144\2\162\1\144\1\147\1\164\1\144"+
		"\1\40\1\141\1\40\1\165\1\156\1\163\1\145\1\40\1\163\1\151\1\145\1\156"+
		"\1\40\1\141\1\154\1\40\1\163\1\171\1\162\1\150\1\155\1\144\1\156\1\40"+
		"\2\144\1\40\1\131\2\40\2\54\1\171\1\131\1\163\1\156\1\141\1\163\1\162"+
		"\1\101\1\143\1\162\2\145\1\uffff\1\144\1\156\1\40\1\163\2\40\1\156\1\141"+
		"\1\156\1\157\1\156\1\40\1\163\1\40\1\151\2\40\1\153\2\141\1\150\1\164"+
		"\1\144\1\163\1\143\1\40\2\163\2\40\1\145\1\141\1\154\2\156\1\163\1\145"+
		"\1\40\1\141\1\163\1\40\1\156\1\145\1\54\1\153\4\40\1\163\1\40\3\54\1\145"+
		"\1\171\1\145\1\131\1\165\1\145\1\40\1\162\2\163\1\143\1\40\1\156\1\163"+
		"\1\156\1\144\1\146\1\145\1\163\1\164\2\145\1\163\1\40\1\162\1\156\1\141"+
		"\1\40\1\144\1\163\1\156\1\145\1\40\1\162\1\145\1\150\1\162\1\54\1\144"+
		"\1\54\1\151\2\40\1\150\2\40\1\163\1\146\1\40\1\145\1\162\1\144\1\163\1"+
		"\40\1\156\2\163\1\40\2\163\1\151\1\163\1\40\1\156\1\145\1\163\1\144\2"+
		"\40\1\144\1\162\1\164\1\162\1\40\1\163\1\145\1\154\1\163\1\40\1\151\1"+
		"\163";
	static final String DFA27_maxS =
		"\1\172\1\163\1\157\1\uffff\1\72\3\165\1\156\2\162\1\141\1\164\1\141\1"+
		"\165\1\u00f6\1\157\1\164\1\171\1\165\1\167\1\165\2\151\2\157\2\uffff\1"+
		"\uffff\1\123\1\163\2\50\1\123\2\163\1\156\1\116\1\50\1\156\1\147\1\uffff"+
		"\1\131\1\uffff\1\147\1\162\1\151\1\141\1\145\1\141\2\163\1\162\1\143\1"+
		"\165\1\171\1\165\1\154\1\166\1\163\1\157\1\165\1\154\1\162\1\164\1\156"+
		"\1\141\1\151\1\111\1\162\1\141\1\145\1\162\1\145\1\166\1\151\1\145\1\151"+
		"\1\141\1\160\1\162\1\155\1\166\1\153\1\157\1\141\1\uffff\1\167\1\166\1"+
		"\144\1\164\1\162\1\164\1\141\1\157\1\162\1\154\1\162\1\144\1\157\1\164"+
		"\1\163\1\116\1\164\1\157\1\141\1\151\1\154\1\171\1\157\1\146\1\151\1\141"+
		"\1\163\1\145\1\116\1\124\1\142\1\171\2\145\1\105\1\165\1\125\1\172\1\164"+
		"\1\163\1\151\1\162\1\104\1\154\1\162\2\172\1\uffff\1\50\1\uffff\1\50\1"+
		"\123\1\163\1\151\1\164\1\143\1\164\1\144\1\104\1\150\1\155\1\144\1\145"+
		"\1\165\1\151\1\164\1\157\1\145\1\150\1\145\1\164\1\163\1\162\2\164\1\163"+
		"\1\165\1\154\1\147\1\156\1\150\1\143\1\157\1\145\1\172\1\164\1\166\1\145"+
		"\1\153\1\143\1\164\1\163\1\154\1\162\1\145\1\144\1\141\1\153\1\163\1\156"+
		"\1\167\1\155\1\153\5\154\1\156\1\164\1\156\1\144\1\104\1\155\2\156\2\144"+
		"\1\171\1\162\1\141\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141"+
		"\1\162\1\145\1\156\1\163\1\160\1\146\1\167\1\141\1\40\1\145\1\151\1\163"+
		"\1\151\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\163\1\151"+
		"\1\145\1\142\1\144\1\164\1\163\1\107\1\156\1\165\1\157\1\165\1\151\1\164"+
		"\1\154\1\164\1\150\1\145\1\153\1\145\1\157\1\164\2\156\1\163\2\144\1\104"+
		"\1\125\1\145\1\40\1\145\1\163\1\123\1\162\1\122\1\163\1\145\1\155\1\163"+
		"\1\164\1\156\1\160\1\145\1\116\1\157\1\153\1\172\1\uffff\2\50\1\141\1"+
		"\145\1\150\1\151\1\141\1\101\1\163\1\141\1\151\1\162\1\145\1\163\1\uffff"+
		"\1\166\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\162\1\156\1\145\1\154"+
		"\1\144\1\143\2\151\1\145\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162"+
		"\1\151\1\145\1\162\1\164\1\163\1\155\1\156\1\141\1\40\1\151\1\154\1\171"+
		"\1\141\1\165\1\145\1\40\1\142\1\145\1\151\1\171\1\151\1\145\1\144\1\151"+
		"\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\151"+
		"\1\156\2\141\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\154\1\142"+
		"\1\141\3\157\1\151\1\40\1\162\1\154\1\157\1\156\1\162\1\164\1\141\2\164"+
		"\1\163\1\162\1\154\1\165\1\40\1\163\1\156\1\157\1\145\1\167\1\145\1\40"+
		"\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\154\1\141\1\40\1\162\1\171"+
		"\1\40\1\164\1\40\1\157\1\146\1\144\1\145\1\141\1\151\1\101\1\122\1\164"+
		"\1\151\1\144\1\104\1\163\1\123\1\154\1\162\1\141\1\150\1\40\1\145\1\160"+
		"\1\150\1\105\1\151\1\163\1\172\1\uffff\1\164\1\163\1\145\1\146\1\171\1"+
		"\131\1\150\1\164\1\145\1\155\1\40\1\164\1\151\1\160\1\156\1\141\1\163"+
		"\1\141\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163\1\156\1\40"+
		"\1\150\1\151\1\162\1\151\1\156\1\145\1\163\1\156\1\163\1\144\1\141\1\145"+
		"\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\145\1\162"+
		"\1\145\1\55\1\163\1\142\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40"+
		"\2\156\1\145\1\157\2\145\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172"+
		"\1\144\1\141\1\145\1\40\1\154\1\165\1\154\1\147\1\143\1\150\1\154\1\156"+
		"\1\147\1\157\1\40\1\157\1\163\1\145\1\150\1\141\1\145\1\147\1\145\1\156"+
		"\1\163\1\145\1\154\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1"+
		"\141\1\40\1\151\1\40\1\150\1\156\1\157\1\141\1\170\1\171\1\163\1\131\1"+
		"\104\1\141\1\156\1\141\1\101\1\144\1\104\2\141\1\162\1\40\1\163\1\145"+
		"\1\141\1\123\1\164\1\150\1\165\1\145\1\163\1\146\2\54\1\165\1\151\1\40"+
		"\1\141\2\151\1\40\1\154\1\156\1\141\1\151\1\154\1\151\1\40\1\163\1\144"+
		"\1\162\1\147\1\156\1\145\1\40\1\157\1\143\1\40\1\163\1\40\1\162\1\40\1"+
		"\163\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\162\1\40\1"+
		"\163\1\103\1\150\1\165\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162\1"+
		"\163\1\40\1\144\1\156\1\163\1\156\1\157\1\163\1\157\1\156\1\162\1\151"+
		"\1\156\1\153\1\151\1\150\2\157\1\40\1\145\1\153\1\150\1\162\1\40\1\156"+
		"\1\163\1\165\1\141\1\145\2\151\1\154\1\163\1\144\1\141\1\145\1\163\1\141"+
		"\1\156\1\141\1\40\1\145\2\162\1\40\1\54\1\150\1\54\1\101\1\156\1\147\1"+
		"\171\1\131\1\141\1\101\1\163\1\156\1\141\1\144\1\164\1\151\1\104\1\172"+
		"\1\151\1\162\1\163\1\164\1\163\1\40\1\156\1\141\2\156\1\145\1\40\1\156"+
		"\1\141\1\151\1\163\1\40\1\157\1\164\2\40\1\165\1\153\1\40\1\171\2\163"+
		"\1\164\1\156\1\162\1\141\1\165\2\40\1\157\1\40\1\143\1\40\1\141\1\40\1"+
		"\156\1\163\1\145\1\151\1\40\1\145\1\144\2\162\1\144\1\147\1\164\1\144"+
		"\1\40\1\141\1\40\1\165\1\156\1\163\1\145\1\40\1\163\1\151\1\145\1\156"+
		"\1\40\1\141\1\154\1\40\1\163\1\171\1\162\1\150\1\155\1\144\1\156\1\40"+
		"\2\144\1\40\1\131\2\40\2\54\1\171\1\131\1\163\1\156\1\141\1\163\1\162"+
		"\1\101\1\143\1\162\2\145\1\uffff\1\144\1\156\1\40\1\163\2\40\1\156\1\141"+
		"\1\156\1\157\1\156\1\40\1\163\1\40\1\151\2\40\1\153\2\141\1\150\1\164"+
		"\1\144\1\163\1\143\1\40\2\163\2\40\1\145\1\141\1\154\2\156\1\163\1\145"+
		"\1\40\1\141\1\163\1\40\1\156\1\145\1\54\1\153\4\40\1\163\1\40\3\54\1\145"+
		"\1\171\1\145\1\131\1\165\1\145\1\40\1\162\2\163\1\143\1\40\1\156\1\163"+
		"\1\156\1\144\1\146\1\145\1\163\1\164\2\145\1\163\1\40\1\162\1\156\1\141"+
		"\1\40\1\144\1\163\1\156\1\145\1\40\1\162\1\145\1\150\1\162\1\54\1\144"+
		"\1\54\1\151\2\40\1\150\2\40\1\163\1\146\1\40\1\145\1\162\1\144\1\163\1"+
		"\40\1\156\2\163\1\40\2\163\1\151\1\163\1\40\1\156\1\145\1\163\1\144\2"+
		"\40\1\144\1\162\1\164\1\162\1\40\1\163\1\145\1\154\1\163\1\40\1\151\1"+
		"\163";
	static final String DFA27_acceptS =
		"\3\uffff\1\2\26\uffff\1\10\1\12\15\uffff\1\11\1\uffff\1\6\52\uffff\1\4"+
		"\57\uffff\1\13\1\uffff\1\1\u0096\uffff\1\14\16\uffff\1\3\u008f\uffff\1"+
		"\13\155\uffff\1\5\u0102\uffff\1\7\u0087\uffff";
	static final String DFA27_specialS =
		"\34\uffff\1\0\u039a\uffff}>";
	static final String[] DFA27_transitionS = {
			"\2\3\2\uffff\1\3\22\uffff\1\3\5\uffff\2\33\1\34\3\uffff\2\33\1\32\1\uffff"+
			"\12\4\2\33\5\uffff\1\5\1\6\1\7\1\2\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
			"\1\17\1\1\1\20\1\21\1\22\1\33\1\23\1\24\1\25\1\33\1\26\1\27\1\30\1\31"+
			"\1\33\4\uffff\1\33\1\uffff\32\33",
			"\1\41\5\uffff\1\45\2\uffff\1\35\1\37\15\uffff\1\43\7\uffff\1\42\5\uffff"+
			"\1\44\2\uffff\1\36\1\40",
			"\1\46\16\uffff\1\47\15\uffff\1\50",
			"",
			"\2\52\2\uffff\1\52\22\uffff\1\52\17\uffff\12\4\1\53",
			"\1\54\2\uffff\1\55\1\uffff\1\56\1\57\1\60\1\61\6\uffff\1\62",
			"\1\63\3\uffff\1\64\3\uffff\1\65\2\uffff\1\66\2\uffff\1\67\2\uffff\1"+
			"\70\2\uffff\1\71",
			"\1\72\3\uffff\1\73\2\uffff\1\74\3\uffff\1\75\2\uffff\1\76\5\uffff\1"+
			"\77",
			"\1\100",
			"\1\104\26\uffff\1\101\2\uffff\1\102\5\uffff\1\103",
			"\1\105\3\uffff\1\106\2\uffff\1\107\2\uffff\1\110\2\uffff\1\111",
			"\1\112",
			"\1\113\1\114\16\uffff\1\115\1\uffff\1\116",
			"\1\117",
			"\1\120\11\uffff\1\121\5\uffff\1\122",
			"\1\123\3\uffff\1\124\2\uffff\1\125\u008d\uffff\1\126",
			"\1\127\11\uffff\1\130",
			"\1\131\7\uffff\1\132",
			"\1\133\3\uffff\1\134\2\uffff\1\135\3\uffff\1\136\2\uffff\1\137\5\uffff"+
			"\1\140\3\uffff\1\141",
			"\1\146\33\uffff\1\142\2\uffff\1\143\6\uffff\1\144\5\uffff\1\145",
			"\1\164\23\uffff\1\163\13\uffff\1\147\1\uffff\1\150\1\uffff\1\151\2\uffff"+
			"\1\152\1\153\1\uffff\1\154\1\uffff\1\155\1\uffff\1\156\1\157\3\uffff"+
			"\1\160\1\161\1\uffff\1\162",
			"\1\173\14\uffff\1\171\22\uffff\1\172\1\165\5\uffff\1\166\2\uffff\1\167"+
			"\2\uffff\1\170",
			"\1\175\3\uffff\1\174",
			"\1\u0081\37\uffff\1\176\2\uffff\1\177\1\u0080",
			"\1\u0082",
			"\1\u0083",
			"",
			"",
			"\11\u0086\2\u0084\2\u0086\1\u0084\22\u0086\1\u0084\17\u0086\12\u0085"+
			"\uffc6\u0086",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088\52\uffff\1"+
			"\u0087",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088\112\uffff"+
			"\1\u0089",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088",
			"\1\u008a",
			"\1\u008c\4\uffff\1\u008b",
			"\1\u008d\1\uffff\1\u008e\4\uffff\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088",
			"\1\u0092\10\uffff\1\u0093\1\uffff\1\u0094",
			"\1\u0095\4\uffff\1\u0096",
			"",
			"\2\52\2\uffff\1\52\22\uffff\1\52\40\uffff\14\126\1\u0097\1\u0099\1\u0098"+
			"\1\126\1\uffff\3\126\1\uffff\4\126",
			"",
			"\1\u009a\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3\2\uffff\1\u00a4\7\uffff\1\u00a5\5\uffff\1\u00a6",
			"\1\u00a7",
			"\1\u00a8\15\uffff\1\u00a9\5\uffff\1\u00aa",
			"\1\u00ab\1\u00ac\1\uffff\1\u00ad\2\uffff\1\u00ae\1\u00af",
			"\1\u00b0\7\uffff\1\u00b1\13\uffff\1\u00b2",
			"\1\u00b3",
			"\1\u00b4\4\uffff\1\u00b5\3\uffff\1\u00b6\3\uffff\1\u00b7",
			"\1\u00b8",
			"\1\u00b9\3\uffff\1\u00ba\5\uffff\1\u00bb",
			"\1\u00bc",
			"\1\u00bd\10\uffff\1\u00be",
			"\1\u00bf",
			"\1\u00c0\14\uffff\1\u00c1",
			"\1\u00c2\10\uffff\1\u00c3",
			"\1\u00c4",
			"\1\u00c5\3\uffff\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb\5\uffff\1\u00cc",
			"\1\u00cd",
			"\1\u00ce\3\uffff\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5\14\uffff\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9\10\uffff\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"",
			"\1\u00dd\25\uffff\1\u00de",
			"\1\u00df\3\uffff\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3\1\uffff\1\u00e4",
			"\1\u00e5\1\uffff\1\u00e6\6\uffff\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea\2\uffff\1\u00eb\1\u00ec\1\uffff\1\u00ed\2\uffff\1\u00ee",
			"\1\u00ef\4\uffff\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7\2\uffff\1\u00f8\1\u00f9\6\uffff\1\u00fa",
			"\1\u00fb\6\uffff\1\u00fc",
			"\1\u00fd",
			"\1\u00fe\3\uffff\1\u00ff",
			"\1\u0100\11\uffff\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0108\4\uffff\1\u0107",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0118\4\uffff\1\u0115\2\uffff\1\u0116\6\uffff\1\u0117",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\2\u011f\2\uffff\1\u011f\22\uffff\1\u011f\5\uffff\2\u0086\4\uffff\2"+
			"\u0086\2\uffff\12\u011e\2\u0086\5\uffff\32\u0086\4\uffff\1\u0086\1\uffff"+
			"\32\u0086",
			"\2\u011f\2\uffff\1\u011f\22\uffff\1\u011f\5\uffff\2\u0086\1\uffff\1"+
			"\u011f\2\uffff\2\u0086\2\uffff\12\u011e\2\u0086\5\uffff\32\u0086\4\uffff"+
			"\1\u0086\1\uffff\32\u0086",
			"",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088",
			"",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d\7\uffff\1\126",
			"\1\126\3\uffff\1\u012e\3\uffff\1\126",
			"\1\126\11\uffff\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138\15\uffff\1\u0139",
			"\1\u013a\12\uffff\1\u013b\2\uffff\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144\25\uffff\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b\22\uffff\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150\3\uffff\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156\5\uffff\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
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
			"\1\u0169",
			"\1\u016a\27\uffff\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d\20\uffff\1\u017e",
			"\1\u017f",
			"\1\126",
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
			"\1\u019b",
			"\1\u019c",
			"\1\u019d\5\uffff\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5\7\uffff\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\126",
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
			"\2\u01bd\2\uffff\1\u01bd\22\uffff\1\u01bd\5\uffff\2\u0086\1\uffff\1"+
			"\u01be\2\uffff\2\u0086\2\uffff\12\u011e\2\u0086\5\uffff\32\u0086\4\uffff"+
			"\1\u0086\1\uffff\32\u0086",
			"",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088",
			"\2\u0088\2\uffff\1\u0088\22\uffff\1\u0088\7\uffff\1\u0088",
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
			"\1\126\1\uffff\1\126\4\uffff\1\u01ca",
			"",
			"\1\126\3\uffff\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
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
			"\1\126\103\uffff\1\u01ea\10\uffff\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\1\126",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\1\126",
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
			"\1\126",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
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
			"\1\u0217",
			"\1\u0218\3\uffff\1\u0219",
			"\1\126",
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
			"\2\126\2\uffff\1\126\22\uffff\1\126",
			"\1\u018d",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\2\u022c\2\uffff\1\u022c\22\uffff\1\u022c",
			"\1\u022d",
			"\1\u022e",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"\1\u0234",
			"\1\u0235",
			"\1\126",
			"\1\u0236",
			"\1\u0237",
			"\1\126",
			"\1\u0238",
			"\1\126",
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
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\126",
			"\1\u024b",
			"\1\u024c",
			"\1\126\107\uffff\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\2\u01bd\2\uffff\1\u01bd\22\uffff\1\u01bd\5\uffff\2\u0086\1\uffff\1"+
			"\u01be\2\uffff\2\u0086\2\uffff\14\u0086\5\uffff\32\u0086\4\uffff\1\u0086"+
			"\1\uffff\32\u0086",
			"",
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
			"\1\126",
			"\1\u025b",
			"\1\126\7\uffff\1\u012e",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u018d",
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
			"\1\126",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\u0271",
			"\1\u018d",
			"\1\u0272",
			"\1\u018d",
			"\1\u0273",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\126",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\126",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\126",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\126",
			"\1\u028a",
			"\1\u028b",
			"\1\126\104\uffff\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\1\126",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\126",
			"\1\u0295",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\126",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
			"\1\126",
			"\1\u02a4",
			"\1\u018d",
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
			"",
			"\1\126",
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\126",
			"\1\u02b6",
			"\1\126",
			"\1\u02b7",
			"\1\u02b8",
			"\1\u02b9",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u02bd",
			"\1\u02be",
			"\1\u02bf",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\1\u02c5",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\126",
			"\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\1\u02d3",
			"\1\u02d3",
			"\1\u02d4",
			"\1\u02d5",
			"\1\126",
			"\1\u02d6",
			"\1\u012e\3\uffff\1\126",
			"\1\u02d7",
			"\1\126",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\1\126",
			"\1\u018d",
			"\1\u02de",
			"\1\u02df",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\126",
			"\1\u02e3",
			"\1\u02e4",
			"\1\126",
			"\1\u018d",
			"\1\126",
			"\1\u02e5",
			"\1\126",
			"\1\u018d",
			"\1\u02e6",
			"\1\u02e7",
			"\1\u02e8",
			"\1\u02e9",
			"\1\126",
			"\1\u02ea",
			"\1\u02eb",
			"\1\u02ec",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"\1\126",
			"\1\u018d",
			"\1\u02f0",
			"\1\u02f1",
			"\1\u02f2",
			"\1\u02f3",
			"\1\u02f4",
			"\1\126",
			"\1\u02d3",
			"\1\u02d3",
			"\1\126",
			"\1\126",
			"\1\126",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\126",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u018d",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"\1\126",
			"\1\u0308",
			"\1\u0309",
			"\1\u030a",
			"\1\u030b",
			"\1\126",
			"\1\u030c",
			"\1\u018d",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\1\u018d",
			"\1\u0313",
			"\1\u0314",
			"\1\u0315",
			"\1\u0316",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\126",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\126",
			"\1\u02d3",
			"\1\u031d",
			"\1\u02d3",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u018d",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\1\u018d",
			"\1\u032e",
			"\1\u018d",
			"\2\u032f\2\uffff\1\u032f\22\uffff\1\u032f",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\126",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\1\u018d",
			"\1\126",
			"\1\u0338",
			"\1\u0339",
			"\1\126",
			"\1\126",
			"\1\u033a",
			"\1\u033b",
			"\1\126",
			"\1\u033c",
			"\1\u033d",
			"\1\u018d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\126",
			"\1\126",
			"\1\u0343",
			"\1\126",
			"\1\u0344",
			"\1\126",
			"\1\u0345",
			"\1\126",
			"\1\u0346",
			"\1\u018d",
			"\1\u0347",
			"\1\u0348",
			"\1\126",
			"\1\u0349",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\1\u0350",
			"\1\126",
			"\1\u0351",
			"\1\126",
			"\1\u0352",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\1\126",
			"\1\u018d",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\1\126",
			"\1\u0359",
			"\1\u035a",
			"\1\126",
			"\1\u018d",
			"\1\u035b",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\126",
			"\1\u0361",
			"\1\u0362",
			"\1\126",
			"\1\u0363",
			"\1\126",
			"\1\126",
			"\1\u02d3",
			"\1\u02d3",
			"\1\u0364",
			"\1\u0365",
			"\1\u018d",
			"\1\u0366",
			"\1\u0367",
			"\1\u018d",
			"\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"",
			"\1\u036e",
			"\1\u036f",
			"\1\126",
			"\1\u0370",
			"\1\126",
			"\1\126",
			"\1\u0371",
			"\1\u0372",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\1\126",
			"\1\u018d",
			"\1\126",
			"\1\u0376",
			"\1\126",
			"\1\126",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\u018d",
			"\1\u037d",
			"\1\126",
			"\1\u018d",
			"\1\u018d",
			"\1\126",
			"\1\126",
			"\1\u037e",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"\1\u018d",
			"\1\u0383",
			"\1\126",
			"\1\u0384",
			"\1\u0385",
			"\1\126",
			"\1\u0386",
			"\1\u0387",
			"\1\u02d3",
			"\1\u0388",
			"\1\126",
			"\1\126",
			"\1\126",
			"\1\126",
			"\1\u0389",
			"\1\126",
			"\1\u02d3",
			"\1\u02d3",
			"\1\u02d3",
			"\1\u038a",
			"\1\u038b",
			"\1\u038c",
			"\1\u038d",
			"\1\u038e",
			"\1\u038f",
			"\1\126",
			"\1\u0390",
			"\1\u018d",
			"\1\u018d",
			"\1\u0391",
			"\1\126",
			"\1\u0392",
			"\1\u018d",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u018d",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u018d",
			"\1\126",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\126",
			"\1\u039d",
			"\1\u018d",
			"\1\u039e",
			"\1\u039f",
			"\1\126",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u02d3",
			"\1\u03a4",
			"\1\u02d3",
			"\1\u03a5",
			"\1\126",
			"\1\126",
			"\1\u03a6",
			"\1\126",
			"\1\126",
			"\1\u018d",
			"\1\u03a7",
			"\1\126",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u018d",
			"\1\126",
			"\1\u03ab",
			"\1\u018d",
			"\1\u018d",
			"\1\126",
			"\1\u018d",
			"\1\u018d",
			"\1\u03ac",
			"\1\u018d",
			"\1\126",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u018d",
			"\1\u03af",
			"\1\126",
			"\1\126",
			"\1\u03b0",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\126",
			"\1\u018d",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u018d",
			"\1\126",
			"\1\u03b6",
			"\1\u018d"
	};

	static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
	static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
	static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
	static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
	static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
	static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
	static final short[][] DFA27_transition;

	static {
		int numStates = DFA27_transitionS.length;
		DFA27_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
		}
	}

	class DFA27 extends DFA {

		public DFA27(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 27;
			this.eot = DFA27_eot;
			this.eof = DFA27_eof;
			this.min = DFA27_min;
			this.max = DFA27_max;
			this.accept = DFA27_accept;
			this.special = DFA27_special;
			this.transition = DFA27_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUDGE | WS | JUNIOR_RING | BREED_RING | RING_TITLE | TIME | DATE | ELLIPSIS | INT | WORD | PARENTHETICAL | PARENTHETICAL_INT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA27_28 = input.LA(1);
						s = -1;
						if ( ((LA27_28 >= '\t' && LA27_28 <= '\n')||LA27_28=='\r'||LA27_28==' ') ) {s = 132;}
						else if ( ((LA27_28 >= '0' && LA27_28 <= '9')) ) {s = 133;}
						else if ( ((LA27_28 >= '\u0000' && LA27_28 <= '\b')||(LA27_28 >= '\u000B' && LA27_28 <= '\f')||(LA27_28 >= '\u000E' && LA27_28 <= '\u001F')||(LA27_28 >= '!' && LA27_28 <= '/')||(LA27_28 >= ':' && LA27_28 <= '\uFFFF')) ) {s = 134;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 27, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
