package com.capgemini.snapdeal.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsofSalePage extends LoginPage{

	
	@FindBy(partialLinkText="Terms of Sale")
	public WebElement termsbt;
	

	public TermsofSalePage(WebDriver driver) 
	{	
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	public void terms()
	{
		termsbt.click();
		
	}
	
}
