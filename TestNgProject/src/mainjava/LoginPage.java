package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testjava.BaseTest;

public class LoginPage extends BaseTest
{
	
	
	@FindBy(xpath="//*[text()='Username']//parent::div//parent::div//input")
	WebElement username;
	
	@FindBy(xpath="//*[text()='Password']//parent::div//parent::div//input")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement btnLogin;
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginMethod()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnLogin.click();
	}
	
}

