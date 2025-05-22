package com.example.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.example.selenium.utilities.ScreenshotUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCase01 {
    private static final Logger logger = LoggerFactory.getLogger(TestCase01.class);
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        this.driver = DriverManager.getDriver();
    }   
    @Test
    public void testCase01() {
        try {
            // Open the URL
            logger.info("Test Case 01: Opening URL");
            driver.get("https://www.example.com");

            logger.info("Test Case 01: Verifying page title");
            String expectedTitle = "Example Domain";
            String actualTitle = driver.getTitle();
            logger.info("Current page title: {}", actualTitle);
            
            logger.info("Taking screenshot");
            if (true) {
                ScreenshotUtil screenshotUtil = new ScreenshotUtil();
                screenshotUtil.takeScreenshot(driver, "testCase01", "check");
            }
            
            Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
            logger.info("Title verification completed successfully");
        } catch (Exception e) {
            logger.error("Test failed: {}", e.getMessage());
            throw e;
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver
        DriverManager.tearDown();
    }

}
