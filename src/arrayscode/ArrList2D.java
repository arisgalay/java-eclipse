package arrayscode;

import java.util.ArrayList;

public class ArrList2D {

	public static void main(String[] args) {
//		2D ArrayList - a dynamic list of a lists
//		You can change the size of these lists during runtime
		ArrayList<String> softdrinks = new ArrayList<>();
		softdrinks.add("Coke");
		softdrinks.add("Sprite");
		
		ArrayList<String> snacks = new ArrayList<>();
		snacks.add("Nova");
		snacks.add("Piattos");
		
		ArrayList<ArrayList<String>> cart = new ArrayList<ArrayList<String>>();
		cart.add(softdrinks);
		cart.add(snacks);
		
		// get - access value to 2D ArrayList
		System.out.println(cart.get(0).get(0));
	}

}
