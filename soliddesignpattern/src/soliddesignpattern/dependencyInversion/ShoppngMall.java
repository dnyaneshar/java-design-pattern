package soliddesignpattern.dependencyInversion;

/*
 * This class is very tightly coupled so we need to create
 * one interface and add pay method inside it and implement
 * it inside both credit and debit class
 */
public class ShoppngMall {
	
	private DebitCard card;
	
	public ShoppngMall(DebitCard card) {
		this.card = card;
	}
	
	
	public static void main(String[] args) {
		
		DebitCard card = new DebitCard();
		//CreditCard card = new CreditCard();
		ShoppngMall mall = new ShoppngMall(card);
		card.pay();
	}

}
