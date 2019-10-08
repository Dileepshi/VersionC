package seleniumbasics3;

public class Polymorphisam {

	public static void main(String[] args) {
		/// method name is same but parameters gets changed
		// compile time - early binding - Method over loading-- this can be done
		/// only if we have methods of same name but diff signature
		// signature - no of arguments - type of argument - order of argument
		// run time - late binding - over riding

		Polymorphisam status = new Polymorphisam();
		status.add(10.5, 10);
		status.add(10, 10.5);
		status.add(5, 10, 15);
		status.add(10.5, 6, 7);
	}

	public void add(int b, double a) {
		double c = a + b;
		System.out.println(c);
	}

	public void add(double a, int b) {
		double c = a + b;
		System.out.println(c);
	}

	public void add(int a, int c, int b) {
		int d = a + c + b;
		System.out.println(d);
	}

	public void add(double a, int c, int b) {
		double d = a + c + b;
		System.out.println(d);
	}

}
