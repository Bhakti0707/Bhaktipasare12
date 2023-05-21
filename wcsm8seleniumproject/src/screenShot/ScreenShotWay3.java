package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//WebDriver	driver=new ChromeDriver();
	RemoteWebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://127.0.0.1/login.do;jsessionid=c9r1rtf2gddd3");
	
	
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShot/ss5.png");
	Files.copy(src, dest);

	}

}
