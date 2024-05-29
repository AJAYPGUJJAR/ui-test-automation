package com.apsg.testautomation.steps.wdio;

import com.apsg.testautomation.support.action.PressButton;
import com.apsg.testautomation.support.action.SetInputField;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class WhenSteps {

    @When("I set {string} to the inputfield {string}")
    public void iSetToTheInputfield(String value, String selector) {
        new SetInputField().addInput(value, selector);
    }

    @And("I press {string}")
    public void iPress(String key) {
        new PressButton(key);
    }

}
