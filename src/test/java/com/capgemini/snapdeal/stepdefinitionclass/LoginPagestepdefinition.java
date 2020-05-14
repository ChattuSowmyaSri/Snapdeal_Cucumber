package com.capgemini.snapdeal.stepdefinitionclass;

//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.baseclass.BaseClass;
//import com.capgemini.snapdeal.pomwithpagefactory.LoginPage;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class LoginPagestepdefinition extends BaseClass{
//	WebDriver driver = new ChromeDriver();
//	
//	LoginPage p1 =new LoginPage(driver);
//	@Given("^enter website details$")
//	public void enter_website_details() {
//		
//		driver.manage().window().maximize();
//		//manage the time
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		//google URL
//		driver.get("https://www.snapdeal.com/");	
//	}
//	
//	@When("^user click on signin$")
//	public void user_click_on_signin() {
//		p1.signinbutton();
//		p1.loginbutton();
//		driver.switchTo().frame(0);
//	}
//	
//	@Then("^user enter username$")
//	public void user_enter_username() {
//		p1.usernametextbox("9440383708");
//		p1.continuebutton();	
//	}
//	
//	@Then("^user enter password$")
//	public void user_enter_password() {
//		p1.passwordtextbox("Sowmya@12");
//		p1.submitbutton();	
//	}
//	
//	@Then("^get the title of the page$")
//	public void get_the_title_of_the_page() {
//		String title = driver.getTitle();
//		System.out.println(title);	
//	}
//	
//	
//}
