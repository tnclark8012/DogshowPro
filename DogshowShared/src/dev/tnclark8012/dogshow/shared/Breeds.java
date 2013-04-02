package dev.tnclark8012.dogshow.shared;

import java.util.ArrayList;

public enum Breeds {
	APPENZELLER_SENNENHUNDE(BreedGroup.FSS, "Appenzeller Sennenhunde", "Appenzeller Sennenhundes"),
	BARBET(BreedGroup.FSS, "Barbet", "Barbets"),
	BERGER_PICARD(BreedGroup.FSS, "Berger Picard", "Berger Picards"),
	BOERBOEL(BreedGroup.FSS, "Boerboel", "Boerboels"),
	BOLOGNESE(BreedGroup.FSS, "Bolognese", "Bologneses"),
	BRACCO_ITALIANO(BreedGroup.FSS, "Bracco Italiano", "Bracco Italianos"),
	BRAQUE_DU_BOURBONNAIS(BreedGroup.FSS, "Braque du Bourbonnais", "Braque du Bourbonnaiss"),
	CATAHOULA_LEOPARD_DOG(BreedGroup.FSS, "Catahoula Leopard Dog", "Catahoula Leopard Dogs"),
	CAUCASIAN_OVCHARKA(BreedGroup.FSS, "Caucasian Ovcharka", "Caucasian Ovcharkas"),
	CENTRAL_ASIAN_SHEPHERD_DOG(BreedGroup.FSS, "Central Asian Shepherd Dog", "Central Asian Shepherd Dogs"),
	CIRNECO_DELL_ETNA(BreedGroup.FSS, "Cirneco dell’Etna", "Cirneco dell’Etnas"),
	COTON_DE_TULEAR(BreedGroup.FSS, "Coton de Tulear", "Coton de Tulears"),
	CZECHOSLOVAKIAN_VLCAK(BreedGroup.FSS, "Czechoslovakian Vlcak", "Czechoslovakian Vlcaks"),
	DANISH_SWEDISH_FARMDOG(BreedGroup.FSS, "Danish–Swedish Farmdog", "Danish–Swedish Farmdogs"),
	DRENTSCHE_PATRIJSHOND(BreedGroup.FSS, "Drentsche Patrijshond", "Drentsche Patrijshonds"),
	ESTRELA_MOUNTAIN_DOG(BreedGroup.FSS, "Estrela Mountain Dog", "Estrela Mountain Dogs"),
	EURASIER(BreedGroup.FSS, "Eurasier", "Eurasiers"),
	GERMAN_LONGHAIRED_POINTER(BreedGroup.FSS, "German Longhaired Pointer", "German Longhaired Pointers"),
	GERMAN_SPITZ(BreedGroup.FSS, "German Spitz", "German Spitzs"),
	GRAND_BASSET_GRIFFON_VENDEEN(BreedGroup.FSS, "Grand Basset Griffon Vendeen", "Grand Basset Griffon Vendeens"),
	HAMILTONSTOVARE(BreedGroup.FSS, "Hamiltonstovare", "Hamiltonstovares"),
	HOVAWART(BreedGroup.FSS, "Hovawart", "Hovawarts"),
	JINDO(BreedGroup.FSS, "Jindo", "Jindos"),
	KAI_KEN(BreedGroup.FSS, "Kai Ken", "Kai Kens"),
	KARELIAN_BEAR_DOG(BreedGroup.FSS, "Karelian Bear Dog", "Karelian Bear Dogs"),
	KISHU_KEN(BreedGroup.FSS, "Kishu Ken", "Kishu Kens"),
	KOOIKERHONDJE(BreedGroup.FSS, "Kooikerhondje", "Kooikerhondjes"),
	LAGOTTO_ROMAGNOLO(BreedGroup.FSS, "Lagotto Romagnolo", "Lagotto Romagnolos"),
	LANCASHIRE_HEELER(BreedGroup.FSS, "Lancashire Heeler", "Lancashire Heelers"),
	MINIATURE_AMERICAN_SHEPHERD(BreedGroup.FSS, "Miniature American Shepherd", "Miniature American Shepherds"),
	MUDI(BreedGroup.FSS, "Mudi", "Mudis"),
	NORRBOTTENSPETS(BreedGroup.FSS, "Norrbottenspets", "Norrbottenspetss"),
	PERRO_DE_PRESA_CANARIO(BreedGroup.FSS, "Perro de Presa Canario", "Perro de Presa Canarios"),
	PORTUGUESE_PODENGO(BreedGroup.FSS, "Portuguese Podengo", "Portuguese Podengos"),
	PORTUGUESE_POINTER(BreedGroup.FSS, "Portuguese Pointer", "Portuguese Pointers"),
	RAFEIRO_DO_ALENTJO(BreedGroup.FSS, "Rafeiro do Alentjo", "Rafeiro do Alentjos"),
	RUSSIAN_TOY(BreedGroup.FSS, "Russian Toy", "Russian Toys"),
	SCHAPENDOES(BreedGroup.FSS, "Schapendoes", "Schapendoess"),
	SLOVENSKY_CUVAC(BreedGroup.FSS, "Slovensky Cuvac", "Slovensky Cuvacs"),
	SMALL_MUNSTERLANDER_POINTER(BreedGroup.FSS, "Small Munsterlander Pointer", "Small Munsterlander Pointers"),
	SPANISH_MASTIFF(BreedGroup.FSS, "Spanish Mastiff", "Spanish Mastiffs"),
	SPANISH_WATER_DOG(BreedGroup.FSS, "Spanish Water Dog", "Spanish Water Dogs"),
	STABYHOUN(BreedGroup.FSS, "Stabyhoun", "Stabyhouns"),
	SWEDISH_LAPPHUND(BreedGroup.FSS, "Swedish Lapphund", "Swedish Lapphunds"),
	THAI_RIDGEBACK(BreedGroup.FSS, "Thai Ridgeback", "Thai Ridgebacks"),
	TOSA(BreedGroup.FSS, "Tosa", "Tosas"),
	TREEING_TENNESSEE_BRINDLE(BreedGroup.FSS, "Treeing Tennessee Brindle", "Treeing Tennessee Brindles"),
	//****END FSS****
	//****BEGIN Herding****
	AUSTRALIAN_CATTLE_DOG(BreedGroup.HERDING, "Australian Cattle Dog", "Australian Cattle Dogs"),
	AUSTRALIAN_SHEPHERD(BreedGroup.HERDING, "Australian Shepherd", "Australian Shepherds"),
	BEARDED_COLLIE(BreedGroup.HERDING, "Bearded Collie", "Bearded Collies"),
	BEAUCERON(BreedGroup.HERDING, "Beauceron", "Beaucerons"),
	BELGIAN_MALINOIS(BreedGroup.HERDING, "Belgian Malinois", "Belgian Malinoiss"),
	BELGIAN_SHEEPDOG(BreedGroup.HERDING, "Belgian Sheepdog", "Belgian Sheepdogs"),
	BELGIAN_TERVUREN(BreedGroup.HERDING, "Belgian Tervuren", "Belgian Tervurens"),
	BORDER_COLLIE(BreedGroup.HERDING, "Border Collie", "Border Collies"),
	BOUVIER_DES_FLANDRES(BreedGroup.HERDING, "Bouvier des Flandres", "Bouvier des Flandress"),
	BRIARD(BreedGroup.HERDING, "Briard", "Briards"),
	CANAAN_DOG(BreedGroup.HERDING, "Canaan Dog", "Canaan Dogs"),
	COLLIE_ROUGH(BreedGroup.HERDING, "Collie (Rough)", "Collies (Rough)"),
	COLLIE_SMOOTH(BreedGroup.HERDING, "Collie (Smooth)", "Collies (Smooth)"),
	ENTLEBUCHER_MOUNTAIN_DOG(BreedGroup.HERDING, "Entlebucher Mountain Dog", "Entlebucher Mountain Dogs"),
	FINNISH_LAPPHUND(BreedGroup.HERDING, "Finnish Lapphund", "Finnish Lapphunds"),
	GERMAN_SHEPHERD_DOG(BreedGroup.HERDING, "German Shepherd Dog", "German Shepherd Dogs"),
	ICELANDIC_SHEEPDOG(BreedGroup.HERDING, "Icelandic Sheepdog", "Icelandic Sheepdogs"),
	NORWEGIAN_BUHUND(BreedGroup.HERDING, "Norwegian Buhund", "Norwegian Buhunds"),
	OLD_ENGLISH_SHEEPDOG(BreedGroup.HERDING, "Old English Sheepdog", "Old English Sheepdogs"),
	POLISH_LOWLAND_SHEEPDOG(BreedGroup.HERDING, "Polish Lowland Sheepdog", "Polish Lowland Sheepdogs"),
	PULI(BreedGroup.HERDING, "Puli", "Pulis"),
	PYRENEAN_SHEPHERD(BreedGroup.HERDING, "Pyrenean Shepherd", "Pyrenean Shepherds"),
	SHETLAND_SHEEPDOG(BreedGroup.HERDING, "Shetland Sheepdog", "Shetland Sheepdogs"),
	SWEDISH_VALLHUND(BreedGroup.HERDING, "Swedish Vallhund", "Swedish Vallhunds"),
	CARDIGAN_WELSH_CORGI(BreedGroup.HERDING, "Cardigan Welsh Corgi", "Cardigan Welsh Corgis"),
	PEMBROKE_WELSH_CORGI(BreedGroup.HERDING, "Pembroke Welsh Corgi", "Pembroke Welsh Corgis"),
	//****END Herding****
	//****BEGIN Hound****
	AFGHAN_HOUND(BreedGroup.HOUND, "Afghan Hound", "Afghan Hounds"),
	AMERICAN_ENGLISH_COONHOUND(BreedGroup.HOUND, "American English Coonhound", "American English Coonhounds"),
	AMERICAN_FOXHOUND(BreedGroup.HOUND, "American Foxhound", "American Foxhounds"),
	BASENJI(BreedGroup.HOUND, "Basenji", "Basenjis"),
	BASSET_HOUND(BreedGroup.HOUND, "Basset Hound", "Basset Hounds"),
	BEAGLE_13(BreedGroup.HOUND, "Beagle (13”)", "Beagles (13”)"),
	BEAGLE_15(BreedGroup.HOUND, "Beagle (15”)", "Beagles (15”)"),
	BLACK_AND_TAN_COONHOUND(BreedGroup.HOUND, "Black and Tan Coonhound", "Black and Tan Coonhounds"),
	BLOODHOUND(BreedGroup.HOUND, "Bloodhound", "Bloodhounds"),
	BORZOI(BreedGroup.HOUND, "Borzoi", "Borzois"),
	DACHSHUND_LONGHAIRED(BreedGroup.HOUND, "Dachshund (Longhaired)", "Dachshunds (Longhaired)"),
	DACHSHUND_SMOOTH(BreedGroup.HOUND, "Dachshund (Smooth)", "Dachshunds (Smooth)"),
	DACHSHUND_WIREHAIRED(BreedGroup.HOUND, "Dachshund (Wirehaired)", "Dachshunds (Wirehaired)"),
	ENGLISH_FOXHOUND(BreedGroup.HOUND, "English Foxhound", "English Foxhounds"),
	GREYHOUND(BreedGroup.HOUND, "Greyhound", "Greyhounds"),
	HARRIER(BreedGroup.HOUND, "Harrier", "Harriers"),
	IBIZAN_HOUND(BreedGroup.HOUND, "Ibizan Hound", "Ibizan Hounds"),
	IRISH_WOLFHOUND(BreedGroup.HOUND, "Irish Wolfhound", "Irish Wolfhounds"),
	NORWEGIAN_ELKHOUND(BreedGroup.HOUND, "Norwegian Elkhound", "Norwegian Elkhounds"),
	OTTERHOUND(BreedGroup.HOUND, "Otterhound", "Otterhounds"),
	PETIT_BASSET_GRIFFON_VENDÉEN(BreedGroup.HOUND, "Petit Basset Griffon Vendéen", "Petit Basset Griffon Vendéens"),
	PHARAOH_HOUND(BreedGroup.HOUND, "Pharaoh Hound", "Pharaoh Hounds"),
	PLOTT(BreedGroup.HOUND, "Plott", "Plotts"),
	RHODESIAN_RIDGEBACK(BreedGroup.HOUND, "Rhodesian Ridgeback", "Rhodesian Ridgebacks"),
	SALUKI(BreedGroup.HOUND, "Saluki", "Salukis"),
	SCOTTISH_DEERHOUND(BreedGroup.HOUND, "Scottish Deerhound", "Scottish Deerhounds"),
	WHIPPET(BreedGroup.HOUND, "Whippet", "Whippets"),
	BLUETICK_COONHOUND(BreedGroup.HOUND, "Bluetick Coonhound", "Bluetick Coonhounds"),
	REDBONE_COONHOUND(BreedGroup.HOUND, "Redbone Coonhound", "Redbone Coonhounds"),
	//****END Hound****
	//****BEGIN Miscellaneous****
	AZAWAKH(BreedGroup.MISCELLANEOUS, "Azawakh", "Azawakhs"),
	BELGIAN_LAEKENOIS(BreedGroup.MISCELLANEOUS, "Belgian Laekenois", "Belgian Laekenoiss"),
	BERGAMASCO(BreedGroup.MISCELLANEOUS, "Bergamasco", "Bergamascos"),
	BOERGOEL(BreedGroup.MISCELLANEOUS, "Boergoel", "Boergoels"),
	CHINOOK(BreedGroup.MISCELLANEOUS, "Chinook", "Chinooks"),
	DOGO_ARGENTINO(BreedGroup.MISCELLANEOUS, "Dogo Argentino", "Dogo Argentinos"),
	PERUVIAN_INCA_ORCHID(BreedGroup.MISCELLANEOUS, "Peruvian Inca Orchid", "Peruvian Inca Orchids"),
	PORTUGUESE_PODENGO_PEQUENO(BreedGroup.MISCELLANEOUS, "Portuguese Podengo Pequeno", "Portuguese Podengo Pequenos"),
	PUMI(BreedGroup.MISCELLANEOUS, "Pumi", "Pumis"),
	RAT_TERRIER(BreedGroup.MISCELLANEOUS, "Rat Terrier", "Rat Terriers"),
	RUSSELL_TERRIER(BreedGroup.MISCELLANEOUS, "Russell Terrier", "Russell Terriers"),
	SLOUGHI(BreedGroup.MISCELLANEOUS, "Sloughi", "Sloughis"),
	TREEING_WALKER_COONHOUND(BreedGroup.MISCELLANEOUS, "Treeing Walker Coonhound", "Treeing Walker Coonhounds"),
	WIREHAIRED_VIZSLA(BreedGroup.MISCELLANEOUS, "Wirehaired Vizsla", "Wirehaired Vizslas"),
	//****END Miscellaneous****
	//****BEGIN NON_SPORTING****
	AMERICAN_ESKIMO_DOG(BreedGroup.NON_SPORTING, "American Eskimo Dog", "American Eskimo Dogs"),
	BICHON_FRISE(BreedGroup.NON_SPORTING, "Bichon Frise", "Bichon Frises"),
	BOSTON_TERRIER(BreedGroup.NON_SPORTING, "Boston Terrier", "Boston Terriers"),
	BULLDOG(BreedGroup.NON_SPORTING, "Bulldog", "Bulldogs"),
	CHINESE_SHAR_PEI(BreedGroup.NON_SPORTING, "Chinese Shar-Pei", "Chinese Shar-Peis"),
	CHOW_CHOW(BreedGroup.NON_SPORTING, "Chow Chow", "Chow Chows"),
	DALMATIAN(BreedGroup.NON_SPORTING, "Dalmatian", "Dalmatians"),
	FINNISH_SPITZ(BreedGroup.NON_SPORTING, "Finnish Spitz", "Finnish Spitzs"),
	FRENCH_BULLDOG(BreedGroup.NON_SPORTING, "French Bulldog", "French Bulldogs"),
	KEESHOND(BreedGroup.NON_SPORTING, "Keeshond", "Keeshonds"),
	LHASA_APSO(BreedGroup.NON_SPORTING, "Lhasa Apso", "Lhasa Apsos"),
	LÖWCHEN(BreedGroup.NON_SPORTING, "Löwchen", "Löwchens"),
	NORWEGIAN_LUNDEHUND(BreedGroup.NON_SPORTING, "Norwegian Lundehund", "Norwegian Lundehunds"),
	POODLE_MINIATURE(BreedGroup.NON_SPORTING, "Poodle (Miniature)", "Poodles (Miniature)"),
	POODLE_STANDARD(BreedGroup.NON_SPORTING, "Poodle (Standard)", "Poodles (Standard)"),
	SCHIPPERKE(BreedGroup.NON_SPORTING, "Schipperke", "Schipperkes"),
	SHIBA_INU(BreedGroup.NON_SPORTING, "Shiba Inu", "Shiba Inus"),
	TIBETAN_SPANIEL(BreedGroup.NON_SPORTING, "Tibetan Spaniel", "Tibetan Spaniels"),
	TIBETAN_TERRIER(BreedGroup.NON_SPORTING, "Tibetan Terrier", "Tibetan Terriers"),
	XOLOITZCUINTLI(BreedGroup.NON_SPORTING, "Xoloitzcuintli", "Xoloitzcuintlis"),
	//****END NON_SPORTING****
	//****BEGIN Sporting****
	AMERICAN_WATER_SPANIEL(BreedGroup.SPORTING, "American Water Spaniel", "American Water Spaniels"),
	BOYKIN_SPANIEL(BreedGroup.SPORTING, "Boykin Spaniel", "Boykin Spaniels"),
	BRITTANY(BreedGroup.SPORTING, "Brittany", "Brittanys"),
	CHESAPEAKE_BAY_RETRIEVER(BreedGroup.SPORTING, "Chesapeake Bay Retriever", "Chesapeake Bay Retrievers"),
	CLUMBER_SPANIEL(BreedGroup.SPORTING, "Clumber Spaniel", "Clumber Spaniels"),
	COCKER_SPANIEL_BLACK(BreedGroup.SPORTING, "Cocker Spaniel (Black)", "Cocker Spaniels (Black)"),
	COCKER_SPANIEL_ASCOB(BreedGroup.SPORTING, "Cocker Spaniel (ASCOB)", "Cocker Spaniels (ASCOB)"),
	COCKER_SPANIEL_PARTI_COLOR(BreedGroup.SPORTING, "Cocker Spaniel (Parti-Color)", "Cocker Spaniels (Parti-Color)"),
	CURLY_COATED_RETRIEVER(BreedGroup.SPORTING, "Curly-Coated Retriever", "Curly-Coated Retrievers"),
	ENGLISH_COCKER_SPANIEL(BreedGroup.SPORTING, "English Cocker Spaniel", "English Cocker Spaniels"),
	ENGLISH_SETTER(BreedGroup.SPORTING, "English Setter", "English Setters"),
	ENGLISH_SPRINGER_SPANIEL(BreedGroup.SPORTING, "English Springer Spaniel", "English Springer Spaniels"),
	FIELD_SPANIEL(BreedGroup.SPORTING, "Field Spaniel", "Field Spaniels"),
	FLAT_COATED_RETRIEVER(BreedGroup.SPORTING, "Flat-Coated Retriever", "Flat-Coated Retrievers"),
	GERMAN_SHORTHAIRED_POINTER(BreedGroup.SPORTING, "German Shorthaired Pointer", "German Shorthaired Pointers"),
	GERMAN_WIREHAIRED_POINTER(BreedGroup.SPORTING, "German Wirehaired Pointer", "German Wirehaired Pointers"),
	GOLDEN_RETRIEVER(BreedGroup.SPORTING, "Golden Retriever", "Golden Retrievers"),
	GORDON_SETTER(BreedGroup.SPORTING, "Gordon Setter", "Gordon Setters"),
	IRISH_RED_AND_WHITE_SETTER(BreedGroup.SPORTING, "Irish Red & White Setter", "Irish Red & White Setters"),
	IRISH_SETTER(BreedGroup.SPORTING, "Irish Setter", "Irish Setters"),
	IRISH_WATER_SPANIEL(BreedGroup.SPORTING, "Irish Water Spaniel", "Irish Water Spaniels"),
	LABRADOR_RETRIEVER(BreedGroup.SPORTING, "Labrador Retriever", "Labrador Retrievers"),
	NOVA_SCOTIA_DUCK_TOLLING_RETRIEVER(BreedGroup.SPORTING, "Nova Scotia Duck Tolling Retriever", "Nova Scotia Duck Tolling Retrievers"),
	POINTER(BreedGroup.SPORTING, "Pointer", "Pointers"),
	SPINONE_ITALIANO(BreedGroup.SPORTING, "Spinone Italiano", "Spinone Italianos"),
	SUSSEX_SPANIEL(BreedGroup.SPORTING, "Sussex Spaniel", "Sussex Spaniels"),
	VIZSLA(BreedGroup.SPORTING, "Vizsla", "Vizslas"),
	WEIMARANER(BreedGroup.SPORTING, "Weimaraner", "Weimaraners"),
	WELSH_SPRINGER_SPANIEL(BreedGroup.SPORTING, "Welsh Springer Spaniel", "Welsh Springer Spaniels"),
	WIREHAIRED_POINTING_GRIFFON(BreedGroup.SPORTING, "Wirehaired Pointing Griffon", "Wirehaired Pointing Griffons"),
	//****END Sporting****
	//****BEGIN Terrier****
	AIREDALE_TERRIER(BreedGroup.TERRIER, "Airedale Terrier", "Airedale Terriers"),
	AMERICAN_STAFFORDSHIRE_TERRIER(BreedGroup.TERRIER, "American Staffordshire Terrier", "American Staffordshire Terriers"),
	AUSTRALIAN_TERRIER(BreedGroup.TERRIER, "Australian Terrier", "Australian Terriers"),
	BEDLINGTON_TERRIER(BreedGroup.TERRIER, "Bedlington Terrier", "Bedlington Terriers"),
	BORDER_TERRIER(BreedGroup.TERRIER, "Border Terrier", "Border Terriers"),
	BULL_TERRIER_COLORED(BreedGroup.TERRIER, "Bull Terrier (Colored)", "Bull Terriers (Colored)"),
	BULL_TERRIER_WHITE(BreedGroup.TERRIER, "Bull Terrier (White)", "Bull Terriers (White)"),
	CAIRN_TERRIER(BreedGroup.TERRIER, "Cairn Terrier", "Cairn Terriers"),
	CESKY_TERRIER(BreedGroup.TERRIER, "Cesky Terrier", "Cesky Terriers"),
	DANDIE_DINMONT_TERRIER(BreedGroup.TERRIER, "Dandie Dinmont Terrier", "Dandie Dinmont Terriers"),
	GLEN_OF_IMAAL_TERRIER(BreedGroup.TERRIER, "Glen of Imaal Terrier", "Glen of Imaal Terriers"),
	IRISH_TERRIER(BreedGroup.TERRIER, "Irish Terrier", "Irish Terriers"),
	KERRY_BLUE_TERRIER(BreedGroup.TERRIER, "Kerry Blue Terrier", "Kerry Blue Terriers"),
	LAKELAND_TERRIER(BreedGroup.TERRIER, "Lakeland Terrier", "Lakeland Terriers"),
	MANCHESTER_TERRIER_STANDARD(BreedGroup.TERRIER, "Manchester Terrier (Standard)", "Manchester Terriers (Standard)"),
	MINIATURE_BULL_TERRIER(BreedGroup.TERRIER, "Miniature Bull Terrier", "Miniature Bull Terriers"),
	MINIATURE_SCHNAUZER(BreedGroup.TERRIER, "Miniature Schnauzer", "Miniature Schnauzers"),
	NORFOLK_TERRIER(BreedGroup.TERRIER, "Norfolk Terrier", "Norfolk Terriers"),
	NORWICH_TERRIER(BreedGroup.TERRIER, "Norwich Terrier", "Norwich Terriers"),
	PARSON_RUSSELL_TERRIER(BreedGroup.TERRIER, "Parson Russell Terrier", "Parson Russell Terriers"),
	SCOTTISH_TERRIER(BreedGroup.TERRIER, "Scottish Terrier", "Scottish Terriers"),
	SEALYHAM_TERRIER(BreedGroup.TERRIER, "Sealyham Terrier", "Sealyham Terriers"),
	SKYE_TERRIER(BreedGroup.TERRIER, "Skye Terrier", "Skye Terriers"),
	SMOOTH_FOX_TERRIER(BreedGroup.TERRIER, "Smooth Fox Terrier", "Smooth Fox Terriers"),
	SOFT_COATED_WHEATEN_TERRIER(BreedGroup.TERRIER, "Soft Coated Wheaten Terrier", "Soft Coated Wheaten Terriers"),
	STAFFORDSHIRE_BULL_TERRIER(BreedGroup.TERRIER, "Staffordshire Bull Terrier", "Staffordshire Bull Terriers"),
	WELSH_TERRIER(BreedGroup.TERRIER, "Welsh Terrier", "Welsh Terriers"),
	WEST_HIGHLAND_WHITE_TERRIER(BreedGroup.TERRIER, "West Highland White Terrier", "West Highland White Terriers"),
	WIRE_FOX_TERRIER(BreedGroup.TERRIER, "Wire Fox Terrier", "Wire Fox Terriers"),
	//****END Terrier****
	//****BEGIN Toy****
	AFFENPINSCHER(BreedGroup.TOY, "Affenpinscher", "Affenpinschers"),
	BRUSSELS_GRIFFON(BreedGroup.TOY, "Brussels Griffon", "Brussels Griffons"),
	CAVALIER_KING_CHARLES_SPANIEL(BreedGroup.TOY, "Cavalier King Charles Spaniel", "Cavalier King Charles Spaniels"),
	CHIHUAHUA_LONG_COAT(BreedGroup.TOY, "Chihuahua (Long Coat)", "Chihuahuas (Long Coat)"),
	CHIHUAHUA_SMOOTH_COAT(BreedGroup.TOY, "Chihuahua (Smooth Coat)", "Chihuahuas (Smooth Coat)"),
	CHINESE_CRESTED(BreedGroup.TOY, "Chinese Crested", "Chinese Cresteds"),
	ENGLISH_TOY_SPANIEL_BLENHEIM_AND_PRINCE_CHARLES(BreedGroup.TOY, "English Toy Spaniel (Blenheim and Prince Charles)", "English Toy Spaniels (Blenheim and Prince Charles)"),
	ENGLISH_TOY_SPANIEL_KING_CHARLES_AND_RUBY(BreedGroup.TOY, "English Toy Spaniel (King Charles and Ruby)", "English Toy Spaniels (King Charles and Ruby)"),
	HAVANESE(BreedGroup.TOY, "Havanese", "Havaneses"),
	ITALIAN_GREYHOUND(BreedGroup.TOY, "Italian Greyhound", "Italian Greyhounds"),
	JAPANESE_CHIN(BreedGroup.TOY, "Japanese Chin", "Japanese Chins"),
	MALTESE(BreedGroup.TOY, "Maltese", "Malteses"),
	MANCHESTER_TERRIER_TOY(BreedGroup.TOY, "Manchester Terrier (Toy)", "Manchester Terriers (Toy)"),
	MINIATURE_PINSCHER(BreedGroup.TOY, "Miniature Pinscher", "Miniature Pinschers"),
	PAPILLON(BreedGroup.TOY, "Papillon", "Papillons"),
	PEKINGESE(BreedGroup.TOY, "Pekingese", "Pekingeses"),
	POMERANIAN(BreedGroup.TOY, "Pomeranian", "Pomeranians"),
	POODLE_TOY(BreedGroup.TOY, "Poodle (Toy)", "Poodles (Toy)"),
	PUG(BreedGroup.TOY, "Pug", "Pugs"),
	SHIH_TZU(BreedGroup.TOY, "Shih Tzu", "Shih Tzus"),
	SILKY_TERRIER(BreedGroup.TOY, "Silky Terrier", "Silky Terriers"),
	TOY_FOX_TERRIER(BreedGroup.TOY, "Toy Fox Terrier", "Toy Fox Terriers"),
	YORKSHIRE_TERRIER(BreedGroup.TOY, "Yorkshire Terrier", "Yorkshire Terriers"),
	//****END Toy****
	//****BEGIN Working****
	AKITA(BreedGroup.WORKING, "Akita", "Akitas"),
	ALASKAN_MALAMUTE(BreedGroup.WORKING, "Alaskan Malamute", "Alaskan Malamutes"),
	ANATOLIAN_SHEPHERD_DOG(BreedGroup.WORKING, "Anatolian Shepherd Dog", "Anatolian Shepherd Dogs"),
	BERNESE_MOUNTAIN_DOG(BreedGroup.WORKING, "Bernese Mountain Dog", "Bernese Mountain Dogs"),
	BLACK_RUSSIAN_TERRIER(BreedGroup.WORKING, "Black Russian Terrier", "Black Russian Terriers"),
	BOXER(BreedGroup.WORKING, "Boxer", "Boxers"),
	BULLMASTIFF(BreedGroup.WORKING, "Bullmastiff", "Bullmastiffs"),
	CANE_CORSO_(BreedGroup.WORKING, "Cane Corso ", "Cane Corso s"),
	DOBERMAN_PINSCHER(BreedGroup.WORKING, "Doberman Pinscher", "Doberman Pinschers"),
	DOGUE_DE_BORDEAUX(BreedGroup.WORKING, "Dogue de Bordeaux", "Dogue de Bordeauxs"),
	GERMAN_PINSCHER(BreedGroup.WORKING, "German Pinscher", "German Pinschers"),
	GIANT_SCHNAUZER(BreedGroup.WORKING, "Giant Schnauzer", "Giant Schnauzers"),
	GREAT_DANE(BreedGroup.WORKING, "Great Dane", "Great Danes"),
	GREAT_PYRENEES(BreedGroup.WORKING, "Great Pyrenees", "Great Pyreneess"),
	GREATER_SWISS_MOUNTAIN_DOG(BreedGroup.WORKING, "Greater Swiss Mountain Dog", "Greater Swiss Mountain Dogs"),
	KOMONDOR(BreedGroup.WORKING, "Komondor", "Komondors"),
	KUVASZ(BreedGroup.WORKING, "Kuvasz", "Kuvaszs"),
	MASTIFF(BreedGroup.WORKING, "Mastiff", "Mastiffs"),
	LEONBERGER(BreedGroup.WORKING, "Leonberger", "Leonbergers"),
	NEAPOLITAN_MASTIFF(BreedGroup.WORKING, "Neapolitan Mastiff", "Neapolitan Mastiffs"),
	NEWFOUNDLAND(BreedGroup.WORKING, "Newfoundland", "Newfoundlands"),
	PORTUGUESE_WATER_DOG(BreedGroup.WORKING, "Portuguese Water Dog", "Portuguese Water Dogs"),
	ROTTWEILER(BreedGroup.WORKING, "Rottweiler", "Rottweilers"),
	SAINT_BERNARD(BreedGroup.WORKING, "Saint Bernard", "Saint Bernards"),
	SAMOYED(BreedGroup.WORKING, "Samoyed", "Samoyeds"),
	SIBERIAN_HUSKY(BreedGroup.WORKING, "Siberian Husky", "Siberian Huskys"),
	STANDARD_SCHNAUZER(BreedGroup.WORKING, "Standard Schnauzer", "Standard Schnauzers"),
	TIBETAN_MASTIFF(BreedGroup.WORKING, "Tibetan Mastiff", "Tibetan Mastiffs");
	//****END Working****;
	//****END Working****
	private BreedGroup mGroup;
	private String mName;//primary
	private String[] mAlternateNames;//all possible
	Breeds(BreedGroup group, String namePrimary, String... otherNames)
	{
		mGroup = group;
		mName = namePrimary;
		ArrayList<String> names = new ArrayList<String>(otherNames.length + 1);
		names.add(namePrimary);
		for(int i = 0; i < otherNames.length; i++)
		{
			names.add(otherNames[i]);
		}
		mAlternateNames = new String[names.size()];
		mAlternateNames = (String[]) names.toArray(mAlternateNames);
	}
	
	public static Breeds parse(String breedName)
	{
		breedName = breedName.trim();
		for(Breeds breed: Breeds.values())
		{
			if( breed.hasName(breedName))
			{
				return breed;
			}
		}
		return null;
	}
	public String getPrimaryName()
	{
		return mName;
	}
	
	public String getPlural()
	{
		return mAlternateNames[0];
	}
	
	public boolean hasName(String name)
	{
		return mName.equalsIgnoreCase(name) || hasAlternateName(name);
	}
	
	private boolean hasAlternateName(String name)
	{
		for(String alt : mAlternateNames)
		{
			if(alt.equalsIgnoreCase(name))
			{
				return true;
			}
		}
		return false;
	}
	public String[] getNames()
	{
		return mAlternateNames;
	}
	
	public BreedGroup getGroup()
	{
		return mGroup;
	}
	
}