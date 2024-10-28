package soliddesignpattern.SingleResponsibility.example_2;

public interface EmployeeService {

	void getDesignation();
	void updateSalary();
	void sendEmail(); // this voilates the single reponsibility rule
	
	
	
}
