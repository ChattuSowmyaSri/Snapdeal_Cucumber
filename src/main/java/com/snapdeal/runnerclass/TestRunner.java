package com.snapdeal.runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//LoginPage
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\main\\java\\com\\snapdeal\\features\\LoginPage.feature",
//PolicyInfoPage
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\main\\java\\com\\snapdeal\\features\\PolicyInfo.feature",
//TermsofSale
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\main\\java\\com\\snapdeal\\features\\TermsofSale.feature",
//TermsofUse
//@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\main\\java\\com\\snapdeal\\features\\TermsofUse.feature",
//ReportAbuseTakedownPolicy
@CucumberOptions(features="C:\\Selenium\\Snapdeal_Cucumber\\src\\main\\java\\com\\snapdeal\\features\\ReportAbuseTakedownPolicy.feature",
glue= {"com/snapdeal/stepdefinitionclass"},
plugin= {"pretty","html:target/cucumber"},
monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests {

}