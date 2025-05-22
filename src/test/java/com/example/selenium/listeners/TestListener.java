package com.example.selenium.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("\n[TEST STARTING] " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("[TEST PASSED] " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("[TEST FAILED] " + result.getName());
        System.out.println("Failure details: " + result.getThrowable());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("\n=== Test Execution Starting ===\n");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("\n=== Test Execution Finished ===\n");
    }
}
