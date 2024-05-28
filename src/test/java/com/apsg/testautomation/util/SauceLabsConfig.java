package com.apsg.testautomation.util;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabsConfig {

    private URL url;

    public RemoteWebDriver getDriver() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("windows 10");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "");
        sauceOptions.put("name", "");
        browserOptions.setCapability("sauce:options", sauceOptions);
        try {
            URI uri = URI.create("");
            url = uri.toURL();
        }catch (Exception e) {
            System.out.println("Failed to load Sauce URL");
        }
        return new RemoteWebDriver(url, browserOptions);
    }
}
