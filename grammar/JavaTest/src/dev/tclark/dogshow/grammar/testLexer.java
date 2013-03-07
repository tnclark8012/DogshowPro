// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-03-07 00:19:12

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
	public static final int PARENTHETICAL=33;
	public static final int PARENTHETICAL_INT=34;
	public static final int PARENTHETICAL_NAME=35;
	public static final int PHONE_NUMBER=36;
	public static final int PROPER_NAME=37;
	public static final int RING_TITLE=38;
	public static final int SPECIAL_SUFFIX=39;
	public static final int STANDALONE_COMMENT=40;
	public static final int TIME=41;
	public static final int WORD=42;
	public static final int WS=43;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:9: 'Master Class'
					{
					match("Master Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:9: 'Open Senior'
					{
					match("Open Senior"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:113:9: 'Open Intermediate'
					{
					match("Open Intermediate"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:114:9: 'Open Junior'
					{
					match("Open Junior"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:115:9: 'Novice Senior'
					{
					match("Novice Senior"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:116:9: 'Novice Junior'
					{
					match("Novice Junior"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:117:9: 'Novice Intermediate'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:110:5: ({...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:110:7: {...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "FRAG_BREED_NAME_SINGLE", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:110:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=192;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:110:24: 'Affenpinscher'
					{
					match("Affenpinscher"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:111:5: 'Afghan Hound'
					{
					match("Afghan Hound"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:113:5: 'Akita'
					{
					match("Akita"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:114:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:115:5: 'American English Coonhound'
					{
					match("American English Coonhound"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:116:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:117:5: 'American Foxhound'
					{
					match("American Foxhound"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:118:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:119:5: 'American Water Spaniel'
					{
					match("American Water Spaniel"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:120:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:122:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:123:5: 'Australian Terrier'
					{
					match("Australian Terrier"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:124:5: 'Basenji'
					{
					match("Basenji"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:125:5: 'Basset Hound'
					{
					match("Basset Hound"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:5: 'Beagle'
					{
					match("Beagle"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:127:5: 'Bearded Collie'
					{
					match("Bearded Collie"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:128:5: 'Beauceron'
					{
					match("Beauceron"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:129:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:130:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:131:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:132:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:133:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:5: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:5: 'Bichons Frise'
					{
					match("Bichons Frise"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:136:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:137:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:139:5: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:140:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:5: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:142:5: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:143:5: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:5: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:145:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:146:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:147:5: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:149:5: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:150:5: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:152:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:153:5: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:154:5: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:5: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:156:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:157:5: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:158:5: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:160:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:161:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:163:5: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:164:5: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:165:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:167:5: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:168:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:170:5: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:172:5: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:173:5: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:174:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:175:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:176:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:179:5: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:5: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:183:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:5: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:188:5: 'Fox Terrier'
					{
					match("Fox Terrier"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:5: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:5: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:191:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:5: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:5: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:198:5: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:199:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:5: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:202:5: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:5: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:205:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:5: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:5: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:5: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:5: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:214:5: 'Keeshonden'
					{
					match("Keeshonden"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:215:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:5: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:5: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:218:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:219:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:221:5: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:5: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:224:5: 'Lowchen'
					{
					match("Lowchen"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:225:5: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:226:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:5: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:5: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:5: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:5: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:5: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:5: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:5: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:5: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:5: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:5: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:5: 'Pulik'
					{
					match("Pulik"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: 'Retrievers'
					{
					match("Retrievers"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:263:5: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:5: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:5: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:5: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:272:5: 'Setters'
					{
					match("Setters"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:273:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:5: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:275:5: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:276:5: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:277:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:5: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:5: 'Spaniels'
					{
					match("Spaniels"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:283:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:286:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:287:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:289:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:290:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:292:5: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:5: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:5: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 191 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 192 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:5: 'Yorkshire Terrier'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:5: ({...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:7: {...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "BREED_NAME", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:22: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:23: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:46: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:67: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:67: 's'
					{
					match('s'); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:72: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:72: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:76: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='(') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='M') ) {
					int LA8_3 = input.LA(3);
					if ( (LA8_3=='i') ) {
						int LA8_5 = input.LA(4);
						if ( (LA8_5=='n') ) {
							alt8=1;
						}
					}
				}
				else if ( (LA8_1=='1'||(LA8_1 >= 'B' && LA8_1 <= 'C')||(LA8_1 >= 'E' && LA8_1 <= 'G')||LA8_1=='I'||(LA8_1 >= 'K' && LA8_1 <= 'L')||LA8_1=='N'||(LA8_1 >= 'R' && LA8_1 <= 'T')||LA8_1=='W') ) {
					alt8=1;
				}
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:77: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); 
					mFRAG_BREED_NAME_CATEGORY(); 

					match(')'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:110: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:110: WS
							{
							mWS(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:114: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:114: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); 

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:150: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='(') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:150: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:5: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:10: FRAG_BREED_NAME_SPECIAL_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:5: ( '(Misc. Dog)' | '(Misc. Dogs)' | '(Misc. Bitch)' | '(Misc. Bitches)' )
			int alt10=4;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='(') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='M') ) {
					int LA10_2 = input.LA(3);
					if ( (LA10_2=='i') ) {
						int LA10_3 = input.LA(4);
						if ( (LA10_3=='s') ) {
							int LA10_4 = input.LA(5);
							if ( (LA10_4=='c') ) {
								int LA10_5 = input.LA(6);
								if ( (LA10_5=='.') ) {
									int LA10_6 = input.LA(7);
									if ( (LA10_6==' ') ) {
										int LA10_7 = input.LA(8);
										if ( (LA10_7=='D') ) {
											int LA10_8 = input.LA(9);
											if ( (LA10_8=='o') ) {
												int LA10_10 = input.LA(10);
												if ( (LA10_10=='g') ) {
													int LA10_12 = input.LA(11);
													if ( (LA10_12==')') ) {
														alt10=1;
													}
													else if ( (LA10_12=='s') ) {
														alt10=2;
													}
													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++)
																input.consume();
															NoViableAltException nvae =
																new NoViableAltException("", 10, 12, input);
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
															new NoViableAltException("", 10, 10, input);
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
														new NoViableAltException("", 10, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else if ( (LA10_7=='B') ) {
											int LA10_9 = input.LA(9);
											if ( (LA10_9=='i') ) {
												int LA10_11 = input.LA(10);
												if ( (LA10_11=='t') ) {
													int LA10_13 = input.LA(11);
													if ( (LA10_13=='c') ) {
														int LA10_16 = input.LA(12);
														if ( (LA10_16=='h') ) {
															int LA10_17 = input.LA(13);
															if ( (LA10_17==')') ) {
																alt10=3;
															}
															else if ( (LA10_17=='e') ) {
																alt10=4;
															}
															else {
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++)
																		input.consume();
																	NoViableAltException nvae =
																		new NoViableAltException("", 10, 17, input);
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
																	new NoViableAltException("", 10, 16, input);
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
																new NoViableAltException("", 10, 13, input);
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
															new NoViableAltException("", 10, 11, input);
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
														new NoViableAltException("", 10, 9, input);
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
													new NoViableAltException("", 10, 7, input);
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 10, 3, input);
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
								new NoViableAltException("", 10, 2, input);
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
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:9: '(Misc. Dog)'
					{
					match("(Misc. Dog)"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:23: '(Misc. Dogs)'
					{
					match("(Misc. Dogs)"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:38: '(Misc. Bitch)'
					{
					match("(Misc. Bitch)"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:54: '(Misc. Bitches)'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:5: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			int alt11=4;
			switch ( input.LA(1) ) {
			case 'S':
				{
				alt11=1;
				}
				break;
			case 'E':
				{
				int LA11_2 = input.LA(2);
				if ( (LA11_2=='n') ) {
					int LA11_4 = input.LA(3);
					if ( (LA11_4=='t') ) {
						int LA11_5 = input.LA(4);
						if ( (LA11_5=='r') ) {
							int LA11_6 = input.LA(5);
							if ( (LA11_6=='y') ) {
								alt11=2;
							}
							else if ( (LA11_6=='i') ) {
								alt11=3;
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
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
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
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
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
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
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'V':
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:10: 'Sweepstakes'
					{
					match("Sweepstakes"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:24: 'Entry'
					{
					match("Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:32: 'Entries'
					{
					match("Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:42: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:29: ( 'Veteran Dog' | 'Veteran Bitch' | 'Veteran Bitche' )
			int alt12=3;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='V') ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='e') ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2=='t') ) {
						int LA12_3 = input.LA(4);
						if ( (LA12_3=='e') ) {
							int LA12_4 = input.LA(5);
							if ( (LA12_4=='r') ) {
								int LA12_5 = input.LA(6);
								if ( (LA12_5=='a') ) {
									int LA12_6 = input.LA(7);
									if ( (LA12_6=='n') ) {
										int LA12_7 = input.LA(8);
										if ( (LA12_7==' ') ) {
											int LA12_8 = input.LA(9);
											if ( (LA12_8=='D') ) {
												alt12=1;
											}
											else if ( (LA12_8=='B') ) {
												int LA12_10 = input.LA(10);
												if ( (LA12_10=='i') ) {
													int LA12_11 = input.LA(11);
													if ( (LA12_11=='t') ) {
														int LA12_12 = input.LA(12);
														if ( (LA12_12=='c') ) {
															int LA12_13 = input.LA(13);
															if ( (LA12_13=='h') ) {
																int LA12_14 = input.LA(14);
																if ( (LA12_14=='e') ) {
																	alt12=3;
																}
																else {
																	alt12=2;
																}
															}
															else {
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++)
																		input.consume();
																	NoViableAltException nvae =
																		new NoViableAltException("", 12, 13, input);
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
																	new NoViableAltException("", 12, 12, input);
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
																new NoViableAltException("", 12, 11, input);
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
															new NoViableAltException("", 12, 10, input);
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
														new NoViableAltException("", 12, 8, input);
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
													new NoViableAltException("", 12, 7, input);
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
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:33: 'Veteran Dog'
					{
					match("Veteran Dog"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:47: 'Veteran Bitch'
					{
					match("Veteran Bitch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:63: 'Veteran Bitche'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
			int alt13=3;
			switch ( input.LA(1) ) {
			case 'A':
				{
				alt13=1;
				}
				break;
			case 'P':
				{
				alt13=2;
				}
				break;
			case 'B':
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:9: 'Ascob'
					{
					match("Ascob"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:17: 'Parti-Color'
					{
					match("Parti-Color"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:31: 'Black'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:5: ( '13 Inch' | '15 Inch' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt14=35;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:9: '13 Inch'
					{
					match("13 Inch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:9: '15 Inch'
					{
					match("15 Inch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:9: 'Boykin'
					{
					match("Boykin"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:9: 'B & P C'
					{
					match("B & P C"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:9: 'Clumber'
					{
					match("Clumber"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:9: 'Cocker'
					{
					match("Cocker"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:9: 'Colored'
					{
					match("Colored"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:9: 'Curly-Coated'
					{
					match("Curly-Coated"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:9: 'English'
					{
					match("English"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:9: 'English Cocker'
					{
					match("English Cocker"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:9: 'English Springer'
					{
					match("English Springer"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:9: 'Field'
					{
					match("Field"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:9: 'Flat-Coated'
					{
					match("Flat-Coated"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:9: 'German Shorthaired'
					{
					match("German Shorthaired"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:9: 'German Wirehaired'
					{
					match("German Wirehaired"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:9: 'Golden'
					{
					match("Golden"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:9: 'Gordon'
					{
					match("Gordon"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:9: 'Irish'
					{
					match("Irish"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:9: 'K C & R'
					{
					match("K C & R"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:9: 'Labrador'
					{
					match("Labrador"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:9: 'Long Coat'
					{
					match("Long Coat"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:341:9: 'Longhaired'
					{
					match("Longhaired"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:342:9: 'Miniature'
					{
					match("Miniature"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:343:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:9: 'Rough'
					{
					match("Rough"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:345:9: 'Smooth'
					{
					match("Smooth"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:9: 'Smooth Coat'
					{
					match("Smooth Coat"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:9: 'Standard'
					{
					match("Standard"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:9: 'Sussex'
					{
					match("Sussex"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:9: 'Toy'
					{
					match("Toy"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:9: 'Welsh Springer'
					{
					match("Welsh Springer"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:9: 'White'
					{
					match("White"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:9: 'Wire'
					{
					match("Wire"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:9: 'Wirehaired'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:2: ({...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | 'BEST IN SHOW' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:3: {...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | 'BEST IN SHOW' )
			{
			if ( !((allowGroup)) ) {
				throw new FailedPredicateException(input, "FRAG_GROUP_NAME", "allowGroup");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:18: ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | 'BEST IN SHOW' )
			int alt15=8;
			switch ( input.LA(1) ) {
			case 'H':
				{
				int LA15_1 = input.LA(2);
				if ( (LA15_1=='E') ) {
					alt15=1;
				}
				else if ( (LA15_1=='O') ) {
					alt15=6;
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
				break;
			case 'T':
				{
				int LA15_2 = input.LA(2);
				if ( (LA15_2=='E') ) {
					alt15=2;
				}
				else if ( (LA15_2=='O') ) {
					alt15=5;
				}
				else {
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
			case 'N':
				{
				alt15=3;
				}
				break;
			case 'S':
				{
				alt15=4;
				}
				break;
			case 'W':
				{
				alt15=7;
				}
				break;
			case 'B':
				{
				alt15=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:20: 'HERDING GROUP'
					{
					match("HERDING GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:3: 'TERRIER GROUP'
					{
					match("TERRIER GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:3: 'NON-SPORTING GROUP'
					{
					match("NON-SPORTING GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:3: 'SPORTING GROUP'
					{
					match("SPORTING GROUP"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:3: 'TOY GROUP'
					{
					match("TOY GROUP"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:3: 'HOUND GROUP'
					{
					match("HOUND GROUP"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:3: 'WORKING GROUP'
					{
					match("WORKING GROUP"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:3: 'BEST IN SHOW'
					{
					match("BEST IN SHOW"); 

					allowGroup=false;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
			int alt16=4;
			switch ( input.LA(1) ) {
			case 'V':
				{
				alt16=1;
				}
				break;
			case 'S':
				{
				alt16=2;
				}
				break;
			case 'R':
				{
				alt16=3;
				}
				break;
			case 'T':
				{
				alt16=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:3: 'Toy Variety Group'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:2: ( ( FRAG_GROUP_NAME ' - ' JUDGE_NAME ) | FRAG_SPECIAL_GROUP_NAME )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='B'||LA17_0=='H'||LA17_0=='N'||LA17_0=='W') && ((allowGroup))) {
				alt17=1;
			}
			else if ( (LA17_0=='T') ) {
				int LA17_2 = input.LA(2);
				if ( (LA17_2=='E'||LA17_2=='O') && ((allowGroup))) {
					alt17=1;
				}
				else if ( (LA17_2=='o') ) {
					alt17=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA17_0=='S') ) {
				int LA17_3 = input.LA(2);
				if ( (LA17_3=='P') && ((allowGroup))) {
					alt17=1;
				}
				else if ( (LA17_3=='W') ) {
					alt17=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA17_0=='R'||LA17_0=='V') ) {
				alt17=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:5: FRAG_GROUP_NAME ' - ' JUDGE_NAME
					{
					mFRAG_GROUP_NAME(); 

					match(" - "); 

					mJUDGE_NAME(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:39: FRAG_SPECIAL_GROUP_NAME
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

	// $ANTLR start "FRAG_MONTH"
	public final void mFRAG_MONTH() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
			int alt18=24;
			switch ( input.LA(1) ) {
			case 'J':
				{
				switch ( input.LA(2) ) {
				case 'a':
					{
					alt18=1;
					}
					break;
				case 'A':
					{
					alt18=2;
					}
					break;
				case 'u':
					{
					int LA18_11 = input.LA(3);
					if ( (LA18_11=='n') ) {
						alt18=11;
					}
					else if ( (LA18_11=='l') ) {
						alt18=13;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 18, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'U':
					{
					int LA18_12 = input.LA(3);
					if ( (LA18_12=='N') ) {
						alt18=12;
					}
					else if ( (LA18_12=='L') ) {
						alt18=14;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 18, 12, input);
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
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA18_2 = input.LA(2);
				if ( (LA18_2=='e') ) {
					alt18=3;
				}
				else if ( (LA18_2=='E') ) {
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
			case 'M':
				{
				int LA18_3 = input.LA(2);
				if ( (LA18_3=='a') ) {
					int LA18_15 = input.LA(3);
					if ( (LA18_15=='r') ) {
						alt18=5;
					}
					else if ( (LA18_15=='y') ) {
						alt18=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 18, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA18_3=='A') ) {
					int LA18_16 = input.LA(3);
					if ( (LA18_16=='R') ) {
						alt18=6;
					}
					else if ( (LA18_16=='Y') ) {
						alt18=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 18, 16, input);
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
							new NoViableAltException("", 18, 3, input);
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
					alt18=7;
					}
					break;
				case 'P':
					{
					alt18=8;
					}
					break;
				case 'u':
					{
					alt18=15;
					}
					break;
				case 'U':
					{
					alt18=16;
					}
					break;
				default:
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
			case 'S':
				{
				int LA18_5 = input.LA(2);
				if ( (LA18_5=='e') ) {
					alt18=17;
				}
				else if ( (LA18_5=='E') ) {
					alt18=18;
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
			case 'O':
				{
				int LA18_6 = input.LA(2);
				if ( (LA18_6=='c') ) {
					alt18=19;
				}
				else if ( (LA18_6=='C') ) {
					alt18=20;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
				{
				int LA18_7 = input.LA(2);
				if ( (LA18_7=='o') ) {
					alt18=21;
				}
				else if ( (LA18_7=='O') ) {
					alt18=22;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'D':
				{
				int LA18_8 = input.LA(2);
				if ( (LA18_8=='e') ) {
					alt18=23;
				}
				else if ( (LA18_8=='E') ) {
					alt18=24;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 8, input);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:14: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:25: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:14: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:22: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:14: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:22: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:14: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:20: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:14: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:21: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:14: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:21: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:14: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:23: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:14: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:14: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:24: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:14: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:25: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:14: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:25: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:29: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:25: ( 'RING' | 'Ring' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='R') ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1=='I') ) {
					alt19=1;
				}
				else if ( (LA19_1=='i') ) {
					alt19=2;
				}
				else {
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
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:29: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:5: ( 'am' | 'pm' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='a') ) {
				alt20=1;
			}
			else if ( (LA20_0=='p') ) {
				alt20=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
			int alt21=12;
			switch ( input.LA(1) ) {
			case 'M':
				{
				switch ( input.LA(2) ) {
				case 'R':
					{
					int LA21_4 = input.LA(3);
					if ( (LA21_4=='S') ) {
						alt21=3;
					}
					else {
						alt21=1;
					}
					}
					break;
				case 'r':
					{
					int LA21_5 = input.LA(3);
					if ( (LA21_5=='s') ) {
						alt21=4;
					}
					else {
						alt21=2;
					}
					}
					break;
				case 'S':
					{
					alt21=5;
					}
					break;
				case 's':
					{
					alt21=6;
					}
					break;
				case 'I':
					{
					alt21=7;
					}
					break;
				case 'i':
					{
					alt21=8;
					}
					break;
				default:
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
			case 'D':
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2=='R') ) {
					alt21=9;
				}
				else if ( (LA21_2=='r') ) {
					alt21=10;
				}
				else {
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
			case 'C':
				{
				int LA21_3 = input.LA(2);
				if ( (LA21_3=='O') ) {
					alt21=11;
				}
				else if ( (LA21_3=='o') ) {
					alt21=12;
				}
				else {
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:9: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:14: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:406:9: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:406:15: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:9: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:14: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:9: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:16: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:10: 'DR'
					{
					match("DR"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:409:15: 'Dr'
					{
					match("Dr"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:410:9: 'COL'
					{
					match("COL"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:410:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
			int alt22=14;
			switch ( input.LA(1) ) {
			case 'S':
				{
				switch ( input.LA(2) ) {
				case 'u':
					{
					alt22=1;
					}
					break;
				case 'U':
					{
					alt22=2;
					}
					break;
				case 'a':
					{
					alt22=13;
					}
					break;
				case 'A':
					{
					alt22=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'M':
				{
				int LA22_2 = input.LA(2);
				if ( (LA22_2=='o') ) {
					alt22=3;
				}
				else if ( (LA22_2=='O') ) {
					alt22=4;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
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
					alt22=5;
					}
					break;
				case 'U':
					{
					alt22=6;
					}
					break;
				case 'h':
					{
					alt22=9;
					}
					break;
				case 'H':
					{
					alt22=10;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'W':
				{
				int LA22_4 = input.LA(2);
				if ( (LA22_4=='e') ) {
					alt22=7;
				}
				else if ( (LA22_4=='E') ) {
					alt22=8;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'F':
				{
				int LA22_5 = input.LA(2);
				if ( (LA22_5=='r') ) {
					alt22=11;
				}
				else if ( (LA22_5=='R') ) {
					alt22=12;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:9: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:18: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:9: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:19: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:9: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:417:9: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:417:20: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:9: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:18: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:9: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:20: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:5: ( ( WORD | INT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:9: ( WORD | INT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:9: ( WORD | INT )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= '&' && LA23_0 <= '\'')||(LA23_0 >= ',' && LA23_0 <= '-')||(LA23_0 >= ':' && LA23_0 <= ';')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'z')||LA23_0=='\u2019') ) {
				alt23=1;
			}
			else if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
				alt23=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:10: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:15: INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:11: ({...}? => ( FRAG_TITLE ' ' PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | PROPER_NAME ) )* ( ( ' ' )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:13: {...}? => ( FRAG_TITLE ' ' PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | PROPER_NAME ) )* ( ( ' ' )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:28: ( FRAG_TITLE ' ' PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | PROPER_NAME ) )* ( ( ' ' )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:29: FRAG_TITLE ' ' PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | PROPER_NAME ) )* ( ( ' ' )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); 

			match(' '); 
			mPROPER_NAME(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:56: ( ' ' ( PARENTHETICAL_NAME | PROPER_NAME ) )*
			loop25:
			do {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==' ') ) {
					int LA25_1 = input.LA(2);
					if ( (LA25_1=='(') ) {
						int LA25_3 = input.LA(3);
						if ( ((LA25_3 >= 'A' && LA25_3 <= 'Z')) ) {
							alt25=1;
						}

					}
					else if ( ((LA25_1 >= 'A' && LA25_1 <= 'Z')) ) {
						alt25=1;
					}

				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:57: ' ' ( PARENTHETICAL_NAME | PROPER_NAME )
					{
					match(' '); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:61: ( PARENTHETICAL_NAME | PROPER_NAME )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='(') ) {
						alt24=1;
					}
					else if ( ((LA24_0 >= 'A' && LA24_0 <= 'Z')) ) {
						alt24=2;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:62: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:81: PROPER_NAME
							{
							mPROPER_NAME(); 

							}
							break;

					}

					}
					break;

				default :
					break loop25;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:96: ( ( ' ' )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:97: ( ' ' )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:97: ( ' ' )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==' ') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:97: ' '
					{
					match(' '); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:102: ( PARENTHETICAL_INT )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='(') ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:443:102: PARENTHETICAL_INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt28=0;
			loop28:
			do {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= '\t' && LA28_0 <= '\n')||LA28_0=='\r'||LA28_0==' ') ) {
					alt28=1;
				}

				switch (alt28) {
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
					if ( cnt28 >= 1 ) break loop28;
						EarlyExitException eee =
							new EarlyExitException(28, input);
						throw eee;
				}
				cnt28++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:13: ( ( 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='G') ) {
				alt29=1;
			}
			else if ( (LA29_0=='R') ) {
				alt29=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:18: 'GROUP RING'
					{
					match("GROUP RING"); 

					allowGroup=true;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:49: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:49: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:50: 'RING' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
			{
			match('('); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			match(')'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:42: ( WS )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( ((LA30_0 >= '\t' && LA30_0 <= '\n')||LA30_0=='\r'||LA30_0==' ') ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:42: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:13: INT ':' INT WS FRAG_TIME_LABEL
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:13: ( '.' )+
			int cnt31=0;
			loop31:
			do {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0=='.') ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:13: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
						EarlyExitException eee =
							new EarlyExitException(31, input);
						throw eee;
				}
				cnt31++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:6: ( '0' .. '9' )+
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
						EarlyExitException eee =
							new EarlyExitException(32, input);
						throw eee;
				}
				cnt32++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:460:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='L') ) {
				alt33=1;
			}
			else if ( (LA33_0=='V') ) {
				alt33=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:460:9: 'LUNCH'
					{
					match("LUNCH"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:460:17: 'VARIETY GROUP JUDGING'
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

	// $ANTLR start "PARENTHETICAL"
	public final void mPARENTHETICAL() throws RecognitionException {
		try {
			int _type = PARENTHETICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:13: ( WORD | INT | FRAG_PROPER_NAME )
			int alt34=3;
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
				alt34=1;
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
				alt34=2;
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
				alt34=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:14: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:19: INT
					{
					mINT(); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( ((LA36_0 >= '\t' && LA36_0 <= '\n')||LA36_0=='\r'||LA36_0==' ') ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:45: ( WORD | INT | FRAG_PROPER_NAME )
					int alt35=3;
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
						alt35=1;
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
						alt35=2;
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
						alt35=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}
					switch (alt35) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:46: WORD
							{
							mWORD(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:51: INT
							{
							mINT(); 

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:55: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;

					}

					}
					break;

				default :
					break loop36;
				}
			} while (true);

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			loop37:
			do {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( ((LA37_0 >= '&' && LA37_0 <= '\'')||(LA37_0 >= ',' && LA37_0 <= '-')||(LA37_0 >= ':' && LA37_0 <= ';')||(LA37_0 >= 'A' && LA37_0 <= 'Z')||LA37_0=='_'||(LA37_0 >= 'a' && LA37_0 <= 'z')||LA37_0=='\u2019') ) {
					alt37=1;
				}

				switch (alt37) {
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
					break loop37;
				}
			} while (true);

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:94: ( END_PUNCTUATION )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0=='!'||LA38_0=='.'||LA38_0=='?') ) {
				alt38=1;
			}
			switch (alt38) {
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

	// $ANTLR start "PROPER_NAME"
	public final void mPROPER_NAME() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:21: ( FRAG_PROPER_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:23: FRAG_PROPER_NAME
			{
			mFRAG_PROPER_NAME(); 

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:13: ( WS )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= '\t' && LA39_0 <= '\n')||LA39_0=='\r'||LA39_0==' ') ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:13: WS
					{
					mWS(); 

					}
					break;

			}

			mINT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:21: ( WS )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( ((LA40_0 >= '\t' && LA40_0 <= '\n')||LA40_0=='\r'||LA40_0==' ') ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:468:21: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt41=0;
			loop41:
			do {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( ((LA41_0 >= '&' && LA41_0 <= '\'')||(LA41_0 >= ',' && LA41_0 <= '-')||(LA41_0 >= ':' && LA41_0 <= ';')||LA41_0=='_'||(LA41_0 >= 'a' && LA41_0 <= 'z')||LA41_0=='\u2019') ) {
					alt41=1;
				}

				switch (alt41) {
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
					if ( cnt41 >= 1 ) break loop41;
						EarlyExitException eee =
							new EarlyExitException(41, input);
						throw eee;
				}
				cnt41++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:65: ( END_PUNCTUATION )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0=='!'||LA42_0=='.'||LA42_0=='?') ) {
				alt42=1;
			}
			switch (alt42) {
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			int cnt44=0;
			loop44:
			do {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( ((LA44_0 >= '&' && LA44_0 <= '(')||(LA44_0 >= ',' && LA44_0 <= '.')||(LA44_0 >= '0' && LA44_0 <= ';')||(LA44_0 >= 'A' && LA44_0 <= 'Z')||LA44_0=='_'||(LA44_0 >= 'a' && LA44_0 <= 'z')||LA44_0=='\u2019') ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					int alt43=5;
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
						alt43=1;
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
						alt43=2;
						}
						break;
					case '(':
						{
						alt43=3;
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
						alt43=4;
						}
						break;
					case '.':
						{
						alt43=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}
					switch (alt43) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:32: WORD
							{
							mWORD(); 

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:37: PARENTHETICAL
							{
							mPARENTHETICAL(); 

							}
							break;
						case 4 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:51: INT
							{
							mINT(); 

							}
							break;
						case 5 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:55: ELLIPSIS
							{
							mELLIPSIS(); 

							}
							break;

					}

					allowBreed=false; allowGroup=false;allowJudge=false;
					}
					break;

				default :
					if ( cnt44 >= 1 ) break loop44;
						EarlyExitException eee =
							new EarlyExitException(44, input);
						throw eee;
				}
				cnt44++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:472:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:472:4: WORD END_PUNCTUATION
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:474:28: ( '(' PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:474:30: '(' PROPER_NAME ')'
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

	// $ANTLR start "FallThrough"
	public final void mFallThrough() throws RecognitionException {
		try {
			int _type = FallThrough;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:480:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:480:6: .
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | GROUP_RING | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | STANDALONE_COMMENT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough )
		int alt45=19;
		alt45 = dfa45.predict(input);
		switch (alt45) {
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:67: GROUP_RING
				{
				mGROUP_RING(); 

				}
				break;
			case 6 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:78: BREED_COUNT
				{
				mBREED_COUNT(); 

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:90: JUDGE_NAME
				{
				mJUDGE_NAME(); 

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:101: WS
				{
				mWS(); 

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:104: RING_TITLE
				{
				mRING_TITLE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:115: PHONE_NUMBER
				{
				mPHONE_NUMBER(); 

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:128: TIME
				{
				mTIME(); 

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:133: DATE
				{
				mDATE(); 

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:138: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:147: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:151: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); 

				}
				break;
			case 16 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:170: PARENTHETICAL
				{
				mPARENTHETICAL(); 

				}
				break;
			case 17 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:184: PARENTHETICAL_INT
				{
				mPARENTHETICAL_INT(); 

				}
				break;
			case 18 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:202: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 19 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:210: FallThrough
				{
				mFallThrough(); 

				}
				break;

		}
	}


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA14 dfa14 = new DFA14(this);
	protected DFA45 dfa45 = new DFA45(this);
	static final String DFA2_eotS =
		"\u00e6\uffff\1\u0108\156\uffff\1\u016b\102\uffff";
	static final String DFA2_eofS =
		"\u0198\uffff";
	static final String DFA2_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\1\141\1\145\1\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff"+
		"\1\145\1\uffff\2\163\1\141\1\143\1\141\1\162\1\141\1\154\1\151\1\uffff"+
		"\1\145\2\uffff\1\143\1\uffff\1\143\1\142\1\147\1\145\3\uffff\1\162\2\uffff"+
		"\1\154\1\145\1\162\2\uffff\1\151\1\uffff\1\145\2\uffff\1\142\4\uffff\1"+
		"\154\1\156\1\141\1\162\2\uffff\1\160\1\153\2\uffff\1\151\1\147\1\uffff"+
		"\1\144\3\uffff\1\151\1\150\1\141\1\145\1\142\2\uffff\2\141\2\uffff\1\142"+
		"\2\uffff\1\151\1\uffff\1\162\2\uffff\1\162\1\164\1\145\1\147\1\uffff\1"+
		"\147\1\uffff\1\150\1\143\2\uffff\1\144\1\uffff\1\166\3\uffff\1\141\1\uffff"+
		"\1\154\1\uffff\1\141\3\uffff\1\150\7\uffff\1\165\1\154\2\uffff\1\156\1"+
		"\155\2\uffff\1\141\2\uffff\2\163\7\uffff\1\151\2\uffff\1\146\5\uffff\1"+
		"\151\4\uffff\1\164\1\uffff\1\151\6\uffff\1\164\3\uffff\1\142\1\145\3\uffff"+
		"\1\146\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162\5\uffff\1\151\1\157"+
		"\1\153\1\145\1\uffff\1\151\2\uffff\1\40\3\uffff\2\145\2\151\1\141\1\164"+
		"\1\uffff\2\150\1\141\1\uffff\1\145\1\164\1\165\1\153\1\164\2\uffff\1\162"+
		"\2\uffff\1\164\1\150\1\40\1\143\2\141\1\156\1\40\1\162\1\145\3\uffff\1"+
		"\163\1\40\2\163\1\156\2\40\1\157\1\164\1\147\1\uffff\1\40\1\147\2\uffff"+
		"\2\151\1\141\1\40\2\uffff\1\141\1\154\1\156\1\40\1\46\1\40\1\162\1\145"+
		"\2\uffff\2\150\1\40\1\104\1\uffff\1\122\1\156\1\165\1\151\2\uffff\1\165"+
		"\1\163\1\141\1\156\1\123\1\156\1\151\1\40\5\uffff\1\103\4\40\1\120\5\uffff"+
		"\1\141\1\144\1\162\1\141\1\145\1\150\1\156\1\40\2\uffff\1\40\1\141\1\115"+
		"\4\uffff\2\103\1\114\1\uffff\1\150\3\uffff\2\145\1\156\1\163\2\40\1\115"+
		"\1\105\1\156\7\uffff\1\145\3\uffff\1\145\2\uffff\2\40\1\145\1\104\1\110"+
		"\3\uffff\1\156\3\uffff\1\40\4\uffff\1\101\1\102\1\40\2\uffff\1\165\2\uffff"+
		"\1\103\7\uffff\1\120\1\163\5\uffff\1\153\1\151\2\uffff";
	static final String DFA2_maxS =
		"\1\131\3\165\1\157\1\156\2\162\1\141\1\164\1\uffff\1\165\1\u00f6\1\151"+
		"\1\157\1\164\1\171\1\165\1\167\1\162\1\uffff\1\151\2\uffff\1\147\3\uffff"+
		"\1\145\1\uffff\2\163\1\162\1\143\1\165\1\171\1\165\1\154\1\166\1\uffff"+
		"\1\157\2\uffff\1\154\1\uffff\1\156\1\147\1\164\1\156\3\uffff\1\162\2\uffff"+
		"\1\162\1\145\1\166\2\uffff\1\151\1\uffff\1\162\2\uffff\1\153\4\uffff\1"+
		"\163\1\156\1\167\1\166\2\uffff\1\162\1\164\2\uffff\1\162\1\154\1\uffff"+
		"\1\164\3\uffff\1\155\1\157\1\164\1\151\1\154\2\uffff\1\151\1\141\2\uffff"+
		"\1\142\2\uffff\1\163\1\uffff\1\162\2\uffff\1\162\1\164\1\163\1\165\1\uffff"+
		"\1\147\1\uffff\1\150\1\143\2\uffff\1\172\1\uffff\1\166\3\uffff\1\164\1"+
		"\uffff\1\154\1\uffff\1\145\3\uffff\1\156\7\uffff\1\165\1\154\2\uffff\1"+
		"\156\1\155\2\uffff\1\171\2\uffff\2\163\7\uffff\1\151\2\uffff\1\167\5\uffff"+
		"\1\151\4\uffff\1\164\1\uffff\1\151\6\uffff\1\164\3\uffff\1\150\1\145\3"+
		"\uffff\1\156\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162\5\uffff\1\151"+
		"\1\157\1\153\1\145\1\uffff\1\151\2\uffff\1\155\3\uffff\2\145\2\151\1\141"+
		"\1\164\1\uffff\2\150\1\141\1\uffff\1\151\1\164\1\165\1\153\1\164\2\uffff"+
		"\1\162\2\uffff\1\164\2\150\1\143\2\141\1\156\1\40\1\162\1\145\3\uffff"+
		"\4\163\1\156\1\145\1\40\1\157\1\164\1\147\1\uffff\1\163\1\147\2\uffff"+
		"\2\151\1\141\1\40\2\uffff\1\141\1\154\1\156\1\163\1\141\1\40\1\162\1\145"+
		"\2\uffff\2\150\1\40\1\120\1\uffff\1\127\1\156\1\165\1\151\2\uffff\1\165"+
		"\1\163\1\141\1\156\1\124\1\156\1\151\1\40\5\uffff\1\124\1\163\3\40\1\127"+
		"\5\uffff\1\157\1\144\1\162\1\141\1\145\1\150\1\156\1\40\2\uffff\1\40\1"+
		"\141\1\124\4\uffff\1\123\1\124\1\123\1\uffff\1\150\3\uffff\2\145\1\156"+
		"\1\163\2\40\1\124\1\127\1\156\7\uffff\1\160\3\uffff\1\157\2\uffff\2\40"+
		"\1\145\1\124\1\110\3\uffff\1\163\3\uffff\1\40\4\uffff\1\123\1\114\1\40"+
		"\2\uffff\1\165\2\uffff\1\124\7\uffff\1\127\1\163\5\uffff\1\153\1\171\2"+
		"\uffff";
	static final String DFA2_acceptS =
		"\12\uffff\1\147\11\uffff\1\u00b7\1\uffff\1\u00bf\1\u00c0\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\13\11\uffff\1\64\1\uffff\1\71\1\73\1\uffff\1\76\4\uffff"+
		"\1\116\1\117\1\120\1\uffff\1\125\1\126\3\uffff\1\137\1\140\1\uffff\1\146"+
		"\1\uffff\1\153\1\154\1\uffff\1\160\1\161\1\162\1\163\4\uffff\1\u0083\1"+
		"\u0084\2\uffff\1\u008b\1\u008c\2\uffff\1\u0096\1\uffff\1\u0099\1\u009a"+
		"\1\u009b\5\uffff\1\u00aa\1\u00ab\2\uffff\1\u00b0\1\u00b1\1\uffff\1\u00b5"+
		"\1\u00b6\1\uffff\1\u00bc\1\uffff\1\1\1\2\4\uffff\1\24\1\uffff\1\30\2\uffff"+
		"\1\36\1\37\1\uffff\1\43\1\uffff\1\46\1\47\1\50\1\uffff\1\53\1\uffff\1"+
		"\57\1\uffff\1\62\1\63\1\65\1\uffff\1\72\1\74\1\75\1\77\1\100\1\101\1\102"+
		"\2\uffff\1\112\1\113\2\uffff\1\127\1\130\1\uffff\1\135\1\136\2\uffff\1"+
		"\152\1\155\1\156\1\157\1\164\1\165\1\166\1\uffff\1\173\1\174\1\uffff\1"+
		"\u0082\1\u0085\1\u0086\1\u0087\1\u0088\1\uffff\1\u008d\1\u008e\1\u008f"+
		"\1\u0090\1\uffff\1\u0093\1\uffff\1\u0097\1\u0098\1\u009c\1\u009d\1\u009e"+
		"\1\u009f\1\uffff\1\u00a2\1\u00a3\1\u00a4\2\uffff\1\u00a9\1\u00ac\1\u00ad"+
		"\2\uffff\1\u00b8\1\uffff\1\u00bb\3\uffff\1\17\1\20\1\21\1\22\1\23\4\uffff"+
		"\1\42\1\uffff\1\51\1\52\1\uffff\1\60\1\61\1\66\6\uffff\1\134\3\uffff\1"+
		"\175\5\uffff\1\u00a5\1\u00a6\1\uffff\1\u00ae\1\u00af\12\uffff\1\54\1\55"+
		"\1\56\12\uffff\1\u0081\2\uffff\1\u0095\1\u0094\4\uffff\1\u00bd\1\u00be"+
		"\10\uffff\1\103\1\104\4\uffff\1\133\4\uffff\1\u0089\1\u008a\10\uffff\1"+
		"\31\1\32\1\33\1\34\1\35\6\uffff\1\131\1\132\1\141\1\142\1\143\10\uffff"+
		"\1\u00b9\1\u00ba\3\uffff\1\40\1\41\1\44\1\45\3\uffff\1\121\1\uffff\1\124"+
		"\1\144\1\145\11\uffff\1\25\1\26\1\27\1\67\1\70\1\105\1\106\1\uffff\1\111"+
		"\1\114\1\115\1\uffff\1\151\1\150\5\uffff\1\u00b2\1\u00b3\1\u00b4\1\uffff"+
		"\1\10\1\11\1\12\1\uffff\1\107\1\110\1\122\1\123\3\uffff\1\u00a0\1\u00a1"+
		"\1\uffff\1\6\1\7\1\uffff\1\167\1\170\1\171\1\172\1\176\1\177\1\u0080\2"+
		"\uffff\1\14\1\15\1\16\1\u0091\1\u0092\2\uffff\1\u00a7\1\u00a8";
	static final String DFA2_specialS =
		"\u0198\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\20\1\uffff\1\21\1\22\1\23\1\uffff\1\24\1\25\1\26\1\27",
			"\1\30\2\uffff\1\31\1\uffff\1\32\1\33\1\34\1\35\6\uffff\1\36",
			"\1\37\3\uffff\1\40\3\uffff\1\41\2\uffff\1\42\2\uffff\1\43\2\uffff\1"+
			"\44\2\uffff\1\45",
			"\1\46\3\uffff\1\47\2\uffff\1\50\1\51\2\uffff\1\52\2\uffff\1\53\5\uffff"+
			"\1\54",
			"\1\55\15\uffff\1\56",
			"\1\57",
			"\1\60\2\uffff\1\61\2\uffff\1\62\2\uffff\1\63",
			"\1\64\3\uffff\1\65\2\uffff\1\66\2\uffff\1\67\2\uffff\1\70",
			"\1\71",
			"\1\72\1\73\16\uffff\1\74\1\uffff\1\75",
			"",
			"\1\76\11\uffff\1\77\5\uffff\1\100",
			"\1\101\3\uffff\1\102\2\uffff\1\103\6\uffff\1\105\u0086\uffff\1\104",
			"\1\106\7\uffff\1\107",
			"\1\110\11\uffff\1\111",
			"\1\112\7\uffff\1\113",
			"\1\114\3\uffff\1\115\2\uffff\1\116\3\uffff\1\117\2\uffff\1\120\5\uffff"+
			"\1\121\3\uffff\1\122",
			"\1\123\2\uffff\1\124\6\uffff\1\125\5\uffff\1\126",
			"\1\127\1\uffff\1\130\1\uffff\1\131\2\uffff\1\132\1\133\1\uffff\1\134"+
			"\3\uffff\1\135\1\136\3\uffff\1\137\1\140\1\uffff\1\141",
			"\1\142\5\uffff\1\143\2\uffff\1\144",
			"",
			"\1\145\2\uffff\1\146\1\147",
			"",
			"",
			"\1\150\1\151",
			"",
			"",
			"",
			"\1\152",
			"",
			"\1\153",
			"\1\154",
			"\1\155\2\uffff\1\156\7\uffff\1\157\5\uffff\1\160",
			"\1\161",
			"\1\162\15\uffff\1\163\5\uffff\1\164",
			"\1\165\1\166\1\uffff\1\167\2\uffff\1\170\1\171",
			"\1\172\7\uffff\1\173\13\uffff\1\174",
			"\1\175",
			"\1\176\4\uffff\1\177\3\uffff\1\u0080\3\uffff\1\u0081",
			"",
			"\1\u0082\3\uffff\1\u0083\5\uffff\1\u0084",
			"",
			"",
			"\1\u0085\10\uffff\1\u0086",
			"",
			"\1\u0087\10\uffff\1\u0088\1\uffff\1\u0089",
			"\1\u008a\4\uffff\1\u008b",
			"\1\u008c\14\uffff\1\u008d",
			"\1\u008e\10\uffff\1\u008f",
			"",
			"",
			"",
			"\1\u0090",
			"",
			"",
			"\1\u0091\5\uffff\1\u0092",
			"\1\u0093",
			"\1\u0094\3\uffff\1\u0095",
			"",
			"",
			"\1\u0096",
			"",
			"\1\u0097\14\uffff\1\u0098",
			"",
			"",
			"\1\u0099\4\uffff\1\u009a\3\uffff\1\u009b",
			"",
			"",
			"",
			"",
			"\1\u009c\1\uffff\1\u009d\4\uffff\1\u009e",
			"\1\u009f",
			"\1\u00a0\25\uffff\1\u00a1",
			"\1\u00a2\3\uffff\1\u00a3",
			"",
			"",
			"\1\u00a4\1\uffff\1\u00a5",
			"\1\u00a6\1\uffff\1\u00a7\6\uffff\1\u00a8",
			"",
			"",
			"\1\u00a9\2\uffff\1\u00aa\1\u00ab\1\uffff\1\u00ac\2\uffff\1\u00ad",
			"\1\u00ae\4\uffff\1\u00af",
			"",
			"\1\u00b0\17\uffff\1\u00b1",
			"",
			"",
			"",
			"\1\u00b2\2\uffff\1\u00b3\1\u00b4",
			"\1\u00b5\6\uffff\1\u00b6",
			"\1\u00b7\22\uffff\1\u00b8",
			"\1\u00b9\3\uffff\1\u00ba",
			"\1\u00bb\11\uffff\1\u00bc",
			"",
			"",
			"\1\u00bd\7\uffff\1\u00be",
			"\1\u00bf",
			"",
			"",
			"\1\u00c0",
			"",
			"",
			"\1\u00c1\2\uffff\1\u00c2\6\uffff\1\u00c3",
			"",
			"\1\u00c4",
			"",
			"",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7\15\uffff\1\u00c8",
			"\1\u00c9\12\uffff\1\u00ca\2\uffff\1\u00cb",
			"",
			"\1\u00cc",
			"",
			"\1\u00cd",
			"\1\u00ce",
			"",
			"",
			"\1\u00cf\25\uffff\1\u00d0",
			"",
			"\1\u00d1",
			"",
			"",
			"",
			"\1\u00d2\22\uffff\1\u00d3",
			"",
			"\1\u00d4",
			"",
			"\1\u00d5\3\uffff\1\u00d6",
			"",
			"",
			"",
			"\1\u00d7\5\uffff\1\u00d8",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d9",
			"\1\u00da",
			"",
			"",
			"\1\u00db",
			"\1\u00dc",
			"",
			"",
			"\1\u00dd\27\uffff\1\u00de",
			"",
			"",
			"\1\u00df",
			"\1\u00e0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e1",
			"",
			"",
			"\1\u00e2\20\uffff\1\u00e3",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e4",
			"",
			"",
			"",
			"",
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
			"",
			"\1\u00e8\5\uffff\1\u00e9",
			"\1\u00ea",
			"",
			"",
			"",
			"\1\u00eb\7\uffff\1\u00ec",
			"\1\u00ed",
			"",
			"\1\u00ee",
			"",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"",
			"\1\u00f6",
			"",
			"",
			"\1\u00f7\103\uffff\1\u00f8\10\uffff\1\u00f9",
			"",
			"",
			"",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"",
			"\1\u0103\3\uffff\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0109",
			"",
			"",
			"\1\u010a",
			"",
			"",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d\107\uffff\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"",
			"",
			"",
			"\1\u0116",
			"\1\u0117\122\uffff\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c\104\uffff\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"",
			"\1\u0122\122\uffff\1\u0123",
			"\1\u0124",
			"",
			"",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"",
			"",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c\122\uffff\1\u012d",
			"\1\u012f\53\uffff\1\u0130\16\uffff\1\u012e",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"",
			"",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137\13\uffff\1\u0138",
			"",
			"\1\u0139\1\u013a\1\u013b\2\uffff\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"",
			"",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"",
			"",
			"",
			"",
			"",
			"\1\u0149\20\uffff\1\u014a",
			"\1\u014b\122\uffff\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150\2\uffff\1\u0151\3\uffff\1\u0152",
			"",
			"",
			"",
			"",
			"",
			"\1\u0153\15\uffff\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"",
			"",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e\5\uffff\1\u015f\1\u0160",
			"",
			"",
			"",
			"",
			"\1\u0161\17\uffff\1\u0162",
			"\1\u0163\2\uffff\1\u0164\14\uffff\1\u0165\1\u0166",
			"\1\u0167\6\uffff\1\u0168",
			"",
			"\1\u0169",
			"",
			"",
			"",
			"\1\u016a",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171\5\uffff\1\u0172\1\u0173",
			"\1\u0174\1\u0175\14\uffff\1\u0176\3\uffff\1\u0177",
			"\1\u0178",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0179\12\uffff\1\u017a",
			"",
			"",
			"",
			"\1\u017b\11\uffff\1\u017c",
			"",
			"",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180\17\uffff\1\u0181",
			"\1\u0182",
			"",
			"",
			"",
			"\1\u0183\4\uffff\1\u0184",
			"",
			"",
			"",
			"\1\u0185",
			"",
			"",
			"",
			"",
			"\1\u0186\1\u0187\15\uffff\1\u0188\2\uffff\1\u0189",
			"\1\u018a\2\uffff\1\u018b\6\uffff\1\u018c",
			"\1\u018d",
			"",
			"",
			"\1\u018e",
			"",
			"",
			"\1\u018f\17\uffff\1\u0190\1\u0191",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0192\6\uffff\1\u0193",
			"\1\u0194",
			"",
			"",
			"",
			"",
			"",
			"\1\u0195",
			"\1\u0197\17\uffff\1\u0196",
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
			return "110:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
		}
	}

	static final String DFA14_eotS =
		"\62\uffff\1\71\11\uffff\1\100\1\102\11\uffff";
	static final String DFA14_eofS =
		"\107\uffff";
	static final String DFA14_minS =
		"\1\61\1\63\1\40\1\150\1\156\1\151\1\145\2\uffff\1\141\3\uffff\1\155\1"+
		"\uffff\1\145\6\uffff\1\143\1\uffff\1\147\2\uffff\1\162\1\154\1\uffff\1"+
		"\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1\147\1\157\1\145"+
		"\1\151\1\141\1\40\1\164\1\150\1\163\1\156\2\uffff\1\150\2\uffff\1\150"+
		"\3\40\1\123\2\uffff\1\103\5\uffff";
	static final String DFA14_maxS =
		"\1\127\1\65\1\157\1\165\1\156\1\154\1\157\2\uffff\1\157\3\uffff\1\165"+
		"\1\uffff\1\151\6\uffff\1\154\1\uffff\1\147\2\uffff\2\162\1\uffff\1\156"+
		"\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1\147\1\157\1\145\1\151"+
		"\1\141\1\150\1\164\1\150\1\163\1\156\2\uffff\1\150\2\uffff\1\150\3\40"+
		"\1\127\2\uffff\1\123\5\uffff";
	static final String DFA14_acceptS =
		"\7\uffff\1\23\1\24\1\uffff\1\30\1\31\1\32\1\uffff\1\37\1\uffff\1\1\1\2"+
		"\1\3\1\4\1\5\1\6\1\uffff\1\11\1\uffff\1\15\1\16\2\uffff\1\25\2\uffff\1"+
		"\35\1\36\1\40\1\41\1\uffff\1\7\1\10\2\uffff\1\21\1\22\12\uffff\1\26\1"+
		"\27\1\uffff\1\43\1\42\5\uffff\1\34\1\33\1\uffff\1\12\1\17\1\20\1\13\1"+
		"\14";
	static final String DFA14_specialS =
		"\107\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\1\20\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1"+
			"\11\1\12\1\13\3\uffff\1\14\1\15\1\16\2\uffff\1\17",
			"\1\20\1\uffff\1\21",
			"\1\23\116\uffff\1\22",
			"\1\24\3\uffff\1\25\2\uffff\1\26\5\uffff\1\27",
			"\1\30",
			"\1\31\2\uffff\1\32",
			"\1\33\11\uffff\1\34",
			"",
			"",
			"\1\35\15\uffff\1\36",
			"",
			"",
			"",
			"\1\37\6\uffff\1\40\1\41",
			"",
			"\1\42\2\uffff\1\43\1\44",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\45\10\uffff\1\46",
			"",
			"\1\47",
			"",
			"",
			"\1\50",
			"\1\51\5\uffff\1\52",
			"",
			"\1\53",
			"\1\54",
			"",
			"",
			"",
			"",
			"\1\55",
			"",
			"",
			"\1\56",
			"\1\57",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65\107\uffff\1\66",
			"\1\67",
			"\1\70",
			"\1\72",
			"\1\73",
			"",
			"",
			"\1\74",
			"",
			"",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\101",
			"\1\103\3\uffff\1\104",
			"",
			"",
			"\1\105\17\uffff\1\106",
			"",
			"",
			"",
			"",
			""
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
			return "317:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA45_eotS =
		"\1\uffff\27\50\1\36\1\u009c\1\uffff\1\u00a1\3\uffff\11\50\1\uffff\73\50"+
		"\1\uffff\62\50\6\uffff\1\50\1\u009c\1\50\2\uffff\1\u00a1\6\50\1\uffff"+
		"\152\50\1\u01ce\70\50\4\uffff\1\u0210\2\uffff\1\u0210\1\uffff\170\50\1"+
		"\uffff\1\u0287\1\uffff\1\u0298\44\50\1\uffff\2\50\1\uffff\22\50\6\uffff"+
		"\1\50\1\uffff\7\50\1\uffff\13\50\1\u02e7\24\50\1\u02fb\1\50\1\u02fd\31"+
		"\50\1\u0315\41\50\1\u0331\6\50\1\u0338\5\50\20\uffff\1\u0359\1\uffff\7"+
		"\50\1\uffff\31\50\1\uffff\23\50\4\uffff\1\u0210\1\uffff\23\50\1\uffff"+
		"\6\50\1\u03a0\11\50\1\u03a9\2\50\1\uffff\1\50\1\uffff\1\u03ab\15\50\1"+
		"\u03b7\10\50\1\uffff\16\50\1\uffff\6\50\1\u03cb\5\50\1\uffff\6\50\1\uffff"+
		"\3\50\1\u03d7\1\50\34\uffff\7\50\1\u03fe\33\50\1\u0417\13\50\2\uffff\2"+
		"\50\1\u0426\1\u0427\20\50\1\u0435\1\uffff\10\50\1\uffff\1\50\1\uffff\2"+
		"\50\1\u043d\10\50\1\uffff\6\50\1\u0315\4\50\1\u044a\7\50\1\uffff\4\50"+
		"\1\u0453\4\50\1\u0457\1\50\1\uffff\1\50\36\uffff\7\50\1\uffff\1\u047d"+
		"\4\50\1\u0482\22\50\1\uffff\5\50\1\u0493\5\50\1\uffff\1\50\1\u049c\2\uffff"+
		"\2\50\1\uffff\12\50\1\uffff\5\50\1\u04aa\1\50\1\uffff\14\50\1\uffff\1"+
		"\u04b4\2\50\1\u04b7\1\u04b8\3\50\1\uffff\1\u04ba\2\50\1\uffff\2\50\32"+
		"\uffff\1\u04dd\3\uffff\4\50\2\uffff\4\50\1\uffff\2\50\1\u04e5\6\50\1\uffff"+
		"\2\50\1\u0315\1\uffff\2\50\1\uffff\1\50\1\uffff\3\50\2\uffff\1\50\1\uffff"+
		"\12\50\1\u04f9\2\50\1\uffff\2\50\1\u04fe\1\50\1\u0500\1\u0501\2\50\1\u0504"+
		"\1\uffff\2\50\2\uffff\1\50\1\uffff\1\u0507\2\50\33\uffff\3\50\5\uffff"+
		"\4\50\1\uffff\11\50\2\uffff\2\50\1\u0534\5\50\1\uffff\1\50\1\u0538\2\50"+
		"\1\uffff\1\50\2\uffff\2\50\1\uffff\1\u053d\1\u053e\1\uffff\1\u053f\1\50"+
		"\30\uffff\3\50\3\uffff\1\u055a\1\u055b\1\u055c\3\50\1\u0560\2\50\2\uffff"+
		"\1\50\1\uffff\3\50\1\uffff\1\u0569\3\50\27\uffff\3\50\6\uffff\1\50\1\u0315"+
		"\1\50\1\uffff\1\50\1\u0582\2\uffff\1\50\1\u0586\2\50\1\uffff\1\50\17\uffff"+
		"\3\50\2\uffff\1\50\1\uffff\1\50\1\uffff\1\u0582\1\uffff\1\50\2\uffff\1"+
		"\u05a1\16\uffff\1\u05af\1\50\1\u05b1\2\uffff\2\50\1\u0582\1\uffff\1\u038a"+
		"\1\uffff\1\u05b6\15\uffff\1\50\3\uffff\1\u05c4\2\uffff\1\u05c6\12\uffff"+
		"\1\50\2\uffff\1\u0582\1\uffff\1\u05d2\10\uffff\1\50\11\uffff\1\50\1\uffff"+
		"\1\u05e5\6\uffff\1\50\6\uffff\1\u05ef\20\uffff";
	static final String DFA45_eofS =
		"\u05fb\uffff";
	static final String DFA45_minS =
		"\1\0\1\111\1\154\1\117\1\146\1\105\1\117\1\122\1\156\2\122\1\105\1\142"+
		"\1\141\1\145\1\125\1\141\1\105\1\101\1\105\1\101\1\105\2\157\1\11\1\46"+
		"\1\uffff\1\46\3\uffff\1\154\1\156\4\40\1\123\1\156\1\116\1\uffff\1\145"+
		"\1\144\1\164\1\162\1\141\1\116\1\146\1\162\1\151\1\141\1\145\1\141\2\163"+
		"\1\141\1\143\1\141\1\162\1\141\1\154\1\123\1\151\1\163\1\145\1\162\1\165"+
		"\1\143\1\162\1\114\1\143\1\142\2\40\1\147\1\145\1\141\1\170\1\145\1\111"+
		"\1\162\1\141\1\145\1\154\1\145\1\117\1\162\1\122\1\125\1\151\1\145\1\151"+
		"\1\141\1\160\1\145\1\155\1\166\1\142\1\157\1\141\1\uffff\1\167\1\116\1"+
		"\160\1\153\1\141\1\157\1\151\1\147\1\162\1\144\1\157\1\164\1\163\1\107"+
		"\1\116\1\151\1\150\1\141\1\145\1\142\1\171\1\146\2\141\1\156\1\145\1\117"+
		"\1\105\1\116\1\124\1\142\1\171\1\145\1\122\1\131\1\145\1\105\1\165\1\125"+
		"\1\172\1\164\1\124\1\122\1\144\1\151\1\162\1\122\1\104\1\154\1\162\4\11"+
		"\2\uffff\1\60\1\46\1\60\2\uffff\1\46\2\164\1\143\1\151\1\163\1\40\1\uffff"+
		"\1\40\1\123\1\144\1\104\1\156\1\40\1\145\1\141\1\146\1\160\1\146\1\55"+
		"\1\145\1\150\1\145\1\164\1\163\1\162\2\164\1\145\1\147\1\154\1\147\1\156"+
		"\1\150\1\143\1\157\1\145\1\144\1\164\1\166\1\145\1\153\1\143\1\141\1\163"+
		"\1\154\1\124\1\162\1\141\1\144\1\141\1\153\1\163\1\150\1\167\1\156\1\155"+
		"\1\153\1\40\1\154\1\40\1\150\1\155\1\144\1\145\1\165\3\154\1\156\1\164"+
		"\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\141\1\125\1\162\1\141\1\104"+
		"\1\116\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\157"+
		"\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\151\1\142\1\151\1\162\1\164"+
		"\1\156\1\151\1\145\1\144\1\164\1\11\1\151\1\145\1\142\1\162\1\144\1\164"+
		"\1\163\1\125\1\107\1\156\1\165\1\157\1\165\1\151\1\164\1\154\2\164\1\142"+
		"\1\145\1\153\1\145\1\164\2\156\1\146\1\163\2\144\1\122\1\105\1\104\1\125"+
		"\1\145\1\40\1\145\1\122\1\40\1\163\1\123\1\162\1\122\1\163\1\145\1\105"+
		"\1\111\1\155\1\163\1\164\1\156\1\160\1\145\1\113\1\116\1\157\1\153\4\11"+
		"\1\46\2\11\1\46\1\11\1\55\1\11\2\145\1\150\1\141\2\40\1\141\1\101\1\40"+
		"\1\162\1\143\1\40\1\157\1\145\2\157\1\123\1\156\1\141\1\144\1\141\1\153"+
		"\1\151\1\157\1\162\1\156\1\145\1\154\1\144\1\143\2\151\1\145\1\157\1\153"+
		"\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163\2\40"+
		"\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\145\1\142"+
		"\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\145\1\151\1\145\1\151\1\144"+
		"\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150"+
		"\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151\1\156\1\150\1\171\1\156"+
		"\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\156\1\162"+
		"\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\0\1\11\1\46\1\11\1\156\1"+
		"\157\1\151\1\145\1\167\1\145\1\114\1\11\1\164\1\153\1\171\1\162\1\160"+
		"\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1\157\1\146"+
		"\1\144\1\145\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\106\1\151"+
		"\1\111\1\uffff\1\144\1\104\1\163\1\123\1\154\1\162\1\122\1\105\1\141\1"+
		"\150\1\40\1\145\1\160\1\40\1\111\1\105\1\151\1\163\4\11\1\uffff\1\11\1"+
		"\60\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1\131\1\uffff\1\150\1"+
		"\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156\1\141\1\11\1\141"+
		"\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163\1\156\1\40\1\150"+
		"\1\151\1\162\1\151\1\156\1\145\1\11\1\156\1\11\1\144\1\141\1\145\1\157"+
		"\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143\1\145\1\162"+
		"\1\145\1\55\1\150\1\164\1\145\1\155\1\40\1\163\1\142\1\41\1\145\1\40\1"+
		"\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\40\1\157\1\40\2\145\1"+
		"\116\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1"+
		"\141\1\145\1\40\1\145\1\41\1\154\1\156\1\147\1\157\1\40\1\157\1\11\1\145"+
		"\1\150\1\141\1\145\1\147\1\0\20\11\1\0\1\145\1\156\1\145\1\163\1\145\1"+
		"\154\1\101\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1\150\1\162\1\141"+
		"\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2\163\1\111\1\123"+
		"\1\131\1\104\1\141\1\uffff\1\156\1\105\1\141\1\101\1\144\1\104\2\141\1"+
		"\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\123\1\164\1\150\6\11\1"+
		"\55\1\40\1\146\1\145\1\163\1\165\2\54\1\157\1\40\1\153\1\151\1\150\1\151"+
		"\1\156\1\117\1\151\1\40\1\154\1\0\1\156\1\141\1\151\1\154\1\151\1\40\1"+
		"\11\1\144\1\162\1\147\1\156\1\145\1\40\1\157\1\143\1\40\1\11\1\40\1\162"+
		"\1\0\1\40\1\0\1\11\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145"+
		"\1\157\1\162\1\40\1\11\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1"+
		"\uffff\1\163\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162\1\163\1\107"+
		"\1\uffff\1\40\1\144\1\156\1\163\1\156\1\157\1\11\2\157\1\156\1\162\1\156"+
		"\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156\1\11\1"+
		"\165\33\11\1\0\1\141\1\145\1\166\2\151\1\154\1\122\1\11\1\144\1\141\1"+
		"\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162\1\40\1\54\1\150\1"+
		"\164\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\171\1\131\1\141\1\101"+
		"\1\11\1\156\1\116\1\131\1\141\1\144\1\164\1\151\1\107\1\104\1\172\1\151"+
		"\1\11\1\uffff\2\60\2\11\1\164\1\162\1\11\1\165\1\40\1\141\1\40\1\164\1"+
		"\144\1\122\1\156\1\145\1\40\1\156\1\141\1\151\1\11\1\0\1\40\1\157\1\164"+
		"\3\40\1\165\1\153\1\0\1\40\1\0\1\171\1\163\1\11\1\164\1\156\1\162\1\141"+
		"\1\165\3\40\1\0\1\157\1\156\1\141\1\156\1\40\1\143\1\41\1\40\1\141\1\40"+
		"\1\156\1\11\1\145\1\40\1\151\1\40\1\145\1\144\1\162\1\0\1\162\1\40\1\144"+
		"\1\147\1\11\1\156\1\163\1\145\1\40\1\11\1\151\1\0\1\145\36\11\1\156\1"+
		"\40\1\145\1\141\1\154\2\40\1\0\1\11\1\171\1\162\1\150\1\155\1\11\1\144"+
		"\1\156\1\163\1\40\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1\171\1"+
		"\131\1\0\3\40\1\156\1\141\1\11\1\162\1\40\1\101\1\143\1\162\1\11\1\60"+
		"\1\46\2\0\2\145\1\uffff\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1\141"+
		"\1\0\1\156\1\157\1\156\2\40\1\11\1\40\1\0\1\151\2\40\1\153\2\141\1\144"+
		"\1\156\1\40\1\150\1\164\1\144\1\0\1\11\1\143\1\40\2\11\2\40\1\145\1\0"+
		"\1\11\1\145\1\40\1\0\1\141\1\163\36\11\1\40\1\162\1\156\1\145\1\uffff"+
		"\1\0\1\54\1\153\2\40\1\0\2\40\1\11\1\163\1\40\1\153\1\40\1\113\1\54\1"+
		"\uffff\2\54\1\41\1\uffff\1\145\1\171\1\0\1\145\1\uffff\1\131\1\165\1\145"+
		"\2\11\1\55\1\uffff\1\162\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40"+
		"\1\156\1\11\1\156\1\144\1\0\1\146\1\145\1\11\1\164\2\11\2\145\1\11\1\0"+
		"\1\40\1\156\2\0\1\162\1\0\1\11\1\156\1\145\33\11\1\163\1\141\1\154\1\46"+
		"\1\0\3\11\1\163\1\40\1\162\1\145\1\0\1\150\1\145\1\105\1\162\1\54\1\144"+
		"\1\54\1\151\1\40\2\11\1\60\1\40\1\11\1\40\1\156\1\116\1\150\1\40\1\0\1"+
		"\40\1\11\1\146\1\40\1\0\1\145\2\0\1\162\1\144\1\0\2\11\1\0\1\11\1\40\30"+
		"\11\1\143\1\162\1\141\6\11\1\151\1\163\1\123\1\11\1\40\1\156\2\11\1\60"+
		"\1\0\1\144\1\107\1\145\1\0\1\11\1\144\2\40\3\0\24\11\1\157\1\164\1\143"+
		"\3\11\3\0\1\162\1\41\1\40\1\0\1\164\1\46\2\11\1\60\1\11\1\40\1\162\1\0"+
		"\1\40\17\11\1\142\1\151\1\153\2\11\1\145\1\uffff\1\154\1\uffff\1\46\1"+
		"\11\1\60\1\0\1\uffff\17\11\1\41\1\55\1\41\2\11\1\40\1\151\1\46\1\11\1"+
		"\46\1\0\1\46\14\11\1\0\1\103\1\0\4\11\1\0\1\46\12\11\1\157\1\11\1\0\1"+
		"\46\1\0\1\46\10\11\1\154\1\11\1\0\7\11\1\157\1\11\1\46\6\11\1\162\1\11"+
		"\1\0\4\11\1\41\4\11\1\0\13\11";
	static final String DFA45_maxS =
		"\1\uffff\1\163\1\164\1\157\3\165\1\162\1\156\2\162\1\141\1\164\1\141\1"+
		"\165\1\u00f6\1\171\1\165\1\167\1\165\2\151\2\157\2\u2019\1\uffff\1\u2019"+
		"\3\uffff\2\163\1\123\1\163\2\40\1\123\1\156\1\116\1\uffff\1\145\1\144"+
		"\1\164\1\166\1\167\1\116\1\147\1\162\1\151\1\141\1\145\1\141\2\163\1\162"+
		"\1\143\1\165\1\171\1\165\1\154\1\123\1\166\1\163\1\157\1\162\1\165\1\154"+
		"\1\162\1\114\1\156\1\147\2\40\1\164\1\156\1\141\1\170\1\151\1\111\1\162"+
		"\1\141\1\145\1\162\1\145\1\117\1\166\1\122\1\125\1\151\1\145\1\151\1\141"+
		"\1\160\1\162\1\155\1\166\1\153\1\157\1\141\1\uffff\1\167\1\116\1\162\1"+
		"\164\1\141\1\157\1\162\1\154\1\162\1\164\1\157\1\164\1\163\1\107\1\116"+
		"\1\164\1\157\1\164\1\151\1\154\1\171\1\146\1\151\1\141\1\163\1\145\1\117"+
		"\1\105\1\116\1\124\1\142\1\171\1\145\1\122\1\131\1\145\1\105\1\165\1\125"+
		"\1\172\1\164\1\124\1\122\1\163\1\151\1\162\1\122\1\104\1\154\1\162\1\u2019"+
		"\1\71\2\u2019\2\uffff\1\71\1\u2019\1\71\2\uffff\1\u2019\2\164\1\143\1"+
		"\151\1\163\1\40\1\uffff\1\40\1\123\1\144\1\104\1\156\1\40\1\145\1\151"+
		"\1\167\1\160\1\146\1\55\1\145\1\150\1\145\1\164\1\163\1\162\2\164\1\163"+
		"\1\165\1\154\1\147\1\156\1\150\1\143\1\157\1\145\1\172\1\164\1\166\1\145"+
		"\1\153\1\143\1\164\1\163\1\154\1\124\1\162\1\145\1\144\1\141\1\153\1\163"+
		"\1\156\1\167\1\156\1\155\1\153\2\154\1\40\1\150\1\155\1\144\1\145\1\165"+
		"\1\154\1\162\1\154\1\156\1\164\1\40\1\156\1\144\1\104\1\155\2\156\2\144"+
		"\1\171\1\125\1\162\1\141\1\104\1\116\1\172\1\154\1\163\1\154\1\141\1\163"+
		"\1\162\1\157\1\141\1\162\1\157\1\145\1\156\1\163\1\143\1\103\1\151\1\163"+
		"\1\151\1\142\1\151\1\162\1\164\1\156\1\151\1\145\1\144\1\164\1\u2019\1"+
		"\151\1\145\1\142\1\162\1\144\1\164\1\163\1\125\1\107\1\156\1\165\1\157"+
		"\1\165\1\151\1\164\1\154\2\164\1\150\1\145\1\153\1\145\1\164\3\156\1\163"+
		"\1\144\1\145\1\122\1\105\1\104\1\125\1\145\1\40\1\145\1\122\1\40\1\163"+
		"\1\123\1\162\1\122\1\163\1\145\1\105\1\111\1\155\1\163\1\164\1\156\1\160"+
		"\1\145\1\113\1\116\1\157\1\153\2\u2019\1\51\2\u2019\1\71\2\u2019\1\51"+
		"\2\71\1\151\1\145\1\150\1\141\2\40\1\141\1\101\1\40\1\162\1\143\1\40\1"+
		"\157\1\151\2\157\1\123\1\156\1\141\1\144\1\141\1\153\1\151\1\157\1\162"+
		"\1\156\1\145\1\154\1\144\1\143\2\151\1\145\1\157\1\153\1\144\1\164\1\145"+
		"\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163\1\155\1\40\1\156\1\141"+
		"\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\145\1\142\1\145\1\151"+
		"\1\171\1\163\1\141\1\151\1\162\1\145\1\151\1\145\1\171\1\144\1\151\1\55"+
		"\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150\1\120\1\151"+
		"\1\156\1\111\1\104\2\141\1\150\1\151\1\156\1\150\1\171\1\156\1\163\1\141"+
		"\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\156\1\162\1\164\1\141"+
		"\2\164\1\163\1\162\1\154\1\165\1\0\3\u2019\1\156\1\157\1\151\1\145\1\167"+
		"\1\145\1\114\1\40\1\164\1\153\1\171\1\162\1\160\1\164\1\171\1\145\1\154"+
		"\1\141\1\40\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145\1\141\1\151"+
		"\1\160\1\124\1\120\1\101\1\122\1\164\1\126\1\151\1\111\1\uffff\1\144\1"+
		"\104\1\163\1\123\1\154\1\162\1\122\1\105\1\141\1\150\1\40\1\145\1\160"+
		"\1\150\1\111\1\105\1\151\1\163\2\u2019\1\71\1\u2019\1\uffff\2\71\1\uffff"+
		"\1\162\1\146\1\163\1\145\1\164\1\171\1\131\1\uffff\1\150\1\145\1\154\1"+
		"\147\1\143\1\154\1\165\1\120\1\160\1\156\1\141\1\u2019\1\141\1\143\1\154"+
		"\1\141\1\152\1\164\3\145\1\156\1\141\1\163\1\156\1\40\1\150\1\151\1\162"+
		"\1\151\1\156\1\145\1\u2019\1\156\1\u2019\1\144\1\141\1\145\1\157\1\141"+
		"\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143\1\145\1\162\1\145"+
		"\1\55\1\150\1\164\1\145\1\155\2\163\1\142\1\u2019\1\145\1\40\1\163\1\103"+
		"\1\150\1\171\1\131\1\156\1\40\2\156\1\145\1\157\1\40\2\145\1\116\1\40"+
		"\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1\164\1\141\1\145"+
		"\1\40\1\145\1\u2019\1\154\1\156\1\147\1\157\1\163\1\157\1\u2019\1\145"+
		"\1\150\1\141\1\145\1\147\1\0\1\u2019\1\71\16\u2019\1\0\1\145\1\156\1\145"+
		"\1\163\1\145\1\154\1\101\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1"+
		"\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2"+
		"\163\1\111\1\123\1\131\1\104\1\141\1\uffff\1\156\1\105\1\141\1\101\1\144"+
		"\1\104\2\141\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\123\1\164"+
		"\1\150\1\u2019\1\51\1\u2019\1\51\1\u2019\2\71\1\40\1\146\1\145\1\163\1"+
		"\165\2\54\1\157\1\40\1\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1"+
		"\154\1\0\1\156\1\141\1\151\1\154\1\151\1\40\1\u2019\1\144\1\162\1\147"+
		"\1\156\1\145\1\163\1\157\1\143\1\40\1\u2019\1\40\1\162\1\0\1\40\1\0\1"+
		"\u2019\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1\145\1\157\1\162"+
		"\1\40\1\u2019\1\103\1\165\1\151\1\40\1\141\1\40\1\150\1\165\1\uffff\1"+
		"\163\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162\1\163\1\107\1\uffff"+
		"\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019\2\157\1\156\1\162\1\156\1"+
		"\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40\1\156\1\u2019"+
		"\1\165\1\u2019\2\71\30\u2019\1\0\1\141\1\145\1\166\2\151\1\154\1\122\1"+
		"\u2019\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145\2\162"+
		"\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1\147\1\122\1\171"+
		"\1\131\1\141\1\101\1\u2019\1\156\1\116\1\131\1\141\1\144\1\164\1\151\1"+
		"\107\1\104\1\172\1\151\1\51\1\uffff\2\71\2\u2019\1\164\1\162\1\40\1\165"+
		"\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156\1\141\1\151"+
		"\1\u2019\1\0\1\40\1\157\1\164\3\40\1\165\1\153\1\0\1\163\1\0\1\171\1\163"+
		"\1\u2019\1\164\1\156\1\162\1\141\1\165\3\40\1\0\1\157\1\156\1\141\1\156"+
		"\1\40\1\143\1\u2019\1\40\1\141\1\40\1\156\1\u2019\1\145\1\40\1\151\1\40"+
		"\1\145\1\144\1\162\1\0\1\162\1\40\1\144\1\147\1\u2019\1\156\1\163\1\145"+
		"\1\40\1\u2019\1\151\1\0\1\145\36\u2019\1\156\1\40\1\145\1\141\1\154\2"+
		"\40\1\0\1\u2019\1\171\1\162\1\150\1\155\1\u2019\1\144\1\156\1\163\1\40"+
		"\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1\171\1\131\1\0\1\163\2"+
		"\40\1\156\1\141\1\u2019\1\162\1\40\1\101\1\143\1\162\1\u2019\1\71\1\u2019"+
		"\2\0\2\145\1\uffff\2\156\1\141\1\154\1\124\1\163\2\40\1\156\1\141\1\0"+
		"\1\156\1\157\1\156\2\40\1\u2019\1\40\1\0\1\151\2\40\1\153\2\141\1\144"+
		"\1\156\1\40\1\150\1\164\1\144\1\0\1\u2019\1\143\1\40\2\u2019\2\40\1\145"+
		"\1\0\1\u2019\1\145\1\40\1\0\1\141\1\163\36\u2019\1\40\1\162\1\156\1\145"+
		"\1\uffff\1\0\1\54\1\153\2\40\1\0\2\40\1\u2019\1\163\1\40\1\153\1\40\1"+
		"\113\1\54\1\uffff\2\54\1\u2019\1\uffff\1\145\1\171\1\0\1\145\1\uffff\1"+
		"\131\1\165\1\145\2\u2019\1\55\1\uffff\1\162\1\40\1\144\1\40\1\156\1\141"+
		"\1\111\1\143\1\40\1\156\1\u2019\1\156\1\144\1\0\1\146\1\145\1\u2019\1"+
		"\164\2\u2019\2\145\1\u2019\1\0\1\40\1\156\2\0\1\162\1\0\1\u2019\1\156"+
		"\1\145\1\51\32\u2019\1\163\1\141\1\154\1\u2019\1\0\3\u2019\1\163\1\40"+
		"\1\162\1\145\1\0\1\150\1\145\1\105\1\162\1\54\1\144\1\54\1\151\1\40\2"+
		"\u2019\1\71\1\40\1\u2019\1\40\1\156\1\116\1\150\1\40\1\0\1\40\1\u2019"+
		"\1\146\1\40\1\0\1\145\2\0\1\162\1\144\1\0\2\u2019\1\0\1\u2019\1\40\30"+
		"\u2019\1\143\1\162\1\141\6\u2019\1\151\1\163\1\123\1\u2019\1\40\1\156"+
		"\2\u2019\1\71\1\0\1\144\1\107\1\145\1\0\1\u2019\1\144\2\40\3\0\24\u2019"+
		"\1\157\1\164\1\143\3\u2019\3\0\1\162\1\u2019\1\40\1\0\1\164\3\u2019\1"+
		"\71\1\u2019\1\40\1\162\1\0\1\40\17\u2019\1\142\1\151\1\153\2\u2019\1\145"+
		"\1\uffff\1\154\1\uffff\2\u2019\1\71\1\0\1\uffff\20\u2019\1\55\3\u2019"+
		"\1\40\1\151\3\u2019\1\0\15\u2019\1\0\1\103\1\0\4\u2019\1\0\13\u2019\1"+
		"\157\1\u2019\1\0\1\u2019\1\0\11\u2019\1\154\1\u2019\1\0\7\u2019\1\157"+
		"\10\u2019\1\162\1\u2019\1\0\11\u2019\1\0\13\u2019";
	static final String DFA45_acceptS =
		"\32\uffff\1\10\1\uffff\2\22\1\23\11\uffff\1\22\73\uffff\1\2\66\uffff\1"+
		"\21\1\16\3\uffff\1\10\1\15\7\uffff\1\7\u014f\uffff\1\5\26\uffff\1\20\2"+
		"\uffff\1\13\7\uffff\1\1\u0084\uffff\1\11\31\uffff\1\5\132\uffff\1\3\16"+
		"\uffff\1\5\14\uffff\1\17\130\uffff\1\12\u009f\uffff\1\14\121\uffff\1\5"+
		"\17\uffff\1\5\3\uffff\1\5\4\uffff\1\5\6\uffff\1\6\u00e3\uffff\1\5\1\uffff"+
		"\1\4\4\uffff\1\5\163\uffff";
	static final String DFA45_specialS =
		"\1\u009a\16\uffff\1\u009e\21\uffff\1\167\1\u00a9\1\51\1\u00b5\43\uffff"+
		"\1\46\1\u00af\136\uffff\1\146\1\uffff\1\u00b6\4\uffff\1\147\54\uffff\1"+
		"\33\1\uffff\1\150\12\uffff\1\u00d8\52\uffff\1\u00d9\45\uffff\1\u00cd\41"+
		"\uffff\1\u00b2\1\47\5\uffff\1\41\43\uffff\1\u009c\1\u00d2\2\uffff\1\u00ab"+
		"\6\uffff\1\u00b0\25\uffff\1\u00e9\45\uffff\1\137\1\u00ee\1\uffff\1\u00d3"+
		"\22\uffff\1\u0083\2\uffff\1\177\1\u0080\15\uffff\1\u00a3\15\uffff\1\u00a5"+
		"\2\uffff\1\u00a7\37\uffff\1\u00c8\15\uffff\1\23\6\uffff\1\u008f\1\uffff"+
		"\1\u0096\5\uffff\1\u00a8\3\uffff\1\u00a1\14\uffff\1\165\4\uffff\1\u00df"+
		"\6\uffff\1\u00ea\2\uffff\1\50\5\uffff\1\u00cf\2\uffff\1\45\3\uffff\1\15"+
		"\6\uffff\1\25\6\uffff\1\161\1\uffff\1\u00e6\5\uffff\1\140\17\uffff\1\u00d7"+
		"\1\141\10\uffff\1\u0097\10\uffff\1\u0082\1\uffff\1\175\31\uffff\1\u00bd"+
		"\36\uffff\1\172\1\uffff\1\142\5\uffff\1\154\1\u00e2\5\uffff\1\u00c1\2"+
		"\uffff\1\u00da\1\u0084\1\u0098\1\uffff\1\143\1\u008a\1\144\1\u0094\4\uffff"+
		"\1\u00ac\7\uffff\1\u00b7\1\u00be\3\uffff\1\u00c5\1\uffff\1\u00c0\6\uffff"+
		"\1\u00db\2\uffff\1\u00d1\1\u00e3\1\u00e5\6\uffff\1\4\5\uffff\1\32\7\uffff"+
		"\1\155\2\uffff\1\162\1\uffff\1\136\1\uffff\1\163\1\uffff\1\u00ed\34\uffff"+
		"\1\135\7\uffff\1\u0088\14\uffff\1\u00b3\16\uffff\1\u00a4\17\uffff\1\24"+
		"\1\30\4\uffff\1\36\1\uffff\1\43\5\uffff\1\157\3\uffff\1\u00e0\1\134\1"+
		"\152\2\uffff\1\1\1\42\1\44\2\uffff\1\133\1\u00e8\1\132\2\uffff\1\u0099"+
		"\5\uffff\1\34\1\u00ae\1\u00b4\1\131\4\uffff\1\u0090\2\uffff\1\u0087\1"+
		"\uffff\1\0\1\uffff\1\11\1\uffff\1\u00c3\1\uffff\1\10\3\uffff\1\130\1\uffff"+
		"\1\21\2\uffff\1\31\3\uffff\1\160\1\u00e4\1\uffff\1\127\40\uffff\1\173"+
		"\3\uffff\1\u0092\1\uffff\1\126\1\u0089\4\uffff\1\u0095\3\uffff\1\u00bb"+
		"\2\uffff\1\u00ad\4\uffff\1\170\1\u00aa\1\u00c6\4\uffff\1\125\1\u00eb\4"+
		"\uffff\1\u00a6\1\uffff\1\u00d0\6\uffff\1\124\1\123\11\uffff\1\174\1\u00e7"+
		"\2\uffff\1\122\3\uffff\1\176\1\u009b\1\u0093\1\u008d\1\121\1\uffff\1\u009d"+
		"\1\u00a0\5\uffff\1\u00c2\3\uffff\1\120\1\14\1\uffff\1\13\1\164\1\3\1\16"+
		"\1\22\1\uffff\1\117\1\u00bf\1\uffff\1\151\1\116\34\uffff\1\u008b\3\uffff"+
		"\1\166\4\uffff\1\115\2\uffff\1\7\1\u008e\1\114\1\u0091\1\5\1\u0085\1\uffff"+
		"\1\u00bc\1\uffff\1\u00c9\11\uffff\1\113\12\uffff\1\u00ba\1\uffff\1\u0086"+
		"\4\uffff\1\145\1\uffff\1\u00de\2\uffff\1\112\2\uffff\1\u00b1\1\uffff\1"+
		"\156\1\153\2\uffff\1\12\1\111\1\6\1\uffff\1\110\1\107\1\uffff\1\106\1"+
		"\u00cb\41\uffff\1\105\4\uffff\1\171\2\uffff\1\104\10\uffff\1\u00d4\3\uffff"+
		"\1\26\1\u00c4\1\37\3\uffff\1\u00d6\1\103\1\35\1\u0081\1\uffff\1\u00b9"+
		"\1\102\1\uffff\1\101\1\100\2\uffff\1\77\1\2\1\27\1\76\1\u00ec\1\40\36"+
		"\uffff\1\u00e1\1\u00dc\1\u008c\3\uffff\1\u00a2\1\u00d5\4\uffff\1\75\3"+
		"\uffff\1\74\1\u009f\1\uffff\1\u00ce\1\u00dd\1\73\1\72\1\71\32\uffff\1"+
		"\70\1\67\1\66\3\uffff\1\65\5\uffff\1\17\1\u00c7\1\uffff\1\64\1\u00ca\33"+
		"\uffff\1\63\1\uffff\1\u00cc\23\uffff\1\u00b8\4\uffff\1\62\15\uffff\1\61"+
		"\1\uffff\1\60\2\uffff\1\20\1\uffff\1\57\15\uffff\1\56\1\uffff\1\55\13"+
		"\uffff\1\54\22\uffff\1\53\11\uffff\1\52\13\uffff}>";
	static final String[] DFA45_transitionS = {
			"\11\36\2\32\2\36\1\32\22\36\1\32\5\36\2\35\1\30\3\36\2\35\1\33\1\36\12"+
			"\31\2\35\5\36\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
			"\1\1\1\3\1\2\1\20\1\34\1\21\1\22\1\23\1\34\1\24\1\25\1\26\1\27\1\34\4"+
			"\36\1\35\1\36\32\35\u1f9e\36\1\35\udfe6\36",
			"\1\45\5\uffff\1\47\2\uffff\1\41\1\43\15\uffff\1\37\7\uffff\1\40\5\uffff"+
			"\1\46\2\uffff\1\42\1\44",
			"\1\52\3\uffff\1\51\3\uffff\1\53",
			"\1\56\25\uffff\1\55\11\uffff\1\54",
			"\1\57\2\uffff\1\60\1\uffff\1\61\1\62\1\63\1\64\6\uffff\1\65",
			"\1\75\33\uffff\1\66\3\uffff\1\67\3\uffff\1\70\2\uffff\1\71\2\uffff\1"+
			"\72\2\uffff\1\73\2\uffff\1\74",
			"\1\105\21\uffff\1\76\3\uffff\1\77\2\uffff\1\100\1\101\2\uffff\1\102"+
			"\2\uffff\1\103\5\uffff\1\104",
			"\1\110\16\uffff\1\106\15\uffff\1\107\2\uffff\1\111",
			"\1\112",
			"\1\117\26\uffff\1\113\2\uffff\1\114\2\uffff\1\115\2\uffff\1\116",
			"\1\125\22\uffff\1\120\3\uffff\1\121\2\uffff\1\122\2\uffff\1\123\2\uffff"+
			"\1\124",
			"\1\127\11\uffff\1\130\21\uffff\1\126",
			"\1\131\1\132\16\uffff\1\133\1\uffff\1\134",
			"\1\135",
			"\1\136\11\uffff\1\137\5\uffff\1\140",
			"\1\146\13\uffff\1\141\3\uffff\1\142\2\uffff\1\143\6\uffff\1\145\u0086"+
			"\uffff\1\144",
			"\1\147\3\uffff\1\150\2\uffff\1\151\3\uffff\1\152\2\uffff\1\153\5\uffff"+
			"\1\154\3\uffff\1\155",
			"\1\162\3\uffff\1\163\33\uffff\1\156\2\uffff\1\157\6\uffff\1\160\5\uffff"+
			"\1\161",
			"\1\u0082\16\uffff\1\177\4\uffff\1\u0081\1\uffff\1\u0080\11\uffff\1\164"+
			"\1\uffff\1\165\1\uffff\1\166\2\uffff\1\167\1\170\1\uffff\1\171\3\uffff"+
			"\1\172\1\173\3\uffff\1\174\1\175\1\uffff\1\176",
			"\1\u0086\2\uffff\1\u008b\6\uffff\1\u0087\5\uffff\1\u0089\22\uffff\1"+
			"\u008a\1\u0083\5\uffff\1\u0084\2\uffff\1\u0085\2\uffff\1\u0088",
			"\1\u008f\3\uffff\1\u008e\37\uffff\1\u008d\3\uffff\1\u008c",
			"\1\u0094\11\uffff\1\u0093\25\uffff\1\u0090\2\uffff\1\u0091\1\u0092",
			"\1\u0095",
			"\1\u0096",
			"\2\u009b\2\uffff\1\u009b\22\uffff\1\u009b\5\uffff\2\u0099\4\uffff\2"+
			"\u0099\2\uffff\12\u0098\2\u0099\5\uffff\14\u009a\1\u0097\15\u009a\4\uffff"+
			"\1\u0099\1\uffff\32\u0099\u1f9e\uffff\1\u0099",
			"\3\50\3\uffff\1\50\1\u009d\1\50\1\uffff\12\u009e\1\u009f\1\50\5\uffff"+
			"\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"",
			"\3\50\3\uffff\2\50\1\u00a2\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"",
			"",
			"",
			"\1\u00a4\1\uffff\1\u00a5\4\uffff\1\u00a3",
			"\1\u00a6\4\uffff\1\u00a7",
			"\1\u00a9\62\uffff\1\u00a8",
			"\1\u00a9\122\uffff\1\u00aa",
			"\1\u00a9",
			"\1\u00a9",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b2\3\uffff\1\u00b1",
			"\1\u00b3\25\uffff\1\u00b4",
			"\1\u00b5",
			"\1\u00b6\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf\2\uffff\1\u00c0\7\uffff\1\u00c1\5\uffff\1\u00c2",
			"\1\u00c3",
			"\1\u00c4\15\uffff\1\u00c5\5\uffff\1\u00c6",
			"\1\u00c7\1\u00c8\1\uffff\1\u00c9\2\uffff\1\u00ca\1\u00cb",
			"\1\u00cc\7\uffff\1\u00cd\13\uffff\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1\4\uffff\1\u00d2\3\uffff\1\u00d3\3\uffff\1\u00d4",
			"\1\u00d5",
			"\1\u00d6\3\uffff\1\u00d7\5\uffff\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db\10\uffff\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df\10\uffff\1\u00e0\1\uffff\1\u00e1",
			"\1\u00e2\4\uffff\1\u00e3",
			"\1\u00a9",
			"\1\u00a9",
			"\1\u00e4\14\uffff\1\u00e5",
			"\1\u00e6\10\uffff\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea\3\uffff\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0\5\uffff\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4\3\uffff\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd\14\uffff\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101\4\uffff\1\u0102\3\uffff\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108\1\uffff\1\u0109",
			"\1\u010a\1\uffff\1\u010b\6\uffff\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f\2\uffff\1\u0110\1\u0111\1\uffff\1\u0112\2\uffff\1\u0113",
			"\1\u0114\4\uffff\1\u0115",
			"\1\u0116",
			"\1\u0117\17\uffff\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e\2\uffff\1\u011f\1\u0120\6\uffff\1\u0121",
			"\1\u0122\6\uffff\1\u0123",
			"\1\u0124\22\uffff\1\u0125",
			"\1\u0126\3\uffff\1\u0127",
			"\1\u0128\11\uffff\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c\7\uffff\1\u012d",
			"\1\u012e",
			"\1\u0130\4\uffff\1\u012f",
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
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0146\4\uffff\1\u0143\2\uffff\1\u0144\6\uffff\1\u0145",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u014f\4\uffff\2\u014e\1"+
			"\uffff\1\u0151\2\uffff\2\u014e\1\u014f\13\uffff\2\u014e\3\uffff\1\u014f"+
			"\1\uffff\32\u014e\4\uffff\1\u014e\1\uffff\10\u014e\1\u014d\21\u014e\u1f9e"+
			"\uffff\1\u014e",
			"\2\u0153\2\uffff\1\u0153\22\uffff\1\u0153\10\uffff\1\u0154\6\uffff\12"+
			"\u0152",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u0155\4\uffff\2\u0099\1"+
			"\uffff\1\u0151\2\uffff\2\u0099\1\u0155\13\uffff\2\u0099\3\uffff\1\u0155"+
			"\37\uffff\1\u0099\1\uffff\32\u0099\u1f9e\uffff\1\u0099",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u014f\4\uffff\2\u014e\1"+
			"\uffff\1\u0151\2\uffff\2\u014e\1\u014f\13\uffff\2\u014e\3\uffff\1\u014f"+
			"\1\uffff\32\u014e\4\uffff\1\u014e\1\uffff\32\u014e\u1f9e\uffff\1\u014e",
			"",
			"",
			"\12\u0156",
			"\3\50\3\uffff\1\50\1\u009d\1\50\1\uffff\12\u009e\1\u009f\1\50\5\uffff"+
			"\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\12\u0157",
			"",
			"",
			"\3\50\3\uffff\2\50\1\u00a2\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u00a9",
			"",
			"\1\u00a9",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\144",
			"\1\u0161",
			"\1\u0163\7\uffff\1\u0162",
			"\1\u0164\20\uffff\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171\15\uffff\1\u0172",
			"\1\u0173\12\uffff\1\u0174\2\uffff\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d\25\uffff\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184\22\uffff\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a\3\uffff\1\u018b",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190\5\uffff\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u00a9\113\uffff\1\u0196",
			"\1\u0197",
			"\1\u00a9",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e\5\uffff\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"\1\144",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab\27\uffff\1\u01ac",
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
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
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
			"\1\u01e3\5\uffff\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb\7\uffff\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef\1\u01f0",
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
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u014f\4\uffff\2\u014e\1"+
			"\uffff\1\u0151\2\uffff\2\u014e\1\u014f\13\uffff\2\u014e\3\uffff\1\u014f"+
			"\1\uffff\32\u014e\4\uffff\1\u014e\1\uffff\22\u014e\1\u020c\7\u014e\u1f9e"+
			"\uffff\1\u014e",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u014f\4\uffff\2\u014e\1"+
			"\uffff\1\u0151\2\uffff\2\u014e\1\u014f\13\uffff\2\u014e\3\uffff\1\u014f"+
			"\1\uffff\32\u014e\4\uffff\1\u014e\1\uffff\32\u014e\u1f9e\uffff\1\u014e",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\10\uffff\1\u0151",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\5\uffff\2\u020d\4\uffff\2"+
			"\u020d\2\uffff\12\u020e\2\u020d\5\uffff\32\u020f\4\uffff\1\u020d\1\uffff"+
			"\32\u020d\u1f9e\uffff\1\u020d",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0153\2\uffff\1\u0153\22\uffff\1\u0153\10\uffff\1\u0154\6\uffff\12"+
			"\u0211",
			"\2\u0153\2\uffff\1\u0153\22\uffff\1\u0153\5\uffff\2\u020d\1\uffff\1"+
			"\u009b\2\uffff\2\u020d\2\uffff\12\u020e\2\u020d\5\uffff\32\u020f\4\uffff"+
			"\1\u020d\1\uffff\32\u020d\u1f9e\uffff\1\u020d",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\10\uffff\1\u0151",
			"\1\u0212\2\uffff\12\u0156",
			"\2\u0213\2\uffff\1\u0213\22\uffff\1\u0213\17\uffff\12\u0157",
			"\1\u0214\3\uffff\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u00a9",
			"\1\u00a9",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\144",
			"\1\u021e",
			"\1\u021f\3\uffff\1\u0220",
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
			"\1\144\103\uffff\1\u0242\10\uffff\1\u0243",
			"\1\u01f9",
			"\1\u0244",
			"\1\u0245",
			"\1\144",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\144",
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
			"\1\u0259\17\uffff\1\u0258",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\144",
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
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\4\uffff\2\50\2\uffff\1\50\1\u0289\12\50\5\uffff\1\50\1\u028a\1"+
			"\u028b\1\50\1\u028c\1\u028d\1\u028e\1\50\1\u028f\1\50\1\u0290\1\u0291"+
			"\1\u0288\1\u0292\3\50\1\u0293\1\u0294\1\u0295\2\50\1\u0296\3\50\4\uffff"+
			"\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u0297\7\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\2\u02a0\2\uffff\1\u02a0\22\uffff\1\u02a0",
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
			"\1\144",
			"\1\u02ab",
			"\1\u02ac",
			"\1\144",
			"\1\144",
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
			"\1\u02b9",
			"\1\144\17\uffff\1\u02ba",
			"\1\u02bb",
			"\1\u02bc",
			"",
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
			"\1\144",
			"\1\u02c7",
			"\1\u02c8",
			"\1\144\107\uffff\1\u02c9",
			"\1\u02ca",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u014f\4\uffff\2\u014e\1"+
			"\uffff\1\u0151\2\uffff\2\u014e\1\u014f\13\uffff\2\u014e\3\uffff\1\u014f"+
			"\1\uffff\32\u014e\4\uffff\1\u014e\1\uffff\2\u014e\1\u02ce\27\u014e\u1f9e"+
			"\uffff\1\u014e",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02cf\4\uffff\2\u020d\1"+
			"\uffff\1\u0151\2\uffff\2\u020d\1\u02cf\13\uffff\2\u020d\3\uffff\1\u02cf"+
			"\37\uffff\1\u020d\1\uffff\32\u020d\u1f9e\uffff\1\u020d",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\10\uffff\1\u0151\6\uffff\12"+
			"\u020e",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\32\u02d0\u1f9e\uffff\1\u02d0",
			"",
			"\2\u0153\2\uffff\1\u0153\22\uffff\1\u0153\10\uffff\1\u02d2\6\uffff\12"+
			"\u02d3",
			"\12\u02d4",
			"",
			"\1\u02d5",
			"\1\u02d6",
			"\1\u02d7",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"",
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
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
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
			"\1\144",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u02fc",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"\1\u0302",
			"\1\144",
			"\1\u0303",
			"\1\u0304",
			"\1\u0305",
			"\1\144",
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
			"\1\144\122\uffff\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u0316",
			"\1\144",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\144",
			"\1\u031d",
			"\1\u031e",
			"\1\144\104\uffff\1\u031f",
			"\1\u0320",
			"\1\u02a0",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\144",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\144",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\1\u032e",
			"\1\u032f",
			"\1\144",
			"\1\u0330",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\1\144\122\uffff\1\u0336",
			"\1\u0337",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u033e\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\10\uffff\1\50\6\uffff\3\50\1\u033f"+
			"\1\50\1\u0340\4\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0342\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\16\50\1\u0341\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0343\3\50\1\u0344\2\50\1\u0345\5\50\1\u0346\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0347\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0348\2\50\1\u0349\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u034a\11\50\1\u034b\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u034c\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u034d\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u034e"+
			"\15\50\1\u034f\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0350\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0351\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u0352\6\50\1\u0353\1\u0354\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0355\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0356\2\50\1\u0357\1\u0358\21\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"",
			"\1\144",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\1\u0364",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\144",
			"\1\u0369",
			"\1\144",
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
			"\1\u0376",
			"",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\1\u037e",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\144",
			"\1\u0382",
			"\1\u0383",
			"\1\u0384",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u014f\4\uffff\2\u014e\1"+
			"\uffff\1\u0151\2\uffff\2\u014e\1\u0389\13\uffff\2\u014e\3\uffff\1\u014f"+
			"\1\uffff\32\u014e\4\uffff\1\u014e\1\uffff\32\u014e\u1f9e\uffff\1\u014e",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\10\uffff\1\u0151",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\32\u02d0\u1f9e\uffff\1\u02d0",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\10\uffff\1\u0151",
			"\2\u038a\2\uffff\1\u038a\22\uffff\1\u038a\5\uffff\3\50\3\uffff\3\50"+
			"\1\uffff\12\u038b\2\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\u0153\2\uffff\1\u0153\22\uffff\1\u0153\10\uffff\1\u0154\6\uffff\12"+
			"\u02d3",
			"\1\u038c\2\uffff\12\u02d4",
			"\1\u021b",
			"\1\u038d",
			"\1\u038e",
			"\1\u038f",
			"\1\u0390",
			"\1\u0391",
			"\1\u0391",
			"\1\u0392",
			"\1\u021b",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\144",
			"\1\u039a",
			"\1\uffff",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\1\144\122\uffff\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u03aa",
			"\1\uffff",
			"\1\144",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"\1\144",
			"\1\u03b0",
			"\1\u03b1",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u03b8",
			"\1\u03b9",
			"\1\u03ba",
			"\1\144",
			"\1\u03bb",
			"\1\144",
			"\1\u03bc",
			"\1\u03bd",
			"",
			"\1\u03be",
			"\1\u03bf",
			"\1\u03c0",
			"\1\144",
			"\1\u0391",
			"\1\u0391",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\1\u03c4",
			"\1\u03c5",
			"",
			"\1\144",
			"\1\u03c6",
			"\1\u03c7",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\1\u03d0",
			"",
			"\1\u03d1",
			"\1\144",
			"\1\u03d2",
			"\1\u03d3",
			"\1\144",
			"\1\u03d4",
			"\1\uffff",
			"\1\u03d5",
			"\1\144",
			"\1\u03d6",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u03d8",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u03da\4\50\1\u03d9\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u03db\10\uffff\1\50\6\uffff\12\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u03dc\10\uffff\1\50\6\uffff\12\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u03dd\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\1\u03de\1\50\4\uffff\2\50\2"+
			"\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u03df\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u03e0\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u03e1\10\50\1\u03e2\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03e3\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u03e4\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u03e5\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u03e6"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03e7\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u03e8\5\50\1\u03e9\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u03ea\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u03eb\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\50"+
			"\1\u03ec\30\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u03ed\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\25"+
			"\50\1\u03ee\4\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u03ef\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u03f0\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u03f1"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u03f2\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u03f3\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u03f4\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u03f5\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03f6\10\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u03f7",
			"\1\u03f8",
			"\1\u03f9",
			"\1\u03fa",
			"\1\u03fb",
			"\1\u03fc",
			"\1\u03fd",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\1\u040a",
			"\1\144",
			"\1\u0391",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"\1\u040e",
			"\1\u0391",
			"\1\u040f",
			"\1\u0410",
			"\1\u0411",
			"\1\u0412",
			"\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
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
			"\1\u0422",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0423\10\uffff\1\u0151",
			"",
			"\12\u0424",
			"\12\u0425",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0428",
			"\1\u0429",
			"\2\u042a\2\uffff\1\u042a\22\uffff\1\u042a",
			"\1\u042b",
			"\1\144",
			"\1\u042c",
			"\1\144",
			"\1\u042d",
			"\1\u042e",
			"\1\u042f",
			"\1\u0430",
			"\1\u0431",
			"\1\144",
			"\1\u0432",
			"\1\u0433",
			"\1\u0434",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\144",
			"\1\u0436",
			"\1\u0437",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\u0438",
			"\1\u0439",
			"\1\uffff",
			"\1\144\122\uffff\1\u043a",
			"\1\uffff",
			"\1\u043b",
			"\1\u043c",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u043e",
			"\1\u043f",
			"\1\u0440",
			"\1\u0441",
			"\1\u0442",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\u0443",
			"\1\u0444",
			"\1\u0445",
			"\1\u0446",
			"\1\144",
			"\1\u0447",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u0448",
			"\1\144",
			"\1\u0449",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u044b",
			"\1\u0324",
			"\1\u044c",
			"\1\144",
			"\1\u044d",
			"\1\u044e",
			"\1\u044f",
			"\1\uffff",
			"\1\u0450",
			"\1\144",
			"\1\u0451",
			"\1\u0452",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0454",
			"\1\u0455",
			"\1\u0456",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0458",
			"\1\uffff",
			"\1\u0459",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u045a\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u045b\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\10\50\1\u045c\21\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\10\50\1\u045d\21\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u045e\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u045f\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\37\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0460\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u0461\15\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u0462\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0463\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u0464\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u0465\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u0466\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0467\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u0468\15\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0469\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u046a\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u046b\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u046c\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u046d\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u046e\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u046f"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0470\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0471\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0472\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0473\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0475\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0476\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0477\25\50\u1f9e\uffff\1\50",
			"\1\u0478",
			"\1\144",
			"\1\u0479",
			"\1\u047a",
			"\1\u047b",
			"\1\144",
			"\1\u047c",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u047e",
			"\1\u047f",
			"\1\u0480",
			"\1\u0481",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0483",
			"\1\u0484",
			"\1\u0485",
			"\1\144",
			"\1\u0486",
			"\1\u0487",
			"\1\144",
			"\1\u0488",
			"\1\u0489",
			"\1\u048a",
			"\1\u048b",
			"\1\144",
			"\1\144",
			"\1\u048c",
			"\1\u0391",
			"\1\u0391",
			"\1\u048d",
			"\1\u048e",
			"\1\uffff",
			"\1\144\122\uffff\1\u048f",
			"\1\u0490",
			"\1\u0331",
			"\1\u0491",
			"\1\u0492",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0494",
			"\1\u0495",
			"\1\u0496",
			"\1\u0497",
			"\1\u0498",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\5\uffff\2\u020d\4\uffff\2"+
			"\u020d\2\uffff\12\u020e\2\u020d\5\uffff\1\u020f\1\u049a\1\u020f\1\u0499"+
			"\26\u020f\4\uffff\1\u020d\1\uffff\32\u020d\u1f9e\uffff\1\u020d",
			"\12\u049b",
			"\3\50\3\uffff\3\50\1\uffff\12\u0425\2\50\5\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\uffff",
			"\1\u049d",
			"\1\u049e",
			"",
			"\1\u049f",
			"\1\u04a0",
			"\1\u04a1",
			"\1\u04a2",
			"\1\u04a3",
			"\1\u04a4",
			"\1\144",
			"\1\144",
			"\1\u04a5",
			"\1\u04a6",
			"\1\uffff",
			"\1\u04a7",
			"\1\u04a8",
			"\1\u04a9",
			"\1\144",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\uffff",
			"\1\u04ab",
			"\1\144",
			"\1\144",
			"\1\u04ac",
			"\1\u04ad",
			"\1\u04ae",
			"\1\u04af",
			"\1\u04b0",
			"\1\144",
			"\1\u04b1",
			"\1\u04b2",
			"\1\u04b3",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u04b5",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4"+
			"\50\1\u04b6\15\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\144",
			"\1\u04b9",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u04bb",
			"\1\144",
			"\1\uffff",
			"\1\u04bc",
			"\1\u04bd",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\2"+
			"\50\1\u04be\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04bf"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u04c0\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u04c1\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u04c2\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\17\50\1\u04c3\12\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04c4"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\50"+
			"\1\u04c5\30\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04c6\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u04c7\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u04c8\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u04c9\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u04ca\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\1"+
			"\50\1\u04cb\1\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04cc"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04cd\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u04ce\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04cf\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\1\u04d0\1\50\4\uffff\2\50\2"+
			"\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04d1"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u04d2\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\7\50\1\u04d3\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u04d4\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04d5\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u04d6\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u04d7\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04d8\25\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\5\uffff\2\50\1\u04dc\3\uffff\3\50"+
			"\1\uffff\14\50\5\uffff\1\u04d9\1\u04db\15\50\1\u04da\12\50\4\uffff\1"+
			"\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04de\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04df\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7"+
			"\50\1\u04e0\22\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u04e1",
			"\1\u04e2",
			"\1\u04e3",
			"",
			"\1\uffff",
			"\1\u0391",
			"\1\u04e4",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\144",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u04e6",
			"\1\144",
			"\1\u04e7",
			"\1\u0495",
			"\1\u04e8",
			"\1\u0391",
			"",
			"\1\u0391",
			"\1\u0391",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"",
			"\1\u04e9",
			"\1\u04ea",
			"\1\uffff",
			"\1\u04eb",
			"",
			"\1\u04ec",
			"\1\u04ed",
			"\1\u04ee",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\16\u02d0\1\u04ef\13\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\10\u02d0\1\u04f0\21\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\1\u04f1",
			"",
			"\1\u04f2",
			"\1\144",
			"\1\u04f3",
			"\1\144",
			"\1\u04f4",
			"\1\u04f5",
			"\1\u04f6",
			"\1\u04f7",
			"\1\144",
			"\1\u04f8",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u04fa",
			"\1\u04fb",
			"\1\uffff",
			"\1\u04fc",
			"\1\u04fd",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u04ff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0502",
			"\1\u0503",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\144",
			"\1\u0505",
			"\1\uffff",
			"\1\uffff",
			"\1\u0506",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0508",
			"\1\u0509",
			"\2\50\2\uffff\1\50\22\uffff\1\u050a\10\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u050b\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u050c\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u050d\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u050e\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u050f\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u0510\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0511\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0512\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0513\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\1"+
			"\50\1\u0514\1\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0515\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\2\50\1\u0516\27\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0517\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0518\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0519\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u051a\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\37\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u051b\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u051c\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u051d"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u051e\7\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u051f\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0520"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\27"+
			"\50\1\u0521\2\50\u1f9e\uffff\1\50",
			"\1\u0522",
			"\1\u0523",
			"\1\u0524",
			"\2\50\4\uffff\2\50\2\uffff\14\50\5\uffff\14\50\1\u0525\15\50\4\uffff"+
			"\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\1\u0526\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0527"+
			"\31\50\u1f9e\uffff\1\50",
			"\1\u0528",
			"\1\144",
			"\1\u0529",
			"\1\u052a",
			"\1\uffff",
			"\1\u052b",
			"\1\u052c",
			"\1\u052d",
			"\1\u052e",
			"\1\u0391",
			"\1\u052f",
			"\1\u0391",
			"\1\u0530",
			"\1\144",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\6\u02d0\1\u0531\23\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\23\u02d0\1\u0532\6\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\12\u0533",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u0535",
			"\1\u0536",
			"\1\u0537",
			"\1\144",
			"\1\uffff",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0539",
			"\1\144",
			"\1\uffff",
			"\1\u053a",
			"\1\uffff",
			"\1\uffff",
			"\1\u053b",
			"\1\u053c",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\1\50\1\u0541\1\50\1\u0540\26\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u0542\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0543\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0544\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u0545\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0546\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0547\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0548\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\2\50\1\u0549\27\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u054a\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u054b\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u054c\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\21\50\1\u054d\10\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u054e\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u054f\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0550\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u0551\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0552\1\50\4\uffff\2\50\1\uffff\1\u0474"+
			"\2\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1"+
			"\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0553\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u0554",
			"\1\u0555",
			"\1\u0556",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0557\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u0558\7\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0559\21\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u055d",
			"\1\u055e",
			"\1\u055f",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u0561",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0562\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\22\u02d0\1\u0563\7\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\2\u02d0\1\u0564\27\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\12\u0565",
			"\1\uffff",
			"\1\u0566",
			"\1\u0567",
			"\1\u0568",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u056a",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u056b\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u056c\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u056d\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u056e"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u056f\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0570\1\50\4\uffff\2\50\1\uffff\1\u0474"+
			"\2\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1"+
			"\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0571"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u0572\3\50\1\u0573\3\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0574\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0575"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0576\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0577\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u0578\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0579\26\50\u1f9e\uffff\1\50",
			"\1\u057a",
			"\1\u057b",
			"\1\u057c",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u03d9\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u057d\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u057e\10\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u057f",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u0580",
			"\1\uffff",
			"\1\u0581",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0583\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\32\u02d0\u1f9e\uffff\1\u02d0",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\7\u02d0\1\u0584\22\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\12\u0585",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\1\u0587",
			"\1\u0588",
			"\1\uffff",
			"\1\144",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0589\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u058a\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u058b\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u058c\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u058d"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u058e\17\50\1\u058f\7\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0590\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0591\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0592\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0593\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0594\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0595\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0596\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u0597",
			"\1\u0598",
			"\1\u0599",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u059a\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u059b\25\50\u1f9e\uffff\1\50",
			"\1\u059c",
			"",
			"\1\u059d",
			"",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u059e\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\4\u02d0\1\u059f\25\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\12\u05a0",
			"\1\uffff",
			"",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05a2\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u05a3\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05a4\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05a5\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05a6\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05a7\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u05a8\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05a9\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05aa\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05ab\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05ac\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05ad\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05ae"+
			"\31\50\u1f9e\uffff\1\50",
			"\1\50\4\uffff\2\50\1\u04dc\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u05b0",
			"\1\50\4\uffff\2\50\1\u04dc\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05b2\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05b3\26\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u05b4",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u0151\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\22\u02d0\1\u05b5\7\u02d0\u1f9e"+
			"\uffff\1\u02d0",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05b7\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05b8\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u05b9\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05ba\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05bb\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05bc\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05bd\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05be\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05bf\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05c0"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05c1\6\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u05c2",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u05c3\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d0\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01cf\7\50\u1f9e\uffff\1\50",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\1\u02d1\4\uffff\2\u02d0\1"+
			"\uffff\1\u05c5\2\uffff\2\u02d0\1\u02d1\13\uffff\2\u02d0\3\uffff\1\u02d1"+
			"\1\uffff\32\u02d0\4\uffff\1\u02d0\1\uffff\32\u02d0\u1f9e\uffff\1\u02d0",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05c7\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4"+
			"\50\1\u05c8\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\1\50\1\u05c9\30\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05ca\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u05cb\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05cc\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05cd\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05ce\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u05cf\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u05d0",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u05d1\23\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u05d3\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05d4"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05d5\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u05d6\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05d7\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05d8"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\3\50\1\u05d9\26\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\1\u05da",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05db\25\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05dc\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u05dd\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05de\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u05df\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05e0"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05e1\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u05e2\5\50\u1f9e\uffff\1\50",
			"\1\u05e3",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05e4\10\50\u1f9e\uffff\1\50",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05e6\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05e7\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05e8\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05e9\27\50\u1f9e\uffff\1\50",
			"\1\u05ea",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05eb\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05ec\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05ed\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u05ee\17\50\u1f9e\uffff\1\50",
			"\1\50\4\uffff\2\50\1\u04dc\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05f0\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05f1\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u05f2\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05f3\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\23\50\1\u05f4\6\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05f5\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u05f6\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u05f7\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05f8\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u05f9\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u05fa\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u0474\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50"
	};

	static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
	static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
	static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
	static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
	static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
	static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
	static final short[][] DFA45_transition;

	static {
		int numStates = DFA45_transitionS.length;
		DFA45_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
		}
	}

	class DFA45 extends DFA {

		public DFA45(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 45;
			this.eot = DFA45_eot;
			this.eof = DFA45_eof;
			this.min = DFA45_min;
			this.max = DFA45_max;
			this.accept = DFA45_accept;
			this.special = DFA45_special;
			this.transition = DFA45_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | GROUP_RING | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | STANDALONE_COMMENT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA45_961 = input.LA(1);
						 
						int index45_961 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_961==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_961);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA45_932 = input.LA(1);
						 
						int index45_932 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_932==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_932);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA45_1285 = input.LA(1);
						 
						int index45_1285 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1285=='s') ) {s = 463;}
						else if ( ((LA45_1285 >= '\t' && LA45_1285 <= '\n')||LA45_1285=='\r'||LA45_1285==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1285=='(') ) {s = 464;}
						else if ( (LA45_1285=='!'||(LA45_1285 >= '&' && LA45_1285 <= '\'')||(LA45_1285 >= ',' && LA45_1285 <= '.')||(LA45_1285 >= '0' && LA45_1285 <= ';')||LA45_1285=='?'||(LA45_1285 >= 'A' && LA45_1285 <= 'Z')||LA45_1285=='_'||(LA45_1285 >= 'a' && LA45_1285 <= 'r')||(LA45_1285 >= 't' && LA45_1285 <= 'z')||LA45_1285=='\u2019') ) {s = 40;}
						else s = 1341;
						 
						input.seek(index45_1285);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA45_1103 = input.LA(1);
						 
						int index45_1103 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1103=='s') ) {s = 463;}
						else if ( ((LA45_1103 >= '\t' && LA45_1103 <= '\n')||LA45_1103=='\r'||LA45_1103==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1103=='(') ) {s = 464;}
						else if ( (LA45_1103=='!'||(LA45_1103 >= '&' && LA45_1103 <= '\'')||(LA45_1103 >= ',' && LA45_1103 <= '.')||(LA45_1103 >= '0' && LA45_1103 <= ';')||LA45_1103=='?'||(LA45_1103 >= 'A' && LA45_1103 <= 'Z')||LA45_1103=='_'||(LA45_1103 >= 'a' && LA45_1103 <= 'r')||(LA45_1103 >= 't' && LA45_1103 <= 'z')||LA45_1103=='\u2019') ) {s = 40;}
						else s = 1208;
						 
						input.seek(index45_1103);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA45_805 = input.LA(1);
						 
						int index45_805 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_805==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_805);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA45_1156 = input.LA(1);
						 
						int index45_1156 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1156==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1156);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA45_1205 = input.LA(1);
						 
						int index45_1205 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1205==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1205);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA45_1152 = input.LA(1);
						 
						int index45_1152 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1152==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1152);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA45_967 = input.LA(1);
						 
						int index45_967 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_967==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_967);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA45_963 = input.LA(1);
						 
						int index45_963 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_963=='s') ) {s = 463;}
						else if ( ((LA45_963 >= '\t' && LA45_963 <= '\n')||LA45_963=='\r'||LA45_963==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_963=='(') ) {s = 464;}
						else if ( (LA45_963=='!'||(LA45_963 >= '&' && LA45_963 <= '\'')||(LA45_963 >= ',' && LA45_963 <= '.')||(LA45_963 >= '0' && LA45_963 <= ';')||LA45_963=='?'||(LA45_963 >= 'A' && LA45_963 <= 'Z')||LA45_963=='_'||(LA45_963 >= 'a' && LA45_963 <= 'r')||(LA45_963 >= 't' && LA45_963 <= 'z')||LA45_963=='\u2019') ) {s = 40;}
						else s = 1098;
						 
						input.seek(index45_963);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA45_1203 = input.LA(1);
						 
						int index45_1203 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1203=='s') ) {s = 463;}
						else if ( ((LA45_1203 >= '\t' && LA45_1203 <= '\n')||LA45_1203=='\r'||LA45_1203==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1203=='(') ) {s = 464;}
						else if ( (LA45_1203=='!'||(LA45_1203 >= '&' && LA45_1203 <= '\'')||(LA45_1203 >= ',' && LA45_1203 <= '.')||(LA45_1203 >= '0' && LA45_1203 <= ';')||LA45_1203=='?'||(LA45_1203 >= 'A' && LA45_1203 <= 'Z')||LA45_1203=='_'||(LA45_1203 >= 'a' && LA45_1203 <= 'r')||(LA45_1203 >= 't' && LA45_1203 <= 'z')||LA45_1203=='\u2019') ) {s = 40;}
						else s = 1284;
						 
						input.seek(index45_1203);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA45_1101 = input.LA(1);
						 
						int index45_1101 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1101==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1101);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA45_1099 = input.LA(1);
						 
						int index45_1099 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1099=='s') ) {s = 463;}
						else if ( ((LA45_1099 >= '\t' && LA45_1099 <= '\n')||LA45_1099=='\r'||LA45_1099==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1099=='(') ) {s = 464;}
						else if ( (LA45_1099=='!'||(LA45_1099 >= '&' && LA45_1099 <= '\'')||(LA45_1099 >= ',' && LA45_1099 <= '.')||(LA45_1099 >= '0' && LA45_1099 <= ';')||LA45_1099=='?'||(LA45_1099 >= 'A' && LA45_1099 <= 'Z')||LA45_1099=='_'||(LA45_1099 >= 'a' && LA45_1099 <= 'r')||(LA45_1099 >= 't' && LA45_1099 <= 'z')||LA45_1099=='\u2019') ) {s = 40;}
						else s = 1204;
						 
						input.seek(index45_1099);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA45_625 = input.LA(1);
						 
						int index45_625 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_625==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_625);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA45_1104 = input.LA(1);
						 
						int index45_1104 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1104==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1104);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA45_1382 = input.LA(1);
						 
						int index45_1382 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1382=='s') ) {s = 463;}
						else if ( ((LA45_1382 >= '\t' && LA45_1382 <= '\n')||LA45_1382=='\r'||LA45_1382==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1382=='(') ) {s = 464;}
						else if ( (LA45_1382=='!'||(LA45_1382 >= '&' && LA45_1382 <= '\'')||(LA45_1382 >= ',' && LA45_1382 <= '.')||(LA45_1382 >= '0' && LA45_1382 <= ';')||LA45_1382=='?'||(LA45_1382 >= 'A' && LA45_1382 <= 'Z')||LA45_1382=='_'||(LA45_1382 >= 'a' && LA45_1382 <= 'r')||(LA45_1382 >= 't' && LA45_1382 <= 'z')||LA45_1382=='\u2019') ) {s = 40;}
						else s = 1414;
						 
						input.seek(index45_1382);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA45_1460 = input.LA(1);
						 
						int index45_1460 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1460=='s') ) {s = 463;}
						else if ( ((LA45_1460 >= '\t' && LA45_1460 <= '\n')||LA45_1460=='\r'||LA45_1460==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1460=='(') ) {s = 464;}
						else if ( (LA45_1460=='!'||(LA45_1460 >= '&' && LA45_1460 <= '\'')||(LA45_1460 >= ',' && LA45_1460 <= '.')||(LA45_1460 >= '0' && LA45_1460 <= ';')||LA45_1460=='?'||(LA45_1460 >= 'A' && LA45_1460 <= 'Z')||LA45_1460=='_'||(LA45_1460 >= 'a' && LA45_1460 <= 'r')||(LA45_1460 >= 't' && LA45_1460 <= 'z')||LA45_1460=='\u2019') ) {s = 40;}
						else s = 1476;
						 
						input.seek(index45_1460);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA45_973 = input.LA(1);
						 
						int index45_973 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_973==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_973);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA45_1105 = input.LA(1);
						 
						int index45_1105 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1105==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1105);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA45_565 = input.LA(1);
						 
						int index45_565 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_565==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_565);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA45_909 = input.LA(1);
						 
						int index45_909 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_909=='s') ) {s = 463;}
						else if ( ((LA45_909 >= '\t' && LA45_909 <= '\n')||LA45_909=='\r'||LA45_909==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_909=='(') ) {s = 464;}
						else if ( (LA45_909=='!'||(LA45_909 >= '&' && LA45_909 <= '\'')||(LA45_909 >= ',' && LA45_909 <= '.')||(LA45_909 >= '0' && LA45_909 <= ';')||LA45_909=='?'||(LA45_909 >= 'A' && LA45_909 <= 'Z')||LA45_909=='_'||(LA45_909 >= 'a' && LA45_909 <= 'r')||(LA45_909 >= 't' && LA45_909 <= 'z')||LA45_909=='\u2019') ) {s = 40;}
						else s = 1062;
						 
						input.seek(index45_909);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA45_632 = input.LA(1);
						 
						int index45_632 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_632==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_632);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA45_1266 = input.LA(1);
						 
						int index45_1266 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1266==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1266);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA45_1286 = input.LA(1);
						 
						int index45_1286 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1286=='s') ) {s = 463;}
						else if ( ((LA45_1286 >= '\t' && LA45_1286 <= '\n')||LA45_1286=='\r'||LA45_1286==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1286=='(') ) {s = 464;}
						else if ( (LA45_1286=='!'||(LA45_1286 >= '&' && LA45_1286 <= '\'')||(LA45_1286 >= ',' && LA45_1286 <= '.')||(LA45_1286 >= '0' && LA45_1286 <= ';')||LA45_1286=='?'||(LA45_1286 >= 'A' && LA45_1286 <= 'Z')||LA45_1286=='_'||(LA45_1286 >= 'a' && LA45_1286 <= 'r')||(LA45_1286 >= 't' && LA45_1286 <= 'z')||LA45_1286=='\u2019') ) {s = 40;}
						else s = 1342;
						 
						input.seek(index45_1286);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA45_910 = input.LA(1);
						 
						int index45_910 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_910=='s') ) {s = 463;}
						else if ( ((LA45_910 >= '\t' && LA45_910 <= '\n')||LA45_910=='\r'||LA45_910==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_910=='(') ) {s = 464;}
						else if ( (LA45_910=='!'||(LA45_910 >= '&' && LA45_910 <= '\'')||(LA45_910 >= ',' && LA45_910 <= '.')||(LA45_910 >= '0' && LA45_910 <= ';')||LA45_910=='?'||(LA45_910 >= 'A' && LA45_910 <= 'Z')||LA45_910=='_'||(LA45_910 >= 'a' && LA45_910 <= 'r')||(LA45_910 >= 't' && LA45_910 <= 'z')||LA45_910=='\u2019') ) {s = 40;}
						else s = 1063;
						 
						input.seek(index45_910);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA45_976 = input.LA(1);
						 
						int index45_976 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_976=='s') ) {s = 463;}
						else if ( ((LA45_976 >= '\t' && LA45_976 <= '\n')||LA45_976=='\r'||LA45_976==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_976=='(') ) {s = 464;}
						else if ( (LA45_976=='!'||(LA45_976 >= '&' && LA45_976 <= '\'')||(LA45_976 >= ',' && LA45_976 <= '.')||(LA45_976 >= '0' && LA45_976 <= ';')||LA45_976=='?'||(LA45_976 >= 'A' && LA45_976 <= 'Z')||LA45_976=='_'||(LA45_976 >= 'a' && LA45_976 <= 'r')||(LA45_976 >= 't' && LA45_976 <= 'z')||LA45_976=='\u2019') ) {s = 40;}
						else s = 1107;
						 
						input.seek(index45_976);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA45_811 = input.LA(1);
						 
						int index45_811 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_811=='s') ) {s = 463;}
						else if ( ((LA45_811 >= '\t' && LA45_811 <= '\n')||LA45_811=='\r'||LA45_811==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_811=='(') ) {s = 464;}
						else if ( (LA45_811=='!'||(LA45_811 >= '&' && LA45_811 <= '\'')||(LA45_811 >= ',' && LA45_811 <= '.')||(LA45_811 >= '0' && LA45_811 <= ';')||LA45_811=='?'||(LA45_811 >= 'A' && LA45_811 <= 'Z')||LA45_811=='_'||(LA45_811 >= 'a' && LA45_811 <= 'r')||(LA45_811 >= 't' && LA45_811 <= 'z')||LA45_811=='\u2019') ) {s = 40;}
						else s = 971;
						 
						input.seek(index45_811);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA45_220 = input.LA(1);
						 
						int index45_220 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_220=='l') ) {s = 406;}
						else if ( (LA45_220==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_220);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA45_948 = input.LA(1);
						 
						int index45_948 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_948==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_948);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA45_1274 = input.LA(1);
						 
						int index45_1274 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1274==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1274);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA45_915 = input.LA(1);
						 
						int index45_915 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_915==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_915);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA45_1268 = input.LA(1);
						 
						int index45_1268 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1268==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1268);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA45_1289 = input.LA(1);
						 
						int index45_1289 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1289==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1289);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA45_355 = input.LA(1);
						 
						int index45_355 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_355==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_355);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA45_933 = input.LA(1);
						 
						int index45_933 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_933==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_933);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA45_917 = input.LA(1);
						 
						int index45_917 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_917==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_917);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA45_934 = input.LA(1);
						 
						int index45_934 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_934==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_934);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA45_621 = input.LA(1);
						 
						int index45_621 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_621==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_621);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA45_72 = input.LA(1);
						 
						int index45_72 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_72==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_72);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA45_349 = input.LA(1);
						 
						int index45_349 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_349==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_349);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA45_612 = input.LA(1);
						 
						int index45_612 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_612==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_612=='e') ) {s = 799;}
						else s = 40;
						 
						input.seek(index45_612);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA45_35 = input.LA(1);
						 
						int index45_35 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_35==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_35);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA45_1519 = input.LA(1);
						 
						int index45_1519 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1519);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA45_1509 = input.LA(1);
						 
						int index45_1509 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1509);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA45_1490 = input.LA(1);
						 
						int index45_1490 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1490);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA45_1478 = input.LA(1);
						 
						int index45_1478 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1478);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA45_1476 = input.LA(1);
						 
						int index45_1476 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1476);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA45_1462 = input.LA(1);
						 
						int index45_1462 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1462);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA45_1457 = input.LA(1);
						 
						int index45_1457 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1457);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA45_1455 = input.LA(1);
						 
						int index45_1455 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1455);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA45_1441 = input.LA(1);
						 
						int index45_1441 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1441);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA45_1414 = input.LA(1);
						 
						int index45_1414 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1414);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA45_1385 = input.LA(1);
						 
						int index45_1385 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1385);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA45_1376 = input.LA(1);
						 
						int index45_1376 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1376);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA45_1372 = input.LA(1);
						 
						int index45_1372 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1372);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA45_1371 = input.LA(1);
						 
						int index45_1371 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1371);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA45_1370 = input.LA(1);
						 
						int index45_1370 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1370);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA45_1343 = input.LA(1);
						 
						int index45_1343 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1343);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA45_1342 = input.LA(1);
						 
						int index45_1342 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1342);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA45_1341 = input.LA(1);
						 
						int index45_1341 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1341);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA45_1336 = input.LA(1);
						 
						int index45_1336 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1336);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA45_1332 = input.LA(1);
						 
						int index45_1332 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1332);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA45_1287 = input.LA(1);
						 
						int index45_1287 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1287);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA45_1284 = input.LA(1);
						 
						int index45_1284 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1284);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA45_1281 = input.LA(1);
						 
						int index45_1281 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1281);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA45_1280 = input.LA(1);
						 
						int index45_1280 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1280);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA45_1278 = input.LA(1);
						 
						int index45_1278 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1278);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA45_1273 = input.LA(1);
						 
						int index45_1273 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1273);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA45_1253 = input.LA(1);
						 
						int index45_1253 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1253);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA45_1245 = input.LA(1);
						 
						int index45_1245 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1245);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA45_1210 = input.LA(1);
						 
						int index45_1210 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1210);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA45_1208 = input.LA(1);
						 
						int index45_1208 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1208);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA45_1207 = input.LA(1);
						 
						int index45_1207 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1207);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA45_1204 = input.LA(1);
						 
						int index45_1204 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1204);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA45_1194 = input.LA(1);
						 
						int index45_1194 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1194);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA45_1171 = input.LA(1);
						 
						int index45_1171 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1171);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA45_1154 = input.LA(1);
						 
						int index45_1154 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1154);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA45_1149 = input.LA(1);
						 
						int index45_1149 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1149);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA45_1111 = input.LA(1);
						 
						int index45_1111 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1111);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA45_1107 = input.LA(1);
						 
						int index45_1107 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1107);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA45_1098 = input.LA(1);
						 
						int index45_1098 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1098);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA45_1085 = input.LA(1);
						 
						int index45_1085 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1085);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA45_1077 = input.LA(1);
						 
						int index45_1077 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1077);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA45_1063 = input.LA(1);
						 
						int index45_1063 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1063);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA45_1062 = input.LA(1);
						 
						int index45_1062 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1062);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA45_1047 = input.LA(1);
						 
						int index45_1047 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1047);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA45_1022 = input.LA(1);
						 
						int index45_1022 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_1022);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA45_983 = input.LA(1);
						 
						int index45_983 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_983);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA45_971 = input.LA(1);
						 
						int index45_971 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_971);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA45_951 = input.LA(1);
						 
						int index45_951 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_951);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA45_939 = input.LA(1);
						 
						int index45_939 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_939);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA45_937 = input.LA(1);
						 
						int index45_937 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_937);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA45_928 = input.LA(1);
						 
						int index45_928 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_928);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA45_857 = input.LA(1);
						 
						int index45_857 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_857);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA45_824 = input.LA(1);
						 
						int index45_824 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_824);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA45_462 = input.LA(1);
						 
						int index45_462 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_462);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA45_647 = input.LA(1);
						 
						int index45_647 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_647);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA45_664 = input.LA(1);
						 
						int index45_664 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_664);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA45_743 = input.LA(1);
						 
						int index45_743 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_743);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA45_763 = input.LA(1);
						 
						int index45_763 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_763);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA45_765 = input.LA(1);
						 
						int index45_765 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index45_765);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA45_1189 = input.LA(1);
						 
						int index45_1189 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1189==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1189);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA45_168 = input.LA(1);
						 
						int index45_168 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_168==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_168);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA45_175 = input.LA(1);
						 
						int index45_175 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_175==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_175);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA45_222 = input.LA(1);
						 
						int index45_222 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_222==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_222);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA45_1110 = input.LA(1);
						 
						int index45_1110 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1110==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1110);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA45_929 = input.LA(1);
						 
						int index45_929 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_929==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_929);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA45_1200 = input.LA(1);
						 
						int index45_1200 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1200=='s') ) {s = 463;}
						else if ( ((LA45_1200 >= '\t' && LA45_1200 <= '\n')||LA45_1200=='\r'||LA45_1200==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1200=='(') ) {s = 464;}
						else if ( (LA45_1200=='!'||(LA45_1200 >= '&' && LA45_1200 <= '\'')||(LA45_1200 >= ',' && LA45_1200 <= '.')||(LA45_1200 >= '0' && LA45_1200 <= ';')||LA45_1200=='?'||(LA45_1200 >= 'A' && LA45_1200 <= 'Z')||LA45_1200=='_'||(LA45_1200 >= 'a' && LA45_1200 <= 'r')||(LA45_1200 >= 't' && LA45_1200 <= 'z')||LA45_1200=='\u2019') ) {s = 40;}
						else s = 1281;
						 
						input.seek(index45_1200);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA45_749 = input.LA(1);
						 
						int index45_749 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_749==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_749);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA45_819 = input.LA(1);
						 
						int index45_819 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_819==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_819);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA45_1199 = input.LA(1);
						 
						int index45_1199 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1199=='s') ) {s = 463;}
						else if ( ((LA45_1199 >= '\t' && LA45_1199 <= '\n')||LA45_1199=='\r'||LA45_1199==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1199=='(') ) {s = 464;}
						else if ( (LA45_1199=='!'||(LA45_1199 >= '&' && LA45_1199 <= '\'')||(LA45_1199 >= ',' && LA45_1199 <= '.')||(LA45_1199 >= '0' && LA45_1199 <= ';')||LA45_1199=='?'||(LA45_1199 >= 'A' && LA45_1199 <= 'Z')||LA45_1199=='_'||(LA45_1199 >= 'a' && LA45_1199 <= 'r')||(LA45_1199 >= 't' && LA45_1199 <= 'z')||LA45_1199=='\u2019') ) {s = 40;}
						else s = 1280;
						 
						input.seek(index45_1199);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA45_923 = input.LA(1);
						 
						int index45_923 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_923==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_923);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA45_980 = input.LA(1);
						 
						int index45_980 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_980==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_980);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA45_639 = input.LA(1);
						 
						int index45_639 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_639==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_639=='s') ) {s = 822;}
						else s = 40;
						 
						input.seek(index45_639);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA45_822 = input.LA(1);
						 
						int index45_822 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_822==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_822);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA45_826 = input.LA(1);
						 
						int index45_826 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_826==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_826);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA45_1102 = input.LA(1);
						 
						int index45_1102 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1102=='e') ) {s = 1206;}
						else if ( (LA45_1102=='s') ) {s = 463;}
						else if ( ((LA45_1102 >= '\t' && LA45_1102 <= '\n')||LA45_1102=='\r'||LA45_1102==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1102=='(') ) {s = 464;}
						else if ( (LA45_1102=='!'||(LA45_1102 >= '&' && LA45_1102 <= '\'')||(LA45_1102 >= ',' && LA45_1102 <= '.')||(LA45_1102 >= '0' && LA45_1102 <= ';')||LA45_1102=='?'||(LA45_1102 >= 'A' && LA45_1102 <= 'Z')||LA45_1102=='_'||(LA45_1102 >= 'a' && LA45_1102 <= 'd')||(LA45_1102 >= 'f' && LA45_1102 <= 'r')||(LA45_1102 >= 't' && LA45_1102 <= 'z')||LA45_1102=='\u2019') ) {s = 40;}
						else s = 1207;
						 
						input.seek(index45_1102);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA45_597 = input.LA(1);
						 
						int index45_597 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_597==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_597=='s') ) {s = 786;}
						else s = 40;
						 
						input.seek(index45_597);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA45_1144 = input.LA(1);
						 
						int index45_1144 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1144==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1144);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA45_33 = input.LA(1);
						 
						int index45_33 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_33=='S') ) {s = 168;}
						else if ( (LA45_33==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_33);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA45_1040 = input.LA(1);
						 
						int index45_1040 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1040==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1040);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA45_1250 = input.LA(1);
						 
						int index45_1250 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1250==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1250);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA45_741 = input.LA(1);
						 
						int index45_741 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_741==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_741);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA45_1016 = input.LA(1);
						 
						int index45_1016 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1016==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1016);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA45_1073 = input.LA(1);
						 
						int index45_1073 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1073==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1073);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA45_684 = input.LA(1);
						 
						int index45_684 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_684==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_684);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA45_1081 = input.LA(1);
						 
						int index45_1081 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1081==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1081);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA45_487 = input.LA(1);
						 
						int index45_487 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_487==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_487);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA45_488 = input.LA(1);
						 
						int index45_488 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_488==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_488);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA45_1275 = input.LA(1);
						 
						int index45_1275 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1275=='s') ) {s = 463;}
						else if ( ((LA45_1275 >= '\t' && LA45_1275 <= '\n')||LA45_1275=='\r'||LA45_1275==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1275=='(') ) {s = 464;}
						else if ( (LA45_1275=='!'||(LA45_1275 >= '&' && LA45_1275 <= '\'')||(LA45_1275 >= ',' && LA45_1275 <= '.')||(LA45_1275 >= '0' && LA45_1275 <= ';')||LA45_1275=='?'||(LA45_1275 >= 'A' && LA45_1275 <= 'Z')||LA45_1275=='_'||(LA45_1275 >= 'a' && LA45_1275 <= 'r')||(LA45_1275 >= 't' && LA45_1275 <= 'z')||LA45_1275=='\u2019') ) {s = 40;}
						else s = 1336;
						 
						input.seek(index45_1275);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA45_682 = input.LA(1);
						 
						int index45_682 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_682==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_682);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA45_484 = input.LA(1);
						 
						int index45_484 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_484==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_484);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA45_760 = input.LA(1);
						 
						int index45_760 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_760=='s') ) {s = 463;}
						else if ( ((LA45_760 >= '\t' && LA45_760 <= '\n')||LA45_760=='\r'||LA45_760==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_760=='(') ) {s = 464;}
						else if ( (LA45_760=='!'||(LA45_760 >= '&' && LA45_760 <= '\'')||(LA45_760 >= ',' && LA45_760 <= '.')||(LA45_760 >= '0' && LA45_760 <= ';')||LA45_760=='?'||(LA45_760 >= 'A' && LA45_760 <= 'Z')||LA45_760=='_'||(LA45_760 >= 'a' && LA45_760 <= 'r')||(LA45_760 >= 't' && LA45_760 <= 'z')||LA45_760=='\u2019') ) {s = 40;}
						else s = 937;
						 
						input.seek(index45_760);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA45_1157 = input.LA(1);
						 
						int index45_1157 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1157=='s') ) {s = 463;}
						else if ( ((LA45_1157 >= '\t' && LA45_1157 <= '\n')||LA45_1157=='\r'||LA45_1157==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1157=='(') ) {s = 464;}
						else if ( (LA45_1157=='!'||(LA45_1157 >= '&' && LA45_1157 <= '\'')||(LA45_1157 >= ',' && LA45_1157 <= '.')||(LA45_1157 >= '0' && LA45_1157 <= ';')||LA45_1157=='?'||(LA45_1157 >= 'A' && LA45_1157 <= 'Z')||LA45_1157=='_'||(LA45_1157 >= 'a' && LA45_1157 <= 'r')||(LA45_1157 >= 't' && LA45_1157 <= 'z')||LA45_1157=='\u2019') ) {s = 40;}
						else s = 1253;
						 
						input.seek(index45_1157);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA45_1184 = input.LA(1);
						 
						int index45_1184 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1184==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1184);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA45_959 = input.LA(1);
						 
						int index45_959 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_959==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_959);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA45_865 = input.LA(1);
						 
						int index45_865 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_865=='s') ) {s = 463;}
						else if ( ((LA45_865 >= '\t' && LA45_865 <= '\n')||LA45_865=='\r'||LA45_865==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_865=='(') ) {s = 464;}
						else if ( (LA45_865=='!'||(LA45_865 >= '&' && LA45_865 <= '\'')||(LA45_865 >= ',' && LA45_865 <= '.')||(LA45_865 >= '0' && LA45_865 <= ';')||LA45_865=='?'||(LA45_865 >= 'A' && LA45_865 <= 'Z')||LA45_865=='_'||(LA45_865 >= 'a' && LA45_865 <= 'r')||(LA45_865 >= 't' && LA45_865 <= 'z')||LA45_865=='\u2019') ) {s = 40;}
						else s = 1022;
						 
						input.seek(index45_865);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA45_1023 = input.LA(1);
						 
						int index45_1023 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1023=='s') ) {s = 463;}
						else if ( ((LA45_1023 >= '\t' && LA45_1023 <= '\n')||LA45_1023=='\r'||LA45_1023==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1023=='(') ) {s = 464;}
						else if ( (LA45_1023=='!'||(LA45_1023 >= '&' && LA45_1023 <= '\'')||(LA45_1023 >= ',' && LA45_1023 <= '.')||(LA45_1023 >= '0' && LA45_1023 <= ';')||LA45_1023=='?'||(LA45_1023 >= 'A' && LA45_1023 <= 'Z')||LA45_1023=='_'||(LA45_1023 >= 'a' && LA45_1023 <= 'r')||(LA45_1023 >= 't' && LA45_1023 <= 'z')||LA45_1023=='\u2019') ) {s = 40;}
						else s = 1149;
						 
						input.seek(index45_1023);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA45_764 = input.LA(1);
						 
						int index45_764 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_764==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_764);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA45_1140 = input.LA(1);
						 
						int index45_1140 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA45_1140 >= '\t' && LA45_1140 <= '\n')||LA45_1140=='\r'||LA45_1140==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1140=='A') ) {s = 1241;}
						else if ( (LA45_1140=='P') ) {s = 1242;}
						else if ( (LA45_1140=='B') ) {s = 1243;}
						else if ( (LA45_1140=='(') ) {s = 1244;}
						else if ( ((LA45_1140 >= '&' && LA45_1140 <= '\'')||(LA45_1140 >= ',' && LA45_1140 <= '.')||(LA45_1140 >= '0' && LA45_1140 <= ';')||(LA45_1140 >= 'C' && LA45_1140 <= 'O')||(LA45_1140 >= 'Q' && LA45_1140 <= 'Z')||LA45_1140=='_'||(LA45_1140 >= 'a' && LA45_1140 <= 'z')||LA45_1140=='\u2019') ) {s = 40;}
						else s = 1245;
						 
						input.seek(index45_1140);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA45_1322 = input.LA(1);
						 
						int index45_1322 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1322=='s') ) {s = 463;}
						else if ( ((LA45_1322 >= '\t' && LA45_1322 <= '\n')||LA45_1322=='\r'||LA45_1322==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1322=='(') ) {s = 464;}
						else if ( (LA45_1322=='!'||(LA45_1322 >= '&' && LA45_1322 <= '\'')||(LA45_1322 >= ',' && LA45_1322 <= '.')||(LA45_1322 >= '0' && LA45_1322 <= ';')||LA45_1322=='?'||(LA45_1322 >= 'A' && LA45_1322 <= 'Z')||LA45_1322=='_'||(LA45_1322 >= 'a' && LA45_1322 <= 'r')||(LA45_1322 >= 't' && LA45_1322 <= 'z')||LA45_1322=='\u2019') ) {s = 40;}
						else s = 1372;
						 
						input.seek(index45_1322);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA45_1084 = input.LA(1);
						 
						int index45_1084 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1084==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1084);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA45_1153 = input.LA(1);
						 
						int index45_1153 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1153==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1153);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA45_572 = input.LA(1);
						 
						int index45_572 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_572=='s') ) {s = 463;}
						else if ( ((LA45_572 >= '\t' && LA45_572 <= '\n')||LA45_572=='\r'||LA45_572==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_572=='(') ) {s = 464;}
						else if ( (LA45_572=='!'||(LA45_572 >= '&' && LA45_572 <= '\'')||(LA45_572 >= ',' && LA45_572 <= '.')||(LA45_572 >= '0' && LA45_572 <= ';')||LA45_572=='?'||(LA45_572 >= 'A' && LA45_572 <= 'Z')||LA45_572=='_'||(LA45_572 >= 'a' && LA45_572 <= 'r')||(LA45_572 >= 't' && LA45_572 <= 'z')||LA45_572=='\u2019') ) {s = 40;}
						else s = 763;
						 
						input.seek(index45_572);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA45_956 = input.LA(1);
						 
						int index45_956 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_956==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_956);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA45_1155 = input.LA(1);
						 
						int index45_1155 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1155==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1155);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA45_1020 = input.LA(1);
						 
						int index45_1020 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1020==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1020);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA45_1083 = input.LA(1);
						 
						int index45_1083 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1083=='s') ) {s = 463;}
						else if ( ((LA45_1083 >= '\t' && LA45_1083 <= '\n')||LA45_1083=='\r'||LA45_1083==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1083=='(') ) {s = 464;}
						else if ( (LA45_1083=='!'||(LA45_1083 >= '&' && LA45_1083 <= '\'')||(LA45_1083 >= ',' && LA45_1083 <= '.')||(LA45_1083 >= '0' && LA45_1083 <= ';')||LA45_1083=='?'||(LA45_1083 >= 'A' && LA45_1083 <= 'Z')||LA45_1083=='_'||(LA45_1083 >= 'a' && LA45_1083 <= 'r')||(LA45_1083 >= 't' && LA45_1083 <= 'z')||LA45_1083=='\u2019') ) {s = 40;}
						else s = 1194;
						 
						input.seek(index45_1083);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA45_766 = input.LA(1);
						 
						int index45_766 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_766=='s') ) {s = 463;}
						else if ( ((LA45_766 >= '\t' && LA45_766 <= '\n')||LA45_766=='\r'||LA45_766==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_766=='(') ) {s = 464;}
						else if ( (LA45_766=='!'||(LA45_766 >= '&' && LA45_766 <= '\'')||(LA45_766 >= ',' && LA45_766 <= '.')||(LA45_766 >= '0' && LA45_766 <= ';')||LA45_766=='?'||(LA45_766 >= 'A' && LA45_766 <= 'Z')||LA45_766=='_'||(LA45_766 >= 'a' && LA45_766 <= 'r')||(LA45_766 >= 't' && LA45_766 <= 'z')||LA45_766=='\u2019') ) {s = 40;}
						else s = 939;
						 
						input.seek(index45_766);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA45_1028 = input.LA(1);
						 
						int index45_1028 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1028=='s') ) {s = 463;}
						else if ( ((LA45_1028 >= '\t' && LA45_1028 <= '\n')||LA45_1028=='\r'||LA45_1028==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1028=='(') ) {s = 464;}
						else if ( (LA45_1028=='!'||(LA45_1028 >= '&' && LA45_1028 <= '\'')||(LA45_1028 >= ',' && LA45_1028 <= '.')||(LA45_1028 >= '0' && LA45_1028 <= ';')||LA45_1028=='?'||(LA45_1028 >= 'A' && LA45_1028 <= 'Z')||LA45_1028=='_'||(LA45_1028 >= 'a' && LA45_1028 <= 'r')||(LA45_1028 >= 't' && LA45_1028 <= 'z')||LA45_1028=='\u2019') ) {s = 40;}
						else s = 1154;
						 
						input.seek(index45_1028);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA45_574 = input.LA(1);
						 
						int index45_574 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_574=='s') ) {s = 463;}
						else if ( ((LA45_574 >= '\t' && LA45_574 <= '\n')||LA45_574=='\r'||LA45_574==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_574=='(') ) {s = 464;}
						else if ( (LA45_574=='!'||(LA45_574 >= '&' && LA45_574 <= '\'')||(LA45_574 >= ',' && LA45_574 <= '.')||(LA45_574 >= '0' && LA45_574 <= ';')||LA45_574=='?'||(LA45_574 >= 'A' && LA45_574 <= 'Z')||LA45_574=='_'||(LA45_574 >= 'a' && LA45_574 <= 'r')||(LA45_574 >= 't' && LA45_574 <= 'z')||LA45_574=='\u2019') ) {s = 40;}
						else s = 765;
						 
						input.seek(index45_574);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA45_673 = input.LA(1);
						 
						int index45_673 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_673==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_673);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA45_761 = input.LA(1);
						 
						int index45_761 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_761==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_761);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA45_942 = input.LA(1);
						 
						int index45_942 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_942=='s') ) {s = 463;}
						else if ( ((LA45_942 >= '\t' && LA45_942 <= '\n')||LA45_942=='\r'||LA45_942==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_942=='(') ) {s = 464;}
						else if ( (LA45_942=='!'||(LA45_942 >= '&' && LA45_942 <= '\'')||(LA45_942 >= ',' && LA45_942 <= '.')||(LA45_942 >= '0' && LA45_942 <= ';')||LA45_942=='?'||(LA45_942 >= 'A' && LA45_942 <= 'Z')||LA45_942=='_'||(LA45_942 >= 'a' && LA45_942 <= 'r')||(LA45_942 >= 't' && LA45_942 <= 'z')||LA45_942=='\u2019') ) {s = 40;}
						else s = 1085;
						 
						input.seek(index45_942);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA45_0 = input.LA(1);
						s = -1;
						if ( (LA45_0=='M') ) {s = 1;}
						else if ( (LA45_0=='O') ) {s = 2;}
						else if ( (LA45_0=='N') ) {s = 3;}
						else if ( (LA45_0=='A') ) {s = 4;}
						else if ( (LA45_0=='B') ) {s = 5;}
						else if ( (LA45_0=='C') ) {s = 6;}
						else if ( (LA45_0=='D') ) {s = 7;}
						else if ( (LA45_0=='E') ) {s = 8;}
						else if ( (LA45_0=='F') ) {s = 9;}
						else if ( (LA45_0=='G') ) {s = 10;}
						else if ( (LA45_0=='H') ) {s = 11;}
						else if ( (LA45_0=='I') ) {s = 12;}
						else if ( (LA45_0=='J') ) {s = 13;}
						else if ( (LA45_0=='K') ) {s = 14;}
						else if ( (LA45_0=='L') ) {s = 15;}
						else if ( (LA45_0=='P') ) {s = 16;}
						else if ( (LA45_0=='R') ) {s = 17;}
						else if ( (LA45_0=='S') ) {s = 18;}
						else if ( (LA45_0=='T') ) {s = 19;}
						else if ( (LA45_0=='V') ) {s = 20;}
						else if ( (LA45_0=='W') ) {s = 21;}
						else if ( (LA45_0=='X') ) {s = 22;}
						else if ( (LA45_0=='Y') ) {s = 23;}
						else if ( (LA45_0=='(') ) {s = 24;}
						else if ( ((LA45_0 >= '0' && LA45_0 <= '9')) ) {s = 25;}
						else if ( ((LA45_0 >= '\t' && LA45_0 <= '\n')||LA45_0=='\r'||LA45_0==' ') ) {s = 26;}
						else if ( (LA45_0=='.') ) {s = 27;}
						else if ( (LA45_0=='Q'||LA45_0=='U'||LA45_0=='Z') ) {s = 28;}
						else if ( ((LA45_0 >= '&' && LA45_0 <= '\'')||(LA45_0 >= ',' && LA45_0 <= '-')||(LA45_0 >= ':' && LA45_0 <= ';')||LA45_0=='_'||(LA45_0 >= 'a' && LA45_0 <= 'z')||LA45_0=='\u2019') ) {s = 29;}
						else if ( ((LA45_0 >= '\u0000' && LA45_0 <= '\b')||(LA45_0 >= '\u000B' && LA45_0 <= '\f')||(LA45_0 >= '\u000E' && LA45_0 <= '\u001F')||(LA45_0 >= '!' && LA45_0 <= '%')||(LA45_0 >= ')' && LA45_0 <= '+')||LA45_0=='/'||(LA45_0 >= '<' && LA45_0 <= '@')||(LA45_0 >= '[' && LA45_0 <= '^')||LA45_0=='`'||(LA45_0 >= '{' && LA45_0 <= '\u2018')||(LA45_0 >= '\u201A' && LA45_0 <= '\uFFFF')) ) {s = 30;}
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA45_1082 = input.LA(1);
						 
						int index45_1082 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1082==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1082);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA45_391 = input.LA(1);
						 
						int index45_391 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_391==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_391=='d') ) {s = 578;}
						else if ( (LA45_391=='m') ) {s = 579;}
						else s = 40;
						 
						input.seek(index45_391);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA45_1087 = input.LA(1);
						 
						int index45_1087 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1087==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1087);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA45_15 = input.LA(1);
						 
						int index45_15 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_15=='a') ) {s = 97;}
						else if ( (LA45_15=='e') ) {s = 98;}
						else if ( (LA45_15=='h') ) {s = 99;}
						else if ( (LA45_15=='\u00F6') && ((allowBreed))) {s = 100;}
						else if ( (LA45_15=='o') ) {s = 101;}
						else if ( (LA45_15=='U') ) {s = 102;}
						else s = 40;
						 
						input.seek(index45_15);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA45_1337 = input.LA(1);
						 
						int index45_1337 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1337=='s') ) {s = 463;}
						else if ( ((LA45_1337 >= '\t' && LA45_1337 <= '\n')||LA45_1337=='\r'||LA45_1337==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1337=='(') ) {s = 464;}
						else if ( (LA45_1337=='!'||(LA45_1337 >= '&' && LA45_1337 <= '\'')||(LA45_1337 >= ',' && LA45_1337 <= '.')||(LA45_1337 >= '0' && LA45_1337 <= ';')||LA45_1337=='?'||(LA45_1337 >= 'A' && LA45_1337 <= 'Z')||LA45_1337=='_'||(LA45_1337 >= 'a' && LA45_1337 <= 'r')||(LA45_1337 >= 't' && LA45_1337 <= 'z')||LA45_1337=='\u2019') ) {s = 40;}
						else s = 1385;
						 
						input.seek(index45_1337);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA45_1088 = input.LA(1);
						 
						int index45_1088 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1088==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1088);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA45_584 = input.LA(1);
						 
						int index45_584 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_584==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_584);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA45_1326 = input.LA(1);
						 
						int index45_1326 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1326=='s') ) {s = 463;}
						else if ( ((LA45_1326 >= '\t' && LA45_1326 <= '\n')||LA45_1326=='\r'||LA45_1326==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1326=='(') ) {s = 464;}
						else if ( (LA45_1326=='!'||(LA45_1326 >= '&' && LA45_1326 <= '\'')||(LA45_1326 >= ',' && LA45_1326 <= '.')||(LA45_1326 >= '0' && LA45_1326 <= ';')||LA45_1326=='?'||(LA45_1326 >= 'A' && LA45_1326 <= 'Z')||LA45_1326=='_'||(LA45_1326 >= 'a' && LA45_1326 <= 'r')||(LA45_1326 >= 't' && LA45_1326 <= 'z')||LA45_1326=='\u2019') ) {s = 40;}
						else s = 1376;
						 
						input.seek(index45_1326);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA45_502 = input.LA(1);
						 
						int index45_502 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_502=='F') && ((allowBreed))) {s = 100;}
						else if ( (LA45_502=='V') ) {s = 698;}
						 
						input.seek(index45_502);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA45_893 = input.LA(1);
						 
						int index45_893 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_893=='s') ) {s = 463;}
						else if ( ((LA45_893 >= '\t' && LA45_893 <= '\n')||LA45_893=='\r'||LA45_893==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_893=='(') ) {s = 464;}
						else if ( (LA45_893=='!'||(LA45_893 >= '&' && LA45_893 <= '\'')||(LA45_893 >= ',' && LA45_893 <= '.')||(LA45_893 >= '0' && LA45_893 <= ';')||LA45_893=='?'||(LA45_893 >= 'A' && LA45_893 <= 'Z')||LA45_893=='_'||(LA45_893 >= 'a' && LA45_893 <= 'r')||(LA45_893 >= 't' && LA45_893 <= 'z')||LA45_893=='\u2019') ) {s = 40;}
						else s = 1047;
						 
						input.seek(index45_893);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA45_516 = input.LA(1);
						 
						int index45_516 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_516==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_516);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA45_1053 = input.LA(1);
						 
						int index45_1053 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1053=='s') ) {s = 463;}
						else if ( ((LA45_1053 >= '\t' && LA45_1053 <= '\n')||LA45_1053=='\r'||LA45_1053==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1053=='(') ) {s = 464;}
						else if ( (LA45_1053=='!'||(LA45_1053 >= '&' && LA45_1053 <= '\'')||(LA45_1053 >= ',' && LA45_1053 <= '.')||(LA45_1053 >= '0' && LA45_1053 <= ';')||LA45_1053=='?'||(LA45_1053 >= 'A' && LA45_1053 <= 'Z')||LA45_1053=='_'||(LA45_1053 >= 'a' && LA45_1053 <= 'r')||(LA45_1053 >= 't' && LA45_1053 <= 'z')||LA45_1053=='\u2019') ) {s = 40;}
						else s = 1171;
						 
						input.seek(index45_1053);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA45_519 = input.LA(1);
						 
						int index45_519 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_519==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_519=='h') ) {s = 713;}
						else s = 40;
						 
						input.seek(index45_519);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA45_580 = input.LA(1);
						 
						int index45_580 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_580==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_580);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA45_34 = input.LA(1);
						 
						int index45_34 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_34=='s') ) {s = 170;}
						else if ( (LA45_34==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_34);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA45_1041 = input.LA(1);
						 
						int index45_1041 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1041==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1041);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA45_395 = input.LA(1);
						 
						int index45_395 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_395==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_395);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA45_771 = input.LA(1);
						 
						int index45_771 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_771==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_771);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA45_1035 = input.LA(1);
						 
						int index45_1035 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1035==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1035);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA45_949 = input.LA(1);
						 
						int index45_949 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_949==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_949);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA45_73 = input.LA(1);
						 
						int index45_73 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_73==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_73);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA45_402 = input.LA(1);
						 
						int index45_402 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_402==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_402);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA45_1197 = input.LA(1);
						 
						int index45_1197 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1197=='s') ) {s = 463;}
						else if ( ((LA45_1197 >= '\t' && LA45_1197 <= '\n')||LA45_1197=='\r'||LA45_1197==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1197=='(') ) {s = 464;}
						else if ( (LA45_1197=='!'||(LA45_1197 >= '&' && LA45_1197 <= '\'')||(LA45_1197 >= ',' && LA45_1197 <= '.')||(LA45_1197 >= '0' && LA45_1197 <= ';')||LA45_1197=='?'||(LA45_1197 >= 'A' && LA45_1197 <= 'Z')||LA45_1197=='_'||(LA45_1197 >= 'a' && LA45_1197 <= 'r')||(LA45_1197 >= 't' && LA45_1197 <= 'z')||LA45_1197=='\u2019') ) {s = 40;}
						else s = 1278;
						 
						input.seek(index45_1197);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA45_348 = input.LA(1);
						 
						int index45_348 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_348==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_348);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA45_878 = input.LA(1);
						 
						int index45_878 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_878==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_878);
						if ( s>=0 ) return s;
						break;

					case 180 : 
						int LA45_950 = input.LA(1);
						 
						int index45_950 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_950==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_950);
						if ( s>=0 ) return s;
						break;

					case 181 : 
						int LA45_36 = input.LA(1);
						 
						int index45_36 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_36==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_36);
						if ( s>=0 ) return s;
						break;

					case 182 : 
						int LA45_170 = input.LA(1);
						 
						int index45_170 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_170==' ') && ((allowJudge))) {s = 169;}
						else s = 40;
						 
						input.seek(index45_170);
						if ( s>=0 ) return s;
						break;

					case 183 : 
						int LA45_779 = input.LA(1);
						 
						int index45_779 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_779==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_779);
						if ( s>=0 ) return s;
						break;

					case 184 : 
						int LA45_1436 = input.LA(1);
						 
						int index45_1436 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1436==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1436);
						if ( s>=0 ) return s;
						break;

					case 185 : 
						int LA45_1277 = input.LA(1);
						 
						int index45_1277 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1277==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1277);
						if ( s>=0 ) return s;
						break;

					case 186 : 
						int LA45_1182 = input.LA(1);
						 
						int index45_1182 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1182==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1182);
						if ( s>=0 ) return s;
						break;

					case 187 : 
						int LA45_1032 = input.LA(1);
						 
						int index45_1032 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1032==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1032);
						if ( s>=0 ) return s;
						break;

					case 188 : 
						int LA45_1159 = input.LA(1);
						 
						int index45_1159 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1159==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1159);
						if ( s>=0 ) return s;
						break;

					case 189 : 
						int LA45_710 = input.LA(1);
						 
						int index45_710 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_710==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_710);
						if ( s>=0 ) return s;
						break;

					case 190 : 
						int LA45_780 = input.LA(1);
						 
						int index45_780 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_780=='s') ) {s = 463;}
						else if ( ((LA45_780 >= '\t' && LA45_780 <= '\n')||LA45_780=='\r'||LA45_780==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_780=='(') ) {s = 464;}
						else if ( (LA45_780=='!'||(LA45_780 >= '&' && LA45_780 <= '\'')||(LA45_780 >= ',' && LA45_780 <= '.')||(LA45_780 >= '0' && LA45_780 <= ';')||LA45_780=='?'||(LA45_780 >= 'A' && LA45_780 <= 'Z')||LA45_780=='_'||(LA45_780 >= 'a' && LA45_780 <= 'r')||(LA45_780 >= 't' && LA45_780 <= 'z')||LA45_780=='\u2019') ) {s = 40;}
						else s = 951;
						 
						input.seek(index45_780);
						if ( s>=0 ) return s;
						break;

					case 191 : 
						int LA45_1108 = input.LA(1);
						 
						int index45_1108 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1108=='s') ) {s = 463;}
						else if ( ((LA45_1108 >= '\t' && LA45_1108 <= '\n')||LA45_1108=='\r'||LA45_1108==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1108=='(') ) {s = 464;}
						else if ( (LA45_1108=='!'||(LA45_1108 >= '&' && LA45_1108 <= '\'')||(LA45_1108 >= ',' && LA45_1108 <= '.')||(LA45_1108 >= '0' && LA45_1108 <= ';')||LA45_1108=='?'||(LA45_1108 >= 'A' && LA45_1108 <= 'Z')||LA45_1108=='_'||(LA45_1108 >= 'a' && LA45_1108 <= 'r')||(LA45_1108 >= 't' && LA45_1108 <= 'z')||LA45_1108=='\u2019') ) {s = 40;}
						else s = 1210;
						 
						input.seek(index45_1108);
						if ( s>=0 ) return s;
						break;

					case 192 : 
						int LA45_786 = input.LA(1);
						 
						int index45_786 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_786==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_786);
						if ( s>=0 ) return s;
						break;

					case 193 : 
						int LA45_756 = input.LA(1);
						 
						int index45_756 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_756==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_756=='s') ) {s = 934;}
						else s = 40;
						 
						input.seek(index45_756);
						if ( s>=0 ) return s;
						break;

					case 194 : 
						int LA45_1094 = input.LA(1);
						 
						int index45_1094 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1094==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1094);
						if ( s>=0 ) return s;
						break;

					case 195 : 
						int LA45_965 = input.LA(1);
						 
						int index45_965 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_965==' ') && ((allowGroup))) {s = 804;}
						else s = 40;
						 
						input.seek(index45_965);
						if ( s>=0 ) return s;
						break;

					case 196 : 
						int LA45_1267 = input.LA(1);
						 
						int index45_1267 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1267=='s') ) {s = 463;}
						else if ( ((LA45_1267 >= '\t' && LA45_1267 <= '\n')||LA45_1267=='\r'||LA45_1267==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1267=='(') ) {s = 464;}
						else if ( (LA45_1267=='!'||(LA45_1267 >= '&' && LA45_1267 <= '\'')||(LA45_1267 >= ',' && LA45_1267 <= '.')||(LA45_1267 >= '0' && LA45_1267 <= ';')||LA45_1267=='?'||(LA45_1267 >= 'A' && LA45_1267 <= 'Z')||LA45_1267=='_'||(LA45_1267 >= 'a' && LA45_1267 <= 'r')||(LA45_1267 >= 't' && LA45_1267 <= 'z')||LA45_1267=='\u2019') ) {s = 40;}
						else s = 1332;
						 
						input.seek(index45_1267);
						if ( s>=0 ) return s;
						break;

					case 197 : 
						int LA45_784 = input.LA(1);
						 
						int index45_784 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_784==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_784);
						if ( s>=0 ) return s;
						break;

					case 198 : 
						int LA45_1042 = input.LA(1);
						 
						int index45_1042 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1042==' ') && ((allowGroup))) {s = 1164;}
						else s = 40;
						 
						input.seek(index45_1042);
						if ( s>=0 ) return s;
						break;

					case 199 : 
						int LA45_1383 = input.LA(1);
						 
						int index45_1383 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1383==' ') && ((allowGroup))) {s = 1415;}
						else s = 40;
						 
						input.seek(index45_1383);
						if ( s>=0 ) return s;
						break;

					case 200 : 
						int LA45_551 = input.LA(1);
						 
						int index45_551 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_551=='s') ) {s = 463;}
						else if ( ((LA45_551 >= '\t' && LA45_551 <= '\n')||LA45_551=='\r'||LA45_551==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_551=='(') ) {s = 464;}
						else if ( (LA45_551=='!'||(LA45_551 >= '&' && LA45_551 <= '\'')||(LA45_551 >= ',' && LA45_551 <= '.')||(LA45_551 >= '0' && LA45_551 <= ';')||LA45_551=='?'||(LA45_551 >= 'A' && LA45_551 <= 'Z')||LA45_551=='_'||(LA45_551 >= 'a' && LA45_551 <= 'r')||(LA45_551 >= 't' && LA45_551 <= 'z')||LA45_551=='\u2019') ) {s = 40;}
						else s = 743;
						 
						input.seek(index45_551);
						if ( s>=0 ) return s;
						break;

					case 201 : 
						int LA45_1161 = input.LA(1);
						 
						int index45_1161 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1161==' ') && ((allowGroup))) {s = 1173;}
						else s = 40;
						 
						input.seek(index45_1161);
						if ( s>=0 ) return s;
						break;

					case 202 : 
						int LA45_1386 = input.LA(1);
						 
						int index45_1386 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1386==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1386);
						if ( s>=0 ) return s;
						break;

					case 203 : 
						int LA45_1211 = input.LA(1);
						 
						int index45_1211 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1211=='s') ) {s = 463;}
						else if ( ((LA45_1211 >= '\t' && LA45_1211 <= '\n')||LA45_1211=='\r'||LA45_1211==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1211=='(') ) {s = 464;}
						else if ( (LA45_1211=='!'||(LA45_1211 >= '&' && LA45_1211 <= '\'')||(LA45_1211 >= ',' && LA45_1211 <= '.')||(LA45_1211 >= '0' && LA45_1211 <= ';')||LA45_1211=='?'||(LA45_1211 >= 'A' && LA45_1211 <= 'Z')||LA45_1211=='_'||(LA45_1211 >= 'a' && LA45_1211 <= 'r')||(LA45_1211 >= 't' && LA45_1211 <= 'z')||LA45_1211=='\u2019') ) {s = 40;}
						else s = 1287;
						 
						input.seek(index45_1211);
						if ( s>=0 ) return s;
						break;

					case 204 : 
						int LA45_1416 = input.LA(1);
						 
						int index45_1416 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1416=='s') ) {s = 463;}
						else if ( ((LA45_1416 >= '\t' && LA45_1416 <= '\n')||LA45_1416=='\r'||LA45_1416==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1416=='(') ) {s = 464;}
						else if ( (LA45_1416=='!'||(LA45_1416 >= '&' && LA45_1416 <= '\'')||(LA45_1416 >= ',' && LA45_1416 <= '.')||(LA45_1416 >= '0' && LA45_1416 <= ';')||LA45_1416=='?'||(LA45_1416 >= 'A' && LA45_1416 <= 'Z')||LA45_1416=='_'||(LA45_1416 >= 'a' && LA45_1416 <= 'r')||(LA45_1416 >= 't' && LA45_1416 <= 'z')||LA45_1416=='\u2019') ) {s = 40;}
						else s = 1441;
						 
						input.seek(index45_1416);
						if ( s>=0 ) return s;
						break;

					case 205 : 
						int LA45_314 = input.LA(1);
						 
						int index45_314 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_314==' ') && ((allowGroup))) {s = 505;}
						else s = 40;
						 
						input.seek(index45_314);
						if ( s>=0 ) return s;
						break;

					case 206 : 
						int LA45_1339 = input.LA(1);
						 
						int index45_1339 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1339==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1339);
						if ( s>=0 ) return s;
						break;

					case 207 : 
						int LA45_618 = input.LA(1);
						 
						int index45_618 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_618==' ') && ((allowGroup))) {s = 804;}
						else s = 40;
						 
						input.seek(index45_618);
						if ( s>=0 ) return s;
						break;

					case 208 : 
						int LA45_1055 = input.LA(1);
						 
						int index45_1055 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1055==' ') && ((allowGroup))) {s = 1173;}
						else s = 40;
						 
						input.seek(index45_1055);
						if ( s>=0 ) return s;
						break;

					case 209 : 
						int LA45_796 = input.LA(1);
						 
						int index45_796 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_796==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_796);
						if ( s>=0 ) return s;
						break;

					case 210 : 
						int LA45_392 = input.LA(1);
						 
						int index45_392 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_392==' ') && ((allowGroup))) {s = 505;}
						else s = 40;
						 
						input.seek(index45_392);
						if ( s>=0 ) return s;
						break;

					case 211 : 
						int LA45_465 = input.LA(1);
						 
						int index45_465 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_465=='k') ) {s = 663;}
						else if ( (LA45_465=='s') ) {s = 463;}
						else if ( ((LA45_465 >= '\t' && LA45_465 <= '\n')||LA45_465=='\r'||LA45_465==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_465=='(') ) {s = 464;}
						else if ( (LA45_465=='!'||(LA45_465 >= '&' && LA45_465 <= '\'')||(LA45_465 >= ',' && LA45_465 <= '.')||(LA45_465 >= '0' && LA45_465 <= ';')||LA45_465=='?'||(LA45_465 >= 'A' && LA45_465 <= 'Z')||LA45_465=='_'||(LA45_465 >= 'a' && LA45_465 <= 'j')||(LA45_465 >= 'l' && LA45_465 <= 'r')||(LA45_465 >= 't' && LA45_465 <= 'z')||LA45_465=='\u2019') ) {s = 40;}
						else s = 664;
						 
						input.seek(index45_465);
						if ( s>=0 ) return s;
						break;

					case 212 : 
						int LA45_1262 = input.LA(1);
						 
						int index45_1262 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1262==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1262);
						if ( s>=0 ) return s;
						break;

					case 213 : 
						int LA45_1327 = input.LA(1);
						 
						int index45_1327 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1327==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1327);
						if ( s>=0 ) return s;
						break;

					case 214 : 
						int LA45_1272 = input.LA(1);
						 
						int index45_1272 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1272==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1272);
						if ( s>=0 ) return s;
						break;

					case 215 : 
						int LA45_663 = input.LA(1);
						 
						int index45_663 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_663=='s') ) {s = 463;}
						else if ( ((LA45_663 >= '\t' && LA45_663 <= '\n')||LA45_663=='\r'||LA45_663==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_663=='(') ) {s = 464;}
						else if ( (LA45_663=='!'||(LA45_663 >= '&' && LA45_663 <= '\'')||(LA45_663 >= ',' && LA45_663 <= '.')||(LA45_663 >= '0' && LA45_663 <= ';')||LA45_663=='?'||(LA45_663 >= 'A' && LA45_663 <= 'Z')||LA45_663=='_'||(LA45_663 >= 'a' && LA45_663 <= 'r')||(LA45_663 >= 't' && LA45_663 <= 'z')||LA45_663=='\u2019') ) {s = 40;}
						else s = 857;
						 
						input.seek(index45_663);
						if ( s>=0 ) return s;
						break;

					case 216 : 
						int LA45_233 = input.LA(1);
						 
						int index45_233 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_233==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_233);
						if ( s>=0 ) return s;
						break;

					case 217 : 
						int LA45_276 = input.LA(1);
						 
						int index45_276 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_276=='s') ) {s = 463;}
						else if ( ((LA45_276 >= '\t' && LA45_276 <= '\n')||LA45_276=='\r'||LA45_276==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_276=='(') ) {s = 464;}
						else if ( (LA45_276=='!'||(LA45_276 >= '&' && LA45_276 <= '\'')||(LA45_276 >= ',' && LA45_276 <= '.')||(LA45_276 >= '0' && LA45_276 <= ';')||LA45_276=='?'||(LA45_276 >= 'A' && LA45_276 <= 'Z')||LA45_276=='_'||(LA45_276 >= 'a' && LA45_276 <= 'r')||(LA45_276 >= 't' && LA45_276 <= 'z')||LA45_276=='\u2019') ) {s = 40;}
						else s = 462;
						 
						input.seek(index45_276);
						if ( s>=0 ) return s;
						break;

					case 218 : 
						int LA45_759 = input.LA(1);
						 
						int index45_759 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_759==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_759);
						if ( s>=0 ) return s;
						break;

					case 219 : 
						int LA45_793 = input.LA(1);
						 
						int index45_793 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_793==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_793);
						if ( s>=0 ) return s;
						break;

					case 220 : 
						int LA45_1321 = input.LA(1);
						 
						int index45_1321 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1321=='s') ) {s = 463;}
						else if ( ((LA45_1321 >= '\t' && LA45_1321 <= '\n')||LA45_1321=='\r'||LA45_1321==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1321=='(') ) {s = 464;}
						else if ( (LA45_1321=='!'||(LA45_1321 >= '&' && LA45_1321 <= '\'')||(LA45_1321 >= ',' && LA45_1321 <= '.')||(LA45_1321 >= '0' && LA45_1321 <= ';')||LA45_1321=='?'||(LA45_1321 >= 'A' && LA45_1321 <= 'Z')||LA45_1321=='_'||(LA45_1321 >= 'a' && LA45_1321 <= 'r')||(LA45_1321 >= 't' && LA45_1321 <= 'z')||LA45_1321=='\u2019') ) {s = 40;}
						else s = 1371;
						 
						input.seek(index45_1321);
						if ( s>=0 ) return s;
						break;

					case 221 : 
						int LA45_1340 = input.LA(1);
						 
						int index45_1340 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1340==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1340);
						if ( s>=0 ) return s;
						break;

					case 222 : 
						int LA45_1191 = input.LA(1);
						 
						int index45_1191 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1191=='s') ) {s = 463;}
						else if ( ((LA45_1191 >= '\t' && LA45_1191 <= '\n')||LA45_1191=='\r'||LA45_1191==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1191=='(') ) {s = 464;}
						else if ( (LA45_1191=='!'||(LA45_1191 >= '&' && LA45_1191 <= '\'')||(LA45_1191 >= ',' && LA45_1191 <= '.')||(LA45_1191 >= '0' && LA45_1191 <= ';')||LA45_1191=='?'||(LA45_1191 >= 'A' && LA45_1191 <= 'Z')||LA45_1191=='_'||(LA45_1191 >= 'a' && LA45_1191 <= 'r')||(LA45_1191 >= 't' && LA45_1191 <= 'z')||LA45_1191=='\u2019') ) {s = 40;}
						else s = 1273;
						 
						input.seek(index45_1191);
						if ( s>=0 ) return s;
						break;

					case 223 : 
						int LA45_602 = input.LA(1);
						 
						int index45_602 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_602==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_602);
						if ( s>=0 ) return s;
						break;

					case 224 : 
						int LA45_927 = input.LA(1);
						 
						int index45_927 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_927=='s') ) {s = 463;}
						else if ( ((LA45_927 >= '\t' && LA45_927 <= '\n')||LA45_927=='\r'||LA45_927==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_927=='(') ) {s = 464;}
						else if ( (LA45_927=='!'||(LA45_927 >= '&' && LA45_927 <= '\'')||(LA45_927 >= ',' && LA45_927 <= '.')||(LA45_927 >= '0' && LA45_927 <= ';')||LA45_927=='?'||(LA45_927 >= 'A' && LA45_927 <= 'Z')||LA45_927=='_'||(LA45_927 >= 'a' && LA45_927 <= 'r')||(LA45_927 >= 't' && LA45_927 <= 'z')||LA45_927=='\u2019') ) {s = 40;}
						else s = 1077;
						 
						input.seek(index45_927);
						if ( s>=0 ) return s;
						break;

					case 225 : 
						int LA45_1320 = input.LA(1);
						 
						int index45_1320 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1320=='s') ) {s = 463;}
						else if ( ((LA45_1320 >= '\t' && LA45_1320 <= '\n')||LA45_1320=='\r'||LA45_1320==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1320=='(') ) {s = 464;}
						else if ( (LA45_1320=='!'||(LA45_1320 >= '&' && LA45_1320 <= '\'')||(LA45_1320 >= ',' && LA45_1320 <= '.')||(LA45_1320 >= '0' && LA45_1320 <= ';')||LA45_1320=='?'||(LA45_1320 >= 'A' && LA45_1320 <= 'Z')||LA45_1320=='_'||(LA45_1320 >= 'a' && LA45_1320 <= 'r')||(LA45_1320 >= 't' && LA45_1320 <= 'z')||LA45_1320=='\u2019') ) {s = 40;}
						else s = 1370;
						 
						input.seek(index45_1320);
						if ( s>=0 ) return s;
						break;

					case 226 : 
						int LA45_750 = input.LA(1);
						 
						int index45_750 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_750=='s') ) {s = 463;}
						else if ( ((LA45_750 >= '\t' && LA45_750 <= '\n')||LA45_750=='\r'||LA45_750==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_750=='(') ) {s = 464;}
						else if ( (LA45_750=='!'||(LA45_750 >= '&' && LA45_750 <= '\'')||(LA45_750 >= ',' && LA45_750 <= '.')||(LA45_750 >= '0' && LA45_750 <= ';')||LA45_750=='?'||(LA45_750 >= 'A' && LA45_750 <= 'Z')||LA45_750=='_'||(LA45_750 >= 'a' && LA45_750 <= 'r')||(LA45_750 >= 't' && LA45_750 <= 'z')||LA45_750=='\u2019') ) {s = 40;}
						else s = 928;
						 
						input.seek(index45_750);
						if ( s>=0 ) return s;
						break;

					case 227 : 
						int LA45_797 = input.LA(1);
						 
						int index45_797 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_797==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_797);
						if ( s>=0 ) return s;
						break;

					case 228 : 
						int LA45_981 = input.LA(1);
						 
						int index45_981 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_981=='s') ) {s = 463;}
						else if ( ((LA45_981 >= '\t' && LA45_981 <= '\n')||LA45_981=='\r'||LA45_981==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_981=='(') ) {s = 464;}
						else if ( (LA45_981=='!'||(LA45_981 >= '&' && LA45_981 <= '\'')||(LA45_981 >= ',' && LA45_981 <= '.')||(LA45_981 >= '0' && LA45_981 <= ';')||LA45_981=='?'||(LA45_981 >= 'A' && LA45_981 <= 'Z')||LA45_981=='_'||(LA45_981 >= 'a' && LA45_981 <= 'r')||(LA45_981 >= 't' && LA45_981 <= 'z')||LA45_981=='\u2019') ) {s = 40;}
						else s = 1111;
						 
						input.seek(index45_981);
						if ( s>=0 ) return s;
						break;

					case 229 : 
						int LA45_798 = input.LA(1);
						 
						int index45_798 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_798==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_798);
						if ( s>=0 ) return s;
						break;

					case 230 : 
						int LA45_641 = input.LA(1);
						 
						int index45_641 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_641=='s') ) {s = 463;}
						else if ( ((LA45_641 >= '\t' && LA45_641 <= '\n')||LA45_641=='\r'||LA45_641==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_641=='(') ) {s = 464;}
						else if ( (LA45_641=='!'||(LA45_641 >= '&' && LA45_641 <= '\'')||(LA45_641 >= ',' && LA45_641 <= '.')||(LA45_641 >= '0' && LA45_641 <= ';')||LA45_641=='?'||(LA45_641 >= 'A' && LA45_641 <= 'Z')||LA45_641=='_'||(LA45_641 >= 'a' && LA45_641 <= 'r')||(LA45_641 >= 't' && LA45_641 <= 'z')||LA45_641=='\u2019') ) {s = 40;}
						else s = 824;
						 
						input.seek(index45_641);
						if ( s>=0 ) return s;
						break;

					case 231 : 
						int LA45_1074 = input.LA(1);
						 
						int index45_1074 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1074==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_1074);
						if ( s>=0 ) return s;
						break;

					case 232 : 
						int LA45_938 = input.LA(1);
						 
						int index45_938 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_938==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_938=='s') ) {s = 1082;}
						else s = 40;
						 
						input.seek(index45_938);
						if ( s>=0 ) return s;
						break;

					case 233 : 
						int LA45_424 = input.LA(1);
						 
						int index45_424 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_424==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_424);
						if ( s>=0 ) return s;
						break;

					case 234 : 
						int LA45_609 = input.LA(1);
						 
						int index45_609 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_609==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index45_609);
						if ( s>=0 ) return s;
						break;

					case 235 : 
						int LA45_1048 = input.LA(1);
						 
						int index45_1048 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1048==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1048=='s') ) {s = 1167;}
						else s = 40;
						 
						input.seek(index45_1048);
						if ( s>=0 ) return s;
						break;

					case 236 : 
						int LA45_1288 = input.LA(1);
						 
						int index45_1288 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_1288=='s') ) {s = 463;}
						else if ( ((LA45_1288 >= '\t' && LA45_1288 <= '\n')||LA45_1288=='\r'||LA45_1288==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_1288=='(') ) {s = 464;}
						else if ( (LA45_1288=='!'||(LA45_1288 >= '&' && LA45_1288 <= '\'')||(LA45_1288 >= ',' && LA45_1288 <= '.')||(LA45_1288 >= '0' && LA45_1288 <= ';')||LA45_1288=='?'||(LA45_1288 >= 'A' && LA45_1288 <= 'Z')||LA45_1288=='_'||(LA45_1288 >= 'a' && LA45_1288 <= 'r')||(LA45_1288 >= 't' && LA45_1288 <= 'z')||LA45_1288=='\u2019') ) {s = 40;}
						else s = 1343;
						 
						input.seek(index45_1288);
						if ( s>=0 ) return s;
						break;

					case 237 : 
						int LA45_828 = input.LA(1);
						 
						int index45_828 = input.index();
						input.rewind();
						s = -1;
						if ( (LA45_828=='s') ) {s = 463;}
						else if ( ((LA45_828 >= '\t' && LA45_828 <= '\n')||LA45_828=='\r'||LA45_828==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_828=='(') ) {s = 464;}
						else if ( (LA45_828=='!'||(LA45_828 >= '&' && LA45_828 <= '\'')||(LA45_828 >= ',' && LA45_828 <= '.')||(LA45_828 >= '0' && LA45_828 <= ';')||LA45_828=='?'||(LA45_828 >= 'A' && LA45_828 <= 'Z')||LA45_828=='_'||(LA45_828 >= 'a' && LA45_828 <= 'r')||(LA45_828 >= 't' && LA45_828 <= 'z')||LA45_828=='\u2019') ) {s = 40;}
						else s = 983;
						 
						input.seek(index45_828);
						if ( s>=0 ) return s;
						break;

					case 238 : 
						int LA45_463 = input.LA(1);
						 
						int index45_463 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA45_463 >= '\t' && LA45_463 <= '\n')||LA45_463=='\r'||LA45_463==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA45_463=='(') ) {s = 464;}
						else if ( (LA45_463=='!'||(LA45_463 >= '&' && LA45_463 <= '\'')||(LA45_463 >= ',' && LA45_463 <= '.')||(LA45_463 >= '0' && LA45_463 <= ';')||LA45_463=='?'||(LA45_463 >= 'A' && LA45_463 <= 'Z')||LA45_463=='_'||(LA45_463 >= 'a' && LA45_463 <= 'z')||LA45_463=='\u2019') ) {s = 40;}
						else s = 647;
						 
						input.seek(index45_463);
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 45, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
