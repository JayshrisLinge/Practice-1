//package ReportCreation;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//public class CreateReportForStandalone {
//    ExtentReports extent;
//
//    @BeforeTest
//    public void extentReportMethod() {
//        //ExtentReport[main class] and extentSparkReport class object
//        String path = System.getProperty("user.dir") + "\\reports\\index.html";    //to save the report
//        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//        reporter.config().setReportName("Testing Status : 13-Jun-2024");
//        reporter.config().setDocumentTitle("Summary of report");
//
//        extent = new ExtentReports();
//        extent.attachReporter(reporter);
//        extent.setSystemInfo("Tester", "JayDatt");
//    }
//
//    @Test
//    public void testMethod() {
//        WebDriver driver = new ChromeDriver();
//        ExtentTest extentReports = extent.createTest("Test Case:1");
//        //System.setProperty("webdriver.chrome.driver","C:\\Users\000QTT744\\Eclipse prog\\my_maven_project\src\\main\resources\\chromedriver.exe");
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        System.out.println(driver.getTitle());
//        //extentReports.fail("I want to fail the Test case 1"); if want to fail
//        extent.flush();
//    }
//
//}