package dev.tnclark8012.dogshow;

import java.io.IOException;

import com.google.gson.JsonObject;

import dev.tnclark8012.dogshow.grammar.LexerRunner;
import dev.tnclark8012.dogshow.grammar.ParserRunner;
import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioLexer;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws org.antlr.runtime.RecognitionException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public static void main(String[] args) throws IOException, org.antlr.runtime.RecognitionException, IllegalArgumentException, IllegalAccessException {
		String file = args[0];
		
		LexerRunner lexerRunner = new LexerRunner(new OnofrioLexer(null), file);
		//TokenStream ts = lexerRunner.getTokenStream(file);
		if(args.length > 1) lexerRunner.printTokens();
		ParserRunner parserRunner = new ParserRunner(lexerRunner);
		parserRunner.setRelationalParsing(false);
		
		JsonObject result = parserRunner.parseStart(file);
		System.out.print(result);

	}
}
