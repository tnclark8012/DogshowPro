package dev.tnclark8012.dogshow;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@SuppressWarnings("serial")
public class DogshowServerServlet extends HttpServlet {
	private static final Logger log = Logger.getLogger(DogshowServerServlet.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		
		Date now = new Date(2013, 1, 2);
		Key key = KeyFactory.createKey("Show", "My Show");
		Entity showDay = new Entity("ShowDay", key);
		showDay.setProperty("date", now);
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		datastore.put(showDay);
		
		Query query = new Query("ShowDay", key).addSort("date", Query.SortDirection.DESCENDING);
		List<Entity> days = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(5));
		log.info("retrieved " + days.size() + " show days" );
		resp.setContentType("application/json");
		JSONObject json = new JSONObject();
		try {
			json.put("key", "value");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.getWriter().println(json);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
