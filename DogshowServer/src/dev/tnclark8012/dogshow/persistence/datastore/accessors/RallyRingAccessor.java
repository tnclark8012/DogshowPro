package dev.tnclark8012.dogshow.persistence.datastore.accessors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.google.appengine.api.datastore.AsyncDatastoreService;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.CompositeFilter;
import com.google.appengine.api.datastore.Query.CompositeFilterOperator;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

import dev.tnclark8012.dogshow.persistence.datastore.RallyRing;

public class RallyRingAccessor {
	public static void createRallyRing(RallyRing ring) {
		AsyncDatastoreService datastore = DatastoreHelper.getAsyncDatastore();
		datastore.put(ring.toDatastoreEntity());
	}

	public static List<RallyRing> getAllRallyRingsByShowId(String showId) {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		System.out.println("Looking for RallyRings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL, showId);
		Query q = new Query(RallyRing.class.getSimpleName()).setFilter(idFilter);
		PreparedQuery pq = datastore.prepare(q);
		List<RallyRing> results = new LinkedList<RallyRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new RallyRing(result));
		}
		return results;
	}

	public static List<RallyRing> getAllRallyRingsByShowIdClassName(String showId, String className) {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		System.out.println("Looking for RallyRings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL, showId);
		Filter classFilter = new FilterPredicate("className", FilterOperator.EQUAL, className);
		Query q = new Query(RallyRing.class.getSimpleName()).setFilter(new CompositeFilter(CompositeFilterOperator.AND, Arrays.asList(idFilter, classFilter)));
		PreparedQuery pq = datastore.prepare(q);
		List<RallyRing> results = new LinkedList<RallyRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new RallyRing(result));
		}
		return results;
	}

	public static void deleteAllRallyRings(boolean sure, boolean reallySure, boolean positive, boolean knowConsequences, boolean stupid) {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Query q = new Query(RallyRing.class.getSimpleName()).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		pq.asIterable();
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted RallyRing with key: " + e.getKey());
		}
	}

	public static void deleteAllRallyRingsForShow(String showId) {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		System.out.println("Deleting RallyRings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL, showId);
		Query q = new Query(RallyRing.class.getSimpleName()).setFilter(idFilter).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted RallyRing with key: " + e.getKey());
		}
	}

	public static List<RallyRing> getAllRallyRings() {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Query q = new Query(RallyRing.class.getSimpleName());
		PreparedQuery pq = datastore.prepare(q);
		List<RallyRing> results = new LinkedList<RallyRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new RallyRing(result));
		}
		return results;
	}
}
