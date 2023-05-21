package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-orinis=*");
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	 driver.get("http://omayo.blogspot.com/");
	 Thread.sleep(2000);
	 driver.quit();
	}

}
