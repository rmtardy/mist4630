package model;

public class Organization {
	
	private int orgID;
	private String orgAddress;
	private String orgCity;
	private String orgZip;
	private String orgRegion;
	private String orgCountry;
	private String orgPhone;
	private String webURL;
	private String admissionsURL;
	private String orgName;
	
	public Organization(){
		this.orgID=1;
		this.orgAddress= "No Address"; 
		this.orgCity = "No City";
		this.orgZip= "No Zip"; 
		this.orgRegion= "No Region";
		this.orgCountry= "No Country"; 
		this.orgPhone= "No Phone";
		this.webURL= "No URL"; 
		this.admissionsURL= "No Admissions URL"; 
		this.orgName= "No Name"; 
		
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

	public String getOrgZip() {
		return orgZip;
	}

	public void setOrgZip(String orgZip) {
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

}
