import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//search for blouse

public class MainPageTest {

    private MainPage mainPage;

    @Before
    public void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        this.mainPage = new MainPage(driver);
    }

    @Test
    public void navigateOver() {
                mainPage.openMainPage()
                        .inputBlouse()
                        .searchBlouse();
    }

    @After
    public void quit() {
        mainPage.closeDriver();
    }
}
