package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Review;

/**
 * Servlet implementation class ReviewOrgServlet
 */
@WebServlet("/ReviewOrgServlet")
public class ReviewOrgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewOrgServlet() {
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
		AddQuery aq = new AddQuery("sportChirp", "root", "bgossett123");
		
		int reviewID = Integer.parseInt(request.getParameter("reviewID"));
		String content = request.getParameter("content");
		String sport = request.getParameter("sport");
		int orgID = Integer.parseInt(request.getParameter("orgID"));
		
		
		
		Review review = new Review();
		review.setReviewID(reviewID);
		review.setContent(content);
		review.setSport(sport);
		review.setOrgID(orgID);
		
		
		aq.doAddOrgReview(review);
		
		//pass execution control to the ReadServlet
		String url = "/reviewAdded.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
