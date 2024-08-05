package TestData;

import org.testng.ITestListener;
import org.testng.ITestResult;

public interface TestNGListener1 extends ITestListener {
    void onStart(ITestResult result);
}
