package soliddesignpattern.openclose;


/*
 * 
 * In future if we want send some other notification ex. whatapps 
 * 
 * ocp does not allow to modify this class.
 * 
 * so better to have interface for send otp and have it implemented
 * for other medium.
 * 
 * for example : MobileNotificationServiceImpl, so on
 * 
 */
public class NotificatinService_Not_Applicable {

	public void sendOTP(String medium) {

		if(medium.equals("mobile")) {

			// write logic for send notification for mobile
		}
		if(medium.equals("email")) {

			// write logic for send notification for email
		}

	}

}
