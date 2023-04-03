package oper_test.test;

import oper_test.driver.DriverSingelton;
import oper_test.page.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SiteSearchTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        driver = DriverSingelton.getDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void browserClosed(){
        DriverSingelton.closeDriver();
    }

    @Test
    public void enterEmptyQuery(){

        new MainPage(driver)
                .openPage()
                .searchByCondition("");

        Assert.assertEquals(0,driver.findElements(By.xpath("//div[*[text()='Поиск по сайту']]")).size());
    }
    
}
