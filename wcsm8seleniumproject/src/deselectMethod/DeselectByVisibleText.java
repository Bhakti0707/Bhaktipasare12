package deselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
	
	WebElement dropdown = driver.findElement(By.name("menu"));
	
	
	//to select the options
	Select sel = new Select(dropdown);
	sel.selectByVisibleText("chakali");
	Thread.sleep(2000);
	sel.selectByVisibleText("manchurian");
	
	//deselect the option
	Thread.sleep(2000);
	sel.deselectByVisibleText("chakali");
	Thread.sleep(2000);
	sel.deselectByVisibleText("manchurian");
	

	}

}
