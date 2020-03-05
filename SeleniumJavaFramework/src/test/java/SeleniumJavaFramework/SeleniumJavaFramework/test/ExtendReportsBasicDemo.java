package SeleniumJavaFramework.SeleniumJavaFramework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {

	
	private static WebDriver driver =null;
	
	public static void main(String[] args) throws InterruptedException {

		@SuppressWarnings("deprecation")
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("extentReports.html");
		
		//Create ExtentReports and attach reporter
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//Create a toggle for the givern test ,adds alla logs event under it 
		
		   ExtentTest test1=extent.createTest("Google search test one ", "this is a tst to validate goole search functionality ");
		
		   
		   

		   String projectPath=System.getProperty("user.dir");
		   System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		   driver =new ChromeDriver();
		  
		   test1.log(Status.INFO, "Starting test casae ");
		  driver.get("https://www.google.com/");
		   test1.pass("Navigated to google.com");
		  driver.findElement(By.name("q")).sendKeys("Automation");
		   test1.pass("Entered text in search box");

		  Thread.sleep(2000);
	      driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	      test1.pass("Pressed Keyboard enter key ");
		  driver.close();
		  driver.quit();
		  test1.pass("closed the browser");
          
		  test1.info("Test completed");
		  
		  
		  //Test2
		  
		  
		  ExtentTest test2=extent.createTest("Google search test one ", "this is a tst to validate goole search functionality ");
			
		   
		   

		   projectPath=System.getProperty("user.dir");
		   System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		   driver =new ChromeDriver();
		  
		   test2.log(Status.INFO, "Starting test casae ");
		  driver.get("https://www.google.com/");
		   test2.pass("Navigated to google.com");
		  driver.findElement(By.name("q")).sendKeys("Automation");
		   test2.fail("Entered text in search box");

		  Thread.sleep(2000);
	      driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	      test2.pass("Pressed Keyboard enter key ");
		  driver.close();
		  driver.quit();
		  test2.pass("closed the browser");
         
		  test2.info("Test completed");
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  //calling flush writes  everything to the log file 
		  
		  extent.flush();
		  
		  
	}

	
	
	
}
