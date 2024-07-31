
public class PoS {

	private Sales sales = new Sales();
	private PrePaiCard[] cards = new PrePaiCard[0];
	
	//Initialize Pos with null values
	public PoS() {
		sales = new Sales();
		cards = new PrePaiCard[0];
	}
	
	//Initialize a PoS with non-null values.
	public PoS(Sales s, PrePaiCard[] p) {
		sales = s;
		cards = p;
	}
	
	//Getter method
	public Sales getSALES() {
		return sales;
	}
	public int getTOTAL() {
		return sales.SalesTotal();
	}
	public int getNUMOFCARDS() {
		return cards.length;
	}
	
	
	//Method to verify equality between the total value $$$ of the bill
	public boolean sameTotal(PoS another) {
		if (sales.SalesTotal() == (another.getSALES()).SalesTotal())
			return true;
		else
			return false;
	}
	
	//Method to verify if two PoS has the same orders
	public boolean sameOrder(PoS another) {
		if (sales.equals(another.getSALES()))
			return true;
		else
			return false;
	}
	
	//Method to add a card in the PoS
	public int addCard(PrePaiCard card) {
		PrePaiCard[] newCards = new PrePaiCard[cards.length +1];
		
		for (int i=0;i<cards.length;i++) {
			newCards[i] = cards[i];
		}
		newCards[cards.length] = card;
		cards = newCards;
		return cards.length;
	}
	
	//Method to remove a card from the PoS
	public boolean removeCard(PrePaiCard card) {
		if (cards.length == 0)
			return false;
		else {
			for (int i=0; i<cards.length;i++) {
				if (cards[i].equals(card)) {
					PrePaiCard[] newCards = new PrePaiCard[cards.length -1];
					boolean removed = false;
					for (int a=0;a<cards.length;a++) {
						if (a!=i && !removed) 
							newCards[a] = cards[a];
						else
							removed = true;
						if (a!=i && removed)
							newCards[a-1]=cards[a];
					}
					cards = newCards;
					return true;
				}
			}
			return false;
		}
	}
	
	//Method to change the expiration date of a card
	public void setDate(PrePaiCard card, int m, int d) {
		for (int i=0; i<cards.length; i++) {
			if (cards[i].equals(card)) {
				cards[i].setMONTH(m);
				cards[i].setDAY(d);
			}
		}
	}

	//Method to add meals to the PoS
	public int addMeals(int j, int t, int m, int b, int f) {
		sales.addSales(j,t,m,b,f);
		return sales.SalesTotal();
	}

	//Methods to see if the sales total and the number of cards are the same for 2 PoS
	public boolean equals(PoS another) {
		if (sales.SalesTotal() == another.getTOTAL() &&
			cards.length == another.getNUMOFCARDS())
			return true;
		else
			return false;
	}
	
	//Method that return the details of the cards and meals
	public String toString() {
		if (cards.length == 0)
			return sales+"\nNo pre-paid cards\n";
		else {
			String allCards = new String();
			for (int i=0;i<cards.length;i++) {
				allCards = allCards.concat(cards[i].toString()+"\n");
			}
			return (sales+"\n"+allCards);
		}

	}
	
	//Methods to return only sales 
	public String infoSales() {
		return sales.toString();
	}
}
