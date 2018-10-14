package hm.com.Page;

import hm.com.webdriver.webDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class loginPage extends webDriverProvider {


    @FindBy(xpath = "//a[contains(@class,'loginGroup')]")
    WebElement loginLink;
    @FindBy(xpath = "//input[@id='input-login-username']")
    WebElement user;
    @FindBy(xpath = "//input[@id='input-login-password']")
    WebElement pass;
    @FindBy(xpath = "//button[@id='loginButton']")
    WebElement loginButton;

    public loginPage(){
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle(){
        if (!(driver.getTitle()).equals(null)){
            return driver.getTitle();
    }else{
            System.out.println("no title");
        }
        return ("no title");
    }

    public void clickonLoginButton(){
        loginLink.click();
    }
    public HomePage verifyLogin(String userName, String Password){
        user.sendKeys(userName);
        pass.sendKeys(Password);
        loginButton.click();
        return new HomePage();

    }

}

