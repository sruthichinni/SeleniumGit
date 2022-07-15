package advancedMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NavigationMethods {
	
	WebDriver driver;
	
  @Test
  public void navigation() throws Exception {
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.zomato.com");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
  }
  
  @BeforeTest
  public void beforeTest() {
  
  System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
	  
  }

}
