package com.eCommerce.stepDefinitions;

import org.junit.Assert;

import com.eCommerce.Base.BaseTest;
import com.eCommerce.actions.HomeActions;
import com.eCommerce.actions.HomeActionsImpl;
import com.eCommerce.actions.LoginPageActions;
import com.eCommerce.actions.LoginPageActionsImpl;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefs {

	HomeActions homeActions;
	LoginPageActions loginPageActions;

	@Then("the Login link should be visible on the Home Page")
	public void the_login_link_should_be_visible_on_the_home_page() {
		homeActions = new HomeActionsImpl(BaseTest.getDriver());
		Assert.assertTrue("Login Link is not Displayed", homeActions.isLoginLinkDisplayed());
	}

	@When("the user clicks on the Login link and navigates to the Login Page")
	public void the_user_clicks_on_the_login_link_and_navigates_to_the_login_page() {
		homeActions.clickLoginLink();
	}

	@Then("the Login Page should be displayed with the Sign In section")
	public void the_login_page_should_be_displayed_with_the_sign_in_section() {
		loginPageActions = new LoginPageActionsImpl(BaseTest.getDriver());
		Assert.assertTrue("Welcome Sign In is not Displayed", loginPageActions.isWelcomeSignInDisplayed());
	}

	@When("the user enters email as {string} and password as {string}")
	public void the_user_enters_email_as_and_password_as(String email, String password) {
		loginPageActions.enterEmail(email);
		loginPageActions.enterPassword(password);
	}

	@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
		loginPageActions.clickLoginButton();
		
	}

	@Then("user verifies Logout link and user email should be visible on the Home Page")
	public void user_verifies_logout_link_and_user_email_should_be_visible_on_the_home_page() {

		if (homeActions.isLoginSuccessful()) {
			Assert.assertTrue("Unable verify email and logout button on Home Page", homeActions.isLoginSuccessful());
		} else if (loginPageActions.isLoginErrorDisplayed()) {
			String errorMsg = loginPageActions.getLoginErrorMessage();
			Assert.fail("Login was unsuccessful. Error message: " + errorMsg);
		} else {
			System.out.println("Unknown login state!");
		}
	}

}
