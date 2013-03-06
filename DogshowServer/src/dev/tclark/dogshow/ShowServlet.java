package dev.tclark.dogshow;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tclark.dogshow.models.client.Handler;
import dev.tclark.dogshow.persistence.HandlerAccessor;
	public class ShowServlet extends HttpServlet {
		private static final long serialVersionUID = -9014811090548638110L;
		private static final Logger log = Logger.getLogger(ShowServlet.class
				.getName());

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			JSONObject json = new JSONObject();
			UserService userService = UserServiceFactory.getUserService();
			User user = userService.getCurrentUser();
			if (user == null) {
				log.info("User was null. Creating after redirect");
				resp.getWriter().println("<p>Please <a href=\"" +
	                    userService.createLoginURL(req.getRequestURI()) +
	                    "\">sign in</a>.</p>");
			} else {
				String name = req.getParameter("name");
				Handler handler = HandlerAccessor.getHandler(user);
				
//				PersistenceManager pm = PMF.get().getPersistenceManager();
				
//				Query query = pm.newQuery(Handler.class);
//				query.setFilter("key == keyParam");
//				query.declareParameters(Key.class.getName() + " keyParam");
//				
//				List<Handler> handlers = (List<Handler>)query.execute(k);
				if( handler == null )
				{
					log.info("New handler, " + name + "! Adding to DB");
					HandlerAccessor.createHandler(user, name);
//					handler = new Handler(k, name);
//					pm.makePersistent(handler);
					resp.getWriter().println("New");
				}
				else
				{	
					log.info("Returning handler: " + handler.getName()  );
					resp.getWriter().println("<p>Returning. Please <a href=\"" +
		                    userService.createLogoutURL(req.getRequestURI()) +
		                    "\">log out</a>.</p>");
				}
				
			}
		}
}
