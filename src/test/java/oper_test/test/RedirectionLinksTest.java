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

    @Test
    @Description("Тест перехода по гиперссылке dzen.ru")
    public void switchDzenLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToDzen();

        Assert.assertEquals( "https://dzen.ru/goblin_oper",driver.getCurrentUrl().substring(0,27));
    }

    @Test
    @Description("Тест перехода по гиперссылке podcasts.apple.com")
    public void switchAppleLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToApple();

        Assert.assertEquals( "https://podcasts.apple.com/ru/podcast/tynu40k-goblina/id388149583",driver.getCurrentUrl());
    }

    @Test
    @Description("Тест перехода по гиперссылке wink.ru")
    public void switchWinkLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToWink();

        Assert.assertEquals( "https://wink.ru/collections/218",driver.getCurrentUrl());
    }

    @Test
    @Description("Тест перехода по гиперссылке pc.st")
    public void switchAudioversionLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToAudioverison();

        Assert.assertEquals( "https://pc.st/979533018",driver.getCurrentUrl());
    }

    @Test
    @Description("Тест перехода по гиперссылке sponsr.ru")
    public void switchSponsrLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToSponsr();

        Assert.assertEquals( "https://sponsr.ru/goblin/",driver.getCurrentUrl());
    }

    @Test
    @Description("Тест перехода по гиперссылке opershop.ru в хедере")
    public void switchOpershopHeaderLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToOpershopHeader();

        Assert.assertEquals( "https://opershop.ru",driver.getCurrentUrl().substring(0,19));
    }

    @Test
    @Description("Тест перехода по гиперссылке opershop.ru на левой панели")
    public void switchOpershopLeftbarLink() throws InterruptedException {
        new MainPage(driver)
                .openPage()
                .goToOpershopLeftBar();

        Assert.assertEquals( "https://opershop.ru",driver.getCurrentUrl().substring(0,19));
    }








}

