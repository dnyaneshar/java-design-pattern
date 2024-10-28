package soliddesignpattern.liskovsubstitution.solution;

public interface GroupVideoCall extends VideoCall{
	// if app support group video calling that means 
	// Obviously, it should support one to one video call as well
	void groupVideoCall();
}
