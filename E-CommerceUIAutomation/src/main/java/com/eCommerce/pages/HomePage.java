package com.eCommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.eCommerce.utils.WaitUtils;


public class HomePage {

	WebDriver driver;

	By logo =  By.xpath("//img[contains(@alt, 'Tricentis Demo Web Shop')]"); 
	By topHeaderMenu = By.xpath("//ul[@class='top-menu']//a[@href='/books']");
	By computerslink = By.xpath("//h3[text()='My account']");
	By myaccount = By.xpath("//h3[text()='My account']");
	By customerservice = By.xpath("//h3[text()='Customer service']");
	By registerLink = By.xpath("//a[text()='Register']");
	By loginLink = By.xpath("//div[@class='header-links']//a[text()='Log in']");
	By logouttxt = By.xpath("//div[@class='header-links']//a[contains(text(), 'Log out')]");
	By useremail = By.xpath("//div[@class='header-links']//a[@class='account'] ");
	
	
	public HomePage(WebDriver driver) {
		
		if (driver == null) {
	        throw new RuntimeException("WebDriver is NULL in HomePage!");
	    }
		this.driver = driver;
	}

	public boolean isLogoDisplayed() {
		WaitUtils.waitForVisibility(driver, logo, 5);
		return driver.findElement(logo).isDisplayed();
	}

	public boolean isNavBarBooksLinkDisplayed() {
		WaitUtils.waitForVisibility(driver, topHeaderMenu, 5);
		return driver.findElement(topHeaderMenu).isDisplayed();
	}

	public boolean isNavBarcomputersLinkDisplayed() {
		WaitUtils.waitForVisibility(driver, computerslink, 5);
		return driver.findElement(computerslink).isDisplayed();
	}

	public boolean isFooterMyAccountDisplayed() {
		WaitUtils.waitForVisibility(driver, myaccount, 5);
		return driver.findElement(myaccount).isDisplayed();
	}

	public boolean isFooterCustomerServiceDisplayed() {
		WaitUtils.waitForVisibility(driver, customerservice, 5);
		return driver.findElement(customerservice).isDisplayed();
	}

	public boolean isRegisterLinkDisplayed() {
		WaitUtils.waitForVisibility(driver, registerLink, 5);
		return driver.findElement(registerLink).isDisplayed();
	}
	
	public void clickRegisterLink() {
		WaitUtils.waitForClickability(driver, registerLink, 5);
		driver.findElement(registerLink).click();
		RegisterPage registerpage = new RegisterPage(driver);
	}
	public boolean isLoginLinkDisplayed() {
		WaitUtils.waitForVisibility(driver, loginLink, 5);
		return driver.findElement(loginLink).isDisplayed();
	}
	public void clickLoginLink() {
		WaitUtils.waitForVisibility(driver, loginLink, 5);
		driver.findElement(loginLink).click();
		LoginPage loginpage = new LoginPage(driver);
	}

	public boolean isLoginSuccessful() {
		WaitUtils.waitForVisibility(driver, logouttxt, 5);
		WaitUtils.waitForVisibility(driver, useremail, 3);
		return driver.findElement(logouttxt).isDisplayed() && 
				driver.findElement(useremail).isDisplayed();
	}
	
	
	public void navigateToProductDetailsPage(String category) {
		By productCategory = By.xpath("//ul[@class='top-menu']//a[contains(text(), '"+category+"')]");
		WaitUtils.waitForVisibility(driver, productCategory, 5);
		driver.findElement(productCategory).click();
	}
}
