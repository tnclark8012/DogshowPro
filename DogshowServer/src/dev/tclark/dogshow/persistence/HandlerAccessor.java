package dev.tclark.dogshow.persistence;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.users.User;

import dev.tclark.dogshow.models.client.Handler;

public class HandlerAccessor {
	public static Handler getHandler(User user)
	{
		Key k = KeyFactory.createKey(Handler.class.getSimpleName(),
				user.getUserId());
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Filter keyFilter = new FilterPredicate(Entity.KEY_RESERVED_PROPERTY, Query.FilterOperator.EQUAL, k);
		Query query = new Query(Handler.class.getSimpleName());
		query.setFilter(keyFilter);
		PreparedQuery pq = datastore.prepare(query);
		Entity h = pq.asSingleEntity();
		if( h == null )
		{
			return null;
		}
		return new Handler(h);
	}
	
	public static void createHandler(User user, String name)
	{
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Entity handler = new Entity(Handler.class.getSimpleName(), user.getUserId());
		handler.setProperty("name", name);
		handler.setProperty("email", user.getEmail());
		datastore.put(handler);
	}
}
