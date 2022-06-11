package OOP;

public class CopyObj {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet", "Corvette", 2022, "blue", 5000000);
//		Method 1 - Copy object
//		Car car2 = new Car("Ford", "F-150", 2022, "black", 3000000);
//		car2.copy(car1);
		
		Car car2 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getModel());
		System.out.println(car2.getModel());
	}

}
