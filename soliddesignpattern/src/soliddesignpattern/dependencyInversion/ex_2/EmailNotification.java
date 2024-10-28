
package soliddesignpattern.dependencyInversion.ex_2;

public class EmailNotification implements Notification{
	
	@Override
	public void notifyUser() {
		System.out.println("sending email notification to"
				+ " the user");
	}

}
