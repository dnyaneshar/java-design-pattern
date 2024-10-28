package soliddesignpattern.SingleResponsibility.printer;

import soliddesignpattern.SingleResponsibility.EmployeeService;

public class EmployeeServiceImpl implements PrinterService, EmployeeService {

	@Override
	public void print() {
		System.out.println("generating report");

	}

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}
	
	

}
