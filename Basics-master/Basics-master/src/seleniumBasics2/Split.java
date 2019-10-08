package seleniumBasics2;

public class Split {

	public static void main(String[] args) {

		String name = "my name is Dileep";

		String[] toolname = name.split(" ");

		for (int i = 0; i < toolname.length; i++) {
			System.out.println(toolname[i]);
			String expected = "hello";

			if (toolname[i].contains(expected)) {
				System.out.println("passed");
			}

		}
	}
}
