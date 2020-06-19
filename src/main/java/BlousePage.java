import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlousePage {
    private final static String BLOUSE_PAGE_URL = "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=Blouse&submit_search=";
    private WebDriver driver;

    @FindBy(className = "icon-th-list")
    private WebElement listViewButton;

    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addCartButton;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[@id=\"cart_quantity_up_2_7_0_0\"]/span")
    private WebElement plusOneButton;

    @FindBy(xpath = "//*[@id=\"product_2_7_0_0\"]/td[5]/input[2]")
    private WebElement qtyField;

    @FindBy(xpath = "//*[@id=\"total_product\"]")
    private WebElement totalProductField;

    @FindBy(xpath = "//*[@id=\"total_shipping\"]")
    private WebElement totalShipping;

    @FindBy(xpath = "//*[@id=\"total_tax\"]")
    private WebElement totalTax;

    @FindBy(xpath = "//*[@id=\"total_price\"]")
    private WebElement totalPrice;

    public BlousePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BlousePage openBlousePage() {
        this.driver.navigate().to(BLOUSE_PAGE_URL);
        return this;
    }

    public void closeDriver() {
        driver.quit();
    }
}
