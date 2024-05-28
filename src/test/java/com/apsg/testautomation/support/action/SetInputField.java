package com.apsg.testautomation.support.action;

import com.apsg.testautomation.steps.Stepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SetInputField {

    public void addInput(String text, String selector) {
        WebElement element = Stepdefs.driver.findElement(By.cssSelector(selector));
        element.sendKeys(text);
    }

    public void setInput(String text, String selector) {
        WebElement element = Stepdefs.driver.findElement(By.cssSelector(selector));
        element.clear();
        element.sendKeys(text);
    }

}
