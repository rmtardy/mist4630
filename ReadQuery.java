package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

import model.Coach;

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
	
	public String getHTMLTable(){
		String table ="";
		
		try {
			while(this.results.next()){
				Coach coach = new Coach();
				coach.setCoachFName(this.results.getString("coachFName"));
				coach.setCoachLName(this.results.getString("coachLName"));
				coach.setCoachID(this.results.getString("coachID"));
				
				
				table +="<tr>";
				table +="<td>";
				table += coach.getCoachID;
				table +="</td>";
				table +="<td>";
				table += coach.getCoachFName;
				table +="</td>";
				table +="<td>";
				table += coach.getCoachLName; 
				table +="</td>";
				table +="<td class='edit'>";
				   table += "<a href=update?sku=" + coach.getCoachID() + ">update</a>";
				table +="</td>";
				table += "<td class='edit'>";
					table += "<a href=delete?sku=" + coach.getCoachID() + ">delete</a>";
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return table;
	}
	
	
	

}
