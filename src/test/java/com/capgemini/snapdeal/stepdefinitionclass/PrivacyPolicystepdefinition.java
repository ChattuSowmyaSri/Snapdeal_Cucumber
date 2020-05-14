package com.capgemini.snapdeal.stepdefinitionclass;

//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.baseclass.BaseClass;
//import com.capgemini.snapdeal.pomwithpagefactory.PrivacyPolicyPage;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class PrivacyPolicystepdefinition extends BaseClass {
//
//	WebDriver driver = new ChromeDriver();
//	PrivacyPolicyPage p1 = new PrivacyPolicyPage(driver);
//
//	@Given("^enter website details$")
//	public void enter_website_details() {
//
//		driver.manage().window().maximize();
//		// manage the time
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.snapdeal.com/");
//	}
//
//	@When("^user click on signin$")
//	public void user_click_on_signin() {
//		p1.signinbutton();
//		p1.loginbutton();
//		
//	}
//
//	@Then("^user enter username$")
//	public void user_enter_username() throws InterruptedException {
//		driver.switchTo().frame(0);
//		Thread.sleep(3000);
//		p1.usernametextbox("9440383708");
//		p1.continuebutton();
//	}
//
//	@Then("^user enter password$")
//	public void user_enter_password() {
//		p1.passwordtextbox("Sowmya@12");
//		p1.submitbutton();
//		
//	}
//
//	@Then("^user click on privacypolicy$")
//	public void user_click_on_privacypolicy() throws InterruptedException {
//		driver.switchTo().parentFrame();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1800)", "");
//		Thread.sleep(2000);
//		p1.privacy_policy();
//	}
//
//
//	}
