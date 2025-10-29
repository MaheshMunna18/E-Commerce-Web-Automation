package com.eCommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.eCommerce.utils.WaitUtils;

public class RegisterPage {

	WebDriver driver;

	By registertext = By.xpath("//div[@class='page-title']//h1[text()='Register']");
	By maleRadioButton = By.xpath("//label[contains(text(), 'Gender:')]/following::input[@id='gender-male']");
	By femaleRadioButton = By.xpath("//label[contains(text(), 'Gender:')]/following::input[@id='gender-female']");
	By firstNameField = By.xpath("//label[contains(text(), 'First name:')]/following::input[@id='FirstName']");
	By lastNameField = By.xpath("//label[contains(text(), 'Last name:')]/following::input[@id='LastName']");
	By emailField = By.xpath("//label[contains(text(), 'Email:')]/following::input[@id='Email']");
	By passwordField = By.xpath("//label[contains(text(), 'Password:')]/following::input[@id='Password']");
	By confirmPasswordField = By.xpath("//label[contains(text(), 'Confirm password:')]/following::input[@id='ConfirmPassword']");	
	By registerButton = By.xpath("//input[@id='register-button']");
	By registrationSuccessTxt = By.xpath("//div[@class='result' and 'Your registration completed']");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isRegisterHeaderDisplayed() {
		WaitUtils.waitForVisibility(driver, registertext, 5);
		return driver.findElement(registertext).isDisplayed();
	}
	
	public void selectGender(String gender) {
	    if (gender.equalsIgnoreCase("male")) {
	    	WaitUtils.waitForClickability(driver, maleRadioButton, 5);
	        driver.findElement(maleRadioButton).click();
	    } else if (gender.equalsIgnoreCase("female")) {
	    	WaitUtils.waitForClickability(driver, femaleRadioButton, 5);
	        driver.findElement(femaleRadioButton).click();
	    }
	}

	public void enterFirstName(String fname) {
		WaitUtils.waitForClickability(driver, firstNameField, 5);
	    driver.findElement(firstNameField).sendKeys(fname);
	}

	public void enterLastName(String lname) {
		WaitUtils.waitForClickability(driver, lastNameField, 5);
	    driver.findElement(lastNameField).sendKeys(lname);
	}

	public void enterPassword(String pwd) {
		WaitUtils.waitForClickability(driver, passwordField, 5);
	    driver.findElement(passwordField).sendKeys(pwd);
	}

	public void enterConfirmPassword(String cpwd) {
		WaitUtils.waitForClickability(driver, confirmPasswordField, 5);
	    driver.findElement(confirmPasswordField).sendKeys(cpwd);
	}
	
	public void enterEmail(String email) {
		WaitUtils.waitForClickability(driver, emailField, 5);
		driver.findElement(emailField).sendKeys(email);
	}

	public void clickRegister() {
		WaitUtils.waitForClickability(driver, registerButton, 5);
	    driver.findElement(registerButton).click();
	}
	
	public String getRegistrationSuccessMessage() {
		WaitUtils.waitForVisibility(driver, registrationSuccessTxt, 5);
	    return driver.findElement(registrationSuccessTxt).getText();
	}

	public boolean isRegistrationSuccessMessageDisplayed() {
		WaitUtils.waitForVisibility(driver, registrationSuccessTxt, 5);
	    return driver.findElement(registrationSuccessTxt).isDisplayed();
	}
	

}
