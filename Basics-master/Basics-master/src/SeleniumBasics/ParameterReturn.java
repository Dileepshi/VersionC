package SeleniumBasics;

public class ParameterReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterReturn par = new ParameterReturn();  //-- same class 
		Parameter par1 = new Parameter();             //-- Different class
		
		int aaa = par.sum(10, 15);
		System.out.println(aaa);  //--------------- 1
		
		par.sub(12.5, 13.5);//----------------------2 
		
		double subs= par1.sub1(25.5, 35.8);
		System.out.println(subs);//-----------------3
		}
	
	public int sum(int a,int b)
	{
	    int c=a+b;
		return c;
	}
	public void sub(double a,double b)
	{
	    double c=a-b;
	    System.out.println("sub of numbers " + c );
	}
}

