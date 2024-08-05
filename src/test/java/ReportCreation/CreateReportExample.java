package ReportCreation;

import GenericCode.WebDrivers;
import PracticeClass.IRetryAnalyser;
import TestData.ReportClasses;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateReportExample extends WebDrivers {
    ExtentReports extent = ReportClasses.extentReportMethod();
    WebDriver driver;
    @BeforeTest
    public void invokeDriver(){
         driver= chromeInvoke();
    }

    @Test(retryAnalyzer= IRetryAnalyser.class)
    public String testMethod() {
        ExtentTest extentReports = extent.createTest("Test Case:1");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\000QTT744\\Eclipse prog\\my_maven_project\src\\main\resources\\chromedriver.exe");
        driver.get("https://rahulshettyacademy.com/AutomatiPractice/");
        //correct Link:https://rahulshettyacademy.com/client/auth/login
       String name= driver.getTitle();
       Assert.assertEquals(name,"Practice");
       return name;
        //extentReports.fail("I want to fail the Test case 1"); if want to fail
    }
    @Test
    public void flipKartLogin() {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\000QTT744\\Eclipse prog\\my_maven_project\src\\main\resources\\chromedriver.exe");
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        //extentReports.fail("I want to fail the Test case 1"); if want to fail
    }


//    @Test
//    public void oMEntry() {
//        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.body.style.transform='scale(0.5)'");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://ordermax-htsmajor2-om-sft.apps.ocp-uat-dor.bell.corp.bce.ca/OrderMax/sanity123.jsp");
//        driver.findElement(By.id("userid")).sendKeys("EQ07517");
//        driver.findElement(By.xpath("//input[@type='button']")).click();
//        switchToTab(driver);
//        driver.findElement(By.id("primNavAccountChangeExisting")).click();
//        driver.findElement(By.xpath("//input[@name='changeMobilityTelelphoneNumber']")).sendKeys("4169889015");
//        driver.findElement(By.id("changeSubmit")).click();
//        extent.flush();
//    }
//
//    public static void switchToTab(WebDriver driver) {
//        String currentHandle = driver.getWindowHandle();
//        Set<String> handles = driver.getWindowHandles();
//        for (String actual : handles) {
//            if (!actual.equalsIgnoreCase(currentHandle)) {
//                driver.switchTo().window(actual);
//            }
//        }
//    }
}