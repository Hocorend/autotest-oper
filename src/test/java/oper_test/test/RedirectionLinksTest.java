package oper_test.test;

import jdk.jfr.Description;
import oper_test.driver.DriverSingelton;
import oper_test.page.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectionLinksTest {

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

