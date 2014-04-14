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
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link onofrioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface onofrioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link onofrioParser#junior_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJunior_ring(@NotNull onofrioParser.Junior_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(@NotNull onofrioParser.TestContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#big_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBig_comment(@NotNull onofrioParser.Big_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#group_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_block(@NotNull onofrioParser.Group_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#rally_entry_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_entry_line(@NotNull onofrioParser.Rally_entry_lineContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#timeblock_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeblock_comment(@NotNull onofrioParser.Timeblock_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#non_group_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_group_ring(@NotNull onofrioParser.Non_group_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#non_ring_title_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_ring_title_comment(@NotNull onofrioParser.Non_ring_title_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#non_conformation_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_conformation_ring(@NotNull onofrioParser.Non_conformation_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#breed_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreed_ring(@NotNull onofrioParser.Breed_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#ring_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_title(@NotNull onofrioParser.Ring_titleContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#non_header_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_header_comment(@NotNull onofrioParser.Non_header_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#inner_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_ring(@NotNull onofrioParser.Inner_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#rally_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_ring(@NotNull onofrioParser.Rally_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing(@NotNull onofrioParser.RingContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#ring_with_breed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_with_breed(@NotNull onofrioParser.Ring_with_breedContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#special_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_ring(@NotNull onofrioParser.Special_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#special_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_suffix(@NotNull onofrioParser.Special_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#non_conformation_breed_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_conformation_breed_ring(@NotNull onofrioParser.Non_conformation_breed_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#judge_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudge_block(@NotNull onofrioParser.Judge_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#rally_walkthrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_walkthrough(@NotNull onofrioParser.Rally_walkthroughContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#special_ring_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_ring_header(@NotNull onofrioParser.Special_ring_headerContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#rally_ring_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_ring_block(@NotNull onofrioParser.Rally_ring_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#empty_breed_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_breed_ring(@NotNull onofrioParser.Empty_breed_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#rally_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_comment(@NotNull onofrioParser.Rally_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#group_ring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_ring(@NotNull onofrioParser.Group_ringContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#inner_timeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_timeblock(@NotNull onofrioParser.Inner_timeblockContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#breed_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreed_name(@NotNull onofrioParser.Breed_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#timeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeblock(@NotNull onofrioParser.TimeblockContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull onofrioParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#obedience_with_breed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObedience_with_breed(@NotNull onofrioParser.Obedience_with_breedContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#ring_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_comment(@NotNull onofrioParser.Ring_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull onofrioParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#judge_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudge_name(@NotNull onofrioParser.Judge_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#rally_ring_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRally_ring_name(@NotNull onofrioParser.Rally_ring_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link onofrioParser#ring_without_breed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_without_breed(@NotNull onofrioParser.Ring_without_breedContext ctx);
}