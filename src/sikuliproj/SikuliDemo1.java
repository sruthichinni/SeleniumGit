package sikuliproj;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliDemo1 {
	
	WebDriver driver;
	Screen s=new Screen();
	
  @Test
  public void demo1() throws FindFailed, InterruptedException {
	  
	  
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(2000);
	  s.type("D:\\lib\\sikuli images\\search.PNG", "phonics song");
	  
	  s.click("D:\\lib\\sikuli images\\ysearch.PNG");
	  s.click("D:\\lib\\sikuli images\\phonicslink.PNG");
	  s.click("D:\\lib\\sikuli images\\play.PNG");
	  s.click("D:\\lib\\sikuli images\\maximize.PNG");
	  s.click("D:\\lib\\sikuli images\\pause.PNG");
	  s.click("D:\\lib\\sikuli images\\settings.PNG");
  }
  
  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
