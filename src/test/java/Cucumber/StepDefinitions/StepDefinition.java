package Cucumber.StepDefinitions;

import GenericCode.WebDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StepDefinition extends WebDrivers {
    WebDriver driver;
    @Given("Chrome should invoke")
    public void chrome_Should_Invoke() {
          driver=chromeInvoke();
    }

    @Given("^user provide valid (.+) and valid (.+)$")
    public void logged_In_UserName_Password(String userName, String passWord) {
        driver.get("https://rahulshettyacademy.com/client/");
        driver.findElement(By.id("userEmail")).sendKeys(userName);
        driver.findElement(By.id("userPassword")).sendKeys(passWord);
        driver.findElement(By.id("login")).click();
    }

    @When("^(.+) is displayed$")
    public void product_Is_Displayed(String productFromCucumber) {
            String productText=driver.findElement(By.xpath("//b[text()=\"ZARA COAT 3\"]")).getText();
            Assert.assertEquals(productFromCucumber,productText);
    }

    @Then("able to signout")
    public void able_To_Signout() {
        driver.findElement(By.cssSelector(".fa-sign-out"));
    }
}
