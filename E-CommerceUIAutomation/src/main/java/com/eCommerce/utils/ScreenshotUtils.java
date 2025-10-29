package com.eCommerce.utils;

import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtils {

    public static void captureScreenshot(WebDriver driver, String scenarioName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String destPath = System.getProperty("user.dir") + "/screenshots/" + scenarioName + "_" + timestamp + ".png";

        try {
            FileUtils.copyFile(source, new File(destPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static byte[] takeScreenshotAsBytes(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
