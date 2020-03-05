package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)

public class TestNGListenerDemo {

	@Test
	public void test1() {
		System.out.println("I m inside test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I m inside test 2");
		Assert.assertTrue(false);
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("fakebox-input")).sendKeys("abcd");
		driver.findElement(By.id("abcd")).sendKeys("abcd");

		
		
		
		
	}
	
	@Test
	public void test3() {
		System.out.println("I m inside test 3");
		throw new SkipException("This test is skipped");
	}
	
	
	
}
