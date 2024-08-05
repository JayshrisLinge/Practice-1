package TestData;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestResult;

import java.io.IOException;

public class TestNGListener extends ScreenShotUtility implements TestNGListener1 {
   ExtentTest test;
    ExtentReports extent= ReportClasses.extentReportMethod();
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();    //Thread safe
    @Override
    public void onTestStart(ITestResult result) {
       test= extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        TestNGListener1.super.onTestSuccess(result);
        extentTest.get().log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        TestNGListener1.super.onTestFailure(result);
        test.fail(result.getThrowable());
        String filePath;
        try {
           filePath= takeScreenShot(result.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        extentTest.get().addScreenCaptureFromPath(filePath,result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        TestNGListener1.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        TestNGListener1.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        TestNGListener1.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        TestNGListener1.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
       extent.flush();
    }

    @Override
    public boolean isEnabled() {
        return TestNGListener1.super.isEnabled();
    }

    @Override
    public void onStart(ITestResult result) {

    }
}



