package dev.tnclark8012.dogshow.shared;

import java.util.ArrayList;

public class DogshowEnums {
	public enum Breeds {

		APPENZELLER_SENNENHUNDE("FSS", "Appenzeller Sennenhunde",
				"Appenzeller Sennenhundes"), BARBET("FSS", "Barbet",
				"Barbets"), BERGER_PICARD("FSS", "Berger Picard",
				"Berger Picards", "Berger Picards (Misc. Dog)",
				"Berger Picards (Misc. Bitch)", "Berger Picards (Misc. Dog)",
				"Berger Picards (Misc. Bitches)"), BOERBOEL("FSS",
				"Boerboel", "Boerboels"), BOLOGNESE("FSS",
				"Bolognese", "Bologneses"), BRACCO_ITALIANO("FSS",
				"Bracco Italiano", "Bracco Italianos"), BRAQUE_DU_BOURBONNAIS(
				"FSS", "Braque du Bourbonnais",
				"Braque du Bourbonnaiss"), CATAHOULA_LEOPARD_DOG(
				"FSS", "Catahoula Leopard Dog",
				"Catahoula Leopard Dogs"), CAUCASIAN_OVCHARKA("FSS",
				"Caucasian Ovcharka", "Caucasian Ovcharkas"), CENTRAL_ASIAN_SHEPHERD_DOG(
				"FSS", "Central Asian Shepherd Dog",
				"Central Asian Shepherd Dogs"), CIRNECO_DELL_ETNA(
				"FSS", "Cirneco dell’Etna", "Cirneco dell’Etnas",
				"Cirneco dell’Etna (Misc. Bitch)",
				"Cirnecos dell’Etnas (Misc. Bitches)",
				"Cirnecos dell’Etnas (Misc. Dog)"), COTON_DE_TULEAR(
				"FSS", "Coton de Tulear", "Coton de Tulears"), CZECHOSLOVAKIAN_VLCAK(
				"FSS", "Czechoslovakian Vlcak",
				"Czechoslovakian Vlcaks"), DANISH_SWEDISH_FARMDOG(
				"FSS", "Danish–Swedish Farmdog",
				"Danish–Swedish Farmdogs"), DRENTSCHE_PATRIJSHOND(
				"FSS", "Drentsche Patrijshond",
				"Drentsche Patrijshonds"), ESTRELA_MOUNTAIN_DOG("FSS",
				"Estrela Mountain Dog", "Estrela Mountain Dogs"), EURASIER(
				"FSS", "Eurasier", "Eurasiers"), GERMAN_LONGHAIRED_POINTER(
				"FSS", "German Longhaired Pointer",
				"German Longhaired Pointers"), GERMAN_SPITZ("FSS",
				"German Spitz", "German Spitzs"), GRAND_BASSET_GRIFFON_VENDEEN(
				"FSS", "Grand Basset Griffon Vendeen",
				"Grand Basset Griffon Vendeens"), HAMILTONSTOVARE(
				"FSS", "Hamiltonstovare", "Hamiltonstovares"), HOVAWART(
				"FSS", "Hovawart", "Hovawarts"), JINDO("FSS",
				"Jindo", "Jindos"), KAI_KEN("FSS", "Kai Ken",
				"Kai Kens"), KARELIAN_BEAR_DOG("FSS",
				"Karelian Bear Dog", "Karelian Bear Dogs"), KISHU_KEN(
				"FSS", "Kishu Ken", "Kishu Kens"), KOOIKERHONDJE(
				"FSS", "Kooikerhondje", "Kooikerhondjes"), LAGOTTO_ROMAGNOLO(
				"FSS", "Lagotto Romagnolo", "Lagotto Romagnolos"), LANCASHIRE_HEELER(
				"FSS", "Lancashire Heeler", "Lancashire Heelers"), MINIATURE_AMERICAN_SHEPHERD(
				"FSS", "Miniature American Shepherd",
				"Miniature American Shepherds",
				"Miniature American Shepherd (Misc. Bitch)",
				"Miniature American Shepherds (Misc. Bitches)"), MUDI(
				"FSS", "Mudi", "Mudis"), NORRBOTTENSPETS(
				"FSS", "Norrbottenspets", "Norrbottenspetss"), PERRO_DE_PRESA_CANARIO(
				"FSS", "Perro de Presa Canario",
				"Perro de Presa Canarios"), PORTUGUESE_PODENGO("FSS",
				"Portuguese Podengo", "Portuguese Podengos"), PORTUGUESE_POINTER(
				"FSS", "Portuguese Pointer", "Portuguese Pointers"), RAFEIRO_DO_ALENTJO(
				"FSS", "Rafeiro do Alentjo", "Rafeiro do Alentjos"), RUSSIAN_TOY(
				"FSS", "Russian Toy", "Russian Toys"), SCHAPENDOES(
				"FSS", "Schapendoes", "Schapendoess"), SLOVENSKY_CUVAC(
				"FSS", "Slovensky Cuvac", "Slovensky Cuvacs"), SMALL_MUNSTERLANDER_POINTER(
				"FSS", "Small Munsterlander Pointer",
				"Small Munsterlander Pointers"), SPANISH_MASTIFF(
				"FSS", "Spanish Mastiff", "Spanish Mastiffs"), SPANISH_WATER_DOG(
				"FSS", "Spanish Water Dog", "Spanish Water Dogs"), STABYHOUN(
				"FSS", "Stabyhoun", "Stabyhouns"), SWEDISH_LAPPHUND(
				"FSS", "Swedish Lapphund", "Swedish Lapphunds"), THAI_RIDGEBACK(
				"FSS", "Thai Ridgeback", "Thai Ridgebacks"), TOSA(
				"FSS", "Tosa", "Tosas"), TREEING_TENNESSEE_BRINDLE(
				"FSS", "Treeing Tennessee Brindle",
				"Treeing Tennessee Brindles"),
		// ****END FSS****
		// ****BEGIN Herding****
		AUSTRALIAN_CATTLE_DOG("HERDING", "Australian Cattle Dog",
				"Australian Cattle Dogs"), AUSTRALIAN_SHEPHERD(
				"HERDING", "Australian Shepherd",
				"Australian Shepherds"), BEARDED_COLLIE("HERDING",
				"Bearded Collie", "Bearded Collies"), BEAUCERON(
				"HERDING", "Beauceron", "Beaucerons"), BELGIAN_MALINOIS(
				"HERDING", "Belgian Malinois", "Belgian Malinoiss"), BELGIAN_SHEEPDOG(
				"HERDING", "Belgian Sheepdog", "Belgian Sheepdogs"), BELGIAN_TERVUREN(
				"HERDING", "Belgian Tervuren", "Belgian Tervurens"), BORDER_COLLIE(
				"HERDING", "Border Collie", "Border Collies"), BOUVIER_DES_FLANDRES(
				"HERDING", "Bouvier des Flandres",
				"Bouviers des Flandres"), BRIARD("HERDING", "Briard",
				"Briards"), CANAAN_DOG("HERDING", "Canaan Dog",
				"Canaan Dogs"), COLLIE_ROUGH("HERDING",
				"Collie (Rough)", "Collies (Rough)"), COLLIE_SMOOTH(
				"HERDING", "Collie (Smooth)", "Collies (Smooth)"), ENTLEBUCHER_MOUNTAIN_DOG(
				"HERDING", "Entlebucher Mountain Dog",
				"Entlebucher Mountain Dogs"), FINNISH_LAPPHUND(
				"HERDING", "Finnish Lapphund", "Finnish Lapphunds"), GERMAN_SHEPHERD_DOG(
				"HERDING", "German Shepherd Dog",
				"German Shepherd Dogs"), ICELANDIC_SHEEPDOG("HERDING",
				"Icelandic Sheepdog", "Icelandic Sheepdogs"), NORWEGIAN_BUHUND(
				"HERDING", "Norwegian Buhund", "Norwegian Buhunds"), OLD_ENGLISH_SHEEPDOG(
				"HERDING", "Old English Sheepdog",
				"Old English Sheepdogs"), POLISH_LOWLAND_SHEEPDOG(
				"HERDING", "Polish Lowland Sheepdog",
				"Polish Lowland Sheepdogs"), PULI("HERDING", "Puli",
				"Pulik"), PYRENEAN_SHEPHERD("HERDING",
				"Pyrenean Shepherd", "Pyrenean Shepherds"), SHETLAND_SHEEPDOG(
				"HERDING", "Shetland Sheepdog", "Shetland Sheepdogs"), SWEDISH_VALLHUND(
				"HERDING", "Swedish Vallhund", "Swedish Vallhunds"), CARDIGAN_WELSH_CORGI(
				"HERDING", "Cardigan Welsh Corgi",
				"Cardigan Welsh Corgis"), PEMBROKE_WELSH_CORGI(
				"HERDING", "Pembroke Welsh Corgi",
				"Pembroke Welsh Corgis"),
		// ****END Herding****
		// ****BEGIN Hound****
		AFGHAN_HOUND("HOUND", "Afghan Hound", "Afghan Hounds"), AMERICAN_ENGLISH_COONHOUND(
				"HOUND", "American English Coonhound",
				"American English Coonhounds"), AMERICAN_FOXHOUND(
				"HOUND", "American Foxhound", "American Foxhounds"), BASENJI(
				"HOUND", "Basenji", "Basenjis"), BASSET_HOUND(
				"HOUND", "Basset Hound", "Basset Hounds"), BEAGLE_13(
				"HOUND", "Beagle (13”)", "Beagles (13”)",
				"Beagle (13 Inch)", "Beagles (13 Inch)"), BEAGLE_15(
				"HOUND", "Beagle (15”)", "Beagles (15”)",
				"Beagle (15 Inch)", "Beagles (15 Inch)"), BLACK_AND_TAN_COONHOUND(
				"HOUND", "Black and Tan Coonhound",
				"Black and Tan Coonhounds"), BLOODHOUND("HOUND",
				"Bloodhound", "Bloodhounds"), BORZOI("HOUND",
				"Borzoi", "Borzois"), DACHSHUND_LONGHAIRED("HOUND",
				"Dachshund (Longhaired)", "Dachshunds (Longhaired)"), DACHSHUND_SMOOTH(
				"HOUND", "Dachshund (Smooth)", "Dachshunds (Smooth)"), DACHSHUND_WIREHAIRED(
				"HOUND", "Dachshund (Wirehaired)",
				"Dachshunds (Wirehaired)"), ENGLISH_FOXHOUND("HOUND",
				"English Foxhound", "English Foxhounds"), GREYHOUND(
				"HOUND", "Greyhound", "Greyhounds"), HARRIER(
				"HOUND", "Harrier", "Harriers"), IBIZAN_HOUND(
				"HOUND", "Ibizan Hound", "Ibizan Hounds"), IRISH_WOLFHOUND(
				"HOUND", "Irish Wolfhound", "Irish Wolfhounds"), NORWEGIAN_ELKHOUND(
				"HOUND", "Norwegian Elkhound", "Norwegian Elkhounds"), OTTERHOUND(
				"HOUND", "Otterhound", "Otterhounds"), PETIT_BASSET_GRIFFON_VENDEEN(
				"HOUND", "Petit Basset Griffon Vendéen",
				"Petit Basset Griffon Vendéens",
				"Petit Basset Griffon Vendeen",
				"Petits Bassets Griffons Vendeens"), PHARAOH_HOUND(
				"HOUND", "Pharaoh Hound", "Pharaoh Hounds"), PLOTT(
				"HOUND", "Plott", "Plotts"), RHODESIAN_RIDGEBACK(
				"HOUND", "Rhodesian Ridgeback", "Rhodesian Ridgebacks"), SALUKI(
				"HOUND", "Saluki", "Salukis"), SCOTTISH_DEERHOUND(
				"HOUND", "Scottish Deerhound", "Scottish Deerhounds"), WHIPPET(
				"HOUND", "Whippet", "Whippets"), BLUETICK_COONHOUND(
				"HOUND", "Bluetick Coonhound", "Bluetick Coonhounds"), REDBONE_COONHOUND(
				"HOUND", "Redbone Coonhound", "Redbone Coonhounds"),
		// ****END Hound****
		// ****BEGIN Miscellaneous****
		AZAWAKH("MISCELLANEOUS", "Azawakh", "Azawakhs"), BELGIAN_LAEKENOIS(
				"MISCELLANEOUS", "Belgian Laekenois",
				"Belgian Laekenoiss"), BERGAMASCO("MISCELLANEOUS",
				"Bergamasco", "Bergamascos"), BOERGOEL(
				"MISCELLANEOUS", "Boergoel", "Boergoels"), CHINOOK(
				"MISCELLANEOUS", "Chinook", "Chinooks"), DOGO_ARGENTINO(
				"MISCELLANEOUS", "Dogo Argentino", "Dogo Argentinos"), PERUVIAN_INCA_ORCHID(
				"MISCELLANEOUS", "Peruvian Inca Orchid",
				"Peruvian Inca Orchids"), PORTUGUESE_PODENGO_PEQUENO(
				"MISCELLANEOUS", "Portuguese Podengo Pequeno",
				"Portuguese Podengo Pequenos"), PUMI("MISCELLANEOUS",
				"Pumi", "Pumis"), RAT_TERRIER("MISCELLANEOUS",
				"Rat Terrier", "Rat Terriers"), RUSSELL_TERRIER(
				"MISCELLANEOUS", "Russell Terrier", "Russell Terriers"), SLOUGHI(
				"MISCELLANEOUS", "Sloughi", "Sloughis"), TREEING_WALKER_COONHOUND(
				"MISCELLANEOUS", "Treeing Walker Coonhound",
				"Treeing Walker Coonhounds"), WIREHAIRED_VIZSLA(
				"MISCELLANEOUS", "Wirehaired Vizsla",
				"Wirehaired Vizslas", "Wirehaired Vizsla (Misc. Bitch)",
				"Wirehaired Vizslas (Misc. Dog)",
				"Wirehaired Vizslas (Misc. Bitch)",
				"Wirehaired Vizslas (Misc. Dog)"),
		// ****END Miscellaneous****
		// ****BEGIN NON_SPORTING****
		AMERICAN_ESKIMO_DOG("NON_SPORTING", "American Eskimo Dog",
				"American Eskimo Dogs"), BICHON_FRISE("NON_SPORTING",
				"Bichon Frise", "Bichons Frises"), BOSTON_TERRIER(
				"NON_SPORTING", "Boston Terrier", "Boston Terriers"), BULLDOG(
				"NON_SPORTING", "Bulldog", "Bulldogs"), CHINESE_SHAR_PEI(
				"NON_SPORTING", "Chinese Shar-Pei",
				"Chinese Shar-Peis"), CHOW_CHOW("NON_SPORTING",
				"Chow Chow", "Chow Chows"), DALMATIAN("NON_SPORTING",
				"Dalmatian", "Dalmatians"), FINNISH_SPITZ(
				"NON_SPORTING", "Finnish Spitz", "Finnish Spitzs"), FRENCH_BULLDOG(
				"NON_SPORTING", "French Bulldog", "French Bulldogs"), KEESHOND(
				"NON_SPORTING", "Keeshond", "Keeshonden"), LHASA_APSO(
				"NON_SPORTING", "Lhasa Apso", "Lhasa Apsos"), LOWCHEN(
				"NON_SPORTING", "Löwchen", "Löwchens", "Lowchen",
				"Lowchens"), NORWEGIAN_LUNDEHUND("NON_SPORTING",
				"Norwegian Lundehund", "Norwegian Lundehunds"), POODLE_MINIATURE(
				"NON_SPORTING", "Poodle (Miniature)",
				"Poodles (Miniature)"), POODLE_STANDARD(
				"NON_SPORTING", "Poodle (Standard)",
				"Poodles (Standard)"), SCHIPPERKE("NON_SPORTING",
				"Schipperke", "Schipperkes"), SHIBA_INU(
				"NON_SPORTING", "Shiba Inu", "Shiba Inus"), TIBETAN_SPANIEL(
				"NON_SPORTING", "Tibetan Spaniel", "Tibetan Spaniels"), TIBETAN_TERRIER(
				"NON_SPORTING", "Tibetan Terrier", "Tibetan Terriers"), XOLOITZCUINTLI(
				"NON_SPORTING", "Xoloitzcuintli", "Xoloitzcuintlis"),
		// ****END NON_SPORTING****
		// ****BEGIN Sporting****
		AMERICAN_WATER_SPANIEL("SPORTING", "American Water Spaniel",
				"American Water Spaniels"), BOYKIN_SPANIEL("SPORTING",
				"Boykin Spaniel", "Boykin Spaniels"), BRITTANY(
				"SPORTING", "Brittany", "Brittanys"), CHESAPEAKE_BAY_RETRIEVER(
				"SPORTING", "Chesapeake Bay Retriever",
				"Chesapeake Bay Retrievers", "Retriever (Chesapeake Bay)",
				"Retrievers (Chesapeake Bay)"), CLUMBER_SPANIEL(
				"SPORTING", "Clumber Spaniel", "Clumber Spaniels"), COCKER_SPANIEL_BLACK(
				"SPORTING", "Cocker Spaniel (Black)",
				"Cocker Spaniels (Black)"), COCKER_SPANIEL_ASCOB(
				"SPORTING", "Cocker Spaniel (ASCOB)",
				"Cocker Spaniels (ASCOB)"), COCKER_SPANIEL_PARTI_COLOR(
				"SPORTING", "Cocker Spaniel (Parti-Color)",
				"Cocker Spaniels (Parti-Color)",
				"Spaniel (Cocker) Parti-Color", "Spaniels (Cocker) Parti-Color"), CURLY_COATED_RETRIEVER(
				"SPORTING", "Curly-Coated Retriever",
				"Curly-Coated Retrievers"), ENGLISH_COCKER_SPANIEL(
				"SPORTING", "English Cocker Spaniel",
				"English Cocker Spaniels", "Spaniel (English Cocker)",
				"Spaniels (English Cocker)"), ENGLISH_SETTER(
				"SPORTING", "English Setter", "English Setters",
				"Setter (English)", "Setters (English)"), ENGLISH_SPRINGER_SPANIEL(
				"SPORTING", "English Springer Spaniel",
				"English Springer Spaniels", "Spaniel (English Springer)",
				"Spaniels (English Springer)"), FIELD_SPANIEL(
				"SPORTING", "Field Spaniel", "Field Spaniels",
				"Spaniel (Field)", "Spaniels (Field)"), FLAT_COATED_RETRIEVER(
				"SPORTING", "Flat-Coated Retriever",
				"Flat-Coated Retrievers", "Retriever (Flat-Coated)",
				"Retrievers (Flat-Coated)"), GERMAN_SHORTHAIRED_POINTER(
				"SPORTING", "German Shorthaired Pointer",
				"German Shorthaired Pointers", "Pointer (German Shorthaired)",
				"Pointers (German Shorthaired)"), GERMAN_WIREHAIRED_POINTER(
				"SPORTING", "German Wirehaired Pointer",
				"German Wirehaired Pointers", "Pointer (German Wirehaired)",
				"Pointers (German Wirehaired)"), GOLDEN_RETRIEVER(
				"SPORTING", "Golden Retriever", "Golden Retrievers",
				"Retriever (Golden)", "Retrievers (Golden)"), GORDON_SETTER(
				"SPORTING", "Gordon Setter", "Gordon Setters",
				"Setter (Gordon)", "Setters (Gordon)"), IRISH_RED_AND_WHITE_SETTER(
				"SPORTING", "Irish Red & White Setter",
				"Irish Red & White Setters"), IRISH_SETTER("SPORTING",
				"Irish Setter", "Irish Setters", "Setter (Irish)",
				"Setters (Irish)"), IRISH_WATER_SPANIEL("SPORTING",
				"Irish Water Spaniel", "Irish Water Spaniels"), LABRADOR_RETRIEVER(
				"SPORTING", "Labrador Retriever",
				"Labrador Retrievers", "Retriever (Labrador)",
				"Retrievers (Labrador)"), NOVA_SCOTIA_DUCK_TOLLING_RETRIEVER(
				"SPORTING", "Nova Scotia Duck Tolling Retriever",
				"Nova Scotia Duck Tolling Retrievers"), POINTER(
				"SPORTING", "Pointer", "Pointers"), SPINONE_ITALIANO(
				"SPORTING", "Spinone Italiano", "Spinoni Italiani"), SUSSEX_SPANIEL(
				"SPORTING", "Sussex Spaniel", "Sussex Spaniels"), VIZSLA(
				"SPORTING", "Vizsla", "Vizslas"), WEIMARANER(
				"SPORTING", "Weimaraner", "Weimaraners"), WELSH_SPRINGER_SPANIEL(
				"SPORTING", "Welsh Springer Spaniel",
				"Welsh Springer Spaniels", "Spaniel (Welsh Springer)",
				"Spaniels (Welsh Springer)"), WIREHAIRED_POINTING_GRIFFON(
				"SPORTING", "Wirehaired Pointing Griffon",
				"Wirehaired Pointing Griffons"),
		// ****END Sporting****
		// ****BEGIN Terrier****
		AIREDALE_TERRIER("TERRIER", "Airedale Terrier",
				"Airedale Terriers"), AMERICAN_STAFFORDSHIRE_TERRIER(
				"TERRIER", "American Staffordshire Terrier",
				"American Staffordshire Terriers"), AUSTRALIAN_TERRIER(
				"TERRIER", "Australian Terrier", "Australian Terriers"), BEDLINGTON_TERRIER(
				"TERRIER", "Bedlington Terrier", "Bedlington Terriers"), BORDER_TERRIER(
				"TERRIER", "Border Terrier", "Border Terriers"), BULL_TERRIER_COLORED(
				"TERRIER", "Bull Terrier (Colored)",
				"Bull Terriers (Colored)"), BULL_TERRIER_WHITE(
				"TERRIER", "Bull Terrier (White)",
				"Bull Terriers (White)"), CAIRN_TERRIER("TERRIER",
				"Cairn Terrier", "Cairn Terriers"), CESKY_TERRIER(
				"TERRIER", "Cesky Terrier", "Cesky Terriers"), DANDIE_DINMONT_TERRIER(
				"TERRIER", "Dandie Dinmont Terrier",
				"Dandie Dinmont Terriers"), GLEN_OF_IMAAL_TERRIER(
				"TERRIER", "Glen of Imaal Terrier",
				"Glen of Imaal Terriers"), IRISH_TERRIER("TERRIER",
				"Irish Terrier", "Irish Terriers"), KERRY_BLUE_TERRIER(
				"TERRIER", "Kerry Blue Terrier", "Kerry Blue Terriers"), LAKELAND_TERRIER(
				"TERRIER", "Lakeland Terrier", "Lakeland Terriers"), MANCHESTER_TERRIER_STANDARD(
				"TERRIER", "Manchester Terrier (Standard)",
				"Manchester Terriers (Standard)"), MINIATURE_BULL_TERRIER(
				"TERRIER", "Miniature Bull Terrier",
				"Miniature Bull Terriers"), MINIATURE_SCHNAUZER(
				"TERRIER", "Miniature Schnauzer",
				"Miniature Schnauzers"), NORFOLK_TERRIER("TERRIER",
				"Norfolk Terrier", "Norfolk Terriers"), NORWICH_TERRIER(
				"TERRIER", "Norwich Terrier", "Norwich Terriers"), PARSON_RUSSELL_TERRIER(
				"TERRIER", "Parson Russell Terrier",
				"Parson Russell Terriers"), SCOTTISH_TERRIER(
				"TERRIER", "Scottish Terrier", "Scottish Terriers"), SEALYHAM_TERRIER(
				"TERRIER", "Sealyham Terrier", "Sealyham Terriers"), SKYE_TERRIER(
				"TERRIER", "Skye Terrier", "Skye Terriers"), SMOOTH_FOX_TERRIER(
				"TERRIER", "Smooth Fox Terrier",
				"Smooth Fox Terriers", "Fox Terrier (Smooth)",
				"Fox Terriers (Smooth)"), SOFT_COATED_WHEATEN_TERRIER(
				"TERRIER", "Soft Coated Wheaten Terrier",
				"Soft Coated Wheaten Terriers"), STAFFORDSHIRE_BULL_TERRIER(
				"TERRIER", "Staffordshire Bull Terrier",
				"Staffordshire Bull Terriers"), WELSH_TERRIER(
				"TERRIER", "Welsh Terrier", "Welsh Terriers"), WEST_HIGHLAND_WHITE_TERRIER(
				"TERRIER", "West Highland White Terrier",
				"West Highland White Terriers"), WIRE_FOX_TERRIER(
				"TERRIER", "Wire Fox Terrier", "Wire Fox Terriers",
				"Fox Terrier (Wire)", "Fox Terriers (Wire)"),
		// ****END Terrier****
		// ****BEGIN Toy****
		AFFENPINSCHER("TOY", "Affenpinscher", "Affenpinschers"), BRUSSELS_GRIFFON(
				"TOY", "Brussels Griffon", "Brussels Griffons"), CAVALIER_KING_CHARLES_SPANIEL(
				"TOY", "Cavalier King Charles Spaniel",
				"Cavalier King Charles Spaniels",
				"English Toy Spaniel (K C & R)",
				"English Toy Spaniels (K C & R)"), CHIHUAHUA_LONG_COAT(
				"TOY", "Chihuahua (Long Coat)",
				"Chihuahuas (Long Coat)"), CHIHUAHUA_SMOOTH_COAT(
				"TOY", "Chihuahua (Smooth Coat)",
				"Chihuahuas (Smooth Coat)"), CHINESE_CRESTED("TOY",
				"Chinese Crested", "Chinese Cresteds"), ENGLISH_TOY_SPANIEL_BLENHEIM_AND_PRINCE_CHARLES(
				"TOY",
				"English Toy Spaniel (Blenheim and Prince Charles)",
				"English Toy Spaniels (Blenheim and Prince Charles)"), ENGLISH_TOY_SPANIEL_KING_CHARLES_AND_RUBY(
				"TOY", "English Toy Spaniel (King Charles and Ruby)",
				"English Toy Spaniels (King Charles and Ruby)"), HAVANESE(
				"TOY", "Havanese", "Havaneses"), ITALIAN_GREYHOUND(
				"TOY", "Italian Greyhound", "Italian Greyhounds"), JAPANESE_CHIN(
				"TOY", "Japanese Chin", "Japanese Chins"), MALTESE(
				"TOY", "Maltese", "Malteses"), MANCHESTER_TERRIER_TOY(
				"TOY", "Manchester Terrier (Toy)",
				"Manchester Terriers (Toy)"), MINIATURE_PINSCHER(
				"TOY", "Miniature Pinscher", "Miniature Pinschers"), PAPILLON(
				"TOY", "Papillon", "Papillons"), PEKINGESE(
				"TOY", "Pekingese", "Pekingeses"), POMERANIAN(
				"TOY", "Pomeranian", "Pomeranians"), POODLE_TOY(
				"TOY", "Poodle (Toy)", "Poodles (Toy)"), PUG(
				"TOY", "Pug", "Pugs"), SHIH_TZU("TOY",
				"Shih Tzu", "Shih Tzus"), SILKY_TERRIER("TOY",
				"Silky Terrier", "Silky Terriers"), TOY_FOX_TERRIER(
				"TOY", "Toy Fox Terrier", "Toy Fox Terriers"), YORKSHIRE_TERRIER(
				"TOY", "Yorkshire Terrier", "Yorkshire Terriers"),
		// ****END Toy****
		// ****BEGIN Working****
		AKITA("WORKING", "Akita", "Akitas"), ALASKAN_MALAMUTE(
				"WORKING", "Alaskan Malamute", "Alaskan Malamutes"), ANATOLIAN_SHEPHERD_DOG(
				"WORKING", "Anatolian Shepherd Dog",
				"Anatolian Shepherd Dogs"), BERNESE_MOUNTAIN_DOG(
				"WORKING", "Bernese Mountain Dog",
				"Bernese Mountain Dogs"), BLACK_RUSSIAN_TERRIER(
				"WORKING", "Black Russian Terrier",
				"Black Russian Terriers"), BOXER("WORKING", "Boxer",
				"Boxers"), BULLMASTIFF("WORKING", "Bullmastiff",
				"Bullmastiffs"), CANE_CORSO_("WORKING", "Cane Corso",
				"Cane Corsos"), DOBERMAN_PINSCHER("WORKING",
				"Doberman Pinscher", "Doberman Pinschers"), DOGUE_DE_BORDEAUX(
				"WORKING", "Dogue de Bordeaux", "Dogues de Bordeaux"), GERMAN_PINSCHER(
				"WORKING", "German Pinscher", "German Pinschers"), GIANT_SCHNAUZER(
				"WORKING", "Giant Schnauzer", "Giant Schnauzers"), GREAT_DANE(
				"WORKING", "Great Dane", "Great Danes"), GREAT_PYRENEES(
				"WORKING", "Great Pyrenees", "Great Pyreneess"), GREATER_SWISS_MOUNTAIN_DOG(
				"WORKING", "Greater Swiss Mountain Dog",
				"Greater Swiss Mountain Dogs"), KOMONDOR("WORKING",
				"Komondor", "Komondors"), KUVASZ("WORKING", "Kuvasz",
				"Kuvaszok"), MASTIFF("WORKING", "Mastiff", "Mastiffs"), LEONBERGER(
				"WORKING", "Leonberger", "Leonbergers"), NEAPOLITAN_MASTIFF(
				"WORKING", "Neapolitan Mastiff", "Neapolitan Mastiffs"), NEWFOUNDLAND(
				"WORKING", "Newfoundland", "Newfoundlands"), PORTUGUESE_WATER_DOG(
				"WORKING", "Portuguese Water Dog",
				"Portuguese Water Dogs"), ROTTWEILER("WORKING",
				"Rottweiler", "Rottweilers"), SAINT_BERNARD("WORKING",
				"Saint Bernard", "Saint Bernards"), SAMOYED("WORKING",
				"Samoyed", "Samoyeds"), SIBERIAN_HUSKY("WORKING",
				"Siberian Husky", "Siberian Huskies"), STANDARD_SCHNAUZER(
				"WORKING", "Standard Schnauzer", "Standard Schnauzers"), TIBETAN_MASTIFF(
				"WORKING", "Tibetan Mastiff", "Tibetan Mastiffs");
		// ****END Working****;
		// ****END Working****
		private String mGroupStr;
		private String mName;// primary
		private String[] mAlternateNames;// all possible

