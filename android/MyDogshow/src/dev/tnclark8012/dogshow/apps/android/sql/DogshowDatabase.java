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
		String ENTERED_DOGS_BY_BREED = "(SELECT *, " + Dogs.DOG_BREED + " as " + Dogs.ENTERED_DOGS_BREED + ", group_concat(dogs." + Dogs.DOG_CALL_NAME + ", \", \" ) as " + Dogs.ENTERED_DOGS_NAMES + " FROM " + Tables.DOGS + " GROUP BY " + Dogs.DOG_BREED +")";
		String BREED_RINGS_JOIN_DOGS = BREED_RINGS + " " + "JOIN " + ENTERED_DOGS_BY_BREED
				+ " ON " + BREED_RINGS + "." + BreedRings.RING_BREED + "="
		//TODO make fully-qualified column name interface FIXME to avoid hard coded dogs. as below and elsewhere
				+ Dogs.ENTERED_DOGS_BREED;
				
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
				+ ")" + " VALUES (" + "\"PAPILLON\"," + "\"Lotta\"," + "2,"
				+ "0," + "15," + "0," + "1," + System.currentTimeMillis() + ")");
		
		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_BREED
				+ "," + DogsColumns.DOG_CALL_NAME + ","
				+ DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + ","
				+ DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + ","
				+ DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED
				+ ")" + " VALUES (" + "\"SHETLAND_SHEEPDOG\"," + "\"Jay\"," + "2,"
				+ "0," + "20," + "1," + "1," + System.currentTimeMillis() + ")");

		db.execSQL("CREATE TABLE " + Tables.BREED_RINGS + " ("
				+ BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ BreedRingsColumns.RING_BITCH_COUNT + " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_BLOCK_START+ " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_BREED + " TEXT NOT NULL,"
				+ BreedRingsColumns.RING_BREED_COUNT + " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_COUNT_AHEAD + " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_DATE + " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_DOG_COUNT+ " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_JUDGE+ " TEXT NOT NULL,"
				+ BreedRingsColumns.RING_JUDGE_TIME + " FLOAT NULL,"
				+ BreedRingsColumns.RING_NUMBER+ " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_SHOW_ID + " TEXT NOT NULL,"
				+ BreedRingsColumns.RING_SPECIAL_BITCH_COUNT+ " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_SPECIAL_DOG_COUNT + " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_UPDATED+ " INTEGER NOT NULL)");
		Calendar today = new GregorianCalendar();
		today.set(Calendar.HOUR, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);
//		db.execSQL("INSERT INTO " + Tables.BREED_RINGS + "("
//				+ BreedRingsColumns.RING_BITCH_COUNT + ","
//				+ BreedRingsColumns.RING_BLOCK_START + ","
//				+ BreedRingsColumns.RING_BREED + ","
//				+ BreedRingsColumns.RING_BREED_COUNT + ","
//				+ BreedRingsColumns.RING_COUNT_AHEAD + ","
//				+ BreedRingsColumns.RING_DATE + ","
//				+ BreedRingsColumns.RING_DOG_COUNT + ","
//				+ BreedRingsColumns.RING_JUDGE + ","
//				+ BreedRingsColumns.RING_NUMBER+ ","
//				+ BreedRingsColumns.RING_SHOW_ID + ","
//				+ BreedRingsColumns.RING_SPECIAL_BITCH_COUNT + ","
//				+ BreedRingsColumns.RING_SPECIAL_DOG_COUNT + ","
//				+ BreedRingsColumns.RING_UPDATED + ")" + " VALUES ("
//				+ "2,"
//				+ (new GregorianCalendar().getTimeInMillis()+2*60*1000)
//				+ ",\"PAPILLON\","
//				+ "10,"
//				+ "15,"
//				+ (today.getTimeInMillis()) +","
//				+ "5,"
//				+ "\"Dr. Steve Keating\","
//				+ "3,"
//				+ "\"dummy\","
//				+ "2,"
//				+ "1,"
//				+ System.currentTimeMillis()
//				+ ")");

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