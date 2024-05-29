package com.apsg.testautomation.steps.wdio;

import com.apsg.testautomation.support.check.CheckTitle;
import io.cucumber.java.en.Then;

public class ThenSteps {

    @Then("I expect that the title is {string}")
    public void iExpectThatTheTitleIs(String value) {
        new CheckTitle(value);
    }

}
