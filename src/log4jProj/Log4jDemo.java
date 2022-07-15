package log4jProj;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	
	WebDriver driver;

	@Test
	public void googleSearch() throws InterruptedException {

		Logger log = Logger.getLogger("Google");
		PropertyConfigurator.configure("Log4j.properties");
			
		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Launched chrome browser window");
		
		driver.manage().window().maximize();
		log.info("Browser Window maximize");
		
		driver.get("http://www.google.com");
		log.info("Opening URL in browser");
		
		driver.findElement(By.name("q")).sendKeys("Log4j tutorials");
		log.info("Searching log4j tutorials");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Clicking enter");
		
		driver.navigate().back();
		log.info("Returning back to the google search page");
		
		driver.navigate().forward();
		log.info("returning forward to search results");
		
		Thread.sleep(2000);
		log.info("wait for 2 seconds");
		
		driver.close();
		log.info("closing the browser");
		

	}
}
