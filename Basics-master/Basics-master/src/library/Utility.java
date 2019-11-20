package library;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utility {

	public static void capture(WebDriver driver, String screeshotname) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("./Screenshots/" + screeshotname + ".png"));
			//FileHandler.copy(source, new File("./Screenshots/" + screeshotname + ".png"));
			System.out.println("screenshot taken");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is " + e.getMessage());
		}
	}
}
