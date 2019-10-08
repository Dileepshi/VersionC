package udemyBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robott {
	
	// this class is used to perform key board actions if we cant find elements on a page
	// could be used in firefox downloading any file

	public void robo() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN); // press downarrow key in keyboard
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
