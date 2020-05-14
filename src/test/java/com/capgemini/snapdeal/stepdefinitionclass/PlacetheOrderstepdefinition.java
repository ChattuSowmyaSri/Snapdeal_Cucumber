package com.capgemini.snapdeal.stepdefinitionclass;

//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.capgemini.snapdeal.baseclass.BaseClass;
//import com.capgemini.snapdeal.pomwithpagefactory.PlacetheOrderPage;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class PlacetheOrderstepdefinition extends BaseClass {
//	WebDriver driver = new ChromeDriver();
//	
//	PlacetheOrderPage p1 = new PlacetheOrderPage(driver);
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
//		driver.switchTo().parentFrame();
//		
//	    
//	}
//
//	@Then("^user enter product name on searchbar$")
//	public void user_enter_product_name_on_searchbar() throws InterruptedException  {
//		
//		Thread.sleep(3000);
//		p1.enter_Product_name("bioayurveda");
//		
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
//		p1.bioayurveda_sanitizer();
//	    
//	}
//	@Then("^handling of window and click on buynow$")
//	public void handling_of_window_and_click_on_buynow() throws InterruptedException {
//		String parentWinHandle = driver.getWindowHandle();
//		Set<String> winHandles = driver.getWindowHandles();
//
//		for (String handle : winHandles) {
//			if (!handle.equals(parentWinHandle)) {
//				driver.switchTo().window(handle);
//				Thread.sleep(1000);
//				
//				
//			}
//		}
//		p1.buy_now_button();
//	}
//	@Then("^user should enter all the details required$")
//	public void user_should_enter_all_the_details_required() {
//		p1.enter_pincode("500041");
//		p1.enter_fullname("Chattu Sowmya Sri");
//		p1.enter_address("5-174, addakatta center");
//		p1.enter_alternate_phoneNumber("9440063743");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)","");
//		p1.selection_of_radiobutton();
//		p1.save_and_continue();	
//		
//	}
//	@Then("^user should click on proceed to payment$")
//	public void user_should_click_on_proceed_to_payment() {
//		p1.proceed_to_payment();
//		
//	}
//}
