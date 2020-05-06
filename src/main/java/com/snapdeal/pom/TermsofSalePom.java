package com.snapdeal.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsofSalePom {

	@FindBy(xpath="//span[text()=\"Sign In\"]")
	public WebElement signinbtn;
	
	@FindBy(xpath="//a[@href=\"https://www.snapdeal.com/login\"]")
	public WebElement loginbtn;
	
	@FindBy(id="userName")
	public WebElement usertb;
	
	@FindBy(id="checkUser")
	public WebElement continuebtn;
	
	@FindBy(id="j_password_login_uc")
	public WebElement passwordtb;
	
	@FindBy(id="submitLoginUC")
	public WebElement submitbtn;

	@FindBy(partialLinkText="Terms of Sale")
	public WebElement termsbt;
	

	@FindBy(xpath="//span[text()=\"chattu sowmya sri\"]")
	public WebElement usernm;
	
	@FindBy(xpath="//a[@href=\"https://www.snapdeal.com/logout\"]")
	public WebElement logoutbtn;

	public TermsofSalePom(WebDriver driver) 
	{	
		PageFactory.initElements(driver,this);
		
	}
	public void signinbutton()
	{
		signinbtn.click();
	}
	public void loginbutton()
	{
		loginbtn.click();
	}
	
	public void usernametextbox(String username)
	{
		usertb.sendKeys(username);
	}
	
	public void continuebutton()
	{
		continuebtn.click();
	}
	
	public void passwordtextbox(String password)
	{
		passwordtb.sendKeys(password);
	}
	
	public void submitbutton()
	{
		submitbtn.click();
	}

	public void terms()
	{
		termsbt.click();
		
	}
	public void textcontains()
	{
		usernm.click();
	}
	
	public void logoutbutton()
	{
		logoutbtn.click();
	}
}
