package oper_test.page;

import oper_test.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import static oper_test.util.WindowSwitcherUtil.switchWindow;

public class MainPage extends AbstractPage{
    private static final String HOMEPAGE_URL = "https://oper.ru";
    private final Logger logger = LogManager.getRootLogger();
    @Override
    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        logger.info("Open page: "+HOMEPAGE_URL);
        return this;
    }

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public MainPage searchByCondition(String condition){
        searchInput.sendKeys(condition);
        logger.info("Entering the conditions '"+condition+"' in the search input");
        searchButton.submit();
        logger.info("The search button is pressed");
        return this;
    }

    public List<WebElement> getSearchResult(String condition){
        List<WebElement> searchResults = driver.findElements(By.xpath("//*[text()[contains(.,'"+condition+"')]]/../a[2]"));

        return searchResults;
    }

    public MainPage openNumberSearchResult(int number, String searchString){
        getSearchResult(searchString).get(number).click();

        return this;
    }

    public MainPage sendTheComment(User user,String comment){
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys(user.getLogin());
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(user.getPassword());
        driver.findElement(By.xpath("//textarea[@name='body']")).sendKeys(comment);

        driver.findElement(By.xpath("//input[@value='Отправить']")).submit();

        return this;
    }

    public String getResultCommentWrongUser(){
        return driver.findElement(By.xpath("//font[text()='Неверное имя или пароль']")).getText();
    }

    public TranslationPage openTranslationPage(){
        translationsHeaderButton.click();
        return new TranslationPage(driver);
    }

    public void goToTelegram(){
        telegramButton.click();
        logger.info("Transition to the telegram website");
        switchWindow(driver);
    }

    public void goToVkontakte(){
        vkontakteButton.click();
        logger.info("Transition to the vkontakte website");
        switchWindow(driver);
    }

    public void goToRutube(){
        rutubeButton.click();
        logger.info("Transition to the rutube website");
        switchWindow(driver);
    }

    public void goToDzen(){
        dzenButton.click();
        logger.info("Transition to the dzen website");
        switchWindow(driver);
    }

    public void goToApple(){
        appleButton.click();
        logger.info("Transition to the Apple website");
        switchWindow(driver);
    }

    public void goToWink(){
        winkButton.click();
        logger.info("Transition to the Wink website");
        switchWindow(driver);
    }

    public void goToAudioverison(){
        audioversionButton.click();
        logger.info("Transition to the pc.st website");
        switchWindow(driver);
    }

    public void goToSponsr(){
        sponsrButton.click();
        logger.info("Transition to the Sponsr website");
        switchWindow(driver);
    }

    public void goToOpershopHeader(){
        opershopHeaderButton.click();
        logger.info("Transition to the Opershop website");
        switchWindow(driver);
    }

    public void goToOpershopLeftBar(){
        opershopLeftbarButton.click();
        logger.info("Transition to the Opershop website");
        switchWindow(driver);
    }

    public void goToTranslationsHeader(){
        translationsHeaderButton.click();
        logger.info("Opens ./trans/");
        switchWindow(driver);
    }

    public void goToVideoHeader(){
        videoHeaderButton.click();
        logger.info("Opens ./video/");
        switchWindow(driver);
    }

    public void goToPicturesHeader(){
        picturesHeaderButton.click();
        logger.info("Opens ./gallery/");
        switchWindow(driver);
    }

    public void goToNews(){
        newsHeaderButton.click();
        logger.info("Opens main page");
        switchWindow(driver);
    }





}
