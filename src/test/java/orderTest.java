import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

import static java.lang.Integer.parseInt;

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
        blousePage
                .openBlousePage()
                .listView()
                .addToCard()
                .proceedCheckout()
                .plussOne()
                .pause();
//        String totalProduct = blousePage.getTotalProduct();
//        String totalProducts = blousePage.getTotalProducts();
//        String totalShipping = blousePage.getTotalShipping();
//        String tax = blousePage.getTax();
        String totalOrderAmount = blousePage.getTotalOrderAmount();
        System.out.println(totalOrderAmount);
    }


//    @After
//    public void quit() {
//        blousePage.closeDriver();
//    }
}
