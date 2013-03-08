package dev.tclark.dogshow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
	public class ShowServlet extends HttpServlet {
		private static final long serialVersionUID = -9014811090548638110L;
		private static final Logger log = Logger.getLogger(ShowServlet.class
				.getName());

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			log.entering(getClass().getSimpleName(), "doGet");
			JSONObject json = new JSONObject();
			UserService userService = UserServiceFactory.getUserService();
			User user = userService.getCurrentUser();
			if (user == null) {
				log.info("User was null. Creating after redirect");
				resp.getWriter().println("<p>Please <a href=\"" +
	                    userService.createLoginURL(req.getRequestURI()) +
	                    "\">sign in</a>.</p>");
			} else {
				File dummyJson = new File("WEB-INF/dummy-json/trin1jp.json");
				BufferedReader reader = new BufferedReader(new FileReader(dummyJson));
				String jsonString = reader.readLine();
				reader.close();
				try {
					json = new JSONObject(jsonString);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				resp.getWriter().println(json);
			}
		}
}
