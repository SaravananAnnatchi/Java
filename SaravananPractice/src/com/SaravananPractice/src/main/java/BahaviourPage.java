import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BahaviourPage {

    WebDriver driver;

    @FindBy(name = "articleNumbers")
    WebElement article;

    @FindBy(name = "term")
    WebElement search;

    @FindBy(name = "locale")
    WebElement country;

    @FindBy(xpath = "//div[='col-md-12']//button[text()='collectClick']")
    WebElement click;

    @FindBy(xpath = "//div[='col-md-12']//button[text()='collectBuyData']")
    WebElement buy;

    @FindBy(xpath = "//div[='col-md-12']//button[text()='endSession']")
    WebElement end;

    String url = "https://systst15-www.hm.com/hmbackoffice/view/esalesCustomerService";

    public BahaviourPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }


}
