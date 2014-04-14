package dev.tnclark8012.dogshow.grammar.onofrio;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.StartContext;

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
