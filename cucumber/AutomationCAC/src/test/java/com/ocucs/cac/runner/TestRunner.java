package com.ocucs.cac.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features/Login.feature"},
		glue = {"com.ocucs.cac.stepdefinitions"},
		tags = {"@all"},
		plugin ={ "pretty" , "html:target/cucumber", "json:target/json-report.json"}
		)
public class TestRunner {

}
