package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownPuma {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("denyBtn")).click();
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,700)");
	
	
	
	

	}

}
