package Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Basics {
	
	//Log4j is a reliable,fast logging framework in java.
	//Any thing we perform in a case, need to be logged
	//you can set logs in diff ways
	// 1. log of failure logs in package 1	
	//2.get logs of all cases in some package
	//3.logs with time stamps
	//4.log file of last week
	//5.how to know if there is an error by just seeing the log
	
	public static Logger Logs =LogManager.getLogger(Basics.class.getName());
	

	public static void main(String[] args) {
		Logs.debug("im debugging"); //When each Selenium action is performed like click, SendKeys, getText()
		Logs.error("error is there");//use this when elements are not displayed in the page or if any validations fail
		Logs.fatal("i fatal");
		Logs.info("this is completed");//When operation is successfully completed ex: After loading page, or after any successful validations
		
		// We need to use an XML for the log
		//XML will have appenders , loggers tag and root level
		//appenders tag is used to define where result has to be published like console and time pattern
		//root level defines for what log to be printed example error or fatal or info. if u put it as trace it will print all the logs
		//root level is defined for all the tests globally
		//logger level is defined, which package and test to run
		//create an XML file in the project level and add it in the build path configuration.
		//now if u run the test, it will run all the logs.XML file name to be created as Log4j2
		
	}

}
