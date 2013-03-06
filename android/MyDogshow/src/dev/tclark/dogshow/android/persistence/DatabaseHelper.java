package dev.tclark.dogshow.android.persistence;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import dev.tclark.dogshow.android.model.AbstractModel;
import dev.tclark.dogshow.android.model.Handler;

/**
 * Database helper class used to manage the creation and upgrading of your
 * database. This class also usually provides the DAOs used by the other
 * classes.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

	// name of the database file for your application -- change to something
	// appropriate for your app
	private static final String DATABASE_NAME = "dogshow.db";
	// any time you make changes to your database objects, you may have to
	// increase the database version
	private static final int DATABASE_VERSION = 1;

	// the DAO object we use to access the Handler table
	private Dao<Handler, Integer> handlerDao = null;
	private Map<Class<? extends AbstractModel>, Dao<? extends AbstractModel, Integer>> map;
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		map = new HashMap<Class<? extends AbstractModel>, Dao<? extends AbstractModel, Integer>>();
	}

	/**
	 * This is called when the database is first created. Usually you should
	 * call createTable statements here to create the tables that will store
	 * your data.
	 */
	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
		try {
			Log.i(DatabaseHelper.class.getName(), "onCreate");
			TableUtils.createTable(connectionSource, Handler.class);

			// here we try inserting data in the on-create as a test
			Dao<Handler, Integer> dao = getHandlerDao();
			long millis = System.currentTimeMillis();
			// create some entries in the onCreate
			Handler simple = new Handler("Default", null);
			dao.create(simple);
			Log.i(DatabaseHelper.class.getName(),
					"created new entries in onCreate: " + millis);
		} catch (SQLException e) {
			Log.e(DatabaseHelper.class.getName(), "Can't create database", e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * This is called when your application is upgraded and it has a higher
	 * version number. This allows you to adjust the various data to match the
	 * new version number.
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource,
			int oldVersion, int newVersion) {
		try {
			Log.i(DatabaseHelper.class.getName(), "onUpgrade");
			TableUtils.dropTable(connectionSource, Handler.class, true);
			// after we drop the old databases, we create the new ones
			onCreate(db, connectionSource);
		} catch (SQLException e) {
			Log.e(DatabaseHelper.class.getName(), "Can't drop databases", e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * Returns the Database Access Object (DAO) for our Handler class. It
	 * will create it or just give the cached value.
	 */
	public Dao<Handler, Integer> getHandlerDao() throws SQLException {
		if (handlerDao == null) {
			handlerDao = getDao(Handler.class);
		}
		return handlerDao;
	}

	/**
	 * Close the database connections and clear any cached DAOs.
	 */
	@Override
	public void close() {
		super.close();
		handlerDao = null;
	}
}
