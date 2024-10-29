package soliddesignpattern.openclose;

import java.security.InvalidParameterException;

public class SocialMediaService {
	
	public void sendOTP(String mediaType) {
		
		if( mediaType.equals("mobile")) {
			// send otp for mobile
		} else if( mediaType.equals("facebook")) {
			// send otp for facebook
		} else if(mediaType.equals("instagram")) {
			// send otp for insta
		} else { 
			
			//or add new functionality to the existing functionality
			// but the problem is 
			throw new InvalidParameterException("Please send valid argument");
		}
	}

}

