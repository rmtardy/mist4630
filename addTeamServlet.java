package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Team;

/**
 * Servlet implementation class AddCoachServlet
 */
@WebServlet("/AddTeamServlet")
public class AddTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeamServlet() {
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
		int teamID = Integer.parseInt(request.getParameter("teamID"));
		String teamName = request.getParameter("teamName");
		String gender = request.getParameter("gender");
		String ageRange = request.getParameter("ageRange");
		String level = request.getParameter("level");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zip = Integer.parseInt(request.getParameter("zip"));
		String region = request.getParameter("region");
		String country = request.getParameter("country");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String website = request.getParameter("website");
		
		
		Team team = new Team();
		team.setTeamID(teamID);
		team.setTeamName(teamName);
		team.setGender(gender);
		team.setAgeRange(ageRange);
		team.setLevel(level);
		team.setAddress(address);
		team.setCity(city);
		team.setState(state);
		team.setZip(zip);
		team.setRegion(region);
		team.setCountry(country);
		team.setPhone(phone);
		team.setEmail(email);
		team.setWebsite(website);
		
		//set up an addQuery object
		AddQuery aq = new AddQuery("sportChirp", "root", "");
		
		//pass the coach to addQuery to add to the database
		aq.doAddTeam(team);
		
		//pass execution control to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
