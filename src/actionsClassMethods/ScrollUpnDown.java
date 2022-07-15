package actionsClassMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ScrollUpnDown {

	WebDriver driver;

	@Test
	public void scrollDown() throws Exception {

		driver.get("http://www.seleniumlearn.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1500)");

	}
	
	@Test
	public void scrollUp() throws Exception {

		driver.get("http://www.seleniumlearn.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(600,0)");

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
