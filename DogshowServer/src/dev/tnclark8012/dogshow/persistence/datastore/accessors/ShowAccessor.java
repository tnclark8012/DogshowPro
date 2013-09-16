package dev.tnclark8012.dogshow.persistence.datastore.accessors;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.google.appengine.api.datastore.AsyncDatastoreService;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.datastore.Transaction;

import dev.tnclark8012.dogshow.persistence.datastore.Show;

public class ShowAccessor {
	public static void createShow(Show show) {
		DatastoreService datastore = DatastoreHelper.getDatastoreService();
		try {
			Key showKey = KeyFactory.createKey(Show.class.getSimpleName(),
					show.getKeyName());
			datastore.get(showKey);
		} catch (EntityNotFoundException e) {
			System.out.println("Creating show async...");
			AsyncDatastoreService asyncDatastore = DatastoreHelper
					.getAsyncDatastore();
			Future<Transaction> txn = asyncDatastore.beginTransaction();
			datastore.put(show.toDatastoreEntity());
			try {
				txn.get().commitAsync();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				System.err.println("Couldn't commit show!");
				e1.printStackTrace();
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				System.err.println("Couldn't commit show!");
				e1.printStackTrace();
			}
		}

	}

	/**
	 * Gets a single show by showId. If multiple exist in the Datastore, it
	 * returns the first found
	 * 
	 * @param showId
	 * @return
	 */
	public static Show getSingleShowById(String showId) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Looking for showId=" + showId);
		Filter stateFilter = new FilterPredicate("showId",
				FilterOperator.EQUAL, showId);
		Query q = new Query(Show.class.getSimpleName()).setFilter(stateFilter);
		PreparedQuery pq = datastore.prepare(q);
		for (Entity result : pq.asIterable()) {
			return new Show(result);
		}
		return null;
	}

	public static List<Show> getShowsByState(String stateCode) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Looking for state=" + stateCode);
		Filter stateFilter = new FilterPredicate("state", FilterOperator.EQUAL,
				stateCode);
		Query q = new Query(Show.class.getSimpleName()).setFilter(stateFilter);
		PreparedQuery pq = datastore.prepare(q);
		List<Show> results = new LinkedList<Show>();
		for (Entity result : pq.asIterable()) {
			results.add(new Show(result));
		}
		return results;
	}

	public static void deleteAllShows(boolean sure, boolean reallySure,
			boolean positive, boolean knowConsequences, boolean stupid) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query q = new Query(Show.class.getSimpleName()).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		pq.asIterable();
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted show with key: " + e.getKey());
		}
	}

	public static List<Show> getAllShows() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query q = new Query(Show.class.getSimpleName());
		PreparedQuery pq = datastore.prepare(q);
		List<Show> results = new LinkedList<Show>();
		for (Entity result : pq.asIterable()) {
			results.add(new Show(result));
		}
		return results;
	}
}
