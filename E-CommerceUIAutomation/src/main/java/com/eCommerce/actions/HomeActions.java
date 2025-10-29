package com.eCommerce.actions;

public interface HomeActions {
	
	
    boolean isLogoVisible();
    boolean isBooksLinkDisplayed();
    boolean isRegisterLinkDisplayed();
    boolean isLoginLinkDisplayed();
    void clickRegisterLink();
    void clickLoginLink();
    boolean isLoginSuccessful();
    void navigateToProductDetailsPage(String category);

}
