package com.eCommerce.actions;

import org.openqa.selenium.WebDriver;

import com.eCommerce.pages.HomePage;
import com.eCommerce.pages.LoginPage;

public class LoginPageActionsImpl implements LoginPageActions {
	
	WebDriver driver;
	LoginPage loginPage;
	
	public LoginPageActionsImpl (WebDriver driver) {

		this.driver = driver;
		HomePage homePage = new HomePage(driver);
		this.loginPage = new LoginPage(driver);
	}
	
	
	@Override
    public boolean isWelcomeSignInDisplayed() {
		return loginPage.isWelcomeSignInDisplayed();
	}
	
	@Override
	public void enterEmail(String email){
		loginPage.enterEmail(email);

	}
	
	@Override
	public void enterPassword(String password){
		loginPage.enterPassword(password);

	}
	
	@Override
	public void clickLoginButton() {
		loginPage.clickLoginButton();
	}
	
	@Override
	public boolean isLoginErrorDisplayed() {
		return loginPage.isLoginErrorDisplayed();
	}
	
	@Override
    public String getLoginErrorMessage() {
        return loginPage.getLoginErrorMessage();
    }
	
	
}
