package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserHelper {
	
	private PreparedStatement authenticateUserStatement;


	public UserHelper(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("sportChirp", "root", "bgosset123");
		
		authenticateUserStatement = conn.prepareStatement("select * from user whereusername=? and password=?");
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName()+ ": " + e.getMessage());
		}
	}
	public User authenticateUser (String username, String password){
		User user = null;
		try{
			authenticateUserStatement.setString(1, username);
			authenticateUserStatement.setString(2, password);
			ResultSet rs = authenticateUserStatement.executeQuery();
			
			if (rs.next()){
				user = new User (rs.getInt("userID"), rs.getString("username"), rs.getString("password"));
			}
		} catch (SQLException e) {
			System.out.println(e.getClass().getName()+ ": " + e.getMessage());
		}
		return user;
	}
	
	


}
