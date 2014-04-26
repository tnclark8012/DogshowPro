package dev.tnclark8012.dogshow.grammar;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Lexer;
import org.junit.Assert;

/**
 * TODO refactor to allow passing PrintStreams for out/err instead of relying on System
 * 
 * @author Taylor
 * 
 */
public class LexerRunner extends GrammarRunner {

	private Lexer mLexer;
	private String initializedFile = null;

	public LexerRunner(Lexer lexer) {
		this.mLexer = lexer;
	}

	public LexerRunner(Lexer lexer, String inputFile) {
		this.mLexer = lexer;
		initializedFile = inputFile;
	}

	public CommonTokenStream getTokenStream(String inputFile) throws IOException {

		CharStream cs = new ANTLRFileStream(inputFile);
		mLexer.setInputStream(cs);
		return new CommonTokenStream(mLexer);
	}

	public CommonTokenStream getTokenStream() throws IOException {
		Assert.assertNotNull("Must initialize input file!", initializedFile);
		return getTokenStream(initializedFile);
	}

	public void printTokens() throws IllegalArgumentException, IOException, IllegalAccessException {
		Assert.assertNotNull("Must initialize runner with input file", initializedFile);
		this.printTokens(initializedFile);
	}

	public void printTokens(PrintStream outStream) throws IllegalArgumentException, IOException, IllegalAccessException {
		Assert.assertNotNull("Must initialize runner with input file", initializedFile);
		setOutputStream(outStream);
		this.printTokens(initializedFile);
	}

	public void printTokens(PrintStream outstream, PrintStream errStream) throws IllegalArgumentException, IOException, IllegalAccessException {
		setErrStream(errStream);
		printTokens(outstream);
	}

	public void printTokens(String inputFile, PrintStream outStream) throws IOException, IllegalArgumentException, IllegalAccessException {
		setOutputStream(outStream);
		printTokens(inputFile);
		resetStreams();

	}

	public void printTokens(String inputFile, PrintStream outStream, PrintStream errStream) throws IOException, IllegalArgumentException, IllegalAccessException {
		setErrStream(errStream);
		printTokens(inputFile, outStream);
	}

	public void printTokens(String inputFile) throws IOException, IllegalArgumentException, IllegalAccessException {
		CharStream cs = new ANTLRFileStream(inputFile);
		mLexer.setInputStream(cs);

		Class<?> lexerClass = mLexer.getClass();
		Field[] fields = lexerClass.getFields();
		List<Field> ids = new ArrayList<Field>();
		Map<Integer, String> tokenMap = new HashMap<Integer, String>();
		for (Field field : fields) {
			if (field.getType().equals(int.class)) {
				String name = field.getName();
				int constInt = field.getInt(mLexer);
				ids.add(field);
				tokenMap.put(constInt, name);

			}
		}
		Token token;
		while ((token = mLexer.nextToken()).getType() != Recognizer.EOF) {
			if (token.getChannel() != Token.HIDDEN_CHANNEL) {
				System.out.println(tokenMap.get(token.getType()) + ": " + token.getText());
			}
		}
	}
}
