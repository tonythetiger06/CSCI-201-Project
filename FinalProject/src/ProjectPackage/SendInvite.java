package ProjectPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

/**
 * Servlet implementation class SendInvite
 */
@WebServlet("/SendInvite")
public class SendInvite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			HttpSession session = request.getSession(false);
			String currUser = request.getParameter("currUser");
			String loggedInUser = request.getParameter("loggedInUser");

			Gson gson = (Gson)session.getAttribute("gson");
			String file = (String)session.getAttribute("file");
			List<User> users = (List<User>)session.getAttribute("users");
			Database database = (Database)session.getAttribute("database");
			User u = users.get(database.indexOfUser(loggedInUser));
			
			String pageToForward = "/PhaserGame/index.html";
			String gameID = u.getCurrGame();
			
			for(int i=0; i<users.size(); i++) {
				if(users.get(i).getUsername().equals(currUser)) {
					users.get(i).addInvite(gameID);
				}
			}
						
			FileWriter fw;
			String jsonString = gson.toJson(database);
			try {
				fw = new FileWriter(file);
				fw.write(jsonString);
				//System.out.println(jsonString);
				fw.flush();
				fw.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dispatch = getServletContext().getRequestDispatcher(pageToForward);
			dispatch.forward(request, response);
	}

}
