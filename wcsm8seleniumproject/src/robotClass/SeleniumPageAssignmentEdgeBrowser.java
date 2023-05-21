package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPageAssignmentEdgeBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException {
	  
		//launch the edge browser
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//open the browser
	  driver.get("https://www.selenium.dev/");
	  
	//identify any one element getting started
	  WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
	  
	  //to right click on getting starting web element
	  Actions act = new Actions(driver);
	  act.contextClick(target).perform();
	  
	  //create obj robot class
	  Robot robot = new Robot();
	  
	  //to click on inspect by using for loop
	  for(int i=0; i<=13; i++)
	  {
		  robot.keyPress(KeyEvent.VK_DOWN);
		  Thread.sleep(2000);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  	  
	  }
	  //press enter to handle print
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
