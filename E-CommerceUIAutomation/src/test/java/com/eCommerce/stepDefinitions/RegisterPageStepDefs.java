package com.eCommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.eCommerce.Base.BaseTest;
import com.eCommerce.actions.HomeActions;
import com.eCommerce.actions.HomeActionsImpl;
import com.eCommerce.actions.RegisterPageActions;
import com.eCommerce.actions.RegisterPageActionsImpl;
import com.eCommerce.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStepDefs {

	HomeActions homeActions;
	RegisterPageActions registerPageActions;
	
	@Then("the Register link should be visible on the Home Page")
	public void the_register_link_should_be_visible_on_the_home_page() {
	    
		homeActions = new HomeActionsImpl(BaseTest.getDriver());
		Assert.assertTrue("Register Link is not Displayed", 
	    		
	    		homeActions.isRegisterLinkDisplayed());
	}

	@When("the user clicks on the Register link")
	public void the_user_clicks_on_the_register_link() { 
	    		homeActions.clickRegisterLink();
	}

	@Then("the Register Page should be displayed")
	public void the_register_page_should_be_displayed() {
		registerPageActions = new RegisterPageActionsImpl(BaseTest.getDriver());
	    Assert.assertTrue("Register Text is Displayed", 
	    		registerPageActions.isRegisterHeaderDisplayed());
	}

	@When("the user selects gender as {string}")
	public void the_user_selects_gender_as(String gender) {
		
	    registerPageActions.selectGender(gender);
	}

	@When("the user enters first name {string}")
	public void the_user_enters_first_name(String firstName) {
		registerPageActions.enterFirstName(firstName);
	}

	@When("the user enters last name {string}")
	public void the_user_enters_last_name(String lastName) {
		registerPageActions.enterLastName(lastName);
	}

	@When("the user enters email {string}")
	public void the_user_enters_email(String email) {
		registerPageActions.enterEmail(email);
	}

	@When("the user enters password {string}")
	public void the_user_enters_password(String password) {
		registerPageActions.enterPassword(password);
	}

	@When("the user enters confirm password {string}")
	public void the_user_enters_confirm_password(String confirmPassword) {
		registerPageActions.enterConfirmPassword(confirmPassword);
	}

	@When("the user clicks the Register button")
	public void the_user_clicks_the_register_button() {
		registerPageActions.clickRegister();
	}

	@Then("the registration should be completed successfully")
	public void the_registration_should_be_completed_successfully() {
	    Assert.assertTrue("Registration Completed text is not Displayed", 
	    		registerPageActions.isRegistrationSuccess());
	}

}
