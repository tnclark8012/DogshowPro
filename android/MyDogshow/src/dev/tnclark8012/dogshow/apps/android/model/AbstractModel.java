package dev.tnclark8012.dogshow.apps.android.model;

import com.j256.ormlite.field.DatabaseField;

public abstract class AbstractModel {
	@DatabaseField(generatedId = true)
	int id;
	public AbstractModel() {
	}
}
