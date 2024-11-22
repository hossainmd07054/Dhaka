package com.Dhaka.steps;

import static org.testng.Assert.assertEquals;

import com.Dhaka.base.TestBase;
import com.Dhaka.pages.DashboardPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardStepDefinitions extends TestBase{
	
	@Given("Open Application {string}")
	public void open_application(String URL) {
		lunchh(URL);
	}
	@Then("Enter XPS in SearchFiled")
	public void enter_xps_in_search_filed() {
		DashboardPageObject dashboardPageObject = new DashboardPageObject();
		dashboardPageObject.getSearchFieldInDashboardPage().sendKeys("XPS");
	}

	@Then("Click on SearchLink")
	public void click_on_search_link() {
		DashboardPageObject dashboardPageObject = new DashboardPageObject();
		dashboardPageObject.getSearchMagnifyButtonInDashboardPage().click();
	}

	@Then("Verify Showing results for xps in All Categories display")
	public void verify_showing_results_for_xps_in_all_categories_display() throws Throwable {
		DashboardPageObject dashboardPageObject = new DashboardPageObject();
		String acualText = dashboardPageObject.getLabelInDashboardPage().getText();
		System.out.println(acualText);
		Thread.sleep(5000);
		assertEquals(acualText, "Showing results for xps in All Categories");
	}

}
