package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentShopperStack {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
	  
		driver.manage().window().maximize();
		
		 //apply the implicit wait to appear the web element
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("23456789");
		
		//apply the explicit wait to appear the web element
		
		  WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  
		
		  WebElement CheckButton = driver.findElement(By.id("Check"));
		  
		  Wait.until(ExpectedConditions.elementToBeClickable(CheckButton)).click();
		 
		
		
		

	}

}
