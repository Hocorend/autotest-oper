package oper_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    public void goToTelegram() throws InterruptedException {
        telegramButton.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void goToVkontakte(){
        vkontakteButton.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void goToRutube(){
        rutubeButton.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
