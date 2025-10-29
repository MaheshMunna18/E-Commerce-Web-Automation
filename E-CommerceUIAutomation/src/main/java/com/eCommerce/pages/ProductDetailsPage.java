package com.eCommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.eCommerce.utils.WaitUtils;

public class ProductDetailsPage {
	
	WebDriver driver;
	
	
	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sortTheProductDropDown(String sortOptions) {
		By sortDropDown = By.xpath("//select[@id='products-orderby']/option[text()='"+sortOptions+"']");
		WaitUtils.waitForVisibility(driver, sortDropDown, 5);
		Select select = new Select(driver.findElement(sortDropDown));
	    select.selectByVisibleText(sortOptions);
	}
	
	public void selectPriceRange(String minPrice, String maxPrice) {
	    String hrefPart = "price=" + minPrice + "-" + maxPrice;
	    String priceText = minPrice + ".00 - " + maxPrice + ".00";
	    String xpath = "//div[@class='filter-content']//ul[@class='price-range-selector']" +
	                   "//a[contains(@href,'" + hrefPart + "')]//span[contains(text(),'" + priceText + "')]";

	    driver.findElement(By.xpath(xpath)).click();
	}

	public void selectProductByName(String productName) {
		By product = By.xpath("//h2[@class='product-title']/a[contains(text(), '"+productName+"')]");
		WaitUtils.waitForVisibility(driver, product, 5);
		driver.findElement(product).click();
	}

	
	
	
}
