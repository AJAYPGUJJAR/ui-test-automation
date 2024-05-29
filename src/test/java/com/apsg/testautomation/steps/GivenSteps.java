package com.apsg.testautomation.steps;

import com.apsg.testautomation.support.action.OpenWebsite;
import io.cucumber.java.en.Given;

public class GivenSteps {

    @Given("I open the url {string}")
    @Given("I open the site {string}")
    public void iOpenTheUrl(String url) {
        new OpenWebsite(url);
    }

}
