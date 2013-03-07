package dev.tclark.dogshow.grammar;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.junit.Assert;
/**
 * TODO refactor to allow passing PrintStreams for out/err instead of relying on System
 * @author Taylor
 *
 */
public class LexerRunner {
	private PrintStream origSystemErr;
	private PrintStream origSystemOut;
	private testLexer lexer;
	private String initializedFile = null;
	public LexerRunner() {
        lexer = new testLexer();
	}
	
	public LexerRunner(String inputFile) {
        lexer = new testLexer();
        initializedFile = inputFile;
	}
	
	public CommonTokenStream getTokenStream(String inputFile) throws IOException
	{
		
		CharStream cs = new ANTLRFileStream(inputFile);
		lexer.setCharStream(cs);
		return new CommonTokenStream(lexer);
	}
	
	public CommonTokenStream getTokenStream() throws IOException
	{
		Assert.assertNotNull("Must initialize input file!", initializedFile);
		return getTokenStream(initializedFile);
	}
	
	public void printTokens() throws IllegalArgumentException, IOException, IllegalAccessException
	{
		Assert.assertNotNull("Must initialize runner with input file", initializedFile);
		this.printTokens(initializedFile);
	}
	
	public void printTokens(PrintStream outStream) throws IllegalArgumentException, IOException, IllegalAccessException
	{
		Assert.assertNotNull("Must initialize runner with input file", initializedFile);
		setSystemOut(outStream);
		this.printTokens(initializedFile);
	}
	
	public void printTokens(PrintStream outstream, PrintStream errStream) throws IllegalArgumentException, IOException, IllegalAccessException
	{
		setSystemErr(errStream);
		printTokens(outstream);
	}
	public void printTokens(String inputFile, PrintStream outStream)
			throws IOException, IllegalArgumentException,
			IllegalAccessException {
		setSystemOut(outStream);
		printTokens(inputFile);
		resetSystemStreams();

	}

	public void printTokens(String inputFile, PrintStream outStream,
			PrintStream errStream) throws IOException,
			IllegalArgumentException, IllegalAccessException {
			setSystemErr(errStream);
		printTokens(inputFile, outStream);
	}
	private void setSystemOut(PrintStream newStream)
	{
		origSystemOut = System.out;
		System.setOut(newStream);
	}
	private void setSystemErr(PrintStream newStream)
	{
		origSystemErr = System.err;
		System.setErr(newStream);
	}
	private void resetSystemStreams() {
		if (origSystemOut != null) {
			System.setOut(origSystemOut);
			origSystemOut = null;
		}
		if (origSystemErr != null) {
			System.setErr(origSystemErr);
			origSystemErr = null;
		}
	}

	public void printTokens(String inputFile) throws IOException,
			IllegalArgumentException, IllegalAccessException {
		CharStream cs = new ANTLRFileStream(inputFile);
		lexer.setCharStream(cs);
		
		Class<testLexer> testLexClass = testLexer.class;
		Field[] fields = testLexClass.getFields();
		List<Field> ids = new ArrayList<Field>();
		Map<Integer, String> tokenMap = new HashMap<Integer, String>();
		for (Field field : fields) {
			if (field.getType().equals(int.class)) {
				String name = field.getName();
				int constInt = field.getInt(lexer);
				ids.add(field);
				tokenMap.put(constInt, name);

			}
		}
		while (true) {
			Token token = lexer.nextToken();
			if (token.getType() == testLexer.EOF) {
				break;
			} else {
				if (token.getType() != testLexer.WS) {
					System.out.println(tokenMap.get(token.getType()) + ": "
							+ token.getText());
				}
			}
		}
	}
}
