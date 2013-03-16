package dev.tclark.dogshow.models.show;

import java.util.Random;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.googlecode.objectify.Key;

@XmlRootElement(name="Ring")
public class ShowRing {
	@Id
	private Long id;
	@XmlElement
	private int number;

	private Key<ShowDay> day;

	public ShowRing() {
		this.number = (new Random().nextInt(13) + 1);
	}

	public void setShowDay(ShowDay day) {
		
		//this.day = new Key<ShowDay>(ShowDay.class, day.getId().longValue());
	}
}
