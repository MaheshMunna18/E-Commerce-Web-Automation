package com.eCommerce.actions;

import org.openqa.selenium.WebDriver;

import com.eCommerce.pages.HomePage;
import com.eCommerce.pages.ProductDetailsPage;
import com.eCommerce.pages.RegisterPage;

public class ProductDetailsPageActionsImpl implements ProductDetailsPageActions {
	
	WebDriver driver;
	ProductDetailsPage productDetailsPage;
	
	public ProductDetailsPageActionsImpl(WebDriver driver) {
        this.driver = driver;
        HomePage homepage = new HomePage(driver);
        this.productDetailsPage = new ProductDetailsPage(driver);
    }
    
    
    @Override
    public void sortTheProductDropDown(String sortOptions) {
    	
    	productDetailsPage.sortTheProductDropDown(sortOptions);
    }

}
