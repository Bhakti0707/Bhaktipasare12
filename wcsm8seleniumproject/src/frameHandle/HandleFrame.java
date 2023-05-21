package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/Username.html");
		
		WebElement UNB = driver.findElement(By.id("i2"));
		UNB.sendKeys("admin");
		
		WebElement frameelement = driver.findElement(By.name("frame"));
		
		driver.switchTo().frame(frameelement); //handle by using web element as a frame
		Thread.sleep(2000);
		
		WebElement PWD = driver.findElement(By.id("i1"));
		PWD.sendKeys("manager");
		
		Thread.sleep(2000);
	
		PWD.clear();
		UNB.clear();
		
	}

}
