package utils;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {
    @BeforeMethod
    public static void setUp(){
        System.setProperty("selenide.browserSize", "1366x657");
        open("https://ee.ge/");
    }

    @AfterMethod
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }

}
