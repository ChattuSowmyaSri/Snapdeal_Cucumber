package com.capgemini.snapdeal.stepdefinitionclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.capgemini.snapdeal.baseclass.BaseClass;
import com.capgemini.snapdeal.pomwithpagefactory.SeeAllCategoriesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeeAllCategoriesstepdefinition extends BaseClass {
	WebDriver driver = new ChromeDriver();

	SeeAllCategoriesPage p1 = new SeeAllCategoriesPage(driver);
	@Given("^enter website details$")
	public void enter_website_details() {
		driver.manage().window().maximize();
		//manage the time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//google URL
		driver.get("https://www.snapdeal.com/");
	  
	}

	@When("^user click on signin$")
	public void user_click_on_signin()  {
		p1.signinbutton();
		p1.loginbutton();	
	   
	}

	@Then("^user enter username$")
	public void user_enter_username()  {
		driver.switchTo().frame(0);
		p1.usernametextbox("9440383708");
		p1.continuebutton();
	}

	@Then("^user enter password$")
	public void user_enter_password()  {
		p1.passwordtextbox("Sowmya@12");
		p1.submitbutton();	
		
	}

	@Then("^user click on See All Categories$")
	public void user_click_on_See_All_Categories() throws InterruptedException
	{
			driver.switchTo().parentFrame();
			Thread.sleep(2000);
				p1.see_all_categories();
				
	    
	}

	@Then("^user select any Category$")
	public void user_select_any_Category() {
		p1.Books_Music_Gift_Cards();
		p1.competitve_exams();
		p1.civil_services();
	    
	}
	@Then("^user select particular Book$")
	public void user_select_particular_Book() throws InterruptedException {
		p1.indian_culture();
		Thread.sleep(3000);
	}
	@Then("^user click on add to cart button$")
	public void user_click_on_add_to_cart_button() {
		String parentWinHandle = driver.getWindowHandle();
		Set<String> winHandles = driver.getWindowHandles();

		for (String handle : winHandles) {
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
			}
		}
		p1.add_to_cart();
		
	}
}
