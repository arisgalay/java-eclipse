package OOP;

public class Fish implements Prey, Predator {

	@Override
	public void flee() {
		System.out.println("This smaller fish is fleeing");
		
	}
	@Override
	public void hunt() {
		System.out.println("This larger fish is hunting smaller fish");
		
	}
}
