package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
	
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdown);
	
	for(int i=0; i<7; i++)
	{
		sel.selectByIndex(i);
	}
	List<WebElement> alloptions = sel.getAllSelectedOptions();
	
	for(WebElement op:alloptions)
	{
		String options = op.getText();
		System.out.println(options);
	}

	}

}
