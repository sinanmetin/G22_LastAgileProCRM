package com.cydeo.agileProCrm.pages.quickMenu;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appreciate_Page {

    public Appreciate_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreBtn;

    @FindBy(xpath= "//span[.='Appreciation']")
    public WebElement appreciationBtn;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement m;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement n;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement reBtn;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement tn;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement mortn;





}
