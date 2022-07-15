package advancedMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ConfirmationAlertMethod {

	WebDriver driver;

	@Test
	public void dropdown() throws Exception {
		Thread.sleep(2000);
		driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(2000);
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
