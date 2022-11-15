package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class PollPage {



    public PollPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(  xpath = "//span[.='Poll' ]/span")
    public WebElement poll;

    @FindBy(id= "feed-add-post-destination-input")
    public WebElement toAddMoreLink;

    @FindBy(id= "destDepartmentTab_destination6268285")
    public WebElement hr101;

    @FindBy(xpath = "//a[@href='switchTab' and @class='bx-finder-box-tab bx-lm-tab-department']")
    public  WebElement EmpandDeptOption;



}
