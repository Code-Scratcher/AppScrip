package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    protected WebDriver driver;

    @FindBy(xpath = "//textarea[@class='gLFyf']")
    private WebElement searchBox;

    // Constructor to initialize elements with PageFactory
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // This initializes all @FindBy elements
    }

    public WebElement getSearchBoxWebElement() {
        return searchBox;
    }
}
