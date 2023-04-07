package oper_test.test;

import jdk.jfr.Description;
import oper_test.page.MainPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SiteSearchTest extends CommonConditions{

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
