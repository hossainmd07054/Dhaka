package com.Dhaka.testRunners;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Dhaka.base.TestBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Featuress" }, plugin = {
		"json:target/cucumber.json" }, glue = "com.Dhaka.steps", tags = "@Regreation")
public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void LaunchApplicationURL() {
		TestBase lunch = new TestBase();
		lunch.initz();
	}

	@AfterTest
	public void CloseApplicationURL() {
		TestBase.driver.quit();
	}

}
