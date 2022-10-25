package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy (id = "logo_24_text")
    public WebElement crmHomeLogo;

    @FindBy(id = "sitemap-menu")
    public WebElement siteMapMenu;

    @FindBy (css = "li#bx_left_menu_menu_tasks")
    public WebElement taskMenu;

    @FindBy(id="user-block")
    public WebElement userBlock;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logout;

    @FindBy(xpath = "//span[.='Message']/span")
    public WebElement message;


   /* @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ; */









}
