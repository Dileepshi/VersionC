package udemyBasics;



//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL {

	public static void main(String[] args) {
		
		//DesiredCapabilities of  firefox or chrome profile
		@SuppressWarnings("static-access")
		DesiredCapabilities ch = new DesiredCapabilities().firefox();
		ch.acceptInsecureCerts();
		//or
		//ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		//ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//merging DesiredCapabilities of  chrome profile with your local firefox or chrome
		FirefoxOptions c = new FirefoxOptions();	
		c.merge(ch);
		
		//WebDriver driver = new FirefoxDriver(c);
		
		
		

	}

}
