package SeleniumJavaFramework.SeleniumJavaFramework.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObject;


public class GoogleSearchPageTest {

   private	static WebDriver driver=null;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		googleSearchTest();
		
	}
	
	
	public static void googleSearchTest() throws InterruptedException {
		
		   String projectPath=System.getProperty("user.dir");
		   System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		   driver =new ChromeDriver();
			
		  GoogleSearchPageObject searchPageObj =new GoogleSearchPageObject(driver);
		  driver.get("https://www.google.com/");   
		  searchPageObj.setTextInSearchBox("A B C D");
		  Thread.sleep(1000);
		  searchPageObj.clicSearchButton();
		  driver.close();
		  

		  
	}
	
	
}
