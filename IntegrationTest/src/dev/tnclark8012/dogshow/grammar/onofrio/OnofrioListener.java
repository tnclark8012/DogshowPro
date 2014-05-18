package dev.tnclark8012.dogshow.grammar.onofrio;

import org.antlr.v4.runtime.Token;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.Big_commentContext;
import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.Breed_nameContext;
import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.CommentContext;
import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.Non_group_ringContext;
import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.Ring_with_breedContext;
import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.Ring_without_breedContext;
import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.StartContext;
import dev.tnclark8012.dogshow.grammar.onofrio.OnofrioParser.Timeblock_commentContext;

public class OnofrioListener extends OnofrioParserBaseListener {
	boolean debug;
	public OnofrioListener(boolean debug)
	{
		super();
	}
	private String breedInComment = null;

	@Override
	public void exitStart(StartContext ctx) {

		JsonObject json = new JsonObject();
		String comments = "";
		JsonArray ringArray = new JsonArray();
		// System.out.println("Done");
		// System.out.println(ctx.json.getAsJsonArray("Rings").size() +
		// " rings");
		System.out.println(ctx.json);
		super.exitStart(ctx);
	}

	int i = 0;

	@Override
	public void exitBreed_name(Breed_nameContext ctx) {
		if (ctx.breedName == null) {
			ctx.json.addProperty("BreedName", breedInComment);
		}
		// System.out.println(ctx.breedName);
		super.exitBreed_name(ctx);
	}

	@Override
	public void exitRing_without_breed(Ring_without_breedContext ctx) {
		maybeAssignLastBreed(ctx.json);
		super.exitRing_without_breed(ctx);
	}

	@Override
	public void exitComment(CommentContext ctx) {
		// TODO Auto-generated method stub
		handleBreedToken(ctx.BREED_NAME);
		super.exitComment(ctx);
	}

	private void handleBreedToken(Token t) {
		if (t != null) {
			breedInComment = t.getText();
			if(debug)System.out.println("Now " + breedInComment);
		}
	}

	private void maybeAssignLastBreed(JsonObject json) {
		if (json.get("RingType").getAsString().equals("Conformation")
				&& json.has("BreedName") && json.get("BreedName").isJsonNull()) {
			if(debug)System.out.println("Assigning: " + breedInComment);
			json.addProperty("BreedName", breedInComment);
		}
	}

	@Override
	public void exitNon_group_ring(Non_group_ringContext ctx) {
		maybeAssignLastBreed(ctx.json);
		super.exitNon_group_ring(ctx);
	}

	@Override
	public void exitRing_with_breed(Ring_with_breedContext ctx) {
		maybeAssignLastBreed(ctx.json);
		super.exitRing_with_breed(ctx);
	}

	@Override
	public void exitBig_comment(Big_commentContext ctx) {
		// TODO Auto-generated method stub
		handleBreedToken(ctx.BREED_NAME);
		super.exitBig_comment(ctx);
	}

	@Override
	public void exitTimeblock_comment(Timeblock_commentContext ctx) {
		handleBreedToken(ctx.BREED_NAME);
		super.exitTimeblock_comment(ctx);
	}
}
