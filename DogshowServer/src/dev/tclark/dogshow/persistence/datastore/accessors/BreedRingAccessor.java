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
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class BreedRingAccessor {
	public static void createBreedRing(BreedRing ring) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		datastore.put(ring.toDatastoreEntity());
	}

	public static List<BreedRing> getBreedRingsByShowId(String showId) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Looking for all breed rings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL,
				showId);
		Query q = new Query(BreedRing.class.getSimpleName()).setFilter(idFilter);
		PreparedQuery pq = datastore.prepare(q);
		List<BreedRing> results = new LinkedList<BreedRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new BreedRing(result));
		}
		return results;
	}
	
	public static List<BreedRing> getBreedRingsByShowId(String showId, Breeds breed) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Looking for " + breed + " rings for show " + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL,
				showId);
		Filter breedFilter = new FilterPredicate("breed", FilterOperator.EQUAL, breed.toString());
		Query q = new Query(BreedRing.class.getSimpleName()).setFilter(idFilter).setFilter(breedFilter);
		PreparedQuery pq = datastore.prepare(q);
		List<BreedRing> results = new LinkedList<BreedRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new BreedRing(result));
		}
		return results;
	}

	public static void deleteAllBreedRings(boolean sure, boolean reallySure,
			boolean positive, boolean knowConsequences, boolean stupid) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query q = new Query(BreedRing.class.getSimpleName()).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		pq.asIterable();
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted breed ring with key: " + e.getKey());
		}
	}
	
	public static void deleteAllBreedRingsForShow(String showId)
	{
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		System.out.println("Deleting breedRings for showId=" + showId);
		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL,
				showId);
		Query q = new Query(BreedRing.class.getSimpleName()).setFilter(idFilter).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		for (Entity e : pq.asIterable()) {
			datastore.delete(e.getKey());
			System.out.println("Deleted breed ring with key: " + e.getKey());
		}
	}

	public static List<BreedRing> getAllBreedRings() {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query q = new Query(BreedRing.class.getSimpleName());
		PreparedQuery pq = datastore.prepare(q);
		List<BreedRing> results = new LinkedList<BreedRing>();
		for (Entity result : pq.asIterable()) {
			results.add(new BreedRing(result));
		}
		return results;
	}
}
