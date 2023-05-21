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

public class BlueStoneAssignment {

	public static void main(String[] args) throws InterruptedException, AWTException  {
	  
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	 driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	
	//handle popup
	driver.findElement(By.id("denyBtn")).click();
	
	//identify watch jewellary web element
	WebElement watchjewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	
	//to create obj of actions class
	Actions act = new Actions(driver);
	
	//move to the element
	act.moveToElement(watchjewellery).perform();
	
	//click on band
	driver.findElement(By.xpath("//a[text()='Band']")).click();
	
	//identify webelement filterby
	 WebElement filterby = driver.findElement(By.xpath("//div[text()='Filter by']"));
	 
	 Thread.sleep(2000);
	 for(int i=0; i<=2; i++)
	 {
		 act.clickAndHold(filterby).perform();
	 }
	
	//create object robot class
	 Robot robot = new Robot();
	 
	 
	 ////copy the web element using ctrl+c
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_C);
	 
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_C);
	 
	 //identify the web element of search box
	 driver.findElement(By.name("search_query")).click();
	 
	 //paste the filter by
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
	 Thread.sleep(2000);
	 //identify the search button webelement
	 WebElement searchbox = driver.findElement(By.name("submit_search"));
	 searchbox.submit();
	 
	 
	}

}
