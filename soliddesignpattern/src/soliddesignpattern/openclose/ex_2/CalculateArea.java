package soliddesignpattern.openclose.ex_2;

public class CalculateArea {

	/*
	 * This voilate the open close principle 
	 * because in future if new shape comes for adding
	 * 
	 */
	public Object area(String shape) { 

		if (shape.equals("circle")) {
			return 3.14 * 4;
		} else if( shape.equals("sqaure")) {
			return 4 * 4;
		} else if( shape.equals("other")) {
			// in future new requirement will come
		}
		
		return shape;
		
	}
}
