<<<<<<< HEAD
// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-03-11 21:02:50
=======
// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-03-08 01:38:20
>>>>>>> regenerated ANTLR files

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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:5: ({...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:7: {...}? => ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "FRAG_BREED_NAME_SINGLE", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:112:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )
			int alt2=197;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:5: 'Berger Picard'
					{
					match("Berger Picard"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:136:5: 'Bernese Mountain Dog'
					{
					match("Bernese Mountain Dog"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:137:5: 'Bichon Frise'
					{
					match("Bichon Frise"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:5: 'Bichons Frise'
					{
					match("Bichons Frise"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:139:5: 'Black and Tan Coonhound'
					{
					match("Black and Tan Coonhound"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:140:5: 'Black & Tan Coonhound'
					{
					match("Black & Tan Coonhound"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:5: 'Black Russian Terrier'
					{
					match("Black Russian Terrier"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:142:5: 'Bloodhound'
					{
					match("Bloodhound"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:143:5: 'Bluetick Coonhound'
					{
					match("Bluetick Coonhound"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:5: 'Border Collie'
					{
					match("Border Collie"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:145:5: 'Border Terrier'
					{
					match("Border Terrier"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:146:5: 'Borzoi'
					{
					match("Borzoi"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:147:5: 'Boston Terrier'
					{
					match("Boston Terrier"); 

					}
					break;
				case 37 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: 'Bouvier des Flandres'
					{
					match("Bouvier des Flandres"); 

					}
					break;
				case 38 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:149:5: 'Bouviers des Flandres'
					{
					match("Bouviers des Flandres"); 

					}
					break;
				case 39 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:150:5: 'Boxer'
					{
					match("Boxer"); 

					}
					break;
				case 40 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: 'Boykin Spaniel'
					{
					match("Boykin Spaniel"); 

					}
					break;
				case 41 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:152:5: 'Brace'
					{
					match("Brace"); 

					}
					break;
				case 42 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:153:5: 'Briard'
					{
					match("Briard"); 

					}
					break;
				case 43 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:154:5: 'Brittany'
					{
					match("Brittany"); 

					}
					break;
				case 44 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:5: 'Brussels Griffon'
					{
					match("Brussels Griffon"); 

					}
					break;
				case 45 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:156:5: 'Bull Terrier'
					{
					match("Bull Terrier"); 

					}
					break;
				case 46 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:157:5: 'Bulldog'
					{
					match("Bulldog"); 

					}
					break;
				case 47 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:158:5: 'Bullmastiff'
					{
					match("Bullmastiff"); 

					}
					break;
				case 48 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:5: 'Cairn Terrier'
					{
					match("Cairn Terrier"); 

					}
					break;
				case 49 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:160:5: 'Canaan Dog'
					{
					match("Canaan Dog"); 

					}
					break;
				case 50 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:161:5: 'Cane Corso'
					{
					match("Cane Corso"); 

					}
					break;
				case 51 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: 'Cardigan Welsh Corgi'
					{
					match("Cardigan Welsh Corgi"); 

					}
					break;
				case 52 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:163:5: 'Cavalier King Charles Spaniel'
					{
					match("Cavalier King Charles Spaniel"); 

					}
					break;
				case 53 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:164:5: 'Cesky Terrier'
					{
					match("Cesky Terrier"); 

					}
					break;
				case 54 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:165:5: 'Chesapeake Bay Retriever'
					{
					match("Chesapeake Bay Retriever"); 

					}
					break;
				case 55 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:5: 'Chihuahua'
					{
					match("Chihuahua"); 

					}
					break;
				case 56 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:167:5: 'Chinese Crested'
					{
					match("Chinese Crested"); 

					}
					break;
				case 57 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:168:5: 'Chinese Shar-Pei'
					{
					match("Chinese Shar-Pei"); 

					}
					break;
				case 58 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:5: 'Cirneco dell’Etna'
					{
					match("Cirneco dell’Etna"); 

					}
					break;
				case 59 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:170:5: 'Chow Chow'
					{
					match("Chow Chow"); 

					}
					break;
				case 60 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:171:5: 'Clumber Spaniel'
					{
					match("Clumber Spaniel"); 

					}
					break;
				case 61 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:172:5: 'Cocker Spaniel'
					{
					match("Cocker Spaniel"); 

					}
					break;
				case 62 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:173:5: 'Collie'
					{
					match("Collie"); 

					}
					break;
				case 63 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:174:5: 'Curly-Coated Retriever'
					{
					match("Curly-Coated Retriever"); 

					}
					break;
				case 64 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:175:5: 'Dachshund'
					{
					match("Dachshund"); 

					}
					break;
				case 65 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:176:5: 'Dalmatian'
					{
					match("Dalmatian"); 

					}
					break;
				case 66 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:5: 'Dandie Dinmont Terrier'
					{
					match("Dandie Dinmont Terrier"); 

					}
					break;
				case 67 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:5: 'Doberman Pinscher'
					{
					match("Doberman Pinscher"); 

					}
					break;
				case 68 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:179:5: 'Dogo Argentine'
					{
					match("Dogo Argentine"); 

					}
					break;
				case 69 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:5: 'Dogue de Bordeaux'
					{
					match("Dogue de Bordeaux"); 

					}
					break;
				case 70 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:5: 'Dogues de Bordeaux'
					{
					match("Dogues de Bordeaux"); 

					}
					break;
				case 71 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:5: 'English Cocker Spaniel'
					{
					match("English Cocker Spaniel"); 

					}
					break;
				case 72 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:183:5: 'English Foxhound'
					{
					match("English Foxhound"); 

					}
					break;
				case 73 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:5: 'English Setter'
					{
					match("English Setter"); 

					}
					break;
				case 74 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:5: 'English Springer Spaniel'
					{
					match("English Springer Spaniel"); 

					}
					break;
				case 75 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:5: 'English Toy Spaniel'
					{
					match("English Toy Spaniel"); 

					}
					break;
				case 76 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:5: 'Entlebucher Mountain Dog'
					{
					match("Entlebucher Mountain Dog"); 

					}
					break;
				case 77 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:188:5: 'Field Spaniel'
					{
					match("Field Spaniel"); 

					}
					break;
				case 78 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:5: 'Finnish Lapphund'
					{
					match("Finnish Lapphund"); 

					}
					break;
				case 79 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:5: 'Finnish Spitz'
					{
					match("Finnish Spitz"); 

					}
					break;
				case 80 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:191:5: 'Flat-Coated Retriever'
					{
					match("Flat-Coated Retriever"); 

					}
					break;
				case 81 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:5: 'Fox Terrier'
					{
					match("Fox Terrier"); 

					}
					break;
				case 82 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:5: 'French Bulldog'
					{
					match("French Bulldog"); 

					}
					break;
				case 83 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:5: 'German Pinscher'
					{
					match("German Pinscher"); 

					}
					break;
				case 84 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:5: 'German Shepherd Dog'
					{
					match("German Shepherd Dog"); 

					}
					break;
				case 85 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:5: 'German Shorthaired Pointer'
					{
					match("German Shorthaired Pointer"); 

					}
					break;
				case 86 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:5: 'German Wirehaired Pointer'
					{
					match("German Wirehaired Pointer"); 

					}
					break;
				case 87 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:198:5: 'Giant Schnauzer'
					{
					match("Giant Schnauzer"); 

					}
					break;
				case 88 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:199:5: 'Glen of Imaal Terrier'
					{
					match("Glen of Imaal Terrier"); 

					}
					break;
				case 89 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:5: 'Golden Retriever'
					{
					match("Golden Retriever"); 

					}
					break;
				case 90 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:5: 'Gordon Setter'
					{
					match("Gordon Setter"); 

					}
					break;
				case 91 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:202:5: 'Great Dane'
					{
					match("Great Dane"); 

					}
					break;
				case 92 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:5: 'Great Pyrenees'
					{
					match("Great Pyrenees"); 

					}
					break;
				case 93 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: 'Greater Swiss Mountain Dog'
					{
					match("Greater Swiss Mountain Dog"); 

					}
					break;
				case 94 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:205:5: 'Greyhound'
					{
					match("Greyhound"); 

					}
					break;
				case 95 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:5: 'Harrier'
					{
					match("Harrier"); 

					}
					break;
				case 96 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:5: 'Havanese'
					{
					match("Havanese"); 

					}
					break;
				case 97 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:5: 'Ibizan Hound'
					{
					match("Ibizan Hound"); 

					}
					break;
				case 98 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:5: 'Icelandic Sheepdog'
					{
					match("Icelandic Sheepdog"); 

					}
					break;
				case 99 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:5: 'Irish Red and White Setter'
					{
					match("Irish Red and White Setter"); 

					}
					break;
				case 100 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:5: 'Irish Setter'
					{
					match("Irish Setter"); 

					}
					break;
				case 101 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:5: 'Irish Terrier'
					{
					match("Irish Terrier"); 

					}
					break;
				case 102 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:5: 'Irish Water Spaniel'
					{
					match("Irish Water Spaniel"); 

					}
					break;
				case 103 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:214:5: 'Irish Wolfhound'
					{
					match("Irish Wolfhound"); 

					}
					break;
				case 104 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:215:5: 'Italian Greyhound'
					{
					match("Italian Greyhound"); 

					}
					break;
				case 105 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:5: 'Japanese Chin'
					{
					match("Japanese Chin"); 

					}
					break;
				case 106 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:5: 'Keeshond'
					{
					match("Keeshond"); 

					}
					break;
				case 107 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:218:5: 'Keeshonden'
					{
					match("Keeshonden"); 

					}
					break;
				case 108 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:219:5: 'Kerry Blue Terrier'
					{
					match("Kerry Blue Terrier"); 

					}
					break;
				case 109 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:5: 'Komondor'
					{
					match("Komondor"); 

					}
					break;
				case 110 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:221:5: 'Kuvasz'
					{
					match("Kuvasz"); 

					}
					break;
				case 111 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:5: 'Kuvaszok'
					{
					match("Kuvaszok"); 

					}
					break;
				case 112 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:5: 'Labrador Retriever'
					{
					match("Labrador Retriever"); 

					}
					break;
				case 113 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:224:5: 'Lagotto Romagnolo'
					{
					match("Lagotto Romagnolo"); 

					}
					break;
				case 114 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:225:5: 'Lakeland Terrier'
					{
					match("Lakeland Terrier"); 

					}
					break;
				case 115 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:226:5: 'Leonberger'
					{
					match("Leonberger"); 

					}
					break;
				case 116 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:5: 'Lhasa Apso'
					{
					match("Lhasa Apso"); 

					}
					break;
				case 117 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:5: 'Löwchen'
					{
					match("Löwchen"); 

					}
					break;
				case 118 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:229:5: 'Lowchen'
					{
					match("Lowchen"); 

					}
					break;
				case 119 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:5: 'Maltese'
					{
					match("Maltese"); 

					}
					break;
				case 120 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:5: 'Manchester Terrier'
					{
					match("Manchester Terrier"); 

					}
					break;
				case 121 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:5: 'Mastiff'
					{
					match("Mastiff"); 

					}
					break;
				case 122 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:233:5: 'Miniature American Shepherd'
					{
					match("Miniature American Shepherd"); 

					}
					break;
				case 123 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:5: 'Miniature Bull Terrier'
					{
					match("Miniature Bull Terrier"); 

					}
					break;
				case 124 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:5: 'Miniature Pinscher'
					{
					match("Miniature Pinscher"); 

					}
					break;
				case 125 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:5: 'Miniature Schnauzer'
					{
					match("Miniature Schnauzer"); 

					}
					break;
				case 126 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:5: 'Neapolitan Mastiff'
					{
					match("Neapolitan Mastiff"); 

					}
					break;
				case 127 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:5: 'Newfoundland'
					{
					match("Newfoundland"); 

					}
					break;
				case 128 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: 'Norfolk Terrier'
					{
					match("Norfolk Terrier"); 

					}
					break;
				case 129 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:5: 'Norwegian Buhund'
					{
					match("Norwegian Buhund"); 

					}
					break;
				case 130 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:5: 'Norwegian Elkhound'
					{
					match("Norwegian Elkhound"); 

					}
					break;
				case 131 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:5: 'Norwegian Lundehund'
					{
					match("Norwegian Lundehund"); 

					}
					break;
				case 132 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:5: 'Norwich Terrier'
					{
					match("Norwich Terrier"); 

					}
					break;
				case 133 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:5: 'Nova Scotia Duck Tolling Retriever'
					{
					match("Nova Scotia Duck Tolling Retriever"); 

					}
					break;
				case 134 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:5: 'Old English Sheepdog'
					{
					match("Old English Sheepdog"); 

					}
					break;
				case 135 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: 'Otterhound'
					{
					match("Otterhound"); 

					}
					break;
				case 136 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:5: 'Papillon'
					{
					match("Papillon"); 

					}
					break;
				case 137 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:5: 'Parson Russell Terrier'
					{
					match("Parson Russell Terrier"); 

					}
					break;
				case 138 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:5: 'Pekingese'
					{
					match("Pekingese"); 

					}
					break;
				case 139 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:5: 'Pembroke Welsh Corgi'
					{
					match("Pembroke Welsh Corgi"); 

					}
					break;
				case 140 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:5: 'Petit Basset Griffon Vendéen'
					{
					match("Petit Basset Griffon Vendéen"); 

					}
					break;
				case 141 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:5: 'Petits Bassets Griffons Vendeen'
					{
					match("Petits Bassets Griffons Vendeen"); 

					}
					break;
				case 142 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:5: 'Pharaoh Hound'
					{
					match("Pharaoh Hound"); 

					}
					break;
				case 143 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: 'Plott'
					{
					match("Plott"); 

					}
					break;
				case 144 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:5: 'Pointer'
					{
					match("Pointer"); 

					}
					break;
				case 145 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: 'Polish Lowland Sheepdog'
					{
					match("Polish Lowland Sheepdog"); 

					}
					break;
				case 146 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:5: 'Pomeranian'
					{
					match("Pomeranian"); 

					}
					break;
				case 147 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:5: 'Poodle'
					{
					match("Poodle"); 

					}
					break;
				case 148 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:5: 'Portuguese Podengo Pequenos'
					{
					match("Portuguese Podengo Pequenos"); 

					}
					break;
				case 149 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:5: 'Portuguese Water Dog'
					{
					match("Portuguese Water Dog"); 

					}
					break;
				case 150 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: 'Pug'
					{
					match("Pug"); 

					}
					break;
				case 151 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:5: 'Puli'
					{
					match("Puli"); 

					}
					break;
				case 152 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:263:5: 'Pulik'
					{
					match("Pulik"); 

					}
					break;
				case 153 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:5: 'Pyrenean Shepherd'
					{
					match("Pyrenean Shepherd"); 

					}
					break;
				case 154 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:5: 'Rat Terrier'
					{
					match("Rat Terrier"); 

					}
					break;
				case 155 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:5: 'Redbone Coonhound'
					{
					match("Redbone Coonhound"); 

					}
					break;
				case 156 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: 'Retrievers'
					{
					match("Retrievers"); 

					}
					break;
				case 157 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: 'Rhodesian Ridgeback'
					{
					match("Rhodesian Ridgeback"); 

					}
					break;
				case 158 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: 'Rottweiler'
					{
					match("Rottweiler"); 

					}
					break;
				case 159 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: 'Russell Terrier'
					{
					match("Russell Terrier"); 

					}
					break;
				case 160 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:5: 'Saint Bernard'
					{
					match("Saint Bernard"); 

					}
					break;
				case 161 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:272:5: 'Saluki'
					{
					match("Saluki"); 

					}
					break;
				case 162 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:273:5: 'Samoyed'
					{
					match("Samoyed"); 

					}
					break;
				case 163 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:5: 'Schipperke'
					{
					match("Schipperke"); 

					}
					break;
				case 164 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:275:5: 'Scottish Deerhound'
					{
					match("Scottish Deerhound"); 

					}
					break;
				case 165 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:276:5: 'Scottish Terrier'
					{
					match("Scottish Terrier"); 

					}
					break;
				case 166 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:277:5: 'Sealyham Terrier'
					{
					match("Sealyham Terrier"); 

					}
					break;
				case 167 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:5: 'Setters'
					{
					match("Setters"); 

					}
					break;
				case 168 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: 'Shetland Sheepdog'
					{
					match("Shetland Sheepdog"); 

					}
					break;
				case 169 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: 'Shiba Inu'
					{
					match("Shiba Inu"); 

					}
					break;
				case 170 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:5: 'Shih Tzu'
					{
					match("Shih Tzu"); 

					}
					break;
				case 171 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:5: 'Siberian Husky'
					{
					match("Siberian Husky"); 

					}
					break;
				case 172 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:283:5: 'Siberian Huskies'
					{
					match("Siberian Huskies"); 

					}
					break;
				case 173 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:5: 'Silky Terrier'
					{
					match("Silky Terrier"); 

					}
					break;
				case 174 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:5: 'Skye Terrier'
					{
					match("Skye Terrier"); 

					}
					break;
				case 175 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:286:5: 'Soft Coated Wheaten Terrier'
					{
					match("Soft Coated Wheaten Terrier"); 

					}
					break;
				case 176 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:287:5: 'Spaniels'
					{
					match("Spaniels"); 

					}
					break;
				case 177 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: 'Spinone Italiano'
					{
					match("Spinone Italiano"); 

					}
					break;
				case 178 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:289:5: 'Spinoni Italiani'
					{
					match("Spinoni Italiani"); 

					}
					break;
				case 179 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:290:5: 'Staffordshire Bull Terrier'
					{
					match("Staffordshire Bull Terrier"); 

					}
					break;
				case 180 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: 'Standard Schnauzer'
					{
					match("Standard Schnauzer"); 

					}
					break;
				case 181 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:292:5: 'Sussex Spaniel'
					{
					match("Sussex Spaniel"); 

					}
					break;
				case 182 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:5: 'Swedish Vallhund'
					{
					match("Swedish Vallhund"); 

					}
					break;
				case 183 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:5: 'Tibetan Mastiff'
					{
					match("Tibetan Mastiff"); 

					}
					break;
				case 184 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:5: 'Tibetan Spaniel'
					{
					match("Tibetan Spaniel"); 

					}
					break;
				case 185 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:5: 'Tibetan Terrier'
					{
					match("Tibetan Terrier"); 

					}
					break;
				case 186 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:5: 'Toy Fox Terrier'
					{
					match("Toy Fox Terrier"); 

					}
					break;
				case 187 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:5: 'Treeing Walker Coonhound'
					{
					match("Treeing Walker Coonhound"); 

					}
					break;
				case 188 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:5: 'Vizsla'
					{
					match("Vizsla"); 

					}
					break;
				case 189 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:5: 'Weimaraner'
					{
					match("Weimaraner"); 

					}
					break;
				case 190 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:5: 'Welsh Springer Spaniel'
					{
					match("Welsh Springer Spaniel"); 

					}
					break;
				case 191 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:5: 'Welsh Terrier'
					{
					match("Welsh Terrier"); 

					}
					break;
				case 192 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:5: 'West Highland White Terrier'
					{
					match("West Highland White Terrier"); 

					}
					break;
				case 193 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:5: 'Whippet'
					{
					match("Whippet"); 

					}
					break;
				case 194 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:5: 'Wire Fox Terrier'
					{
					match("Wire Fox Terrier"); 

					}
					break;
				case 195 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:5: 'Wirehaired Pointing Griffon'
					{
					match("Wirehaired Pointing Griffon"); 

					}
					break;
				case 196 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:5: 'Xoloitzcuintli'
					{
					match("Xoloitzcuintli"); 

					}
					break;
				case 197 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:308:5: 'Yorkshire Terrier'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:5: ({...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:7: {...}? => ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT ) ( 's' )? ( WS )? ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )? ( BREED_NAME_SUFFIX )?
			{
			if ( !((allowBreed)) ) {
				throw new FailedPredicateException(input, "BREED_NAME", "allowBreed");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:22: ( FRAG_BREED_NAME_SINGLE | FRAG_BREED_NAME_ALT )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:23: FRAG_BREED_NAME_SINGLE
					{
					mFRAG_BREED_NAME_SINGLE(); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:46: FRAG_BREED_NAME_ALT
					{
					mFRAG_BREED_NAME_ALT(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:67: ( 's' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='s') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:67: 's'
					{
					match('s'); 
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:72: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:72: WS
					{
					mWS(); 

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:76: ( '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )? )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:77: '(' FRAG_BREED_NAME_CATEGORY ')' ( WS )? ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					{
					match('('); 
					mFRAG_BREED_NAME_CATEGORY(); 

					match(')'); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:110: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:110: WS
							{
							mWS(); 

							}
							break;

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:114: ( FRAG_BREED_NAME_CATEGORY_SUFFIX )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||LA7_0=='P') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:114: FRAG_BREED_NAME_CATEGORY_SUFFIX
							{
							mFRAG_BREED_NAME_CATEGORY_SUFFIX(); 

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:150: ( BREED_NAME_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='(') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:150: BREED_NAME_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:5: ( ( FRAG_BREED_NAME_SPECIAL_SUFFIX ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:9: ( FRAG_BREED_NAME_SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:10: FRAG_BREED_NAME_SPECIAL_SUFFIX
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:5: ( '(Misc. Dog)' | '(Misc. Dogs)' | '(Misc. Bitch)' | '(Misc. Bitches)' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:9: '(Misc. Dog)'
					{
					match("(Misc. Dog)"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:23: '(Misc. Dogs)'
					{
					match("(Misc. Dogs)"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:38: '(Misc. Bitch)'
					{
					match("(Misc. Bitch)"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:54: '(Misc. Bitches)'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:5: ( ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:9: ( 'Sweepstakes' | 'Entry' | 'Entries' | 'Veterans' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:10: 'Sweepstakes'
					{
					match("Sweepstakes"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:24: 'Entry'
					{
					match("Entry"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:32: 'Entries'
					{
					match("Entries"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:42: 'Veterans'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:29: ( 'Veteran Dog' | 'Veteran Bitch' | 'Veteran Bitche' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:33: 'Veteran Dog'
					{
					match("Veteran Dog"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:47: 'Veteran Bitch'
					{
					match("Veteran Bitch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:63: 'Veteran Bitche'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:5: ( 'Ascob' | 'Parti-Color' | 'Black' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:9: 'Ascob'
					{
					match("Ascob"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:17: 'Parti-Color'
					{
					match("Parti-Color"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:31: 'Black'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: ( '13 Inch' | '15 Inch' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' )
			int alt14=36;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:9: '13 Inch'
					{
					match("13 Inch"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:9: '15 Inch'
					{
					match("15 Inch"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:9: 'Boykin'
					{
					match("Boykin"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:9: 'B & P C'
					{
					match("B & P C"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:9: 'Chesapeake Bay'
					{
					match("Chesapeake Bay"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:9: 'Clumber'
					{
					match("Clumber"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:9: 'Cocker'
					{
					match("Cocker"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:9: 'Colored'
					{
					match("Colored"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:9: 'Curly-Coated'
					{
					match("Curly-Coated"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:9: 'English'
					{
					match("English"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:336:9: 'English Cocker'
					{
					match("English Cocker"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:337:9: 'English Springer'
					{
					match("English Springer"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:9: 'Field'
					{
					match("Field"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:339:9: 'Flat-Coated'
					{
					match("Flat-Coated"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:340:9: 'German Shorthaired'
					{
					match("German Shorthaired"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:341:9: 'German Wirehaired'
					{
					match("German Wirehaired"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:342:9: 'Golden'
					{
					match("Golden"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:343:9: 'Gordon'
					{
					match("Gordon"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:9: 'Irish'
					{
					match("Irish"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:345:9: 'Irish Water'
					{
					match("Irish Water"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:9: 'K C & R'
					{
					match("K C & R"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:9: 'Labrador'
					{
					match("Labrador"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:9: 'Long Coat'
					{
					match("Long Coat"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:9: 'Longhaired'
					{
					match("Longhaired"); 

					}
					break;
				case 25 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:9: 'Miniature'
					{
					match("Miniature"); 

					}
					break;
				case 26 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:9: 'Nova Scotia Duck Tolling'
					{
					match("Nova Scotia Duck Tolling"); 

					}
					break;
				case 27 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:9: 'Rough'
					{
					match("Rough"); 

					}
					break;
				case 28 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:9: 'Smooth'
					{
					match("Smooth"); 

					}
					break;
				case 29 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:354:9: 'Smooth Coat'
					{
					match("Smooth Coat"); 

					}
					break;
				case 30 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:9: 'Standard'
					{
					match("Standard"); 

					}
					break;
				case 31 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:9: 'Sussex'
					{
					match("Sussex"); 

					}
					break;
				case 32 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:357:9: 'Toy'
					{
					match("Toy"); 

					}
					break;
				case 33 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:9: 'Welsh Springer'
					{
					match("Welsh Springer"); 

					}
					break;
				case 34 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:9: 'White'
					{
					match("White"); 

					}
					break;
				case 35 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:360:9: 'Wire'
					{
					match("Wire"); 

					}
					break;
				case 36 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:9: 'Wirehaired'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:2: ({...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:3: {...}? => ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
			{
			if ( !((allowGroup)) ) {
				throw new FailedPredicateException(input, "FRAG_GROUP_NAME", "allowGroup");
			}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:18: ( 'HERDING GROUP' | 'TERRIER GROUP' | 'NON-SPORTING GROUP' | 'SPORTING GROUP' | 'TOY GROUP' | 'HOUND GROUP' | 'WORKING GROUP' | ( 'BEST IN SHOW' ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:20: 'HERDING GROUP'
					{
					match("HERDING GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:3: 'TERRIER GROUP'
					{
					match("TERRIER GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:3: 'NON-SPORTING GROUP'
					{
					match("NON-SPORTING GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:3: 'SPORTING GROUP'
					{
					match("SPORTING GROUP"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:3: 'TOY GROUP'
					{
					match("TOY GROUP"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:3: 'HOUND GROUP'
					{
					match("HOUND GROUP"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:3: 'WORKING GROUP'
					{
					match("WORKING GROUP"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:3: ( 'BEST IN SHOW' )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:3: ( 'BEST IN SHOW' )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:4: 'BEST IN SHOW'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:379:2: ( 'VETERAN SWEEPSTAKES GROUP' | 'SWEEPSTAKES GROUP' | 'REGULAR VARIETY GROUP' | 'Toy Variety Group' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:380:3: 'VETERAN SWEEPSTAKES GROUP'
					{
					match("VETERAN SWEEPSTAKES GROUP"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:381:3: 'SWEEPSTAKES GROUP'
					{
					match("SWEEPSTAKES GROUP"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:382:3: 'REGULAR VARIETY GROUP'
					{
					match("REGULAR VARIETY GROUP"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:383:3: 'Toy Variety Group'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:2: ( ( FRAG_GROUP_NAME ' - ' JUDGE_NAME ) | FRAG_SPECIAL_GROUP_NAME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:4: ( FRAG_GROUP_NAME ' - ' JUDGE_NAME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:5: FRAG_GROUP_NAME ' - ' JUDGE_NAME
					{
					mFRAG_GROUP_NAME(); 

					match(" - "); 

					mJUDGE_NAME(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:39: FRAG_SPECIAL_GROUP_NAME
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:23: ( 'January' | 'JANUARY' | 'February' | 'FEBRUARY' | 'March' | 'MARCH' | 'April' | 'APRIL' | 'May' | 'MAY' | 'June' | 'JUNE' | 'July' | 'JULY' | 'August' | 'AUGUST' | 'September' | 'SEPTEMBER' | 'October' | 'OCTOBER' | 'November' | 'NOVEMBER' | 'December' | 'DECEMBER' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:37: 'JANUARY'
					{
					match("JANUARY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:14: 'February'
					{
					match("February"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:390:25: 'FEBRUARY'
					{
					match("FEBRUARY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:14: 'March'
					{
					match("March"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:22: 'MARCH'
					{
					match("MARCH"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:14: 'April'
					{
					match("April"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:22: 'APRIL'
					{
					match("APRIL"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:14: 'May'
					{
					match("May"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:393:20: 'MAY'
					{
					match("MAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:14: 'June'
					{
					match("June"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:21: 'JUNE'
					{
					match("JUNE"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:14: 'July'
					{
					match("July"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:21: 'JULY'
					{
					match("JULY"); 

					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:14: 'August'
					{
					match("August"); 

					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:23: 'AUGUST'
					{
					match("AUGUST"); 

					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:397:14: 'September'
					{
					match("September"); 

					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:397:26: 'SEPTEMBER'
					{
					match("SEPTEMBER"); 

					}
					break;
				case 19 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:398:14: 'October'
					{
					match("October"); 

					}
					break;
				case 20 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:398:24: 'OCTOBER'
					{
					match("OCTOBER"); 

					}
					break;
				case 21 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:14: 'November'
					{
					match("November"); 

					}
					break;
				case 22 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:25: 'NOVEMBER'
					{
					match("NOVEMBER"); 

					}
					break;
				case 23 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:14: 'December'
					{
					match("December"); 

					}
					break;
				case 24 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:25: 'DECEMBER'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:29: ( '!' | '?' | '.' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:25: ( 'RING' | 'Ring' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:29: 'RING'
					{
					match("RING"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:36: 'Ring'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:29: ( ',' | '_' | '-' | ';' | ':' | '\\'' | '’' )
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:5: ( '&' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:9: '&'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:410:5: ( 'am' | 'pm' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:410:9: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:410:14: 'pm'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:5: ( 'MR' | 'Mr' | 'MRS' | 'Mrs' | 'MS' | 'Ms' | 'MISS' | 'Miss' | 'DR' | 'Dr' | 'COL' | 'Col' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:9: 'MR'
					{
					match("MR"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:14: 'Mr'
					{
					match("Mr"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:9: 'MRS'
					{
					match("MRS"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:414:15: 'Mrs'
					{
					match("Mrs"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:9: 'MS'
					{
					match("MS"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:415:14: 'Ms'
					{
					match("Ms"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:9: 'MISS'
					{
					match("MISS"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:16: 'Miss'
					{
					match("Miss"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:417:10: 'DR'
					{
					match("DR"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:417:15: 'Dr'
					{
					match("Dr"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:9: 'COL'
					{
					match("COL"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:15: 'Col'
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:23: ( 'Sunday' | 'SUNDAY' | 'Monday' | 'MONDAY' | 'Tuesday' | 'TUESDAY' | 'Wednesday' | 'WEDNESDAY' | 'Thursday' | 'THURSDAY' | 'Friday' | 'FRIDAY' | 'Saturday' | 'SATURDAY' )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:27: 'Sunday'
					{
					match("Sunday"); 

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:36: 'SUNDAY'
					{
					match("SUNDAY"); 

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:9: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:18: 'MONDAY'
					{
					match("MONDAY"); 

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:9: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:19: 'TUESDAY'
					{
					match("TUESDAY"); 

					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:9: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:21: 'WEDNESDAY'
					{
					match("WEDNESDAY"); 

					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:9: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:20: 'THURSDAY'
					{
					match("THURSDAY"); 

					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:9: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:18: 'FRIDAY'
					{
					match("FRIDAY"); 

					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:427:9: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:427:20: 'SATURDAY'
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:5: ( 'LUNCH' | 'VARIETY GROUP JUDGING' )
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:9: 'LUNCH'
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:9: 'LUNCH'
>>>>>>> regenerated ANTLR files
					{
					match("LUNCH"); 

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:17: 'VARIETY GROUP JUDGING'
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:17: 'VARIETY GROUP JUDGING'
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:441:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:441:17: INT '-' INT '-' INT '-' INT
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:438:14: ( INT '-' INT '-' INT '-' INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:438:17: INT '-' INT '-' INT '-' INT
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) )
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:11: ({...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:13: {...}? => ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) )
>>>>>>> regenerated ANTLR files
			{
			if ( !((allowJudge)) ) {
				throw new FailedPredicateException(input, "JUDGE_NAME", "allowJudge");
			}
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? )
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:28: ( FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:29: FRAG_TITLE WS FRAG_PROPER_NAME ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )* ( ( WS )? ( PARENTHETICAL_INT )? )
>>>>>>> regenerated ANTLR files
			{
			mFRAG_TITLE(); 

			mWS(); 

			mFRAG_PROPER_NAME(); 

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )*
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:60: ( ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME ) )*
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:61: ' ' ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
					{
					match(' '); 
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:65: ( PARENTHETICAL_NAME | FRAG_PROPER_NAME )
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:66: PARENTHETICAL_NAME
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:66: PARENTHETICAL_NAME
>>>>>>> regenerated ANTLR files
							{
							mPARENTHETICAL_NAME(); 

							}
							break;
						case 2 :
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:85: FRAG_PROPER_NAME
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:85: FRAG_PROPER_NAME
>>>>>>> regenerated ANTLR files
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

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:106: ( WS )?
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:105: ( ( WS )? ( PARENTHETICAL_INT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:106: ( WS )? ( PARENTHETICAL_INT )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:106: ( WS )?
>>>>>>> regenerated ANTLR files
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||LA26_0=='\r'||LA26_0==' ') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:106: WS
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:106: WS
>>>>>>> regenerated ANTLR files
					{
					mWS(); 

					}
					break;

			}

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:110: ( PARENTHETICAL_INT )?
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:110: ( PARENTHETICAL_INT )?
>>>>>>> regenerated ANTLR files
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='(') ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:110: PARENTHETICAL_INT
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:110: PARENTHETICAL_INT
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:442:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:13: ( ( 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:13: ( ( 'GROUP RING' | ( 'RING' WS INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:17: ( 'GROUP RING' | ( 'RING' WS INT ) )
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:18: 'GROUP RING'
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:18: 'GROUP RING'
>>>>>>> regenerated ANTLR files
					{
					match("GROUP RING"); 

					allowGroup=true;
					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:49: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:49: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:50: 'RING' WS INT
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:49: ( 'RING' WS INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:49: ( 'RING' WS INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:50: 'RING' WS INT
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:5: ( '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:9: '(' '0' .. '9' '0' .. '9' '0' .. '9' ')' ( WS )? '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
>>>>>>> regenerated ANTLR files
			{
			match('('); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			matchRange('0','9'); 
			match(')'); 
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:42: ( WS )?
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:42: ( WS )?
>>>>>>> regenerated ANTLR files
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( ((LA30_0 >= '\t' && LA30_0 <= '\n')||LA30_0=='\r'||LA30_0==' ') ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:450:42: WS
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:42: WS
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:452:13: INT ':' INT WS FRAG_TIME_LABEL
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:9: ( INT ':' INT WS FRAG_TIME_LABEL )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:13: INT ':' INT WS FRAG_TIME_LABEL
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:454:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:9: ( FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:451:13: FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:13: ( '.' )+
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:9: ( ( '.' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:13: ( '.' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:13: ( '.' )+
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:456:13: '.'
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:453:13: '.'
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:6: ( '0' .. '9' )+
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:455:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:455:6: ( '0' .. '9' )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:455:6: ( '0' .. '9' )+
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:13: ( WORD | INT | FRAG_PROPER_NAME )
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:5: ( '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:9: '(' ( WORD | INT | FRAG_PROPER_NAME ) ( WS ( WORD | INT | FRAG_PROPER_NAME ) )* ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:13: ( WORD | INT | FRAG_PROPER_NAME )
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:14: WORD
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:14: WORD
>>>>>>> regenerated ANTLR files
					{
					mWORD(); 

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:19: INT
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:19: INT
>>>>>>> regenerated ANTLR files
					{
					mINT(); 

					}
					break;
				case 3 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:23: FRAG_PROPER_NAME
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:23: FRAG_PROPER_NAME
>>>>>>> regenerated ANTLR files
					{
					mFRAG_PROPER_NAME(); 

					}
					break;

			}

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:41: ( WS ( WORD | INT | FRAG_PROPER_NAME ) )*
>>>>>>> regenerated ANTLR files
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( ((LA35_0 >= '\t' && LA35_0 <= '\n')||LA35_0=='\r'||LA35_0==' ') ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:45: ( WORD | INT | FRAG_PROPER_NAME )
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:42: WS ( WORD | INT | FRAG_PROPER_NAME )
					{
					mWS(); 

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:45: ( WORD | INT | FRAG_PROPER_NAME )
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:46: WORD
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:46: WORD
>>>>>>> regenerated ANTLR files
							{
							mWORD(); 

							}
							break;
						case 2 :
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:51: INT
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:51: INT
>>>>>>> regenerated ANTLR files
							{
							mINT(); 

							}
							break;
						case 3 :
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:55: FRAG_PROPER_NAME
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:55: FRAG_PROPER_NAME
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:26: ( ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* ) ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:28: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:29: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:38: ( 'a' .. 'z' | 'A' .. 'Z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )*
>>>>>>> regenerated ANTLR files
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

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:94: ( END_PUNCTUATION )?
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:94: ( END_PUNCTUATION )?
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:13: ( WS )?
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:5: ( '(' ( WS )? INT ( WS )? ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:9: '(' ( WS )? INT ( WS )? ')'
			{
			match('('); 
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:13: ( WS )?
>>>>>>> regenerated ANTLR files
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= '\t' && LA38_0 <= '\n')||LA38_0=='\r'||LA38_0==' ') ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:13: WS
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:13: WS
>>>>>>> regenerated ANTLR files
					{
					mWS(); 

					}
					break;

			}

			mINT(); 

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:21: ( WS )?
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:21: ( WS )?
>>>>>>> regenerated ANTLR files
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= '\t' && LA39_0 <= '\n')||LA39_0=='\r'||LA39_0==' ') ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:465:21: WS
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:21: WS
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:16: ( ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+ ( END_PUNCTUATION )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:18: ( 'a' .. 'z' | FRAG_SPEC_CHAR | FRAG_SPEC_WORD_CHAR )+
>>>>>>> regenerated ANTLR files
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

<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:65: ( END_PUNCTUATION )?
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:463:65: ( END_PUNCTUATION )?
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:9: ( ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:13: ( ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS ) )+
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
=======
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:14: ( FRAG_PROPER_NAME | WORD | PARENTHETICAL | INT | ELLIPSIS )
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:15: FRAG_PROPER_NAME
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:15: FRAG_PROPER_NAME
>>>>>>> regenerated ANTLR files
							{
							mFRAG_PROPER_NAME(); 

							}
							break;
						case 2 :
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:32: WORD
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:32: WORD
>>>>>>> regenerated ANTLR files
							{
							mWORD(); 

							}
							break;
						case 3 :
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:37: PARENTHETICAL
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:37: PARENTHETICAL
>>>>>>> regenerated ANTLR files
							{
							mPARENTHETICAL(); 

							}
							break;
						case 4 :
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:51: INT
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:51: INT
>>>>>>> regenerated ANTLR files
							{
							mINT(); 

							}
							break;
						case 5 :
<<<<<<< HEAD
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:55: ELLIPSIS
=======
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:55: ELLIPSIS
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:4: WORD END_PUNCTUATION
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:2: ( WORD END_PUNCTUATION )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:466:4: WORD END_PUNCTUATION
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:28: ( '(' FRAG_PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:30: '(' FRAG_PROPER_NAME ')'
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:28: ( '(' FRAG_PROPER_NAME ')' )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:30: '(' FRAG_PROPER_NAME ')'
>>>>>>> regenerated ANTLR files
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
<<<<<<< HEAD
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:476:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:476:6: .
=======
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:473:3: ( . )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:473:6: .
>>>>>>> regenerated ANTLR files
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
		"\u00ec\uffff\1\u0110\74\uffff\1\u014a\72\uffff\1\u017a\102\uffff";
	static final String DFA2_eofS =
		"\u01a7\uffff";
	static final String DFA2_minS =
		"\1\101\1\146\3\141\1\156\1\151\1\145\1\141\1\142\1\uffff\1\145\2\141\1"+
		"\145\1\154\3\141\1\151\1\uffff\1\145\2\uffff\1\146\3\uffff\1\145\1\uffff"+
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
		"\1\40\2\uffff\1\141\1\154\1\156\1\40\1\46\1\40\1\162\1\145\2\uffff\2\150"+
		"\1\40\1\104\1\uffff\1\122\1\156\1\157\1\165\1\151\2\uffff\1\165\1\163"+
		"\1\141\1\145\1\156\1\123\1\156\1\151\1\40\5\uffff\1\103\4\40\1\120\5\uffff"+
		"\1\141\1\144\2\uffff\1\162\1\141\1\145\1\150\1\156\2\uffff\1\40\2\uffff"+
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
		"\141\1\40\2\uffff\1\141\1\154\1\156\1\163\1\141\1\40\1\162\1\145\2\uffff"+
		"\2\150\1\40\1\120\1\uffff\1\127\1\156\1\157\1\165\1\151\2\uffff\1\165"+
		"\1\163\1\141\1\151\1\156\1\124\1\156\1\151\1\40\5\uffff\1\124\1\163\3"+
		"\40\1\127\5\uffff\1\157\1\144\2\uffff\1\162\1\141\1\145\1\150\1\156\2"+
		"\uffff\1\40\2\uffff\1\40\1\141\1\124\4\uffff\1\123\1\124\1\123\1\uffff"+
		"\1\150\3\uffff\2\145\1\156\1\163\2\40\1\124\1\127\1\156\7\uffff\1\160"+
		"\3\uffff\1\157\2\uffff\2\40\1\145\1\124\1\110\3\uffff\1\163\3\uffff\1"+
		"\40\4\uffff\1\123\1\114\1\40\2\uffff\1\165\2\uffff\1\124\7\uffff\1\127"+
		"\1\163\5\uffff\1\153\1\171\2\uffff";
	static final String DFA2_acceptS =
		"\12\uffff\1\151\11\uffff\1\u00bc\1\uffff\1\u00c4\1\u00c5\1\uffff\1\3\1"+
		"\4\1\5\1\uffff\1\13\11\uffff\1\65\1\uffff\1\72\1\74\1\uffff\1\77\4\uffff"+
		"\1\120\1\121\1\122\1\uffff\1\127\1\130\3\uffff\1\141\1\142\1\uffff\1\150"+
		"\1\uffff\1\155\2\uffff\1\163\1\164\1\165\1\166\4\uffff\1\u0086\1\u0087"+
		"\2\uffff\1\u008e\1\u008f\2\uffff\1\u0099\1\u009a\1\uffff\1\u009d\1\u009e"+
		"\1\u009f\5\uffff\1\u00ae\1\u00af\2\uffff\1\u00b5\1\u00b6\1\uffff\1\u00ba"+
		"\1\u00bb\1\uffff\1\u00c1\1\uffff\1\1\1\2\4\uffff\1\24\4\uffff\1\37\1\40"+
		"\1\uffff\1\44\1\uffff\1\47\1\50\1\51\1\uffff\1\54\1\uffff\1\60\1\uffff"+
		"\1\63\1\64\1\66\1\uffff\1\73\1\75\1\76\1\100\1\101\1\102\1\103\2\uffff"+
		"\1\114\1\115\2\uffff\1\131\1\132\1\uffff\1\137\1\140\2\uffff\1\154\1\uffff"+
		"\1\160\1\161\1\162\1\167\1\170\1\171\1\uffff\1\176\1\177\1\uffff\1\u0085"+
		"\1\u0088\1\u0089\1\u008a\1\u008b\1\uffff\1\u0090\1\u0091\1\u0092\1\u0093"+
		"\1\uffff\1\u0096\1\uffff\1\u009b\1\u009c\1\u00a0\1\u00a1\1\u00a2\1\u00a3"+
		"\1\uffff\1\u00a6\1\u00a7\1\u00a8\2\uffff\1\u00ad\1\u00b0\3\uffff\1\u00bd"+
		"\1\uffff\1\u00c0\3\uffff\1\17\1\20\1\21\1\22\1\23\1\uffff\1\30\1\31\3"+
		"\uffff\1\43\1\uffff\1\52\1\53\1\uffff\1\61\1\62\1\67\1\uffff\1\104\5\uffff"+
		"\1\136\4\uffff\1\u0080\5\uffff\1\u00a9\1\u00aa\2\uffff\1\u00b3\1\u00b4"+
		"\12\uffff\1\55\1\56\1\57\13\uffff\1\u0084\2\uffff\1\u0098\1\u0097\5\uffff"+
		"\1\u00c2\1\u00c3\10\uffff\1\105\1\106\4\uffff\1\135\5\uffff\1\u008c\1"+
		"\u008d\11\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\133\1\134\1\143\1\144"+
		"\1\145\2\uffff\1\157\1\156\5\uffff\1\u00b1\1\u00b2\1\uffff\1\u00be\1\u00bf"+
		"\3\uffff\1\41\1\42\1\45\1\46\3\uffff\1\123\1\uffff\1\126\1\146\1\147\11"+
		"\uffff\1\25\1\26\1\27\1\70\1\71\1\107\1\110\1\uffff\1\113\1\116\1\117"+
		"\1\uffff\1\153\1\152\5\uffff\1\u00b7\1\u00b8\1\u00b9\1\uffff\1\10\1\11"+
		"\1\12\1\uffff\1\111\1\112\1\124\1\125\3\uffff\1\u00a4\1\u00a5\1\uffff"+
		"\1\6\1\7\1\uffff\1\172\1\173\1\174\1\175\1\u0081\1\u0082\1\u0083\2\uffff"+
		"\1\14\1\15\1\16\1\u0094\1\u0095\2\uffff\1\u00ab\1\u00ac";
	static final String DFA2_specialS =
		"\u01a7\uffff}>";
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
			"",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137\122\uffff\1\u0138",
			"\1\u013a\53\uffff\1\u013b\16\uffff\1\u0139",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"",
			"",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142\13\uffff\1\u0143",
			"",
			"\1\u0144\1\u0145\1\u0146\2\uffff\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014b",
			"\1\u014c",
			"",
			"",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150\3\uffff\1\u0151",
			"\1\u0152",
			"\1\u0153\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"",
			"",
			"",
			"",
			"",
			"\1\u0158\20\uffff\1\u0159",
			"\1\u015a\122\uffff\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f\2\uffff\1\u0160\3\uffff\1\u0161",
			"",
			"",
			"",
			"",
			"",
			"\1\u0162\15\uffff\1\u0163",
			"\1\u0164",
			"",
			"",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"",
			"",
			"\1\u016a",
			"",
			"",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d\5\uffff\1\u016e\1\u016f",
			"",
			"",
			"",
			"",
			"\1\u0170\17\uffff\1\u0171",
			"\1\u0172\2\uffff\1\u0173\14\uffff\1\u0174\1\u0175",
			"\1\u0176\6\uffff\1\u0177",
			"",
			"\1\u0178",
			"",
			"",
			"",
			"\1\u0179",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180\5\uffff\1\u0181\1\u0182",
			"\1\u0183\1\u0184\14\uffff\1\u0185\3\uffff\1\u0186",
			"\1\u0187",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0188\12\uffff\1\u0189",
			"",
			"",
			"",
			"\1\u018a\11\uffff\1\u018b",
			"",
			"",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f\17\uffff\1\u0190",
			"\1\u0191",
			"",
			"",
			"",
			"\1\u0192\4\uffff\1\u0193",
			"",
			"",
			"",
			"\1\u0194",
			"",
			"",
			"",
			"",
			"\1\u0195\1\u0196\15\uffff\1\u0197\2\uffff\1\u0198",
			"\1\u0199\2\uffff\1\u019a\6\uffff\1\u019b",
			"\1\u019c",
			"",
			"",
			"\1\u019d",
			"",
			"",
			"\1\u019e\17\uffff\1\u019f\1\u01a0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01a1\6\uffff\1\u01a2",
			"\1\u01a3",
			"",
			"",
			"",
			"",
			"",
			"\1\u01a4",
			"\1\u01a6\17\uffff\1\u01a5",
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
			return "112:23: ( 'Affenpinscher' | 'Afghan Hound' | 'Airedale Terrier' | 'Akita' | 'Alaskan Malamute' | 'American English Coonhound' | 'American Eskimo Dog' | 'American Foxhound' | 'American Staffordshire Terrier' | 'American Water Spaniel' | 'Anatolian Shepherd Dog' | 'Australian Cattle Dog' | 'Australian Shepherd' | 'Australian Terrier' | 'Basenji' | 'Basset Hound' | 'Beagle' | 'Bearded Collie' | 'Beauceron' | 'Bedlington Terrier' | 'Belgian Malinois' | 'Belgian Sheepdog' | 'Belgian Tervuren' | 'Berger Picard' | 'Bernese Mountain Dog' | 'Bichon Frise' | 'Bichons Frise' | 'Black and Tan Coonhound' | 'Black & Tan Coonhound' | 'Black Russian Terrier' | 'Bloodhound' | 'Bluetick Coonhound' | 'Border Collie' | 'Border Terrier' | 'Borzoi' | 'Boston Terrier' | 'Bouvier des Flandres' | 'Bouviers des Flandres' | 'Boxer' | 'Boykin Spaniel' | 'Brace' | 'Briard' | 'Brittany' | 'Brussels Griffon' | 'Bull Terrier' | 'Bulldog' | 'Bullmastiff' | 'Cairn Terrier' | 'Canaan Dog' | 'Cane Corso' | 'Cardigan Welsh Corgi' | 'Cavalier King Charles Spaniel' | 'Cesky Terrier' | 'Chesapeake Bay Retriever' | 'Chihuahua' | 'Chinese Crested' | 'Chinese Shar-Pei' | 'Cirneco dell’Etna' | 'Chow Chow' | 'Clumber Spaniel' | 'Cocker Spaniel' | 'Collie' | 'Curly-Coated Retriever' | 'Dachshund' | 'Dalmatian' | 'Dandie Dinmont Terrier' | 'Doberman Pinscher' | 'Dogo Argentine' | 'Dogue de Bordeaux' | 'Dogues de Bordeaux' | 'English Cocker Spaniel' | 'English Foxhound' | 'English Setter' | 'English Springer Spaniel' | 'English Toy Spaniel' | 'Entlebucher Mountain Dog' | 'Field Spaniel' | 'Finnish Lapphund' | 'Finnish Spitz' | 'Flat-Coated Retriever' | 'Fox Terrier' | 'French Bulldog' | 'German Pinscher' | 'German Shepherd Dog' | 'German Shorthaired Pointer' | 'German Wirehaired Pointer' | 'Giant Schnauzer' | 'Glen of Imaal Terrier' | 'Golden Retriever' | 'Gordon Setter' | 'Great Dane' | 'Great Pyrenees' | 'Greater Swiss Mountain Dog' | 'Greyhound' | 'Harrier' | 'Havanese' | 'Ibizan Hound' | 'Icelandic Sheepdog' | 'Irish Red and White Setter' | 'Irish Setter' | 'Irish Terrier' | 'Irish Water Spaniel' | 'Irish Wolfhound' | 'Italian Greyhound' | 'Japanese Chin' | 'Keeshond' | 'Keeshonden' | 'Kerry Blue Terrier' | 'Komondor' | 'Kuvasz' | 'Kuvaszok' | 'Labrador Retriever' | 'Lagotto Romagnolo' | 'Lakeland Terrier' | 'Leonberger' | 'Lhasa Apso' | 'Löwchen' | 'Lowchen' | 'Maltese' | 'Manchester Terrier' | 'Mastiff' | 'Miniature American Shepherd' | 'Miniature Bull Terrier' | 'Miniature Pinscher' | 'Miniature Schnauzer' | 'Neapolitan Mastiff' | 'Newfoundland' | 'Norfolk Terrier' | 'Norwegian Buhund' | 'Norwegian Elkhound' | 'Norwegian Lundehund' | 'Norwich Terrier' | 'Nova Scotia Duck Tolling Retriever' | 'Old English Sheepdog' | 'Otterhound' | 'Papillon' | 'Parson Russell Terrier' | 'Pekingese' | 'Pembroke Welsh Corgi' | 'Petit Basset Griffon Vendéen' | 'Petits Bassets Griffons Vendeen' | 'Pharaoh Hound' | 'Plott' | 'Pointer' | 'Polish Lowland Sheepdog' | 'Pomeranian' | 'Poodle' | 'Portuguese Podengo Pequenos' | 'Portuguese Water Dog' | 'Pug' | 'Puli' | 'Pulik' | 'Pyrenean Shepherd' | 'Rat Terrier' | 'Redbone Coonhound' | 'Retrievers' | 'Rhodesian Ridgeback' | 'Rottweiler' | 'Russell Terrier' | 'Saint Bernard' | 'Saluki' | 'Samoyed' | 'Schipperke' | 'Scottish Deerhound' | 'Scottish Terrier' | 'Sealyham Terrier' | 'Setters' | 'Shetland Sheepdog' | 'Shiba Inu' | 'Shih Tzu' | 'Siberian Husky' | 'Siberian Huskies' | 'Silky Terrier' | 'Skye Terrier' | 'Soft Coated Wheaten Terrier' | 'Spaniels' | 'Spinone Italiano' | 'Spinoni Italiani' | 'Staffordshire Bull Terrier' | 'Standard Schnauzer' | 'Sussex Spaniel' | 'Swedish Vallhund' | 'Tibetan Mastiff' | 'Tibetan Spaniel' | 'Tibetan Terrier' | 'Toy Fox Terrier' | 'Treeing Walker Coonhound' | 'Vizsla' | 'Weimaraner' | 'Welsh Springer Spaniel' | 'Welsh Terrier' | 'West Highland White Terrier' | 'Whippet' | 'Wire Fox Terrier' | 'Wirehaired Pointing Griffon' | 'Xoloitzcuintli' | 'Yorkshire Terrier' )";
		}
	}

	static final String DFA14_eotS =
		"\65\uffff\1\75\2\uffff\1\101\11\uffff\1\106\1\110\11\uffff";
	static final String DFA14_eofS =
		"\115\uffff";
	static final String DFA14_minS =
		"\1\61\1\63\1\40\1\150\1\156\1\151\1\145\1\162\1\uffff\1\141\3\uffff\1"+
		"\155\1\uffff\1\145\6\uffff\1\143\1\uffff\1\147\2\uffff\1\162\1\154\1\151"+
		"\1\uffff\1\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1\163\1"+
		"\147\1\157\1\145\1\151\1\141\1\150\1\40\1\164\1\150\1\163\1\156\1\40\2"+
		"\uffff\1\150\2\uffff\1\150\1\40\2\uffff\2\40\1\123\2\uffff\1\103\5\uffff";
	static final String DFA14_maxS =
		"\1\127\1\65\1\157\1\165\1\156\1\154\1\157\1\162\1\uffff\1\157\3\uffff"+
		"\1\165\1\uffff\1\151\6\uffff\1\154\1\uffff\1\147\2\uffff\2\162\1\151\1"+
		"\uffff\1\156\1\157\4\uffff\1\162\2\uffff\1\154\1\155\2\uffff\1\163\1\147"+
		"\1\157\1\145\1\151\1\141\2\150\1\164\1\150\1\163\1\156\1\40\2\uffff\1"+
		"\150\2\uffff\1\150\1\40\2\uffff\2\40\1\127\2\uffff\1\123\5\uffff";
	static final String DFA14_acceptS =
		"\10\uffff\1\25\1\uffff\1\31\1\32\1\33\1\uffff\1\40\1\uffff\1\1\1\2\1\3"+
		"\1\4\1\5\1\6\1\uffff\1\11\1\uffff\1\15\1\16\3\uffff\1\26\2\uffff\1\36"+
		"\1\37\1\41\1\42\1\uffff\1\7\1\10\2\uffff\1\21\1\22\15\uffff\1\27\1\30"+
		"\1\uffff\1\44\1\43\2\uffff\1\24\1\23\3\uffff\1\35\1\34\1\uffff\1\12\1"+
		"\17\1\20\1\13\1\14";
	static final String DFA14_specialS =
		"\115\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\1\20\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1"+
			"\11\1\12\1\13\3\uffff\1\14\1\15\1\16\2\uffff\1\17",
			"\1\20\1\uffff\1\21",
			"\1\23\116\uffff\1\22",
			"\1\24\3\uffff\1\25\2\uffff\1\26\5\uffff\1\27",
			"\1\30",
			"\1\31\2\uffff\1\32",
			"\1\33\11\uffff\1\34",
			"\1\35",
			"",
			"\1\36\15\uffff\1\37",
			"",
			"",
			"",
			"\1\40\6\uffff\1\41\1\42",
			"",
			"\1\43\2\uffff\1\44\1\45",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\46\10\uffff\1\47",
			"",
			"\1\50",
			"",
			"",
			"\1\51",
			"\1\52\5\uffff\1\53",
			"\1\54",
			"",
			"\1\55",
			"\1\56",
			"",
			"",
			"",
			"",
			"\1\57",
			"",
			"",
			"\1\60",
			"\1\61",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71\107\uffff\1\72",
			"\1\73",
			"\1\74",
			"\1\76",
			"\1\77",
			"\1\100",
			"",
			"",
			"\1\102",
			"",
			"",
			"\1\103",
			"\1\104",
			"",
			"",
			"\1\105",
			"\1\107",
			"\1\111\3\uffff\1\112",
			"",
			"",
			"\1\113\17\uffff\1\114",
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
			return "324:10: fragment FRAG_BREED_NAME_CATEGORY : ( '13 Inch' | '15 Inch' | 'Boykin' | 'B & P C' | 'Chesapeake Bay' | 'Clumber' | 'Cocker' | 'Colored' | 'Curly-Coated' | 'English' | 'English Cocker' | 'English Springer' | 'Field' | 'Flat-Coated' | 'German Shorthaired' | 'German Wirehaired' | 'Golden' | 'Gordon' | 'Irish' | 'Irish Water' | 'K C & R' | 'Labrador' | 'Long Coat' | 'Longhaired' | 'Miniature' | 'Nova Scotia Duck Tolling' | 'Rough' | 'Smooth' | 'Smooth Coat' | 'Standard' | 'Sussex' | 'Toy' | 'Welsh Springer' | 'White' | 'Wire' | 'Wirehaired' );";
		}
	}

	static final String DFA44_eotS =
		"\1\uffff\27\50\1\36\1\u009d\1\uffff\1\u00a2\3\uffff\11\50\1\uffff\73\50"+
		"\1\uffff\63\50\6\uffff\1\50\1\u009d\1\50\2\uffff\1\u00a2\6\50\1\uffff"+
		"\152\50\1\u01d2\71\50\4\uffff\1\u0214\2\uffff\1\u0214\1\uffff\172\50\1"+
		"\uffff\1\u028c\1\uffff\1\u029d\44\50\1\uffff\2\50\1\uffff\22\50\6\uffff"+
		"\1\50\1\uffff\7\50\1\uffff\13\50\1\u02ec\25\50\1\u0301\1\50\1\u0303\31"+
		"\50\1\u031b\41\50\1\u0337\6\50\1\u033e\5\50\20\uffff\1\u035f\1\uffff\7"+
		"\50\1\uffff\31\50\1\uffff\23\50\4\uffff\1\u0214\1\uffff\23\50\1\uffff"+
		"\6\50\1\u03a6\12\50\1\u03af\2\50\1\uffff\1\50\1\uffff\1\u03b1\15\50\1"+
		"\u03bd\10\50\1\uffff\16\50\1\uffff\6\50\1\u03d2\5\50\1\uffff\6\50\1\uffff"+
		"\3\50\1\u03de\1\50\34\uffff\7\50\1\u0405\33\50\1\u041f\13\50\2\uffff\2"+
		"\50\1\u042e\1\u042f\20\50\1\u043d\1\uffff\10\50\1\uffff\1\50\1\uffff\2"+
		"\50\1\u0445\10\50\1\uffff\6\50\1\u031b\4\50\1\u0452\10\50\1\uffff\4\50"+
		"\1\u045c\4\50\1\u0460\1\50\1\uffff\1\50\36\uffff\7\50\1\uffff\1\u0486"+
		"\4\50\1\u048b\23\50\1\uffff\5\50\1\u049c\5\50\1\uffff\1\50\1\u04a5\2\uffff"+
		"\2\50\1\uffff\12\50\1\uffff\5\50\1\u04b3\1\50\1\uffff\14\50\1\uffff\1"+
		"\u04bd\2\50\1\u04c0\1\u04c1\1\u04c2\3\50\1\uffff\1\u04c4\2\50\1\uffff"+
		"\2\50\32\uffff\1\u04e7\3\uffff\4\50\2\uffff\4\50\1\uffff\2\50\1\u04ef"+
		"\6\50\1\uffff\2\50\1\u031b\1\uffff\2\50\1\uffff\1\50\1\uffff\3\50\2\uffff"+
		"\1\50\1\uffff\12\50\1\u0503\2\50\1\uffff\2\50\1\u0508\1\50\1\u050a\1\u050b"+
		"\2\50\1\u050e\1\uffff\2\50\3\uffff\1\50\1\uffff\1\u0511\2\50\33\uffff"+
		"\3\50\5\uffff\4\50\1\uffff\11\50\2\uffff\2\50\1\u053f\5\50\1\uffff\1\50"+
		"\1\u0543\2\50\1\uffff\1\50\2\uffff\2\50\1\uffff\1\u0548\1\u0549\1\uffff"+
		"\1\u054a\1\50\31\uffff\3\50\3\uffff\1\u0566\1\u0567\1\u0568\3\50\1\u056c"+
		"\2\50\2\uffff\1\50\1\uffff\3\50\1\uffff\1\u0575\3\50\30\uffff\3\50\6\uffff"+
		"\1\50\1\u031b\1\50\1\uffff\1\50\1\u058f\2\uffff\1\50\1\u0593\2\50\1\uffff"+
		"\1\50\20\uffff\3\50\2\uffff\1\50\1\uffff\1\50\1\uffff\1\u058f\1\uffff"+
		"\1\50\2\uffff\1\u05af\17\uffff\1\u05be\1\50\1\u05c0\2\uffff\2\50\1\u058f"+
		"\1\uffff\1\u0390\1\uffff\1\u05c5\16\uffff\1\50\3\uffff\1\u05d4\2\uffff"+
		"\1\u05d6\13\uffff\1\50\2\uffff\1\u058f\1\uffff\1\u05e2\10\uffff\1\50\11"+
		"\uffff\1\50\1\uffff\1\u05f5\6\uffff\1\50\6\uffff\1\u05ff\20\uffff";
	static final String DFA44_eofS =
		"\u060b\uffff";
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
		"\1\55\1\145\1\150\1\145\1\164\1\163\1\162\2\164\1\145\1\147\1\154\2\147"+
		"\1\150\1\143\1\157\1\145\1\144\1\164\1\166\1\145\1\153\1\143\1\141\1\163"+
		"\1\154\1\124\1\162\1\141\1\144\1\141\1\153\1\163\1\150\1\167\1\156\1\155"+
		"\1\153\1\11\1\154\1\11\1\150\1\155\1\144\1\145\1\157\3\154\1\156\1\164"+
		"\1\40\1\156\1\144\1\104\1\155\2\156\2\144\1\141\1\125\1\162\1\141\1\104"+
		"\1\116\1\172\1\154\1\163\1\154\1\141\1\163\1\162\1\157\1\141\1\162\1\157"+
		"\1\145\1\156\1\163\1\143\1\103\1\151\1\163\1\151\1\142\1\151\1\162\1\164"+
		"\1\156\1\151\1\145\1\144\1\164\1\11\1\151\1\145\1\40\1\142\1\162\1\144"+
		"\1\164\1\163\1\125\1\107\1\156\1\165\1\157\1\165\1\151\1\164\1\154\2\164"+
		"\1\142\1\145\1\153\1\145\1\164\2\156\1\146\1\163\2\144\1\122\1\105\1\104"+
		"\1\125\1\145\1\40\1\145\1\122\1\40\1\163\1\123\1\162\1\122\1\163\1\145"+
		"\1\105\1\111\1\155\1\163\1\164\1\156\1\160\1\145\1\113\1\116\1\157\1\153"+
		"\4\11\1\46\2\11\1\46\1\11\1\55\1\11\2\145\1\150\1\141\2\11\1\141\1\101"+
		"\1\40\1\162\1\143\1\40\1\157\1\145\2\157\1\123\1\156\1\141\1\144\1\141"+
		"\1\153\1\151\1\157\1\162\1\156\1\145\1\154\1\144\1\143\2\151\2\145\1\157"+
		"\1\153\1\144\1\164\1\145\2\157\1\151\1\162\1\151\1\145\1\162\1\164\1\163"+
		"\2\40\1\156\1\141\1\40\1\151\1\154\1\171\1\141\1\165\1\145\1\40\1\145"+
		"\1\142\1\145\1\151\1\171\1\163\1\141\1\151\1\162\1\40\1\145\1\151\1\145"+
		"\1\151\1\144\1\151\1\55\1\143\1\141\1\101\1\141\1\164\1\40\1\145\1\157"+
		"\1\164\1\150\1\120\1\151\1\156\1\111\1\104\2\141\1\150\1\151\1\156\1\150"+
		"\1\171\1\156\1\163\1\141\1\164\1\154\1\142\1\141\1\150\1\110\1\154\1\157"+
		"\1\156\1\162\1\164\1\141\2\164\1\163\1\162\1\154\1\165\1\0\1\11\1\46\1"+
		"\11\1\156\1\157\1\151\1\145\1\167\1\145\1\114\1\11\1\164\1\153\1\171\1"+
		"\162\1\160\1\164\1\171\1\145\1\154\1\141\1\40\1\162\1\171\2\40\1\151\1"+
		"\157\1\146\1\144\1\145\1\141\1\151\1\160\1\124\1\120\1\101\1\122\1\164"+
		"\1\106\1\151\1\111\1\uffff\1\144\1\104\1\163\1\123\1\154\1\162\1\122\1"+
		"\105\1\141\1\150\1\40\1\145\1\160\1\40\1\111\1\105\1\151\1\163\4\11\1"+
		"\uffff\1\11\1\60\1\uffff\1\162\1\146\1\163\1\145\1\164\1\171\1\131\1\uffff"+
		"\1\150\1\145\1\154\1\147\1\143\1\154\1\165\1\120\1\160\1\156\1\141\1\11"+
		"\1\141\1\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\162\1\163\1\156"+
		"\1\40\1\150\1\151\1\162\1\151\1\156\1\145\1\11\1\156\1\11\1\144\1\141"+
		"\1\145\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143"+
		"\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\1\40\1\163\1\142\1\41"+
		"\1\145\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\40\1\157"+
		"\1\40\2\145\1\116\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1"+
		"\144\1\164\1\141\1\145\1\40\1\145\1\41\1\154\1\156\1\147\1\157\1\40\1"+
		"\157\1\11\1\145\1\150\1\141\1\145\1\147\1\0\20\11\1\0\1\145\1\156\1\145"+
		"\1\163\1\145\1\154\1\101\1\uffff\1\40\1\151\1\145\1\144\1\160\1\151\1"+
		"\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1\157\1\141\1\170\1\171\2"+
		"\163\1\111\1\123\1\131\1\104\1\141\1\uffff\1\156\1\105\1\141\1\101\1\144"+
		"\1\104\2\141\1\101\1\124\1\162\1\40\1\163\1\145\1\141\1\116\1\123\1\164"+
		"\1\150\6\11\1\55\1\40\1\146\1\145\1\163\1\165\2\54\1\157\1\40\1\153\1"+
		"\151\1\150\1\151\1\156\1\117\1\151\1\40\1\154\1\0\1\156\1\141\1\151\1"+
		"\154\1\151\1\40\1\11\1\144\1\162\1\147\1\156\1\40\1\145\1\40\1\157\1\143"+
		"\1\40\1\11\1\40\1\162\1\0\1\40\1\0\1\11\1\156\1\154\1\147\1\163\1\40\1"+
		"\141\2\145\1\150\1\145\1\157\1\162\1\40\1\11\1\103\1\165\1\151\1\40\1"+
		"\141\1\40\1\150\1\165\1\uffff\1\163\1\150\1\157\1\40\2\54\3\40\1\162\1"+
		"\165\1\162\1\163\1\107\1\uffff\1\40\1\144\1\156\1\163\1\156\1\157\1\11"+
		"\2\157\1\156\1\162\1\156\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0"+
		"\1\162\1\40\1\156\1\11\1\165\33\11\1\0\1\141\1\145\1\166\2\151\1\154\1"+
		"\122\1\11\1\144\1\141\1\145\1\163\1\141\1\163\1\156\1\141\1\154\1\145"+
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
		"\162\1\144\1\0\2\11\1\0\1\11\1\40\31\11\1\143\1\162\1\141\6\11\1\151\1"+
		"\163\1\123\1\11\1\40\1\156\2\11\1\60\1\0\1\144\1\107\1\145\1\0\1\11\1"+
		"\144\2\40\3\0\25\11\1\157\1\164\1\143\3\11\3\0\1\162\1\41\1\40\1\0\1\164"+
		"\1\46\2\11\1\60\1\11\1\40\1\162\1\0\1\40\20\11\1\142\1\151\1\153\2\11"+
		"\1\145\1\uffff\1\154\1\uffff\1\46\1\11\1\60\1\0\1\uffff\20\11\1\41\1\55"+
		"\1\41\2\11\1\40\1\151\1\46\1\11\1\46\1\0\1\46\15\11\1\0\1\103\1\0\4\11"+
		"\1\0\1\46\13\11\1\157\1\11\1\0\1\46\1\0\1\46\10\11\1\154\1\11\1\0\7\11"+
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
		"\1\162\1\156\1\145\1\154\1\144\1\143\2\151\2\145\1\157\1\153\1\144\1\164"+
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
		"\143\1\154\1\141\1\152\1\164\3\145\1\156\1\141\1\162\1\163\1\156\1\40"+
		"\1\150\1\151\1\162\1\151\1\156\1\145\1\u2019\1\156\1\u2019\1\144\1\141"+
		"\1\145\1\157\1\141\1\40\1\156\1\147\1\151\1\40\1\160\1\141\1\163\1\143"+
		"\1\145\1\162\1\145\1\55\1\150\1\164\1\145\1\155\2\163\1\142\1\u2019\1"+
		"\145\1\40\1\163\1\103\1\150\1\171\1\131\1\156\1\40\2\156\1\145\1\157\1"+
		"\40\2\145\1\116\1\40\2\156\1\40\1\141\1\145\1\157\1\40\1\144\1\172\1\144"+
		"\1\164\1\141\1\145\1\40\1\145\1\u2019\1\154\1\156\1\147\1\157\1\163\1"+
		"\157\1\u2019\1\145\1\150\1\141\1\145\1\147\1\0\1\u2019\1\71\16\u2019\1"+
		"\0\1\145\1\156\1\145\1\163\1\145\1\154\1\101\1\uffff\1\40\1\151\1\145"+
		"\1\144\1\160\1\151\1\150\1\162\1\141\1\40\1\151\1\40\1\145\1\156\1\157"+
		"\1\141\1\170\1\171\2\163\1\111\1\123\1\131\1\104\1\141\1\uffff\1\156\1"+
		"\105\1\141\1\101\1\144\1\104\2\141\1\101\1\124\1\162\1\40\1\163\1\145"+
		"\1\141\1\116\1\123\1\164\1\150\1\u2019\1\51\1\u2019\1\51\1\u2019\2\71"+
		"\1\40\1\146\1\145\1\163\1\165\2\54\1\157\1\40\1\153\1\151\1\150\1\151"+
		"\1\156\1\117\1\151\1\40\1\154\1\0\1\156\1\141\1\151\1\154\1\151\1\40\1"+
		"\u2019\1\144\1\162\1\147\1\156\1\40\1\145\1\163\1\157\1\143\1\40\1\u2019"+
		"\1\40\1\162\1\0\1\40\1\0\1\u2019\1\156\1\154\1\147\1\163\1\40\1\141\2"+
		"\145\1\150\1\145\1\157\1\162\1\40\1\u2019\1\103\1\165\1\151\1\40\1\141"+
		"\1\40\1\150\1\165\1\uffff\1\163\1\150\1\157\1\40\2\54\3\40\1\162\1\165"+
		"\1\162\1\163\1\107\1\uffff\1\40\1\144\1\156\1\163\1\156\1\157\1\u2019"+
		"\2\157\1\156\1\162\1\156\1\uffff\1\157\1\40\1\145\1\153\1\40\1\150\1\0"+
		"\1\162\1\40\1\156\1\u2019\1\165\1\u2019\2\71\30\u2019\1\0\1\141\1\145"+
		"\1\166\2\151\1\154\1\122\1\u2019\1\144\1\141\1\145\1\163\1\141\1\163\1"+
		"\156\1\141\1\154\1\151\2\162\1\40\1\54\1\150\1\164\1\116\1\124\1\54\1"+
		"\101\1\156\1\147\1\122\1\171\1\131\1\141\1\101\1\u2019\1\156\1\116\1\131"+
		"\1\141\1\144\1\164\1\151\1\107\1\104\1\172\1\151\1\51\1\uffff\2\71\2\u2019"+
		"\1\164\1\162\1\40\1\165\1\40\1\141\1\40\1\164\1\144\1\122\1\156\1\145"+
		"\1\40\1\156\1\141\1\151\1\u2019\1\0\1\40\1\157\1\164\3\40\1\165\1\153"+
		"\1\0\1\163\1\0\1\171\1\163\1\u2019\1\164\1\156\1\162\1\141\1\165\3\40"+
		"\1\0\1\157\1\156\1\141\1\156\1\40\1\143\1\u2019\1\40\1\141\1\40\1\156"+
		"\1\u2019\1\145\1\40\1\151\1\40\1\145\1\144\1\162\1\153\1\0\1\162\1\40"+
		"\1\144\1\147\1\u2019\1\156\1\163\1\145\1\40\1\u2019\1\151\1\0\1\145\36"+
		"\u2019\1\156\1\40\1\145\1\141\1\154\2\40\1\0\1\u2019\1\171\1\162\1\150"+
		"\1\155\1\u2019\1\144\1\156\1\163\2\40\2\144\1\40\1\141\1\107\1\101\1\131"+
		"\3\40\2\54\1\171\1\131\1\0\1\163\2\40\1\156\1\141\1\u2019\1\162\1\40\1"+
		"\101\1\143\1\162\1\u2019\1\71\1\u2019\2\0\2\145\1\uffff\2\156\1\141\1"+
		"\154\1\124\1\163\2\40\1\156\1\141\1\0\1\156\1\157\1\156\2\40\1\u2019\1"+
		"\40\1\0\1\151\2\40\1\153\2\141\1\144\1\156\1\40\1\150\1\164\1\144\1\0"+
		"\1\u2019\1\143\1\40\3\u2019\2\40\1\145\1\0\1\u2019\1\145\1\40\1\0\1\141"+
		"\1\163\36\u2019\1\40\1\162\1\156\1\145\1\uffff\1\0\1\54\1\153\2\40\1\0"+
		"\2\40\1\u2019\1\163\1\40\1\153\1\40\1\113\1\54\1\uffff\2\54\1\u2019\1"+
		"\uffff\1\145\1\171\1\0\1\145\1\uffff\1\131\1\165\1\145\2\u2019\1\55\1"+
		"\uffff\1\162\1\40\1\144\1\40\1\156\1\141\1\111\1\143\1\40\1\156\1\u2019"+
		"\1\156\1\144\1\0\1\146\1\145\1\u2019\1\164\2\u2019\2\145\1\u2019\1\0\1"+
		"\40\1\156\3\0\1\162\1\0\1\u2019\1\156\1\145\1\51\32\u2019\1\163\1\141"+
		"\1\154\1\u2019\1\0\3\u2019\1\163\1\40\1\162\1\145\1\0\1\150\1\145\1\105"+
		"\1\162\1\54\1\144\1\54\1\151\1\40\2\u2019\1\71\1\40\1\u2019\1\40\1\156"+
		"\1\116\1\150\1\40\1\0\1\40\1\u2019\1\146\1\40\1\0\1\145\2\0\1\162\1\144"+
		"\1\0\2\u2019\1\0\1\u2019\1\40\31\u2019\1\143\1\162\1\141\6\u2019\1\151"+
		"\1\163\1\123\1\u2019\1\40\1\156\2\u2019\1\71\1\0\1\144\1\107\1\145\1\0"+
		"\1\u2019\1\144\2\40\3\0\25\u2019\1\157\1\164\1\143\3\u2019\3\0\1\162\1"+
		"\u2019\1\40\1\0\1\164\3\u2019\1\71\1\u2019\1\40\1\162\1\0\1\40\20\u2019"+
		"\1\142\1\151\1\153\2\u2019\1\145\1\uffff\1\154\1\uffff\2\u2019\1\71\1"+
		"\0\1\uffff\21\u2019\1\55\3\u2019\1\40\1\151\3\u2019\1\0\16\u2019\1\0\1"+
		"\103\1\0\4\u2019\1\0\14\u2019\1\157\1\u2019\1\0\1\u2019\1\0\11\u2019\1"+
		"\154\1\u2019\1\0\7\u2019\1\157\10\u2019\1\162\1\u2019\1\0\11\u2019\1\0"+
		"\13\u2019";
	static final String DFA44_acceptS =
		"\32\uffff\1\11\1\uffff\2\22\1\23\11\uffff\1\22\73\uffff\1\2\67\uffff\1"+
		"\21\1\17\3\uffff\1\11\1\16\7\uffff\1\10\u0152\uffff\1\5\26\uffff\1\20"+
		"\2\uffff\1\14\7\uffff\1\1\u0085\uffff\1\12\31\uffff\1\5\133\uffff\1\3"+
		"\16\uffff\1\5\14\uffff\1\6\130\uffff\1\13\u00a1\uffff\1\15\122\uffff\1"+
		"\5\17\uffff\1\5\3\uffff\1\5\4\uffff\1\5\6\uffff\1\7\u00e7\uffff\1\5\1"+
		"\uffff\1\4\4\uffff\1\5\166\uffff";
	static final String DFA44_specialS =
		"\1\67\16\uffff\1\u00aa\21\uffff\1\u0096\1\u00eb\1\105\1\u00c0\43\uffff"+
		"\1\112\1\u00b4\137\uffff\1\106\1\uffff\1\u00bf\4\uffff\1\u00e2\54\uffff"+
		"\1\120\1\uffff\1\111\12\uffff\1\u0099\52\uffff\1\51\2\uffff\1\u00d3\43"+
		"\uffff\1\u00ca\41\uffff\1\u00b5\1\104\5\uffff\1\u00e3\44\uffff\1\u00d0"+
		"\1\u00cd\2\uffff\1\22\6\uffff\1\u00ae\11\uffff\1\u00a8\14\uffff\1\122"+
		"\45\uffff\1\132\1\u009c\1\uffff\1\u00e5\22\uffff\1\u00c7\2\uffff\1\u00bc"+
		"\1\u00bd\15\uffff\1\u00be\15\uffff\1\37\2\uffff\1\u00e9\37\uffff\1\u00d6"+
		"\16\uffff\1\101\6\uffff\1\u00ef\1\uffff\1\u00ee\5\uffff\1\24\3\uffff\1"+
		"\30\14\uffff\1\u00d9\4\uffff\1\u0094\6\uffff\1\124\2\uffff\1\46\5\uffff"+
		"\1\u00cc\2\uffff\1\56\3\uffff\1\74\6\uffff\1\102\6\uffff\1\45\1\uffff"+
		"\1\54\5\uffff\1\131\17\uffff\1\61\1\130\10\uffff\1\u00cf\10\uffff\1\u00c6"+
		"\1\uffff\1\u00b9\31\uffff\1\u00f1\36\uffff\1\0\1\uffff\1\127\5\uffff\1"+
		"\3\1\u00c2\4\uffff\1\17\1\uffff\1\u00a5\2\uffff\1\u0095\1\u00f2\1\36\1"+
		"\uffff\1\133\1\43\1\134\1\u00ed\4\uffff\1\23\7\uffff\1\u00ac\1\u00dc\3"+
		"\uffff\1\u00a2\1\uffff\1\u00a4\6\uffff\1\u009a\2\uffff\1\u00df\1\126\1"+
		"\125\6\uffff\1\115\5\uffff\1\u0093\7\uffff\1\u00e1\2\uffff\1\u00dd\1\uffff"+
		"\1\135\1\uffff\1\u00d7\1\uffff\1\52\34\uffff\1\136\7\uffff\1\64\14\uffff"+
		"\1\u00b2\16\uffff\1\72\17\uffff\1\32\1\26\4\uffff\1\u00ea\1\uffff\1\u00e4"+
		"\5\uffff\1\2\3\uffff\1\u00c3\1\137\1\4\2\uffff\1\113\1\20\1\16\2\uffff"+
		"\1\140\1\123\1\141\2\uffff\1\u00e6\5\uffff\1\u00f0\1\u00af\1\u00ad\1\142"+
		"\4\uffff\1\u00bb\2\uffff\1\u00ba\1\uffff\1\114\1\uffff\1\7\1\uffff\1\u009d"+
		"\1\uffff\1\107\4\uffff\1\143\1\uffff\1\77\2\uffff\1\27\3\uffff\1\u00db"+
		"\1\55\1\uffff\1\144\40\uffff\1\u00d5\3\uffff\1\u00d2\1\uffff\1\145\1\65"+
		"\4\uffff\1\62\3\uffff\1\u00b6\1\u00b8\2\uffff\1\u00b3\4\uffff\1\121\1"+
		"\33\1\u009b\4\uffff\1\146\1\u00d1\4\uffff\1\70\1\uffff\1\u00cb\6\uffff"+
		"\1\147\1\150\11\uffff\1\1\1\117\2\uffff\1\151\3\uffff\1\12\1\35\1\u00e8"+
		"\1\40\1\152\1\uffff\1\34\1\31\5\uffff\1\u00a9\3\uffff\1\153\1\6\1\uffff"+
		"\1\110\1\u009f\1\15\1\21\1\76\1\100\1\uffff\1\154\1\50\1\uffff\1\u00de"+
		"\1\155\34\uffff\1\u00a6\3\uffff\1\u00d4\4\uffff\1\156\2\uffff\1\u00a7"+
		"\1\u00c1\1\157\1\u00c4\1\75\1\66\1\uffff\1\u00b1\1\uffff\1\u00c9\11\uffff"+
		"\1\160\12\uffff\1\71\1\uffff\1\u00b7\4\uffff\1\5\1\uffff\1\u00c5\2\uffff"+
		"\1\161\2\uffff\1\u00e0\1\uffff\1\u00da\1\u00d8\2\uffff\1\10\1\162\1\116"+
		"\1\uffff\1\163\1\164\1\165\1\uffff\1\166\1\47\41\uffff\1\167\4\uffff\1"+
		"\u00ce\2\uffff\1\170\10\uffff\1\11\3\uffff\1\u00f4\1\44\1\u00ec\3\uffff"+
		"\1\u009e\1\171\1\13\1\u00f3\1\uffff\1\u00ab\1\172\1\uffff\1\173\1\174"+
		"\2\uffff\1\175\1\14\1\25\1\176\1\53\1\u00a1\37\uffff\1\60\1\57\1\63\3"+
		"\uffff\1\73\1\42\4\uffff\1\177\3\uffff\1\u0080\1\u00e7\1\uffff\1\u00a0"+
		"\1\u0098\1\u0081\1\u0082\1\u0083\33\uffff\1\u0084\1\u0085\1\u0086\3\uffff"+
		"\1\u0087\5\uffff\1\41\1\u00c8\1\uffff\1\u0088\1\u00a3\34\uffff\1\u0089"+
		"\1\uffff\1\u0097\24\uffff\1\u00b0\4\uffff\1\u008a\16\uffff\1\u008b\1\uffff"+
		"\1\u008c\2\uffff\1\103\1\uffff\1\u008d\16\uffff\1\u008e\1\uffff\1\u008f"+
		"\13\uffff\1\u0090\22\uffff\1\u0091\11\uffff\1\u0092\13\uffff}>";
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
			"\1\u017a\6\uffff\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180\25\uffff\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187\22\uffff\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d\3\uffff\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193\5\uffff\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa\113\uffff\1\u0199",
			"\1\u019a",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f\5\uffff\1\u01a0",
			"\1\u01a1",
			"\1\u01a2\5\uffff\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\144",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af\27\uffff\1\u01b0",
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
			"\1\u01d1",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u01d5",
			"\1\u01d6",
			"\1\144",
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
			"\1\u01e7\5\uffff\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef\7\uffff\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3\1\u01f4",
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
			"\1\u020f",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u0151\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\22\u0150\1\u0210\7\u0150\u1f9e"+
			"\uffff\1\u0150",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u0151\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\32\u0150\u1f9e\uffff\1\u0150",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\5\uffff\2\u0211\4\uffff\2"+
			"\u0211\2\uffff\12\u0212\2\u0211\5\uffff\32\u0213\4\uffff\1\u0211\1\uffff"+
			"\32\u0211\u1f9e\uffff\1\u0211",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\10\uffff\1\u0156\6\uffff\12"+
			"\u0215",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\5\uffff\2\u0211\1\uffff\1"+
			"\u009c\2\uffff\2\u0211\2\uffff\12\u0212\2\u0211\5\uffff\32\u0213\4\uffff"+
			"\1\u0211\1\uffff\32\u0211\u1f9e\uffff\1\u0211",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153",
			"\1\u0216\2\uffff\12\u0158",
			"\2\u0217\2\uffff\1\u0217\22\uffff\1\u0217\17\uffff\12\u0159",
			"\1\u0218\3\uffff\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\2\u00aa\2\uffff\1\u00aa\22\uffff\1\u00aa",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\144",
			"\1\u0222",
			"\1\u0223\3\uffff\1\u0224",
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
			"\1\u0245",
			"\1\u0246",
			"\1\144\103\uffff\1\u0247\10\uffff\1\u0248",
			"\1\u01fd",
			"\1\u0249",
			"\1\u024a",
			"\1\144",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\144",
			"\1\u0251",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\144",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025e\17\uffff\1\u025d",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\144",
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
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\4\uffff\2\50\2\uffff\1\50\1\u028e\12\50\5\uffff\1\50\1\u028f\1"+
			"\u0290\1\50\1\u0291\1\u0292\1\u0293\1\50\1\u0294\1\50\1\u0295\1\u0296"+
			"\1\u028d\1\u0297\3\50\1\u0298\1\u0299\1\u029a\2\50\1\u029b\3\50\4\uffff"+
			"\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u029c\7\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
			"\1\u02a4",
			"\2\u02a5\2\uffff\1\u02a5\22\uffff\1\u02a5",
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
			"\1\144",
			"\1\u02b0",
			"\1\u02b1",
			"\1\144",
			"\1\144",
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
			"\1\u02bd",
			"\1\u02be",
			"\1\144\17\uffff\1\u02bf",
			"\1\u02c0",
			"\1\u02c1",
			"",
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
			"\1\144",
			"\1\u02cc",
			"\1\u02cd",
			"\1\144\107\uffff\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u0151\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\2\u0150\1\u02d3\27\u0150\u1f9e"+
			"\uffff\1\u0150",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d4\4\uffff\2\u0211\1"+
			"\uffff\1\u0153\2\uffff\2\u0211\1\u02d4\13\uffff\2\u0211\3\uffff\1\u02d4"+
			"\37\uffff\1\u0211\1\uffff\32\u0211\u1f9e\uffff\1\u0211",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153\6\uffff\12"+
			"\u0212",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\32\u02d5\u1f9e\uffff\1\u02d5",
			"",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\10\uffff\1\u02d7\6\uffff\12"+
			"\u02d8",
			"\12\u02d9",
			"",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\1\u02df",
			"\1\u02e0",
			"",
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
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
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
			"\1\u02fa",
			"\1\144",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0302",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"\1\u0308",
			"\1\144",
			"\1\u0309",
			"\1\u030a",
			"\1\u030b",
			"\1\144",
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
			"\1\u0316",
			"\1\u0317",
			"\1\144\122\uffff\1\u0318",
			"\1\u0319",
			"\1\u031a",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u031c",
			"\1\144",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\144",
			"\1\u0323",
			"\1\u0324",
			"\1\144\104\uffff\1\u0325",
			"\1\u0326",
			"\1\u02a5",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\144",
			"\1\u032d",
			"\1\u032e",
			"\1\u032f",
			"\1\144",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\1\144",
			"\1\u0336",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u0338",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"\1\144\122\uffff\1\u033c",
			"\1\u033d",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0344\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\10\uffff\1\50\6\uffff\3\50\1\u0345"+
			"\1\50\1\u0346\4\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0348\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\16\50\1\u0347\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0349\3\50\1\u034a\2\50\1\u034b\5\50\1\u034c\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u034d\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u034e\2\50\1\u034f\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0350\11\50\1\u0351\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0352\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0353\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0354"+
			"\15\50\1\u0355\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0356\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0357\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u0358\6\50\1\u0359\1\u035a\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u035b\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u035c\2\50\1\u035d\1\u035e\21\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\1\u0364",
			"\1\u0365",
			"\1\u0366",
			"",
			"\1\144",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\144",
			"\1\u036f",
			"\1\144",
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
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"",
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
			"\1\144",
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\1\u038b",
			"\1\u038c",
			"\1\u038d",
			"\1\u038e",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u0151\4\uffff\2\u0150\1"+
			"\uffff\1\u0153\2\uffff\2\u0150\1\u038f\13\uffff\2\u0150\3\uffff\1\u0151"+
			"\1\uffff\32\u0150\4\uffff\1\u0150\1\uffff\32\u0150\u1f9e\uffff\1\u0150",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\32\u02d5\u1f9e\uffff\1\u02d5",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\10\uffff\1\u0153",
			"\2\u0390\2\uffff\1\u0390\22\uffff\1\u0390\5\uffff\3\50\3\uffff\3\50"+
			"\1\uffff\12\u0391\2\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\10\uffff\1\u0156\6\uffff\12"+
			"\u02d8",
			"\1\u0392\2\uffff\12\u02d9",
			"\1\u021f",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\1\u0397",
			"\1\u0398",
			"\1\u021f",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\144",
			"\1\u03a0",
			"\1\uffff",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\144",
			"\1\u03ab",
			"\1\144\122\uffff\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u03b0",
			"\1\uffff",
			"\1\144",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\144",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u03be",
			"\1\u03bf",
			"\1\u03c0",
			"\1\144",
			"\1\u03c1",
			"\1\144",
			"\1\u03c2",
			"\1\u03c3",
			"",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\1\144",
			"\1\u0397",
			"\1\u0397",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\u03c7",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"\1\u03cb",
			"",
			"\1\144",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\1\u03d0",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u03d1\3\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u03d3",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u03d6",
			"\1\u03d7",
			"",
			"\1\u03d8",
			"\1\144",
			"\1\u03d9",
			"\1\u03da",
			"\1\144",
			"\1\u03db",
			"\1\uffff",
			"\1\u03dc",
			"\1\144",
			"\1\u03dd",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u03df",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u03e1\4\50\1\u03e0\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u03e2\10\uffff\1\50\6\uffff\12\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u03e3\10\uffff\1\50\6\uffff\12\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u03e4\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\1\u03e5\1\50\4\uffff\2\50\2"+
			"\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u03e6\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u03e7\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u03e8\10\50\1\u03e9\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03ea\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u03eb\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u03ec\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u03ed"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03ee\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u03ef\5\50\1\u03f0\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u03f1\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u03f2\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\50"+
			"\1\u03f3\30\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u03f4\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\25"+
			"\50\1\u03f5\4\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u03f6\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u03f7\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u03f8"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u03f9\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u03fa\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u03fb\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u03fc\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u03fd\10\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u03fe",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\1\u0409",
			"\1\u040a",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"\1\u040e",
			"\1\u040f\3\uffff\1\u0410",
			"\1\u0411",
			"\1\u0412",
			"\1\144",
			"\1\u0397",
			"\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"\1\u0397",
			"\1\u0417",
			"\1\u0418",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\1\u041c",
			"\1\u041d",
			"\1\u041e",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0420",
			"\1\u0421",
			"\1\u0422",
			"\1\u0423",
			"\1\u0424",
			"\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"\1\u0428",
			"\1\u0429",
			"\1\u042a",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u042b\10\uffff\1\u0153",
			"",
			"\12\u042c",
			"\12\u042d",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0430",
			"\1\u0431",
			"\2\u0432\2\uffff\1\u0432\22\uffff\1\u0432",
			"\1\u0433",
			"\1\144",
			"\1\u0434",
			"\1\144",
			"\1\u0435",
			"\1\u0436",
			"\1\u0437",
			"\1\u0438",
			"\1\u0439",
			"\1\144",
			"\1\u043a",
			"\1\u043b",
			"\1\u043c",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\144",
			"\1\u043e",
			"\1\u043f",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\u0440",
			"\1\u0441",
			"\1\uffff",
			"\1\144\122\uffff\1\u0442",
			"\1\uffff",
			"\1\u0443",
			"\1\u0444",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0446",
			"\1\u0447",
			"\1\u0448",
			"\1\u0449",
			"\1\u044a",
			"\1\144",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d",
			"\1\u044e",
			"\1\144",
			"\1\u044f",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u0450",
			"\1\144",
			"\1\u0451",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0453",
			"\1\u032a",
			"\1\u0454",
			"\1\144",
			"\1\u0455",
			"\1\u0456",
			"\1\u0457",
			"\1\u0458",
			"\1\uffff",
			"\1\u0459",
			"\1\144",
			"\1\u045a",
			"\1\u045b",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u045d",
			"\1\u045e",
			"\1\u045f",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0461",
			"\1\uffff",
			"\1\u0462",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u0463\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0464\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\10\50\1\u0465\21\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\10\50\1\u0466\21\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u0467\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0468\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\37\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0469\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u046a\15\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u046b\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u046c\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u046d\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u046e\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u046f\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0470\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\14"+
			"\50\1\u0471\15\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0472\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0473\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u0474\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0475\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0476\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0477\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0478"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0479\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u047a\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u047b\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u047c\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u047e\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u047f\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0480\25\50\u1f9e\uffff\1\50",
			"\1\u0481",
			"\1\144",
			"\1\u0482",
			"\1\u0483",
			"\1\u0484",
			"\1\144",
			"\1\u0485",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0487",
			"\1\u0488",
			"\1\u0489",
			"\1\u048a",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u048c",
			"\1\u048d",
			"\1\u048e",
			"\1\144",
			"\1\144",
			"\1\u048f",
			"\1\u0490",
			"\1\144",
			"\1\u0491",
			"\1\u0492",
			"\1\u0493",
			"\1\u0494",
			"\1\144",
			"\1\144",
			"\1\u0495",
			"\1\u0397",
			"\1\u0397",
			"\1\u0496",
			"\1\u0497",
			"\1\uffff",
			"\1\144\122\uffff\1\u0498",
			"\1\u0499",
			"\1\u0337",
			"\1\u049a",
			"\1\u049b",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u049d",
			"\1\u049e",
			"\1\u049f",
			"\1\u04a0",
			"\1\u04a1",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\5\uffff\2\u0211\4\uffff\2"+
			"\u0211\2\uffff\12\u0212\2\u0211\5\uffff\1\u0213\1\u04a3\1\u0213\1\u04a2"+
			"\26\u0213\4\uffff\1\u0211\1\uffff\32\u0211\u1f9e\uffff\1\u0211",
			"\12\u04a4",
			"\3\50\3\uffff\3\50\1\uffff\12\u042d\2\50\5\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\uffff",
			"\1\u04a6",
			"\1\u04a7",
			"",
			"\1\u04a8",
			"\1\u04a9",
			"\1\u04aa",
			"\1\u04ab",
			"\1\u04ac",
			"\1\u04ad",
			"\1\144",
			"\1\144",
			"\1\u04ae",
			"\1\u04af",
			"\1\uffff",
			"\1\u04b0",
			"\1\u04b1",
			"\1\u04b2",
			"\1\144",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\uffff",
			"\1\u04b4",
			"\1\144",
			"\1\144",
			"\1\u04b5",
			"\1\u04b6",
			"\1\u04b7",
			"\1\u04b8",
			"\1\u04b9",
			"\1\144",
			"\1\u04ba",
			"\1\u04bb",
			"\1\u04bc",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u04be",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4"+
			"\50\1\u04bf\15\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\144",
			"\1\u04c3",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u04c5",
			"\1\144",
			"\1\uffff",
			"\1\u04c6",
			"\1\u04c7",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\2"+
			"\50\1\u04c8\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04c9"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u04ca\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u04cb\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u04cc\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\17\50\1\u04cd\12\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04ce"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\50"+
			"\1\u04cf\30\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04d0\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u04d1\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u04d2\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u04d3\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u04d4\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\1"+
			"\50\1\u04d5\1\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04d6"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04d7\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u04d8\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04d9\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\1\u04da\1\50\4\uffff\2\50\2"+
			"\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u04db"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u04dc\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\7\50\1\u04dd\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u04de\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04df\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u04e0\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u04e1\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04e2\25\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\5\uffff\2\50\1\u04e6\3\uffff\3\50"+
			"\1\uffff\14\50\5\uffff\1\u04e3\1\u04e5\15\50\1\u04e4\12\50\4\uffff\1"+
			"\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u04e8\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u04e9\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7"+
			"\50\1\u04ea\22\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u04eb",
			"\1\u04ec",
			"\1\u04ed",
			"",
			"\1\uffff",
			"\1\u0397",
			"\1\u04ee",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\144",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u04f0",
			"\1\144",
			"\1\u04f1",
			"\1\u049e",
			"\1\u04f2",
			"\1\u0397",
			"",
			"\1\u0397",
			"\1\u0397",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"",
			"\1\u04f3",
			"\1\u04f4",
			"\1\uffff",
			"\1\u04f5",
			"",
			"\1\u04f6",
			"\1\u04f7",
			"\1\u04f8",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\16\u02d5\1\u04f9\13\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\10\u02d5\1\u04fa\21\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\1\u04fb",
			"",
			"\1\u04fc",
			"\1\144",
			"\1\u04fd",
			"\1\144",
			"\1\u04fe",
			"\1\u04ff",
			"\1\u0500",
			"\1\u0501",
			"\1\144",
			"\1\u0502",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0504",
			"\1\u0505",
			"\1\uffff",
			"\1\u0506",
			"\1\u0507",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0509",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u050c",
			"\1\u050d",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\144",
			"\1\u050f",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0510",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0512",
			"\1\u0513",
			"\2\50\2\uffff\1\50\22\uffff\1\u0514\10\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0515\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u0516\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u0517\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0518\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0519\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u051a\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u051b\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u051c\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u051d\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\1"+
			"\50\1\u051e\1\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u051f\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\2\50\1\u0520\27\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0521\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0522\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0523\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0524\1\50\4\uffff\2\50\1\uffff\1\u047d"+
			"\2\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1"+
			"\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0525\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\37\uffff\1\50\1\uffff\32\50\u1f9e"+
			"\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0526\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u0527\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0528"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u0529\7\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u052a\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u052b"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\27"+
			"\50\1\u052c\2\50\u1f9e\uffff\1\50",
			"\1\u052d",
			"\1\u052e",
			"\1\u052f",
			"\2\50\4\uffff\2\50\2\uffff\14\50\5\uffff\14\50\1\u0530\15\50\4\uffff"+
			"\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\1\u0531\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0532"+
			"\31\50\u1f9e\uffff\1\50",
			"\1\u0533",
			"\1\144",
			"\1\u0534",
			"\1\u0535",
			"\1\uffff",
			"\1\u0536",
			"\1\u0537",
			"\1\u0538",
			"\1\u0539",
			"\1\u0397",
			"\1\u053a",
			"\1\u0397",
			"\1\u053b",
			"\1\144",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\6\u02d5\1\u053c\23\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\23\u02d5\1\u053d\6\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\12\u053e",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u0540",
			"\1\u0541",
			"\1\u0542",
			"\1\144",
			"\1\uffff",
			"\1\144",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0544",
			"\1\144",
			"\1\uffff",
			"\1\u0545",
			"\1\uffff",
			"\1\uffff",
			"\1\u0546",
			"\1\u0547",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\1\50\1\u054c\1\50\1\u054b\26\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u054d\5\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u054e\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u054f\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u0550\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0551\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0552\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0553\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\2\50\1\u0554\27\50\4\uffff\1\50"+
			"\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u0555\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0556\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0557\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\26\50\1\u0558\3\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\21\50\1\u0559\10\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u055a\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u055b\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u055c\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u055d\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u055e\1\50\4\uffff\2\50\1\uffff\1\u047d"+
			"\2\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1"+
			"\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u055f\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u0560",
			"\1\u0561",
			"\1\u0562",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0563\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u0564\7\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0565\21\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0569",
			"\1\u056a",
			"\1\u056b",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u056d",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u056e\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\22\u02d5\1\u056f\7\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\2\u02d5\1\u0570\27\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\12\u0571",
			"\1\uffff",
			"\1\u0572",
			"\1\u0573",
			"\1\u0574",
			"\1\uffff",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0576",
			"\1\144",
			"\1\144",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0577\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0578\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0579\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u057a"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u057b\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u057c\1\50\4\uffff\2\50\1\uffff\1\u047d"+
			"\2\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1"+
			"\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u057d"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\22\50\1\u057e\3\50\1\u057f\3\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0580"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0581\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u0582"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u0583\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0584\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u0585\27\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0586\26\50\u1f9e\uffff\1\50",
			"\1\u0587",
			"\1\u0588",
			"\1\u0589",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u03e0\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u058a\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u058b\10\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u058c",
			"\1\50\4\uffff\3\50\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32"+
			"\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u058d",
			"\1\uffff",
			"\1\u058e",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0590\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\32\u02d5\u1f9e\uffff\1\u02d5",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\7\u02d5\1\u0591\22\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\12\u0592",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\1\u0594",
			"\1\u0595",
			"\1\uffff",
			"\1\144",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u0596\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u0597\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0598\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u0599\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u059a"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\2\50\1\u059b\17\50\1\u059c\7\50\4\uffff\1\50\1\uffff\32\50"+
			"\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u059d\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u059e\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u059f\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05a0\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05a1\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05a2\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05a3\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05a4\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u05a5",
			"\1\u05a6",
			"\1\u05a7",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05a8\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05a9\25\50\u1f9e\uffff\1\50",
			"\1\u05aa",
			"",
			"\1\u05ab",
			"",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u05ac\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\4\u02d5\1\u05ad\25\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\12\u05ae",
			"\1\uffff",
			"",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05b0\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u05b1\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05b2\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05b3\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05b4\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05b5\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\17"+
			"\50\1\u05b6\12\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05b7\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u05b8\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05b9\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05ba\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05bb\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05bc\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05bd"+
			"\31\50\u1f9e\uffff\1\50",
			"\1\50\4\uffff\2\50\1\u04e6\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\1\u05bf",
			"\1\50\4\uffff\2\50\1\u04e6\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05c1\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05c2\26\50\u1f9e\uffff\1\50",
			"\1\144",
			"\1\u05c3",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u0153\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\22\u02d5\1\u05c4\7\u02d5\u1f9e"+
			"\uffff\1\u02d5",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05c6\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05c7\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u05c8\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05c9\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05ca\27\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05cb\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05cc\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05cd\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05ce\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05cf\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05d0"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05d1\6\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\1\u05d2",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u05d3\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\144\2\uffff\1\144\22\uffff\1\144\1\50\4\uffff\2\50\1\u01d4\3\uffff"+
			"\3\50\1\uffff\14\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u01d3\7\50\u1f9e\uffff\1\50",
			"\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152\1\u02d6\4\uffff\2\u02d5\1"+
			"\uffff\1\u05d5\2\uffff\2\u02d5\1\u02d6\13\uffff\2\u02d5\3\uffff\1\u02d6"+
			"\1\uffff\32\u02d5\4\uffff\1\u02d5\1\uffff\32\u02d5\u1f9e\uffff\1\u02d5",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05d7\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4"+
			"\50\1\u05d8\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\1\50\1\u05d9\30\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u05da\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u05db\17\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05dc\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\23"+
			"\50\1\u05dd\6\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05de\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u05df\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\u05e0",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u05e1\23\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\22"+
			"\50\1\u05e3\7\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05e4"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05e5\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u05e6\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\7\50"+
			"\1\u05e7\22\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05e8"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\3\50\1\u05e9\26\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\1\u05ea",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05eb\25\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u05ec\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\30"+
			"\50\1\u05ed\1\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05ee\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u05ef\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\1\u05f0"+
			"\31\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05f1\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\24"+
			"\50\1\u05f2\5\50\u1f9e\uffff\1\50",
			"\1\u05f3",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05f4\10\50\u1f9e\uffff\1\50",
			"\3\50\3\uffff\3\50\1\uffff\14\50\5\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05f6\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u05f7\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05f8\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\2\50"+
			"\1\u05f9\27\50\u1f9e\uffff\1\50",
			"\1\u05fa",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05fb\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\21"+
			"\50\1\u05fc\10\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u05fd\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\12"+
			"\50\1\u05fe\17\50\u1f9e\uffff\1\50",
			"\1\50\4\uffff\2\50\1\u04e6\3\uffff\3\50\1\uffff\14\50\3\uffff\1\50\1"+
			"\uffff\32\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\4\50"+
			"\1\u0600\25\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0601\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\u0602\1\50\4\uffff\2\50\1\uffff\1\50\2"+
			"\uffff\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff"+
			"\32\50\u1f9e\uffff\1\50",
			"\1\uffff",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\3\50"+
			"\1\u0603\26\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\1\50\5\uffff\2\50\4\uffff\2\50\2\uffff\14"+
			"\50\5\uffff\23\50\1\u0604\6\50\4\uffff\1\50\1\uffff\32\50\u1f9e\uffff"+
			"\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
			"\3\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\32"+
			"\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\16"+
			"\50\1\u0605\13\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u0606\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\13"+
			"\50\1\u0607\16\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\10"+
			"\50\1\u0608\21\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\15"+
			"\50\1\u0609\14\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\50\2\uffff\3"+
			"\50\13\uffff\2\50\3\uffff\1\50\1\uffff\32\50\4\uffff\1\50\1\uffff\6\50"+
			"\1\u060a\23\50\u1f9e\uffff\1\50",
			"\2\50\2\uffff\1\50\22\uffff\2\50\4\uffff\2\50\1\uffff\1\u047d\2\uffff"+
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
						int LA44_746 = input.LA(1);
						 
						int index44_746 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_746==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_746);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA44_1081 = input.LA(1);
						 
						int index44_1081 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1081==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1081);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA44_929 = input.LA(1);
						 
						int index44_929 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_929==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_929);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA44_754 = input.LA(1);
						 
						int index44_754 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_754==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_754);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA44_935 = input.LA(1);
						 
						int index44_935 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_935==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_935);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA44_1198 = input.LA(1);
						 
						int index44_1198 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1198==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1198);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA44_1107 = input.LA(1);
						 
						int index44_1107 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1107=='s') ) {s = 467;}
						else if ( ((LA44_1107 >= '\t' && LA44_1107 <= '\n')||LA44_1107=='\r'||LA44_1107==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1107=='(') ) {s = 468;}
						else if ( (LA44_1107=='!'||(LA44_1107 >= '&' && LA44_1107 <= '\'')||(LA44_1107 >= ',' && LA44_1107 <= '.')||(LA44_1107 >= '0' && LA44_1107 <= ';')||LA44_1107=='?'||(LA44_1107 >= 'A' && LA44_1107 <= 'Z')||LA44_1107=='_'||(LA44_1107 >= 'a' && LA44_1107 <= 'r')||(LA44_1107 >= 't' && LA44_1107 <= 'z')||LA44_1107=='\u2019') ) {s = 40;}
						else s = 1213;
						 
						input.seek(index44_1107);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA44_969 = input.LA(1);
						 
						int index44_969 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_969=='s') ) {s = 467;}
						else if ( ((LA44_969 >= '\t' && LA44_969 <= '\n')||LA44_969=='\r'||LA44_969==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_969=='(') ) {s = 468;}
						else if ( (LA44_969=='!'||(LA44_969 >= '&' && LA44_969 <= '\'')||(LA44_969 >= ',' && LA44_969 <= '.')||(LA44_969 >= '0' && LA44_969 <= ';')||LA44_969=='?'||(LA44_969 >= 'A' && LA44_969 <= 'Z')||LA44_969=='_'||(LA44_969 >= 'a' && LA44_969 <= 'r')||(LA44_969 >= 't' && LA44_969 <= 'z')||LA44_969=='\u2019') ) {s = 40;}
						else s = 1106;
						 
						input.seek(index44_969);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA44_1212 = input.LA(1);
						 
						int index44_1212 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1212=='s') ) {s = 467;}
						else if ( ((LA44_1212 >= '\t' && LA44_1212 <= '\n')||LA44_1212=='\r'||LA44_1212==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1212=='(') ) {s = 468;}
						else if ( (LA44_1212=='!'||(LA44_1212 >= '&' && LA44_1212 <= '\'')||(LA44_1212 >= ',' && LA44_1212 <= '.')||(LA44_1212 >= '0' && LA44_1212 <= ';')||LA44_1212=='?'||(LA44_1212 >= 'A' && LA44_1212 <= 'Z')||LA44_1212=='_'||(LA44_1212 >= 'a' && LA44_1212 <= 'r')||(LA44_1212 >= 't' && LA44_1212 <= 'z')||LA44_1212=='\u2019') ) {s = 40;}
						else s = 1294;
						 
						input.seek(index44_1212);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA44_1272 = input.LA(1);
						 
						int index44_1272 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1272==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1272);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA44_1089 = input.LA(1);
						 
						int index44_1089 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1089==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1089);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA44_1284 = input.LA(1);
						 
						int index44_1284 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1284==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1284);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA44_1295 = input.LA(1);
						 
						int index44_1295 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1295=='s') ) {s = 467;}
						else if ( ((LA44_1295 >= '\t' && LA44_1295 <= '\n')||LA44_1295=='\r'||LA44_1295==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1295=='(') ) {s = 468;}
						else if ( (LA44_1295=='!'||(LA44_1295 >= '&' && LA44_1295 <= '\'')||(LA44_1295 >= ',' && LA44_1295 <= '.')||(LA44_1295 >= '0' && LA44_1295 <= ';')||LA44_1295=='?'||(LA44_1295 >= 'A' && LA44_1295 <= 'Z')||LA44_1295=='_'||(LA44_1295 >= 'a' && LA44_1295 <= 'r')||(LA44_1295 >= 't' && LA44_1295 <= 'z')||LA44_1295=='\u2019') ) {s = 40;}
						else s = 1352;
						 
						input.seek(index44_1295);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA44_1111 = input.LA(1);
						 
						int index44_1111 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1111=='s') ) {s = 467;}
						else if ( ((LA44_1111 >= '\t' && LA44_1111 <= '\n')||LA44_1111=='\r'||LA44_1111==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1111=='(') ) {s = 468;}
						else if ( (LA44_1111=='!'||(LA44_1111 >= '&' && LA44_1111 <= '\'')||(LA44_1111 >= ',' && LA44_1111 <= '.')||(LA44_1111 >= '0' && LA44_1111 <= ';')||LA44_1111=='?'||(LA44_1111 >= 'A' && LA44_1111 <= 'Z')||LA44_1111=='_'||(LA44_1111 >= 'a' && LA44_1111 <= 'r')||(LA44_1111 >= 't' && LA44_1111 <= 'z')||LA44_1111=='\u2019') ) {s = 40;}
						else s = 1217;
						 
						input.seek(index44_1111);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA44_940 = input.LA(1);
						 
						int index44_940 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_940==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_940);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA44_760 = input.LA(1);
						 
						int index44_760 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_760==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_760);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA44_939 = input.LA(1);
						 
						int index44_939 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_939==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_939);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA44_1112 = input.LA(1);
						 
						int index44_1112 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1112=='s') ) {s = 467;}
						else if ( ((LA44_1112 >= '\t' && LA44_1112 <= '\n')||LA44_1112=='\r'||LA44_1112==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1112=='(') ) {s = 468;}
						else if ( (LA44_1112=='!'||(LA44_1112 >= '&' && LA44_1112 <= '\'')||(LA44_1112 >= ',' && LA44_1112 <= '.')||(LA44_1112 >= '0' && LA44_1112 <= ';')||LA44_1112=='?'||(LA44_1112 >= 'A' && LA44_1112 <= 'Z')||LA44_1112=='_'||(LA44_1112 >= 'a' && LA44_1112 <= 'r')||(LA44_1112 >= 't' && LA44_1112 <= 'z')||LA44_1112=='\u2019') ) {s = 40;}
						else s = 1218;
						 
						input.seek(index44_1112);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA44_398 = input.LA(1);
						 
						int index44_398 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_398==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_398);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA44_777 = input.LA(1);
						 
						int index44_777 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_777==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_777);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA44_585 = input.LA(1);
						 
						int index44_585 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_585==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_585);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA44_1296 = input.LA(1);
						 
						int index44_1296 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1296=='s') ) {s = 467;}
						else if ( ((LA44_1296 >= '\t' && LA44_1296 <= '\n')||LA44_1296=='\r'||LA44_1296==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1296=='(') ) {s = 468;}
						else if ( (LA44_1296=='!'||(LA44_1296 >= '&' && LA44_1296 <= '\'')||(LA44_1296 >= ',' && LA44_1296 <= '.')||(LA44_1296 >= '0' && LA44_1296 <= ';')||LA44_1296=='?'||(LA44_1296 >= 'A' && LA44_1296 <= 'Z')||LA44_1296=='_'||(LA44_1296 >= 'a' && LA44_1296 <= 'r')||(LA44_1296 >= 't' && LA44_1296 <= 'z')||LA44_1296=='\u2019') ) {s = 40;}
						else s = 1353;
						 
						input.seek(index44_1296);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA44_916 = input.LA(1);
						 
						int index44_916 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_916=='s') ) {s = 467;}
						else if ( ((LA44_916 >= '\t' && LA44_916 <= '\n')||LA44_916=='\r'||LA44_916==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_916=='(') ) {s = 468;}
						else if ( (LA44_916=='!'||(LA44_916 >= '&' && LA44_916 <= '\'')||(LA44_916 >= ',' && LA44_916 <= '.')||(LA44_916 >= '0' && LA44_916 <= ';')||LA44_916=='?'||(LA44_916 >= 'A' && LA44_916 <= 'Z')||LA44_916=='_'||(LA44_916 >= 'a' && LA44_916 <= 'r')||(LA44_916 >= 't' && LA44_916 <= 'z')||LA44_916=='\u2019') ) {s = 40;}
						else s = 1071;
						 
						input.seek(index44_916);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA44_983 = input.LA(1);
						 
						int index44_983 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_983=='s') ) {s = 467;}
						else if ( ((LA44_983 >= '\t' && LA44_983 <= '\n')||LA44_983=='\r'||LA44_983==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_983=='(') ) {s = 468;}
						else if ( (LA44_983=='!'||(LA44_983 >= '&' && LA44_983 <= '\'')||(LA44_983 >= ',' && LA44_983 <= '.')||(LA44_983 >= '0' && LA44_983 <= ';')||LA44_983=='?'||(LA44_983 >= 'A' && LA44_983 <= 'Z')||LA44_983=='_'||(LA44_983 >= 'a' && LA44_983 <= 'r')||(LA44_983 >= 't' && LA44_983 <= 'z')||LA44_983=='\u2019') ) {s = 40;}
						else s = 1116;
						 
						input.seek(index44_983);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA44_589 = input.LA(1);
						 
						int index44_589 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_589==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_589);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA44_1096 = input.LA(1);
						 
						int index44_1096 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1096==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1096);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA44_915 = input.LA(1);
						 
						int index44_915 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_915=='s') ) {s = 467;}
						else if ( ((LA44_915 >= '\t' && LA44_915 <= '\n')||LA44_915=='\r'||LA44_915==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_915=='(') ) {s = 468;}
						else if ( (LA44_915=='!'||(LA44_915 >= '&' && LA44_915 <= '\'')||(LA44_915 >= ',' && LA44_915 <= '.')||(LA44_915 >= '0' && LA44_915 <= ';')||LA44_915=='?'||(LA44_915 >= 'A' && LA44_915 <= 'Z')||LA44_915=='_'||(LA44_915 >= 'a' && LA44_915 <= 'r')||(LA44_915 >= 't' && LA44_915 <= 'z')||LA44_915=='\u2019') ) {s = 40;}
						else s = 1070;
						 
						input.seek(index44_915);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA44_1049 = input.LA(1);
						 
						int index44_1049 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1049==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1049);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA44_1095 = input.LA(1);
						 
						int index44_1095 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1095==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1095);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA44_1090 = input.LA(1);
						 
						int index44_1090 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1090==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1090);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA44_767 = input.LA(1);
						 
						int index44_767 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_767==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_767);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA44_520 = input.LA(1);
						 
						int index44_520 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_520==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_520);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA44_1092 = input.LA(1);
						 
						int index44_1092 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1092==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1092);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA44_1394 = input.LA(1);
						 
						int index44_1394 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1394=='s') ) {s = 467;}
						else if ( ((LA44_1394 >= '\t' && LA44_1394 <= '\n')||LA44_1394=='\r'||LA44_1394==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1394=='(') ) {s = 468;}
						else if ( (LA44_1394=='!'||(LA44_1394 >= '&' && LA44_1394 <= '\'')||(LA44_1394 >= ',' && LA44_1394 <= '.')||(LA44_1394 >= '0' && LA44_1394 <= ';')||LA44_1394=='?'||(LA44_1394 >= 'A' && LA44_1394 <= 'Z')||LA44_1394=='_'||(LA44_1394 >= 'a' && LA44_1394 <= 'r')||(LA44_1394 >= 't' && LA44_1394 <= 'z')||LA44_1394=='\u2019') ) {s = 40;}
						else s = 1427;
						 
						input.seek(index44_1394);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA44_1338 = input.LA(1);
						 
						int index44_1338 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1338==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1338);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA44_770 = input.LA(1);
						 
						int index44_770 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_770==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_770);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA44_1277 = input.LA(1);
						 
						int index44_1277 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1277=='s') ) {s = 467;}
						else if ( ((LA44_1277 >= '\t' && LA44_1277 <= '\n')||LA44_1277=='\r'||LA44_1277==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1277=='(') ) {s = 468;}
						else if ( (LA44_1277=='!'||(LA44_1277 >= '&' && LA44_1277 <= '\'')||(LA44_1277 >= ',' && LA44_1277 <= '.')||(LA44_1277 >= '0' && LA44_1277 <= ';')||LA44_1277=='?'||(LA44_1277 >= 'A' && LA44_1277 <= 'Z')||LA44_1277=='_'||(LA44_1277 >= 'a' && LA44_1277 <= 'r')||(LA44_1277 >= 't' && LA44_1277 <= 'z')||LA44_1277=='\u2019') ) {s = 40;}
						else s = 1343;
						 
						input.seek(index44_1277);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA44_644 = input.LA(1);
						 
						int index44_644 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_644==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_644=='s') ) {s = 828;}
						else s = 40;
						 
						input.seek(index44_644);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA44_617 = input.LA(1);
						 
						int index44_617 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_617==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_617=='e') ) {s = 805;}
						else s = 40;
						 
						input.seek(index44_617);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA44_1221 = input.LA(1);
						 
						int index44_1221 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1221=='s') ) {s = 467;}
						else if ( ((LA44_1221 >= '\t' && LA44_1221 <= '\n')||LA44_1221=='\r'||LA44_1221==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1221=='(') ) {s = 468;}
						else if ( (LA44_1221=='!'||(LA44_1221 >= '&' && LA44_1221 <= '\'')||(LA44_1221 >= ',' && LA44_1221 <= '.')||(LA44_1221 >= '0' && LA44_1221 <= ';')||LA44_1221=='?'||(LA44_1221 >= 'A' && LA44_1221 <= 'Z')||LA44_1221=='_'||(LA44_1221 >= 'a' && LA44_1221 <= 'r')||(LA44_1221 >= 't' && LA44_1221 <= 'z')||LA44_1221=='\u2019') ) {s = 40;}
						else s = 1297;
						 
						input.seek(index44_1221);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA44_1117 = input.LA(1);
						 
						int index44_1117 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1117=='s') ) {s = 467;}
						else if ( ((LA44_1117 >= '\t' && LA44_1117 <= '\n')||LA44_1117=='\r'||LA44_1117==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1117=='(') ) {s = 468;}
						else if ( (LA44_1117=='!'||(LA44_1117 >= '&' && LA44_1117 <= '\'')||(LA44_1117 >= ',' && LA44_1117 <= '.')||(LA44_1117 >= '0' && LA44_1117 <= ';')||LA44_1117=='?'||(LA44_1117 >= 'A' && LA44_1117 <= 'Z')||LA44_1117=='_'||(LA44_1117 >= 'a' && LA44_1117 <= 'r')||(LA44_1117 >= 't' && LA44_1117 <= 'z')||LA44_1117=='\u2019') ) {s = 40;}
						else s = 1220;
						 
						input.seek(index44_1117);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA44_277 = input.LA(1);
						 
						int index44_277 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_277=='s') ) {s = 467;}
						else if ( ((LA44_277 >= '\t' && LA44_277 <= '\n')||LA44_277=='\r'||LA44_277==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_277=='(') ) {s = 468;}
						else if ( (LA44_277=='!'||(LA44_277 >= '&' && LA44_277 <= '\'')||(LA44_277 >= ',' && LA44_277 <= '.')||(LA44_277 >= '0' && LA44_277 <= ';')||LA44_277=='?'||(LA44_277 >= 'A' && LA44_277 <= 'Z')||LA44_277=='_'||(LA44_277 >= 'a' && LA44_277 <= 'r')||(LA44_277 >= 't' && LA44_277 <= 'z')||LA44_277=='\u2019') ) {s = 40;}
						else s = 466;
						 
						input.seek(index44_277);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA44_834 = input.LA(1);
						 
						int index44_834 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_834=='s') ) {s = 467;}
						else if ( ((LA44_834 >= '\t' && LA44_834 <= '\n')||LA44_834=='\r'||LA44_834==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_834=='(') ) {s = 468;}
						else if ( (LA44_834=='!'||(LA44_834 >= '&' && LA44_834 <= '\'')||(LA44_834 >= ',' && LA44_834 <= '.')||(LA44_834 >= '0' && LA44_834 <= ';')||LA44_834=='?'||(LA44_834 >= 'A' && LA44_834 <= 'Z')||LA44_834=='_'||(LA44_834 >= 'a' && LA44_834 <= 'r')||(LA44_834 >= 't' && LA44_834 <= 'z')||LA44_834=='\u2019') ) {s = 40;}
						else s = 990;
						 
						input.seek(index44_834);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA44_1298 = input.LA(1);
						 
						int index44_1298 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1298=='s') ) {s = 467;}
						else if ( ((LA44_1298 >= '\t' && LA44_1298 <= '\n')||LA44_1298=='\r'||LA44_1298==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1298=='(') ) {s = 468;}
						else if ( (LA44_1298=='!'||(LA44_1298 >= '&' && LA44_1298 <= '\'')||(LA44_1298 >= ',' && LA44_1298 <= '.')||(LA44_1298 >= '0' && LA44_1298 <= ';')||LA44_1298=='?'||(LA44_1298 >= 'A' && LA44_1298 <= 'Z')||LA44_1298=='_'||(LA44_1298 >= 'a' && LA44_1298 <= 'r')||(LA44_1298 >= 't' && LA44_1298 <= 'z')||LA44_1298=='\u2019') ) {s = 40;}
						else s = 1354;
						 
						input.seek(index44_1298);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA44_646 = input.LA(1);
						 
						int index44_646 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_646=='s') ) {s = 467;}
						else if ( ((LA44_646 >= '\t' && LA44_646 <= '\n')||LA44_646=='\r'||LA44_646==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_646=='(') ) {s = 468;}
						else if ( (LA44_646=='!'||(LA44_646 >= '&' && LA44_646 <= '\'')||(LA44_646 >= ',' && LA44_646 <= '.')||(LA44_646 >= '0' && LA44_646 <= ';')||LA44_646=='?'||(LA44_646 >= 'A' && LA44_646 <= 'Z')||LA44_646=='_'||(LA44_646 >= 'a' && LA44_646 <= 'r')||(LA44_646 >= 't' && LA44_646 <= 'z')||LA44_646=='\u2019') ) {s = 40;}
						else s = 830;
						 
						input.seek(index44_646);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA44_988 = input.LA(1);
						 
						int index44_988 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_988=='s') ) {s = 467;}
						else if ( ((LA44_988 >= '\t' && LA44_988 <= '\n')||LA44_988=='\r'||LA44_988==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_988=='(') ) {s = 468;}
						else if ( (LA44_988=='!'||(LA44_988 >= '&' && LA44_988 <= '\'')||(LA44_988 >= ',' && LA44_988 <= '.')||(LA44_988 >= '0' && LA44_988 <= ';')||LA44_988=='?'||(LA44_988 >= 'A' && LA44_988 <= 'Z')||LA44_988=='_'||(LA44_988 >= 'a' && LA44_988 <= 'r')||(LA44_988 >= 't' && LA44_988 <= 'z')||LA44_988=='\u2019') ) {s = 40;}
						else s = 1120;
						 
						input.seek(index44_988);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA44_626 = input.LA(1);
						 
						int index44_626 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_626==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_626);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA44_1332 = input.LA(1);
						 
						int index44_1332 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1332=='s') ) {s = 467;}
						else if ( ((LA44_1332 >= '\t' && LA44_1332 <= '\n')||LA44_1332=='\r'||LA44_1332==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1332=='(') ) {s = 468;}
						else if ( (LA44_1332=='!'||(LA44_1332 >= '&' && LA44_1332 <= '\'')||(LA44_1332 >= ',' && LA44_1332 <= '.')||(LA44_1332 >= '0' && LA44_1332 <= ';')||LA44_1332=='?'||(LA44_1332 >= 'A' && LA44_1332 <= 'Z')||LA44_1332=='_'||(LA44_1332 >= 'a' && LA44_1332 <= 'r')||(LA44_1332 >= 't' && LA44_1332 <= 'z')||LA44_1332=='\u2019') ) {s = 40;}
						else s = 1383;
						 
						input.seek(index44_1332);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA44_1331 = input.LA(1);
						 
						int index44_1331 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1331=='s') ) {s = 467;}
						else if ( ((LA44_1331 >= '\t' && LA44_1331 <= '\n')||LA44_1331=='\r'||LA44_1331==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1331=='(') ) {s = 468;}
						else if ( (LA44_1331=='!'||(LA44_1331 >= '&' && LA44_1331 <= '\'')||(LA44_1331 >= ',' && LA44_1331 <= '.')||(LA44_1331 >= '0' && LA44_1331 <= ';')||LA44_1331=='?'||(LA44_1331 >= 'A' && LA44_1331 <= 'Z')||LA44_1331=='_'||(LA44_1331 >= 'a' && LA44_1331 <= 'r')||(LA44_1331 >= 't' && LA44_1331 <= 'z')||LA44_1331=='\u2019') ) {s = 40;}
						else s = 1382;
						 
						input.seek(index44_1331);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA44_668 = input.LA(1);
						 
						int index44_668 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_668=='s') ) {s = 467;}
						else if ( ((LA44_668 >= '\t' && LA44_668 <= '\n')||LA44_668=='\r'||LA44_668==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_668=='(') ) {s = 468;}
						else if ( (LA44_668=='!'||(LA44_668 >= '&' && LA44_668 <= '\'')||(LA44_668 >= ',' && LA44_668 <= '.')||(LA44_668 >= '0' && LA44_668 <= ';')||LA44_668=='?'||(LA44_668 >= 'A' && LA44_668 <= 'Z')||LA44_668=='_'||(LA44_668 >= 'a' && LA44_668 <= 'r')||(LA44_668 >= 't' && LA44_668 <= 'z')||LA44_668=='\u2019') ) {s = 40;}
						else s = 863;
						 
						input.seek(index44_668);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA44_1035 = input.LA(1);
						 
						int index44_1035 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1035=='s') ) {s = 467;}
						else if ( ((LA44_1035 >= '\t' && LA44_1035 <= '\n')||LA44_1035=='\r'||LA44_1035==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1035=='(') ) {s = 468;}
						else if ( (LA44_1035=='!'||(LA44_1035 >= '&' && LA44_1035 <= '\'')||(LA44_1035 >= ',' && LA44_1035 <= '.')||(LA44_1035 >= '0' && LA44_1035 <= ';')||LA44_1035=='?'||(LA44_1035 >= 'A' && LA44_1035 <= 'Z')||LA44_1035=='_'||(LA44_1035 >= 'a' && LA44_1035 <= 'r')||(LA44_1035 >= 't' && LA44_1035 <= 'z')||LA44_1035=='\u2019') ) {s = 40;}
						else s = 1163;
						 
						input.seek(index44_1035);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA44_1333 = input.LA(1);
						 
						int index44_1333 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1333=='s') ) {s = 467;}
						else if ( ((LA44_1333 >= '\t' && LA44_1333 <= '\n')||LA44_1333=='\r'||LA44_1333==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1333=='(') ) {s = 468;}
						else if ( (LA44_1333=='!'||(LA44_1333 >= '&' && LA44_1333 <= '\'')||(LA44_1333 >= ',' && LA44_1333 <= '.')||(LA44_1333 >= '0' && LA44_1333 <= ';')||LA44_1333=='?'||(LA44_1333 >= 'A' && LA44_1333 <= 'Z')||LA44_1333=='_'||(LA44_1333 >= 'a' && LA44_1333 <= 'r')||(LA44_1333 >= 't' && LA44_1333 <= 'z')||LA44_1333=='\u2019') ) {s = 40;}
						else s = 1384;
						 
						input.seek(index44_1333);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA44_871 = input.LA(1);
						 
						int index44_871 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_871=='s') ) {s = 467;}
						else if ( ((LA44_871 >= '\t' && LA44_871 <= '\n')||LA44_871=='\r'||LA44_871==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_871=='(') ) {s = 468;}
						else if ( (LA44_871=='!'||(LA44_871 >= '&' && LA44_871 <= '\'')||(LA44_871 >= ',' && LA44_871 <= '.')||(LA44_871 >= '0' && LA44_871 <= ';')||LA44_871=='?'||(LA44_871 >= 'A' && LA44_871 <= 'Z')||LA44_871=='_'||(LA44_871 >= 'a' && LA44_871 <= 'r')||(LA44_871 >= 't' && LA44_871 <= 'z')||LA44_871=='\u2019') ) {s = 40;}
						else s = 1029;
						 
						input.seek(index44_871);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA44_1030 = input.LA(1);
						 
						int index44_1030 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1030=='s') ) {s = 467;}
						else if ( ((LA44_1030 >= '\t' && LA44_1030 <= '\n')||LA44_1030=='\r'||LA44_1030==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1030=='(') ) {s = 468;}
						else if ( (LA44_1030=='!'||(LA44_1030 >= '&' && LA44_1030 <= '\'')||(LA44_1030 >= ',' && LA44_1030 <= '.')||(LA44_1030 >= '0' && LA44_1030 <= ';')||LA44_1030=='?'||(LA44_1030 >= 'A' && LA44_1030 <= 'Z')||LA44_1030=='_'||(LA44_1030 >= 'a' && LA44_1030 <= 'r')||(LA44_1030 >= 't' && LA44_1030 <= 'z')||LA44_1030=='\u2019') ) {s = 40;}
						else s = 1158;
						 
						input.seek(index44_1030);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA44_1166 = input.LA(1);
						 
						int index44_1166 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1166=='s') ) {s = 467;}
						else if ( ((LA44_1166 >= '\t' && LA44_1166 <= '\n')||LA44_1166=='\r'||LA44_1166==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1166=='(') ) {s = 468;}
						else if ( (LA44_1166=='!'||(LA44_1166 >= '&' && LA44_1166 <= '\'')||(LA44_1166 >= ',' && LA44_1166 <= '.')||(LA44_1166 >= '0' && LA44_1166 <= ';')||LA44_1166=='?'||(LA44_1166 >= 'A' && LA44_1166 <= 'Z')||LA44_1166=='_'||(LA44_1166 >= 'a' && LA44_1166 <= 'r')||(LA44_1166 >= 't' && LA44_1166 <= 'z')||LA44_1166=='\u2019') ) {s = 40;}
						else s = 1263;
						 
						input.seek(index44_1166);
						if ( s>=0 ) return s;
						break;

					case 55 : 
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

					case 56 : 
						int LA44_1061 = input.LA(1);
						 
						int index44_1061 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1061=='s') ) {s = 467;}
						else if ( ((LA44_1061 >= '\t' && LA44_1061 <= '\n')||LA44_1061=='\r'||LA44_1061==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1061=='(') ) {s = 468;}
						else if ( (LA44_1061=='!'||(LA44_1061 >= '&' && LA44_1061 <= '\'')||(LA44_1061 >= ',' && LA44_1061 <= '.')||(LA44_1061 >= '0' && LA44_1061 <= ';')||LA44_1061=='?'||(LA44_1061 >= 'A' && LA44_1061 <= 'Z')||LA44_1061=='_'||(LA44_1061 >= 'a' && LA44_1061 <= 'r')||(LA44_1061 >= 't' && LA44_1061 <= 'z')||LA44_1061=='\u2019') ) {s = 40;}
						else s = 1180;
						 
						input.seek(index44_1061);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA44_1191 = input.LA(1);
						 
						int index44_1191 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1191==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1191);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA44_899 = input.LA(1);
						 
						int index44_899 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_899=='s') ) {s = 467;}
						else if ( ((LA44_899 >= '\t' && LA44_899 <= '\n')||LA44_899=='\r'||LA44_899==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_899=='(') ) {s = 468;}
						else if ( (LA44_899=='!'||(LA44_899 >= '&' && LA44_899 <= '\'')||(LA44_899 >= ',' && LA44_899 <= '.')||(LA44_899 >= '0' && LA44_899 <= ';')||LA44_899=='?'||(LA44_899 >= 'A' && LA44_899 <= 'Z')||LA44_899=='_'||(LA44_899 >= 'a' && LA44_899 <= 'r')||(LA44_899 >= 't' && LA44_899 <= 'z')||LA44_899=='\u2019') ) {s = 40;}
						else s = 1055;
						 
						input.seek(index44_899);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA44_1337 = input.LA(1);
						 
						int index44_1337 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1337=='s') ) {s = 467;}
						else if ( ((LA44_1337 >= '\t' && LA44_1337 <= '\n')||LA44_1337=='\r'||LA44_1337==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1337=='(') ) {s = 468;}
						else if ( (LA44_1337=='!'||(LA44_1337 >= '&' && LA44_1337 <= '\'')||(LA44_1337 >= ',' && LA44_1337 <= '.')||(LA44_1337 >= '0' && LA44_1337 <= ';')||LA44_1337=='?'||(LA44_1337 >= 'A' && LA44_1337 <= 'Z')||LA44_1337=='_'||(LA44_1337 >= 'a' && LA44_1337 <= 'r')||(LA44_1337 >= 't' && LA44_1337 <= 'z')||LA44_1337=='\u2019') ) {s = 40;}
						else s = 1388;
						 
						input.seek(index44_1337);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA44_630 = input.LA(1);
						 
						int index44_630 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_630==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_630);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA44_1165 = input.LA(1);
						 
						int index44_1165 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1165==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1165);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA44_1113 = input.LA(1);
						 
						int index44_1113 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1113==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1113);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA44_980 = input.LA(1);
						 
						int index44_980 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_980==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_980);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA44_1114 = input.LA(1);
						 
						int index44_1114 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1114==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1114);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA44_570 = input.LA(1);
						 
						int index44_570 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_570==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_570);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA44_637 = input.LA(1);
						 
						int index44_637 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_637==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_637);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA44_1475 = input.LA(1);
						 
						int index44_1475 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1475=='s') ) {s = 467;}
						else if ( ((LA44_1475 >= '\t' && LA44_1475 <= '\n')||LA44_1475=='\r'||LA44_1475==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1475=='(') ) {s = 468;}
						else if ( (LA44_1475=='!'||(LA44_1475 >= '&' && LA44_1475 <= '\'')||(LA44_1475 >= ',' && LA44_1475 <= '.')||(LA44_1475 >= '0' && LA44_1475 <= ';')||LA44_1475=='?'||(LA44_1475 >= 'A' && LA44_1475 <= 'Z')||LA44_1475=='_'||(LA44_1475 >= 'a' && LA44_1475 <= 'r')||(LA44_1475 >= 't' && LA44_1475 <= 'z')||LA44_1475=='\u2019') ) {s = 40;}
						else s = 1492;
						 
						input.seek(index44_1475);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA44_351 = input.LA(1);
						 
						int index44_351 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_351 >= '\t' && LA44_351 <= '\n')||LA44_351=='\r'||LA44_351==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_351);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA44_35 = input.LA(1);
						 
						int index44_35 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_35 >= '\t' && LA44_35 <= '\n')||LA44_35=='\r'||LA44_35==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_35);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA44_169 = input.LA(1);
						 
						int index44_169 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_169 >= '\t' && LA44_169 <= '\n')||LA44_169=='\r'||LA44_169==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_169);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA44_973 = input.LA(1);
						 
						int index44_973 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_973==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_973);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA44_1109 = input.LA(1);
						 
						int index44_1109 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1109==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1109);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA44_223 = input.LA(1);
						 
						int index44_223 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_223 >= '\t' && LA44_223 <= '\n')||LA44_223=='\r'||LA44_223==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_223);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA44_72 = input.LA(1);
						 
						int index44_72 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_72 >= '\t' && LA44_72 <= '\n')||LA44_72=='\r'||LA44_72==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_72);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA44_938 = input.LA(1);
						 
						int index44_938 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_938==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_938);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA44_967 = input.LA(1);
						 
						int index44_967 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_967==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_967);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA44_811 = input.LA(1);
						 
						int index44_811 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_811==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_811);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA44_1214 = input.LA(1);
						 
						int index44_1214 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1214==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1214);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA44_1082 = input.LA(1);
						 
						int index44_1082 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1082==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1082);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA44_221 = input.LA(1);
						 
						int index44_221 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_221=='l') ) {s = 409;}
						else if ( ((LA44_221 >= '\t' && LA44_221 <= '\n')||LA44_221=='\r'||LA44_221==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_221);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA44_1048 = input.LA(1);
						 
						int index44_1048 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1048==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1048);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA44_428 = input.LA(1);
						 
						int index44_428 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_428==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_428);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA44_944 = input.LA(1);
						 
						int index44_944 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_944==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_944=='s') ) {s = 1090;}
						else s = 40;
						 
						input.seek(index44_944);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA44_614 = input.LA(1);
						 
						int index44_614 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_614==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_614);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA44_804 = input.LA(1);
						 
						int index44_804 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_804==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_804);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA44_803 = input.LA(1);
						 
						int index44_803 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_803==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_803);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA44_748 = input.LA(1);
						 
						int index44_748 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_748);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA44_669 = input.LA(1);
						 
						int index44_669 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_669);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA44_652 = input.LA(1);
						 
						int index44_652 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_652);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA44_466 = input.LA(1);
						 
						int index44_466 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_466);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA44_769 = input.LA(1);
						 
						int index44_769 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_769);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA44_771 = input.LA(1);
						 
						int index44_771 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_771);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA44_830 = input.LA(1);
						 
						int index44_830 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_830);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA44_863 = input.LA(1);
						 
						int index44_863 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_863);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA44_934 = input.LA(1);
						 
						int index44_934 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_934);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA44_943 = input.LA(1);
						 
						int index44_943 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_943);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA44_945 = input.LA(1);
						 
						int index44_945 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_945);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA44_957 = input.LA(1);
						 
						int index44_957 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_957);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA44_978 = input.LA(1);
						 
						int index44_978 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_978);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA44_990 = input.LA(1);
						 
						int index44_990 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_990);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA44_1029 = input.LA(1);
						 
						int index44_1029 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1029);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA44_1055 = input.LA(1);
						 
						int index44_1055 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1055);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA44_1070 = input.LA(1);
						 
						int index44_1070 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1070);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA44_1071 = input.LA(1);
						 
						int index44_1071 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1071);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA44_1085 = input.LA(1);
						 
						int index44_1085 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1085);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA44_1093 = input.LA(1);
						 
						int index44_1093 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1093);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA44_1106 = input.LA(1);
						 
						int index44_1106 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1106);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA44_1116 = input.LA(1);
						 
						int index44_1116 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1116);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA44_1120 = input.LA(1);
						 
						int index44_1120 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1120);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA44_1158 = input.LA(1);
						 
						int index44_1158 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1158);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA44_1163 = input.LA(1);
						 
						int index44_1163 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1163);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA44_1180 = input.LA(1);
						 
						int index44_1180 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1180);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA44_1203 = input.LA(1);
						 
						int index44_1203 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1203);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA44_1213 = input.LA(1);
						 
						int index44_1213 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1213);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA44_1216 = input.LA(1);
						 
						int index44_1216 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1216);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA44_1217 = input.LA(1);
						 
						int index44_1217 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1217);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA44_1218 = input.LA(1);
						 
						int index44_1218 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1218);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA44_1220 = input.LA(1);
						 
						int index44_1220 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1220);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA44_1255 = input.LA(1);
						 
						int index44_1255 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1255);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA44_1263 = input.LA(1);
						 
						int index44_1263 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1263);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA44_1283 = input.LA(1);
						 
						int index44_1283 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1283);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA44_1288 = input.LA(1);
						 
						int index44_1288 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1288);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA44_1290 = input.LA(1);
						 
						int index44_1290 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1290);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA44_1291 = input.LA(1);
						 
						int index44_1291 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1291);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA44_1294 = input.LA(1);
						 
						int index44_1294 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1294);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA44_1297 = input.LA(1);
						 
						int index44_1297 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1297);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA44_1343 = input.LA(1);
						 
						int index44_1343 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1343);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA44_1347 = input.LA(1);
						 
						int index44_1347 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1347);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA44_1352 = input.LA(1);
						 
						int index44_1352 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1352);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA44_1353 = input.LA(1);
						 
						int index44_1353 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1353);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA44_1354 = input.LA(1);
						 
						int index44_1354 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1354);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA44_1382 = input.LA(1);
						 
						int index44_1382 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1382);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA44_1383 = input.LA(1);
						 
						int index44_1383 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1383);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA44_1384 = input.LA(1);
						 
						int index44_1384 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1384);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA44_1388 = input.LA(1);
						 
						int index44_1388 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1388);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA44_1397 = input.LA(1);
						 
						int index44_1397 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1397);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA44_1427 = input.LA(1);
						 
						int index44_1427 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1427);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA44_1455 = input.LA(1);
						 
						int index44_1455 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1455);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA44_1470 = input.LA(1);
						 
						int index44_1470 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1470);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA44_1472 = input.LA(1);
						 
						int index44_1472 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1472);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA44_1477 = input.LA(1);
						 
						int index44_1477 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1477);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA44_1492 = input.LA(1);
						 
						int index44_1492 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1492);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA44_1494 = input.LA(1);
						 
						int index44_1494 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1494);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA44_1506 = input.LA(1);
						 
						int index44_1506 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1506);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA44_1525 = input.LA(1);
						 
						int index44_1525 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1525);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA44_1535 = input.LA(1);
						 
						int index44_1535 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowBreed)) ) {s = 100;}
						else if ( (true) ) {s = 40;}
						 
						input.seek(index44_1535);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA44_817 = input.LA(1);
						 
						int index44_817 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_817=='o') ) {s = 977;}
						else if ( (LA44_817=='s') ) {s = 467;}
						else if ( ((LA44_817 >= '\t' && LA44_817 <= '\n')||LA44_817=='\r'||LA44_817==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_817=='(') ) {s = 468;}
						else if ( (LA44_817=='!'||(LA44_817 >= '&' && LA44_817 <= '\'')||(LA44_817 >= ',' && LA44_817 <= '.')||(LA44_817 >= '0' && LA44_817 <= ';')||LA44_817=='?'||(LA44_817 >= 'A' && LA44_817 <= 'Z')||LA44_817=='_'||(LA44_817 >= 'a' && LA44_817 <= 'n')||(LA44_817 >= 'p' && LA44_817 <= 'r')||(LA44_817 >= 't' && LA44_817 <= 'z')||LA44_817=='\u2019') ) {s = 40;}
						else s = 978;
						 
						input.seek(index44_817);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA44_607 = input.LA(1);
						 
						int index44_607 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_607==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_607);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA44_765 = input.LA(1);
						 
						int index44_765 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_765==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_765);
						if ( s>=0 ) return s;
						break;

					case 150 : 
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

					case 151 : 
						int LA44_1429 = input.LA(1);
						 
						int index44_1429 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1429=='s') ) {s = 467;}
						else if ( ((LA44_1429 >= '\t' && LA44_1429 <= '\n')||LA44_1429=='\r'||LA44_1429==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1429=='(') ) {s = 468;}
						else if ( (LA44_1429=='!'||(LA44_1429 >= '&' && LA44_1429 <= '\'')||(LA44_1429 >= ',' && LA44_1429 <= '.')||(LA44_1429 >= '0' && LA44_1429 <= ';')||LA44_1429=='?'||(LA44_1429 >= 'A' && LA44_1429 <= 'Z')||LA44_1429=='_'||(LA44_1429 >= 'a' && LA44_1429 <= 'r')||(LA44_1429 >= 't' && LA44_1429 <= 'z')||LA44_1429=='\u2019') ) {s = 40;}
						else s = 1455;
						 
						input.seek(index44_1429);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA44_1351 = input.LA(1);
						 
						int index44_1351 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1351==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1351);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA44_234 = input.LA(1);
						 
						int index44_234 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_234==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_234);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA44_799 = input.LA(1);
						 
						int index44_799 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_799==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_799);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA44_1050 = input.LA(1);
						 
						int index44_1050 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1050==' ') && ((allowGroup))) {s = 1173;}
						else s = 40;
						 
						input.seek(index44_1050);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA44_467 = input.LA(1);
						 
						int index44_467 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_467 >= '\t' && LA44_467 <= '\n')||LA44_467=='\r'||LA44_467==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_467=='(') ) {s = 468;}
						else if ( (LA44_467=='!'||(LA44_467 >= '&' && LA44_467 <= '\'')||(LA44_467 >= ',' && LA44_467 <= '.')||(LA44_467 >= '0' && LA44_467 <= ';')||LA44_467=='?'||(LA44_467 >= 'A' && LA44_467 <= 'Z')||LA44_467=='_'||(LA44_467 >= 'a' && LA44_467 <= 'z')||LA44_467=='\u2019') ) {s = 40;}
						else s = 652;
						 
						input.seek(index44_467);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA44_971 = input.LA(1);
						 
						int index44_971 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_971==' ') && ((allowGroup))) {s = 810;}
						else s = 40;
						 
						input.seek(index44_971);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA44_1282 = input.LA(1);
						 
						int index44_1282 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1282==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1282);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA44_1110 = input.LA(1);
						 
						int index44_1110 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1110=='e') ) {s = 1215;}
						else if ( (LA44_1110=='s') ) {s = 467;}
						else if ( ((LA44_1110 >= '\t' && LA44_1110 <= '\n')||LA44_1110=='\r'||LA44_1110==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1110=='(') ) {s = 468;}
						else if ( (LA44_1110=='!'||(LA44_1110 >= '&' && LA44_1110 <= '\'')||(LA44_1110 >= ',' && LA44_1110 <= '.')||(LA44_1110 >= '0' && LA44_1110 <= ';')||LA44_1110=='?'||(LA44_1110 >= 'A' && LA44_1110 <= 'Z')||LA44_1110=='_'||(LA44_1110 >= 'a' && LA44_1110 <= 'd')||(LA44_1110 >= 'f' && LA44_1110 <= 'r')||(LA44_1110 >= 't' && LA44_1110 <= 'z')||LA44_1110=='\u2019') ) {s = 40;}
						else s = 1216;
						 
						input.seek(index44_1110);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA44_1350 = input.LA(1);
						 
						int index44_1350 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1350==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1350);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA44_1299 = input.LA(1);
						 
						int index44_1299 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1299==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1299);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA44_790 = input.LA(1);
						 
						int index44_790 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_790==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_790);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA44_1398 = input.LA(1);
						 
						int index44_1398 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1398==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1398);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA44_792 = input.LA(1);
						 
						int index44_792 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_792==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_792);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA44_762 = input.LA(1);
						 
						int index44_762 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_762==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_762=='s') ) {s = 940;}
						else s = 40;
						 
						input.seek(index44_762);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA44_1149 = input.LA(1);
						 
						int index44_1149 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_1149 >= '\t' && LA44_1149 <= '\n')||LA44_1149=='\r'||LA44_1149==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1149=='A') ) {s = 1251;}
						else if ( (LA44_1149=='P') ) {s = 1252;}
						else if ( (LA44_1149=='B') ) {s = 1253;}
						else if ( (LA44_1149=='(') ) {s = 1254;}
						else if ( ((LA44_1149 >= '&' && LA44_1149 <= '\'')||(LA44_1149 >= ',' && LA44_1149 <= '.')||(LA44_1149 >= '0' && LA44_1149 <= ';')||(LA44_1149 >= 'C' && LA44_1149 <= 'O')||(LA44_1149 >= 'Q' && LA44_1149 <= 'Z')||LA44_1149=='_'||(LA44_1149 >= 'a' && LA44_1149 <= 'z')||LA44_1149=='\u2019') ) {s = 40;}
						else s = 1255;
						 
						input.seek(index44_1149);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA44_1161 = input.LA(1);
						 
						int index44_1161 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1161==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1161);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA44_415 = input.LA(1);
						 
						int index44_415 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_415==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_415);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA44_1102 = input.LA(1);
						 
						int index44_1102 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1102==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1102);
						if ( s>=0 ) return s;
						break;

					case 170 : 
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

					case 171 : 
						int LA44_1287 = input.LA(1);
						 
						int index44_1287 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1287==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1287);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA44_785 = input.LA(1);
						 
						int index44_785 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_785==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_785);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA44_956 = input.LA(1);
						 
						int index44_956 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_956==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_956);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA44_405 = input.LA(1);
						 
						int index44_405 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_405==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_405);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA44_955 = input.LA(1);
						 
						int index44_955 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_955==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_955);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA44_1450 = input.LA(1);
						 
						int index44_1450 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1450==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1450);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA44_1168 = input.LA(1);
						 
						int index44_1168 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1168==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1168);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA44_884 = input.LA(1);
						 
						int index44_884 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_884==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_884);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA44_1043 = input.LA(1);
						 
						int index44_1043 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1043==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1043);
						if ( s>=0 ) return s;
						break;

					case 180 : 
						int LA44_73 = input.LA(1);
						 
						int index44_73 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_73 >= '\t' && LA44_73 <= '\n')||LA44_73=='\r'||LA44_73==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_73);
						if ( s>=0 ) return s;
						break;

					case 181 : 
						int LA44_350 = input.LA(1);
						 
						int index44_350 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_350 >= '\t' && LA44_350 <= '\n')||LA44_350=='\r'||LA44_350==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_350);
						if ( s>=0 ) return s;
						break;

					case 182 : 
						int LA44_1039 = input.LA(1);
						 
						int index44_1039 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1039==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1039);
						if ( s>=0 ) return s;
						break;

					case 183 : 
						int LA44_1193 = input.LA(1);
						 
						int index44_1193 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1193==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1193);
						if ( s>=0 ) return s;
						break;

					case 184 : 
						int LA44_1040 = input.LA(1);
						 
						int index44_1040 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1040==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1040);
						if ( s>=0 ) return s;
						break;

					case 185 : 
						int LA44_689 = input.LA(1);
						 
						int index44_689 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_689==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_689);
						if ( s>=0 ) return s;
						break;

					case 186 : 
						int LA44_965 = input.LA(1);
						 
						int index44_965 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_965==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_965);
						if ( s>=0 ) return s;
						break;

					case 187 : 
						int LA44_962 = input.LA(1);
						 
						int index44_962 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_962==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_962);
						if ( s>=0 ) return s;
						break;

					case 188 : 
						int LA44_491 = input.LA(1);
						 
						int index44_491 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_491==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_491);
						if ( s>=0 ) return s;
						break;

					case 189 : 
						int LA44_492 = input.LA(1);
						 
						int index44_492 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_492==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_492);
						if ( s>=0 ) return s;
						break;

					case 190 : 
						int LA44_506 = input.LA(1);
						 
						int index44_506 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_506=='F') && ((allowBreed))) {s = 100;}
						else if ( (LA44_506=='V') ) {s = 703;}
						 
						input.seek(index44_506);
						if ( s>=0 ) return s;
						break;

					case 191 : 
						int LA44_171 = input.LA(1);
						 
						int index44_171 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_171 >= '\t' && LA44_171 <= '\n')||LA44_171=='\r'||LA44_171==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_171);
						if ( s>=0 ) return s;
						break;

					case 192 : 
						int LA44_36 = input.LA(1);
						 
						int index44_36 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA44_36 >= '\t' && LA44_36 <= '\n')||LA44_36=='\r'||LA44_36==' ') && ((allowJudge))) {s = 170;}
						else s = 40;
						 
						input.seek(index44_36);
						if ( s>=0 ) return s;
						break;

					case 193 : 
						int LA44_1162 = input.LA(1);
						 
						int index44_1162 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1162==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1162);
						if ( s>=0 ) return s;
						break;

					case 194 : 
						int LA44_755 = input.LA(1);
						 
						int index44_755 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_755=='s') ) {s = 467;}
						else if ( ((LA44_755 >= '\t' && LA44_755 <= '\n')||LA44_755=='\r'||LA44_755==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_755=='(') ) {s = 468;}
						else if ( (LA44_755=='!'||(LA44_755 >= '&' && LA44_755 <= '\'')||(LA44_755 >= ',' && LA44_755 <= '.')||(LA44_755 >= '0' && LA44_755 <= ';')||LA44_755=='?'||(LA44_755 >= 'A' && LA44_755 <= 'Z')||LA44_755=='_'||(LA44_755 >= 'a' && LA44_755 <= 'r')||(LA44_755 >= 't' && LA44_755 <= 'z')||LA44_755=='\u2019') ) {s = 40;}
						else s = 934;
						 
						input.seek(index44_755);
						if ( s>=0 ) return s;
						break;

					case 195 : 
						int LA44_933 = input.LA(1);
						 
						int index44_933 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_933=='s') ) {s = 467;}
						else if ( ((LA44_933 >= '\t' && LA44_933 <= '\n')||LA44_933=='\r'||LA44_933==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_933=='(') ) {s = 468;}
						else if ( (LA44_933=='!'||(LA44_933 >= '&' && LA44_933 <= '\'')||(LA44_933 >= ',' && LA44_933 <= '.')||(LA44_933 >= '0' && LA44_933 <= ';')||LA44_933=='?'||(LA44_933 >= 'A' && LA44_933 <= 'Z')||LA44_933=='_'||(LA44_933 >= 'a' && LA44_933 <= 'r')||(LA44_933 >= 't' && LA44_933 <= 'z')||LA44_933=='\u2019') ) {s = 40;}
						else s = 1085;
						 
						input.seek(index44_933);
						if ( s>=0 ) return s;
						break;

					case 196 : 
						int LA44_1164 = input.LA(1);
						 
						int index44_1164 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1164==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1164);
						if ( s>=0 ) return s;
						break;

					case 197 : 
						int LA44_1200 = input.LA(1);
						 
						int index44_1200 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1200=='s') ) {s = 467;}
						else if ( ((LA44_1200 >= '\t' && LA44_1200 <= '\n')||LA44_1200=='\r'||LA44_1200==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1200=='(') ) {s = 468;}
						else if ( (LA44_1200=='!'||(LA44_1200 >= '&' && LA44_1200 <= '\'')||(LA44_1200 >= ',' && LA44_1200 <= '.')||(LA44_1200 >= '0' && LA44_1200 <= ';')||LA44_1200=='?'||(LA44_1200 >= 'A' && LA44_1200 <= 'Z')||LA44_1200=='_'||(LA44_1200 >= 'a' && LA44_1200 <= 'r')||(LA44_1200 >= 't' && LA44_1200 <= 'z')||LA44_1200=='\u2019') ) {s = 40;}
						else s = 1283;
						 
						input.seek(index44_1200);
						if ( s>=0 ) return s;
						break;

					case 198 : 
						int LA44_687 = input.LA(1);
						 
						int index44_687 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_687==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_687);
						if ( s>=0 ) return s;
						break;

					case 199 : 
						int LA44_488 = input.LA(1);
						 
						int index44_488 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_488==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_488);
						if ( s>=0 ) return s;
						break;

					case 200 : 
						int LA44_1395 = input.LA(1);
						 
						int index44_1395 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1395==' ') && ((allowGroup))) {s = 1428;}
						else s = 40;
						 
						input.seek(index44_1395);
						if ( s>=0 ) return s;
						break;

					case 201 : 
						int LA44_1170 = input.LA(1);
						 
						int index44_1170 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1170==' ') && ((allowGroup))) {s = 1182;}
						else s = 40;
						 
						input.seek(index44_1170);
						if ( s>=0 ) return s;
						break;

					case 202 : 
						int LA44_316 = input.LA(1);
						 
						int index44_316 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_316==' ') && ((allowGroup))) {s = 509;}
						else s = 40;
						 
						input.seek(index44_316);
						if ( s>=0 ) return s;
						break;

					case 203 : 
						int LA44_1063 = input.LA(1);
						 
						int index44_1063 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1063==' ') && ((allowGroup))) {s = 1182;}
						else s = 40;
						 
						input.seek(index44_1063);
						if ( s>=0 ) return s;
						break;

					case 204 : 
						int LA44_623 = input.LA(1);
						 
						int index44_623 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_623==' ') && ((allowGroup))) {s = 810;}
						else s = 40;
						 
						input.seek(index44_623);
						if ( s>=0 ) return s;
						break;

					case 205 : 
						int LA44_395 = input.LA(1);
						 
						int index44_395 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_395==' ') && ((allowGroup))) {s = 509;}
						else s = 40;
						 
						input.seek(index44_395);
						if ( s>=0 ) return s;
						break;

					case 206 : 
						int LA44_1260 = input.LA(1);
						 
						int index44_1260 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1260==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1260);
						if ( s>=0 ) return s;
						break;

					case 207 : 
						int LA44_678 = input.LA(1);
						 
						int index44_678 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_678==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_678);
						if ( s>=0 ) return s;
						break;

					case 208 : 
						int LA44_394 = input.LA(1);
						 
						int index44_394 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_394==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_394=='d') ) {s = 583;}
						else if ( (LA44_394=='m') ) {s = 584;}
						else s = 40;
						 
						input.seek(index44_394);
						if ( s>=0 ) return s;
						break;

					case 209 : 
						int LA44_1056 = input.LA(1);
						 
						int index44_1056 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1056==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1056=='s') ) {s = 1176;}
						else s = 40;
						 
						input.seek(index44_1056);
						if ( s>=0 ) return s;
						break;

					case 210 : 
						int LA44_1027 = input.LA(1);
						 
						int index44_1027 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1027==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1027);
						if ( s>=0 ) return s;
						break;

					case 211 : 
						int LA44_280 = input.LA(1);
						 
						int index44_280 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_280==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_280);
						if ( s>=0 ) return s;
						break;

					case 212 : 
						int LA44_1153 = input.LA(1);
						 
						int index44_1153 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1153==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1153);
						if ( s>=0 ) return s;
						break;

					case 213 : 
						int LA44_1023 = input.LA(1);
						 
						int index44_1023 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1023==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1023);
						if ( s>=0 ) return s;
						break;

					case 214 : 
						int LA44_555 = input.LA(1);
						 
						int index44_555 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_555=='s') ) {s = 467;}
						else if ( ((LA44_555 >= '\t' && LA44_555 <= '\n')||LA44_555=='\r'||LA44_555==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_555=='(') ) {s = 468;}
						else if ( (LA44_555=='!'||(LA44_555 >= '&' && LA44_555 <= '\'')||(LA44_555 >= ',' && LA44_555 <= '.')||(LA44_555 >= '0' && LA44_555 <= ';')||LA44_555=='?'||(LA44_555 >= 'A' && LA44_555 <= 'Z')||LA44_555=='_'||(LA44_555 >= 'a' && LA44_555 <= 'r')||(LA44_555 >= 't' && LA44_555 <= 'z')||LA44_555=='\u2019') ) {s = 40;}
						else s = 748;
						 
						input.seek(index44_555);
						if ( s>=0 ) return s;
						break;

					case 215 : 
						int LA44_832 = input.LA(1);
						 
						int index44_832 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_832==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_832);
						if ( s>=0 ) return s;
						break;

					case 216 : 
						int LA44_1209 = input.LA(1);
						 
						int index44_1209 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1209=='s') ) {s = 467;}
						else if ( ((LA44_1209 >= '\t' && LA44_1209 <= '\n')||LA44_1209=='\r'||LA44_1209==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1209=='(') ) {s = 468;}
						else if ( (LA44_1209=='!'||(LA44_1209 >= '&' && LA44_1209 <= '\'')||(LA44_1209 >= ',' && LA44_1209 <= '.')||(LA44_1209 >= '0' && LA44_1209 <= ';')||LA44_1209=='?'||(LA44_1209 >= 'A' && LA44_1209 <= 'Z')||LA44_1209=='_'||(LA44_1209 >= 'a' && LA44_1209 <= 'r')||(LA44_1209 >= 't' && LA44_1209 <= 'z')||LA44_1209=='\u2019') ) {s = 40;}
						else s = 1291;
						 
						input.seek(index44_1209);
						if ( s>=0 ) return s;
						break;

					case 217 : 
						int LA44_602 = input.LA(1);
						 
						int index44_602 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_602==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_602=='s') ) {s = 792;}
						else s = 40;
						 
						input.seek(index44_602);
						if ( s>=0 ) return s;
						break;

					case 218 : 
						int LA44_1208 = input.LA(1);
						 
						int index44_1208 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1208=='s') ) {s = 467;}
						else if ( ((LA44_1208 >= '\t' && LA44_1208 <= '\n')||LA44_1208=='\r'||LA44_1208==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1208=='(') ) {s = 468;}
						else if ( (LA44_1208=='!'||(LA44_1208 >= '&' && LA44_1208 <= '\'')||(LA44_1208 >= ',' && LA44_1208 <= '.')||(LA44_1208 >= '0' && LA44_1208 <= ';')||LA44_1208=='?'||(LA44_1208 >= 'A' && LA44_1208 <= 'Z')||LA44_1208=='_'||(LA44_1208 >= 'a' && LA44_1208 <= 'r')||(LA44_1208 >= 't' && LA44_1208 <= 'z')||LA44_1208=='\u2019') ) {s = 40;}
						else s = 1290;
						 
						input.seek(index44_1208);
						if ( s>=0 ) return s;
						break;

					case 219 : 
						int LA44_987 = input.LA(1);
						 
						int index44_987 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_987==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_987);
						if ( s>=0 ) return s;
						break;

					case 220 : 
						int LA44_786 = input.LA(1);
						 
						int index44_786 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_786=='s') ) {s = 467;}
						else if ( ((LA44_786 >= '\t' && LA44_786 <= '\n')||LA44_786=='\r'||LA44_786==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_786=='(') ) {s = 468;}
						else if ( (LA44_786=='!'||(LA44_786 >= '&' && LA44_786 <= '\'')||(LA44_786 >= ',' && LA44_786 <= '.')||(LA44_786 >= '0' && LA44_786 <= ';')||LA44_786=='?'||(LA44_786 >= 'A' && LA44_786 <= 'Z')||LA44_786=='_'||(LA44_786 >= 'a' && LA44_786 <= 'r')||(LA44_786 >= 't' && LA44_786 <= 'z')||LA44_786=='\u2019') ) {s = 40;}
						else s = 957;
						 
						input.seek(index44_786);
						if ( s>=0 ) return s;
						break;

					case 221 : 
						int LA44_828 = input.LA(1);
						 
						int index44_828 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_828==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_828);
						if ( s>=0 ) return s;
						break;

					case 222 : 
						int LA44_1119 = input.LA(1);
						 
						int index44_1119 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1119==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1119);
						if ( s>=0 ) return s;
						break;

					case 223 : 
						int LA44_802 = input.LA(1);
						 
						int index44_802 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_802==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_802);
						if ( s>=0 ) return s;
						break;

					case 224 : 
						int LA44_1206 = input.LA(1);
						 
						int index44_1206 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1206=='s') ) {s = 467;}
						else if ( ((LA44_1206 >= '\t' && LA44_1206 <= '\n')||LA44_1206=='\r'||LA44_1206==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1206=='(') ) {s = 468;}
						else if ( (LA44_1206=='!'||(LA44_1206 >= '&' && LA44_1206 <= '\'')||(LA44_1206 >= ',' && LA44_1206 <= '.')||(LA44_1206 >= '0' && LA44_1206 <= ';')||LA44_1206=='?'||(LA44_1206 >= 'A' && LA44_1206 <= 'Z')||LA44_1206=='_'||(LA44_1206 >= 'a' && LA44_1206 <= 'r')||(LA44_1206 >= 't' && LA44_1206 <= 'z')||LA44_1206=='\u2019') ) {s = 40;}
						else s = 1288;
						 
						input.seek(index44_1206);
						if ( s>=0 ) return s;
						break;

					case 225 : 
						int LA44_825 = input.LA(1);
						 
						int index44_825 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_825==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_825);
						if ( s>=0 ) return s;
						break;

					case 226 : 
						int LA44_176 = input.LA(1);
						 
						int index44_176 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_176==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_176);
						if ( s>=0 ) return s;
						break;

					case 227 : 
						int LA44_357 = input.LA(1);
						 
						int index44_357 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_357==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_357);
						if ( s>=0 ) return s;
						break;

					case 228 : 
						int LA44_923 = input.LA(1);
						 
						int index44_923 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_923==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_923);
						if ( s>=0 ) return s;
						break;

					case 229 : 
						int LA44_469 = input.LA(1);
						 
						int index44_469 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_469=='k') ) {s = 668;}
						else if ( (LA44_469=='s') ) {s = 467;}
						else if ( ((LA44_469 >= '\t' && LA44_469 <= '\n')||LA44_469=='\r'||LA44_469==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_469=='(') ) {s = 468;}
						else if ( (LA44_469=='!'||(LA44_469 >= '&' && LA44_469 <= '\'')||(LA44_469 >= ',' && LA44_469 <= '.')||(LA44_469 >= '0' && LA44_469 <= ';')||LA44_469=='?'||(LA44_469 >= 'A' && LA44_469 <= 'Z')||LA44_469=='_'||(LA44_469 >= 'a' && LA44_469 <= 'j')||(LA44_469 >= 'l' && LA44_469 <= 'r')||(LA44_469 >= 't' && LA44_469 <= 'z')||LA44_469=='\u2019') ) {s = 40;}
						else s = 669;
						 
						input.seek(index44_469);
						if ( s>=0 ) return s;
						break;

					case 230 : 
						int LA44_948 = input.LA(1);
						 
						int index44_948 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_948=='s') ) {s = 467;}
						else if ( ((LA44_948 >= '\t' && LA44_948 <= '\n')||LA44_948=='\r'||LA44_948==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_948=='(') ) {s = 468;}
						else if ( (LA44_948=='!'||(LA44_948 >= '&' && LA44_948 <= '\'')||(LA44_948 >= ',' && LA44_948 <= '.')||(LA44_948 >= '0' && LA44_948 <= ';')||LA44_948=='?'||(LA44_948 >= 'A' && LA44_948 <= 'Z')||LA44_948=='_'||(LA44_948 >= 'a' && LA44_948 <= 'r')||(LA44_948 >= 't' && LA44_948 <= 'z')||LA44_948=='\u2019') ) {s = 40;}
						else s = 1093;
						 
						input.seek(index44_948);
						if ( s>=0 ) return s;
						break;

					case 231 : 
						int LA44_1348 = input.LA(1);
						 
						int index44_1348 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1348=='s') ) {s = 467;}
						else if ( ((LA44_1348 >= '\t' && LA44_1348 <= '\n')||LA44_1348=='\r'||LA44_1348==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1348=='(') ) {s = 468;}
						else if ( (LA44_1348=='!'||(LA44_1348 >= '&' && LA44_1348 <= '\'')||(LA44_1348 >= ',' && LA44_1348 <= '.')||(LA44_1348 >= '0' && LA44_1348 <= ';')||LA44_1348=='?'||(LA44_1348 >= 'A' && LA44_1348 <= 'Z')||LA44_1348=='_'||(LA44_1348 >= 'a' && LA44_1348 <= 'r')||(LA44_1348 >= 't' && LA44_1348 <= 'z')||LA44_1348=='\u2019') ) {s = 40;}
						else s = 1397;
						 
						input.seek(index44_1348);
						if ( s>=0 ) return s;
						break;

					case 232 : 
						int LA44_1091 = input.LA(1);
						 
						int index44_1091 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1091=='s') ) {s = 467;}
						else if ( ((LA44_1091 >= '\t' && LA44_1091 <= '\n')||LA44_1091=='\r'||LA44_1091==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1091=='(') ) {s = 468;}
						else if ( (LA44_1091=='!'||(LA44_1091 >= '&' && LA44_1091 <= '\'')||(LA44_1091 >= ',' && LA44_1091 <= '.')||(LA44_1091 >= '0' && LA44_1091 <= ';')||LA44_1091=='?'||(LA44_1091 >= 'A' && LA44_1091 <= 'Z')||LA44_1091=='_'||(LA44_1091 >= 'a' && LA44_1091 <= 'r')||(LA44_1091 >= 't' && LA44_1091 <= 'z')||LA44_1091=='\u2019') ) {s = 40;}
						else s = 1203;
						 
						input.seek(index44_1091);
						if ( s>=0 ) return s;
						break;

					case 233 : 
						int LA44_523 = input.LA(1);
						 
						int index44_523 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_523==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_523=='h') ) {s = 718;}
						else s = 40;
						 
						input.seek(index44_523);
						if ( s>=0 ) return s;
						break;

					case 234 : 
						int LA44_921 = input.LA(1);
						 
						int index44_921 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_921==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_921);
						if ( s>=0 ) return s;
						break;

					case 235 : 
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

					case 236 : 
						int LA44_1278 = input.LA(1);
						 
						int index44_1278 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1278==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1278);
						if ( s>=0 ) return s;
						break;

					case 237 : 
						int LA44_772 = input.LA(1);
						 
						int index44_772 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_772=='s') ) {s = 467;}
						else if ( ((LA44_772 >= '\t' && LA44_772 <= '\n')||LA44_772=='\r'||LA44_772==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_772=='(') ) {s = 468;}
						else if ( (LA44_772=='!'||(LA44_772 >= '&' && LA44_772 <= '\'')||(LA44_772 >= ',' && LA44_772 <= '.')||(LA44_772 >= '0' && LA44_772 <= ';')||LA44_772=='?'||(LA44_772 >= 'A' && LA44_772 <= 'Z')||LA44_772=='_'||(LA44_772 >= 'a' && LA44_772 <= 'r')||(LA44_772 >= 't' && LA44_772 <= 'z')||LA44_772=='\u2019') ) {s = 40;}
						else s = 945;
						 
						input.seek(index44_772);
						if ( s>=0 ) return s;
						break;

					case 238 : 
						int LA44_579 = input.LA(1);
						 
						int index44_579 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_579=='s') ) {s = 467;}
						else if ( ((LA44_579 >= '\t' && LA44_579 <= '\n')||LA44_579=='\r'||LA44_579==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_579=='(') ) {s = 468;}
						else if ( (LA44_579=='!'||(LA44_579 >= '&' && LA44_579 <= '\'')||(LA44_579 >= ',' && LA44_579 <= '.')||(LA44_579 >= '0' && LA44_579 <= ';')||LA44_579=='?'||(LA44_579 >= 'A' && LA44_579 <= 'Z')||LA44_579=='_'||(LA44_579 >= 'a' && LA44_579 <= 'r')||(LA44_579 >= 't' && LA44_579 <= 'z')||LA44_579=='\u2019') ) {s = 40;}
						else s = 771;
						 
						input.seek(index44_579);
						if ( s>=0 ) return s;
						break;

					case 239 : 
						int LA44_577 = input.LA(1);
						 
						int index44_577 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_577=='s') ) {s = 467;}
						else if ( ((LA44_577 >= '\t' && LA44_577 <= '\n')||LA44_577=='\r'||LA44_577==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_577=='(') ) {s = 468;}
						else if ( (LA44_577=='!'||(LA44_577 >= '&' && LA44_577 <= '\'')||(LA44_577 >= ',' && LA44_577 <= '.')||(LA44_577 >= '0' && LA44_577 <= ';')||LA44_577=='?'||(LA44_577 >= 'A' && LA44_577 <= 'Z')||LA44_577=='_'||(LA44_577 >= 'a' && LA44_577 <= 'r')||(LA44_577 >= 't' && LA44_577 <= 'z')||LA44_577=='\u2019') ) {s = 40;}
						else s = 769;
						 
						input.seek(index44_577);
						if ( s>=0 ) return s;
						break;

					case 240 : 
						int LA44_954 = input.LA(1);
						 
						int index44_954 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_954==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_954);
						if ( s>=0 ) return s;
						break;

					case 241 : 
						int LA44_715 = input.LA(1);
						 
						int index44_715 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_715==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_715);
						if ( s>=0 ) return s;
						break;

					case 242 : 
						int LA44_766 = input.LA(1);
						 
						int index44_766 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_766=='s') ) {s = 467;}
						else if ( ((LA44_766 >= '\t' && LA44_766 <= '\n')||LA44_766=='\r'||LA44_766==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_766=='(') ) {s = 468;}
						else if ( (LA44_766=='!'||(LA44_766 >= '&' && LA44_766 <= '\'')||(LA44_766 >= ',' && LA44_766 <= '.')||(LA44_766 >= '0' && LA44_766 <= ';')||LA44_766=='?'||(LA44_766 >= 'A' && LA44_766 <= 'Z')||LA44_766=='_'||(LA44_766 >= 'a' && LA44_766 <= 'r')||(LA44_766 >= 't' && LA44_766 <= 'z')||LA44_766=='\u2019') ) {s = 40;}
						else s = 943;
						 
						input.seek(index44_766);
						if ( s>=0 ) return s;
						break;

					case 243 : 
						int LA44_1285 = input.LA(1);
						 
						int index44_1285 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1285=='s') ) {s = 467;}
						else if ( ((LA44_1285 >= '\t' && LA44_1285 <= '\n')||LA44_1285=='\r'||LA44_1285==' ') && ((allowBreed))) {s = 100;}
						else if ( (LA44_1285=='(') ) {s = 468;}
						else if ( (LA44_1285=='!'||(LA44_1285 >= '&' && LA44_1285 <= '\'')||(LA44_1285 >= ',' && LA44_1285 <= '.')||(LA44_1285 >= '0' && LA44_1285 <= ';')||LA44_1285=='?'||(LA44_1285 >= 'A' && LA44_1285 <= 'Z')||LA44_1285=='_'||(LA44_1285 >= 'a' && LA44_1285 <= 'r')||(LA44_1285 >= 't' && LA44_1285 <= 'z')||LA44_1285=='\u2019') ) {s = 40;}
						else s = 1347;
						 
						input.seek(index44_1285);
						if ( s>=0 ) return s;
						break;

					case 244 : 
						int LA44_1276 = input.LA(1);
						 
						int index44_1276 = input.index();
						input.rewind();
						s = -1;
						if ( (LA44_1276==' ') && ((allowBreed))) {s = 100;}
						else s = 40;
						 
						input.seek(index44_1276);
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
