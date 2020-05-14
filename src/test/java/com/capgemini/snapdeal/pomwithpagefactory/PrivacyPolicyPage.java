package com.capgemini.snapdeal.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PrivacyPolicyPage extends LoginPage {
	
	@FindBy(partialLinkText = "Privacy Policy")
	public WebElement privacybt;


	public PrivacyPolicyPage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);

		}

	public void privacy_policy() {

		privacybt.click();

	}


}
