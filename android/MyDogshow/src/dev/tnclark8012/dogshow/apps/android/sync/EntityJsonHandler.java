package dev.tnclark8012.dogshow.apps.android.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;

public abstract class EntityJsonHandler extends JsonHandler {
	boolean clearExisting = false;
	boolean hasCleared = false;
	protected Context mContext;

	protected EntityJsonHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
		TAG = this.getClass().getSimpleName();
	}

	protected String TAG = null;
	
	

	public ArrayList<ContentProviderOperation> parse(String jsonStr) {
	return null;
	}
}
