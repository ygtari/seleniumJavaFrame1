/**
 * 
 */
package SeleniumJavaFramework.SeleniumJavaFramework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author ygtari
 *
 */
public class BrowserTest {

		
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String projectPath=System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		
		//System.setProperty("webdriver.ie.driver",projectPath+"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver =new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		//WebElement textBox= driver.findElement(By.name("q"));
		//textBox.sendKeys("Automation Step by Step");

		 List<WebElement> listOfinputElements=driver.findElements(By.xpath("//input[@name='q']"));
		
		 int count=listOfinputElements.size();
		 System.out.println("Count of input elements :"+count);
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
	
	
	
	
	
}
