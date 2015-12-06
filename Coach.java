
package model;

public class Coach {

	public int coachID;
	public String coachFName;
	public String coachLName;
	
	
	public Coach(){
		
		this.coachID = 1;
		this.coachFName = "No First Name";
		this.coachLName = "No Last Name";
	
}

	public Coach(int coachID, String coachFName, String coachLName) {
		this.coachID = coachID;
		this.coachFName = coachFName;
		this.coachLName = coachLName;
	}

	public int getCoachID() {
		return coachID;
	}


	public void setCoachID(int coachID) {
		this.coachID = coachID;
	}


	public String getCoachFName() {
		return coachFName;
	}


	public void setCoachFName(String coachFName) {
		this.coachFName = coachFName;
	}


	public String getCoachLName() {
		return coachLName;
	}


	public void setCoachLName(String coachLName) {
		this.coachLName = coachLName;
	}
