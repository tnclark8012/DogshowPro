package dev.tnclark8012.dogshow.persistence.datastore.accessors;

import com.google.appengine.api.datastore.AsyncDatastoreService;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

public class DatastoreHelper {
	public static DatastoreService getDatastoreService()
	{
		return DatastoreServiceFactory.getDatastoreService();
	}
	public static AsyncDatastoreService getAsyncDatastore()
	{
		return DatastoreServiceFactory.getAsyncDatastoreService();
	}
}
