package example.com;

import java.io.IOException;

class TestException5 extends OverrideExceptions{
	
	
	// to solve this problem you need to remove throws 
	// exception from the below 
	public void start(){ // throws Exception
	}
	
	// below runtime exception will not cause any problem 
	// if you are removing it from the below method
	// signature
	public void foo() throws RuntimeException{
		
	}
}