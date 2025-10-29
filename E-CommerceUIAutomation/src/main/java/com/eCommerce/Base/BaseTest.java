package com.eCommerce.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public static WebDriver driver;
	
	
	public static void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
	
	public static WebDriver getDriver() {
        return driver;
    }
}
