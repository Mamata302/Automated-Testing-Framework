package PageObject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
	
		driver = BrowserFactory.startapplication(driver,"chrome", "https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void teardown() {
		
		BrowserFactory.quitBrowser(driver);
	}
	
}