package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

    public CompanyPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[.='Add News']")
    public WebElement addNewsBtn;

    @FindBy(xpath = "//span[.='Preview text']")
    public WebElement previewText;

    @FindBy(name = "PROP[3][]")
    public WebElement typeDropdown;

    @FindBy(className = "adm-calendar-icon")
    public WebElement calendarIcon;



}
