// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2014-01-18 10:26:55

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
	public static final int COMMENT=9;
	public static final int DATE=10;
	public static final int ELLIPSIS=11;
	public static final int END_PUNCTUATION=12;
	public static final int END_WORD=13;
	public static final int FOLLOWING_TIME=14;
	public static final int FRAG_BEST_IN_SHOW=15;
	public static final int FRAG_BREED_ATTRIBUTE=16;
	public static final int FRAG_BREED_NAME_ALT=17;
	public static final int FRAG_BREED_NAME_CATEGORY=18;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=19;
	public static final int FRAG_BREED_NAME_SINGLE=20;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=21;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP=22;
	public static final int FRAG_GROUP_NAME=23;
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
	public static final int GROUP_ENDING_ANNOUNCEMENT=40;
	public static final int GROUP_NAME=41;
	public static final int GROUP_RING=42;
	public static final int INT=43;
	public static final int JUDGE_NAME=44;
	public static final int JUNIOR_CLASS=45;
	public static final int NON_CONFORMATION_CLASS_LEVEL=46;
	public static final int NON_CONFORMATION_CLASS_NAME=47;
	public static final int NON_CONFORMATION_CLASS_SECTION=48;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=49;
	public static final int NON_CONFORMATION_SECOND_LINE=50;
	public static final int NON_CONF_SECOND_LINE_COMMENT=51;
	public static final int PARENTHETICAL=52;
	public static final int PARENTHETICAL_INT=53;
	public static final int PARENTHETICAL_NAME=54;
	public static final int PHONE_NUMBER=55;
	public static final int RALLY_CLASS=56;
	public static final int RALLY_ENTRY=57;
	public static final int RING_TITLE=58;
	public static final int SPECIAL_SUFFIX=59;
	public static final int STANDALONE_COMMENT=60;
	public static final int TIME=61;
	public static final int WORD=62;
	public static final int WS=63;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:516:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:516:9: 'Master Class'
					{
					match("Master Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:517:9: 'Open Senior'
					{
					match("Open Senior"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:518:9: 'Open Intermediate'
					{
					match("Open Intermediate"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:519:9: 'Open Junior'
					{
					match("Open Junior"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:520:9: 'Novice Senior'
					{
					match("Novice Senior"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:521:9: 'Novice Junior'
					{
					match("Novice Junior"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:522:9: 'Novice Intermediate'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:5: ( ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell�Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'L�wchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vend�en' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell�Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'L�wchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vend�en' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell�Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'L�wchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vend�en' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=198;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:28: 'Affenpinscher'
					{
					match("Affenpinscher"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:516:5: 'Afghan Hound'
					{
					match("Afghan Hound"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:517:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:518:5: 'Akita'
					{
					match("Akita"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:519:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:520:5: 'American English Coonhound'
					{
					match("American English Coonhound"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:521:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:522:5: 'American Foxhound'
					{
					match("American Foxhound"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:523:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:525:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:526:2: 'Appenzeller Sennenhunde'
					{
					match("Appenzeller Sennenhunde"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:527:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:528:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:529:5: 'Australian Terrier'
					{
					match("Australian Terrier"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:530:5: 'Basenji'
					{
					match("Basenji"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:531:5: 'Basset Hound'
					{
					match("Basset Hound"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:532:5: 'Beagle'
					{
					match("Beagle"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:533:5: 'Bearded Collie'
					{
					match("Bearded Collie"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:534:5: 'Beauceron'
					{
					match("Beauceron"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:535:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:536:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:538:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:539:5: 'Berger Picard'
					{
					match("Berger Picard"); if (state.failed) return ;

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:540:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:541:5: 'Bichon Frise'
					{
					match("Bichon Frise"); if (state.failed) return ;

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:542:5: 'Bichons Frise'
					{
					match("Bichons Frise"); if (state.failed) return ;

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:543:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); if (state.failed) return ;

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:544:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); if (state.failed) return ;

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:545:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); if (state.failed) return ;

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:546:5: 'Bloodhound'
					{
					match("Bloodhound"); if (state.failed) return ;

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:547:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); if (state.failed) return ;

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:548:5: 'Border Collie'
					{
					match("Border Collie"); if (state.failed) return ;

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:549:5: 'Border Terrier'
					{
					match("Border Terrier"); if (state.failed) return ;

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:550:5: 'Borzoi'
					{
					match("Borzoi"); if (state.failed) return ;

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:551:5: 'Boston Terrier'
					{
					match("Boston Terrier"); if (state.failed) return ;

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:552:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); if (state.failed) return ;

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:553:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); if (state.failed) return ;

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:554:5: 'Boxer'
					{
					match("Boxer"); if (state.failed) return ;

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:555:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); if (state.failed) return ;

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:556:5: 'Briard'
					{
					match("Briard"); if (state.failed) return ;

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:557:5: 'Brittany'
					{
					match("Brittany"); if (state.failed) return ;

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:558:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); if (state.failed) return ;

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:559:5: 'Bull Terrier'
					{
					match("Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:560:5: 'Bulldog'
					{
					match("Bulldog"); if (state.failed) return ;

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:561:5: 'Bullmastiff'
					{
					match("Bullmastiff"); if (state.failed) return ;

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:562:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); if (state.failed) return ;

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:5: 'Canaan Dog'
					{
					match("Canaan Dog"); if (state.failed) return ;

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:564:5: 'Cane Corso'
					{
					match("Cane Corso"); if (state.failed) return ;

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:565:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); if (state.failed) return ;

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); if (state.failed) return ;

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:567:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); if (state.failed) return ;

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:568:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); if (state.failed) return ;

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:5: 'Chihuahua'
					{
					match("Chihuahua"); if (state.failed) return ;

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:570:5: 'Chinese Crested'
					{
					match("Chinese Crested"); if (state.failed) return ;

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:571:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); if (state.failed) return ;

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:572:5: 'Cirneco dell�Etna'
					{
					match("Cirneco dell�Etna"); if (state.failed) return ;

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:573:5: 'Chow Chow'
					{
					match("Chow Chow"); if (state.failed) return ;

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:574:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); if (state.failed) return ;

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); if (state.failed) return ;

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:576:5: 'Collie'
					{
					match("Collie"); if (state.failed) return ;

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:577:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); if (state.failed) return ;

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:578:5: 'Dachshund'
					{
					match("Dachshund"); if (state.failed) return ;

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:579:5: 'Dalmatian'
					{
					match("Dalmatian"); if (state.failed) return ;

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:580:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); if (state.failed) return ;

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:581:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); if (state.failed) return ;

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:5: 'Dogo Argentine'
					{
					match("Dogo Argentine"); if (state.failed) return ;

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:583:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); if (state.failed) return ;

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:584:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); if (state.failed) return ;

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); if (state.failed) return ;

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:586:5: 'English Foxhound'
					{
					match("English Foxhound"); if (state.failed) return ;

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:587:5: 'English Setter'
					{
					match("English Setter"); if (state.failed) return ;

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:588:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); if (state.failed) return ;

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); if (state.failed) return ;

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:590:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:591:5: 'Field Spaniel'
					{
					match("Field Spaniel"); if (state.failed) return ;

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:592:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); if (state.failed) return ;

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); if (state.failed) return ;

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:594:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); if (state.failed) return ;

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:595:5: 'Fox Terrier'
					{
					match("Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:5: 'French Bulldog'
					{
					match("French Bulldog"); if (state.failed) return ;

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:597:5: 'German Pinscher'
					{
					match("German Pinscher"); if (state.failed) return ;

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:598:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); if (state.failed) return ;

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:599:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); if (state.failed) return ;

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); if (state.failed) return ;

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); if (state.failed) return ;

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:602:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); if (state.failed) return ;

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:5: 'Golden Retriever'
					{
					match("Golden Retriever"); if (state.failed) return ;

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:5: 'Gordon Setter'
					{
					match("Gordon Setter"); if (state.failed) return ;

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:5: 'Great Dane'
					{
					match("Great Dane"); if (state.failed) return ;

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); if (state.failed) return ;

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:5: 'Greyhound'
					{
					match("Greyhound"); if (state.failed) return ;

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:609:5: 'Harrier'
					{
					match("Harrier"); if (state.failed) return ;

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:5: 'Havanese'
					{
					match("Havanese"); if (state.failed) return ;

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); if (state.failed) return ;

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); if (state.failed) return ;

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:613:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); if (state.failed) return ;

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:614:5: 'Irish Setter'
					{
					match("Irish Setter"); if (state.failed) return ;

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:5: 'Irish Terrier'
					{
					match("Irish Terrier"); if (state.failed) return ;

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:616:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); if (state.failed) return ;

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:617:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); if (state.failed) return ;

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); if (state.failed) return ;

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:619:5: 'Japanese Chin'
					{
					match("Japanese Chin"); if (state.failed) return ;

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:620:5: 'Keeshond'
					{
					match("Keeshond"); if (state.failed) return ;

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:621:5: 'Keeshonden'
					{
					match("Keeshonden"); if (state.failed) return ;

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); if (state.failed) return ;

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:623:5: 'Komondor'
					{
					match("Komondor"); if (state.failed) return ;

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:624:5: 'Kuvasz'
					{
					match("Kuvasz"); if (state.failed) return ;

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:5: 'Kuvaszok'
					{
					match("Kuvaszok"); if (state.failed) return ;

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:626:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); if (state.failed) return ;

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:627:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); if (state.failed) return ;

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); if (state.failed) return ;

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:5: 'Leonberger'
					{
					match("Leonberger"); if (state.failed) return ;

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); if (state.failed) return ;

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:631:5: 'L�wchen'
					{
					match("L�wchen"); if (state.failed) return ;

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:632:5: 'Lowchen'
					{
					match("Lowchen"); if (state.failed) return ;

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:5: 'Maltese'
					{
					match("Maltese"); if (state.failed) return ;

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:634:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); if (state.failed) return ;

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:5: 'Mastiff'
					{
					match("Mastiff"); if (state.failed) return ;

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); if (state.failed) return ;

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:637:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:638:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); if (state.failed) return ;

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:639:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); if (state.failed) return ;

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:640:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); if (state.failed) return ;

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:641:5: 'Newfoundland'
					{
					match("Newfoundland"); if (state.failed) return ;

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:642:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); if (state.failed) return ;

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:643:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); if (state.failed) return ;

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:644:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); if (state.failed) return ;

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:645:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); if (state.failed) return ;

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:646:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); if (state.failed) return ;

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:647:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); if (state.failed) return ;

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:648:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); if (state.failed) return ;

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:5: 'Otterhound'
					{
					match("Otterhound"); if (state.failed) return ;

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:650:5: 'Papillon'
					{
					match("Papillon"); if (state.failed) return ;

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:651:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); if (state.failed) return ;

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:652:5: 'Pekingese'
					{
					match("Pekingese"); if (state.failed) return ;

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:653:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); if (state.failed) return ;

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:5: 'Petit Basset Griffon Vend�en'
					{
					match("Petit Basset Griffon Vend�en"); if (state.failed) return ;

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); if (state.failed) return ;

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:656:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); if (state.failed) return ;

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:5: 'Plott'
					{
					match("Plott"); if (state.failed) return ;

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:658:5: 'Pointer'
					{
					match("Pointer"); if (state.failed) return ;

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); if (state.failed) return ;

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:5: 'Pomeranian'
					{
					match("Pomeranian"); if (state.failed) return ;

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:661:5: 'Poodle'
					{
					match("Poodle"); if (state.failed) return ;

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:5: 'Portuguese Podengo'
					{
					match("Portuguese Podengo"); if (state.failed) return ;

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); if (state.failed) return ;

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:664:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); if (state.failed) return ;

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:5: 'Pug'
					{
					match("Pug"); if (state.failed) return ;

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:5: 'Puli'
					{
					match("Puli"); if (state.failed) return ;

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:667:5: 'Pulik'
					{
					match("Pulik"); if (state.failed) return ;

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); if (state.failed) return ;

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:5: 'Rat Terrier'
					{
					match("Rat Terrier"); if (state.failed) return ;

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:670:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); if (state.failed) return ;

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:671:5: 'Retrievers'
					{
					match("Retrievers"); if (state.failed) return ;

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); if (state.failed) return ;

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:673:5: 'Rottweiler'
					{
					match("Rottweiler"); if (state.failed) return ;

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:5: 'Russell Terrier'
					{
					match("Russell Terrier"); if (state.failed) return ;

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:5: 'Saint Bernard'
					{
					match("Saint Bernard"); if (state.failed) return ;

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:676:5: 'Saluki'
					{
					match("Saluki"); if (state.failed) return ;

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:5: 'Samoyed'
					{
					match("Samoyed"); if (state.failed) return ;

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:5: 'Schipperke'
					{
					match("Schipperke"); if (state.failed) return ;

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); if (state.failed) return ;

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); if (state.failed) return ;

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:681:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); if (state.failed) return ;

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:682:5: 'Setters'
					{
					match("Setters"); if (state.failed) return ;

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); if (state.failed) return ;

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:684:5: 'Shiba Inu'
					{
					match("Shiba Inu"); if (state.failed) return ;

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:685:5: 'Shih Tzu'
					{
					match("Shih Tzu"); if (state.failed) return ;

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:686:5: 'Siberian Husky'
					{
					match("Siberian Husky"); if (state.failed) return ;

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:687:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); if (state.failed) return ;

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:688:5: 'Silky Terrier'
					{
					match("Silky Terrier"); if (state.failed) return ;

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:689:5: 'Skye Terrier'
					{
					match("Skye Terrier"); if (state.failed) return ;

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:690:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); if (state.failed) return ;

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:691:5: 'Spaniels'
					{
					match("Spaniels"); if (state.failed) return ;

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:692:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); if (state.failed) return ;

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:693:5: 'Spinoni Italiani'
					{
					match("Spinoni Italiani"); if (state.failed) return ;

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:694:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:695:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); if (state.failed) return ;

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:696:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); if (state.failed) return ;

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:697:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); if (state.failed) return ;

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:698:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); if (state.failed) return ;

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:699:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); if (state.failed) return ;

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:700:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); if (state.failed) return ;

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:701:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:702:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); if (state.failed) return ;

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:703:5: 'Vizsla'
					{
					match("Vizsla"); if (state.failed) return ;

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:704:5: 'Weimaraner'
					{
					match("Weimaraner"); if (state.failed) return ;

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:705:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); if (state.failed) return ;

					}
					break;
				case 191 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:706:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); if (state.failed) return ;

					}
					break;
				case 192 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:707:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); if (state.failed) return ;

					}
					break;
				case 193 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:708:5: 'Whippet'
					{
					match("Whippet"); if (state.failed) return ;

					}
					break;
				case 194 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:709:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 195 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:710:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); if (state.failed) return ;

					}
					break;
				case 196 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:711:2: 'Wirehaired Vizsla'
					{
					match("Wirehaired Vizsla"); if (state.failed) return ;

					}
					break;
				case 197 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:712:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); if (state.failed) return ;

					}
					break;
				case 198 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:713:5: 'Yorkshire Terrier'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:716:2: ( ( FRAG_BREED_NAME_ALT ( 's' )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:716:4: ( FRAG_BREED_NAME_ALT ( 's' )? )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:716:4: ( FRAG_BREED_NAME_ALT ( 's' )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:716:5: FRAG_BREED_NAME_ALT ( 's' )?
			{
			mFRAG_BREED_NAME_ALT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:716:25: ( 's' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='s') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:716:25: 's'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:5: ( ( FRAG_BREED_NAME_SINGLE ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:7: ( FRAG_BREED_NAME_SINGLE ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:7: ( FRAG_BREED_NAME_SINGLE )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:8: FRAG_BREED_NAME_SINGLE
			{
			mFRAG_BREED_NAME_SINGLE(); if (state.failed) return ;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:32: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:32: 's'
					{
					match('s'); if (state.failed) return ;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:37: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:37: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:41: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:42: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); if (state.failed) return ;
					mFRAG_BREED_NAME_CATEGORY(); if (state.failed) return ;

					match(')'); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:75: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:75: WS
							{
							mWS(); if (state.failed) return ;

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:79: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:79: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:115: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='('||LA9_0=='M') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:719:115: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:722:4: ( FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:722:8: FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:725:5: ( ( '(' BREED_MISC ')' ) | BREED_MISC )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:725:9: ( '(' BREED_MISC ')' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:725:9: ( '(' BREED_MISC ')' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:725:10: '(' BREED_MISC ')'
					{
					match('('); if (state.failed) return ;
					mBREED_MISC(); if (state.failed) return ;

					match(')'); if (state.failed) return ;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:725:28: BREED_MISC
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:727:2: ( ( FRAG_BREED_ATTRIBUTE WS )* FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:727:4: ( FRAG_BREED_ATTRIBUTE WS )* FRAG_BREED_NAME_SPECIAL_SUFFIX
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:727:4: ( FRAG_BREED_ATTRIBUTE WS )*
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:727:5: FRAG_BREED_ATTRIBUTE WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:730:2: ( 'Misc. Dog' | 'Misc. Dogs' | 'Misc. Bitch' | 'Misc. Bitches' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:730:2: 'Misc. Dog'
					{
					match("Misc. Dog"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:730:14: 'Misc. Dogs'
					{
					match("Misc. Dogs"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:730:27: 'Misc. Bitch'
					{
					match("Misc. Bitch"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:730:41: 'Misc. Bitches'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:732:2: ( 'Dog' | 'Bitche' | 'Bitch' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:732:4: 'Dog'
					{
					match("Dog"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:732:10: 'Bitche'
					{
					match("Bitche"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:732:19: 'Bitch'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:2: ( 'Working' | 'Stud' | 'Brood' | 'Brace' | 'Champion' | 'Cut-Down' | 'Hunting Retriever' | 'Special Attraction' | 'Veteran' ( 's' )? )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:4: 'Working'
					{
					match("Working"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:14: 'Stud'
					{
					match("Stud"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:21: 'Brood'
					{
					match("Brood"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:29: 'Brace'
					{
					match("Brace"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:37: 'Champion'
					{
					match("Champion"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:48: 'Cut-Down'
					{
					match("Cut-Down"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:59: 'Hunting Retriever'
					{
					match("Hunting Retriever"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:79: 'Special Attraction'
					{
					match("Special Attraction"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:100: 'Veteran' ( 's' )?
					{
					match("Veteran"); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:109: ( 's' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='s') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:734:109: 's'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:736:5: ( 'Sweepstakes' WS ( 'e' | 'E' ) ( 'ntry' | 'ntries' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:736:9: 'Sweepstakes' WS ( 'e' | 'E' ) ( 'ntry' | 'ntries' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:736:36: ( 'ntry' | 'ntries' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:736:37: 'ntry'
					{
					match("ntry"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:736:44: 'ntries'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:737:29: ( ( FRAG_BREED_ATTRIBUTE WS )+ ( FRAG_SEX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:737:33: ( FRAG_BREED_ATTRIBUTE WS )+ ( FRAG_SEX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:737:33: ( FRAG_BREED_ATTRIBUTE WS )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:737:34: FRAG_BREED_ATTRIBUTE WS
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

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:737:60: ( FRAG_SEX )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='B'||LA18_0=='D') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:737:60: FRAG_SEX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:739:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:739:9: 'Ascob'
					{
					match("Ascob"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:739:17: 'Parti-Color'
					{
					match("Parti-Color"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:739:31: 'Black'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:741:5: ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt20=38;
			alt20 = dfa20.predict(input);
			switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:742:9: '13 Inch'
					{
					match("13 Inch"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:743:9: '15 Inch'
					{
					match("15 Inch"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:744:9: 'American Water'
					{
					match("American Water"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:745:9: 'Boykin'
					{
					match("Boykin"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:746:9: 'B & P C'
					{
					match("B & P C"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:747:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:748:9: 'Clumber'
					{
					match("Clumber"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:749:9: 'Cocker'
					{
					match("Cocker"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:750:9: 'Colored'
					{
					match("Colored"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:751:9: 'Curly-Coated'
					{
					match("Curly-Coated"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:752:9: 'English'
					{
					match("English"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:753:9: 'English Cocker'
					{
					match("English Cocker"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:754:9: 'English Springer'
					{
					match("English Springer"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:755:9: 'Field'
					{
					match("Field"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:756:9: 'Flat-Coated'
					{
					match("Flat-Coated"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:757:9: 'German Shorthaired'
					{
					match("German Shorthaired"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:758:9: 'German Wirehaired'
					{
					match("German Wirehaired"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:759:9: 'Golden'
					{
					match("Golden"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:760:9: 'Gordon'
					{
					match("Gordon"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:761:9: 'Irish'
					{
					match("Irish"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:762:2: 'Irish Red And White'
					{
					match("Irish Red And White"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:763:9: 'Irish Water'
					{
					match("Irish Water"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:764:9: 'K C & R'
					{
					match("K C & R"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:765:9: 'Labrador'
					{
					match("Labrador"); if (state.failed) return ;

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:766:9: 'Long Coat'
					{
					match("Long Coat"); if (state.failed) return ;

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:767:9: 'Longhaired'
					{
					match("Longhaired"); if (state.failed) return ;

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:768:9: 'Miniature'
					{
					match("Miniature"); if (state.failed) return ;

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:769:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); if (state.failed) return ;

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:770:9: 'Rough'
					{
					match("Rough"); if (state.failed) return ;

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:771:9: 'Smooth'
					{
					match("Smooth"); if (state.failed) return ;

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:772:9: 'Smooth Coat'
					{
					match("Smooth Coat"); if (state.failed) return ;

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:773:9: 'Standard'
					{
					match("Standard"); if (state.failed) return ;

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:774:9: 'Sussex'
					{
					match("Sussex"); if (state.failed) return ;

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:775:9: 'Toy'
					{
					match("Toy"); if (state.failed) return ;

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:776:9: 'Welsh Springer'
					{
					match("Welsh Springer"); if (state.failed) return ;

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:777:9: 'White'
					{
					match("White"); if (state.failed) return ;

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:778:9: 'Wire'
					{
					match("Wire"); if (state.failed) return ;

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:779:9: 'Wirehaired'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:20: ( 'TOY' | 'HERDING' | 'TERRIER' | 'NON-SPORTING' | 'SPORTING' | 'HOUND' | 'WORKING' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:22: 'TOY'
					{
					match("TOY"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:28: 'HERDING'
					{
					match("HERDING"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:38: 'TERRIER'
					{
					match("TERRIER"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:48: 'NON-SPORTING'
					{
					match("NON-SPORTING"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:63: 'SPORTING'
					{
					match("SPORTING"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:74: 'HOUND'
					{
					match("HOUND"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:785:82: 'WORKING'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:787:2: ( 'BEST IN SHOW' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:787:4: 'BEST IN SHOW'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:790:2: ( ( GROUP_NAME ( ' GROUP' )=> ' GROUP' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:790:3: ( GROUP_NAME ( ' GROUP' )=> ' GROUP' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:790:3: ( GROUP_NAME ( ' GROUP' )=> ' GROUP' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:790:4: GROUP_NAME ( ' GROUP' )=> ' GROUP'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:793:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
			int alt22=4;
			switch ( input.LA(1) ) {
			case 'V':
				{
				alt22=1;
				}
				break;
			case 'S':
				{
				alt22=2;
				}
				break;
			case 'R':
				{
				alt22=3;
				}
				break;
			case 'T':
				{
				alt22=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:794:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:795:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:796:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:797:3: 'Toy Variety Group'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:800:2: ( FRAG_GROUP_NAME | FRAG_SPECIAL_GROUP_NAME | FRAG_BEST_IN_SHOW )
			int alt23=3;
			switch ( input.LA(1) ) {
			case 'T':
				{
				int LA23_1 = input.LA(2);
				if ( (LA23_1=='E'||LA23_1=='O') ) {
					alt23=1;
				}
				else if ( (LA23_1=='o') ) {
					alt23=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
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
				alt23=1;
				}
				break;
			case 'S':
				{
				int LA23_3 = input.LA(2);
				if ( (LA23_3=='P') ) {
					alt23=1;
				}
				else if ( (LA23_3=='W') ) {
					alt23=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 3, input);
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
				alt23=2;
				}
				break;
			case 'B':
				{
				alt23=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:800:4: FRAG_GROUP_NAME
					{
					mFRAG_GROUP_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:800:20: FRAG_SPECIAL_GROUP_NAME
					{
					mFRAG_SPECIAL_GROUP_NAME(); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:800:44: FRAG_BEST_IN_SHOW
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:818:29: ( ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:2: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:2: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:3: NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			{
			mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:32: ( ' ' NON_CONFORMATION_CLASS_LEVEL )*
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:33: ' ' NON_CONFORMATION_CLASS_LEVEL
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

					}
					break;

				default :
					break loop24;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:67: ( ' ' NON_CONFORMATION_CLASS_SECTION )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:68: ' ' NON_CONFORMATION_CLASS_SECTION
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_SECTION(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:104: ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==' ') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:819:105: ' ' NON_CONFORMATION_CLASS_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:838:2: ( ( 'A' | 'B' ) )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:840:2: ( 'Class' | 'Walkthrough' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:840:4: 'Class'
					{
					match("Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:840:12: 'Walkthrough'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:842:2: ( 'Advanced' | 'Beginner' | 'Excellent' | 'Utility' | 'Pre' | 'Open' | 'Novice' | 'Wild Card' | ( 'Pair' ( 's' )? ) | 'Graduate' | 'Walkthrough' | 'Versatility' | 'Veterans' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:843:2: 'Advanced'
					{
					match("Advanced"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:844:2: 'Beginner'
					{
					match("Beginner"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:845:2: 'Excellent'
					{
					match("Excellent"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:846:2: 'Utility'
					{
					match("Utility"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:847:2: 'Pre'
					{
					match("Pre"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:848:2: 'Open'
					{
					match("Open"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:849:2: 'Novice'
					{
					match("Novice"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:850:2: 'Wild Card'
					{
					match("Wild Card"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:851:2: ( 'Pair' ( 's' )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:851:2: ( 'Pair' ( 's' )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:851:3: 'Pair' ( 's' )?
					{
					match("Pair"); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:851:9: ( 's' )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0=='s') ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:851:9: 's'
							{
							match('s'); if (state.failed) return ;
							}
							break;

					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:852:2: 'Graduate'
					{
					match("Graduate"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:853:2: 'Walkthrough'
					{
					match("Walkthrough"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:854:2: 'Versatility'
					{
					match("Versatility"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:855:3: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:859:2: ( FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:860:3: FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			{
			mFRAG_TO_FOLLOW(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:860:21: ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:860:22: NON_CONFORMATION_CLASS_NAME
					{
					mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:860:50: RALLY_CLASS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:862:2: ( 'To follow' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:862:4: 'To follow'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:864:2: ( FRAG_RALLY_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:864:4: FRAG_RALLY_CLASS_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:866:2: ( 'Rally ' NON_CONFORMATION_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:866:4: 'Rally ' NON_CONFORMATION_CLASS_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:868:2: ( 'Walkthrough' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:868:4: 'Walkthrough'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:870:2: ( ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:870:4: ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:870:4: ( 'inch: ' )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='i') ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:870:4: 'inch: '
					{
					match("inch: "); if (state.failed) return ;

					}
					break;

			}

			mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:870:39: ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==';') ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:870:40: ';' FRAG_RALLY_ENTRANT_GROUP
					{
					match(';'); if (state.failed) return ;
					mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

					}
					break;

				default :
					break loop32;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:29: ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) )
			int alt42=2;
			alt42 = dfa42.predict(input);
			switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:31: ( '0' .. '9' )+ '-' ( '0' .. '9' )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:31: ( '0' .. '9' )+
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

					match('-'); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:43: ( '0' .. '9' )+
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

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:55: ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:55: ( '0' .. '9' )+
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:64: ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					int cnt41=0;
					loop41:
					do {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0=='-'||LA41_0==';') ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:65: ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:65: ( '-' ( '0' .. '9' )+ )?
							int alt37=2;
							int LA37_0 = input.LA(1);
							if ( (LA37_0=='-') ) {
								alt37=1;
							}
							switch (alt37) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:66: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:69: ( '0' .. '9' )+
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
											if ( cnt36 >= 1 ) break loop36;
											if (state.backtracking>0) {state.failed=true; return ;}
												EarlyExitException eee =
													new EarlyExitException(36, input);
												throw eee;
										}
										cnt36++;
									} while (true);

									}
									break;

							}

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:80: ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:81: ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )?
							{
							match(';'); if (state.failed) return ;
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:84: ( '0' .. '9' )+
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

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:93: ( '-' ( '0' .. '9' )+ )?
							int alt40=2;
							int LA40_0 = input.LA(1);
							if ( (LA40_0=='-') ) {
								int LA40_1 = input.LA(2);
								if ( ((LA40_1 >= '0' && LA40_1 <= '9')) ) {
									alt40=1;
								}
							}
							switch (alt40) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:94: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:878:97: ( '0' .. '9' )+
									int cnt39=0;
									loop39:
									do {
										int alt39=2;
										int LA39_0 = input.LA(1);
										if ( ((LA39_0 >= '0' && LA39_0 <= '9')) ) {
											alt39=1;
										}

										switch (alt39) {
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
											if ( cnt39 >= 1 ) break loop39;
											if (state.backtracking>0) {state.failed=true; return ;}
												EarlyExitException eee =
													new EarlyExitException(39, input);
												throw eee;
										}
										cnt39++;
									} while (true);

									}
									break;

							}

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:881:2: ( 'R' ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:881:4: 'R' ( '0' .. '9' )+
			{
			match('R'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:881:7: ( '0' .. '9' )+
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
					if ( cnt43 >= 1 ) break loop43;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(43, input);
						throw eee;
				}
				cnt43++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:882:34: ( FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:883:2: FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			{
			mFRAG_RALLY_SINGLE_ENTRANT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:883:28: ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			loop44:
			do {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( ((LA44_0 >= ',' && LA44_0 <= '-')) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:883:29: ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT
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
					break loop44;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:886:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt45=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt45=1;
					}
					break;
				case 'A':
					{
					alt45=2;
					}
					break;
				case 'u':
					{
					int LA45_11 = input.LA(3);
					if ( (LA45_11=='n') ) {
						alt45=11;
					}
					else if ( (LA45_11=='l') ) {
						alt45=13;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 45, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'U':
					{
					int LA45_12 = input.LA(3);
					if ( (LA45_12=='N') ) {
						alt45=12;
					}
					else if ( (LA45_12=='L') ) {
						alt45=14;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 45, 12, input);
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
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA45_2 = input.LA(2);
				if ( (LA45_2=='e') ) {
					alt45=3;
				}
				else if ( (LA45_2=='E') ) {
					alt45=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA45_3 = input.LA(2);
				if ( (LA45_3=='a') ) {
					int LA45_15 = input.LA(3);
					if ( (LA45_15=='r') ) {
						alt45=5;
					}
					else if ( (LA45_15=='y') ) {
						alt45=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 45, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA45_3=='A') ) {
					int LA45_16 = input.LA(3);
					if ( (LA45_16=='R') ) {
						alt45=6;
					}
					else if ( (LA45_16=='Y') ) {
						alt45=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 45, 16, input);
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
							new NoViableAltException("", 45, 3, input);
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
					alt45=7;
					}
					break;
				case 'P':
					{
					alt45=8;
					}
					break;
				case 'u':
					{
					alt45=15;
					}
					break;
				case 'U':
					{
					alt45=16;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA45_5 = input.LA(2);
				if ( (LA45_5=='e') ) {
					alt45=17;
				}
				else if ( (LA45_5=='E') ) {
					alt45=18;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				int LA45_6 = input.LA(2);
				if ( (LA45_6=='c') ) {
					alt45=19;
				}
				else if ( (LA45_6=='C') ) {
					alt45=20;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA45_7 = input.LA(2);
				if ( (LA45_7=='o') ) {
					alt45=21;
				}
				else if ( (LA45_7=='O') ) {
					alt45=22;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA45_8 = input.LA(2);
				if ( (LA45_8=='e') ) {
					alt45=23;
				}
				else if ( (LA45_8=='E') ) {
					alt45=24;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 8, input);
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
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:886:27: 'January'
					{
					match("January"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:886:37: 'JANUARY'
					{
					match("JANUARY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:887:14: 'February'
					{
					match("February"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:887:25: 'FEBRUARY'
					{
					match("FEBRUARY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:888:14: 'March'
					{
					match("March"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:888:22: 'MARCH'
					{
					match("MARCH"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:889:14: 'April'
					{
					match("April"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:889:22: 'APRIL'
					{
					match("APRIL"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:890:14: 'May'
					{
					match("May"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:890:20: 'MAY'
					{
					match("MAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:891:14: 'June'
					{
					match("June"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:891:21: 'JUNE'
					{
					match("JUNE"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:892:14: 'July'
					{
					match("July"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:892:21: 'JULY'
					{
					match("JULY"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:893:14: 'August'
					{
					match("August"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:893:23: 'AUGUST'
					{
					match("AUGUST"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:894:14: 'September'
					{
					match("September"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:894:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:895:14: 'October'
					{
					match("October"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:895:24: 'OCTOBER'
					{
					match("OCTOBER"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:896:14: 'November'
					{
					match("November"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:896:25: 'NOVEMBER'
					{
					match("NOVEMBER"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:897:14: 'December'
					{
					match("December"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:897:25: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:899:29: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:900:25: ( 'RING' | 'Ring' )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='R') ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1=='I') ) {
					alt46=1;
				}
				else if ( (LA46_1=='i') ) {
					alt46=2;
				}
				else {
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
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:900:29: 'RING'
					{
					match("RING"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:900:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:901:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '�' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:904:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:904:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:907:5: ( 'am' | 'pm' )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0=='a') ) {
				alt47=1;
			}
			else if ( (LA47_0=='p') ) {
				alt47=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:907:9: 'am'
					{
					match("am"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:907:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:910:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
			int alt48=12;
			switch ( input.LA(1) ) {
			case 'M':
				{
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA48_4 = input.LA(3);
					if ( (LA48_4=='S') ) {
						alt48=3;
					}
					else {
						alt48=1;
					}
					}
					break;
				case 'r':
					{
					int LA48_5 = input.LA(3);
					if ( (LA48_5=='s') ) {
						alt48=4;
					}
					else {
						alt48=2;
					}
					}
					break;
				case 'S':
					{
					alt48=5;
					}
					break;
				case 's':
					{
					alt48=6;
					}
					break;
				case 'I':
					{
					alt48=7;
					}
					break;
				case 'i':
					{
					alt48=8;
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
			case 'D':
				{
				int LA48_2 = input.LA(2);
				if ( (LA48_2=='R') ) {
					alt48=9;
				}
				else if ( (LA48_2=='r') ) {
					alt48=10;
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
			case 'C':
				{
				int LA48_3 = input.LA(2);
				if ( (LA48_3=='O') ) {
					alt48=11;
				}
				else if ( (LA48_3=='o') ) {
					alt48=12;
				}
				else {
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
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:910:9: 'MR'
					{
					match("MR"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:910:14: 'Mr'
					{
					match("Mr"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:911:9: 'MRS'
					{
					match("MRS"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:911:15: 'Mrs'
					{
					match("Mrs"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:912:9: 'MS'
					{
					match("MS"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:912:14: 'Ms'
					{
					match("Ms"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:913:9: 'MISS'
					{
					match("MISS"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:913:16: 'Miss'
					{
					match("Miss"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:914:10: 'DR'
					{
					match("DR"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:914:15: 'Dr'
					{
					match("Dr"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:915:9: 'COL'
					{
					match("COL"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:915:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:918:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt49=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt49=1;
					}
					break;
				case 'U':
					{
					alt49=2;
					}
					break;
				case 'a':
					{
					alt49=13;
					}
					break;
				case 'A':
					{
					alt49=14;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA49_2 = input.LA(2);
				if ( (LA49_2=='o') ) {
					alt49=3;
				}
				else if ( (LA49_2=='O') ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 2, input);
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
					alt49=5;
					}
					break;
				case 'U':
					{
					alt49=6;
					}
					break;
				case 'h':
					{
					alt49=9;
					}
					break;
				case 'H':
					{
					alt49=10;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'W':
				{
				int LA49_4 = input.LA(2);
				if ( (LA49_4=='e') ) {
					alt49=7;
				}
				else if ( (LA49_4=='E') ) {
					alt49=8;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA49_5 = input.LA(2);
				if ( (LA49_5=='r') ) {
					alt49=11;
				}
				else if ( (LA49_5=='R') ) {
					alt49=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 5, input);
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
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:918:27: 'Sunday'
					{
					match("Sunday"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:918:36: 'SUNDAY'
					{
					match("SUNDAY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:919:9: 'Monday'
					{
					match("Monday"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:919:18: 'MONDAY'
					{
					match("MONDAY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:920:9: 'Tuesday'
					{
					match("Tuesday"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:920:19: 'TUESDAY'
					{
					match("TUESDAY"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:921:9: 'Wednesday'
					{
					match("Wednesday"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:921:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:922:9: 'Thursday'
					{
					match("Thursday"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:922:20: 'THURSDAY'
					{
					match("THURSDAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:923:9: 'Friday'
					{
					match("Friday"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:923:18: 'FRIDAY'
					{
					match("FRIDAY"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:924:9: 'Saturday'
					{
					match("Saturday"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:924:20: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:941:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0=='L') ) {
				alt50=1;
			}
			else if ( (LA50_0=='V') ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:941:9: 'LUNCH'
					{
					match("LUNCH"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:941:17: 'VARIETY GROUP JUDGING'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:938:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:938:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			mFRAG_PROPER_NAME(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+
			int cnt52=0;
			loop52:
			do {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==' ') ) {
					int LA52_1 = input.LA(2);
					if ( (LA52_1=='(') ) {
						int LA52_3 = input.LA(3);
						if ( ((LA52_3 >= 'A' && LA52_3 <= 'Z')) ) {
							alt52=1;
						}

					}
					else if ( ((LA52_1 >= 'A' && LA52_1 <= 'Z')) ) {
						alt52=1;
					}

				}

				switch (alt52) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0=='(') ) {
						alt51=1;
					}
					else if ( ((LA51_0 >= 'A' && LA51_0 <= 'Z')) ) {
						alt51=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:66: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:85: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

				default :
					if ( cnt52 >= 1 ) break loop52;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(52, input);
						throw eee;
				}
				cnt52++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:106: ( WS )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( ((LA53_0 >= '\t' && LA53_0 <= '\n')||LA53_0=='\r'||LA53_0==' ') ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:106: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:110: ( PARENTHETICAL_INT )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0=='(') ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:939:110: PARENTHETICAL_INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:942:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:942:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:942:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt55=0;
			loop55:
			do {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( ((LA55_0 >= '\t' && LA55_0 <= '\n')||LA55_0=='\r'||LA55_0==' ') ) {
					alt55=1;
				}

				switch (alt55) {
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
					if ( cnt55 >= 1 ) break loop55;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(55, input);
						throw eee;
				}
				cnt55++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:13: ( ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:17: ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:17: ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0=='G') && (synpred2_test())) {
				alt56=1;
			}
			else if ( (LA56_0=='R') ) {
				alt56=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:18: ( 'GROUP RING' )=> 'GROUP RING'
					{
					match("GROUP RING"); if (state.failed) return ;

					if ( state.backtracking==0 ) {allowGroup=true;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:65: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:65: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:66: 'RING' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:5: ( ( ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ) | '1-800-' ) ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:9: ( ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ) | '1-800-' ) ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:9: ( ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ) | '1-800-' )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0=='(') ) {
				alt57=1;
			}
			else if ( (LA57_0=='1') ) {
				alt57=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:10: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:10: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:11: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')'
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:947:45: '1-800-'
					{
					match("1-800-"); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:6: ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( ((LA59_0 >= '\t' && LA59_0 <= '\n')||LA59_0=='\r'||LA59_0==' ') && (synpred3_test())) {
				alt59=1;
			}
			else if ( ((LA59_0 >= '0' && LA59_0 <= '9')) && (synpred3_test())) {
				alt59=1;
			}
			else {
				alt59=2;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:83: ( WS )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( ((LA58_0 >= '\t' && LA58_0 <= '\n')||LA58_0=='\r'||LA58_0==' ') ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:83: WS
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:949:8: ()=>
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:950:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:950:13: INT ':' INT WS FRAG_TIME_LABEL
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:952:2: ( 'minutes following Best in Show' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:952:4: 'minutes following Best in Show'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:954:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:954:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:956:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:956:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:956:13: ( '.' )+
			int cnt60=0;
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0=='.') ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:956:13: '.'
					{
					match('.'); if (state.failed) return ;
					}
					break;

				default :
					if ( cnt60 >= 1 ) break loop60;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(60, input);
						throw eee;
				}
				cnt60++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:958:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:958:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:958:6: ( '0' .. '9' )+
			int cnt61=0;
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( ((LA61_0 >= '0' && LA61_0 <= '9')) ) {
					alt61=1;
				}

				switch (alt61) {
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
					if ( cnt61 >= 1 ) break loop61;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(61, input);
						throw eee;
				}
				cnt61++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:961:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:961:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:961:13: ( WS )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( ((LA62_0 >= '\t' && LA62_0 <= '\n')||LA62_0=='\r'||LA62_0==' ') ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:961:13: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			mINT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:961:21: ( WS )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( ((LA63_0 >= '\t' && LA63_0 <= '\n')||LA63_0=='\r'||LA63_0==' ') ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:961:21: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:13: ( WORD | INT | FRAG_PROPER_NAME )
			int alt64=3;
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
				alt64=1;
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
				alt64=2;
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
				alt64=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:14: WORD
					{
					mWORD(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:19: INT
					{
					mINT(); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( ((LA66_0 >= '\t' && LA66_0 <= '\n')||LA66_0=='\r'||LA66_0==' ') ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:45: ( WORD | INT | FRAG_PROPER_NAME )
					int alt65=3;
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
						alt65=1;
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
						alt65=2;
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
						alt65=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 65, 0, input);
						throw nvae;
					}
					switch (alt65) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:46: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:963:55: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

				default :
					break loop66;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:964:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:964:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:964:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:964:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:964:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( ((LA67_0 >= '&' && LA67_0 <= '\'')||(LA67_0 >= ',' && LA67_0 <= '-')||(LA67_0 >= ':' && LA67_0 <= ';')||(LA67_0 >= 'A' && LA67_0 <= 'Z')||LA67_0=='_'||(LA67_0 >= 'a' && LA67_0 <= 'z')||LA67_0=='\u2019') ) {
					alt67=1;
				}

				switch (alt67) {
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
					break loop67;
				}
			} while (true);

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:964:94: ( END_PUNCTUATION )?
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
	// $ANTLR end "FRAG_PROPER_NAME"

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt69=0;
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( ((LA69_0 >= '&' && LA69_0 <= '\'')||(LA69_0 >= ',' && LA69_0 <= '-')||(LA69_0 >= ':' && LA69_0 <= ';')||LA69_0=='_'||(LA69_0 >= 'a' && LA69_0 <= 'z')||LA69_0=='\u2019') ) {
					alt69=1;
				}

				switch (alt69) {
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
					if ( cnt69 >= 1 ) break loop69;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(69, input);
						throw eee;
				}
				cnt69++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:967:65: ( END_PUNCTUATION )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0=='!'||LA70_0=='.'||LA70_0=='?') ) {
				alt70=1;
			}
			switch (alt70) {
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			int cnt72=0;
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( ((LA72_0 >= '&' && LA72_0 <= '(')||(LA72_0 >= ',' && LA72_0 <= '.')||(LA72_0 >= '0' && LA72_0 <= ';')||(LA72_0 >= 'A' && LA72_0 <= 'Z')||LA72_0=='_'||(LA72_0 >= 'a' && LA72_0 <= 'z')||LA72_0=='\u2019') ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					int alt71=5;
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
						alt71=1;
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
						alt71=2;
						}
						break;
					case '(':
						{
						alt71=3;
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
						alt71=4;
						}
						break;
					case '.':
						{
						alt71=5;
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:32: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:37: PARENTHETICAL
							{
							mPARENTHETICAL(); if (state.failed) return ;

							}
							break;
						case 4 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 5 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:968:55: ELLIPSIS
							{
							mELLIPSIS(); if (state.failed) return ;

							}
							break;

					}

					if ( state.backtracking==0 ) {/*allowBreed=false;*/ allowGroup=false;allowJudge=false;}
					}
					break;

				default :
					if ( cnt72 >= 1 ) break loop72;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(72, input);
						throw eee;
				}
				cnt72++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:970:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:970:4: WORD END_PUNCTUATION
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:971:26: ( 'Unless otherwise announced' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:971:27: 'Unless otherwise announced'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:972:28: ( '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:972:30: '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:972:34: ( FRAG_TITLE WS )?
			int alt73=2;
			switch ( input.LA(1) ) {
				case 'M':
					{
					switch ( input.LA(2) ) {
						case 'R':
							{
							int LA73_5 = input.LA(3);
							if ( (LA73_5=='S') ) {
								int LA73_15 = input.LA(4);
								if ( ((LA73_15 >= '\t' && LA73_15 <= '\n')||LA73_15=='\r'||LA73_15==' ') ) {
									alt73=1;
								}
							}
							else if ( ((LA73_5 >= '\t' && LA73_5 <= '\n')||LA73_5=='\r'||LA73_5==' ') ) {
								alt73=1;
							}
							}
							break;
						case 'r':
							{
							int LA73_6 = input.LA(3);
							if ( (LA73_6=='s') ) {
								int LA73_17 = input.LA(4);
								if ( ((LA73_17 >= '\t' && LA73_17 <= '\n')||LA73_17=='\r'||LA73_17==' ') ) {
									alt73=1;
								}
							}
							else if ( ((LA73_6 >= '\t' && LA73_6 <= '\n')||LA73_6=='\r'||LA73_6==' ') ) {
								alt73=1;
							}
							}
							break;
						case 'S':
							{
							int LA73_7 = input.LA(3);
							if ( ((LA73_7 >= '\t' && LA73_7 <= '\n')||LA73_7=='\r'||LA73_7==' ') ) {
								alt73=1;
							}
							}
							break;
						case 's':
							{
							int LA73_8 = input.LA(3);
							if ( ((LA73_8 >= '\t' && LA73_8 <= '\n')||LA73_8=='\r'||LA73_8==' ') ) {
								alt73=1;
							}
							}
							break;
						case 'I':
							{
							int LA73_9 = input.LA(3);
							if ( (LA73_9=='S') ) {
								int LA73_18 = input.LA(4);
								if ( (LA73_18=='S') ) {
									int LA73_22 = input.LA(5);
									if ( ((LA73_22 >= '\t' && LA73_22 <= '\n')||LA73_22=='\r'||LA73_22==' ') ) {
										alt73=1;
									}
								}
							}
							}
							break;
						case 'i':
							{
							int LA73_10 = input.LA(3);
							if ( (LA73_10=='s') ) {
								int LA73_19 = input.LA(4);
								if ( (LA73_19=='s') ) {
									int LA73_23 = input.LA(5);
									if ( ((LA73_23 >= '\t' && LA73_23 <= '\n')||LA73_23=='\r'||LA73_23==' ') ) {
										alt73=1;
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
					int LA73_2 = input.LA(2);
					if ( (LA73_2=='R') ) {
						int LA73_11 = input.LA(3);
						if ( ((LA73_11 >= '\t' && LA73_11 <= '\n')||LA73_11=='\r'||LA73_11==' ') ) {
							alt73=1;
						}
					}
					else if ( (LA73_2=='r') ) {
						int LA73_12 = input.LA(3);
						if ( ((LA73_12 >= '\t' && LA73_12 <= '\n')||LA73_12=='\r'||LA73_12==' ') ) {
							alt73=1;
						}
					}
					}
					break;
				case 'C':
					{
					int LA73_3 = input.LA(2);
					if ( (LA73_3=='O') ) {
						int LA73_13 = input.LA(3);
						if ( (LA73_13=='L') ) {
							int LA73_20 = input.LA(4);
							if ( ((LA73_20 >= '\t' && LA73_20 <= '\n')||LA73_20=='\r'||LA73_20==' ') ) {
								alt73=1;
							}
						}
					}
					else if ( (LA73_3=='o') ) {
						int LA73_14 = input.LA(3);
						if ( (LA73_14=='l') ) {
							int LA73_21 = input.LA(4);
							if ( ((LA73_21 >= '\t' && LA73_21 <= '\n')||LA73_21=='\r'||LA73_21==' ') ) {
								alt73=1;
							}
						}
					}
					}
					break;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:972:35: FRAG_TITLE WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:977:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:977:6: .
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_CLASSIFIER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | FOLLOWING_TIME | DATE | ELLIPSIS | INT | PARENTHETICAL_INT | PARENTHETICAL | COMMENT | GROUP_ENDING_ANNOUNCEMENT | FallThrough )
		int alt74=26;
		alt74 = dfa74.predict(input);
		switch (alt74) {
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:66: GROUP_RING
				{
				mGROUP_RING(); if (state.failed) return ;

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:77: NON_CONFORMATION_CLASS_NAME
				{
				mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:105: NON_CONF_SECOND_LINE_COMMENT
				{
				mNON_CONF_SECOND_LINE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:134: RALLY_CLASS
				{
				mRALLY_CLASS(); if (state.failed) return ;

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:146: RALLY_ENTRY
				{
				mRALLY_ENTRY(); if (state.failed) return ;

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:158: NON_CONFORMATION_SECOND_LINE
				{
				mNON_CONFORMATION_SECOND_LINE(); if (state.failed) return ;

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:187: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:206: BREED_COUNT
				{
				mBREED_COUNT(); if (state.failed) return ;

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:218: JUDGE_NAME
				{
				mJUDGE_NAME(); if (state.failed) return ;

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:229: WS
				{
				mWS(); if (state.failed) return ;

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:232: RING_TITLE
				{
				mRING_TITLE(); if (state.failed) return ;

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:243: PHONE_NUMBER
				{
				mPHONE_NUMBER(); if (state.failed) return ;

				}
				break;
			case 17 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:256: TIME
				{
				mTIME(); if (state.failed) return ;

				}
				break;
			case 18 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:261: FOLLOWING_TIME
				{
				mFOLLOWING_TIME(); if (state.failed) return ;

				}
				break;
			case 19 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:276: DATE
				{
				mDATE(); if (state.failed) return ;

				}
				break;
			case 20 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:281: ELLIPSIS
				{
				mELLIPSIS(); if (state.failed) return ;

				}
				break;
			case 21 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:290: INT
				{
				mINT(); if (state.failed) return ;

				}
				break;
			case 22 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:294: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); if (state.failed) return ;

				}
				break;
			case 23 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:312: PARENTHETICAL
				{
				mPARENTHETICAL(); if (state.failed) return ;

				}
				break;
			case 24 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:326: COMMENT
				{
				mCOMMENT(); if (state.failed) return ;

				}
				break;
			case 25 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:334: GROUP_ENDING_ANNOUNCEMENT
				{
				mGROUP_ENDING_ANNOUNCEMENT(); if (state.failed) return ;

				}
				break;
			case 26 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:360: FallThrough
				{
				mFallThrough(); if (state.failed) return ;

				}
				break;

		}
	}

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:18: ( 'GROUP RING' )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:944:19: 'GROUP RING'
		{
		match("GROUP RING"); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:9: ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:9: ( WS )?
		int alt75=2;
		int LA75_0 = input.LA(1);
		if ( ((LA75_0 >= '\t' && LA75_0 <= '\n')||LA75_0=='\r'||LA75_0==' ') ) {
			alt75=1;
		}
		switch (alt75) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:948:9: WS
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:949:8: ()
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:949:9: 
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
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA42 dfa42 = new DFA42(this);
	protected DFA74 dfa74 = new DFA74(this);
	static final String DFA2_eotS =
		"\u00ec\uffff\1\u0110\74\uffff\1\u014b\74\uffff\1\u017d\114\uffff\1\u01b5"+
		"\2\uffff";
	static final String DFA2_eofS =
		"\u01b6\uffff";
	static final String DFA2_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\3\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff\1\145\2\uffff"+
		"\2\163\1\141\1\143\1\141\1\162\1\151\1\154\1\151\1\uffff\1\145\2\uffff"+
		"\1\143\1\uffff\1\143\1\142\1\147\1\145\3\uffff\1\162\2\uffff\1\154\1\145"+
		"\1\162\2\uffff\1\151\1\uffff\1\145\1\uffff\1\166\1\142\4\uffff\1\154\1"+
		"\156\1\141\1\162\2\uffff\1\160\1\153\2\uffff\1\151\1\147\2\uffff\1\144"+
		"\3\uffff\1\151\1\150\1\141\1\145\1\142\2\uffff\2\141\2\uffff\1\142\2\uffff"+
		"\1\151\1\uffff\1\162\2\uffff\1\162\1\164\1\145\1\147\1\uffff\2\147\1\150"+
		"\1\143\2\uffff\1\144\1\uffff\1\166\2\uffff\1\141\1\uffff\1\154\1\uffff"+
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
		"\1\163\1\120\3\uffff\1\157\1\uffff\1\153\2\uffff\1\144\1\151\1\145\2\uffff"+
		"\1\156\1\147\1\157\1\40\2\uffff";
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
		"\2\uffff\1\124\7\uffff\1\127\1\163\1\126\3\uffff\1\157\1\uffff\1\153\2"+
		"\uffff\1\144\1\171\1\145\2\uffff\1\156\1\147\1\157\1\40\2\uffff";
	static final String DFA2_acceptS =
		"\12\uffff\1\150\11\uffff\1\u00bc\1\uffff\1\u00c5\1\u00c6\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\12\1\13\11\uffff\1\64\1\uffff\1\71\1\73\1\uffff\1\76"+
		"\4\uffff\1\117\1\120\1\121\1\uffff\1\126\1\127\3\uffff\1\140\1\141\1\uffff"+
		"\1\147\1\uffff\1\154\2\uffff\1\162\1\163\1\164\1\165\4\uffff\1\u0085\1"+
		"\u0086\2\uffff\1\u008d\1\u008e\2\uffff\1\u0099\1\u009a\1\uffff\1\u009d"+
		"\1\u009e\1\u009f\5\uffff\1\u00ae\1\u00af\2\uffff\1\u00b5\1\u00b6\1\uffff"+
		"\1\u00ba\1\u00bb\1\uffff\1\u00c1\1\uffff\1\1\1\2\4\uffff\1\24\4\uffff"+
		"\1\37\1\40\1\uffff\1\44\1\uffff\1\47\1\50\1\uffff\1\53\1\uffff\1\57\1"+
		"\uffff\1\62\1\63\1\65\1\uffff\1\72\1\74\1\75\1\77\1\100\1\101\1\102\2"+
		"\uffff\1\113\1\114\2\uffff\1\130\1\131\1\uffff\1\136\1\137\2\uffff\1\153"+
		"\1\uffff\1\157\1\160\1\161\1\166\1\167\1\170\1\uffff\1\175\1\176\1\uffff"+
		"\1\u0084\1\u0087\1\u0088\1\u0089\1\u008a\1\uffff\1\u008f\1\u0090\1\u0091"+
		"\1\u0092\1\uffff\1\u0096\1\uffff\1\u009b\1\u009c\1\u00a0\1\u00a1\1\u00a2"+
		"\1\u00a3\1\uffff\1\u00a6\1\u00a7\1\u00a8\2\uffff\1\u00ad\1\u00b0\3\uffff"+
		"\1\u00bd\1\uffff\1\u00c0\3\uffff\1\17\1\20\1\21\1\22\1\23\1\uffff\1\30"+
		"\1\31\3\uffff\1\43\1\uffff\1\51\1\52\1\uffff\1\60\1\61\1\66\1\uffff\1"+
		"\103\5\uffff\1\135\4\uffff\1\177\5\uffff\1\u00a9\1\u00aa\2\uffff\1\u00b3"+
		"\1\u00b4\12\uffff\1\54\1\55\1\56\13\uffff\1\u0083\2\uffff\1\u0098\1\u0097"+
		"\5\uffff\1\u00c2\11\uffff\1\104\1\105\4\uffff\1\134\5\uffff\1\u008b\1"+
		"\u008c\12\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\132\1\133\1\142\1\143"+
		"\1\144\2\uffff\1\156\1\155\5\uffff\1\u00b1\1\u00b2\1\uffff\1\u00be\1\u00bf"+
		"\4\uffff\1\41\1\42\1\45\1\46\3\uffff\1\122\1\uffff\1\125\1\145\1\146\12"+
		"\uffff\1\25\1\26\1\27\1\67\1\70\1\106\1\107\1\uffff\1\112\1\115\1\116"+
		"\1\uffff\1\152\1\151\5\uffff\1\u00b7\1\u00b8\1\u00b9\2\uffff\1\10\1\11"+
		"\1\uffff\1\110\1\111\1\123\1\124\3\uffff\1\u00a4\1\u00a5\2\uffff\1\6\1"+
		"\7\1\uffff\1\171\1\172\1\173\1\174\1\u0080\1\u0081\1\u0082\3\uffff\1\14"+
		"\1\15\1\16\1\uffff\1\u0095\1\uffff\1\u00c3\1\u00c4\3\uffff\1\u00ab\1\u00ac"+
		"\4\uffff\1\u0094\1\u0093";
	static final String DFA2_specialS =
		"\u01b6\uffff}>";
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
			"\1\u0094",
			"\1\u0095\3\uffff\1\u0096",
			"",
			"",
			"\1\u0097",
			"",
			"\1\u0098\14\uffff\1\u0099",
			"",
			"\1\u009a",
			"\1\u009b\4\uffff\1\u009c\3\uffff\1\u009d",
			"",
			"",
			"",
			"",
			"\1\u009e\1\uffff\1\u009f\4\uffff\1\u00a0",
			"\1\u00a1",
			"\1\u00a2\25\uffff\1\u00a3",
			"\1\u00a4\3\uffff\1\u00a5",
			"",
			"",
			"\1\u00a6\1\uffff\1\u00a7",
			"\1\u00a8\1\uffff\1\u00a9\6\uffff\1\u00aa",
			"",
			"",
			"\1\u00ab\2\uffff\1\u00ac\1\u00ad\1\uffff\1\u00ae\2\uffff\1\u00af",
			"\1\u00b0\4\uffff\1\u00b1",
			"",
			"",
			"\1\u00b2\17\uffff\1\u00b3",
			"",
			"",
			"",
			"\1\u00b4\2\uffff\1\u00b5\1\u00b6",
			"\1\u00b7\6\uffff\1\u00b8",
			"\1\u00b9\22\uffff\1\u00ba",
			"\1\u00bb\3\uffff\1\u00bc",
			"\1\u00bd\11\uffff\1\u00be",
			"",
			"",
			"\1\u00bf\7\uffff\1\u00c0",
			"\1\u00c1",
			"",
			"",
			"\1\u00c2",
			"",
			"",
			"\1\u00c3\2\uffff\1\u00c4\6\uffff\1\u00c5",
			"",
			"\1\u00c6",
			"",
			"",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9\15\uffff\1\u00ca",
			"\1\u00cb\12\uffff\1\u00cc\2\uffff\1\u00cd",
			"",
			"\1\u00ce",
			"\1\u00cf\6\uffff\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"",
			"",
			"\1\u00d3\25\uffff\1\u00d4",
			"",
			"\1\u00d5",
			"",
			"",
			"\1\u00d6\22\uffff\1\u00d7",
			"",
			"\1\u00d8",
			"",
			"\1\u00d9\3\uffff\1\u00da",
			"",
			"",
			"",
			"\1\u00db\5\uffff\1\u00dc",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00dd\5\uffff\1\u00de",
			"\1\u00df",
			"",
			"",
			"\1\u00e0",
			"\1\u00e1",
			"",
			"",
			"\1\u00e2\27\uffff\1\u00e3",
			"",
			"",
			"\1\u00e4",
			"\1\u00e5",
			"",
			"\1\u00e6",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e7",
			"",
			"",
			"\1\u00e8\20\uffff\1\u00e9",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ea",
			"",
			"",
			"",
			"",
			"\1\u00eb",
			"",
			"\1\u00ec",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ed",
			"",
			"",
			"",
			"\1\u00ee\5\uffff\1\u00ef",
			"\1\u00f0",
			"",
			"",
			"\1\u00f1",
			"\1\u00f2\7\uffff\1\u00f3",
			"\1\u00f4",
			"",
			"\1\u00f5",
			"",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f9",
			"",
			"",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"",
			"\1\u00fd",
			"",
			"",
			"\1\u00fe\103\uffff\1\u00ff\10\uffff\1\u0100",
			"",
			"",
			"",
			"\1\u0101",
			"",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"",
			"\1\u010b\3\uffff\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0111",
			"",
			"",
			"\1\u0112",
			"\1\u0113",
			"",
			"",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116\107\uffff\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"",
			"",
			"",
			"\1\u011f",
			"\1\u0120\122\uffff\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125\104\uffff\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"",
			"\1\u012c\122\uffff\1\u012d",
			"\1\u012e",
			"",
			"",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138\122\uffff\1\u0139",
			"\1\u013b\53\uffff\1\u013c\16\uffff\1\u013a",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"",
			"",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143\13\uffff\1\u0144",
			"",
			"\1\u0145\1\u0146\1\u0147\2\uffff\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014c",
			"\1\u014d",
			"",
			"",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151\3\uffff\1\u0152",
			"\1\u0153",
			"\1\u0154\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"",
			"",
			"",
			"",
			"",
			"\1\u015a\20\uffff\1\u015b",
			"\1\u015c\122\uffff\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161\2\uffff\1\u0162\3\uffff\1\u0163",
			"",
			"",
			"",
			"",
			"",
			"\1\u0164\15\uffff\1\u0165",
			"\1\u0166",
			"",
			"",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"",
			"",
			"\1\u016c",
			"",
			"",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170\5\uffff\1\u0171\1\u0172",
			"",
			"",
			"",
			"",
			"\1\u0173\17\uffff\1\u0174",
			"\1\u0175\2\uffff\1\u0176\14\uffff\1\u0177\1\u0178",
			"\1\u0179\6\uffff\1\u017a",
			"",
			"\1\u017b",
			"",
			"",
			"",
			"\1\u017c",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183\5\uffff\1\u0184\1\u0185",
			"\1\u0186",
			"\1\u0187\1\u0188\14\uffff\1\u0189",
			"\1\u018a",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u018b\12\uffff\1\u018c",
			"",
			"",
			"",
			"\1\u018d\11\uffff\1\u018e",
			"",
			"",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192\17\uffff\1\u0193",
			"\1\u0194",
			"",
			"",
			"",
			"\1\u0195",
			"\1\u0196\4\uffff\1\u0197",
			"",
			"",
			"\1\u0198",
			"",
			"",
			"",
			"",
			"\1\u0199\1\u019a\15\uffff\1\u019b\2\uffff\1\u019c",
			"\1\u019d\2\uffff\1\u019e\6\uffff\1\u019f",
			"\1\u01a0",
			"",
			"",
			"\1\u01a1",
			"\1\u01a2",
			"",
			"",
			"\1\u01a3\17\uffff\1\u01a4\1\u01a5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01a6\6\uffff\1\u01a7",
			"\1\u01a8",
			"\1\u01a9\5\uffff\1\u01aa",
			"",
			"",
			"",
			"\1\u01ab",
			"",
			"\1\u01ac",
			"",
			"",
			"\1\u01ad",
			"\1\u01af\17\uffff\1\u01ae",
			"\1\u01b0",
			"",
			"",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
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
			return "515:27: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell�Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'L�wchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vend�en' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
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
			return "740:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA42_eotS =
		"\4\uffff\1\5\1\uffff";
	static final String DFA42_eofS =
		"\6\uffff";
	static final String DFA42_minS =
		"\1\60\1\55\1\60\1\uffff\1\60\1\uffff";
	static final String DFA42_maxS =
		"\1\71\1\73\1\71\1\uffff\1\73\1\uffff";
	static final String DFA42_acceptS =
		"\3\uffff\1\2\1\uffff\1\1";
	static final String DFA42_specialS =
		"\6\uffff}>";
	static final String[] DFA42_transitionS = {
			"\12\1",
			"\1\2\2\uffff\12\1\1\uffff\1\3",
			"\12\4",
			"",
			"\12\4\1\uffff\1\3",
			""
	};

	static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
	static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
	static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
	static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
	static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
	static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
	static final short[][] DFA42_transition;

	static {
		int numStates = DFA42_transitionS.length;
		DFA42_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
		}
	}

	class DFA42 extends DFA {

		public DFA42(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 42;
			this.eot = DFA42_eot;
			this.eof = DFA42_eof;
			this.min = DFA42_min;
			this.max = DFA42_max;
			this.accept = DFA42_accept;
			this.special = DFA42_special;
			this.transition = DFA42_transition;
		}
		@Override
		public String getDescription() {
			return "878:1: NON_CONFORMATION_SECOND_LINE : ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) );";
		}
	}

	static final String DFA74_eotS =
		"\1\uffff\31\54\1\u00aa\1\uffff\1\42\1\u00aa\1\54\1\u00b3\3\uffff\11\54"+
		"\1\uffff\131\54\1\uffff\21\54\1\u0167\17\54\1\u00aa\1\54\1\uffff\1\54"+
		"\5\uffff\2\54\1\uffff\1\u00b3\6\54\1\uffff\u009e\54\1\u0086\2\54\1\u0239"+
		"\11\54\1\uffff\4\54\1\uffff\14\54\3\u0253\1\54\2\uffff\1\u00ae\2\uffff"+
		"\1\u025b\2\uffff\11\54\1\u0239\u009a\54\1\u0239\12\54\1\u0086\1\uffff"+
		"\1\54\1\u0086\1\54\1\uffff\13\54\1\uffff\1\54\1\uffff\12\54\1\u0253\1"+
		"\uffff\2\54\6\uffff\10\54\1\uffff\21\54\1\u034b\60\54\1\u0086\37\54\1"+
		"\u0086\53\54\1\u03bd\2\54\1\u0239\4\54\1\u0086\5\54\20\uffff\1\54\1\u0086"+
		"\10\54\1\uffff\2\u0167\14\54\1\u0253\1\54\1\u0253\1\u03fd\4\uffff\10\54"+
		"\1\uffff\1\54\1\u0239\16\54\7\uffff\5\54\1\u0086\20\54\1\u0086\4\54\1"+
		"\u0086\13\54\1\u0086\21\54\1\u0086\6\54\1\u0086\44\54\1\u0086\5\54\1\uffff"+
		"\11\54\1\u0086\1\54\34\uffff\2\54\1\uffff\22\54\1\u03fd\2\54\1\uffff\2"+
		"\54\2\u0086\4\54\1\uffff\11\54\1\u0086\4\54\11\uffff\6\54\1\u0086\4\54"+
		"\1\u0086\11\54\1\u0086\12\54\1\u0086\14\54\1\u0086\43\54\1\u0086\4\54"+
		"\1\u0086\2\54\37\uffff\22\54\1\u0239\1\uffff\1\54\1\u052d\5\54\1\uffff"+
		"\12\54\11\uffff\2\54\1\uffff\1\u0086\12\54\1\u0086\3\54\1\u0239\13\54"+
		"\1\uffff\1\u0086\1\u0239\7\54\1\u0239\7\54\1\u0239\2\54\3\u0086\3\54\1"+
		"\u0086\4\54\33\uffff\1\u0086\3\uffff\5\54\1\u0167\5\54\1\uffff\1\54\1"+
		"\uffff\14\54\11\uffff\1\54\1\uffff\3\54\1\u0086\4\54\1\u0086\1\54\1\uffff"+
		"\1\u034b\5\54\2\u0086\1\54\1\u0239\1\54\1\u0086\3\54\1\u0086\2\54\34\uffff"+
		"\3\54\1\uffff\1\54\3\uffff\10\54\1\u0086\3\54\1\u0086\2\54\10\uffff\1"+
		"\54\1\uffff\1\u0086\3\54\1\u0086\3\54\1\uffff\1\u0239\3\uffff\6\54\3\u0086"+
		"\1\54\32\uffff\3\54\3\uffff\2\u0086\5\54\1\u0239\6\uffff\1\54\1\uffff"+
		"\2\54\1\u0086\1\54\2\uffff\1\u0239\4\54\27\uffff\3\54\3\uffff\1\54\1\u052d"+
		"\1\54\1\u0086\1\54\6\uffff\1\54\1\uffff\1\54\2\uffff\1\54\22\uffff\3\54"+
		"\2\uffff\1\54\1\u052d\1\54\3\uffff\1\54\3\uffff\1\u0086\21\uffff\1\u0086"+
		"\1\54\1\u0086\2\uffff\1\54\1\u052d\1\u03fd\17\uffff\1\u0086\3\uffff\1"+
		"\54\2\uffff\1\u0086\1\u052d\20\uffff\1\54\16\uffff\1\54\3\uffff\1\u0239"+
		"\11\uffff\1\54\12\uffff\1\54\6\uffff\1\u0086\23\uffff";
	static final String DFA74_eofS =
		"\u06c7\uffff";
	static final String DFA74_minS =
		"\1\0\1\111\1\154\1\117\1\105\1\101\1\105\1\117\1\105\1\101\1\144\1\122"+
		"\1\156\2\122\1\142\1\141\1\145\1\125\1\141\1\60\1\105\2\157\2\156\1\46"+
		"\1\uffff\1\11\1\46\1\151\1\46\3\uffff\1\154\1\156\4\11\1\123\1\156\1\116"+
		"\1\uffff\1\145\1\144\1\164\1\162\1\141\1\116\1\162\1\144\1\151\1\154\1"+
		"\122\1\154\1\104\2\141\1\151\1\150\1\141\1\145\1\142\1\171\1\146\1\156"+
		"\1\145\1\117\1\105\1\116\1\124\1\141\1\163\1\141\1\143\1\141\1\162\1\154"+
		"\1\123\1\141\1\162\1\151\1\163\1\162\1\165\1\143\1\114\1\156\1\162\1\122"+
		"\1\125\1\162\1\172\1\124\1\122\1\146\1\162\1\151\1\141\1\145\1\141\1\160"+
		"\1\163\1\166\1\143\1\142\2\11\1\147\1\143\1\145\1\141\1\170\1\145\1\111"+
		"\1\162\1\141\1\145\1\154\1\141\1\117\1\151\1\145\1\151\1\141\1\160\1\145"+
		"\1\155\1\166\1\142\1\157\1\141\1\uffff\1\167\1\116\1\151\1\153\1\141\1"+
		"\157\1\151\1\147\1\162\1\145\1\154\1\144\1\157\1\164\1\163\1\107\1\116"+
		"\1\46\1\142\1\40\1\145\1\131\1\122\1\145\1\105\1\165\1\125\1\154\1\162"+
		"\1\151\1\154\1\143\1\60\1\46\1\60\1\uffff\1\60\1\uffff\1\11\1\uffff\2"+
		"\11\1\60\1\156\1\uffff\1\46\2\164\1\143\1\151\1\163\1\11\1\uffff\1\11"+
		"\1\123\1\144\1\104\1\156\1\40\1\145\1\141\1\146\1\160\1\146\1\55\1\153"+
		"\1\155\1\163\1\164\1\156\1\160\1\145\1\144\1\113\1\153\1\116\1\144\1\146"+
		"\1\143\3\156\1\165\1\157\1\165\1\151\1\164\1\154\2\164\1\142\1\145\1\153"+
		"\1\145\1\164\1\163\2\144\1\122\1\105\1\104\1\125\1\157\1\143\1\141\1\163"+
		"\1\145\1\147\1\154\2\147\1\151\1\150\1\143\1\157\1\145\1\144\1\164\1\166"+
		"\1\145\1\153\1\154\1\124\1\155\1\163\1\150\1\167\1\55\1\154\1\162\1\141"+
		"\1\144\1\141\1\153\1\156\1\155\1\153\2\11\1\164\1\162\1\141\1\104\1\116"+
		"\1\145\2\163\1\105\1\111\1\145\1\150\1\145\1\164\1\163\1\162\1\164\1\145"+
		"\1\164\1\141\1\150\1\155\1\144\1\145\1\157\2\154\1\145\1\154\1\156\1\164"+
		"\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\141\1\144\1\125\1\172\1\154"+
		"\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\157\1\145\1\156\1\163"+
		"\1\143\1\103\1\151\1\163\1\162\1\151\1\142\1\151\1\162\1\164\1\156\1\151"+
		"\1\145\1\144\1\164\1\41\1\151\1\145\1\41\1\40\1\154\1\142\1\162\1\144"+
		"\1\164\1\163\1\125\1\107\1\uffff\2\122\1\145\1\40\1\uffff\1\145\1\40\1"+
		"\122\1\163\1\123\1\162\1\122\1\157\1\153\1\154\1\145\1\150\3\46\3\11\1"+
		"\46\2\11\1\46\2\11\1\165\2\145\1\150\1\141\2\11\1\141\1\101\1\40\1\162"+
		"\1\143\1\40\1\157\1\145\2\157\1\123\1\151\1\141\1\150\1\40\1\145\1\160"+
		"\2\40\1\111\1\164\1\105\1\11\1\146\1\144\2\151\1\157\1\164\1\153\1\171"+
		"\1\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\145"+
		"\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\144\1\145\1\162\1\164\1\163"+
		"\1\156\1\145\1\154\1\144\1\143\2\151\2\145\1\156\1\157\1\153\1\144\1\164"+
		"\1\145\2\157\1\151\1\162\1\151\2\40\1\160\1\141\1\165\1\145\1\40\1\104"+
		"\1\171\1\156\1\141\1\40\1\151\1\154\1\171\1\145\1\142\1\145\3\151\1\156"+
		"\1\111\1\104\1\162\1\141\1\154\1\122\1\105\1\156\1\141\1\144\1\141\1\153"+
		"\1\151\1\157\1\156\1\162\1\156\1\163\1\141\1\151\1\162\1\40\1\145\1\151"+
		"\1\145\1\154\1\144\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145"+
		"\1\157\1\164\1\150\1\165\1\120\2\141\1\150\1\151\1\156\1\150\1\171\1\156"+
		"\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\41\1\156"+
		"\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\41\1\46\1\151\1\41"+
		"\1\156\1\uffff\1\171\1\157\1\151\1\145\1\167\1\145\1\114\1\11\2\60\1\164"+
		"\1\106\1\151\1\uffff\1\111\1\144\1\104\1\163\1\123\1\151\1\163\1\151\1"+
		"\163\1\72\1\46\1\uffff\2\60\1\uffff\4\11\1\uffff\1\164\1\162\1\146\1\163"+
		"\1\145\1\164\1\171\1\131\1\101\1\150\1\145\1\154\1\147\1\143\1\154\1\165"+
		"\1\120\1\156\1\162\1\40\1\163\1\145\1\141\1\116\1\150\1\123\1\11\1\157"+
		"\2\141\1\145\1\156\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141"+
		"\1\40\1\151\1\40\1\170\1\171\2\163\1\111\1\123\1\131\1\104\2\11\1\144"+
		"\1\141\1\145\1\152\1\164\3\145\1\156\1\141\1\162\1\163\2\156\1\40\1\150"+
		"\1\151\1\162\1\151\1\156\1\145\1\41\1\156\1\157\1\141\1\151\1\160\1\141"+
		"\1\163\1\157\1\55\1\40\1\156\1\147\1\151\1\40\1\143\1\145\1\162\1\145"+
		"\1\156\2\145\1\116\1\40\1\141\1\164\1\141\1\101\1\124\1\160\1\156\1\141"+
		"\1\41\1\141\1\143\1\154\1\172\1\141\1\143\1\150\1\164\1\145\1\155\1\40"+
		"\1\163\1\142\1\154\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156"+
		"\1\40\1\157\1\141\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1"+
		"\144\1\164\1\141\1\145\1\40\1\145\1\41\1\154\1\156\1\41\1\147\1\157\1"+
		"\40\1\157\1\41\1\145\1\150\1\141\1\145\1\147\20\11\1\163\1\41\1\145\1"+
		"\40\1\156\1\145\1\163\1\145\1\154\1\101\1\uffff\2\46\1\141\1\156\1\105"+
		"\1\141\1\101\1\144\1\104\1\164\1\150\1\164\1\163\1\40\1\46\1\55\2\46\4"+
		"\11\1\145\1\40\1\146\1\145\1\163\1\165\2\54\1\uffff\1\157\1\40\1\153\1"+
		"\151\1\150\1\151\1\156\1\117\1\147\1\141\1\144\1\164\1\151\1\107\1\162"+
		"\1\104\1\uffff\1\151\1\157\1\160\1\150\1\165\1\145\2\162\2\154\1\145\1"+
		"\41\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\40\1\54\1\150\1"+
		"\164\1\116\1\124\1\54\1\101\1\41\1\156\1\154\1\151\1\40\1\41\1\144\1\162"+
		"\1\147\1\156\1\40\2\145\1\40\1\157\1\143\1\40\1\41\1\40\1\162\1\40\1\147"+
		"\1\163\1\157\1\145\1\150\1\145\1\167\1\103\1\40\1\141\1\145\1\157\1\162"+
		"\1\40\1\41\1\147\1\162\1\163\1\107\1\156\1\151\1\41\1\116\1\131\1\151"+
		"\1\40\1\154\1\156\1\141\1\151\1\145\1\154\1\145\1\165\1\151\1\40\1\141"+
		"\1\40\1\150\1\165\1\145\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1"+
		"\40\1\144\1\156\1\163\1\156\1\157\1\41\2\157\1\156\1\162\1\156\1\uffff"+
		"\1\157\1\40\1\145\1\153\1\40\1\150\1\162\1\40\1\156\1\41\1\165\34\11\1"+
		"\143\1\141\1\uffff\1\145\1\166\2\151\1\154\2\122\1\156\1\147\1\122\1\171"+
		"\1\131\1\141\1\101\1\172\1\151\1\171\1\40\1\41\2\60\1\uffff\1\60\1\163"+
		"\2\41\1\164\1\162\1\11\1\165\1\101\1\40\1\141\1\40\1\164\1\144\1\122\1"+
		"\11\1\156\1\141\1\41\1\162\1\40\1\157\1\101\1\141\1\162\1\165\1\145\1"+
		"\uffff\1\141\1\164\1\156\1\164\2\144\1\40\1\163\2\40\1\41\1\171\1\162"+
		"\1\150\1\155\1\41\1\144\1\156\1\40\1\141\1\107\1\101\1\131\1\171\1\163"+
		"\1\41\1\40\1\157\1\164\2\40\1\162\1\40\1\165\1\153\1\40\1\41\1\164\1\156"+
		"\1\141\1\165\1\40\1\156\1\157\1\156\1\162\3\40\1\41\1\145\1\40\1\11\1"+
		"\154\2\40\1\156\1\145\1\40\1\156\1\141\1\154\1\151\1\144\1\156\1\141\1"+
		"\156\1\40\1\143\1\156\1\40\1\141\1\40\1\156\1\145\1\151\1\40\1\145\1\144"+
		"\1\162\1\153\1\162\1\40\1\144\1\147\1\41\1\156\1\163\1\145\1\40\1\41\1"+
		"\151\1\145\37\11\1\56\1\156\1\40\1\145\1\141\1\154\2\40\1\60\3\40\2\54"+
		"\1\171\1\131\1\143\1\162\1\41\1\uffff\1\55\1\46\2\60\1\40\2\145\1\uffff"+
		"\2\156\1\141\1\154\1\124\1\145\1\171\1\145\1\165\1\131\1\157\1\143\1\153"+
		"\1\144\1\143\1\155\1\55\1\164\1\145\1\163\1\40\1\101\1\41\1\54\1\153\4"+
		"\40\1\153\1\40\1\113\1\54\1\41\1\40\1\156\1\157\1\41\1\156\2\40\1\151"+
		"\1\11\1\153\1\141\1\11\1\141\2\40\1\122\1\41\1\11\1\151\1\163\2\40\1\156"+
		"\1\154\1\141\1\41\1\144\1\156\1\40\1\150\2\164\1\144\1\41\1\143\1\40\3"+
		"\41\2\40\1\145\1\41\1\145\1\40\1\141\1\163\33\11\1\46\3\11\2\40\1\162"+
		"\1\156\1\145\1\46\2\54\1\165\1\145\1\55\1\uffff\1\55\1\uffff\1\162\1\40"+
		"\1\144\1\40\1\156\1\141\1\111\1\162\1\54\1\144\1\147\1\54\1\144\1\145"+
		"\1\151\1\11\1\151\1\160\1\104\1\151\1\162\1\150\1\164\2\145\1\105\1\41"+
		"\1\156\1\144\1\146\1\145\1\41\1\164\1\145\1\11\1\164\1\143\1\40\1\145"+
		"\1\156\2\41\1\145\1\41\1\145\1\41\1\40\1\156\1\162\1\41\1\156\1\145\34"+
		"\11\1\163\1\141\1\154\1\46\1\151\3\11\1\163\1\40\1\162\1\151\1\40\1\55"+
		"\1\60\1\40\1\41\1\40\1\156\1\116\1\41\1\40\1\150\2\11\1\156\1\141\1\151"+
		"\1\157\1\156\1\141\1\151\1\164\1\41\1\163\1\123\1\40\1\41\1\146\1\40\1"+
		"\145\1\164\1\151\1\141\1\145\1\150\1\171\1\150\1\162\1\40\1\162\1\144"+
		"\3\41\1\40\32\11\1\143\1\162\1\141\3\11\2\41\1\156\2\60\1\144\1\107\1"+
		"\41\1\147\1\154\1\157\1\167\1\147\1\156\2\162\1\11\1\40\1\41\1\144\2\162"+
		"\1\41\1\145\3\40\27\11\1\157\1\164\1\143\3\11\1\164\1\46\1\60\1\41\1\40"+
		"\1\11\1\40\2\156\1\40\1\11\1\145\1\141\1\40\1\151\1\145\1\162\22\11\1"+
		"\142\1\151\1\153\2\11\1\154\1\46\1\60\3\11\1\40\1\143\1\145\1\162\1\41"+
		"\21\11\1\41\1\55\1\41\2\11\1\151\2\46\1\164\1\166\1\141\14\11\1\46\3\11"+
		"\1\103\2\11\1\41\1\46\1\151\1\145\1\156\15\11\1\157\1\11\1\157\1\162\13"+
		"\11\1\154\1\11\1\156\13\11\1\157\12\11\1\162\6\11\1\41\23\11";
	static final String DFA74_maxS =
		"\1\uffff\1\163\1\164\2\157\1\167\3\165\1\151\1\165\1\162\1\170\2\162\1"+
		"\164\1\141\1\165\1\u00f6\1\171\2\165\2\157\1\164\1\156\1\u2019\1\uffff"+
		"\2\u2019\1\151\1\u2019\3\uffff\2\163\1\123\1\163\2\40\1\123\1\156\1\116"+
		"\1\uffff\1\145\1\144\1\164\1\166\1\167\1\116\1\162\1\163\1\151\1\162\1"+
		"\122\1\154\1\104\1\165\1\151\1\164\1\157\1\164\1\151\1\154\1\171\1\146"+
		"\1\163\1\145\1\117\1\105\1\116\1\124\1\165\1\163\1\162\1\143\1\165\1\171"+
		"\1\154\1\123\1\157\1\164\1\166\1\163\1\162\1\165\1\154\1\114\1\156\1\166"+
		"\1\122\1\125\1\164\1\172\1\124\1\122\1\147\1\162\1\151\1\141\1\145\1\141"+
		"\1\160\1\163\1\166\1\156\1\147\2\40\1\164\1\143\1\156\1\141\1\170\1\151"+
		"\1\111\1\162\1\141\1\145\1\162\1\145\1\117\1\151\1\145\1\151\1\141\1\160"+
		"\1\162\1\155\1\166\1\153\1\157\1\141\1\uffff\1\167\1\116\1\162\1\164\1"+
		"\141\1\157\1\162\1\154\1\162\1\145\2\164\1\157\1\164\1\163\1\107\1\116"+
		"\1\u2019\1\142\1\171\1\145\1\131\1\122\1\145\1\105\1\165\1\125\1\154\1"+
		"\162\1\151\1\154\1\143\1\71\1\u2019\1\71\1\uffff\1\71\1\uffff\1\71\1\uffff"+
		"\2\u2019\1\71\1\156\1\uffff\1\u2019\2\164\1\143\1\151\1\163\1\40\1\uffff"+
		"\1\40\1\123\1\144\1\104\1\156\1\40\1\145\1\151\1\167\1\160\1\146\1\55"+
		"\1\153\1\155\1\163\1\164\1\156\1\160\1\145\1\144\1\113\1\153\1\116\1\144"+
		"\1\156\1\143\3\156\1\165\1\157\1\165\1\151\1\164\1\154\2\164\1\150\1\145"+
		"\1\153\1\145\1\164\1\163\1\144\1\145\1\122\1\105\1\104\1\125\1\157\1\143"+
		"\1\164\2\163\1\165\1\154\1\147\1\156\1\151\1\150\1\143\1\157\1\145\1\172"+
		"\1\164\1\166\1\145\1\153\1\154\1\124\1\155\1\163\1\156\1\167\1\55\1\154"+
		"\1\162\1\145\1\144\1\141\1\153\1\156\1\155\1\153\1\154\1\40\1\164\1\162"+
		"\1\141\1\104\1\116\1\145\2\163\1\105\1\111\1\145\1\150\1\145\1\164\1\163"+
		"\1\162\1\164\1\145\1\164\1\141\1\150\1\155\1\144\1\145\1\165\2\154\1\145"+
		"\1\154\1\156\1\164\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\171\1\144"+
		"\1\125\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\157"+
		"\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\162\1\151\1\142\1\151\1\162"+
		"\1\164\1\156\1\151\1\145\1\144\1\164\1\u2019\1\151\1\145\1\u2019\1\40"+
		"\1\154\1\142\1\162\1\144\1\164\1\163\1\125\1\107\1\uffff\2\122\1\145\1"+
		"\40\1\uffff\1\145\1\40\1\122\1\163\1\123\1\162\1\122\1\157\1\153\1\154"+
		"\1\145\1\150\3\u2019\2\71\2\u2019\1\51\3\u2019\1\51\1\165\1\151\1\145"+
		"\1\150\1\141\2\40\1\141\1\101\1\u2019\1\162\1\143\1\40\1\157\1\151\2\157"+
		"\1\123\1\151\1\141\1\150\1\40\1\145\1\160\1\150\1\40\1\111\1\164\1\105"+
		"\1\40\1\146\1\144\2\151\1\157\1\164\1\153\1\171\1\162\1\160\1\164\1\171"+
		"\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\145\1\141\1\151\1\160\1\124"+
		"\1\120\1\101\1\122\1\144\1\145\1\162\1\164\1\163\1\156\1\145\1\154\1\144"+
		"\1\143\2\151\2\145\1\156\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162"+
		"\1\151\1\155\1\40\1\160\1\141\1\165\1\145\1\40\1\104\1\171\1\156\1\141"+
		"\1\40\1\151\1\154\1\171\1\145\1\142\1\145\3\151\1\156\1\111\1\104\1\162"+
		"\1\141\1\154\1\122\1\105\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\156"+
		"\1\162\1\156\1\163\1\141\1\151\1\162\1\40\1\145\1\151\1\145\1\154\1\144"+
		"\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150"+
		"\1\165\1\120\2\141\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\164"+
		"\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\u2019\1\156\1\162\1\164\1"+
		"\141\2\164\1\163\1\162\1\154\1\165\2\u2019\1\151\1\u2019\1\156\1\uffff"+
		"\1\171\1\157\1\151\1\145\1\167\1\145\1\114\1\40\2\71\1\164\1\126\1\151"+
		"\1\uffff\1\111\1\144\1\104\1\163\1\123\1\151\1\163\1\151\1\163\1\72\1"+
		"\u2019\1\uffff\2\71\1\uffff\1\71\1\u2019\1\71\1\u2019\1\uffff\1\164\1"+
		"\162\1\146\1\163\1\145\1\164\1\171\1\131\1\127\1\150\1\145\1\154\1\147"+
		"\1\143\1\154\1\165\1\120\1\156\1\162\1\40\1\163\1\145\1\141\1\116\1\150"+
		"\1\123\1\127\1\157\2\141\1\145\1\156\1\40\1\151\1\145\1\144\1\160\1\151"+
		"\1\150\1\162\1\141\1\40\1\151\1\40\1\170\1\171\2\163\1\111\1\123\1\131"+
		"\1\104\2\40\1\144\1\141\1\145\1\152\1\164\3\145\1\156\1\141\1\162\1\163"+
		"\2\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\u2019\1\156\1\157\1"+
		"\141\1\151\1\160\1\141\1\163\1\157\1\55\1\40\1\156\1\147\1\151\1\40\1"+
		"\143\1\145\1\162\1\145\1\156\2\145\1\116\1\40\1\141\1\164\1\141\1\101"+
		"\1\124\1\160\1\156\1\141\1\u2019\1\141\1\143\1\154\1\172\1\141\1\143\1"+
		"\150\1\164\1\145\1\155\2\163\1\142\1\154\1\40\1\163\1\103\1\150\1\171"+
		"\1\131\1\156\1\40\2\156\1\145\1\157\1\141\1\40\2\156\1\40\1\141\1\145"+
		"\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145\1\40\1\145\1\u2019\1\154"+
		"\1\156\1\u2019\1\147\1\157\1\163\1\157\1\u2019\1\145\1\150\1\141\1\145"+
		"\1\147\1\71\17\u2019\1\163\1\u2019\1\145\1\40\1\156\1\145\1\163\1\145"+
		"\1\154\1\101\1\uffff\2\u2019\1\141\1\156\1\105\1\141\1\101\1\144\1\104"+
		"\1\164\1\150\1\164\1\163\1\40\1\u2019\1\71\2\u2019\1\71\1\51\1\u2019\1"+
		"\51\1\145\1\40\1\146\1\145\1\163\1\165\2\54\1\uffff\1\157\1\u2019\1\153"+
		"\1\151\1\150\1\151\1\156\1\117\1\147\1\141\1\144\1\164\1\151\1\107\1\162"+
		"\1\104\1\uffff\1\162\1\157\1\167\2\165\1\145\2\162\2\154\1\151\1\u2019"+
		"\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\40\1\54\1\150\1\164"+
		"\1\116\1\124\1\54\1\101\1\u2019\1\156\1\154\1\151\1\40\1\u2019\1\144\1"+
		"\162\1\147\1\156\1\40\2\145\1\163\1\157\1\143\1\40\1\u2019\1\40\1\162"+
		"\1\40\1\147\1\163\1\157\1\145\1\150\1\145\1\167\1\103\1\40\1\141\1\145"+
		"\1\157\1\162\1\40\1\u2019\1\147\1\162\1\163\1\107\1\156\1\151\1\u2019"+
		"\1\116\1\131\1\151\1\40\1\154\1\156\1\141\1\151\1\145\1\154\1\145\1\165"+
		"\1\151\1\40\1\141\1\40\1\150\1\165\1\145\1\150\1\157\1\40\2\54\3\40\1"+
		"\162\1\165\1\164\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019\2\157\1\156"+
		"\1\162\1\156\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\162\1\40\1\156"+
		"\1\u2019\1\165\2\71\32\u2019\1\143\1\141\1\uffff\1\145\1\166\2\151\1\154"+
		"\2\122\1\156\1\147\1\122\1\171\1\131\1\141\1\101\1\172\1\151\1\171\1\40"+
		"\1\u2019\2\71\1\uffff\1\71\1\163\2\u2019\1\164\1\162\1\40\1\165\1\127"+
		"\1\40\1\141\1\40\1\164\1\144\1\122\1\40\1\156\1\141\1\u2019\1\162\1\40"+
		"\1\157\1\101\1\157\1\162\1\165\1\145\1\uffff\1\141\1\164\1\156\1\164\2"+
		"\144\1\40\1\163\2\40\1\u2019\1\171\1\162\1\150\1\155\1\u2019\1\144\1\156"+
		"\1\40\1\141\1\107\1\101\1\131\1\171\1\163\1\u2019\1\40\1\157\1\164\2\40"+
		"\1\162\1\40\1\165\1\153\1\163\1\u2019\1\164\1\156\1\141\1\165\1\40\1\156"+
		"\1\157\1\156\1\162\3\40\1\u2019\1\145\1\40\1\163\1\154\2\40\1\156\1\145"+
		"\1\40\1\156\1\141\1\154\1\151\1\144\1\156\1\141\1\156\1\40\1\143\1\156"+
		"\1\40\1\141\1\40\1\156\1\145\1\151\1\40\1\145\1\144\1\162\1\153\1\162"+
		"\1\40\1\144\1\147\1\u2019\1\156\1\163\1\145\1\40\1\u2019\1\151\1\145\37"+
		"\u2019\1\56\1\156\1\40\1\145\1\141\1\154\2\40\1\71\3\40\2\54\1\171\1\131"+
		"\1\143\1\162\1\u2019\1\uffff\1\71\1\u2019\1\73\1\71\1\40\2\145\1\uffff"+
		"\2\156\1\141\1\154\1\124\1\145\1\171\1\145\1\165\1\131\1\157\1\143\1\153"+
		"\1\144\1\143\1\155\1\55\1\164\1\145\1\163\1\40\1\101\1\u2019\1\54\1\153"+
		"\4\40\1\153\1\40\1\113\1\54\1\u2019\1\40\1\156\1\157\1\u2019\1\156\2\40"+
		"\1\151\1\40\1\153\1\141\1\40\1\141\2\40\1\122\2\u2019\1\151\1\163\2\40"+
		"\1\156\1\154\1\141\1\u2019\1\144\1\156\1\40\1\150\2\164\1\144\1\u2019"+
		"\1\143\1\40\3\u2019\2\40\1\145\1\u2019\1\145\1\40\1\141\1\163\37\u2019"+
		"\2\40\1\162\1\156\1\145\1\u2019\2\54\1\165\1\145\1\71\1\uffff\1\55\1\uffff"+
		"\1\162\1\40\1\144\1\40\1\156\1\141\1\111\1\162\1\54\1\144\1\147\1\54\1"+
		"\144\1\145\1\151\1\40\1\151\1\160\1\104\1\151\1\162\1\150\1\164\2\145"+
		"\1\105\1\u2019\1\156\1\144\1\146\1\145\1\u2019\1\164\1\145\1\127\1\164"+
		"\1\143\1\40\1\145\1\156\2\u2019\1\145\1\u2019\1\145\1\u2019\1\40\1\156"+
		"\1\162\1\u2019\1\156\1\145\26\u2019\1\51\5\u2019\1\163\1\141\1\154\1\u2019"+
		"\1\151\3\u2019\1\163\1\40\1\162\1\151\1\40\2\71\1\40\1\u2019\1\40\1\156"+
		"\1\116\1\u2019\1\40\1\150\2\40\1\156\1\141\1\151\1\157\1\156\1\141\1\151"+
		"\1\164\1\u2019\1\163\1\123\1\40\1\u2019\1\146\1\40\1\145\1\164\1\162\1"+
		"\157\1\145\1\165\1\171\1\150\1\162\1\40\1\162\1\144\3\u2019\1\40\32\u2019"+
		"\1\143\1\162\1\141\5\u2019\1\156\2\71\1\144\1\107\1\u2019\1\147\1\154"+
		"\1\157\1\167\1\147\1\156\2\162\2\40\1\u2019\1\144\1\162\1\164\1\u2019"+
		"\1\145\3\40\27\u2019\1\157\1\164\1\143\3\u2019\1\164\1\u2019\1\71\1\u2019"+
		"\3\40\2\156\1\40\1\163\1\145\1\141\1\40\1\151\1\145\1\162\22\u2019\1\142"+
		"\1\151\1\153\2\u2019\1\154\1\u2019\1\71\4\40\1\143\1\145\1\162\23\u2019"+
		"\1\55\3\u2019\1\151\2\u2019\1\164\1\166\1\141\20\u2019\1\103\4\u2019\1"+
		"\151\1\145\1\156\15\u2019\1\157\1\u2019\1\157\1\162\1\163\12\u2019\1\154"+
		"\1\u2019\1\156\2\40\11\u2019\1\157\1\u2019\1\40\10\u2019\1\162\32\u2019";
	static final String DFA74_acceptS =
		"\33\uffff\1\16\4\uffff\2\30\1\32\11\uffff\1\30\131\uffff\1\3\43\uffff"+
		"\1\25\1\uffff\1\16\1\uffff\1\26\4\uffff\1\24\7\uffff\1\15\u00ab\uffff"+
		"\1\11\4\uffff\1\7\u00cc\uffff\1\6\15\uffff\1\5\13\uffff\1\12\2\uffff\1"+
		"\21\4\uffff\1\27\u00bf\uffff\1\17\36\uffff\1\1\20\uffff\1\2\161\uffff"+
		"\1\13\51\uffff\1\10\25\uffff\1\20\33\uffff\1\4\u008f\uffff\1\31\7\uffff"+
		"\1\23\173\uffff\1\14\1\uffff\1\22\u0197\uffff";
	static final String DFA74_specialS =
		"\1\0\44\uffff\1\6\1\7\1\13\1\3\103\uffff\1\10\1\5\114\uffff\1\14\1\uffff"+
		"\1\2\123\uffff\1\1\1\12\170\uffff\1\4\1\11\u053b\uffff}>";
	static final String[] DFA74_transitionS = {
			"\11\42\2\33\2\42\1\33\22\42\1\33\5\42\2\41\1\34\3\42\2\41\1\37\1\42\1"+
			"\35\1\32\10\35\2\41\5\42\1\12\1\6\1\7\1\13\1\14\1\15\1\16\1\10\1\17\1"+
			"\20\1\21\1\22\1\1\1\3\1\2\1\23\1\40\1\24\1\5\1\25\1\30\1\11\1\4\1\26"+
			"\1\27\1\40\4\42\1\41\1\42\10\41\1\31\3\41\1\36\15\41\u1f9e\42\1\41\udfe6"+
			"\42",
			"\1\51\5\uffff\1\53\2\uffff\1\45\1\47\15\uffff\1\43\7\uffff\1\44\5\uffff"+
			"\1\52\2\uffff\1\46\1\50",
			"\1\56\3\uffff\1\55\3\uffff\1\57",
			"\1\62\25\uffff\1\61\11\uffff\1\60",
			"\1\71\11\uffff\1\67\21\uffff\1\70\3\uffff\1\64\2\uffff\1\65\1\66\5\uffff"+
			"\1\63",
			"\1\110\16\uffff\1\105\4\uffff\1\107\1\uffff\1\106\11\uffff\1\74\1\uffff"+
			"\1\75\1\uffff\1\76\2\uffff\1\77\1\100\1\uffff\1\101\3\uffff\1\102\1\73"+
			"\3\uffff\1\72\1\103\1\uffff\1\104",
			"\1\120\33\uffff\1\112\3\uffff\1\113\3\uffff\1\114\2\uffff\1\115\2\uffff"+
			"\1\116\2\uffff\1\111\2\uffff\1\117",
			"\1\130\21\uffff\1\123\3\uffff\1\124\2\uffff\1\121\1\125\2\uffff\1\126"+
			"\2\uffff\1\127\5\uffff\1\122",
			"\1\133\11\uffff\1\134\21\uffff\1\132\23\uffff\1\131",
			"\1\140\3\uffff\1\137\37\uffff\1\135\3\uffff\1\136",
			"\1\151\1\uffff\1\141\2\uffff\1\142\1\uffff\1\143\1\144\1\145\1\146\1"+
			"\uffff\1\147\4\uffff\1\150",
			"\1\154\16\uffff\1\152\15\uffff\1\153\2\uffff\1\155",
			"\1\156\11\uffff\1\157",
			"\1\164\26\uffff\1\160\2\uffff\1\161\2\uffff\1\162\2\uffff\1\163",
			"\1\172\22\uffff\1\165\3\uffff\1\166\2\uffff\1\167\2\uffff\1\170\2\uffff"+
			"\1\171",
			"\1\173\1\174\16\uffff\1\175\1\uffff\1\176",
			"\1\177",
			"\1\u0080\11\uffff\1\u0081\5\uffff\1\u0082",
			"\1\u0088\13\uffff\1\u0083\3\uffff\1\u0084\2\uffff\1\u0085\6\uffff\1"+
			"\u0087\u0086\uffff\1\u0086",
			"\1\u0089\3\uffff\1\u008a\2\uffff\1\u008b\3\uffff\1\u008c\2\uffff\1\u008d"+
			"\2\uffff\1\u0090\2\uffff\1\u008e\3\uffff\1\u008f",
			"\12\u0098\13\uffff\1\u0096\3\uffff\1\u0097\27\uffff\1\u0091\3\uffff"+
			"\1\u0092\2\uffff\1\u0093\6\uffff\1\u0094\5\uffff\1\u0095",
			"\1\u009d\2\uffff\1\u00a1\6\uffff\1\u009c\5\uffff\1\u009f\22\uffff\1"+
			"\u00a0\1\u0099\5\uffff\1\u009a\2\uffff\1\u009b\2\uffff\1\u009e",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a5\5\uffff\1\u00a4",
			"\1\u00a6",
			"\3\54\3\uffff\1\54\1\u00a7\1\54\1\uffff\12\u00a8\1\u00ab\1\u00a9\5\uffff"+
			"\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"",
			"\2\u00ae\2\uffff\1\u00ae\22\uffff\1\u00ae\5\uffff\2\u00af\4\uffff\2"+
			"\u00af\2\uffff\12\u00ad\2\u00af\5\uffff\32\u00b0\4\uffff\1\u00af\1\uffff"+
			"\32\u00af\u1f9e\uffff\1\u00af",
			"\3\54\3\uffff\1\54\1\u00b1\1\54\1\uffff\12\u00a8\1\u00ab\1\u00a9\5\uffff"+
			"\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u00b2",
			"\3\54\3\uffff\2\54\1\u00b4\1\uffff\14\54\5\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"",
			"",
			"",
			"\1\u00b6\1\uffff\1\u00b7\4\uffff\1\u00b5",
			"\1\u00b8\4\uffff\1\u00b9",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb\62\uffff\1\u00ba",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb\122\uffff\1\u00bc",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c4\3\uffff\1\u00c3",
			"\1\u00c5\25\uffff\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00cc\4\uffff\1\u00c9\2\uffff\1\u00ca\6\uffff\1\u00cb",
			"\1\u00cd",
			"\1\u00cf\5\uffff\1\u00ce",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d4\23\uffff\1\u00d3",
			"\1\u00d6\3\uffff\1\u00d5\3\uffff\1\u00d7",
			"\1\u00d8\2\uffff\1\u00d9\1\u00da\6\uffff\1\u00db",
			"\1\u00dc\6\uffff\1\u00dd",
			"\1\u00de\22\uffff\1\u00df",
			"\1\u00e0\3\uffff\1\u00e1",
			"\1\u00e2\11\uffff\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e7\4\uffff\1\u00e6",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ee\7\uffff\1\u00ef\5\uffff\1\u00ed\5\uffff\1\u00f0",
			"\1\u00f1",
			"\1\u00f2\2\uffff\1\u00f3\2\uffff\1\u00f6\4\uffff\1\u00f4\5\uffff\1\u00f5",
			"\1\u00f7",
			"\1\u00f8\15\uffff\1\u00f9\5\uffff\1\u00fa",
			"\1\u00fb\1\u00fc\1\uffff\1\u00fd\2\uffff\1\u00fe\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102\3\uffff\1\u0103\3\uffff\1\u0104\5\uffff\1\u0105",
			"\1\u0107\1\uffff\1\u0106",
			"\1\u0108\4\uffff\1\u0109\3\uffff\1\u010a\3\uffff\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f\10\uffff\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113\3\uffff\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0118\1\uffff\1\u0117",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126\10\uffff\1\u0127\1\uffff\1\u0128",
			"\1\u0129\4\uffff\1\u012a",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
			"\1\u012b\14\uffff\1\u012c",
			"\1\u012d",
			"\1\u012e\10\uffff\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132\3\uffff\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138\5\uffff\1\u0139",
			"\1\u013b\3\uffff\1\u013a",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142\14\uffff\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146\4\uffff\1\u0147\3\uffff\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"",
			"\1\u014b",
			"\1\u014c",
			"\1\u014f\6\uffff\1\u014d\1\uffff\1\u014e",
			"\1\u0150\1\uffff\1\u0151\6\uffff\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155\2\uffff\1\u0156\1\u0157\1\uffff\1\u0158\2\uffff\1\u0159",
			"\1\u015a\4\uffff\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015f\7\uffff\1\u015e",
			"\1\u0160\17\uffff\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\3\54\3\uffff\2\u0168\1\54\1\uffff\12\u0098\1\54\1\u0169\5\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u016a",
			"\1\u016c\130\uffff\1\u016b",
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
			"\10\u017a\1\u0179\1\u017a",
			"\3\54\3\uffff\1\54\1\u00b1\1\54\1\uffff\12\u00a8\1\u00ab\1\u00a9\5\uffff"+
			"\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\12\u017b",
			"",
			"\12\u017c",
			"",
			"\2\u017e\2\uffff\1\u017e\22\uffff\1\u017e\10\uffff\1\u017f\6\uffff\12"+
			"\u017d",
			"",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\1\u0180\4\uffff\2\u00af\1"+
			"\uffff\1\u0182\2\uffff\2\u00af\1\u0180\13\uffff\2\u00af\3\uffff\1\u0180"+
			"\37\uffff\1\u00af\1\uffff\32\u00af\u1f9e\uffff\1\u00af",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\1\u0184\4\uffff\2\u0183\1"+
			"\uffff\1\u0182\2\uffff\2\u0183\1\u0184\13\uffff\2\u0183\3\uffff\1\u0184"+
			"\1\uffff\32\u0183\4\uffff\1\u0183\1\uffff\32\u0183\u1f9e\uffff\1\u0183",
			"\12\u017a",
			"\1\u0185",
			"",
			"\3\54\3\uffff\2\54\1\u00b4\1\uffff\14\54\5\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
			"",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u0086",
			"\1\u018f",
			"\1\u0191\7\uffff\1\u0190",
			"\1\u0192\20\uffff\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
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
			"\1\u01a3\7\uffff\1\u01a4",
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
			"\1\u01b1\5\uffff\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1\22\uffff\1\u01c2",
			"\1\u01c3",
			"\1\u01c4\15\uffff\1\u01c5",
			"\1\u01c6\12\uffff\1\u01c7\2\uffff\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb\6\uffff\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2\25\uffff\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc\5\uffff\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2\3\uffff\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb\113\uffff\1\u01ea",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
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
			"\1\u0202",
			"\1\u0203\5\uffff\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u0086",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213\27\uffff\1\u0214",
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
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0237",
			"\1\u0238",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0086",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"",
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"\1\u0245",
			"",
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
			"\3\54\3\uffff\1\54\1\u0254\1\54\1\uffff\1\u0252\11\u017a\1\54\1\u00a9"+
			"\5\uffff\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\3\54\3\uffff\1\54\1\u0254\1\54\1\uffff\12\u017a\1\54\1\u00a9\5\uffff"+
			"\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\3\54\3\uffff\1\54\1\u0255\1\54\1\uffff\12\u017b\1\54\1\u00a9\5\uffff"+
			"\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\u0256\2\uffff\1\u0256\22\uffff\1\u0256\17\uffff\12\u017c",
			"\2\u017e\2\uffff\1\u017e\22\uffff\1\u017e\10\uffff\1\u017f\6\uffff\12"+
			"\u0257",
			"\2\u017e\2\uffff\1\u017e\22\uffff\1\u017e\5\uffff\2\u0258\1\uffff\1"+
			"\u00ae\2\uffff\2\u0258\2\uffff\12\u0259\2\u0258\5\uffff\32\u025a\4\uffff"+
			"\1\u0258\1\uffff\32\u0258\u1f9e\uffff\1\u0258",
			"\3\54\3\uffff\3\54\1\uffff\14\54\5\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\10\uffff\1\u0182",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\5\uffff\2\u0258\4\uffff\2"+
			"\u0258\2\uffff\12\u0259\2\u0258\5\uffff\32\u025a\4\uffff\1\u0258\1\uffff"+
			"\32\u0258\u1f9e\uffff\1\u0258",
			"\3\54\3\uffff\3\54\1\uffff\14\54\5\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\1\u0184\4\uffff\2\u0183\1"+
			"\uffff\1\u0182\2\uffff\2\u0183\1\u0184\13\uffff\2\u0183\3\uffff\1\u0184"+
			"\1\uffff\32\u0183\4\uffff\1\u0183\1\uffff\32\u0183\u1f9e\uffff\1\u0183",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\10\uffff\1\u0182",
			"\1\u025c",
			"\1\u025d\3\uffff\1\u025e",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
			"\2\u00bb\2\uffff\1\u00bb\22\uffff\1\u00bb",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0265",
			"\1\u0266",
			"\1\u0086",
			"\1\u0267",
			"\1\u0268\3\uffff\1\u0269",
			"\1\u026a",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0086",
			"\1\u0270",
			"\1\u0271",
			"\1\u0086\107\uffff\1\u0272",
			"\1\u0239",
			"\1\u0273",
			"\1\u0274",
			"\1\u0275",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
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
			"\1\u0086",
			"\1\u0286",
			"\1\u0287",
			"\1\u0086",
			"\1\u0086",
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
			"\1\u02a3",
			"\1\u02a4",
			"\1\u02a5",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u0086\103\uffff\1\u02a9\10\uffff\1\u02aa",
			"\1\u0247",
			"\1\u02ab",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\1\u0086",
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u0086",
			"\1\u02b3",
			"\1\u02b4",
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
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u0086",
			"\1\u02d2",
			"\1\u02d3",
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
			"\1\u0086",
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
			"\1\u02f1",
			"\1\u02f2",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u02f5",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\22\54\1\u02f6\7\54\u1f9e\uffff\1\54",
			"\1\u02f7",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\4\uffff\2\54\2\uffff\1\54\1\u0301\12\54\5\uffff\1\u0302\1\u0303"+
			"\1\u0304\1\54\1\u0305\1\u0306\1\u0307\1\54\1\u0308\1\54\1\u0309\1\u030a"+
			"\1\u030b\1\u030c\3\54\1\u030d\1\u030e\1\u030f\2\54\1\u0310\3\54\4\uffff"+
			"\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0311",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\12\54\1\u0312\7\54\1"+
			"\u0234\7\54\u1f9e\uffff\1\54",
			"\1\u0313",
			"",
			"\1\u0314",
			"\1\u0315",
			"\1\u0316",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\2\u031b\2\uffff\1\u031b\22\uffff\1\u031b",
			"\12\u031c",
			"\12\u031d",
			"\1\u031e",
			"\1\u0086\17\uffff\1\u0247",
			"\1\u031f",
			"",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\3\54\3\uffff\1\54\1\u0254\1\54\1\uffff\1\u032a\11\u017a\1\54\1\u00a9"+
			"\5\uffff\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"",
			"\12\u032b",
			"\12\u032c",
			"",
			"\2\u017e\2\uffff\1\u017e\22\uffff\1\u017e\10\uffff\1\u032d\6\uffff\12"+
			"\u032e",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\1\u032f\4\uffff\2\u0258\1"+
			"\uffff\1\u0182\2\uffff\2\u0258\1\u032f\13\uffff\2\u0258\3\uffff\1\u032f"+
			"\37\uffff\1\u0258\1\uffff\32\u0258\u1f9e\uffff\1\u0258",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\10\uffff\1\u0182\6\uffff\12"+
			"\u0259",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\1\u0331\4\uffff\2\u0330\1"+
			"\uffff\1\u0182\2\uffff\2\u0330\1\u0331\13\uffff\2\u0330\3\uffff\1\u0331"+
			"\1\uffff\32\u0330\4\uffff\1\u0330\1\uffff\32\u0330\u1f9e\uffff\1\u0330",
			"",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\1\u0338",
			"\1\u0339",
			"\3\u0239\1\uffff\1\u0239\1\uffff\1\u0239\1\uffff\2\u033a\3\uffff\3\u0239"+
			"\2\uffff\1\u033a\1\uffff\3\u0239",
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
			"\1\u0086",
			"\1\u0345",
			"\1\u0346",
			"\1\u0347",
			"\1\u0348",
			"\1\u0349",
			"\1\u034a",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276\41\uffff\1\u034c\1\u034f\4"+
			"\uffff\1\u0350\12\uffff\1\u034e\2\uffff\1\u0351\1\u034d",
			"\1\u0352",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\1\u0086",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359",
			"\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u0086",
			"\1\u035f",
			"\1\u0086",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\1\u0364",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
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
			"\1\u0374",
			"\1\u0375",
			"\1\u0086",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u037c",
			"\1\u037d",
			"\1\u037e",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"\1\u0383",
			"\1\u0384",
			"\1\u0086",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\1\u0086",
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\1\u038b",
			"\1\u038c",
			"\1\u038d",
			"\1\u038e",
			"\1\u038f",
			"\1\u0247",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
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
			"\1\u0086\122\uffff\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\1\u0086",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u0086",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u0086\104\uffff\1\u03ae",
			"\1\u03af",
			"\1\u03b0",
			"\1\u031b",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u0086",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u0086",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u0086",
			"\1\u03bc",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u03be",
			"\1\u03bf",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u03c0",
			"\1\u03c1",
			"\1\u0086\122\uffff\1\u03c2",
			"\1\u03c3",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\1\u03c7",
			"\1\u03c8",
			"\2\54\2\uffff\1\54\22\uffff\1\54\10\uffff\1\54\6\uffff\3\54\1\u03c9"+
			"\1\54\1\u03ca\4\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\14"+
			"\54\1\u03cb\15\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u03cd\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\16\54\1\u03cc\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u03ce\3\54\1\u03cf\2\54\1\u03d0\5\54\1\u03d1\5\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u03d2\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u03d3\2\54\1\u03d4\16\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u03d5\11\54\1\u03d6\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u03d7\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u03d8\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u03d9"+
			"\15\54\1\u03da\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u03db\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u03dc\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u03dd\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\14"+
			"\54\1\u03de\6\54\1\u03df\1\u03e0\5\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u03e1\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u03e2\2\54\1\u03e3\1\u03e4\21\54\u1f9e\uffff\1\54",
			"\1\u03e5",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u03e6",
			"\1\u03e7",
			"\1\u03e8",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"\1\u03ec",
			"\1\u03ed",
			"",
			"\3\54\3\uffff\2\u0168\1\54\1\uffff\12\u031c\1\54\1\u0169\5\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\3\54\3\uffff\2\u03ee\1\54\1\uffff\12\u031d\1\54\1\u0169\5\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u03ef",
			"\1\u03f0",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"\1\u03f4",
			"\1\u03f5",
			"\1\u03f6",
			"\1\u03f7",
			"\1\u03f8",
			"\1\u03f9",
			"\1\u0167",
			"\3\54\3\uffff\1\54\1\u03fa\1\54\1\uffff\12\u017a\1\54\1\u00a9\5\uffff"+
			"\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u03fb\2\uffff\12\u032b",
			"\3\54\3\uffff\1\54\1\u03fc\1\54\1\uffff\12\u032c\1\54\1\u00a9\5\uffff"+
			"\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\3\54\3\uffff\3\54\1\uffff\12\u03fe\2\54\5\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\u017e\2\uffff\1\u017e\22\uffff\1\u017e\10\uffff\1\u017f\6\uffff\12"+
			"\u032e",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\10\uffff\1\u0182",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\1\u0331\4\uffff\2\u0330\1"+
			"\uffff\1\u0182\2\uffff\2\u0330\1\u0331\13\uffff\2\u0330\3\uffff\1\u0331"+
			"\1\uffff\32\u0330\4\uffff\1\u0330\1\uffff\32\u0330\u1f9e\uffff\1\u0330",
			"\2\u0181\2\uffff\1\u0181\22\uffff\1\u0181\10\uffff\1\u0182",
			"\1\u03ff",
			"\1\u033a",
			"\1\u0400",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\1\u0404",
			"",
			"\1\u0405",
			"\1\u0406\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
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
			"\1\u0411",
			"\1\u0412",
			"\1\u0413",
			"\1\u0414",
			"",
			"\1\u034b\10\uffff\1\u0415",
			"\1\u0416",
			"\1\u0418\3\uffff\1\u0417\2\uffff\1\u0419",
			"\1\u041a\14\uffff\1\u041b",
			"\1\u041c",
			"\1\u041d",
			"\1\u041e",
			"\1\u041f",
			"\1\u0420",
			"\1\u0421",
			"\1\u0422\3\uffff\1\u0423",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0424",
			"\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"\1\u0428",
			"\1\u0429",
			"\1\u042a",
			"\1\u042b",
			"\1\u0086",
			"\1\u0404",
			"\1\u042c",
			"\1\u042d",
			"\1\u042e",
			"\1\u042f",
			"\1\u0404",
			"\1\u0430",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0431",
			"\1\u0432",
			"\1\u0433",
			"\1\u0086",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0434",
			"\1\u0435",
			"\1\u0436",
			"\1\u0437",
			"\1\u0086",
			"\1\u0438",
			"\1\u0439",
			"\1\u0086\122\uffff\1\u043a",
			"\1\u043b",
			"\1\u043c",
			"\1\u0086",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0086",
			"\1\u043d",
			"\1\u0086",
			"\1\u043e",
			"\1\u043f",
			"\1\u0440",
			"\1\u0441",
			"\1\u0442",
			"\1\u0443",
			"\1\u0444",
			"\1\u0445",
			"\1\u0086",
			"\1\u0446",
			"\1\u0447",
			"\1\u0448",
			"\1\u0449",
			"\1\u0086",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d",
			"\1\u044e",
			"\1\u044f",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0450",
			"\1\u0451",
			"\1\u0452",
			"\1\u0086",
			"\1\u0453",
			"\1\u0454",
			"\1\u0455",
			"\1\u0456",
			"\1\u0457",
			"\1\u0458",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\1\u0086",
			"\1\u045c",
			"\1\u0086",
			"\1\u045d",
			"\1\u045e",
			"\1\u045f",
			"\1\u0460",
			"\1\u0461",
			"\1\u0086",
			"\1\u0404",
			"\1\u0404",
			"\1\u0086",
			"\1\u0086",
			"\1\u0086",
			"\1\u0462",
			"\1\u0463",
			"\1\u0464",
			"\1\u0086",
			"\1\u0465",
			"\1\u0466",
			"\1\u0467",
			"\1\u0468",
			"\1\u0469",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\16\54\1\u046a\3\54\1"+
			"\u0234\7\54\u1f9e\uffff\1\54",
			"\1\u046b",
			"\1\u046c",
			"\1\u046d",
			"\1\u046e",
			"\1\u046f",
			"",
			"\1\u0470",
			"\1\u0086",
			"\1\u0471",
			"\1\u0472",
			"\1\u0086",
			"\1\u0473",
			"\1\u0474",
			"\1\u0086",
			"\1\u0475",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0476",
			"\2\54\2\uffff\1\54\22\uffff\1\u0477\10\uffff\1\54\6\uffff\12\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0478\10\uffff\1\54\6\uffff\12\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0479\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\30"+
			"\54\1\u047a\1\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\1\u047b\1\54\4\uffff\2\54\2"+
			"\uffff\14\54\5\uffff\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u047c\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\24"+
			"\54\1\u047d\5\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u047e\10\54\1\u047f\16\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0480\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
			"\1\u0481\23\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0482\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0483"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0484\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\13"+
			"\54\1\u0485\5\54\1\u0486\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u0487\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\2\54\1\u0488\27\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\54"+
			"\1\u0489\30\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u048a\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u048b\4\54\1\u048c\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\25"+
			"\54\1\u048d\4\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\24"+
			"\54\1\u048e\5\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u048f\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0490"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u0491\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\30"+
			"\54\1\u0492\1\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\13"+
			"\54\1\u0493\16\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u0494\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0495\10\54\u1f9e\uffff\1\54",
			"\1\u0496",
			"\1\u0497",
			"",
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
			"\1\u04a6",
			"\1\u04a7",
			"\1\u04a8",
			"\1\u04a9",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\12\u04aa\2\54\3\uffff\1\54\1"+
			"\uffff\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\12\u04ab",
			"\12\u04ac",
			"",
			"\12\u04ad",
			"\1\u04ae",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u04af",
			"\1\u04b0",
			"\2\u04b1\2\uffff\1\u04b1\22\uffff\1\u04b1",
			"\1\u04b2",
			"\3\u0239\1\uffff\1\u0239\1\uffff\1\u0239\1\uffff\2\u033a\3\uffff\3\u0239"+
			"\2\uffff\1\u033a\1\uffff\3\u0239",
			"\1\u0086",
			"\1\u04b3",
			"\1\u0086",
			"\1\u04b4",
			"\1\u04b5",
			"\1\u04b6",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\1\u04b7",
			"\1\u04b8",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u04b9",
			"\1\u0247",
			"\1\u04ba",
			"\1\u04bb",
			"\1\u04bd\15\uffff\1\u04bc",
			"\1\u04be",
			"\1\u04bf",
			"\1\u04c0",
			"",
			"\1\u04c1",
			"\1\u04c2",
			"\1\u04c3",
			"\1\u04c4",
			"\1\u04c5",
			"\1\u04c6",
			"\1\u04c7",
			"\1\u04c8",
			"\1\u0086",
			"\1\u0086",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u04c9",
			"\1\u04ca",
			"\1\u04cb",
			"\1\u04cc",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u04cd",
			"\1\u04ce",
			"\1\u0086",
			"\1\u04cf",
			"\1\u04d0",
			"\1\u04d1",
			"\1\u04d2",
			"\1\u04d3",
			"\1\u04d4",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0086",
			"\1\u04d5",
			"\1\u04d6",
			"\1\u0086",
			"\1\u0086",
			"\1\u04d7",
			"\1\u0086",
			"\1\u04d8",
			"\1\u04d9",
			"\1\u0086\122\uffff\1\u04da",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u04db",
			"\1\u04dc",
			"\1\u04dd",
			"\1\u04de",
			"\1\u0086",
			"\1\u04df",
			"\1\u04e0",
			"\1\u04e1",
			"\1\u04e2",
			"\1\u0086",
			"\1\u0086",
			"\1\u04e3",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u04e4",
			"\1\u0247",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276\122\uffff\1\u04e5",
			"\1\u04e6",
			"\1\u0247",
			"\1\u03bd",
			"\1\u04e7",
			"\1\u04e8",
			"\1\u0086",
			"\1\u04e9",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"\1\u04ed",
			"\1\u04ee",
			"\1\u04ef",
			"\1\u04f0",
			"\1\u0086",
			"\1\u04f1",
			"\1\u04f2",
			"\1\u0086",
			"\1\u04f3",
			"\1\u0086",
			"\1\u04f4",
			"\1\u04f5",
			"\1\u04f6",
			"\1\u0086",
			"\1\u04f7",
			"\1\u04f8",
			"\1\u04f9",
			"\1\u04fa",
			"\1\u04fb",
			"\1\u0086",
			"\1\u04fc",
			"\1\u04fd",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u04fe",
			"\1\u04ff",
			"\1\u0500",
			"\1\u0086",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0501",
			"\1\u0502",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\10\54\1\u0503\21\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\10\54\1\u0504\21\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0505\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\12"+
			"\54\1\u0506\17\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0507\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\37\uffff\1\54\1\uffff\32\54\u1f9e"+
			"\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u0508\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\14"+
			"\54\1\u0509\15\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\12"+
			"\54\1\u050a\17\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u050b\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\13"+
			"\54\1\u050c\16\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\13"+
			"\54\1\u050d\16\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\13"+
			"\54\1\u050e\16\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u050f\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\14"+
			"\54\1\u0510\15\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u0511\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u0512\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u0513\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0514\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0515\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
			"\1\u0516\23\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u0517\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u0518\27\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0519"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
			"\1\u051a\23\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u051b\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u051c\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u051d\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u051f\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u0520\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0521\25\54\u1f9e\uffff\1\54",
			"\1\u0522",
			"\1\u0523",
			"\1\u0086",
			"\1\u0524",
			"\1\u0525",
			"\1\u0526",
			"\1\u0086",
			"\1\u0247",
			"\12\u0527",
			"\1\u0086",
			"\1\u0086",
			"\1\u0247",
			"\1\u0404",
			"\1\u0404",
			"\1\u0528",
			"\1\u0529",
			"\1\u052a",
			"\1\u052b",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"",
			"\1\u03fb\2\uffff\12\u052c",
			"\3\54\3\uffff\3\54\1\uffff\12\u04ab\2\54\5\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\12\u04ac\1\uffff\1\u00a9",
			"\12\u052e",
			"\1\u052f",
			"\1\u0530",
			"\1\u0531",
			"",
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
			"\1\u053f",
			"\1\u0540",
			"\1\u0541",
			"\1\u0542",
			"\1\u0543",
			"\1\u0544",
			"\1\u0545",
			"\1\u0086",
			"\1\u0546",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0404",
			"\1\u0547",
			"\1\u0086",
			"\1\u0086",
			"\1\u0086",
			"\1\u0086",
			"\1\u0548",
			"\1\u0247",
			"\1\u0549",
			"\1\u0404",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0086",
			"\1\u054a",
			"\1\u054b",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u054c",
			"\1\u0086",
			"\1\u0086",
			"\1\u054d",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\1\u054e",
			"\1\u054f",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\1\u0550",
			"\1\u0086",
			"\1\u0086",
			"\1\u0551",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0552\1\54\4\uffff\3\54\3\uffff"+
			"\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\1\u0553",
			"\1\u0554",
			"\1\u0086",
			"\1\u0086",
			"\1\u0555",
			"\1\u0556",
			"\1\u0557",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0558",
			"\1\u0559",
			"\1\u0086",
			"\1\u055a",
			"\1\u055b",
			"\1\u055c",
			"\1\u055d",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u055e",
			"\1\u0086",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\4\54\1\u055f\15\54\1"+
			"\u0234\7\54\u1f9e\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0086",
			"\1\u0086",
			"\1\u0560",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0561",
			"\1\u0086",
			"\1\u0562",
			"\1\u0563",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u0564\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u0565\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u0566\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u0567\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\17\54\1\u0568\12\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0569"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\54"+
			"\1\u056a\30\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u056b\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u056c\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\30"+
			"\54\1\u056d\1\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u056e\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u056f\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\1"+
			"\54\1\u0570\1\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0571"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0572\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u0573\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u0574\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\1\u0575\1\54\4\uffff\2\54\2"+
			"\uffff\14\54\5\uffff\32\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0576"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0577\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\7\54\1\u0578\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0579"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\2"+
			"\54\1\u057a\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u057b\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u057c\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u057d\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u057e\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u057f\25\54\u1f9e\uffff\1\54",
			"\2\54\1\u0583\3\uffff\3\54\1\uffff\14\54\5\uffff\1\u0580\1\u0582\12"+
			"\54\1\u0584\2\54\1\u0581\12\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u0585\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0586\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7"+
			"\54\1\u0587\22\54\u1f9e\uffff\1\54",
			"\1\u0086",
			"\1\u0086",
			"\1\u0588",
			"\1\u0589",
			"\1\u058a",
			"\3\54\3\uffff\2\u03ee\1\54\1\uffff\12\u0527\1\54\1\u0169\5\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0404",
			"\1\u0404",
			"\1\u058b",
			"\1\u058c",
			"\1\u03fb\2\uffff\12\u058d",
			"",
			"\1\u058e",
			"",
			"\1\u058f",
			"\1\u0086",
			"\1\u0590",
			"\1\u0086",
			"\1\u0591",
			"\1\u0592",
			"\1\u0593",
			"\1\u0594",
			"\1\u0404",
			"\1\u0595",
			"\1\u0596",
			"\1\u0404",
			"\1\u0597",
			"\1\u0598",
			"\1\u0599",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\1\u059a",
			"\1\u059b",
			"\1\u059c",
			"\1\u059d",
			"\1\u059e",
			"\1\u059f",
			"\1\u05a0",
			"\1\u05a1",
			"\1\u05a2",
			"\1\u05a3",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u05a4",
			"\1\u05a5",
			"\1\u05a6",
			"\1\u05a7",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u05a8",
			"\1\u05a9",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276\40\uffff\1\u0239\1\u05aa\1"+
			"\u05ad\1\uffff\1\u0239\1\uffff\1\u0239\1\u0350\5\uffff\3\u0239\2\uffff"+
			"\1\u034e\1\uffff\1\u0239\1\u05ac\1\u05ab",
			"\1\u05ae",
			"\1\u05af",
			"\1\u0086",
			"\1\u05b0",
			"\1\u05b1",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u05b2",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u05b3",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0086",
			"\1\u05b4",
			"\1\u05b5",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u05b6",
			"\1\u05b7",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u05b8\27\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u05b9\27\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u05ba\27\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u05bb\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u05bc\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\17"+
			"\54\1\u05bd\12\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u05be\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u05bf\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u05c0\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\1"+
			"\54\1\u05c1\1\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u05c2\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\2\54\1\u05c3\27\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u05c4\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u05c5\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u05c6\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u05c7\1\54\4\uffff\2\54\1\uffff\1\u051e"+
			"\2\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1"+
			"\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u05c8\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\37\uffff\1\54\1\uffff\32\54\u1f9e"+
			"\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u05c9\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\2\54\1\u05ca\27\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u05cb"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u05cc\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u05cd\10\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\22\54\1\u05ce\7\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u05cf\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u05d0"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\27"+
			"\54\1\u05d1\2\54\u1f9e\uffff\1\54",
			"\1\u05d2",
			"\1\u05d3",
			"\1\u05d4",
			"\2\54\4\uffff\2\54\2\uffff\14\54\5\uffff\14\54\1\u05d5\15\54\4\uffff"+
			"\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0311",
			"\2\54\2\uffff\1\54\22\uffff\1\u05d6\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u05d7"+
			"\31\54\u1f9e\uffff\1\54",
			"\1\u05d8",
			"\1\u0086",
			"\1\u05d9",
			"\1\u05da",
			"\1\u0086",
			"\1\u05db\2\uffff\12\u032b",
			"\12\u05dc",
			"\1\u0086",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0086",
			"\1\u05dd",
			"\1\u05de",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0086",
			"\1\u05df",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\1\u05e0",
			"\1\u05e1",
			"\1\u05e2",
			"\1\u05e3",
			"\1\u05e4",
			"\1\u05e5",
			"\1\u05e6",
			"\1\u05e7",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u05e8",
			"\1\u05e9",
			"\1\u0086",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u05ea",
			"\1\u0086",
			"\1\u05eb",
			"\1\u05ec",
			"\1\u034b\10\uffff\1\u0415",
			"\1\u0239\7\uffff\1\u0239\5\uffff\1\u0416",
			"\1\u05ed",
			"\1\u041a\3\uffff\1\u0239\10\uffff\1\u041b",
			"\1\u05ee",
			"\1\u05ef",
			"\1\u05f0",
			"\1\u0086",
			"\1\u05f1",
			"\1\u05f2",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0086",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u05f3\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u05f4\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u05f5"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\2\54\1\u05f6\27\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u05f7\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u05f8\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u05f9\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\2\54\1\u05fa\27\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u05fb\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u05fc\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u05fd\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\21\54\1\u05fe\4\54\1\u05ff\3\54\4\uffff\1\54\1\uffff\32\54"+
			"\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\21\54\1\u0600\10\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u0601\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u0602\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u0603\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\24"+
			"\54\1\u0604\5\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\1\54\1\u0606\1\54\1\u0605\26\54\4\uffff\1\54\1\uffff\32\54"+
			"\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u0607\27\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0608\1\54\4\uffff\2\54\1\uffff\1\u051e"+
			"\2\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1"+
			"\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0609\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\1\u060a",
			"\1\u060b",
			"\1\u060c",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u060d\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\22\54\1\u060e\7\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u060f\21\54\u1f9e\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0610",
			"\12\u0611",
			"\12\u0612",
			"\1\u0613",
			"\1\u0614",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0615",
			"\1\u0616",
			"\1\u0617",
			"\1\u0618",
			"\1\u0619",
			"\1\u061a",
			"\1\u061b",
			"\1\u061c",
			"\2\u0419\2\uffff\1\u0419\22\uffff\1\u0419",
			"\1\u0247",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u061d",
			"\1\u061e",
			"\1\u0239\1\uffff\1\u061f",
			"\1\54\4\uffff\3\54\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1\uffff\32"+
			"\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0620",
			"\1\u0086",
			"\1\u0086",
			"\1\u0086",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u0621\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0622"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u0623\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0624\1\54\4\uffff\2\54\1\uffff\1\u051e"+
			"\2\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1"+
			"\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0625"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\22\54\1\u0626\3\54\1\u0627\3\54\4\uffff\1\54\1\uffff\32\54"+
			"\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0628\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0629"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u062a\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u062b"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u062c\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u062d\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u062e\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u062f\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u0630\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\2\54\1\u0631\27\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u0632\26\54\u1f9e\uffff\1\54",
			"\1\u0633",
			"\1\u0634",
			"\1\u0635",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u048c\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\17"+
			"\54\1\u0636\12\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0637\10\54\u1f9e\uffff\1\54",
			"\1\u0638",
			"\3\54\3\uffff\3\54\1\uffff\12\u0639\2\54\5\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\12\u063a",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\1\u0247",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\1\u04c7",
			"\1\u063b",
			"\1\u063c",
			"\1\u04e3",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276\122\uffff\1\u063d",
			"\1\u063e",
			"\1\u063f",
			"\1\u0086",
			"\1\u0640",
			"\1\u0641",
			"\1\u0642",
			"\2\54\2\uffff\1\54\22\uffff\1\u0643\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\12"+
			"\54\1\u0644\17\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0645"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\2\54\1\u0646\17\54\1\u0647\7\54\4\uffff\1\54\1\uffff\32\54"+
			"\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u0648\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u0649\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u064a\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u064b\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u064c\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u064d\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u064e\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u064f\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
			"\1\u0650\23\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u0651\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u0652\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u0653\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\1\u0654",
			"\1\u0655",
			"\1\u0656",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0657\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0658\25\54\u1f9e\uffff\1\54",
			"\1\u0659",
			"\3\54\3\uffff\3\54\1\uffff\12\u065a\2\54\5\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\12\u065b",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\1\u0086",
			"\1\u065c",
			"\1\u065d",
			"\1\u065e",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\26\54\1\u065f\3\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0660\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u0661\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u0662\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\17"+
			"\54\1\u0663\12\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0664\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u0665\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0666\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0667\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0668\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u0669\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u066b\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u066a\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u066c\27\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u066d\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u066e"+
			"\31\54\u1f9e\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0583\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u066f",
			"\1\54\4\uffff\2\54\1\u0583\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u0670\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u0671\26\54\u1f9e\uffff\1\54",
			"\1\u0672",
			"\3\54\3\uffff\3\54\1\uffff\12\u0673\2\54\5\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\3\54\3\uffff\3\54\1\uffff\14\54\5\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\1\u0674",
			"\1\u0675",
			"\1\u0676",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0677"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0678\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0679\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u067a\27\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u067b\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u067c\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u067d\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u067e\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\1\u067f\31\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u0680\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u066b\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\3\54\3\uffff\3\54\1\uffff\14\54\5\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u0681\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0682"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u0683\6\54\u1f9e\uffff\1\54",
			"\1\u0684",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u0685\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0235\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\22\54\1\u0234\7\54\u1f9e"+
			"\uffff\1\54",
			"\3\54\3\uffff\3\54\1\uffff\12\u04ab\2\54\5\uffff\32\54\4\uffff\1\54"+
			"\1\uffff\32\54\u1f9e\uffff\1\54",
			"\1\u0686",
			"\1\u0687",
			"\1\u0688",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u0689\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\1\54\1\u068a\30\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u068b\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\12"+
			"\54\1\u068c\17\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u068d\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u068e\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u068f\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u0690\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u066b\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4"+
			"\54\1\u0691\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u0692\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\1\u0693",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
			"\1\u0694\23\54\u1f9e\uffff\1\54",
			"\1\u0695",
			"\1\u0696",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276\122\uffff\1\u0697",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u0698\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u0699"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u069a\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u069b\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u069c\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u069d"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u069e\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\22"+
			"\54\1\u069f\7\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\3\54\1\u06a0\26\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\1\u06a1",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u06a2\25\54\u1f9e\uffff\1\54",
			"\1\u06a3",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0552",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u06a4\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\30"+
			"\54\1\u06a5\1\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u06a6\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
			"\1\u06a7\23\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\1\u06a8"+
			"\31\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u06a9\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u06aa\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u066b\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\24"+
			"\54\1\u06ab\5\54\u1f9e\uffff\1\54",
			"\1\u06ac",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u06ad\10\54\u1f9e\uffff\1\54",
			"\2\u0276\2\uffff\1\u0276\22\uffff\1\u0276",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u06ae\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u06af\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u06b0\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\26\54\1\u06b1\3\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
			"\1\u06b2\27\54\u1f9e\uffff\1\54",
			"\1\u06b3",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u06b4\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\21"+
			"\54\1\u06b5\10\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u06b6\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
			"\1\u06b7\22\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\12"+
			"\54\1\u06b8\17\54\u1f9e\uffff\1\54",
			"\1\54\4\uffff\2\54\1\u0583\3\uffff\3\54\1\uffff\14\54\3\uffff\1\54\1"+
			"\uffff\14\54\1\u0236\15\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u06b9\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u06ba\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u06bb\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\u06bc\1\54\4\uffff\2\54\1\uffff\1\54\2"+
			"\uffff\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff"+
			"\32\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
			"\1\u06bd\26\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\23"+
			"\54\1\u06be\6\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\1\54\5\uffff\2\54\4\uffff\2\54\2\uffff\14"+
			"\54\5\uffff\23\54\1\u06bf\6\54\4\uffff\1\54\1\uffff\32\54\u1f9e\uffff"+
			"\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
			"\1\u06c0\25\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\16"+
			"\54\1\u06c1\13\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\13"+
			"\54\1\u06c2\16\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\13"+
			"\54\1\u06c3\16\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\10"+
			"\54\1\u06c4\21\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\15"+
			"\54\1\u06c5\14\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\54\2\uffff\3"+
			"\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
			"\1\u06c6\23\54\u1f9e\uffff\1\54",
			"\2\54\2\uffff\1\54\22\uffff\2\54\4\uffff\2\54\1\uffff\1\u051e\2\uffff"+
			"\3\54\13\uffff\2\54\3\uffff\1\54\1\uffff\32\54\4\uffff\1\54\1\uffff\32"+
			"\54\u1f9e\uffff\1\54"
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
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_CLASSIFIER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | FOLLOWING_TIME | DATE | ELLIPSIS | INT | PARENTHETICAL_INT | PARENTHETICAL | COMMENT | GROUP_ENDING_ANNOUNCEMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA74_0 = input.LA(1);
						s = -1;
						if ( (LA74_0=='M') ) {s = 1;}
						else if ( (LA74_0=='O') ) {s = 2;}
						else if ( (LA74_0=='N') ) {s = 3;}
						else if ( (LA74_0=='W') ) {s = 4;}
						else if ( (LA74_0=='S') ) {s = 5;}
						else if ( (LA74_0=='B') ) {s = 6;}
						else if ( (LA74_0=='C') ) {s = 7;}
						else if ( (LA74_0=='H') ) {s = 8;}
						else if ( (LA74_0=='V') ) {s = 9;}
						else if ( (LA74_0=='A') ) {s = 10;}
						else if ( (LA74_0=='D') ) {s = 11;}
						else if ( (LA74_0=='E') ) {s = 12;}
						else if ( (LA74_0=='F') ) {s = 13;}
						else if ( (LA74_0=='G') ) {s = 14;}
						else if ( (LA74_0=='I') ) {s = 15;}
						else if ( (LA74_0=='J') ) {s = 16;}
						else if ( (LA74_0=='K') ) {s = 17;}
						else if ( (LA74_0=='L') ) {s = 18;}
						else if ( (LA74_0=='P') ) {s = 19;}
						else if ( (LA74_0=='R') ) {s = 20;}
						else if ( (LA74_0=='T') ) {s = 21;}
						else if ( (LA74_0=='X') ) {s = 22;}
						else if ( (LA74_0=='Y') ) {s = 23;}
						else if ( (LA74_0=='U') ) {s = 24;}
						else if ( (LA74_0=='i') ) {s = 25;}
						else if ( (LA74_0=='1') ) {s = 26;}
						else if ( ((LA74_0 >= '\t' && LA74_0 <= '\n')||LA74_0=='\r'||LA74_0==' ') ) {s = 27;}
						else if ( (LA74_0=='(') ) {s = 28;}
						else if ( (LA74_0=='0'||(LA74_0 >= '2' && LA74_0 <= '9')) ) {s = 29;}
						else if ( (LA74_0=='m') ) {s = 30;}
						else if ( (LA74_0=='.') ) {s = 31;}
						else if ( (LA74_0=='Q'||LA74_0=='Z') ) {s = 32;}
						else if ( ((LA74_0 >= '&' && LA74_0 <= '\'')||(LA74_0 >= ',' && LA74_0 <= '-')||(LA74_0 >= ':' && LA74_0 <= ';')||LA74_0=='_'||(LA74_0 >= 'a' && LA74_0 <= 'h')||(LA74_0 >= 'j' && LA74_0 <= 'l')||(LA74_0 >= 'n' && LA74_0 <= 'z')||LA74_0=='\u2019') ) {s = 33;}
						else if ( ((LA74_0 >= '\u0000' && LA74_0 <= '\b')||(LA74_0 >= '\u000B' && LA74_0 <= '\f')||(LA74_0 >= '\u000E' && LA74_0 <= '\u001F')||(LA74_0 >= '!' && LA74_0 <= '%')||(LA74_0 >= ')' && LA74_0 <= '+')||LA74_0=='/'||(LA74_0 >= '<' && LA74_0 <= '@')||(LA74_0 >= '[' && LA74_0 <= '^')||LA74_0=='`'||(LA74_0 >= '{' && LA74_0 <= '\u2018')||(LA74_0 >= '\u201A' && LA74_0 <= '\uFFFF')) ) {s = 34;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA74_272 = input.LA(1);
						 
						int index74_272 = input.index();
						input.rewind();
						s = -1;
						if ( (LA74_272=='l') ) {s = 490;}
						else if ( ((LA74_272 >= '\t' && LA74_272 <= '\n')||LA74_272=='\r'||LA74_272==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_272);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA74_188 = input.LA(1);
						 
						int index74_188 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_188 >= '\t' && LA74_188 <= '\n')||LA74_188=='\r'||LA74_188==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_188);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA74_40 = input.LA(1);
						 
						int index74_40 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_40 >= '\t' && LA74_40 <= '\n')||LA74_40=='\r'||LA74_40==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_40);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA74_394 = input.LA(1);
						 
						int index74_394 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_394 >= '\t' && LA74_394 <= '\n')||LA74_394=='\r'||LA74_394==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_394);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA74_109 = input.LA(1);
						 
						int index74_109 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_109 >= '\t' && LA74_109 <= '\n')||LA74_109=='\r'||LA74_109==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_109);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA74_37 = input.LA(1);
						 
						int index74_37 = input.index();
						input.rewind();
						s = -1;
						if ( (LA74_37=='S') ) {s = 186;}
						else if ( ((LA74_37 >= '\t' && LA74_37 <= '\n')||LA74_37=='\r'||LA74_37==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_37);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA74_38 = input.LA(1);
						 
						int index74_38 = input.index();
						input.rewind();
						s = -1;
						if ( (LA74_38=='s') ) {s = 188;}
						else if ( ((LA74_38 >= '\t' && LA74_38 <= '\n')||LA74_38=='\r'||LA74_38==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_38);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA74_108 = input.LA(1);
						 
						int index74_108 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_108 >= '\t' && LA74_108 <= '\n')||LA74_108=='\r'||LA74_108==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_108);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA74_395 = input.LA(1);
						 
						int index74_395 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_395 >= '\t' && LA74_395 <= '\n')||LA74_395=='\r'||LA74_395==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_395);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA74_273 = input.LA(1);
						 
						int index74_273 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_273 >= '\t' && LA74_273 <= '\n')||LA74_273=='\r'||LA74_273==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_273);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA74_39 = input.LA(1);
						 
						int index74_39 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_39 >= '\t' && LA74_39 <= '\n')||LA74_39=='\r'||LA74_39==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_39);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA74_186 = input.LA(1);
						 
						int index74_186 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA74_186 >= '\t' && LA74_186 <= '\n')||LA74_186=='\r'||LA74_186==' ') && ((allowJudge))) {s = 187;}
						else s = 44;
						 
						input.seek(index74_186);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 74, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
