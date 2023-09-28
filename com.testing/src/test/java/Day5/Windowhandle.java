package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]/span")).click();
		
		Set<String> windowid = driver.getWindowHandles();

		List<String> windowlist = new ArrayList<String>(windowid);

		String pwindoid = windowlist.get(0);
		System.out.println("Pwindoid=:" + pwindoid);

		String cwindoid = windowlist.get(1);
		System.out.println("cwindoid=:" + cwindoid);
		Thread.sleep(4000);
		driver.switchTo().window(pwindoid);

		System.out.println("The title of parent page is=:" + driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().window(cwindoid);
		System.out.println("The childwinod title is=:" + driver.getTitle());

		Thread.sleep(4000);
		driver.quit();
	}
				
	}
	