package advancedMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropdownMethods {
	
	WebDriver driver;
	
  @Test
  public void dropdown() throws Exception {
	  
	  driver.get("http://www.seleniumlearn.com/program-drop-down-select-option");
	  //new Select(driver.findElement(By.id("transactionType"))).selectByVisibleText("SEO");
	  //new Select(driver.findElement(By.id("transactionType"))).selectByValue("6");
	  new Select(driver.findElement(By.id("transactionType"))).selectByIndex(2);
		  
  }
  
  @BeforeTest
  public void beforeTest() {
  
  System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
	  
  }

}
