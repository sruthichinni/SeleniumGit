package advancedMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Assertions {
	
	WebDriver driver;
	
	
	@Test(priority=1)
	  public void titleTest() {
		  
		  driver.get("https://www.youtube.com/");
		  String title=driver.getTitle();
		  Assert.assertEquals("YouTube", title);
	  }
	
	@Test(priority=2)
	  public void urlTest() {
		  
		  String url=driver.getCurrentUrl();
		  Assert.assertEquals("https://www.youtube.com/", url);
	  } 
	
	@Test(priority=3)
	  public void colorTest() {
		  
		  String bgcolor=driver.findElement(By.xpath("//*[@id=\"chips\"]/yt-chip-cloud-chip-renderer[2]")).getCssValue("color");
		  Assert.assertEquals("rgba(3, 3, 3, 1)", bgcolor);
		  driver.close();
	  }  
	 	
   
  @BeforeTest
  public void beforeTest() {
  
  System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  
  }
  

}
