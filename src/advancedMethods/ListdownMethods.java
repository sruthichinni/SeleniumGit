package advancedMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ListdownMethods {

	WebDriver driver;

	@Test
	public void dropdown() throws Exception {

		driver.get("http://www.seleniumlearn.com/simple-program-select-and-multi-select-options");
		new Select(driver.findElement(By.name("food-items"))).selectByIndex(2);
		new Select(driver.findElement(By.name("food-items"))).selectByValue("Option4");
		new Select(driver.findElement(By.name("food-items"))).selectByVisibleText("Chocolate");
		Thread.sleep(3000);
		//new Select(driver.findElement(By.name("food-items"))).deselectAll();
		//new Select(driver.findElement(By.name("food-items"))).deselectByIndex(2);
		new Select(driver.findElement(By.name("food-items"))).deselectByValue("Option4");
		new Select(driver.findElement(By.name("food-items"))).deselectByVisibleText("Chocolate");
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
