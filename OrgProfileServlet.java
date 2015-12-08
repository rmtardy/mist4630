package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import dbHelpers.ReadQuery;
import dbHelpers.ReadRecord;

/**
 * Servlet implementation class OrgProfileServlet
 */
@WebServlet("/OrgProfileServlet")
public class OrgProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrgProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get the parameter 
		int orgID = Integer.parseInt(request.getParameter("orgID")); 
		
		//set up an readQuery object
		ReadRecord rq = new ReadRecord("sportChirp", "root", "bgossett123", orgID);
		
		rq.orgProfileJoin();
		String table = rq.getOrgReviewHTMLTable();
		
		//pass execution
		request.setAttribute("table", table);
		String url = "/orgProfile.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request,response);
	}

}
