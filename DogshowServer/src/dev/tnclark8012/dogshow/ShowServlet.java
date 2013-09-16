package dev.tnclark8012.dogshow;

import java.util.Arrays;
import java.util.Calendar;
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

import dev.tnclark8012.dogshow.persistence.datastore.Location;
import dev.tnclark8012.dogshow.persistence.datastore.Show;
import dev.tnclark8012.dogshow.persistence.datastore.managers.ShowManager;
import dev.tnclark8012.dogshow.util.Utils;

@Path("shows")
public class ShowServlet {
	private static final long serialVersionUID = -9014811090548638110L;
	private static final Logger log = Logger.getLogger(ShowServlet.class.getName());

	@POST
	@Path("jsontest")
	public String testJson(@FormParam("json") JSONObject json) {
		try {
			if (json == null)
				return null;
			System.out.println(json);
			System.out.println(json.getJSONArray("clubs").get(0));
			
			return json.toString();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			return null;
		}
	}

	@GET
	@Produces("application/json")
	@Path("createShow/{id}")
	public Response createDummyShow(@PathParam("id") String showId) {
		String response = "Called create for id " + showId;
		System.out.println(response);
		Calendar date = Utils.getCalendar();
		date.set(2013, 5, 20);
		response += ". Setting date to " + date + ". In millis is: " + date.getTimeInMillis();
		ShowManager.createShow(new Show("Cambridge, Minnesota Kennel Club", date.getTimeInMillis(), "Cambridge", "MN", showId));
		return Response.ok(response).build();
	}

	@GET
	@Produces("application/json")
	public List<Show> getAllShows() {
		return ShowManager.getAllShows();
	}

	@POST
	@Path("/create")
	@Produces("application/json")
	public Response postShowDetails(@FormParam("code") String code, @FormParam("dates") JSONArray datesJson, @FormParam("clubs") JSONArray clubsJson, @FormParam("locations") JSONArray locationJson, @FormParam("show") JSONObject json) throws JSONException {
		long[] dates = new long[datesJson.length()];
		for(int i = 0; i < dates.length; i++ )
		{
			dates[i] = datesJson.getLong(i);
		}
		Arrays.sort(dates);
		
		String [] clubs = new String[clubsJson.length()];
		for(int i = 0; i < clubs.length; i++)
		{
			clubs[i] = clubsJson.getString(i);
		}
		
		Location[] locations = new Location[locationJson.length()];
		JSONObject ljson;
		for( int i = 0; i < locations.length; i++)
		{
			ljson = locationJson.getJSONObject(i);
			locations[i] = new Location(ljson.getString("city"), ljson.getString("state"), 0, 0 );
		}
		Show s = new Show(code, clubs, dates, locations);
		ShowManager.createShow(s);
		return Response.ok(s).build();
		//long dateMillis = Long.parseLong(dateStr);
//		System.out.println("Creating show...");
//		ShowManager.createShow(new Show(code, dateMillis, city, state, showId));
//		return Response.ok(code).build();
	}

	@GET
	@Produces("application/json")
	@Path("state/{state}")
	public List<dev.tnclark8012.dogshow.persistence.datastore.Show> getShowsByState(@PathParam("state") String state) {
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
