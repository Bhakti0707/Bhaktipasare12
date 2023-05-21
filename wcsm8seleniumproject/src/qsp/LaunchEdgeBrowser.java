package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//to avoid illegalstateException
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		//to launch edgebrowser
	WebDriver	driver=new EdgeDriver();
	
	//to maximizebroweser
	driver.manage().window().maximize();
	
	//to stop screen 2sec
	Thread.sleep(2000);
	
	//to close browser
	driver.close();

	}

}
