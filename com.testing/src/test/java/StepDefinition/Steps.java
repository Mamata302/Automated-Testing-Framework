package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	public WebDriver driver;
	Loginpage l;
	

@Given("User Launch Chrome Browser")
public void user_launch_chrome_browser() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote--allow--origins=*");
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver(options);
	
	l = new Loginpage(driver);
   
}

@When("User opens url {string}")
public void user_opens_url(String url) {
   driver.get(url);
	
}

@And("User enter Username as {string} and Password as {string}")
public void user_enter_username_as_and_password_as(String uname, String pswd) {
    l.enterusername(uname);
	l.enterpassword(pswd);
}

@And("Click on Login")
public void click_on_login() {
    l.clickonloginbutton();
	
}

@Then("Page url should be {string}")
public void page_url_should_be(String actual) {
	String expectedurl=driver.getCurrentUrl();
	if(expectedurl.equals(actual)) {
		System.out.println("True");
		}
		else 
		{
		System.out.println("False");
	}
}

@And("Close the Browser")
public void close_the_browser() {
    driver.close();
}


}
