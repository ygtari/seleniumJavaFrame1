package demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {	  
	    
    String projectPath=System.getProperty("user.dir");  
    System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");  
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
  }

  @Test
  public void test1() throws Exception {
    driver.get("https://www.youtube.com/watch?v=sVbXRfmipeg&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=30");
    driver.findElement(By.xpath("//div[@id='movie_player']/div/video")).click();
    driver.findElement(By.xpath("//div[@id='movie_player']/div/video")).click();
    driver.findElement(By.xpath("//div[@id='movie_player']/div/video")).click();
    driver.findElement(By.xpath("//div[@id='movie_player']/div/video")).click();
    driver.findElement(By.xpath("//div[@id='movie_player']/div/video")).click();
    driver.findElement(By.xpath("//div[@id='movie_player']/div/video")).click();
    driver.findElement(By.xpath("//div[@id='movie_player']/div/video")).click();
    driver.findElement(By.xpath("//div[@id='movie_player']/div/video")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
