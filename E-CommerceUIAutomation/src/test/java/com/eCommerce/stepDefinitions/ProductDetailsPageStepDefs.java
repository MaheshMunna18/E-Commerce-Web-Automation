package com.eCommerce.stepDefinitions;

import com.eCommerce.Base.BaseTest;
import com.eCommerce.actions.HomeActions;
import com.eCommerce.actions.HomeActionsImpl;
import com.eCommerce.actions.ProductDetailsPageActions;
import com.eCommerce.actions.ProductDetailsPageActionsImpl;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailsPageStepDefs {
	
	HomeActions homeActions;
	ProductDetailsPageActions productDetailsPageActions; 
	
	@When("the user clicks on {string} link and navigates to the Product Page")
	public void the_user_clicks_on_link_and_navigates_to_the_product_page(String category) {
		homeActions = new HomeActionsImpl(BaseTest.getDriver());
		homeActions.navigateToProductDetailsPage(category);
	}

	@When("the user sorts the products by {string}")
	public void the_user_sorts_the_products_by(String sortOption) {
		productDetailsPageActions = new ProductDetailsPageActionsImpl(BaseTest.getDriver());
		productDetailsPageActions.sortTheProductDropDown(sortOption);
	}

	@When("the user filters the products by price range {string} to {string}")
	public void the_user_filters_the_products_by_price_range_to(String string, String string2) {
	    
	}

	@When("the user clicks on the product named {string}")
	public void the_user_clicks_on_the_product_named(String string) {
	    
	}

	@Then("the user should be navigated to the Product Details Page")
	public void the_user_should_be_navigated_to_the_product_details_page() {
	    
	}

	@Then("the user verifies the product name and price")
	public void the_user_verifies_the_product_name_and_price() {
	    
	}

	@When("the user changes the quantity to {string}")
	public void the_user_changes_the_quantity_to(String string) {
	    
	}

	@When("the user clicks on the Add to Cart button")
	public void the_user_clicks_on_the_add_to_cart_button() {
	    
	}

	@Then("the product should be added to the cart successfully")
	public void the_product_should_be_added_to_the_cart_successfully() {
	    
	}


}
