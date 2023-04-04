package oper_test.test;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class SiteAccessTest {

    @Test
    @Description("Проверка на доступность сайта")
    public void requestSiteAvailability() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL("https://oper.ru").openConnection();

        Assert.assertEquals(200,connection.getResponseCode());
    }
}
