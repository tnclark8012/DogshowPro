package dev.tclark.dogshow.grammar.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.junit.BeforeClass;
import org.junit.Test;

import dev.tclark.dogshow.grammar.LexerRunner;
import dev.tclark.dogshow.grammar.testLexer;

public class LexerTest extends GrammarTest {
	static LexerRunner lexer;
	static List<File> testInputs;
	static List<File> testOutputs;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		GrammarTest.init(GrammarComponent.LEXER);

		testInputs = new ArrayList<File>();
		testOutputs = new ArrayList<File>();
		File lexerInputFolder = new File("testcase/tests/lexer/inputs");
		File lexerOutputFolder = new File(
				"testcase/tests/lexer/expected-outputs");
		String outFileName = null;
		for (File test : lexerInputFolder.listFiles()) {
			testInputs.add(test);
			System.out.println(test.getAbsolutePath() + "     "
					+ File.separatorChar);
			outFileName = test.getAbsolutePath().substring(
					test.getAbsolutePath().lastIndexOf(File.separatorChar))
					+ ".output";
			System.out.println("Expected output file name: " + outFileName);
			testOutputs.add(new File(lexerOutputFolder, outFileName));
		}
	}

	@Test
	public void test() throws IOException, IllegalArgumentException,
			IllegalAccessException {

		for (int i = 0; i < testInputs.size(); i++) {
			File file = testInputs.get(i);
			lexer = new LexerRunner();
			File outFile = new File("testcase/tests/lexer/test-outputs",
					file.getName() + "-test-output.txt");
			lexer.printTokens(file.getAbsolutePath(), new PrintStream(outFile));
			boolean areSame = compareFiles(outFile, testOutputs.get(i));
			if (!areSame)
				System.err.println(outFile.getAbsolutePath());
			Assert.assertEquals(true, areSame);
		}
	}

	public File writeLexerOutput(File file) throws IOException {
		File outFile = new File("testcase/tests/lexer/test-outputs",
				file.getName() + "-test-output.txt");
		PrintWriter writer = new PrintWriter(outFile);
		for (Token t : getTokens(file.getAbsolutePath())) {
			System.out.println(t.getType() + ": " + t.getText() + "\n");
		}
		writer.close();
		return outFile;
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