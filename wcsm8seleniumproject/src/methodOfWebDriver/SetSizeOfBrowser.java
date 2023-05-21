package methodOfWebDriver;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetSizeOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 Dimension targetSize=new Dimension(350,450);
		 Thread.sleep(2000);
		 driver.manage().window().setSize(targetSize);

	}

}
