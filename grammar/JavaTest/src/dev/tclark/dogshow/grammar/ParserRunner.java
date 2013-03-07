package dev.tclark.dogshow.grammar;

import java.io.IOException;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.google.gson.JsonObject;
/**
 * TODO refactor to allow passing PrintStreams for out/err instead of relying on System
 * @author Taylor
 *
 */
public class ParserRunner {
	private LexerRunner lexer;

	public ParserRunner(LexerRunner lexer){
        this.lexer = lexer;
	}
	
	public JsonObject parseStart(String inputFile) throws IOException, RecognitionException{
		
		CommonTokenStream tokens = lexer.getTokenStream(inputFile);
        testParser parser = new testParser( tokens );
        return parser.start();
	}
	
	public void printStartResult(String inputFile) throws IOException, RecognitionException
	{
		JsonObject json = parseStart(inputFile);
		System.out.println(json);
	}
}
