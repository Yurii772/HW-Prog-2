import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    private static final String MAIN_PAGE_URL = "http://automationpractice.com/";
    private static final String BLOUSE_PAGE_URL = "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=Blouse&submit_search=";
    private WebDriver driver;

    @FindBy(id = "search_query_top")
    private WebElement serchField;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchButton;

    @FindBy(className = "icon-th-list")
    private WebElement listViewButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
    private WebElement addToCardButton;

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

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openMainPage() {
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public MainPage inputBlouse () {
        serchField.sendKeys("Blouse");
        return this;
    }

    public MainPage searchBlouse () {
        searchButton.click();
        return this;
    }

    public void closeDriver () {
        driver.quit();
    }
}