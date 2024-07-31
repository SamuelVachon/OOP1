
public class PrePaiCard {

	private int month;
	private int day;
	private String id;
	private String type;
	
	//Initialize a card 
	public PrePaiCard() {
		month = 0;
		day = 0;
		id = "00000000";
		type = "Carnivore";
	}
	
	//Initialize with prompted value
	public PrePaiCard(int m, int d, String i, String t) {
		id = i;
		type = t;
		if (m > 12 || m < 0)
			month = 0;
		else
			month = m;
		if (d > 31 || d < 1)
			day = 0;
		else
			day =d;
	}
	
	//Initialize a copy of another card
	public PrePaiCard(PrePaiCard another) {
		month = another.getMONTH();
		day = another.getDAY();
		id = another.getID();
		type = another.getTYPE();
	}
	
	// Accessor methods
	public int getMONTH() {
		return month;
	}
	public int getDAY() {
		return day;
	}
	public String getID() {
		return id;
	}
	public String getTYPE() {
		return type;
	}
	
	//Mutator methods
	public void setMONTH(int m) {
		if (m > 12 || m < 0)
			month = 0;
		else
			month = m;
	}
	public void setDAY(int d) {
		if (d > 31 || d < 1)
			day = 0;
		else
			day =d;
	}
	
	//To return a written form of the card
	public String toString() {
		String date =new String();
		if (day<10 && month<10)
			date = ("0"+day+"/0"+month);
		else if (day < 10)
			date = ("0"+day+"/"+month);
		else if (month < 10)
			date = (day+"/0"+month);
		else
			date = (day+"/"+month);
			
		return ("\n"+
				"Card holder:       "+id+"\n"+
				"Card type:         "+type+"\n"+
				"Expiration date:   "+date);					
	}

	//To check if two prepaicard are equals
	public boolean equals(PrePaiCard another) {
		if (day == another.getDAY() &&
			month == another.getMONTH() &&
			id.equals(another.getID()) &&
			type.equals(another.getTYPE()))
			return true;
		else
			return false;
	}
	
}
