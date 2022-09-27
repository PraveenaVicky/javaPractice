package com.salesforce.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SetupHome extends ProjectSpecificMethods {

	@Then("Click on Learn More link in Mobile Publisher")
	public ConfirmWindow MobilePublisher_LearnMore()
	{
		click(locateElement(Locators.XPATH,"//span[text()='Learn More']"));
		reportStep("Login button clicked successfully", "pass");
		return  new ConfirmWindow();
			
	}
	
	
}
