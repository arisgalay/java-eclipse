package OOP;

public class ArrObj {

	public static void main(String[] args) {
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		
//		Method 1
//		Food[] refrigerator = new Food[3];
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		
		Food[] refrigerator = {food1, food2, food3};
		System.out.println(refrigerator[1].name);
	}
}
