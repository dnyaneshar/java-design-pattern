package soliddesignpattern.liskovsubstitution.problem;

/**
 * Whats app does not support send post, since this class
 * does not following lismkov of substitution principle
 * 
 * So, need to work on this
 */
public class WhatsApp implements SocialMedia{
	
	@Override
	public void chatWithFriend() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void groupVideoCall() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sendPost() {
		// TODO Auto-generated method stub
		
	}

}
