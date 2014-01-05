package dev.tclark.dogshow.grammar.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonTest {
	@Test
	public void jsonTest() throws IOException, InterruptedException, JSONException {
		File programsFolder = new File("testcase/tests/programs");
		File outputFolder = new File("testcase/tests/program-json");
		TestUtils.cleanDirectory(outputFolder);
		File expectedOutputFolder = new File("testcase/tests/program-json-expected");
		for (File test : programsFolder.listFiles()) {
			System.out.println("******************************");
			System.out.println("testing: " + test.getName());
			System.out.println("******************************");
			File testOutputFile = new File(outputFolder, test.getName() + ".test.json");
			
			File expectedOutputFile = new File(expectedOutputFolder, test.getName() + ".json");

			ProcessBuilder pb = new ProcessBuilder("python", "driver.py", "", "-t", test.getAbsolutePath(), "--output=" + testOutputFile.getAbsolutePath());
			pb.directory(new File("../../Scraper"));
			pb.redirectErrorStream(true);
			Process p = pb.start();
			InputStreamReader isr = new InputStreamReader(p.getInputStream());
			BufferedReader br = new BufferedReader(isr);

			String lineRead;
			while ((lineRead = br.readLine()) != null) {
				System.out.println(lineRead);// swallow the line, or print it out - System.out.println(lineRead);
			}
			p.waitFor();
			
			String expected = TestUtils.fileToString(expectedOutputFile);
			String actual = TestUtils.fileToString(testOutputFile);
			System.out.println("Assert: " + test.getName());
			JSONAssert.assertEquals(expected, actual, false);
			System.out.println("Passed");
		}
	}
}
