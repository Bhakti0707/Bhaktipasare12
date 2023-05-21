package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//switch to control to frame for click on chat box
		driver.switchTo().frame("fc_widget"); //by using name and id
		Thread.sleep(2000);
		
		
		WebElement chatbox = driver.findElement(By.id("chat-icon"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(chatbox)).click();
		//switch the control to default web page
		driver.switchTo().defaultContent();
		
		//insert the input for text box
		driver.findElement(By.id("chat-fc-name")).sendKeys("sari-123");
		
		driver.findElement(By.id("chat-fc-email")).sendKeys("sarika@12gmail.com");
		
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1254674353");
		


	}

}
