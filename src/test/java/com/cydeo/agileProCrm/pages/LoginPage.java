package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.Pageable;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //////////WebElements///////////////////////////////////////////////////////////

    @FindBy(name = "USER_LOGIN")
    public WebElement inputUsername;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(name = "USER_REMEMBER")
    public WebElement userRememberInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPassLink;

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement errorMessage;

    //////////LoginMethods/////////////////////////////////////////////////////////

    public void loginHR() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("username.hr"));
        BrowserUtils.sleep(1);
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.waitForClickablility(loginBtn,10).click();
        BrowserUtils.waitForPageToLoad(10);
    }

    public void loginHelpDesk() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("username.helpdesk"));
        BrowserUtils.sleep(1);
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.waitForClickablility(loginBtn,10).click();
        BrowserUtils.waitForPageToLoad(10);
    }

    public void loginMarketing() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("username.marketing"));
        BrowserUtils.sleep(1);
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.waitForClickablility(loginBtn,10).click();
        BrowserUtils.waitForPageToLoad(10);
    }

    public void login(String username, String password) {
        inputUsername.sendKeys(username);
        BrowserUtils.sleep(1);
        inputPassword.sendKeys(password);
        BrowserUtils.waitForClickablility(loginBtn,10).click();
        BrowserUtils.waitForPageToLoad(10);
    }
    ////////////


}
