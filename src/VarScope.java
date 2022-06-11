import java.util.Random;

public class VarScope {

	static Random random = new Random();
	public static void main(String[] args) {
//		local - declared inside a method
//				visible only to that method
//		global - declared outside a method but within a class
//				 visible to all parts of a class
		
		int number = 0;
		roll(number);
	}
	
	static void roll(int number) {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}

}
