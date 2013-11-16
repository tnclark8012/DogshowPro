// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-11-15 21:57:36

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
	public static final int FRAG_BREED_NAME_ALT=13;
	public static final int FRAG_BREED_NAME_CATEGORY=14;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=15;
	public static final int FRAG_BREED_NAME_SINGLE=16;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=17;
	public static final int FRAG_ENDING_ANNOUNCEMENT=18;
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
	public static final int GROUP_RING=35;
	public static final int INT=36;
	public static final int JUDGE_NAME=37;
	public static final int JUNIOR_CLASS=38;
	public static final int NON_CONFORMATION_CLASS_LEVEL=39;
	public static final int NON_CONFORMATION_CLASS_NAME=40;
	public static final int NON_CONFORMATION_CLASS_SECTION=41;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=42;
	public static final int NON_CONFORMATION_SECOND_LINE=43;
	public static final int NON_CONF_SECOND_LINE_COMMENT=44;
	public static final int PARENTHETICAL=45;
	public static final int PARENTHETICAL_INT=46;
	public static final int PARENTHETICAL_NAME=47;
	public static final int PHONE_NUMBER=48;
	public static final int RALLY_CLASS=49;
	public static final int RALLY_ENTRY=50;
	public static final int RING_TITLE=51;
	public static final int SPECIAL_SUFFIX=52;
	public static final int STANDALONE_COMMENT=53;
	public static final int TIME=54;
	public static final int WORD=55;
	public static final int WS=56;

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

	// $ANTLR start "FRAG_GROUP_NAME"
	public final void mFRAG_GROUP_NAME() throws RecognitionException {
		try {
			int _type = FRAG_GROUP_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:2: ({...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:3: {...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
			{
			if ( !((allowGroup)) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "FRAG_GROUP_NAME", "allowGroup");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:18: ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
			int alt16=8;
			switch ( input.LA(1) ) {
			case 'H':
				{
				int LA16_1 = input.LA(2);
				if ( (LA16_1=='E') ) {
					alt16=1;
				}
				else if ( (LA16_1=='O') ) {
					alt16=6;
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
			case 'T':
				{
				int LA16_2 = input.LA(2);
				if ( (LA16_2=='E') ) {
					alt16=2;
				}
				else if ( (LA16_2=='O') ) {
					alt16=5;
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
				alt16=3;
				}
				break;
			case 'S':
				{
				alt16=4;
				}
				break;
			case 'W':
				{
				alt16=7;
				}
				break;
			case 'B':
				{
				alt16=8;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:20: 'HERDING GROUP'
					{
					match("HERDING GROUP"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:3: 'TERRIER GROUP'
					{
					match("TERRIER GROUP"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:503:3: 'NON-SPORTING GROUP'
					{
					match("NON-SPORTING GROUP"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:504:3: 'SPORTING GROUP'
					{
					match("SPORTING GROUP"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:3: 'TOY GROUP'
					{
					match("TOY GROUP"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:506:3: 'HOUND GROUP'
					{
					match("HOUND GROUP"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:507:3: 'WORKING GROUP'
					{
					match("WORKING GROUP"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:508:3: ( 'BEST IN SHOW' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:508:3: ( 'BEST IN SHOW' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:508:4: 'BEST IN SHOW'
					{
					match("BEST IN SHOW"); if (state.failed) return ;

					if ( state.backtracking==0 ) {allowGroup=false;}
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
	// $ANTLR end "FRAG_GROUP_NAME"

	// $ANTLR start "FRAG_SPECIAL_GROUP_NAME"
	public final void mFRAG_SPECIAL_GROUP_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:511:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:512:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:513:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:514:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:515:3: 'Toy Variety Group'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:518:2: ( ( FRAG_GROUP_NAME ' - ' JUDGE_NAME ) | FRAG_SPECIAL_GROUP_NAME )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='B'||LA18_0=='H'||LA18_0=='N'||LA18_0=='W') && ((allowGroup))) {
				alt18=1;
			}
			else if ( (LA18_0=='T') ) {
				int LA18_2 = input.LA(2);
				if ( (LA18_2=='E'||LA18_2=='O') && ((allowGroup))) {
					alt18=1;
				}
				else if ( (LA18_2=='o') ) {
					alt18=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
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
			else if ( (LA18_0=='S') ) {
				int LA18_3 = input.LA(2);
				if ( (LA18_3=='P') && ((allowGroup))) {
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
			else if ( (LA18_0=='R'||LA18_0=='V') ) {
				alt18=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:518:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:518:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:518:5: FRAG_GROUP_NAME ' - ' JUDGE_NAME
					{
					mFRAG_GROUP_NAME(); if (state.failed) return ;

					match(" - "); if (state.failed) return ;

					mJUDGE_NAME(); if (state.failed) return ;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:518:39: FRAG_SPECIAL_GROUP_NAME
					{
					mFRAG_SPECIAL_GROUP_NAME(); if (state.failed) return ;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:536:29: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:2: NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			{
			mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:31: ( ' ' NON_CONFORMATION_CLASS_LEVEL )*
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:32: ' ' NON_CONFORMATION_CLASS_LEVEL
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_LEVEL(); if (state.failed) return ;

					}
					break;

				default :
					break loop19;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:66: ( ' ' NON_CONFORMATION_CLASS_SECTION )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:67: ' ' NON_CONFORMATION_CLASS_SECTION
					{
					match(' '); if (state.failed) return ;
					mNON_CONFORMATION_CLASS_SECTION(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:103: ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==' ') ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:537:104: ' ' NON_CONFORMATION_CLASS_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:556:2: ( ( 'A' | 'B' ) )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:558:2: ( 'Class' | 'Walkthrough' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:558:4: 'Class'
					{
					match("Class"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:558:12: 'Walkthrough'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:560:2: ( 'Advanced' | 'Beginner' | 'Excellent' | 'Utility' | 'Pre' | 'Open' | 'Novice' | 'Wild Card' | ( 'Pair' ( 's' )? ) | 'Graduate' | 'Walkthrough' | 'Versatility' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:561:2: 'Advanced'
					{
					match("Advanced"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:562:2: 'Beginner'
					{
					match("Beginner"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:2: 'Excellent'
					{
					match("Excellent"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:564:2: 'Utility'
					{
					match("Utility"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:565:2: 'Pre'
					{
					match("Pre"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:2: 'Open'
					{
					match("Open"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:567:2: 'Novice'
					{
					match("Novice"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:568:2: 'Wild Card'
					{
					match("Wild Card"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:2: ( 'Pair' ( 's' )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:2: ( 'Pair' ( 's' )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:3: 'Pair' ( 's' )?
					{
					match("Pair"); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:9: ( 's' )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0=='s') ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:9: 's'
							{
							match('s'); if (state.failed) return ;
							}
							break;

					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:570:2: 'Graduate'
					{
					match("Graduate"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:571:2: 'Walkthrough'
					{
					match("Walkthrough"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:572:2: 'Versatility'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:577:2: ( FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:578:3: FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			{
			mFRAG_TO_FOLLOW(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:578:21: ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:578:22: NON_CONFORMATION_CLASS_NAME
					{
					mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:578:50: RALLY_CLASS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:580:2: ( 'To follow' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:580:4: 'To follow'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:2: ( FRAG_RALLY_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:4: FRAG_RALLY_CLASS_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:584:2: ( 'Rally ' NON_CONFORMATION_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:584:4: 'Rally ' NON_CONFORMATION_CLASS_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:586:2: ( 'Walkthrough' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:586:4: 'Walkthrough'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:588:2: ( ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:588:4: ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:588:4: ( 'inch: ' )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='i') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:588:4: 'inch: '
					{
					match("inch: "); if (state.failed) return ;

					}
					break;

			}

			mFRAG_RALLY_ENTRANT_GROUP(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:588:39: ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			loop27:
			do {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==';') ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:588:40: ';' FRAG_RALLY_ENTRANT_GROUP
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:29: ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) )
			int alt37=2;
			alt37 = dfa37.predict(input);
			switch (alt37) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:31: ( '0' .. '9' )+ '-' ( '0' .. '9' )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:31: ( '0' .. '9' )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:43: ( '0' .. '9' )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:55: ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:55: ( '0' .. '9' )+
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:64: ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:65: ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:65: ( '-' ( '0' .. '9' )+ )?
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0=='-') ) {
								alt32=1;
							}
							switch (alt32) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:66: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:69: ( '0' .. '9' )+
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

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:80: ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:81: ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )?
							{
							match(';'); if (state.failed) return ;
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:84: ( '0' .. '9' )+
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

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:93: ( '-' ( '0' .. '9' )+ )?
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
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:94: '-' ( '0' .. '9' )+
									{
									match('-'); if (state.failed) return ;
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:596:97: ( '0' .. '9' )+
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:599:2: ( 'R' ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:599:4: 'R' ( '0' .. '9' )+
			{
			match('R'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:599:7: ( '0' .. '9' )+
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:34: ( FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:2: FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			{
			mFRAG_RALLY_SINGLE_ENTRANT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:28: ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			loop39:
			do {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( ((LA39_0 >= ',' && LA39_0 <= '-')) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:29: ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:27: 'January'
					{
					match("January"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:37: 'JANUARY'
					{
					match("JANUARY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:14: 'February'
					{
					match("February"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:25: 'FEBRUARY'
					{
					match("FEBRUARY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:14: 'March'
					{
					match("March"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:22: 'MARCH'
					{
					match("MARCH"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:14: 'April'
					{
					match("April"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:22: 'APRIL'
					{
					match("APRIL"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:14: 'May'
					{
					match("May"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:20: 'MAY'
					{
					match("MAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:609:14: 'June'
					{
					match("June"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:609:21: 'JUNE'
					{
					match("JUNE"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:14: 'July'
					{
					match("July"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:21: 'JULY'
					{
					match("JULY"); if (state.failed) return ;

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:14: 'August'
					{
					match("August"); if (state.failed) return ;

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:23: 'AUGUST'
					{
					match("AUGUST"); if (state.failed) return ;

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:14: 'September'
					{
					match("September"); if (state.failed) return ;

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); if (state.failed) return ;

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:613:14: 'October'
					{
					match("October"); if (state.failed) return ;

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:613:24: 'OCTOBER'
					{
					match("OCTOBER"); if (state.failed) return ;

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:614:14: 'November'
					{
					match("November"); if (state.failed) return ;

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:614:25: 'NOVEMBER'
					{
					match("NOVEMBER"); if (state.failed) return ;

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:14: 'December'
					{
					match("December"); if (state.failed) return ;

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:25: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:617:29: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:25: ( 'RING' | 'Ring' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:29: 'RING'
					{
					match("RING"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:619:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:5: ( 'am' | 'pm' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:9: 'am'
					{
					match("am"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:9: 'MR'
					{
					match("MR"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:14: 'Mr'
					{
					match("Mr"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:9: 'MRS'
					{
					match("MRS"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:15: 'Mrs'
					{
					match("Mrs"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:9: 'MS'
					{
					match("MS"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:14: 'Ms'
					{
					match("Ms"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:631:9: 'MISS'
					{
					match("MISS"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:631:16: 'Miss'
					{
					match("Miss"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:632:10: 'DR'
					{
					match("DR"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:632:15: 'Dr'
					{
					match("Dr"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:9: 'COL'
					{
					match("COL"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:27: 'Sunday'
					{
					match("Sunday"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:36: 'SUNDAY'
					{
					match("SUNDAY"); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:637:9: 'Monday'
					{
					match("Monday"); if (state.failed) return ;

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:637:18: 'MONDAY'
					{
					match("MONDAY"); if (state.failed) return ;

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:638:9: 'Tuesday'
					{
					match("Tuesday"); if (state.failed) return ;

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:638:19: 'TUESDAY'
					{
					match("TUESDAY"); if (state.failed) return ;

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:639:9: 'Wednesday'
					{
					match("Wednesday"); if (state.failed) return ;

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:639:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); if (state.failed) return ;

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:640:9: 'Thursday'
					{
					match("Thursday"); if (state.failed) return ;

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:640:20: 'THURSDAY'
					{
					match("THURSDAY"); if (state.failed) return ;

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:641:9: 'Friday'
					{
					match("Friday"); if (state.failed) return ;

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:641:18: 'FRIDAY'
					{
					match("FRIDAY"); if (state.failed) return ;

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:642:9: 'Saturday'
					{
					match("Saturday"); if (state.failed) return ;

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:642:20: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:9: 'LUNCH'
					{
					match("LUNCH"); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:17: 'VARIETY GROUP JUDGING'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:656:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:656:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); if (state.failed) return ;

			mWS(); if (state.failed) return ;

			mFRAG_PROPER_NAME(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); if (state.failed) return ;
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:66: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:85: FRAG_PROPER_NAME
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

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:106: ( WS )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( ((LA48_0 >= '\t' && LA48_0 <= '\n')||LA48_0=='\r'||LA48_0==' ') ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:106: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:110: ( PARENTHETICAL_INT )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0=='(') ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:110: PARENTHETICAL_INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:13: ( ( 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0=='G') ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:18: 'GROUP RING'
					{
					match("GROUP RING"); if (state.failed) return ;

					if ( state.backtracking==0 ) {allowGroup=true;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:49: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:49: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:662:50: 'RING' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			{
			match('('); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			matchRange('0','9'); if (state.failed) return ;
			match(')'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:6: ( ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' | ()=>)
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( ((LA53_0 >= '\t' && LA53_0 <= '\n')||LA53_0=='\r'||LA53_0==' ') && (synpred1_test())) {
				alt53=1;
			}
			else if ( ((LA53_0 >= '0' && LA53_0 <= '9')) && (synpred1_test())) {
				alt53=1;
			}
			else {
				alt53=2;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )=> ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:83: ( WS )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( ((LA52_0 >= '\t' && LA52_0 <= '\n')||LA52_0=='\r'||LA52_0==' ') ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:83: WS
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:667:8: ()=>
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:13: INT ':' INT WS FRAG_TIME_LABEL
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:670:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:670:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:13: ( '.' )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:13: '.'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:6: ( '0' .. '9' )+
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:13: ( WORD | INT | FRAG_PROPER_NAME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:14: WORD
					{
					mWORD(); if (state.failed) return ;

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:19: INT
					{
					mINT(); if (state.failed) return ;

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); if (state.failed) return ;

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( ((LA58_0 >= '\t' && LA58_0 <= '\n')||LA58_0=='\r'||LA58_0==' ') ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); if (state.failed) return ;

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:45: ( WORD | INT | FRAG_PROPER_NAME )
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:46: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:55: FRAG_PROPER_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
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

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:94: ( END_PUNCTUATION )?
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:681:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:681:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:681:13: ( WS )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( ((LA61_0 >= '\t' && LA61_0 <= '\n')||LA61_0=='\r'||LA61_0==' ') ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:681:13: WS
					{
					mWS(); if (state.failed) return ;

					}
					break;

			}

			mINT(); if (state.failed) return ;

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:681:21: ( WS )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( ((LA62_0 >= '\t' && LA62_0 <= '\n')||LA62_0=='\r'||LA62_0==' ') ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:681:21: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:682:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:682:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:682:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
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

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:682:65: ( END_PUNCTUATION )?
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); if (state.failed) return ;

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:32: WORD
							{
							mWORD(); if (state.failed) return ;

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:37: PARENTHETICAL
							{
							mPARENTHETICAL(); if (state.failed) return ;

							}
							break;
						case 4 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:51: INT
							{
							mINT(); if (state.failed) return ;

							}
							break;
						case 5 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:55: ELLIPSIS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:685:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:685:4: WORD END_PUNCTUATION
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

	// $ANTLR start "FRAG_ENDING_ANNOUNCEMENT"
	public final void mFRAG_ENDING_ANNOUNCEMENT() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:686:34: ( 'Unless otherwise announced' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:686:35: 'Unless otherwise announced'
			{
			match("Unless otherwise announced"); if (state.failed) return ;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAG_ENDING_ANNOUNCEMENT"

	// $ANTLR start "PARENTHETICAL_NAME"
	public final void mPARENTHETICAL_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:687:28: ( '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:687:30: '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')'
			{
			match('('); if (state.failed) return ;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:687:34: ( FRAG_TITLE WS )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:687:35: FRAG_TITLE WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:693:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:693:6: .
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | FRAG_GROUP_NAME | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough )
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:49: FRAG_GROUP_NAME
				{
				mFRAG_GROUP_NAME(); if (state.failed) return ;

				}
				break;
			case 5 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:65: GROUP_RING
				{
				mGROUP_RING(); if (state.failed) return ;

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:76: NON_CONFORMATION_CLASS_NAME
				{
				mNON_CONFORMATION_CLASS_NAME(); if (state.failed) return ;

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:104: NON_CONF_SECOND_LINE_COMMENT
				{
				mNON_CONF_SECOND_LINE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:133: RALLY_CLASS
				{
				mRALLY_CLASS(); if (state.failed) return ;

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:145: RALLY_ENTRY
				{
				mRALLY_ENTRY(); if (state.failed) return ;

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:157: NON_CONFORMATION_SECOND_LINE
				{
				mNON_CONFORMATION_SECOND_LINE(); if (state.failed) return ;

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:186: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); if (state.failed) return ;

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:205: BREED_COUNT
				{
				mBREED_COUNT(); if (state.failed) return ;

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:217: JUDGE_NAME
				{
				mJUDGE_NAME(); if (state.failed) return ;

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:228: WS
				{
				mWS(); if (state.failed) return ;

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:231: RING_TITLE
				{
				mRING_TITLE(); if (state.failed) return ;

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:242: PHONE_NUMBER
				{
				mPHONE_NUMBER(); if (state.failed) return ;

				}
				break;
			case 17 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:255: TIME
				{
				mTIME(); if (state.failed) return ;

				}
				break;
			case 18 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:260: DATE
				{
				mDATE(); if (state.failed) return ;

				}
				break;
			case 19 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:265: ELLIPSIS
				{
				mELLIPSIS(); if (state.failed) return ;

				}
				break;
			case 20 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:274: INT
				{
				mINT(); if (state.failed) return ;

				}
				break;
			case 21 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:278: PARENTHETICAL
				{
				mPARENTHETICAL(); if (state.failed) return ;

				}
				break;
			case 22 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:292: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); if (state.failed) return ;

				}
				break;
			case 23 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:310: COMMENT
				{
				mCOMMENT(); if (state.failed) return ;

				}
				break;
			case 24 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:318: FallThrough
				{
				mFallThrough(); if (state.failed) return ;

				}
				break;

		}
	}

	// $ANTLR start synpred1_test
	public final void synpred1_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:8: ( ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:9: ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:9: ( WS )?
		int alt69=2;
		int LA69_0 = input.LA(1);
		if ( ((LA69_0 >= '\t' && LA69_0 <= '\n')||LA69_0=='\r'||LA69_0==' ') ) {
			alt69=1;
		}
		switch (alt69) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:666:9: WS
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:667:8: ()
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:667:9: 
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
			return "596:1: NON_CONFORMATION_SECOND_LINE : ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) );";
		}
	}

	static final String DFA68_eotS =
		"\1\uffff\31\52\1\u00a5\1\uffff\1\40\1\u00ac\3\uffff\11\52\1\uffff\76\52"+
		"\1\uffff\21\52\1\u0133\47\52\1\u00a5\1\52\1\uffff\1\52\6\uffff\1\u00ac"+
		"\6\52\1\uffff\161\52\1\u01f5\2\52\1\u01fb\11\52\1\uffff\34\52\1\uffff"+
		"\32\52\2\u023d\1\52\2\uffff\1\u0245\2\uffff\1\u0245\2\uffff\10\52\1\u01fb"+
		"\153\52\1\u01fb\12\52\1\uffff\1\u02c2\1\uffff\1\52\1\u02d5\1\52\1\uffff"+
		"\46\52\1\uffff\2\52\1\uffff\27\52\1\uffff\2\52\6\uffff\7\52\1\uffff\13"+
		"\52\1\u032d\30\52\1\u0345\1\52\1\u0347\6\52\1\uffff\24\52\1\u0360\43\52"+
		"\1\u037e\2\52\1\u01fb\4\52\1\u0385\5\52\21\uffff\1\52\1\u03a8\1\uffff"+
		"\10\52\1\uffff\2\u0133\31\52\1\uffff\2\52\1\uffff\26\52\1\u023d\1\u03e0"+
		"\4\uffff\7\52\1\uffff\1\52\1\u01fb\11\52\1\uffff\10\52\1\u03f8\13\52\1"+
		"\u0402\2\52\1\uffff\1\52\1\uffff\1\u0404\4\52\1\uffff\11\52\1\u0411\10"+
		"\52\1\uffff\20\52\1\uffff\6\52\1\u0429\5\52\1\uffff\6\52\1\uffff\3\52"+
		"\1\u0435\1\52\34\uffff\1\52\1\uffff\1\52\1\uffff\7\52\1\u045f\27\52\1"+
		"\uffff\4\52\1\u047a\20\52\1\uffff\1\52\1\u048c\1\u048d\4\52\1\uffff\16"+
		"\52\1\u049d\1\uffff\11\52\1\uffff\1\52\1\uffff\2\52\1\u04a6\1\52\1\uffff"+
		"\7\52\1\uffff\6\52\1\u0360\6\52\1\u04b6\2\52\1\uffff\6\52\1\uffff\4\52"+
		"\1\u04c2\4\52\1\u04c6\1\52\1\uffff\1\52\37\uffff\11\52\1\uffff\1\u04ee"+
		"\4\52\1\u04f3\17\52\1\uffff\4\52\1\uffff\6\52\1\u0505\6\52\1\u01fb\1\u050c"+
		"\2\52\2\uffff\2\52\1\uffff\13\52\1\u01fb\1\uffff\2\52\1\u01fb\3\52\1\u051c"+
		"\1\52\1\uffff\1\52\1\uffff\14\52\1\u01fb\1\uffff\1\u0528\2\uffff\2\52"+
		"\1\u052d\1\u052e\1\u052f\3\52\1\uffff\1\u0531\2\52\1\uffff\2\52\33\uffff"+
		"\1\u0556\3\uffff\5\52\1\u0133\1\uffff\4\52\1\uffff\2\52\1\u055e\6\52\2"+
		"\uffff\2\52\1\u0360\3\52\1\uffff\1\52\1\uffff\4\52\1\uffff\14\52\1\u0577"+
		"\2\52\1\uffff\1\52\1\uffff\1\52\1\u057d\1\52\1\u057f\1\u0580\1\52\1\u01fb"+
		"\1\52\1\u0583\3\uffff\2\52\3\uffff\1\52\1\uffff\1\u0588\2\52\34\uffff"+
		"\3\52\1\uffff\1\52\4\uffff\4\52\1\uffff\2\52\1\uffff\1\52\1\uffff\1\u05b3"+
		"\4\52\1\uffff\6\52\1\u05bc\6\52\1\uffff\1\52\1\u05c1\1\52\1\uffff\1\52"+
		"\1\uffff\1\52\2\uffff\2\52\3\uffff\1\u05c9\1\u05ca\1\uffff\1\u05cb\1\52"+
		"\32\uffff\3\52\3\uffff\1\u05e9\1\u05ea\1\u05eb\2\52\1\uffff\1\52\3\uffff"+
		"\1\52\1\u05f2\1\52\1\uffff\3\52\1\uffff\4\52\1\uffff\1\u05fa\1\uffff\3"+
		"\52\1\uffff\1\u05b3\32\uffff\3\52\6\uffff\1\52\1\u0360\1\uffff\1\52\1"+
		"\uffff\1\u01fb\2\uffff\1\u01fb\2\52\1\u061c\2\52\1\uffff\1\u05b3\1\52"+
		"\23\uffff\3\52\2\uffff\1\52\4\uffff\2\52\2\uffff\1\u063d\1\u05b3\21\uffff"+
		"\1\u064e\1\52\1\u0650\2\uffff\1\52\1\uffff\2\u05b3\1\52\1\u03e0\16\uffff"+
		"\1\u0660\4\uffff\1\52\3\uffff\1\u05b3\1\u0666\17\uffff\1\52\15\uffff\1"+
		"\52\13\uffff\1\52\1\uffff\1\u05b3\10\uffff\1\52\6\uffff\1\u0696\24\uffff";
	static final String DFA68_eofS =
		"\u06a5\uffff";
	static final String DFA68_minS =
		"\1\0\1\111\1\154\1\117\1\144\1\105\1\117\1\122\1\156\2\122\1\105\1\142"+
		"\1\141\1\145\1\125\1\141\1\60\1\101\1\105\1\101\1\105\2\157\1\164\1\156"+
		"\1\46\1\uffff\1\11\1\46\3\uffff\1\154\1\156\4\11\1\123\1\156\1\116\1\uffff"+
		"\1\145\1\144\1\164\1\162\1\141\1\116\1\146\1\162\1\151\1\141\1\145\1\141"+
		"\1\160\1\163\1\166\1\163\1\141\1\143\1\141\1\162\1\141\1\154\1\123\1\151"+
		"\1\163\1\145\1\162\1\165\1\143\1\162\1\114\1\143\1\142\2\11\1\147\1\143"+
		"\1\145\1\141\1\170\1\145\1\111\1\162\1\141\1\145\1\154\1\141\1\117\1\162"+
		"\1\122\1\125\1\151\1\145\1\151\1\141\1\160\1\145\1\155\1\166\1\142\1\157"+
		"\1\141\1\uffff\1\167\1\116\1\151\1\153\1\141\1\157\1\151\1\147\1\162\1"+
		"\145\1\154\1\144\1\157\1\164\1\163\1\107\1\116\1\46\1\151\1\150\1\141"+
		"\1\145\1\142\1\171\1\146\2\141\1\156\1\145\1\117\1\105\1\116\1\124\1\142"+
		"\1\40\1\145\1\122\1\131\1\145\1\105\1\165\1\125\1\172\1\162\1\124\1\122"+
		"\1\144\1\151\1\154\1\122\1\154\1\104\1\154\1\162\1\151\1\143\1\60\1\46"+
		"\1\60\1\uffff\1\60\1\uffff\3\11\2\uffff\1\46\2\164\1\143\1\151\1\163\1"+
		"\11\1\uffff\1\11\1\123\1\144\1\104\1\156\1\40\1\145\1\141\1\146\1\160"+
		"\1\146\1\55\1\145\1\150\1\145\1\164\1\163\1\162\1\164\1\145\1\164\1\141"+
		"\1\145\1\147\1\154\2\147\1\151\1\150\1\143\1\157\1\145\1\144\1\164\1\166"+
		"\1\145\1\153\1\143\1\141\1\163\1\157\1\154\1\124\1\162\1\141\1\144\1\141"+
		"\1\153\1\163\1\150\1\167\1\156\1\155\1\153\1\11\1\154\1\11\1\150\1\155"+
		"\1\144\1\145\1\157\2\154\1\145\1\154\1\156\1\164\1\40\1\156\1\144\1\104"+
		"\1\155\2\156\2\144\1\141\1\144\1\125\1\162\1\141\1\104\1\116\1\172\1\154"+
		"\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\157\1\145\1\156\1\163"+
		"\1\143\1\103\1\151\1\163\1\162\1\151\1\142\1\151\1\162\1\164\1\156\1\151"+
		"\1\145\1\144\1\164\1\11\1\151\1\145\1\41\1\40\1\154\1\142\1\162\1\144"+
		"\1\164\1\163\1\125\1\107\1\uffff\2\122\1\156\1\165\1\157\1\165\1\151\1"+
		"\164\1\154\2\164\1\142\1\145\1\153\1\145\1\164\2\156\1\146\1\163\2\144"+
		"\1\122\1\105\1\104\1\125\1\145\1\40\1\uffff\1\145\1\122\1\40\1\163\1\123"+
		"\1\162\1\122\1\163\1\145\1\163\1\105\1\111\1\155\1\163\1\164\1\156\1\160"+
		"\1\145\1\144\1\113\1\153\1\116\1\157\1\153\1\154\1\150\2\46\3\11\1\46"+
		"\2\11\1\46\2\11\2\145\1\150\1\141\2\11\1\141\1\101\1\40\1\162\1\143\1"+
		"\40\1\157\1\145\2\157\1\123\1\156\1\141\1\144\1\141\1\153\1\151\1\157"+
		"\1\156\1\162\2\156\1\145\1\154\1\144\1\143\2\151\2\145\1\156\1\157\1\153"+
		"\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163\1\144"+
		"\2\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\145"+
		"\1\142\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\40\1\145\1\151\1\145"+
		"\1\151\1\154\1\144\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145"+
		"\1\157\1\164\1\150\1\165\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151"+
		"\1\156\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110"+
		"\1\154\1\157\1\41\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165"+
		"\1\0\1\11\1\46\1\151\1\11\1\156\1\uffff\1\171\1\157\1\151\1\145\1\167"+
		"\1\145\1\114\1\11\2\60\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\145"+
		"\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145\1\141"+
		"\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\106\1\151\1\111\1\107\1\144"+
		"\1\104\1\163\1\123\1\154\1\162\1\141\1\122\1\105\1\141\1\150\1\40\1\145"+
		"\1\160\2\40\1\111\1\164\1\105\1\151\1\163\1\151\1\72\1\uffff\2\60\1\uffff"+
		"\4\11\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1\131\1\101\1\150\1"+
		"\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156\1\141\1\11\1\141"+
		"\1\143\1\154\1\172\1\141\1\143\1\152\1\164\3\145\1\156\1\141\1\162\1\163"+
		"\2\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\11\1\156\1\11\1\144"+
		"\1\141\1\145\1\40\1\157\1\141\1\111\1\40\1\156\1\147\1\151\1\40\1\160"+
		"\1\141\1\163\1\143\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\1\40"+
		"\1\163\1\142\1\41\1\145\1\154\1\40\1\163\1\103\1\150\1\171\1\131\1\156"+
		"\1\40\2\156\1\40\1\157\1\141\1\40\2\145\1\116\1\40\2\156\1\40\1\141\1"+
		"\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145\1\40\1\145\1\41\1"+
		"\154\1\156\1\41\1\147\1\157\1\40\1\157\1\11\1\145\1\150\1\141\1\145\1"+
		"\147\1\0\20\11\1\163\1\11\1\0\1\145\1\40\1\156\1\145\1\163\1\145\1\154"+
		"\1\101\1\uffff\2\46\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141"+
		"\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\111\1\123"+
		"\1\131\1\104\1\141\1\uffff\1\156\1\105\1\122\1\141\1\101\1\144\1\104\2"+
		"\141\1\164\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\150\1\123"+
		"\1\164\1\150\1\164\1\40\1\55\2\46\4\11\1\40\1\146\1\145\1\163\1\165\2"+
		"\54\1\uffff\1\157\1\40\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40"+
		"\1\154\1\0\1\156\1\141\1\151\1\145\1\154\1\145\1\151\1\40\1\11\1\144\1"+
		"\162\1\147\1\156\1\40\2\145\1\40\1\157\1\143\1\40\1\11\1\40\1\162\1\0"+
		"\1\40\1\0\1\11\1\156\1\154\1\147\1\163\1\116\1\40\1\141\2\145\1\150\1"+
		"\145\1\157\1\162\1\40\1\11\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165"+
		"\1\uffff\1\163\1\145\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162"+
		"\1\163\2\107\1\40\1\144\1\156\1\163\1\156\1\157\1\11\2\157\1\156\1\162"+
		"\1\156\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156"+
		"\1\11\1\165\34\11\1\143\1\0\1\141\1\uffff\1\145\1\166\2\151\1\154\2\122"+
		"\1\11\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162"+
		"\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\117"+
		"\1\171\1\131\1\141\1\101\1\11\1\156\1\151\1\116\1\131\1\141\1\144\1\164"+
		"\1\151\1\107\1\162\1\104\1\172\1\151\1\171\2\60\1\uffff\1\60\2\11\1\164"+
		"\1\162\1\11\1\165\1\101\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145"+
		"\1\40\1\156\1\141\1\154\1\151\1\144\1\11\1\0\1\40\1\157\1\164\2\40\1\162"+
		"\1\40\1\165\1\153\1\0\1\40\1\0\1\171\1\163\1\11\1\164\1\40\1\156\1\162"+
		"\1\141\1\165\3\40\1\0\1\157\1\156\1\141\1\156\1\40\1\143\1\41\1\156\1"+
		"\40\1\141\1\40\1\156\1\145\1\11\1\145\1\40\1\122\1\151\1\40\1\145\1\144"+
		"\1\162\1\153\1\0\1\162\1\40\1\144\1\147\1\11\1\156\1\163\1\145\1\40\1"+
		"\11\1\151\1\0\1\145\37\11\1\56\1\156\1\40\1\145\1\141\1\154\2\40\1\60"+
		"\1\0\1\11\1\171\1\162\1\150\1\155\1\11\1\144\1\156\1\163\2\40\2\144\1"+
		"\40\1\141\1\107\1\101\1\131\3\40\1\125\2\54\1\171\1\131\1\0\1\40\1\154"+
		"\2\40\1\156\1\141\1\11\1\162\1\40\1\157\1\101\1\143\1\162\1\41\1\46\2"+
		"\60\2\0\2\145\1\uffff\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1\154\1"+
		"\141\1\41\1\0\1\156\1\157\1\41\1\156\2\40\1\11\1\40\1\0\1\151\1\123\2"+
		"\40\1\153\2\141\1\144\1\156\1\40\1\150\2\164\1\144\1\41\1\0\1\11\1\107"+
		"\1\117\1\143\1\40\3\11\2\40\1\145\1\0\1\11\1\145\1\40\1\0\1\141\1\163"+
		"\37\11\2\40\1\162\1\156\1\145\1\46\1\0\1\54\1\153\2\40\1\0\2\40\1\11\1"+
		"\163\1\40\1\153\1\40\1\113\1\54\1\107\1\120\2\54\1\41\1\151\1\145\1\171"+
		"\1\0\1\145\1\107\1\165\1\131\1\165\1\145\1\uffff\1\55\1\162\1\40\1\144"+
		"\1\40\1\156\1\141\1\111\1\143\1\40\1\145\1\156\1\11\1\156\1\144\1\0\1"+
		"\146\1\110\1\145\1\11\1\164\2\11\1\145\1\41\1\145\1\11\1\0\1\122\1\125"+
		"\1\40\1\156\3\0\1\162\1\0\1\11\1\156\1\145\34\11\1\163\1\141\1\154\1\46"+
		"\1\151\1\0\3\11\1\163\1\40\1\162\1\145\1\0\1\150\1\145\1\107\1\105\1\122"+
		"\1\40\1\164\1\162\1\54\1\144\1\122\1\147\1\54\1\151\1\40\1\60\1\40\1\11"+
		"\1\40\1\156\1\116\1\150\1\162\1\40\1\0\1\40\1\11\1\146\1\117\1\40\1\0"+
		"\1\145\2\0\1\162\1\144\1\0\1\117\1\120\2\11\1\0\1\11\1\40\32\11\1\143"+
		"\1\162\1\141\6\11\1\151\1\163\1\122\1\123\1\117\2\uffff\1\171\1\11\1\40"+
		"\1\117\1\150\1\156\1\60\1\0\1\144\1\107\1\145\1\40\1\0\1\11\1\127\1\144"+
		"\2\40\1\125\1\40\3\0\27\11\1\157\1\164\1\143\3\11\3\0\1\162\1\41\1\117"+
		"\1\40\1\125\1\41\1\0\1\125\1\41\1\164\1\60\1\11\1\40\1\162\1\0\2\40\1"+
		"\120\22\11\1\142\1\151\1\153\2\11\1\145\1\125\1\uffff\2\120\1\154\1\60"+
		"\1\0\1\107\1\11\1\40\21\11\1\41\1\55\1\41\2\11\1\40\1\120\2\40\1\151\1"+
		"\46\1\122\1\0\14\11\1\46\3\11\1\0\1\103\1\0\2\11\1\40\1\11\1\117\12\11"+
		"\1\0\3\11\1\157\1\11\1\0\1\125\12\11\1\154\1\11\1\120\11\11\1\157\1\11"+
		"\1\40\10\11\1\162\6\11\1\41\5\11\1\0\16\11";
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
		"\1\171\1\145\1\122\1\131\1\145\1\105\1\165\1\125\1\172\1\164\1\124\1\122"+
		"\1\163\1\151\1\162\1\122\1\154\1\104\1\154\1\162\1\151\1\143\1\71\1\u2019"+
		"\1\71\1\uffff\1\71\1\uffff\1\71\2\u2019\2\uffff\1\u2019\2\164\1\143\1"+
		"\151\1\163\1\40\1\uffff\1\40\1\123\1\144\1\104\1\156\1\40\1\145\1\151"+
		"\1\167\1\160\1\146\1\55\1\145\1\150\1\145\1\164\1\163\1\162\1\164\1\145"+
		"\1\164\1\141\1\163\1\165\1\154\1\147\1\156\1\151\1\150\1\143\1\157\1\145"+
		"\1\172\1\164\1\166\1\145\1\153\1\143\1\164\1\163\1\157\1\154\1\124\1\162"+
		"\1\145\1\144\1\141\1\153\1\163\1\156\1\167\1\156\1\155\1\153\2\154\1\40"+
		"\1\150\1\155\1\144\1\145\1\165\1\154\1\162\1\145\1\154\1\156\1\164\1\40"+
		"\1\156\1\144\1\104\1\155\2\156\2\144\1\171\1\144\1\125\1\162\1\141\1\104"+
		"\1\116\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\157"+
		"\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\162\1\151\1\142\1\151\1\162"+
		"\1\164\1\156\1\151\1\145\1\144\1\164\1\u2019\1\151\1\145\1\u2019\1\40"+
		"\1\154\1\142\1\162\1\144\1\164\1\163\1\125\1\107\1\uffff\2\122\1\156\1"+
		"\165\1\157\1\165\1\151\1\164\1\154\2\164\1\150\1\145\1\153\1\145\1\164"+
		"\3\156\1\163\1\144\1\145\1\122\1\105\1\104\1\125\1\145\1\40\1\uffff\1"+
		"\145\1\122\1\40\1\163\1\123\1\162\1\122\1\163\1\145\1\163\1\105\1\111"+
		"\1\155\1\163\1\164\1\156\1\160\1\145\1\144\1\113\1\153\1\116\1\157\1\153"+
		"\1\154\1\150\2\u2019\2\71\2\u2019\1\51\3\u2019\1\51\1\151\1\145\1\150"+
		"\1\141\2\40\1\141\1\101\1\u2019\1\162\1\143\1\40\1\157\1\151\2\157\1\123"+
		"\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\156\1\162\2\156\1\145\1\154"+
		"\1\144\1\143\2\151\2\145\1\156\1\157\1\153\1\144\1\164\1\145\2\157\1\151"+
		"\1\162\1\151\1\145\1\162\1\164\1\163\1\144\1\155\1\40\1\156\1\141\1\40"+
		"\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\145\1\142\1\145\1\151\1\171"+
		"\1\163\1\141\1\151\1\162\1\40\1\145\1\151\1\145\1\171\1\154\1\144\1\151"+
		"\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\165"+
		"\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151\1\156\1\150\1\171\1\156"+
		"\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\u2019\1"+
		"\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\0\2\u2019\1\151"+
		"\1\u2019\1\156\1\uffff\1\171\1\157\1\151\1\145\1\167\1\145\1\114\1\40"+
		"\2\71\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40"+
		"\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145\1\141\1\151\1\160\1\124"+
		"\1\120\1\101\1\122\1\164\1\126\1\151\1\111\1\107\1\144\1\104\1\163\1\123"+
		"\1\154\1\162\1\141\1\122\1\105\1\141\1\150\1\40\1\145\1\160\1\150\1\40"+
		"\1\111\1\164\1\105\1\151\1\163\1\151\1\72\1\uffff\2\71\1\uffff\1\71\1"+
		"\u2019\1\71\1\u2019\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1\131"+
		"\1\127\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156\1\141"+
		"\1\u2019\1\141\1\143\1\154\1\172\1\141\1\143\1\152\1\164\3\145\1\156\1"+
		"\141\1\162\1\163\2\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\u2019"+
		"\1\156\1\u2019\1\144\1\141\1\145\1\40\1\157\1\141\1\111\1\40\1\156\1\147"+
		"\1\151\1\40\1\160\1\141\1\163\1\143\1\145\1\162\1\145\1\55\1\150\1\164"+
		"\1\145\1\155\2\163\1\142\1\u2019\1\145\1\154\1\40\1\163\1\103\1\150\1"+
		"\171\1\131\1\156\1\40\2\156\1\145\1\157\1\141\1\40\2\145\1\116\1\40\2"+
		"\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145\1"+
		"\40\1\145\1\u2019\1\154\1\156\1\u2019\1\147\1\157\1\163\1\157\1\u2019"+
		"\1\145\1\150\1\141\1\145\1\147\1\0\1\71\17\u2019\1\163\1\u2019\1\0\1\145"+
		"\1\40\1\156\1\145\1\163\1\145\1\154\1\101\1\uffff\2\u2019\1\40\1\151\1"+
		"\145\1\144\1\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1"+
		"\157\1\141\1\170\1\171\2\163\1\111\1\123\1\131\1\104\1\141\1\uffff\1\156"+
		"\1\105\1\122\1\141\1\101\1\144\1\104\2\141\1\164\1\101\1\124\1\162\1\40"+
		"\1\163\1\145\1\141\1\116\1\150\1\123\1\164\1\150\1\164\1\40\1\71\2\u2019"+
		"\1\71\1\51\1\u2019\1\51\1\40\1\146\1\145\1\163\1\165\2\54\1\uffff\1\157"+
		"\1\u2019\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\0\1\156"+
		"\1\141\1\151\1\145\1\154\1\145\1\151\1\40\1\u2019\1\144\1\162\1\147\1"+
		"\156\1\40\2\145\1\163\1\157\1\143\1\40\1\u2019\1\40\1\162\1\0\1\40\1\0"+
		"\1\u2019\1\156\1\154\1\147\1\163\1\116\1\40\1\141\2\145\1\150\1\145\1"+
		"\157\1\162\1\40\1\u2019\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165"+
		"\1\uffff\1\163\1\145\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162"+
		"\1\163\2\107\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019\2\157\1\156\1"+
		"\162\1\156\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1"+
		"\156\1\u2019\1\165\2\71\32\u2019\1\143\1\0\1\141\1\uffff\1\145\1\166\2"+
		"\151\1\154\2\122\1\u2019\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141"+
		"\1\154\1\151\2\162\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156"+
		"\1\147\1\122\1\117\1\171\1\131\1\141\1\101\1\u2019\1\156\1\151\1\116\1"+
		"\131\1\141\1\144\1\164\1\151\1\107\1\162\1\104\1\172\1\151\1\171\2\71"+
		"\1\uffff\1\71\2\u2019\1\164\1\162\1\40\1\165\1\127\1\40\1\141\1\40\1\164"+
		"\1\144\1\122\1\156\1\145\1\40\1\156\1\141\1\154\1\151\1\144\1\u2019\1"+
		"\0\1\40\1\157\1\164\2\40\1\162\1\40\1\165\1\153\1\0\1\163\1\0\1\171\1"+
		"\163\1\u2019\1\164\1\40\1\156\1\162\1\141\1\165\3\40\1\0\1\157\1\156\1"+
		"\141\1\156\1\40\1\143\1\u2019\1\156\1\40\1\141\1\40\1\156\1\145\1\u2019"+
		"\1\145\1\40\1\122\1\151\1\40\1\145\1\144\1\162\1\153\1\0\1\162\1\40\1"+
		"\144\1\147\1\u2019\1\156\1\163\1\145\1\40\1\u2019\1\151\1\0\1\145\37\u2019"+
		"\1\56\1\156\1\40\1\145\1\141\1\154\2\40\1\71\1\0\1\u2019\1\171\1\162\1"+
		"\150\1\155\1\u2019\1\144\1\156\1\163\2\40\2\144\1\40\1\141\1\107\1\101"+
		"\1\131\3\40\1\125\2\54\1\171\1\131\1\0\1\163\1\154\2\40\1\156\1\141\1"+
		"\u2019\1\162\1\40\1\157\1\101\1\143\1\162\2\u2019\1\73\1\71\2\0\2\145"+
		"\1\uffff\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1\154\1\141\1\u2019"+
		"\1\0\1\156\1\157\1\u2019\1\156\2\40\1\u2019\1\40\1\0\1\151\1\123\2\40"+
		"\1\153\2\141\1\144\1\156\1\40\1\150\2\164\1\144\1\u2019\1\0\1\u2019\1"+
		"\107\1\117\1\143\1\40\3\u2019\2\40\1\145\1\0\1\u2019\1\145\1\40\1\0\1"+
		"\141\1\163\37\u2019\2\40\1\162\1\156\1\145\1\u2019\1\0\1\54\1\153\2\40"+
		"\1\0\2\40\1\u2019\1\163\1\40\1\153\1\40\1\113\1\54\1\107\1\120\2\54\1"+
		"\u2019\1\151\1\145\1\171\1\0\1\145\1\107\1\165\1\131\1\165\1\145\1\uffff"+
		"\1\55\1\162\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40\1\145\1\156\1"+
		"\u2019\1\156\1\144\1\0\1\146\1\110\1\145\1\u2019\1\164\2\u2019\1\145\1"+
		"\u2019\1\145\1\u2019\1\0\1\122\1\125\1\40\1\156\3\0\1\162\1\0\1\u2019"+
		"\1\156\1\145\26\u2019\1\51\5\u2019\1\163\1\141\1\154\1\u2019\1\151\1\0"+
		"\3\u2019\1\163\1\40\1\162\1\145\1\0\1\150\1\145\1\107\1\105\1\122\1\40"+
		"\1\164\1\162\1\54\1\144\1\122\1\147\1\54\1\151\1\40\1\71\1\40\1\u2019"+
		"\1\40\1\156\1\116\1\150\1\162\1\40\1\0\1\40\1\u2019\1\146\1\117\1\40\1"+
		"\0\1\145\2\0\1\162\1\144\1\0\1\117\1\120\2\u2019\1\0\1\u2019\1\40\32\u2019"+
		"\1\143\1\162\1\141\6\u2019\1\151\1\163\1\122\1\123\1\117\2\uffff\1\171"+
		"\1\u2019\1\40\1\117\1\150\1\156\1\71\1\0\1\144\1\107\1\145\1\40\1\0\1"+
		"\u2019\1\127\1\144\2\40\1\125\1\40\3\0\27\u2019\1\157\1\164\1\143\3\u2019"+
		"\3\0\1\162\1\u2019\1\117\1\40\1\125\1\u2019\1\0\1\125\1\u2019\1\164\1"+
		"\71\1\u2019\1\40\1\162\1\0\2\40\1\120\22\u2019\1\142\1\151\1\153\2\u2019"+
		"\1\145\1\125\1\uffff\2\120\1\154\1\71\1\0\1\107\1\u2019\1\40\22\u2019"+
		"\1\55\3\u2019\1\40\1\120\2\40\1\151\1\u2019\1\122\1\0\20\u2019\1\0\1\103"+
		"\1\0\2\u2019\1\40\1\u2019\1\117\12\u2019\1\0\3\u2019\1\157\1\u2019\1\0"+
		"\1\125\12\u2019\1\154\1\u2019\1\120\11\u2019\1\157\1\u2019\1\40\10\u2019"+
		"\1\162\14\u2019\1\0\16\u2019";
	static final String DFA68_acceptS =
		"\33\uffff\1\16\2\uffff\2\27\1\30\11\uffff\1\27\76\uffff\1\2\73\uffff\1"+
		"\24\1\uffff\1\16\3\uffff\1\26\1\23\7\uffff\1\15\176\uffff\1\11\34\uffff"+
		"\1\7\u00aa\uffff\1\6\101\uffff\1\12\2\uffff\1\21\4\uffff\1\25\u0098\uffff"+
		"\1\17\33\uffff\1\5\46\uffff\1\1\76\uffff\1\3\35\uffff\1\13\53\uffff\1"+
		"\10\65\uffff\1\20\u00af\uffff\1\22\173\uffff\1\14\u00a6\uffff\1\4\1\5"+
		"\142\uffff\1\5\u008d\uffff";
	static final String DFA68_specialS =
		"\1\u0097\16\uffff\1\u0089\23\uffff\1\110\1\137\1\u0087\1\53\45\uffff\1"+
		"\u0085\1\55\145\uffff\1\u0088\1\uffff\1\51\4\uffff\1\77\60\uffff\1\140"+
		"\1\uffff\1\u0084\13\uffff\1\u00d7\54\uffff\1\u00bd\3\uffff\1\163\50\uffff"+
		"\1\176\46\uffff\1\52\1\u0086\5\uffff\1\104\50\uffff\1\154\1\171\2\uffff"+
		"\1\u00b7\6\uffff\1\u00c2\11\uffff\1\u00e7\15\uffff\1\u00de\47\uffff\1"+
		"\u00f1\1\u0095\2\uffff\1\u0082\26\uffff\1\156\2\uffff\1\146\1\145\15\uffff"+
		"\1\u00b3\2\uffff\1\37\13\uffff\1\u008f\2\uffff\1\102\44\uffff\1\130\21"+
		"\uffff\1\7\6\uffff\1\170\1\uffff\1\174\3\uffff\1\133\2\uffff\1\0\1\u00bb"+
		"\3\uffff\1\u00bf\14\uffff\1\70\5\uffff\1\u00d4\6\uffff\1\u00df\2\uffff"+
		"\1\u0121\6\uffff\1\u0080\2\uffff\1\u00c9\3\uffff\1\44\6\uffff\1\34\7\uffff"+
		"\1\u00e5\1\uffff\1\u00c5\5\uffff\1\u00f0\21\uffff\1\u00bc\1\u00ef\13\uffff"+
		"\1\164\10\uffff\1\155\1\uffff\1\144\20\uffff\1\36\12\uffff\1\25\42\uffff"+
		"\1\u00a3\1\uffff\1\u00f2\7\uffff\1\u0099\1\142\4\uffff\1\u009e\2\uffff"+
		"\1\u0123\2\uffff\1\u00dd\1\166\1\u00cd\1\uffff\1\u00f3\1\u00d1\1\u00f4"+
		"\1\173\4\uffff\1\1\1\u00b8\7\uffff\1\u00e2\1\u008c\3\uffff\1\u00e4\1\uffff"+
		"\1\u0122\7\uffff\1\u00db\2\uffff\1\45\1\65\1\64\6\uffff\1\22\1\56\5\uffff"+
		"\1\100\7\uffff\1\101\2\uffff\1\73\1\uffff\1\u00f5\1\uffff\1\72\1\uffff"+
		"\1\u00cc\36\uffff\1\u00f6\11\uffff\1\u00b1\14\uffff\1\135\12\uffff\1\35"+
		"\4\uffff\1\u00da\22\uffff\1\u00a2\1\u00a1\5\uffff\1\105\1\uffff\1\103"+
		"\5\uffff\1\u00af\5\uffff\1\143\1\u00f7\1\u009f\2\uffff\1\60\1\u009d\1"+
		"\uffff\1\u00c8\2\uffff\1\u00f8\1\67\1\u00f9\2\uffff\1\175\1\uffff\1\2"+
		"\4\uffff\1\122\1\u00c1\1\u00e1\1\u00fa\4\uffff\1\177\3\uffff\1\141\1\uffff"+
		"\1\62\2\uffff\1\u0091\1\uffff\1\61\1\20\1\uffff\1\47\4\uffff\1\u00fb\1"+
		"\uffff\1\40\2\uffff\1\u00a4\3\uffff\1\74\1\u00c7\1\uffff\1\u00fc\42\uffff"+
		"\1\161\3\uffff\1\165\2\uffff\1\u00fd\1\u00b2\4\uffff\1\u00b9\3\uffff\1"+
		"\150\1\152\2\uffff\1\132\4\uffff\1\u00c6\1\136\1\57\1\16\4\uffff\1\u00fe"+
		"\1\41\5\uffff\1\u00d5\1\uffff\1\167\10\uffff\1\u00ff\1\u0100\11\uffff"+
		"\1\u00a5\1\u0124\4\uffff\1\u0101\4\uffff\1\u00cb\1\u00d3\1\172\1\u00b4"+
		"\1\u0102\1\uffff\1\3\1\u00b6\1\u00c0\5\uffff\1\u00e6\5\uffff\1\u0103\1"+
		"\u0093\1\131\1\21\1\uffff\1\46\1\42\1\u00a8\1\u00aa\1\43\1\31\1\uffff"+
		"\1\u0104\1\u00ce\1\uffff\1\75\1\u0105\35\uffff\1\u0096\3\uffff\1\u0090"+
		"\1\71\4\uffff\1\u0106\2\uffff\1\u00d2\1\153\1\u0107\1\157\1\76\1\u0125"+
		"\1\uffff\1\134\1\uffff\1\63\2\uffff\1\113\1\17\6\uffff\1\u0108\1\uffff"+
		"\1\10\7\uffff\1\u0094\1\uffff\1\u0083\4\uffff\1\u009a\2\uffff\1\151\2"+
		"\uffff\1\u0109\1\uffff\1\4\1\uffff\1\u008a\1\uffff\1\u008e\1\u008d\3\uffff"+
		"\1\u0092\1\u010a\1\125\1\23\1\54\1\uffff\1\u010b\1\u010c\1\u010d\1\uffff"+
		"\1\u010e\1\u00d0\43\uffff\1\u010f\4\uffff\1\160\2\uffff\1\u0110\2\uffff"+
		"\1\26\1\uffff\1\111\1\u00ad\4\uffff\1\13\3\uffff\1\u008b\1\uffff\1\11"+
		"\1\u00cf\1\123\4\uffff\1\u0126\1\u0111\1\u00a0\1\162\1\uffff\1\5\1\u00be"+
		"\1\u0112\1\uffff\1\u0113\1\u0114\2\uffff\1\u0115\1\124\1\24\1\u00ac\1"+
		"\u00a7\1\u0116\1\u00ca\1\u00ba\40\uffff\1\u00c3\1\u00c4\1\u00b5\2\uffff"+
		"\1\33\1\uffff\1\112\3\uffff\1\u00e0\1\50\1\12\3\uffff\1\u0117\3\uffff"+
		"\1\u009b\1\u0118\1\u0081\1\6\1\uffff\1\u00d6\1\u00d9\1\127\1\u00ae\1\u0119"+
		"\1\u011a\1\u011b\35\uffff\1\u011c\1\u011d\1\u011e\2\uffff\1\32\1\uffff"+
		"\1\106\1\uffff\1\u011f\1\15\3\uffff\1\u009c\1\66\1\uffff\1\u0120\1\u00dc"+
		"\1\u00e3\1\126\30\uffff\1\30\1\uffff\1\107\1\14\2\uffff\1\u00ee\1\120"+
		"\1\121\1\u00a6\26\uffff\1\147\1\27\1\u00ab\1\u0098\2\uffff\1\117\1\u00ed"+
		"\20\uffff\1\u00ec\1\uffff\1\u00eb\2\uffff\1\u00b0\1\u00d8\1\116\12\uffff"+
		"\1\u00ea\5\uffff\1\u00e9\1\115\14\uffff\1\114\13\uffff\1\u00a9\25\uffff"+
		"\1\u00e8\16\uffff}>";
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
			"\1\u008e\2\uffff\1\u0093\6\uffff\1\u008f\5\uffff\1\u0091\22\uffff\1"+
			"\u0092\1\u008b\5\uffff\1\u008c\2\uffff\1\u008d\2\uffff\1\u0090",
			"\1\u0097\3\uffff\1\u0096\37\uffff\1\u0095\3\uffff\1\u0094",
			"\1\u009d\11\uffff\1\u009b\21\uffff\1\u009c\3\uffff\1\u0098\2\uffff\1"+
			"\u0099\1\u009a",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\3\52\3\uffff\1\52\1\u00a2\1\52\1\uffff\12\u00a3\1\u00a6\1\u00a4\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"",
			"\2\u00ab\2\uffff\1\u00ab\22\uffff\1\u00ab\5\uffff\2\u00a9\4\uffff\2"+
			"\u00a9\2\uffff\12\u00a8\2\u00a9\5\uffff\32\u00aa\4\uffff\1\u00a9\1\uffff"+
			"\32\u00a9\u1f9e\uffff\1\u00a9",
			"\3\52\3\uffff\2\52\1\u00ad\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"",
			"",
			"",
			"\1\u00af\1\uffff\1\u00b0\4\uffff\1\u00ae",
			"\1\u00b1\4\uffff\1\u00b2",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4\62\uffff\1\u00b3",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4\122\uffff\1\u00b5",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bd\3\uffff\1\u00bc",
			"\1\u00be\25\uffff\1\u00bf",
			"\1\u00c0",
			"\1\u00c1\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc\2\uffff\1\u00cd\2\uffff\1\u00d0\4\uffff\1\u00ce\5\uffff\1\u00cf",
			"\1\u00d1",
			"\1\u00d2\15\uffff\1\u00d3\5\uffff\1\u00d4",
			"\1\u00d5\1\u00d6\1\uffff\1\u00d7\2\uffff\1\u00d8\1\u00d9",
			"\1\u00da\7\uffff\1\u00db\5\uffff\1\u00dd\5\uffff\1\u00dc",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0\4\uffff\1\u00e1\3\uffff\1\u00e2\3\uffff\1\u00e3",
			"\1\u00e4",
			"\1\u00e5\3\uffff\1\u00e6\5\uffff\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea\10\uffff\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee\10\uffff\1\u00ef\1\uffff\1\u00f0",
			"\1\u00f1\4\uffff\1\u00f2",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"\1\u00f3\14\uffff\1\u00f4",
			"\1\u00f5",
			"\1\u00f6\10\uffff\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa\3\uffff\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100\5\uffff\1\u0101",
			"\1\u0103\3\uffff\1\u0102",
			"\1\u0104",
			"\1\u0105\3\uffff\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e\14\uffff\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112\4\uffff\1\u0113\3\uffff\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"",
			"\1\u0117",
			"\1\u0118",
			"\1\u011b\6\uffff\1\u0119\1\uffff\1\u011a",
			"\1\u011c\1\uffff\1\u011d\6\uffff\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121\2\uffff\1\u0122\1\u0123\1\uffff\1\u0124\2\uffff\1\u0125",
			"\1\u0126\4\uffff\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012b\7\uffff\1\u012a",
			"\1\u012c\17\uffff\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\3\52\3\uffff\2\u0134\1\52\1\uffff\12\173\1\52\1\u0135\5\uffff\32\52"+
			"\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0136\2\uffff\1\u0137\1\u0138\6\uffff\1\u0139",
			"\1\u013a\6\uffff\1\u013b",
			"\1\u013c\22\uffff\1\u013d",
			"\1\u013e\3\uffff\1\u013f",
			"\1\u0140\11\uffff\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144\7\uffff\1\u0145",
			"\1\u0146",
			"\1\u0148\4\uffff\1\u0147",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u0150\130\uffff\1\u014f",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u015a\1\uffff\1\u0159",
			"\1\u015b",
			"\1\u015c",
			"\1\u0160\4\uffff\1\u015d\2\uffff\1\u015e\6\uffff\1\u015f",
			"\1\u0161",
			"\1\u0163\5\uffff\1\u0162",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\12\u016b",
			"\3\52\3\uffff\1\52\1\u00a2\1\52\1\uffff\12\u00a3\1\u00a6\1\u00a4\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\12\u016c",
			"",
			"\12\u016d",
			"",
			"\2\u016f\2\uffff\1\u016f\22\uffff\1\u016f\10\uffff\1\u0170\6\uffff\12"+
			"\u016e",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0171\4\uffff\2\u00a9\1"+
			"\uffff\1\u0173\2\uffff\2\u00a9\1\u0171\13\uffff\2\u00a9\3\uffff\1\u0171"+
			"\37\uffff\1\u00a9\1\uffff\32\u00a9\u1f9e\uffff\1\u00a9",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0175\4\uffff\2\u0174\1"+
			"\uffff\1\u0173\2\uffff\2\u0174\1\u0175\13\uffff\2\u0174\3\uffff\1\u0175"+
			"\1\uffff\32\u0174\4\uffff\1\u0174\1\uffff\32\u0174\u1f9e\uffff\1\u0174",
			"",
			"",
			"\3\52\3\uffff\2\52\1\u00ad\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\151",
			"\1\u017f",
			"\1\u0181\7\uffff\1\u0180",
			"\1\u0182\20\uffff\1\u0183",
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
			"\1\u0191\15\uffff\1\u0192",
			"\1\u0193\12\uffff\1\u0194\2\uffff\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198\6\uffff\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f\25\uffff\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6\22\uffff\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad\3\uffff\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3\5\uffff\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4\113\uffff\1\u01b9",
			"\1\u01ba",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf\5\uffff\1\u01c0",
			"\1\u01c1",
			"\1\u01c2\5\uffff\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\151",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0\27\uffff\1\u01d1",
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
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u01f9",
			"\1\u01fa",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"",
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
			"\1\u020f\5\uffff\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217\7\uffff\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"",
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
			"\3\52\3\uffff\1\52\1\u023e\1\52\1\uffff\12\u016b\1\52\1\u00a4\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\1\52\1\u023f\1\52\1\uffff\12\u016c\1\52\1\u00a4\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\u0240\2\uffff\1\u0240\22\uffff\1\u0240\17\uffff\12\u016d",
			"\2\u016f\2\uffff\1\u016f\22\uffff\1\u016f\10\uffff\1\u0170\6\uffff\12"+
			"\u0241",
			"\2\u016f\2\uffff\1\u016f\22\uffff\1\u016f\5\uffff\2\u0242\1\uffff\1"+
			"\u00ab\2\uffff\2\u0242\2\uffff\12\u0243\2\u0242\5\uffff\32\u0244\4\uffff"+
			"\1\u0242\1\uffff\32\u0242\u1f9e\uffff\1\u0242",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\10\uffff\1\u0173",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\5\uffff\2\u0242\4\uffff\2"+
			"\u0242\2\uffff\12\u0243\2\u0242\5\uffff\32\u0244\4\uffff\1\u0242\1\uffff"+
			"\32\u0242\u1f9e\uffff\1\u0242",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0175\4\uffff\2\u0174\1"+
			"\uffff\1\u0173\2\uffff\2\u0174\1\u0175\13\uffff\2\u0174\3\uffff\1\u0175"+
			"\1\uffff\32\u0174\4\uffff\1\u0174\1\uffff\32\u0174\u1f9e\uffff\1\u0174",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\10\uffff\1\u0173",
			"\1\u0246\3\uffff\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"\2\u00b4\2\uffff\1\u00b4\22\uffff\1\u00b4",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u024e",
			"\1\u024f",
			"\1\151",
			"\1\u0250",
			"\1\u0251\3\uffff\1\u0252",
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
			"\1\u0273",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\151\103\uffff\1\u0279\10\uffff\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\151",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\151",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\151",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0291\17\uffff\1\u0290",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"\1\151",
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
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\22\52\1\u02b7\7\52\u1f9e\uffff\1\52",
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
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\4\uffff\2\52\2\uffff\1\52\1\u02c3\12\52\5\uffff\1\u02c4\1\u02c5"+
			"\1\u02c6\1\52\1\u02c7\1\u02c8\1\u02c9\1\52\1\u02ca\1\52\1\u02cb\1\u02cc"+
			"\1\u02cd\1\u02ce\3\52\1\u02cf\1\u02d0\1\u02d1\2\52\1\u02d2\3\52\4\uffff"+
			"\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u02d3",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\12\52\1\u02d4\7\52\1\u01f6\7\52\u1f9e\uffff\1\52",
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
			"\1\151",
			"\1\u02eb",
			"\1\u02ec",
			"\1\151",
			"\1\151",
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
			"\1\151\17\uffff\1\u02fa",
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
			"\1\151",
			"\1\u0309",
			"\1\u030a",
			"\1\151\107\uffff\1\u030b",
			"\1\u01fb",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"",
			"\12\u0313",
			"\12\u0314",
			"",
			"\2\u016f\2\uffff\1\u016f\22\uffff\1\u016f\10\uffff\1\u0315\6\uffff\12"+
			"\u0316",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0317\4\uffff\2\u0242\1"+
			"\uffff\1\u0173\2\uffff\2\u0242\1\u0317\13\uffff\2\u0242\3\uffff\1\u0317"+
			"\37\uffff\1\u0242\1\uffff\32\u0242\u1f9e\uffff\1\u0242",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\10\uffff\1\u0173\6\uffff\12"+
			"\u0243",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0319\4\uffff\2\u0318\1"+
			"\uffff\1\u0173\2\uffff\2\u0318\1\u0319\13\uffff\2\u0318\3\uffff\1\u0319"+
			"\1\uffff\32\u0318\4\uffff\1\u0318\1\uffff\32\u0318\u1f9e\uffff\1\u0318",
			"",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\3\u01fb\1\uffff\1\u01fb\1\uffff\1\u01fb\1\uffff\2\u0321\3\uffff\3\u01fb"+
			"\2\uffff\1\u0321\1\uffff\3\u01fb",
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
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
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
			"\1\u033e",
			"\1\151",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\1\u0344",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0346",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0348",
			"\1\u0349",
			"\1\u034a",
			"\1\151",
			"\1\u034b",
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
			"\1\u02de",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\u0371",
			"\1\u0372",
			"\1\u0373",
			"\1\151",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376",
			"\1\151",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\151",
			"\1\u037d",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u037f",
			"\1\u0380",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0381",
			"\1\u0382",
			"\1\151\122\uffff\1\u0383",
			"\1\u0384",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\1\52\10\uffff\1\52\6\uffff\3\52\1\u038b"+
			"\1\52\1\u038c\4\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u038d\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u038f\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\16\52\1\u038e\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0390\3\52\1\u0391\2\52\1\u0392\5\52\1\u0393\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0394\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0395\2\52\1\u0396\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0397\11\52\1\u0398\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0399\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u039a\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u039b"+
			"\15\52\1\u039c\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u039d\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u039e\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u039f\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u03a0\6\52\1\u03a1\1\u03a2\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u03a3\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u03a4\2\52\1\u03a5\1\u03a6\21\52\u1f9e\uffff\1\52",
			"\1\u03a7",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"\1\u03b0",
			"",
			"\3\52\3\uffff\2\u0134\1\52\1\uffff\12\u02df\1\52\1\u0135\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\2\u03b1\1\52\1\uffff\12\u02e0\1\52\1\u0135\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\151",
			"\1\u03ba",
			"\1\151",
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
			"",
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
			"\1\u03d3",
			"\1\u03d4",
			"\1\151",
			"\1\u03d5",
			"\1\u03d6",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\1\u03dc",
			"\1\u03dd",
			"\1\u0133",
			"\1\u03de\2\uffff\12\u0313",
			"\3\52\3\uffff\1\52\1\u03df\1\52\1\uffff\12\u0314\1\52\1\u00a4\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\3\52\1\uffff\12\u03e1\2\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\u016f\2\uffff\1\u016f\22\uffff\1\u016f\10\uffff\1\u0170\6\uffff\12"+
			"\u0316",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\10\uffff\1\u0173",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0319\4\uffff\2\u0318\1"+
			"\uffff\1\u0173\2\uffff\2\u0318\1\u0319\13\uffff\2\u0318\3\uffff\1\u0319"+
			"\1\uffff\32\u0318\4\uffff\1\u0318\1\uffff\32\u0318\u1f9e\uffff\1\u0318",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\10\uffff\1\u0173",
			"\1\u0321",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\1\u03e5",
			"\1\u03e6",
			"\1\u03e6",
			"",
			"\1\u03e7",
			"\1\u03e8\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"\1\u03ec",
			"\1\u03ed",
			"\1\u03ee",
			"\1\u03ef",
			"\1\151",
			"\1\u03f0",
			"\1\uffff",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"\1\u03f4",
			"\1\u03f5",
			"\1\u03f6",
			"\1\u03f7",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u03f9",
			"\1\u03fa",
			"\1\u03fb",
			"\1\u03fc",
			"\1\151",
			"\1\u03fd",
			"\1\u03fe",
			"\1\151\122\uffff\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u0403",
			"\1\uffff",
			"\1\151",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\1\151",
			"\1\u040a",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"\1\u040e",
			"\1\u040f",
			"\1\u0410",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0412",
			"\1\u0413",
			"\1\u0414",
			"\1\151",
			"\1\u0415",
			"\1\151",
			"\1\u0416",
			"\1\u0417",
			"",
			"\1\u0418",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\1\151",
			"\1\u03e6",
			"\1\u03e6",
			"\1\151",
			"\1\151",
			"\1\151",
			"\1\u041c",
			"\1\u041d",
			"\1\u041e",
			"\1\u041f",
			"\1\u0420",
			"\1\u0421",
			"\1\u0422",
			"\1\151",
			"\1\u0423",
			"\1\u0424",
			"\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\16\52\1\u0428\3\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u042a",
			"\1\u042b",
			"\1\u042c",
			"\1\u042d",
			"\1\u042e",
			"",
			"\1\u042f",
			"\1\151",
			"\1\u0430",
			"\1\u0431",
			"\1\151",
			"\1\u0432",
			"\1\uffff",
			"\1\u0433",
			"\1\151",
			"\1\u0434",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0436",
			"\2\52\2\uffff\1\52\22\uffff\1\u0437\10\uffff\1\52\6\uffff\12\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0438\10\uffff\1\52\6\uffff\12\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0439\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u043a\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\1\u043b\1\52\4\uffff\2\52\2"+
			"\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u043c\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u043d\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u043e\10\52\1\u043f\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0440\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0441\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0442\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0443"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0444\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u0445\5\52\1\u0446\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0447\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u0448\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\52"+
			"\1\u0449\30\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u044a\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u044b\4\52\1\u044c\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\25"+
			"\52\1\u044d\4\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u044e\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u044f\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0450"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u0451\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u0452\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u0453\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0454\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0455\10\52\u1f9e\uffff\1\52",
			"\1\u0456",
			"\1\uffff",
			"\1\u0457",
			"",
			"\1\u0458",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\u045d",
			"\1\u045e",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0460",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463",
			"\1\u0464",
			"\1\u0465",
			"\1\u0466",
			"\1\u0467",
			"\1\u0468",
			"\1\u0469\3\uffff\1\u046a",
			"\1\u046b",
			"\1\u046c",
			"\1\151",
			"\1\u03e6",
			"\1\u046d",
			"\1\u046e",
			"\1\u046f",
			"\1\u0470",
			"\1\u03e6",
			"\1\u0471",
			"\1\u0472",
			"\1\u0473",
			"\1\u0474",
			"\1\u0475",
			"\1\u0476",
			"\1\u0477",
			"\1\u0478",
			"\1\u0479",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
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
			"\1\u0487",
			"\1\u0488",
			"\12\u0489",
			"\12\u048a",
			"",
			"\12\u048b",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u048e",
			"\1\u048f",
			"\2\u0490\2\uffff\1\u0490\22\uffff\1\u0490",
			"\1\u0491",
			"\3\u01fb\1\uffff\1\u01fb\1\uffff\1\u01fb\1\uffff\2\u0321\3\uffff\3\u01fb"+
			"\2\uffff\1\u0321\1\uffff\3\u01fb",
			"\1\151",
			"\1\u0492",
			"\1\151",
			"\1\u0493",
			"\1\u0494",
			"\1\u0495",
			"\1\u0496",
			"\1\u0497",
			"\1\151",
			"\1\u0498",
			"\1\u0499",
			"\1\u049a",
			"\1\u049b",
			"\1\u049c",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\151",
			"\1\u049e",
			"\1\u049f",
			"\1\151",
			"\1\151",
			"\1\u04a0",
			"\1\151",
			"\1\u04a1",
			"\1\u04a2",
			"\1\uffff",
			"\1\151\122\uffff\1\u04a3",
			"\1\uffff",
			"\1\u04a4",
			"\1\u04a5",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04a7",
			"\1\u04a8",
			"\1\u04a9",
			"\1\u04aa",
			"\1\u04ab",
			"\1\u04ac",
			"\1\151",
			"\1\151",
			"\1\151",
			"\1\uffff",
			"\1\u04ad",
			"\1\u04ae",
			"\1\u04af",
			"\1\u04b0",
			"\1\151",
			"\1\u04b1",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u04b2",
			"\1\151",
			"\1\u04b3",
			"\1\151",
			"\1\u04b4",
			"\1\u04b5",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04b7",
			"\1\u04b8",
			"\1\u04b9",
			"\1\u04ba",
			"\1\151",
			"\1\u04bb",
			"\1\u04bc",
			"\1\u04bd",
			"\1\u04be",
			"\1\uffff",
			"\1\u04bf",
			"\1\151",
			"\1\u04c0",
			"\1\u04c1",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04c3",
			"\1\u04c4",
			"\1\u04c5",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04c7",
			"\1\uffff",
			"\1\u04c8",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\10\52\1\u04c9\21\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\10\52\1\u04ca\21\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u04cb\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u04cc\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u04cd\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\37\uffff\1\52\1\uffff\32\52\u1f9e"+
			"\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04ce\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u04cf\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u04d0\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u04d1\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04d2\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04d3\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04d4\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u04d5\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u04d6\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u04d7\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u04d8\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04d9\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u04da\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u04db\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u04dc\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u04dd\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u04de\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u04df"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u04e0\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u04e1\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u04e2\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04e3\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04e5\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u04e6\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u04e7\25\52\u1f9e\uffff\1\52",
			"\1\u04e8",
			"\1\u04e9",
			"\1\151",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"\1\151",
			"\1\u02fa",
			"\12\u04ed",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04ef",
			"\1\u04f0",
			"\1\u04f1",
			"\1\u04f2",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04f4",
			"\1\u04f5",
			"\1\u04f6",
			"\1\151",
			"\1\151",
			"\1\u04f7",
			"\1\u04f8",
			"\1\151",
			"\1\u04f9",
			"\1\u04fa",
			"\1\u04fb",
			"\1\u04fc",
			"\1\151",
			"\1\151",
			"\1\u04fd",
			"\1\u04fe",
			"\1\u03e6",
			"\1\u03e6",
			"\1\u04ff",
			"\1\u0500",
			"\1\uffff",
			"\1\151\122\uffff\1\u0501",
			"\1\u0502",
			"\1\u02fa",
			"\1\u037e",
			"\1\u0503",
			"\1\u0504",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0506",
			"\1\u0507",
			"\1\u0508",
			"\1\u0509",
			"\1\u050a",
			"\1\u050b",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\3\52\1\uffff\12\u0489\2\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\12\u048a\1\uffff\1\u00a4",
			"\12\u050d",
			"\1\uffff",
			"\1\uffff",
			"\1\u050e",
			"\1\u050f",
			"",
			"\1\u0510",
			"\1\u0511",
			"\1\u0512",
			"\1\u0513",
			"\1\u0514",
			"\1\u0515",
			"\1\151",
			"\1\151",
			"\1\u0516",
			"\1\u0517",
			"\1\u0518",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u0519",
			"\1\u051a",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u051b",
			"\1\151",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\uffff",
			"\1\u051d",
			"\1\u051e",
			"\1\151",
			"\1\151",
			"\1\u051f",
			"\1\u0520",
			"\1\u0521",
			"\1\u0522",
			"\1\u0523",
			"\1\151",
			"\1\u0524",
			"\1\u0525",
			"\1\u0526",
			"\1\u0527",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0529",
			"\1\u052a",
			"\1\u052b",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\4\52\1\u052c\15\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\151",
			"\1\u0530",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0532",
			"\1\151",
			"\1\uffff",
			"\1\u0533",
			"\1\u0534",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0535\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0536\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0537\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0538\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\17\52\1\u0539\12\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u053a"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\52"+
			"\1\u053b\30\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u053c\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u053d\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u053e\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u053f\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0540\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\1"+
			"\52\1\u0541\1\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0542"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0543\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0544\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0545\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\1\u0546\1\52\4\uffff\2\52\2"+
			"\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0547"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0548\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\7\52\1\u0549\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u054a"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\2"+
			"\52\1\u054b\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u054c\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u054d\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u054e\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u054f\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0550\25\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\5\uffff\2\52\1\u0554\3\uffff\3\52"+
			"\1\uffff\14\52\5\uffff\1\u0551\1\u0553\12\52\1\u0555\2\52\1\u0552\12"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0557\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0558\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7"+
			"\52\1\u0559\22\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\151",
			"\1\u055a",
			"\1\u055b",
			"\1\u055c",
			"\3\52\3\uffff\2\u03b1\1\52\1\uffff\12\u04ed\1\52\1\u0135\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u03e6",
			"\1\u055d",
			"\1\151",
			"\1\151",
			"\1\uffff",
			"\1\151",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u055f",
			"\1\151",
			"\1\u0560",
			"\1\u0561",
			"\1\u0562",
			"\1\u03e6",
			"\1\u0563",
			"\1\u0564",
			"\1\u03e6",
			"\1\u03e6",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0565",
			"\1\u0566",
			"\1\u0567",
			"\1\uffff",
			"\1\u0568",
			"\1\u0569",
			"\1\u056a",
			"\1\u056b",
			"\1\u056c",
			"\1\u056d",
			"",
			"\1\u056e",
			"\1\u056f",
			"\1\151",
			"\1\u0570",
			"\1\151",
			"\1\u0571",
			"\1\u0572",
			"\1\u0573",
			"\1\u0574",
			"\1\151",
			"\1\u0575",
			"\1\u0576",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0578",
			"\1\u0579",
			"\1\uffff",
			"\1\u057a",
			"\1\u057b",
			"\1\u057c",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u057e",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0581",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0582",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u0584",
			"\1\u0585",
			"\1\151",
			"\1\u0586",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0587",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0589",
			"\1\u058a",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u058b\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u058c\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u058d\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u058e\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u058f\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\17"+
			"\52\1\u0590\12\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0591\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0592\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0593\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\1"+
			"\52\1\u0594\1\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u0595\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\2\52\1\u0596\27\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0597\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0598\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0599\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u059a\1\52\4\uffff\2\52\1\uffff\1\u04e4"+
			"\2\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1"+
			"\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u059b\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\37\uffff\1\52\1\uffff\32\52\u1f9e"+
			"\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u059c\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u059d\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u059e"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u059f\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u05a0\10\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\22\52\1\u05a1\7\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u05a2\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05a3"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\27"+
			"\52\1\u05a4\2\52\u1f9e\uffff\1\52",
			"\1\u05a5",
			"\1\u05a6",
			"\1\u05a7",
			"\2\52\4\uffff\2\52\2\uffff\14\52\5\uffff\14\52\1\u05a8\15\52\4\uffff"+
			"\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u02d3",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\1\u05a9\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05aa"+
			"\31\52\u1f9e\uffff\1\52",
			"\1\u05ab",
			"\1\151",
			"\1\u05ac",
			"\1\u05ad",
			"\1\uffff",
			"\1\u05ae",
			"\1\u05af",
			"\1\u05b0",
			"\1\u05b1",
			"\1\u05b2",
			"\1\u05b4",
			"\1\u05b5",
			"\1\u05b6",
			"\1\u03e6",
			"\1\u05b7",
			"\1\u05b8",
			"\1\u05b9",
			"\1\u03e6",
			"\1\u05ba",
			"\1\151",
			"\12\u05bb",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u05bd",
			"\1\u05be",
			"\1\u05bf",
			"\1\u05c0",
			"\1\151",
			"\1\uffff",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u05c2",
			"\1\u05c3",
			"\1\151",
			"\1\uffff",
			"\1\u05c4",
			"\1\uffff",
			"\1\uffff",
			"\1\u05c5",
			"\1\u05c6",
			"\1\uffff",
			"\1\u05c7",
			"\1\u05c8",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u05cc\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u05cd\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05ce"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u05cf\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u05d0\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05d1\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u05d2\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\2\52\1\u05d3\27\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u05d4\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05d5\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u05d6\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\21\52\1\u05d7\4\52\1\u05d8\3\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\21\52\1\u05d9\10\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05da\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05db\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u05dc\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u05dd\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\1\52\1\u05df\1\52\1\u05de\26\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u05e0\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u05e1\1\52\4\uffff\2\52\1\uffff\1\u04e4"+
			"\2\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1"+
			"\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05e2\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u05e3",
			"\1\u05e4",
			"\1\u05e5",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u05e6\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\22\52\1\u05e7\7\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u05e8\21\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u05ec",
			"\1\u05ed",
			"\1\u05ee",
			"\1\u05ef",
			"\1\u05f0",
			"",
			"",
			"\1\u05f1",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u05f3",
			"\1\u05f4",
			"\1\u05f5",
			"\12\u05f6",
			"\1\uffff",
			"\1\u05f7",
			"\1\u05f8",
			"\1\u05f9",
			"\1\151",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u05fb",
			"\1\u05fc",
			"\1\151",
			"\1\151",
			"\1\u05fd",
			"\1\u05b4",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u05fe\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05ff"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0600\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0601\1\52\4\uffff\2\52\1\uffff\1\u04e4"+
			"\2\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1"+
			"\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0602"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\22\52\1\u0603\3\52\1\u0604\3\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0605\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0606"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0607\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0608"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0609\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u060a\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u060b\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u060c\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u060d\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u060e\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u060f\26\52\u1f9e\uffff\1\52",
			"\1\u0610",
			"\1\u0611",
			"\1\u0612",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u044c\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\17"+
			"\52\1\u0613\12\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0614\10\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0615",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0616",
			"\1\u0617",
			"\1\u0618",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u0619",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u061a",
			"\12\u061b",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u061d",
			"\1\u061e",
			"\1\uffff",
			"\1\u05b4",
			"\1\151",
			"\1\u061f",
			"\2\52\2\uffff\1\52\22\uffff\1\u0620\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u0621\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0622"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u0623\17\52\1\u0624\7\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0625\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0626\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0627\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0628\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0629\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u062a\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u062b\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u062c\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u062d\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u062e\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u062f\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0630\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u0631",
			"\1\u0632",
			"\1\u0633",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0634\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0635\25\52\u1f9e\uffff\1\52",
			"\1\u0636",
			"\1\u0637",
			"",
			"\1\u0638",
			"\1\u0639",
			"\1\u063a",
			"\12\u063b",
			"\1\uffff",
			"\1\u063c",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u05b4",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\26\52\1\u063e\3\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u063f\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0640\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0641\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\17"+
			"\52\1\u0642\12\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0643\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0644\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0645\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0646\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0647\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0648\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u064a\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u0649\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u064b\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u064c\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u064d"+
			"\31\52\u1f9e\uffff\1\52",
			"\1\52\4\uffff\2\52\1\u0554\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01f8\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u064f",
			"\1\52\4\uffff\2\52\1\u0554\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01f8\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0651\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0652\26\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u0653",
			"\1\u05b4",
			"\1\u05b4",
			"\1\u0654",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\1\u0655",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0656"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0657\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0658\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u0659\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u065a\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u065b\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u065c\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u065d\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\1\u065e\31\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u065f\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u064a\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0661\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0662"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0663\6\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u0664",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0665\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u05b4",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0667",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0668\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\1\52\1\u0669\30\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u066a\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u066b\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u066c\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u066d\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u066e\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u066f\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u064a\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4"+
			"\52\1\u0670\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0671\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u0672",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0673\23\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u0674",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0675\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0676"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0677\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0678\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0679\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u067a"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u067b\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u067c\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\3\52\1\u067d\26\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\1\u067e",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u067f\25\52\u1f9e\uffff\1\52",
			"\1\u0680",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0681\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u0682\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0683\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0684\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0685"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0686\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0687\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u064a\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u0688\5\52\u1f9e\uffff\1\52",
			"\1\u0689",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u068a\10\52\u1f9e\uffff\1\52",
			"\1\u05b4",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u068b\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u068c\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u068d\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\26\52\1\u068e\3\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u068f\27\52\u1f9e\uffff\1\52",
			"\1\u0690",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0691\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0692\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0693\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0694\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u0695\17\52\u1f9e\uffff\1\52",
			"\1\52\4\uffff\2\52\1\u0554\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01f8\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0697\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0698\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0699\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u069a\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u069b\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u069c\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\23\52\1\u069d\6\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u069e\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u069f\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u06a0\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u06a1\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u06a2\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u06a3\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u06a4\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04e4\2\uffff"+
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
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | FRAG_GROUP_NAME | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA68_635 = input.LA(1);
						 
						int index68_635 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_635=='I') && ((allowGroup))) {s = 845;}
						 
						input.seek(index68_635);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA68_845 = input.LA(1);
						 
						int index68_845 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_845=='N') && ((allowGroup))) {s = 1033;}
						 
						input.seek(index68_845);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA68_1033 = input.LA(1);
						 
						int index68_1033 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1033==' ') && ((allowGroup))) {s = 1192;}
						 
						input.seek(index68_1033);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA68_1192 = input.LA(1);
						 
						int index68_1192 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1192=='S') && ((allowGroup))) {s = 1310;}
						 
						input.seek(index68_1192);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA68_1310 = input.LA(1);
						 
						int index68_1310 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1310=='H') && ((allowGroup))) {s = 1403;}
						 
						input.seek(index68_1310);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA68_1403 = input.LA(1);
						 
						int index68_1403 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1403=='O') && ((allowGroup))) {s = 1475;}
						 
						input.seek(index68_1403);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA68_1475 = input.LA(1);
						 
						int index68_1475 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1475=='W') && ((allowGroup))) {s = 1531;}
						 
						input.seek(index68_1475);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA68_619 = input.LA(1);
						 
						int index68_619 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_619==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_619);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA68_1287 = input.LA(1);
						 
						int index68_1287 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1287=='G') && ((allowGroup))) {s = 1385;}
						 
						input.seek(index68_1287);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA68_1391 = input.LA(1);
						 
						int index68_1391 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1391==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1391);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA68_1464 = input.LA(1);
						 
						int index68_1464 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1464=='O') && ((allowGroup))) {s = 1523;}
						 
						input.seek(index68_1464);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA68_1385 = input.LA(1);
						 
						int index68_1385 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1385=='R') && ((allowGroup))) {s = 1464;}
						 
						input.seek(index68_1385);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA68_1561 = input.LA(1);
						 
						int index68_1561 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1561=='P') && ((allowGroup))) {s = 1593;}
						 
						input.seek(index68_1561);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA68_1523 = input.LA(1);
						 
						int index68_1523 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1523=='U') && ((allowGroup))) {s = 1561;}
						 
						input.seek(index68_1523);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA68_1141 = input.LA(1);
						 
						int index68_1141 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1141=='U') && ((allowGroup))) {s = 1278;}
						 
						input.seek(index68_1141);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA68_1278 = input.LA(1);
						 
						int index68_1278 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1278=='P') && ((allowGroup))) {s = 1380;}
						 
						input.seek(index68_1278);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA68_1058 = input.LA(1);
						 
						int index68_1058 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1058=='R') && ((allowGroup))) {s = 1209;}
						 
						input.seek(index68_1058);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA68_1209 = input.LA(1);
						 
						int index68_1209 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1209=='O') && ((allowGroup))) {s = 1322;}
						 
						input.seek(index68_1209);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA68_881 = input.LA(1);
						 
						int index68_881 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_881=='G') && ((allowGroup))) {s = 1058;}
						 
						input.seek(index68_881);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA68_1322 = input.LA(1);
						 
						int index68_1322 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1322=='U') && ((allowGroup))) {s = 1413;}
						 
						input.seek(index68_1322);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA68_1413 = input.LA(1);
						 
						int index68_1413 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1413=='P') && ((allowGroup))) {s = 1480;}
						 
						input.seek(index68_1413);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA68_776 = input.LA(1);
						 
						int index68_776 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_776==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_776);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA68_1377 = input.LA(1);
						 
						int index68_1377 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1377=='G') && ((allowGroup))) {s = 1456;}
						 
						input.seek(index68_1377);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA68_1591 = input.LA(1);
						 
						int index68_1591 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1591=='P') && ((allowGroup))) {s = 1619;}
						 
						input.seek(index68_1591);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA68_1558 = input.LA(1);
						 
						int index68_1558 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1558=='U') && ((allowGroup))) {s = 1591;}
						 
						input.seek(index68_1558);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA68_1216 = input.LA(1);
						 
						int index68_1216 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1216==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1216);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA68_1518 = input.LA(1);
						 
						int index68_1518 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1518=='O') && ((allowGroup))) {s = 1558;}
						 
						input.seek(index68_1518);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA68_1456 = input.LA(1);
						 
						int index68_1456 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1456=='R') && ((allowGroup))) {s = 1518;}
						 
						input.seek(index68_1456);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA68_690 = input.LA(1);
						 
						int index68_690 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_690==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_690);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA68_970 = input.LA(1);
						 
						int index68_970 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_970=='O') && ((allowGroup))) {s = 1141;}
						 
						input.seek(index68_970);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA68_765 = input.LA(1);
						 
						int index68_765 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_765=='R') && ((allowGroup))) {s = 970;}
						 
						input.seek(index68_765);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA68_549 = input.LA(1);
						 
						int index68_549 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_549=='G') && ((allowGroup))) {s = 765;}
						 
						input.seek(index68_549);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA68_1067 = input.LA(1);
						 
						int index68_1067 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1067==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1067);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA68_1147 = input.LA(1);
						 
						int index68_1147 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1147==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1147=='s') ) {s = 1281;}
						else s = 42;
						 
						input.seek(index68_1147);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA68_1212 = input.LA(1);
						 
						int index68_1212 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1212=='e') ) {s = 1324;}
						else if ( (LA68_1212=='s') ) {s = 502;}
						else if ( ((LA68_1212 >= '\t' && LA68_1212 <= '\n')||LA68_1212=='\r'||LA68_1212==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1212=='(') ) {s = 503;}
						else if ( (LA68_1212=='M') ) {s = 504;}
						else if ( (LA68_1212=='!'||(LA68_1212 >= '&' && LA68_1212 <= '\'')||(LA68_1212 >= ',' && LA68_1212 <= '.')||(LA68_1212 >= '0' && LA68_1212 <= ';')||LA68_1212=='?'||(LA68_1212 >= 'A' && LA68_1212 <= 'L')||(LA68_1212 >= 'N' && LA68_1212 <= 'Z')||LA68_1212=='_'||(LA68_1212 >= 'a' && LA68_1212 <= 'd')||(LA68_1212 >= 'f' && LA68_1212 <= 'r')||(LA68_1212 >= 't' && LA68_1212 <= 'z')||LA68_1212=='\u2019') ) {s = 42;}
						else s = 1325;
						 
						input.seek(index68_1212);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA68_1215 = input.LA(1);
						 
						int index68_1215 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1215==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1215);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA68_683 = input.LA(1);
						 
						int index68_683 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_683==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_683);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA68_872 = input.LA(1);
						 
						int index68_872 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_872==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_872);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA68_1211 = input.LA(1);
						 
						int index68_1211 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1211==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1211);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA68_1060 = input.LA(1);
						 
						int index68_1060 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1060==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1060);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA68_1463 = input.LA(1);
						 
						int index68_1463 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1463==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1463);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA68_181 = input.LA(1);
						 
						int index68_181 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_181 >= '\t' && LA68_181 <= '\n')||LA68_181=='\r'||LA68_181==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_181);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA68_378 = input.LA(1);
						 
						int index68_378 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_378 >= '\t' && LA68_378 <= '\n')||LA68_378=='\r'||LA68_378==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_378);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA68_38 = input.LA(1);
						 
						int index68_38 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_38 >= '\t' && LA68_38 <= '\n')||LA68_38=='\r'||LA68_38==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_38);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA68_1323 = input.LA(1);
						 
						int index68_1323 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1323==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1323);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA68_77 = input.LA(1);
						 
						int index68_77 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_77 >= '\t' && LA68_77 <= '\n')||LA68_77=='\r'||LA68_77==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_77);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA68_882 = input.LA(1);
						 
						int index68_882 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_882==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_882);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA68_1140 = input.LA(1);
						 
						int index68_1140 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1140==' ') && ((allowGroup))) {s = 1277;}
						else s = 42;
						 
						input.seek(index68_1140);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA68_1020 = input.LA(1);
						 
						int index68_1020 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1020==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1020);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA68_1057 = input.LA(1);
						 
						int index68_1057 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1057==' ') && ((allowGroup))) {s = 1208;}
						else s = 42;
						 
						input.seek(index68_1057);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA68_1052 = input.LA(1);
						 
						int index68_1052 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1052==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1052);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA68_1274 = input.LA(1);
						 
						int index68_1274 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1274==' ') && ((allowGroup))) {s = 1377;}
						else s = 42;
						 
						input.seek(index68_1274);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA68_874 = input.LA(1);
						 
						int index68_874 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_874==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_874);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA68_873 = input.LA(1);
						 
						int index68_873 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_873==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_873);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA68_1528 = input.LA(1);
						 
						int index68_1528 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1528==' ') && ((allowGroup))) {s = 1565;}
						else s = 42;
						 
						input.seek(index68_1528);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA68_1027 = input.LA(1);
						 
						int index68_1027 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1027==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1027=='s') ) {s = 1187;}
						else s = 42;
						 
						input.seek(index68_1027);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA68_653 = input.LA(1);
						 
						int index68_653 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_653==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_653=='s') ) {s = 861;}
						else s = 42;
						 
						input.seek(index68_653);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA68_1257 = input.LA(1);
						 
						int index68_1257 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1257==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1257);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA68_903 = input.LA(1);
						 
						int index68_903 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_903==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_903);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA68_899 = input.LA(1);
						 
						int index68_899 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_899==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_899);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA68_1074 = input.LA(1);
						 
						int index68_1074 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1074==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1074);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA68_1221 = input.LA(1);
						 
						int index68_1221 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1221==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1221);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA68_1269 = input.LA(1);
						 
						int index68_1269 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1269==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1269);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA68_186 = input.LA(1);
						 
						int index68_186 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_186==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_186);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA68_888 = input.LA(1);
						 
						int index68_888 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_888=='o') ) {s = 1064;}
						else if ( (LA68_888=='s') ) {s = 502;}
						else if ( ((LA68_888 >= '\t' && LA68_888 <= '\n')||LA68_888=='\r'||LA68_888==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_888=='(') ) {s = 503;}
						else if ( (LA68_888=='M') ) {s = 504;}
						else if ( (LA68_888=='!'||(LA68_888 >= '&' && LA68_888 <= '\'')||(LA68_888 >= ',' && LA68_888 <= '.')||(LA68_888 >= '0' && LA68_888 <= ';')||LA68_888=='?'||(LA68_888 >= 'A' && LA68_888 <= 'L')||(LA68_888 >= 'N' && LA68_888 <= 'Z')||LA68_888=='_'||(LA68_888 >= 'a' && LA68_888 <= 'n')||(LA68_888 >= 'p' && LA68_888 <= 'r')||(LA68_888 >= 't' && LA68_888 <= 'z')||LA68_888=='\u2019') ) {s = 42;}
						else s = 1065;
						 
						input.seek(index68_888);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA68_896 = input.LA(1);
						 
						int index68_896 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_896==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_896);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA68_564 = input.LA(1);
						 
						int index68_564 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_564==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_564=='h') ) {s = 779;}
						else s = 42;
						 
						input.seek(index68_564);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA68_1003 = input.LA(1);
						 
						int index68_1003 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1003==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1003);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA68_385 = input.LA(1);
						 
						int index68_385 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_385==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_385);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA68_1001 = input.LA(1);
						 
						int index68_1001 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1001==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1001);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA68_1520 = input.LA(1);
						 
						int index68_1520 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1520=='U') && ((allowGroup))) {s = 1560;}
						 
						input.seek(index68_1520);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA68_1560 = input.LA(1);
						 
						int index68_1560 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1560=='P') && ((allowGroup))) {s = 1592;}
						 
						input.seek(index68_1560);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA68_35 = input.LA(1);
						 
						int index68_35 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_35=='S') ) {s = 179;}
						else if ( ((LA68_35 >= '\t' && LA68_35 <= '\n')||LA68_35=='\r'||LA68_35==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_35);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA68_1379 = input.LA(1);
						 
						int index68_1379 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1379=='R') && ((allowGroup))) {s = 1458;}
						 
						input.seek(index68_1379);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA68_1458 = input.LA(1);
						 
						int index68_1458 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1458=='O') && ((allowGroup))) {s = 1520;}
						 
						input.seek(index68_1458);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA68_1277 = input.LA(1);
						 
						int index68_1277 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1277=='G') && ((allowGroup))) {s = 1379;}
						 
						input.seek(index68_1277);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA68_1652 = input.LA(1);
						 
						int index68_1652 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1652=='P') && ((allowGroup))) {s = 1664;}
						 
						input.seek(index68_1652);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA68_1639 = input.LA(1);
						 
						int index68_1639 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1639=='U') && ((allowGroup))) {s = 1652;}
						 
						input.seek(index68_1639);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA68_1621 = input.LA(1);
						 
						int index68_1621 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1621=='O') && ((allowGroup))) {s = 1639;}
						 
						input.seek(index68_1621);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA68_1596 = input.LA(1);
						 
						int index68_1596 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1596=='R') && ((allowGroup))) {s = 1621;}
						 
						input.seek(index68_1596);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA68_1565 = input.LA(1);
						 
						int index68_1565 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1565=='G') && ((allowGroup))) {s = 1596;}
						 
						input.seek(index68_1565);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA68_1566 = input.LA(1);
						 
						int index68_1566 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1566=='s') ) {s = 502;}
						else if ( ((LA68_1566 >= '\t' && LA68_1566 <= '\n')||LA68_1566=='\r'||LA68_1566==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1566=='(') ) {s = 503;}
						else if ( (LA68_1566=='M') ) {s = 504;}
						else if ( (LA68_1566=='!'||(LA68_1566 >= '&' && LA68_1566 <= '\'')||(LA68_1566 >= ',' && LA68_1566 <= '.')||(LA68_1566 >= '0' && LA68_1566 <= ';')||LA68_1566=='?'||(LA68_1566 >= 'A' && LA68_1566 <= 'L')||(LA68_1566 >= 'N' && LA68_1566 <= 'Z')||LA68_1566=='_'||(LA68_1566 >= 'a' && LA68_1566 <= 'r')||(LA68_1566 >= 't' && LA68_1566 <= 'z')||LA68_1566=='\u2019') ) {s = 42;}
						else s = 1597;
						 
						input.seek(index68_1566);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA68_1038 = input.LA(1);
						 
						int index68_1038 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1038==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1038);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA68_1393 = input.LA(1);
						 
						int index68_1393 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1393==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1393);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA68_1412 = input.LA(1);
						 
						int index68_1412 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1412=='O') && ((allowGroup))) {s = 1479;}
						 
						input.seek(index68_1412);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA68_1321 = input.LA(1);
						 
						int index68_1321 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1321=='R') && ((allowGroup))) {s = 1412;}
						 
						input.seek(index68_1321);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA68_1533 = input.LA(1);
						 
						int index68_1533 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1533=='P') && ((allowGroup))) {s = 1567;}
						 
						input.seek(index68_1533);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA68_1479 = input.LA(1);
						 
						int index68_1479 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1479=='U') && ((allowGroup))) {s = 1533;}
						 
						input.seek(index68_1479);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA68_601 = input.LA(1);
						 
						int index68_601 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_601=='s') ) {s = 502;}
						else if ( ((LA68_601 >= '\t' && LA68_601 <= '\n')||LA68_601=='\r'||LA68_601==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_601=='(') ) {s = 503;}
						else if ( (LA68_601=='M') ) {s = 504;}
						else if ( (LA68_601=='!'||(LA68_601 >= '&' && LA68_601 <= '\'')||(LA68_601 >= ',' && LA68_601 <= '.')||(LA68_601 >= '0' && LA68_601 <= ';')||LA68_601=='?'||(LA68_601 >= 'A' && LA68_601 <= 'L')||(LA68_601 >= 'N' && LA68_601 <= 'Z')||LA68_601=='_'||(LA68_601 >= 'a' && LA68_601 <= 'r')||(LA68_601 >= 't' && LA68_601 <= 'z')||LA68_601=='\u2019') ) {s = 42;}
						else s = 813;
						 
						input.seek(index68_601);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA68_1208 = input.LA(1);
						 
						int index68_1208 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1208=='G') && ((allowGroup))) {s = 1321;}
						 
						input.seek(index68_1208);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA68_1133 = input.LA(1);
						 
						int index68_1133 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1133==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1133);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA68_632 = input.LA(1);
						 
						int index68_632 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_632==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_632);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA68_1272 = input.LA(1);
						 
						int index68_1272 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1272==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1272);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA68_959 = input.LA(1);
						 
						int index68_959 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_959==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_959);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA68_1139 = input.LA(1);
						 
						int index68_1139 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1139==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1139);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA68_36 = input.LA(1);
						 
						int index68_36 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_36=='s') ) {s = 181;}
						else if ( ((LA68_36 >= '\t' && LA68_36 <= '\n')||LA68_36=='\r'||LA68_36==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_36);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA68_235 = input.LA(1);
						 
						int index68_235 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_235=='l') ) {s = 441;}
						else if ( ((LA68_235 >= '\t' && LA68_235 <= '\n')||LA68_235=='\r'||LA68_235==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_235);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA68_1050 = input.LA(1);
						 
						int index68_1050 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1050==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1050);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA68_822 = input.LA(1);
						 
						int index68_822 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_822=='s') ) {s = 502;}
						else if ( ((LA68_822 >= '\t' && LA68_822 <= '\n')||LA68_822=='\r'||LA68_822==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_822=='(') ) {s = 503;}
						else if ( (LA68_822=='M') ) {s = 504;}
						else if ( (LA68_822=='!'||(LA68_822 >= '&' && LA68_822 <= '\'')||(LA68_822 >= ',' && LA68_822 <= '.')||(LA68_822 >= '0' && LA68_822 <= ';')||LA68_822=='?'||(LA68_822 >= 'A' && LA68_822 <= 'L')||(LA68_822 >= 'N' && LA68_822 <= 'Z')||LA68_822=='_'||(LA68_822 >= 'a' && LA68_822 <= 'r')||(LA68_822 >= 't' && LA68_822 <= 'z')||LA68_822=='\u2019') ) {s = 42;}
						else s = 1016;
						 
						input.seek(index68_822);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA68_1015 = input.LA(1);
						 
						int index68_1015 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1015=='s') ) {s = 502;}
						else if ( ((LA68_1015 >= '\t' && LA68_1015 <= '\n')||LA68_1015=='\r'||LA68_1015==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1015=='(') ) {s = 503;}
						else if ( (LA68_1015=='M') ) {s = 504;}
						else if ( (LA68_1015=='!'||(LA68_1015 >= '&' && LA68_1015 <= '\'')||(LA68_1015 >= ',' && LA68_1015 <= '.')||(LA68_1015 >= '0' && LA68_1015 <= ';')||LA68_1015=='?'||(LA68_1015 >= 'A' && LA68_1015 <= 'L')||(LA68_1015 >= 'N' && LA68_1015 <= 'Z')||LA68_1015=='_'||(LA68_1015 >= 'a' && LA68_1015 <= 'r')||(LA68_1015 >= 't' && LA68_1015 <= 'z')||LA68_1015=='\u2019') ) {s = 42;}
						else s = 1181;
						 
						input.seek(index68_1015);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA68_748 = input.LA(1);
						 
						int index68_748 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_748==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_748);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA68_532 = input.LA(1);
						 
						int index68_532 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_532==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_532);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA68_531 = input.LA(1);
						 
						int index68_531 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_531==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_531);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA68_1590 = input.LA(1);
						 
						int index68_1590 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1590==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1590);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA68_1129 = input.LA(1);
						 
						int index68_1129 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1129==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1129);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA68_1305 = input.LA(1);
						 
						int index68_1305 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1305=='s') ) {s = 502;}
						else if ( ((LA68_1305 >= '\t' && LA68_1305 <= '\n')||LA68_1305=='\r'||LA68_1305==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1305=='(') ) {s = 503;}
						else if ( (LA68_1305=='M') ) {s = 504;}
						else if ( (LA68_1305=='!'||(LA68_1305 >= '&' && LA68_1305 <= '\'')||(LA68_1305 >= ',' && LA68_1305 <= '.')||(LA68_1305 >= '0' && LA68_1305 <= ';')||LA68_1305=='?'||(LA68_1305 >= 'A' && LA68_1305 <= 'L')||(LA68_1305 >= 'N' && LA68_1305 <= 'Z')||LA68_1305=='_'||(LA68_1305 >= 'a' && LA68_1305 <= 'r')||(LA68_1305 >= 't' && LA68_1305 <= 'z')||LA68_1305=='\u2019') ) {s = 42;}
						else s = 1399;
						 
						input.seek(index68_1305);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA68_1130 = input.LA(1);
						 
						int index68_1130 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1130==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1130);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA68_1266 = input.LA(1);
						 
						int index68_1266 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1266==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1266);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA68_426 = input.LA(1);
						 
						int index68_426 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_426==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_426=='d') ) {s = 633;}
						else if ( (LA68_426=='m') ) {s = 634;}
						else s = 42;
						 
						input.seek(index68_426);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA68_746 = input.LA(1);
						 
						int index68_746 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_746==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_746);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA68_528 = input.LA(1);
						 
						int index68_528 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_528==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_528);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA68_1268 = input.LA(1);
						 
						int index68_1268 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1268==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1268);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA68_1371 = input.LA(1);
						 
						int index68_1371 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1371==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1371);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA68_1112 = input.LA(1);
						 
						int index68_1112 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1112==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1112);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA68_1401 = input.LA(1);
						 
						int index68_1401 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1401=='s') ) {s = 502;}
						else if ( ((LA68_1401 >= '\t' && LA68_1401 <= '\n')||LA68_1401=='\r'||LA68_1401==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1401=='(') ) {s = 503;}
						else if ( (LA68_1401=='M') ) {s = 504;}
						else if ( (LA68_1401=='!'||(LA68_1401 >= '&' && LA68_1401 <= '\'')||(LA68_1401 >= ',' && LA68_1401 <= '.')||(LA68_1401 >= '0' && LA68_1401 <= ';')||LA68_1401=='?'||(LA68_1401 >= 'A' && LA68_1401 <= 'L')||(LA68_1401 >= 'N' && LA68_1401 <= 'Z')||LA68_1401=='_'||(LA68_1401 >= 'a' && LA68_1401 <= 'r')||(LA68_1401 >= 't' && LA68_1401 <= 'z')||LA68_1401=='\u2019') ) {s = 42;}
						else s = 1473;
						 
						input.seek(index68_1401);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA68_298 = input.LA(1);
						 
						int index68_298 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_298==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_298);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA68_737 = input.LA(1);
						 
						int index68_737 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_737==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_737);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA68_1116 = input.LA(1);
						 
						int index68_1116 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1116==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1116);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA68_834 = input.LA(1);
						 
						int index68_834 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_834=='s') ) {s = 502;}
						else if ( ((LA68_834 >= '\t' && LA68_834 <= '\n')||LA68_834=='\r'||LA68_834==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_834=='(') ) {s = 503;}
						else if ( (LA68_834=='M') ) {s = 504;}
						else if ( (LA68_834=='!'||(LA68_834 >= '&' && LA68_834 <= '\'')||(LA68_834 >= ',' && LA68_834 <= '.')||(LA68_834 >= '0' && LA68_834 <= ';')||LA68_834=='?'||(LA68_834 >= 'A' && LA68_834 <= 'L')||(LA68_834 >= 'N' && LA68_834 <= 'Z')||LA68_834=='_'||(LA68_834 >= 'a' && LA68_834 <= 'r')||(LA68_834 >= 't' && LA68_834 <= 'z')||LA68_834=='\u2019') ) {s = 42;}
						else s = 1026;
						 
						input.seek(index68_834);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA68_1155 = input.LA(1);
						 
						int index68_1155 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1155==' ') && ((allowGroup))) {s = 1287;}
						else s = 42;
						 
						input.seek(index68_1155);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA68_626 = input.LA(1);
						 
						int index68_626 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_626=='s') ) {s = 502;}
						else if ( ((LA68_626 >= '\t' && LA68_626 <= '\n')||LA68_626=='\r'||LA68_626==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_626=='(') ) {s = 503;}
						else if ( (LA68_626=='M') ) {s = 504;}
						else if ( (LA68_626=='!'||(LA68_626 >= '&' && LA68_626 <= '\'')||(LA68_626 >= ',' && LA68_626 <= '.')||(LA68_626 >= '0' && LA68_626 <= ';')||LA68_626=='?'||(LA68_626 >= 'A' && LA68_626 <= 'L')||(LA68_626 >= 'N' && LA68_626 <= 'Z')||LA68_626=='_'||(LA68_626 >= 'a' && LA68_626 <= 'r')||(LA68_626 >= 't' && LA68_626 <= 'z')||LA68_626=='\u2019') ) {s = 42;}
						else s = 837;
						 
						input.seek(index68_626);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA68_427 = input.LA(1);
						 
						int index68_427 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_427==' ') && ((allowGroup))) {s = 635;}
						else s = 42;
						 
						input.seek(index68_427);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA68_1188 = input.LA(1);
						 
						int index68_1188 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1188=='s') ) {s = 502;}
						else if ( ((LA68_1188 >= '\t' && LA68_1188 <= '\n')||LA68_1188=='\r'||LA68_1188==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1188=='(') ) {s = 503;}
						else if ( (LA68_1188=='M') ) {s = 504;}
						else if ( (LA68_1188=='!'||(LA68_1188 >= '&' && LA68_1188 <= '\'')||(LA68_1188 >= ',' && LA68_1188 <= '.')||(LA68_1188 >= '0' && LA68_1188 <= ';')||LA68_1188=='?'||(LA68_1188 >= 'A' && LA68_1188 <= 'L')||(LA68_1188 >= 'N' && LA68_1188 <= 'Z')||LA68_1188=='_'||(LA68_1188 >= 'a' && LA68_1188 <= 'r')||(LA68_1188 >= 't' && LA68_1188 <= 'z')||LA68_1188=='\u2019') ) {s = 42;}
						else s = 1308;
						 
						input.seek(index68_1188);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA68_840 = input.LA(1);
						 
						int index68_840 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_840=='s') ) {s = 502;}
						else if ( ((LA68_840 >= '\t' && LA68_840 <= '\n')||LA68_840=='\r'||LA68_840==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_840=='(') ) {s = 503;}
						else if ( (LA68_840=='M') ) {s = 504;}
						else if ( (LA68_840=='!'||(LA68_840 >= '&' && LA68_840 <= '\'')||(LA68_840 >= ',' && LA68_840 <= '.')||(LA68_840 >= '0' && LA68_840 <= ';')||LA68_840=='?'||(LA68_840 >= 'A' && LA68_840 <= 'L')||(LA68_840 >= 'N' && LA68_840 <= 'Z')||LA68_840=='_'||(LA68_840 >= 'a' && LA68_840 <= 'r')||(LA68_840 >= 't' && LA68_840 <= 'z')||LA68_840=='\u2019') ) {s = 42;}
						else s = 1028;
						 
						input.seek(index68_840);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA68_628 = input.LA(1);
						 
						int index68_628 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_628=='s') ) {s = 502;}
						else if ( ((LA68_628 >= '\t' && LA68_628 <= '\n')||LA68_628=='\r'||LA68_628==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_628=='(') ) {s = 503;}
						else if ( (LA68_628=='M') ) {s = 504;}
						else if ( (LA68_628=='!'||(LA68_628 >= '&' && LA68_628 <= '\'')||(LA68_628 >= ',' && LA68_628 <= '.')||(LA68_628 >= '0' && LA68_628 <= ';')||LA68_628=='?'||(LA68_628 >= 'A' && LA68_628 <= 'L')||(LA68_628 >= 'N' && LA68_628 <= 'Z')||LA68_628=='_'||(LA68_628 >= 'a' && LA68_628 <= 'r')||(LA68_628 >= 't' && LA68_628 <= 'z')||LA68_628=='\u2019') ) {s = 42;}
						else s = 839;
						 
						input.seek(index68_628);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA68_1031 = input.LA(1);
						 
						int index68_1031 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1031=='s') ) {s = 502;}
						else if ( ((LA68_1031 >= '\t' && LA68_1031 <= '\n')||LA68_1031=='\r'||LA68_1031==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1031=='(') ) {s = 503;}
						else if ( (LA68_1031=='M') ) {s = 504;}
						else if ( (LA68_1031=='!'||(LA68_1031 >= '&' && LA68_1031 <= '\'')||(LA68_1031 >= ',' && LA68_1031 <= '.')||(LA68_1031 >= '0' && LA68_1031 <= ';')||LA68_1031=='?'||(LA68_1031 >= 'A' && LA68_1031 <= 'L')||(LA68_1031 >= 'N' && LA68_1031 <= 'Z')||LA68_1031=='_'||(LA68_1031 >= 'a' && LA68_1031 <= 'r')||(LA68_1031 >= 't' && LA68_1031 <= 'z')||LA68_1031=='\u2019') ) {s = 42;}
						else s = 1190;
						 
						input.seek(index68_1031);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA68_339 = input.LA(1);
						 
						int index68_339 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_339==' ') && ((allowGroup))) {s = 549;}
						else s = 42;
						 
						input.seek(index68_339);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA68_1046 = input.LA(1);
						 
						int index68_1046 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1046==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1046);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA68_676 = input.LA(1);
						 
						int index68_676 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_676==' ') && ((allowGroup))) {s = 881;}
						else s = 42;
						 
						input.seek(index68_676);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA68_1474 = input.LA(1);
						 
						int index68_1474 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1474=='s') ) {s = 502;}
						else if ( ((LA68_1474 >= '\t' && LA68_1474 <= '\n')||LA68_1474=='\r'||LA68_1474==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1474=='(') ) {s = 503;}
						else if ( (LA68_1474=='M') ) {s = 504;}
						else if ( (LA68_1474=='!'||(LA68_1474 >= '&' && LA68_1474 <= '\'')||(LA68_1474 >= ',' && LA68_1474 <= '.')||(LA68_1474 >= '0' && LA68_1474 <= ';')||LA68_1474=='?'||(LA68_1474 >= 'A' && LA68_1474 <= 'L')||(LA68_1474 >= 'N' && LA68_1474 <= 'Z')||LA68_1474=='_'||(LA68_1474 >= 'a' && LA68_1474 <= 'r')||(LA68_1474 >= 't' && LA68_1474 <= 'z')||LA68_1474=='\u2019') ) {s = 42;}
						else s = 1530;
						 
						input.seek(index68_1474);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA68_505 = input.LA(1);
						 
						int index68_505 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_505=='k') ) {s = 724;}
						else if ( (LA68_505=='s') ) {s = 502;}
						else if ( ((LA68_505 >= '\t' && LA68_505 <= '\n')||LA68_505=='\r'||LA68_505==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_505=='(') ) {s = 503;}
						else if ( (LA68_505=='M') ) {s = 504;}
						else if ( (LA68_505=='!'||(LA68_505 >= '&' && LA68_505 <= '\'')||(LA68_505 >= ',' && LA68_505 <= '.')||(LA68_505 >= '0' && LA68_505 <= ';')||LA68_505=='?'||(LA68_505 >= 'A' && LA68_505 <= 'L')||(LA68_505 >= 'N' && LA68_505 <= 'Z')||LA68_505=='_'||(LA68_505 >= 'a' && LA68_505 <= 'j')||(LA68_505 >= 'l' && LA68_505 <= 'r')||(LA68_505 >= 't' && LA68_505 <= 'z')||LA68_505=='\u2019') ) {s = 42;}
						else s = 725;
						 
						input.seek(index68_505);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA68_1297 = input.LA(1);
						 
						int index68_1297 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1297==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1297);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA68_237 = input.LA(1);
						 
						int index68_237 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_237 >= '\t' && LA68_237 <= '\n')||LA68_237=='\r'||LA68_237==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_237);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA68_76 = input.LA(1);
						 
						int index68_76 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_76 >= '\t' && LA68_76 <= '\n')||LA68_76=='\r'||LA68_76==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_76);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA68_379 = input.LA(1);
						 
						int index68_379 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_379 >= '\t' && LA68_379 <= '\n')||LA68_379=='\r'||LA68_379==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_379);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA68_37 = input.LA(1);
						 
						int index68_37 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_37 >= '\t' && LA68_37 <= '\n')||LA68_37=='\r'||LA68_37==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_37);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA68_179 = input.LA(1);
						 
						int index68_179 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_179 >= '\t' && LA68_179 <= '\n')||LA68_179=='\r'||LA68_179==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index68_179);
						if ( s>=0 ) return s;
						break;

					case 137 : 
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

					case 138 : 
						int LA68_1312 = input.LA(1);
						 
						int index68_1312 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1312=='s') ) {s = 502;}
						else if ( ((LA68_1312 >= '\t' && LA68_1312 <= '\n')||LA68_1312=='\r'||LA68_1312==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1312=='(') ) {s = 503;}
						else if ( (LA68_1312=='M') ) {s = 504;}
						else if ( (LA68_1312=='!'||(LA68_1312 >= '&' && LA68_1312 <= '\'')||(LA68_1312 >= ',' && LA68_1312 <= '.')||(LA68_1312 >= '0' && LA68_1312 <= ';')||LA68_1312=='?'||(LA68_1312 >= 'A' && LA68_1312 <= 'L')||(LA68_1312 >= 'N' && LA68_1312 <= 'Z')||LA68_1312=='_'||(LA68_1312 >= 'a' && LA68_1312 <= 'r')||(LA68_1312 >= 't' && LA68_1312 <= 'z')||LA68_1312=='\u2019') ) {s = 42;}
						else s = 1405;
						 
						input.seek(index68_1312);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA68_1389 = input.LA(1);
						 
						int index68_1389 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1389==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1389);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA68_855 = input.LA(1);
						 
						int index68_855 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_855=='s') ) {s = 502;}
						else if ( ((LA68_855 >= '\t' && LA68_855 <= '\n')||LA68_855=='\r'||LA68_855==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_855=='(') ) {s = 503;}
						else if ( (LA68_855=='M') ) {s = 504;}
						else if ( (LA68_855=='!'||(LA68_855 >= '&' && LA68_855 <= '\'')||(LA68_855 >= ',' && LA68_855 <= '.')||(LA68_855 >= '0' && LA68_855 <= ';')||LA68_855=='?'||(LA68_855 >= 'A' && LA68_855 <= 'L')||(LA68_855 >= 'N' && LA68_855 <= 'Z')||LA68_855=='_'||(LA68_855 >= 'a' && LA68_855 <= 'r')||(LA68_855 >= 't' && LA68_855 <= 'z')||LA68_855=='\u2019') ) {s = 42;}
						else s = 1041;
						 
						input.seek(index68_855);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA68_1315 = input.LA(1);
						 
						int index68_1315 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1315=='s') ) {s = 502;}
						else if ( ((LA68_1315 >= '\t' && LA68_1315 <= '\n')||LA68_1315=='\r'||LA68_1315==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1315=='(') ) {s = 503;}
						else if ( (LA68_1315=='M') ) {s = 504;}
						else if ( (LA68_1315=='!'||(LA68_1315 >= '&' && LA68_1315 <= '\'')||(LA68_1315 >= ',' && LA68_1315 <= '.')||(LA68_1315 >= '0' && LA68_1315 <= ';')||LA68_1315=='?'||(LA68_1315 >= 'A' && LA68_1315 <= 'L')||(LA68_1315 >= 'N' && LA68_1315 <= 'Z')||LA68_1315=='_'||(LA68_1315 >= 'a' && LA68_1315 <= 'r')||(LA68_1315 >= 't' && LA68_1315 <= 'z')||LA68_1315=='\u2019') ) {s = 42;}
						else s = 1408;
						 
						input.seek(index68_1315);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA68_1314 = input.LA(1);
						 
						int index68_1314 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1314=='s') ) {s = 502;}
						else if ( ((LA68_1314 >= '\t' && LA68_1314 <= '\n')||LA68_1314=='\r'||LA68_1314==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1314=='(') ) {s = 503;}
						else if ( (LA68_1314=='M') ) {s = 504;}
						else if ( (LA68_1314=='!'||(LA68_1314 >= '&' && LA68_1314 <= '\'')||(LA68_1314 >= ',' && LA68_1314 <= '.')||(LA68_1314 >= '0' && LA68_1314 <= ';')||LA68_1314=='?'||(LA68_1314 >= 'A' && LA68_1314 <= 'L')||(LA68_1314 >= 'N' && LA68_1314 <= 'Z')||LA68_1314=='_'||(LA68_1314 >= 'a' && LA68_1314 <= 'r')||(LA68_1314 >= 't' && LA68_1314 <= 'z')||LA68_1314=='\u2019') ) {s = 42;}
						else s = 1407;
						 
						input.seek(index68_1314);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA68_561 = input.LA(1);
						 
						int index68_561 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_561==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_561);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA68_1256 = input.LA(1);
						 
						int index68_1256 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1256==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1256);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA68_1055 = input.LA(1);
						 
						int index68_1055 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1055=='s') ) {s = 502;}
						else if ( ((LA68_1055 >= '\t' && LA68_1055 <= '\n')||LA68_1055=='\r'||LA68_1055==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1055=='(') ) {s = 503;}
						else if ( (LA68_1055=='M') ) {s = 504;}
						else if ( (LA68_1055=='!'||(LA68_1055 >= '&' && LA68_1055 <= '\'')||(LA68_1055 >= ',' && LA68_1055 <= '.')||(LA68_1055 >= '0' && LA68_1055 <= ';')||LA68_1055=='?'||(LA68_1055 >= 'A' && LA68_1055 <= 'L')||(LA68_1055 >= 'N' && LA68_1055 <= 'Z')||LA68_1055=='_'||(LA68_1055 >= 'a' && LA68_1055 <= 'r')||(LA68_1055 >= 't' && LA68_1055 <= 'z')||LA68_1055=='\u2019') ) {s = 42;}
						else s = 1206;
						 
						input.seek(index68_1055);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA68_1319 = input.LA(1);
						 
						int index68_1319 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1319=='s') ) {s = 502;}
						else if ( ((LA68_1319 >= '\t' && LA68_1319 <= '\n')||LA68_1319=='\r'||LA68_1319==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1319=='(') ) {s = 503;}
						else if ( (LA68_1319=='M') ) {s = 504;}
						else if ( (LA68_1319=='!'||(LA68_1319 >= '&' && LA68_1319 <= '\'')||(LA68_1319 >= ',' && LA68_1319 <= '.')||(LA68_1319 >= '0' && LA68_1319 <= ';')||LA68_1319=='?'||(LA68_1319 >= 'A' && LA68_1319 <= 'L')||(LA68_1319 >= 'N' && LA68_1319 <= 'Z')||LA68_1319=='_'||(LA68_1319 >= 'a' && LA68_1319 <= 'r')||(LA68_1319 >= 't' && LA68_1319 <= 'z')||LA68_1319=='\u2019') ) {s = 42;}
						else s = 1411;
						 
						input.seek(index68_1319);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA68_1207 = input.LA(1);
						 
						int index68_1207 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1207=='s') ) {s = 502;}
						else if ( ((LA68_1207 >= '\t' && LA68_1207 <= '\n')||LA68_1207=='\r'||LA68_1207==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1207=='(') ) {s = 503;}
						else if ( (LA68_1207=='M') ) {s = 504;}
						else if ( (LA68_1207=='!'||(LA68_1207 >= '&' && LA68_1207 <= '\'')||(LA68_1207 >= ',' && LA68_1207 <= '.')||(LA68_1207 >= '0' && LA68_1207 <= ';')||LA68_1207=='?'||(LA68_1207 >= 'A' && LA68_1207 <= 'L')||(LA68_1207 >= 'N' && LA68_1207 <= 'Z')||LA68_1207=='_'||(LA68_1207 >= 'a' && LA68_1207 <= 'r')||(LA68_1207 >= 't' && LA68_1207 <= 'z')||LA68_1207=='\u2019') ) {s = 42;}
						else s = 1320;
						 
						input.seek(index68_1207);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA68_1295 = input.LA(1);
						 
						int index68_1295 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1295==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1295);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA68_502 = input.LA(1);
						 
						int index68_502 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_502 >= '\t' && LA68_502 <= '\n')||LA68_502=='\r'||LA68_502==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_502=='(') ) {s = 503;}
						else if ( (LA68_502=='M') ) {s = 504;}
						else if ( (LA68_502=='!'||(LA68_502 >= '&' && LA68_502 <= '\'')||(LA68_502 >= ',' && LA68_502 <= '.')||(LA68_502 >= '0' && LA68_502 <= ';')||LA68_502=='?'||(LA68_502 >= 'A' && LA68_502 <= 'L')||(LA68_502 >= 'N' && LA68_502 <= 'Z')||LA68_502=='_'||(LA68_502 >= 'a' && LA68_502 <= 'z')||LA68_502=='\u2019') ) {s = 42;}
						else s = 706;
						 
						input.seek(index68_502);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA68_1252 = input.LA(1);
						 
						int index68_1252 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA68_1252 >= '\t' && LA68_1252 <= '\n')||LA68_1252=='\r'||LA68_1252==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1252=='A') ) {s = 1361;}
						else if ( (LA68_1252=='P') ) {s = 1362;}
						else if ( (LA68_1252=='B') ) {s = 1363;}
						else if ( (LA68_1252=='(') ) {s = 1364;}
						else if ( (LA68_1252=='M') ) {s = 1365;}
						else if ( ((LA68_1252 >= '&' && LA68_1252 <= '\'')||(LA68_1252 >= ',' && LA68_1252 <= '.')||(LA68_1252 >= '0' && LA68_1252 <= ';')||(LA68_1252 >= 'C' && LA68_1252 <= 'L')||(LA68_1252 >= 'N' && LA68_1252 <= 'O')||(LA68_1252 >= 'Q' && LA68_1252 <= 'Z')||LA68_1252=='_'||(LA68_1252 >= 'a' && LA68_1252 <= 'z')||LA68_1252=='\u2019') ) {s = 42;}
						else s = 1366;
						 
						input.seek(index68_1252);
						if ( s>=0 ) return s;
						break;

					case 151 : 
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

					case 152 : 
						int LA68_1593 = input.LA(1);
						 
						int index68_1593 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1593==' ') && ((allowGroup))) {s = 1460;}
						else s = 1459;
						 
						input.seek(index68_1593);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA68_821 = input.LA(1);
						 
						int index68_821 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_821==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_821);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA68_1302 = input.LA(1);
						 
						int index68_1302 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1302==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1302);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA68_1472 = input.LA(1);
						 
						int index68_1472 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1472==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1472);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA68_1527 = input.LA(1);
						 
						int index68_1527 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1527=='s') ) {s = 502;}
						else if ( ((LA68_1527 >= '\t' && LA68_1527 <= '\n')||LA68_1527=='\r'||LA68_1527==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1527=='(') ) {s = 503;}
						else if ( (LA68_1527=='M') ) {s = 504;}
						else if ( (LA68_1527=='!'||(LA68_1527 >= '&' && LA68_1527 <= '\'')||(LA68_1527 >= ',' && LA68_1527 <= '.')||(LA68_1527 >= '0' && LA68_1527 <= ';')||LA68_1527=='?'||(LA68_1527 >= 'A' && LA68_1527 <= 'L')||(LA68_1527 >= 'N' && LA68_1527 <= 'Z')||LA68_1527=='_'||(LA68_1527 >= 'a' && LA68_1527 <= 'r')||(LA68_1527 >= 't' && LA68_1527 <= 'z')||LA68_1527=='\u2019') ) {s = 42;}
						else s = 1564;
						 
						input.seek(index68_1527);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA68_1021 = input.LA(1);
						 
						int index68_1021 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1021==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1021);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA68_827 = input.LA(1);
						 
						int index68_827 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_827==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_827);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA68_1017 = input.LA(1);
						 
						int index68_1017 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1017==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1017);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA68_1400 = input.LA(1);
						 
						int index68_1400 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1400==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1400);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA68_995 = input.LA(1);
						 
						int index68_995 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_995=='s') ) {s = 502;}
						else if ( ((LA68_995 >= '\t' && LA68_995 <= '\n')||LA68_995=='\r'||LA68_995==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_995=='(') ) {s = 503;}
						else if ( (LA68_995=='M') ) {s = 504;}
						else if ( (LA68_995=='!'||(LA68_995 >= '&' && LA68_995 <= '\'')||(LA68_995 >= ',' && LA68_995 <= '.')||(LA68_995 >= '0' && LA68_995 <= ';')||LA68_995=='?'||(LA68_995 >= 'A' && LA68_995 <= 'L')||(LA68_995 >= 'N' && LA68_995 <= 'Z')||LA68_995=='_'||(LA68_995 >= 'a' && LA68_995 <= 'r')||(LA68_995 >= 't' && LA68_995 <= 'z')||LA68_995=='\u2019') ) {s = 42;}
						else s = 1165;
						 
						input.seek(index68_995);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA68_994 = input.LA(1);
						 
						int index68_994 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_994=='s') ) {s = 502;}
						else if ( ((LA68_994 >= '\t' && LA68_994 <= '\n')||LA68_994=='\r'||LA68_994==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_994=='(') ) {s = 503;}
						else if ( (LA68_994=='M') ) {s = 504;}
						else if ( (LA68_994=='!'||(LA68_994 >= '&' && LA68_994 <= '\'')||(LA68_994 >= ',' && LA68_994 <= '.')||(LA68_994 >= '0' && LA68_994 <= ';')||LA68_994=='?'||(LA68_994 >= 'A' && LA68_994 <= 'L')||(LA68_994 >= 'N' && LA68_994 <= 'Z')||LA68_994=='_'||(LA68_994 >= 'a' && LA68_994 <= 'r')||(LA68_994 >= 't' && LA68_994 <= 'z')||LA68_994=='\u2019') ) {s = 42;}
						else s = 1164;
						 
						input.seek(index68_994);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA68_811 = input.LA(1);
						 
						int index68_811 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_811==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_811);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA68_1070 = input.LA(1);
						 
						int index68_1070 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1070=='s') ) {s = 502;}
						else if ( ((LA68_1070 >= '\t' && LA68_1070 <= '\n')||LA68_1070=='\r'||LA68_1070==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1070=='(') ) {s = 503;}
						else if ( (LA68_1070=='M') ) {s = 504;}
						else if ( (LA68_1070=='!'||(LA68_1070 >= '&' && LA68_1070 <= '\'')||(LA68_1070 >= ',' && LA68_1070 <= '.')||(LA68_1070 >= '0' && LA68_1070 <= ';')||LA68_1070=='?'||(LA68_1070 >= 'A' && LA68_1070 <= 'L')||(LA68_1070 >= 'N' && LA68_1070 <= 'Z')||LA68_1070=='_'||(LA68_1070 >= 'a' && LA68_1070 <= 'r')||(LA68_1070 >= 't' && LA68_1070 <= 'z')||LA68_1070=='\u2019') ) {s = 42;}
						else s = 1218;
						 
						input.seek(index68_1070);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA68_1175 = input.LA(1);
						 
						int index68_1175 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1175==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1175);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA68_1567 = input.LA(1);
						 
						int index68_1567 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1567==' ') && ((allowGroup))) {s = 1460;}
						else s = 1459;
						 
						input.seek(index68_1567);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA68_1415 = input.LA(1);
						 
						int index68_1415 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1415=='s') ) {s = 502;}
						else if ( ((LA68_1415 >= '\t' && LA68_1415 <= '\n')||LA68_1415=='\r'||LA68_1415==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1415=='(') ) {s = 503;}
						else if ( (LA68_1415=='M') ) {s = 504;}
						else if ( (LA68_1415=='!'||(LA68_1415 >= '&' && LA68_1415 <= '\'')||(LA68_1415 >= ',' && LA68_1415 <= '.')||(LA68_1415 >= '0' && LA68_1415 <= ';')||LA68_1415=='?'||(LA68_1415 >= 'A' && LA68_1415 <= 'L')||(LA68_1415 >= 'N' && LA68_1415 <= 'Z')||LA68_1415=='_'||(LA68_1415 >= 'a' && LA68_1415 <= 'r')||(LA68_1415 >= 't' && LA68_1415 <= 'z')||LA68_1415=='\u2019') ) {s = 42;}
						else s = 1482;
						 
						input.seek(index68_1415);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA68_1213 = input.LA(1);
						 
						int index68_1213 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1213=='s') ) {s = 502;}
						else if ( ((LA68_1213 >= '\t' && LA68_1213 <= '\n')||LA68_1213=='\r'||LA68_1213==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1213=='(') ) {s = 503;}
						else if ( (LA68_1213=='M') ) {s = 504;}
						else if ( (LA68_1213=='!'||(LA68_1213 >= '&' && LA68_1213 <= '\'')||(LA68_1213 >= ',' && LA68_1213 <= '.')||(LA68_1213 >= '0' && LA68_1213 <= ';')||LA68_1213=='?'||(LA68_1213 >= 'A' && LA68_1213 <= 'L')||(LA68_1213 >= 'N' && LA68_1213 <= 'Z')||LA68_1213=='_'||(LA68_1213 >= 'a' && LA68_1213 <= 'r')||(LA68_1213 >= 't' && LA68_1213 <= 'z')||LA68_1213=='\u2019') ) {s = 42;}
						else s = 1326;
						 
						input.seek(index68_1213);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA68_1664 = input.LA(1);
						 
						int index68_1664 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1664==' ') && ((allowGroup))) {s = 1460;}
						else s = 1459;
						 
						input.seek(index68_1664);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA68_1214 = input.LA(1);
						 
						int index68_1214 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1214=='s') ) {s = 502;}
						else if ( ((LA68_1214 >= '\t' && LA68_1214 <= '\n')||LA68_1214=='\r'||LA68_1214==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1214=='(') ) {s = 503;}
						else if ( (LA68_1214=='M') ) {s = 504;}
						else if ( (LA68_1214=='!'||(LA68_1214 >= '&' && LA68_1214 <= '\'')||(LA68_1214 >= ',' && LA68_1214 <= '.')||(LA68_1214 >= '0' && LA68_1214 <= ';')||LA68_1214=='?'||(LA68_1214 >= 'A' && LA68_1214 <= 'L')||(LA68_1214 >= 'N' && LA68_1214 <= 'Z')||LA68_1214=='_'||(LA68_1214 >= 'a' && LA68_1214 <= 'r')||(LA68_1214 >= 't' && LA68_1214 <= 'z')||LA68_1214=='\u2019') ) {s = 42;}
						else s = 1327;
						 
						input.seek(index68_1214);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA68_1592 = input.LA(1);
						 
						int index68_1592 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1592==' ') && ((allowGroup))) {s = 1460;}
						else s = 1459;
						 
						input.seek(index68_1592);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA68_1414 = input.LA(1);
						 
						int index68_1414 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1414=='s') ) {s = 502;}
						else if ( ((LA68_1414 >= '\t' && LA68_1414 <= '\n')||LA68_1414=='\r'||LA68_1414==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1414=='(') ) {s = 503;}
						else if ( (LA68_1414=='M') ) {s = 504;}
						else if ( (LA68_1414=='!'||(LA68_1414 >= '&' && LA68_1414 <= '\'')||(LA68_1414 >= ',' && LA68_1414 <= '.')||(LA68_1414 >= '0' && LA68_1414 <= ';')||LA68_1414=='?'||(LA68_1414 >= 'A' && LA68_1414 <= 'L')||(LA68_1414 >= 'N' && LA68_1414 <= 'Z')||LA68_1414=='_'||(LA68_1414 >= 'a' && LA68_1414 <= 'r')||(LA68_1414 >= 't' && LA68_1414 <= 'z')||LA68_1414=='\u2019') ) {s = 42;}
						else s = 1481;
						 
						input.seek(index68_1414);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA68_1380 = input.LA(1);
						 
						int index68_1380 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1380==' ') && ((allowGroup))) {s = 1460;}
						else s = 1459;
						 
						input.seek(index68_1380);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA68_1480 = input.LA(1);
						 
						int index68_1480 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1480==' ') && ((allowGroup))) {s = 1460;}
						else s = 1459;
						 
						input.seek(index68_1480);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA68_1009 = input.LA(1);
						 
						int index68_1009 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1009==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1009);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA68_1619 = input.LA(1);
						 
						int index68_1619 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1619==' ') && ((allowGroup))) {s = 1460;}
						else s = 1459;
						 
						input.seek(index68_1619);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA68_946 = input.LA(1);
						 
						int index68_946 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_946=='s') ) {s = 502;}
						else if ( ((LA68_946 >= '\t' && LA68_946 <= '\n')||LA68_946=='\r'||LA68_946==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_946=='(') ) {s = 503;}
						else if ( (LA68_946=='M') ) {s = 504;}
						else if ( (LA68_946=='!'||(LA68_946 >= '&' && LA68_946 <= '\'')||(LA68_946 >= ',' && LA68_946 <= '.')||(LA68_946 >= '0' && LA68_946 <= ';')||LA68_946=='?'||(LA68_946 >= 'A' && LA68_946 <= 'L')||(LA68_946 >= 'N' && LA68_946 <= 'Z')||LA68_946=='_'||(LA68_946 >= 'a' && LA68_946 <= 'r')||(LA68_946 >= 't' && LA68_946 <= 'z')||LA68_946=='\u2019') ) {s = 42;}
						else s = 1119;
						 
						input.seek(index68_946);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA68_1120 = input.LA(1);
						 
						int index68_1120 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1120=='s') ) {s = 502;}
						else if ( ((LA68_1120 >= '\t' && LA68_1120 <= '\n')||LA68_1120=='\r'||LA68_1120==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1120=='(') ) {s = 503;}
						else if ( (LA68_1120=='M') ) {s = 504;}
						else if ( (LA68_1120=='!'||(LA68_1120 >= '&' && LA68_1120 <= '\'')||(LA68_1120 >= ',' && LA68_1120 <= '.')||(LA68_1120 >= '0' && LA68_1120 <= ';')||LA68_1120=='?'||(LA68_1120 >= 'A' && LA68_1120 <= 'L')||(LA68_1120 >= 'N' && LA68_1120 <= 'Z')||LA68_1120=='_'||(LA68_1120 >= 'a' && LA68_1120 <= 'r')||(LA68_1120 >= 't' && LA68_1120 <= 'z')||LA68_1120=='\u2019') ) {s = 42;}
						else s = 1262;
						 
						input.seek(index68_1120);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA68_546 = input.LA(1);
						 
						int index68_546 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_546=='F') && ((allowBreed))) {s = 105;}
						else if ( (LA68_546=='V') ) {s = 762;}
						 
						input.seek(index68_546);
						if ( s>=0 ) return s;
						break;

					case 180 : 
						int LA68_1189 = input.LA(1);
						 
						int index68_1189 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1189==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1189);
						if ( s>=0 ) return s;
						break;

					case 181 : 
						int LA68_1453 = input.LA(1);
						 
						int index68_1453 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1453=='s') ) {s = 502;}
						else if ( ((LA68_1453 >= '\t' && LA68_1453 <= '\n')||LA68_1453=='\r'||LA68_1453==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1453=='(') ) {s = 503;}
						else if ( (LA68_1453=='M') ) {s = 504;}
						else if ( (LA68_1453=='!'||(LA68_1453 >= '&' && LA68_1453 <= '\'')||(LA68_1453 >= ',' && LA68_1453 <= '.')||(LA68_1453 >= '0' && LA68_1453 <= ';')||LA68_1453=='?'||(LA68_1453 >= 'A' && LA68_1453 <= 'L')||(LA68_1453 >= 'N' && LA68_1453 <= 'Z')||LA68_1453=='_'||(LA68_1453 >= 'a' && LA68_1453 <= 'r')||(LA68_1453 >= 't' && LA68_1453 <= 'z')||LA68_1453=='\u2019') ) {s = 42;}
						else s = 1515;
						 
						input.seek(index68_1453);
						if ( s>=0 ) return s;
						break;

					case 182 : 
						int LA68_1193 = input.LA(1);
						 
						int index68_1193 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1193==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1193);
						if ( s>=0 ) return s;
						break;

					case 183 : 
						int LA68_430 = input.LA(1);
						 
						int index68_430 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_430==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_430);
						if ( s>=0 ) return s;
						break;

					case 184 : 
						int LA68_846 = input.LA(1);
						 
						int index68_846 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_846==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_846);
						if ( s>=0 ) return s;
						break;

					case 185 : 
						int LA68_1125 = input.LA(1);
						 
						int index68_1125 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1125=='s') ) {s = 502;}
						else if ( ((LA68_1125 >= '\t' && LA68_1125 <= '\n')||LA68_1125=='\r'||LA68_1125==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1125=='(') ) {s = 503;}
						else if ( (LA68_1125=='M') ) {s = 504;}
						else if ( (LA68_1125=='!'||(LA68_1125 >= '&' && LA68_1125 <= '\'')||(LA68_1125 >= ',' && LA68_1125 <= '.')||(LA68_1125 >= '0' && LA68_1125 <= ';')||LA68_1125=='?'||(LA68_1125 >= 'A' && LA68_1125 <= 'L')||(LA68_1125 >= 'N' && LA68_1125 <= 'Z')||LA68_1125=='_'||(LA68_1125 >= 'a' && LA68_1125 <= 'r')||(LA68_1125 >= 't' && LA68_1125 <= 'z')||LA68_1125=='\u2019') ) {s = 42;}
						else s = 1267;
						 
						input.seek(index68_1125);
						if ( s>=0 ) return s;
						break;

					case 186 : 
						int LA68_1418 = input.LA(1);
						 
						int index68_1418 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1418==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1418);
						if ( s>=0 ) return s;
						break;

					case 187 : 
						int LA68_636 = input.LA(1);
						 
						int index68_636 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_636==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_636);
						if ( s>=0 ) return s;
						break;

					case 188 : 
						int LA68_724 = input.LA(1);
						 
						int index68_724 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_724=='s') ) {s = 502;}
						else if ( ((LA68_724 >= '\t' && LA68_724 <= '\n')||LA68_724=='\r'||LA68_724==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_724=='(') ) {s = 503;}
						else if ( (LA68_724=='M') ) {s = 504;}
						else if ( (LA68_724=='!'||(LA68_724 >= '&' && LA68_724 <= '\'')||(LA68_724 >= ',' && LA68_724 <= '.')||(LA68_724 >= '0' && LA68_724 <= ';')||LA68_724=='?'||(LA68_724 >= 'A' && LA68_724 <= 'L')||(LA68_724 >= 'N' && LA68_724 <= 'Z')||LA68_724=='_'||(LA68_724 >= 'a' && LA68_724 <= 'r')||(LA68_724 >= 't' && LA68_724 <= 'z')||LA68_724=='\u2019') ) {s = 42;}
						else s = 936;
						 
						input.seek(index68_724);
						if ( s>=0 ) return s;
						break;

					case 189 : 
						int LA68_294 = input.LA(1);
						 
						int index68_294 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_294=='s') ) {s = 502;}
						else if ( ((LA68_294 >= '\t' && LA68_294 <= '\n')||LA68_294=='\r'||LA68_294==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_294=='(') ) {s = 503;}
						else if ( (LA68_294=='M') ) {s = 504;}
						else if ( (LA68_294=='!'||(LA68_294 >= '&' && LA68_294 <= '\'')||(LA68_294 >= ',' && LA68_294 <= '.')||(LA68_294 >= '0' && LA68_294 <= ';')||LA68_294=='?'||(LA68_294 >= 'A' && LA68_294 <= 'L')||(LA68_294 >= 'N' && LA68_294 <= 'Z')||LA68_294=='_'||(LA68_294 >= 'a' && LA68_294 <= 'r')||(LA68_294 >= 't' && LA68_294 <= 'z')||LA68_294=='\u2019') ) {s = 42;}
						else s = 501;
						 
						input.seek(index68_294);
						if ( s>=0 ) return s;
						break;

					case 190 : 
						int LA68_1404 = input.LA(1);
						 
						int index68_1404 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1404==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1404);
						if ( s>=0 ) return s;
						break;

					case 191 : 
						int LA68_640 = input.LA(1);
						 
						int index68_640 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_640==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_640);
						if ( s>=0 ) return s;
						break;

					case 192 : 
						int LA68_1194 = input.LA(1);
						 
						int index68_1194 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1194==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1194);
						if ( s>=0 ) return s;
						break;

					case 193 : 
						int LA68_1039 = input.LA(1);
						 
						int index68_1039 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1039==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1039);
						if ( s>=0 ) return s;
						break;

					case 194 : 
						int LA68_437 = input.LA(1);
						 
						int index68_437 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_437==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_437);
						if ( s>=0 ) return s;
						break;

					case 195 : 
						int LA68_1451 = input.LA(1);
						 
						int index68_1451 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1451=='s') ) {s = 502;}
						else if ( ((LA68_1451 >= '\t' && LA68_1451 <= '\n')||LA68_1451=='\r'||LA68_1451==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1451=='(') ) {s = 503;}
						else if ( (LA68_1451=='M') ) {s = 504;}
						else if ( (LA68_1451=='!'||(LA68_1451 >= '&' && LA68_1451 <= '\'')||(LA68_1451 >= ',' && LA68_1451 <= '.')||(LA68_1451 >= '0' && LA68_1451 <= ';')||LA68_1451=='?'||(LA68_1451 >= 'A' && LA68_1451 <= 'L')||(LA68_1451 >= 'N' && LA68_1451 <= 'Z')||LA68_1451=='_'||(LA68_1451 >= 'a' && LA68_1451 <= 'r')||(LA68_1451 >= 't' && LA68_1451 <= 'z')||LA68_1451=='\u2019') ) {s = 42;}
						else s = 1513;
						 
						input.seek(index68_1451);
						if ( s>=0 ) return s;
						break;

					case 196 : 
						int LA68_1452 = input.LA(1);
						 
						int index68_1452 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1452=='s') ) {s = 502;}
						else if ( ((LA68_1452 >= '\t' && LA68_1452 <= '\n')||LA68_1452=='\r'||LA68_1452==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1452=='(') ) {s = 503;}
						else if ( (LA68_1452=='M') ) {s = 504;}
						else if ( (LA68_1452=='!'||(LA68_1452 >= '&' && LA68_1452 <= '\'')||(LA68_1452 >= ',' && LA68_1452 <= '.')||(LA68_1452 >= '0' && LA68_1452 <= ';')||LA68_1452=='?'||(LA68_1452 >= 'A' && LA68_1452 <= 'L')||(LA68_1452 >= 'N' && LA68_1452 <= 'Z')||LA68_1452=='_'||(LA68_1452 >= 'a' && LA68_1452 <= 'r')||(LA68_1452 >= 't' && LA68_1452 <= 'z')||LA68_1452=='\u2019') ) {s = 42;}
						else s = 1514;
						 
						input.seek(index68_1452);
						if ( s>=0 ) return s;
						break;

					case 197 : 
						int LA68_700 = input.LA(1);
						 
						int index68_700 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_700=='s') ) {s = 502;}
						else if ( ((LA68_700 >= '\t' && LA68_700 <= '\n')||LA68_700=='\r'||LA68_700==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_700=='(') ) {s = 503;}
						else if ( (LA68_700=='M') ) {s = 504;}
						else if ( (LA68_700=='!'||(LA68_700 >= '&' && LA68_700 <= '\'')||(LA68_700 >= ',' && LA68_700 <= '.')||(LA68_700 >= '0' && LA68_700 <= ';')||LA68_700=='?'||(LA68_700 >= 'A' && LA68_700 <= 'L')||(LA68_700 >= 'N' && LA68_700 <= 'Z')||LA68_700=='_'||(LA68_700 >= 'a' && LA68_700 <= 'r')||(LA68_700 >= 't' && LA68_700 <= 'z')||LA68_700=='\u2019') ) {s = 42;}
						else s = 901;
						 
						input.seek(index68_700);
						if ( s>=0 ) return s;
						break;

					case 198 : 
						int LA68_1138 = input.LA(1);
						 
						int index68_1138 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1138==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1138);
						if ( s>=0 ) return s;
						break;

					case 199 : 
						int LA68_1075 = input.LA(1);
						 
						int index68_1075 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1075=='s') ) {s = 502;}
						else if ( ((LA68_1075 >= '\t' && LA68_1075 <= '\n')||LA68_1075=='\r'||LA68_1075==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1075=='(') ) {s = 503;}
						else if ( (LA68_1075=='M') ) {s = 504;}
						else if ( (LA68_1075=='!'||(LA68_1075 >= '&' && LA68_1075 <= '\'')||(LA68_1075 >= ',' && LA68_1075 <= '.')||(LA68_1075 >= '0' && LA68_1075 <= ';')||LA68_1075=='?'||(LA68_1075 >= 'A' && LA68_1075 <= 'L')||(LA68_1075 >= 'N' && LA68_1075 <= 'Z')||LA68_1075=='_'||(LA68_1075 >= 'a' && LA68_1075 <= 'r')||(LA68_1075 >= 't' && LA68_1075 <= 'z')||LA68_1075=='\u2019') ) {s = 42;}
						else s = 1222;
						 
						input.seek(index68_1075);
						if ( s>=0 ) return s;
						break;

					case 200 : 
						int LA68_1023 = input.LA(1);
						 
						int index68_1023 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1023==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1023);
						if ( s>=0 ) return s;
						break;

					case 201 : 
						int LA68_679 = input.LA(1);
						 
						int index68_679 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_679==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_679);
						if ( s>=0 ) return s;
						break;

					case 202 : 
						int LA68_1417 = input.LA(1);
						 
						int index68_1417 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1417=='s') ) {s = 502;}
						else if ( ((LA68_1417 >= '\t' && LA68_1417 <= '\n')||LA68_1417=='\r'||LA68_1417==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1417=='(') ) {s = 503;}
						else if ( (LA68_1417=='M') ) {s = 504;}
						else if ( (LA68_1417=='!'||(LA68_1417 >= '&' && LA68_1417 <= '\'')||(LA68_1417 >= ',' && LA68_1417 <= '.')||(LA68_1417 >= '0' && LA68_1417 <= ';')||LA68_1417=='?'||(LA68_1417 >= 'A' && LA68_1417 <= 'L')||(LA68_1417 >= 'N' && LA68_1417 <= 'Z')||LA68_1417=='_'||(LA68_1417 >= 'a' && LA68_1417 <= 'r')||(LA68_1417 >= 't' && LA68_1417 <= 'z')||LA68_1417=='\u2019') ) {s = 42;}
						else s = 1483;
						 
						input.seek(index68_1417);
						if ( s>=0 ) return s;
						break;

					case 203 : 
						int LA68_1186 = input.LA(1);
						 
						int index68_1186 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1186==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1186);
						if ( s>=0 ) return s;
						break;

					case 204 : 
						int LA68_905 = input.LA(1);
						 
						int index68_905 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_905=='s') ) {s = 502;}
						else if ( ((LA68_905 >= '\t' && LA68_905 <= '\n')||LA68_905=='\r'||LA68_905==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_905=='(') ) {s = 503;}
						else if ( (LA68_905=='M') ) {s = 504;}
						else if ( (LA68_905=='!'||(LA68_905 >= '&' && LA68_905 <= '\'')||(LA68_905 >= ',' && LA68_905 <= '.')||(LA68_905 >= '0' && LA68_905 <= ';')||LA68_905=='?'||(LA68_905 >= 'A' && LA68_905 <= 'L')||(LA68_905 >= 'N' && LA68_905 <= 'Z')||LA68_905=='_'||(LA68_905 >= 'a' && LA68_905 <= 'r')||(LA68_905 >= 't' && LA68_905 <= 'z')||LA68_905=='\u2019') ) {s = 42;}
						else s = 1077;
						 
						input.seek(index68_905);
						if ( s>=0 ) return s;
						break;

					case 205 : 
						int LA68_835 = input.LA(1);
						 
						int index68_835 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_835==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_835);
						if ( s>=0 ) return s;
						break;

					case 206 : 
						int LA68_1219 = input.LA(1);
						 
						int index68_1219 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1219=='s') ) {s = 502;}
						else if ( ((LA68_1219 >= '\t' && LA68_1219 <= '\n')||LA68_1219=='\r'||LA68_1219==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1219=='(') ) {s = 503;}
						else if ( (LA68_1219=='M') ) {s = 504;}
						else if ( (LA68_1219=='!'||(LA68_1219 >= '&' && LA68_1219 <= '\'')||(LA68_1219 >= ',' && LA68_1219 <= '.')||(LA68_1219 >= '0' && LA68_1219 <= ';')||LA68_1219=='?'||(LA68_1219 >= 'A' && LA68_1219 <= 'L')||(LA68_1219 >= 'N' && LA68_1219 <= 'Z')||LA68_1219=='_'||(LA68_1219 >= 'a' && LA68_1219 <= 'r')||(LA68_1219 >= 't' && LA68_1219 <= 'z')||LA68_1219=='\u2019') ) {s = 42;}
						else s = 1329;
						 
						input.seek(index68_1219);
						if ( s>=0 ) return s;
						break;

					case 207 : 
						int LA68_1392 = input.LA(1);
						 
						int index68_1392 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1392=='s') ) {s = 502;}
						else if ( ((LA68_1392 >= '\t' && LA68_1392 <= '\n')||LA68_1392=='\r'||LA68_1392==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1392=='(') ) {s = 503;}
						else if ( (LA68_1392=='M') ) {s = 504;}
						else if ( (LA68_1392=='!'||(LA68_1392 >= '&' && LA68_1392 <= '\'')||(LA68_1392 >= ',' && LA68_1392 <= '.')||(LA68_1392 >= '0' && LA68_1392 <= ';')||LA68_1392=='?'||(LA68_1392 >= 'A' && LA68_1392 <= 'L')||(LA68_1392 >= 'N' && LA68_1392 <= 'Z')||LA68_1392=='_'||(LA68_1392 >= 'a' && LA68_1392 <= 'r')||(LA68_1392 >= 't' && LA68_1392 <= 'z')||LA68_1392=='\u2019') ) {s = 42;}
						else s = 1468;
						 
						input.seek(index68_1392);
						if ( s>=0 ) return s;
						break;

					case 208 : 
						int LA68_1330 = input.LA(1);
						 
						int index68_1330 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1330=='s') ) {s = 502;}
						else if ( ((LA68_1330 >= '\t' && LA68_1330 <= '\n')||LA68_1330=='\r'||LA68_1330==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1330=='(') ) {s = 503;}
						else if ( (LA68_1330=='M') ) {s = 504;}
						else if ( (LA68_1330=='!'||(LA68_1330 >= '&' && LA68_1330 <= '\'')||(LA68_1330 >= ',' && LA68_1330 <= '.')||(LA68_1330 >= '0' && LA68_1330 <= ';')||LA68_1330=='?'||(LA68_1330 >= 'A' && LA68_1330 <= 'L')||(LA68_1330 >= 'N' && LA68_1330 <= 'Z')||LA68_1330=='_'||(LA68_1330 >= 'a' && LA68_1330 <= 'r')||(LA68_1330 >= 't' && LA68_1330 <= 'z')||LA68_1330=='\u2019') ) {s = 42;}
						else s = 1416;
						 
						input.seek(index68_1330);
						if ( s>=0 ) return s;
						break;

					case 209 : 
						int LA68_838 = input.LA(1);
						 
						int index68_838 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_838==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_838);
						if ( s>=0 ) return s;
						break;

					case 210 : 
						int LA68_1265 = input.LA(1);
						 
						int index68_1265 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1265==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1265);
						if ( s>=0 ) return s;
						break;

					case 211 : 
						int LA68_1187 = input.LA(1);
						 
						int index68_1187 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1187==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1187);
						if ( s>=0 ) return s;
						break;

					case 212 : 
						int LA68_659 = input.LA(1);
						 
						int index68_659 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_659==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_659);
						if ( s>=0 ) return s;
						break;

					case 213 : 
						int LA68_1153 = input.LA(1);
						 
						int index68_1153 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1153=='s') ) {s = 502;}
						else if ( ((LA68_1153 >= '\t' && LA68_1153 <= '\n')||LA68_1153=='\r'||LA68_1153==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1153=='(') ) {s = 503;}
						else if ( (LA68_1153=='M') ) {s = 504;}
						else if ( (LA68_1153=='!'||(LA68_1153 >= '&' && LA68_1153 <= '\'')||(LA68_1153 >= ',' && LA68_1153 <= '.')||(LA68_1153 >= '0' && LA68_1153 <= ';')||LA68_1153=='?'||(LA68_1153 >= 'A' && LA68_1153 <= 'L')||(LA68_1153 >= 'N' && LA68_1153 <= 'Z')||LA68_1153=='_'||(LA68_1153 >= 'a' && LA68_1153 <= 'r')||(LA68_1153 >= 't' && LA68_1153 <= 'z')||LA68_1153=='\u2019') ) {s = 42;}
						else s = 1285;
						 
						input.seek(index68_1153);
						if ( s>=0 ) return s;
						break;

					case 214 : 
						int LA68_1477 = input.LA(1);
						 
						int index68_1477 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1477==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1477);
						if ( s>=0 ) return s;
						break;

					case 215 : 
						int LA68_249 = input.LA(1);
						 
						int index68_249 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_249==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_249);
						if ( s>=0 ) return s;
						break;

					case 216 : 
						int LA68_1620 = input.LA(1);
						 
						int index68_1620 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1620=='s') ) {s = 502;}
						else if ( ((LA68_1620 >= '\t' && LA68_1620 <= '\n')||LA68_1620=='\r'||LA68_1620==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1620=='(') ) {s = 503;}
						else if ( (LA68_1620=='M') ) {s = 504;}
						else if ( (LA68_1620=='!'||(LA68_1620 >= '&' && LA68_1620 <= '\'')||(LA68_1620 >= ',' && LA68_1620 <= '.')||(LA68_1620 >= '0' && LA68_1620 <= ';')||LA68_1620=='?'||(LA68_1620 >= 'A' && LA68_1620 <= 'L')||(LA68_1620 >= 'N' && LA68_1620 <= 'Z')||LA68_1620=='_'||(LA68_1620 >= 'a' && LA68_1620 <= 'r')||(LA68_1620 >= 't' && LA68_1620 <= 'z')||LA68_1620=='\u2019') ) {s = 42;}
						else s = 1638;
						 
						input.seek(index68_1620);
						if ( s>=0 ) return s;
						break;

					case 217 : 
						int LA68_1478 = input.LA(1);
						 
						int index68_1478 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1478==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1478);
						if ( s>=0 ) return s;
						break;

					case 218 : 
						int LA68_975 = input.LA(1);
						 
						int index68_975 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_975=='s') ) {s = 502;}
						else if ( ((LA68_975 >= '\t' && LA68_975 <= '\n')||LA68_975=='\r'||LA68_975==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_975=='(') ) {s = 503;}
						else if ( (LA68_975=='M') ) {s = 504;}
						else if ( (LA68_975=='!'||(LA68_975 >= '&' && LA68_975 <= '\'')||(LA68_975 >= ',' && LA68_975 <= '.')||(LA68_975 >= '0' && LA68_975 <= ';')||LA68_975=='?'||(LA68_975 >= 'A' && LA68_975 <= 'L')||(LA68_975 >= 'N' && LA68_975 <= 'Z')||LA68_975=='_'||(LA68_975 >= 'a' && LA68_975 <= 'r')||(LA68_975 >= 't' && LA68_975 <= 'z')||LA68_975=='\u2019') ) {s = 42;}
						else s = 1146;
						 
						input.seek(index68_975);
						if ( s>=0 ) return s;
						break;

					case 219 : 
						int LA68_869 = input.LA(1);
						 
						int index68_869 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_869==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_869);
						if ( s>=0 ) return s;
						break;

					case 220 : 
						int LA68_1531 = input.LA(1);
						 
						int index68_1531 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1531==' ') && ((allowGroup))) {s = 1460;}
						else s = 1459;
						 
						input.seek(index68_1531);
						if ( s>=0 ) return s;
						break;

					case 221 : 
						int LA68_833 = input.LA(1);
						 
						int index68_833 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_833==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_833);
						if ( s>=0 ) return s;
						break;

					case 222 : 
						int LA68_461 = input.LA(1);
						 
						int index68_461 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_461==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_461);
						if ( s>=0 ) return s;
						break;

					case 223 : 
						int LA68_666 = input.LA(1);
						 
						int index68_666 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_666==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_666);
						if ( s>=0 ) return s;
						break;

					case 224 : 
						int LA68_1462 = input.LA(1);
						 
						int index68_1462 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1462=='s') ) {s = 502;}
						else if ( ((LA68_1462 >= '\t' && LA68_1462 <= '\n')||LA68_1462=='\r'||LA68_1462==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1462=='(') ) {s = 503;}
						else if ( (LA68_1462=='M') ) {s = 504;}
						else if ( (LA68_1462=='!'||(LA68_1462 >= '&' && LA68_1462 <= '\'')||(LA68_1462 >= ',' && LA68_1462 <= '.')||(LA68_1462 >= '0' && LA68_1462 <= ';')||LA68_1462=='?'||(LA68_1462 >= 'A' && LA68_1462 <= 'L')||(LA68_1462 >= 'N' && LA68_1462 <= 'Z')||LA68_1462=='_'||(LA68_1462 >= 'a' && LA68_1462 <= 'r')||(LA68_1462 >= 't' && LA68_1462 <= 'z')||LA68_1462=='\u2019') ) {s = 42;}
						else s = 1522;
						 
						input.seek(index68_1462);
						if ( s>=0 ) return s;
						break;

					case 225 : 
						int LA68_1040 = input.LA(1);
						 
						int index68_1040 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1040==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1040);
						if ( s>=0 ) return s;
						break;

					case 226 : 
						int LA68_854 = input.LA(1);
						 
						int index68_854 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_854==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_854);
						if ( s>=0 ) return s;
						break;

					case 227 : 
						int LA68_1532 = input.LA(1);
						 
						int index68_1532 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1532==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1532);
						if ( s>=0 ) return s;
						break;

					case 228 : 
						int LA68_859 = input.LA(1);
						 
						int index68_859 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_859==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_859);
						if ( s>=0 ) return s;
						break;

					case 229 : 
						int LA68_698 = input.LA(1);
						 
						int index68_698 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_698==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_698=='s') ) {s = 899;}
						else s = 42;
						 
						input.seek(index68_698);
						if ( s>=0 ) return s;
						break;

					case 230 : 
						int LA68_1200 = input.LA(1);
						 
						int index68_1200 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1200==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1200);
						if ( s>=0 ) return s;
						break;

					case 231 : 
						int LA68_447 = input.LA(1);
						 
						int index68_447 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_447==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_447);
						if ( s>=0 ) return s;
						break;

					case 232 : 
						int LA68_1686 = input.LA(1);
						 
						int index68_1686 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1686);
						if ( s>=0 ) return s;
						break;

					case 233 : 
						int LA68_1638 = input.LA(1);
						 
						int index68_1638 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1638);
						if ( s>=0 ) return s;
						break;

					case 234 : 
						int LA68_1632 = input.LA(1);
						 
						int index68_1632 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1632);
						if ( s>=0 ) return s;
						break;

					case 235 : 
						int LA68_1616 = input.LA(1);
						 
						int index68_1616 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1616);
						if ( s>=0 ) return s;
						break;

					case 236 : 
						int LA68_1614 = input.LA(1);
						 
						int index68_1614 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1614);
						if ( s>=0 ) return s;
						break;

					case 237 : 
						int LA68_1597 = input.LA(1);
						 
						int index68_1597 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1597);
						if ( s>=0 ) return s;
						break;

					case 238 : 
						int LA68_1564 = input.LA(1);
						 
						int index68_1564 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1564);
						if ( s>=0 ) return s;
						break;

					case 239 : 
						int LA68_725 = input.LA(1);
						 
						int index68_725 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_725);
						if ( s>=0 ) return s;
						break;

					case 240 : 
						int LA68_706 = input.LA(1);
						 
						int index68_706 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_706);
						if ( s>=0 ) return s;
						break;

					case 241 : 
						int LA68_501 = input.LA(1);
						 
						int index68_501 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_501);
						if ( s>=0 ) return s;
						break;

					case 242 : 
						int LA68_813 = input.LA(1);
						 
						int index68_813 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_813);
						if ( s>=0 ) return s;
						break;

					case 243 : 
						int LA68_837 = input.LA(1);
						 
						int index68_837 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_837);
						if ( s>=0 ) return s;
						break;

					case 244 : 
						int LA68_839 = input.LA(1);
						 
						int index68_839 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_839);
						if ( s>=0 ) return s;
						break;

					case 245 : 
						int LA68_901 = input.LA(1);
						 
						int index68_901 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_901);
						if ( s>=0 ) return s;
						break;

					case 246 : 
						int LA68_936 = input.LA(1);
						 
						int index68_936 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_936);
						if ( s>=0 ) return s;
						break;

					case 247 : 
						int LA68_1016 = input.LA(1);
						 
						int index68_1016 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1016);
						if ( s>=0 ) return s;
						break;

					case 248 : 
						int LA68_1026 = input.LA(1);
						 
						int index68_1026 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1026);
						if ( s>=0 ) return s;
						break;

					case 249 : 
						int LA68_1028 = input.LA(1);
						 
						int index68_1028 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1028);
						if ( s>=0 ) return s;
						break;

					case 250 : 
						int LA68_1041 = input.LA(1);
						 
						int index68_1041 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1041);
						if ( s>=0 ) return s;
						break;

					case 251 : 
						int LA68_1065 = input.LA(1);
						 
						int index68_1065 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1065);
						if ( s>=0 ) return s;
						break;

					case 252 : 
						int LA68_1077 = input.LA(1);
						 
						int index68_1077 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1077);
						if ( s>=0 ) return s;
						break;

					case 253 : 
						int LA68_1119 = input.LA(1);
						 
						int index68_1119 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1119);
						if ( s>=0 ) return s;
						break;

					case 254 : 
						int LA68_1146 = input.LA(1);
						 
						int index68_1146 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1146);
						if ( s>=0 ) return s;
						break;

					case 255 : 
						int LA68_1164 = input.LA(1);
						 
						int index68_1164 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1164);
						if ( s>=0 ) return s;
						break;

					case 256 : 
						int LA68_1165 = input.LA(1);
						 
						int index68_1165 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1165);
						if ( s>=0 ) return s;
						break;

					case 257 : 
						int LA68_1181 = input.LA(1);
						 
						int index68_1181 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1181);
						if ( s>=0 ) return s;
						break;

					case 258 : 
						int LA68_1190 = input.LA(1);
						 
						int index68_1190 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1190);
						if ( s>=0 ) return s;
						break;

					case 259 : 
						int LA68_1206 = input.LA(1);
						 
						int index68_1206 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1206);
						if ( s>=0 ) return s;
						break;

					case 260 : 
						int LA68_1218 = input.LA(1);
						 
						int index68_1218 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1218);
						if ( s>=0 ) return s;
						break;

					case 261 : 
						int LA68_1222 = input.LA(1);
						 
						int index68_1222 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1222);
						if ( s>=0 ) return s;
						break;

					case 262 : 
						int LA68_1262 = input.LA(1);
						 
						int index68_1262 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1262);
						if ( s>=0 ) return s;
						break;

					case 263 : 
						int LA68_1267 = input.LA(1);
						 
						int index68_1267 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1267);
						if ( s>=0 ) return s;
						break;

					case 264 : 
						int LA68_1285 = input.LA(1);
						 
						int index68_1285 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1285);
						if ( s>=0 ) return s;
						break;

					case 265 : 
						int LA68_1308 = input.LA(1);
						 
						int index68_1308 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1308);
						if ( s>=0 ) return s;
						break;

					case 266 : 
						int LA68_1320 = input.LA(1);
						 
						int index68_1320 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1320);
						if ( s>=0 ) return s;
						break;

					case 267 : 
						int LA68_1325 = input.LA(1);
						 
						int index68_1325 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1325);
						if ( s>=0 ) return s;
						break;

					case 268 : 
						int LA68_1326 = input.LA(1);
						 
						int index68_1326 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1326);
						if ( s>=0 ) return s;
						break;

					case 269 : 
						int LA68_1327 = input.LA(1);
						 
						int index68_1327 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1327);
						if ( s>=0 ) return s;
						break;

					case 270 : 
						int LA68_1329 = input.LA(1);
						 
						int index68_1329 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1329);
						if ( s>=0 ) return s;
						break;

					case 271 : 
						int LA68_1366 = input.LA(1);
						 
						int index68_1366 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1366);
						if ( s>=0 ) return s;
						break;

					case 272 : 
						int LA68_1374 = input.LA(1);
						 
						int index68_1374 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1374);
						if ( s>=0 ) return s;
						break;

					case 273 : 
						int LA68_1399 = input.LA(1);
						 
						int index68_1399 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1399);
						if ( s>=0 ) return s;
						break;

					case 274 : 
						int LA68_1405 = input.LA(1);
						 
						int index68_1405 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1405);
						if ( s>=0 ) return s;
						break;

					case 275 : 
						int LA68_1407 = input.LA(1);
						 
						int index68_1407 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1407);
						if ( s>=0 ) return s;
						break;

					case 276 : 
						int LA68_1408 = input.LA(1);
						 
						int index68_1408 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1408);
						if ( s>=0 ) return s;
						break;

					case 277 : 
						int LA68_1411 = input.LA(1);
						 
						int index68_1411 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1411);
						if ( s>=0 ) return s;
						break;

					case 278 : 
						int LA68_1416 = input.LA(1);
						 
						int index68_1416 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1416);
						if ( s>=0 ) return s;
						break;

					case 279 : 
						int LA68_1468 = input.LA(1);
						 
						int index68_1468 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1468);
						if ( s>=0 ) return s;
						break;

					case 280 : 
						int LA68_1473 = input.LA(1);
						 
						int index68_1473 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1473);
						if ( s>=0 ) return s;
						break;

					case 281 : 
						int LA68_1481 = input.LA(1);
						 
						int index68_1481 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1481);
						if ( s>=0 ) return s;
						break;

					case 282 : 
						int LA68_1482 = input.LA(1);
						 
						int index68_1482 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1482);
						if ( s>=0 ) return s;
						break;

					case 283 : 
						int LA68_1483 = input.LA(1);
						 
						int index68_1483 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1483);
						if ( s>=0 ) return s;
						break;

					case 284 : 
						int LA68_1513 = input.LA(1);
						 
						int index68_1513 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1513);
						if ( s>=0 ) return s;
						break;

					case 285 : 
						int LA68_1514 = input.LA(1);
						 
						int index68_1514 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1514);
						if ( s>=0 ) return s;
						break;

					case 286 : 
						int LA68_1515 = input.LA(1);
						 
						int index68_1515 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1515);
						if ( s>=0 ) return s;
						break;

					case 287 : 
						int LA68_1522 = input.LA(1);
						 
						int index68_1522 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1522);
						if ( s>=0 ) return s;
						break;

					case 288 : 
						int LA68_1530 = input.LA(1);
						 
						int index68_1530 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index68_1530);
						if ( s>=0 ) return s;
						break;

					case 289 : 
						int LA68_669 = input.LA(1);
						 
						int index68_669 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_669==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_669=='e') ) {s = 875;}
						else s = 42;
						 
						input.seek(index68_669);
						if ( s>=0 ) return s;
						break;

					case 290 : 
						int LA68_861 = input.LA(1);
						 
						int index68_861 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_861==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_861);
						if ( s>=0 ) return s;
						break;

					case 291 : 
						int LA68_830 = input.LA(1);
						 
						int index68_830 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_830==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_830=='s') ) {s = 1023;}
						else s = 42;
						 
						input.seek(index68_830);
						if ( s>=0 ) return s;
						break;

					case 292 : 
						int LA68_1176 = input.LA(1);
						 
						int index68_1176 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1176==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1176);
						if ( s>=0 ) return s;
						break;

					case 293 : 
						int LA68_1270 = input.LA(1);
						 
						int index68_1270 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1270=='s') ) {s = 502;}
						else if ( ((LA68_1270 >= '\t' && LA68_1270 <= '\n')||LA68_1270=='\r'||LA68_1270==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA68_1270=='(') ) {s = 503;}
						else if ( (LA68_1270=='M') ) {s = 504;}
						else if ( (LA68_1270=='!'||(LA68_1270 >= '&' && LA68_1270 <= '\'')||(LA68_1270 >= ',' && LA68_1270 <= '.')||(LA68_1270 >= '0' && LA68_1270 <= ';')||LA68_1270=='?'||(LA68_1270 >= 'A' && LA68_1270 <= 'L')||(LA68_1270 >= 'N' && LA68_1270 <= 'Z')||LA68_1270=='_'||(LA68_1270 >= 'a' && LA68_1270 <= 'r')||(LA68_1270 >= 't' && LA68_1270 <= 'z')||LA68_1270=='\u2019') ) {s = 42;}
						else s = 1374;
						 
						input.seek(index68_1270);
						if ( s>=0 ) return s;
						break;

					case 294 : 
						int LA68_1398 = input.LA(1);
						 
						int index68_1398 = input.index();
						input.rewind();
						s = -1;
						if ( (LA68_1398==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index68_1398);
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
