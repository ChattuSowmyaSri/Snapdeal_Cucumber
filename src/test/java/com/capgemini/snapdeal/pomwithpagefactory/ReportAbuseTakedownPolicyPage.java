package com.capgemini.snapdeal.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportAbuseTakedownPolicyPage extends LoginPage {
	

	@FindBy(partialLinkText="Report Abuse & Takedown Policy")
	public WebElement reportbt;
	

	public ReportAbuseTakedownPolicyPage(WebDriver driver) 
	{	
		super(driver);
		PageFactory.initElements(driver,this);
		
	}

	public void reprotabuse()
	{
		reportbt.click();
		
	}	

}
