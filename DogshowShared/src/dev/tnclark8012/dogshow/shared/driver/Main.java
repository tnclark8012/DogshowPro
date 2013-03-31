package dev.tnclark8012.dogshow.shared.driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dev.tnclark8012.dogshow.shared.BreedGroup;
import dev.tnclark8012.dogshow.shared.Breeds;

public class Main {

	public static void main(String[] argz) throws IOException {
		File breedsDir = new File("breedlist");
		BufferedReader reader;
		Map<String, List<String>> groupBreedMap = new HashMap<String, List<String>>();
		for (File f : breedsDir.listFiles()) {
			reader = new BufferedReader(new FileReader(f));
			String groupName = reader.readLine();
			String groupNameEnum = groupName.toUpperCase().replace("[ \\-]+",
					"_");
			String line = null;
			String breedEnumFormat = "%s(BreedGroup.%s, \"%s\"),";
			List<String> breedNameEnums = new LinkedList<String>();
			breedNameEnums.add(groupName);
			System.out.println("//****BEGIN " + groupName + "****");
			while ((line = reader.readLine()) != null) {
				String name = line;
				String enumName = line.toUpperCase()
						.replaceAll("[�' \"\\-\\(]+", "_")
						.replaceAll("[\\)�]", "").replaceAll("&", "AND");
				breedNameEnums.add(enumName);
				System.out.println(String.format(breedEnumFormat, enumName,
						groupNameEnum, name));
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
		System.out.println(BreedGroup.TOY.getBreedNames());
	}

}