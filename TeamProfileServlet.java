package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.ReadRecord;
import dbHelpers.ReadTeamRecord;

/**
 * Servlet implementation class TeamProfileServlet
 */
@WebServlet("/TeamProfileServlet")
public class TeamProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get the parameter 
		int teamID = Integer.parseInt(request.getParameter("teamID")); 
		
		
		//set up an readQuery object
		ReadTeamRecord rt = new ReadTeamRecord("sportChirp", "root", "bgossett123", teamID);
		
		rt.teamProfileJoin();
		String table = rt.getTeamReviewHTMLTable();
		
		//pass execution
		request.setAttribute("table", table);
		request.setAttribute("teamID", teamID);
		String url = "/teamProfile.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request,response);
	}

}
