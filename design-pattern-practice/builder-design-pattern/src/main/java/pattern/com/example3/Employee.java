package pattern.com.example3;

import java.util.Date;

public class Employee {
	private String firstname;
	private String lastname;
	private String middlename;
	private String companyName;
	private Date dob;
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public String getCompanyName() {
		return companyName;
	}
	public Date getDob() {
		return dob;
	}
	
	public Employee(EmployeeBuilder builder) {
		this.firstname = builder.firstname;
		this.middlename = builder.middlename;
		this.lastname = builder.lastname;
		this.companyName = builder.companyName;
		this.dob = builder.dob;
	}
	
	public static class EmployeeBuilder {
		
		private String firstname;
		private String lastname;
		private String middlename;
		
		private String companyName;
		private Date dob;
		
		public EmployeeBuilder(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
		}
		
		public EmployeeBuilder setmiddleName(String middleName) {
			this.middlename = middleName;
			return this;
		}
		
		public EmployeeBuilder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}
		
		public EmployeeBuilder setDOB(Date DOB) {
			this.dob = DOB;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee.EmployeeBuilder("D", "N")
				.setCompanyName("test company").setmiddleName("D").build();
		
	}
}
