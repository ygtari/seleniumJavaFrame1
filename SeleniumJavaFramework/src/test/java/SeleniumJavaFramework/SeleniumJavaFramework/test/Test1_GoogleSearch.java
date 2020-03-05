package SeleniumJavaFramework.SeleniumJavaFramework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	
	
	 public static void main(String[] args) throws InterruptedException {
		
		 googleSearch();
		 
	}
	
	public static void googleSearch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/ygtari/eclipse-workspace/SeleniumJavaFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		Thread.sleep(2000);
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        driver.close();System.out.println("Test Completed Successfully");
		
		
		
	}
	
	
}
