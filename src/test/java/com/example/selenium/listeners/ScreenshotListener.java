package com.example.selenium.listeners;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.example.selenium.DriverManager;
import com.example.selenium.utilities.ScreenshotUtil;

public class ScreenshotListener implements ITestListener {
    private static final Logger log = LoggerFactory.getLogger(ScreenshotListener.class);
    private static WebDriver driver;

    @Override
    public void onStart(ITestContext context) {
        driver = DriverManager.getDriver();   
        log.info("ScreenshotListener grabbed driver instance");
    }
    
    @Override
    public void onTestFailure(ITestResult result) {
        log.info("Taking screenshot for failed test: {}", result.getName());
        try {
            driver = DriverManager.getDriver();
            ScreenshotUtil screenshotUtil = new ScreenshotUtil();
            screenshotUtil.takeScreenshot(driver, result.getName(), "failure");
        } catch (Exception e) {
            log.error("Failed to capture screenshot for test: {}", result.getName(), e);
        }
    }
    
    @Override public void onTestStart(ITestResult result) {

    }

    @Override public void onTestSuccess(ITestResult result) {

    }

    @Override public void onTestSkipped(ITestResult result) {

    }
    
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override public void onFinish(ITestContext context) {

    }
}
