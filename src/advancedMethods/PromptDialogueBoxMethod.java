package advancedMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PromptDialogueBoxMethod {

	WebDriver driver;

	@Test
	public void dropdown() throws Exception {
		Thread.sleep(2000);
		driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.sendKeys("Sruthi");
		alt.accept();
		//alt.dismiss();
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
