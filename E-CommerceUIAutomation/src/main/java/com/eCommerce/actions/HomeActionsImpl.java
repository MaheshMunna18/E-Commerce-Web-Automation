package com.eCommerce.actions;

import org.openqa.selenium.WebDriver;

import com.eCommerce.pages.HomePage;

public class HomeActionsImpl implements HomeActions {
	
	 WebDriver driver;
	 HomePage homePage;
	 
	 public HomeActionsImpl(WebDriver driver) {
	        this.driver = driver;
	        this.homePage = new HomePage(driver);
	    }


	@Override
	public boolean isLogoVisible() {
		
		return homePage.isLogoDisplayed();
	}

	@Override
	public boolean isBooksLinkDisplayed() {
		
		return homePage.isNavBarBooksLinkDisplayed();
	}

	@Override
	public boolean isRegisterLinkDisplayed() {
		
		return homePage.isRegisterLinkDisplayed();
	}
	
	@Override
	public boolean isLoginLinkDisplayed() {
		return homePage.isLoginLinkDisplayed();
	}
	
	@Override
	public void clickRegisterLink() {
		
		homePage.clickRegisterLink();
		
	}
	
	@Override
	public void clickLoginLink() {
		homePage.clickLoginLink();
	}
	
	public boolean isLoginSuccessful() {
		return homePage.isLoginSuccessful();
	}
	
	@Override
	public void navigateToProductDetailsPage(String category) {
		homePage.navigateToProductDetailsPage(category);
	}
}
