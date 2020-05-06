//package com.snapdeal.stepdefinitionclass;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.snapdeal.baseclass.BaseClass;
//import com.snapdeal.pom.TermsofSalePom;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class TermsofSalestepdefinition extends BaseClass {
//	WebDriver driver = new ChromeDriver();
//	TermsofSalePom t = new TermsofSalePom(driver);
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
//		t.signinbutton();
//		t.loginbutton();
//		driver.switchTo().frame(0);
//	}
//
//	@Then("^user enter username$")
//	public void user_enter_username() {
//		t.usernametextbox("9440383708");
//		t.continuebutton();
//	}
//
//	@Then("^user enter password$")
//	public void user_enter_password() {
//		t.passwordtextbox("Sowmya@12");
//		t.submitbutton();
//		driver.switchTo().parentFrame();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1800)", "");
//	}
//
//	@Then("^user click on termsofsale$")
//	public void user_click_on_termsofsale() {
//		t.terms();
//	}
//
//	@Then("^user click on useraccount$")
//	public void user_click_on_useraccount() {
//		t.textcontains();
//	}
//
//	@Then("^user click on logout$")
//	public void user_click_on_logout() {
//		t.logoutbutton();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.close();
//
//	}
//
//}
//
//
