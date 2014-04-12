// Generated from C:\Users\Taylor\Desktop\antlrworks2\rewrite\OnofrioParser.g4 by ANTLR 4.1

//TODO Puppy groups
package dev.tnclark8012.dogshow.grammar;
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
 * {@link OnofrioParser}.
 */
public interface OnofrioParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OnofrioParser#junior_ring}.
	 * @param ctx the parse tree
	 */
	void enterJunior_ring(@NotNull OnofrioParser.Junior_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#junior_ring}.
	 * @param ctx the parse tree
	 */
	void exitJunior_ring(@NotNull OnofrioParser.Junior_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#big_comment}.
	 * @param ctx the parse tree
	 */
	void enterBig_comment(@NotNull OnofrioParser.Big_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#big_comment}.
	 * @param ctx the parse tree
	 */
	void exitBig_comment(@NotNull OnofrioParser.Big_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#group_block}.
	 * @param ctx the parse tree
	 */
	void enterGroup_block(@NotNull OnofrioParser.Group_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#group_block}.
	 * @param ctx the parse tree
	 */
	void exitGroup_block(@NotNull OnofrioParser.Group_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#rally_entry_line}.
	 * @param ctx the parse tree
	 */
	void enterRally_entry_line(@NotNull OnofrioParser.Rally_entry_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#rally_entry_line}.
	 * @param ctx the parse tree
	 */
	void exitRally_entry_line(@NotNull OnofrioParser.Rally_entry_lineContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#timeblock_comment}.
	 * @param ctx the parse tree
	 */
	void enterTimeblock_comment(@NotNull OnofrioParser.Timeblock_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#timeblock_comment}.
	 * @param ctx the parse tree
	 */
	void exitTimeblock_comment(@NotNull OnofrioParser.Timeblock_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#non_group_ring}.
	 * @param ctx the parse tree
	 */
	void enterNon_group_ring(@NotNull OnofrioParser.Non_group_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#non_group_ring}.
	 * @param ctx the parse tree
	 */
	void exitNon_group_ring(@NotNull OnofrioParser.Non_group_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#non_ring_title_comment}.
	 * @param ctx the parse tree
	 */
	void enterNon_ring_title_comment(@NotNull OnofrioParser.Non_ring_title_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#non_ring_title_comment}.
	 * @param ctx the parse tree
	 */
	void exitNon_ring_title_comment(@NotNull OnofrioParser.Non_ring_title_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#non_conformation_ring}.
	 * @param ctx the parse tree
	 */
	void enterNon_conformation_ring(@NotNull OnofrioParser.Non_conformation_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#non_conformation_ring}.
	 * @param ctx the parse tree
	 */
	void exitNon_conformation_ring(@NotNull OnofrioParser.Non_conformation_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#breed_ring}.
	 * @param ctx the parse tree
	 */
	void enterBreed_ring(@NotNull OnofrioParser.Breed_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#breed_ring}.
	 * @param ctx the parse tree
	 */
	void exitBreed_ring(@NotNull OnofrioParser.Breed_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#ring_title}.
	 * @param ctx the parse tree
	 */
	void enterRing_title(@NotNull OnofrioParser.Ring_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#ring_title}.
	 * @param ctx the parse tree
	 */
	void exitRing_title(@NotNull OnofrioParser.Ring_titleContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#non_header_comment}.
	 * @param ctx the parse tree
	 */
	void enterNon_header_comment(@NotNull OnofrioParser.Non_header_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#non_header_comment}.
	 * @param ctx the parse tree
	 */
	void exitNon_header_comment(@NotNull OnofrioParser.Non_header_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#inner_ring}.
	 * @param ctx the parse tree
	 */
	void enterInner_ring(@NotNull OnofrioParser.Inner_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#inner_ring}.
	 * @param ctx the parse tree
	 */
	void exitInner_ring(@NotNull OnofrioParser.Inner_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#rally_ring}.
	 * @param ctx the parse tree
	 */
	void enterRally_ring(@NotNull OnofrioParser.Rally_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#rally_ring}.
	 * @param ctx the parse tree
	 */
	void exitRally_ring(@NotNull OnofrioParser.Rally_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#ring}.
	 * @param ctx the parse tree
	 */
	void enterRing(@NotNull OnofrioParser.RingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#ring}.
	 * @param ctx the parse tree
	 */
	void exitRing(@NotNull OnofrioParser.RingContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#ring_with_breed}.
	 * @param ctx the parse tree
	 */
	void enterRing_with_breed(@NotNull OnofrioParser.Ring_with_breedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#ring_with_breed}.
	 * @param ctx the parse tree
	 */
	void exitRing_with_breed(@NotNull OnofrioParser.Ring_with_breedContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#special_ring}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_ring(@NotNull OnofrioParser.Special_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#special_ring}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_ring(@NotNull OnofrioParser.Special_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#special_suffix}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_suffix(@NotNull OnofrioParser.Special_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#special_suffix}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_suffix(@NotNull OnofrioParser.Special_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#non_conformation_breed_ring}.
	 * @param ctx the parse tree
	 */
	void enterNon_conformation_breed_ring(@NotNull OnofrioParser.Non_conformation_breed_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#non_conformation_breed_ring}.
	 * @param ctx the parse tree
	 */
	void exitNon_conformation_breed_ring(@NotNull OnofrioParser.Non_conformation_breed_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#judge_block}.
	 * @param ctx the parse tree
	 */
	void enterJudge_block(@NotNull OnofrioParser.Judge_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#judge_block}.
	 * @param ctx the parse tree
	 */
	void exitJudge_block(@NotNull OnofrioParser.Judge_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#rally_walkthrough}.
	 * @param ctx the parse tree
	 */
	void enterRally_walkthrough(@NotNull OnofrioParser.Rally_walkthroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#rally_walkthrough}.
	 * @param ctx the parse tree
	 */
	void exitRally_walkthrough(@NotNull OnofrioParser.Rally_walkthroughContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#special_ring_header}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_ring_header(@NotNull OnofrioParser.Special_ring_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#special_ring_header}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_ring_header(@NotNull OnofrioParser.Special_ring_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#rally_ring_block}.
	 * @param ctx the parse tree
	 */
	void enterRally_ring_block(@NotNull OnofrioParser.Rally_ring_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#rally_ring_block}.
	 * @param ctx the parse tree
	 */
	void exitRally_ring_block(@NotNull OnofrioParser.Rally_ring_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#empty_breed_ring}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_breed_ring(@NotNull OnofrioParser.Empty_breed_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#empty_breed_ring}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_breed_ring(@NotNull OnofrioParser.Empty_breed_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#rally_comment}.
	 * @param ctx the parse tree
	 */
	void enterRally_comment(@NotNull OnofrioParser.Rally_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#rally_comment}.
	 * @param ctx the parse tree
	 */
	void exitRally_comment(@NotNull OnofrioParser.Rally_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#group_ring}.
	 * @param ctx the parse tree
	 */
	void enterGroup_ring(@NotNull OnofrioParser.Group_ringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#group_ring}.
	 * @param ctx the parse tree
	 */
	void exitGroup_ring(@NotNull OnofrioParser.Group_ringContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#inner_timeblock}.
	 * @param ctx the parse tree
	 */
	void enterInner_timeblock(@NotNull OnofrioParser.Inner_timeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#inner_timeblock}.
	 * @param ctx the parse tree
	 */
	void exitInner_timeblock(@NotNull OnofrioParser.Inner_timeblockContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#breed_name}.
	 * @param ctx the parse tree
	 */
	void enterBreed_name(@NotNull OnofrioParser.Breed_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#breed_name}.
	 * @param ctx the parse tree
	 */
	void exitBreed_name(@NotNull OnofrioParser.Breed_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#timeblock}.
	 * @param ctx the parse tree
	 */
	void enterTimeblock(@NotNull OnofrioParser.TimeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#timeblock}.
	 * @param ctx the parse tree
	 */
	void exitTimeblock(@NotNull OnofrioParser.TimeblockContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull OnofrioParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull OnofrioParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#obedience_with_breed}.
	 * @param ctx the parse tree
	 */
	void enterObedience_with_breed(@NotNull OnofrioParser.Obedience_with_breedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#obedience_with_breed}.
	 * @param ctx the parse tree
	 */
	void exitObedience_with_breed(@NotNull OnofrioParser.Obedience_with_breedContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#ring_comment}.
	 * @param ctx the parse tree
	 */
	void enterRing_comment(@NotNull OnofrioParser.Ring_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#ring_comment}.
	 * @param ctx the parse tree
	 */
	void exitRing_comment(@NotNull OnofrioParser.Ring_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull OnofrioParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull OnofrioParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#judge_name}.
	 * @param ctx the parse tree
	 */
	void enterJudge_name(@NotNull OnofrioParser.Judge_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#judge_name}.
	 * @param ctx the parse tree
	 */
	void exitJudge_name(@NotNull OnofrioParser.Judge_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#rally_ring_name}.
	 * @param ctx the parse tree
	 */
	void enterRally_ring_name(@NotNull OnofrioParser.Rally_ring_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#rally_ring_name}.
	 * @param ctx the parse tree
	 */
	void exitRally_ring_name(@NotNull OnofrioParser.Rally_ring_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link OnofrioParser#ring_without_breed}.
	 * @param ctx the parse tree
	 */
	void enterRing_without_breed(@NotNull OnofrioParser.Ring_without_breedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnofrioParser#ring_without_breed}.
	 * @param ctx the parse tree
	 */
	void exitRing_without_breed(@NotNull OnofrioParser.Ring_without_breedContext ctx);
}