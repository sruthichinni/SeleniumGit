package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGAlphabetical {

	WebDriver driver;

	@Test
	public void google() {

		driver.get("https://www.google.com");
	}

	@Test
	public void facebook() {

		driver.get("https://www.facebook.com");

	}

	@Test
	public void twitter() {

		driver.get("https://www.twitter.com");

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
