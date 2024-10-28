package soliddesignpattern.liskovsubstitution.problem;

/*
 * This class is violating lsp, since group video call
 * does not support
 */

public class Instagram implements SocialMedia{
	
	@Override
	public void chatWithFriend() {
		// this feature also support with insta
		
	}
	@Override
	public void groupVideoCall() {
		// but group video call does not work in insta
		//so this violating liskov substitution principle
		
	}
	@Override
	public void sendNotification() {
		// send notification also work with insta
		
	}
	
	@Override
	public void sendPost() {
		// instagram support for sending post
		
	}

}
