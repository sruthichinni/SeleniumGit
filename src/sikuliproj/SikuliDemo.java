package sikuliproj;

import org.testng.annotations.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliDemo {
	
	Screen s=new Screen();
	
  @Test
  public void demo1() throws FindFailed, InterruptedException {
	  
	  s.click("D:\\lib\\sikuli images\\window.PNG");
	  Thread.sleep(2000);
	  s.click("D:\\lib\\sikuli images\\speaker.PNG");
	  Thread.sleep(2000);
	  s.dragDrop("D:\\lib\\sikuli images\\bin.PNG", "D:\\lib\\sikuli images\\desktopimg.PNG");
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

}
