package dev.tnclark8012.dogshow.grammar.onofrio;


import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws IOException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		String file = "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\Scraper\\cleaned\\" + "MINN" + "1JP.pdfbox.txt";
		CharStream cs = new ANTLRFileStream(file);
		OnofrioLexer lexer = new OnofrioLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Class<OnofrioLexer> testLexClass = OnofrioLexer.class;
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
			if (token.getType() == lexer.EOF) {
				break;
			} else {
				if (token.getType() != lexer.WS) {
					System.out.println(token.getLine() + " | " + tokenMap.get(token.getType()) + ": "
							+ token.getText());
				}
			}
		}
		//Reset everything after printing tokens
		cs = new ANTLRFileStream(file);
		lexer = new OnofrioLexer(cs);
		tokens = new CommonTokenStream(lexer);
		OnofrioParser parser = new OnofrioParser(tokens);
		ParserRuleContext tree = parser.start(); // parse
		
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		OnofrioParserListener extractor = new OnofrioListener();
		walker.walk(extractor, tree); // initiate walk of tree with listener
	}

}
