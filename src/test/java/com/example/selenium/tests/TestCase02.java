package com.example.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.selenium.base.DriverManager;

public class TestCase02 {
    public static final Logger log = LoggerFactory.getLogger(TestCase02.class);
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        this.driver = DriverManager.getDriver();
        log.info("Test Case 02: WebDriver initialized successfully");
    }

    @Test
    public void testCase02() throws Exception {
        try {
            // Open the URL
            log.info("Test Case 02: Opening URL");
            driver.get("https://www.example.com/");

            // Perform actions on the page
            log.info("Test Case 02: Performing actions on the page");
            // Add your test logic here

            Thread.sleep(3000); // Simulate some wait time for actions to complete

            log.info("Test Case 02: Test completed successfully");
        } catch (Exception e) {
            log.error("Test failed: {}", e.getMessage());
            throw e;
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver
        if (driver != null) {
            log.info("Test Case 02: Closing WebDriver");
            driver.quit();
        }
    }
}
