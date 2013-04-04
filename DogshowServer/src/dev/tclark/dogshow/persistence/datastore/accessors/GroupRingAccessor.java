package dev.tclark.dogshow.persistence.datastore.accessors;

import java.util.LinkedList;
import java.util.List;

import com.google.appengine.api.datastore.AsyncDatastoreService;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

import dev.tclark.dogshow.persistence.datastore.BreedRing;
import dev.tclark.dogshow.persistence.datastore.GroupRing;

public class GroupRingAccessor {
	public static void createGroupRing(GroupRing ring) {
		AsyncDatastoreService datastore = DatastoreHelper.getAsyncDatastore();
		datastore.put(ring.toDatastoreEntity());
	}

	public static List<GroupRing> getGroupRingsByShowId(String showId) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Looking for group rings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL,
				showId);
		Query q = new Query(GroupRing.class.getSimpleName()).setFilter(idFilter);
		PreparedQuery pq = datastore.prepare(q);
		List<GroupRing> results = new LinkedList<GroupRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new GroupRing(result));
		}
		return results;
	}

	public static void deleteAllGroupRings(boolean sure, boolean reallySure,
			boolean positive, boolean knowConsequences, boolean stupid) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query q = new Query(GroupRing.class.getSimpleName()).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		pq.asIterable();
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted group ring with key: " + e.getKey());
		}
	}
	
	public static void deleteAllGroupRingsForShow(String showId)
	{
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Deleting GroupRings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL,
				showId);
		Query q = new Query(GroupRing.class.getSimpleName()).setFilter(idFilter).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted Group ring with key: " + e.getKey());
		}
	}

	public static List<GroupRing> getAllGroupRings() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query q = new Query(GroupRing.class.getSimpleName());
		PreparedQuery pq = datastore.prepare(q);
		List<GroupRing> results = new LinkedList<GroupRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new GroupRing(result));
		}
		return results;
	}
}
