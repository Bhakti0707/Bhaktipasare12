package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 String button = driver.findElement(By.xpath("//button[text()=' Login ']")).getText();
		 System.out.println(button);
		 
		 String link = driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).getText();
		 System.out.println(link);
		 
		 

	}

}
