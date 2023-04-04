package oper_test.test;

import jdk.jfr.Description;
import oper_test.driver.DriverSingelton;
import oper_test.page.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    @Description("Проверка на поиск по сайту с пустой строкой ввода")
    public void enterEmptyQuery(){

        new MainPage(driver)
                .openPage()
                .searchByCondition("");

        Assert.assertEquals(0,driver.findElements(By.xpath("//div[*[text()='Поиск по сайту']]")).size());
    }

    @Test
    @Description("Проверка на работоспособность поисковой строки")
    public void getCountSearchResults(){

        List searchResult = new MainPage(driver)
                .openPage()
                .searchByCondition("Сопрано S01E10")
                .getSearchResult();

        Assert.assertTrue(searchResult.size()>0);
    }







}
