package arrayscode;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
//		ArrayList - a resizable array.
//					Elements can be added and removed after compilation phase
//					store reference data types
	ArrayList<String> foods = new ArrayList<>();
//	size() - To get the length of an String wrapper class ArrayList
//	get(index) - To access wrapper class array value
//	set(index, newValue) - Replace ArrayList value
//	remove(index) - Remove ArrayList value
	foods.add("Chickenjoy");
	foods.add("Angel's burger");
	foods.add("Milk Tea");
	
	for (int i = 0; i < foods.size(); i++) {
		System.out.println(foods.get(i));
	}
	
	}

}
