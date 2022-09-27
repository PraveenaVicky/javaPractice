package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

import cucumber.api.CucumberOptions;
@CucumberOptions(features = "src/main/java/features/F03_Mobile Publisher.feature", glue = {"com.salesforce.testcases"}, monochrome = true)
public class TC_004_Learning_On_Trailhead extends ProjectSpecificMethods{

	
	@BeforeTest
	public void setValues() {
		testcaseName = "SalesforceTestcase";
		testDescription ="Learning on Trailhead";
		authors="Hari";
		category ="Smoke";
		
	}
	
	@Test
	public void runLogin() {
		new LoginPage()
		.enterUsername("hari.radhakrishnan@qeagle.com")
		.enterPassword("India$321")
		.clickLogin()
		.MobilePublisher_LearnMore().ConfirmOnRedirect().MouseHoverOnTrailhead();
		
	
}
}