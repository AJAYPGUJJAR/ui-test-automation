package com.apsg.testautomation.support.action;

import com.apsg.testautomation.steps.Stepdefs;

public class CheckTitle {

    public CheckTitle(String expectedTitle) {
        String actualTitle = Stepdefs.driver.getTitle();
        if(expectedTitle.equals(actualTitle)) {
            System.out.println("expectedTitle: "+expectedTitle+" = actualTitle: "+actualTitle);
        } else {
            System.out.println("expectedTitle: "+expectedTitle+" != actualTitle: "+actualTitle);
        }
    }

}
