package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGSruthi {

	@Test(groups= {"sanity"})
	public void tc1() {

		System.out.println("This is testcase1");
		
	}
	
	@Test(groups= {"sanity"})
	public void tc2() {

		System.out.println("This is testcase2");
		
	}
	
	@Test(groups= {"regression"})
	public void tc3() {

		System.out.println("This is testcase3");
		
	}
	
	@Test(groups= {"regression"})
	public void tc4() {

		System.out.println("This is testcase4");
		
	}
	
	@Test(groups= {"sanity","regression"})
	public void tc5() {

		System.out.println("This is testcase5");
		
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
