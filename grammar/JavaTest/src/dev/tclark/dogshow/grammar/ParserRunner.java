package dev.tclark.dogshow.grammar;

import java.io.IOException;
import java.io.PrintStream;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.google.gson.JsonObject;
/**
 * TODO refactor to allow passing PrintStreams for out/err instead of relying on System
 * @author Taylor
 *
 */
public class ParserRunner extends GrammarRunner{
	private LexerRunner lexer;
	private boolean mRelationalParse = true;
	public ParserRunner(LexerRunner lexer){
        this.lexer = lexer;
	}
	
	public JsonObject parseStart(String inputFile) throws IOException, RecognitionException{
		
		CommonTokenStream tokens = lexer.getTokenStream(inputFile);
        testParser parser = new testParser( tokens );
        parser.setRelationalParse(mRelationalParse);
        return parser.start();
	}
	
	public void printStartResult(String inputFile) throws IOException, RecognitionException
	{
		JsonObject json = parseStart(inputFile);
		System.out.println(json);
	}

	public JsonObject parseStart(String inputFile, PrintStream outputStream) throws IOException, RecognitionException {
		setOutputStream(outputStream);
		JsonObject result = parseStart(inputFile);
		resetStreams();
		return result;
	}
	
	public JsonObject parseStart(String inputFile, PrintStream outputStream, PrintStream errStream) throws IOException, RecognitionException
	{
		setErrStream(errStream);
		return parseStart(inputFile, outputStream);
	}

	public void setRelationalParsing(boolean value) {
		mRelationalParse = value;
	}
	
	
}
