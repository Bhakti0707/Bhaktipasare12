package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//record all the Webelement of login page by using @FindBy annotation
	
	@FindBy(name="username") private WebElement UserNameTB;
	@FindBy(name="pwd") private WebElement PasswordTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(name="remember") private WebElement checkBox;
	@FindBy(xpath="//a[text()='Actimind Inc.']") private WebElement actiMindLink;
	
	//initialization
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public WebElement getUserNameTB() {
		return UserNameTB;
	}
	public WebElement getPasswordTB() {
		return PasswordTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getActiMindLink() {
		return actiMindLink;
	}


	public void setUserNameTB(WebElement userNameTB) {
		UserNameTB = userNameTB;
	}


	public void setPasswordTB(WebElement passwordTB) {
		PasswordTB = passwordTB;
	}

	
	//operational method

	public void validLogin()
	{
		UserNameTB.sendKeys(invalidusername);
		PasswordTB.sendKeys(validPassword);
	}
	 
	//
	
}
