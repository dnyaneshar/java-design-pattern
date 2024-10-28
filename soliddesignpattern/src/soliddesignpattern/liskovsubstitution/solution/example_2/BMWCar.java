package soliddesignpattern.liskovsubstitution.solution.example_2;


/*
 * BMW  car support both the feature so, it does not affecting
 * to the lsp, but in case there electric car it does not have
 * an engine so will violate the lsp.
 * 
 * 
 */
public class BMWCar implements Car {
	
	
	
	@Override
	public void accelerate() {
		
	}
	
	@Override
	public void turnOnEngine() {
		
	}
	

}
