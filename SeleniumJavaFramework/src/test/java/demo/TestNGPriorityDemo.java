package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test
	public void one() {
	  System.out.println("Im inside test 1");	
	}
	
	@Test(priority = 1)
	public void two() {
	  System.out.println("Im inside test 2");	
	}
	
	@Test(priority = 2)
    public void  three(){
	  System.out.println("Im inside test 3");	
	}
	
	
}
