package oper_test.test;

import jdk.jfr.Description;
import oper_test.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectionLinksTest extends CommonConditions{

    @Test
    @Description("Тест перехода по гиперссылке t.me")
    public void switchTelegramLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToTelegram();

        Assert.assertEquals( "https://t.me/oper_goblin",driver.getCurrentUrl());
    }

    @Test
    @Description("Тест перехода по гиперссылке vk.com")
    public void switchVkontakteLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToVkontakte();

        Assert.assertEquals( "https://vk.com/goblin_oper_ru",driver.getCurrentUrl());
    }

    @Test
    @Description("Тест перехода по гиперссылке rutube.ru")
    public void switchRutubeLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToRutube();

        Assert.assertEquals( "https://rutube.ru/u/goblin/",driver.getCurrentUrl());
    }
}

