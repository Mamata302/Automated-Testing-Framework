package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RecordingTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setup( ) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	}

	@Test
	 public void Verifylinks() throws Exception {
		
		ScreenRecorderUtil.startRecord("Verifylinks");
	
		 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/a")).click();
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/a")).click();
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[6]/a")).click();
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[7]/a")).click();
		 System.out.println(driver.getTitle());
		 
		 ScreenRecorderUtil.stopRecord();
	 }
	
	 @AfterMethod
	 public void teardown() {
		 
		 driver.close();
		
	 }
	 
}

	