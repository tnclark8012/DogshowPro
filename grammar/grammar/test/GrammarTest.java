package dev.tclark.dogshow.grammar.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;

public abstract class GrammarTest {
	public enum GrammarComponent {
		LEXER("lexer"), PARSER("parser");
		private String testFolder;

		GrammarComponent(String testFolder) {
			this.testFolder = testFolder;
		}

		public String getTestFolder() {
			return this.testFolder;
		}
	}

	protected static List<File> testInputs;
	protected static List<File> testOutputs;
	private static GrammarComponent mGrammarComponent;

	protected static final void init(GrammarComponent componentUnderTest) throws Exception
	{
		mGrammarComponent = componentUnderTest;
		setUpBeforeClass();
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testInputs = new ArrayList<File>();
		testOutputs = new ArrayList<File>();
		File lexerInputFolder = new File("testcase/tests/inputs");
		File lexerOutputFolder = new File("testcase/tests/"
				+ mGrammarComponent.getTestFolder() + "/expected-outputs");
		String outFileName = null;
		for (File test : lexerInputFolder.listFiles()) {
			testInputs.add(test);
			outFileName = test.getAbsolutePath().substring(
					test.getAbsolutePath().lastIndexOf(File.separatorChar))
					+ ".output";
			testOutputs.add(new File(lexerOutputFolder, outFileName));
		}
	}
	
	protected static File getTestOutputFile(File inputFile)
	{
		return new File("testcase/tests/" + mGrammarComponent.getTestFolder() +"/test-outputs", inputFile.getName() + "-test-output.txt");
	}
	
	protected static final boolean compareFiles(File f1, File f2) {
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

	protected static final String fileToString(File file) throws IOException {
		String line;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));
		StringBuilder sb = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
		return sb.toString();
	}
}
