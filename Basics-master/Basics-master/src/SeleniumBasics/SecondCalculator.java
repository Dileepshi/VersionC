package SeleniumBasics;

public class SecondCalculator {
	public static void main(String[] args) {
	
	FirstCalculator call = new FirstCalculator();
	call.sum();
	call.sub();
	System.out.println(FirstCalculator.name);
	FirstCalculator.Div(); //calling directly by class name since we are calling static method 

}
} 