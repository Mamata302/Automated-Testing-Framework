package Day2;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		String expectedurl = "https://www.saucedemo.com/";

		String actualurl = driver.getCurrentUrl();

		if (expectedurl.equals(actualurl)) {
			System.out.println("Correct url");
		} else {
			assertTrue(false);
		}

														//	OR	assertEquals(expected url, actual url);
														//		assertTrue(true);

		String expectedtitle = "Swag Labs";

		String actualtitle = driver.getTitle();

		if (expectedtitle.equals(actualtitle)) {
			System.out.println("Correct title");
		} else {
			assertTrue(false);
		}

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		/*driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);*/
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("first-name"));
		ele2.sendKeys("Smita");
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("last-name"));
		ele3.sendKeys("Mishra");
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("postal-code"));
		ele4.sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		
		TakesScreenshot sc = ((TakesScreenshot) driver);

		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\user\\Desktop\\Screenshot\\screenshot.png");
		FileUtils.copyFile(src, f2);
		

		Thread.sleep(2000);
		driver.close();

	}

}