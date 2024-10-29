package pattern.com.example2;

import java.util.Date;

public class User {
	private String name;
	private java.util.Date dob;

	public String getName() {
		return name;
	}

	public java.util.Date getDob() {
		return dob;
	}
	
	public User(UserBuilder userBuiler) {
		this.name = userBuiler.name;
		this.dob = userBuiler.dob;
	}
	
	public static class UserBuilder{
		
		private String name;
		private java.util.Date dob;
		
		public UserBuilder(String name) {
			this.name = name;
		}
		
		public UserBuilder setDOB(java.util.Date dob) {
			this.dob = dob;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		User user = new User.UserBuilder("dn")
				.setDOB(new Date()).build();
		
		System.out.println(user.getName());
	}
}
