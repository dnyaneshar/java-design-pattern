package example.com;


public class MultiCatchHandling {
	
	
	public static void main(String[] args) {
		try{
		bar();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		foo();
	}

	// even if your are not throwing exception and 
	// declaring method inside the try-catch block 
	// code will compile successfully.
	public static void bar(){
		
	}
	
	// below are the unchecked exceptions they need not to
	//handle in the try-catch block or need not throws in the
	// method signature
	public static void foo() throws NullPointerException,
	 ArithmeticException {
		
	}

}
