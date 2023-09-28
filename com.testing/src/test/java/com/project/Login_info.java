package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_info {

																				// pom, Webpage >> application >> class

	public static void main(String[] args) throws InterruptedException {

																				// Setting up the Webdriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

																				// Opening a url
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

																				// Maximize the driver
		driver.manage().window().maximize();

																				// return url of the current page
		String url = driver.getCurrentUrl();
		System.out.println("The url of the page is=:" + url);

																				// return the title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is=:" + title);

																				//return the page source
		String pagesource=driver.getPageSource();
		System.out.println("The page source=:"+pagesource);
		
		
		Thread.sleep(2000);

																				// Closing the driver
		driver.close();

	}

	}
