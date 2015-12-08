package model;

public class Organization {
	
	private int orgID;
	private String orgAddress;
	private String orgCity;
	private int orgZip;
	private String orgRegion;
	private String orgCountry;
	private String orgPhone;
	private String webURL;
	private String admissionsURL;
	private String orgName;
	private String orgState; 
	
	public Organization(){
		this.orgID=1;
		this.orgAddress= "No Address"; 
		this.orgCity = "No City";
		this.orgState= "No State";
		this.orgZip= 00000; 
		this.orgRegion= "No Region";
		this.orgCountry= "No Country"; 
		this.orgPhone= "No Phone";
		this.webURL= "No URL"; 
		this.admissionsURL= "No Admissions URL"; 
		this.orgName= "No Name"; 
		
	}
	public Organization(int orgID, String orgAddress, String orgCity, String orgState, int orgZip, String orgRegion, String orgCountry, String orgPhone, String webURL, String admissionsURL, String orgName) {
		this.orgID= orgID;
		this.orgAddress=  orgAddress;
		this.orgCity = orgCity;
		this.orgState = orgState;
		this.orgZip= orgZip; 
		this.orgRegion= orgRegion;
		this.orgCountry= orgCountry; 
		this.orgPhone= orgPhone;
		this.webURL= webURL; 
		this.admissionsURL= admissionsURL; 
		this.orgName= orgName;
		 
	}
	public int getOrgID() {
		return orgID;
	}

	public void setOrgID(int orgID) {
		this.orgID = orgID;
	}

	public String getOrgAddress() {
		return orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getOrgCity() {
		return orgCity;
	}

	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	public int getOrgZip() {
		return orgZip;
	}

	public void setOrgZip(int orgZip) {
		this.orgZip = orgZip;
	}

	public String getOrgRegion() {
		return orgRegion;
	}

	public void setOrgRegion(String orgRegion) {
		this.orgRegion = orgRegion;
	}

	public String getOrgCountry() {
		return orgCountry;
	}

	public void setOrgCountry(String orgCountry) {
		this.orgCountry = orgCountry;
	}

	public String getOrgPhone() {
		return orgPhone;
	}

	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}

	public String getWebURL() {
		return webURL;
	}

	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}

	public String getAdmissionsURL() {
		return admissionsURL;
	}

	public void setAdmissionsURL(String admissionsURL) {
		this.admissionsURL = admissionsURL;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgState(){
		return orgState; 
	}
	
	public void setOrgState(String orgState){
		this.orgState = orgState; 
	}

}
