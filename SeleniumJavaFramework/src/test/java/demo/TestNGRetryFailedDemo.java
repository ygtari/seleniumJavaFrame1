package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

	@Test
	public void test1() {
		System.out.println("Im inside test 1");
	}
	

	@Test
	public void test2() {
		System.out.println("Im inside test 2");
		int i=1/1;
	}
	
	@Test(retryAnalyzer =listeners.RetryAnalyzer.class )
	public void test3() {
		System.out.println("Im inside test 3");
		Assert.assertTrue(false);
	}
	
	
}
