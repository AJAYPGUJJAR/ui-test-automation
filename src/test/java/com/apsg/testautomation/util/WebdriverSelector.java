package com.apsg.testautomation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class WebdriverSelector {

    SauceLabsConfig sauceLabsConfig = new SauceLabsConfig();

    public WebDriver selectWebDriver() {
        WebDriver driver;
        if(System.getProperty("user.dir").contains("jenkins")) {
            driver = sauceLabsConfig.getDriver();
        } else {
            File filePath;
            if (System.getProperty("os.name").contains("Windows")) {
                filePath = new File("src/test/resources/webdrivers/windows/chrome/chromedriver.exe");
            } else {
                filePath = new File("src/test/resources/webdrivers/mac/chrome/chromedriver");
            }
            System.setProperty("webdriver.chrome.driver", filePath.getPath());
            System.setProperty("webdriver.chrome.silentoutput", "true");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

}
