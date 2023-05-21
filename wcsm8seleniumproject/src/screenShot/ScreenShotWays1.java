package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWays1 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//create obj of chromedriver
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//consider we are taking ss of draganddrop web pag
		driver.get("https://demo.guru99.com/test/drag_drop.html");



		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/ss3.png");
		Files.copy(src, dest);




	}

}
