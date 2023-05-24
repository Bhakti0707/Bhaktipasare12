package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement userModule;
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']") private WebElement taskModule;
	@FindBy(xpath="//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement timeTrackModule;
	@FindBy(xpath="//A[@class='content reports']/IMG[@class='sizer']") private WebElement reportModule;
	
	//intialization
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		
	//utilization
	
		public WebElement getLogoutLink() {
			return logoutLink;
		}

		public WebElement getUserModule() {
			return userModule;
		}

		public WebElement getTaskModule() {
			return taskModule;
		}

		public WebElement getTimeTrackModule() {
			return timeTrackModule;
		}

		public WebElement getReportModule() {
			return reportModule;
		}
		
		//operational Method
		public void logoutMethod()
		{
			logoutLink.click();
		}
		
		public void userModuleMethod()
		{
			userModule.click();
		}
	  

	
	

	
}
