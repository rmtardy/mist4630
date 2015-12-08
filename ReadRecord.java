package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Coach;
import model.Review;

public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Coach coach = new Coach();
	private int coachID;
	
	
	public ReadRecord(String dbName, String uname, String pwd, int coachID){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.coachID = coachID;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doRead(){
		String query = "select * from coach where coachID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, this.coachID);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			coach.setCoachID(this.results.getInt("coachID"));
			coach.setCoachFName(this.results.getString("coachFName"));
			coach.setCoachLName(this.results.getString("coachLName"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Coach getCoach(){
		return this.coach;
	}
	
	public void coachProfileJoin(){
		String query = "select reviewID, content, sport, coachLName from review,coach where review.coach_coachID = ? and coach.coachID = ?";
		
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setInt(1, this.coachID);
			ps.setInt(2, this.coachID);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getCoachReviewHTMLTable(){
		String tableR ="";
		try {
		this.results.next();
		tableR += "Coach:" + this.results.getString("coachLName");
		tableR += "<table border=1>";
		do{
				Review review = new Review();
				review.setReviewID(this.results.getInt("reviewID"));
				review.setContent(this.results.getString("content"));
				review.setSport(this.results.getString("sport"));
				
				
				
				tableR +="<tr>";
				tableR +="<td>";
				tableR += "<a href = coachProfile.jsp>";
				tableR +=  review.getReviewID();
				tableR += "</a>";
				tableR +="</td>";
				tableR +="<td>";
				tableR += review.getContent();
				tableR +="</td>";
				tableR +="<td>";
				tableR += review.getSport(); 
				tableR +="</td>";
//				table +="<td class='edit'>";
//			   table += "<a href=update?coachID=" + coach.getCoachID() + ">update</a>";
//				table +="</td>";
//				table += "<td class='edit'>";
//				table += "<a href=delete?coachID=" + coach.getCoachID() + ">delete</a>";
//				table +="</td>";
				tableR +="</tr>";
				
			} while (results.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tableR += "</table>";
		return tableR;
	}
	
	public String getTeamReviewHTMLTable(){
		String tableR ="";
		try {
		this.results.next();
		//tableR += "Coach:" + this.results.getString("coachLName");
		tableR += "<table border=1>";
		do{
				Review review = new Review();
				review.setReviewID(this.results.getInt("reviewID"));
				review.setContent(this.results.getString("content"));
				review.setSport(this.results.getString("sport"));
				
				
				
				tableR +="<tr>";
				tableR +="<td>";
				tableR += "<a href = coachProfile.jsp>";
				tableR +=  review.getReviewID();
				tableR += "</a>";
				tableR +="</td>";
				tableR +="<td>";
				tableR += review.getContent();
				tableR +="</td>";
				tableR +="<td>";
				tableR += review.getSport(); 
				tableR +="</td>";
//				table +="<td class='edit'>";
//			   table += "<a href=update?coachID=" + coach.getCoachID() + ">update</a>";
//				table +="</td>";
//				table += "<td class='edit'>";
//				table += "<a href=delete?coachID=" + coach.getCoachID() + ">delete</a>";
//				table +="</td>";
				tableR +="</tr>";
				
			} while (results.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tableR += "</table>";
		return tableR;
	}
	

}
