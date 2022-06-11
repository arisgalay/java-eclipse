package MathClass;
import java.util.Scanner;
public class Hypothenus {

	public static void main(String[] args) {
		System.out.println(findHypothenus());
		// Math Class
		// max - greater value
		// min - lesser value
		// sqrt - square root
		// round - rounded
		// ceil - round up
		// floor - round down
		
	}
	
	public static double findHypothenus() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side x: ");
		double x = input.nextDouble();
		System.out.println("Enter side y: ");
		double y = input.nextDouble();
		
		double result = Math.sqrt((x * x) + (y * y));
		
		input.close();
		return result;
	}

}
