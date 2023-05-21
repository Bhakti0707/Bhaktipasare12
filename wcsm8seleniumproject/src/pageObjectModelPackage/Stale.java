package pageObjectModelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://127.0.0.1/login.do;jsessionid=6dt2pet7tcj64");
	
	WebElement UserNameTB = driver.findElement(By.name("username"));
	
	UserNameTB.sendKeys("admin");
	
	WebElement PasswordTB = driver.findElement(By.name("pwd"));
	PasswordTB.sendKeys("manager");
	
	//WebElement button = driver.findElement(By.id("ligonButton"));
	//button.click();
	driver.navigate().refresh();
	
	//UNTB.clear();
	Thread.sleep(2000);
	UserNameTB.sendKeys("admin");
	
	

	}

}
