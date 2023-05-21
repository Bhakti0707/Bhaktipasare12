package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver	driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.netflix.com/in/login");
		
		WebElement unTB = driver.findElement(By.name("userLoginId"));
		unTB.sendKeys("cvfgtyjhui");
		
		WebElement pwTB = driver.findElement(By.name("password"));
		 pwTB.sendKeys("ghyt5678456");
		 
		 WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		 button.click();
		 
	}
}

