package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGPriority {
	
	WebDriver driver;
	
  @Test(priority=2)
  public void google() {
	  
	  driver.get("https://www.google.com");
	  
  }
  
  @Test
  public void facebook() {
	  
	  driver.get("https://www.facebook.com");
	  
  }
  
  @Test
  public void twitter() {
	  
	  driver.get("https://www.twitter.com");
	  
  }
  
  @Test(priority=0)
  public void zomato() {
	  
	  driver.get("https://www.zomato.com");
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
