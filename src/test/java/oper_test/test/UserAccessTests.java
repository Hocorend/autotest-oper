package oper_test.test;

import oper_test.driver.DriverSingelton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UserAccessTests {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        driver = DriverSingelton.getDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void browserClosed(){
        DriverSingelton.closeDriver();
    }


}
