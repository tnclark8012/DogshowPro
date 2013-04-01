package dev.tclark.dogshow;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import dev.tclark.dogshow.models.show.Show;
import dev.tclark.dogshow.models.show.ShowDay;
import dev.tclark.dogshow.models.show.ShowRing;
import dev.tclark.dogshow.persistence.datastore.accessors.ShowAccessor;

@Path("shows")
public class ShowServlet {
	private static final long serialVersionUID = -9014811090548638110L;
	private static final Logger log = Logger.getLogger(ShowServlet.class
			.getName());

	@GET
	@Produces("application/json")
	@Path("{id}")
	public ShowDay getShowsById(@PathParam("id") long id) {
		ShowDay day = new ShowDay();
		day.addShowRing(new ShowRing());
		day.addShowRing(new ShowRing());
		day.addShowRing(new ShowRing());
		return day;
	}

	@GET
	@Produces("application/json")
	public List<dev.tclark.dogshow.persistence.datastore.Show> getAllShows() {
		return ShowAccessor.getAllShows();
	}

	@POST
	@Path("test")
	public Response postShowDetails(@FormParam("name") String name,
			@FormParam("date") String date, @FormParam("city") String city,
			@FormParam("state") String state) {
		long dateMillis = Long.parseLong(date);
		System.out.println("Creating show...");
		ShowAccessor
				.createShow(new dev.tclark.dogshow.persistence.datastore.Show(
						name, dateMillis, city, state, null));
		return Response.ok(name).build();
	}

	@GET
	@Produces("application/json")
	@Path("state/{state}")
	public List<dev.tclark.dogshow.persistence.datastore.Show> getShowsByState(
			@PathParam("state") String state) {
		return ShowAccessor.getShowsByState(state);
	}

	@GET
	@Path("delete/yes/really")
	public String delete() {
		ShowAccessor.deleteAllShows(true, true, true, true, true);
		return "I hope you meant to do that";
	}

	@POST
	public String test() {
		return "Success";
	}
	//
	// @Override
	// protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	// throws ServletException, IOException {
	// log.entering(getClass().getSimpleName(), "doGet");
	// JSONObject json = new JSONObject();
	// UserService userService = UserServiceFactory.getUserService();
	// User user = userService.getCurrentUser();
	// if (user == null) {
	// log.info("User was null. Creating after redirect");
	// resp.getWriter().println("<p>Please <a href=\"" +
	// userService.createLoginURL(req.getRequestURI()) +
	// "\">sign in</a>.</p>");
	// } else {
	// File dummyJson = new File("WEB-INF/dummy-json/trin1jp.json");
	// BufferedReader reader = new BufferedReader(new FileReader(dummyJson));
	// String jsonString = reader.readLine();
	// reader.close();
	// try {
	// json = new JSONObject(jsonString);
	//
	// } catch (JSONException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// resp.getWriter().println(json);
	// }
	// }
}
