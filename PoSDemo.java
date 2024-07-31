// ---------------------------------------------------------
// Assignment 4
// Written by: Samuel Vachon - 40281580
// For COMP 248 Section H – Fall 2023
// ---------------------------------------------------------
import java.util.Scanner;



public class PoSDemo {
	
	public static void compare3(PoS PoS1, PoS PoS2, int x, int y) {
		if (PoS1.getTOTAL() == PoS2.getTOTAL())
			System.out.println("Both PoS #"+x+" and PoS #"+y+" have a total of "+PoS1.getTOTAL()+" $");
	}
	
	public static void compare4(PoS PoS1, PoS PoS2, int x, int y) {
		if (PoS1.getSALES().equals(PoS2.getSALES()))
			System.out.println("Both PoS #"+x+" and PoS #"+y+" have the sames sales: "+PoS1.getSALES());
	}
	
	public static void compare5(PoS PoS1, PoS PoS2, int x, int y) {
		if (PoS1.equals(PoS2))
			System.out.println("Both PoS #"+x+" and PoS #"+y+" have the sames sales and cards: "+PoS1);
	}
	
	public static int promptPoS() {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			int a = input.nextInt();
			if (a>5 || a<1) {
				System.out.print("Please choose a number between 1 and 5: ");
				continue;
			}
			else
				return a;
		}
	}
	
	public static int getM() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the expiration date on the card?\n(mm):  ");
		int m = input.nextInt();
		return m;
	}
		
	public static int getD() {
		Scanner input = new Scanner(System.in);
		System.out.print("(dd): ");
		int d = input.nextInt();
		return d;
	}
	
	public static String getID() {	
		Scanner input = new Scanner(System.in);
		System.out.print("What is the ID number on the card ? (********) ");
		String id = new String(input.next());
		return id;
	}
	
	public static String getTYPE() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the meal types? (Carnivore, Halal, Kosher, Pescatarian, Vegetarian, Vigan) ");
		String type = new String(input.next());
		return type;
	}
	
	public static int getNM() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the new expiration date?\n(mm): ");
		int nm = input.nextInt();
		return nm;
	}
	
	public static int getND() {
		Scanner input = new Scanner(System.in);
		System.out.print("(dd): ");
		int nd = input.nextInt();
		return nd;
	}

	public static int getJR() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount you want to add.\n(Jr): ");
		int jr = input.nextInt();
		return jr;
	}
	
	public static int getTEEN() {
		Scanner input = new Scanner(System.in);
		System.out.print("(teen): ");
		int teen = input.nextInt();
		return teen;
	}
	
	public static int getMED() {
		Scanner input = new Scanner(System.in);
		System.out.print("(med): ");
		int med = input.nextInt();
		return med;
	}
	
	public static int getBIG() {
		Scanner input = new Scanner(System.in);
		System.out.print("(big): ");
		int big = input.nextInt();
		return big;
	}
	
	public static int getFAM() {
		Scanner input = new Scanner(System.in);
		System.out.print("(fam): ");
		int fam = input.nextInt();
		return fam;
	}
	
	public static void main(String[] args) {
		
		//Creating some cards
		PrePaiCard card1 = new PrePaiCard(4,7,"40281580","Carnivore");
		PrePaiCard card2 = new PrePaiCard(4,14,"40256895","Kosher");
		PrePaiCard card3 = new PrePaiCard(12,28,"40258765","Halal");
		
		
		//Creating some sales configuration
		Sales sales1 = new Sales(1,1,1,1,1);
		Sales sales2 = new Sales(0,5,1,0,0);
		Sales sales3 = new Sales(2,2,2,2,2);
		
		//Creating 5 different PoS
		PoS PoS1 = new PoS(sales1,new PrePaiCard[0]);
		PoS1.addCard(card1);
		
		
		PoS PoS2 = new PoS(sales1,new PrePaiCard[0]);
		PoS2.addCard(card1);
		
		PoS PoS3 = new PoS(sales2,new PrePaiCard[0]);
		PoS3.addCard(card1);
		PoS3.addCard(card2);
		PoS3.addCard(card3);
		
		
		PoS PoS4 = new PoS(sales3,new PrePaiCard[0]);
		
		PoS PoS5 = new PoS(sales3,new PrePaiCard[0]);
		
		//Creating Scanner variable for input by user
		
		System.out.println("Welcome to your Points of Sales\n");
		
		int choice =1;
		
		while (choice != 0) {
			System.out.println("\nWhat would you like to do?\n  "+
								"1. See the content of all PoSs\n  "+
								"2. See the content of one PoS\n  "+
								"3. List PoSs with same $ amount of sales\n  "+
								"4. List PoS with same number of Sales categories\n  "+
								"5. List PoSs with same $ amount of Sales and same number of Prepaid cards\n  "+
								"6. Add a Prepaid card to an existing PoS\n  "+
								"7. Remove an existing Prepaid Card from a PoS\n  "+
								"8. Update the expiry date of an existing Prepaid card\n  "+
								"9. Add sales to a PoS\n  "+
								"0. To quit\n");
			
			System.out.print("Please enter your choice and press <Enter>: ");
			
			while (true) {
				Scanner input = new Scanner(System.in);
				choice = input.nextInt();
				if (choice<0 || choice>9) {
					System.out.print("Please select a number between 0 and 9");
					continue;
				}
				else
					break;
			}
			
			
			switch (choice) {
				case 1:{
					System.out.println("PoS #1:\n"+PoS1+"\nPoS #2:\n"+PoS2+"\nPos #3:\n"+PoS3+"\nPoS #4:\n"+PoS4+"\nPoS5:\n"+PoS5);
					break;
				}
				case 2:{
					System.out.print("What PoS do you want to see the content of?  (Enter number 1 to 5) ");
					
					switch (promptPoS()) {
						case 1: System.out.print(PoS1);
								break;
						case 2: System.out.print(PoS2);
								break;
						case 3: System.out.print(PoS3);
								break;
						case 4: System.out.print(PoS4);
								break;
						case 5: System.out.print(PoS5);
								break;
					}
					break;
				}
				case 3:{
					compare3(PoS1,PoS2,1,2);
					compare3(PoS1,PoS3,1,3);
					compare3(PoS1,PoS4,1,4);
					compare3(PoS1,PoS5,1,5);
					compare3(PoS2,PoS3,2,3);
					compare3(PoS2,PoS4,2,4);
					compare3(PoS2,PoS5,2,5);
					compare3(PoS3,PoS4,3,4);
					compare3(PoS3,PoS5,3,5);
					compare3(PoS4,PoS5,4,5);
					break;
				}
				case 4:{
					compare4(PoS1,PoS2,1,2);
					compare4(PoS1,PoS3,1,3);
					compare4(PoS1,PoS4,1,4);
					compare4(PoS1,PoS5,1,5);
					compare4(PoS2,PoS3,2,3);
					compare4(PoS2,PoS4,2,4);
					compare4(PoS2,PoS5,2,5);
					compare4(PoS3,PoS4,3,4);
					compare4(PoS3,PoS5,3,5);
					compare4(PoS4,PoS5,4,5);
					break;
				}
				case 5:{
					compare5(PoS1,PoS2,1,2);
					compare5(PoS1,PoS3,1,3);
					compare5(PoS1,PoS4,1,4);
					compare5(PoS1,PoS5,1,5);
					compare5(PoS2,PoS3,2,3);
					compare5(PoS2,PoS4,2,4);
					compare5(PoS2,PoS5,2,5);
					compare5(PoS3,PoS4,3,4);
					compare5(PoS3,PoS5,3,5);
					compare5(PoS4,PoS5,4,5);
					break;
				}
				case 6:{
					System.out.print("What PoS do you want to add a prepaid card to?  (Enter number 1 to 5) ");
					
					switch (promptPoS()) {
						case 1: PoS1.addCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
								break;
						case 2: PoS2.addCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
								break;
						case 3: PoS3.addCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
								break;
						case 4: PoS4.addCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
								break;
						case 5: PoS5.addCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
								break;
					}
					break;
				
				}
				case 7:{
					System.out.print("What PoS do you want to remove a prepaid card from?  (Enter number 1 to 5) ");

					switch (promptPoS()) {
					case 1: PoS1.removeCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
							break;
					case 2: PoS2.removeCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
							break;
					case 3: PoS3.removeCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
							break;
					case 4: PoS4.removeCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
							break;
					case 5: PoS5.removeCard(new PrePaiCard(getM(),getD(),getID(),getTYPE()));
							break;
					}
				break;
				}
				case 8:{
					System.out.print("What PoS do you want to change a prepaid card's expiration date from?  (Enter number 1 to 5) ");
					
					switch (promptPoS()) {
					case 1: PoS1.setDate(new PrePaiCard(getM(),getD(),getID(),getTYPE()),getNM(),getND());
							break;
					case 2: PoS2.setDate(new PrePaiCard(getM(),getD(),getID(),getTYPE()),getNM(),getND());
							break;
					case 3: PoS3.setDate(new PrePaiCard(getM(),getD(),getID(),getTYPE()),getNM(),getND());
							break;
					case 4: PoS4.setDate(new PrePaiCard(getM(),getD(),getID(),getTYPE()),getNM(),getND());
							break;
					case 5: PoS5.setDate(new PrePaiCard(getM(),getD(),getID(),getTYPE()),getNM(),getND());
							break;
					}
					break;
				}
				case 9:{
					System.out.print("What PoS do you want to add meals to?  (Enter number 1 to 5) ");

					switch (promptPoS()) {
						case 1: PoS1.addMeals(getJR(),getTEEN(),getMED(),getBIG(),getFAM());
								System.out.println("You now have: "+PoS1.getSALES());
								break;
						case 2: PoS2.addMeals(getJR(),getTEEN(),getMED(),getBIG(),getFAM());
								System.out.println("You now have: "+PoS2.getSALES());
								break;
						case 3: PoS3.addMeals(getJR(),getTEEN(),getMED(),getBIG(),getFAM());
								System.out.println("You now have: "+PoS3.getSALES());
								break;
						case 4: PoS4.addMeals(getJR(),getTEEN(),getMED(),getBIG(),getFAM());
								System.out.println("You now have: "+PoS4.getSALES());
								break;
						case 5: PoS5.addMeals(getJR(),getTEEN(),getMED(),getBIG(),getFAM());
								System.out.println("You now have: "+PoS5.getSALES());
								break;
					}
					
				}
					
			}
			
		}
		System.out.print("Thanks for using this PoS System.");
	}

}
