package OOP;

public class ToSTR {
	public static void main(String[] args) {
//		toString() - Special method that all objects inherit,
//					 that returns a string that "textually represents" an object.
//		             can be used both implicitly and explicitly
		Car car = new Car("Ford", "F-150", 2022, "red", 5000000);
		
		System.out.println(car);

	}

}
