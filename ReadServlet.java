package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.ReadQuery;

/**
 * Servlet implementation class ReadServlet
 */
@WebServlet(
		description = "Controller for reading the books table", 
		urlPatterns = { 
				"/ReadServlet", 
				"/read"
		})
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create a ReadQuery helper object
		ReadQuery rq = new ReadQuery("sportChirp", "root", "bgossett123");
		ReadQuery rqR = new ReadQuery("sportChirp", "root", "bgossett123");
		
		// Get the html table from the REadQuery object
		rq.doRead();
		String table = rq.getCoachHTMLTable();
		rqR.coachProfileJoin();
		String tableR = rq.getCoachReviewHTMLTable();
		
		// pass execution control to read.jsp along with the table
		request.setAttribute("table", table);
		request.setAttribute("tableR", tableR);
		String url = "/read.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
