package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITDemo {

	
	
      public static void main(String[] args) throws Exception {
		
    	  
    	  String projectPath=System.getProperty("user.dir");  
  		  System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe"); 
    	  
  		  WebDriver driver = new ChromeDriver();

  		  driver.get("http://tinyupload.com/");
  		  
  		  Thread.sleep(2000);

  		  
  		WebElement element = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"));
  		
  		
  		 Actions builder = new Actions(driver);
  	     builder.moveToElement( element ).click( element );
  	     builder.perform();
  		
  		 Runtime.getRuntime().exec("C:\\Users\\ygtari\\Desktop\\FileUploadScript.exe");
  		  
  		  
  		  System.out.println("ok");
  		  
  		  Thread.sleep(2000);

  		  driver.close();
  		  driver.quit();
  		  
  		  
	}
	
	
	
}
