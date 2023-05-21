package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
	
	WebElement dropdown = driver.findElement(By.name("menu"));
	
	Select sel = new  Select(dropdown);
	
	//select option
	for(int i=3; i<6; i++)
	{
		Thread.sleep(2000);
		sel.selectByIndex(i);
	}
	  Thread.sleep(2000);
	  WebElement firstoption = sel.getFirstSelectedOption();
	  String value = firstoption.getText();
	  System.out.println(value);

	}

}
