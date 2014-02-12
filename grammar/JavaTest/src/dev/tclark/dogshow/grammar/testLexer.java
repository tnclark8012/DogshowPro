// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2014-02-11 22:32:53

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
	public static final int BREED_CLASSIFIER=4;
	public static final int BREED_COUNT=5;
	public static final int BREED_MISC=6;
	public static final int BREED_NAME=7;
	public static final int BREED_NAME_SUFFIX=8;
	public static final int CLUB_INDICATOR=9;
	public static final int COMMENT=10;
	public static final int DATE=11;
	public static final int ELLIPSIS=12;
	public static final int END_PUNCTUATION=13;
	public static final int END_WORD=14;
	public static final int FOLLOWING_TIME=15;
	public static final int FRAG_BEST_IN_SHOW=16;
	public static final int FRAG_BREED_ATTRIBUTE=17;
	public static final int FRAG_BREED_NAME_ALT=18;
	public static final int FRAG_BREED_NAME_CATEGORY=19;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=20;
	public static final int FRAG_BREED_NAME_SINGLE=21;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=22;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP=23;
	public static final int FRAG_MONTH=24;
	public static final int FRAG_PROPER_NAME=25;
	public static final int FRAG_RALLY_CLASS_NAME=26;
	public static final int FRAG_RALLY_CLASS_SECTION=27;
	public static final int FRAG_RALLY_ENTRANT_GROUP=28;
	public static final int FRAG_RALLY_SINGLE_ENTRANT=29;
	public static final int FRAG_RING=30;
	public static final int FRAG_SEX=31;
	public static final int FRAG_SPECIAL_GROUP_NAME=32;
	public static final int FRAG_SPEC_CHAR=33;
	public static final int FRAG_SPEC_WORD_CHAR=34;
	public static final int FRAG_TIME_LABEL=35;
	public static final int FRAG_TITLE=36;
	public static final int FRAG_TO_FOLLOW=37;
	public static final int FRAG_WEEK_DAY=38;
	public static final int FallThrough=39;
	public static final int GROUP=40;
	public static final int GROUP_ENDING_ANNOUNCEMENT=41;
	public static final int GROUP_NAME=42;
	public static final int GROUP_RING=43;
	public static final int HYPHEN=44;
	public static final int INT=45;
	public static final int JUDGE_NAME=46;
	public static final int JUNIOR_CLASS=47;
	public static final int NON_CONFORMATION_CLASS_LEVEL=48;
	public static final int NON_CONFORMATION_CLASS_NAME=49;
	public static final int NON_CONFORMATION_CLASS_SECTION=50;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=51;
	public static final int NON_CONFORMATION_SECOND_LINE=52;
	public static final int NON_CONF_SECOND_LINE_COMMENT=53;
	public static final int PARENTHETICAL=54;
	public static final int PARENTHETICAL_INT=55;
	public static final int PARENTHETICAL_NAME=56;
	public static final int PHONE_NUMBER=57;
	public static final int RALLY_CLASS=58;
	public static final int RALLY_ENTRY=59;
	public static final int RALLY_ENTRY_TITLE=60;
	public static final int RING=61;
	public static final int SPECIAL_SUFFIX=62;
	public static final int STANDALONE_COMMENT=63;
	public static final int TIME=64;
	public static final int WORD=65;
	public static final int WS=66;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g"; }

	// $ANTLR start "JUNIOR_CLASS"
	public final void mJUNIOR_CLASS() throws RecognitionException {
		try {
			int _type = JUNIOR_CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:538:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:538:9: 'Master Class'
					{
					match("Master Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:539:9: 'Open Senior'
					{
					match("Open Senior"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:540:9: 'Open Intermediate'
					{
					match("Open Intermediate"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:541:9: 'Open Junior'
					{
					match("Open Junior"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:542:9: 'Novice Senior'
					{
					match("Novice Senior"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:543:9: 'Novice Junior'
					{
					match("Novice Junior"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:544:9: 'Novice Intermediate'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:5: ( ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Grand Basset Griffon Vendéen' | 'Grand Bassets Griffons Vendeen' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retriever' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Grand Basset Griffon Vendéen' | 'Grand Bassets Griffons Vendeen' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retriever' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Grand Basset Griffon Vendéen' | 'Grand Bassets Griffons Vendeen' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retriever' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=200;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:28: 'Affenpinscher'
					{
					match("Affenpinscher"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:538:5: 'Afghan Hound'
					{
					match("Afghan Hound"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:539:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:540:5: 'Akita'
					{
					match("Akita"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:541:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:542:5: 'American English Coonhound'
					{
					match("American English Coonhound"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:543:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:544:5: 'American Foxhound'
					{
					match("American Foxhound"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:545:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:547:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:548:2: 'Appenzeller Sennenhunde'
					{
					match("Appenzeller Sennenhunde"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:549:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:550:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:551:5: 'Australian Terrier'
					{
					match("Australian Terrier"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:552:5: 'Basenji'
					{
					match("Basenji"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:553:5: 'Basset Hound'
					{
					match("Basset Hound"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:554:5: 'Beagle'
					{
					match("Beagle"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:555:5: 'Bearded Collie'
					{
					match("Bearded Collie"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:556:5: 'Beauceron'
					{
					match("Beauceron"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:557:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:558:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:559:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:560:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:561:5: 'Berger Picard'
					{
					match("Berger Picard"); if (state.failed) return ;

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:562:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:5: 'Bichon Frise'
					{
					match("Bichon Frise"); if (state.failed) return ;

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:564:5: 'Bichons Frise'
					{
					match("Bichons Frise"); if (state.failed) return ;

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:565:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); if (state.failed) return ;

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); if (state.failed) return ;

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:567:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); if (state.failed) return ;

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:568:5: 'Bloodhound'
					{
					match("Bloodhound"); if (state.failed) return ;

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); if (state.failed) return ;

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:570:5: 'Border Collie'
					{
					match("Border Collie"); if (state.failed) return ;

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:571:5: 'Border Terrier'
					{
					match("Border Terrier"); if (state.failed) return ;

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:572:5: 'Borzoi'
					{
					match("Borzoi"); if (state.failed) return ;

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:573:5: 'Boston Terrier'
					{
					match("Boston Terrier"); if (state.failed) return ;

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:574:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); if (state.failed) return ;

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); if (state.failed) return ;

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:576:5: 'Boxer'
					{
					match("Boxer"); if (state.failed) return ;

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:577:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); if (state.failed) return ;

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:578:5: 'Briard'
					{
					match("Briard"); if (state.failed) return ;

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:579:5: 'Brittany'
					{
					match("Brittany"); if (state.failed) return ;

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:580:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); if (state.failed) return ;

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:581:5: 'Bull Terrier'
					{
					match("Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:5: 'Bulldog'
					{
					match("Bulldog"); if (state.failed) return ;

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:583:5: 'Bullmastiff'
					{
					match("Bullmastiff"); if (state.failed) return ;

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:584:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); if (state.failed) return ;

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:5: 'Canaan Dog'
					{
					match("Canaan Dog"); if (state.failed) return ;

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:586:5: 'Cane Corso'
					{
					match("Cane Corso"); if (state.failed) return ;

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:587:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); if (state.failed) return ;

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:588:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); if (state.failed) return ;

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); if (state.failed) return ;

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:590:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); if (state.failed) return ;

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:591:5: 'Chihuahua'
					{
					match("Chihuahua"); if (state.failed) return ;

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:592:5: 'Chinese Crested'
					{
					match("Chinese Crested"); if (state.failed) return ;

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); if (state.failed) return ;

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:594:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); if (state.failed) return ;

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:595:5: 'Chow Chow'
					{
					match("Chow Chow"); if (state.failed) return ;

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); if (state.failed) return ;

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:597:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); if (state.failed) return ;

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:598:5: 'Collie'
					{
					match("Collie"); if (state.failed) return ;

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:599:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); if (state.failed) return ;

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:5: 'Dachshund'
					{
					match("Dachshund"); if (state.failed) return ;

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:5: 'Dalmatian'
					{
					match("Dalmatian"); if (state.failed) return ;

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:602:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); if (state.failed) return ;

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); if (state.failed) return ;

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:5: 'Dogo Argentine'
					{
					match("Dogo Argentine"); if (state.failed) return ;

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); if (state.failed) return ;

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); if (state.failed) return ;

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); if (state.failed) return ;

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:5: 'English Foxhound'
					{
					match("English Foxhound"); if (state.failed) return ;

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:609:5: 'English Setter'
					{
					match("English Setter"); if (state.failed) return ;

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); if (state.failed) return ;

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); if (state.failed) return ;

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:613:5: 'Field Spaniel'
					{
					match("Field Spaniel"); if (state.failed) return ;

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:614:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); if (state.failed) return ;

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); if (state.failed) return ;

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:616:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); if (state.failed) return ;

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:617:5: 'Fox Terrier'
					{
					match("Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:5: 'French Bulldog'
					{
					match("French Bulldog"); if (state.failed) return ;

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:619:5: 'German Pinscher'
					{
					match("German Pinscher"); if (state.failed) return ;

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:620:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); if (state.failed) return ;

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:621:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); if (state.failed) return ;

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); if (state.failed) return ;

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:623:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); if (state.failed) return ;

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:624:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); if (state.failed) return ;

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:5: 'Golden Retriever'
					{
					match("Golden Retriever"); if (state.failed) return ;

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:626:5: 'Gordon Setter'
					{
					match("Gordon Setter"); if (state.failed) return ;

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:627:5: 'Grand Basset Griffon Vendéen'
					{
					match("Grand Basset Griffon Vendéen"); if (state.failed) return ;

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:5: 'Grand Bassets Griffons Vendeen'
					{
					match("Grand Bassets Griffons Vendeen"); if (state.failed) return ;

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:5: 'Great Dane'
					{
					match("Great Dane"); if (state.failed) return ;

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); if (state.failed) return ;

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:631:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:632:5: 'Greyhound'
					{
					match("Greyhound"); if (state.failed) return ;

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:5: 'Harrier'
					{
					match("Harrier"); if (state.failed) return ;

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:634:5: 'Havanese'
					{
					match("Havanese"); if (state.failed) return ;

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); if (state.failed) return ;

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); if (state.failed) return ;

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:637:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); if (state.failed) return ;

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:638:5: 'Irish Setter'
					{
					match("Irish Setter"); if (state.failed) return ;

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:639:5: 'Irish Terrier'
					{
					match("Irish Terrier"); if (state.failed) return ;

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:640:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); if (state.failed) return ;

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:641:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); if (state.failed) return ;

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:642:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); if (state.failed) return ;

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:643:5: 'Japanese Chin'
					{
					match("Japanese Chin"); if (state.failed) return ;

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:644:5: 'Keeshond'
					{
					match("Keeshond"); if (state.failed) return ;

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:645:5: 'Keeshonden'
					{
					match("Keeshonden"); if (state.failed) return ;

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:646:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); if (state.failed) return ;

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:647:5: 'Komondor'
					{
					match("Komondor"); if (state.failed) return ;

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:648:5: 'Kuvasz'
					{
					match("Kuvasz"); if (state.failed) return ;

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:5: 'Kuvaszok'
					{
					match("Kuvaszok"); if (state.failed) return ;

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:650:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); if (state.failed) return ;

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:651:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); if (state.failed) return ;

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:652:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); if (state.failed) return ;

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:653:5: 'Leonberger'
					{
					match("Leonberger"); if (state.failed) return ;

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); if (state.failed) return ;

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:5: 'Löwchen'
					{
					match("Löwchen"); if (state.failed) return ;

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:656:5: 'Lowchen'
					{
					match("Lowchen"); if (state.failed) return ;

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:5: 'Maltese'
					{
					match("Maltese"); if (state.failed) return ;

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:658:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); if (state.failed) return ;

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:5: 'Mastiff'
					{
					match("Mastiff"); if (state.failed) return ;

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); if (state.failed) return ;

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:661:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); if (state.failed) return ;

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); if (state.failed) return ;

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:664:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); if (state.failed) return ;

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:5: 'Newfoundland'
					{
					match("Newfoundland"); if (state.failed) return ;

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); if (state.failed) return ;

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:667:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); if (state.failed) return ;

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); if (state.failed) return ;

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); if (state.failed) return ;

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:670:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); if (state.failed) return ;

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:671:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); if (state.failed) return ;

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); if (state.failed) return ;

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:673:5: 'Otterhound'
					{
					match("Otterhound"); if (state.failed) return ;

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:5: 'Papillon'
					{
					match("Papillon"); if (state.failed) return ;

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); if (state.failed) return ;

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:676:5: 'Pekingese'
					{
					match("Pekingese"); if (state.failed) return ;

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); if (state.failed) return ;

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); if (state.failed) return ;

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); if (state.failed) return ;

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); if (state.failed) return ;

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:681:5: 'Plott'
					{
					match("Plott"); if (state.failed) return ;

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:682:5: 'Pointer'
					{
					match("Pointer"); if (state.failed) return ;

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); if (state.failed) return ;

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:684:5: 'Pomeranian'
					{
					match("Pomeranian"); if (state.failed) return ;

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:685:5: 'Poodle'
					{
					match("Poodle"); if (state.failed) return ;

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:686:5: 'Portuguese Podengo'
					{
					match("Portuguese Podengo"); if (state.failed) return ;

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:687:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); if (state.failed) return ;

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:688:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); if (state.failed) return ;

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:689:5: 'Pug'
					{
					match("Pug"); if (state.failed) return ;

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:690:5: 'Puli'
					{
					match("Puli"); if (state.failed) return ;

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:691:5: 'Pulik'
					{
					match("Pulik"); if (state.failed) return ;

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:692:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); if (state.failed) return ;

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:693:5: 'Rat Terrier'
					{
					match("Rat Terrier"); if (state.failed) return ;

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:694:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); if (state.failed) return ;

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:695:5: 'Retriever'
					{
					match("Retriever"); if (state.failed) return ;

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:696:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); if (state.failed) return ;

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:697:5: 'Rottweiler'
					{
					match("Rottweiler"); if (state.failed) return ;

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:698:5: 'Russell Terrier'
					{
					match("Russell Terrier"); if (state.failed) return ;

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:699:5: 'Saint Bernard'
					{
					match("Saint Bernard"); if (state.failed) return ;

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:700:5: 'Saluki'
					{
					match("Saluki"); if (state.failed) return ;

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:701:5: 'Samoyed'
					{
					match("Samoyed"); if (state.failed) return ;

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:702:5: 'Schipperke'
					{
					match("Schipperke"); if (state.failed) return ;

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:703:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); if (state.failed) return ;

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:704:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); if (state.failed) return ;

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:705:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); if (state.failed) return ;

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:706:5: 'Setters'
					{
					match("Setters"); if (state.failed) return ;

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:707:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); if (state.failed) return ;

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:708:5: 'Shiba Inu'
					{
					match("Shiba Inu"); if (state.failed) return ;

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:709:5: 'Shih Tzu'
					{
					match("Shih Tzu"); if (state.failed) return ;

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:710:5: 'Siberian Husky'
					{
					match("Siberian Husky"); if (state.failed) return ;

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:711:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); if (state.failed) return ;

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:712:5: 'Silky Terrier'
					{
					match("Silky Terrier"); if (state.failed) return ;

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:713:5: 'Skye Terrier'
					{
					match("Skye Terrier"); if (state.failed) return ;

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:714:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); if (state.failed) return ;

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:715:5: 'Spaniels'
					{
					match("Spaniels"); if (state.failed) return ;

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:716:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); if (state.failed) return ;

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:717:5: 'Spinoni Italiani'
					{
					match("Spinoni Italiani"); if (state.failed) return ;

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:718:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); if (state.failed) return ;

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:720:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); if (state.failed) return ;

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:721:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); if (state.failed) return ;

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:722:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); if (state.failed) return ;

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:723:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); if (state.failed) return ;

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:724:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); if (state.failed) return ;

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:725:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:726:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); if (state.failed) return ;

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:727:5: 'Vizsla'
					{
					match("Vizsla"); if (state.failed) return ;

					}
					break;
				case 191 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:728:5: 'Weimaraner'
					{
					match("Weimaraner"); if (state.failed) return ;

					}
					break;
				case 192 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:729:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); if (state.failed) return ;

					}
					break;
				case 193 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:730:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); if (state.failed) return ;

					}
					break;
				case 194 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:731:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); if (state.failed) return ;

					}
					break;
				case 195 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:732:5: 'Whippet'
					{
					match("Whippet"); if (state.failed) return ;

					}
					break;
				case 196 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:733:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 197 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); if (state.failed) return ;

					}
					break;
				case 198 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:735:2: 'Wirehaired Vizsla'
					{
					match("Wirehaired Vizsla"); if (state.failed) return ;

					}
					break;
				case 199 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:736:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); if (state.failed) return ;

					}
					break;
				case 200 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:737:5: 'Yorkshire Terrier'
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

	// $ANTLR start "BREED_CLASSIFIER"
	public final void mBREED_CLASSIFIER() throws RecognitionException {
		try {
			int _type = BREED_CLASSIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:740:2: ( ( FRAG_BREED_NAME_ALT ( 's' )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:740:4: ( FRAG_BREED_NAME_ALT ( 's' )? )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:740:4: ( FRAG_BREED_NAME_ALT ( 's' )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:740:5: FRAG_BREED_NAME_ALT ( 's' )?
			{
			mFRAG_BREED_NAME_ALT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:740:25: ( 's' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='s') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:740:25: 's'
					{
					match('s'); if (state.failed) return ;
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
	// $ANTLR end "BREED_CLASSIFIER"

	// $ANTLR start "BREED_NAME"
	public final void mBREED_NAME() throws RecognitionException {
		try {
			int _type = BREED_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:5: ( ( FRAG_BREED_NAME_SINGLE ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:7: ( FRAG_BREED_NAME_SINGLE ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:7: ( FRAG_BREED_NAME_SINGLE )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:8: FRAG_BREED_NAME_SINGLE
			{
			mFRAG_BREED_NAME_SINGLE(); if (state.failed) return ;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:32: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:32: 's'
					{
					match('s'); if (state.failed) return ;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:37: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:37: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:41: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:42: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); if (state.failed) return ;
					mFRAG_BREED_NAME_CATEGORY(); if (state.failed) return ;

					match(')'); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:75: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:75: WS
							{
							mWS(); if (state.failed) return ;

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:79: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:79: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:115: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='('||LA9_0=='M') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:115: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:746:4: ( FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:746:8: FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP
			{
			mFRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP(); if (state.failed) return ;

			if ( state.backtracking==0 ) {allowJudge=true;}
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:749:5: ( ( '(' BREED_MISC ')' ) | BREED_MISC )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:749:9: ( '(' BREED_MISC ')' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:749:9: ( '(' BREED_MISC ')' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:749:10: '(' BREED_MISC ')'
					{
					match('('); if (state.failed) return ;
					mBREED_MISC(); if (state.failed) return ;

					match(')'); if (state.failed) return ;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:749:28: BREED_MISC
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:751:2: ( ( FRAG_BREED_ATTRIBUTE WS )* FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:751:4: ( FRAG_BREED_ATTRIBUTE WS )* FRAG_BREED_NAME_SPECIAL_SUFFIX
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:751:4: ( FRAG_BREED_ATTRIBUTE WS )*
			loop11:
			do {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='S') ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1=='p'||LA11_1=='t') ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= 'B' && LA11_0 <= 'C')||LA11_0=='H'||(LA11_0 >= 'V' && LA11_0 <= 'W')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:751:5: FRAG_BREED_ATTRIBUTE WS
					{
					mFRAG_BREED_ATTRIBUTE(); if (state.failed) return ;

					mWS(); if (state.failed) return ;

					}
					break;

				default :
					break loop11;
				}
			} while (true);

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:754:2: ( 'Misc. Dog' | 'Misc. Dogs' | 'Misc. Bitch' | 'Misc. Bitches' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:754:2: 'Misc. Dog'
					{
					match("Misc. Dog"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:754:14: 'Misc. Dogs'
					{
					match("Misc. Dogs"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:754:27: 'Misc. Bitch'
					{
					match("Misc. Bitch"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:754:41: 'Misc. Bitches'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:756:2: ( 'Dog' | 'Bitche' | 'Bitch' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:756:4: 'Dog'
					{
					match("Dog"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:756:10: 'Bitche'
					{
					match("Bitche"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:756:19: 'Bitch'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:2: ( 'Working' | 'Stud' | 'Brood' | 'Brace' | 'Champion' | 'Cut-Down' | 'Hunting Retriever' | 'Special Attraction' | 'Veteran' ( 's' )? )
			int alt15=9;
			switch ( input.LA(1) ) {
			case 'W':
				{
				alt15=1;
				}
				break;
			case 'S':
				{
				int LA15_2 = input.LA(2);
				if ( (LA15_2=='t') ) {
					alt15=2;
				}
				else if ( (LA15_2=='p') ) {
					alt15=8;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'B':
				{
				int LA15_3 = input.LA(2);
				if ( (LA15_3=='r') ) {
					int LA15_9 = input.LA(3);
					if ( (LA15_9=='o') ) {
						alt15=3;
					}
					else if ( (LA15_9=='a') ) {
						alt15=4;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 15, 9, input);
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
							new NoViableAltException("", 15, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'C':
				{
				int LA15_4 = input.LA(2);
				if ( (LA15_4=='h') ) {
					alt15=5;
				}
				else if ( (LA15_4=='u') ) {
					alt15=6;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'H':
				{
				alt15=7;
				}
				break;
			case 'V':
				{
				alt15=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:4: 'Working'
					{
					match("Working"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:14: 'Stud'
					{
					match("Stud"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:21: 'Brood'
					{
					match("Brood"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:29: 'Brace'
					{
					match("Brace"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:37: 'Champion'
					{
					match("Champion"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:48: 'Cut-Down'
					{
					match("Cut-Down"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:59: 'Hunting Retriever'
					{
					match("Hunting Retriever"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:79: 'Special Attraction'
					{
					match("Special Attraction"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:100: 'Veteran' ( 's' )?
					{
					match("Veteran"); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:109: ( 's' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='s') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:109: 's'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:760:5: ( 'Sweepstakes' WS ( 'e' | 'E' ) ( 'ntry' | 'ntries' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:760:9: 'Sweepstakes' WS ( 'e' | 'E' ) ( 'ntry' | 'ntries' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:760:36: ( 'ntry' | 'ntries' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:760:37: 'ntry'
					{
					match("ntry"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:760:44: 'ntries'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:761:29: ( ( FRAG_BREED_ATTRIBUTE WS )+ ( FRAG_SEX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:761:33: ( FRAG_BREED_ATTRIBUTE WS )+ ( FRAG_SEX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:761:33: ( FRAG_BREED_ATTRIBUTE WS )+
			int cnt17=0;
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='B') ) {
					int LA17_2 = input.LA(2);
					if ( (LA17_2=='r') ) {
						alt17=1;
					}

				}
				else if ( (LA17_0=='C'||LA17_0=='H'||LA17_0=='S'||(LA17_0 >= 'V' && LA17_0 <= 'W')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:761:34: FRAG_BREED_ATTRIBUTE WS
					{
					mFRAG_BREED_ATTRIBUTE(); if (state.failed) return ;

					mWS(); if (state.failed) return ;

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(17, input);
						throw eee;
				}
				cnt17++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:761:60: ( FRAG_SEX )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='B'||LA18_0=='D') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:761:60: FRAG_SEX
					{
					mFRAG_SEX(); if (state.failed) return ;

					}
					break;

			}

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:763:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
			int alt19=3;
			switch ( input.LA(1) ) {
			case 'A':
				{
				alt19=1;
				}
				break;
			case 'P':
				{
				alt19=2;
				}
				break;
			case 'B':
				{
				alt19=3;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:763:9: 'Ascob'
					{
					match("Ascob"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:763:17: 'Parti-Color'
					{
					match("Parti-Color"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:763:31: 'Black'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:765:5: ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt20=38;
			alt20 = dfa20.predict(input);
			switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:766:9: '13 Inch'
					{
					match("13 Inch"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:767:9: '15 Inch'
					{
					match("15 Inch"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:768:9: 'American Water'
					{
					match("American Water"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:769:9: 'Boykin'
					{
					match("Boykin"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:770:9: 'B & P C'
					{
					match("B & P C"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:771:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:772:9: 'Clumber'
					{
					match("Clumber"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:773:9: 'Cocker'
					{
					match("Cocker"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:774:9: 'Colored'
					{
					match("Colored"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:775:9: 'Curly-Coated'
					{
					match("Curly-Coated"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:776:9: 'English'
					{
					match("English"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:777:9: 'English Cocker'
					{
					match("English Cocker"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:778:9: 'English Springer'
					{
					match("English Springer"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:779:9: 'Field'
					{
					match("Field"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:780:9: 'Flat-Coated'
					{
					match("Flat-Coated"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:781:9: 'German Shorthaired'
					{
					match("German Shorthaired"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:782:9: 'German Wirehaired'
					{
					match("German Wirehaired"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:783:9: 'Golden'
					{
					match("Golden"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:784:9: 'Gordon'
					{
					match("Gordon"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:9: 'Irish'
					{
					match("Irish"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:786:2: 'Irish Red And White'
					{
					match("Irish Red And White"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:787:9: 'Irish Water'
					{
					match("Irish Water"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:788:9: 'K C & R'
					{
					match("K C & R"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:789:9: 'Labrador'
					{
					match("Labrador"); if (state.failed) return ;

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:790:9: 'Long Coat'
					{
					match("Long Coat"); if (state.failed) return ;

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:791:9: 'Longhaired'
					{
					match("Longhaired"); if (state.failed) return ;

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:792:9: 'Miniature'
					{
					match("Miniature"); if (state.failed) return ;

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:793:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); if (state.failed) return ;

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:794:9: 'Rough'
					{
					match("Rough"); if (state.failed) return ;

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:795:9: 'Smooth'
					{
					match("Smooth"); if (state.failed) return ;

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:796:9: 'Smooth Coat'
					{
					match("Smooth Coat"); if (state.failed) return ;

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:797:9: 'Standard'
					{
					match("Standard"); if (state.failed) return ;

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:798:9: 'Sussex'
					{
					match("Sussex"); if (state.failed) return ;

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:799:9: 'Toy'
					{
					match("Toy"); if (state.failed) return ;

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:800:9: 'Welsh Springer'
					{
					match("Welsh Springer"); if (state.failed) return ;

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:801:9: 'White'
					{
					match("White"); if (state.failed) return ;

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:802:9: 'Wire'
					{
					match("Wire"); if (state.failed) return ;

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:803:9: 'Wirehaired'
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

	// $ANTLR start "RING"
	public final void mRING() throws RecognitionException {
		try {
			int _type = RING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:810:6: ( 'RING' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:810:8: 'RING'
			{
			match("RING"); if (state.failed) return ;

			if ( state.backtracking==0 ) {allowJudge=true;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RING"

	// $ANTLR start "GROUP"
	public final void mGROUP() throws RecognitionException {
		try {
			int _type = GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:812:7: ( 'GROUP' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:812:9: 'GROUP'
			{
			match("GROUP"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP"

	// $ANTLR start "GROUP_NAME"
	public final void mGROUP_NAME() throws RecognitionException {
		try {
			int _type = GROUP_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:813:11: ( 'TOY' | 'HERDING' | 'TERRIER' | 'NON-SPORTING' | 'SPORTING' | 'HOUND' | 'WORKING' )
			int alt21=7;
			switch ( input.LA(1) ) {
			case 'T':
				{
				int LA21_1 = input.LA(2);
				if ( (LA21_1=='O') ) {
					alt21=1;
				}
				else if ( (LA21_1=='E') ) {
					alt21=3;
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
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2=='E') ) {
					alt21=2;
				}
				else if ( (LA21_2=='O') ) {
					alt21=6;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
			case 'N':
				{
				alt21=4;
				}
				break;
			case 'S':
				{
				alt21=5;
				}
				break;
			case 'W':
				{
				alt21=7;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:813:13: 'TOY'
					{
					match("TOY"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:813:19: 'HERDING'
					{
					match("HERDING"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:813:29: 'TERRIER'
					{
					match("TERRIER"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:813:39: 'NON-SPORTING'
					{
					match("NON-SPORTING"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:813:54: 'SPORTING'
					{
					match("SPORTING"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:813:65: 'HOUND'
					{
					match("HOUND"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:813:73: 'WORKING'
					{
					match("WORKING"); if (state.failed) return ;

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
	// $ANTLR end "GROUP_NAME"

	// $ANTLR start "FRAG_BEST_IN_SHOW"
	public final void mFRAG_BEST_IN_SHOW() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:815:2: ( 'BEST IN SHOW' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:815:4: 'BEST IN SHOW'
			{
			match("BEST IN SHOW"); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_BEST_IN_SHOW"

	// $ANTLR start "FRAG_SPECIAL_GROUP_NAME"
	public final void mFRAG_SPECIAL_GROUP_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:820:2: ( 'VETERAN SWEEPSTAKES GROUP' |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='V') ) {
				alt22=1;
			}
			else {
				alt22=2;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:821:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:824:24: 
					{
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:826:12: ( FRAG_SPECIAL_GROUP_NAME | FRAG_BEST_IN_SHOW )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='B') ) {
				alt23=2;
			}
			else {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:826:14: FRAG_SPECIAL_GROUP_NAME
					{
					mFRAG_SPECIAL_GROUP_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:826:38: FRAG_BEST_IN_SHOW
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:844:29: ( ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:2: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:2: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:3: NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			{
			mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:32: ( ' ' NON_CONFORMATION_CLASS_LEVEL )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==' ') ) {
					switch ( input.LA(2) ) {
					case 'A':
						{
						int LA24_3 = input.LA(3);
						if ( (LA24_3=='d') ) {
							alt24=1;
						}

						}
						break;
					case 'W':
						{
						int LA24_4 = input.LA(3);
						if ( (LA24_4=='a') ) {
							int LA24_7 = input.LA(4);
							if ( (LA24_7=='l') ) {
								int LA24_8 = input.LA(5);
								if ( (LA24_8=='k') ) {
									int LA24_9 = input.LA(6);
									if ( (LA24_9=='t') ) {
										int LA24_10 = input.LA(7);
										if ( (LA24_10=='h') ) {
											int LA24_11 = input.LA(8);
											if ( (LA24_11=='r') ) {
												int LA24_12 = input.LA(9);
												if ( (LA24_12=='o') ) {
													int LA24_13 = input.LA(10);
													if ( (LA24_13=='u') ) {
														int LA24_14 = input.LA(11);
														if ( (LA24_14=='g') ) {
															int LA24_15 = input.LA(12);
															if ( (LA24_15=='h') ) {
																alt24=1;
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
						else if ( (LA24_4=='i') ) {
							alt24=1;
						}

						}
						break;
					case 'B':
						{
						int LA24_5 = input.LA(3);
						if ( (LA24_5=='e') ) {
							alt24=1;
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
						alt24=1;
						}
						break;
					}
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:33: ' ' NON_CONFORMATION_CLASS_LEVEL
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

					}
					break;

				default :
					break loop24;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:67: ( ' ' NON_CONFORMATION_CLASS_SECTION )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==' ') ) {
				int LA25_1 = input.LA(2);
				if ( ((LA25_1 >= 'A' && LA25_1 <= 'B')) ) {
					alt25=1;
				}
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:68: ' ' NON_CONFORMATION_CLASS_SECTION
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_SECTION(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:104: ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==' ') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:105: ' ' NON_CONFORMATION_CLASS_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:864:2: ( ( 'A' | 'B' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:866:2: ( 'Class' | 'Walkthrough' )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='C') ) {
				alt27=1;
			}
			else if ( (LA27_0=='W') ) {
				alt27=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:866:4: 'Class'
					{
					match("Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:866:12: 'Walkthrough'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:868:2: ( 'Advanced' | 'Beginner' | 'Excellent' | 'Utility' | 'Pre' | 'Open' | 'Novice' | 'Wild Card' | ( 'Pair' ( 's' )? ) | 'Graduate' | 'Walkthrough' | 'Versatility' | 'Veterans' )
			int alt29=13;
			switch ( input.LA(1) ) {
			case 'A':
				{
				alt29=1;
				}
				break;
			case 'B':
				{
				alt29=2;
				}
				break;
			case 'E':
				{
				alt29=3;
				}
				break;
			case 'U':
				{
				alt29=4;
				}
				break;
			case 'P':
				{
				int LA29_5 = input.LA(2);
				if ( (LA29_5=='r') ) {
					alt29=5;
				}
				else if ( (LA29_5=='a') ) {
					alt29=9;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				alt29=6;
				}
				break;
			case 'N':
				{
				alt29=7;
				}
				break;
			case 'W':
				{
				int LA29_8 = input.LA(2);
				if ( (LA29_8=='i') ) {
					alt29=8;
				}
				else if ( (LA29_8=='a') ) {
					alt29=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'G':
				{
				alt29=10;
				}
				break;
			case 'V':
				{
				int LA29_10 = input.LA(2);
				if ( (LA29_10=='e') ) {
					int LA29_15 = input.LA(3);
					if ( (LA29_15=='r') ) {
						alt29=12;
					}
					else if ( (LA29_15=='t') ) {
						alt29=13;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 29, 15, input);
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
							new NoViableAltException("", 29, 10, input);
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
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:869:2: 'Advanced'
					{
					match("Advanced"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:870:2: 'Beginner'
					{
					match("Beginner"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:871:2: 'Excellent'
					{
					match("Excellent"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:872:2: 'Utility'
					{
					match("Utility"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:873:2: 'Pre'
					{
					match("Pre"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:874:2: 'Open'
					{
					match("Open"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:875:2: 'Novice'
					{
					match("Novice"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:876:2: 'Wild Card'
					{
					match("Wild Card"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:877:2: ( 'Pair' ( 's' )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:877:2: ( 'Pair' ( 's' )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:877:3: 'Pair' ( 's' )?
					{
					match("Pair"); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:877:9: ( 's' )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0=='s') ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:877:9: 's'
							{
							match('s'); if (state.failed) return ;
							}
							break;

					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:2: 'Graduate'
					{
					match("Graduate"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:879:2: 'Walkthrough'
					{
					match("Walkthrough"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:880:2: 'Versatility'
					{
					match("Versatility"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:881:3: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:885:2: ( FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:886:3: FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			{
			mFRAG_TO_FOLLOW(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:886:21: ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( ((LA30_0 >= 'A' && LA30_0 <= 'B')||LA30_0=='E'||LA30_0=='G'||(LA30_0 >= 'N' && LA30_0 <= 'P')||(LA30_0 >= 'U' && LA30_0 <= 'W')) ) {
				alt30=1;
			}
			else if ( (LA30_0=='R') ) {
				alt30=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:886:22: NON_CONFORMATION_CLASS_NAME
					{
					mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:886:50: RALLY_CLASS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:888:2: ( 'To follow' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:888:4: 'To follow'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:890:2: ( FRAG_RALLY_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:890:4: FRAG_RALLY_CLASS_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:892:2: ( 'Rally ' NON_CONFORMATION_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:892:4: 'Rally ' NON_CONFORMATION_CLASS_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:894:2: ( 'Walkthrough' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:894:4: 'Walkthrough'
			{
			match("Walkthrough"); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_RALLY_CLASS_SECTION"

	// $ANTLR start "RALLY_ENTRY_TITLE"
	public final void mRALLY_ENTRY_TITLE() throws RecognitionException {
		try {
			int _type = RALLY_ENTRY_TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:896:2: ( 'inch: ' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:896:4: 'inch: '
			{
			match("inch: "); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_ENTRY_TITLE"

	// $ANTLR start "RALLY_ENTRY"
	public final void mRALLY_ENTRY() throws RecognitionException {
		try {
			int _type = RALLY_ENTRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:898:2: ( ( FRAG_RALLY_ENTRANT_GROUP ) ( ';' FRAG_RALLY_ENTRANT_GROUP )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:898:4: ( FRAG_RALLY_ENTRANT_GROUP ) ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:898:4: ( FRAG_RALLY_ENTRANT_GROUP )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:898:6: FRAG_RALLY_ENTRANT_GROUP
			{
			mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:898:33: ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			loop31:
			do {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==';') ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:898:34: ';' FRAG_RALLY_ENTRANT_GROUP
					{
					match(';'); if (state.failed) return ;
					mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

					}
					break;

				default :
					break loop31;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:29: ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) )
			int alt41=2;
			alt41 = dfa41.predict(input);
			switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:31: ( '0' .. '9' )+ '-' ( '0' .. '9' )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:31: ( '0' .. '9' )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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

					match('-'); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:43: ( '0' .. '9' )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:55: ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:55: ( '0' .. '9' )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:64: ( ( '-' ( '0' .. '9' )+ )? ( ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					int cnt40=0;
					loop40:
					do {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( ((LA40_0 >= ',' && LA40_0 <= '-')||LA40_0==';') ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:65: ( '-' ( '0' .. '9' )+ )? ( ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:65: ( '-' ( '0' .. '9' )+ )?
							int alt36=2;
							int LA36_0 = input.LA(1);
							if ( (LA36_0=='-') ) {
								alt36=1;
							}
							switch (alt36) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:66: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:69: ( '0' .. '9' )+
									int cnt35=0;
									loop35:
									do {
										int alt35=2;
										int LA35_0 = input.LA(1);
										if ( ((LA35_0 >= '0' && LA35_0 <= '9')) ) {
											alt35=1;
										}

										switch (alt35) {
										case 1 :
											// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
											if ( cnt35 >= 1 ) break loop35;
											if (state.backtracking>0) {state.failed=true; return ;}
												EarlyExitException eee =
													new EarlyExitException(35, input);
												throw eee;
										}
										cnt35++;
									} while (true);

									}
									break;

							}

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:80: ( ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:81: ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )?
							{
							if ( input.LA(1)==','||input.LA(1)==';' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:90: ( '0' .. '9' )+
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

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:99: ( '-' ( '0' .. '9' )+ )?
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0=='-') ) {
								int LA39_1 = input.LA(2);
								if ( ((LA39_1 >= '0' && LA39_1 <= '9')) ) {
									alt39=1;
								}
							}
							switch (alt39) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:100: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:906:103: ( '0' .. '9' )+
									int cnt38=0;
									loop38:
									do {
										int alt38=2;
										int LA38_0 = input.LA(1);
										if ( ((LA38_0 >= '0' && LA38_0 <= '9')) ) {
											alt38=1;
										}

										switch (alt38) {
										case 1 :
											// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
											if ( cnt38 >= 1 ) break loop38;
											if (state.backtracking>0) {state.failed=true; return ;}
												EarlyExitException eee =
													new EarlyExitException(38, input);
												throw eee;
										}
										cnt38++;
									} while (true);

									}
									break;

							}

							}

							}
							break;

						default :
							if ( cnt40 >= 1 ) break loop40;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(40, input);
								throw eee;
						}
						cnt40++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:909:2: ( 'R' ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:909:4: 'R' ( '0' .. '9' )+
			{
			match('R'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:909:7: ( '0' .. '9' )+
			int cnt42=0;
			loop42:
			do {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( ((LA42_0 >= '0' && LA42_0 <= '9')) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
					if ( cnt42 >= 1 ) break loop42;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(42, input);
						throw eee;
				}
				cnt42++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:910:34: ( FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:911:2: FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			{
			mFRAG_RALLY_SINGLE_ENTRANT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:911:28: ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			loop43:
			do {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( ((LA43_0 >= ',' && LA43_0 <= '-')) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:911:29: ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT
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
					break loop43;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:914:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt44=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt44=1;
					}
					break;
				case 'A':
					{
					alt44=2;
					}
					break;
				case 'u':
					{
					int LA44_11 = input.LA(3);
					if ( (LA44_11=='n') ) {
						alt44=11;
					}
					else if ( (LA44_11=='l') ) {
						alt44=13;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 44, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'U':
					{
					int LA44_12 = input.LA(3);
					if ( (LA44_12=='N') ) {
						alt44=12;
					}
					else if ( (LA44_12=='L') ) {
						alt44=14;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 44, 12, input);
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
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA44_2 = input.LA(2);
				if ( (LA44_2=='e') ) {
					alt44=3;
				}
				else if ( (LA44_2=='E') ) {
					alt44=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA44_3 = input.LA(2);
				if ( (LA44_3=='a') ) {
					int LA44_15 = input.LA(3);
					if ( (LA44_15=='r') ) {
						alt44=5;
					}
					else if ( (LA44_15=='y') ) {
						alt44=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 44, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA44_3=='A') ) {
					int LA44_16 = input.LA(3);
					if ( (LA44_16=='R') ) {
						alt44=6;
					}
					else if ( (LA44_16=='Y') ) {
						alt44=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 44, 16, input);
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
							new NoViableAltException("", 44, 3, input);
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
					alt44=7;
					}
					break;
				case 'P':
					{
					alt44=8;
					}
					break;
				case 'u':
					{
					alt44=15;
					}
					break;
				case 'U':
					{
					alt44=16;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA44_5 = input.LA(2);
				if ( (LA44_5=='e') ) {
					alt44=17;
				}
				else if ( (LA44_5=='E') ) {
					alt44=18;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				int LA44_6 = input.LA(2);
				if ( (LA44_6=='c') ) {
					alt44=19;
				}
				else if ( (LA44_6=='C') ) {
					alt44=20;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA44_7 = input.LA(2);
				if ( (LA44_7=='o') ) {
					alt44=21;
				}
				else if ( (LA44_7=='O') ) {
					alt44=22;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA44_8 = input.LA(2);
				if ( (LA44_8=='e') ) {
					alt44=23;
				}
				else if ( (LA44_8=='E') ) {
					alt44=24;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 8, input);
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
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:914:27: 'January'
					{
					match("January"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:914:37: 'JANUARY'
					{
					match("JANUARY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:915:14: 'February'
					{
					match("February"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:915:25: 'FEBRUARY'
					{
					match("FEBRUARY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:916:14: 'March'
					{
					match("March"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:916:22: 'MARCH'
					{
					match("MARCH"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:917:14: 'April'
					{
					match("April"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:917:22: 'APRIL'
					{
					match("APRIL"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:918:14: 'May'
					{
					match("May"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:918:20: 'MAY'
					{
					match("MAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:919:14: 'June'
					{
					match("June"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:919:21: 'JUNE'
					{
					match("JUNE"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:920:14: 'July'
					{
					match("July"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:920:21: 'JULY'
					{
					match("JULY"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:921:14: 'August'
					{
					match("August"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:921:23: 'AUGUST'
					{
					match("AUGUST"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:922:14: 'September'
					{
					match("September"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:922:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:923:14: 'October'
					{
					match("October"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:923:24: 'OCTOBER'
					{
					match("OCTOBER"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:924:14: 'November'
					{
					match("November"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:924:25: 'NOVEMBER'
					{
					match("NOVEMBER"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:925:14: 'December'
					{
					match("December"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:925:25: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:927:29: ( '!' | '?' | '.' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:928:25: ( 'RING' | 'Ring' )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0=='R') ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1=='I') ) {
					alt45=1;
				}
				else if ( (LA45_1=='i') ) {
					alt45=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:928:29: 'RING'
					{
					match("RING"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:928:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:929:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:932:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:932:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:935:5: ( 'am' | 'pm' )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='a') ) {
				alt46=1;
			}
			else if ( (LA46_0=='p') ) {
				alt46=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:935:9: 'am'
					{
					match("am"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:935:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:938:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
			int alt47=12;
			switch ( input.LA(1) ) {
			case 'M':
				{
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA47_4 = input.LA(3);
					if ( (LA47_4=='S') ) {
						alt47=3;
					}
					else {
						alt47=1;
					}
					}
					break;
				case 'r':
					{
					int LA47_5 = input.LA(3);
					if ( (LA47_5=='s') ) {
						alt47=4;
					}
					else {
						alt47=2;
					}
					}
					break;
				case 'S':
					{
					alt47=5;
					}
					break;
				case 's':
					{
					alt47=6;
					}
					break;
				case 'I':
					{
					alt47=7;
					}
					break;
				case 'i':
					{
					alt47=8;
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
			case 'D':
				{
				int LA47_2 = input.LA(2);
				if ( (LA47_2=='R') ) {
					alt47=9;
				}
				else if ( (LA47_2=='r') ) {
					alt47=10;
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
			case 'C':
				{
				int LA47_3 = input.LA(2);
				if ( (LA47_3=='O') ) {
					alt47=11;
				}
				else if ( (LA47_3=='o') ) {
					alt47=12;
				}
				else {
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
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:938:9: 'MR'
					{
					match("MR"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:938:14: 'Mr'
					{
					match("Mr"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:9: 'MRS'
					{
					match("MRS"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:15: 'Mrs'
					{
					match("Mrs"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:940:9: 'MS'
					{
					match("MS"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:940:14: 'Ms'
					{
					match("Ms"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:941:9: 'MISS'
					{
					match("MISS"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:941:16: 'Miss'
					{
					match("Miss"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:942:10: 'DR'
					{
					match("DR"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:942:15: 'Dr'
					{
					match("Dr"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:943:9: 'COL'
					{
					match("COL"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:943:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:946:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt48=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt48=1;
					}
					break;
				case 'U':
					{
					alt48=2;
					}
					break;
				case 'a':
					{
					alt48=13;
					}
					break;
				case 'A':
					{
					alt48=14;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA48_2 = input.LA(2);
				if ( (LA48_2=='o') ) {
					alt48=3;
				}
				else if ( (LA48_2=='O') ) {
					alt48=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 2, input);
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
					alt48=5;
					}
					break;
				case 'U':
					{
					alt48=6;
					}
					break;
				case 'h':
					{
					alt48=9;
					}
					break;
				case 'H':
					{
					alt48=10;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'W':
				{
				int LA48_4 = input.LA(2);
				if ( (LA48_4=='e') ) {
					alt48=7;
				}
				else if ( (LA48_4=='E') ) {
					alt48=8;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA48_5 = input.LA(2);
				if ( (LA48_5=='r') ) {
					alt48=11;
				}
				else if ( (LA48_5=='R') ) {
					alt48=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 5, input);
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
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:946:27: 'Sunday'
					{
					match("Sunday"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:946:36: 'SUNDAY'
					{
					match("SUNDAY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:9: 'Monday'
					{
					match("Monday"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:18: 'MONDAY'
					{
					match("MONDAY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:9: 'Tuesday'
					{
					match("Tuesday"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:19: 'TUESDAY'
					{
					match("TUESDAY"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:949:9: 'Wednesday'
					{
					match("Wednesday"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:949:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:950:9: 'Thursday'
					{
					match("Thursday"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:950:20: 'THURSDAY'
					{
					match("THURSDAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:951:9: 'Friday'
					{
					match("Friday"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:951:18: 'FRIDAY'
					{
					match("FRIDAY"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:952:9: 'Saturday'
					{
					match("Saturday"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:952:20: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:969:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0=='L') ) {
				alt49=1;
			}
			else if ( (LA49_0=='V') ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:969:9: 'LUNCH'
					{
					match("LUNCH"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:969:17: 'VARIETY GROUP JUDGING'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:966:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:966:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			mFRAG_PROPER_NAME(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+
			int cnt51=0;
			loop51:
			do {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==' ') ) {
					int LA51_1 = input.LA(2);
					if ( (LA51_1=='(') ) {
						int LA51_3 = input.LA(3);
						if ( ((LA51_3 >= 'A' && LA51_3 <= 'Z')) ) {
							alt51=1;
						}

					}
					else if ( ((LA51_1 >= 'A' && LA51_1 <= 'Z')) ) {
						alt51=1;
					}

				}

				switch (alt51) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0=='(') ) {
						alt50=1;
					}
					else if ( ((LA50_0 >= 'A' && LA50_0 <= 'Z')) ) {
						alt50=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:66: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:85: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

				default :
					if ( cnt51 >= 1 ) break loop51;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(51, input);
						throw eee;
				}
				cnt51++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:106: ( WS )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( ((LA52_0 >= '\t' && LA52_0 <= '\n')||LA52_0=='\r'||LA52_0==' ') ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:106: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:110: ( PARENTHETICAL_INT )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0=='(') ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:110: PARENTHETICAL_INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:970:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:970:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:970:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt54=0;
			loop54:
			do {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( ((LA54_0 >= '\t' && LA54_0 <= '\n')||LA54_0=='\r'||LA54_0==' ') ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
					if ( cnt54 >= 1 ) break loop54;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(54, input);
						throw eee;
				}
				cnt54++;
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

	// $ANTLR start "PHONE_NUMBER"
	public final void mPHONE_NUMBER() throws RecognitionException {
		try {
			int _type = PHONE_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:975:5: ( ( ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ) | '1-800-' ) ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:975:9: ( ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ) | '1-800-' ) ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:975:9: ( ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ) | '1-800-' )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0=='(') ) {
				alt55=1;
			}
			else if ( (LA55_0=='1') ) {
				alt55=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:975:10: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:975:10: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:975:11: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')'
					{
					match('('); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					matchRange('0','9'); if (state.failed) return ;
					match(')'); if (state.failed) return ;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:975:45: '1-800-'
					{
					match("1-800-"); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:976:6: ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( ((LA57_0 >= '\t' && LA57_0 <= '\n')||LA57_0=='\r'||LA57_0==' ') && (synpred1_test())) {
				alt57=1;
			}
			else if ( ((LA57_0 >= '0' && LA57_0 <= '9')) && (synpred1_test())) {
				alt57=1;
			}
			else {
				alt57=2;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:976:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:976:83: ( WS )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( ((LA56_0 >= '\t' && LA56_0 <= '\n')||LA56_0=='\r'||LA56_0==' ') ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:976:83: WS
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:977:8: ()=>
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:978:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:978:13: INT ':' INT WS FRAG_TIME_LABEL
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:980:2: ( 'minutes following Best in Show' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:980:4: 'minutes following Best in Show'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:982:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:982:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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

			if ( state.backtracking==0 ) {allowBreed=true;allowJudge=true;}
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:984:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:984:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:984:13: ( '.' )+
			int cnt58=0;
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0=='.') ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:984:13: '.'
					{
					match('.'); if (state.failed) return ;
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
	// $ANTLR end "ELLIPSIS"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:986:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:986:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:986:6: ( '0' .. '9' )+
			int cnt59=0;
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( ((LA59_0 >= '0' && LA59_0 <= '9')) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
					if ( cnt59 >= 1 ) break loop59;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(59, input);
						throw eee;
				}
				cnt59++;
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

	// $ANTLR start "PARENTHETICAL_INT"
	public final void mPARENTHETICAL_INT() throws RecognitionException {
		try {
			int _type = PARENTHETICAL_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:989:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:989:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:989:13: ( WS )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( ((LA60_0 >= '\t' && LA60_0 <= '\n')||LA60_0=='\r'||LA60_0==' ') ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:989:13: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			mINT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:989:21: ( WS )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( ((LA61_0 >= '\t' && LA61_0 <= '\n')||LA61_0=='\r'||LA61_0==' ') ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:989:21: WS
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

	// $ANTLR start "PARENTHETICAL"
	public final void mPARENTHETICAL() throws RecognitionException {
		try {
			int _type = PARENTHETICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:13: ( WORD | INT | FRAG_PROPER_NAME )
			int alt62=3;
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
				alt62=1;
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
				alt62=2;
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
				alt62=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:14: WORD
					{
					mWORD(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:19: INT
					{
					mINT(); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( ((LA64_0 >= '\t' && LA64_0 <= '\n')||LA64_0=='\r'||LA64_0==' ') ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:45: ( WORD | INT | FRAG_PROPER_NAME )
					int alt63=3;
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
						alt63=1;
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
						alt63=2;
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
						alt63=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 63, 0, input);
						throw nvae;
					}
					switch (alt63) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:46: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:991:55: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

				default :
					break loop64;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:992:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:992:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:992:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:992:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:992:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( ((LA65_0 >= '&' && LA65_0 <= '\'')||(LA65_0 >= ',' && LA65_0 <= '-')||(LA65_0 >= ':' && LA65_0 <= ';')||(LA65_0 >= 'A' && LA65_0 <= 'Z')||LA65_0=='_'||(LA65_0 >= 'a' && LA65_0 <= 'z')||LA65_0=='\u2019') ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
					break loop65;
				}
			} while (true);

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:992:94: ( END_PUNCTUATION )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0=='!'||LA66_0=='.'||LA66_0=='?') ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:995:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:995:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:995:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt67=0;
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( ((LA67_0 >= '&' && LA67_0 <= '\'')||(LA67_0 >= ',' && LA67_0 <= '-')||(LA67_0 >= ':' && LA67_0 <= ';')||LA67_0=='_'||(LA67_0 >= 'a' && LA67_0 <= 'z')||LA67_0=='\u2019') ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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
					if ( cnt67 >= 1 ) break loop67;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(67, input);
						throw eee;
				}
				cnt67++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:995:65: ( END_PUNCTUATION )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0=='!'||LA68_0=='.'||LA68_0=='?') ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
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

	// $ANTLR start "HYPHEN"
	public final void mHYPHEN() throws RecognitionException {
		try {
			int _type = HYPHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:996:8: ( '-' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:996:10: '-'
			{
			match('-'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HYPHEN"

	// $ANTLR start "CLUB_INDICATOR"
	public final void mCLUB_INDICATOR() throws RecognitionException {
		try {
			int _type = CLUB_INDICATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' )* ( ',' ) )? 'INC.' | 'CLUB' | 'ASSOCIATION' )
			int alt71=3;
			switch ( input.LA(1) ) {
			case ',':
			case 'B':
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
				alt71=1;
				}
				break;
			case 'C':
				{
				int LA71_2 = input.LA(2);
				if ( (LA71_2=='L') ) {
					int LA71_4 = input.LA(3);
					if ( (LA71_4=='U') ) {
						int LA71_6 = input.LA(4);
						if ( (LA71_6=='B') ) {
							int LA71_8 = input.LA(5);
							if ( (LA71_8==','||(LA71_8 >= 'A' && LA71_8 <= 'Z')||(LA71_8 >= 'a' && LA71_8 <= 'z')) ) {
								alt71=1;
							}
							else {
								alt71=2;
							}
						}
						else if ( (LA71_6==','||LA71_6=='A'||(LA71_6 >= 'C' && LA71_6 <= 'Z')||(LA71_6 >= 'a' && LA71_6 <= 'z')) ) {
							alt71=1;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 71, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA71_4==','||(LA71_4 >= 'A' && LA71_4 <= 'T')||(LA71_4 >= 'V' && LA71_4 <= 'Z')||(LA71_4 >= 'a' && LA71_4 <= 'z')) ) {
						alt71=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 71, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA71_2==','||(LA71_2 >= 'A' && LA71_2 <= 'K')||(LA71_2 >= 'M' && LA71_2 <= 'Z')||(LA71_2 >= 'a' && LA71_2 <= 'z')) ) {
					alt71=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'A':
				{
				int LA71_3 = input.LA(2);
				if ( (LA71_3=='S') ) {
					int LA71_5 = input.LA(3);
					if ( (LA71_5=='S') ) {
						int LA71_7 = input.LA(4);
						if ( (LA71_7=='O') ) {
							int LA71_9 = input.LA(5);
							if ( (LA71_9=='C') ) {
								int LA71_11 = input.LA(6);
								if ( (LA71_11=='I') ) {
									int LA71_12 = input.LA(7);
									if ( (LA71_12=='A') ) {
										int LA71_13 = input.LA(8);
										if ( (LA71_13=='T') ) {
											int LA71_14 = input.LA(9);
											if ( (LA71_14=='I') ) {
												int LA71_15 = input.LA(10);
												if ( (LA71_15=='O') ) {
													int LA71_16 = input.LA(11);
													if ( (LA71_16=='N') ) {
														int LA71_17 = input.LA(12);
														if ( (LA71_17==','||(LA71_17 >= 'A' && LA71_17 <= 'Z')||(LA71_17 >= 'a' && LA71_17 <= 'z')) ) {
															alt71=1;
														}
														else {
															alt71=3;
														}
													}
													else if ( (LA71_16==','||(LA71_16 >= 'A' && LA71_16 <= 'M')||(LA71_16 >= 'O' && LA71_16 <= 'Z')||(LA71_16 >= 'a' && LA71_16 <= 'z')) ) {
														alt71=1;
													}
													else {
														if (state.backtracking>0) {state.failed=true; return ;}
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++)
																input.consume();
															NoViableAltException nvae =
																new NoViableAltException("", 71, 16, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}
												}
												else if ( (LA71_15==','||(LA71_15 >= 'A' && LA71_15 <= 'N')||(LA71_15 >= 'P' && LA71_15 <= 'Z')||(LA71_15 >= 'a' && LA71_15 <= 'z')) ) {
													alt71=1;
												}
												else {
													if (state.backtracking>0) {state.failed=true; return ;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 71, 15, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}
											}
											else if ( (LA71_14==','||(LA71_14 >= 'A' && LA71_14 <= 'H')||(LA71_14 >= 'J' && LA71_14 <= 'Z')||(LA71_14 >= 'a' && LA71_14 <= 'z')) ) {
												alt71=1;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return ;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 71, 14, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else if ( (LA71_13==','||(LA71_13 >= 'A' && LA71_13 <= 'S')||(LA71_13 >= 'U' && LA71_13 <= 'Z')||(LA71_13 >= 'a' && LA71_13 <= 'z')) ) {
											alt71=1;
										}
										else {
											if (state.backtracking>0) {state.failed=true; return ;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 71, 13, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else if ( (LA71_12==','||(LA71_12 >= 'B' && LA71_12 <= 'Z')||(LA71_12 >= 'a' && LA71_12 <= 'z')) ) {
										alt71=1;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return ;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 71, 12, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}
								else if ( (LA71_11==','||(LA71_11 >= 'A' && LA71_11 <= 'H')||(LA71_11 >= 'J' && LA71_11 <= 'Z')||(LA71_11 >= 'a' && LA71_11 <= 'z')) ) {
									alt71=1;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 71, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA71_9==','||(LA71_9 >= 'A' && LA71_9 <= 'B')||(LA71_9 >= 'D' && LA71_9 <= 'Z')||(LA71_9 >= 'a' && LA71_9 <= 'z')) ) {
								alt71=1;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 71, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA71_7==','||(LA71_7 >= 'A' && LA71_7 <= 'N')||(LA71_7 >= 'P' && LA71_7 <= 'Z')||(LA71_7 >= 'a' && LA71_7 <= 'z')) ) {
							alt71=1;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 71, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA71_5==','||(LA71_5 >= 'A' && LA71_5 <= 'R')||(LA71_5 >= 'T' && LA71_5 <= 'Z')||(LA71_5 >= 'a' && LA71_5 <= 'z')) ) {
						alt71=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 71, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA71_3==','||(LA71_3 >= 'A' && LA71_3 <= 'R')||(LA71_3 >= 'T' && LA71_3 <= 'Z')||(LA71_3 >= 'a' && LA71_3 <= 'z')) ) {
					alt71=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 3, input);
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
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:4: ( ( 'A' .. 'Z' | 'a' .. 'z' )* ( ',' ) )? 'INC.'
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:4: ( ( 'A' .. 'Z' | 'a' .. 'z' )* ( ',' ) )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0=='I') ) {
						int LA70_1 = input.LA(2);
						if ( (LA70_1=='N') ) {
							int LA70_3 = input.LA(3);
							if ( (LA70_3=='C') ) {
								int LA70_4 = input.LA(4);
								if ( (LA70_4==','||(LA70_4 >= 'A' && LA70_4 <= 'Z')||(LA70_4 >= 'a' && LA70_4 <= 'z')) ) {
									alt70=1;
								}
							}
							else if ( (LA70_3==','||(LA70_3 >= 'A' && LA70_3 <= 'B')||(LA70_3 >= 'D' && LA70_3 <= 'Z')||(LA70_3 >= 'a' && LA70_3 <= 'z')) ) {
								alt70=1;
							}
						}
						else if ( (LA70_1==','||(LA70_1 >= 'A' && LA70_1 <= 'M')||(LA70_1 >= 'O' && LA70_1 <= 'Z')||(LA70_1 >= 'a' && LA70_1 <= 'z')) ) {
							alt70=1;
						}
					}
					else if ( (LA70_0==','||(LA70_0 >= 'A' && LA70_0 <= 'H')||(LA70_0 >= 'J' && LA70_0 <= 'Z')||(LA70_0 >= 'a' && LA70_0 <= 'z')) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:5: ( 'A' .. 'Z' | 'a' .. 'z' )* ( ',' )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:5: ( 'A' .. 'Z' | 'a' .. 'z' )*
							loop69:
							do {
								int alt69=2;
								int LA69_0 = input.LA(1);
								if ( ((LA69_0 >= 'A' && LA69_0 <= 'Z')||(LA69_0 >= 'a' && LA69_0 <= 'z')) ) {
									alt69=1;
								}

								switch (alt69) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
									{
									if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
									break loop69;
								}
							} while (true);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:25: ( ',' )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:26: ','
							{
							match(','); if (state.failed) return ;
							}

							}
							break;

					}

					match("INC."); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:39: 'CLUB'
					{
					match("CLUB"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:998:46: 'ASSOCIATION'
					{
					match("ASSOCIATION"); if (state.failed) return ;

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
	// $ANTLR end "CLUB_INDICATOR"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			int cnt73=0;
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( ((LA73_0 >= '&' && LA73_0 <= '(')||(LA73_0 >= ',' && LA73_0 <= '.')||(LA73_0 >= '0' && LA73_0 <= ';')||(LA73_0 >= 'A' && LA73_0 <= 'Z')||LA73_0=='_'||(LA73_0 >= 'a' && LA73_0 <= 'z')||LA73_0=='\u2019') ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					int alt72=5;
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
						alt72=1;
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
						alt72=2;
						}
						break;
					case '(':
						{
						alt72=3;
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
						alt72=4;
						}
						break;
					case '.':
						{
						alt72=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 72, 0, input);
						throw nvae;
					}
					switch (alt72) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:32: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:37: PARENTHETICAL
							{
							mPARENTHETICAL(); if (state.failed) return ;

							}
							break;
						case 4 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 5 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:999:55: ELLIPSIS
							{
							mELLIPSIS(); if (state.failed) return ;

							}
							break;

					}

					if ( state.backtracking==0 ) {/*allowBreed=false;*/ allowGroup=false;allowJudge=false;}
					}
					break;

				default :
					if ( cnt73 >= 1 ) break loop73;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(73, input);
						throw eee;
				}
				cnt73++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1002:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1002:4: WORD END_PUNCTUATION
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1003:26: ( 'Unless otherwise announced' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1003:27: 'Unless otherwise announced'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1004:28: ( '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ( WS FRAG_PROPER_NAME )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1004:30: '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ( WS FRAG_PROPER_NAME )* ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1004:34: ( FRAG_TITLE WS )?
			int alt74=2;
			alt74 = dfa74.predict(input);
			switch (alt74) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1004:35: FRAG_TITLE WS
					{
					mFRAG_TITLE(); if (state.failed) return ;

					mWS(); if (state.failed) return ;

					}
					break;

			}

			mFRAG_PROPER_NAME(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1004:68: ( WS FRAG_PROPER_NAME )*
			loop75:
			do {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( ((LA75_0 >= '\t' && LA75_0 <= '\n')||LA75_0=='\r'||LA75_0==' ') ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1004:69: WS FRAG_PROPER_NAME
					{
					mWS(); if (state.failed) return ;

					mFRAG_PROPER_NAME(); if (state.failed) return ;

					}
					break;

				default :
					break loop75;
				}
			} while (true);

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1009:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1009:6: .
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_CLASSIFIER | BREED_NAME | SPECIAL_SUFFIX | RING | GROUP | GROUP_NAME | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY_TITLE | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | PHONE_NUMBER | TIME | FOLLOWING_TIME | DATE | ELLIPSIS | INT | PARENTHETICAL_INT | PARENTHETICAL | HYPHEN | CLUB_INDICATOR | COMMENT | GROUP_ENDING_ANNOUNCEMENT | FallThrough )
		int alt76=31;
		alt76 = dfa76.predict(input);
		switch (alt76) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:10: JUNIOR_CLASS
				{
				mJUNIOR_CLASS(); if (state.failed) return ;

				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:23: BREED_CLASSIFIER
				{
				mBREED_CLASSIFIER(); if (state.failed) return ;

				}
				break;
			case 3 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:40: BREED_NAME
				{
				mBREED_NAME(); if (state.failed) return ;

				}
				break;
			case 4 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:51: SPECIAL_SUFFIX
				{
				mSPECIAL_SUFFIX(); if (state.failed) return ;

				}
				break;
			case 5 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:66: RING
				{
				mRING(); if (state.failed) return ;

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:71: GROUP
				{
				mGROUP(); if (state.failed) return ;

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:77: GROUP_NAME
				{
				mGROUP_NAME(); if (state.failed) return ;

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:88: GROUP_RING
				{
				mGROUP_RING(); if (state.failed) return ;

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:99: NON_CONFORMATION_CLASS_NAME
				{
				mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:127: NON_CONF_SECOND_LINE_COMMENT
				{
				mNON_CONF_SECOND_LINE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:156: RALLY_CLASS
				{
				mRALLY_CLASS(); if (state.failed) return ;

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:168: RALLY_ENTRY_TITLE
				{
				mRALLY_ENTRY_TITLE(); if (state.failed) return ;

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:186: RALLY_ENTRY
				{
				mRALLY_ENTRY(); if (state.failed) return ;

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:198: NON_CONFORMATION_SECOND_LINE
				{
				mNON_CONFORMATION_SECOND_LINE(); if (state.failed) return ;

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:227: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:246: BREED_COUNT
				{
				mBREED_COUNT(); if (state.failed) return ;

				}
				break;
			case 17 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:258: JUDGE_NAME
				{
				mJUDGE_NAME(); if (state.failed) return ;

				}
				break;
			case 18 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:269: WS
				{
				mWS(); if (state.failed) return ;

				}
				break;
			case 19 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:272: PHONE_NUMBER
				{
				mPHONE_NUMBER(); if (state.failed) return ;

				}
				break;
			case 20 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:285: TIME
				{
				mTIME(); if (state.failed) return ;

				}
				break;
			case 21 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:290: FOLLOWING_TIME
				{
				mFOLLOWING_TIME(); if (state.failed) return ;

				}
				break;
			case 22 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:305: DATE
				{
				mDATE(); if (state.failed) return ;

				}
				break;
			case 23 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:310: ELLIPSIS
				{
				mELLIPSIS(); if (state.failed) return ;

				}
				break;
			case 24 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:319: INT
				{
				mINT(); if (state.failed) return ;

				}
				break;
			case 25 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:323: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); if (state.failed) return ;

				}
				break;
			case 26 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:341: PARENTHETICAL
				{
				mPARENTHETICAL(); if (state.failed) return ;

				}
				break;
			case 27 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:355: HYPHEN
				{
				mHYPHEN(); if (state.failed) return ;

				}
				break;
			case 28 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:362: CLUB_INDICATOR
				{
				mCLUB_INDICATOR(); if (state.failed) return ;

				}
				break;
			case 29 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:377: COMMENT
				{
				mCOMMENT(); if (state.failed) return ;

				}
				break;
			case 30 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:385: GROUP_ENDING_ANNOUNCEMENT
				{
				mGROUP_ENDING_ANNOUNCEMENT(); if (state.failed) return ;

				}
				break;
			case 31 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:411: FallThrough
				{
				mFallThrough(); if (state.failed) return ;

				}
				break;

		}
	}

	// $ANTLR start synpred1_test
	public final void synpred1_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:976:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:976:9: ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:976:9: ( WS )?
		int alt77=2;
		int LA77_0 = input.LA(1);
		if ( ((LA77_0 >= '\t' && LA77_0 <= '\n')||LA77_0=='\r'||LA77_0==' ') ) {
			alt77=1;
		}
		switch (alt77) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:976:9: WS
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
	// $ANTLR end synpred1_test

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:977:8: ()
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:977:9: 
		{
		}

	}
	// $ANTLR end synpred2_test

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
	public final boolean synpred1_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_test_fragment(); // can never throw exception
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
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA41 dfa41 = new DFA41(this);
	protected DFA74 dfa74 = new DFA74(this);
	protected DFA76 dfa76 = new DFA76(this);
	static final String DFA2_eotS =
		"\u00ee\uffff\1\u0113\76\uffff\1\u0150\76\uffff\1\u0184\122\uffff\1\u01c1"+
		"\2\uffff";
	static final String DFA2_eofS =
		"\u01c2\uffff";
	static final String DFA2_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\3\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff\1\145\2\uffff"+
		"\2\163\1\141\1\143\1\141\1\162\1\151\1\154\1\151\1\uffff\1\145\2\uffff"+
		"\1\143\1\uffff\1\143\1\142\1\147\1\145\3\uffff\1\162\2\uffff\1\154\1\141"+
		"\1\162\2\uffff\1\151\1\uffff\1\145\1\uffff\1\166\1\142\4\uffff\1\154\1"+
		"\156\1\141\1\162\2\uffff\1\160\1\153\2\uffff\1\151\1\147\2\uffff\1\144"+
		"\3\uffff\1\151\1\150\1\141\1\145\1\142\2\uffff\2\141\2\uffff\1\142\2\uffff"+
		"\1\151\1\uffff\1\162\2\uffff\1\162\1\164\1\145\1\147\1\uffff\2\147\1\150"+
		"\1\143\2\uffff\1\144\1\uffff\1\166\2\uffff\1\141\1\uffff\1\154\1\uffff"+
		"\1\141\3\uffff\1\150\7\uffff\1\157\1\154\2\uffff\1\156\1\155\2\uffff\1"+
		"\156\1\141\2\uffff\2\163\1\uffff\1\141\6\uffff\1\151\2\uffff\1\146\5\uffff"+
		"\1\151\4\uffff\1\164\1\uffff\1\151\6\uffff\1\164\3\uffff\1\142\1\145\2"+
		"\uffff\1\156\1\146\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162\5\uffff"+
		"\1\151\2\uffff\1\157\1\153\1\145\1\uffff\1\151\2\uffff\1\40\3\uffff\1"+
		"\145\1\uffff\1\145\2\151\1\141\1\144\1\164\1\uffff\2\150\1\163\1\141\1"+
		"\uffff\1\145\1\164\1\165\1\153\1\164\2\uffff\1\162\1\157\2\uffff\1\164"+
		"\1\150\1\40\1\143\2\141\1\156\1\40\1\162\1\145\3\uffff\1\163\1\40\2\163"+
		"\1\156\3\40\1\157\1\172\1\164\1\147\1\uffff\1\40\1\147\2\uffff\2\151\1"+
		"\156\1\141\1\40\1\uffff\2\141\1\154\1\156\1\40\1\46\1\40\1\162\1\145\2"+
		"\uffff\2\150\1\40\1\102\1\104\1\uffff\1\122\1\156\1\157\1\165\1\151\2"+
		"\uffff\1\165\1\163\1\141\1\145\1\156\1\123\1\151\1\156\1\151\1\40\5\uffff"+
		"\1\103\4\40\1\120\1\141\5\uffff\1\141\1\144\2\uffff\1\162\1\141\1\145"+
		"\1\150\1\156\2\uffff\1\40\2\uffff\1\162\1\40\1\141\1\115\4\uffff\2\103"+
		"\1\114\1\uffff\1\150\1\uffff\1\163\2\uffff\2\145\1\156\1\163\2\40\1\115"+
		"\1\145\1\105\1\156\7\uffff\1\145\3\uffff\1\145\1\163\2\uffff\2\40\1\145"+
		"\1\104\1\110\3\uffff\1\144\1\156\2\uffff\1\40\4\uffff\1\145\1\101\1\102"+
		"\1\40\2\uffff\1\165\1\40\2\uffff\1\103\1\164\7\uffff\1\120\1\163\1\120"+
		"\3\uffff\1\40\1\157\1\uffff\1\153\4\uffff\1\144\1\151\1\145\2\uffff\1"+
		"\156\1\147\1\157\1\40\2\uffff";
	static final String DFA2_maxS =
		"\1\131\3\165\1\157\1\156\2\162\1\141\1\164\1\uffff\1\165\1\u00f6\1\151"+
		"\1\157\1\164\1\171\1\165\1\167\1\162\1\uffff\1\151\2\uffff\1\147\3\uffff"+
		"\1\145\2\uffff\2\163\1\162\1\143\1\165\1\171\1\165\1\154\1\166\1\uffff"+
		"\1\157\2\uffff\1\154\1\uffff\1\156\1\147\1\164\1\156\3\uffff\1\162\2\uffff"+
		"\1\162\1\145\1\166\2\uffff\1\151\1\uffff\1\162\1\uffff\1\166\1\153\4\uffff"+
		"\1\163\1\156\1\167\1\166\2\uffff\1\162\1\164\2\uffff\1\162\1\154\2\uffff"+
		"\1\164\3\uffff\1\155\1\157\1\164\1\151\1\154\2\uffff\1\151\1\141\2\uffff"+
		"\1\142\2\uffff\1\163\1\uffff\1\162\2\uffff\1\162\1\164\1\163\1\165\1\uffff"+
		"\1\147\1\156\1\150\1\143\2\uffff\1\172\1\uffff\1\166\2\uffff\1\164\1\uffff"+
		"\1\154\1\uffff\1\145\3\uffff\1\156\7\uffff\1\165\1\154\2\uffff\1\156\1"+
		"\155\2\uffff\1\156\1\171\2\uffff\2\163\1\uffff\1\141\6\uffff\1\151\2\uffff"+
		"\1\167\5\uffff\1\151\4\uffff\1\164\1\uffff\1\151\6\uffff\1\164\3\uffff"+
		"\1\150\1\145\2\uffff\2\156\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162"+
		"\5\uffff\1\151\2\uffff\1\157\1\153\1\145\1\uffff\1\151\2\uffff\1\155\3"+
		"\uffff\1\145\1\uffff\1\145\2\151\1\141\1\144\1\164\1\uffff\2\150\1\163"+
		"\1\141\1\uffff\1\151\1\164\1\165\1\153\1\164\2\uffff\1\162\1\157\2\uffff"+
		"\1\164\2\150\1\143\2\141\1\156\1\40\1\162\1\145\3\uffff\4\163\1\156\1"+
		"\40\1\145\1\40\1\157\1\172\1\164\1\147\1\uffff\1\163\1\147\2\uffff\2\151"+
		"\1\156\1\141\1\40\1\uffff\2\141\1\154\1\156\1\163\1\141\1\40\1\162\1\145"+
		"\2\uffff\2\150\1\40\1\102\1\120\1\uffff\1\127\1\156\1\157\1\165\1\151"+
		"\2\uffff\1\165\1\163\1\141\1\151\1\156\1\124\1\151\1\156\1\151\1\40\5"+
		"\uffff\1\124\1\163\3\40\1\127\1\141\5\uffff\1\157\1\144\2\uffff\1\162"+
		"\1\141\1\145\1\150\1\156\2\uffff\1\40\2\uffff\1\162\1\40\1\141\1\124\4"+
		"\uffff\1\123\1\124\1\123\1\uffff\1\150\1\uffff\1\163\2\uffff\2\145\1\156"+
		"\1\163\2\40\1\124\1\145\1\123\1\156\7\uffff\1\160\3\uffff\1\157\1\163"+
		"\2\uffff\2\40\1\145\1\124\1\110\3\uffff\1\144\1\163\2\uffff\1\40\4\uffff"+
		"\1\145\1\123\1\114\1\40\2\uffff\1\165\1\40\2\uffff\1\124\1\164\7\uffff"+
		"\1\127\1\163\1\126\3\uffff\1\163\1\157\1\uffff\1\153\4\uffff\1\144\1\171"+
		"\1\145\2\uffff\1\156\1\147\1\157\1\40\2\uffff";
	static final String DFA2_acceptS =
		"\12\uffff\1\152\11\uffff\1\u00be\1\uffff\1\u00c7\1\u00c8\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\12\1\13\11\uffff\1\64\1\uffff\1\71\1\73\1\uffff\1\76"+
		"\4\uffff\1\117\1\120\1\121\1\uffff\1\126\1\127\3\uffff\1\142\1\143\1\uffff"+
		"\1\151\1\uffff\1\156\2\uffff\1\164\1\165\1\166\1\167\4\uffff\1\u0087\1"+
		"\u0088\2\uffff\1\u008f\1\u0090\2\uffff\1\u009b\1\u009c\1\uffff\1\u009f"+
		"\1\u00a0\1\u00a1\5\uffff\1\u00b0\1\u00b1\2\uffff\1\u00b7\1\u00b8\1\uffff"+
		"\1\u00bc\1\u00bd\1\uffff\1\u00c3\1\uffff\1\1\1\2\4\uffff\1\24\4\uffff"+
		"\1\37\1\40\1\uffff\1\44\1\uffff\1\47\1\50\1\uffff\1\53\1\uffff\1\57\1"+
		"\uffff\1\62\1\63\1\65\1\uffff\1\72\1\74\1\75\1\77\1\100\1\101\1\102\2"+
		"\uffff\1\113\1\114\2\uffff\1\130\1\131\2\uffff\1\140\1\141\2\uffff\1\155"+
		"\1\uffff\1\161\1\162\1\163\1\170\1\171\1\172\1\uffff\1\177\1\u0080\1\uffff"+
		"\1\u0086\1\u0089\1\u008a\1\u008b\1\u008c\1\uffff\1\u0091\1\u0092\1\u0093"+
		"\1\u0094\1\uffff\1\u0098\1\uffff\1\u009d\1\u009e\1\u00a2\1\u00a3\1\u00a4"+
		"\1\u00a5\1\uffff\1\u00a8\1\u00a9\1\u00aa\2\uffff\1\u00af\1\u00b2\3\uffff"+
		"\1\u00bf\1\uffff\1\u00c2\3\uffff\1\17\1\20\1\21\1\22\1\23\1\uffff\1\30"+
		"\1\31\3\uffff\1\43\1\uffff\1\51\1\52\1\uffff\1\60\1\61\1\66\1\uffff\1"+
		"\103\6\uffff\1\137\4\uffff\1\u0081\5\uffff\1\u00ab\1\u00ac\2\uffff\1\u00b5"+
		"\1\u00b6\12\uffff\1\54\1\55\1\56\14\uffff\1\u0085\2\uffff\1\u009a\1\u0099"+
		"\5\uffff\1\u00c4\11\uffff\1\104\1\105\5\uffff\1\136\5\uffff\1\u008d\1"+
		"\u008e\12\uffff\1\32\1\33\1\34\1\35\1\36\7\uffff\1\134\1\135\1\144\1\145"+
		"\1\146\2\uffff\1\160\1\157\5\uffff\1\u00b3\1\u00b4\1\uffff\1\u00c0\1\u00c1"+
		"\4\uffff\1\41\1\42\1\45\1\46\3\uffff\1\122\1\uffff\1\125\1\uffff\1\147"+
		"\1\150\12\uffff\1\25\1\26\1\27\1\67\1\70\1\106\1\107\1\uffff\1\112\1\115"+
		"\1\116\2\uffff\1\154\1\153\5\uffff\1\u00b9\1\u00ba\1\u00bb\2\uffff\1\10"+
		"\1\11\1\uffff\1\110\1\111\1\123\1\124\4\uffff\1\u00a6\1\u00a7\2\uffff"+
		"\1\6\1\7\2\uffff\1\173\1\174\1\175\1\176\1\u0082\1\u0083\1\u0084\3\uffff"+
		"\1\14\1\15\1\16\2\uffff\1\u0097\1\uffff\1\u00c5\1\u00c6\1\132\1\133\3"+
		"\uffff\1\u00ad\1\u00ae\4\uffff\1\u0096\1\u0095";
	static final String DFA2_specialS =
		"\u01c2\uffff}>";
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
			"\1\174\13\uffff\1\175",
			"\1\176",
			"\1\177\4\uffff\1\u0080\3\uffff\1\u0081\3\uffff\1\u0082",
			"",
			"\1\u0083\3\uffff\1\u0084\5\uffff\1\u0085",
			"",
			"",
			"\1\u0086\10\uffff\1\u0087",
			"",
			"\1\u0088\10\uffff\1\u0089\1\uffff\1\u008a",
			"\1\u008b\4\uffff\1\u008c",
			"\1\u008d\14\uffff\1\u008e",
			"\1\u008f\10\uffff\1\u0090",
			"",
			"",
			"",
			"\1\u0091",
			"",
			"",
			"\1\u0092\5\uffff\1\u0093",
			"\1\u0094\3\uffff\1\u0095",
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
			"\1\u00e3",
			"\1\u00e4\27\uffff\1\u00e5",
			"",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"",
			"\1\u00e8",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e9",
			"",
			"",
			"\1\u00ea\20\uffff\1\u00eb",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ec",
			"",
			"",
			"",
			"",
			"\1\u00ed",
			"",
			"\1\u00ee",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ef",
			"",
			"",
			"",
			"\1\u00f0\5\uffff\1\u00f1",
			"\1\u00f2",
			"",
			"",
			"\1\u00f3",
			"\1\u00f4\7\uffff\1\u00f5",
			"\1\u00f6",
			"",
			"\1\u00f7",
			"",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"",
			"",
			"",
			"",
			"",
			"\1\u00fb",
			"",
			"",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"",
			"\1\u00ff",
			"",
			"",
			"\1\u0100\103\uffff\1\u0101\10\uffff\1\u0102",
			"",
			"",
			"",
			"\1\u0103",
			"",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"",
			"\1\u010e\3\uffff\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0114",
			"",
			"",
			"\1\u0115",
			"\1\u0116",
			"",
			"",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119\107\uffff\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"",
			"",
			"",
			"\1\u0122",
			"\1\u0123\122\uffff\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129\104\uffff\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"",
			"\1\u0130\122\uffff\1\u0131",
			"\1\u0132",
			"",
			"",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c\122\uffff\1\u013d",
			"\1\u013f\53\uffff\1\u0140\16\uffff\1\u013e",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"",
			"",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148\13\uffff\1\u0149",
			"",
			"\1\u014a\1\u014b\1\u014c\2\uffff\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0151",
			"\1\u0152",
			"",
			"",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156\3\uffff\1\u0157",
			"\1\u0158",
			"\1\u0159\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"",
			"",
			"",
			"",
			"",
			"\1\u015f\20\uffff\1\u0160",
			"\1\u0161\122\uffff\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166\2\uffff\1\u0167\3\uffff\1\u0168",
			"\1\u0169",
			"",
			"",
			"",
			"",
			"",
			"\1\u016a\15\uffff\1\u016b",
			"\1\u016c",
			"",
			"",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"",
			"",
			"\1\u0172",
			"",
			"",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176\5\uffff\1\u0177\1\u0178",
			"",
			"",
			"",
			"",
			"\1\u0179\17\uffff\1\u017a",
			"\1\u017b\2\uffff\1\u017c\14\uffff\1\u017d\1\u017e",
			"\1\u017f\6\uffff\1\u0180",
			"",
			"\1\u0181",
			"",
			"\1\u0182",
			"",
			"",
			"\1\u0183",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a\5\uffff\1\u018b\1\u018c",
			"\1\u018d",
			"\1\u018e\1\u018f\14\uffff\1\u0190",
			"\1\u0191",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0192\12\uffff\1\u0193",
			"",
			"",
			"",
			"\1\u0194\11\uffff\1\u0195",
			"\1\u0196",
			"",
			"",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a\17\uffff\1\u019b",
			"\1\u019c",
			"",
			"",
			"",
			"\1\u019d",
			"\1\u019e\4\uffff\1\u019f",
			"",
			"",
			"\1\u01a0",
			"",
			"",
			"",
			"",
			"\1\u01a1",
			"\1\u01a2\1\u01a3\15\uffff\1\u01a4\2\uffff\1\u01a5",
			"\1\u01a6\2\uffff\1\u01a7\6\uffff\1\u01a8",
			"\1\u01a9",
			"",
			"",
			"\1\u01aa",
			"\1\u01ab",
			"",
			"",
			"\1\u01ac\17\uffff\1\u01ad\1\u01ae",
			"\1\u01af",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01b0\6\uffff\1\u01b1",
			"\1\u01b2",
			"\1\u01b3\5\uffff\1\u01b4",
			"",
			"",
			"",
			"\1\u01b5\122\uffff\1\u01b6",
			"\1\u01b7",
			"",
			"\1\u01b8",
			"",
			"",
			"",
			"",
			"\1\u01b9",
			"\1\u01bb\17\uffff\1\u01ba",
			"\1\u01bc",
			"",
			"",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
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
			return "537:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Grand Basset Griffon Vendéen' | 'Grand Bassets Griffons Vendeen' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retriever' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
		}
	}

	static final String DFA20_eotS =
		"\66\uffff\1\76\2\uffff\1\102\11\uffff\1\111\1\113\13\uffff";
	static final String DFA20_eofS =
		"\120\uffff";
	static final String DFA20_minS =
		"\1\61\1\63\1\uffff\1\40\1\150\1\156\1\151\1\145\1\162\1\uffff\1\141\3"+
		"\uffff\1\155\1\uffff\1\145\6\uffff\1\143\1\uffff\1\147\2\uffff\1\162\1"+
		"\154\1\151\1\uffff\1\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff"+
		"\1\163\1\147\1\157\1\145\1\151\1\141\1\150\1\40\1\164\1\150\1\163\1\156"+
		"\1\40\2\uffff\1\150\2\uffff\1\150\1\40\1\122\1\uffff\2\40\1\123\4\uffff"+
		"\1\103\5\uffff";
	static final String DFA20_maxS =
		"\1\127\1\65\1\uffff\1\157\1\165\1\156\1\154\1\157\1\162\1\uffff\1\157"+
		"\3\uffff\1\165\1\uffff\1\151\6\uffff\1\154\1\uffff\1\147\2\uffff\2\162"+
		"\1\151\1\uffff\1\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1"+
		"\163\1\147\1\157\1\145\1\151\1\141\2\150\1\164\1\150\1\163\1\156\1\40"+
		"\2\uffff\1\150\2\uffff\1\150\1\40\1\127\1\uffff\2\40\1\127\4\uffff\1\123"+
		"\5\uffff";
	static final String DFA20_acceptS =
		"\2\uffff\1\3\6\uffff\1\27\1\uffff\1\33\1\34\1\35\1\uffff\1\42\1\uffff"+
		"\1\1\1\2\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\16\1\17\3\uffff\1\30\2"+
		"\uffff\1\40\1\41\1\43\1\44\1\uffff\1\10\1\11\2\uffff\1\22\1\23\15\uffff"+
		"\1\31\1\32\1\uffff\1\46\1\45\3\uffff\1\24\3\uffff\1\25\1\26\1\37\1\36"+
		"\1\uffff\1\13\1\20\1\21\1\14\1\15";
	static final String DFA20_specialS =
		"\120\uffff}>";
	static final String[] DFA20_transitionS = {
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
			return "764:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA41_eotS =
		"\4\uffff\1\5\1\uffff";
	static final String DFA41_eofS =
		"\6\uffff";
	static final String DFA41_minS =
		"\1\60\1\54\1\60\1\uffff\1\54\1\uffff";
	static final String DFA41_maxS =
		"\1\71\1\73\1\71\1\uffff\1\73\1\uffff";
	static final String DFA41_acceptS =
		"\3\uffff\1\2\1\uffff\1\1";
	static final String DFA41_specialS =
		"\6\uffff}>";
	static final String[] DFA41_transitionS = {
			"\12\1",
			"\1\3\1\2\2\uffff\12\1\1\uffff\1\3",
			"\12\4",
			"",
			"\1\3\3\uffff\12\4\1\uffff\1\3",
			""
	};

	static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
	static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
	static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
	static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
	static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
	static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
	static final short[][] DFA41_transition;

	static {
		int numStates = DFA41_transitionS.length;
		DFA41_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
		}
	}

	class DFA41 extends DFA {

		public DFA41(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 41;
			this.eot = DFA41_eot;
			this.eof = DFA41_eof;
			this.min = DFA41_min;
			this.max = DFA41_max;
			this.accept = DFA41_accept;
			this.special = DFA41_special;
			this.transition = DFA41_transition;
		}
		@Override
		public String getDescription() {
			return "906:1: NON_CONFORMATION_SECOND_LINE : ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ( ';' | ',' ) ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) );";
		}
	}

	static final String DFA74_eotS =
		"\31\uffff";
	static final String DFA74_eofS =
		"\31\uffff";
	static final String DFA74_minS =
		"\1\101\3\11\1\uffff\21\11\1\uffff\2\11";
	static final String DFA74_maxS =
		"\1\132\3\u2019\1\uffff\13\u2019\1\132\5\u2019\1\uffff\2\u2019";
	static final String DFA74_acceptS =
		"\4\uffff\1\2\21\uffff\1\1\2\uffff";
	static final String DFA74_specialS =
		"\31\uffff}>";
	static final String[] DFA74_transitionS = {
			"\2\4\1\3\1\2\10\4\1\1\15\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\10\4\1\11\10\4\1\5\1\7\7\4\4\uffff\1\4"+
			"\1\uffff\10\4\1\12\10\4\1\6\1\10\7\4\u1f9e\uffff\1\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\21\4\1\13\10\4\4\uffff\1\4\1\uffff\21"+
			"\4\1\14\10\4\u1f9e\uffff\1\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\16\4\1\15\13\4\4\uffff\1\4\1\uffff\16"+
			"\4\1\16\13\4\u1f9e\uffff\1\4",
			"",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\22\4\1\17\7\4\4\uffff\1\4\1\uffff"+
			"\32\4\u1f9e\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\22\4\1"+
			"\21\7\4\u1f9e\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\22\4\1\22\7\4\4\uffff\1\4\1\uffff\32\4"+
			"\u1f9e\uffff\1\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\22\4\1\23\7\4"+
			"\u1f9e\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\13\4\1\24\16\4\4\uffff\1\4\1\uffff\32"+
			"\4\u1f9e\uffff\1\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\13\4\1\25\16"+
			"\4\u1f9e\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\40\uffff\32\26",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\22\4\1\27\7\4\4\uffff\1\4\1\uffff\32\4"+
			"\u1f9e\uffff\1\4",
			"\2\4\2\uffff\1\4\22\uffff\2\4\4\uffff\2\4\1\uffff\1\4\2\uffff\3\4\13"+
			"\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\22\4\1\30\7\4"+
			"\u1f9e\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4",
			"\2\20\2\uffff\1\20\22\uffff\1\20\1\4\4\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\3\4\13\uffff\2\4\3\uffff\1\4\1\uffff\32\4\4\uffff\1\4\1\uffff\32\4\u1f9e"+
			"\uffff\1\4"
	};

	static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
	static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
	static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
	static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
	static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
	static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
	static final short[][] DFA74_transition;

	static {
		int numStates = DFA74_transitionS.length;
		DFA74_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
		}
	}

	class DFA74 extends DFA {

		public DFA74(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 74;
			this.eot = DFA74_eot;
			this.eof = DFA74_eof;
			this.min = DFA74_min;
			this.max = DFA74_max;
			this.accept = DFA74_accept;
			this.special = DFA74_special;
			this.transition = DFA74_transition;
		}
		@Override
		public String getDescription() {
			return "1004:34: ( FRAG_TITLE WS )?";
		}
	}

	static final String DFA76_eotS =
		"\1\30\27\62\1\uffff\2\62\1\u00b5\1\uffff\1\46\1\u00b5\1\62\1\u00be\1\u00c0"+
		"\3\62\2\uffff\13\62\1\uffff\134\62\1\uffff\20\62\1\u0176\22\62\1\u00b5"+
		"\1\62\1\uffff\1\62\5\uffff\2\62\1\uffff\1\u00be\1\uffff\7\62\1\uffff\u00a1"+
		"\62\1\u008f\2\62\1\u024c\10\62\1\uffff\4\62\1\uffff\1\62\1\u0258\12\62"+
		"\3\u0264\1\62\2\uffff\1\u00b9\2\uffff\1\u026c\2\uffff\12\62\1\u024c\133"+
		"\62\1\u02cb\62\62\1\u02cb\16\62\1\u024c\12\62\1\u008f\1\uffff\1\62\1\u008f"+
		"\1\62\1\uffff\6\62\1\u032e\4\62\1\uffff\12\62\1\u0264\1\uffff\2\62\6\uffff"+
		"\11\62\1\uffff\21\62\1\u035e\57\62\1\u008f\22\62\1\uffff\4\62\1\u0258"+
		"\10\62\1\u008f\35\62\1\u03c4\17\62\1\u03d1\2\62\1\u024c\4\62\1\u008f\5"+
		"\62\20\uffff\1\62\1\u008f\7\62\1\uffff\2\u0176\14\62\1\u0264\1\62\1\u0264"+
		"\1\u0411\4\uffff\10\62\1\uffff\1\62\1\u024c\16\62\7\uffff\5\62\1\u008f"+
		"\17\62\1\u008f\4\62\1\u008f\13\62\1\u008f\21\62\1\u008f\6\62\1\u008f\37"+
		"\62\1\uffff\6\62\1\u008f\5\62\1\uffff\11\62\1\u008f\1\62\34\uffff\2\62"+
		"\1\uffff\21\62\1\uffff\1\u0411\2\62\1\uffff\2\62\2\u008f\4\62\1\uffff"+
		"\11\62\1\u008f\1\62\1\u0258\2\62\11\uffff\6\62\1\u008f\4\62\1\u008f\10"+
		"\62\1\u008f\12\62\1\u008f\14\62\1\u008f\1\62\1\u0258\42\62\1\u008f\4\62"+
		"\1\u008f\2\62\37\uffff\12\62\1\u0258\6\62\1\u024c\1\uffff\1\62\1\u0540"+
		"\5\62\1\uffff\12\62\11\uffff\2\62\1\uffff\1\u008f\7\62\1\u0258\1\62\1"+
		"\u008f\3\62\1\u024c\13\62\1\uffff\1\u008f\1\u024c\7\62\1\u024c\7\62\1"+
		"\u024c\3\62\3\u008f\3\62\1\u008f\4\62\33\uffff\1\u008f\3\uffff\5\62\1"+
		"\u0176\5\62\1\uffff\1\62\1\uffff\14\62\11\uffff\1\62\1\uffff\2\62\1\u008f"+
		"\4\62\1\u008f\1\62\1\uffff\1\u035e\6\62\2\u008f\1\62\1\u024c\1\62\1\u008f"+
		"\3\62\1\u008f\2\62\34\uffff\3\62\1\uffff\1\62\3\uffff\1\u008f\7\62\1\u008f"+
		"\3\62\1\u008f\2\62\10\uffff\1\62\1\uffff\1\u008f\2\62\1\u008f\3\62\1\uffff"+
		"\1\u024c\3\uffff\7\62\3\u008f\1\62\32\uffff\3\62\1\uffff\1\62\2\uffff"+
		"\1\u008f\5\62\1\u024c\6\uffff\1\62\1\uffff\1\62\1\u008f\1\62\2\uffff\1"+
		"\u024c\2\62\1\u02cb\2\62\27\uffff\3\62\1\uffff\1\62\2\uffff\1\62\1\u0540"+
		"\1\62\1\u008f\1\u0258\6\uffff\1\62\1\uffff\1\62\2\uffff\1\62\22\uffff"+
		"\4\62\2\uffff\1\62\1\u0540\1\62\3\uffff\1\62\3\uffff\1\u008f\21\uffff"+
		"\1\u008f\1\62\1\u008f\2\uffff\1\62\1\u0540\1\u0411\17\uffff\1\u008f\3"+
		"\uffff\2\62\2\uffff\1\u008f\1\u0540\20\uffff\1\62\16\uffff\1\62\3\uffff"+
		"\1\u024c\11\uffff\1\62\12\uffff\1\62\6\uffff\1\u008f\23\uffff";
	static final String DFA76_eofS =
		"\u06dd\uffff";
	static final String DFA76_minS =
		"\1\0\27\54\1\uffff\2\54\1\46\1\uffff\1\11\1\46\1\54\1\46\1\41\1\54\1\111"+
		"\1\54\2\uffff\2\54\4\11\3\54\1\111\1\54\1\uffff\101\54\2\11\31\54\1\uffff"+
		"\20\54\1\46\1\54\1\40\14\54\1\111\2\54\1\60\1\46\1\60\1\uffff\1\60\1\uffff"+
		"\1\11\1\uffff\2\11\1\60\1\54\1\uffff\1\46\1\uffff\1\116\5\54\1\11\1\uffff"+
		"\1\11\3\54\1\116\1\54\1\40\115\54\2\11\41\54\1\40\51\54\1\41\2\54\1\41"+
		"\1\40\7\54\1\uffff\2\122\1\54\1\40\1\uffff\1\54\1\41\12\54\3\46\3\11\1"+
		"\46\2\11\1\46\2\11\1\54\1\103\4\54\2\11\2\54\1\40\2\54\1\40\4\54\1\123"+
		"\3\54\1\40\2\54\2\40\3\54\1\11\17\54\1\40\2\54\2\40\40\54\2\40\4\54\1"+
		"\40\1\104\3\54\1\40\7\54\1\41\31\54\1\40\14\54\1\40\13\54\1\46\16\54\1"+
		"\41\12\54\1\41\1\46\1\54\1\41\1\54\1\uffff\6\54\1\41\2\60\2\54\1\uffff"+
		"\12\54\1\46\1\uffff\2\60\1\uffff\4\11\1\uffff\1\54\1\56\7\54\1\101\7\54"+
		"\1\120\2\54\1\40\6\54\1\11\5\54\1\40\10\54\1\40\1\54\1\40\7\54\2\11\16"+
		"\54\1\40\6\54\1\41\7\54\1\157\1\54\1\40\3\54\1\40\4\54\1\uffff\4\54\1"+
		"\41\10\54\1\41\13\54\1\40\3\54\1\40\1\54\1\103\4\54\1\40\2\54\1\40\1\54"+
		"\1\40\1\54\1\41\2\54\1\40\3\54\1\40\6\54\1\40\1\54\1\41\2\54\1\41\2\54"+
		"\1\40\1\54\1\41\5\54\20\11\1\54\1\41\1\54\1\40\5\54\1\uffff\2\46\13\54"+
		"\1\40\1\46\1\55\2\46\4\11\1\54\1\40\6\54\1\uffff\1\54\1\40\5\54\1\117"+
		"\10\54\1\uffff\1\151\1\157\1\160\1\150\1\165\1\145\5\54\1\41\10\54\1\40"+
		"\6\54\1\41\3\54\1\40\1\41\4\54\1\40\2\54\1\40\2\54\1\40\1\41\1\40\1\54"+
		"\1\40\6\54\1\167\1\103\1\40\4\54\1\40\1\41\6\54\1\41\3\54\1\40\12\54\1"+
		"\40\1\54\1\40\4\54\1\157\1\40\2\54\3\40\3\54\1\uffff\1\40\5\54\1\41\5"+
		"\54\1\uffff\1\54\1\40\2\54\1\40\2\54\1\40\1\54\1\41\1\54\34\11\2\54\1"+
		"\uffff\5\54\1\122\12\54\1\40\1\uffff\1\41\2\60\1\uffff\1\60\1\54\2\41"+
		"\2\54\1\11\1\54\1\101\1\40\1\54\1\40\2\54\1\122\1\11\2\54\1\41\1\54\1"+
		"\41\2\54\1\141\1\162\1\165\1\145\1\uffff\1\141\1\164\1\156\1\164\2\54"+
		"\1\40\1\54\2\40\1\41\4\54\1\41\2\54\1\40\5\54\1\41\1\40\2\54\2\40\1\54"+
		"\1\40\2\54\1\40\1\41\4\54\1\40\1\156\1\157\2\54\3\40\1\41\1\54\1\41\1"+
		"\11\1\54\2\40\2\54\1\40\11\54\1\40\2\54\1\40\1\141\1\54\1\40\2\54\1\40"+
		"\5\54\1\40\2\54\1\41\3\54\1\40\1\41\2\54\37\11\2\54\1\40\3\54\1\40\1\60"+
		"\2\40\1\41\6\54\1\41\1\uffff\1\55\1\46\1\54\1\60\1\40\2\54\1\uffff\4\54"+
		"\1\124\5\54\1\157\1\143\1\153\1\144\1\143\1\155\1\55\1\164\1\145\1\54"+
		"\1\40\1\101\1\41\2\54\4\40\1\54\1\41\1\54\1\41\1\40\2\54\1\41\1\54\2\40"+
		"\1\54\1\11\2\54\1\11\1\141\2\40\1\122\1\41\1\11\2\54\2\40\3\54\1\41\3"+
		"\54\1\40\2\54\1\164\1\41\2\54\1\40\3\41\2\40\1\54\1\41\1\54\1\40\2\54"+
		"\33\11\1\46\3\11\2\40\3\54\1\46\4\54\1\55\1\uffff\1\55\1\uffff\1\54\1"+
		"\40\1\54\1\40\2\54\1\111\5\54\1\144\1\145\1\151\1\11\1\151\1\160\1\104"+
		"\1\151\1\162\1\54\1\164\2\54\1\41\4\54\1\41\1\164\1\145\1\11\2\54\1\40"+
		"\3\54\2\41\1\54\1\41\1\145\1\41\1\40\2\54\1\41\2\54\34\11\1\163\1\141"+
		"\1\154\1\46\1\151\3\11\1\41\1\40\2\54\1\40\1\55\1\60\1\40\1\41\1\40\1"+
		"\54\1\116\1\41\1\40\1\54\2\11\1\156\1\141\1\151\1\157\1\156\1\141\1\54"+
		"\1\164\1\41\1\54\1\40\1\41\1\54\1\40\1\145\1\164\1\151\1\141\1\145\1\150"+
		"\3\54\1\40\2\54\1\144\3\41\1\40\32\11\1\143\1\162\1\141\1\11\1\163\2\11"+
		"\1\41\1\54\2\60\1\54\1\107\1\41\1\147\1\154\1\157\1\167\1\147\1\156\1"+
		"\54\1\162\1\11\1\41\1\144\2\162\1\41\1\54\1\40\1\41\2\40\27\11\1\157\1"+
		"\164\1\143\1\11\1\143\2\11\1\54\1\46\1\60\2\41\1\11\1\40\2\156\1\40\1"+
		"\11\1\54\1\141\1\40\1\151\1\145\1\54\22\11\1\142\1\151\1\153\1\56\2\11"+
		"\1\54\1\46\1\60\3\11\1\40\1\143\1\145\1\162\1\41\21\11\1\41\1\55\1\41"+
		"\2\11\1\54\2\46\1\164\1\166\1\141\14\11\1\46\3\11\1\151\1\103\2\11\1\41"+
		"\1\46\1\151\1\145\1\156\15\11\1\157\1\11\1\157\1\162\13\11\1\154\1\11"+
		"\1\156\13\11\1\157\12\11\1\162\6\11\1\41\23\11";
	static final String DFA76_maxS =
		"\1\uffff\21\172\1\u00f6\5\172\1\uffff\2\172\1\u2019\1\uffff\2\u2019\1"+
		"\172\2\u2019\1\172\1\111\1\172\2\uffff\11\172\1\111\1\172\1\uffff\134"+
		"\172\1\uffff\20\172\1\u2019\16\172\1\111\2\172\1\71\1\u2019\1\71\1\uffff"+
		"\1\71\1\uffff\1\71\1\uffff\2\u2019\1\71\1\172\1\uffff\1\u2019\1\uffff"+
		"\1\116\6\172\1\uffff\4\172\1\116\u009c\172\1\u2019\2\172\1\u2019\10\172"+
		"\1\uffff\2\122\2\172\1\uffff\1\172\1\u2019\12\172\3\u2019\2\71\2\u2019"+
		"\1\51\3\u2019\1\51\1\172\1\103\10\172\1\u2019\7\172\1\123\107\172\1\104"+
		"\13\172\1\u2019\62\172\1\u2019\16\172\1\u2019\12\172\2\u2019\1\172\1\u2019"+
		"\1\172\1\uffff\6\172\1\u2019\2\71\2\172\1\uffff\12\172\1\u2019\1\uffff"+
		"\2\71\1\uffff\1\71\1\u2019\1\71\1\u2019\1\uffff\1\172\1\56\7\172\1\127"+
		"\7\172\1\120\11\172\1\127\57\172\1\u2019\7\172\1\157\12\172\1\uffff\4"+
		"\172\1\u2019\10\172\1\u2019\21\172\1\103\13\172\1\u2019\17\172\1\u2019"+
		"\2\172\1\u2019\4\172\1\u2019\5\172\1\71\17\u2019\1\172\1\u2019\7\172\1"+
		"\uffff\2\u2019\13\172\1\40\1\u2019\1\71\2\u2019\1\71\1\51\1\u2019\1\51"+
		"\10\172\1\uffff\1\172\1\u2019\5\172\1\117\10\172\1\uffff\1\162\1\157\1"+
		"\167\2\165\1\145\5\172\1\u2019\17\172\1\u2019\4\172\1\u2019\13\172\1\u2019"+
		"\11\172\1\167\1\103\6\172\1\u2019\6\172\1\u2019\25\172\1\157\11\172\1"+
		"\uffff\6\172\1\u2019\5\172\1\uffff\11\172\1\u2019\1\172\2\71\32\u2019"+
		"\2\172\1\uffff\5\172\1\122\13\172\1\uffff\1\u2019\2\71\1\uffff\1\71\1"+
		"\172\2\u2019\2\172\1\111\1\172\1\127\5\172\1\122\3\172\1\u2019\1\172\1"+
		"\u2019\2\172\1\157\1\162\1\165\1\145\1\uffff\1\141\1\164\1\156\1\164\6"+
		"\172\1\u2019\4\172\1\u2019\10\172\1\u2019\12\172\1\u2019\5\172\1\156\1"+
		"\157\5\172\1\u2019\1\172\1\u2019\24\172\1\141\15\172\1\u2019\4\172\1\u2019"+
		"\2\172\37\u2019\7\172\1\71\2\172\1\u2019\6\172\1\u2019\1\uffff\1\71\1"+
		"\u2019\1\73\1\71\3\172\1\uffff\4\172\1\124\5\172\1\157\1\143\1\153\1\144"+
		"\1\143\1\155\1\55\1\164\1\145\2\172\1\101\1\u2019\7\172\1\u2019\1\172"+
		"\1\u2019\3\172\1\u2019\7\172\1\40\1\141\2\172\1\122\2\u2019\7\172\1\u2019"+
		"\6\172\1\164\1\u2019\3\172\3\u2019\3\172\1\u2019\4\172\37\u2019\1\40\4"+
		"\172\1\u2019\4\172\1\71\1\uffff\1\55\1\uffff\6\172\1\111\5\172\1\144\1"+
		"\145\1\151\1\40\1\151\1\160\1\104\1\151\1\162\1\172\1\164\2\172\1\u2019"+
		"\4\172\1\u2019\1\164\1\145\1\127\6\172\2\u2019\1\172\1\u2019\1\145\1\u2019"+
		"\3\172\1\u2019\2\172\26\u2019\1\51\5\u2019\1\163\1\141\1\154\1\u2019\1"+
		"\151\4\u2019\4\172\2\71\1\172\1\u2019\2\172\1\116\1\u2019\2\172\2\40\1"+
		"\156\1\141\1\151\1\157\1\156\1\141\1\172\1\164\1\u2019\2\172\1\u2019\2"+
		"\172\1\145\1\164\1\162\1\157\1\145\1\165\6\172\1\144\3\u2019\1\172\32"+
		"\u2019\1\143\1\162\1\141\1\u2019\1\163\3\u2019\1\172\2\71\1\172\1\107"+
		"\1\u2019\1\147\1\154\1\157\1\167\1\147\1\156\1\172\1\162\1\172\1\u2019"+
		"\1\144\1\162\1\164\1\u2019\2\172\1\u2019\1\172\1\40\27\u2019\1\157\1\164"+
		"\1\143\1\u2019\1\143\2\u2019\1\172\1\u2019\1\71\2\u2019\2\40\2\156\1\40"+
		"\1\163\1\172\1\141\1\40\1\151\1\145\1\172\22\u2019\1\142\1\151\1\153\1"+
		"\56\2\u2019\1\172\1\u2019\1\71\3\40\1\172\1\143\1\145\1\162\23\u2019\1"+
		"\55\3\u2019\1\172\2\u2019\1\164\1\166\1\141\20\u2019\1\151\1\103\4\u2019"+
		"\1\151\1\145\1\156\15\u2019\1\157\1\u2019\1\157\1\162\1\163\12\u2019\1"+
		"\154\1\u2019\1\156\2\40\11\u2019\1\157\1\u2019\1\40\10\u2019\1\162\32"+
		"\u2019";
	static final String DFA76_acceptS =
		"\30\uffff\1\10\3\uffff\1\22\10\uffff\1\35\1\37\13\uffff\1\35\134\uffff"+
		"\1\3\45\uffff\1\30\1\uffff\1\22\1\uffff\1\31\4\uffff\1\27\1\uffff\1\33"+
		"\7\uffff\1\21\u00ad\uffff\1\15\4\uffff\1\12\u00d0\uffff\1\11\13\uffff"+
		"\1\7\13\uffff\1\16\2\uffff\1\24\4\uffff\1\32\136\uffff\1\34\142\uffff"+
		"\1\5\36\uffff\1\1\20\uffff\1\2\145\uffff\1\6\14\uffff\1\17\51\uffff\1"+
		"\13\21\uffff\1\14\3\uffff\1\23\33\uffff\1\4\u008e\uffff\1\36\7\uffff\1"+
		"\26\173\uffff\1\20\1\uffff\1\25\u019a\uffff";
	static final String DFA76_specialS =
		"\1\13\50\uffff\1\4\1\5\1\11\1\2\107\uffff\1\7\1\1\121\uffff\1\12\1\uffff"+
		"\1\0\123\uffff\1\14\1\6\173\uffff\1\3\1\10\u0541\uffff}>";
	static final String[] DFA76_transitionS = {
			"\11\46\2\34\2\46\1\34\22\46\1\34\5\46\2\45\1\35\3\46\1\43\1\41\1\40\1"+
			"\46\1\36\1\33\10\36\2\45\5\46\1\12\1\6\1\7\1\13\1\14\1\15\1\16\1\10\1"+
			"\17\1\20\1\21\1\22\1\1\1\3\1\2\1\23\1\42\1\24\1\5\1\25\1\31\1\11\1\4"+
			"\1\26\1\27\1\42\4\46\1\45\1\46\10\44\1\32\3\44\1\37\15\44\u1f9e\46\1"+
			"\45\udfe6\46",
			"\1\60\24\uffff\10\61\1\55\5\61\1\57\2\61\1\51\1\53\7\61\6\uffff\1\47"+
			"\7\63\1\50\5\63\1\56\2\63\1\52\1\54\7\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\65\3\63\1\64\3\63\1\66\6\63",
			"\1\60\24\uffff\16\61\1\71\13\61\6\uffff\4\63\1\70\11\63\1\67\13\63",
			"\1\60\24\uffff\4\61\1\100\11\61\1\76\13\61\6\uffff\1\77\3\63\1\73\2"+
			"\63\1\74\1\75\5\63\1\72\13\63",
			"\1\60\24\uffff\1\116\16\61\1\114\4\61\1\115\5\61\6\uffff\1\103\1\63"+
			"\1\104\1\63\1\105\2\63\1\106\1\107\1\63\1\110\3\63\1\111\1\102\3\63\1"+
			"\101\1\112\1\63\1\113\3\63",
			"\1\60\24\uffff\4\61\1\126\25\61\6\uffff\1\120\3\63\1\121\3\63\1\122"+
			"\2\63\1\123\2\63\1\124\2\63\1\117\2\63\1\125\5\63",
			"\1\60\24\uffff\13\61\1\137\2\61\1\136\13\61\6\uffff\1\131\3\63\1\132"+
			"\2\63\1\127\1\133\2\63\1\134\2\63\1\135\5\63\1\130\5\63",
			"\1\60\24\uffff\4\61\1\142\11\61\1\143\13\61\6\uffff\1\141\23\63\1\140"+
			"\5\63",
			"\1\60\24\uffff\1\147\3\61\1\146\25\61\6\uffff\4\63\1\144\3\63\1\145"+
			"\21\63",
			"\1\60\24\uffff\22\61\1\161\7\61\6\uffff\3\63\1\160\1\63\1\150\2\63\1"+
			"\151\1\63\1\152\1\153\1\154\1\155\1\63\1\156\4\63\1\157\5\63",
			"\1\60\24\uffff\21\61\1\164\10\61\6\uffff\1\162\15\63\1\163\2\63\1\165"+
			"\10\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\166\11\63\1\167\2\63",
			"\1\60\24\uffff\21\61\1\174\10\61\6\uffff\10\63\1\170\2\63\1\171\2\63"+
			"\1\172\2\63\1\173\10\63",
			"\1\60\24\uffff\21\61\1\u0082\10\61\6\uffff\4\63\1\175\3\63\1\176\2\63"+
			"\1\177\2\63\1\u0080\2\63\1\u0081\10\63",
			"\1\60\24\uffff\15\61\1\u0087\14\61\6\uffff\1\63\1\u0083\1\u0084\16\63"+
			"\1\u0085\1\63\1\u0086\6\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0088\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0089\11\63\1\u008a\5\63\1\u008b"+
			"\5\63",
			"\1\60\24\uffff\24\61\1\u0091\5\61\6\uffff\1\u008c\3\63\1\u008d\2\63"+
			"\1\u008e\6\63\1\u0090\13\63\173\uffff\1\u008f",
			"\1\60\24\uffff\32\61\6\uffff\1\u0092\3\63\1\u0093\2\63\1\u0094\3\63"+
			"\1\u0095\2\63\1\u0096\2\63\1\u0099\2\63\1\u0097\3\63\1\u0098\1\63",
			"\1\60\3\uffff\12\u00a0\7\uffff\10\61\1\u009f\21\61\6\uffff\1\u009a\3"+
			"\63\1\u009b\2\63\1\u009c\6\63\1\u009d\5\63\1\u009e\5\63",
			"\1\60\24\uffff\4\61\1\u00a5\2\61\1\u00a9\6\61\1\u00a4\5\61\1\u00a7\5"+
			"\61\6\uffff\7\63\1\u00a8\1\u00a1\5\63\1\u00a2\2\63\1\u00a3\2\63\1\u00a6"+
			"\5\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u00aa\13\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u00ab\13\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u00ad\5\63\1\u00ac\6\63",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\15\u00b1\1\u00ae\14\u00b1",
			"\3\62\3\uffff\1\u00b4\1\u00b2\1\62\1\uffff\12\u00b3\1\u00b6\1\u00b4"+
			"\5\uffff\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"",
			"\2\u00b9\2\uffff\1\u00b9\22\uffff\1\u00b9\5\uffff\2\u00ba\4\uffff\2"+
			"\u00ba\2\uffff\12\u00b8\2\u00ba\5\uffff\32\u00bb\4\uffff\1\u00ba\1\uffff"+
			"\32\u00ba\u1f9e\uffff\1\u00ba",
			"\3\62\3\uffff\1\u00b4\1\u00bc\1\62\1\uffff\12\u00b3\1\u00b6\1\u00b4"+
			"\5\uffff\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\10\u00b1\1\u00bd\21\u00b1",
			"\3\62\3\uffff\2\62\1\u00bf\1\uffff\14\62\5\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\62\4\uffff\3\62\3\uffff\3\62\1\uffff\14\62\3\uffff\1\62\1\uffff\32"+
			"\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u00c1",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\32\u00b1",
			"",
			"",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u00c3\1\63\1\u00c4\4\63\1\u00c2"+
			"\7\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u00c5\4\63\1\u00c6\7\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\22"+
			"\61\1\u00c7\7\61\6\uffff\32\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\22\63\1\u00c9\7\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\22\61\1\u00ca\7\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u00cb\14\63",
			"\1\60\24\uffff\15\61\1\u00cc\14\61\6\uffff\32\63",
			"\1\u00cd",
			"\1\60\24\uffff\32\61\6\uffff\32\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u00ce\25\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u00cf\26\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u00d0\6\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u00d2\3\63\1\u00d1\4\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u00d3\25\63\1\u00d4\3\63",
			"\1\60\24\uffff\15\61\1\u00d5\14\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u00d6\10\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u00da\4\63\1\u00d7\2\63\1\u00d8"+
			"\6\63\1\u00d9\7\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u00db\21\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u00dd\5\63\1\u00dc\10\63",
			"\1\60\24\uffff\21\61\1\u00de\10\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u00df\16\63",
			"\1\60\24\uffff\3\61\1\u00e0\26\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u00e2\23\63\1\u00e1\5\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u00e4\3\63\1\u00e3\3\63\1\u00e5\21\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u00e6\2\63\1\u00e7\1\u00e8\6\63"+
			"\1\u00e9\6\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u00ea\6\63\1\u00eb\13\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u00ec\22\63\1\u00ed\6\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u00ee\3\63\1\u00ef\21\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u00f0\11\63\1\u00f1\16\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u00f2\1\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u00f3\24\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u00f5\4\63\1\u00f4\7\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u00f6\25\63",
			"\1\60\24\uffff\16\61\1\u00f7\13\61\6\uffff\32\63",
			"\1\60\24\uffff\15\61\1\u00f8\14\61\6\uffff\32\63",
			"\1\60\24\uffff\23\61\1\u00f9\6\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u00fb\7\63\1\u00fc\5\63\1\u00fa\5\63"+
			"\1\u00fd\5\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u00fe\7\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u00ff\2\63\1\u0100\2\63\1\u0103\4\63"+
			"\1\u0101\5\63\1\u0102\10\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u0104\27\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0105\15\63\1\u0106\5\63\1\u0107\5\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0108\1\u0109\1\63\1\u010a\2\63"+
			"\1\u010b\1\u010c\1\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u010d\16\63",
			"\1\60\24\uffff\22\61\1\u010e\7\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u010f\3\63\1\u0110\3\63\1\u0111\5\63"+
			"\1\u0112\13\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0114\1\63\1\u0113\6\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0115\4\63\1\u0116\3\63\1\u0117"+
			"\3\63\1\u0118\4\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0119\7\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u011a\10\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u011b\5\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u011c\10\63\1\u011d\16\63",
			"\1\60\24\uffff\13\61\1\u011e\16\61\6\uffff\32\63",
			"\1\60\24\uffff\24\61\1\u011f\5\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0120\14\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0121\3\63\1\u0122\4\63",
			"\1\60\24\uffff\21\61\1\u0123\10\61\6\uffff\32\63",
			"\1\60\24\uffff\24\61\1\u0124\5\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0126\1\63\1\u0125\6\63",
			"\1\60\24\uffff\32\61\6\uffff\31\63\1\u0127",
			"\1\60\24\uffff\23\61\1\u0128\6\61\6\uffff\32\63",
			"\1\60\24\uffff\21\61\1\u0129\10\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u012a\1\u012b\23\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u012c\10\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u012d\21\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u012e\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u012f\25\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0130\31\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u0131\12\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0132\7\63",
			"\1\60\24\uffff\32\61\6\uffff\25\63\1\u0133\4\63",
			"\1\60\24\uffff\22\61\1\u0134\7\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u0135\10\63\1\u0136\1\63\1\u0137"+
			"\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u0138\4\63\1\u0139\23\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u013a\14\63\1\u013b\6\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u013c\27\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u013d\10\63\1\u013e\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u013f\31\63",
			"\1\60\24\uffff\32\61\6\uffff\27\63\1\u0140\2\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0141\3\63\1\u0142\21\63",
			"\1\60\24\uffff\10\61\1\u0143\21\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0144\10\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0145\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0146\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0147\5\63\1\u0148\10\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0149\3\63\1\u014a\25\63",
			"\1\60\24\uffff\16\61\1\u014b\13\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u014c\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u014d\25\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u014e\21\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u014f\31\63",
			"\1\60\24\uffff\2\61\1\u0150\27\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u0151\12\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0152\14\63\1\u0153\10\63",
			"\1\60\24\uffff\32\61\6\uffff\14\63\1\u0154\15\63",
			"\1\60\24\uffff\32\61\6\uffff\25\63\1\u0155\4\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u0156\4\63\1\u0157\3\63\1\u0158"+
			"\17\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0159\13\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u015a\31\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\26\63\1\u015b\3\63",
			"\1\60\24\uffff\15\61\1\u015c\14\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u015f\6\63\1\u015d\1\63\1\u015e"+
			"\10\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u0160\1\63\1\u0161\6\63\1\u0162"+
			"\6\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0163\31\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0164\13\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0165\2\63\1\u0166\1\u0167\1\63"+
			"\1\u0168\2\63\1\u0169\10\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u016a\4\63\1\u016b\16\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u016c\10\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u016d\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u016f\7\63\1\u016e\6\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0170\17\63\1\u0171\6\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0172\13\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0173\6\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0174\7\63",
			"\1\60\24\uffff\15\61\1\u0175\14\61\6\uffff\32\63",
			"\3\62\3\uffff\2\u0177\1\62\1\uffff\12\u00a0\1\62\1\u0178\5\uffff\32"+
			"\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u0179\30\63",
			"\1\u017b\13\uffff\1\60\24\uffff\32\61\6\uffff\30\63\1\u017a\1\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u017c\25\63",
			"\1\60\24\uffff\30\61\1\u017d\1\61\6\uffff\32\63",
			"\1\60\24\uffff\21\61\1\u017e\10\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u017f\25\63",
			"\1\60\24\uffff\4\61\1\u0180\25\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u0181\5\63",
			"\1\60\24\uffff\24\61\1\u0182\5\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0183\16\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0184\10\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0185\21\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0186\16\63",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\2\u00b1\1\u0187\27\u00b1",
			"\1\u00c1",
			"\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\32\u00b1",
			"\10\u0189\1\u0188\1\u0189",
			"\3\62\3\uffff\1\u00b4\1\u00bc\1\62\1\uffff\12\u00b3\1\u00b6\1\u00b4"+
			"\5\uffff\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\12\u018a",
			"",
			"\12\u018b",
			"",
			"\2\u018d\2\uffff\1\u018d\22\uffff\1\u018d\10\uffff\1\u018e\6\uffff\12"+
			"\u018c",
			"",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\1\u018f\4\uffff\2\u00ba\1"+
			"\uffff\1\u0191\2\uffff\2\u00ba\1\u018f\13\uffff\2\u00ba\3\uffff\1\u018f"+
			"\37\uffff\1\u00ba\1\uffff\32\u00ba\u1f9e\uffff\1\u00ba",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\1\u0193\4\uffff\2\u0192\1"+
			"\uffff\1\u0191\2\uffff\2\u0192\1\u0193\13\uffff\2\u0192\3\uffff\1\u0193"+
			"\1\uffff\32\u0192\4\uffff\1\u0192\1\uffff\32\u0192\u1f9e\uffff\1\u0192",
			"\12\u0189",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\15\u00b1\1\u0194\14\u00b1",
			"",
			"\3\62\3\uffff\2\62\1\u00bf\1\uffff\14\62\5\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"",
			"\1\u0195",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0196\6\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0197\6\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u0198\27\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0199\21\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u019a\7\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\22\61\1\u019b\7\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u019c\26\63",
			"\1\60\24\uffff\3\61\1\u019d\26\61\6\uffff\32\63",
			"\1\u0195",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u019e\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u019f\25\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u01a1\7\63\1\u01a0\21\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u01a2\20\63\1\u01a3\3\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u01a4\12\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u01a5\24\63",
			"\1\60\1\u01a6\23\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u01a7\17\63",
			"\1\60\24\uffff\32\61\6\uffff\14\63\1\u01a8\15\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u01a9\7\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u01aa\6\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u01ab\14\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u01ac\12\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u01ad\25\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u01ae\26\63",
			"\1\60\24\uffff\12\61\1\u01af\17\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u01b0\17\63",
			"\1\60\24\uffff\15\61\1\u01b1\14\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u01b2\26\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u01b3\7\63\1\u01b4\14\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u01b5\27\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u01b6\14\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u01b7\14\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u01b8\14\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u01b9\5\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u01ba\13\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u01bb\5\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u01bc\21\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u01bd\6\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u01be\16\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u01bf\6\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u01c0\6\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u01c1\5\63\1\u01c2\22\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u01c3\25\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u01c4\17\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u01c5\25\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u01c6\6\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u01c7\7\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u01c8\26\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u01c9\1\u01ca\25\63",
			"\1\60\24\uffff\21\61\1\u01cb\10\61\6\uffff\32\63",
			"\1\60\24\uffff\3\61\1\u01cc\26\61\6\uffff\32\63",
			"\1\60\24\uffff\24\61\1\u01cd\5\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u01ce\13\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u01cf\27\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u01d0\22\63\1\u01d1\6\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u01d2\7\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u01d3\15\63\1\u01d4\7\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u01d5\12\63\1\u01d6\2\63\1\u01d7"+
			"\5\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u01d8\16\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u01d9\23\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u01da\6\63\1\u01db\14\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u01dc\21\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u01dd\22\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u01de\27\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u01df\13\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u01e0\25\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u01e1\25\63\1\u01e2",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u01e3\6\63",
			"\1\60\24\uffff\32\61\6\uffff\25\63\1\u01e4\4\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u01e5\25\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u01e6\17\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u01e7\16\63",
			"\1\60\24\uffff\23\61\1\u01e8\6\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\14\63\1\u01e9\15\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u01ea\7\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u01eb\5\63\1\u01ec\14\63",
			"\1\60\24\uffff\32\61\6\uffff\26\63\1\u01ed\3\63",
			"\1\60\1\u01ee\23\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u01ef\16\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u01f0\10\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u01f1\3\63\1\u01f2\25\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u01f3\26\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u01f4\31\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u01f5\17\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u01f6\14\63",
			"\1\60\24\uffff\32\61\6\uffff\14\63\1\u01f7\15\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u01f8\17\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\13\63\1\u01f9\16\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\1\61\1\u01fa\30\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u01fb\6\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u01fc\10\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u01fd\31\63",
			"\1\60\24\uffff\3\61\1\u01fe\26\61\6\uffff\32\63",
			"\1\60\24\uffff\15\61\1\u01ff\14\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0200\25\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0201\7\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0202\7\63",
			"\1\60\24\uffff\4\61\1\u0203\25\61\6\uffff\32\63",
			"\1\60\24\uffff\10\61\1\u0204\21\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0205\25\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0206\22\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0207\25\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0208\6\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0209\7\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u020a\10\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u020b\6\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u020c\25\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u020d\6\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u020e\31\63",
			"\1\60\24\uffff\16\61\1\u020f\13\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0210\22\63",
			"\1\60\24\uffff\32\61\6\uffff\14\63\1\u0211\15\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0212\26\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0213\25\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0214\5\63\1\u0215\5\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0216\16\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0217\16\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0218\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0219\16\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u021a\14\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u021b\6\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u021c\14\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u021d\26\63",
			"\1\60\24\uffff\3\61\1\u021e\26\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\14\63\1\u021f\15\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0220\14\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0221\14\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0222\26\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0223\26\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0225\11\63\1\u0224\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0226\27\63\1\u0227\1\63",
			"\1\60\24\uffff\24\61\1\u0228\5\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\31\63\1\u0229",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u022a\16\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u022b\7\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u022c\16\63",
			"\1\60\1\uffff\1\u022d\22\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u022e\31\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u022f\7\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0230\10\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0231\13\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0232\31\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0233\10\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0234\13\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0235\25\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0236\14\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0237\7\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u0238\27\63",
			"\1\60\24\uffff\2\61\1\u0239\27\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u023a\21\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u023b\7\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u023c\10\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u023d\21\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u023e\30\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u023f\21\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0240\10\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0241\6\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0242\14\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0243\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0244\25\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0245\26\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0246\6\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u024a\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u024b\25\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u024d\16\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u024e\30\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u024f\10\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0250\26\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0251\6\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0252\7\63",
			"\1\60\24\uffff\6\61\1\u0253\23\61\6\uffff\32\63",
			"",
			"\1\u0254",
			"\1\u0255",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0256\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0257\25\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\21\61\1\u0259\10\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u025a\7\63",
			"\1\60\24\uffff\22\61\1\u025b\7\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u025c\10\63",
			"\1\60\24\uffff\21\61\1\u025d\10\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u025e\13\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u025f\17\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0260\16\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0261\25\63",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\7\u00b1\1\u0262\22\u00b1",
			"\3\62\3\uffff\1\u00b4\1\u0265\1\62\1\uffff\1\u0263\11\u0189\1\62\1\u00b4"+
			"\5\uffff\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\3\62\3\uffff\1\u00b4\1\u0265\1\62\1\uffff\12\u0189\1\62\1\u00b4\5\uffff"+
			"\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\3\62\3\uffff\1\u00b4\1\u0266\1\62\1\uffff\12\u018a\1\62\1\u00b4\5\uffff"+
			"\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\u0267\2\uffff\1\u0267\22\uffff\1\u0267\17\uffff\12\u018b",
			"\2\u018d\2\uffff\1\u018d\22\uffff\1\u018d\10\uffff\1\u018e\6\uffff\12"+
			"\u0268",
			"\2\u018d\2\uffff\1\u018d\22\uffff\1\u018d\5\uffff\2\u0269\1\uffff\1"+
			"\u00b9\2\uffff\2\u0269\2\uffff\12\u026a\2\u0269\5\uffff\32\u026b\4\uffff"+
			"\1\u0269\1\uffff\32\u0269\u1f9e\uffff\1\u0269",
			"\3\62\3\uffff\3\62\1\uffff\14\62\5\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\10\uffff\1\u0191",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\5\uffff\2\u0269\4\uffff\2"+
			"\u0269\2\uffff\12\u026a\2\u0269\5\uffff\32\u026b\4\uffff\1\u0269\1\uffff"+
			"\32\u0269\u1f9e\uffff\1\u0269",
			"\3\62\3\uffff\3\62\1\uffff\14\62\5\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\1\u0193\4\uffff\2\u0192\1"+
			"\uffff\1\u0191\2\uffff\2\u0192\1\u0193\13\uffff\2\u0192\3\uffff\1\u0193"+
			"\1\uffff\32\u0192\4\uffff\1\u0192\1\uffff\32\u0192\u1f9e\uffff\1\u0192",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\10\uffff\1\u0191",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\24\u00b1\1\u026d\5\u00b1",
			"\1\u026e",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u026f\3\63\1\u0270\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0271\25\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0272\22\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0273\31\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\2\u00c8\2\uffff\1\u00c8\22\uffff\1\u00c8\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0274\31\63",
			"\1\60\24\uffff\1\u0275\31\61\6\uffff\32\63",
			"\1\u0276\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0277\10\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u0278\27\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0279\13\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u027a\3\63\1\u027b\21\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u027c\13\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u027d\13\63",
			"\1\u027e",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u027f\21\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0280\31\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0281\22\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0282\25\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u0283\12\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\7\63\1\u0284\22\63",
			"\1\u024c\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\10\61\1\u0285\21\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0286\6\63",
			"\1\60\24\uffff\4\61\1\u0287\25\61\6\uffff\32\63",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u0289\24\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u028a\26\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u028b\21\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u028c\21\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u028d\13\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u028e\6\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u028f\17\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u0290\1\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0291\10\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u0292\12\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0293\6\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u0294\1\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0295\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0296\16\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0297\31\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0298\10\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u0299\1\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u029a\25\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u029b\31\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u029c\21\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u029d\12\63",
			"\1\60\24\uffff\23\61\1\u029e\6\61\6\uffff\32\63",
			"\1\60\24\uffff\1\u029f\31\61\6\uffff\32\63",
			"\1\60\24\uffff\21\61\1\u02a0\10\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u02a1\26\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02a2\25\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u02a3\10\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u02a4\6\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u02a5\7\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02a6\14\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02a7\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u02a8\16\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u02a9\26\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u02aa\27\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02ab\21\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02ac\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02ad\25\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02ae\25\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02af\14\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u02b0\13\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u02b1\17\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u02b2\26\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u02b3\6\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02b4\25\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u02b5\13\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u02b6\13\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02b7\21\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u02b8\10\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02b9\21\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\3\63\1\u02ba\10\63\1\u02bb"+
			"\15\63",
			"\1\30\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u02bc\12\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02bd\31\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u02be\5\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02bf\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u02c0",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u02c1\1\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02c2\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02c3\31\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02c4\21\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u02c5\16\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u02c6\1\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02c7\25\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u02c8\30\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02c9\25\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02ca\21\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02cc\21\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02cd\21\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02ce\14\63",
			"\1\60\24\uffff\10\61\1\u02cf\21\61\6\uffff\32\63",
			"\1\60\24\uffff\3\61\1\u02d0\26\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u02d1\10\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02d2\31\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u02d3\16\63",
			"\1\60\24\uffff\21\61\1\u02d4\10\61\6\uffff\32\63",
			"\1\60\24\uffff\4\61\1\u02d5\25\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02d6\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02d7\31\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u02d8\26\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02d9\31\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u02da\17\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02db\21\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u02dc\13\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02dd\14\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u02de\10\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02df\14\63",
			"\1\60\24\uffff\2\61\1\u02e0\27\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u02e1\7\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02e2\31\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02e3\21\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u02e4\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02e5\25\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02e6\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02e7\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u02e8\16\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u02e9\26\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02ea\21\63",
			"\1\60\1\u02eb\23\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u02ec\27\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02ed\31\63",
			"\1\60\24\uffff\1\u02ee\31\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02ef\31\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u02f0\6\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u02f1\25\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u02f2\13\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u02f3\26\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u02f4\5\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u02f5\6\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u02f6\22\63",
			"\1\60\24\uffff\17\61\1\u02f7\12\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02f8\31\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u02f9\31\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u02fa\22\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u02fb\21\63",
			"\3\62\3\uffff\3\62\1\uffff\14\62\5\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02fc\14\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u02fd\22\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u02fe\1\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u02ff\14\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0300\7\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0301\31\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0302\6\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0303\16\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u0304\30\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0305\31\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0306\22\63",
			"\1\60\24\uffff\7\61\1\u0307\22\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0308\16\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0309\13\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\22\63\1\u030a\7\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u030b\14\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u030c\10\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u030d\6\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u030e\31\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u030f\6\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0310\6\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0311\7\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0312\10\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0313\16\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u0314\5\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff"+
			"\1\62",
			"\2\62\4\uffff\2\62\2\uffff\1\62\1\u0315\12\62\5\uffff\1\u0316\1\u0317"+
			"\1\u0318\1\62\1\u0319\1\u031a\1\u031b\1\62\1\u031c\1\62\1\u031d\1\u031e"+
			"\1\u031f\1\u0320\3\62\1\u0321\1\u0322\1\u0323\2\62\1\u0324\3\62\4\uffff"+
			"\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0325\21\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\12\63\1\u0326\7"+
			"\63\1\u0247\7\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0327\14\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u0328\1\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0329\13\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u032a\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u032b\25\63",
			"\1\60\24\uffff\32\61\6\uffff\26\63\1\u032c\3\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u032d\25\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\12\u032f",
			"\12\u0330",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0331\6\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0332\21\63",
			"",
			"\1\60\24\uffff\10\61\1\u0333\21\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0334\26\63",
			"\1\60\24\uffff\3\61\1\u0335\26\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0336\7\63",
			"\1\60\24\uffff\22\61\1\u0337\7\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0338\21\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0339\7\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u033a\21\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u033b\7\63",
			"\1\u00af\15\uffff\1\u033c\6\uffff\32\u00b0\6\uffff\32\u00b1",
			"\3\62\3\uffff\1\u00b4\1\u0265\1\62\1\uffff\1\u033d\11\u0189\1\62\1\u00b4"+
			"\5\uffff\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"",
			"\12\u033e",
			"\12\u033f",
			"",
			"\2\u018d\2\uffff\1\u018d\22\uffff\1\u018d\10\uffff\1\u0340\6\uffff\12"+
			"\u0341",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\1\u0342\4\uffff\2\u0269\1"+
			"\uffff\1\u0191\2\uffff\2\u0269\1\u0342\13\uffff\2\u0269\3\uffff\1\u0342"+
			"\37\uffff\1\u0269\1\uffff\32\u0269\u1f9e\uffff\1\u0269",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\10\uffff\1\u0191\6\uffff\12"+
			"\u026a",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\1\u0344\4\uffff\2\u0343\1"+
			"\uffff\1\u0191\2\uffff\2\u0343\1\u0344\13\uffff\2\u0343\3\uffff\1\u0344"+
			"\1\uffff\32\u0343\4\uffff\1\u0343\1\uffff\32\u0343\u1f9e\uffff\1\u0343",
			"",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\23\u00b1\1\u0345\6\u00b1",
			"\1\u022d",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0346\10\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u0347\24\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0348\7\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0349\25\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u034a\6\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u034b\1\63",
			"\1\60\24\uffff\30\61\1\u034c\1\61\6\uffff\32\63",
			"\3\u024c\1\uffff\1\u024c\1\uffff\1\u024c\1\uffff\2\u034d\3\uffff\3\u024c"+
			"\2\uffff\1\u034d\1\uffff\3\u024c",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u034e\22\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u034f\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0350\16\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u0351\23\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u0352\27\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0353\16\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u0354\5\63",
			"\1\u0355",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0356\14\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0357\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0358\7\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0359\25\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u035a\31\63",
			"\1\60\24\uffff\15\61\1\u035b\14\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u035c\22\63",
			"\1\60\24\uffff\22\61\1\u035d\7\61\6\uffff\32\63",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\41\uffff\1\u035f\1\u0362\4"+
			"\uffff\1\u0363\12\uffff\1\u0361\2\uffff\1\u0364\1\u0360",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0365\13\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0366\31\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0367\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0368\25\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0369\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u036a\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u036b\25\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u036c\26\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u036d\12\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u036e\21\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u036f\22\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0370\10\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0371\31\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0372\21\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\27\63\1\u0373\2\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u0374\1\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0375\7\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0376\7\63",
			"\1\60\24\uffff\10\61\1\u0377\21\61\6\uffff\32\63",
			"\1\60\24\uffff\30\61\1\u0378\1\61\6\uffff\32\63",
			"\1\60\24\uffff\3\61\1\u0379\26\61\6\uffff\32\63",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u037a\26\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u037b\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u037c\25\63",
			"\1\60\24\uffff\32\61\6\uffff\11\63\1\u037d\20\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u037e\6\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u037f\25\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0380\25\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0381\25\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0382\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0383\31\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0384\10\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0385\7\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0386\14\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0387\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0388\22\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0389\21\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u038a\10\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u038b\21\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u038c\14\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u038d\25\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u038e\14\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u038f\13\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0390\31\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0391\21\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u0392\12\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0393\31\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0394\7\63",
			"\1\u0395",
			"\1\60\1\u0396\23\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0397\14\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u0398\23\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0399\21\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u039a\27\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u039b\25\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u039c\10\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u039d\25\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u039e\14\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u039f\25\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03a0\25\63",
			"\1\60\24\uffff\15\61\1\u03a1\14\61\6\uffff\32\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\1\u03a2\31\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u03a3\6\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u03a4\31\63",
			"\1\60\24\uffff\1\u03a5\31\61\6\uffff\32\63",
			"\1\60\24\uffff\23\61\1\u03a6\6\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\17\63\1\u03a7\12\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u03a8\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u03a9\31\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\1\u03aa\31\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u03ab\27\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u03ac\16\63",
			"\1\60\24\uffff\32\61\6\uffff\31\63\1\u03ad",
			"\1\60\24\uffff\32\61\6\uffff\1\u03ae\31\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u03af\27\63",
			"\1\60\24\uffff\10\61\1\u03b0\21\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u03b1\22\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u03b2\6\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03b3\25\63",
			"\1\60\24\uffff\32\61\6\uffff\14\63\1\u03b4\15\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\22\63\1\u03b5\7\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u03b6\7\63",
			"\1\60\24\uffff\32\61\6\uffff\1\63\1\u03b7\30\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u03b8\16\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u03b9\7\63",
			"\1\u03ba",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u03bb\22\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u03bc\1\63",
			"\1\60\24\uffff\30\61\1\u03bd\1\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u03be\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u03bf\14\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u03c0\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u03c1\31\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\4\63\1\u03c2\25\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u03c3\13\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u03c5\14\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u03c6\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u03c7\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03c8\25\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u03c9\13\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u03ca\26\63",
			"\1\60\24\uffff\32\61\6\uffff\31\63\1\u03cb",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u03cc\26\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u03cd\6\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u03ce\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03cf\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03d0\25\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u03d2\16\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u03d3\14\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u03d4\23\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u03d5\13\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\22\63\1\u03d6\7\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u03d7\13\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03d8\25\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u03d9\22\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u03da\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03db\25\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u03dc\23\63",
			"\2\62\2\uffff\1\62\22\uffff\1\62\10\uffff\1\62\6\uffff\3\62\1\u03dd"+
			"\1\62\1\u03de\4\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\14"+
			"\62\1\u03df\15\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u03e1\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\16\62\1\u03e0\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u03e2\3\62\1\u03e3\2\62\1\u03e4\5\62\1\u03e5\5\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u03e6\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u03e7\2\62\1\u03e8\16\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u03e9\11\62\1\u03ea\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u03eb\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u03ec\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u03ed"+
			"\15\62\1\u03ee\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u03ef\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u03f0\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u03f1\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\14"+
			"\62\1\u03f2\6\62\1\u03f3\1\u03f4\5\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u03f5\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u03f6\2\62\1\u03f7\1\u03f8\21\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u03f9\7\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03fa\25\63",
			"\1\u03fb\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u03fc\14\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03fd\25\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u03fe\7\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u03ff\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0400\16\63",
			"",
			"\3\62\3\uffff\2\u0177\1\62\1\uffff\12\u032f\1\62\1\u0178\5\uffff\32"+
			"\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\3\62\3\uffff\2\u0401\1\62\1\uffff\12\u0330\1\62\1\u0178\5\uffff\32"+
			"\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\1\u0402\31\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0403\14\63",
			"\1\60\24\uffff\4\61\1\u0404\25\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0405\31\63",
			"\1\60\24\uffff\1\u0406\31\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0407\26\63",
			"\1\60\24\uffff\3\61\1\u0408\26\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0409\6\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u040a\22\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u040b\6\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u040c\7\63",
			"\1\u040d",
			"\3\62\3\uffff\1\u00b4\1\u040e\1\62\1\uffff\12\u0189\1\62\1\u00b4\5\uffff"+
			"\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\u040f\2\uffff\12\u033e",
			"\3\62\3\uffff\1\u00b4\1\u0410\1\62\1\uffff\12\u033f\1\62\1\u00b4\5\uffff"+
			"\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\3\62\3\uffff\3\62\1\uffff\12\u0412\2\62\5\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\u018d\2\uffff\1\u018d\22\uffff\1\u018d\10\uffff\1\u018e\6\uffff\12"+
			"\u0341",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\10\uffff\1\u0191",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\1\u0344\4\uffff\2\u0343\1"+
			"\uffff\1\u0191\2\uffff\2\u0343\1\u0344\13\uffff\2\u0343\3\uffff\1\u0344"+
			"\1\uffff\32\u0343\4\uffff\1\u0343\1\uffff\32\u0343\u1f9e\uffff\1\u0343",
			"\2\u0190\2\uffff\1\u0190\22\uffff\1\u0190\10\uffff\1\u0191",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\4\u00b1\1\u0413\25\u00b1",
			"\1\u034d\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u0414\24\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0415\25\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0416\7\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u0417\5\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0419\13\63",
			"\1\u041a\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u041b\17\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u041c\21\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u041d\22\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u041e\21\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u041f\14\63",
			"\1\u0420",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u0421\23\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0422\31\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0423\26\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0424\6\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0425\21\63",
			"\1\60\24\uffff\6\61\1\u0426\23\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0427\10\63",
			"\1\60\24\uffff\3\61\1\u0428\26\61\6\uffff\32\63",
			"",
			"\1\u035e\10\uffff\1\u0429",
			"\1\u042a",
			"\1\u042c\3\uffff\1\u042b\2\uffff\1\u042d",
			"\1\u042e\14\uffff\1\u042f",
			"\1\u0430",
			"\1\u0431",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0432\10\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0433\10\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0434\16\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0435\16\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0436\3\63\1\u0437\21\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0438\26\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0439\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u043a\25\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u043b\7\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u043c\31\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u043d\7\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u043e\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u043f\31\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0440\22\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0441\6\63",
			"\1\60\24\uffff\15\61\1\u0442\14\61\6\uffff\32\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\1\u0443\31\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0444\14\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0445\16\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0446\21\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0447\26\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0448\10\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u0449\23\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u044a\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u044b\25\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u044c\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\22\63\1\u044d\7\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u044e\13\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u044f\27\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0450\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u0451\23\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0452\7\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0453\13\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0454\25\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0455\22\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0456\25\63",
			"\1\u0457",
			"\1\u0458",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0459\31\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u045a\25\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u045b\13\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u045c\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u045d\23\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u045e\10\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u045f\7\63",
			"\1\60\24\uffff\6\61\1\u0460\23\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0461\14\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0462\21\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\15\61\1\u0463\14\61\6\uffff\32\63",
			"\1\60\24\uffff\30\61\1\u0464\1\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0465\21\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0466\16\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0467\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0468\31\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0469\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u046a\25\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u046b\16\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u046c\25\63",
			"\1\60\24\uffff\1\u046d\31\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u046e\5\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u046f\21\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0470\31\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0471\22\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u0472\5\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0473\25\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0474\22\63",
			"\1\u0475",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u0476\6\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0477\10\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u0478\5\63",
			"",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0479\26\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u047a\14\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u047b\7\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u047c\14\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u047d\13\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\16\63\1\u047e\3"+
			"\63\1\u0247\7\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u047f\13\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0480\13\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0481\14\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0482\10\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0483\14\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u0484\13\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0485\25\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u0486\17\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0487\22\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0488\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0489\14\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u048a\5\63",
			"\2\62\2\uffff\1\62\22\uffff\1\u048b\10\uffff\1\62\6\uffff\12\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u048c\10\uffff\1\62\6\uffff\12\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u048d\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\30"+
			"\62\1\u048e\1\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\1\u048f\1\62\4\uffff\2\62\2"+
			"\uffff\14\62\5\uffff\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0490\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\24"+
			"\62\1\u0491\5\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u0492\10\62\1\u0493\16\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0494\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\6\62"+
			"\1\u0495\23\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0496\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u0497"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0498\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\13"+
			"\62\1\u0499\5\62\1\u049a\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u049b\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\2\62\1\u049c\27\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\62"+
			"\1\u049d\30\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u049e\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u049f\4\62\1\u04a0\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\25"+
			"\62\1\u04a1\4\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\24"+
			"\62\1\u04a2\5\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u04a3\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u04a4"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u04a5\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\30"+
			"\62\1\u04a6\1\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\13"+
			"\62\1\u04a7\16\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u04a8\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u04a9\10\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u04aa\27\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u04ab\31\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u04ac\25\63",
			"\1\60\24\uffff\32\61\6\uffff\25\63\1\u04ad\4\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u04ae\21\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u04af\21\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u04b0\16\63",
			"\1\u04b1",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u04b2\14\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u04b3\23\63",
			"\1\60\24\uffff\21\61\1\u04b4\10\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u04b5\1\63",
			"\1\60\24\uffff\30\61\1\u04b6\1\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u04b7\31\63",
			"\1\60\24\uffff\1\u04b8\31\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\31\63\1\u04b9",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u04ba\21\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u04bb\1\63",
			"\1\u04bc\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"",
			"\1\62\4\uffff\3\62\3\uffff\3\62\1\uffff\12\u04bd\2\62\3\uffff\1\62\1"+
			"\uffff\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\12\u04be",
			"\12\u04bf",
			"",
			"\12\u04c0",
			"\1\u00af\24\uffff\32\u00b0\6\uffff\22\u00b1\1\u04c1\7\u00b1",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u04c2\6\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u04c3\10\63",
			"\2\u04c4\2\uffff\1\u04c4\22\uffff\1\u04c4\50\uffff\1\u00cd",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u04c5\5\63",
			"\3\u024c\1\uffff\1\u024c\1\uffff\1\u024c\1\uffff\2\u034d\3\uffff\3\u024c"+
			"\2\uffff\1\u034d\1\uffff\3\u024c",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u04c6\31\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u04c7\6\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u04c8\26\63",
			"\1\u04c9",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u04ca\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u04cb\31\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u04cc\10\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u04cd\13\63",
			"\1\60\24\uffff\1\u04ce\31\61\6\uffff\32\63",
			"\1\u04d0\15\uffff\1\u04cf",
			"\1\u04d1",
			"\1\u04d2",
			"\1\u04d3",
			"",
			"\1\u04d4",
			"\1\u04d5",
			"\1\u04d6",
			"\1\u04d7",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u04d8\26\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u04d9\26\63",
			"\1\u04da\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u04db\7\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u04dc\1\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u04dd\10\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u04de\22\63",
			"\1\60\24\uffff\32\61\6\uffff\14\63\1\u04df\15\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u04e0\26\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u04e1\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u04e2\31\63",
			"\1\60\24\uffff\6\61\1\u04e3\23\61\6\uffff\32\63",
			"\1\60\24\uffff\30\61\1\u04e4\1\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u04e5\1\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u04e6\7\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u04e7\13\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u04e8\6\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u04e9\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u04ea\5\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u04eb\17\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\22\63\1\u04ec\7\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u04ed\6\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u04ee\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u04ef\31\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u04f0\5\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u04f1",
			"\1\u04f2",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u04f3\14\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u04f4\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u04f5\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u04f6\25\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\22\63\1\u04f7\7\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u04f8\16\63",
			"\1\30\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u03d1\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u04f9\14\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u04fa\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u04fb\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u04fc\31\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u04fd\16\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u04fe\21\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u04ff\26\63",
			"\1\60\24\uffff\23\61\1\u0500\6\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0501\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0502\31\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0503\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u0504\27\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0505\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u0506",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0507\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0508\14\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0509\21\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u050a\25\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u050b\26\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u050c\10\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u050d\17\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u050e\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u050f\26\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u0510\23\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0511\14\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0512\7\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0513\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0514\21\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0515\25\63",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\10\62\1\u0516\21\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\10\62\1\u0517\21\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0518\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\12"+
			"\62\1\u0519\17\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u051a\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\37\uffff\1\62\1\uffff\32\62\u1f9e"+
			"\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u051b\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\14"+
			"\62\1\u051c\15\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\12"+
			"\62\1\u051d\17\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u051e\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\13"+
			"\62\1\u051f\16\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\13"+
			"\62\1\u0520\16\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\13"+
			"\62\1\u0521\16\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0522\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\14"+
			"\62\1\u0523\15\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u0524\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u0525\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u0526\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u0527\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0528\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\6\62"+
			"\1\u0529\23\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u052a\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u052b\27\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u052c"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\6\62"+
			"\1\u052d\23\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u052e\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u052f\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u0530\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u0532\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0533\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0534\25\62\u1f9e\uffff\1\62",
			"\1\60\1\uffff\1\u0535\22\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0536\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0537\25\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0538\31\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0539\16\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\12\u053a",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u053b\1\63",
			"\1\60\24\uffff\30\61\1\u053c\1\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u053d\27\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u053e\10\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"",
			"\1\u040f\2\uffff\12\u053f",
			"\3\62\3\uffff\3\62\1\uffff\12\u04be\2\62\5\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\u00b4\3\uffff\12\u04bf\1\uffff\1\u00b4",
			"\12\u0541",
			"\1\u0542\13\uffff\1\u00af\24\uffff\32\u00b0\6\uffff\32\u00b1",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0543\25\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0544\25\63",
			"",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0545\14\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0546\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0547\31\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0548\16\63",
			"\1\u0549",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u054a\25\63",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u054b\1\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u054c\25\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u054d\5\63",
			"\1\60\24\uffff\30\61\1\u054e\1\61\6\uffff\32\63",
			"\1\u054f",
			"\1\u0550",
			"\1\u0551",
			"\1\u0552",
			"\1\u0553",
			"\1\u0554",
			"\1\u0555",
			"\1\u0556",
			"\1\u0557",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0558\7\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u0559",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u055a\17\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u055b\17\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u055c\14\63",
			"\1\60\24\uffff\32\61\6\uffff\16\63\1\u055d\13\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u055e\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u055f\21\63",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\12\63\1\u0560\17\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0561\31\63",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\1\u0562",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u0563",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0564\1\62\4\uffff\3\62\3\uffff"+
			"\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff\32\61\4\uffff\1\62\1\uffff"+
			"\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0565\21\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0566\7\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0567\14\63",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u0568\16\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0569\31\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\10\61\1\u056a\21\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u056b\26\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u056c\14\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u056d\22\63",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u056e\6\63",
			"\1\u056f",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0570\26\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u0571\27\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\4\63\1\u0572\15"+
			"\63\1\u0247\7\63\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0573\25\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0574\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u0575\31\63",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u0576\7\63",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u0577\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u0578\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u0579\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u057a\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\17\62\1\u057b\12\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u057c"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\62"+
			"\1\u057d\30\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u057e\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u057f\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\30"+
			"\62\1\u0580\1\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u0581\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u0582\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\1"+
			"\62\1\u0583\1\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u0584"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0585\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u0586\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u0587\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\1\u0588\1\62\4\uffff\2\62\2"+
			"\uffff\14\62\5\uffff\32\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u0589"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u058a\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\7\62\1\u058b\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u058c"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\2"+
			"\62\1\u058d\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u058e\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u058f\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0590\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u0591\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0592\25\62\u1f9e\uffff\1\62",
			"\2\62\1\u0596\3\uffff\3\62\1\uffff\14\62\5\uffff\1\u0593\1\u0595\12"+
			"\62\1\u0597\2\62\1\u0594\12\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u0598\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0599\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7"+
			"\62\1\u059a\22\62\u1f9e\uffff\1\62",
			"\1\u008f",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u059b\10\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u059c\14\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u059d\25\63",
			"\3\62\3\uffff\2\u0401\1\62\1\uffff\12\u053a\1\62\1\u0178\5\uffff\32"+
			"\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\24\63\1\u059e\5\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u059f\25\63",
			"\1\u040f\2\uffff\12\u05a0",
			"",
			"\1\u05a1",
			"",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u05a2\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u05a3\26\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u05a4\14\63",
			"\1\60\24\uffff\32\61\6\uffff\1\u05a5\31\63",
			"\1\u05a6",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u05a7\10\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u05a8\26\63",
			"\1\60\24\uffff\32\61\6\uffff\6\63\1\u05a9\23\63",
			"\1\u0418\24\uffff\32\61\6\uffff\32\63",
			"\1\u05aa",
			"\1\u05ab",
			"\1\u05ac",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\1\u05ad",
			"\1\u05ae",
			"\1\u05af",
			"\1\u05b0",
			"\1\u05b1",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u05b2\22\63",
			"\1\u05b3",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u05b4\25\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u05b5\25\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u05b6\14\63",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u05b7\26\63",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u05b8\24\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u05b9\25\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u05ba",
			"\1\u05bb",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\40\uffff\1\u024c\1\u05bc\1"+
			"\u05bf\1\uffff\1\u024c\1\uffff\1\u024c\1\u0363\5\uffff\3\u024c\2\uffff"+
			"\1\u0361\1\uffff\1\u024c\1\u05be\1\u05bd",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u05c0\6\63",
			"\1\60\24\uffff\32\61\6\uffff\2\63\1\u05c1\27\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u05c2\25\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u05c3\14\63",
			"\1\60\24\uffff\16\61\1\u05c4\13\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u05c5\25\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\u05c6",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u05c7\14\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u05c8\10\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u05c9\14\63",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u05ca\25\63",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u05cb\27\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u05cc\27\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u05cd\27\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u05ce\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u05cf\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\17"+
			"\62\1\u05d0\12\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u05d1\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u05d2\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u05d3\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\1"+
			"\62\1\u05d4\1\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u05d5\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\2\62\1\u05d6\27\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u05d7\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u05d8\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u05d9\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u05da\1\62\4\uffff\2\62\1\uffff\1\u0531"+
			"\2\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1"+
			"\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u05db\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\37\uffff\1\62\1\uffff\32\62\u1f9e"+
			"\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u05dc\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\2\62\1\u05dd\27\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u05de"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u05df\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u05e0\10\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\22\62\1\u05e1\7\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u05e2\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u05e3"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\27"+
			"\62\1\u05e4\2\62\u1f9e\uffff\1\62",
			"\1\u05e5",
			"\1\u05e6",
			"\1\u05e7",
			"\2\62\4\uffff\2\62\2\uffff\14\62\5\uffff\14\62\1\u05e8\15\62\4\uffff"+
			"\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\u05e9",
			"\2\62\2\uffff\1\62\22\uffff\1\u05ea\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u05eb"+
			"\31\62\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u05ec\10\63",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u05ed\21\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u05ee\2\uffff\12\u033e",
			"\12\u05ef",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u05f0\14\63",
			"\1\u05f1",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u05f2\22\63",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\1\u05f3",
			"\1\u05f4",
			"\1\u05f5",
			"\1\u05f6",
			"\1\u05f7",
			"\1\u05f8",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u05f9\21\63",
			"\1\u05fa",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\22\63\1\u05fb\7\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\5\63\1\u05fc\24\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u05fd",
			"\1\u05fe",
			"\1\u035e\10\uffff\1\u0429",
			"\1\u024c\7\uffff\1\u024c\5\uffff\1\u042a",
			"\1\u05ff",
			"\1\u042e\3\uffff\1\u024c\10\uffff\1\u042f",
			"\1\60\24\uffff\32\61\6\uffff\30\63\1\u0600\1\63",
			"\1\60\24\uffff\32\61\6\uffff\7\63\1\u0601\22\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0602\10\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\60\24\uffff\15\61\1\u0603\14\61\6\uffff\32\63",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0604\10\63",
			"\1\u0605",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u0606\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u0607\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u0608"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\2\62\1\u0609\27\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u060a\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u060b\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u060c\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\2\62\1\u060d\27\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u060e\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u060f\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u0610\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\21\62\1\u0611\4\62\1\u0612\3\62\4\uffff\1\62\1\uffff\32\62"+
			"\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\21\62\1\u0613\10\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u0614\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u0615\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u0616\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\24"+
			"\62\1\u0617\5\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\1\62\1\u0619\1\62\1\u0618\26\62\4\uffff\1\62\1\uffff\32\62"+
			"\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u061a\27\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u061b\1\62\4\uffff\2\62\1\uffff\1\u0531"+
			"\2\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1"+
			"\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u061c\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\1\u061d",
			"\1\u061e",
			"\1\u061f",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u0620\21\62\u1f9e\uffff\1\62",
			"\1\u0621",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\22\62\1\u0622\7\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u0623\21\62\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\15\63\1\u0624\14\63",
			"\12\u0625",
			"\12\u0626",
			"\1\60\24\uffff\32\61\6\uffff\3\63\1\u0627\26\63",
			"\1\u0628",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\u0629",
			"\1\u062a",
			"\1\u062b",
			"\1\u062c",
			"\1\u062d",
			"\1\u062e",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u062f\10\63",
			"\1\u0630",
			"\2\u042d\2\uffff\1\u042d\22\uffff\1\u042d\13\uffff\1\60\24\uffff\32"+
			"\61\6\uffff\32\63",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\u0631",
			"\1\u0632",
			"\1\u024c\1\uffff\1\u0633",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0634\25\63",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\62\4\uffff\3\62\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1\62\1\uffff"+
			"\32\61\4\uffff\1\62\1\uffff\32\63\u1f9e\uffff\1\62",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u008f",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u0635\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u0636"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u0637\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u0638\1\62\4\uffff\2\62\1\uffff\1\u0531"+
			"\2\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1"+
			"\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u0639"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\22\62\1\u063a\3\62\1\u063b\3\62\4\uffff\1\62\1\uffff\32\62"+
			"\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u063c\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u063d"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u063e\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u063f"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0640\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0641\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u0642\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u0643\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u0644\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\2\62\1\u0645\27\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u0646\26\62\u1f9e\uffff\1\62",
			"\1\u0647",
			"\1\u0648",
			"\1\u0649",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u04a0\7\62\u1f9e\uffff\1\62",
			"\1\u064a",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\17"+
			"\62\1\u064b\12\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u064c\10\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\23\63\1\u064d\6\63",
			"\3\62\3\uffff\3\62\1\uffff\12\u064e\2\62\5\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\12\u064f",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\1\62\4\uffff\3\62\3\uffff\3\62\1\uffff\14\62\3\uffff\1\62\1\uffff\32"+
			"\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\1\u04da",
			"\1\u0650",
			"\1\u0651",
			"\1\u04f5",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\122\uffff\1\u0652",
			"\1\60\24\uffff\32\61\6\uffff\4\63\1\u0653\25\63",
			"\1\u0654",
			"\1\u008f",
			"\1\u0655",
			"\1\u0656",
			"\1\60\24\uffff\32\61\6\uffff\21\63\1\u0657\10\63",
			"\2\62\2\uffff\1\62\22\uffff\1\u0658\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\12"+
			"\62\1\u0659\17\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u065a"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\2\62\1\u065b\17\62\1\u065c\7\62\4\uffff\1\62\1\uffff\32\62"+
			"\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u065d\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u065e\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u065f\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u0660\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0661\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0662\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0663\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0664\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\6\62"+
			"\1\u0665\23\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0666\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0667\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u0668\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\1\u0669",
			"\1\u066a",
			"\1\u066b",
			"\1\u0535",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u066c\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u066d\25\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\13\63\1\u066e\16\63",
			"\3\62\3\uffff\3\62\1\uffff\12\u066f\2\62\5\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\12\u0670",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\1\u008f\13\uffff\1\60\24\uffff\32\61\6\uffff\32\63",
			"\1\u0671",
			"\1\u0672",
			"\1\u0673",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\26\62\1\u0674\3\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0675\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0676\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u0677\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\17"+
			"\62\1\u0678\12\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0679\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u067a\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u067b\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u067c\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u067d\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u067e\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0680\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u067f\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u0681\27\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u0682\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u0683"+
			"\31\62\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0596\3\uffff\3\62\1\uffff\14\62\3\uffff\1\62\1"+
			"\uffff\14\62\1\u0684\15\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\u0685",
			"\1\62\4\uffff\2\62\1\u0596\3\uffff\3\62\1\uffff\14\62\3\uffff\1\62\1"+
			"\uffff\14\62\1\u0684\15\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u0686\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u0687\26\62\u1f9e\uffff\1\62",
			"\1\60\24\uffff\32\61\6\uffff\10\63\1\u0688\21\63",
			"\3\62\3\uffff\3\62\1\uffff\12\u0689\2\62\5\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\3\62\3\uffff\3\62\1\uffff\14\62\5\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\1\u068a",
			"\1\u068b",
			"\1\u068c",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u068d"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u068e\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u068f\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u0690\27\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0691\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u0692\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0693\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u0694\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\1\u0695\31\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u0696\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0680\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\3\62\3\uffff\3\62\1\uffff\14\62\5\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u0697\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u0698"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u0699\6\62\u1f9e\uffff\1\62",
			"\1\u05e9",
			"\1\u069a",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u069b\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0248\3\uffff\1\60\2\62\1\uffff\14\62\3\uffff\1"+
			"\62\1\uffff\14\61\1\u0249\15\61\4\uffff\1\62\1\uffff\22\63\1\u0247\7"+
			"\63\u1f9e\uffff\1\62",
			"\3\62\3\uffff\3\62\1\uffff\12\u04be\2\62\5\uffff\32\62\4\uffff\1\62"+
			"\1\uffff\32\62\u1f9e\uffff\1\62",
			"\1\u069c",
			"\1\u069d",
			"\1\u069e",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u069f\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\1\62\1\u06a0\30\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u06a1\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\12"+
			"\62\1\u06a2\17\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u06a3\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u06a4\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u06a5\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u06a6\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0680\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4"+
			"\62\1\u06a7\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u06a8\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\1\u06a9",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\6\62"+
			"\1\u06aa\23\62\u1f9e\uffff\1\62",
			"\1\u06ab",
			"\1\u06ac",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288\122\uffff\1\u06ad",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u06ae\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u06af"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u06b0\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u06b1\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u06b2\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u06b3"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u06b4\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\22"+
			"\62\1\u06b5\7\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\3\62\1\u06b6\26\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\1\u06b7",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u06b8\25\62\u1f9e\uffff\1\62",
			"\1\u06b9",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0564",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u06ba\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\30"+
			"\62\1\u06bb\1\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u06bc\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\6\62"+
			"\1\u06bd\23\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\1\u06be"+
			"\31\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u06bf\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u06c0\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0680\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\24"+
			"\62\1\u06c1\5\62\u1f9e\uffff\1\62",
			"\1\u06c2",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u06c3\10\62\u1f9e\uffff\1\62",
			"\2\u0288\2\uffff\1\u0288\22\uffff\1\u0288",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u06c4\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u06c5\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u06c6\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\26\62\1\u06c7\3\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\2\62"+
			"\1\u06c8\27\62\u1f9e\uffff\1\62",
			"\1\u06c9",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u06ca\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\21"+
			"\62\1\u06cb\10\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u06cc\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\7\62"+
			"\1\u06cd\22\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\12"+
			"\62\1\u06ce\17\62\u1f9e\uffff\1\62",
			"\1\62\4\uffff\2\62\1\u0596\3\uffff\3\62\1\uffff\14\62\3\uffff\1\62\1"+
			"\uffff\14\62\1\u0684\15\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u06cf\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u06d0\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u06d1\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\u06d2\1\62\4\uffff\2\62\1\uffff\1\62\2"+
			"\uffff\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\3\62"+
			"\1\u06d3\26\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\23"+
			"\62\1\u06d4\6\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\1\62\5\uffff\2\62\4\uffff\2\62\2\uffff\14"+
			"\62\5\uffff\23\62\1\u06d5\6\62\4\uffff\1\62\1\uffff\32\62\u1f9e\uffff"+
			"\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\4\62"+
			"\1\u06d6\25\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\16"+
			"\62\1\u06d7\13\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\13"+
			"\62\1\u06d8\16\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\13"+
			"\62\1\u06d9\16\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\10"+
			"\62\1\u06da\21\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\15"+
			"\62\1\u06db\14\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\62\2\uffff\3"+
			"\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\6\62"+
			"\1\u06dc\23\62\u1f9e\uffff\1\62",
			"\2\62\2\uffff\1\62\22\uffff\2\62\4\uffff\2\62\1\uffff\1\u0531\2\uffff"+
			"\3\62\13\uffff\2\62\3\uffff\1\62\1\uffff\32\62\4\uffff\1\62\1\uffff\32"+
			"\62\u1f9e\uffff\1\62"
	};

	static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
	static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
	static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
	static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
	static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
	static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
	static final short[][] DFA76_transition;

	static {
		int numStates = DFA76_transitionS.length;
		DFA76_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
		}
	}

	class DFA76 extends DFA {

		public DFA76(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 76;
			this.eot = DFA76_eot;
			this.eof = DFA76_eof;
			this.min = DFA76_min;
			this.max = DFA76_max;
			this.accept = DFA76_accept;
			this.special = DFA76_special;
			this.transition = DFA76_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_CLASSIFIER | BREED_NAME | SPECIAL_SUFFIX | RING | GROUP | GROUP_NAME | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY_TITLE | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | PHONE_NUMBER | TIME | FOLLOWING_TIME | DATE | ELLIPSIS | INT | PARENTHETICAL_INT | PARENTHETICAL | HYPHEN | CLUB_INDICATOR | COMMENT | GROUP_ENDING_ANNOUNCEMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA76_201 = input.LA(1);
						 
						int index76_201 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_201 >= '\t' && LA76_201 <= '\n')||LA76_201=='\r'||LA76_201==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_201==',') ) {s = 48;}
						else if ( ((LA76_201 >= 'A' && LA76_201 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_201 >= 'a' && LA76_201 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_201);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA76_117 = input.LA(1);
						 
						int index76_117 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_117 >= '\t' && LA76_117 <= '\n')||LA76_117=='\r'||LA76_117==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_117==',') ) {s = 48;}
						else if ( ((LA76_117 >= 'A' && LA76_117 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_117 >= 'a' && LA76_117 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_117);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA76_44 = input.LA(1);
						 
						int index76_44 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_44 >= '\t' && LA76_44 <= '\n')||LA76_44=='\r'||LA76_44==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_44==',') ) {s = 48;}
						else if ( ((LA76_44 >= 'A' && LA76_44 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_44 >= 'a' && LA76_44 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_44);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA76_410 = input.LA(1);
						 
						int index76_410 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_410 >= '\t' && LA76_410 <= '\n')||LA76_410=='\r'||LA76_410==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_410==',') ) {s = 48;}
						else if ( ((LA76_410 >= 'A' && LA76_410 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_410 >= 'a' && LA76_410 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_410);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA76_41 = input.LA(1);
						 
						int index76_41 = input.index();
						input.rewind();
						s = -1;
						if ( (LA76_41=='S') ) {s = 199;}
						else if ( ((LA76_41 >= '\t' && LA76_41 <= '\n')||LA76_41=='\r'||LA76_41==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_41==',') ) {s = 48;}
						else if ( ((LA76_41 >= 'A' && LA76_41 <= 'R')||(LA76_41 >= 'T' && LA76_41 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_41 >= 'a' && LA76_41 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_41);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA76_42 = input.LA(1);
						 
						int index76_42 = input.index();
						input.rewind();
						s = -1;
						if ( (LA76_42=='s') ) {s = 201;}
						else if ( ((LA76_42 >= '\t' && LA76_42 <= '\n')||LA76_42=='\r'||LA76_42==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_42==',') ) {s = 48;}
						else if ( ((LA76_42 >= 'A' && LA76_42 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_42 >= 'a' && LA76_42 <= 'r')||(LA76_42 >= 't' && LA76_42 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_42);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA76_286 = input.LA(1);
						 
						int index76_286 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_286 >= '\t' && LA76_286 <= '\n')||LA76_286=='\r'||LA76_286==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_286==',') ) {s = 48;}
						else if ( ((LA76_286 >= 'A' && LA76_286 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_286 >= 'a' && LA76_286 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_286);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA76_116 = input.LA(1);
						 
						int index76_116 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_116 >= '\t' && LA76_116 <= '\n')||LA76_116=='\r'||LA76_116==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_116==',') ) {s = 48;}
						else if ( ((LA76_116 >= 'A' && LA76_116 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_116 >= 'a' && LA76_116 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_116);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA76_411 = input.LA(1);
						 
						int index76_411 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_411 >= '\t' && LA76_411 <= '\n')||LA76_411=='\r'||LA76_411==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_411==',') ) {s = 48;}
						else if ( ((LA76_411 >= 'A' && LA76_411 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_411 >= 'a' && LA76_411 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_411);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA76_43 = input.LA(1);
						 
						int index76_43 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_43 >= '\t' && LA76_43 <= '\n')||LA76_43=='\r'||LA76_43==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_43==',') ) {s = 48;}
						else if ( ((LA76_43 >= 'A' && LA76_43 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_43 >= 'a' && LA76_43 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_43);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA76_199 = input.LA(1);
						 
						int index76_199 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA76_199 >= '\t' && LA76_199 <= '\n')||LA76_199=='\r'||LA76_199==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_199==',') ) {s = 48;}
						else if ( ((LA76_199 >= 'A' && LA76_199 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_199 >= 'a' && LA76_199 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_199);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA76_0 = input.LA(1);
						s = -1;
						if ( (LA76_0=='M') ) {s = 1;}
						else if ( (LA76_0=='O') ) {s = 2;}
						else if ( (LA76_0=='N') ) {s = 3;}
						else if ( (LA76_0=='W') ) {s = 4;}
						else if ( (LA76_0=='S') ) {s = 5;}
						else if ( (LA76_0=='B') ) {s = 6;}
						else if ( (LA76_0=='C') ) {s = 7;}
						else if ( (LA76_0=='H') ) {s = 8;}
						else if ( (LA76_0=='V') ) {s = 9;}
						else if ( (LA76_0=='A') ) {s = 10;}
						else if ( (LA76_0=='D') ) {s = 11;}
						else if ( (LA76_0=='E') ) {s = 12;}
						else if ( (LA76_0=='F') ) {s = 13;}
						else if ( (LA76_0=='G') ) {s = 14;}
						else if ( (LA76_0=='I') ) {s = 15;}
						else if ( (LA76_0=='J') ) {s = 16;}
						else if ( (LA76_0=='K') ) {s = 17;}
						else if ( (LA76_0=='L') ) {s = 18;}
						else if ( (LA76_0=='P') ) {s = 19;}
						else if ( (LA76_0=='R') ) {s = 20;}
						else if ( (LA76_0=='T') ) {s = 21;}
						else if ( (LA76_0=='X') ) {s = 22;}
						else if ( (LA76_0=='Y') ) {s = 23;}
						else if ( (LA76_0=='U') ) {s = 25;}
						else if ( (LA76_0=='i') ) {s = 26;}
						else if ( (LA76_0=='1') ) {s = 27;}
						else if ( ((LA76_0 >= '\t' && LA76_0 <= '\n')||LA76_0=='\r'||LA76_0==' ') ) {s = 28;}
						else if ( (LA76_0=='(') ) {s = 29;}
						else if ( (LA76_0=='0'||(LA76_0 >= '2' && LA76_0 <= '9')) ) {s = 30;}
						else if ( (LA76_0=='m') ) {s = 31;}
						else if ( (LA76_0=='.') ) {s = 32;}
						else if ( (LA76_0=='-') ) {s = 33;}
						else if ( (LA76_0=='Q'||LA76_0=='Z') ) {s = 34;}
						else if ( (LA76_0==',') ) {s = 35;}
						else if ( ((LA76_0 >= 'a' && LA76_0 <= 'h')||(LA76_0 >= 'j' && LA76_0 <= 'l')||(LA76_0 >= 'n' && LA76_0 <= 'z')) ) {s = 36;}
						else if ( ((LA76_0 >= '&' && LA76_0 <= '\'')||(LA76_0 >= ':' && LA76_0 <= ';')||LA76_0=='_'||LA76_0=='\u2019') ) {s = 37;}
						else if ( ((LA76_0 >= '\u0000' && LA76_0 <= '\b')||(LA76_0 >= '\u000B' && LA76_0 <= '\f')||(LA76_0 >= '\u000E' && LA76_0 <= '\u001F')||(LA76_0 >= '!' && LA76_0 <= '%')||(LA76_0 >= ')' && LA76_0 <= '+')||LA76_0=='/'||(LA76_0 >= '<' && LA76_0 <= '@')||(LA76_0 >= '[' && LA76_0 <= '^')||LA76_0=='`'||(LA76_0 >= '{' && LA76_0 <= '\u2018')||(LA76_0 >= '\u201A' && LA76_0 <= '\uFFFF')) ) {s = 38;}
						else s = 24;
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA76_285 = input.LA(1);
						 
						int index76_285 = input.index();
						input.rewind();
						s = -1;
						if ( (LA76_285=='l') ) {s = 505;}
						else if ( ((LA76_285 >= '\t' && LA76_285 <= '\n')||LA76_285=='\r'||LA76_285==' ') && ((allowJudge))) {s = 200;}
						else if ( (LA76_285==',') ) {s = 48;}
						else if ( ((LA76_285 >= 'A' && LA76_285 <= 'Z')) ) {s = 49;}
						else if ( ((LA76_285 >= 'a' && LA76_285 <= 'k')||(LA76_285 >= 'm' && LA76_285 <= 'z')) ) {s = 51;}
						else s = 50;
						 
						input.seek(index76_285);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 76, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