		private Breeds(String groupStr, String namePrimary,
				String... otherNames) {
			mGroupStr = groupStr;
			mName = namePrimary;
			ArrayList<String> names = new ArrayList<String>(
					otherNames.length + 1);
			names.add(namePrimary);
			for (int i = 0; i < otherNames.length; i++) {
				names.add(otherNames[i]);
			}
			mAlternateNames = new String[names.size()];
			mAlternateNames = (String[]) names.toArray(mAlternateNames);
		}

		public static Breeds parse(String breedName) {
			breedName = breedName.trim();
			for (Breeds breed : Breeds.values()) {
				if (breed.hasName(breedName)) {
					return breed;
				}
			}
			return null;
		}

		public String getPrimaryName() {
			return mName;
		}

		public String getPlural() {
			return mAlternateNames[1];
		}

		public boolean hasName(String name) {
			return toString().equalsIgnoreCase(name) || mName.equalsIgnoreCase(name) || hasAlternateName(name);
		}

		private boolean hasAlternateName(String name) {
			for (String alt : mAlternateNames) {
				if (alt.equalsIgnoreCase(name)) {
					return true;
				}
			}
			return false;
		}

		public String[] getNames() {
			return mAlternateNames;
		}

		public BreedGroup getGroup() {
			return BreedGroup.parse(mGroupStr);
		}
	}

