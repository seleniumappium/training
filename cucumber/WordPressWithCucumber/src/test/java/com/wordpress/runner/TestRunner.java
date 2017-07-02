package com.wordpress.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/MyProfile.feature"},
		glue = {"com.wordpress.stepdefinitions"},
		plugin ={ "pretty" , "html:target/cucumber", "json:target/json-report.json"}
		)
public class TestRunner {

}
