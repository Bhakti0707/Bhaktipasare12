package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver	driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=203ipcqk39691");
		
		WebElement checkbox = driver.findElement(By.name("remember"));
		boolean verify = checkbox.isSelected();
		
		System.out.println(verify);
		
		checkbox.click();
		
		boolean verify1 = checkbox.isSelected();
		System.out.println(verify1);
		

	}

}
