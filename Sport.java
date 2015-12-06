package model;

public class Sport {
	
	private int sportID;
	private String sportName;
		
		public Sport(){
			this.sportID = 1;
			this.sportName = "No Name";
		}
		public Sport(int sportID, String sportName) {
			this.sportID = sportID;
			this.sportName = sportName;			
		}

		public int getSportID() {
			return sportID;
		}

		public void setSportID(int sportID) {
			this.sportID = sportID;
		}

		public String getSportName() {
			return sportName;
		}

		public void setSportName(String sportName) {
			this.sportName = sportName;
		}

	}
