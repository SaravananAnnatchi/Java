package stepDefinationFiles;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hm.com.Page.HomePage;
import hm.com.Page.loginPage;
import hm.com.webdriver.webDriverProvider;
import org.junit.Assert;


public class loginStepDefination extends webDriverProvider {

    loginPage loginpage;

   public loginStepDefination() {
      super();
   }

   @Before
   public void initializeDriver(){
       getLocalWebDriver();
       loginpage = new loginPage();
   }

    @Given("^I am on the website$")
    public void verifyHomePageTitle(){
        String title = loginpage.getPageTitle();
        Assert.assertEquals(title , "H&M - Mode und Qualität zum besten Preis | H&M DE");
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink(){
       loginpage.clickonLoginButton();
    }

    @Then("^Enter credentials and click on Login button$")
    public void enterCredentialsAndClickOnLoginButton() {
        loginpage.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
    }

}
