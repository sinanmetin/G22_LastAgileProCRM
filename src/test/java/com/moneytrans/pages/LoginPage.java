package com.moneytrans.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id="wt-cli-accept-btn")
    public WebElement acceptBtn;

    @FindBy(xpath = "(//span[.='REGISTER'])[1]")
    public WebElement registerBtn;









}
