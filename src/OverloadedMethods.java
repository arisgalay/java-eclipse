
public class OverloadedMethods {

	public static void main(String[] args) {
//		Overloaded Methods - methods that share the same name but have different parameters
//							 method name + parameters = method signature
		
		System.out.println(add(1.9, 2.1));
		
	}
	static int add(int a, int b) {
		System.out.println("Overloaded Method #1 int");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("Overloaded Method #2 int ");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("Overloaded Method #3 int");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("Overloaded Method #4 double");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("Overloaded Method #5 double");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("Overloaded Method #6 double");
		return a + b + c + d;
	}

}
