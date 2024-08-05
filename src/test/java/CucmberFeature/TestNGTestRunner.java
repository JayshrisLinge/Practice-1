package CucmberFeature;

import freemarker.core.XHTMLOutputFormat;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/cucmberFeature",glue = "Cucumber.StepDefinitions",monochrome = true,tags =" @Regression_Cucumber", plugin ={"html:Target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
