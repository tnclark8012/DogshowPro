package dev.tnclark8012.dogshow.apps.android.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.DogsColumns;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;

public class DogshowDatabase extends SQLiteOpenHelper {
	private static final String TAG = DogshowDatabase.class.getSimpleName();
	private static final String DATABASE_NAME = "mydogshow.db";
	// public static final String TABLE_DOGS = "dogs";
	public static final String COLUMN_ID = "_id";
	private static final int VER_LAUNCH = 1;
	// private static final int VER_SESSION_TYPE = 2;

	private static final int DATABASE_VERSION = VER_LAUNCH;

	public interface Tables {
		String DOGS = "dogs";
	}

	public DogshowDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	public static void deleteDatabase(Context context) {
		context.deleteDatabase(DATABASE_NAME);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + Tables.DOGS + " (" + 
				BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + 
				DogsColumns.DOG_ID + " INTEGER NOT NULL," +
				DogsColumns.DOG_BREED + " TEXT NOT NULL," + 
				DogsColumns.DOG_CALL_NAME + " TEXT NOT NULL," + 
				DogsColumns.DOG_IMAGE_PATH + " TEXT," +
				DogsColumns.DOG_MAJORS + " INTEGER NOT NULL," + 
				DogsColumns.DOG_OWNER_ID + " INTEGER NOT NULL," + 
				DogsColumns.DOG_POINTS + " INTEGER NOT NULL," + 
				DogsColumns.DOG_SEX + " INTEGER NOT NULL," +
				DogsColumns.DOG_UPDATED + " INTEGER NOT NULL)");

		db.execSQL("INSERT INTO " + Tables.DOGS
				+ " (" + DogsColumns.DOG_BREED + ","
				+ DogsColumns.DOG_CALL_NAME + ","
				+ DogsColumns.DOG_ID + ","
				+ DogsColumns.DOG_MAJORS + ","
				+ DogsColumns.DOG_OWNER_ID + ","
				+ DogsColumns.DOG_POINTS + ","
				+ DogsColumns.DOG_SEX + ","
				+ DogsColumns.DOG_UPDATED
				+ ")"
				+ " VALUES ("
				+"\"Papillon\","
				+"\"Lotta\","
				+"1,"
				+"2,"
				+"0,"
				+"15,"
				+"1,"
				+ System.currentTimeMillis()
				+ ")");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.d(TAG, "onUpgrade() from " + oldVersion + " to " + newVersion);

		// NOTE: This switch statement is designed to handle cascading database
		// updates, starting at the current version and falling through to all
		// future upgrade cases. Only use "break;" when you want to drop and
		// recreate the entire database.

		int version = oldVersion;
		// Log.d(TAG, "after upgrade logic, at version " + version);
		if (version != DATABASE_VERSION) {
			Log.w(TAG, "Destroying old data during upgrade");

			db.execSQL("DROP TABLE IF EXISTS " + Tables.DOGS);

			onCreate(db);
		}
	}
}
