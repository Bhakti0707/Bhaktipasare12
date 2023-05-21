package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class IsDisplayedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	WebDriver	driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.netflix.com/in/login");
	WebElement usnTB = driver.findElement(By.name("userLoginId"));
	
	WebElement pwTB = driver.findElement(By.name("password"));
	
	WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
	
	if(usnTB.isDisplayed())
	{
		usnTB.sendKeys("asdertyfh@345");
	}
	else {
		   System.out.println("will get exception");
	    }
	if(pwTB.isDisplayed())
	{
		pwTB.sendKeys("3456756gty");
	}
	else {
		   System.out.println("will get exception");
	    }
	if(button.isDisplayed())
	  {
		button.click();
	  }
	else {
		    System.out.println("will get exception");
	    }

	}

}
