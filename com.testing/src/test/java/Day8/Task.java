package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setuptask() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	}
	
	@Test
	public void logintask() throws InterruptedException {
	
	//Admin Area
	driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]/span")).click();
	Thread.sleep(3000);
	
	//Email
	WebElement ele = driver.findElement(By.id("Email']"));
	ele.clear();
	Thread.sleep(1000);
	ele.sendKeys("admin@yourstore.com");
	Thread.sleep(2000);
	
	//Password
	WebElement ele1 = driver.findElement(By.id("Password"));
	ele1.clear();
	Thread.sleep(1000);
	ele1.sendKeys("admin");
	Thread.sleep(2000);
	
	//Login
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	
	}
	
	@AfterMethod
	public void Teardown() {
	driver.close();
	
	}

}

