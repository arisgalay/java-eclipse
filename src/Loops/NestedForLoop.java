package Loops;

public class NestedForLoop {
	public static void main(String[] args) {
		// executes
		example2();
	}
	public static void example1() {
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j < i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void example2() {
		int rows = 4;
		int cols = 5;
		String symbol = " # ";
		
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j <= cols; j++) {
				System.out.print(symbol);
			}
		}
	}
}
