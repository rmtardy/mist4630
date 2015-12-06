package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Coach;

public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Coach coach = new Coach();
	private String coachID;
	
	public ReadRecord(String dbName, String uname, String pwd, String coachID){
		
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
		String query = "select * from products where SKU = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.coachID);
			
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
	
	

}
