package arrayscode;

public class ArrCode {

	public static void main(String[] args) {
		/* Method 1
		 * String[] cars = {"Camaro", "Corvette", "Tesla"};
		 */
		
		// Method 2
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
		
		/*  Get access to array
		 *  array[index] -- cars[2] 
		 */
		
		/* Looping to an array thru for loop */
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
