package dev.tclark.dogshow.grammar.test;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.junit.BeforeClass;
import org.junit.Test;

import dev.tclark.dogshow.grammar.testLexer;

public class LexerTest {
	static Map<Integer, String> tokenMap;
	static List<File> testInputs;
	static List<File> testOutputs;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testInputs = new ArrayList<File>();
		testOutputs = new ArrayList<File>();
		CharStream cs = new ANTLRFileStream("testcase/testparse");
		testLexer lexer = new testLexer(cs);
		Class<testLexer> testLexClass = testLexer.class;
		Field[] fields = testLexClass.getFields();
		List<Field> ids = new ArrayList<Field>();
		tokenMap = new HashMap<Integer, String>();
		for (Field field : fields) {
			if (field.getType().equals(int.class)) {
				String name = field.getName();
				int constInt = field.getInt(lexer);
				ids.add(field);
				tokenMap.put(constInt, name);
			}
		}
		File lexerInputFolder = new File("testcase/tests/lexer/inputs");
		File lexerOutputFolder = new File(
				"testcase/tests/lexer/expected-outputs");
		for (File test : lexerInputFolder.listFiles()) {
			testInputs.add(test);
			testOutputs.add(new File(lexerOutputFolder, test.getName()
					+ "-output.txt"));
		}
	}

	@Test
	public void test() throws IOException {

		for (int i = 0; i < testInputs.size(); i++) {
			File file = testInputs.get(i);
			File testOutput = writeLexerOutput(file);
			boolean areSame = compareFiles(testOutput, testOutputs.get(i));
			if(!areSame)System.err.println(file.getAbsolutePath());
			Assert.assertEquals(true, areSame);
		}
	}
	public File writeLexerOutput(File file) throws IOException
	{
		File outFile = new File("testcase/tests/lexer/test-outputs", file.getName() + "-test-output.txt");
		PrintWriter writer = new PrintWriter(outFile);
		for( Token t: getTokens(file.getAbsolutePath())){
			writer.append(t.getType() + ": " + t.getText() + "\n");
		}
		writer.close();
		return outFile;
	}
	private boolean compareFiles(File f1, File f2) {
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

	private String fileToString(File file) throws IOException {
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

	private ArrayList<Token> getTokens(String fileName) throws IOException {
		ArrayList<Token> tokens = new ArrayList<Token>();
		CharStream cs = new ANTLRFileStream(fileName);
		testLexer lexer = new testLexer(cs);
		Token token;
		while (true) {
			token = lexer.nextToken();
			tokens.add(token);
			if (token.getType() == testLexer.EOF) {
				return tokens;
			}
		}
	}

}
