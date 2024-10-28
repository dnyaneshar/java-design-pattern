package soliddesignpattern.liskovsubstitution.solution.example_2;

/*\
 * this class violate the feature of the lsp
 */
public class BMWElectricCar implements Car{
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}
	
	// electric car don't have engine, so this feature
	// again violate the lsp 
	@Override
	public void turnOnEngine() {
		// TODO Auto-generated method stub
		
	}
	

}
