package com.capitalfloat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability("marionette", true);
        driver = new FirefoxDriver(cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSimple() throws Exception {
        this.driver.get("http://www.google.com");
        assertEquals("Google", this.driver.getTitle());
    }

    @After
    public void tearDown() throws Exception {
        this.driver.quit();
    }
}
