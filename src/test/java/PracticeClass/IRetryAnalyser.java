package PracticeClass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyser implements IRetryAnalyzer {
       int retryCount=0;
       int maxRetryCount=2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount<maxRetryCount) {
            retryCount++;
            return true;        //Retry test
        }
        else
            {
                return false;      //don't retry the test
            }
        }
}
