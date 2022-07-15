package locators;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LocatorsDemo {

	WebDriver driver;

	@Test
  public void locators() throws InterruptedException {
	  
	 driver.get("http://hyderabadreport.com/user");
/*
     driver.findElement(By.id("edit-name")).sendKeys("sruthi"); //id
	 driver.findElement(By.name("pass")).sendKeys("9000533315"); //name
	 Thread.sleep(3000);
	 //driver.findElement(By.className("form-submit")).click(); //classname
	 driver.findElement(By.cssSelector("input.form-submit")).click(); //cssSelector
	 driver.findElement(By.linkText("Photos")).click(); //link text
	 driver.findElement(By.partialLinkText("Greater")).click(); //partial link text
	  
	 List<WebElement> totalimages=driver.findElements(By.tagName("img"));
	 System.out.println("Total number of images in hyderabadReport page are "+totalimages.size());
	 */
	 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[3]/input")).click();
	 driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
	 
	
	 
	  
  }

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
