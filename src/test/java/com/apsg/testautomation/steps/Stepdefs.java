package com.apsg.testautomation.steps;

import com.apsg.testautomation.support.action.CheckTitle;
import com.apsg.testautomation.support.action.OpenWebsite;
import com.apsg.testautomation.support.action.PressButton;
import com.apsg.testautomation.support.action.SetInputField;
import com.apsg.testautomation.util.WebdriverSelector;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Stepdefs {

    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new WebdriverSelector().selectWebDriver();
    }

    @AfterAll
    public static void tearDown() {
//        driver.quit();
    }

    @Given("I open the url {string}")
    @Given("I open the site {string}")
    public void iOpenTheUrl(String url) {
        new OpenWebsite(url);
    }

    @When("I set {string} to the inputfield {string}")
    public void iSetToTheInputfield(String value, String selector) {
        new SetInputField().addInput(value, selector);

    }

    @And("I press {string}")
    public void iPress(String key) {
        new PressButton(key);
    }

    @Then("I expect that the title is {string}")
    public void iExpectThatTheTitleIs(String value) {
        new CheckTitle(value);
    }

}
