package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Exception - an event that occurs during the execution of a program that, 
//		            disrupts the normal flow of instructions
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter a whole number to divide: ");
			int a = input.nextInt();
			System.out.println("Enter a whole number to divide by: ");
			int b = input.nextInt();
			
			int result = a / b;
			
			System.out.println("Result: " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("Sorry, you cannot divide number by zero");
		} catch(InputMismatchException e) {
			System.out.println("Please enter a number only");
		} catch(Exception e) {
			System.out.println("Something went wrong");
		} finally {
			input.close();
		}
		
	}
}
