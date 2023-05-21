package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//by using implicit wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
	
	//by using getRect method
	Rectangle rect = button.getRect();
	
	//get the location of web element
	int xaxis = rect.getX();
	int yaxis = rect.getY();
	System.out.println("x axis :"+xaxis+" yaxis :"+yaxis);
	
	//get the hight and width of web element
	
	int h = rect.getHeight();
	int w = rect.getWidth();
	
	System.out.println("heigth :"+h+" width :"+w);
	
	
	
	

	}

}
