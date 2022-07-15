package actionsClassMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseHover {

	WebDriver driver;

	@Test
	public void mouseHover() throws Exception {

		driver.get("http://www.seleniumlearn.com/double-click");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().perform();

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
