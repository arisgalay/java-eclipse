package Loops;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		// while loop - executes a block of code as long as it's condition remains true
		Scanner input = new Scanner(System.in);
		
		String game = "";
		while (!game.equals("Q") && !game.equals("q")) {
			System.out.println("You are playing a game! Press q or Q to exit");
			game = input.nextLine();
		}

		System.out.println("you quit");
		
		input.close();
	}

}
