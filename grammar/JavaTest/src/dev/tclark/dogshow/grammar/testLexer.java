// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-03-08 01:38:20

package dev.tclark.dogshow.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class testLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BREED_COUNT=4;
	public static final int BREED_NAME=5;
	public static final int BREED_NAME_SUFFIX=6;
	public static final int COMMENT=7;
	public static final int DATE=8;
	public static final int ELLIPSIS=9;
	public static final int END_PUNCTUATION=10;
	public static final int END_WORD=11;
	public static final int FRAG_BREED_NAME_ALT=12;
	public static final int FRAG_BREED_NAME_CATEGORY=13;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=14;
	public static final int FRAG_BREED_NAME_SINGLE=15;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=16;
	public static final int FRAG_GROUP_NAME=17;
	public static final int FRAG_MONTH=18;
	public static final int FRAG_PROPER_NAME=19;
	public static final int FRAG_RING=20;
	public static final int FRAG_SPECIAL_GROUP_NAME=21;
	public static final int FRAG_SPEC_CHAR=22;
	public static final int FRAG_SPEC_WORD_CHAR=23;
	public static final int FRAG_TIME_LABEL=24;
	public static final int FRAG_TITLE=25;
	public static final int FRAG_WEEK_DAY=26;
	public static final int FallThrough=27;
	public static final int GROUP_RING=28;
	public static final int INT=29;
	public static final int JUDGE_NAME=30;
	public static final int JUNIOR_CLASS=31;
	public static final int PARENTHETICAL=32;
	public static final int PARENTHETICAL_INT=33;
	public static final int PARENTHETICAL_NAME=34;
	public static final int PHONE_NUMBER=35;
	public static final int RING_TITLE=36;
	public static final int SPECIAL_SUFFIX=37;
	public static final int STANDALONE_COMMENT=38;
	public static final int TIME=39;
	public static final int WORD=40;
	public static final int WS=41;

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:113:5: ( 'Master Class' | 'Open Senior' | 'Open Intermediate' | 'Open Junior' | 'Novice Senior' | 'Novice Junior' | 'Novice Intermediate' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:113:9: 'Master Class'
					{
					match("Master Class"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:114:9: 'Open Senior'
					{
					match("Open Senior"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:115:9: 'Open Intermediate'
					{
					match("Open Intermediate"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:116:9: 'Open Junior'
					{
					match("Open Junior"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:117:9: 'Novice Senior'
					{
					match("Novice Senior"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:118:9: 'Novice Junior'
					{
					match("Novice Junior"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:119:9: 'Novice Intermediate'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:5: ({...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:7: {...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "FRAG_BREED_NAME_SINGLE", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=196;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:24: 'Affenpinscher'
					{
					match("Affenpinscher"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:113:5: 'Afghan Hound'
					{
					match("Afghan Hound"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:114:5: 'Airedale Terrier'
					{
					match("Airedale Terrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:115:5: 'Akita'
					{
					match("Akita"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:116:5: 'Alaskan Malamute'
					{
					match("Alaskan Malamute"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:117:5: 'American English Coonhound'
					{
					match("American English Coonhound"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:118:5: 'American Eskimo Dog'
					{
					match("American Eskimo Dog"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:119:5: 'American Foxhound'
					{
					match("American Foxhound"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:120:5: 'American Staffordshire Terrier'
					{
					match("American Staffordshire Terrier"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:5: 'American Water Spaniel'
					{
					match("American Water Spaniel"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:122:5: 'Anatolian Shepherd Dog'
					{
					match("Anatolian Shepherd Dog"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:123:5: 'Australian Cattle Dog'
					{
					match("Australian Cattle Dog"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:124:5: 'Australian Shepherd'
					{
					match("Australian Shepherd"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:125:5: 'Australian Terrier'
					{
					match("Australian Terrier"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:5: 'Basenji'
					{
					match("Basenji"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:127:5: 'Basset Hound'
					{
					match("Basset Hound"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:128:5: 'Beagle'
					{
					match("Beagle"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:129:5: 'Bearded Collie'
					{
					match("Bearded Collie"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:130:5: 'Beauceron'
					{
					match("Beauceron"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:131:5: 'Bedlington Terrier'
					{
					match("Bedlington Terrier"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:132:5: 'Belgian Malinois'
					{
					match("Belgian Malinois"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:133:5: 'Belgian Sheepdog'
					{
					match("Belgian Sheepdog"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:5: 'Belgian Tervuren'
					{
					match("Belgian Tervuren"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:136:5: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:137:5: 'Bichons Frise'
					{
					match("Bichons Frise"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:139:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:140:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:5: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:142:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:143:5: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:5: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:145:5: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:146:5: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:147:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:149:5: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:150:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:152:5: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:153:5: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:154:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:5: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:156:5: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:157:5: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:158:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:5: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:160:5: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:161:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:163:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:164:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:165:5: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:5: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:167:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:168:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:5: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:170:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:172:5: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:173:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:174:5: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:175:5: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:176:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:5: 'Dogo Argentine'
					{
					match("Dogo Argentine"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:179:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:5: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:183:5: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:5: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:188:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:191:5: 'Fox Terrier'
					{
					match("Fox Terrier"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:5: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:5: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:198:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:199:5: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:5: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:5: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:202:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:205:5: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:5: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:5: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:5: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:214:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:215:5: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:5: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:5: 'Keeshonden'
					{
					match("Keeshonden"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:218:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:219:5: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:5: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:221:5: 'Kuvaszok'
					{
					match("Kuvaszok"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:224:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:225:5: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:226:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:5: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:5: 'Lowchen'
					{
					match("Lowchen"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:5: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:5: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:5: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:5: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:5: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:5: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:5: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:5: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:5: 'Pulik'
					{
					match("Pulik"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:263:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:5: 'Rat Terrier'
					{
					match("Rat Terrier"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:5: 'Retrievers'
					{
					match("Retrievers"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:5: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:272:5: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:273:5: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:275:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:276:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:277:5: 'Setters'
					{
					match("Setters"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:5: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:283:5: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:5: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:286:5: 'Spaniels'
					{
					match("Spaniels"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:287:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: 'Spinoni Italiani'
					{
					match("Spinoni Italiani"); 

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:289:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:290:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:292:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:5: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:5: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 191 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 192 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:5: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 193 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 194 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 195 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 196 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:5: 'Yorkshire Terrier'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:5: ({...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:7: {...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "BREED_NAME", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:22: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:23: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:46: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:67: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:67: 's'
					{
					match('s'); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:72: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:72: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:76: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:77: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); 
					mFRAG_BREED_NAME_CATEGORY(); 

					match(')'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:110: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:110: WS
							{
							mWS(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:114: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:114: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); 

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:150: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='(') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:150: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:5: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:10: FRAG_BREED_NAME_SPECIAL_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:5: ( '(Misc. Dog)' | '(Misc. Dogs)' | '(Misc. Bitch)' | '(Misc. Bitches)' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:9: '(Misc. Dog)'
					{
					match("(Misc. Dog)"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:23: '(Misc. Dogs)'
					{
					match("(Misc. Dogs)"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:38: '(Misc. Bitch)'
					{
					match("(Misc. Bitch)"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:54: '(Misc. Bitches)'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:5: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:10: 'Sweepstakes'
					{
					match("Sweepstakes"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:24: 'Entry'
					{
					match("Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:32: 'Entries'
					{
					match("Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:42: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:29: ( 'Veteran Dog' | 'Veteran Bitch' | 'Veteran Bitche' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:33: 'Veteran Dog'
					{
					match("Veteran Dog"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:47: 'Veteran Bitch'
					{
					match("Veteran Bitch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:63: 'Veteran Bitche'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:9: 'Ascob'
					{
					match("Ascob"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:17: 'Parti-Color'
					{
					match("Parti-Color"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:322:31: 'Black'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: ( '13 Inch' | '15 Inch' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt14=35;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:9: '13 Inch'
					{
					match("13 Inch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:9: '15 Inch'
					{
					match("15 Inch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:9: 'Boykin'
					{
					match("Boykin"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:9: 'B & P C'
					{
					match("B & P C"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:9: 'Clumber'
					{
					match("Clumber"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:9: 'Cocker'
					{
					match("Cocker"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:9: 'Colored'
					{
					match("Colored"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:9: 'Curly-Coated'
					{
					match("Curly-Coated"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:9: 'English'
					{
					match("English"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:9: 'English Cocker'
					{
					match("English Cocker"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:9: 'English Springer'
					{
					match("English Springer"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:9: 'Field'
					{
					match("Field"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:9: 'Flat-Coated'
					{
					match("Flat-Coated"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:9: 'German Shorthaired'
					{
					match("German Shorthaired"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:9: 'German Wirehaired'
					{
					match("German Wirehaired"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:341:9: 'Golden'
					{
					match("Golden"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:342:9: 'Gordon'
					{
					match("Gordon"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:343:9: 'Irish'
					{
					match("Irish"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:9: 'K C & R'
					{
					match("K C & R"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:345:9: 'Labrador'
					{
					match("Labrador"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:9: 'Long Coat'
					{
					match("Long Coat"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:9: 'Longhaired'
					{
					match("Longhaired"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:9: 'Miniature'
					{
					match("Miniature"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:9: 'Rough'
					{
					match("Rough"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:9: 'Smooth'
					{
					match("Smooth"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:9: 'Smooth Coat'
					{
					match("Smooth Coat"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:9: 'Standard'
					{
					match("Standard"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:354:9: 'Sussex'
					{
					match("Sussex"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:9: 'Toy'
					{
					match("Toy"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:9: 'Welsh Springer'
					{
					match("Welsh Springer"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:357:9: 'White'
					{
					match("White"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:9: 'Wire'
					{
					match("Wire"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:9: 'Wirehaired'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:2: ({...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:3: {...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
			{
			if ( !((allowGroup)) ) {
				throw new FailedPredicateException(input, "FRAG_GROUP_NAME", "allowGroup");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:18: ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:20: 'HERDING GROUP'
					{
					match("HERDING GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:3: 'TERRIER GROUP'
					{
					match("TERRIER GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:3: 'NON-SPORTING GROUP'
					{
					match("NON-SPORTING GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:3: 'SPORTING GROUP'
					{
					match("SPORTING GROUP"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:3: 'TOY GROUP'
					{
					match("TOY GROUP"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:3: 'HOUND GROUP'
					{
					match("HOUND GROUP"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:3: 'WORKING GROUP'
					{
					match("WORKING GROUP"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:3: ( 'BEST IN SHOW' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:3: ( 'BEST IN SHOW' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:4: 'BEST IN SHOW'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:380:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:3: 'Toy Variety Group'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:2: ( ( FRAG_GROUP_NAME ' - ' JUDGE_NAME ) | FRAG_SPECIAL_GROUP_NAME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:5: FRAG_GROUP_NAME ' - ' JUDGE_NAME
					{
					mFRAG_GROUP_NAME(); 

					match(" - "); 

					mJUDGE_NAME(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:39: FRAG_SPECIAL_GROUP_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:14: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:25: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:14: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:22: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:14: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:22: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:14: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:20: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:14: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:21: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:14: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:21: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:14: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:23: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:14: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:14: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:24: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:397:14: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:397:25: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:398:14: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:398:25: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:29: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:25: ( 'RING' | 'Ring' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:29: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:5: ( 'am' | 'pm' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:411:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:411:9: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:411:14: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:412:9: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:412:15: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:9: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:14: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:9: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:16: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:10: 'DR'
					{
					match("DR"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:15: 'Dr'
					{
					match("Dr"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:9: 'COL'
					{
					match("COL"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:9: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:18: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:9: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:19: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:9: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:9: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:20: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:9: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:18: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:9: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:20: 'SATURDAY'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='L') ) {
				alt23=1;
			}
			else if ( (LA23_0=='V') ) {
				alt23=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:9: 'LUNCH'
					{
					match("LUNCH"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:17: 'VARIETY GROUP JUDGING'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:438:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:438:17: INT '-' INT '-' INT '-' INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) )
			{
			if ( !((allowJudge)) ) {
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? )
			{
			mFRAG_TITLE(); 

			mWS(); 

			mFRAG_PROPER_NAME(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )*
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:66: PARENTHETICAL_NAME
							{
							mPARENTHETICAL_NAME(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:85: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;

					}

					}
					break;

				default :
					break loop25;
				}
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:106: ( WS )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||LA26_0=='\r'||LA26_0==' ') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:106: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:110: ( PARENTHETICAL_INT )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='(') ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:110: PARENTHETICAL_INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:13: ( ( 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:18: 'GROUP RING'
					{
					match("GROUP RING"); 

					allowGroup=true;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:49: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:49: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:50: 'RING' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
			{
			match('('); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			match(')'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:42: ( WS )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( ((LA30_0 >= '\t' && LA30_0 <= '\n')||LA30_0=='\r'||LA30_0==' ') ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:42: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:13: INT ':' INT WS FRAG_TIME_LABEL
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:13: ( '.' )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:13: '.'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:455:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:455:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:455:6: ( '0' .. '9' )+
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

	// $ANTLR start "PARENTHETICAL"
	public final void mPARENTHETICAL() throws RecognitionException {
		try {
			int _type = PARENTHETICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:13: ( WORD | INT | FRAG_PROPER_NAME )
			int alt33=3;
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
				alt33=1;
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
				alt33=2;
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
				alt33=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:14: WORD
					{
					mWORD(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:19: INT
					{
					mINT(); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:23: FRAG_PROPER_NAME
					{
					mFRAG_PROPER_NAME(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( ((LA35_0 >= '\t' && LA35_0 <= '\n')||LA35_0=='\r'||LA35_0==' ') ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:45: ( WORD | INT | FRAG_PROPER_NAME )
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:46: WORD
							{
							mWORD(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:51: INT
							{
							mINT(); 

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:55: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;

					}

					}
					break;

				default :
					break loop35;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( ((LA36_0 >= '&' && LA36_0 <= '\'')||(LA36_0 >= ',' && LA36_0 <= '-')||(LA36_0 >= ':' && LA36_0 <= ';')||(LA36_0 >= 'A' && LA36_0 <= 'Z')||LA36_0=='_'||(LA36_0 >= 'a' && LA36_0 <= 'z')||LA36_0=='\u2019') ) {
					alt36=1;
				}

				switch (alt36) {
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
					break loop36;
				}
			} while (true);

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:94: ( END_PUNCTUATION )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0=='!'||LA37_0=='.'||LA37_0=='?') ) {
				alt37=1;
			}
			switch (alt37) {
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:13: ( WS )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= '\t' && LA38_0 <= '\n')||LA38_0=='\r'||LA38_0==' ') ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:13: WS
					{
					mWS(); 

					}
					break;

			}

			mINT(); 

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:21: ( WS )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= '\t' && LA39_0 <= '\n')||LA39_0=='\r'||LA39_0==' ') ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:21: WS
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
			int cnt40=0;
			loop40:
			do {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= '&' && LA40_0 <= '\'')||(LA40_0 >= ',' && LA40_0 <= '-')||(LA40_0 >= ':' && LA40_0 <= ';')||LA40_0=='_'||(LA40_0 >= 'a' && LA40_0 <= 'z')||LA40_0=='\u2019') ) {
					alt40=1;
				}

				switch (alt40) {
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
					if ( cnt40 >= 1 ) break loop40;
						EarlyExitException eee =
							new EarlyExitException(40, input);
						throw eee;
				}
				cnt40++;
			} while (true);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:65: ( END_PUNCTUATION )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0=='!'||LA41_0=='.'||LA41_0=='?') ) {
				alt41=1;
			}
			switch (alt41) {
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			int cnt43=0;
			loop43:
			do {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( ((LA43_0 >= '&' && LA43_0 <= '(')||(LA43_0 >= ',' && LA43_0 <= '.')||(LA43_0 >= '0' && LA43_0 <= ';')||(LA43_0 >= 'A' && LA43_0 <= 'Z')||LA43_0=='_'||(LA43_0 >= 'a' && LA43_0 <= 'z')||LA43_0=='\u2019') ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					int alt42=5;
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
						alt42=1;
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
						alt42=2;
						}
						break;
					case '(':
						{
						alt42=3;
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
						alt42=4;
						}
						break;
					case '.':
						{
						alt42=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}
					switch (alt42) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:15: FRAG_PROPER_NAME
							{
							mFRAG_PROPER_NAME(); 

							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:32: WORD
							{
							mWORD(); 

							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:37: PARENTHETICAL
							{
							mPARENTHETICAL(); 

							}
							break;
						case 4 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:51: INT
							{
							mINT(); 

							}
							break;
						case 5 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:55: ELLIPSIS
							{
							mELLIPSIS(); 

							}
							break;

					}

					allowBreed=false; allowGroup=false;allowJudge=false;
					}
					break;

				default :
					if ( cnt43 >= 1 ) break loop43;
						EarlyExitException eee =
							new EarlyExitException(43, input);
						throw eee;
				}
				cnt43++;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:4: WORD END_PUNCTUATION
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:28: ( '(' FRAG_PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:30: '(' FRAG_PROPER_NAME ')'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:473:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:473:6: .
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:8: ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | GROUP_RING | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough )
		int alt44=19;
		alt44 = dfa44.predict(input);
		switch (alt44) {
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:78: STANDALONE_COMMENT
				{
				mSTANDALONE_COMMENT(); 

				}
				break;
			case 7 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:97: BREED_COUNT
				{
				mBREED_COUNT(); 

				}
				break;
			case 8 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:109: JUDGE_NAME
				{
				mJUDGE_NAME(); 

				}
				break;
			case 9 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:120: WS
				{
				mWS(); 

				}
				break;
			case 10 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:123: RING_TITLE
				{
				mRING_TITLE(); 

				}
				break;
			case 11 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:134: PHONE_NUMBER
				{
				mPHONE_NUMBER(); 

				}
				break;
			case 12 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:147: TIME
				{
				mTIME(); 

				}
				break;
			case 13 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:152: DATE
				{
				mDATE(); 

				}
				break;
			case 14 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:157: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 15 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:1:166: INT
				{
				mINT(); 

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
	protected DFA44 dfa44 = new DFA44(this);
	static final String DFA2_eotS =
		"\u00ea\uffff\1\u010e\74\uffff\1\u0148\72\uffff\1\u0178\102\uffff";
	static final String DFA2_eofS =
		"\u01a5\uffff";
	static final String DFA2_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\3\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff\1\145\1\uffff"+
		"\2\163\1\141\1\143\1\141\1\162\1\141\1\154\1\151\1\uffff\1\145\2\uffff"+
		"\1\143\1\uffff\1\143\1\142\1\147\1\145\3\uffff\1\162\2\uffff\1\154\1\145"+
		"\1\162\2\uffff\1\151\1\uffff\1\145\1\uffff\1\166\1\142\4\uffff\1\154\1"+
		"\156\1\141\1\162\2\uffff\1\160\1\153\2\uffff\1\151\1\147\2\uffff\1\144"+
		"\3\uffff\1\151\1\150\1\141\1\145\1\142\2\uffff\2\141\2\uffff\1\142\2\uffff"+
		"\1\151\1\uffff\1\162\2\uffff\1\162\1\164\1\145\1\147\1\uffff\1\147\1\uffff"+
		"\1\150\1\143\2\uffff\1\144\1\uffff\1\166\3\uffff\1\141\1\uffff\1\154\1"+
		"\uffff\1\141\3\uffff\1\150\7\uffff\1\157\1\154\2\uffff\1\156\1\155\2\uffff"+
		"\1\141\2\uffff\2\163\1\uffff\1\141\6\uffff\1\151\2\uffff\1\146\5\uffff"+
		"\1\151\4\uffff\1\164\1\uffff\1\151\6\uffff\1\164\3\uffff\1\142\1\145\2"+
		"\uffff\1\156\1\146\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162\5\uffff"+
		"\1\151\1\157\1\153\1\145\1\uffff\1\151\2\uffff\1\40\3\uffff\1\145\1\uffff"+
		"\1\145\2\151\1\141\1\164\1\uffff\2\150\1\163\1\141\1\uffff\1\145\1\164"+
		"\1\165\1\153\1\164\2\uffff\1\162\1\157\2\uffff\1\164\1\150\1\40\1\143"+
		"\2\141\1\156\1\40\1\162\1\145\3\uffff\1\163\1\40\2\163\1\156\2\40\1\157"+
		"\1\172\1\164\1\147\1\uffff\1\40\1\147\2\uffff\2\151\1\156\1\141\1\40\2"+
		"\uffff\1\141\1\154\1\156\1\40\1\46\1\40\1\162\1\145\2\uffff\2\150\1\40"+
		"\1\104\1\uffff\1\122\1\156\1\157\1\165\1\151\2\uffff\1\165\1\163\1\141"+
		"\1\145\1\156\1\123\1\156\1\151\1\40\5\uffff\1\103\4\40\1\120\5\uffff\1"+
		"\141\1\144\2\uffff\1\162\1\141\1\145\1\150\1\156\2\uffff\1\40\2\uffff"+
		"\1\40\1\141\1\115\4\uffff\2\103\1\114\1\uffff\1\150\3\uffff\2\145\1\156"+
		"\1\163\2\40\1\115\1\105\1\156\7\uffff\1\145\3\uffff\1\145\2\uffff\2\40"+
		"\1\145\1\104\1\110\3\uffff\1\156\3\uffff\1\40\4\uffff\1\101\1\102\1\40"+
		"\2\uffff\1\165\2\uffff\1\103\7\uffff\1\120\1\163\5\uffff\1\153\1\151\2"+
		"\uffff";
	static final String DFA2_maxS =
		"\1\131\3\165\1\157\1\156\2\162\1\141\1\164\1\uffff\1\165\1\u00f6\1\151"+
		"\1\157\1\164\1\171\1\165\1\167\1\162\1\uffff\1\151\2\uffff\1\147\3\uffff"+
		"\1\145\1\uffff\2\163\1\162\1\143\1\165\1\171\1\165\1\154\1\166\1\uffff"+
		"\1\157\2\uffff\1\154\1\uffff\1\156\1\147\1\164\1\156\3\uffff\1\162\2\uffff"+
		"\1\162\1\145\1\166\2\uffff\1\151\1\uffff\1\162\1\uffff\1\166\1\153\4\uffff"+
		"\1\163\1\156\1\167\1\166\2\uffff\1\162\1\164\2\uffff\1\162\1\154\2\uffff"+
		"\1\164\3\uffff\1\155\1\157\1\164\1\151\1\154\2\uffff\1\151\1\141\2\uffff"+
		"\1\142\2\uffff\1\163\1\uffff\1\162\2\uffff\1\162\1\164\1\163\1\165\1\uffff"+
		"\1\147\1\uffff\1\150\1\143\2\uffff\1\172\1\uffff\1\166\3\uffff\1\164\1"+
		"\uffff\1\154\1\uffff\1\145\3\uffff\1\156\7\uffff\1\165\1\154\2\uffff\1"+
		"\156\1\155\2\uffff\1\171\2\uffff\2\163\1\uffff\1\141\6\uffff\1\151\2\uffff"+
		"\1\167\5\uffff\1\151\4\uffff\1\164\1\uffff\1\151\6\uffff\1\164\3\uffff"+
		"\1\150\1\145\2\uffff\2\156\1\145\1\uffff\1\163\1\uffff\1\145\1\151\1\162"+
		"\5\uffff\1\151\1\157\1\153\1\145\1\uffff\1\151\2\uffff\1\155\3\uffff\1"+
		"\145\1\uffff\1\145\2\151\1\141\1\164\1\uffff\2\150\1\163\1\141\1\uffff"+
		"\1\151\1\164\1\165\1\153\1\164\2\uffff\1\162\1\157\2\uffff\1\164\2\150"+
		"\1\143\2\141\1\156\1\40\1\162\1\145\3\uffff\4\163\1\156\1\145\1\40\1\157"+
		"\1\172\1\164\1\147\1\uffff\1\163\1\147\2\uffff\2\151\1\156\1\141\1\40"+
		"\2\uffff\1\141\1\154\1\156\1\163\1\141\1\40\1\162\1\145\2\uffff\2\150"+
		"\1\40\1\120\1\uffff\1\127\1\156\1\157\1\165\1\151\2\uffff\1\165\1\163"+
		"\1\141\1\151\1\156\1\124\1\156\1\151\1\40\5\uffff\1\124\1\163\3\40\1\127"+
		"\5\uffff\1\157\1\144\2\uffff\1\162\1\141\1\145\1\150\1\156\2\uffff\1\40"+
		"\2\uffff\1\40\1\141\1\124\4\uffff\1\123\1\124\1\123\1\uffff\1\150\3\uffff"+
		"\2\145\1\156\1\163\2\40\1\124\1\127\1\156\7\uffff\1\160\3\uffff\1\157"+
		"\2\uffff\2\40\1\145\1\124\1\110\3\uffff\1\163\3\uffff\1\40\4\uffff\1\123"+
		"\1\114\1\40\2\uffff\1\165\2\uffff\1\124\7\uffff\1\127\1\163\5\uffff\1"+
		"\153\1\171\2\uffff";
	static final String DFA2_acceptS =
		"\12\uffff\1\150\11\uffff\1\u00bb\1\uffff\1\u00c3\1\u00c4\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\13\11\uffff\1\64\1\uffff\1\71\1\73\1\uffff\1\76\4\uffff"+
		"\1\117\1\120\1\121\1\uffff\1\126\1\127\3\uffff\1\140\1\141\1\uffff\1\147"+
		"\1\uffff\1\154\2\uffff\1\162\1\163\1\164\1\165\4\uffff\1\u0085\1\u0086"+
		"\2\uffff\1\u008d\1\u008e\2\uffff\1\u0098\1\u0099\1\uffff\1\u009c\1\u009d"+
		"\1\u009e\5\uffff\1\u00ad\1\u00ae\2\uffff\1\u00b4\1\u00b5\1\uffff\1\u00b9"+
		"\1\u00ba\1\uffff\1\u00c0\1\uffff\1\1\1\2\4\uffff\1\24\1\uffff\1\30\2\uffff"+
		"\1\36\1\37\1\uffff\1\43\1\uffff\1\46\1\47\1\50\1\uffff\1\53\1\uffff\1"+
		"\57\1\uffff\1\62\1\63\1\65\1\uffff\1\72\1\74\1\75\1\77\1\100\1\101\1\102"+
		"\2\uffff\1\113\1\114\2\uffff\1\130\1\131\1\uffff\1\136\1\137\2\uffff\1"+
		"\153\1\uffff\1\157\1\160\1\161\1\166\1\167\1\170\1\uffff\1\175\1\176\1"+
		"\uffff\1\u0084\1\u0087\1\u0088\1\u0089\1\u008a\1\uffff\1\u008f\1\u0090"+
		"\1\u0091\1\u0092\1\uffff\1\u0095\1\uffff\1\u009a\1\u009b\1\u009f\1\u00a0"+
		"\1\u00a1\1\u00a2\1\uffff\1\u00a5\1\u00a6\1\u00a7\2\uffff\1\u00ac\1\u00af"+
		"\3\uffff\1\u00bc\1\uffff\1\u00bf\3\uffff\1\17\1\20\1\21\1\22\1\23\4\uffff"+
		"\1\42\1\uffff\1\51\1\52\1\uffff\1\60\1\61\1\66\1\uffff\1\103\5\uffff\1"+
		"\135\4\uffff\1\177\5\uffff\1\u00a8\1\u00a9\2\uffff\1\u00b2\1\u00b3\12"+
		"\uffff\1\54\1\55\1\56\13\uffff\1\u0083\2\uffff\1\u0097\1\u0096\5\uffff"+
		"\1\u00c1\1\u00c2\10\uffff\1\104\1\105\4\uffff\1\134\5\uffff\1\u008b\1"+
		"\u008c\11\uffff\1\31\1\32\1\33\1\34\1\35\6\uffff\1\132\1\133\1\142\1\143"+
		"\1\144\2\uffff\1\156\1\155\5\uffff\1\u00b0\1\u00b1\1\uffff\1\u00bd\1\u00be"+
		"\3\uffff\1\40\1\41\1\44\1\45\3\uffff\1\122\1\uffff\1\125\1\145\1\146\11"+
		"\uffff\1\25\1\26\1\27\1\67\1\70\1\106\1\107\1\uffff\1\112\1\115\1\116"+
		"\1\uffff\1\152\1\151\5\uffff\1\u00b6\1\u00b7\1\u00b8\1\uffff\1\10\1\11"+
		"\1\12\1\uffff\1\110\1\111\1\123\1\124\3\uffff\1\u00a3\1\u00a4\1\uffff"+
		"\1\6\1\7\1\uffff\1\171\1\172\1\173\1\174\1\u0080\1\u0081\1\u0082\2\uffff"+
		"\1\14\1\15\1\16\1\u0093\1\u0094\2\uffff\1\u00aa\1\u00ab";
	static final String DFA2_specialS =
		"\u01a5\uffff}>";
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
			"\1\123\3\uffff\1\124\2\uffff\1\125\6\uffff\1\126\5\uffff\1\127",
			"\1\130\1\uffff\1\131\1\uffff\1\132\2\uffff\1\133\1\134\1\uffff\1\135"+
			"\3\uffff\1\136\1\137\3\uffff\1\140\1\141\1\uffff\1\142",
			"\1\143\5\uffff\1\144\2\uffff\1\145",
			"",
			"\1\146\2\uffff\1\147\1\150",
			"",
			"",
			"\1\151\1\152",
			"",
			"",
			"",
			"\1\153",
			"",
			"\1\154",
			"\1\155",
			"\1\156\2\uffff\1\157\7\uffff\1\160\5\uffff\1\161",
			"\1\162",
			"\1\163\15\uffff\1\164\5\uffff\1\165",
			"\1\166\1\167\1\uffff\1\170\2\uffff\1\171\1\172",
			"\1\173\7\uffff\1\174\13\uffff\1\175",
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
			"",
			"\1\u00cf",
			"\1\u00d0",
			"",
			"",
			"\1\u00d1\25\uffff\1\u00d2",
			"",
			"\1\u00d3",
			"",
			"",
			"",
			"\1\u00d4\22\uffff\1\u00d5",
			"",
			"\1\u00d6",
			"",
			"\1\u00d7\3\uffff\1\u00d8",
			"",
			"",
			"",
			"\1\u00d9\5\uffff\1\u00da",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00db\5\uffff\1\u00dc",
			"\1\u00dd",
			"",
			"",
			"\1\u00de",
			"\1\u00df",
			"",
			"",
			"\1\u00e0\27\uffff\1\u00e1",
			"",
			"",
			"\1\u00e2",
			"\1\u00e3",
			"",
			"\1\u00e4",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e5",
			"",
			"",
			"\1\u00e6\20\uffff\1\u00e7",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e8",
			"",
			"",
			"",
			"",
			"\1\u00e9",
			"",
			"\1\u00ea",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00eb",
			"",
			"",
			"",
			"\1\u00ec\5\uffff\1\u00ed",
			"\1\u00ee",
			"",
			"",
			"\1\u00ef",
			"\1\u00f0\7\uffff\1\u00f1",
			"\1\u00f2",
			"",
			"\1\u00f3",
			"",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"",
			"\1\u00fb",
			"",
			"",
			"\1\u00fc\103\uffff\1\u00fd\10\uffff\1\u00fe",
			"",
			"",
			"",
			"\1\u00ff",
			"",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"",
			"\1\u0109\3\uffff\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010f",
			"",
			"",
			"\1\u0110",
			"\1\u0111",
			"",
			"",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114\107\uffff\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"",
			"",
			"",
			"\1\u011d",
			"\1\u011e\122\uffff\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123\104\uffff\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"",
			"\1\u012a\122\uffff\1\u012b",
			"\1\u012c",
			"",
			"",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"",
			"",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135\122\uffff\1\u0136",
			"\1\u0138\53\uffff\1\u0139\16\uffff\1\u0137",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"",
			"",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140\13\uffff\1\u0141",
			"",
			"\1\u0142\1\u0143\1\u0144\2\uffff\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0149",
			"\1\u014a",
			"",
			"",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e\3\uffff\1\u014f",
			"\1\u0150",
			"\1\u0151\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"",
			"",
			"",
			"",
			"",
			"\1\u0156\20\uffff\1\u0157",
			"\1\u0158\122\uffff\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d\2\uffff\1\u015e\3\uffff\1\u015f",
			"",
			"",
			"",
			"",
			"",
			"\1\u0160\15\uffff\1\u0161",
			"\1\u0162",
			"",
			"",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"",
			"",
			"\1\u0168",
			"",
			"",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b\5\uffff\1\u016c\1\u016d",
			"",
			"",
			"",
			"",
			"\1\u016e\17\uffff\1\u016f",
			"\1\u0170\2\uffff\1\u0171\14\uffff\1\u0172\1\u0173",
			"\1\u0174\6\uffff\1\u0175",
			"",
			"\1\u0176",
			"",
			"",
			"",
			"\1\u0177",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e\5\uffff\1\u017f\1\u0180",
			"\1\u0181\1\u0182\14\uffff\1\u0183\3\uffff\1\u0184",
			"\1\u0185",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0186\12\uffff\1\u0187",
			"",
			"",
			"",
			"\1\u0188\11\uffff\1\u0189",
			"",
			"",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d\17\uffff\1\u018e",
			"\1\u018f",
			"",
			"",
			"",
			"\1\u0190\4\uffff\1\u0191",
			"",
			"",
			"",
			"\1\u0192",
			"",
			"",
			"",
			"",
			"\1\u0193\1\u0194\15\uffff\1\u0195\2\uffff\1\u0196",
			"\1\u0197\2\uffff\1\u0198\6\uffff\1\u0199",
			"\1\u019a",
			"",
			"",
			"\1\u019b",
			"",
			"",
			"\1\u019c\17\uffff\1\u019d\1\u019e",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u019f\6\uffff\1\u01a0",
			"\1\u01a1",
			"",
			"",
			"",
			"",
			"",
			"\1\u01a2",
			"\1\u01a4\17\uffff\1\u01a3",
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
			return "112:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
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
			return "323:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA44_eotS =
		"\1\uffff\27\50\1\36\1\u009d\1\uffff\1\u00a2\3\uffff\11\50\1\uffff\73\50"+
		"\1\uffff\63\50\6\uffff\1\50\1\u009d\1\50\2\uffff\1\u00a2\6\50\1\uffff"+
		"\152\50\1\u01d1\71\50\4\uffff\1\u0213\2\uffff\1\u0213\1\uffff\171\50\1"+
		"\uffff\1\u028a\1\uffff\1\u029b\44\50\1\uffff\2\50\1\uffff\22\50\6\uffff"+
		"\1\50\1\uffff\7\50\1\uffff\13\50\1\u02ea\24\50\1\u02fe\1\50\1\u0300\31"+
		"\50\1\u0318\41\50\1\u0334\6\50\1\u033b\5\50\20\uffff\1\u035c\1\uffff\7"+
		"\50\1\uffff\31\50\1\uffff\23\50\4\uffff\1\u0213\1\uffff\23\50\1\uffff"+
		"\6\50\1\u03a3\11\50\1\u03ac\2\50\1\uffff\1\50\1\uffff\1\u03ae\15\50\1"+
		"\u03ba\10\50\1\uffff\16\50\1\uffff\6\50\1\u03cf\5\50\1\uffff\6\50\1\uffff"+
		"\3\50\1\u03db\1\50\34\uffff\7\50\1\u0402\33\50\1\u041c\13\50\2\uffff\2"+
		"\50\1\u042b\1\u042c\20\50\1\u043a\1\uffff\10\50\1\uffff\1\50\1\uffff\2"+
		"\50\1\u0442\10\50\1\uffff\6\50\1\u0318\4\50\1\u044f\10\50\1\uffff\4\50"+
		"\1\u0459\4\50\1\u045d\1\50\1\uffff\1\50\36\uffff\7\50\1\uffff\1\u0483"+
		"\4\50\1\u0488\23\50\1\uffff\5\50\1\u0499\5\50\1\uffff\1\50\1\u04a2\2\uffff"+
		"\2\50\1\uffff\12\50\1\uffff\5\50\1\u04b0\1\50\1\uffff\14\50\1\uffff\1"+
		"\u04ba\2\50\1\u04bd\1\u04be\1\u04bf\3\50\1\uffff\1\u04c1\2\50\1\uffff"+
		"\2\50\32\uffff\1\u04e4\3\uffff\4\50\2\uffff\4\50\1\uffff\2\50\1\u04ec"+
		"\6\50\1\uffff\2\50\1\u0318\1\uffff\2\50\1\uffff\1\50\1\uffff\3\50\2\uffff"+
		"\1\50\1\uffff\12\50\1\u0500\2\50\1\uffff\2\50\1\u0505\1\50\1\u0507\1\u0508"+
		"\2\50\1\u050b\1\uffff\2\50\3\uffff\1\50\1\uffff\1\u050e\2\50\33\uffff"+
		"\3\50\5\uffff\4\50\1\uffff\11\50\2\uffff\2\50\1\u053b\5\50\1\uffff\1\50"+
		"\1\u053f\2\50\1\uffff\1\50\2\uffff\2\50\1\uffff\1\u0544\1\u0545\1\uffff"+
		"\1\u0546\1\50\30\uffff\3\50\3\uffff\1\u0561\1\u0562\1\u0563\3\50\1\u0567"+
		"\2\50\2\uffff\1\50\1\uffff\3\50\1\uffff\1\u0570\3\50\27\uffff\3\50\6\uffff"+
		"\1\50\1\u0318\1\50\1\uffff\1\50\1\u0589\2\uffff\1\50\1\u058d\2\50\1\uffff"+
		"\1\50\17\uffff\3\50\2\uffff\1\50\1\uffff\1\50\1\uffff\1\u0589\1\uffff"+
		"\1\50\2\uffff\1\u05a8\16\uffff\1\u05b6\1\50\1\u05b8\2\uffff\2\50\1\u0589"+
		"\1\uffff\1\u038d\1\uffff\1\u05bd\15\uffff\1\50\3\uffff\1\u05cb\2\uffff"+
		"\1\u05cd\12\uffff\1\50\2\uffff\1\u0589\1\uffff\1\u05d9\10\uffff\1\50\11"+
		"\uffff\1\50\1\uffff\1\u05ec\6\uffff\1\50\6\uffff\1\u05f6\20\uffff";
	static final String DFA44_eofS =
		"\u0602\uffff";
	static final String DFA44_minS =
		"\1\0\1\111\1\154\1\117\1\146\1\105\1\117\1\122\1\156\2\122\1\105\1\142"+
		"\1\141\1\145\1\125\1\141\1\105\1\101\1\105\1\101\1\105\2\157\1\11\1\46"+
		"\1\uffff\1\46\3\uffff\1\154\1\156\4\11\1\123\1\156\1\116\1\uffff\1\145"+
		"\1\144\1\164\1\162\1\141\1\116\1\146\1\162\1\151\1\141\1\145\1\141\2\163"+
		"\1\141\1\143\1\141\1\162\1\141\1\154\1\123\1\151\1\163\1\145\1\162\1\165"+
		"\1\143\1\162\1\114\1\143\1\142\2\11\1\147\1\145\1\141\1\170\1\145\1\111"+
		"\1\162\1\141\1\145\1\154\1\145\1\117\1\162\1\122\1\125\1\151\1\145\1\151"+
		"\1\141\1\160\1\145\1\155\1\166\1\142\1\157\1\141\1\uffff\1\167\1\116\1"+
		"\160\1\153\1\141\1\157\1\151\1\147\1\162\1\164\1\144\1\157\1\164\1\163"+
		"\1\107\1\116\1\151\1\150\1\141\1\145\1\142\1\171\1\146\2\141\1\156\1\145"+
		"\1\117\1\105\1\116\1\124\1\142\1\171\1\145\1\122\1\131\1\145\1\105\1\165"+
		"\1\125\1\172\1\164\1\124\1\122\1\144\1\151\1\162\1\122\1\104\1\154\1\162"+
		"\4\11\2\uffff\1\60\1\46\1\60\2\uffff\1\46\2\164\1\143\1\151\1\163\1\11"+
		"\1\uffff\1\11\1\123\1\144\1\104\1\156\1\40\1\145\1\141\1\146\1\160\1\146"+
		"\1\55\1\145\1\150\1\145\1\164\1\163\1\162\2\164\1\145\1\147\1\154\1\147"+
		"\1\156\1\150\1\143\1\157\1\145\1\144\1\164\1\166\1\145\1\153\1\143\1\141"+
		"\1\163\1\154\1\124\1\162\1\141\1\144\1\141\1\153\1\163\1\150\1\167\1\156"+
		"\1\155\1\153\1\11\1\154\1\11\1\150\1\155\1\144\1\145\1\157\3\154\1\156"+
		"\1\164\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\141\1\125\1\162\1\141"+
		"\1\104\1\116\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162"+
		"\1\157\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\151\1\142\1\151\1\162"+
		"\1\164\1\156\1\151\1\145\1\144\1\164\1\11\1\151\1\145\1\40\1\142\1\162"+
		"\1\144\1\164\1\163\1\125\1\107\1\156\1\165\1\157\1\165\1\151\1\164\1\154"+
		"\2\164\1\142\1\145\1\153\1\145\1\164\2\156\1\146\1\163\2\144\1\122\1\105"+
		"\1\104\1\125\1\145\1\40\1\145\1\122\1\40\1\163\1\123\1\162\1\122\1\163"+
		"\1\145\1\105\1\111\1\155\1\163\1\164\1\156\1\160\1\145\1\113\1\116\1\157"+
		"\1\153\4\11\1\46\2\11\1\46\1\11\1\55\1\11\2\145\1\150\1\141\2\11\1\141"+
		"\1\101\1\40\1\162\1\143\1\40\1\157\1\145\2\157\1\123\1\156\1\141\1\144"+
		"\1\141\1\153\1\151\1\157\1\162\1\156\1\145\1\154\1\144\1\143\2\151\1\145"+
		"\1\157\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164"+
		"\1\163\2\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40"+
		"\1\145\1\142\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\40\1\145\1\151"+
		"\1\145\1\151\1\144\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145"+
		"\1\157\1\164\1\150\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151\1\156"+
		"\1\150\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154"+
		"\1\157\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\0\1\11"+
		"\1\46\1\11\1\156\1\157\1\151\1\145\1\167\1\145\1\114\1\11\1\164\1\153"+
		"\1\171\1\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171\2\40"+
		"\1\151\1\157\1\146\1\144\1\145\1\141\1\151\1\160\1\124\1\120\1\101\1\122"+
		"\1\164\1\106\1\151\1\111\1\uffff\1\144\1\104\1\163\1\123\1\154\1\162\1"+
		"\122\1\105\1\141\1\150\1\40\1\145\1\160\1\40\1\111\1\105\1\151\1\163\4"+
		"\11\1\uffff\1\11\1\60\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1\131"+
		"\1\uffff\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156\1"+
		"\141\1\11\1\141\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163"+
		"\1\156\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\11\1\156\1\11\1\144"+
		"\1\141\1\145\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163"+
		"\1\143\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\1\40\1\163\1\142"+
		"\1\41\1\145\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\40\1"+
		"\157\1\40\2\145\1\116\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172"+
		"\1\144\1\164\1\141\1\145\1\40\1\145\1\41\1\154\1\156\1\147\1\157\1\40"+
		"\1\157\1\11\1\145\1\150\1\141\1\145\1\147\1\0\20\11\1\0\1\145\1\156\1"+
		"\145\1\163\1\145\1\154\1\101\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151"+
		"\1\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171"+
		"\2\163\1\111\1\123\1\131\1\104\1\141\1\uffff\1\156\1\105\1\141\1\101\1"+
		"\144\1\104\2\141\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\123"+
		"\1\164\1\150\6\11\1\55\1\40\1\146\1\145\1\163\1\165\2\54\1\157\1\40\1"+
		"\153\1\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\0\1\156\1\141\1"+
		"\151\1\154\1\151\1\40\1\11\1\144\1\162\1\147\1\156\1\145\1\40\1\157\1"+
		"\143\1\40\1\11\1\40\1\162\1\0\1\40\1\0\1\11\1\156\1\154\1\147\1\163\1"+
		"\40\1\141\2\145\1\150\1\145\1\157\1\162\1\40\1\11\1\103\1\165\1\151\1"+
		"\40\1\141\1\40\1\150\1\165\1\uffff\1\163\1\150\1\157\1\40\2\54\3\40\1"+
		"\162\1\165\1\162\1\163\1\107\1\uffff\1\40\1\144\1\156\1\163\1\156\1\157"+
		"\1\11\2\157\1\156\1\162\1\156\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150"+
		"\1\0\1\162\1\40\1\156\1\11\1\165\33\11\1\0\1\141\1\145\1\166\2\151\1\154"+
		"\1\122\1\11\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145"+
		"\2\162\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1\147\1\122"+
		"\1\171\1\131\1\141\1\101\1\11\1\156\1\116\1\131\1\141\1\144\1\164\1\151"+
		"\1\107\1\104\1\172\1\151\1\11\1\uffff\2\60\2\11\1\164\1\162\1\11\1\165"+
		"\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156\1\141\1\151"+
		"\1\11\1\0\1\40\1\157\1\164\3\40\1\165\1\153\1\0\1\40\1\0\1\171\1\163\1"+
		"\11\1\164\1\156\1\162\1\141\1\165\3\40\1\0\1\157\1\156\1\141\1\156\1\40"+
		"\1\143\1\41\1\40\1\141\1\40\1\156\1\11\1\145\1\40\1\151\1\40\1\145\1\144"+
		"\1\162\1\153\1\0\1\162\1\40\1\144\1\147\1\11\1\156\1\163\1\145\1\40\1"+
		"\11\1\151\1\0\1\145\36\11\1\156\1\40\1\145\1\141\1\154\2\40\1\0\1\11\1"+
		"\171\1\162\1\150\1\155\1\11\1\144\1\156\1\163\2\40\2\144\1\40\1\141\1"+
		"\107\1\101\1\131\3\40\2\54\1\171\1\131\1\0\3\40\1\156\1\141\1\11\1\162"+
		"\1\40\1\101\1\143\1\162\1\11\1\60\1\46\2\0\2\145\1\uffff\2\156\1\141\1"+
		"\154\1\124\1\163\2\40\1\156\1\141\1\0\1\156\1\157\1\156\2\40\1\11\1\40"+
		"\1\0\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1\150\1\164\1\144\1\0\1\11"+
		"\1\143\1\40\3\11\2\40\1\145\1\0\1\11\1\145\1\40\1\0\1\141\1\163\36\11"+
		"\1\40\1\162\1\156\1\145\1\uffff\1\0\1\54\1\153\2\40\1\0\2\40\1\11\1\163"+
		"\1\40\1\153\1\40\1\113\1\54\1\uffff\2\54\1\41\1\uffff\1\145\1\171\1\0"+
		"\1\145\1\uffff\1\131\1\165\1\145\2\11\1\55\1\uffff\1\162\1\40\1\144\1"+
		"\40\1\156\1\141\1\111\1\143\1\40\1\156\1\11\1\156\1\144\1\0\1\146\1\145"+
		"\1\11\1\164\2\11\2\145\1\11\1\0\1\40\1\156\3\0\1\162\1\0\1\11\1\156\1"+
		"\145\33\11\1\163\1\141\1\154\1\46\1\0\3\11\1\163\1\40\1\162\1\145\1\0"+
		"\1\150\1\145\1\105\1\162\1\54\1\144\1\54\1\151\1\40\2\11\1\60\1\40\1\11"+
		"\1\40\1\156\1\116\1\150\1\40\1\0\1\40\1\11\1\146\1\40\1\0\1\145\2\0\1"+
		"\162\1\144\1\0\2\11\1\0\1\11\1\40\30\11\1\143\1\162\1\141\6\11\1\151\1"+
		"\163\1\123\1\11\1\40\1\156\2\11\1\60\1\0\1\144\1\107\1\145\1\0\1\11\1"+
		"\144\2\40\3\0\24\11\1\157\1\164\1\143\3\11\3\0\1\162\1\41\1\40\1\0\1\164"+
		"\1\46\2\11\1\60\1\11\1\40\1\162\1\0\1\40\17\11\1\142\1\151\1\153\2\11"+
		"\1\145\1\uffff\1\154\1\uffff\1\46\1\11\1\60\1\0\1\uffff\17\11\1\41\1\55"+
		"\1\41\2\11\1\40\1\151\1\46\1\11\1\46\1\0\1\46\14\11\1\0\1\103\1\0\4\11"+
		"\1\0\1\46\12\11\1\157\1\11\1\0\1\46\1\0\1\46\10\11\1\154\1\11\1\0\7\11"+
		"\1\157\1\11\1\46\6\11\1\162\1\11\1\0\4\11\1\41\4\11\1\0\13\11";
	static final String DFA44_maxS =
		"\1\uffff\1\163\1\164\1\157\3\165\1\162\1\156\2\162\1\141\1\164\1\141\1"+
		"\165\1\u00f6\1\171\1\165\1\167\1\165\2\151\2\157\2\u2019\1\uffff\1\u2019"+
		"\3\uffff\2\163\1\123\1\163\2\40\1\123\1\156\1\116\1\uffff\1\145\1\144"+
		"\1\164\1\166\1\167\1\116\1\147\1\162\1\151\1\141\1\145\1\141\2\163\1\162"+
		"\1\143\1\165\1\171\1\165\1\154\1\123\1\166\1\163\1\157\1\162\1\165\1\154"+
		"\1\162\1\114\1\156\1\147\2\40\1\164\1\156\1\141\1\170\1\151\1\111\1\162"+
		"\1\141\1\145\1\162\1\145\1\117\1\166\1\122\1\125\1\151\1\145\1\151\1\141"+
		"\1\160\1\162\1\155\1\166\1\153\1\157\1\141\1\uffff\1\167\1\116\1\162\1"+
		"\164\1\141\1\157\1\162\1\154\1\162\2\164\1\157\1\164\1\163\1\107\1\116"+
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
		"\151\1\145\1\40\1\142\1\162\1\144\1\164\1\163\1\125\1\107\1\156\1\165"+
		"\1\157\1\165\1\151\1\164\1\154\2\164\1\150\1\145\1\153\1\145\1\164\3\156"+
		"\1\163\1\144\1\145\1\122\1\105\1\104\1\125\1\145\1\40\1\145\1\122\1\40"+
		"\1\163\1\123\1\162\1\122\1\163\1\145\1\105\1\111\1\155\1\163\1\164\1\156"+
		"\1\160\1\145\1\113\1\116\1\157\1\153\2\u2019\1\51\2\u2019\1\71\2\u2019"+
		"\1\51\2\71\1\151\1\145\1\150\1\141\2\40\1\141\1\101\1\40\1\162\1\143\1"+
		"\40\1\157\1\151\2\157\1\123\1\156\1\141\1\144\1\141\1\153\1\151\1\157"+
		"\1\162\1\156\1\145\1\154\1\144\1\143\2\151\1\145\1\157\1\153\1\144\1\164"+
		"\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163\1\155\1\40\1\156"+
		"\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\145\1\142\1\145"+
		"\1\151\1\171\1\163\1\141\1\151\1\162\1\40\1\145\1\151\1\145\1\171\1\144"+
		"\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157\1\164\1\150"+
		"\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151\1\156\1\150\1\171\1\156"+
		"\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157\1\156\1\162"+
		"\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\0\3\u2019\1\156\1\157\1\151"+
		"\1\145\1\167\1\145\1\114\1\40\1\164\1\153\1\171\1\162\1\160\1\164\1\171"+
		"\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1\157\1\146\1\144\1\145"+
		"\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\164\1\126\1\151\1\111\1\uffff"+
		"\1\144\1\104\1\163\1\123\1\154\1\162\1\122\1\105\1\141\1\150\1\40\1\145"+
		"\1\160\1\150\1\111\1\105\1\151\1\163\2\u2019\1\71\1\u2019\1\uffff\2\71"+
		"\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1\131\1\uffff\1\150\1\145"+
		"\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156\1\141\1\u2019\1\141\1"+
		"\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\163\1\156\1\40\1\150"+
		"\1\151\1\162\1\151\1\156\1\145\1\u2019\1\156\1\u2019\1\144\1\141\1\145"+
		"\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143\1\145"+
		"\1\162\1\145\1\55\1\150\1\164\1\145\1\155\2\163\1\142\1\u2019\1\145\1"+
		"\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\145\1\157\1\40\2"+
		"\145\1\116\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144\1"+
		"\164\1\141\1\145\1\40\1\145\1\u2019\1\154\1\156\1\147\1\157\1\163\1\157"+
		"\1\u2019\1\145\1\150\1\141\1\145\1\147\1\0\1\u2019\1\71\16\u2019\1\0\1"+
		"\145\1\156\1\145\1\163\1\145\1\154\1\101\1\uffff\1\40\1\151\1\145\1\144"+
		"\1\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141"+
		"\1\170\1\171\2\163\1\111\1\123\1\131\1\104\1\141\1\uffff\1\156\1\105\1"+
		"\141\1\101\1\144\1\104\2\141\1\101\1\124\1\162\1\40\1\163\1\145\1\141"+
		"\1\116\1\123\1\164\1\150\1\u2019\1\51\1\u2019\1\51\1\u2019\2\71\1\40\1"+
		"\146\1\145\1\163\1\165\2\54\1\157\1\40\1\153\1\151\1\150\1\151\1\156\1"+
		"\117\1\151\1\40\1\154\1\0\1\156\1\141\1\151\1\154\1\151\1\40\1\u2019\1"+
		"\144\1\162\1\147\1\156\1\145\1\163\1\157\1\143\1\40\1\u2019\1\40\1\162"+
		"\1\0\1\40\1\0\1\u2019\1\156\1\154\1\147\1\163\1\40\1\141\2\145\1\150\1"+
		"\145\1\157\1\162\1\40\1\u2019\1\103\1\165\1\151\1\40\1\141\1\40\1\150"+
		"\1\165\1\uffff\1\163\1\150\1\157\1\40\2\54\3\40\1\162\1\165\1\162\1\163"+
		"\1\107\1\uffff\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019\2\157\1\156"+
		"\1\162\1\156\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0\1\162\1\40"+
		"\1\156\1\u2019\1\165\1\u2019\2\71\30\u2019\1\0\1\141\1\145\1\166\2\151"+
		"\1\154\1\122\1\u2019\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1"+
		"\154\1\151\2\162\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1\101\1\156\1"+
		"\147\1\122\1\171\1\131\1\141\1\101\1\u2019\1\156\1\116\1\131\1\141\1\144"+
		"\1\164\1\151\1\107\1\104\1\172\1\151\1\51\1\uffff\2\71\2\u2019\1\164\1"+
		"\162\1\40\1\165\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145\1\40\1\156"+
		"\1\141\1\151\1\u2019\1\0\1\40\1\157\1\164\3\40\1\165\1\153\1\0\1\163\1"+
		"\0\1\171\1\163\1\u2019\1\164\1\156\1\162\1\141\1\165\3\40\1\0\1\157\1"+
		"\156\1\141\1\156\1\40\1\143\1\u2019\1\40\1\141\1\40\1\156\1\u2019\1\145"+
		"\1\40\1\151\1\40\1\145\1\144\1\162\1\153\1\0\1\162\1\40\1\144\1\147\1"+
		"\u2019\1\156\1\163\1\145\1\40\1\u2019\1\151\1\0\1\145\36\u2019\1\156\1"+
		"\40\1\145\1\141\1\154\2\40\1\0\1\u2019\1\171\1\162\1\150\1\155\1\u2019"+
		"\1\144\1\156\1\163\2\40\2\144\1\40\1\141\1\107\1\101\1\131\3\40\2\54\1"+
		"\171\1\131\1\0\1\163\2\40\1\156\1\141\1\u2019\1\162\1\40\1\101\1\143\1"+
		"\162\1\u2019\1\71\1\u2019\2\0\2\145\1\uffff\2\156\1\141\1\154\1\124\1"+
		"\163\2\40\1\156\1\141\1\0\1\156\1\157\1\156\2\40\1\u2019\1\40\1\0\1\151"+
		"\2\40\1\153\2\141\1\144\1\156\1\40\1\150\1\164\1\144\1\0\1\u2019\1\143"+
		"\1\40\3\u2019\2\40\1\145\1\0\1\u2019\1\145\1\40\1\0\1\141\1\163\36\u2019"+
		"\1\40\1\162\1\156\1\145\1\uffff\1\0\1\54\1\153\2\40\1\0\2\40\1\u2019\1"+
		"\163\1\40\1\153\1\40\1\113\1\54\1\uffff\2\54\1\u2019\1\uffff\1\145\1\171"+
		"\1\0\1\145\1\uffff\1\131\1\165\1\145\2\u2019\1\55\1\uffff\1\162\1\40\1"+
		"\144\1\40\1\156\1\141\1\111\1\143\1\40\1\156\1\u2019\1\156\1\144\1\0\1"+
		"\146\1\145\1\u2019\1\164\2\u2019\2\145\1\u2019\1\0\1\40\1\156\3\0\1\162"+
		"\1\0\1\u2019\1\156\1\145\1\51\32\u2019\1\163\1\141\1\154\1\u2019\1\0\3"+
		"\u2019\1\163\1\40\1\162\1\145\1\0\1\150\1\145\1\105\1\162\1\54\1\144\1"+
		"\54\1\151\1\40\2\u2019\1\71\1\40\1\u2019\1\40\1\156\1\116\1\150\1\40\1"+
		"\0\1\40\1\u2019\1\146\1\40\1\0\1\145\2\0\1\162\1\144\1\0\2\u2019\1\0\1"+
		"\u2019\1\40\30\u2019\1\143\1\162\1\141\6\u2019\1\151\1\163\1\123\1\u2019"+
		"\1\40\1\156\2\u2019\1\71\1\0\1\144\1\107\1\145\1\0\1\u2019\1\144\2\40"+
		"\3\0\24\u2019\1\157\1\164\1\143\3\u2019\3\0\1\162\1\u2019\1\40\1\0\1\164"+
		"\3\u2019\1\71\1\u2019\1\40\1\162\1\0\1\40\17\u2019\1\142\1\151\1\153\2"+
		"\u2019\1\145\1\uffff\1\154\1\uffff\2\u2019\1\71\1\0\1\uffff\20\u2019\1"+
		"\55\3\u2019\1\40\1\151\3\u2019\1\0\15\u2019\1\0\1\103\1\0\4\u2019\1\0"+
		"\13\u2019\1\157\1\u2019\1\0\1\u2019\1\0\11\u2019\1\154\1\u2019\1\0\7\u2019"+
		"\1\157\10\u2019\1\162\1\u2019\1\0\11\u2019\1\0\13\u2019";
	static final String DFA44_acceptS =
		"\32\uffff\1\11\1\uffff\2\22\1\23\11\uffff\1\22\73\uffff\1\2\67\uffff\1"+
		"\21\1\17\3\uffff\1\11\1\16\7\uffff\1\10\u0151\uffff\1\5\26\uffff\1\20"+
		"\2\uffff\1\14\7\uffff\1\1\u0084\uffff\1\12\31\uffff\1\5\132\uffff\1\3"+
		"\16\uffff\1\5\14\uffff\1\6\130\uffff\1\13\u00a1\uffff\1\15\122\uffff\1"+
		"\5\17\uffff\1\5\3\uffff\1\5\4\uffff\1\5\6\uffff\1\7\u00e4\uffff\1\5\1"+
		"\uffff\1\4\4\uffff\1\5\163\uffff";
	static final String DFA44_specialS =
		"\1\u00eb\16\uffff\1\77\21\uffff\1\72\1\11\1\61\1\32\43\uffff\1\64\1\22"+
		"\137\uffff\1\56\1\uffff\1\36\4\uffff\1\57\54\uffff\1\73\1\uffff\1\65\12"+
		"\uffff\1\1\52\uffff\1\u00e2\2\uffff\1\u00cb\43\uffff\1\130\41\uffff\1"+
		"\34\1\62\5\uffff\1\53\43\uffff\1\u00d0\1\140\2\uffff\1\127\6\uffff\1\160"+
		"\11\uffff\1\146\14\uffff\1\26\45\uffff\1\u0090\1\5\1\uffff\1\164\22\uffff"+
		"\1\u0086\2\uffff\1\172\1\174\15\uffff\1\u00e8\15\uffff\1\166\2\uffff\1"+
		"\u00ce\37\uffff\1\111\15\uffff\1\50\6\uffff\1\151\1\uffff\1\121\5\uffff"+
		"\1\132\3\uffff\1\116\14\uffff\1\u00d5\4\uffff\1\16\6\uffff\1\12\2\uffff"+
		"\1\24\5\uffff\1\137\2\uffff\1\10\3\uffff\1\43\6\uffff\1\37\6\uffff\1\52"+
		"\1\uffff\1\u00e4\5\uffff\1\u008f\17\uffff\1\u00e1\1\u008e\10\uffff\1\u00cd"+
		"\10\uffff\1\u00c8\1\uffff\1\173\31\uffff\1\76\36\uffff\1\u00d9\1\uffff"+
		"\1\u008d\5\uffff\1\70\1\75\5\uffff\1\147\2\uffff\1\2\1\154\1\105\1\uffff"+
		"\1\u008c\1\103\1\u0091\1\123\4\uffff\1\134\7\uffff\1\155\1\175\3\uffff"+
		"\1\152\1\uffff\1\144\6\uffff\1\0\2\uffff\1\106\1\25\1\27\6\uffff\1\21"+
		"\5\uffff\1\54\7\uffff\1\u00dc\2\uffff\1\u00e0\1\uffff\1\u0092\1\uffff"+
		"\1\u00d3\1\uffff\1\u00e5\34\uffff\1\u0093\7\uffff\1\u00f0\14\uffff\1\171"+
		"\16\uffff\1\4\17\uffff\1\u0087\1\u008b\4\uffff\1\63\1\uffff\1\55\5\uffff"+
		"\1\u00d7\3\uffff\1\74\1\u0094\1\71\2\uffff\1\31\1\110\1\112\2\uffff\1"+
		"\u0095\1\13\1\u0096\2\uffff\1\117\5\uffff\1\60\1\113\1\156\1\u0097\4\uffff"+
		"\1\u0088\2\uffff\1\u0089\1\uffff\1\30\1\uffff\1\u00de\1\uffff\1\145\1"+
		"\uffff\1\44\4\uffff\1\u0098\1\uffff\1\51\2\uffff\1\u0083\3\uffff\1\u00dd"+
		"\1\u00e3\1\uffff\1\u0099\40\uffff\1\u00cc\3\uffff\1\u00d2\1\uffff\1\u009a"+
		"\1\u00f1\4\uffff\1\u00ee\3\uffff\1\176\1\u0082\2\uffff\1\170\4\uffff\1"+
		"\23\1\163\1\133\4\uffff\1\u009b\1\165\4\uffff\1\7\1\uffff\1\141\6\uffff"+
		"\1\u009c\1\u009d\11\uffff\1\u00db\1\6\2\uffff\1\u009e\3\uffff\1\104\1"+
		"\102\1\124\1\136\1\u009f\1\uffff\1\131\1\122\5\uffff\1\150\3\uffff\1\u00a0"+
		"\1\u00d4\1\uffff\1\46\1\45\1\u00d1\1\u00cf\1\47\1\41\1\uffff\1\u00a1\1"+
		"\u00e9\1\uffff\1\u00d8\1\u00a2\34\uffff\1\33\3\uffff\1\u00d6\4\uffff\1"+
		"\u00a3\2\uffff\1\157\1\u0085\1\u00a4\1\u008a\1\115\1\u00ed\1\uffff\1\167"+
		"\1\uffff\1\125\11\uffff\1\u00a5\12\uffff\1\40\1\uffff\1\u00da\4\uffff"+
		"\1\101\1\uffff\1\100\2\uffff\1\u00a6\2\uffff\1\135\1\uffff\1\177\1\u0081"+
		"\2\uffff\1\u00df\1\u00a7\1\20\1\uffff\1\u00a8\1\u00a9\1\u00aa\1\uffff"+
		"\1\u00ab\1\u00e7\41\uffff\1\u00ac\4\uffff\1\u00ca\2\uffff\1\u00ad\10\uffff"+
		"\1\162\3\uffff\1\42\1\u00ea\1\66\3\uffff\1\143\1\u00ae\1\67\1\142\1\uffff"+
		"\1\120\1\u00af\1\uffff\1\u00b0\1\u00b1\2\uffff\1\u00b2\1\u00c9\1\u0084"+
		"\1\u00b3\1\u00e6\1\35\36\uffff\1\u00f3\1\u00f2\1\u00ef\3\uffff\1\3\1\161"+
		"\4\uffff\1\u00b4\3\uffff\1\u00b5\1\114\1\uffff\1\15\1\17\1\u00b6\1\u00b7"+
		"\1\u00b8\32\uffff\1\u00b9\1\u00ba\1\u00bb\3\uffff\1\u00bc\5\uffff\1\u00ec"+
		"\1\126\1\uffff\1\u00bd\1\153\33\uffff\1\u00be\1\uffff\1\107\23\uffff\1"+
		"\u0080\4\uffff\1\u00bf\15\uffff\1\u00c0\1\uffff\1\u00c1\2\uffff\1\14\1"+
		"\uffff\1\u00c2\15\uffff\1\u00c3\1\uffff\1\u00c4\13\uffff\1\u00c5\22\uffff"+
		"\1\u00c6\11\uffff\1\u00c7\13\uffff}>";
	static final String[] DFA44_transitionS = {
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
			"\1\163\3\uffff\1\164\27\uffff\1\156\3\uffff\1\157\2\uffff\1\160\6\uffff"+
			"\1\161\5\uffff\1\162",
			"\1\u0083\16\uffff\1\u0080\4\uffff\1\u0082\1\uffff\1\u0081\11\uffff\1"+
			"\165\1\uffff\1\166\1\uffff\1\167\2\uffff\1\170\1\171\1\uffff\1\172\3"+
			"\uffff\1\173\1\174\3\uffff\1\175\1\176\1\uffff\1\177",
			"\1\u0087\2\uffff\1\u008c\6\uffff\1\u0088\5\uffff\1\u008a\22\uffff\1"+
			"\u008b\1\u0084\5\uffff\1\u0085\2\uffff\1\u0086\2\uffff\1\u0089",
			"\1\u0090\3\uffff\1\u008f\37\uffff\1\u008e\3\uffff\1\u008d",
			"\1\u0095\11\uffff\1\u0094\25\uffff\1\u0091\2\uffff\1\u0092\1\u0093",
			"\1\u0096",
			"\1\u0097",
			"\2\u009c\2\uffff\1\u009c\22\uffff\1\u009c\5\uffff\2\u009a\4\uffff\2"+
			"\u009a\2\uffff\12\u0099\2\u009a\5\uffff\14\u009b\1\u0098\15\u009b\4\uffff"+
			"\1\u009a\1\uffff\32\u009a\u1f9e\uffff\1\u009a",
			"\3\50\3\uffff\1\50\1\u009e\1\50\1\uffff\12\u009f\1\u00a0\1\50\5\uffff"+
			"\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"",
			"\3\50\3\uffff\2\50\1\u00a3\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"",
			"",
			"",
			"\1\u00a5\1\uffff\1\u00a6\4\uffff\1\u00a4",
			"\1\u00a7\4\uffff\1\u00a8",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa\62\uffff\1\u00a9",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa\122\uffff\1\u00ab",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b3\3\uffff\1\u00b2",
			"\1\u00b4\25\uffff\1\u00b5",
			"\1\u00b6",
			"\1\u00b7\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0\2\uffff\1\u00c1\7\uffff\1\u00c2\5\uffff\1\u00c3",
			"\1\u00c4",
			"\1\u00c5\15\uffff\1\u00c6\5\uffff\1\u00c7",
			"\1\u00c8\1\u00c9\1\uffff\1\u00ca\2\uffff\1\u00cb\1\u00cc",
			"\1\u00cd\7\uffff\1\u00ce\13\uffff\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2\4\uffff\1\u00d3\3\uffff\1\u00d4\3\uffff\1\u00d5",
			"\1\u00d6",
			"\1\u00d7\3\uffff\1\u00d8\5\uffff\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc\10\uffff\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0\10\uffff\1\u00e1\1\uffff\1\u00e2",
			"\1\u00e3\4\uffff\1\u00e4",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\1\u00e5\14\uffff\1\u00e6",
			"\1\u00e7\10\uffff\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb\3\uffff\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1\5\uffff\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5\3\uffff\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe\14\uffff\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102\4\uffff\1\u0103\3\uffff\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109\1\uffff\1\u010a",
			"\1\u010b\1\uffff\1\u010c\6\uffff\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110\2\uffff\1\u0111\1\u0112\1\uffff\1\u0113\2\uffff\1\u0114",
			"\1\u0115\4\uffff\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119\17\uffff\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120\2\uffff\1\u0121\1\u0122\6\uffff\1\u0123",
			"\1\u0124\6\uffff\1\u0125",
			"\1\u0126\22\uffff\1\u0127",
			"\1\u0128\3\uffff\1\u0129",
			"\1\u012a\11\uffff\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e\7\uffff\1\u012f",
			"\1\u0130",
			"\1\u0132\4\uffff\1\u0131",
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
			"\1\u0143",
			"\1\u0144",
			"\1\u0148\4\uffff\1\u0145\2\uffff\1\u0146\6\uffff\1\u0147",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u0151\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\10\u0150\1\u014f\21\u0150\u1f9e"+
			"\uffff\1\u0150",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\10\uffff\1\u0156\6\uffff\12"+
			"\u0154",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0157\4\uffff\2\u009a\1"+
			"\uffff\1\u0153\2\uffff\2\u009a\1\u0157\13\uffff\2\u009a\3\uffff\1\u0157"+
			"\37\uffff\1\u009a\1\uffff\32\u009a\u1f9e\uffff\1\u009a",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u0151\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\32\u0150\u1f9e\uffff\1\u0150",
			"",
			"",
			"\12\u0158",
			"\3\50\3\uffff\1\50\1\u009e\1\50\1\uffff\12\u009f\1\u00a0\1\50\5\uffff"+
			"\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\12\u0159",
			"",
			"",
			"\3\50\3\uffff\2\50\1\u00a3\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\144",
			"\1\u0163",
			"\1\u0165\7\uffff\1\u0164",
			"\1\u0166\20\uffff\1\u0167",
			"\1\u0168",
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
			"\1\u0173\15\uffff\1\u0174",
			"\1\u0175\12\uffff\1\u0176\2\uffff\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f\25\uffff\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186\22\uffff\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c\3\uffff\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192\5\uffff\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa\113\uffff\1\u0198",
			"\1\u0199",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e\5\uffff\1\u019f",
			"\1\u01a0",
			"\1\u01a1\5\uffff\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\144",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae\27\uffff\1\u01af",
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
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u01d4",
			"\1\u01d5",
			"\1\144",
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
			"\1\u01e6\5\uffff\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\1\u01ee\7\uffff\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2\1\u01f3",
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
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u0151\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\22\u0150\1\u020f\7\u0150\u1f9e"+
			"\uffff\1\u0150",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u0151\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\32\u0150\u1f9e\uffff\1\u0150",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\5\uffff\2\u0210\4\uffff\2"+
			"\u0210\2\uffff\12\u0211\2\u0210\5\uffff\32\u0212\4\uffff\1\u0210\1\uffff"+
			"\32\u0210\u1f9e\uffff\1\u0210",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\10\uffff\1\u0156\6\uffff\12"+
			"\u0214",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\5\uffff\2\u0210\1\uffff\1"+
			"\u009c\2\uffff\2\u0210\2\uffff\12\u0211\2\u0210\5\uffff\32\u0212\4\uffff"+
			"\1\u0210\1\uffff\32\u0210\u1f9e\uffff\1\u0210",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153",
			"\1\u0215\2\uffff\12\u0158",
			"\2\u0216\2\uffff\1\u0216\22\uffff\1\u0216\17\uffff\12\u0159",
			"\1\u0217\3\uffff\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\144",
			"\1\u0221",
			"\1\u0222\3\uffff\1\u0223",
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
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"\1\144\103\uffff\1\u0245\10\uffff\1\u0246",
			"\1\u01fc",
			"\1\u0247",
			"\1\u0248",
			"\1\144",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\144",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\144",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\1\u025c\17\uffff\1\u025b",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264",
			"\1\144",
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
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\4\uffff\2\50\2\uffff\1\50\1\u028c\12\50\5\uffff\1\50\1\u028d\1"+
			"\u028e\1\50\1\u028f\1\u0290\1\u0291\1\50\1\u0292\1\50\1\u0293\1\u0294"+
			"\1\u028b\1\u0295\3\50\1\u0296\1\u0297\1\u0298\2\50\1\u0299\3\50\4\uffff"+
			"\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u029a\7\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2",
			"\2\u02a3\2\uffff\1\u02a3\22\uffff\1\u02a3",
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
			"\1\144",
			"\1\u02ae",
			"\1\u02af",
			"\1\144",
			"\1\144",
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
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bc",
			"\1\144\17\uffff\1\u02bd",
			"\1\u02be",
			"\1\u02bf",
			"",
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
			"\1\144",
			"\1\u02ca",
			"\1\u02cb",
			"\1\144\107\uffff\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u0151\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\2\u0150\1\u02d1\27\u0150\u1f9e"+
			"\uffff\1\u0150",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d2\4\uffff\2\u0210\1"+
			"\uffff\1\u0153\2\uffff\2\u0210\1\u02d2\13\uffff\2\u0210\3\uffff\1\u02d2"+
			"\37\uffff\1\u0210\1\uffff\32\u0210\u1f9e\uffff\1\u0210",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153\6\uffff\12"+
			"\u0211",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\32\u02d3\u1f9e\uffff\1\u02d3",
			"",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\10\uffff\1\u02d5\6\uffff\12"+
			"\u02d6",
			"\12\u02d7",
			"",
			"\1\u02d8",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"",
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
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
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
			"\1\u02f6",
			"\1\u02f7",
			"\1\144",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u02ff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"\1\u0304",
			"\1\u0305",
			"\1\144",
			"\1\u0306",
			"\1\u0307",
			"\1\u0308",
			"\1\144",
			"\1\u0309",
			"\1\u030a",
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
			"\1\144\122\uffff\1\u0315",
			"\1\u0316",
			"\1\u0317",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u0319",
			"\1\144",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\144",
			"\1\u0320",
			"\1\u0321",
			"\1\144\104\uffff\1\u0322",
			"\1\u0323",
			"\1\u02a3",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\144",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\144",
			"\1\u032d",
			"\1\u032e",
			"\1\u032f",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\144",
			"\1\u0333",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\1\u0338",
			"\1\144\122\uffff\1\u0339",
			"\1\u033a",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0341\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\10\uffff\1\50\6\uffff\3\50\1\u0342"+
			"\1\50\1\u0343\4\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0345\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\16\50\1\u0344\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0346\3\50\1\u0347\2\50\1\u0348\5\50\1\u0349\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u034a\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u034b\2\50\1\u034c\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u034d\11\50\1\u034e\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u034f\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0350\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0351"+
			"\15\50\1\u0352\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0353\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0354\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u0355\6\50\1\u0356\1\u0357\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0358\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0359\2\50\1\u035a\1\u035b\21\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"",
			"\1\144",
			"\1\u0364",
			"\1\u0365",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\1\u036b",
			"\1\144",
			"\1\u036c",
			"\1\144",
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
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\1\u037e",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"\1\u0383",
			"\1\u0384",
			"\1\144",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\1\u038b",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u038c\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\32\u0150\u1f9e\uffff\1\u0150",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\32\u02d3\u1f9e\uffff\1\u02d3",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153",
			"\2\u038d\2\uffff\1\u038d\22\uffff\1\u038d\5\uffff\3\50\3\uffff\3\50"+
			"\1\uffff\12\u038e\2\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\10\uffff\1\u0156\6\uffff\12"+
			"\u02d6",
			"\1\u038f\2\uffff\12\u02d7",
			"\1\u021e",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"\1\u0393",
			"\1\u0394",
			"\1\u0394",
			"\1\u0395",
			"\1\u021e",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\144",
			"\1\u039d",
			"\1\uffff",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u03a4",
			"\1\u03a5",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\144\122\uffff\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u03ad",
			"\1\uffff",
			"\1\144",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u03af",
			"\1\u03b0",
			"\1\u03b1",
			"\1\u03b2",
			"\1\144",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u03bb",
			"\1\u03bc",
			"\1\u03bd",
			"\1\144",
			"\1\u03be",
			"\1\144",
			"\1\u03bf",
			"\1\u03c0",
			"",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\1\144",
			"\1\u0394",
			"\1\u0394",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\1\u03c7",
			"\1\u03c8",
			"",
			"\1\144",
			"\1\u03c9",
			"\1\u03ca",
			"\1\u03cb",
			"\1\u03cc",
			"\1\u03cd",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u03ce\3\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u03d0",
			"\1\u03d1",
			"\1\u03d2",
			"\1\u03d3",
			"\1\u03d4",
			"",
			"\1\u03d5",
			"\1\144",
			"\1\u03d6",
			"\1\u03d7",
			"\1\144",
			"\1\u03d8",
			"\1\uffff",
			"\1\u03d9",
			"\1\144",
			"\1\u03da",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u03dc",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u03de\4\50\1\u03dd\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u03df\10\uffff\1\50\6\uffff\12\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u03e0\10\uffff\1\50\6\uffff\12\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u03e1\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\1\u03e2\1\50\4\uffff\2\50\2"+
			"\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u03e3\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u03e4\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u03e5\10\50\1\u03e6\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03e7\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u03e8\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u03e9\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u03ea"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03eb\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u03ec\5\50\1\u03ed\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u03ee\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u03ef\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\50"+
			"\1\u03f0\30\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u03f1\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\25"+
			"\50\1\u03f2\4\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u03f3\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u03f4\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u03f5"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u03f6\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u03f7\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u03f8\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u03f9\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03fa\10\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u03fb",
			"\1\u03fc",
			"\1\u03fd",
			"\1\u03fe",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0403",
			"\1\u0404",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\1\u040a",
			"\1\u040b",
			"\1\u040c\3\uffff\1\u040d",
			"\1\u040e",
			"\1\u040f",
			"\1\144",
			"\1\u0394",
			"\1\u0410",
			"\1\u0411",
			"\1\u0412",
			"\1\u0413",
			"\1\u0394",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"\1\u0417",
			"\1\u0418",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u041d",
			"\1\u041e",
			"\1\u041f",
			"\1\u0420",
			"\1\u0421",
			"\1\u0422",
			"\1\u0423",
			"\1\u0424",
			"\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0428\10\uffff\1\u0153",
			"",
			"\12\u0429",
			"\12\u042a",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u042d",
			"\1\u042e",
			"\2\u042f\2\uffff\1\u042f\22\uffff\1\u042f",
			"\1\u0430",
			"\1\144",
			"\1\u0431",
			"\1\144",
			"\1\u0432",
			"\1\u0433",
			"\1\u0434",
			"\1\u0435",
			"\1\u0436",
			"\1\144",
			"\1\u0437",
			"\1\u0438",
			"\1\u0439",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\144",
			"\1\u043b",
			"\1\u043c",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\u043d",
			"\1\u043e",
			"\1\uffff",
			"\1\144\122\uffff\1\u043f",
			"\1\uffff",
			"\1\u0440",
			"\1\u0441",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0443",
			"\1\u0444",
			"\1\u0445",
			"\1\u0446",
			"\1\u0447",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\u0448",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"\1\144",
			"\1\u044c",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u044d",
			"\1\144",
			"\1\u044e",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0450",
			"\1\u0327",
			"\1\u0451",
			"\1\144",
			"\1\u0452",
			"\1\u0453",
			"\1\u0454",
			"\1\u0455",
			"\1\uffff",
			"\1\u0456",
			"\1\144",
			"\1\u0457",
			"\1\u0458",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u045e",
			"\1\uffff",
			"\1\u045f",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u0460\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0461\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\10\50\1\u0462\21\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\10\50\1\u0463\21\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u0464\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0465\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\37\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0466\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u0467\15\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u0468\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0469\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u046a\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u046b\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u046c\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u046d\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u046e\15\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u046f\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0470\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0471\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0472\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0473\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0474\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0475"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0476\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0477\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0478\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0479\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u047b\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u047c\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u047d\25\50\u1f9e\uffff\1\50",
			"\1\u047e",
			"\1\144",
			"\1\u047f",
			"\1\u0480",
			"\1\u0481",
			"\1\144",
			"\1\u0482",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0484",
			"\1\u0485",
			"\1\u0486",
			"\1\u0487",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0489",
			"\1\u048a",
			"\1\u048b",
			"\1\144",
			"\1\144",
			"\1\u048c",
			"\1\u048d",
			"\1\144",
			"\1\u048e",
			"\1\u048f",
			"\1\u0490",
			"\1\u0491",
			"\1\144",
			"\1\144",
			"\1\u0492",
			"\1\u0394",
			"\1\u0394",
			"\1\u0493",
			"\1\u0494",
			"\1\uffff",
			"\1\144\122\uffff\1\u0495",
			"\1\u0496",
			"\1\u0334",
			"\1\u0497",
			"\1\u0498",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u049a",
			"\1\u049b",
			"\1\u049c",
			"\1\u049d",
			"\1\u049e",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\5\uffff\2\u0210\4\uffff\2"+
			"\u0210\2\uffff\12\u0211\2\u0210\5\uffff\1\u0212\1\u04a0\1\u0212\1\u049f"+
			"\26\u0212\4\uffff\1\u0210\1\uffff\32\u0210\u1f9e\uffff\1\u0210",
			"\12\u04a1",
			"\3\50\3\uffff\3\50\1\uffff\12\u042a\2\50\5\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\uffff",
			"\1\u04a3",
			"\1\u04a4",
			"",
			"\1\u04a5",
			"\1\u04a6",
			"\1\u04a7",
			"\1\u04a8",
			"\1\u04a9",
			"\1\u04aa",
			"\1\144",
			"\1\144",
			"\1\u04ab",
			"\1\u04ac",
			"\1\uffff",
			"\1\u04ad",
			"\1\u04ae",
			"\1\u04af",
			"\1\144",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\uffff",
			"\1\u04b1",
			"\1\144",
			"\1\144",
			"\1\u04b2",
			"\1\u04b3",
			"\1\u04b4",
			"\1\u04b5",
			"\1\u04b6",
			"\1\144",
			"\1\u04b7",
			"\1\u04b8",
			"\1\u04b9",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u04bb",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4"+
			"\50\1\u04bc\15\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\144",
			"\1\u04c0",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u04c2",
			"\1\144",
			"\1\uffff",
			"\1\u04c3",
			"\1\u04c4",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\2"+
			"\50\1\u04c5\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04c6"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u04c7\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u04c8\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u04c9\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\17\50\1\u04ca\12\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04cb"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\50"+
			"\1\u04cc\30\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04cd\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u04ce\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u04cf\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u04d0\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u04d1\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\1"+
			"\50\1\u04d2\1\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04d3"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04d4\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u04d5\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04d6\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\1\u04d7\1\50\4\uffff\2\50\2"+
			"\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04d8"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u04d9\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\7\50\1\u04da\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u04db\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04dc\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u04dd\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u04de\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04df\25\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\5\uffff\2\50\1\u04e3\3\uffff\3\50"+
			"\1\uffff\14\50\5\uffff\1\u04e0\1\u04e2\15\50\1\u04e1\12\50\4\uffff\1"+
			"\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04e5\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04e6\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7"+
			"\50\1\u04e7\22\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u04e8",
			"\1\u04e9",
			"\1\u04ea",
			"",
			"\1\uffff",
			"\1\u0394",
			"\1\u04eb",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\144",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u04ed",
			"\1\144",
			"\1\u04ee",
			"\1\u049b",
			"\1\u04ef",
			"\1\u0394",
			"",
			"\1\u0394",
			"\1\u0394",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"",
			"\1\u04f0",
			"\1\u04f1",
			"\1\uffff",
			"\1\u04f2",
			"",
			"\1\u04f3",
			"\1\u04f4",
			"\1\u04f5",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\16\u02d3\1\u04f6\13\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\10\u02d3\1\u04f7\21\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\1\u04f8",
			"",
			"\1\u04f9",
			"\1\144",
			"\1\u04fa",
			"\1\144",
			"\1\u04fb",
			"\1\u04fc",
			"\1\u04fd",
			"\1\u04fe",
			"\1\144",
			"\1\u04ff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0501",
			"\1\u0502",
			"\1\uffff",
			"\1\u0503",
			"\1\u0504",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0506",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0509",
			"\1\u050a",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\144",
			"\1\u050c",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u050d",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u050f",
			"\1\u0510",
			"\2\50\2\uffff\1\50\22\uffff\1\u0511\10\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0512\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u0513\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u0514\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0515\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0516\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u0517\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0518\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0519\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u051a\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\1"+
			"\50\1\u051b\1\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u051c\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\2\50\1\u051d\27\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u051e\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u051f\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0520\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0521\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\37\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0522\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u0523\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0524"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u0525\7\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0526\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0527"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\27"+
			"\50\1\u0528\2\50\u1f9e\uffff\1\50",
			"\1\u0529",
			"\1\u052a",
			"\1\u052b",
			"\2\50\4\uffff\2\50\2\uffff\14\50\5\uffff\14\50\1\u052c\15\50\4\uffff"+
			"\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\1\u052d\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u052e"+
			"\31\50\u1f9e\uffff\1\50",
			"\1\u052f",
			"\1\144",
			"\1\u0530",
			"\1\u0531",
			"\1\uffff",
			"\1\u0532",
			"\1\u0533",
			"\1\u0534",
			"\1\u0535",
			"\1\u0394",
			"\1\u0536",
			"\1\u0394",
			"\1\u0537",
			"\1\144",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\6\u02d3\1\u0538\23\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\23\u02d3\1\u0539\6\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\12\u053a",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u053c",
			"\1\u053d",
			"\1\u053e",
			"\1\144",
			"\1\uffff",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0540",
			"\1\144",
			"\1\uffff",
			"\1\u0541",
			"\1\uffff",
			"\1\uffff",
			"\1\u0542",
			"\1\u0543",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\1\50\1\u0548\1\50\1\u0547\26\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u0549\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u054a\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u054b\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u054c\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u054d\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u054e\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u054f\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\2\50\1\u0550\27\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0551\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0552\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0553\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\21\50\1\u0554\10\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0555\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0556\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0557\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u0558\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0559\1\50\4\uffff\2\50\1\uffff\1\u047a"+
			"\2\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1"+
			"\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u055a\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u055b",
			"\1\u055c",
			"\1\u055d",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u055e\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u055f\7\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0560\21\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0564",
			"\1\u0565",
			"\1\u0566",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u0568",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0569\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\22\u02d3\1\u056a\7\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\2\u02d3\1\u056b\27\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\12\u056c",
			"\1\uffff",
			"\1\u056d",
			"\1\u056e",
			"\1\u056f",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u0571",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0572\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0573\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0574\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0575"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0576\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0577\1\50\4\uffff\2\50\1\uffff\1\u047a"+
			"\2\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1"+
			"\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0578"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u0579\3\50\1\u057a\3\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u057b\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u057c"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u057d\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u057e\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u057f\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0580\26\50\u1f9e\uffff\1\50",
			"\1\u0581",
			"\1\u0582",
			"\1\u0583",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u03dd\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u0584\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0585\10\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0586",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u0587",
			"\1\uffff",
			"\1\u0588",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u058a\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\32\u02d3\u1f9e\uffff\1\u02d3",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\7\u02d3\1\u058b\22\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\12\u058c",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\1\u058e",
			"\1\u058f",
			"\1\uffff",
			"\1\144",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0590\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0591\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0592\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u0593\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0594"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u0595\17\50\1\u0596\7\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0597\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0598\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0599\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u059a\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u059b\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u059c\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u059d\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u059e",
			"\1\u059f",
			"\1\u05a0",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05a1\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05a2\25\50\u1f9e\uffff\1\50",
			"\1\u05a3",
			"",
			"\1\u05a4",
			"",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u05a5\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\4\u02d3\1\u05a6\25\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\12\u05a7",
			"\1\uffff",
			"",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05a9\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u05aa\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05ab\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05ac\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05ad\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05ae\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u05af\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05b0\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05b1\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05b2\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05b3\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05b4\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05b5"+
			"\31\50\u1f9e\uffff\1\50",
			"\1\50\4\uffff\2\50\1\u04e3\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u05b7",
			"\1\50\4\uffff\2\50\1\u04e3\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05b9\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05ba\26\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u05bb",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u0153\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\22\u02d3\1\u05bc\7\u02d3\u1f9e"+
			"\uffff\1\u02d3",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05be\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05bf\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u05c0\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05c1\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05c2\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05c3\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05c4\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05c5\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05c6\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05c7"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05c8\6\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u05c9",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u05ca\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d3\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d2\7\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u02d3\1"+
			"\uffff\1\u05cc\2\uffff\2\u02d3\1\u02d4\13\uffff\2\u02d3\3\uffff\1\u02d4"+
			"\1\uffff\32\u02d3\4\uffff\1\u02d3\1\uffff\32\u02d3\u1f9e\uffff\1\u02d3",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05ce\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4"+
			"\50\1\u05cf\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\1\50\1\u05d0\30\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05d1\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u05d2\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05d3\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05d4\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05d5\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u05d6\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u05d7",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u05d8\23\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u05da\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05db"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05dc\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u05dd\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05de\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05df"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\3\50\1\u05e0\26\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\1\u05e1",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05e2\25\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05e3\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u05e4\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05e5\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u05e6\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05e7"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05e8\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u05e9\5\50\u1f9e\uffff\1\50",
			"\1\u05ea",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05eb\10\50\u1f9e\uffff\1\50",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05ed\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05ee\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05ef\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05f0\27\50\u1f9e\uffff\1\50",
			"\1\u05f1",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05f2\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05f3\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05f4\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u05f5\17\50\u1f9e\uffff\1\50",
			"\1\50\4\uffff\2\50\1\u04e3\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05f7\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05f8\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u05f9\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05fa\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\23\50\1\u05fb\6\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05fc\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u05fd\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u05fe\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05ff\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0600\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0601\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047a\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50"
	};

	static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
	static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
	static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
	static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
	static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
	static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
	static final short[][] DFA44_transition;

	static {
		int numStates = DFA44_transitionS.length;
		DFA44_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
		}
	}

	class DFA44 extends DFA {

		public DFA44(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 44;
			this.eot = DFA44_eot;
			this.eof = DFA44_eof;
			this.min = DFA44_min;
			this.max = DFA44_max;
			this.accept = DFA44_accept;
			this.special = DFA44_special;
			this.transition = DFA44_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JUNIOR_CLASS | BREED_NAME | SPECIAL_SUFFIX | BREED_NAME_SUFFIX | GROUP_RING | STANDALONE_COMMENT | BREED_COUNT | JUDGE_NAME | WS | RING_TITLE | PHONE_NUMBER | TIME | DATE | ELLIPSIS | INT | PARENTHETICAL | PARENTHETICAL_INT | COMMENT | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA44_796 = input.LA(1);
						 
						int index44_796 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_796==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_796);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA44_234 = input.LA(1);
						 
						int index44_234 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_234==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_234);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA44_762 = input.LA(1);
						 
						int index44_762 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_762==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_762);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA44_1333 = input.LA(1);
						 
						int index44_1333 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1333=='s') ) {s = 466;}
						else if ( ((LA44_1333 >= '\t' && LA44_1333 <= '\n')||LA44_1333=='\r'||LA44_1333==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1333=='(') ) {s = 467;}
						else if ( (LA44_1333=='!'||(LA44_1333 >= '&' && LA44_1333 <= '\'')||(LA44_1333 >= ',' && LA44_1333 <= '.')||(LA44_1333 >= '0' && LA44_1333 <= ';')||LA44_1333=='?'||(LA44_1333 >= 'A' && LA44_1333 <= 'Z')||LA44_1333=='_'||(LA44_1333 >= 'a' && LA44_1333 <= 'r')||(LA44_1333 >= 't' && LA44_1333 <= 'z')||LA44_1333=='\u2019') ) {s = 40;}
						else s = 1383;
						 
						input.seek(index44_1333);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA44_896 = input.LA(1);
						 
						int index44_896 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_896=='s') ) {s = 466;}
						else if ( ((LA44_896 >= '\t' && LA44_896 <= '\n')||LA44_896=='\r'||LA44_896==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_896=='(') ) {s = 467;}
						else if ( (LA44_896=='!'||(LA44_896 >= '&' && LA44_896 <= '\'')||(LA44_896 >= ',' && LA44_896 <= '.')||(LA44_896 >= '0' && LA44_896 <= ';')||LA44_896=='?'||(LA44_896 >= 'A' && LA44_896 <= 'Z')||LA44_896=='_'||(LA44_896 >= 'a' && LA44_896 <= 'r')||(LA44_896 >= 't' && LA44_896 <= 'z')||LA44_896=='\u2019') ) {s = 40;}
						else s = 1052;
						 
						input.seek(index44_896);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA44_466 = input.LA(1);
						 
						int index44_466 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_466 >= '\t' && LA44_466 <= '\n')||LA44_466=='\r'||LA44_466==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_466=='(') ) {s = 467;}
						else if ( (LA44_466=='!'||(LA44_466 >= '&' && LA44_466 <= '\'')||(LA44_466 >= ',' && LA44_466 <= '.')||(LA44_466 >= '0' && LA44_466 <= ';')||LA44_466=='?'||(LA44_466 >= 'A' && LA44_466 <= 'Z')||LA44_466=='_'||(LA44_466 >= 'a' && LA44_466 <= 'z')||LA44_466=='\u2019') ) {s = 40;}
						else s = 650;
						 
						input.seek(index44_466);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA44_1079 = input.LA(1);
						 
						int index44_1079 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1079==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1079);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA44_1058 = input.LA(1);
						 
						int index44_1058 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1058=='s') ) {s = 466;}
						else if ( ((LA44_1058 >= '\t' && LA44_1058 <= '\n')||LA44_1058=='\r'||LA44_1058==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1058=='(') ) {s = 467;}
						else if ( (LA44_1058=='!'||(LA44_1058 >= '&' && LA44_1058 <= '\'')||(LA44_1058 >= ',' && LA44_1058 <= '.')||(LA44_1058 >= '0' && LA44_1058 <= ';')||LA44_1058=='?'||(LA44_1058 >= 'A' && LA44_1058 <= 'Z')||LA44_1058=='_'||(LA44_1058 >= 'a' && LA44_1058 <= 'r')||(LA44_1058 >= 't' && LA44_1058 <= 'z')||LA44_1058=='\u2019') ) {s = 40;}
						else s = 1177;
						 
						input.seek(index44_1058);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA44_624 = input.LA(1);
						 
						int index44_624 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_624==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_624);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA44_34 = input.LA(1);
						 
						int index44_34 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_34=='s') ) {s = 171;}
						else if ( ((LA44_34 >= '\t' && LA44_34 <= '\n')||LA44_34=='\r'||LA44_34==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_34);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA44_612 = input.LA(1);
						 
						int index44_612 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_612==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_612);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA44_941 = input.LA(1);
						 
						int index44_941 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_941==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_941=='s') ) {s = 1087;}
						else s = 40;
						 
						input.seek(index44_941);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA44_1467 = input.LA(1);
						 
						int index44_1467 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1467=='s') ) {s = 466;}
						else if ( ((LA44_1467 >= '\t' && LA44_1467 <= '\n')||LA44_1467=='\r'||LA44_1467==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1467=='(') ) {s = 467;}
						else if ( (LA44_1467=='!'||(LA44_1467 >= '&' && LA44_1467 <= '\'')||(LA44_1467 >= ',' && LA44_1467 <= '.')||(LA44_1467 >= '0' && LA44_1467 <= ';')||LA44_1467=='?'||(LA44_1467 >= 'A' && LA44_1467 <= 'Z')||LA44_1467=='_'||(LA44_1467 >= 'a' && LA44_1467 <= 'r')||(LA44_1467 >= 't' && LA44_1467 <= 'z')||LA44_1467=='\u2019') ) {s = 40;}
						else s = 1483;
						 
						input.seek(index44_1467);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA44_1346 = input.LA(1);
						 
						int index44_1346 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1346==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1346);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA44_605 = input.LA(1);
						 
						int index44_605 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_605==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_605);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA44_1347 = input.LA(1);
						 
						int index44_1347 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1347==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1347);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA44_1211 = input.LA(1);
						 
						int index44_1211 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1211==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1211);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA44_808 = input.LA(1);
						 
						int index44_808 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_808==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_808);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA44_73 = input.LA(1);
						 
						int index44_73 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_73 >= '\t' && LA44_73 <= '\n')||LA44_73=='\r'||LA44_73==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_73);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA44_1045 = input.LA(1);
						 
						int index44_1045 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1045==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1045);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA44_615 = input.LA(1);
						 
						int index44_615 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_615==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_615=='e') ) {s = 802;}
						else s = 40;
						 
						input.seek(index44_615);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA44_800 = input.LA(1);
						 
						int index44_800 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_800==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_800);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA44_427 = input.LA(1);
						 
						int index44_427 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_427==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_427);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA44_801 = input.LA(1);
						 
						int index44_801 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_801==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_801);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA44_964 = input.LA(1);
						 
						int index44_964 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_964==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_964);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA44_935 = input.LA(1);
						 
						int index44_935 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_935==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_935);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA44_36 = input.LA(1);
						 
						int index44_36 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_36 >= '\t' && LA44_36 <= '\n')||LA44_36=='\r'||LA44_36==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_36);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA44_1146 = input.LA(1);
						 
						int index44_1146 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_1146 >= '\t' && LA44_1146 <= '\n')||LA44_1146=='\r'||LA44_1146==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1146=='A') ) {s = 1248;}
						else if ( (LA44_1146=='P') ) {s = 1249;}
						else if ( (LA44_1146=='B') ) {s = 1250;}
						else if ( (LA44_1146=='(') ) {s = 1251;}
						else if ( ((LA44_1146 >= '&' && LA44_1146 <= '\'')||(LA44_1146 >= ',' && LA44_1146 <= '.')||(LA44_1146 >= '0' && LA44_1146 <= ';')||(LA44_1146 >= 'C' && LA44_1146 <= 'O')||(LA44_1146 >= 'Q' && LA44_1146 <= 'Z')||LA44_1146=='_'||(LA44_1146 >= 'a' && LA44_1146 <= 'z')||LA44_1146=='\u2019') ) {s = 40;}
						else s = 1252;
						 
						input.seek(index44_1146);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA44_350 = input.LA(1);
						 
						int index44_350 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_350 >= '\t' && LA44_350 <= '\n')||LA44_350=='\r'||LA44_350==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_350);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA44_1296 = input.LA(1);
						 
						int index44_1296 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1296==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1296);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA44_171 = input.LA(1);
						 
						int index44_171 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_171 >= '\t' && LA44_171 <= '\n')||LA44_171=='\r'||LA44_171==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_171);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA44_635 = input.LA(1);
						 
						int index44_635 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_635==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_635);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA44_1188 = input.LA(1);
						 
						int index44_1188 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1188==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1188);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA44_1111 = input.LA(1);
						 
						int index44_1111 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1111==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1111);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA44_1273 = input.LA(1);
						 
						int index44_1273 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1273==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1273);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA44_628 = input.LA(1);
						 
						int index44_628 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_628==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_628);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA44_970 = input.LA(1);
						 
						int index44_970 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_970==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_970);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA44_1107 = input.LA(1);
						 
						int index44_1107 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1107=='e') ) {s = 1212;}
						else if ( (LA44_1107=='s') ) {s = 466;}
						else if ( ((LA44_1107 >= '\t' && LA44_1107 <= '\n')||LA44_1107=='\r'||LA44_1107==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1107=='(') ) {s = 467;}
						else if ( (LA44_1107=='!'||(LA44_1107 >= '&' && LA44_1107 <= '\'')||(LA44_1107 >= ',' && LA44_1107 <= '.')||(LA44_1107 >= '0' && LA44_1107 <= ';')||LA44_1107=='?'||(LA44_1107 >= 'A' && LA44_1107 <= 'Z')||LA44_1107=='_'||(LA44_1107 >= 'a' && LA44_1107 <= 'd')||(LA44_1107 >= 'f' && LA44_1107 <= 'r')||(LA44_1107 >= 't' && LA44_1107 <= 'z')||LA44_1107=='\u2019') ) {s = 40;}
						else s = 1213;
						 
						input.seek(index44_1107);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA44_1106 = input.LA(1);
						 
						int index44_1106 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1106==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1106);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA44_1110 = input.LA(1);
						 
						int index44_1110 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1110==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1110);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA44_568 = input.LA(1);
						 
						int index44_568 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_568==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_568);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA44_977 = input.LA(1);
						 
						int index44_977 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_977==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_977);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA44_642 = input.LA(1);
						 
						int index44_642 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_642==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_642=='s') ) {s = 825;}
						else s = 40;
						 
						input.seek(index44_642);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA44_357 = input.LA(1);
						 
						int index44_357 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_357==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_357);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA44_814 = input.LA(1);
						 
						int index44_814 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_814=='o') ) {s = 974;}
						else if ( (LA44_814=='s') ) {s = 466;}
						else if ( ((LA44_814 >= '\t' && LA44_814 <= '\n')||LA44_814=='\r'||LA44_814==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_814=='(') ) {s = 467;}
						else if ( (LA44_814=='!'||(LA44_814 >= '&' && LA44_814 <= '\'')||(LA44_814 >= ',' && LA44_814 <= '.')||(LA44_814 >= '0' && LA44_814 <= ';')||LA44_814=='?'||(LA44_814 >= 'A' && LA44_814 <= 'Z')||LA44_814=='_'||(LA44_814 >= 'a' && LA44_814 <= 'n')||(LA44_814 >= 'p' && LA44_814 <= 'r')||(LA44_814 >= 't' && LA44_814 <= 'z')||LA44_814=='\u2019') ) {s = 40;}
						else s = 975;
						 
						input.seek(index44_814);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA44_920 = input.LA(1);
						 
						int index44_920 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_920==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_920);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA44_169 = input.LA(1);
						 
						int index44_169 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_169 >= '\t' && LA44_169 <= '\n')||LA44_169=='\r'||LA44_169==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_169);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA44_176 = input.LA(1);
						 
						int index44_176 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_176==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_176);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA44_951 = input.LA(1);
						 
						int index44_951 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_951==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_951);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA44_35 = input.LA(1);
						 
						int index44_35 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_35 >= '\t' && LA44_35 <= '\n')||LA44_35=='\r'||LA44_35==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_35);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA44_351 = input.LA(1);
						 
						int index44_351 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_351 >= '\t' && LA44_351 <= '\n')||LA44_351=='\r'||LA44_351==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_351);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA44_918 = input.LA(1);
						 
						int index44_918 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_918==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_918);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA44_72 = input.LA(1);
						 
						int index44_72 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_72 >= '\t' && LA44_72 <= '\n')||LA44_72=='\r'||LA44_72==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_72);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA44_223 = input.LA(1);
						 
						int index44_223 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_223 >= '\t' && LA44_223 <= '\n')||LA44_223=='\r'||LA44_223==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_223);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA44_1275 = input.LA(1);
						 
						int index44_1275 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1275==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1275);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA44_1281 = input.LA(1);
						 
						int index44_1281 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1281==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1281);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA44_752 = input.LA(1);
						 
						int index44_752 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_752==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_752);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA44_932 = input.LA(1);
						 
						int index44_932 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_932==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_932);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA44_33 = input.LA(1);
						 
						int index44_33 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_33=='S') ) {s = 169;}
						else if ( ((LA44_33 >= '\t' && LA44_33 <= '\n')||LA44_33=='\r'||LA44_33==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_33);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA44_221 = input.LA(1);
						 
						int index44_221 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_221=='l') ) {s = 408;}
						else if ( ((LA44_221 >= '\t' && LA44_221 <= '\n')||LA44_221=='\r'||LA44_221==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_221);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA44_930 = input.LA(1);
						 
						int index44_930 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_930=='s') ) {s = 466;}
						else if ( ((LA44_930 >= '\t' && LA44_930 <= '\n')||LA44_930=='\r'||LA44_930==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_930=='(') ) {s = 467;}
						else if ( (LA44_930=='!'||(LA44_930 >= '&' && LA44_930 <= '\'')||(LA44_930 >= ',' && LA44_930 <= '.')||(LA44_930 >= '0' && LA44_930 <= ';')||LA44_930=='?'||(LA44_930 >= 'A' && LA44_930 <= 'Z')||LA44_930=='_'||(LA44_930 >= 'a' && LA44_930 <= 'r')||(LA44_930 >= 't' && LA44_930 <= 'z')||LA44_930=='\u2019') ) {s = 40;}
						else s = 1082;
						 
						input.seek(index44_930);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA44_753 = input.LA(1);
						 
						int index44_753 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_753=='s') ) {s = 466;}
						else if ( ((LA44_753 >= '\t' && LA44_753 <= '\n')||LA44_753=='\r'||LA44_753==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_753=='(') ) {s = 467;}
						else if ( (LA44_753=='!'||(LA44_753 >= '&' && LA44_753 <= '\'')||(LA44_753 >= ',' && LA44_753 <= '.')||(LA44_753 >= '0' && LA44_753 <= ';')||LA44_753=='?'||(LA44_753 >= 'A' && LA44_753 <= 'Z')||LA44_753=='_'||(LA44_753 >= 'a' && LA44_753 <= 'r')||(LA44_753 >= 't' && LA44_753 <= 'z')||LA44_753=='\u2019') ) {s = 40;}
						else s = 931;
						 
						input.seek(index44_753);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA44_713 = input.LA(1);
						 
						int index44_713 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_713==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_713);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA44_15 = input.LA(1);
						 
						int index44_15 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_15=='a') ) {s = 97;}
						else if ( (LA44_15=='e') ) {s = 98;}
						else if ( (LA44_15=='h') ) {s = 99;}
						else if ( (LA44_15=='\u00F6') && ((allowBreed))) {s = 100;}
						else if ( (LA44_15=='o') ) {s = 101;}
						else if ( (LA44_15=='U') ) {s = 102;}
						else s = 40;
						 
						input.seek(index44_15);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA44_1197 = input.LA(1);
						 
						int index44_1197 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1197=='s') ) {s = 466;}
						else if ( ((LA44_1197 >= '\t' && LA44_1197 <= '\n')||LA44_1197=='\r'||LA44_1197==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1197=='(') ) {s = 467;}
						else if ( (LA44_1197=='!'||(LA44_1197 >= '&' && LA44_1197 <= '\'')||(LA44_1197 >= ',' && LA44_1197 <= '.')||(LA44_1197 >= '0' && LA44_1197 <= ';')||LA44_1197=='?'||(LA44_1197 >= 'A' && LA44_1197 <= 'Z')||LA44_1197=='_'||(LA44_1197 >= 'a' && LA44_1197 <= 'r')||(LA44_1197 >= 't' && LA44_1197 <= 'z')||LA44_1197=='\u2019') ) {s = 40;}
						else s = 1280;
						 
						input.seek(index44_1197);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA44_1195 = input.LA(1);
						 
						int index44_1195 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1195==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1195);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA44_1087 = input.LA(1);
						 
						int index44_1087 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1087==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1087);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA44_767 = input.LA(1);
						 
						int index44_767 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_767==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_767);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA44_1086 = input.LA(1);
						 
						int index44_1086 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1086==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1086);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA44_764 = input.LA(1);
						 
						int index44_764 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_764==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_764);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA44_799 = input.LA(1);
						 
						int index44_799 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_799==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_799);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA44_1423 = input.LA(1);
						 
						int index44_1423 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1423=='s') ) {s = 466;}
						else if ( ((LA44_1423 >= '\t' && LA44_1423 <= '\n')||LA44_1423=='\r'||LA44_1423==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1423=='(') ) {s = 467;}
						else if ( (LA44_1423=='!'||(LA44_1423 >= '&' && LA44_1423 <= '\'')||(LA44_1423 >= ',' && LA44_1423 <= '.')||(LA44_1423 >= '0' && LA44_1423 <= ';')||LA44_1423=='?'||(LA44_1423 >= 'A' && LA44_1423 <= 'Z')||LA44_1423=='_'||(LA44_1423 >= 'a' && LA44_1423 <= 'r')||(LA44_1423 >= 't' && LA44_1423 <= 'z')||LA44_1423=='\u2019') ) {s = 40;}
						else s = 1448;
						 
						input.seek(index44_1423);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA44_936 = input.LA(1);
						 
						int index44_936 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_936==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_936);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA44_554 = input.LA(1);
						 
						int index44_554 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_554=='s') ) {s = 466;}
						else if ( ((LA44_554 >= '\t' && LA44_554 <= '\n')||LA44_554=='\r'||LA44_554==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_554=='(') ) {s = 467;}
						else if ( (LA44_554=='!'||(LA44_554 >= '&' && LA44_554 <= '\'')||(LA44_554 >= ',' && LA44_554 <= '.')||(LA44_554 >= '0' && LA44_554 <= ';')||LA44_554=='?'||(LA44_554 >= 'A' && LA44_554 <= 'Z')||LA44_554=='_'||(LA44_554 >= 'a' && LA44_554 <= 'r')||(LA44_554 >= 't' && LA44_554 <= 'z')||LA44_554=='\u2019') ) {s = 40;}
						else s = 746;
						 
						input.seek(index44_554);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA44_937 = input.LA(1);
						 
						int index44_937 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_937==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_937);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA44_952 = input.LA(1);
						 
						int index44_952 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_952==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_952);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA44_1344 = input.LA(1);
						 
						int index44_1344 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1344=='s') ) {s = 466;}
						else if ( ((LA44_1344 >= '\t' && LA44_1344 <= '\n')||LA44_1344=='\r'||LA44_1344==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1344=='(') ) {s = 467;}
						else if ( (LA44_1344=='!'||(LA44_1344 >= '&' && LA44_1344 <= '\'')||(LA44_1344 >= ',' && LA44_1344 <= '.')||(LA44_1344 >= '0' && LA44_1344 <= ';')||LA44_1344=='?'||(LA44_1344 >= 'A' && LA44_1344 <= 'Z')||LA44_1344=='_'||(LA44_1344 >= 'a' && LA44_1344 <= 'r')||(LA44_1344 >= 't' && LA44_1344 <= 'z')||LA44_1344=='\u2019') ) {s = 40;}
						else s = 1392;
						 
						input.seek(index44_1344);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA44_1162 = input.LA(1);
						 
						int index44_1162 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1162==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1162);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA44_587 = input.LA(1);
						 
						int index44_587 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_587==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_587);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA44_945 = input.LA(1);
						 
						int index44_945 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_945=='s') ) {s = 466;}
						else if ( ((LA44_945 >= '\t' && LA44_945 <= '\n')||LA44_945=='\r'||LA44_945==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_945=='(') ) {s = 467;}
						else if ( (LA44_945=='!'||(LA44_945 >= '&' && LA44_945 <= '\'')||(LA44_945 >= ',' && LA44_945 <= '.')||(LA44_945 >= '0' && LA44_945 <= ';')||LA44_945=='?'||(LA44_945 >= 'A' && LA44_945 <= 'Z')||LA44_945=='_'||(LA44_945 >= 'a' && LA44_945 <= 'r')||(LA44_945 >= 't' && LA44_945 <= 'z')||LA44_945=='\u2019') ) {s = 40;}
						else s = 1090;
						 
						input.seek(index44_945);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA44_1284 = input.LA(1);
						 
						int index44_1284 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1284==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1284);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA44_577 = input.LA(1);
						 
						int index44_577 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_577=='s') ) {s = 466;}
						else if ( ((LA44_577 >= '\t' && LA44_577 <= '\n')||LA44_577=='\r'||LA44_577==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_577=='(') ) {s = 467;}
						else if ( (LA44_577=='!'||(LA44_577 >= '&' && LA44_577 <= '\'')||(LA44_577 >= ',' && LA44_577 <= '.')||(LA44_577 >= '0' && LA44_577 <= ';')||LA44_577=='?'||(LA44_577 >= 'A' && LA44_577 <= 'Z')||LA44_577=='_'||(LA44_577 >= 'a' && LA44_577 <= 'r')||(LA44_577 >= 't' && LA44_577 <= 'z')||LA44_577=='\u2019') ) {s = 40;}
						else s = 768;
						 
						input.seek(index44_577);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA44_1093 = input.LA(1);
						 
						int index44_1093 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1093==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1093);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA44_769 = input.LA(1);
						 
						int index44_769 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_769=='s') ) {s = 466;}
						else if ( ((LA44_769 >= '\t' && LA44_769 <= '\n')||LA44_769=='\r'||LA44_769==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_769=='(') ) {s = 467;}
						else if ( (LA44_769=='!'||(LA44_769 >= '&' && LA44_769 <= '\'')||(LA44_769 >= ',' && LA44_769 <= '.')||(LA44_769 >= '0' && LA44_769 <= ';')||LA44_769=='?'||(LA44_769 >= 'A' && LA44_769 <= 'Z')||LA44_769=='_'||(LA44_769 >= 'a' && LA44_769 <= 'r')||(LA44_769 >= 't' && LA44_769 <= 'z')||LA44_769=='\u2019') ) {s = 40;}
						else s = 942;
						 
						input.seek(index44_769);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA44_1088 = input.LA(1);
						 
						int index44_1088 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1088=='s') ) {s = 466;}
						else if ( ((LA44_1088 >= '\t' && LA44_1088 <= '\n')||LA44_1088=='\r'||LA44_1088==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1088=='(') ) {s = 467;}
						else if ( (LA44_1088=='!'||(LA44_1088 >= '&' && LA44_1088 <= '\'')||(LA44_1088 >= ',' && LA44_1088 <= '.')||(LA44_1088 >= '0' && LA44_1088 <= ';')||LA44_1088=='?'||(LA44_1088 >= 'A' && LA44_1088 <= 'Z')||LA44_1088=='_'||(LA44_1088 >= 'a' && LA44_1088 <= 'r')||(LA44_1088 >= 't' && LA44_1088 <= 'z')||LA44_1088=='\u2019') ) {s = 40;}
						else s = 1200;
						 
						input.seek(index44_1088);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA44_1167 = input.LA(1);
						 
						int index44_1167 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1167==' ') && ((allowGroup))) {s = 1179;}
						else s = 40;
						 
						input.seek(index44_1167);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA44_1390 = input.LA(1);
						 
						int index44_1390 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1390==' ') && ((allowGroup))) {s = 1422;}
						else s = 40;
						 
						input.seek(index44_1390);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA44_397 = input.LA(1);
						 
						int index44_397 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_397==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_397);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA44_316 = input.LA(1);
						 
						int index44_316 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_316==' ') && ((allowGroup))) {s = 508;}
						else s = 40;
						 
						input.seek(index44_316);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA44_1092 = input.LA(1);
						 
						int index44_1092 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1092==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1092);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA44_583 = input.LA(1);
						 
						int index44_583 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_583==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_583);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA44_1047 = input.LA(1);
						 
						int index44_1047 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1047==' ') && ((allowGroup))) {s = 1170;}
						else s = 40;
						 
						input.seek(index44_1047);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA44_774 = input.LA(1);
						 
						int index44_774 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_774==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_774);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA44_1203 = input.LA(1);
						 
						int index44_1203 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1203=='s') ) {s = 466;}
						else if ( ((LA44_1203 >= '\t' && LA44_1203 <= '\n')||LA44_1203=='\r'||LA44_1203==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1203=='(') ) {s = 467;}
						else if ( (LA44_1203=='!'||(LA44_1203 >= '&' && LA44_1203 <= '\'')||(LA44_1203 >= ',' && LA44_1203 <= '.')||(LA44_1203 >= '0' && LA44_1203 <= ';')||LA44_1203=='?'||(LA44_1203 >= 'A' && LA44_1203 <= 'Z')||LA44_1203=='_'||(LA44_1203 >= 'a' && LA44_1203 <= 'r')||(LA44_1203 >= 't' && LA44_1203 <= 'z')||LA44_1203=='\u2019') ) {s = 40;}
						else s = 1285;
						 
						input.seek(index44_1203);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA44_1089 = input.LA(1);
						 
						int index44_1089 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1089==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1089);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA44_621 = input.LA(1);
						 
						int index44_621 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_621==' ') && ((allowGroup))) {s = 807;}
						else s = 40;
						 
						input.seek(index44_621);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA44_394 = input.LA(1);
						 
						int index44_394 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_394==' ') && ((allowGroup))) {s = 508;}
						else s = 40;
						 
						input.seek(index44_394);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA44_1060 = input.LA(1);
						 
						int index44_1060 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1060==' ') && ((allowGroup))) {s = 1179;}
						else s = 40;
						 
						input.seek(index44_1060);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA44_1282 = input.LA(1);
						 
						int index44_1282 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1282=='s') ) {s = 466;}
						else if ( ((LA44_1282 >= '\t' && LA44_1282 <= '\n')||LA44_1282=='\r'||LA44_1282==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1282=='(') ) {s = 467;}
						else if ( (LA44_1282=='!'||(LA44_1282 >= '&' && LA44_1282 <= '\'')||(LA44_1282 >= ',' && LA44_1282 <= '.')||(LA44_1282 >= '0' && LA44_1282 <= ';')||LA44_1282=='?'||(LA44_1282 >= 'A' && LA44_1282 <= 'Z')||LA44_1282=='_'||(LA44_1282 >= 'a' && LA44_1282 <= 'r')||(LA44_1282 >= 't' && LA44_1282 <= 'z')||LA44_1282=='\u2019') ) {s = 40;}
						else s = 1343;
						 
						input.seek(index44_1282);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA44_1279 = input.LA(1);
						 
						int index44_1279 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1279==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1279);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA44_789 = input.LA(1);
						 
						int index44_789 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_789==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_789);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA44_968 = input.LA(1);
						 
						int index44_968 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_968==' ') && ((allowGroup))) {s = 807;}
						else s = 40;
						 
						input.seek(index44_968);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA44_414 = input.LA(1);
						 
						int index44_414 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_414==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_414);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA44_759 = input.LA(1);
						 
						int index44_759 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_759==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_759=='s') ) {s = 937;}
						else s = 40;
						 
						input.seek(index44_759);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA44_1099 = input.LA(1);
						 
						int index44_1099 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1099==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1099);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA44_575 = input.LA(1);
						 
						int index44_575 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_575=='s') ) {s = 466;}
						else if ( ((LA44_575 >= '\t' && LA44_575 <= '\n')||LA44_575=='\r'||LA44_575==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_575=='(') ) {s = 467;}
						else if ( (LA44_575=='!'||(LA44_575 >= '&' && LA44_575 <= '\'')||(LA44_575 >= ',' && LA44_575 <= '.')||(LA44_575 >= '0' && LA44_575 <= ';')||LA44_575=='?'||(LA44_575 >= 'A' && LA44_575 <= 'Z')||LA44_575=='_'||(LA44_575 >= 'a' && LA44_575 <= 'r')||(LA44_575 >= 't' && LA44_575 <= 'z')||LA44_575=='\u2019') ) {s = 40;}
						else s = 766;
						 
						input.seek(index44_575);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA44_787 = input.LA(1);
						 
						int index44_787 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_787==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_787);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA44_1393 = input.LA(1);
						 
						int index44_1393 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1393==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1393);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA44_763 = input.LA(1);
						 
						int index44_763 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_763=='s') ) {s = 466;}
						else if ( ((LA44_763 >= '\t' && LA44_763 <= '\n')||LA44_763=='\r'||LA44_763==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_763=='(') ) {s = 467;}
						else if ( (LA44_763=='!'||(LA44_763 >= '&' && LA44_763 <= '\'')||(LA44_763 >= ',' && LA44_763 <= '.')||(LA44_763 >= '0' && LA44_763 <= ';')||LA44_763=='?'||(LA44_763 >= 'A' && LA44_763 <= 'Z')||LA44_763=='_'||(LA44_763 >= 'a' && LA44_763 <= 'r')||(LA44_763 >= 't' && LA44_763 <= 'z')||LA44_763=='\u2019') ) {s = 40;}
						else s = 940;
						 
						input.seek(index44_763);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA44_782 = input.LA(1);
						 
						int index44_782 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_782==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_782);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA44_953 = input.LA(1);
						 
						int index44_953 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_953==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_953);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA44_1158 = input.LA(1);
						 
						int index44_1158 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1158==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1158);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA44_404 = input.LA(1);
						 
						int index44_404 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_404==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_404);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA44_1334 = input.LA(1);
						 
						int index44_1334 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1334==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1334);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA44_1269 = input.LA(1);
						 
						int index44_1269 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1269==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1269);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA44_1046 = input.LA(1);
						 
						int index44_1046 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1046==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1046);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA44_468 = input.LA(1);
						 
						int index44_468 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_468=='k') ) {s = 666;}
						else if ( (LA44_468=='s') ) {s = 466;}
						else if ( ((LA44_468 >= '\t' && LA44_468 <= '\n')||LA44_468=='\r'||LA44_468==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_468=='(') ) {s = 467;}
						else if ( (LA44_468=='!'||(LA44_468 >= '&' && LA44_468 <= '\'')||(LA44_468 >= ',' && LA44_468 <= '.')||(LA44_468 >= '0' && LA44_468 <= ';')||LA44_468=='?'||(LA44_468 >= 'A' && LA44_468 <= 'Z')||LA44_468=='_'||(LA44_468 >= 'a' && LA44_468 <= 'j')||(LA44_468 >= 'l' && LA44_468 <= 'r')||(LA44_468 >= 't' && LA44_468 <= 'z')||LA44_468=='\u2019') ) {s = 40;}
						else s = 667;
						 
						input.seek(index44_468);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA44_1053 = input.LA(1);
						 
						int index44_1053 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1053==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1053=='s') ) {s = 1173;}
						else s = 40;
						 
						input.seek(index44_1053);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA44_519 = input.LA(1);
						 
						int index44_519 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_519==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_519);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA44_1165 = input.LA(1);
						 
						int index44_1165 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1165==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1165);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA44_1040 = input.LA(1);
						 
						int index44_1040 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1040==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1040);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA44_881 = input.LA(1);
						 
						int index44_881 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_881==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_881);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA44_490 = input.LA(1);
						 
						int index44_490 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_490==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_490);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA44_687 = input.LA(1);
						 
						int index44_687 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_687==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_687);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA44_491 = input.LA(1);
						 
						int index44_491 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_491==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_491);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA44_783 = input.LA(1);
						 
						int index44_783 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_783=='s') ) {s = 466;}
						else if ( ((LA44_783 >= '\t' && LA44_783 <= '\n')||LA44_783=='\r'||LA44_783==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_783=='(') ) {s = 467;}
						else if ( (LA44_783=='!'||(LA44_783 >= '&' && LA44_783 <= '\'')||(LA44_783 >= ',' && LA44_783 <= '.')||(LA44_783 >= '0' && LA44_783 <= ';')||LA44_783=='?'||(LA44_783 >= 'A' && LA44_783 <= 'Z')||LA44_783=='_'||(LA44_783 >= 'a' && LA44_783 <= 'r')||(LA44_783 >= 't' && LA44_783 <= 'z')||LA44_783=='\u2019') ) {s = 40;}
						else s = 954;
						 
						input.seek(index44_783);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA44_1036 = input.LA(1);
						 
						int index44_1036 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1036==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1036);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA44_1205 = input.LA(1);
						 
						int index44_1205 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1205=='s') ) {s = 466;}
						else if ( ((LA44_1205 >= '\t' && LA44_1205 <= '\n')||LA44_1205=='\r'||LA44_1205==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1205=='(') ) {s = 467;}
						else if ( (LA44_1205=='!'||(LA44_1205 >= '&' && LA44_1205 <= '\'')||(LA44_1205 >= ',' && LA44_1205 <= '.')||(LA44_1205 >= '0' && LA44_1205 <= ';')||LA44_1205=='?'||(LA44_1205 >= 'A' && LA44_1205 <= 'Z')||LA44_1205=='_'||(LA44_1205 >= 'a' && LA44_1205 <= 'r')||(LA44_1205 >= 't' && LA44_1205 <= 'z')||LA44_1205=='\u2019') ) {s = 40;}
						else s = 1287;
						 
						input.seek(index44_1205);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA44_1443 = input.LA(1);
						 
						int index44_1443 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1443==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1443);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA44_1206 = input.LA(1);
						 
						int index44_1206 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1206=='s') ) {s = 466;}
						else if ( ((LA44_1206 >= '\t' && LA44_1206 <= '\n')||LA44_1206=='\r'||LA44_1206==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1206=='(') ) {s = 467;}
						else if ( (LA44_1206=='!'||(LA44_1206 >= '&' && LA44_1206 <= '\'')||(LA44_1206 >= ',' && LA44_1206 <= '.')||(LA44_1206 >= '0' && LA44_1206 <= ';')||LA44_1206=='?'||(LA44_1206 >= 'A' && LA44_1206 <= 'Z')||LA44_1206=='_'||(LA44_1206 >= 'a' && LA44_1206 <= 'r')||(LA44_1206 >= 't' && LA44_1206 <= 'z')||LA44_1206=='\u2019') ) {s = 40;}
						else s = 1288;
						 
						input.seek(index44_1206);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA44_1037 = input.LA(1);
						 
						int index44_1037 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1037==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1037);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA44_980 = input.LA(1);
						 
						int index44_980 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_980=='s') ) {s = 466;}
						else if ( ((LA44_980 >= '\t' && LA44_980 <= '\n')||LA44_980=='\r'||LA44_980==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_980=='(') ) {s = 467;}
						else if ( (LA44_980=='!'||(LA44_980 >= '&' && LA44_980 <= '\'')||(LA44_980 >= ',' && LA44_980 <= '.')||(LA44_980 >= '0' && LA44_980 <= ';')||LA44_980=='?'||(LA44_980 >= 'A' && LA44_980 <= 'Z')||LA44_980=='_'||(LA44_980 >= 'a' && LA44_980 <= 'r')||(LA44_980 >= 't' && LA44_980 <= 'z')||LA44_980=='\u2019') ) {s = 40;}
						else s = 1113;
						 
						input.seek(index44_980);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA44_1293 = input.LA(1);
						 
						int index44_1293 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1293=='s') ) {s = 466;}
						else if ( ((LA44_1293 >= '\t' && LA44_1293 <= '\n')||LA44_1293=='\r'||LA44_1293==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1293=='(') ) {s = 467;}
						else if ( (LA44_1293=='!'||(LA44_1293 >= '&' && LA44_1293 <= '\'')||(LA44_1293 >= ',' && LA44_1293 <= '.')||(LA44_1293 >= '0' && LA44_1293 <= ';')||LA44_1293=='?'||(LA44_1293 >= 'A' && LA44_1293 <= 'Z')||LA44_1293=='_'||(LA44_1293 >= 'a' && LA44_1293 <= 'r')||(LA44_1293 >= 't' && LA44_1293 <= 'z')||LA44_1293=='\u2019') ) {s = 40;}
						else s = 1349;
						 
						input.seek(index44_1293);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA44_1159 = input.LA(1);
						 
						int index44_1159 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1159==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1159);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA44_487 = input.LA(1);
						 
						int index44_487 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_487==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_487);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA44_912 = input.LA(1);
						 
						int index44_912 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_912=='s') ) {s = 466;}
						else if ( ((LA44_912 >= '\t' && LA44_912 <= '\n')||LA44_912=='\r'||LA44_912==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_912=='(') ) {s = 467;}
						else if ( (LA44_912=='!'||(LA44_912 >= '&' && LA44_912 <= '\'')||(LA44_912 >= ',' && LA44_912 <= '.')||(LA44_912 >= '0' && LA44_912 <= ';')||LA44_912=='?'||(LA44_912 >= 'A' && LA44_912 <= 'Z')||LA44_912=='_'||(LA44_912 >= 'a' && LA44_912 <= 'r')||(LA44_912 >= 't' && LA44_912 <= 'z')||LA44_912=='\u2019') ) {s = 40;}
						else s = 1067;
						 
						input.seek(index44_912);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA44_959 = input.LA(1);
						 
						int index44_959 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_959==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_959);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA44_962 = input.LA(1);
						 
						int index44_962 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_962==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_962);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA44_1161 = input.LA(1);
						 
						int index44_1161 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1161==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1161);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA44_913 = input.LA(1);
						 
						int index44_913 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_913=='s') ) {s = 466;}
						else if ( ((LA44_913 >= '\t' && LA44_913 <= '\n')||LA44_913=='\r'||LA44_913==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_913=='(') ) {s = 467;}
						else if ( (LA44_913=='!'||(LA44_913 >= '&' && LA44_913 <= '\'')||(LA44_913 >= ',' && LA44_913 <= '.')||(LA44_913 >= '0' && LA44_913 <= ';')||LA44_913=='?'||(LA44_913 >= 'A' && LA44_913 <= 'Z')||LA44_913=='_'||(LA44_913 >= 'a' && LA44_913 <= 'r')||(LA44_913 >= 't' && LA44_913 <= 'z')||LA44_913=='\u2019') ) {s = 40;}
						else s = 1068;
						 
						input.seek(index44_913);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA44_766 = input.LA(1);
						 
						int index44_766 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_766);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA44_746 = input.LA(1);
						 
						int index44_746 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_746);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA44_667 = input.LA(1);
						 
						int index44_667 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_667);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA44_650 = input.LA(1);
						 
						int index44_650 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_650);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA44_465 = input.LA(1);
						 
						int index44_465 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_465);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA44_768 = input.LA(1);
						 
						int index44_768 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_768);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA44_827 = input.LA(1);
						 
						int index44_827 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_827);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA44_860 = input.LA(1);
						 
						int index44_860 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_860);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA44_931 = input.LA(1);
						 
						int index44_931 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_931);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA44_940 = input.LA(1);
						 
						int index44_940 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_940);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA44_942 = input.LA(1);
						 
						int index44_942 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_942);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA44_954 = input.LA(1);
						 
						int index44_954 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_954);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA44_975 = input.LA(1);
						 
						int index44_975 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_975);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA44_987 = input.LA(1);
						 
						int index44_987 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_987);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA44_1026 = input.LA(1);
						 
						int index44_1026 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1026);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA44_1052 = input.LA(1);
						 
						int index44_1052 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1052);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA44_1067 = input.LA(1);
						 
						int index44_1067 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1067);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA44_1068 = input.LA(1);
						 
						int index44_1068 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1068);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA44_1082 = input.LA(1);
						 
						int index44_1082 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1082);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA44_1090 = input.LA(1);
						 
						int index44_1090 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1090);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA44_1103 = input.LA(1);
						 
						int index44_1103 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1103);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA44_1113 = input.LA(1);
						 
						int index44_1113 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1113);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA44_1117 = input.LA(1);
						 
						int index44_1117 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1117);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA44_1155 = input.LA(1);
						 
						int index44_1155 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1155);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA44_1160 = input.LA(1);
						 
						int index44_1160 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1160);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA44_1177 = input.LA(1);
						 
						int index44_1177 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1177);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA44_1200 = input.LA(1);
						 
						int index44_1200 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1200);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA44_1210 = input.LA(1);
						 
						int index44_1210 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1210);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA44_1213 = input.LA(1);
						 
						int index44_1213 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1213);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA44_1214 = input.LA(1);
						 
						int index44_1214 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1214);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA44_1215 = input.LA(1);
						 
						int index44_1215 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1215);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA44_1217 = input.LA(1);
						 
						int index44_1217 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1217);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA44_1252 = input.LA(1);
						 
						int index44_1252 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1252);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA44_1260 = input.LA(1);
						 
						int index44_1260 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1260);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA44_1280 = input.LA(1);
						 
						int index44_1280 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1280);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA44_1285 = input.LA(1);
						 
						int index44_1285 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1285);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA44_1287 = input.LA(1);
						 
						int index44_1287 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1287);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA44_1288 = input.LA(1);
						 
						int index44_1288 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1288);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA44_1291 = input.LA(1);
						 
						int index44_1291 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1291);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA44_1294 = input.LA(1);
						 
						int index44_1294 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1294);
						if ( s>=0 ) return s;
						break;

					case 180 : 
						int LA44_1339 = input.LA(1);
						 
						int index44_1339 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1339);
						if ( s>=0 ) return s;
						break;

					case 181 : 
						int LA44_1343 = input.LA(1);
						 
						int index44_1343 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1343);
						if ( s>=0 ) return s;
						break;

					case 182 : 
						int LA44_1348 = input.LA(1);
						 
						int index44_1348 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1348);
						if ( s>=0 ) return s;
						break;

					case 183 : 
						int LA44_1349 = input.LA(1);
						 
						int index44_1349 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1349);
						if ( s>=0 ) return s;
						break;

					case 184 : 
						int LA44_1350 = input.LA(1);
						 
						int index44_1350 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1350);
						if ( s>=0 ) return s;
						break;

					case 185 : 
						int LA44_1377 = input.LA(1);
						 
						int index44_1377 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1377);
						if ( s>=0 ) return s;
						break;

					case 186 : 
						int LA44_1378 = input.LA(1);
						 
						int index44_1378 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1378);
						if ( s>=0 ) return s;
						break;

					case 187 : 
						int LA44_1379 = input.LA(1);
						 
						int index44_1379 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1379);
						if ( s>=0 ) return s;
						break;

					case 188 : 
						int LA44_1383 = input.LA(1);
						 
						int index44_1383 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1383);
						if ( s>=0 ) return s;
						break;

					case 189 : 
						int LA44_1392 = input.LA(1);
						 
						int index44_1392 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1392);
						if ( s>=0 ) return s;
						break;

					case 190 : 
						int LA44_1421 = input.LA(1);
						 
						int index44_1421 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1421);
						if ( s>=0 ) return s;
						break;

					case 191 : 
						int LA44_1448 = input.LA(1);
						 
						int index44_1448 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1448);
						if ( s>=0 ) return s;
						break;

					case 192 : 
						int LA44_1462 = input.LA(1);
						 
						int index44_1462 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1462);
						if ( s>=0 ) return s;
						break;

					case 193 : 
						int LA44_1464 = input.LA(1);
						 
						int index44_1464 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1464);
						if ( s>=0 ) return s;
						break;

					case 194 : 
						int LA44_1469 = input.LA(1);
						 
						int index44_1469 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1469);
						if ( s>=0 ) return s;
						break;

					case 195 : 
						int LA44_1483 = input.LA(1);
						 
						int index44_1483 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1483);
						if ( s>=0 ) return s;
						break;

					case 196 : 
						int LA44_1485 = input.LA(1);
						 
						int index44_1485 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1485);
						if ( s>=0 ) return s;
						break;

					case 197 : 
						int LA44_1497 = input.LA(1);
						 
						int index44_1497 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1497);
						if ( s>=0 ) return s;
						break;

					case 198 : 
						int LA44_1516 = input.LA(1);
						 
						int index44_1516 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1516);
						if ( s>=0 ) return s;
						break;

					case 199 : 
						int LA44_1526 = input.LA(1);
						 
						int index44_1526 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1526);
						if ( s>=0 ) return s;
						break;

					case 200 : 
						int LA44_685 = input.LA(1);
						 
						int index44_685 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_685==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_685);
						if ( s>=0 ) return s;
						break;

					case 201 : 
						int LA44_1292 = input.LA(1);
						 
						int index44_1292 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1292=='s') ) {s = 466;}
						else if ( ((LA44_1292 >= '\t' && LA44_1292 <= '\n')||LA44_1292=='\r'||LA44_1292==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1292=='(') ) {s = 467;}
						else if ( (LA44_1292=='!'||(LA44_1292 >= '&' && LA44_1292 <= '\'')||(LA44_1292 >= ',' && LA44_1292 <= '.')||(LA44_1292 >= '0' && LA44_1292 <= ';')||LA44_1292=='?'||(LA44_1292 >= 'A' && LA44_1292 <= 'Z')||LA44_1292=='_'||(LA44_1292 >= 'a' && LA44_1292 <= 'r')||(LA44_1292 >= 't' && LA44_1292 <= 'z')||LA44_1292=='\u2019') ) {s = 40;}
						else s = 1348;
						 
						input.seek(index44_1292);
						if ( s>=0 ) return s;
						break;

					case 202 : 
						int LA44_1257 = input.LA(1);
						 
						int index44_1257 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1257==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1257);
						if ( s>=0 ) return s;
						break;

					case 203 : 
						int LA44_280 = input.LA(1);
						 
						int index44_280 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_280==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_280);
						if ( s>=0 ) return s;
						break;

					case 204 : 
						int LA44_1020 = input.LA(1);
						 
						int index44_1020 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1020==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1020);
						if ( s>=0 ) return s;
						break;

					case 205 : 
						int LA44_676 = input.LA(1);
						 
						int index44_676 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_676==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_676);
						if ( s>=0 ) return s;
						break;

					case 206 : 
						int LA44_522 = input.LA(1);
						 
						int index44_522 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_522==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_522=='h') ) {s = 716;}
						else s = 40;
						 
						input.seek(index44_522);
						if ( s>=0 ) return s;
						break;

					case 207 : 
						int LA44_1109 = input.LA(1);
						 
						int index44_1109 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1109=='s') ) {s = 466;}
						else if ( ((LA44_1109 >= '\t' && LA44_1109 <= '\n')||LA44_1109=='\r'||LA44_1109==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1109=='(') ) {s = 467;}
						else if ( (LA44_1109=='!'||(LA44_1109 >= '&' && LA44_1109 <= '\'')||(LA44_1109 >= ',' && LA44_1109 <= '.')||(LA44_1109 >= '0' && LA44_1109 <= ';')||LA44_1109=='?'||(LA44_1109 >= 'A' && LA44_1109 <= 'Z')||LA44_1109=='_'||(LA44_1109 >= 'a' && LA44_1109 <= 'r')||(LA44_1109 >= 't' && LA44_1109 <= 'z')||LA44_1109=='\u2019') ) {s = 40;}
						else s = 1215;
						 
						input.seek(index44_1109);
						if ( s>=0 ) return s;
						break;

					case 208 : 
						int LA44_393 = input.LA(1);
						 
						int index44_393 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_393==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_393=='d') ) {s = 581;}
						else if ( (LA44_393=='m') ) {s = 582;}
						else s = 40;
						 
						input.seek(index44_393);
						if ( s>=0 ) return s;
						break;

					case 209 : 
						int LA44_1108 = input.LA(1);
						 
						int index44_1108 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1108=='s') ) {s = 466;}
						else if ( ((LA44_1108 >= '\t' && LA44_1108 <= '\n')||LA44_1108=='\r'||LA44_1108==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1108=='(') ) {s = 467;}
						else if ( (LA44_1108=='!'||(LA44_1108 >= '&' && LA44_1108 <= '\'')||(LA44_1108 >= ',' && LA44_1108 <= '.')||(LA44_1108 >= '0' && LA44_1108 <= ';')||LA44_1108=='?'||(LA44_1108 >= 'A' && LA44_1108 <= 'Z')||LA44_1108=='_'||(LA44_1108 >= 'a' && LA44_1108 <= 'r')||(LA44_1108 >= 't' && LA44_1108 <= 'z')||LA44_1108=='\u2019') ) {s = 40;}
						else s = 1214;
						 
						input.seek(index44_1108);
						if ( s>=0 ) return s;
						break;

					case 210 : 
						int LA44_1024 = input.LA(1);
						 
						int index44_1024 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1024==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1024);
						if ( s>=0 ) return s;
						break;

					case 211 : 
						int LA44_829 = input.LA(1);
						 
						int index44_829 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_829==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_829);
						if ( s>=0 ) return s;
						break;

					case 212 : 
						int LA44_1104 = input.LA(1);
						 
						int index44_1104 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1104=='s') ) {s = 466;}
						else if ( ((LA44_1104 >= '\t' && LA44_1104 <= '\n')||LA44_1104=='\r'||LA44_1104==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1104=='(') ) {s = 467;}
						else if ( (LA44_1104=='!'||(LA44_1104 >= '&' && LA44_1104 <= '\'')||(LA44_1104 >= ',' && LA44_1104 <= '.')||(LA44_1104 >= '0' && LA44_1104 <= ';')||LA44_1104=='?'||(LA44_1104 >= 'A' && LA44_1104 <= 'Z')||LA44_1104=='_'||(LA44_1104 >= 'a' && LA44_1104 <= 'r')||(LA44_1104 >= 't' && LA44_1104 <= 'z')||LA44_1104=='\u2019') ) {s = 40;}
						else s = 1210;
						 
						input.seek(index44_1104);
						if ( s>=0 ) return s;
						break;

					case 213 : 
						int LA44_600 = input.LA(1);
						 
						int index44_600 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_600==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_600=='s') ) {s = 789;}
						else s = 40;
						 
						input.seek(index44_600);
						if ( s>=0 ) return s;
						break;

					case 214 : 
						int LA44_1150 = input.LA(1);
						 
						int index44_1150 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1150==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1150);
						if ( s>=0 ) return s;
						break;

					case 215 : 
						int LA44_926 = input.LA(1);
						 
						int index44_926 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_926==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_926);
						if ( s>=0 ) return s;
						break;

					case 216 : 
						int LA44_1116 = input.LA(1);
						 
						int index44_1116 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1116==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1116);
						if ( s>=0 ) return s;
						break;

					case 217 : 
						int LA44_744 = input.LA(1);
						 
						int index44_744 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_744==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_744);
						if ( s>=0 ) return s;
						break;

					case 218 : 
						int LA44_1190 = input.LA(1);
						 
						int index44_1190 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1190==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1190);
						if ( s>=0 ) return s;
						break;

					case 219 : 
						int LA44_1078 = input.LA(1);
						 
						int index44_1078 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1078==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1078);
						if ( s>=0 ) return s;
						break;

					case 220 : 
						int LA44_822 = input.LA(1);
						 
						int index44_822 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_822==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_822);
						if ( s>=0 ) return s;
						break;

					case 221 : 
						int LA44_984 = input.LA(1);
						 
						int index44_984 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_984==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_984);
						if ( s>=0 ) return s;
						break;

					case 222 : 
						int LA44_966 = input.LA(1);
						 
						int index44_966 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_966=='s') ) {s = 466;}
						else if ( ((LA44_966 >= '\t' && LA44_966 <= '\n')||LA44_966=='\r'||LA44_966==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_966=='(') ) {s = 467;}
						else if ( (LA44_966=='!'||(LA44_966 >= '&' && LA44_966 <= '\'')||(LA44_966 >= ',' && LA44_966 <= '.')||(LA44_966 >= '0' && LA44_966 <= ';')||LA44_966=='?'||(LA44_966 >= 'A' && LA44_966 <= 'Z')||LA44_966=='_'||(LA44_966 >= 'a' && LA44_966 <= 'r')||(LA44_966 >= 't' && LA44_966 <= 'z')||LA44_966=='\u2019') ) {s = 40;}
						else s = 1103;
						 
						input.seek(index44_966);
						if ( s>=0 ) return s;
						break;

					case 223 : 
						int LA44_1209 = input.LA(1);
						 
						int index44_1209 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1209=='s') ) {s = 466;}
						else if ( ((LA44_1209 >= '\t' && LA44_1209 <= '\n')||LA44_1209=='\r'||LA44_1209==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1209=='(') ) {s = 467;}
						else if ( (LA44_1209=='!'||(LA44_1209 >= '&' && LA44_1209 <= '\'')||(LA44_1209 >= ',' && LA44_1209 <= '.')||(LA44_1209 >= '0' && LA44_1209 <= ';')||LA44_1209=='?'||(LA44_1209 >= 'A' && LA44_1209 <= 'Z')||LA44_1209=='_'||(LA44_1209 >= 'a' && LA44_1209 <= 'r')||(LA44_1209 >= 't' && LA44_1209 <= 'z')||LA44_1209=='\u2019') ) {s = 40;}
						else s = 1291;
						 
						input.seek(index44_1209);
						if ( s>=0 ) return s;
						break;

					case 224 : 
						int LA44_825 = input.LA(1);
						 
						int index44_825 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_825==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_825);
						if ( s>=0 ) return s;
						break;

					case 225 : 
						int LA44_666 = input.LA(1);
						 
						int index44_666 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_666=='s') ) {s = 466;}
						else if ( ((LA44_666 >= '\t' && LA44_666 <= '\n')||LA44_666=='\r'||LA44_666==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_666=='(') ) {s = 467;}
						else if ( (LA44_666=='!'||(LA44_666 >= '&' && LA44_666 <= '\'')||(LA44_666 >= ',' && LA44_666 <= '.')||(LA44_666 >= '0' && LA44_666 <= ';')||LA44_666=='?'||(LA44_666 >= 'A' && LA44_666 <= 'Z')||LA44_666=='_'||(LA44_666 >= 'a' && LA44_666 <= 'r')||(LA44_666 >= 't' && LA44_666 <= 'z')||LA44_666=='\u2019') ) {s = 40;}
						else s = 860;
						 
						input.seek(index44_666);
						if ( s>=0 ) return s;
						break;

					case 226 : 
						int LA44_277 = input.LA(1);
						 
						int index44_277 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_277=='s') ) {s = 466;}
						else if ( ((LA44_277 >= '\t' && LA44_277 <= '\n')||LA44_277=='\r'||LA44_277==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_277=='(') ) {s = 467;}
						else if ( (LA44_277=='!'||(LA44_277 >= '&' && LA44_277 <= '\'')||(LA44_277 >= ',' && LA44_277 <= '.')||(LA44_277 >= '0' && LA44_277 <= ';')||LA44_277=='?'||(LA44_277 >= 'A' && LA44_277 <= 'Z')||LA44_277=='_'||(LA44_277 >= 'a' && LA44_277 <= 'r')||(LA44_277 >= 't' && LA44_277 <= 'z')||LA44_277=='\u2019') ) {s = 40;}
						else s = 465;
						 
						input.seek(index44_277);
						if ( s>=0 ) return s;
						break;

					case 227 : 
						int LA44_985 = input.LA(1);
						 
						int index44_985 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_985=='s') ) {s = 466;}
						else if ( ((LA44_985 >= '\t' && LA44_985 <= '\n')||LA44_985=='\r'||LA44_985==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_985=='(') ) {s = 467;}
						else if ( (LA44_985=='!'||(LA44_985 >= '&' && LA44_985 <= '\'')||(LA44_985 >= ',' && LA44_985 <= '.')||(LA44_985 >= '0' && LA44_985 <= ';')||LA44_985=='?'||(LA44_985 >= 'A' && LA44_985 <= 'Z')||LA44_985=='_'||(LA44_985 >= 'a' && LA44_985 <= 'r')||(LA44_985 >= 't' && LA44_985 <= 'z')||LA44_985=='\u2019') ) {s = 40;}
						else s = 1117;
						 
						input.seek(index44_985);
						if ( s>=0 ) return s;
						break;

					case 228 : 
						int LA44_644 = input.LA(1);
						 
						int index44_644 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_644=='s') ) {s = 466;}
						else if ( ((LA44_644 >= '\t' && LA44_644 <= '\n')||LA44_644=='\r'||LA44_644==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_644=='(') ) {s = 467;}
						else if ( (LA44_644=='!'||(LA44_644 >= '&' && LA44_644 <= '\'')||(LA44_644 >= ',' && LA44_644 <= '.')||(LA44_644 >= '0' && LA44_644 <= ';')||LA44_644=='?'||(LA44_644 >= 'A' && LA44_644 <= 'Z')||LA44_644=='_'||(LA44_644 >= 'a' && LA44_644 <= 'r')||(LA44_644 >= 't' && LA44_644 <= 'z')||LA44_644=='\u2019') ) {s = 40;}
						else s = 827;
						 
						input.seek(index44_644);
						if ( s>=0 ) return s;
						break;

					case 229 : 
						int LA44_831 = input.LA(1);
						 
						int index44_831 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_831=='s') ) {s = 466;}
						else if ( ((LA44_831 >= '\t' && LA44_831 <= '\n')||LA44_831=='\r'||LA44_831==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_831=='(') ) {s = 467;}
						else if ( (LA44_831=='!'||(LA44_831 >= '&' && LA44_831 <= '\'')||(LA44_831 >= ',' && LA44_831 <= '.')||(LA44_831 >= '0' && LA44_831 <= ';')||LA44_831=='?'||(LA44_831 >= 'A' && LA44_831 <= 'Z')||LA44_831=='_'||(LA44_831 >= 'a' && LA44_831 <= 'r')||(LA44_831 >= 't' && LA44_831 <= 'z')||LA44_831=='\u2019') ) {s = 40;}
						else s = 987;
						 
						input.seek(index44_831);
						if ( s>=0 ) return s;
						break;

					case 230 : 
						int LA44_1295 = input.LA(1);
						 
						int index44_1295 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1295=='s') ) {s = 466;}
						else if ( ((LA44_1295 >= '\t' && LA44_1295 <= '\n')||LA44_1295=='\r'||LA44_1295==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1295=='(') ) {s = 467;}
						else if ( (LA44_1295=='!'||(LA44_1295 >= '&' && LA44_1295 <= '\'')||(LA44_1295 >= ',' && LA44_1295 <= '.')||(LA44_1295 >= '0' && LA44_1295 <= ';')||LA44_1295=='?'||(LA44_1295 >= 'A' && LA44_1295 <= 'Z')||LA44_1295=='_'||(LA44_1295 >= 'a' && LA44_1295 <= 'r')||(LA44_1295 >= 't' && LA44_1295 <= 'z')||LA44_1295=='\u2019') ) {s = 40;}
						else s = 1350;
						 
						input.seek(index44_1295);
						if ( s>=0 ) return s;
						break;

					case 231 : 
						int LA44_1218 = input.LA(1);
						 
						int index44_1218 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1218=='s') ) {s = 466;}
						else if ( ((LA44_1218 >= '\t' && LA44_1218 <= '\n')||LA44_1218=='\r'||LA44_1218==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1218=='(') ) {s = 467;}
						else if ( (LA44_1218=='!'||(LA44_1218 >= '&' && LA44_1218 <= '\'')||(LA44_1218 >= ',' && LA44_1218 <= '.')||(LA44_1218 >= '0' && LA44_1218 <= ';')||LA44_1218=='?'||(LA44_1218 >= 'A' && LA44_1218 <= 'Z')||LA44_1218=='_'||(LA44_1218 >= 'a' && LA44_1218 <= 'r')||(LA44_1218 >= 't' && LA44_1218 <= 'z')||LA44_1218=='\u2019') ) {s = 40;}
						else s = 1294;
						 
						input.seek(index44_1218);
						if ( s>=0 ) return s;
						break;

					case 232 : 
						int LA44_505 = input.LA(1);
						 
						int index44_505 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_505=='F') && ((allowBreed))) {s = 100;}
						else if ( (LA44_505=='V') ) {s = 701;}
						 
						input.seek(index44_505);
						if ( s>=0 ) return s;
						break;

					case 233 : 
						int LA44_1114 = input.LA(1);
						 
						int index44_1114 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1114=='s') ) {s = 466;}
						else if ( ((LA44_1114 >= '\t' && LA44_1114 <= '\n')||LA44_1114=='\r'||LA44_1114==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1114=='(') ) {s = 467;}
						else if ( (LA44_1114=='!'||(LA44_1114 >= '&' && LA44_1114 <= '\'')||(LA44_1114 >= ',' && LA44_1114 <= '.')||(LA44_1114 >= '0' && LA44_1114 <= ';')||LA44_1114=='?'||(LA44_1114 >= 'A' && LA44_1114 <= 'Z')||LA44_1114=='_'||(LA44_1114 >= 'a' && LA44_1114 <= 'r')||(LA44_1114 >= 't' && LA44_1114 <= 'z')||LA44_1114=='\u2019') ) {s = 40;}
						else s = 1217;
						 
						input.seek(index44_1114);
						if ( s>=0 ) return s;
						break;

					case 234 : 
						int LA44_1274 = input.LA(1);
						 
						int index44_1274 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1274=='s') ) {s = 466;}
						else if ( ((LA44_1274 >= '\t' && LA44_1274 <= '\n')||LA44_1274=='\r'||LA44_1274==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1274=='(') ) {s = 467;}
						else if ( (LA44_1274=='!'||(LA44_1274 >= '&' && LA44_1274 <= '\'')||(LA44_1274 >= ',' && LA44_1274 <= '.')||(LA44_1274 >= '0' && LA44_1274 <= ';')||LA44_1274=='?'||(LA44_1274 >= 'A' && LA44_1274 <= 'Z')||LA44_1274=='_'||(LA44_1274 >= 'a' && LA44_1274 <= 'r')||(LA44_1274 >= 't' && LA44_1274 <= 'z')||LA44_1274=='\u2019') ) {s = 40;}
						else s = 1339;
						 
						input.seek(index44_1274);
						if ( s>=0 ) return s;
						break;

					case 235 : 
						int LA44_0 = input.LA(1);
						s = -1;
						if ( (LA44_0=='M') ) {s = 1;}
						else if ( (LA44_0=='O') ) {s = 2;}
						else if ( (LA44_0=='N') ) {s = 3;}
						else if ( (LA44_0=='A') ) {s = 4;}
						else if ( (LA44_0=='B') ) {s = 5;}
						else if ( (LA44_0=='C') ) {s = 6;}
						else if ( (LA44_0=='D') ) {s = 7;}
						else if ( (LA44_0=='E') ) {s = 8;}
						else if ( (LA44_0=='F') ) {s = 9;}
						else if ( (LA44_0=='G') ) {s = 10;}
						else if ( (LA44_0=='H') ) {s = 11;}
						else if ( (LA44_0=='I') ) {s = 12;}
						else if ( (LA44_0=='J') ) {s = 13;}
						else if ( (LA44_0=='K') ) {s = 14;}
						else if ( (LA44_0=='L') ) {s = 15;}
						else if ( (LA44_0=='P') ) {s = 16;}
						else if ( (LA44_0=='R') ) {s = 17;}
						else if ( (LA44_0=='S') ) {s = 18;}
						else if ( (LA44_0=='T') ) {s = 19;}
						else if ( (LA44_0=='V') ) {s = 20;}
						else if ( (LA44_0=='W') ) {s = 21;}
						else if ( (LA44_0=='X') ) {s = 22;}
						else if ( (LA44_0=='Y') ) {s = 23;}
						else if ( (LA44_0=='(') ) {s = 24;}
						else if ( ((LA44_0 >= '0' && LA44_0 <= '9')) ) {s = 25;}
						else if ( ((LA44_0 >= '\t' && LA44_0 <= '\n')||LA44_0=='\r'||LA44_0==' ') ) {s = 26;}
						else if ( (LA44_0=='.') ) {s = 27;}
						else if ( (LA44_0=='Q'||LA44_0=='U'||LA44_0=='Z') ) {s = 28;}
						else if ( ((LA44_0 >= '&' && LA44_0 <= '\'')||(LA44_0 >= ',' && LA44_0 <= '-')||(LA44_0 >= ':' && LA44_0 <= ';')||LA44_0=='_'||(LA44_0 >= 'a' && LA44_0 <= 'z')||LA44_0=='\u2019') ) {s = 29;}
						else if ( ((LA44_0 >= '\u0000' && LA44_0 <= '\b')||(LA44_0 >= '\u000B' && LA44_0 <= '\f')||(LA44_0 >= '\u000E' && LA44_0 <= '\u001F')||(LA44_0 >= '!' && LA44_0 <= '%')||(LA44_0 >= ')' && LA44_0 <= '+')||LA44_0=='/'||(LA44_0 >= '<' && LA44_0 <= '@')||(LA44_0 >= '[' && LA44_0 <= '^')||LA44_0=='`'||(LA44_0 >= '{' && LA44_0 <= '\u2018')||(LA44_0 >= '\u201A' && LA44_0 <= '\uFFFF')) ) {s = 30;}
						if ( s>=0 ) return s;
						break;

					case 236 : 
						int LA44_1389 = input.LA(1);
						 
						int index44_1389 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1389=='s') ) {s = 466;}
						else if ( ((LA44_1389 >= '\t' && LA44_1389 <= '\n')||LA44_1389=='\r'||LA44_1389==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1389=='(') ) {s = 467;}
						else if ( (LA44_1389=='!'||(LA44_1389 >= '&' && LA44_1389 <= '\'')||(LA44_1389 >= ',' && LA44_1389 <= '.')||(LA44_1389 >= '0' && LA44_1389 <= ';')||LA44_1389=='?'||(LA44_1389 >= 'A' && LA44_1389 <= 'Z')||LA44_1389=='_'||(LA44_1389 >= 'a' && LA44_1389 <= 'r')||(LA44_1389 >= 't' && LA44_1389 <= 'z')||LA44_1389=='\u2019') ) {s = 40;}
						else s = 1421;
						 
						input.seek(index44_1389);
						if ( s>=0 ) return s;
						break;

					case 237 : 
						int LA44_1163 = input.LA(1);
						 
						int index44_1163 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1163=='s') ) {s = 466;}
						else if ( ((LA44_1163 >= '\t' && LA44_1163 <= '\n')||LA44_1163=='\r'||LA44_1163==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1163=='(') ) {s = 467;}
						else if ( (LA44_1163=='!'||(LA44_1163 >= '&' && LA44_1163 <= '\'')||(LA44_1163 >= ',' && LA44_1163 <= '.')||(LA44_1163 >= '0' && LA44_1163 <= ';')||LA44_1163=='?'||(LA44_1163 >= 'A' && LA44_1163 <= 'Z')||LA44_1163=='_'||(LA44_1163 >= 'a' && LA44_1163 <= 'r')||(LA44_1163 >= 't' && LA44_1163 <= 'z')||LA44_1163=='\u2019') ) {s = 40;}
						else s = 1260;
						 
						input.seek(index44_1163);
						if ( s>=0 ) return s;
						break;

					case 238 : 
						int LA44_1032 = input.LA(1);
						 
						int index44_1032 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1032=='s') ) {s = 466;}
						else if ( ((LA44_1032 >= '\t' && LA44_1032 <= '\n')||LA44_1032=='\r'||LA44_1032==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1032=='(') ) {s = 467;}
						else if ( (LA44_1032=='!'||(LA44_1032 >= '&' && LA44_1032 <= '\'')||(LA44_1032 >= ',' && LA44_1032 <= '.')||(LA44_1032 >= '0' && LA44_1032 <= ';')||LA44_1032=='?'||(LA44_1032 >= 'A' && LA44_1032 <= 'Z')||LA44_1032=='_'||(LA44_1032 >= 'a' && LA44_1032 <= 'r')||(LA44_1032 >= 't' && LA44_1032 <= 'z')||LA44_1032=='\u2019') ) {s = 40;}
						else s = 1160;
						 
						input.seek(index44_1032);
						if ( s>=0 ) return s;
						break;

					case 239 : 
						int LA44_1329 = input.LA(1);
						 
						int index44_1329 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1329=='s') ) {s = 466;}
						else if ( ((LA44_1329 >= '\t' && LA44_1329 <= '\n')||LA44_1329=='\r'||LA44_1329==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1329=='(') ) {s = 467;}
						else if ( (LA44_1329=='!'||(LA44_1329 >= '&' && LA44_1329 <= '\'')||(LA44_1329 >= ',' && LA44_1329 <= '.')||(LA44_1329 >= '0' && LA44_1329 <= ';')||LA44_1329=='?'||(LA44_1329 >= 'A' && LA44_1329 <= 'Z')||LA44_1329=='_'||(LA44_1329 >= 'a' && LA44_1329 <= 'r')||(LA44_1329 >= 't' && LA44_1329 <= 'z')||LA44_1329=='\u2019') ) {s = 40;}
						else s = 1379;
						 
						input.seek(index44_1329);
						if ( s>=0 ) return s;
						break;

					case 240 : 
						int LA44_868 = input.LA(1);
						 
						int index44_868 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_868=='s') ) {s = 466;}
						else if ( ((LA44_868 >= '\t' && LA44_868 <= '\n')||LA44_868=='\r'||LA44_868==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_868=='(') ) {s = 467;}
						else if ( (LA44_868=='!'||(LA44_868 >= '&' && LA44_868 <= '\'')||(LA44_868 >= ',' && LA44_868 <= '.')||(LA44_868 >= '0' && LA44_868 <= ';')||LA44_868=='?'||(LA44_868 >= 'A' && LA44_868 <= 'Z')||LA44_868=='_'||(LA44_868 >= 'a' && LA44_868 <= 'r')||(LA44_868 >= 't' && LA44_868 <= 'z')||LA44_868=='\u2019') ) {s = 40;}
						else s = 1026;
						 
						input.seek(index44_868);
						if ( s>=0 ) return s;
						break;

					case 241 : 
						int LA44_1027 = input.LA(1);
						 
						int index44_1027 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1027=='s') ) {s = 466;}
						else if ( ((LA44_1027 >= '\t' && LA44_1027 <= '\n')||LA44_1027=='\r'||LA44_1027==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1027=='(') ) {s = 467;}
						else if ( (LA44_1027=='!'||(LA44_1027 >= '&' && LA44_1027 <= '\'')||(LA44_1027 >= ',' && LA44_1027 <= '.')||(LA44_1027 >= '0' && LA44_1027 <= ';')||LA44_1027=='?'||(LA44_1027 >= 'A' && LA44_1027 <= 'Z')||LA44_1027=='_'||(LA44_1027 >= 'a' && LA44_1027 <= 'r')||(LA44_1027 >= 't' && LA44_1027 <= 'z')||LA44_1027=='\u2019') ) {s = 40;}
						else s = 1155;
						 
						input.seek(index44_1027);
						if ( s>=0 ) return s;
						break;

					case 242 : 
						int LA44_1328 = input.LA(1);
						 
						int index44_1328 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1328=='s') ) {s = 466;}
						else if ( ((LA44_1328 >= '\t' && LA44_1328 <= '\n')||LA44_1328=='\r'||LA44_1328==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1328=='(') ) {s = 467;}
						else if ( (LA44_1328=='!'||(LA44_1328 >= '&' && LA44_1328 <= '\'')||(LA44_1328 >= ',' && LA44_1328 <= '.')||(LA44_1328 >= '0' && LA44_1328 <= ';')||LA44_1328=='?'||(LA44_1328 >= 'A' && LA44_1328 <= 'Z')||LA44_1328=='_'||(LA44_1328 >= 'a' && LA44_1328 <= 'r')||(LA44_1328 >= 't' && LA44_1328 <= 'z')||LA44_1328=='\u2019') ) {s = 40;}
						else s = 1378;
						 
						input.seek(index44_1328);
						if ( s>=0 ) return s;
						break;

					case 243 : 
						int LA44_1327 = input.LA(1);
						 
						int index44_1327 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1327=='s') ) {s = 466;}
						else if ( ((LA44_1327 >= '\t' && LA44_1327 <= '\n')||LA44_1327=='\r'||LA44_1327==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1327=='(') ) {s = 467;}
						else if ( (LA44_1327=='!'||(LA44_1327 >= '&' && LA44_1327 <= '\'')||(LA44_1327 >= ',' && LA44_1327 <= '.')||(LA44_1327 >= '0' && LA44_1327 <= ';')||LA44_1327=='?'||(LA44_1327 >= 'A' && LA44_1327 <= 'Z')||LA44_1327=='_'||(LA44_1327 >= 'a' && LA44_1327 <= 'r')||(LA44_1327 >= 't' && LA44_1327 <= 'z')||LA44_1327=='\u2019') ) {s = 40;}
						else s = 1377;
						 
						input.seek(index44_1327);
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 44, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
