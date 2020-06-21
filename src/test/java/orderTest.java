import org.junit.*;
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
            blousePage
                    .openBlousePage()
                    .listView()
                    .addToCard()
                    .proceedCheckout()
                    .plussOne();
    }

    @Test
    public void checkTotalProduct() {
        String totalProduct = blousePage.getTotalProduct();
        String expectedTotalProduct = "$54.00";
        Assert.assertEquals(expectedTotalProduct, totalProduct);
    }

    @Test
    public void TotalProducts() {
        String totalProducts = blousePage.getTotalProducts();
        String expectedTotalProducts = "$54.00";
        Assert.assertEquals(expectedTotalProducts, totalProducts);
    }

    @Test
    public void checkTotalShipping() {
        String totalShipping = blousePage.getTotalShipping();
        String expectedTotalShipping = "$2.00";
        Assert.assertEquals(expectedTotalShipping, totalShipping);
    }

    @Test
    public void checkTax() {
        String tax = blousePage.getTax();
        String expectedTax = "$0.00";
        Assert.assertEquals(expectedTax, tax);
    }

    @Test
    public void chackTotalOrderAmount() {
        String totalOrderAmount = blousePage.getTotalOrderAmount();
        String expectedTotalOrderAmount = "$59.00";
        Assert.assertEquals(expectedTotalOrderAmount, totalOrderAmount);
    }


    @After
    public void quit() {
        blousePage.closeDriver();
    }
}
