package com.capgemini.snapdeal.runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//LoginPage
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\test\\java\\com\\capgemini\\snapdeal\\features\\LoginPage.feature",

//PolicyInfoPage
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\test\\java\\com\\capgemini\\snapdeal\\features\\PrivacyPolicy.feature",

//TermsofSale
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\test\\java\\com\\capgemini\\snapdeal\\features\\TermsofSale.feature",

//TermsofUse
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\test\\java\\com\\capgemini\\snapdeal\\features\\TermsofUse.feature",

//ReportAbuseTakedownPolicy
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\test\\java\\com\\capgemini\\snapdeal\\features\\ReportAbuseTakedownPolicy.feature",

//See All Categories
@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\test\\java\\com\\capgemini\\snapdeal\\features\\SeeAllCategories.feature",

//Search Product and Add to Cart
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\test\\java\\com\\capgemini\\snapdeal\\features\\SearchProductAddtoCart.feature",

//Place the Order
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\test\\java\\com\\capgemini\\snapdeal\\features\\PlacetheOrder.feature",

glue= {"com/capgemini/snapdeal/stepdefinitionclass"},
plugin= {"pretty","html:target/cucumber"},
monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests {

}