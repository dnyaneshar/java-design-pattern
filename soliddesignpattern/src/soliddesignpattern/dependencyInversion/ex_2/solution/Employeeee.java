package soliddesignpattern.dependencyInversion.ex_2.solution;

import soliddesignpattern.dependencyInversion.ex_2.EmailNotification;
import soliddesignpattern.dependencyInversion.ex_2.Notification;

public class Employeeee {
	private Notification notification;
	
	public Employeeee(Notification notification) {
		this.notification = notification;
	}
	
	public void notifyUser() {
		System.out.println("notifying user with loosly coupled "
				+ " ");
		notification.notifyUser();
	}
	
	public static void main(String[] args) {
		
		// seems using abstraction with loosly coupled
		Notification notification = new EmailNotification();
		Employeeee e = new Employeeee(notification);
		
		System.out.println("using abstraction layer , user will be notify");
		
		e.notifyUser();
	}
}
