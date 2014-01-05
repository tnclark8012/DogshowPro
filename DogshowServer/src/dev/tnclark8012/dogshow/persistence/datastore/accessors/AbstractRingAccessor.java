//package dev.tnclark8012.dogshow.persistence.datastore.accessors;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//import com.google.appengine.api.datastore.AsyncDatastoreService;
//import com.google.appengine.api.datastore.DatastoreService;
//import com.google.appengine.api.datastore.DatastoreServiceFactory;
//import com.google.appengine.api.datastore.Entity;
//import com.google.appengine.api.datastore.PreparedQuery;
//import com.google.appengine.api.datastore.Query;
//import com.google.appengine.api.datastore.Query.CompositeFilter;
//import com.google.appengine.api.datastore.Query.CompositeFilterOperator;
//import com.google.appengine.api.datastore.Query.Filter;
//import com.google.appengine.api.datastore.Query.FilterOperator;
//import com.google.appengine.api.datastore.Query.FilterPredicate;
//
//import dev.tnclark8012.dogshow.persistence.datastore.ShowRing;
//import dev.tnclark8012.dogshow.persistence.datastore.ShowRing;
//
//public abstract class AbstractRingAccessor {
//	private final String kind;
//	private AbstractRingAccessor()
//	{
//		kind = getKindString();
//	}
//	protected abstract String getKindString();
//	public void createRing(ShowRing ring) {
//		AsyncDatastoreService datastore = DatastoreHelper.getAsyncDatastore();
//		datastore.put(ring.toDatastoreEntity());
//	}
//
//	public List<ShowRing> getAllRingsByShowId(String showId) {
//		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
//		System.out.println("Looking for " + kind + " rings for showId=" + showId);
//		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL, showId);
//		Query q = new Query(kind).setFilter(idFilter);
//		PreparedQuery pq = datastore.prepare(q);
//		List<ShowRing> results = new LinkedList<ShowRing>();
//		for (Entity result : pq.asIterable()) {
//			results.add(new ShowRing(result));
//		}
//		return results;
//	}
//
//	public List<ShowRing> getAllShowRingsByShowIdClassName(String showId, String className) {
//		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
//		System.out.println("Looking for ShowRings for showId=" + showId);
//		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL, showId);
//		Filter classFilter = new FilterPredicate("className", FilterOperator.EQUAL, className);
//		Query q = new Query(kind).setFilter(new CompositeFilter(CompositeFilterOperator.AND, Arrays.asList(idFilter, classFilter)));
//		PreparedQuery pq = datastore.prepare(q);
//		List<ShowRing> results = new LinkedList<ShowRing>();
//		for (Entity result : pq.asIterable()) {
//			results.add(new ShowRing(result));
//		}
//		return results;
//	}
//
//	public deleteAllShowRings(boolean sure, boolean reallySure, boolean positive, boolean knowConsequences, boolean stupid) {
//		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
//		Query q = new Query(kind).setKeysOnly();
//		PreparedQuery pq = datastore.prepare(q);
//		pq.asIterable();
//		for (Entity e : pq.asIterable()) {
//			datastore.delete(e.getKey());
//			System.out.println("Deleted breed ring with key: " + e.getKey());
//		}
//	}
//
//	public void deleteAllShowRingsForShow(String showId) {
//		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
//		System.out.println("Deleting ShowRings for showId=" + showId);
//		Filter idFilter = new FilterPredicate("showId", FilterOperator.EQUAL, showId);
//		Query q = new Query(kind).setFilter(idFilter).setKeysOnly();
//		PreparedQuery pq = datastore.prepare(q);
//		for (Entity e : pq.asIterable()) {
//			datastore.delete(e.getKey());
//			System.out.println("Deleted breed ring with key: " + e.getKey());
//		}
//	}
//
//	public List<ShowRing> getAllShowRings() {
//		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
//		Query q = new Query(kind);
//		PreparedQuery pq = datastore.prepare(q);
//		List<ShowRing> results = new LinkedList<ShowRing>();
//		for (Entity result : pq.asIterable()) {
//			results.add(new ShowRing(result));
//		}
//		return results;
//	}
//}
