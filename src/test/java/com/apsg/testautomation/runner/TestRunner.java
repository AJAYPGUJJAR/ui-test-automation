package com.apsg.testautomation.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.apsg.testautomation.steps",
        plugin = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
