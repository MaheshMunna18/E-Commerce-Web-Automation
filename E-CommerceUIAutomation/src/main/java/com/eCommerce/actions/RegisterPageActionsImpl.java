package com.eCommerce.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eCommerce.pages.HomePage;
import com.eCommerce.pages.RegisterPage;

public class RegisterPageActionsImpl implements RegisterPageActions {
	
	WebDriver driver;
    RegisterPage registerPage;

    public RegisterPageActionsImpl(WebDriver driver) {
        this.driver = driver;
        HomePage homepage = new HomePage(driver);
        this.registerPage = new RegisterPage(driver);
    }
    
    
    @Override
    public boolean isRegisterHeaderDisplayed() {
    	
    	return registerPage.isRegisterHeaderDisplayed();
    }

   

    @Override
    public void selectGender(String gender) {
        registerPage.selectGender(gender);
    }

    @Override
    public void enterFirstName(String firstName) {
        registerPage.enterFirstName(firstName);
    }

    @Override
    public void enterLastName(String lastName) {
        registerPage.enterLastName(lastName);
    }
    
    @Override
    public void enterEmail(String email) {
    	registerPage.enterEmail(email);
    }

    @Override
    public void enterPassword(String password) {
        registerPage.enterPassword(password);
    }

    @Override
    public void enterConfirmPassword(String confirmPassword) {
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @Override
    public void clickRegister() {
        registerPage.clickRegister();
    }

    @Override
    public boolean isRegistrationSuccess() {
        return registerPage.isRegistrationSuccessMessageDisplayed() &&
               registerPage.getRegistrationSuccessMessage().equals("Your registration completed");
    }

}
