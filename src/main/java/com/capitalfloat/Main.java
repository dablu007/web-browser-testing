package com.capitalfloat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {
        public static void main(String[] args) {
            // And now use this to visit Google
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
            DesiredCapabilities cap = DesiredCapabilities.firefox();
            cap.setCapability("marionette", true);
            WebDriver driver = new FirefoxDriver(cap);
            driver.get("http://54.201.23.67/cf/default/login");

        }
}
