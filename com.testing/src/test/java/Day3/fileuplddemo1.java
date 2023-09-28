package Day3;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class fileuplddemo1 {
		
		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/upload");

			driver.manage().window().maximize();

			Thread.sleep(3000);

			driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user\\Downloads\\uploadfile.txt");
			Thread.sleep(3000);

			driver.findElement(By.id("file-submit")).click();

			Thread.sleep(3000);
			driver.close();
		}

	}
