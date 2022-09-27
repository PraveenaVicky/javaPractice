package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ConfirmWindow extends ProjectSpecificMethods {

	
		@Then("Click confirm on Confirm redirect")
		public MobilePublisherPage ConfirmOnRedirect()
		{
			SetupHome salesWindowSwitch = new SetupHome();
			salesWindowSwitch.switchToWindow(0);
			click(locateElement(Locators.XPATH,"//button[text()='Confirm']"));
			return new MobilePublisherPage ();
			
		}
}
		
		
		

