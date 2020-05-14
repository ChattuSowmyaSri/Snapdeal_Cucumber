package com.capgemini.snapdeal.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchProductAddtoCartPage extends LoginPage {

	@FindBy(id="inputValEnter")
	public WebElement textbox;
	
	@FindBy(xpath="//button[@class=\"searchformButton col-xs-4 rippleGrey\"]")
	public WebElement searchbtn;
	
	@FindBy(xpath="//a[@href=\"https://www.snapdeal.com/product/the-indian-economy/683858940766\"]")
	public WebElement indianeconomybook;
	
	@FindBy(id="add-cart-button-id")
	public WebElement addcartbtn;
	
	
	public SearchProductAddtoCartPage(WebDriver driver) 
	{	
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	public void enter_Product_Name(String productname) {
		textbox.sendKeys(productname);
	}
	
	public void click_on_searchbutton() {
		searchbtn.click();
	}
	
	public void the_indian_economy() 
	{
		indianeconomybook.click();	
	}
	public void add_to_cart()
	{
		addcartbtn.click();
	}
	
}
