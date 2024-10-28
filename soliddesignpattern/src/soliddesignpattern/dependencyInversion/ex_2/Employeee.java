package soliddesignpattern.dependencyInversion.ex_2;

public class Employeee {
	
	private EmailNotification emailNotification ;
	public Employeee(EmailNotification emailNotification) {
		// TODO Auto-generated constructor stub
		
		this.emailNotification = emailNotification;
		
	}
	
	public void notifyUser() {
		System.out.println("notifying user with below details");
		this.emailNotification.notifyUser();
	}
	
	public static void main(String[] args) {
		
		// this is tighly couled, it should be loosly couple
		EmailNotification en = new EmailNotification();
		
		Employeee e = new Employeee(en);
		e.notifyUser();
	}
}
