package dev.tclark.dogshow;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import dev.tclark.dogshow.grammar.dogshowlex;
import dev.tclark.dogshow.grammar.testLexer;
import dev.tclark.dogshow.grammar.testParser;


public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws org.antlr.runtime.RecognitionException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public static void main(String[] args) throws IOException,
			org.antlr.runtime.RecognitionException, IllegalArgumentException,
			IllegalAccessException {
		String file = "C:\\dog-show-workspace\\grammar\\eclipse\\testcase\\testparse";
		CharStream cs = new ANTLRFileStream(file);
		testLexer lexer1 = new testLexer(cs);
		CommonTokenStream tokens2 = new CommonTokenStream(lexer1);
		testParser parser = new testParser( tokens2 );
		String result;
		result = "asd"; 
				JsonObject res = null;
				res = parser.start();
				printTokens(file);
//		parser.start();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
		System.out.println();
		System.out.println("I AM THE RESULT: ");
		System.out.println(res);
		//CommonTree tree = parser.start().getTree();
//		JSONObject json = new JSONObject();
		
//		System.out.println("Done");
//		System.out.println(tree.toStringTree());
	}
	public static void printTokens(String file) throws IOException, IllegalArgumentException, IllegalAccessException
	{
		CharStream cs = new ANTLRFileStream(file);
		dogshowlex lexer = new dogshowlex(cs);
		Class<dogshowlex> testLexClass = dogshowlex.class;
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
//		System.out.println("INTEGERS:");
//
//		for (Field field : ids) {
//			System.out.println(field.getName() + " " + field.getInt(lexer));
//		}

		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("-------------PRINTING TOKENS --------------");
		System.out.println("-------------------------------------------");
		System.out.println();
		while (true) {
			Token token = lexer.nextToken();
			if (token.getType() == dogshowlex.EOF) {
				break;
			} else {
				if (token.getType() != dogshowlex.WS) {
					System.out.println(tokenMap.get(token.getType()) + ": "
							+ token.getText());
				}
			}
		}
		System.out.println("Done with " + file);
	}
}
