package SeleniumJavaFramework.SeleniumJavaFramework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {

	static WebDriver driver1=null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ygtari\\Desktop\\tutorial\\chromedriver.exe");
		driver1=new ChromeDriver();
		

	}
	
	
	@Test
	public static void googleSearch2() throws InterruptedException {
		
		driver1.get("https://www.google.com/");
		driver1.findElement(By.name("q")).sendKeys("test");
		Thread.sleep(2000);
        driver1.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	
 	@AfterTest
    public void tearDownTest() {
	  
	   driver1.close();
	   driver1.quit();
	   System.out.println("Test Completed successfully1");
	  
  }
	
	
}
