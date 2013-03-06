package dev.tclark.dogshow.android.model;

import com.j256.ormlite.field.DatabaseField;

public abstract class AbstractModel {
	@DatabaseField(generatedId = true)
	int id;
	public AbstractModel() {
	}
}
