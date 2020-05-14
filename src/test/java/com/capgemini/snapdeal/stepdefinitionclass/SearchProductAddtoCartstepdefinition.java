package com.capgemini.snapdeal.stepdefinitionclass;

//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.capgemini.snapdeal.baseclass.BaseClass;
//import com.capgemini.snapdeal.pomwithpagefactory.SearchProductAddtoCartPage;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class SearchProductAddtoCartstepdefinition extends BaseClass {
//	
//	WebDriver driver = new ChromeDriver();
//	
//	SearchProductAddtoCartPage p1 = new SearchProductAddtoCartPage(driver);
//	
//	@Given("^enter website details$")
//	public void enter_website_details() {
//		driver.manage().window().maximize();
//		//manage the time
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//google URL
//		driver.get("https://www.snapdeal.com/");
//	    
//	}
//
//	@When("^user click on signin$")
//	public void user_click_on_signin()  {
//		p1.signinbutton();
//		p1.loginbutton();	
//	   
//	}
//
//	@Then("^user enter username$")
//	public void user_enter_username()  {
//		driver.switchTo().frame(0);
//		p1.usernametextbox("9440383708");
//		p1.continuebutton();
//	    
//	}
//
//	@Then("^user enter password$")
//	public void user_enter_password()  {
//		p1.passwordtextbox("Sowmya@12");
//		p1.submitbutton();
//	    
//	}
//
//	@Then("^user enter product name on searchbar$")
//	public void user_enter_product_name_on_searchbar() throws InterruptedException  {
//		driver.switchTo().parentFrame();
//		p1.enter_Product_Name("The Indian Economy");
//		Thread.sleep(2000);
//		
//	    
//	}
//
//	@Then("^user click on search button$")
//	public void user_click_on_search_button()  {
//	    p1.click_on_searchbutton();
//	}
//
//	@Then("^user select the product$")
//	public void user_select_the_product()  {
//		p1.the_indian_economy();
//	    
//	}
//	@Then("^handling of window$")
//	public void handling_of_window() throws InterruptedException {
//		String parentWinHandle = driver.getWindowHandle();
//		Set<String> winHandles = driver.getWindowHandles();
//
//		for (String handle : winHandles) {
//			if (!handle.equals(parentWinHandle)) {
//				driver.switchTo().window(handle);
//				Thread.sleep(1000);
//				driver.findElement(By.id("add-cart-button-id")).click();
//				
//			}
//		}
//	}
//
//	@Then("^user click on Add to cart button$")
//	public void user_click_on_Add_to_cart_button()  {
//		p1.add_to_cart();
//	   
//	}
//	
//
//
//
//}
