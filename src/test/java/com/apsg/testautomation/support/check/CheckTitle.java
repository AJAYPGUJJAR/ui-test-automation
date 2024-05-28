package com.apsg.testautomation.support.check;

import com.apsg.testautomation.steps.Stepdefs;
import org.testng.asserts.SoftAssert;

public class CheckTitle {

    public CheckTitle(String expectedTitle) {
        SoftAssert softAssert = new SoftAssert();
        String actualTitle = Stepdefs.driver.getTitle();

        softAssert.assertEquals(actualTitle, expectedTitle);
    }

}
