package SeleniumBasics;

public class FirstCalculator {
	int x=1;
	int y=2;
	static String name ="Dileep";
public static void main(String[] args) {
		
		//Class is an example for encapsulation.
		//class is to create  objects which defines its properties and behaviours
		//methods are block of statments to perform a task , we can resuse this method by calling them
		//non static methods can be called using objects
		//static methods can be called directly using class names.
		
		FirstCalculator summing = new FirstCalculator();
		FirstCalculator summing1 = new FirstCalculator();
		summing.sum();
		summing1.sub();
		System.out.println(summing.x);
		}
	
	public void sum()
	{
		int a = 90;
	    int b = 100;
	    int c=a+b;
	    System.out.println("sum of numbers " + c );
	}
	public void sub()
	{
		int a = 90;
	    int b = 100;
	    int c=a-b;
	    System.out.println("sub of numbers " + c );
	}
	public static void Div()
	{
		int a = 90;
	    int b = 100;
	    int c=a%b;
	    System.out.println("sub of numbers " + c );
	}
}
