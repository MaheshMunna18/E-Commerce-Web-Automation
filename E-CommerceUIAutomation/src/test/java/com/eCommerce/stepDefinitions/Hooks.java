package com.eCommerce.stepDefinitions;

import com.eCommerce.Base.BaseTest;
import com.eCommerce.utils.ScreenshotUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.*;

public class Hooks extends BaseTest {

	@Before
	public void launchBrowser() {
		BaseTest.setUp(); 
	}

	@After	
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtils.captureScreenshot(driver, scenario.getName().replaceAll(" ", "_"));
        }
        tearDown();
    }
	
	@AfterStep
	public void addScreenshotAfterStep(Scenario scenario) {
	    byte[] screenshot = ScreenshotUtils.takeScreenshotAsBytes(driver);
	    scenario.attach(screenshot, "image/png", "Step Screenshot");
	}
	
	

}
