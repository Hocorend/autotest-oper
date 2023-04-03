package oper_test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractPage {
    protected WebDriver driver;

    protected abstract AbstractPage openPage();
    protected final int WAIT_TIMEOUT_SECONDS = 10;

    @FindBy(xpath = "//input[@placeholder='поиск по сайту']")
    protected WebElement searchInput;

    @FindBy(xpath = "//input[@type='submit']")
    protected WebElement searchButton;


    protected AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}
