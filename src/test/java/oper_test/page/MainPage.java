package oper_test.page;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
}
