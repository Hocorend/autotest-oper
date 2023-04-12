package oper_test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TranslationPage extends AbstractPage{
    @Override
    protected AbstractPage openPage() {
        return null;
    }

    protected TranslationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    @FindBy(xpath = "//b[text()='\"Полный Пэ\"']")
    protected WebElement translationPolniyPe;

    @FindBy(xpath = "//b[text()='\"Божья Искра\"']")
    protected WebElement translationBojiyaIskra;

    public TranslationPage openTranslationPolniyPe(){
        translationPolniyPe.click();
        return this;
    }

    public TranslationPage openTranslationBojiyaIskra(){
        translationBojiyaIskra.click();
        return this;
    }
}
