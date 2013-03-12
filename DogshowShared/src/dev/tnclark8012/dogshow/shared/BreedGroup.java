package dev.tnclark8012.dogshow.shared;


public enum BreedGroup {
	TERRIER("Terrier",Breeds.AIREDALE_TERRIER,Breeds.AMERICAN_STAFFORDSHIRE_TERRIER,Breeds.AUSTRALIAN_TERRIER,Breeds.BEDLINGTON_TERRIER,Breeds.BORDER_TERRIER,Breeds.BULL_TERRIER_COLORED,Breeds.BULL_TERRIER_WHITE,Breeds.CAIRN_TERRIER,Breeds.CESKY_TERRIER,Breeds.DANDIE_DINMONT_TERRIER,Breeds.GLEN_OF_IMAAL_TERRIER,Breeds.IRISH_TERRIER,Breeds.KERRY_BLUE_TERRIER,Breeds.LAKELAND_TERRIER,Breeds.MANCHESTER_TERRIER_STANDARD,Breeds.MINIATURE_BULL_TERRIER,Breeds.MINIATURE_SCHNAUZER,Breeds.NORFOLK_TERRIER,Breeds.NORWICH_TERRIER,Breeds.PARSON_RUSSELL_TERRIER,Breeds.SCOTTISH_TERRIER,Breeds.SEALYHAM_TERRIER,Breeds.SKYE_TERRIER,Breeds.SMOOTH_FOX_TERRIER,Breeds.SOFT_COATED_WHEATEN_TERRIER,Breeds.STAFFORDSHIRE_BULL_TERRIER,Breeds.WELSH_TERRIER,Breeds.WEST_HIGHLAND_WHITE_TERRIER,Breeds.WIRE_FOX_TERRIER),
	TOY("Toy",Breeds.AFFENPINSCHER,Breeds.BRUSSELS_GRIFFON,Breeds.CAVALIER_KING_CHARLES_SPANIEL,Breeds.CHIHUAHUA_LONG_COAT,Breeds.CHIHUAHUA_SMOOTH_COAT,Breeds.CHINESE_CRESTED,Breeds.ENGLISH_TOY_SPANIEL_BLENHEIM_AND_PRINCE_CHARLES,Breeds.ENGLISH_TOY_SPANIEL_KING_CHARLES_AND_RUBY,Breeds.HAVANESE,Breeds.ITALIAN_GREYHOUND,Breeds.JAPANESE_CHIN,Breeds.MALTESE,Breeds.MANCHESTER_TERRIER_TOY,Breeds.MINIATURE_PINSCHER,Breeds.PAPILLON,Breeds.PEKINGESE,Breeds.POMERANIAN,Breeds.POODLE_TOY,Breeds.PUG,Breeds.SHIH_TZU,Breeds.SILKY_TERRIER,Breeds.TOY_FOX_TERRIER,Breeds.YORKSHIRE_TERRIER),
	SPORTING("Sporting",Breeds.AMERICAN_WATER_SPANIEL,Breeds.BOYKIN_SPANIEL,Breeds.BRITTANY,Breeds.CHESAPEAKE_BAY_RETRIEVER,Breeds.CLUMBER_SPANIEL,Breeds.COCKER_SPANIEL_BLACK,Breeds.COCKER_SPANIEL_ASCOB,Breeds.COCKER_SPANIEL_PARTI_COLOR,Breeds.CURLY_COATED_RETRIEVER,Breeds.ENGLISH_COCKER_SPANIEL,Breeds.ENGLISH_SETTER,Breeds.ENGLISH_SPRINGER_SPANIEL,Breeds.FIELD_SPANIEL,Breeds.FLAT_COATED_RETRIEVER,Breeds.GERMAN_SHORTHAIRED_POINTER,Breeds.GERMAN_WIREHAIRED_POINTER,Breeds.GOLDEN_RETRIEVER,Breeds.GORDON_SETTER,Breeds.IRISH_RED_AND_WHITE_SETTER,Breeds.IRISH_SETTER,Breeds.IRISH_WATER_SPANIEL,Breeds.LABRADOR_RETRIEVER,Breeds.NOVA_SCOTIA_DUCK_TOLLING_RETRIEVER,Breeds.POINTER,Breeds.SPINONE_ITALIANO,Breeds.SUSSEX_SPANIEL,Breeds.VIZSLA,Breeds.WEIMARANER,Breeds.WELSH_SPRINGER_SPANIEL,Breeds.WIREHAIRED_POINTING_GRIFFON),
	FSS("FSS",Breeds.APPENZELLER_SENNENHUNDE,Breeds.BARBET,Breeds.BERGER_PICARD,Breeds.BOERBOEL,Breeds.BOLOGNESE,Breeds.BRACCO_ITALIANO,Breeds.BRAQUE_DU_BOURBONNAIS,Breeds.CATAHOULA_LEOPARD_DOG,Breeds.CAUCASIAN_OVCHARKA,Breeds.CENTRAL_ASIAN_SHEPHERD_DOG,Breeds.CIRNECO_DELL_ETNA,Breeds.COTON_DE_TULEAR,Breeds.CZECHOSLOVAKIAN_VLCAK,Breeds.DANISH_SWEDISH_FARMDOG,Breeds.DRENTSCHE_PATRIJSHOND,Breeds.ESTRELA_MOUNTAIN_DOG,Breeds.EURASIER,Breeds.GERMAN_LONGHAIRED_POINTER,Breeds.GERMAN_SPITZ,Breeds.GRAND_BASSET_GRIFFON_VENDEEN,Breeds.HAMILTONSTOVARE,Breeds.HOVAWART,Breeds.JINDO,Breeds.KAI_KEN,Breeds.KARELIAN_BEAR_DOG,Breeds.KISHU_KEN,Breeds.KOOIKERHONDJE,Breeds.LAGOTTO_ROMAGNOLO,Breeds.LANCASHIRE_HEELER,Breeds.MINIATURE_AMERICAN_SHEPHERD,Breeds.MUDI,Breeds.NORRBOTTENSPETS,Breeds.PERRO_DE_PRESA_CANARIO,Breeds.PORTUGUESE_PODENGO,Breeds.PORTUGUESE_POINTER,Breeds.RAFEIRO_DO_ALENTJO,Breeds.RUSSIAN_TOY,Breeds.SCHAPENDOES,Breeds.SLOVENSKY_CUVAC,Breeds.SMALL_MUNSTERLANDER_POINTER,Breeds.SPANISH_MASTIFF,Breeds.SPANISH_WATER_DOG,Breeds.STABYHOUN,Breeds.SWEDISH_LAPPHUND,Breeds.THAI_RIDGEBACK,Breeds.TOSA,Breeds.TREEING_TENNESSEE_BRINDLE),
	NON_SPORTING("Non-Sporting",Breeds.AMERICAN_ESKIMO_DOG,Breeds.BICHON_FRISE,Breeds.BOSTON_TERRIER,Breeds.BULLDOG,Breeds.CHINESE_SHAR_PEI,Breeds.CHOW_CHOW,Breeds.DALMATIAN,Breeds.FINNISH_SPITZ,Breeds.FRENCH_BULLDOG,Breeds.KEESHOND,Breeds.LHASA_APSO,Breeds.L�WCHEN,Breeds.NORWEGIAN_LUNDEHUND,Breeds.POODLE_MINIATURE,Breeds.POODLE_STANDARD,Breeds.SCHIPPERKE,Breeds.SHIBA_INU,Breeds.TIBETAN_SPANIEL,Breeds.TIBETAN_TERRIER,Breeds.XOLOITZCUINTLI),
	HERDING("Herding",Breeds.AUSTRALIAN_CATTLE_DOG,Breeds.AUSTRALIAN_SHEPHERD,Breeds.BEARDED_COLLIE,Breeds.BEAUCERON,Breeds.BELGIAN_MALINOIS,Breeds.BELGIAN_SHEEPDOG,Breeds.BELGIAN_TERVUREN,Breeds.BORDER_COLLIE,Breeds.BOUVIER_DES_FLANDRES,Breeds.BRIARD,Breeds.CANAAN_DOG,Breeds.COLLIE_ROUGH,Breeds.COLLIE_SMOOTH,Breeds.ENTLEBUCHER_MOUNTAIN_DOG,Breeds.FINNISH_LAPPHUND,Breeds.GERMAN_SHEPHERD_DOG,Breeds.ICELANDIC_SHEEPDOG,Breeds.NORWEGIAN_BUHUND,Breeds.OLD_ENGLISH_SHEEPDOG,Breeds.POLISH_LOWLAND_SHEEPDOG,Breeds.PULI,Breeds.PYRENEAN_SHEPHERD,Breeds.SHETLAND_SHEEPDOG,Breeds.SWEDISH_VALLHUND,Breeds.CARDIGAN_WELSH_CORGI,Breeds.PEMBROKE_WELSH_CORGI),
	MISCELLANEOUS("Miscellaneous",Breeds.AZAWAKH,Breeds.BELGIAN_LAEKENOIS,Breeds.BERGAMASCO,Breeds.BOERGOEL,Breeds.CHINOOK,Breeds.DOGO_ARGENTINO,Breeds.PERUVIAN_INCA_ORCHID,Breeds.PORTUGUESE_PODENGO_PEQUENO,Breeds.PUMI,Breeds.RAT_TERRIER,Breeds.RUSSELL_TERRIER,Breeds.SLOUGHI,Breeds.TREEING_WALKER_COONHOUND,Breeds.WIREHAIRED_VIZSLA),
	WORKING("Working",Breeds.AKITA,Breeds.ALASKAN_MALAMUTE,Breeds.ANATOLIAN_SHEPHERD_DOG,Breeds.BERNESE_MOUNTAIN_DOG,Breeds.BLACK_RUSSIAN_TERRIER,Breeds.BOXER,Breeds.BULLMASTIFF,Breeds.CANE_CORSO_,Breeds.DOBERMAN_PINSCHER,Breeds.DOGUE_DE_BORDEAUX,Breeds.GERMAN_PINSCHER,Breeds.GIANT_SCHNAUZER,Breeds.GREAT_DANE,Breeds.GREAT_PYRENEES,Breeds.GREATER_SWISS_MOUNTAIN_DOG,Breeds.KOMONDOR,Breeds.KUVASZ,Breeds.MASTIFF,Breeds.LEONBERGER,Breeds.NEAPOLITAN_MASTIFF,Breeds.NEWFOUNDLAND,Breeds.PORTUGUESE_WATER_DOG,Breeds.ROTTWEILER,Breeds.SAINT_BERNARD,Breeds.SAMOYED,Breeds.SIBERIAN_HUSKY,Breeds.STANDARD_SCHNAUZER,Breeds.TIBETAN_MASTIFF),
	HOUND("Hound",Breeds.AFGHAN_HOUND,Breeds.AMERICAN_ENGLISH_COONHOUND,Breeds.AMERICAN_FOXHOUND,Breeds.BASENJI,Breeds.BASSET_HOUND,Breeds.BEAGLE_13,Breeds.BEAGLE_15,Breeds.BLACK_AND_TAN_COONHOUND,Breeds.BLOODHOUND,Breeds.BORZOI,Breeds.DACHSHUND_LONGHAIRED,Breeds.DACHSHUND_SMOOTH,Breeds.DACHSHUND_WIREHAIRED,Breeds.ENGLISH_FOXHOUND,Breeds.GREYHOUND,Breeds.HARRIER,Breeds.IBIZAN_HOUND,Breeds.IRISH_WOLFHOUND,Breeds.NORWEGIAN_ELKHOUND,Breeds.OTTERHOUND,Breeds.PETIT_BASSET_GRIFFON_VEND�EN,Breeds.PHARAOH_HOUND,Breeds.PLOTT,Breeds.RHODESIAN_RIDGEBACK,Breeds.SALUKI,Breeds.SCOTTISH_DEERHOUND,Breeds.WHIPPET,Breeds.BLUETICK_COONHOUND,Breeds.REDBONE_COONHOUND),
	;
	private Breeds[] mBreeds;
	private String mName;
	private String[] mBreedNames;
	
	BreedGroup(String name, Breeds... breeds)
	{
		mBreeds = breeds;
		mName = name;
		mBreedNames = new String[breeds.length];
		for( int i = 0; i < mBreeds.length; i++)
		{
			mBreedNames[i] = mBreeds[i].getPrimaryName();
		}
	}
	
	public String[] getBreedNames()
	{
		return mBreedNames; 
	}
	public String getName()
	{
		return mName;
	}
	
	public Breeds[] getBreeds()
	{
		return mBreeds;
	}
}
