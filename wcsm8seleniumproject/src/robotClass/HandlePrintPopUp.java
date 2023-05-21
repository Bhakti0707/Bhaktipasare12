package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintPopUp {
	
  //we can handle print popup by using robot class
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//enter the url of(blue stone)
	driver.get("https://www.selenium.dev/");
	
	
	//generate print pop up by using ctrl+p
	Robot robot = new Robot();
	Thread.sleep(2000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_P);
	
	//shift control to cancel
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	//press enter to handle pop up
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	driver.quit();

	}

}
