package Day2;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screnshtdemo {

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
																		//screenshot method
		
		TakesScreenshot sc = ((TakesScreenshot) driver);

		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\cipl\\Documents\\images\\screenshot.png");
		FileUtils.copyFile(src, f2);
		
		
		

		Thread.sleep(2000);
		driver.close();

	}

}