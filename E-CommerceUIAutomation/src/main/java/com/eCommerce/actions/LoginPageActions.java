package com.eCommerce.actions;

public interface LoginPageActions {
	
	boolean isWelcomeSignInDisplayed();
	void enterEmail(String email);
    void enterPassword(String password);
    void clickLoginButton();
    boolean isLoginErrorDisplayed();
    String getLoginErrorMessage();
    

}
