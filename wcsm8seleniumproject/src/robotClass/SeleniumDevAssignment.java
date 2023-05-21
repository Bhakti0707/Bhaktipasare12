package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDevAssignment {

	public static void main(String[] args) throws AWTException, InterruptedException {
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
   //open the web application
   driver.get("https://www.selenium.dev/");
   
   //identify any one element getting started
   WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
   
   //to right click on getting starting webelement
   Actions act = new Actions(driver);
   act.contextClick(target).perform();
   
   //create obj of robot class
   Robot robot = new Robot();
   
   //to click on inspect to using for loop
   for(int i=0; i<=9; i++)
   {
	   robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	   Thread.sleep(2000);
	   robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   
   }
   
   //press enter to handle print
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
