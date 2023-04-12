package oper_test.test;

import jdk.jfr.Description;
import oper_test.page.MainPage;
import oper_test.service.UserCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommentAccessTest extends CommonConditions{

    @Test
    @Description("Тест на проверку отправки комментария с пустым паролем от аккаунта")
    public void sendCommentWithEmptyPassword(){
        String result = new MainPage(driver)
                .openPage()
                .searchByCondition("Сопрано S01E10")
                .openNumberSearchResult(0,"Сопрано S01E10")
                .sendTheComment(UserCreator.createWithEmptyPassword(),"Comment123")
                .getResultCommentWrongUser();

        Assert.assertEquals("Неверное имя или пароль",result);
    }

    @Test
    @Description("Тест на проверку отправки комментария с пустым логином от аккаунта")
    public void sendCommentWithEmptyLogin() {
        String result = new MainPage(driver)
                .openPage()
                .searchByCondition("Сопрано S01E10")
                .openNumberSearchResult(0, "Сопрано S01E10")
                .sendTheComment(UserCreator.createWithEmptyUsername(), "Comment123")
                .getResultCommentWrongUser();

        Assert.assertEquals("Неверное имя или пароль", result);

    }

    @Test
    @Description("Тест на проверку отправки комментария с пустым логином и паролем от аккаунта")
    public void sendCommentWithEmptyUser() {
        String result = new MainPage(driver)
                .openPage()
                .searchByCondition("Сопрано S01E10")
                .openNumberSearchResult(0, "Сопрано S01E10")
                .sendTheComment(UserCreator.createEmptyUser(), "Comment123")
                .getResultCommentWrongUser();

        Assert.assertEquals("Неверное имя или пароль", result);
    }

    @Test
    @Description("Тест на проверку отправки комментария с неправильным логином от аккаунта")
    public void sendCommentWithWrongUsername() {
        String result = new MainPage(driver)
                .openPage()
                .searchByCondition("Сопрано S01E10")
                .openNumberSearchResult(0, "Сопрано S01E10")
                .sendTheComment(UserCreator.createWithWrongUsername(), "Comment123")
                .getResultCommentWrongUser();

        Assert.assertEquals("Неверное имя или пароль", result);
    }

    @Test
    @Description("Тест на проверку отправки комментария с неправильным паролем от аккаунта")
    public void sendCommentWithWrongPassword() {
        String result = new MainPage(driver)
                .openPage()
                .searchByCondition("Сопрано S01E10")
                .openNumberSearchResult(0, "Сопрано S01E10")
                .sendTheComment(UserCreator.createWithWrongPassword(), "Comment123")
                .getResultCommentWrongUser();

        Assert.assertEquals("Неверное имя или пароль", result);
    }
}
