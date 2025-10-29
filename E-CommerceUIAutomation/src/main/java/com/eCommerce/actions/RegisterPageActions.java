package com.eCommerce.actions;

public interface RegisterPageActions {
	
	
		boolean isRegisterHeaderDisplayed();
	    void selectGender(String gender);
	    void enterFirstName(String firstName);
	    void enterLastName(String lastName);
	    void enterEmail(String email);
	    void enterPassword(String password);
	    void enterConfirmPassword(String confirmPassword);
	    void clickRegister();
	    boolean isRegistrationSuccess();
	

}
