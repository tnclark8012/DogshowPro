package dev.tclark.dogshow;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import dev.tclark.dogshow.models.show.Show;
import dev.tclark.dogshow.models.show.ShowDay;
import dev.tclark.dogshow.models.show.ShowRing;
@Path("/")
public class ShowServlet {
		private static final long serialVersionUID = -9014811090548638110L;
		private static final Logger log = Logger.getLogger(ShowServlet.class
				.getName());
		@GET
		@Produces("application/json")
		public ShowDay sayHello()
		{
			ShowDay day = new ShowDay();
			day.addShowRing(new ShowRing());
			day.addShowRing(new ShowRing());
			day.addShowRing(new ShowRing());			
			return day;
		}
//
//		@Override
//		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//				throws ServletException, IOException {
//			log.entering(getClass().getSimpleName(), "doGet");
//			JSONObject json = new JSONObject();
//			UserService userService = UserServiceFactory.getUserService();
//			User user = userService.getCurrentUser();
//			if (user == null) {
//				log.info("User was null. Creating after redirect");
//				resp.getWriter().println("<p>Please <a href=\"" +
//	                    userService.createLoginURL(req.getRequestURI()) +
//	                    "\">sign in</a>.</p>");
//			} else {
//				File dummyJson = new File("WEB-INF/dummy-json/trin1jp.json");
//				BufferedReader reader = new BufferedReader(new FileReader(dummyJson));
//				String jsonString = reader.readLine();
//				reader.close();
//				try {
//					json = new JSONObject(jsonString);
//					
//				} catch (JSONException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				resp.getWriter().println(json);
//			}
//		}
}
