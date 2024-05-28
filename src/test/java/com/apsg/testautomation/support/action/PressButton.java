package com.apsg.testautomation.support.action;

import com.apsg.testautomation.steps.Stepdefs;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class PressButton {

    public PressButton(String key) {
        new Actions(Stepdefs.driver).sendKeys(Keys.valueOf(key.toUpperCase())).perform();
    }

}
