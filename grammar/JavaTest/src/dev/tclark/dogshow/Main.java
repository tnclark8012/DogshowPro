package dev.tclark.dogshow;

import java.io.IOException;

import org.antlr.runtime.TokenStream;

import com.google.gson.JsonObject;

import dev.tclark.dogshow.grammar.LexerRunner;
import dev.tclark.dogshow.grammar.ParserRunner;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws org.antlr.runtime.RecognitionException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public static void main(String[] args) throws IOException, org.antlr.runtime.RecognitionException, IllegalArgumentException, IllegalAccessException {
		// System.out.println("running");
		String[] programs = { "testparse", "TRIN1JP.txt", "PLUM1JP.txt", "SACS1JP.txt", "LEAV1JP.txt", "KTDC1JP.txt" };
		String file = args[0];
		LexerRunner lexerRunner = new LexerRunner(file);
		//TokenStream ts = lexerRunner.getTokenStream(file);
		lexerRunner.printTokens();
////
		ParserRunner parserRunner = new ParserRunner(lexerRunner);
		parserRunner.setRelationalParsing(false);
//		JsonObject result = parserRunner.parseStart(file);
//
//		System.out.print(result);

	}
}
