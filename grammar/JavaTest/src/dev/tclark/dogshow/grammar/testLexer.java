// $ANTLR null C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-11-09 18:04:40

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
	public static final int FRAG_RALLY_CLASS_NAME=21;
	public static final int FRAG_RALLY_CLASS_SECTION=22;
	public static final int FRAG_RALLY_ENTRANT_GROUP=23;
	public static final int FRAG_RALLY_SINGLE_ENTRANT=24;
	public static final int FRAG_RING=25;
	public static final int FRAG_SPECIAL_GROUP_NAME=26;
	public static final int FRAG_SPEC_CHAR=27;
	public static final int FRAG_SPEC_WORD_CHAR=28;
	public static final int FRAG_TIME_LABEL=29;
	public static final int FRAG_TITLE=30;
	public static final int FRAG_TO_FOLLOW=31;
	public static final int FRAG_WEEK_DAY=32;
	public static final int FallThrough=33;
	public static final int GROUP_RING=34;
	public static final int INT=35;
	public static final int JUDGE_NAME=36;
	public static final int JUNIOR_CLASS=37;
	public static final int NON_CONFORMATION_CLASS_LEVEL=38;
	public static final int NON_CONFORMATION_CLASS_NAME=39;
	public static final int NON_CONFORMATION_CLASS_SECTION=40;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=41;
	public static final int NON_CONFORMATION_SECOND_LINE=42;
	public static final int NON_CONF_SECOND_LINE_COMMENT=43;
	public static final int PARENTHETICAL=44;
	public static final int PARENTHETICAL_INT=45;
	public static final int PARENTHETICAL_NAME=46;
	public static final int PHONE_NUMBER=47;
	public static final int RALLY_CLASS=48;
	public static final int RALLY_ENTRY=49;
	public static final int RING_TITLE=50;
	public static final int SPECIAL_SUFFIX=51;
	public static final int STANDALONE_COMMENT=52;
	public static final int TIME=53;
	public static final int WORD=54;
	public static final int WS=55;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:9: 'Master Class'
					{
					match("Master Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:9: 'Open Senior'
					{
					match("Open Senior"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:9: 'Open Intermediate'
					{
					match("Open Intermediate"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:9: 'Open Junior'
					{
					match("Open Junior"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:9: 'Novice Senior'
					{
					match("Novice Senior"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:9: 'Novice Junior'
					{
					match("Novice Junior"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:9: 'Novice Intermediate'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:5: ({...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:7: {...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "FRAG_BREED_NAME_SINGLE", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=198;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:24: 'Affenpinscher'
					{
					match("Affenpinscher"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:5: 'Afghan Hound'
					{
					match("Afghan Hound"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:5: 'Akita'
					{
					match("Akita"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:5: 'American English Coonhound'
					{
					match("American English Coonhound"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: 'American Foxhound'
					{
					match("American Foxhound"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:2: 'Appenzeller Sennenhunde'
					{
					match("Appenzeller Sennenhunde"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: 'Australian Terrier'
					{
					match("Australian Terrier"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:5: 'Basenji'
					{
					match("Basenji"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:5: 'Basset Hound'
					{
					match("Basset Hound"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:5: 'Beagle'
					{
					match("Beagle"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:5: 'Bearded Collie'
					{
					match("Bearded Collie"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:5: 'Beauceron'
					{
					match("Beauceron"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: 'Berger Picard'
					{
					match("Berger Picard"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:5: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:5: 'Bichons Frise'
					{
					match("Bichons Frise"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:263:5: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:5: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:5: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:5: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:272:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:273:5: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:5: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:275:5: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:276:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:277:5: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:5: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:5: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:5: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:283:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:286:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:287:5: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:289:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:290:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:292:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:5: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:5: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:5: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:5: 'Dogo Argentine'
					{
					match("Dogo Argentine"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:5: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:5: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:308:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:309:5: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:312:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:5: 'Fox Terrier'
					{
					match("Fox Terrier"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:5: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:5: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:5: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:5: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:5: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:5: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:5: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:5: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:5: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:5: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:5: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:5: 'Keeshonden'
					{
					match("Keeshonden"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:341:5: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:342:5: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:343:5: 'Kuvaszok'
					{
					match("Kuvaszok"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:345:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:5: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:5: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:5: 'Lowchen'
					{
					match("Lowchen"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:5: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:5: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:354:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:357:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:5: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:360:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:5: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:5: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:5: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:5: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:5: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:5: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:5: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:380:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:5: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:5: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:5: 'Pulik'
					{
					match("Pulik"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:5: 'Rat Terrier'
					{
					match("Rat Terrier"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:5: 'Retrievers'
					{
					match("Retrievers"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:5: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:5: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:5: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:5: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:5: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:5: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:397:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:398:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:5: 'Setters'
					{
					match("Setters"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:5: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:5: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:5: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:5: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:406:5: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:5: 'Spaniels'
					{
					match("Spaniels"); 

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:410:5: 'Spinoni Italiani'
					{
					match("Spinoni Italiani"); 

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:411:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:412:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:417:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:5: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:5: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 191 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 192 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 193 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:5: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 194 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 195 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:427:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 196 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:2: 'Wirehaired Vizsla'
					{
					match("Wirehaired Vizsla"); 

					}
					break;
				case 197 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 198 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:5: 'Yorkshire Terrier'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:5: ({...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:7: {...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "BREED_NAME", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:22: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
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
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
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
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:23: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:46: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:67: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:67: 's'
					{
					match('s'); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:72: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:72: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:76: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:77: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); 
					mFRAG_BREED_NAME_CATEGORY(); 

					match(')'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:110: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:110: WS
							{
							mWS(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:114: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:114: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); 

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:150: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='('||LA9_0=='M') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:150: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:5: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:10: FRAG_BREED_NAME_SPECIAL_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:5: ( ( '(' BREED_MISC ')' ) | BREED_MISC )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:9: ( '(' BREED_MISC ')' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:9: ( '(' BREED_MISC ')' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:10: '(' BREED_MISC ')'
					{
					match('('); 
					mBREED_MISC(); 

					match(')'); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:28: BREED_MISC
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:2: ( 'Misc. Dog' | 'Misc. Dogs' | 'Misc. Bitch' | 'Misc. Bitches' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:2: 'Misc. Dog'
					{
					match("Misc. Dog"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:14: 'Misc. Dogs'
					{
					match("Misc. Dogs"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:27: 'Misc. Bitch'
					{
					match("Misc. Bitch"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:41: 'Misc. Bitches'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:5: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:10: 'Sweepstakes'
					{
					match("Sweepstakes"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:24: 'Entry'
					{
					match("Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:32: 'Entries'
					{
					match("Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:42: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:29: ( 'Brood Bitch' | 'Brood Bitche' | 'Veteran Dog' | 'Veteran Bitch' | 'Veteran Bitche' )
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
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 13, 20, input);
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
															new NoViableAltException("", 13, 17, input);
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
														new NoViableAltException("", 13, 15, input);
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
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 13, 9, input);
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++) {
																		input.consume();
																	}
																	NoViableAltException nvae =
																		new NoViableAltException("", 13, 26, input);
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
																	new NoViableAltException("", 13, 23, input);
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
																new NoViableAltException("", 13, 21, input);
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
															new NoViableAltException("", 13, 19, input);
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
														new NoViableAltException("", 13, 16, input);
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
													new NoViableAltException("", 13, 14, input);
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:33: 'Brood Bitch'
					{
					match("Brood Bitch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:47: 'Brood Bitche'
					{
					match("Brood Bitche"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:62: 'Veteran Dog'
					{
					match("Veteran Dog"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:76: 'Veteran Bitch'
					{
					match("Veteran Bitch"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:92: 'Veteran Bitche'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:9: 'Ascob'
					{
					match("Ascob"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:17: 'Parti-Color'
					{
					match("Parti-Color"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:31: 'Black'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:5: ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt15=38;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:9: '13 Inch'
					{
					match("13 Inch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:9: '15 Inch'
					{
					match("15 Inch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:9: 'American Water'
					{
					match("American Water"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:9: 'Boykin'
					{
					match("Boykin"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:455:9: 'B & P C'
					{
					match("B & P C"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:457:9: 'Clumber'
					{
					match("Clumber"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:9: 'Cocker'
					{
					match("Cocker"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:9: 'Colored'
					{
					match("Colored"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:460:9: 'Curly-Coated'
					{
					match("Curly-Coated"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:9: 'English'
					{
					match("English"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:9: 'English Cocker'
					{
					match("English Cocker"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:9: 'English Springer'
					{
					match("English Springer"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:9: 'Field'
					{
					match("Field"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:9: 'Flat-Coated'
					{
					match("Flat-Coated"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:9: 'German Shorthaired'
					{
					match("German Shorthaired"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:9: 'German Wirehaired'
					{
					match("German Wirehaired"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:9: 'Golden'
					{
					match("Golden"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:9: 'Gordon'
					{
					match("Gordon"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:9: 'Irish'
					{
					match("Irish"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:471:2: 'Irish Red And White'
					{
					match("Irish Red And White"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:472:9: 'Irish Water'
					{
					match("Irish Water"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:473:9: 'K C & R'
					{
					match("K C & R"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:474:9: 'Labrador'
					{
					match("Labrador"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:475:9: 'Long Coat'
					{
					match("Long Coat"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:476:9: 'Longhaired'
					{
					match("Longhaired"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:477:9: 'Miniature'
					{
					match("Miniature"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:478:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:479:9: 'Rough'
					{
					match("Rough"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:480:9: 'Smooth'
					{
					match("Smooth"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:481:9: 'Smooth Coat'
					{
					match("Smooth Coat"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:482:9: 'Standard'
					{
					match("Standard"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:483:9: 'Sussex'
					{
					match("Sussex"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:484:9: 'Toy'
					{
					match("Toy"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:485:9: 'Welsh Springer'
					{
					match("Welsh Springer"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:486:9: 'White'
					{
					match("White"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:487:9: 'Wire'
					{
					match("Wire"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:488:9: 'Wirehaired'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:495:2: ({...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:495:3: {...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
			{
			if ( !((allowGroup)) ) {
				throw new FailedPredicateException(input, "FRAG_GROUP_NAME", "allowGroup");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:495:18: ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:495:20: 'HERDING GROUP'
					{
					match("HERDING GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:496:3: 'TERRIER GROUP'
					{
					match("TERRIER GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:497:3: 'NON-SPORTING GROUP'
					{
					match("NON-SPORTING GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:3: 'SPORTING GROUP'
					{
					match("SPORTING GROUP"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:499:3: 'TOY GROUP'
					{
					match("TOY GROUP"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:3: 'HOUND GROUP'
					{
					match("HOUND GROUP"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:3: 'WORKING GROUP'
					{
					match("WORKING GROUP"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:3: ( 'BEST IN SHOW' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:3: ( 'BEST IN SHOW' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:4: 'BEST IN SHOW'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:506:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:507:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:508:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:509:3: 'Toy Variety Group'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:512:2: ( ( FRAG_GROUP_NAME ' - ' JUDGE_NAME ) | FRAG_SPECIAL_GROUP_NAME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:512:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:512:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:512:5: FRAG_GROUP_NAME ' - ' JUDGE_NAME
					{
					mFRAG_GROUP_NAME(); 

					match(" - "); 

					mJUDGE_NAME(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:512:39: FRAG_SPECIAL_GROUP_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:530:29: ( NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:531:2: NON_CONFORMATION_CLASS_LEVEL ( ' ' NON_CONFORMATION_CLASS_LEVEL )* ( ' ' NON_CONFORMATION_CLASS_SECTION )? ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			{
			mNON_CONFORMATION_CLASS_LEVEL(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:531:31: ( ' ' NON_CONFORMATION_CLASS_LEVEL )*
			loop19:
			while (true) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:531:32: ' ' NON_CONFORMATION_CLASS_LEVEL
					{
					match(' '); 
					mNON_CONFORMATION_CLASS_LEVEL(); 

					}
					break;

				default :
					break loop19;
				}
			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:531:66: ( ' ' NON_CONFORMATION_CLASS_SECTION )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:531:67: ' ' NON_CONFORMATION_CLASS_SECTION
					{
					match(' '); 
					mNON_CONFORMATION_CLASS_SECTION(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:531:103: ( ' ' NON_CONFORMATION_CLASS_SUFFIX )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==' ') ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:531:104: ' ' NON_CONFORMATION_CLASS_SUFFIX
					{
					match(' '); 
					mNON_CONFORMATION_CLASS_SUFFIX(); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:550:2: ( ( 'A' | 'B' ) )
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
	// $ANTLR end "NON_CONFORMATION_CLASS_SECTION"

	// $ANTLR start "NON_CONFORMATION_CLASS_SUFFIX"
	public final void mNON_CONFORMATION_CLASS_SUFFIX() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:552:2: ( 'Class' | 'Walkthrough' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='C') ) {
				alt22=1;
			}
			else if ( (LA22_0=='W') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:552:4: 'Class'
					{
					match("Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:552:12: 'Walkthrough'
					{
					match("Walkthrough"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:554:2: ( 'Advanced' | 'Beginner' | 'Excellent' | 'Utility' | 'Pre' | 'Open' | 'Novice' | 'Wild Card' | ( 'Pair' ( 's' )? ) | 'Graduate' | 'Walkthrough' | 'Versatility' )
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
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:555:2: 'Advanced'
					{
					match("Advanced"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:556:2: 'Beginner'
					{
					match("Beginner"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:557:2: 'Excellent'
					{
					match("Excellent"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:558:2: 'Utility'
					{
					match("Utility"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:559:2: 'Pre'
					{
					match("Pre"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:560:2: 'Open'
					{
					match("Open"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:561:2: 'Novice'
					{
					match("Novice"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:562:2: 'Wild Card'
					{
					match("Wild Card"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:2: ( 'Pair' ( 's' )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:2: ( 'Pair' ( 's' )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:3: 'Pair' ( 's' )?
					{
					match("Pair"); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:9: ( 's' )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0=='s') ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:563:9: 's'
							{
							match('s'); 
							}
							break;

					}

					}

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:564:2: 'Graduate'
					{
					match("Graduate"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:565:2: 'Walkthrough'
					{
					match("Walkthrough"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:566:2: 'Versatility'
					{
					match("Versatility"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:571:2: ( FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:572:3: FRAG_TO_FOLLOW WS ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			{
			mFRAG_TO_FOLLOW(); 

			mWS(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:572:21: ( NON_CONFORMATION_CLASS_NAME | RALLY_CLASS )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= 'A' && LA25_0 <= 'B')||LA25_0=='E'||LA25_0=='G'||(LA25_0 >= 'N' && LA25_0 <= 'P')||(LA25_0 >= 'U' && LA25_0 <= 'W')) ) {
				alt25=1;
			}
			else if ( (LA25_0=='R') ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:572:22: NON_CONFORMATION_CLASS_NAME
					{
					mNON_CONFORMATION_CLASS_NAME(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:572:50: RALLY_CLASS
					{
					mRALLY_CLASS(); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:574:2: ( 'To follow' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:574:4: 'To follow'
			{
			match("To follow"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:576:2: ( FRAG_RALLY_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:576:4: FRAG_RALLY_CLASS_NAME
			{
			mFRAG_RALLY_CLASS_NAME(); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:578:2: ( 'Rally ' NON_CONFORMATION_CLASS_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:578:4: 'Rally ' NON_CONFORMATION_CLASS_NAME
			{
			match("Rally "); 

			mNON_CONFORMATION_CLASS_NAME(); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:580:2: ( 'Walkthrough' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:580:4: 'Walkthrough'
			{
			match("Walkthrough"); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:2: ( ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:4: ( 'inch: ' )? FRAG_RALLY_ENTRANT_GROUP ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:4: ( 'inch: ' )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='i') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:4: 'inch: '
					{
					match("inch: "); 

					}
					break;

			}

			mFRAG_RALLY_ENTRANT_GROUP(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:39: ( ';' FRAG_RALLY_ENTRANT_GROUP )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==';') ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:582:40: ';' FRAG_RALLY_ENTRANT_GROUP
					{
					match(';'); 
					mFRAG_RALLY_ENTRANT_GROUP(); 

					}
					break;

				default :
					break loop27;
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
	// $ANTLR end "RALLY_ENTRY"

	// $ANTLR start "NON_CONFORMATION_SECOND_LINE"
	public final void mNON_CONFORMATION_SECOND_LINE() throws RecognitionException {
		try {
			int _type = NON_CONFORMATION_SECOND_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:29: ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) )
			int alt37=2;
			alt37 = dfa37.predict(input);
			switch (alt37) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:30: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:31: ( '0' .. '9' )+ '-' ( '0' .. '9' )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:31: ( '0' .. '9' )+
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

					match('-'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:43: ( '0' .. '9' )+
					int cnt29=0;
					loop29:
					while (true) {
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
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt29 >= 1 ) break loop29;
							EarlyExitException eee = new EarlyExitException(29, input);
							throw eee;
						}
						cnt29++;
					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:54: ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:55: ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:55: ( '0' .. '9' )+
					int cnt30=0;
					loop30:
					while (true) {
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
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:64: ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0=='-'||LA36_0==';') ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:65: ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:65: ( '-' ( '0' .. '9' )+ )?
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0=='-') ) {
								alt32=1;
							}
							switch (alt32) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:66: '-' ( '0' .. '9' )+
									{
									match('-'); 
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:69: ( '0' .. '9' )+
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

									}
									break;

							}

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:80: ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:81: ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )?
							{
							match(';'); 
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:84: ( '0' .. '9' )+
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

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:93: ( '-' ( '0' .. '9' )+ )?
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
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:94: '-' ( '0' .. '9' )+
									{
									match('-'); 
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:589:97: ( '0' .. '9' )+
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:592:2: ( 'R' ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:592:4: 'R' ( '0' .. '9' )+
			{
			match('R'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:592:7: ( '0' .. '9' )+
			int cnt38=0;
			loop38:
			while (true) {
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
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
			}

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:593:34: ( FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:594:2: FRAG_RALLY_SINGLE_ENTRANT ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			{
			mFRAG_RALLY_SINGLE_ENTRANT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:594:28: ( ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( ((LA39_0 >= ',' && LA39_0 <= '-')) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:594:29: ( ',' | '-' ) FRAG_RALLY_SINGLE_ENTRANT
					{
					if ( (input.LA(1) >= ',' && input.LA(1) <= '-') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					mFRAG_RALLY_SINGLE_ENTRANT(); 

					}
					break;

				default :
					break loop39;
				}
			}

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:597:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
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
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
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
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
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
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
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
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 40, 16, input);
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
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:597:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:597:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:598:14: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:598:25: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:599:14: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:599:22: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:14: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:600:22: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:14: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:601:20: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:602:14: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:602:21: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:14: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:603:21: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:14: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:604:23: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:14: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:605:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:14: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:606:24: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:14: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:607:25: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:14: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:608:25: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:610:29: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:25: ( 'RING' | 'Ring' )
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
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:29: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:611:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:612:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:615:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:5: ( 'am' | 'pm' )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0=='a') ) {
				alt42=1;
			}
			else if ( (LA42_0=='p') ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:618:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:621:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
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
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:621:9: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:621:14: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:9: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:622:15: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:623:9: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:623:14: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:624:9: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:624:16: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:10: 'DR'
					{
					match("DR"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:625:15: 'Dr'
					{
					match("Dr"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:626:9: 'COL'
					{
					match("COL"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:626:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
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
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:629:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:9: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:630:18: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:631:9: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:631:19: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:632:9: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:632:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:9: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:633:20: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:634:9: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:634:18: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:9: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:635:20: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:652:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0=='L') ) {
				alt45=1;
			}
			else if ( (LA45_0=='V') ) {
				alt45=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:652:9: 'LUNCH'
					{
					match("LUNCH"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:652:17: 'VARIETY GROUP JUDGING'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:648:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:648:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+ ( ( WS )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); 

			mWS(); 

			mFRAG_PROPER_NAME(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )+
			int cnt47=0;
			loop47:
			while (true) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0=='(') ) {
						alt46=1;
					}
					else if ( ((LA46_0 >= 'A' && LA46_0 <= 'Z')) ) {
						alt46=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);
						throw nvae;
					}

					switch (alt46) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:66: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:85: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;

					}

					}
					break;

				default :
					if ( cnt47 >= 1 ) break loop47;
					EarlyExitException eee = new EarlyExitException(47, input);
					throw eee;
				}
				cnt47++;
			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:106: ( WS )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( ((LA48_0 >= '\t' && LA48_0 <= '\n')||LA48_0=='\r'||LA48_0==' ') ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:106: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:110: ( PARENTHETICAL_INT )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0=='(') ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:649:110: PARENTHETICAL_INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:652:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:652:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:652:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt50=0;
			loop50:
			while (true) {
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
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt50 >= 1 ) break loop50;
					EarlyExitException eee = new EarlyExitException(50, input);
					throw eee;
				}
				cnt50++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:13: ( ( 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0=='G') ) {
				alt51=1;
			}
			else if ( (LA51_0=='R') ) {
				alt51=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:18: 'GROUP RING'
					{
					match("GROUP RING"); 

					allowGroup=true;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:49: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:49: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:654:50: 'RING' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
			{
			match('('); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			match(')'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:42: ( WS )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( ((LA52_0 >= '\t' && LA52_0 <= '\n')||LA52_0=='\r'||LA52_0==' ') ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:657:42: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:659:13: INT ':' INT WS FRAG_TIME_LABEL
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:661:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:661:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:13: ( '.' )+
			int cnt53=0;
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0=='.') ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:663:13: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt53 >= 1 ) break loop53;
					EarlyExitException eee = new EarlyExitException(53, input);
					throw eee;
				}
				cnt53++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:665:6: ( '0' .. '9' )+
			int cnt54=0;
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( ((LA54_0 >= '0' && LA54_0 <= '9')) ) {
					alt54=1;
				}

				switch (alt54) {
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
	// $ANTLR end "INT"

	// $ANTLR start "PARENTHETICAL"
	public final void mPARENTHETICAL() throws RecognitionException {
		try {
			int _type = PARENTHETICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:13: ( WORD | INT | FRAG_PROPER_NAME )
			int alt55=3;
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
				alt55=1;
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
				alt55=2;
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
				alt55=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:14: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:19: INT
					{
					mINT(); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( ((LA57_0 >= '\t' && LA57_0 <= '\n')||LA57_0=='\r'||LA57_0==' ') ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:45: ( WORD | INT | FRAG_PROPER_NAME )
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:46: WORD
							{
							mWORD(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:51: INT
							{
							mINT(); 

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:668:55: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;

					}

					}
					break;

				default :
					break loop57;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( ((LA58_0 >= '&' && LA58_0 <= '\'')||(LA58_0 >= ',' && LA58_0 <= '-')||(LA58_0 >= ':' && LA58_0 <= ';')||(LA58_0 >= 'A' && LA58_0 <= 'Z')||LA58_0=='_'||(LA58_0 >= 'a' && LA58_0 <= 'z')||LA58_0=='\u2019') ) {
					alt58=1;
				}

				switch (alt58) {
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
					break loop58;
				}
			}

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:669:94: ( END_PUNCTUATION )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0=='!'||LA59_0=='.'||LA59_0=='?') ) {
				alt59=1;
			}
			switch (alt59) {
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:13: ( WS )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( ((LA60_0 >= '\t' && LA60_0 <= '\n')||LA60_0=='\r'||LA60_0==' ') ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:13: WS
					{
					mWS(); 

					}
					break;

			}

			mINT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:21: ( WS )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( ((LA61_0 >= '\t' && LA61_0 <= '\n')||LA61_0=='\r'||LA61_0==' ') ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:672:21: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:673:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:673:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:673:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt62=0;
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( ((LA62_0 >= '&' && LA62_0 <= '\'')||(LA62_0 >= ',' && LA62_0 <= '-')||(LA62_0 >= ':' && LA62_0 <= ';')||LA62_0=='_'||(LA62_0 >= 'a' && LA62_0 <= 'z')||LA62_0=='\u2019') ) {
					alt62=1;
				}

				switch (alt62) {
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
					if ( cnt62 >= 1 ) break loop62;
					EarlyExitException eee = new EarlyExitException(62, input);
					throw eee;
				}
				cnt62++;
			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:673:65: ( END_PUNCTUATION )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0=='!'||LA63_0=='.'||LA63_0=='?') ) {
				alt63=1;
			}
			switch (alt63) {
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			int cnt65=0;
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( ((LA65_0 >= '&' && LA65_0 <= '(')||(LA65_0 >= ',' && LA65_0 <= '.')||(LA65_0 >= '0' && LA65_0 <= ';')||(LA65_0 >= 'A' && LA65_0 <= 'Z')||LA65_0=='_'||(LA65_0 >= 'a' && LA65_0 <= 'z')||LA65_0=='\u2019') ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					int alt64=5;
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
						alt64=1;
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
						alt64=2;
						}
						break;
					case '(':
						{
						alt64=3;
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
						alt64=4;
						}
						break;
					case '.':
						{
						alt64=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}
					switch (alt64) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:32: WORD
							{
							mWORD(); 

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:37: PARENTHETICAL
							{
							mPARENTHETICAL(); 

							}
							break;
						case 4 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:51: INT
							{
							mINT(); 

							}
							break;
						case 5 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:674:55: ELLIPSIS
							{
							mELLIPSIS(); 

							}
							break;

					}

					allowBreed=false; allowGroup=false;allowJudge=false;
					}
					break;

				default :
					if ( cnt65 >= 1 ) break loop65;
					EarlyExitException eee = new EarlyExitException(65, input);
					throw eee;
				}
				cnt65++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:676:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:676:4: WORD END_PUNCTUATION
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:28: ( '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:30: '(' ( FRAG_TITLE WS )? FRAG_PROPER_NAME ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:34: ( FRAG_TITLE WS )?
			int alt66=2;
			switch ( input.LA(1) ) {
				case 'M':
					{
					switch ( input.LA(2) ) {
						case 'R':
							{
							int LA66_5 = input.LA(3);
							if ( (LA66_5=='S') ) {
								int LA66_15 = input.LA(4);
								if ( ((LA66_15 >= '\t' && LA66_15 <= '\n')||LA66_15=='\r'||LA66_15==' ') ) {
									alt66=1;
								}
							}
							else if ( ((LA66_5 >= '\t' && LA66_5 <= '\n')||LA66_5=='\r'||LA66_5==' ') ) {
								alt66=1;
							}
							}
							break;
						case 'r':
							{
							int LA66_6 = input.LA(3);
							if ( (LA66_6=='s') ) {
								int LA66_17 = input.LA(4);
								if ( ((LA66_17 >= '\t' && LA66_17 <= '\n')||LA66_17=='\r'||LA66_17==' ') ) {
									alt66=1;
								}
							}
							else if ( ((LA66_6 >= '\t' && LA66_6 <= '\n')||LA66_6=='\r'||LA66_6==' ') ) {
								alt66=1;
							}
							}
							break;
						case 'S':
							{
							int LA66_7 = input.LA(3);
							if ( ((LA66_7 >= '\t' && LA66_7 <= '\n')||LA66_7=='\r'||LA66_7==' ') ) {
								alt66=1;
							}
							}
							break;
						case 's':
							{
							int LA66_8 = input.LA(3);
							if ( ((LA66_8 >= '\t' && LA66_8 <= '\n')||LA66_8=='\r'||LA66_8==' ') ) {
								alt66=1;
							}
							}
							break;
						case 'I':
							{
							int LA66_9 = input.LA(3);
							if ( (LA66_9=='S') ) {
								int LA66_18 = input.LA(4);
								if ( (LA66_18=='S') ) {
									int LA66_22 = input.LA(5);
									if ( ((LA66_22 >= '\t' && LA66_22 <= '\n')||LA66_22=='\r'||LA66_22==' ') ) {
										alt66=1;
									}
								}
							}
							}
							break;
						case 'i':
							{
							int LA66_10 = input.LA(3);
							if ( (LA66_10=='s') ) {
								int LA66_19 = input.LA(4);
								if ( (LA66_19=='s') ) {
									int LA66_23 = input.LA(5);
									if ( ((LA66_23 >= '\t' && LA66_23 <= '\n')||LA66_23=='\r'||LA66_23==' ') ) {
										alt66=1;
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
					int LA66_2 = input.LA(2);
					if ( (LA66_2=='R') ) {
						int LA66_11 = input.LA(3);
						if ( ((LA66_11 >= '\t' && LA66_11 <= '\n')||LA66_11=='\r'||LA66_11==' ') ) {
							alt66=1;
						}
					}
					else if ( (LA66_2=='r') ) {
						int LA66_12 = input.LA(3);
						if ( ((LA66_12 >= '\t' && LA66_12 <= '\n')||LA66_12=='\r'||LA66_12==' ') ) {
							alt66=1;
						}
					}
					}
					break;
				case 'C':
					{
					int LA66_3 = input.LA(2);
					if ( (LA66_3=='O') ) {
						int LA66_13 = input.LA(3);
						if ( (LA66_13=='L') ) {
							int LA66_20 = input.LA(4);
							if ( ((LA66_20 >= '\t' && LA66_20 <= '\n')||LA66_20=='\r'||LA66_20==' ') ) {
								alt66=1;
							}
						}
					}
					else if ( (LA66_3=='o') ) {
						int LA66_14 = input.LA(3);
						if ( (LA66_14=='l') ) {
							int LA66_21 = input.LA(4);
							if ( ((LA66_21 >= '\t' && LA66_21 <= '\n')||LA66_21=='\r'||LA66_21==' ') ) {
								alt66=1;
							}
						}
					}
					}
					break;
			}
			switch (alt66) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:677:35: FRAG_TITLE WS
					{
					mFRAG_TITLE(); 

					mWS(); 

					}
					break;

			}

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:683:6: .
			{
			matchAny(); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;

			  //System.err.println("Ooops! " + getText() + " fell through");

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FallThrough"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough )
		int alt67=23;
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:88: NON_CONF_SECOND_LINE_COMMENT
				{
				mNON_CONF_SECOND_LINE_COMMENT(); 

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:117: RALLY_CLASS
				{
				mRALLY_CLASS(); 

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:129: RALLY_ENTRY
				{
				mRALLY_ENTRY(); 

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:141: NON_CONFORMATION_SECOND_LINE
				{
				mNON_CONFORMATION_SECOND_LINE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:170: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); 

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:189: BREED_COUNT
				{
				mBREED_COUNT(); 

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:201: JUDGE_NAME
				{
				mJUDGE_NAME(); 

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:212: WS
				{
				mWS(); 

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:215: RING_TITLE
				{
				mRING_TITLE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:226: PHONE_NUMBER
				{
				mPHONE_NUMBER(); 

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:239: TIME
				{
				mTIME(); 

				}
				break;
			case 17 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:244: DATE
				{
				mDATE(); 

				}
				break;
			case 18 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:249: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 19 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:258: INT
				{
				mINT(); 

				}
				break;
			case 20 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:262: PARENTHETICAL
				{
				mPARENTHETICAL(); 

				}
				break;
			case 21 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:276: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); 

				}
				break;
			case 22 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:294: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 23 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:302: FallThrough
				{
				mFallThrough(); 

				}
				break;

		}
	}


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA15 dfa15 = new DFA15(this);
	protected DFA37 dfa37 = new DFA37(this);
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
			return "232:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'Anatolian Shepherd Dog' | 'Appenzeller Sennenhunde' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Wirehaired Vizsla' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
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
			return "449:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'American Water' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Red And White' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
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

	protected class DFA37 extends DFA {

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
			return "589:1: NON_CONFORMATION_SECOND_LINE : ( ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( ( '-' ( '0' .. '9' )+ )? ( ';' ( '0' .. '9' )+ ( '-' ( '0' .. '9' )+ )? ) )+ ) );";
		}
	}

	static final String DFA67_eotS =
		"\1\uffff\31\52\1\u00a5\1\uffff\1\40\1\u00ac\3\uffff\11\52\1\uffff\76\52"+
		"\1\uffff\21\52\1\u0133\47\52\1\u00a5\1\52\1\uffff\1\52\6\uffff\1\u00ac"+
		"\6\52\1\uffff\161\52\1\u01f5\2\52\1\u01fb\11\52\1\uffff\34\52\1\uffff"+
		"\32\52\2\u023d\1\52\2\uffff\1\u0245\2\uffff\1\u0245\2\uffff\10\52\1\u01fb"+
		"\153\52\1\u01fb\12\52\1\uffff\1\u02c1\1\uffff\1\52\1\u02d4\1\52\1\uffff"+
		"\46\52\1\uffff\2\52\1\uffff\27\52\1\uffff\2\52\6\uffff\7\52\1\uffff\13"+
		"\52\1\u032b\30\52\1\u0343\1\52\1\u0345\32\52\1\u035d\43\52\1\u037b\2\52"+
		"\1\u01fb\4\52\1\u0382\5\52\21\uffff\1\52\1\u03a5\1\uffff\10\52\1\uffff"+
		"\2\u0133\31\52\1\uffff\30\52\1\u023d\1\u0245\4\uffff\7\52\1\uffff\1\52"+
		"\1\u01fb\11\52\1\uffff\10\52\1\u03f4\13\52\1\u03fe\2\52\1\uffff\1\52\1"+
		"\uffff\1\u0400\15\52\1\u040c\10\52\1\uffff\20\52\1\uffff\6\52\1\u0423"+
		"\5\52\1\uffff\6\52\1\uffff\3\52\1\u042f\1\52\34\uffff\1\52\1\uffff\1\52"+
		"\1\uffff\7\52\1\u0459\33\52\1\u0473\20\52\1\uffff\1\52\1\u0485\1\u0486"+
		"\4\52\1\uffff\16\52\1\u0496\1\uffff\11\52\1\uffff\1\52\1\uffff\2\52\1"+
		"\u049f\10\52\1\uffff\6\52\1\u035d\6\52\1\u04ae\10\52\1\uffff\4\52\1\u04b8"+
		"\4\52\1\u04bc\1\52\1\uffff\1\52\37\uffff\11\52\1\uffff\1\u04e5\4\52\1"+
		"\u04ea\23\52\1\uffff\6\52\1\u04fc\6\52\1\u01fb\1\u0503\2\52\2\uffff\2"+
		"\52\1\uffff\13\52\1\u01fb\1\uffff\2\52\1\u01fb\3\52\1\u0513\1\52\1\uffff"+
		"\15\52\1\u01fb\1\uffff\1\u051e\2\52\1\u0521\1\u0522\1\u0523\3\52\1\uffff"+
		"\1\u0525\2\52\1\uffff\2\52\33\uffff\1\u054a\3\uffff\5\52\1\uffff\1\u0133"+
		"\1\uffff\4\52\1\uffff\2\52\1\u0552\6\52\1\uffff\2\52\1\u035d\1\52\1\uffff"+
		"\2\52\1\uffff\1\52\1\uffff\4\52\1\uffff\14\52\1\u0567\2\52\1\uffff\2\52"+
		"\1\u056c\1\52\1\u056e\1\u056f\1\52\1\u01fb\1\52\1\u0572\1\uffff\2\52\3"+
		"\uffff\1\52\1\uffff\1\u0575\2\52\34\uffff\3\52\1\uffff\1\52\4\uffff\4"+
		"\52\1\uffff\15\52\1\u05a4\6\52\1\uffff\1\52\1\u05a9\2\52\1\uffff\1\52"+
		"\2\uffff\2\52\1\uffff\1\u05ae\1\u05af\1\uffff\1\u05b0\1\52\32\uffff\3"+
		"\52\3\uffff\1\u05ce\1\u05cf\1\u05d0\4\52\1\u05d5\4\52\1\uffff\4\52\1\uffff"+
		"\1\u05dc\3\52\32\uffff\3\52\6\uffff\1\52\1\u035d\1\52\1\u01fb\1\uffff"+
		"\1\u01fb\2\52\1\u05f9\2\52\1\uffff\1\52\22\uffff\3\52\2\uffff\1\52\1\uffff"+
		"\2\52\2\uffff\1\u0615\21\uffff\1\u0626\1\52\1\u0628\2\uffff\2\52\1\u03dc"+
		"\15\uffff\1\u0636\4\uffff\1\52\3\uffff\1\u063c\16\uffff\1\52\14\uffff"+
		"\1\52\12\uffff\1\52\11\uffff\1\52\6\uffff\1\u0669\24\uffff";
	static final String DFA67_eofS =
		"\u0678\uffff";
	static final String DFA67_minS =
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
		"\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\106\1\151\1\111\1\uffff\1"+
		"\144\1\104\1\163\1\123\1\154\1\162\1\141\1\122\1\105\1\141\1\150\1\40"+
		"\1\145\1\160\2\40\1\111\1\164\1\105\1\151\1\163\1\151\1\72\1\uffff\2\60"+
		"\1\uffff\4\11\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1\131\1\101"+
		"\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156\1\141\1\11"+
		"\1\141\1\143\1\154\1\172\1\141\1\143\1\152\1\164\3\145\1\156\1\141\1\162"+
		"\1\163\2\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\11\1\156\1\11"+
		"\1\144\1\141\1\145\1\40\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160"+
		"\1\141\1\163\1\143\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\1\40"+
		"\1\163\1\142\1\41\1\145\1\154\1\40\1\163\1\103\1\150\1\171\1\131\1\156"+
		"\1\40\2\156\1\40\1\157\1\141\1\40\2\145\1\116\1\40\2\156\1\40\1\141\1"+
		"\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145\1\40\1\145\1\41\1"+
		"\154\1\156\1\41\1\147\1\157\1\40\1\157\1\11\1\145\1\150\1\141\1\145\1"+
		"\147\1\0\20\11\1\163\1\11\1\0\1\145\1\40\1\156\1\145\1\163\1\145\1\154"+
		"\1\101\1\uffff\2\46\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141"+
		"\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\111\1\123"+
		"\1\131\1\104\1\141\1\uffff\1\156\1\105\1\141\1\101\1\144\1\104\2\141\1"+
		"\164\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\150\1\123\1\164"+
		"\1\150\1\164\1\40\1\55\1\46\5\11\1\40\1\146\1\145\1\163\1\165\2\54\1\uffff"+
		"\1\157\1\40\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\0\1"+
		"\156\1\141\1\151\1\145\1\154\1\145\1\151\1\40\1\11\1\144\1\162\1\147\1"+
		"\156\1\40\2\145\1\40\1\157\1\143\1\40\1\11\1\40\1\162\1\0\1\40\1\0\1\11"+
		"\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\157\1\162\1\40"+
		"\1\11\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163\1\145"+
		"\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162\1\163\1\107\1\uffff"+
		"\1\40\1\144\1\156\1\163\1\156\1\157\1\11\2\157\1\156\1\162\1\156\1\uffff"+
		"\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156\1\11\1\165\34"+
		"\11\1\143\1\0\1\141\1\uffff\1\145\1\166\2\151\1\154\2\122\1\11\1\144\1"+
		"\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162\1\40\1\54\1"+
		"\150\1\164\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\171\1\131\1\141"+
		"\1\101\1\11\1\156\1\151\1\116\1\131\1\141\1\144\1\164\1\151\1\107\1\162"+
		"\1\104\1\172\1\151\1\171\2\60\1\uffff\1\60\2\11\1\164\1\162\1\11\1\165"+
		"\1\101\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156\1\141"+
		"\1\154\1\151\1\144\1\11\1\0\1\40\1\157\1\164\2\40\1\162\1\40\1\165\1\153"+
		"\1\0\1\40\1\0\1\171\1\163\1\11\1\164\1\156\1\162\1\141\1\165\3\40\1\0"+
		"\1\157\1\156\1\141\1\156\1\40\1\143\1\41\1\156\1\40\1\141\1\40\1\156\1"+
		"\145\1\11\1\145\1\40\1\151\1\40\1\145\1\144\1\162\1\153\1\0\1\162\1\40"+
		"\1\144\1\147\1\11\1\156\1\163\1\145\1\40\1\11\1\151\1\0\1\145\37\11\1"+
		"\56\1\156\1\40\1\145\1\141\1\154\2\40\1\60\1\0\1\11\1\171\1\162\1\150"+
		"\1\155\1\11\1\144\1\156\1\163\2\40\2\144\1\40\1\141\1\107\1\101\1\131"+
		"\3\40\2\54\1\171\1\131\1\0\1\40\1\154\2\40\1\156\1\141\1\11\1\162\1\40"+
		"\1\157\1\101\1\143\1\162\1\41\1\46\2\60\2\0\2\145\1\uffff\2\156\1\141"+
		"\1\154\1\124\1\163\2\40\1\156\1\154\1\141\1\41\1\0\1\156\1\157\1\41\1"+
		"\156\2\40\1\11\1\40\1\0\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1\150"+
		"\2\164\1\144\1\41\1\0\1\11\1\143\1\40\3\11\2\40\1\145\1\0\1\11\1\145\1"+
		"\40\1\0\1\141\1\163\37\11\2\40\1\162\1\156\1\145\1\uffff\1\46\1\0\1\54"+
		"\1\153\2\40\1\0\2\40\1\11\1\163\1\40\1\153\1\40\1\113\1\54\1\uffff\2\54"+
		"\1\41\1\151\1\uffff\1\145\1\171\1\0\1\145\1\uffff\1\165\1\131\1\165\1"+
		"\145\1\uffff\1\55\1\162\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40\1"+
		"\145\1\156\1\11\1\156\1\144\1\0\1\146\1\145\1\11\1\164\2\11\1\145\1\41"+
		"\1\145\1\11\1\0\1\40\1\156\3\0\1\162\1\0\1\11\1\156\1\145\34\11\1\163"+
		"\1\141\1\154\1\46\1\151\1\0\3\11\1\163\1\40\1\162\1\145\1\0\1\150\1\145"+
		"\1\105\1\164\1\162\1\54\1\144\1\147\1\54\1\151\1\40\1\60\1\40\1\11\1\40"+
		"\1\156\1\116\1\150\1\162\1\40\1\0\1\40\1\11\1\146\1\40\1\0\1\145\2\0\1"+
		"\162\1\144\1\0\2\11\1\0\1\11\1\40\32\11\1\143\1\162\1\141\6\11\1\151\1"+
		"\163\1\123\1\171\1\11\1\40\1\150\1\156\1\60\1\0\1\144\1\107\1\145\1\40"+
		"\1\0\1\11\1\144\2\40\3\0\27\11\1\157\1\164\1\143\3\11\3\0\1\162\1\41\1"+
		"\40\1\41\1\0\1\41\1\164\1\60\1\11\1\40\1\162\1\0\1\40\22\11\1\142\1\151"+
		"\1\153\2\11\1\145\1\uffff\1\154\1\60\1\0\1\uffff\22\11\1\41\1\55\1\41"+
		"\2\11\1\40\1\151\1\46\1\0\14\11\1\46\3\11\1\0\1\103\1\0\15\11\1\0\3\11"+
		"\1\157\1\11\1\0\12\11\1\154\12\11\1\157\11\11\1\162\6\11\1\41\5\11\1\0"+
		"\16\11";
	static final String DFA67_maxS =
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
		"\1\120\1\101\1\122\1\164\1\126\1\151\1\111\1\uffff\1\144\1\104\1\163\1"+
		"\123\1\154\1\162\1\141\1\122\1\105\1\141\1\150\1\40\1\145\1\160\1\150"+
		"\1\40\1\111\1\164\1\105\1\151\1\163\1\151\1\72\1\uffff\2\71\1\uffff\1"+
		"\71\1\u2019\1\71\1\u2019\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1"+
		"\131\1\127\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156"+
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
		"\157\1\141\1\170\1\171\2\163\1\111\1\123\1\131\1\104\1\141\1\uffff\1\156"+
		"\1\105\1\141\1\101\1\144\1\104\2\141\1\164\1\101\1\124\1\162\1\40\1\163"+
		"\1\145\1\141\1\116\1\150\1\123\1\164\1\150\1\164\1\40\1\71\2\u2019\1\71"+
		"\1\51\1\u2019\1\51\1\40\1\146\1\145\1\163\1\165\2\54\1\uffff\1\157\1\u2019"+
		"\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\0\1\156\1\141"+
		"\1\151\1\145\1\154\1\145\1\151\1\40\1\u2019\1\144\1\162\1\147\1\156\1"+
		"\40\2\145\1\163\1\157\1\143\1\40\1\u2019\1\40\1\162\1\0\1\40\1\0\1\u2019"+
		"\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\157\1\162\1\40"+
		"\1\u2019\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1\163\1"+
		"\145\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\164\1\162\1\163\1\107\1"+
		"\uffff\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019\2\157\1\156\1\162\1"+
		"\156\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156\1"+
		"\u2019\1\165\2\71\32\u2019\1\143\1\0\1\141\1\uffff\1\145\1\166\2\151\1"+
		"\154\2\122\1\u2019\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154"+
		"\1\151\2\162\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1\147"+
		"\1\122\1\171\1\131\1\141\1\101\1\u2019\1\156\1\151\1\116\1\131\1\141\1"+
		"\144\1\164\1\151\1\107\1\162\1\104\1\172\1\151\1\171\2\71\1\uffff\1\71"+
		"\2\u2019\1\164\1\162\1\40\1\165\1\127\1\40\1\141\1\40\1\164\1\144\1\122"+
		"\1\156\1\145\1\40\1\156\1\141\1\154\1\151\1\144\1\u2019\1\0\1\40\1\157"+
		"\1\164\2\40\1\162\1\40\1\165\1\153\1\0\1\163\1\0\1\171\1\163\1\u2019\1"+
		"\164\1\156\1\162\1\141\1\165\3\40\1\0\1\157\1\156\1\141\1\156\1\40\1\143"+
		"\1\u2019\1\156\1\40\1\141\1\40\1\156\1\145\1\u2019\1\145\1\40\1\151\1"+
		"\40\1\145\1\144\1\162\1\153\1\0\1\162\1\40\1\144\1\147\1\u2019\1\156\1"+
		"\163\1\145\1\40\1\u2019\1\151\1\0\1\145\37\u2019\1\56\1\156\1\40\1\145"+
		"\1\141\1\154\2\40\1\71\1\0\1\u2019\1\171\1\162\1\150\1\155\1\u2019\1\144"+
		"\1\156\1\163\2\40\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1\171\1"+
		"\131\1\0\1\163\1\154\2\40\1\156\1\141\1\u2019\1\162\1\40\1\157\1\101\1"+
		"\143\1\162\2\u2019\1\73\1\71\2\0\2\145\1\uffff\2\156\1\141\1\154\1\124"+
		"\1\163\2\40\1\156\1\154\1\141\1\u2019\1\0\1\156\1\157\1\u2019\1\156\2"+
		"\40\1\u2019\1\40\1\0\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1\150\2\164"+
		"\1\144\1\u2019\1\0\1\u2019\1\143\1\40\3\u2019\2\40\1\145\1\0\1\u2019\1"+
		"\145\1\40\1\0\1\141\1\163\37\u2019\2\40\1\162\1\156\1\145\1\uffff\1\u2019"+
		"\1\0\1\54\1\153\2\40\1\0\2\40\1\u2019\1\163\1\40\1\153\1\40\1\113\1\54"+
		"\1\uffff\2\54\1\u2019\1\151\1\uffff\1\145\1\171\1\0\1\145\1\uffff\1\165"+
		"\1\131\1\165\1\145\1\uffff\1\55\1\162\1\40\1\144\1\40\1\156\1\141\1\111"+
		"\1\143\1\40\1\145\1\156\1\u2019\1\156\1\144\1\0\1\146\1\145\1\u2019\1"+
		"\164\2\u2019\1\145\1\u2019\1\145\1\u2019\1\0\1\40\1\156\3\0\1\162\1\0"+
		"\1\u2019\1\156\1\145\26\u2019\1\51\5\u2019\1\163\1\141\1\154\1\u2019\1"+
		"\151\1\0\3\u2019\1\163\1\40\1\162\1\145\1\0\1\150\1\145\1\105\1\164\1"+
		"\162\1\54\1\144\1\147\1\54\1\151\1\40\1\71\1\40\1\u2019\1\40\1\156\1\116"+
		"\1\150\1\162\1\40\1\0\1\40\1\u2019\1\146\1\40\1\0\1\145\2\0\1\162\1\144"+
		"\1\0\2\u2019\1\0\1\u2019\1\40\32\u2019\1\143\1\162\1\141\6\u2019\1\151"+
		"\1\163\1\123\1\171\1\u2019\1\40\1\150\1\156\1\71\1\0\1\144\1\107\1\145"+
		"\1\40\1\0\1\u2019\1\144\2\40\3\0\27\u2019\1\157\1\164\1\143\3\u2019\3"+
		"\0\1\162\1\u2019\1\40\1\u2019\1\0\1\u2019\1\164\1\71\1\u2019\1\40\1\162"+
		"\1\0\1\40\22\u2019\1\142\1\151\1\153\2\u2019\1\145\1\uffff\1\154\1\71"+
		"\1\0\1\uffff\23\u2019\1\55\3\u2019\1\40\1\151\1\u2019\1\0\20\u2019\1\0"+
		"\1\103\1\0\15\u2019\1\0\3\u2019\1\157\1\u2019\1\0\12\u2019\1\154\12\u2019"+
		"\1\157\11\u2019\1\162\14\u2019\1\0\16\u2019";
	static final String DFA67_acceptS =
		"\33\uffff\1\15\2\uffff\2\26\1\27\11\uffff\1\26\76\uffff\1\2\73\uffff\1"+
		"\23\1\uffff\1\15\3\uffff\1\25\1\22\7\uffff\1\14\176\uffff\1\10\34\uffff"+
		"\1\6\u00aa\uffff\1\5\51\uffff\1\4\27\uffff\1\11\2\uffff\1\20\4\uffff\1"+
		"\24\u0097\uffff\1\16\33\uffff\1\4\45\uffff\1\1\75\uffff\1\3\20\uffff\1"+
		"\4\14\uffff\1\12\53\uffff\1\7\64\uffff\1\17\u00ac\uffff\1\21\131\uffff"+
		"\1\4\20\uffff\1\4\4\uffff\1\4\4\uffff\1\4\4\uffff\1\13\u00f2\uffff\1\4"+
		"\3\uffff\1\4\175\uffff";
	static final String DFA67_specialS =
		"\1\130\16\uffff\1\154\23\uffff\1\73\1\13\1\171\1\u00ab\45\uffff\1\166"+
		"\1\u00a7\145\uffff\1\u0084\1\uffff\1\u00ac\4\uffff\1\u00ad\60\uffff\1"+
		"\15\1\uffff\1\170\13\uffff\1\u0099\54\uffff\1\137\3\uffff\1\26\50\uffff"+
		"\1\u008e\46\uffff\1\u00a8\1\172\5\uffff\1\u00a6\50\uffff\1\14\1\51\2\uffff"+
		"\1\174\6\uffff\1\u0087\11\uffff\1\155\15\uffff\1\u009e\47\uffff\1\u00b9"+
		"\1\u0096\2\uffff\1\42\26\uffff\1\10\2\uffff\1\1\1\3\15\uffff\1\u0089\16"+
		"\uffff\1\47\2\uffff\1\u00aa\44\uffff\1\u00f2\21\uffff\1\u00f0\6\uffff"+
		"\1\40\1\uffff\1\33\3\uffff\1\23\2\uffff\1\117\3\uffff\1\164\14\uffff\1"+
		"\32\5\uffff\1\161\6\uffff\1\u009f\2\uffff\1\115\6\uffff\1\50\2\uffff\1"+
		"\143\3\uffff\1\u0095\6\uffff\1\u00ed\7\uffff\1\u0083\1\uffff\1\145\5\uffff"+
		"\1\u00b8\21\uffff\1\136\1\u00b7\13\uffff\1\20\10\uffff\1\11\1\uffff\1"+
		"\7\32\uffff\1\u00a3\42\uffff\1\104\1\uffff\1\u00ba\7\uffff\1\135\1\5\4"+
		"\uffff\1\147\2\uffff\1\150\2\uffff\1\u009d\1\24\1\112\1\uffff\1\u00bb"+
		"\1\124\1\u00bc\1\37\4\uffff\1\173\7\uffff\1\u0081\1\43\3\uffff\1\153\1"+
		"\uffff\1\152\7\uffff\1\u009a\2\uffff\1\u0094\1\u00a0\1\u00a2\7\uffff\1"+
		"\u008a\5\uffff\1\u0090\7\uffff\1\u00ae\2\uffff\1\u00b0\1\uffff\1\u00bd"+
		"\1\uffff\1\34\1\uffff\1\141\36\uffff\1\u00be\11\uffff\1\123\14\uffff\1"+
		"\56\16\uffff\1\175\22\uffff\1\100\1\76\5\uffff\1\u00a4\1\uffff\1\u00a9"+
		"\5\uffff\1\111\5\uffff\1\6\1\u00bf\1\132\2\uffff\1\u008d\1\144\1\uffff"+
		"\1\142\2\uffff\1\u00c0\1\u00a1\1\u00c1\2\uffff\1\31\5\uffff\1\u00f3\1"+
		"\u0085\1\u0086\1\u00c2\4\uffff\1\60\3\uffff\1\4\1\uffff\1\u008f\2\uffff"+
		"\1\66\1\uffff\1\u0091\1\uffff\1\u0093\4\uffff\1\u00c3\1\uffff\1\u00eb"+
		"\2\uffff\1\77\3\uffff\1\35\1\146\1\uffff\1\u00c4\42\uffff\1\22\3\uffff"+
		"\1\17\2\uffff\1\u00c5\1\125\4\uffff\1\122\3\uffff\1\0\1\61\2\uffff\1\55"+
		"\4\uffff\1\113\1\54\1\u0088\4\uffff\1\u00c6\1\67\5\uffff\1\163\1\uffff"+
		"\1\52\10\uffff\1\u00c7\1\u00c8\11\uffff\1\105\1\151\4\uffff\1\u00c9\4"+
		"\uffff\1\116\1\126\1\36\1\121\1\u00ca\1\uffff\1\176\1\u0080\5\uffff\1"+
		"\156\5\uffff\1\u00cb\1\65\1\uffff\1\u0098\1\u0097\1\71\1\74\1\u00ea\1"+
		"\u00ec\1\uffff\1\u00cc\1\107\1\uffff\1\u00af\1\u00cd\35\uffff\1\64\3\uffff"+
		"\1\u009c\1\27\5\uffff\1\u00ce\2\uffff\1\u00a5\1\16\1\u00cf\1\12\1\u00ee"+
		"\1\114\1\uffff\1\62\1\uffff\1\u008c\12\uffff\1\u00d0\11\uffff\1\177\1"+
		"\uffff\1\57\4\uffff\1\102\2\uffff\1\2\2\uffff\1\u00d1\2\uffff\1\41\1\uffff"+
		"\1\44\1\53\3\uffff\1\70\1\u00d2\1\u0092\1\uffff\1\u00d3\1\u00d4\1\u00d5"+
		"\1\uffff\1\u00d6\1\110\43\uffff\1\u00d7\4\uffff\1\21\2\uffff\1\u00d8\12"+
		"\uffff\1\45\1\uffff\1\u00ef\1\106\1\u00f4\4\uffff\1\162\1\u00d9\1\134"+
		"\1\25\1\uffff\1\167\1\u00da\1\uffff\1\u00db\1\u00dc\2\uffff\1\u00dd\1"+
		"\72\1\75\1\u00de\1\140\1\120\40\uffff\1\131\1\133\1\127\4\uffff\1\165"+
		"\1\46\3\uffff\1\u00df\3\uffff\1\103\1\u00e0\1\30\1\uffff\1\157\1\u009b"+
		"\1\u00e1\1\u00e2\1\u00e3\35\uffff\1\u00e4\1\u00e5\1\u00e6\4\uffff\1\u00e7"+
		"\3\uffff\1\101\1\u008b\1\uffff\1\u00e8\1\u0082\33\uffff\1\u00e9\1\uffff"+
		"\1\u00f1\26\uffff\1\63\2\uffff\1\u00b6\20\uffff\1\u00b5\1\uffff\1\u00b4"+
		"\2\uffff\1\160\12\uffff\1\u00b3\5\uffff\1\u00b2\54\uffff\1\u00b1\16\uffff}>";
	static final String[] DFA67_transitionS = {
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
			"\1\u0225",
			"\1\u027b",
			"\1\u027c",
			"\1\151",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\151",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\151",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u0290\17\uffff\1\u028f",
			"\1\u0291",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\1\151",
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
			"\1\u02ad",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\22\52\1\u02b6\7\52\u1f9e\uffff\1\52",
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
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\4\uffff\2\52\2\uffff\1\52\1\u02c2\12\52\5\uffff\1\u02c3\1\u02c4"+
			"\1\u02c5\1\52\1\u02c6\1\u02c7\1\u02c8\1\52\1\u02c9\1\52\1\u02ca\1\u02cb"+
			"\1\u02cc\1\u02cd\3\52\1\u02ce\1\u02cf\1\u02d0\2\52\1\u02d1\3\52\4\uffff"+
			"\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u02d2",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\12\52\1\u02d3\7\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u02d5",
			"",
			"\1\u02d6",
			"\1\u02d7",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\2\u02dd\2\uffff\1\u02dd\22\uffff\1\u02dd",
			"\12\u02de",
			"\12\u02df",
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
			"\1\151",
			"\1\u02ea",
			"\1\u02eb",
			"\1\151",
			"\1\151",
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
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\151\17\uffff\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"",
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
			"\1\151",
			"\1\u0307",
			"\1\u0308",
			"\1\151\107\uffff\1\u0309",
			"\1\u01fb",
			"\1\u030a",
			"\1\u030b",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"",
			"\12\u0311",
			"\12\u0312",
			"",
			"\2\u016f\2\uffff\1\u016f\22\uffff\1\u016f\10\uffff\1\u0313\6\uffff\12"+
			"\u0314",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0315\4\uffff\2\u0242\1"+
			"\uffff\1\u0173\2\uffff\2\u0242\1\u0315\13\uffff\2\u0242\3\uffff\1\u0315"+
			"\37\uffff\1\u0242\1\uffff\32\u0242\u1f9e\uffff\1\u0242",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\10\uffff\1\u0173\6\uffff\12"+
			"\u0243",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0317\4\uffff\2\u0316\1"+
			"\uffff\1\u0173\2\uffff\2\u0316\1\u0317\13\uffff\2\u0316\3\uffff\1\u0317"+
			"\1\uffff\32\u0316\4\uffff\1\u0316\1\uffff\32\u0316\u1f9e\uffff\1\u0316",
			"",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\3\u01fb\1\uffff\1\u01fb\1\uffff\1\u01fb\1\uffff\2\u031f\3\uffff\3\u01fb"+
			"\2\uffff\1\u031f\1\uffff\3\u01fb",
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
			"\1\u032a",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u032c",
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
			"\1\151",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0344",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0346",
			"\1\u0347",
			"\1\u0348",
			"\1\151",
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
			"\1\u0351",
			"\1\u0352",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359",
			"\1\151\122\uffff\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u035e",
			"\1\u035f",
			"\1\151",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\1\u0364",
			"\1\u0365",
			"\1\151",
			"\1\u0366",
			"\1\u0367",
			"\1\151\104\uffff\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\1\u02dd",
			"\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\151",
			"\1\u0371",
			"\1\u0372",
			"\1\u0373",
			"\1\151",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\151",
			"\1\u037a",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u037c",
			"\1\u037d",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u037e",
			"\1\u037f",
			"\1\151\122\uffff\1\u0380",
			"\1\u0381",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0383",
			"\1\u0384",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\1\52\10\uffff\1\52\6\uffff\3\52\1\u0388"+
			"\1\52\1\u0389\4\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u038a\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u038c\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\16\52\1\u038b\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u038d\3\52\1\u038e\2\52\1\u038f\5\52\1\u0390\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0391\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0392\2\52\1\u0393\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0394\11\52\1\u0395\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0396\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0397\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0398"+
			"\15\52\1\u0399\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u039a\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u039b\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u039c\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u039d\6\52\1\u039e\1\u039f\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u03a0\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u03a1\2\52\1\u03a2\1\u03a3\21\52\u1f9e\uffff\1\52",
			"\1\u03a4",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"",
			"\3\52\3\uffff\2\u0134\1\52\1\uffff\12\u02de\1\52\1\u0135\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\2\u03ae\1\52\1\uffff\12\u02df\1\52\1\u0135\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u03af",
			"\1\u03b0",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\151",
			"\1\u03b7",
			"\1\151",
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
			"",
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
			"\1\151",
			"\1\u03d1",
			"\1\u03d2",
			"\1\u03d3",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u03d6",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9",
			"\1\u0133",
			"\1\u03da\2\uffff\12\u0311",
			"\3\52\3\uffff\1\52\1\u03db\1\52\1\uffff\12\u0312\1\52\1\u00a4\5\uffff"+
			"\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\u03dc\2\uffff\1\u03dc\22\uffff\1\u03dc\5\uffff\3\52\3\uffff\3\52"+
			"\1\uffff\12\u03dd\2\52\5\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e"+
			"\uffff\1\52",
			"\2\u016f\2\uffff\1\u016f\22\uffff\1\u016f\10\uffff\1\u0170\6\uffff\12"+
			"\u0314",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\10\uffff\1\u0173",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\1\u0317\4\uffff\2\u0316\1"+
			"\uffff\1\u0173\2\uffff\2\u0316\1\u0317\13\uffff\2\u0316\3\uffff\1\u0317"+
			"\1\uffff\32\u0316\4\uffff\1\u0316\1\uffff\32\u0316\u1f9e\uffff\1\u0316",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\10\uffff\1\u0173",
			"\1\u031f",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0",
			"\1\u03e1",
			"\1\u03e2",
			"\1\u03e2",
			"",
			"\1\u03e3",
			"\1\u03e4\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u03e5",
			"\1\u03e6",
			"\1\u03e7",
			"\1\u03e8",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"\1\151",
			"\1\u03ec",
			"\1\uffff",
			"\1\u03ed",
			"\1\u03ee",
			"\1\u03ef",
			"\1\u03f0",
			"\1\u03f1",
			"\1\u03f2",
			"\1\u03f3",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u03f5",
			"\1\u03f6",
			"\1\u03f7",
			"\1\u03f8",
			"\1\151",
			"\1\u03f9",
			"\1\u03fa",
			"\1\151\122\uffff\1\u03fb",
			"\1\u03fc",
			"\1\u03fd",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u03ff",
			"\1\uffff",
			"\1\151",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\1\151",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\1\u040a",
			"\1\u040b",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u040d",
			"\1\u040e",
			"\1\u040f",
			"\1\151",
			"\1\u0410",
			"\1\151",
			"\1\u0411",
			"\1\u0412",
			"",
			"\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"\1\151",
			"\1\u03e2",
			"\1\u03e2",
			"\1\151",
			"\1\151",
			"\1\151",
			"\1\u0417",
			"\1\u0418",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\1\u041c",
			"",
			"\1\151",
			"\1\u041d",
			"\1\u041e",
			"\1\u041f",
			"\1\u0420",
			"\1\u0421",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\16\52\1\u0422\3\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0424",
			"\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"\1\u0428",
			"",
			"\1\u0429",
			"\1\151",
			"\1\u042a",
			"\1\u042b",
			"\1\151",
			"\1\u042c",
			"\1\uffff",
			"\1\u042d",
			"\1\151",
			"\1\u042e",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0430",
			"\2\52\2\uffff\1\52\22\uffff\1\u0431\10\uffff\1\52\6\uffff\12\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0432\10\uffff\1\52\6\uffff\12\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0433\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u0434\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\1\u0435\1\52\4\uffff\2\52\2"+
			"\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0436\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u0437\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u0438\10\52\1\u0439\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u043a\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u043b\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u043c\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u043d"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u043e\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u043f\5\52\1\u0440\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0441\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u0442\27\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\52"+
			"\1\u0443\30\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0444\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0445\4\52\1\u0446\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\25"+
			"\52\1\u0447\4\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u0448\5\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0449\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u044a"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u044b\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u044c\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u044d\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u044e\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u044f\10\52\u1f9e\uffff\1\52",
			"\1\u0450",
			"\1\uffff",
			"\1\u0451",
			"",
			"\1\u0452",
			"\1\u0453",
			"\1\u0454",
			"\1\u0455",
			"\1\u0456",
			"\1\u0457",
			"\1\u0458",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\u045d",
			"\1\u045e",
			"\1\u045f",
			"\1\u0460",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463\3\uffff\1\u0464",
			"\1\u0465",
			"\1\u0466",
			"\1\151",
			"\1\u03e2",
			"\1\u0467",
			"\1\u0468",
			"\1\u0469",
			"\1\u046a",
			"\1\u03e2",
			"\1\u046b",
			"\1\u046c",
			"\1\u046d",
			"\1\u046e",
			"\1\u046f",
			"\1\u0470",
			"\1\u0471",
			"\1\u0472",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0474",
			"\1\u0475",
			"\1\u0476",
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
			"\12\u0482",
			"\12\u0483",
			"",
			"\12\u0484",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0487",
			"\1\u0488",
			"\2\u0489\2\uffff\1\u0489\22\uffff\1\u0489",
			"\1\u048a",
			"\3\u01fb\1\uffff\1\u01fb\1\uffff\1\u01fb\1\uffff\2\u031f\3\uffff\3\u01fb"+
			"\2\uffff\1\u031f\1\uffff\3\u01fb",
			"\1\151",
			"\1\u048b",
			"\1\151",
			"\1\u048c",
			"\1\u048d",
			"\1\u048e",
			"\1\u048f",
			"\1\u0490",
			"\1\151",
			"\1\u0491",
			"\1\u0492",
			"\1\u0493",
			"\1\u0494",
			"\1\u0495",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\151",
			"\1\u0497",
			"\1\u0498",
			"\1\151",
			"\1\151",
			"\1\u0499",
			"\1\151",
			"\1\u049a",
			"\1\u049b",
			"\1\uffff",
			"\1\151\122\uffff\1\u049c",
			"\1\uffff",
			"\1\u049d",
			"\1\u049e",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04a0",
			"\1\u04a1",
			"\1\u04a2",
			"\1\u04a3",
			"\1\u04a4",
			"\1\151",
			"\1\151",
			"\1\151",
			"\1\uffff",
			"\1\u04a5",
			"\1\u04a6",
			"\1\u04a7",
			"\1\u04a8",
			"\1\151",
			"\1\u04a9",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u04aa",
			"\1\151",
			"\1\u04ab",
			"\1\151",
			"\1\u04ac",
			"\1\u04ad",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04af",
			"\1\u036e",
			"\1\u04b0",
			"\1\151",
			"\1\u04b1",
			"\1\u04b2",
			"\1\u04b3",
			"\1\u04b4",
			"\1\uffff",
			"\1\u04b5",
			"\1\151",
			"\1\u04b6",
			"\1\u04b7",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04b9",
			"\1\u04ba",
			"\1\u04bb",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04bd",
			"\1\uffff",
			"\1\u04be",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\10\52\1\u04bf\21\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\10\52\1\u04c0\21\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u04c1\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u04c2\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u04c3\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\37\uffff\1\52\1\uffff\32\52\u1f9e"+
			"\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04c4\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u04c5\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u04c6\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u04c7\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04c8\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04c9\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u04ca\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u04cb\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\14"+
			"\52\1\u04cc\15\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u04cd\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u04ce\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04cf\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u04d0\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u04d1\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u04d2\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u04d3\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u04d4\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u04d5"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u04d6\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u04d7\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u04d8\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04d9\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u04db\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u04dc\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u04dd\25\52\u1f9e\uffff\1\52",
			"\1\u04de",
			"\1\u04df",
			"\1\151",
			"\1\u04e0",
			"\1\u04e1",
			"\1\u04e2",
			"\1\151",
			"\1\u04e3",
			"\12\u04e4",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04e6",
			"\1\u04e7",
			"\1\u04e8",
			"\1\u04e9",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04eb",
			"\1\u04ec",
			"\1\u04ed",
			"\1\151",
			"\1\151",
			"\1\u04ee",
			"\1\u04ef",
			"\1\151",
			"\1\u04f0",
			"\1\u04f1",
			"\1\u04f2",
			"\1\u04f3",
			"\1\151",
			"\1\151",
			"\1\u04f4",
			"\1\u03e2",
			"\1\u03e2",
			"\1\u04f5",
			"\1\u04f6",
			"\1\uffff",
			"\1\151\122\uffff\1\u04f7",
			"\1\u04f8",
			"\1\u04f9",
			"\1\u037b",
			"\1\u04fa",
			"\1\u04fb",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u04fd",
			"\1\u04fe",
			"\1\u04ff",
			"\1\u0500",
			"\1\u0501",
			"\1\u0502",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\3\52\1\uffff\12\u0482\2\52\5\uffff\32\52\4\uffff\1\52"+
			"\1\uffff\32\52\u1f9e\uffff\1\52",
			"\12\u0483\1\uffff\1\u00a4",
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
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
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
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u051f",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\4\52\1\u0520\15\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\151",
			"\1\u0524",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
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
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7"+
			"\52\1\u054d\22\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\151",
			"\1\u054e",
			"\1\u054f",
			"\1\u0550",
			"",
			"\3\52\3\uffff\2\u03ae\1\52\1\uffff\12\u04e4\1\52\1\u0135\5\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u03e2",
			"\1\u0551",
			"\1\151",
			"\1\151",
			"\1\uffff",
			"\1\151",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0553",
			"\1\151",
			"\1\u0554",
			"\1\u04fe",
			"\1\u0555",
			"\1\u03e2",
			"",
			"\1\u03e2",
			"\1\u03e2",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0556",
			"",
			"\1\u0557",
			"\1\u0558",
			"\1\uffff",
			"\1\u0559",
			"",
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
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0568",
			"\1\u0569",
			"\1\uffff",
			"\1\u056a",
			"\1\u056b",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u056d",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u0570",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0571",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\151",
			"\1\u0573",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0574",
			"\1\uffff",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
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
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
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
			"\2\52\2\uffff\1\52\22\uffff\1\u0587\1\52\4\uffff\2\52\1\uffff\1\u04da"+
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
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
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
			"\1\u02d2",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\1\u0596\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
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
			"\1\u03e2",
			"\1\u05a0",
			"\1\u05a1",
			"\1\u03e2",
			"\1\u05a2",
			"\1\151",
			"\12\u05a3",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u05a5",
			"\1\u05a6",
			"\1\u05a7",
			"\1\u05a8",
			"\1\151",
			"\1\uffff",
			"\1\151",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u05aa",
			"\1\151",
			"\1\uffff",
			"\1\u05ab",
			"\1\uffff",
			"\1\uffff",
			"\1\u05ac",
			"\1\u05ad",
			"\1\uffff",
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
			"\1\u05b1\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u05b2\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05b3"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
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
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
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
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
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
			"\2\52\2\uffff\1\52\22\uffff\1\u05c6\1\52\4\uffff\2\52\1\uffff\1\u04da"+
			"\2\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1"+
			"\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u05c7\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
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
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u05d1",
			"\1\u05d2",
			"\1\u05d3",
			"\1\u05d4",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
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
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u05dd",
			"\1\151",
			"\1\151",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u05de\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05df"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u05e0\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u05e1\1\52\4\uffff\2\52\1\uffff\1\u04da"+
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
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
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
			"\52\1\u0446\7\52\u1f9e\uffff\1\52",
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
			"\1\u05f6",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\52\4\uffff\3\52\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\32"+
			"\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u05f7",
			"\12\u05f8",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\1\u05fa",
			"\1\u05fb",
			"\1\uffff",
			"\1\151",
			"\2\52\2\uffff\1\52\22\uffff\1\u05fc\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u05fd\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u05fe"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\2\52\1\u05ff\17\52\1\u0600\7\52\4\uffff\1\52\1\uffff\32\52"+
			"\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0601\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0602\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0603\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0604\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0605\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0606\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0607\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0608\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0609\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u060a\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u060b\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u060c\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u060d",
			"\1\u060e",
			"\1\u060f",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0610\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0611\25\52\u1f9e\uffff\1\52",
			"\1\u0612",
			"",
			"\1\u0613",
			"\12\u0614",
			"\1\uffff",
			"",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\26\52\1\u0616\3\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0617\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0618\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0619\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\17"+
			"\52\1\u061a\12\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u061b\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u061c\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u061d\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u061e\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u061f\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0620\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u0622\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u0621\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u0623\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0624\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0625"+
			"\31\52\u1f9e\uffff\1\52",
			"\1\52\4\uffff\2\52\1\u0548\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01f8\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\1\u0627",
			"\1\52\4\uffff\2\52\1\u0548\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01f8\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0629\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u062a\26\52\u1f9e\uffff\1\52",
			"\1\151",
			"\1\u062b",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u062c"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u062d\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u062e\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u062f\27\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0630\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u0631\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0632\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0633\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\1\u0634\31\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0635\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u0622\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\3\52\3\uffff\3\52\1\uffff\14\52\5\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0637\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0638"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0639\6\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\1\u063a",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u063b\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\151\2\uffff\1\151\22\uffff\1\151\1\52\4\uffff\2\52\1\u01f7\3\uffff"+
			"\3\52\1\uffff\14\52\3\uffff\1\52\1\uffff\14\52\1\u01f8\15\52\4\uffff"+
			"\1\52\1\uffff\22\52\1\u01f6\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u063d\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\1\52\1\u063e\30\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u063f\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u0640\17\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0641\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u0642\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0643\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0644\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u0622\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4"+
			"\52\1\u0645\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u0646\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\1\u0647",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0648\23\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0649\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u064a"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u064b\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u064c\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u064d\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u064e"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u064f\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\22"+
			"\52\1\u0650\7\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\3\52\1\u0651\26\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\1\u0652",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0653\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0654\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\30"+
			"\52\1\u0655\1\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0656\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0657\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\1\u0658"+
			"\31\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0659\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u065a\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u0622\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\24"+
			"\52\1\u065b\5\52\u1f9e\uffff\1\52",
			"\1\u065c",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u065d\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u065e\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u065f\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0660\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\26\52\1\u0661\3\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\2\52"+
			"\1\u0662\27\52\u1f9e\uffff\1\52",
			"\1\u0663",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0664\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\21"+
			"\52\1\u0665\10\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0666\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\7\52"+
			"\1\u0667\22\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\12"+
			"\52\1\u0668\17\52\u1f9e\uffff\1\52",
			"\1\52\4\uffff\2\52\1\u0548\3\uffff\3\52\1\uffff\14\52\3\uffff\1\52\1"+
			"\uffff\14\52\1\u01f8\15\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u066a\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u066b\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u066c\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\u066d\1\52\4\uffff\2\52\1\uffff\1\52\2"+
			"\uffff\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff"+
			"\32\52\u1f9e\uffff\1\52",
			"\1\uffff",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\3\52"+
			"\1\u066e\26\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\23"+
			"\52\1\u066f\6\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\1\52\5\uffff\2\52\4\uffff\2\52\2\uffff\14"+
			"\52\5\uffff\23\52\1\u0670\6\52\4\uffff\1\52\1\uffff\32\52\u1f9e\uffff"+
			"\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\4\52"+
			"\1\u0671\25\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\16"+
			"\52\1\u0672\13\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u0673\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\13"+
			"\52\1\u0674\16\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\10"+
			"\52\1\u0675\21\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\15"+
			"\52\1\u0676\14\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\52\2\uffff\3"+
			"\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\6\52"+
			"\1\u0677\23\52\u1f9e\uffff\1\52",
			"\2\52\2\uffff\1\52\22\uffff\2\52\4\uffff\2\52\1\uffff\1\u04da\2\uffff"+
			"\3\52\13\uffff\2\52\3\uffff\1\52\1\uffff\32\52\4\uffff\1\52\1\uffff\32"+
			"\52\u1f9e\uffff\1\52"
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
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_CLASS_NAME | NON_CONF_SECOND_LINE_COMMENT | RALLY_CLASS | RALLY_ENTRY | NON_CONFORMATION_SECOND_LINE | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA67_1123 = input.LA(1);
						 
						int index67_1123 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1123==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1123);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA67_531 = input.LA(1);
						 
						int index67_531 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_531==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_531);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA67_1296 = input.LA(1);
						 
						int index67_1296 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1296=='s') ) {s = 502;}
						else if ( ((LA67_1296 >= '\t' && LA67_1296 <= '\n')||LA67_1296=='\r'||LA67_1296==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1296=='(') ) {s = 503;}
						else if ( (LA67_1296=='M') ) {s = 504;}
						else if ( (LA67_1296=='!'||(LA67_1296 >= '&' && LA67_1296 <= '\'')||(LA67_1296 >= ',' && LA67_1296 <= '.')||(LA67_1296 >= '0' && LA67_1296 <= ';')||LA67_1296=='?'||(LA67_1296 >= 'A' && LA67_1296 <= 'L')||(LA67_1296 >= 'N' && LA67_1296 <= 'Z')||LA67_1296=='_'||(LA67_1296 >= 'a' && LA67_1296 <= 'r')||(LA67_1296 >= 't' && LA67_1296 <= 'z')||LA67_1296=='\u2019') ) {s = 42;}
						else s = 1383;
						 
						input.seek(index67_1296);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA67_532 = input.LA(1);
						 
						int index67_532 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_532==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_532);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA67_1045 = input.LA(1);
						 
						int index67_1045 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1045==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1045);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA67_820 = input.LA(1);
						 
						int index67_820 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_820=='s') ) {s = 502;}
						else if ( ((LA67_820 >= '\t' && LA67_820 <= '\n')||LA67_820=='\r'||LA67_820==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_820=='(') ) {s = 503;}
						else if ( (LA67_820=='M') ) {s = 504;}
						else if ( (LA67_820=='!'||(LA67_820 >= '&' && LA67_820 <= '\'')||(LA67_820 >= ',' && LA67_820 <= '.')||(LA67_820 >= '0' && LA67_820 <= ';')||LA67_820=='?'||(LA67_820 >= 'A' && LA67_820 <= 'L')||(LA67_820 >= 'N' && LA67_820 <= 'Z')||LA67_820=='_'||(LA67_820 >= 'a' && LA67_820 <= 'r')||(LA67_820 >= 't' && LA67_820 <= 'z')||LA67_820=='\u2019') ) {s = 42;}
						else s = 1012;
						 
						input.seek(index67_820);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA67_1011 = input.LA(1);
						 
						int index67_1011 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1011=='s') ) {s = 502;}
						else if ( ((LA67_1011 >= '\t' && LA67_1011 <= '\n')||LA67_1011=='\r'||LA67_1011==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1011=='(') ) {s = 503;}
						else if ( (LA67_1011=='M') ) {s = 504;}
						else if ( (LA67_1011=='!'||(LA67_1011 >= '&' && LA67_1011 <= '\'')||(LA67_1011 >= ',' && LA67_1011 <= '.')||(LA67_1011 >= '0' && LA67_1011 <= ';')||LA67_1011=='?'||(LA67_1011 >= 'A' && LA67_1011 <= 'L')||(LA67_1011 >= 'N' && LA67_1011 <= 'Z')||LA67_1011=='_'||(LA67_1011 >= 'a' && LA67_1011 <= 'r')||(LA67_1011 >= 't' && LA67_1011 <= 'z')||LA67_1011=='\u2019') ) {s = 42;}
						else s = 1174;
						 
						input.seek(index67_1011);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA67_747 = input.LA(1);
						 
						int index67_747 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_747==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_747);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA67_528 = input.LA(1);
						 
						int index67_528 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_528==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_528);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA67_745 = input.LA(1);
						 
						int index67_745 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_745==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_745);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA67_1259 = input.LA(1);
						 
						int index67_1259 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1259==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1259);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA67_36 = input.LA(1);
						 
						int index67_36 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_36=='s') ) {s = 181;}
						else if ( ((LA67_36 >= '\t' && LA67_36 <= '\n')||LA67_36=='\r'||LA67_36==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_36);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA67_426 = input.LA(1);
						 
						int index67_426 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_426==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_426=='d') ) {s = 633;}
						else if ( (LA67_426=='m') ) {s = 634;}
						else s = 42;
						 
						input.seek(index67_426);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA67_235 = input.LA(1);
						 
						int index67_235 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_235=='l') ) {s = 441;}
						else if ( ((LA67_235 >= '\t' && LA67_235 <= '\n')||LA67_235=='\r'||LA67_235==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_235);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA67_1257 = input.LA(1);
						 
						int index67_1257 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1257==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1257);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA67_1110 = input.LA(1);
						 
						int index67_1110 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1110==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1110);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA67_736 = input.LA(1);
						 
						int index67_736 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_736==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_736);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA67_1359 = input.LA(1);
						 
						int index67_1359 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1359==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1359);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA67_1106 = input.LA(1);
						 
						int index67_1106 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1106==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1106);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA67_632 = input.LA(1);
						 
						int index67_632 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_632==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_632);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA67_832 = input.LA(1);
						 
						int index67_832 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_832=='s') ) {s = 502;}
						else if ( ((LA67_832 >= '\t' && LA67_832 <= '\n')||LA67_832=='\r'||LA67_832==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_832=='(') ) {s = 503;}
						else if ( (LA67_832=='M') ) {s = 504;}
						else if ( (LA67_832=='!'||(LA67_832 >= '&' && LA67_832 <= '\'')||(LA67_832 >= ',' && LA67_832 <= '.')||(LA67_832 >= '0' && LA67_832 <= ';')||LA67_832=='?'||(LA67_832 >= 'A' && LA67_832 <= 'L')||(LA67_832 >= 'N' && LA67_832 <= 'Z')||LA67_832=='_'||(LA67_832 >= 'a' && LA67_832 <= 'r')||(LA67_832 >= 't' && LA67_832 <= 'z')||LA67_832=='\u2019') ) {s = 42;}
						else s = 1022;
						 
						input.seek(index67_832);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA67_1385 = input.LA(1);
						 
						int index67_1385 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1385=='s') ) {s = 502;}
						else if ( ((LA67_1385 >= '\t' && LA67_1385 <= '\n')||LA67_1385=='\r'||LA67_1385==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1385=='(') ) {s = 503;}
						else if ( (LA67_1385=='M') ) {s = 504;}
						else if ( (LA67_1385=='!'||(LA67_1385 >= '&' && LA67_1385 <= '\'')||(LA67_1385 >= ',' && LA67_1385 <= '.')||(LA67_1385 >= '0' && LA67_1385 <= ';')||LA67_1385=='?'||(LA67_1385 >= 'A' && LA67_1385 <= 'L')||(LA67_1385 >= 'N' && LA67_1385 <= 'Z')||LA67_1385=='_'||(LA67_1385 >= 'a' && LA67_1385 <= 'r')||(LA67_1385 >= 't' && LA67_1385 <= 'z')||LA67_1385=='\u2019') ) {s = 42;}
						else s = 1449;
						 
						input.seek(index67_1385);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA67_298 = input.LA(1);
						 
						int index67_298 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_298==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_298);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA67_1247 = input.LA(1);
						 
						int index67_1247 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1247==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1247);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA67_1450 = input.LA(1);
						 
						int index67_1450 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1450=='s') ) {s = 502;}
						else if ( ((LA67_1450 >= '\t' && LA67_1450 <= '\n')||LA67_1450=='\r'||LA67_1450==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1450=='(') ) {s = 503;}
						else if ( (LA67_1450=='M') ) {s = 504;}
						else if ( (LA67_1450=='!'||(LA67_1450 >= '&' && LA67_1450 <= '\'')||(LA67_1450 >= ',' && LA67_1450 <= '.')||(LA67_1450 >= '0' && LA67_1450 <= ';')||LA67_1450=='?'||(LA67_1450 >= 'A' && LA67_1450 <= 'L')||(LA67_1450 >= 'N' && LA67_1450 <= 'Z')||LA67_1450=='_'||(LA67_1450 >= 'a' && LA67_1450 <= 'r')||(LA67_1450 >= 't' && LA67_1450 <= 'z')||LA67_1450=='\u2019') ) {s = 42;}
						else s = 1500;
						 
						input.seek(index67_1450);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA67_1027 = input.LA(1);
						 
						int index67_1027 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1027=='s') ) {s = 502;}
						else if ( ((LA67_1027 >= '\t' && LA67_1027 <= '\n')||LA67_1027=='\r'||LA67_1027==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1027=='(') ) {s = 503;}
						else if ( (LA67_1027=='M') ) {s = 504;}
						else if ( (LA67_1027=='!'||(LA67_1027 >= '&' && LA67_1027 <= '\'')||(LA67_1027 >= ',' && LA67_1027 <= '.')||(LA67_1027 >= '0' && LA67_1027 <= ';')||LA67_1027=='?'||(LA67_1027 >= 'A' && LA67_1027 <= 'L')||(LA67_1027 >= 'N' && LA67_1027 <= 'Z')||LA67_1027=='_'||(LA67_1027 >= 'a' && LA67_1027 <= 'r')||(LA67_1027 >= 't' && LA67_1027 <= 'z')||LA67_1027=='\u2019') ) {s = 42;}
						else s = 1183;
						 
						input.seek(index67_1027);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA67_652 = input.LA(1);
						 
						int index67_652 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_652==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_652=='s') ) {s = 858;}
						else s = 42;
						 
						input.seek(index67_652);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA67_628 = input.LA(1);
						 
						int index67_628 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_628=='s') ) {s = 502;}
						else if ( ((LA67_628 >= '\t' && LA67_628 <= '\n')||LA67_628=='\r'||LA67_628==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_628=='(') ) {s = 503;}
						else if ( (LA67_628=='M') ) {s = 504;}
						else if ( (LA67_628=='!'||(LA67_628 >= '&' && LA67_628 <= '\'')||(LA67_628 >= ',' && LA67_628 <= '.')||(LA67_628 >= '0' && LA67_628 <= ';')||LA67_628=='?'||(LA67_628 >= 'A' && LA67_628 <= 'L')||(LA67_628 >= 'N' && LA67_628 <= 'Z')||LA67_628=='_'||(LA67_628 >= 'a' && LA67_628 <= 'r')||(LA67_628 >= 't' && LA67_628 <= 'z')||LA67_628=='\u2019') ) {s = 42;}
						else s = 837;
						 
						input.seek(index67_628);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA67_900 = input.LA(1);
						 
						int index67_900 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_900==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_900);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA67_1068 = input.LA(1);
						 
						int index67_1068 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1068==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1068);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA67_1181 = input.LA(1);
						 
						int index67_1181 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1181=='s') ) {s = 502;}
						else if ( ((LA67_1181 >= '\t' && LA67_1181 <= '\n')||LA67_1181=='\r'||LA67_1181==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1181=='(') ) {s = 503;}
						else if ( (LA67_1181=='M') ) {s = 504;}
						else if ( (LA67_1181=='!'||(LA67_1181 >= '&' && LA67_1181 <= '\'')||(LA67_1181 >= ',' && LA67_1181 <= '.')||(LA67_1181 >= '0' && LA67_1181 <= ';')||LA67_1181=='?'||(LA67_1181 >= 'A' && LA67_1181 <= 'L')||(LA67_1181 >= 'N' && LA67_1181 <= 'Z')||LA67_1181=='_'||(LA67_1181 >= 'a' && LA67_1181 <= 'r')||(LA67_1181 >= 't' && LA67_1181 <= 'z')||LA67_1181=='\u2019') ) {s = 42;}
						else s = 1299;
						 
						input.seek(index67_1181);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA67_838 = input.LA(1);
						 
						int index67_838 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_838=='s') ) {s = 502;}
						else if ( ((LA67_838 >= '\t' && LA67_838 <= '\n')||LA67_838=='\r'||LA67_838==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_838=='(') ) {s = 503;}
						else if ( (LA67_838=='M') ) {s = 504;}
						else if ( (LA67_838=='!'||(LA67_838 >= '&' && LA67_838 <= '\'')||(LA67_838 >= ',' && LA67_838 <= '.')||(LA67_838 >= '0' && LA67_838 <= ';')||LA67_838=='?'||(LA67_838 >= 'A' && LA67_838 <= 'L')||(LA67_838 >= 'N' && LA67_838 <= 'Z')||LA67_838=='_'||(LA67_838 >= 'a' && LA67_838 <= 'r')||(LA67_838 >= 't' && LA67_838 <= 'z')||LA67_838=='\u2019') ) {s = 42;}
						else s = 1024;
						 
						input.seek(index67_838);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA67_626 = input.LA(1);
						 
						int index67_626 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_626=='s') ) {s = 502;}
						else if ( ((LA67_626 >= '\t' && LA67_626 <= '\n')||LA67_626=='\r'||LA67_626==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_626=='(') ) {s = 503;}
						else if ( (LA67_626=='M') ) {s = 504;}
						else if ( (LA67_626=='!'||(LA67_626 >= '&' && LA67_626 <= '\'')||(LA67_626 >= ',' && LA67_626 <= '.')||(LA67_626 >= '0' && LA67_626 <= ';')||LA67_626=='?'||(LA67_626 >= 'A' && LA67_626 <= 'L')||(LA67_626 >= 'N' && LA67_626 <= 'Z')||LA67_626=='_'||(LA67_626 >= 'a' && LA67_626 <= 'r')||(LA67_626 >= 't' && LA67_626 <= 'z')||LA67_626=='\u2019') ) {s = 42;}
						else s = 835;
						 
						input.seek(index67_626);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA67_1302 = input.LA(1);
						 
						int index67_1302 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1302=='s') ) {s = 502;}
						else if ( ((LA67_1302 >= '\t' && LA67_1302 <= '\n')||LA67_1302=='\r'||LA67_1302==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1302=='(') ) {s = 503;}
						else if ( (LA67_1302=='M') ) {s = 504;}
						else if ( (LA67_1302=='!'||(LA67_1302 >= '&' && LA67_1302 <= '\'')||(LA67_1302 >= ',' && LA67_1302 <= '.')||(LA67_1302 >= '0' && LA67_1302 <= ';')||LA67_1302=='?'||(LA67_1302 >= 'A' && LA67_1302 <= 'L')||(LA67_1302 >= 'N' && LA67_1302 <= 'Z')||LA67_1302=='_'||(LA67_1302 >= 'a' && LA67_1302 <= 'r')||(LA67_1302 >= 't' && LA67_1302 <= 'z')||LA67_1302=='\u2019') ) {s = 42;}
						else s = 1388;
						 
						input.seek(index67_1302);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA67_505 = input.LA(1);
						 
						int index67_505 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_505=='k') ) {s = 723;}
						else if ( (LA67_505=='s') ) {s = 502;}
						else if ( ((LA67_505 >= '\t' && LA67_505 <= '\n')||LA67_505=='\r'||LA67_505==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_505=='(') ) {s = 503;}
						else if ( (LA67_505=='M') ) {s = 504;}
						else if ( (LA67_505=='!'||(LA67_505 >= '&' && LA67_505 <= '\'')||(LA67_505 >= ',' && LA67_505 <= '.')||(LA67_505 >= '0' && LA67_505 <= ';')||LA67_505=='?'||(LA67_505 >= 'A' && LA67_505 <= 'L')||(LA67_505 >= 'N' && LA67_505 <= 'Z')||LA67_505=='_'||(LA67_505 >= 'a' && LA67_505 <= 'j')||(LA67_505 >= 'l' && LA67_505 <= 'r')||(LA67_505 >= 't' && LA67_505 <= 'z')||LA67_505=='\u2019') ) {s = 42;}
						else s = 724;
						 
						input.seek(index67_505);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA67_852 = input.LA(1);
						 
						int index67_852 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_852=='s') ) {s = 502;}
						else if ( ((LA67_852 >= '\t' && LA67_852 <= '\n')||LA67_852=='\r'||LA67_852==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_852=='(') ) {s = 503;}
						else if ( (LA67_852=='M') ) {s = 504;}
						else if ( (LA67_852=='!'||(LA67_852 >= '&' && LA67_852 <= '\'')||(LA67_852 >= ',' && LA67_852 <= '.')||(LA67_852 >= '0' && LA67_852 <= ';')||LA67_852=='?'||(LA67_852 >= 'A' && LA67_852 <= 'L')||(LA67_852 >= 'N' && LA67_852 <= 'Z')||LA67_852=='_'||(LA67_852 >= 'a' && LA67_852 <= 'r')||(LA67_852 >= 't' && LA67_852 <= 'z')||LA67_852=='\u2019') ) {s = 42;}
						else s = 1036;
						 
						input.seek(index67_852);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA67_1304 = input.LA(1);
						 
						int index67_1304 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1304=='s') ) {s = 502;}
						else if ( ((LA67_1304 >= '\t' && LA67_1304 <= '\n')||LA67_1304=='\r'||LA67_1304==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1304=='(') ) {s = 503;}
						else if ( (LA67_1304=='M') ) {s = 504;}
						else if ( (LA67_1304=='!'||(LA67_1304 >= '&' && LA67_1304 <= '\'')||(LA67_1304 >= ',' && LA67_1304 <= '.')||(LA67_1304 >= '0' && LA67_1304 <= ';')||LA67_1304=='?'||(LA67_1304 >= 'A' && LA67_1304 <= 'L')||(LA67_1304 >= 'N' && LA67_1304 <= 'Z')||LA67_1304=='_'||(LA67_1304 >= 'a' && LA67_1304 <= 'r')||(LA67_1304 >= 't' && LA67_1304 <= 'z')||LA67_1304=='\u2019') ) {s = 42;}
						else s = 1390;
						 
						input.seek(index67_1304);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA67_1373 = input.LA(1);
						 
						int index67_1373 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1373==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1373);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA67_1440 = input.LA(1);
						 
						int index67_1440 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1440==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1440);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA67_561 = input.LA(1);
						 
						int index67_561 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_561==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_561);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA67_675 = input.LA(1);
						 
						int index67_675 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_675==' ') && ((allowGroup))) {s = 878;}
						else s = 42;
						 
						input.seek(index67_675);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA67_427 = input.LA(1);
						 
						int index67_427 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_427==' ') && ((allowGroup))) {s = 549;}
						else s = 42;
						 
						input.seek(index67_427);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA67_1148 = input.LA(1);
						 
						int index67_1148 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1148==' ') && ((allowGroup))) {s = 1278;}
						else s = 42;
						 
						input.seek(index67_1148);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA67_1305 = input.LA(1);
						 
						int index67_1305 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1305=='s') ) {s = 502;}
						else if ( ((LA67_1305 >= '\t' && LA67_1305 <= '\n')||LA67_1305=='\r'||LA67_1305==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1305=='(') ) {s = 503;}
						else if ( (LA67_1305=='M') ) {s = 504;}
						else if ( (LA67_1305=='!'||(LA67_1305 >= '&' && LA67_1305 <= '\'')||(LA67_1305 >= ',' && LA67_1305 <= '.')||(LA67_1305 >= '0' && LA67_1305 <= ';')||LA67_1305=='?'||(LA67_1305 >= 'A' && LA67_1305 <= 'L')||(LA67_1305 >= 'N' && LA67_1305 <= 'Z')||LA67_1305=='_'||(LA67_1305 >= 'a' && LA67_1305 <= 'r')||(LA67_1305 >= 't' && LA67_1305 <= 'z')||LA67_1305=='\u2019') ) {s = 42;}
						else s = 1391;
						 
						input.seek(index67_1305);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA67_1133 = input.LA(1);
						 
						int index67_1133 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1133==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1133);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA67_1127 = input.LA(1);
						 
						int index67_1127 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1127==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1127);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA67_956 = input.LA(1);
						 
						int index67_956 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_956==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_956);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA67_1288 = input.LA(1);
						 
						int index67_1288 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1288==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1288);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA67_1041 = input.LA(1);
						 
						int index67_1041 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1041==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1041);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA67_1124 = input.LA(1);
						 
						int index67_1124 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1124==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1124);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA67_1263 = input.LA(1);
						 
						int index67_1263 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1263==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1263);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA67_1554 = input.LA(1);
						 
						int index67_1554 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1554==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1554);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA67_1242 = input.LA(1);
						 
						int index67_1242 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_1242 >= '\t' && LA67_1242 <= '\n')||LA67_1242=='\r'||LA67_1242==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1242=='A') ) {s = 1349;}
						else if ( (LA67_1242=='P') ) {s = 1350;}
						else if ( (LA67_1242=='B') ) {s = 1351;}
						else if ( (LA67_1242=='(') ) {s = 1352;}
						else if ( (LA67_1242=='M') ) {s = 1353;}
						else if ( ((LA67_1242 >= '&' && LA67_1242 <= '\'')||(LA67_1242 >= ',' && LA67_1242 <= '.')||(LA67_1242 >= '0' && LA67_1242 <= ';')||(LA67_1242 >= 'C' && LA67_1242 <= 'L')||(LA67_1242 >= 'N' && LA67_1242 <= 'O')||(LA67_1242 >= 'Q' && LA67_1242 <= 'Z')||LA67_1242=='_'||(LA67_1242 >= 'a' && LA67_1242 <= 'z')||LA67_1242=='\u2019') ) {s = 42;}
						else s = 1354;
						 
						input.seek(index67_1242);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA67_1199 = input.LA(1);
						 
						int index67_1199 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1199=='s') ) {s = 502;}
						else if ( ((LA67_1199 >= '\t' && LA67_1199 <= '\n')||LA67_1199=='\r'||LA67_1199==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1199=='(') ) {s = 503;}
						else if ( (LA67_1199=='M') ) {s = 504;}
						else if ( (LA67_1199=='!'||(LA67_1199 >= '&' && LA67_1199 <= '\'')||(LA67_1199 >= ',' && LA67_1199 <= '.')||(LA67_1199 >= '0' && LA67_1199 <= ';')||LA67_1199=='?'||(LA67_1199 >= 'A' && LA67_1199 <= 'L')||(LA67_1199 >= 'N' && LA67_1199 <= 'Z')||LA67_1199=='_'||(LA67_1199 >= 'a' && LA67_1199 <= 'r')||(LA67_1199 >= 't' && LA67_1199 <= 'z')||LA67_1199=='\u2019') ) {s = 42;}
						else s = 1310;
						 
						input.seek(index67_1199);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA67_1050 = input.LA(1);
						 
						int index67_1050 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1050=='s') ) {s = 502;}
						else if ( ((LA67_1050 >= '\t' && LA67_1050 <= '\n')||LA67_1050=='\r'||LA67_1050==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1050=='(') ) {s = 503;}
						else if ( (LA67_1050=='M') ) {s = 504;}
						else if ( (LA67_1050=='!'||(LA67_1050 >= '&' && LA67_1050 <= '\'')||(LA67_1050 >= ',' && LA67_1050 <= '.')||(LA67_1050 >= '0' && LA67_1050 <= ';')||LA67_1050=='?'||(LA67_1050 >= 'A' && LA67_1050 <= 'L')||(LA67_1050 >= 'N' && LA67_1050 <= 'Z')||LA67_1050=='_'||(LA67_1050 >= 'a' && LA67_1050 <= 'r')||(LA67_1050 >= 't' && LA67_1050 <= 'z')||LA67_1050=='\u2019') ) {s = 42;}
						else s = 1198;
						 
						input.seek(index67_1050);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA67_1140 = input.LA(1);
						 
						int index67_1140 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1140==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1140=='s') ) {s = 1271;}
						else s = 42;
						 
						input.seek(index67_1140);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA67_1309 = input.LA(1);
						 
						int index67_1309 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1309=='s') ) {s = 502;}
						else if ( ((LA67_1309 >= '\t' && LA67_1309 <= '\n')||LA67_1309=='\r'||LA67_1309==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1309=='(') ) {s = 503;}
						else if ( (LA67_1309=='M') ) {s = 504;}
						else if ( (LA67_1309=='!'||(LA67_1309 >= '&' && LA67_1309 <= '\'')||(LA67_1309 >= ',' && LA67_1309 <= '.')||(LA67_1309 >= '0' && LA67_1309 <= ';')||LA67_1309=='?'||(LA67_1309 >= 'A' && LA67_1309 <= 'L')||(LA67_1309 >= 'N' && LA67_1309 <= 'Z')||LA67_1309=='_'||(LA67_1309 >= 'a' && LA67_1309 <= 'r')||(LA67_1309 >= 't' && LA67_1309 <= 'z')||LA67_1309=='\u2019') ) {s = 42;}
						else s = 1394;
						 
						input.seek(index67_1309);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA67_1203 = input.LA(1);
						 
						int index67_1203 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1203=='s') ) {s = 502;}
						else if ( ((LA67_1203 >= '\t' && LA67_1203 <= '\n')||LA67_1203=='\r'||LA67_1203==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1203=='(') ) {s = 503;}
						else if ( (LA67_1203=='M') ) {s = 504;}
						else if ( (LA67_1203=='!'||(LA67_1203 >= '&' && LA67_1203 <= '\'')||(LA67_1203 >= ',' && LA67_1203 <= '.')||(LA67_1203 >= '0' && LA67_1203 <= ';')||LA67_1203=='?'||(LA67_1203 >= 'A' && LA67_1203 <= 'L')||(LA67_1203 >= 'N' && LA67_1203 <= 'Z')||LA67_1203=='_'||(LA67_1203 >= 'a' && LA67_1203 <= 'r')||(LA67_1203 >= 't' && LA67_1203 <= 'z')||LA67_1203=='\u2019') ) {s = 42;}
						else s = 1314;
						 
						input.seek(index67_1203);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA67_1395 = input.LA(1);
						 
						int index67_1395 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1395=='s') ) {s = 502;}
						else if ( ((LA67_1395 >= '\t' && LA67_1395 <= '\n')||LA67_1395=='\r'||LA67_1395==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1395=='(') ) {s = 503;}
						else if ( (LA67_1395=='M') ) {s = 504;}
						else if ( (LA67_1395=='!'||(LA67_1395 >= '&' && LA67_1395 <= '\'')||(LA67_1395 >= ',' && LA67_1395 <= '.')||(LA67_1395 >= '0' && LA67_1395 <= ';')||LA67_1395=='?'||(LA67_1395 >= 'A' && LA67_1395 <= 'L')||(LA67_1395 >= 'N' && LA67_1395 <= 'Z')||LA67_1395=='_'||(LA67_1395 >= 'a' && LA67_1395 <= 'r')||(LA67_1395 >= 't' && LA67_1395 <= 'z')||LA67_1395=='\u2019') ) {s = 42;}
						else s = 1454;
						 
						input.seek(index67_1395);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA67_35 = input.LA(1);
						 
						int index67_35 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_35=='S') ) {s = 179;}
						else if ( ((LA67_35 >= '\t' && LA67_35 <= '\n')||LA67_35=='\r'||LA67_35==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_35);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA67_1204 = input.LA(1);
						 
						int index67_1204 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1204=='s') ) {s = 502;}
						else if ( ((LA67_1204 >= '\t' && LA67_1204 <= '\n')||LA67_1204=='\r'||LA67_1204==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1204=='(') ) {s = 503;}
						else if ( (LA67_1204=='M') ) {s = 504;}
						else if ( (LA67_1204=='!'||(LA67_1204 >= '&' && LA67_1204 <= '\'')||(LA67_1204 >= ',' && LA67_1204 <= '.')||(LA67_1204 >= '0' && LA67_1204 <= ';')||LA67_1204=='?'||(LA67_1204 >= 'A' && LA67_1204 <= 'L')||(LA67_1204 >= 'N' && LA67_1204 <= 'Z')||LA67_1204=='_'||(LA67_1204 >= 'a' && LA67_1204 <= 'r')||(LA67_1204 >= 't' && LA67_1204 <= 'z')||LA67_1204=='\u2019') ) {s = 42;}
						else s = 1315;
						 
						input.seek(index67_1204);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA67_1396 = input.LA(1);
						 
						int index67_1396 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1396=='s') ) {s = 502;}
						else if ( ((LA67_1396 >= '\t' && LA67_1396 <= '\n')||LA67_1396=='\r'||LA67_1396==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1396=='(') ) {s = 503;}
						else if ( (LA67_1396=='M') ) {s = 504;}
						else if ( (LA67_1396=='!'||(LA67_1396 >= '&' && LA67_1396 <= '\'')||(LA67_1396 >= ',' && LA67_1396 <= '.')||(LA67_1396 >= '0' && LA67_1396 <= ';')||LA67_1396=='?'||(LA67_1396 >= 'A' && LA67_1396 <= 'L')||(LA67_1396 >= 'N' && LA67_1396 <= 'Z')||LA67_1396=='_'||(LA67_1396 >= 'a' && LA67_1396 <= 'r')||(LA67_1396 >= 't' && LA67_1396 <= 'z')||LA67_1396=='\u2019') ) {s = 42;}
						else s = 1455;
						 
						input.seek(index67_1396);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA67_991 = input.LA(1);
						 
						int index67_991 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_991=='s') ) {s = 502;}
						else if ( ((LA67_991 >= '\t' && LA67_991 <= '\n')||LA67_991=='\r'||LA67_991==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_991=='(') ) {s = 503;}
						else if ( (LA67_991=='M') ) {s = 504;}
						else if ( (LA67_991=='!'||(LA67_991 >= '&' && LA67_991 <= '\'')||(LA67_991 >= ',' && LA67_991 <= '.')||(LA67_991 >= '0' && LA67_991 <= ';')||LA67_991=='?'||(LA67_991 >= 'A' && LA67_991 <= 'L')||(LA67_991 >= 'N' && LA67_991 <= 'Z')||LA67_991=='_'||(LA67_991 >= 'a' && LA67_991 <= 'r')||(LA67_991 >= 't' && LA67_991 <= 'z')||LA67_991=='\u2019') ) {s = 42;}
						else s = 1158;
						 
						input.seek(index67_991);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA67_1064 = input.LA(1);
						 
						int index67_1064 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1064=='s') ) {s = 502;}
						else if ( ((LA67_1064 >= '\t' && LA67_1064 <= '\n')||LA67_1064=='\r'||LA67_1064==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1064=='(') ) {s = 503;}
						else if ( (LA67_1064=='M') ) {s = 504;}
						else if ( (LA67_1064=='!'||(LA67_1064 >= '&' && LA67_1064 <= '\'')||(LA67_1064 >= ',' && LA67_1064 <= '.')||(LA67_1064 >= '0' && LA67_1064 <= ';')||LA67_1064=='?'||(LA67_1064 >= 'A' && LA67_1064 <= 'L')||(LA67_1064 >= 'N' && LA67_1064 <= 'Z')||LA67_1064=='_'||(LA67_1064 >= 'a' && LA67_1064 <= 'r')||(LA67_1064 >= 't' && LA67_1064 <= 'z')||LA67_1064=='\u2019') ) {s = 42;}
						else s = 1208;
						 
						input.seek(index67_1064);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA67_990 = input.LA(1);
						 
						int index67_990 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_990=='s') ) {s = 502;}
						else if ( ((LA67_990 >= '\t' && LA67_990 <= '\n')||LA67_990=='\r'||LA67_990==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_990=='(') ) {s = 503;}
						else if ( (LA67_990=='M') ) {s = 504;}
						else if ( (LA67_990=='!'||(LA67_990 >= '&' && LA67_990 <= '\'')||(LA67_990 >= ',' && LA67_990 <= '.')||(LA67_990 >= '0' && LA67_990 <= ';')||LA67_990=='?'||(LA67_990 >= 'A' && LA67_990 <= 'L')||(LA67_990 >= 'N' && LA67_990 <= 'Z')||LA67_990=='_'||(LA67_990 >= 'a' && LA67_990 <= 'r')||(LA67_990 >= 't' && LA67_990 <= 'z')||LA67_990=='\u2019') ) {s = 42;}
						else s = 1157;
						 
						input.seek(index67_990);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA67_1497 = input.LA(1);
						 
						int index67_1497 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1497=='s') ) {s = 502;}
						else if ( ((LA67_1497 >= '\t' && LA67_1497 <= '\n')||LA67_1497=='\r'||LA67_1497==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1497=='(') ) {s = 503;}
						else if ( (LA67_1497=='M') ) {s = 504;}
						else if ( (LA67_1497=='!'||(LA67_1497 >= '&' && LA67_1497 <= '\'')||(LA67_1497 >= ',' && LA67_1497 <= '.')||(LA67_1497 >= '0' && LA67_1497 <= ';')||LA67_1497=='?'||(LA67_1497 >= 'A' && LA67_1497 <= 'L')||(LA67_1497 >= 'N' && LA67_1497 <= 'Z')||LA67_1497=='_'||(LA67_1497 >= 'a' && LA67_1497 <= 'r')||(LA67_1497 >= 't' && LA67_1497 <= 'z')||LA67_1497=='\u2019') ) {s = 42;}
						else s = 1529;
						 
						input.seek(index67_1497);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA67_1293 = input.LA(1);
						 
						int index67_1293 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1293==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1293);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA67_1448 = input.LA(1);
						 
						int index67_1448 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1448==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1448);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA67_809 = input.LA(1);
						 
						int index67_809 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_809==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_809);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA67_1168 = input.LA(1);
						 
						int index67_1168 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1168==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1168);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA67_1376 = input.LA(1);
						 
						int index67_1376 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1376=='s') ) {s = 502;}
						else if ( ((LA67_1376 >= '\t' && LA67_1376 <= '\n')||LA67_1376=='\r'||LA67_1376==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1376=='(') ) {s = 503;}
						else if ( (LA67_1376=='M') ) {s = 504;}
						else if ( (LA67_1376=='!'||(LA67_1376 >= '&' && LA67_1376 <= '\'')||(LA67_1376 >= ',' && LA67_1376 <= '.')||(LA67_1376 >= '0' && LA67_1376 <= ';')||LA67_1376=='?'||(LA67_1376 >= 'A' && LA67_1376 <= 'L')||(LA67_1376 >= 'N' && LA67_1376 <= 'Z')||LA67_1376=='_'||(LA67_1376 >= 'a' && LA67_1376 <= 'r')||(LA67_1376 >= 't' && LA67_1376 <= 'z')||LA67_1376=='\u2019') ) {s = 42;}
						else s = 1444;
						 
						input.seek(index67_1376);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA67_1209 = input.LA(1);
						 
						int index67_1209 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1209=='s') ) {s = 502;}
						else if ( ((LA67_1209 >= '\t' && LA67_1209 <= '\n')||LA67_1209=='\r'||LA67_1209==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1209=='(') ) {s = 503;}
						else if ( (LA67_1209=='M') ) {s = 504;}
						else if ( (LA67_1209=='!'||(LA67_1209 >= '&' && LA67_1209 <= '\'')||(LA67_1209 >= ',' && LA67_1209 <= '.')||(LA67_1209 >= '0' && LA67_1209 <= ';')||LA67_1209=='?'||(LA67_1209 >= 'A' && LA67_1209 <= 'L')||(LA67_1209 >= 'N' && LA67_1209 <= 'Z')||LA67_1209=='_'||(LA67_1209 >= 'a' && LA67_1209 <= 'r')||(LA67_1209 >= 't' && LA67_1209 <= 'z')||LA67_1209=='\u2019') ) {s = 42;}
						else s = 1317;
						 
						input.seek(index67_1209);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA67_1318 = input.LA(1);
						 
						int index67_1318 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1318=='s') ) {s = 502;}
						else if ( ((LA67_1318 >= '\t' && LA67_1318 <= '\n')||LA67_1318=='\r'||LA67_1318==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1318=='(') ) {s = 503;}
						else if ( (LA67_1318=='M') ) {s = 504;}
						else if ( (LA67_1318=='!'||(LA67_1318 >= '&' && LA67_1318 <= '\'')||(LA67_1318 >= ',' && LA67_1318 <= '.')||(LA67_1318 >= '0' && LA67_1318 <= ';')||LA67_1318=='?'||(LA67_1318 >= 'A' && LA67_1318 <= 'L')||(LA67_1318 >= 'N' && LA67_1318 <= 'Z')||LA67_1318=='_'||(LA67_1318 >= 'a' && LA67_1318 <= 'r')||(LA67_1318 >= 't' && LA67_1318 <= 'z')||LA67_1318=='\u2019') ) {s = 42;}
						else s = 1397;
						 
						input.seek(index67_1318);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA67_1005 = input.LA(1);
						 
						int index67_1005 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1005==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1005);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA67_833 = input.LA(1);
						 
						int index67_833 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_833==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_833);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA67_1132 = input.LA(1);
						 
						int index67_1132 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1132==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1132);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA67_1261 = input.LA(1);
						 
						int index67_1261 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1261=='s') ) {s = 502;}
						else if ( ((LA67_1261 >= '\t' && LA67_1261 <= '\n')||LA67_1261=='\r'||LA67_1261==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1261=='(') ) {s = 503;}
						else if ( (LA67_1261=='M') ) {s = 504;}
						else if ( (LA67_1261=='!'||(LA67_1261 >= '&' && LA67_1261 <= '\'')||(LA67_1261 >= ',' && LA67_1261 <= '.')||(LA67_1261 >= '0' && LA67_1261 <= ';')||LA67_1261=='?'||(LA67_1261 >= 'A' && LA67_1261 <= 'L')||(LA67_1261 >= 'N' && LA67_1261 <= 'Z')||LA67_1261=='_'||(LA67_1261 >= 'a' && LA67_1261 <= 'r')||(LA67_1261 >= 't' && LA67_1261 <= 'z')||LA67_1261=='\u2019') ) {s = 42;}
						else s = 1362;
						 
						input.seek(index67_1261);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA67_668 = input.LA(1);
						 
						int index67_668 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_668==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_668=='e') ) {s = 872;}
						else s = 42;
						 
						input.seek(index67_668);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA67_1179 = input.LA(1);
						 
						int index67_1179 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1179==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1179);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA67_635 = input.LA(1);
						 
						int index67_635 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_635==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_635);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA67_1399 = input.LA(1);
						 
						int index67_1399 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1399==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1399);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA67_1182 = input.LA(1);
						 
						int index67_1182 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1182==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1182);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA67_1119 = input.LA(1);
						 
						int index67_1119 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1119=='s') ) {s = 502;}
						else if ( ((LA67_1119 >= '\t' && LA67_1119 <= '\n')||LA67_1119=='\r'||LA67_1119==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1119=='(') ) {s = 503;}
						else if ( (LA67_1119=='M') ) {s = 504;}
						else if ( (LA67_1119=='!'||(LA67_1119 >= '&' && LA67_1119 <= '\'')||(LA67_1119 >= ',' && LA67_1119 <= '.')||(LA67_1119 >= '0' && LA67_1119 <= ';')||LA67_1119=='?'||(LA67_1119 >= 'A' && LA67_1119 <= 'L')||(LA67_1119 >= 'N' && LA67_1119 <= 'Z')||LA67_1119=='_'||(LA67_1119 >= 'a' && LA67_1119 <= 'r')||(LA67_1119 >= 't' && LA67_1119 <= 'z')||LA67_1119=='\u2019') ) {s = 42;}
						else s = 1258;
						 
						input.seek(index67_1119);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA67_943 = input.LA(1);
						 
						int index67_943 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_943=='s') ) {s = 502;}
						else if ( ((LA67_943 >= '\t' && LA67_943 <= '\n')||LA67_943=='\r'||LA67_943==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_943=='(') ) {s = 503;}
						else if ( (LA67_943=='M') ) {s = 504;}
						else if ( (LA67_943=='!'||(LA67_943 >= '&' && LA67_943 <= '\'')||(LA67_943 >= ',' && LA67_943 <= '.')||(LA67_943 >= '0' && LA67_943 <= ';')||LA67_943=='?'||(LA67_943 >= 'A' && LA67_943 <= 'L')||(LA67_943 >= 'N' && LA67_943 <= 'Z')||LA67_943=='_'||(LA67_943 >= 'a' && LA67_943 <= 'r')||(LA67_943 >= 't' && LA67_943 <= 'z')||LA67_943=='\u2019') ) {s = 42;}
						else s = 1113;
						 
						input.seek(index67_943);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA67_836 = input.LA(1);
						 
						int index67_836 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_836==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_836);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA67_1114 = input.LA(1);
						 
						int index67_1114 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1114=='s') ) {s = 502;}
						else if ( ((LA67_1114 >= '\t' && LA67_1114 <= '\n')||LA67_1114=='\r'||LA67_1114==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1114=='(') ) {s = 503;}
						else if ( (LA67_1114=='M') ) {s = 504;}
						else if ( (LA67_1114=='!'||(LA67_1114 >= '&' && LA67_1114 <= '\'')||(LA67_1114 >= ',' && LA67_1114 <= '.')||(LA67_1114 >= '0' && LA67_1114 <= ';')||LA67_1114=='?'||(LA67_1114 >= 'A' && LA67_1114 <= 'L')||(LA67_1114 >= 'N' && LA67_1114 <= 'Z')||LA67_1114=='_'||(LA67_1114 >= 'a' && LA67_1114 <= 'r')||(LA67_1114 >= 't' && LA67_1114 <= 'z')||LA67_1114=='\u2019') ) {s = 42;}
						else s = 1253;
						 
						input.seek(index67_1114);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA67_1180 = input.LA(1);
						 
						int index67_1180 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1180==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1180);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA67_1434 = input.LA(1);
						 
						int index67_1434 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1434=='s') ) {s = 502;}
						else if ( ((LA67_1434 >= '\t' && LA67_1434 <= '\n')||LA67_1434=='\r'||LA67_1434==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1434=='(') ) {s = 503;}
						else if ( (LA67_1434=='M') ) {s = 504;}
						else if ( (LA67_1434=='!'||(LA67_1434 >= '&' && LA67_1434 <= '\'')||(LA67_1434 >= ',' && LA67_1434 <= '.')||(LA67_1434 >= '0' && LA67_1434 <= ';')||LA67_1434=='?'||(LA67_1434 >= 'A' && LA67_1434 <= 'L')||(LA67_1434 >= 'N' && LA67_1434 <= 'Z')||LA67_1434=='_'||(LA67_1434 >= 'a' && LA67_1434 <= 'r')||(LA67_1434 >= 't' && LA67_1434 <= 'z')||LA67_1434=='\u2019') ) {s = 42;}
						else s = 1488;
						 
						input.seek(index67_1434);
						if ( s>=0 ) return s;
						break;

					case 88 : 
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
						else if ( (LA67_0=='i') ) {s = 25;}
						else if ( ((LA67_0 >= '0' && LA67_0 <= '9')) ) {s = 26;}
						else if ( ((LA67_0 >= '\t' && LA67_0 <= '\n')||LA67_0=='\r'||LA67_0==' ') ) {s = 27;}
						else if ( (LA67_0=='(') ) {s = 28;}
						else if ( (LA67_0=='.') ) {s = 29;}
						else if ( (LA67_0=='Q'||LA67_0=='Z') ) {s = 30;}
						else if ( ((LA67_0 >= '&' && LA67_0 <= '\'')||(LA67_0 >= ',' && LA67_0 <= '-')||(LA67_0 >= ':' && LA67_0 <= ';')||LA67_0=='_'||(LA67_0 >= 'a' && LA67_0 <= 'h')||(LA67_0 >= 'j' && LA67_0 <= 'z')||LA67_0=='\u2019') ) {s = 31;}
						else if ( ((LA67_0 >= '\u0000' && LA67_0 <= '\b')||(LA67_0 >= '\u000B' && LA67_0 <= '\f')||(LA67_0 >= '\u000E' && LA67_0 <= '\u001F')||(LA67_0 >= '!' && LA67_0 <= '%')||(LA67_0 >= ')' && LA67_0 <= '+')||LA67_0=='/'||(LA67_0 >= '<' && LA67_0 <= '@')||(LA67_0 >= '[' && LA67_0 <= '^')||LA67_0=='`'||(LA67_0 >= '{' && LA67_0 <= '\u2018')||(LA67_0 >= '\u201A' && LA67_0 <= '\uFFFF')) ) {s = 32;}
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA67_1432 = input.LA(1);
						 
						int index67_1432 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1432=='s') ) {s = 502;}
						else if ( ((LA67_1432 >= '\t' && LA67_1432 <= '\n')||LA67_1432=='\r'||LA67_1432==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1432=='(') ) {s = 503;}
						else if ( (LA67_1432=='M') ) {s = 504;}
						else if ( (LA67_1432=='!'||(LA67_1432 >= '&' && LA67_1432 <= '\'')||(LA67_1432 >= ',' && LA67_1432 <= '.')||(LA67_1432 >= '0' && LA67_1432 <= ';')||LA67_1432=='?'||(LA67_1432 >= 'A' && LA67_1432 <= 'L')||(LA67_1432 >= 'N' && LA67_1432 <= 'Z')||LA67_1432=='_'||(LA67_1432 >= 'a' && LA67_1432 <= 'r')||(LA67_1432 >= 't' && LA67_1432 <= 'z')||LA67_1432=='\u2019') ) {s = 42;}
						else s = 1486;
						 
						input.seek(index67_1432);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA67_1013 = input.LA(1);
						 
						int index67_1013 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1013==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1013);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA67_1433 = input.LA(1);
						 
						int index67_1433 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1433=='s') ) {s = 502;}
						else if ( ((LA67_1433 >= '\t' && LA67_1433 <= '\n')||LA67_1433=='\r'||LA67_1433==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1433=='(') ) {s = 503;}
						else if ( (LA67_1433=='M') ) {s = 504;}
						else if ( (LA67_1433=='!'||(LA67_1433 >= '&' && LA67_1433 <= '\'')||(LA67_1433 >= ',' && LA67_1433 <= '.')||(LA67_1433 >= '0' && LA67_1433 <= ';')||LA67_1433=='?'||(LA67_1433 >= 'A' && LA67_1433 <= 'L')||(LA67_1433 >= 'N' && LA67_1433 <= 'Z')||LA67_1433=='_'||(LA67_1433 >= 'a' && LA67_1433 <= 'r')||(LA67_1433 >= 't' && LA67_1433 <= 'z')||LA67_1433=='\u2019') ) {s = 42;}
						else s = 1487;
						 
						input.seek(index67_1433);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA67_1384 = input.LA(1);
						 
						int index67_1384 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1384==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1384);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA67_819 = input.LA(1);
						 
						int index67_819 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_819==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_819);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA67_723 = input.LA(1);
						 
						int index67_723 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_723=='s') ) {s = 502;}
						else if ( ((LA67_723 >= '\t' && LA67_723 <= '\n')||LA67_723=='\r'||LA67_723==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_723=='(') ) {s = 503;}
						else if ( (LA67_723=='M') ) {s = 504;}
						else if ( (LA67_723=='!'||(LA67_723 >= '&' && LA67_723 <= '\'')||(LA67_723 >= ',' && LA67_723 <= '.')||(LA67_723 >= '0' && LA67_723 <= ';')||LA67_723=='?'||(LA67_723 >= 'A' && LA67_723 <= 'L')||(LA67_723 >= 'N' && LA67_723 <= 'Z')||LA67_723=='_'||(LA67_723 >= 'a' && LA67_723 <= 'r')||(LA67_723 >= 't' && LA67_723 <= 'z')||LA67_723=='\u2019') ) {s = 42;}
						else s = 933;
						 
						input.seek(index67_723);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA67_294 = input.LA(1);
						 
						int index67_294 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_294=='s') ) {s = 502;}
						else if ( ((LA67_294 >= '\t' && LA67_294 <= '\n')||LA67_294=='\r'||LA67_294==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_294=='(') ) {s = 503;}
						else if ( (LA67_294=='M') ) {s = 504;}
						else if ( (LA67_294=='!'||(LA67_294 >= '&' && LA67_294 <= '\'')||(LA67_294 >= ',' && LA67_294 <= '.')||(LA67_294 >= '0' && LA67_294 <= ';')||LA67_294=='?'||(LA67_294 >= 'A' && LA67_294 <= 'L')||(LA67_294 >= 'N' && LA67_294 <= 'Z')||LA67_294=='_'||(LA67_294 >= 'a' && LA67_294 <= 'r')||(LA67_294 >= 't' && LA67_294 <= 'z')||LA67_294=='\u2019') ) {s = 42;}
						else s = 501;
						 
						input.seek(index67_294);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA67_1398 = input.LA(1);
						 
						int index67_1398 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1398=='s') ) {s = 502;}
						else if ( ((LA67_1398 >= '\t' && LA67_1398 <= '\n')||LA67_1398=='\r'||LA67_1398==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1398=='(') ) {s = 503;}
						else if ( (LA67_1398=='M') ) {s = 504;}
						else if ( (LA67_1398=='!'||(LA67_1398 >= '&' && LA67_1398 <= '\'')||(LA67_1398 >= ',' && LA67_1398 <= '.')||(LA67_1398 >= '0' && LA67_1398 <= ';')||LA67_1398=='?'||(LA67_1398 >= 'A' && LA67_1398 <= 'L')||(LA67_1398 >= 'N' && LA67_1398 <= 'Z')||LA67_1398=='_'||(LA67_1398 >= 'a' && LA67_1398 <= 'r')||(LA67_1398 >= 't' && LA67_1398 <= 'z')||LA67_1398=='\u2019') ) {s = 42;}
						else s = 1456;
						 
						input.seek(index67_1398);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA67_902 = input.LA(1);
						 
						int index67_902 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_902=='s') ) {s = 502;}
						else if ( ((LA67_902 >= '\t' && LA67_902 <= '\n')||LA67_902=='\r'||LA67_902==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_902=='(') ) {s = 503;}
						else if ( (LA67_902=='M') ) {s = 504;}
						else if ( (LA67_902=='!'||(LA67_902 >= '&' && LA67_902 <= '\'')||(LA67_902 >= ',' && LA67_902 <= '.')||(LA67_902 >= '0' && LA67_902 <= ';')||LA67_902=='?'||(LA67_902 >= 'A' && LA67_902 <= 'L')||(LA67_902 >= 'N' && LA67_902 <= 'Z')||LA67_902=='_'||(LA67_902 >= 'a' && LA67_902 <= 'r')||(LA67_902 >= 't' && LA67_902 <= 'z')||LA67_902=='\u2019') ) {s = 42;}
						else s = 1071;
						 
						input.seek(index67_902);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA67_1019 = input.LA(1);
						 
						int index67_1019 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1019==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1019);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA67_678 = input.LA(1);
						 
						int index67_678 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_678==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_678);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA67_1017 = input.LA(1);
						 
						int index67_1017 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1017==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1017);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA67_699 = input.LA(1);
						 
						int index67_699 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_699=='s') ) {s = 502;}
						else if ( ((LA67_699 >= '\t' && LA67_699 <= '\n')||LA67_699=='\r'||LA67_699==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_699=='(') ) {s = 503;}
						else if ( (LA67_699=='M') ) {s = 504;}
						else if ( (LA67_699=='!'||(LA67_699 >= '&' && LA67_699 <= '\'')||(LA67_699 >= ',' && LA67_699 <= '.')||(LA67_699 >= '0' && LA67_699 <= ';')||LA67_699=='?'||(LA67_699 >= 'A' && LA67_699 <= 'L')||(LA67_699 >= 'N' && LA67_699 <= 'Z')||LA67_699=='_'||(LA67_699 >= 'a' && LA67_699 <= 'r')||(LA67_699 >= 't' && LA67_699 <= 'z')||LA67_699=='\u2019') ) {s = 42;}
						else s = 898;
						 
						input.seek(index67_699);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA67_1069 = input.LA(1);
						 
						int index67_1069 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1069=='s') ) {s = 502;}
						else if ( ((LA67_1069 >= '\t' && LA67_1069 <= '\n')||LA67_1069=='\r'||LA67_1069==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1069=='(') ) {s = 503;}
						else if ( (LA67_1069=='M') ) {s = 504;}
						else if ( (LA67_1069=='!'||(LA67_1069 >= '&' && LA67_1069 <= '\'')||(LA67_1069 >= ',' && LA67_1069 <= '.')||(LA67_1069 >= '0' && LA67_1069 <= ';')||LA67_1069=='?'||(LA67_1069 >= 'A' && LA67_1069 <= 'L')||(LA67_1069 >= 'N' && LA67_1069 <= 'Z')||LA67_1069=='_'||(LA67_1069 >= 'a' && LA67_1069 <= 'r')||(LA67_1069 >= 't' && LA67_1069 <= 'z')||LA67_1069=='\u2019') ) {s = 42;}
						else s = 1212;
						 
						input.seek(index67_1069);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA67_825 = input.LA(1);
						 
						int index67_825 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_825==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_825);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA67_828 = input.LA(1);
						 
						int index67_828 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_828==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_828=='s') ) {s = 1019;}
						else s = 42;
						 
						input.seek(index67_828);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA67_1169 = input.LA(1);
						 
						int index67_1169 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1169==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1169);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA67_858 = input.LA(1);
						 
						int index67_858 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_858==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_858);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA67_856 = input.LA(1);
						 
						int index67_856 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_856==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_856);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA67_15 = input.LA(1);
						 
						int index67_15 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_15=='a') ) {s = 102;}
						else if ( (LA67_15=='e') ) {s = 103;}
						else if ( (LA67_15=='h') ) {s = 104;}
						else if ( (LA67_15=='\u00F6') && ((allowBreed))) {s = 105;}
						else if ( (LA67_15=='o') ) {s = 106;}
						else if ( (LA67_15=='U') ) {s = 107;}
						else s = 42;
						 
						input.seek(index67_15);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA67_447 = input.LA(1);
						 
						int index67_447 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_447==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_447);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA67_1192 = input.LA(1);
						 
						int index67_1192 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1192==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1192);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA67_1452 = input.LA(1);
						 
						int index67_1452 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1452==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1452);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA67_1579 = input.LA(1);
						 
						int index67_1579 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1579=='s') ) {s = 502;}
						else if ( ((LA67_1579 >= '\t' && LA67_1579 <= '\n')||LA67_1579=='\r'||LA67_1579==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1579=='(') ) {s = 503;}
						else if ( (LA67_1579=='M') ) {s = 504;}
						else if ( (LA67_1579=='!'||(LA67_1579 >= '&' && LA67_1579 <= '\'')||(LA67_1579 >= ',' && LA67_1579 <= '.')||(LA67_1579 >= '0' && LA67_1579 <= ';')||LA67_1579=='?'||(LA67_1579 >= 'A' && LA67_1579 <= 'L')||(LA67_1579 >= 'N' && LA67_1579 <= 'Z')||LA67_1579=='_'||(LA67_1579 >= 'a' && LA67_1579 <= 'r')||(LA67_1579 >= 't' && LA67_1579 <= 'z')||LA67_1579=='\u2019') ) {s = 42;}
						else s = 1596;
						 
						input.seek(index67_1579);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA67_658 = input.LA(1);
						 
						int index67_658 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_658==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_658);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA67_1382 = input.LA(1);
						 
						int index67_1382 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1382==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1382);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA67_1146 = input.LA(1);
						 
						int index67_1146 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1146=='s') ) {s = 502;}
						else if ( ((LA67_1146 >= '\t' && LA67_1146 <= '\n')||LA67_1146=='\r'||LA67_1146==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1146=='(') ) {s = 503;}
						else if ( (LA67_1146=='M') ) {s = 504;}
						else if ( (LA67_1146=='!'||(LA67_1146 >= '&' && LA67_1146 <= '\'')||(LA67_1146 >= ',' && LA67_1146 <= '.')||(LA67_1146 >= '0' && LA67_1146 <= ';')||LA67_1146=='?'||(LA67_1146 >= 'A' && LA67_1146 <= 'L')||(LA67_1146 >= 'N' && LA67_1146 <= 'Z')||LA67_1146=='_'||(LA67_1146 >= 'a' && LA67_1146 <= 'r')||(LA67_1146 >= 't' && LA67_1146 <= 'z')||LA67_1146=='\u2019') ) {s = 42;}
						else s = 1276;
						 
						input.seek(index67_1146);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA67_639 = input.LA(1);
						 
						int index67_639 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_639==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_639);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA67_1439 = input.LA(1);
						 
						int index67_1439 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1439=='s') ) {s = 502;}
						else if ( ((LA67_1439 >= '\t' && LA67_1439 <= '\n')||LA67_1439=='\r'||LA67_1439==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1439=='(') ) {s = 503;}
						else if ( (LA67_1439=='M') ) {s = 504;}
						else if ( (LA67_1439=='!'||(LA67_1439 >= '&' && LA67_1439 <= '\'')||(LA67_1439 >= ',' && LA67_1439 <= '.')||(LA67_1439 >= '0' && LA67_1439 <= ';')||LA67_1439=='?'||(LA67_1439 >= 'A' && LA67_1439 <= 'L')||(LA67_1439 >= 'N' && LA67_1439 <= 'Z')||LA67_1439=='_'||(LA67_1439 >= 'a' && LA67_1439 <= 'r')||(LA67_1439 >= 't' && LA67_1439 <= 'z')||LA67_1439=='\u2019') ) {s = 42;}
						else s = 1493;
						 
						input.seek(index67_1439);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA67_76 = input.LA(1);
						 
						int index67_76 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_76 >= '\t' && LA67_76 <= '\n')||LA67_76=='\r'||LA67_76==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_76);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA67_1387 = input.LA(1);
						 
						int index67_1387 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1387==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1387);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA67_237 = input.LA(1);
						 
						int index67_237 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_237 >= '\t' && LA67_237 <= '\n')||LA67_237=='\r'||LA67_237==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_237);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA67_37 = input.LA(1);
						 
						int index67_37 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_37 >= '\t' && LA67_37 <= '\n')||LA67_37=='\r'||LA67_37==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_37);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA67_379 = input.LA(1);
						 
						int index67_379 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_379 >= '\t' && LA67_379 <= '\n')||LA67_379=='\r'||LA67_379==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_379);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA67_843 = input.LA(1);
						 
						int index67_843 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_843==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_843);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA67_430 = input.LA(1);
						 
						int index67_430 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_430==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_430);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA67_971 = input.LA(1);
						 
						int index67_971 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_971=='s') ) {s = 502;}
						else if ( ((LA67_971 >= '\t' && LA67_971 <= '\n')||LA67_971=='\r'||LA67_971==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_971=='(') ) {s = 503;}
						else if ( (LA67_971=='M') ) {s = 504;}
						else if ( (LA67_971=='!'||(LA67_971 >= '&' && LA67_971 <= '\'')||(LA67_971 >= ',' && LA67_971 <= '.')||(LA67_971 >= '0' && LA67_971 <= ';')||LA67_971=='?'||(LA67_971 >= 'A' && LA67_971 <= 'L')||(LA67_971 >= 'N' && LA67_971 <= 'Z')||LA67_971=='_'||(LA67_971 >= 'a' && LA67_971 <= 'r')||(LA67_971 >= 't' && LA67_971 <= 'z')||LA67_971=='\u2019') ) {s = 42;}
						else s = 1139;
						 
						input.seek(index67_971);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA67_1185 = input.LA(1);
						 
						int index67_1185 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1185==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1185);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA67_1286 = input.LA(1);
						 
						int index67_1286 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1286==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1286);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA67_1186 = input.LA(1);
						 
						int index67_1186 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1186==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1186);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA67_851 = input.LA(1);
						 
						int index67_851 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_851==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_851);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA67_1501 = input.LA(1);
						 
						int index67_1501 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1501==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1501);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA67_697 = input.LA(1);
						 
						int index67_697 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_697==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_697=='s') ) {s = 896;}
						else s = 42;
						 
						input.seek(index67_697);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA67_179 = input.LA(1);
						 
						int index67_179 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_179 >= '\t' && LA67_179 <= '\n')||LA67_179=='\r'||LA67_179==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_179);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA67_1034 = input.LA(1);
						 
						int index67_1034 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1034==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1034);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA67_1035 = input.LA(1);
						 
						int index67_1035 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1035==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1035);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA67_437 = input.LA(1);
						 
						int index67_437 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_437==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_437);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA67_1134 = input.LA(1);
						 
						int index67_1134 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1134==' ') && ((allowGroup))) {s = 1268;}
						else s = 42;
						 
						input.seek(index67_1134);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA67_546 = input.LA(1);
						 
						int index67_546 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_546=='F') && ((allowBreed))) {s = 105;}
						else if ( (LA67_546=='V') ) {s = 761;}
						 
						input.seek(index67_546);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA67_879 = input.LA(1);
						 
						int index67_879 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_879==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_879);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA67_1498 = input.LA(1);
						 
						int index67_1498 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1498==' ') && ((allowGroup))) {s = 1530;}
						else s = 42;
						 
						input.seek(index67_1498);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA67_1265 = input.LA(1);
						 
						int index67_1265 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1265==' ') && ((allowGroup))) {s = 1278;}
						else s = 42;
						 
						input.seek(index67_1265);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA67_1016 = input.LA(1);
						 
						int index67_1016 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1016==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1016);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA67_339 = input.LA(1);
						 
						int index67_339 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_339==' ') && ((allowGroup))) {s = 549;}
						else s = 42;
						 
						input.seek(index67_339);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA67_1047 = input.LA(1);
						 
						int index67_1047 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1047==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1047);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA67_885 = input.LA(1);
						 
						int index67_885 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_885=='o') ) {s = 1058;}
						else if ( (LA67_885=='s') ) {s = 502;}
						else if ( ((LA67_885 >= '\t' && LA67_885 <= '\n')||LA67_885=='\r'||LA67_885==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_885=='(') ) {s = 503;}
						else if ( (LA67_885=='M') ) {s = 504;}
						else if ( (LA67_885=='!'||(LA67_885 >= '&' && LA67_885 <= '\'')||(LA67_885 >= ',' && LA67_885 <= '.')||(LA67_885 >= '0' && LA67_885 <= ';')||LA67_885=='?'||(LA67_885 >= 'A' && LA67_885 <= 'L')||(LA67_885 >= 'N' && LA67_885 <= 'Z')||LA67_885=='_'||(LA67_885 >= 'a' && LA67_885 <= 'n')||(LA67_885 >= 'p' && LA67_885 <= 'r')||(LA67_885 >= 't' && LA67_885 <= 'z')||LA67_885=='\u2019') ) {s = 42;}
						else s = 1059;
						 
						input.seek(index67_885);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA67_1052 = input.LA(1);
						 
						int index67_1052 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1052==' ') && ((allowGroup))) {s = 878;}
						else s = 42;
						 
						input.seek(index67_1052);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA67_1311 = input.LA(1);
						 
						int index67_1311 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1311==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1311);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA67_1054 = input.LA(1);
						 
						int index67_1054 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1054==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1054);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA67_869 = input.LA(1);
						 
						int index67_869 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_869==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_869);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA67_682 = input.LA(1);
						 
						int index67_682 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_682==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_682);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA67_502 = input.LA(1);
						 
						int index67_502 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_502 >= '\t' && LA67_502 <= '\n')||LA67_502=='\r'||LA67_502==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_502=='(') ) {s = 503;}
						else if ( (LA67_502=='M') ) {s = 504;}
						else if ( (LA67_502=='!'||(LA67_502 >= '&' && LA67_502 <= '\'')||(LA67_502 >= ',' && LA67_502 <= '.')||(LA67_502 >= '0' && LA67_502 <= ';')||LA67_502=='?'||(LA67_502 >= 'A' && LA67_502 <= 'L')||(LA67_502 >= 'N' && LA67_502 <= 'Z')||LA67_502=='_'||(LA67_502 >= 'a' && LA67_502 <= 'z')||LA67_502=='\u2019') ) {s = 42;}
						else s = 705;
						 
						input.seek(index67_502);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA67_1202 = input.LA(1);
						 
						int index67_1202 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1202=='e') ) {s = 1312;}
						else if ( (LA67_1202=='s') ) {s = 502;}
						else if ( ((LA67_1202 >= '\t' && LA67_1202 <= '\n')||LA67_1202=='\r'||LA67_1202==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1202=='(') ) {s = 503;}
						else if ( (LA67_1202=='M') ) {s = 504;}
						else if ( (LA67_1202=='!'||(LA67_1202 >= '&' && LA67_1202 <= '\'')||(LA67_1202 >= ',' && LA67_1202 <= '.')||(LA67_1202 >= '0' && LA67_1202 <= ';')||LA67_1202=='?'||(LA67_1202 >= 'A' && LA67_1202 <= 'L')||(LA67_1202 >= 'N' && LA67_1202 <= 'Z')||LA67_1202=='_'||(LA67_1202 >= 'a' && LA67_1202 <= 'd')||(LA67_1202 >= 'f' && LA67_1202 <= 'r')||(LA67_1202 >= 't' && LA67_1202 <= 'z')||LA67_1202=='\u2019') ) {s = 42;}
						else s = 1313;
						 
						input.seek(index67_1202);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA67_1201 = input.LA(1);
						 
						int index67_1201 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1201==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1201);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA67_249 = input.LA(1);
						 
						int index67_249 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_249==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_249);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA67_866 = input.LA(1);
						 
						int index67_866 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_866==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_866);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA67_1453 = input.LA(1);
						 
						int index67_1453 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1453==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1453);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA67_1246 = input.LA(1);
						 
						int index67_1246 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1246==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1246);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA67_831 = input.LA(1);
						 
						int index67_831 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_831==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_831);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA67_461 = input.LA(1);
						 
						int index67_461 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_461==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_461);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA67_665 = input.LA(1);
						 
						int index67_665 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_665==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_665);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA67_870 = input.LA(1);
						 
						int index67_870 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_870==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_870);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA67_1023 = input.LA(1);
						 
						int index67_1023 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1023==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1023=='s') ) {s = 1180;}
						else s = 42;
						 
						input.seek(index67_1023);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA67_871 = input.LA(1);
						 
						int index67_871 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_871==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_871);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA67_774 = input.LA(1);
						 
						int index67_774 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_774==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_774);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA67_997 = input.LA(1);
						 
						int index67_997 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_997==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_997);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA67_1256 = input.LA(1);
						 
						int index67_1256 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1256==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1256);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA67_385 = input.LA(1);
						 
						int index67_385 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_385==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_385);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA67_77 = input.LA(1);
						 
						int index67_77 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_77 >= '\t' && LA67_77 <= '\n')||LA67_77=='\r'||LA67_77==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_77);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA67_378 = input.LA(1);
						 
						int index67_378 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_378 >= '\t' && LA67_378 <= '\n')||LA67_378=='\r'||LA67_378==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_378);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA67_999 = input.LA(1);
						 
						int index67_999 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_999==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_999);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA67_564 = input.LA(1);
						 
						int index67_564 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_564==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_564=='h') ) {s = 777;}
						else s = 42;
						 
						input.seek(index67_564);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA67_38 = input.LA(1);
						 
						int index67_38 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_38 >= '\t' && LA67_38 <= '\n')||LA67_38=='\r'||LA67_38==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_38);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA67_181 = input.LA(1);
						 
						int index67_181 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA67_181 >= '\t' && LA67_181 <= '\n')||LA67_181=='\r'||LA67_181==' ') && ((allowJudge))) {s = 180;}
						else s = 42;
						 
						input.seek(index67_181);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA67_186 = input.LA(1);
						 
						int index67_186 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_186==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_186);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA67_893 = input.LA(1);
						 
						int index67_893 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_893==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_893);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA67_1211 = input.LA(1);
						 
						int index67_1211 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1211==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1211);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA67_896 = input.LA(1);
						 
						int index67_896 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_896==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_896);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA67_1641 = input.LA(1);
						 
						int index67_1641 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1641);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA67_1596 = input.LA(1);
						 
						int index67_1596 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1596);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA67_1590 = input.LA(1);
						 
						int index67_1590 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1590);
						if ( s>=0 ) return s;
						break;

					case 180 : 
						int LA67_1576 = input.LA(1);
						 
						int index67_1576 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1576);
						if ( s>=0 ) return s;
						break;

					case 181 : 
						int LA67_1574 = input.LA(1);
						 
						int index67_1574 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1574);
						if ( s>=0 ) return s;
						break;

					case 182 : 
						int LA67_1557 = input.LA(1);
						 
						int index67_1557 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1557);
						if ( s>=0 ) return s;
						break;

					case 183 : 
						int LA67_724 = input.LA(1);
						 
						int index67_724 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_724);
						if ( s>=0 ) return s;
						break;

					case 184 : 
						int LA67_705 = input.LA(1);
						 
						int index67_705 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_705);
						if ( s>=0 ) return s;
						break;

					case 185 : 
						int LA67_501 = input.LA(1);
						 
						int index67_501 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_501);
						if ( s>=0 ) return s;
						break;

					case 186 : 
						int LA67_811 = input.LA(1);
						 
						int index67_811 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_811);
						if ( s>=0 ) return s;
						break;

					case 187 : 
						int LA67_835 = input.LA(1);
						 
						int index67_835 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_835);
						if ( s>=0 ) return s;
						break;

					case 188 : 
						int LA67_837 = input.LA(1);
						 
						int index67_837 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_837);
						if ( s>=0 ) return s;
						break;

					case 189 : 
						int LA67_898 = input.LA(1);
						 
						int index67_898 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_898);
						if ( s>=0 ) return s;
						break;

					case 190 : 
						int LA67_933 = input.LA(1);
						 
						int index67_933 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_933);
						if ( s>=0 ) return s;
						break;

					case 191 : 
						int LA67_1012 = input.LA(1);
						 
						int index67_1012 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1012);
						if ( s>=0 ) return s;
						break;

					case 192 : 
						int LA67_1022 = input.LA(1);
						 
						int index67_1022 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1022);
						if ( s>=0 ) return s;
						break;

					case 193 : 
						int LA67_1024 = input.LA(1);
						 
						int index67_1024 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1024);
						if ( s>=0 ) return s;
						break;

					case 194 : 
						int LA67_1036 = input.LA(1);
						 
						int index67_1036 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1036);
						if ( s>=0 ) return s;
						break;

					case 195 : 
						int LA67_1059 = input.LA(1);
						 
						int index67_1059 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1059);
						if ( s>=0 ) return s;
						break;

					case 196 : 
						int LA67_1071 = input.LA(1);
						 
						int index67_1071 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1071);
						if ( s>=0 ) return s;
						break;

					case 197 : 
						int LA67_1113 = input.LA(1);
						 
						int index67_1113 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1113);
						if ( s>=0 ) return s;
						break;

					case 198 : 
						int LA67_1139 = input.LA(1);
						 
						int index67_1139 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1139);
						if ( s>=0 ) return s;
						break;

					case 199 : 
						int LA67_1157 = input.LA(1);
						 
						int index67_1157 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1157);
						if ( s>=0 ) return s;
						break;

					case 200 : 
						int LA67_1158 = input.LA(1);
						 
						int index67_1158 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1158);
						if ( s>=0 ) return s;
						break;

					case 201 : 
						int LA67_1174 = input.LA(1);
						 
						int index67_1174 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1174);
						if ( s>=0 ) return s;
						break;

					case 202 : 
						int LA67_1183 = input.LA(1);
						 
						int index67_1183 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1183);
						if ( s>=0 ) return s;
						break;

					case 203 : 
						int LA67_1198 = input.LA(1);
						 
						int index67_1198 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1198);
						if ( s>=0 ) return s;
						break;

					case 204 : 
						int LA67_1208 = input.LA(1);
						 
						int index67_1208 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1208);
						if ( s>=0 ) return s;
						break;

					case 205 : 
						int LA67_1212 = input.LA(1);
						 
						int index67_1212 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1212);
						if ( s>=0 ) return s;
						break;

					case 206 : 
						int LA67_1253 = input.LA(1);
						 
						int index67_1253 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1253);
						if ( s>=0 ) return s;
						break;

					case 207 : 
						int LA67_1258 = input.LA(1);
						 
						int index67_1258 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1258);
						if ( s>=0 ) return s;
						break;

					case 208 : 
						int LA67_1276 = input.LA(1);
						 
						int index67_1276 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1276);
						if ( s>=0 ) return s;
						break;

					case 209 : 
						int LA67_1299 = input.LA(1);
						 
						int index67_1299 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1299);
						if ( s>=0 ) return s;
						break;

					case 210 : 
						int LA67_1310 = input.LA(1);
						 
						int index67_1310 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1310);
						if ( s>=0 ) return s;
						break;

					case 211 : 
						int LA67_1313 = input.LA(1);
						 
						int index67_1313 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1313);
						if ( s>=0 ) return s;
						break;

					case 212 : 
						int LA67_1314 = input.LA(1);
						 
						int index67_1314 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1314);
						if ( s>=0 ) return s;
						break;

					case 213 : 
						int LA67_1315 = input.LA(1);
						 
						int index67_1315 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1315);
						if ( s>=0 ) return s;
						break;

					case 214 : 
						int LA67_1317 = input.LA(1);
						 
						int index67_1317 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1317);
						if ( s>=0 ) return s;
						break;

					case 215 : 
						int LA67_1354 = input.LA(1);
						 
						int index67_1354 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1354);
						if ( s>=0 ) return s;
						break;

					case 216 : 
						int LA67_1362 = input.LA(1);
						 
						int index67_1362 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1362);
						if ( s>=0 ) return s;
						break;

					case 217 : 
						int LA67_1383 = input.LA(1);
						 
						int index67_1383 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1383);
						if ( s>=0 ) return s;
						break;

					case 218 : 
						int LA67_1388 = input.LA(1);
						 
						int index67_1388 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1388);
						if ( s>=0 ) return s;
						break;

					case 219 : 
						int LA67_1390 = input.LA(1);
						 
						int index67_1390 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1390);
						if ( s>=0 ) return s;
						break;

					case 220 : 
						int LA67_1391 = input.LA(1);
						 
						int index67_1391 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1391);
						if ( s>=0 ) return s;
						break;

					case 221 : 
						int LA67_1394 = input.LA(1);
						 
						int index67_1394 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1394);
						if ( s>=0 ) return s;
						break;

					case 222 : 
						int LA67_1397 = input.LA(1);
						 
						int index67_1397 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1397);
						if ( s>=0 ) return s;
						break;

					case 223 : 
						int LA67_1444 = input.LA(1);
						 
						int index67_1444 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1444);
						if ( s>=0 ) return s;
						break;

					case 224 : 
						int LA67_1449 = input.LA(1);
						 
						int index67_1449 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1449);
						if ( s>=0 ) return s;
						break;

					case 225 : 
						int LA67_1454 = input.LA(1);
						 
						int index67_1454 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1454);
						if ( s>=0 ) return s;
						break;

					case 226 : 
						int LA67_1455 = input.LA(1);
						 
						int index67_1455 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1455);
						if ( s>=0 ) return s;
						break;

					case 227 : 
						int LA67_1456 = input.LA(1);
						 
						int index67_1456 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1456);
						if ( s>=0 ) return s;
						break;

					case 228 : 
						int LA67_1486 = input.LA(1);
						 
						int index67_1486 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1486);
						if ( s>=0 ) return s;
						break;

					case 229 : 
						int LA67_1487 = input.LA(1);
						 
						int index67_1487 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1487);
						if ( s>=0 ) return s;
						break;

					case 230 : 
						int LA67_1488 = input.LA(1);
						 
						int index67_1488 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1488);
						if ( s>=0 ) return s;
						break;

					case 231 : 
						int LA67_1493 = input.LA(1);
						 
						int index67_1493 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1493);
						if ( s>=0 ) return s;
						break;

					case 232 : 
						int LA67_1500 = input.LA(1);
						 
						int index67_1500 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1500);
						if ( s>=0 ) return s;
						break;

					case 233 : 
						int LA67_1529 = input.LA(1);
						 
						int index67_1529 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 105;}
						else if ( (true) ) {s = 42;}
						 
						input.seek(index67_1529);
						if ( s>=0 ) return s;
						break;

					case 234 : 
						int LA67_1205 = input.LA(1);
						 
						int index67_1205 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1205==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1205);
						if ( s>=0 ) return s;
						break;

					case 235 : 
						int LA67_1061 = input.LA(1);
						 
						int index67_1061 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1061==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1061);
						if ( s>=0 ) return s;
						break;

					case 236 : 
						int LA67_1206 = input.LA(1);
						 
						int index67_1206 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1206==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1206);
						if ( s>=0 ) return s;
						break;

					case 237 : 
						int LA67_689 = input.LA(1);
						 
						int index67_689 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_689==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_689);
						if ( s>=0 ) return s;
						break;

					case 238 : 
						int LA67_1260 = input.LA(1);
						 
						int index67_1260 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1260==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1260);
						if ( s>=0 ) return s;
						break;

					case 239 : 
						int LA67_1375 = input.LA(1);
						 
						int index67_1375 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1375==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1375);
						if ( s>=0 ) return s;
						break;

					case 240 : 
						int LA67_619 = input.LA(1);
						 
						int index67_619 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_619==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_619);
						if ( s>=0 ) return s;
						break;

					case 241 : 
						int LA67_1531 = input.LA(1);
						 
						int index67_1531 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1531=='s') ) {s = 502;}
						else if ( ((LA67_1531 >= '\t' && LA67_1531 <= '\n')||LA67_1531=='\r'||LA67_1531==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_1531=='(') ) {s = 503;}
						else if ( (LA67_1531=='M') ) {s = 504;}
						else if ( (LA67_1531=='!'||(LA67_1531 >= '&' && LA67_1531 <= '\'')||(LA67_1531 >= ',' && LA67_1531 <= '.')||(LA67_1531 >= '0' && LA67_1531 <= ';')||LA67_1531=='?'||(LA67_1531 >= 'A' && LA67_1531 <= 'L')||(LA67_1531 >= 'N' && LA67_1531 <= 'Z')||LA67_1531=='_'||(LA67_1531 >= 'a' && LA67_1531 <= 'r')||(LA67_1531 >= 't' && LA67_1531 <= 'z')||LA67_1531=='\u2019') ) {s = 42;}
						else s = 1557;
						 
						input.seek(index67_1531);
						if ( s>=0 ) return s;
						break;

					case 242 : 
						int LA67_601 = input.LA(1);
						 
						int index67_601 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_601=='s') ) {s = 502;}
						else if ( ((LA67_601 >= '\t' && LA67_601 <= '\n')||LA67_601=='\r'||LA67_601==' ') && ((allowBreed))) {s = 105;}
						else if ( (LA67_601=='(') ) {s = 503;}
						else if ( (LA67_601=='M') ) {s = 504;}
						else if ( (LA67_601=='!'||(LA67_601 >= '&' && LA67_601 <= '\'')||(LA67_601 >= ',' && LA67_601 <= '.')||(LA67_601 >= '0' && LA67_601 <= ';')||LA67_601=='?'||(LA67_601 >= 'A' && LA67_601 <= 'L')||(LA67_601 >= 'N' && LA67_601 <= 'Z')||LA67_601=='_'||(LA67_601 >= 'a' && LA67_601 <= 'r')||(LA67_601 >= 't' && LA67_601 <= 'z')||LA67_601=='\u2019') ) {s = 42;}
						else s = 811;
						 
						input.seek(index67_601);
						if ( s>=0 ) return s;
						break;

					case 243 : 
						int LA67_1033 = input.LA(1);
						 
						int index67_1033 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1033==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1033);
						if ( s>=0 ) return s;
						break;

					case 244 : 
						int LA67_1377 = input.LA(1);
						 
						int index67_1377 = input.index();
						input.rewind();
						s = -1;
						if ( (LA67_1377==' ') && ((allowBreed))) {s = 105;}
						else s = 42;
						 
						input.seek(index67_1377);
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
