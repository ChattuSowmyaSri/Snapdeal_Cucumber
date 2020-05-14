package com.capgemini.snapdeal.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsofUsePage extends LoginPage {

	

	@FindBy(partialLinkText="Terms of Use")
	public WebElement termsbt;
	
	public TermsofUsePage(WebDriver driver) 
	{	
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	public void terms()
	{
		termsbt.click();
		
	}
	

}
