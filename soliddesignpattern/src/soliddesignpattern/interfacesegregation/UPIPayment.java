package soliddesignpattern.interfacesegregation;

public interface UPIPayment {
	void payMoney();
	void getScrachedCard();
	///void getCashBackAsCreditBalance();
	
	//remove from here bas
	// because it violate the interface segregation feature
	// it should does not support to the phonepay and paytm
	//  it is applicable only for google pay
	// since we should implement chashmanager interface only
	// for GooglePay service.
}
