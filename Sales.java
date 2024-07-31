
public class Sales {
	
	private int jr;
	private int teen;
	private int med;
	private int big;
	private int fam;
	
	
	// When we initialize without starting value 
	public Sales() {
		jr = 0;
		teen = 0;
		med = 0;
		big = 0;
		fam = 0;
	}
	// When we initialize with knowned value. 
	public Sales(int j, int t , int m , int b , int f) {
		jr = j;
		teen = t;
		med = m;
		big = b;
		fam = f;
	}
	//To initialize a sales object with the same value as another Sales object
	public Sales(Sales anotherSales) {
		jr = anotherSales.getJR();
		teen = anotherSales.getTEEN();
		med = anotherSales.getMED();
		big = anotherSales.getBIG();
		fam = anotherSales.getFAM();
		}
	
	//Accessor methods to return the private values.
	public int getJR() {
		return jr;
	}
	public int getTEEN() {
		return teen;
	}
	public int getMED() {
		return med;
	}
	public int getBIG() {
		return big;
	}
	public int getFAM() {
		return fam;
	}
	
	//Mutator methods to change the value of a parameter
	public void setJR(int j){
		jr = j;
	}
	public void setTEEN(int t) {
		teen = t;
	}
	public void setMED(int m) {
		med = m;
	}
	public void setBIG(int b) {
		big = b;
	}
	public void setFAM(int f) {
		fam = f;
	}
	
	//To add a certain amount of each parameters
	public void addSales(int j, int t , int m, int b, int f) {
		jr+=j;
		teen+=j;
		med+=m;
		big+=b;
		fam+=f;
	}
	
	//To return the $$$ due before taxes
	public int SalesTotal() {
		return jr*5 + teen*10 + med*12 + big*15 + fam*20;
	}
	
	//To indicate the amount of each ordered so far
	public String toString() {
		return  (
				"\nJunior meals:      "+jr+"\n"+
				"Teen meals:        "+teen+"\n"+
				"Medium meals:      "+med+"\n"+
				"Big meals:         "+big+"\n"+
				"Familly meals:     "+fam+"\n"+
				"Total Sales:       "+SalesTotal()+" $\n"
				);
	}
	
	//To verify if two Sales' object have the same parameters values. 
	public boolean equals(Sales anotherSales) {
		if (jr == anotherSales.getJR() &&
			teen == anotherSales.getTEEN() &&
			med == anotherSales.getMED() &&
			big == anotherSales.getBIG() &&
			fam == anotherSales.getFAM()) 
			return true;
		else
			return false;
	}
	
}