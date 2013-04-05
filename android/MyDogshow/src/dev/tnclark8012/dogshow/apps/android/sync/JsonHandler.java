package dev.tnclark8012.dogshow.apps.android.sync;

import java.io.IOException;
import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;

public abstract class JsonHandler {
    protected static Context mContext;

    protected JsonHandler(Context context) {
        mContext = context;
    }

    public abstract ArrayList<ContentProviderOperation> parse(String json) throws IOException;

}
