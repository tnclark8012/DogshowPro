package dev.tnclark8012.dogshow.grammar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.misc.NotNull;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import dev.tnclark8012.dogshow.grammar.OnofrioParser.StartContext;

public class OnofrioListener extends OnofrioParserBaseListener{
	
		@Override
		public void exitStart(StartContext ctx) {
			
			JsonObject json = new JsonObject(); 
			String comments = ""; 
			JsonArray ringArray = new JsonArray();
			System.out.println("Done");
			System.out.println(ctx.json);
			super.exitStart(ctx);
		}
}
