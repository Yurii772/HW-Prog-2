import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class orderTest {
    private BlousePage blousePage;


    @Before
    public void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        this.blousePage = new BlousePage(driver);
    }

    @Test
    public void orderBlouse () {
        blousePage.openBlousePage();
    }

    @After
    public void quit() {
        blousePage.closeDriver();
    }
}
