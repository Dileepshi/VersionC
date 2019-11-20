package Basics;

public class Variables {

	public static void main(String[] args) {

		int a=1;
		int b=2;
		int c= a+b;
		char d = 70;
		float marks = (float) 60.52;
		float marks1 = 60.52f;
		double mymarks = 30.52;
		int  mymarks1 =(int) 30.52;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(marks);
		System.out.println(marks1);
		System.out.println(mymarks);
		System.out.println(mymarks1);
		
		//Local variables contains garbage values
		// global variables contain null / garbage values
		// so if u don't initialize a value to local variable,it will throw error. 
		// you don't have to  initialize value to global.it will take 0 by default.
		

	}

}
