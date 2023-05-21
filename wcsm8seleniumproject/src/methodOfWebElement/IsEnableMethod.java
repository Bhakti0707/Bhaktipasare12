package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnableMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver	driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.netflix.com/in/login");
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Sign In']"));
		 
		boolean verifybutton = loginbutton.isEnabled();
		
		System.out.println(verifybutton);
		
		WebElement unTB = driver.findElement(By.name("userLoginId"));
		unTB.sendKeys("awedrt45677");
		
		WebElement pwTB = driver.findElement(By.name("password"));
		pwTB.sendKeys("frtgy456789");
		
		boolean verify = loginbutton.isEnabled();
		
		
		System.out.println(verify);
		
		
		

	}

}
