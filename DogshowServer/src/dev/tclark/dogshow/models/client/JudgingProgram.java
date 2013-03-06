package dev.tclark.dogshow.models.client;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

import dev.tclark.dogshow.client.raw.DownloadableFile;

@PersistenceCapable
public class JudgingProgram {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	Key key;
	
	@Persistent(serialized = "true")
	private DownloadableFile pdf;
}
