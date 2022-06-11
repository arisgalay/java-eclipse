package OOP;

public class Encapsulation {

	public static void main(String[] args) {
//		Encapsulation - attributes of a class will be hidden or private
//						can be accessed only through methods (getters & setters)
//						You should make attributes private if you don't have a reason to make them public
	
		Car myCar1 = new Car("Chevrolet", "Corvette", 2022, "blue", 5000000);
		
		myCar1.setYear(2023);
		
		System.out.println(myCar1.getYear());
	}

}
