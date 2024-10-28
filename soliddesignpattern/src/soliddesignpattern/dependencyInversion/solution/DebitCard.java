package soliddesignpattern.dependencyInversion.solution;

/*
 * This class bacame very loosly coupled now
 */
public class DebitCard implements BankCard{

	@Override
	public void pay(double amount) {
		System.out.println("paying amount of - "+ amount + " thro debit card");
	}
}
