package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
   private	static Logger logger =LogManager.getLogger(Log4jDemo.class) ;
   
	public static void main(String[] args) {

		
		System.out.println("\n Hello World...!    \n");
		logger.info("This information message");
		logger.error("This is an error message");
		logger.warn("This a warning message");
		logger.fatal("this a fatal message");
		
		
		System.out.println("\n Completed");
		
	}

	
	
	
}
