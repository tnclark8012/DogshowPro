package dev.tclark.dogshow.grammar.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonTest {
	private static final File programsFolder = new File("testcase/tests/programs");
	private static final File outputFolder = new File("testcase/tests/program-json");
	private static final File expectedOutputFolder = new File("testcase/tests/program-json-expected");
	@BeforeClass
	public static void before()
	{
		TestUtils.cleanDirectory(outputFolder);
	}
	
	@Test
	public void ANOK1JP(){
		runTestOnProgram("ANOK1JP.pdf");
	}
	
	@Test
	public void BRAZ1JP(){
		runTestOnProgram("BRAZ1JP.pdf");
	}
	
	@Test
	public void COUL1JP(){
		runTestOnProgram("COUL1JP.pdf");
	}

	@Test
	public void COUN1JP(){
		runTestOnProgram("COUN1JP.pdf");
	}

	@Test
	public void MINN1JP(){
		runTestOnProgram("MINN1JP.pdf");
	}

	@Test
	public void MNJS1JP(){
		runTestOnProgram("MNJS1JP.pdf");
	}
	
	
	private void runTestOnProgram(String programName) 
	{
		File test = new File(programsFolder, programName);
		System.out.println("******************************");
		System.out.println("testing: " + test.getName());
		System.out.println("******************************");
		File testOutputFile = new File(outputFolder, test.getName() + ".test.json");
		
		File expectedOutputFile = new File(expectedOutputFolder, test.getName() + ".json");

		ProcessBuilder pb = new ProcessBuilder("python", "driver.py", "--forceall=true", "-t", test.getAbsolutePath(), "--output=" + testOutputFile.getAbsolutePath());
		pb.directory(new File("../../Scraper"));
		pb.redirectErrorStream(true);
		System.out.println(pb.command().toString().replace(',',' '));
		Process p = null;
		try {
			p = pb.start();
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Couldn't start process for " + programName);
		}
		InputStreamReader isr = new InputStreamReader(p.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		String lineRead;
		try {
			while ((lineRead = br.readLine()) != null) {
				System.out.println(lineRead);// swallow the line, or print it out - System.out.println(lineRead);
			}
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Couldn't read line from process for " + programName);
		}
		try {
			p.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			Assert.fail("Interrupted while waiting on process for " + programName);
		}
		
		String expected = null;
		try {
			expected = TestUtils.fileToString(expectedOutputFile);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Couldn't open expected output for " + programName);
		}
		String actual = null;
		try {
			actual = TestUtils.fileToString(testOutputFile);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Couldn't open test output for" + programName);
		}
		try {
			Assert.assertNotNull(expected, "Expected JSON was null!");
			Assert.assertNotNull(actual, "Parsed JSON was null!");
			
			JSONAssert.assertEquals(expected, actual, false);
		} catch (JSONException e) {
			e.printStackTrace();
			Assert.fail("Couldn't valideate JSON while asserting successful test for " + programName);
		}
	}
	
}
