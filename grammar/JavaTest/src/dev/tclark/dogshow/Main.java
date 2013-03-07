package dev.tclark.dogshow;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

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
    public static void main(String[] args) throws IOException,
            org.antlr.runtime.RecognitionException, IllegalArgumentException,
            IllegalAccessException {
    	String [] programs = {"testparse", "TRIN1JP.txt", "PLUM1JP.txt", "SACS1JP.txt"};
    	
    	String program = programs[0];
        String file = "testcase/"+program;
        //System.setOut(new PrintStream(new File("testcase/tests/lexer/expected-outputs", program + ".output" )));
        LexerRunner lexerRunner = new LexerRunner();
        //lexerRunner.printTokens(file);
        
        
        ParserRunner parserRunner = new ParserRunner(lexerRunner);
        JsonObject result = parserRunner.parseStart(file);
        System.out.println();
        System.out.println("I AM THE PARSER RESULT: ");
        System.out.println(result);
    }
}
