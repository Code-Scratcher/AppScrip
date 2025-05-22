package com.example.selenium.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {
    private static final Logger log = LoggerFactory.getLogger(ScreenshotListener.class);
    // Implement the methods from ITestListener interface
    // For example, you can override onTestFailure to take a screenshot
    @Override
    public void onTestFailure(ITestResult result) {
        log.error("Test failed: " + result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Test passed: " + result.getName());
    }
    // You can add more methods to handle other test events if needed
}
