package model;

public class Review {
	private int reviewID;
	private String content;
	private int typeID;
	
	public Review(){
		this.reviewID = 1;
		this.content = "None";
		this.typeID = 1;
		
	}
	public Review(int reviewID, String content, int typeID) {
		this.reviewID = reviewID;
		this.content = content;
		this.typeID = typeID;
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

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

}
