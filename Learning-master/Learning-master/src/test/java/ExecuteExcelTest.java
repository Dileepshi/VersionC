
import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class ExecuteExcelTest {

	@Test
	public void exc() throws IOException {
		Excel E = new Excel();
		ArrayList<String> valuesIntheRow=E.getdata("Sample", "Buy");
		System.out.println(valuesIntheRow);
		//System.out.println(valuesIntheRow.get(0));
		//in case if you want to get an username from the excel.
		//  driver.findElement(By.name(valuesIntheRow.get(1)));

	}

}
