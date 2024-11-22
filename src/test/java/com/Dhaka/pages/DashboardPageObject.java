package com.Dhaka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Dhaka.base.TestBase;

public class DashboardPageObject extends TestBase {
	
	public DashboardPageObject() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy (xpath="//*[@id='mh-search-input']")	
	private WebElement link_Search_Field_DashboardPage;
	public WebElement getSearchFieldInDashboardPage() {
		return link_Search_Field_DashboardPage;
	}
	@FindBy (xpath="//*[@class='mh-search-btn mh-search-submit']")	
	private WebElement btn_Search_Magnify_DashboardPage;
	public WebElement getSearchMagnifyButtonInDashboardPage() {
		return btn_Search_Magnify_DashboardPage;
	}
	@FindBy (xpath="//*[@id='list-6']/li")	
	private WebElement label_verify_search_result_display;
	public WebElement getLabelInDashboardPage() {
		return label_verify_search_result_display;
	}
	

}
