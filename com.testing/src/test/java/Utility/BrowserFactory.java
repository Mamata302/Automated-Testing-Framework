package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public static WebDriver startapplication(WebDriver driver, String browsername, String appurl)  {
		
			if(browsername.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			else if(browsername.equals("edge")) {
				WebDriverManager.chromedriver().setup();
				driver = new EdgeDriver();				
			}
			
			else if(browsername.equals("firefox")) {
				WebDriverManager.chromedriver().setup();
				driver = new FirefoxDriver();				
			}
		
			else {
				System.out.println("Invalid Browser Name");
			}
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
			driver.manage().window().maximize();
			driver.get(appurl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				return driver;
	}
	

		public static void quitBrowser(WebDriver driver) {
			driver.close();

		}
		
	}


