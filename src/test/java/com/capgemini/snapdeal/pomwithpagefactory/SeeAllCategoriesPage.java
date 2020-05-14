package com.capgemini.snapdeal.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeeAllCategoriesPage extends LoginPage {
	
	 
	@FindBy(partialLinkText="See All Categories")
	//@FindBy(xpath="//a[@href=\"http://www.snapdeal.com/page/sitemap\"]")
	public WebElement categoriesbt;
	
	@FindBy(xpath="//a[@href=\"#SMAutoTab\"]")
	public WebElement bookMusicbt;
	
	@FindBy(xpath="//a[@href=\"https://www.snapdeal.com/products/books-competitive-exams\"]")
	public WebElement compitiveexamsbt;
	
	@FindBy(xpath="//a[@href=\"/products/competitive-civil-services-exams-books#bcrumbLabelId:375\"]")
	public WebElement civilservicebtn;
	
	@FindBy(xpath="//a[@href=\"https://www.snapdeal.com/product/indian-art-and-culture-paperback/684370751950#bcrumbLabelId:46102936\"]")
	public WebElement indianeculture;
	
	@FindBy(id="add-cart-button-id")
	public WebElement addcartbtn;
	
	public SeeAllCategoriesPage(WebDriver driver) 
	{	
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	public void see_all_categories() 
	{
		
		categoriesbt.click();
	}
	public void Books_Music_Gift_Cards() 
	{
		bookMusicbt.click();	
	}
	
	public void competitve_exams() 
	{
		 compitiveexamsbt.click();	
	}
	
	public void civil_services() 
	{
		civilservicebtn.click();	
	}
	public void indian_culture() 
	{
		indianeculture.click();	
	}
	public void add_to_cart()
	{
		addcartbtn.click();
	}
	
	

}
