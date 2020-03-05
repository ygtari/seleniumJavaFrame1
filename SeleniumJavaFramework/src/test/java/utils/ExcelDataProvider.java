package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	
	static WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ygtari\\Desktop\\tutorial\\chromedriver.exe");
		driver=new ChromeDriver();
		

	}
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		
		
		String excelPath="C:\\Users\\ygtari\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx";
		testData(excelPath,"Feuil1");
		
		
	}
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password) throws InterruptedException {
		
		System.out.println(username+"  "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		
	}
	
	
	@DataProvider(name="test1data")
	public static Object[][] getData() throws IOException {
		
		String excelPath="C:\\Users\\ygtari\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx";

		
		Object data[][]  =testData(excelPath,"Feuil1");
		return data;
		
	}
	
	
	public static Object[][] testData(String excelPath,String sheetName) throws IOException {
		
		ExcelUtils excel=new ExcelUtils(excelPath, sheetName);
		
		
    	int rowCount=excel.getRowCount();
        int colCount=excel.getColCount();
		
        Object data[][]=new Object[rowCount-1][colCount];
        
        
        for(int i=1;i<rowCount;i++ ) {
        	
        	for(int j=0;j<colCount;j++) {
        		
        	  String cellData=excel.getCellDataString(i,j);
        	  System.out.print(cellData);
        	  data[i-1][j]= cellData;
        	  
        	}
    
        System.out.println(); 	
        	
        }
        
		return data;
	}
	
	@AfterTest
    public void tearDownTest() {
	  
	   driver.close();
	   driver.quit();
	   System.out.println("Test Completed successfully");
	  
	  
  }
	
	
	
	
}
