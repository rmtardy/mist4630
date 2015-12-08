package model;

public class Review {
	private int reviewID;
	private String content;
	private String sport;
	private int coachID;
	
	public Review(){
		this.reviewID = 1;
		this.content = "None";
		this.sport = "None";
		this.coachID = 00;
		
	}
	public Review(int reviewID, String content, String sport, int coachID) {
		this.reviewID = reviewID;
		this.content = content;
		this.sport = sport;
		this.coachID = coachID;
	}

	public int getReviewID() {
		return reviewID;
	}

	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	/**
	 * @return the coachID
	 */
	public int getCoachID() {
		return coachID;
	}
	/**
	 * @param coachID the coachID to set
	 */
	public void setCoachID(int coachID) {
		this.coachID = coachID;
	}

}
