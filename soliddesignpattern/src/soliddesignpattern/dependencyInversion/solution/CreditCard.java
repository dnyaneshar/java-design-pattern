package soliddesignpattern.dependencyInversion.solution;

public class CreditCard implements BankCard{

	@Override
	public void pay(double amount) {
		System.out.println("paying amount of - "+ amount + " thro credit card");
	}
}
