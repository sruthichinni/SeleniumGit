package advancedMethods;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ArrayListAutomation {
	
	WebDriver driver;
	
  @Test
  public void irctc() throws Exception {
	  
	  driver.get("https://www.irctc.co.in");
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("e-Catering")).click();
	 
	  ArrayList<String> tab1=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab1.get(1));
	  
	  driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/div[1]/div[1]/div/div/div/div")).click();
	  driver.findElement(By.xpath("//*[@id=\"mobileNum\"]")).sendKeys("9000533315");
	  driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div/div[2]/div/form/input[2]")).sendKeys("abc@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div/div[2]/div/form/div[2]/button[2]")).click();
	  
	  driver.findElement(By.xpath("//div[@class='mb-3']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).click();
	 
	  ArrayList<String> tab0=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab0.get(0));
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
