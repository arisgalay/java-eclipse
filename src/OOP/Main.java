package OOP;

public class Main {

	public static void main(String[] args) {
		// Instantiation
		Garage garage = new Garage();
		Car myCar1 = new Car("Chevrolet", "Corvette", 2022, "blue", 5000000);
		Car myCar2 = new Car("Ford", "F-150", 2022, "black", 3000000);
		
		garage.park(myCar1);
		garage.park(myCar2);
		
		// Inheritance
		Bicycle bike = new Bicycle();
		bike.go();
	}

	
}
