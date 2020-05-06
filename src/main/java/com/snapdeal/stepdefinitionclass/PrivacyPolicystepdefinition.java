//package com.snapdeal.stepdefinitionclass;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.snapdeal.baseclass.BaseClass;
//import com.snapdeal.pom.PrivacyPolicyPom;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class PrivacyPolicystepdefinition extends BaseClass {
//
//	WebDriver driver = new ChromeDriver();
//	PrivacyPolicyPom p1 = new PrivacyPolicyPom(driver);
//
//	@Given("^enter website details$")
//	public void enter_website_details() {
//
//		driver.manage().window().maximize();
//		// manage the time
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
//		driver.switchTo().parentFrame();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1800)", "");
//	}
//
//	@Then("^user click on privacypolicy$")
//	public void user_click_on_privacypolicy() {
//		p1.privacy_policy();
//	}
//
//	@Then("^user click on useraccount$")
//	public void user_click_on_useraccount() {
//		p1.textcontains();
//	}
//
//	@Then("^user click on logout$")
//	public void user_click_on_logout() {
//		p1.logoutbutton();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.close();
//
//	}
//
//}
