package SeleniumJavaFramework.SeleniumJavaFramework.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;


public class GoogleSearchTest {
   private static  WebDriver driver =null;

	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		
	   String projectPath=System.getProperty("user.dir");
	   System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");   
	   
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		Thread.sleep(2000);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	    
		driver.close();
		
		System.out.println("Test completed Successfully");
		
		
	}
	
	
	
}
