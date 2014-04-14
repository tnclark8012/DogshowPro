// Generated from C:\Users\Taylor\Desktop\antlrworks2\onofrio.g4 by ANTLR 4.1

//TODO Puppy groups
package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.regex.Pattern;          
import java.util.regex.Matcher;

import com.google.gson.JsonElement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;
import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link onofrioParser}.
 */
public interface onofrioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link onofrioParser#junior_ring}.
	 * @param ctx the parse tree
	 */
	void enterJunior_ring(@NotNull onofrioParser.Junior_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#junior_ring}.
	 * @param ctx the parse tree
	 */
	void exitJunior_ring(@NotNull onofrioParser.Junior_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(@NotNull onofrioParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(@NotNull onofrioParser.TestContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#big_comment}.
	 * @param ctx the parse tree
	 */
	void enterBig_comment(@NotNull onofrioParser.Big_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#big_comment}.
	 * @param ctx the parse tree
	 */
	void exitBig_comment(@NotNull onofrioParser.Big_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#group_block}.
	 * @param ctx the parse tree
	 */
	void enterGroup_block(@NotNull onofrioParser.Group_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#group_block}.
	 * @param ctx the parse tree
	 */
	void exitGroup_block(@NotNull onofrioParser.Group_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#rally_entry_line}.
	 * @param ctx the parse tree
	 */
	void enterRally_entry_line(@NotNull onofrioParser.Rally_entry_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#rally_entry_line}.
	 * @param ctx the parse tree
	 */
	void exitRally_entry_line(@NotNull onofrioParser.Rally_entry_lineContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#timeblock_comment}.
	 * @param ctx the parse tree
	 */
	void enterTimeblock_comment(@NotNull onofrioParser.Timeblock_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#timeblock_comment}.
	 * @param ctx the parse tree
	 */
	void exitTimeblock_comment(@NotNull onofrioParser.Timeblock_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#non_group_ring}.
	 * @param ctx the parse tree
	 */
	void enterNon_group_ring(@NotNull onofrioParser.Non_group_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#non_group_ring}.
	 * @param ctx the parse tree
	 */
	void exitNon_group_ring(@NotNull onofrioParser.Non_group_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#non_ring_title_comment}.
	 * @param ctx the parse tree
	 */
	void enterNon_ring_title_comment(@NotNull onofrioParser.Non_ring_title_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#non_ring_title_comment}.
	 * @param ctx the parse tree
	 */
	void exitNon_ring_title_comment(@NotNull onofrioParser.Non_ring_title_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#non_conformation_ring}.
	 * @param ctx the parse tree
	 */
	void enterNon_conformation_ring(@NotNull onofrioParser.Non_conformation_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#non_conformation_ring}.
	 * @param ctx the parse tree
	 */
	void exitNon_conformation_ring(@NotNull onofrioParser.Non_conformation_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#breed_ring}.
	 * @param ctx the parse tree
	 */
	void enterBreed_ring(@NotNull onofrioParser.Breed_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#breed_ring}.
	 * @param ctx the parse tree
	 */
	void exitBreed_ring(@NotNull onofrioParser.Breed_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#ring_title}.
	 * @param ctx the parse tree
	 */
	void enterRing_title(@NotNull onofrioParser.Ring_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#ring_title}.
	 * @param ctx the parse tree
	 */
	void exitRing_title(@NotNull onofrioParser.Ring_titleContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#non_header_comment}.
	 * @param ctx the parse tree
	 */
	void enterNon_header_comment(@NotNull onofrioParser.Non_header_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#non_header_comment}.
	 * @param ctx the parse tree
	 */
	void exitNon_header_comment(@NotNull onofrioParser.Non_header_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#inner_ring}.
	 * @param ctx the parse tree
	 */
	void enterInner_ring(@NotNull onofrioParser.Inner_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#inner_ring}.
	 * @param ctx the parse tree
	 */
	void exitInner_ring(@NotNull onofrioParser.Inner_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#rally_ring}.
	 * @param ctx the parse tree
	 */
	void enterRally_ring(@NotNull onofrioParser.Rally_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#rally_ring}.
	 * @param ctx the parse tree
	 */
	void exitRally_ring(@NotNull onofrioParser.Rally_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#ring}.
	 * @param ctx the parse tree
	 */
	void enterRing(@NotNull onofrioParser.RingContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#ring}.
	 * @param ctx the parse tree
	 */
	void exitRing(@NotNull onofrioParser.RingContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#ring_with_breed}.
	 * @param ctx the parse tree
	 */
	void enterRing_with_breed(@NotNull onofrioParser.Ring_with_breedContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#ring_with_breed}.
	 * @param ctx the parse tree
	 */
	void exitRing_with_breed(@NotNull onofrioParser.Ring_with_breedContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#special_ring}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_ring(@NotNull onofrioParser.Special_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#special_ring}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_ring(@NotNull onofrioParser.Special_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#special_suffix}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_suffix(@NotNull onofrioParser.Special_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#special_suffix}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_suffix(@NotNull onofrioParser.Special_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#non_conformation_breed_ring}.
	 * @param ctx the parse tree
	 */
	void enterNon_conformation_breed_ring(@NotNull onofrioParser.Non_conformation_breed_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#non_conformation_breed_ring}.
	 * @param ctx the parse tree
	 */
	void exitNon_conformation_breed_ring(@NotNull onofrioParser.Non_conformation_breed_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#judge_block}.
	 * @param ctx the parse tree
	 */
	void enterJudge_block(@NotNull onofrioParser.Judge_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#judge_block}.
	 * @param ctx the parse tree
	 */
	void exitJudge_block(@NotNull onofrioParser.Judge_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#rally_walkthrough}.
	 * @param ctx the parse tree
	 */
	void enterRally_walkthrough(@NotNull onofrioParser.Rally_walkthroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#rally_walkthrough}.
	 * @param ctx the parse tree
	 */
	void exitRally_walkthrough(@NotNull onofrioParser.Rally_walkthroughContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#special_ring_header}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_ring_header(@NotNull onofrioParser.Special_ring_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#special_ring_header}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_ring_header(@NotNull onofrioParser.Special_ring_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#rally_ring_block}.
	 * @param ctx the parse tree
	 */
	void enterRally_ring_block(@NotNull onofrioParser.Rally_ring_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#rally_ring_block}.
	 * @param ctx the parse tree
	 */
	void exitRally_ring_block(@NotNull onofrioParser.Rally_ring_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#empty_breed_ring}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_breed_ring(@NotNull onofrioParser.Empty_breed_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#empty_breed_ring}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_breed_ring(@NotNull onofrioParser.Empty_breed_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#rally_comment}.
	 * @param ctx the parse tree
	 */
	void enterRally_comment(@NotNull onofrioParser.Rally_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#rally_comment}.
	 * @param ctx the parse tree
	 */
	void exitRally_comment(@NotNull onofrioParser.Rally_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#group_ring}.
	 * @param ctx the parse tree
	 */
	void enterGroup_ring(@NotNull onofrioParser.Group_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#group_ring}.
	 * @param ctx the parse tree
	 */
	void exitGroup_ring(@NotNull onofrioParser.Group_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#inner_timeblock}.
	 * @param ctx the parse tree
	 */
	void enterInner_timeblock(@NotNull onofrioParser.Inner_timeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#inner_timeblock}.
	 * @param ctx the parse tree
	 */
	void exitInner_timeblock(@NotNull onofrioParser.Inner_timeblockContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#breed_name}.
	 * @param ctx the parse tree
	 */
	void enterBreed_name(@NotNull onofrioParser.Breed_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#breed_name}.
	 * @param ctx the parse tree
	 */
	void exitBreed_name(@NotNull onofrioParser.Breed_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#timeblock}.
	 * @param ctx the parse tree
	 */
	void enterTimeblock(@NotNull onofrioParser.TimeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#timeblock}.
	 * @param ctx the parse tree
	 */
	void exitTimeblock(@NotNull onofrioParser.TimeblockContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull onofrioParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull onofrioParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#obedience_with_breed}.
	 * @param ctx the parse tree
	 */
	void enterObedience_with_breed(@NotNull onofrioParser.Obedience_with_breedContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#obedience_with_breed}.
	 * @param ctx the parse tree
	 */
	void exitObedience_with_breed(@NotNull onofrioParser.Obedience_with_breedContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#ring_comment}.
	 * @param ctx the parse tree
	 */
	void enterRing_comment(@NotNull onofrioParser.Ring_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#ring_comment}.
	 * @param ctx the parse tree
	 */
	void exitRing_comment(@NotNull onofrioParser.Ring_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull onofrioParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull onofrioParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#judge_name}.
	 * @param ctx the parse tree
	 */
	void enterJudge_name(@NotNull onofrioParser.Judge_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#judge_name}.
	 * @param ctx the parse tree
	 */
	void exitJudge_name(@NotNull onofrioParser.Judge_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#rally_ring_name}.
	 * @param ctx the parse tree
	 */
	void enterRally_ring_name(@NotNull onofrioParser.Rally_ring_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#rally_ring_name}.
	 * @param ctx the parse tree
	 */
	void exitRally_ring_name(@NotNull onofrioParser.Rally_ring_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link onofrioParser#ring_without_breed}.
	 * @param ctx the parse tree
	 */
	void enterRing_without_breed(@NotNull onofrioParser.Ring_without_breedContext ctx);
	/**
	 * Exit a parse tree produced by {@link onofrioParser#ring_without_breed}.
	 * @param ctx the parse tree
	 */
	void exitRing_without_breed(@NotNull onofrioParser.Ring_without_breedContext ctx);
}