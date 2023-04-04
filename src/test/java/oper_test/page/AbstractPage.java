package oper_test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractPage {
    protected WebDriver driver;

    protected abstract AbstractPage openPage();


    @FindBy(xpath = "//input[@placeholder='поиск по сайту']")
    protected WebElement searchInput;

    @FindBy(xpath = "//input[@type='submit']")
    protected WebElement searchButton;

    @FindBy(xpath = "//a[img[@title='Telegram']]")
    protected WebElement telegramButton;

    @FindBy(xpath = "//a[img[@title='Sponsr']]")
    protected WebElement sponsrButton;

    @FindBy(xpath = "//a[img[@title='ВКонтакте']]")
    protected WebElement vkontakteButton;

    @FindBy(xpath = "//a[img[@title='Rutube']]")
    protected WebElement rutubeButton;

    @FindBy(xpath = "//a[img[@title='Дзен']]")
    protected WebElement dzenButton;

    @FindBy(xpath = "//a[img[@title='Apple']]")
    protected WebElement appleButton;

    @FindBy(xpath = "//a[img[@title='Wink']]")
    protected WebElement winkButton;

    @FindBy(xpath = "//a[img[@title='Аудиоверсии']]")
    protected WebElement audioversionButton;

    @FindBy(xpath = "//li[a[text()='Магазин']]/a")
    protected WebElement opershopHeaderButton;

    @FindBy(xpath = "//h3[a[text()='Магазин']]/a")
    protected WebElement opershopLeftbarButton;

    @FindBy(xpath = "//li[a[text()='Переводы']]/a")
    protected WebElement translationsHeaderButton;

    @FindBy(xpath = "//li[a[text()='Видео']]/a")
    protected WebElement videoHeaderButton;

    @FindBy(xpath = "//li[a[text()='Картинки']]/a")
    protected WebElement picturesHeaderButton;

    @FindBy(xpath = "//li[a[text()=' Новости']]/a")
    protected WebElement newsHeaderButton;

    protected AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}
