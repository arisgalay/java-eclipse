package MathClass;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		// Pseudorandom
		Random random = new Random();
		int x = 0;
		
		while(x != 6) {
			x = random.nextInt(6) + 1;
			System.out.println(x);
		}
		
		
		
	}

}
