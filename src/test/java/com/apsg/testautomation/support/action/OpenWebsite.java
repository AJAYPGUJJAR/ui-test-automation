package com.apsg.testautomation.support.action;

import com.apsg.testautomation.steps.Stepdefs;

public class OpenWebsite {

    public OpenWebsite(String url) {
        Stepdefs.driver.navigate().to(url);
    }

}
