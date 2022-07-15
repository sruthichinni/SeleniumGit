package actionsClassMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightClick {

	WebDriver driver;

	@Test
	public void rightClick() throws Exception {

		driver.get("http://www.seleniumlearn.com/");
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.id("menu-337-1"))).build().perform();

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
