package dev.tclark.dogshow.models.client;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Handler {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String name;
	
	public Handler(Key key, String name){
		this.key = key;
		this.name = name;
	}
	
	public Handler(Entity entity)
	{
		this.key = entity.getKey();
		this.name = (String)entity.getProperty("name");
	}
	
	public String getName(){
		return name;
	}
}
