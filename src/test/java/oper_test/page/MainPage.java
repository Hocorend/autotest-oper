package oper_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static oper_test.util.WindowSwitcherUtil.switchWindow;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class MainPage extends AbstractPage {
    private static final String HOMEPAGE_URL = "https://oper.ru";

    @Override
    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public MainPage searchByCondition(String condition){
        searchInput.sendKeys(condition);
        searchButton.submit();
        return this;
    }

    public List getSearchResult(){
        List<WebElement> searchResults = driver.findElements(By.xpath("//*[text()[contains(.,'"+searchInput.getText()+"')]]"));

        return searchResults;
    }

    public void goToTelegram(){
        telegramButton.click();
        switchWindow(driver);
    }

    public void goToVkontakte(){
        vkontakteButton.click();
        switchWindow(driver);
    }

    public void goToRutube(){
        rutubeButton.click();
        switchWindow(driver);
    }


}
