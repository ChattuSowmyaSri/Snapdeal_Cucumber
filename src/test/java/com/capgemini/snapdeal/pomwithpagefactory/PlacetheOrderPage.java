package com.capgemini.snapdeal.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlacetheOrderPage extends LoginPage {
	
	@FindBy(id="inputValEnter")
	public WebElement textbox;
	
	@FindBy(xpath="//button[@class=\"searchformButton col-xs-4 rippleGrey\"]")
	public WebElement searchbtn;
	
	
	@FindBy(xpath="//a[@href=\"https://www.snapdeal.com/product/bioayurveda-neem-power-hand-sanitizer/668853346078\"]")
	public WebElement bioayurveda;
	
	@FindBy(id="buy-button-id")
	public WebElement buynowbtn;
	
	@FindBy(id="zip")
	public WebElement pincode;
	

	@FindBy(id="fullName")
	public WebElement fullNametb;
	
	@FindBy(id="address")
	public WebElement addresstb;
	
	@FindBy(id="alternateMobile")
	public WebElement alternatephnotb;
	
	@FindBy(xpath="//span[@class=\"circle\"]")
	public WebElement radiobtn;
	
	@FindBy(xpath="//span[@class=\"button-text\"]")
	public WebElement savebtn;
	
	@FindBy(id="make-payment")
	public WebElement proceedtopaybtn;
	
	
	public PlacetheOrderPage(WebDriver driver) 
	{	
		super(driver);
		PageFactory.initElements(driver,this);	
	}
	
	public void enter_Product_name(String productname) {
		textbox.sendKeys(productname);
	}
	public void click_on_searchbutton() {
		searchbtn.click();
	}
	public void  bioayurveda_sanitizer() 
	{
		 bioayurveda.click();	
	}
	public void buy_now_button()
	{
		buynowbtn.click();
	}
	public void enter_pincode(String pincodenumber)
	{
		pincode.sendKeys(pincodenumber);
	}
	public void enter_fullname(String fullname)
	{
		fullNametb.sendKeys(fullname);
	}
	public void enter_address(String address)
	{
		addresstb.sendKeys(address);
	}
	public void enter_alternate_phoneNumber(String alternatephonenumber)
	{
		alternatephnotb.sendKeys(alternatephonenumber);
	}
	public void  selection_of_radiobutton() 
	{
		 radiobtn.click();	
	}
	public void  save_and_continue() 
	{
		savebtn.click();	
	}
	public void  proceed_to_payment() 
	{
		
		proceedtopaybtn.click();	
	}
	

}
