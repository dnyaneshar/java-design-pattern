package soliddesignpattern.SingleResponsibility.example_2;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Override
	public void getDesignation() {
		// get employee designation
	}
	
	
	@Override
	public void sendEmail() {
		// send email this voilate the srp 
		// in this case we need to crate another interface
		//called Notification service
	}
	
	
	@Override
	public void updateSalary() {
		// update the salary
	}
	

}
