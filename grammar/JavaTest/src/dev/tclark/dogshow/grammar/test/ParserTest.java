package dev.tclark.dogshow.grammar.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import junit.framework.Assert;

import org.antlr.runtime.RecognitionException;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.JsonObject;

import dev.tclark.dogshow.grammar.LexerRunner;
import dev.tclark.dogshow.grammar.ParserRunner;

public class ParserTest extends GrammarTest {
	static ParserRunner parser;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		GrammarTest.init(GrammarComponent.PARSER);
	}

	@Test
	public void test() throws IOException, IllegalArgumentException,
			IllegalAccessException, RecognitionException {
		int numFails = 0;
		for (int i = 0; i < testInputs.size(); i++) {
			File file = testInputs.get(i);
			parser = new ParserRunner(new LexerRunner());
			File outFile = getTestOutputFile(file);
			JsonObject output = parser.parseStart(file.getAbsolutePath());
			PrintWriter outStream = new PrintWriter(outFile);
			outStream.println(output);
			outStream.close();
			boolean areSame = TestUtils.compareFiles(outFile, testOutputs.get(i));
			if (!areSame)
				System.err.println(outFile.getAbsolutePath());
				System.err.println("VS. " + testOutputs.get(i).getAbsolutePath());
				numFails++;
//			Assert.assertEquals(true, areSame);
		}
		Assert.assertEquals(numFails, 0);
	}

}