package seleniumbasics3;

public class InheritanceParent {
	
	// Code reusable
	//no code duplication
	//method over riding
	// 4 possible combinations are
	// child class reference and child class object - can access all methods of base and child
	// base class reference and base class object - can access  methods of base only
	// base class reference and child class object - can access  methods of base only
	// child class reference and child class object - invalid scenario
	
	 public void  add()
	 {
		 System.out.println("this is addition");
	 }
	 
	 public void  sub()
	 {
		 System.out.println("this is subtraction");
	 }

}
