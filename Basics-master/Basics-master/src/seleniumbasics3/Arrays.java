package seleniumbasics3;

public class Arrays {

	// array is the collection of similar data type

	// syntax - datatype arrayname[] = new datatype[size] ;
	// index starts with zero
	// limitation of array - index
	// limitation of type

	public static void main(String[] args) {

		int student_id[] = new int[5];

		student_id[0] = 10;
		student_id[1] = 20;
		student_id[2] = 30;
		student_id[3] = 40;
		student_id[4] = 51;
		student_id[4] = (int) 50.00;

		System.out.println("student no " + student_id[4]);
		int sizeofarray = student_id.length;
		System.out.println("Size is  " + sizeofarray);

		for (int i = 0; i < sizeofarray; i++)

		{
			System.out.println("student no " + student_id[i]);
		}

	}

}
