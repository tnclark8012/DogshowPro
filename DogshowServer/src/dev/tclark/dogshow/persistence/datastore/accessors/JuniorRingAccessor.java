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

import dev.tclark.dogshow.persistence.datastore.BreedRing;
import dev.tclark.dogshow.persistence.datastore.JuniorRing;

public class JuniorRingAccessor {
	public static void createJuniorRing(JuniorRing ring) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		datastore.put(ring.toDatastoreEntity());
	}

	public static List<JuniorRing> getJuniorRingsByShowId(String showId) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Looking for JuniorRings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL,
				showId);
		Query q = new Query(JuniorRing.class.getSimpleName()).setFilter(idFilter);
		PreparedQuery pq = datastore.prepare(q);
		List<JuniorRing> results = new LinkedList<JuniorRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new JuniorRing(result));
		}
		return results;
	}

	public static void deleteAllJuniorRings(boolean sure, boolean reallySure,
			boolean positive, boolean knowConsequences, boolean stupid) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query q = new Query(JuniorRing.class.getSimpleName()).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		pq.asIterable();
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted breed ring with key: " + e.getKey());
		}
	}
	
	public static void deleteAllJuniorRingsForShow(String showId)
	{
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Deleting JuniorRings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL,
				showId);
		Query q = new Query(JuniorRing.class.getSimpleName()).setFilter(idFilter).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted breed ring with key: " + e.getKey());
		}
	}

	public static List<JuniorRing> getAllJuniorRings() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query q = new Query(JuniorRing.class.getSimpleName());
		PreparedQuery pq = datastore.prepare(q);
		List<JuniorRing> results = new LinkedList<JuniorRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new JuniorRing(result));
		}
		return results;
	}
}