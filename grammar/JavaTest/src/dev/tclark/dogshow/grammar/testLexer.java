// $ANTLR 3.x C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g 2014-01-03 11:52:38

package dev.tclark.dogshow.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class testLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BREED_COUNT=4;
	public static final int BREED_MISC=5;
	public static final int BREED_NAME=6;
	public static final int BREED_NAME_SUFFIX=7;
	public static final int COMMENT=8;
	public static final int DATE=9;
	public static final int ELLIPSIS=10;
	public static final int END_PUNCTUATION=11;
	public static final int END_WORD=12;
	public static final int FOLLOWING_TIME=13;
	public static final int FRAG_BEST_IN_SHOW=14;
	public static final int FRAG_BREED_ATTRIBUTE=15;
	public static final int FRAG_BREED_NAME_ALT=16;
	public static final int FRAG_BREED_NAME_CATEGORY=17;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=18;
	public static final int FRAG_BREED_NAME_SINGLE=19;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=20;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP=21;
	public static final int FRAG_GROUP_NAME=22;
	public static final int FRAG_MONTH=23;
	public static final int FRAG_PROPER_NAME=24;
	public static final int FRAG_RALLY_CLASS_NAME=25;
	public static final int FRAG_RALLY_CLASS_SECTION=26;
	public static final int FRAG_RALLY_ENTRANT_GROUP=27;
	public static final int FRAG_RALLY_SINGLE_ENTRANT=28;
	public static final int FRAG_RING=29;
	public static final int FRAG_SEX=30;
	public static final int FRAG_SPECIAL_GROUP_NAME=31;
	public static final int FRAG_SPEC_CHAR=32;
	public static final int FRAG_SPEC_WORD_CHAR=33;
	public static final int FRAG_TIME_LABEL=34;
	public static final int FRAG_TITLE=35;
	public static final int FRAG_TO_FOLLOW=36;
	public static final int FRAG_WEEK_DAY=37;
	public static final int FallThrough=38;
	public static final int GROUP_ENDING_ANNOUNCEMENT=39;
	public static final int GROUP_NAME=40;
	public static final int GROUP_RING=41;
	public static final int INT=42;
	public static final int JUDGE_NAME=43;
	public static final int JUNIOR_CLASS=44;
	public static final int NON_CONFORMATION_CLASS_LEVEL=45;
	public static final int NON_CONFORMATION_CLASS_NAME=46;
	public static final int NON_CONFORMATION_CLASS_SECTION=47;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=48;
	public static final int NON_CONFORMATION_SECOND_LINE=49;
	public static final int NON_CONF_SECOND_LINE_COMMENT=50;
	public static final int PARENTHETICAL=51;
	public static final int PARENTHETICAL_INT=52;
	public static final int PARENTHETICAL_NAME=53;
	public static final int PHONE_NUMBER=54;
	public static final int RALLY_CLASS=55;
	public static final int RALLY_ENTRY=56;
	public static final int RING_TITLE=57;
	public static final int SPECIAL_SUFFIX=58;
	public static final int STANDALONE_COMMENT=59;
	public static final int TIME=60;
	public static final int WORD=61;
	public static final int WS=62;

	boolean allowBreed = false;
	boolean allowGroup = false;
	boolean allowJudge = false;


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
	@Override public String getGrammarFileName() { return "C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g"; }

	// $ANTLR start "JUNIOR_CLASS"
	public final void mJUNIOR_CLASS() throws RecognitionException {
		try {
			int _type = JUNIOR_CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:343:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
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
									if (state.backtracking>0) {state.failed=true; return ;}
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
								if (state.backtracking>0) {state.failed=true; return ;}
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
							if (state.backtracking>0) {state.failed=true; return ;}
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
						if (state.backtracking>0) {state.failed=true; return ;}
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
					if (state.backtracking>0) {state.failed=true; return ;}
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
											if (state.backtracking>0) {state.failed=true; return ;}
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
										if (state.backtracking>0) {state.failed=true; return ;}
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
									if (state.backtracking>0) {state.failed=true; return ;}
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
								if (state.backtracking>0) {state.failed=true; return ;}
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
							if (state.backtracking>0) {state.failed=true; return ;}
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
						if (state.backtracking>0) {state.failed=true; return ;}
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
					if (state.backtracking>0) {state.failed=true; return ;}
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
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:343:9: 'Master Class'
					{
					match("Master Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:344:9: 'Open Senior'
					{
					match("Open Senior"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:345:9: 'Open Intermediate'
					{
					match("Open Intermediate"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:346:9: 'Open Junior'
					{
					match("Open Junior"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:347:9: 'Novice Senior'
					{
					match("Novice Senior"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:348:9: 'Novice Junior'
					{
					match("Novice Junior"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:349:9: 'Novice Intermediate'
					{
					match("Novice Intermediate"); if (state.failed) return ;

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

	// $ANTLR start "FRAG_BREED_NAME_SINGLE"
	public final void mFRAG_BREED_NAME_SINGLE() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:5: ( ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=198;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:28: 'Affenpinscher'
					{
					match("Affenpinscher"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:343:5: 'Afghan Hound'
					{
					match("Afghan Hound"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:344:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:345:5: 'Akita'
					{
					match("Akita"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:346:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:347:5: 'American English Coonhound'
					{
					match("American English Coonhound"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:348:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:349:5: 'American Foxhound'
					{
					match("American Foxhound"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:350:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:352:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:353:2: 'Appenzeller Sennenhunde'
					{
					match("Appenzeller Sennenhunde"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:354:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:355:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:356:5: 'Australian Terrier'
					{
					match("Australian Terrier"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:357:5: 'Basenji'
					{
					match("Basenji"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:358:5: 'Basset Hound'
					{
					match("Basset Hound"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:359:5: 'Beagle'
					{
					match("Beagle"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:360:5: 'Bearded Collie'
					{
					match("Bearded Collie"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:361:5: 'Beauceron'
					{
					match("Beauceron"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:362:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:363:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:364:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:365:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:366:5: 'Berger Picard'
					{
					match("Berger Picard"); if (state.failed) return ;

					}
					break;
				case 25 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:367:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 26 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:368:5: 'Bichon Frise'
					{
					match("Bichon Frise"); if (state.failed) return ;

					}
					break;
				case 27 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:369:5: 'Bichons Frise'
					{
					match("Bichons Frise"); if (state.failed) return ;

					}
					break;
				case 28 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:370:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); if (state.failed) return ;

					}
					break;
				case 29 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:371:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); if (state.failed) return ;

					}
					break;
				case 30 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:372:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); if (state.failed) return ;

					}
					break;
				case 31 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:373:5: 'Bloodhound'
					{
					match("Bloodhound"); if (state.failed) return ;

					}
					break;
				case 32 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:374:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); if (state.failed) return ;

					}
					break;
				case 33 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:375:5: 'Border Collie'
					{
					match("Border Collie"); if (state.failed) return ;

					}
					break;
				case 34 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:376:5: 'Border Terrier'
					{
					match("Border Terrier"); if (state.failed) return ;

					}
					break;
				case 35 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:377:5: 'Borzoi'
					{
					match("Borzoi"); if (state.failed) return ;

					}
					break;
				case 36 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:378:5: 'Boston Terrier'
					{
					match("Boston Terrier"); if (state.failed) return ;

					}
					break;
				case 37 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:379:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); if (state.failed) return ;

					}
					break;
				case 38 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:380:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); if (state.failed) return ;

					}
					break;
				case 39 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:381:5: 'Boxer'
					{
					match("Boxer"); if (state.failed) return ;

					}
					break;
				case 40 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:382:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); if (state.failed) return ;

					}
					break;
				case 41 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:383:5: 'Brace'
					{
					match("Brace"); if (state.failed) return ;

					}
					break;
				case 42 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:384:5: 'Briard'
					{
					match("Briard"); if (state.failed) return ;

					}
					break;
				case 43 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:385:5: 'Brittany'
					{
					match("Brittany"); if (state.failed) return ;

					}
					break;
				case 44 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:386:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); if (state.failed) return ;

					}
					break;
				case 45 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:387:5: 'Bull Terrier'
					{
					match("Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 46 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:388:5: 'Bulldog'
					{
					match("Bulldog"); if (state.failed) return ;

					}
					break;
				case 47 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:389:5: 'Bullmastiff'
					{
					match("Bullmastiff"); if (state.failed) return ;

					}
					break;
				case 48 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:390:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); if (state.failed) return ;

					}
					break;
				case 49 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:391:5: 'Canaan Dog'
					{
					match("Canaan Dog"); if (state.failed) return ;

					}
					break;
				case 50 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:392:5: 'Cane Corso'
					{
					match("Cane Corso"); if (state.failed) return ;

					}
					break;
				case 51 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:393:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); if (state.failed) return ;

					}
					break;
				case 52 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:394:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); if (state.failed) return ;

					}
					break;
				case 53 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:395:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); if (state.failed) return ;

					}
					break;
				case 54 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:396:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); if (state.failed) return ;

					}
					break;
				case 55 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:397:5: 'Chihuahua'
					{
					match("Chihuahua"); if (state.failed) return ;

					}
					break;
				case 56 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:398:5: 'Chinese Crested'
					{
					match("Chinese Crested"); if (state.failed) return ;

					}
					break;
				case 57 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:399:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); if (state.failed) return ;

					}
					break;
				case 58 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:400:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); if (state.failed) return ;

					}
					break;
				case 59 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:401:5: 'Chow Chow'
					{
					match("Chow Chow"); if (state.failed) return ;

					}
					break;
				case 60 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:402:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); if (state.failed) return ;

					}
					break;
				case 61 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:403:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); if (state.failed) return ;

					}
					break;
				case 62 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:404:5: 'Collie'
					{
					match("Collie"); if (state.failed) return ;

					}
					break;
				case 63 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:405:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); if (state.failed) return ;

					}
					break;
				case 64 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:406:5: 'Dachshund'
					{
					match("Dachshund"); if (state.failed) return ;

					}
					break;
				case 65 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:407:5: 'Dalmatian'
					{
					match("Dalmatian"); if (state.failed) return ;

					}
					break;
				case 66 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:408:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); if (state.failed) return ;

					}
					break;
				case 67 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:409:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); if (state.failed) return ;

					}
					break;
				case 68 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:410:5: 'Dogo Argentine'
					{
					match("Dogo Argentine"); if (state.failed) return ;

					}
					break;
				case 69 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:411:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); if (state.failed) return ;

					}
					break;
				case 70 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:412:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); if (state.failed) return ;

					}
					break;
				case 71 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:413:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); if (state.failed) return ;

					}
					break;
				case 72 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:414:5: 'English Foxhound'
					{
					match("English Foxhound"); if (state.failed) return ;

					}
					break;
				case 73 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:415:5: 'English Setter'
					{
					match("English Setter"); if (state.failed) return ;

					}
					break;
				case 74 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:416:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); if (state.failed) return ;

					}
					break;
				case 75 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:417:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); if (state.failed) return ;

					}
					break;
				case 76 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:418:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 77 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:419:5: 'Field Spaniel'
					{
					match("Field Spaniel"); if (state.failed) return ;

					}
					break;
				case 78 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:420:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); if (state.failed) return ;

					}
					break;
				case 79 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:421:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); if (state.failed) return ;

					}
					break;
				case 80 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:422:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); if (state.failed) return ;

					}
					break;
				case 81 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:423:5: 'Fox Terrier'
					{
					match("Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 82 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:424:5: 'French Bulldog'
					{
					match("French Bulldog"); if (state.failed) return ;

					}
					break;
				case 83 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:425:5: 'German Pinscher'
					{
					match("German Pinscher"); if (state.failed) return ;

					}
					break;
				case 84 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:426:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); if (state.failed) return ;

					}
					break;
				case 85 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:427:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); if (state.failed) return ;

					}
					break;
				case 86 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:428:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); if (state.failed) return ;

					}
					break;
				case 87 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:429:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); if (state.failed) return ;

					}
					break;
				case 88 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:430:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); if (state.failed) return ;

					}
					break;
				case 89 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:431:5: 'Golden Retriever'
					{
					match("Golden Retriever"); if (state.failed) return ;

					}
					break;
				case 90 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:432:5: 'Gordon Setter'
					{
					match("Gordon Setter"); if (state.failed) return ;

					}
					break;
				case 91 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:433:5: 'Great Dane'
					{
					match("Great Dane"); if (state.failed) return ;

					}
					break;
				case 92 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:434:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); if (state.failed) return ;

					}
					break;
				case 93 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:435:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 94 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:436:5: 'Greyhound'
					{
					match("Greyhound"); if (state.failed) return ;

					}
					break;
				case 95 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:437:5: 'Harrier'
					{
					match("Harrier"); if (state.failed) return ;

					}
					break;
				case 96 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:438:5: 'Havanese'
					{
					match("Havanese"); if (state.failed) return ;

					}
					break;
				case 97 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:439:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); if (state.failed) return ;

					}
					break;
				case 98 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:440:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); if (state.failed) return ;

					}
					break;
				case 99 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:441:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); if (state.failed) return ;

					}
					break;
				case 100 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:442:5: 'Irish Setter'
					{
					match("Irish Setter"); if (state.failed) return ;

					}
					break;
				case 101 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:443:5: 'Irish Terrier'
					{
					match("Irish Terrier"); if (state.failed) return ;

					}
					break;
				case 102 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:444:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); if (state.failed) return ;

					}
					break;
				case 103 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:445:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); if (state.failed) return ;

					}
					break;
				case 104 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:446:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); if (state.failed) return ;

					}
					break;
				case 105 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:447:5: 'Japanese Chin'
					{
					match("Japanese Chin"); if (state.failed) return ;

					}
					break;
				case 106 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:448:5: 'Keeshond'
					{
					match("Keeshond"); if (state.failed) return ;

					}
					break;
				case 107 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:449:5: 'Keeshonden'
					{
					match("Keeshonden"); if (state.failed) return ;

					}
					break;
				case 108 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:450:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); if (state.failed) return ;

					}
					break;
				case 109 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:451:5: 'Komondor'
					{
					match("Komondor"); if (state.failed) return ;

					}
					break;
				case 110 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:452:5: 'Kuvasz'
					{
					match("Kuvasz"); if (state.failed) return ;

					}
					break;
				case 111 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:453:5: 'Kuvaszok'
					{
					match("Kuvaszok"); if (state.failed) return ;

					}
					break;
				case 112 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:454:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); if (state.failed) return ;

					}
					break;
				case 113 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:455:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); if (state.failed) return ;

					}
					break;
				case 114 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:456:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); if (state.failed) return ;

					}
					break;
				case 115 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:457:5: 'Leonberger'
					{
					match("Leonberger"); if (state.failed) return ;

					}
					break;
				case 116 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:458:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); if (state.failed) return ;

					}
					break;
				case 117 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:459:5: 'Löwchen'
					{
					match("Löwchen"); if (state.failed) return ;

					}
					break;
				case 118 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:460:5: 'Lowchen'
					{
					match("Lowchen"); if (state.failed) return ;

					}
					break;
				case 119 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:461:5: 'Maltese'
					{
					match("Maltese"); if (state.failed) return ;

					}
					break;
				case 120 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:462:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); if (state.failed) return ;

					}
					break;
				case 121 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:463:5: 'Mastiff'
					{
					match("Mastiff"); if (state.failed) return ;

					}
					break;
				case 122 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:464:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); if (state.failed) return ;

					}
					break;
				case 123 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:465:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 124 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:466:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); if (state.failed) return ;

					}
					break;
				case 125 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:467:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); if (state.failed) return ;

					}
					break;
				case 126 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:468:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); if (state.failed) return ;

					}
					break;
				case 127 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:469:5: 'Newfoundland'
					{
					match("Newfoundland"); if (state.failed) return ;

					}
					break;
				case 128 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:470:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); if (state.failed) return ;

					}
					break;
				case 129 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:471:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); if (state.failed) return ;

					}
					break;
				case 130 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:472:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); if (state.failed) return ;

					}
					break;
				case 131 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:473:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); if (state.failed) return ;

					}
					break;
				case 132 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:474:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); if (state.failed) return ;

					}
					break;
				case 133 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:475:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); if (state.failed) return ;

					}
					break;
				case 134 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:476:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); if (state.failed) return ;

					}
					break;
				case 135 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:477:5: 'Otterhound'
					{
					match("Otterhound"); if (state.failed) return ;

					}
					break;
				case 136 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:478:5: 'Papillon'
					{
					match("Papillon"); if (state.failed) return ;

					}
					break;
				case 137 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:479:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); if (state.failed) return ;

					}
					break;
				case 138 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:480:5: 'Pekingese'
					{
					match("Pekingese"); if (state.failed) return ;

					}
					break;
				case 139 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:481:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); if (state.failed) return ;

					}
					break;
				case 140 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:482:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); if (state.failed) return ;

					}
					break;
				case 141 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:483:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); if (state.failed) return ;

					}
					break;
				case 142 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:484:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); if (state.failed) return ;

					}
					break;
				case 143 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:485:5: 'Plott'
					{
					match("Plott"); if (state.failed) return ;

					}
					break;
				case 144 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:486:5: 'Pointer'
					{
					match("Pointer"); if (state.failed) return ;

					}
					break;
				case 145 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:487:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); if (state.failed) return ;

					}
					break;
				case 146 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:488:5: 'Pomeranian'
					{
					match("Pomeranian"); if (state.failed) return ;

					}
					break;
				case 147 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:489:5: 'Poodle'
					{
					match("Poodle"); if (state.failed) return ;

					}
					break;
				case 148 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:490:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); if (state.failed) return ;

					}
					break;
				case 149 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:491:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); if (state.failed) return ;

					}
					break;
				case 150 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:492:5: 'Pug'
					{
					match("Pug"); if (state.failed) return ;

					}
					break;
				case 151 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:493:5: 'Puli'
					{
					match("Puli"); if (state.failed) return ;

					}
					break;
				case 152 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:494:5: 'Pulik'
					{
					match("Pulik"); if (state.failed) return ;

					}
					break;
				case 153 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:495:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); if (state.failed) return ;

					}
					break;
				case 154 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:496:5: 'Rat Terrier'
					{
					match("Rat Terrier"); if (state.failed) return ;

					}
					break;
				case 155 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:497:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); if (state.failed) return ;

					}
					break;
				case 156 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:498:5: 'Retrievers'
					{
					match("Retrievers"); if (state.failed) return ;

					}
					break;
				case 157 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:499:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); if (state.failed) return ;

					}
					break;
				case 158 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:500:5: 'Rottweiler'
					{
					match("Rottweiler"); if (state.failed) return ;

					}
					break;
				case 159 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:501:5: 'Russell Terrier'
					{
					match("Russell Terrier"); if (state.failed) return ;

					}
					break;
				case 160 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:502:5: 'Saint Bernard'
					{
					match("Saint Bernard"); if (state.failed) return ;

					}
					break;
				case 161 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:503:5: 'Saluki'
					{
					match("Saluki"); if (state.failed) return ;

					}
					break;
				case 162 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:504:5: 'Samoyed'
					{
					match("Samoyed"); if (state.failed) return ;

					}
					break;
				case 163 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:505:5: 'Schipperke'
					{
					match("Schipperke"); if (state.failed) return ;

					}
					break;
				case 164 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:506:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); if (state.failed) return ;

					}
					break;
				case 165 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:507:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); if (state.failed) return ;

					}
					break;
				case 166 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:508:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); if (state.failed) return ;

					}
					break;
				case 167 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:509:5: 'Setters'
					{
					match("Setters"); if (state.failed) return ;

					}
					break;
				case 168 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:510:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); if (state.failed) return ;

					}
					break;
				case 169 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:511:5: 'Shiba Inu'
					{
					match("Shiba Inu"); if (state.failed) return ;

					}
					break;
				case 170 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:512:5: 'Shih Tzu'
					{
					match("Shih Tzu"); if (state.failed) return ;

					}
					break;
				case 171 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:513:5: 'Siberian Husky'
					{
					match("Siberian Husky"); if (state.failed) return ;

					}
					break;
				case 172 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:514:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); if (state.failed) return ;

					}
					break;
				case 173 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:515:5: 'Silky Terrier'
					{
					match("Silky Terrier"); if (state.failed) return ;

					}
					break;
				case 174 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:516:5: 'Skye Terrier'
					{
					match("Skye Terrier"); if (state.failed) return ;

					}
					break;
				case 175 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:517:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); if (state.failed) return ;

					}
					break;
				case 176 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:518:5: 'Spaniels'
					{
					match("Spaniels"); if (state.failed) return ;

					}
					break;
				case 177 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:519:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); if (state.failed) return ;

					}
					break;
				case 178 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:520:5: 'Spinoni Italiani'
					{
					match("Spinoni Italiani"); if (state.failed) return ;

					}
					break;
				case 179 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:521:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 180 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:522:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); if (state.failed) return ;

					}
					break;
				case 181 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:523:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); if (state.failed) return ;

					}
					break;
				case 182 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:524:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); if (state.failed) return ;

					}
					break;
				case 183 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:525:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); if (state.failed) return ;

					}
					break;
				case 184 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:526:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); if (state.failed) return ;

					}
					break;
				case 185 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:527:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); if (state.failed) return ;

					}
					break;
				case 186 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:528:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 187 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:529:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); if (state.failed) return ;

					}
					break;
				case 188 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:530:5: 'Vizsla'
					{
					match("Vizsla"); if (state.failed) return ;

					}
					break;
				case 189 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:531:5: 'Weimaraner'
					{
					match("Weimaraner"); if (state.failed) return ;

					}
					break;
				case 190 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:532:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); if (state.failed) return ;

					}
					break;
				case 191 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:533:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); if (state.failed) return ;

					}
					break;
				case 192 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:534:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); if (state.failed) return ;

					}
					break;
				case 193 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:535:5: 'Whippet'
					{
					match("Whippet"); if (state.failed) return ;

					}
					break;
				case 194 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:536:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 195 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:537:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); if (state.failed) return ;

					}
					break;
				case 196 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:538:2: 'Wirehaired Vizsla'
					{
					match("Wirehaired Vizsla"); if (state.failed) return ;

					}
					break;
				case 197 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:539:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); if (state.failed) return ;

					}
					break;
				case 198 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:540:5: 'Yorkshire Terrier'
					{
					match("Yorkshire Terrier"); if (state.failed) return ;

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

	// $ANTLR start "BREED_NAME"
	public final void mBREED_NAME() throws RecognitionException {
		try {
			int _type = BREED_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:5: ( ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:7: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:7: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
			int alt3=2;
			switch ( input.LA(1) ) {
			case 'A':
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
			case 'R':
			case 'S':
			case 'T':
			case 'W':
			case 'X':
			case 'Y':
				{
				alt3=1;
				}
				break;
			case 'B':
				{
				int LA3_2 = input.LA(2);
				if ( (LA3_2=='a'||LA3_2=='e'||LA3_2=='i'||LA3_2=='l'||LA3_2=='o'||LA3_2=='u') ) {
					alt3=1;
				}
				else if ( (LA3_2=='r') ) {
					int LA3_4 = input.LA(3);
					if ( (LA3_4=='a'||LA3_4=='i'||LA3_4=='u') ) {
						alt3=1;
					}
					else if ( (LA3_4=='o') ) {
						alt3=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'V':
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='i') ) {
					alt3=1;
				}
				else if ( (LA3_3=='e') ) {
					alt3=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:8: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:31: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:52: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:52: 's'
					{
					match('s'); if (state.failed) return ;
					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:57: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:57: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:61: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='(') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='1'||(LA8_1 >= 'A' && LA8_1 <= 'C')||(LA8_1 >= 'E' && LA8_1 <= 'G')||LA8_1=='I'||(LA8_1 >= 'K' && LA8_1 <= 'L')||LA8_1=='N'||(LA8_1 >= 'R' && LA8_1 <= 'T')||LA8_1=='W') ) {
					alt8=1;
				}
				else if ( (LA8_1=='M') ) {
					int LA8_4 = input.LA(3);
					if ( (LA8_4=='i') ) {
						int LA8_5 = input.LA(4);
						if ( (LA8_5=='n') ) {
							alt8=1;
						}
					}
				}
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:62: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); if (state.failed) return ;
					mFRAG_BREED_NAME_CATEGORY(); if (state.failed) return ;

					match(')'); if (state.failed) return ;
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:95: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:95: WS
							{
							mWS(); if (state.failed) return ;

							}
							break;

					}

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:99: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:99: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:135: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='('||LA9_0=='M') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:544:135: BREED_NAME_SUFFIX
					{
					mBREED_NAME_SUFFIX(); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:547:4: ( FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:547:8: FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP
			{
			mFRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP(); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:550:5: ( ( '(' BREED_MISC ')' ) | BREED_MISC )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='(') ) {
				alt10=1;
			}
			else if ( (LA10_0=='M') ) {
				alt10=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:550:9: ( '(' BREED_MISC ')' )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:550:9: ( '(' BREED_MISC ')' )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:550:10: '(' BREED_MISC ')'
					{
					match('('); if (state.failed) return ;
					mBREED_MISC(); if (state.failed) return ;

					match(')'); if (state.failed) return ;
					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:550:28: BREED_MISC
					{
					mBREED_MISC(); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREED_NAME_SUFFIX"

	// $ANTLR start "FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP"
	public final void mFRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:552:2: ( ( FRAG_BREED_ATTRIBUTE WS )? FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:552:4: ( FRAG_BREED_ATTRIBUTE WS )? FRAG_BREED_NAME_SPECIAL_SUFFIX
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:552:4: ( FRAG_BREED_ATTRIBUTE WS )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='B'||LA11_0=='V') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:552:5: FRAG_BREED_ATTRIBUTE WS
					{
					mFRAG_BREED_ATTRIBUTE(); if (state.failed) return ;

					mWS(); if (state.failed) return ;

					}
					break;

			}

			mFRAG_BREED_NAME_SPECIAL_SUFFIX(); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP"

	// $ANTLR start "BREED_MISC"
	public final void mBREED_MISC() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:555:2: ( 'Misc. Dog' | 'Misc. Dogs' | 'Misc. Bitch' | 'Misc. Bitches' )
			int alt12=4;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='M') ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='i') ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2=='s') ) {
						int LA12_3 = input.LA(4);
						if ( (LA12_3=='c') ) {
							int LA12_4 = input.LA(5);
							if ( (LA12_4=='.') ) {
								int LA12_5 = input.LA(6);
								if ( (LA12_5==' ') ) {
									int LA12_6 = input.LA(7);
									if ( (LA12_6=='D') ) {
										int LA12_7 = input.LA(8);
										if ( (LA12_7=='o') ) {
											int LA12_9 = input.LA(9);
											if ( (LA12_9=='g') ) {
												int LA12_11 = input.LA(10);
												if ( (LA12_11=='s') ) {
													alt12=2;
												}
												else {
													alt12=1;
												}
											}
											else {
												if (state.backtracking>0) {state.failed=true; return ;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 12, 9, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else {
											if (state.backtracking>0) {state.failed=true; return ;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 12, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else if ( (LA12_6=='B') ) {
										int LA12_8 = input.LA(8);
										if ( (LA12_8=='i') ) {
											int LA12_10 = input.LA(9);
											if ( (LA12_10=='t') ) {
												int LA12_12 = input.LA(10);
												if ( (LA12_12=='c') ) {
													int LA12_15 = input.LA(11);
													if ( (LA12_15=='h') ) {
														int LA12_16 = input.LA(12);
														if ( (LA12_16=='e') ) {
															alt12=4;
														}
														else {
															alt12=3;
														}
													}
													else {
														if (state.backtracking>0) {state.failed=true; return ;}
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++)
																input.consume();
															NoViableAltException nvae =
																new NoViableAltException("", 12, 15, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}
												}
												else {
													if (state.backtracking>0) {state.failed=true; return ;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 12, 12, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}
											}
											else {
												if (state.backtracking>0) {state.failed=true; return ;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 12, 10, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else {
											if (state.backtracking>0) {state.failed=true; return ;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 12, 8, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else {
										if (state.backtracking>0) {state.failed=true; return ;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 12, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 12, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 12, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 12, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:555:2: 'Misc. Dog'
					{
					match("Misc. Dog"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:555:14: 'Misc. Dogs'
					{
					match("Misc. Dogs"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:555:27: 'Misc. Bitch'
					{
					match("Misc. Bitch"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:555:41: 'Misc. Bitches'
					{
					match("Misc. Bitches"); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREED_MISC"

	// $ANTLR start "FRAG_SEX"
	public final void mFRAG_SEX() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:557:2: ( 'Dog' | 'Bitche' | 'Bitch' )
			int alt13=3;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='D') ) {
				alt13=1;
			}
			else if ( (LA13_0=='B') ) {
				int LA13_2 = input.LA(2);
				if ( (LA13_2=='i') ) {
					int LA13_3 = input.LA(3);
					if ( (LA13_3=='t') ) {
						int LA13_4 = input.LA(4);
						if ( (LA13_4=='c') ) {
							int LA13_5 = input.LA(5);
							if ( (LA13_5=='h') ) {
								int LA13_6 = input.LA(6);
								if ( (LA13_6=='e') ) {
									alt13=2;
								}
								else {
									alt13=3;
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 13, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 13, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 13, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:557:4: 'Dog'
					{
					match("Dog"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:557:10: 'Bitche'
					{
					match("Bitche"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:557:19: 'Bitch'
					{
					match("Bitch"); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_SEX"

	// $ANTLR start "FRAG_BREED_ATTRIBUTE"
	public final void mFRAG_BREED_ATTRIBUTE() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:559:2: ( 'Brood' | 'Veteran' ( 's' )? )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='B') ) {
				alt15=1;
			}
			else if ( (LA15_0=='V') ) {
				alt15=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:559:4: 'Brood'
					{
					match("Brood"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:559:12: 'Veteran' ( 's' )?
					{
					match("Veteran"); if (state.failed) return ;

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:559:21: ( 's' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='s') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:559:21: 's'
							{
							match('s'); if (state.failed) return ;
							}
							break;

					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_ATTRIBUTE"

	// $ANTLR start "FRAG_BREED_NAME_SPECIAL_SUFFIX"
	public final void mFRAG_BREED_NAME_SPECIAL_SUFFIX() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:561:5: ( 'Sweepstakes' WS ( 'e' | 'E' ) ( 'ntry' | 'ntries' ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:561:9: 'Sweepstakes' WS ( 'e' | 'E' ) ( 'ntry' | 'ntries' )
			{
			match("Sweepstakes"); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:561:36: ( 'ntry' | 'ntries' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='n') ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1=='t') ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2=='r') ) {
						int LA16_3 = input.LA(4);
						if ( (LA16_3=='y') ) {
							alt16=1;
						}
						else if ( (LA16_3=='i') ) {
							alt16=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 16, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:561:37: 'ntry'
					{
					match("ntry"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:561:44: 'ntries'
					{
					match("ntries"); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:562:29: ( FRAG_BREED_ATTRIBUTE WS FRAG_SEX )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:562:33: FRAG_BREED_ATTRIBUTE WS FRAG_SEX
			{
			mFRAG_BREED_ATTRIBUTE(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			mFRAG_SEX(); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:564:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
			int alt17=3;
			switch ( input.LA(1) ) {
			case 'A':
				{
				alt17=1;
				}
				break;
			case 'P':
				{
				alt17=2;
				}
				break;
			case 'B':
				{
				alt17=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:564:9: 'Ascob'
					{
					match("Ascob"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:564:17: 'Parti-Color'
					{
					match("Parti-Color"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:564:31: 'Black'
					{
					match("Black"); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:566:5: ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt18=38;
			alt18 = dfa18.predict(input);
			switch (alt18) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:567:9: '13 Inch'
					{
					match("13 Inch"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:568:9: '15 Inch'
					{
					match("15 Inch"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:569:9: 'American Water'
					{
					match("American Water"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:570:9: 'Boykin'
					{
					match("Boykin"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:571:9: 'B & P C'
					{
					match("B & P C"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:572:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:573:9: 'Clumber'
					{
					match("Clumber"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:574:9: 'Cocker'
					{
					match("Cocker"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:575:9: 'Colored'
					{
					match("Colored"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:576:9: 'Curly-Coated'
					{
					match("Curly-Coated"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:577:9: 'English'
					{
					match("English"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:578:9: 'English Cocker'
					{
					match("English Cocker"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:579:9: 'English Springer'
					{
					match("English Springer"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:580:9: 'Field'
					{
					match("Field"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:581:9: 'Flat-Coated'
					{
					match("Flat-Coated"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:582:9: 'German Shorthaired'
					{
					match("German Shorthaired"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:583:9: 'German Wirehaired'
					{
					match("German Wirehaired"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:584:9: 'Golden'
					{
					match("Golden"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:585:9: 'Gordon'
					{
					match("Gordon"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:586:9: 'Irish'
					{
					match("Irish"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:587:2: 'Irish Red And White'
					{
					match("Irish Red And White"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:588:9: 'Irish Water'
					{
					match("Irish Water"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:589:9: 'K C & R'
					{
					match("K C & R"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:590:9: 'Labrador'
					{
					match("Labrador"); if (state.failed) return ;

					}
					break;
				case 25 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:591:9: 'Long Coat'
					{
					match("Long Coat"); if (state.failed) return ;

					}
					break;
				case 26 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:592:9: 'Longhaired'
					{
					match("Longhaired"); if (state.failed) return ;

					}
					break;
				case 27 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:593:9: 'Miniature'
					{
					match("Miniature"); if (state.failed) return ;

					}
					break;
				case 28 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:594:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); if (state.failed) return ;

					}
					break;
				case 29 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:595:9: 'Rough'
					{
					match("Rough"); if (state.failed) return ;

					}
					break;
				case 30 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:596:9: 'Smooth'
					{
					match("Smooth"); if (state.failed) return ;

					}
					break;
				case 31 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:597:9: 'Smooth Coat'
					{
					match("Smooth Coat"); if (state.failed) return ;

					}
					break;
				case 32 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:598:9: 'Standard'
					{
					match("Standard"); if (state.failed) return ;

					}
					break;
				case 33 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:599:9: 'Sussex'
					{
					match("Sussex"); if (state.failed) return ;

					}
					break;
				case 34 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:600:9: 'Toy'
					{
					match("Toy"); if (state.failed) return ;

					}
					break;
				case 35 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:601:9: 'Welsh Springer'
					{
					match("Welsh Springer"); if (state.failed) return ;

					}
					break;
				case 36 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:602:9: 'White'
					{
					match("White"); if (state.failed) return ;

					}
					break;
				case 37 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:603:9: 'Wire'
					{
					match("Wire"); if (state.failed) return ;

					}
					break;
				case 38 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:604:9: 'Wirehaired'
					{
					match("Wirehaired"); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BREED_NAME_CATEGORY"

	// $ANTLR start "GROUP_NAME"
	public final void mGROUP_NAME() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:610:20: ( 'TOY' | 'HERDING' | 'TERRIER' | 'NON-SPORTING' | 'SPORTING' | 'HOUND' | 'WORKING' )
			int alt19=7;
			switch ( input.LA(1) ) {
			case 'T':
				{
				int LA19_1 = input.LA(2);
				if ( (LA19_1=='O') ) {
					alt19=1;
				}
				else if ( (LA19_1=='E') ) {
					alt19=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
				break;
			case 'H':
				{
				int LA19_2 = input.LA(2);
				if ( (LA19_2=='E') ) {
					alt19=2;
				}
				else if ( (LA19_2=='O') ) {
					alt19=6;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				alt19=4;
				}
				break;
			case 'S':
				{
				alt19=5;
				}
				break;
			case 'W':
				{
				alt19=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:610:22: 'TOY'
					{
					match("TOY"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:610:28: 'HERDING'
					{
					match("HERDING"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:610:38: 'TERRIER'
					{
					match("TERRIER"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:610:48: 'NON-SPORTING'
					{
					match("NON-SPORTING"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:610:63: 'SPORTING'
					{
					match("SPORTING"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:610:74: 'HOUND'
					{
					match("HOUND"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:610:82: 'WORKING'
					{
					match("WORKING"); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP_NAME"

	// $ANTLR start "FRAG_BEST_IN_SHOW"
	public final void mFRAG_BEST_IN_SHOW() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:612:2: ( 'BEST IN SHOW' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:612:4: 'BEST IN SHOW'
			{
			match("BEST IN SHOW"); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BEST_IN_SHOW"

	// $ANTLR start "FRAG_GROUP_NAME"
	public final void mFRAG_GROUP_NAME() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:615:2: ( ( GROUP_NAME ( ' GROUP' )=> ' GROUP' ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:615:3: ( GROUP_NAME ( ' GROUP' )=> ' GROUP' )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:615:3: ( GROUP_NAME ( ' GROUP' )=> ' GROUP' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:615:4: GROUP_NAME ( ' GROUP' )=> ' GROUP'
			{
			mGROUP_NAME(); if (state.failed) return ;

			match(" GROUP"); if (state.failed) return ;

			}

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:618:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
			int alt20=4;
			switch ( input.LA(1) ) {
			case 'V':
				{
				alt20=1;
				}
				break;
			case 'S':
				{
				alt20=2;
				}
				break;
			case 'R':
				{
				alt20=3;
				}
				break;
			case 'T':
				{
				alt20=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:619:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:620:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:621:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:622:3: 'Toy Variety Group'
					{
					match("Toy Variety Group"); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:625:2: ( FRAG_GROUP_NAME | FRAG_SPECIAL_GROUP_NAME | FRAG_BEST_IN_SHOW )
			int alt21=3;
			switch ( input.LA(1) ) {
			case 'T':
				{
				int LA21_1 = input.LA(2);
				if ( (LA21_1=='E'||LA21_1=='O') ) {
					alt21=1;
				}
				else if ( (LA21_1=='o') ) {
					alt21=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
			case 'H':
			case 'N':
			case 'W':
				{
				alt21=1;
				}
				break;
			case 'S':
				{
				int LA21_3 = input.LA(2);
				if ( (LA21_3=='P') ) {
					alt21=1;
				}
				else if ( (LA21_3=='W') ) {
					alt21=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
			case 'R':
			case 'V':
				{
				alt21=2;
				}
				break;
			case 'B':
				{
				alt21=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:625:4: FRAG_GROUP_NAME
					{
					mFRAG_GROUP_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:625:20: FRAG_SPECIAL_GROUP_NAME
					{
					mFRAG_SPECIAL_GROUP_NAME(); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:625:44: FRAG_BEST_IN_SHOW
					{
					mFRAG_BEST_IN_SHOW(); if (state.failed) return ;

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

	// $ANTLR start "NON_CONFORMATION_CLASS_NAME"
	public final void mNON_CONFORMATION_CLASS_NAME() throws RecognitionException {
		try {
			int _type = NON_CONFORMATION_CLASS_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:643:29: ( ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:2: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:2: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:3: NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			{
			mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:32: ( ' ' NON_CONFORMATION_CLASS_LEVEL )*
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==' ') ) {
					switch ( input.LA(2) ) {
					case 'A':
						{
						int LA22_3 = input.LA(3);
						if ( (LA22_3=='d') ) {
							alt22=1;
						}

						}
						break;
					case 'W':
						{
						int LA22_4 = input.LA(3);
						if ( (LA22_4=='a') ) {
							int LA22_7 = input.LA(4);
							if ( (LA22_7=='l') ) {
								int LA22_8 = input.LA(5);
								if ( (LA22_8=='k') ) {
									int LA22_9 = input.LA(6);
									if ( (LA22_9=='t') ) {
										int LA22_10 = input.LA(7);
										if ( (LA22_10=='h') ) {
											int LA22_11 = input.LA(8);
											if ( (LA22_11=='r') ) {
												int LA22_12 = input.LA(9);
												if ( (LA22_12=='o') ) {
													int LA22_13 = input.LA(10);
													if ( (LA22_13=='u') ) {
														int LA22_14 = input.LA(11);
														if ( (LA22_14=='g') ) {
															int LA22_15 = input.LA(12);
															if ( (LA22_15=='h') ) {
																alt22=1;
															}

														}

													}

												}

											}

										}

									}

								}

							}

						}
						else if ( (LA22_4=='i') ) {
							alt22=1;
						}

						}
						break;
					case 'B':
						{
						int LA22_5 = input.LA(3);
						if ( (LA22_5=='e') ) {
							alt22=1;
						}

						}
						break;
					case 'E':
					case 'G':
					case 'N':
					case 'O':
					case 'P':
					case 'U':
					case 'V':
						{
						alt22=1;
						}
						break;
					}
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:33: ' ' NON_CONFORMATION_CLASS_LEVEL
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

					}
					break;

				default :
					break loop22;
				}
			} while (true);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:67: ( ' ' NON_CONFORMATION_CLASS_SECTION )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==' ') ) {
				int LA23_1 = input.LA(2);
				if ( ((LA23_1 >= 'A' && LA23_1 <= 'B')) ) {
					alt23=1;
				}
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:68: ' ' NON_CONFORMATION_CLASS_SECTION
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_SECTION(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:104: ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==' ') ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:644:105: ' ' NON_CONFORMATION_CLASS_SUFFIX
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_SUFFIX(); if (state.failed) return ;

					}
					break;

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
	// $ANTLR end "NON_CONFORMATION_CLASS_NAME"

	// $ANTLR start "NON_CONFORMATION_CLASS_SECTION"
	public final void mNON_CONFORMATION_CLASS_SECTION() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:663:2: ( ( 'A' | 'B' ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'B') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
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
	// $ANTLR end "NON_CONFORMATION_CLASS_SECTION"

	// $ANTLR start "NON_CONFORMATION_CLASS_SUFFIX"
	public final void mNON_CONFORMATION_CLASS_SUFFIX() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:665:2: ( 'Class' | 'Walkthrough' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='C') ) {
				alt25=1;
			}
			else if ( (LA25_0=='W') ) {
				alt25=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:665:4: 'Class'
					{
					match("Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:665:12: 'Walkthrough'
					{
					match("Walkthrough"); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NON_CONFORMATION_CLASS_SUFFIX"

	// $ANTLR start "NON_CONFORMATION_CLASS_LEVEL"
	public final void mNON_CONFORMATION_CLASS_LEVEL() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:667:2: ( 'Advanced' | 'Beginner' | 'Excellent' | 'Utility' | 'Pre' | 'Open' | 'Novice' | 'Wild Card' | ( 'Pair' ( 's' )? ) | 'Graduate' | 'Walkthrough' | 'Versatility' | 'Veterans' )
			int alt27=13;
			switch ( input.LA(1) ) {
			case 'A':
				{
				alt27=1;
				}
				break;
			case 'B':
				{
				alt27=2;
				}
				break;
			case 'E':
				{
				alt27=3;
				}
				break;
			case 'U':
				{
				alt27=4;
				}
				break;
			case 'P':
				{
				int LA27_5 = input.LA(2);
				if ( (LA27_5=='r') ) {
					alt27=5;
				}
				else if ( (LA27_5=='a') ) {
					alt27=9;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				alt27=6;
				}
				break;
			case 'N':
				{
				alt27=7;
				}
				break;
			case 'W':
				{
				int LA27_8 = input.LA(2);
				if ( (LA27_8=='i') ) {
					alt27=8;
				}
				else if ( (LA27_8=='a') ) {
					alt27=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'G':
				{
				alt27=10;
				}
				break;
			case 'V':
				{
				int LA27_10 = input.LA(2);
				if ( (LA27_10=='e') ) {
					int LA27_15 = input.LA(3);
					if ( (LA27_15=='r') ) {
						alt27=12;
					}
					else if ( (LA27_15=='t') ) {
						alt27=13;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 27, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:668:2: 'Advanced'
					{
					match("Advanced"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:669:2: 'Beginner'
					{
					match("Beginner"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:670:2: 'Excellent'
					{
					match("Excellent"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:671:2: 'Utility'
					{
					match("Utility"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:672:2: 'Pre'
					{
					match("Pre"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:673:2: 'Open'
					{
					match("Open"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:674:2: 'Novice'
					{
					match("Novice"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:675:2: 'Wild Card'
					{
					match("Wild Card"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:676:2: ( 'Pair' ( 's' )? )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:676:2: ( 'Pair' ( 's' )? )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:676:3: 'Pair' ( 's' )?
					{
					match("Pair"); if (state.failed) return ;

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:676:9: ( 's' )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0=='s') ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:676:9: 's'
							{
							match('s'); if (state.failed) return ;
							}
							break;

					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:677:2: 'Graduate'
					{
					match("Graduate"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:678:2: 'Walkthrough'
					{
					match("Walkthrough"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:679:2: 'Versatility'
					{
					match("Versatility"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:680:3: 'Veterans'
					{
					match("Veterans"); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NON_CONFORMATION_CLASS_LEVEL"

	// $ANTLR start "NON_CONF_SECOND_LINE_COMMENT"
	public final void mNON_CONF_SECOND_LINE_COMMENT() throws RecognitionException {
		try {
			int _type = NON_CONF_SECOND_LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:684:2: ( FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:685:3: FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			{
			mFRAG_TO_FOLLOW(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:685:21: ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= 'A' && LA28_0 <= 'B')||LA28_0=='E'||LA28_0=='G'||(LA28_0 >= 'N' && LA28_0 <= 'P')||(LA28_0 >= 'U' && LA28_0 <= 'W')) ) {
				alt28=1;
			}
			else if ( (LA28_0=='R') ) {
				alt28=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:685:22: NON_CONFORMATION_CLASS_NAME
					{
					mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:685:50: RALLY_CLASS
					{
					mRALLY_CLASS(); if (state.failed) return ;

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
	// $ANTLR end "NON_CONF_SECOND_LINE_COMMENT"

	// $ANTLR start "FRAG_TO_FOLLOW"
	public final void mFRAG_TO_FOLLOW() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:687:2: ( 'To follow' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:687:4: 'To follow'
			{
			match("To follow"); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_TO_FOLLOW"

	// $ANTLR start "RALLY_CLASS"
	public final void mRALLY_CLASS() throws RecognitionException {
		try {
			int _type = RALLY_CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:689:2: ( FRAG_RALLY_CLASS_NAME )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:689:4: FRAG_RALLY_CLASS_NAME
			{
			mFRAG_RALLY_CLASS_NAME(); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_CLASS"

	// $ANTLR start "FRAG_RALLY_CLASS_NAME"
	public final void mFRAG_RALLY_CLASS_NAME() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:691:2: ( 'Rally ' NON_CONFORMATION_CLASS_NAME )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:691:4: 'Rally ' NON_CONFORMATION_CLASS_NAME
			{
			match("Rally "); if (state.failed) return ;

			mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_RALLY_CLASS_NAME"

	// $ANTLR start "FRAG_RALLY_CLASS_SECTION"
	public final void mFRAG_RALLY_CLASS_SECTION() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:693:2: ( 'Walkthrough' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:693:4: 'Walkthrough'
			{
			match("Walkthrough"); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_RALLY_CLASS_SECTION"

	// $ANTLR start "RALLY_ENTRY"
	public final void mRALLY_ENTRY() throws RecognitionException {
		try {
			int _type = RALLY_ENTRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:695:2: ( ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )* )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:695:4: ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:695:4: ( 'inch: ' )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='i') ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:695:4: 'inch: '
					{
					match("inch: "); if (state.failed) return ;

					}
					break;

			}

			mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:695:39: ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==';') ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:695:40: ';' FRAG_RALLY_ENTRANT_GROUP
					{
					match(';'); if (state.failed) return ;
					mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

					}
					break;

				default :
					break loop30;
				}
			} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_ENTRY"

	// $ANTLR start "NON_CONFORMATION_SECOND_LINE"
	public final void mNON_CONFORMATION_SECOND_LINE() throws RecognitionException {
		try {
			int _type = NON_CONFORMATION_SECOND_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:29: ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) )
			int alt40=2;
			alt40 = dfa40.predict(input);
			switch (alt40) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:31: ( '0' .. '9' )+ '-' ( '0' .. '9' )+
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:31: ( '0' .. '9' )+
					int cnt31=0;
					loop31:
					do {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( ((LA31_0 >= '0' && LA31_0 <= '9')) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(31, input);
								throw eee;
						}
						cnt31++;
					} while (true);

					match('-'); if (state.failed) return ;
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:43: ( '0' .. '9' )+
					int cnt32=0;
					loop32:
					do {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( ((LA32_0 >= '0' && LA32_0 <= '9')) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt32 >= 1 ) break loop32;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(32, input);
								throw eee;
						}
						cnt32++;
					} while (true);

					}

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:55: ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:55: ( '0' .. '9' )+
					int cnt33=0;
					loop33:
					do {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( ((LA33_0 >= '0' && LA33_0 <= '9')) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt33 >= 1 ) break loop33;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(33, input);
								throw eee;
						}
						cnt33++;
					} while (true);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:64: ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					int cnt39=0;
					loop39:
					do {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0=='-'||LA39_0==';') ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:65: ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							{
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:65: ( '-' ( '0' .. '9' )+ )?
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0=='-') ) {
								alt35=1;
							}
							switch (alt35) {
								case 1 :
									// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:66: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:69: ( '0' .. '9' )+
									int cnt34=0;
									loop34:
									do {
										int alt34=2;
										int LA34_0 = input.LA(1);
										if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
											alt34=1;
										}

										switch (alt34) {
										case 1 :
											// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
											{
											if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
												input.consume();
												state.failed=false;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return ;}
												MismatchedSetException mse = new MismatchedSetException(null,input);
												recover(mse);
												throw mse;
											}
											}
											break;

										default :
											if ( cnt34 >= 1 ) break loop34;
											if (state.backtracking>0) {state.failed=true; return ;}
												EarlyExitException eee =
													new EarlyExitException(34, input);
												throw eee;
										}
										cnt34++;
									} while (true);

									}
									break;

							}

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:80: ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:81: ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )?
							{
							match(';'); if (state.failed) return ;
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:84: ( '0' .. '9' )+
							int cnt36=0;
							loop36:
							do {
								int alt36=2;
								int LA36_0 = input.LA(1);
								if ( ((LA36_0 >= '0' && LA36_0 <= '9')) ) {
									alt36=1;
								}

								switch (alt36) {
								case 1 :
									// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return ;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt36 >= 1 ) break loop36;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(36, input);
										throw eee;
								}
								cnt36++;
							} while (true);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:93: ( '-' ( '0' .. '9' )+ )?
							int alt38=2;
							int LA38_0 = input.LA(1);
							if ( (LA38_0=='-') ) {
								int LA38_1 = input.LA(2);
								if ( ((LA38_1 >= '0' && LA38_1 <= '9')) ) {
									alt38=1;
								}
							}
							switch (alt38) {
								case 1 :
									// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:94: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:703:97: ( '0' .. '9' )+
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
											// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
											{
											if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
												input.consume();
												state.failed=false;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return ;}
												MismatchedSetException mse = new MismatchedSetException(null,input);
												recover(mse);
												throw mse;
											}
											}
											break;

										default :
											if ( cnt37 >= 1 ) break loop37;
											if (state.backtracking>0) {state.failed=true; return ;}
												EarlyExitException eee =
													new EarlyExitException(37, input);
												throw eee;
										}
										cnt37++;
									} while (true);

									}
									break;

							}

							}

							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(39, input);
								throw eee;
						}
						cnt39++;
					} while (true);

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
	// $ANTLR end "NON_CONFORMATION_SECOND_LINE"

	// $ANTLR start "FRAG_RALLY_SINGLE_ENTRANT"
	public final void mFRAG_RALLY_SINGLE_ENTRANT() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:706:2: ( 'R' ( '0' .. '9' )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:706:4: 'R' ( '0' .. '9' )+
			{
			match('R'); if (state.failed) return ;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:706:7: ( '0' .. '9' )+
			int cnt41=0;
			loop41:
			do {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( ((LA41_0 >= '0' && LA41_0 <= '9')) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt41 >= 1 ) break loop41;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(41, input);
						throw eee;
				}
				cnt41++;
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_RALLY_SINGLE_ENTRANT"

	// $ANTLR start "FRAG_RALLY_ENTRANT_GROUP"
	public final void mFRAG_RALLY_ENTRANT_GROUP() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:707:34: ( FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )* )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:708:2: FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			{
			mFRAG_RALLY_SINGLE_ENTRANT(); if (state.failed) return ;

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:708:28: ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			loop42:
			do {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( ((LA42_0 >= ',' && LA42_0 <= '-')) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:708:29: ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT
					{
					if ( (input.LA(1) >= ',' && input.LA(1) <= '-') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					mFRAG_RALLY_SINGLE_ENTRANT(); if (state.failed) return ;

					}
					break;

				default :
					break loop42;
				}
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_RALLY_ENTRANT_GROUP"

	// $ANTLR start "FRAG_MONTH"
	public final void mFRAG_MONTH() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:711:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt43=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt43=1;
					}
					break;
				case 'A':
					{
					alt43=2;
					}
					break;
				case 'u':
					{
					int LA43_11 = input.LA(3);
					if ( (LA43_11=='n') ) {
						alt43=11;
					}
					else if ( (LA43_11=='l') ) {
						alt43=13;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 43, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'U':
					{
					int LA43_12 = input.LA(3);
					if ( (LA43_12=='N') ) {
						alt43=12;
					}
					else if ( (LA43_12=='L') ) {
						alt43=14;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 43, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA43_2 = input.LA(2);
				if ( (LA43_2=='e') ) {
					alt43=3;
				}
				else if ( (LA43_2=='E') ) {
					alt43=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA43_3 = input.LA(2);
				if ( (LA43_3=='a') ) {
					int LA43_15 = input.LA(3);
					if ( (LA43_15=='r') ) {
						alt43=5;
					}
					else if ( (LA43_15=='y') ) {
						alt43=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 43, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA43_3=='A') ) {
					int LA43_16 = input.LA(3);
					if ( (LA43_16=='R') ) {
						alt43=6;
					}
					else if ( (LA43_16=='Y') ) {
						alt43=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 43, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 3, input);
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
					alt43=7;
					}
					break;
				case 'P':
					{
					alt43=8;
					}
					break;
				case 'u':
					{
					alt43=15;
					}
					break;
				case 'U':
					{
					alt43=16;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA43_5 = input.LA(2);
				if ( (LA43_5=='e') ) {
					alt43=17;
				}
				else if ( (LA43_5=='E') ) {
					alt43=18;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				int LA43_6 = input.LA(2);
				if ( (LA43_6=='c') ) {
					alt43=19;
				}
				else if ( (LA43_6=='C') ) {
					alt43=20;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA43_7 = input.LA(2);
				if ( (LA43_7=='o') ) {
					alt43=21;
				}
				else if ( (LA43_7=='O') ) {
					alt43=22;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA43_8 = input.LA(2);
				if ( (LA43_8=='e') ) {
					alt43=23;
				}
				else if ( (LA43_8=='E') ) {
					alt43=24;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:711:27: 'January'
					{
					match("January"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:711:37: 'JANUARY'
					{
					match("JANUARY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:712:14: 'February'
					{
					match("February"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:712:25: 'FEBRUARY'
					{
					match("FEBRUARY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:713:14: 'March'
					{
					match("March"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:713:22: 'MARCH'
					{
					match("MARCH"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:714:14: 'April'
					{
					match("April"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:714:22: 'APRIL'
					{
					match("APRIL"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:715:14: 'May'
					{
					match("May"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:715:20: 'MAY'
					{
					match("MAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:716:14: 'June'
					{
					match("June"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:716:21: 'JUNE'
					{
					match("JUNE"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:717:14: 'July'
					{
					match("July"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:717:21: 'JULY'
					{
					match("JULY"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:718:14: 'August'
					{
					match("August"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:718:23: 'AUGUST'
					{
					match("AUGUST"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:719:14: 'September'
					{
					match("September"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:719:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:720:14: 'October'
					{
					match("October"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:720:24: 'OCTOBER'
					{
					match("OCTOBER"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:721:14: 'November'
					{
					match("November"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:721:25: 'NOVEMBER'
					{
					match("NOVEMBER"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:722:14: 'December'
					{
					match("December"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:722:25: 'DECEMBER'
					{
					match("DECEMBER"); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_MONTH"

	// $ANTLR start "END_PUNCTUATION"
	public final void mEND_PUNCTUATION() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:724:29: ( '!' | '?' | '.' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:725:25: ( 'RING' | 'Ring' )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0=='R') ) {
				int LA44_1 = input.LA(2);
				if ( (LA44_1=='I') ) {
					alt44=1;
				}
				else if ( (LA44_1=='i') ) {
					alt44=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:725:29: 'RING'
					{
					match("RING"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:725:36: 'Ring'
					{
					match("Ring"); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:726:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( input.LA(1)=='\''||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='_'||input.LA(1)=='\u2019' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:729:5: ( '&' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:729:9: '&'
			{
			match('&'); if (state.failed) return ;
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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:732:5: ( 'am' | 'pm' )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0=='a') ) {
				alt45=1;
			}
			else if ( (LA45_0=='p') ) {
				alt45=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:732:9: 'am'
					{
					match("am"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:732:14: 'pm'
					{
					match("pm"); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:735:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
			int alt46=12;
			switch ( input.LA(1) ) {
			case 'M':
				{
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA46_4 = input.LA(3);
					if ( (LA46_4=='S') ) {
						alt46=3;
					}
					else {
						alt46=1;
					}
					}
					break;
				case 'r':
					{
					int LA46_5 = input.LA(3);
					if ( (LA46_5=='s') ) {
						alt46=4;
					}
					else {
						alt46=2;
					}
					}
					break;
				case 'S':
					{
					alt46=5;
					}
					break;
				case 's':
					{
					alt46=6;
					}
					break;
				case 'I':
					{
					alt46=7;
					}
					break;
				case 'i':
					{
					alt46=8;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA46_2 = input.LA(2);
				if ( (LA46_2=='R') ) {
					alt46=9;
				}
				else if ( (LA46_2=='r') ) {
					alt46=10;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'C':
				{
				int LA46_3 = input.LA(2);
				if ( (LA46_3=='O') ) {
					alt46=11;
				}
				else if ( (LA46_3=='o') ) {
					alt46=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:735:9: 'MR'
					{
					match("MR"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:735:14: 'Mr'
					{
					match("Mr"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:736:9: 'MRS'
					{
					match("MRS"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:736:15: 'Mrs'
					{
					match("Mrs"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:737:9: 'MS'
					{
					match("MS"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:737:14: 'Ms'
					{
					match("Ms"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:738:9: 'MISS'
					{
					match("MISS"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:738:16: 'Miss'
					{
					match("Miss"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:739:10: 'DR'
					{
					match("DR"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:739:15: 'Dr'
					{
					match("Dr"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:740:9: 'COL'
					{
					match("COL"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:740:15: 'Col'
					{
					match("Col"); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:743:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt47=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt47=1;
					}
					break;
				case 'U':
					{
					alt47=2;
					}
					break;
				case 'a':
					{
					alt47=13;
					}
					break;
				case 'A':
					{
					alt47=14;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA47_2 = input.LA(2);
				if ( (LA47_2=='o') ) {
					alt47=3;
				}
				else if ( (LA47_2=='O') ) {
					alt47=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 2, input);
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
					alt47=5;
					}
					break;
				case 'U':
					{
					alt47=6;
					}
					break;
				case 'h':
					{
					alt47=9;
					}
					break;
				case 'H':
					{
					alt47=10;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'W':
				{
				int LA47_4 = input.LA(2);
				if ( (LA47_4=='e') ) {
					alt47=7;
				}
				else if ( (LA47_4=='E') ) {
					alt47=8;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA47_5 = input.LA(2);
				if ( (LA47_5=='r') ) {
					alt47=11;
				}
				else if ( (LA47_5=='R') ) {
					alt47=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:743:27: 'Sunday'
					{
					match("Sunday"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:743:36: 'SUNDAY'
					{
					match("SUNDAY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:744:9: 'Monday'
					{
					match("Monday"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:744:18: 'MONDAY'
					{
					match("MONDAY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:745:9: 'Tuesday'
					{
					match("Tuesday"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:745:19: 'TUESDAY'
					{
					match("TUESDAY"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:746:9: 'Wednesday'
					{
					match("Wednesday"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:746:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:747:9: 'Thursday'
					{
					match("Thursday"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:747:20: 'THURSDAY'
					{
					match("THURSDAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:748:9: 'Friday'
					{
					match("Friday"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:748:18: 'FRIDAY'
					{
					match("FRIDAY"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:749:9: 'Saturday'
					{
					match("Saturday"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:749:20: 'SATURDAY'
					{
					match("SATURDAY"); if (state.failed) return ;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_WEEK_DAY"

	// $ANTLR start "STANDALONE_COMMENT"
	public final void mSTANDALONE_COMMENT() throws RecognitionException {
		try {
			int _type = STANDALONE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:766:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0=='L') ) {
				alt48=1;
			}
			else if ( (LA48_0=='V') ) {
				alt48=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:766:9: 'LUNCH'
					{
					match("LUNCH"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:766:17: 'VARIETY GROUP JUDGING'
					{
					match("VARIETY GROUP JUDGING"); if (state.failed) return ;

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

	// $ANTLR start "BREED_COUNT"
	public final void mBREED_COUNT() throws RecognitionException {
		try {
			int _type = BREED_COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:763:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:763:17: INT '-' INT '-' INT '-' INT
			{
			mINT(); if (state.failed) return ;

			match('-'); if (state.failed) return ;
			mINT(); if (state.failed) return ;

			match('-'); if (state.failed) return ;
			mINT(); if (state.failed) return ;

			match('-'); if (state.failed) return ;
			mINT(); if (state.failed) return ;

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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			mFRAG_PROPER_NAME(); if (state.failed) return ;

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+
			int cnt50=0;
			loop50:
			do {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==' ') ) {
					int LA50_1 = input.LA(2);
					if ( (LA50_1=='(') ) {
						int LA50_3 = input.LA(3);
						if ( ((LA50_3 >= 'A' && LA50_3 <= 'Z')) ) {
							alt50=1;
						}

					}
					else if ( ((LA50_1 >= 'A' && LA50_1 <= 'Z')) ) {
						alt50=1;
					}

				}

				switch (alt50) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); if (state.failed) return ;
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0=='(') ) {
						alt49=1;
					}
					else if ( ((LA49_0 >= 'A' && LA49_0 <= 'Z')) ) {
						alt49=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 49, 0, input);
						throw nvae;
					}
					switch (alt49) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:66: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:85: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

				default :
					if ( cnt50 >= 1 ) break loop50;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(50, input);
						throw eee;
				}
				cnt50++;
			} while (true);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:106: ( WS )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( ((LA51_0 >= '\t' && LA51_0 <= '\n')||LA51_0=='\r'||LA51_0==' ') ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:106: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:110: ( PARENTHETICAL_INT )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0=='(') ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:764:110: PARENTHETICAL_INT
					{
					mPARENTHETICAL_INT(); if (state.failed) return ;

					}
					break;

			}

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
	// $ANTLR end "JUDGE_NAME"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:767:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:767:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:767:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt53=0;
			loop53:
			do {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( ((LA53_0 >= '\t' && LA53_0 <= '\n')||LA53_0=='\r'||LA53_0==' ') ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt53 >= 1 ) break loop53;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(53, input);
						throw eee;
				}
				cnt53++;
			} while (true);

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:13: ( ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:17: ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:17: ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0=='G') && (synpred2_test())) {
				alt54=1;
			}
			else if ( (LA54_0=='R') ) {
				alt54=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:18: ( 'GROUP RING' )=> 'GROUP RING'
					{
					match("GROUP RING"); if (state.failed) return ;

					if ( state.backtracking==0 ) {allowGroup=true;}
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:65: ( 'RING' WS INT )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:65: ( 'RING' WS INT )
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:66: 'RING' WS INT
					{
					match("RING"); if (state.failed) return ;

					mWS(); if (state.failed) return ;

					mINT(); if (state.failed) return ;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {allowJudge=true;}
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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:772:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>) )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:772:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			{
			match('('); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			match(')'); if (state.failed) return ;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:773:6: ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( ((LA56_0 >= '\t' && LA56_0 <= '\n')||LA56_0=='\r'||LA56_0==' ') && (synpred3_test())) {
				alt56=1;
			}
			else if ( ((LA56_0 >= '0' && LA56_0 <= '9')) && (synpred3_test())) {
				alt56=1;
			}
			else {
				alt56=2;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:773:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:773:83: ( WS )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( ((LA55_0 >= '\t' && LA55_0 <= '\n')||LA55_0=='\r'||LA55_0==' ') ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:773:83: WS
							{
							mWS(); if (state.failed) return ;

							}
							break;

					}

					matchRange('0','9'); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					match('-'); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:774:8: ()=>
					{
					if ( state.backtracking==0 ) {_type=PARENTHETICAL_INT;}
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
	// $ANTLR end "PHONE_NUMBER"

	// $ANTLR start "TIME"
	public final void mTIME() throws RecognitionException {
		try {
			int _type = TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:775:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:775:13: INT ':' INT WS FRAG_TIME_LABEL
			{
			mINT(); if (state.failed) return ;

			match(':'); if (state.failed) return ;
			mINT(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			mFRAG_TIME_LABEL(); if (state.failed) return ;

			if ( state.backtracking==0 ) {allowBreed=true;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIME"

	// $ANTLR start "FOLLOWING_TIME"
	public final void mFOLLOWING_TIME() throws RecognitionException {
		try {
			int _type = FOLLOWING_TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:777:2: ( 'minutes following Best in Show' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:777:4: 'minutes following Best in Show'
			{
			match("minutes following Best in Show"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOLLOWING_TIME"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:779:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:779:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
			{
			mFRAG_WEEK_DAY(); if (state.failed) return ;

			match(','); if (state.failed) return ;
			mWS(); if (state.failed) return ;

			mFRAG_MONTH(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			mINT(); if (state.failed) return ;

			match(','); if (state.failed) return ;
			mWS(); if (state.failed) return ;

			mINT(); if (state.failed) return ;

			if ( state.backtracking==0 ) {allowBreed=true;}
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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:781:9: ( ( '.' )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:781:13: ( '.' )+
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:781:13: ( '.' )+
			int cnt57=0;
			loop57:
			do {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0=='.') ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:781:13: '.'
					{
					match('.'); if (state.failed) return ;
					}
					break;

				default :
					if ( cnt57 >= 1 ) break loop57;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(57, input);
						throw eee;
				}
				cnt57++;
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
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:783:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:783:6: ( '0' .. '9' )+
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:783:6: ( '0' .. '9' )+
			int cnt58=0;
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( ((LA58_0 >= '0' && LA58_0 <= '9')) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt58 >= 1 ) break loop58;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(58, input);
						throw eee;
				}
				cnt58++;
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

	// $ANTLR start "PARENTHETICAL"
	public final void mPARENTHETICAL() throws RecognitionException {
		try {
			int _type = PARENTHETICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:13: ( WORD | INT | FRAG_PROPER_NAME )
			int alt59=3;
			switch ( input.LA(1) ) {
			case '&':
			case '\'':
			case ',':
			case '-':
			case ':':
			case ';':
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
				alt59=1;
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
				alt59=2;
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
				{
				alt59=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:14: WORD
					{
					mWORD(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:19: INT
					{
					mINT(); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( ((LA61_0 >= '\t' && LA61_0 <= '\n')||LA61_0=='\r'||LA61_0==' ') ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); if (state.failed) return ;

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:45: ( WORD | INT | FRAG_PROPER_NAME )
					int alt60=3;
					switch ( input.LA(1) ) {
					case '&':
					case '\'':
					case ',':
					case '-':
					case ':':
					case ';':
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
						alt60=1;
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
						alt60=2;
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
						{
						alt60=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 60, 0, input);
						throw nvae;
					}
					switch (alt60) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:46: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:786:55: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

				default :
					break loop61;
				}
			} while (true);

			match(')'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHETICAL"

	// $ANTLR start "FRAG_PROPER_NAME"
	public final void mFRAG_PROPER_NAME() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:787:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:787:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:787:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:787:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); if (state.failed) return ;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:787:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( ((LA62_0 >= '&' && LA62_0 <= '\'')||(LA62_0 >= ',' && LA62_0 <= '-')||(LA62_0 >= ':' && LA62_0 <= ';')||(LA62_0 >= 'A' && LA62_0 <= 'Z')||LA62_0=='_'||(LA62_0 >= 'a' && LA62_0 <= 'z')||LA62_0=='\u2019') ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= '&' && input.LA(1) <= '\'')||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u2019' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop62;
				}
			} while (true);

			}

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:787:94: ( END_PUNCTUATION )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0=='!'||LA63_0=='.'||LA63_0=='?') ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='.'||input.LA(1)=='?' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
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
	// $ANTLR end "FRAG_PROPER_NAME"

	// $ANTLR start "PARENTHETICAL_INT"
	public final void mPARENTHETICAL_INT() throws RecognitionException {
		try {
			int _type = PARENTHETICAL_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:790:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:790:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:790:13: ( WS )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( ((LA64_0 >= '\t' && LA64_0 <= '\n')||LA64_0=='\r'||LA64_0==' ') ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:790:13: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			mINT(); if (state.failed) return ;

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:790:21: ( WS )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( ((LA65_0 >= '\t' && LA65_0 <= '\n')||LA65_0=='\r'||LA65_0==' ') ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:790:21: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			match(')'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHETICAL_INT"

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:791:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:791:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:791:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt66=0;
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( ((LA66_0 >= '&' && LA66_0 <= '\'')||(LA66_0 >= ',' && LA66_0 <= '-')||(LA66_0 >= ':' && LA66_0 <= ';')||LA66_0=='_'||(LA66_0 >= 'a' && LA66_0 <= 'z')||LA66_0=='\u2019') ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( (input.LA(1) >= '&' && input.LA(1) <= '\'')||(input.LA(1) >= ',' && input.LA(1) <= '-')||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u2019' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt66 >= 1 ) break loop66;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(66, input);
						throw eee;
				}
				cnt66++;
			} while (true);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:791:65: ( END_PUNCTUATION )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0=='!'||LA67_0=='.'||LA67_0=='?') ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='.'||input.LA(1)=='?' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
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
	// $ANTLR end "WORD"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			int cnt69=0;
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( ((LA69_0 >= '&' && LA69_0 <= '(')||(LA69_0 >= ',' && LA69_0 <= '.')||(LA69_0 >= '0' && LA69_0 <= ';')||(LA69_0 >= 'A' && LA69_0 <= 'Z')||LA69_0=='_'||(LA69_0 >= 'a' && LA69_0 <= 'z')||LA69_0=='\u2019') ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					int alt68=5;
					switch ( input.LA(1) ) {
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
						{
						alt68=1;
						}
						break;
					case '&':
					case '\'':
					case ',':
					case '-':
					case ':':
					case ';':
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
						alt68=2;
						}
						break;
					case '(':
						{
						alt68=3;
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
						alt68=4;
						}
						break;
					case '.':
						{
						alt68=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 68, 0, input);
						throw nvae;
					}
					switch (alt68) {
						case 1 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:32: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:37: PARENTHETICAL
							{
							mPARENTHETICAL(); if (state.failed) return ;

							}
							break;
						case 4 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 5 :
							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:792:55: ELLIPSIS
							{
							mELLIPSIS(); if (state.failed) return ;

							}
							break;

					}

					if ( state.backtracking==0 ) {/*allowBreed=false;*/ allowGroup=false;allowJudge=false;}
					}
					break;

				default :
					if ( cnt69 >= 1 ) break loop69;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(69, input);
						throw eee;
				}
				cnt69++;
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

	// $ANTLR start "END_WORD"
	public final void mEND_WORD() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:794:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:794:4: WORD END_PUNCTUATION
			{
			mWORD(); if (state.failed) return ;

			mEND_PUNCTUATION(); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END_WORD"

	// $ANTLR start "GROUP_ENDING_ANNOUNCEMENT"
	public final void mGROUP_ENDING_ANNOUNCEMENT() throws RecognitionException {
		try {
			int _type = GROUP_ENDING_ANNOUNCEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:795:26: ( 'Unless otherwise announced' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:795:27: 'Unless otherwise announced'
			{
			match("Unless otherwise announced"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP_ENDING_ANNOUNCEMENT"

	// $ANTLR start "PARENTHETICAL_NAME"
	public final void mPARENTHETICAL_NAME() throws RecognitionException {
		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:796:28: ( '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')' )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:796:30: '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:796:34: ( FRAG_TITLE WS )?
			int alt70=2;
			switch ( input.LA(1) ) {
				case 'M':
					{
					switch ( input.LA(2) ) {
						case 'R':
							{
							int LA70_5 = input.LA(3);
							if ( (LA70_5=='S') ) {
								int LA70_15 = input.LA(4);
								if ( ((LA70_15 >= '\t' && LA70_15 <= '\n')||LA70_15=='\r'||LA70_15==' ') ) {
									alt70=1;
								}
							}
							else if ( ((LA70_5 >= '\t' && LA70_5 <= '\n')||LA70_5=='\r'||LA70_5==' ') ) {
								alt70=1;
							}
							}
							break;
						case 'r':
							{
							int LA70_6 = input.LA(3);
							if ( (LA70_6=='s') ) {
								int LA70_17 = input.LA(4);
								if ( ((LA70_17 >= '\t' && LA70_17 <= '\n')||LA70_17=='\r'||LA70_17==' ') ) {
									alt70=1;
								}
							}
							else if ( ((LA70_6 >= '\t' && LA70_6 <= '\n')||LA70_6=='\r'||LA70_6==' ') ) {
								alt70=1;
							}
							}
							break;
						case 'S':
							{
							int LA70_7 = input.LA(3);
							if ( ((LA70_7 >= '\t' && LA70_7 <= '\n')||LA70_7=='\r'||LA70_7==' ') ) {
								alt70=1;
							}
							}
							break;
						case 's':
							{
							int LA70_8 = input.LA(3);
							if ( ((LA70_8 >= '\t' && LA70_8 <= '\n')||LA70_8=='\r'||LA70_8==' ') ) {
								alt70=1;
							}
							}
							break;
						case 'I':
							{
							int LA70_9 = input.LA(3);
							if ( (LA70_9=='S') ) {
								int LA70_18 = input.LA(4);
								if ( (LA70_18=='S') ) {
									int LA70_22 = input.LA(5);
									if ( ((LA70_22 >= '\t' && LA70_22 <= '\n')||LA70_22=='\r'||LA70_22==' ') ) {
										alt70=1;
									}
								}
							}
							}
							break;
						case 'i':
							{
							int LA70_10 = input.LA(3);
							if ( (LA70_10=='s') ) {
								int LA70_19 = input.LA(4);
								if ( (LA70_19=='s') ) {
									int LA70_23 = input.LA(5);
									if ( ((LA70_23 >= '\t' && LA70_23 <= '\n')||LA70_23=='\r'||LA70_23==' ') ) {
										alt70=1;
									}
								}
							}
							}
							break;
					}
					}
					break;
				case 'D':
					{
					int LA70_2 = input.LA(2);
					if ( (LA70_2=='R') ) {
						int LA70_11 = input.LA(3);
						if ( ((LA70_11 >= '\t' && LA70_11 <= '\n')||LA70_11=='\r'||LA70_11==' ') ) {
							alt70=1;
						}
					}
					else if ( (LA70_2=='r') ) {
						int LA70_12 = input.LA(3);
						if ( ((LA70_12 >= '\t' && LA70_12 <= '\n')||LA70_12=='\r'||LA70_12==' ') ) {
							alt70=1;
						}
					}
					}
					break;
				case 'C':
					{
					int LA70_3 = input.LA(2);
					if ( (LA70_3=='O') ) {
						int LA70_13 = input.LA(3);
						if ( (LA70_13=='L') ) {
							int LA70_20 = input.LA(4);
							if ( ((LA70_20 >= '\t' && LA70_20 <= '\n')||LA70_20=='\r'||LA70_20==' ') ) {
								alt70=1;
							}
						}
					}
					else if ( (LA70_3=='o') ) {
						int LA70_14 = input.LA(3);
						if ( (LA70_14=='l') ) {
							int LA70_21 = input.LA(4);
							if ( ((LA70_21 >= '\t' && LA70_21 <= '\n')||LA70_21=='\r'||LA70_21==' ') ) {
								alt70=1;
							}
						}
					}
					}
					break;
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:796:35: FRAG_TITLE WS
					{
					mFRAG_TITLE(); if (state.failed) return ;

					mWS(); if (state.failed) return ;

					}
					break;

			}

			mFRAG_PROPER_NAME(); if (state.failed) return ;

			match(')'); if (state.failed) return ;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHETICAL_NAME"

	// $ANTLR start "FallThrough"
	public final void mFallThrough() throws RecognitionException {
		try {
			int _type = FallThrough;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:801:3: ( . )
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:801:6: .
			{
			matchAny(); if (state.failed) return ;
			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
			if ( state.backtracking==0 ) {
			  //System.err.println("Ooops! " + getText() + " fell through");
			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FallThrough"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | FOLLOWING_TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | GROUP_ENDING_ANNOUNCEMENT | FallThrough )
		int alt71=25;
		alt71 = dfa71.predict(input);
		switch (alt71) {
			case 1 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:10: JUNIOR_CLASS
				{
				mJUNIOR_CLASS(); if (state.failed) return ;

				}
				break;
			case 2 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:23: BREED_NAME
				{
				mBREED_NAME(); if (state.failed) return ;

				}
				break;
			case 3 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:34: SPECIAL_SUFFIX
				{
				mSPECIAL_SUFFIX(); if (state.failed) return ;

				}
				break;
			case 4 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:49: GROUP_RING
				{
				mGROUP_RING(); if (state.failed) return ;

				}
				break;
			case 5 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:60: NON_CONFORMATION_CLASS_NAME
				{
				mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

				}
				break;
			case 6 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:88: NON_CONF_SECOND_LINE_COMMENT
				{
				mNON_CONF_SECOND_LINE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 7 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:117: RALLY_CLASS
				{
				mRALLY_CLASS(); if (state.failed) return ;

				}
				break;
			case 8 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:129: RALLY_ENTRY
				{
				mRALLY_ENTRY(); if (state.failed) return ;

				}
				break;
			case 9 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:141: NON_CONFORMATION_SECOND_LINE
				{
				mNON_CONFORMATION_SECOND_LINE(); if (state.failed) return ;

				}
				break;
			case 10 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:170: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 11 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:189: BREED_COUNT
				{
				mBREED_COUNT(); if (state.failed) return ;

				}
				break;
			case 12 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:201: JUDGE_NAME
				{
				mJUDGE_NAME(); if (state.failed) return ;

				}
				break;
			case 13 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:212: WS
				{
				mWS(); if (state.failed) return ;

				}
				break;
			case 14 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:215: RING_TITLE
				{
				mRING_TITLE(); if (state.failed) return ;

				}
				break;
			case 15 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:226: PHONE_NUMBER
				{
				mPHONE_NUMBER(); if (state.failed) return ;

				}
				break;
			case 16 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:239: TIME
				{
				mTIME(); if (state.failed) return ;

				}
				break;
			case 17 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:244: FOLLOWING_TIME
				{
				mFOLLOWING_TIME(); if (state.failed) return ;

				}
				break;
			case 18 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:259: DATE
				{
				mDATE(); if (state.failed) return ;

				}
				break;
			case 19 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:264: ELLIPSIS
				{
				mELLIPSIS(); if (state.failed) return ;

				}
				break;
			case 20 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:273: INT
				{
				mINT(); if (state.failed) return ;

				}
				break;
			case 21 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:277: PARENTHETICAL
				{
				mPARENTHETICAL(); if (state.failed) return ;

				}
				break;
			case 22 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:291: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); if (state.failed) return ;

				}
				break;
			case 23 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:309: COMMENT
				{
				mCOMMENT(); if (state.failed) return ;

				}
				break;
			case 24 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:317: GROUP_ENDING_ANNOUNCEMENT
				{
				mGROUP_ENDING_ANNOUNCEMENT(); if (state.failed) return ;

				}
				break;
			case 25 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:1:343: FallThrough
				{
				mFallThrough(); if (state.failed) return ;

				}
				break;

		}
	}

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:18: ( 'GROUP RING' )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:769:19: 'GROUP RING'
		{
		match("GROUP RING"); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:773:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:773:9: ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
		{
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:773:9: ( WS )?
		int alt72=2;
		int LA72_0 = input.LA(1);
		if ( ((LA72_0 >= '\t' && LA72_0 <= '\n')||LA72_0=='\r'||LA72_0==' ') ) {
			alt72=1;
		}
		switch (alt72) {
			case 1 :
				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:773:9: WS
				{
				mWS(); if (state.failed) return ;

				}
				break;

		}

		matchRange('0','9'); if (state.failed) return ;
		matchRange('0','9'); if (state.failed) return ;
		matchRange('0','9'); if (state.failed) return ;
		match('-'); if (state.failed) return ;
		matchRange('0','9'); if (state.failed) return ;
		matchRange('0','9'); if (state.failed) return ;
		matchRange('0','9'); if (state.failed) return ;
		matchRange('0','9'); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred4_test
	public final void synpred4_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:774:8: ()
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:774:9: 
		{
		}

	}
	// $ANTLR end synpred4_test

	public final boolean synpred2_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA40 dfa40 = new DFA40(this);
	protected DFA71 dfa71 = new DFA71(this);
	static final String DFA2_eotS =
		"\u00ed\uffff\1\u0111\74\uffff\1\u014c\74\uffff\1\u017e\107\uffff";
	static final String DFA2_eofS =
		"\u01af\uffff";
	static final String DFA2_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\3\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff\1\145\2\uffff"+
		"\2\163\1\141\1\143\1\141\1\162\1\141\1\154\1\151\1\uffff\1\145\2\uffff"+
		"\1\143\1\uffff\1\143\1\142\1\147\1\145\3\uffff\1\162\2\uffff\1\154\1\145"+
		"\1\162\2\uffff\1\151\1\uffff\1\145\1\uffff\1\166\1\142\4\uffff\1\154\1"+
		"\156\1\141\1\162\2\uffff\1\160\1\153\2\uffff\1\151\1\147\2\uffff\1\144"+
		"\3\uffff\1\151\1\150\1\141\1\145\1\142\2\uffff\2\141\2\uffff\1\142\2\uffff"+
		"\1\151\1\uffff\1\162\2\uffff\1\162\1\164\1\145\1\147\1\uffff\2\147\1\150"+
		"\1\143\2\uffff\1\144\1\uffff\1\166\3\uffff\1\141\1\uffff\1\154\1\uffff"+
		"\1\141\3\uffff\1\150\7\uffff\1\157\1\154\2\uffff\1\156\1\155\2\uffff\1"+
		"\141\2\uffff\2\163\1\uffff\1\141\6\uffff\1\151\2\uffff\1\146\5\uffff\1"+
		"\151\4\uffff\1\164\1\uffff\1\151\6\uffff\1\164\3\uffff\1\142\1\145\2\uffff"+
		"\1\156\1\146\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162\5\uffff\1\151"+
		"\2\uffff\1\157\1\153\1\145\1\uffff\1\151\2\uffff\1\40\3\uffff\1\145\1"+
		"\uffff\1\145\2\151\1\141\1\164\1\uffff\2\150\1\163\1\141\1\uffff\1\145"+
		"\1\164\1\165\1\153\1\164\2\uffff\1\162\1\157\2\uffff\1\164\1\150\1\40"+
		"\1\143\2\141\1\156\1\40\1\162\1\145\3\uffff\1\163\1\40\2\163\1\156\2\40"+
		"\1\157\1\172\1\164\1\147\1\uffff\1\40\1\147\2\uffff\2\151\1\156\1\141"+
		"\1\40\1\uffff\2\141\1\154\1\156\1\40\1\46\1\40\1\162\1\145\2\uffff\2\150"+
		"\1\40\1\104\1\uffff\1\122\1\156\1\157\1\165\1\151\2\uffff\1\165\1\163"+
		"\1\141\1\145\1\156\1\123\1\151\1\156\1\151\1\40\5\uffff\1\103\4\40\1\120"+
		"\5\uffff\1\141\1\144\2\uffff\1\162\1\141\1\145\1\150\1\156\2\uffff\1\40"+
		"\2\uffff\1\162\1\40\1\141\1\115\4\uffff\2\103\1\114\1\uffff\1\150\3\uffff"+
		"\2\145\1\156\1\163\2\40\1\115\1\145\1\105\1\156\7\uffff\1\145\3\uffff"+
		"\1\145\2\uffff\2\40\1\145\1\104\1\110\3\uffff\1\144\1\156\2\uffff\1\40"+
		"\4\uffff\1\101\1\102\1\40\2\uffff\1\165\1\40\2\uffff\1\103\7\uffff\1\120"+
		"\1\163\1\120\5\uffff\1\153\2\uffff\1\151\2\uffff";
	static final String DFA2_maxS =
		"\1\131\3\165\1\157\1\156\2\162\1\141\1\164\1\uffff\1\165\1\u00f6\1\151"+
		"\1\157\1\164\1\171\1\165\1\167\1\162\1\uffff\1\151\2\uffff\1\147\3\uffff"+
		"\1\145\2\uffff\2\163\1\162\1\143\1\165\1\171\1\165\1\154\1\166\1\uffff"+
		"\1\157\2\uffff\1\154\1\uffff\1\156\1\147\1\164\1\156\3\uffff\1\162\2\uffff"+
		"\1\162\1\145\1\166\2\uffff\1\151\1\uffff\1\162\1\uffff\1\166\1\153\4\uffff"+
		"\1\163\1\156\1\167\1\166\2\uffff\1\162\1\164\2\uffff\1\162\1\154\2\uffff"+
		"\1\164\3\uffff\1\155\1\157\1\164\1\151\1\154\2\uffff\1\151\1\141\2\uffff"+
		"\1\142\2\uffff\1\163\1\uffff\1\162\2\uffff\1\162\1\164\1\163\1\165\1\uffff"+
		"\1\147\1\156\1\150\1\143\2\uffff\1\172\1\uffff\1\166\3\uffff\1\164\1\uffff"+
		"\1\154\1\uffff\1\145\3\uffff\1\156\7\uffff\1\165\1\154\2\uffff\1\156\1"+
		"\155\2\uffff\1\171\2\uffff\2\163\1\uffff\1\141\6\uffff\1\151\2\uffff\1"+
		"\167\5\uffff\1\151\4\uffff\1\164\1\uffff\1\151\6\uffff\1\164\3\uffff\1"+
		"\150\1\145\2\uffff\2\156\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162"+
		"\5\uffff\1\151\2\uffff\1\157\1\153\1\145\1\uffff\1\151\2\uffff\1\155\3"+
		"\uffff\1\145\1\uffff\1\145\2\151\1\141\1\164\1\uffff\2\150\1\163\1\141"+
		"\1\uffff\1\151\1\164\1\165\1\153\1\164\2\uffff\1\162\1\157\2\uffff\1\164"+
		"\2\150\1\143\2\141\1\156\1\40\1\162\1\145\3\uffff\4\163\1\156\1\145\1"+
		"\40\1\157\1\172\1\164\1\147\1\uffff\1\163\1\147\2\uffff\2\151\1\156\1"+
		"\141\1\40\1\uffff\2\141\1\154\1\156\1\163\1\141\1\40\1\162\1\145\2\uffff"+
		"\2\150\1\40\1\120\1\uffff\1\127\1\156\1\157\1\165\1\151\2\uffff\1\165"+
		"\1\163\1\141\1\151\1\156\1\124\1\151\1\156\1\151\1\40\5\uffff\1\124\1"+
		"\163\3\40\1\127\5\uffff\1\157\1\144\2\uffff\1\162\1\141\1\145\1\150\1"+
		"\156\2\uffff\1\40\2\uffff\1\162\1\40\1\141\1\124\4\uffff\1\123\1\124\1"+
		"\123\1\uffff\1\150\3\uffff\2\145\1\156\1\163\2\40\1\124\1\145\1\123\1"+
		"\156\7\uffff\1\160\3\uffff\1\157\2\uffff\2\40\1\145\1\124\1\110\3\uffff"+
		"\1\144\1\163\2\uffff\1\40\4\uffff\1\123\1\114\1\40\2\uffff\1\165\1\40"+
		"\2\uffff\1\124\7\uffff\1\127\1\163\1\126\5\uffff\1\153\2\uffff\1\171\2"+
		"\uffff";
	static final String DFA2_acceptS =
		"\12\uffff\1\151\11\uffff\1\u00bc\1\uffff\1\u00c5\1\u00c6\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\12\1\13\11\uffff\1\65\1\uffff\1\72\1\74\1\uffff\1\77"+
		"\4\uffff\1\120\1\121\1\122\1\uffff\1\127\1\130\3\uffff\1\141\1\142\1\uffff"+
		"\1\150\1\uffff\1\155\2\uffff\1\163\1\164\1\165\1\166\4\uffff\1\u0086\1"+
		"\u0087\2\uffff\1\u008e\1\u008f\2\uffff\1\u0099\1\u009a\1\uffff\1\u009d"+
		"\1\u009e\1\u009f\5\uffff\1\u00ae\1\u00af\2\uffff\1\u00b5\1\u00b6\1\uffff"+
		"\1\u00ba\1\u00bb\1\uffff\1\u00c1\1\uffff\1\1\1\2\4\uffff\1\24\4\uffff"+
		"\1\37\1\40\1\uffff\1\44\1\uffff\1\47\1\50\1\51\1\uffff\1\54\1\uffff\1"+
		"\60\1\uffff\1\63\1\64\1\66\1\uffff\1\73\1\75\1\76\1\100\1\101\1\102\1"+
		"\103\2\uffff\1\114\1\115\2\uffff\1\131\1\132\1\uffff\1\137\1\140\2\uffff"+
		"\1\154\1\uffff\1\160\1\161\1\162\1\167\1\170\1\171\1\uffff\1\176\1\177"+
		"\1\uffff\1\u0085\1\u0088\1\u0089\1\u008a\1\u008b\1\uffff\1\u0090\1\u0091"+
		"\1\u0092\1\u0093\1\uffff\1\u0096\1\uffff\1\u009b\1\u009c\1\u00a0\1\u00a1"+
		"\1\u00a2\1\u00a3\1\uffff\1\u00a6\1\u00a7\1\u00a8\2\uffff\1\u00ad\1\u00b0"+
		"\3\uffff\1\u00bd\1\uffff\1\u00c0\3\uffff\1\17\1\20\1\21\1\22\1\23\1\uffff"+
		"\1\30\1\31\3\uffff\1\43\1\uffff\1\52\1\53\1\uffff\1\61\1\62\1\67\1\uffff"+
		"\1\104\5\uffff\1\136\4\uffff\1\u0080\5\uffff\1\u00a9\1\u00aa\2\uffff\1"+
		"\u00b3\1\u00b4\12\uffff\1\55\1\56\1\57\13\uffff\1\u0084\2\uffff\1\u0098"+
		"\1\u0097\5\uffff\1\u00c2\11\uffff\1\105\1\106\4\uffff\1\135\5\uffff\1"+
		"\u008c\1\u008d\12\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\133\1\134\1"+
		"\143\1\144\1\145\2\uffff\1\157\1\156\5\uffff\1\u00b1\1\u00b2\1\uffff\1"+
		"\u00be\1\u00bf\4\uffff\1\41\1\42\1\45\1\46\3\uffff\1\123\1\uffff\1\126"+
		"\1\146\1\147\12\uffff\1\25\1\26\1\27\1\70\1\71\1\107\1\110\1\uffff\1\113"+
		"\1\116\1\117\1\uffff\1\153\1\152\5\uffff\1\u00b7\1\u00b8\1\u00b9\2\uffff"+
		"\1\10\1\11\1\uffff\1\111\1\112\1\124\1\125\3\uffff\1\u00a4\1\u00a5\2\uffff"+
		"\1\6\1\7\1\uffff\1\172\1\173\1\174\1\175\1\u0081\1\u0082\1\u0083\3\uffff"+
		"\1\14\1\15\1\16\1\u0094\1\u0095\1\uffff\1\u00c3\1\u00c4\1\uffff\1\u00ab"+
		"\1\u00ac";
	static final String DFA2_specialS =
		"\u01af\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\20\1\uffff\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26\1\27",
			"\1\30\2\uffff\1\31\1\uffff\1\32\1\33\1\34\1\35\1\uffff\1\36\4\uffff"+
			"\1\37",
			"\1\40\3\uffff\1\41\3\uffff\1\42\2\uffff\1\43\2\uffff\1\44\2\uffff\1"+
			"\45\2\uffff\1\46",
			"\1\47\3\uffff\1\50\2\uffff\1\51\1\52\2\uffff\1\53\2\uffff\1\54\5\uffff"+
			"\1\55",
			"\1\56\15\uffff\1\57",
			"\1\60",
			"\1\61\2\uffff\1\62\2\uffff\1\63\2\uffff\1\64",
			"\1\65\3\uffff\1\66\2\uffff\1\67\2\uffff\1\70\2\uffff\1\71",
			"\1\72",
			"\1\73\1\74\16\uffff\1\75\1\uffff\1\76",
			"",
			"\1\77\11\uffff\1\100\5\uffff\1\101",
			"\1\102\3\uffff\1\103\2\uffff\1\104\6\uffff\1\106\u0086\uffff\1\105",
			"\1\107\7\uffff\1\110",
			"\1\111\11\uffff\1\112",
			"\1\113\7\uffff\1\114",
			"\1\115\3\uffff\1\116\2\uffff\1\117\3\uffff\1\120\2\uffff\1\121\5\uffff"+
			"\1\122\3\uffff\1\123",
			"\1\124\3\uffff\1\125\2\uffff\1\126\6\uffff\1\127\5\uffff\1\130",
			"\1\131\1\uffff\1\132\1\uffff\1\133\2\uffff\1\134\1\135\1\uffff\1\136"+
			"\3\uffff\1\137\1\140\3\uffff\1\141\1\142\1\uffff\1\143",
			"\1\144\5\uffff\1\145\2\uffff\1\146",
			"",
			"\1\147\2\uffff\1\150\1\151",
			"",
			"",
			"\1\152\1\153",
			"",
			"",
			"",
			"\1\154",
			"",
			"",
			"\1\155",
			"\1\156",
			"\1\157\2\uffff\1\160\7\uffff\1\161\5\uffff\1\162",
			"\1\163",
			"\1\164\15\uffff\1\165\5\uffff\1\166",
			"\1\167\1\170\1\uffff\1\171\2\uffff\1\172\1\173",
			"\1\174\7\uffff\1\175\13\uffff\1\176",
			"\1\177",
			"\1\u0080\4\uffff\1\u0081\3\uffff\1\u0082\3\uffff\1\u0083",
			"",
			"\1\u0084\3\uffff\1\u0085\5\uffff\1\u0086",
			"",
			"",
			"\1\u0087\10\uffff\1\u0088",
			"",
			"\1\u0089\10\uffff\1\u008a\1\uffff\1\u008b",
			"\1\u008c\4\uffff\1\u008d",
			"\1\u008e\14\uffff\1\u008f",
			"\1\u0090\10\uffff\1\u0091",
			"",
			"",
			"",
			"\1\u0092",
			"",
			"",
			"\1\u0093\5\uffff\1\u0094",
			"\1\u0095",
			"\1\u0096\3\uffff\1\u0097",
			"",
			"",
			"\1\u0098",
			"",
			"\1\u0099\14\uffff\1\u009a",
			"",
			"\1\u009b",
			"\1\u009c\4\uffff\1\u009d\3\uffff\1\u009e",
			"",
			"",
			"",
			"",
			"\1\u009f\1\uffff\1\u00a0\4\uffff\1\u00a1",
			"\1\u00a2",
			"\1\u00a3\25\uffff\1\u00a4",
			"\1\u00a5\3\uffff\1\u00a6",
			"",
			"",
			"\1\u00a7\1\uffff\1\u00a8",
			"\1\u00a9\1\uffff\1\u00aa\6\uffff\1\u00ab",
			"",
			"",
			"\1\u00ac\2\uffff\1\u00ad\1\u00ae\1\uffff\1\u00af\2\uffff\1\u00b0",
			"\1\u00b1\4\uffff\1\u00b2",
			"",
			"",
			"\1\u00b3\17\uffff\1\u00b4",
			"",
			"",
			"",
			"\1\u00b5\2\uffff\1\u00b6\1\u00b7",
			"\1\u00b8\6\uffff\1\u00b9",
			"\1\u00ba\22\uffff\1\u00bb",
			"\1\u00bc\3\uffff\1\u00bd",
			"\1\u00be\11\uffff\1\u00bf",
			"",
			"",
			"\1\u00c0\7\uffff\1\u00c1",
			"\1\u00c2",
			"",
			"",
			"\1\u00c3",
			"",
			"",
			"\1\u00c4\2\uffff\1\u00c5\6\uffff\1\u00c6",
			"",
			"\1\u00c7",
			"",
			"",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca\15\uffff\1\u00cb",
			"\1\u00cc\12\uffff\1\u00cd\2\uffff\1\u00ce",
			"",
			"\1\u00cf",
			"\1\u00d0\6\uffff\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"",
			"",
			"\1\u00d4\25\uffff\1\u00d5",
			"",
			"\1\u00d6",
			"",
			"",
			"",
			"\1\u00d7\22\uffff\1\u00d8",
			"",
			"\1\u00d9",
			"",
			"\1\u00da\3\uffff\1\u00db",
			"",
			"",
			"",
			"\1\u00dc\5\uffff\1\u00dd",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00de\5\uffff\1\u00df",
			"\1\u00e0",
			"",
			"",
			"\1\u00e1",
			"\1\u00e2",
			"",
			"",
			"\1\u00e3\27\uffff\1\u00e4",
			"",
			"",
			"\1\u00e5",
			"\1\u00e6",
			"",
			"\1\u00e7",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e8",
			"",
			"",
			"\1\u00e9\20\uffff\1\u00ea",
			"",
			"",
			"",
			"",
			"",
			"\1\u00eb",
			"",
			"",
			"",
			"",
			"\1\u00ec",
			"",
			"\1\u00ed",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ee",
			"",
			"",
			"",
			"\1\u00ef\5\uffff\1\u00f0",
			"\1\u00f1",
			"",
			"",
			"\1\u00f2",
			"\1\u00f3\7\uffff\1\u00f4",
			"\1\u00f5",
			"",
			"\1\u00f6",
			"",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"",
			"",
			"",
			"",
			"",
			"\1\u00fa",
			"",
			"",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"",
			"\1\u00fe",
			"",
			"",
			"\1\u00ff\103\uffff\1\u0100\10\uffff\1\u0101",
			"",
			"",
			"",
			"\1\u0102",
			"",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"",
			"\1\u010c\3\uffff\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0112",
			"",
			"",
			"\1\u0113",
			"\1\u0114",
			"",
			"",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117\107\uffff\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"",
			"",
			"",
			"\1\u0120",
			"\1\u0121\122\uffff\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126\104\uffff\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"",
			"\1\u012d\122\uffff\1\u012e",
			"\1\u012f",
			"",
			"",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139\122\uffff\1\u013a",
			"\1\u013c\53\uffff\1\u013d\16\uffff\1\u013b",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"",
			"",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144\13\uffff\1\u0145",
			"",
			"\1\u0146\1\u0147\1\u0148\2\uffff\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014d",
			"\1\u014e",
			"",
			"",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152\3\uffff\1\u0153",
			"\1\u0154",
			"\1\u0155\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"",
			"",
			"",
			"",
			"",
			"\1\u015b\20\uffff\1\u015c",
			"\1\u015d\122\uffff\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162\2\uffff\1\u0163\3\uffff\1\u0164",
			"",
			"",
			"",
			"",
			"",
			"\1\u0165\15\uffff\1\u0166",
			"\1\u0167",
			"",
			"",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"",
			"",
			"\1\u016d",
			"",
			"",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171\5\uffff\1\u0172\1\u0173",
			"",
			"",
			"",
			"",
			"\1\u0174\17\uffff\1\u0175",
			"\1\u0176\2\uffff\1\u0177\14\uffff\1\u0178\1\u0179",
			"\1\u017a\6\uffff\1\u017b",
			"",
			"\1\u017c",
			"",
			"",
			"",
			"\1\u017d",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184\5\uffff\1\u0185\1\u0186",
			"\1\u0187",
			"\1\u0188\1\u0189\14\uffff\1\u018a",
			"\1\u018b",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u018c\12\uffff\1\u018d",
			"",
			"",
			"",
			"\1\u018e\11\uffff\1\u018f",
			"",
			"",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193\17\uffff\1\u0194",
			"\1\u0195",
			"",
			"",
			"",
			"\1\u0196",
			"\1\u0197\4\uffff\1\u0198",
			"",
			"",
			"\1\u0199",
			"",
			"",
			"",
			"",
			"\1\u019a\1\u019b\15\uffff\1\u019c\2\uffff\1\u019d",
			"\1\u019e\2\uffff\1\u019f\6\uffff\1\u01a0",
			"\1\u01a1",
			"",
			"",
			"\1\u01a2",
			"\1\u01a3",
			"",
			"",
			"\1\u01a4\17\uffff\1\u01a5\1\u01a6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01a7\6\uffff\1\u01a8",
			"\1\u01a9",
			"\1\u01aa\5\uffff\1\u01ab",
			"",
			"",
			"",
			"",
			"",
			"\1\u01ac",
			"",
			"",
			"\1\u01ae\17\uffff\1\u01ad",
			"",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "342:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
		}
	}

	static final String DFA18_eotS =
		"\66\uffff\1\76\2\uffff\1\102\11\uffff\1\111\1\113\13\uffff";
	static final String DFA18_eofS =
		"\120\uffff";
	static final String DFA18_minS =
		"\1\61\1\63\1\uffff\1\40\1\150\1\156\1\151\1\145\1\162\1\uffff\1\141\3"+
		"\uffff\1\155\1\uffff\1\145\6\uffff\1\143\1\uffff\1\147\2\uffff\1\162\1"+
		"\154\1\151\1\uffff\1\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff"+
		"\1\163\1\147\1\157\1\145\1\151\1\141\1\150\1\40\1\164\1\150\1\163\1\156"+
		"\1\40\2\uffff\1\150\2\uffff\1\150\1\40\1\122\1\uffff\2\40\1\123\4\uffff"+
		"\1\103\5\uffff";
	static final String DFA18_maxS =
		"\1\127\1\65\1\uffff\1\157\1\165\1\156\1\154\1\157\1\162\1\uffff\1\157"+
		"\3\uffff\1\165\1\uffff\1\151\6\uffff\1\154\1\uffff\1\147\2\uffff\2\162"+
		"\1\151\1\uffff\1\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1"+
		"\163\1\147\1\157\1\145\1\151\1\141\2\150\1\164\1\150\1\163\1\156\1\40"+
		"\2\uffff\1\150\2\uffff\1\150\1\40\1\127\1\uffff\2\40\1\127\4\uffff\1\123"+
		"\5\uffff";
	static final String DFA18_acceptS =
		"\2\uffff\1\3\6\uffff\1\27\1\uffff\1\33\1\34\1\35\1\uffff\1\42\1\uffff"+
		"\1\1\1\2\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\16\1\17\3\uffff\1\30\2"+
		"\uffff\1\40\1\41\1\43\1\44\1\uffff\1\10\1\11\2\uffff\1\22\1\23\15\uffff"+
		"\1\31\1\32\1\uffff\1\46\1\45\3\uffff\1\24\3\uffff\1\25\1\26\1\37\1\36"+
		"\1\uffff\1\13\1\20\1\21\1\14\1\15";
	static final String DFA18_specialS =
		"\120\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1\17\uffff\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\uffff\1\10\1\uffff\1"+
			"\11\1\12\1\13\1\14\3\uffff\1\15\1\16\1\17\2\uffff\1\20",
			"\1\21\1\uffff\1\22",
			"",
			"\1\24\116\uffff\1\23",
			"\1\25\3\uffff\1\26\2\uffff\1\27\5\uffff\1\30",
			"\1\31",
			"\1\32\2\uffff\1\33",
			"\1\34\11\uffff\1\35",
			"\1\36",
			"",
			"\1\37\15\uffff\1\40",
			"",
			"",
			"",
			"\1\41\6\uffff\1\42\1\43",
			"",
			"\1\44\2\uffff\1\45\1\46",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\47\10\uffff\1\50",
			"",
			"\1\51",
			"",
			"",
			"\1\52",
			"\1\53\5\uffff\1\54",
			"\1\55",
			"",
			"\1\56",
			"\1\57",
			"",
			"",
			"",
			"",
			"\1\60",
			"",
			"",
			"\1\61",
			"\1\62",
			"",
			"",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72\107\uffff\1\73",
			"\1\74",
			"\1\75",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"\1\103",
			"",
			"",
			"\1\104",
			"\1\105",
			"\1\106\4\uffff\1\107",
			"",
			"\1\110",
			"\1\112",
			"\1\114\3\uffff\1\115",
			"",
			"",
			"",
			"",
			"\1\116\17\uffff\1\117",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "565:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA40_eotS =
		"\4\uffff\1\5\1\uffff";
	static final String DFA40_eofS =
		"\6\uffff";
	static final String DFA40_minS =
		"\1\60\1\55\1\60\1\uffff\1\60\1\uffff";
	static final String DFA40_maxS =
		"\1\71\1\73\1\71\1\uffff\1\73\1\uffff";
	static final String DFA40_acceptS =
		"\3\uffff\1\2\1\uffff\1\1";
	static final String DFA40_specialS =
		"\6\uffff}>";
	static final String[] DFA40_transitionS = {
			"\12\1",
			"\1\2\2\uffff\12\1\1\uffff\1\3",
			"\12\4",
			"",
			"\12\4\1\uffff\1\3",
			""
	};

	static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
	static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
	static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
	static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
	static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
	static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
	static final short[][] DFA40_transition;

	static {
		int numStates = DFA40_transitionS.length;
		DFA40_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
		}
	}

	class DFA40 extends DFA {

		public DFA40(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 40;
			this.eot = DFA40_eot;
			this.eof = DFA40_eof;
			this.min = DFA40_min;
			this.max = DFA40_max;
			this.accept = DFA40_accept;
			this.special = DFA40_special;
			this.transition = DFA40_transition;
		}
		@Override
		public String getDescription() {
			return "703:1: NON_CONFORMATION_SECOND_LINE : ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) );";
		}
	}

	static final String DFA71_eotS =
		"\1\uffff\31\53\1\u00a7\1\uffff\1\41\1\53\1\u00af\3\uffff\11\53\1\uffff"+
		"\76\53\1\uffff\21\53\1\u0136\50\53\1\u00a7\1\53\1\uffff\1\53\5\uffff\1"+
		"\53\1\uffff\1\u00af\6\53\1\uffff\161\53\1\152\2\53\1\u01fe\11\53\1\uffff"+
		"\34\53\1\uffff\33\53\2\u0241\1\53\2\uffff\1\u0249\2\uffff\1\u0249\2\uffff"+
		"\11\53\1\u01fe\152\53\1\u01fe\12\53\1\152\1\uffff\1\53\1\152\1\53\1\uffff"+
		"\46\53\1\uffff\1\53\1\uffff\31\53\1\uffff\2\53\6\uffff\10\53\1\uffff\13"+
		"\53\1\152\30\53\1\152\1\53\1\152\74\53\1\u0378\2\53\1\u01fe\4\53\1\152"+
		"\5\53\20\uffff\1\53\1\152\10\53\1\uffff\2\u0136\62\53\1\u0241\1\u03d8"+
		"\4\uffff\10\53\1\uffff\1\53\1\u01fe\21\53\1\152\13\53\1\152\3\53\1\152"+
		"\2\53\1\uffff\13\53\1\152\35\53\1\152\5\53\1\uffff\11\53\1\152\1\53\34"+
		"\uffff\2\53\1\uffff\7\53\1\152\33\53\1\152\21\53\1\uffff\2\53\2\152\4"+
		"\53\1\uffff\16\53\1\152\14\53\1\uffff\1\152\24\53\1\152\14\53\1\152\4"+
		"\53\1\152\2\53\37\uffff\11\53\1\152\4\53\1\152\31\53\1\152\6\53\1\u01fe"+
		"\1\uffff\1\u04ec\5\53\1\uffff\13\53\1\u01fe\2\53\1\u01fe\3\53\1\152\16"+
		"\53\1\u01fe\1\152\2\53\3\152\3\53\1\152\4\53\33\uffff\1\152\3\uffff\5"+
		"\53\1\u0136\6\53\1\152\10\53\1\u01fe\10\53\1\uffff\1\53\1\uffff\13\53"+
		"\1\152\4\53\1\152\1\53\2\152\1\53\1\u01fe\1\53\1\152\3\53\1\152\2\53\34"+
		"\uffff\3\53\1\uffff\1\53\3\uffff\7\53\1\uffff\12\53\1\152\7\53\1\152\5"+
		"\53\3\152\1\53\32\uffff\3\53\3\uffff\3\152\3\53\1\u01fe\1\53\1\152\10"+
		"\53\1\152\3\53\27\uffff\3\53\3\uffff\3\53\2\u01fe\2\53\1\152\3\53\22\uffff"+
		"\3\53\2\uffff\3\53\1\152\21\uffff\1\152\1\53\1\152\2\uffff\2\53\1\u03d8"+
		"\14\uffff\1\152\3\uffff\1\53\2\uffff\1\152\15\uffff\1\53\13\uffff\1\53"+
		"\12\uffff\1\53\11\uffff\1\53\6\uffff\1\152\23\uffff";
	static final String DFA71_eofS =
		"\u0643\uffff";
	static final String DFA71_minS =
		"\1\0\1\111\1\154\1\117\1\144\1\105\1\117\1\122\1\156\2\122\1\105\1\142"+
		"\1\141\1\145\1\125\1\141\1\60\1\101\1\105\1\101\1\105\2\157\2\156\1\46"+
		"\1\uffff\1\11\1\151\1\46\3\uffff\1\154\1\156\4\11\1\123\1\156\1\116\1"+
		"\uffff\1\145\1\144\1\164\1\162\1\141\1\116\1\146\1\162\1\151\1\141\1\145"+
		"\1\141\1\160\1\163\1\166\1\163\1\141\1\143\1\141\1\162\1\141\1\154\1\123"+
		"\1\151\1\163\1\145\1\162\1\165\1\143\1\162\1\114\1\143\1\142\2\11\1\147"+
		"\1\143\1\145\1\141\1\170\1\145\1\111\1\162\1\141\1\145\1\154\1\141\1\117"+
		"\1\162\1\122\1\125\1\151\1\145\1\151\1\141\1\160\1\145\1\155\1\166\1\142"+
		"\1\157\1\141\1\uffff\1\167\1\116\1\151\1\153\1\141\1\157\1\151\1\147\1"+
		"\162\1\145\1\154\1\144\1\157\1\164\1\163\1\107\1\116\1\46\1\151\1\150"+
		"\1\141\1\145\1\142\1\171\1\146\2\141\1\156\1\145\1\117\1\105\1\116\1\124"+
		"\1\142\1\40\1\145\1\131\1\122\1\145\1\105\1\165\1\125\1\172\1\162\1\124"+
		"\1\122\1\144\1\151\1\154\1\122\1\154\1\104\1\154\1\162\1\151\1\154\1\143"+
		"\1\60\1\46\1\60\1\uffff\1\60\1\uffff\3\11\1\uffff\1\156\1\uffff\1\46\2"+
		"\164\1\143\1\151\1\163\1\11\1\uffff\1\11\1\123\1\144\1\104\1\156\1\40"+
		"\1\145\1\141\1\146\1\160\1\146\1\55\1\145\1\150\1\145\1\164\1\163\1\162"+
		"\1\164\1\145\1\164\1\141\1\145\1\147\1\154\2\147\1\151\1\150\1\143\1\157"+
		"\1\145\1\144\1\164\1\166\1\145\1\153\1\143\1\141\1\163\1\157\1\154\1\124"+
		"\1\162\1\141\1\144\1\141\1\153\1\163\1\150\1\167\1\156\1\155\1\153\1\11"+
		"\1\154\1\11\1\150\1\155\1\144\1\145\1\157\2\154\1\145\1\154\1\156\1\164"+
		"\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\141\1\144\1\125\1\162\1\141"+
		"\1\104\1\116\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162"+
		"\1\157\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\162\1\151\1\142\1\151"+
		"\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\41\1\151\1\145\1\41\1\40"+
		"\1\154\1\142\1\162\1\144\1\164\1\163\1\125\1\107\1\uffff\2\122\1\156\1"+
		"\165\1\157\1\165\1\151\1\164\1\154\2\164\1\142\1\145\1\153\1\145\1\164"+
		"\2\156\1\146\1\163\2\144\1\122\1\105\1\104\1\125\1\145\1\40\1\uffff\1"+
		"\145\1\40\1\122\1\163\1\123\1\162\1\122\1\163\1\145\1\163\1\105\1\111"+
		"\1\155\1\163\1\164\1\156\1\160\1\145\1\144\1\113\1\153\1\116\1\157\1\153"+
		"\1\154\1\145\1\150\2\46\3\11\1\46\2\11\1\46\2\11\1\165\2\145\1\150\1\141"+
		"\2\11\1\141\1\101\1\40\1\162\1\143\1\40\1\157\1\145\2\157\1\123\1\156"+
		"\1\141\1\144\1\141\1\153\1\151\1\157\1\156\1\162\2\156\1\145\1\154\1\144"+
		"\1\143\2\151\2\145\1\156\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162"+
		"\1\151\1\145\1\162\1\164\1\163\1\144\2\40\1\156\1\141\1\40\1\151\1\154"+
		"\1\171\1\141\1\165\1\145\1\40\1\145\1\142\1\145\1\151\1\171\1\163\1\141"+
		"\1\151\1\162\1\40\1\145\1\151\1\145\1\154\1\144\1\151\1\55\1\143\1\141"+
		"\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\165\1\120\1\151\1\156"+
		"\1\111\1\104\2\141\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\164"+
		"\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\41\1\156\1\162\1\164\1\141"+
		"\2\164\1\163\1\162\1\154\1\165\1\41\1\46\1\151\1\41\1\156\1\uffff\1\171"+
		"\1\157\1\151\1\145\1\167\1\145\1\114\1\11\2\60\1\164\1\153\1\171\1\162"+
		"\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1\157"+
		"\1\146\1\144\1\145\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\106"+
		"\1\151\1\uffff\1\111\1\144\1\104\1\163\1\123\1\154\1\162\1\141\1\122\1"+
		"\105\1\141\1\150\1\40\1\145\1\160\2\40\1\111\1\164\1\105\1\151\1\163\1"+
		"\151\1\163\1\72\1\uffff\2\60\1\uffff\4\11\1\uffff\1\164\1\162\1\146\1"+
		"\163\1\145\1\164\1\171\1\131\1\101\1\150\1\145\1\154\1\147\1\143\1\154"+
		"\1\165\1\120\1\160\1\156\1\141\1\41\1\141\1\143\1\154\1\172\1\141\1\143"+
		"\1\152\1\164\3\145\1\156\1\141\1\162\1\163\2\156\1\40\1\150\1\151\1\162"+
		"\1\151\1\156\1\145\1\41\1\156\1\41\1\144\1\141\1\145\1\11\1\157\1\141"+
		"\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143\1\145\1\162\1\145"+
		"\1\55\1\150\1\164\1\145\1\155\1\40\1\163\1\142\1\154\1\40\1\163\1\103"+
		"\1\150\1\171\1\131\1\156\1\40\2\156\1\40\1\157\1\141\1\40\2\145\1\116"+
		"\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141"+
		"\1\145\1\40\1\145\1\41\1\154\1\156\1\41\1\147\1\157\1\40\1\157\1\41\1"+
		"\145\1\150\1\141\1\145\1\147\20\11\1\163\1\41\1\145\1\40\1\156\1\145\1"+
		"\163\1\145\1\154\1\101\1\uffff\2\46\1\40\1\151\1\145\1\144\1\160\1\151"+
		"\1\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171"+
		"\2\163\1\111\1\123\1\131\1\104\1\141\1\156\1\105\1\141\1\101\1\144\1\104"+
		"\2\141\1\164\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\150\1\123"+
		"\1\164\1\150\1\164\1\163\1\40\1\55\2\46\4\11\1\145\1\40\1\146\1\145\1"+
		"\163\1\165\2\54\1\uffff\1\157\1\40\1\153\1\151\1\150\1\151\1\156\1\117"+
		"\1\151\1\40\1\154\1\156\1\141\1\151\1\145\1\154\1\145\1\151\1\40\1\41"+
		"\1\144\1\162\1\147\1\156\1\40\2\145\1\40\1\157\1\143\1\40\1\41\1\40\1"+
		"\162\1\40\1\41\1\156\1\154\1\11\1\147\1\163\1\40\1\141\2\145\1\150\1\145"+
		"\1\157\1\162\1\40\1\41\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1"+
		"\145\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162\1\163\1\107\1"+
		"\40\1\144\1\156\1\163\1\156\1\157\1\41\2\157\1\156\1\162\1\156\1\uffff"+
		"\1\157\1\40\1\145\1\153\1\40\1\150\1\162\1\40\1\156\1\41\1\165\34\11\1"+
		"\143\1\141\1\uffff\1\145\1\166\2\151\1\154\2\122\1\41\1\144\1\141\1\145"+
		"\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162\1\40\1\54\1\150\1\164"+
		"\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\171\1\131\1\141\1\101\1\41"+
		"\1\156\1\151\1\116\1\131\1\141\1\144\1\164\1\151\1\107\1\162\1\104\1\172"+
		"\1\151\1\171\1\40\2\60\1\uffff\1\60\1\163\2\41\1\164\1\162\1\11\1\165"+
		"\1\101\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156\1\141"+
		"\1\154\1\151\1\144\1\41\1\40\1\157\1\164\2\40\1\162\1\40\1\165\1\153\1"+
		"\40\1\171\1\163\1\uffff\1\41\1\164\1\156\1\162\1\141\1\165\3\40\1\157"+
		"\1\156\1\141\1\156\1\40\1\143\1\156\1\40\1\141\1\40\1\156\1\145\1\41\1"+
		"\145\1\40\1\151\1\40\1\145\1\144\1\162\1\153\1\162\1\40\1\144\1\147\1"+
		"\41\1\156\1\163\1\145\1\40\1\41\1\151\1\145\37\11\1\56\1\156\1\40\1\145"+
		"\1\141\1\154\2\40\1\60\1\41\1\171\1\162\1\150\1\155\1\41\1\144\1\156\1"+
		"\163\2\40\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1\171\1\131\1\11"+
		"\1\154\2\40\1\156\1\141\1\41\1\162\1\40\1\157\1\101\1\143\1\162\1\41\1"+
		"\uffff\1\46\2\60\1\40\2\145\1\uffff\2\156\1\141\1\154\1\124\1\163\2\40"+
		"\1\156\1\154\1\141\1\41\1\156\1\157\1\41\1\156\2\40\1\41\1\40\1\151\2"+
		"\40\1\153\2\141\1\144\1\156\1\40\1\150\2\164\1\144\2\41\1\143\1\40\3\41"+
		"\2\40\1\145\1\41\1\145\1\40\1\141\1\163\33\11\1\46\3\11\2\40\1\162\1\156"+
		"\1\145\1\46\1\54\1\153\4\40\1\41\1\163\1\40\1\153\1\40\1\113\3\54\1\11"+
		"\1\151\1\145\1\171\1\145\1\165\1\131\1\165\1\145\1\uffff\1\55\1\uffff"+
		"\1\162\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40\1\145\1\156\1\41\1"+
		"\156\1\144\1\146\1\145\1\41\1\164\2\41\1\145\1\41\1\145\1\41\1\40\1\156"+
		"\1\162\1\41\1\156\1\145\34\11\1\163\1\141\1\154\1\46\1\151\3\11\1\163"+
		"\1\40\1\162\1\145\1\150\1\145\1\105\1\11\1\164\1\162\1\54\1\144\1\147"+
		"\1\54\1\151\1\40\1\60\1\40\1\41\1\40\1\156\1\116\1\150\1\162\2\40\1\41"+
		"\1\146\1\40\1\145\1\162\1\144\3\41\1\40\32\11\1\143\1\162\1\141\3\11\3"+
		"\41\1\151\1\163\1\123\1\151\1\171\1\41\1\40\1\150\1\156\1\60\1\144\1\107"+
		"\1\145\1\40\1\41\1\144\2\40\27\11\1\157\1\164\1\143\3\11\1\162\1\11\1"+
		"\40\2\41\1\164\1\60\1\41\1\40\1\162\1\40\22\11\1\142\1\151\1\153\2\11"+
		"\1\145\1\154\1\60\1\41\21\11\1\41\1\55\1\41\2\11\1\40\1\151\1\46\14\11"+
		"\1\46\3\11\1\103\2\11\1\41\15\11\1\157\13\11\1\154\12\11\1\157\11\11\1"+
		"\162\6\11\1\41\23\11";
	static final String DFA71_maxS =
		"\1\uffff\1\163\1\164\1\157\3\165\1\162\1\170\2\162\1\141\1\164\1\141\1"+
		"\165\1\u00f6\1\171\1\165\1\167\1\165\2\151\2\157\1\164\1\156\1\u2019\1"+
		"\uffff\1\u2019\1\151\1\u2019\3\uffff\2\163\1\123\1\163\2\40\1\123\1\156"+
		"\1\116\1\uffff\1\145\1\144\1\164\1\166\1\167\1\116\1\147\1\162\1\151\1"+
		"\141\1\145\1\141\1\160\1\163\1\166\1\163\1\162\1\143\1\165\1\171\1\165"+
		"\1\154\1\123\1\166\1\163\1\157\1\162\1\165\1\154\1\162\1\114\1\156\1\147"+
		"\2\40\1\164\1\143\1\156\1\141\1\170\1\151\1\111\1\162\1\141\1\145\1\162"+
		"\1\145\1\117\1\166\1\122\1\125\1\151\1\145\1\151\1\141\1\160\1\162\1\155"+
		"\1\166\1\153\1\157\1\141\1\uffff\1\167\1\116\1\162\1\164\1\141\1\157\1"+
		"\162\1\154\1\162\1\145\2\164\1\157\1\164\1\163\1\107\1\116\1\u2019\1\164"+
		"\1\157\1\164\1\151\1\154\1\171\1\146\1\151\1\141\1\163\1\145\1\117\1\105"+
		"\1\116\1\124\1\142\1\171\1\145\1\131\1\122\1\145\1\105\1\165\1\125\1\172"+
		"\1\164\1\124\1\122\1\163\1\151\1\162\1\122\1\154\1\104\1\154\1\162\1\151"+
		"\1\154\1\143\1\71\1\u2019\1\71\1\uffff\1\71\1\uffff\1\71\2\u2019\1\uffff"+
		"\1\156\1\uffff\1\u2019\2\164\1\143\1\151\1\163\1\40\1\uffff\1\40\1\123"+
		"\1\144\1\104\1\156\1\40\1\145\1\151\1\167\1\160\1\146\1\55\1\145\1\150"+
		"\1\145\1\164\1\163\1\162\1\164\1\145\1\164\1\141\1\163\1\165\1\154\1\147"+
		"\1\156\1\151\1\150\1\143\1\157\1\145\1\172\1\164\1\166\1\145\1\153\1\143"+
		"\1\164\1\163\1\157\1\154\1\124\1\162\1\145\1\144\1\141\1\153\1\163\1\156"+
		"\1\167\1\156\1\155\1\153\2\154\1\40\1\150\1\155\1\144\1\145\1\165\2\154"+
		"\1\145\1\154\1\156\1\164\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\171"+
		"\1\144\1\125\1\162\1\141\1\104\1\116\1\172\1\154\1\163\1\154\1\141\1\163"+
		"\1\162\1\157\1\141\1\162\1\157\1\145\1\156\1\163\1\143\1\103\1\151\1\163"+
		"\1\162\1\151\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\u2019"+
		"\1\151\1\145\1\u2019\1\40\1\154\1\142\1\162\1\144\1\164\1\163\1\125\1"+
		"\107\1\uffff\2\122\1\156\1\165\1\157\1\165\1\151\1\164\1\154\2\164\1\150"+
		"\1\145\1\153\1\145\1\164\3\156\1\163\1\144\1\145\1\122\1\105\1\104\1\125"+
		"\1\145\1\40\1\uffff\1\145\1\40\1\122\1\163\1\123\1\162\1\122\1\163\1\145"+
		"\1\163\1\105\1\111\1\155\1\163\1\164\1\156\1\160\1\145\1\144\1\113\1\153"+
		"\1\116\1\157\1\153\1\154\1\145\1\150\2\u2019\2\71\2\u2019\1\51\3\u2019"+
		"\1\51\1\165\1\151\1\145\1\150\1\141\2\40\1\141\1\101\1\u2019\1\162\1\143"+
		"\1\40\1\157\1\151\2\157\1\123\1\156\1\141\1\144\1\141\1\153\1\151\1\157"+
		"\1\156\1\162\2\156\1\145\1\154\1\144\1\143\2\151\2\145\1\156\1\157\1\153"+
		"\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163\1\144"+
		"\1\155\1\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40"+
		"\1\145\1\142\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\40\1\145\1\151"+
		"\1\145\1\154\1\144\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145"+
		"\1\157\1\164\1\150\1\165\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151"+
		"\1\156\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110"+
		"\1\154\1\157\1\u2019\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1"+
		"\165\2\u2019\1\151\1\u2019\1\156\1\uffff\1\171\1\157\1\151\1\145\1\167"+
		"\1\145\1\114\1\40\2\71\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\145"+
		"\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145\1\141"+
		"\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\126\1\151\1\uffff\1\111\1"+
		"\144\1\104\1\163\1\123\1\154\1\162\1\141\1\122\1\105\1\141\1\150\1\40"+
		"\1\145\1\160\1\150\1\40\1\111\1\164\1\105\1\151\1\163\1\151\1\163\1\72"+
		"\1\uffff\2\71\1\uffff\1\71\1\u2019\1\71\1\u2019\1\uffff\1\164\1\162\1"+
		"\146\1\163\1\145\1\164\1\171\1\131\1\127\1\150\1\145\1\154\1\147\1\143"+
		"\1\154\1\165\1\120\1\160\1\156\1\141\1\u2019\1\141\1\143\1\154\1\172\1"+
		"\141\1\143\1\152\1\164\3\145\1\156\1\141\1\162\1\163\2\156\1\40\1\150"+
		"\1\151\1\162\1\151\1\156\1\145\1\u2019\1\156\1\u2019\1\144\1\141\1\145"+
		"\1\40\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143"+
		"\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\2\163\1\142\1\154\1\40"+
		"\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\145\1\157\1\141\1\40"+
		"\2\145\1\116\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144"+
		"\1\164\1\141\1\145\1\40\1\145\1\u2019\1\154\1\156\1\u2019\1\147\1\157"+
		"\1\163\1\157\1\u2019\1\145\1\150\1\141\1\145\1\147\1\71\17\u2019\1\163"+
		"\1\u2019\1\145\1\40\1\156\1\145\1\163\1\145\1\154\1\101\1\uffff\2\u2019"+
		"\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40"+
		"\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\111\1\123\1\131\1\104\1\141"+
		"\1\156\1\105\1\141\1\101\1\144\1\104\2\141\1\164\1\101\1\124\1\162\1\40"+
		"\1\163\1\145\1\141\1\116\1\150\1\123\1\164\1\150\1\164\1\163\1\40\1\71"+
		"\2\u2019\1\71\1\51\1\u2019\1\51\1\145\1\40\1\146\1\145\1\163\1\165\2\54"+
		"\1\uffff\1\157\1\u2019\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40"+
		"\1\154\1\156\1\141\1\151\1\145\1\154\1\145\1\151\1\40\1\u2019\1\144\1"+
		"\162\1\147\1\156\1\40\2\145\1\163\1\157\1\143\1\40\1\u2019\1\40\1\162"+
		"\1\40\1\u2019\1\156\1\154\1\123\1\147\1\163\1\40\1\141\2\145\1\150\1\145"+
		"\1\157\1\162\1\40\1\u2019\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165"+
		"\1\145\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162\1\163\1\107"+
		"\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019\2\157\1\156\1\162\1\156\1"+
		"\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\162\1\40\1\156\1\u2019\1\165"+
		"\2\71\32\u2019\1\143\1\141\1\uffff\1\145\1\166\2\151\1\154\2\122\1\u2019"+
		"\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\151\2\162\1\40"+
		"\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\171\1\131"+
		"\1\141\1\101\1\u2019\1\156\1\151\1\116\1\131\1\141\1\144\1\164\1\151\1"+
		"\107\1\162\1\104\1\172\1\151\1\171\1\40\2\71\1\uffff\1\71\1\163\2\u2019"+
		"\1\164\1\162\1\40\1\165\1\127\1\40\1\141\1\40\1\164\1\144\1\122\1\156"+
		"\1\145\1\40\1\156\1\141\1\154\1\151\1\144\1\u2019\1\40\1\157\1\164\2\40"+
		"\1\162\1\40\1\165\1\153\1\163\1\171\1\163\1\uffff\1\u2019\1\164\1\156"+
		"\1\162\1\141\1\165\3\40\1\157\1\156\1\141\1\156\1\40\1\143\1\156\1\40"+
		"\1\141\1\40\1\156\1\145\1\u2019\1\145\1\40\1\151\1\40\1\145\1\144\1\162"+
		"\1\153\1\162\1\40\1\144\1\147\1\u2019\1\156\1\163\1\145\1\40\1\u2019\1"+
		"\151\1\145\37\u2019\1\56\1\156\1\40\1\145\1\141\1\154\2\40\1\71\1\u2019"+
		"\1\171\1\162\1\150\1\155\1\u2019\1\144\1\156\1\163\2\40\2\144\1\40\1\141"+
		"\1\107\1\101\1\131\3\40\2\54\1\171\1\131\1\163\1\154\2\40\1\156\1\141"+
		"\1\u2019\1\162\1\40\1\157\1\101\1\143\1\162\1\u2019\1\uffff\1\u2019\1"+
		"\73\1\71\1\40\2\145\1\uffff\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1"+
		"\154\1\141\1\u2019\1\156\1\157\1\u2019\1\156\2\40\1\u2019\1\40\1\151\2"+
		"\40\1\153\2\141\1\144\1\156\1\40\1\150\2\164\1\144\2\u2019\1\143\1\40"+
		"\3\u2019\2\40\1\145\1\u2019\1\145\1\40\1\141\1\163\37\u2019\2\40\1\162"+
		"\1\156\1\145\1\u2019\1\54\1\153\4\40\1\u2019\1\163\1\40\1\153\1\40\1\113"+
		"\3\54\1\u2019\1\151\1\145\1\171\1\145\1\165\1\131\1\165\1\145\1\uffff"+
		"\1\55\1\uffff\1\162\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40\1\145"+
		"\1\156\1\u2019\1\156\1\144\1\146\1\145\1\u2019\1\164\2\u2019\1\145\1\u2019"+
		"\1\145\1\u2019\1\40\1\156\1\162\1\u2019\1\156\1\145\26\u2019\1\51\5\u2019"+
		"\1\163\1\141\1\154\1\u2019\1\151\3\u2019\1\163\1\40\1\162\1\145\1\150"+
		"\1\145\1\105\1\127\1\164\1\162\1\54\1\144\1\147\1\54\1\151\1\40\1\71\1"+
		"\40\1\u2019\1\40\1\156\1\116\1\150\1\162\2\40\1\u2019\1\146\1\40\1\145"+
		"\1\162\1\144\3\u2019\1\40\32\u2019\1\143\1\162\1\141\6\u2019\1\151\1\163"+
		"\1\123\1\151\1\171\1\u2019\1\40\1\150\1\156\1\71\1\144\1\107\1\145\1\40"+
		"\1\u2019\1\144\2\40\27\u2019\1\157\1\164\1\143\3\u2019\1\162\2\40\2\u2019"+
		"\1\164\1\71\1\u2019\1\40\1\162\1\40\22\u2019\1\142\1\151\1\153\2\u2019"+
		"\1\145\1\154\1\71\23\u2019\1\55\3\u2019\1\40\1\151\21\u2019\1\103\20\u2019"+
		"\1\157\13\u2019\1\154\12\u2019\1\157\11\u2019\1\162\32\u2019";
	static final String DFA71_acceptS =
		"\33\uffff\1\15\3\uffff\2\27\1\31\11\uffff\1\27\76\uffff\1\2\74\uffff\1"+
		"\24\1\uffff\1\15\3\uffff\1\26\1\uffff\1\23\7\uffff\1\14\176\uffff\1\10"+
		"\34\uffff\1\6\u00aa\uffff\1\5\50\uffff\1\4\31\uffff\1\11\2\uffff\1\20"+
		"\4\uffff\1\25\u0094\uffff\1\16\102\uffff\1\1\126\uffff\1\12\51\uffff\1"+
		"\7\65\uffff\1\17\44\uffff\1\3\171\uffff\1\30\6\uffff\1\22\155\uffff\1"+
		"\13\1\uffff\1\21\u0154\uffff";
	static final String DFA71_specialS =
		"\1\14\43\uffff\1\0\1\13\1\6\1\3\45\uffff\1\11\1\1\147\uffff\1\5\1\uffff"+
		"\1\2\65\uffff\1\12\1\uffff\1\10\u008e\uffff\1\4\1\7\u04c2\uffff}>";
	static final String[] DFA71_transitionS = {
			"\11\41\2\33\2\41\1\33\22\41\1\33\5\41\2\40\1\34\3\41\2\40\1\36\1\41\12"+
			"\32\2\40\5\41\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\1\1\3\1\2\1\20\1\37\1\21\1\22\1\23\1\30\1\24\1\25\1\26\1\27\1\37\4"+
			"\41\1\40\1\41\10\40\1\31\3\40\1\35\15\40\u1f9e\41\1\40\udfe6\41",
			"\1\50\5\uffff\1\52\2\uffff\1\44\1\46\15\uffff\1\42\7\uffff\1\43\5\uffff"+
			"\1\51\2\uffff\1\45\1\47",
			"\1\55\3\uffff\1\54\3\uffff\1\56",
			"\1\61\25\uffff\1\60\11\uffff\1\57",
			"\1\72\1\uffff\1\62\2\uffff\1\63\1\uffff\1\64\1\65\1\66\1\67\1\uffff"+
			"\1\70\4\uffff\1\71",
			"\1\102\33\uffff\1\73\3\uffff\1\74\3\uffff\1\75\2\uffff\1\76\2\uffff"+
			"\1\77\2\uffff\1\100\2\uffff\1\101",
			"\1\112\21\uffff\1\103\3\uffff\1\104\2\uffff\1\105\1\106\2\uffff\1\107"+
			"\2\uffff\1\110\5\uffff\1\111",
			"\1\115\16\uffff\1\113\15\uffff\1\114\2\uffff\1\116",
			"\1\117\11\uffff\1\120",
			"\1\125\26\uffff\1\121\2\uffff\1\122\2\uffff\1\123\2\uffff\1\124",
			"\1\133\22\uffff\1\126\3\uffff\1\127\2\uffff\1\130\2\uffff\1\131\2\uffff"+
			"\1\132",
			"\1\135\11\uffff\1\136\21\uffff\1\134",
			"\1\137\1\140\16\uffff\1\141\1\uffff\1\142",
			"\1\143",
			"\1\144\11\uffff\1\145\5\uffff\1\146",
			"\1\154\13\uffff\1\147\3\uffff\1\150\2\uffff\1\151\6\uffff\1\153\u0086"+
			"\uffff\1\152",
			"\1\155\3\uffff\1\156\2\uffff\1\157\3\uffff\1\160\2\uffff\1\161\2\uffff"+
			"\1\164\2\uffff\1\162\3\uffff\1\163",
			"\12\174\13\uffff\1\172\3\uffff\1\173\27\uffff\1\165\3\uffff\1\166\2"+
			"\uffff\1\167\6\uffff\1\170\5\uffff\1\171",
			"\1\u008b\16\uffff\1\u0088\4\uffff\1\u008a\1\uffff\1\u0089\11\uffff\1"+
			"\175\1\uffff\1\176\1\uffff\1\177\2\uffff\1\u0080\1\u0081\1\uffff\1\u0082"+
			"\3\uffff\1\u0083\1\u0084\3\uffff\1\u0085\1\u0086\1\uffff\1\u0087",
			"\1\u0090\2\uffff\1\u0094\6\uffff\1\u008f\5\uffff\1\u0092\22\uffff\1"+
			"\u0093\1\u008c\5\uffff\1\u008d\2\uffff\1\u008e\2\uffff\1\u0091",
			"\1\u0098\3\uffff\1\u0097\37\uffff\1\u0096\3\uffff\1\u0095",
			"\1\u009e\11\uffff\1\u009c\21\uffff\1\u009d\3\uffff\1\u0099\2\uffff\1"+
			"\u009a\1\u009b",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a2\5\uffff\1\u00a1",
			"\1\u00a3",
			"\3\53\3\uffff\1\53\1\u00a4\1\53\1\uffff\12\u00a5\1\u00a8\1\u00a6\5\uffff"+
			"\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"",
			"\2\u00ad\2\uffff\1\u00ad\22\uffff\1\u00ad\5\uffff\2\u00ab\4\uffff\2"+
			"\u00ab\2\uffff\12\u00aa\2\u00ab\5\uffff\32\u00ac\4\uffff\1\u00ab\1\uffff"+
			"\32\u00ab\u1f9e\uffff\1\u00ab",
			"\1\u00ae",
			"\3\53\3\uffff\2\53\1\u00b0\1\uffff\14\53\5\uffff\32\53\4\uffff\1\53"+
			"\1\uffff\32\53\u1f9e\uffff\1\53",
			"",
			"",
			"",
			"\1\u00b2\1\uffff\1\u00b3\4\uffff\1\u00b1",
			"\1\u00b4\4\uffff\1\u00b5",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7\62\uffff\1\u00b6",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7\122\uffff\1\u00b8",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00c0\3\uffff\1\u00bf",
			"\1\u00c1\25\uffff\1\u00c2",
			"\1\u00c3",
			"\1\u00c4\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf\2\uffff\1\u00d0\2\uffff\1\u00d3\4\uffff\1\u00d1\5\uffff\1\u00d2",
			"\1\u00d4",
			"\1\u00d5\15\uffff\1\u00d6\5\uffff\1\u00d7",
			"\1\u00d8\1\u00d9\1\uffff\1\u00da\2\uffff\1\u00db\1\u00dc",
			"\1\u00dd\7\uffff\1\u00de\5\uffff\1\u00e0\5\uffff\1\u00df",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3\4\uffff\1\u00e4\3\uffff\1\u00e5\3\uffff\1\u00e6",
			"\1\u00e7",
			"\1\u00e8\3\uffff\1\u00e9\5\uffff\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed\10\uffff\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1\10\uffff\1\u00f2\1\uffff\1\u00f3",
			"\1\u00f4\4\uffff\1\u00f5",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"\1\u00f6\14\uffff\1\u00f7",
			"\1\u00f8",
			"\1\u00f9\10\uffff\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd\3\uffff\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103\5\uffff\1\u0104",
			"\1\u0106\3\uffff\1\u0105",
			"\1\u0107",
			"\1\u0108\3\uffff\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111\14\uffff\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115\4\uffff\1\u0116\3\uffff\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"",
			"\1\u011a",
			"\1\u011b",
			"\1\u011e\6\uffff\1\u011c\1\uffff\1\u011d",
			"\1\u011f\1\uffff\1\u0120\6\uffff\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124\2\uffff\1\u0125\1\u0126\1\uffff\1\u0127\2\uffff\1\u0128",
			"\1\u0129\4\uffff\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012e\7\uffff\1\u012d",
			"\1\u012f\17\uffff\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\3\53\3\uffff\2\u0137\1\53\1\uffff\12\174\1\53\1\u0138\5\uffff\32\53"+
			"\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u0139\2\uffff\1\u013a\1\u013b\6\uffff\1\u013c",
			"\1\u013d\6\uffff\1\u013e",
			"\1\u013f\22\uffff\1\u0140",
			"\1\u0141\3\uffff\1\u0142",
			"\1\u0143\11\uffff\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147\7\uffff\1\u0148",
			"\1\u0149",
			"\1\u014b\4\uffff\1\u014a",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0153\130\uffff\1\u0152",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015d\1\uffff\1\u015c",
			"\1\u015e",
			"\1\u015f",
			"\1\u0163\4\uffff\1\u0160\2\uffff\1\u0161\6\uffff\1\u0162",
			"\1\u0164",
			"\1\u0166\5\uffff\1\u0165",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\12\u016f",
			"\3\53\3\uffff\1\53\1\u00a4\1\53\1\uffff\12\u00a5\1\u00a8\1\u00a6\5\uffff"+
			"\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\12\u0170",
			"",
			"\12\u0171",
			"",
			"\2\u0173\2\uffff\1\u0173\22\uffff\1\u0173\10\uffff\1\u0174\6\uffff\12"+
			"\u0172",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\1\u0175\4\uffff\2\u00ab\1"+
			"\uffff\1\u0177\2\uffff\2\u00ab\1\u0175\13\uffff\2\u00ab\3\uffff\1\u0175"+
			"\37\uffff\1\u00ab\1\uffff\32\u00ab\u1f9e\uffff\1\u00ab",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\1\u0179\4\uffff\2\u0178\1"+
			"\uffff\1\u0177\2\uffff\2\u0178\1\u0179\13\uffff\2\u0178\3\uffff\1\u0179"+
			"\1\uffff\32\u0178\4\uffff\1\u0178\1\uffff\32\u0178\u1f9e\uffff\1\u0178",
			"",
			"\1\u017a",
			"",
			"\3\53\3\uffff\2\53\1\u00b0\1\uffff\14\53\5\uffff\32\53\4\uffff\1\53"+
			"\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\152",
			"\1\u0184",
			"\1\u0186\7\uffff\1\u0185",
			"\1\u0187\20\uffff\1\u0188",
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
			"\1\u0196\15\uffff\1\u0197",
			"\1\u0198\12\uffff\1\u0199\2\uffff\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d\6\uffff\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4\25\uffff\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab\22\uffff\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\1\u01b1",
			"\1\u01b2\3\uffff\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8\5\uffff\1\u01b9",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7\113\uffff\1\u01be",
			"\1\u01bf",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4\5\uffff\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\152",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4\27\uffff\1\u01d5",
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
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u01fc",
			"\1\u01fd",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\152",
			"\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"",
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
			"\1\u0212\5\uffff\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a\7\uffff\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"",
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
			"\3\53\3\uffff\1\53\1\u0242\1\53\1\uffff\12\u016f\1\53\1\u00a6\5\uffff"+
			"\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\3\53\3\uffff\1\53\1\u0243\1\53\1\uffff\12\u0170\1\53\1\u00a6\5\uffff"+
			"\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\u0244\2\uffff\1\u0244\22\uffff\1\u0244\17\uffff\12\u0171",
			"\2\u0173\2\uffff\1\u0173\22\uffff\1\u0173\10\uffff\1\u0174\6\uffff\12"+
			"\u0245",
			"\2\u0173\2\uffff\1\u0173\22\uffff\1\u0173\5\uffff\2\u0246\1\uffff\1"+
			"\u00ad\2\uffff\2\u0246\2\uffff\12\u0247\2\u0246\5\uffff\32\u0248\4\uffff"+
			"\1\u0246\1\uffff\32\u0246\u1f9e\uffff\1\u0246",
			"\3\53\3\uffff\3\53\1\uffff\14\53\5\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\10\uffff\1\u0177",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\5\uffff\2\u0246\4\uffff\2"+
			"\u0246\2\uffff\12\u0247\2\u0246\5\uffff\32\u0248\4\uffff\1\u0246\1\uffff"+
			"\32\u0246\u1f9e\uffff\1\u0246",
			"\3\53\3\uffff\3\53\1\uffff\14\53\5\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\1\u0179\4\uffff\2\u0178\1"+
			"\uffff\1\u0177\2\uffff\2\u0178\1\u0179\13\uffff\2\u0178\3\uffff\1\u0179"+
			"\1\uffff\32\u0178\4\uffff\1\u0178\1\uffff\32\u0178\u1f9e\uffff\1\u0178",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\10\uffff\1\u0177",
			"\1\u024a",
			"\1\u024b\3\uffff\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"\2\u00b7\2\uffff\1\u00b7\22\uffff\1\u00b7",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u0253",
			"\1\u0254",
			"\1\152",
			"\1\u0255",
			"\1\u0256\3\uffff\1\u0257",
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
			"\1\152\103\uffff\1\u027e\10\uffff\1\u027f",
			"\1\u0227",
			"\1\u0280",
			"\1\u0281",
			"\1\152",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\152",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\1\152",
			"\1\u0291",
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
			"\1\152",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
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
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\22\53\1\u02b9\7\53\u1f9e\uffff\1\53",
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
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\4\uffff\2\53\2\uffff\1\53\1\u02c4\12\53\5\uffff\1\u02c5\1\u02c6"+
			"\1\u02c7\1\53\1\u02c8\1\u02c9\1\u02ca\1\53\1\u02cb\1\53\1\u02cc\1\u02cd"+
			"\1\u02ce\1\u02cf\3\53\1\u02d0\1\u02d1\1\u02d2\2\53\1\u02d3\3\53\4\uffff"+
			"\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u02d4",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\12\53\1\u02d5\7\53\1"+
			"\u01f9\7\53\u1f9e\uffff\1\53",
			"\1\u02d6",
			"",
			"\1\u02d7",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\2\u02de\2\uffff\1\u02de\22\uffff\1\u02de",
			"\12\u02df",
			"\12\u02e0",
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
			"\1\152",
			"\1\u02eb",
			"\1\u02ec",
			"\1\152",
			"\1\152",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"\1\u02f0",
			"\1\u02f1",
			"\1\u02f2",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\u02f9",
			"\1\152\17\uffff\1\u0227",
			"\1\u02fa",
			"",
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
			"\1\152",
			"\1\u0307",
			"\1\u0308",
			"\1\152\107\uffff\1\u0309",
			"\1\u01fe",
			"\1\u030a",
			"\1\u030b",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"",
			"\12\u0312",
			"\12\u0313",
			"",
			"\2\u0173\2\uffff\1\u0173\22\uffff\1\u0173\10\uffff\1\u0314\6\uffff\12"+
			"\u0315",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\1\u0316\4\uffff\2\u0246\1"+
			"\uffff\1\u0177\2\uffff\2\u0246\1\u0316\13\uffff\2\u0246\3\uffff\1\u0316"+
			"\37\uffff\1\u0246\1\uffff\32\u0246\u1f9e\uffff\1\u0246",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\10\uffff\1\u0177\6\uffff\12"+
			"\u0247",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\1\u0318\4\uffff\2\u0317\1"+
			"\uffff\1\u0177\2\uffff\2\u0317\1\u0318\13\uffff\2\u0317\3\uffff\1\u0318"+
			"\1\uffff\32\u0317\4\uffff\1\u0317\1\uffff\32\u0317\u1f9e\uffff\1\u0317",
			"",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\3\u01fe\1\uffff\1\u01fe\1\uffff\1\u01fe\1\uffff\2\u0321\3\uffff\3\u01fe"+
			"\2\uffff\1\u0321\1\uffff\3\u01fe",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u032d",
			"\1\u032e",
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
			"\1\152",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0344",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\2\u0348\2\uffff\1\u0348\22\uffff\1\u0348",
			"\1\u0349",
			"\1\u034a",
			"\1\152",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\152",
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
			"\1\152\122\uffff\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\1\u035d",
			"\1\152",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\1\152",
			"\1\u0364",
			"\1\u0365",
			"\1\152\104\uffff\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\u02de",
			"\1\u0369",
			"\1\u036a",
			"\1\u036b",
			"\1\u0227",
			"\1\u036c",
			"\1\u036d",
			"\1\152",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\152",
			"\1\u0371",
			"\1\u0372",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376",
			"\1\152",
			"\1\u0377",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u0379",
			"\1\u037a",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u037b",
			"\1\u037c",
			"\1\152\122\uffff\1\u037d",
			"\1\u037e",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"\1\u0383",
			"\2\53\2\uffff\1\53\22\uffff\1\53\10\uffff\1\53\6\uffff\3\53\1\u0384"+
			"\1\53\1\u0385\4\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\14"+
			"\53\1\u0386\15\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0388\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\16\53\1\u0387\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u0389\3\53\1\u038a\2\53\1\u038b\5\53\1\u038c\5\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u038d\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u038e\2\53\1\u038f\16\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0390\11\53\1\u0391\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0392\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0393\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0394"+
			"\15\53\1\u0395\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u0396\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u0397\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u0398\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\14"+
			"\53\1\u0399\6\53\1\u039a\1\u039b\5\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u039c\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u039d\2\53\1\u039e\1\u039f\21\53\u1f9e\uffff\1\53",
			"\1\u03a0",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"",
			"\3\53\3\uffff\2\u0137\1\53\1\uffff\12\u02df\1\53\1\u0138\5\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\3\53\3\uffff\2\u03a9\1\53\1\uffff\12\u02e0\1\53\1\u0138\5\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\152",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"\1\u03b0",
			"\1\u03b1",
			"\1\152",
			"\1\u03b2",
			"\1\152",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc",
			"\1\u03bd",
			"\1\u03be",
			"\1\u03bf",
			"\1\u03c0",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\1\u03c7",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"\1\u03cb",
			"\1\152",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\1\u03d0",
			"\1\u03d1",
			"\1\u03d2",
			"\1\u03d3",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u0136",
			"\1\u03d6\2\uffff\12\u0312",
			"\3\53\3\uffff\1\53\1\u03d7\1\53\1\uffff\12\u0313\1\53\1\u00a6\5\uffff"+
			"\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\3\53\3\uffff\3\53\1\uffff\12\u03d9\2\53\5\uffff\32\53\4\uffff\1\53"+
			"\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\u0173\2\uffff\1\u0173\22\uffff\1\u0173\10\uffff\1\u0174\6\uffff\12"+
			"\u0315",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\10\uffff\1\u0177",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\1\u0318\4\uffff\2\u0317\1"+
			"\uffff\1\u0177\2\uffff\2\u0317\1\u0318\13\uffff\2\u0317\3\uffff\1\u0318"+
			"\1\uffff\32\u0317\4\uffff\1\u0317\1\uffff\32\u0317\u1f9e\uffff\1\u0317",
			"\2\u0176\2\uffff\1\u0176\22\uffff\1\u0176\10\uffff\1\u0177",
			"\1\u03da",
			"\1\u0321",
			"\1\u03db",
			"\1\u03dc",
			"\1\u03dd",
			"\1\u03de",
			"\1\u03df",
			"\1\u03df",
			"",
			"\1\u03e0",
			"\1\u03e1\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\1\u03e5",
			"\1\u03e6",
			"\1\u03e7",
			"\1\u03e8",
			"\1\152",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"\1\u03ec",
			"\1\u03ed",
			"\1\u03ee",
			"\1\u03ef",
			"\1\u03f0",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"\1\u03f4",
			"\1\152",
			"\1\u03f5",
			"\1\u03f6",
			"\1\152\122\uffff\1\u03f7",
			"\1\u03f8",
			"\1\u03f9",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\152",
			"\1\u03fa",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u03fb",
			"\1\u03fc",
			"\2\u0348\2\uffff\1\u0348\22\uffff\1\u0348\41\uffff\1\152\1\uffff\1\152"+
			"\16\uffff\1\u03fd",
			"\1\u03fe",
			"\1\u03ff",
			"\1\152",
			"\1\u0400",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\1\u0405",
			"\1\u0406",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\1\152",
			"\1\u040a",
			"\1\152",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"\1\u040e",
			"\1\u040f",
			"\1\152",
			"\1\u03df",
			"\1\u03df",
			"\1\152",
			"\1\152",
			"\1\152",
			"\1\u0410",
			"\1\u0411",
			"\1\u0412",
			"\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\1\152",
			"\1\u0416",
			"\1\u0417",
			"\1\u0418",
			"\1\u0419",
			"\1\u041a",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\16\53\1\u041b\3\53\1"+
			"\u01f9\7\53\u1f9e\uffff\1\53",
			"\1\u041c",
			"\1\u041d",
			"\1\u041e",
			"\1\u041f",
			"\1\u0420",
			"",
			"\1\u0421",
			"\1\152",
			"\1\u0422",
			"\1\u0423",
			"\1\152",
			"\1\u0424",
			"\1\u0425",
			"\1\152",
			"\1\u0426",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0427",
			"\2\53\2\uffff\1\53\22\uffff\1\u0428\10\uffff\1\53\6\uffff\12\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0429\10\uffff\1\53\6\uffff\12\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u042a\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\30"+
			"\53\1\u042b\1\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\1\u042c\1\53\4\uffff\2\53\2"+
			"\uffff\14\53\5\uffff\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u042d\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\24"+
			"\53\1\u042e\5\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u042f\10\53\1\u0430\16\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0431\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\6\53"+
			"\1\u0432\23\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0433\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0434"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0435\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\13"+
			"\53\1\u0436\5\53\1\u0437\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u0438\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\2\53\1\u0439\27\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\53"+
			"\1\u043a\30\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u043b\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u043c\4\53\1\u043d\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\25"+
			"\53\1\u043e\4\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\24"+
			"\53\1\u043f\5\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u0440\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0441"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u0442\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\30"+
			"\53\1\u0443\1\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\13"+
			"\53\1\u0444\16\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u0445\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0446\10\53\u1f9e\uffff\1\53",
			"\1\u0447",
			"\1\u0448",
			"",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d",
			"\1\u044e",
			"\1\u044f",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0450",
			"\1\u0451",
			"\1\u0452",
			"\1\u0453",
			"\1\u0454",
			"\1\u0455",
			"\1\u0456",
			"\1\u0457",
			"\1\u0458",
			"\1\u0459\3\uffff\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\152",
			"\1\u03df",
			"\1\u045d",
			"\1\u045e",
			"\1\u045f",
			"\1\u0460",
			"\1\u03df",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463",
			"\1\u0464",
			"\1\u0465",
			"\1\u0466",
			"\1\u0467",
			"\1\u0468",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
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
			"\12\u0478",
			"\12\u0479",
			"",
			"\12\u047a",
			"\1\u047b",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u047c",
			"\1\u047d",
			"\2\u047e\2\uffff\1\u047e\22\uffff\1\u047e",
			"\1\u047f",
			"\3\u01fe\1\uffff\1\u01fe\1\uffff\1\u01fe\1\uffff\2\u0321\3\uffff\3\u01fe"+
			"\2\uffff\1\u0321\1\uffff\3\u01fe",
			"\1\152",
			"\1\u0480",
			"\1\152",
			"\1\u0481",
			"\1\u0482",
			"\1\u0483",
			"\1\u0484",
			"\1\u0485",
			"\1\152",
			"\1\u0486",
			"\1\u0487",
			"\1\u0488",
			"\1\u0489",
			"\1\u048a",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\152",
			"\1\u048b",
			"\1\u048c",
			"\1\152",
			"\1\152",
			"\1\u048d",
			"\1\152",
			"\1\u048e",
			"\1\u048f",
			"\1\152\122\uffff\1\u0490",
			"\1\u0491",
			"\1\u0492",
			"",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0493",
			"\1\u0494",
			"\1\u0495",
			"\1\u0496",
			"\1\u0497",
			"\1\152",
			"\1\152",
			"\1\152",
			"\1\u0498",
			"\1\u0499",
			"\1\u049a",
			"\1\u049b",
			"\1\152",
			"\1\u049c",
			"\1\u049d",
			"\1\152",
			"\1\u049e",
			"\1\152",
			"\1\u049f",
			"\1\u04a0",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u04a1",
			"\1\u0227",
			"\1\u04a2",
			"\1\152",
			"\1\u04a3",
			"\1\u04a4",
			"\1\u04a5",
			"\1\u04a6",
			"\1\u04a7",
			"\1\152",
			"\1\u04a8",
			"\1\u04a9",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u04aa",
			"\1\u04ab",
			"\1\u04ac",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u04ad",
			"\1\u04ae",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\10\53\1\u04af\21\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\10\53\1\u04b0\21\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u04b1\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\12"+
			"\53\1\u04b2\17\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u04b3\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\37\uffff\1\53\1\uffff\32\53\u1f9e"+
			"\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u04b4\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\14"+
			"\53\1\u04b5\15\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\12"+
			"\53\1\u04b6\17\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u04b7\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\13"+
			"\53\1\u04b8\16\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\13"+
			"\53\1\u04b9\16\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\13"+
			"\53\1\u04ba\16\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u04bb\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\14"+
			"\53\1\u04bc\15\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u04bd\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u04be\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u04bf\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u04c0\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u04c1\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\6\53"+
			"\1\u04c2\23\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u04c3\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u04c4\27\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u04c5"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\6\53"+
			"\1\u04c6\23\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u04c7\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u04c8\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u04c9\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u04cb\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u04cc\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u04cd\25\53\u1f9e\uffff\1\53",
			"\1\u04ce",
			"\1\u04cf",
			"\1\152",
			"\1\u04d0",
			"\1\u04d1",
			"\1\u04d2",
			"\1\152",
			"\1\u0227",
			"\12\u04d3",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u04d4",
			"\1\u04d5",
			"\1\u04d6",
			"\1\u04d7",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u04d8",
			"\1\u04d9",
			"\1\u04da",
			"\1\152",
			"\1\152",
			"\1\u04db",
			"\1\u04dc",
			"\1\152",
			"\1\u04dd",
			"\1\u04de",
			"\1\u04df",
			"\1\u04e0",
			"\1\152",
			"\1\152",
			"\1\u0227",
			"\1\u03df",
			"\1\u03df",
			"\1\u04e1",
			"\1\u04e2",
			"\2\u0348\2\uffff\1\u0348\22\uffff\1\u0348\122\uffff\1\u04e3",
			"\1\u04e4",
			"\1\u0227",
			"\1\u0378",
			"\1\u04e5",
			"\1\u04e6",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u04e7",
			"\1\u0227",
			"\1\u04e8",
			"\1\u04e9",
			"\1\u04ea",
			"\1\u04eb",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"",
			"\3\53\3\uffff\3\53\1\uffff\12\u0478\2\53\5\uffff\32\53\4\uffff\1\53"+
			"\1\uffff\32\53\u1f9e\uffff\1\53",
			"\12\u0479\1\uffff\1\u00a6",
			"\12\u04ed",
			"\1\u04ee",
			"\1\u04ef",
			"\1\u04f0",
			"",
			"\1\u04f1",
			"\1\u04f2",
			"\1\u04f3",
			"\1\u04f4",
			"\1\u04f5",
			"\1\u04f6",
			"\1\152",
			"\1\152",
			"\1\u04f7",
			"\1\u04f8",
			"\1\u04f9",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u04fa",
			"\1\u04fb",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u04fc",
			"\1\152",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\152",
			"\1\u04fd",
			"\1\152",
			"\1\152",
			"\1\u04fe",
			"\1\u04ff",
			"\1\u0500",
			"\1\u0501",
			"\1\u0502",
			"\1\152",
			"\1\u0503",
			"\1\u0504",
			"\1\u0505",
			"\1\u0506",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0507",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\4\53\1\u0508\15\53\1"+
			"\u01f9\7\53\u1f9e\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\152",
			"\1\152",
			"\1\u0509",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u050a",
			"\1\152",
			"\1\u050b",
			"\1\u050c",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u050d\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u050e\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u050f\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u0510\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\17\53\1\u0511\12\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0512"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\53"+
			"\1\u0513\30\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0514\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0515\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\30"+
			"\53\1\u0516\1\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u0517\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u0518\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\1"+
			"\53\1\u0519\1\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53"+
			"\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u051a"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u051b\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u051c\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u051d\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\1\u051e\1\53\4\uffff\2\53\2"+
			"\uffff\14\53\5\uffff\32\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u051f"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0520\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\7\53\1\u0521\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0522"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\2"+
			"\53\1\u0523\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0524\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u0525\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u0526\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u0527\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0528\25\53\u1f9e\uffff\1\53",
			"\2\53\1\u052c\3\uffff\3\53\1\uffff\14\53\5\uffff\1\u0529\1\u052b\12"+
			"\53\1\u052d\2\53\1\u052a\12\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u052e\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u052f\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7"+
			"\53\1\u0530\22\53\u1f9e\uffff\1\53",
			"\1\152",
			"\1\152",
			"\1\u0531",
			"\1\u0532",
			"\1\u0533",
			"\3\53\3\uffff\2\u03a9\1\53\1\uffff\12\u04d3\1\53\1\u0138\5\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u03df",
			"\1\u0534",
			"\1\152",
			"\1\152",
			"\1\152",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0535",
			"\1\152",
			"\1\u0536",
			"\1\u0227",
			"\1\u0537",
			"\1\u03df",
			"\1\u03df",
			"\1\u03df",
			"\2\u0348\2\uffff\1\u0348\22\uffff\1\u0538\1\53\4\uffff\3\53\3\uffff"+
			"\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\1\u0539",
			"\1\u053a",
			"\1\u053b",
			"\1\u053c",
			"\1\u053d",
			"\1\u053e",
			"\1\u053f",
			"\1\u0540",
			"",
			"\1\u0541",
			"",
			"\1\u0542",
			"\1\152",
			"\1\u0543",
			"\1\152",
			"\1\u0544",
			"\1\u0545",
			"\1\u0546",
			"\1\u0547",
			"\1\152",
			"\1\u0548",
			"\1\u0549",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u054a",
			"\1\u054b",
			"\1\u054c",
			"\1\u054d",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u054e",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u054f",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u0550",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\152",
			"\1\u0551",
			"\1\u0552",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0553",
			"\1\u0554",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u0555\27\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u0556\27\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u0557\27\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u0558\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0559\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\17"+
			"\53\1\u055a\12\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u055b\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u055c\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u055d\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\1"+
			"\53\1\u055e\1\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53"+
			"\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u055f\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\2\53\1\u0560\27\53\4\uffff\1\53"+
			"\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u0561\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u0562\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u0563\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0564\1\53\4\uffff\2\53\1\uffff\1\u04ca"+
			"\2\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1"+
			"\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0565\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\37\uffff\1\53\1\uffff\32\53\u1f9e"+
			"\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u0566\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\2\53\1\u0567\27\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0568"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u0569\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u056a\10\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\22\53\1\u056b\7\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u056c\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u056d"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\27"+
			"\53\1\u056e\2\53\u1f9e\uffff\1\53",
			"\1\u056f",
			"\1\u0570",
			"\1\u0571",
			"\2\53\4\uffff\2\53\2\uffff\14\53\5\uffff\14\53\1\u0572\15\53\4\uffff"+
			"\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u02d4",
			"\2\53\2\uffff\1\53\22\uffff\1\u0573\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0574"+
			"\31\53\u1f9e\uffff\1\53",
			"\1\u0575",
			"\1\152",
			"\1\u0576",
			"\1\u0577",
			"\1\u0578",
			"\1\u0579",
			"\1\u057a",
			"\2\u0348\2\uffff\1\u0348\22\uffff\1\u0348\40\uffff\1\u01fe\1\u057b\1"+
			"\u01fe\1\152\1\u01fe\1\uffff\1\u01fe\6\uffff\3\u01fe\2\uffff\1\u03fd"+
			"\1\uffff\3\u01fe",
			"\1\u057c",
			"\1\u057d",
			"\1\u03df",
			"\1\u057e",
			"\1\u057f",
			"\1\u03df",
			"\1\u0580",
			"\1\152",
			"\12\u0581",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\152",
			"\1\u0582",
			"\1\u0583",
			"\1\u0584",
			"\1\u0585",
			"\1\152",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0586",
			"\1\152",
			"\1\u0587",
			"\1\u0588",
			"\1\u0589",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\152",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u058a\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u058b\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u058c"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\2\53\1\u058d\27\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u058e\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u058f\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u0590\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\2\53\1\u0591\27\53\4\uffff\1\53"+
			"\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u0592\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u0593\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0594\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\21\53\1\u0595\4\53\1\u0596\3\53\4\uffff\1\53\1\uffff\32\53"+
			"\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\21\53\1\u0597\10\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u0598\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u0599\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u059a\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\24"+
			"\53\1\u059b\5\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\1\53\1\u059d\1\53\1\u059c\26\53\4\uffff\1\53\1\uffff\32\53"+
			"\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u059e\27\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u059f\1\53\4\uffff\2\53\1\uffff\1\u04ca"+
			"\2\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1"+
			"\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u05a0\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\1\u05a1",
			"\1\u05a2",
			"\1\u05a3",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u05a4\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\22\53\1\u05a5\7\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u05a6\21\53\u1f9e\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u05a7",
			"\1\u05a8",
			"\1\u05a9",
			"\1\152",
			"\1\u05aa",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\152",
			"\1\u05ab",
			"\1\u05ac",
			"\12\u05ad",
			"\1\u05ae",
			"\1\u05af",
			"\1\u05b0",
			"\1\152",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u05b1",
			"\1\152",
			"\1\152",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u05b2\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u05b3"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u05b4\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u05b5\1\53\4\uffff\2\53\1\uffff\1\u04ca"+
			"\2\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1"+
			"\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u05b6"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\22\53\1\u05b7\3\53\1\u05b8\3\53\4\uffff\1\53\1\uffff\32\53"+
			"\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u05b9\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u05ba"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u05bb\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u05bc"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u05bd\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u05be\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u05bf\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u05c0\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u05c1\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\2\53\1\u05c2\27\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u05c3\26\53\u1f9e\uffff\1\53",
			"\1\u05c4",
			"\1\u05c5",
			"\1\u05c6",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u043d\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\17"+
			"\53\1\u05c7\12\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u05c8\10\53\u1f9e\uffff\1\53",
			"\1\u05c9",
			"\2\u03fd\2\uffff\1\u03fd\22\uffff\1\u03fd",
			"\1\u0227",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\53\4\uffff\3\53\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1\uffff\32"+
			"\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u05ca",
			"\12\u05cb",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\1\u0227",
			"\1\u05cc",
			"\1\152",
			"\2\53\2\uffff\1\53\22\uffff\1\u05cd\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\12"+
			"\53\1\u05ce\17\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u05cf"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\2\53\1\u05d0\17\53\1\u05d1\7\53\4\uffff\1\53\1\uffff\32\53"+
			"\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u05d2\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u05d3\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u05d4\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u05d5\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u05d6\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u05d7\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u05d8\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u05d9\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\6\53"+
			"\1\u05da\23\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u05db\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u05dc\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u05dd\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\1\u05de",
			"\1\u05df",
			"\1\u05e0",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u05e1\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u05e2\25\53\u1f9e\uffff\1\53",
			"\1\u05e3",
			"\1\u05e4",
			"\12\u05e5",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\26\53\1\u05e6\3\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u05e7\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u05e8\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u05e9\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\17"+
			"\53\1\u05ea\12\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u05eb\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u05ec\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u05ed\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u05ee\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u05ef\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u05f0\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u05f2\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u05f1\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u05f3\27\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u05f4\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u05f5"+
			"\31\53\u1f9e\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u052c\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\1\u05f6",
			"\1\53\4\uffff\2\53\1\u052c\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u05f7\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u05f8\26\53\u1f9e\uffff\1\53",
			"\1\152",
			"\1\u05f9",
			"\3\53\3\uffff\3\53\1\uffff\14\53\5\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u05fa"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u05fb\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u05fc\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u05fd\27\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u05fe\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u05ff\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0600\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0601\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\1\u0602\31\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0603\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u05f2\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\3\53\3\uffff\3\53\1\uffff\14\53\5\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u0604\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0605"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u0606\6\53\u1f9e\uffff\1\53",
			"\1\u0607",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u0608\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u01fa\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\22\53\1\u01f9\7\53\u1f9e"+
			"\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u0609\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\1\53\1\u060a\30\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u060b\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\12"+
			"\53\1\u060c\17\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u060d\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u060e\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u060f\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u0610\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u05f2\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4"+
			"\53\1\u0611\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0612\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\1\u0613",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\6\53"+
			"\1\u0614\23\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0615\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0616"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0617\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u0618\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u0619\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u061a"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u061b\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\22"+
			"\53\1\u061c\7\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\3\53\1\u061d\26\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\1\u061e",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u061f\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0620\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\30"+
			"\53\1\u0621\1\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0622\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\6\53"+
			"\1\u0623\23\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\1\u0624"+
			"\31\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u0625\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0626\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u05f2\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\24"+
			"\53\1\u0627\5\53\u1f9e\uffff\1\53",
			"\1\u0628",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0629\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u062a\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u062b\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u062c\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\26\53\1\u062d\3\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\2\53"+
			"\1\u062e\27\53\u1f9e\uffff\1\53",
			"\1\u062f",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0630\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\21"+
			"\53\1\u0631\10\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0632\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
			"\1\u0633\22\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\12"+
			"\53\1\u0634\17\53\u1f9e\uffff\1\53",
			"\1\53\4\uffff\2\53\1\u052c\3\uffff\3\53\1\uffff\14\53\3\uffff\1\53\1"+
			"\uffff\14\53\1\u01fb\15\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u0635\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u0636\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u0637\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\u0638\1\53\4\uffff\2\53\1\uffff\1\53\2"+
			"\uffff\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff"+
			"\32\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\3\53"+
			"\1\u0639\26\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\23"+
			"\53\1\u063a\6\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\1\53\5\uffff\2\53\4\uffff\2\53\2\uffff\14"+
			"\53\5\uffff\23\53\1\u063b\6\53\4\uffff\1\53\1\uffff\32\53\u1f9e\uffff"+
			"\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\4\53"+
			"\1\u063c\25\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\16"+
			"\53\1\u063d\13\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\13"+
			"\53\1\u063e\16\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\13"+
			"\53\1\u063f\16\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\10"+
			"\53\1\u0640\21\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\15"+
			"\53\1\u0641\14\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\53\2\uffff\3"+
			"\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\6\53"+
			"\1\u0642\23\53\u1f9e\uffff\1\53",
			"\2\53\2\uffff\1\53\22\uffff\2\53\4\uffff\2\53\1\uffff\1\u04ca\2\uffff"+
			"\3\53\13\uffff\2\53\3\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32"+
			"\53\u1f9e\uffff\1\53"
	};

	static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
	static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
	static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
	static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
	static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
	static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
	static final short[][] DFA71_transition;

	static {
		int numStates = DFA71_transitionS.length;
		DFA71_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
		}
	}

	class DFA71 extends DFA {

		public DFA71(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 71;
			this.eot = DFA71_eot;
			this.eof = DFA71_eof;
			this.min = DFA71_min;
			this.max = DFA71_max;
			this.accept = DFA71_accept;
			this.special = DFA71_special;
			this.transition = DFA71_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | FOLLOWING_TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | GROUP_ENDING_ANNOUNCEMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA71_36 = input.LA(1);
						 
						int index71_36 = input.index();
						input.rewind();
						s = -1;
						if ( (LA71_36=='S') ) {s = 182;}
						else if ( ((LA71_36 >= '\t' && LA71_36 <= '\n')||LA71_36=='\r'||LA71_36==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_36);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA71_78 = input.LA(1);
						 
						int index71_78 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_78 >= '\t' && LA71_78 <= '\n')||LA71_78=='\r'||LA71_78==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_78);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA71_184 = input.LA(1);
						 
						int index71_184 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_184 >= '\t' && LA71_184 <= '\n')||LA71_184=='\r'||LA71_184==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_184);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA71_39 = input.LA(1);
						 
						int index71_39 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_39 >= '\t' && LA71_39 <= '\n')||LA71_39=='\r'||LA71_39==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_39);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA71_383 = input.LA(1);
						 
						int index71_383 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_383 >= '\t' && LA71_383 <= '\n')||LA71_383=='\r'||LA71_383==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_383);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA71_182 = input.LA(1);
						 
						int index71_182 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_182 >= '\t' && LA71_182 <= '\n')||LA71_182=='\r'||LA71_182==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_182);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA71_38 = input.LA(1);
						 
						int index71_38 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_38 >= '\t' && LA71_38 <= '\n')||LA71_38=='\r'||LA71_38==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_38);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA71_384 = input.LA(1);
						 
						int index71_384 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_384 >= '\t' && LA71_384 <= '\n')||LA71_384=='\r'||LA71_384==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_384);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA71_240 = input.LA(1);
						 
						int index71_240 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_240 >= '\t' && LA71_240 <= '\n')||LA71_240=='\r'||LA71_240==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_240);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA71_77 = input.LA(1);
						 
						int index71_77 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA71_77 >= '\t' && LA71_77 <= '\n')||LA71_77=='\r'||LA71_77==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_77);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA71_238 = input.LA(1);
						 
						int index71_238 = input.index();
						input.rewind();
						s = -1;
						if ( (LA71_238=='l') ) {s = 446;}
						else if ( ((LA71_238 >= '\t' && LA71_238 <= '\n')||LA71_238=='\r'||LA71_238==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_238);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA71_37 = input.LA(1);
						 
						int index71_37 = input.index();
						input.rewind();
						s = -1;
						if ( (LA71_37=='s') ) {s = 184;}
						else if ( ((LA71_37 >= '\t' && LA71_37 <= '\n')||LA71_37=='\r'||LA71_37==' ') && ((allowJudge))) {s = 183;}
						else s = 43;
						 
						input.seek(index71_37);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA71_0 = input.LA(1);
						s = -1;
						if ( (LA71_0=='M') ) {s = 1;}
						else if ( (LA71_0=='O') ) {s = 2;}
						else if ( (LA71_0=='N') ) {s = 3;}
						else if ( (LA71_0=='A') ) {s = 4;}
						else if ( (LA71_0=='B') ) {s = 5;}
						else if ( (LA71_0=='C') ) {s = 6;}
						else if ( (LA71_0=='D') ) {s = 7;}
						else if ( (LA71_0=='E') ) {s = 8;}
						else if ( (LA71_0=='F') ) {s = 9;}
						else if ( (LA71_0=='G') ) {s = 10;}
						else if ( (LA71_0=='H') ) {s = 11;}
						else if ( (LA71_0=='I') ) {s = 12;}
						else if ( (LA71_0=='J') ) {s = 13;}
						else if ( (LA71_0=='K') ) {s = 14;}
						else if ( (LA71_0=='L') ) {s = 15;}
						else if ( (LA71_0=='P') ) {s = 16;}
						else if ( (LA71_0=='R') ) {s = 17;}
						else if ( (LA71_0=='S') ) {s = 18;}
						else if ( (LA71_0=='T') ) {s = 19;}
						else if ( (LA71_0=='V') ) {s = 20;}
						else if ( (LA71_0=='W') ) {s = 21;}
						else if ( (LA71_0=='X') ) {s = 22;}
						else if ( (LA71_0=='Y') ) {s = 23;}
						else if ( (LA71_0=='U') ) {s = 24;}
						else if ( (LA71_0=='i') ) {s = 25;}
						else if ( ((LA71_0 >= '0' && LA71_0 <= '9')) ) {s = 26;}
						else if ( ((LA71_0 >= '\t' && LA71_0 <= '\n')||LA71_0=='\r'||LA71_0==' ') ) {s = 27;}
						else if ( (LA71_0=='(') ) {s = 28;}
						else if ( (LA71_0=='m') ) {s = 29;}
						else if ( (LA71_0=='.') ) {s = 30;}
						else if ( (LA71_0=='Q'||LA71_0=='Z') ) {s = 31;}
						else if ( ((LA71_0 >= '&' && LA71_0 <= '\'')||(LA71_0 >= ',' && LA71_0 <= '-')||(LA71_0 >= ':' && LA71_0 <= ';')||LA71_0=='_'||(LA71_0 >= 'a' && LA71_0 <= 'h')||(LA71_0 >= 'j' && LA71_0 <= 'l')||(LA71_0 >= 'n' && LA71_0 <= 'z')||LA71_0=='\u2019') ) {s = 32;}
						else if ( ((LA71_0 >= '\u0000' && LA71_0 <= '\b')||(LA71_0 >= '\u000B' && LA71_0 <= '\f')||(LA71_0 >= '\u000E' && LA71_0 <= '\u001F')||(LA71_0 >= '!' && LA71_0 <= '%')||(LA71_0 >= ')' && LA71_0 <= '+')||LA71_0=='/'||(LA71_0 >= '<' && LA71_0 <= '@')||(LA71_0 >= '[' && LA71_0 <= '^')||LA71_0=='`'||(LA71_0 >= '{' && LA71_0 <= '\u2018')||(LA71_0 >= '\u201A' && LA71_0 <= '\uFFFF')) ) {s = 33;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 71, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
