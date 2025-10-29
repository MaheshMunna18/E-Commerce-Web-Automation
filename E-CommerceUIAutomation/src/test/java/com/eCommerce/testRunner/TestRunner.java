package com.eCommerce.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "src/test/resources/Features",
		  glue = {"src/test/java","com.eCommerce.stepDefinitions"},
		  tags = "@EndToEnd",  
		  plugin = {"pretty", "json:target/JSONReports/report.json"},
		  monochrome = true
		)
public class TestRunner {

}
