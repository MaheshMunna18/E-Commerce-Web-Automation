package com.eCommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.eCommerce.utils.WaitUtils;

public class LoginPage {

	WebDriver driver;

	By welcomeSignInText = By.xpath("//div[@class='page-title']//h1[text()='Welcome, Please Sign In!']");
	By emailField = By.xpath("//label[contains(text(), 'Email:')]/following::input[@id='Email']");
	By passwordField = By.xpath("//label[contains(text(), 'Password:')]/following::input[@id='Password']");
	By loginButton = By.xpath("//input[@value='Log in']");	
	By loginErrorMessage = By.xpath("//div[@class='validation-summary-errors']/span[contains(text(),'Login was unsuccessful.')]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isWelcomeSignInDisplayed() {
		WaitUtils.waitForVisibility(driver, welcomeSignInText, 5);
		return driver.findElement(welcomeSignInText).isDisplayed();
	}

	public void enterEmail(String email) {
		WaitUtils.waitForVisibility(driver, emailField, 5);
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys(email);
	}

	public void enterPassword(String password) {
		WaitUtils.waitForVisibility(driver, passwordField, 5);
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLoginButton() {
		WaitUtils.waitForVisibility(driver, loginButton, 5);
		driver.findElement(loginButton).click();
	}

	public boolean isLoginErrorDisplayed(){
		WaitUtils.waitForVisibility(driver, loginErrorMessage, 5);
		return driver.findElement(loginErrorMessage).isDisplayed();
	}
	
	public String getLoginErrorMessage() {
		WaitUtils.waitForVisibility(driver, loginErrorMessage, 5);
	    return driver.findElement(loginErrorMessage).getText();
	}

}
