/**
 * 
 */
package model;

/**
 * @author Parker T
 *
 */
public class Team {

	private int teamID;
	private String teamName;
	private String gender;
	private String ageRange;
	private String level;
	private String division;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String region;
	private String country;
	private String phone;
	private String email;
	private String website;
	

	
	public Team(){
		this.teamID = 1;
		this.teamName = "No Team";
		this.gender="No Gender";
		this.ageRange = "No Specified Range";
		this.level = "No Level";
		this.division = "No Division";
		this.address = "No Address";
		this.city = "No City";
		this.state = "No State";
		this.zip = 00000;
		this.region = "No Region";
		this.country = "No Country";
		this.phone = "No Phone";
		this.email = "No Email";
		this.website = "No Website";	
	}
	
	public Team (int teamID, String teamName, String gender, String ageRange, 
			String level,String division, String address, String city, String state, int zip, String region, String country, String phone, String email, String website) {
		this.teamID = teamID;
		this.teamName = teamName;
		this.gender= gender;
		this.ageRange = ageRange;
		this.level = level;
		this.division = division;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.region = region;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.website = website;
	}



	public int getTeamID() {
		return teamID;
	}



	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAgeRange() {
		return ageRange;
	}



	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}



	public String getLevel() {
		return level;
	}



	public void setLevel(String level) {
		this.level = level;
	}
	
		public String getDivision() {
		return division;
	}



	public void setDivision(String division) {
		this.division = division;
	}




	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public int getZip() {
		return zip;
	}



	public void setZip(int zip) {
		this.zip = zip;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}
}
