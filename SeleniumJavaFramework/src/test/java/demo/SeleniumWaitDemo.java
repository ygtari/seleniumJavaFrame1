package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class SeleniumWaitDemo {

	public static void main(String[] args) {
		
		seleniumWaits(); 
		
	}
	
	public static void seleniumWaits() {
		
		String projectPath=System.getProperty("user.dir");  
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		driver.get("https://www.google.com/"); 
		driver.findElement(By.name("q")).sendKeys("abcd");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

        
       
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        	       .withTimeout(30, TimeUnit.SECONDS)
        	       .pollingEvery(2, TimeUnit.SECONDS)
        	       .ignoring(NoSuchElementException.class);

        	   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
        	     public WebElement apply(WebDriver driver) {
        	        WebElement linkElement=  driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[8]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div/div[9]/div/div/div[1]/a/h3"));
        	        
        	        if(linkElement.isEnabled()) {
        	           System.out.println("Element found ");
        	        }
     	           return linkElement;
 
        	     }
        	   });
        	 
        	  
        element.click();
        
        
        
      
		driver.close();
		driver.quit();
		
	}
	
	
}
