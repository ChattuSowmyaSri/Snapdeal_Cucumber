package com.capgemini.snapdeal.stepdefinitionclass;

//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.baseclass.BaseClass;
//import com.capgemini.snapdeal.pomwithpagefactory.ReportAbuseTakedownPolicyPage;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class ReportAbuseTakedownPolicystepdefinition extends BaseClass {
//	WebDriver driver = new ChromeDriver();
//	
//	ReportAbuseTakedownPolicyPage t = new ReportAbuseTakedownPolicyPage(driver);
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
//		t.signinbutton();
//		t.loginbutton();
//		
//	}
//
//	@Then("^user enter username$")
//	public void user_enter_username() throws InterruptedException {
//		driver.switchTo().frame(0);
//		Thread.sleep(2000);
//		t.usernametextbox("9440383708");
//		t.continuebutton();
//	}
//
//	@Then("^user enter password$")
//	public void user_enter_password() {
//		t.passwordtextbox("Sowmya@12");
//		t.submitbutton();
//		
//	}
//
//	@Then("^user click on ReportAbuseTakedownPolicy$")
//	public void user_click_on_ReportAbuseTakedownPolicy() throws InterruptedException {
//		driver.switchTo().parentFrame();
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1800)", "");
//		t.reprotabuse();
//	}
//
//}
