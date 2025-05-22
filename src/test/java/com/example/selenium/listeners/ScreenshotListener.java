package com.example.selenium.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {
    // Implement the methods from ITestListener interface
    // For example, you can override onTestFailure to take a screenshot
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed with flying colours: " + result.getName());
    }
    // You can add more methods to handle other test events if needed
}
