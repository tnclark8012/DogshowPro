package dev.tclark.dogshow.grammar.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestUtils {
	public static final boolean compareFiles(File f1, File f2) {
		String str1;
		String str2;
		try {
			str1 = fileToString(f1);
			str2 = fileToString(f2);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return str1.equals(str2);
	}

	public static final void cleanDirectory(File directory)
	{
		for(File f : directory.listFiles())
		{
			f.delete();
		}
	}
	public static final String fileToString(File file) throws IOException {
		String line;
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		StringBuilder sb = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
		return sb.toString();
	}
}