	public enum BreedGroup {
		TERRIER("Terrier", "Terrier Group"), TOY("Toy", "Toy Group"), SPORTING(
				"Sporting", "Sporting Group"), FSS("FSS", "FSS Group"), NON_SPORTING(
				"Non-Sporting", "Non-sporting Group"), HERDING("Herding",
				"Herding Group"), MISCELLANEOUS("Miscellaneous",
				"Miscellaneous Group"), WORKING("Working", "Working Group"), HOUND(
				"Hound", "Hound Group"), ;
		private Breeds[] mBreeds;
		private String mName;
		private String[] mBreedNames;
		private String[] mAlternateNames;

		BreedGroup(String name, String... alternateNames) {
			mName = name;
			mAlternateNames = alternateNames;
		}

		public static BreedGroup parse(String groupName) {
			groupName = groupName.trim();
			for (BreedGroup group : BreedGroup.values()) {
				if (group.hasName(groupName)) {
					return group;
				}
			}
			return null;
		}

		public boolean hasName(String name) {
			return toString().equalsIgnoreCase(name) || mName.equalsIgnoreCase(name) || hasAlternateName(name);
		}

		private boolean hasAlternateName(String name) {
			for (String alt : mAlternateNames) {
				if (alt.equalsIgnoreCase(name)) {
					return true;
				}
			}
			return false;
		}

