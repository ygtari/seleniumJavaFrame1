package SeleniumJavaFramework.SeleniumJavaFramework.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {

	static WebDriver driver=null;
    public static	String browserName=null;
	String projectPath=System.getProperty("user.dir");

	
	@BeforeTest
	public void setUpTest() throws IOException {
		
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ygtari\\Desktop\\tutorial\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
	}
	
	@Test
	public static void googleSearch() throws InterruptedException {
		
	
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		Thread.sleep(2000);
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		
	}
	
 	@AfterTest
    public void tearDownTest() {
	  
	   driver.close();
	   driver.quit();
	   System.out.println("Test Completed successfully");
	  
	  
  }
	
	
}
