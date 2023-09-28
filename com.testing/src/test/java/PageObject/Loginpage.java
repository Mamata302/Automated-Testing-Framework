package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	Loginpage lp;
	WebDriver driver;
	
	public Loginpage(WebDriver ldriver) {
		
		this.driver = ldriver;
		
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(id="user-name")
	WebElement uname;
		
	@FindBy(id="password")
	WebElement pswd;
	
	@FindBy(id="login-button")
	WebElement button;
	
	public void enterusername(String Username)	{
		uname.clear();
		uname.sendKeys(Username);
	}
	
	public void enterpassword(String Password)	{
		pswd.clear();
		pswd.sendKeys(Password);
	}
	
	public void clickonloginbutton()	{
		button.click();
		
	}
	
}


	
