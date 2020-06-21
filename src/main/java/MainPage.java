import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private final static String MAIN_PAGE_URL = "http://automationpractice.com/";
    private WebDriver driver;

    @FindBy(id = "search_query_top")
    private WebElement serchField;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchButton;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openMainPage() {
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }


    public MainPage inputBlouse() {
        serchField.sendKeys("Blouse");
        return this;
    }

    public MainPage searchBlouse() {
        searchButton.click();
        return this;
    }

    public void closeDriver() {
        driver.quit();
    }
}