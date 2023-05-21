package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("http://127.0.0.1/login.do;jsessionid=6s41gt1km3ggp");
	
	 
	 driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 
	//method chaining
	 
	 driver.findElement(By.id("loginButton")).click();
	 
	 //store in reference variable
	 
	 //WebElement loginButton = driver.findElement(By.id("loginButton"));
	 //loginButton.click();

	}

}
