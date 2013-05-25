package dev.tnclark8012.dogshow.apps.android.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

import com.actionbarsherlock.app.SherlockListFragment;

import dev.tnclark8012.dogshow.apps.android.model.Handler;

public class HandlerListFragment extends SherlockListFragment implements OnItemLongClickListener, HandlerListActionMode.Callback{

	@Override
	public void onHandlerDeleted(boolean isDeleted, Handler... handlers) {
	}

	@Override
	public void onActionModeDestroy() {
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		return false;
	}
	
}
