package dev.tnclark8012.dogshow.persistence.datastore;

import com.google.appengine.api.datastore.Entity;

public interface Storable {
	public Entity toDatastoreEntity();
}
