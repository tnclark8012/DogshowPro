package dev.tnclark8012.dogshow.shared.driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class Main {

	/**
	 * @param argz
	 * @throws IOException
	 * @throws ParseException
	 * @throws JSONException
	 */
	public static void main(String[] argz) throws IOException, ParseException,
			JSONException {
		// Breeds [] breeds = Breeds.values();

		System.out.println("***************************");
		String json = "{\"breedRing\":[{\"showId\":\"test3\",\"dateMillis\":\"1365008357276\",\"judge\":\"MR ROBERT E HUTTON (90)\",\"ringNumber\":\"4\",\"blockStartMillis\":\"1364997617276\",\"count\":\"21\",\"breed\":\"PAPILLON\",\"dogCount\":\"7\",\"bitchCount\":\"7\",\"specialDogCount\":\"5\",\"specialBitchCount\":\"2\",\"countAhead\":\"5\"},{\"showId\":\"test3\",\"dateMillis\":\"1365267557276\",\"judge\":\"DR DANIEL W DOWLING (162)\",\"ringNumber\":\"7\",\"blockStartMillis\":\"1365245117276\",\"count\":\"27\",\"breed\":\"PAPILLON\",\"dogCount\":\"12\",\"bitchCount\":\"7\",\"specialDogCount\":\"6\",\"specialBitchCount\":\"2\",\"countAhead\":\"0\"},{\"showId\":\"test3\",\"dateMillis\":\"1365353957276\",\"judge\":\"MR WILLIAM DEVILLENEUVE (120)\",\"ringNumber\":\"2\",\"blockStartMillis\":\"1365327017276\",\"count\":\"12\",\"breed\":\"PAPILLON\",\"dogCount\":\"3\",\"bitchCount\":\"3\",\"specialDogCount\":\"6\",\"specialBitchCount\":\"0\",\"countAhead\":\"5\"},{\"showId\":\"test\",\"dateMillis\":\"1365043837713\",\"judge\":\"MR ROBERT E HUTTON (90)\",\"ringNumber\":\"4\",\"blockStartMillis\":\"1365084037713\",\"count\":\"21\",\"breed\":\"PAPILLON\",\"dogCount\":\"7\",\"bitchCount\":\"7\",\"specialDogCount\":\"5\",\"specialBitchCount\":\"2\",\"countAhead\":\"5\"},{\"showId\":\"test\",\"dateMillis\":\"1365130237713\",\"judge\":\"MR DANA L PLONKEY (165)\",\"ringNumber\":\"6\",\"blockStartMillis\":\"1365154537713\",\"count\":\"27\",\"breed\":\"PAPILLON\",\"dogCount\":\"10\",\"bitchCount\":\"8\",\"specialDogCount\":\"6\",\"specialBitchCount\":\"3\",\"countAhead\":\"11\"},{\"showId\":\"test\",\"dateMillis\":\"1365216637713\",\"judge\":\"MR MICHAEL J DACHEL (169)\",\"ringNumber\":\"7\",\"blockStartMillis\":\"1365241837713\",\"count\":\"26\",\"breed\":\"PAPILLON\",\"dogCount\":\"11\",\"bitchCount\":\"7\",\"specialDogCount\":\"6\",\"specialBitchCount\":\"2\",\"countAhead\":\"7\"},{\"showId\":\"test\",\"dateMillis\":\"1365303037713\",\"judge\":\"DR DANIEL W DOWLING (162)\",\"ringNumber\":\"7\",\"blockStartMillis\":\"1365331537713\",\"count\":\"27\",\"breed\":\"PAPILLON\",\"dogCount\":\"12\",\"bitchCount\":\"7\",\"specialDogCount\":\"6\",\"specialBitchCount\":\"2\",\"countAhead\":\"0\"},{\"showId\":\"test\",\"dateMillis\":\"1365389437713\",\"judge\":\"MR WILLIAM DEVILLENEUVE (120)\",\"ringNumber\":\"2\",\"blockStartMillis\":\"1365413437713\",\"count\":\"12\",\"breed\":\"PAPILLON\",\"dogCount\":\"3\",\"bitchCount\":\"3\",\"specialDogCount\":\"6\",\"specialBitchCount\":\"0\",\"countAhead\":\"5\"}]}";
		BreedRingsResponse r = new Gson().fromJson(json, BreedRingsResponse.class);
		if( r!= null )
		{
			System.out.println("Success!");
		}

		System.out.println(Breeds.parse("Poodles (Toy) "));
		if (true) {
			return;
		}
		File breedsDir = new File("breedlist");
		BufferedReader reader;
		Map<String, List<String>> groupBreedMap = new HashMap<String, List<String>>();
		for (File f : breedsDir.listFiles()) {
			reader = new BufferedReader(new FileReader(f));
			String groupName = reader.readLine();
			String groupNameEnum = groupName.toUpperCase().replace("[ \\-]+",
					"_");
			String line = null;
			String breedEnumFormat = "%s(BreedGroup.%s, \"%s\", \"%s\"),";
			List<String> breedNameEnums = new LinkedList<String>();
			breedNameEnums.add(groupName);
			System.out.println("//****BEGIN " + groupName + "****");
			while ((line = reader.readLine()) != null) {
				String name = line;
				String enumName = line.toUpperCase()
						.replaceAll("[’' \"\\-\\(-]+", "_")
						.replaceAll("[\\)”]", "").replaceAll("&", "AND");
				breedNameEnums.add(enumName);

				String plural = name.contains("(") ? name.replaceAll(" \\(",
						"s (") : name + "s";
				System.out.println(String.format(breedEnumFormat, enumName,
						groupNameEnum, name, plural));
			}
			groupBreedMap.put(groupNameEnum, breedNameEnums);
			System.out.println("//****END " + groupName + "****");
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		String groupEnumTemplate = "%s(\"%s\",%s),";
		String currentBreedSet = "";
		for (String groupEnum : groupBreedMap.keySet()) {
			String delim = "";
			List<String> args = groupBreedMap.get(groupEnum);
			StringBuilder sb = new StringBuilder("");
			String groupName = args.remove(0);
			for (String s : args) {
				sb.append(delim).append("Breeds." + s);
				delim = ",";
			}
			System.out.println(String.format(groupEnumTemplate, groupEnum,
					groupName, sb.toString()));
			// groupBreedMap.get(groupEnum).

		}
		System.out.println("done.");
	}

}
