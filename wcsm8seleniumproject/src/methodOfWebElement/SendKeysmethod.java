package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://127.0.0.1/login.do;jsessionid=6s41gt1km3ggp");
	
	WebElement usernameTB = driver.findElement(By.name("username"));
	usernameTB.sendKeys("admin");
	
	 WebElement passwordTB = driver.findElement(By.name("pwd"));
	 passwordTB.sendKeys("manager");
	 
	

	}

}
