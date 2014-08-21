package dev.tnclark8012.apps.android.dogshow.ui.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.RingBlockOverviewListAdapter;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.RingBlocks;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.RingBlockOverviewQuery;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;

public class RingBlockOverviewDialogFragment extends DialogFragment implements
		LoaderCallbacks<Cursor> {
	/**
	 * Constructor
	 * 
	 * @param title
	 *            - resource Integer, specifying the string to use as the
	 *            dialogs title
	 * @return a new instance of WaitDialogFragment
	 */
	public static RingBlockOverviewDialogFragment newInstance(int ringNumber,
			long blockStart) {
		RingBlockOverviewDialogFragment frag = new RingBlockOverviewDialogFragment();
		Bundle args = new Bundle();
		args.putInt("ring_number", ringNumber);
		args.putLong("block_start", blockStart);
		frag.setArguments(args);
		return frag;
	}

	public static RingBlockOverviewDialogFragment newInstance(int ringNumber,
			long blockStart, int selectedCountAhead) {
		RingBlockOverviewDialogFragment frag = new RingBlockOverviewDialogFragment();
		Bundle args = new Bundle();
		args.putInt("ring_number", ringNumber);
		args.putLong("block_start", blockStart);
		args.putInt("selected_count_ahead", selectedCountAhead);
		frag.setArguments(args);
		return frag;
	}

	/**
	 * @return the Created Dialog
	 */
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {

		Dialog dialog = new Dialog(getActivity());
		getActivity().getLoaderManager().restartLoader(
				RingBlockOverviewQuery._TOKEN, getArguments(), this);
		int ringNumber = getArguments().getInt("ring_number");
		String ringTitle;
		if (ringNumber > 0) {
			ringTitle = "Ring " + ringNumber;
		} else {
			ringTitle = "Group Rings";
		}
		dialog.setTitle(ringTitle
				+ "  "
				+ UIUtils.timeStringFromMillis(
						getArguments().getLong("block_start"), true));
		return dialog;
	}

	private ListView mListView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = inflater.inflate(
				R.layout.fragment_list_ring_block_overview, container);
		mListView = (ListView) root.findViewById(android.R.id.list);
		mListView.setDivider(null);
		mListView.setItemsCanFocus(false);
		mListView.setFocusable(false);
		return root;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		return new CursorLoader(getActivity(), RingBlocks.CONTENT_URI,
				RingBlockOverviewQuery.PROJECTION,
				RingBlocks.SELECTION_RING_BLOCK,
				RingBlocks.buildBlockSelectionArgs(args.getInt("ring_number"),
						args.getLong("block_start")), RingBlocks.DEFAULT_SORT);
	}

	@Override
	public void onLoadFinished(Loader<Cursor> arg0, Cursor cursor) {
		if (arg0.getId() == RingBlockOverviewQuery._TOKEN) {
			mListView.setAdapter(new RingBlockOverviewListAdapter(
					getActivity(), cursor, getArguments().getInt(
							"selected_count_ahead", -1)));
		}
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
	}

}
