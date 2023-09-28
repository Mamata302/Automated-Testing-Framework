package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'  and contains(@id,'day')]"));
		
		System.out.println(checkboxes.size());
		
		for (WebElement box : checkboxes) {
			
			String Checked = box.getAttribute("id");
			
			System.out.println(Checked);
			
			if (Checked.equals("monday") || Checked.equals("tuesday")) {
				
				box.click();
			}
			 
		}
			Thread.sleep(2000);
		
		List<WebElement> radiobuttons= driver.findElements(By.xpath("//input[@type='radio'  and contains(@value,'option')]"));
		
		System.out.println(radiobuttons.size());
		
		for (WebElement radioButton : radiobuttons) {
			
			String radiobuttonId = radioButton.getAttribute("id");
			
			System.out.println(radiobuttonId);
			
			if (radiobuttonId.equals("female")|| radiobuttonId.equals("male")) {
				
				radioButton.click();
				
				Thread.sleep(2000);
			}
			
		}
				
		 Thread.sleep(2000);
		 
		 driver.close();
		
	}
	

}
