package dev.tclark.dogshow;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.appengine.labs.repackaged.org.json.JSONArray;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tclark.dogshow.models.show.ShowDay;
import dev.tclark.dogshow.persistence.datastore.Show;
import dev.tclark.dogshow.persistence.datastore.ShowRing;
import dev.tclark.dogshow.persistence.datastore.managers.ShowManager;
import dev.tclark.dogshow.persistence.datastore.managers.ShowRingManager;
import dev.tclark.dogshow.util.Utils;

@Path("shows")
public class ShowServlet {
	private static final long serialVersionUID = -9014811090548638110L;
	private static final Logger log = Logger.getLogger(ShowServlet.class.getName());

	@GET
	@Produces("application/json")
	@Path("{id}")
	public ShowDay getShowsById(@PathParam("id") long id) {
		ShowDay day = new ShowDay();
		return day;
	}

	@GET
	@Produces("application/json")
	@Path("createShow/{id}")
	public Response createDummyShow(@PathParam("id") String showId) {
		String response = "Called create for id " + showId;
		System.out.println(response);
		Calendar date = Utils.getCalendar();
		date.set(2013, 5, 7);
		response += ". Setting date to " + date + ". In millis is: " + date.getTimeInMillis();
		ShowManager.createShow(new Show("Lake Minnetonka Kennel Club", date.getTimeInMillis(), "Jordan", "MN", showId));
		return Response.ok(response).build();
	}

	@GET
	@Produces("application/json")
	public List<Show> getAllShows() {
		return ShowManager.getAllShows();
	}

	@GET
	@Produces("application/json")
	@Path("jsonTest")
	public String getTest() throws JSONException {
		return "Not valid request anymore";
	}

	@POST
	@Path("/create")
	public Response postShowDetails(@FormParam("name") String name, @FormParam("date") String dateStr, @FormParam("city") String city, @FormParam("state") String state, @FormParam("id") String showId, @FormParam("show") JSONObject json) {
		long dateMillis = Long.parseLong(dateStr);
		System.out.println("Creating show...");
		ShowManager.createShow(new Show(name, dateMillis, city, state, showId));
		return Response.ok(name).build();
	}

	@GET
	@Produces("application/json")
	@Path("state/{state}")
	public List<dev.tclark.dogshow.persistence.datastore.Show> getShowsByState(@PathParam("state") String state) {
		return ShowManager.getShowsByState(state);
	}

	@GET
	@Path("delete/yes/really")
	/** TODO GET request for dev purposes only. Obviously change this upon release*/
	public String delete() {
		ShowManager.deleteAllShows(true, true, true, true, true);
		return "I hope you meant to do that!";
	}
}
