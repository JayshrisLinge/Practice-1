package TestData;

import GenericCode.WebDrivers;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotUtility extends WebDrivers {

    WebDriver driver;

    public String takeScreenShot(String testCaseName) throws IOException {
        TakesScreenshot tSS = (TakesScreenshot)driver;
        File source = tSS.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir") + "//reports" + testCaseName + ".png");
        FileUtils.copyFile(source, dest);
        return System.getProperty("user.dir") + "//reports" + testCaseName + ".png";
    }
}

