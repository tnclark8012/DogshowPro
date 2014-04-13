package dev.tnclark8012.dogshow.grammar;


import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\Scraper\\cleaned\\LEAV1.pdfbox.txt";
		CharStream cs = new ANTLRFileStream(file);
		OnofrioLexer lexer = new OnofrioLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		OnofrioParser parser = new OnofrioParser(tokens);
		ParserRuleContext tree = parser.start(); // parse
		 
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		OnofrioParserListener extractor = new OnofrioParserBaseListener();
		walker.walk(extractor, tree); // initiate walk of tree with listener
	}

}
