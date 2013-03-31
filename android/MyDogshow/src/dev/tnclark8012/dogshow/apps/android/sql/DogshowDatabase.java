package dev.tnclark8012.dogshow.apps.android.sql;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRingsColumns;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.DogsColumns;

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
		String HANDLERS = "handlers";
		String BREED_RINGS = "breed_rings";
		String BREED_RINGS_JOIN_DOGS = BREED_RINGS + " " + "JOIN " + DOGS
				+ " ON " + BREED_RINGS + "." + BreedRings.RING_BREED + "="
				+ DOGS + "." + Dogs.DOG_BREED;

	}

	public DogshowDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	public static void deleteDatabase(Context context) {
		context.deleteDatabase(DATABASE_NAME);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + Tables.DOGS + " (" + BaseColumns._ID
				+ " INTEGER PRIMARY KEY AUTOINCREMENT," + DogsColumns.DOG_BREED
				+ " TEXT NOT NULL," + DogsColumns.DOG_CALL_NAME
				+ " TEXT NOT NULL," + DogsColumns.DOG_IMAGE_PATH + " TEXT,"
				+ DogsColumns.DOG_MAJORS + " INTEGER NOT NULL,"
				+ DogsColumns.DOG_OWNER_ID + " INTEGER NOT NULL,"
				+ DogsColumns.DOG_POINTS + " INTEGER NOT NULL,"
				+ DogsColumns.DOG_SEX + " INTEGER NOT NULL,"
				+ DogsColumns.DOG_IS_SHOWING + " INTEGER,"
				+ DogsColumns.DOG_UPDATED + " INTEGER NOT NULL)");

		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_BREED
				+ "," + DogsColumns.DOG_CALL_NAME + ","
				+ DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + ","
				+ DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + ","
				+ DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED
				+ ")" + " VALUES (" + "\"Papillon\"," + "\"Lotta\"," + "2,"
				+ "0," + "15," + "1," + "1," + System.currentTimeMillis() + ")");
		
		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_BREED
				+ "," + DogsColumns.DOG_CALL_NAME + ","
				+ DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + ","
				+ DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + ","
				+ DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED
				+ ")" + " VALUES (" + "\"Papillon\"," + "\"Michael\"," + "2,"
				+ "0," + "20," + "0," + "1," + System.currentTimeMillis() + ")");

		db.execSQL("CREATE TABLE " + Tables.BREED_RINGS + " ("
				+ BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ BreedRingsColumns.RING_BREED + " TEXT NOT NULL,"
				+ BreedRingsColumns.RING_BREED_START + " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_JUDGE + " TEXT NOT NULL,"
				+ BreedRingsColumns.RING_NUMBER + " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_START + " INTEGER NOT NULL)");

		db.execSQL("INSERT INTO " + Tables.BREED_RINGS + "("
				+ BreedRingsColumns.RING_BREED + ","
				+ BreedRingsColumns.RING_BREED_START + ","
				+ BreedRingsColumns.RING_JUDGE + ","
				+ BreedRingsColumns.RING_NUMBER + ","
				+ BreedRingsColumns.RING_START + ")" + " VALUES ("
				+ "\"Papillon\","
				+ (new GregorianCalendar().getTimeInMillis()+2*60*1000)
				+ "," + "\"Dr. Steve Keating\"," + "3,"
				+ new GregorianCalendar().getTimeInMillis()
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