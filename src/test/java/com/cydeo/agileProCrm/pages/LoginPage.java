package com.cydeo.agileProCrm.pages;

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
        inputPassword.sendKeys(ConfigurationReader.getProperty("password")+Keys.ENTER);
    }

    public void loginHelpDesk() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("username.helpdesk"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password")+Keys.ENTER);
    }

    public void loginMarketing() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("username.marketing"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password")+Keys.ENTER);
    }

    public void login(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password+Keys.ENTER);
    }
    ////////////


}
