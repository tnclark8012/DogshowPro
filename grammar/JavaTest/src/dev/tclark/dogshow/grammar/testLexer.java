// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-11-15 23:50:42

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
	public static final int FRAG_BEST_IN_SHOW=13;
	public static final int FRAG_BREED_NAME_ALT=14;
	public static final int FRAG_BREED_NAME_CATEGORY=15;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=16;
	public static final int FRAG_BREED_NAME_SINGLE=17;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=18;
	public static final int FRAG_GROUP_NAME=19;
	public static final int FRAG_MONTH=20;
	public static final int FRAG_PROPER_NAME=21;
	public static final int FRAG_RALLY_CLASS_NAME=22;
	public static final int FRAG_RALLY_CLASS_SECTION=23;
	public static final int FRAG_RALLY_ENTRANT_GROUP=24;
	public static final int FRAG_RALLY_SINGLE_ENTRANT=25;
	public static final int FRAG_RING=26;
	public static final int FRAG_SPECIAL_GROUP_NAME=27;
	public static final int FRAG_SPEC_CHAR=28;
	public static final int FRAG_SPEC_WORD_CHAR=29;
	public static final int FRAG_TIME_LABEL=30;
	public static final int FRAG_TITLE=31;
	public static final int FRAG_TO_FOLLOW=32;
	public static final int FRAG_WEEK_DAY=33;
	public static final int FallThrough=34;
	public static final int GROUP_ENDING_ANNOUNCEMENT=35;
	public static final int GROUP_NAME=36;
	public static final int GROUP_RING=37;
	public static final int INT=38;
	public static final int JUDGE_NAME=39;
	public static final int JUNIOR_CLASS=40;
	public static final int NON_CONFORMATION_CLASS_LEVEL=41;
	public static final int NON_CONFORMATION_CLASS_NAME=42;
	public static final int NON_CONFORMATION_CLASS_SECTION=43;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=44;
	public static final int NON_CONFORMATION_SECOND_LINE=45;
	public static final int NON_CONF_SECOND_LINE_COMMENT=46;
	public static final int PARENTHETICAL=47;
	public static final int PARENTHETICAL_INT=48;
	public static final int PARENTHETICAL_NAME=49;
	public static final int PHONE_NUMBER=50;
	public static final int RALLY_CLASS=51;
	public static final int RALLY_ENTRY=52;
	public static final int RING_TITLE=53;
	public static final int SPECIAL_SUFFIX=54;
	public static final int STANDALONE_COMMENT=55;
	public static final int TIME=56;
	public static final int WORD=57;
	public static final int WS=58;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:9: 'Master Class'
					{
					match("Master Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:9: 'Open Senior'
					{
					match("Open Senior"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:9: 'Open Intermediate'
					{
					match("Open Intermediate"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:9: 'Open Junior'
					{
					match("Open Junior"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:9: 'Novice Senior'
					{
					match("Novice Senior"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:9: 'Novice Junior'
					{
					match("Novice Junior"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:9: 'Novice Intermediate'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:5: ({...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:7: {...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			if ( !((allowBreed)) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "FRAG_BREED_NAME_SINGLE", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=198;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:24: 'Affenpinscher'
					{
					match("Affenpinscher"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: 'Afghan Hound'
					{
					match("Afghan Hound"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:5: 'Akita'
					{
					match("Akita"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:5: 'American English Coonhound'
					{
					match("American English Coonhound"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:5: 'American Foxhound'
					{
					match("American Foxhound"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:2: 'Appenzeller Sennenhunde'
					{
					match("Appenzeller Sennenhunde"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:5: 'Australian Terrier'
					{
					match("Australian Terrier"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:5: 'Basenji'
					{
					match("Basenji"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: 'Basset Hound'
					{
					match("Basset Hound"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:5: 'Beagle'
					{
					match("Beagle"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: 'Bearded Collie'
					{
					match("Bearded Collie"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:5: 'Beauceron'
					{
					match("Beauceron"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:5: 'Berger Picard'
					{
					match("Berger Picard"); if (state.failed) return ;

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:263:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:5: 'Bichon Frise'
					{
					match("Bichon Frise"); if (state.failed) return ;

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:5: 'Bichons Frise'
					{
					match("Bichons Frise"); if (state.failed) return ;

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); if (state.failed) return ;

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); if (state.failed) return ;

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); if (state.failed) return ;

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: 'Bloodhound'
					{
					match("Bloodhound"); if (state.failed) return ;

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); if (state.failed) return ;

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:5: 'Border Collie'
					{
					match("Border Collie"); if (state.failed) return ;

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:272:5: 'Border Terrier'
					{
					match("Border Terrier"); if (state.failed) return ;

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:273:5: 'Borzoi'
					{
					match("Borzoi"); if (state.failed) return ;

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:5: 'Boston Terrier'
					{
					match("Boston Terrier"); if (state.failed) return ;

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:275:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); if (state.failed) return ;

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:276:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); if (state.failed) return ;

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:277:5: 'Boxer'
					{
					match("Boxer"); if (state.failed) return ;

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); if (state.failed) return ;

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: 'Brace'
					{
					match("Brace"); if (state.failed) return ;

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: 'Briard'
					{
					match("Briard"); if (state.failed) return ;

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:5: 'Brittany'
					{
					match("Brittany"); if (state.failed) return ;

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); if (state.failed) return ;

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:283:5: 'Bull Terrier'
					{
					match("Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:5: 'Bulldog'
					{
					match("Bulldog"); if (state.failed) return ;

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:5: 'Bullmastiff'
					{
					match("Bullmastiff"); if (state.failed) return ;

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:286:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); if (state.failed) return ;

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:287:5: 'Canaan Dog'
					{
					match("Canaan Dog"); if (state.failed) return ;

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: 'Cane Corso'
					{
					match("Cane Corso"); if (state.failed) return ;

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:289:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); if (state.failed) return ;

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:290:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); if (state.failed) return ;

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); if (state.failed) return ;

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:292:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); if (state.failed) return ;

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:5: 'Chihuahua'
					{
					match("Chihuahua"); if (state.failed) return ;

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:5: 'Chinese Crested'
					{
					match("Chinese Crested"); if (state.failed) return ;

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); if (state.failed) return ;

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); if (state.failed) return ;

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:5: 'Chow Chow'
					{
					match("Chow Chow"); if (state.failed) return ;

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); if (state.failed) return ;

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); if (state.failed) return ;

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:5: 'Collie'
					{
					match("Collie"); if (state.failed) return ;

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); if (state.failed) return ;

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:5: 'Dachshund'
					{
					match("Dachshund"); if (state.failed) return ;

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:5: 'Dalmatian'
					{
					match("Dalmatian"); if (state.failed) return ;

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); if (state.failed) return ;

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); if (state.failed) return ;

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:5: 'Dogo Argentine'
					{
					match("Dogo Argentine"); if (state.failed) return ;

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); if (state.failed) return ;

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:308:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); if (state.failed) return ;

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:309:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); if (state.failed) return ;

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:5: 'English Foxhound'
					{
					match("English Foxhound"); if (state.failed) return ;

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:5: 'English Setter'
					{
					match("English Setter"); if (state.failed) return ;

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:312:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); if (state.failed) return ;

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); if (state.failed) return ;

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:5: 'Field Spaniel'
					{
					match("Field Spaniel"); if (state.failed) return ;

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); if (state.failed) return ;

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); if (state.failed) return ;

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); if (state.failed) return ;

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:5: 'Fox Terrier'
					{
					match("Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:5: 'French Bulldog'
					{
					match("French Bulldog"); if (state.failed) return ;

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:5: 'German Pinscher'
					{
					match("German Pinscher"); if (state.failed) return ;

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); if (state.failed) return ;

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); if (state.failed) return ;

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); if (state.failed) return ;

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); if (state.failed) return ;

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); if (state.failed) return ;

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: 'Golden Retriever'
					{
					match("Golden Retriever"); if (state.failed) return ;

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:5: 'Gordon Setter'
					{
					match("Gordon Setter"); if (state.failed) return ;

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:5: 'Great Dane'
					{
					match("Great Dane"); if (state.failed) return ;

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); if (state.failed) return ;

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); if (state.failed) return ;

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:5: 'Greyhound'
					{
					match("Greyhound"); if (state.failed) return ;

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:5: 'Harrier'
					{
					match("Harrier"); if (state.failed) return ;

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:5: 'Havanese'
					{
					match("Havanese"); if (state.failed) return ;

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); if (state.failed) return ;

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); if (state.failed) return ;

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); if (state.failed) return ;

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:5: 'Irish Setter'
					{
					match("Irish Setter"); if (state.failed) return ;

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:5: 'Irish Terrier'
					{
					match("Irish Terrier"); if (state.failed) return ;

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); if (state.failed) return ;

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:341:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); if (state.failed) return ;

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:342:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); if (state.failed) return ;

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:343:5: 'Japanese Chin'
					{
					match("Japanese Chin"); if (state.failed) return ;

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:5: 'Keeshond'
					{
					match("Keeshond"); if (state.failed) return ;

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:345:5: 'Keeshonden'
					{
					match("Keeshonden"); if (state.failed) return ;

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); if (state.failed) return ;

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:5: 'Komondor'
					{
					match("Komondor"); if (state.failed) return ;

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:5: 'Kuvasz'
					{
					match("Kuvasz"); if (state.failed) return ;

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:5: 'Kuvaszok'
					{
					match("Kuvaszok"); if (state.failed) return ;

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); if (state.failed) return ;

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); if (state.failed) return ;

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); if (state.failed) return ;

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:5: 'Leonberger'
					{
					match("Leonberger"); if (state.failed) return ;

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:354:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); if (state.failed) return ;

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:5: 'Löwchen'
					{
					match("Löwchen"); if (state.failed) return ;

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:5: 'Lowchen'
					{
					match("Lowchen"); if (state.failed) return ;

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:357:5: 'Maltese'
					{
					match("Maltese"); if (state.failed) return ;

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); if (state.failed) return ;

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:5: 'Mastiff'
					{
					match("Mastiff"); if (state.failed) return ;

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:360:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); if (state.failed) return ;

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); if (state.failed) return ;

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); if (state.failed) return ;

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); if (state.failed) return ;

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:5: 'Newfoundland'
					{
					match("Newfoundland"); if (state.failed) return ;

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); if (state.failed) return ;

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); if (state.failed) return ;

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); if (state.failed) return ;

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); if (state.failed) return ;

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); if (state.failed) return ;

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); if (state.failed) return ;

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); if (state.failed) return ;

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:5: 'Otterhound'
					{
					match("Otterhound"); if (state.failed) return ;

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:5: 'Papillon'
					{
					match("Papillon"); if (state.failed) return ;

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); if (state.failed) return ;

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:5: 'Pekingese'
					{
					match("Pekingese"); if (state.failed) return ;

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); if (state.failed) return ;

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); if (state.failed) return ;

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); if (state.failed) return ;

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:380:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); if (state.failed) return ;

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:5: 'Plott'
					{
					match("Plott"); if (state.failed) return ;

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:5: 'Pointer'
					{
					match("Pointer"); if (state.failed) return ;

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); if (state.failed) return ;

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:5: 'Pomeranian'
					{
					match("Pomeranian"); if (state.failed) return ;

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:5: 'Poodle'
					{
					match("Poodle"); if (state.failed) return ;

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); if (state.failed) return ;

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); if (state.failed) return ;

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:5: 'Pug'
					{
					match("Pug"); if (state.failed) return ;

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:5: 'Puli'
					{
					match("Puli"); if (state.failed) return ;

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:5: 'Pulik'
					{
					match("Pulik"); if (state.failed) return ;

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); if (state.failed) return ;

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:5: 'Rat Terrier'
					{
					match("Rat Terrier"); if (state.failed) return ;

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); if (state.failed) return ;

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:5: 'Retrievers'
					{
					match("Retrievers"); if (state.failed) return ;

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); if (state.failed) return ;

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:5: 'Rottweiler'
					{
					match("Rottweiler"); if (state.failed) return ;

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:397:5: 'Russell Terrier'
					{
					match("Russell Terrier"); if (state.failed) return ;

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:398:5: 'Saint Bernard'
					{
					match("Saint Bernard"); if (state.failed) return ;

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:5: 'Saluki'
					{
					match("Saluki"); if (state.failed) return ;

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:5: 'Samoyed'
					{
					match("Samoyed"); if (state.failed) return ;

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:5: 'Schipperke'
					{
					match("Schipperke"); if (state.failed) return ;

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); if (state.failed) return ;

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); if (state.failed) return ;

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); if (state.failed) return ;

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:5: 'Setters'
					{
					match("Setters"); if (state.failed) return ;

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:406:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); if (state.failed) return ;

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:5: 'Shiba Inu'
					{
					match("Shiba Inu"); if (state.failed) return ;

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:5: 'Shih Tzu'
					{
					match("Shih Tzu"); if (state.failed) return ;

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:5: 'Siberian Husky'
					{
					match("Siberian Husky"); if (state.failed) return ;

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:410:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); if (state.failed) return ;

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:411:5: 'Silky Terrier'
					{
					match("Silky Terrier"); if (state.failed) return ;

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:412:5: 'Skye Terrier'
					{
					match("Skye Terrier"); if (state.failed) return ;

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); if (state.failed) return ;

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:5: 'Spaniels'
					{
					match("Spaniels"); if (state.failed) return ;

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); if (state.failed) return ;

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:5: 'Spinoni Italiani'
					{
					match("Spinoni Italiani"); if (state.failed) return ;

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:417:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); if (state.failed) return ;

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); if (state.failed) return ;

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); if (state.failed) return ;

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); if (state.failed) return ;

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); if (state.failed) return ;

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); if (state.failed) return ;

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); if (state.failed) return ;

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); if (state.failed) return ;

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:5: 'Vizsla'
					{
					match("Vizsla"); if (state.failed) return ;

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:427:5: 'Weimaraner'
					{
					match("Weimaraner"); if (state.failed) return ;

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); if (state.failed) return ;

					}
					break;
				case 191 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); if (state.failed) return ;

					}
					break;
				case 192 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); if (state.failed) return ;

					}
					break;
				case 193 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:431:5: 'Whippet'
					{
					match("Whippet"); if (state.failed) return ;

					}
					break;
				case 194 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:432:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); if (state.failed) return ;

					}
					break;
				case 195 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); if (state.failed) return ;

					}
					break;
				case 196 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:434:2: 'Wirehaired Vizsla'
					{
					match("Wirehaired Vizsla"); if (state.failed) return ;

					}
					break;
				case 197 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:435:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); if (state.failed) return ;

					}
					break;
				case 198 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:5: 'Yorkshire Terrier'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:5: ({...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:7: {...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			if ( !((allowBreed)) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "BREED_NAME", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:22: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='A'||(LA3_0 >= 'C' && LA3_0 <= 'P')||(LA3_0 >= 'R' && LA3_0 <= 'T')||(LA3_0 >= 'W' && LA3_0 <= 'Y')) && ((allowBreed))) {
				alt3=1;
			}
			else if ( (LA3_0=='B') ) {
				int LA3_2 = input.LA(2);
				if ( (LA3_2=='a'||LA3_2=='e'||LA3_2=='i'||LA3_2=='l'||LA3_2=='o'||LA3_2=='u') && ((allowBreed))) {
					alt3=1;
				}
				else if ( (LA3_2=='r') ) {
					int LA3_4 = input.LA(3);
					if ( (LA3_4=='a'||LA3_4=='i'||LA3_4=='u') && ((allowBreed))) {
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
			else if ( (LA3_0=='V') ) {
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='i') && ((allowBreed))) {
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
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:23: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:46: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:67: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:67: 's'
					{
					match('s'); if (state.failed) return ;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:72: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:72: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:76: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:77: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); if (state.failed) return ;
					mFRAG_BREED_NAME_CATEGORY(); if (state.failed) return ;

					match(')'); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:110: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:110: WS
							{
							mWS(); if (state.failed) return ;

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:114: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:114: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:150: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='('||LA9_0=='M') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:150: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:5: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:10: FRAG_BREED_NAME_SPECIAL_SUFFIX
			{
			mFRAG_BREED_NAME_SPECIAL_SUFFIX(); if (state.failed) return ;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:5: ( ( '(' BREED_MISC ')' ) | BREED_MISC )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:9: ( '(' BREED_MISC ')' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:9: ( '(' BREED_MISC ')' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:10: '(' BREED_MISC ')'
					{
					match('('); if (state.failed) return ;
					mBREED_MISC(); if (state.failed) return ;

					match(')'); if (state.failed) return ;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:28: BREED_MISC
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

	// $ANTLR start "BREED_MISC"
	public final void mBREED_MISC() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:2: ( 'Misc. Dog' | 'Misc. Dogs' | 'Misc. Bitch' | 'Misc. Bitches' )
			int alt11=4;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='M') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='i') ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2=='s') ) {
						int LA11_3 = input.LA(4);
						if ( (LA11_3=='c') ) {
							int LA11_4 = input.LA(5);
							if ( (LA11_4=='.') ) {
								int LA11_5 = input.LA(6);
								if ( (LA11_5==' ') ) {
									int LA11_6 = input.LA(7);
									if ( (LA11_6=='D') ) {
										int LA11_7 = input.LA(8);
										if ( (LA11_7=='o') ) {
											int LA11_9 = input.LA(9);
											if ( (LA11_9=='g') ) {
												int LA11_11 = input.LA(10);
												if ( (LA11_11=='s') ) {
													alt11=2;
												}
												else {
													alt11=1;
												}
											}
											else {
												if (state.backtracking>0) {state.failed=true; return ;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 11, 9, input);
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
													new NoViableAltException("", 11, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else if ( (LA11_6=='B') ) {
										int LA11_8 = input.LA(8);
										if ( (LA11_8=='i') ) {
											int LA11_10 = input.LA(9);
											if ( (LA11_10=='t') ) {
												int LA11_12 = input.LA(10);
												if ( (LA11_12=='c') ) {
													int LA11_15 = input.LA(11);
													if ( (LA11_15=='h') ) {
														int LA11_16 = input.LA(12);
														if ( (LA11_16=='e') ) {
															alt11=4;
														}
														else {
															alt11=3;
														}
													}
													else {
														if (state.backtracking>0) {state.failed=true; return ;}
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++)
																input.consume();
															NoViableAltException nvae =
																new NoViableAltException("", 11, 15, input);
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
															new NoViableAltException("", 11, 12, input);
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
														new NoViableAltException("", 11, 10, input);
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
													new NoViableAltException("", 11, 8, input);
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
												new NoViableAltException("", 11, 6, input);
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
											new NoViableAltException("", 11, 5, input);
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
										new NoViableAltException("", 11, 4, input);
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
									new NoViableAltException("", 11, 3, input);
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
								new NoViableAltException("", 11, 2, input);
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
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:2: 'Misc. Dog'
					{
					match("Misc. Dog"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:14: 'Misc. Dogs'
					{
					match("Misc. Dogs"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:27: 'Misc. Bitch'
					{
					match("Misc. Bitch"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:41: 'Misc. Bitches'
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

	// $ANTLR start "FRAG_BREED_NAME_SPECIAL_SUFFIX"
	public final void mFRAG_BREED_NAME_SPECIAL_SUFFIX() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:5: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			int alt12=4;
			switch ( input.LA(1) ) {
			case 'S':
				{
				alt12=1;
				}
				break;
			case 'E':
				{
				int LA12_2 = input.LA(2);
				if ( (LA12_2=='n') ) {
					int LA12_4 = input.LA(3);
					if ( (LA12_4=='t') ) {
						int LA12_5 = input.LA(4);
						if ( (LA12_5=='r') ) {
							int LA12_6 = input.LA(5);
							if ( (LA12_6=='y') ) {
								alt12=2;
							}
							else if ( (LA12_6=='i') ) {
								alt12=3;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'V':
				{
				alt12=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:10: 'Sweepstakes'
					{
					match("Sweepstakes"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:24: 'Entry'
					{
					match("Entry"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:32: 'Entries'
					{
					match("Entries"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:42: 'Veterans'
					{
					match("Veterans"); if (state.failed) return ;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:29: ( 'Brood Bitch' | 'Brood Bitche' | 'Veteran Dog' | 'Veteran Bitch' | 'Veteran Bitche' )
			int alt13=5;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='B') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='r') ) {
					int LA13_3 = input.LA(3);
					if ( (LA13_3=='o') ) {
						int LA13_5 = input.LA(4);
						if ( (LA13_5=='o') ) {
							int LA13_7 = input.LA(5);
							if ( (LA13_7=='d') ) {
								int LA13_9 = input.LA(6);
								if ( (LA13_9==' ') ) {
									int LA13_11 = input.LA(7);
									if ( (LA13_11=='B') ) {
										int LA13_13 = input.LA(8);
										if ( (LA13_13=='i') ) {
											int LA13_15 = input.LA(9);
											if ( (LA13_15=='t') ) {
												int LA13_17 = input.LA(10);
												if ( (LA13_17=='c') ) {
													int LA13_20 = input.LA(11);
													if ( (LA13_20=='h') ) {
														int LA13_22 = input.LA(12);
														if ( (LA13_22=='e') ) {
															alt13=2;
														}
														else {
															alt13=1;
														}
													}
													else {
														if (state.backtracking>0) {state.failed=true; return ;}
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++)
																input.consume();
															NoViableAltException nvae =
																new NoViableAltException("", 13, 20, input);
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
															new NoViableAltException("", 13, 17, input);
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
														new NoViableAltException("", 13, 15, input);
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
													new NoViableAltException("", 13, 13, input);
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
												new NoViableAltException("", 13, 11, input);
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
											new NoViableAltException("", 13, 9, input);
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
										new NoViableAltException("", 13, 7, input);
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
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA13_0=='V') ) {
				int LA13_2 = input.LA(2);
				if ( (LA13_2=='e') ) {
					int LA13_4 = input.LA(3);
					if ( (LA13_4=='t') ) {
						int LA13_6 = input.LA(4);
						if ( (LA13_6=='e') ) {
							int LA13_8 = input.LA(5);
							if ( (LA13_8=='r') ) {
								int LA13_10 = input.LA(6);
								if ( (LA13_10=='a') ) {
									int LA13_12 = input.LA(7);
									if ( (LA13_12=='n') ) {
										int LA13_14 = input.LA(8);
										if ( (LA13_14==' ') ) {
											int LA13_16 = input.LA(9);
											if ( (LA13_16=='D') ) {
												alt13=3;
											}
											else if ( (LA13_16=='B') ) {
												int LA13_19 = input.LA(10);
												if ( (LA13_19=='i') ) {
													int LA13_21 = input.LA(11);
													if ( (LA13_21=='t') ) {
														int LA13_23 = input.LA(12);
														if ( (LA13_23=='c') ) {
															int LA13_26 = input.LA(13);
															if ( (LA13_26=='h') ) {
																int LA13_27 = input.LA(14);
																if ( (LA13_27=='e') ) {
																	alt13=5;
																}
																else {
																	alt13=4;
																}
															}
															else {
																if (state.backtracking>0) {state.failed=true; return ;}
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++)
																		input.consume();
																	NoViableAltException nvae =
																		new NoViableAltException("", 13, 26, input);
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
																for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++)
																	input.consume();
																NoViableAltException nvae =
																	new NoViableAltException("", 13, 23, input);
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
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++)
																input.consume();
															NoViableAltException nvae =
																new NoViableAltException("", 13, 21, input);
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
															new NoViableAltException("", 13, 19, input);
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
														new NoViableAltException("", 13, 16, input);
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
													new NoViableAltException("", 13, 14, input);
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
												new NoViableAltException("", 13, 12, input);
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
											new NoViableAltException("", 13, 10, input);
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
										new NoViableAltException("", 13, 8, input);
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
									new NoViableAltException("", 13, 6, input);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:33: 'Brood Bitch'
					{
					match("Brood Bitch"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:47: 'Brood Bitche'
					{
					match("Brood Bitche"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:62: 'Veteran Dog'
					{
					match("Veteran Dog"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:76: 'Veteran Bitch'
					{
					match("Veteran Bitch"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:92: 'Veteran Bitche'
					{
					match("Veteran Bitche"); if (state.failed) return ;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
			int alt14=3;
			switch ( input.LA(1) ) {
			case 'A':
				{
				alt14=1;
				}
				break;
			case 'P':
				{
				alt14=2;
				}
				break;
			case 'B':
				{
				alt14=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:9: 'Ascob'
					{
					match("Ascob"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:17: 'Parti-Color'
					{
					match("Parti-Color"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:31: 'Black'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:5: ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt15=38;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:457:9: '13 Inch'
					{
					match("13 Inch"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:9: '15 Inch'
					{
					match("15 Inch"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:9: 'American Water'
					{
					match("American Water"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:460:9: 'Boykin'
					{
					match("Boykin"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:9: 'B & P C'
					{
					match("B & P C"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:9: 'Clumber'
					{
					match("Clumber"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:9: 'Cocker'
					{
					match("Cocker"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:9: 'Colored'
					{
					match("Colored"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:9: 'Curly-Coated'
					{
					match("Curly-Coated"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:9: 'English'
					{
					match("English"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:9: 'English Cocker'
					{
					match("English Cocker"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:9: 'English Springer'
					{
					match("English Springer"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:9: 'Field'
					{
					match("Field"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:471:9: 'Flat-Coated'
					{
					match("Flat-Coated"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:472:9: 'German Shorthaired'
					{
					match("German Shorthaired"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:473:9: 'German Wirehaired'
					{
					match("German Wirehaired"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:474:9: 'Golden'
					{
					match("Golden"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:475:9: 'Gordon'
					{
					match("Gordon"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:476:9: 'Irish'
					{
					match("Irish"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:477:2: 'Irish Red And White'
					{
					match("Irish Red And White"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:478:9: 'Irish Water'
					{
					match("Irish Water"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:479:9: 'K C & R'
					{
					match("K C & R"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:480:9: 'Labrador'
					{
					match("Labrador"); if (state.failed) return ;

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:481:9: 'Long Coat'
					{
					match("Long Coat"); if (state.failed) return ;

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:482:9: 'Longhaired'
					{
					match("Longhaired"); if (state.failed) return ;

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:483:9: 'Miniature'
					{
					match("Miniature"); if (state.failed) return ;

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:484:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); if (state.failed) return ;

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:485:9: 'Rough'
					{
					match("Rough"); if (state.failed) return ;

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:486:9: 'Smooth'
					{
					match("Smooth"); if (state.failed) return ;

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:487:9: 'Smooth Coat'
					{
					match("Smooth Coat"); if (state.failed) return ;

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:488:9: 'Standard'
					{
					match("Standard"); if (state.failed) return ;

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:489:9: 'Sussex'
					{
					match("Sussex"); if (state.failed) return ;

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:490:9: 'Toy'
					{
					match("Toy"); if (state.failed) return ;

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:9: 'Welsh Springer'
					{
					match("Welsh Springer"); if (state.failed) return ;

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:492:9: 'White'
					{
					match("White"); if (state.failed) return ;

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:493:9: 'Wire'
					{
					match("Wire"); if (state.failed) return ;

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:9: 'Wirehaired'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:20: ( 'TOY' | 'HERDING' | 'TERRIER' | 'NON-SPORTING' | 'SPORTING' | 'HOUND' | 'WORKING' )
			int alt16=7;
			switch ( input.LA(1) ) {
			case 'T':
				{
				int LA16_1 = input.LA(2);
				if ( (LA16_1=='O') ) {
					alt16=1;
				}
				else if ( (LA16_1=='E') ) {
					alt16=3;
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
				break;
			case 'H':
				{
				int LA16_2 = input.LA(2);
				if ( (LA16_2=='E') ) {
					alt16=2;
				}
				else if ( (LA16_2=='O') ) {
					alt16=6;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
			case 'N':
				{
				alt16=4;
				}
				break;
			case 'S':
				{
				alt16=5;
				}
				break;
			case 'W':
				{
				alt16=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:22: 'TOY'
					{
					match("TOY"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:28: 'HERDING'
					{
					match("HERDING"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:38: 'TERRIER'
					{
					match("TERRIER"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:48: 'NON-SPORTING'
					{
					match("NON-SPORTING"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:63: 'SPORTING'
					{
					match("SPORTING"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:74: 'HOUND'
					{
					match("HOUND"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:82: 'WORKING'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:2: ( 'BEST IN SHOW' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:4: 'BEST IN SHOW'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:2: ( ( GROUP_NAME ( ' GROUP' )=> ' GROUP' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:3: ( GROUP_NAME ( ' GROUP' )=> ' GROUP' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:3: ( GROUP_NAME ( ' GROUP' )=> ' GROUP' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:4: GROUP_NAME ( ' GROUP' )=> ' GROUP'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:508:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
			int alt17=4;
			switch ( input.LA(1) ) {
			case 'V':
				{
				alt17=1;
				}
				break;
			case 'S':
				{
				alt17=2;
				}
				break;
			case 'R':
				{
				alt17=3;
				}
				break;
			case 'T':
				{
				alt17=4;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:509:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:510:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:511:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:512:3: 'Toy Variety Group'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:2: ( FRAG_GROUP_NAME | FRAG_SPECIAL_GROUP_NAME | FRAG_BEST_IN_SHOW )
			int alt18=3;
			switch ( input.LA(1) ) {
			case 'T':
				{
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='E'||LA18_1=='O') ) {
					alt18=1;
				}
				else if ( (LA18_1=='o') ) {
					alt18=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
			case 'H':
			case 'N':
			case 'W':
				{
				alt18=1;
				}
				break;
			case 'S':
				{
				int LA18_3 = input.LA(2);
				if ( (LA18_3=='P') ) {
					alt18=1;
				}
				else if ( (LA18_3=='W') ) {
					alt18=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
			case 'R':
			case 'V':
				{
				alt18=2;
				}
				break;
			case 'B':
				{
				alt18=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:4: FRAG_GROUP_NAME
					{
					mFRAG_GROUP_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:20: FRAG_SPECIAL_GROUP_NAME
					{
					mFRAG_SPECIAL_GROUP_NAME(); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:44: FRAG_BEST_IN_SHOW
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:533:29: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:534:2: NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			{
			mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:534:31: ( ' ' NON_CONFORMATION_CLASS_LEVEL )*
			loop19:
			do {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==' ') ) {
					switch ( input.LA(2) ) {
					case 'A':
						{
						int LA19_3 = input.LA(3);
						if ( (LA19_3=='d') ) {
							alt19=1;
						}

						}
						break;
					case 'W':
						{
						int LA19_4 = input.LA(3);
						if ( (LA19_4=='a') ) {
							int LA19_7 = input.LA(4);
							if ( (LA19_7=='l') ) {
								int LA19_8 = input.LA(5);
								if ( (LA19_8=='k') ) {
									int LA19_9 = input.LA(6);
									if ( (LA19_9=='t') ) {
										int LA19_10 = input.LA(7);
										if ( (LA19_10=='h') ) {
											int LA19_11 = input.LA(8);
											if ( (LA19_11=='r') ) {
												int LA19_12 = input.LA(9);
												if ( (LA19_12=='o') ) {
													int LA19_13 = input.LA(10);
													if ( (LA19_13=='u') ) {
														int LA19_14 = input.LA(11);
														if ( (LA19_14=='g') ) {
															int LA19_15 = input.LA(12);
															if ( (LA19_15=='h') ) {
																alt19=1;
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
						else if ( (LA19_4=='i') ) {
							alt19=1;
						}

						}
						break;
					case 'B':
						{
						int LA19_5 = input.LA(3);
						if ( (LA19_5=='e') ) {
							alt19=1;
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
						alt19=1;
						}
						break;
					}
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:534:32: ' ' NON_CONFORMATION_CLASS_LEVEL
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

					}
					break;

				default :
					break loop19;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:534:66: ( ' ' NON_CONFORMATION_CLASS_SECTION )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==' ') ) {
				int LA20_1 = input.LA(2);
				if ( ((LA20_1 >= 'A' && LA20_1 <= 'B')) ) {
					alt20=1;
				}
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:534:67: ' ' NON_CONFORMATION_CLASS_SECTION
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_SECTION(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:534:103: ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==' ') ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:534:104: ' ' NON_CONFORMATION_CLASS_SUFFIX
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_SUFFIX(); if (state.failed) return ;

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
	// $ANTLR end "NON_CONFORMATION_CLASS_NAME"

	// $ANTLR start "NON_CONFORMATION_CLASS_SECTION"
	public final void mNON_CONFORMATION_CLASS_SECTION() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:553:2: ( ( 'A' | 'B' ) )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:555:2: ( 'Class' | 'Walkthrough' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='C') ) {
				alt22=1;
			}
			else if ( (LA22_0=='W') ) {
				alt22=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:555:4: 'Class'
					{
					match("Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:555:12: 'Walkthrough'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:557:2: ( 'Advanced' | 'Beginner' | 'Excellent' | 'Utility' | 'Pre' | 'Open' | 'Novice' | 'Wild Card' | ( 'Pair' ( 's' )? ) | 'Graduate' | 'Walkthrough' | 'Versatility' )
			int alt24=12;
			switch ( input.LA(1) ) {
			case 'A':
				{
				alt24=1;
				}
				break;
			case 'B':
				{
				alt24=2;
				}
				break;
			case 'E':
				{
				alt24=3;
				}
				break;
			case 'U':
				{
				alt24=4;
				}
				break;
			case 'P':
				{
				int LA24_5 = input.LA(2);
				if ( (LA24_5=='r') ) {
					alt24=5;
				}
				else if ( (LA24_5=='a') ) {
					alt24=9;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				alt24=6;
				}
				break;
			case 'N':
				{
				alt24=7;
				}
				break;
			case 'W':
				{
				int LA24_8 = input.LA(2);
				if ( (LA24_8=='i') ) {
					alt24=8;
				}
				else if ( (LA24_8=='a') ) {
					alt24=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'G':
				{
				alt24=10;
				}
				break;
			case 'V':
				{
				alt24=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:558:2: 'Advanced'
					{
					match("Advanced"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:559:2: 'Beginner'
					{
					match("Beginner"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:560:2: 'Excellent'
					{
					match("Excellent"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:561:2: 'Utility'
					{
					match("Utility"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:562:2: 'Pre'
					{
					match("Pre"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:2: 'Open'
					{
					match("Open"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:564:2: 'Novice'
					{
					match("Novice"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:565:2: 'Wild Card'
					{
					match("Wild Card"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:2: ( 'Pair' ( 's' )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:2: ( 'Pair' ( 's' )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:3: 'Pair' ( 's' )?
					{
					match("Pair"); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:9: ( 's' )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0=='s') ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:9: 's'
							{
							match('s'); if (state.failed) return ;
							}
							break;

					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:567:2: 'Graduate'
					{
					match("Graduate"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:568:2: 'Walkthrough'
					{
					match("Walkthrough"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:2: 'Versatility'
					{
					match("Versatility"); if (state.failed) return ;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:574:2: ( FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:3: FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			{
			mFRAG_TO_FOLLOW(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:21: ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= 'A' && LA25_0 <= 'B')||LA25_0=='E'||LA25_0=='G'||(LA25_0 >= 'N' && LA25_0 <= 'P')||(LA25_0 >= 'U' && LA25_0 <= 'W')) ) {
				alt25=1;
			}
			else if ( (LA25_0=='R') ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:22: NON_CONFORMATION_CLASS_NAME
					{
					mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:50: RALLY_CLASS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:577:2: ( 'To follow' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:577:4: 'To follow'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:579:2: ( FRAG_RALLY_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:579:4: FRAG_RALLY_CLASS_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:581:2: ( 'Rally ' NON_CONFORMATION_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:581:4: 'Rally ' NON_CONFORMATION_CLASS_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:583:2: ( 'Walkthrough' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:583:4: 'Walkthrough'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:2: ( ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:4: ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:4: ( 'inch: ' )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='i') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:4: 'inch: '
					{
					match("inch: "); if (state.failed) return ;

					}
					break;

			}

			mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:39: ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			loop27:
			do {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==';') ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:40: ';' FRAG_RALLY_ENTRANT_GROUP
					{
					match(';'); if (state.failed) return ;
					mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

					}
					break;

				default :
					break loop27;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:29: ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) )
			int alt37=2;
			alt37 = dfa37.predict(input);
			switch (alt37) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:31: ( '0' .. '9' )+ '-' ( '0' .. '9' )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:31: ( '0' .. '9' )+
					int cnt28=0;
					loop28:
					do {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( ((LA28_0 >= '0' && LA28_0 <= '9')) ) {
							alt28=1;
						}

						switch (alt28) {
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
							if ( cnt28 >= 1 ) break loop28;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(28, input);
								throw eee;
						}
						cnt28++;
					} while (true);

					match('-'); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:43: ( '0' .. '9' )+
					int cnt29=0;
					loop29:
					do {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( ((LA29_0 >= '0' && LA29_0 <= '9')) ) {
							alt29=1;
						}

						switch (alt29) {
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
							if ( cnt29 >= 1 ) break loop29;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(29, input);
								throw eee;
						}
						cnt29++;
					} while (true);

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:55: ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:55: ( '0' .. '9' )+
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
							if ( cnt30 >= 1 ) break loop30;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(30, input);
								throw eee;
						}
						cnt30++;
					} while (true);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:64: ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					int cnt36=0;
					loop36:
					do {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0=='-'||LA36_0==';') ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:65: ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:65: ( '-' ( '0' .. '9' )+ )?
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0=='-') ) {
								alt32=1;
							}
							switch (alt32) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:66: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:69: ( '0' .. '9' )+
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
											if ( cnt31 >= 1 ) break loop31;
											if (state.backtracking>0) {state.failed=true; return ;}
												EarlyExitException eee =
													new EarlyExitException(31, input);
												throw eee;
										}
										cnt31++;
									} while (true);

									}
									break;

							}

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:80: ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:81: ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )?
							{
							match(';'); if (state.failed) return ;
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:84: ( '0' .. '9' )+
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

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:93: ( '-' ( '0' .. '9' )+ )?
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0=='-') ) {
								int LA35_1 = input.LA(2);
								if ( ((LA35_1 >= '0' && LA35_1 <= '9')) ) {
									alt35=1;
								}
							}
							switch (alt35) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:94: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:97: ( '0' .. '9' )+
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
									break;

							}

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:2: ( 'R' ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:4: 'R' ( '0' .. '9' )+
			{
			match('R'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:7: ( '0' .. '9' )+
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_RALLY_SINGLE_ENTRANT"

	// $ANTLR start "FRAG_RALLY_ENTRANT_GROUP"
	public final void mFRAG_RALLY_ENTRANT_GROUP() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:597:34: ( FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:598:2: FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			{
			mFRAG_RALLY_SINGLE_ENTRANT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:598:28: ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			loop39:
			do {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( ((LA39_0 >= ',' && LA39_0 <= '-')) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:598:29: ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT
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
					break loop39;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt40=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt40=1;
					}
					break;
				case 'A':
					{
					alt40=2;
					}
					break;
				case 'u':
					{
					int LA40_11 = input.LA(3);
					if ( (LA40_11=='n') ) {
						alt40=11;
					}
					else if ( (LA40_11=='l') ) {
						alt40=13;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 40, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'U':
					{
					int LA40_12 = input.LA(3);
					if ( (LA40_12=='N') ) {
						alt40=12;
					}
					else if ( (LA40_12=='L') ) {
						alt40=14;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 40, 12, input);
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
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA40_2 = input.LA(2);
				if ( (LA40_2=='e') ) {
					alt40=3;
				}
				else if ( (LA40_2=='E') ) {
					alt40=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA40_3 = input.LA(2);
				if ( (LA40_3=='a') ) {
					int LA40_15 = input.LA(3);
					if ( (LA40_15=='r') ) {
						alt40=5;
					}
					else if ( (LA40_15=='y') ) {
						alt40=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 40, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA40_3=='A') ) {
					int LA40_16 = input.LA(3);
					if ( (LA40_16=='R') ) {
						alt40=6;
					}
					else if ( (LA40_16=='Y') ) {
						alt40=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 40, 16, input);
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
							new NoViableAltException("", 40, 3, input);
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
					alt40=7;
					}
					break;
				case 'P':
					{
					alt40=8;
					}
					break;
				case 'u':
					{
					alt40=15;
					}
					break;
				case 'U':
					{
					alt40=16;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA40_5 = input.LA(2);
				if ( (LA40_5=='e') ) {
					alt40=17;
				}
				else if ( (LA40_5=='E') ) {
					alt40=18;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'O':
				{
				int LA40_6 = input.LA(2);
				if ( (LA40_6=='c') ) {
					alt40=19;
				}
				else if ( (LA40_6=='C') ) {
					alt40=20;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA40_7 = input.LA(2);
				if ( (LA40_7=='o') ) {
					alt40=21;
				}
				else if ( (LA40_7=='O') ) {
					alt40=22;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA40_8 = input.LA(2);
				if ( (LA40_8=='e') ) {
					alt40=23;
				}
				else if ( (LA40_8=='E') ) {
					alt40=24;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 8, input);
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
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:27: 'January'
					{
					match("January"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:37: 'JANUARY'
					{
					match("JANUARY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:602:14: 'February'
					{
					match("February"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:602:25: 'FEBRUARY'
					{
					match("FEBRUARY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:14: 'March'
					{
					match("March"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:22: 'MARCH'
					{
					match("MARCH"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:14: 'April'
					{
					match("April"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:22: 'APRIL'
					{
					match("APRIL"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:14: 'May'
					{
					match("May"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:20: 'MAY'
					{
					match("MAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:14: 'June'
					{
					match("June"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:21: 'JUNE'
					{
					match("JUNE"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:14: 'July'
					{
					match("July"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:21: 'JULY'
					{
					match("JULY"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:14: 'August'
					{
					match("August"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:23: 'AUGUST'
					{
					match("AUGUST"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:609:14: 'September'
					{
					match("September"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:609:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:14: 'October'
					{
					match("October"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:24: 'OCTOBER'
					{
					match("OCTOBER"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:14: 'November'
					{
					match("November"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:25: 'NOVEMBER'
					{
					match("NOVEMBER"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:14: 'December'
					{
					match("December"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:25: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:614:29: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:25: ( 'RING' | 'Ring' )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0=='R') ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1=='I') ) {
					alt41=1;
				}
				else if ( (LA41_1=='i') ) {
					alt41=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:29: 'RING'
					{
					match("RING"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:616:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:619:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:619:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:5: ( 'am' | 'pm' )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0=='a') ) {
				alt42=1;
			}
			else if ( (LA42_0=='p') ) {
				alt42=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:9: 'am'
					{
					match("am"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
			int alt43=12;
			switch ( input.LA(1) ) {
			case 'M':
				{
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA43_4 = input.LA(3);
					if ( (LA43_4=='S') ) {
						alt43=3;
					}
					else {
						alt43=1;
					}
					}
					break;
				case 'r':
					{
					int LA43_5 = input.LA(3);
					if ( (LA43_5=='s') ) {
						alt43=4;
					}
					else {
						alt43=2;
					}
					}
					break;
				case 'S':
					{
					alt43=5;
					}
					break;
				case 's':
					{
					alt43=6;
					}
					break;
				case 'I':
					{
					alt43=7;
					}
					break;
				case 'i':
					{
					alt43=8;
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
			case 'D':
				{
				int LA43_2 = input.LA(2);
				if ( (LA43_2=='R') ) {
					alt43=9;
				}
				else if ( (LA43_2=='r') ) {
					alt43=10;
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
			case 'C':
				{
				int LA43_3 = input.LA(2);
				if ( (LA43_3=='O') ) {
					alt43=11;
				}
				else if ( (LA43_3=='o') ) {
					alt43=12;
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
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:9: 'MR'
					{
					match("MR"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:14: 'Mr'
					{
					match("Mr"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:626:9: 'MRS'
					{
					match("MRS"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:626:15: 'Mrs'
					{
					match("Mrs"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:627:9: 'MS'
					{
					match("MS"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:627:14: 'Ms'
					{
					match("Ms"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:9: 'MISS'
					{
					match("MISS"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:16: 'Miss'
					{
					match("Miss"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:10: 'DR'
					{
					match("DR"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:15: 'Dr'
					{
					match("Dr"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:9: 'COL'
					{
					match("COL"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt44=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt44=1;
					}
					break;
				case 'U':
					{
					alt44=2;
					}
					break;
				case 'a':
					{
					alt44=13;
					}
					break;
				case 'A':
					{
					alt44=14;
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
			case 'M':
				{
				int LA44_2 = input.LA(2);
				if ( (LA44_2=='o') ) {
					alt44=3;
				}
				else if ( (LA44_2=='O') ) {
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
			case 'T':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt44=5;
					}
					break;
				case 'U':
					{
					alt44=6;
					}
					break;
				case 'h':
					{
					alt44=9;
					}
					break;
				case 'H':
					{
					alt44=10;
					}
					break;
				default:
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
			case 'W':
				{
				int LA44_4 = input.LA(2);
				if ( (LA44_4=='e') ) {
					alt44=7;
				}
				else if ( (LA44_4=='E') ) {
					alt44=8;
				}
				else {
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
			case 'F':
				{
				int LA44_5 = input.LA(2);
				if ( (LA44_5=='r') ) {
					alt44=11;
				}
				else if ( (LA44_5=='R') ) {
					alt44=12;
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
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:27: 'Sunday'
					{
					match("Sunday"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:36: 'SUNDAY'
					{
					match("SUNDAY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:634:9: 'Monday'
					{
					match("Monday"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:634:18: 'MONDAY'
					{
					match("MONDAY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:9: 'Tuesday'
					{
					match("Tuesday"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:19: 'TUESDAY'
					{
					match("TUESDAY"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:9: 'Wednesday'
					{
					match("Wednesday"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:637:9: 'Thursday'
					{
					match("Thursday"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:637:20: 'THURSDAY'
					{
					match("THURSDAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:638:9: 'Friday'
					{
					match("Friday"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:638:18: 'FRIDAY'
					{
					match("FRIDAY"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:639:9: 'Saturday'
					{
					match("Saturday"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:639:20: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:656:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0=='L') ) {
				alt45=1;
			}
			else if ( (LA45_0=='V') ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:656:9: 'LUNCH'
					{
					match("LUNCH"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:656:17: 'VARIETY GROUP JUDGING'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:653:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:653:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			mFRAG_PROPER_NAME(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+
			int cnt47=0;
			loop47:
			do {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==' ') ) {
					int LA47_1 = input.LA(2);
					if ( (LA47_1=='(') ) {
						int LA47_3 = input.LA(3);
						if ( ((LA47_3 >= 'A' && LA47_3 <= 'Z')) ) {
							alt47=1;
						}

					}
					else if ( ((LA47_1 >= 'A' && LA47_1 <= 'Z')) ) {
						alt47=1;
					}

				}

				switch (alt47) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0=='(') ) {
						alt46=1;
					}
					else if ( ((LA46_0 >= 'A' && LA46_0 <= 'Z')) ) {
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:66: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:85: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

				default :
					if ( cnt47 >= 1 ) break loop47;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(47, input);
						throw eee;
				}
				cnt47++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:106: ( WS )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( ((LA48_0 >= '\t' && LA48_0 <= '\n')||LA48_0=='\r'||LA48_0==' ') ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:106: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:110: ( PARENTHETICAL_INT )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0=='(') ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:110: PARENTHETICAL_INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt50=0;
			loop50:
			do {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( ((LA50_0 >= '\t' && LA50_0 <= '\n')||LA50_0=='\r'||LA50_0==' ') ) {
					alt50=1;
				}

				switch (alt50) {
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
					if ( cnt50 >= 1 ) break loop50;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(50, input);
						throw eee;
				}
				cnt50++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:13: ( ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:17: ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:17: ( ( 'GROUP RING' )=> 'GROUP RING' | ( 'RING' WS INT ) )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0=='G') && (synpred2_test())) {
				alt51=1;
			}
			else if ( (LA51_0=='R') ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:18: ( 'GROUP RING' )=> 'GROUP RING'
					{
					match("GROUP RING"); if (state.failed) return ;

					if ( state.backtracking==0 ) {allowGroup=true;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:65: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:65: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:66: 'RING' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			{
			match('('); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			match(')'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:6: ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( ((LA53_0 >= '\t' && LA53_0 <= '\n')||LA53_0=='\r'||LA53_0==' ') && (synpred3_test())) {
				alt53=1;
			}
			else if ( ((LA53_0 >= '0' && LA53_0 <= '9')) && (synpred3_test())) {
				alt53=1;
			}
			else {
				alt53=2;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:83: ( WS )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( ((LA52_0 >= '\t' && LA52_0 <= '\n')||LA52_0=='\r'||LA52_0==' ') ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:83: WS
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:664:8: ()=>
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:13: INT ':' INT WS FRAG_TIME_LABEL
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

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:667:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:667:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:13: ( '.' )+
			int cnt54=0;
			loop54:
			do {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0=='.') ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:13: '.'
					{
					match('.'); if (state.failed) return ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:671:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:671:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:671:6: ( '0' .. '9' )+
			int cnt55=0;
			loop55:
			do {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( ((LA55_0 >= '0' && LA55_0 <= '9')) ) {
					alt55=1;
				}

				switch (alt55) {
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
					if ( cnt55 >= 1 ) break loop55;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(55, input);
						throw eee;
				}
				cnt55++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:13: ( WORD | INT | FRAG_PROPER_NAME )
			int alt56=3;
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
				alt56=1;
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
				alt56=2;
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
				alt56=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:14: WORD
					{
					mWORD(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:19: INT
					{
					mINT(); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( ((LA58_0 >= '\t' && LA58_0 <= '\n')||LA58_0=='\r'||LA58_0==' ') ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:45: ( WORD | INT | FRAG_PROPER_NAME )
					int alt57=3;
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
						alt57=1;
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
						alt57=2;
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
						alt57=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 57, 0, input);
						throw nvae;
					}
					switch (alt57) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:46: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:55: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;

					}

					}
					break;

				default :
					break loop58;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( ((LA59_0 >= '&' && LA59_0 <= '\'')||(LA59_0 >= ',' && LA59_0 <= '-')||(LA59_0 >= ':' && LA59_0 <= ';')||(LA59_0 >= 'A' && LA59_0 <= 'Z')||LA59_0=='_'||(LA59_0 >= 'a' && LA59_0 <= 'z')||LA59_0=='\u2019') ) {
					alt59=1;
				}

				switch (alt59) {
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
					break loop59;
				}
			} while (true);

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:94: ( END_PUNCTUATION )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0=='!'||LA60_0=='.'||LA60_0=='?') ) {
				alt60=1;
			}
			switch (alt60) {
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

	// $ANTLR start "PARENTHETICAL_INT"
	public final void mPARENTHETICAL_INT() throws RecognitionException {
		try {
			int _type = PARENTHETICAL_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:13: ( WS )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( ((LA61_0 >= '\t' && LA61_0 <= '\n')||LA61_0=='\r'||LA61_0==' ') ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:13: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			mINT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:21: ( WS )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( ((LA62_0 >= '\t' && LA62_0 <= '\n')||LA62_0=='\r'||LA62_0==' ') ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:21: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt63=0;
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( ((LA63_0 >= '&' && LA63_0 <= '\'')||(LA63_0 >= ',' && LA63_0 <= '-')||(LA63_0 >= ':' && LA63_0 <= ';')||LA63_0=='_'||(LA63_0 >= 'a' && LA63_0 <= 'z')||LA63_0=='\u2019') ) {
					alt63=1;
				}

				switch (alt63) {
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
					if ( cnt63 >= 1 ) break loop63;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(63, input);
						throw eee;
				}
				cnt63++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:65: ( END_PUNCTUATION )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0=='!'||LA64_0=='.'||LA64_0=='?') ) {
				alt64=1;
			}
			switch (alt64) {
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			int cnt66=0;
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( ((LA66_0 >= '&' && LA66_0 <= '(')||(LA66_0 >= ',' && LA66_0 <= '.')||(LA66_0 >= '0' && LA66_0 <= ';')||(LA66_0 >= 'A' && LA66_0 <= 'Z')||LA66_0=='_'||(LA66_0 >= 'a' && LA66_0 <= 'z')||LA66_0=='\u2019') ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					int alt65=5;
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
						alt65=1;
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
						alt65=2;
						}
						break;
					case '(':
						{
						alt65=3;
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
						alt65=4;
						}
						break;
					case '.':
						{
						alt65=5;
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:32: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:37: PARENTHETICAL
							{
							mPARENTHETICAL(); if (state.failed) return ;

							}
							break;
						case 4 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 5 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:55: ELLIPSIS
							{
							mELLIPSIS(); if (state.failed) return ;

							}
							break;

					}

					if ( state.backtracking==0 ) {allowBreed=false; allowGroup=false;allowJudge=false;}
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:682:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:682:4: WORD END_PUNCTUATION
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:26: ( 'Unless otherwise announced' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:27: 'Unless otherwise announced'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:684:28: ( '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:684:30: '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:684:34: ( FRAG_TITLE WS )?
			int alt67=2;
			switch ( input.LA(1) ) {
				case 'M':
					{
					switch ( input.LA(2) ) {
						case 'R':
							{
							int LA67_5 = input.LA(3);
							if ( (LA67_5=='S') ) {
								int LA67_15 = input.LA(4);
								if ( ((LA67_15 >= '\t' && LA67_15 <= '\n')||LA67_15=='\r'||LA67_15==' ') ) {
									alt67=1;
								}
							}
							else if ( ((LA67_5 >= '\t' && LA67_5 <= '\n')||LA67_5=='\r'||LA67_5==' ') ) {
								alt67=1;
							}
							}
							break;
						case 'r':
							{
							int LA67_6 = input.LA(3);
							if ( (LA67_6=='s') ) {
								int LA67_17 = input.LA(4);
								if ( ((LA67_17 >= '\t' && LA67_17 <= '\n')||LA67_17=='\r'||LA67_17==' ') ) {
									alt67=1;
								}
							}
							else if ( ((LA67_6 >= '\t' && LA67_6 <= '\n')||LA67_6=='\r'||LA67_6==' ') ) {
								alt67=1;
							}
							}
							break;
						case 'S':
							{
							int LA67_7 = input.LA(3);
							if ( ((LA67_7 >= '\t' && LA67_7 <= '\n')||LA67_7=='\r'||LA67_7==' ') ) {
								alt67=1;
							}
							}
							break;
						case 's':
							{
							int LA67_8 = input.LA(3);
							if ( ((LA67_8 >= '\t' && LA67_8 <= '\n')||LA67_8=='\r'||LA67_8==' ') ) {
								alt67=1;
							}
							}
							break;
						case 'I':
							{
							int LA67_9 = input.LA(3);
							if ( (LA67_9=='S') ) {
								int LA67_18 = input.LA(4);
								if ( (LA67_18=='S') ) {
									int LA67_22 = input.LA(5);
									if ( ((LA67_22 >= '\t' && LA67_22 <= '\n')||LA67_22=='\r'||LA67_22==' ') ) {
										alt67=1;
									}
								}
							}
							}
							break;
						case 'i':
							{
							int LA67_10 = input.LA(3);
							if ( (LA67_10=='s') ) {
								int LA67_19 = input.LA(4);
								if ( (LA67_19=='s') ) {
									int LA67_23 = input.LA(5);
									if ( ((LA67_23 >= '\t' && LA67_23 <= '\n')||LA67_23=='\r'||LA67_23==' ') ) {
										alt67=1;
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
					int LA67_2 = input.LA(2);
					if ( (LA67_2=='R') ) {
						int LA67_11 = input.LA(3);
						if ( ((LA67_11 >= '\t' && LA67_11 <= '\n')||LA67_11=='\r'||LA67_11==' ') ) {
							alt67=1;
						}
					}
					else if ( (LA67_2=='r') ) {
						int LA67_12 = input.LA(3);
						if ( ((LA67_12 >= '\t' && LA67_12 <= '\n')||LA67_12=='\r'||LA67_12==' ') ) {
							alt67=1;
						}
					}
					}
					break;
				case 'C':
					{
					int LA67_3 = input.LA(2);
					if ( (LA67_3=='O') ) {
						int LA67_13 = input.LA(3);
						if ( (LA67_13=='L') ) {
							int LA67_20 = input.LA(4);
							if ( ((LA67_20 >= '\t' && LA67_20 <= '\n')||LA67_20=='\r'||LA67_20==' ') ) {
								alt67=1;
							}
						}
					}
					else if ( (LA67_3=='o') ) {
						int LA67_14 = input.LA(3);
						if ( (LA67_14=='l') ) {
							int LA67_21 = input.LA(4);
							if ( ((LA67_21 >= '\t' && LA67_21 <= '\n')||LA67_21=='\r'||LA67_21==' ') ) {
								alt67=1;
							}
						}
					}
					}
					break;
			}
			switch (alt67) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:684:35: FRAG_TITLE WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:689:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:689:6: .
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | GROUP_ENDING_ANNOUNCEMENT | FallThrough )
		int alt68=24;
		alt68 = dfa68.predict(input);
		switch (alt68) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:10: JUNIOR_CLASS
				{
				mJUNIOR_CLASS(); if (state.failed) return ;

				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:23: BREED_NAME
				{
				mBREED_NAME(); if (state.failed) return ;

				}
				break;
			case 3 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:34: SPECIAL_SUFFIX
				{
				mSPECIAL_SUFFIX(); if (state.failed) return ;

				}
				break;
			case 4 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:49: GROUP_RING
				{
				mGROUP_RING(); if (state.failed) return ;

				}
				break;
			case 5 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:60: NON_CONFORMATION_CLASS_NAME
				{
				mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:88: NON_CONF_SECOND_LINE_COMMENT
				{
				mNON_CONF_SECOND_LINE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:117: RALLY_CLASS
				{
				mRALLY_CLASS(); if (state.failed) return ;

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:129: RALLY_ENTRY
				{
				mRALLY_ENTRY(); if (state.failed) return ;

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:141: NON_CONFORMATION_SECOND_LINE
				{
				mNON_CONFORMATION_SECOND_LINE(); if (state.failed) return ;

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:170: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:189: BREED_COUNT
				{
				mBREED_COUNT(); if (state.failed) return ;

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:201: JUDGE_NAME
				{
				mJUDGE_NAME(); if (state.failed) return ;

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:212: WS
				{
				mWS(); if (state.failed) return ;

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:215: RING_TITLE
				{
				mRING_TITLE(); if (state.failed) return ;

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:226: PHONE_NUMBER
				{
				mPHONE_NUMBER(); if (state.failed) return ;

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:239: TIME
				{
				mTIME(); if (state.failed) return ;

				}
				break;
			case 17 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:244: DATE
				{
				mDATE(); if (state.failed) return ;

				}
				break;
			case 18 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:249: ELLIPSIS
				{
				mELLIPSIS(); if (state.failed) return ;

				}
				break;
			case 19 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:258: INT
				{
				mINT(); if (state.failed) return ;

				}
				break;
			case 20 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:262: PARENTHETICAL
				{
				mPARENTHETICAL(); if (state.failed) return ;

				}
				break;
			case 21 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:276: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); if (state.failed) return ;

				}
				break;
			case 22 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:294: COMMENT
				{
				mCOMMENT(); if (state.failed) return ;

				}
				break;
			case 23 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:302: GROUP_ENDING_ANNOUNCEMENT
				{
				mGROUP_ENDING_ANNOUNCEMENT(); if (state.failed) return ;

				}
				break;
			case 24 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:328: FallThrough
				{
				mFallThrough(); if (state.failed) return ;

				}
				break;

		}
	}

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:18: ( 'GROUP RING' )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:19: 'GROUP RING'
		{
		match("GROUP RING"); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:9: ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:9: ( WS )?
		int alt69=2;
		int LA69_0 = input.LA(1);
		if ( ((LA69_0 >= '\t' && LA69_0 <= '\n')||LA69_0=='\r'||LA69_0==' ') ) {
			alt69=1;
		}
		switch (alt69) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:9: WS
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:664:8: ()
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:664:9: 
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
	protected DFA15 dfa15 = new DFA15(this);
	protected DFA37 dfa37 = new DFA37(this);
	protected DFA68 dfa68 = new DFA68(this);
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
			return "238:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
		}
	}

	static final String DFA15_eotS =
		"\66\uffff\1\76\2\uffff\1\102\11\uffff\1\111\1\113\13\uffff";
	static final String DFA15_eofS =
		"\120\uffff";
	static final String DFA15_minS =
		"\1\61\1\63\1\uffff\1\40\1\150\1\156\1\151\1\145\1\162\1\uffff\1\141\3"+
		"\uffff\1\155\1\uffff\1\145\6\uffff\1\143\1\uffff\1\147\2\uffff\1\162\1"+
		"\154\1\151\1\uffff\1\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff"+
		"\1\163\1\147\1\157\1\145\1\151\1\141\1\150\1\40\1\164\1\150\1\163\1\156"+
		"\1\40\2\uffff\1\150\2\uffff\1\150\1\40\1\122\1\uffff\2\40\1\123\4\uffff"+
		"\1\103\5\uffff";
	static final String DFA15_maxS =
		"\1\127\1\65\1\uffff\1\157\1\165\1\156\1\154\1\157\1\162\1\uffff\1\157"+
		"\3\uffff\1\165\1\uffff\1\151\6\uffff\1\154\1\uffff\1\147\2\uffff\2\162"+
		"\1\151\1\uffff\1\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1"+
		"\163\1\147\1\157\1\145\1\151\1\141\2\150\1\164\1\150\1\163\1\156\1\40"+
		"\2\uffff\1\150\2\uffff\1\150\1\40\1\127\1\uffff\2\40\1\127\4\uffff\1\123"+
		"\5\uffff";
	static final String DFA15_acceptS =
		"\2\uffff\1\3\6\uffff\1\27\1\uffff\1\33\1\34\1\35\1\uffff\1\42\1\uffff"+
		"\1\1\1\2\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\16\1\17\3\uffff\1\30\2"+
		"\uffff\1\40\1\41\1\43\1\44\1\uffff\1\10\1\11\2\uffff\1\22\1\23\15\uffff"+
		"\1\31\1\32\1\uffff\1\46\1\45\3\uffff\1\24\3\uffff\1\25\1\26\1\37\1\36"+
		"\1\uffff\1\13\1\20\1\21\1\14\1\15";
	static final String DFA15_specialS =
		"\120\uffff}>";
	static final String[] DFA15_transitionS = {
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

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "455:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA37_eotS =
		"\4\uffff\1\5\1\uffff";
	static final String DFA37_eofS =
		"\6\uffff";
	static final String DFA37_minS =
		"\1\60\1\55\1\60\1\uffff\1\60\1\uffff";
	static final String DFA37_maxS =
		"\1\71\1\73\1\71\1\uffff\1\73\1\uffff";
	static final String DFA37_acceptS =
		"\3\uffff\1\2\1\uffff\1\1";
	static final String DFA37_specialS =
		"\6\uffff}>";
	static final String[] DFA37_transitionS = {
			"\12\1",
			"\1\2\2\uffff\12\1\1\uffff\1\3",
			"\12\4",
			"",
			"\12\4\1\uffff\1\3",
			""
	};

	static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
	static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
	static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
	static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
	static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
	static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
	static final short[][] DFA37_transition;

	static {
		int numStates = DFA37_transitionS.length;
		DFA37_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
		}
	}

	class DFA37 extends DFA {

		public DFA37(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 37;
			this.eot = DFA37_eot;
			this.eof = DFA37_eof;
			this.min = DFA37_min;
			this.max = DFA37_max;
			this.accept = DFA37_accept;
			this.special = DFA37_special;
			this.transition = DFA37_transition;
		}
		@Override
		public String getDescription() {
			return "593:1: NON_CONFORMATION_SECOND_LINE : ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) );";
		}
	}

	static final String DFA68_eotS =
		"\1\uffff\31\52\1\u00a6\1\uffff\1\40\1\u00ad\3\uffff\11\52\1\uffff\76\52"+
		"\1\uffff\21\52\1\u0134\50\52\1\u00a6\1\52\1\uffff\1\52\6\uffff\1\u00ad"+
		"\6\52\1\uffff\161\52\1\u01f7\2\52\1\u01fd\11\52\1\uffff\34\52\1\uffff"+
		"\33\52\2\u0240\1\52\2\uffff\1\u0248\2\uffff\1\u0248\2\uffff\10\52\1\u01fd"+
		"\153\52\1\u01fd\12\52\1\uffff\1\u02c4\1\uffff\1\52\1\u02d7\1\52\1\uffff"+
		"\46\52\1\uffff\1\52\1\uffff\31\52\1\uffff\2\52\6\uffff\7\52\1\uffff\13"+
		"\52\1\u032e\30\52\1\u0346\1\52\1\u0348\32\52\1\u0360\43\52\1\u037d\2\52"+
		"\1\u01fd\4\52\1\u0384\5\52\21\uffff\1\52\1\u03a7\1\uffff\10\52\1\uffff"+
		"\2\u0134\62\52\1\u0240\1\u03df\4\uffff\7\52\1\uffff\1\52\1\u01fd\11\52"+
		"\1\uffff\10\52\1\u03f7\13\52\1\u0401\2\52\1\uffff\1\52\1\uffff\1\u0403"+
		"\15\52\1\u040f\10\52\1\uffff\26\52\1\u0426\5\52\1\uffff\6\52\1\uffff\3"+
		"\52\1\u0432\1\52\34\uffff\1\52\1\uffff\1\52\1\uffff\7\52\1\u045c\33\52"+
		"\1\u0476\21\52\1\uffff\1\52\1\u0489\1\u048a\4\52\1\uffff\16\52\1\u049a"+
		"\1\uffff\11\52\1\uffff\1\52\1\uffff\2\52\1\u04a3\10\52\1\uffff\6\52\1"+
		"\u0360\6\52\1\u04b2\10\52\1\uffff\4\52\1\u04bc\4\52\1\u04c0\1\52\1\uffff"+
		"\1\52\37\uffff\11\52\1\uffff\1\u04e8\4\52\1\u04ed\23\52\1\uffff\6\52\1"+
		"\u04fd\6\52\1\u01fd\1\uffff\1\u0503\2\52\2\uffff\2\52\1\uffff\13\52\1"+
		"\u01fd\1\uffff\2\52\1\u01fd\3\52\1\u0513\1\52\1\uffff\15\52\1\u01fd\1"+
		"\uffff\1\u051e\2\52\1\u0521\1\u0522\1\u0523\3\52\1\uffff\1\u0525\2\52"+
		"\1\uffff\2\52\33\uffff\1\u054a\3\uffff\5\52\1\u0134\1\uffff\4\52\1\uffff"+
		"\2\52\1\u0552\10\52\1\u0360\3\52\1\uffff\5\52\1\uffff\14\52\1\u0567\2"+
		"\52\1\uffff\2\52\1\u056c\1\52\1\u056e\1\u056f\1\52\1\u01fd\1\52\1\u0572"+
		"\1\uffff\2\52\3\uffff\1\52\1\uffff\1\u0575\2\52\34\uffff\3\52\1\uffff"+
		"\1\52\4\uffff\4\52\1\uffff\15\52\1\u05a4\6\52\1\uffff\1\52\1\u05a9\2\52"+
		"\1\uffff\1\52\2\uffff\2\52\1\uffff\1\u05ae\1\u05af\1\uffff\1\u05b0\1\52"+
		"\32\uffff\3\52\3\uffff\1\u05ce\1\u05cf\1\u05d0\4\52\1\u05d5\4\52\1\uffff"+
		"\4\52\1\uffff\1\u05dc\3\52\32\uffff\3\52\6\uffff\1\52\1\u0360\1\52\1\u01fd"+
		"\1\uffff\1\u01fd\2\52\1\u05f8\2\52\1\uffff\1\52\22\uffff\3\52\2\uffff"+
		"\3\52\1\uffff\1\u0613\21\uffff\1\u0624\1\52\1\u0626\2\uffff\2\52\1\u03df"+
		"\15\uffff\1\u0634\4\uffff\1\52\3\uffff\1\u063a\16\uffff\1\52\14\uffff"+
		"\1\52\12\uffff\1\52\11\uffff\1\52\6\uffff\1\u0667\24\uffff";
	static final String DFA68_eofS =
		"\u0676\uffff";
	static final String DFA68_minS =
		"\1\0\1\111\1\154\1\117\1\144\1\105\1\117\1\122\1\156\2\122\1\105\1\142"+
		"\1\141\1\145\1\125\1\141\1\60\1\101\1\105\1\101\1\105\2\157\2\156\1\46"+
		"\1\uffff\1\11\1\46\3\uffff\1\154\1\156\4\11\1\123\1\156\1\116\1\uffff"+
		"\1\145\1\144\1\164\1\162\1\141\1\116\1\146\1\162\1\151\1\141\1\145\1\141"+
		"\1\160\1\163\1\166\1\163\1\141\1\143\1\141\1\162\1\141\1\154\1\123\1\151"+
		"\1\163\1\145\1\162\1\165\1\143\1\162\1\114\1\143\1\142\2\11\1\147\1\143"+
		"\1\145\1\141\1\170\1\145\1\111\1\162\1\141\1\145\1\154\1\141\1\117\1\162"+
		"\1\122\1\125\1\151\1\145\1\151\1\141\1\160\1\145\1\155\1\166\1\142\1\157"+
		"\1\141\1\uffff\1\167\1\116\1\151\1\153\1\141\1\157\1\151\1\147\1\162\1"+
		"\145\1\154\1\144\1\157\1\164\1\163\1\107\1\116\1\46\1\151\1\150\1\141"+
		"\1\145\1\142\1\171\1\146\2\141\1\156\1\145\1\117\1\105\1\116\1\124\1\142"+
		"\1\40\1\145\1\131\1\122\1\145\1\105\1\165\1\125\1\172\1\162\1\124\1\122"+
		"\1\144\1\151\1\154\1\122\1\154\1\104\1\154\1\162\1\151\1\154\1\143\1\60"+
		"\1\46\1\60\1\uffff\1\60\1\uffff\3\11\2\uffff\1\46\2\164\1\143\1\151\1"+
		"\163\1\11\1\uffff\1\11\1\123\1\144\1\104\1\156\1\40\1\145\1\141\1\146"+
		"\1\160\1\146\1\55\1\145\1\150\1\145\1\164\1\163\1\162\1\164\1\145\1\164"+
		"\1\141\1\145\1\147\1\154\2\147\1\151\1\150\1\143\1\157\1\145\1\144\1\164"+
		"\1\166\1\145\1\153\1\143\1\141\1\163\1\157\1\154\1\124\1\162\1\141\1\144"+
		"\1\141\1\153\1\163\1\150\1\167\1\156\1\155\1\153\1\11\1\154\1\11\1\150"+
		"\1\155\1\144\1\145\1\157\2\154\1\145\1\154\1\156\1\164\1\40\1\156\1\144"+
		"\1\104\1\155\2\156\2\144\1\141\1\144\1\125\1\162\1\141\1\104\1\116\1\172"+
		"\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\157\1\145\1\156"+
		"\1\163\1\143\1\103\1\151\1\163\1\162\1\151\1\142\1\151\1\162\1\164\1\156"+
		"\1\151\1\145\1\144\1\164\1\11\1\151\1\145\1\41\1\40\1\154\1\142\1\162"+
		"\1\144\1\164\1\163\1\125\1\107\1\uffff\2\122\1\156\1\165\1\157\1\165\1"+
		"\151\1\164\1\154\2\164\1\142\1\145\1\153\1\145\1\164\2\156\1\146\1\163"+
		"\2\144\1\122\1\105\1\104\1\125\1\145\1\40\1\uffff\1\145\1\40\1\122\1\163"+
		"\1\123\1\162\1\122\1\163\1\145\1\163\1\105\1\111\1\155\1\163\1\164\1\156"+
		"\1\160\1\145\1\144\1\113\1\153\1\116\1\157\1\153\1\154\1\145\1\150\2\46"+
		"\3\11\1\46\2\11\1\46\2\11\2\145\1\150\1\141\2\11\1\141\1\101\1\40\1\162"+
		"\1\143\1\40\1\157\1\145\2\157\1\123\1\156\1\141\1\144\1\141\1\153\1\151"+
		"\1\157\1\156\1\162\2\156\1\145\1\154\1\144\1\143\2\151\2\145\1\156\1\157"+
		"\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163"+
		"\1\144\2\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40"+
		"\1\145\1\142\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\40\1\145\1\151"+
		"\1\145\1\151\1\154\1\144\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40"+
		"\1\145\1\157\1\164\1\150\1\165\1\120\1\151\1\156\1\111\1\104\2\141\1\150"+
		"\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150"+
		"\1\110\1\154\1\157\1\41\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154"+
		"\1\165\1\0\1\11\1\46\1\151\1\11\1\156\1\uffff\1\171\1\157\1\151\1\145"+
		"\1\167\1\145\1\114\1\11\2\60\1\164\1\153\1\171\1\162\1\160\1\164\1\171"+
		"\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145"+
		"\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\106\1\151\1\uffff\1"+
		"\111\1\144\1\104\1\163\1\123\1\154\1\162\1\141\1\122\1\105\1\141\1\150"+
		"\1\40\1\145\1\160\2\40\1\111\1\164\1\105\1\151\1\163\1\151\1\163\1\72"+
		"\1\uffff\2\60\1\uffff\4\11\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171"+
		"\1\131\1\101\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156"+
		"\1\141\1\11\1\141\1\143\1\154\1\172\1\141\1\143\1\152\1\164\3\145\1\156"+
		"\1\141\1\162\1\163\2\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\11"+
		"\1\156\1\11\1\144\1\141\1\145\1\40\1\157\1\141\1\40\1\156\1\147\1\151"+
		"\1\40\1\160\1\141\1\163\1\143\1\145\1\162\1\145\1\55\1\150\1\164\1\145"+
		"\1\155\1\40\1\163\1\142\1\41\1\145\1\154\1\40\1\163\1\103\1\150\1\171"+
		"\1\131\1\156\1\40\2\156\1\40\1\157\1\141\1\40\2\145\1\116\1\40\2\156\1"+
		"\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145\1\40\1"+
		"\145\1\41\1\154\1\156\1\41\1\147\1\157\1\40\1\157\1\11\1\145\1\150\1\141"+
		"\1\145\1\147\1\0\20\11\1\163\1\11\1\0\1\145\1\40\1\156\1\145\1\163\1\145"+
		"\1\154\1\101\1\uffff\2\46\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162"+
		"\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\111"+
		"\1\123\1\131\1\104\1\141\1\156\1\105\1\141\1\101\1\144\1\104\2\141\1\164"+
		"\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\150\1\123\1\164\1\150"+
		"\1\164\1\163\1\40\1\55\2\46\4\11\1\40\1\146\1\145\1\163\1\165\2\54\1\uffff"+
		"\1\157\1\40\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\0\1"+
		"\156\1\141\1\151\1\145\1\154\1\145\1\151\1\40\1\11\1\144\1\162\1\147\1"+
		"\156\1\40\2\145\1\40\1\157\1\143\1\40\1\11\1\40\1\162\1\0\1\40\1\0\1\11"+
		"\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\157\1\162\1\40"+
		"\1\11\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163\1\145"+
		"\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162\1\163\1\107\1\40\1"+
		"\144\1\156\1\163\1\156\1\157\1\11\2\157\1\156\1\162\1\156\1\uffff\1\157"+
		"\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156\1\11\1\165\34\11\1\143"+
		"\1\0\1\141\1\uffff\1\145\1\166\2\151\1\154\2\122\1\11\1\144\1\141\1\145"+
		"\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162\1\40\1\54\1\150\1\164"+
		"\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\171\1\131\1\141\1\101\1\11"+
		"\1\156\1\151\1\116\1\131\1\141\1\144\1\164\1\151\1\107\1\162\1\104\1\172"+
		"\1\151\1\171\1\40\2\60\1\uffff\1\60\2\11\1\164\1\162\1\11\1\165\1\101"+
		"\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156\1\141\1\154"+
		"\1\151\1\144\1\11\1\0\1\40\1\157\1\164\2\40\1\162\1\40\1\165\1\153\1\0"+
		"\1\40\1\0\1\171\1\163\1\11\1\164\1\156\1\162\1\141\1\165\3\40\1\0\1\157"+
		"\1\156\1\141\1\156\1\40\1\143\1\41\1\156\1\40\1\141\1\40\1\156\1\145\1"+
		"\11\1\145\1\40\1\151\1\40\1\145\1\144\1\162\1\153\1\0\1\162\1\40\1\144"+
		"\1\147\1\11\1\156\1\163\1\145\1\40\1\11\1\151\1\0\1\145\37\11\1\56\1\156"+
		"\1\40\1\145\1\141\1\154\2\40\1\60\1\0\1\11\1\171\1\162\1\150\1\155\1\11"+
		"\1\144\1\156\1\163\2\40\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1"+
		"\171\1\131\1\0\1\40\1\154\2\40\1\156\1\141\1\11\1\162\1\40\1\157\1\101"+
		"\1\143\1\162\1\41\1\uffff\1\46\2\60\2\0\2\145\1\uffff\2\156\1\141\1\154"+
		"\1\124\1\163\2\40\1\156\1\154\1\141\1\41\1\0\1\156\1\157\1\41\1\156\2"+
		"\40\1\11\1\40\1\0\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1\150\2\164"+
		"\1\144\1\41\1\0\1\11\1\143\1\40\3\11\2\40\1\145\1\0\1\11\1\145\1\40\1"+
		"\0\1\141\1\163\37\11\2\40\1\162\1\156\1\145\1\46\1\0\1\54\1\153\2\40\1"+
		"\0\2\40\1\11\1\163\1\40\1\153\1\40\1\113\3\54\1\41\1\151\1\145\1\171\1"+
		"\0\1\145\1\165\1\131\1\165\1\145\1\uffff\1\55\1\162\1\40\1\144\1\40\1"+
		"\156\1\141\1\111\1\143\1\40\1\145\1\156\1\11\1\156\1\144\1\0\1\146\1\145"+
		"\1\11\1\164\2\11\1\145\1\41\1\145\1\11\1\0\1\40\1\156\3\0\1\162\1\0\1"+
		"\11\1\156\1\145\34\11\1\163\1\141\1\154\1\46\1\151\1\0\3\11\1\163\1\40"+
		"\1\162\1\145\1\0\1\150\1\145\1\105\1\164\1\162\1\54\1\144\1\147\1\54\1"+
		"\151\1\40\1\60\1\40\1\11\1\40\1\156\1\116\1\150\1\162\1\40\1\0\1\40\1"+
		"\11\1\146\1\40\1\0\1\145\2\0\1\162\1\144\1\0\2\11\1\0\1\11\1\40\32\11"+
		"\1\143\1\162\1\141\6\11\1\151\1\163\1\123\1\171\1\11\1\40\1\150\1\156"+
		"\1\60\1\0\1\144\1\107\1\145\1\40\1\0\1\11\1\144\2\40\3\0\27\11\1\157\1"+
		"\164\1\143\3\11\3\0\1\162\1\41\1\40\1\41\1\0\1\41\1\164\1\60\1\11\1\40"+
		"\1\162\1\0\1\40\22\11\1\142\1\151\1\153\2\11\1\145\1\154\1\60\1\0\22\11"+
		"\1\41\1\55\1\41\2\11\1\40\1\151\1\46\1\0\14\11\1\46\3\11\1\0\1\103\1\0"+
		"\15\11\1\0\3\11\1\157\1\11\1\0\12\11\1\154\12\11\1\157\11\11\1\162\6\11"+
		"\1\41\5\11\1\0\16\11";
	static final String DFA68_maxS =
		"\1\uffff\1\163\1\164\1\157\3\165\1\162\1\170\2\162\1\141\1\164\1\141\1"+
		"\165\1\u00f6\1\171\1\165\1\167\1\165\2\151\2\157\1\164\1\156\1\u2019\1"+
		"\uffff\2\u2019\3\uffff\2\163\1\123\1\163\2\40\1\123\1\156\1\116\1\uffff"+
		"\1\145\1\144\1\164\1\166\1\167\1\116\1\147\1\162\1\151\1\141\1\145\1\141"+
		"\1\160\1\163\1\166\1\163\1\162\1\143\1\165\1\171\1\165\1\154\1\123\1\166"+
		"\1\163\1\157\1\162\1\165\1\154\1\162\1\114\1\156\1\147\2\40\1\164\1\143"+
		"\1\156\1\141\1\170\1\151\1\111\1\162\1\141\1\145\1\162\1\145\1\117\1\166"+
		"\1\122\1\125\1\151\1\145\1\151\1\141\1\160\1\162\1\155\1\166\1\153\1\157"+
		"\1\141\1\uffff\1\167\1\116\1\162\1\164\1\141\1\157\1\162\1\154\1\162\1"+
		"\145\2\164\1\157\1\164\1\163\1\107\1\116\1\u2019\1\164\1\157\1\164\1\151"+
		"\1\154\1\171\1\146\1\151\1\141\1\163\1\145\1\117\1\105\1\116\1\124\1\142"+
		"\1\171\1\145\1\131\1\122\1\145\1\105\1\165\1\125\1\172\1\164\1\124\1\122"+
		"\1\163\1\151\1\162\1\122\1\154\1\104\1\154\1\162\1\151\1\154\1\143\1\71"+
		"\1\u2019\1\71\1\uffff\1\71\1\uffff\1\71\2\u2019\2\uffff\1\u2019\2\164"+
		"\1\143\1\151\1\163\1\40\1\uffff\1\40\1\123\1\144\1\104\1\156\1\40\1\145"+
		"\1\151\1\167\1\160\1\146\1\55\1\145\1\150\1\145\1\164\1\163\1\162\1\164"+
		"\1\145\1\164\1\141\1\163\1\165\1\154\1\147\1\156\1\151\1\150\1\143\1\157"+
		"\1\145\1\172\1\164\1\166\1\145\1\153\1\143\1\164\1\163\1\157\1\154\1\124"+
		"\1\162\1\145\1\144\1\141\1\153\1\163\1\156\1\167\1\156\1\155\1\153\2\154"+
		"\1\40\1\150\1\155\1\144\1\145\1\165\1\154\1\162\1\145\1\154\1\156\1\164"+
		"\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\171\1\144\1\125\1\162\1\141"+
		"\1\104\1\116\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162"+
		"\1\157\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\162\1\151\1\142\1\151"+
		"\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\u2019\1\151\1\145\1\u2019"+
		"\1\40\1\154\1\142\1\162\1\144\1\164\1\163\1\125\1\107\1\uffff\2\122\1"+
		"\156\1\165\1\157\1\165\1\151\1\164\1\154\2\164\1\150\1\145\1\153\1\145"+
		"\1\164\3\156\1\163\1\144\1\145\1\122\1\105\1\104\1\125\1\145\1\40\1\uffff"+
		"\1\145\1\40\1\122\1\163\1\123\1\162\1\122\1\163\1\145\1\163\1\105\1\111"+
		"\1\155\1\163\1\164\1\156\1\160\1\145\1\144\1\113\1\153\1\116\1\157\1\153"+
		"\1\154\1\145\1\150\2\u2019\2\71\2\u2019\1\51\3\u2019\1\51\1\151\1\145"+
		"\1\150\1\141\2\40\1\141\1\101\1\u2019\1\162\1\143\1\40\1\157\1\151\2\157"+
		"\1\123\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\156\1\162\2\156\1\145"+
		"\1\154\1\144\1\143\2\151\2\145\1\156\1\157\1\153\1\144\1\164\1\145\2\157"+
		"\1\151\1\162\1\151\1\145\1\162\1\164\1\163\1\144\1\155\1\40\1\156\1\141"+
		"\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\145\1\142\1\145\1\151"+
		"\1\171\1\163\1\141\1\151\1\162\1\40\1\145\1\151\1\145\1\171\1\154\1\144"+
		"\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150"+
		"\1\165\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151\1\156\1\150\1\171"+
		"\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\u2019"+
		"\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\0\2\u2019\1\151"+
		"\1\u2019\1\156\1\uffff\1\171\1\157\1\151\1\145\1\167\1\145\1\114\1\40"+
		"\2\71\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40"+
		"\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145\1\141\1\151\1\160\1\124"+
		"\1\120\1\101\1\122\1\164\1\126\1\151\1\uffff\1\111\1\144\1\104\1\163\1"+
		"\123\1\154\1\162\1\141\1\122\1\105\1\141\1\150\1\40\1\145\1\160\1\150"+
		"\1\40\1\111\1\164\1\105\1\151\1\163\1\151\1\163\1\72\1\uffff\2\71\1\uffff"+
		"\1\71\1\u2019\1\71\1\u2019\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171"+
		"\1\131\1\127\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156"+
		"\1\141\1\u2019\1\141\1\143\1\154\1\172\1\141\1\143\1\152\1\164\3\145\1"+
		"\156\1\141\1\162\1\163\2\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145"+
		"\1\u2019\1\156\1\u2019\1\144\1\141\1\145\1\40\1\157\1\141\1\40\1\156\1"+
		"\147\1\151\1\40\1\160\1\141\1\163\1\143\1\145\1\162\1\145\1\55\1\150\1"+
		"\164\1\145\1\155\2\163\1\142\1\u2019\1\145\1\154\1\40\1\163\1\103\1\150"+
		"\1\171\1\131\1\156\1\40\2\156\1\145\1\157\1\141\1\40\2\145\1\116\1\40"+
		"\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145"+
		"\1\40\1\145\1\u2019\1\154\1\156\1\u2019\1\147\1\157\1\163\1\157\1\u2019"+
		"\1\145\1\150\1\141\1\145\1\147\1\0\1\71\17\u2019\1\163\1\u2019\1\0\1\145"+
		"\1\40\1\156\1\145\1\163\1\145\1\154\1\101\1\uffff\2\u2019\1\40\1\151\1"+
		"\145\1\144\1\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1"+
		"\157\1\141\1\170\1\171\2\163\1\111\1\123\1\131\1\104\1\141\1\156\1\105"+
		"\1\141\1\101\1\144\1\104\2\141\1\164\1\101\1\124\1\162\1\40\1\163\1\145"+
		"\1\141\1\116\1\150\1\123\1\164\1\150\1\164\1\163\1\40\1\71\2\u2019\1\71"+
		"\1\51\1\u2019\1\51\1\40\1\146\1\145\1\163\1\165\2\54\1\uffff\1\157\1\u2019"+
		"\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\0\1\156\1\141"+
		"\1\151\1\145\1\154\1\145\1\151\1\40\1\u2019\1\144\1\162\1\147\1\156\1"+
		"\40\2\145\1\163\1\157\1\143\1\40\1\u2019\1\40\1\162\1\0\1\40\1\0\1\u2019"+
		"\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\157\1\162\1\40"+
		"\1\u2019\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163\1"+
		"\145\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162\1\163\1\107\1"+
		"\40\1\144\1\156\1\163\1\156\1\157\1\u2019\2\157\1\156\1\162\1\156\1\uffff"+
		"\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156\1\u2019\1\165"+
		"\2\71\32\u2019\1\143\1\0\1\141\1\uffff\1\145\1\166\2\151\1\154\2\122\1"+
		"\u2019\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\151\2\162"+
		"\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\171"+
		"\1\131\1\141\1\101\1\u2019\1\156\1\151\1\116\1\131\1\141\1\144\1\164\1"+
		"\151\1\107\1\162\1\104\1\172\1\151\1\171\1\40\2\71\1\uffff\1\71\2\u2019"+
		"\1\164\1\162\1\40\1\165\1\127\1\40\1\141\1\40\1\164\1\144\1\122\1\156"+
		"\1\145\1\40\1\156\1\141\1\154\1\151\1\144\1\u2019\1\0\1\40\1\157\1\164"+
		"\2\40\1\162\1\40\1\165\1\153\1\0\1\163\1\0\1\171\1\163\1\u2019\1\164\1"+
		"\156\1\162\1\141\1\165\3\40\1\0\1\157\1\156\1\141\1\156\1\40\1\143\1\u2019"+
		"\1\156\1\40\1\141\1\40\1\156\1\145\1\u2019\1\145\1\40\1\151\1\40\1\145"+
		"\1\144\1\162\1\153\1\0\1\162\1\40\1\144\1\147\1\u2019\1\156\1\163\1\145"+
		"\1\40\1\u2019\1\151\1\0\1\145\37\u2019\1\56\1\156\1\40\1\145\1\141\1\154"+
		"\2\40\1\71\1\0\1\u2019\1\171\1\162\1\150\1\155\1\u2019\1\144\1\156\1\163"+
		"\2\40\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1\171\1\131\1\0\1\163"+
		"\1\154\2\40\1\156\1\141\1\u2019\1\162\1\40\1\157\1\101\1\143\1\162\1\u2019"+
		"\1\uffff\1\u2019\1\73\1\71\2\0\2\145\1\uffff\2\156\1\141\1\154\1\124\1"+
		"\163\2\40\1\156\1\154\1\141\1\u2019\1\0\1\156\1\157\1\u2019\1\156\2\40"+
		"\1\u2019\1\40\1\0\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1\150\2\164"+
		"\1\144\1\u2019\1\0\1\u2019\1\143\1\40\3\u2019\2\40\1\145\1\0\1\u2019\1"+
		"\145\1\40\1\0\1\141\1\163\37\u2019\2\40\1\162\1\156\1\145\1\u2019\1\0"+
		"\1\54\1\153\2\40\1\0\2\40\1\u2019\1\163\1\40\1\153\1\40\1\113\3\54\1\u2019"+
		"\1\151\1\145\1\171\1\0\1\145\1\165\1\131\1\165\1\145\1\uffff\1\55\1\162"+
		"\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40\1\145\1\156\1\u2019\1\156"+
		"\1\144\1\0\1\146\1\145\1\u2019\1\164\2\u2019\1\145\1\u2019\1\145\1\u2019"+
		"\1\0\1\40\1\156\3\0\1\162\1\0\1\u2019\1\156\1\145\26\u2019\1\51\5\u2019"+
		"\1\163\1\141\1\154\1\u2019\1\151\1\0\3\u2019\1\163\1\40\1\162\1\145\1"+
		"\0\1\150\1\145\1\105\1\164\1\162\1\54\1\144\1\147\1\54\1\151\1\40\1\71"+
		"\1\40\1\u2019\1\40\1\156\1\116\1\150\1\162\1\40\1\0\1\40\1\u2019\1\146"+
		"\1\40\1\0\1\145\2\0\1\162\1\144\1\0\2\u2019\1\0\1\u2019\1\40\32\u2019"+
		"\1\143\1\162\1\141\6\u2019\1\151\1\163\1\123\1\171\1\u2019\1\40\1\150"+
		"\1\156\1\71\1\0\1\144\1\107\1\145\1\40\1\0\1\u2019\1\144\2\40\3\0\27\u2019"+
		"\1\157\1\164\1\143\3\u2019\3\0\1\162\1\u2019\1\40\1\u2019\1\0\1\u2019"+
		"\1\164\1\71\1\u2019\1\40\1\162\1\0\1\40\22\u2019\1\142\1\151\1\153\2\u2019"+
		"\1\145\1\154\1\71\1\0\23\u2019\1\55\3\u2019\1\40\1\151\1\u2019\1\0\20"+
		"\u2019\1\0\1\103\1\0\15\u2019\1\0\3\u2019\1\157\1\u2019\1\0\12\u2019\1"+
		"\154\12\u2019\1\157\11\u2019\1\162\14\u2019\1\0\16\u2019";
	static final String DFA68_acceptS =
		"\33\uffff\1\15\2\uffff\2\26\1\30\11\uffff\1\26\76\uffff\1\2\74\uffff\1"+
		"\23\1\uffff\1\15\3\uffff\1\25\1\22\7\uffff\1\14\176\uffff\1\10\34\uffff"+
		"\1\6\u00ab\uffff\1\5\50\uffff\1\4\31\uffff\1\11\2\uffff\1\20\4\uffff\1"+
		"\24\u0097\uffff\1\16\101\uffff\1\1\75\uffff\1\3\34\uffff\1\12\53\uffff"+
		"\1\7\65\uffff\1\17\u00a5\uffff\1\27\7\uffff\1\21\165\uffff\1\13\u0172"+
		"\uffff";
	static final String DFA68_specialS =
		"\1\167\16\uffff\1\136\23\uffff\1\50\1\u008a\1\110\1\157\45\uffff\1\112"+
		"\1\163\146\uffff\1\105\1\uffff\1\156\4\uffff\1\u0089\60\uffff\1\24\1\uffff"+
		"\1\113\13\uffff\1\115\54\uffff\1\76\3\uffff\1\u00e6\120\uffff\1\160\1"+
		"\111\5\uffff\1\u0085\50\uffff\1\u009b\3\uffff\1\71\6\uffff\1\142\11\uffff"+
		"\1\114\15\uffff\1\164\47\uffff\1\u00a7\1\162\2\uffff\1\23\26\uffff\1\u009c"+
		"\2\uffff\1\u00d8\1\u00da\15\uffff\1\u0084\16\uffff\1\6\2\uffff\1\102\45"+
		"\uffff\1\u0099\21\uffff\1\u0095\6\uffff\1\3\1\uffff\1\2\3\uffff\1\25\2"+
		"\uffff\1\66\3\uffff\1\130\14\uffff\1\u00e4\5\uffff\1\117\6\uffff\1\161"+
		"\2\uffff\1\150\11\uffff\1\172\3\uffff\1\155\6\uffff\1\u0090\7\uffff\1"+
		"\51\1\uffff\1\67\5\uffff\1\u00a6\21\uffff\1\100\1\u00a5\13\uffff\1\u00ea"+
		"\10\uffff\1\u009d\1\uffff\1\u00d9\31\uffff\1\u00e3\43\uffff\1\32\1\uffff"+
		"\1\u00a8\7\uffff\1\42\1\u00eb\4\uffff\1\61\2\uffff\1\106\2\uffff\1\170"+
		"\1\5\1\73\1\uffff\1\u00a9\1\77\1\u00aa\1\1\4\uffff\1\70\7\uffff\1\143"+
		"\1\21\3\uffff\1\134\1\uffff\1\107\7\uffff\1\165\2\uffff\1\u00db\1\175"+
		"\1\u0082\6\uffff\1\147\5\uffff\1\u008c\7\uffff\1\u0087\2\uffff\1\u008e"+
		"\1\uffff\1\u00ab\1\uffff\1\u00e1\1\uffff\1\74\36\uffff\1\u00ac\11\uffff"+
		"\1\131\14\uffff\1\15\16\uffff\1\177\23\uffff\1\47\1\44\5\uffff\1\u0098"+
		"\1\uffff\1\u0086\5\uffff\1\45\5\uffff\1\u00ec\1\u00ad\1\56\2\uffff\1\173"+
		"\1\57\1\uffff\1\52\2\uffff\1\u00ae\1\u0081\1\u00af\2\uffff\1\7\5\uffff"+
		"\1\u0096\1\124\1\141\1\u00b0\4\uffff\1\u0092\3\uffff\1\u00dc\1\uffff\1"+
		"\171\2\uffff\1\30\3\uffff\1\145\4\uffff\1\u00b1\1\uffff\1\153\2\uffff"+
		"\1\43\3\uffff\1\u008d\1\72\1\uffff\1\u00b2\42\uffff\1\u00e7\3\uffff\1"+
		"\u00e9\2\uffff\1\u00b3\1\133\4\uffff\1\126\3\uffff\1\u00df\1\u00dd\2\uffff"+
		"\1\13\4\uffff\1\176\1\12\5\uffff\1\u00b4\1\u0083\5\uffff\1\174\13\uffff"+
		"\1\u00b5\1\u00b6\11\uffff\1\33\1\104\4\uffff\1\u00b7\4\uffff\1\53\1\101"+
		"\1\11\1\64\1\u00b8\1\uffff\1\65\1\127\5\uffff\1\132\5\uffff\1\u00b9\1"+
		"\27\1\uffff\1\154\1\u0091\1\36\1\41\1\151\1\u008f\1\uffff\1\u00ba\1\62"+
		"\1\uffff\1\u008b\1\u00bb\35\uffff\1\26\3\uffff\1\20\1\u00e5\4\uffff\1"+
		"\u00bc\2\uffff\1\103\1\u009a\1\u00bd\1\u009e\1\120\1\122\1\uffff\1\16"+
		"\12\uffff\1\u00be\10\uffff\1\34\1\uffff\1\u0094\4\uffff\1\35\2\uffff\1"+
		"\u00e2\2\uffff\1\u00bf\2\uffff\1\14\1\uffff\1\22\1\17\3\uffff\1\31\1\u00c0"+
		"\1\146\1\uffff\1\u00c1\1\u00c2\1\u00c3\1\uffff\1\u00c4\1\63\43\uffff\1"+
		"\u00c5\4\uffff\1\u00e8\2\uffff\1\u00c6\12\uffff\1\4\1\uffff\1\u0093\1"+
		"\60\1\u0097\4\uffff\1\123\1\u00c7\1\55\1\0\1\uffff\1\125\1\u00c8\1\uffff"+
		"\1\u00c9\1\u00ca\2\uffff\1\u00cb\1\40\1\46\1\u00cc\1\75\1\152\40\uffff"+
		"\1\140\1\144\1\135\4\uffff\1\u0080\1\u0088\3\uffff\1\u00cd\3\uffff\1\37"+
		"\1\u00ce\1\10\1\uffff\1\121\1\116\1\u00cf\1\u00d0\1\u00d1\35\uffff\1\u00d2"+
		"\1\u00d3\1\u00d4\4\uffff\1\u00d5\3\uffff\1\54\2\uffff\1\u00d6\1\137\32"+
		"\uffff\1\u00d7\1\u00de\26\uffff\1\u00e0\2\uffff\1\u00a4\20\uffff\1\u00a3"+
		"\1\uffff\1\u00a2\2\uffff\1\166\12\uffff\1\u00a1\5\uffff\1\u00a0\54\uffff"+
		"\1\u009f\16\uffff}>";
	static final String[] DFA68_transitionS = {
			"\11\40\2\33\2\40\1\33\22\40\1\33\5\40\2\37\1\34\3\40\2\37\1\35\1\40\12"+
			"\32\2\37\5\40\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\1\1\3\1\2\1\20\1\36\1\21\1\22\1\23\1\30\1\24\1\25\1\26\1\27\1\36\4"+
			"\40\1\37\1\40\10\37\1\31\21\37\u1f9e\40\1\37\udfe6\40",
			"\1\47\5\uffff\1\51\2\uffff\1\43\1\45\15\uffff\1\41\7\uffff\1\42\5\uffff"+
			"\1\50\2\uffff\1\44\1\46",
			"\1\54\3\uffff\1\53\3\uffff\1\55",
			"\1\60\25\uffff\1\57\11\uffff\1\56",
			"\1\71\1\uffff\1\61\2\uffff\1\62\1\uffff\1\63\1\64\1\65\1\66\1\uffff"+
			"\1\67\4\uffff\1\70",
			"\1\101\33\uffff\1\72\3\uffff\1\73\3\uffff\1\74\2\uffff\1\75\2\uffff"+
			"\1\76\2\uffff\1\77\2\uffff\1\100",
			"\1\111\21\uffff\1\102\3\uffff\1\103\2\uffff\1\104\1\105\2\uffff\1\106"+
			"\2\uffff\1\107\5\uffff\1\110",
			"\1\114\16\uffff\1\112\15\uffff\1\113\2\uffff\1\115",
			"\1\116\11\uffff\1\117",
			"\1\124\26\uffff\1\120\2\uffff\1\121\2\uffff\1\122\2\uffff\1\123",
			"\1\132\22\uffff\1\125\3\uffff\1\126\2\uffff\1\127\2\uffff\1\130\2\uffff"+
			"\1\131",
			"\1\134\11\uffff\1\135\21\uffff\1\133",
			"\1\136\1\137\16\uffff\1\140\1\uffff\1\141",
			"\1\142",
			"\1\143\11\uffff\1\144\5\uffff\1\145",
			"\1\153\13\uffff\1\146\3\uffff\1\147\2\uffff\1\150\6\uffff\1\152\u0086"+
			"\uffff\1\151",
			"\1\154\3\uffff\1\155\2\uffff\1\156\3\uffff\1\157\2\uffff\1\160\2\uffff"+
			"\1\163\2\uffff\1\161\3\uffff\1\162",
			"\12\173\13\uffff\1\171\3\uffff\1\172\27\uffff\1\164\3\uffff\1\165\2"+
			"\uffff\1\166\6\uffff\1\167\5\uffff\1\170",
			"\1\u008a\16\uffff\1\u0087\4\uffff\1\u0089\1\uffff\1\u0088\11\uffff\1"+
			"\174\1\uffff\1\175\1\uffff\1\176\2\uffff\1\177\1\u0080\1\uffff\1\u0081"+
			"\3\uffff\1\u0082\1\u0083\3\uffff\1\u0084\1\u0085\1\uffff\1\u0086",
			"\1\u008f\2\uffff\1\u0093\6\uffff\1\u008e\5\uffff\1\u0091\22\uffff\1"+
			"\u0092\1\u008b\5\uffff\1\u008c\2\uffff\1\u008d\2\uffff\1\u0090",
			"\1\u0097\3\uffff\1\u0096\37\uffff\1\u0095\3\uffff\1\u0094",
			"\1\u009d\11\uffff\1\u009b\21\uffff\1\u009c\3\uffff\1\u0098\2\uffff\1"+
			"\u0099\1\u009a",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a1\5\uffff\1\u00a0",
			"\1\u00a2",
			"\3\52\3\uffff\1\52\1\u00a3\1\52\1\uffff\12\u00a4\1\u00a7\1\u00a5\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"",
			"\2\u00ac\2\uffff\1\u00ac\22\uffff\1\u00ac\5\uffff\2\u00aa\4\uffff\2"+
			"\u00aa\2\uffff\12\u00a9\2\u00aa\5\uffff\32\u00ab\4\uffff\1\u00aa\1\uffff"+
			"\32\u00aa\u1f9e\uffff\1\u00aa",
			"\3\52\3\uffff\2\52\1\u00ae\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"",
			"",
			"",
			"\1\u00b0\1\uffff\1\u00b1\4\uffff\1\u00af",
			"\1\u00b2\4\uffff\1\u00b3",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5\62\uffff\1\u00b4",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5\122\uffff\1\u00b6",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00be\3\uffff\1\u00bd",
			"\1\u00bf\25\uffff\1\u00c0",
			"\1\u00c1",
			"\1\u00c2\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd\2\uffff\1\u00ce\2\uffff\1\u00d1\4\uffff\1\u00cf\5\uffff\1\u00d0",
			"\1\u00d2",
			"\1\u00d3\15\uffff\1\u00d4\5\uffff\1\u00d5",
			"\1\u00d6\1\u00d7\1\uffff\1\u00d8\2\uffff\1\u00d9\1\u00da",
			"\1\u00db\7\uffff\1\u00dc\5\uffff\1\u00de\5\uffff\1\u00dd",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1\4\uffff\1\u00e2\3\uffff\1\u00e3\3\uffff\1\u00e4",
			"\1\u00e5",
			"\1\u00e6\3\uffff\1\u00e7\5\uffff\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb\10\uffff\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef\10\uffff\1\u00f0\1\uffff\1\u00f1",
			"\1\u00f2\4\uffff\1\u00f3",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"\1\u00f4\14\uffff\1\u00f5",
			"\1\u00f6",
			"\1\u00f7\10\uffff\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb\3\uffff\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101\5\uffff\1\u0102",
			"\1\u0104\3\uffff\1\u0103",
			"\1\u0105",
			"\1\u0106\3\uffff\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f\14\uffff\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113\4\uffff\1\u0114\3\uffff\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"",
			"\1\u0118",
			"\1\u0119",
			"\1\u011c\6\uffff\1\u011a\1\uffff\1\u011b",
			"\1\u011d\1\uffff\1\u011e\6\uffff\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122\2\uffff\1\u0123\1\u0124\1\uffff\1\u0125\2\uffff\1\u0126",
			"\1\u0127\4\uffff\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012c\7\uffff\1\u012b",
			"\1\u012d\17\uffff\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\3\52\3\uffff\2\u0135\1\52\1\uffff\12\173\1\52\1\u0136\5\uffff\32\52"+
			"\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0137\2\uffff\1\u0138\1\u0139\6\uffff\1\u013a",
			"\1\u013b\6\uffff\1\u013c",
			"\1\u013d\22\uffff\1\u013e",
			"\1\u013f\3\uffff\1\u0140",
			"\1\u0141\11\uffff\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145\7\uffff\1\u0146",
			"\1\u0147",
			"\1\u0149\4\uffff\1\u0148",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0151\130\uffff\1\u0150",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015b\1\uffff\1\u015a",
			"\1\u015c",
			"\1\u015d",
			"\1\u0161\4\uffff\1\u015e\2\uffff\1\u015f\6\uffff\1\u0160",
			"\1\u0162",
			"\1\u0164\5\uffff\1\u0163",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\12\u016d",
			"\3\52\3\uffff\1\52\1\u00a3\1\52\1\uffff\12\u00a4\1\u00a7\1\u00a5\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\12\u016e",
			"",
			"\12\u016f",
			"",
			"\2\u0171\2\uffff\1\u0171\22\uffff\1\u0171\10\uffff\1\u0172\6\uffff\12"+
			"\u0170",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\1\u0173\4\uffff\2\u00aa\1"+
			"\uffff\1\u0175\2\uffff\2\u00aa\1\u0173\13\uffff\2\u00aa\3\uffff\1\u0173"+
			"\37\uffff\1\u00aa\1\uffff\32\u00aa\u1f9e\uffff\1\u00aa",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\1\u0177\4\uffff\2\u0176\1"+
			"\uffff\1\u0175\2\uffff\2\u0176\1\u0177\13\uffff\2\u0176\3\uffff\1\u0177"+
			"\1\uffff\32\u0176\4\uffff\1\u0176\1\uffff\32\u0176\u1f9e\uffff\1\u0176",
			"",
			"",
			"\3\52\3\uffff\2\52\1\u00ae\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\151",
			"\1\u0181",
			"\1\u0183\7\uffff\1\u0182",
			"\1\u0184\20\uffff\1\u0185",
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
			"\1\u0193\15\uffff\1\u0194",
			"\1\u0195\12\uffff\1\u0196\2\uffff\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a\6\uffff\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1\25\uffff\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8\22\uffff\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af\3\uffff\1\u01b0",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5\5\uffff\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5\113\uffff\1\u01bb",
			"\1\u01bc",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1\5\uffff\1\u01c2",
			"\1\u01c3",
			"\1\u01c4\5\uffff\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\151",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2\27\uffff\1\u01d3",
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
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u01fb",
			"\1\u01fc",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u01fe",
			"\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"",
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
			"\1\u0211\5\uffff\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219\7\uffff\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"",
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
			"\3\52\3\uffff\1\52\1\u0241\1\52\1\uffff\12\u016d\1\52\1\u00a5\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\1\52\1\u0242\1\52\1\uffff\12\u016e\1\52\1\u00a5\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\u0243\2\uffff\1\u0243\22\uffff\1\u0243\17\uffff\12\u016f",
			"\2\u0171\2\uffff\1\u0171\22\uffff\1\u0171\10\uffff\1\u0172\6\uffff\12"+
			"\u0244",
			"\2\u0171\2\uffff\1\u0171\22\uffff\1\u0171\5\uffff\2\u0245\1\uffff\1"+
			"\u00ac\2\uffff\2\u0245\2\uffff\12\u0246\2\u0245\5\uffff\32\u0247\4\uffff"+
			"\1\u0245\1\uffff\32\u0245\u1f9e\uffff\1\u0245",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\10\uffff\1\u0175",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\5\uffff\2\u0245\4\uffff\2"+
			"\u0245\2\uffff\12\u0246\2\u0245\5\uffff\32\u0247\4\uffff\1\u0245\1\uffff"+
			"\32\u0245\u1f9e\uffff\1\u0245",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\1\u0177\4\uffff\2\u0176\1"+
			"\uffff\1\u0175\2\uffff\2\u0176\1\u0177\13\uffff\2\u0176\3\uffff\1\u0177"+
			"\1\uffff\32\u0176\4\uffff\1\u0176\1\uffff\32\u0176\u1f9e\uffff\1\u0176",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\10\uffff\1\u0175",
			"\1\u0249\3\uffff\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"\2\u00b5\2\uffff\1\u00b5\22\uffff\1\u00b5",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0251",
			"\1\u0252",
			"\1\151",
			"\1\u0253",
			"\1\u0254\3\uffff\1\u0255",
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
			"\1\u0273",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\151\103\uffff\1\u027c\10\uffff\1\u027d",
			"\1\u0226",
			"\1\u027e",
			"\1\u027f",
			"\1\151",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\151",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\151",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\1\u0293\17\uffff\1\u0292",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\1\151",
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
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\22\52\1\u02b9\7\52\u1f9e\uffff\1\52",
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
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\4\uffff\2\52\2\uffff\1\52\1\u02c5\12\52\5\uffff\1\u02c6\1\u02c7"+
			"\1\u02c8\1\52\1\u02c9\1\u02ca\1\u02cb\1\52\1\u02cc\1\52\1\u02cd\1\u02ce"+
			"\1\u02cf\1\u02d0\3\52\1\u02d1\1\u02d2\1\u02d3\2\52\1\u02d4\3\52\4\uffff"+
			"\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u02d5",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\12\52\1\u02d6\7\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u02d8",
			"",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\1\u02df",
			"\2\u02e0\2\uffff\1\u02e0\22\uffff\1\u02e0",
			"\12\u02e1",
			"\12\u02e2",
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
			"\1\151",
			"\1\u02ed",
			"\1\u02ee",
			"\1\151",
			"\1\151",
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
			"\1\u02fa",
			"\1\u02fb",
			"\1\151\17\uffff\1\u0226",
			"\1\u02fc",
			"",
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
			"\1\151",
			"\1\u0309",
			"\1\u030a",
			"\1\151\107\uffff\1\u030b",
			"\1\u01fd",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"",
			"\12\u0314",
			"\12\u0315",
			"",
			"\2\u0171\2\uffff\1\u0171\22\uffff\1\u0171\10\uffff\1\u0316\6\uffff\12"+
			"\u0317",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\1\u0318\4\uffff\2\u0245\1"+
			"\uffff\1\u0175\2\uffff\2\u0245\1\u0318\13\uffff\2\u0245\3\uffff\1\u0318"+
			"\37\uffff\1\u0245\1\uffff\32\u0245\u1f9e\uffff\1\u0245",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\10\uffff\1\u0175\6\uffff\12"+
			"\u0246",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\1\u031a\4\uffff\2\u0319\1"+
			"\uffff\1\u0175\2\uffff\2\u0319\1\u031a\13\uffff\2\u0319\3\uffff\1\u031a"+
			"\1\uffff\32\u0319\4\uffff\1\u0319\1\uffff\32\u0319\u1f9e\uffff\1\u0319",
			"",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\3\u01fd\1\uffff\1\u01fd\1\uffff\1\u01fd\1\uffff\2\u0322\3\uffff\3\u01fd"+
			"\2\uffff\1\u0322\1\uffff\3\u01fd",
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
			"\1\u032d",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
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
			"\1\151",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0347",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0349",
			"\1\u034a",
			"\1\u034b",
			"\1\151",
			"\1\u034c",
			"\1\u034d",
			"\1\151",
			"\1\u034e",
			"\1\u034f",
			"\1\u0350",
			"\1\151",
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
			"\1\u035b",
			"\1\u035c",
			"\1\151\122\uffff\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0361",
			"\1\u0362",
			"\1\151",
			"\1\u0363",
			"\1\u0364",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\151",
			"\1\u0369",
			"\1\u036a",
			"\1\151\104\uffff\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"\1\u02e0",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\u0226",
			"\1\u0371",
			"\1\u0372",
			"\1\151",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\1\151",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\151",
			"\1\u037c",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u037e",
			"\1\u037f",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0380",
			"\1\u0381",
			"\1\151\122\uffff\1\u0382",
			"\1\u0383",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\1\u0389",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\1\52\10\uffff\1\52\6\uffff\3\52\1\u038a"+
			"\1\52\1\u038b\4\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u038c\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u038e\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\16\52\1\u038d\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u038f\3\52\1\u0390\2\52\1\u0391\5\52\1\u0392\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0393\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0394\2\52\1\u0395\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0396\11\52\1\u0397\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0398\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0399\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u039a"+
			"\15\52\1\u039b\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u039c\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u039d\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u039e\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u039f\6\52\1\u03a0\1\u03a1\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u03a2\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u03a3\2\52\1\u03a4\1\u03a5\21\52\u1f9e\uffff\1\52",
			"\1\u03a6",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"",
			"\3\52\3\uffff\2\u0135\1\52\1\uffff\12\u02e1\1\52\1\u0136\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\2\u03b0\1\52\1\uffff\12\u02e2\1\52\1\u0136\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\151",
			"\1\u03b9",
			"\1\151",
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
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\1\u03d0",
			"\1\u03d1",
			"\1\u03d2",
			"\1\151",
			"\1\u03d3",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u03d6",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\1\u03dc",
			"\1\u0134",
			"\1\u03dd\2\uffff\12\u0314",
			"\3\52\3\uffff\1\52\1\u03de\1\52\1\uffff\12\u0315\1\52\1\u00a5\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\3\52\1\uffff\12\u03e0\2\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\u0171\2\uffff\1\u0171\22\uffff\1\u0171\10\uffff\1\u0172\6\uffff\12"+
			"\u0317",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\10\uffff\1\u0175",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\1\u031a\4\uffff\2\u0319\1"+
			"\uffff\1\u0175\2\uffff\2\u0319\1\u031a\13\uffff\2\u0319\3\uffff\1\u031a"+
			"\1\uffff\32\u0319\4\uffff\1\u0319\1\uffff\32\u0319\u1f9e\uffff\1\u0319",
			"\2\u0174\2\uffff\1\u0174\22\uffff\1\u0174\10\uffff\1\u0175",
			"\1\u0322",
			"\1\u03e1",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\1\u03e5",
			"\1\u03e5",
			"",
			"\1\u03e6",
			"\1\u03e7\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u03e8",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"\1\u03ec",
			"\1\u03ed",
			"\1\u03ee",
			"\1\151",
			"\1\u03ef",
			"\1\uffff",
			"\1\u03f0",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"\1\u03f4",
			"\1\u03f5",
			"\1\u03f6",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u03f8",
			"\1\u03f9",
			"\1\u03fa",
			"\1\u03fb",
			"\1\151",
			"\1\u03fc",
			"\1\u03fd",
			"\1\151\122\uffff\1\u03fe",
			"\1\u03ff",
			"\1\u0400",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u0402",
			"\1\uffff",
			"\1\151",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0404",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\1\151",
			"\1\u0408",
			"\1\u0409",
			"\1\u040a",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"\1\u040e",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0410",
			"\1\u0411",
			"\1\u0412",
			"\1\151",
			"\1\u0413",
			"\1\151",
			"\1\u0414",
			"\1\u0415",
			"",
			"\1\u0416",
			"\1\u0417",
			"\1\u0418",
			"\1\u0419",
			"\1\151",
			"\1\u03e5",
			"\1\u03e5",
			"\1\151",
			"\1\151",
			"\1\151",
			"\1\u041a",
			"\1\u041b",
			"\1\u041c",
			"\1\u041d",
			"\1\u041e",
			"\1\u041f",
			"\1\151",
			"\1\u0420",
			"\1\u0421",
			"\1\u0422",
			"\1\u0423",
			"\1\u0424",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\16\52\1\u0425\3\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0427",
			"\1\u0428",
			"\1\u0429",
			"\1\u042a",
			"\1\u042b",
			"",
			"\1\u042c",
			"\1\151",
			"\1\u042d",
			"\1\u042e",
			"\1\151",
			"\1\u042f",
			"\1\uffff",
			"\1\u0430",
			"\1\151",
			"\1\u0431",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0433",
			"\2\52\2\uffff\1\52\22\uffff\1\u0434\10\uffff\1\52\6\uffff\12\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0435\10\uffff\1\52\6\uffff\12\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0436\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u0437\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\1\u0438\1\52\4\uffff\2\52\2"+
			"\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0439\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u043a\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u043b\10\52\1\u043c\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u043d\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u043e\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u043f\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0440"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0441\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u0442\5\52\1\u0443\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0444\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u0445\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\52"+
			"\1\u0446\30\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0447\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0448\4\52\1\u0449\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\25"+
			"\52\1\u044a\4\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u044b\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u044c\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u044d"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u044e\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u044f\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u0450\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0451\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0452\10\52\u1f9e\uffff\1\52",
			"\1\u0453",
			"\1\uffff",
			"\1\u0454",
			"",
			"\1\u0455",
			"\1\u0456",
			"\1\u0457",
			"\1\u0458",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u045d",
			"\1\u045e",
			"\1\u045f",
			"\1\u0460",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463",
			"\1\u0464",
			"\1\u0465",
			"\1\u0466\3\uffff\1\u0467",
			"\1\u0468",
			"\1\u0469",
			"\1\151",
			"\1\u03e5",
			"\1\u046a",
			"\1\u046b",
			"\1\u046c",
			"\1\u046d",
			"\1\u03e5",
			"\1\u046e",
			"\1\u046f",
			"\1\u0470",
			"\1\u0471",
			"\1\u0472",
			"\1\u0473",
			"\1\u0474",
			"\1\u0475",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0477",
			"\1\u0478",
			"\1\u0479",
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
			"\12\u0486",
			"\12\u0487",
			"",
			"\12\u0488",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u048b",
			"\1\u048c",
			"\2\u048d\2\uffff\1\u048d\22\uffff\1\u048d",
			"\1\u048e",
			"\3\u01fd\1\uffff\1\u01fd\1\uffff\1\u01fd\1\uffff\2\u0322\3\uffff\3\u01fd"+
			"\2\uffff\1\u0322\1\uffff\3\u01fd",
			"\1\151",
			"\1\u048f",
			"\1\151",
			"\1\u0490",
			"\1\u0491",
			"\1\u0492",
			"\1\u0493",
			"\1\u0494",
			"\1\151",
			"\1\u0495",
			"\1\u0496",
			"\1\u0497",
			"\1\u0498",
			"\1\u0499",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\151",
			"\1\u049b",
			"\1\u049c",
			"\1\151",
			"\1\151",
			"\1\u049d",
			"\1\151",
			"\1\u049e",
			"\1\u049f",
			"\1\uffff",
			"\1\151\122\uffff\1\u04a0",
			"\1\uffff",
			"\1\u04a1",
			"\1\u04a2",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u04a4",
			"\1\u04a5",
			"\1\u04a6",
			"\1\u04a7",
			"\1\u04a8",
			"\1\151",
			"\1\151",
			"\1\151",
			"\1\uffff",
			"\1\u04a9",
			"\1\u04aa",
			"\1\u04ab",
			"\1\u04ac",
			"\1\151",
			"\1\u04ad",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u04ae",
			"\1\151",
			"\1\u04af",
			"\1\151",
			"\1\u04b0",
			"\1\u04b1",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u04b3",
			"\1\u0226",
			"\1\u04b4",
			"\1\151",
			"\1\u04b5",
			"\1\u04b6",
			"\1\u04b7",
			"\1\u04b8",
			"\1\uffff",
			"\1\u04b9",
			"\1\151",
			"\1\u04ba",
			"\1\u04bb",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u04bd",
			"\1\u04be",
			"\1\u04bf",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u04c1",
			"\1\uffff",
			"\1\u04c2",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\10\52\1\u04c3\21\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\10\52\1\u04c4\21\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u04c5\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u04c6\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u04c7\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\37\uffff\1\52\1\uffff\32\52\u1f9e"+
			"\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04c8\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u04c9\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u04ca\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u04cb\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04cc\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04cd\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04ce\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u04cf\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u04d0\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u04d1\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u04d2\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04d3\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u04d4\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u04d5\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u04d6\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u04d7\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u04d8\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u04d9"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u04da\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u04db\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u04dc\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04dd\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04df\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u04e0\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u04e1\25\52\u1f9e\uffff\1\52",
			"\1\u04e2",
			"\1\u04e3",
			"\1\151",
			"\1\u04e4",
			"\1\u04e5",
			"\1\u04e6",
			"\1\151",
			"\1\u0226",
			"\12\u04e7",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u04e9",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u04ee",
			"\1\u04ef",
			"\1\u04f0",
			"\1\151",
			"\1\151",
			"\1\u04f1",
			"\1\u04f2",
			"\1\151",
			"\1\u04f3",
			"\1\u04f4",
			"\1\u04f5",
			"\1\u04f6",
			"\1\151",
			"\1\151",
			"\1\u0226",
			"\1\u03e5",
			"\1\u03e5",
			"\1\u04f7",
			"\1\u04f8",
			"\1\uffff",
			"\1\151\122\uffff\1\u04f9",
			"\1\u04fa",
			"\1\u0226",
			"\1\u037d",
			"\1\u04fb",
			"\1\u04fc",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u04fe",
			"\1\u0226",
			"\1\u04ff",
			"\1\u0500",
			"\1\u0501",
			"\1\u0502",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"",
			"\3\52\3\uffff\3\52\1\uffff\12\u0486\2\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\12\u0487\1\uffff\1\u00a5",
			"\12\u0504",
			"\1\uffff",
			"\1\uffff",
			"\1\u0505",
			"\1\u0506",
			"",
			"\1\u0507",
			"\1\u0508",
			"\1\u0509",
			"\1\u050a",
			"\1\u050b",
			"\1\u050c",
			"\1\151",
			"\1\151",
			"\1\u050d",
			"\1\u050e",
			"\1\u050f",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u0510",
			"\1\u0511",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0512",
			"\1\151",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\uffff",
			"\1\u0514",
			"\1\151",
			"\1\151",
			"\1\u0515",
			"\1\u0516",
			"\1\u0517",
			"\1\u0518",
			"\1\u0519",
			"\1\151",
			"\1\u051a",
			"\1\u051b",
			"\1\u051c",
			"\1\u051d",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u051f",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\4\52\1\u0520\15\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\151",
			"\1\u0524",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0526",
			"\1\151",
			"\1\uffff",
			"\1\u0527",
			"\1\u0528",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0529\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u052a\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u052b\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u052c\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\17\52\1\u052d\12\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u052e"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\52"+
			"\1\u052f\30\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0530\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0531\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u0532\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0533\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0534\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\1"+
			"\52\1\u0535\1\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0536"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0537\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0538\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0539\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\1\u053a\1\52\4\uffff\2\52\2"+
			"\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u053b"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u053c\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\7\52\1\u053d\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u053e"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\2"+
			"\52\1\u053f\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0540\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0541\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0542\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0543\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0544\25\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\5\uffff\2\52\1\u0548\3\uffff\3\52"+
			"\1\uffff\14\52\5\uffff\1\u0545\1\u0547\12\52\1\u0549\2\52\1\u0546\12"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u054b\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u054c\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7"+
			"\52\1\u054d\22\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\151",
			"\1\u054e",
			"\1\u054f",
			"\1\u0550",
			"\3\52\3\uffff\2\u03b0\1\52\1\uffff\12\u04e7\1\52\1\u0136\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u03e5",
			"\1\u0551",
			"\1\151",
			"\1\151",
			"\1\uffff",
			"\1\151",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0553",
			"\1\151",
			"\1\u0554",
			"\1\u0226",
			"\1\u0555",
			"\1\u03e5",
			"\1\u03e5",
			"\1\u03e5",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0556",
			"\1\u0557",
			"\1\u0558",
			"\1\uffff",
			"\1\u0559",
			"\1\u055a",
			"\1\u055b",
			"\1\u055c",
			"\1\u055d",
			"",
			"\1\u055e",
			"\1\u055f",
			"\1\151",
			"\1\u0560",
			"\1\151",
			"\1\u0561",
			"\1\u0562",
			"\1\u0563",
			"\1\u0564",
			"\1\151",
			"\1\u0565",
			"\1\u0566",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0568",
			"\1\u0569",
			"\1\uffff",
			"\1\u056a",
			"\1\u056b",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u056d",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0570",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0571",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\151",
			"\1\u0573",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0574",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0576",
			"\1\u0577",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u0578\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u0579\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u057a\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u057b\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u057c\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\17"+
			"\52\1\u057d\12\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u057e\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u057f\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0580\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\1"+
			"\52\1\u0581\1\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u0582\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\2\52\1\u0583\27\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0584\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0585\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0586\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0587\1\52\4\uffff\2\52\1\uffff\1\u04de"+
			"\2\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1"+
			"\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0588\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\37\uffff\1\52\1\uffff\32\52\u1f9e"+
			"\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0589\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u058a\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u058b"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u058c\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u058d\10\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\22\52\1\u058e\7\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u058f\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0590"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\27"+
			"\52\1\u0591\2\52\u1f9e\uffff\1\52",
			"\1\u0592",
			"\1\u0593",
			"\1\u0594",
			"\2\52\4\uffff\2\52\2\uffff\14\52\5\uffff\14\52\1\u0595\15\52\4\uffff"+
			"\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u02d5",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\1\u0596\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0597"+
			"\31\52\u1f9e\uffff\1\52",
			"\1\u0598",
			"\1\151",
			"\1\u0599",
			"\1\u059a",
			"\1\uffff",
			"\1\u059b",
			"\1\u059c",
			"\1\u059d",
			"\1\u059e",
			"\1\u059f",
			"\1\u03e5",
			"\1\u05a0",
			"\1\u05a1",
			"\1\u03e5",
			"\1\u05a2",
			"\1\151",
			"\12\u05a3",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u05a5",
			"\1\u05a6",
			"\1\u05a7",
			"\1\u05a8",
			"\1\151",
			"\1\uffff",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u05aa",
			"\1\151",
			"\1\uffff",
			"\1\u05ab",
			"\1\uffff",
			"\1\uffff",
			"\1\u05ac",
			"\1\u05ad",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u05b1\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u05b2\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05b3"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u05b4\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u05b5\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05b6\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u05b7\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\2\52\1\u05b8\27\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u05b9\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05ba\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u05bb\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\21\52\1\u05bc\4\52\1\u05bd\3\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\21\52\1\u05be\10\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05bf\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05c0\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u05c1\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u05c2\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\1\52\1\u05c4\1\52\1\u05c3\26\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u05c5\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u05c6\1\52\4\uffff\2\52\1\uffff\1\u04de"+
			"\2\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1"+
			"\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05c7\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u05c8",
			"\1\u05c9",
			"\1\u05ca",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u05cb\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\22\52\1\u05cc\7\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u05cd\21\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u05d1",
			"\1\u05d2",
			"\1\u05d3",
			"\1\u05d4",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u05d6",
			"\1\u05d7",
			"\12\u05d8",
			"\1\uffff",
			"\1\u05d9",
			"\1\u05da",
			"\1\u05db",
			"\1\151",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u05dd",
			"\1\151",
			"\1\151",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u05de\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05df"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05e0\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u05e1\1\52\4\uffff\2\52\1\uffff\1\u04de"+
			"\2\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1"+
			"\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05e2"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\22\52\1\u05e3\3\52\1\u05e4\3\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u05e5\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05e6"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05e7\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05e8"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05e9\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05ea\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05eb\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u05ec\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05ed\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u05ee\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u05ef\26\52\u1f9e\uffff\1\52",
			"\1\u05f0",
			"\1\u05f1",
			"\1\u05f2",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u0449\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\17"+
			"\52\1\u05f3\12\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05f4\10\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u05f5",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0226",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u05f6",
			"\12\u05f7",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\1\u0226",
			"\1\u05f9",
			"\1\uffff",
			"\1\151",
			"\2\52\2\uffff\1\52\22\uffff\1\u05fa\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u05fb\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05fc"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u05fd\17\52\1\u05fe\7\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u05ff\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0600\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0601\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0602\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0603\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0604\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0605\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0606\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0607\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0608\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0609\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u060a\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u060b",
			"\1\u060c",
			"\1\u060d",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u060e\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u060f\25\52\u1f9e\uffff\1\52",
			"\1\u0610",
			"\1\u0611",
			"\12\u0612",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\26\52\1\u0614\3\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0615\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0616\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0617\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\17"+
			"\52\1\u0618\12\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0619\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u061a\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u061b\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u061c\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u061d\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u061e\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u0620\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u061f\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u0621\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0622\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0623"+
			"\31\52\u1f9e\uffff\1\52",
			"\1\52\4\uffff\2\52\1\u0548\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01fa\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0625",
			"\1\52\4\uffff\2\52\1\u0548\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01fa\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0627\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0628\26\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u0629",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u062a"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u062b\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u062c\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u062d\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u062e\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u062f\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0630\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0631\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\1\u0632\31\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0633\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u0620\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0635\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0636"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0637\6\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u0638",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0639\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f9\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01fa\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f8\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u063b\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\1\52\1\u063c\30\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u063d\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u063e\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u063f\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0640\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0641\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0642\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u0620\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4"+
			"\52\1\u0643\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0644\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u0645",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0646\23\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0647\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0648"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0649\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u064a\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u064b\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u064c"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u064d\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u064e\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\3\52\1\u064f\26\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\1\u0650",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0651\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0652\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u0653\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0654\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0655\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0656"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0657\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0658\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u0620\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u0659\5\52\u1f9e\uffff\1\52",
			"\1\u065a",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u065b\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u065c\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u065d\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u065e\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\26\52\1\u065f\3\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u0660\27\52\u1f9e\uffff\1\52",
			"\1\u0661",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0662\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0663\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0664\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0665\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u0666\17\52\u1f9e\uffff\1\52",
			"\1\52\4\uffff\2\52\1\u0548\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01fa\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0668\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0669\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u066a\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u066b\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u066c\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u066d\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\23\52\1\u066e\6\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u066f\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0670\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u0671\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u0672\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0673\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0674\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0675\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04de\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52"
	};

	static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
	static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
	static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
	static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
	static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
	static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
	static final short[][] DFA68_transition;

	static {
		int numStates = DFA68_transitionS.length;
		DFA68_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
		}
	}

	class DFA68 extends DFA {

		public DFA68(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 68;
			this.eot = DFA68_eot;
			this.eof = DFA68_eof;
			this.min = DFA68_min;
			this.max = DFA68_max;
			this.accept = DFA68_accept;
			this.special = DFA68_special;
			this.transition = DFA68_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | GROUP_ENDING_ANNOUNCEMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA68_1385 = input.LA(1);
						 
						int index68_1385 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1385=='s') ) {s = 504;}
						else if ( ((LA68_1385 >= '\t' && LA68_1385 <= '\n')||LA68_1385=='\r'||LA68_1385==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1385=='(') ) {s = 505;}
						else if ( (LA68_1385=='M') ) {s = 506;}
						else if ( (LA68_1385=='!'||(LA68_1385 >= '&' && LA68_1385 <= '\'')||(LA68_1385 >= ',' && LA68_1385 <= '.')||(LA68_1385 >= '0' && LA68_1385 <= ';')||LA68_1385=='?'||(LA68_1385 >= 'A' && LA68_1385 <= 'L')||(LA68_1385 >= 'N' && LA68_1385 <= 'Z')||LA68_1385=='_'||(LA68_1385 >= 'a' && LA68_1385 <= 'r')||(LA68_1385 >= 't' && LA68_1385 <= 'z')||LA68_1385=='\u2019') ) {s = 42;}
						else s = 1449;
						 
						input.seek(index68_1385);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA68_841 = input.LA(1);
						 
						int index68_841 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_841=='s') ) {s = 504;}
						else if ( ((LA68_841 >= '\t' && LA68_841 <= '\n')||LA68_841=='\r'||LA68_841==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_841=='(') ) {s = 505;}
						else if ( (LA68_841=='M') ) {s = 506;}
						else if ( (LA68_841=='!'||(LA68_841 >= '&' && LA68_841 <= '\'')||(LA68_841 >= ',' && LA68_841 <= '.')||(LA68_841 >= '0' && LA68_841 <= ';')||LA68_841=='?'||(LA68_841 >= 'A' && LA68_841 <= 'L')||(LA68_841 >= 'N' && LA68_841 <= 'Z')||LA68_841=='_'||(LA68_841 >= 'a' && LA68_841 <= 'r')||(LA68_841 >= 't' && LA68_841 <= 'z')||LA68_841=='\u2019') ) {s = 42;}
						else s = 1027;
						 
						input.seek(index68_841);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA68_631 = input.LA(1);
						 
						int index68_631 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_631=='s') ) {s = 504;}
						else if ( ((LA68_631 >= '\t' && LA68_631 <= '\n')||LA68_631=='\r'||LA68_631==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_631=='(') ) {s = 505;}
						else if ( (LA68_631=='M') ) {s = 506;}
						else if ( (LA68_631=='!'||(LA68_631 >= '&' && LA68_631 <= '\'')||(LA68_631 >= ',' && LA68_631 <= '.')||(LA68_631 >= '0' && LA68_631 <= ';')||LA68_631=='?'||(LA68_631 >= 'A' && LA68_631 <= 'L')||(LA68_631 >= 'N' && LA68_631 <= 'Z')||LA68_631=='_'||(LA68_631 >= 'a' && LA68_631 <= 'r')||(LA68_631 >= 't' && LA68_631 <= 'z')||LA68_631=='\u2019') ) {s = 42;}
						else s = 840;
						 
						input.seek(index68_631);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA68_629 = input.LA(1);
						 
						int index68_629 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_629=='s') ) {s = 504;}
						else if ( ((LA68_629 >= '\t' && LA68_629 <= '\n')||LA68_629=='\r'||LA68_629==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_629=='(') ) {s = 505;}
						else if ( (LA68_629=='M') ) {s = 506;}
						else if ( (LA68_629=='!'||(LA68_629 >= '&' && LA68_629 <= '\'')||(LA68_629 >= ',' && LA68_629 <= '.')||(LA68_629 >= '0' && LA68_629 <= ';')||LA68_629=='?'||(LA68_629 >= 'A' && LA68_629 <= 'L')||(LA68_629 >= 'N' && LA68_629 <= 'Z')||LA68_629=='_'||(LA68_629 >= 'a' && LA68_629 <= 'r')||(LA68_629 >= 't' && LA68_629 <= 'z')||LA68_629=='\u2019') ) {s = 42;}
						else s = 838;
						 
						input.seek(index68_629);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA68_1373 = input.LA(1);
						 
						int index68_1373 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1373==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1373);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA68_835 = input.LA(1);
						 
						int index68_835 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_835=='s') ) {s = 504;}
						else if ( ((LA68_835 >= '\t' && LA68_835 <= '\n')||LA68_835=='\r'||LA68_835==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_835=='(') ) {s = 505;}
						else if ( (LA68_835=='M') ) {s = 506;}
						else if ( (LA68_835=='!'||(LA68_835 >= '&' && LA68_835 <= '\'')||(LA68_835 >= ',' && LA68_835 <= '.')||(LA68_835 >= '0' && LA68_835 <= ';')||LA68_835=='?'||(LA68_835 >= 'A' && LA68_835 <= 'L')||(LA68_835 >= 'N' && LA68_835 <= 'Z')||LA68_835=='_'||(LA68_835 >= 'a' && LA68_835 <= 'r')||(LA68_835 >= 't' && LA68_835 <= 'z')||LA68_835=='\u2019') ) {s = 42;}
						else s = 1025;
						 
						input.seek(index68_835);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA68_563 = input.LA(1);
						 
						int index68_563 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_563==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_563);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA68_1030 = input.LA(1);
						 
						int index68_1030 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1030=='s') ) {s = 504;}
						else if ( ((LA68_1030 >= '\t' && LA68_1030 <= '\n')||LA68_1030=='\r'||LA68_1030==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1030=='(') ) {s = 505;}
						else if ( (LA68_1030=='M') ) {s = 506;}
						else if ( (LA68_1030=='!'||(LA68_1030 >= '&' && LA68_1030 <= '\'')||(LA68_1030 >= ',' && LA68_1030 <= '.')||(LA68_1030 >= '0' && LA68_1030 <= ';')||LA68_1030=='?'||(LA68_1030 >= 'A' && LA68_1030 <= 'L')||(LA68_1030 >= 'N' && LA68_1030 <= 'Z')||LA68_1030=='_'||(LA68_1030 >= 'a' && LA68_1030 <= 'r')||(LA68_1030 >= 't' && LA68_1030 <= 'z')||LA68_1030=='\u2019') ) {s = 42;}
						else s = 1187;
						 
						input.seek(index68_1030);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA68_1450 = input.LA(1);
						 
						int index68_1450 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1450=='s') ) {s = 504;}
						else if ( ((LA68_1450 >= '\t' && LA68_1450 <= '\n')||LA68_1450=='\r'||LA68_1450==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1450=='(') ) {s = 505;}
						else if ( (LA68_1450=='M') ) {s = 506;}
						else if ( (LA68_1450=='!'||(LA68_1450 >= '&' && LA68_1450 <= '\'')||(LA68_1450 >= ',' && LA68_1450 <= '.')||(LA68_1450 >= '0' && LA68_1450 <= ';')||LA68_1450=='?'||(LA68_1450 >= 'A' && LA68_1450 <= 'L')||(LA68_1450 >= 'N' && LA68_1450 <= 'Z')||LA68_1450=='_'||(LA68_1450 >= 'a' && LA68_1450 <= 'r')||(LA68_1450 >= 't' && LA68_1450 <= 'z')||LA68_1450=='\u2019') ) {s = 42;}
						else s = 1500;
						 
						input.seek(index68_1450);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA68_1185 = input.LA(1);
						 
						int index68_1185 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1185=='s') ) {s = 504;}
						else if ( ((LA68_1185 >= '\t' && LA68_1185 <= '\n')||LA68_1185=='\r'||LA68_1185==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1185=='(') ) {s = 505;}
						else if ( (LA68_1185=='M') ) {s = 506;}
						else if ( (LA68_1185=='!'||(LA68_1185 >= '&' && LA68_1185 <= '\'')||(LA68_1185 >= ',' && LA68_1185 <= '.')||(LA68_1185 >= '0' && LA68_1185 <= ';')||LA68_1185=='?'||(LA68_1185 >= 'A' && LA68_1185 <= 'L')||(LA68_1185 >= 'N' && LA68_1185 <= 'Z')||LA68_1185=='_'||(LA68_1185 >= 'a' && LA68_1185 <= 'r')||(LA68_1185 >= 't' && LA68_1185 <= 'z')||LA68_1185=='\u2019') ) {s = 42;}
						else s = 1299;
						 
						input.seek(index68_1185);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA68_1136 = input.LA(1);
						 
						int index68_1136 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1136==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1136);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA68_1130 = input.LA(1);
						 
						int index68_1130 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1130==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1130);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA68_1302 = input.LA(1);
						 
						int index68_1302 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1302=='s') ) {s = 504;}
						else if ( ((LA68_1302 >= '\t' && LA68_1302 <= '\n')||LA68_1302=='\r'||LA68_1302==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1302=='(') ) {s = 505;}
						else if ( (LA68_1302=='M') ) {s = 506;}
						else if ( (LA68_1302=='!'||(LA68_1302 >= '&' && LA68_1302 <= '\'')||(LA68_1302 >= ',' && LA68_1302 <= '.')||(LA68_1302 >= '0' && LA68_1302 <= ';')||LA68_1302=='?'||(LA68_1302 >= 'A' && LA68_1302 <= 'L')||(LA68_1302 >= 'N' && LA68_1302 <= 'Z')||LA68_1302=='_'||(LA68_1302 >= 'a' && LA68_1302 <= 'r')||(LA68_1302 >= 't' && LA68_1302 <= 'z')||LA68_1302=='\u2019') ) {s = 42;}
						else s = 1388;
						 
						input.seek(index68_1302);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA68_958 = input.LA(1);
						 
						int index68_958 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_958==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_958);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA68_1266 = input.LA(1);
						 
						int index68_1266 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1266==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1266);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA68_1305 = input.LA(1);
						 
						int index68_1305 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1305=='s') ) {s = 504;}
						else if ( ((LA68_1305 >= '\t' && LA68_1305 <= '\n')||LA68_1305=='\r'||LA68_1305==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1305=='(') ) {s = 505;}
						else if ( (LA68_1305=='M') ) {s = 506;}
						else if ( (LA68_1305=='!'||(LA68_1305 >= '&' && LA68_1305 <= '\'')||(LA68_1305 >= ',' && LA68_1305 <= '.')||(LA68_1305 >= '0' && LA68_1305 <= ';')||LA68_1305=='?'||(LA68_1305 >= 'A' && LA68_1305 <= 'L')||(LA68_1305 >= 'N' && LA68_1305 <= 'Z')||LA68_1305=='_'||(LA68_1305 >= 'a' && LA68_1305 <= 'r')||(LA68_1305 >= 't' && LA68_1305 <= 'z')||LA68_1305=='\u2019') ) {s = 42;}
						else s = 1391;
						 
						input.seek(index68_1305);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA68_1250 = input.LA(1);
						 
						int index68_1250 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1250==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1250);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA68_855 = input.LA(1);
						 
						int index68_855 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_855=='s') ) {s = 504;}
						else if ( ((LA68_855 >= '\t' && LA68_855 <= '\n')||LA68_855=='\r'||LA68_855==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_855=='(') ) {s = 505;}
						else if ( (LA68_855=='M') ) {s = 506;}
						else if ( (LA68_855=='!'||(LA68_855 >= '&' && LA68_855 <= '\'')||(LA68_855 >= ',' && LA68_855 <= '.')||(LA68_855 >= '0' && LA68_855 <= ';')||LA68_855=='?'||(LA68_855 >= 'A' && LA68_855 <= 'L')||(LA68_855 >= 'N' && LA68_855 <= 'Z')||LA68_855=='_'||(LA68_855 >= 'a' && LA68_855 <= 'r')||(LA68_855 >= 't' && LA68_855 <= 'z')||LA68_855=='\u2019') ) {s = 42;}
						else s = 1039;
						 
						input.seek(index68_855);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA68_1304 = input.LA(1);
						 
						int index68_1304 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1304=='s') ) {s = 504;}
						else if ( ((LA68_1304 >= '\t' && LA68_1304 <= '\n')||LA68_1304=='\r'||LA68_1304==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1304=='(') ) {s = 505;}
						else if ( (LA68_1304=='M') ) {s = 506;}
						else if ( (LA68_1304=='!'||(LA68_1304 >= '&' && LA68_1304 <= '\'')||(LA68_1304 >= ',' && LA68_1304 <= '.')||(LA68_1304 >= '0' && LA68_1304 <= ';')||LA68_1304=='?'||(LA68_1304 >= 'A' && LA68_1304 <= 'L')||(LA68_1304 >= 'N' && LA68_1304 <= 'Z')||LA68_1304=='_'||(LA68_1304 >= 'a' && LA68_1304 <= 'r')||(LA68_1304 >= 't' && LA68_1304 <= 'z')||LA68_1304=='\u2019') ) {s = 42;}
						else s = 1390;
						 
						input.seek(index68_1304);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA68_507 = input.LA(1);
						 
						int index68_507 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_507=='k') ) {s = 726;}
						else if ( (LA68_507=='s') ) {s = 504;}
						else if ( ((LA68_507 >= '\t' && LA68_507 <= '\n')||LA68_507=='\r'||LA68_507==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_507=='(') ) {s = 505;}
						else if ( (LA68_507=='M') ) {s = 506;}
						else if ( (LA68_507=='!'||(LA68_507 >= '&' && LA68_507 <= '\'')||(LA68_507 >= ',' && LA68_507 <= '.')||(LA68_507 >= '0' && LA68_507 <= ';')||LA68_507=='?'||(LA68_507 >= 'A' && LA68_507 <= 'L')||(LA68_507 >= 'N' && LA68_507 <= 'Z')||LA68_507=='_'||(LA68_507 >= 'a' && LA68_507 <= 'j')||(LA68_507 >= 'l' && LA68_507 <= 'r')||(LA68_507 >= 't' && LA68_507 <= 'z')||LA68_507=='\u2019') ) {s = 42;}
						else s = 727;
						 
						input.seek(index68_507);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA68_236 = input.LA(1);
						 
						int index68_236 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_236=='l') ) {s = 443;}
						else if ( ((LA68_236 >= '\t' && LA68_236 <= '\n')||LA68_236=='\r'||LA68_236==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_236);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA68_635 = input.LA(1);
						 
						int index68_635 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_635==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_635);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA68_1246 = input.LA(1);
						 
						int index68_1246 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_1246 >= '\t' && LA68_1246 <= '\n')||LA68_1246=='\r'||LA68_1246==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1246=='A') ) {s = 1349;}
						else if ( (LA68_1246=='P') ) {s = 1350;}
						else if ( (LA68_1246=='B') ) {s = 1351;}
						else if ( (LA68_1246=='(') ) {s = 1352;}
						else if ( (LA68_1246=='M') ) {s = 1353;}
						else if ( ((LA68_1246 >= '&' && LA68_1246 <= '\'')||(LA68_1246 >= ',' && LA68_1246 <= '.')||(LA68_1246 >= '0' && LA68_1246 <= ';')||(LA68_1246 >= 'C' && LA68_1246 <= 'L')||(LA68_1246 >= 'N' && LA68_1246 <= 'O')||(LA68_1246 >= 'Q' && LA68_1246 <= 'Z')||LA68_1246=='_'||(LA68_1246 >= 'a' && LA68_1246 <= 'z')||LA68_1246=='\u2019') ) {s = 42;}
						else s = 1354;
						 
						input.seek(index68_1246);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA68_1203 = input.LA(1);
						 
						int index68_1203 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1203=='s') ) {s = 504;}
						else if ( ((LA68_1203 >= '\t' && LA68_1203 <= '\n')||LA68_1203=='\r'||LA68_1203==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1203=='(') ) {s = 505;}
						else if ( (LA68_1203=='M') ) {s = 506;}
						else if ( (LA68_1203=='!'||(LA68_1203 >= '&' && LA68_1203 <= '\'')||(LA68_1203 >= ',' && LA68_1203 <= '.')||(LA68_1203 >= '0' && LA68_1203 <= ';')||LA68_1203=='?'||(LA68_1203 >= 'A' && LA68_1203 <= 'L')||(LA68_1203 >= 'N' && LA68_1203 <= 'Z')||LA68_1203=='_'||(LA68_1203 >= 'a' && LA68_1203 <= 'r')||(LA68_1203 >= 't' && LA68_1203 <= 'z')||LA68_1203=='\u2019') ) {s = 42;}
						else s = 1310;
						 
						input.seek(index68_1203);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA68_1053 = input.LA(1);
						 
						int index68_1053 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1053=='s') ) {s = 504;}
						else if ( ((LA68_1053 >= '\t' && LA68_1053 <= '\n')||LA68_1053=='\r'||LA68_1053==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1053=='(') ) {s = 505;}
						else if ( (LA68_1053=='M') ) {s = 506;}
						else if ( (LA68_1053=='!'||(LA68_1053 >= '&' && LA68_1053 <= '\'')||(LA68_1053 >= ',' && LA68_1053 <= '.')||(LA68_1053 >= '0' && LA68_1053 <= ';')||LA68_1053=='?'||(LA68_1053 >= 'A' && LA68_1053 <= 'L')||(LA68_1053 >= 'N' && LA68_1053 <= 'Z')||LA68_1053=='_'||(LA68_1053 >= 'a' && LA68_1053 <= 'r')||(LA68_1053 >= 't' && LA68_1053 <= 'z')||LA68_1053=='\u2019') ) {s = 42;}
						else s = 1202;
						 
						input.seek(index68_1053);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA68_1309 = input.LA(1);
						 
						int index68_1309 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1309=='s') ) {s = 504;}
						else if ( ((LA68_1309 >= '\t' && LA68_1309 <= '\n')||LA68_1309=='\r'||LA68_1309==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1309=='(') ) {s = 505;}
						else if ( (LA68_1309=='M') ) {s = 506;}
						else if ( (LA68_1309=='!'||(LA68_1309 >= '&' && LA68_1309 <= '\'')||(LA68_1309 >= ',' && LA68_1309 <= '.')||(LA68_1309 >= '0' && LA68_1309 <= ';')||LA68_1309=='?'||(LA68_1309 >= 'A' && LA68_1309 <= 'L')||(LA68_1309 >= 'N' && LA68_1309 <= 'Z')||LA68_1309=='_'||(LA68_1309 >= 'a' && LA68_1309 <= 'r')||(LA68_1309 >= 't' && LA68_1309 <= 'z')||LA68_1309=='\u2019') ) {s = 42;}
						else s = 1394;
						 
						input.seek(index68_1309);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA68_812 = input.LA(1);
						 
						int index68_812 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_812==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_812);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA68_1172 = input.LA(1);
						 
						int index68_1172 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1172==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1172);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA68_1286 = input.LA(1);
						 
						int index68_1286 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1286==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1286);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA68_1293 = input.LA(1);
						 
						int index68_1293 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1293==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1293);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA68_1207 = input.LA(1);
						 
						int index68_1207 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1207=='s') ) {s = 504;}
						else if ( ((LA68_1207 >= '\t' && LA68_1207 <= '\n')||LA68_1207=='\r'||LA68_1207==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1207=='(') ) {s = 505;}
						else if ( (LA68_1207=='M') ) {s = 506;}
						else if ( (LA68_1207=='!'||(LA68_1207 >= '&' && LA68_1207 <= '\'')||(LA68_1207 >= ',' && LA68_1207 <= '.')||(LA68_1207 >= '0' && LA68_1207 <= ';')||LA68_1207=='?'||(LA68_1207 >= 'A' && LA68_1207 <= 'L')||(LA68_1207 >= 'N' && LA68_1207 <= 'Z')||LA68_1207=='_'||(LA68_1207 >= 'a' && LA68_1207 <= 'r')||(LA68_1207 >= 't' && LA68_1207 <= 'z')||LA68_1207=='\u2019') ) {s = 42;}
						else s = 1314;
						 
						input.seek(index68_1207);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA68_1448 = input.LA(1);
						 
						int index68_1448 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1448==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1448);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA68_1395 = input.LA(1);
						 
						int index68_1395 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1395=='s') ) {s = 504;}
						else if ( ((LA68_1395 >= '\t' && LA68_1395 <= '\n')||LA68_1395=='\r'||LA68_1395==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1395=='(') ) {s = 505;}
						else if ( (LA68_1395=='M') ) {s = 506;}
						else if ( (LA68_1395=='!'||(LA68_1395 >= '&' && LA68_1395 <= '\'')||(LA68_1395 >= ',' && LA68_1395 <= '.')||(LA68_1395 >= '0' && LA68_1395 <= ';')||LA68_1395=='?'||(LA68_1395 >= 'A' && LA68_1395 <= 'L')||(LA68_1395 >= 'N' && LA68_1395 <= 'Z')||LA68_1395=='_'||(LA68_1395 >= 'a' && LA68_1395 <= 'r')||(LA68_1395 >= 't' && LA68_1395 <= 'z')||LA68_1395=='\u2019') ) {s = 42;}
						else s = 1454;
						 
						input.seek(index68_1395);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA68_1208 = input.LA(1);
						 
						int index68_1208 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1208=='s') ) {s = 504;}
						else if ( ((LA68_1208 >= '\t' && LA68_1208 <= '\n')||LA68_1208=='\r'||LA68_1208==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1208=='(') ) {s = 505;}
						else if ( (LA68_1208=='M') ) {s = 506;}
						else if ( (LA68_1208=='!'||(LA68_1208 >= '&' && LA68_1208 <= '\'')||(LA68_1208 >= ',' && LA68_1208 <= '.')||(LA68_1208 >= '0' && LA68_1208 <= ';')||LA68_1208=='?'||(LA68_1208 >= 'A' && LA68_1208 <= 'L')||(LA68_1208 >= 'N' && LA68_1208 <= 'Z')||LA68_1208=='_'||(LA68_1208 >= 'a' && LA68_1208 <= 'r')||(LA68_1208 >= 't' && LA68_1208 <= 'z')||LA68_1208=='\u2019') ) {s = 42;}
						else s = 1315;
						 
						input.seek(index68_1208);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA68_822 = input.LA(1);
						 
						int index68_822 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_822==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_822);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA68_1067 = input.LA(1);
						 
						int index68_1067 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1067=='s') ) {s = 504;}
						else if ( ((LA68_1067 >= '\t' && LA68_1067 <= '\n')||LA68_1067=='\r'||LA68_1067==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1067=='(') ) {s = 505;}
						else if ( (LA68_1067=='M') ) {s = 506;}
						else if ( (LA68_1067=='!'||(LA68_1067 >= '&' && LA68_1067 <= '\'')||(LA68_1067 >= ',' && LA68_1067 <= '.')||(LA68_1067 >= '0' && LA68_1067 <= ';')||LA68_1067=='?'||(LA68_1067 >= 'A' && LA68_1067 <= 'L')||(LA68_1067 >= 'N' && LA68_1067 <= 'Z')||LA68_1067=='_'||(LA68_1067 >= 'a' && LA68_1067 <= 'r')||(LA68_1067 >= 't' && LA68_1067 <= 'z')||LA68_1067=='\u2019') ) {s = 42;}
						else s = 1212;
						 
						input.seek(index68_1067);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA68_994 = input.LA(1);
						 
						int index68_994 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_994=='s') ) {s = 504;}
						else if ( ((LA68_994 >= '\t' && LA68_994 <= '\n')||LA68_994=='\r'||LA68_994==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_994=='(') ) {s = 505;}
						else if ( (LA68_994=='M') ) {s = 506;}
						else if ( (LA68_994=='!'||(LA68_994 >= '&' && LA68_994 <= '\'')||(LA68_994 >= ',' && LA68_994 <= '.')||(LA68_994 >= '0' && LA68_994 <= ';')||LA68_994=='?'||(LA68_994 >= 'A' && LA68_994 <= 'L')||(LA68_994 >= 'N' && LA68_994 <= 'Z')||LA68_994=='_'||(LA68_994 >= 'a' && LA68_994 <= 'r')||(LA68_994 >= 't' && LA68_994 <= 'z')||LA68_994=='\u2019') ) {s = 42;}
						else s = 1162;
						 
						input.seek(index68_994);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA68_1008 = input.LA(1);
						 
						int index68_1008 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1008==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1008);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA68_1396 = input.LA(1);
						 
						int index68_1396 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1396=='s') ) {s = 504;}
						else if ( ((LA68_1396 >= '\t' && LA68_1396 <= '\n')||LA68_1396=='\r'||LA68_1396==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1396=='(') ) {s = 505;}
						else if ( (LA68_1396=='M') ) {s = 506;}
						else if ( (LA68_1396=='!'||(LA68_1396 >= '&' && LA68_1396 <= '\'')||(LA68_1396 >= ',' && LA68_1396 <= '.')||(LA68_1396 >= '0' && LA68_1396 <= ';')||LA68_1396=='?'||(LA68_1396 >= 'A' && LA68_1396 <= 'L')||(LA68_1396 >= 'N' && LA68_1396 <= 'Z')||LA68_1396=='_'||(LA68_1396 >= 'a' && LA68_1396 <= 'r')||(LA68_1396 >= 't' && LA68_1396 <= 'z')||LA68_1396=='\u2019') ) {s = 42;}
						else s = 1455;
						 
						input.seek(index68_1396);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA68_993 = input.LA(1);
						 
						int index68_993 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_993=='s') ) {s = 504;}
						else if ( ((LA68_993 >= '\t' && LA68_993 <= '\n')||LA68_993=='\r'||LA68_993==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_993=='(') ) {s = 505;}
						else if ( (LA68_993=='M') ) {s = 506;}
						else if ( (LA68_993=='!'||(LA68_993 >= '&' && LA68_993 <= '\'')||(LA68_993 >= ',' && LA68_993 <= '.')||(LA68_993 >= '0' && LA68_993 <= ';')||LA68_993=='?'||(LA68_993 >= 'A' && LA68_993 <= 'L')||(LA68_993 >= 'N' && LA68_993 <= 'Z')||LA68_993=='_'||(LA68_993 >= 'a' && LA68_993 <= 'r')||(LA68_993 >= 't' && LA68_993 <= 'z')||LA68_993=='\u2019') ) {s = 42;}
						else s = 1161;
						 
						input.seek(index68_993);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA68_35 = input.LA(1);
						 
						int index68_35 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_35=='S') ) {s = 180;}
						else if ( ((LA68_35 >= '\t' && LA68_35 <= '\n')||LA68_35=='\r'||LA68_35==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_35);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA68_700 = input.LA(1);
						 
						int index68_700 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_700==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_700=='s') ) {s = 898;}
						else s = 42;
						 
						input.seek(index68_700);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA68_1022 = input.LA(1);
						 
						int index68_1022 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1022==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1022);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA68_1183 = input.LA(1);
						 
						int index68_1183 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1183==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1183);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA68_1497 = input.LA(1);
						 
						int index68_1497 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1497=='s') ) {s = 504;}
						else if ( ((LA68_1497 >= '\t' && LA68_1497 <= '\n')||LA68_1497=='\r'||LA68_1497==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1497=='(') ) {s = 505;}
						else if ( (LA68_1497=='M') ) {s = 506;}
						else if ( (LA68_1497=='!'||(LA68_1497 >= '&' && LA68_1497 <= '\'')||(LA68_1497 >= ',' && LA68_1497 <= '.')||(LA68_1497 >= '0' && LA68_1497 <= ';')||LA68_1497=='?'||(LA68_1497 >= 'A' && LA68_1497 <= 'L')||(LA68_1497 >= 'N' && LA68_1497 <= 'Z')||LA68_1497=='_'||(LA68_1497 >= 'a' && LA68_1497 <= 'r')||(LA68_1497 >= 't' && LA68_1497 <= 'z')||LA68_1497=='\u2019') ) {s = 42;}
						else s = 1528;
						 
						input.seek(index68_1497);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA68_1384 = input.LA(1);
						 
						int index68_1384 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1384==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1384);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA68_1016 = input.LA(1);
						 
						int index68_1016 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1016==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1016);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA68_1020 = input.LA(1);
						 
						int index68_1020 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1020==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1020);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA68_1376 = input.LA(1);
						 
						int index68_1376 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1376=='s') ) {s = 504;}
						else if ( ((LA68_1376 >= '\t' && LA68_1376 <= '\n')||LA68_1376=='\r'||LA68_1376==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1376=='(') ) {s = 505;}
						else if ( (LA68_1376=='M') ) {s = 506;}
						else if ( (LA68_1376=='!'||(LA68_1376 >= '&' && LA68_1376 <= '\'')||(LA68_1376 >= ',' && LA68_1376 <= '.')||(LA68_1376 >= '0' && LA68_1376 <= ';')||LA68_1376=='?'||(LA68_1376 >= 'A' && LA68_1376 <= 'L')||(LA68_1376 >= 'N' && LA68_1376 <= 'Z')||LA68_1376=='_'||(LA68_1376 >= 'a' && LA68_1376 <= 'r')||(LA68_1376 >= 't' && LA68_1376 <= 'z')||LA68_1376=='\u2019') ) {s = 42;}
						else s = 1444;
						 
						input.seek(index68_1376);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA68_828 = input.LA(1);
						 
						int index68_828 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_828==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_828);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA68_1213 = input.LA(1);
						 
						int index68_1213 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1213=='s') ) {s = 504;}
						else if ( ((LA68_1213 >= '\t' && LA68_1213 <= '\n')||LA68_1213=='\r'||LA68_1213==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1213=='(') ) {s = 505;}
						else if ( (LA68_1213=='M') ) {s = 506;}
						else if ( (LA68_1213=='!'||(LA68_1213 >= '&' && LA68_1213 <= '\'')||(LA68_1213 >= ',' && LA68_1213 <= '.')||(LA68_1213 >= '0' && LA68_1213 <= ';')||LA68_1213=='?'||(LA68_1213 >= 'A' && LA68_1213 <= 'L')||(LA68_1213 >= 'N' && LA68_1213 <= 'Z')||LA68_1213=='_'||(LA68_1213 >= 'a' && LA68_1213 <= 'r')||(LA68_1213 >= 't' && LA68_1213 <= 'z')||LA68_1213=='\u2019') ) {s = 42;}
						else s = 1317;
						 
						input.seek(index68_1213);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA68_1318 = input.LA(1);
						 
						int index68_1318 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1318=='s') ) {s = 504;}
						else if ( ((LA68_1318 >= '\t' && LA68_1318 <= '\n')||LA68_1318=='\r'||LA68_1318==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1318=='(') ) {s = 505;}
						else if ( (LA68_1318=='M') ) {s = 506;}
						else if ( (LA68_1318=='!'||(LA68_1318 >= '&' && LA68_1318 <= '\'')||(LA68_1318 >= ',' && LA68_1318 <= '.')||(LA68_1318 >= '0' && LA68_1318 <= ';')||LA68_1318=='?'||(LA68_1318 >= 'A' && LA68_1318 <= 'L')||(LA68_1318 >= 'N' && LA68_1318 <= 'Z')||LA68_1318=='_'||(LA68_1318 >= 'a' && LA68_1318 <= 'r')||(LA68_1318 >= 't' && LA68_1318 <= 'z')||LA68_1318=='\u2019') ) {s = 42;}
						else s = 1397;
						 
						input.seek(index68_1318);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA68_1186 = input.LA(1);
						 
						int index68_1186 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1186==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1186);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA68_1189 = input.LA(1);
						 
						int index68_1189 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1189==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1189);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA68_638 = input.LA(1);
						 
						int index68_638 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_638==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_638);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA68_702 = input.LA(1);
						 
						int index68_702 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_702=='s') ) {s = 504;}
						else if ( ((LA68_702 >= '\t' && LA68_702 <= '\n')||LA68_702=='\r'||LA68_702==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_702=='(') ) {s = 505;}
						else if ( (LA68_702=='M') ) {s = 506;}
						else if ( (LA68_702=='!'||(LA68_702 >= '&' && LA68_702 <= '\'')||(LA68_702 >= ',' && LA68_702 <= '.')||(LA68_702 >= '0' && LA68_702 <= ';')||LA68_702=='?'||(LA68_702 >= 'A' && LA68_702 <= 'L')||(LA68_702 >= 'N' && LA68_702 <= 'Z')||LA68_702=='_'||(LA68_702 >= 'a' && LA68_702 <= 'r')||(LA68_702 >= 't' && LA68_702 <= 'z')||LA68_702=='\u2019') ) {s = 42;}
						else s = 900;
						 
						input.seek(index68_702);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA68_846 = input.LA(1);
						 
						int index68_846 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_846==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_846);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA68_432 = input.LA(1);
						 
						int index68_432 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_432==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_432);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA68_1072 = input.LA(1);
						 
						int index68_1072 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1072=='s') ) {s = 504;}
						else if ( ((LA68_1072 >= '\t' && LA68_1072 <= '\n')||LA68_1072=='\r'||LA68_1072==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1072=='(') ) {s = 505;}
						else if ( (LA68_1072=='M') ) {s = 506;}
						else if ( (LA68_1072=='!'||(LA68_1072 >= '&' && LA68_1072 <= '\'')||(LA68_1072 >= ',' && LA68_1072 <= '.')||(LA68_1072 >= '0' && LA68_1072 <= ';')||LA68_1072=='?'||(LA68_1072 >= 'A' && LA68_1072 <= 'L')||(LA68_1072 >= 'N' && LA68_1072 <= 'Z')||LA68_1072=='_'||(LA68_1072 >= 'a' && LA68_1072 <= 'r')||(LA68_1072 >= 't' && LA68_1072 <= 'z')||LA68_1072=='\u2019') ) {s = 42;}
						else s = 1216;
						 
						input.seek(index68_1072);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA68_836 = input.LA(1);
						 
						int index68_836 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_836==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_836);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA68_904 = input.LA(1);
						 
						int index68_904 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_904=='s') ) {s = 504;}
						else if ( ((LA68_904 >= '\t' && LA68_904 <= '\n')||LA68_904=='\r'||LA68_904==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_904=='(') ) {s = 505;}
						else if ( (LA68_904=='M') ) {s = 506;}
						else if ( (LA68_904=='!'||(LA68_904 >= '&' && LA68_904 <= '\'')||(LA68_904 >= ',' && LA68_904 <= '.')||(LA68_904 >= '0' && LA68_904 <= ';')||LA68_904=='?'||(LA68_904 >= 'A' && LA68_904 <= 'L')||(LA68_904 >= 'N' && LA68_904 <= 'Z')||LA68_904=='_'||(LA68_904 >= 'a' && LA68_904 <= 'r')||(LA68_904 >= 't' && LA68_904 <= 'z')||LA68_904=='\u2019') ) {s = 42;}
						else s = 1074;
						 
						input.seek(index68_904);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA68_1398 = input.LA(1);
						 
						int index68_1398 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1398=='s') ) {s = 504;}
						else if ( ((LA68_1398 >= '\t' && LA68_1398 <= '\n')||LA68_1398=='\r'||LA68_1398==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1398=='(') ) {s = 505;}
						else if ( (LA68_1398=='M') ) {s = 506;}
						else if ( (LA68_1398=='!'||(LA68_1398 >= '&' && LA68_1398 <= '\'')||(LA68_1398 >= ',' && LA68_1398 <= '.')||(LA68_1398 >= '0' && LA68_1398 <= ';')||LA68_1398=='?'||(LA68_1398 >= 'A' && LA68_1398 <= 'L')||(LA68_1398 >= 'N' && LA68_1398 <= 'Z')||LA68_1398=='_'||(LA68_1398 >= 'a' && LA68_1398 <= 'r')||(LA68_1398 >= 't' && LA68_1398 <= 'z')||LA68_1398=='\u2019') ) {s = 42;}
						else s = 1456;
						 
						input.seek(index68_1398);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA68_295 = input.LA(1);
						 
						int index68_295 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_295=='s') ) {s = 504;}
						else if ( ((LA68_295 >= '\t' && LA68_295 <= '\n')||LA68_295=='\r'||LA68_295==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_295=='(') ) {s = 505;}
						else if ( (LA68_295=='M') ) {s = 506;}
						else if ( (LA68_295=='!'||(LA68_295 >= '&' && LA68_295 <= '\'')||(LA68_295 >= ',' && LA68_295 <= '.')||(LA68_295 >= '0' && LA68_295 <= ';')||LA68_295=='?'||(LA68_295 >= 'A' && LA68_295 <= 'L')||(LA68_295 >= 'N' && LA68_295 <= 'Z')||LA68_295=='_'||(LA68_295 >= 'a' && LA68_295 <= 'r')||(LA68_295 >= 't' && LA68_295 <= 'z')||LA68_295=='\u2019') ) {s = 42;}
						else s = 503;
						 
						input.seek(index68_295);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA68_839 = input.LA(1);
						 
						int index68_839 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_839==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_839);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA68_726 = input.LA(1);
						 
						int index68_726 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_726=='s') ) {s = 504;}
						else if ( ((LA68_726 >= '\t' && LA68_726 <= '\n')||LA68_726=='\r'||LA68_726==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_726=='(') ) {s = 505;}
						else if ( (LA68_726=='M') ) {s = 506;}
						else if ( (LA68_726=='!'||(LA68_726 >= '&' && LA68_726 <= '\'')||(LA68_726 >= ',' && LA68_726 <= '.')||(LA68_726 >= '0' && LA68_726 <= ';')||LA68_726=='?'||(LA68_726 >= 'A' && LA68_726 <= 'L')||(LA68_726 >= 'N' && LA68_726 <= 'Z')||LA68_726=='_'||(LA68_726 >= 'a' && LA68_726 <= 'r')||(LA68_726 >= 't' && LA68_726 <= 'z')||LA68_726=='\u2019') ) {s = 42;}
						else s = 935;
						 
						input.seek(index68_726);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA68_1184 = input.LA(1);
						 
						int index68_1184 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1184==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1184);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA68_566 = input.LA(1);
						 
						int index68_566 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_566==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_566=='h') ) {s = 779;}
						else s = 42;
						 
						input.seek(index68_566);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA68_1259 = input.LA(1);
						 
						int index68_1259 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1259==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1259);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA68_1173 = input.LA(1);
						 
						int index68_1173 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1173==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1173);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA68_180 = input.LA(1);
						 
						int index68_180 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_180 >= '\t' && LA68_180 <= '\n')||LA68_180=='\r'||LA68_180==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_180);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA68_831 = input.LA(1);
						 
						int index68_831 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_831==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_831=='s') ) {s = 1022;}
						else s = 42;
						 
						input.seek(index68_831);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA68_861 = input.LA(1);
						 
						int index68_861 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_861==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_861);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA68_37 = input.LA(1);
						 
						int index68_37 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_37 >= '\t' && LA68_37 <= '\n')||LA68_37=='\r'||LA68_37==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_37);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA68_381 = input.LA(1);
						 
						int index68_381 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_381 >= '\t' && LA68_381 <= '\n')||LA68_381=='\r'||LA68_381==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_381);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA68_76 = input.LA(1);
						 
						int index68_76 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_76 >= '\t' && LA68_76 <= '\n')||LA68_76=='\r'||LA68_76==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_76);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA68_238 = input.LA(1);
						 
						int index68_238 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_238 >= '\t' && LA68_238 <= '\n')||LA68_238=='\r'||LA68_238==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_238);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA68_449 = input.LA(1);
						 
						int index68_449 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_449==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_449);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA68_250 = input.LA(1);
						 
						int index68_250 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_250==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_250);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA68_1453 = input.LA(1);
						 
						int index68_1453 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1453==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1453);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA68_661 = input.LA(1);
						 
						int index68_661 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_661==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_661);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA68_1263 = input.LA(1);
						 
						int index68_1263 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1263==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1263);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA68_1452 = input.LA(1);
						 
						int index68_1452 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1452==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1452);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA68_1264 = input.LA(1);
						 
						int index68_1264 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1264=='s') ) {s = 504;}
						else if ( ((LA68_1264 >= '\t' && LA68_1264 <= '\n')||LA68_1264=='\r'||LA68_1264==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1264=='(') ) {s = 505;}
						else if ( (LA68_1264=='M') ) {s = 506;}
						else if ( (LA68_1264=='!'||(LA68_1264 >= '&' && LA68_1264 <= '\'')||(LA68_1264 >= ',' && LA68_1264 <= '.')||(LA68_1264 >= '0' && LA68_1264 <= ';')||LA68_1264=='?'||(LA68_1264 >= 'A' && LA68_1264 <= 'L')||(LA68_1264 >= 'N' && LA68_1264 <= 'Z')||LA68_1264=='_'||(LA68_1264 >= 'a' && LA68_1264 <= 'r')||(LA68_1264 >= 't' && LA68_1264 <= 'z')||LA68_1264=='\u2019') ) {s = 42;}
						else s = 1362;
						 
						input.seek(index68_1264);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA68_1382 = input.LA(1);
						 
						int index68_1382 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1382==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1382);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA68_1037 = input.LA(1);
						 
						int index68_1037 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1037==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1037);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA68_1387 = input.LA(1);
						 
						int index68_1387 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1387==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1387);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA68_1122 = input.LA(1);
						 
						int index68_1122 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1122=='s') ) {s = 504;}
						else if ( ((LA68_1122 >= '\t' && LA68_1122 <= '\n')||LA68_1122=='\r'||LA68_1122==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1122=='(') ) {s = 505;}
						else if ( (LA68_1122=='M') ) {s = 506;}
						else if ( (LA68_1122=='!'||(LA68_1122 >= '&' && LA68_1122 <= '\'')||(LA68_1122 >= ',' && LA68_1122 <= '.')||(LA68_1122 >= '0' && LA68_1122 <= ';')||LA68_1122=='?'||(LA68_1122 >= 'A' && LA68_1122 <= 'L')||(LA68_1122 >= 'N' && LA68_1122 <= 'Z')||LA68_1122=='_'||(LA68_1122 >= 'a' && LA68_1122 <= 'r')||(LA68_1122 >= 't' && LA68_1122 <= 'z')||LA68_1122=='\u2019') ) {s = 42;}
						else s = 1261;
						 
						input.seek(index68_1122);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA68_1190 = input.LA(1);
						 
						int index68_1190 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1190==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1190);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA68_642 = input.LA(1);
						 
						int index68_642 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_642==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_642);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA68_945 = input.LA(1);
						 
						int index68_945 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_945=='s') ) {s = 504;}
						else if ( ((LA68_945 >= '\t' && LA68_945 <= '\n')||LA68_945=='\r'||LA68_945==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_945=='(') ) {s = 505;}
						else if ( (LA68_945=='M') ) {s = 506;}
						else if ( (LA68_945=='!'||(LA68_945 >= '&' && LA68_945 <= '\'')||(LA68_945 >= ',' && LA68_945 <= '.')||(LA68_945 >= '0' && LA68_945 <= ';')||LA68_945=='?'||(LA68_945 >= 'A' && LA68_945 <= 'L')||(LA68_945 >= 'N' && LA68_945 <= 'Z')||LA68_945=='_'||(LA68_945 >= 'a' && LA68_945 <= 'r')||(LA68_945 >= 't' && LA68_945 <= 'z')||LA68_945=='\u2019') ) {s = 42;}
						else s = 1116;
						 
						input.seek(index68_945);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA68_1196 = input.LA(1);
						 
						int index68_1196 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1196==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1196);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA68_1117 = input.LA(1);
						 
						int index68_1117 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1117=='s') ) {s = 504;}
						else if ( ((LA68_1117 >= '\t' && LA68_1117 <= '\n')||LA68_1117=='\r'||LA68_1117==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1117=='(') ) {s = 505;}
						else if ( (LA68_1117=='M') ) {s = 506;}
						else if ( (LA68_1117=='!'||(LA68_1117 >= '&' && LA68_1117 <= '\'')||(LA68_1117 >= ',' && LA68_1117 <= '.')||(LA68_1117 >= '0' && LA68_1117 <= ';')||LA68_1117=='?'||(LA68_1117 >= 'A' && LA68_1117 <= 'L')||(LA68_1117 >= 'N' && LA68_1117 <= 'Z')||LA68_1117=='_'||(LA68_1117 >= 'a' && LA68_1117 <= 'r')||(LA68_1117 >= 't' && LA68_1117 <= 'z')||LA68_1117=='\u2019') ) {s = 42;}
						else s = 1256;
						 
						input.seek(index68_1117);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA68_859 = input.LA(1);
						 
						int index68_859 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_859==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_859);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA68_1434 = input.LA(1);
						 
						int index68_1434 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1434=='s') ) {s = 504;}
						else if ( ((LA68_1434 >= '\t' && LA68_1434 <= '\n')||LA68_1434=='\r'||LA68_1434==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1434=='(') ) {s = 505;}
						else if ( (LA68_1434=='M') ) {s = 506;}
						else if ( (LA68_1434=='!'||(LA68_1434 >= '&' && LA68_1434 <= '\'')||(LA68_1434 >= ',' && LA68_1434 <= '.')||(LA68_1434 >= '0' && LA68_1434 <= ';')||LA68_1434=='?'||(LA68_1434 >= 'A' && LA68_1434 <= 'L')||(LA68_1434 >= 'N' && LA68_1434 <= 'Z')||LA68_1434=='_'||(LA68_1434 >= 'a' && LA68_1434 <= 'r')||(LA68_1434 >= 't' && LA68_1434 <= 'z')||LA68_1434=='\u2019') ) {s = 42;}
						else s = 1488;
						 
						input.seek(index68_1434);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA68_15 = input.LA(1);
						 
						int index68_15 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_15=='a') ) {s = 102;}
						else if ( (LA68_15=='e') ) {s = 103;}
						else if ( (LA68_15=='h') ) {s = 104;}
						else if ( (LA68_15=='\u00F6') && ((allowBreed))) {s = 105;}
						else if ( (LA68_15=='o') ) {s = 106;}
						else if ( (LA68_15=='U') ) {s = 107;}
						else s = 42;
						 
						input.seek(index68_15);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA68_1501 = input.LA(1);
						 
						int index68_1501 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1501==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1501);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA68_1432 = input.LA(1);
						 
						int index68_1432 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1432=='s') ) {s = 504;}
						else if ( ((LA68_1432 >= '\t' && LA68_1432 <= '\n')||LA68_1432=='\r'||LA68_1432==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1432=='(') ) {s = 505;}
						else if ( (LA68_1432=='M') ) {s = 506;}
						else if ( (LA68_1432=='!'||(LA68_1432 >= '&' && LA68_1432 <= '\'')||(LA68_1432 >= ',' && LA68_1432 <= '.')||(LA68_1432 >= '0' && LA68_1432 <= ';')||LA68_1432=='?'||(LA68_1432 >= 'A' && LA68_1432 <= 'L')||(LA68_1432 >= 'N' && LA68_1432 <= 'Z')||LA68_1432=='_'||(LA68_1432 >= 'a' && LA68_1432 <= 'r')||(LA68_1432 >= 't' && LA68_1432 <= 'z')||LA68_1432=='\u2019') ) {s = 42;}
						else s = 1486;
						 
						input.seek(index68_1432);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA68_1038 = input.LA(1);
						 
						int index68_1038 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1038==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1038);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA68_439 = input.LA(1);
						 
						int index68_439 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_439==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_439);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA68_854 = input.LA(1);
						 
						int index68_854 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_854==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_854);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA68_1433 = input.LA(1);
						 
						int index68_1433 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1433=='s') ) {s = 504;}
						else if ( ((LA68_1433 >= '\t' && LA68_1433 <= '\n')||LA68_1433=='\r'||LA68_1433==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1433=='(') ) {s = 505;}
						else if ( (LA68_1433=='M') ) {s = 506;}
						else if ( (LA68_1433=='!'||(LA68_1433 >= '&' && LA68_1433 <= '\'')||(LA68_1433 >= ',' && LA68_1433 <= '.')||(LA68_1433 >= '0' && LA68_1433 <= ';')||LA68_1433=='?'||(LA68_1433 >= 'A' && LA68_1433 <= 'L')||(LA68_1433 >= 'N' && LA68_1433 <= 'Z')||LA68_1433=='_'||(LA68_1433 >= 'a' && LA68_1433 <= 'r')||(LA68_1433 >= 't' && LA68_1433 <= 'z')||LA68_1433=='\u2019') ) {s = 42;}
						else s = 1487;
						 
						input.seek(index68_1433);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA68_1057 = input.LA(1);
						 
						int index68_1057 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1057==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1057);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA68_1311 = input.LA(1);
						 
						int index68_1311 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1311==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1311);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA68_881 = input.LA(1);
						 
						int index68_881 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_881==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_881);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA68_671 = input.LA(1);
						 
						int index68_671 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_671==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_671=='e') ) {s = 875;}
						else s = 42;
						 
						input.seek(index68_671);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA68_1209 = input.LA(1);
						 
						int index68_1209 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1209==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1209);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA68_1399 = input.LA(1);
						 
						int index68_1399 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1399==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1399);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA68_1064 = input.LA(1);
						 
						int index68_1064 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1064==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1064);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA68_1205 = input.LA(1);
						 
						int index68_1205 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1205==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1205);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA68_685 = input.LA(1);
						 
						int index68_685 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_685==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_685);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA68_182 = input.LA(1);
						 
						int index68_182 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_182 >= '\t' && LA68_182 <= '\n')||LA68_182=='\r'||LA68_182==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_182);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA68_38 = input.LA(1);
						 
						int index68_38 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_38 >= '\t' && LA68_38 <= '\n')||LA68_38=='\r'||LA68_38==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_38);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA68_380 = input.LA(1);
						 
						int index68_380 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_380 >= '\t' && LA68_380 <= '\n')||LA68_380=='\r'||LA68_380==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_380);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA68_668 = input.LA(1);
						 
						int index68_668 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_668==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_668);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA68_504 = input.LA(1);
						 
						int index68_504 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_504 >= '\t' && LA68_504 <= '\n')||LA68_504=='\r'||LA68_504==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_504=='(') ) {s = 505;}
						else if ( (LA68_504=='M') ) {s = 506;}
						else if ( (LA68_504=='!'||(LA68_504 >= '&' && LA68_504 <= '\'')||(LA68_504 >= ',' && LA68_504 <= '.')||(LA68_504 >= '0' && LA68_504 <= ';')||LA68_504=='?'||(LA68_504 >= 'A' && LA68_504 <= 'L')||(LA68_504 >= 'N' && LA68_504 <= 'Z')||LA68_504=='_'||(LA68_504 >= 'a' && LA68_504 <= 'z')||LA68_504=='\u2019') ) {s = 42;}
						else s = 708;
						 
						input.seek(index68_504);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA68_77 = input.LA(1);
						 
						int index68_77 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_77 >= '\t' && LA68_77 <= '\n')||LA68_77=='\r'||LA68_77==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_77);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA68_463 = input.LA(1);
						 
						int index68_463 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_463==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_463);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA68_869 = input.LA(1);
						 
						int index68_869 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_869==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_869);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA68_1577 = input.LA(1);
						 
						int index68_1577 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1577=='s') ) {s = 504;}
						else if ( ((LA68_1577 >= '\t' && LA68_1577 <= '\n')||LA68_1577=='\r'||LA68_1577==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1577=='(') ) {s = 505;}
						else if ( (LA68_1577=='M') ) {s = 506;}
						else if ( (LA68_1577=='!'||(LA68_1577 >= '&' && LA68_1577 <= '\'')||(LA68_1577 >= ',' && LA68_1577 <= '.')||(LA68_1577 >= '0' && LA68_1577 <= ';')||LA68_1577=='?'||(LA68_1577 >= 'A' && LA68_1577 <= 'L')||(LA68_1577 >= 'N' && LA68_1577 <= 'Z')||LA68_1577=='_'||(LA68_1577 >= 'a' && LA68_1577 <= 'r')||(LA68_1577 >= 't' && LA68_1577 <= 'z')||LA68_1577=='\u2019') ) {s = 42;}
						else s = 1594;
						 
						input.seek(index68_1577);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA68_0 = input.LA(1);
						s = -1;
						if ( (LA68_0=='M') ) {s = 1;}
						else if ( (LA68_0=='O') ) {s = 2;}
						else if ( (LA68_0=='N') ) {s = 3;}
						else if ( (LA68_0=='A') ) {s = 4;}
						else if ( (LA68_0=='B') ) {s = 5;}
						else if ( (LA68_0=='C') ) {s = 6;}
						else if ( (LA68_0=='D') ) {s = 7;}
						else if ( (LA68_0=='E') ) {s = 8;}
						else if ( (LA68_0=='F') ) {s = 9;}
						else if ( (LA68_0=='G') ) {s = 10;}
						else if ( (LA68_0=='H') ) {s = 11;}
						else if ( (LA68_0=='I') ) {s = 12;}
						else if ( (LA68_0=='J') ) {s = 13;}
						else if ( (LA68_0=='K') ) {s = 14;}
						else if ( (LA68_0=='L') ) {s = 15;}
						else if ( (LA68_0=='P') ) {s = 16;}
						else if ( (LA68_0=='R') ) {s = 17;}
						else if ( (LA68_0=='S') ) {s = 18;}
						else if ( (LA68_0=='T') ) {s = 19;}
						else if ( (LA68_0=='V') ) {s = 20;}
						else if ( (LA68_0=='W') ) {s = 21;}
						else if ( (LA68_0=='X') ) {s = 22;}
						else if ( (LA68_0=='Y') ) {s = 23;}
						else if ( (LA68_0=='U') ) {s = 24;}
						else if ( (LA68_0=='i') ) {s = 25;}
						else if ( ((LA68_0 >= '0' && LA68_0 <= '9')) ) {s = 26;}
						else if ( ((LA68_0 >= '\t' && LA68_0 <= '\n')||LA68_0=='\r'||LA68_0==' ') ) {s = 27;}
						else if ( (LA68_0=='(') ) {s = 28;}
						else if ( (LA68_0=='.') ) {s = 29;}
						else if ( (LA68_0=='Q'||LA68_0=='Z') ) {s = 30;}
						else if ( ((LA68_0 >= '&' && LA68_0 <= '\'')||(LA68_0 >= ',' && LA68_0 <= '-')||(LA68_0 >= ':' && LA68_0 <= ';')||LA68_0=='_'||(LA68_0 >= 'a' && LA68_0 <= 'h')||(LA68_0 >= 'j' && LA68_0 <= 'z')||LA68_0=='\u2019') ) {s = 31;}
						else if ( ((LA68_0 >= '\u0000' && LA68_0 <= '\b')||(LA68_0 >= '\u000B' && LA68_0 <= '\f')||(LA68_0 >= '\u000E' && LA68_0 <= '\u001F')||(LA68_0 >= '!' && LA68_0 <= '%')||(LA68_0 >= ')' && LA68_0 <= '+')||LA68_0=='/'||(LA68_0 >= '<' && LA68_0 <= '@')||(LA68_0 >= '[' && LA68_0 <= '^')||LA68_0=='`'||(LA68_0 >= '{' && LA68_0 <= '\u2018')||(LA68_0 >= '\u201A' && LA68_0 <= '\uFFFF')) ) {s = 32;}
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA68_834 = input.LA(1);
						 
						int index68_834 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_834==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_834);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA68_1050 = input.LA(1);
						 
						int index68_1050 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1050==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1050);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA68_681 = input.LA(1);
						 
						int index68_681 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_681==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_681);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA68_1019 = input.LA(1);
						 
						int index68_1019 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1019==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1019);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA68_1149 = input.LA(1);
						 
						int index68_1149 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1149=='s') ) {s = 504;}
						else if ( ((LA68_1149 >= '\t' && LA68_1149 <= '\n')||LA68_1149=='\r'||LA68_1149==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1149=='(') ) {s = 505;}
						else if ( (LA68_1149=='M') ) {s = 506;}
						else if ( (LA68_1149=='!'||(LA68_1149 >= '&' && LA68_1149 <= '\'')||(LA68_1149 >= ',' && LA68_1149 <= '.')||(LA68_1149 >= '0' && LA68_1149 <= ';')||LA68_1149=='?'||(LA68_1149 >= 'A' && LA68_1149 <= 'L')||(LA68_1149 >= 'N' && LA68_1149 <= 'Z')||LA68_1149=='_'||(LA68_1149 >= 'a' && LA68_1149 <= 'r')||(LA68_1149 >= 't' && LA68_1149 <= 'z')||LA68_1149=='\u2019') ) {s = 42;}
						else s = 1277;
						 
						input.seek(index68_1149);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA68_873 = input.LA(1);
						 
						int index68_873 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_873==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_873);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA68_1135 = input.LA(1);
						 
						int index68_1135 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1135==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1135);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA68_973 = input.LA(1);
						 
						int index68_973 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_973=='s') ) {s = 504;}
						else if ( ((LA68_973 >= '\t' && LA68_973 <= '\n')||LA68_973=='\r'||LA68_973==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_973=='(') ) {s = 505;}
						else if ( (LA68_973=='M') ) {s = 506;}
						else if ( (LA68_973=='!'||(LA68_973 >= '&' && LA68_973 <= '\'')||(LA68_973 >= ',' && LA68_973 <= '.')||(LA68_973 >= '0' && LA68_973 <= ';')||LA68_973=='?'||(LA68_973 >= 'A' && LA68_973 <= 'L')||(LA68_973 >= 'N' && LA68_973 <= 'Z')||LA68_973=='_'||(LA68_973 >= 'a' && LA68_973 <= 'r')||(LA68_973 >= 't' && LA68_973 <= 'z')||LA68_973=='\u2019') ) {s = 42;}
						else s = 1142;
						 
						input.seek(index68_973);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA68_1439 = input.LA(1);
						 
						int index68_1439 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1439=='s') ) {s = 504;}
						else if ( ((LA68_1439 >= '\t' && LA68_1439 <= '\n')||LA68_1439=='\r'||LA68_1439==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1439=='(') ) {s = 505;}
						else if ( (LA68_1439=='M') ) {s = 506;}
						else if ( (LA68_1439=='!'||(LA68_1439 >= '&' && LA68_1439 <= '\'')||(LA68_1439 >= ',' && LA68_1439 <= '.')||(LA68_1439 >= '0' && LA68_1439 <= ';')||LA68_1439=='?'||(LA68_1439 >= 'A' && LA68_1439 <= 'L')||(LA68_1439 >= 'N' && LA68_1439 <= 'Z')||LA68_1439=='_'||(LA68_1439 >= 'a' && LA68_1439 <= 'r')||(LA68_1439 >= 't' && LA68_1439 <= 'z')||LA68_1439=='\u2019') ) {s = 42;}
						else s = 1493;
						 
						input.seek(index68_1439);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA68_1026 = input.LA(1);
						 
						int index68_1026 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1026==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1026=='s') ) {s = 1184;}
						else s = 42;
						 
						input.seek(index68_1026);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA68_874 = input.LA(1);
						 
						int index68_874 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_874==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_874);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA68_1143 = input.LA(1);
						 
						int index68_1143 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1143==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1143=='s') ) {s = 1273;}
						else s = 42;
						 
						input.seek(index68_1143);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA68_548 = input.LA(1);
						 
						int index68_548 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_548=='F') && ((allowBreed))) {s = 105;}
						else if ( (LA68_548=='V') ) {s = 550;}
						 
						input.seek(index68_548);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA68_387 = input.LA(1);
						 
						int index68_387 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_387==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_387);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA68_1002 = input.LA(1);
						 
						int index68_1002 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1002==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1002);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA68_895 = input.LA(1);
						 
						int index68_895 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_895==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_895);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA68_1440 = input.LA(1);
						 
						int index68_1440 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1440==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1440);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA68_187 = input.LA(1);
						 
						int index68_187 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_187==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_187);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA68_36 = input.LA(1);
						 
						int index68_36 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_36=='s') ) {s = 182;}
						else if ( ((LA68_36 >= '\t' && LA68_36 <= '\n')||LA68_36=='\r'||LA68_36==' ') && ((allowJudge))) {s = 181;}
						else s = 42;
						 
						input.seek(index68_36);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA68_1215 = input.LA(1);
						 
						int index68_1215 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1215==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1215);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA68_887 = input.LA(1);
						 
						int index68_887 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_887=='o') ) {s = 1061;}
						else if ( (LA68_887=='s') ) {s = 504;}
						else if ( ((LA68_887 >= '\t' && LA68_887 <= '\n')||LA68_887=='\r'||LA68_887==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_887=='(') ) {s = 505;}
						else if ( (LA68_887=='M') ) {s = 506;}
						else if ( (LA68_887=='!'||(LA68_887 >= '&' && LA68_887 <= '\'')||(LA68_887 >= ',' && LA68_887 <= '.')||(LA68_887 >= '0' && LA68_887 <= ';')||LA68_887=='?'||(LA68_887 >= 'A' && LA68_887 <= 'L')||(LA68_887 >= 'N' && LA68_887 <= 'Z')||LA68_887=='_'||(LA68_887 >= 'a' && LA68_887 <= 'n')||(LA68_887 >= 'p' && LA68_887 <= 'r')||(LA68_887 >= 't' && LA68_887 <= 'z')||LA68_887=='\u2019') ) {s = 42;}
						else s = 1062;
						 
						input.seek(index68_887);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA68_1071 = input.LA(1);
						 
						int index68_1071 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1071==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1071);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA68_898 = input.LA(1);
						 
						int index68_898 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_898==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_898);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA68_1210 = input.LA(1);
						 
						int index68_1210 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1210==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1210);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA68_692 = input.LA(1);
						 
						int index68_692 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_692==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_692);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA68_1206 = input.LA(1);
						 
						int index68_1206 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1206=='e') ) {s = 1312;}
						else if ( (LA68_1206=='s') ) {s = 504;}
						else if ( ((LA68_1206 >= '\t' && LA68_1206 <= '\n')||LA68_1206=='\r'||LA68_1206==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1206=='(') ) {s = 505;}
						else if ( (LA68_1206=='M') ) {s = 506;}
						else if ( (LA68_1206=='!'||(LA68_1206 >= '&' && LA68_1206 <= '\'')||(LA68_1206 >= ',' && LA68_1206 <= '.')||(LA68_1206 >= '0' && LA68_1206 <= ';')||LA68_1206=='?'||(LA68_1206 >= 'A' && LA68_1206 <= 'L')||(LA68_1206 >= 'N' && LA68_1206 <= 'Z')||LA68_1206=='_'||(LA68_1206 >= 'a' && LA68_1206 <= 'd')||(LA68_1206 >= 'f' && LA68_1206 <= 'r')||(LA68_1206 >= 't' && LA68_1206 <= 'z')||LA68_1206=='\u2019') ) {s = 42;}
						else s = 1313;
						 
						input.seek(index68_1206);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA68_1044 = input.LA(1);
						 
						int index68_1044 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1044==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1044);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA68_1375 = input.LA(1);
						 
						int index68_1375 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1375==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1375);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA68_1288 = input.LA(1);
						 
						int index68_1288 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1288==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1288);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA68_622 = input.LA(1);
						 
						int index68_622 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_622==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_622);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA68_1036 = input.LA(1);
						 
						int index68_1036 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1036==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1036);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA68_1377 = input.LA(1);
						 
						int index68_1377 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1377==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1377);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA68_1000 = input.LA(1);
						 
						int index68_1000 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1000==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1000);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA68_604 = input.LA(1);
						 
						int index68_604 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_604=='s') ) {s = 504;}
						else if ( ((LA68_604 >= '\t' && LA68_604 <= '\n')||LA68_604=='\r'||LA68_604==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_604=='(') ) {s = 505;}
						else if ( (LA68_604=='M') ) {s = 506;}
						else if ( (LA68_604=='!'||(LA68_604 >= '&' && LA68_604 <= '\'')||(LA68_604 >= ',' && LA68_604 <= '.')||(LA68_604 >= '0' && LA68_604 <= ';')||LA68_604=='?'||(LA68_604 >= 'A' && LA68_604 <= 'L')||(LA68_604 >= 'N' && LA68_604 <= 'Z')||LA68_604=='_'||(LA68_604 >= 'a' && LA68_604 <= 'r')||(LA68_604 >= 't' && LA68_604 <= 'z')||LA68_604=='\u2019') ) {s = 42;}
						else s = 814;
						 
						input.seek(index68_604);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA68_1260 = input.LA(1);
						 
						int index68_1260 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1260==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1260);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA68_428 = input.LA(1);
						 
						int index68_428 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_428==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_428=='d') ) {s = 636;}
						else if ( (LA68_428=='m') ) {s = 637;}
						else s = 42;
						 
						input.seek(index68_428);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA68_530 = input.LA(1);
						 
						int index68_530 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_530==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_530);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA68_748 = input.LA(1);
						 
						int index68_748 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_748==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_748);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA68_1262 = input.LA(1);
						 
						int index68_1262 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1262==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1262);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA68_1639 = input.LA(1);
						 
						int index68_1639 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1639);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA68_1594 = input.LA(1);
						 
						int index68_1594 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1594);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA68_1588 = input.LA(1);
						 
						int index68_1588 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1588);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA68_1574 = input.LA(1);
						 
						int index68_1574 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1574);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA68_1572 = input.LA(1);
						 
						int index68_1572 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1572);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA68_1555 = input.LA(1);
						 
						int index68_1555 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1555);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA68_727 = input.LA(1);
						 
						int index68_727 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_727);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA68_708 = input.LA(1);
						 
						int index68_708 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_708);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA68_503 = input.LA(1);
						 
						int index68_503 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_503);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA68_814 = input.LA(1);
						 
						int index68_814 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_814);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA68_838 = input.LA(1);
						 
						int index68_838 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_838);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA68_840 = input.LA(1);
						 
						int index68_840 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_840);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA68_900 = input.LA(1);
						 
						int index68_900 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_900);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA68_935 = input.LA(1);
						 
						int index68_935 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_935);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA68_1015 = input.LA(1);
						 
						int index68_1015 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1015);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA68_1025 = input.LA(1);
						 
						int index68_1025 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1025);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA68_1027 = input.LA(1);
						 
						int index68_1027 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1027);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA68_1039 = input.LA(1);
						 
						int index68_1039 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1039);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA68_1062 = input.LA(1);
						 
						int index68_1062 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1062);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA68_1074 = input.LA(1);
						 
						int index68_1074 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1074);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA68_1116 = input.LA(1);
						 
						int index68_1116 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1116);
						if ( s>=0 ) return s;
						break;

					case 180 : 
						int LA68_1142 = input.LA(1);
						 
						int index68_1142 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1142);
						if ( s>=0 ) return s;
						break;

					case 181 : 
						int LA68_1161 = input.LA(1);
						 
						int index68_1161 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1161);
						if ( s>=0 ) return s;
						break;

					case 182 : 
						int LA68_1162 = input.LA(1);
						 
						int index68_1162 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1162);
						if ( s>=0 ) return s;
						break;

					case 183 : 
						int LA68_1178 = input.LA(1);
						 
						int index68_1178 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1178);
						if ( s>=0 ) return s;
						break;

					case 184 : 
						int LA68_1187 = input.LA(1);
						 
						int index68_1187 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1187);
						if ( s>=0 ) return s;
						break;

					case 185 : 
						int LA68_1202 = input.LA(1);
						 
						int index68_1202 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1202);
						if ( s>=0 ) return s;
						break;

					case 186 : 
						int LA68_1212 = input.LA(1);
						 
						int index68_1212 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1212);
						if ( s>=0 ) return s;
						break;

					case 187 : 
						int LA68_1216 = input.LA(1);
						 
						int index68_1216 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1216);
						if ( s>=0 ) return s;
						break;

					case 188 : 
						int LA68_1256 = input.LA(1);
						 
						int index68_1256 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1256);
						if ( s>=0 ) return s;
						break;

					case 189 : 
						int LA68_1261 = input.LA(1);
						 
						int index68_1261 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1261);
						if ( s>=0 ) return s;
						break;

					case 190 : 
						int LA68_1277 = input.LA(1);
						 
						int index68_1277 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1277);
						if ( s>=0 ) return s;
						break;

					case 191 : 
						int LA68_1299 = input.LA(1);
						 
						int index68_1299 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1299);
						if ( s>=0 ) return s;
						break;

					case 192 : 
						int LA68_1310 = input.LA(1);
						 
						int index68_1310 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1310);
						if ( s>=0 ) return s;
						break;

					case 193 : 
						int LA68_1313 = input.LA(1);
						 
						int index68_1313 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1313);
						if ( s>=0 ) return s;
						break;

					case 194 : 
						int LA68_1314 = input.LA(1);
						 
						int index68_1314 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1314);
						if ( s>=0 ) return s;
						break;

					case 195 : 
						int LA68_1315 = input.LA(1);
						 
						int index68_1315 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1315);
						if ( s>=0 ) return s;
						break;

					case 196 : 
						int LA68_1317 = input.LA(1);
						 
						int index68_1317 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1317);
						if ( s>=0 ) return s;
						break;

					case 197 : 
						int LA68_1354 = input.LA(1);
						 
						int index68_1354 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1354);
						if ( s>=0 ) return s;
						break;

					case 198 : 
						int LA68_1362 = input.LA(1);
						 
						int index68_1362 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1362);
						if ( s>=0 ) return s;
						break;

					case 199 : 
						int LA68_1383 = input.LA(1);
						 
						int index68_1383 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1383);
						if ( s>=0 ) return s;
						break;

					case 200 : 
						int LA68_1388 = input.LA(1);
						 
						int index68_1388 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1388);
						if ( s>=0 ) return s;
						break;

					case 201 : 
						int LA68_1390 = input.LA(1);
						 
						int index68_1390 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1390);
						if ( s>=0 ) return s;
						break;

					case 202 : 
						int LA68_1391 = input.LA(1);
						 
						int index68_1391 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1391);
						if ( s>=0 ) return s;
						break;

					case 203 : 
						int LA68_1394 = input.LA(1);
						 
						int index68_1394 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1394);
						if ( s>=0 ) return s;
						break;

					case 204 : 
						int LA68_1397 = input.LA(1);
						 
						int index68_1397 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1397);
						if ( s>=0 ) return s;
						break;

					case 205 : 
						int LA68_1444 = input.LA(1);
						 
						int index68_1444 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1444);
						if ( s>=0 ) return s;
						break;

					case 206 : 
						int LA68_1449 = input.LA(1);
						 
						int index68_1449 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1449);
						if ( s>=0 ) return s;
						break;

					case 207 : 
						int LA68_1454 = input.LA(1);
						 
						int index68_1454 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1454);
						if ( s>=0 ) return s;
						break;

					case 208 : 
						int LA68_1455 = input.LA(1);
						 
						int index68_1455 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1455);
						if ( s>=0 ) return s;
						break;

					case 209 : 
						int LA68_1456 = input.LA(1);
						 
						int index68_1456 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1456);
						if ( s>=0 ) return s;
						break;

					case 210 : 
						int LA68_1486 = input.LA(1);
						 
						int index68_1486 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1486);
						if ( s>=0 ) return s;
						break;

					case 211 : 
						int LA68_1487 = input.LA(1);
						 
						int index68_1487 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1487);
						if ( s>=0 ) return s;
						break;

					case 212 : 
						int LA68_1488 = input.LA(1);
						 
						int index68_1488 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1488);
						if ( s>=0 ) return s;
						break;

					case 213 : 
						int LA68_1493 = input.LA(1);
						 
						int index68_1493 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1493);
						if ( s>=0 ) return s;
						break;

					case 214 : 
						int LA68_1500 = input.LA(1);
						 
						int index68_1500 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1500);
						if ( s>=0 ) return s;
						break;

					case 215 : 
						int LA68_1528 = input.LA(1);
						 
						int index68_1528 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1528);
						if ( s>=0 ) return s;
						break;

					case 216 : 
						int LA68_533 = input.LA(1);
						 
						int index68_533 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_533==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_533);
						if ( s>=0 ) return s;
						break;

					case 217 : 
						int LA68_750 = input.LA(1);
						 
						int index68_750 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_750==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_750);
						if ( s>=0 ) return s;
						break;

					case 218 : 
						int LA68_534 = input.LA(1);
						 
						int index68_534 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_534==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_534);
						if ( s>=0 ) return s;
						break;

					case 219 : 
						int LA68_872 = input.LA(1);
						 
						int index68_872 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_872==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_872);
						if ( s>=0 ) return s;
						break;

					case 220 : 
						int LA68_1048 = input.LA(1);
						 
						int index68_1048 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1048==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1048);
						if ( s>=0 ) return s;
						break;

					case 221 : 
						int LA68_1127 = input.LA(1);
						 
						int index68_1127 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1127==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1127);
						if ( s>=0 ) return s;
						break;

					case 222 : 
						int LA68_1529 = input.LA(1);
						 
						int index68_1529 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1529=='s') ) {s = 504;}
						else if ( ((LA68_1529 >= '\t' && LA68_1529 <= '\n')||LA68_1529=='\r'||LA68_1529==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1529=='(') ) {s = 505;}
						else if ( (LA68_1529=='M') ) {s = 506;}
						else if ( (LA68_1529=='!'||(LA68_1529 >= '&' && LA68_1529 <= '\'')||(LA68_1529 >= ',' && LA68_1529 <= '.')||(LA68_1529 >= '0' && LA68_1529 <= ';')||LA68_1529=='?'||(LA68_1529 >= 'A' && LA68_1529 <= 'L')||(LA68_1529 >= 'N' && LA68_1529 <= 'Z')||LA68_1529=='_'||(LA68_1529 >= 'a' && LA68_1529 <= 'r')||(LA68_1529 >= 't' && LA68_1529 <= 'z')||LA68_1529=='\u2019') ) {s = 42;}
						else s = 1555;
						 
						input.seek(index68_1529);
						if ( s>=0 ) return s;
						break;

					case 223 : 
						int LA68_1126 = input.LA(1);
						 
						int index68_1126 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1126==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1126);
						if ( s>=0 ) return s;
						break;

					case 224 : 
						int LA68_1552 = input.LA(1);
						 
						int index68_1552 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1552==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1552);
						if ( s>=0 ) return s;
						break;

					case 225 : 
						int LA68_902 = input.LA(1);
						 
						int index68_902 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_902==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_902);
						if ( s>=0 ) return s;
						break;

					case 226 : 
						int LA68_1296 = input.LA(1);
						 
						int index68_1296 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1296=='s') ) {s = 504;}
						else if ( ((LA68_1296 >= '\t' && LA68_1296 <= '\n')||LA68_1296=='\r'||LA68_1296==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1296=='(') ) {s = 505;}
						else if ( (LA68_1296=='M') ) {s = 506;}
						else if ( (LA68_1296=='!'||(LA68_1296 >= '&' && LA68_1296 <= '\'')||(LA68_1296 >= ',' && LA68_1296 <= '.')||(LA68_1296 >= '0' && LA68_1296 <= ';')||LA68_1296=='?'||(LA68_1296 >= 'A' && LA68_1296 <= 'L')||(LA68_1296 >= 'N' && LA68_1296 <= 'Z')||LA68_1296=='_'||(LA68_1296 >= 'a' && LA68_1296 <= 'r')||(LA68_1296 >= 't' && LA68_1296 <= 'z')||LA68_1296=='\u2019') ) {s = 42;}
						else s = 1383;
						 
						input.seek(index68_1296);
						if ( s>=0 ) return s;
						break;

					case 227 : 
						int LA68_776 = input.LA(1);
						 
						int index68_776 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_776==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_776);
						if ( s>=0 ) return s;
						break;

					case 228 : 
						int LA68_655 = input.LA(1);
						 
						int index68_655 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_655==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_655=='s') ) {s = 861;}
						else s = 42;
						 
						input.seek(index68_655);
						if ( s>=0 ) return s;
						break;

					case 229 : 
						int LA68_1251 = input.LA(1);
						 
						int index68_1251 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1251==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1251);
						if ( s>=0 ) return s;
						break;

					case 230 : 
						int LA68_299 = input.LA(1);
						 
						int index68_299 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_299==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_299);
						if ( s>=0 ) return s;
						break;

					case 231 : 
						int LA68_1109 = input.LA(1);
						 
						int index68_1109 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1109==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1109);
						if ( s>=0 ) return s;
						break;

					case 232 : 
						int LA68_1359 = input.LA(1);
						 
						int index68_1359 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1359==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1359);
						if ( s>=0 ) return s;
						break;

					case 233 : 
						int LA68_1113 = input.LA(1);
						 
						int index68_1113 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1113==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1113);
						if ( s>=0 ) return s;
						break;

					case 234 : 
						int LA68_739 = input.LA(1);
						 
						int index68_739 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_739==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_739);
						if ( s>=0 ) return s;
						break;

					case 235 : 
						int LA68_823 = input.LA(1);
						 
						int index68_823 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_823=='s') ) {s = 504;}
						else if ( ((LA68_823 >= '\t' && LA68_823 <= '\n')||LA68_823=='\r'||LA68_823==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_823=='(') ) {s = 505;}
						else if ( (LA68_823=='M') ) {s = 506;}
						else if ( (LA68_823=='!'||(LA68_823 >= '&' && LA68_823 <= '\'')||(LA68_823 >= ',' && LA68_823 <= '.')||(LA68_823 >= '0' && LA68_823 <= ';')||LA68_823=='?'||(LA68_823 >= 'A' && LA68_823 <= 'L')||(LA68_823 >= 'N' && LA68_823 <= 'Z')||LA68_823=='_'||(LA68_823 >= 'a' && LA68_823 <= 'r')||(LA68_823 >= 't' && LA68_823 <= 'z')||LA68_823=='\u2019') ) {s = 42;}
						else s = 1015;
						 
						input.seek(index68_823);
						if ( s>=0 ) return s;
						break;

					case 236 : 
						int LA68_1014 = input.LA(1);
						 
						int index68_1014 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1014=='s') ) {s = 504;}
						else if ( ((LA68_1014 >= '\t' && LA68_1014 <= '\n')||LA68_1014=='\r'||LA68_1014==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1014=='(') ) {s = 505;}
						else if ( (LA68_1014=='M') ) {s = 506;}
						else if ( (LA68_1014=='!'||(LA68_1014 >= '&' && LA68_1014 <= '\'')||(LA68_1014 >= ',' && LA68_1014 <= '.')||(LA68_1014 >= '0' && LA68_1014 <= ';')||LA68_1014=='?'||(LA68_1014 >= 'A' && LA68_1014 <= 'L')||(LA68_1014 >= 'N' && LA68_1014 <= 'Z')||LA68_1014=='_'||(LA68_1014 >= 'a' && LA68_1014 <= 'r')||(LA68_1014 >= 't' && LA68_1014 <= 'z')||LA68_1014=='\u2019') ) {s = 42;}
						else s = 1178;
						 
						input.seek(index68_1014);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 68, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
