package dev.tnclark8012.apps.android.dogshow.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.BuildConfig;
import dev.tnclark8012.apps.android.dogshow.provider.DogshowProvider.Qualified;
import dev.tnclark8012.apps.android.dogshow.provider.DogshowProvider.Subquery;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRingsColumns;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.DogsColumns;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.HandlersColumns;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRingsColumns;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.RingColumns;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeamsColumns;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class DogshowDatabase extends SQLiteOpenHelper {
	private static final String TAG = DogshowDatabase.class.getSimpleName();
	private static final String DATABASE_NAME = "mydogshow.db";
	private static final int VER_LAUNCH = 3;
	private static final int VER_BREED_BREAKDOWN = 4;
	private static final int VER_HANDLERS_UPGRADE = 5;
	private static final int VER_HANDLERS_IS_ME = 6;
	private static final int VER_SHOW_TEAMS = 7;
	private static final int VER_SYNC_INTRODUCED = 8;// Added show team status sync columns

	private static final int DATABASE_VERSION = VER_SYNC_INTRODUCED;

	public interface Tables {
		String DOGS = "dogs";
		String BREED_RINGS = "breed_rings";
		String HANDLERS = "handlers";
		String JUNIORS_RINGS = "juniors_rings";
		String SHOW_TEAMS = "show_teams";
		String ENTERED_DOGS_BY_BREED = "(SELECT *, " + Dogs.DOG_BREED + " as " + Dogs.ENTERED_DOGS_BREED + ", group_concat(" + Qualified.DOG_CALL_NAME + ", \", \" ) as " + Dogs.ENTERED_DOGS_NAMES + ", MIN(" + Dogs.DOG_CLASS + ") as " + Dogs.ENTERED_DOGS_FIRST_CLASS + " FROM " + Tables.DOGS + " GROUP BY " + Dogs.DOG_BREED + "," + Dogs.DOG_IS_SHOWING_SWEEPSTAKES + ", " + Dogs.DOG_IS_VETERAN + ")";
		String ENTERED_JUNIORS_RINGS = "(" + JUNIORS_RINGS + " JOIN " + Subquery.ENTERED_JUNIOR_HANDLERS + " as entered_junior_handlers ON " + Handlers.HANDLER_JUNIOR_CLASS + "=" + JuniorsRings.RING_JUNIOR_CLASS_NAME + ")";
		String ENTERED_BREED_RINGS_JOIN_DOGS_JOIN_ON = Qualified.BREED_RINGS_RING_BREED + "=" + Dogs.ENTERED_DOGS_BREED + " AND "/* + Qualified.BREED_RINGS_IS_SWEEPSTAKES + "=" + Dogs.DOG_IS_SHOWING_SWEEPSTAKES + " AND " TODO Sweepstakes should be optional */+ Qualified.BREED_RINGS_IS_VETERAN + "=" + Dogs.DOG_IS_VETERAN;
		String ENTERED_BREED_RINGS_JOIN_DOGS = "(" + BREED_RINGS + " " + "JOIN " + ENTERED_DOGS_BY_BREED + " as entered_breed_rings_dogs ON " + ENTERED_BREED_RINGS_JOIN_DOGS_JOIN_ON + ")";
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
		createBreedRingsTable(db);
		createHandlersTable(db);
		createDogsTable(db);
		createJuniorsRingsTable(db);
		createShowTeamsTable(db);
		if (BuildConfig.DEBUG) {
			// insertDebugEntities(db);
		}

	}

	private void createHandlersTable(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + Tables.HANDLERS + " (" + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + HandlersColumns.HANDLER_ID + " TEXT NOT NULL, " + HandlersColumns.HANDLER_IS_ME + " INTEGER DEFAULT 0, " + HandlersColumns.HANDLER_NAME + " TEXT," + HandlersColumns.HANDLER_JUNIOR_CLASS + " TEXT," + HandlersColumns.HANDLER_IMAGE_PATH + " TEXT," + HandlersColumns.HANDLER_IS_SHOWING + " INTEGER DEFAULT 1," + HandlersColumns.HANDLER_IS_SHOWING_JUNIORS + " INTEGER DEFAULT 1," + SyncColumns.UPDATED + " INTEGER NOT NULL)");
	}

	private void createShowTeamsTable(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + Tables.SHOW_TEAMS + " (" + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + ShowTeamsColumns.SHOW_TEAM_ID + " TEXT NOT NULL, " + ShowTeams.SHOW_TEAM_ACTIVE + " INTEGER DEFAULT 0, " + ShowTeams.SHOW_TEAM_JUST_ME + " INTEGER DEFAULT 0, " + ShowTeamsColumns.SHOW_TEAM_NAME + " TEXT NOT NULL, " + ShowTeamsColumns.SHOW_TEAM_STATE + " INTEGER DEFAULT 1, " + ShowTeams.ENTERED_SHOW + " TEXT," + ShowTeams.UPDATED + " INTEGER DEFAULT 0)");
		db.execSQL("INSERT INTO " + Tables.SHOW_TEAMS + " (" + ShowTeams.SHOW_TEAM_ID + ", " + ShowTeams.SHOW_TEAM_NAME + "," + ShowTeams.SHOW_TEAM_STATE + ", " + ShowTeams.SHOW_TEAM_ACTIVE + ", " + ShowTeams.SHOW_TEAM_JUST_ME + ") VALUES (\"ME\", \"Just Me\", 1,1,1)");
	}

	private void createDogsTable(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + Tables.DOGS + " (" + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + DogsColumns.DOG_ID + " TEXT NOT NULL, " + DogsColumns.DOG_BREED + " TEXT NOT NULL," + DogsColumns.DOG_CALL_NAME + " TEXT," + DogsColumns.DOG_IMAGE_PATH + " TEXT," + DogsColumns.DOG_MAJORS + " INTEGER DEFAULT 0," + DogsColumns.DOG_OWNER_ID + " INTEGER DEFAULT -1," + DogsColumns.DOG_POINTS + " INTEGER DEFAULT 0," + DogsColumns.DOG_SEX + " INTEGER DEFAULT 0," + DogsColumns.DOG_IS_SHOWING + " INTEGER DEFAULT 1," + DogsColumns.DOG_IS_VETERAN + " INTEGER DEFAULT 0," + DogsColumns.DOG_IS_SHOWING_SWEEPSTAKES + " INTEGER DEFAULT 1," + DogsColumns.DOG_CLASS + " INTEGER DEFAULT 0, " + DogsColumns.DOG_IS_CHAMPION + " INTEGER DEFAULT 0, " + DogsColumns.DOG_UPDATED + " INTEGER NOT NULL)");
	}

	private void createBreedRingsTable(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + Tables.BREED_RINGS + " (" + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + BreedRingsColumns.RING_BITCH_COUNT + " INTEGER NOT NULL," + RingColumns.RING_BLOCK_START + " INTEGER NOT NULL," + BreedRingsColumns.RING_BREED + " TEXT NOT NULL," + BreedRingsColumns.RING_BREED_COUNT + " INTEGER NOT NULL," + RingColumns.RING_COUNT_AHEAD + " INTEGER NOT NULL," + RingColumns.RING_DATE + " INTEGER NOT NULL," + BreedRingsColumns.RING_DOG_COUNT + " INTEGER NOT NULL," + RingColumns.RING_JUDGE + " TEXT NOT NULL," + RingColumns.RING_JUDGE_TIME + " INTEGER," + RingColumns.RING_NUMBER + " INTEGER NOT NULL," + RingColumns.RING_SHOW_ID + " TEXT NOT NULL," + RingColumns.RING_TITLE + " TEXT," + BreedRingsColumns.RING_SPECIAL_BITCH_COUNT + " INTEGER NOT NULL," + BreedRingsColumns.RING_SPECIAL_DOG_COUNT + " INTEGER NOT NULL," + BreedRingsColumns.RING_BREED_IS_VETERAN + " INTEGER," + BreedRingsColumns.RING_BREED_IS_SWEEPSTAKES + " INTEGER,"
				+ BreedRingsColumns.RING_BREED_ATTRIBUTE + " TEXT," + SyncColumns.UPDATED + " INTEGER NOT NULL)");
	}

	private void createJuniorsRingsTable(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE " + Tables.JUNIORS_RINGS + " (" + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + RingColumns.RING_BLOCK_START + " INTEGER NOT NULL," + JuniorsRingsColumns.RING_JUNIOR_CLASS_NAME + " TEXT NOT NULL," + JuniorsRingsColumns.RING_JUNIOR_COUNT + " INTEGER NOT NULL," + RingColumns.RING_COUNT_AHEAD + " INTEGER NOT NULL," + RingColumns.RING_DATE + " INTEGER NOT NULL," + RingColumns.RING_JUDGE + " TEXT NOT NULL," + RingColumns.RING_JUDGE_TIME + " INTEGER," + RingColumns.RING_NUMBER + " INTEGER NOT NULL," + RingColumns.RING_SHOW_ID + " TEXT NOT NULL," + RingColumns.RING_TITLE + " TEXT," + SyncColumns.UPDATED + " INTEGER NOT NULL)");
	}

	private void insertDebugEntities(SQLiteDatabase db) {
		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_ID + "," + DogsColumns.DOG_BREED + "," + DogsColumns.DOG_CALL_NAME + "," + DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + "," + DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + "," + DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED + "," + DogsColumns.DOG_IS_SHOWING_SWEEPSTAKES + "," + DogsColumns.DOG_IS_VETERAN + ")" + " VALUES (\"" + Utils.getGuid() + "\"," + "\"Papillon\"," + "\"Lotta\"," + "2," + "0," + "15," + "0," + "1," + System.currentTimeMillis() + ", 0,0)");

		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_ID + "," + DogsColumns.DOG_BREED + "," + DogsColumns.DOG_CALL_NAME + "," + DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + "," + DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + "," + DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED + "," + DogsColumns.DOG_IS_SHOWING_SWEEPSTAKES + "," + DogsColumns.DOG_IS_VETERAN + ")" + " VALUES (\"" + Utils.getGuid() + "\"," + "\"German Shepherd Dog\"," + "\"German(V/S)\"," + "2," + "0," + "20," + "1," + "1," + System.currentTimeMillis() + ",1,1)");
		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_ID + "," + DogsColumns.DOG_BREED + "," + DogsColumns.DOG_CALL_NAME + "," + DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + "," + DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + "," + DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED + "," + DogsColumns.DOG_IS_SHOWING_SWEEPSTAKES + "," + DogsColumns.DOG_IS_VETERAN + ")" + " VALUES (\"" + Utils.getGuid() + "\"," + "\"German Shepherd Dog\"," + "\"German (S)\"," + "2," + "0," + "20," + "1," + "1," + System.currentTimeMillis() + ",1,0)");

		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_ID + "," + DogsColumns.DOG_BREED + "," + DogsColumns.DOG_CALL_NAME + "," + DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + "," + DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + "," + DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED + "," + DogsColumns.DOG_IS_SHOWING_SWEEPSTAKES + "," + DogsColumns.DOG_IS_VETERAN + ")" + " VALUES (\"" + Utils.getGuid() + "\"," + "\"German Shepherd Dog\"," + "\"Boring German\"," + "2," + "0," + "20," + "1," + "1," + System.currentTimeMillis() + ",0,0)");
		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_ID + "," + DogsColumns.DOG_BREED + "," + DogsColumns.DOG_CALL_NAME + "," + DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + "," + DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + "," + DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED + "," + DogsColumns.DOG_IS_SHOWING_SWEEPSTAKES + "," + DogsColumns.DOG_IS_VETERAN + ")" + " VALUES (\"" + Utils.getGuid() + "\"," + "\"Shetland Sheepdog\"," + "\"Jay (V/S)\"," + "2," + "0," + "20," + "1," + "1," + System.currentTimeMillis() + ",1,1)");
		db.execSQL("INSERT INTO " + Tables.DOGS + " (" + DogsColumns.DOG_ID + "," + DogsColumns.DOG_BREED + "," + DogsColumns.DOG_CALL_NAME + "," + DogsColumns.DOG_MAJORS + "," + DogsColumns.DOG_OWNER_ID + "," + DogsColumns.DOG_POINTS + "," + DogsColumns.DOG_SEX + "," + DogsColumns.DOG_IS_SHOWING + "," + DogsColumns.DOG_UPDATED + "," + DogsColumns.DOG_IS_SHOWING_SWEEPSTAKES + "," + DogsColumns.DOG_IS_VETERAN + ")" + " VALUES (\"" + Utils.getGuid() + "\"," + "\"Shetland Sheepdog\"," + "\"Jason (S)\"," + "2," + "0," + "20," + "1," + "1," + System.currentTimeMillis() + ",1,0)");

		db.execSQL("INSERT INTO " + Tables.HANDLERS + "(" + HandlersColumns.HANDLER_ID + "," + HandlersColumns.HANDLER_NAME + "," + HandlersColumns.HANDLER_JUNIOR_CLASS + "," + HandlersColumns.HANDLER_IS_SHOWING + "," + HandlersColumns.HANDLER_IS_SHOWING_JUNIORS + "," + SyncColumns.UPDATED + ") VALUES (\"" + Utils.getGuid() + "\"," + "\"Tanner\"," + "\"MASTER_CLASS\", 1, 1," + System.currentTimeMillis() + ")");
		db.execSQL("INSERT INTO " + Tables.HANDLERS + "(" + HandlersColumns.HANDLER_ID + "," + HandlersColumns.HANDLER_NAME + "," + HandlersColumns.HANDLER_JUNIOR_CLASS + "," + HandlersColumns.HANDLER_IS_SHOWING + "," + HandlersColumns.HANDLER_IS_SHOWING_JUNIORS + "," + SyncColumns.UPDATED + ") VALUES (\"" + Utils.getGuid() + "\"," + "\"Taylor\"," + "\"NOVICE_JUNIOR\", 1, 1," + System.currentTimeMillis() + ")");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.d(TAG, "onUpgrade() from " + oldVersion + " to " + newVersion);
		// TODO implement upgrade logic
		// Switch statement designed to handle cascading database
		// updates, starting at the current version and falling through to all
		// future upgrade cases. Only use "break;" when you want to drop and
		// recreate the entire database.
		int version = oldVersion;
		try {
			switch (oldVersion) {
			case VER_LAUNCH:
				db.execSQL("ALTER TABLE " + Tables.DOGS + " ADD COLUMN " + DogsColumns.DOG_CLASS + " INTEGER DEFAULT 0");
				db.execSQL("ALTER TABLE " + Tables.DOGS + " ADD COLUMN " + DogsColumns.DOG_IS_CHAMPION + " INTEGER DEFAULT 0");
				version++;
			case VER_BREED_BREAKDOWN:
				db.execSQL("DROP TABLE IF EXISTS " + Tables.HANDLERS);
				createHandlersTable(db);
				version++;
			case VER_HANDLERS_UPGRADE:
				break;// Handler and Dogs get new GUID id's
			case VER_HANDLERS_IS_ME:
				createShowTeamsTable(db);
				version++;
			case VER_SHOW_TEAMS:
				db.execSQL("DROP TABLE IF EXISTS " + Tables.SHOW_TEAMS);
				createShowTeamsTable(db);
				version++;
			}
		} catch (Exception e) {
			version = -1;
		}

		if (version != DATABASE_VERSION) {
			Log.w(TAG, "Destroying old data during upgrade");
			db.execSQL("DROP TABLE IF EXISTS " + Tables.DOGS);
			db.execSQL("DROP TABLE IF EXISTS " + Tables.HANDLERS);
			db.execSQL("DROP TABLE IF EXISTS " + Tables.JUNIORS_RINGS);
			db.execSQL("DROP TABLE IF EXISTS " + Tables.BREED_RINGS);
			db.execSQL("DROP TABLE IF EXISTS " + Tables.SHOW_TEAMS);
			onCreate(db);
		}
	}
}