		static {
			TERRIER.setBreeds(Breeds.AIREDALE_TERRIER,
					Breeds.AMERICAN_STAFFORDSHIRE_TERRIER,
					Breeds.AUSTRALIAN_TERRIER, Breeds.BEDLINGTON_TERRIER,
					Breeds.BORDER_TERRIER, Breeds.BULL_TERRIER_COLORED,
					Breeds.BULL_TERRIER_WHITE, Breeds.CAIRN_TERRIER,
					Breeds.CESKY_TERRIER, Breeds.DANDIE_DINMONT_TERRIER,
					Breeds.GLEN_OF_IMAAL_TERRIER, Breeds.IRISH_TERRIER,
					Breeds.KERRY_BLUE_TERRIER, Breeds.LAKELAND_TERRIER,
					Breeds.MANCHESTER_TERRIER_STANDARD,
					Breeds.MINIATURE_BULL_TERRIER, Breeds.MINIATURE_SCHNAUZER,
					Breeds.NORFOLK_TERRIER, Breeds.NORWICH_TERRIER,
					Breeds.PARSON_RUSSELL_TERRIER, Breeds.SCOTTISH_TERRIER,
					Breeds.SEALYHAM_TERRIER, Breeds.SKYE_TERRIER,
					Breeds.SMOOTH_FOX_TERRIER,
					Breeds.SOFT_COATED_WHEATEN_TERRIER,
					Breeds.STAFFORDSHIRE_BULL_TERRIER, Breeds.WELSH_TERRIER,
					Breeds.WEST_HIGHLAND_WHITE_TERRIER, Breeds.WIRE_FOX_TERRIER);
			TOY.setBreeds(Breeds.AFFENPINSCHER, Breeds.BRUSSELS_GRIFFON,
					Breeds.CAVALIER_KING_CHARLES_SPANIEL,
					Breeds.CHIHUAHUA_LONG_COAT, Breeds.CHIHUAHUA_SMOOTH_COAT,
					Breeds.CHINESE_CRESTED,
					Breeds.ENGLISH_TOY_SPANIEL_BLENHEIM_AND_PRINCE_CHARLES,
					Breeds.ENGLISH_TOY_SPANIEL_KING_CHARLES_AND_RUBY,
					Breeds.HAVANESE, Breeds.ITALIAN_GREYHOUND,
					Breeds.JAPANESE_CHIN, Breeds.MALTESE,
					Breeds.MANCHESTER_TERRIER_TOY, Breeds.MINIATURE_PINSCHER,
					Breeds.PAPILLON, Breeds.PEKINGESE, Breeds.POMERANIAN,
					Breeds.POODLE_TOY, Breeds.PUG, Breeds.SHIH_TZU,
					Breeds.SILKY_TERRIER, Breeds.TOY_FOX_TERRIER,
					Breeds.YORKSHIRE_TERRIER);
			SPORTING.setBreeds(Breeds.AMERICAN_WATER_SPANIEL,
					Breeds.BOYKIN_SPANIEL, Breeds.BRITTANY,
					Breeds.CHESAPEAKE_BAY_RETRIEVER, Breeds.CLUMBER_SPANIEL,
					Breeds.COCKER_SPANIEL_BLACK, Breeds.COCKER_SPANIEL_ASCOB,
					Breeds.COCKER_SPANIEL_PARTI_COLOR,
					Breeds.CURLY_COATED_RETRIEVER,
					Breeds.ENGLISH_COCKER_SPANIEL, Breeds.ENGLISH_SETTER,
					Breeds.ENGLISH_SPRINGER_SPANIEL, Breeds.FIELD_SPANIEL,
					Breeds.FLAT_COATED_RETRIEVER,
					Breeds.GERMAN_SHORTHAIRED_POINTER,
					Breeds.GERMAN_WIREHAIRED_POINTER, Breeds.GOLDEN_RETRIEVER,
					Breeds.GORDON_SETTER, Breeds.IRISH_RED_AND_WHITE_SETTER,
					Breeds.IRISH_SETTER, Breeds.IRISH_WATER_SPANIEL,
					Breeds.LABRADOR_RETRIEVER,
					Breeds.NOVA_SCOTIA_DUCK_TOLLING_RETRIEVER, Breeds.POINTER,
					Breeds.SPINONE_ITALIANO, Breeds.SUSSEX_SPANIEL,
					Breeds.VIZSLA, Breeds.WEIMARANER,
					Breeds.WELSH_SPRINGER_SPANIEL,
					Breeds.WIREHAIRED_POINTING_GRIFFON);
			FSS.setBreeds(Breeds.APPENZELLER_SENNENHUNDE, Breeds.BARBET,
					Breeds.BERGER_PICARD, Breeds.BOERBOEL, Breeds.BOLOGNESE,
					Breeds.BRACCO_ITALIANO, Breeds.BRAQUE_DU_BOURBONNAIS,
					Breeds.CATAHOULA_LEOPARD_DOG, Breeds.CAUCASIAN_OVCHARKA,
					Breeds.CENTRAL_ASIAN_SHEPHERD_DOG,
					Breeds.CIRNECO_DELL_ETNA, Breeds.COTON_DE_TULEAR,
					Breeds.CZECHOSLOVAKIAN_VLCAK,
					Breeds.DANISH_SWEDISH_FARMDOG,
					Breeds.DRENTSCHE_PATRIJSHOND, Breeds.ESTRELA_MOUNTAIN_DOG,
					Breeds.EURASIER, Breeds.GERMAN_LONGHAIRED_POINTER,
					Breeds.GERMAN_SPITZ, Breeds.GRAND_BASSET_GRIFFON_VENDEEN,
					Breeds.HAMILTONSTOVARE, Breeds.HOVAWART, Breeds.JINDO,
					Breeds.KAI_KEN, Breeds.KARELIAN_BEAR_DOG, Breeds.KISHU_KEN,
					Breeds.KOOIKERHONDJE, Breeds.LAGOTTO_ROMAGNOLO,
					Breeds.LANCASHIRE_HEELER,
					Breeds.MINIATURE_AMERICAN_SHEPHERD, Breeds.MUDI,
					Breeds.NORRBOTTENSPETS, Breeds.PERRO_DE_PRESA_CANARIO,
					Breeds.PORTUGUESE_PODENGO, Breeds.PORTUGUESE_POINTER,
					Breeds.RAFEIRO_DO_ALENTJO, Breeds.RUSSIAN_TOY,
					Breeds.SCHAPENDOES, Breeds.SLOVENSKY_CUVAC,
					Breeds.SMALL_MUNSTERLANDER_POINTER, Breeds.SPANISH_MASTIFF,
					Breeds.SPANISH_WATER_DOG, Breeds.STABYHOUN,
					Breeds.SWEDISH_LAPPHUND, Breeds.THAI_RIDGEBACK,
					Breeds.TOSA, Breeds.TREEING_TENNESSEE_BRINDLE);
			NON_SPORTING.setBreeds(Breeds.AMERICAN_ESKIMO_DOG,
					Breeds.BICHON_FRISE, Breeds.BOSTON_TERRIER, Breeds.BULLDOG,
					Breeds.CHINESE_SHAR_PEI, Breeds.CHOW_CHOW,
					Breeds.DALMATIAN, Breeds.FINNISH_SPITZ,
					Breeds.FRENCH_BULLDOG, Breeds.KEESHOND, Breeds.LHASA_APSO,
					Breeds.LOWCHEN, Breeds.NORWEGIAN_LUNDEHUND,
					Breeds.POODLE_MINIATURE, Breeds.POODLE_STANDARD,
					Breeds.SCHIPPERKE, Breeds.SHIBA_INU,
					Breeds.TIBETAN_SPANIEL, Breeds.TIBETAN_TERRIER,
					Breeds.XOLOITZCUINTLI);
			HERDING.setBreeds(Breeds.AUSTRALIAN_CATTLE_DOG,
					Breeds.AUSTRALIAN_SHEPHERD, Breeds.BEARDED_COLLIE,
					Breeds.BEAUCERON, Breeds.BELGIAN_MALINOIS,
					Breeds.BELGIAN_SHEEPDOG, Breeds.BELGIAN_TERVUREN,
					Breeds.BORDER_COLLIE, Breeds.BOUVIER_DES_FLANDRES,
					Breeds.BRIARD, Breeds.CANAAN_DOG, Breeds.COLLIE_ROUGH,
					Breeds.COLLIE_SMOOTH, Breeds.ENTLEBUCHER_MOUNTAIN_DOG,
					Breeds.FINNISH_LAPPHUND, Breeds.GERMAN_SHEPHERD_DOG,
					Breeds.ICELANDIC_SHEEPDOG, Breeds.NORWEGIAN_BUHUND,
					Breeds.OLD_ENGLISH_SHEEPDOG,
					Breeds.POLISH_LOWLAND_SHEEPDOG, Breeds.PULI,
					Breeds.PYRENEAN_SHEPHERD, Breeds.SHETLAND_SHEEPDOG,
					Breeds.SWEDISH_VALLHUND, Breeds.CARDIGAN_WELSH_CORGI,
					Breeds.PEMBROKE_WELSH_CORGI);
			MISCELLANEOUS.setBreeds(Breeds.AZAWAKH, Breeds.BELGIAN_LAEKENOIS,
					Breeds.BERGAMASCO, Breeds.BOERGOEL, Breeds.CHINOOK,
					Breeds.DOGO_ARGENTINO, Breeds.PERUVIAN_INCA_ORCHID,
					Breeds.PORTUGUESE_PODENGO_PEQUENO, Breeds.PUMI,
					Breeds.RAT_TERRIER, Breeds.RUSSELL_TERRIER, Breeds.SLOUGHI,
					Breeds.TREEING_WALKER_COONHOUND, Breeds.WIREHAIRED_VIZSLA);
			WORKING.setBreeds(Breeds.AKITA, Breeds.ALASKAN_MALAMUTE,
					Breeds.ANATOLIAN_SHEPHERD_DOG, Breeds.BERNESE_MOUNTAIN_DOG,
					Breeds.BLACK_RUSSIAN_TERRIER, Breeds.BOXER,
					Breeds.BULLMASTIFF, Breeds.CANE_CORSO_,
					Breeds.DOBERMAN_PINSCHER, Breeds.DOGUE_DE_BORDEAUX,
					Breeds.GERMAN_PINSCHER, Breeds.GIANT_SCHNAUZER,
					Breeds.GREAT_DANE, Breeds.GREAT_PYRENEES,
					Breeds.GREATER_SWISS_MOUNTAIN_DOG, Breeds.KOMONDOR,
					Breeds.KUVASZ, Breeds.MASTIFF, Breeds.LEONBERGER,
					Breeds.NEAPOLITAN_MASTIFF, Breeds.NEWFOUNDLAND,
					Breeds.PORTUGUESE_WATER_DOG, Breeds.ROTTWEILER,
					Breeds.SAINT_BERNARD, Breeds.SAMOYED,
					Breeds.SIBERIAN_HUSKY, Breeds.STANDARD_SCHNAUZER,
					Breeds.TIBETAN_MASTIFF);
			HOUND.setBreeds(Breeds.AFGHAN_HOUND,
					Breeds.AMERICAN_ENGLISH_COONHOUND,
					Breeds.AMERICAN_FOXHOUND, Breeds.BASENJI,
					Breeds.BASSET_HOUND, Breeds.BEAGLE_13, Breeds.BEAGLE_15,
					Breeds.BLACK_AND_TAN_COONHOUND, Breeds.BLOODHOUND,
					Breeds.BORZOI, Breeds.DACHSHUND_LONGHAIRED,
					Breeds.DACHSHUND_SMOOTH, Breeds.DACHSHUND_WIREHAIRED,
					Breeds.ENGLISH_FOXHOUND, Breeds.GREYHOUND, Breeds.HARRIER,
					Breeds.IBIZAN_HOUND, Breeds.IRISH_WOLFHOUND,
					Breeds.NORWEGIAN_ELKHOUND, Breeds.OTTERHOUND,
					Breeds.PETIT_BASSET_GRIFFON_VENDEEN, Breeds.PHARAOH_HOUND,
					Breeds.PLOTT, Breeds.RHODESIAN_RIDGEBACK, Breeds.SALUKI,
					Breeds.SCOTTISH_DEERHOUND, Breeds.WHIPPET,
					Breeds.BLUETICK_COONHOUND, Breeds.REDBONE_COONHOUND);
		}

		void setBreeds(Breeds... breeds) {
			Breeds[] allBreeds = Breeds.values();
			System.out.println("First breed = " + allBreeds);
			mBreeds = breeds;
			mBreedNames = new String[breeds.length];
			for (int i = 0; i < mBreeds.length; i++) {
				if (mBreeds[i] != null) {
					mBreedNames[i] = mBreeds[i].getPrimaryName();
				} else {
					System.err.println("Breed for BreedGroup " + toString()
							+ " was null!");
				}
			}
		}

		public String[] getBreedNames() {
			return mBreedNames;
		}

		public String getName() {
			return mName;
		}

		public Breeds[] getBreeds() {
			return mBreeds;
		}
	}
}