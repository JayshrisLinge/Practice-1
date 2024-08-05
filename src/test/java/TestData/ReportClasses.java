package TestData;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;

public class ReportClasses {

    @BeforeTest
    public static ExtentReports extentReportMethod() {
        //ExtentReport[main class] and extentSparkReport class object
        String path = System.getProperty("user.dir") + "\\reports\\index.html";    //to save the report
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Testing Status : 13-Jun-2024");
        reporter.config().setDocumentTitle("Summary of report");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "JayDatt");
        return extent;
    }
}


