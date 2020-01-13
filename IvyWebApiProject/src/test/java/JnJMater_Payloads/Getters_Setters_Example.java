package JnJMater_Payloads;

public class Getters_Setters_Example {
	
	
	// getters are setters are used to encapsulate the fields of a class by making them accessible only through its public methods and keep the values themselves private. ...
	// Getter and setter method are used to get and set the value of x which is the way to achieve encapsulation.

	private String Car;

	public static void main(String[] args) {
		
		Getters_Setters_Example example = new Getters_Setters_Example();
		
		example.setCar("BMW");
		String carName = example.getCar();
		System.out.println(carName);

	}

	public void setCar(String Car) {

		// this keyword is used to tell the method that this string belongs to the same class
		// here u are assigning same class string to the method parameter string
		this.Car = Car;

	}

	public String getCar() {

		return Car;

	}

}
