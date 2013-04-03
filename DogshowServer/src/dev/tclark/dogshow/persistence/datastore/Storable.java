package dev.tclark.dogshow.persistence.datastore;

import com.google.appengine.api.datastore.Entity;

public interface Storable {
	public Entity toDatastoreEntity();
}
