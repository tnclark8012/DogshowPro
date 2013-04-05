package dev.tnclark8012.dogshow.apps.android.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

import com.actionbarsherlock.app.SherlockListFragment;

import dev.tnclark8012.dogshow.apps.android.model.Handler;

public class HandlerListFragment extends SherlockListFragment implements OnItemLongClickListener, HandlerListActionMode.Callback{

	@Override
	public void onHandlerDeleted(boolean isDeleted, Handler... handlers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onActionModeDestroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		return false;
	}
//	private static final String TAG = HandlerListFragment.class.getSimpleName();
////	private DatabaseHelper mDatabaseHelper;
//	private HandlerAdapter mHandlerAdapter;
//	private HandlerListActionMode mActionMode;
//	private Menu mMenu;
//	private ListView mListView;
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
////		mDatabaseHelper = new DatabaseHelper(getActivity());
//		setHasOptionsMenu(true);
////		try{
//		// get our dao
////		Dao<Handler, Integer> simpleDao = mDatabaseHelper.getHandlerDao();
////		// query for all of the data objects in the database
////		List<Handler> list = simpleDao.queryForAll();
////
////		mHandlerAdapter = new HandlerAdapter(getActivity(), list);// (getActivity());
////		// mAdapter = new SimpleSectionedListAdapter(getActivity(),
////		// R.layout.list_item_schedule_header, mScheduleAdapter);
////		setListAdapter(mHandlerAdapter);
////		
////		}
////		catch(SQLException e)
////		{
////			e.printStackTrace();
////		}
//	}
//	
//	@Override
//	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//		// TODO Auto-generated method stub
//		mMenu = menu;
//		inflater.inflate(R.menu.handler, menu);
//		super.onCreateOptionsMenu(menu, inflater);
//	}
//	int index = 0;
//	
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		String [] names = {"Taylor", "Jessica", "Blah"};
//		if(index== names.length)
//		{
//			index = 0;
//		}
//		switch(item.getItemId())
//		{
//		case R.id.menu_add_handler:
//			try {
//				Handler handler = new Handler(names[index++], null);
//				mHandlerAdapter.add(handler);
//				mDatabaseHelper.getHandlerDao().create(handler);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
//	
//	@Override
//	public void onDestroy() {
//		mDatabaseHelper.close();
//		super.onDestroy();
//	}
//
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container,
//			Bundle savedInstanceState) {
//		ViewGroup root = (ViewGroup) inflater.inflate(
//				R.layout.fragment_handler, container, false);
//		inflater.inflate(R.layout.empty_waiting_for_sync,
//				(ViewGroup) root.findViewById(android.R.id.empty), true);
//		root.setBackgroundColor(Color.WHITE);
//		mListView = (ListView) root.findViewById(android.R.id.list);
//		Drawable divider = this.getResources().getDrawable( R.drawable.list_divider );
//		mListView.setDivider( divider );
//		mListView.setDividerHeight( 2 );
//		mListView.setItemsCanFocus(true);
//		mListView.setCacheColorHint(Color.WHITE);
//		mListView.setOnItemLongClickListener(this);
//		
//		// listView.setEmptyView(root.findViewById(android.R.id.empty));
//		return root;
//	}
//
//	@Override
//	public boolean onItemLongClick(AdapterView< ? > adapterView, final View view, int position, long id ) {
//		if( mActionMode == null )
//		{
//			Log.d(TAG, "Starting action mode");
//			//mListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//			mHandlerAdapter.toggleActivated(position);
//			mActionMode = new HandlerListActionMode( this, mHandlerAdapter);
//			getSherlockActivity().startActionMode( mActionMode );
//		}
////		mActionMode.onItemSelected( position );
//		return true;
////		return false;
//	}
//
//	@Override
//	public void onHandlerDeleted(boolean isDeleted, Handler... handlers) {
//		Log.d(TAG, "Deleting " + handlers.length + " handlers!" );
//		try {
//			mDatabaseHelper.getHandlerDao().delete(Arrays.asList(handlers));
//			mHandlerAdapter.notifyDataSetChanged();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void onActionModeDestroy() {
//		mActionMode = null;
//	}
//	@Override
//	public void onListItemClick(ListView l, View v, int position, long id) {
//		if( mActionMode != null)
//		{
//			Log.v(TAG, "toggling activated");
//			mHandlerAdapter.toggleActivated(position);
//		}
//	}
	
}
