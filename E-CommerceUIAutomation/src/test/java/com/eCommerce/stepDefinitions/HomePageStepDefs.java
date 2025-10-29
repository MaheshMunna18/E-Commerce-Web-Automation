package com.eCommerce.stepDefinitions;



import org.junit.Assert;

import com.eCommerce.Base.BaseTest;
import com.eCommerce.actions.HomeActions;
import com.eCommerce.actions.HomeActionsImpl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDefs extends BaseTest {
	
	HomeActions homeActions;
	
	@Given("^the user launches the browser and navigates to the Home Page$")
	public void the_user_launches_the_browser_and_navigates_to_the_home_page() {
		homeActions = new HomeActionsImpl(BaseTest.getDriver());
        
  
	}

	@Then("the logo should be visible")
	public void the_logo_should_be_visible() {
		
		
		Assert.assertTrue("Logo is not displayed", 
				homeActions.isLogoVisible());
	}

	@Then("the navigation bar should be present")
	public void the_navigation_bar_should_be_present() {
		Assert.assertTrue("Books link is not displayed", 
				homeActions.isBooksLinkDisplayed());
	}

	@Then("the Register and Login link should be displayed")
	public void the_register_login_link_should_be_displayed() {
		Assert.assertTrue("Register and Login is not displayed", 
				homeActions.isRegisterLinkDisplayed());
		
	}

}
