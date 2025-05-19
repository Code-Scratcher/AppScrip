package org.example;

import java.io.File;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenshotUtil {
    private WebDriver driver;

    public ScreenshotUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot() {
        try {
            File scrDir = new File("/screenshots");
            if (!scrDir.exists()) {
                scrDir.mkdirs();
            }
            String timeStamp = String.valueOf(java.time.LocalDateTime.now());
            String fileName = "screenshot_At_" + timeStamp + ".png";

            TakesScreenshot screenshot = ((TakesScreenshot) driver);
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File(scrDir, fileName);
            Files.copy(srcFile, destFile);

            System.out.println("Screenshot taken: " + destFile.getAbsolutePath());

        } catch (Exception e) {
            // TODO: handle exception
        }
    }   
}
