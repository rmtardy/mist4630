package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCoachServlet
 */
@WebServlet("/AddCoachServlet")
public class AddCoachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCoachServlet() {
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
        // get the data 
		String coachFName = request.getParameter(coachFName);
		String coachLName = request.getParameter(coachLName);
		String coachID = request.getParameter(coachID);
		String sportID = request.getParameter(sportID);
		String content = request.getParameter(content);
		
		Coach coach = new Coach();
		coach.setCoachFName(coachFName); 
		coach.setCoachLName(coachLName);
		
		//set up an addQuery object
		AddQuery aq = new AddQuery("sportChirp", "root", "");
		
		//pass the coach to addQuery to add to the database
		aq.doAdd(coach);
		
		//pass execution control to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
