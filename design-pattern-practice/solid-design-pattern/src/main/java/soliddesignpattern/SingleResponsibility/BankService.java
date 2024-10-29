package soliddesignpattern.SingleResponsibility;



/**
 * This class does not follow the single responsibility principle
 * 
 * to follow srp we should move print passbook in the priter service class
 * 
 *  >>> LoangetLoanInterestInfo functionality we can move into the Loanservice
 * 
 * >>> sendOTP - this functionality we can move into the Notification service
 * 
 * 
 * 
 */

public class BankService {


	public void printPassbook() {
		//write logic here
	}

	public void getLoanInterestInfo(String loanType) {

		if(loanType.equals("car")) {
			//write logic here
		}
		if(loanType.equals("personal")) {
			//write logic here
		}

		if(loanType.equals("education")) {
			//write logic here
		}

	}

	public void sendOTP(String medium)
	{

		if(medium.equals("email")) {
				//write logic here
		}

		if(medium.equals("mobile")) {
			//write logic here
		}
	}

}
