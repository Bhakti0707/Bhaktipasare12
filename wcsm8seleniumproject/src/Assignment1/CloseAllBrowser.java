package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));

		//find the position of web element
		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();

		//scrolling operation
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(" +xaxis+","+(yaxis-300)+")");
		link.click();

		//to handle or get the address of parent
		String wh = driver.getWindowHandle();
		System.out.println(wh);

		driver.quit();




	}

}
