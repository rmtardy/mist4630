package model;

public class Player {
	
	public int playerID;
	public String playerFName;
	public String playerLName;
	
	
	public Player(){
		
		this.playerID = 1;
		this.playerFName = "No First Name";
		this.playerLName = "No Last Name";
	}
	public Player(int playerID, String playerFName, String playerLName) {
		this.playerID = playerID;
		this.playerFName = playerFName;
		this.playerLName = playerLName;
	}
	
	public int getPlayerID() {
		return playerID;
	}


	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}


	public String getPlayerFName() {
		return playerFName;
	}


	public void setPlayerFName(String playerFName) {
		this.playerFName = playerFName;
	}


	public String getPlayerLName() {
		return playerLName;
	}


	public void setPlayerLName(String playerLName) {
		this.playerLName = playerLName;
	}
}
