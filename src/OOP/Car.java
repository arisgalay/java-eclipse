package OOP;

public class Car {
//	Object - an instance of a class that may contain attributes and methods
//	example: (phone, desk, computer, coffee cup)
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;
	Car(String make, String model, int year, String color, double price){
//	Constructor - special method that is called when an object is instantiated(created)
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setColor(color);
		this.setPrice(price);
	}
	
	Car(Car x){
//    Copy object when instantiation
		this.copy(x);
	}
	
//	Car(){
//	Overloaded constructor - multiple constructors within a class with the name,
//							 but have different parameters
//							 name + parameters = signature
//	}
	
	void drive() {
		System.out.println("You drive " + this.model);
	}
	void brake() {
		System.out.println("You step on the brakes");
	}
	
//	public String toString() {
//		return make + "\n" + model + "\n" + color + "\n";
//	}

	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
		this.setColor(x.getColor());
		this.setPrice(x.getPrice());
	}
	

}
