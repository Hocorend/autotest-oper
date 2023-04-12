package oper_test.test;

import jdk.jfr.Description;
import oper_test.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TranslationSectionTest extends CommonConditions{

    @Test
    @Description("Проверка перехода в раздел переводов Полный Пэ")
    public void openTranslationPolniyPE(){
        new MainPage(driver)
                .openPage()
                .openTranslationPage()
                .openTranslationPolniyPe();

        Assert.assertEquals("https://oper.ru/trans/?pp",driver.getCurrentUrl());
    }

    @Test
    @Description("Проверка перехода в раздел переводов Божья Искра")
    public void openTranslationBojiyaIskra(){
        new MainPage(driver)
                .openPage()
                .openTranslationPage()
                .openTranslationBojiyaIskra();

        Assert.assertEquals("https://oper.ru/trans/?bi",driver.getCurrentUrl());
    }
}
