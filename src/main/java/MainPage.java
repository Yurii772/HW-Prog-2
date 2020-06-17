import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    private static final String MAIN_PAGE_URL="http://automationpractice.com/";
    private WebDriver driver;

    private By backToMain = By.xpath("//*[@id=\"header_logo\"]/a/img");
    private By tshirtsTab = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    private By sizeLcheckbox = By.id("layered_id_attribute_group_3");
    private By salesBanner = By.xpath("//*[@id=\"header\"]/div[1]");
    private By womenSection = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a");
    private By dressesSection = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private By threeDaysSalesBanner = By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img");
    private By summerSaleBanner = By.className("htmlcontent-item-2 col-xs-4");
    private By bestSellers = By.cssSelector("#home-page-tabs > li.active > a");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openMainPage() {
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }


    public MainPage TshirtTab() {
        this.driver.findElement(tshirtsTab).click();
        return this;
    }

    public MainPage backToMainPage () {
        this.driver.findElement(backToMain).click();
        return this;
    }

    public MainPage salesBanner () {
        this.driver.findElement(salesBanner).click();
        return this;
    }
}
