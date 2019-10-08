package seleniumbasics3;

public class InheritanceChild extends InheritanceParent {

	public static void main(String[] args) {
		
		InheritanceChild obj1 = new InheritanceChild();//can access all methods of base and child
		InheritanceParent obj2 = new InheritanceParent();// can access  methods of base only
		InheritanceParent obj3 = new InheritanceChild();// can access  methods of base only
		//InheritanceChild obj3 = new InheritanceParent();//invalid method
	
	}

	public void  mul()
	 {
		 System.out.println("this is mulitiplication");
	 }
	 
	 public void  div()
	 {
		 System.out.println("this is division");
	 }
}
