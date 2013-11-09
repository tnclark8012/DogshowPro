// $ANTLR 3.5 C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-11-08 22:09:58

package dev.tclark.dogshow.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
	public static final int FRAG_GROUP_NAME=18;
	public static final int FRAG_MONTH=19;
	public static final int FRAG_PROPER_NAME=20;
	public static final int FRAG_RING=21;
	public static final int FRAG_SPECIAL_GROUP_NAME=22;
	public static final int FRAG_SPEC_CHAR=23;
	public static final int FRAG_SPEC_WORD_CHAR=24;
	public static final int FRAG_TIME_LABEL=25;
	public static final int FRAG_TITLE=26;
	public static final int FRAG_WEEK_DAY=27;
	public static final int FallThrough=28;
	public static final int GROUP_RING=29;
	public static final int INT=30;
	public static final int JUDGE_NAME=31;
	public static final int JUNIOR_CLASS=32;
	public static final int NON_CONFORMATION_CLASS_LEVEL=33;
	public static final int NON_CONFORMATION_CLASS_NAME=34;
	public static final int NON_CONFORMATION_SECOND_LINE=35;
	public static final int NON_CONF_SECOND_LINE=36;
	public static final int NON_CONF_SECOND_LINE_COMMENT=37;
	public static final int PARENTHETICAL=38;
	public static final int PARENTHETICAL_INT=39;
	public static final int PARENTHETICAL_NAME=40;
	public static final int PHONE_NUMBER=41;
	public static final int RALLY_CLASS=42;
	public static final int RALLY_CLASS_LEVEL=43;
	public static final int RALLY_CLASS_NAME=44;
	public static final int RALLY_CLASS_TYPE=45;
	public static final int RALLY_CLASS_WITH_TYPE=46;
	public static final int RALLY_RING_LINE=47;
	public static final int RALLY_STANDALONE_COMMENT=48;
	public static final int RALLY_TOKEN=49;
	public static final int RALLY_TOKEN_WITH_TYPE=50;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
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
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
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
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:9: 'Master Class'
					{
					match("Master Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:9: 'Open Senior'
					{
					match("Open Senior"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:9: 'Open Intermediate'
					{
					match("Open Intermediate"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:9: 'Open Junior'
					{
					match("Open Junior"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:9: 'Novice Senior'
					{
					match("Novice Senior"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:9: 'Novice Junior'
					{
					match("Novice Junior"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:9: 'Novice Intermediate'
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

	// $ANTLR start "FRAG_BREED_NAME_SINGLE"
	public final void mFRAG_BREED_NAME_SINGLE() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:5: ({...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:7: {...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "FRAG_BREED_NAME_SINGLE", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=198;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:24: 'Affenpinscher'
					{
					match("Affenpinscher"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:5: 'Afghan Hound'
					{
					match("Afghan Hound"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:5: 'Akita'
					{
					match("Akita"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:5: 'American English Coonhound'
					{
					match("American English Coonhound"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:5: 'American Foxhound'
					{
					match("American Foxhound"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:2: 'Appenzeller Sennenhunde'
					{
					match("Appenzeller Sennenhunde"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:5: 'Australian Terrier'
					{
					match("Australian Terrier"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:5: 'Basenji'
					{
					match("Basenji"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:5: 'Basset Hound'
					{
					match("Basset Hound"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: 'Beagle'
					{
					match("Beagle"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:5: 'Bearded Collie'
					{
					match("Bearded Collie"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:5: 'Beauceron'
					{
					match("Beauceron"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:5: 'Berger Picard'
					{
					match("Berger Picard"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:5: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: 'Bichons Frise'
					{
					match("Bichons Frise"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:5: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:5: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:263:5: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:5: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:5: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:5: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:272:5: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:273:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:5: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:275:5: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:276:5: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:277:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:5: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:283:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:5: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:5: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:286:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:287:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:289:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:290:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:292:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:5: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:5: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:5: 'Dogo Argentine'
					{
					match("Dogo Argentine"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:5: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:5: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:5: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:308:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:309:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:5: 'Fox Terrier'
					{
					match("Fox Terrier"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:5: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:312:5: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:5: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:5: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:5: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:5: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:5: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:5: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:5: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:5: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:5: 'Keeshonden'
					{
					match("Keeshonden"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:5: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:5: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:5: 'Kuvaszok'
					{
					match("Kuvaszok"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:341:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:342:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:343:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:5: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:345:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:5: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:5: 'Lowchen'
					{
					match("Lowchen"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:5: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:5: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:354:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:5: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:357:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:360:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:5: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:5: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:5: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:5: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:5: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:5: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:5: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:5: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:380:5: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:5: 'Pulik'
					{
					match("Pulik"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:5: 'Rat Terrier'
					{
					match("Rat Terrier"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:5: 'Retrievers'
					{
					match("Retrievers"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:5: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:5: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:5: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:5: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:5: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:5: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:5: 'Setters'
					{
					match("Setters"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:397:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:398:5: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:5: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:5: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:5: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:5: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:5: 'Spaniels'
					{
					match("Spaniels"); 

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:406:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:5: 'Spinoni Italiani'
					{
					match("Spinoni Italiani"); 

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:410:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:411:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:412:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:417:5: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:5: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 191 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 192 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 193 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:5: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 194 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 195 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 196 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:2: 'Wirehaired Vizsla'
					{
					match("Wirehaired Vizsla"); 

					}
					break;
				case 197 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 198 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:427:5: 'Yorkshire Terrier'
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

	// $ANTLR start "BREED_NAME"
	public final void mBREED_NAME() throws RecognitionException {
		try {
			int _type = BREED_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:5: ({...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:7: {...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "BREED_NAME", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:22: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 'A' && LA3_0 <= 'P')||(LA3_0 >= 'R' && LA3_0 <= 'T')||(LA3_0 >= 'W' && LA3_0 <= 'Y')) && ((allowBreed))) {
				alt3=1;
			}
			else if ( (LA3_0=='V') ) {
				int LA3_2 = input.LA(2);
				if ( (LA3_2=='i') && ((allowBreed))) {
					alt3=1;
				}
				else if ( (LA3_2=='e') ) {
					alt3=2;
				}

				else {
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:23: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:46: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:67: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:67: 's'
					{
					match('s'); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:72: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:72: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:76: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:77: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); 
					mFRAG_BREED_NAME_CATEGORY(); 

					match(')'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:110: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:110: WS
							{
							mWS(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:114: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:114: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); 

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:150: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='('||LA9_0=='M') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:150: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:5: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:10: FRAG_BREED_NAME_SPECIAL_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:5: ( ( '(' BREED_MISC ')' ) | BREED_MISC )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='(') ) {
				alt10=1;
			}
			else if ( (LA10_0=='M') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:9: ( '(' BREED_MISC ')' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:9: ( '(' BREED_MISC ')' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:10: '(' BREED_MISC ')'
					{
					match('('); 
					mBREED_MISC(); 

					match(')'); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:28: BREED_MISC
					{
					mBREED_MISC(); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:2: ( 'Misc. Dog' | 'Misc. Dogs' | 'Misc. Bitch' | 'Misc. Bitches' )
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
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 11, 9, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
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
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 11, 15, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 11, 12, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 11, 10, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
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
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:2: 'Misc. Dog'
					{
					match("Misc. Dog"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:14: 'Misc. Dogs'
					{
					match("Misc. Dogs"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:27: 'Misc. Bitch'
					{
					match("Misc. Bitch"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:41: 'Misc. Bitches'
					{
					match("Misc. Bitches"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:5: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
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
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 12, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 4, input);
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
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:10: 'Sweepstakes'
					{
					match("Sweepstakes"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:24: 'Entry'
					{
					match("Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:32: 'Entries'
					{
					match("Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:42: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:29: ( 'Veteran Dog' | 'Veteran Bitch' | 'Veteran Bitche' )
			int alt13=3;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='V') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='e') ) {
					int LA13_2 = input.LA(3);
					if ( (LA13_2=='t') ) {
						int LA13_3 = input.LA(4);
						if ( (LA13_3=='e') ) {
							int LA13_4 = input.LA(5);
							if ( (LA13_4=='r') ) {
								int LA13_5 = input.LA(6);
								if ( (LA13_5=='a') ) {
									int LA13_6 = input.LA(7);
									if ( (LA13_6=='n') ) {
										int LA13_7 = input.LA(8);
										if ( (LA13_7==' ') ) {
											int LA13_8 = input.LA(9);
											if ( (LA13_8=='D') ) {
												alt13=1;
											}
											else if ( (LA13_8=='B') ) {
												int LA13_10 = input.LA(10);
												if ( (LA13_10=='i') ) {
													int LA13_11 = input.LA(11);
													if ( (LA13_11=='t') ) {
														int LA13_12 = input.LA(12);
														if ( (LA13_12=='c') ) {
															int LA13_13 = input.LA(13);
															if ( (LA13_13=='h') ) {
																int LA13_14 = input.LA(14);
																if ( (LA13_14=='e') ) {
																	alt13=3;
																}

																else {
																	alt13=2;
																}

															}

															else {
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++) {
																		input.consume();
																	}
																	NoViableAltException nvae =
																		new NoViableAltException("", 13, 13, input);
																	throw nvae;
																} finally {
																	input.rewind(nvaeMark);
																}
															}

														}

														else {
															int nvaeMark = input.mark();
															try {
																for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++) {
																	input.consume();
																}
																NoViableAltException nvae =
																	new NoViableAltException("", 13, 12, input);
																throw nvae;
															} finally {
																input.rewind(nvaeMark);
															}
														}

													}

													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 13, 11, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 13, 10, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 13, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 13, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 13, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 13, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 13, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 13, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 2, input);
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
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:33: 'Veteran Dog'
					{
					match("Veteran Dog"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:47: 'Veteran Bitch'
					{
					match("Veteran Bitch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:63: 'Veteran Bitche'
					{
					match("Veteran Bitche"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
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
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:9: 'Ascob'
					{
					match("Ascob"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:17: 'Parti-Color'
					{
					match("Parti-Color"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:31: 'Black'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:5: ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt15=38;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:9: '13 Inch'
					{
					match("13 Inch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:9: '15 Inch'
					{
					match("15 Inch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:9: 'American Water'
					{
					match("American Water"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:9: 'Boykin'
					{
					match("Boykin"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:9: 'B & P C'
					{
					match("B & P C"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:9: 'Clumber'
					{
					match("Clumber"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:455:9: 'Cocker'
					{
					match("Cocker"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:9: 'Colored'
					{
					match("Colored"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:457:9: 'Curly-Coated'
					{
					match("Curly-Coated"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:9: 'English'
					{
					match("English"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:9: 'English Cocker'
					{
					match("English Cocker"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:460:9: 'English Springer'
					{
					match("English Springer"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:9: 'Field'
					{
					match("Field"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:9: 'Flat-Coated'
					{
					match("Flat-Coated"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:9: 'German Shorthaired'
					{
					match("German Shorthaired"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:9: 'German Wirehaired'
					{
					match("German Wirehaired"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:9: 'Golden'
					{
					match("Golden"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:9: 'Gordon'
					{
					match("Gordon"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:9: 'Irish'
					{
					match("Irish"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:2: 'Irish Red And White'
					{
					match("Irish Red And White"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:9: 'Irish Water'
					{
					match("Irish Water"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:9: 'K C & R'
					{
					match("K C & R"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:471:9: 'Labrador'
					{
					match("Labrador"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:472:9: 'Long Coat'
					{
					match("Long Coat"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:473:9: 'Longhaired'
					{
					match("Longhaired"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:474:9: 'Miniature'
					{
					match("Miniature"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:475:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:476:9: 'Rough'
					{
					match("Rough"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:477:9: 'Smooth'
					{
					match("Smooth"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:478:9: 'Smooth Coat'
					{
					match("Smooth Coat"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:479:9: 'Standard'
					{
					match("Standard"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:480:9: 'Sussex'
					{
					match("Sussex"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:481:9: 'Toy'
					{
					match("Toy"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:482:9: 'Welsh Springer'
					{
					match("Welsh Springer"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:483:9: 'White'
					{
					match("White"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:484:9: 'Wire'
					{
					match("Wire"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:485:9: 'Wirehaired'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:492:2: ({...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:492:3: {...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
			{
			if ( !((allowGroup)) ) {
				throw new FailedPredicateException(input, "FRAG_GROUP_NAME", "allowGroup");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:492:18: ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
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
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:492:20: 'HERDING GROUP'
					{
					match("HERDING GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:493:3: 'TERRIER GROUP'
					{
					match("TERRIER GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:3: 'NON-SPORTING GROUP'
					{
					match("NON-SPORTING GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:495:3: 'SPORTING GROUP'
					{
					match("SPORTING GROUP"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:496:3: 'TOY GROUP'
					{
					match("TOY GROUP"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:497:3: 'HOUND GROUP'
					{
					match("HOUND GROUP"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:3: 'WORKING GROUP'
					{
					match("WORKING GROUP"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:499:3: ( 'BEST IN SHOW' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:499:3: ( 'BEST IN SHOW' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:499:4: 'BEST IN SHOW'
					{
					match("BEST IN SHOW"); 

					allowGroup=false;
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
	// $ANTLR end "FRAG_GROUP_NAME"

	// $ANTLR start "FRAG_SPECIAL_GROUP_NAME"
	public final void mFRAG_SPECIAL_GROUP_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
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
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:503:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:504:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:506:3: 'Toy Variety Group'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:509:2: ( ( FRAG_GROUP_NAME ' - ' JUDGE_NAME ) | FRAG_SPECIAL_GROUP_NAME )
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
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:509:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:509:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:509:5: FRAG_GROUP_NAME ' - ' JUDGE_NAME
					{
					mFRAG_GROUP_NAME(); 

					match(" - "); 

					mJUDGE_NAME(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:509:39: FRAG_SPECIAL_GROUP_NAME
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

	// $ANTLR start "NON_CONFORMATION_CLASS_NAME"
	public final void mNON_CONFORMATION_CLASS_NAME() throws RecognitionException {
		try {
			int _type = NON_CONFORMATION_CLASS_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:527:29: ( NON_CONFORMATION_CLASS_LEVEL ( WS 'Class' )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:528:2: NON_CONFORMATION_CLASS_LEVEL ( WS 'Class' )?
			{
			mNON_CONFORMATION_CLASS_LEVEL(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:528:31: ( WS 'Class' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||LA19_0=='\r'||LA19_0==' ') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:528:32: WS 'Class'
					{
					mWS(); 

					match("Class"); 

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

	// $ANTLR start "NON_CONFORMATION_CLASS_LEVEL"
	public final void mNON_CONFORMATION_CLASS_LEVEL() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:547:2: ( 'Beginner Novice A' | 'Beginner Novice B' | 'Utility A' | 'Utility B' | 'Pre Open' | 'Pre Utility' | 'Open A' | 'Open B' | 'Novice A' | 'Novice B' | 'Wild Card Novice' | 'Wild Card Utility' | 'Graduate Novice' | 'Versatility' | 'Veterans' )
			int alt20=15;
			alt20 = dfa20.predict(input);
			switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:548:2: 'Beginner Novice A'
					{
					match("Beginner Novice A"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:549:2: 'Beginner Novice B'
					{
					match("Beginner Novice B"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:550:2: 'Utility A'
					{
					match("Utility A"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:551:2: 'Utility B'
					{
					match("Utility B"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:552:2: 'Pre Open'
					{
					match("Pre Open"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:553:2: 'Pre Utility'
					{
					match("Pre Utility"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:554:2: 'Open A'
					{
					match("Open A"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:555:2: 'Open B'
					{
					match("Open B"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:556:2: 'Novice A'
					{
					match("Novice A"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:557:2: 'Novice B'
					{
					match("Novice B"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:558:2: 'Wild Card Novice'
					{
					match("Wild Card Novice"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:559:2: 'Wild Card Utility'
					{
					match("Wild Card Utility"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:560:2: 'Graduate Novice'
					{
					match("Graduate Novice"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:561:2: 'Versatility'
					{
					match("Versatility"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:562:2: 'Veterans'
					{
					match("Veterans"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NON_CONFORMATION_CLASS_LEVEL"

	// $ANTLR start "NON_CONF_SECOND_LINE"
	public final void mNON_CONF_SECOND_LINE() throws RecognitionException {
		try {
			int _type = NON_CONF_SECOND_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:2: ( NON_CONFORMATION_SECOND_LINE )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:4: NON_CONFORMATION_SECOND_LINE
			{
			mNON_CONFORMATION_SECOND_LINE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NON_CONF_SECOND_LINE"

	// $ANTLR start "NON_CONF_SECOND_LINE_COMMENT"
	public final void mNON_CONF_SECOND_LINE_COMMENT() throws RecognitionException {
		try {
			int _type = NON_CONF_SECOND_LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:568:2: ( 'To follow' WS NON_CONFORMATION_CLASS_LEVEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:569:2: 'To follow' WS NON_CONFORMATION_CLASS_LEVEL
			{
			match("To follow"); 

			mWS(); 

			mNON_CONFORMATION_CLASS_LEVEL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NON_CONF_SECOND_LINE_COMMENT"

	// $ANTLR start "RALLY_TOKEN_WITH_TYPE"
	public final void mRALLY_TOKEN_WITH_TYPE() throws RecognitionException {
		try {
			int _type = RALLY_TOKEN_WITH_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:571:2: ( RALLY_CLASS_WITH_TYPE )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:571:4: RALLY_CLASS_WITH_TYPE
			{
			mRALLY_CLASS_WITH_TYPE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_TOKEN_WITH_TYPE"

	// $ANTLR start "RALLY_STANDALONE_COMMENT"
	public final void mRALLY_STANDALONE_COMMENT() throws RecognitionException {
		try {
			int _type = RALLY_STANDALONE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:2: ( ( 'Walkthrough' ) | ( 'To follow' WS RALLY_CLASS_NAME ) ( RALLY_CLASS_TYPE )? )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='W') ) {
				alt22=1;
			}
			else if ( (LA22_0=='T') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:4: ( 'Walkthrough' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:4: ( 'Walkthrough' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:575:5: 'Walkthrough'
					{
					match("Walkthrough"); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:576:2: ( 'To follow' WS RALLY_CLASS_NAME ) ( RALLY_CLASS_TYPE )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:576:2: ( 'To follow' WS RALLY_CLASS_NAME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:576:3: 'To follow' WS RALLY_CLASS_NAME
					{
					match("To follow"); 

					mWS(); 

					mRALLY_CLASS_NAME(); 

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:576:36: ( RALLY_CLASS_TYPE )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( ((LA21_0 >= 'A' && LA21_0 <= 'B')) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
							{
							if ( (input.LA(1) >= 'A' && input.LA(1) <= 'B') ) {
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
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_STANDALONE_COMMENT"

	// $ANTLR start "RALLY_TOKEN"
	public final void mRALLY_TOKEN() throws RecognitionException {
		try {
			int _type = RALLY_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:581:2: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:581:4: RALLY_CLASS
			{
			mRALLY_CLASS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_TOKEN"

	// $ANTLR start "RALLY_CLASS_WITH_TYPE"
	public final void mRALLY_CLASS_WITH_TYPE() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:584:2: ( RALLY_CLASS_NAME RALLY_CLASS_TYPE )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:584:5: RALLY_CLASS_NAME RALLY_CLASS_TYPE
			{
			mRALLY_CLASS_NAME(); 

			mRALLY_CLASS_TYPE(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_CLASS_WITH_TYPE"

	// $ANTLR start "RALLY_CLASS"
	public final void mRALLY_CLASS() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:21: ( RALLY_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:585:23: RALLY_CLASS_NAME
			{
			mRALLY_CLASS_NAME(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_CLASS"

	// $ANTLR start "RALLY_CLASS_LEVEL"
	public final void mRALLY_CLASS_LEVEL() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:587:2: ( 'Excellent' | 'Novice' | 'Advanced' )
			int alt23=3;
			switch ( input.LA(1) ) {
			case 'E':
				{
				alt23=1;
				}
				break;
			case 'N':
				{
				alt23=2;
				}
				break;
			case 'A':
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:587:4: 'Excellent'
					{
					match("Excellent"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:587:16: 'Novice'
					{
					match("Novice"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:587:25: 'Advanced'
					{
					match("Advanced"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_CLASS_LEVEL"

	// $ANTLR start "RALLY_CLASS_NAME"
	public final void mRALLY_CLASS_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:2: ( 'Rally' WS RALLY_CLASS_LEVEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:4: 'Rally' WS RALLY_CLASS_LEVEL
			{
			match("Rally"); 

			mWS(); 

			mRALLY_CLASS_LEVEL(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_CLASS_NAME"

	// $ANTLR start "RALLY_CLASS_TYPE"
	public final void mRALLY_CLASS_TYPE() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:591:2: ( 'A' | 'B' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'B') ) {
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
	// $ANTLR end "RALLY_CLASS_TYPE"

	// $ANTLR start "RALLY_RING_LINE"
	public final void mRALLY_RING_LINE() throws RecognitionException {
		try {
			int _type = RALLY_RING_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:2: ( INT 'inch:' 'R' ( '0' .. '9' )+ ( '-R' ( '0' .. '9' )+ )? ( ';' 'R' ( '0' .. '9' )+ ( '-R' ( '0' .. '9' )+ )? )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:4: INT 'inch:' 'R' ( '0' .. '9' )+ ( '-R' ( '0' .. '9' )+ )? ( ';' 'R' ( '0' .. '9' )+ ( '-R' ( '0' .. '9' )+ )? )+
			{
			mINT(); 

			match("inch:"); 

			match('R'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:19: ( '0' .. '9' )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
					alt24=1;
				}

				switch (alt24) {
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
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:29: ( '-R' ( '0' .. '9' )+ )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='-') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:30: '-R' ( '0' .. '9' )+
					{
					match("-R"); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:34: ( '0' .. '9' )+
					int cnt25=0;
					loop25:
					while (true) {
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
							EarlyExitException eee = new EarlyExitException(25, input);
							throw eee;
						}
						cnt25++;
					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:46: ( ';' 'R' ( '0' .. '9' )+ ( '-R' ( '0' .. '9' )+ )? )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==';') ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:47: ';' 'R' ( '0' .. '9' )+ ( '-R' ( '0' .. '9' )+ )?
					{
					match(';'); 
					match('R'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:53: ( '0' .. '9' )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( ((LA27_0 >= '0' && LA27_0 <= '9')) ) {
							alt27=1;
						}

						switch (alt27) {
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
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:63: ( '-R' ( '0' .. '9' )+ )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0=='-') ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:64: '-R' ( '0' .. '9' )+
							{
							match("-R"); 

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:68: ( '0' .. '9' )+
							int cnt28=0;
							loop28:
							while (true) {
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
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt28 >= 1 ) break loop28;
									EarlyExitException eee = new EarlyExitException(28, input);
									throw eee;
								}
								cnt28++;
							}

							}
							break;

					}

					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RALLY_RING_LINE"

	// $ANTLR start "NON_CONFORMATION_SECOND_LINE"
	public final void mNON_CONFORMATION_SECOND_LINE() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:599:38: ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) )
			int alt40=2;
			alt40 = dfa40.predict(input);
			switch (alt40) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:2: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:2: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:3: ( '0' .. '9' )+ '-' ( '0' .. '9' )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:3: ( '0' .. '9' )+
					int cnt31=0;
					loop31:
					while (true) {
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
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					match('-'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:15: ( '0' .. '9' )+
					int cnt32=0;
					loop32:
					while (true) {
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
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt32 >= 1 ) break loop32;
							EarlyExitException eee = new EarlyExitException(32, input);
							throw eee;
						}
						cnt32++;
					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:26: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:26: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:27: ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:27: ( '0' .. '9' )+
					int cnt33=0;
					loop33:
					while (true) {
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
							EarlyExitException eee = new EarlyExitException(33, input);
							throw eee;
						}
						cnt33++;
					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:36: ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					int cnt39=0;
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0=='-'||LA39_0==';') ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:37: ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:37: ( '-' ( '0' .. '9' )+ )?
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0=='-') ) {
								alt35=1;
							}
							switch (alt35) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:38: '-' ( '0' .. '9' )+
									{
									match('-'); 
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:41: ( '0' .. '9' )+
									int cnt34=0;
									loop34:
									while (true) {
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
											}
											else {
												MismatchedSetException mse = new MismatchedSetException(null,input);
												recover(mse);
												throw mse;
											}
											}
											break;

										default :
											if ( cnt34 >= 1 ) break loop34;
											EarlyExitException eee = new EarlyExitException(34, input);
											throw eee;
										}
										cnt34++;
									}

									}
									break;

							}

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:52: ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:53: ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )?
							{
							match(';'); 
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:56: ( '0' .. '9' )+
							int cnt36=0;
							loop36:
							while (true) {
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
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt36 >= 1 ) break loop36;
									EarlyExitException eee = new EarlyExitException(36, input);
									throw eee;
								}
								cnt36++;
							}

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:65: ( '-' ( '0' .. '9' )+ )?
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
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:66: '-' ( '0' .. '9' )+
									{
									match('-'); 
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:69: ( '0' .. '9' )+
									int cnt37=0;
									loop37:
									while (true) {
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
											EarlyExitException eee = new EarlyExitException(37, input);
											throw eee;
										}
										cnt37++;
									}

									}
									break;

							}

							}

							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							EarlyExitException eee = new EarlyExitException(39, input);
							throw eee;
						}
						cnt39++;
					}

					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NON_CONFORMATION_SECOND_LINE"

	// $ANTLR start "FRAG_MONTH"
	public final void mFRAG_MONTH() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt41=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt41=1;
					}
					break;
				case 'A':
					{
					alt41=2;
					}
					break;
				case 'u':
					{
					int LA41_11 = input.LA(3);
					if ( (LA41_11=='n') ) {
						alt41=11;
					}
					else if ( (LA41_11=='l') ) {
						alt41=13;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'U':
					{
					int LA41_12 = input.LA(3);
					if ( (LA41_12=='N') ) {
						alt41=12;
					}
					else if ( (LA41_12=='L') ) {
						alt41=14;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 12, input);
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
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA41_2 = input.LA(2);
				if ( (LA41_2=='e') ) {
					alt41=3;
				}
				else if ( (LA41_2=='E') ) {
					alt41=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'M':
				{
				int LA41_3 = input.LA(2);
				if ( (LA41_3=='a') ) {
					int LA41_15 = input.LA(3);
					if ( (LA41_15=='r') ) {
						alt41=5;
					}
					else if ( (LA41_15=='y') ) {
						alt41=9;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA41_3=='A') ) {
					int LA41_16 = input.LA(3);
					if ( (LA41_16=='R') ) {
						alt41=6;
					}
					else if ( (LA41_16=='Y') ) {
						alt41=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 16, input);
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
							new NoViableAltException("", 41, 3, input);
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
					alt41=7;
					}
					break;
				case 'P':
					{
					alt41=8;
					}
					break;
				case 'u':
					{
					alt41=15;
					}
					break;
				case 'U':
					{
					alt41=16;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'S':
				{
				int LA41_5 = input.LA(2);
				if ( (LA41_5=='e') ) {
					alt41=17;
				}
				else if ( (LA41_5=='E') ) {
					alt41=18;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'O':
				{
				int LA41_6 = input.LA(2);
				if ( (LA41_6=='c') ) {
					alt41=19;
				}
				else if ( (LA41_6=='C') ) {
					alt41=20;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'N':
				{
				int LA41_7 = input.LA(2);
				if ( (LA41_7=='o') ) {
					alt41=21;
				}
				else if ( (LA41_7=='O') ) {
					alt41=22;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'D':
				{
				int LA41_8 = input.LA(2);
				if ( (LA41_8=='e') ) {
					alt41=23;
				}
				else if ( (LA41_8=='E') ) {
					alt41=24;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:14: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:25: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:14: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:22: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:14: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:22: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:14: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:20: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:14: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:21: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:609:14: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:609:21: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:14: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:23: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:14: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:14: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:24: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:613:14: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:613:25: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:614:14: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:614:25: 'DECEMBER'
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

	// $ANTLR start "END_PUNCTUATION"
	public final void mEND_PUNCTUATION() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:616:29: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:617:25: ( 'RING' | 'Ring' )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0=='R') ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1=='I') ) {
					alt42=1;
				}
				else if ( (LA42_1=='i') ) {
					alt42=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:617:29: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:617:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:621:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:621:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:624:5: ( 'am' | 'pm' )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0=='a') ) {
				alt43=1;
			}
			else if ( (LA43_0=='p') ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:624:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:624:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:627:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
			int alt44=12;
			switch ( input.LA(1) ) {
			case 'M':
				{
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA44_4 = input.LA(3);
					if ( (LA44_4=='S') ) {
						alt44=3;
					}

					else {
						alt44=1;
					}

					}
					break;
				case 'r':
					{
					int LA44_5 = input.LA(3);
					if ( (LA44_5=='s') ) {
						alt44=4;
					}

					else {
						alt44=2;
					}

					}
					break;
				case 'S':
					{
					alt44=5;
					}
					break;
				case 's':
					{
					alt44=6;
					}
					break;
				case 'I':
					{
					alt44=7;
					}
					break;
				case 'i':
					{
					alt44=8;
					}
					break;
				default:
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
			case 'D':
				{
				int LA44_2 = input.LA(2);
				if ( (LA44_2=='R') ) {
					alt44=9;
				}
				else if ( (LA44_2=='r') ) {
					alt44=10;
				}

				else {
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
			case 'C':
				{
				int LA44_3 = input.LA(2);
				if ( (LA44_3=='O') ) {
					alt44=11;
				}
				else if ( (LA44_3=='o') ) {
					alt44=12;
				}

				else {
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:627:9: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:627:14: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:9: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:628:15: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:9: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:14: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:9: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:16: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:631:10: 'DR'
					{
					match("DR"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:631:15: 'Dr'
					{
					match("Dr"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:632:9: 'COL'
					{
					match("COL"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:632:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt45=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt45=1;
					}
					break;
				case 'U':
					{
					alt45=2;
					}
					break;
				case 'a':
					{
					alt45=13;
					}
					break;
				case 'A':
					{
					alt45=14;
					}
					break;
				default:
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
			case 'M':
				{
				int LA45_2 = input.LA(2);
				if ( (LA45_2=='o') ) {
					alt45=3;
				}
				else if ( (LA45_2=='O') ) {
					alt45=4;
				}

				else {
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
			case 'T':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt45=5;
					}
					break;
				case 'U':
					{
					alt45=6;
					}
					break;
				case 'h':
					{
					alt45=9;
					}
					break;
				case 'H':
					{
					alt45=10;
					}
					break;
				default:
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
			case 'W':
				{
				int LA45_4 = input.LA(2);
				if ( (LA45_4=='e') ) {
					alt45=7;
				}
				else if ( (LA45_4=='E') ) {
					alt45=8;
				}

				else {
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
			case 'F':
				{
				int LA45_5 = input.LA(2);
				if ( (LA45_5=='r') ) {
					alt45=11;
				}
				else if ( (LA45_5=='R') ) {
					alt45=12;
				}

				else {
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:9: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:636:18: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:637:9: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:637:19: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:638:9: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:638:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:639:9: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:639:20: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:640:9: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:640:18: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:641:9: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:641:20: 'SATURDAY'
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

	// $ANTLR start "STANDALONE_COMMENT"
	public final void mSTANDALONE_COMMENT() throws RecognitionException {
		try {
			int _type = STANDALONE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:658:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='L') ) {
				alt46=1;
			}
			else if ( (LA46_0=='V') ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:658:9: 'LUNCH'
					{
					match("LUNCH"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:658:17: 'VARIETY GROUP JUDGING'
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

	// $ANTLR start "BREED_COUNT"
	public final void mBREED_COUNT() throws RecognitionException {
		try {
			int _type = BREED_COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); 

			mWS(); 

			mFRAG_PROPER_NAME(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+
			int cnt48=0;
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==' ') ) {
					int LA48_1 = input.LA(2);
					if ( (LA48_1=='(') ) {
						int LA48_3 = input.LA(3);
						if ( ((LA48_3 >= 'A' && LA48_3 <= 'Z')) ) {
							alt48=1;
						}

					}
					else if ( ((LA48_1 >= 'A' && LA48_1 <= 'Z')) ) {
						alt48=1;
					}

				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0=='(') ) {
						alt47=1;
					}
					else if ( ((LA47_0 >= 'A' && LA47_0 <= 'Z')) ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:66: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:85: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;

					}

					}
					break;

				default :
					if ( cnt48 >= 1 ) break loop48;
					EarlyExitException eee = new EarlyExitException(48, input);
					throw eee;
				}
				cnt48++;
			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:106: ( WS )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( ((LA49_0 >= '\t' && LA49_0 <= '\n')||LA49_0=='\r'||LA49_0==' ') ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:106: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:110: ( PARENTHETICAL_INT )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0=='(') ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:655:110: PARENTHETICAL_INT
					{
					mPARENTHETICAL_INT(); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:658:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:658:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:658:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt51=0;
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( ((LA51_0 >= '\t' && LA51_0 <= '\n')||LA51_0=='\r'||LA51_0==' ') ) {
					alt51=1;
				}

				switch (alt51) {
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
					if ( cnt51 >= 1 ) break loop51;
					EarlyExitException eee = new EarlyExitException(51, input);
					throw eee;
				}
				cnt51++;
			}

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:13: ( ( 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0=='G') ) {
				alt52=1;
			}
			else if ( (LA52_0=='R') ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:18: 'GROUP RING'
					{
					match("GROUP RING"); 

					allowGroup=true;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:49: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:49: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:660:50: 'RING' WS INT
					{
					match("RING"); 

					mWS(); 

					mINT(); 

					}

					}
					break;

			}

			allowJudge=true;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
			{
			match('('); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			match(')'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:42: ( WS )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( ((LA53_0 >= '\t' && LA53_0 <= '\n')||LA53_0=='\r'||LA53_0==' ') ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:42: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:13: INT ':' INT WS FRAG_TIME_LABEL
			{
			mINT(); 

			match(':'); 
			mINT(); 

			mWS(); 

			mFRAG_TIME_LABEL(); 

			allowBreed=true;
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
			mFRAG_WEEK_DAY(); 

			match(','); 
			mWS(); 

			mFRAG_MONTH(); 

			mWS(); 

			mINT(); 

			match(','); 
			mWS(); 

			mINT(); 

			allowBreed=true;
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
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0=='.') ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:13: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt54 >= 1 ) break loop54;
					EarlyExitException eee = new EarlyExitException(54, input);
					throw eee;
				}
				cnt54++;
			}

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
			while (true) {
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
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt55 >= 1 ) break loop55;
					EarlyExitException eee = new EarlyExitException(55, input);
					throw eee;
				}
				cnt55++;
			}

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
			match('('); 
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
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:14: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:19: INT
					{
					mINT(); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( ((LA58_0 >= '\t' && LA58_0 <= '\n')||LA58_0=='\r'||LA58_0==' ') ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); 

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
						NoViableAltException nvae =
							new NoViableAltException("", 57, 0, input);
						throw nvae;
					}
					switch (alt57) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:46: WORD
							{
							mWORD(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:51: INT
							{
							mINT(); 

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:55: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;

					}

					}
					break;

				default :
					break loop58;
				}
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
			matchRange('A','Z'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:675:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			loop59:
			while (true) {
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
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop59;
				}
			}

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
	// $ANTLR end "FRAG_PROPER_NAME"

	// $ANTLR start "PARENTHETICAL_INT"
	public final void mPARENTHETICAL_INT() throws RecognitionException {
		try {
			int _type = PARENTHETICAL_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:678:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); 
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
					mWS(); 

					}
					break;

			}

			mINT(); 

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

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:679:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt63=0;
			loop63:
			while (true) {
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
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt63 >= 1 ) break loop63;
					EarlyExitException eee = new EarlyExitException(63, input);
					throw eee;
				}
				cnt63++;
			}

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
			while (true) {
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
						NoViableAltException nvae =
							new NoViableAltException("", 65, 0, input);
						throw nvae;
					}
					switch (alt65) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:32: WORD
							{
							mWORD(); 

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:37: PARENTHETICAL
							{
							mPARENTHETICAL(); 

							}
							break;
						case 4 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:51: INT
							{
							mINT(); 

							}
							break;
						case 5 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:680:55: ELLIPSIS
							{
							mELLIPSIS(); 

							}
							break;

					}

					allowBreed=false; allowGroup=false;allowJudge=false;
					}
					break;

				default :
					if ( cnt66 >= 1 ) break loop66;
					EarlyExitException eee = new EarlyExitException(66, input);
					throw eee;
				}
				cnt66++;
			}

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
			mWORD(); 

			mEND_PUNCTUATION(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END_WORD"

	// $ANTLR start "PARENTHETICAL_NAME"
	public final void mPARENTHETICAL_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:28: ( '(' FRAG_PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:30: '(' FRAG_PROPER_NAME ')'
			{
			match('('); 
			mFRAG_PROPER_NAME(); 

			match(')'); 
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
			matchAny(); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;

			  System.err.println("Ooops! " + getText() + " fell through");

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FallThrough"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE | NON_CONF_SECOND_LINE_COMMENT | RALLY_TOKEN_WITH_TYPE | RALLY_STANDALONE_COMMENT | RALLY_TOKEN | RALLY_RING_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough )
		int alt67=25;
		alt67 = dfa67.predict(input);
		switch (alt67) {
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:49: GROUP_RING
				{
				mGROUP_RING(); 

				}
				break;
			case 5 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:60: NON_CONFORMATION_CLASS_NAME
				{
				mNON_CONFORMATION_CLASS_NAME(); 

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:88: NON_CONF_SECOND_LINE
				{
				mNON_CONF_SECOND_LINE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:109: NON_CONF_SECOND_LINE_COMMENT
				{
				mNON_CONF_SECOND_LINE_COMMENT(); 

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:138: RALLY_TOKEN_WITH_TYPE
				{
				mRALLY_TOKEN_WITH_TYPE(); 

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:160: RALLY_STANDALONE_COMMENT
				{
				mRALLY_STANDALONE_COMMENT(); 

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:185: RALLY_TOKEN
				{
				mRALLY_TOKEN(); 

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:197: RALLY_RING_LINE
				{
				mRALLY_RING_LINE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:213: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); 

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:232: BREED_COUNT
				{
				mBREED_COUNT(); 

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:244: JUDGE_NAME
				{
				mJUDGE_NAME(); 

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:255: WS
				{
				mWS(); 

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:258: RING_TITLE
				{
				mRING_TITLE(); 

				}
				break;
			case 17 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:269: PHONE_NUMBER
				{
				mPHONE_NUMBER(); 

				}
				break;
			case 18 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:282: TIME
				{
				mTIME(); 

				}
				break;
			case 19 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:287: DATE
				{
				mDATE(); 

				}
				break;
			case 20 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:292: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 21 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:301: INT
				{
				mINT(); 

				}
				break;
			case 22 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:305: PARENTHETICAL
				{
				mPARENTHETICAL(); 

				}
				break;
			case 23 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:319: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); 

				}
				break;
			case 24 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:337: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 25 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:345: FallThrough
				{
				mFallThrough(); 

				}
				break;

		}
	}


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA15 dfa15 = new DFA15(this);
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA40 dfa40 = new DFA40(this);
	protected DFA67 dfa67 = new DFA67(this);
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

	protected class DFA2 extends DFA {

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
			return "229:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
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

	protected class DFA15 extends DFA {

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
			return "446:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA20_eotS =
		"\104\uffff";
	static final String DFA20_eofS =
		"\104\uffff";
	static final String DFA20_minS =
		"\1\102\1\145\1\164\1\162\1\160\1\157\1\151\1\uffff\1\145\1\147\1\151\2"+
		"\145\1\166\1\154\1\162\1\151\1\154\1\40\1\156\1\151\1\144\2\uffff\1\156"+
		"\1\151\1\117\1\40\1\143\1\40\1\156\1\164\2\uffff\1\101\1\145\1\103\1\145"+
		"\1\171\2\uffff\1\40\1\141\1\162\1\40\1\101\1\162\1\40\1\101\2\uffff\1"+
		"\144\1\116\2\uffff\1\40\1\157\1\116\1\166\2\uffff\1\151\1\143\1\145\1"+
		"\40\1\101\2\uffff";
	static final String DFA20_maxS =
		"\1\127\1\145\1\164\1\162\1\160\1\157\1\151\1\uffff\1\145\1\147\1\151\2"+
		"\145\1\166\1\154\1\164\1\151\1\154\1\40\1\156\1\151\1\144\2\uffff\1\156"+
		"\1\151\1\125\1\40\1\143\1\40\1\156\1\164\2\uffff\1\102\1\145\1\103\1\145"+
		"\1\171\2\uffff\1\40\1\141\1\162\1\40\1\102\1\162\1\40\1\102\2\uffff\1"+
		"\144\1\116\2\uffff\1\40\1\157\1\125\1\166\2\uffff\1\151\1\143\1\145\1"+
		"\40\1\102\2\uffff";
	static final String DFA20_acceptS =
		"\7\uffff\1\15\16\uffff\1\16\1\17\10\uffff\1\5\1\6\5\uffff\1\7\1\10\10"+
		"\uffff\1\11\1\12\2\uffff\1\3\1\4\4\uffff\1\13\1\14\5\uffff\1\1\1\2";
	static final String DFA20_specialS =
		"\104\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\1\4\uffff\1\7\6\uffff\1\5\1\4\1\3\4\uffff\1\2\1\10\1\6",
			"\1\11",
			"\1\12",
			"\1\13",
			"\1\14",
			"\1\15",
			"\1\16",
			"",
			"\1\17",
			"\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26\1\uffff\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"",
			"",
			"\1\36",
			"\1\37",
			"\1\40\5\uffff\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"",
			"",
			"\1\47\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61\1\62",
			"\1\63",
			"\1\64",
			"\1\65\1\66",
			"",
			"",
			"\1\67",
			"\1\70",
			"",
			"",
			"\1\71",
			"\1\72",
			"\1\73\6\uffff\1\74",
			"\1\75",
			"",
			"",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102\1\103",
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

	protected class DFA20 extends DFA {

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
			return "546:10: fragment NON_CONFORMATION_CLASS_LEVEL : ( 'Beginner Novice A' | 'Beginner Novice B' | 'Utility A' | 'Utility B' | 'Pre Open' | 'Pre Utility' | 'Open A' | 'Open B' | 'Novice A' | 'Novice B' | 'Wild Card Novice' | 'Wild Card Utility' | 'Graduate Novice' | 'Versatility' | 'Veterans' );";
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

	protected class DFA40 extends DFA {

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
			return "599:10: fragment NON_CONFORMATION_SECOND_LINE : ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) );";
		}
	}

	static final String DFA67_eotS =
		"\1\uffff\30\51\1\u00a0\1\uffff\1\37\1\u00a8\3\uffff\11\51\1\uffff\74\51"+
		"\1\uffff\67\51\1\u00a0\1\51\1\uffff\2\51\6\uffff\1\u00a8\6\51\1\uffff"+
		"\155\51\1\u01e6\46\51\1\uffff\31\51\2\u022c\2\51\2\uffff\1\u0235\2\uffff"+
		"\1\u0235\2\uffff\173\51\1\uffff\1\u02ad\1\uffff\1\51\1\u02c0\1\51\1\uffff"+
		"\44\51\2\uffff\2\51\1\uffff\26\51\1\uffff\3\51\6\uffff\7\51\1\uffff\13"+
		"\51\1\u0316\27\51\1\u032d\1\51\1\u032f\31\51\1\u0347\42\51\1\u0364\6\51"+
		"\1\u036b\5\51\21\uffff\1\51\1\u038e\1\uffff\10\51\1\uffff\31\51\2\uffff"+
		"\27\51\1\u022c\1\51\1\u0235\4\uffff\7\51\1\uffff\13\51\1\uffff\7\51\1"+
		"\u03dd\13\51\1\u03e7\2\51\1\uffff\1\51\1\uffff\1\u03e9\15\51\1\u03f5\10"+
		"\51\1\uffff\17\51\1\uffff\6\51\1\u040b\5\51\1\uffff\6\51\1\uffff\3\51"+
		"\1\u0417\1\51\34\uffff\1\51\1\uffff\1\51\1\uffff\6\51\1\u0443\25\51\1"+
		"\uffff\6\51\1\u045e\21\51\1\uffff\1\51\1\u0471\1\u0472\4\51\1\uffff\15"+
		"\51\1\u0481\1\uffff\11\51\1\uffff\1\51\1\uffff\2\51\1\u048a\10\51\1\uffff"+
		"\6\51\1\u0347\5\51\1\u0498\10\51\1\uffff\4\51\1\u04a2\4\51\1\u04a6\1\51"+
		"\1\uffff\1\51\37\uffff\2\51\3\uffff\6\51\1\uffff\1\u04d1\4\51\1\u04d6"+
		"\15\51\1\uffff\6\51\1\uffff\6\51\1\u04e9\7\51\1\u04f0\3\51\2\uffff\2\51"+
		"\1\uffff\13\51\1\uffff\6\51\1\u0501\1\51\1\uffff\15\51\1\uffff\1\u050b"+
		"\2\51\1\u050e\1\u050f\1\u0510\3\51\1\uffff\1\u0512\2\51\1\uffff\2\51\33"+
		"\uffff\1\u0537\3\uffff\2\51\3\uffff\3\51\2\uffff\4\51\1\uffff\2\51\1\u0542"+
		"\6\51\2\uffff\2\51\1\u0347\1\51\1\uffff\2\51\1\uffff\1\51\1\uffff\4\51"+
		"\1\uffff\15\51\1\u055a\2\51\1\uffff\2\51\1\u055f\1\51\1\u0561\1\u0562"+
		"\2\51\1\u0565\1\uffff\2\51\3\uffff\1\51\1\uffff\1\u0568\2\51\34\uffff"+
		"\3\51\1\uffff\1\51\7\uffff\4\51\1\uffff\3\51\1\uffff\14\51\1\u059d\6\51"+
		"\1\uffff\1\51\1\u05a2\2\51\1\uffff\1\51\2\uffff\2\51\1\uffff\1\u05a7\1"+
		"\u05a8\1\uffff\1\u05a9\1\51\32\uffff\3\51\6\uffff\1\u05ca\1\u05cb\1\u05cc"+
		"\3\51\1\uffff\1\51\1\u05d3\6\51\1\uffff\4\51\1\uffff\1\u05dc\3\51\32\uffff"+
		"\3\51\11\uffff\1\51\1\u0347\1\51\2\uffff\1\u01ec\1\uffff\1\u05d1\2\51"+
		"\1\u05fc\1\51\1\u05fe\2\51\1\uffff\1\51\22\uffff\3\51\3\uffff\1\u0618"+
		"\1\uffff\1\51\1\uffff\2\51\1\uffff\1\51\2\uffff\1\u061f\21\uffff\1\u0630"+
		"\1\51\1\u0632\6\uffff\3\51\1\u03c6\15\uffff\1\u0643\4\uffff\1\51\4\uffff"+
		"\1\u0618\1\u064a\1\u05fc\16\uffff\1\51\1\uffff\1\u0618\13\uffff\1\51\12"+
		"\uffff\1\51\11\uffff\1\51\6\uffff\1\u0677\24\uffff";
	static final String DFA67_eofS =
		"\u0686\uffff";
	static final String DFA67_minS =
		"\1\0\1\111\1\154\1\117\1\146\1\105\1\117\1\122\1\156\2\122\1\105\1\142"+
		"\1\141\1\145\1\125\1\141\1\105\1\101\1\105\1\101\1\105\2\157\1\164\1\46"+
		"\1\uffff\1\11\1\46\3\uffff\1\154\1\156\4\11\1\123\1\156\1\116\1\uffff"+
		"\1\145\1\144\1\164\1\162\1\141\1\116\1\146\1\162\1\151\1\141\1\145\1\141"+
		"\1\160\2\163\1\141\1\143\1\141\1\162\1\141\1\154\1\123\1\151\1\163\1\145"+
		"\1\162\1\165\1\143\1\162\1\114\1\143\1\142\2\11\1\147\1\145\1\141\1\170"+
		"\1\145\1\111\1\162\1\141\1\145\1\154\1\141\1\117\1\162\1\122\1\125\1\151"+
		"\1\145\1\151\1\141\1\160\1\145\1\155\1\166\1\142\1\157\1\141\1\uffff\1"+
		"\167\1\116\1\160\1\153\1\141\1\157\1\151\1\147\1\162\1\145\1\154\1\144"+
		"\1\157\1\164\1\163\1\107\1\116\1\151\1\150\1\141\1\145\1\142\1\171\1\146"+
		"\2\141\1\156\1\145\1\117\1\105\1\116\1\124\1\142\1\40\1\145\1\122\1\131"+
		"\1\145\1\105\1\165\1\125\1\172\1\162\1\124\1\122\1\144\1\151\1\154\1\122"+
		"\1\154\1\104\1\154\1\162\1\151\1\60\1\46\1\60\1\uffff\1\156\1\60\1\uffff"+
		"\3\11\2\uffff\1\46\2\164\1\143\1\151\1\163\1\11\1\uffff\1\11\1\123\1\144"+
		"\1\104\1\156\1\40\1\145\1\141\1\146\1\160\1\146\1\55\1\145\1\150\1\145"+
		"\1\164\1\163\1\162\1\164\1\145\1\164\1\145\1\147\1\154\2\147\1\151\1\150"+
		"\1\143\1\157\1\145\1\144\1\164\1\166\1\145\1\153\1\143\1\141\1\163\1\154"+
		"\1\124\1\162\1\141\1\144\1\141\1\153\1\163\1\150\1\167\1\156\1\155\1\153"+
		"\1\11\1\154\1\11\1\150\1\155\1\144\1\145\1\157\3\154\1\156\1\164\1\40"+
		"\1\156\1\144\1\104\1\155\2\156\2\144\1\141\1\144\1\125\1\162\1\141\1\104"+
		"\1\116\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\157"+
		"\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\151\1\142\1\151\1\162\1\164"+
		"\1\156\1\151\1\145\1\144\1\164\1\11\1\151\1\145\2\40\1\154\1\142\1\162"+
		"\1\144\1\164\1\163\1\125\1\107\1\156\1\165\1\157\1\165\1\151\1\164\1\154"+
		"\2\164\1\142\1\145\1\153\1\145\1\164\2\156\1\146\1\163\2\144\1\122\1\105"+
		"\1\104\1\125\1\145\1\40\1\146\1\145\1\122\1\40\1\163\1\123\1\162\1\122"+
		"\1\163\1\145\1\163\1\105\1\111\1\155\1\163\1\164\1\156\1\160\1\145\1\144"+
		"\1\113\1\153\1\116\1\157\1\153\1\154\2\46\1\143\3\11\1\46\2\11\1\46\2"+
		"\11\2\145\1\150\1\141\2\11\1\141\1\101\1\40\1\162\1\143\1\40\1\157\1\145"+
		"\2\157\1\123\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\156\1\162\1\156"+
		"\1\145\1\154\1\144\1\143\2\151\2\145\1\156\1\157\1\153\1\144\1\164\1\145"+
		"\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163\2\40\1\156\1\141\1\40"+
		"\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\145\1\142\1\145\1\151\1\171"+
		"\1\163\1\141\1\151\1\162\1\40\1\145\1\151\1\145\1\151\1\144\1\151\1\55"+
		"\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\165\1\120"+
		"\1\151\1\156\1\111\1\104\2\141\1\150\1\151\1\156\1\150\1\171\1\156\1\163"+
		"\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\156\1\162\1\164"+
		"\1\141\2\164\1\163\1\162\1\154\1\165\1\0\1\11\1\46\1\151\1\11\1\156\1"+
		"\uffff\1\171\1\157\1\151\1\145\1\167\1\145\1\114\1\11\1\164\1\153\1\171"+
		"\1\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151"+
		"\1\157\1\146\1\144\1\145\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\164"+
		"\1\106\1\157\1\151\1\111\1\uffff\1\144\1\104\1\163\1\123\1\154\1\162\1"+
		"\141\1\122\1\105\1\141\1\150\1\40\1\145\1\160\2\40\1\111\1\164\1\105\1"+
		"\151\1\163\1\151\1\uffff\2\60\1\150\1\uffff\4\11\1\uffff\1\162\1\146\1"+
		"\163\1\145\1\164\1\171\1\131\1\101\1\150\1\145\1\154\1\147\1\143\1\154"+
		"\1\165\1\120\1\160\1\156\1\141\1\11\1\141\1\143\1\154\1\172\1\141\1\152"+
		"\1\164\3\145\1\156\1\141\1\162\1\163\2\156\1\40\1\150\1\151\1\162\1\151"+
		"\1\156\1\145\1\11\1\156\1\11\1\144\1\141\1\145\1\157\1\141\1\40\1\156"+
		"\1\147\1\151\1\40\1\160\1\141\1\163\1\143\1\145\1\162\1\145\1\55\1\150"+
		"\1\164\1\145\1\155\1\40\1\163\1\142\1\41\1\145\1\40\1\163\1\103\1\150"+
		"\1\171\1\131\1\156\1\40\2\156\1\40\1\157\1\141\1\40\2\145\1\116\1\40\2"+
		"\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145\1"+
		"\40\1\145\1\41\1\154\1\156\1\147\1\157\1\40\1\157\1\11\1\145\1\150\1\141"+
		"\1\145\1\147\1\0\20\11\1\163\1\11\1\0\1\145\1\11\1\156\1\145\1\163\1\145"+
		"\1\154\1\101\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1"+
		"\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\111\1"+
		"\123\1\131\1\104\1\141\1\uffff\1\154\1\156\1\105\1\141\1\101\1\144\1\104"+
		"\2\141\1\164\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\150\1\123"+
		"\1\164\1\150\1\164\1\55\1\46\1\72\5\11\1\40\1\146\1\145\1\163\1\165\2"+
		"\54\1\uffff\1\157\1\40\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40"+
		"\1\154\1\0\1\156\1\141\1\151\1\145\1\154\1\151\1\40\1\11\1\144\1\162\1"+
		"\147\1\156\1\40\2\145\1\40\1\157\1\143\1\40\1\11\1\40\1\162\1\0\1\40\1"+
		"\0\1\11\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\157\1\162"+
		"\1\40\1\11\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163"+
		"\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162\1\163\1\107\1\uffff"+
		"\1\40\1\144\1\156\1\163\1\156\1\157\1\11\2\157\1\156\1\162\1\156\1\uffff"+
		"\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156\1\11\1\165\34"+
		"\11\1\143\1\0\1\141\1\11\1\145\1\166\2\151\1\154\1\122\1\11\1\144\1\141"+
		"\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162\1\40\1\54\1\150"+
		"\1\164\1\116\1\124\1\54\1\101\1\156\1\154\1\147\1\122\1\171\1\131\1\141"+
		"\1\101\1\11\1\156\1\151\1\116\1\131\1\141\1\144\1\164\1\151\1\107\1\162"+
		"\1\104\1\172\1\151\1\171\2\60\1\122\1\uffff\1\60\2\11\1\164\1\162\1\11"+
		"\1\165\1\101\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156"+
		"\1\141\1\154\1\151\1\11\1\0\1\40\1\157\1\164\2\40\1\162\1\40\1\165\1\153"+
		"\1\0\1\40\1\0\1\171\1\163\1\11\1\164\1\156\1\162\1\141\1\165\3\40\1\0"+
		"\1\157\1\156\1\141\1\156\1\40\1\143\1\41\1\40\1\141\1\40\1\156\1\145\1"+
		"\11\1\145\1\40\1\151\1\40\1\145\1\144\1\162\1\153\1\0\1\162\1\40\1\144"+
		"\1\147\1\11\1\156\1\163\1\145\1\40\1\11\1\151\1\0\1\145\37\11\1\56\1\156"+
		"\1\170\1\157\1\144\1\40\1\145\1\141\1\154\2\40\1\0\1\11\1\171\1\162\1"+
		"\150\1\155\1\11\1\144\1\156\1\163\2\40\2\144\1\40\1\141\1\107\1\101\1"+
		"\131\1\40\1\157\2\40\2\54\1\171\1\131\1\0\1\40\1\154\2\40\1\156\1\141"+
		"\1\11\1\162\1\40\1\157\1\101\1\143\1\162\1\40\1\46\3\60\2\0\2\145\1\uffff"+
		"\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1\154\1\141\1\0\1\156\1\157"+
		"\1\40\1\156\2\40\1\11\1\40\1\0\1\151\2\40\1\153\2\141\1\144\1\156\1\40"+
		"\1\150\1\164\1\144\1\40\1\0\1\11\1\143\1\40\3\11\2\40\1\145\1\0\1\11\1"+
		"\145\1\40\1\0\1\141\1\163\37\11\2\40\1\143\2\166\1\162\1\156\1\145\1\uffff"+
		"\1\0\1\54\1\153\2\40\1\0\2\40\1\11\1\163\1\40\1\153\1\40\1\113\1\54\1"+
		"\167\1\uffff\2\54\1\11\1\151\1\uffff\1\145\1\171\1\0\1\145\1\uffff\1\165"+
		"\1\131\1\165\1\145\1\uffff\2\55\1\162\1\40\1\144\1\40\1\156\1\141\1\111"+
		"\1\143\1\40\1\145\1\156\1\11\1\156\1\144\1\0\1\146\1\145\1\11\1\164\2"+
		"\11\2\145\1\11\1\0\1\40\1\156\3\0\1\162\1\0\1\11\1\156\1\145\34\11\1\163"+
		"\1\141\1\154\1\46\1\151\1\0\3\11\1\145\1\151\1\141\1\163\1\40\1\162\1"+
		"\145\1\0\1\150\1\145\1\105\1\11\1\164\1\162\1\54\1\144\1\147\1\54\1\151"+
		"\1\40\2\122\1\60\1\40\1\11\1\40\1\156\1\116\1\150\1\162\1\40\1\0\1\40"+
		"\1\11\1\146\1\40\1\0\1\145\2\0\1\162\1\144\1\0\2\11\1\0\1\11\1\40\32\11"+
		"\1\143\1\162\1\141\3\11\1\154\1\143\1\156\3\11\1\151\1\163\1\123\1\11"+
		"\1\171\1\11\1\40\1\150\1\156\3\60\1\0\1\144\1\107\1\145\1\40\1\0\1\11"+
		"\1\144\2\40\3\0\27\11\1\157\1\164\1\143\3\11\1\154\1\145\1\143\3\0\1\162"+
		"\1\41\1\40\2\uffff\1\41\1\0\1\41\1\164\1\60\1\46\1\60\1\11\1\40\1\162"+
		"\1\0\1\40\22\11\1\142\1\151\1\153\2\11\1\145\1\101\2\145\1\uffff\1\154"+
		"\1\122\1\uffff\1\60\1\0\1\uffff\22\11\1\41\1\55\1\41\2\11\1\156\2\uffff"+
		"\1\144\1\40\1\151\1\60\1\46\1\0\14\11\1\46\3\11\1\0\1\103\1\0\2\11\1\164"+
		"\1\101\1\11\1\46\12\11\1\0\3\11\1\157\1\11\1\101\1\0\12\11\1\154\12\11"+
		"\1\157\11\11\1\162\6\11\1\41\5\11\1\0\16\11";
	static final String DFA67_maxS =
		"\1\uffff\1\163\1\164\1\157\3\165\1\162\1\156\2\162\1\141\1\164\1\141\1"+
		"\165\1\u00f6\1\171\1\165\1\167\1\165\2\151\2\157\1\164\1\u2019\1\uffff"+
		"\2\u2019\3\uffff\2\163\1\123\1\163\2\40\1\123\1\156\1\116\1\uffff\1\145"+
		"\1\144\1\164\1\166\1\167\1\116\1\147\1\162\1\151\1\141\1\145\1\141\1\160"+
		"\2\163\1\162\1\143\1\165\1\171\1\165\1\154\1\123\1\166\1\163\1\157\1\162"+
		"\1\165\1\154\1\162\1\114\1\156\1\147\2\40\1\164\1\156\1\141\1\170\1\151"+
		"\1\111\1\162\1\141\1\145\1\162\1\145\1\117\1\166\1\122\1\125\1\151\1\145"+
		"\1\151\1\141\1\160\1\162\1\155\1\166\1\153\1\157\1\141\1\uffff\1\167\1"+
		"\116\1\162\1\164\1\141\1\157\1\162\1\154\1\162\1\145\2\164\1\157\1\164"+
		"\1\163\1\107\1\116\1\164\1\157\1\164\1\151\1\154\1\171\1\146\1\151\1\141"+
		"\1\163\1\145\1\117\1\105\1\116\1\124\1\142\1\171\1\145\1\122\1\131\1\145"+
		"\1\105\1\165\1\125\1\172\1\164\1\124\1\122\1\163\1\151\1\162\1\122\1\154"+
		"\1\104\1\154\1\162\1\151\1\71\1\u2019\1\71\1\uffff\1\156\1\71\1\uffff"+
		"\1\71\2\u2019\2\uffff\1\u2019\2\164\1\143\1\151\1\163\1\40\1\uffff\1\40"+
		"\1\123\1\144\1\104\1\156\1\40\1\145\1\151\1\167\1\160\1\146\1\55\1\145"+
		"\1\150\1\145\1\164\1\163\1\162\1\164\1\145\1\164\1\163\1\165\1\154\1\147"+
		"\1\156\1\151\1\150\1\143\1\157\1\145\1\172\1\164\1\166\1\145\1\153\1\143"+
		"\1\164\1\163\1\154\1\124\1\162\1\145\1\144\1\141\1\153\1\163\1\156\1\167"+
		"\1\156\1\155\1\153\2\154\1\40\1\150\1\155\1\144\1\145\1\165\1\154\1\162"+
		"\1\154\1\156\1\164\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\171\1\144"+
		"\1\125\1\162\1\141\1\104\1\116\1\172\1\154\1\163\1\154\1\141\1\163\1\162"+
		"\1\157\1\141\1\162\1\157\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\151"+
		"\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\u2019\1\151\1"+
		"\145\2\40\1\154\1\142\1\162\1\144\1\164\1\163\1\125\1\107\1\156\1\165"+
		"\1\157\1\165\1\151\1\164\1\154\2\164\1\150\1\145\1\153\1\145\1\164\3\156"+
		"\1\163\1\144\1\145\1\122\1\105\1\104\1\125\1\145\1\40\1\146\1\145\1\122"+
		"\1\40\1\163\1\123\1\162\1\122\1\163\1\145\1\163\1\105\1\111\1\155\1\163"+
		"\1\164\1\156\1\160\1\145\1\144\1\113\1\153\1\116\1\157\1\153\1\154\2\u2019"+
		"\1\143\2\71\2\u2019\1\51\3\u2019\1\51\1\151\1\145\1\150\1\141\2\40\1\141"+
		"\1\101\1\40\1\162\1\143\1\40\1\157\1\151\2\157\1\123\1\156\1\141\1\144"+
		"\1\141\1\153\1\151\1\157\1\156\1\162\1\156\1\145\1\154\1\144\1\143\2\151"+
		"\2\145\1\156\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145"+
		"\1\162\1\164\1\163\1\155\1\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141"+
		"\1\165\1\145\1\40\1\145\1\142\1\145\1\151\1\171\1\163\1\141\1\151\1\162"+
		"\1\40\1\145\1\151\1\145\1\171\1\144\1\151\1\55\1\143\1\141\1\101\1\141"+
		"\1\164\1\40\1\145\1\157\1\164\1\150\1\165\1\120\1\151\1\156\1\111\1\104"+
		"\2\141\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142"+
		"\1\141\1\150\1\110\1\154\1\157\1\156\1\162\1\164\1\141\2\164\1\163\1\162"+
		"\1\154\1\165\1\0\2\u2019\1\151\1\u2019\1\156\1\uffff\1\171\1\157\1\151"+
		"\1\145\1\167\1\145\1\114\1\40\1\164\1\153\1\171\1\162\1\160\1\164\1\171"+
		"\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145"+
		"\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\126\1\157\1\151\1\111"+
		"\1\uffff\1\144\1\104\1\163\1\123\1\154\1\162\1\141\1\122\1\105\1\141\1"+
		"\150\1\40\1\145\1\160\1\150\1\40\1\111\1\164\1\105\1\151\1\163\1\151\1"+
		"\uffff\2\71\1\150\1\uffff\1\71\1\u2019\1\71\1\u2019\1\uffff\1\162\1\146"+
		"\1\163\1\145\1\164\1\171\1\131\1\123\1\150\1\145\1\154\1\147\1\143\1\154"+
		"\1\165\1\120\1\160\1\156\1\141\1\u2019\1\141\1\143\1\154\1\172\1\141\1"+
		"\152\1\164\3\145\1\156\1\141\1\162\1\163\2\156\1\40\1\150\1\151\1\162"+
		"\1\151\1\156\1\145\1\u2019\1\156\1\u2019\1\144\1\141\1\145\1\157\1\141"+
		"\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143\1\145\1\162\1\145"+
		"\1\55\1\150\1\164\1\145\1\155\2\163\1\142\1\u2019\1\145\1\40\1\163\1\103"+
		"\1\150\1\171\1\131\1\156\1\40\2\156\1\145\1\157\1\141\1\40\2\145\1\116"+
		"\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141"+
		"\1\145\1\40\1\145\1\u2019\1\154\1\156\1\147\1\157\1\163\1\157\1\u2019"+
		"\1\145\1\150\1\141\1\145\1\147\1\0\1\71\17\u2019\1\163\1\u2019\1\0\1\145"+
		"\1\40\1\156\1\145\1\163\1\145\1\154\1\101\1\uffff\1\40\1\151\1\145\1\144"+
		"\1\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141"+
		"\1\170\1\171\2\163\1\111\1\123\1\131\1\104\1\141\1\uffff\1\154\1\156\1"+
		"\105\1\141\1\101\1\144\1\104\2\141\1\164\1\101\1\124\1\162\1\40\1\163"+
		"\1\145\1\141\1\116\1\150\1\123\1\164\1\150\1\164\1\71\1\u2019\1\72\1\u2019"+
		"\1\71\1\51\1\u2019\1\51\1\40\1\146\1\145\1\163\1\165\2\54\1\uffff\1\157"+
		"\1\40\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\0\1\156\1"+
		"\141\1\151\1\145\1\154\1\151\1\40\1\u2019\1\144\1\162\1\147\1\156\1\40"+
		"\2\145\1\163\1\157\1\143\1\40\1\u2019\1\40\1\162\1\0\1\40\1\0\1\u2019"+
		"\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\157\1\162\1\40"+
		"\1\u2019\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163\1"+
		"\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162\1\163\1\107\1\uffff"+
		"\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019\2\157\1\156\1\162\1\156\1"+
		"\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156\1\u2019"+
		"\1\165\2\71\32\u2019\1\143\1\0\1\141\1\116\1\145\1\166\2\151\1\154\1\122"+
		"\1\u2019\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\151\2"+
		"\162\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1\154\1\147\1"+
		"\122\1\171\1\131\1\141\1\101\1\u2019\1\156\1\151\1\116\1\131\1\141\1\144"+
		"\1\164\1\151\1\107\1\162\1\104\1\172\1\151\1\171\2\71\1\122\1\uffff\1"+
		"\71\2\u2019\1\164\1\162\1\40\1\165\1\123\1\40\1\141\1\40\1\164\1\144\1"+
		"\122\1\156\1\145\1\40\1\156\1\141\1\154\1\151\1\u2019\1\0\1\40\1\157\1"+
		"\164\2\40\1\162\1\40\1\165\1\153\1\0\1\163\1\0\1\171\1\163\1\u2019\1\164"+
		"\1\156\1\162\1\141\1\165\3\40\1\0\1\157\1\156\1\141\1\156\1\40\1\143\1"+
		"\u2019\1\40\1\141\1\40\1\156\1\145\1\u2019\1\145\1\40\1\151\1\40\1\145"+
		"\1\144\1\162\1\153\1\0\1\162\1\40\1\144\1\147\1\u2019\1\156\1\163\1\145"+
		"\1\40\1\u2019\1\151\1\0\1\145\37\u2019\1\56\1\156\1\170\1\157\1\144\1"+
		"\40\1\145\1\141\1\154\2\40\1\0\1\u2019\1\171\1\162\1\150\1\155\1\u2019"+
		"\1\144\1\156\1\163\2\40\2\144\1\40\1\141\1\107\1\101\1\131\1\40\1\157"+
		"\2\40\2\54\1\171\1\131\1\0\1\163\1\154\2\40\1\156\1\141\1\u2019\1\162"+
		"\1\40\1\157\1\101\1\143\1\162\1\40\1\u2019\1\73\2\71\2\0\2\145\1\uffff"+
		"\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1\154\1\141\1\0\1\156\1\157"+
		"\1\40\1\156\2\40\1\u2019\1\40\1\0\1\151\2\40\1\153\2\141\1\144\1\156\1"+
		"\40\1\150\1\164\1\144\1\40\1\0\1\u2019\1\143\1\40\3\u2019\2\40\1\145\1"+
		"\0\1\u2019\1\145\1\40\1\0\1\141\1\163\37\u2019\2\40\1\143\2\166\1\162"+
		"\1\156\1\145\1\uffff\1\0\1\54\1\153\2\40\1\0\2\40\1\u2019\1\163\1\40\1"+
		"\153\1\40\1\113\1\54\1\167\1\uffff\2\54\1\u2019\1\151\1\uffff\1\145\1"+
		"\171\1\0\1\145\1\uffff\1\165\1\131\1\165\1\145\1\uffff\1\73\1\55\1\162"+
		"\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40\1\145\1\156\1\u2019\1\156"+
		"\1\144\1\0\1\146\1\145\1\u2019\1\164\2\u2019\2\145\1\u2019\1\0\1\40\1"+
		"\156\3\0\1\162\1\0\1\u2019\1\156\1\145\26\u2019\1\51\5\u2019\1\163\1\141"+
		"\1\154\1\u2019\1\151\1\0\3\u2019\1\145\1\151\1\141\1\163\1\40\1\162\1"+
		"\145\1\0\1\150\1\145\1\105\1\40\1\164\1\162\1\54\1\144\1\147\1\54\1\151"+
		"\1\40\2\122\1\71\1\40\1\u2019\1\40\1\156\1\116\1\150\1\162\1\40\1\0\1"+
		"\40\1\u2019\1\146\1\40\1\0\1\145\2\0\1\162\1\144\1\0\2\u2019\1\0\1\u2019"+
		"\1\40\32\u2019\1\143\1\162\1\141\3\u2019\1\154\1\143\1\156\3\u2019\1\151"+
		"\1\163\1\123\1\127\1\171\1\u2019\1\40\1\150\1\156\3\71\1\0\1\144\1\107"+
		"\1\145\1\40\1\0\1\u2019\1\144\2\40\3\0\27\u2019\1\157\1\164\1\143\3\u2019"+
		"\1\154\1\145\1\143\3\0\1\162\1\u2019\1\40\2\uffff\1\u2019\1\0\1\u2019"+
		"\1\164\1\73\1\u2019\1\71\1\u2019\1\40\1\162\1\0\1\40\22\u2019\1\142\1"+
		"\151\1\153\2\u2019\1\145\1\102\2\145\1\uffff\1\154\1\122\1\uffff\1\71"+
		"\1\0\1\uffff\23\u2019\1\55\3\u2019\1\156\2\uffff\1\144\1\40\1\151\1\71"+
		"\1\u2019\1\0\20\u2019\1\0\1\103\1\0\2\u2019\1\164\1\102\14\u2019\1\0\3"+
		"\u2019\1\157\1\u2019\1\102\1\0\12\u2019\1\154\12\u2019\1\157\11\u2019"+
		"\1\162\14\u2019\1\0\16\u2019";
	static final String DFA67_acceptS =
		"\32\uffff\1\17\2\uffff\2\30\1\31\11\uffff\1\30\74\uffff\1\2\71\uffff\1"+
		"\25\2\uffff\1\17\3\uffff\1\27\1\24\7\uffff\1\16\u013b\uffff\1\5\50\uffff"+
		"\1\4\26\uffff\1\6\3\uffff\1\22\4\uffff\1\26\u0093\uffff\1\20\31\uffff"+
		"\1\4\46\uffff\1\1\74\uffff\1\3\17\uffff\1\4\14\uffff\1\14\141\uffff\1"+
		"\21\u00ae\uffff\1\23\132\uffff\1\4\20\uffff\1\4\4\uffff\1\4\4\uffff\1"+
		"\4\4\uffff\1\15\u00df\uffff\1\7\1\11\47\uffff\1\4\2\uffff\1\13\2\uffff"+
		"\1\4\30\uffff\1\12\1\10\154\uffff";
	static final String DFA67_specialS =
		"\1\101\16\uffff\1\100\22\uffff\1\4\1\53\1\71\1\11\44\uffff\1\111\1\14"+
		"\143\uffff\1\73\1\uffff\1\10\4\uffff\1\37\56\uffff\1\77\1\uffff\1\107"+
		"\12\uffff\1\u00f1\53\uffff\1\u00a9\3\uffff\1\7\45\uffff\1\u008a\46\uffff"+
		"\1\13\1\110\5\uffff\1\35\46\uffff\1\1\1\u0087\2\uffff\1\136\6\uffff\1"+
		"\u00a3\11\uffff\1\u00ac\14\uffff\1\u0082\46\uffff\1\u00be\1\134\2\uffff"+
		"\1\75\24\uffff\1\2\2\uffff\1\26\1\27\15\uffff\1\176\17\uffff\1\104\2\uffff"+
		"\1\151\44\uffff\1\56\20\uffff\1\u0096\6\uffff\1\65\1\uffff\1\67\5\uffff"+
		"\1\141\3\uffff\1\143\14\uffff\1\51\4\uffff\1\u00b0\6\uffff\1\u00ef\2\uffff"+
		"\1\127\6\uffff\1\u008d\2\uffff\1\121\3\uffff\1\u008c\6\uffff\1\u0098\6"+
		"\uffff\1\115\1\uffff\1\135\5\uffff\1\u00bd\21\uffff\1\u00a8\1\u00bc\11"+
		"\uffff\1\16\10\uffff\1\3\1\uffff\1\31\33\uffff\1\52\42\uffff\1\155\1\uffff"+
		"\1\u00bf\6\uffff\1\166\1\40\4\uffff\1\172\2\uffff\1\u00a7\2\uffff\1\u00f3"+
		"\1\64\1\130\1\uffff\1\u00c0\1\133\1\u00c1\1\66\4\uffff\1\140\7\uffff\1"+
		"\u00a4\1\114\3\uffff\1\u009d\1\uffff\1\u00af\6\uffff\1\u00f0\2\uffff\1"+
		"\62\1\u0080\1\u0081\7\uffff\1\u0086\5\uffff\1\60\7\uffff\1\55\2\uffff"+
		"\1\63\1\uffff\1\u00c2\1\uffff\1\50\1\uffff\1\u00ae\36\uffff\1\u00c3\10"+
		"\uffff\1\u009e\14\uffff\1\20\17\uffff\1\u0084\23\uffff\1\125\1\123\5\uffff"+
		"\1\45\1\uffff\1\36\5\uffff\1\157\4\uffff\1\41\1\u00c4\1\171\2\uffff\1"+
		"\175\1\117\1\uffff\1\116\2\uffff\1\u00c5\1\177\1\u00c6\2\uffff\1\72\5"+
		"\uffff\1\42\1\u00a1\1\u00a2\1\u00c7\4\uffff\1\21\2\uffff\1\30\1\uffff"+
		"\1\174\2\uffff\1\154\1\uffff\1\u0091\1\uffff\1\u0092\4\uffff\1\u00c8\1"+
		"\uffff\1\u009a\2\uffff\1\122\3\uffff\1\46\1\142\1\uffff\1\u00c9\45\uffff"+
		"\1\6\3\uffff\1\15\1\uffff\1\u00ca\1\u009f\4\uffff\1\u00f2\3\uffff\1\33"+
		"\1\32\2\uffff\1\23\4\uffff\1\131\1\uffff\1\105\1\u0093\4\uffff\1\u00cb"+
		"\1\44\5\uffff\1\173\1\uffff\1\u0088\11\uffff\1\u00cc\1\u00cd\11\uffff"+
		"\1\156\1\u00a6\3\uffff\1\u00ce\4\uffff\1\124\1\126\1\70\1\132\1\u00cf"+
		"\1\uffff\1\137\1\144\5\uffff\1\u00ab\4\uffff\1\u00d0\1\153\1\uffff\1\u0090"+
		"\1\47\1\162\1\160\1\u0089\1\u0099\1\uffff\1\u00d1\1\145\1\uffff\1\57\1"+
		"\u00d2\35\uffff\1\54\3\uffff\1\170\1\12\7\uffff\1\u00d3\2\uffff\1\u00aa"+
		"\1\0\1\u00d4\1\5\1\u008b\1\u00b2\1\uffff\1\25\1\uffff\1\u008f\13\uffff"+
		"\1\u00d5\12\uffff\1\u0094\1\uffff\1\22\4\uffff\1\161\2\uffff\1\76\2\uffff"+
		"\1\u00d6\2\uffff\1\106\1\uffff\1\113\1\112\2\uffff\1\152\1\u00d7\1\u0085"+
		"\1\uffff\1\u00d8\1\u00d9\1\u00da\1\uffff\1\u00db\1\147\43\uffff\1\u00dc"+
		"\7\uffff\1\17\2\uffff\1\u00dd\13\uffff\1\103\3\uffff\1\u0095\1\146\1\43"+
		"\4\uffff\1\u00b3\1\u00de\1\167\1\102\1\uffff\1\150\1\u00df\1\uffff\1\u00e0"+
		"\1\u00e1\2\uffff\1\u00e2\1\164\1\165\1\u00e3\1\u00ad\1\u00b5\43\uffff"+
		"\1\u00a5\1\u00a0\1\u009c\5\uffff\1\u0083\1\34\5\uffff\1\u00e4\3\uffff"+
		"\1\163\1\u00e5\1\74\1\uffff\1\u00b4\1\u00b1\1\u00e6\1\u00e7\1\u00e8\40"+
		"\uffff\1\u00e9\1\u00ea\1\u00eb\6\uffff\1\u00ec\5\uffff\1\120\1\u008e\1"+
		"\uffff\1\u00ed\1\u009b\40\uffff\1\u00ee\1\uffff\1\61\32\uffff\1\24\3\uffff"+
		"\1\u00bb\20\uffff\1\u00ba\1\uffff\1\u00b9\4\uffff\1\u0097\13\uffff\1\u00b8"+
		"\6\uffff\1\u00b7\54\uffff\1\u00b6\16\uffff}>";
	static final String[] DFA67_transitionS = {
			"\11\37\2\32\2\37\1\32\22\37\1\32\5\37\2\36\1\33\3\37\2\36\1\34\1\37\12"+
			"\31\2\36\5\37\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\1\1\3\1\2\1\20\1\35\1\21\1\22\1\23\1\30\1\24\1\25\1\26\1\27\1\35\4"+
			"\37\1\36\1\37\32\36\u1f9e\37\1\36\udfe6\37",
			"\1\46\5\uffff\1\50\2\uffff\1\42\1\44\15\uffff\1\40\7\uffff\1\41\5\uffff"+
			"\1\47\2\uffff\1\43\1\45",
			"\1\53\3\uffff\1\52\3\uffff\1\54",
			"\1\57\25\uffff\1\56\11\uffff\1\55",
			"\1\60\2\uffff\1\61\1\uffff\1\62\1\63\1\64\1\65\1\uffff\1\66\4\uffff"+
			"\1\67",
			"\1\77\33\uffff\1\70\3\uffff\1\71\3\uffff\1\72\2\uffff\1\73\2\uffff\1"+
			"\74\2\uffff\1\75\2\uffff\1\76",
			"\1\107\21\uffff\1\100\3\uffff\1\101\2\uffff\1\102\1\103\2\uffff\1\104"+
			"\2\uffff\1\105\5\uffff\1\106",
			"\1\112\16\uffff\1\110\15\uffff\1\111\2\uffff\1\113",
			"\1\114",
			"\1\121\26\uffff\1\115\2\uffff\1\116\2\uffff\1\117\2\uffff\1\120",
			"\1\127\22\uffff\1\122\3\uffff\1\123\2\uffff\1\124\2\uffff\1\125\2\uffff"+
			"\1\126",
			"\1\131\11\uffff\1\132\21\uffff\1\130",
			"\1\133\1\134\16\uffff\1\135\1\uffff\1\136",
			"\1\137",
			"\1\140\11\uffff\1\141\5\uffff\1\142",
			"\1\150\13\uffff\1\143\3\uffff\1\144\2\uffff\1\145\6\uffff\1\147\u0086"+
			"\uffff\1\146",
			"\1\151\3\uffff\1\152\2\uffff\1\153\3\uffff\1\154\2\uffff\1\155\2\uffff"+
			"\1\160\2\uffff\1\156\3\uffff\1\157",
			"\1\166\3\uffff\1\167\27\uffff\1\161\3\uffff\1\162\2\uffff\1\163\6\uffff"+
			"\1\164\5\uffff\1\165",
			"\1\u0086\16\uffff\1\u0083\4\uffff\1\u0085\1\uffff\1\u0084\11\uffff\1"+
			"\170\1\uffff\1\171\1\uffff\1\172\2\uffff\1\173\1\174\1\uffff\1\175\3"+
			"\uffff\1\176\1\177\3\uffff\1\u0080\1\u0081\1\uffff\1\u0082",
			"\1\u008a\2\uffff\1\u008f\6\uffff\1\u008b\5\uffff\1\u008d\22\uffff\1"+
			"\u008e\1\u0087\5\uffff\1\u0088\2\uffff\1\u0089\2\uffff\1\u008c",
			"\1\u0093\3\uffff\1\u0092\37\uffff\1\u0091\3\uffff\1\u0090",
			"\1\u0099\11\uffff\1\u0097\21\uffff\1\u0098\3\uffff\1\u0094\2\uffff\1"+
			"\u0095\1\u0096",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\3\51\3\uffff\1\51\1\u009d\1\51\1\uffff\12\u009e\1\u00a2\1\u009f\5\uffff"+
			"\32\51\4\uffff\1\51\1\uffff\10\51\1\u00a1\21\51\u1f9e\uffff\1\51",
			"",
			"\2\u00a7\2\uffff\1\u00a7\22\uffff\1\u00a7\5\uffff\2\u00a5\4\uffff\2"+
			"\u00a5\2\uffff\12\u00a4\2\u00a5\5\uffff\32\u00a6\4\uffff\1\u00a5\1\uffff"+
			"\32\u00a5\u1f9e\uffff\1\u00a5",
			"\3\51\3\uffff\2\51\1\u00a9\1\uffff\14\51\5\uffff\32\51\4\uffff\1\51"+
			"\1\uffff\32\51\u1f9e\uffff\1\51",
			"",
			"",
			"",
			"\1\u00ab\1\uffff\1\u00ac\4\uffff\1\u00aa",
			"\1\u00ad\4\uffff\1\u00ae",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0\62\uffff\1\u00af",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0\122\uffff\1\u00b1",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b9\3\uffff\1\u00b8",
			"\1\u00ba\25\uffff\1\u00bb",
			"\1\u00bc",
			"\1\u00bd\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7\2\uffff\1\u00c8\2\uffff\1\u00cb\4\uffff\1\u00c9\5\uffff\1\u00ca",
			"\1\u00cc",
			"\1\u00cd\15\uffff\1\u00ce\5\uffff\1\u00cf",
			"\1\u00d0\1\u00d1\1\uffff\1\u00d2\2\uffff\1\u00d3\1\u00d4",
			"\1\u00d5\7\uffff\1\u00d6\13\uffff\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da\4\uffff\1\u00db\3\uffff\1\u00dc\3\uffff\1\u00dd",
			"\1\u00de",
			"\1\u00df\3\uffff\1\u00e0\5\uffff\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4\10\uffff\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8\10\uffff\1\u00e9\1\uffff\1\u00ea",
			"\1\u00eb\4\uffff\1\u00ec",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"\1\u00ed\14\uffff\1\u00ee",
			"\1\u00ef\10\uffff\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3\3\uffff\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9\5\uffff\1\u00fa",
			"\1\u00fc\3\uffff\1\u00fb",
			"\1\u00fd",
			"\1\u00fe\3\uffff\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107\14\uffff\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b\4\uffff\1\u010c\3\uffff\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112\1\uffff\1\u0113",
			"\1\u0114\1\uffff\1\u0115\6\uffff\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119\2\uffff\1\u011a\1\u011b\1\uffff\1\u011c\2\uffff\1\u011d",
			"\1\u011e\4\uffff\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0123\7\uffff\1\u0122",
			"\1\u0124\17\uffff\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b\2\uffff\1\u012c\1\u012d\6\uffff\1\u012e",
			"\1\u012f\6\uffff\1\u0130",
			"\1\u0131\22\uffff\1\u0132",
			"\1\u0133\3\uffff\1\u0134",
			"\1\u0135\11\uffff\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139\7\uffff\1\u013a",
			"\1\u013b",
			"\1\u013d\4\uffff\1\u013c",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0145\130\uffff\1\u0144",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014f\1\uffff\1\u014e",
			"\1\u0150",
			"\1\u0151",
			"\1\u0155\4\uffff\1\u0152\2\uffff\1\u0153\6\uffff\1\u0154",
			"\1\u0156",
			"\1\u0158\5\uffff\1\u0157",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\12\u015f",
			"\3\51\3\uffff\1\51\1\u009d\1\51\1\uffff\12\u009e\1\u00a2\1\u009f\5\uffff"+
			"\32\51\4\uffff\1\51\1\uffff\10\51\1\u00a1\21\51\u1f9e\uffff\1\51",
			"\12\u0160",
			"",
			"\1\u0161",
			"\12\u0162",
			"",
			"\2\u0164\2\uffff\1\u0164\22\uffff\1\u0164\10\uffff\1\u0165\6\uffff\12"+
			"\u0163",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\1\u0166\4\uffff\2\u00a5\1"+
			"\uffff\1\u0168\2\uffff\2\u00a5\1\u0166\13\uffff\2\u00a5\3\uffff\1\u0166"+
			"\37\uffff\1\u00a5\1\uffff\32\u00a5\u1f9e\uffff\1\u00a5",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\1\u016a\4\uffff\2\u0169\1"+
			"\uffff\1\u0168\2\uffff\2\u0169\1\u016a\13\uffff\2\u0169\3\uffff\1\u016a"+
			"\1\uffff\32\u0169\4\uffff\1\u0169\1\uffff\32\u0169\u1f9e\uffff\1\u0169",
			"",
			"",
			"\3\51\3\uffff\2\51\1\u00a9\1\uffff\14\51\5\uffff\32\51\4\uffff\1\51"+
			"\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\146",
			"\1\u0174",
			"\1\u0176\7\uffff\1\u0175",
			"\1\u0177\20\uffff\1\u0178",
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
			"\1\u0185\15\uffff\1\u0186",
			"\1\u0187\12\uffff\1\u0188\2\uffff\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c\6\uffff\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193\25\uffff\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a\22\uffff\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0\3\uffff\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6\5\uffff\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0\113\uffff\1\u01ac",
			"\1\u01ad",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\1\u01b1",
			"\1\u01b2\5\uffff\1\u01b3",
			"\1\u01b4",
			"\1\u01b5\5\uffff\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\146",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2\27\uffff\1\u01c3",
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
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\1\146",
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
			"\1\u01fe\5\uffff\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206\7\uffff\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a\1\u020b",
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
			"\3\51\3\uffff\1\51\1\u022d\1\51\1\uffff\12\u015f\1\51\1\u009f\5\uffff"+
			"\32\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\3\51\3\uffff\1\51\1\u022e\1\51\1\uffff\12\u0160\1\51\1\u009f\5\uffff"+
			"\32\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u022f",
			"\2\u0230\2\uffff\1\u0230\22\uffff\1\u0230\17\uffff\12\u0162",
			"\2\u0164\2\uffff\1\u0164\22\uffff\1\u0164\10\uffff\1\u0165\6\uffff\12"+
			"\u0231",
			"\2\u0164\2\uffff\1\u0164\22\uffff\1\u0164\5\uffff\2\u0232\1\uffff\1"+
			"\u00a7\2\uffff\2\u0232\2\uffff\12\u0233\2\u0232\5\uffff\32\u0234\4\uffff"+
			"\1\u0232\1\uffff\32\u0232\u1f9e\uffff\1\u0232",
			"\3\51\3\uffff\3\51\1\uffff\14\51\5\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\10\uffff\1\u0168",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\5\uffff\2\u0232\4\uffff\2"+
			"\u0232\2\uffff\12\u0233\2\u0232\5\uffff\32\u0234\4\uffff\1\u0232\1\uffff"+
			"\32\u0232\u1f9e\uffff\1\u0232",
			"\3\51\3\uffff\3\51\1\uffff\14\51\5\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\1\u016a\4\uffff\2\u0169\1"+
			"\uffff\1\u0168\2\uffff\2\u0169\1\u016a\13\uffff\2\u0169\3\uffff\1\u016a"+
			"\1\uffff\32\u0169\4\uffff\1\u0169\1\uffff\32\u0169\u1f9e\uffff\1\u0169",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\10\uffff\1\u0168",
			"\1\u0236\3\uffff\1\u0237",
			"\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"\2\u00b0\2\uffff\1\u00b0\22\uffff\1\u00b0",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f",
			"\1\146",
			"\1\u0240",
			"\1\u0241\3\uffff\1\u0242",
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
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\146\103\uffff\1\u0267\10\uffff\1\u0268",
			"\1\u0215",
			"\1\u0269",
			"\1\u026a",
			"\1\146",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\146",
			"\1\u0271",
			"\1\u0272",
			"\1\u0273",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\146",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027e\17\uffff\1\u027d",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\146",
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
			"\1\u02a9",
			"\1\u02aa",
			"\1\u02ab",
			"\1\u02ac",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\4\uffff\2\51\2\uffff\1\51\1\u02ae\12\51\5\uffff\1\u02af\1\u02b0"+
			"\1\u02b1\1\51\1\u02b2\1\u02b3\1\u02b4\1\51\1\u02b5\1\51\1\u02b6\1\u02b7"+
			"\1\u02b8\1\u02b9\3\51\1\u02ba\1\u02bb\1\u02bc\2\51\1\u02bd\3\51\4\uffff"+
			"\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u02be",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\12\51\1\u02bf\7\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u02c1",
			"",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\1\u02c5",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\2\u02c9\2\uffff\1\u02c9\22\uffff\1\u02c9",
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
			"\1\146",
			"\1\u02d4",
			"\1\u02d5",
			"\1\146",
			"\1\146",
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
			"\1\146\17\uffff\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\1\u02e6",
			"",
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
			"\1\146",
			"\1\u02f2",
			"\1\u02f3",
			"\1\146\107\uffff\1\u02f4",
			"\1\u01ec",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"",
			"\12\u02fb",
			"\12\u02fc",
			"\1\u02fd",
			"",
			"\2\u0164\2\uffff\1\u0164\22\uffff\1\u0164\10\uffff\1\u02fe\6\uffff\12"+
			"\u02ff",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\1\u0300\4\uffff\2\u0232\1"+
			"\uffff\1\u0168\2\uffff\2\u0232\1\u0300\13\uffff\2\u0232\3\uffff\1\u0300"+
			"\37\uffff\1\u0232\1\uffff\32\u0232\u1f9e\uffff\1\u0232",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\10\uffff\1\u0168\6\uffff\12"+
			"\u0233",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\1\u0302\4\uffff\2\u0301\1"+
			"\uffff\1\u0168\2\uffff\2\u0301\1\u0302\13\uffff\2\u0301\3\uffff\1\u0302"+
			"\1\uffff\32\u0301\4\uffff\1\u0301\1\uffff\32\u0301\u1f9e\uffff\1\u0301",
			"",
			"\1\u0303",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"\1\u0308",
			"\1\u0309",
			"\2\u01ec\6\uffff\2\u030a\10\uffff\1\u030a",
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
			"\1\u0315",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
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
			"\1\146",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u032e",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\146",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\1\146",
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
			"\1\146\122\uffff\1\u0344",
			"\1\u0345",
			"\1\u0346",
			"\1\51\4\uffff\3\51\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\32"+
			"\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u0348",
			"\1\146",
			"\1\u0349",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\1\146",
			"\1\u034f",
			"\1\u0350",
			"\1\146\104\uffff\1\u0351",
			"\1\u0352",
			"\1\u0353",
			"\1\u02c9",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359",
			"\1\146",
			"\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\1\146",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\146",
			"\1\u0363",
			"\1\51\4\uffff\3\51\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\32"+
			"\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\146\122\uffff\1\u0369",
			"\1\u036a",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\uffff",
			"\2\51\2\uffff\1\51\22\uffff\1\51\10\uffff\1\51\6\uffff\3\51\1\u0371"+
			"\1\51\1\u0372\4\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\14"+
			"\51\1\u0373\15\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u0375\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\16\51\1\u0374\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u0376\3\51\1\u0377\2\51\1\u0378\5\51\1\u0379\5\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u037a\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u037b\2\51\1\u037c\16\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u037d\11\51\1\u037e\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u037f\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u0380\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0381"+
			"\15\51\1\u0382\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0383\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0384\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0385\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\14"+
			"\51\1\u0386\6\51\1\u0387\1\u0388\5\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0389\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u038a\2\51\1\u038b\1\u038c\21\51\u1f9e\uffff\1\51",
			"\1\u038d",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\1\u038f",
			"\2\u0390\2\uffff\1\u0390\22\uffff\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"",
			"\1\146",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\146",
			"\1\u039f",
			"\1\146",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u03ac",
			"",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"\1\u03b0",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\146",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc",
			"\1\u03bd",
			"\1\u03be",
			"\1\u03bf",
			"\1\u03c0",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3\2\uffff\12\u02fb",
			"\3\51\3\uffff\1\51\1\u03c4\1\51\1\uffff\12\u02fc\1\51\1\u009f\5\uffff"+
			"\32\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u03c5",
			"\2\u03c6\2\uffff\1\u03c6\22\uffff\1\u03c6\5\uffff\3\51\3\uffff\3\51"+
			"\1\uffff\12\u03c7\2\51\5\uffff\32\51\4\uffff\1\51\1\uffff\32\51\u1f9e"+
			"\uffff\1\51",
			"\2\u0164\2\uffff\1\u0164\22\uffff\1\u0164\10\uffff\1\u0165\6\uffff\12"+
			"\u02ff",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\10\uffff\1\u0168",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\1\u0302\4\uffff\2\u0301\1"+
			"\uffff\1\u0168\2\uffff\2\u0301\1\u0302\13\uffff\2\u0301\3\uffff\1\u0302"+
			"\1\uffff\32\u0301\4\uffff\1\u0301\1\uffff\32\u0301\u1f9e\uffff\1\u0301",
			"\2\u0167\2\uffff\1\u0167\22\uffff\1\u0167\10\uffff\1\u0168",
			"\1\u030a",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"\1\u03cb",
			"\1\u03cc",
			"\1\u03cc",
			"",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\1\u03d0",
			"\1\u03d1",
			"\1\u03d2",
			"\1\u03d3",
			"\1\u03d4",
			"\1\u03d5",
			"\1\146",
			"\1\u03d6",
			"\1\uffff",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\1\u03dc",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0",
			"\1\u03e1",
			"\1\146",
			"\1\u03e2",
			"\1\u03e3",
			"\1\146\122\uffff\1\u03e4",
			"\1\u03e5",
			"\1\u03e6",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\146",
			"\1\u03e8",
			"\1\uffff",
			"\1\146",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u03ea",
			"\1\u03eb",
			"\1\u03ec",
			"\1\u03ed",
			"\1\146",
			"\1\u03ee",
			"\1\u03ef",
			"\1\u03f0",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"\1\u03f4",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u03f6",
			"\1\u03f7",
			"\1\u03f8",
			"\1\146",
			"\1\u03f9",
			"\1\146",
			"\1\u03fa",
			"\1\u03fb",
			"",
			"\1\u03fc",
			"\1\u03fd",
			"\1\u03fe",
			"\1\146",
			"\1\u03cc",
			"\1\u03cc",
			"\1\146",
			"\1\146",
			"\1\146",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"",
			"\1\146",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\16\51\1\u040a\3\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u040c",
			"\1\u040d",
			"\1\u040e",
			"\1\u040f",
			"\1\u0410",
			"",
			"\1\u0411",
			"\1\146",
			"\1\u0412",
			"\1\u0413",
			"\1\146",
			"\1\u0414",
			"\1\uffff",
			"\1\u0415",
			"\1\146",
			"\1\u0416",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0418",
			"\2\51\2\uffff\1\51\22\uffff\1\u0419\10\uffff\1\51\6\uffff\12\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u041a\10\uffff\1\51\6\uffff\12\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u041b\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\30"+
			"\51\1\u041c\1\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\1\u041d\1\51\4\uffff\2\51\2"+
			"\uffff\14\51\5\uffff\32\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u041e\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\24"+
			"\51\1\u041f\5\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u0420\10\51\1\u0421\16\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0422\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\6\51"+
			"\1\u0423\23\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0424\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0425"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0426\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\13"+
			"\51\1\u0427\5\51\1\u0428\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0429\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\2\51\1\u042a\27\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\51"+
			"\1\u042b\30\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u042c\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u042d\4\51\1\u042e\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\25"+
			"\51\1\u042f\4\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\24"+
			"\51\1\u0430\5\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0431\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0432"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u0433\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\30"+
			"\51\1\u0434\1\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\13"+
			"\51\1\u0435\16\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0436\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0437\10\51\u1f9e\uffff\1\51",
			"\1\u0438",
			"\1\uffff",
			"\1\u0439",
			"\2\u0390\2\uffff\1\u0390\22\uffff\1\u0390\40\uffff\1\u043c\3\uffff\1"+
			"\u043a\10\uffff\1\u043b",
			"\1\u043d",
			"\1\u043e",
			"\1\u043f",
			"\1\u0440",
			"\1\u0441",
			"\1\u0442",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0444",
			"\1\u0445",
			"\1\u0446",
			"\1\u0447",
			"\1\u0448",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d\3\uffff\1\u044e",
			"\1\u044f",
			"\1\u0450",
			"\1\146",
			"\1\u03cc",
			"\1\u0451",
			"\1\u0452",
			"\1\u0453",
			"\1\u0454",
			"\1\u03cc",
			"\1\u0455",
			"\1\u0456",
			"\1\u0457",
			"\1\u0458",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\u045d",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u045f",
			"\1\u0460",
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
			"\12\u046d",
			"\12\u046e",
			"\1\u046f",
			"",
			"\12\u0470",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0473",
			"\1\u0474",
			"\2\u0475\2\uffff\1\u0475\22\uffff\1\u0475",
			"\1\u0476",
			"\2\u01ec\6\uffff\2\u030a\10\uffff\1\u030a",
			"\1\146",
			"\1\u0477",
			"\1\146",
			"\1\u0478",
			"\1\u0479",
			"\1\u047a",
			"\1\u047b",
			"\1\u047c",
			"\1\146",
			"\1\u047d",
			"\1\u047e",
			"\1\u047f",
			"\1\u0480",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\1\146",
			"\1\u0482",
			"\1\u0483",
			"\1\146",
			"\1\146",
			"\1\u0484",
			"\1\146",
			"\1\u0485",
			"\1\u0486",
			"\1\uffff",
			"\1\146\122\uffff\1\u0487",
			"\1\uffff",
			"\1\u0488",
			"\1\u0489",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u048b",
			"\1\u048c",
			"\1\u048d",
			"\1\u048e",
			"\1\u048f",
			"\1\146",
			"\1\146",
			"\1\146",
			"\1\uffff",
			"\1\u0490",
			"\1\u0491",
			"\1\u0492",
			"\1\u0493",
			"\1\146",
			"\1\u0494",
			"\1\51\4\uffff\3\51\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\32"+
			"\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\146",
			"\1\u0495",
			"\1\146",
			"\1\u0496",
			"\1\u0497",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0499",
			"\1\u0357",
			"\1\u049a",
			"\1\146",
			"\1\u049b",
			"\1\u049c",
			"\1\u049d",
			"\1\u049e",
			"\1\uffff",
			"\1\u049f",
			"\1\146",
			"\1\u04a0",
			"\1\u04a1",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u04a3",
			"\1\u04a4",
			"\1\u04a5",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u04a7",
			"\1\uffff",
			"\1\u04a8",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\10\51\1\u04a9\21\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\10\51\1\u04aa\21\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u04ab\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\12"+
			"\51\1\u04ac\17\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u04ad\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\37\uffff\1\51\1\uffff\32\51\u1f9e"+
			"\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u04ae\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\14"+
			"\51\1\u04af\15\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\12"+
			"\51\1\u04b0\17\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u04b1\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\13"+
			"\51\1\u04b2\16\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\13"+
			"\51\1\u04b3\16\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\13"+
			"\51\1\u04b4\16\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u04b5\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\14"+
			"\51\1\u04b6\15\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u04b7\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u04b8\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u04b9\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u04ba\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u04bb\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\6\51"+
			"\1\u04bc\23\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u04bd\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u04be\27\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u04bf"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\6\51"+
			"\1\u04c0\23\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u04c1\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u04c2\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u04c3\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u04c5\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u04c6\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u04c7\25\51\u1f9e\uffff\1\51",
			"\1\u04c8",
			"\1\u04c9",
			"\1\u04ca",
			"\1\u04cb",
			"\1\u04cc",
			"\1\146",
			"\1\u04cd",
			"\1\u04ce",
			"\1\u04cf",
			"\1\146",
			"\1\u04d0",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u04d2",
			"\1\u04d3",
			"\1\u04d4",
			"\1\u04d5",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u04d7",
			"\1\u04d8",
			"\1\u04d9",
			"\1\146",
			"\1\146",
			"\1\u04da",
			"\1\u04db",
			"\1\146",
			"\1\u04dc",
			"\1\u04dd",
			"\1\u04de",
			"\1\u04df",
			"\1\146",
			"\1\u04e0",
			"\1\146",
			"\1\u04e1",
			"\1\u03cc",
			"\1\u03cc",
			"\1\u04e2",
			"\1\u04e3",
			"\1\uffff",
			"\1\146\122\uffff\1\u04e4",
			"\1\u04e5",
			"\1\u04e6",
			"\1\u0364",
			"\1\u04e7",
			"\1\u04e8",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"\1\u04ed",
			"\1\u04ee",
			"\1\u04ef",
			"\1\u01ec",
			"\3\51\3\uffff\3\51\1\uffff\12\u046d\2\51\5\uffff\32\51\4\uffff\1\51"+
			"\1\uffff\32\51\u1f9e\uffff\1\51",
			"\12\u046e\1\uffff\1\u009f",
			"\12\u04f1",
			"\12\u04f2",
			"\1\uffff",
			"\1\uffff",
			"\1\u04f3",
			"\1\u04f4",
			"",
			"\1\u04f5",
			"\1\u04f6",
			"\1\u04f7",
			"\1\u04f8",
			"\1\u04f9",
			"\1\u04fa",
			"\1\146",
			"\1\146",
			"\1\u04fb",
			"\1\u04fc",
			"\1\u04fd",
			"\1\uffff",
			"\1\u04fe",
			"\1\u04ff",
			"\1\u01ec",
			"\1\u0500",
			"\1\146",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\146",
			"\1\uffff",
			"\1\u0502",
			"\1\146",
			"\1\146",
			"\1\u0503",
			"\1\u0504",
			"\1\u0505",
			"\1\u0506",
			"\1\u0507",
			"\1\146",
			"\1\u0508",
			"\1\u0509",
			"\1\u050a",
			"\1\u01ec",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u050c",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\4\51\1\u050d\15\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\146",
			"\1\146",
			"\1\u0511",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0513",
			"\1\146",
			"\1\uffff",
			"\1\u0514",
			"\1\u0515",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u0516\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u0517\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0518\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0519\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\17\51\1\u051a\12\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u051b"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\51"+
			"\1\u051c\30\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u051d\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u051e\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\30"+
			"\51\1\u051f\1\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0520\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u0521\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\1"+
			"\51\1\u0522\1\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51"+
			"\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0523"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0524\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0525\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u0526\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\1\u0527\1\51\4\uffff\2\51\2"+
			"\uffff\14\51\5\uffff\32\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0528"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u0529\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\7\51\1\u052a\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u052b"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\2"+
			"\51\1\u052c\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u052d\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u052e\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u052f\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u0530\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0531\25\51\u1f9e\uffff\1\51",
			"\2\146\2\uffff\1\146\22\uffff\1\146\5\uffff\2\51\1\u0535\3\uffff\3\51"+
			"\1\uffff\14\51\5\uffff\1\u0532\1\u0534\12\51\1\u0536\2\51\1\u0533\12"+
			"\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u0538\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0539\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7"+
			"\51\1\u053a\22\51\u1f9e\uffff\1\51",
			"\1\146",
			"\1\146",
			"\1\u053b",
			"\1\u053c",
			"\1\u053d",
			"\1\u053e",
			"\1\u053f",
			"\1\u0540",
			"",
			"\1\uffff",
			"\1\u03cc",
			"\1\u0541",
			"\1\146",
			"\1\146",
			"\1\uffff",
			"\1\146",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0543",
			"\1\146",
			"\1\u0544",
			"\1\u04eb",
			"\1\u0545",
			"\1\u03cc",
			"\1\u0546",
			"",
			"\1\u03cc",
			"\1\u03cc",
			"\2\u01ec\2\uffff\1\u01ec\22\uffff\1\u01ec\1\51\4\uffff\3\51\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\1\u0547",
			"",
			"\1\u0548",
			"\1\u0549",
			"\1\uffff",
			"\1\u054a",
			"",
			"\1\u054b",
			"\1\u054c",
			"\1\u054d",
			"\1\u054e",
			"",
			"\1\u054f\2\uffff\12\u04f1\1\uffff\1\u0550",
			"\1\u0551",
			"\1\u0552",
			"\1\146",
			"\1\u0553",
			"\1\146",
			"\1\u0554",
			"\1\u0555",
			"\1\u0556",
			"\1\u0557",
			"\1\146",
			"\1\u0558",
			"\1\u0559",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u055b",
			"\1\u055c",
			"\1\uffff",
			"\1\u055d",
			"\1\u055e",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0560",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0563",
			"\1\u0564",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\1\146",
			"\1\u0566",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0567",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u0569",
			"\1\u056a",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u056b\27\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u056c\27\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u056d\27\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u056e\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u056f\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\17"+
			"\51\1\u0570\12\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0571\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0572\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0573\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\1"+
			"\51\1\u0574\1\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51"+
			"\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u0575\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\2\51\1\u0576\27\51\4\uffff\1\51"+
			"\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u0577\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u0578\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u0579\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u057a\1\51\4\uffff\2\51\1\uffff\1\u04c4"+
			"\2\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1"+
			"\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u057b\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\37\uffff\1\51\1\uffff\32\51\u1f9e"+
			"\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u057c\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\2\51\1\u057d\27\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u057e"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u057f\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u0580\10\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\22\51\1\u0581\7\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u0582\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0583"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\27"+
			"\51\1\u0584\2\51\u1f9e\uffff\1\51",
			"\1\u0585",
			"\1\u0586",
			"\1\u0587",
			"\2\51\4\uffff\2\51\2\uffff\14\51\5\uffff\14\51\1\u0588\15\51\4\uffff"+
			"\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u02be",
			"\1\uffff",
			"\2\51\2\uffff\1\51\22\uffff\1\u0589\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u058a"+
			"\31\51\u1f9e\uffff\1\51",
			"\1\u058b",
			"\1\u058c",
			"\1\u058d",
			"\1\u058e",
			"\1\146",
			"\1\u058f",
			"\1\u0590",
			"\1\uffff",
			"\1\u0591",
			"\1\u0592",
			"\1\u0593",
			"\2\u0594\2\uffff\1\u0594\22\uffff\1\u0594",
			"\1\u0595",
			"\1\u0596",
			"\1\u03cc",
			"\1\u0597",
			"\1\u0598",
			"\1\u03cc",
			"\1\u0599",
			"\1\146",
			"\1\u059a",
			"\1\u059b",
			"\12\u059c",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\146",
			"\1\u059e",
			"\1\u059f",
			"\1\u05a0",
			"\1\u05a1",
			"\1\146",
			"\1\uffff",
			"\1\146",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u05a3",
			"\1\146",
			"\1\uffff",
			"\1\u05a4",
			"\1\uffff",
			"\1\uffff",
			"\1\u05a5",
			"\1\u05a6",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\146",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u05aa\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u05ab\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u05ac"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\2\51\1\u05ad\27\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u05ae\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u05af\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u05b0\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\2\51\1\u05b1\27\51\4\uffff\1\51"+
			"\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u05b2\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u05b3\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u05b4\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\21\51\1\u05b5\4\51\1\u05b6\3\51\4\uffff\1\51\1\uffff\32\51"+
			"\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\21\51\1\u05b7\10\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u05b8\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u05b9\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u05ba\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\24"+
			"\51\1\u05bb\5\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\1\51\1\u05bd\1\51\1\u05bc\26\51\4\uffff\1\51\1\uffff\32\51"+
			"\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u05be\27\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u05bf\1\51\4\uffff\2\51\1\uffff\1\u04c4"+
			"\2\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1"+
			"\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u05c0\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\1\u05c1",
			"\1\u05c2",
			"\1\u05c3",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u05c4\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\22\51\1\u05c5\7\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u05c6\21\51\u1f9e\uffff\1\51",
			"\1\u05c7",
			"\1\u05c8",
			"\1\u05c9",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u05cd",
			"\1\u05ce",
			"\1\u05cf",
			"\2\u0594\2\uffff\1\u0594\22\uffff\1\u0594\41\uffff\1\u05d0\4\uffff\1"+
			"\u05d0\6\uffff\3\u05d0\1\uffff\1\u05d1\2\uffff\3\u05d0",
			"\1\u05d2",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\146",
			"\1\u05d4",
			"\1\u05d5",
			"\12\u05d6",
			"\12\u05d7",
			"\12\u05d8",
			"\1\uffff",
			"\1\u05d9",
			"\1\u05da",
			"\1\u05db",
			"\1\146",
			"\1\uffff",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u05dd",
			"\1\146",
			"\1\146",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u05de\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u05df"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u05e0\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u05e1\1\51\4\uffff\2\51\1\uffff\1\u04c4"+
			"\2\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1"+
			"\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u05e2"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\22\51\1\u05e3\3\51\1\u05e4\3\51\4\uffff\1\51\1\uffff\32\51"+
			"\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u05e5\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u05e6"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u05e7\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u05e8"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u05e9\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u05ea\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u05eb\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u05ec\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u05ed\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\2\51\1\u05ee\27\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u05ef\26\51\u1f9e\uffff\1\51",
			"\1\u05f0",
			"\1\u05f1",
			"\1\u05f2",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u042e\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\17"+
			"\51\1\u05f3\12\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u05f4\10\51\u1f9e\uffff\1\51",
			"\1\u05f5",
			"\1\u05f6",
			"\1\u05f7",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u05f8",
			"\1\51\4\uffff\3\51\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\32"+
			"\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u05f9",
			"",
			"",
			"\1\51\4\uffff\3\51\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\32"+
			"\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\1\51\4\uffff\3\51\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\32"+
			"\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u05fa",
			"\12\u05d6\1\uffff\1\u0550",
			"\3\51\3\uffff\1\51\1\u05fb\1\51\1\uffff\12\u05d7\1\51\1\u0550\5\uffff"+
			"\32\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\12\u05fd",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\1\u05ff",
			"\1\u0600",
			"\1\uffff",
			"\1\146",
			"\2\51\2\uffff\1\51\22\uffff\1\u0601\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\12"+
			"\51\1\u0602\17\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0603"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\2\51\1\u0604\17\51\1\u0605\7\51\4\uffff\1\51\1\uffff\32\51"+
			"\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u0606\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u0607\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0608\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u0609\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u060a\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u060b\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u060c\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u060d\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\6\51"+
			"\1\u060e\23\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u060f\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u0610\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0611\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\1\u0612",
			"\1\u0613",
			"\1\u0614",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0615\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0616\25\51\u1f9e\uffff\1\51",
			"\1\u0617",
			"\2\u0619",
			"\1\u061a",
			"\1\u061b",
			"",
			"\1\u061c",
			"\1\u061d",
			"",
			"\12\u061e",
			"\1\uffff",
			"",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\26\51\1\u0620\3\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0621\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u0622\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0623\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\17"+
			"\51\1\u0624\12\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0625\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0626\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0627\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u0628\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0629\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u062a\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u062c\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u062b\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u062d\27\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u062e\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u062f"+
			"\31\51\u1f9e\uffff\1\51",
			"\1\51\4\uffff\2\51\1\u0535\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1"+
			"\uffff\14\51\1\u01e9\15\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\1\u0631",
			"\1\51\4\uffff\2\51\1\u0535\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1"+
			"\uffff\14\51\1\u01e9\15\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0633\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u0634\26\51\u1f9e\uffff\1\51",
			"\1\u0635",
			"",
			"",
			"\1\u0636",
			"\1\146",
			"\1\u0637",
			"\12\u0638",
			"\3\51\3\uffff\3\51\1\uffff\14\51\5\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0639"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u063a\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u063b\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u063c\27\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u063d\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u063e\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u063f\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0640\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\1\u0641\31\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0642\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u062c\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\3\51\3\uffff\3\51\1\uffff\14\51\5\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u0644\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0645"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u0646\6\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\1\u0647",
			"\1\uffff",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u0648\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\1\u0649",
			"\2\u0619",
			"\2\146\2\uffff\1\146\22\uffff\1\146\1\51\4\uffff\2\51\1\u01e8\3\uffff"+
			"\3\51\1\uffff\14\51\3\uffff\1\51\1\uffff\14\51\1\u01e9\15\51\4\uffff"+
			"\1\51\1\uffff\22\51\1\u01e7\7\51\u1f9e\uffff\1\51",
			"\3\51\3\uffff\3\51\1\uffff\12\u0638\1\51\1\u0550\5\uffff\32\51\4\uffff"+
			"\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u064b\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\1\51\1\u064c\30\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u064d\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\12"+
			"\51\1\u064e\17\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u064f\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u0650\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u0651\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u0652\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u062c\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4"+
			"\51\1\u0653\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u0654\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\1\u0655",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\6\51"+
			"\1\u0656\23\51\u1f9e\uffff\1\51",
			"\2\u0619",
			"\1\uffff",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0657\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0658"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0659\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u065a\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u065b\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u065c"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u065d\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\22"+
			"\51\1\u065e\7\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\3\51\1\u065f\26\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\1\u0660",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0661\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0662\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\30"+
			"\51\1\u0663\1\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0664\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\6\51"+
			"\1\u0665\23\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\1\u0666"+
			"\31\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0667\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u0668\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u062c\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\24"+
			"\51\1\u0669\5\51\u1f9e\uffff\1\51",
			"\1\u066a",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u066b\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u066c\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u066d\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u066e\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\26\51\1\u066f\3\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\2\51"+
			"\1\u0670\27\51\u1f9e\uffff\1\51",
			"\1\u0671",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0672\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\21"+
			"\51\1\u0673\10\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0674\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\7\51"+
			"\1\u0675\22\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\12"+
			"\51\1\u0676\17\51\u1f9e\uffff\1\51",
			"\1\51\4\uffff\2\51\1\u0535\3\uffff\3\51\1\uffff\14\51\3\uffff\1\51\1"+
			"\uffff\14\51\1\u01e9\15\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u0678\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u0679\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u067a\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\u067b\1\51\4\uffff\2\51\1\uffff\1\51\2"+
			"\uffff\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff"+
			"\32\51\u1f9e\uffff\1\51",
			"\1\uffff",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\3\51"+
			"\1\u067c\26\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\23"+
			"\51\1\u067d\6\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\1\51\5\uffff\2\51\4\uffff\2\51\2\uffff\14"+
			"\51\5\uffff\23\51\1\u067e\6\51\4\uffff\1\51\1\uffff\32\51\u1f9e\uffff"+
			"\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\4\51"+
			"\1\u067f\25\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\16"+
			"\51\1\u0680\13\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\13"+
			"\51\1\u0681\16\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\13"+
			"\51\1\u0682\16\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\10"+
			"\51\1\u0683\21\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\15"+
			"\51\1\u0684\14\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\51\2\uffff\3"+
			"\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\6\51"+
			"\1\u0685\23\51\u1f9e\uffff\1\51",
			"\2\51\2\uffff\1\51\22\uffff\2\51\4\uffff\2\51\1\uffff\1\u04c4\2\uffff"+
			"\3\51\13\uffff\2\51\3\uffff\1\51\1\uffff\32\51\4\uffff\1\51\1\uffff\32"+
			"\51\u1f9e\uffff\1\51"
	};

	static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
	static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
	static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
	static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
	static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
	static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
	static final short[][] DFA67_transition;

	static {
		int numStates = DFA67_transitionS.length;
		DFA67_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
		}
	}

	protected class DFA67 extends DFA {

		public DFA67(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 67;
			this.eot = DFA67_eot;
			this.eof = DFA67_eof;
			this.min = DFA67_min;
			this.max = DFA67_max;
			this.accept = DFA67_accept;
			this.special = DFA67_special;
			this.transition = DFA67_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE | NON_CONF_SECOND_LINE_COMMENT | RALLY_TOKEN_WITH_TYPE | RALLY_STANDALONE_COMMENT | RALLY_TOKEN | RALLY_RING_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA67_1237 = input.LA(1);
						 
						int index67_1237 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1237==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1237);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA67_413 = input.LA(1);
						 
						int index67_413 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_413==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_413=='d') ) {s = 615;}
						else if ( (LA67_413=='m') ) {s = 616;}
						else s = 41;
						 
						input.seek(index67_413);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA67_511 = input.LA(1);
						 
						int index67_511 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_511==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_511);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA67_723 = input.LA(1);
						 
						int index67_723 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_723==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_723);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA67_34 = input.LA(1);
						 
						int index67_34 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_34=='S') ) {s = 175;}
						else if ( ((LA67_34 >= '\t' && LA67_34 <= '\n')||LA67_34=='\r'||LA67_34==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_34);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA67_1239 = input.LA(1);
						 
						int index67_1239 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1239==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1239);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA67_1085 = input.LA(1);
						 
						int index67_1085 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1085==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1085);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA67_290 = input.LA(1);
						 
						int index67_290 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_290==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_290);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA67_177 = input.LA(1);
						 
						int index67_177 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_177 >= '\t' && LA67_177 <= '\n')||LA67_177=='\r'||LA67_177==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_177);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA67_37 = input.LA(1);
						 
						int index67_37 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_37 >= '\t' && LA67_37 <= '\n')||LA67_37=='\r'||LA67_37==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_37);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA67_1225 = input.LA(1);
						 
						int index67_1225 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1225==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1225);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA67_367 = input.LA(1);
						 
						int index67_367 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_367 >= '\t' && LA67_367 <= '\n')||LA67_367=='\r'||LA67_367==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_367);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA67_75 = input.LA(1);
						 
						int index67_75 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_75 >= '\t' && LA67_75 <= '\n')||LA67_75=='\r'||LA67_75==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_75);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA67_1089 = input.LA(1);
						 
						int index67_1089 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1089==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1089);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA67_714 = input.LA(1);
						 
						int index67_714 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_714==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_714);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA67_1343 = input.LA(1);
						 
						int index67_1343 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1343==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1343);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA67_932 = input.LA(1);
						 
						int index67_932 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_932==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_932);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA67_1018 = input.LA(1);
						 
						int index67_1018 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1018==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1018);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA67_1270 = input.LA(1);
						 
						int index67_1270 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1270==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1270);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA67_1105 = input.LA(1);
						 
						int index67_1105 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1105==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1105);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA67_1563 = input.LA(1);
						 
						int index67_1563 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1563==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1563);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA67_1243 = input.LA(1);
						 
						int index67_1243 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1243==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1243);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA67_514 = input.LA(1);
						 
						int index67_514 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_514==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_514);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA67_515 = input.LA(1);
						 
						int index67_515 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_515==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_515);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA67_1021 = input.LA(1);
						 
						int index67_1021 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1021==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1021);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA67_725 = input.LA(1);
						 
						int index67_725 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_725==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_725);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA67_1102 = input.LA(1);
						 
						int index67_1102 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1102==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1102);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA67_1101 = input.LA(1);
						 
						int index67_1101 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1101==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1101);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA67_1431 = input.LA(1);
						 
						int index67_1431 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1431==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1431);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA67_374 = input.LA(1);
						 
						int index67_374 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_374==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_374);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA67_977 = input.LA(1);
						 
						int index67_977 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_977==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_977);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA67_182 = input.LA(1);
						 
						int index67_182 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_182==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_182);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA67_798 = input.LA(1);
						 
						int index67_798 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_798=='s') ) {s = 487;}
						else if ( ((LA67_798 >= '\t' && LA67_798 <= '\n')||LA67_798=='\r'||LA67_798==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_798=='(') ) {s = 488;}
						else if ( (LA67_798=='M') ) {s = 489;}
						else if ( (LA67_798=='!'||(LA67_798 >= '&' && LA67_798 <= '\'')||(LA67_798 >= ',' && LA67_798 <= '.')||(LA67_798 >= '0' && LA67_798 <= ';')||LA67_798=='?'||(LA67_798 >= 'A' && LA67_798 <= 'L')||(LA67_798 >= 'N' && LA67_798 <= 'Z')||LA67_798=='_'||(LA67_798 >= 'a' && LA67_798 <= 'r')||(LA67_798 >= 't' && LA67_798 <= 'z')||LA67_798=='\u2019') ) {s = 41;}
						else s = 989;
						 
						input.seek(index67_798);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA67_988 = input.LA(1);
						 
						int index67_988 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_988=='s') ) {s = 487;}
						else if ( ((LA67_988 >= '\t' && LA67_988 <= '\n')||LA67_988=='\r'||LA67_988==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_988=='(') ) {s = 488;}
						else if ( (LA67_988=='M') ) {s = 489;}
						else if ( (LA67_988=='!'||(LA67_988 >= '&' && LA67_988 <= '\'')||(LA67_988 >= ',' && LA67_988 <= '.')||(LA67_988 >= '0' && LA67_988 <= ';')||LA67_988=='?'||(LA67_988 >= 'A' && LA67_988 <= 'L')||(LA67_988 >= 'N' && LA67_988 <= 'Z')||LA67_988=='_'||(LA67_988 >= 'a' && LA67_988 <= 'r')||(LA67_988 >= 't' && LA67_988 <= 'z')||LA67_988=='\u2019') ) {s = 41;}
						else s = 1153;
						 
						input.seek(index67_988);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA67_1010 = input.LA(1);
						 
						int index67_1010 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1010==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1010);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA67_1364 = input.LA(1);
						 
						int index67_1364 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1364==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1364);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA67_1119 = input.LA(1);
						 
						int index67_1119 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1119==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1119=='s') ) {s = 1252;}
						else s = 41;
						 
						input.seek(index67_1119);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA67_975 = input.LA(1);
						 
						int index67_975 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_975==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_975);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA67_1044 = input.LA(1);
						 
						int index67_1044 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1044==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1044);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA67_1180 = input.LA(1);
						 
						int index67_1180 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1180=='e') ) {s = 1293;}
						else if ( (LA67_1180=='s') ) {s = 487;}
						else if ( ((LA67_1180 >= '\t' && LA67_1180 <= '\n')||LA67_1180=='\r'||LA67_1180==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1180=='(') ) {s = 488;}
						else if ( (LA67_1180=='M') ) {s = 489;}
						else if ( (LA67_1180=='!'||(LA67_1180 >= '&' && LA67_1180 <= '\'')||(LA67_1180 >= ',' && LA67_1180 <= '.')||(LA67_1180 >= '0' && LA67_1180 <= ';')||LA67_1180=='?'||(LA67_1180 >= 'A' && LA67_1180 <= 'L')||(LA67_1180 >= 'N' && LA67_1180 <= 'Z')||LA67_1180=='_'||(LA67_1180 >= 'a' && LA67_1180 <= 'd')||(LA67_1180 >= 'f' && LA67_1180 <= 'r')||(LA67_1180 >= 't' && LA67_1180 <= 'z')||LA67_1180=='\u2019') ) {s = 41;}
						else s = 1294;
						 
						input.seek(index67_1180);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA67_877 = input.LA(1);
						 
						int index67_877 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_877==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_877);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA67_634 = input.LA(1);
						 
						int index67_634 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_634==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_634=='s') ) {s = 836;}
						else s = 41;
						 
						input.seek(index67_634);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA67_753 = input.LA(1);
						 
						int index67_753 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_753==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_753);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA67_35 = input.LA(1);
						 
						int index67_35 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_35=='s') ) {s = 177;}
						else if ( ((LA67_35 >= '\t' && LA67_35 <= '\n')||LA67_35=='\r'||LA67_35==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_35);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA67_1220 = input.LA(1);
						 
						int index67_1220 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_1220 >= '\t' && LA67_1220 <= '\n')||LA67_1220=='\r'||LA67_1220==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1220=='A') ) {s = 1330;}
						else if ( (LA67_1220=='P') ) {s = 1331;}
						else if ( (LA67_1220=='B') ) {s = 1332;}
						else if ( (LA67_1220=='(') ) {s = 1333;}
						else if ( (LA67_1220=='M') ) {s = 1334;}
						else if ( ((LA67_1220 >= '&' && LA67_1220 <= '\'')||(LA67_1220 >= ',' && LA67_1220 <= '.')||(LA67_1220 >= '0' && LA67_1220 <= ';')||(LA67_1220 >= 'C' && LA67_1220 <= 'L')||(LA67_1220 >= 'N' && LA67_1220 <= 'O')||(LA67_1220 >= 'Q' && LA67_1220 <= 'Z')||LA67_1220=='_'||(LA67_1220 >= 'a' && LA67_1220 <= 'z')||LA67_1220=='\u2019') ) {s = 41;}
						else s = 1335;
						 
						input.seek(index67_1220);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA67_870 = input.LA(1);
						 
						int index67_870 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_870==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_870);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA67_585 = input.LA(1);
						 
						int index67_585 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_585=='s') ) {s = 487;}
						else if ( ((LA67_585 >= '\t' && LA67_585 <= '\n')||LA67_585=='\r'||LA67_585==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_585=='(') ) {s = 488;}
						else if ( (LA67_585=='M') ) {s = 489;}
						else if ( (LA67_585=='!'||(LA67_585 >= '&' && LA67_585 <= '\'')||(LA67_585 >= ',' && LA67_585 <= '.')||(LA67_585 >= '0' && LA67_585 <= ';')||LA67_585=='?'||(LA67_585 >= 'A' && LA67_585 <= 'L')||(LA67_585 >= 'N' && LA67_585 <= 'Z')||LA67_585=='_'||(LA67_585 >= 'a' && LA67_585 <= 'r')||(LA67_585 >= 't' && LA67_585 <= 'z')||LA67_585=='\u2019') ) {s = 41;}
						else s = 790;
						 
						input.seek(index67_585);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA67_1189 = input.LA(1);
						 
						int index67_1189 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1189==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1189);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA67_862 = input.LA(1);
						 
						int index67_862 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_862=='o') ) {s = 1034;}
						else if ( (LA67_862=='s') ) {s = 487;}
						else if ( ((LA67_862 >= '\t' && LA67_862 <= '\n')||LA67_862=='\r'||LA67_862==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_862=='(') ) {s = 488;}
						else if ( (LA67_862=='M') ) {s = 489;}
						else if ( (LA67_862=='!'||(LA67_862 >= '&' && LA67_862 <= '\'')||(LA67_862 >= ',' && LA67_862 <= '.')||(LA67_862 >= '0' && LA67_862 <= ';')||LA67_862=='?'||(LA67_862 >= 'A' && LA67_862 <= 'L')||(LA67_862 >= 'N' && LA67_862 <= 'Z')||LA67_862=='_'||(LA67_862 >= 'a' && LA67_862 <= 'n')||(LA67_862 >= 'p' && LA67_862 <= 'r')||(LA67_862 >= 't' && LA67_862 <= 'z')||LA67_862=='\u2019') ) {s = 41;}
						else s = 1035;
						 
						input.seek(index67_862);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA67_1536 = input.LA(1);
						 
						int index67_1536 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1536=='s') ) {s = 487;}
						else if ( ((LA67_1536 >= '\t' && LA67_1536 <= '\n')||LA67_1536=='\r'||LA67_1536==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1536=='(') ) {s = 488;}
						else if ( (LA67_1536=='M') ) {s = 489;}
						else if ( (LA67_1536=='!'||(LA67_1536 >= '&' && LA67_1536 <= '\'')||(LA67_1536 >= ',' && LA67_1536 <= '.')||(LA67_1536 >= '0' && LA67_1536 <= ';')||LA67_1536=='?'||(LA67_1536 >= 'A' && LA67_1536 <= 'L')||(LA67_1536 >= 'N' && LA67_1536 <= 'Z')||LA67_1536=='_'||(LA67_1536 >= 'a' && LA67_1536 <= 'r')||(LA67_1536 >= 't' && LA67_1536 <= 'z')||LA67_1536=='\u2019') ) {s = 41;}
						else s = 1567;
						 
						input.seek(index67_1536);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA67_846 = input.LA(1);
						 
						int index67_846 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_846==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_846);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA67_873 = input.LA(1);
						 
						int index67_873 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_873==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_873);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA67_810 = input.LA(1);
						 
						int index67_810 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_810=='s') ) {s = 487;}
						else if ( ((LA67_810 >= '\t' && LA67_810 <= '\n')||LA67_810=='\r'||LA67_810==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_810=='(') ) {s = 488;}
						else if ( (LA67_810=='M') ) {s = 489;}
						else if ( (LA67_810=='!'||(LA67_810 >= '&' && LA67_810 <= '\'')||(LA67_810 >= ',' && LA67_810 <= '.')||(LA67_810 >= '0' && LA67_810 <= ';')||LA67_810=='?'||(LA67_810 >= 'A' && LA67_810 <= 'L')||(LA67_810 >= 'N' && LA67_810 <= 'Z')||LA67_810=='_'||(LA67_810 >= 'a' && LA67_810 <= 'r')||(LA67_810 >= 't' && LA67_810 <= 'z')||LA67_810=='\u2019') ) {s = 41;}
						else s = 999;
						 
						input.seek(index67_810);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA67_609 = input.LA(1);
						 
						int index67_609 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_609=='s') ) {s = 487;}
						else if ( ((LA67_609 >= '\t' && LA67_609 <= '\n')||LA67_609=='\r'||LA67_609==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_609=='(') ) {s = 488;}
						else if ( (LA67_609=='M') ) {s = 489;}
						else if ( (LA67_609=='!'||(LA67_609 >= '&' && LA67_609 <= '\'')||(LA67_609 >= ',' && LA67_609 <= '.')||(LA67_609 >= '0' && LA67_609 <= ';')||LA67_609=='?'||(LA67_609 >= 'A' && LA67_609 <= 'L')||(LA67_609 >= 'N' && LA67_609 <= 'Z')||LA67_609=='_'||(LA67_609 >= 'a' && LA67_609 <= 'r')||(LA67_609 >= 't' && LA67_609 <= 'z')||LA67_609=='\u2019') ) {s = 41;}
						else s = 813;
						 
						input.seek(index67_609);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA67_816 = input.LA(1);
						 
						int index67_816 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_816=='s') ) {s = 487;}
						else if ( ((LA67_816 >= '\t' && LA67_816 <= '\n')||LA67_816=='\r'||LA67_816==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_816=='(') ) {s = 488;}
						else if ( (LA67_816=='M') ) {s = 489;}
						else if ( (LA67_816=='!'||(LA67_816 >= '&' && LA67_816 <= '\'')||(LA67_816 >= ',' && LA67_816 <= '.')||(LA67_816 >= '0' && LA67_816 <= ';')||LA67_816=='?'||(LA67_816 >= 'A' && LA67_816 <= 'L')||(LA67_816 >= 'N' && LA67_816 <= 'Z')||LA67_816=='_'||(LA67_816 >= 'a' && LA67_816 <= 'r')||(LA67_816 >= 't' && LA67_816 <= 'z')||LA67_816=='\u2019') ) {s = 41;}
						else s = 1001;
						 
						input.seek(index67_816);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA67_611 = input.LA(1);
						 
						int index67_611 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_611=='s') ) {s = 487;}
						else if ( ((LA67_611 >= '\t' && LA67_611 <= '\n')||LA67_611=='\r'||LA67_611==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_611=='(') ) {s = 488;}
						else if ( (LA67_611=='M') ) {s = 489;}
						else if ( (LA67_611=='!'||(LA67_611 >= '&' && LA67_611 <= '\'')||(LA67_611 >= ',' && LA67_611 <= '.')||(LA67_611 >= '0' && LA67_611 <= ';')||LA67_611=='?'||(LA67_611 >= 'A' && LA67_611 <= 'L')||(LA67_611 >= 'N' && LA67_611 <= 'Z')||LA67_611=='_'||(LA67_611 >= 'a' && LA67_611 <= 'r')||(LA67_611 >= 't' && LA67_611 <= 'z')||LA67_611=='\u2019') ) {s = 41;}
						else s = 815;
						 
						input.seek(index67_611);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA67_1160 = input.LA(1);
						 
						int index67_1160 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1160=='s') ) {s = 487;}
						else if ( ((LA67_1160 >= '\t' && LA67_1160 <= '\n')||LA67_1160=='\r'||LA67_1160==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1160=='(') ) {s = 488;}
						else if ( (LA67_1160=='M') ) {s = 489;}
						else if ( (LA67_1160=='!'||(LA67_1160 >= '&' && LA67_1160 <= '\'')||(LA67_1160 >= ',' && LA67_1160 <= '.')||(LA67_1160 >= '0' && LA67_1160 <= ';')||LA67_1160=='?'||(LA67_1160 >= 'A' && LA67_1160 <= 'L')||(LA67_1160 >= 'N' && LA67_1160 <= 'Z')||LA67_1160=='_'||(LA67_1160 >= 'a' && LA67_1160 <= 'r')||(LA67_1160 >= 't' && LA67_1160 <= 'z')||LA67_1160=='\u2019') ) {s = 41;}
						else s = 1281;
						 
						input.seek(index67_1160);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA67_36 = input.LA(1);
						 
						int index67_36 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_36 >= '\t' && LA67_36 <= '\n')||LA67_36=='\r'||LA67_36==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_36);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA67_1004 = input.LA(1);
						 
						int index67_1004 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1004=='s') ) {s = 487;}
						else if ( ((LA67_1004 >= '\t' && LA67_1004 <= '\n')||LA67_1004=='\r'||LA67_1004==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1004=='(') ) {s = 488;}
						else if ( (LA67_1004=='M') ) {s = 489;}
						else if ( (LA67_1004=='!'||(LA67_1004 >= '&' && LA67_1004 <= '\'')||(LA67_1004 >= ',' && LA67_1004 <= '.')||(LA67_1004 >= '0' && LA67_1004 <= ';')||LA67_1004=='?'||(LA67_1004 >= 'A' && LA67_1004 <= 'L')||(LA67_1004 >= 'N' && LA67_1004 <= 'Z')||LA67_1004=='_'||(LA67_1004 >= 'a' && LA67_1004 <= 'r')||(LA67_1004 >= 't' && LA67_1004 <= 'z')||LA67_1004=='\u2019') ) {s = 41;}
						else s = 1162;
						 
						input.seek(index67_1004);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA67_175 = input.LA(1);
						 
						int index67_175 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_175 >= '\t' && LA67_175 <= '\n')||LA67_175=='\r'||LA67_175==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_175);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA67_1443 = input.LA(1);
						 
						int index67_1443 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1443=='s') ) {s = 487;}
						else if ( ((LA67_1443 >= '\t' && LA67_1443 <= '\n')||LA67_1443=='\r'||LA67_1443==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1443=='(') ) {s = 488;}
						else if ( (LA67_1443=='M') ) {s = 489;}
						else if ( (LA67_1443=='!'||(LA67_1443 >= '&' && LA67_1443 <= '\'')||(LA67_1443 >= ',' && LA67_1443 <= '.')||(LA67_1443 >= '0' && LA67_1443 <= ';')||LA67_1443=='?'||(LA67_1443 >= 'A' && LA67_1443 <= 'L')||(LA67_1443 >= 'N' && LA67_1443 <= 'Z')||LA67_1443=='_'||(LA67_1443 >= 'a' && LA67_1443 <= 'r')||(LA67_1443 >= 't' && LA67_1443 <= 'z')||LA67_1443=='\u2019') ) {s = 41;}
						else s = 1500;
						 
						input.seek(index67_1443);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA67_490 = input.LA(1);
						 
						int index67_490 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_490=='k') ) {s = 703;}
						else if ( (LA67_490=='s') ) {s = 487;}
						else if ( ((LA67_490 >= '\t' && LA67_490 <= '\n')||LA67_490=='\r'||LA67_490==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_490=='(') ) {s = 488;}
						else if ( (LA67_490=='M') ) {s = 489;}
						else if ( (LA67_490=='!'||(LA67_490 >= '&' && LA67_490 <= '\'')||(LA67_490 >= ',' && LA67_490 <= '.')||(LA67_490 >= '0' && LA67_490 <= ';')||LA67_490=='?'||(LA67_490 >= 'A' && LA67_490 <= 'L')||(LA67_490 >= 'N' && LA67_490 <= 'Z')||LA67_490=='_'||(LA67_490 >= 'a' && LA67_490 <= 'j')||(LA67_490 >= 'l' && LA67_490 <= 'r')||(LA67_490 >= 't' && LA67_490 <= 'z')||LA67_490=='\u2019') ) {s = 41;}
						else s = 704;
						 
						input.seek(index67_490);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA67_1278 = input.LA(1);
						 
						int index67_1278 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1278=='s') ) {s = 487;}
						else if ( ((LA67_1278 >= '\t' && LA67_1278 <= '\n')||LA67_1278=='\r'||LA67_1278==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1278=='(') ) {s = 488;}
						else if ( (LA67_1278=='M') ) {s = 489;}
						else if ( (LA67_1278=='!'||(LA67_1278 >= '&' && LA67_1278 <= '\'')||(LA67_1278 >= ',' && LA67_1278 <= '.')||(LA67_1278 >= '0' && LA67_1278 <= ';')||LA67_1278=='?'||(LA67_1278 >= 'A' && LA67_1278 <= 'L')||(LA67_1278 >= 'N' && LA67_1278 <= 'Z')||LA67_1278=='_'||(LA67_1278 >= 'a' && LA67_1278 <= 'r')||(LA67_1278 >= 't' && LA67_1278 <= 'z')||LA67_1278=='\u2019') ) {s = 41;}
						else s = 1370;
						 
						input.seek(index67_1278);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA67_229 = input.LA(1);
						 
						int index67_229 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_229=='l') ) {s = 428;}
						else if ( ((LA67_229 >= '\t' && LA67_229 <= '\n')||LA67_229=='\r'||LA67_229==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_229);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA67_15 = input.LA(1);
						 
						int index67_15 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_15=='a') ) {s = 99;}
						else if ( (LA67_15=='e') ) {s = 100;}
						else if ( (LA67_15=='h') ) {s = 101;}
						else if ( (LA67_15=='\u00F6') && ((allowBreed))) {s = 102;}
						else if ( (LA67_15=='o') ) {s = 103;}
						else if ( (LA67_15=='U') ) {s = 104;}
						else s = 41;
						 
						input.seek(index67_15);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA67_0 = input.LA(1);
						s = -1;
						if ( (LA67_0=='M') ) {s = 1;}
						else if ( (LA67_0=='O') ) {s = 2;}
						else if ( (LA67_0=='N') ) {s = 3;}
						else if ( (LA67_0=='A') ) {s = 4;}
						else if ( (LA67_0=='B') ) {s = 5;}
						else if ( (LA67_0=='C') ) {s = 6;}
						else if ( (LA67_0=='D') ) {s = 7;}
						else if ( (LA67_0=='E') ) {s = 8;}
						else if ( (LA67_0=='F') ) {s = 9;}
						else if ( (LA67_0=='G') ) {s = 10;}
						else if ( (LA67_0=='H') ) {s = 11;}
						else if ( (LA67_0=='I') ) {s = 12;}
						else if ( (LA67_0=='J') ) {s = 13;}
						else if ( (LA67_0=='K') ) {s = 14;}
						else if ( (LA67_0=='L') ) {s = 15;}
						else if ( (LA67_0=='P') ) {s = 16;}
						else if ( (LA67_0=='R') ) {s = 17;}
						else if ( (LA67_0=='S') ) {s = 18;}
						else if ( (LA67_0=='T') ) {s = 19;}
						else if ( (LA67_0=='V') ) {s = 20;}
						else if ( (LA67_0=='W') ) {s = 21;}
						else if ( (LA67_0=='X') ) {s = 22;}
						else if ( (LA67_0=='Y') ) {s = 23;}
						else if ( (LA67_0=='U') ) {s = 24;}
						else if ( ((LA67_0 >= '0' && LA67_0 <= '9')) ) {s = 25;}
						else if ( ((LA67_0 >= '\t' && LA67_0 <= '\n')||LA67_0=='\r'||LA67_0==' ') ) {s = 26;}
						else if ( (LA67_0=='(') ) {s = 27;}
						else if ( (LA67_0=='.') ) {s = 28;}
						else if ( (LA67_0=='Q'||LA67_0=='Z') ) {s = 29;}
						else if ( ((LA67_0 >= '&' && LA67_0 <= '\'')||(LA67_0 >= ',' && LA67_0 <= '-')||(LA67_0 >= ':' && LA67_0 <= ';')||LA67_0=='_'||(LA67_0 >= 'a' && LA67_0 <= 'z')||LA67_0=='\u2019') ) {s = 30;}
						else if ( ((LA67_0 >= '\u0000' && LA67_0 <= '\b')||(LA67_0 >= '\u000B' && LA67_0 <= '\f')||(LA67_0 >= '\u000E' && LA67_0 <= '\u001F')||(LA67_0 >= '!' && LA67_0 <= '%')||(LA67_0 >= ')' && LA67_0 <= '+')||LA67_0=='/'||(LA67_0 >= '<' && LA67_0 <= '@')||(LA67_0 >= '[' && LA67_0 <= '^')||LA67_0=='`'||(LA67_0 >= '{' && LA67_0 <= '\u2018')||(LA67_0 >= '\u201A' && LA67_0 <= '\uFFFF')) ) {s = 31;}
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA67_1372 = input.LA(1);
						 
						int index67_1372 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1372=='s') ) {s = 487;}
						else if ( ((LA67_1372 >= '\t' && LA67_1372 <= '\n')||LA67_1372=='\r'||LA67_1372==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1372=='(') ) {s = 488;}
						else if ( (LA67_1372=='M') ) {s = 489;}
						else if ( (LA67_1372=='!'||(LA67_1372 >= '&' && LA67_1372 <= '\'')||(LA67_1372 >= ',' && LA67_1372 <= '.')||(LA67_1372 >= '0' && LA67_1372 <= ';')||LA67_1372=='?'||(LA67_1372 >= 'A' && LA67_1372 <= 'L')||(LA67_1372 >= 'N' && LA67_1372 <= 'Z')||LA67_1372=='_'||(LA67_1372 >= 'a' && LA67_1372 <= 'r')||(LA67_1372 >= 't' && LA67_1372 <= 'z')||LA67_1372=='\u2019') ) {s = 41;}
						else s = 1442;
						 
						input.seek(index67_1372);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA67_1358 = input.LA(1);
						 
						int index67_1358 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1358==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1358);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA67_545 = input.LA(1);
						 
						int index67_545 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_545==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_545);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA67_1112 = input.LA(1);
						 
						int index67_1112 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1112==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1112);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA67_1284 = input.LA(1);
						 
						int index67_1284 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1284=='s') ) {s = 487;}
						else if ( ((LA67_1284 >= '\t' && LA67_1284 <= '\n')||LA67_1284=='\r'||LA67_1284==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1284=='(') ) {s = 488;}
						else if ( (LA67_1284=='M') ) {s = 489;}
						else if ( (LA67_1284=='!'||(LA67_1284 >= '&' && LA67_1284 <= '\'')||(LA67_1284 >= ',' && LA67_1284 <= '.')||(LA67_1284 >= '0' && LA67_1284 <= ';')||LA67_1284=='?'||(LA67_1284 >= 'A' && LA67_1284 <= 'L')||(LA67_1284 >= 'N' && LA67_1284 <= 'Z')||LA67_1284=='_'||(LA67_1284 >= 'a' && LA67_1284 <= 'r')||(LA67_1284 >= 't' && LA67_1284 <= 'z')||LA67_1284=='\u2019') ) {s = 41;}
						else s = 1375;
						 
						input.seek(index67_1284);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA67_231 = input.LA(1);
						 
						int index67_231 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_231 >= '\t' && LA67_231 <= '\n')||LA67_231=='\r'||LA67_231==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_231);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA67_368 = input.LA(1);
						 
						int index67_368 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_368 >= '\t' && LA67_368 <= '\n')||LA67_368=='\r'||LA67_368==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_368);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA67_74 = input.LA(1);
						 
						int index67_74 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_74 >= '\t' && LA67_74 <= '\n')||LA67_74=='\r'||LA67_74==' ') && ((allowJudge))) {s = 176;}
						else s = 41;
						 
						input.seek(index67_74);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA67_1287 = input.LA(1);
						 
						int index67_1287 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1287=='s') ) {s = 487;}
						else if ( ((LA67_1287 >= '\t' && LA67_1287 <= '\n')||LA67_1287=='\r'||LA67_1287==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1287=='(') ) {s = 488;}
						else if ( (LA67_1287=='M') ) {s = 489;}
						else if ( (LA67_1287=='!'||(LA67_1287 >= '&' && LA67_1287 <= '\'')||(LA67_1287 >= ',' && LA67_1287 <= '.')||(LA67_1287 >= '0' && LA67_1287 <= ';')||LA67_1287=='?'||(LA67_1287 >= 'A' && LA67_1287 <= 'L')||(LA67_1287 >= 'N' && LA67_1287 <= 'Z')||LA67_1287=='_'||(LA67_1287 >= 'a' && LA67_1287 <= 'r')||(LA67_1287 >= 't' && LA67_1287 <= 'z')||LA67_1287=='\u2019') ) {s = 41;}
						else s = 1378;
						 
						input.seek(index67_1287);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA67_1286 = input.LA(1);
						 
						int index67_1286 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1286=='s') ) {s = 487;}
						else if ( ((LA67_1286 >= '\t' && LA67_1286 <= '\n')||LA67_1286=='\r'||LA67_1286==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1286=='(') ) {s = 488;}
						else if ( (LA67_1286=='M') ) {s = 489;}
						else if ( (LA67_1286=='!'||(LA67_1286 >= '&' && LA67_1286 <= '\'')||(LA67_1286 >= ',' && LA67_1286 <= '.')||(LA67_1286 >= '0' && LA67_1286 <= ';')||LA67_1286=='?'||(LA67_1286 >= 'A' && LA67_1286 <= 'L')||(LA67_1286 >= 'N' && LA67_1286 <= 'Z')||LA67_1286=='_'||(LA67_1286 >= 'a' && LA67_1286 <= 'r')||(LA67_1286 >= 't' && LA67_1286 <= 'z')||LA67_1286=='\u2019') ) {s = 41;}
						else s = 1377;
						 
						input.seek(index67_1286);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA67_830 = input.LA(1);
						 
						int index67_830 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_830=='s') ) {s = 487;}
						else if ( ((LA67_830 >= '\t' && LA67_830 <= '\n')||LA67_830=='\r'||LA67_830==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_830=='(') ) {s = 488;}
						else if ( (LA67_830=='M') ) {s = 489;}
						else if ( (LA67_830=='!'||(LA67_830 >= '&' && LA67_830 <= '\'')||(LA67_830 >= ',' && LA67_830 <= '.')||(LA67_830 >= '0' && LA67_830 <= ';')||LA67_830=='?'||(LA67_830 >= 'A' && LA67_830 <= 'L')||(LA67_830 >= 'N' && LA67_830 <= 'Z')||LA67_830=='_'||(LA67_830 >= 'a' && LA67_830 <= 'r')||(LA67_830 >= 't' && LA67_830 <= 'z')||LA67_830=='\u2019') ) {s = 41;}
						else s = 1013;
						 
						input.seek(index67_830);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA67_677 = input.LA(1);
						 
						int index67_677 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_677==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_677=='s') ) {s = 873;}
						else s = 41;
						 
						input.seek(index67_677);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA67_996 = input.LA(1);
						 
						int index67_996 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_996==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_996);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA67_994 = input.LA(1);
						 
						int index67_994 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_994==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_994);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA67_1497 = input.LA(1);
						 
						int index67_1497 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1497=='s') ) {s = 487;}
						else if ( ((LA67_1497 >= '\t' && LA67_1497 <= '\n')||LA67_1497=='\r'||LA67_1497==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1497=='(') ) {s = 488;}
						else if ( (LA67_1497=='M') ) {s = 489;}
						else if ( (LA67_1497=='!'||(LA67_1497 >= '&' && LA67_1497 <= '\'')||(LA67_1497 >= ',' && LA67_1497 <= '.')||(LA67_1497 >= '0' && LA67_1497 <= ';')||LA67_1497=='?'||(LA67_1497 >= 'A' && LA67_1497 <= 'L')||(LA67_1497 >= 'N' && LA67_1497 <= 'Z')||LA67_1497=='_'||(LA67_1497 >= 'a' && LA67_1497 <= 'r')||(LA67_1497 >= 't' && LA67_1497 <= 'z')||LA67_1497=='\u2019') ) {s = 41;}
						else s = 1534;
						 
						input.seek(index67_1497);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA67_659 = input.LA(1);
						 
						int index67_659 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_659==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_659);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA67_1040 = input.LA(1);
						 
						int index67_1040 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1040=='s') ) {s = 487;}
						else if ( ((LA67_1040 >= '\t' && LA67_1040 <= '\n')||LA67_1040=='\r'||LA67_1040==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1040=='(') ) {s = 488;}
						else if ( (LA67_1040=='M') ) {s = 489;}
						else if ( (LA67_1040=='!'||(LA67_1040 >= '&' && LA67_1040 <= '\'')||(LA67_1040 >= ',' && LA67_1040 <= '.')||(LA67_1040 >= '0' && LA67_1040 <= ';')||LA67_1040=='?'||(LA67_1040 >= 'A' && LA67_1040 <= 'L')||(LA67_1040 >= 'N' && LA67_1040 <= 'Z')||LA67_1040=='_'||(LA67_1040 >= 'a' && LA67_1040 <= 'r')||(LA67_1040 >= 't' && LA67_1040 <= 'z')||LA67_1040=='\u2019') ) {s = 41;}
						else s = 1186;
						 
						input.seek(index67_1040);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA67_969 = input.LA(1);
						 
						int index67_969 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_969=='s') ) {s = 487;}
						else if ( ((LA67_969 >= '\t' && LA67_969 <= '\n')||LA67_969=='\r'||LA67_969==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_969=='(') ) {s = 488;}
						else if ( (LA67_969=='M') ) {s = 489;}
						else if ( (LA67_969=='!'||(LA67_969 >= '&' && LA67_969 <= '\'')||(LA67_969 >= ',' && LA67_969 <= '.')||(LA67_969 >= '0' && LA67_969 <= ';')||LA67_969=='?'||(LA67_969 >= 'A' && LA67_969 <= 'L')||(LA67_969 >= 'N' && LA67_969 <= 'Z')||LA67_969=='_'||(LA67_969 >= 'a' && LA67_969 <= 'r')||(LA67_969 >= 't' && LA67_969 <= 'z')||LA67_969=='\u2019') ) {s = 41;}
						else s = 1138;
						 
						input.seek(index67_969);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA67_1158 = input.LA(1);
						 
						int index67_1158 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1158==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1158);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA67_968 = input.LA(1);
						 
						int index67_968 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_968=='s') ) {s = 487;}
						else if ( ((LA67_968 >= '\t' && LA67_968 <= '\n')||LA67_968=='\r'||LA67_968==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_968=='(') ) {s = 488;}
						else if ( (LA67_968=='M') ) {s = 489;}
						else if ( (LA67_968=='!'||(LA67_968 >= '&' && LA67_968 <= '\'')||(LA67_968 >= ',' && LA67_968 <= '.')||(LA67_968 >= '0' && LA67_968 <= ';')||LA67_968=='?'||(LA67_968 >= 'A' && LA67_968 <= 'L')||(LA67_968 >= 'N' && LA67_968 <= 'Z')||LA67_968=='_'||(LA67_968 >= 'a' && LA67_968 <= 'r')||(LA67_968 >= 't' && LA67_968 <= 'z')||LA67_968=='\u2019') ) {s = 41;}
						else s = 1137;
						 
						input.seek(index67_968);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA67_1159 = input.LA(1);
						 
						int index67_1159 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1159==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1159);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA67_649 = input.LA(1);
						 
						int index67_649 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_649==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_649=='e') ) {s = 849;}
						else s = 41;
						 
						input.seek(index67_649);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA67_811 = input.LA(1);
						 
						int index67_811 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_811==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_811);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA67_1110 = input.LA(1);
						 
						int index67_1110 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1110==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1110);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA67_1161 = input.LA(1);
						 
						int index67_1161 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1161==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1161);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA67_814 = input.LA(1);
						 
						int index67_814 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_814==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_814);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA67_487 = input.LA(1);
						 
						int index67_487 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_487 >= '\t' && LA67_487 <= '\n')||LA67_487=='\r'||LA67_487==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_487=='(') ) {s = 488;}
						else if ( (LA67_487=='M') ) {s = 489;}
						else if ( (LA67_487=='!'||(LA67_487 >= '&' && LA67_487 <= '\'')||(LA67_487 >= ',' && LA67_487 <= '.')||(LA67_487 >= '0' && LA67_487 <= ';')||LA67_487=='?'||(LA67_487 >= 'A' && LA67_487 <= 'L')||(LA67_487 >= 'N' && LA67_487 <= 'Z')||LA67_487=='_'||(LA67_487 >= 'a' && LA67_487 <= 'z')||LA67_487=='\u2019') ) {s = 41;}
						else s = 685;
						 
						input.seek(index67_487);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA67_679 = input.LA(1);
						 
						int index67_679 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_679=='s') ) {s = 487;}
						else if ( ((LA67_679 >= '\t' && LA67_679 <= '\n')||LA67_679=='\r'||LA67_679==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_679=='(') ) {s = 488;}
						else if ( (LA67_679=='M') ) {s = 489;}
						else if ( (LA67_679=='!'||(LA67_679 >= '&' && LA67_679 <= '\'')||(LA67_679 >= ',' && LA67_679 <= '.')||(LA67_679 >= '0' && LA67_679 <= ';')||LA67_679=='?'||(LA67_679 >= 'A' && LA67_679 <= 'L')||(LA67_679 >= 'N' && LA67_679 <= 'Z')||LA67_679=='_'||(LA67_679 >= 'a' && LA67_679 <= 'r')||(LA67_679 >= 't' && LA67_679 <= 'z')||LA67_679=='\u2019') ) {s = 41;}
						else s = 875;
						 
						input.seek(index67_679);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA67_417 = input.LA(1);
						 
						int index67_417 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_417==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_417);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA67_1164 = input.LA(1);
						 
						int index67_1164 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1164==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1164);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA67_821 = input.LA(1);
						 
						int index67_821 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_821==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_821);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA67_617 = input.LA(1);
						 
						int index67_617 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_617==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_617);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA67_1045 = input.LA(1);
						 
						int index67_1045 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1045=='s') ) {s = 487;}
						else if ( ((LA67_1045 >= '\t' && LA67_1045 <= '\n')||LA67_1045=='\r'||LA67_1045==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1045=='(') ) {s = 488;}
						else if ( (LA67_1045=='M') ) {s = 489;}
						else if ( (LA67_1045=='!'||(LA67_1045 >= '&' && LA67_1045 <= '\'')||(LA67_1045 >= ',' && LA67_1045 <= '.')||(LA67_1045 >= '0' && LA67_1045 <= ';')||LA67_1045=='?'||(LA67_1045 >= 'A' && LA67_1045 <= 'L')||(LA67_1045 >= 'N' && LA67_1045 <= 'Z')||LA67_1045=='_'||(LA67_1045 >= 'a' && LA67_1045 <= 'r')||(LA67_1045 >= 't' && LA67_1045 <= 'z')||LA67_1045=='\u2019') ) {s = 41;}
						else s = 1190;
						 
						input.seek(index67_1045);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA67_621 = input.LA(1);
						 
						int index67_621 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_621==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_621);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA67_1165 = input.LA(1);
						 
						int index67_1165 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1165==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1165);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA67_1187 = input.LA(1);
						 
						int index67_1187 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1187=='s') ) {s = 487;}
						else if ( ((LA67_1187 >= '\t' && LA67_1187 <= '\n')||LA67_1187=='\r'||LA67_1187==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1187=='(') ) {s = 488;}
						else if ( (LA67_1187=='M') ) {s = 489;}
						else if ( (LA67_1187=='!'||(LA67_1187 >= '&' && LA67_1187 <= '\'')||(LA67_1187 >= ',' && LA67_1187 <= '.')||(LA67_1187 >= '0' && LA67_1187 <= ';')||LA67_1187=='?'||(LA67_1187 >= 'A' && LA67_1187 <= 'L')||(LA67_1187 >= 'N' && LA67_1187 <= 'Z')||LA67_1187=='_'||(LA67_1187 >= 'a' && LA67_1187 <= 'r')||(LA67_1187 >= 't' && LA67_1187 <= 'z')||LA67_1187=='\u2019') ) {s = 41;}
						else s = 1298;
						 
						input.seek(index67_1187);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA67_1363 = input.LA(1);
						 
						int index67_1363 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1363=='s') ) {s = 487;}
						else if ( ((LA67_1363 >= '\t' && LA67_1363 <= '\n')||LA67_1363=='\r'||LA67_1363==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1363=='(') ) {s = 488;}
						else if ( (LA67_1363=='M') ) {s = 489;}
						else if ( (LA67_1363=='!'||(LA67_1363 >= '&' && LA67_1363 <= '\'')||(LA67_1363 >= ',' && LA67_1363 <= '.')||(LA67_1363 >= '0' && LA67_1363 <= ';')||LA67_1363=='?'||(LA67_1363 >= 'A' && LA67_1363 <= 'L')||(LA67_1363 >= 'N' && LA67_1363 <= 'Z')||LA67_1363=='_'||(LA67_1363 >= 'a' && LA67_1363 <= 'r')||(LA67_1363 >= 't' && LA67_1363 <= 'z')||LA67_1363=='\u2019') ) {s = 41;}
						else s = 1437;
						 
						input.seek(index67_1363);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA67_1299 = input.LA(1);
						 
						int index67_1299 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1299=='s') ) {s = 487;}
						else if ( ((LA67_1299 >= '\t' && LA67_1299 <= '\n')||LA67_1299=='\r'||LA67_1299==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1299=='(') ) {s = 488;}
						else if ( (LA67_1299=='M') ) {s = 489;}
						else if ( (LA67_1299=='!'||(LA67_1299 >= '&' && LA67_1299 <= '\'')||(LA67_1299 >= ',' && LA67_1299 <= '.')||(LA67_1299 >= '0' && LA67_1299 <= ';')||LA67_1299=='?'||(LA67_1299 >= 'A' && LA67_1299 <= 'L')||(LA67_1299 >= 'N' && LA67_1299 <= 'Z')||LA67_1299=='_'||(LA67_1299 >= 'a' && LA67_1299 <= 'r')||(LA67_1299 >= 't' && LA67_1299 <= 'z')||LA67_1299=='\u2019') ) {s = 41;}
						else s = 1384;
						 
						input.seek(index67_1299);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA67_1374 = input.LA(1);
						 
						int index67_1374 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1374==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1374);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA67_548 = input.LA(1);
						 
						int index67_548 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_548==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_548=='h') ) {s = 756;}
						else s = 41;
						 
						input.seek(index67_548);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA67_1290 = input.LA(1);
						 
						int index67_1290 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1290=='s') ) {s = 487;}
						else if ( ((LA67_1290 >= '\t' && LA67_1290 <= '\n')||LA67_1290=='\r'||LA67_1290==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1290=='(') ) {s = 488;}
						else if ( (LA67_1290=='M') ) {s = 489;}
						else if ( (LA67_1290=='!'||(LA67_1290 >= '&' && LA67_1290 <= '\'')||(LA67_1290 >= ',' && LA67_1290 <= '.')||(LA67_1290 >= '0' && LA67_1290 <= ';')||LA67_1290=='?'||(LA67_1290 >= 'A' && LA67_1290 <= 'L')||(LA67_1290 >= 'N' && LA67_1290 <= 'Z')||LA67_1290=='_'||(LA67_1290 >= 'a' && LA67_1290 <= 'r')||(LA67_1290 >= 't' && LA67_1290 <= 'z')||LA67_1290=='\u2019') ) {s = 41;}
						else s = 1381;
						 
						input.seek(index67_1290);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA67_1177 = input.LA(1);
						 
						int index67_1177 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1177=='s') ) {s = 487;}
						else if ( ((LA67_1177 >= '\t' && LA67_1177 <= '\n')||LA67_1177=='\r'||LA67_1177==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1177=='(') ) {s = 488;}
						else if ( (LA67_1177=='M') ) {s = 489;}
						else if ( (LA67_1177=='!'||(LA67_1177 >= '&' && LA67_1177 <= '\'')||(LA67_1177 >= ',' && LA67_1177 <= '.')||(LA67_1177 >= '0' && LA67_1177 <= ';')||LA67_1177=='?'||(LA67_1177 >= 'A' && LA67_1177 <= 'L')||(LA67_1177 >= 'N' && LA67_1177 <= 'Z')||LA67_1177=='_'||(LA67_1177 >= 'a' && LA67_1177 <= 'r')||(LA67_1177 >= 't' && LA67_1177 <= 'z')||LA67_1177=='\u2019') ) {s = 41;}
						else s = 1291;
						 
						input.seek(index67_1177);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA67_1026 = input.LA(1);
						 
						int index67_1026 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1026=='s') ) {s = 487;}
						else if ( ((LA67_1026 >= '\t' && LA67_1026 <= '\n')||LA67_1026=='\r'||LA67_1026==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1026=='(') ) {s = 488;}
						else if ( (LA67_1026=='M') ) {s = 489;}
						else if ( (LA67_1026=='!'||(LA67_1026 >= '&' && LA67_1026 <= '\'')||(LA67_1026 >= ',' && LA67_1026 <= '.')||(LA67_1026 >= '0' && LA67_1026 <= ';')||LA67_1026=='?'||(LA67_1026 >= 'A' && LA67_1026 <= 'L')||(LA67_1026 >= 'N' && LA67_1026 <= 'Z')||LA67_1026=='_'||(LA67_1026 >= 'a' && LA67_1026 <= 'r')||(LA67_1026 >= 't' && LA67_1026 <= 'z')||LA67_1026=='\u2019') ) {s = 41;}
						else s = 1176;
						 
						input.seek(index67_1026);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA67_788 = input.LA(1);
						 
						int index67_788 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_788==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_788);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA67_1148 = input.LA(1);
						 
						int index67_1148 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1148==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1148);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA67_983 = input.LA(1);
						 
						int index67_983 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_983==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_983);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA67_1182 = input.LA(1);
						 
						int index67_1182 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1182=='s') ) {s = 487;}
						else if ( ((LA67_1182 >= '\t' && LA67_1182 <= '\n')||LA67_1182=='\r'||LA67_1182==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1182=='(') ) {s = 488;}
						else if ( (LA67_1182=='M') ) {s = 489;}
						else if ( (LA67_1182=='!'||(LA67_1182 >= '&' && LA67_1182 <= '\'')||(LA67_1182 >= ',' && LA67_1182 <= '.')||(LA67_1182 >= '0' && LA67_1182 <= ';')||LA67_1182=='?'||(LA67_1182 >= 'A' && LA67_1182 <= 'L')||(LA67_1182 >= 'N' && LA67_1182 <= 'Z')||LA67_1182=='_'||(LA67_1182 >= 'a' && LA67_1182 <= 'r')||(LA67_1182 >= 't' && LA67_1182 <= 'z')||LA67_1182=='\u2019') ) {s = 41;}
						else s = 1296;
						 
						input.seek(index67_1182);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA67_1275 = input.LA(1);
						 
						int index67_1275 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1275==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1275);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA67_1181 = input.LA(1);
						 
						int index67_1181 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1181=='s') ) {s = 487;}
						else if ( ((LA67_1181 >= '\t' && LA67_1181 <= '\n')||LA67_1181=='\r'||LA67_1181==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1181=='(') ) {s = 488;}
						else if ( (LA67_1181=='M') ) {s = 489;}
						else if ( (LA67_1181=='!'||(LA67_1181 >= '&' && LA67_1181 <= '\'')||(LA67_1181 >= ',' && LA67_1181 <= '.')||(LA67_1181 >= '0' && LA67_1181 <= ';')||LA67_1181=='?'||(LA67_1181 >= 'A' && LA67_1181 <= 'L')||(LA67_1181 >= 'N' && LA67_1181 <= 'Z')||LA67_1181=='_'||(LA67_1181 >= 'a' && LA67_1181 <= 'r')||(LA67_1181 >= 't' && LA67_1181 <= 'z')||LA67_1181=='\u2019') ) {s = 41;}
						else s = 1295;
						 
						input.seek(index67_1181);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA67_1441 = input.LA(1);
						 
						int index67_1441 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1441==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1441);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA67_1382 = input.LA(1);
						 
						int index67_1382 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1382=='s') ) {s = 487;}
						else if ( ((LA67_1382 >= '\t' && LA67_1382 <= '\n')||LA67_1382=='\r'||LA67_1382==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1382=='(') ) {s = 488;}
						else if ( (LA67_1382=='M') ) {s = 489;}
						else if ( (LA67_1382=='!'||(LA67_1382 >= '&' && LA67_1382 <= '\'')||(LA67_1382 >= ',' && LA67_1382 <= '.')||(LA67_1382 >= '0' && LA67_1382 <= ';')||LA67_1382=='?'||(LA67_1382 >= 'A' && LA67_1382 <= 'L')||(LA67_1382 >= 'N' && LA67_1382 <= 'Z')||LA67_1382=='_'||(LA67_1382 >= 'a' && LA67_1382 <= 'r')||(LA67_1382 >= 't' && LA67_1382 <= 'z')||LA67_1382=='\u2019') ) {s = 41;}
						else s = 1447;
						 
						input.seek(index67_1382);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA67_1383 = input.LA(1);
						 
						int index67_1383 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1383=='s') ) {s = 487;}
						else if ( ((LA67_1383 >= '\t' && LA67_1383 <= '\n')||LA67_1383=='\r'||LA67_1383==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1383=='(') ) {s = 488;}
						else if ( (LA67_1383=='M') ) {s = 489;}
						else if ( (LA67_1383=='!'||(LA67_1383 >= '&' && LA67_1383 <= '\'')||(LA67_1383 >= ',' && LA67_1383 <= '.')||(LA67_1383 >= '0' && LA67_1383 <= ';')||LA67_1383=='?'||(LA67_1383 >= 'A' && LA67_1383 <= 'L')||(LA67_1383 >= 'N' && LA67_1383 <= 'Z')||LA67_1383=='_'||(LA67_1383 >= 'a' && LA67_1383 <= 'r')||(LA67_1383 >= 't' && LA67_1383 <= 'z')||LA67_1383=='\u2019') ) {s = 41;}
						else s = 1448;
						 
						input.seek(index67_1383);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA67_797 = input.LA(1);
						 
						int index67_797 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_797==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_797);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA67_1371 = input.LA(1);
						 
						int index67_1371 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1371==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1371);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA67_1224 = input.LA(1);
						 
						int index67_1224 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1224==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1224);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA67_990 = input.LA(1);
						 
						int index67_990 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_990==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_990);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA67_803 = input.LA(1);
						 
						int index67_803 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_803==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_803);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA67_1125 = input.LA(1);
						 
						int index67_1125 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1125=='s') ) {s = 487;}
						else if ( ((LA67_1125 >= '\t' && LA67_1125 <= '\n')||LA67_1125=='\r'||LA67_1125==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1125=='(') ) {s = 488;}
						else if ( (LA67_1125=='M') ) {s = 489;}
						else if ( (LA67_1125=='!'||(LA67_1125 >= '&' && LA67_1125 <= '\'')||(LA67_1125 >= ',' && LA67_1125 <= '.')||(LA67_1125 >= '0' && LA67_1125 <= ';')||LA67_1125=='?'||(LA67_1125 >= 'A' && LA67_1125 <= 'L')||(LA67_1125 >= 'N' && LA67_1125 <= 'Z')||LA67_1125=='_'||(LA67_1125 >= 'a' && LA67_1125 <= 'r')||(LA67_1125 >= 't' && LA67_1125 <= 'z')||LA67_1125=='\u2019') ) {s = 41;}
						else s = 1257;
						 
						input.seek(index67_1125);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA67_1023 = input.LA(1);
						 
						int index67_1023 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1023==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1023);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA67_993 = input.LA(1);
						 
						int index67_993 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_993==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_993);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA67_529 = input.LA(1);
						 
						int index67_529 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_529=='F') && ((allowBreed))) {s = 102;}
						else if ( (LA67_529=='V') ) {s = 739;}
						 
						input.seek(index67_529);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA67_1000 = input.LA(1);
						 
						int index67_1000 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1000==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1000=='s') ) {s = 1159;}
						else s = 41;
						 
						input.seek(index67_1000);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA67_847 = input.LA(1);
						 
						int index67_847 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_847==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_847);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA67_848 = input.LA(1);
						 
						int index67_848 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_848==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_848);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA67_447 = input.LA(1);
						 
						int index67_447 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_447==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_447);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA67_1430 = input.LA(1);
						 
						int index67_1430 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1430=='s') ) {s = 487;}
						else if ( ((LA67_1430 >= '\t' && LA67_1430 <= '\n')||LA67_1430=='\r'||LA67_1430==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1430=='(') ) {s = 488;}
						else if ( (LA67_1430=='M') ) {s = 489;}
						else if ( (LA67_1430=='!'||(LA67_1430 >= '&' && LA67_1430 <= '\'')||(LA67_1430 >= ',' && LA67_1430 <= '.')||(LA67_1430 >= '0' && LA67_1430 <= ';')||LA67_1430=='?'||(LA67_1430 >= 'A' && LA67_1430 <= 'L')||(LA67_1430 >= 'N' && LA67_1430 <= 'Z')||LA67_1430=='_'||(LA67_1430 >= 'a' && LA67_1430 <= 'r')||(LA67_1430 >= 't' && LA67_1430 <= 'z')||LA67_1430=='\u2019') ) {s = 41;}
						else s = 1491;
						 
						input.seek(index67_1430);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA67_948 = input.LA(1);
						 
						int index67_948 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_948=='s') ) {s = 487;}
						else if ( ((LA67_948 >= '\t' && LA67_948 <= '\n')||LA67_948=='\r'||LA67_948==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_948=='(') ) {s = 488;}
						else if ( (LA67_948=='M') ) {s = 489;}
						else if ( (LA67_948=='!'||(LA67_948 >= '&' && LA67_948 <= '\'')||(LA67_948 >= ',' && LA67_948 <= '.')||(LA67_948 >= '0' && LA67_948 <= ';')||LA67_948=='?'||(LA67_948 >= 'A' && LA67_948 <= 'L')||(LA67_948 >= 'N' && LA67_948 <= 'Z')||LA67_948=='_'||(LA67_948 >= 'a' && LA67_948 <= 'r')||(LA67_948 >= 't' && LA67_948 <= 'z')||LA67_948=='\u2019') ) {s = 41;}
						else s = 1118;
						 
						input.seek(index67_948);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA67_1292 = input.LA(1);
						 
						int index67_1292 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1292==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1292);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA67_856 = input.LA(1);
						 
						int index67_856 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_856==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_856);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA67_414 = input.LA(1);
						 
						int index67_414 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_414==' ') && ((allowGroup))) {s = 533;}
						else s = 41;
						 
						input.seek(index67_414);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA67_1127 = input.LA(1);
						 
						int index67_1127 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1127==' ') && ((allowGroup))) {s = 1259;}
						else s = 41;
						 
						input.seek(index67_1127);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA67_1183 = input.LA(1);
						 
						int index67_1183 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1183==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1183);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA67_328 = input.LA(1);
						 
						int index67_328 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_328==' ') && ((allowGroup))) {s = 533;}
						else s = 41;
						 
						input.seek(index67_328);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA67_1240 = input.LA(1);
						 
						int index67_1240 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1240==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1240);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA67_663 = input.LA(1);
						 
						int index67_663 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_663==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_663);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA67_656 = input.LA(1);
						 
						int index67_656 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_656==' ') && ((allowGroup))) {s = 855;}
						else s = 41;
						 
						input.seek(index67_656);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA67_1498 = input.LA(1);
						 
						int index67_1498 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1498==' ') && ((allowGroup))) {s = 1535;}
						else s = 41;
						 
						input.seek(index67_1498);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA67_1245 = input.LA(1);
						 
						int index67_1245 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1245==' ') && ((allowGroup))) {s = 1259;}
						else s = 41;
						 
						input.seek(index67_1245);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA67_1179 = input.LA(1);
						 
						int index67_1179 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1179==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1179);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA67_1028 = input.LA(1);
						 
						int index67_1028 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1028==' ') && ((allowGroup))) {s = 855;}
						else s = 41;
						 
						input.seek(index67_1028);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA67_1030 = input.LA(1);
						 
						int index67_1030 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1030==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1030);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA67_1113 = input.LA(1);
						 
						int index67_1113 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1113==' ') && ((allowGroup))) {s = 1249;}
						else s = 41;
						 
						input.seek(index67_1113);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA67_1268 = input.LA(1);
						 
						int index67_1268 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1268==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1268);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA67_1362 = input.LA(1);
						 
						int index67_1362 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1362==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1362);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA67_602 = input.LA(1);
						 
						int index67_602 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_602==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_602);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA67_1591 = input.LA(1);
						 
						int index67_1591 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1591=='s') ) {s = 487;}
						else if ( ((LA67_1591 >= '\t' && LA67_1591 <= '\n')||LA67_1591=='\r'||LA67_1591==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1591=='(') ) {s = 488;}
						else if ( (LA67_1591=='M') ) {s = 489;}
						else if ( (LA67_1591=='!'||(LA67_1591 >= '&' && LA67_1591 <= '\'')||(LA67_1591 >= ',' && LA67_1591 <= '.')||(LA67_1591 >= '0' && LA67_1591 <= ';')||LA67_1591=='?'||(LA67_1591 >= 'A' && LA67_1591 <= 'L')||(LA67_1591 >= 'N' && LA67_1591 <= 'Z')||LA67_1591=='_'||(LA67_1591 >= 'a' && LA67_1591 <= 'r')||(LA67_1591 >= 't' && LA67_1591 <= 'z')||LA67_1591=='\u2019') ) {s = 41;}
						else s = 1610;
						 
						input.seek(index67_1591);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA67_670 = input.LA(1);
						 
						int index67_670 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_670==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_670);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA67_1184 = input.LA(1);
						 
						int index67_1184 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1184==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1184);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA67_1037 = input.LA(1);
						 
						int index67_1037 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1037==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1037);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA67_1501 = input.LA(1);
						 
						int index67_1501 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1501==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1501);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA67_1424 = input.LA(1);
						 
						int index67_1424 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1424=='s') ) {s = 487;}
						else if ( ((LA67_1424 >= '\t' && LA67_1424 <= '\n')||LA67_1424=='\r'||LA67_1424==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1424=='(') ) {s = 488;}
						else if ( (LA67_1424=='M') ) {s = 489;}
						else if ( (LA67_1424=='!'||(LA67_1424 >= '&' && LA67_1424 <= '\'')||(LA67_1424 >= ',' && LA67_1424 <= '.')||(LA67_1424 >= '0' && LA67_1424 <= ';')||LA67_1424=='?'||(LA67_1424 >= 'A' && LA67_1424 <= 'L')||(LA67_1424 >= 'N' && LA67_1424 <= 'Z')||LA67_1424=='_'||(LA67_1424 >= 'a' && LA67_1424 <= 'r')||(LA67_1424 >= 't' && LA67_1424 <= 'z')||LA67_1424=='\u2019') ) {s = 41;}
						else s = 1484;
						 
						input.seek(index67_1424);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA67_834 = input.LA(1);
						 
						int index67_834 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_834==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_834);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA67_919 = input.LA(1);
						 
						int index67_919 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_919=='s') ) {s = 487;}
						else if ( ((LA67_919 >= '\t' && LA67_919 <= '\n')||LA67_919=='\r'||LA67_919==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_919=='(') ) {s = 488;}
						else if ( (LA67_919=='M') ) {s = 489;}
						else if ( (LA67_919=='!'||(LA67_919 >= '&' && LA67_919 <= '\'')||(LA67_919 >= ',' && LA67_919 <= '.')||(LA67_919 >= '0' && LA67_919 <= ';')||LA67_919=='?'||(LA67_919 >= 'A' && LA67_919 <= 'L')||(LA67_919 >= 'N' && LA67_919 <= 'Z')||LA67_919=='_'||(LA67_919 >= 'a' && LA67_919 <= 'r')||(LA67_919 >= 't' && LA67_919 <= 'z')||LA67_919=='\u2019') ) {s = 41;}
						else s = 1091;
						 
						input.seek(index67_919);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA67_1092 = input.LA(1);
						 
						int index67_1092 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1092=='s') ) {s = 487;}
						else if ( ((LA67_1092 >= '\t' && LA67_1092 <= '\n')||LA67_1092=='\r'||LA67_1092==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1092=='(') ) {s = 488;}
						else if ( (LA67_1092=='M') ) {s = 489;}
						else if ( (LA67_1092=='!'||(LA67_1092 >= '&' && LA67_1092 <= '\'')||(LA67_1092 >= ',' && LA67_1092 <= '.')||(LA67_1092 >= '0' && LA67_1092 <= ';')||LA67_1092=='?'||(LA67_1092 >= 'A' && LA67_1092 <= 'L')||(LA67_1092 >= 'N' && LA67_1092 <= 'Z')||LA67_1092=='_'||(LA67_1092 >= 'a' && LA67_1092 <= 'r')||(LA67_1092 >= 't' && LA67_1092 <= 'z')||LA67_1092=='\u2019') ) {s = 41;}
						else s = 1233;
						 
						input.seek(index67_1092);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA67_1423 = input.LA(1);
						 
						int index67_1423 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1423=='s') ) {s = 487;}
						else if ( ((LA67_1423 >= '\t' && LA67_1423 <= '\n')||LA67_1423=='\r'||LA67_1423==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1423=='(') ) {s = 488;}
						else if ( (LA67_1423=='M') ) {s = 489;}
						else if ( (LA67_1423=='!'||(LA67_1423 >= '&' && LA67_1423 <= '\'')||(LA67_1423 >= ',' && LA67_1423 <= '.')||(LA67_1423 >= '0' && LA67_1423 <= ';')||LA67_1423=='?'||(LA67_1423 >= 'A' && LA67_1423 <= 'L')||(LA67_1423 >= 'N' && LA67_1423 <= 'Z')||LA67_1423=='_'||(LA67_1423 >= 'a' && LA67_1423 <= 'r')||(LA67_1423 >= 't' && LA67_1423 <= 'z')||LA67_1423=='\u2019') ) {s = 41;}
						else s = 1483;
						 
						input.seek(index67_1423);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA67_1011 = input.LA(1);
						 
						int index67_1011 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1011==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1011);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA67_1012 = input.LA(1);
						 
						int index67_1012 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1012==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1012);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA67_424 = input.LA(1);
						 
						int index67_424 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_424==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_424);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA67_829 = input.LA(1);
						 
						int index67_829 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_829==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_829);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA67_1422 = input.LA(1);
						 
						int index67_1422 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1422=='s') ) {s = 487;}
						else if ( ((LA67_1422 >= '\t' && LA67_1422 <= '\n')||LA67_1422=='\r'||LA67_1422==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1422=='(') ) {s = 488;}
						else if ( (LA67_1422=='M') ) {s = 489;}
						else if ( (LA67_1422=='!'||(LA67_1422 >= '&' && LA67_1422 <= '\'')||(LA67_1422 >= ',' && LA67_1422 <= '.')||(LA67_1422 >= '0' && LA67_1422 <= ';')||LA67_1422=='?'||(LA67_1422 >= 'A' && LA67_1422 <= 'L')||(LA67_1422 >= 'N' && LA67_1422 <= 'Z')||LA67_1422=='_'||(LA67_1422 >= 'a' && LA67_1422 <= 'r')||(LA67_1422 >= 't' && LA67_1422 <= 'z')||LA67_1422=='\u2019') ) {s = 41;}
						else s = 1482;
						 
						input.seek(index67_1422);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA67_1149 = input.LA(1);
						 
						int index67_1149 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1149==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1149);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA67_806 = input.LA(1);
						 
						int index67_806 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_806==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_806=='s') ) {s = 996;}
						else s = 41;
						 
						input.seek(index67_806);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA67_703 = input.LA(1);
						 
						int index67_703 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_703=='s') ) {s = 487;}
						else if ( ((LA67_703 >= '\t' && LA67_703 <= '\n')||LA67_703=='\r'||LA67_703==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_703=='(') ) {s = 488;}
						else if ( (LA67_703=='M') ) {s = 489;}
						else if ( (LA67_703=='!'||(LA67_703 >= '&' && LA67_703 <= '\'')||(LA67_703 >= ',' && LA67_703 <= '.')||(LA67_703 >= '0' && LA67_703 <= ';')||LA67_703=='?'||(LA67_703 >= 'A' && LA67_703 <= 'L')||(LA67_703 >= 'N' && LA67_703 <= 'Z')||LA67_703=='_'||(LA67_703 >= 'a' && LA67_703 <= 'r')||(LA67_703 >= 't' && LA67_703 <= 'z')||LA67_703=='\u2019') ) {s = 41;}
						else s = 910;
						 
						input.seek(index67_703);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA67_286 = input.LA(1);
						 
						int index67_286 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_286=='s') ) {s = 487;}
						else if ( ((LA67_286 >= '\t' && LA67_286 <= '\n')||LA67_286=='\r'||LA67_286==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_286=='(') ) {s = 488;}
						else if ( (LA67_286=='M') ) {s = 489;}
						else if ( (LA67_286=='!'||(LA67_286 >= '&' && LA67_286 <= '\'')||(LA67_286 >= ',' && LA67_286 <= '.')||(LA67_286 >= '0' && LA67_286 <= ';')||LA67_286=='?'||(LA67_286 >= 'A' && LA67_286 <= 'L')||(LA67_286 >= 'N' && LA67_286 <= 'Z')||LA67_286=='_'||(LA67_286 >= 'a' && LA67_286 <= 'r')||(LA67_286 >= 't' && LA67_286 <= 'z')||LA67_286=='\u2019') ) {s = 41;}
						else s = 486;
						 
						input.seek(index67_286);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA67_1236 = input.LA(1);
						 
						int index67_1236 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1236==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1236);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA67_1171 = input.LA(1);
						 
						int index67_1171 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1171==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1171);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA67_434 = input.LA(1);
						 
						int index67_434 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_434==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_434);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA67_1385 = input.LA(1);
						 
						int index67_1385 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1385=='s') ) {s = 487;}
						else if ( ((LA67_1385 >= '\t' && LA67_1385 <= '\n')||LA67_1385=='\r'||LA67_1385==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1385=='(') ) {s = 488;}
						else if ( (LA67_1385=='M') ) {s = 489;}
						else if ( (LA67_1385=='!'||(LA67_1385 >= '&' && LA67_1385 <= '\'')||(LA67_1385 >= ',' && LA67_1385 <= '.')||(LA67_1385 >= '0' && LA67_1385 <= ';')||LA67_1385=='?'||(LA67_1385 >= 'A' && LA67_1385 <= 'L')||(LA67_1385 >= 'N' && LA67_1385 <= 'Z')||LA67_1385=='_'||(LA67_1385 >= 'a' && LA67_1385 <= 'r')||(LA67_1385 >= 't' && LA67_1385 <= 'z')||LA67_1385=='\u2019') ) {s = 41;}
						else s = 1449;
						 
						input.seek(index67_1385);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA67_879 = input.LA(1);
						 
						int index67_879 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_879=='s') ) {s = 487;}
						else if ( ((LA67_879 >= '\t' && LA67_879 <= '\n')||LA67_879=='\r'||LA67_879==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_879=='(') ) {s = 488;}
						else if ( (LA67_879=='M') ) {s = 489;}
						else if ( (LA67_879=='!'||(LA67_879 >= '&' && LA67_879 <= '\'')||(LA67_879 >= ',' && LA67_879 <= '.')||(LA67_879 >= '0' && LA67_879 <= ';')||LA67_879=='?'||(LA67_879 >= 'A' && LA67_879 <= 'L')||(LA67_879 >= 'N' && LA67_879 <= 'Z')||LA67_879=='_'||(LA67_879 >= 'a' && LA67_879 <= 'r')||(LA67_879 >= 't' && LA67_879 <= 'z')||LA67_879=='\u2019') ) {s = 41;}
						else s = 1047;
						 
						input.seek(index67_879);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA67_836 = input.LA(1);
						 
						int index67_836 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_836==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_836);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA67_639 = input.LA(1);
						 
						int index67_639 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_639==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_639);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA67_1446 = input.LA(1);
						 
						int index67_1446 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1446==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1446);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA67_1241 = input.LA(1);
						 
						int index67_1241 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1241=='s') ) {s = 487;}
						else if ( ((LA67_1241 >= '\t' && LA67_1241 <= '\n')||LA67_1241=='\r'||LA67_1241==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1241=='(') ) {s = 488;}
						else if ( (LA67_1241=='M') ) {s = 489;}
						else if ( (LA67_1241=='!'||(LA67_1241 >= '&' && LA67_1241 <= '\'')||(LA67_1241 >= ',' && LA67_1241 <= '.')||(LA67_1241 >= '0' && LA67_1241 <= ';')||LA67_1241=='?'||(LA67_1241 >= 'A' && LA67_1241 <= 'L')||(LA67_1241 >= 'N' && LA67_1241 <= 'Z')||LA67_1241=='_'||(LA67_1241 >= 'a' && LA67_1241 <= 'r')||(LA67_1241 >= 't' && LA67_1241 <= 'z')||LA67_1241=='\u2019') ) {s = 41;}
						else s = 1346;
						 
						input.seek(index67_1241);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA67_1369 = input.LA(1);
						 
						int index67_1369 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1369==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1369);
						if ( s>=0 ) return s;
						break;

					case 180 : 
						int LA67_1445 = input.LA(1);
						 
						int index67_1445 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1445==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1445);
						if ( s>=0 ) return s;
						break;

					case 181 : 
						int LA67_1386 = input.LA(1);
						 
						int index67_1386 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1386==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_1386);
						if ( s>=0 ) return s;
						break;

					case 182 : 
						int LA67_1655 = input.LA(1);
						 
						int index67_1655 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1655);
						if ( s>=0 ) return s;
						break;

					case 183 : 
						int LA67_1610 = input.LA(1);
						 
						int index67_1610 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1610);
						if ( s>=0 ) return s;
						break;

					case 184 : 
						int LA67_1603 = input.LA(1);
						 
						int index67_1603 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1603);
						if ( s>=0 ) return s;
						break;

					case 185 : 
						int LA67_1586 = input.LA(1);
						 
						int index67_1586 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1586);
						if ( s>=0 ) return s;
						break;

					case 186 : 
						int LA67_1584 = input.LA(1);
						 
						int index67_1584 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1584);
						if ( s>=0 ) return s;
						break;

					case 187 : 
						int LA67_1567 = input.LA(1);
						 
						int index67_1567 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1567);
						if ( s>=0 ) return s;
						break;

					case 188 : 
						int LA67_704 = input.LA(1);
						 
						int index67_704 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_704);
						if ( s>=0 ) return s;
						break;

					case 189 : 
						int LA67_685 = input.LA(1);
						 
						int index67_685 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_685);
						if ( s>=0 ) return s;
						break;

					case 190 : 
						int LA67_486 = input.LA(1);
						 
						int index67_486 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_486);
						if ( s>=0 ) return s;
						break;

					case 191 : 
						int LA67_790 = input.LA(1);
						 
						int index67_790 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_790);
						if ( s>=0 ) return s;
						break;

					case 192 : 
						int LA67_813 = input.LA(1);
						 
						int index67_813 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_813);
						if ( s>=0 ) return s;
						break;

					case 193 : 
						int LA67_815 = input.LA(1);
						 
						int index67_815 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_815);
						if ( s>=0 ) return s;
						break;

					case 194 : 
						int LA67_875 = input.LA(1);
						 
						int index67_875 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_875);
						if ( s>=0 ) return s;
						break;

					case 195 : 
						int LA67_910 = input.LA(1);
						 
						int index67_910 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_910);
						if ( s>=0 ) return s;
						break;

					case 196 : 
						int LA67_989 = input.LA(1);
						 
						int index67_989 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_989);
						if ( s>=0 ) return s;
						break;

					case 197 : 
						int LA67_999 = input.LA(1);
						 
						int index67_999 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_999);
						if ( s>=0 ) return s;
						break;

					case 198 : 
						int LA67_1001 = input.LA(1);
						 
						int index67_1001 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1001);
						if ( s>=0 ) return s;
						break;

					case 199 : 
						int LA67_1013 = input.LA(1);
						 
						int index67_1013 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1013);
						if ( s>=0 ) return s;
						break;

					case 200 : 
						int LA67_1035 = input.LA(1);
						 
						int index67_1035 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1035);
						if ( s>=0 ) return s;
						break;

					case 201 : 
						int LA67_1047 = input.LA(1);
						 
						int index67_1047 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1047);
						if ( s>=0 ) return s;
						break;

					case 202 : 
						int LA67_1091 = input.LA(1);
						 
						int index67_1091 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1091);
						if ( s>=0 ) return s;
						break;

					case 203 : 
						int LA67_1118 = input.LA(1);
						 
						int index67_1118 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1118);
						if ( s>=0 ) return s;
						break;

					case 204 : 
						int LA67_1137 = input.LA(1);
						 
						int index67_1137 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1137);
						if ( s>=0 ) return s;
						break;

					case 205 : 
						int LA67_1138 = input.LA(1);
						 
						int index67_1138 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1138);
						if ( s>=0 ) return s;
						break;

					case 206 : 
						int LA67_1153 = input.LA(1);
						 
						int index67_1153 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1153);
						if ( s>=0 ) return s;
						break;

					case 207 : 
						int LA67_1162 = input.LA(1);
						 
						int index67_1162 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1162);
						if ( s>=0 ) return s;
						break;

					case 208 : 
						int LA67_1176 = input.LA(1);
						 
						int index67_1176 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1176);
						if ( s>=0 ) return s;
						break;

					case 209 : 
						int LA67_1186 = input.LA(1);
						 
						int index67_1186 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1186);
						if ( s>=0 ) return s;
						break;

					case 210 : 
						int LA67_1190 = input.LA(1);
						 
						int index67_1190 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1190);
						if ( s>=0 ) return s;
						break;

					case 211 : 
						int LA67_1233 = input.LA(1);
						 
						int index67_1233 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1233);
						if ( s>=0 ) return s;
						break;

					case 212 : 
						int LA67_1238 = input.LA(1);
						 
						int index67_1238 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1238);
						if ( s>=0 ) return s;
						break;

					case 213 : 
						int LA67_1257 = input.LA(1);
						 
						int index67_1257 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1257);
						if ( s>=0 ) return s;
						break;

					case 214 : 
						int LA67_1281 = input.LA(1);
						 
						int index67_1281 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1281);
						if ( s>=0 ) return s;
						break;

					case 215 : 
						int LA67_1291 = input.LA(1);
						 
						int index67_1291 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1291);
						if ( s>=0 ) return s;
						break;

					case 216 : 
						int LA67_1294 = input.LA(1);
						 
						int index67_1294 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1294);
						if ( s>=0 ) return s;
						break;

					case 217 : 
						int LA67_1295 = input.LA(1);
						 
						int index67_1295 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1295);
						if ( s>=0 ) return s;
						break;

					case 218 : 
						int LA67_1296 = input.LA(1);
						 
						int index67_1296 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1296);
						if ( s>=0 ) return s;
						break;

					case 219 : 
						int LA67_1298 = input.LA(1);
						 
						int index67_1298 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1298);
						if ( s>=0 ) return s;
						break;

					case 220 : 
						int LA67_1335 = input.LA(1);
						 
						int index67_1335 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1335);
						if ( s>=0 ) return s;
						break;

					case 221 : 
						int LA67_1346 = input.LA(1);
						 
						int index67_1346 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1346);
						if ( s>=0 ) return s;
						break;

					case 222 : 
						int LA67_1370 = input.LA(1);
						 
						int index67_1370 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1370);
						if ( s>=0 ) return s;
						break;

					case 223 : 
						int LA67_1375 = input.LA(1);
						 
						int index67_1375 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1375);
						if ( s>=0 ) return s;
						break;

					case 224 : 
						int LA67_1377 = input.LA(1);
						 
						int index67_1377 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1377);
						if ( s>=0 ) return s;
						break;

					case 225 : 
						int LA67_1378 = input.LA(1);
						 
						int index67_1378 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1378);
						if ( s>=0 ) return s;
						break;

					case 226 : 
						int LA67_1381 = input.LA(1);
						 
						int index67_1381 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1381);
						if ( s>=0 ) return s;
						break;

					case 227 : 
						int LA67_1384 = input.LA(1);
						 
						int index67_1384 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1384);
						if ( s>=0 ) return s;
						break;

					case 228 : 
						int LA67_1437 = input.LA(1);
						 
						int index67_1437 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1437);
						if ( s>=0 ) return s;
						break;

					case 229 : 
						int LA67_1442 = input.LA(1);
						 
						int index67_1442 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1442);
						if ( s>=0 ) return s;
						break;

					case 230 : 
						int LA67_1447 = input.LA(1);
						 
						int index67_1447 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1447);
						if ( s>=0 ) return s;
						break;

					case 231 : 
						int LA67_1448 = input.LA(1);
						 
						int index67_1448 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1448);
						if ( s>=0 ) return s;
						break;

					case 232 : 
						int LA67_1449 = input.LA(1);
						 
						int index67_1449 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1449);
						if ( s>=0 ) return s;
						break;

					case 233 : 
						int LA67_1482 = input.LA(1);
						 
						int index67_1482 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1482);
						if ( s>=0 ) return s;
						break;

					case 234 : 
						int LA67_1483 = input.LA(1);
						 
						int index67_1483 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1483);
						if ( s>=0 ) return s;
						break;

					case 235 : 
						int LA67_1484 = input.LA(1);
						 
						int index67_1484 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1484);
						if ( s>=0 ) return s;
						break;

					case 236 : 
						int LA67_1491 = input.LA(1);
						 
						int index67_1491 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1491);
						if ( s>=0 ) return s;
						break;

					case 237 : 
						int LA67_1500 = input.LA(1);
						 
						int index67_1500 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1500);
						if ( s>=0 ) return s;
						break;

					case 238 : 
						int LA67_1534 = input.LA(1);
						 
						int index67_1534 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 102;}
						else if ( (true) ) {s = 41;}
						 
						input.seek(index67_1534);
						if ( s>=0 ) return s;
						break;

					case 239 : 
						int LA67_646 = input.LA(1);
						 
						int index67_646 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_646==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_646);
						if ( s>=0 ) return s;
						break;

					case 240 : 
						int LA67_843 = input.LA(1);
						 
						int index67_843 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_843==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_843);
						if ( s>=0 ) return s;
						break;

					case 241 : 
						int LA67_242 = input.LA(1);
						 
						int index67_242 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_242==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_242);
						if ( s>=0 ) return s;
						break;

					case 242 : 
						int LA67_1097 = input.LA(1);
						 
						int index67_1097 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1097=='s') ) {s = 487;}
						else if ( ((LA67_1097 >= '\t' && LA67_1097 <= '\n')||LA67_1097=='\r'||LA67_1097==' ') && ((allowBreed))) {s = 102;}
						else if ( (LA67_1097=='(') ) {s = 488;}
						else if ( (LA67_1097=='M') ) {s = 489;}
						else if ( (LA67_1097=='!'||(LA67_1097 >= '&' && LA67_1097 <= '\'')||(LA67_1097 >= ',' && LA67_1097 <= '.')||(LA67_1097 >= '0' && LA67_1097 <= ';')||LA67_1097=='?'||(LA67_1097 >= 'A' && LA67_1097 <= 'L')||(LA67_1097 >= 'N' && LA67_1097 <= 'Z')||LA67_1097=='_'||(LA67_1097 >= 'a' && LA67_1097 <= 'r')||(LA67_1097 >= 't' && LA67_1097 <= 'z')||LA67_1097=='\u2019') ) {s = 41;}
						else s = 1238;
						 
						input.seek(index67_1097);
						if ( s>=0 ) return s;
						break;

					case 243 : 
						int LA67_809 = input.LA(1);
						 
						int index67_809 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_809==' ') && ((allowBreed))) {s = 102;}
						else s = 41;
						 
						input.seek(index67_809);
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 67, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
