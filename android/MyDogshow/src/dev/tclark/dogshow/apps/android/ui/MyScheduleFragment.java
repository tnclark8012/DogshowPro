/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.tclark.dogshow.apps.android.ui;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.ActionMode;

import dev.tclark.dogshow.apps.android.R;

public class MyScheduleFragment extends SherlockListFragment implements
        LoaderManager.LoaderCallbacks<Cursor>,
        ActionMode.Callback {

    private static final String TAG =MyScheduleFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
    	View view = inflater.inflate(R.layout.fragment_schedule_list, container, false);
    	getListView().setAdapter(new ArrayAdapter<String>(view.getContext(), 0));
    	return view;
    }
	@Override
	public boolean onCreateActionMode(ActionMode mode,
			com.actionbarsherlock.view.Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onPrepareActionMode(ActionMode mode,
			com.actionbarsherlock.view.Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onActionItemClicked(ActionMode mode,
			com.actionbarsherlock.view.MenuItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onDestroyActionMode(ActionMode mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Loader<Cursor> onCreateLoader(int arg0, Bundle arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onLoadFinished(Loader<Cursor> arg0, Cursor arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
		// TODO Auto-generated method stub
		
	}

}
