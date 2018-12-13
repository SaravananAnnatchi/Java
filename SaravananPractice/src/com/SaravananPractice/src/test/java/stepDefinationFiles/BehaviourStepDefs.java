package stepDefinationFiles;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BehaviourStepDefs {

    private String generateToken = "//button[@name='createToken']";
    private String sessionKey = "//input[@name='jti']";
    private String customerKey = "//input[@name='custRef']";
    private String clickonBehaviour = "//ul[@class='main-menu']//li[5]//a[1]";
    private String signTokenButton = "//button[@name='signToken']";

    private String article = "articleNumbers";
    private String Search = "term";
    private String Country = "locale";
    private String click = "//*[@id=\"content\"]/div/form/div/div/div/div[2]/div[2]/div/button[2]";
    private String buy = "//*[@id=\"content\"]/div/form/div/div/div/div[2]/div[2]/div/button[3]";
    private String end = "//*[@id=\"content\"]/div/form/div/div/div/div[2]/div[2]/div/button[1]";

    String url = "https://systst15-www.hm.com/hmbackoffice/view/tokenservice";

    public WebDriver driver;

    @Before
    public void initializeandSetup(){
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        String driverPath = ClassLoader.getSystemResource("drivers/chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver(desiredCapabilities);
        driver.manage().window().maximize();

    }

    @After
    public void quit(){
        driver.quit();
    }

    @When("^User enters (.*)$")
    public void userEntersProducts(String art) throws InterruptedException {
       driver.findElement(By.name("articleNumbers")).clear();
       driver.findElement(By.name("articleNumbers")).sendKeys(art);
    }


    @Given("^User on find current token$")
    public void userOnBehaviourTool() {
        driver.get(url);
    }

    @Then("^enters  (.*) and select (.*)$")
    public void entersSearchTermAndSelectCountry(String sear, String Count){
        driver.findElement(By.name(Search)).clear();
        driver.findElement(By.name(Search)).sendKeys(sear);
        driver.findElement(By.name(Country)).sendKeys(Count);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Then("^Click on customer behaviour buttons and enter (.*) and (.*)$")
    public void customerBehaviourButtons(String art,String sear) throws InterruptedException {
        for (int i = 0; i<2; i++){
            driver.findElement(By.xpath(click)).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath(buy)).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(end)).click();
            Thread.sleep(1000);
            driver.findElement(By.name("articleNumbers")).sendKeys(art);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.name(Search)).sendKeys(sear);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }
    @Then("^Click on addtocart button$")
    public void clickOnAddtocartButton() throws InterruptedException {
        driver.findElement(By.xpath(buy)).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Thread.sleep(5000);
    }

    @Then("^Click on addtoclick$")
    public void clickOnClickNotificationButton() throws InterruptedException {
        driver.findElement(By.xpath(click)).click();
        Thread.sleep(10000);
    }

    @And("^Click on EndSession$")
    public void clickOnEndSession() throws InterruptedException{
        driver.findElement(By.xpath(end)).click();
    }

    @When("^User click on Generate new token button$")
    public void userClickOnGenerateNewTokenButton(){
        driver.findElement(By.xpath(generateToken)).click();
    }

    @Then("^Enters new (.*) and (.*)$")
    public void entersNewSessionkeyAndCustomerkey(String session, String Cust) {
        driver.findElement(By.xpath(sessionKey)).clear();
        driver.findElement(By.xpath(sessionKey)).sendKeys(session);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath(customerKey)).clear();
        driver.findElement(By.xpath(customerKey)).sendKeys(Cust);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Then("^Click on behaviour tool$")
    public void clickOnBehaviourTool() throws Throwable {
        driver.findElement(By.xpath(clickonBehaviour)).click();
    }

    @Then("^click on sign token button$")
    public void clickOnSignTokenButton(){
        driver.findElement(By.xpath(signTokenButton)).click();
    }
}
