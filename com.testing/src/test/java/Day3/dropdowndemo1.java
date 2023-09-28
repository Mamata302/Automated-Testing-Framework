package Day3;
	
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class dropdowndemo1 {

		public static void main(String[] args) throws InterruptedException, IOException {

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.get("https://blazedemo.com/");

			driver.manage().window().maximize();
			Thread.sleep(2000);

			WebElement ele = driver.findElement(By.name("fromPort"));

			Select drp = new Select(ele);

			drp.selectByValue("Boston");
			Thread.sleep(2000);

			WebElement ele1 = driver.findElement(By.name("toPort"));
			Select drp1 = new Select(ele1); 
			drp1.selectByValue("Rome");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
			Thread.sleep(2000);
			
			
			WebElement ele4 = driver.findElement(By.id("inputName"));
			ele4.clear();
			Thread.sleep(1000);
			ele4.sendKeys("John");
			Thread.sleep(1000);
			
			WebElement ele5 = driver.findElement(By.id("address"));
			ele5.clear();
			Thread.sleep(1000);
			ele5.sendKeys("10/16, Main road");
			Thread.sleep(1000);
			
			WebElement ele6 = driver.findElement(By.id("city"));
			ele6.clear();
			Thread.sleep(1000);
			ele6.sendKeys("Noida");
			Thread.sleep(1000);
			
			WebElement ele7 = driver.findElement(By.id("state"));
			ele7.clear();
			Thread.sleep(1000);
			ele7.sendKeys("New Delhi");
			Thread.sleep(1000);
			
			WebElement ele8 = driver.findElement(By.id("zipCode"));
			ele8.clear();
			Thread.sleep(1000);
			ele8.sendKeys("201013");
			Thread.sleep(1000);
			
			WebElement ele10 = driver.findElement(By.name("cardType"));
			Select drp2 = new Select(ele10);
			drp2.selectByValue("amex");
			Thread.sleep(1000);
			
			WebElement ele9 = driver.findElement(By.id("creditCardNumber"));
			ele9.clear();
			Thread.sleep(1000);
			ele9.sendKeys("9876543210012");
			Thread.sleep(1000);
			
			WebElement ele2 = driver.findElement(By.name("creditCardMonth"));
			ele2.clear();
			Thread.sleep(1000);
			ele2.sendKeys("5");
			Thread.sleep(1000);
			
			WebElement ele3 = driver.findElement(By.name("creditCardYear"));
			ele3.clear();
			Thread.sleep(1000);
			ele3.sendKeys("2023");

			WebElement ele11 = driver.findElement(By.name("nameOnCard"));
			ele11.clear();
			Thread.sleep(1000);
			ele11.sendKeys("John Thomas");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
			Thread.sleep(1000);
			
			
			TakesScreenshot sc = ((TakesScreenshot) driver);

			File src = sc.getScreenshotAs(OutputType.FILE);
			File f2 = new File("C:\\Users\\user\\Desktop\\Screenshot\\screenshot1.png");
			FileUtils.copyFile(src, f2);

			Thread.sleep(2000);
			driver.close();

		}

	}
