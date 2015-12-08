package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

import model.Coach;
import model.Organization;
import model.Review;
import model.Team;

public class ReadQuery {
	
	
	private Connection connection;
	private ResultSet results;
	NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
	
	public ReadQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		// set up the driver
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
	//public void doReadCoach(){
	//	String query = "select * from coach where coachID = whatever was selected"
		
//	}
	
	public void coachProfileJoin(){
		String query = "select reviewID, content, sport from review where review.coach_coachID = ?";
		
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setInt(1, this.coachID);
			
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doRead(){
		String query = "select * from coach";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doReadTeam(){
		String query = "select teamID, teamName, gender, ageRange, sport_sportID, level, division, address, city, state, zip, region, country, phone, email, website from team";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doReadOrg(){
		String query = "select * from org"; 
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getCoachHTMLTable(){
		String table ="";
		table += "<table border=1>";
		try {
			while(this.results.next()){
				Coach coach = new Coach();
				coach.setCoachID(this.results.getInt("coachID"));
				coach.setCoachFName(this.results.getString("coachFName"));
				coach.setCoachLName(this.results.getString("coachLName"));
				
				
				
				table +="<tr>";
				table +="<td>";
				table += "<a href = CoachProfileServlet?coachID=" + coach.getCoachID() + ">";
				table +=  coach.getCoachID();
				table += "</a>";
				table +="</td>";
				table +="<td>";
				table += coach.getCoachFName();
				table +="</td>";
				table +="<td>";
				table += coach.getCoachLName(); 
				table +="</td>";
				table +="<td class='edit'>";
			   table += "<a href=update?coachID=" + coach.getCoachID() + ">update</a>";
				table +="</td>";
				table += "<td class='edit'>";
				table += "<a href=delete?coachID=" + coach.getCoachID() + ">delete</a>";
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table += "</table>";
		return table;
	}
	public String getCoachReviewHTMLTable(){
		String table ="";
		table += "<table border=1>";
		try {
			while(this.results.next()){
				Review review = new Review();
				review.setReviewID(this.results.getInt("reviewID"));
				review.setContent(this.results.getString("content"));
				review.setSport(this.results.getString("sport"));
				review.setCoachID(this.results.getInt("coachID"));
				
				
				
				table +="<tr>";
				table +="<td>";
				table += "<a href = coachProfile.jsp>";
				table +=  review.getReviewID();
				table += "</a>";
				table +="</td>";
				table +="<td>";
				table += review.getContent();
				table +="</td>";
				table +="<td>";
				table += review.getSport(); 
				table +="</td>";
//				table +="<td class='edit'>";
//			   table += "<a href=update?coachID=" + coach.getCoachID() + ">update</a>";
//				table +="</td>";
//				table += "<td class='edit'>";
//				table += "<a href=delete?coachID=" + coach.getCoachID() + ">delete</a>";
//				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table += "</table>";
		return table;
	}
	
	public String getTeamHTMLTable(){
		String table ="";
		table += "<table border=1>";
		try {
			while(this.results.next()){
				Team team = new Team();
				team.setTeamID(this.results.getInt("teamID"));
				team.setTeamName(this.results.getString("teamName"));
				team.setGender(this.results.getString("gender"));
				team.setAgeRange(this.results.getString("ageRange"));
				team.setSportID(this.results.getInt("sport_sportID"));
				team.setLevel(this.results.getString("level"));
				team.setDivision(this.results.getString("division"));
				team.setAddress(this.results.getString("address"));
				team.setCity(this.results.getString("city"));
				team.setState(this.results.getString("state"));
				team.setZip(this.results.getInt("zip"));
				team.setRegion(this.results.getString("region"));
				team.setCountry(this.results.getString("country"));
				team.setPhone(this.results.getString("phone"));
				team.setEmail(this.results.getString("email"));
				team.setWebsite(this.results.getString("website"));
				
				
				
				table +="<tr>";
				table +="<td>";
				table += "<a href = teamProfile.jsp>";
				table +=  team.getTeamID();
				table += "</a>";
				table +="</td>";
				table +="<td>";
				table += team.getTeamName();
				table +="</td>";
				table +="<td>";
				table += team.getGender(); 
				table +="</td>";
				table +="<td>";
				table += team.getAgeRange(); 
				table +="</td>";
				table +="<td>";
				table += team.getSportID(); 
				table +="</td>";
				table +="<td>";
				table += team.getLevel(); 
				table +="</td>";
				table +="<td>";
				table += team.getDivision(); 
				table +="</td>";
				table +="<td>";
				table += team.getAddress(); 
				table +="</td>";
				table +="<td>";
				table += team.getCity(); 
				table +="</td>";
				table +="<td>";
				table += team.getState(); 
				table +="</td>";
				table +="<td>";
				table += team.getZip(); 
				table +="</td>";
				table +="<td>";
				table += team.getRegion(); 
				table +="</td>";
				table +="<td>";
				table += team.getCountry(); 
				table +="</td>";
				table +="<td>";
				table += team.getPhone(); 
				table +="</td>";
				table +="<td>";
				table += team.getEmail(); 
				table +="</td>";
				table +="<td>";
				table += team.getWebsite(); 
				table +="</td>";
//				table +="<td class='edit'>";
//			   table += "<a href=update?coachID=" + coach.getCoachID() + ">update</a>";
//				table +="</td>";
//				table += "<td class='edit'>";
//				table += "<a href=delete?coachID=" + coach.getCoachID() + ">delete</a>";
//				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table += "</table>";
		return table;
	
	

}
	
	public String getOrgHTMLTable(){
		String table ="";
		table += "<table border=1>";
		try {
			while(this.results.next()){
				Organization org = new Organization();
				org.setOrgID(this.results.getInt("orgID"));
				org.setOrgAddress(this.results.getString("orgAddress"));
				org.setOrgCity(this.results.getString("orgCity"));
				org.setOrgState(this.results.getString("orgState"));
				org.setOrgZip(this.results.getInt("orgZip"));
				org.setOrgRegion(this.results.getString("orgRegion"));
				org.setOrgCountry(this.results.getString("orgCountry"));
				org.setOrgPhone(this.results.getString("orgPhone"));
				org.setWebURL(this.results.getString("webURL"));
				org.setAdmissionsURL(this.results.getString("admissionsURL"));
				org.setOrgName(this.results.getString("orgName"));
				
				table +="<tr>";
				table +="<td>";
				table += "<a href = orgProfile.jsp>";
				table +=  org.getOrgID();
				table += "</a>";
				table +="</td>";
				table +="<td>";
				table += org.getOrgAddress();
				table +="</td>";
				table +="<td>";
				table += org.getOrgCity(); 
				table +="</td>";
				table +="<td>";
				table += org.getOrgState(); 
				table +="</td>";
				table +="<td>";
				table += org.getOrgZip(); 
				table +="</td>";
				table +="<td>";
				table += org.getOrgRegion(); 
				table +="</td>";
				table +="<td>";
				table += org.getOrgCountry(); 
				table +="</td>";
				table +="<td>";
				table += org.getOrgPhone(); 
				table +="</td>";
				table +="<td>";
				table += org.getWebURL(); 
				table +="</td>";
				table +="<td>";
				table += org.getAdmissionsURL(); 
				table +="</td>";
				table +="<td>";
				table += org.getOrgName(); 
				table +="</td>";
				
//				table +="<td class='edit'>";
//			   table += "<a href=update?coachID=" + coach.getCoachID() + ">update</a>";
//				table +="</td>";
//				table += "<td class='edit'>";
//				table += "<a href=delete?coachID=" + coach.getCoachID() + ">delete</a>";
//				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table += "</table>";
		return table;
	
	

}
}
