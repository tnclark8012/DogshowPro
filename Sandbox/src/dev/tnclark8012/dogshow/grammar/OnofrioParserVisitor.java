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
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OnofrioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OnofrioParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OnofrioParser#junior_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJunior_ring(@NotNull OnofrioParser.Junior_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#big_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBig_comment(@NotNull OnofrioParser.Big_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#group_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_block(@NotNull OnofrioParser.Group_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#rally_entry_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_entry_line(@NotNull OnofrioParser.Rally_entry_lineContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#timeblock_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeblock_comment(@NotNull OnofrioParser.Timeblock_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#non_group_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_group_ring(@NotNull OnofrioParser.Non_group_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#non_ring_title_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_ring_title_comment(@NotNull OnofrioParser.Non_ring_title_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#non_conformation_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_conformation_ring(@NotNull OnofrioParser.Non_conformation_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#breed_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreed_ring(@NotNull OnofrioParser.Breed_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#ring_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_title(@NotNull OnofrioParser.Ring_titleContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#non_header_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_header_comment(@NotNull OnofrioParser.Non_header_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#inner_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_ring(@NotNull OnofrioParser.Inner_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#rally_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_ring(@NotNull OnofrioParser.Rally_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing(@NotNull OnofrioParser.RingContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#ring_with_breed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_with_breed(@NotNull OnofrioParser.Ring_with_breedContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#special_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_ring(@NotNull OnofrioParser.Special_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#special_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_suffix(@NotNull OnofrioParser.Special_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#non_conformation_breed_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_conformation_breed_ring(@NotNull OnofrioParser.Non_conformation_breed_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#judge_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudge_block(@NotNull OnofrioParser.Judge_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#rally_walkthrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_walkthrough(@NotNull OnofrioParser.Rally_walkthroughContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#special_ring_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_ring_header(@NotNull OnofrioParser.Special_ring_headerContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#rally_ring_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_ring_block(@NotNull OnofrioParser.Rally_ring_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#empty_breed_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_breed_ring(@NotNull OnofrioParser.Empty_breed_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#rally_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_comment(@NotNull OnofrioParser.Rally_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#group_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_ring(@NotNull OnofrioParser.Group_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#inner_timeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_timeblock(@NotNull OnofrioParser.Inner_timeblockContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#breed_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreed_name(@NotNull OnofrioParser.Breed_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#timeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeblock(@NotNull OnofrioParser.TimeblockContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull OnofrioParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#obedience_with_breed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObedience_with_breed(@NotNull OnofrioParser.Obedience_with_breedContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#ring_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_comment(@NotNull OnofrioParser.Ring_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull OnofrioParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#judge_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudge_name(@NotNull OnofrioParser.Judge_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#rally_ring_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_ring_name(@NotNull OnofrioParser.Rally_ring_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link OnofrioParser#ring_without_breed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_without_breed(@NotNull OnofrioParser.Ring_without_breedContext ctx);
}