package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CalenderPage {

    public CalenderPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@title='Calendar']")
    public WebElement calenderTab;

    @FindBy(xpath = "//button[@class='ui-btn-main']")
    public WebElement addButton;

    @FindBy(xpath = "//input[@name='date_from']")
    public WebElement inputStartDate;

    @FindBy(xpath = "//input[@name='date_to']")
    public WebElement inputEndDate;

    @FindBy(xpath = "//select[@name='EVENT_RRULE[FREQ]']")
    public WebElement repeatDropdown;


    public void selectCycle(String cycle){
        Select select = new Select(repeatDropdown);
        select.selectByValue(cycle);

    }

    @FindBy(xpath = "//input[@name='lo_cation']")
    public WebElement locations;

    @FindBy(xpath = "//div[.='Repeat']")
    public WebElement repeatSpace;

    @FindBy(xpath = "//span[contains(@id,'-slider-destination-link')]")
    public WebElement addMoreBttn;

    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepTab;

    @FindBy(xpath = "//a[@href='#U493']/div/div[@class='bx-finder-company-department-employee-name']")
    public WebElement employeeHelpDesk;

    //marketing3@cybertekschool.com
    @FindBy(xpath = "//a[@href='#U594']")
    public WebElement employeeMarketing;

    @FindBy(xpath = "//div[@class='calendar-additional-alt-more']")
    public WebElement moreBttn;

    @FindBy(xpath="//iframe[@class='bx-editor-iframe']")
    public WebElement frame;

    @FindBy(xpath="//body[@style='min-height: 104px;']")
    public WebElement bodyInFrame;



    @FindBy(xpath = "//li[@data-bx-calendar-color='#F87396']")
    public WebElement pinkColor;

     @FindBy(xpath = "//button[contains(@id,'_save')]")
    public WebElement saveButton;

     @FindBy(xpath = "//span[.='New Event']")
    public WebElement newEvent;

    //AC2
    @FindBy(xpath = "(//span[.='New Event'])[1]")
    public WebElement newEventTextAfterCreating;

    @FindBy(xpath = "//button[contains(@id,'_but_edit')]")
    public WebElement editButton;

    @FindBy(xpath = "//span[.='Other color']")
    public WebElement otherColor;

    @FindBy(xpath = "//span[.='Custom color']")
    public WebElement customColor;

    @FindBy(xpath = "//input[@class='main-color-picker-custom-input']")
    public WebElement inputColorCode;

    @FindBy(xpath = "//span[@class='main-color-picker-custom-button']")
    public WebElement tickAfterColorSelect;

    public  void editColor(String colorCode){
        otherColor.click();
        customColor.click();
        inputColorCode.sendKeys(colorCode);
        tickAfterColorSelect.click();
    }

    @FindBy(xpath = "//span[.='All event instances']")
    public WebElement popUpRecurring;

    @FindBy(xpath = "(//span[@style='background-color: #000080'])[1]")
    public WebElement colorAfterEdit;

    public String getColorCode(){
        String colorCode =colorAfterEdit.getAttribute("style");
        return colorCode;
    }







}
