package pattern.com.example1;

public class DBConnetion {

	// this will create the object at the time of class loading
	// this called as eager loading
	// in this case the object will be created even it is not required
	DBConnetion db = new DBConnetion();
	
	public DBConnetion getConnectio() {
		return db;
	}
	
	
	
	
	
	/*
	 * solution 2 : in this solution the problem is that
	 * if 2 thread comes it will create new object 2 times
	 * it will create inconsistency in the program 
	 * 
	 */
	
	// Lazy initialization
	static DBConnetion db2 = null;
	
	public static DBConnetion getConnetion2() {
		if(db2 == null ) {
			db2 = new DBConnetion();
		}
		
		return db2;
	}
	
	
	/**
	 * solution to the above problem is that make method as
	 * synchronized .
	 * problem : if thousands of thread running each one 
	 * has to access the dbconnection object so they have 
	 * to wait until and unless another thread does not 
	 * release the lock. so it will impact the performance
	 * of the application. find another solution.
	 * 
	 */
	
	public synchronized static DBConnetion getInstance() {
		if(db2 == null ) {
			return new DBConnetion();
		}
		
		return new DBConnetion();
		
	}
	
	/*
	 * 
	 * solution to the above problem, 
	 * make synchronized block, in this case if the connection
	 * is null then only thread will try to get new instance
	 * otherwise it return existing db connection. 
	 */
	public static DBConnetion getInstance2() {
		
		if(db2 == null) {
			synchronized (DBConnetion.class) {
				return new DBConnetion();
			}
		}
		return db2;
	}
	
	
	
	
	
}
