package SeleniumBasics;

public class Parameter {

	public static void main(String[] args) {

		Parameter par = new Parameter();
		par.sum1(10, 15);
		par.sub1(12.5, 13.5);

	}

	public void sum1(int a, int b) {
		int c = a + b;
		System.out.println("sum of numbers " + c);
	}

	public double sub1(double a, double b) {
		double c1 = a - b;
		return c1;
	}
}
