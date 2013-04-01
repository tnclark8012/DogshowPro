package dev.tclark.dogshow.persistence.datastore.accessors;

import java.util.LinkedList;
import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

import dev.tclark.dogshow.persistence.datastore.Show;

public class ShowAccessor {
	public static void createShow(Show show) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		datastore.put(show.toEntity());
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
			results.add(Show.fromEntity(result));
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
			results.add(Show.fromEntity(result));
		}
		return results;
	}
}
