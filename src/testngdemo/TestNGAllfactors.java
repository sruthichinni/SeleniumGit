package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGAllfactors {

	WebDriver driver;

	@Test(description="facebookmethod",dependsOnMethods="method2")
	public void method1() {

		// driver.get("https://www.facebook.com");
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Test(description="googlemethod",priority=1)
	public void method2() {

		driver.get("https://www.google.com");

	}

	@Test(description="zomatomethod")
	public void method3() {

		driver.get("https://www.zomato.com");

	}

	@Test(description="twittermethod",timeOut=1000)
	public void method4() {

		driver.get("https://www.twitter.com");

	}

	@Test(description="youtubemethod",enabled=false)
	public void method5() {

		driver.get("https://www.youtube.com");

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
