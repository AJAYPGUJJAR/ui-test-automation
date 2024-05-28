package com.apsg.testautomation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;

public class WebdriverSelector {

    private static WebDriver driver;

    public WebDriver selectWebDriver() {
        File filePath = new File((Paths.get("src/test/resources/webdrivers/windows/chrome/chromedriver.exe")).toUri());
        System.setProperty("webdriver.chrome.driver", filePath.toString());

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

}
