package com.capgemini.snapdeal.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
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
	
	
	public LoginPage(WebDriver driver) 
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
	
}
