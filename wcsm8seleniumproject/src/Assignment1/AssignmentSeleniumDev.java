package Assignment1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentSeleniumDev {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/");
		
		WebElement target = driver.findElement(By.xpath("//h2[text()='News']"));
		Point point = target.getLocation();
		 
	    int xaxis = point.getX();
	    int yaxis = point.getY();
	    
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		System.out.println(yaxis);
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-300)+")");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(target)).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		Thread.sleep(2000);
		
		 Robot robot = new Robot();
		  
		  //to click on inspect by using for loop
		  for(int i=0; i<=9; i++)
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
