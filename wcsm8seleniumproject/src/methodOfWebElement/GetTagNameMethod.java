package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
	 System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	 EdgeDriver driver=new EdgeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.selenium.dev/");
	 
	 WebElement element = driver.findElement(By.xpath("//h2[text()='News']"));
	 
	 String tagNameofnews = element.getTagName();
	 
	 System.out.println(tagNameofnews);

	}

}
