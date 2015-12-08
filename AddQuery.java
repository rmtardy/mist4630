package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Coach;
import model.Organization;
import model.Player;
import model.Review;
import model.Team;

public class AddQuery {
	
	public Connection connection;
	
	public AddQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
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
	
	public void doAddCoach(Coach coach){
		String query = "insert into coach (coachID, coachFName, coachLName) values (?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, coach.getCoachID());
			ps.setString(2, coach.getCoachFName());
			ps.setString(3, coach.getCoachLName());
			
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doAddPlayer(Player player){
		String query = "insert into player (playerFName, playerLName, playerID) values (?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, player.getPlayerFName());
			ps.setString(2, player.getPlayerLName());
			ps.setInt(3, player.getPlayerID());
			
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doAddTeam(Team team){
		String query = "insert into team (teamName, teamID, gender, ageRange, level, address, city, state, zip, region, country, phone, email, website) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, team.getTeamName());
			ps.setInt(2, team.getTeamID());
			ps.setString(3, team.getGender());
			ps.setString(4, team.getAgeRange());
			ps.setString(5, team.getLevel());
			ps.setString(6, team.getAddress());
			ps.setString(7, team.getCity());
			ps.setString(8, team.getState());
			ps.setInt(9, team.getZip());
			ps.setString(10, team.getRegion());
			ps.setString(11, team.getCountry());
			ps.setString(12, team.getPhone());
			ps.setString(13, team.getEmail());
			ps.setString(14, team.getWebsite());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void doAddOrg(Organization org){
		String query = "insert into org (orgID, orgAddress, orgCity, orgState, orgZip, orgRegion, orgCountry, orgPhone, webURL, admissionsURL, orgName) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, org.getOrgID());
			ps.setString(2, org.getOrgAddress());
			ps.setString(3, org.getOrgCity());
			ps.setString(4, org.getOrgState());
			ps.setInt(5, org.getOrgZip());
			ps.setString(6, org.getOrgRegion());
			ps.setString(7, org.getOrgCountry());
			ps.setString(8, org.getOrgPhone());
			ps.setString(9, org.getWebURL());
			ps.setString(10, org.getAdmissionsURL());
			ps.setString(11, org.getOrgName());
			
			
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAddCoachReview (Review review){
		String query = "insert into review (reviewID, content, sport, coach_coachID) values (?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, review.getReviewID());
			ps.setString(2, review.getContent());
			ps.setString(3, review.getSport());
			ps.setInt(4, review.getCoachID());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
