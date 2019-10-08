package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

	public static void click(WebDriver driveri, String element) {

		Actions act = new Actions(driveri);
		act.moveToElement(driveri.findElement(By.id(element))).click().build().perform();
	}

}
