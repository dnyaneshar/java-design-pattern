package soliddesignpattern.dependencyInversion.solution;
public class ShoppngMall {
	
	private BankCard card;
	
	public ShoppngMall(BankCard card) {
		this.card = card;
	}
	
	
	public static void main(String[] args) {
		
		//DebitCard card = new DebitCard();
		
		// this class became loosely couple now
		BankCard card = new DebitCard();
		//CreditCard card = new CreditCard();
		ShoppngMall mall = new ShoppngMall(card);
		card.pay(1000);
	}

}
