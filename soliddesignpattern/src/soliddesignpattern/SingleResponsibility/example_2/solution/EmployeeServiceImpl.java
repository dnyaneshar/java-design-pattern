package soliddesignpattern.SingleResponsibility.example_2.solution;

public class EmployeeServiceImpl implements EmplyeeService{
	
	
	private EmailNotificationService emailNotificationService;
	
	
	@Override
	public void getDesignation() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateaSalary() {
		
		// once you updated the salary you can send email
		// Notification
		Object obj = new Object();
		emailNotificationService.sendEmail(obj);
		
	}
	
	

}
