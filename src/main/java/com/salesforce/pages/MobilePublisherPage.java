package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class MobilePublisherPage extends ProjectSpecificMethods{
	@And("Click Resources and mouse hover on Learning On Trailhead")
	public MobilePublisherPage MouseHoverOnTrailhead()
	
	{
		clickUsingJs(locateElement(Locators.XPATH,"//span[text()='Learning']"));
		clickUsingJs(locateElement(Locators.XPATH,"//span[contains(text(),'Trailhead']"));
		return new MobilePublisherPage();
		
	}
}

