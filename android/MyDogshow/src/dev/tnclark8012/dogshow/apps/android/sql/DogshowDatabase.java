package dev.tnclark8012.dogshow.apps.android.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

import dev.tnclark8012.dogshow.apps.android.BuildConfig;
import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.provider.DogshowProvider.Qualified;
import dev.tnclark8012.dogshow.apps.android.provider.DogshowProvider.Subquery;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRingsColumns;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.DogsColumns;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.HandlersColumns;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.JuniorsRingsColumns;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.RingColumns;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;

public class DogshowDatabase extends SQLiteOpenHelper {
	private static final String TAG = DogshowDatabase.class.getSimpleName();
	private static final String DATABASE_NAME = "mydogshow.db";
	private static final int VER_LAUNCH = 1;

	private static final int DATABASE_VERSION = VER_LAUNCH;

	public interface Tables {
		String DOGS = "dogs";
		String BREED_RINGS = "breed_rings";
		String HANDLERS = "handlers";
		String JUNIORS_RINGS = "juniors_rings";
		String ENTERED_DOGS_BY_BREED = "(SELECT *, " + Dogs.DOG_BREED + " as " + Dogs.ENTERED_DOGS_BREED + ", group_concat(" + Qualified.DOG_CALL_NAME + ", \", \" ) as " + Dogs.ENTERED_DOGS_NAMES + " FROM " + Tables.DOGS + " GROUP BY " + Dogs.DOG_BREED +")";
		String ENTERED_JUNIORS_RINGS = "(" + JUNIORS_RINGS + " JOIN " + Subquery.ENTERED_JUNIOR_HANDLERS + " as entered_junior_handlers ON " + Handlers.HANDLER_JUNIOR_CLASS + "=" +JuniorsRings.RING_JUNIOR_CLASS_NAME + ")";
		String ENTERED_BREED_RINGS_JOIN_DOGS = "(" + BREED_RINGS + " " + "JOIN " + ENTERED_DOGS_BY_BREED
				+ " as entered_breed_rings_dogs ON " + Qualified.BREED_RINGS_RING_BREED + "=" + Dogs.ENTERED_DOGS_BREED + ")";			
		String ALL_ENTERED_RINGS = "(select * from (" + Subquery.BREED_RING_OVERVIEW + " UNION ALL " + Subquery.JUNIOR_RING_OVERVIEW + " )) as all_entered_rings";
	}
	public DogshowDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	public static void deleteDatabase(Context context) {
		context.deleteDatabase(DATABASE_NAME);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + Tables.HANDLERS + " (" 
				+ BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ HandlersColumns.HANDLER_NAME + " INTEGER NOT NULL,"
				+ HandlersColumns.HANDLER_JUNIOR_CLASS + " TEXT,"
				+ HandlersColumns.HANDLER_IMAGE_PATH + " TEXT,"
				+ HandlersColumns.HANDLER_IS_SHOWING + " INTEGER NOT NULL,"
				+ HandlersColumns.HANDLER_IS_SHOWING_JUNIORS + " INTEGER NOT NULL,"
				+ SyncColumns.UPDATED + " INTEGER NOT NULL)");
		
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


		db.execSQL("CREATE TABLE " + Tables.BREED_RINGS + " ("
				+ BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ BreedRingsColumns.RING_BITCH_COUNT + " INTEGER NOT NULL,"
				+ RingColumns.RING_BLOCK_START+ " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_BREED + " TEXT NOT NULL,"
				+ BreedRingsColumns.RING_BREED_COUNT + " INTEGER NOT NULL,"
				+ RingColumns.RING_COUNT_AHEAD + " INTEGER NOT NULL,"
				+ RingColumns.RING_DATE + " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_DOG_COUNT+ " INTEGER NOT NULL,"
				+ RingColumns.RING_JUDGE+ " TEXT NOT NULL,"
				+ RingColumns.RING_JUDGE_TIME + " FLOAT NULL,"
				+ RingColumns.RING_NUMBER+ " INTEGER NOT NULL,"
				+ RingColumns.RING_SHOW_ID + " TEXT NOT NULL,"
				+ BreedRingsColumns.RING_SPECIAL_BITCH_COUNT+ " INTEGER NOT NULL,"
				+ BreedRingsColumns.RING_SPECIAL_DOG_COUNT + " INTEGER NOT NULL,"
				+ SyncColumns.UPDATED + " INTEGER NOT NULL)");
		
		db.execSQL("CREATE TABLE " + Tables.JUNIORS_RINGS + " ("
				+ BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ RingColumns.RING_BLOCK_START+ " INTEGER NOT NULL,"
				+ JuniorsRingsColumns.RING_JUNIOR_CLASS_NAME + " TEXT NOT NULL,"
				+ JuniorsRingsColumns.RING_JUNIOR_COUNT + " INTEGER NOT NULL,"
				+ RingColumns.RING_COUNT_AHEAD + " INTEGER NOT NULL,"
				+ RingColumns.RING_DATE + " INTEGER NOT NULL,"
				+ RingColumns.RING_JUDGE+ " TEXT NOT NULL,"
				+ RingColumns.RING_JUDGE_TIME + " FLOAT,"
				+ RingColumns.RING_NUMBER+ " INTEGER NOT NULL,"
				+ RingColumns.RING_SHOW_ID + " TEXT NOT NULL,"
				+ SyncColumns.UPDATED + " INTEGER NOT NULL)");
	    if(BuildConfig.DEBUG)
        {
            insertDebugEntities(db);
        }

    }

    private void insertDebugEntities(SQLiteDatabase db)
    {
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

        db.execSQL("INSERT INTO " + Tables.HANDLERS + "("
				+ HandlersColumns.HANDLER_NAME + "," + HandlersColumns.HANDLER_JUNIOR_CLASS + "," 
				+ HandlersColumns.HANDLER_IS_SHOWING + "," 
				+ HandlersColumns.HANDLER_IS_SHOWING_JUNIORS+ "," 
				+ SyncColumns.UPDATED + ") VALUES ("
				+ "\"Tanner\"," + "\"MASTER_CLASS\", 1, 1," + System.currentTimeMillis() + ")");
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
