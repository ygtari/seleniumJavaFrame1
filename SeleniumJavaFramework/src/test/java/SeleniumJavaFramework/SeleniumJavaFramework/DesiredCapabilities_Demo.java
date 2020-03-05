package SeleniumJavaFramework.SeleniumJavaFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver",projectPath+"/drivers/iedriver/IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver(caps);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		Thread.sleep(2000);
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
        driver.close();
        driver.quit();
          
	}

	
	
}
