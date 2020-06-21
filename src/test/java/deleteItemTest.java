import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class deleteItemTest {
    private BlousePage blousePage;


    @Before
    public void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        this.blousePage = new BlousePage(driver);
        blousePage
                .openBlousePage()
                .listView()
                .addToCard()
                .proceedCheckout()
                .deleteItem();
    }

    @Test
    public void checkOrderEmpty() {
        String btnText = blousePage.getBottomBarText();
        String expectedBtnText = "Your shopping cart is empty.";
        Assert.assertEquals(expectedBtnText, btnText);
    }
}
